package com.instagram.react.modules.base;

import com.facebook.fbreact.specs.NativeIGReactQESpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.AnonymousClass0LQ;
import p000X.C05210Iq;
import p000X.C06590Pq;

@ReactModule(name = "IGReactQE")
public class IgReactQEModule extends NativeIGReactQESpec {
    public static final String MODULE_NAME = "IGReactQE";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    private String valueForConfiguration(String str, String str2, boolean z) {
        AnonymousClass0LQ r2 = AnonymousClass0LQ.A01;
        if (r2 == null) {
            return null;
        }
        C06590Pq r1 = this.mSession;
        if (r1.AgN()) {
            return r2.A08(C05210Iq.A02(r1), str, str2, z);
        }
        return null;
    }

    private String valueForUniverse(String str, String str2, boolean z) {
        AnonymousClass0LQ r2 = AnonymousClass0LQ.A01;
        if (r2 == null) {
            return null;
        }
        C06590Pq r1 = this.mSession;
        if (r1.AgN()) {
            return r2.A09(C05210Iq.A02(r1), str, str2, z);
        }
        return null;
    }

    public IgReactQEModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    public boolean booleanValueForConfiguration(String str, String str2, boolean z) {
        String valueForConfiguration = valueForConfiguration(str, str2, z);
        if (valueForConfiguration == null) {
            return false;
        }
        return Boolean.valueOf(valueForConfiguration).booleanValue();
    }

    public boolean booleanValueForUniverse(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String valueForUniverse = valueForUniverse(str, str2, z2);
        if (valueForUniverse == null) {
            return false;
        }
        return Boolean.valueOf(valueForUniverse).booleanValue();
    }

    public Double doubleValueForConfiguration(String str, String str2, boolean z) {
        String valueForConfiguration = valueForConfiguration(str, str2, z);
        if (valueForConfiguration == null) {
            return null;
        }
        return Double.valueOf(valueForConfiguration);
    }

    public Double doubleValueForUniverse(String str, String str2, String str3, String str4, double d, boolean z) {
        String valueForUniverse = valueForUniverse(str, str2, z);
        if (valueForUniverse == null) {
            return null;
        }
        return Double.valueOf(valueForUniverse);
    }

    public Double integerValueForConfiguration(String str, String str2, boolean z) {
        String valueForConfiguration = valueForConfiguration(str, str2, z);
        if (valueForConfiguration == null) {
            return null;
        }
        return Double.valueOf(valueForConfiguration);
    }

    public Double integerValueForUniverse(String str, String str2, String str3, String str4, double d, boolean z) {
        String valueForUniverse = valueForUniverse(str, str2, z);
        if (valueForUniverse == null) {
            return null;
        }
        return Double.valueOf(valueForUniverse);
    }

    public String stringValueForConfiguration(String str, String str2, boolean z) {
        return valueForConfiguration(str, str2, z);
    }

    public String stringValueForUniverse(String str, String str2, String str3, String str4, String str5, boolean z) {
        return valueForUniverse(str, str2, z);
    }
}
