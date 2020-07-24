package com.instagram.direct.p018ui.thumbnailgrid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import p000X.C06220Of;
import p000X.C111894ri;
import p000X.C111904rj;
import p000X.C35651gi;

/* renamed from: com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView */
public class ThumbnailGridView extends LinearLayout {
    public C111904rj A00;
    public boolean A01;
    public final IgImageView[] A02;
    public final LinearLayout A03;
    public final LinearLayout A04;

    public void setHorizontalGridDivider(Drawable drawable) {
        setShowDividers(2);
        setDividerDrawable(drawable);
    }

    public void setListener(C111904rj r5) {
        this.A00 = r5;
        if (r5 != null && !this.A01) {
            int i = 0;
            while (true) {
                IgImageView[] igImageViewArr = this.A02;
                if (i < igImageViewArr.length) {
                    C35651gi r1 = new C35651gi(igImageViewArr[i]);
                    r1.A05 = new C111894ri(this);
                    r1.A00();
                    i++;
                } else {
                    this.A01 = true;
                    return;
                }
            }
        }
    }

    public void setThumbnailHeight(int i) {
        C06220Of.A0K(this.A04, i);
        C06220Of.A0K(this.A03, i);
    }

    public void setThumbnailPreviews(List list) {
        if (list == null || list.isEmpty()) {
            this.A04.setVisibility(8);
            this.A03.setVisibility(8);
            return;
        }
        if (list.size() <= 3) {
            this.A04.setVisibility(0);
            this.A03.setVisibility(8);
        } else {
            this.A04.setVisibility(0);
            this.A03.setVisibility(0);
        }
        for (IgImageView visibility : this.A02) {
            visibility.setVisibility(4);
        }
        int min = Math.min(list.size(), this.A02.length);
        for (int i = 0; i < min; i++) {
            this.A02[i].setUrl((ImageUrl) list.get(i));
            this.A02[i].setVisibility(0);
        }
    }

    public void setVerticalGridDivider(Drawable drawable) {
        this.A04.setShowDividers(2);
        this.A04.setDividerDrawable(drawable);
        this.A03.setShowDividers(2);
        this.A03.setDividerDrawable(drawable);
    }

    public ThumbnailGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ThumbnailGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbnailGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new IgImageView[6];
        setOrientation(1);
        LayoutInflater.from(context).inflate(C0003R.layout.direct_thumbnail_grid, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0003R.C0005id.top_image_row);
        this.A04 = linearLayout;
        this.A02[0] = (IgImageView) linearLayout.findViewById(C0003R.C0005id.image1);
        this.A02[1] = (IgImageView) this.A04.findViewById(C0003R.C0005id.image2);
        this.A02[2] = (IgImageView) this.A04.findViewById(C0003R.C0005id.image3);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0003R.C0005id.bottom_image_row);
        this.A03 = linearLayout2;
        this.A02[3] = (IgImageView) linearLayout2.findViewById(C0003R.C0005id.image4);
        this.A02[4] = (IgImageView) this.A03.findViewById(C0003R.C0005id.image5);
        this.A02[5] = (IgImageView) this.A03.findViewById(C0003R.C0005id.image6);
    }
}
