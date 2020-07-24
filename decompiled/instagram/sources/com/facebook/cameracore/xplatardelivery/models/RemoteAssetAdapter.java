package com.facebook.cameracore.xplatardelivery.models;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import java.text.MessageFormat;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CW;
import p000X.C205068q8;
import p000X.C79533db;

public class RemoteAssetAdapter {
    public static final String UNKNOWN = "unknown";
    public String mAssetId;
    public String mCacheKey;
    public C205068q8 mCompressionType;
    public String mEffectInstanceId;
    public final String mFileName;
    public String mUrl;
    public XplatAssetType mXplatAssetType;

    public static C205068q8 getXPlatCompressionType(ARRequestAsset aRRequestAsset) {
        switch (aRRequestAsset.A02.A02.ordinal()) {
            case 0:
                return C205068q8.None;
            case 1:
                return C205068q8.Zip;
            case 2:
                return C205068q8.TarBrotli;
            default:
                throw new IllegalArgumentException(MessageFormat.format("Asset compression type not supported by xplat : {0}", new Object[]{aRRequestAsset.A00().name()}));
        }
    }

    public int getCompressionType() {
        return this.mCompressionType.A00;
    }

    public int getXplatAssetType() {
        return this.mXplatAssetType.A00;
    }

    public RemoteAssetAdapter(ARRequestAsset aRRequestAsset) {
        C79533db r0 = aRRequestAsset.A02;
        String str = r0.A07;
        String str2 = r0.A05;
        String str3 = aRRequestAsset.A05;
        String A01 = aRRequestAsset.A01();
        AnonymousClass0CW.A02(A01, "ARRequestAsset id cannot be empty.");
        this.mAssetId = A01;
        this.mEffectInstanceId = TextUtils.isEmpty(str) ? "unknown" : str;
        this.mCacheKey = TextUtils.isEmpty(str2) ? this.mAssetId : str2;
        this.mFileName = TextUtils.isEmpty(str3) ? "unknown" : str3;
        this.mXplatAssetType = getXPlatAssetType(aRRequestAsset);
        this.mCompressionType = getXPlatCompressionType(aRRequestAsset);
        String str4 = aRRequestAsset.A07;
        AnonymousClass0CW.A04(str4);
        this.mUrl = str4;
    }

    public static XplatAssetType getXPlatAssetType(ARRequestAsset aRRequestAsset) {
        ARAssetType A00 = aRRequestAsset.A00();
        switch (A00.ordinal()) {
            case 0:
                return XplatAssetType.AREffect;
            case 1:
                VersionedCapability A03 = aRRequestAsset.A02.A03();
                AnonymousClass0CW.A02(A03, "support type asset should not have a null capability.");
                return A03.getXplatAssetType();
            case 2:
                return XplatAssetType.AREffectBundle;
            case 3:
                return XplatAssetType.Remote;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Asset type not supported by xplat : ", A00.name()));
        }
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

    public String getFileName() {
        return this.mFileName;
    }

    public String getUrl() {
        return this.mUrl;
    }
}
