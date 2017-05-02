package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TabAccountSettings implements Serializable {

    @SerializedName("allowTabOrder")
    private String allowTabOrder = null;

    @SerializedName("allowTabOrderMetadata")
    private SettingsMetadata allowTabOrderMetadata = null;

    @SerializedName("approveDeclineTabsEnabled")
    private String approveDeclineTabsEnabled = null;

    @SerializedName("approveDeclineTabsMetadata")
    private SettingsMetadata approveDeclineTabsMetadata = null;

    @SerializedName("calculatedFieldsEnabled")
    private String calculatedFieldsEnabled = null;

    @SerializedName("calculatedFieldsMetadata")
    private SettingsMetadata calculatedFieldsMetadata = null;

    @SerializedName("checkboxTabsEnabled")
    private String checkboxTabsEnabled = null;

    @SerializedName("checkboxTabsMetadata")
    private SettingsMetadata checkboxTabsMetadata = null;

    @SerializedName("dataFieldRegexEnabled")
    private String dataFieldRegexEnabled = null;

    @SerializedName("dataFieldRegexMetadata")
    private SettingsMetadata dataFieldRegexMetadata = null;

    @SerializedName("dataFieldSizeEnabled")
    private String dataFieldSizeEnabled = null;

    @SerializedName("dataFieldSizeMetadata")
    private SettingsMetadata dataFieldSizeMetadata = null;

    @SerializedName("firstLastEmailTabsEnabled")
    private String firstLastEmailTabsEnabled = null;

    @SerializedName("firstLastEmailTabsMetadata")
    private SettingsMetadata firstLastEmailTabsMetadata = null;

    @SerializedName("listTabsEnabled")
    private String listTabsEnabled = null;

    @SerializedName("listTabsMetadata")
    private SettingsMetadata listTabsMetadata = null;

    @SerializedName("noteTabsEnabled")
    private String noteTabsEnabled = null;

    @SerializedName("noteTabsMetadata")
    private SettingsMetadata noteTabsMetadata = null;

    @SerializedName("radioTabsEnabled")
    private String radioTabsEnabled = null;

    @SerializedName("radioTabsMetadata")
    private SettingsMetadata radioTabsMetadata = null;

    @SerializedName("savingCustomTabsEnabled")
    private String savingCustomTabsEnabled = null;

    @SerializedName("savingCustomTabsMetadata")
    private SettingsMetadata savingCustomTabsMetadata = null;

    @SerializedName("senderToChangeTabAssignmentsEnabled")
    private String senderToChangeTabAssignmentsEnabled = null;

    @SerializedName("senderToChangeTabAssignmentsMetadata")
    private SettingsMetadata senderToChangeTabAssignmentsMetadata = null;

    @SerializedName("sharedCustomTabsEnabled")
    private String sharedCustomTabsEnabled = null;

    @SerializedName("sharedCustomTabsMetadata")
    private SettingsMetadata sharedCustomTabsMetadata = null;

    @SerializedName("tabDataLabelEnabled")
    private String tabDataLabelEnabled = null;

    @SerializedName("tabDataLabelMetadata")
    private SettingsMetadata tabDataLabelMetadata = null;

    @SerializedName("tabLocationEnabled")
    private String tabLocationEnabled = null;

    @SerializedName("tabLocationMetadata")
    private SettingsMetadata tabLocationMetadata = null;

    @SerializedName("tabLockingEnabled")
    private String tabLockingEnabled = null;

    @SerializedName("tabLockingMetadata")
    private SettingsMetadata tabLockingMetadata = null;

    @SerializedName("tabScaleEnabled")
    private String tabScaleEnabled = null;

    @SerializedName("tabScaleMetadata")
    private SettingsMetadata tabScaleMetadata = null;

    @SerializedName("tabTextFormattingEnabled")
    private String tabTextFormattingEnabled = null;

    @SerializedName("tabTextFormattingMetadata")
    private SettingsMetadata tabTextFormattingMetadata = null;

    @SerializedName("textTabsEnabled")
    private String textTabsEnabled = null;

    @SerializedName("textTabsMetadata")
    private SettingsMetadata textTabsMetadata = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowTabOrder() {
        return allowTabOrder;
    }

    public void setAllowTabOrder(String allowTabOrder) {
        this.allowTabOrder = allowTabOrder;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowTabOrderMetadata() {
        return allowTabOrderMetadata;
    }

    public void setAllowTabOrderMetadata(SettingsMetadata allowTabOrderMetadata) {
        this.allowTabOrderMetadata = allowTabOrderMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getApproveDeclineTabsEnabled() {
        return approveDeclineTabsEnabled;
    }

    public void setApproveDeclineTabsEnabled(String approveDeclineTabsEnabled) {
        this.approveDeclineTabsEnabled = approveDeclineTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getApproveDeclineTabsMetadata() {
        return approveDeclineTabsMetadata;
    }

    public void setApproveDeclineTabsMetadata(SettingsMetadata approveDeclineTabsMetadata) {
        this.approveDeclineTabsMetadata = approveDeclineTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCalculatedFieldsEnabled() {
        return calculatedFieldsEnabled;
    }

    public void setCalculatedFieldsEnabled(String calculatedFieldsEnabled) {
        this.calculatedFieldsEnabled = calculatedFieldsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCalculatedFieldsMetadata() {
        return calculatedFieldsMetadata;
    }

    public void setCalculatedFieldsMetadata(SettingsMetadata calculatedFieldsMetadata) {
        this.calculatedFieldsMetadata = calculatedFieldsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCheckboxTabsEnabled() {
        return checkboxTabsEnabled;
    }

    public void setCheckboxTabsEnabled(String checkboxTabsEnabled) {
        this.checkboxTabsEnabled = checkboxTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCheckboxTabsMetadata() {
        return checkboxTabsMetadata;
    }

    public void setCheckboxTabsMetadata(SettingsMetadata checkboxTabsMetadata) {
        this.checkboxTabsMetadata = checkboxTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDataFieldRegexEnabled() {
        return dataFieldRegexEnabled;
    }

    public void setDataFieldRegexEnabled(String dataFieldRegexEnabled) {
        this.dataFieldRegexEnabled = dataFieldRegexEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getDataFieldRegexMetadata() {
        return dataFieldRegexMetadata;
    }

    public void setDataFieldRegexMetadata(SettingsMetadata dataFieldRegexMetadata) {
        this.dataFieldRegexMetadata = dataFieldRegexMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDataFieldSizeEnabled() {
        return dataFieldSizeEnabled;
    }

    public void setDataFieldSizeEnabled(String dataFieldSizeEnabled) {
        this.dataFieldSizeEnabled = dataFieldSizeEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getDataFieldSizeMetadata() {
        return dataFieldSizeMetadata;
    }

    public void setDataFieldSizeMetadata(SettingsMetadata dataFieldSizeMetadata) {
        this.dataFieldSizeMetadata = dataFieldSizeMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFirstLastEmailTabsEnabled() {
        return firstLastEmailTabsEnabled;
    }

    public void setFirstLastEmailTabsEnabled(String firstLastEmailTabsEnabled) {
        this.firstLastEmailTabsEnabled = firstLastEmailTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getFirstLastEmailTabsMetadata() {
        return firstLastEmailTabsMetadata;
    }

    public void setFirstLastEmailTabsMetadata(SettingsMetadata firstLastEmailTabsMetadata) {
        this.firstLastEmailTabsMetadata = firstLastEmailTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getListTabsEnabled() {
        return listTabsEnabled;
    }

    public void setListTabsEnabled(String listTabsEnabled) {
        this.listTabsEnabled = listTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getListTabsMetadata() {
        return listTabsMetadata;
    }

    public void setListTabsMetadata(SettingsMetadata listTabsMetadata) {
        this.listTabsMetadata = listTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getNoteTabsEnabled() {
        return noteTabsEnabled;
    }

    public void setNoteTabsEnabled(String noteTabsEnabled) {
        this.noteTabsEnabled = noteTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getNoteTabsMetadata() {
        return noteTabsMetadata;
    }

    public void setNoteTabsMetadata(SettingsMetadata noteTabsMetadata) {
        this.noteTabsMetadata = noteTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRadioTabsEnabled() {
        return radioTabsEnabled;
    }

    public void setRadioTabsEnabled(String radioTabsEnabled) {
        this.radioTabsEnabled = radioTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getRadioTabsMetadata() {
        return radioTabsMetadata;
    }

    public void setRadioTabsMetadata(SettingsMetadata radioTabsMetadata) {
        this.radioTabsMetadata = radioTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSavingCustomTabsEnabled() {
        return savingCustomTabsEnabled;
    }

    public void setSavingCustomTabsEnabled(String savingCustomTabsEnabled) {
        this.savingCustomTabsEnabled = savingCustomTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getSavingCustomTabsMetadata() {
        return savingCustomTabsMetadata;
    }

    public void setSavingCustomTabsMetadata(SettingsMetadata savingCustomTabsMetadata) {
        this.savingCustomTabsMetadata = savingCustomTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderToChangeTabAssignmentsEnabled() {
        return senderToChangeTabAssignmentsEnabled;
    }

    public void setSenderToChangeTabAssignmentsEnabled(String senderToChangeTabAssignmentsEnabled) {
        this.senderToChangeTabAssignmentsEnabled = senderToChangeTabAssignmentsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getSenderToChangeTabAssignmentsMetadata() {
        return senderToChangeTabAssignmentsMetadata;
    }

    public void setSenderToChangeTabAssignmentsMetadata(SettingsMetadata senderToChangeTabAssignmentsMetadata) {
        this.senderToChangeTabAssignmentsMetadata = senderToChangeTabAssignmentsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSharedCustomTabsEnabled() {
        return sharedCustomTabsEnabled;
    }

    public void setSharedCustomTabsEnabled(String sharedCustomTabsEnabled) {
        this.sharedCustomTabsEnabled = sharedCustomTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getSharedCustomTabsMetadata() {
        return sharedCustomTabsMetadata;
    }

    public void setSharedCustomTabsMetadata(SettingsMetadata sharedCustomTabsMetadata) {
        this.sharedCustomTabsMetadata = sharedCustomTabsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabDataLabelEnabled() {
        return tabDataLabelEnabled;
    }

    public void setTabDataLabelEnabled(String tabDataLabelEnabled) {
        this.tabDataLabelEnabled = tabDataLabelEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getTabDataLabelMetadata() {
        return tabDataLabelMetadata;
    }

    public void setTabDataLabelMetadata(SettingsMetadata tabDataLabelMetadata) {
        this.tabDataLabelMetadata = tabDataLabelMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabLocationEnabled() {
        return tabLocationEnabled;
    }

    public void setTabLocationEnabled(String tabLocationEnabled) {
        this.tabLocationEnabled = tabLocationEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getTabLocationMetadata() {
        return tabLocationMetadata;
    }

    public void setTabLocationMetadata(SettingsMetadata tabLocationMetadata) {
        this.tabLocationMetadata = tabLocationMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabLockingEnabled() {
        return tabLockingEnabled;
    }

    public void setTabLockingEnabled(String tabLockingEnabled) {
        this.tabLockingEnabled = tabLockingEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getTabLockingMetadata() {
        return tabLockingMetadata;
    }

    public void setTabLockingMetadata(SettingsMetadata tabLockingMetadata) {
        this.tabLockingMetadata = tabLockingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabScaleEnabled() {
        return tabScaleEnabled;
    }

    public void setTabScaleEnabled(String tabScaleEnabled) {
        this.tabScaleEnabled = tabScaleEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getTabScaleMetadata() {
        return tabScaleMetadata;
    }

    public void setTabScaleMetadata(SettingsMetadata tabScaleMetadata) {
        this.tabScaleMetadata = tabScaleMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabTextFormattingEnabled() {
        return tabTextFormattingEnabled;
    }

    public void setTabTextFormattingEnabled(String tabTextFormattingEnabled) {
        this.tabTextFormattingEnabled = tabTextFormattingEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getTabTextFormattingMetadata() {
        return tabTextFormattingMetadata;
    }

    public void setTabTextFormattingMetadata(SettingsMetadata tabTextFormattingMetadata) {
        this.tabTextFormattingMetadata = tabTextFormattingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTextTabsEnabled() {
        return textTabsEnabled;
    }

    public void setTextTabsEnabled(String textTabsEnabled) {
        this.textTabsEnabled = textTabsEnabled;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getTextTabsMetadata() {
        return textTabsMetadata;
    }

    public void setTextTabsMetadata(SettingsMetadata textTabsMetadata) {
        this.textTabsMetadata = textTabsMetadata;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TabAccountSettings tabAccountSettings = (TabAccountSettings) o;
        return Objects.equals(allowTabOrder, tabAccountSettings.allowTabOrder) &&
                Objects.equals(allowTabOrderMetadata, tabAccountSettings.allowTabOrderMetadata) &&
                Objects.equals(approveDeclineTabsEnabled, tabAccountSettings.approveDeclineTabsEnabled) &&
                Objects.equals(approveDeclineTabsMetadata, tabAccountSettings.approveDeclineTabsMetadata) &&
                Objects.equals(calculatedFieldsEnabled, tabAccountSettings.calculatedFieldsEnabled) &&
                Objects.equals(calculatedFieldsMetadata, tabAccountSettings.calculatedFieldsMetadata) &&
                Objects.equals(checkboxTabsEnabled, tabAccountSettings.checkboxTabsEnabled) &&
                Objects.equals(checkboxTabsMetadata, tabAccountSettings.checkboxTabsMetadata) &&
                Objects.equals(dataFieldRegexEnabled, tabAccountSettings.dataFieldRegexEnabled) &&
                Objects.equals(dataFieldRegexMetadata, tabAccountSettings.dataFieldRegexMetadata) &&
                Objects.equals(dataFieldSizeEnabled, tabAccountSettings.dataFieldSizeEnabled) &&
                Objects.equals(dataFieldSizeMetadata, tabAccountSettings.dataFieldSizeMetadata) &&
                Objects.equals(firstLastEmailTabsEnabled, tabAccountSettings.firstLastEmailTabsEnabled) &&
                Objects.equals(firstLastEmailTabsMetadata, tabAccountSettings.firstLastEmailTabsMetadata) &&
                Objects.equals(listTabsEnabled, tabAccountSettings.listTabsEnabled) &&
                Objects.equals(listTabsMetadata, tabAccountSettings.listTabsMetadata) &&
                Objects.equals(noteTabsEnabled, tabAccountSettings.noteTabsEnabled) &&
                Objects.equals(noteTabsMetadata, tabAccountSettings.noteTabsMetadata) &&
                Objects.equals(radioTabsEnabled, tabAccountSettings.radioTabsEnabled) &&
                Objects.equals(radioTabsMetadata, tabAccountSettings.radioTabsMetadata) &&
                Objects.equals(savingCustomTabsEnabled, tabAccountSettings.savingCustomTabsEnabled) &&
                Objects.equals(savingCustomTabsMetadata, tabAccountSettings.savingCustomTabsMetadata) &&
                Objects.equals(senderToChangeTabAssignmentsEnabled, tabAccountSettings.senderToChangeTabAssignmentsEnabled) &&
                Objects.equals(senderToChangeTabAssignmentsMetadata, tabAccountSettings.senderToChangeTabAssignmentsMetadata) &&
                Objects.equals(sharedCustomTabsEnabled, tabAccountSettings.sharedCustomTabsEnabled) &&
                Objects.equals(sharedCustomTabsMetadata, tabAccountSettings.sharedCustomTabsMetadata) &&
                Objects.equals(tabDataLabelEnabled, tabAccountSettings.tabDataLabelEnabled) &&
                Objects.equals(tabDataLabelMetadata, tabAccountSettings.tabDataLabelMetadata) &&
                Objects.equals(tabLocationEnabled, tabAccountSettings.tabLocationEnabled) &&
                Objects.equals(tabLocationMetadata, tabAccountSettings.tabLocationMetadata) &&
                Objects.equals(tabLockingEnabled, tabAccountSettings.tabLockingEnabled) &&
                Objects.equals(tabLockingMetadata, tabAccountSettings.tabLockingMetadata) &&
                Objects.equals(tabScaleEnabled, tabAccountSettings.tabScaleEnabled) &&
                Objects.equals(tabScaleMetadata, tabAccountSettings.tabScaleMetadata) &&
                Objects.equals(tabTextFormattingEnabled, tabAccountSettings.tabTextFormattingEnabled) &&
                Objects.equals(tabTextFormattingMetadata, tabAccountSettings.tabTextFormattingMetadata) &&
                Objects.equals(textTabsEnabled, tabAccountSettings.textTabsEnabled) &&
                Objects.equals(textTabsMetadata, tabAccountSettings.textTabsMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowTabOrder, allowTabOrderMetadata, approveDeclineTabsEnabled, approveDeclineTabsMetadata, calculatedFieldsEnabled, calculatedFieldsMetadata, checkboxTabsEnabled, checkboxTabsMetadata, dataFieldRegexEnabled, dataFieldRegexMetadata, dataFieldSizeEnabled, dataFieldSizeMetadata, firstLastEmailTabsEnabled, firstLastEmailTabsMetadata, listTabsEnabled, listTabsMetadata, noteTabsEnabled, noteTabsMetadata, radioTabsEnabled, radioTabsMetadata, savingCustomTabsEnabled, savingCustomTabsMetadata, senderToChangeTabAssignmentsEnabled, senderToChangeTabAssignmentsMetadata, sharedCustomTabsEnabled, sharedCustomTabsMetadata, tabDataLabelEnabled, tabDataLabelMetadata, tabLocationEnabled, tabLocationMetadata, tabLockingEnabled, tabLockingMetadata, tabScaleEnabled, tabScaleMetadata, tabTextFormattingEnabled, tabTextFormattingMetadata, textTabsEnabled, textTabsMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TabAccountSettings {\n");

        sb.append("    allowTabOrder: ").append(toIndentedString(allowTabOrder)).append("\n");
        sb.append("    allowTabOrderMetadata: ").append(toIndentedString(allowTabOrderMetadata)).append("\n");
        sb.append("    approveDeclineTabsEnabled: ").append(toIndentedString(approveDeclineTabsEnabled)).append("\n");
        sb.append("    approveDeclineTabsMetadata: ").append(toIndentedString(approveDeclineTabsMetadata)).append("\n");
        sb.append("    calculatedFieldsEnabled: ").append(toIndentedString(calculatedFieldsEnabled)).append("\n");
        sb.append("    calculatedFieldsMetadata: ").append(toIndentedString(calculatedFieldsMetadata)).append("\n");
        sb.append("    checkboxTabsEnabled: ").append(toIndentedString(checkboxTabsEnabled)).append("\n");
        sb.append("    checkboxTabsMetadata: ").append(toIndentedString(checkboxTabsMetadata)).append("\n");
        sb.append("    dataFieldRegexEnabled: ").append(toIndentedString(dataFieldRegexEnabled)).append("\n");
        sb.append("    dataFieldRegexMetadata: ").append(toIndentedString(dataFieldRegexMetadata)).append("\n");
        sb.append("    dataFieldSizeEnabled: ").append(toIndentedString(dataFieldSizeEnabled)).append("\n");
        sb.append("    dataFieldSizeMetadata: ").append(toIndentedString(dataFieldSizeMetadata)).append("\n");
        sb.append("    firstLastEmailTabsEnabled: ").append(toIndentedString(firstLastEmailTabsEnabled)).append("\n");
        sb.append("    firstLastEmailTabsMetadata: ").append(toIndentedString(firstLastEmailTabsMetadata)).append("\n");
        sb.append("    listTabsEnabled: ").append(toIndentedString(listTabsEnabled)).append("\n");
        sb.append("    listTabsMetadata: ").append(toIndentedString(listTabsMetadata)).append("\n");
        sb.append("    noteTabsEnabled: ").append(toIndentedString(noteTabsEnabled)).append("\n");
        sb.append("    noteTabsMetadata: ").append(toIndentedString(noteTabsMetadata)).append("\n");
        sb.append("    radioTabsEnabled: ").append(toIndentedString(radioTabsEnabled)).append("\n");
        sb.append("    radioTabsMetadata: ").append(toIndentedString(radioTabsMetadata)).append("\n");
        sb.append("    savingCustomTabsEnabled: ").append(toIndentedString(savingCustomTabsEnabled)).append("\n");
        sb.append("    savingCustomTabsMetadata: ").append(toIndentedString(savingCustomTabsMetadata)).append("\n");
        sb.append("    senderToChangeTabAssignmentsEnabled: ").append(toIndentedString(senderToChangeTabAssignmentsEnabled)).append("\n");
        sb.append("    senderToChangeTabAssignmentsMetadata: ").append(toIndentedString(senderToChangeTabAssignmentsMetadata)).append("\n");
        sb.append("    sharedCustomTabsEnabled: ").append(toIndentedString(sharedCustomTabsEnabled)).append("\n");
        sb.append("    sharedCustomTabsMetadata: ").append(toIndentedString(sharedCustomTabsMetadata)).append("\n");
        sb.append("    tabDataLabelEnabled: ").append(toIndentedString(tabDataLabelEnabled)).append("\n");
        sb.append("    tabDataLabelMetadata: ").append(toIndentedString(tabDataLabelMetadata)).append("\n");
        sb.append("    tabLocationEnabled: ").append(toIndentedString(tabLocationEnabled)).append("\n");
        sb.append("    tabLocationMetadata: ").append(toIndentedString(tabLocationMetadata)).append("\n");
        sb.append("    tabLockingEnabled: ").append(toIndentedString(tabLockingEnabled)).append("\n");
        sb.append("    tabLockingMetadata: ").append(toIndentedString(tabLockingMetadata)).append("\n");
        sb.append("    tabScaleEnabled: ").append(toIndentedString(tabScaleEnabled)).append("\n");
        sb.append("    tabScaleMetadata: ").append(toIndentedString(tabScaleMetadata)).append("\n");
        sb.append("    tabTextFormattingEnabled: ").append(toIndentedString(tabTextFormattingEnabled)).append("\n");
        sb.append("    tabTextFormattingMetadata: ").append(toIndentedString(tabTextFormattingMetadata)).append("\n");
        sb.append("    textTabsEnabled: ").append(toIndentedString(textTabsEnabled)).append("\n");
        sb.append("    textTabsMetadata: ").append(toIndentedString(textTabsMetadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
