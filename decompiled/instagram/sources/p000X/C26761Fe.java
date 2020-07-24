package p000X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.1Fe  reason: invalid class name and case insensitive filesystem */
public final class C26761Fe extends C26621Ef {
    public C162996xP A00;
    public C162996xP A01;
    public final C26631Eg A02;

    public static C26761Fe A00(AnonymousClass0C1 r7) {
        Class<C26761Fe> cls = C26761Fe.class;
        C26591Ec A002 = C26591Ec.A00(r7);
        C26761Fe r4 = (C26761Fe) ((C26621Ef) A002.A03.get(cls));
        if (r4 != null) {
            return r4;
        }
        C26761Fe r42 = new C26761Fe(r7, new C26631Eg(StoredPreferences.A00, "pending_felix_seen_states", new C172907a9()));
        A002.A03.put(cls, r42);
        return r42;
    }

    public final Integer A0F() {
        return Constants.A0C;
    }

    public final void A0G() {
        HashMap hashMap;
        C173087aR r3 = (C173087aR) this.A02.A01(AnonymousClass000.A0E("pending_felix_seen_states_", this.A02.A04()), true);
        if (!(r3 == null || (hashMap = r3.A00) == null)) {
            for (String str : hashMap.keySet()) {
                A0B(str, r3.A00.get(str));
            }
            A08();
        }
        this.A02.A02(AnonymousClass000.A0E("pending_felix_seen_states_", this.A02.A04()));
    }

    public final void A0H() {
        this.A02.A02(AnonymousClass000.A0E("pending_felix_seen_states_", this.A02.A04()));
    }

    /* renamed from: A0J */
    public final C17850qu A0E(C162996xP r6) {
        AnonymousClass0C1 r4 = this.A02;
        try {
            C162676ws r2 = r6.A01;
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            C172887a7.A00(A05, r2);
            A05.close();
            String stringWriter2 = stringWriter.toString();
            C15890nh r22 = new C15890nh(r4);
            r22.A09 = Constants.ONE;
            r22.A0C = "igtv/write_seen_state/";
            r22.A09("seen_state", stringWriter2);
            r22.A06(AnonymousClass1N4.class, false);
            r22.A0G = true;
            return r22.A03();
        } catch (IOException e) {
            AnonymousClass0DB.A0G("PendingIGTVSeenStateRequest", "failed to serialize to json", e);
            return null;
        }
    }

    public final void A0K() {
        C162996xP r0 = this.A01;
        if (r0 != null) {
            A01(this, r0);
            this.A01 = null;
        }
    }

    public final void A0L(String str) {
        if (this.A01 == null) {
            this.A01 = new C162996xP();
        }
        C162996xP r2 = this.A01;
        C162676ws r1 = r2.A01;
        if (!r1.A01.contains(str)) {
            r1.A01.add(str);
        }
        r2.A00++;
    }

    public final void A0M(String str, int i) {
        if (this.A00 == null) {
            this.A00 = new C162996xP();
        }
        C162996xP r2 = this.A00;
        r2.A01.A00.put(str, new C162576wi(i));
        r2.A00++;
        C162996xP r22 = this.A00;
        if (r22.A00 >= 10 && r22 != null) {
            A01(this, r22);
            this.A00 = null;
        }
    }

    public C26761Fe(AnonymousClass0C1 r1, C26631Eg r2) {
        super(r1);
        this.A02 = r2;
    }

    public static void A01(C26761Fe r0, C162996xP r1) {
        C17850qu A0J = r0.A0E(r1);
        if (A0J != null) {
            C26591Ec.A00(r0.A02).A03(A0J);
        }
    }

    public final void A0I() {
        A02();
        C173087aR r3 = new C173087aR();
        r3.A00 = A06();
        this.A02.A05(AnonymousClass000.A0E("pending_felix_seen_states_", this.A02.A04()), r3);
    }
}
