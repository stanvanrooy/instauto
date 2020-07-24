package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import p000X.C66862wD;

public class EffectManifest {
    public final C66862wD specifiedCameraFacing;
    public final boolean supportsLandscape;
    public final boolean supportsLongPressGesture;
    public final boolean supportsPanGesture;
    public final boolean supportsPinchGesture;
    public final boolean supportsPortrait;
    public final boolean supportsRawTouchGesture;
    public final boolean supportsRotateGesture;
    public final boolean supportsTapGesture;
    public final boolean usesGalleryPicker;
    public final boolean usesWOLF;
    public final boolean usesWorldTracking;

    public EffectManifest(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i) {
        C66862wD r0;
        this.supportsPortrait = z;
        this.supportsLandscape = z2;
        this.supportsTapGesture = z3;
        this.supportsPanGesture = z4;
        this.supportsPinchGesture = z5;
        this.supportsRotateGesture = z6;
        this.supportsLongPressGesture = z7;
        this.supportsRawTouchGesture = z8;
        this.usesWorldTracking = z9;
        this.usesWOLF = z10;
        this.usesGalleryPicker = z11;
        if (i != -1) {
            if (i == 0) {
                r0 = C66862wD.FRONT;
            } else if (i == 1) {
                r0 = C66862wD.BACK;
            }
            this.specifiedCameraFacing = r0;
        }
        r0 = C66862wD.UNSPECIFIED;
        this.specifiedCameraFacing = r0;
    }
}
