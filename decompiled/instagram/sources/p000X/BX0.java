package p000X;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.BX0 */
public final class BX0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1OE A00;
    public final /* synthetic */ BX4 A01;

    public BX0(AnonymousClass1OE r1, BX4 bx4) {
        this.A00 = r1;
        this.A01 = bx4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.BGt(this.A01, Constants.ONE, (Bundle) null);
    }
}
