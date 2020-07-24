package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import p000X.AnonymousClass000;
import p000X.C06;
import p000X.C09;
import p000X.C13460iZ;
import p000X.C200288hn;
import p000X.C27;
import p000X.C27125Bya;

public final class BeanAsArraySerializer extends BeanSerializerBase {
    public final BeanSerializerBase A00;

    public final void A0J(Object obj, C13460iZ r8, C06 c06) {
        String str = "[anySetter]";
        C09[] c09Arr = this.A05;
        C09[] c09Arr2 = this.A06;
        try {
            for (C09 c09 : c09Arr2) {
                if (c09 == null) {
                    r8.A0R();
                } else {
                    c09.A05(obj, r8, c06);
                }
            }
        } catch (Exception e) {
            if (0 != c09Arr2.length) {
                str = c09Arr2[0].A06.getValue();
            }
            StdSerializer.A03(c06, e, obj, str);
        } catch (StackOverflowError e2) {
            C27125Bya bya = new C27125Bya("Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != c09Arr2.length) {
                str = c09Arr2[0].A06.getValue();
            }
            bya.A04(new C200288hn(obj, str));
            throw bya;
        }
    }

    public final String toString() {
        return AnonymousClass000.A0E("BeanAsArraySerializer for ", A07().getName());
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (C27) null);
        this.A00 = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, String[] strArr) {
        super(beanSerializerBase, strArr);
        this.A00 = beanSerializerBase;
    }
}
