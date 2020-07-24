package p000X;

import java.util.Comparator;

/* renamed from: X.AGI */
public final class AGI implements Comparator {
    public final /* synthetic */ AGC A00;

    public AGI(AGC agc) {
        this.A00 = agc;
    }

    public final int compare(Object obj, Object obj2) {
        long j = ((AGJ) obj).A00 - ((AGJ) obj2).A00;
        if (j == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        return 1;
    }
}
