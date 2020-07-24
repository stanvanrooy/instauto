package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.1fL  reason: invalid class name and case insensitive filesystem */
public final class C34811fL {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ImageView A04;
    public final C26571Ea A05;

    public final void A00(C123005Pd r10, Runnable runnable) {
        Integer num;
        this.A04.setEnabled(false);
        AnonymousClass7NU r1 = (AnonymousClass7NU) this.A04.getDrawable();
        switch (r10.ordinal()) {
            case 0:
                num = Constants.ONE;
                break;
            case 1:
                num = Constants.A0C;
                break;
            case 2:
                num = Constants.ZERO;
                break;
            default:
                throw new UnsupportedOperationException("bad rsvp state");
        }
        C134245oD r7 = new C134245oD(this, runnable);
        AnonymousClass7NI r6 = r1.A0A;
        AnonymousClass1EG r3 = r6.A04;
        if (((double) AnonymousClass7NK.A00(num)) == r3.A00()) {
            r7.run();
            return;
        }
        r6.A00 = r7;
        r3.A03((double) AnonymousClass7NK.A00(num));
    }

    public C34811fL(C26571Ea r2) {
        this.A05 = r2;
        r2.A03(new C34821fM(this));
    }
}
