package p000X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Xp  reason: invalid class name and case insensitive filesystem */
public class C31321Xp extends C31331Xq {
    public static TimeInterpolator A0B;
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A = new ArrayList();

    public boolean A0V(AnonymousClass1ZK r9, int i, int i2, int i3, int i4) {
        AnonymousClass1ZK r3 = r9;
        View view = r9.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) r9.itemView.getTranslationY());
        A00(r9);
        int i5 = i3;
        int i6 = i3 - translationX;
        int i7 = i4;
        int i8 = i4 - translationY;
        if (i6 == 0 && i8 == 0) {
            A0R(r9);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i8 != 0) {
            view.setTranslationY((float) (-i8));
        }
        this.A09.add(new C44781wk(r3, translationX, translationY, i5, i7));
        return true;
    }

    public boolean A0W(AnonymousClass1ZK r13, AnonymousClass1ZK r14, int i, int i2, int i3, int i4) {
        AnonymousClass1ZK r7 = r14;
        AnonymousClass1ZK r6 = r13;
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        int i8 = i3;
        if (r13 == r14) {
            return A0V(r13, i, i6, i8, i7);
        }
        float translationX = r13.itemView.getTranslationX();
        float translationY = r13.itemView.getTranslationY();
        float alpha = r13.itemView.getAlpha();
        A00(r13);
        int i9 = (int) (((float) (i3 - i)) - translationX);
        int i10 = (int) (((float) (i4 - i2)) - translationY);
        r13.itemView.setTranslationX(translationX);
        r13.itemView.setTranslationY(translationY);
        r13.itemView.setAlpha(alpha);
        if (r14 != null) {
            A00(r14);
            r14.itemView.setTranslationX((float) (-i9));
            r14.itemView.setTranslationY((float) (-i10));
            r14.itemView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        this.A08.add(new C226179oQ(r6, r7, i5, i6, i8, i7));
        return true;
    }

    private void A00(AnonymousClass1ZK r3) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        r3.itemView.animate().setInterpolator(A0B);
        A0A(r3);
    }

    private boolean A03(C226179oQ r5, AnonymousClass1ZK r6) {
        if (r5.A04 == r6) {
            r5.A04 = null;
        } else if (r5.A05 != r6) {
            return false;
        } else {
            r5.A05 = null;
        }
        r6.itemView.setAlpha(1.0f);
        r6.itemView.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        r6.itemView.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0Q(r6);
        return true;
    }

    public final void A09() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C44781wk r1 = (C44781wk) this.A09.get(size);
            View view = r1.A04.itemView;
            view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0R(r1.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0S((AnonymousClass1ZK) this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AnonymousClass1ZK r12 = (AnonymousClass1ZK) this.A07.get(size3);
            r12.itemView.setAlpha(1.0f);
            A0P(r12);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            C226179oQ r13 = (C226179oQ) this.A08.get(size4);
            AnonymousClass1ZK r0 = r13.A05;
            if (r0 != null) {
                A03(r13, r0);
            }
            AnonymousClass1ZK r02 = r13.A04;
            if (r02 != null) {
                A03(r13, r02);
            }
        }
        this.A08.clear();
        if (A0B()) {
            for (int size5 = this.A02.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.A02.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C44781wk r14 = (C44781wk) arrayList.get(size6);
                    View view2 = r14.A04.itemView;
                    view2.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    view2.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    A0R(r14.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A02.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A00.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.A00.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AnonymousClass1ZK r15 = (AnonymousClass1ZK) arrayList2.get(size8);
                    r15.itemView.setAlpha(1.0f);
                    A0P(r15);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A00.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A01.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.A01.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    C226179oQ r16 = (C226179oQ) arrayList3.get(size10);
                    AnonymousClass1ZK r03 = r16.A05;
                    if (r03 != null) {
                        A03(r16, r03);
                    }
                    AnonymousClass1ZK r04 = r16.A04;
                    if (r04 != null) {
                        A03(r16, r04);
                    }
                    if (arrayList3.isEmpty()) {
                        this.A01.remove(arrayList3);
                    }
                }
            }
            A01(this.A06);
            A01(this.A05);
            A01(this.A03);
            A01(this.A04);
            A08();
        }
    }

    public final void A0A(AnonymousClass1ZK r8) {
        View view = r8.itemView;
        view.animate().cancel();
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            if (((C44781wk) this.A09.get(size)).A04 == r8) {
                view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A0R(r8);
                this.A09.remove(size);
            }
        }
        A02(this.A08, r8);
        if (this.A0A.remove(r8)) {
            view.setAlpha(1.0f);
            A0S(r8);
        }
        if (this.A07.remove(r8)) {
            view.setAlpha(1.0f);
            A0P(r8);
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.A01.get(size2);
            A02(arrayList, r8);
            if (arrayList.isEmpty()) {
                this.A01.remove(size2);
            }
        }
        for (int size3 = this.A02.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.A02.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C44781wk) arrayList2.get(size4)).A04 == r8) {
                    view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    A0R(r8);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.A02.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.A00.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.A00.get(size5);
            if (arrayList3.remove(r8)) {
                view.setAlpha(1.0f);
                A0P(r8);
                if (arrayList3.isEmpty()) {
                    this.A00.remove(size5);
                }
            }
        }
        this.A06.remove(r8);
        this.A03.remove(r8);
        this.A04.remove(r8);
        this.A05.remove(r8);
        A0X();
    }

    public final boolean A0B() {
        if (!this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A0A.isEmpty() || !this.A05.isEmpty() || !this.A06.isEmpty() || !this.A03.isEmpty() || !this.A04.isEmpty() || !this.A02.isEmpty() || !this.A00.isEmpty() || !this.A01.isEmpty()) {
            return true;
        }
        return false;
    }

    public void A0I() {
        long j;
        long j2;
        boolean z = !this.A0A.isEmpty();
        boolean z2 = !this.A09.isEmpty();
        boolean z3 = !this.A08.isEmpty();
        boolean z4 = !this.A07.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                AnonymousClass1ZK r5 = (AnonymousClass1ZK) it.next();
                View view = r5.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.A06.add(r5);
                animate.setDuration(this.A03).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setListener(new C43321uD(this, r5, animate, view)).start();
            }
            this.A0A.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.A09);
                this.A02.add(arrayList);
                this.A09.clear();
                C44791wl r3 = new C44791wl(this, arrayList);
                if (z) {
                    ((C44781wk) arrayList.get(0)).A04.itemView.postOnAnimationDelayed(r3, this.A03);
                } else {
                    r3.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.A08);
                this.A01.add(arrayList2);
                this.A08.clear();
                C226189oR r32 = new C226189oR(this, arrayList2);
                if (z) {
                    ((C226179oQ) arrayList2.get(0)).A05.itemView.postOnAnimationDelayed(r32, this.A03);
                } else {
                    r32.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.A07);
                this.A00.add(arrayList3);
                this.A07.clear();
                C41861r3 r6 = new C41861r3(this, arrayList3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = this.A03;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.A02;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.A01;
                    }
                    ((AnonymousClass1ZK) arrayList3.get(0)).itemView.postOnAnimationDelayed(r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    public static final void A01(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((AnonymousClass1ZK) list.get(size)).itemView.animate().cancel();
        }
    }

    private void A02(List list, AnonymousClass1ZK r5) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C226179oQ r1 = (C226179oQ) list.get(size);
            if (A03(r1, r5) && r1.A05 == null && r1.A04 == null) {
                list.remove(r1);
            }
        }
    }

    public final boolean A0H(AnonymousClass1ZK r3, List list) {
        if (!list.isEmpty() || super.A0H(r3, list)) {
            return true;
        }
        return false;
    }

    public boolean A0T(AnonymousClass1ZK r3) {
        A00(r3);
        r3.itemView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A07.add(r3);
        return true;
    }

    public boolean A0U(AnonymousClass1ZK r2) {
        A00(r2);
        this.A0A.add(r2);
        return true;
    }

    public final void A0X() {
        if (!A0B()) {
            A08();
        }
    }
}
