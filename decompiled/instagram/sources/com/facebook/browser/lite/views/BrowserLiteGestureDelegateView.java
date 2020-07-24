package com.facebook.browser.lite.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import p000X.AU9;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EG;

public class BrowserLiteGestureDelegateView extends LinearLayout {
    public int A00;
    public GestureDetector A01;
    public View A02;
    public BrowserLiteWrapperView A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    private boolean A00() {
        this.A05 = false;
        if (this.A06) {
            this.A06 = false;
            return false;
        } else if (this.A02.getTranslationY() > ((float) this.A03.getHeight()) * 0.2f) {
            BrowserLiteWrapperView browserLiteWrapperView = this.A03;
            browserLiteWrapperView.A06.A06(BrowserLiteWrapperView.A0C);
            browserLiteWrapperView.A04((float) browserLiteWrapperView.getHeight(), true, new AU9(browserLiteWrapperView), 0.0d);
            browserLiteWrapperView.A07 = true;
            return true;
        } else {
            this.A03.A06.A03(0.0d);
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer num;
        AnonymousClass1EG r1;
        int[] chromeContainerLocationInWindow;
        BrowserLiteWrapperView browserLiteWrapperView = this.A03;
        if (browserLiteWrapperView != null && this.A08 && !browserLiteWrapperView.A07) {
            int action = motionEvent.getAction();
            if (action == 0) {
                BrowserLiteWrapperView browserLiteWrapperView2 = this.A03;
                if (!browserLiteWrapperView2.A07) {
                    if (motionEvent == null || browserLiteWrapperView2 == null || (chromeContainerLocationInWindow = browserLiteWrapperView2.getChromeContainerLocationInWindow()) == null) {
                        num = Constants.A0N;
                    } else if (((float) chromeContainerLocationInWindow[1]) > motionEvent.getRawY()) {
                        num = Constants.ZERO;
                    } else if (motionEvent.getRawY() > ((float) (chromeContainerLocationInWindow[1] + this.A03.getChromeContainerHeight()))) {
                        num = Constants.A0C;
                    } else {
                        num = Constants.ONE;
                    }
                    this.A04 = num;
                    BrowserLiteWrapperView browserLiteWrapperView3 = this.A03;
                    if (!browserLiteWrapperView3.A07 && (r1 = browserLiteWrapperView3.A06) != null) {
                        r1.A0D.clear();
                        r1.A07(browserLiteWrapperView3.A0B);
                        r1.A02();
                    }
                }
            } else if (action == 1 || action == 3) {
                A00();
            }
            return this.A01.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        BrowserLiteWrapperView browserLiteWrapperView;
        int i2;
        int A052 = AnonymousClass0Z0.A05(-1134559594);
        boolean z = false;
        if (!this.A08 || (browserLiteWrapperView = this.A03) == null || browserLiteWrapperView.A07) {
            i = -1461012081;
        } else {
            boolean onTouchEvent = this.A01.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action == 0) {
                i2 = -1808168411;
            } else if (action == 1 || action == 3) {
                z2 = A00();
                i2 = 332757770;
            } else {
                if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                    z = true;
                }
                i = 1411668866;
            }
            AnonymousClass0Z0.A0C(i2, A052);
            return z2;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return z;
    }

    public BrowserLiteGestureDelegateView(Context context) {
        super(context);
    }

    public BrowserLiteGestureDelegateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
