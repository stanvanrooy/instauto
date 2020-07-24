package com.instagram.debug.quickexperiment.storage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class QuickExperimentDebugStoreModel {
    public HashMap mOverriddenExperiments = new HashMap();
    public HashMap mTrackedExperiments = new HashMap();

    public class QuickExperimentOverrideModel {
        public HashMap mParameters = new HashMap();
    }

    public class TrackedQuickExperimentStoreModel {
        public Set mParameters = new HashSet();
    }

    public void clearAllTrackedParameters() {
        this.mTrackedExperiments.clear();
    }

    public String getOverriddenParameter(String str, String str2) {
        QuickExperimentOverrideModel quickExperimentOverrideModel = (QuickExperimentOverrideModel) this.mOverriddenExperiments.get(str);
        if (quickExperimentOverrideModel != null) {
            return (String) quickExperimentOverrideModel.mParameters.get(str2);
        }
        return null;
    }

    public boolean isParameterTracked(String str, String str2) {
        TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel = (TrackedQuickExperimentStoreModel) this.mTrackedExperiments.get(str);
        if (trackedQuickExperimentStoreModel != null) {
            return trackedQuickExperimentStoreModel.mParameters.contains(str2);
        }
        return false;
    }

    public void putOverriddenParameter(String str, String str2, String str3) {
        if (!this.mOverriddenExperiments.containsKey(str)) {
            this.mOverriddenExperiments.put(str, new QuickExperimentOverrideModel());
        }
        ((QuickExperimentOverrideModel) this.mOverriddenExperiments.get(str)).mParameters.put(str2, str3);
    }

    public void removeAll() {
        this.mOverriddenExperiments.clear();
    }

    public String removeOverriddenParameter(String str, String str2) {
        QuickExperimentOverrideModel quickExperimentOverrideModel = (QuickExperimentOverrideModel) this.mOverriddenExperiments.get(str);
        if (quickExperimentOverrideModel == null) {
            return null;
        }
        String str3 = (String) quickExperimentOverrideModel.mParameters.remove(str2);
        if (quickExperimentOverrideModel.mParameters.isEmpty()) {
            this.mOverriddenExperiments.remove(str);
        }
        return str3;
    }

    public boolean removeTrackedParameter(String str, String str2) {
        TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel = (TrackedQuickExperimentStoreModel) this.mTrackedExperiments.get(str);
        if (trackedQuickExperimentStoreModel == null) {
            return false;
        }
        boolean remove = trackedQuickExperimentStoreModel.mParameters.remove(str2);
        if (trackedQuickExperimentStoreModel.mParameters.isEmpty()) {
            this.mTrackedExperiments.remove(str);
        }
        return remove;
    }

    public void trackParameter(String str, String str2) {
        if (!this.mTrackedExperiments.containsKey(str)) {
            this.mTrackedExperiments.put(str, new TrackedQuickExperimentStoreModel());
        }
        ((TrackedQuickExperimentStoreModel) this.mTrackedExperiments.get(str)).mParameters.add(str2);
    }
}
