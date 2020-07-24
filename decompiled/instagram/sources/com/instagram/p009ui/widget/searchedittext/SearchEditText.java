package com.instagram.p009ui.widget.searchedittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19g;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass4JF;
import p000X.AnonymousClass66L;
import p000X.AnonymousClass6P6;
import p000X.C06400Ox;
import p000X.C129385gG;
import p000X.C129625gf;
import p000X.C255719i;
import p000X.C80363f3;
import p000X.C84533lp;

/* renamed from: com.instagram.ui.widget.searchedittext.SearchEditText */
public class SearchEditText extends EditText implements TextView.OnEditorActionListener {
    public Drawable A00;
    public boolean A01;
    public InputMethodManager A02;
    public C129625gf A03;
    public C84533lp A04;
    public AnonymousClass66L A05;
    public C80363f3 A06;
    public AnonymousClass6P6 A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public Drawable[] A0G;

    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        setFocusableInTouchMode(true);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 3 && i != 5) {
            return false;
        }
        A03();
        C84533lp r1 = this.A04;
        if (r1 == null) {
            return true;
        }
        r1.onSearchSubmitted(this, getSearchString());
        return true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = i;
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int i6 = i2;
        super.onTextChanged(charSequence, i, i2, i3);
        C84533lp r0 = this.A04;
        if (r0 != null) {
            r0.onSearchTextChanged(this, charSequence2, i4, i6, i5);
        }
    }

    private void A00() {
        Drawable drawable;
        Drawable drawable2 = null;
        if (this.A0B) {
            drawable = this.A0G[0];
        } else {
            drawable = null;
        }
        Drawable[] drawableArr = this.A0G;
        Drawable drawable3 = drawableArr[1];
        if (this.A0A && this.A09) {
            drawable2 = this.A00;
        }
        setCompoundDrawablesRelative(drawable, drawable3, drawable2, drawableArr[3]);
    }

    public final void A02() {
        C129625gf r1 = this.A03;
        if (r1 != null) {
            r1.onSearchCleared(getSearchString());
        }
        setText("");
        requestFocus();
        A05();
    }

    public final void A03() {
        this.A02.hideSoftInputFromWindow(getWindowToken(), 0);
        this.A0F = false;
        AnonymousClass66L r0 = this.A05;
        if (r0 != null) {
            r0.BO0();
        }
    }

    public final void A04() {
        if (!this.A0D) {
            this.A0E = true;
        } else {
            requestFocus();
        }
    }

    public final void A05() {
        if (!this.A0D) {
            this.A0F = true;
            return;
        }
        this.A02.showSoftInput(this, 0);
        AnonymousClass66L r0 = this.A05;
        if (r0 != null) {
            r0.B8i();
        }
    }

    public void setAllowTextSelection(boolean z) {
        this.A08 = z;
        if (z) {
            setOnLongClickListener((View.OnLongClickListener) null);
        } else {
            setOnLongClickListener(new AnonymousClass4JF(this));
        }
    }

    public void setClearButtonAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate().setAlpha(i);
        }
    }

    public void setClearButtonColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate().setColorFilter(colorFilter);
        }
    }

    public void setClearButtonEnabled(boolean z) {
        this.A09 = z;
        A00();
    }

    public void setSearchIconEnabled(boolean z) {
        this.A0B = z;
        A00();
    }

    private void A01(Context context, AttributeSet attributeSet) {
        boolean z;
        C255719i A002 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A002.AAc(this, keyListener);
        super.setKeyListener(keyListener);
        Context context2 = getContext();
        this.A01 = C06400Ox.A02(context2);
        if (attributeSet != null) {
            getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3G);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(context.getText(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(context.getText(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getText(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(context.getText(resourceId4));
            }
            this.A09 = obtainStyledAttributes.getBoolean(5, true);
            z = obtainStyledAttributes.getBoolean(4, false);
            this.A0C = obtainStyledAttributes.getBoolean(6, this.A0C);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
        }
        setOnEditorActionListener(this);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        this.A0G = compoundDrawablesRelative;
        this.A00 = compoundDrawablesRelative[2];
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], (Drawable) null, compoundDrawablesRelative[3]);
        setAllowTextSelection(z);
        getContext();
        this.A02 = (InputMethodManager) context2.getSystemService("input_method");
    }

    public String getSearchString() {
        return getText().toString().trim();
    }

    public CharSequence getStrippedText() {
        Editable text = getText();
        if (TextUtils.isEmpty(text)) {
            return text;
        }
        char charAt = text.charAt(0);
        if (charAt == '@' || charAt == '#') {
            return text.subSequence(1, text.length());
        }
        return text;
    }

    public CharSequence getTextForSearch() {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || text.length() != 1) {
            return text;
        }
        char charAt = text.charAt(0);
        if (charAt == '@' || charAt == '#') {
            return "";
        }
        return text;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass19g.A00(getContext()).AAb(this, onCreateInputConnection, editorInfo);
        return onCreateInputConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r3 == 160) goto L_0x001d;
     */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (!TextUtils.isEmpty(getText()) && keyEvent.getAction() == 0) {
            if (!(i == 23 || i == 66)) {
                z = false;
            }
            z = true;
            if (z) {
                A03();
                C84533lp r1 = this.A04;
                if (r1 != null) {
                    r1.onSearchSubmitted(this, getSearchString());
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0D = true;
        if (this.A0E) {
            A04();
            this.A0E = false;
        }
        if (this.A0F) {
            post(new C129385gG(this));
            this.A0F = false;
        }
    }

    public final boolean onPreDraw() {
        boolean isEmpty = TextUtils.isEmpty(getSearchString());
        if (this.A0A != isEmpty) {
            return super.onPreDraw();
        }
        this.A0A = !isEmpty;
        A00();
        return false;
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C80363f3 r0 = this.A06;
        if (r0 != null) {
            r0.BMB(this, i, i2);
        }
    }

    public final boolean onTextContextMenuItem(int i) {
        AnonymousClass6P6 r0;
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 && (r0 = this.A07) != null) {
            r0.BRK();
        }
        return onTextContextMenuItem;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(-555547317);
        if (this.A0A && this.A09 && motionEvent.getAction() == 1 && this.A00 != null) {
            float x = motionEvent.getX();
            boolean z = false;
            if (this.A00 != null && (!this.A01 ? x > ((float) ((getWidth() - getPaddingRight()) - this.A00.getIntrinsicWidth())) : x < ((float) (getPaddingLeft() + this.A00.getIntrinsicWidth())))) {
                z = true;
            }
            if (z) {
                A02();
            }
        }
        if (this.A08 || !this.A0C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            AnonymousClass0Z0.A0C(-1387543203, A052);
            return onTouchEvent;
        }
        requestFocus();
        A05();
        AnonymousClass0Z0.A0C(910530848, A052);
        return true;
    }

    public void setKeyListener(KeyListener keyListener) {
        AnonymousClass19g.A00(getContext()).AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public void setFocusOnTouchEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOnFilterTextListener(C84533lp r1) {
        this.A04 = r1;
    }

    public void setOnKeyboardListener(AnonymousClass66L r1) {
        this.A05 = r1;
    }

    public void setOnSelectionChangedListener(C80363f3 r1) {
        this.A06 = r1;
    }

    public void setSearchClearListener(C129625gf r1) {
        this.A03 = r1;
    }

    public void setTextPasteListener(AnonymousClass6P6 r1) {
        this.A07 = r1;
    }

    public SearchEditText(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }
}
