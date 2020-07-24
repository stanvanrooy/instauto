package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import p000X.C13080hr;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C27176Bzt;

public final class BeanAsArrayDeserializer extends BeanDeserializerBase {
    public final BeanDeserializerBase A00;
    public final C27176Bzt[] A01;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, C27176Bzt[] bztArr) {
        super(beanDeserializerBase, beanDeserializerBase.A0D);
        this.A00 = beanDeserializerBase;
        this.A01 = bztArr;
    }

    public final Object A0e(C13080hr r3, C27123ByY byY) {
        throw C27125Bya.A00(byY.A05, "Can not deserialize a POJO (of type " + this.A07.A00.getName() + ") from non-Array representation (token: " + r3.A0g() + "): type/property designed to be serialized as JSON Array");
    }
}
