package com.facebook.cameracore.xplatardelivery.assetmanager;

import java.util.List;
import java.util.concurrent.Executor;
import p000X.AnonymousClass0Z9;
import p000X.C204918pp;
import p000X.C205108qD;
import p000X.C54922Zm;

public class AssetManagerCompletionCallback {
    public final Executor mBackgroundExecutor;
    public final C54922Zm mStateListener;

    public void onFail(String str) {
        AnonymousClass0Z9.A03(this.mBackgroundExecutor, new C204918pp(this, str), -750793945);
    }

    public void onSuccess(List list) {
        AnonymousClass0Z9.A03(this.mBackgroundExecutor, new C205108qD(this, list), -940142898);
    }

    public AssetManagerCompletionCallback(C54922Zm r1, Executor executor) {
        this.mStateListener = r1;
        this.mBackgroundExecutor = executor;
    }
}
