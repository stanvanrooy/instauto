package com.facebook.imagepipeline.nativecode;

import p000X.C29291CvM;
import p000X.C29379Cws;
import p000X.C29400CxE;
import p000X.C29429Cxk;

public class NativeJpegTranscoderFactory implements C29291CvM {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C29429Cxk createImageTranscoder(C29400CxE cxE, boolean z) {
        if (cxE != C29379Cws.A05) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.A00, this.A02, this.A01);
    }

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }
}
