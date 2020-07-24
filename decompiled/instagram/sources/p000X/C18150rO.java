package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;

/* renamed from: X.0rO  reason: invalid class name and case insensitive filesystem */
public final class C18150rO extends C18160rP {
    public final C18180rR A00;
    public final C18110rK A01;

    public final String A02(C105814hT r5) {
        C105884ha A02;
        AnonymousClass160 r1;
        AnonymousClass15G A012 = r5.A01("image.uploadImage");
        if (A012 == null || (A02 = r5.A02(A012)) == null || (r1 = (AnonymousClass160) C106394iR.A00(A02, "common.imageInfo", AnonymousClass160.class)) == null) {
            return null;
        }
        return r1.A02;
    }

    public final C105814hT A01(Context context, AnonymousClass0C1 r12, C104794fp r13) {
        C105774hP r5;
        String l = Long.toString(System.currentTimeMillis());
        String str = r13.A04;
        if (str == null) {
            str = C13920jT.A00("capture_flow_v2").A05();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C108044lA("common.uploadId", l));
        arrayList.add(new C108044lA("common.captureWaterfallId", str));
        AnonymousClass4l0 r4 = new AnonymousClass4l0(arrayList);
        AnonymousClass15G AZW = this.A00.AZW(r12);
        AnonymousClass160 r7 = r13.A01;
        AnonymousClass0a4.A06(r7);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C108044lA("common.imageInfo", r7));
        boolean z = r13.A07;
        if (!z || r13.A05 != null) {
            if (z) {
                C247715y r9 = new C247715y();
                r9.A00 = "calculatePdqHash";
                r5 = new C105774hP(r9, r12);
                r5.A01(r9, AZW);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new C108044lA("common.originalImageFilePath", r13.A05));
                r5.A02.put(r9, new AnonymousClass4l0(arrayList3));
            } else {
                r5 = new C105774hP(AZW, r12);
            }
            r5.A03(AZW, "image.uploadImage");
            Double d = r13.A03;
            if (d != null) {
                arrayList2.add(new C108044lA("image.upload.ssim", d));
            }
            arrayList2.add(new C108044lA("image.upload.quality", Integer.valueOf(r13.A00)));
            r5.A02.put(AZW, new AnonymousClass4l0(arrayList2));
            r5.A01 = r4;
            r5.A00 = new C106224i8(this, context, r12);
            r5.A06 = !r13.A06;
            ShareType shareType = r13.A02;
            AnonymousClass0a4.A07(shareType, "Share type missing");
            this.A01.A07(r5, AZW);
            this.A01.A08(r5, r5.A07);
            this.A01.A06(r5, shareType, MediaType.PHOTO, r7.A00());
            ArrayList arrayList4 = new ArrayList();
            C105884ha r0 = (C105884ha) r5.A02.get(r5.A07);
            C105884ha r8 = r0;
            if (r0 != null) {
                for (String str2 : r0.A02()) {
                    for (Object r1 : r8.A03(str2)) {
                        arrayList4.add(new C108044lA(str2, r1));
                    }
                }
            }
            arrayList4.add(new C108044lA("media.renderedFilepath", r7.A02));
            AnonymousClass4l0 r2 = new AnonymousClass4l0(arrayList4);
            r5.A02.put(r5.A07, r2);
            return r5.A00();
        }
        throw new IllegalArgumentException("Processed images must provide an original image file path for fingerprinting. Set isProcessed to false if this does not apply.");
    }

    public C18150rO(C18110rK r2) {
        this(r2, new C18170rQ());
    }

    public C18150rO(C18110rK r1, C18180rR r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
