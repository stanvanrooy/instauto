package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.0vM  reason: invalid class name and case insensitive filesystem */
public final class C20590vM implements C19490tZ {
    public static final C05110Id A03 = new C20600vN();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;
    public final AnonymousClass0IT A02;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r5) {
        C20560vJ r52 = (C20560vJ) r5;
        if (((Boolean) this.A02.get()).booleanValue()) {
            return true;
        }
        this.A00.BjQ(r52.AY6(), r52.A03, r52.A00);
        return true;
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r29, C06270Ok r30, C73233Ja r31) {
        Integer num;
        C20560vJ r8 = (C20560vJ) r29;
        DirectThreadKey AY6 = r8.AY6();
        String str = r8.A02;
        C56412cS r14 = r8.A00;
        String str2 = r8.A03;
        AnonymousClass3LQ r0 = r8.A02;
        boolean z = r0.A03;
        String str3 = r0.A01;
        C73243Jb r02 = new C73243Jb(r31);
        if (AY6.A00 == null || !RealtimeClientManager.getInstance(this.A01).isMqttConnected() || !((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.DIRECT_MQTT_SEND, "is_realtime_reaction_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0C1 r7 = this.A01;
            boolean z2 = r8.A02.A02;
            C15890nh r6 = new C15890nh(r7);
            r6.A09 = Constants.ONE;
            r6.A0C = C99664Sn.A01(C58022fB.REACTION, (MediaType) null, false);
            r6.A06(AnonymousClass3K3.class, false);
            C99664Sn.A02(r6, AY6, str, str2, z, str3, z2);
            r6.A09("item_type", "reaction");
            r6.A09("reaction_type", r14.A06);
            r6.A09("reaction_status", r14.A05);
            r6.A09("node_type", "item");
            r6.A09("item_id", r14.A01);
            r6.A09("emoji", r14.A00);
            String str4 = r14.A02;
            String str5 = null;
            if (str4 != null) {
                switch (((C58022fB) C58022fB.A01.get(str4)).ordinal()) {
                    case 7:
                        str5 = "raven_media";
                        break;
                    case 20:
                        str5 = "voice_media";
                        break;
                }
            }
            r6.A0A("target_item_type", str5);
            r6.A0A("original_message_client_context", r14.A03);
            r6.A0A("reaction_action_source", r14.A04);
            C17850qu A032 = r6.A03();
            A032.A00 = new AnonymousClass3K4(this.A01, r02);
            C12810hQ.A02(A032);
            num = Constants.ZERO;
        } else {
            AnonymousClass4T5.A00(this.A01, new C99754Sw(AY6.A00, Constants.ZERO, str, C58022fB.REACTION, r14, (String) null, (String) null, (String) null, (String) null, str2, z, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null), r02);
            num = Constants.ONE;
        }
        AnonymousClass3LX.A0C(r30, num);
    }

    public C20590vM(AnonymousClass0C1 r1, C65882uZ r2, AnonymousClass0IT r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
