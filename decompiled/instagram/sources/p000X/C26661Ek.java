package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Ek  reason: invalid class name and case insensitive filesystem */
public final class C26661Ek extends C26621Ef {
    public C26631Eg A00;

    public static C26661Ek A00(AnonymousClass0C1 r7) {
        Class<C26661Ek> cls = C26661Ek.class;
        C26591Ec A002 = C26591Ec.A00(r7);
        C26661Ek r4 = (C26661Ek) ((C26621Ef) A002.A03.get(cls));
        if (r4 != null) {
            return r4;
        }
        C26661Ek r42 = new C26661Ek(r7, new C26631Eg(StoredPreferences.A00, "pending_follows", new C26681Em()));
        A002.A03.put(cls, r42);
        return r42;
    }

    public final /* bridge */ /* synthetic */ C17850qu A0E(Object obj) {
        C43651uq r6 = (C43651uq) obj;
        C15890nh r4 = new C15890nh(this.A02);
        r4.A09 = Constants.ONE;
        r4.A0E("friendships/%s/%s/", r6.A02, r6.A03);
        r4.A09(MemoryDumpUploadJob.EXTRA_USER_ID, r6.A03);
        r4.A09("radio_type", r6.A01);
        r4.A06(AnonymousClass1N4.class, false);
        r4.A0G = true;
        return r4.A03();
    }

    public final Integer A0F() {
        return Constants.ONE;
    }

    public final void A0G() {
        List<C43651uq> list;
        C26851Fn r0 = (C26851Fn) this.A00.A01(AnonymousClass000.A0E("pending_follows_", this.A02.A04()), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (C43651uq r1 : list) {
                r1.A00();
                hashMap.put(r1.A00(), r1);
            }
            A0C(hashMap);
            A08();
            hashMap.size();
        }
        this.A00.A02(AnonymousClass000.A0E("pending_follows_", this.A02.A04()));
    }

    public final void A0H() {
        this.A00.A02(AnonymousClass000.A0E("pending_follows_", this.A02.A04()));
    }

    public final C13390iS A0J(C13300iJ r3) {
        if (this.A00 == null) {
            A07();
        }
        C43651uq r1 = (C43651uq) A03(AnonymousClass000.A0E("follow-", r3.getId()));
        if (r1 != null) {
            String A002 = C107244jp.A00(Constants.ZERO);
            String str = r1.A02;
            if (A002.equals(str)) {
                if (r3.A1o == Constants.A0C) {
                    return C13390iS.FollowStatusRequested;
                }
                return C13390iS.FollowStatusFollowing;
            } else if (C107244jp.A00(Constants.ONE).equals(str)) {
                return C13390iS.FollowStatusNotFollowing;
            }
        }
        return r3.A0M;
    }

    public C26661Ek(AnonymousClass0C1 r1, C26631Eg r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A0I() {
        A02();
        C26851Fn r3 = new C26851Fn();
        r3.A00 = A05();
        this.A00.A06(AnonymousClass000.A0E("pending_follows_", this.A02.A04()), r3);
    }

    public final boolean A0K(C13300iJ r4) {
        if (A0J(r4) == C13390iS.FollowStatusFollowing) {
            return true;
        }
        return false;
    }
}
