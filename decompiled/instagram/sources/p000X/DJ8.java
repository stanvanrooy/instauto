package p000X;

import android.media.AudioManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.DJ8 */
public final class DJ8 {
    public int A00 = -2;
    public C25134B2l A01 = C25134B2l.EARPIECE;
    public DJK A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06;
    public final AudioManager A07;
    public final C11710fQ A08 = new C11710fQ();
    public final DJC A09;
    public final B2k A0A;
    public final C2096691k A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != 4) goto L_0x0018;
     */
    public final void A02(C25134B2l b2l) {
        A01(this, 3);
        int i = C25135B2m.A00[b2l.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    DJC djc = this.A09;
                    if (djc.A02.AeR()) {
                        djc.A02.BrW(false);
                    }
                    this.A07.setSpeakerphoneOn(true);
                    this.A06 = true;
                }
            } else if (!this.A04 && this.A03) {
                return;
            }
            DJC djc2 = this.A09;
            if (djc2.A02.AeR()) {
                djc2.A02.BrW(false);
            }
            this.A07.setSpeakerphoneOn(false);
            this.A06 = false;
        } else {
            DJC djc3 = this.A09;
            if (djc3.A02.AeQ() && !djc3.A02.AeR()) {
                djc3.A02.BrW(true);
            }
        }
        A00(this);
    }

    public static void A00(DJ8 dj8) {
        C25134B2l b2l;
        if (dj8.A09.A02.AeR()) {
            b2l = C25134B2l.BLUETOOTH;
        } else if (dj8.A06) {
            b2l = C25134B2l.SPEAKERPHONE;
        } else if (dj8.A04) {
            b2l = C25134B2l.HEADSET;
        } else {
            b2l = C25134B2l.EARPIECE;
        }
        dj8.A01 = b2l;
        Iterator it = new ArrayList(dj8.A08).iterator();
        while (it.hasNext()) {
            it.next();
        }
        dj8.A02.Bg4(dj8.A0A.A00());
        dj8.A07.getStreamVolume(0);
        dj8.A07.getStreamMaxVolume(0);
    }

    public static void A01(DJ8 dj8, int i) {
        try {
            int mode = dj8.A07.getMode();
            dj8.A07.setMode(i);
            if (dj8.A00 == -2) {
                dj8.A00 = mode;
            }
        } catch (Exception unused) {
        }
    }

    public DJ8(C2096691k r3, AudioManager audioManager, B2k b2k, DJC djc) {
        this.A0B = r3;
        this.A07 = audioManager;
        this.A0A = b2k;
        this.A09 = djc;
    }
}
