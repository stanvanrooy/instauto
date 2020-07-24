package com.instagram.direct.story.p017ui;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import p000X.C55442ae;
import p000X.C73893Ls;

/* renamed from: com.instagram.direct.story.ui.DirectVisualMessageActionLogViewModel */
public final class DirectVisualMessageActionLogViewModel {
    public final ImageUrl A00;
    public final C55442ae A01;
    public final String A02;
    public final String A03;

    public DirectVisualMessageActionLogViewModel(Context context, String str, ImageUrl imageUrl, C55442ae r5, long j) {
        this.A03 = str;
        this.A00 = imageUrl;
        this.A02 = C73893Ls.A00(context, Long.valueOf(j));
        this.A01 = r5;
    }
}
