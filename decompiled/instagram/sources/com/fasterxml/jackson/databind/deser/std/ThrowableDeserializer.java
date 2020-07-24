package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import p000X.C3P;

public final class ThrowableDeserializer extends BeanDeserializer {
    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this.A06 = false;
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, C3P c3p) {
        super((BeanDeserializerBase) beanDeserializer, c3p);
    }
}
