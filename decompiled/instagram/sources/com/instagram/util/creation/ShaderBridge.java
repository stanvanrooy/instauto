package com.instagram.util.creation;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0O1;
import p000X.AnonymousClass0Y1;
import p000X.C05450Ko;
import p000X.C26911Ft;
import p000X.C88863t7;
import p000X.C89053tW;

public class ShaderBridge {
    public static boolean A00;
    public static final C05450Ko A01;
    public static final Class A02 = ShaderBridge.class;
    public static final Object A03 = new Object();

    public static native int compileProgram(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    static {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "shaderbridge";
        A01 = A002.A01();
    }

    public static void A01(C88863t7 r2) {
        synchronized (A03) {
            if (A00) {
                r2.B4c(true);
            } else {
                A01.ADc(new C89053tW(r2));
            }
        }
    }

    public static boolean A02() {
        boolean z;
        if (A00) {
            return true;
        }
        synchronized (A03) {
            z = A00;
        }
        return z;
    }

    public static boolean A03() {
        synchronized (A03) {
            if (!A00) {
                try {
                    AnonymousClass0Y1.A08("scrambler");
                    AnonymousClass0Y1.A08("glcommon");
                    AnonymousClass0Y1.A08("cj_moz");
                    A00 = true;
                } catch (UnsatisfiedLinkError e) {
                    AnonymousClass0DB.A05(A02, "Could not load native library", e);
                }
            }
        }
        return A00;
    }

    public static int A00(String str) {
        return compileProgram(str, C26911Ft.A00(), false, true, false, false);
    }
}
