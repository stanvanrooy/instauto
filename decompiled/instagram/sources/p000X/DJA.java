package p000X;

import android.content.Context;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioProxy;

/* renamed from: X.DJA */
public final class DJA extends AudioProxy {
    public AudioApi A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final DJ7 A05;

    public final void setAudioOn(boolean z) {
        if (this.A02 != z) {
            if (z) {
                this.A05.A02();
            } else {
                this.A05.A01();
            }
            AudioApi audioApi = this.A00;
            AnonymousClass0CW.A02(audioApi, "setApi must be called");
            int i = 0;
            if (z) {
                i = 2;
            }
            audioApi.setAudioActivationState(i);
            this.A02 = z;
        }
    }

    public final void setIsCallActive(boolean z) {
        if (z != this.A03) {
            if (!z) {
                this.A04 = false;
                DJ8 dj8 = this.A05.A00;
                dj8.A05 = false;
                dj8.A04 = false;
            }
            this.A03 = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        if (r0 != false) goto L_0x0045;
     */
    public final void setRoute(int i, boolean z) {
        C25134B2l b2l;
        C25134B2l b2l2;
        if (z && i == 1) {
            i = 2;
        }
        if (i != this.A01) {
            boolean z2 = false;
            if (i != 0) {
                z2 = true;
            }
            if (z2) {
                if (i == 1) {
                    b2l2 = C25134B2l.EARPIECE;
                } else if (i == 2) {
                    b2l2 = C25134B2l.SPEAKERPHONE;
                } else if (i == 3) {
                    b2l2 = C25134B2l.HEADSET;
                } else if (i == 4) {
                    b2l2 = C25134B2l.BLUETOOTH;
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A05("audioRoute=", i));
                }
                this.A05.A00.A02(b2l2);
            }
            this.A01 = i;
        }
        if (this.A03 && z != this.A04) {
            DJ7 dj7 = this.A05;
            C25134B2l b2l3 = dj7.A01.A01;
            C25134B2l b2l4 = C25134B2l.SPEAKERPHONE;
            boolean z3 = false;
            if (b2l3 == b2l4) {
                z3 = true;
            }
            if (!z3) {
                boolean z4 = false;
                if (b2l3 == C25134B2l.EARPIECE) {
                    z4 = true;
                }
            }
            if (z) {
                DJ8 dj8 = dj7.A00;
                dj8.A02(b2l4);
                dj8.A05 = true;
            } else {
                DJ8 dj82 = dj7.A00;
                if (dj82.A04) {
                    b2l = C25134B2l.HEADSET;
                } else {
                    b2l = C25134B2l.EARPIECE;
                }
                dj82.A02(b2l);
                dj82.A05 = false;
            }
            dj7.A01.A05 = z;
            this.A04 = z;
        }
    }

    public DJA(Context context, C2096691k r4) {
        this.A05 = DJ7.A00(context, new DJB(this), r4, new DJN());
    }

    public final void setApi(AudioApi audioApi) {
        AnonymousClass0CW.A01(audioApi);
        this.A00 = audioApi;
    }
}
