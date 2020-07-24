package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.ArrayList;
import p000X.A06;
import p000X.A1e;
import p000X.A5x;
import p000X.AA1;
import p000X.AA6;
import p000X.AAL;
import p000X.AAP;
import p000X.AAW;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass951;
import p000X.C230099zE;
import p000X.C230109zF;
import p000X.C230349zs;
import p000X.C230379zz;
import p000X.C23043A0y;
import p000X.C23053A3d;
import p000X.C23155AAf;

@ReactModule(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager implements AAL {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public C23155AAf mFpsListener;

    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(AA1 aa1, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        A06.A00(aa1.A06).A0A(SPACING_TYPES[i], intValue, f);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(AA1 aa1, C23043A0y a0y) {
        double d;
        if (a0y != null) {
            double d2 = 0.0d;
            if (a0y.hasKey("x")) {
                d = a0y.getDouble("x");
            } else {
                d = 0.0d;
            }
            if (a0y.hasKey("y")) {
                d2 = a0y.getDouble("y");
            }
            int A00 = (int) C230109zF.A00((float) d);
            int A002 = (int) C230109zF.A00((float) d2);
            aa1.scrollTo(A00, A002);
            AA1.A06(aa1, A00, A002);
            AA1.A05(aa1, A00, A002);
        }
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(AA1 aa1, int i) {
        if (i > 0) {
            aa1.setHorizontalFadingEdgeEnabled(true);
            aa1.setFadingEdgeLength(i);
            return;
        }
        aa1.setHorizontalFadingEdgeEnabled(false);
        aa1.setFadingEdgeLength(0);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(AA1 aa1, boolean z) {
        aa1.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(AA1 aa1, float f) {
        aa1.A02 = (int) (f * AnonymousClass951.A00.density);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(AA1 aa1, A1e a1e) {
        DisplayMetrics displayMetrics = AnonymousClass951.A00;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a1e.size(); i++) {
            arrayList.add(Integer.valueOf((int) (a1e.getDouble(i) * ((double) displayMetrics.density))));
        }
        aa1.A09 = arrayList;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(AA1 aa1, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (i == 0) {
            aa1.setBorderRadius(f);
            return;
        }
        A06.A00(aa1.A06).A08(f, i - 1);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(AA1 aa1, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        A06.A00(aa1.A06).A09(SPACING_TYPES[i], f);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(AA1 aa1, String str) {
        aa1.setOverScrollMode(A5x.A00(str));
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(AA1 aa1, String str) {
        aa1.setBorderStyle(str);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(AA1 aa1, int i) {
        aa1.setEndFillColor(i);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(AA1 aa1, float f) {
        aa1.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(AA1 aa1, boolean z) {
        aa1.A0B = z;
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(AA1 aa1, boolean z) {
        AnonymousClass1E1.A0h(aa1, z);
    }

    @ReactProp(name = "overflow")
    public void setOverflow(AA1 aa1, String str) {
        aa1.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(AA1 aa1, boolean z) {
        aa1.A0C = z;
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(AA1 aa1, boolean z) {
        aa1.setRemoveClippedSubviews(z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(AA1 aa1, boolean z) {
        aa1.A0D = z;
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(AA1 aa1, String str) {
        aa1.A08 = str;
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(AA1 aa1, boolean z) {
        aa1.A0E = z;
    }

    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(AA1 aa1, boolean z) {
        aa1.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(AA1 aa1, boolean z) {
        aa1.A0F = z;
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(AA1 aa1, boolean z) {
        aa1.A0G = z;
    }

    public ReactHorizontalScrollViewManager() {
        this((C23155AAf) null);
    }

    public ReactHorizontalScrollViewManager(C23155AAf aAf) {
        this.mFpsListener = null;
        this.mFpsListener = aAf;
    }

    public AA1 createViewInstance(C23053A3d a3d) {
        return new AA1(a3d, this.mFpsListener);
    }

    public void flashScrollIndicators(AA1 aa1) {
        aa1.A07();
    }

    public /* bridge */ /* synthetic */ void flashScrollIndicators(Object obj) {
        ((AA1) obj).A07();
    }

    public void receiveCommand(AA1 aa1, int i, A1e a1e) {
        AA6.A00(this, aa1, i, a1e);
    }

    public void receiveCommand(AA1 aa1, String str, A1e a1e) {
        AA6.A02(this, aa1, str, a1e);
    }

    public void scrollTo(AA1 aa1, AAP aap) {
        if (aap.A02) {
            aa1.A08(aap.A00, aap.A01);
            return;
        }
        int i = aap.A00;
        int i2 = aap.A01;
        aa1.scrollTo(i, i2);
        AA1.A06(aa1, i, i2);
        AA1.A05(aa1, i, i2);
    }

    public void scrollToEnd(AA1 aa1, AAW aaw) {
        int width = aa1.getChildAt(0).getWidth() + aa1.getPaddingRight();
        if (aaw.A00) {
            aa1.A08(width, aa1.getScrollY());
            return;
        }
        int scrollY = aa1.getScrollY();
        aa1.scrollTo(width, scrollY);
        AA1.A06(aa1, width, scrollY);
        AA1.A05(aa1, width, scrollY);
    }

    public Object updateState(AA1 aa1, C230099zE r3, C230379zz r4) {
        aa1.A04 = r4;
        return null;
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C230099zE r3, C230379zz r4) {
        ((AA1) view).A04 = r4;
        return null;
    }
}
