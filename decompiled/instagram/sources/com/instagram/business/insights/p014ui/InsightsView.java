package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.thumbnailview.ThumbnailView;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C26812Bsx;
import p000X.C36981iv;
import p000X.C74;
import p000X.C77;
import p000X.C78;
import p000X.C79;
import p000X.C7A;
import p000X.C7B;
import p000X.C7C;

/* renamed from: com.instagram.business.insights.ui.InsightsView */
public class InsightsView extends LinearLayout {
    public View A00;
    public LinearLayout.LayoutParams A01;
    public LinearLayout.LayoutParams A02;
    public LinearLayout.LayoutParams A03;
    public LinearLayout.LayoutParams A04;
    public LinearLayout A05;
    public C7C A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public int A0A;
    public int A0B;
    public View A0C;
    public C26812Bsx A0D;
    public IgTextView A0E;
    public final Typeface A0F = Typeface.create("Roboto-Regular", 0);

    private void setSurfaceFromAttribute(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2b);
            if (obtainStyledAttributes.hasValue(0)) {
                int i = obtainStyledAttributes.getInt(0, 0);
                if (i == 0) {
                    this.A0D = C26812Bsx.STORY;
                } else if (i == 1) {
                    this.A0D = C26812Bsx.POST;
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A06("InsightsView Surface[", i, "] undefined"));
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private ImageView A01(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(C0003R.C0004drawable.instagram_info_outline_24);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(this.A02);
        int i = this.A0B;
        imageView.setPadding(i, i, i, i);
        imageView.setContentDescription(context.getString(C0003R.string.info));
        imageView.setOnClickListener(new C7A(this));
        return imageView;
    }

    private IgTextView A02(Context context, int i, int i2) {
        IgTextView igTextView = new IgTextView(context);
        igTextView.setTextSize(0, context.getResources().getDimension(i));
        igTextView.setTextColor(C019000b.A00(context, i2));
        igTextView.setTypeface(this.A0F);
        return igTextView;
    }

    public final void A04(C7B c7b) {
        C7B c7b2 = c7b;
        this.A0E.setText(c7b2.A00);
        this.A09.setText(c7b2.A04);
        this.A05.removeAllViews();
        if (this.A0D == C26812Bsx.POST || c7b2.A01 > 0) {
            this.A08.setVisibility(0);
            Integer num = c7b2.A02;
            if (num == Constants.ZERO) {
                this.A08.setText(C36981iv.A01(c7b2.A01));
            } else if (num == Constants.A0C) {
                this.A08.setText(C0003R.string.not_available_text);
                this.A08.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_text));
            }
            this.A00.setVisibility(0);
            this.A05.setVisibility(0);
            IgTextView igTextView = this.A09;
            Resources resources = getResources();
            igTextView.setTextSize(0, resources.getDimension(C0003R.dimen.font_medium));
            IgTextView igTextView2 = this.A09;
            Context context = getContext();
            igTextView2.setTextColor(C019000b.A00(context, C0003R.color.igds_secondary_text));
            if (c7b2.A05 != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                getResources();
                layoutParams.topMargin = resources.getDimensionPixelSize(C0003R.dimen.insights_section_margin_vertical);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                getResources();
                layoutParams2.topMargin = resources.getDimensionPixelSize(C0003R.dimen.insights_sub_section_margin_top);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                getResources();
                layoutParams3.bottomMargin = resources.getDimensionPixelSize(C0003R.dimen.insights_section_margin_vertical);
                for (C74 c74 : c7b2.A05) {
                    List list = c74.A04;
                    if (list == null || list.isEmpty()) {
                        getResources();
                        layoutParams.bottomMargin = resources.getDimensionPixelSize(C0003R.dimen.insights_section_margin_vertical);
                        this.A05.addView(A00(c74), layoutParams);
                    } else {
                        getResources();
                        layoutParams.bottomMargin = resources.getDimensionPixelSize(C0003R.dimen.insights_section_bottom_margin);
                        this.A05.addView(A00(c74), layoutParams);
                        getContext();
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        for (int i = 0; i < c74.A04.size(); i++) {
                            C77 c77 = (C77) c74.A04.get(i);
                            getContext();
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setOrientation(0);
                            ImageUrl imageUrl = c77.A01;
                            ImageUrl imageUrl2 = imageUrl;
                            if (imageUrl != null) {
                                ThumbnailView thumbnailView = new ThumbnailView(context);
                                thumbnailView.setSingleImageFromUrl(imageUrl2, "insights_view");
                                thumbnailView.setLayoutParams(this.A03);
                                linearLayout2.addView(thumbnailView);
                                linearLayout2.setGravity(16);
                            }
                            IgTextView A022 = A02(context, C0003R.dimen.font_medium, C0003R.color.igds_secondary_text);
                            A022.setText(c77.A04);
                            if (c77.A03 != null) {
                                linearLayout2.setOnClickListener(new C78(this, c77));
                                getContext();
                                A022.setTextColor(C019000b.A00(context, C0003R.color.igds_primary_text));
                            }
                            linearLayout2.addView(A022, this.A04);
                            if (c77.A02.intValue() != 1) {
                                IgTextView A023 = A02(context, C0003R.dimen.font_medium, C0003R.color.igds_secondary_text);
                                A023.setText(C36981iv.A01(c77.A00));
                                linearLayout2.addView(A023, this.A01);
                            } else {
                                linearLayout2.addView(A01(context), this.A02);
                            }
                            linearLayout.addView(linearLayout2, layoutParams2);
                        }
                        this.A05.addView(linearLayout, layoutParams3);
                    }
                }
            }
            if (c7b2.A03 != null) {
                this.A07.setVisibility(0);
                this.A07.setText(c7b2.A03);
                return;
            }
            return;
        }
        this.A08.setVisibility(8);
        this.A05.setVisibility(8);
        this.A09.setTextSize(0, getResources().getDimension(C0003R.dimen.font_medium));
        this.A09.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_primary_text));
    }

    private View A00(C74 c74) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        IgTextView A022 = A02(context, C0003R.dimen.font_medium_xlarge, C0003R.color.igds_primary_text);
        A022.setText(c74.A00);
        linearLayout.addView(A022, this.A04);
        switch (c74.A02.intValue()) {
            case 0:
                IgTextView A023 = A02(context, C0003R.dimen.font_medium_xlarge, C0003R.color.igds_primary_text);
                A023.setText(C36981iv.A01(c74.A01));
                linearLayout.addView(A023, this.A01);
                return linearLayout;
            case 1:
                linearLayout.addView(A01(context), this.A02);
                return linearLayout;
            default:
                IgTextView A024 = A02(context, C0003R.dimen.font_medium_xlarge, C0003R.color.igds_secondary_text);
                A024.setText(C0003R.string.not_available_text);
                linearLayout.addView(A024, this.A01);
                return linearLayout;
        }
    }

    private void A03(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.layout_insights_view, this);
        this.A0C = inflate;
        this.A0E = (IgTextView) inflate.findViewById(C0003R.C0005id.insights_title);
        this.A08 = (IgTextView) this.A0C.findViewById(C0003R.C0005id.insights_value);
        this.A09 = (IgTextView) this.A0C.findViewById(C0003R.C0005id.insights_value_message);
        this.A07 = (IgTextView) this.A0C.findViewById(C0003R.C0005id.insights_footer);
        this.A05 = (LinearLayout) this.A0C.findViewById(C0003R.C0005id.insights_sections_view);
        View findViewById = this.A0C.findViewById(C0003R.C0005id.insights_info);
        this.A00 = findViewById;
        findViewById.setOnClickListener(new C79(this));
        Resources resources = getResources();
        this.A0B = resources.getDimensionPixelSize(C0003R.dimen.insights_view_margin_small);
        this.A0A = resources.getDimensionPixelSize(C0003R.dimen.insights_view_margin_medium);
        this.A04 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.A01 = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_section_blocked_icon_size);
        this.A02 = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0003R.dimen.post_insights_subsection_media_thumbnail_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        this.A03 = layoutParams;
        layoutParams.setMargins(0, 0, this.A0A, 0);
    }

    public void setDelegate(C7C c7c) {
        this.A06 = c7c;
    }

    public void setSurface(C26812Bsx bsx) {
        this.A0D = bsx;
    }

    public InsightsView(Context context) {
        super(context);
        A03(context);
    }

    public InsightsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context);
        setSurfaceFromAttribute(context, attributeSet);
    }
}
