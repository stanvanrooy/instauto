package com.instagram.video.live.adapter;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1Xv;
import p000X.C31291Xl;

public class CommentsLinearLayoutManager extends LinearLayoutManager {
    public final int A1B(AnonymousClass1Xv r3) {
        return Math.max(super.A1B(r3), 0);
    }

    public final void A1Q(C31291Xl r4, AnonymousClass1Xv r5) {
        String message;
        int A03 = AnonymousClass0Z0.A03(1425903108);
        try {
            super.A1Q(r4, r5);
        } catch (IndexOutOfBoundsException e) {
            if (e.getCause() != null) {
                message = e.getCause().getMessage();
            } else {
                message = e.getMessage();
            }
            AnonymousClass0QD.A01("live_comments", message);
        }
        AnonymousClass0Z0.A0A(127005677, A03);
    }

    public CommentsLinearLayoutManager() {
        super(1, true);
    }

    public CommentsLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
