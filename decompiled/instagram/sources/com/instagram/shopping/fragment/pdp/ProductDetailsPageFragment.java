package com.instagram.shopping.fragment.pdp;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductLaunchInformation;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.incentives.sellerfunded.Incentive;
import com.instagram.model.shopping.incentives.sellerfunded.IncentiveContainer;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.shopping.model.analytics.ShoppingExploreLoggingInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0IU;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass10K;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1F6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OP;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass2NR;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass35Z;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass3AO;
import p000X.AnonymousClass5EO;
import p000X.AnonymousClass5F4;
import p000X.AnonymousClass6N6;
import p000X.AnonymousClass6N7;
import p000X.AnonymousClass6N8;
import p000X.AnonymousClass6TG;
import p000X.AnonymousClass7K7;
import p000X.AnonymousClass8TO;
import p000X.AnonymousClass95s;
import p000X.AnonymousClass9DN;
import p000X.AnonymousClass9DP;
import p000X.AnonymousClass9DR;
import p000X.AnonymousClass9ER;
import p000X.AnonymousClass9Gr;
import p000X.AnonymousClass9IB;
import p000X.AnonymousClass9II;
import p000X.AnonymousClass9IL;
import p000X.AnonymousClass9J7;
import p000X.AnonymousClass9JK;
import p000X.AnonymousClass9Jv;
import p000X.AnonymousClass9KH;
import p000X.AnonymousClass9KK;
import p000X.AnonymousClass9KM;
import p000X.AnonymousClass9KR;
import p000X.AnonymousClass9KS;
import p000X.AnonymousClass9KT;
import p000X.AnonymousClass9KU;
import p000X.AnonymousClass9KX;
import p000X.AnonymousClass9L1;
import p000X.AnonymousClass9L2;
import p000X.AnonymousClass9L9;
import p000X.AnonymousClass9LA;
import p000X.AnonymousClass9LB;
import p000X.AnonymousClass9LC;
import p000X.AnonymousClass9LD;
import p000X.AnonymousClass9LI;
import p000X.AnonymousClass9LJ;
import p000X.AnonymousClass9LK;
import p000X.AnonymousClass9LL;
import p000X.AnonymousClass9LM;
import p000X.AnonymousClass9LN;
import p000X.AnonymousClass9LQ;
import p000X.AnonymousClass9LR;
import p000X.AnonymousClass9LS;
import p000X.AnonymousClass9LV;
import p000X.AnonymousClass9LW;
import p000X.AnonymousClass9LX;
import p000X.AnonymousClass9MA;
import p000X.AnonymousClass9MC;
import p000X.AnonymousClass9MF;
import p000X.AnonymousClass9MG;
import p000X.AnonymousClass9MH;
import p000X.AnonymousClass9MK;
import p000X.AnonymousClass9MN;
import p000X.AnonymousClass9MO;
import p000X.AnonymousClass9MP;
import p000X.AnonymousClass9MT;
import p000X.AnonymousClass9MU;
import p000X.AnonymousClass9N4;
import p000X.AnonymousClass9ND;
import p000X.AnonymousClass9NV;
import p000X.AnonymousClass9NX;
import p000X.AnonymousClass9O0;
import p000X.AnonymousClass9O4;
import p000X.AnonymousClass9OP;
import p000X.AnonymousClass9OT;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9RD;
import p000X.C05000Hl;
import p000X.C05700Lp;
import p000X.C06170Oa;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C116754zo;
import p000X.C11850fm;
import p000X.C12670hC;
import p000X.C12830hS;
import p000X.C13150hy;
import p000X.C14090jk;
import p000X.C145636Km;
import p000X.C15890nh;
import p000X.C160276se;
import p000X.C16160o8;
import p000X.C169867Od;
import p000X.C17510qM;
import p000X.C17850qu;
import p000X.C196188aQ;
import p000X.C200068hI;
import p000X.C200208hc;
import p000X.C211829Bs;
import p000X.C211929Cd;
import p000X.C211969Ch;
import p000X.C213049Gt;
import p000X.C213329Hv;
import p000X.C213539Ir;
import p000X.C213559It;
import p000X.C213579Iv;
import p000X.C213619Iz;
import p000X.C213859Ka;
import p000X.C213869Kb;
import p000X.C213879Kc;
import p000X.C213909Kf;
import p000X.C213949Kj;
import p000X.C213959Kk;
import p000X.C213979Kn;
import p000X.C213989Ko;
import p000X.C214009Kq;
import p000X.C214019Kr;
import p000X.C214029Ks;
import p000X.C214039Kt;
import p000X.C214049Ku;
import p000X.C214089Ky;
import p000X.C214109La;
import p000X.C214119Lb;
import p000X.C214409Me;
import p000X.C214459Mj;
import p000X.C214489Mm;
import p000X.C214509Mo;
import p000X.C214559Mt;
import p000X.C214589Mw;
import p000X.C214599Mx;
import p000X.C214669Ne;
import p000X.C214769No;
import p000X.C214779Np;
import p000X.C214869Nz;
import p000X.C215059Os;
import p000X.C215239Pk;
import p000X.C215269Po;
import p000X.C215319Pt;
import p000X.C215689Ri;
import p000X.C215909Sm;
import p000X.C219489d9;
import p000X.C222609iI;
import p000X.C223109jD;
import p000X.C23300zv;
import p000X.C26571Ea;
import p000X.C27341Hl;
import p000X.C28051Kf;
import p000X.C28351Lj;
import p000X.C29621Qp;
import p000X.C30541Ug;
import p000X.C30661Us;
import p000X.C30671Ut;
import p000X.C31071Wi;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C32991cC;
import p000X.C33051cI;
import p000X.C36451i4;
import p000X.C37141jB;
import p000X.C51522Kz;
import p000X.C52002Na;
import p000X.C52922Qt;
import p000X.C61622m6;

public class ProductDetailsPageFragment extends C27341Hl implements C30541Ug, AnonymousClass1HK, C11850fm, C52922Qt {
    public int A00;
    public long A01;
    public long A02;
    public AnonymousClass1NJ A03;
    public Product A04;
    public ProductTileMedia A05;
    public AnonymousClass0C1 A06;
    public C213959Kk A07;
    public C213979Kn A08;
    public C214049Ku A09;
    public C160276se A0A;
    public AnonymousClass9KK A0B;
    public C211929Cd A0C;
    public C213329Hv A0D;
    public C214119Lb A0E;
    public AnonymousClass9JK A0F;
    public C213559It A0G;
    public C213579Iv A0H;
    public C213989Ko A0I;
    public C214559Mt A0J;
    public AnonymousClass9MK A0K;
    public AnonymousClass9II A0L;
    public AnonymousClass9LJ A0M;
    public AnonymousClass9Gr A0N;
    public AnonymousClass9MO A0O;
    public AnonymousClass9L9 A0P;
    public C214489Mm A0Q;
    public AnonymousClass9MU A0R;
    public AnonymousClass9MP A0S;
    public C215269Po A0T;
    public AnonymousClass9MT A0U;
    public C214109La A0V;
    public AnonymousClass9IB A0W;
    public AnonymousClass9ND A0X;
    public AnonymousClass9MN A0Y;
    public C213619Iz A0Z;
    public AnonymousClass9Jv A0a;
    public AnonymousClass39Z A0b;
    public C213869Kb A0c;
    public AnonymousClass9KU A0d = AnonymousClass9KU.A0E;
    public AnonymousClass9KH A0e;
    public Runnable A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m;
    public AnonymousClass1EW A0n;
    public AnonymousClass1OP A0o;
    public C52002Na A0p;
    public AnonymousClass9ER A0q;
    public C214029Ks A0r;
    public C116754zo A0s;
    public C214089Ky A0t;
    public C196188aQ A0u;
    public C214869Nz A0v;
    public AnonymousClass95s A0w;
    public AnonymousClass9LD A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public boolean A11;
    public final AnonymousClass7K7 A12 = new AnonymousClass7K7();
    public final AnonymousClass1HM A13 = new AnonymousClass9L2(this);
    public final C11200ea A14 = new AnonymousClass9LQ(this);
    public final C11200ea A15 = new AnonymousClass9LV(this);
    public final C11200ea A16 = new AnonymousClass9MC(this);
    public final C11200ea A17 = new C213859Ka(this);
    public final C11200ea A18 = new AnonymousClass9LK(this);
    public final C28051Kf A19 = C28051Kf.A00();
    public final AnonymousClass2NR A1A = new AnonymousClass2NR();
    public final AnonymousClass1I1 A1B = new AnonymousClass1I1();
    public final AnonymousClass9O0 A1C = new AnonymousClass9O0(this);
    public final AnonymousClass1I6 A1D = AnonymousClass6TG.A00();
    public final String A1E = UUID.randomUUID().toString();
    public RecyclerView mRecyclerView;

    public static void A02(ProductDetailsPageFragment productDetailsPageFragment) {
        MediaType mediaType;
        String str;
        ProductDetailsPageFragment productDetailsPageFragment2 = productDetailsPageFragment;
        AnonymousClass1NJ r0 = productDetailsPageFragment.A03;
        if (r0 != null) {
            mediaType = r0.APx();
        } else {
            mediaType = null;
        }
        C214039Kt r5 = new C214039Kt(productDetailsPageFragment2, productDetailsPageFragment.A06, productDetailsPageFragment.A0d.A01, productDetailsPageFragment.A0g, mediaType, productDetailsPageFragment.A10, productDetailsPageFragment.A0j, productDetailsPageFragment.A0v);
        if (((Boolean) AnonymousClass0L6.A02(r5.A03, AnonymousClass0L7.ACTION_SHEET_MIGRATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass5EO r4 = new AnonymousClass5EO(r5.A03, r5.A04.getContext());
            for (AnonymousClass9MA r2 : r5.A07) {
                switch (r2.ordinal()) {
                    case 0:
                    case 1:
                        r4.A01(r2.A00, new C214589Mw(r5, r2));
                        break;
                    default:
                        r4.A02(r2.A00, new C214599Mx(r5, r2));
                        break;
                }
            }
            r4.A00().A01(r5.A04.getContext());
        } else {
            CharSequence[] charSequenceArr = new CharSequence[r5.A07.size()];
            for (int i = 0; i < r5.A07.size(); i++) {
                charSequenceArr[i] = r5.A04.getString(((AnonymousClass9MA) r5.A07.get(i)).A00);
            }
            AnonymousClass5F4 r1 = new AnonymousClass5F4(r5.A04.getContext());
            r1.A03(r5.A04);
            r1.A0A(charSequenceArr, r5.A00);
            r1.A09(true);
            r1.A00().show();
        }
        ProductDetailsPageFragment productDetailsPageFragment3 = r5.A04;
        AnonymousClass6N8.A01(productDetailsPageFragment3.getActivity(), productDetailsPageFragment3, r5.A02.getId(), r5.A03, r5.A05, Constants.ZERO);
        if (r5.A07.contains(AnonymousClass9MA.FLAG_PRODUCT)) {
            ProductDetailsPageFragment productDetailsPageFragment4 = r5.A04;
            String id = r5.A02.getId();
            String str2 = r5.A05;
            String str3 = null;
            if (str2 != null) {
                str = C36451i4.A00(str2);
            } else {
                str = null;
            }
            MediaType mediaType2 = r5.A01;
            if (mediaType2 != null) {
                str3 = mediaType2.name();
            }
            C145636Km.A07(productDetailsPageFragment4, id, str, str3, r5.A03, Constants.A0Y);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0260  */
    public final void A07(AnonymousClass9LI r16, C215059Os r17, Integer num) {
        C213869Kb r0;
        AnonymousClass9DR r02;
        String str;
        Integer num2;
        String str2;
        long j;
        List<Incentive> unmodifiableList;
        List unmodifiableList2;
        ArrayList arrayList;
        AnonymousClass9LB A032;
        ShoppingExploreLoggingInfo A022;
        Long l;
        String str3;
        Long l2;
        List list;
        Map map;
        List list2;
        List list3;
        List list4;
        List list5;
        String str4;
        List list6;
        List list7;
        this.A11 = true;
        AnonymousClass0C1 r1 = this.A06;
        AnonymousClass9LI r6 = r16;
        if (r6.A07) {
            r0 = null;
        } else {
            r0 = this.A0c;
        }
        C215059Os r5 = r17;
        C213869Kb A002 = AnonymousClass9OP.A00(r1, r0, r5);
        Product ASp = A002.ASp();
        this.A04 = ASp;
        AnonymousClass0C1 r12 = this.A06;
        if (ASp.A09()) {
            r02 = AnonymousClass9DR.CHECKOUT;
        } else {
            r02 = AnonymousClass9DR.OFFSITE;
        }
        AnonymousClass9DP.A00(r12, r02, ASp);
        C214049Ku r03 = this.A09;
        if (r03 != null) {
            boolean A052 = A05(this);
            r03.A08 = A052;
            ImageView imageView = r03.A04;
            if (imageView != null) {
                int i = 8;
                if (A052) {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        }
        AnonymousClass1EW r13 = this.A0n;
        if (r13 != null) {
            r13.A0F(this.A13);
        }
        A00(this.A04);
        AnonymousClass9KU A003 = this.A0e.A00(A002, this.A0d);
        AnonymousClass9KT r2 = new AnonymousClass9KT(A003);
        AnonymousClass9KR r14 = new AnonymousClass9KR(A003.A03);
        r14.A01 = Constants.A0N;
        r14.A04 = true;
        r2.A03 = new AnonymousClass9KS(r14);
        A03(this, A002, new AnonymousClass9KU(r2));
        if (!A002.AcQ()) {
            A04(this, Constants.ONE);
        } else if (this.A0d.A03.A02 == Constants.ZERO) {
            this.A02 = -1;
            long currentTimeMillis = System.currentTimeMillis();
            A04(this, Constants.A0C);
            Context context = getContext();
            AnonymousClass1L8 A004 = AnonymousClass1L8.A00(this);
            AnonymousClass0C1 r9 = this.A06;
            String str5 = this.A0k;
            String str6 = this.A0h;
            String str7 = this.A0g;
            if (str7 != null) {
                str = C36451i4.A00(str7);
            } else {
                str = null;
            }
            boolean z = this.A0l;
            C213879Kc r22 = new C213879Kc(this, currentTimeMillis);
            C17850qu A005 = AnonymousClass8TO.A00(context, r9, str5, str6, str, z, true);
            A005.A00 = new AnonymousClass9KX(r22);
            C28351Lj.A00(context, A004, A005);
        }
        if (this.A0d.A04.A03) {
            this.A0B.A00();
        }
        this.A0C.A00(this.A0d.A05.A01(this.A06, this.A04));
        C213979Kn r23 = this.A08;
        r23.A02 = A002.APQ();
        r23.A0C(this.A0d);
        AnonymousClass9KT r24 = new AnonymousClass9KT(this.A0d);
        AnonymousClass9KR r15 = new AnonymousClass9KR(this.A0d.A03);
        if (r5.A05) {
            num2 = Constants.A0C;
        } else {
            num2 = Constants.A0N;
        }
        r15.A01 = num2;
        r24.A03 = new AnonymousClass9KS(r15);
        A06(new AnonymousClass9KU(r24));
        if (r6.A07) {
            this.A0s.A00.BL4();
            Integer num3 = num;
            if (num3 == Constants.ZERO) {
                str2 = "cache";
            } else {
                str2 = "network";
            }
            boolean z2 = false;
            if (A002.AcQ()) {
                z2 = true;
            }
            long j2 = this.A01;
            if (j2 > 0) {
                j = System.currentTimeMillis() - j2;
            } else {
                j = 0;
            }
            C213979Kn r8 = this.A08;
            Product product = this.A04;
            C13150hy.A02(product, "product");
            C13150hy.A02(str2, "loadType");
            Boolean bool = (Boolean) AnonymousClass0L6.A02(r8.A07, AnonymousClass0L7.SHOPPING_ANDROID_PDP_USL_CONVERSION, "enable_for_pdp_load_success", false, (AnonymousClass04H) null);
            C13150hy.A01(bool, "L.ig_shopping_android_pd…getAndExpose(userSession)");
            if (bool.booleanValue()) {
                AnonymousClass9LA A012 = C214009Kq.A01(product);
                C214669Ne r18 = new C214669Ne(r8.A04.A02("instagram_shopping_pdp_load_success"));
                r18.A07("product_id", Long.valueOf(A012.A00));
                r18.A07("merchant_id", A012.A01.A00);
                r18.A08("load_type", str2);
                r18.A07(AnonymousClass0C5.$const$string(104), Long.valueOf(j));
                r18.A04("has_product_variants", Boolean.valueOf(z2));
                Boolean bool2 = A012.A04;
                if (bool2 == null) {
                    C13150hy.A00();
                }
                r18.A04("is_checkout_enabled", bool2);
                Boolean bool3 = A012.A02;
                if (bool3 == null) {
                    C13150hy.A00();
                }
                r18.A04("can_add_to_bag", bool3);
                r18.A08("prior_submodule", r8.A09);
                r18.A08("shopping_session_id", r8.A0B);
                r18.A08("prior_module", r8.A0A);
                r18.A07("drops_launch_date", A012.A05);
                r18.A04("has_drops_launched", A012.A03);
                r18.A08("checkout_session_id", r8.A08);
                IncentiveContainer incentiveContainer = product.A09;
                if (incentiveContainer == null) {
                    unmodifiableList2 = null;
                } else {
                    unmodifiableList2 = Collections.unmodifiableList(incentiveContainer.A00);
                }
                Map map2 = null;
                if (unmodifiableList2 != null) {
                    C13150hy.A01(unmodifiableList2, "it");
                    if (!(!unmodifiableList2.isEmpty())) {
                        unmodifiableList2 = null;
                    }
                    if (unmodifiableList2 != null) {
                        Iterable<Incentive> iterable = unmodifiableList2;
                        arrayList = new ArrayList(AnonymousClass10K.A00(iterable, 10));
                        for (Incentive incentive : iterable) {
                            C13150hy.A01(incentive, "it");
                            arrayList.add(incentive.A00);
                        }
                        r18.A09("incentive_ids", arrayList);
                        r18.A08("logging_token", r8.A02);
                        A032 = C214009Kq.A03(r8.A01, (Integer) null, product.getId(), r8.A07);
                        if (A032 != null) {
                            r18.A08("m_pk", A032.A04);
                            r18.A07("m_t", Long.valueOf(A032.A00));
                            r18.A08("tracking_token", A032.A05);
                            AnonymousClass9LW r04 = A032.A01;
                            if (r04 != null) {
                                l = r04.A00;
                            } else {
                                l = null;
                            }
                            r18.A07("carousel_index", l);
                            AnonymousClass9LW r05 = A032.A01;
                            if (r05 != null) {
                                str3 = r05.A02;
                            } else {
                                str3 = null;
                            }
                            r18.A08("carousel_media_id", str3);
                            AnonymousClass9LW r06 = A032.A01;
                            if (r06 != null) {
                                l2 = r06.A01;
                            } else {
                                l2 = null;
                            }
                            r18.A07("carousel_media_type", l2);
                            AnonymousClass9LN r07 = A032.A02;
                            if (r07 != null) {
                                list = r07.A02;
                            } else {
                                list = null;
                            }
                            r18.A09("product_ids", list);
                            AnonymousClass9LN r08 = A032.A02;
                            if (r08 != null) {
                                map = r08.A05;
                            } else {
                                map = null;
                            }
                            r18.A0A("product_merchant_ids", map);
                            AnonymousClass9LN r09 = A032.A02;
                            if (r09 != null) {
                                list2 = r09.A00;
                            } else {
                                list2 = null;
                            }
                            r18.A09("drops_product_ids", list2);
                            AnonymousClass9LN r010 = A032.A02;
                            if (r010 != null) {
                                list3 = r010.A04;
                            } else {
                                list3 = null;
                            }
                            r18.A09("tagged_user_ids", list3);
                            AnonymousClass9LN r011 = A032.A02;
                            if (r011 != null) {
                                list4 = r011.A03;
                            } else {
                                list4 = null;
                            }
                            r18.A09("product_mention_ids", list4);
                            AnonymousClass9LN r012 = A032.A02;
                            if (r012 != null) {
                                list5 = r012.A01;
                            } else {
                                list5 = null;
                            }
                            r18.A09("mentioned_product_ids", list5);
                            AnonymousClass9LR r013 = A032.A03;
                            if (r013 != null) {
                                str4 = r013.A00;
                            } else {
                                str4 = null;
                            }
                            r18.A08("product_sticker_id", str4);
                            AnonymousClass9LR r014 = A032.A03;
                            if (r014 != null) {
                                list6 = r014.A02;
                            } else {
                                list6 = null;
                            }
                            r18.A09("sticker_styles", list6);
                            AnonymousClass9LR r015 = A032.A03;
                            if (r015 != null) {
                                list7 = r015.A01;
                            } else {
                                list7 = null;
                            }
                            r18.A09("shared_product_ids", list7);
                            AnonymousClass9LR r016 = A032.A03;
                            if (r016 != null) {
                                map2 = r016.A03;
                            }
                            r18.A0A("profile_shop_link", map2);
                        }
                        A022 = C214009Kq.A02(C214009Kq.A00(r8.A06, (AnonymousClass1NJ) null), r8.A00);
                        if (A022 != null) {
                            r18.A08("session_id", A022.A04);
                            r18.A07("surface_category_id", A022.A01);
                            r18.A08("topic_cluster_id", A022.A05);
                            r18.A08("topic_cluster_title", A022.A06);
                            r18.A08("topic_cluster_type", A022.A07);
                            r18.A08("parent_m_pk", A022.A03);
                            r18.A08("chaining_session_id", A022.A02);
                            r18.A07("chaining_position", A022.A00);
                        }
                        r18.A01();
                    }
                }
                arrayList = null;
                r18.A09("incentive_ids", arrayList);
                r18.A08("logging_token", r8.A02);
                A032 = C214009Kq.A03(r8.A01, (Integer) null, product.getId(), r8.A07);
                if (A032 != null) {
                }
                A022 = C214009Kq.A02(C214009Kq.A00(r8.A06, (AnonymousClass1NJ) null), r8.A00);
                if (A022 != null) {
                }
                r18.A01();
            } else {
                C06270Ok A006 = C06270Ok.A00();
                if (product.A09()) {
                    A006.A07("is_variant_selection_in_stock", Integer.valueOf(product.A0A() ? 1 : 0));
                }
                IncentiveContainer incentiveContainer2 = product.A09;
                if (incentiveContainer2 == null) {
                    unmodifiableList = null;
                } else {
                    unmodifiableList = Collections.unmodifiableList(incentiveContainer2.A00);
                }
                if (unmodifiableList != null && (!unmodifiableList.isEmpty())) {
                    C06170Oa A007 = C06170Oa.A00();
                    for (Incentive incentive2 : unmodifiableList) {
                        C13150hy.A01(incentive2, "it");
                        A007.A04(incentive2.A00);
                    }
                    A006.A04("incentive_ids", A007);
                }
                A006.A05("has_product_variants", Boolean.valueOf(z2));
                A006.A09("load_type", str2);
                C37141jB A008 = C213979Kn.A00(r8, "pdp_load_success", r8.A06, product);
                A008.A1q = j;
                A008.A3t = r8.A02;
                A008.A07(A006);
                C13150hy.A01(A008, "builder");
                C213979Kn.A04(r8, A008, r8.A06, Constants.ONE);
            }
            C213979Kn r92 = this.A08;
            Product product2 = this.A04;
            r92.A06(product2, this.A0d.A05.A01(this.A06, product2).size(), j, "full");
            AnonymousClass9IL A009 = AnonymousClass9IL.A00(this.A06);
            boolean A013 = AnonymousClass9J7.A01(this.A0d);
            synchronized (A009) {
                for (Integer intValue : A009.A00) {
                    AnonymousClass00B.A01.markerAnnotate(intValue.intValue(), "is_cta_active_on_pdp_load", A013);
                }
            }
            AnonymousClass9IL.A00(this.A06).A01(37355522);
            if (num3 == Constants.ZERO && C222609iI.A00(this.A06).A05(this.A0h) != null && !C222609iI.A00(this.A06).A05(this.A0h).A09.isEmpty()) {
                this.A0B.A00();
            }
        }
        A01(this);
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "instagram_shopping_pdp";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 == 1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        if (r3.equals("drops_notification_one_day_before") == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r3.equals("drops_notification_fifteen_minutes_before") == false) goto L_0x0033;
     */
    private void A00(Product product) {
        char c;
        boolean z;
        this.A0A.A01 = product;
        AnonymousClass9LD r1 = this.A0x;
        r1.A00 = product;
        r1.A04.A00 = product;
        r1.A05.A00 = product;
        C214029Ks r5 = this.A0r;
        if (!r5.A00) {
            r5.A00 = true;
            String str = r5.A08;
            int hashCode = str.hashCode();
            if (hashCode == -284476300) {
                c = 0;
            } else if (hashCode == 445857914) {
                c = 1;
            }
            c = 65535;
            if (c != 0) {
                z = false;
            }
            z = true;
            if (z) {
                AnonymousClass1HD r0 = r5.A01;
                Context context = r0.getContext();
                AnonymousClass0a4.A06(context);
                AnonymousClass1L8 A002 = AnonymousClass1L8.A00(r0);
                AnonymousClass0C1 r12 = r5.A04;
                String id = product.getId();
                String str2 = product.A02.A02;
                String str3 = r5.A08;
                AnonymousClass9NX r2 = new AnonymousClass9NX(r5, product);
                C15890nh r52 = new C15890nh(r12);
                r52.A09 = Constants.A0N;
                r52.A0E("commerce/products/%s/interstitials/", id);
                r52.A09("merchant_id", str2);
                r52.A09("entry_point", str3);
                r52.A06(AnonymousClass9LC.class, false);
                C17850qu A032 = r52.A03();
                A032.A00 = new C214019Kr(r2);
                C28351Lj.A00(context, A002, A032);
                return;
            }
            C214029Ks.A00(r5, product);
        }
    }

    public static void A01(ProductDetailsPageFragment productDetailsPageFragment) {
        if (productDetailsPageFragment.A0f == null && productDetailsPageFragment.A00 < 5) {
            Product product = productDetailsPageFragment.A04;
            AnonymousClass0a4.A06(product);
            ProductLaunchInformation productLaunchInformation = product.A06;
            long j = -1;
            if (productLaunchInformation != null && !productLaunchInformation.A01) {
                long currentTimeMillis = (productLaunchInformation.A00 * 1000) - System.currentTimeMillis();
                if (currentTimeMillis > 0 && currentTimeMillis < 900000) {
                    j = currentTimeMillis;
                }
            }
            if (j != -1) {
                C214409Me r0 = new C214409Me(productDetailsPageFragment);
                productDetailsPageFragment.A0f = r0;
                C12670hC.A06(r0, j);
            }
        }
    }

    public static void A03(ProductDetailsPageFragment productDetailsPageFragment, C213869Kb r1, AnonymousClass9KU r2) {
        productDetailsPageFragment.A0c = r1;
        productDetailsPageFragment.A0d = r2;
        C213959Kk r0 = productDetailsPageFragment.A07;
        r0.A00 = r1;
        r0.A01 = r2;
        r0.A0J();
    }

    public static void A04(ProductDetailsPageFragment productDetailsPageFragment, Integer num) {
        AnonymousClass9KT r2 = new AnonymousClass9KT(productDetailsPageFragment.A0d);
        AnonymousClass9KR r1 = new AnonymousClass9KR(productDetailsPageFragment.A0d.A03);
        r1.A02 = num;
        r2.A03 = new AnonymousClass9KS(r1);
        productDetailsPageFragment.A06(new AnonymousClass9KU(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r0.A08() == false) goto L_0x0036;
     */
    public static boolean A05(ProductDetailsPageFragment productDetailsPageFragment) {
        boolean booleanValue;
        boolean z;
        String str = productDetailsPageFragment.A0h;
        AnonymousClass0C1 r1 = productDetailsPageFragment.A06;
        if (str.equals(r1.A04()) && !C14090jk.A00(r1)) {
            AnonymousClass0C1 r2 = productDetailsPageFragment.A06;
            Boolean bool = r2.A06.A0f;
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (booleanValue && productDetailsPageFragment.A0h.equals(r2.A04()) && (r0 = productDetailsPageFragment.A04) != null) {
                z = true;
            }
            z = false;
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A06(AnonymousClass9KU r2) {
        A03(this, this.A0c, r2);
    }

    public final void A08(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2 = z;
        if (z || this.A0c.AQs() != null) {
            AnonymousClass9KT r2 = new AnonymousClass9KT(this.A0d);
            AnonymousClass9KR r1 = new AnonymousClass9KR(this.A0d.A03);
            r1.A01 = Constants.A0C;
            r2.A03 = new AnonymousClass9KS(r1);
            A06(new AnonymousClass9KU(r2));
            AnonymousClass95s r12 = this.A0w;
            String str5 = this.A0k;
            String str6 = this.A0h;
            boolean z3 = this.A0l;
            String str7 = this.A0g;
            String str8 = null;
            if (str7 != null) {
                str = str7.split("_")[0];
            } else {
                str = null;
            }
            ProductTileMedia productTileMedia = this.A05;
            if (productTileMedia == null || (str4 = productTileMedia.A02) == null) {
                str2 = null;
            } else {
                str2 = str4.split("_")[0];
            }
            AnonymousClass1NJ r22 = this.A03;
            if (r22 == null || !r22.Aho()) {
                str3 = null;
            } else {
                str3 = C30671Ut.A0A(this.A06, r22);
            }
            C213869Kb r0 = this.A0c;
            if (r0 != null) {
                str8 = r0.AQs();
            }
            AnonymousClass9LI r13 = new AnonymousClass9LI(str5, str6, z3, str, str2, str3, z2, str8);
            C13150hy.A02(r13, "request");
            if (r12.A03.contains(r13)) {
                return;
            }
            if (r13.A07 || r13.A02 != null) {
                C200068hI r5 = r12.A01;
                C13150hy.A02(r13, "request");
                HashMap hashMap = r5.A03;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    boolean z4 = false;
                    if (((Number) entry.getValue()).longValue() < System.currentTimeMillis()) {
                        z4 = true;
                    }
                    if (z4) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (AnonymousClass9LI r23 : linkedHashMap.keySet()) {
                    r5.A01.remove(r23);
                    r5.A03.remove(r23);
                }
                C215059Os r24 = (C215059Os) r5.A01.get(r13);
                if (r24 != null) {
                    r12.A00.A07(r13, r24, Constants.ZERO);
                    return;
                }
                r12.A03.add(r13);
                AnonymousClass9LS r52 = r12.A02;
                C213949Kj r4 = new C213949Kj(r12);
                C13150hy.A02(r13, "request");
                C13150hy.A02(r4, "delegate");
                C15890nh r25 = new C15890nh(r52.A01);
                r25.A09 = Constants.A0N;
                r25.A0C = AnonymousClass000.A0J("commerce/products/", r13.A04, "/details/");
                r25.A09("merchant_id", r13.A01);
                r25.A0C("shopping_bag_enabled", r13.A06);
                r25.A09("device_width", String.valueOf(r52.A00));
                r25.A0A("source_media_id", r13.A05);
                r25.A0A("pinned_media_id", r13.A03);
                r25.A0A("ads_tracking_token", r13.A00);
                r25.A0A("max_id", r13.A02);
                r25.A06(AnonymousClass9OT.class, false);
                C17850qu A032 = r25.A03();
                C213909Kf r26 = new C213909Kf(r52, r13, r4);
                AnonymousClass9NV r14 = r52.A03;
                C13150hy.A01(A032, "task");
                C13150hy.A02(A032, "task");
                C13150hy.A02(r26, "callback");
                C12830hS r02 = r14.A00;
                A032.A00 = r26;
                r02.schedule(A032);
            }
        }
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (((LinearLayoutManager) recyclerView.A0L).A1g() == 1 && this.mRecyclerView.getChildAt(0).getTop() >= 0)) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        C52002Na r0 = this.A0p;
        if (r0 == null || !r0.onBackPressed()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0544, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r6, p000X.AnonymousClass0L7.PDP_DEFAULT_SECTIONS, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0546;
     */
    public final void onCreate(Bundle bundle) {
        AnonymousClass1AM r6;
        boolean z;
        String A0A2;
        AnonymousClass9DR r1;
        Bundle bundle2 = bundle;
        int A022 = AnonymousClass0Z0.A02(-1474728214);
        Bundle bundle3 = this.mArguments;
        AnonymousClass0a4.A06(bundle3);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle3);
        this.A06 = A062;
        AnonymousClass9IL A002 = AnonymousClass9IL.A00(A062);
        synchronized (A002) {
            for (Integer intValue : A002.A00) {
                AnonymousClass00B.A01.markerPoint(intValue.intValue(), AnonymousClass0IU.A00(82));
            }
        }
        super.onCreate(bundle2);
        this.A10 = AnonymousClass30T.A00(this.mArguments);
        this.A0y = this.mArguments.getString("pdp_entry_point");
        this.A0j = this.mArguments.getString("prior_module_name");
        this.A0l = ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A05 = (ProductTileMedia) this.mArguments.getParcelable("hero_carousel_pinned_media");
        this.A0z = this.mArguments.getString("reference_price");
        C23300zv A003 = C23300zv.A00(this.A06);
        A003.A02(C32981cA.class, this.A15);
        A003.A02(AnonymousClass9O4.class, this.A14);
        A003.A02(C31071Wi.class, this.A18);
        A003.A02(AnonymousClass3AO.class, this.A16);
        A003.A02(C223109jD.class, this.A17);
        this.A0o = new AnonymousClass1OP(this.A06, this, this, this.A19);
        this.A0s = new C116754zo(this, this.A06);
        this.A0w = new AnonymousClass95s(requireContext(), this.A06, AnonymousClass1L8.A00(this), this);
        registerLifecycleListener(this.A0s);
        String string = this.mArguments.getString("media_id");
        this.A0g = string;
        if (string != null) {
            this.A03 = AnonymousClass1PZ.A00(this.A06).A02(this.A0g);
        }
        Product product = (Product) this.mArguments.getParcelable("product");
        this.A04 = product;
        if (product != null) {
            AnonymousClass0C1 r3 = this.A06;
            if (product.A09()) {
                r1 = AnonymousClass9DR.CHECKOUT;
            } else {
                r1 = AnonymousClass9DR.OFFSITE;
            }
            AnonymousClass9DP.A00(r3, r1, product);
            Merchant merchant = this.A04.A02;
            this.A0i = merchant.A03;
            this.A0h = merchant.A02;
        } else {
            String string2 = this.mArguments.getString("displayed_username");
            AnonymousClass0a4.A06(string2);
            this.A0i = string2;
            String string3 = this.mArguments.getString("displayed_user_id");
            AnonymousClass0a4.A06(string3);
            this.A0h = string3;
        }
        if (this.A0l && this.A0b == null) {
            C17510qM r13 = C17510qM.A00;
            FragmentActivity activity = getActivity();
            AnonymousClass0C1 r5 = this.A06;
            String str = this.A10;
            String moduleName = getModuleName();
            AnonymousClass1NJ r12 = this.A03;
            if (r12 == null) {
                A0A2 = null;
            } else {
                A0A2 = C30671Ut.A0A(r5, r12);
            }
            AnonymousClass39Z A0a2 = r13.A0a(activity, r5, str, moduleName, "product_details_page", A0A2);
            this.A0b = A0a2;
            registerLifecycleListener(A0a2);
        }
        AnonymousClass9KT r32 = new AnonymousClass9KT(this.A0d);
        if (bundle == null) {
            bundle2 = this.mArguments;
        }
        r32.A0D = bundle2.getBoolean("is_last_saved_item");
        this.A0d = new AnonymousClass9KU(r32);
        Bundle bundle4 = this.mArguments.getBundle("analytics_extras");
        if (bundle4 != null) {
            this.A1A.A00(bundle4);
        }
        ExploreTopicCluster exploreTopicCluster = (ExploreTopicCluster) this.mArguments.getParcelable("topic_cluster");
        this.A0m = this.mArguments.getBoolean("is_showing_as_swipe_up");
        this.A08 = new C213979Kn(this, this.A1D.AVo(), this.A0j, this.A0y, this.A06, this.A1E, this.A10);
        AnonymousClass0C1 r62 = this.A06;
        ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
        AnonymousClass0C1 r17 = r62;
        C30661Us r16 = new C30661Us(r17, this, this.A10, this.A0g, (String) null, this.A0j, this.A0y, exploreTopicCluster, (String) null, (String) null, (String) null, (String) null, (String) null, (C219489d9) null, (Long) null);
        AnonymousClass0C1 r8 = this.A06;
        C213979Kn r14 = this.A08;
        String str2 = this.A1E;
        String str3 = this.A0y;
        String str4 = this.A0j;
        String str5 = this.A10;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        this.A0r = new C214029Ks(this, this, r8, this, r14, str6, str7, str8, str5);
        this.A0A = new C160276se(this, r8, this, this.A1D, str5, str6, str7, str8);
        Context context = getContext();
        AnonymousClass0C1 r33 = this.A06;
        C211929Cd r11 = new C211929Cd(context, r33, this, AnonymousClass1F6.A00(r33));
        this.A0C = r11;
        AnonymousClass0C1 r52 = this.A06;
        C213979Kn r4 = this.A08;
        C160276se r9 = this.A0A;
        String str9 = this.A1E;
        String str10 = this.A10;
        String str11 = this.A0y;
        String str12 = this.A0j;
        this.A0B = new AnonymousClass9KK(this, this, r52, this, r4, r9, r11, str9, str10, str11, str12, this.A0l);
        this.A0e = new AnonymousClass9KH(r52, str11);
        C214089Ky r172 = new C214089Ky(getActivity(), r52, this, str12, str11);
        this.A0t = r172;
        this.A0q = new AnonymousClass9ER(getContext(), r52, new C213049Gt(this));
        AnonymousClass9N4 A004 = AnonymousClass9N4.A00();
        A004.A01 = r52;
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = A004.A00;
        if (igReactPurchaseExperienceBridgeModule != null) {
            igReactPurchaseExperienceBridgeModule.mUserSession = r52;
        }
        A004.A02 = r172;
        if (igReactPurchaseExperienceBridgeModule != null) {
            igReactPurchaseExperienceBridgeModule.mSurveyController = r172;
        }
        this.A0x = new AnonymousClass9LD(this.A19, r52, r4);
        AnonymousClass9RD r173 = new AnonymousClass9RD(this.A06, this, this.A19, this.A10, this.A0j, this.A0y, (String) null, this.A0g, (ExploreTopicCluster) null, (String) null, r16);
        AnonymousClass1LO r34 = new AnonymousClass1LO(this, true, getContext(), this.A06);
        C17510qM r18 = C17510qM.A00;
        FragmentActivity activity2 = getActivity();
        Context context2 = getContext();
        AnonymousClass0C1 r82 = this.A06;
        String str13 = this.A10;
        String str14 = this.A0j;
        String str15 = this.A0y;
        AnonymousClass35Z A0B2 = r18.A0B(activity2, context2, r82, this, str13, str14, str15);
        String str16 = null;
        this.A0v = new C214869Nz(this);
        C215909Sm r182 = new C215909Sm(this, r82, this, str13, str14, str15, AnonymousClass9Q3.SAVED);
        r182.A0H = this.A0h;
        AnonymousClass1NJ r42 = this.A03;
        r182.A04 = r42;
        if (r42 != null) {
            str16 = r42.APo();
        }
        r182.A0G = str16;
        r182.A0A = new C214779Np(this);
        r182.A01 = this.A19;
        C215319Pt A032 = r182.A03();
        Context context3 = getContext();
        AnonymousClass1HD r43 = this.mParentFragment;
        if (r43 == null) {
            r6 = this.mFragmentManager;
        } else {
            r6 = r43.mFragmentManager;
        }
        C52002Na r183 = new C52002Na(context3, this, r6, false, this.A06, this, (AnonymousClass1I6) null, new AnonymousClass9LL(this));
        this.A0p = r183;
        registerLifecycleListener(r183);
        Context context4 = getContext();
        AnonymousClass0C1 r63 = this.A06;
        this.A0u = new C196188aQ(context4, r63, this.mFragmentManager);
        Context requireContext = requireContext();
        C213979Kn r92 = this.A08;
        AnonymousClass9KK r83 = this.A0B;
        this.A0Z = new C213619Iz(r63, requireContext, this, this, r92, r83, A0B2, this.A0u);
        C160276se r10 = this.A0A;
        AnonymousClass9LD r64 = this.A0x;
        this.A0D = new C213329Hv(r10, r64);
        this.A0E = new C214119Lb(this, r10, this.A0s, r64, A0B2);
        this.A0G = new C213559It(this, r64, r83, r92);
        C160276se r44 = this.A0A;
        AnonymousClass9LD r53 = this.A0x;
        this.A0F = new AnonymousClass9JK(this, r44, r53);
        this.A0H = new C213579Iv(r53);
        C213979Kn r65 = this.A08;
        C160276se r112 = this.A0A;
        AnonymousClass9KK r142 = this.A0B;
        C214089Ky r45 = this.A0t;
        AnonymousClass9LD r93 = this.A0x;
        C213619Iz r102 = this.A0Z;
        C213979Kn r21 = r65;
        C160276se r22 = r112;
        C213989Ko r184 = new C213989Ko(this, this, r21, r22, r142, r45, r93, r102);
        this.A0I = r184;
        this.A0M = new AnonymousClass9LJ(this, r65, r93);
        this.A0J = new C214559Mt(r184, r93);
        AnonymousClass0C1 r132 = this.A06;
        AnonymousClass9ER r84 = this.A0q;
        this.A0N = new AnonymousClass9Gr(r132, this, r21, r22, r93, r84);
        this.A0O = new AnonymousClass9MO(this, r112, r93);
        this.A0K = new AnonymousClass9MK(r184, r93);
        this.A0P = new AnonymousClass9L9(this, r65, r112, r93);
        this.A0Q = new C214489Mm(this, this, r93);
        this.A0R = new AnonymousClass9MU(this, this.A0p, this, r65, r112, r93);
        C213979Kn r212 = r65;
        this.A0S = new AnonymousClass9MP(this, this, r212, r112, r93);
        String str17 = this.A0j;
        this.A0T = new C215269Po(this, r132, r16, A032, this, r112, r93);
        this.A0U = new AnonymousClass9MT(this, this, r212, r16, r112, r93, r173, A0B2);
        this.A0L = new AnonymousClass9II(this, r93, A0B2);
        this.A0V = new C214109La(r112, r93);
        this.A0W = new AnonymousClass9IB(r112, r93);
        this.A0X = new AnonymousClass9ND(r93);
        this.A0Y = new AnonymousClass9MN(this, r112, r93);
        this.A0a = new AnonymousClass9Jv(r132, this, r93, r142, r102);
        this.A07 = new C213959Kk(getContext(), r132, str17, this, this.A0o, r34, r65, this.A0C, this.A12, r84, this.A19, this, this.A0z);
        AnonymousClass1NJ r46 = this.A03;
        if (r46 != null) {
            this.A08.A01 = r46;
            this.A0A.A00 = r46;
        } else {
            String str18 = this.A0g;
            if (str18 != null) {
                AnonymousClass9KK r66 = this.A0B;
                C27341Hl r54 = r66.A01;
                C17850qu A033 = C16160o8.A03(str18, r66.A03);
                A033.A00 = new AnonymousClass9KM(r66);
                r54.schedule(A033);
            }
        }
        this.A08.A00 = exploreTopicCluster2;
        Product product2 = this.A04;
        if (product2 == null) {
            this.A0k = this.mArguments.getString("product_id");
        } else {
            this.A0k = product2.getId();
            A00(product2);
            Product product3 = this.A04;
            AnonymousClass0a4.A06(product3);
            AnonymousClass0C1 r67 = this.A06;
            if (product3.A09() && product3.A06 == null) {
                z = true;
            }
            z = false;
            Product product4 = this.A04;
            AnonymousClass0a4.A06(product4);
            boolean z2 = false;
            if (product4.A06 == null) {
                z2 = true;
            }
            AnonymousClass9IL A005 = AnonymousClass9IL.A00(this.A06);
            synchronized (A005) {
                for (Integer intValue2 : A005.A00) {
                    AnonymousClass00B.A01.markerAnnotate(intValue2.intValue(), "expanded_checkout_sections_enabled", z);
                }
            }
            AnonymousClass9L1 r133 = new AnonymousClass9L1(getContext(), this.A06, this.A04, this.A05, this.A0l, z, z2);
            AnonymousClass9KT r47 = new AnonymousClass9KT(this.A0e.A00(r133, this.A0d));
            AnonymousClass9KR r35 = new AnonymousClass9KR(this.A0d.A03);
            r35.A01 = Constants.A0C;
            r47.A03 = new AnonymousClass9KS(r35);
            A03(this, r133, new AnonymousClass9KU(r47));
        }
        AnonymousClass0a4.A06(this.A0k);
        A08(true);
        AnonymousClass6N6.A01(new AnonymousClass6N6(C215239Pk.A00(this.A06).A00), "recent", new AnonymousClass6N7(this.A0h, this.A0i, this.A0k));
        AnonymousClass9IL A006 = AnonymousClass9IL.A00(this.A06);
        synchronized (A006) {
            for (Integer intValue3 : A006.A00) {
                AnonymousClass00B.A01.markerPoint(intValue3.intValue(), AnonymousClass0IU.A00(44));
            }
        }
        AnonymousClass0Z0.A09(-53531180, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x013f, code lost:
        if (r2.A06 == false) goto L_0x0141;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        boolean z;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        if (this.A09 == null) {
            C214049Ku r3 = new C214049Ku(this, this.A1C, this.A06, A05(this), this.A0l, this.A0m);
            this.A09 = r3;
            this.A1B.A0D(r3);
            registerLifecycleListener(this.A09);
        }
        C214049Ku r5 = this.A09;
        AnonymousClass1EW r4 = this.A0n;
        View inflate = ((ViewStub) view2.findViewById(C0003R.C0005id.action_bar_overlay_viewstub)).inflate();
        r5.A03 = (ImageView) inflate.findViewById(C0003R.C0005id.action_bar_back_button);
        r5.A04 = (ImageView) inflate.findViewById(C0003R.C0005id.action_bar_menu_button);
        C26571Ea r32 = new C26571Ea((ViewStub) inflate.findViewById(C0003R.C0005id.action_bar_shopping_bag_button_stub));
        r5.A06 = r32;
        r32.A03(new AnonymousClass9LM(r5));
        r5.A03.setOnClickListener(new AnonymousClass9LX(r5));
        r5.A04.setOnClickListener(new AnonymousClass9MH(r5));
        ImageView imageView = r5.A04;
        AnonymousClass0a4.A06(imageView);
        int i = 8;
        if (r5.A08) {
            i = 0;
        }
        imageView.setVisibility(i);
        if (r5.A0B) {
            r5.A06.A02(0);
            r5.A01(C222609iI.A00(r5.A09).A06());
        }
        if (r5.A0C) {
            r5.A03.setImageResource(C0003R.C0004drawable.instagram_x_outline_24);
            r5.A03.setBackgroundResource(C0003R.C0004drawable.product_details_page_action_bar_icon_background);
        }
        r5.A02 = r4.A07;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        r5.A01 = ofFloat;
        ofFloat.setDuration(250);
        r5.A01.addUpdateListener(new AnonymousClass9MG(r5));
        r5.A01.addListener(new C214509Mo(r5));
        C214049Ku r2 = this.A09;
        boolean A052 = A05(this);
        r2.A08 = A052;
        ImageView imageView2 = r2.A04;
        if (imageView2 != null) {
            int i2 = 8;
            if (A052) {
                i2 = 0;
            }
            imageView2.setVisibility(i2);
        }
        this.mRecyclerView = (RecyclerView) view2.findViewById(C0003R.C0005id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.mRecyclerView.A0w(new C61622m6(new C214769No(this), C29621Qp.PRODUCT, linearLayoutManager));
        this.mRecyclerView.A0w(this.A1B);
        this.mRecyclerView.setAdapter(this.A07);
        String str3 = null;
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        Product product = this.A04;
        if (product != null) {
            if (this.A0l && (r2 = product.A03) != null) {
                z = true;
            }
            z = false;
            if (product.A09() && !z && ((Boolean) AnonymousClass9DN.A00(this.A06, new C05000Hl("preload_rn_bridge", AnonymousClass0L7.CHECKOUT_PRELOAD_RN_BRIDGE, false, (String[]) null, (AnonymousClass04H) null))).booleanValue()) {
                C05700Lp.A00().ADc(new C214459Mj(this));
            }
        }
        C200208hc r6 = new C200208hc(this);
        this.A19.A05(C32711bj.A00(this), this.mRecyclerView, r6);
        C32991cC A002 = C32991cC.A00(this.A06);
        A002.A07(view2, C33051cI.PRODUCT_DETAIL_PAGE);
        String moduleName = getModuleName();
        Product product2 = this.A04;
        if (product2 != null) {
            str = product2.getId();
        } else {
            str = this.A0k;
        }
        if (product2 != null) {
            str2 = product2.A02.A02;
        } else {
            str2 = this.A0h;
        }
        if (product2 != null) {
            str3 = product2.A0F;
        }
        A002.A04(view2, new C215689Ri(moduleName, str, str2, str3, this.A03));
    }

    public final AnonymousClass1EW AFO() {
        return this.A0n;
    }

    public final C06270Ok BYN() {
        C06270Ok A002 = C06270Ok.A00();
        this.A1A.A02(A002);
        return A002;
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ProductGroup productGroup;
        ProductVariantDimension productVariantDimension;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 5) {
            String stringExtra = intent.getStringExtra("variant_dimension_id");
            String stringExtra2 = intent.getStringExtra("variant_value");
            if (stringExtra != null && stringExtra2 != null && (productGroup = this.A0d.A02) != null && !productGroup.A01().isEmpty()) {
                Iterator it = this.A0d.A02.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        productVariantDimension = null;
                        break;
                    }
                    productVariantDimension = (ProductVariantDimension) it.next();
                    if (stringExtra.equals(productVariantDimension.A02)) {
                        break;
                    }
                }
                this.A0Z.A02(productVariantDimension, stringExtra2, false);
            }
        } else if (i == 7) {
            String stringExtra3 = intent.getStringExtra("item_id");
            String stringExtra4 = intent.getStringExtra("source_id");
            if (stringExtra3 != null && stringExtra4 != null) {
                AnonymousClass9KU r1 = this.A0d;
                Product product = r1.A01;
                AnonymousClass0a4.A06(product);
                List A012 = r1.A05.A01(this.A06, product);
                for (int i3 = 0; i3 < A012.size(); i3++) {
                    if (((C211969Ch) A012.get(i3)).A01().equals(stringExtra3)) {
                        AnonymousClass7K7 r3 = this.A12;
                        String A0J2 = AnonymousClass000.A0J(stringExtra4, "_", product.getId());
                        r3.A00.put(A0J2, Integer.valueOf(i3));
                        r3.A01.remove(A0J2);
                        this.A07.A03.A05();
                        return;
                    }
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-56920049);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0003R.layout.product_details_page, viewGroup, false);
        viewGroup2.setClipChildren(false);
        this.A0n = new AnonymousClass1EW((ViewGroup) viewGroup2.findViewById(C0003R.C0005id.pdp_action_bar), new AnonymousClass9MF(this));
        AnonymousClass0Z0.A09(80827026, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(665127745);
        super.onDestroy();
        if (!this.A11) {
            Product product = this.A04;
            if (product == null) {
                C213979Kn r5 = this.A08;
                String str = this.A0k;
                String str2 = this.A0h;
                C13150hy.A02(str, "productId");
                C13150hy.A02(str2, "merchantId");
                C213979Kn.A04(r5, C213979Kn.A01(r5, "pdp_abandon", r5.A06, str, str2), r5.A06, Constants.ZERO);
            } else {
                C213979Kn r2 = this.A08;
                C13150hy.A02(product, "product");
                C213979Kn.A04(r2, C213979Kn.A00(r2, "pdp_abandon", r2.A06, product), r2.A06, Constants.ZERO);
            }
        }
        C211929Cd r0 = this.A0C;
        r0.A02.A07(r0.A01.getModuleName());
        unregisterLifecycleListener(this.A0p);
        unregisterLifecycleListener(this.A0s);
        C214049Ku r02 = this.A09;
        if (r02 != null) {
            unregisterLifecycleListener(r02);
        }
        AnonymousClass39Z r03 = this.A0b;
        if (r03 != null) {
            unregisterLifecycleListener(r03);
        }
        C23300zv A002 = C23300zv.A00(this.A06);
        A002.A03(C32981cA.class, this.A15);
        A002.A03(AnonymousClass9O4.class, this.A14);
        A002.A03(C31071Wi.class, this.A18);
        A002.A03(AnonymousClass3AO.class, this.A16);
        A002.A03(C223109jD.class, this.A17);
        C214089Ky r4 = this.A0t;
        Product product2 = r4.A03.A0d.A00;
        String str3 = r4.A04;
        if (!str3.startsWith("tags_list_") && !"instagram_shopping_pdp".equals(str3) && product2 != null && product2.A09() && product2.A0A()) {
            C214089Ky.A00(r4, "2463936483829671");
        }
        AnonymousClass0Z0.A09(1830913899, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1405206685);
        super.onDestroyView();
        this.mRecyclerView = null;
        AnonymousClass0Z0.A09(-1564987550, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(967496383);
        super.onPause();
        AnonymousClass9IL A002 = AnonymousClass9IL.A00(this.A06);
        synchronized (A002) {
            for (Integer intValue : A002.A00) {
                AnonymousClass00B.A01.markerEnd(intValue.intValue(), 22);
            }
            A002.A00.clear();
        }
        this.A12.A00();
        AnonymousClass9ER r2 = this.A0q;
        C211829Bs r0 = r2.A01;
        if (r0 != null) {
            r0.A04("fragment_paused");
            r2.A01 = null;
            r2.A00 = null;
        }
        if (this.A0f != null) {
            this.A0f = null;
        }
        C169867Od r1 = this.A0K.A00;
        if (r1 != null) {
            r1.setVisible(false, false);
        }
        Product product = this.A04;
        if (product != null) {
            C213979Kn r5 = this.A08;
            C13150hy.A02(product, "product");
            C37141jB A003 = C213979Kn.A00(r5, "pdp_end", r5.A06, product);
            A003.A1t = System.currentTimeMillis() - this.A01;
            C13150hy.A01(A003, "builder");
            C213979Kn.A04(r5, A003, r5.A06, Constants.ZERO);
        }
        C211929Cd r02 = this.A0C;
        if (r02 != null) {
            r02.A02.A04();
        }
        AnonymousClass9KK r12 = this.A0B;
        C51522Kz r03 = r12.A00;
        if (r03 != null) {
            C213539Ir.A02(r03);
            r12.A00 = null;
        }
        AnonymousClass0Z0.A09(1963264525, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1404559097);
        super.onResume();
        AnonymousClass1EW.A03(getActivity()).A0F((AnonymousClass1HM) null);
        this.A0n.A0F(this.A13);
        this.A01 = System.currentTimeMillis();
        C214089Ky r1 = this.A0t;
        Product product = r1.A03.A0d.A00;
        if (product != null && product.A09() && r1.A01) {
            C214089Ky.A00(r1, "2479230905637782");
        }
        if (this.A04 != null) {
            A01(this);
        }
        C169867Od r2 = this.A0K.A00;
        if (r2 != null) {
            r2.setVisible(true, false);
        }
        C211929Cd r0 = this.A0C;
        if (r0 != null) {
            r0.A02.A05();
        }
        AnonymousClass0Z0.A09(-650578465, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_last_saved_item", this.A0d.A0D);
    }
}
