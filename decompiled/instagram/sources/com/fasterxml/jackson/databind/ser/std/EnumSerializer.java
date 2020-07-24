package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.C06;
import p000X.C27126Byj;
import p000X.C27127Byq;
import p000X.C27148BzD;
import p000X.C35;

@JacksonStdImpl
public final class EnumSerializer extends StdScalarSerializer implements C35 {
    public final C27127Byq A00;
    public final Boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        if (r2 == p000X.Constants.A0j) goto L_0x0025;
     */
    public static Boolean A00(Class cls, C27126Byj byj, boolean z) {
        Integer num;
        boolean z2;
        String str;
        String str2;
        if (byj == null) {
            num = null;
        } else {
            num = byj.A00;
        }
        if (num == null || num == Constants.ZERO || num == Constants.ONE) {
            return null;
        }
        if (num == Constants.A12) {
            return Boolean.FALSE;
        }
        if (!(num == Constants.A0Y || num == Constants.A0u)) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            return Boolean.TRUE;
        }
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "SCALAR";
                    break;
                case 2:
                    str = "ARRAY";
                    break;
                case 3:
                    str = "OBJECT";
                    break;
                case 4:
                    str = "NUMBER";
                    break;
                case 5:
                    str = "NUMBER_FLOAT";
                    break;
                case 6:
                    str = "NUMBER_INT";
                    break;
                case 7:
                    str = "STRING";
                    break;
                case 8:
                    str = "BOOLEAN";
                    break;
                default:
                    str = "ANY";
                    break;
            }
        } else {
            str = "null";
        }
        String name = cls.getName();
        if (z) {
            str2 = "class";
        } else {
            str2 = "property";
        }
        throw new IllegalArgumentException(AnonymousClass000.A0Q("Unsupported serialization shape (", str, ") for Enum ", name, ", not supported as ", str2, " annotation"));
    }

    public EnumSerializer(C27127Byq byq, Boolean bool) {
        super(Enum.class, false);
        this.A00 = byq;
        this.A01 = bool;
    }

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        C27126Byj A002;
        Boolean A003;
        if (bzD == null || (A002 = c06.A05.A01().A00(bzD.APy())) == null || (A003 = A00(bzD.AZA().A00, A002, false)) == this.A01) {
            return this;
        }
        return new EnumSerializer(this.A00, A003);
    }
}
