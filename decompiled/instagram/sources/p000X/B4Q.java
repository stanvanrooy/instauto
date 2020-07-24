package p000X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.B4Q */
public final class B4Q extends C17920r1 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C06590Pq A02;
    public final /* synthetic */ C11520f6 A03;

    public B4Q(C11520f6 r1, C06590Pq r2, FragmentActivity fragmentActivity, Bundle bundle) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = fragmentActivity;
        this.A00 = bundle;
    }

    public final void onFail(C43791v5 r4) {
        int A032 = AnonymousClass0Z0.A03(-1035302468);
        C11520f6.A05(this.A03, "routes_request_failed");
        C11520f6.A02(this.A03, this.A01);
        AnonymousClass0Z0.A0A(1847670990, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0Z0.A03(798244937);
        C99374Rk r8 = (C99374Rk) obj;
        int A033 = AnonymousClass0Z0.A03(-790640385);
        C11520f6.A05(this.A03, "routes_request_success");
        if (!r8.isOk() || !this.A02.AgN()) {
            C11520f6.A05(this.A03, "param_mismatch");
            C11520f6.A02(this.A03, this.A01);
            AnonymousClass0Z0.A0A(-40714142, A033);
        } else {
            String string = this.A00.getString("bundle_param_route");
            List list = r8.A00;
            if (list == null || list.isEmpty()) {
                C11520f6.A05(this.A03, "empty_list_from_server");
                C11520f6.A02(this.A03, this.A01);
                AnonymousClass0Z0.A0A(-827335502, A033);
            } else {
                B4P A002 = B4P.A00();
                synchronized (A002) {
                    if (list != null) {
                        if (!list.isEmpty()) {
                            A002.A00 = new B4R(new HashSet(list));
                            B4P.A01(A002);
                        }
                    }
                }
                if (TextUtils.isEmpty(string) || !list.contains(string)) {
                    C11520f6.A05(this.A03, "incorrect_route");
                    C11520f6.A02(this.A03, this.A01);
                    AnonymousClass0Z0.A0A(761846004, A033);
                } else {
                    C11520f6.A03(this.A03, this.A02, this.A00, this.A01, string);
                    C11520f6.A01(this.A03);
                    AnonymousClass0Z0.A0A(-982568164, A033);
                }
            }
        }
        AnonymousClass0Z0.A0A(-1131201898, A032);
    }
}
