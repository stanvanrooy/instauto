package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1El  reason: invalid class name and case insensitive filesystem */
public final class C26671El extends C26621Ef {
    public C26631Eg A00;

    public static C26671El A00(AnonymousClass0C1 r7) {
        Class<C26671El> cls = C26671El.class;
        C26591Ec A002 = C26591Ec.A00(r7);
        C26671El r4 = (C26671El) ((C26621Ef) A002.A03.get(cls));
        if (r4 != null) {
            return r4;
        }
        C26671El r42 = new C26671El(r7, new C26631Eg(StoredPreferences.A00, "pending_saves", new AnonymousClass1Er()));
        A002.A03.put(cls, r42);
        return r42;
    }

    public final /* bridge */ /* synthetic */ C17850qu A0E(Object obj) {
        C195948a0 r5 = (C195948a0) obj;
        C15890nh r3 = new C15890nh(this.A02);
        r3.A09 = Constants.ONE;
        Integer num = r5.A01;
        if (num == null) {
            num = Constants.ZERO;
        }
        r3.A0C = AnonymousClass2LM.A01(num, r5.A04, r5.A03);
        r3.A06(AnonymousClass1N4.class, false);
        String str = r5.A02;
        if (str != null) {
            r3.A09("radio_type", str);
        }
        HashMap hashMap = r5.A05;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                r3.A09((String) entry.getKey(), (String) entry.getValue());
            }
        }
        r3.A0G = true;
        return r3.A03();
    }

    public final Integer A0F() {
        return Constants.ONE;
    }

    public final void A0G() {
        List<C195948a0> list;
        C26961Fy r0 = (C26961Fy) this.A00.A01(AnonymousClass000.A0E("pending_saves_", this.A02.A04()), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (C195948a0 r1 : list) {
                hashMap.put(r1.A04, r1);
            }
            A0C(hashMap);
            A08();
            hashMap.size();
        }
        this.A00.A02(AnonymousClass000.A0E("pending_saves_", this.A02.A04()));
    }

    public final void A0H() {
        this.A00.A02(AnonymousClass000.A0E("pending_saves_", this.A02.A04()));
    }

    public final List A0K() {
        AnonymousClass1NJ A02;
        ArrayList arrayList = new ArrayList();
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            C195948a0 r2 = (C195948a0) it.next();
            Integer num = r2.A01;
            if (num == null) {
                num = Constants.ZERO;
            }
            if (num == Constants.ZERO && (A02 = AnonymousClass1PZ.A00(this.A02).A02(r2.A04)) != null && A0L(A02)) {
                arrayList.add(new C151816eL(A02));
            }
        }
        return arrayList;
    }

    public C26671El(AnonymousClass0C1 r1, C26631Eg r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A0I() {
        A02();
        C26961Fy r3 = new C26961Fy();
        r3.A00 = A05();
        this.A00.A06(AnonymousClass000.A0E("pending_saves_", this.A02.A04()), r3);
    }

    public final Integer A0J(AnonymousClass1NN r4) {
        String id = r4.getId();
        Integer AV3 = r4.AV3();
        if (this.A00 == null) {
            A07();
        }
        if (!A0D(id)) {
            return AV3;
        }
        String str = ((C195948a0) A03(id)).A03;
        Integer num = Constants.ZERO;
        if (!str.equals(AnonymousClass8Uw.A00(num))) {
            return Constants.ONE;
        }
        return num;
    }

    public final boolean A0L(AnonymousClass1NN r4) {
        if (A0J(r4) == Constants.ZERO) {
            return true;
        }
        return false;
    }
}
