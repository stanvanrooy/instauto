package p000X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.0vf  reason: invalid class name and case insensitive filesystem */
public final class C20780vf implements C19590tj {
    public static final C05110Id A01 = new C20790vg();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BcT(C17090pf r4, boolean z) {
        AnonymousClass0C1 r2 = this.A00;
        AnonymousClass0WN.A01(r2).BcG(AnonymousClass3LX.A05(((C20710vY) r4).A02(), "sent", z));
    }

    public final /* bridge */ /* synthetic */ void BcU(C17090pf r5, boolean z, boolean z2, AnonymousClass4R2 r8, C06270Ok r9) {
        AnonymousClass0C1 r3 = this.A00;
        AnonymousClass0P4 A05 = AnonymousClass3LX.A05(((C20710vY) r5).A02(), "failed", z2);
        if (z) {
            A05.A0G("is_silent", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        AnonymousClass3LX.A09(A05, r8);
        A05.A04(r9);
        AnonymousClass0WN.A01(r3).BcG(A05);
    }

    public final /* bridge */ /* synthetic */ void BcV(C17090pf r5, boolean z, boolean z2, C06270Ok r8) {
        AnonymousClass0C1 r3 = this.A00;
        AnonymousClass0P4 A05 = AnonymousClass3LX.A05(((C20710vY) r5).A02(), "send_attempt", z2);
        if (z) {
            A05.A0G("is_silent", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        A05.A04(r8);
        AnonymousClass0WN.A01(r3).BcG(A05);
    }

    public final /* bridge */ /* synthetic */ void BcX(C17090pf r4, boolean z, C06270Ok r6) {
        AnonymousClass0C1 r2 = this.A00;
        AnonymousClass0P4 A05 = AnonymousClass3LX.A05(((C20710vY) r4).A02(), "sent", z);
        if (r6 != null) {
            A05.A04(r6);
        }
        AnonymousClass0WN.A01(r2).BcG(A05);
    }

    public C20780vf(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void BcW(C17090pf r1, boolean z) {
    }
}
