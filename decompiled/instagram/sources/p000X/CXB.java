package p000X;

import java.lang.ref.WeakReference;

/* renamed from: X.CXB */
public final class CXB {
    public int A00;
    public int A01;
    public C27934CWw A02;
    public WeakReference A03;

    public final void A00(CXG cxg) {
        WeakReference weakReference;
        if (cxg != null) {
            weakReference = new WeakReference(cxg);
        } else {
            weakReference = null;
        }
        this.A03 = weakReference;
        C27934CWw cWw = this.A02;
        if (cWw != null) {
            cWw.A02 = weakReference;
            cWw.A01.addListener(cWw.A00);
            cWw.onAnimationUpdate(cWw.A01);
        }
    }
}
