package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYG */
public abstract class AYG {
    public int A00;
    public AXA A01;
    public AYX A02;
    public AZK A03;
    public Exception A04;
    public Integer A05 = Constants.ZERO;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final Handler A0D = new Handler(Looper.getMainLooper());
    public final AZi A0E;
    public final C23708AYw A0F;
    public final C23673AXk A0G;
    public final String A0H = getClass().getSimpleName();
    public final String A0I;

    public void A08() {
        this.A09 = false;
        if (!this.A0A) {
            this.A0A = true;
            AZK azk = this.A03;
            if (azk != null) {
                AZK.A05(azk, new C23696AYh(azk), (AWN) null);
            } else {
                A00(this);
            }
        }
    }

    public static void A00(AYG ayg) {
        AZK azk = ayg.A03;
        if (azk != null) {
            azk.A00 = null;
            ayg.A03 = null;
        }
        if (ayg.A05 != Constants.A0Y) {
            ayg.A05 = Constants.A0N;
            AnonymousClass0ZA.A0E(ayg.A0D, new C23689AYa(ayg), 210060807);
            return;
        }
        AnonymousClass0ZA.A0E(ayg.A0D, new AYW(ayg, ayg.A04), 745745886);
    }

    public final void A03() {
        if (this.A03 != null) {
            A01(this);
        }
    }

    public final void A04(int i, int i2, AWZ awz) {
        AZK azk = this.A03;
        if (azk != null) {
            AZK.A05(azk, new AZL(azk, new AXC(this, i, i2, awz), i, i2), (AWN) null);
        } else {
            AWZ.A00(awz, new IllegalStateException("RtcConnection is not initialized yet."));
        }
    }

    public final void A05(AWN awn) {
        AZK azk = this.A03;
        if (azk == null) {
            AWN.A01(awn, new IllegalStateException("RtcConnection is not initialized yet."));
            return;
        }
        AYB ayb = new AYB(this, azk, awn);
        AXA axa = this.A01;
        if (axa != null) {
            axa.A01 = true;
            AXB axb = new AXB(axa, ayb);
            Looper looper = axa.A00;
            if (looper == null) {
                axb.run();
            } else {
                AnonymousClass0ZA.A0F(new Handler(looper), axb, 355948544);
            }
            this.A01 = null;
            return;
        }
        AWN.A00(ayb);
    }

    public final void A06(String str, Object obj) {
        AZK azk = this.A03;
        if (azk == null) {
            return;
        }
        if (obj instanceof C208648xX) {
            AZK.A05(azk, new AZ0(azk, str, obj), (AWN) null);
            return;
        }
        throw new IllegalArgumentException("Renderer is not supported by this media stream.");
    }

    public final void A07(String str, Object obj) {
        AZK azk = this.A03;
        if (azk == null) {
            return;
        }
        if (obj instanceof C208648xX) {
            AZK.A05(azk, new C23709AYz(azk, str, obj), (AWN) null);
            return;
        }
        throw new IllegalArgumentException("Renderer is not supported by this media stream.");
    }

    public void A09() {
        boolean z = false;
        if (this.A03 == null) {
            z = true;
        }
        AnonymousClass0a4.A0C(z, "Can only start Session once.");
        this.A0F.createRtcConnection(this.A0C, this.A0I, this.A0E, new AYH(this));
    }

    public void A0A(AZM azm, int i) {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        AnonymousClass0ZA.A0E(this.A0D, new AYT(this, azm, i2), 2107768418);
    }

    public void A0B(AZM azm, int i) {
        int i2 = this.A00 - 1;
        this.A00 = i2;
        AnonymousClass0ZA.A0E(this.A0D, new AYU(this, azm, i2), 1763296683);
    }

    public AYG(Context context, String str, AYX ayx, C23673AXk aXk, C23708AYw aYw, AZi aZi) {
        this.A0C = context.getApplicationContext();
        this.A0I = str;
        this.A0F = aYw;
        this.A0E = aZi;
        this.A02 = ayx;
        AnonymousClass0a4.A06(aXk);
        this.A0G = aXk;
        this.A05 = Constants.ZERO;
    }

    public static void A01(AYG ayg) {
        String str;
        C12670hC.A02();
        if (ayg.A08 || ayg.A03 == null || (!ayg.A0B && ayg.A07)) {
            ayg.A09 = true;
            DLog.m40d(DLogTag.RTC, "renegotiate - scheduled", new Object[0]);
            return;
        }
        DLogTag dLogTag = DLogTag.RTC;
        Object[] objArr = new Object[1];
        if (ayg.A07) {
            str = "restart";
        } else {
            str = "new";
        }
        objArr[0] = str;
        DLog.m40d(dLogTag, "renegotiate - %s", objArr);
        ayg.A08 = true;
        ayg.A09 = false;
        ayg.A05 = Constants.ONE;
        AZK azk = ayg.A03;
        AZK.A05(azk, new AZ5(azk), (AWN) null);
    }
}
