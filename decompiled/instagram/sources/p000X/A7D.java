package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A7D */
public final class A7D extends ImageView {
    public Animation.AnimationListener A00;
    public int A01;
    public int A02;

    public A7D(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        Context context2 = getContext();
        float f = context2.getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER * f);
        this.A02 = (int) (3.5f * f);
        getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(A7T.A05);
        this.A01 = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AnonymousClass1E1.A0O(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new A7I(this, this.A02));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.A02, (float) i2, (float) i, 503316480);
            int i3 = this.A02;
            setPadding(i3, i3, i3, i3);
        }
        shapeDrawable.getPaint().setColor(this.A01);
        AnonymousClass1E1.A0a(this, shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.A00;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.A00;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        if (!z) {
            setMeasuredDimension(getMeasuredWidth() + (this.A02 << 1), getMeasuredHeight() + (this.A02 << 1));
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.A01 = i;
        }
    }
}
