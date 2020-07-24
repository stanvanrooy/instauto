package com.facebook.cameracore.mediapipeline.services.uicontrol.implementation.instagram;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import p000X.C196628bB;
import p000X.C77463Zz;
import p000X.C77473a0;
import p000X.C77483a1;
import p000X.C77493a2;
import p000X.C77503a3;
import p000X.C77513a4;
import p000X.C77953as;

public class RawTextInputView extends EditText {
    public InputMethodManager A00;
    public C77513a4 A01;
    public C77953as A02;
    public C77483a1 A03;
    public C77473a0 A04;
    public boolean A05;

    private void A00(Context context) {
        setInputType(16385);
        setSingleLine();
        setEnabled(false);
        setVisibility(8);
        setImeOptions(6);
        setTextInteractionListener(new C77463Zz(this));
        setOnEditorActionListener(new C77493a2(this));
        this.A01 = new C77503a3(this);
        this.A00 = (InputMethodManager) context.getSystemService("input_method");
    }

    public final void A01() {
        if (this.A05) {
            this.A05 = false;
            C77953as r0 = this.A02;
            if (r0 != null) {
                r0.BGz();
            }
            setEnabled(false);
            clearFocus();
            setFocusable(false);
            setFocusableInTouchMode(false);
            setVisibility(8);
            this.A00.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void setTextInteractionListener(C77473a0 r2) {
        if (r2 == null) {
            C77483a1 r0 = this.A03;
            if (r0 != null) {
                removeTextChangedListener(r0);
                this.A03 = null;
            }
        } else if (this.A03 == null) {
            C77483a1 r02 = new C77483a1(this);
            this.A03 = r02;
            addTextChangedListener(r02);
        }
        this.A04 = r2;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        getImeOptions();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new C196628bB(this, onCreateInputConnection);
        }
        return onCreateInputConnection;
    }

    public void setOnDeleteKeyListener(C77513a4 r1) {
        this.A01 = r1;
    }

    public void setRawTextInputListener(C77953as r1) {
        this.A02 = r1;
    }

    public RawTextInputView(Context context) {
        super(context);
        A00(context);
    }

    public RawTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public RawTextInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
