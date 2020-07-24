package p000X;

import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.iabeventlogging.model.IABWebviewEndEvent;
import java.util.ArrayList;

/* renamed from: X.AQA */
public final class AQA {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = -1;
    public int A05 = -1;
    public long A06 = -1;
    public long A07 = 0;
    public long A08 = -1;
    public long A09 = -1;
    public long A0A = -1;
    public long A0B = -1;
    public long A0C = -1;
    public long A0D = -1;
    public long A0E = -1;
    public long A0F = -1;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public final C04130Co A0P;
    public final ArrayList A0Q;
    public final boolean A0R;

    public final IABEvent A00() {
        if (!this.A0R) {
            return IABEvent.A04;
        }
        return new IABLaunchEvent(this.A0K, this.A06, this.A0P.now(), this.A0M, this.A0D, this.A0G, this.A07);
    }

    public final IABEvent A01() {
        if (!this.A0R) {
            return IABEvent.A04;
        }
        String str = this.A0K;
        long j = this.A0B;
        long now = this.A0P.now();
        long j2 = this.A0D;
        long j3 = this.A0E;
        long j4 = this.A06;
        long j5 = this.A0C;
        long j6 = this.A08;
        long j7 = this.A09;
        long j8 = this.A0A;
        ArrayList arrayList = this.A0Q;
        String str2 = this.A0M;
        String str3 = this.A0L;
        String str4 = this.A0G;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A03;
        int i4 = this.A01;
        String str5 = this.A0H;
        boolean z = false;
        if (str5 != null) {
            z = true;
        }
        return new IABWebviewEndEvent(str, j, now, j2, j3, j4, j5, j6, j7, j8, arrayList, str2, str3, str4, i, i2, i3, i4, z, str5, this.A0O, this.A0F, this.A0N, this.A0I, this.A0J);
    }

    public AQA(boolean z, C04130Co r6) {
        this.A0R = z;
        this.A0P = r6;
        this.A0Q = new ArrayList();
    }
}
