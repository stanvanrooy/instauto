package com.instagram.p009ui.widget.searchedittext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import p000X.AnonymousClass5B3;

/* renamed from: com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText */
public class SearchWithDeleteEditText extends SearchEditText {
    public AnonymousClass5B3 A00;

    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AnonymousClass5B3 r0;
        if (keyEvent.getKeyCode() == 67 && (r0 = this.A00) != null) {
            r0.AzW(this);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setOnDeleteKeyListener(AnonymousClass5B3 r1) {
        this.A00 = r1;
    }

    public SearchWithDeleteEditText(Context context) {
        super(context);
    }

    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
