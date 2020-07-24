package p000X;

import com.facebook.reliability.ulimit.Ulimit;

/* renamed from: X.1q3  reason: invalid class name and case insensitive filesystem */
public final class C41281q3 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    public final void A00() {
        if (Ulimit.sNativeLibLoaded) {
            Ulimit.setNativeMaxUlimit();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41281q3(C37531jo r3) {
        super("setFileDescriptorLimit", 385);
        this.A00 = r3;
    }
}
