package com.instagram.common.p004ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p000X.AnonymousClass19g;
import p000X.AnonymousClass1EM;
import p000X.C06340Or;
import p000X.C255719i;

/* renamed from: com.instagram.common.ui.base.IgEditText */
public class IgEditText extends EditText {
    private void A00(Context context, AttributeSet attributeSet) {
        int inputType = getInputType();
        C255719i A00 = AnonymousClass19g.A00(getContext());
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
        setInputType(inputType);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2F);
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
        obtainStyledAttributes.recycle();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass19g.A00(getContext()).AAb(this, onCreateInputConnection, editorInfo);
        return onCreateInputConnection;
    }

    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            if (!C06340Or.A04(this, getText())) {
                throw e;
            }
        }
    }

    public void setKeyListener(KeyListener keyListener) {
        AnonymousClass19g.A00(getContext()).AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public IgEditText(Context context) {
        super(context);
    }

    public IgEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public IgEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public IgEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }
}
