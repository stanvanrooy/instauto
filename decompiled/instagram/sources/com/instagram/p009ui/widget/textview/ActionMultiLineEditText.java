package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p000X.AnonymousClass19g;
import p000X.C255719i;

/* renamed from: com.instagram.ui.widget.textview.ActionMultiLineEditText */
public class ActionMultiLineEditText extends EditText {
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions;
        if ((1073741824 & i) != 0) {
            editorInfo.imeOptions = i & -1073741825;
        }
        AnonymousClass19g.A00(getContext()).AAb(this, onCreateInputConnection, editorInfo);
        return onCreateInputConnection;
    }

    public void setKeyListener(KeyListener keyListener) {
        AnonymousClass19g.A00(getContext()).AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public ActionMultiLineEditText(Context context) {
        super(context);
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public ActionMultiLineEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public ActionMultiLineEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }
}
