package p000X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: X.A6P */
public final class A6P extends ViewGroup implements A47 {
    public DialogInterface.OnShowListener A00;
    public A3F A01;
    public C23087A6a A02;
    public boolean A03;
    public Dialog A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final void addChildrenForAccessibility(ArrayList arrayList) {
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void onHostPause() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private void A00() {
        AnonymousClass0FY.A01(this.A04, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.A04.getWindow().addFlags(1024);
            } else {
                this.A04.getWindow().clearFlags(1024);
            }
        }
        if (this.A03) {
            this.A04.getWindow().clearFlags(2);
            return;
        }
        this.A04.getWindow().setDimAmount(0.5f);
        this.A04.getWindow().setFlags(2, 2);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.A01);
        if (this.A08) {
            frameLayout.setSystemUiVisibility(1024);
            return frameLayout;
        }
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        this.A01.dispatchProvideStructure(viewStructure);
    }

    public final View getChildAt(int i) {
        return this.A01.getChildAt(i);
    }

    public int getChildCount() {
        return this.A01.getChildCount();
    }

    public void setAnimationType(String str) {
        this.A05 = str;
        this.A07 = true;
    }

    public void setHardwareAccelerated(boolean z) {
        this.A06 = z;
        this.A07 = true;
    }

    public void setStatusBarTranslucent(boolean z) {
        this.A08 = z;
        this.A07 = true;
    }

    public A6P(Context context) {
        super(context);
        ((A3N) context).A06(this);
        this.A01 = new A3F(context);
    }

    public static void A01(A6P a6p) {
        Context context;
        Context baseContext;
        C228039ra.A00();
        Dialog dialog = a6p.A04;
        if (dialog != null) {
            if (dialog.isShowing()) {
                Context context2 = a6p.A04.getContext();
                Class<Activity> cls = Activity.class;
                while (true) {
                    if (cls.isInstance(context2)) {
                        context = context2;
                        break;
                    }
                    context = null;
                    if (!(context2 instanceof ContextWrapper) || context2 == (baseContext = ((ContextWrapper) context2).getBaseContext())) {
                        break;
                    }
                    context2 = baseContext;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    a6p.A04.dismiss();
                }
            }
            a6p.A04 = null;
            ((ViewGroup) a6p.A01.getParent()).removeViewAt(0);
        }
    }

    private Activity getCurrentActivity() {
        return ((A3N) getContext()).A00();
    }

    public final void A02() {
        Context context;
        C228039ra.A00();
        if (this.A04 != null) {
            if (this.A07) {
                A01(this);
            } else {
                A00();
                return;
            }
        }
        this.A07 = false;
        int i = 2131886792;
        String str = this.A05;
        if (str.equals("fade")) {
            i = 2131886793;
        } else if (str.equals("slide")) {
            i = 2131886794;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            context = getContext();
        } else {
            context = currentActivity;
        }
        Dialog dialog = new Dialog(context, i);
        this.A04 = dialog;
        dialog.getWindow().setFlags(8, 8);
        this.A04.setContentView(getContentView());
        A00();
        this.A04.setOnShowListener(this.A00);
        this.A04.setOnKeyListener(new A6T(this));
        this.A04.getWindow().setSoftInputMode(16);
        if (this.A06) {
            this.A04.getWindow().addFlags(16777216);
        }
        if (currentActivity != null && !currentActivity.isFinishing()) {
            this.A04.show();
            if (context instanceof Activity) {
                this.A04.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.A04.getWindow().clearFlags(8);
        }
    }

    public final void addView(View view, int i) {
        C228039ra.A00();
        this.A01.addView(view, i);
    }

    public Dialog getDialog() {
        return this.A04;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1638196554);
        super.onDetachedFromWindow();
        A01(this);
        AnonymousClass0Z0.A0D(618305628, A062);
    }

    public final void onHostDestroy() {
        ((A3N) getContext()).A07(this);
        A01(this);
    }

    public final void onHostResume() {
        A02();
    }

    public final void removeView(View view) {
        C228039ra.A00();
        this.A01.removeView(view);
    }

    public final void removeViewAt(int i) {
        C228039ra.A00();
        this.A01.removeView(getChildAt(i));
    }

    public void setOnRequestCloseListener(C23087A6a a6a) {
        this.A02 = a6a;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.A00 = onShowListener;
    }

    public void setTransparent(boolean z) {
        this.A03 = z;
    }
}
