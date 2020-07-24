package p000X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.AIM */
public final class AIM implements C27511Id {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public View A03;
    public int A04;
    public View.OnAttachStateChangeListener A05;
    public View A06;
    public WindowManager A07;
    public final Set A08 = new CopyOnWriteArraySet();
    public final int[] A09 = new int[2];
    public final ViewTreeObserver.OnGlobalLayoutListener A0A = new AIN(this);

    public static void A00(AIM aim, int i) {
        for (C28991Oe r3 : aim.A08) {
            boolean z = false;
            if (aim.A04 == 48) {
                z = true;
            }
            r3.B8g(i, z);
        }
    }

    public static void A01(AIM aim, Activity activity) {
        if (aim.A03 == null) {
            IBinder windowToken = aim.A06.getWindowToken();
            if (!activity.isFinishing()) {
                boolean z = false;
                if (activity.isDestroyed()) {
                    z = true;
                }
                if (!z && windowToken != null) {
                    int i = activity.getWindow().getAttributes().type;
                    if (i < 1000 || i > 1999) {
                        aim.A04 = activity.getWindow().getAttributes().softInputMode & 240;
                        aim.A07 = (WindowManager) activity.getSystemService("window");
                        aim.A03 = new View(activity);
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
                        layoutParams.softInputMode = 16;
                        layoutParams.token = windowToken;
                        try {
                            aim.A07.addView(aim.A03, layoutParams);
                            aim.A03.getViewTreeObserver().addOnGlobalLayoutListener(aim.A0A);
                        } catch (WindowManager.BadTokenException e) {
                            AnonymousClass0QD.A07("KeyboardHeightChangeDetectorV2", "BadTokenException when trying to add window", e);
                            aim.A07 = null;
                            aim.A03 = null;
                            aim.A04 = 0;
                        }
                    } else {
                        AnonymousClass0QD.A04("KeyboardHeightChangeDetectorV2", AnonymousClass000.A05("Attempted to add window with token that is a sub-window of type: ", i), 1);
                    }
                }
            }
        }
    }

    public final void A02() {
        WindowManager windowManager;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        this.A08.clear();
        View view = this.A06;
        if (!(view == null || (onAttachStateChangeListener = this.A05) == null)) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.A05 = null;
        View view2 = this.A03;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this.A0A);
            if (this.A03.isAttachedToWindow() && (windowManager = this.A07) != null) {
                windowManager.removeViewImmediate(this.A03);
            }
        }
        this.A07 = null;
        this.A03 = null;
        this.A04 = 0;
        this.A06 = null;
    }

    public final void A3j(C28991Oe r2) {
        this.A08.add(r2);
    }

    public final boolean Ahr() {
        if (this.A06 != null) {
            return true;
        }
        return false;
    }

    public final void BP6() {
        if (this.A08.isEmpty()) {
            A02();
        }
    }

    public final void BbF(C28991Oe r2) {
        this.A08.remove(r2);
    }

    public final void Bmw(boolean z) {
        AnonymousClass0QD.A01("KeyboardHeightChangeDetectorV2", "shouldIgnoreNavigationBarVisibilityChanges() is not supported");
    }

    public final void BOP(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        this.A06 = decorView;
        if (decorView.getWindowToken() != null) {
            A01(this, activity);
        } else if (this.A05 == null) {
            AIP aip = new AIP(this, activity);
            this.A05 = aip;
            this.A06.addOnAttachStateChangeListener(aip);
        }
    }
}
