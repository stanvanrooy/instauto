package com.instagram.reels.interactive.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C13300iJ;
import p000X.C168587Hw;

public class AvatarView extends View {
    public final C168587Hw A00;

    public void setAvatarSecondaryStrokeColor(int i) {
        C168587Hw r1 = this.A00;
        r1.A04.setColor(i);
        r1.invalidateSelf();
    }

    public void setAvatarSecondaryStrokeWidth(int i) {
        C168587Hw r1 = this.A00;
        r1.A00 = (float) i;
        r1.invalidateSelf();
    }

    public void setAvatarUrl(ImageUrl imageUrl) {
        this.A00.A00(imageUrl);
    }

    public void setAvatarUser(C13300iJ r2) {
        this.A00.A01(r2);
    }

    public void setStrokeColor(int i) {
        C168587Hw r1 = this.A00;
        r1.A05.setColor(i);
        r1.invalidateSelf();
    }

    public void setStrokeWidth(int i) {
        C168587Hw r1 = this.A00;
        r1.A01 = (float) i;
        r1.invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int A03 = AnonymousClass0Z0.A03(-2059590778);
        super.draw(canvas);
        this.A00.draw(canvas);
        AnonymousClass0Z0.A0A(84522386, A03);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(-823627433);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00.setBounds(0, 0, i, i2);
        AnonymousClass0Z0.A0D(-1084320302, A06);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A00) {
            return true;
        }
        return false;
    }

    public AvatarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C168587Hw r0 = new C168587Hw(context);
        this.A00 = r0;
        r0.setCallback(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0L);
        setStrokeColor(obtainStyledAttributes.getColor(0, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        obtainStyledAttributes.recycle();
    }
}
