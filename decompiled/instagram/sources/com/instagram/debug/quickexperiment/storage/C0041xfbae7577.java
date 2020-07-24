package com.instagram.debug.quickexperiment.storage;

import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

/* renamed from: com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel_QuickExperimentOverrideModel__JsonHelper */
public final class C0041xfbae7577 {
    public static boolean processSingleField(QuickExperimentDebugStoreModel.QuickExperimentOverrideModel quickExperimentOverrideModel, String str, C13080hr r7) {
        HashMap hashMap;
        String A0t;
        if (!"parameters".equals(str)) {
            return false;
        }
        if (r7.A0g() == C13120hv.START_OBJECT) {
            hashMap = new HashMap();
            while (r7.A0p() != C13120hv.END_OBJECT) {
                String A0t2 = r7.A0t();
                r7.A0p();
                C13120hv A0g = r7.A0g();
                C13120hv r0 = C13120hv.VALUE_NULL;
                if (A0g == r0) {
                    hashMap.put(A0t2, (Object) null);
                } else {
                    if (A0g == r0) {
                        A0t = null;
                    } else {
                        A0t = r7.A0t();
                    }
                    if (A0t != null) {
                        hashMap.put(A0t2, A0t);
                    }
                }
            }
        } else {
            hashMap = null;
        }
        quickExperimentOverrideModel.mParameters = hashMap;
        return true;
    }

    public static QuickExperimentDebugStoreModel.QuickExperimentOverrideModel parseFromJson(C13080hr r3) {
        QuickExperimentDebugStoreModel.QuickExperimentOverrideModel quickExperimentOverrideModel = new QuickExperimentDebugStoreModel.QuickExperimentOverrideModel();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(quickExperimentOverrideModel, A0i, r3);
            r3.A0f();
        }
        return quickExperimentOverrideModel;
    }

    public static QuickExperimentDebugStoreModel.QuickExperimentOverrideModel parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(QuickExperimentDebugStoreModel.QuickExperimentOverrideModel quickExperimentOverrideModel) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, quickExperimentOverrideModel, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r3, QuickExperimentDebugStoreModel.QuickExperimentOverrideModel quickExperimentOverrideModel, boolean z) {
        if (z) {
            r3.A0T();
        }
        if (quickExperimentOverrideModel.mParameters != null) {
            r3.A0d("parameters");
            r3.A0T();
            for (Map.Entry entry : quickExperimentOverrideModel.mParameters.entrySet()) {
                r3.A0d((String) entry.getKey());
                if (entry.getValue() == null) {
                    r3.A0R();
                } else {
                    r3.A0g((String) entry.getValue());
                }
            }
            r3.A0Q();
        }
        if (z) {
            r3.A0Q();
        }
    }
}
