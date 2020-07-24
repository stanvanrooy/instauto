package p000X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.AXY */
public final class AXY {
    public String A00;
    public String A01;
    public int A02;
    public final Context A03;
    public final AnonymousClass1L8 A04;
    public final AnonymousClass0C1 A05;

    public final void A01(String str, long j, String str2, AY7 ay7, AWN awn) {
        int i = this.A02 + 1;
        this.A02 = i;
        AnonymousClass0C1 r0 = this.A05;
        String name = ay7.name();
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.ONE;
        r2.A0E("live/%s/broadcast_event/", str);
        r2.A09("event_type", name);
        r2.A09("offset_to_video_start", Long.toString(j / 1000));
        r2.A09("client_version", Integer.toString(i));
        r2.A09("event_user_id", str2);
        r2.A06(AnonymousClass1N4.class, true);
        r2.A0G = true;
        C17850qu A032 = r2.A03();
        A032.A00 = new C23625AUm(this);
        A032.A00 = new AXX(this, "Broadcast Event", awn);
        C12810hQ.A02(A032);
    }

    public final void A02(String str, Integer num, Integer num2, AWN awn) {
        String str2;
        AnonymousClass0C1 r2 = this.A05;
        String str3 = this.A01;
        if (1 - num.intValue() != 0) {
            str2 = "LEAVE_BROADCAST";
        } else {
            str2 = "DECLINE_INVITE";
        }
        String lowerCase = str2.toLowerCase(Locale.ENGLISH);
        C15890nh r3 = new C15890nh(r2);
        r3.A09 = Constants.ONE;
        r3.A0E("live/%s/leave/", str);
        r3.A09("encoded_server_data_info", str3);
        r3.A09("reason", lowerCase);
        r3.A06(AnonymousClass1N4.class, true);
        if (num2 != null) {
            r3.A09("num_participants", Integer.toString(num2.intValue()));
        }
        r3.A0G = true;
        C17850qu A032 = r3.A03();
        A032.A00 = new AXX(this, "Leaving Broadcast", awn);
        C28351Lj.A00(this.A03, this.A04, A032);
    }

    public AXY(Context context, AnonymousClass1L8 r3, AnonymousClass0C1 r4) {
        this.A03 = context.getApplicationContext();
        this.A04 = r3;
        this.A05 = r4;
    }

    public static /* synthetic */ C23775Ab1 A00(String str, C43791v5 r5) {
        Integer num;
        C23775Ab1 A012 = C23770Aaw.A01(r5);
        if (r5.A03()) {
            num = Integer.valueOf(((C28691Ms) r5.A00).mStatusCode);
        } else {
            num = null;
        }
        AnonymousClass0DB.A0D("LiveWithApi", C06360Ot.formatString("%s Failure (%d): %s", str, num, A012));
        return A012;
    }
}
