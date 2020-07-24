package com.facebook.profilo.config.p001v2;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

/* renamed from: com.facebook.profilo.config.v2.Config */
public class Config {
    public final HybridData mHybridData;

    public native long getID();

    public native boolean getSystemConfigParamBool(String str);

    public native int getSystemConfigParamInt(String str);

    public native int[] getSystemConfigParamIntList(String str);

    public native String getSystemConfigParamString(String str);

    public native String[] getSystemConfigParamStringList(String str);

    public native int[] getTraceConfigIdxs(String str, String str2);

    public native boolean getTraceConfigParamBool(int i, String str);

    public native int getTraceConfigParamInt(int i, String str);

    public native int[] getTraceConfigParamIntList(int i, String str);

    public native String getTraceConfigParamString(int i, String str);

    public native String[] getTraceConfigParamStringList(int i, String str);

    public native String[] getTraceConfigProviders(int i);

    public native boolean getTraceConfigTriggerParamBool(int i, String str, String str2, String str3);

    public native int getTraceConfigTriggerParamInt(int i, String str, String str2, String str3);

    public native int[] getTraceConfigTriggerParamIntList(int i, String str, String str2, String str3);

    public native String getTraceConfigTriggerParamString(int i, String str, String str2, String str3);

    public native String[] getTraceConfigTriggerParamStringList(int i, String str, String str2, String str3);

    public native int getVersion();

    public native boolean isDisablingConfig();

    public native boolean optSystemConfigParamBool(String str, boolean z);

    public native int optSystemConfigParamInt(String str, int i);

    public native int[] optSystemConfigParamIntList(String str);

    public native String optSystemConfigParamString(String str, String str2);

    public native String[] optSystemConfigParamStringList(String str);

    public native boolean optTraceConfigParamBool(int i, String str, boolean z);

    public native int optTraceConfigParamInt(int i, String str, int i2);

    public native int[] optTraceConfigParamIntList(int i, String str);

    public native String optTraceConfigParamString(int i, String str, String str2);

    public native String[] optTraceConfigParamStringList(int i, String str);

    public native boolean optTraceConfigTriggerParamBool(int i, String str, String str2, String str3, boolean z);

    public native int optTraceConfigTriggerParamInt(int i, String str, String str2, String str3, int i2);

    public native int[] optTraceConfigTriggerParamIntList(int i, String str, String str2, String str3);

    public native String optTraceConfigTriggerParamString(int i, String str, String str2, String str3, String str4);

    public native String[] optTraceConfigTriggerParamStringList(int i, String str, String str2, String str3);

    static {
        AnonymousClass0Y1.A08("profilo_configjni");
    }

    public Config(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
