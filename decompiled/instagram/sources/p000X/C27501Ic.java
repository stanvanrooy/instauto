package p000X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1Ic  reason: invalid class name and case insensitive filesystem */
public final class C27501Ic implements C27511Id {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public View A04;
    public boolean A05;
    public int A06;
    public View.OnAttachStateChangeListener A07;
    public View A08;
    public WindowManager A09;
    public final Set A0A = new CopyOnWriteArraySet();
    public final int[] A0B = new int[2];
    public final ViewTreeObserver.OnGlobalLayoutListener A0C = new C27521Ie(this);
    public final AnonymousClass1E0 A0D = new C27531If(this);

    private void A00() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View view = this.A08;
        if (!(view == null || (onAttachStateChangeListener = this.A07) == null)) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.A07 = null;
        View view2 = this.A04;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this.A0C);
            AnonymousClass1E1.A0c(this.A04, (AnonymousClass1E0) null);
            if (this.A04.isAttachedToWindow()) {
                this.A09.removeViewImmediate(this.A04);
            }
            this.A09 = null;
            this.A04 = null;
            this.A06 = 0;
        }
    }

    public static void A01(C27501Ic r5, int i) {
        for (C28991Oe r3 : r5.A0A) {
            boolean z = false;
            if (r5.A06 == 48) {
                z = true;
            }
            r3.B8g(i, z);
        }
    }

    public final void A3j(C28991Oe r2) {
        this.A0A.add(r2);
    }

    public final boolean Ahr() {
        if (this.A08 != null) {
            return true;
        }
        return false;
    }

    public final void BbF(C28991Oe r2) {
        this.A0A.remove(r2);
    }

    public static void A02(C27501Ic r9, Activity activity) {
        r9.A00();
        IBinder windowToken = r9.A08.getWindowToken();
        if (!activity.isFinishing()) {
            boolean z = false;
            if (activity.isDestroyed()) {
                z = true;
            }
            if (!z && windowToken != null) {
                int i = activity.getWindow().getAttributes().type;
                if (i < 1000 || i > 1999) {
                    r9.A06 = activity.getWindow().getAttributes().softInputMode & 240;
                    r9.A09 = (WindowManager) activity.getSystemService("window");
                    r9.A04 = new View(activity);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
                    layoutParams.softInputMode = 16;
                    layoutParams.token = windowToken;
                    try {
                        r9.A09.addView(r9.A04, layoutParams);
                        r9.A04.getViewTreeObserver().addOnGlobalLayoutListener(r9.A0C);
                        AnonymousClass1E1.A0c(r9.A04, r9.A0D);
                    } catch (WindowManager.BadTokenException e) {
                        AnonymousClass0QD.A07("KeyboardHeightChangeDetectorImpl", "BadTokenException when trying to add window", e);
                        r9.A09 = null;
                        r9.A04 = null;
                        r9.A06 = 0;
                    }
                } else {
                    AnonymousClass0QD.A04("KeyboardHeightChangeDetectorImpl", AnonymousClass000.A05("Attempted to add window with token that is a sub-window of type: ", i), 1);
                }
            }
        }
    }

    public final void BOP(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        this.A08 = decorView;
        if (decorView.getWindowToken() != null) {
            A02(this, activity);
        } else if (this.A07 == null) {
            C33141cR r1 = new C33141cR(this, activity);
            this.A07 = r1;
            this.A08.addOnAttachStateChangeListener(r1);
        }
    }

    public final void BP6() {
        A00();
        this.A08 = null;
    }

    public final void Bmw(boolean z) {
        this.A05 = z;
    }
}
