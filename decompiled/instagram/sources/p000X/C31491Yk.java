package p000X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.forker.Process;

/* renamed from: X.1Yk  reason: invalid class name and case insensitive filesystem */
public abstract class C31491Yk {
    public int A00 = Process.WAIT_RESULT_TIMEOUT;
    public final Rect A01 = new Rect();
    public final C31391Ya A02;

    public abstract int A01();

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06();

    public abstract int A07();

    public abstract int A08(View view);

    public abstract int A09(View view);

    public abstract int A0A(View view);

    public abstract int A0B(View view);

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract void A0E(int i);

    public static C31491Yk A00(C31391Ya r1, int i) {
        if (i == 0) {
            return new C31501Yl(r1);
        }
        if (i == 1) {
            return new AnonymousClass1ZG(r1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public C31491Yk(C31391Ya r2) {
        this.A02 = r2;
    }
}
