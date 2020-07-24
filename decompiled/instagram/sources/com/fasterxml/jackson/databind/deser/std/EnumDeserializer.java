package com.fasterxml.jackson.databind.deser.std;

import java.lang.reflect.Method;
import p000X.C0F;
import p000X.C27121ByW;

public final class EnumDeserializer extends StdScalarDeserializer {
    public final C27121ByW A00;

    public final class FactoryBasedDeserializer extends StdScalarDeserializer {
        public final Class A00;
        public final Class A01;
        public final Method A02;

        public FactoryBasedDeserializer(Class cls, C0F c0f, Class cls2) {
            super(Enum.class);
            this.A00 = cls;
            this.A02 = c0f.A01;
            this.A01 = cls2;
        }
    }

    public EnumDeserializer(C27121ByW byW) {
        super(Enum.class);
        this.A00 = byW;
    }
}
