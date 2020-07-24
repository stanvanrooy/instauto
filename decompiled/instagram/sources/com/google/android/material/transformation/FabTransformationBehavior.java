package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;
import p000X.A80;
import p000X.A81;
import p000X.A82;
import p000X.AnonymousClass1E1;
import p000X.C101334Zk;
import p000X.C157616oH;
import p000X.C197118c1;
import p000X.C2111198q;
import p000X.C2111598v;
import p000X.C2111698w;
import p000X.C23107A7l;
import p000X.C23121A7z;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00 = new Rect();
    public final RectF A01 = new RectF();
    public final RectF A02 = new RectF();
    public final int[] A03 = new int[2];

    public static float A02(C23107A7l a7l, C2111598v r10, float f) {
        long j = r10.A02;
        long j2 = r10.A03;
        C2111598v A012 = a7l.A00.A01("expansion");
        return f + (r10.A00().getInterpolation(((float) (((A012.A02 + A012.A03) + 17) - j)) / ((float) j2)) * (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER - f));
    }

    public abstract C23107A7l A0Q(Context context, boolean z);

    private float A00(View view, View view2, A82 a82) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.A01;
        RectF rectF2 = this.A02;
        A03(view, rectF);
        A03(view2, rectF2);
        int i = a82.A00 & 7;
        if (i != 1) {
            if (i == 3) {
                f = rectF2.left;
                f2 = rectF.left;
            } else if (i != 5) {
                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f = rectF2.right;
                f2 = rectF.right;
            }
            f3 = f - f2;
        } else {
            f = rectF2.centerX();
            f2 = rectF.centerX();
            f3 = f - f2;
        }
        return f3 + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    private float A01(View view, View view2, A82 a82) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.A01;
        RectF rectF2 = this.A02;
        A03(view, rectF);
        A03(view2, rectF2);
        int i = a82.A00 & 112;
        if (i != 16) {
            if (i == 48) {
                f = rectF2.top;
                f2 = rectF.top;
            } else if (i != 80) {
                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f = rectF2.bottom;
                f2 = rectF.bottom;
            }
            f3 = f - f2;
        } else {
            f = rectF2.centerY();
            f2 = rectF.centerY();
            f3 = f - f2;
        }
        return f3 + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        if ((r3 instanceof android.view.ViewGroup) != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0171, code lost:
        if (r2 != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0174, code lost:
        r3 = null;
     */
    public final AnimatorSet A0P(View view, View view2, boolean z, boolean z2) {
        C2111598v A012;
        C2111698w r1;
        String str;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        Property property;
        int[] iArr;
        View view3 = view2;
        boolean z3 = z;
        C23107A7l A0Q = A0Q(view3.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        View view4 = view;
        boolean z4 = z2;
        if (Build.VERSION.SDK_INT >= 21) {
            A04(view4, view3, z3, z4, A0Q, arrayList);
        }
        RectF rectF = this.A01;
        float A002 = A00(view4, view3, A0Q.A01);
        float A013 = A01(view4, view3, A0Q.A01);
        if (A002 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A013 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A012 = A0Q.A00.A01("translationXLinear");
            r1 = A0Q.A00;
            str = "translationYLinear";
        } else if ((!z || A013 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) && (z || A013 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
            A012 = A0Q.A00.A01("translationXCurveDownwards");
            r1 = A0Q.A00;
            str = "translationYCurveDownwards";
        } else {
            A012 = A0Q.A00.A01("translationXCurveUpwards");
            r1 = A0Q.A00;
            str = "translationYCurveUpwards";
        }
        C2111598v A014 = r1.A01(str);
        if (z) {
            if (!z2) {
                view3.setTranslationX(-A002);
                view3.setTranslationY(-A013);
            }
            ofFloat = ObjectAnimator.ofFloat(view3, View.TRANSLATION_X, new float[]{0.0f});
            ofFloat2 = ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, new float[]{0.0f});
            float A022 = A02(A0Q, A012, -A002);
            float A023 = A02(A0Q, A014, -A013);
            Rect rect = this.A00;
            view3.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.A01;
            rectF2.set(rect);
            RectF rectF3 = this.A02;
            A03(view3, rectF3);
            rectF3.offset(A022, A023);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view3, View.TRANSLATION_X, new float[]{-A002});
            ofFloat2 = ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, new float[]{-A013});
        }
        A012.A01(ofFloat);
        A014.A01(ofFloat2);
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        rectF.width();
        rectF.height();
        View view5 = view4;
        boolean z5 = view3 instanceof A81;
        if (z5 && (view4 instanceof ImageView)) {
            A81 a81 = (A81) view3;
            Drawable drawable = ((ImageView) view5).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    property = C197118c1.A01;
                    iArr = new int[]{0};
                } else {
                    property = C197118c1.A01;
                    iArr = new int[]{255};
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, property, iArr);
                ofInt.addUpdateListener(new C23121A7z(this, view3));
                A0Q.A00.A01("iconFade").A01(ofInt);
                arrayList.add(ofInt);
                arrayList2.add(new A80(this, a81, drawable));
            }
        }
        if (!z5) {
            boolean z6 = view3 instanceof ViewGroup;
            if (z6) {
                View findViewById = view3.findViewById(C0003R.C0005id.mtrl_child_content_container);
                if (findViewById == null) {
                    findViewById = view3;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById;
                if (viewGroup != null) {
                    if (z) {
                        if (!z2) {
                            C101334Zk.A00.set(viewGroup, Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
                        }
                        ofFloat3 = ObjectAnimator.ofFloat(viewGroup, C101334Zk.A00, new float[]{1.0f});
                    } else {
                        ofFloat3 = ObjectAnimator.ofFloat(viewGroup, C101334Zk.A00, new float[]{0.0f});
                    }
                    A0Q.A00.A01("contentFade").A01(ofFloat3);
                    arrayList.add(ofFloat3);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            C2111198q.A00(animatorSet, arrayList);
            animatorSet.addListener(new C157616oH(this, z3, view3, view4));
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
            }
            return animatorSet;
        }
        A82 a82 = A0Q.A01;
        RectF rectF4 = this.A01;
        RectF rectF5 = this.A02;
        A03(view4, rectF4);
        A03(view3, rectF5);
        rectF5.offset(-A00(view4, view3, a82), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        rectF4.centerX();
        A82 a822 = A0Q.A01;
        RectF rectF6 = this.A01;
        RectF rectF7 = this.A02;
        A03(view4, rectF6);
        A03(view3, rectF7);
        rectF7.offset(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -A01(view4, view3, a822));
        rectF6.centerY();
        throw null;
    }

    private void A03(View view, RectF rectF) {
        rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.A03;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public static void A04(View view, View view2, boolean z, boolean z2, C23107A7l a7l, List list) {
        Property property;
        float[] fArr;
        float f;
        float A002 = AnonymousClass1E1.A00(view2) - AnonymousClass1E1.A00(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-A002);
            }
            property = View.TRANSLATION_Z;
            fArr = new float[1];
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            property = View.TRANSLATION_Z;
            fArr = new float[1];
            f = -A002;
        }
        fArr[0] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, fArr);
        a7l.A00.A01("elevation").A01(ofFloat);
        list.add(ofFloat);
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
