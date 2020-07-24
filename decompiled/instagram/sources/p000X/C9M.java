package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.p014ui.InsightsView;
import java.util.ArrayList;

/* renamed from: X.C9M */
public final class C9M extends C27291Hg implements C27319C8o {
    public long A00;
    public long A01;
    public C8J A02;
    public C9Q A03;
    public boolean A04 = false;
    public boolean A05;
    public final C27355CAa A06;
    public final C9L A07;
    public final AnonymousClass0C1 A08;

    public static void A02(C9M c9m) {
        C9M c9m2 = c9m;
        C9Q c9q = c9m.A03;
        if (c9q != null) {
            switch (c9q.A03.intValue()) {
                case 2:
                    c9m2.A03(Constants.A04, (Integer) null, Constants.A0N, System.currentTimeMillis() - c9m2.A01);
                    return;
                case 4:
                    c9m2.A03(Constants.A07, Constants.A04, Constants.A0N, System.currentTimeMillis() - c9m2.A01);
                    return;
                default:
                    return;
            }
        }
    }

    private void A00() {
        C9Q c9q = this.A03;
        if (c9q != null) {
            switch (c9q.A03.intValue()) {
                case 2:
                    A03(Constants.A04, (Integer) null, Constants.A0C, 0);
                    return;
                case 4:
                    A03(Constants.A07, Constants.A04, Constants.A0C, 0);
                    return;
                default:
                    return;
            }
        }
    }

    private void A01() {
        C9Q c9q;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        if (this.A04 && (c9q = this.A03) != null) {
            Integer num5 = c9q.A03;
            int intValue = num5.intValue();
            switch (intValue) {
                case 2:
                    C9L c9l = this.A07;
                    C9R c9r = c9q.A02;
                    Context context = c9l.getContext();
                    int i = c9r.A00;
                    int i2 = i + c9r.A04 + c9r.A06 + c9r.A01 + c9r.A03 + c9r.A02 + c9r.A05;
                    ArrayList arrayList = new ArrayList();
                    int i3 = i;
                    if (i > 0) {
                        arrayList.add(new C74((int) C0003R.string.insights_interactions_link_clicks, i3, Constants.ZERO));
                    }
                    int i4 = c9r.A04;
                    int i5 = i4;
                    if (i4 > 0) {
                        arrayList.add(new C74((int) C0003R.string.insights_interactions_shares, i5, Constants.ZERO));
                    }
                    int i6 = c9r.A06;
                    int i7 = i6;
                    if (i6 > 0) {
                        if (this.A05) {
                            num4 = Constants.ZERO;
                        } else {
                            num4 = Constants.ONE;
                        }
                        arrayList.add(new C74((int) C0003R.string.insights_interactions_replies, i7, num4));
                    }
                    int i8 = c9r.A01;
                    int i9 = i8;
                    if (i8 > 0) {
                        arrayList.add(new C74((int) C0003R.string.insights_interactions_product_clicks, i9, Constants.ZERO));
                    }
                    int i10 = c9r.A03;
                    if (this.A05) {
                        num = Constants.ZERO;
                    } else {
                        num = Constants.ONE;
                    }
                    arrayList.add(new C74((int) C0003R.string.insights_interactions_profile_visits, i10, num));
                    for (C9D c9d : c9r.A07) {
                        int i11 = c9d.A00;
                        int i12 = i11;
                        if (i11 > 0) {
                            arrayList.add(new C74(C26807Bss.A01(c9d.A01), i12, Constants.ZERO));
                        }
                    }
                    if (c9r.A05 > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C9D c9d2 : c9r.A08) {
                            int i13 = c9d2.A00;
                            int i14 = i13;
                            if (i13 > 0) {
                                String str2 = c9d2.A01;
                                if (this.A05) {
                                    num3 = Constants.ZERO;
                                } else {
                                    num3 = Constants.ONE;
                                }
                                arrayList2.add(new C77(str2, i14, num3));
                            }
                        }
                        arrayList.add(new C74(C0003R.string.insights_interactions_sticker_taps, c9r.A05, Constants.ZERO, arrayList2));
                    }
                    int i15 = C0003R.string.insights_interactions_empty;
                    if (i2 > 0) {
                        i15 = C0003R.string.insights_interactions_message;
                    }
                    String string = context.getString(i15);
                    Integer num6 = Constants.ZERO;
                    C7B c7b = new C7B(C0003R.string.insights_interactions_title, i2, string, num6, (String) null, arrayList);
                    C9S c9s = this.A03.A01;
                    Context context2 = this.A07.getContext();
                    ArrayList arrayList3 = new ArrayList();
                    int i16 = c9s.A05;
                    int i17 = i16;
                    if (i16 > 0) {
                        arrayList3.add(new C74((int) C0003R.string.insights_discovery_impressions, i17, num6));
                    }
                    int i18 = c9s.A03;
                    int i19 = i18;
                    if (i18 >= 0) {
                        if (this.A05) {
                            num2 = Constants.ZERO;
                        } else {
                            num2 = Constants.ONE;
                        }
                        arrayList3.add(new C74((int) C0003R.string.insights_discovery_follows, i19, num2));
                    }
                    int i20 = c9s.A01;
                    if (i20 + c9s.A04 + c9s.A00 + c9s.A02 > 0 && this.A07 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        if (context2 != null) {
                            if (i20 > 0) {
                                arrayList4.add(new C77(context2.getString(C0003R.string.back), c9s.A01, num6));
                            }
                            if (c9s.A04 > 0) {
                                arrayList4.add(new C77(context2.getString(C0003R.string.insights_discovery_navigation_forward), c9s.A04, num6));
                            }
                            if (c9s.A00 > 0) {
                                arrayList4.add(new C77(context2.getString(C0003R.string.insights_discovery_navigation_next_story), c9s.A00, num6));
                            }
                            if (c9s.A02 > 0) {
                                arrayList4.add(new C77(context2.getString(C0003R.string.insights_discovery_navigation_exited), c9s.A02, num6));
                            }
                        }
                        arrayList3.add(new C74(C0003R.string.insights_discovery_navigation, c9s.A01 + c9s.A04 + c9s.A00 + c9s.A02, num6, arrayList4));
                    }
                    C7B c7b2 = new C7B(C0003R.string.insights_discovery_title, c9s.A06, context2.getString(C0003R.string.insights_discovery_message), Constants.ZERO, (String) null, arrayList3);
                    InsightsView insightsView = c9l.A05;
                    if (insightsView != null) {
                        insightsView.A04(c7b);
                    }
                    InsightsView insightsView2 = c9l.A04;
                    if (insightsView2 != null) {
                        insightsView2.A04(c7b2);
                    }
                    C06220Of.A0T(c9l.A00, 0);
                    C06220Of.A0T(c9l.A02, 8);
                    C06220Of.A0T(c9l.A06, 8);
                    C06220Of.A0T(c9l.A01, 8);
                    C16920pO.getInstance().getPerformanceLogger(c9l.getSession()).BQd();
                    A00();
                    break;
                case 4:
                    C9L c9l2 = this.A07;
                    C06220Of.A0T(c9l2.A00, 8);
                    C06220Of.A0T(c9l2.A02, 0);
                    C06220Of.A0T(c9l2.A06, 8);
                    C06220Of.A0T(c9l2.A01, 8);
                    A00();
                    break;
                default:
                    if (num5 != null) {
                        switch (intValue) {
                            case 1:
                                str = "ERROR";
                                break;
                            case 2:
                                str = "AVAILABLE";
                                break;
                            case 3:
                                str = "OLD_POST";
                                break;
                            case 4:
                                str = "NOT_ENOUGH_REACH";
                                break;
                            case 5:
                                str = "EXPIRED";
                                break;
                            case 6:
                                str = "UNTRACKED";
                                break;
                            default:
                                str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                                break;
                        }
                    } else {
                        str = "null";
                    }
                    B2m(new IllegalStateException(AnonymousClass000.A0E("Invalid state:", str)));
                    break;
            }
            this.A01 = System.currentTimeMillis();
        }
    }

    private void A03(Integer num, Integer num2, Integer num3, long j) {
        String str;
        C9Q c9q = this.A03;
        AnonymousClass0a4.A06(c9q);
        C27355CAa cAa = this.A06;
        String str2 = c9q.A05;
        String str3 = c9q.A06;
        String str4 = c9q.A04;
        C9U c9u = c9q.A00;
        if (c9u == null) {
            str = null;
        } else {
            str = c9u.A00;
        }
        C27355CAa.A01(cAa, num, num2, num3, j, str2, str3, str4, str);
    }

    public final void B2m(Throwable th) {
        C9L c9l = this.A07;
        C06220Of.A0T(c9l.A00, 8);
        C06220Of.A0T(c9l.A02, 8);
        C06220Of.A0T(c9l.A06, 8);
        C06220Of.A0T(c9l.A01, 0);
        this.A02 = null;
        this.A03 = null;
        this.A06.A07(Constants.ZERO, th, Constants.A04);
    }

    public final /* bridge */ /* synthetic */ void BPi(Object obj) {
        C9Q c9q = (C9Q) obj;
        C8J c8j = this.A02;
        if (c8j != null && c8j.A02.equals(c9q.A05)) {
            this.A03 = c9q;
            this.A05 = this.A08.A04().equals(c9q.A06);
            A03(Constants.A04, (Integer) null, Constants.ONE, System.currentTimeMillis() - this.A00);
            this.A00 = 0;
            A01();
        }
    }

    public C9M(AnonymousClass0C1 r2, C27355CAa cAa, C9L c9l) {
        this.A07 = c9l;
        this.A08 = r2;
        this.A06 = cAa;
    }

    public final void Azd() {
        super.Azd();
        this.A04 = false;
        this.A03 = null;
    }

    public final void Azh() {
        super.Azh();
        this.A04 = false;
        A02(this);
    }

    public final void BVf(View view, Bundle bundle) {
        super.BVf(view, bundle);
        this.A04 = true;
        A01();
    }
}
