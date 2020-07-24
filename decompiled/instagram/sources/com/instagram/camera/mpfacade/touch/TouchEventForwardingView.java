package com.instagram.camera.mpfacade.touch;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Set;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass85O;
import p000X.AnonymousClass875;
import p000X.C79823e9;
import p000X.C82553ib;
import p000X.C82703iq;
import p000X.C86093oT;
import p000X.C87223qN;
import p000X.C87243qP;
import p000X.C87253qQ;

public class TouchEventForwardingView extends View {
    public View A00;
    public C82703iq A01;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        if (r3.A9a(r8, r7, p000X.AnonymousClass0PB.A06()) == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        if (r0 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0113, code lost:
        if (r6.A09(p000X.C87223qN.BOOMERANG, p000X.C87223qN.HANDS_FREE) != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0131, code lost:
        if (r0 != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013d, code lost:
        if (p000X.C82703iq.A00(r5, r2) != false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C79823e9 r3;
        boolean z;
        AnonymousClass875 r0;
        AnonymousClass85O r02;
        Object obj;
        MotionEvent motionEvent2 = motionEvent;
        if (this.A00 == null) {
            return false;
        }
        C82703iq r5 = this.A01;
        if (r5 != null) {
            int rawX = (int) motionEvent2.getRawX();
            int rawY = (int) motionEvent2.getRawY();
            boolean z2 = true;
            if (r5.A00.A1C.A09(C87223qN.LAYOUT)) {
                if (((Set) r5.A00.A1C.A03.A00).size() > 1) {
                    AnonymousClass0QD.A02("CameraViewController", "tools incompatible");
                }
                if ((C86093oT.A00(r5.A00.A1O) || !((obj = r5.A00.A1P.A00) == C87243qP.LAYOUT_CAPTURE || obj == C87243qP.LAYOUT_COMPLETE)) && !C82703iq.A00(r5, motionEvent2) && (r02 = r5.A00.A0A) != null) {
                    Rect rect = new Rect();
                    r02.A0D.A02.getHitRect(rect);
                    if (!rect.contains(rawX, rawY)) {
                        r3 = r5.A00.A0A.A04;
                        if (r3 != null) {
                            z = true;
                        }
                        z = false;
                    }
                }
            } else {
                if (!r5.A00.A1C.A09(C87223qN.POSES)) {
                    if (!r5.A00.A1C.A08()) {
                        C87253qQ r6 = r5.A00.A1C;
                        if (!r6.A07()) {
                        }
                    }
                    if (r5.A00.A1D.A01.get()) {
                        C82553ib r32 = r5.A00;
                        if (!r32.A1g) {
                            boolean z3 = false;
                            if (r32.A0q.A00() != null) {
                                z3 = true;
                            }
                        }
                        if (motionEvent2.getAction() == 0) {
                        }
                        if (!z2) {
                            return false;
                        }
                    }
                } else if (!C82703iq.A00(r5, motionEvent2) && (r0 = r5.A00.A0B) != null) {
                    r3 = r0.A03;
                    if (r3 != null) {
                    }
                    z = false;
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        if (motionEvent2.getActionMasked() == 0) {
            motionEvent2 = MotionEvent.obtain(motionEvent2.getEventTime(), motionEvent2.getEventTime(), motionEvent2.getAction(), motionEvent2.getX(), motionEvent2.getY(), motionEvent2.getPressure(), motionEvent2.getSize(), motionEvent2.getMetaState(), motionEvent2.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags());
        }
        this.A00.dispatchTouchEvent(motionEvent2);
        return true;
    }

    public TouchEventForwardingView(Context context) {
        super(context);
    }

    public TouchEventForwardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchEventForwardingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
