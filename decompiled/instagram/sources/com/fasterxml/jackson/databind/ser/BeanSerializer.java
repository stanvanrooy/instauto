package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import p000X.AnonymousClass000;
import p000X.C09;
import p000X.C0L;
import p000X.C1Y;
import p000X.C27;

public final class BeanSerializer extends BeanSerializerBase {
    public final String toString() {
        return AnonymousClass000.A0E("BeanSerializer for ", A07().getName());
    }

    public BeanSerializer(C0L c0l, C1Y c1y, C09[] c09Arr, C09[] c09Arr2) {
        super(c0l, c1y, c09Arr, c09Arr2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, C27 c27) {
        super(beanSerializerBase, c27);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, String[] strArr) {
        super(beanSerializerBase, strArr);
    }
}
