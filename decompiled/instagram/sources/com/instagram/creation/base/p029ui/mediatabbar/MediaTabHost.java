package com.instagram.creation.base.p029ui.mediatabbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EG;
import p000X.C06400Ox;
import p000X.C180697nX;
import p000X.C180707nZ;
import p000X.C180727nc;
import p000X.C180737nd;
import p000X.C180747ne;
import p000X.C183997tb;
import p000X.C27181Gu;
import p000X.C698233u;

/* renamed from: com.instagram.creation.base.ui.mediatabbar.MediaTabHost */
public class MediaTabHost extends FrameLayout implements GestureDetector.OnGestureListener {
    public float A00;
    public View A01;
    public C180697nX A02;
    public C180697nX A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public TextView A09;
    public Runnable A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass1EG A0F;
    public final MediaTabBar A0G;
    public final Set A0H;
    public final GestureDetector A0I;
    public final AnonymousClass1EG A0J;
    public final C180707nZ A0K;
    public final C698233u A0L;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public static void A00(MediaTabHost mediaTabHost) {
        if (mediaTabHost.A01 == null) {
            View inflate = ((ViewStub) mediaTabHost.findViewById(C0003R.C0005id.media_tab_bar_text_info_stub)).inflate();
            mediaTabHost.A01 = inflate;
            mediaTabHost.A09 = (TextView) inflate.findViewById(C0003R.C0005id.media_tab_bar_text_info);
        }
    }

    public static boolean A01(MediaTabHost mediaTabHost) {
        if (mediaTabHost.A0J.A01 == 0.0d) {
            return true;
        }
        return false;
    }

    public static float getClampedSpringValue(MediaTabHost mediaTabHost) {
        return (float) C27181Gu.A00(mediaTabHost.A0F.A00(), 0.0d, (double) ((mediaTabHost.A0G.getChildCount() - 1) * mediaTabHost.getWidth()));
    }

    private void setDragOffset(float f) {
        this.A0F.A05((double) f, true);
    }

    public final void A02(C180697nX r5, boolean z) {
        int i;
        if (!this.A0B) {
            this.A0A = new C180727nc(this, r5, z);
            return;
        }
        if (this.A06) {
            i = (this.A0G.getChildCount() - 1) - r5.A00;
        } else {
            i = r5.A00;
        }
        int max = Math.max(Math.min(this.A0G.getChildCount() - 1, i), 0);
        if (z) {
            this.A0F.A03((double) (max * getWidth()));
        } else {
            this.A0F.A05((double) (max * getWidth()), true);
        }
        if (!this.A0E) {
            for (C180737nd BQg : this.A0H) {
                BQg.BQg(getCurrentTab());
            }
            this.A03 = getCurrentTab();
            this.A0E = true;
        }
    }

    public final void A03(C180737nd r2) {
        this.A0H.add(r2);
        C180697nX currentTab = getCurrentTab();
        r2.BQf(currentTab, currentTab);
    }

    public final void A04(boolean z) {
        this.A0D = z;
        if (z) {
            this.A0G.setVisibility(0);
        } else {
            this.A0G.setVisibility(8);
        }
    }

    public final void A05(boolean z, boolean z2) {
        double d;
        if (z) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        this.A0G.setEnabled(z);
        if (z2) {
            this.A0J.A03(d);
        } else {
            this.A0J.A05(d, true);
        }
    }

    public C180697nX getCurrentTab() {
        int currentIndex;
        MediaTabBar mediaTabBar = this.A0G;
        if (this.A06) {
            currentIndex = (mediaTabBar.getChildCount() - 1) - getCurrentIndex();
        } else {
            currentIndex = getCurrentIndex();
        }
        View childAt = mediaTabBar.getChildAt(currentIndex);
        if (childAt != null) {
            return (C180697nX) childAt.getTag();
        }
        return null;
    }

    public int getTabCount() {
        return this.A0G.getChildCount();
    }

    public int getTabHeight() {
        int i = this.A0G.getLayoutParams().height;
        if (i <= 0) {
            return this.A0G.getHeight();
        }
        return i;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A08 = f;
        return false;
    }

    public void setTabTranslationX(float f) {
        MediaTabBar mediaTabBar = this.A0G;
        mediaTabBar.setTranslationX(f * ((float) mediaTabBar.getWidth()));
    }

    private int getCurrentIndex() {
        return (int) C27181Gu.A00((double) Math.round(getCurrentProgress(this)), 0.0d, (double) (this.A0G.getChildCount() - 1));
    }

    public static float getCurrentProgress(MediaTabHost mediaTabHost) {
        return getClampedSpringValue(mediaTabHost) / ((float) mediaTabHost.getWidth());
    }

    private float getDragOffset() {
        return getClampedSpringValue(this);
    }

    private int getTargetIndex() {
        int currentIndex = getCurrentIndex();
        float currentProgress = getCurrentProgress(this) % 1.0f;
        double d = this.A0F.A09.A01;
        if (d > 0.0d) {
            if (((double) currentProgress) <= 0.5d) {
                currentIndex++;
            }
        } else if (d < 0.0d && ((double) currentProgress) >= 0.5d) {
            currentIndex--;
        }
        return Math.min(Math.max(currentIndex, 0), this.A0G.getChildCount() - 1);
    }

    private float getTargetOffset() {
        return (float) (getTargetIndex() * getWidth());
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(876257023);
        super.onAttachedToWindow();
        this.A0F.A07(this.A0K);
        if (this.A0D) {
            this.A0J.A07(this.A0L);
        } else {
            this.A0G.setVisibility(8);
        }
        AnonymousClass0Z0.A0D(-1558042344, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(455441176);
        super.onDetachedFromWindow();
        this.A0F.A08(this.A0K);
        this.A0J.A08(this.A0L);
        AnonymousClass0Z0.A0D(510412799, A062);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.A0C = false;
            this.A08 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A04 = false;
            this.A05 = false;
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if (A01(this) && this.A07) {
            if (this.A04 && !this.A0C) {
                z = true;
            }
            this.A0I.onTouchEvent(motionEvent);
        }
        return z;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.A0B) {
            this.A0B = true;
            Runnable runnable = this.A0A;
            if (runnable != null) {
                runnable.run();
                this.A0A = null;
            }
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        float abs = Math.abs(motionEvent.getRawX() - motionEvent2.getRawX());
        float abs2 = Math.abs(motionEvent.getRawY() - motionEvent2.getRawY());
        float sqrt = (float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
        float degrees = (float) Math.toDegrees(Math.asin((double) (abs2 / sqrt)));
        if (sqrt <= scaledTouchSlop || this.A04 || this.A05) {
            return true;
        }
        this.A00 = motionEvent2.getRawX();
        if (degrees < 45.0f) {
            this.A04 = true;
            return true;
        }
        this.A05 = true;
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int A052 = AnonymousClass0Z0.A05(891406714);
        if (!A01(this) || !this.A07) {
            AnonymousClass0Z0.A0C(20990423, A052);
            return false;
        }
        this.A0I.onTouchEvent(motionEvent);
        float rawX = motionEvent.getRawX();
        if (!this.A04) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            f = rawX - this.A00;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float f2 = this.A08;
                setDragOffset(getClampedSpringValue(this) - f);
                this.A0F.A04((double) (f2 * -1.0f));
                this.A0F.A03((double) getTargetOffset());
            } else if (action == 2 && this.A04) {
                setDragOffset(getClampedSpringValue(this) - f);
            }
        }
        this.A00 = motionEvent.getRawX();
        AnonymousClass0Z0.A0C(-257315910, A052);
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.A0C = z;
    }

    public void setTextInfoBar(String str) {
        A00(this);
        A04(false);
        this.A01.setVisibility(0);
        this.A09.setText(str);
    }

    public void setTabPagingEnabled(boolean z) {
        this.A07 = z;
    }

    public MediaTabHost(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0H = new CopyOnWriteArraySet();
        this.A07 = true;
        this.A0D = true;
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(C180747ne.A00);
        A002.A06 = true;
        this.A0F = A002;
        this.A0K = new C180707nZ(this);
        Context context2 = getContext();
        this.A06 = C06400Ox.A02(context2);
        this.A0J = AnonymousClass0P2.A00().A00();
        this.A0L = new C698233u(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0I = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        LayoutInflater.from(AnonymousClass1BA.A05(context, C0003R.attr.mediaTabStyle)).inflate(C0003R.layout.media_tab_host, this);
        MediaTabBar mediaTabBar = (MediaTabBar) findViewById(C0003R.C0005id.media_tab_bar);
        this.A0G = mediaTabBar;
        ViewGroup.LayoutParams layoutParams = mediaTabBar.getLayoutParams();
        Resources resources = getResources();
        getContext();
        layoutParams.height = resources.getDimensionPixelSize(C183997tb.A02(context2) ? C0003R.dimen.media_tab_bar_height : C0003R.dimen.media_tab_bar_height_small);
    }
}
