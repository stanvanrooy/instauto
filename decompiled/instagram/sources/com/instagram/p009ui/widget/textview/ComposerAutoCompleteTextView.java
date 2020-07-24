package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.facebook.common.dextricks.DexStore;
import p000X.C30763DjL;

/* renamed from: com.instagram.ui.widget.textview.ComposerAutoCompleteTextView */
public class ComposerAutoCompleteTextView extends IgAutoCompleteTextView {
    public C30763DjL A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r6.getAction() != 1) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r4.A00;
     */
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        boolean z;
        C30763DjL djL;
        if (i == 4) {
            z = true;
        }
        z = false;
        return (z && djL != null && djL.onBack()) || super.onKeyPreIme(i, keyEvent);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.A01) {
            return super.onCreateInputConnection(editorInfo);
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions;
        int i2 = i & 255;
        if ((i2 & 4) != 0) {
            int i3 = i2 ^ i;
            editorInfo.imeOptions = i3;
            editorInfo.imeOptions = i3 | 4;
        }
        int i4 = editorInfo.imeOptions;
        if ((1073741824 & i4) != 0) {
            editorInfo.imeOptions = i4 & -1073741825;
        }
        return onCreateInputConnection;
    }

    public void setAllowNewlines(boolean z) {
        this.A01 = z;
        setInputType(getInputType() | DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
    }

    public void setListener(C30763DjL djL) {
        this.A00 = djL;
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public ComposerAutoCompleteTextView(Context context) {
        super(context);
    }

    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
