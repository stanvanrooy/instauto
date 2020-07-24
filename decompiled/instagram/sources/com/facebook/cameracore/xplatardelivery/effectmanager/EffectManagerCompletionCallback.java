package com.facebook.cameracore.xplatardelivery.effectmanager;

import com.facebook.cameracore.xplatardelivery.models.ARModelPathsAdapter;

public abstract class EffectManagerCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(String str, ARModelPathsAdapter aRModelPathsAdapter);
}
