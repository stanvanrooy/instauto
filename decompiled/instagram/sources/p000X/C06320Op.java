package p000X;

import android.view.MotionEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Op  reason: invalid class name and case insensitive filesystem */
public final class C06320Op implements AnonymousClass0RU, C06570Po, C06580Pp {
    public AnonymousClass0RU A00 = null;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final List A03 = new ArrayList();
    public final Object A04 = new Object();

    public final String AS0() {
        return null;
    }

    public final String AS1() {
        return null;
    }

    public final boolean AfM(AnonymousClass0P4 r2) {
        return true;
    }

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    private void A00(AnonymousClass0P4 r4, Integer num) {
        synchronized (this.A04) {
            AnonymousClass0RU r1 = this.A00;
            if (r1 == null) {
                if (num.equals(Constants.ONE)) {
                    this.A03.add(r4);
                } else {
                    this.A01.add(r4);
                }
            } else if (num.equals(Constants.ONE)) {
                r1.BdB(r4);
            } else {
                r1.BcG(r4);
            }
        }
    }

    public final void A01() {
        synchronized (this.A04) {
            if (this.A00 != null) {
                for (AnonymousClass0P4 BdB : this.A03) {
                    this.A00.BdB(BdB);
                }
                for (AnonymousClass0P4 BcG : this.A01) {
                    this.A00.BcG(BcG);
                }
                for (MotionEvent Bck : this.A02) {
                    this.A00.Bck(Bck);
                }
                this.A03.clear();
                this.A01.clear();
                this.A02.clear();
                AnonymousClass0RU r1 = this.A00;
                if (r1 instanceof C06320Op) {
                    ((C06320Op) r1).A01();
                }
            }
        }
    }

    public final void A02(AnonymousClass0RU r4) {
        synchronized (this.A04) {
            if (r4 != this) {
                AnonymousClass0RU r1 = this.A00;
                if (r4 != r1) {
                    if (r1 == null) {
                        this.A00 = r4;
                    } else if (r1 instanceof C06320Op) {
                        ((C06320Op) r1).A02(r4);
                    } else {
                        throw new IllegalStateException("Should not set the concrete proxied logger more than once");
                    }
                }
            }
        }
    }

    public final void Ba2(TextView textView) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final void Bc9(long j) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final void BcG(AnonymousClass0P4 r2) {
        A00(r2, Constants.ZERO);
    }

    public final void BcM() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final void BcN() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final void Bck(MotionEvent motionEvent) {
        synchronized (this.A04) {
            AnonymousClass0RU r0 = this.A00;
            if (r0 == null) {
                this.A02.add(motionEvent);
            } else {
                r0.Bck(motionEvent);
            }
        }
    }

    public final void BdB(AnonymousClass0P4 r2) {
        A00(r2, Constants.ONE);
    }

    public final void BsB(TextView textView) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
