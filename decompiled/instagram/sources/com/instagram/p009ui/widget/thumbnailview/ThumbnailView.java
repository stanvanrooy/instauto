package com.instagram.p009ui.widget.thumbnailview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.imageview.RoundedCornerImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass8ZN;
import p000X.AnonymousClass8ZP;
import p000X.AnonymousClass8ZR;
import p000X.AnonymousClass8ZT;
import p000X.C26571Ea;
import p000X.C31881aA;
import p000X.C39121mO;

/* renamed from: com.instagram.ui.widget.thumbnailview.ThumbnailView */
public class ThumbnailView extends FrameLayout {
    public C26571Ea A00;
    public C26571Ea A01;
    public C26571Ea A02;
    public C26571Ea A03;
    public List A04;
    public int A05;
    public int A06;
    public int A07;
    public AnonymousClass8ZN A08 = AnonymousClass8ZN.TWO_BY_TWO;

    private void A00() {
        int i;
        if (this.A04 != null) {
            int i2 = this.A06;
            AnonymousClass8ZN r1 = this.A08;
            if (r1 == AnonymousClass8ZN.TWO_COLUMNS_ONE_ROW) {
                i = (i2 << 1) + this.A05;
            } else {
                i = i2;
                if (r1 == AnonymousClass8ZN.TWO_ROWS_ONE_COLUMN) {
                    i2 = (i2 << 1) + this.A05;
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i);
            for (IgImageView layoutParams2 : this.A04) {
                layoutParams2.setLayoutParams(layoutParams);
            }
        }
    }

    private void A01() {
        this.A00.A02(8);
        List<IgImageView> list = this.A04;
        if (list != null) {
            for (IgImageView igImageView : list) {
                igImageView.setImageDrawable((Drawable) null);
                igImageView.setOnLoadListener((C31881aA) null);
                igImageView.setOnFallbackListener((C31881aA) null);
            }
        }
        this.A01.A02(8);
        this.A02.A02(8);
        this.A03.A02(8);
        this.A00.A02(8);
        getGridHolder().A02(0);
    }

    public static void A03(ThumbnailView thumbnailView) {
        thumbnailView.A01.A02(8);
        thumbnailView.A02.A02(8);
        thumbnailView.A03.A02(8);
        thumbnailView.A00.A02(8);
        thumbnailView.A00.A02(0);
    }

    private C26571Ea getGridHolder() {
        switch (this.A08.ordinal()) {
            case 1:
                return this.A03;
            case 2:
                return this.A02;
            default:
                return this.A01;
        }
    }

    private void setGridOnInflateListener(C26571Ea r2) {
        r2.A03(new AnonymousClass8ZT(this));
    }

    public static void setupGrid(ThumbnailView thumbnailView, ViewGroup viewGroup) {
        thumbnailView.A04 = new ArrayList();
        for (int findViewById : thumbnailView.A08.A00) {
            RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) viewGroup.findViewById(findViewById);
            roundedCornerImageView.setStrokeColor(thumbnailView.A07);
            thumbnailView.A04.add(roundedCornerImageView);
        }
        thumbnailView.A00();
    }

    public void setGridLayout(AnonymousClass8ZN r3) {
        boolean z = false;
        if (r3 != this.A08) {
            z = true;
        }
        this.A08 = r3;
        if (z) {
            setupGrid(this, (ViewGroup) getGridHolder().A01());
        }
    }

    private void A02(AttributeSet attributeSet) {
        AnonymousClass8ZN r1;
        Context context = getContext();
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context).inflate(C0003R.layout.thumbnail_view_layout, this).findViewById(C0003R.C0005id.container);
        this.A00 = new C26571Ea((ViewStub) roundedCornerMediaFrameLayout.findViewById(C0003R.C0005id.single_thumbnail_stub));
        C26571Ea r12 = new C26571Ea((ViewStub) roundedCornerMediaFrameLayout.findViewById(C0003R.C0005id.two_by_two_thumbnail_stub));
        this.A01 = r12;
        setGridOnInflateListener(r12);
        C26571Ea r13 = new C26571Ea((ViewStub) roundedCornerMediaFrameLayout.findViewById(C0003R.C0005id.two_rows_one_column_thumbnail_stub));
        this.A03 = r13;
        setGridOnInflateListener(r13);
        C26571Ea r14 = new C26571Ea((ViewStub) roundedCornerMediaFrameLayout.findViewById(C0003R.C0005id.two_columns_one_row_thumbnail_stub));
        this.A02 = r14;
        setGridOnInflateListener(r14);
        getContext();
        this.A05 = context.getResources().getDimensionPixelSize(C0003R.dimen.thumbnail_grid_margin);
        if (attributeSet != null) {
            getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3k);
            if (obtainStyledAttributes.hasValue(1)) {
                int i = obtainStyledAttributes.getInt(1, 0);
                AnonymousClass8ZN[] values = AnonymousClass8ZN.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        AnonymousClass0QD.A02("ThumbnailView_GridLayout", AnonymousClass000.A05("Unexpected grid layout index: ", i));
                        r1 = AnonymousClass8ZN.TWO_BY_TWO;
                        break;
                    }
                    r1 = values[i2];
                    if (r1.A01 == i) {
                        break;
                    }
                    i2++;
                }
                this.A08 = r1;
            }
            if (obtainStyledAttributes.hasValue(0)) {
                getContext();
                roundedCornerMediaFrameLayout.setRadius(obtainStyledAttributes.getDimensionPixelOffset(0, context.getResources().getDimensionPixelSize(C0003R.dimen.thumbnail_radius)));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                getContext();
                this.A07 = obtainStyledAttributes.getColor(2, AnonymousClass1BA.A01(context, C0003R.attr.strokeColor));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static void setImageForMedia(AnonymousClass1LO r1, AnonymousClass1NJ r2, ImageUrl imageUrl, IgImageView igImageView) {
        igImageView.setUrl(imageUrl);
        igImageView.setOnLoadListener(new AnonymousClass8ZP(r1, r2));
        igImageView.setOnFallbackListener(new AnonymousClass8ZR(r1, r2));
    }

    public final void onMeasure(int i, int i2) {
        int A002 = C39121mO.A00(i, i2);
        this.A06 = (View.MeasureSpec.getSize(A002) - this.A05) >> 1;
        A00();
        super.onMeasure(A002, A002);
    }

    public void setGridImages(List list) {
        A01();
        AnonymousClass0a4.A06(this.A04);
        int min = Math.min(list.size(), this.A04.size());
        for (int i = 0; i < min; i++) {
            ((RoundedCornerImageView) this.A04.get(i)).setUrl((ImageUrl) list.get(i));
        }
    }

    public void setGridImagesFromMedia(Context context, AnonymousClass1LO r7, List list) {
        A01();
        AnonymousClass0a4.A06(this.A04);
        int min = Math.min(list.size(), this.A04.size());
        for (int i = 0; i < min; i++) {
            setImageForMedia(r7, (AnonymousClass1NJ) list.get(i), ((AnonymousClass1NJ) list.get(i)).A0S(context), (IgImageView) this.A04.get(i));
        }
    }

    public void setSingleImageFromMedia(AnonymousClass1NJ r2, ImageUrl imageUrl, AnonymousClass1LO r4) {
        A03(this);
        if (r2 != null) {
            setImageForMedia(r4, r2, imageUrl, (IgImageView) this.A00.A01());
        } else {
            ((IgImageView) this.A00.A01()).setUrl(imageUrl);
        }
    }

    public void setSingleImageFromUrl(ImageUrl imageUrl, String str) {
        A03(this);
        ((IgImageView) this.A00.A01()).setUrl(imageUrl, str);
    }

    public ThumbnailView(Context context) {
        super(context);
        A02((AttributeSet) null);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(attributeSet);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(attributeSet);
    }
}
