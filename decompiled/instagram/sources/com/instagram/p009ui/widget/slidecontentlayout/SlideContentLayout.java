package com.instagram.p009ui.widget.slidecontentlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EG;
import p000X.CWL;
import p000X.CWN;
import p000X.CWP;

/* renamed from: com.instagram.ui.widget.slidecontentlayout.SlideContentLayout */
public class SlideContentLayout extends FrameLayout {
    public final AnonymousClass1EB A00;
    public final Map A01;

    public static int A00(SlideContentLayout slideContentLayout, View view) {
        SlideContentLayout slideContentLayout2 = slideContentLayout;
        slideContentLayout2.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(slideContentLayout.getWidth(), Process.WAIT_RESULT_TIMEOUT), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + slideContentLayout2.getPaddingTop() + slideContentLayout2.getPaddingBottom();
    }

    public static void A01(SlideContentLayout slideContentLayout, int i) {
        Map map = slideContentLayout.A01;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            AnonymousClass1EG r5 = (AnonymousClass1EG) slideContentLayout.A01.get(valueOf);
            if (r5.A00() != r5.A01) {
                r5.A05(1.0d, true);
            }
        }
    }

    public static void A02(SlideContentLayout slideContentLayout, int i, AnonymousClass1EG r5) {
        Map map = slideContentLayout.A01;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            AnonymousClass1EG r1 = (AnonymousClass1EG) slideContentLayout.A01.get(valueOf);
            r1.A0D.clear();
            r1.A02();
        }
        slideContentLayout.A01.put(valueOf, r5);
    }

    public static void A03(SlideContentLayout slideContentLayout, View view) {
        AnonymousClass1EG A002 = slideContentLayout.A00.A00();
        A002.A05(0.0d, true);
        A002.A07(new CWL(slideContentLayout, view, ((float) (-slideContentLayout.getWidth())) * 1.75f));
        A02(slideContentLayout, 4, A002);
        A002.A03(1.0d);
        AnonymousClass1EG A003 = slideContentLayout.A00.A00();
        A003.A05(0.0d, true);
        A003.A06 = true;
        A003.A07(new CWP(slideContentLayout, slideContentLayout, (float) slideContentLayout.getHeight()));
        A02(slideContentLayout, 2, A003);
        A003.A06 = true;
        A003.A03(1.0d);
    }

    public static void A04(SlideContentLayout slideContentLayout, View view, View view2) {
        view2.setTranslationX((float) slideContentLayout.getWidth());
        slideContentLayout.addView(view2);
        AnonymousClass1EG A002 = slideContentLayout.A00.A00();
        A002.A05(0.0d, true);
        A002.A07(new CWL(slideContentLayout, view, ((float) (-slideContentLayout.getWidth())) * 1.75f));
        A02(slideContentLayout, 4, A002);
        A002.A03(1.0d);
        AnonymousClass1EG A003 = slideContentLayout.A00.A00();
        A003.A05(0.0d, true);
        A003.A07(new CWN(slideContentLayout, view2, ((float) slideContentLayout.getWidth()) * 1.25f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        A02(slideContentLayout, 3, A003);
        A003.A03(1.0d);
    }

    public SlideContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SlideContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass0P2.A00();
        this.A01 = new HashMap(4);
        AnonymousClass1E1.A0O(this, getResources().getDimension(C0003R.dimen.slide_content_layout_elevation));
    }
}
