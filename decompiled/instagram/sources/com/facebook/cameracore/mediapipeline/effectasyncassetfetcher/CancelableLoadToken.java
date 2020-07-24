package com.facebook.cameracore.mediapipeline.effectasyncassetfetcher;

import com.facebook.cameracore.ardelivery.fetch.interfaces.CancelableToken;
import p000X.C54942Zo;

public class CancelableLoadToken implements CancelableToken {
    public C54942Zo mLoadToken;

    public boolean cancel() {
        C54942Zo r0 = this.mLoadToken;
        if (r0 != null) {
            return r0.cancel();
        }
        return false;
    }

    public CancelableLoadToken(C54942Zo r1) {
        this.mLoadToken = r1;
    }
}
