package com.instagram.feed.p005ui.text;

import android.content.Context;
import android.text.Layout;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19g;
import p000X.C255719i;
import p000X.C54302Wt;

/* renamed from: com.instagram.feed.ui.text.LinkEditText */
public class LinkEditText extends EditText {
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass19g.A00(getContext()).AAb(this, onCreateInputConnection, editorInfo);
        return onCreateInputConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == false) goto L_0x0015;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(-644205458);
        Layout layout = getLayout();
        boolean z2 = true;
        if (layout != null) {
            boolean A00 = C54302Wt.A00(motionEvent, layout, this);
            z = true;
        }
        z = false;
        if (!z && !super.onTouchEvent(motionEvent)) {
            z2 = false;
        }
        AnonymousClass0Z0.A0C(-1832881650, A05);
        return z2;
    }

    public void setKeyListener(KeyListener keyListener) {
        AnonymousClass19g.A00(getContext()).AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public LinkEditText(Context context) {
        super(context);
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public LinkEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public LinkEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C255719i A00 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A00.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }
}
