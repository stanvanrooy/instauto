package com.instagram.debug.quickexperiment.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class QuickExperimentBisectStoreModel {
    public List mBisectExperiments = new ArrayList();
    public HashMap mUniverseToIndex = new HashMap();

    public class ExperimentModel implements Comparable {
        public HashMap mParamValueMap = new HashMap();
        public String mUniverse;

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.mUniverse, ExperimentModel.class});
        }

        public boolean equals(Object obj) {
            if (obj instanceof ExperimentModel) {
                return this.mUniverse.equals(((ExperimentModel) obj).mUniverse);
            }
            return false;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Universe Name: ");
            stringBuffer.append(this.mUniverse);
            for (String str : this.mParamValueMap.keySet()) {
                stringBuffer.append("\nParam: ");
                stringBuffer.append(str);
                stringBuffer.append("\nValue: ");
                stringBuffer.append((String) this.mParamValueMap.get(str));
            }
            return stringBuffer.toString();
        }

        public ExperimentModel() {
        }

        public ExperimentModel(String str, HashMap hashMap) {
            this.mUniverse = str;
            this.mParamValueMap = hashMap;
        }

        public ExperimentModel(String str, List list, List list2) {
            this.mUniverse = str;
            for (int i = 0; i < list.size(); i++) {
                this.mParamValueMap.put(list.get(i), list2.get(i));
            }
        }

        public int compareTo(ExperimentModel experimentModel) {
            return this.mUniverse.compareTo(experimentModel.mUniverse);
        }
    }

    public void clear() {
        this.mBisectExperiments.clear();
        this.mUniverseToIndex.clear();
    }

    public void generateOrdering() {
        this.mUniverseToIndex.clear();
        int i = 0;
        for (ExperimentModel experimentModel : this.mBisectExperiments) {
            this.mUniverseToIndex.put(experimentModel.mUniverse, Integer.valueOf(i));
            i++;
        }
    }

    public String getParameter(String str, String str2) {
        Integer num = (Integer) this.mUniverseToIndex.get(str);
        if (num == null) {
            return null;
        }
        return (String) ((ExperimentModel) this.mBisectExperiments.get(num.intValue())).mParamValueMap.get(str2);
    }

    public int getUniverseCount() {
        return this.mBisectExperiments.size();
    }

    public Integer getUniverseIndex(String str) {
        if (this.mUniverseToIndex.get(str) == null) {
            return null;
        }
        return (Integer) this.mUniverseToIndex.get(str);
    }

    public void putQuickExperiment(String str, HashMap hashMap) {
        ExperimentModel experimentModel = new ExperimentModel(str, hashMap);
        if (this.mUniverseToIndex.get(str) != null) {
            this.mBisectExperiments.set(((Integer) this.mUniverseToIndex.get(str)).intValue(), experimentModel);
            return;
        }
        this.mBisectExperiments.add(experimentModel);
        this.mUniverseToIndex.put(str, Integer.valueOf(this.mBisectExperiments.size() - 1));
    }

    public void putQuickExperiment(String str, List list, List list2) {
        ExperimentModel experimentModel = new ExperimentModel(str, list, list2);
        if (this.mUniverseToIndex.get(str) != null) {
            this.mBisectExperiments.set(((Integer) this.mUniverseToIndex.get(str)).intValue(), experimentModel);
            return;
        }
        this.mBisectExperiments.add(experimentModel);
        this.mUniverseToIndex.put(str, Integer.valueOf(this.mBisectExperiments.size() - 1));
    }
}
