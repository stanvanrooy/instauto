package com.facebook.react.bridge;

import android.content.Context;

public abstract class ContextBaseJavaModule extends BaseJavaModule {
    public final Context mContext;

    public ContextBaseJavaModule(Context context) {
        this.mContext = context;
    }

    public final Context getContext() {
        return this.mContext;
    }
}
