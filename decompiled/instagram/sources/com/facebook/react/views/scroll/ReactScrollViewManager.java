package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000X.A06;
import p000X.A1e;
import p000X.A5x;
import p000X.A62;
import p000X.A9K;
import p000X.AA2;
import p000X.AA6;
import p000X.AAL;
import p000X.AAP;
import p000X.AAW;
import p000X.Constants;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass951;
import p000X.C230099zE;
import p000X.C230109zF;
import p000X.C230299zk;
import p000X.C230349zs;
import p000X.C230379zz;
import p000X.C23043A0y;
import p000X.C23053A3d;
import p000X.C23155AAf;

@ReactModule(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager implements AAL {
    public static final String REACT_CLASS = "RCTScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public C23155AAf mFpsListener;

    public Map getCommandsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("scrollTo", 1);
        hashMap.put("scrollToEnd", 2);
        hashMap.put("flashScrollIndicators", 3);
        return hashMap;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public static Map createExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(A62.A00(Constants.A0C), C230299zk.A00("registrationName", "onScroll"));
        hashMap.put(A62.A00(Constants.ZERO), C230299zk.A00("registrationName", "onScrollBeginDrag"));
        hashMap.put(A62.A00(Constants.ONE), C230299zk.A00("registrationName", "onScrollEndDrag"));
        hashMap.put(A62.A00(Constants.A0N), C230299zk.A00("registrationName", "onMomentumScrollBegin"));
        hashMap.put(A62.A00(Constants.A0Y), C230299zk.A00("registrationName", "onMomentumScrollEnd"));
        return hashMap;
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(AA2 aa2, int i, Integer num) {
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
        A06.A00(aa2.A06).A0A(SPACING_TYPES[i], intValue, f);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(AA2 aa2, C23043A0y a0y) {
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
            aa2.scrollTo(A00, A002);
            AA2.A05(aa2, A00, A002);
            AA2.A04(aa2, A00, A002);
        }
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(AA2 aa2, int i) {
        if (i > 0) {
            aa2.setVerticalFadingEdgeEnabled(true);
            aa2.setFadingEdgeLength(i);
            return;
        }
        aa2.setVerticalFadingEdgeEnabled(false);
        aa2.setFadingEdgeLength(0);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(AA2 aa2, boolean z) {
        aa2.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(AA2 aa2, boolean z) {
        aa2.A0D = z;
        aa2.setFocusable(z);
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(AA2 aa2, float f) {
        aa2.A02 = (int) (f * AnonymousClass951.A00.density);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(AA2 aa2, A1e a1e) {
        DisplayMetrics displayMetrics = AnonymousClass951.A00;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a1e.size(); i++) {
            arrayList.add(Integer.valueOf((int) (a1e.getDouble(i) * ((double) displayMetrics.density))));
        }
        aa2.A09 = arrayList;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(AA2 aa2, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (i == 0) {
            aa2.setBorderRadius(f);
            return;
        }
        A06.A00(aa2.A06).A08(f, i - 1);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(AA2 aa2, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        A06.A00(aa2.A06).A09(SPACING_TYPES[i], f);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(AA2 aa2, String str) {
        aa2.setOverScrollMode(A5x.A00(str));
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(AA2 aa2, String str) {
        aa2.setBorderStyle(str);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(AA2 aa2, int i) {
        aa2.setEndFillColor(i);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(AA2 aa2, float f) {
        aa2.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(AA2 aa2, boolean z) {
        aa2.A0B = z;
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(AA2 aa2, boolean z) {
        AnonymousClass1E1.A0h(aa2, z);
    }

    @ReactProp(name = "overflow")
    public void setOverflow(AA2 aa2, String str) {
        aa2.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(AA2 aa2, boolean z) {
        aa2.A0C = z;
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(AA2 aa2, boolean z) {
        aa2.setRemoveClippedSubviews(z);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(AA2 aa2, String str) {
        aa2.A08 = str;
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(AA2 aa2, boolean z) {
        aa2.A0E = z;
    }

    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(AA2 aa2, boolean z) {
        aa2.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(AA2 aa2, boolean z) {
        aa2.A0F = z;
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(AA2 aa2, boolean z) {
        aa2.A0G = z;
    }

    public ReactScrollViewManager() {
        this((C23155AAf) null);
    }

    public ReactScrollViewManager(C23155AAf aAf) {
        this.mFpsListener = null;
        this.mFpsListener = aAf;
    }

    public AA2 createViewInstance(C23053A3d a3d) {
        return new AA2(a3d, this.mFpsListener);
    }

    public void flashScrollIndicators(AA2 aa2) {
        aa2.A06();
    }

    public /* bridge */ /* synthetic */ void flashScrollIndicators(Object obj) {
        ((AA2) obj).A06();
    }

    public void receiveCommand(AA2 aa2, int i, A1e a1e) {
        AA6.A00(this, aa2, i, a1e);
    }

    public void receiveCommand(AA2 aa2, String str, A1e a1e) {
        AA6.A02(this, aa2, str, a1e);
    }

    public void scrollTo(AA2 aa2, AAP aap) {
        if (aap.A02) {
            aa2.A07(aap.A00, aap.A01);
            return;
        }
        int i = aap.A00;
        int i2 = aap.A01;
        aa2.scrollTo(i, i2);
        AA2.A05(aa2, i, i2);
        AA2.A04(aa2, i, i2);
    }

    public void scrollToEnd(AA2 aa2, AAW aaw) {
        View childAt = aa2.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + aa2.getPaddingBottom();
            if (aaw.A00) {
                aa2.A07(aa2.getScrollX(), height);
                return;
            }
            int scrollX = aa2.getScrollX();
            aa2.scrollTo(scrollX, height);
            AA2.A05(aa2, scrollX, height);
            AA2.A04(aa2, scrollX, height);
            return;
        }
        throw new A9K("scrollToEnd called on ScrollView without child");
    }

    public Object updateState(AA2 aa2, C230099zE r3, C230379zz r4) {
        aa2.A04 = r4;
        return null;
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C230099zE r3, C230379zz r4) {
        ((AA2) view).A04 = r4;
        return null;
    }
}
