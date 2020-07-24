package p000X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.ADG */
public class ADG extends AnonymousClass2TS {
    public final DialogInterface.OnKeyListener A00 = new ADH(this);

    public final Dialog A0A(Bundle bundle) {
        C68172yZ r1 = new C68172yZ(getContext());
        r1.A00(A0L());
        r1.setCancelable(false);
        r1.setOnKeyListener(this.A00);
        return r1;
    }

    public String A0L() {
        return getString(C0003R.string.loading);
    }
}
