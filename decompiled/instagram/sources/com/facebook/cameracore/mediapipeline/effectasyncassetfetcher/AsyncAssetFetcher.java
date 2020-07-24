package com.facebook.cameracore.mediapipeline.effectasyncassetfetcher;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.fetch.interfaces.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.AREffectFileBundle;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0CW;
import p000X.AnonymousClass0DB;
import p000X.C205068q8;
import p000X.C54942Zo;
import p000X.C64242qs;

public class AsyncAssetFetcher {
    public static final String TAG = "AsyncAssetFetcher";
    public final List mBundles;
    public final String mEffectId;
    public final String mEffectInstanceId;
    public final C64242qs mFetchCallback;

    private CancelableToken fetchRemoteAsset(String str, String str2, int i, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        ARRequestAsset.CompressionMethod compressionMethod;
        String str3 = str2;
        String join = TextUtils.join("_", Arrays.asList(new String[]{this.mEffectId, str2}));
        String str4 = this.mEffectInstanceId;
        C205068q8[] values = C205068q8.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 < length) {
                C205068q8 r3 = values[i2];
                if (r3.A00 == i3) {
                    switch (r3.ordinal()) {
                        case 0:
                            compressionMethod = ARRequestAsset.CompressionMethod.NONE;
                            break;
                        case 1:
                            compressionMethod = ARRequestAsset.CompressionMethod.ZIP;
                            break;
                        case 2:
                            compressionMethod = ARRequestAsset.CompressionMethod.TAR_BROTLI;
                            break;
                        default:
                            throw new IllegalArgumentException(AnonymousClass000.A0E("unsupported compression method for CompressionType : ", r3.name()));
                    }
                    String str5 = str;
                    return new CancelableLoadToken(this.mFetchCallback.AsM(new ARRequestAsset(join, str4, (String) null, str3, str5, ARAssetType.REMOTE, (VersionedCapability) null, (EffectAssetType) null, false, (String) null, -1, -1, compressionMethod, (List) null, -1, str3, (String) null, (List) null), onAsyncAssetFetchCompletedListener));
                }
                i2++;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A05("Unsupported compression type : ", i3));
            }
        }
    }

    private CancelableToken fetchBundleAsset(String str, String str2, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        C54942Zo r0;
        ARRequestAsset aRRequestAsset;
        List list = this.mBundles;
        AnonymousClass0CW.A01(list);
        Iterator it = list.iterator();
        while (true) {
            r0 = null;
            String str3 = str;
            if (!it.hasNext()) {
                aRRequestAsset = null;
                break;
            }
            AREffectFileBundle aREffectFileBundle = (AREffectFileBundle) it.next();
            String str4 = aREffectFileBundle.f161id;
            if (str3.equals(str4)) {
                String str5 = aREffectFileBundle.cacheKey;
                aRRequestAsset = new ARRequestAsset(str4, (String) null, (String) null, str5, aREffectFileBundle.uri, ARAssetType.BUNDLE, (VersionedCapability) null, (EffectAssetType) null, aREffectFileBundle.isLoggingDisabled, (String) null, -1, -1, aREffectFileBundle.compressionMethod, (List) null, -1, str5, (String) null, (List) null);
                break;
            }
        }
        if (aRRequestAsset == null) {
            AnonymousClass0DB.A0L(TAG, "no matching bundle found for bundle : %s:%s.", str, str2);
        }
        if (aRRequestAsset != null) {
            r0 = this.mFetchCallback.AsM(aRRequestAsset, onAsyncAssetFetchCompletedListener);
        }
        return new CancelableLoadToken(r0);
    }

    public CancelableToken fetchAsyncAsset(String str, String str2, String str3, int i, int i2, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        int i3;
        int i4;
        if (this.mFetchCallback == null) {
            AnonymousClass0DB.A0F(TAG, "fetch asset async but AsyncAssetFetchCallback is null.");
            onAsyncAssetFetchCompletedListener.OnAsyncAssetFetchCompleted((String) null, "No AsyncAssetFetchCallback. Abort.");
            return new CancelableLoadToken((C54942Zo) null);
        }
        if (1 - Constants.ZERO.intValue() != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i == i3) {
            return fetchBundleAsset(str, str3, onAsyncAssetFetchCompletedListener);
        }
        if (1 - Constants.ONE.intValue() != 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (i == i4) {
            return fetchRemoteAsset(str2, str3, i2, onAsyncAssetFetchCompletedListener);
        }
        throw new IllegalArgumentException(MessageFormat.format("Unknown async asset type : {0}", new Object[]{Integer.valueOf(i)}));
    }

    public List getBundles() {
        List list = this.mBundles;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public AsyncAssetFetcher(String str, String str2, List list, C64242qs r4) {
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mBundles = list;
        this.mFetchCallback = r4;
    }
}
