package p000X;

import com.facebook.rti.push.service.FbnsService;

/* renamed from: X.0cb  reason: invalid class name and case insensitive filesystem */
public final class C10060cb implements C08090Vp {
    public final /* synthetic */ FbnsService A00;

    public C10060cb(FbnsService fbnsService) {
        this.A00 = fbnsService;
    }

    public final void BPW(long j) {
        this.A00.A01.A00(Constants.ONE, (String) null);
    }

    public final void onFailure() {
        this.A00.A01.A00(Constants.A0C, (String) null);
    }
}
