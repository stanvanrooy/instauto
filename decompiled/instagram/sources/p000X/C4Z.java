package p000X;

import com.facebook.smartcapture.docauth.DocumentType;

/* renamed from: X.C4Z */
public final class C4Z implements Runnable {
    public final /* synthetic */ DocumentType A00;
    public final /* synthetic */ C4Q A01;
    public final /* synthetic */ boolean A02;

    public C4Z(C4Q c4q, DocumentType documentType, boolean z) {
        this.A01 = c4q;
        this.A00 = documentType;
        this.A02 = z;
    }

    public final void run() {
        C4X c4x = (C4X) this.A01.A0C.get();
        if (c4x != null) {
            c4x.Bsb(this.A01.A01, C5T.A00(c4x.AK7(), this.A00, c4x.AHg(), c4x.AHf()), this.A02);
        }
    }
}
