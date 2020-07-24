package p000X;

import android.os.FileObserver;

/* renamed from: X.1Ia  reason: invalid class name and case insensitive filesystem */
public final class C27481Ia extends FileObserver {
    public final /* synthetic */ AnonymousClass1IY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27481Ia(AnonymousClass1IY r2, String str) {
        super(str, 288);
        this.A00 = r2;
    }

    public final void onEvent(int i, String str) {
        if (str != null) {
            C12670hC.A05(new C89533uO(this, str));
        }
    }
}
