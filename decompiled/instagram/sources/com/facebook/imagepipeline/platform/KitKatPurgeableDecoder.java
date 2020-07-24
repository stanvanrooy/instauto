package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p000X.C29386Cwz;
import p000X.C29410CxO;
import p000X.C29488Cyh;
import p000X.C79543dc;

public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final C29410CxO A00;

    public KitKatPurgeableDecoder(C29410CxO cxO) {
        this.A00 = cxO;
    }

    public final Bitmap decodeByteArrayAsPurgeable(C29488Cyh cyh, BitmapFactory.Options options) {
        C29386Cwz cwz = (C29386Cwz) cyh.A06();
        int A01 = cwz.A01();
        C29410CxO cxO = this.A00;
        C29488Cyh A012 = C29488Cyh.A01(cxO.A01.get(A01), cxO.A00);
        try {
            byte[] bArr = (byte[]) A012.A06();
            cwz.A03(0, bArr, 0, A01);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, A01, options);
            C79543dc.A02(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            C29488Cyh.A03(A012);
        }
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(C29488Cyh cyh, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.endsWithEOI(cyh, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.EOI;
        }
        C29386Cwz cwz = (C29386Cwz) cyh.A06();
        boolean z = false;
        if (i <= cwz.A01()) {
            z = true;
        }
        C79543dc.A03(z);
        C29410CxO cxO = this.A00;
        int i2 = i + 2;
        C29488Cyh A01 = C29488Cyh.A01(cxO.A01.get(i2), cxO.A00);
        try {
            byte[] bArr2 = (byte[]) A01.A06();
            cwz.A03(0, bArr2, 0, i);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            C79543dc.A02(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            C29488Cyh.A03(A01);
        }
    }
}
