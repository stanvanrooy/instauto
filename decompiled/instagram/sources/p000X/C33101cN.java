package p000X;

import android.animation.Animator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import com.facebook.C0003R;

/* renamed from: X.1cN  reason: invalid class name and case insensitive filesystem */
public final class C33101cN {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r9 == com.facebook.C0003R.animator.fragment_slide_right_exit) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r9 == com.facebook.C0003R.animator.fragment_slide_right_exit) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        if (r9 == com.facebook.C0003R.animator.modal_slide_down_exit) goto L_0x006a;
     */
    public static Animator A00(AnonymousClass1HD r7, boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2 = AnonymousClass19Z.A00;
        int i3 = AnonymousClass19Z.A01;
        Interpolator interpolator = AnonymousClass19Z.A02;
        C33121cP.A01 = i2;
        C33121cP.A00 = i3;
        C33121cP.A02 = interpolator;
        C33121cP.A03 = true;
        boolean z7 = z;
        int i4 = i;
        if ((!z || i != C0003R.animator.fragment_slide_left_enter) && (z || i != C0003R.animator.fragment_slide_right_exit)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(i == C0003R.animator.fragment_slide_left_enter || i == C0003R.animator.fragment_slide_left_exit || i == C0003R.animator.fragment_slide_right_enter)) {
            z3 = false;
        }
        z3 = true;
        if (i != C0003R.animator.fragment_slide_right_enter) {
            z4 = false;
        }
        z4 = true;
        AnonymousClass1HD r1 = r7;
        Animator A00 = C33121cP.A00(r1, z7, i4, z2, z3, z4);
        if (A00 != null) {
            return A00;
        }
        if ((!z || i != C0003R.animator.modal_slide_up_enter) && (z || i != C0003R.animator.modal_slide_down_exit)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!(i == C0003R.animator.modal_slide_up_enter || i == C0003R.animator.modal_empty_animator || i == C0003R.animator.modal_empty_animator)) {
            z6 = false;
        }
        z6 = true;
        return C33121cP.A00(r1, z7, i4, z5, z6, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r6 == com.facebook.C0003R.anim.fragment_slide_right_exit) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r6 == com.facebook.C0003R.anim.fragment_slide_right_exit) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        if (r6 == com.facebook.C0003R.anim.modal_slide_down_exit) goto L_0x0067;
     */
    public static Animation A01(AnonymousClass1HD r4, boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2 = AnonymousClass19Z.A01;
        int i3 = AnonymousClass19Z.A00;
        Interpolator interpolator = AnonymousClass19Z.A02;
        C33111cO.A01 = i2;
        C33111cO.A00 = i3;
        C33111cO.A02 = interpolator;
        C33111cO.A03 = true;
        if ((!z || i != C0003R.anim.fragment_slide_left_enter) && (z || i != C0003R.anim.fragment_slide_right_exit)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(i == C0003R.anim.fragment_slide_left_enter || i == C0003R.anim.fragment_slide_left_exit || i == C0003R.anim.fragment_slide_right_enter)) {
            z3 = false;
        }
        z3 = true;
        if (i != C0003R.anim.fragment_slide_right_enter) {
            z4 = false;
        }
        z4 = true;
        Animation A02 = C33111cO.A02(r4, i, z2, z3, z4);
        if (A02 != null) {
            return A02;
        }
        if ((!z || i != C0003R.anim.modal_slide_up_enter) && (z || i != C0003R.anim.modal_slide_down_exit)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!(i == C0003R.anim.modal_slide_up_enter || i == C0003R.anim.modal_empty_animation || i == C0003R.anim.modal_empty_animation)) {
            z6 = false;
        }
        z6 = true;
        return C33111cO.A02(r4, i, z5, z6, false);
    }
}
