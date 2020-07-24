package p000X;

import com.facebook.C0003R;

/* renamed from: X.ANS */
public final class ANS implements C24154Aj4 {
    public final AnonymousClass0C1 A00;
    public final APU A01;
    public final C23470ANr A02;
    public final AMF A03;
    public final ANV A04;

    public final void A00(boolean z) {
        if (z) {
            AMF amf = this.A03;
            AMH amh = amf.A01;
            if (amh != null) {
                if (amh.A04) {
                    amh.A04 = false;
                    AnonymousClass0ZA.A07(amh.A03, (Object) null);
                    amh.A03 = null;
                }
                C23346AIx aIx = amf.A0G.A07;
                AKZ akz = aIx.A01;
                if (akz != null) {
                    aIx.A03(akz);
                }
                aIx.A01 = null;
                amf.A0H.A0E(false);
                return;
            }
            return;
        }
        AnonymousClass5F9.A00(this.A04.A02, C0003R.string.error);
    }

    public final void Bdu() {
        this.A04.A01 = this;
    }

    public final void destroy() {
        ANV anv = this.A04;
        if (anv.A00 != null) {
            anv.A00 = null;
        }
        this.A02.A03 = null;
    }

    public final void pause() {
        this.A04.A01 = null;
    }

    public ANS(AnonymousClass0C1 r1, ANV anv, AMF amf, C23470ANr aNr, APU apu) {
        this.A00 = r1;
        this.A04 = anv;
        this.A02 = aNr;
        this.A03 = amf;
        aNr.A03 = this;
        this.A01 = apu;
    }
}
