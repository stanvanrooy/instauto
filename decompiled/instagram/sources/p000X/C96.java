package p000X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.insights.p014ui.InsightsView;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgButton;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.Product;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.C96 */
public final class C96 extends C27341Hl implements C27371Ho, C51312Ke, C27319C8o {
    public long A00 = Long.MAX_VALUE;
    public View A01;
    public View A02;
    public C98 A03;
    public C8J A04;
    public C9A A05;
    public InsightsView A06;
    public InsightsView A07;
    public AnonymousClass2TI A08;
    public AnonymousClass0C1 A09;
    public SpinnerImageView A0A;
    public String A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E = true;
    public boolean A0F = false;
    public View A0G;
    public ScrollView A0H;
    public InsightsView A0I;
    public InsightsView A0J;
    public String A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;

    public static void A06(C96 c96, String str) {
        C96 c962 = c96;
        C98 c98 = c96.A03;
        C27355CAa cAa = c98.A09;
        Integer num = Constants.A0C;
        cAa.A05(num, Constants.A08, Constants.A0I, Constants.A0H, num, (Map) null, c98.A06, c98.A05, c98.A07, c98.A04);
        AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(c96.A09).A02(c96.A0K);
        C17510qM r8 = C17510qM.A00;
        FragmentActivity activity = c96.getActivity();
        AnonymousClass11J.A00(activity);
        C213969Km A0Q = r8.A0Q(activity, (Product) c96.A0D.get(str), c96.A09, c962, AnonymousClass0C5.$const$string(95), (String) null);
        A0Q.A02 = A022;
        A0Q.A08 = null;
        A0Q.A0G = true;
        A0Q.A09 = c962.getModuleName();
        A0Q.A0H = true;
        A0Q.A07 = null;
        A0Q.A02();
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void AtV() {
    }

    public final String getModuleName() {
        return AnonymousClass40t.$const$string(276);
    }

    public static Bundle A00(C96 c96) {
        C100844Xj.A00(c96.A09);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", c96.A09.getToken());
        bundle.putString("ARG.PostInsights.Info.Title", c96.getResources().getString(C0003R.string.shopping_info_title));
        return bundle;
    }

    private void A01() {
        if (!this.A0M) {
            C98 c98 = this.A03;
            c98.A02 = System.currentTimeMillis();
            C27355CAa.A01(c98.A09, Constants.A0D, (Integer) null, Constants.A0C, 0, c98.A05, c98.A06, c98.A07, c98.A04);
            this.A0M = true;
        }
        C98 c982 = this.A03;
        if (!c982.A08) {
            c982.A03 = System.currentTimeMillis();
            c982.A08 = true;
            C27355CAa.A01(c982.A09, Constants.A0B, (Integer) null, Constants.A0C, 0, c982.A05, c982.A06, c982.A07, c982.A04);
        }
        this.A0A.setVisibility(8);
        this.A01.setVisibility(8);
        this.A02.setVisibility(0);
        AnonymousClass2TI r2 = this.A08;
        if (r2 != null) {
            r2.A0C(getResources().getString(C0003R.string.bottom_sheet_title));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0383, code lost:
        if (r6.equals("HASHTAG") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0435, code lost:
        if (r2.A00 != false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0351, code lost:
        if (r6.equals("LOCATION") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x035b, code lost:
        if (r6.equals("EXPLORE") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0365, code lost:
        if (r6.equals("FEED") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x036f, code lost:
        if (r6.equals("OTHER") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0379, code lost:
        if (r6.equals("PROFILE") == false) goto L_0x0316;
     */
    private void A02() {
        String string;
        boolean z;
        View view;
        int i;
        Product product;
        ImageUrl imageUrl;
        Product product2;
        Resources resources;
        int i2;
        Object[] objArr;
        char c;
        int i3;
        Resources resources2;
        int i4;
        Object[] objArr2;
        String str;
        C9A c9a = this.A05;
        if (c9a != null) {
            this.A00 = c9a.A02;
            String A042 = this.A09.A04();
            String str2 = c9a.A0B;
            this.A0E = A042.equals(str2);
            if (c9a != null) {
                C98 c98 = this.A03;
                c98.A05 = c9a.A0A;
                c98.A06 = str2;
                c98.A07 = c9a.A09;
                C9U c9u = c9a.A03;
                if (c9u != null) {
                    c98.A04 = c9u.A00;
                }
            }
            switch (c9a.A08.intValue()) {
                case 2:
                    A03(this.A02);
                    C9A c9a2 = this.A05;
                    AnonymousClass11J.A00(c9a2);
                    C9E c9e = c9a2.A07;
                    IgTextView igTextView = (IgTextView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_profile_visits_count);
                    int i5 = c9e.A05;
                    if (i5 == 1) {
                        ((IgTextView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_profile_visits_title)).setText(C0003R.string.profile_visit_label);
                    }
                    if (!this.A0E) {
                        igTextView.setVisibility(8);
                        IgImageView igImageView = (IgImageView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_profile_visits_icon);
                        igImageView.setVisibility(0);
                        igImageView.setOnClickListener(new C9G(this));
                    } else if (C9K.A00(Constants.ZERO, this.A00)) {
                        igTextView.setText(NumberFormat.getInstance(C15300mf.A03()).format((long) i5));
                    } else {
                        igTextView.setText(C0003R.string.not_available_text);
                        igTextView.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_text));
                    }
                    ((IgTextView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_reach_count)).setText(NumberFormat.getInstance(C15300mf.A03()).format((long) c9e.A06));
                    InsightsView insightsView = this.A0J;
                    C9A c9a3 = this.A05;
                    AnonymousClass11J.A00(c9a3);
                    C9H c9h = c9a3.A05;
                    int i6 = c9h.A02;
                    Integer num = Constants.ZERO;
                    Integer num2 = num;
                    long j = this.A00;
                    if (!C9K.A00(num, j)) {
                        num2 = Constants.A0C;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!this.A0E) {
                        num = Constants.ONE;
                    } else if (!C9K.A00(num, j)) {
                        num = Constants.A0C;
                    }
                    arrayList.add(new C74((int) C0003R.string.profile_visits_label, c9h.A01, num));
                    C9D c9d = c9h.A03;
                    if (c9d != null) {
                        int i7 = c9d.A00;
                        int i8 = i7;
                        if (i7 > 0 && this.A0E && C9K.A00(Constants.ONE, this.A00)) {
                            arrayList.add(new C74((int) C0003R.string.interactions_replies_title, i8, Constants.ZERO));
                        }
                    }
                    if (this.A0E && C9K.A00(Constants.ZERO, this.A00)) {
                        for (C9D c9d2 : c9h.A00) {
                            int i9 = c9d2.A00;
                            int i10 = i9;
                            if (i9 > 0) {
                                arrayList.add(new C74(C26807Bss.A01(c9d2.A01), i10, Constants.ZERO));
                            }
                        }
                    }
                    insightsView.A04(new C7B(C0003R.string.interactions_title, i6, getResources().getString(C0003R.string.interactions_metric_description), num2, (String) null, arrayList));
                    InsightsView insightsView2 = this.A0I;
                    C9A c9a4 = this.A05;
                    AnonymousClass11J.A00(c9a4);
                    C9F c9f = c9a4.A04;
                    int i11 = c9f.A03;
                    int i12 = i11;
                    if (C9K.A00(Constants.ONE, this.A00)) {
                        double d = (((double) c9f.A02) / ((double) i11)) * 100.0d;
                        if (d == 0.0d || d >= 1.0d) {
                            int floor = (int) Math.floor(d);
                            if (!TextUtils.isEmpty(this.A0C)) {
                                resources2 = getResources();
                                i4 = C0003R.string.discovery_nonfollower_percentage_description;
                                objArr2 = new Object[]{Integer.valueOf(floor), this.A0C};
                            } else {
                                resources2 = getResources();
                                i4 = C0003R.string.discovery_nonfollower_percentage_description_no_username;
                                objArr2 = new Object[]{Integer.valueOf(floor)};
                            }
                        } else if (!TextUtils.isEmpty(this.A0C)) {
                            resources2 = getResources();
                            i4 = C0003R.string.discovery_nonfollower_less_than_one_percentage_description;
                            objArr2 = new Object[]{this.A0C};
                        } else {
                            str = getResources().getString(C0003R.string.f99xf99f2260);
                            string = AnonymousClass000.A0J(getResources().getString(C0003R.string.discovery_metric_description), "\n", str);
                        }
                        str = resources2.getString(i4, objArr2);
                        string = AnonymousClass000.A0J(getResources().getString(C0003R.string.discovery_metric_description), "\n", str);
                    } else {
                        string = getResources().getString(C0003R.string.discovery_metric_description);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Integer num3 = Constants.ZERO;
                    if (!this.A0E) {
                        num3 = Constants.ONE;
                    } else if (!C9K.A00(Constants.ONE, this.A00)) {
                        num3 = Constants.A0C;
                    }
                    arrayList2.add(new C74((int) C0003R.string.discovery_follows_title, c9f.A00, num3));
                    arrayList2.add(new C74((int) C0003R.string.reach_label, c9f.A03, Constants.ZERO));
                    ArrayList arrayList3 = new ArrayList();
                    String str3 = null;
                    if (C9K.A00(Constants.ZERO, this.A00)) {
                        for (C9D c9d3 : c9f.A05) {
                            if (c9d3.A00 > 0) {
                                Resources resources3 = getResources();
                                String str4 = c9d3.A01;
                                switch (str4.hashCode()) {
                                    case -1611296843:
                                        c = 3;
                                        break;
                                    case -591165837:
                                        c = 0;
                                        break;
                                    case 2153886:
                                        c = 1;
                                        break;
                                    case 75532016:
                                        c = 5;
                                        break;
                                    case 408556937:
                                        c = 4;
                                        break;
                                    case 1415530412:
                                        c = 2;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c == 0) {
                                    i3 = C0003R.string.discovery_impression_surface_explore;
                                } else if (c == 1) {
                                    i3 = C0003R.string.discovery_impression_surface_feed;
                                } else if (c == 2) {
                                    i3 = C0003R.string.discovery_impression_surface_hashtag;
                                } else if (c != 3) {
                                    i3 = C0003R.string.discovery_impression_surface_profile;
                                    if (c != 4) {
                                        i3 = C0003R.string.discovery_impression_surface_other;
                                    }
                                } else {
                                    i3 = C0003R.string.discovery_impression_surface_location;
                                }
                                arrayList3.add(new C77(resources3.getString(i3), c9d3.A00, Constants.ZERO));
                            }
                        }
                        C9D[] c9dArr = c9f.A04;
                        int length = c9dArr.length;
                        if (length > 0 && length >= 1) {
                            if (length == 1) {
                                String string2 = getResources().getString(C26807Bss.A00(c9dArr[0].A01));
                                resources = getResources();
                                i2 = C0003R.string.discovery_single_surface_footer_text;
                                objArr = new Object[]{string2};
                            } else if (length == 2) {
                                String string3 = getResources().getString(C26807Bss.A00(c9dArr[0].A01));
                                String string4 = getResources().getString(C26807Bss.A00(c9dArr[1].A01));
                                resources = getResources();
                                i2 = C0003R.string.discovery_double_surface_footer_text;
                                objArr = new Object[]{string3, string4};
                            } else {
                                String string5 = getResources().getString(C26807Bss.A00(c9dArr[0].A01));
                                String string6 = getResources().getString(C26807Bss.A00(c9dArr[1].A01));
                                String string7 = getResources().getString(C26807Bss.A00(c9dArr[2].A01));
                                resources = getResources();
                                i2 = C0003R.string.discovery_multiple_surface_footer_text;
                                objArr = new Object[]{string5, string6, string7};
                            }
                            str3 = resources.getString(i2, objArr);
                        }
                    }
                    arrayList2.add(new C74(C0003R.string.discovery_impressions_title, c9f.A01, Constants.ZERO, arrayList3));
                    insightsView2.A04(new C7B(C0003R.string.discovery_title, i12, string, Constants.ZERO, str3, arrayList2));
                    C9A c9a5 = this.A05;
                    if (!c9a5.A01) {
                        z = false;
                        break;
                    }
                    z = true;
                    if (z) {
                        if (C100844Xj.A00(this.A09).booleanValue()) {
                            InsightsView insightsView3 = this.A06;
                            C9A c9a6 = this.A05;
                            AnonymousClass11J.A00(c9a6);
                            C9I c9i = c9a6.A06;
                            int i13 = c9i.A01;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            C9D[] c9dArr2 = c9i.A03;
                            int length2 = c9dArr2.length;
                            int i14 = 0;
                            while (true) {
                                ImageUrl imageUrl2 = null;
                                if (i14 < length2) {
                                    C9D c9d4 = c9dArr2[i14];
                                    if (c9d4.A00 > 0 && (product2 = (Product) this.A0D.get(c9d4.A01)) != null) {
                                        ImageInfo A022 = product2.A02();
                                        if (A022 != null) {
                                            imageUrl2 = A022.A01();
                                        }
                                        arrayList5.add(new C77(product2.A0I, c9d4.A00, Constants.ZERO, product2.getId(), imageUrl2));
                                    }
                                    i14++;
                                } else {
                                    arrayList4.add(new C74(C0003R.string.shopping_product_page_views, c9i.A01, Constants.ZERO, arrayList5));
                                    ArrayList arrayList6 = new ArrayList();
                                    for (C9D c9d5 : c9i.A02) {
                                        if (c9d5.A00 > 0 && (product = (Product) this.A0D.get(c9d5.A01)) != null) {
                                            ImageInfo A023 = product.A02();
                                            if (A023 != null) {
                                                imageUrl = A023.A01();
                                            } else {
                                                imageUrl = null;
                                            }
                                            arrayList6.add(new C77(product.A0I, c9d5.A00, Constants.ZERO, product.getId(), imageUrl));
                                        }
                                    }
                                    int i15 = c9i.A00;
                                    Integer num4 = Constants.ZERO;
                                    arrayList4.add(new C74(C0003R.string.shopping_product_button_clicks, i15, num4, arrayList6));
                                    insightsView3.A04(new C7B(C0003R.string.shopping_title, i13, getResources().getString(C0003R.string.shopping_product_page_views), num4, (String) null, arrayList4));
                                    this.A06.setVisibility(0);
                                    view = this.A02;
                                    i = C0003R.C0005id.new_post_insights_shopping_divider;
                                }
                            }
                        } else {
                            InsightsView insightsView4 = this.A07;
                            C9A c9a7 = this.A05;
                            AnonymousClass11J.A00(c9a7);
                            C9I c9i2 = c9a7.A06;
                            int i16 = c9i2.A01;
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.add(new C74((int) C0003R.string.shopping_product_button_clicks, c9i2.A00, Constants.ZERO));
                            insightsView4.A04(new C7B(C0003R.string.shopping_title, i16, getResources().getString(C0003R.string.shopping_metric_description), Constants.ZERO, (String) null, arrayList7));
                            this.A07.setVisibility(0);
                            view = this.A02;
                            i = C0003R.C0005id.post_insights_shopping_divider;
                        }
                        view.findViewById(i).setVisibility(0);
                    }
                    if (this.A0N) {
                        this.A02.findViewById(C0003R.C0005id.post_insights_promotion_divider).setVisibility(0);
                        this.A0G.setVisibility(0);
                        CircularImageView circularImageView = (CircularImageView) this.A02.findViewById(C0003R.C0005id.promotion_image);
                        circularImageView.setFitImageInsideStroke(true);
                        circularImageView.A0A(getResources().getDimensionPixelSize(C0003R.dimen.post_insights_promote_image), C019000b.A00(getContext(), C0003R.color.igds_primary_text));
                        IgButton igButton = (IgButton) this.A02.findViewById(C0003R.C0005id.promotion_action_button);
                        igButton.setStyle(AnonymousClass96C.LABEL_EMPHASIZED);
                        igButton.setText(getResources().getString(C0003R.string.promotion_action_text));
                        igButton.setOnClickListener(new AnonymousClass6DD(this));
                    }
                    A01();
                    return;
                case 6:
                    A03(this.A02);
                    IgTextView igTextView2 = (IgTextView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_profile_visits_count);
                    if (!this.A0E) {
                        igTextView2.setVisibility(8);
                        ((IgImageView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_profile_visits_icon)).setVisibility(0);
                    } else {
                        igTextView2.setText(C0003R.string.not_available_text);
                        igTextView2.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_text));
                    }
                    IgTextView igTextView3 = (IgTextView) this.A02.findViewById(C0003R.C0005id.post_insights_metrics_grid_reach_count);
                    igTextView3.setText(C0003R.string.not_available_text);
                    igTextView3.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_text));
                    InsightsView insightsView5 = this.A0J;
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(new C74((int) C0003R.string.profile_visits_label, 0, Constants.A0C));
                    String string8 = getResources().getString(C0003R.string.interactions_metric_description);
                    Integer num5 = Constants.A0C;
                    insightsView5.A04(new C7B(C0003R.string.interactions_title, 0, string8, num5, (String) null, arrayList8));
                    InsightsView insightsView6 = this.A0I;
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(new C74((int) C0003R.string.discovery_follows_title, 0, num5));
                    arrayList9.add(new C74((int) C0003R.string.reach_label, 0, num5));
                    arrayList9.add(new C74((int) C0003R.string.discovery_impressions_title, 0, num5));
                    insightsView6.A04(new C7B(C0003R.string.discovery_title, 0, getResources().getString(C0003R.string.discovery_metric_description), Constants.A0C, (String) null, arrayList9));
                    A01();
                    return;
                default:
                    this.A0A.setVisibility(8);
                    this.A01.setVisibility(0);
                    this.A02.setVisibility(8);
                    this.A03.A09.A07(Constants.ZERO, (Throwable) null, Constants.A0B);
                    return;
            }
        }
    }

    private void A03(View view) {
        C9A c9a = this.A05;
        AnonymousClass11J.A00(c9a);
        C9E c9e = c9a.A07;
        IgTextView igTextView = (IgTextView) view.findViewById(C0003R.C0005id.post_insights_summary_header_likes_count);
        C40811pI.A02(igTextView);
        igTextView.setText(AnonymousClass23g.A00(Integer.valueOf(c9e.A04 + c9e.A01), igTextView.getResources(), true));
        IgTextView igTextView2 = (IgTextView) view.findViewById(C0003R.C0005id.post_insights_summary_header_comments_count);
        C40811pI.A02(igTextView2);
        igTextView2.setText(AnonymousClass23g.A00(Integer.valueOf(c9e.A03 + c9e.A00), igTextView2.getResources(), true));
        IgTextView igTextView3 = (IgTextView) view.findViewById(C0003R.C0005id.post_insights_summary_header_shares_count);
        if (C9K.A00(Constants.ONE, this.A00)) {
            igTextView3.setText(AnonymousClass23g.A00(Integer.valueOf(c9e.A08), igTextView3.getResources(), true));
        } else {
            igTextView3.setText(C0003R.string.not_available_summary_text);
            igTextView3.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_text));
            Drawable A032 = C019000b.A03(igTextView3.getContext(), C0003R.C0004drawable.instagram_direct_filled_16);
            if (A032 != null) {
                A032.mutate();
                A032.setBounds(0, 0, A032.getIntrinsicWidth(), A032.getIntrinsicHeight());
                A032.setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.igds_secondary_text)));
                igTextView3.setCompoundDrawables((Drawable) null, A032, (Drawable) null, (Drawable) null);
            }
        }
        C40811pI.A02(igTextView3);
        IgTextView igTextView4 = (IgTextView) view.findViewById(C0003R.C0005id.post_insights_summary_header_saves_count);
        igTextView4.setText(AnonymousClass23g.A00(Integer.valueOf(c9e.A07 + c9e.A02), igTextView4.getResources(), true));
        C40811pI.A02(igTextView4);
    }

    public static void A04(C96 c96) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(c96.getContext());
        r2.A03 = c96.getString(C0003R.string.insights_value_not_available_dialog_title);
        r2.A0M(c96.getString(C0003R.string.insights_value_not_available_dialog_message));
        r2.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
        r2.A03().show();
    }

    public static void A05(C96 c96, AnonymousClass1HD r15, Integer num) {
        Bundle bundle = r15.mArguments;
        if (bundle != null) {
            C98 c98 = c96.A03;
            C27355CAa cAa = c98.A09;
            Integer num2 = Constants.A0C;
            cAa.A05(num2, Constants.A03, Constants.A0A, num, num2, (Map) null, c98.A06, c98.A05, c98.A07, c98.A04);
            C23300zv A002 = C23300zv.A00(c96.A09);
            AnonymousClass2TH r6 = new AnonymousClass2TH(c96.A09);
            r6.A0L = bundle.getString("ARG.PostInsights.Info.Title");
            r6.A0H = new C150866cm(c96, A002);
            int[] iArr = AnonymousClass2TH.A0d;
            r6.A01(iArr[0], iArr[1], iArr[2], iArr[3]);
            r6.A00 = 1.0f;
            r6.A0T = true;
            AnonymousClass2TI r0 = c96.A08;
            if (r0 != null) {
                r0.A09(r6, r15, true);
            }
        }
    }

    public final boolean AhU() {
        ScrollView scrollView = this.A0H;
        if (scrollView == null || scrollView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r3 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r4.A00 != false) goto L_0x001a;
     */
    public final void AtY(int i, int i2) {
        boolean z;
        boolean z2;
        if (i == 0) {
            if (!this.A0L) {
                this.A0L = true;
                C98 c98 = this.A03;
                C9A c9a = this.A05;
                if (c9a != null) {
                    if (!c9a.A01) {
                        z2 = false;
                    }
                    z2 = true;
                    z = true;
                }
                z = false;
                HashMap hashMap = new HashMap();
                hashMap.put("direction", "up");
                c98.A09.A05(Constants.ONE, Constants.A07, Constants.A0B, (Integer) null, Constants.A0C, hashMap, c98.A06, c98.A05, c98.A07, c98.A04);
                C98.A00(c98);
                c98.A00 = System.currentTimeMillis();
                C27355CAa.A01(c98.A09, Constants.A0E, (Integer) null, Constants.A0C, 0, c98.A05, c98.A06, c98.A07, c98.A04);
                if (z) {
                    C27355CAa.A01(c98.A09, Constants.A0H, Constants.A0B, Constants.A0N, 0, c98.A05, c98.A06, c98.A07, c98.A04);
                }
                this.A0M = true;
            }
        }
    }

    public final void B2m(Throwable th) {
        this.A0A.setVisibility(8);
        this.A01.setVisibility(0);
        this.A02.setVisibility(8);
        this.A0F = false;
        this.A04 = null;
        this.A05 = null;
        C98 c98 = this.A03;
        c98.A09.A07(Constants.ONE, th, Constants.A0B);
        this.A03.A01();
    }

    public final /* bridge */ /* synthetic */ void BPi(Object obj) {
        C9A c9a = (C9A) obj;
        C8J c8j = this.A04;
        if (c8j != null && c8j.A02.equals(c9a.A0A) && this.A0F) {
            this.A05 = c9a;
            if (c9a != null) {
                A02();
                this.A03.A01();
            }
        }
    }

    public final C06590Pq getSession() {
        return this.A09;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-766923305);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass11J.A00(bundle2);
        this.A09 = AnonymousClass0J1.A06(bundle2);
        String string = bundle2.getString(AnonymousClass0C5.$const$string(142));
        this.A0K = string;
        this.A0B = string.split("_")[0];
        this.A0N = bundle2.getBoolean(AnonymousClass0C5.$const$string(141));
        this.A0C = bundle2.getString(AnonymousClass0C5.$const$string(143));
        ArrayList<Product> parcelableArrayList = bundle2.getParcelableArrayList("ARG.taggedProducts");
        if (parcelableArrayList != null) {
            this.A0D = new HashMap();
            for (Product product : parcelableArrayList) {
                this.A0D.put(product.getId(), product);
            }
        }
        this.A03 = new C98(new C27355CAa(this.A09, this));
        AnonymousClass0Z0.A09(-2122802119, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1965363372);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_post_insights, viewGroup, false);
        AnonymousClass0Z0.A09(1828414628, A022);
        return inflate;
    }

    public final void onDestroy() {
        long j;
        long j2;
        int A022 = AnonymousClass0Z0.A02(-251496822);
        super.onDestroy();
        if (this.A0A.getVisibility() == 0) {
            this.A03.A01();
        }
        if (this.A0M && this.A05 != null) {
            C98 c98 = this.A03;
            if (this.A0L) {
                c98.A09.A05(Constants.A0C, Constants.A12, Constants.A0E, Constants.A0B, Constants.A0N, (Map) null, c98.A06, c98.A05, c98.A07, c98.A04);
                long j3 = c98.A00;
                if (j3 != 0) {
                    j2 = System.currentTimeMillis() - j3;
                } else {
                    j2 = 0;
                }
                C27355CAa.A01(c98.A09, Constants.A0E, Constants.A0B, Constants.A0N, j2, c98.A05, c98.A06, c98.A07, c98.A04);
                c98.A00 = 0;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("direction", "down");
                c98.A09.A05(Constants.ONE, Constants.A07, Constants.A0B, (Integer) null, Constants.A0N, hashMap, c98.A06, c98.A05, c98.A07, c98.A04);
                C98.A00(c98);
            }
            long j4 = c98.A03;
            if (j4 != 0) {
                j = System.currentTimeMillis() - j4;
            } else {
                j = 0;
            }
            C27355CAa.A01(c98.A09, Constants.A0B, (Integer) null, Constants.A0N, j, c98.A05, c98.A06, c98.A07, c98.A04);
            c98.A08 = false;
            c98.A03 = 0;
        }
        this.A0F = false;
        this.A04 = null;
        this.A05 = null;
        AnonymousClass0Z0.A09(1982553958, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-859942625);
        super.onResume();
        AnonymousClass0Z0.A09(1226014093, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C9A c9a;
        super.onViewCreated(view, bundle);
        AnonymousClass00B.A01.markerEnd(39124994, 2);
        this.A0A = (SpinnerImageView) view.findViewById(C0003R.C0005id.post_insights_loading_spinner);
        this.A01 = view.findViewById(C0003R.C0005id.post_insights_error_view);
        this.A02 = view.findViewById(C0003R.C0005id.post_insights_full_screen_view);
        this.A0H = (ScrollView) view.findViewById(C0003R.C0005id.post_insights_full_screen_content_view);
        InsightsView insightsView = (InsightsView) view.findViewById(C0003R.C0005id.post_insights_interactions_view);
        this.A0J = insightsView;
        if (insightsView != null) {
            insightsView.A06 = new C97(this);
        }
        InsightsView insightsView2 = (InsightsView) view.findViewById(C0003R.C0005id.post_insights_discovery_view);
        this.A0I = insightsView2;
        if (insightsView2 != null) {
            insightsView2.A06 = new C99(this);
        }
        InsightsView insightsView3 = (InsightsView) view.findViewById(C0003R.C0005id.post_insights_shopping_view);
        this.A07 = insightsView3;
        if (insightsView3 != null) {
            insightsView3.A06 = new C9B(this);
        }
        InsightsView insightsView4 = (InsightsView) view.findViewById(C0003R.C0005id.new_post_insights_shopping_view);
        this.A06 = insightsView4;
        if (insightsView4 != null) {
            insightsView4.A06 = new C9C(this);
        }
        this.A0G = view.findViewById(C0003R.C0005id.post_insights_promotion_view);
        this.A0F = true;
        C8J c8j = this.A04;
        if (c8j == null || (c9a = this.A05) == null || !c8j.A02.equals(c9a.A0A)) {
            this.A0A.setVisibility(0);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            this.A03.A01 = System.currentTimeMillis();
            C8J c8j2 = new C8J(this.A09, this.A0B, Constants.ONE, this);
            this.A04 = c8j2;
            if (!C8Q.A04(c8j2)) {
                C12810hQ.A02(C8Q.A00(c8j2, AGL.A00(c8j2.A01).toLowerCase(), new C9J(c8j2.A03), new C30300DZi(c8j2)));
                return;
            }
            return;
        }
        A02();
    }
}
