package com.instagram.creation.capture.quickcapture.sundial.drafts;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Z9;
import p000X.AnonymousClass18C;
import p000X.AnonymousClass1GK;
import p000X.AnonymousClass2LC;
import p000X.C184707ut;
import p000X.C184747ux;
import p000X.C184757uy;
import p000X.C36591iI;
import p000X.C76643Wr;

public final class ClipsDraftThumbnailLoader implements AnonymousClass18C {
    public static final Map A04 = new ConcurrentHashMap();
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final Executor A03 = C76643Wr.A00;

    public final void B70(AnonymousClass1GK r1) {
    }

    public final void B72(AnonymousClass1GK r1, int i) {
    }

    public final void A01(AnonymousClass2LC r5, C184757uy r6) {
        String str = r5.A0A;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass0Z9.A03(this.A03, new C184707ut(this, new WeakReference(r6), r5, str), -2008346578);
        }
    }

    public final void AtI(AnonymousClass1GK r4, C36591iI r5) {
        Bitmap bitmap;
        C184747ux r1 = (C184747ux) r4.A06;
        C184757uy r2 = (C184757uy) r1.A01.get();
        AnonymousClass2LC r12 = r1.A00;
        if (r2 != null && r2.AgH(r12) && (bitmap = r5.A00) != null) {
            r2.BRU(r12, bitmap);
        }
    }

    public ClipsDraftThumbnailLoader(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A02 = options;
        options.inJustDecodeBounds = true;
    }

    public static String A00(ClipsDraftThumbnailLoader clipsDraftThumbnailLoader, AnonymousClass2LC r6) {
        return AnonymousClass000.A0I(r6.A01(), "?", clipsDraftThumbnailLoader.A01, "x", clipsDraftThumbnailLoader.A00);
    }
}
