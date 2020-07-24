package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;

public abstract class ContainerDeserializerBase extends StdDeserializer {
    public JsonDeserializer A0L() {
        return !(this instanceof StringCollectionDeserializer) ? !(this instanceof ObjectArrayDeserializer) ? !(this instanceof MapDeserializer) ? ((CollectionDeserializer) this).A02 : ((MapDeserializer) this).A05 : ((ObjectArrayDeserializer) this).A00 : ((StringCollectionDeserializer) this).A02;
    }

    public ContainerDeserializerBase(Class cls) {
        super(cls);
    }
}
