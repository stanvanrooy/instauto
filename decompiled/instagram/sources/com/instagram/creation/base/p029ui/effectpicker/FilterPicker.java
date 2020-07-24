package com.instagram.creation.base.p029ui.effectpicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0O1;
import p000X.AnonymousClass0O9;
import p000X.AnonymousClass0OT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass7HT;
import p000X.AnonymousClass7m3;
import p000X.AnonymousClass803;
import p000X.AnonymousClass80F;
import p000X.AnonymousClass80O;
import p000X.AnonymousClass80U;
import p000X.C137535to;
import p000X.C186097xD;
import p000X.C186197xN;
import p000X.C187297zB;
import p000X.C187377zJ;
import p000X.C187727zv;
import p000X.C1877780b;
import p000X.C1878280g;

/* renamed from: com.instagram.creation.base.ui.effectpicker.FilterPicker */
public class FilterPicker extends EffectPicker implements C186097xD {
    public long A00;
    public AnonymousClass803 A01;
    public boolean A02;
    public float A03;
    public int A04;
    public View A05;
    public final Handler A06 = new AnonymousClass80O(this, Looper.getMainLooper());
    public final List A07 = new ArrayList();
    public final AnonymousClass0OT A08;
    public final AnonymousClass0O9 A09 = new AnonymousClass80U(this);

    public final void B18(View view, boolean z) {
        this.A05 = null;
        AnonymousClass0ZA.A07(this.A06, (Object) null);
        C187727zv r2 = (C187727zv) view;
        if (z) {
            this.A03.removeView(view);
            this.A05.remove(view);
            int ANC = r2.A03.ANC();
            Iterator it = this.A07.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1878280g r3 = (C1878280g) it.next();
                if (r3.A00 == ANC) {
                    r3.A02 = true;
                    AnonymousClass803.A01(this.A01, C137535to.A00(Constants.A0h), this.A04, r2.A03.getName(), ANC, "editor_view");
                    if (r2.isChecked()) {
                        A02(0);
                    }
                }
            }
        } else {
            AnonymousClass803 r32 = this.A01;
            int i = this.A04;
            C187297zB r0 = r2.A03;
            AnonymousClass803.A01(r32, C137535to.A00(Constants.A0g), i, r0.getName(), r0.ANC(), "editor_view");
            view.setVisibility(0);
        }
        this.A08.ADc(this.A09);
    }

    private int getIndexFromDrag() {
        int childCount = (this.A03.getChildCount() - 1) - (this.A02 ? 1 : 0);
        int i = 1;
        int i2 = 0;
        while (i <= childCount) {
            i2 = (i + childCount) >>> 1;
            if (this.A03 >= ((float) ((this.A02 * i2) - getScrollX()))) {
                if (this.A03 <= ((float) (((this.A02 * i2) - getScrollX()) + this.A02))) {
                    break;
                }
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
        }
        return i2;
    }

    public final void B1H(View view, float f, float f2) {
        this.A05 = view;
        this.A03 = f;
        int indexFromDrag = getIndexFromDrag();
        this.A04 = indexFromDrag;
        C187297zB r0 = ((C187727zv) view).A03;
        AnonymousClass803.A01(this.A01, C137535to.A00(Constants.A0f), indexFromDrag, r0.getName(), r0.ANC(), "editor_view");
        view.setVisibility(4);
    }

    public final void B1N() {
        AnonymousClass0ZA.A07(this.A06, (Object) null);
    }

    public final void B1O(View view, float f, float f2, boolean z, boolean z2) {
        C1877780b r1;
        int i;
        this.A03 = f;
        if (((float) (this.A02 / 2)) + f <= ((float) getWidth()) || getScrollX() == this.A03.getWidth() - getWidth()) {
            if (f - ((float) (this.A02 / 2)) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || getScrollX() == 0) {
                AnonymousClass0ZA.A07(this.A06, (Object) null);
            } else if (!this.A06.hasMessages(1)) {
                this.A00 = System.currentTimeMillis();
                AnonymousClass0ZA.A0B(this.A06, 1);
            }
        } else if (!this.A06.hasMessages(2)) {
            this.A00 = System.currentTimeMillis();
            AnonymousClass0ZA.A0B(this.A06, 2);
        }
        C187727zv r2 = (C187727zv) this.A03.getChildAt(this.A04);
        if (z) {
            C1877780b r0 = r2.A04;
            r1 = C1877780b.COLLAPSED;
            if (r0 != r1) {
                i = 0;
            } else {
                return;
            }
        } else if (r2.A04 != C1877780b.NONE) {
            A00(this);
            C1877780b r02 = r2.A04;
            r1 = C1877780b.EXPANDED;
            if (r02 != r1) {
                i = r2.A00;
            } else {
                return;
            }
        } else {
            A00(this);
            return;
        }
        C187727zv.A02(r2, i);
        r2.A04 = r1;
    }

    public void setEffects(List list) {
        this.A07.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C187297zB r2 = (C187297zB) it.next();
            if ((r2 instanceof C187377zJ) && r2.ANC() != 0) {
                C187377zJ r22 = (C187377zJ) r2;
                this.A07.add(r22.A00);
                if (r22.A00.A02) {
                    it.remove();
                }
            } else if (r2.ANC() == -1) {
                this.A02 = true;
            }
        }
        super.setEffects(list);
    }

    public void setFilterStateToOld(C187727zv r5) {
        Drawable drawable;
        int ANC = r5.A03.ANC();
        for (C1878280g r1 : this.A07) {
            if (r1.A00 == ANC && r1.A03) {
                r1.A03 = false;
                C187297zB r3 = r5.A03;
                Context context = r5.getContext();
                AnonymousClass7HT r0 = r5.A05;
                if (r0 != null) {
                    drawable = r0.A00;
                } else {
                    drawable = null;
                }
                r5.A05 = r3.AEq(context, drawable, r5.A02);
                C187727zv.A01(r5);
                r5.postInvalidate();
                this.A08.ADc(this.A09);
                return;
            }
        }
    }

    public static void A00(FilterPicker filterPicker) {
        int width;
        int indexFromDrag = filterPicker.getIndexFromDrag();
        View childAt = filterPicker.A03.getChildAt(indexFromDrag);
        View view = filterPicker.A05;
        if (childAt != view) {
            C187727zv r2 = (C187727zv) view;
            if (r2.getLayoutParams().width >= 0) {
                width = r2.getLayoutParams().width;
            } else {
                width = r2.getWidth();
            }
            if (filterPicker.A04 > indexFromDrag) {
                width = -width;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation((float) width, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            translateAnimation.setDuration(300);
            childAt.startAnimation(translateAnimation);
            if (filterPicker.A05.getAnimation() != null) {
                filterPicker.A05.clearAnimation();
            }
            filterPicker.A03.removeView(filterPicker.A05);
            filterPicker.A05.remove(filterPicker.A05);
            filterPicker.A03.addView(filterPicker.A05, indexFromDrag);
            filterPicker.A05.add(indexFromDrag, (C187727zv) filterPicker.A05);
            filterPicker.A03.requestLayout();
            int ANC = ((C187727zv) childAt).A03.ANC();
            int ANC2 = r2.A03.ANC();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < filterPicker.A07.size(); i3++) {
                if (((C1878280g) filterPicker.A07.get(i3)).A00 == ANC) {
                    i2 = i3;
                } else if (((C1878280g) filterPicker.A07.get(i3)).A00 == ANC2) {
                    i = i3;
                }
            }
            filterPicker.A07.add(i2, (C1878280g) filterPicker.A07.remove(i));
        }
        filterPicker.A04 = indexFromDrag;
    }

    public AnonymousClass80F getConfig() {
        getContext();
        return AnonymousClass80F.A00();
    }

    public List getTileButtons() {
        return this.A05;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(635847959);
        super.onAttachedToWindow();
        C186197xN.A00.A03(AnonymousClass7m3.class, this);
        AnonymousClass0Z0.A0D(-869795041, A062);
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(-305833034);
        setFilterStateToOld((C187727zv) view);
        super.onClick(view);
        AnonymousClass0Z0.A0C(-764275165, A052);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1188940416);
        super.onDetachedFromWindow();
        C186197xN.A00.A04(AnonymousClass7m3.class, this);
        AnonymousClass0Z0.A0D(-581739648, A062);
    }

    public void setFilterLogger(AnonymousClass803 r1) {
        this.A01 = r1;
    }

    public FilterPicker(Context context) {
        super(context);
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "FilterPicker";
        this.A08 = A002.A01();
    }

    public FilterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "FilterPicker";
        this.A08 = A002.A01();
    }

    public FilterPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "FilterPicker";
        this.A08 = A002.A01();
    }
}
