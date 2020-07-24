package p000X;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.CAA */
public final class CAA {
    public CA9 A00;
    public boolean A01;
    public final View A02;
    public final LinearLayoutManager A03;
    public final RecyclerView A04 = ((RecyclerView) AnonymousClass1E1.A07(this.A02, C0003R.C0005id.media_thumbnail_preview_recycler_view));
    public final AppBarLayout A05;
    public final CAB A06;
    public final AnonymousClass2MG A07;

    public final int A00() {
        int A1g = this.A03.A1g();
        int A1h = this.A03.A1h();
        int A1i = this.A03.A1i();
        if (Math.abs(A1h - A1g) > 1) {
            return (A1g + A1h) >> 1;
        }
        return A1i;
    }

    public final void A01() {
        AnonymousClass2MG r2 = this.A07;
        AnonymousClass11J.A00(r2);
        C68832zy r1 = new C68832zy();
        r1.A01(new CAJ());
        r2.A06(r1);
        this.A07.notifyDataSetChanged();
        this.A05.A02(true, true);
    }

    public CAA(AppBarLayout appBarLayout, ViewStub viewStub, float f) {
        viewStub.getContext();
        View inflate = viewStub.inflate();
        AnonymousClass11J.A00(inflate);
        this.A02 = inflate;
        inflate.setVisibility(4);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.A03 = linearLayoutManager;
        this.A04.setLayoutManager(linearLayoutManager);
        this.A06 = new CAB(f);
        AnonymousClass2MJ A002 = AnonymousClass2MG.A00(this.A04.getContext());
        A002.A01 = true;
        A002.A01(new CAF(f));
        A002.A01(this.A06);
        AnonymousClass2MG A003 = A002.A00();
        this.A07 = A003;
        this.A04.setAdapter(A003);
        this.A04.A0r(new AnonymousClass7I4(this, f));
        new DNI().A08(this.A04);
        this.A04.A0w(new CAE(this));
        this.A05 = appBarLayout;
        appBarLayout.A01(new CAG(this));
        this.A01 = true;
    }
}
