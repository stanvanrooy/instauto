package com.instagram.igds.components.search;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass64T;
import p000X.AnonymousClass662;
import p000X.C019000b;
import p000X.C1417164d;
import p000X.C1417364f;
import p000X.C1418764t;

public class InlineSearchBox extends LinearLayout {
    public View.OnFocusChangeListener A00;
    public View A01;
    public InputMethodManager A02;
    public EditText A03;
    public ColorFilterAlphaImageView A04;
    public ColorFilterAlphaImageView A05;
    public ColorFilterAlphaImageView A06;
    public AnonymousClass662 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final void A05(int i) {
        if (i == 1) {
            A04();
        }
    }

    public final void A06(int i, int i2, View.OnClickListener onClickListener) {
        this.A0A = true;
        this.A05.setImageResource(i);
        if (onClickListener != null) {
            this.A05.setOnClickListener(onClickListener);
        }
        this.A05.setContentDescription(getContext().getString(i2));
        A01(this, TextUtils.isEmpty(getSearchString()));
    }

    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        this.A03.clearFocus();
        setFocusableInTouchMode(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r5 == false) goto L_0x001a;
     */
    public static void A01(InlineSearchBox inlineSearchBox, boolean z) {
        boolean z2;
        boolean isFocused = inlineSearchBox.A03.isFocused();
        inlineSearchBox.setVisibilityOfClearButton(!z);
        boolean z3 = false;
        if (inlineSearchBox.A0A) {
            inlineSearchBox.setVisibilityOfCustomActionButton(z);
            ColorFilterAlphaImageView colorFilterAlphaImageView = inlineSearchBox.A05;
            if (isFocused) {
                z2 = true;
            }
            z2 = false;
            colorFilterAlphaImageView.setSelected(z2);
        }
        inlineSearchBox.setSelected(isFocused);
        inlineSearchBox.A06.setEnabled(isFocused);
        ColorFilterAlphaImageView colorFilterAlphaImageView2 = inlineSearchBox.A04;
        if (isFocused && !z) {
            z3 = true;
        }
        colorFilterAlphaImageView2.setSelected(z3);
    }

    public final void A02() {
        AnonymousClass662 r1 = this.A07;
        if (r1 != null) {
            r1.onSearchCleared(getSearchString());
        }
        this.A03.setText("");
        this.A03.requestFocus();
        if (!this.A08) {
            this.A09 = true;
        } else {
            this.A02.showSoftInput(this.A03, 0);
        }
    }

    public final void A03() {
        this.A03.setTextIsSelectable(false);
        this.A03.setFocusable(false);
        this.A03.setFocusableInTouchMode(false);
        this.A03.setEnabled(false);
        this.A03.setClickable(false);
        this.A03.setLongClickable(false);
        this.A03.clearFocus();
    }

    public final void A07(String str) {
        this.A03.setText(str);
    }

    public String getSearchString() {
        return this.A03.getText().toString().trim();
    }

    public void setImeOptions(int i) {
        this.A03.setImeOptions(6);
    }

    public void setVisibilityOfClearButton(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A04;
        int i = 8;
        if (z) {
            i = 0;
        }
        colorFilterAlphaImageView.setVisibility(i);
    }

    public void setVisibilityOfCustomActionButton(boolean z) {
        if (this.A0A) {
            ColorFilterAlphaImageView colorFilterAlphaImageView = this.A05;
            int i = 8;
            if (z) {
                i = 0;
            }
            colorFilterAlphaImageView.setVisibility(i);
        }
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.igds_search_row, this);
        setDescendantFocusability(DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        this.A01 = inflate.findViewById(C0003R.C0005id.search_row);
        EditText editText = (EditText) inflate.findViewById(C0003R.C0005id.search_edit_text);
        this.A03 = editText;
        editText.addTextChangedListener(new AnonymousClass64T(this));
        this.A03.setOnFocusChangeListener(new C1417164d(this));
        if (attributeSet != null) {
            getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2Z);
            if (!TextUtils.isEmpty(obtainStyledAttributes.getString(0))) {
                this.A03.setHint(obtainStyledAttributes.getString(0));
            }
            if (!obtainStyledAttributes.getBoolean(1, true)) {
                A03();
            }
            obtainStyledAttributes.recycle();
        }
        EditText editText2 = this.A03;
        getContext();
        editText2.setHintTextColor(C019000b.A00(context, C0003R.color.grey_5));
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) inflate.findViewById(C0003R.C0005id.action_button);
        this.A04 = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setOnClickListener(new C1418764t(this));
        this.A04.setContentDescription(getResources().getString(C0003R.string.clear_button_description));
        this.A05 = (ColorFilterAlphaImageView) inflate.findViewById(C0003R.C0005id.custom_action_button);
        this.A06 = (ColorFilterAlphaImageView) inflate.findViewById(C0003R.C0005id.search_bar_glyph);
        A01(this, TextUtils.isEmpty(getSearchString()));
        getContext();
        this.A02 = (InputMethodManager) context.getSystemService("input_method");
    }

    public final void A04() {
        clearFocus();
        this.A02.hideSoftInputFromWindow(getWindowToken(), 0);
        this.A09 = false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A08 = true;
        if (this.A09) {
            post(new C1417364f(this));
            this.A09 = false;
        }
    }

    public void setEditTextOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00 = onFocusChangeListener;
    }

    public void setListener(AnonymousClass662 r1) {
        this.A07 = r1;
    }

    public InlineSearchBox(Context context) {
        super(context);
        A00((AttributeSet) null);
    }

    public InlineSearchBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public InlineSearchBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    public void setHint(int i) {
        this.A03.setHint(i);
    }

    public void setHint(String str) {
        this.A03.setHint(str);
    }
}
