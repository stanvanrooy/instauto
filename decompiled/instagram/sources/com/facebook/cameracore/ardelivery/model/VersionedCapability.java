package com.facebook.cameracore.ardelivery.model;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000X.AnonymousClass0DB;
import p000X.C707737p;

public enum VersionedCapability {
    Facetracker(r5, 1, XplatAssetType.FaceTrackerModel),
    Handtracker(r9, 2, r11),
    Segmentation(r9, 3, XplatAssetType.SegmentationModel),
    TargetRecognition(r9, 4, XplatAssetType.TargetRecognitionModel),
    HairSegmentation(r9, 5, XplatAssetType.HairSegmentationModel),
    XRay(r9, 6, XplatAssetType.XRayModel),
    RingTryOn(r9, 7, r11),
    FaceExpressionFitting(r5, 8, XplatAssetType.FittedExpressionTrackerModel),
    MSuggestionsCore(r9, 9, XplatAssetType.MSuggestionsCoreModel),
    GazeCorrection(r9, 10, r11),
    Nametag(r9, 11, XplatAssetType.Nametag),
    BiBytedoc(r27, 12, r29),
    BiDeepText(r9, 13, r11),
    PytorchTest(r27, 14, r29),
    BiXray(r27, 15, r29),
    BodyTracking(r9, 16, r11),
    Safechat(r27, 17, r29);
    
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP = null;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = null;
    public final XplatAssetType mAssetType;
    public final C707737p mMLFrameworkType;
    public final int mXplatValue;

    /* access modifiers changed from: public */
    static {
        int i;
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = new HashMap();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(versionedCapability.name().toUpperCase(Locale.US), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(str.toUpperCase(Locale.US));
        if (versionedCapability != null) {
            return versionedCapability;
        }
        AnonymousClass0DB.A0L(TAG, "Unsupported capability: %s", str);
        return null;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    /* access modifiers changed from: public */
    VersionedCapability(C707737p r3, int i, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = r3;
        this.mXplatValue = i;
        this.mAssetType = xplatAssetType;
    }

    public C707737p getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }

    public String toServerValue() {
        return name();
    }
}
