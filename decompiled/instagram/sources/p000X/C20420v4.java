package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0v4  reason: invalid class name and case insensitive filesystem */
public final class C20420v4 implements C19490tZ {
    public static final C05110Id A02 = new C20430v5();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20400v2) r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r1.equals("❤️") == false) goto L_0x0056;
     */
    public final /* bridge */ /* synthetic */ void BfK(C17090pf r19, C06270Ok r20, C73233Ja r21) {
        String str;
        boolean z;
        C20400v2 r5 = (C20400v2) r19;
        List A06 = r5.A06();
        boolean z2 = true;
        if (A06.size() != 1) {
            z2 = false;
        }
        AnonymousClass0a4.A09(z2);
        C96034Do r11 = r5.A00;
        AnonymousClass4RI r9 = r11.A00;
        C73233Ja r3 = r21;
        if (r5.A01 == null) {
            AnonymousClass0QD.A01("DirectSendStatusReplyMessageMutationProcessor", "error in getting the recipient id");
            r3.BCO(AnonymousClass4R2.A0E);
        }
        AnonymousClass3LQ r2 = r5.A02;
        AnonymousClass0C1 r10 = this.A01;
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String str2 = r5.A01;
        String A05 = r5.A05();
        String str3 = r11.A03;
        Integer num = r11.A01;
        if (num == null) {
            String str4 = r11.A02;
            if (str4 != null && !str4.isEmpty()) {
                z = true;
            }
            z = false;
            if (z) {
                num = Constants.ONE;
            } else {
                num = Constants.ZERO;
            }
        }
        String str5 = r5.A03;
        boolean z3 = r2.A03;
        String str6 = r2.A01;
        boolean z4 = r2.A02;
        C15890nh r112 = new C15890nh(r10);
        r112.A09 = Constants.ONE;
        r112.A0C = "direct_v2/threads/broadcast/status_reply/";
        r112.A09("status_id", r9.A01);
        r112.A09("status_key", r9.A02);
        r112.A09("thread_id", directThreadKey.A00);
        r112.A09("reply", str3);
        if (1 - num.intValue() != 0) {
            str = "text";
        } else {
            str = "heart";
        }
        r112.A09("reply_type", str);
        r112.A09("status_author_id", str2);
        r112.A06(AnonymousClass1N4.class, false);
        C99664Sn.A02(r112, directThreadKey, A05, str5, z3, str6, z4);
        C17850qu A03 = r112.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A01, r3);
        C12810hQ.A02(A03);
    }

    public C20420v4(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
