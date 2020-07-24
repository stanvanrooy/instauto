package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.0ti  reason: invalid class name and case insensitive filesystem */
public final class C19580ti implements C19590tj {
    public static final C05110Id A01 = new C19600tk();
    public final AnonymousClass0C1 A00;

    public static boolean A00(C19410tR r2) {
        if (!(r2 instanceof C19460tW) || ((C19460tW) r2).AM6() == null) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void BcT(C17090pf r12, boolean z) {
        C19410tR r122 = (C19410tR) r12;
        AnonymousClass3LX.A0R(this.A00, (DirectThreadKey) r122.A06().get(0), AnonymousClass3LX.A08(r122.A03(), r122.A04(), A00(r122)), r122.A05(), System.currentTimeMillis() - r122.A01, z, (C06270Ok) null);
    }

    public final /* bridge */ /* synthetic */ void BcU(C17090pf r14, boolean z, boolean z2, AnonymousClass4R2 r17, C06270Ok r18) {
        C19410tR r142 = (C19410tR) r14;
        AnonymousClass3LX.A0S(this.A00, (DirectThreadKey) r142.A06().get(0), AnonymousClass3LX.A08(r142.A03(), r142.A04(), A00(r142)), r142.A05(), System.currentTimeMillis() - r142.A01, z, z2, r17, r18);
    }

    public final /* bridge */ /* synthetic */ void BcV(C17090pf r7, boolean z, boolean z2, C06270Ok r10) {
        C19410tR r72 = (C19410tR) r7;
        AnonymousClass0C1 r5 = this.A00;
        DirectThreadKey directThreadKey = (DirectThreadKey) r72.A06().get(0);
        String A08 = AnonymousClass3LX.A08(r72.A03(), r72.A04(), A00(r72));
        String A05 = r72.A05();
        AnonymousClass0P4 A07 = AnonymousClass3LX.A07("send_attempt", z2);
        AnonymousClass3LX.A0f(A08);
        A07.A0G("type", A08);
        A07.A0G("client_context", A05);
        if (z) {
            A07.A0G("is_silent", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        A07.A04(r10);
        AnonymousClass3LX.A0A(A07, directThreadKey);
        AnonymousClass0WN.A01(r5).BcG(A07);
    }

    public final /* bridge */ /* synthetic */ void BcX(C17090pf r12, boolean z, C06270Ok r14) {
        C19410tR r122 = (C19410tR) r12;
        AnonymousClass3LX.A0R(this.A00, (DirectThreadKey) r122.A06().get(0), AnonymousClass3LX.A08(r122.A03(), r122.A04(), A00(r122)), r122.A05(), System.currentTimeMillis() - r122.A01, z, r14);
    }

    public C19580ti(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void BcW(C17090pf r1, boolean z) {
    }
}
