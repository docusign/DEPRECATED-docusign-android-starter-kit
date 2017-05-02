package com.docusign.sample.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class EnumDeserializer implements JsonDeserializer<Enum<?>> {

    public static final EnumDeserializer INSTANCE = new EnumDeserializer();

    private EnumDeserializer() {
    }

    @Override
    public Enum<?> deserialize(JsonElement json, Type typeOfEnum, JsonDeserializationContext context) throws JsonParseException {
        Object[] consts = ((Class<?>) typeOfEnum).getEnumConstants();

        final String enumName = json.getAsString();
        for (Object ob : consts) {
            if (ob.toString().equalsIgnoreCase(enumName))
                return (Enum<?>) ob;
        }

        return null;
    }
}

