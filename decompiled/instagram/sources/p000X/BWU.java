package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.BWU */
public final class BWU implements View.OnClickListener {
    public final /* synthetic */ BWX A00;
    public final /* synthetic */ BWT A01;

    public BWU(BWT bwt, BWX bwx) {
        this.A01 = bwt;
        this.A00 = bwx;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-552779059);
        Context context = view.getContext();
        C06200Od.A00(context, this.A00.A01.getText().toString());
        C53642Tq.A00(context, C0003R.string.dev_qp_copy_toast_text, 1).show();
        AnonymousClass0Z0.A0C(1669975601, A05);
    }
}
