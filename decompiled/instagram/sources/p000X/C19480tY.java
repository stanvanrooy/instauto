package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.0tY  reason: invalid class name and case insensitive filesystem */
public final class C19480tY implements C19490tZ {
    public static final C05110Id A02 = new C19500ta();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C19450tV) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r36, C06270Ok r37, C73233Ja r38) {
        String str;
        String str2;
        String str3;
        String str4;
        C17850qu A03;
        Integer num;
        C19450tV r12 = (C19450tV) r36;
        List A06 = r12.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r12.A05();
        String str5 = r12.A03;
        String str6 = r12.A03;
        AnonymousClass3LQ r1 = r12.A02;
        boolean z2 = r1.A03;
        String str7 = r1.A01;
        String jSONArray = new JSONArray(r12.A04).toString();
        C99424Rp A022 = r12.A02();
        String str8 = null;
        if (A022 != null) {
            str = A022.A0A;
        } else {
            str = null;
        }
        if (A022 != null) {
            str2 = A022.A09;
        } else {
            str2 = null;
        }
        if (A022 != null) {
            str3 = A022.A07.A00;
        } else {
            str3 = null;
        }
        if (A022 != null) {
            str4 = A022.A08;
        } else {
            str4 = null;
        }
        if (A022 != null) {
            str8 = A022.A0B;
        }
        DirectForwardingParams AM6 = r12.AM6();
        C73243Jb r2 = new C73243Jb(r38);
        if (directThreadKey.A00 == null || AM6 != null || !RealtimeClientManager.getInstance(this.A01).isMqttConnected() || !((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.DIRECT_MQTT_SEND, "is_realtime_text_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            if (AM6 != null) {
                A03 = C99664Sn.A00(this.A01, directThreadKey, A05, str6, z2, str7, AM6, r12.A02.A02);
            } else {
                AnonymousClass0C1 r0 = this.A01;
                boolean z3 = r12.A02.A02;
                C15890nh r9 = new C15890nh(r0);
                r9.A09 = Constants.ONE;
                r9.A0C = C99664Sn.A01(C58022fB.TEXT, (MediaType) null, false);
                r9.A06(AnonymousClass3K3.class, false);
                C99664Sn.A02(r9, directThreadKey, A05, str6, z2, str7, z3);
                r9.A09("text", str5);
                r9.A09("mentioned_user_ids", jSONArray);
                if (str != null) {
                    r9.A09("replied_to_item_id", str);
                }
                if (str2 != null) {
                    r9.A09("replied_to_client_context", str2);
                }
                if (str4 != null) {
                    r9.A09("replied_to_action_source", str4);
                }
                if (str3 != null) {
                    r9.A09("replied_to_target_type", str3);
                }
                if (str8 != null) {
                    r9.A09("replied_to_user_id", str8);
                }
                A03 = r9.A03();
            }
            A03.A00 = new AnonymousClass3K4(this.A01, r2);
            C12810hQ.A02(A03);
            num = Constants.ZERO;
        } else {
            AnonymousClass4T5.A00(this.A01, new C99754Sw(directThreadKey.A00, Constants.ZERO, A05, C58022fB.TEXT, (C56412cS) null, (String) null, str5, (String) null, (String) null, str6, z2, jSONArray, str7, str, str2, str4, str3, str8), r2);
            num = Constants.ONE;
        }
        AnonymousClass3LX.A0C(r37, num);
    }

    public C19480tY(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
