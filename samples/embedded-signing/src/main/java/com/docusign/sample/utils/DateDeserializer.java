package com.docusign.sample.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateDeserializer implements JsonDeserializer<Date> {

    public static final DateDeserializer INSTANCE = new DateDeserializer();

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private static final SimpleDateFormat DATE_FORMAT_VIEW = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

    static {
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private DateDeserializer() {
    }

    public static String format(Date date) {
        return DATE_FORMAT_VIEW.format(date);
    }

    @Override
    public Date deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        try {
            return DATE_FORMAT.parse(json.getAsString());
        } catch (Exception ex) {
            throw new JsonParseException(ex);
        }
    }
}

