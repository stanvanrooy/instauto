package p000X;

import android.view.View;

/* renamed from: X.1mW  reason: invalid class name and case insensitive filesystem */
public final class C39201mW implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1VN A01;
    public final /* synthetic */ AnonymousClass1NJ A02;
    public final /* synthetic */ C36841ih A03;

    public C39201mW(AnonymousClass1VN r1, AnonymousClass1NJ r2, C36841ih r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        this.A01.A00.BKn(this.A02, this.A03, this.A00);
        return true;
    }
}
