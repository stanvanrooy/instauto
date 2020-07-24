package p000X;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.AMN */
public final class AMN {
    public final View A00;
    public final View A01;
    public final View A02;
    public final boolean A03;

    public static Animator A00(AMN amn, int i, int i2, int i3, int i4, ANH anh) {
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.WIDTH, new int[]{i, i2}), PropertyValuesHolder.ofInt("margin", new int[]{i3, i4})});
        ofPropertyValuesHolder.setDuration(400);
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        ofPropertyValuesHolder.addUpdateListener(new AMV(amn));
        ofPropertyValuesHolder.addListener(new AMY(amn, anh));
        return ofPropertyValuesHolder;
    }

    public AMN(boolean z, View view, View view2, View view3) {
        this.A03 = z;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }
}
