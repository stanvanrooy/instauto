package com.instagram.react.modules.base;

import android.content.Context;
import com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.C05790Ly;
import p000X.C2102594w;

@ReactModule(name = "IGSharedPreferencesModule")
public class IgSharedPreferencesModule extends NativeIGSharedPreferencesModuleSpec {
    public static final String MODULE_NAME = "IGSharedPreferencesModule";
    public Context mContext;

    public String getName() {
        return MODULE_NAME;
    }

    public void getBoolean(String str, String str2, boolean z, C2102594w r5) {
        r5.resolve(Boolean.valueOf(C05790Ly.A01(this.mContext, str).getBoolean(str2, z)));
    }

    public void getString(String str, String str2, String str3, C2102594w r5) {
        r5.resolve(C05790Ly.A01(this.mContext, str).getString(str2, str3));
    }

    public IgSharedPreferencesModule(A44 a44) {
        super(a44);
        this.mContext = a44.getApplicationContext();
    }
}
