package p000X;

import android.content.Context;
import android.content.DialogInterface;
import java.util.List;

/* renamed from: X.DSy */
public final class DSy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass2PH A02;
    public final /* synthetic */ C58252fd A03;
    public final /* synthetic */ List A04;

    public DSy(AnonymousClass2PH r1, Context context, C58252fd r3, List list, int i) {
        this.A02 = r1;
        this.A01 = context;
        this.A03 = r3;
        this.A04 = list;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass2PH.A02(this.A02, this.A01, this.A03, (C55692bC) this.A04.get(i), this.A00);
    }
}
