package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.0vR  reason: invalid class name and case insensitive filesystem */
public final class C20640vR implements C19590tj {
    public static final C05110Id A01 = new C20650vS();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BcT(C17090pf r11, boolean z) {
        C20560vJ r112 = (C20560vJ) r11;
        AnonymousClass3LX.A0R(this.A00, r112.AY6(), C58022fB.REACTION.A00, r112.A02, System.currentTimeMillis() - r112.A01, z, (C06270Ok) null);
    }

    public final /* bridge */ /* synthetic */ void BcU(C17090pf r13, boolean z, boolean z2, AnonymousClass4R2 r16, C06270Ok r17) {
        C20560vJ r132 = (C20560vJ) r13;
        AnonymousClass3LX.A0S(this.A00, r132.AY6(), C58022fB.REACTION.A00, r132.A02, System.currentTimeMillis() - r132.A01, z, z2, r16, r17);
    }

    public final /* bridge */ /* synthetic */ void BcV(C17090pf r7, boolean z, boolean z2, C06270Ok r10) {
        C20560vJ r72 = (C20560vJ) r7;
        AnonymousClass0C1 r5 = this.A00;
        DirectThreadKey AY6 = r72.AY6();
        String str = C58022fB.REACTION.A00;
        String str2 = r72.A02;
        AnonymousClass0P4 A07 = AnonymousClass3LX.A07("send_attempt", z2);
        AnonymousClass3LX.A0f(str);
        A07.A0G("type", str);
        A07.A0G("client_context", str2);
        if (z) {
            A07.A0G("is_silent", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        A07.A04(r10);
        AnonymousClass3LX.A0A(A07, AY6);
        AnonymousClass0WN.A01(r5).BcG(A07);
    }

    public final /* bridge */ /* synthetic */ void BcX(C17090pf r11, boolean z, C06270Ok r13) {
        C20560vJ r112 = (C20560vJ) r11;
        AnonymousClass3LX.A0R(this.A00, r112.AY6(), C58022fB.REACTION.A00, r112.A02, System.currentTimeMillis() - r112.A01, z, r13);
    }

    public C20640vR(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void BcW(C17090pf r1, boolean z) {
    }
}
