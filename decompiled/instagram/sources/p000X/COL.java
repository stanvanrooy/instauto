package p000X;

import android.content.Context;
import android.widget.AbsListView;

/* renamed from: X.COL */
public final class COL implements C29081On, C29091Oo, AbsListView.OnScrollListener {
    public Integer A00;
    public String A01;
    public boolean A02;
    public final AnonymousClass0C1 A03;
    public final C27708COc A04;
    public final Context A05;
    public final AnonymousClass1L8 A06;
    public final C62432nh A07;

    public final void A00() {
        if (this.A00 != Constants.ZERO) {
            C15890nh r2 = new C15890nh(this.A03);
            r2.A0C = "commerce/highlighted_products/users/";
            r2.A09 = Constants.A0N;
            r2.A06(COW.class, false);
            r2.A0A("max_id", this.A01);
            C17850qu A032 = r2.A03();
            A032.A00 = new COM(this);
            C28351Lj.A00(this.A05, this.A06, A032);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A02 == false) goto L_0x000b;
     */
    public final void A68() {
        boolean z;
        if (this.A00 == Constants.A0C) {
            z = true;
        }
        z = false;
        if (z) {
            Aix();
        }
    }

    public final boolean Abq() {
        return !this.A04.A00.A02.isEmpty();
    }

    public final boolean AfR() {
        if (this.A00 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public final boolean AgL() {
        if (this.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public COL(C27708COc cOc, AnonymousClass0C1 r5, Context context, AnonymousClass1L8 r7) {
        this.A04 = cOc;
        this.A03 = r5;
        this.A05 = context;
        this.A06 = r7;
        this.A07 = new C62432nh(r5, Constants.ONE, 5, (C29091Oo) this);
    }

    public final boolean Abs() {
        return this.A02;
    }

    public final boolean AgJ() {
        if (AgL()) {
            return Abq();
        }
        return true;
    }

    public final void Aix() {
        A00();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(1631770693);
        this.A07.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(388943294, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(1195007127);
        this.A07.onScrollStateChanged(absListView, i);
        AnonymousClass0Z0.A0A(-464785089, A032);
    }
}
