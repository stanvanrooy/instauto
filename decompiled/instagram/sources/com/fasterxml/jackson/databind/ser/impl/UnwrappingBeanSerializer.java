package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import p000X.AnonymousClass000;
import p000X.C27;
import p000X.C3P;

public final class UnwrappingBeanSerializer extends BeanSerializerBase {
    public final C3P A00;

    public final String toString() {
        return AnonymousClass000.A0E("UnwrappingBeanSerializer for ", A07().getName());
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C27 c27) {
        super((BeanSerializerBase) unwrappingBeanSerializer, c27);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, String[] strArr) {
        super((BeanSerializerBase) unwrappingBeanSerializer, strArr);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, C3P c3p) {
        super(beanSerializerBase, c3p);
        this.A00 = c3p;
    }
}
