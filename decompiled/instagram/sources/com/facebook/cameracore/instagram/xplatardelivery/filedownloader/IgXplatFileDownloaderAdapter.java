package com.facebook.cameracore.instagram.xplatardelivery.filedownloader;

import com.facebook.cameracore.ardelivery.fetch.interfaces.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.xplatardelivery.filedownloader.FileDownloaderCallbackJNI;
import java.util.List;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.C204478oy;
import p000X.C72473Fm;

public class IgXplatFileDownloaderAdapter {
    public static final String TAG = "IgXplatFileDownloaderAdapter";
    public static final int UNKNOWN_ERROR_STATUS = -1;
    public final C72473Fm mAssetDownloader;

    public CancelableToken downloadFile(String str, int i, FileDownloaderCallbackJNI fileDownloaderCallbackJNI) {
        int i2;
        C204478oy r0 = new C204478oy(this, fileDownloaderCallbackJNI);
        C72473Fm r1 = this.mAssetDownloader;
        String A0E = AnonymousClass000.A0E("xplat_", UUID.nameUUIDFromBytes(str.getBytes()).toString());
        ARRequestAsset aRRequestAsset = new ARRequestAsset(A0E, A0E, (String) null, A0E, str, ARAssetType.EFFECT, (VersionedCapability) null, (EffectAssetType) null, false, (String) null, -1, -1, ARRequestAsset.CompressionMethod.NONE, (List) null, -1, (String) null, (String) null, (List) null);
        switch (Constants.ONE.intValue()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            default:
                i2 = 0;
                break;
        }
        boolean z = false;
        if (i >= i2) {
            z = true;
        }
        return r1.ACV(aRRequestAsset, r0, z);
    }

    public IgXplatFileDownloaderAdapter(C72473Fm r1) {
        this.mAssetDownloader = r1;
    }
}
