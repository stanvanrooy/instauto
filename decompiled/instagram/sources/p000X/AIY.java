package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

/* renamed from: X.AIY */
public class AIY extends FrameLayout {
    public C23328AId A00;
    public C23329AIe A01;
    public final AccessibilityManager A02;
    public final C23327AIc A03;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4;
        int i6 = i3;
        super.onLayout(z, i, i2, i6, i5);
        C23329AIe aIe = this.A01;
        if (aIe != null) {
            aIe.B8r(this, i, i2, i6, i5);
        }
    }

    public static void setClickableOrFocusableBasedOnAccessibility(AIY aiy, boolean z) {
        aiy.setClickable(!z);
        aiy.setFocusable(z);
    }

    public AIY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C712039k.A0M);
        if (obtainStyledAttributes.hasValue(1)) {
            AnonymousClass1E1.A0O(this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.A02 = accessibilityManager;
        C23326AIb aIb = new C23326AIb(this);
        this.A03 = aIb;
        accessibilityManager.addTouchExplorationStateChangeListener(new C23325AIa(aIb));
        setClickableOrFocusableBasedOnAccessibility(this, this.A02.isTouchExplorationEnabled());
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(1997438247);
        super.onAttachedToWindow();
        AnonymousClass1E1.A0J(this);
        AnonymousClass0Z0.A0D(-2104590064, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(-422997081);
        super.onDetachedFromWindow();
        C23328AId aId = this.A00;
        if (aId != null) {
            aId.onViewDetachedFromWindow(this);
        }
        AccessibilityManager accessibilityManager = this.A02;
        C23327AIc aIc = this.A03;
        if (aIc != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new C23325AIa(aIc));
        }
        AnonymousClass0Z0.A0D(1299515988, A06);
    }

    public void setOnAttachStateChangeListener(C23328AId aId) {
        this.A00 = aId;
    }

    public void setOnLayoutChangeListener(C23329AIe aIe) {
        this.A01 = aIe;
    }
}
