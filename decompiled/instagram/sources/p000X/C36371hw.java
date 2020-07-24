package p000X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.p009ui.listview.StickyHeaderListView;

/* renamed from: X.1hw  reason: invalid class name and case insensitive filesystem */
public final class C36371hw {
    public static final Rect A00 = new Rect();
    public static final Rect A01 = new Rect();
    public static final Rect A02 = new Rect();

    public static int A00(Rect rect, View view, StickyHeaderListView stickyHeaderListView) {
        Rect topChromeArea;
        Rect rect2 = A01;
        if (!view.getGlobalVisibleRect(rect2)) {
            return 0;
        }
        if (stickyHeaderListView == null) {
            topChromeArea = new Rect();
        } else {
            topChromeArea = stickyHeaderListView.getTopChromeArea();
        }
        int max = Math.max(Math.max(rect2.top, rect.top), topChromeArea.bottom);
        return Math.max(max, Math.min(rect2.bottom, rect.bottom)) - max;
    }

    public static int A01(View view, View view2, StickyHeaderListView stickyHeaderListView) {
        Rect topChromeArea;
        Rect rect = A01;
        if (!view2.getGlobalVisibleRect(rect)) {
            return 0;
        }
        Rect rect2 = A02;
        view.getGlobalVisibleRect(rect2);
        Rect rect3 = A02;
        if (stickyHeaderListView == null) {
            topChromeArea = new Rect();
        } else {
            topChromeArea = stickyHeaderListView.getTopChromeArea();
        }
        int max = Math.max(Math.max(rect.top, rect2.top), topChromeArea.bottom);
        return Math.max(max, Math.min(rect.bottom, rect3.bottom)) - max;
    }

    public static int A02(C255119b r3, int i, int i2) {
        boolean z = false;
        if (A03(r3, C36421i1.REEL_TRAY) != -1) {
            z = true;
        }
        if (z) {
            View AI4 = r3.AI4(A03(r3, C36421i1.REEL_TRAY));
            if (i - AI4.getBottom() <= i2) {
                return (AI4.getBottom() - i) + i2;
            }
        }
        return 0;
    }

    public static int A03(C255119b r2, C36421i1 r3) {
        if (r2 == null) {
            return -1;
        }
        for (int ALs = r2.ALs(); ALs <= r2.AOh(); ALs++) {
            if (A06(r2, ALs) == r3) {
                return ALs;
            }
        }
        return -1;
    }

    public static C36421i1 A07(Object obj) {
        if (obj instanceof C32541bR) {
            return C36421i1.CAROUSEL;
        }
        if (obj instanceof C36381hx) {
            return C36421i1.GRIDROW;
        }
        if (obj instanceof C36391hy) {
            return C36421i1.HOLDOUT;
        }
        if (obj instanceof C31801Zz) {
            return C36421i1.MEDIA_HEADER;
        }
        if (obj instanceof C32151ag) {
            return C36421i1.MEDIA_CONTENT;
        }
        if (obj instanceof C32351b1) {
            return C36421i1.MEDIA_UFI;
        }
        if (obj instanceof C32401bA) {
            return C36421i1.MEDIA_FEEDBACK;
        }
        if (obj instanceof C32561bT) {
            return C36421i1.MEDIA_INLINE_COMPOSER_BUTTON;
        }
        if (obj instanceof C32441bF) {
            return C36421i1.MEDIA_LABEL_BELOW_COMMENTS;
        }
        if (obj instanceof C36151ha) {
            return C36421i1.LOAD_MORE;
        }
        if (C17020pY.A00().A0f(obj)) {
            return C36421i1.REEL_TRAY;
        }
        if (C17020pY.A00().A0g(obj)) {
            return C36421i1.REEL_INFEED_TRAY;
        }
        if (obj instanceof C36401hz) {
            return C36421i1.AD_CTA;
        }
        if (obj instanceof C36411i0) {
            return C36421i1.COLLECTION_TOP_MAIN_BOTTOM_THREE;
        }
        return C36421i1.UNKNOWN;
    }

    public static View A04(C255119b r1, int i) {
        C36421i1 A06 = A06(r1, i);
        View AI4 = r1.AI4(i);
        if (AI4 == null) {
            return null;
        }
        switch (A06.ordinal()) {
            case 3:
                return ((C32151ag) AI4.getTag()).A0D;
            case 8:
                return ((C32541bR) AI4.getTag()).A00();
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return ((C36411i0) AI4.getTag()).A0G;
            default:
                return null;
        }
    }

    public static C32161ah A05(C255119b r1, int i) {
        C36421i1 A06 = A06(r1, i);
        View AI4 = r1.AI4(i);
        if (AI4 == null) {
            return null;
        }
        switch (A06.ordinal()) {
            case 3:
                return (C32151ag) AI4.getTag();
            case 8:
                Object tag = ((C32541bR) AI4.getTag()).A09.A0C.getTag();
                if (tag instanceof AnonymousClass24E) {
                    return (AnonymousClass24E) tag;
                }
                return null;
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return (C36411i0) AI4.getTag();
            default:
                throw new IllegalArgumentException("Video holder only exists for MEDIA, Carousel and ALBUM types.");
        }
    }

    public static C36421i1 A06(C255119b r0, int i) {
        Object obj;
        View AI4 = r0.AI4(i);
        if (AI4 != null) {
            obj = AI4.getTag();
        } else {
            obj = null;
        }
        return A07(obj);
    }
}
