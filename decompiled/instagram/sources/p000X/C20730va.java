package p000X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.0va  reason: invalid class name and case insensitive filesystem */
public final class C20730va implements C19490tZ {
    public static final C05110Id A01 = new C20740vb();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r28, C06270Ok r29, C73233Ja r30) {
        Integer num;
        C20700vX r6 = (C20700vX) r28;
        C58862ge r5 = r6.A00;
        C73243Jb r1 = new C73243Jb(r30);
        if (!RealtimeClientManager.getInstance(this.A00).isMqttConnected() || !((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.DIRECT_MQTT_SEND, "is_realtime_thread_seen_state_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            num = Constants.ZERO;
            AnonymousClass0C1 r3 = this.A00;
            String str = r6.A03;
            String str2 = r5.A04;
            String str3 = r5.A02;
            boolean z = r6.A02.A03;
            C15890nh r52 = new C15890nh(r3);
            r52.A09 = Constants.ONE;
            r52.A0C = C06360Ot.formatString("direct_v2/threads/%s/items/%s/seen/", str2, str3);
            r52.A06(AnonymousClass3K3.class, false);
            r52.A09("action", "mark_seen");
            r52.A09("offline_threading_id", str);
            r52.A09("client_context", str);
            r52.A09("thread_id", str2);
            if (z) {
                r52.A0C("sampled", true);
            }
            C17850qu A03 = r52.A03();
            A03.A00 = new AnonymousClass3K4(this.A00, r1);
            C12810hQ.A02(A03);
        } else {
            num = Constants.ONE;
            AnonymousClass4T5.A00(this.A00, new C99754Sw(r5.A04, num, r6.A03, (C58022fB) null, (C56412cS) null, r5.A02, (String) null, (String) null, r5.A01, (String) null, r6.A02.A03, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null), r1);
        }
        AnonymousClass3LX.A0C(r29, num);
    }

    public C20730va(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
