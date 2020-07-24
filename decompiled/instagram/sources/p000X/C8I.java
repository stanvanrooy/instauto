package p000X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.insights.fragment.ProductCreatorsListFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C8I */
public final class C8I extends C27291Hg implements C27319C8o {
    public ProductCreatorsListFragment A00;
    public Integer A01;
    public String A02;
    public List A03;
    public boolean A04 = true;
    public String A05;
    public final C7W A06;
    public final C27355CAa A07;
    public final AnonymousClass0C1 A08;

    public static synchronized void A01(C8I c8i, Integer num, Integer num2, Integer num3) {
        synchronized (c8i) {
            Integer num4 = num;
            C27355CAa.A01(c8i.A07, num4, num2, num3, 0, c8i.A05, c8i.A08.A04(), (String) null, (String) null);
        }
    }

    public final synchronized void A02() {
        if (this.A00 != null) {
            synchronized (this) {
                if (this.A04) {
                    this.A04 = false;
                    A01(this, Constants.A03, Constants.A0L, Constants.A0C);
                }
            }
            ProductCreatorsListFragment productCreatorsListFragment = this.A00;
            ArrayList arrayList = new ArrayList(this.A03.size() + 1);
            arrayList.add(this.A06);
            arrayList.addAll(this.A03);
            AnonymousClass2MG r1 = productCreatorsListFragment.A02;
            C68832zy r0 = new C68832zy();
            r0.A02(arrayList);
            r1.A06(r0);
            productCreatorsListFragment.mErrorView.setVisibility(8);
            productCreatorsListFragment.mSwipeRefreshLayout.setRefreshing(false);
            this.A00.A01(false);
        }
    }

    public final synchronized void Azh() {
        super.Azh();
        this.A00 = null;
    }

    public final synchronized void B2m(Throwable th) {
        this.A07.A07(Constants.ONE, th, Constants.A03);
        if (this.A02 == null) {
            this.A01 = Constants.A0C;
            ProductCreatorsListFragment productCreatorsListFragment = this.A00;
            if (productCreatorsListFragment != null) {
                productCreatorsListFragment.A02.A06(new C68832zy());
                productCreatorsListFragment.mErrorView.setVisibility(0);
                productCreatorsListFragment.mSwipeRefreshLayout.setRefreshing(false);
                this.A00.A01(false);
            }
        } else {
            this.A01 = Constants.A0N;
        }
    }

    public static void A00(C8I c8i) {
        c8i.A01 = Constants.ONE;
        C8J c8j = new C8J(c8i.A08, c8i.A05, Constants.A14, c8i.A02, "15", (C27319C8o) c8i);
        if (!C8Q.A04(c8j)) {
            C12810hQ.A02(C8Q.A00(c8j, AGL.A00(c8j.A01).toLowerCase(), new C27314C8j(c8j.A03), new C30438DcM(c8j)));
        }
    }

    public final /* bridge */ /* synthetic */ void BPi(Object obj) {
        Integer num;
        C27322C8r c8r = (C27322C8r) obj;
        synchronized (this) {
            if (c8r.A01) {
                num = Constants.A0j;
            } else {
                num = Constants.A0Y;
            }
            this.A01 = num;
            AnonymousClass267 A002 = ImmutableList.A00();
            A002.A07(c8r.A00);
            ImmutableList A062 = A002.A06();
            this.A02 = Integer.toString(this.A03.size() + A062.size());
            C239512q A0I = A062.iterator();
            while (A0I.hasNext()) {
                this.A03.add(new C84((C85) A0I.next()));
            }
            A02();
        }
    }

    public C8I(AnonymousClass0C1 r2, C27355CAa cAa, String str, String str2) {
        this.A07 = cAa;
        this.A08 = r2;
        this.A05 = str;
        this.A06 = new C7W(str2);
        this.A03 = new ArrayList();
        this.A01 = Constants.ZERO;
        A00(this);
    }
}
