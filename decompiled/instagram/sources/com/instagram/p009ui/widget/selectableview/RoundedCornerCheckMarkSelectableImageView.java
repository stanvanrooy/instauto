package com.instagram.p009ui.widget.selectableview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C176467gB;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView */
public class RoundedCornerCheckMarkSelectableImageView extends C176467gB {
    public int A00;
    public ImageView A01;
    public RoundedCornerMediaFrameLayout A02;
    public final List A03 = new ArrayList();

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3B);
        if (!obtainStyledAttributes.hasValue(2) || !obtainStyledAttributes.hasValue(1)) {
            throw new RuntimeException("Width and height required");
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context2).inflate(C0003R.layout.rounded_corner_check_mark_selectable_image_view, this, false);
        this.A02 = roundedCornerMediaFrameLayout;
        if (dimensionPixelSize != 0) {
            roundedCornerMediaFrameLayout.getLayoutParams().width = dimensionPixelSize;
            this.A02.getLayoutParams().height = dimensionPixelSize2;
        }
        this.A02.setRadius(this.A00);
        this.A03.add((IgImageView) this.A02.findViewById(C0003R.C0005id.selectable_image));
        ImageView imageView = (ImageView) this.A02.findViewById(C0003R.C0005id.select_check_mark);
        this.A01 = imageView;
        getContext();
        imageView.setColorFilter(C26771Ff.A00(C019000b.A00(context2, C0003R.color.white)));
        addView(this.A02);
    }

    public final void A01() {
        ((IgImageView) this.A03.get(0)).setImageDrawable((Drawable) null);
        ((IgImageView) this.A03.get(0)).setBackgroundResource(AnonymousClass1BA.A03(getContext(), C0003R.attr.elevatedImagePlaceholderColor));
    }

    public void setImageDrawable(Drawable drawable) {
        ((IgImageView) this.A03.get(0)).setImageDrawable(drawable);
    }

    public void setUrl(ImageUrl imageUrl, String str) {
        ((IgImageView) this.A03.get(0)).setUrl(imageUrl, str);
    }

    public List getImageViews() {
        return this.A03;
    }

    public ImageView getOverlayImage() {
        return this.A01;
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
