package p000X;

import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.tagging.widget.TagsLayout;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.1ai  reason: invalid class name and case insensitive filesystem */
public final class C32171ai implements AnonymousClass1RO {
    public int A00 = -1;
    public C36841ih A01;
    public boolean A02 = false;
    public final AnonymousClass0C1 A03;
    public final TagsLayout A04;

    public final void A00() {
        TagsLayout tagsLayout = this.A04;
        boolean z = this.A02;
        int childCount = tagsLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C27734CPd A022 = tagsLayout.A02(i);
            if (z) {
                AnonymousClass9GH r8 = new AnonymousClass9GH(tagsLayout, A022);
                C476524w A002 = C476524w.A00(A022, 1);
                if (A002.A0U()) {
                    A002.A09 = new C27749CPt(A002, A022, r8);
                } else {
                    C40821pJ.A06(A022, r8);
                }
            } else {
                PointF relativeTagPosition = A022.getRelativeTagPosition();
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, relativeTagPosition.x, relativeTagPosition.y);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation.setDuration(200);
                scaleAnimation.setAnimationListener(new AnonymousClass9GF(tagsLayout, A022));
                A022.startAnimation(scaleAnimation);
            }
        }
        if (!z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setDuration(200);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            tagsLayout.startAnimation(alphaAnimation);
        }
    }

    public final void A01(AnonymousClass1NJ r10, C36841ih r11, AnonymousClass0C1 r12, boolean z) {
        Collection A11;
        C36841ih r4 = r11;
        if (this.A02) {
            r11.A04(r11.AHt()).A06 = true;
        }
        this.A04.removeAllViews();
        TagsLayout tagsLayout = this.A04;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1NJ r3 = r10;
        ArrayList A10 = r10.A10();
        if (A10 != null) {
            arrayList.addAll(A10);
        }
        AnonymousClass0C1 r8 = r12;
        if (r10.A0Q(r12).Aho()) {
            A11 = C36961it.A00(r10);
        } else {
            A11 = r10.A11();
        }
        if (A11 != null) {
            arrayList.addAll(A11);
        }
        tagsLayout.setTags(arrayList, r3, r4, r11.AHt(), z, this.A02, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r6.A0B == p000X.C32501bN.IDLE) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r6.A04(r4).A05 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r6.A0v == false) goto L_0x0045;
     */
    public final void BB7(C36841ih r6, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = this.A00;
        if (i2 == r6.AHt() && r6.A0y && r6 == this.A01) {
            boolean z4 = this.A02;
            if (z4 && i == 16) {
                z = true;
            }
            z = false;
            if (!z) {
                if (z4 && i == 18 && !r6.A0s) {
                    z2 = true;
                }
                z2 = false;
                if (!z2) {
                    if (this.A02 && i == 10) {
                        z3 = true;
                    }
                    z3 = false;
                    if (!z3) {
                        return;
                    }
                }
            }
            A00();
            r6.A0y = false;
        }
    }

    public C32171ai(AnonymousClass0C1 r2, TagsLayout tagsLayout) {
        this.A03 = r2;
        this.A04 = tagsLayout;
    }
}
