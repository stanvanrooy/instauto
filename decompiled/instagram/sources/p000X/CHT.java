package p000X;

import java.util.List;

/* renamed from: X.CHT */
public final class CHT extends C17920r1 {
    public final /* synthetic */ CHP A00;
    public final /* synthetic */ C62462nl A01;

    public CHT(CHP chp, C62462nl r2) {
        this.A00 = chp;
        this.A01 = r2;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(1702076983);
        this.A00.A03 = false;
        AnonymousClass0DB.A0D("CloseFriendsV2ListController", "Failed to load Close Friend suggestions.");
        CHP.A00(this.A00);
        CHP.A02(this.A00);
        AnonymousClass0Z0.A0A(357186007, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-343706741);
        C62462nl r10 = (C62462nl) obj;
        int A032 = AnonymousClass0Z0.A03(-1145609218);
        CHP chp = this.A00;
        chp.A03 = false;
        CHP.A00(chp);
        CHV chv = this.A00.A06;
        List<C13300iJ> AOJ = this.A01.AOJ();
        chv.A00.clear();
        for (C13300iJ r3 : AOJ) {
            chv.A00.add(new C155936lE(r3, true));
        }
        CHV chv2 = this.A00.A06;
        List<C13300iJ> AOJ2 = r10.AOJ();
        chv2.A01.clear();
        for (C13300iJ r32 : AOJ2) {
            if (!chv2.A00.contains(new C155936lE(r32, true))) {
                chv2.A01.add(new C155936lE(r32, false));
            }
        }
        CHP chp2 = this.A00;
        chp2.A00 = this.A01.ATX();
        CHP.A01(chp2);
        CHP chp3 = this.A00;
        int size = this.A01.AOJ().size();
        int size2 = r10.AOJ().size();
        if (chp3.A02) {
            C6Y c6y = chp3.A05;
            c6y.A02 = size;
            c6y.A04 = size2;
            chp3.A02 = false;
        }
        AnonymousClass0Z0.A0A(-802358054, A032);
        AnonymousClass0Z0.A0A(1896553334, A03);
    }
}
