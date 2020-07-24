package p000X;

import android.os.Bundle;
import android.view.View;
import com.instagram.mainactivity.MainActivity;

/* renamed from: X.1Fv  reason: invalid class name and case insensitive filesystem */
public final class C26931Fv implements View.OnLongClickListener {
    public final /* synthetic */ MainActivity A00;

    public C26931Fv(MainActivity mainActivity) {
        this.A00 = mainActivity;
    }

    public final boolean onLongClick(View view) {
        this.A00.A03.A00(Constants.A12);
        C16330oQ.A00.A03();
        AnonymousClass0C1 r0 = this.A00.A06;
        C180297mr r3 = new C180297mr();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
        r3.setArguments(bundle);
        this.A00.AGw().A0F(r3);
        return true;
    }
}
