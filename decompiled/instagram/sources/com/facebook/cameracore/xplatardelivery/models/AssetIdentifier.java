package com.facebook.cameracore.xplatardelivery.models;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import p000X.AnonymousClass0CW;
import p000X.C79533db;

public class AssetIdentifier {
    public final String mAssetId;
    public final String mCacheKey;
    public final String mEffectInstanceId;

    public static AssetIdentifier fromARRequestAsset(ARRequestAsset aRRequestAsset) {
        String A01 = aRRequestAsset.A01();
        C79533db r0 = aRRequestAsset.A02;
        return new AssetIdentifier(A01, r0.A07, r0.A05);
    }

    public AssetIdentifier(String str, String str2, String str3) {
        this.mAssetId = str;
        this.mEffectInstanceId = str2 == null ? "" : str2;
        AnonymousClass0CW.A02(str3, "asset identifier should never have a null cache key.");
        this.mCacheKey = str3;
    }

    public String getAssetId() {
        return this.mAssetId;
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public String getEffectInstanceId() {
        return this.mEffectInstanceId;
    }
}
