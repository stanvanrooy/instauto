package com.facebook.cameracore.xplatardelivery.models;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import p000X.AnonymousClass000;
import p000X.C120125Dh;
import p000X.C204648pH;

public class ARLocalAssetXplat implements C204648pH {
    public final String mAssetId;
    public final String mCacheKey;
    public final String mEffectInstanceId;
    public final String mFilePath;
    public final XplatAssetType mXplatAssetType;

    public ARAssetType getARAssetType() {
        XplatAssetType xplatAssetType = this.mXplatAssetType;
        switch (xplatAssetType.ordinal()) {
            case 0:
            case 2:
            case 3:
                return ARAssetType.EFFECT;
            case 1:
                return ARAssetType.BUNDLE;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_BANNER:
            case 15:
                return ARAssetType.SUPPORT;
            case C120125Dh.VIEW_TYPE_BADGE:
                return ARAssetType.REMOTE;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("unsupported xplat asset type ", xplatAssetType.name()));
        }
    }

    public ARLocalAssetXplat(String str, String str2, String str3, String str4, int i) {
        this.mAssetId = str;
        this.mEffectInstanceId = str2;
        this.mCacheKey = str3;
        this.mFilePath = str4;
        if (i < 0 || i >= XplatAssetType.values().length) {
            throw new IllegalArgumentException("Invalid cpp value for AssetType");
        }
        this.mXplatAssetType = XplatAssetType.A01[i];
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

    public String getFilePath() {
        return this.mFilePath;
    }
}
