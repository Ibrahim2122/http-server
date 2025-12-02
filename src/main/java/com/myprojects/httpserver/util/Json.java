package com.myprojects.httpserver.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

public class Json {

    private static ObjectMapper mapper = defaultMapper();

    private static ObjectMapper defaultMapper() {
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return om;
    }

    public static JsonNode parse(String jsonSrc) throws JsonProcessingException {
        return mapper.readTree(jsonSrc);
    }

    public static <A> A fromJson(JsonNode json, Class<A> clazz) throws JsonProcessingException {
//        return mapper.convertValue(json, clazz);
        return mapper.treeToValue(json, clazz);
    }

    public static JsonNode toJson(Object obj) throws JsonProcessingException {
        return mapper.valueToTree(obj);
    }

    public static String stringify(JsonNode node) throws JsonProcessingException {
        return generateJson(node, false);
    }

    public static String stringifyPretty(JsonNode node) throws JsonProcessingException {
        return generateJson(node, true);
    }

    public static String generateJson(Object obj, boolean pretty) throws JsonProcessingException {
        ObjectWriter ow = mapper.writer();

        if (pretty)
            ow = ow.with(SerializationFeature.INDENT_OUTPUT);

        return ow.writeValueAsString(obj);
    }
}
