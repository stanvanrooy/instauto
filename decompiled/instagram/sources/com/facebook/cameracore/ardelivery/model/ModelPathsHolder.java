package com.facebook.cameracore.ardelivery.model;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass0DB;
import p000X.C76793Xi;

public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            hashMap.put(C76793Xi.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, hashMap);
    }

    public String getModelPath(C76793Xi r5) {
        String str = (String) this.mModelPaths.get(r5);
        if (str == null) {
            AnonymousClass0DB.A0F(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", r5.name(), this.mCapability.name()));
        }
        return str;
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getVersion() {
        return this.mVersion;
    }
}
