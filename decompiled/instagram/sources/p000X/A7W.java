package p000X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.A7W */
public final class A7W extends C25861Aq implements Animatable {
    public C23100A7e A00;
    public ArgbEvaluator A01 = null;
    public Context A02;
    public final Drawable.Callback A03 = new C23105A7j(this);

    private void A00(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                A00(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.A01 == null) {
                    this.A01 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.A01);
            }
        }
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A09(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C55072a1.A0C(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.A00.A02.draw(canvas);
        if (this.A00.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A00.A02.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C55072a1.A01(drawable);
        }
        return this.A00.A02.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C23099A7d(drawable.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A00.A02.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A00.A02.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A00.A02.getOpacity();
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A00.A02.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A00.A00.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A00.A02.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.A00.A02.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.A00.A02.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A00.A02.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A00.A02.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A02.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A00.A02.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A06(drawable, i);
        } else {
            this.A00.A02.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A08(drawable, colorStateList);
        } else {
            this.A00.A02.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A0B(drawable, mode);
        } else {
            this.A00.A02.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A00.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.A00.A00.isStarted()) {
            this.A00.A00.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A00.A00.end();
        }
    }

    public A7W(Context context) {
        this.A02 = context;
        this.A00 = new C23100A7e();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.A00;
        if (drawable != null) {
            C55072a1.A0A(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = AnonymousClass21B.A02(resources, theme, attributeSet, AnonymousClass21A.A00);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C25851Ap A002 = C25851Ap.A00(resources, resourceId, theme);
                        A002.A01 = false;
                        A002.setCallback(this.A03);
                        C25851Ap r1 = this.A00.A02;
                        if (r1 != null) {
                            r1.setCallback((Drawable.Callback) null);
                        }
                        this.A00.A02 = A002;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, AnonymousClass21A.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A02;
                        if (context != null) {
                            Animator A003 = A7X.A00(context, resourceId2);
                            A003.setTarget(this.A00.A02.A00.A08.A0E.get(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                A00(A003);
                            }
                            C23100A7e a7e = this.A00;
                            if (a7e.A03 == null) {
                                a7e.A03 = new ArrayList();
                                a7e.A01 = new C04450Ea();
                            }
                            a7e.A03.add(A003);
                            this.A00.A01.put(A003, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        C23100A7e a7e2 = this.A00;
        if (a7e2.A00 == null) {
            a7e2.A00 = new AnimatorSet();
        }
        a7e2.A00.playTogether(a7e2.A03);
    }
}
