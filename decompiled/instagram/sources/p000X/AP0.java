package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;

/* renamed from: X.AP0 */
public final class AP0 extends C27341Hl {
    public C72063Dm A00;
    public boolean A01;
    public final C18750sM A02 = C18730sK.A00(new C23503AOz(this));
    public final C18750sM A03 = C18730sK.A00(APX.A00);
    public final C18750sM A04 = C18730sK.A00(new C23482AOe(this));
    public final C18750sM A05 = C18730sK.A00(new AP7(this));

    public final String getModuleName() {
        return "UserPayViewerBottomSheetFragment";
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A05.getValue();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C13150hy.A02(view, "view");
        super.onViewCreated(view, bundle);
        AnonymousClass1HQ r2 = ((AOZ) this.A03.getValue()).A00;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            r2.A05(activity, new AOW(this, view));
            return;
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1116795751);
        super.onCreate(bundle);
        AOU aou = (AOU) this.A04.getValue();
        ImmutableList A002 = ((AOZ) this.A03.getValue()).A00();
        AOZ aoz = (AOZ) this.A03.getValue();
        Object A023 = aoz.A00.A02();
        if (A023 == null) {
            C13150hy.A00();
        }
        AOV aov = (AOV) A023;
        aov.A09 = true;
        aoz.A00.A09(aov);
        AP2 ap2 = new AP2(aov, aoz);
        C13150hy.A02(ap2, "listener");
        C27990CZa cZa = (C27990CZa) aou.A03.getValue();
        boolean z = false;
        if (cZa.A00.asBoolean(false)) {
            z = true;
        }
        if (z) {
            CZW czw = cZa.A02;
            CZW.A06(czw, new C28001CZl(czw, true, A002, ap2));
        }
        AnonymousClass0Z0.A09(-168856498, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1140037850);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.iglive_user_pay_viewer_bottom_sheet, viewGroup, false);
        AnonymousClass0Z0.A09(-868018789, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1962999405);
        super.onDestroy();
        AnonymousClass0Z0.A09(-141740533, A022);
    }
}
