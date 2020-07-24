package com.instagram.igtv.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.p009ui.widget.textview.IgAutoCompleteTextView;
import p000X.AnonymousClass19r;
import p000X.C06220Of;
import p000X.C173637bO;
import p000X.C173647bP;
import p000X.C173657bQ;
import p000X.C173667bR;
import p000X.C173677bS;
import p000X.C173687bT;
import p000X.C27491Ib;
import p000X.C27511Id;
import p000X.C28991Oe;
import p000X.C67682xf;

public class TitleDescriptionEditor extends ConstraintLayout implements AnonymousClass19r, C28991Oe {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public TextWatcher A07;
    public TextWatcher A08;
    public View.OnClickListener A09 = null;
    public View A0A;
    public View A0B;
    public ViewGroup A0C;
    public FrameLayout A0D;
    public FrameLayout A0E;
    public IgImageView A0F;
    public C27511Id A0G;
    public C173667bR A0H = null;
    public IgAutoCompleteTextView A0I;
    public IgAutoCompleteTextView A0J;
    public boolean A0K = false;
    public boolean A0L = true;

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void AyU() {
    }

    public final void Ayk(View view) {
    }

    public final void Azd() {
    }

    public final void Azh() {
    }

    public final void BKp(Bundle bundle) {
    }

    public final void BP6() {
    }

    public final void BVv(Bundle bundle) {
    }

    public final void onStart() {
    }

    public static void A00(TitleDescriptionEditor titleDescriptionEditor, boolean z) {
        IgAutoCompleteTextView igAutoCompleteTextView = titleDescriptionEditor.A0I;
        if (titleDescriptionEditor.A0H != null && igAutoCompleteTextView.getLayout() != null) {
            ScrollView AVH = titleDescriptionEditor.A0H.AVH();
            int height = (AVH.getHeight() - titleDescriptionEditor.A04) - titleDescriptionEditor.A05;
            int scrollY = AVH.getScrollY();
            int selectionEnd = igAutoCompleteTextView.getSelectionEnd();
            Layout layout = igAutoCompleteTextView.getLayout();
            int lineForOffset = layout.getLineForOffset(selectionEnd);
            int lineTop = layout.getLineTop(lineForOffset) + igAutoCompleteTextView.getPaddingTop();
            int lineBottom = layout.getLineBottom(lineForOffset) + igAutoCompleteTextView.getPaddingTop();
            int top = igAutoCompleteTextView.getTop() - titleDescriptionEditor.A05;
            int i = (lineTop + top) - titleDescriptionEditor.A06;
            int baseline = ((top + lineBottom) + titleDescriptionEditor.A0I.getBaseline()) - (titleDescriptionEditor.A0C.getHeight() - (layout.getLineBottom(0) << 1));
            titleDescriptionEditor.A02 = baseline;
            int height2 = (height - baseline) - titleDescriptionEditor.A0C.getHeight();
            int min = Math.min(i, scrollY) + height2;
            titleDescriptionEditor.A00 = min;
            if (i >= scrollY) {
                int i2 = titleDescriptionEditor.A01;
                if (min < i2) {
                    i = i2 - height2;
                } else {
                    return;
                }
            }
            if (z) {
                AVH.smoothScrollTo(0, i);
            } else {
                AVH.scrollTo(0, i);
            }
        }
    }

    public final void A04(boolean z) {
        View view = this.A0B;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = this.A0A;
        if (!z) {
            i = 4;
        }
        view2.setVisibility(i);
    }

    public final void B8g(int i, boolean z) {
        C173667bR r0 = this.A0H;
        if (r0 != null) {
            Activity activity = r0.getActivity();
            ScrollView AVH = r0.AVH();
            View AVI = this.A0H.AVI();
            this.A04 = i;
            AVI.setPadding(0, this.A05, 0, i + this.A03);
            post(new C173637bO(this, AVH, activity));
        }
    }

    public final void BE0() {
        C27511Id r1 = this.A0G;
        if (r1.Ahr()) {
            r1.BP6();
            this.A0G.BbF(this);
        }
        this.A0J.removeTextChangedListener(this.A08);
        this.A0I.removeTextChangedListener(this.A07);
        C06220Of.A0E(this.A0I);
    }

    public final void BJx() {
        C173667bR r0 = this.A0H;
        if (r0 != null) {
            this.A0G.BOP(r0.getActivity());
            this.A0G.A3j(this);
        }
        this.A0J.addTextChangedListener(this.A08);
        this.A0I.addTextChangedListener(this.A07);
    }

    public String getDescriptionText() {
        return this.A0I.getText().toString();
    }

    public String getTitleText() {
        return this.A0J.getText().toString();
    }

    public void setDescriptionHint(int i) {
        this.A0I.setHint(i);
    }

    public void setDescriptionText(String str) {
        this.A0I.setText(str);
    }

    public void setMaxTitleLength(int i) {
        this.A0J.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setTitleHint(int i) {
        this.A0J.setHint(i);
    }

    public void setTitleText(String str) {
        this.A0J.setText(str);
    }

    public final void BVf(View view, Bundle bundle) {
        C67682xf AAX;
        C67682xf AAX2;
        this.A0J = (IgAutoCompleteTextView) findViewById(C0003R.C0005id.title_text);
        this.A0I = (IgAutoCompleteTextView) findViewById(C0003R.C0005id.description_text);
        Resources resources = getResources();
        this.A01 = resources.getDimensionPixelSize(C0003R.dimen.autocomplete_list_item_height) << 1;
        IgAutoCompleteTextView igAutoCompleteTextView = this.A0J;
        C173667bR r0 = this.A0H;
        if (!(r0 == null || (AAX2 = r0.AAX()) == null)) {
            igAutoCompleteTextView.setAlwaysShowWhenEnoughToFilter(true);
            igAutoCompleteTextView.setAdapter(AAX2);
        }
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A0I;
        C173667bR r02 = this.A0H;
        if (!(r02 == null || (AAX = r02.AAX()) == null)) {
            igAutoCompleteTextView2.setAlwaysShowWhenEnoughToFilter(true);
            igAutoCompleteTextView2.setAdapter(AAX);
        }
        this.A08 = new C173657bQ(this);
        this.A07 = new C173647bP(this);
        this.A0I.setOnItemClickListener(new C173677bS(this));
        this.A0B = findViewById(C0003R.C0005id.title_error);
        this.A0A = findViewById(C0003R.C0005id.title_error_icon);
        this.A0C = (ViewGroup) findViewById(C0003R.C0005id.text_container);
        this.A0D = (FrameLayout) findViewById(C0003R.C0005id.preview_container);
        this.A0F = (IgImageView) findViewById(C0003R.C0005id.preview);
        this.A0E = (FrameLayout) findViewById(C0003R.C0005id.title_container);
        this.A0D.setOnClickListener(new C173687bT(this));
        if (this.A0L) {
            TypedValue typedValue = new TypedValue();
            getResources();
            resources.getValue(C0003R.dimen.media_preview_ratio, typedValue, true);
            int A092 = C06220Of.A09(getContext());
            int i = (int) (((float) A092) * typedValue.getFloat());
            C06220Of.A0U(this.A0D, i);
            C06220Of.A0U(this.A0C, A092 - i);
        } else {
            this.A0D.setVisibility(8);
        }
        Context context = getContext();
        this.A06 = Math.round(C06220Of.A03(context, 14));
        getContext();
        this.A0G = C27491Ib.A00((ComponentActivity) context);
        C173667bR r03 = this.A0H;
        if (r03 != null) {
            r03.BSx();
        }
    }

    public IgImageView getMediaPreview() {
        return this.A0F;
    }

    public void setDelegate(C173667bR r1) {
        this.A0H = r1;
    }

    public void setFooterHeightPx(int i) {
        this.A03 = i;
    }

    public void setMediaPreviewClickListener(View.OnClickListener onClickListener) {
        this.A09 = onClickListener;
    }

    public void setScrollContentTopPadding(int i) {
        this.A05 = i;
    }

    public TitleDescriptionEditor(Context context) {
        super(context);
        View.inflate(getContext(), C0003R.layout.title_description_layout, this);
    }

    public TitleDescriptionEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C0003R.layout.title_description_layout, this);
    }

    public TitleDescriptionEditor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), C0003R.layout.title_description_layout, this);
    }
}
