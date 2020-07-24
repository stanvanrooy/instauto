package p000X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Bl2 */
public class Bl2 extends AnonymousClass2WF {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public C24277Al4 A03;
    public BottomSheetBehavior A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    public Bl2(Context context, int i) {
        super(context, i);
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(C0003R.attr.bottomSheetDialogTheme, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = 2131886791;
            }
        }
        this.A00 = true;
        this.A01 = true;
        this.A03 = new C26409Bky(this);
        A01().A0X(1);
    }

    private View A00(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0003R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0003R.C0005id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(C0003R.C0005id.design_bottom_sheet);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(frameLayout2);
        this.A04 = A012;
        A012.A0A = this.A03;
        A012.A0E = this.A00;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0003R.C0005id.touch_outside).setOnClickListener(new C26413Bl4(this));
        AnonymousClass1E1.A0b(frameLayout2, new C7F(this));
        frameLayout2.setOnTouchListener(new Bl6(this));
        return frameLayout;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Process.WAIT_RESULT_TIMEOUT);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A04;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A07 == 5) {
            bottomSheetBehavior.A0R(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A00 != z) {
            this.A00 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A04;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0E = z;
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A00) {
            this.A00 = true;
        }
        this.A01 = z;
        this.A02 = true;
    }

    public final void setContentView(int i) {
        super.setContentView(A00(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView(A00(0, view, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A00(0, view, layoutParams));
    }
}
