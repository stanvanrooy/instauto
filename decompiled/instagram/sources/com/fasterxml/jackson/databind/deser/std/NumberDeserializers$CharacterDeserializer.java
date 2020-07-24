package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$CharacterDeserializer A00 = new NumberDeserializers$CharacterDeserializer(Character.class, 0);
    public static final NumberDeserializers$CharacterDeserializer A01 = new NumberDeserializers$CharacterDeserializer(Character.TYPE, (Character) null);

    public NumberDeserializers$CharacterDeserializer(Class cls, Character ch) {
        super(cls, ch);
    }
}
