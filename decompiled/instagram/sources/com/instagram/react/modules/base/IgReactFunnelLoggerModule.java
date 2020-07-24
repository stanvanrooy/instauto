package com.instagram.react.modules.base;

import com.facebook.fbreact.specs.NativeAnalyticsFunnelLoggerSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.C06590Pq;
import p000X.C22760yx;
import p000X.C22800z1;
import p000X.C23043A0y;
import p000X.C35061fk;
import p000X.C35071fl;

@ReactModule(name = "AnalyticsFunnelLogger")
public class IgReactFunnelLoggerModule extends NativeAnalyticsFunnelLoggerSpec {
    public static final String MODULE_NAME = "AnalyticsFunnelLogger";
    public static final String PREFIX = "IG_ANDROID_";
    public C22800z1 mFunnelLogger;

    public String getName() {
        return MODULE_NAME;
    }

    private void addActionToFunnelWithTag(C35071fl r8, double d, String str, String str2) {
        this.mFunnelLogger.A5J(r8, (long) ((int) d), str, str2);
    }

    public void addActionToFunnel(String str, double d, String str2, String str3, C23043A0y a0y) {
        String str4 = str2;
        if (str.equals("IG_SETTINGS_FUNNEL")) {
            C35071fl A00 = C35061fk.A00(str);
            if (A00 != null) {
                this.mFunnelLogger.A5I(A00, str2);
                return;
            }
            return;
        }
        C35071fl A002 = C35061fk.A00(AnonymousClass000.A0E(PREFIX, str));
        if (A002 != null) {
            String str5 = str3;
            if (str3 != null) {
                addActionToFunnelWithTag(A002, (double) ((int) d), str4, str5);
                return;
            }
            this.mFunnelLogger.A5H(A002, (long) ((int) d), str2);
        }
    }

    public void addFunnelTag(String str, double d, String str2) {
        C35071fl A00 = C35061fk.A00(AnonymousClass000.A0E(PREFIX, str));
        if (A00 != null) {
            this.mFunnelLogger.A3B(A00, (long) ((int) d), str2);
        }
    }

    public void cancelFunnel(String str, double d) {
        C35071fl A00 = C35061fk.A00(AnonymousClass000.A0E(PREFIX, str));
        if (A00 != null) {
            this.mFunnelLogger.A82(A00, (long) ((int) d));
        }
    }

    public void endFunnel(String str, double d) {
        C35071fl A00 = C35061fk.A00(AnonymousClass000.A0E(PREFIX, str));
        if (A00 != null) {
            this.mFunnelLogger.ADC(A00, (long) ((int) d));
        }
    }

    public void startFunnel(String str, double d) {
        C35071fl A00 = C35061fk.A00(AnonymousClass000.A0E(PREFIX, str));
        if (A00 != null) {
            this.mFunnelLogger.Bph(A00, (long) ((int) d));
        }
    }

    public IgReactFunnelLoggerModule(A44 a44, C06590Pq r3) {
        super(a44);
        this.mFunnelLogger = C22760yx.A00(r3).A00;
    }
}
