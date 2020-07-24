package p000X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1r3  reason: invalid class name and case insensitive filesystem */
public final class C41861r3 implements Runnable {
    public final /* synthetic */ C31321Xp A00;
    public final /* synthetic */ ArrayList A01;

    public C41861r3(C31321Xp r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1ZK r6 = (AnonymousClass1ZK) it.next();
            C31321Xp r5 = this.A00;
            View view = r6.itemView;
            ViewPropertyAnimator animate = view.animate();
            r5.A03.add(r6);
            animate.alpha(1.0f).setDuration(r5.A00).setListener(new C41871r4(r5, r6, view, animate)).start();
        }
        this.A01.clear();
        this.A00.A00.remove(this.A01);
    }
}
