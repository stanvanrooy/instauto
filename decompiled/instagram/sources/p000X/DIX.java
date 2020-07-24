package p000X;

import android.media.AudioAttributes;

/* renamed from: X.DIX */
public final class DIX {
    public static final DIX A03 = new DIX(new C29955DIf().A00);
    public AudioAttributes A00;
    public final int A01 = 1;
    public final int A02;

    public DIX(int i) {
        this.A02 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DIX dix = (DIX) obj;
            if (!(this.A02 == dix.A02 && this.A01 == dix.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((506447 + this.A02) * 31) + this.A01;
    }
}
