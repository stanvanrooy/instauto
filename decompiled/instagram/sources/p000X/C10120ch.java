package p000X;

import com.facebook.rti.push.service.FbnsService;

/* renamed from: X.0ch  reason: invalid class name and case insensitive filesystem */
public final class C10120ch implements C08090Vp {
    public final /* synthetic */ FbnsService A00;

    public C10120ch(FbnsService fbnsService) {
        this.A00 = fbnsService;
    }

    public final void BPW(long j) {
        this.A00.A01.A00(Constants.A09, (String) null);
    }

    public final void onFailure() {
        this.A00.A01.A00(Constants.A0A, (String) null);
    }
}
