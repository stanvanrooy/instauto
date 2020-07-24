package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Method;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass3In;
import p000X.AnonymousClass7O0;
import p000X.AnonymousClass7O8;
import p000X.AnonymousClass98D;
import p000X.AnonymousClass98G;
import p000X.AnonymousClass98J;
import p000X.AnonymousClass98L;
import p000X.AnonymousClass98P;
import p000X.AnonymousClass98Q;
import p000X.AnonymousClass98U;
import p000X.AnonymousClass98V;
import p000X.AnonymousClass98W;
import p000X.AnonymousClass98Y;
import p000X.C019000b;
import p000X.C208718yk;
import p000X.C2110298d;
import p000X.C2111898z;
import p000X.C25751Ad;
import p000X.C25831An;
import p000X.C25841Ao;
import p000X.C474223w;
import p000X.C55072a1;
import p000X.C711939j;
import p000X.C712039k;

public class TextInputLayout extends LinearLayout {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public ValueAnimator A04;
    public ColorStateList A05;
    public GradientDrawable A06;
    public EditText A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public PorterDuff.Mode A0O;
    public Typeface A0P;
    public Drawable A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public Drawable A0T;
    public TextView A0U;
    public CheckableImageButton A0V;
    public CharSequence A0W;
    public CharSequence A0X;
    public CharSequence A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final int A0e;
    public final int A0f;
    public final AnonymousClass98G A0g;
    public final AnonymousClass98J A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final Rect A0q;
    public final RectF A0r;
    public final FrameLayout A0s;

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new AnonymousClass98Y();
        public CharSequence A00;
        public boolean A01;

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.A00 + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.A00, parcel, i);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A01 = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void A0F(TextView textView, int i) {
        boolean z = true;
        try {
            AnonymousClass3In.A06(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            AnonymousClass3In.A06(textView, AnonymousClass98W.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C019000b.A00(getContext(), C0003R.color.design_error));
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0E = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0E = false;
    }

    private int A00() {
        float A052;
        if (this.A0A) {
            int i = this.A01;
            if (i == 0 || i == 1) {
                A052 = this.A0g.A05();
            } else if (i == 2) {
                A052 = this.A0g.A05() / 2.0f;
            }
            return (int) A052;
        }
        return 0;
    }

    private void A01() {
        int i;
        Drawable drawable;
        if (this.A06 != null) {
            int i2 = this.A01;
            if (i2 == 1) {
                this.A02 = 0;
            } else if (i2 == 2 && this.A03 == 0) {
                this.A03 = this.A05.getColorForState(getDrawableState(), this.A05.getDefaultColor());
            }
            EditText editText = this.A07;
            if (editText != null && this.A01 == 2) {
                if (editText.getBackground() != null) {
                    this.A0Q = this.A07.getBackground();
                }
                AnonymousClass1E1.A0a(this.A07, (Drawable) null);
            }
            EditText editText2 = this.A07;
            if (!(editText2 == null || this.A01 != 1 || (drawable = this.A0Q) == null)) {
                AnonymousClass1E1.A0a(editText2, drawable);
            }
            int i3 = this.A02;
            if (i3 > -1 && (i = this.A0K) != 0) {
                this.A06.setStroke(i3, i);
            }
            this.A06.setCornerRadii(getCornerRadiiAsArray());
            this.A06.setColor(this.A0J);
            invalidate();
        }
    }

    private void A02() {
        Drawable drawable;
        Drawable drawable2 = this.A0S;
        if (drawable2 == null) {
            return;
        }
        if (this.A0a || this.A0b) {
            Drawable mutate = C55072a1.A02(drawable2).mutate();
            this.A0S = mutate;
            if (this.A0a) {
                C55072a1.A08(mutate, this.A0N);
            }
            if (this.A0b) {
                C55072a1.A0B(this.A0S, this.A0O);
            }
            CheckableImageButton checkableImageButton = this.A0V;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.A0S)) {
                this.A0V.setImageDrawable(drawable);
            }
        }
    }

    private void A03() {
        int i = this.A01;
        if (i == 0) {
            this.A06 = null;
        } else if (i == 2 && this.A0A && !(this.A06 instanceof AnonymousClass7O0)) {
            this.A06 = new AnonymousClass7O0();
        } else if (!(this.A06 instanceof GradientDrawable)) {
            this.A06 = new GradientDrawable();
        }
        if (this.A01 != 0) {
            A05();
        }
        A07();
    }

    private void A05() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A0s.getLayoutParams();
        int A002 = A00();
        if (A002 != layoutParams.topMargin) {
            layoutParams.topMargin = A002;
            this.A0s.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if ((r1.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) == false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5  */
    private void A06() {
        boolean z;
        boolean z2;
        EditText editText = this.A07;
        if (editText != null) {
            if (this.A0C) {
                if (editText != null) {
                    z2 = true;
                }
                z2 = false;
                if (z2 || this.A0D) {
                    z = true;
                    if (!z) {
                        if (this.A0V == null) {
                            CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0003R.layout.design_text_input_password_icon, this.A0s, false);
                            this.A0V = checkableImageButton;
                            checkableImageButton.setImageDrawable(this.A0S);
                            this.A0V.setContentDescription(this.A0Y);
                            this.A0s.addView(this.A0V);
                            this.A0V.setOnClickListener(new AnonymousClass98U(this));
                        }
                        EditText editText2 = this.A07;
                        if (editText2 != null && editText2.getMinimumHeight() <= 0) {
                            this.A07.setMinimumHeight(this.A0V.getMinimumHeight());
                        }
                        this.A0V.setVisibility(0);
                        this.A0V.setChecked(this.A0D);
                        if (this.A0T == null) {
                            this.A0T = new ColorDrawable();
                        }
                        this.A0T.setBounds(0, 0, this.A0V.getMeasuredWidth(), 1);
                        Drawable[] compoundDrawablesRelative = this.A07.getCompoundDrawablesRelative();
                        Drawable drawable = compoundDrawablesRelative[2];
                        Drawable drawable2 = this.A0T;
                        if (drawable != drawable2) {
                            this.A0R = drawable;
                        }
                        this.A07.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable2, compoundDrawablesRelative[3]);
                        this.A0V.setPadding(this.A07.getPaddingLeft(), this.A07.getPaddingTop(), this.A07.getPaddingRight(), this.A07.getPaddingBottom());
                        return;
                    }
                    CheckableImageButton checkableImageButton2 = this.A0V;
                    if (checkableImageButton2 != null && checkableImageButton2.getVisibility() == 0) {
                        this.A0V.setVisibility(8);
                    }
                    if (this.A0T != null) {
                        Drawable[] compoundDrawablesRelative2 = this.A07.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative2[2] == this.A0T) {
                            this.A07.setCompoundDrawablesRelative(compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], this.A0R, compoundDrawablesRelative2[3]);
                            this.A0T = null;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (!z) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    private void A07() {
        int i;
        EditText editText;
        Drawable background;
        if (this.A01 != 0 && this.A06 != null && this.A07 != null && getRight() != 0) {
            int left = this.A07.getLeft();
            EditText editText2 = this.A07;
            if (editText2 != null) {
                int i2 = this.A01;
                if (i2 == 1) {
                    i = editText2.getTop();
                } else if (i2 == 2) {
                    i = editText2.getTop() + A00();
                }
                int right = this.A07.getRight();
                int bottom = this.A07.getBottom() + this.A0i;
                if (this.A01 == 2) {
                    int i3 = this.A0k;
                    int i4 = i3 >> 1;
                    left += i4;
                    i -= i4;
                    right -= i4;
                    bottom += i3 / 2;
                }
                this.A06.setBounds(left, i, right, bottom);
                A01();
                editText = this.A07;
                if (editText == null && (background = editText.getBackground()) == null) {
                    if (C25841Ao.A03(background)) {
                        background = background.mutate();
                    }
                    C208718yk.A00(this, this.A07, new Rect());
                    Rect bounds = background.getBounds();
                    if (bounds.left != bounds.right) {
                        Rect rect = new Rect();
                        background.getPadding(rect);
                        background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right << 1), this.A07.getBottom());
                        return;
                    }
                    return;
                }
                return;
            }
            i = 0;
            int right2 = this.A07.getRight();
            int bottom2 = this.A07.getBottom() + this.A0i;
            if (this.A01 == 2) {
            }
            this.A06.setBounds(left, i, right2, bottom2);
            A01();
            editText = this.A07;
            if (editText == null && (background = editText.getBackground()) == null) {
            }
        }
    }

    private boolean A0A() {
        if (!this.A0A || TextUtils.isEmpty(this.A0W) || !(this.A06 instanceof AnonymousClass7O0)) {
            return false;
        }
        return true;
    }

    private Drawable getBoxBackground() {
        int i = this.A01;
        if (i == 1 || i == 2) {
            return this.A06;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1 == false) goto L_0x001e;
     */
    private void setEditText(EditText editText) {
        boolean z;
        if (this.A07 == null) {
            this.A07 = editText;
            A03();
            setTextInputAccessibilityDelegate(new AnonymousClass98L(this));
            EditText editText2 = this.A07;
            if (editText2 != null) {
                boolean z2 = editText2.getTransformationMethod() instanceof PasswordTransformationMethod;
                z = true;
            }
            z = false;
            if (!z) {
                AnonymousClass98G r1 = this.A0g;
                Typeface typeface = this.A07.getTypeface();
                r1.A0F = typeface;
                r1.A0E = typeface;
                r1.A08();
            }
            AnonymousClass98G r2 = this.A0g;
            float textSize = this.A07.getTextSize();
            if (r2.A07 != textSize) {
                r2.A07 = textSize;
                r2.A08();
            }
            int gravity = this.A07.getGravity();
            AnonymousClass98G r22 = this.A0g;
            int i = (gravity & -113) | 48;
            if (r22.A08 != i) {
                r22.A08 = i;
                r22.A08();
            }
            AnonymousClass98G r12 = this.A0g;
            if (r12.A09 != gravity) {
                r12.A09 = gravity;
                r12.A08();
            }
            this.A07.addTextChangedListener(new AnonymousClass98Q(this));
            if (this.A0M == null) {
                this.A0M = this.A07.getHintTextColors();
            }
            if (this.A0A) {
                if (TextUtils.isEmpty(this.A0W)) {
                    CharSequence hint = this.A07.getHint();
                    this.A0X = hint;
                    setHint(hint);
                    this.A07.setHint((CharSequence) null);
                }
                this.A0d = true;
            }
            if (this.A0U != null) {
                A0E(this.A07.getText().length());
            }
            this.A0h.A04();
            A06();
            A09(this, false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0W)) {
            this.A0W = charSequence;
            AnonymousClass98G r1 = this.A0g;
            if (charSequence == null || !charSequence.equals(r1.A0G)) {
                r1.A0G = charSequence;
                r1.A0H = null;
                r1.A08();
            }
            if (!this.A0B) {
                A04();
            }
        }
    }

    public final void A0B() {
        Drawable background;
        Drawable background2;
        boolean z;
        int currentTextColor;
        EditText editText = this.A07;
        if (editText != null && (background = editText.getBackground()) != null) {
            int i = Build.VERSION.SDK_INT;
            if ((i == 21 || i == 22) && (background2 = this.A07.getBackground()) != null && !this.A08) {
                Drawable newDrawable = background2.getConstantState().newDrawable();
                if (background2 instanceof DrawableContainer) {
                    DrawableContainer drawableContainer = (DrawableContainer) background2;
                    Drawable.ConstantState constantState = newDrawable.getConstantState();
                    if (!AnonymousClass98V.A01) {
                        try {
                            Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainer.DrawableContainerState.class});
                            AnonymousClass98V.A00 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                            Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
                        }
                        AnonymousClass98V.A01 = true;
                    }
                    Method method = AnonymousClass98V.A00;
                    if (method != null) {
                        try {
                            method.invoke(drawableContainer, new Object[]{constantState});
                            z = true;
                        } catch (Exception unused2) {
                            Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
                        }
                        this.A08 = z;
                    }
                    z = false;
                    this.A08 = z;
                }
                if (!this.A08) {
                    AnonymousClass1E1.A0a(this.A07, newDrawable);
                    this.A08 = true;
                    A03();
                }
            }
            if (C25841Ao.A03(background)) {
                background = background.mutate();
            }
            if (this.A0h.A08()) {
                TextView textView = this.A0h.A07;
                if (textView == null) {
                    currentTextColor = -1;
                }
                currentTextColor = textView.getCurrentTextColor();
            } else {
                if (!this.A0Z || (textView = this.A0U) == null) {
                    C55072a1.A03(background);
                    this.A07.refreshDrawableState();
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C25751Ad.A00(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0.hasFocus() == false) goto L_0x0014;
     */
    public final void A0C() {
        boolean z;
        int i;
        TextView textView;
        int i2;
        if (this.A06 != null && this.A01 != 0) {
            EditText editText = this.A07;
            boolean z2 = true;
            if (editText != null) {
                z = true;
            }
            z = false;
            EditText editText2 = this.A07;
            if (editText2 == null || !editText2.isHovered()) {
                z2 = false;
            }
            if (this.A01 == 2) {
                if (!isEnabled()) {
                    i = this.A0o;
                } else if (this.A0h.A08()) {
                    TextView textView2 = this.A0h.A07;
                    if (textView2 != null) {
                        i = textView2.getCurrentTextColor();
                    } else {
                        i = -1;
                    }
                } else if (this.A0Z && (textView = this.A0U) != null) {
                    this.A0K = textView.getCurrentTextColor();
                    if ((!z2 || z) && isEnabled()) {
                        i2 = this.A0k;
                    } else {
                        i2 = this.A0j;
                    }
                    this.A02 = i2;
                    A01();
                } else if (z) {
                    i = this.A03;
                } else if (z2) {
                    i = this.A0p;
                } else {
                    i = this.A0n;
                }
                this.A0K = i;
                if (!z2) {
                }
                i2 = this.A0k;
                this.A02 = i2;
                A01();
            }
        }
    }

    public final void A0D(float f) {
        if (this.A0g.A06 != f) {
            if (this.A04 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A04 = valueAnimator;
                valueAnimator.setInterpolator(C2111898z.A02);
                this.A04.setDuration(167);
                this.A04.addUpdateListener(new AnonymousClass98P(this));
            }
            this.A04.setFloatValues(new float[]{this.A0g.A06, f});
            this.A04.start();
        }
    }

    public final void A0E(int i) {
        int i2;
        boolean z = this.A0Z;
        if (this.A0L == -1) {
            this.A0U.setText(String.valueOf(i));
            this.A0U.setContentDescription((CharSequence) null);
            this.A0Z = false;
        } else {
            if (this.A0U.getAccessibilityLiveRegion() == 1) {
                this.A0U.setAccessibilityLiveRegion(0);
            }
            boolean z2 = false;
            if (i > this.A0L) {
                z2 = true;
            }
            this.A0Z = z2;
            if (z != z2) {
                TextView textView = this.A0U;
                if (z2) {
                    i2 = this.A0l;
                } else {
                    i2 = this.A0m;
                }
                A0F(textView, i2);
                if (this.A0Z) {
                    this.A0U.setAccessibilityLiveRegion(1);
                }
            }
            TextView textView2 = this.A0U;
            Context context = getContext();
            Integer valueOf = Integer.valueOf(i);
            textView2.setText(context.getString(C0003R.string.character_counter_pattern, new Object[]{valueOf, Integer.valueOf(this.A0L)}));
            TextView textView3 = this.A0U;
            getContext();
            textView3.setContentDescription(context.getString(C0003R.string.character_counter_content_description, new Object[]{valueOf, Integer.valueOf(this.A0L)}));
        }
        if (this.A07 != null && z != this.A0Z) {
            A09(this, false, false);
            A0C();
            A0B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 == false) goto L_0x0017;
     */
    public final void A0G(boolean z) {
        boolean z2;
        if (this.A0C) {
            int selectionEnd = this.A07.getSelectionEnd();
            EditText editText = this.A07;
            if (editText != null) {
                boolean z3 = editText.getTransformationMethod() instanceof PasswordTransformationMethod;
                z2 = true;
            }
            z2 = false;
            if (z2) {
                this.A07.setTransformationMethod((TransformationMethod) null);
                this.A0D = true;
            } else {
                this.A07.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.A0D = false;
            }
            this.A0V.setChecked(this.A0D);
            if (z) {
                this.A0V.jumpDrawablesToCurrentState();
            }
            this.A07.setSelection(selectionEnd);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.A0s.addView(view, layoutParams2);
            this.A0s.setLayoutParams(layoutParams);
            A05();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.A0X == null || (editText = this.A07) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.A0d;
        this.A0d = false;
        CharSequence hint = editText.getHint();
        this.A07.setHint(this.A0X);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.A07.setHint(hint);
            this.A0d = z;
        }
    }

    public final void drawableStateChanged() {
        boolean z;
        if (!this.A0c) {
            boolean z2 = true;
            this.A0c = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!isLaidOut() || !isEnabled()) {
                z2 = false;
            }
            A09(this, z2, false);
            A0B();
            A07();
            A0C();
            AnonymousClass98G r0 = this.A0g;
            if (r0 != null) {
                z = r0.A0G(drawableState) | false;
            } else {
                z = false;
            }
            if (z) {
                invalidate();
            }
            this.A0c = false;
        }
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A00 || !this.A0Z || (textView = this.A0U) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public CharSequence getError() {
        AnonymousClass98J r1 = this.A0h;
        if (r1.A0B) {
            return r1.A09;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A0h.A07;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.A0h.A07;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        AnonymousClass98J r1 = this.A0h;
        if (r1.A0C) {
            return r1.A0A;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A0h.A08;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0A) {
            return this.A0W;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A0g.A05();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.A0g.A06();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        setError(savedState.A00);
        if (savedState.A01) {
            A0G(true);
        }
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A0J != i) {
            this.A0J = i;
            A01();
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A01) {
            this.A01 = i;
            A03();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            A0C();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.A00 != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.A0U = appCompatTextView;
                appCompatTextView.setId(C0003R.C0005id.textinput_counter);
                Typeface typeface = this.A0P;
                if (typeface != null) {
                    this.A0U.setTypeface(typeface);
                }
                this.A0U.setMaxLines(1);
                A0F(this.A0U, this.A0m);
                this.A0h.A06(this.A0U, 2);
                EditText editText = this.A07;
                if (editText == null) {
                    A0E(0);
                } else {
                    A0E(editText.getText().length());
                }
            } else {
                this.A0h.A07(this.A0U, 2);
                this.A0U = null;
            }
            this.A00 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        int length;
        if (this.A0L != i) {
            if (i > 0) {
                this.A0L = i;
            } else {
                this.A0L = -1;
            }
            if (this.A00) {
                EditText editText = this.A07;
                if (editText == null) {
                    length = 0;
                } else {
                    length = editText.getText().length();
                }
                A0E(length);
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0M = colorStateList;
        this.A05 = colorStateList;
        if (this.A07 != null) {
            A09(this, false, false);
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.A0h.A0B) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            AnonymousClass98J r3 = this.A0h;
            Animator animator = r3.A04;
            if (animator != null) {
                animator.cancel();
            }
            r3.A09 = charSequence;
            r3.A07.setText(charSequence);
            int i = r3.A00;
            if (i != 1) {
                r3.A01 = 1;
            }
            AnonymousClass98J.A01(r3, i, r3.A01, AnonymousClass98J.A03(r3, r3.A07, charSequence));
            return;
        }
        this.A0h.A05();
    }

    public void setErrorEnabled(boolean z) {
        AnonymousClass98J r3 = this.A0h;
        if (r3.A0B != z) {
            Animator animator = r3.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(r3.A0H);
                r3.A07 = appCompatTextView;
                appCompatTextView.setId(C0003R.C0005id.textinput_error);
                Typeface typeface = r3.A05;
                if (typeface != null) {
                    r3.A07.setTypeface(typeface);
                }
                int i = r3.A02;
                r3.A02 = i;
                TextView textView = r3.A07;
                if (textView != null) {
                    r3.A0I.A0F(textView, i);
                }
                r3.A07.setVisibility(4);
                r3.A07.setAccessibilityLiveRegion(1);
                r3.A06(r3.A07, 0);
            } else {
                r3.A05();
                r3.A07(r3.A07, 0);
                r3.A07 = null;
                r3.A0I.A0B();
                r3.A0I.A0C();
            }
            r3.A0B = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        AnonymousClass98J r0 = this.A0h;
        r0.A02 = i;
        TextView textView = r0.A07;
        if (textView != null) {
            r0.A0I.A0F(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0h.A07;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0h.A08;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        AnonymousClass98J r4 = this.A0h;
        if (r4.A0C != z) {
            Animator animator = r4.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(r4.A0H);
                r4.A08 = appCompatTextView;
                appCompatTextView.setId(C0003R.C0005id.textinput_helper_text);
                Typeface typeface = r4.A05;
                if (typeface != null) {
                    r4.A08.setTypeface(typeface);
                }
                r4.A08.setVisibility(4);
                r4.A08.setAccessibilityLiveRegion(1);
                int i = r4.A03;
                r4.A03 = i;
                TextView textView = r4.A08;
                if (textView != null) {
                    AnonymousClass3In.A06(textView, i);
                }
                r4.A06(r4.A08, 1);
            } else {
                Animator animator2 = r4.A04;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = r4.A00;
                if (i2 == 2) {
                    r4.A01 = 0;
                }
                AnonymousClass98J.A01(r4, i2, r4.A01, AnonymousClass98J.A03(r4, r4.A08, (CharSequence) null));
                r4.A07(r4.A08, 1);
                r4.A08 = null;
                r4.A0I.A0B();
                r4.A0I.A0C();
            }
            r4.A0C = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        AnonymousClass98J r0 = this.A0h;
        r0.A03 = i;
        TextView textView = r0.A08;
        if (textView != null) {
            AnonymousClass3In.A06(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            if (!z) {
                this.A0d = false;
                if (!TextUtils.isEmpty(this.A0W) && TextUtils.isEmpty(this.A07.getHint())) {
                    this.A07.setHint(this.A0W);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A07.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0W)) {
                        setHint(hint);
                    }
                    this.A07.setHint((CharSequence) null);
                }
                this.A0d = true;
            }
            if (this.A07 != null) {
                A05();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.A0g.A0A(i);
        this.A05 = this.A0g.A0C;
        if (this.A07 != null) {
            A09(this, false, false);
            A05();
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.A0C != z) {
            this.A0C = z;
            if (!z && this.A0D && (editText = this.A07) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.A0D = false;
            A06();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0N = colorStateList;
        this.A0a = true;
        A02();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A0O = mode;
        this.A0b = true;
        A02();
    }

    public void setTextInputAccessibilityDelegate(AnonymousClass98L r2) {
        EditText editText = this.A07;
        if (editText != null) {
            AnonymousClass1E1.A0b(editText, r2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0P) {
            this.A0P = typeface;
            AnonymousClass98G r0 = this.A0g;
            r0.A0F = typeface;
            r0.A0E = typeface;
            r0.A08();
            AnonymousClass98J r1 = this.A0h;
            if (typeface != r1.A05) {
                r1.A05 = typeface;
                TextView textView = r1.A07;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = r1.A08;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0U;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    private void A04() {
        AnonymousClass98D r1;
        float A042;
        float f;
        if (A0A()) {
            RectF rectF = this.A0r;
            AnonymousClass98G r3 = this.A0g;
            CharSequence charSequence = r3.A0G;
            boolean z = true;
            if (r3.A0c.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                r1 = C2110298d.A02;
            } else {
                r1 = C2110298d.A01;
            }
            boolean AhL = r1.AhL(charSequence, 0, charSequence.length());
            Rect rect = r3.A0Y;
            if (!AhL) {
                A042 = (float) rect.left;
            } else {
                A042 = ((float) rect.right) - r3.A04();
            }
            rectF.left = A042;
            Rect rect2 = r3.A0Y;
            rectF.top = (float) rect2.top;
            if (!AhL) {
                f = A042 + r3.A04();
            } else {
                f = (float) rect2.right;
            }
            rectF.right = f;
            float A052 = ((float) r3.A0Y.top) + r3.A05();
            rectF.bottom = A052;
            float f2 = rectF.left;
            float f3 = (float) this.A0f;
            float f4 = f2 - f3;
            rectF.left = f4;
            float f5 = rectF.top - f3;
            rectF.top = f5;
            float f6 = rectF.right + f3;
            rectF.right = f6;
            float f7 = A052 + f3;
            rectF.bottom = f7;
            ((AnonymousClass7O0) this.A06).A00(f4, f5, f6, f7);
        }
    }

    public static void A08(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0014;
     */
    public static void A09(TextInputLayout textInputLayout, boolean z, boolean z2) {
        boolean z3;
        ColorStateList colorStateList;
        TextView textView;
        ColorStateList colorStateList2;
        boolean isEnabled = textInputLayout.isEnabled();
        EditText editText = textInputLayout.A07;
        boolean z4 = true;
        if (editText != null) {
            z3 = true;
        }
        z3 = false;
        EditText editText2 = textInputLayout.A07;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean A082 = textInputLayout.A0h.A08();
        ColorStateList colorStateList3 = textInputLayout.A0M;
        if (colorStateList3 != null) {
            textInputLayout.A0g.A0E(colorStateList3);
            AnonymousClass98G r2 = textInputLayout.A0g;
            ColorStateList colorStateList4 = textInputLayout.A0M;
            if (r2.A0D != colorStateList4) {
                r2.A0D = colorStateList4;
                r2.A08();
            }
        }
        if (!isEnabled) {
            textInputLayout.A0g.A0E(ColorStateList.valueOf(textInputLayout.A0o));
            AnonymousClass98G r22 = textInputLayout.A0g;
            ColorStateList valueOf = ColorStateList.valueOf(textInputLayout.A0o);
            if (r22.A0D != valueOf) {
                r22.A0D = valueOf;
                r22.A08();
            }
        } else if (A082) {
            AnonymousClass98G r1 = textInputLayout.A0g;
            TextView textView2 = textInputLayout.A0h.A07;
            if (textView2 != null) {
                colorStateList2 = textView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            r1.A0E(colorStateList2);
        } else if (textInputLayout.A0Z && (textView = textInputLayout.A0U) != null) {
            textInputLayout.A0g.A0E(textView.getTextColors());
        } else if (z4 && (colorStateList = textInputLayout.A05) != null) {
            textInputLayout.A0g.A0E(colorStateList);
        }
        if (z3 || (textInputLayout.isEnabled() && (z4 || A082))) {
            if (z2 || textInputLayout.A0B) {
                ValueAnimator valueAnimator = textInputLayout.A04;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    textInputLayout.A04.cancel();
                }
                if (!z || !textInputLayout.A09) {
                    textInputLayout.A0g.A09(1.0f);
                } else {
                    textInputLayout.A0D(1.0f);
                }
                textInputLayout.A0B = false;
                if (textInputLayout.A0A()) {
                    textInputLayout.A04();
                }
            }
        } else if (z2 || !textInputLayout.A0B) {
            ValueAnimator valueAnimator2 = textInputLayout.A04;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                textInputLayout.A04.cancel();
            }
            if (!z || !textInputLayout.A09) {
                textInputLayout.A0g.A09(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                textInputLayout.A0D(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            if (textInputLayout.A0A() && (!((AnonymousClass7O0) textInputLayout.A06).A02.isEmpty()) && textInputLayout.A0A()) {
                ((AnonymousClass7O0) textInputLayout.A06).A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            textInputLayout.A0B = true;
        }
    }

    private float[] getCornerRadiiAsArray() {
        float[] fArr;
        float f;
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (!z) {
            fArr = new float[8];
            float f2 = this.A0I;
            fArr[0] = f2;
            fArr[1] = f2;
            float f3 = this.A0H;
            fArr[2] = f3;
            fArr[3] = f3;
            float f4 = this.A0F;
            fArr[4] = f4;
            fArr[5] = f4;
            f = this.A0G;
        } else {
            fArr = new float[8];
            float f5 = this.A0H;
            fArr[0] = f5;
            fArr[1] = f5;
            float f6 = this.A0I;
            fArr[2] = f6;
            fArr[3] = f6;
            float f7 = this.A0G;
            fArr[4] = f7;
            fArr[5] = f7;
            f = this.A0F;
        }
        fArr[6] = f;
        fArr[7] = f;
        return fArr;
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0Z0.A03(346138808);
        GradientDrawable gradientDrawable = this.A06;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.A0A) {
            this.A0g.A0F(canvas);
        }
        AnonymousClass0Z0.A0A(1235617595, A032);
    }

    public int getBoxBackgroundColor() {
        return this.A0J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.A0F;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.A0G;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.A0H;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.A0I;
    }

    public int getBoxStrokeColor() {
        return this.A03;
    }

    public int getCounterMaxLength() {
        return this.A0L;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0M;
    }

    public EditText getEditText() {
        return this.A07;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A0Y;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A0S;
    }

    public Typeface getTypeface() {
        return this.A0P;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A06 != null) {
            A07();
        }
        if (this.A0A && (editText = this.A07) != null) {
            Rect rect = this.A0q;
            C208718yk.A00(this, editText, rect);
            int compoundPaddingLeft = rect.left + this.A07.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.A07.getCompoundPaddingRight();
            int i6 = this.A01;
            if (i6 == 1) {
                i5 = getBoxBackground().getBounds().top + this.A0e;
            } else if (i6 != 2) {
                i5 = getPaddingTop();
            } else {
                i5 = getBoxBackground().getBounds().top - A00();
            }
            this.A0g.A0D(compoundPaddingLeft, rect.top + this.A07.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.A07.getCompoundPaddingBottom());
            this.A0g.A0C(compoundPaddingLeft, i5, compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.A0g.A08();
            if (A0A() && !this.A0B) {
                A04();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        A06();
        super.onMeasure(i, i2);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.A0h.A08()) {
            savedState.A00 = getError();
        }
        savedState.A01 = this.A0D;
        return savedState;
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C019000b.A00(getContext(), i));
    }

    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup.getChildAt(i2);
                    childAt2.setEnabled(z);
                    if (childAt2 instanceof ViewGroup) {
                        A08((ViewGroup) childAt2, z);
                    }
                }
            }
        }
        super.setEnabled(z);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.A0h.A0C) {
                setHelperTextEnabled(true);
            }
            AnonymousClass98J r3 = this.A0h;
            Animator animator = r3.A04;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0A = charSequence;
            r3.A08.setText(charSequence);
            int i = r3.A00;
            if (i != 2) {
                r3.A01 = 2;
            }
            AnonymousClass98J.A01(r3, i, r3.A01, AnonymousClass98J.A03(r3, r3.A08, charSequence));
        } else if (this.A0h.A0C) {
            setHelperTextEnabled(false);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A09 = z;
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0003R.attr.textInputStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context2 = context;
        this.A0h = new AnonymousClass98J(this);
        this.A0q = new Rect();
        this.A0r = new RectF();
        this.A0g = new AnonymousClass98G(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.A0s = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.A0s);
        AnonymousClass98G r2 = this.A0g;
        TimeInterpolator timeInterpolator = C2111898z.A03;
        r2.A0B = timeInterpolator;
        r2.A08();
        AnonymousClass98G r22 = this.A0g;
        r22.A0A = timeInterpolator;
        r22.A08();
        AnonymousClass98G r4 = this.A0g;
        if (r4.A08 != 8388659) {
            r4.A08 = 8388659;
            r4.A08();
        }
        int[] iArr = C712039k.A0R;
        C711939j.A01(context, attributeSet, i, 2131886889);
        C711939j.A02(context2, attributeSet2, iArr, i2, 2131886889, new int[0]);
        C25831An A012 = C25831An.A01(context, attributeSet, iArr, i, 2131886889);
        this.A0A = A012.A0D(21, true);
        setHint(A012.A09(1));
        this.A09 = A012.A0D(20, true);
        this.A0i = context.getResources().getDimensionPixelOffset(C0003R.dimen.mtrl_textinput_box_bottom_offset);
        this.A0f = context.getResources().getDimensionPixelOffset(C0003R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.A0e = A012.A02(4, 0);
        this.A0I = A012.A02.getDimension(8, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0H = A012.A02.getDimension(7, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0F = A012.A02.getDimension(5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0G = A012.A02.getDimension(6, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0J = A012.A02.getColor(2, 0);
        this.A03 = A012.A02.getColor(9, 0);
        this.A0j = context.getResources().getDimensionPixelSize(C0003R.dimen.mtrl_textinput_box_stroke_width_default);
        this.A0k = context.getResources().getDimensionPixelSize(C0003R.dimen.mtrl_textinput_box_stroke_width_focused);
        this.A02 = this.A0j;
        setBoxBackgroundMode(A012.A04(3, 0));
        if (A012.A0C(0)) {
            ColorStateList A062 = A012.A06(0);
            this.A05 = A062;
            this.A0M = A062;
        }
        this.A0n = C019000b.A00(context, C0003R.color.mtrl_textinput_default_box_stroke_color);
        this.A0o = C019000b.A00(context, C0003R.color.mtrl_textinput_disabled_color);
        this.A0p = C019000b.A00(context, C0003R.color.mtrl_textinput_hovered_box_stroke_color);
        if (A012.A05(22, -1) != -1) {
            setHintTextAppearance(A012.A05(22, 0));
        }
        int A052 = A012.A05(16, 0);
        boolean A0D2 = A012.A0D(15, false);
        int A053 = A012.A05(19, 0);
        boolean A0D3 = A012.A0D(18, false);
        CharSequence A092 = A012.A09(17);
        boolean A0D4 = A012.A0D(11, false);
        setCounterMaxLength(A012.A04(12, -1));
        this.A0m = A012.A05(14, 0);
        this.A0l = A012.A05(13, 0);
        this.A0C = A012.A0D(25, false);
        this.A0S = A012.A07(24);
        this.A0Y = A012.A09(23);
        if (A012.A0C(26)) {
            this.A0a = true;
            this.A0N = A012.A06(26);
        }
        if (A012.A0C(27)) {
            this.A0b = true;
            this.A0O = AnonymousClass7O8.A00(A012.A04(27, -1), (PorterDuff.Mode) null);
        }
        A012.A0B();
        setHelperTextEnabled(A0D3);
        setHelperText(A092);
        setHelperTextTextAppearance(A053);
        setErrorEnabled(A0D2);
        setErrorTextAppearance(A052);
        setCounterEnabled(A0D4);
        A02();
        AnonymousClass1E1.A0V(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A0Y = charSequence;
        CheckableImageButton checkableImageButton = this.A0V;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C474223w.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A0S = drawable;
        CheckableImageButton checkableImageButton = this.A0V;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }
}
