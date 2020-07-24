package com.instagram.debug.quickexperiment.storage;

import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

public final class QuickExperimentDebugStoreModel__JsonHelper {
    public static boolean processSingleField(QuickExperimentDebugStoreModel quickExperimentDebugStoreModel, String str, C13080hr r8) {
        HashMap hashMap;
        HashMap hashMap2;
        if ("overridden_experiments".equals(str)) {
            if (r8.A0g() == C13120hv.START_OBJECT) {
                hashMap2 = new HashMap();
                while (r8.A0p() != C13120hv.END_OBJECT) {
                    String A0t = r8.A0t();
                    r8.A0p();
                    if (r8.A0g() == C13120hv.VALUE_NULL) {
                        hashMap2.put(A0t, (Object) null);
                    } else {
                        QuickExperimentDebugStoreModel.QuickExperimentOverrideModel parseFromJson = C0041xfbae7577.parseFromJson(r8);
                        if (parseFromJson != null) {
                            hashMap2.put(A0t, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap2 = null;
            }
            quickExperimentDebugStoreModel.mOverriddenExperiments = hashMap2;
            return true;
        } else if (!"tracked_experiments".equals(str)) {
            return false;
        } else {
            if (r8.A0g() == C13120hv.START_OBJECT) {
                hashMap = new HashMap();
                while (r8.A0p() != C13120hv.END_OBJECT) {
                    String A0t2 = r8.A0t();
                    r8.A0p();
                    if (r8.A0g() == C13120hv.VALUE_NULL) {
                        hashMap.put(A0t2, (Object) null);
                    } else {
                        QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel parseFromJson2 = C0042x743abe0c.parseFromJson(r8);
                        if (parseFromJson2 != null) {
                            hashMap.put(A0t2, parseFromJson2);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            quickExperimentDebugStoreModel.mTrackedExperiments = hashMap;
            return true;
        }
    }

    public static QuickExperimentDebugStoreModel parseFromJson(C13080hr r3) {
        QuickExperimentDebugStoreModel quickExperimentDebugStoreModel = new QuickExperimentDebugStoreModel();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(quickExperimentDebugStoreModel, A0i, r3);
            r3.A0f();
        }
        return quickExperimentDebugStoreModel;
    }

    public static QuickExperimentDebugStoreModel parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(QuickExperimentDebugStoreModel quickExperimentDebugStoreModel) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, quickExperimentDebugStoreModel, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r4, QuickExperimentDebugStoreModel quickExperimentDebugStoreModel, boolean z) {
        if (z) {
            r4.A0T();
        }
        if (quickExperimentDebugStoreModel.mOverriddenExperiments != null) {
            r4.A0d("overridden_experiments");
            r4.A0T();
            for (Map.Entry entry : quickExperimentDebugStoreModel.mOverriddenExperiments.entrySet()) {
                r4.A0d((String) entry.getKey());
                if (entry.getValue() == null) {
                    r4.A0R();
                } else {
                    C0041xfbae7577.serializeToJson(r4, (QuickExperimentDebugStoreModel.QuickExperimentOverrideModel) entry.getValue(), true);
                }
            }
            r4.A0Q();
        }
        if (quickExperimentDebugStoreModel.mTrackedExperiments != null) {
            r4.A0d("tracked_experiments");
            r4.A0T();
            for (Map.Entry entry2 : quickExperimentDebugStoreModel.mTrackedExperiments.entrySet()) {
                r4.A0d((String) entry2.getKey());
                if (entry2.getValue() == null) {
                    r4.A0R();
                } else {
                    C0042x743abe0c.serializeToJson(r4, (QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel) entry2.getValue(), true);
                }
            }
            r4.A0Q();
        }
        if (z) {
            r4.A0Q();
        }
    }
}
