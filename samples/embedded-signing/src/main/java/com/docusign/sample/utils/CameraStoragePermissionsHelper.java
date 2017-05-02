package com.docusign.sample.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;

/**
 * Permissions helper
 */

public class CameraStoragePermissionsHelper extends Fragment {

    public static final String TAG = CameraStoragePermissionCallback.class.getSimpleName();
    private static final int REQUEST_CAMERA_STORAGE_PERMISSIONS = 1;
    private static final int REQUEST_STORAGE_PERMISSIONS = 2;
    private CameraStoragePermissionCallback mCallback;

    public CameraStoragePermissionsHelper() {
        //empty public constructor
    }

    public static CameraStoragePermissionsHelper newInstance() {
        return new CameraStoragePermissionsHelper();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public static boolean hasSelfPermission(Activity activity, String[] permissions) {
        // Below Android M all permissions are granted at install time and are already available.
        if (!isMOrAbove()) {
            return true;
        }

        // Verify that all required permissions have been granted
        for (String permission : permissions) {
            if (activity.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }

        return true;
    }

    public static boolean verifyPermissions(int[] grantResults) {
        // Verify that each required permission has been granted, otherwise return false.
        for (int result : grantResults) {
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMOrAbove() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity instanceof CameraStoragePermissionCallback) {
            mCallback = (CameraStoragePermissionCallback) activity;
        } else {
            throw new IllegalArgumentException("Activity must implement CameraStorageCallback interface");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }

    public void checkStoragePermissions() {
        if (isMOrAbove()) {
            if (hasSelfPermission(getActivity(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE})) {
                mCallback.onStoragePermissionGranted();
            } else {
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_STORAGE_PERMISSIONS);
            }
        } else {
            mCallback.onStoragePermissionGranted();
        }
    }

    public void checkCameraStoragePermissions() {
        if (isMOrAbove()) {
            if (hasSelfPermission(getActivity(), new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE})) {
                mCallback.onCameraStoragePermissionGranted();
            } else {
                requestPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CAMERA_STORAGE_PERMISSIONS);
            }
        } else {
            mCallback.onCameraStoragePermissionGranted();
        }
    }

    /**
     * Callback received when a permissions request has been completed.
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {

        if (requestCode == REQUEST_CAMERA_STORAGE_PERMISSIONS) {
            if (verifyPermissions(grantResults)) {
                mCallback.onCameraStoragePermissionGranted();
            } else {
                mCallback.onPermissionDenied();
            }
        } else if (requestCode == REQUEST_STORAGE_PERMISSIONS) {
            if (verifyPermissions(grantResults)) {
                mCallback.onStoragePermissionGranted();
            } else {
                mCallback.onPermissionDenied();
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }


    public interface CameraStoragePermissionCallback {
        void onCameraStoragePermissionGranted();

        void onStoragePermissionGranted();

        void onPermissionDenied();
    }
}
