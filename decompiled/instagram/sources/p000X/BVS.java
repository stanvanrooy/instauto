package p000X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.BVS */
public final class BVS implements DialogInterface.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ BVR A01;

    public BVS(BVR bvr, Uri uri) {
        this.A01 = bvr;
        this.A00 = uri;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass17U.A0A.A05(new B3Y(this.A01, "open", this.A00));
        BVR bvr = this.A01;
        bvr.A01.A00.A00.startActivity(new Intent("android.intent.action.VIEW").setData(BVR.A05.buildUpon().appendQueryParameter("static_map_url", this.A00.toString()).build()).setFlags(268435456));
    }
}
