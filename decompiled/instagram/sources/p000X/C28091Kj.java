package p000X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Kj  reason: invalid class name and case insensitive filesystem */
public final class C28091Kj {
    public final AnonymousClass0RN A00;
    public final AnonymousClass1I6 A01;
    public final AnonymousClass0C1 A02;
    public final Set A03 = new HashSet();

    public final void A00(C36321hr r5, int i, Map map) {
        String str = "instagram_netego_impression";
        if (!this.A03.add(r5.getId())) {
            str = "instagram_netego_sub_impression";
        }
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00(str, this.A00);
        String r2 = r5.ALf().toString();
        if (r5 instanceof C467520s) {
            r2 = "business_conversion";
        }
        A002.A0G("id", r5.getId());
        A002.A0G("netego_id", r5.getId());
        A002.A0G("tracking_token", r5.AYw());
        A002.A0G("type", r2);
        Integer valueOf = Integer.valueOf(i);
        A002.A0E("position", valueOf);
        A002.A0E("m_ix", valueOf);
        A002.A0G("session_id", this.A01.AVo());
        if (r5 instanceof AnonymousClass1NL) {
            A002.A0G("media_id", C466320g.A02(((AnonymousClass1NL) r5).APe().APo()));
        }
        A002.A0K(map);
        AnonymousClass1Z9 r22 = AnonymousClass1Z9.A01;
        A002.A0G("gap_to_last_ad", Integer.toString(r22.A00(C37161jD.AD, i)));
        A002.A0G("gap_to_last_netego", Integer.toString(r22.A00(C37161jD.NETEGO, i)));
        AnonymousClass0WN.A01(this.A02).BdB(A002);
    }

    public C28091Kj(AnonymousClass0C1 r2, AnonymousClass1I6 r3, AnonymousClass0RN r4) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }
}
