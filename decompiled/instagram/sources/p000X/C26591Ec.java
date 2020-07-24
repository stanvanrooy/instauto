package p000X;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ec  reason: invalid class name and case insensitive filesystem */
public final class C26591Ec implements AnonymousClass0Q6, C06570Po {
    public boolean A00 = false;
    public final AnonymousClass0OT A01;
    public final AnonymousClass0NZ A02 = new C26601Ed(this);
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final C12820hR A04;
    public final AnonymousClass0C1 A05;

    public final synchronized void A01() {
        if (AnonymousClass0NT.A07(StoredPreferences.A00)) {
            this.A01.ADc(new C33391cq(this));
        }
    }

    public static synchronized C26591Ec A00(AnonymousClass0C1 r4) {
        C26591Ec r2;
        Class<C26591Ec> cls = C26591Ec.class;
        synchronized (cls) {
            r2 = (C26591Ec) r4.AV9(cls);
            if (r2 == null) {
                AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
                A002.A01 = "pending_actions";
                r2 = new C26591Ec(r4, A002.A01());
                AnonymousClass0Q7.A03().A0C(r2);
                r4.BYi(cls, r2);
            }
        }
        return r2;
    }

    public final void A02(Context context) {
        C26611Ee.A00(this.A05).initStore(context, this.A01);
        C26661Ek.A00(this.A05).initStore(context, this.A01);
        C26671El.A00(this.A05).initStore(context, this.A01);
        AnonymousClass1Eo.A00(this.A05).initStore(context, this.A01);
        C26701Ew.A00(this.A05).initStore(context, this.A01);
        AnonymousClass1Ep.A00(this.A05).initStore(context, this.A01);
        AnonymousClass1En.A00(this.A05).initStore(context, this.A01);
        C26691Eq.A00(this.A05).initStore(context, this.A01);
        AnonymousClass1F1.A00(this.A05).initStore(context, this.A01);
        AnonymousClass1F3.A00(this.A05).initStore(context, this.A01);
    }

    public final void A03(C17850qu r7) {
        this.A04.schedule(r7, 440, 4, false, false);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0KT.A08.remove(this.A02);
        AnonymousClass0C1 r4 = this.A05;
        if (r4 == null || !((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.PENDING_ACTIONS_MANAGER_USER_SESSION_LEAK, "fix_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0Q7.A03().A0D(this);
        } else {
            AnonymousClass0Q7.A03().A05.remove(this);
        }
        serializeToDisk();
    }

    public void removeDiskCache() {
        this.A01.ADc(new C107264jr(this));
    }

    public void serializeToDisk() {
        this.A01.ADc(new C58462fz(this));
    }

    public C26591Ec(AnonymousClass0C1 r2, AnonymousClass0OT r3) {
        this.A05 = r2;
        this.A01 = r3;
        this.A04 = new C12820hR(r3);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(1982894987);
        serializeToDisk();
        AnonymousClass0Z0.A0A(926424764, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(-1945334633);
        removeDiskCache();
        AnonymousClass0Z0.A0A(-2023433693, A032);
    }
}
