package com.instagram.igds.components.form;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.HashSet;
import java.util.Set;
import p000X.AnonymousClass0RU;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.B7D;
import p000X.C06400Ox;
import p000X.C26227Bhj;
import p000X.C26571Ea;
import p000X.C27035Bwn;
import p000X.C27036Bwo;
import p000X.C27037Bwp;

public class IgFormField extends ConstraintLayout {
    public EditText A00;
    public TextView A01;
    public C26227Bhj A02;
    public C27036Bwo A03;
    public TextView A04;
    public Set A05;
    public boolean A06;

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(341);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void A04() {
        C26227Bhj.A00(this.A02);
    }

    public final void A05(TextWatcher textWatcher) {
        if (this.A05 == null) {
            this.A05 = new HashSet();
        }
        this.A05.add(textWatcher);
        this.A00.addTextChangedListener(textWatcher);
    }

    public final void A06(TextWatcher textWatcher) {
        Set set = this.A05;
        if (set != null) {
            set.remove(textWatcher);
        }
        this.A00.removeTextChangedListener(textWatcher);
    }

    public CharSequence getText() {
        return this.A00.getText();
    }

    public boolean isAnimationInProgress() {
        return this.A03.A05;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.A00.setId(savedState.A00);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public void setInputType(int i) {
        this.A00.setInputType(i);
    }

    public void setLabelText(String str) {
        C26227Bhj bhj = this.A02;
        bhj.A03 = str;
        if (bhj.A07.A01.equals("valid")) {
            this.A01.setText(str);
            this.A04.setText(str);
        }
    }

    public void setMaxLength(int i) {
        if (i > 0) {
            this.A00.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public void setRuleChecker(B7D b7d) {
        this.A02.A02 = b7d;
    }

    public void setText(CharSequence charSequence) {
        String str;
        this.A00.setText(charSequence);
        this.A00.setSelection(charSequence.length());
        boolean z = false;
        if (charSequence.length() == 0) {
            z = true;
        }
        TextView textView = this.A01;
        int i = 4;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        C27036Bwo bwo = this.A03;
        if (z) {
            str = "inline";
        } else {
            str = "top";
        }
        bwo.A00(str, false);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        inflate(context, C0003R.layout.form_field_layout, this);
        EditText editText = (EditText) findViewById(C0003R.C0005id.form_field_edit_text);
        this.A00 = editText;
        editText.setOnFocusChangeListener(new C27035Bwn(this));
        this.A00.addTextChangedListener(new C27037Bwp(this));
        this.A00.setId(View.generateViewId());
        this.A01 = (TextView) findViewById(C0003R.C0005id.form_field_label_inline);
        TextView textView = (TextView) findViewById(C0003R.C0005id.form_field_label_top);
        this.A04 = textView;
        textView.setVisibility(4);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.form_field_horizontal_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0003R.dimen.form_field_vertical_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.A02 = new C26227Bhj(this.A04, this.A00, new C26571Ea((ViewStub) findViewById(C0003R.C0005id.form_field_end_indicator_view)), new C26571Ea((ViewStub) findViewById(C0003R.C0005id.form_field_end_loading_view)));
        this.A03 = new C27036Bwo(this.A01, this.A04);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2H, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        if (string != null) {
            setLabelText(string);
        }
        obtainStyledAttributes.recycle();
    }

    private AnonymousClass0RU getAnalyticsLogger() {
        Context context = getContext();
        if (!(context instanceof IgFragmentActivity)) {
            return null;
        }
        IgFragmentActivity igFragmentActivity = (IgFragmentActivity) context;
        if (igFragmentActivity.A0L() != null) {
            return AnonymousClass0WN.A01(igFragmentActivity.A0L());
        }
        return null;
    }

    public EditText getEditText() {
        return this.A00;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(836914370);
        super.onAttachedToWindow();
        AnonymousClass0RU analyticsLogger = getAnalyticsLogger();
        if (analyticsLogger != null) {
            analyticsLogger.Ba2(this.A00);
        }
        this.A00.addTextChangedListener(this.A02);
        AnonymousClass0Z0.A0D(1112322413, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1947562244);
        AnonymousClass0RU analyticsLogger = getAnalyticsLogger();
        if (analyticsLogger != null) {
            analyticsLogger.BsB(this.A00);
        }
        Set<TextWatcher> set = this.A05;
        if (set != null) {
            for (TextWatcher removeTextChangedListener : set) {
                this.A00.removeTextChangedListener(removeTextChangedListener);
            }
            this.A05.clear();
        }
        this.A00.removeTextChangedListener(this.A02);
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(-621327316, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A06) {
            this.A06 = true;
            C27036Bwo bwo = this.A03;
            bwo.A04 = true;
            if (bwo.A07.getHeight() == 0) {
                bwo.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                bwo.A00 = ((float) bwo.A08.getHeight()) / ((float) bwo.A07.getHeight());
            }
            bwo.A01 = (int) (bwo.A08.getY() - bwo.A07.getY());
            if (C06400Ox.A02(bwo.A07.getContext())) {
                TextView textView = bwo.A07;
                textView.setPivotX((float) textView.getWidth());
                TextView textView2 = bwo.A07;
                textView2.setPivotY((float) textView2.getHeight());
            } else {
                bwo.A07.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                bwo.A07.setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            String str = bwo.A03;
            if (str != null) {
                bwo.A00(str, bwo.A06);
                bwo.A03 = null;
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = this.A00.getId();
        return savedState;
    }

    public IgFormField(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public IgFormField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public IgFormField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
