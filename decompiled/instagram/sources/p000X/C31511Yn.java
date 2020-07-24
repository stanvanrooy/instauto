package p000X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Yn  reason: invalid class name and case insensitive filesystem */
public class C31511Yn extends C31331Xq {
    public TimeInterpolator A00;
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
    public ArrayList A0B = new ArrayList();

    public boolean A0V(AnonymousClass1ZK r9, int i, int i2, int i3, int i4) {
        AnonymousClass1ZK r3 = r9;
        View view = r9.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) r9.itemView.getTranslationY());
        A0a(r9);
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
        this.A08.add(new C61502lu(r3, translationX, translationY, i5, i7));
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
        A0a(r13);
        int i9 = (int) (((float) (i3 - i)) - translationX);
        int i10 = (int) (((float) (i4 - i2)) - translationY);
        r13.itemView.setTranslationX(translationX);
        r13.itemView.setTranslationY(translationY);
        r13.itemView.setAlpha(alpha);
        if (r14 != null) {
            A0a(r14);
            r14.itemView.setTranslationX((float) (-i9));
            r14.itemView.setTranslationY((float) (-i10));
            r14.itemView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        this.A07.add(new C226169oP(r6, r7, i5, i6, i8, i7));
        return true;
    }

    public void A0b(AnonymousClass1ZK r9, int i, int i2, int i3, int i4) {
        AnonymousClass1ZK r3 = r9;
        View view = r9.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        if (i6 != 0) {
            view.animate().translationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        ViewPropertyAnimator animate = view.animate();
        this.A05.add(r9);
        animate.setDuration(this.A02).setListener(new C226119oK(this, r3, i5, view, i6, animate)).start();
    }

    private boolean A02(C226169oP r5, AnonymousClass1ZK r6) {
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

    public void A09() {
        for (int size = this.A08.size() - 1; size >= 0; size--) {
            C61502lu r1 = (C61502lu) this.A08.get(size);
            View view = r1.A04.itemView;
            view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0R(r1.A04);
            this.A08.remove(size);
        }
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            A0S((AnonymousClass1ZK) this.A09.get(size2));
            this.A09.remove(size2);
        }
        for (int size3 = this.A0B.size() - 1; size3 >= 0; size3--) {
            AnonymousClass1ZK r12 = (AnonymousClass1ZK) this.A0B.get(size3);
            r12.itemView.setAlpha(1.0f);
            A0P(r12);
            this.A0B.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            C226169oP r13 = (C226169oP) this.A07.get(size4);
            AnonymousClass1ZK r0 = r13.A05;
            if (r0 != null) {
                A02(r13, r0);
            }
            AnonymousClass1ZK r02 = r13.A04;
            if (r02 != null) {
                A02(r13, r02);
            }
        }
        this.A07.clear();
        if (A0B()) {
            for (int size5 = this.A06.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.A06.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C61502lu r14 = (C61502lu) arrayList.get(size6);
                    View view2 = r14.A04.itemView;
                    view2.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    view2.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    A0R(r14.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A06.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A02.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.A02.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AnonymousClass1ZK r15 = (AnonymousClass1ZK) arrayList2.get(size8);
                    r15.itemView.setAlpha(1.0f);
                    A0P(r15);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A02.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A04.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.A04.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    C226169oP r16 = (C226169oP) arrayList3.get(size10);
                    AnonymousClass1ZK r03 = r16.A05;
                    if (r03 != null) {
                        A02(r16, r03);
                    }
                    AnonymousClass1ZK r04 = r16.A04;
                    if (r04 != null) {
                        A02(r16, r04);
                    }
                    if (arrayList3.isEmpty()) {
                        this.A04.remove(arrayList3);
                    }
                }
            }
            A00(this.A0A);
            A00(this.A05);
            A00(this.A01);
            A00(this.A03);
            A08();
        }
    }

    public void A0A(AnonymousClass1ZK r8) {
        View view = r8.itemView;
        view.animate().cancel();
        for (int size = this.A08.size() - 1; size >= 0; size--) {
            if (((C61502lu) this.A08.get(size)).A04 == r8) {
                view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A0R(r8);
                this.A08.remove(size);
            }
        }
        A01(this.A07, r8);
        if (this.A09.remove(r8)) {
            view.setAlpha(1.0f);
            A0S(r8);
        }
        if (this.A0B.remove(r8)) {
            view.setAlpha(1.0f);
            A0P(r8);
        }
        for (int size2 = this.A04.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.A04.get(size2);
            A01(arrayList, r8);
            if (arrayList.isEmpty()) {
                this.A04.remove(size2);
            }
        }
        for (int size3 = this.A06.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.A06.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C61502lu) arrayList2.get(size4)).A04 == r8) {
                    view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    A0R(r8);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.A06.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.A02.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.A02.get(size5);
            if (arrayList3.remove(r8)) {
                view.setAlpha(1.0f);
                A0P(r8);
                if (arrayList3.isEmpty()) {
                    this.A02.remove(size5);
                }
            }
        }
        this.A0A.remove(r8);
        this.A01.remove(r8);
        this.A03.remove(r8);
        this.A05.remove(r8);
        A0X();
    }

    public boolean A0B() {
        if (!this.A0B.isEmpty() || !this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A05.isEmpty() || !this.A0A.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty() || !this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty()) {
            return true;
        }
        return false;
    }

    public void A0I() {
        long j;
        long j2;
        boolean z = !this.A09.isEmpty();
        boolean z2 = !this.A08.isEmpty();
        boolean z3 = !this.A07.isEmpty();
        boolean z4 = !this.A0B.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                A0Z((AnonymousClass1ZK) it.next());
            }
            this.A09.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.A08);
                this.A06.add(arrayList);
                this.A08.clear();
                C226259oY r3 = new C226259oY(this, arrayList);
                if (z) {
                    ((C61502lu) arrayList.get(0)).A04.itemView.postOnAnimationDelayed(r3, this.A03);
                } else {
                    r3.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.A07);
                this.A04.add(arrayList2);
                this.A07.clear();
                C226159oO r32 = new C226159oO(this, arrayList2);
                if (z) {
                    ((C226169oP) arrayList2.get(0)).A05.itemView.postOnAnimationDelayed(r32, this.A03);
                } else {
                    r32.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.A0B);
                this.A02.add(arrayList3);
                this.A0B.clear();
                C111274qh r6 = new C111274qh(this, arrayList3);
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

    public void A0Y(AnonymousClass1ZK r6) {
        View view = r6.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A01.add(r6);
        animate.alpha(1.0f).setDuration(this.A00).setListener(new C226129oL(this, r6, view, animate)).start();
    }

    public final void A0Z(AnonymousClass1ZK r5) {
        View view = r5.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A0A.add(r5);
        animate.setDuration(this.A03).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setListener(new C226109oJ(this, r5, animate, view)).start();
    }

    public final void A0a(AnonymousClass1ZK r3) {
        if (this.A00 == null) {
            this.A00 = new ValueAnimator().getInterpolator();
        }
        r3.itemView.animate().setInterpolator(this.A00);
        A0A(r3);
    }

    public final void A0c(C226169oP r7) {
        View view;
        AnonymousClass1ZK r0 = r7.A05;
        View view2 = null;
        if (r0 == null) {
            view = null;
        } else {
            view = r0.itemView;
        }
        AnonymousClass1ZK r02 = r7.A04;
        if (r02 != null) {
            view2 = r02.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(this.A01);
            this.A03.add(r7.A05);
            duration.translationX((float) (r7.A02 - r7.A00));
            duration.translationY((float) (r7.A03 - r7.A01));
            duration.alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setListener(new C226139oM(this, r7, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.A03.add(r7.A04);
            animate.translationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).translationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(this.A01).alpha(1.0f).setListener(new C226149oN(this, r7, animate, view2)).start();
        }
    }

    public static final void A00(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((AnonymousClass1ZK) list.get(size)).itemView.animate().cancel();
        }
    }

    private void A01(List list, AnonymousClass1ZK r5) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C226169oP r1 = (C226169oP) list.get(size);
            if (A02(r1, r5) && r1.A05 == null && r1.A04 == null) {
                list.remove(r1);
            }
        }
    }

    public boolean A0H(AnonymousClass1ZK r3, List list) {
        if (!list.isEmpty() || super.A0H(r3, list)) {
            return true;
        }
        return false;
    }

    public boolean A0T(AnonymousClass1ZK r3) {
        A0a(r3);
        r3.itemView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0B.add(r3);
        return true;
    }

    public boolean A0U(AnonymousClass1ZK r2) {
        A0a(r2);
        this.A09.add(r2);
        return true;
    }

    public final void A0X() {
        if (!A0B()) {
            A08();
        }
    }
}
