package com.instagram.prefetch;

import android.app.Application;
import android.content.Context;
import p000X.AnonymousClass1F7;
import p000X.C30618DgD;

public class PrefetchDebugView {
    public Context A00;
    public AnonymousClass1F7 A01;
    public final Application.ActivityLifecycleCallbacks A02 = new C30618DgD(this);

    public PrefetchDebugView(Context context, AnonymousClass1F7 r3) {
        this.A00 = context;
        this.A01 = r3;
        r3.BsC();
    }
}
