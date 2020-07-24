package p000X;

import android.content.DialogInterface;
import com.instagram.direct.messengerrooms.api.MessengerRoom;

/* renamed from: X.Bv6 */
public final class Bv6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ MessengerRoom A00;
    public final /* synthetic */ C26934Bux A01;

    public Bv6(C26934Bux bux, MessengerRoom messengerRoom) {
        this.A01 = bux;
        this.A00 = messengerRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C26934Bux.A00(this.A01, this.A00.A00, "cancel");
    }
}
