package com.instagram.debug.quickexperiment.storage;

import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

public final class QuickExperimentBisectStoreModel_ExperimentModel__JsonHelper {
    public static boolean processSingleField(QuickExperimentBisectStoreModel.ExperimentModel experimentModel, String str, C13080hr r8) {
        HashMap hashMap;
        String A0t;
        String str2 = null;
        if ("universe".equals(str)) {
            if (r8.A0g() != C13120hv.VALUE_NULL) {
                str2 = r8.A0t();
            }
            experimentModel.mUniverse = str2;
            return true;
        } else if (!"mapping".equals(str)) {
            return false;
        } else {
            if (r8.A0g() == C13120hv.START_OBJECT) {
                hashMap = new HashMap();
                while (r8.A0p() != C13120hv.END_OBJECT) {
                    String A0t2 = r8.A0t();
                    r8.A0p();
                    C13120hv A0g = r8.A0g();
                    C13120hv r0 = C13120hv.VALUE_NULL;
                    if (A0g == r0) {
                        hashMap.put(A0t2, (Object) null);
                    } else {
                        if (A0g == r0) {
                            A0t = null;
                        } else {
                            A0t = r8.A0t();
                        }
                        if (A0t != null) {
                            hashMap.put(A0t2, A0t);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            experimentModel.mParamValueMap = hashMap;
            return true;
        }
    }

    public static QuickExperimentBisectStoreModel.ExperimentModel parseFromJson(C13080hr r3) {
        QuickExperimentBisectStoreModel.ExperimentModel experimentModel = new QuickExperimentBisectStoreModel.ExperimentModel();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(experimentModel, A0i, r3);
            r3.A0f();
        }
        return experimentModel;
    }

    public static QuickExperimentBisectStoreModel.ExperimentModel parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(QuickExperimentBisectStoreModel.ExperimentModel experimentModel) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, experimentModel, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r3, QuickExperimentBisectStoreModel.ExperimentModel experimentModel, boolean z) {
        if (z) {
            r3.A0T();
        }
        String str = experimentModel.mUniverse;
        if (str != null) {
            r3.A0H("universe", str);
        }
        if (experimentModel.mParamValueMap != null) {
            r3.A0d("mapping");
            r3.A0T();
            for (Map.Entry entry : experimentModel.mParamValueMap.entrySet()) {
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
