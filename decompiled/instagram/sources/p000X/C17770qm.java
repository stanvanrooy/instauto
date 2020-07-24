package p000X;

import java.net.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: X.0qm  reason: invalid class name and case insensitive filesystem */
public final class C17770qm implements Callable {
    public final /* synthetic */ C15890nh A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ CookieManager A02;

    public C17770qm(C15890nh r1, String str, CookieManager cookieManager) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = cookieManager;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return C15890nh.A00(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return AnonymousClass000.A0E("HttpEngine", this.A00.toString());
    }
}
