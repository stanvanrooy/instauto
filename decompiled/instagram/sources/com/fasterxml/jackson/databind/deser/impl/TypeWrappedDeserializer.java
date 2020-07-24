package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import p000X.C27106By5;

public final class TypeWrappedDeserializer extends JsonDeserializer {
    public final JsonDeserializer A00;
    public final C27106By5 A01;

    public TypeWrappedDeserializer(C27106By5 by5, JsonDeserializer jsonDeserializer) {
        this.A01 = by5;
        this.A00 = jsonDeserializer;
    }
}
