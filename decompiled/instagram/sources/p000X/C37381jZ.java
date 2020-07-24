package p000X;

import android.content.Context;

/* renamed from: X.1jZ  reason: invalid class name and case insensitive filesystem */
public final class C37381jZ extends AnonymousClass0O9 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C37231jK A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37381jZ(C37231jK r4, Context context, String str, long j) {
        super(154, 4, false, false);
        this.A02 = r4;
        this.A01 = context;
        this.A03 = str;
        this.A00 = j;
    }

    public final void run() {
        String str;
        boolean AhY = C28311Lf.A00(this.A01, this.A02.A00.A07).AhY(this.A03);
        C27581Ik r4 = this.A02.A00.A02;
        long j = this.A00;
        if (AhY) {
            str = "old";
        } else {
            str = "new";
        }
        r4.A0C("CACHED_FEED_UI_RENDER_END", str, j);
    }
}
