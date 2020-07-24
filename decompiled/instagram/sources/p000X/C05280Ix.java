package p000X;

import android.content.Context;

/* renamed from: X.0Ix  reason: invalid class name and case insensitive filesystem */
public final class C05280Ix implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C024402j A01;
    public final /* synthetic */ AnonymousClass0C1 A02;
    public final /* synthetic */ C13300iJ A03;

    public C05280Ix(C024402j r1, Context context, AnonymousClass0C1 r3, C13300iJ r4) {
        this.A01 = r1;
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void run() {
        this.A01.A01.A00(this.A00, this.A02);
        C024402j.A00(this.A01, this.A00, this.A02, this.A03);
    }
}
