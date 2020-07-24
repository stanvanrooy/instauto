package p000X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.insights.fragment.InsightsPostGridFragment;
import com.instagram.business.insights.fragment.InsightsStoryGridFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C8R */
public abstract class C8R extends C27291Hg implements C27319C8o {
    public C27320C8p A00;
    public Integer A01;
    public String A02;
    public List A03;
    public boolean A04 = true;
    public final C27355CAa A05;
    public final AnonymousClass0C1 A06;
    public final C29081On A07;
    public final Integer A08;

    private synchronized void A00() {
        if (this.A00 != null) {
            if (this.A04) {
                this.A04 = false;
                this.A05.A04(this.A08, (Integer) null, Constants.A0C, 0);
            }
            this.A00.Bj2(A03());
            this.A00.BoK(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
    public Integer A01(Object obj) {
        boolean z;
        if (!(this instanceof C8O)) {
            if (!(this instanceof C8P)) {
                if (!(this instanceof C8M)) {
                    if (!(this instanceof C8L)) {
                        return Constants.A0Y;
                    }
                }
            }
            z = ((C8Z) obj).A01;
            return !z ? Constants.A0j : Constants.A0Y;
        }
        z = ((C27309C8a) obj).A01;
        if (!z) {
        }
    }

    public String A02(Object obj) {
        if (this instanceof C8O) {
            AnonymousClass267 A002 = ImmutableList.A00();
            A002.A07(((C27309C8a) obj).A00);
            return Integer.toString((((C8O) this).A03.size() * 3) + A002.A06().size());
        } else if (this instanceof C8P) {
            AnonymousClass267 A003 = ImmutableList.A00();
            A003.A07(((C8Z) obj).A00);
            return Integer.toString((((C8P) this).A03.size() * 3) + A003.A06().size());
        } else if (this instanceof C8M) {
            AnonymousClass267 A004 = ImmutableList.A00();
            A004.A07(((C27309C8a) obj).A00);
            return Integer.toString((((C8M) this).A03.size() * 3) + A004.A06().size());
        } else if (!(this instanceof C8L)) {
            return null;
        } else {
            AnonymousClass267 A005 = ImmutableList.A00();
            A005.A07(((C8Z) obj).A00);
            return Integer.toString((((C8L) this).A03.size() * 3) + A005.A06().size());
        }
    }

    public List A03() {
        ArrayList arrayList;
        if (this instanceof C8O) {
            C8O c8o = (C8O) this;
            arrayList = new ArrayList(c8o.A03.size() + 2);
            arrayList.add(c8o.A00);
            arrayList.addAll(c8o.A03);
            if (!c8o.A03.isEmpty()) {
                arrayList.add(AnonymousClass2ST.A00(c8o.A07));
                return arrayList;
            }
        } else if (this instanceof C8P) {
            C8P c8p = (C8P) this;
            arrayList = new ArrayList(c8p.A03.size() + 2);
            arrayList.add(c8p.A01);
            arrayList.addAll(c8p.A03);
            if (!c8p.A03.isEmpty()) {
                arrayList.add(AnonymousClass2ST.A00(c8p.A07));
                return arrayList;
            }
        } else if (this instanceof C8M) {
            C8M c8m = (C8M) this;
            arrayList = new ArrayList(c8m.A03.size() + 2);
            arrayList.add(c8m.A03);
            arrayList.addAll(c8m.A03);
            if (!c8m.A03.isEmpty()) {
                arrayList.add(AnonymousClass2ST.A00(c8m.A07));
            }
        } else if (!(this instanceof C8L)) {
            C8N c8n = (C8N) this;
            ArrayList arrayList2 = new ArrayList(c8n.A03.size() + 1);
            arrayList2.add(c8n.A04);
            arrayList2.addAll(c8n.A03);
            return arrayList2;
        } else {
            C8L c8l = (C8L) this;
            arrayList = new ArrayList(c8l.A03.size() + 1);
            arrayList.addAll(c8l.A03);
            if (!c8l.A03.isEmpty()) {
                arrayList.add(AnonymousClass2ST.A00(c8l.A07));
                return arrayList;
            }
        }
        return arrayList;
    }

    public void A04() {
        if (this instanceof C8O) {
            C8O c8o = (C8O) this;
            c8o.A01 = Constants.ONE;
            C8Q.A03(new C8J(c8o.A06, c8o.A01, Constants.A12, c8o.A02, (C27319C8o) c8o));
        } else if (this instanceof C8P) {
            C8P c8p = (C8P) this;
            c8p.A01 = Constants.ONE;
            C8Q.A02(new C8J(c8p.A06, c8p.A00, Constants.A0u, c8p.A02, (C27319C8o) c8p));
        } else if (this instanceof C8M) {
            C8M c8m = (C8M) this;
            synchronized (c8m) {
                c8m.A01 = Constants.ONE;
                C8Q.A03(new C8J(c8m.A06, Constants.A0j, c8m.A02, c8m.A01, (String) null, (String) null, c8m.A02, c8m));
            }
        } else if (!(this instanceof C8L)) {
            C8N c8n = (C8N) this;
            c8n.A01 = Constants.ONE;
            C8J c8j = new C8J(c8n.A06, c8n.A01, c8n.A00, c8n.A05, (C27319C8o) c8n);
            if (!C8Q.A04(c8j)) {
                C12810hQ.A02(C8Q.A00(c8j, AGL.A00(c8j.A01).toLowerCase(), new C27316C8l(c8j.A03), new DX9(c8j)));
            }
        } else {
            C8L c8l = (C8L) this;
            synchronized (c8l) {
                c8l.A01 = Constants.ONE;
                C8Q.A02(new C8J(c8l.A06, Constants.A0Y, 480, c8l.A02, c8l.A00, c8l.A01, c8l.A02, c8l.A03, (String) null, (String) null, c8l));
            }
        }
    }

    public void A05() {
        if (!(this instanceof C8O) && !(this instanceof C8P)) {
            if (this instanceof C8M) {
                C8M c8m = (C8M) this;
                synchronized (c8m) {
                    C27320C8p c8p = c8m.A00;
                    if (c8p != null) {
                        InsightsStoryGridFragment insightsStoryGridFragment = (InsightsStoryGridFragment) c8p;
                        C26808Bst bst = c8m.A00;
                        insightsStoryGridFragment.mTimeFrameFilterText.setText(C26809Bsu.A00(c8m.A01));
                        insightsStoryGridFragment.mMetricFilterText.setText(bst.A00);
                    }
                }
            } else if (this instanceof C8L) {
                C8L c8l = (C8L) this;
                synchronized (c8l) {
                    C27320C8p c8p2 = c8l.A00;
                    if (c8p2 != null) {
                        InsightsPostGridFragment insightsPostGridFragment = (InsightsPostGridFragment) c8p2;
                        Integer num = c8l.A01;
                        Integer num2 = c8l.A02;
                        C26808Bst bst2 = c8l.A00;
                        insightsPostGridFragment.mTypeFilterText.setText(C8c.A00(num));
                        insightsPostGridFragment.mTimeFrameFilterText.setText(C26809Bsu.A00(num2));
                        insightsPostGridFragment.mMetricFilterText.setText(bst2.A00);
                    }
                }
            }
        }
    }

    public final synchronized void A06(C27320C8p c8p) {
        this.A00 = c8p;
        if (c8p != null) {
            A05();
            int i = AnonymousClass47j.A00[this.A01.intValue()];
            if (i == 1 || i == 2) {
                this.A00.BoK(true);
            } else if (i == 3 || i == 4) {
                A00();
            } else {
                B2m((Throwable) null);
            }
        }
    }

    public void A07(Object obj) {
        if (this instanceof C8O) {
            C8O c8o = (C8O) this;
            AnonymousClass267 A002 = ImmutableList.A00();
            A002.A07(((C27309C8a) obj).A00);
            ImmutableList A062 = A002.A06();
            int i = 0;
            while (i < A062.size()) {
                int i2 = i + 3;
                c8o.A03.add(new C27327C8y(A062.subList(i, Math.min(i2, A062.size()))));
                i = i2;
            }
        } else if (this instanceof C8P) {
            C8P c8p = (C8P) this;
            AnonymousClass267 A003 = ImmutableList.A00();
            A003.A07(((C8Z) obj).A00);
            ImmutableList A063 = A003.A06();
            int i3 = 0;
            while (i3 < A063.size()) {
                int i4 = i3 + 3;
                c8p.A03.add(new C27326C8x(A063.subList(i3, Math.min(i4, A063.size()))));
                i3 = i4;
            }
        } else if (this instanceof C8M) {
            C8M c8m = (C8M) this;
            AnonymousClass267 A004 = ImmutableList.A00();
            A004.A07(((C27309C8a) obj).A00);
            ImmutableList A064 = A004.A06();
            int i5 = 0;
            while (i5 < A064.size()) {
                int i6 = i5 + 3;
                c8m.A03.add(new C27327C8y(A064.subList(i5, Math.min(i6, A064.size()))));
                i5 = i6;
            }
        } else if (!(this instanceof C8L)) {
            C8N c8n = (C8N) this;
            C27321C8q c8q = (C27321C8q) obj;
            c8n.A03.clear();
            AnonymousClass267 A005 = ImmutableList.A00();
            A005.A07(c8q.A00);
            ImmutableList A065 = A005.A06();
            int i7 = 0;
            if (!A065.isEmpty()) {
                c8n.A03.add(c8n.A02);
                int i8 = 0;
                while (i8 < A065.size()) {
                    int i9 = i8 + 3;
                    c8n.A03.add(new C27326C8x(A065.subList(i8, Math.min(i9, A065.size()))));
                    i8 = i9;
                }
            }
            AnonymousClass267 A006 = ImmutableList.A00();
            A006.A07(c8q.A01);
            ImmutableList A066 = A006.A06();
            if (!A066.isEmpty()) {
                c8n.A03.add(c8n.A03);
                while (i7 < A066.size()) {
                    int i10 = i7 + 3;
                    c8n.A03.add(new C27327C8y(A066.subList(i7, Math.min(i10, A066.size()))));
                    i7 = i10;
                }
            }
        } else {
            C8L c8l = (C8L) this;
            AnonymousClass267 A007 = ImmutableList.A00();
            A007.A07(((C8Z) obj).A00);
            ImmutableList A067 = A007.A06();
            int i11 = 0;
            while (i11 < A067.size()) {
                int i12 = i11 + 3;
                c8l.A03.add(new C27326C8x(A067.subList(i11, Math.min(i12, A067.size()))));
                i11 = i12;
            }
        }
    }

    public final synchronized void A08(boolean z) {
        C27320C8p c8p = this.A00;
        if (c8p != null) {
            c8p.BoK(z);
        }
        this.A02 = null;
        this.A03.clear();
        A04();
    }

    public final synchronized void Azh() {
        super.Azh();
        this.A00 = null;
    }

    public final synchronized void B2m(Throwable th) {
        this.A05.A07(Constants.ONE, th, this.A08);
        if (this.A02 == null) {
            this.A01 = Constants.A0C;
            C27320C8p c8p = this.A00;
            if (c8p != null) {
                c8p.BoD();
                this.A00.BoK(false);
            }
        } else {
            this.A01 = Constants.A0N;
        }
    }

    public final synchronized void BPi(Object obj) {
        this.A01 = A01(obj);
        this.A02 = A02(obj);
        A07(obj);
        A00();
    }

    public C8R(AnonymousClass0C1 r2, Integer num, C27355CAa cAa) {
        this.A06 = r2;
        this.A08 = num;
        this.A05 = cAa;
        this.A03 = new ArrayList();
        this.A01 = Constants.ZERO;
        this.A07 = new C8W(this);
    }
}
