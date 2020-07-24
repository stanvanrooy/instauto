package com.instagram.debug.quickexperiment.storage;

import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel;
import java.io.StringWriter;
import java.util.HashSet;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

/* renamed from: com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel_TrackedQuickExperimentStoreModel__JsonHelper */
public final class C0042x743abe0c {
    public static boolean processSingleField(QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel, String str, C13080hr r6) {
        HashSet hashSet;
        String A0t;
        if (!"parameters".equals(str)) {
            return false;
        }
        if (r6.A0g() == C13120hv.START_ARRAY) {
            hashSet = new HashSet();
            while (r6.A0p() != C13120hv.END_ARRAY) {
                if (r6.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r6.A0t();
                }
                if (A0t != null) {
                    hashSet.add(A0t);
                }
            }
        } else {
            hashSet = null;
        }
        trackedQuickExperimentStoreModel.mParameters = hashSet;
        return true;
    }

    public static QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel parseFromJson(C13080hr r3) {
        QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel = new QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(trackedQuickExperimentStoreModel, A0i, r3);
            r3.A0f();
        }
        return trackedQuickExperimentStoreModel;
    }

    public static QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, trackedQuickExperimentStoreModel, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r2, QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel, boolean z) {
        if (z) {
            r2.A0T();
        }
        if (trackedQuickExperimentStoreModel.mParameters != null) {
            r2.A0d("parameters");
            r2.A0S();
            for (String str : trackedQuickExperimentStoreModel.mParameters) {
                if (str != null) {
                    r2.A0g(str);
                }
            }
            r2.A0P();
        }
        if (z) {
            r2.A0Q();
        }
    }
}
