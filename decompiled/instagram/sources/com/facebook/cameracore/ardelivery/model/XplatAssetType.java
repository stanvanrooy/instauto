package com.facebook.cameracore.ardelivery.model;

import p000X.AnonymousClass000;

public enum XplatAssetType {
    AREffect(0),
    AREffectBundle(1),
    FaceTrackerModel(4),
    HairSegmentationModel(5),
    SegmentationModel(6),
    TargetRecognitionModel(7),
    XRayModel(8),
    FittedExpressionTrackerModel(10),
    MSuggestionsCoreModel(11),
    Nametag(12),
    Remote(13),
    PyTorchModel(14),
    Caffe2Model(15);
    
    public static final XplatAssetType[] A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new XplatAssetType[values().length];
        for (XplatAssetType xplatAssetType : values()) {
            A01[xplatAssetType.A00] = xplatAssetType;
        }
    }

    /* access modifiers changed from: public */
    XplatAssetType(int i) {
        this.A00 = i;
    }

    public static XplatAssetType A00(ARAssetType aRAssetType) {
        switch (aRAssetType.ordinal()) {
            case 0:
                return AREffect;
            case 2:
                return AREffectBundle;
            case 3:
                return Remote;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported ARAssetType : ", aRAssetType.name()));
        }
    }
}
