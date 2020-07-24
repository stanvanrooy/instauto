package p000X;

import com.facebook.rsys.audio.gen.AudioApi;

/* renamed from: X.DJB */
public final class DJB implements DJK {
    public C25134B2l A00 = null;
    public final DJA A01;

    public final void Bg4(C25134B2l b2l) {
        int i;
        if (b2l != this.A00) {
            this.A00 = b2l;
            DJA dja = this.A01;
            if (b2l == null) {
                i = 0;
            } else {
                switch (b2l.ordinal()) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        throw new IllegalArgumentException(AnonymousClass000.A0E("Unhandled audioOutput: ", b2l.name()));
                }
            }
            AudioApi audioApi = dja.A00;
            AnonymousClass0CW.A02(audioApi, "setApi must be called");
            audioApi.setAudioOutputRoute(i);
        }
    }

    public DJB(DJA dja) {
        this.A01 = dja;
    }
}
