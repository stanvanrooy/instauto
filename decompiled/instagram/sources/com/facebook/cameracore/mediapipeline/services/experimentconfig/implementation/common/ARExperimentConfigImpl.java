package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;
import p000X.Constants;
import p000X.C05000Hl;
import p000X.C05680Ln;
import p000X.C57182dh;
import p000X.C72333Et;

public class ARExperimentConfigImpl extends ARExperimentConfig {
    public final C72333Et mARExperimentUtil;

    private native HybridData initHybrid();

    public boolean getBool(int i, boolean z) {
        Integer num;
        C72333Et r2 = this.mARExperimentUtil;
        if (r2 == null) {
            return z;
        }
        if (i >= 0) {
            Integer[] numArr = C57182dh.A00;
            if (i < numArr.length) {
                num = numArr[i];
                return r2.A00(num, z);
            }
        }
        num = Constants.ZERO;
        return r2.A00(num, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return (long) ((java.lang.Integer) r1.A01(r2.A00)).intValue();
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
    public long getLong(int i, long j) {
        Integer num;
        C05000Hl r1;
        C72333Et r2 = this.mARExperimentUtil;
        if (r2 != null) {
            if (i >= 0) {
                Integer[] numArr = C57182dh.A02;
                if (i < numArr.length) {
                    num = numArr[i];
                    if (num != Constants.ZERO) {
                        switch (num.intValue()) {
                            case 1:
                                r1 = C05680Ln.A6y;
                                break;
                            case 2:
                                r1 = C05680Ln.A6c;
                                break;
                        }
                    }
                }
            }
            num = Constants.ZERO;
            if (num != Constants.ZERO) {
            }
        }
        return j;
    }

    public void release() {
        this.mHybridData.resetNative();
    }

    public double getDouble(int i, double d) {
        C72333Et r0 = this.mARExperimentUtil;
        return d;
    }

    public String getString(int i, String str) {
        return str;
    }

    public ARExperimentConfigImpl() {
        this.mHybridData = initHybrid();
        this.mARExperimentUtil = null;
    }

    public ARExperimentConfigImpl(C72333Et r2) {
        this.mHybridData = initHybrid();
        this.mARExperimentUtil = r2;
    }
}
