package p000X;

import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: X.BVW */
public final class BVW implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ BVR A01;

    public BVW(BVR bvr, Uri uri) {
        this.A01 = bvr;
        this.A00 = uri;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AnonymousClass17U.A0A.A05(new B3Y(this.A01, "cancel", this.A00));
    }
}
