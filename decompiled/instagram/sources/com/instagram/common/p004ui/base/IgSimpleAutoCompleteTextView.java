package com.instagram.common.p004ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p000X.AnonymousClass19g;
import p000X.AnonymousClass1EM;
import p000X.C255719i;

/* renamed from: com.instagram.common.ui.base.IgSimpleAutoCompleteTextView */
public class IgSimpleAutoCompleteTextView extends AutoCompleteTextView {
    private void A01(Context context, AttributeSet attributeSet) {
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2Q);
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            setCompletionHint(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId2 != 0) {
            setContentDescription(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId3 != 0) {
            setHint(context.getText(resourceId3));
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId4 != 0) {
            setImeActionLabel(context.getText(resourceId4), getImeActionId());
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId5 != 0) {
            setText(context.getText(resourceId5));
        }
        obtainStyledAttributes.recycle();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass19g.A00(getContext()).AAb(this, onCreateInputConnection, editorInfo);
        return onCreateInputConnection;
    }

    public void setKeyListener(KeyListener keyListener) {
        AnonymousClass19g.A00(getContext()).AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public IgSimpleAutoCompleteTextView(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }

    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01(context, attributeSet);
    }
}
