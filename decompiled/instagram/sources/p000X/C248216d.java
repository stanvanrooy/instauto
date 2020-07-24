package p000X;

import android.content.Context;

/* renamed from: X.16d  reason: invalid class name and case insensitive filesystem */
public final class C248216d implements AnonymousClass0Q6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C247916a A01;
    public final /* synthetic */ AnonymousClass0C1 A02;

    public C248216d(C247916a r1, Context context, AnonymousClass0C1 r3) {
        this.A01 = r1;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(230937997);
        C05700Lp.A00().ADc(new C62792oN(this));
        AnonymousClass0Z0.A0A(153412948, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(1500647429, AnonymousClass0Z0.A03(-609342083));
    }
}
