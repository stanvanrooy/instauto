package p000X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.C5l */
public final class C5l implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C27255C5j A02;

    public C5l(C27255C5j c5j, Bitmap bitmap, int i) {
        this.A02 = c5j;
        this.A01 = bitmap;
        this.A00 = i;
    }

    public final void run() {
        Iterator it = this.A02.A01.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1176953o r3 = (C1176953o) weakReference.get();
            if (r3 == null) {
                this.A02.A01.remove(weakReference);
            } else {
                r3.AtH(this.A01, this.A00, this.A02.A00);
            }
        }
    }
}
