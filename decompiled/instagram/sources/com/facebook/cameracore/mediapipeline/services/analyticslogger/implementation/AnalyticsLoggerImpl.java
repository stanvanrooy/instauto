package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import com.facebook.breakpad.BreakpadManager;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.jni.HybridData;
import java.text.SimpleDateFormat;
import java.util.Date;
import p000X.AnonymousClass000;
import p000X.C04410Dw;
import p000X.C17610qW;
import p000X.C72203Ee;
import p000X.C72213Ef;
import p000X.C79923eL;

public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public C72203Ee mCameraARAnalyticsLogger;
    public final C17610qW mCameraARBugReportLogger;
    public C72213Ef mEffectStartIntentType;
    public String mProductName;

    private native HybridData initHybrid();

    public String getEffectStartIntentString() {
        return this.mEffectStartIntentType.toString();
    }

    public void logForBugReport(String str, String str2) {
        String str3;
        C17610qW r6 = this.mCameraARBugReportLogger;
        if (r6 != null) {
            if (r6.A00.containsKey(str)) {
                str3 = AnonymousClass000.A0E((String) r6.A00.get(str), "\n");
            } else {
                str3 = "";
            }
            r6.A00.put(str, AnonymousClass000.A0E(str3, AnonymousClass000.A0N("[", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), "]: ", str2)));
        }
    }

    public void logRawEvent(String str, String str2) {
        C72203Ee r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            r0.A02(str, str2);
        }
    }

    public void logSessionEvent(boolean z) {
        C72203Ee r3 = this.mCameraARAnalyticsLogger;
        if (r3 != null && !r3.A07) {
            if (z) {
                C04410Dw.A0G("CAMERA_CORE_PRODUCT_NAME", r3.A05);
                C04410Dw.A0G("CAMERA_CORE_EFFECT_ID", r3.A02);
                C04410Dw.A0G("CAMERA_CORE_EFFECT_INSTANCE_ID", r3.A03);
                if (BreakpadManager.isActive()) {
                    BreakpadManager.setCustomData("CAMERA_CORE_PRODUCT_NAME", r3.A05, new Object[0]);
                    BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_ID", r3.A02, new Object[0]);
                    BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID", r3.A03, new Object[0]);
                }
                r3.A02("camera_ar_session", (String) null);
                return;
            }
            C04410Dw.A0F("CAMERA_CORE_PRODUCT_NAME");
            C04410Dw.A0F("CAMERA_CORE_EFFECT_ID");
            C04410Dw.A0F("CAMERA_CORE_EFFECT_INSTANCE_ID");
            if (BreakpadManager.isActive()) {
                BreakpadManager.removeCustomData("CAMERA_CORE_PRODUCT_NAME");
                BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_ID");
                BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID");
            }
        }
    }

    public void release() {
        this.mHybridData.resetNative();
        this.mCameraARAnalyticsLogger = null;
    }

    public void setSessionListener(C79923eL r2) {
        C72203Ee r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            r0.A00 = r2;
        }
    }

    public AnalyticsLoggerImpl(C72203Ee r2, C17610qW r3) {
        this.mHybridData = initHybrid();
        this.mCameraARAnalyticsLogger = r2;
        String str = r2.A05;
        this.mProductName = str == null ? "" : str;
        this.mCameraARBugReportLogger = r3;
        this.mEffectStartIntentType = C72213Ef.Unknown;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public void setInfo(String str, String str2, String str3, String str4, String str5, boolean z, C72213Ef r9) {
        this.mProductName = str;
        this.mEffectStartIntentType = r9;
        C72203Ee r1 = this.mCameraARAnalyticsLogger;
        if (r1 != null) {
            r1.A07 = z;
            r1.A05 = str;
            r1.A02 = str2;
            r1.A03 = str3;
            r1.A01 = str4;
            r1.A04 = str5;
            r1.A06 = null;
            C79923eL r0 = r1.A00;
            if (r0 != null) {
                r0.Aqe(str5);
            }
        }
    }

    public void setInfo(String str, String str2, String str3, String str4, String str5, boolean z, String str6, C72213Ef r9) {
        this.mProductName = str;
        this.mEffectStartIntentType = r9;
        C72203Ee r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            r0.A07 = z;
            r0.A05 = str;
            r0.A02 = str2;
            r0.A03 = str3;
            r0.A01 = str4;
            r0.A04 = str5;
            r0.A06 = str6;
            C79923eL r02 = r0.A00;
            if (r02 != null) {
                r02.Aqe(str5);
            }
        }
    }

    public void setInfo(String str, String str2, String str3, boolean z) {
        this.mProductName = str;
        C72203Ee r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            r0.A07 = z;
            r0.A05 = str;
            r0.A02 = str2;
            r0.A03 = str3;
            r0.A01 = null;
            r0.A04 = null;
            r0.A06 = null;
            C79923eL r02 = r0.A00;
            if (r02 != null) {
                r02.Aqe((String) null);
            }
        }
    }
}
