package p000X;

import androidx.media.AudioAttributesImplBase;

/* renamed from: X.DGN */
public final class DGN implements DJF {
    public int A00 = 0;
    public int A01 = -1;
    public int A02 = 0;

    public final DGQ A6v() {
        return new AudioAttributesImplBase(this.A00, this.A02, this.A01);
    }

    public final /* bridge */ /* synthetic */ DJF Bgj(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            this.A00 = i;
            return this;
        }
        this.A02 = 0;
        return this;
    }

    public final /* bridge */ /* synthetic */ DJF BiS(int i) {
        if (i != 10) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
    }

    public final /* bridge */ /* synthetic */ DJF BlY(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_BANNER:
            case C120125Dh.VIEW_TYPE_SPINNER:
            case C120125Dh.VIEW_TYPE_BADGE:
            case C120125Dh.VIEW_TYPE_LINK:
            case 15:
                this.A02 = i;
                return this;
            case 16:
                this.A02 = 12;
                return this;
            default:
                this.A02 = 0;
                return this;
        }
    }
}
