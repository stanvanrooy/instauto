package p000X;

import java.io.IOException;

/* renamed from: X.1v4  reason: invalid class name and case insensitive filesystem */
public final class C43781v4 extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass1C4 A00;
    public final /* synthetic */ C16480of A01;
    public final /* synthetic */ AnonymousClass1CB A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43781v4(C16480of r2, AnonymousClass1CB r3, AnonymousClass1C4 r4) {
        super(560);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    public final void run() {
        this.A02.A02(this.A00, new IOException("RequestCacheServiceLayer: no content"));
    }
}
