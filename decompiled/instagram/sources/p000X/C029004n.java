package p000X;

import android.app.Application;

/* renamed from: X.04n  reason: invalid class name and case insensitive filesystem */
public final class C029004n extends AnonymousClass0N1 {
    public final /* synthetic */ Application A00;

    public C029004n(Application application) {
        this.A00 = application;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00.getSharedPreferences("acra_criticaldata_store", 0).getString("CLIENT_USER_ID", "");
    }
}
