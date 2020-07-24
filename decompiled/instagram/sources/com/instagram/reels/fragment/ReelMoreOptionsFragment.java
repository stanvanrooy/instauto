package com.instagram.reels.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.flipper.core.StateSummary;
import com.instagram.actionbar.ActionButton;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.tagging.search.BusinessPartnerTagSearchFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2NW;
import p000X.AnonymousClass3D6;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass4FF;
import p000X.AnonymousClass4LF;
import p000X.AnonymousClass4XV;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass61A;
import p000X.AnonymousClass6KF;
import p000X.AnonymousClass6OZ;
import p000X.AnonymousClass75F;
import p000X.AnonymousClass75W;
import p000X.AnonymousClass7AN;
import p000X.AnonymousClass7AO;
import p000X.AnonymousClass7AP;
import p000X.AnonymousClass7AQ;
import p000X.AnonymousClass7AR;
import p000X.AnonymousClass7AS;
import p000X.AnonymousClass7AV;
import p000X.AnonymousClass7AX;
import p000X.AnonymousClass7AY;
import p000X.AnonymousClass7AZ;
import p000X.AnonymousClass7Aw;
import p000X.AnonymousClass7B4;
import p000X.AnonymousClass7B5;
import p000X.C019000b;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C101214Yy;
import p000X.C111194qZ;
import p000X.C111204qa;
import p000X.C11200ea;
import p000X.C1186457i;
import p000X.C1189358l;
import p000X.C120125Dh;
import p000X.C120145Dk;
import p000X.C120225Dt;
import p000X.C144886Hm;
import p000X.C156156lg;
import p000X.C16180oA;
import p000X.C161956vd;
import p000X.C161986vg;
import p000X.C16290oM;
import p000X.C1655974g;
import p000X.C1656074h;
import p000X.C1656174i;
import p000X.C1656274j;
import p000X.C1656374k;
import p000X.C1656474l;
import p000X.C1656574m;
import p000X.C1656874p;
import p000X.C1656974q;
import p000X.C1657074r;
import p000X.C1659275p;
import p000X.C1659375q;
import p000X.C166817Aa;
import p000X.C166827Ab;
import p000X.C166837Ac;
import p000X.C166847Ad;
import p000X.C166857Ae;
import p000X.C166867Af;
import p000X.C166877Ag;
import p000X.C166887Ah;
import p000X.C166907Aj;
import p000X.C166917Ak;
import p000X.C166937An;
import p000X.C166947Ao;
import p000X.C166957Ap;
import p000X.C166977As;
import p000X.C166987At;
import p000X.C166997Au;
import p000X.C167017Ax;
import p000X.C17510qM;
import p000X.C17660qb;
import p000X.C17850qu;
import p000X.C23300zv;
import p000X.C26771Ff;
import p000X.C27371Ho;
import p000X.C27665CMj;
import p000X.C28168CcW;
import p000X.C37041j1;
import p000X.C52362Om;
import p000X.C77693aR;
import p000X.C79583dh;
import p000X.C84323lT;
import p000X.C85393nH;
import p000X.CNQ;
import p000X.CNR;

public class ReelMoreOptionsFragment extends C101214Yy implements C27371Ho, AnonymousClass1HM {
    public Intent A00;
    public C17850qu A01;
    public AnonymousClass3D6 A02;
    public C1656174i A03;
    public ReelMoreOptionsModel A04;
    public ReelMoreOptionsModel A05;
    public AnonymousClass0C1 A06;
    public C161956vd A07;
    public C166817Aa A08;
    public C111194qZ A09;
    public C120145Dk A0A;
    public C120145Dk A0B;
    public C120145Dk A0C;
    public C120145Dk A0D;
    public C120145Dk A0E;
    public C120145Dk A0F;
    public C120145Dk A0G;
    public C120145Dk A0H;
    public C120145Dk A0I;
    public C1186457i A0J;
    public Boolean A0K = null;
    public Boolean A0L = null;
    public Integer A0M = Constants.A0N;
    public String A0N;
    public String A0O;
    public String A0P;
    public List A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public SpannableStringBuilder A0b;
    public C166997Au A0c;
    public C120225Dt A0d;
    public C120225Dt A0e;
    public C120225Dt A0f;
    public AnonymousClass2NW A0g;
    public AnonymousClass4LF A0h;
    public AnonymousClass4LF A0i;
    public AnonymousClass4LF A0j;
    public AnonymousClass4LF A0k;
    public C120125Dh A0l;
    public C1189358l A0m;
    public C1189358l A0n;
    public C1189358l A0o;
    public C1189358l A0p;
    public C1189358l A0q;
    public C1189358l A0r;
    public C1189358l A0s;
    public C1189358l A0t;
    public C1189358l A0u;
    public Boolean A0v;
    public Integer A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public final View.OnClickListener A13 = new C1656474l(this);
    public final View.OnClickListener A14 = new C1656574m(this);
    public final View.OnClickListener A15 = new C1656974q(this);
    public final View.OnClickListener A16 = new C1657074r(this);
    public final View.OnClickListener A17 = new C166857Ae(this);
    public final View.OnClickListener A18 = new C166847Ad(this);
    public final View.OnClickListener A19 = new C1655974g(this);
    public final View.OnClickListener A1A = new C1656074h(this);
    public final View.OnClickListener A1B = new C1656274j(this);
    public final View.OnClickListener A1C = new C1656374k(this);
    public final View.OnClickListener A1D = new AnonymousClass7AP(this);
    public final View.OnClickListener A1E = new AnonymousClass7AY(this);
    public final View.OnClickListener A1F = new AnonymousClass7AN(this);
    public final View.OnClickListener A1G = new C1659275p(this);
    public final View.OnClickListener A1H = new AnonymousClass7AO(this);
    public final View.OnClickListener A1I = new C166937An(this);
    public final View.OnClickListener A1J = new AnonymousClass7AQ(this);
    public final View.OnClickListener A1K = new C166837Ac(this);
    public final C11200ea A1L = new AnonymousClass7AR(this);
    public final C11200ea A1M = new AnonymousClass7AS(this);
    public final HashSet A1N = new HashSet();
    public final TextView.OnEditorActionListener A1O = new C166977As(this);
    public final C161986vg A1P = new C166867Af(this);
    public final C28168CcW A1Q = new AnonymousClass7AX(this);
    public final C111204qa A1R = new C166917Ak(this);
    public Drawable mAddIconDrawable;
    public AnonymousClass4LF mBrandedContentMetadataItem;
    public ActionButton mSaveButton;

    public static void A04(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        ReelMoreOptionsFragment reelMoreOptionsFragment2 = reelMoreOptionsFragment;
        BrandedContentTag brandedContentTag = reelMoreOptionsFragment.A04.A05;
        String str2 = null;
        if (brandedContentTag != null) {
            str2 = brandedContentTag.A01;
            str = brandedContentTag.A02;
        } else {
            str = null;
        }
        C17510qM.A00.A0r(reelMoreOptionsFragment2.requireActivity(), reelMoreOptionsFragment2, reelMoreOptionsFragment2.A06, reelMoreOptionsFragment2.getModuleName(), reelMoreOptionsFragment2.A0O, reelMoreOptionsFragment2.A0P, str2, str);
    }

    public static void A0D(ReelMoreOptionsFragment reelMoreOptionsFragment, C120145Dk r4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z) {
        Drawable drawable;
        if (z) {
            drawable = null;
        } else {
            drawable = reelMoreOptionsFragment.mAddIconDrawable;
        }
        r4.A02 = drawable;
        if (z) {
            onClickListener = null;
        }
        r4.A04 = onClickListener;
        r4.A05 = !z;
        Context context = reelMoreOptionsFragment.getContext();
        if (context != null) {
            r4.A00 = C019000b.A00(context, C0003R.color.igds_primary_button);
        }
        if (!z) {
            onClickListener2 = null;
        }
        r4.A03 = onClickListener2;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "reel_more_options";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A01(C77693aR r12) {
        ReelMoreOptionsModel reelMoreOptionsModel = this.A04;
        this.A04 = new ReelMoreOptionsModel(r12, reelMoreOptionsModel.A09, reelMoreOptionsModel.A08, reelMoreOptionsModel.A07, reelMoreOptionsModel.A03, reelMoreOptionsModel.A00, reelMoreOptionsModel.A01, reelMoreOptionsModel.A02, reelMoreOptionsModel.A04, reelMoreOptionsModel.A05);
    }

    public static void A02(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
        if (reelMoreOptionsModel.A03()) {
            str = reelMoreOptionsModel.A05.A01;
        } else {
            str = null;
        }
        BusinessPartnerTagSearchFragment.A00(reelMoreOptionsFragment.getActivity(), reelMoreOptionsFragment.A06, reelMoreOptionsFragment.A1Q, str, reelMoreOptionsFragment.A0O, reelMoreOptionsModel.A08, AnonymousClass6KF.STORY, false, false, "story", reelMoreOptionsFragment);
    }

    public static void A03(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        C166907Aj r5 = new C166907Aj(reelMoreOptionsFragment);
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass0C5.$const$string(220), reelMoreOptionsFragment.A0N);
        bundle.putString(AnonymousClass40t.$const$string(195), "com.instagram.reels.fragment.ReelMoreOptionsFragment");
        bundle.putString("entry_point", "reel_composer_options");
        C52362Om r2 = new C52362Om(reelMoreOptionsFragment.getActivity(), reelMoreOptionsFragment.A06);
        r2.A02 = C16290oM.A00.A00().A00(bundle, r5);
        r2.A04 = "com.instagram.reels.fragment.ReelMoreOptionsFragment";
        r2.A02();
    }

    public static void A05(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        String str2;
        C17510qM r2 = C17510qM.A00;
        FragmentActivity activity = reelMoreOptionsFragment.getActivity();
        AnonymousClass0C1 r4 = reelMoreOptionsFragment.A06;
        String moduleName = reelMoreOptionsFragment.getModuleName();
        boolean z = reelMoreOptionsFragment.A11;
        ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
        if (reelMoreOptionsModel.A03()) {
            str = reelMoreOptionsModel.A05.A01;
        } else {
            str = null;
        }
        if (reelMoreOptionsFragment.A0Y) {
            str2 = reelMoreOptionsFragment.A0O;
        } else {
            str2 = null;
        }
        r2.A1C(activity, r4, moduleName, "swipe_up_links", z, (ArrayList) null, (ArrayList) null, str, str2, (String) null, (ArrayList) null);
        C23300zv A002 = C23300zv.A00(reelMoreOptionsFragment.A06);
        A002.A02(CNR.class, reelMoreOptionsFragment.A1L);
        A002.A02(CNQ.class, reelMoreOptionsFragment.A1M);
    }

    public static void A06(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        if (reelMoreOptionsFragment.A0U) {
            if (reelMoreOptionsFragment.A0h == null) {
                AnonymousClass4LF r2 = new AnonymousClass4LF((int) C0003R.string.product_collection_link_choose_collection, (View.OnClickListener) new C1659375q(reelMoreOptionsFragment));
                reelMoreOptionsFragment.A0h = r2;
                r2.A06 = true;
            }
            AnonymousClass4LF r22 = reelMoreOptionsFragment.A0h;
            ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
            if (reelMoreOptionsModel.A05()) {
                str = reelMoreOptionsModel.A01.A01;
            } else {
                str = "";
            }
            r22.A00(str);
        }
    }

    public static void A07(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        if (reelMoreOptionsFragment.A0V) {
            if (reelMoreOptionsFragment.A0i == null) {
                AnonymousClass4LF r2 = new AnonymousClass4LF((int) C0003R.string.product_collection_link_choose_collection, (View.OnClickListener) new C166947Ao(reelMoreOptionsFragment));
                reelMoreOptionsFragment.A0i = r2;
                r2.A06 = true;
            }
            AnonymousClass4LF r22 = reelMoreOptionsFragment.A0i;
            ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
            if (reelMoreOptionsModel.A06()) {
                str = reelMoreOptionsModel.A02.A01;
            } else {
                str = "";
            }
            r22.A00(str);
        }
    }

    public static void A09(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        if (reelMoreOptionsFragment.A0Z) {
            if (reelMoreOptionsFragment.A0k == null) {
                AnonymousClass4LF r2 = new AnonymousClass4LF((int) C0003R.string.shopping_shop_link_choose_profile_shop, (View.OnClickListener) new AnonymousClass7AV(reelMoreOptionsFragment));
                reelMoreOptionsFragment.A0k = r2;
                r2.A06 = true;
            }
            AnonymousClass4LF r22 = reelMoreOptionsFragment.A0k;
            ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
            if (reelMoreOptionsModel.A07()) {
                str = reelMoreOptionsModel.A03.A02;
            } else {
                str = "";
            }
            r22.A00(str);
        }
    }

    public static void A0A(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        C17510qM.A00.A1H(reelMoreOptionsFragment.getActivity(), reelMoreOptionsFragment.A06, false, reelMoreOptionsFragment.getModuleName(), (String) null, (String) null, StateSummary.$const$string(54), 8, reelMoreOptionsFragment, (FragmentActivity) null, true, false, false, (ProductSourceOverrideState) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r4.A00 != null) goto L_0x0032;
     */
    public static void A0B(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        boolean z;
        ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
        if (reelMoreOptionsModel.A03()) {
            reelMoreOptionsModel.A05.A00(reelMoreOptionsFragment.A0X);
        }
        if (reelMoreOptionsModel.A02()) {
            AnonymousClass5F9.A00(reelMoreOptionsFragment.getActivity(), C0003R.string.call_to_action_added_confirmation);
        }
        ReelMoreOptionsModel reelMoreOptionsModel2 = reelMoreOptionsFragment.A04;
        if (reelMoreOptionsModel2.A03 == null && reelMoreOptionsModel2.A01 == null && reelMoreOptionsModel2.A04 == null) {
            z = false;
        }
        z = true;
        if (z) {
            C166817Aa r2 = reelMoreOptionsFragment.A08;
            AnonymousClass0a4.A06(r2);
            AnonymousClass7Aw r3 = new AnonymousClass7Aw(r2.A00.A02("instagram_shopping_swipe_up_creation_confirm"));
            if (r3.A0B()) {
                r3.A0A("shopping_swipe_up_link_creation_context", r2.A02);
                r3.A0A("reel_swipe_up_link", C166817Aa.A00(reelMoreOptionsModel2));
                r3.A08("session_id", r2.A01);
                r3.A01();
            }
        }
        reelMoreOptionsFragment.A00.putExtra("MORE_OPTIONS_MODEL", reelMoreOptionsFragment.A04);
        reelMoreOptionsFragment.getActivity().setResult(-1, reelMoreOptionsFragment.A00);
        reelMoreOptionsFragment.getActivity().onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r0 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (r0 == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r4.A04.A00() == p000X.C77693aR.A03) goto L_0x007c;
     */
    public static void A0C(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        boolean z;
        boolean z2 = false;
        if (reelMoreOptionsFragment.A04.equals(reelMoreOptionsFragment.A05) && !reelMoreOptionsFragment.A04.A03() && ((!reelMoreOptionsFragment.A0W || TextUtils.isEmpty(reelMoreOptionsFragment.A09.A00)) && ((!reelMoreOptionsFragment.A0T || !reelMoreOptionsFragment.A04.A04()) && (!reelMoreOptionsFragment.A0I() || !reelMoreOptionsFragment.A04.A07())))) {
            if (reelMoreOptionsFragment.A0G()) {
                boolean z3 = false;
                if (reelMoreOptionsFragment.A04.A00 != null) {
                    z3 = true;
                }
            }
            if ((!reelMoreOptionsFragment.A0U || !reelMoreOptionsFragment.A04.A05()) && (!reelMoreOptionsFragment.A0V || !reelMoreOptionsFragment.A04.A06())) {
                if (reelMoreOptionsFragment.A0R) {
                    boolean z4 = false;
                    if (reelMoreOptionsFragment.A04.A07 != null) {
                        z4 = true;
                    }
                }
                z = false;
            }
        }
        z = true;
        ActionButton actionButton = reelMoreOptionsFragment.mSaveButton;
        if (!reelMoreOptionsFragment.A0a && z) {
            z2 = true;
        }
        actionButton.setEnabled(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ba, code lost:
        if (r1 >= 3) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0238, code lost:
        if (r1 >= 3) goto L_0x023a;
     */
    public static void A0E(ReelMoreOptionsFragment reelMoreOptionsFragment, Integer num) {
        boolean z;
        boolean z2;
        C1189358l r0;
        reelMoreOptionsFragment.A0M = num;
        ArrayList arrayList = new ArrayList();
        if (!reelMoreOptionsFragment.A1N.isEmpty()) {
            arrayList.add(reelMoreOptionsFragment.A0g);
        }
        if (Constants.ONE.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.WEB_URL);
            arrayList.add(reelMoreOptionsFragment.A0I);
            arrayList.add(reelMoreOptionsFragment.A09);
            arrayList.add(reelMoreOptionsFragment.A0n);
        } else if (Constants.ZERO.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.IGTV);
            arrayList.add(reelMoreOptionsFragment.A0C);
            arrayList.add(reelMoreOptionsFragment.A0f);
            Boolean bool = reelMoreOptionsFragment.A0L;
            if (bool != null && bool.booleanValue()) {
                arrayList.add(reelMoreOptionsFragment.A0o);
            }
        } else if (Constants.A0j.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.PROFILE_SHOP);
            arrayList.add(reelMoreOptionsFragment.A0E);
            if (reelMoreOptionsFragment.A0Z) {
                arrayList.add(reelMoreOptionsFragment.A0k);
            }
            arrayList.add(reelMoreOptionsFragment.A0t);
        } else if (Constants.A0u.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.INSTAGRAM_SHOP);
            arrayList.add(reelMoreOptionsFragment.A0D);
            arrayList.add(reelMoreOptionsFragment.A0q);
        } else if (Constants.A12.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.SHOPPING_INCENTIVE_COLLECTION);
            arrayList.add(reelMoreOptionsFragment.A0F);
            arrayList.add(reelMoreOptionsFragment.A0h);
            arrayList.add(reelMoreOptionsFragment.A0p);
        } else if (Constants.A14.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.SHOPPING_PRODUCT_COLLECTION);
            arrayList.add(reelMoreOptionsFragment.A0G);
            arrayList.add(reelMoreOptionsFragment.A0i);
            arrayList.add(reelMoreOptionsFragment.A0s);
        } else if (Constants.A15.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.SHOPPING_PRODUCT);
            arrayList.add(reelMoreOptionsFragment.A0H);
            arrayList.add(reelMoreOptionsFragment.A0j);
            arrayList.add(reelMoreOptionsFragment.A0u);
        } else if (Constants.A0C.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.BUSINESS_TRANSACTION);
            arrayList.add(reelMoreOptionsFragment.A0B);
            arrayList.add(reelMoreOptionsFragment.A0e);
            arrayList.add(reelMoreOptionsFragment.A0n);
            if (reelMoreOptionsFragment.A04.A00() != reelMoreOptionsFragment.A05.A00()) {
                A0C(reelMoreOptionsFragment);
            }
        } else if (Constants.A0Y.equals(num)) {
            reelMoreOptionsFragment.A01(C77693aR.AR_EFFECT);
            arrayList.add(reelMoreOptionsFragment.A0A);
            arrayList.add(reelMoreOptionsFragment.A0d);
            Boolean bool2 = reelMoreOptionsFragment.A0K;
            if (!(bool2 == null || !bool2.booleanValue() || (r0 = reelMoreOptionsFragment.A0m) == null)) {
                arrayList.add(r0);
            }
        } else {
            reelMoreOptionsFragment.A01(C77693aR.NONE);
            if (reelMoreOptionsFragment.A0I()) {
                if (reelMoreOptionsFragment.A0Z) {
                    C166997Au r4 = reelMoreOptionsFragment.A0c;
                    AnonymousClass0a4.A06(r4);
                    if (!r4.A01 && !C27665CMj.A00(r4.A02).getBoolean("has_added_profile_shop_swipe_up", false)) {
                        int i = C27665CMj.A00(r4.A02).getInt("shopping_profile_shop_swipe_up_highlight_impression_count", 0);
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        C166997Au r6 = reelMoreOptionsFragment.A0c;
                        AnonymousClass0C1 r5 = r6.A02;
                        C27665CMj.A00(r5).edit().putInt("shopping_profile_shop_swipe_up_highlight_impression_count", C27665CMj.A00(r5).getInt("shopping_profile_shop_swipe_up_highlight_impression_count", 0) + 1).apply();
                        r6.A01 = true;
                        reelMoreOptionsFragment.A08.A02(reelMoreOptionsFragment.A04);
                    }
                    reelMoreOptionsFragment.A0E.A06 = z2;
                }
                arrayList.add(reelMoreOptionsFragment.A0E);
            }
            if (reelMoreOptionsFragment.A0G()) {
                arrayList.add(reelMoreOptionsFragment.A0D);
            }
            if (reelMoreOptionsFragment.A0V) {
                arrayList.add(reelMoreOptionsFragment.A0G);
            }
            if (reelMoreOptionsFragment.A0U) {
                arrayList.add(reelMoreOptionsFragment.A0F);
            }
            if (reelMoreOptionsFragment.A0H()) {
                C166997Au r42 = reelMoreOptionsFragment.A0c;
                AnonymousClass0a4.A06(r42);
                if (!r42.A00 && !C27665CMj.A00(r42.A02).getBoolean("has_added_shopping_product_swipe_up", false)) {
                    int i2 = C27665CMj.A00(r42.A02).getInt("shopping_product_swipe_up_highlight_impression_count", 0);
                    z = true;
                }
                z = false;
                if (z) {
                    C166997Au r62 = reelMoreOptionsFragment.A0c;
                    AnonymousClass0C1 r52 = r62.A02;
                    C27665CMj.A00(r52).edit().putInt("shopping_product_swipe_up_highlight_impression_count", C27665CMj.A00(r52).getInt("shopping_product_swipe_up_highlight_impression_count", 0) + 1).apply();
                    r62.A00 = true;
                    reelMoreOptionsFragment.A08.A02(reelMoreOptionsFragment.A04);
                }
                C120145Dk r02 = reelMoreOptionsFragment.A0H;
                r02.A06 = z;
                arrayList.add(r02);
            }
            if (reelMoreOptionsFragment.A0W) {
                arrayList.add(reelMoreOptionsFragment.A0I);
            }
            if (reelMoreOptionsFragment.A0T) {
                arrayList.add(reelMoreOptionsFragment.A0C);
            }
            if (reelMoreOptionsFragment.A0R) {
                arrayList.add(reelMoreOptionsFragment.A0A);
            }
            if (reelMoreOptionsFragment.A0S) {
                arrayList.add(reelMoreOptionsFragment.A0B);
            }
        }
        if (!reelMoreOptionsFragment.A1N.isEmpty() && Constants.A0N.equals(num)) {
            arrayList.add(new C1189358l(new SpannableStringBuilder(reelMoreOptionsFragment.getContext().getResources().getQuantityString(C0003R.plurals.add_call_to_action_description, reelMoreOptionsFragment.A1N.size())), C0003R.layout.reel_more_options_footer_text));
        }
        if (reelMoreOptionsFragment.A10 || C144886Hm.A06(reelMoreOptionsFragment.A0N)) {
            if (!arrayList.isEmpty()) {
                arrayList.add(new AnonymousClass4FF());
            }
            arrayList.add(new AnonymousClass2NW((int) C0003R.string.branded_content));
            AnonymousClass4LF r1 = reelMoreOptionsFragment.mBrandedContentMetadataItem;
            r1.A05 = !reelMoreOptionsFragment.A0J();
            arrayList.add(r1);
            if (!reelMoreOptionsFragment.A0J()) {
                arrayList.add(new C1189358l(reelMoreOptionsFragment.A0b, C0003R.layout.reel_more_options_footer_text));
            }
            if (reelMoreOptionsFragment.A04.A03() || reelMoreOptionsFragment.A0X || !C144886Hm.A07(reelMoreOptionsFragment.A0Q, reelMoreOptionsFragment.A06) || !((Boolean) AnonymousClass0L6.A02(reelMoreOptionsFragment.A06, AnonymousClass0L7.BRANDED_CONTENT_ENABLE_SPONSOR_TO_PROMOTE_BY_DEFAULT, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                arrayList.add(reelMoreOptionsFragment.A0J);
            }
            arrayList.add(reelMoreOptionsFragment.A0r);
        }
        reelMoreOptionsFragment.A0l.setItems(arrayList);
        reelMoreOptionsFragment.setListAdapter(reelMoreOptionsFragment.A0l);
    }

    public static void A0F(ReelMoreOptionsFragment reelMoreOptionsFragment, String str, String str2) {
        A0D(reelMoreOptionsFragment, reelMoreOptionsFragment.A0E, reelMoreOptionsFragment.A1E, reelMoreOptionsFragment.A1D, true);
        ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A04;
        reelMoreOptionsFragment.A04 = new ReelMoreOptionsModel(reelMoreOptionsModel.A06, reelMoreOptionsModel.A09, reelMoreOptionsModel.A08, reelMoreOptionsModel.A07, new ProfileShopLink(str, str2), reelMoreOptionsModel.A00, reelMoreOptionsModel.A01, reelMoreOptionsModel.A02, reelMoreOptionsModel.A04, reelMoreOptionsModel.A05);
        reelMoreOptionsFragment.A0E.A06 = false;
        A09(reelMoreOptionsFragment);
        A0E(reelMoreOptionsFragment, Constants.A0j);
        A0C(reelMoreOptionsFragment);
        C166817Aa r1 = reelMoreOptionsFragment.A08;
        AnonymousClass0a4.A06(r1);
        r1.A01(reelMoreOptionsFragment.A04);
        reelMoreOptionsFragment.A0O = str;
        reelMoreOptionsFragment.A0P = str2;
    }

    private boolean A0G() {
        return ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.SWIPE_UP_TO_INSTAGRAM_SHOP_CREATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (p000X.C52952Qw.A0E(r3.A06) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r0.A01.equals(r3.A06.A04()) != false) goto L_0x0036;
     */
    private boolean A0H() {
        boolean z;
        String str;
        if (this.mArguments.getBoolean("SHOPPING_PRODUCT_LINKS_ENABLED", false) && ((str = this.A0O) == null || str.equals(this.A06.A04()))) {
            ReelMoreOptionsModel reelMoreOptionsModel = this.A04;
            if (reelMoreOptionsModel.A03()) {
                BrandedContentTag brandedContentTag = reelMoreOptionsModel.A05;
                AnonymousClass0a4.A06(brandedContentTag);
            }
            z = true;
        }
        z = false;
        if (z || this.A11) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (p000X.C52952Qw.A0E(r3.A06) == false) goto L_0x0024;
     */
    private boolean A0I() {
        boolean z;
        String str;
        if (this.mArguments.getBoolean("PROFILE_SHOP_LINKS_ENABLED", false) && ((str = this.A0O) == null || str.equals(this.A06.A04()))) {
            z = true;
        }
        z = false;
        if (z || this.A0Z) {
            return true;
        }
        return false;
    }

    private boolean A0J() {
        if (!this.A0Y || this.A06.A06.A0T()) {
            return true;
        }
        return false;
    }

    public final void A0K(String str) {
        ReelMoreOptionsModel reelMoreOptionsModel = this.A04;
        this.A04 = new ReelMoreOptionsModel(reelMoreOptionsModel.A06, reelMoreOptionsModel.A09, reelMoreOptionsModel.A08, str, reelMoreOptionsModel.A03, reelMoreOptionsModel.A00, reelMoreOptionsModel.A01, reelMoreOptionsModel.A02, reelMoreOptionsModel.A04, reelMoreOptionsModel.A05);
        A0C(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer num;
        super.onViewCreated(view, bundle);
        this.A0g = new AnonymousClass2NW((CharSequence) getString(C0003R.string.swipe_up));
        Drawable A032 = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_add_outline_24);
        this.mAddIconDrawable = A032;
        A032.mutate().setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.grey_5)));
        String string2 = getString(C0003R.string.preview_link_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(C0003R.string.call_to_action_preview_explanation, string2));
        AnonymousClass4XV.A02(string2, spannableStringBuilder, new AnonymousClass7AZ(this));
        this.A0n = new C1189358l(spannableStringBuilder, C0003R.layout.reel_more_options_footer_text);
        C120145Dk r8 = new C120145Dk(getString(C0003R.string.weblink_title), getString(C0003R.string.remove_weblink_action_button_text));
        this.A0I = r8;
        A0D(this, r8, this.A16, this.A15, !TextUtils.isEmpty(this.A04.A09));
        this.A09 = new C111194qZ(getString(C0003R.string.weblink_enter_url), this.A04.A01(), this.A1R, this.A1O, Integer.valueOf(DexStore.LOAD_RESULT_WITH_VDEX_ODEX), true);
        if (this.A0T) {
            C1656174i r4 = this.A03;
            AnonymousClass7AZ r9 = new AnonymousClass7AZ(this);
            Resources resources = r4.A00.getResources();
            String string3 = resources.getString(C0003R.string.preview_link_text);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(resources.getString(C0003R.string.igtv_link_preview_explanation_text, new Object[]{string3}));
            AnonymousClass4XV.A02(string3, spannableStringBuilder2, r9);
            this.A0o = new C1189358l(spannableStringBuilder2, C0003R.layout.reel_more_options_footer_text);
            C120145Dk r82 = new C120145Dk(getString(C0003R.string.igtv_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0C = r82;
            A0D(this, r82, this.A1A, this.A19, this.A04.A04());
            this.A0f = this.A03.A02;
        }
        if (A0I()) {
            C120145Dk r83 = new C120145Dk(getString(C0003R.string.profile_shop_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0E = r83;
            A0D(this, r83, this.A1E, this.A1D, this.A04.A07());
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getContext().getString(C0003R.string.profile_shop_link_preview_explanation_text, new Object[]{string2}));
            AnonymousClass4XV.A02(string2, spannableStringBuilder3, new AnonymousClass7AZ(this));
            this.A0t = new C1189358l(spannableStringBuilder3, C0003R.layout.reel_more_options_footer_text);
            A09(this);
        }
        if (A0G()) {
            C120145Dk r92 = new C120145Dk(getString(C0003R.string.instagram_shop_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0D = r92;
            View.OnClickListener onClickListener = this.A1C;
            View.OnClickListener onClickListener2 = this.A1B;
            boolean z = false;
            if (this.A04.A00 != null) {
                z = true;
            }
            A0D(this, r92, onClickListener, onClickListener2, z);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(getContext().getString(C0003R.string.instagram_shop_link_preview_explanation_text, new Object[]{string2}));
            AnonymousClass4XV.A02(string2, spannableStringBuilder4, new AnonymousClass7AZ(this));
            this.A0q = new C1189358l(spannableStringBuilder4, C0003R.layout.reel_more_options_footer_text);
        }
        if (this.A0V) {
            C120145Dk r84 = new C120145Dk(getString(C0003R.string.product_collection_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0G = r84;
            A0D(this, r84, this.A1I, this.A1H, this.A04.A06());
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(getContext().getString(C0003R.string.product_collection_link_preview_explanation_text, new Object[]{string2}));
            AnonymousClass4XV.A02(string2, spannableStringBuilder5, new AnonymousClass7AZ(this));
            this.A0s = new C1189358l(spannableStringBuilder5, C0003R.layout.reel_more_options_footer_text);
            A07(this);
        }
        if (this.A0U) {
            C120145Dk r85 = new C120145Dk(getString(C0003R.string.product_incentive_collection_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0F = r85;
            A0D(this, r85, this.A1G, this.A1F, this.A04.A05());
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(getContext().getString(C0003R.string.product_collection_link_preview_explanation_text, new Object[]{string2}));
            AnonymousClass4XV.A02(string2, spannableStringBuilder6, new AnonymousClass7AZ(this));
            this.A0p = new C1189358l(spannableStringBuilder6, C0003R.layout.reel_more_options_footer_text);
            A06(this);
        }
        if (A0H()) {
            C120145Dk r93 = new C120145Dk(getString(C0003R.string.shopping_product_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0H = r93;
            View.OnClickListener onClickListener3 = this.A1K;
            View.OnClickListener onClickListener4 = this.A1J;
            boolean z2 = false;
            if (this.A04.A04 != null) {
                z2 = true;
            }
            A0D(this, r93, onClickListener3, onClickListener4, z2);
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(getContext().getString(C0003R.string.shopping_product_link_preview_explanation_text, new Object[]{string2}));
            AnonymousClass4XV.A02(string2, spannableStringBuilder7, new AnonymousClass7AZ(this));
            this.A0u = new C1189358l(spannableStringBuilder7, C0003R.layout.reel_more_options_footer_text);
            A08(this);
        }
        if (this.A0R) {
            Context context = getContext();
            if (context != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(context.getResources().getString(C0003R.string.ar_effect_link_preview_explanation_text, new Object[]{string2}));
                AnonymousClass4XV.A02(string2, spannableStringBuilder8, new AnonymousClass7AZ(this));
                this.A0m = new C1189358l(spannableStringBuilder8, C0003R.layout.reel_more_options_footer_text);
            }
            C120145Dk r86 = new C120145Dk(getString(C0003R.string.ar_effect_link_option), getString(C0003R.string.remove_weblink_action_button_text));
            this.A0A = r86;
            View.OnClickListener onClickListener5 = this.A14;
            View.OnClickListener onClickListener6 = this.A13;
            boolean z3 = false;
            if (this.A04.A07 != null) {
                z3 = true;
            }
            A0D(this, r86, onClickListener5, onClickListener6, z3);
            this.A0d = new AnonymousClass75F(this.A06, this.A04.A07, this);
        }
        if (this.A0S) {
            String str = this.A06.A06.A0L.A04;
            C120145Dk r7 = new C120145Dk(str, getString(C0003R.string.remove_weblink_action_button_text));
            this.A0B = r7;
            this.A0e = new C156156lg(str, this.A0x, this.A0w, this.A0v, this.A0y, this.A06);
            View.OnClickListener onClickListener7 = this.A18;
            View.OnClickListener onClickListener8 = this.A17;
            boolean z4 = false;
            if (this.A04.A00() == C77693aR.BUSINESS_TRANSACTION) {
                z4 = true;
            }
            A0D(this, r7, onClickListener7, onClickListener8, z4);
        }
        AnonymousClass4LF r6 = new AnonymousClass4LF((int) C0003R.string.tag_business_partner, (View.OnClickListener) new C166887Ah(this));
        this.mBrandedContentMetadataItem = r6;
        ReelMoreOptionsModel reelMoreOptionsModel = this.A04;
        if (reelMoreOptionsModel.A03()) {
            r6.A00(reelMoreOptionsModel.A05.A02);
        } else {
            r6.A00((CharSequence) null);
        }
        String string4 = getString(C0003R.string.learn_more_text);
        if (!A0J()) {
            string = getString(C0003R.string.add_partner_story_with_product_stickers_message);
        } else {
            string = getString(C0003R.string.add_partner_story_description, string4);
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r42 = this.A06;
        Context context2 = getContext();
        Integer num2 = Constants.ZERO;
        String moduleName = getModuleName();
        AnonymousClass7B4 r14 = new AnonymousClass7B4((AnonymousClass7B5) null, activity, r42, moduleName, num2, context2);
        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(string);
        AnonymousClass4XV.A02(string4, spannableStringBuilder9, r14);
        this.A0b = spannableStringBuilder9;
        C1186457i r72 = new C1186457i((int) C0003R.string.allow_business_partner_to_promote, false, (CompoundButton.OnCheckedChangeListener) new C166877Ag(this), (C79583dh) new C166827Ab(this));
        this.A0J = r72;
        r72.A02(this.A0X);
        String string5 = getString(C0003R.string.ad_library);
        FragmentActivity activity2 = getActivity();
        AnonymousClass0a4.A06(activity2);
        AnonymousClass0C1 r73 = this.A06;
        String string6 = getString(C0003R.string.allow_business_partner_promote_story_description_v1, string5, string4);
        Context context3 = getContext();
        AnonymousClass0a4.A06(context3);
        this.A0r = new C1189358l(C37041j1.A00(activity2, r73, string6, string4, string5, context3, Constants.ZERO, moduleName), C0003R.layout.reel_more_options_footer_text);
        if (!TextUtils.isEmpty(this.A04.A09)) {
            num = Constants.ONE;
        } else {
            ReelMoreOptionsModel reelMoreOptionsModel2 = this.A04;
            if (reelMoreOptionsModel2.A04()) {
                A0E(this, num2);
                setListAdapter(this.A0l);
            } else if (reelMoreOptionsModel2.A07()) {
                num = Constants.A0j;
            } else {
                boolean z5 = false;
                if (reelMoreOptionsModel2.A00 != null) {
                    z5 = true;
                }
                if (z5) {
                    num = Constants.A0u;
                } else if (reelMoreOptionsModel2.A05()) {
                    num = Constants.A12;
                } else if (reelMoreOptionsModel2.A06()) {
                    num = Constants.A14;
                } else {
                    boolean z6 = false;
                    if (reelMoreOptionsModel2.A04 != null) {
                        z6 = true;
                    }
                    if (z6) {
                        num = Constants.A15;
                    } else {
                        boolean z7 = false;
                        if (reelMoreOptionsModel2.A07 != null) {
                            z7 = true;
                        }
                        if (z7) {
                            num = Constants.A0Y;
                        } else if (reelMoreOptionsModel2.A00() == C77693aR.BUSINESS_TRANSACTION) {
                            num = Constants.A0C;
                        } else {
                            num = Constants.A0N;
                        }
                    }
                }
            }
        }
        A0E(this, num);
        setListAdapter(this.A0l);
    }

    public static String A00(String str) {
        String trim = str.trim();
        if (trim.length() <= 0 || trim.matches(AnonymousClass40t.$const$string(180))) {
            return trim;
        }
        return AnonymousClass000.A0E("http://", trim);
    }

    public static void A08(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        String str;
        if (reelMoreOptionsFragment.A0H()) {
            if (reelMoreOptionsFragment.A0j == null) {
                AnonymousClass4LF r2 = new AnonymousClass4LF((int) C0003R.string.shopping_product_link_choose_product, (View.OnClickListener) new C166957Ap(reelMoreOptionsFragment));
                reelMoreOptionsFragment.A0j = r2;
                r2.A06 = true;
            }
            AnonymousClass4LF r22 = reelMoreOptionsFragment.A0j;
            ReelProductLink reelProductLink = reelMoreOptionsFragment.A04.A04;
            boolean z = false;
            if (reelProductLink != null) {
                z = true;
            }
            if (z) {
                AnonymousClass0a4.A06(reelProductLink);
                str = reelProductLink.A00.A0I;
            } else {
                str = "";
            }
            r22.A00(str);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        ActionButton BmH = r3.BmH(C0003R.string.more_options_title, new C1656874p(this));
        this.mSaveButton = BmH;
        BmH.setVisibility(0);
        r3.BmB(C0003R.C0004drawable.instagram_x_outline_24, new AnonymousClass75W(this));
        A0C(this);
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ReelMoreOptionsModel reelMoreOptionsModel;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 6 && intent != null) {
            reelMoreOptionsModel = (ReelMoreOptionsModel) intent.getParcelableExtra("MORE_OPTIONS_MODEL");
        } else if (i2 == -1 && i == 11 && intent != null) {
            String stringExtra = intent.getStringExtra("merchant_id");
            this.A0O = stringExtra;
            ShoppingDestinationMetadata shoppingDestinationMetadata = new ShoppingDestinationMetadata();
            shoppingDestinationMetadata.A00 = new ProductCollectionLinkMetadata(stringExtra, intent.getStringExtra("product_collection_id"), intent.getStringExtra("product_collection_type"));
            ProductCollectionLink productCollectionLink = new ProductCollectionLink(intent.getStringExtra("product_collection_title"), shoppingDestinationMetadata);
            ReelMoreOptionsModel reelMoreOptionsModel2 = this.A04;
            reelMoreOptionsModel = new ReelMoreOptionsModel(reelMoreOptionsModel2.A06, reelMoreOptionsModel2.A09, reelMoreOptionsModel2.A08, reelMoreOptionsModel2.A07, reelMoreOptionsModel2.A03, reelMoreOptionsModel2.A00, reelMoreOptionsModel2.A01, productCollectionLink, reelMoreOptionsModel2.A04, reelMoreOptionsModel2.A05);
        } else if (i2 == -1 && i == 8 && intent != null) {
            String stringExtra2 = intent.getStringExtra("brand_id");
            AnonymousClass0a4.A06(stringExtra2);
            this.A0O = stringExtra2;
            String stringExtra3 = intent.getStringExtra("brand_username");
            AnonymousClass0a4.A06(stringExtra3);
            this.A0P = stringExtra3;
            A0F(this, this.A0O, stringExtra3);
            return;
        } else {
            return;
        }
        this.A04 = reelMoreOptionsModel;
        C166817Aa r0 = this.A08;
        AnonymousClass0a4.A06(r0);
        r0.A01(reelMoreOptionsModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0104, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r8, p000X.AnonymousClass0L7.SHOPPING_ANDROID_CREATOR_SWIPE_UP_TO_SHOP, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012b, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r8, p000X.AnonymousClass0L7.SHOPPING_ANDROID_CREATOR_SWIPE_UP_TO_PDP, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x012d;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int A022 = AnonymousClass0Z0.A02(2044035448);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        this.A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A0z = this.mArguments.getString("CAPTURE_SESSION_ID");
        this.A02 = C17660qb.A00.A08(this.A06);
        this.A0l = new C120125Dh(getContext());
        this.A0Y = this.mArguments.getBoolean("HAS_PRODUCT_STICKERS");
        this.A0O = this.mArguments.getString(AnonymousClass0C5.$const$string(314));
        this.A0P = this.mArguments.getString(AnonymousClass0C5.$const$string(179));
        this.A0N = C16180oA.A00(this.A06).A04();
        if (bundle != null) {
            this.A05 = (ReelMoreOptionsModel) this.mArguments.getParcelable("MORE_OPTIONS_MODEL");
            this.A04 = (ReelMoreOptionsModel) bundle2.getParcelable("saved_instance_state_more_options_model");
        } else {
            this.A0x = this.mArguments.getString("ACTIVE_CAPTURED_PHOTO_FILE_PATH", (String) null);
            this.A0w = Integer.valueOf(this.mArguments.getInt("ARGUMENT_ACTIVE_CAPTURED_PHOTO_ROTATION", 0));
            this.A0v = Boolean.valueOf(this.mArguments.getBoolean("ACTIVE_CAPTURED_PHOTO_MIRRORED", false));
            this.A0y = this.mArguments.getString("ACTIVE_CAPTURED_VIDEO_FILE_PATH", (String) null);
            ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) this.mArguments.getParcelable("MORE_OPTIONS_MODEL");
            this.A05 = reelMoreOptionsModel;
            this.A04 = new ReelMoreOptionsModel(reelMoreOptionsModel.A06, reelMoreOptionsModel.A09, reelMoreOptionsModel.A08, reelMoreOptionsModel.A07, reelMoreOptionsModel.A03, reelMoreOptionsModel.A00, reelMoreOptionsModel.A01, reelMoreOptionsModel.A02, reelMoreOptionsModel.A04, reelMoreOptionsModel.A05);
        }
        ReelMoreOptionsModel reelMoreOptionsModel2 = this.A04;
        if (reelMoreOptionsModel2.A03()) {
            this.A0X = reelMoreOptionsModel2.A05.A01();
        }
        this.A0W = ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.STORIES_WEBLINK_CREATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        boolean z3 = this.mArguments.getBoolean("OWNS_IGTV_VIDEOS", false);
        this.A0T = z3;
        if (z3) {
            this.A03 = C17660qb.A00.A09(getContext(), AnonymousClass1L8.A00(this), this.A06, this, this.A04.A08, this.A02, this);
        }
        this.A0U = this.mArguments.getBoolean("SHOPPING_INCENTIVE_COLLECTION_LINKS_ENABLED", false);
        this.A0V = this.mArguments.getBoolean("SHOPPING_PRODUCT_COLLECTION_LINKS_ENABLED", false);
        boolean z4 = true;
        if (this.mArguments.getBoolean("PROFILE_SHOP_LINKS_ENABLED", false)) {
            AnonymousClass0C1 r8 = this.A06;
            if (r8.A06.A0T()) {
                z = true;
            }
        }
        z = false;
        this.A0Z = z;
        if (this.mArguments.getBoolean("SHOPPING_PRODUCT_LINKS_ENABLED", false)) {
            AnonymousClass0C1 r82 = this.A06;
            if (r82.A06.A0T()) {
                z2 = true;
            }
        }
        z2 = false;
        this.A11 = z2;
        if (A0I() || this.A0U || this.A0V || A0H() || A0G()) {
            C166817Aa r9 = new C166817Aa(this.A06, this.A0z, this, A0I(), this.A0U, this.A0V, A0H());
            this.A08 = r9;
            ReelMoreOptionsModel reelMoreOptionsModel3 = this.A04;
            C167017Ax r5 = new C167017Ax(r9.A00.A02("instagram_shopping_swipe_up_creation_enter"));
            if (r5.A0B()) {
                r5.A0A("shopping_swipe_up_link_creation_context", r9.A02);
                r5.A0A("reel_swipe_up_link", C166817Aa.A00(reelMoreOptionsModel3));
                r5.A08("session_id", r9.A01);
                r5.A01();
            }
            this.A0c = new C166997Au(this.A06);
        }
        this.A0R = this.mArguments.getBoolean("IS_AR_EFFECT_CREATOR", false);
        if (!AnonymousClass61A.A00(this.A06.A06) || !((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.BUSINESS_TRANSACTION_IN_STORIES_CREATOR, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            z4 = false;
        }
        this.A0S = z4;
        this.A10 = this.A06.A06.A0R();
        this.A12 = this.mArguments.getBoolean("GO_TO_BRANDED_CONTENT_OPT_IN", false);
        this.A0Q = this.mArguments.getStringArrayList(AnonymousClass40t.$const$string(53));
        if (this.A0W) {
            this.A1N.add(C77693aR.WEB_URL);
        }
        if (this.A0T) {
            this.A1N.add(C77693aR.IGTV);
        }
        if (A0I()) {
            this.A1N.add(C77693aR.PROFILE_SHOP);
        }
        if (A0G()) {
            this.A1N.add(C77693aR.INSTAGRAM_SHOP);
        }
        if (this.A0V) {
            this.A1N.add(C77693aR.SHOPPING_PRODUCT_COLLECTION);
        }
        if (this.A0U) {
            this.A1N.add(C77693aR.SHOPPING_INCENTIVE_COLLECTION);
        }
        if (A0H()) {
            this.A1N.add(C77693aR.SHOPPING_PRODUCT);
        }
        if (this.A0R) {
            this.A1N.add(C77693aR.AR_EFFECT);
        }
        if (this.A0S) {
            this.A1N.add(C77693aR.BUSINESS_TRANSACTION);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A1N.iterator();
        while (it.hasNext()) {
            arrayList.add(((C77693aR) it.next()).A00.toString());
        }
        C84323lT A002 = C85393nH.A00(this.A06);
        C06270Ok A003 = C06270Ok.A00();
        A003.A0A("candidate_link_types", arrayList);
        A002.AnL(A003);
        if (this.A12) {
            AnonymousClass0ZA.A0E(new Handler(), new C166987At(this), 547016165);
        }
        this.A07 = C17510qM.A00.A0N(getContext(), AnonymousClass1L8.A00(this), this.A06, this.A1P);
        AnonymousClass0Z0.A09(1899935107, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1657211188);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setBackgroundColor(AnonymousClass1BA.A01(getContext(), C0003R.attr.backgroundColorPrimary));
        AnonymousClass0Z0.A09(1148666317, A022);
        return onCreateView;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0Z0.A02(-458461781);
        super.onDestroyView();
        ReelMoreOptionsFragmentLifecycleUtil.cleanupReferences(this);
        C84323lT A002 = C85393nH.A00(this.A06);
        C06270Ok A003 = C06270Ok.A00();
        A003.A09("link_type", this.A04.A00().A00.toString());
        A002.Akt(A003);
        if (this.A10 || C144886Hm.A06(this.A0N)) {
            AnonymousClass0C1 r3 = this.A06;
            boolean z = this.A0X;
            BrandedContentTag brandedContentTag = this.A04.A05;
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            } else {
                str = null;
            }
            AnonymousClass6OZ.A06(r3, this, false, z, str, "story", (String) null);
        }
        AnonymousClass0Z0.A09(-983886685, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_instance_state_more_options_model", this.A04);
    }
}
