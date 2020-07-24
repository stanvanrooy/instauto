package p000X;

import android.content.Context;

/* renamed from: X.CHU */
public final class CHU extends C17920r1 {
    public final /* synthetic */ CHP A00;

    public CHU(CHP chp) {
        this.A00 = chp;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(-1133927995);
        this.A00.A03 = false;
        AnonymousClass0DB.A0D("CloseFriendsV2ListController", "Failed to load Close Friends.");
        CHP.A00(this.A00);
        CHP.A02(this.A00);
        AnonymousClass0Z0.A0A(376629363, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-29900162);
        C62462nl r8 = (C62462nl) obj;
        int A032 = AnonymousClass0Z0.A03(1035639365);
        CHP chp = this.A00;
        chp.A03 = false;
        Context context = (Context) chp.A09.get();
        if (context != null) {
            chp.A03 = true;
            AnonymousClass1L8 r2 = chp.A04;
            C17850qu A002 = C25007Axz.A00(chp.A08);
            A002.A00 = new CHT(chp, r8);
            C28351Lj.A00(context, r2, A002);
        }
        AnonymousClass0Z0.A0A(703143631, A032);
        AnonymousClass0Z0.A0A(2009097938, A03);
    }
}
