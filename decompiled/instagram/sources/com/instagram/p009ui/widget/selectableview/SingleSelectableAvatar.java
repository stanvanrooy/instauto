package com.instagram.p009ui.widget.selectableview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1GF;
import p000X.AnonymousClass6BI;
import p000X.C019000b;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.selectableview.SingleSelectableAvatar */
public class SingleSelectableAvatar extends AnonymousClass6BI {
    public ImageView A00;
    public CircularImageView A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3O);
        int i = 0;
        if (obtainStyledAttributes.hasValue(0)) {
            i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(C0003R.layout.selectable_avatar_single, this, true);
        this.A01 = (CircularImageView) inflate.findViewById(C0003R.C0005id.selectable_avatar);
        ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.select_check_mark);
        this.A00 = imageView;
        getContext();
        imageView.setColorFilter(C26771Ff.A00(C019000b.A00(context2, C0003R.color.white)));
        if (i != 0) {
            this.A01.getLayoutParams().width = i;
            this.A01.getLayoutParams().height = i;
        }
    }

    public Drawable getStrokeDrawable() {
        Context context = getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.selectable_view_stroke_width);
        getContext();
        return new AnonymousClass1GF(dimensionPixelSize, C019000b.A00(context, C0003R.color.blue_5));
    }

    public void setCheckmark(boolean z) {
        if (z) {
            this.A01.setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.black_60_transparent)));
            this.A00.setVisibility(0);
            return;
        }
        this.A01.setColorFilter((ColorFilter) null);
        this.A00.setVisibility(8);
    }

    public void setImageDrawable(Drawable drawable) {
        this.A01.setImageDrawable(drawable);
    }

    public void setUrl(ImageUrl imageUrl) {
        this.A01.setUrl(imageUrl);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.setAlpha(255);
    }

    public SingleSelectableAvatar(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
