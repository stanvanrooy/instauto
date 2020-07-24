package com.instagram.tagging.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.tagging.model.Tag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0ZA;
import p000X.C019000b;
import p000X.C2111999a;
import p000X.C27751CPv;
import p000X.C32501bN;
import p000X.C36841ih;
import p000X.C38741ll;
import p000X.C40821pJ;
import p000X.C476524w;

public class MediaTagHintsLayout extends ViewGroup {
    public int A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    public int A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
    public AnonymousClass0C1 A02;
    public Runnable A03;
    public Runnable A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final int A06 = getResources().getDimensionPixelSize(C0003R.dimen.tag_hint_with_shadow_radius);
    public final Map A07 = new HashMap();

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        for (Map.Entry entry : this.A07.entrySet()) {
            int i7 = (int) (((float) i5) * ((Tag) entry.getKey()).A00().x);
            int i8 = (int) (((float) i6) * ((Tag) entry.getKey()).A00().y);
            int i9 = this.A06;
            ((ImageView) entry.getValue()).layout(i7 - i9, i8 - i9, i7 + i9, i8 + i9);
        }
    }

    public static void A00(MediaTagHintsLayout mediaTagHintsLayout) {
        Runnable runnable = mediaTagHintsLayout.A03;
        if (runnable != null) {
            AnonymousClass0ZA.A08(mediaTagHintsLayout.A05, runnable);
            mediaTagHintsLayout.A03 = null;
        }
    }

    public static void A01(MediaTagHintsLayout mediaTagHintsLayout) {
        Runnable runnable = mediaTagHintsLayout.A04;
        if (runnable != null) {
            AnonymousClass0ZA.A08(mediaTagHintsLayout.A05, runnable);
            mediaTagHintsLayout.A04 = null;
        }
    }

    public static boolean A02(C36841ih r2, int i) {
        if (!r2.A11 || i != r2.AHt() || r2.A0B != C32501bN.IDLE || r2.A0v || r2.A0y) {
            return true;
        }
        return false;
    }

    public final void A03(C38741ll r6, boolean z) {
        Integer num = r6.A01;
        Integer num2 = Constants.ONE;
        if (num != num2) {
            r6.A01 = num2;
            if (z) {
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    View childAt2 = getChildAt(i);
                    C2111999a r2 = new C2111999a(this, childAt);
                    C476524w A002 = C476524w.A00(childAt2, 1);
                    if (A002.A0U()) {
                        A002.A09 = new C27751CPv(A002, childAt2, r2);
                    } else {
                        C40821pJ.A05(childAt2, r2);
                    }
                }
                return;
            }
            removeAllViewsInLayout();
        }
    }

    public void setTags(List list) {
        this.A07.clear();
        removeAllViewsInLayout();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (tag.A00() != null) {
                Context context = getContext();
                ImageView imageView = new ImageView(context);
                getContext();
                imageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.tag_hint_with_shadow));
                imageView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A07.put(tag, imageView);
                addView(imageView);
            }
        }
    }

    public void setHideDelayMs(int i) {
        this.A00 = i;
    }

    public void setShowDelayMs(int i) {
        this.A01 = i;
    }

    public void setUserSession(AnonymousClass0C1 r1) {
        this.A02 = r1;
    }

    public MediaTagHintsLayout(Context context) {
        super(context);
    }

    public MediaTagHintsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaTagHintsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
