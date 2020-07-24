package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import p000X.AnonymousClass3SC;
import p000X.C2099893s;
import p000X.C29367Cwb;
import p000X.C29368Cwc;
import p000X.C29369Cwd;
import p000X.C29370Cwf;
import p000X.C29371Cwg;
import p000X.C29372Cwj;
import p000X.C29376Cwp;
import p000X.C29379Cws;
import p000X.C29400CxE;
import p000X.C29429Cxk;
import p000X.C79543dc;

public class NativeJpegTranscoder implements C29429Cxk {
    public int mMaxBitmapSize;
    public boolean mResizingEnabled;
    public boolean mUseDownsamplingRatio;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    public boolean canResize(C29376Cwp cwp, C29369Cwd cwd, C29372Cwj cwj) {
        if (cwd == null) {
            cwd = C29369Cwd.A02;
        }
        if (C29367Cwb.A00(cwd, cwj, cwp, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public boolean canTranscode(C29400CxE cxE) {
        if (cxE == C29379Cws.A05) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        if ((r6 % 90) != 0) goto L_0x00bf;
     */
    public C29370Cwf transcode(C29376Cwp cwp, OutputStream outputStream, C29369Cwd cwd, C29372Cwj cwj, C29400CxE cxE, Integer num) {
        boolean z;
        boolean z2;
        if (num == null) {
            num = 85;
        }
        if (cwd == null) {
            cwd = C29369Cwd.A02;
        }
        int A00 = C29368Cwc.A00(cwj, cwp, this.mMaxBitmapSize);
        try {
            int A002 = C29367Cwb.A00(cwd, cwj, cwp, this.mResizingEnabled);
            int max = Math.max(1, 8 / A00);
            if (this.mUseDownsamplingRatio) {
                A002 = max;
            }
            InputStream A07 = cwp.A07();
            AnonymousClass3SC r1 = C29367Cwb.A00;
            C29376Cwp.A02(cwp);
            if (r1.contains(Integer.valueOf(cwp.A00))) {
                int A01 = C29367Cwb.A01(cwd, cwp);
                int intValue = num.intValue();
                C29371Cwg.A00();
                boolean z3 = false;
                boolean z4 = false;
                if (A002 >= 1) {
                    z4 = true;
                }
                C79543dc.A03(z4);
                boolean z5 = false;
                if (A002 <= 16) {
                    z5 = true;
                }
                C79543dc.A03(z5);
                boolean z6 = false;
                if (intValue >= 0) {
                    z6 = true;
                }
                C79543dc.A03(z6);
                boolean z7 = false;
                if (intValue <= 100) {
                    z7 = true;
                }
                C79543dc.A03(z7);
                switch (A01) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
                C79543dc.A03(z2);
                if (!(A002 == 8 && A01 == 1)) {
                    z3 = true;
                }
                C79543dc.A05(z3, "no transformation requested");
                C79543dc.A01(A07);
                C79543dc.A01(outputStream);
                nativeTranscodeJpegWithExifOrientation(A07, outputStream, A01, A002, intValue);
            } else {
                int A02 = C29367Cwb.A02(cwd, cwp);
                int intValue2 = num.intValue();
                C29371Cwg.A00();
                boolean z8 = false;
                boolean z9 = false;
                if (A002 >= 1) {
                    z9 = true;
                }
                C79543dc.A03(z9);
                boolean z10 = false;
                if (A002 <= 16) {
                    z10 = true;
                }
                C79543dc.A03(z10);
                boolean z11 = false;
                if (intValue2 >= 0) {
                    z11 = true;
                }
                C79543dc.A03(z11);
                boolean z12 = false;
                if (intValue2 <= 100) {
                    z12 = true;
                }
                C79543dc.A03(z12);
                if (A02 >= 0 && A02 <= 270) {
                    z = true;
                }
                z = false;
                C79543dc.A03(z);
                if (!(A002 == 8 && A02 == 0)) {
                    z8 = true;
                }
                C79543dc.A05(z8, "no transformation requested");
                C79543dc.A01(A07);
                C79543dc.A01(outputStream);
                nativeTranscodeJpeg(A07, outputStream, A02, A002, intValue2);
            }
            C2099893s.A01(A07);
            int i = 1;
            if (A00 != 1) {
                i = 0;
            }
            return new C29370Cwf(i);
        } catch (Throwable th) {
            C2099893s.A01((InputStream) null);
            throw th;
        }
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
        if (z3) {
            C29371Cwg.A00();
        }
    }
}
