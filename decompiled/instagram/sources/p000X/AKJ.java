package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.AKJ */
public final class AKJ extends instagramComment implements AKX {
    public int A00;
    public int A01;

    public final Integer AP6() {
        if (this.A01 > 1) {
            return Constants.A0N;
        }
        return Constants.A0C;
    }

    public final /* bridge */ /* synthetic */ instagramComment A00() {
        super.A00();
        return this;
    }

    public final void A08() {
        super.A00();
    }

    public AKJ() {
        this.A00 = 2;
    }

    public AKJ(C13300iJ r4, String str) {
        this.A00 = 2;
        this.A01 = 1;
        this.A0D = r4;
        this.commentText = str;
        this.postTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
}
