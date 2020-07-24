package com.fasterxml.jackson.databind.deser.std;

public final class JsonNodeDeserializer extends BaseNodeDeserializer {
    public static final JsonNodeDeserializer A00 = new JsonNodeDeserializer();

    public final class ArrayDeserializer extends BaseNodeDeserializer {
        public static final ArrayDeserializer A00 = new ArrayDeserializer();
    }

    public final class ObjectDeserializer extends BaseNodeDeserializer {
        public static final ObjectDeserializer A00 = new ObjectDeserializer();
    }
}
