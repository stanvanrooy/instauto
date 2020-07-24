package p000X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1wl  reason: invalid class name and case insensitive filesystem */
public final class C44791wl implements Runnable {
    public final /* synthetic */ C31321Xp A00;
    public final /* synthetic */ ArrayList A01;

    public C44791wl(C31321Xp r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C44781wk r2 = (C44781wk) it.next();
            C31321Xp r5 = this.A00;
            AnonymousClass1ZK r6 = r2.A04;
            int i = r2.A00;
            int i2 = r2.A01;
            int i3 = r2.A02;
            int i4 = r2.A03;
            View view = r6.itemView;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            if (i6 != 0) {
                view.animate().translationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            ViewPropertyAnimator animate = view.animate();
            r5.A05.add(r6);
            animate.setDuration(r5.A02).setListener(new AnonymousClass22G(r5, r6, i5, view, i6, animate)).start();
        }
        this.A01.clear();
        this.A00.A02.remove(this.A01);
    }
}
