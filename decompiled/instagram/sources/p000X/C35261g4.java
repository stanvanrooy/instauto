package p000X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.1g4  reason: invalid class name and case insensitive filesystem */
public final class C35261g4 implements Runnable {
    public final /* synthetic */ AnonymousClass1W4 A00;
    public final /* synthetic */ boolean A01;

    public C35261g4(AnonymousClass1W4 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        if (this.A01) {
            AnonymousClass1W4 r3 = this.A00;
            if (r3.A00 != null) {
                List A0M = C17020pY.A00().A0Q(r3.A0M).A0M(false);
                r3.A06.Bfi(A0M, (Reel) null);
                C17020pY.A00().A0M(r3.A0M).A08(A0M);
            }
        } else {
            AnonymousClass1W4 r1 = this.A00;
            r1.A07(r1.A0D);
        }
        this.A00.A0D = false;
    }
}
