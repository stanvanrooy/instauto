package p000X;

import android.content.Context;

/* renamed from: X.13z  reason: invalid class name and case insensitive filesystem */
public final class C242813z implements C11590fD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0C1 A01;

    public C242813z(Context context, AnonymousClass0C1 r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new C242713y(this.A00, this.A01, this.A00.getSharedPreferences(AnonymousClass000.A0E("autofill_store_", this.A01.A04()), 0));
    }
}
