package p000X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.AL1 */
public final class AL1 {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public final AnonymousClass0C1 A04;
    public final AnonymousClass0RN A05;
    public final C13920jT A06;

    public static AnonymousClass0P4 A00(AL1 al1, Integer num) {
        String str;
        C13920jT r3 = al1.A06;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("live_with_invite_waterfall", al1.A05);
        C13930jU.A02(r3, A002);
        switch (num.intValue()) {
            case 1:
                str = "invite_accepted";
                break;
            case 2:
                str = "invite_rejected";
                break;
            default:
                str = "invite_received";
                break;
        }
        A002.A0G("step", str);
        A002.A0G("a_pk", al1.A02);
        A002.A0G(TraceFieldType.BroadcastId, al1.A01);
        A002.A0G("m_pk", al1.A03);
        return A002;
    }

    public final void A01(Integer num) {
        double elapsedRealtime;
        AnonymousClass0P4 A002 = A00(this, Constants.ONE);
        A002.A0G("invite_type", ALR.A00(num));
        Long l = this.A00;
        if (l == null) {
            elapsedRealtime = Double.MAX_VALUE;
        } else {
            elapsedRealtime = ((double) (SystemClock.elapsedRealtime() - l.longValue())) / 1000.0d;
        }
        A002.A0C("respond_time", Double.valueOf(elapsedRealtime));
        AnonymousClass0WN.A01(this.A04).BcG(A002);
    }

    public final void A02(Integer num) {
        double elapsedRealtime;
        AnonymousClass0P4 A002 = A00(this, Constants.A0C);
        A002.A0G("invite_type", ALR.A00(num));
        Long l = this.A00;
        if (l == null) {
            elapsedRealtime = Double.MAX_VALUE;
        } else {
            elapsedRealtime = ((double) (SystemClock.elapsedRealtime() - l.longValue())) / 1000.0d;
        }
        A002.A0C("respond_time", Double.valueOf(elapsedRealtime));
        AnonymousClass0WN.A01(this.A04).BcG(A002);
    }

    public AL1(AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        this.A05 = r3;
        this.A04 = r2;
        C13920jT A012 = C13920jT.A01(getClass().getName(), r3);
        this.A06 = A012;
        A012.A08();
    }
}
