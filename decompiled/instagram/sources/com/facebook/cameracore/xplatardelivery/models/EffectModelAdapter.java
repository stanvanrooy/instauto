package com.facebook.cameracore.xplatardelivery.models;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.C205068q8;
import p000X.C79533db;

public class EffectModelAdapter {
    public final String MD5Hash;
    public final List arEffectFileBundles;
    public final String cacheKey;
    public final List capabilitiesMinVersionModels;
    public final int compressionTypeCppValue;
    public final String effectId;
    public final String effectInstanceId;
    public final String fileName;
    public final long fileSize;
    public final String graphqlId;
    public final String uri;

    public EffectModelAdapter(ARRequestAsset aRRequestAsset) {
        C205068q8 r0;
        AnonymousClass0a4.A0B(aRRequestAsset.A00() == ARAssetType.EFFECT, "This adapter is only for effect asset");
        String A01 = aRRequestAsset.A01();
        this.effectId = A01;
        C79533db r2 = aRRequestAsset.A02;
        this.effectInstanceId = r2.A07;
        this.capabilitiesMinVersionModels = aRRequestAsset.A08;
        this.fileName = aRRequestAsset.A05;
        this.graphqlId = A01;
        this.cacheKey = r2.A05;
        this.uri = aRRequestAsset.A07;
        this.MD5Hash = aRRequestAsset.A04;
        this.fileSize = aRRequestAsset.A00;
        ARRequestAsset.CompressionMethod compressionMethod = r2.A02;
        switch (compressionMethod.ordinal()) {
            case 0:
                r0 = C205068q8.None;
                break;
            case 1:
                r0 = C205068q8.Zip;
                break;
            case 2:
                r0 = C205068q8.TarBrotli;
                break;
            default:
                throw new IllegalArgumentException("Unsupported compression method : " + compressionMethod);
        }
        this.compressionTypeCppValue = r0.A00;
        this.arEffectFileBundles = aRRequestAsset.A03;
    }
}
