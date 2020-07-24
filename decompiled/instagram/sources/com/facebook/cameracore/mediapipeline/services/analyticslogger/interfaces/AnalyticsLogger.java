package com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces;

import com.facebook.jni.HybridData;
import p000X.C72213Ef;
import p000X.C79923eL;

public abstract class AnalyticsLogger {
    public HybridData mHybridData;

    public abstract String getEffectStartIntentString();

    public abstract String getProductName();

    public abstract void logForBugReport(String str, String str2);

    public abstract void logRawEvent(String str, String str2);

    public abstract void logSessionEvent(boolean z);

    public abstract void release();

    public abstract void setInfo(String str, String str2, String str3, String str4, String str5, boolean z, C72213Ef r7);

    public abstract void setInfo(String str, String str2, String str3, String str4, String str5, boolean z, String str6, C72213Ef r8);

    public abstract void setInfo(String str, String str2, String str3, boolean z);

    public abstract void setSessionListener(C79923eL r1);
}
