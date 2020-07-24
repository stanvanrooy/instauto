package com.instagram.debug.quickexperiment.storage;

import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

public final class QuickExperimentBisectStoreModel__JsonHelper {
    public static boolean processSingleField(QuickExperimentBisectStoreModel quickExperimentBisectStoreModel, String str, C13080hr r8) {
        HashMap hashMap;
        ArrayList arrayList = null;
        if ("experiment_list".equals(str)) {
            if (r8.A0g() == C13120hv.START_ARRAY) {
                arrayList = new ArrayList();
                while (r8.A0p() != C13120hv.END_ARRAY) {
                    QuickExperimentBisectStoreModel.ExperimentModel parseFromJson = QuickExperimentBisectStoreModel_ExperimentModel__JsonHelper.parseFromJson(r8);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            quickExperimentBisectStoreModel.mBisectExperiments = arrayList;
            return true;
        } else if (!"universe_index_map".equals(str)) {
            return false;
        } else {
            if (r8.A0g() == C13120hv.START_OBJECT) {
                hashMap = new HashMap();
                while (r8.A0p() != C13120hv.END_OBJECT) {
                    String A0t = r8.A0t();
                    r8.A0p();
                    if (r8.A0g() == C13120hv.VALUE_NULL) {
                        hashMap.put(A0t, (Object) null);
                    } else {
                        Integer valueOf = Integer.valueOf(r8.A0I());
                        if (valueOf != null) {
                            hashMap.put(A0t, valueOf);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            quickExperimentBisectStoreModel.mUniverseToIndex = hashMap;
            return true;
        }
    }

    public static QuickExperimentBisectStoreModel parseFromJson(C13080hr r3) {
        QuickExperimentBisectStoreModel quickExperimentBisectStoreModel = new QuickExperimentBisectStoreModel();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(quickExperimentBisectStoreModel, A0i, r3);
            r3.A0f();
        }
        return quickExperimentBisectStoreModel;
    }

    public static QuickExperimentBisectStoreModel parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(QuickExperimentBisectStoreModel quickExperimentBisectStoreModel) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, quickExperimentBisectStoreModel, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r3, QuickExperimentBisectStoreModel quickExperimentBisectStoreModel, boolean z) {
        if (z) {
            r3.A0T();
        }
        if (quickExperimentBisectStoreModel.mBisectExperiments != null) {
            r3.A0d("experiment_list");
            r3.A0S();
            for (QuickExperimentBisectStoreModel.ExperimentModel experimentModel : quickExperimentBisectStoreModel.mBisectExperiments) {
                if (experimentModel != null) {
                    QuickExperimentBisectStoreModel_ExperimentModel__JsonHelper.serializeToJson(r3, experimentModel, true);
                }
            }
            r3.A0P();
        }
        if (quickExperimentBisectStoreModel.mUniverseToIndex != null) {
            r3.A0d("universe_index_map");
            r3.A0T();
            for (Map.Entry entry : quickExperimentBisectStoreModel.mUniverseToIndex.entrySet()) {
                r3.A0d((String) entry.getKey());
                if (entry.getValue() == null) {
                    r3.A0R();
                } else {
                    r3.A0X(((Integer) entry.getValue()).intValue());
                }
            }
            r3.A0Q();
        }
        if (z) {
            r3.A0Q();
        }
    }
}
