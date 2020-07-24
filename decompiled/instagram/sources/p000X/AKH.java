package p000X;

import android.view.View;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.AKH */
public final class AKH implements View.OnClickListener {
    public final /* synthetic */ AKI A00;
    public final /* synthetic */ C23386AKl A01;

    public AKH(AKI aki, C23386AKl aKl) {
        this.A00 = aki;
        this.A01 = aKl;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(360993603);
        AKB akb = this.A00.A00;
        C23386AKl aKl = this.A01;
        akb.A0B = true;
        AKB.A01(akb);
        akb.A0M.A0B(aKl.A01, akb.A07);
        AMD amd = akb.A0M;
        AnonymousClass0P4 A002 = amd.A0H.A00("comment_prompt", amd.A0G.getId(), amd.A09);
        A002.A0G("is_canned_comment", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A002.A0E("canned_comment_position", Integer.valueOf(aKl.A00));
        A002.A0G("canned_commnet_text", aKl.A02);
        akb.A0G.A00(A002);
        AnonymousClass0Z0.A0C(-412597769, A05);
    }
}
