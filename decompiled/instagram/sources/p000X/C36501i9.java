package p000X;

import java.util.concurrent.Callable;

/* renamed from: X.1i9  reason: invalid class name and case insensitive filesystem */
public final class C36501i9 implements Callable {
    public final /* synthetic */ AnonymousClass18Q A00;
    public final /* synthetic */ String A01;

    public C36501i9(AnonymousClass18Q r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z = false;
        if (this.A00.A02.BaZ(this.A01) != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
