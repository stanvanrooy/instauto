package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.ALB */
public final class ALB {
    public final C23399AKy A00;
    public final Context A01;

    public ALB(Context context) {
        this.A01 = context;
        C23399AKy aKy = new C23399AKy(context);
        aKy.A05.setText(this.A01.getString(C0003R.string.cancel));
        this.A00 = aKy;
    }

    public final void A00(View view, C13300iJ r9, C13300iJ r10, ALS als, boolean z) {
        int i = C0003R.string.live_cobroadcast_invite_sheet_message;
        if (z) {
            i = C0003R.string.live_cobroadcast_view_join_request_message;
        }
        C23399AKy aKy = this.A00;
        aKy.A04.setText(this.A01.getString(i, new Object[]{r10.AZn()}));
        aKy.A07.setText(this.A01.getString(C0003R.string.live_cobroadcast_invite_sheet_description, new Object[]{r10.AZn()}));
        aKy.A06.setText(this.A01.getString(C0003R.string.live_broadcast_invite_option, new Object[]{r10.AZn()}));
        aKy.A00(view, r9, r10, new ALK(this, als));
    }
}
