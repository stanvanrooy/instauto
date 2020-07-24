package com.instagram.igds.components.facepile;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass67W;
import p000X.C019000b;
import p000X.C39511n2;

public class IgFacepile extends FrameLayout {
    public int A00;

    public void setImageBitmaps(List list) {
        if (list.size() < 3) {
            return;
        }
        if (this.A00 == 1) {
            setLargePileBitmaps(list);
            return;
        }
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.facepile_holder);
        Context context = getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.facepile_standard_diameter);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            arrayList.add(AnonymousClass67W.A01(context, (Bitmap) list.get(i), resources.getDimensionPixelSize(C0003R.dimen.facepile_standard_diameter), resources.getDimensionPixelSize(C0003R.dimen.facepile_standard_outer_stroke_width), C019000b.A00(context, C0003R.color.facepile_standard_outer_stroke_color)));
        }
        imageView.setImageDrawable(new C39511n2(context, arrayList, dimensionPixelSize, 0.42f, true, Constants.ZERO));
    }

    public void setImageUris(List list) {
        if (list.size() < 3) {
            return;
        }
        if (this.A00 == 1) {
            setLargePileUris(list);
            return;
        }
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.facepile_holder);
        Context context = getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.facepile_standard_diameter);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            arrayList.add(AnonymousClass67W.A02(context, (ImageUrl) list.get(i), resources.getDimensionPixelSize(C0003R.dimen.facepile_standard_diameter), resources.getDimensionPixelSize(C0003R.dimen.facepile_standard_outer_stroke_width), C019000b.A00(context, C0003R.color.facepile_standard_outer_stroke_color)));
        }
        imageView.setImageDrawable(new C39511n2(context, arrayList, dimensionPixelSize, 0.42f, true, Constants.ZERO));
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2G, 0, 0);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        if (this.A00 == 1) {
            inflate(context, C0003R.layout.facepile_large, this);
        } else {
            inflate(context, C0003R.layout.facepile_standard, this);
        }
    }

    private void setLargePileBitmaps(List list) {
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_left);
        Context context = getContext();
        imageView.setImageDrawable(AnonymousClass67W.A00(context, (Bitmap) list.get(0)));
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_center);
        getContext();
        Resources resources = context.getResources();
        imageView2.setImageDrawable(AnonymousClass67W.A01(context, (Bitmap) list.get(1), resources.getDimensionPixelSize(C0003R.dimen.facepile_large_diameter_primary), resources.getDimensionPixelSize(C0003R.dimen.facepile_large_outer_stroke_width), C019000b.A00(context, C0003R.color.facepile_large_outer_stroke_color)));
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_right);
        getContext();
        imageView3.setImageDrawable(AnonymousClass67W.A00(context, (Bitmap) list.get(2)));
        imageView3.setVisibility(0);
    }

    private void setLargePileUris(List list) {
        IgImageView igImageView = (IgImageView) findViewById(C0003R.C0005id.facepile_avatar_left);
        Context context = getContext();
        igImageView.setImageDrawable(AnonymousClass67W.A02(context, (ImageUrl) list.get(0), context.getResources().getDimensionPixelSize(C0003R.dimen.facepile_large_diameter_secondary), 0, 0));
        igImageView.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_center);
        getContext();
        Resources resources = context.getResources();
        imageView.setImageDrawable(AnonymousClass67W.A02(context, (ImageUrl) list.get(1), resources.getDimensionPixelSize(C0003R.dimen.facepile_large_diameter_primary), resources.getDimensionPixelSize(C0003R.dimen.facepile_large_outer_stroke_width), C019000b.A00(context, C0003R.color.facepile_large_outer_stroke_color)));
        imageView.setVisibility(0);
        IgImageView igImageView2 = (IgImageView) findViewById(C0003R.C0005id.facepile_avatar_right);
        getContext();
        igImageView2.setImageDrawable(AnonymousClass67W.A02(context, (ImageUrl) list.get(2), context.getResources().getDimensionPixelSize(C0003R.dimen.facepile_large_diameter_secondary), 0, 0));
        igImageView2.setVisibility(0);
    }

    public void setImageDrawables(List list) {
        if (list.size() >= 3) {
            ImageView imageView = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_left);
            imageView.setImageDrawable((Drawable) list.get(0));
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_center);
            imageView2.setImageDrawable((Drawable) list.get(1));
            imageView2.setVisibility(0);
            ImageView imageView3 = (ImageView) findViewById(C0003R.C0005id.facepile_avatar_right);
            imageView3.setImageDrawable((Drawable) list.get(2));
            imageView3.setVisibility(0);
        }
    }

    public IgFacepile(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public IgFacepile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public IgFacepile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
