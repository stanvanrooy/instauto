package p000X;

import android.os.Looper;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AWQ */
public final class AWQ {
    public int A00;
    public int A01;
    public Surface A02;
    public AnonymousClass3V5 A03;
    public AnonymousClass8HL A04;
    public AWU A05;
    public final C87023q3 A06;
    public final AWR A07;
    public final Map A08;

    public static void A00(AWQ awq) {
        for (C78783cJ A082 : awq.A08.values()) {
            awq.A06.A08(A082);
        }
        awq.A08.clear();
        C12670hC.A04(new AWT(awq.A05));
    }

    public static void A01(AWQ awq) {
        int i;
        int i2;
        AnonymousClass8HL r3 = awq.A04;
        if (r3 != null) {
            r3.A04(awq.A02, awq.A01, awq.A00);
            return;
        }
        Surface surface = awq.A02;
        if (surface != null && (i = awq.A01) > 0 && (i2 = awq.A00) > 0) {
            AnonymousClass8HL r1 = new AnonymousClass8HL(surface, i, i2);
            awq.A04 = r1;
            awq.A06.A07(r1);
        }
    }

    public final void A02() {
        AWR awr = this.A07;
        AnonymousClass0ZA.A05(awr, awr.obtainMessage(5));
    }

    public final void A03() {
        AWR awr = this.A07;
        AnonymousClass0ZA.A05(awr, awr.obtainMessage(4));
    }

    public final void A04(int i, int i2) {
        this.A07.obtainMessage(6, i, i2, (Object) null).sendToTarget();
    }

    public AWQ(Looper looper, C87023q3 r4) {
        AnonymousClass0a4.A0C(r4 != null, "Must provide a effect facade for this renderer");
        this.A07 = new AWR(this, looper);
        this.A06 = r4;
        this.A08 = new HashMap();
    }
}
