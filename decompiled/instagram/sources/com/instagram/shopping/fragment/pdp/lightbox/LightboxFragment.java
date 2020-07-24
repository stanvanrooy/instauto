package com.instagram.shopping.fragment.pdp.lightbox;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1Eo;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass27S;
import p000X.AnonymousClass35D;
import p000X.AnonymousClass7LU;
import p000X.AnonymousClass9DH;
import p000X.AnonymousClass9DI;
import p000X.AnonymousClass9ER;
import p000X.AnonymousClass9ET;
import p000X.AnonymousClass9EX;
import p000X.AnonymousClass9Ew;
import p000X.AnonymousClass9F2;
import p000X.AnonymousClass9F3;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C17020pY;
import p000X.C18980sj;
import p000X.C211829Bs;
import p000X.C211969Ch;
import p000X.C211979Ci;
import p000X.C211989Cj;
import p000X.C211999Ck;
import p000X.C212139Cy;
import p000X.C212399Eb;
import p000X.C212439Ef;
import p000X.C212459Eh;
import p000X.C212499El;
import p000X.C212529Eo;
import p000X.C212539Ep;
import p000X.C26591Ec;
import p000X.C27341Hl;
import p000X.C28051Kf;
import p000X.C29821Rj;
import p000X.C32711bj;
import p000X.C52362Om;
import p000X.C52892Qp;
import p000X.C52902Qq;

public class LightboxFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass9ET {
    public int A00;
    public long A01;
    public AnonymousClass1UY A02;
    public AnonymousClass0C1 A03;
    public C212499El A04;
    public C212399Eb A05;
    public AnonymousClass9ER A06;
    public C212459Eh A07;
    public LightboxArguments A08;
    public AnonymousClass27S A09;
    public C29821Rj A0A;
    public String A0B = "back_button";
    public List A0C;
    public boolean A0D;
    public AnonymousClass9Ew A0E;
    public final C28051Kf A0F = C28051Kf.A00();
    public View mPrimaryColorCloseButton;
    public View mWhiteColorCloseButton;

    public final String getModuleName() {
        return "instagram_shopping_lightbox";
    }

    public static List A00(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C211969Ch r2 = (C211969Ch) it.next();
            if (r2.A01 != Constants.ZERO) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r2.A01 = p000X.Constants.ONE;
        r2.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r2 = r4.A04;
        r2.A01 = p000X.Constants.ZERO;
        r2.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        p000X.AnonymousClass0Z1.A00(r2, -2138202185);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        return;
     */
    public static void A01(LightboxFragment lightboxFragment) {
        C212499El r2;
        AnonymousClass1NJ r1;
        C211829Bs r12 = lightboxFragment.A06.A01;
        if (r12 != null) {
            r12.A07("scroll", true);
        }
        C211969Ch r3 = (C211969Ch) lightboxFragment.A0C.get(lightboxFragment.A00);
        switch (r3.A01.intValue()) {
            case 1:
                C211999Ck r32 = (C211999Ck) r3;
                AnonymousClass1NJ r13 = r32.A00;
                if (r13.AiO()) {
                    lightboxFragment.A06.A02(r13);
                    r2 = lightboxFragment.A04;
                    r1 = r32.A00;
                    break;
                }
                break;
            case 4:
                C211989Cj r33 = (C211989Cj) r3;
                lightboxFragment.A06.A02(r33.A00);
                r2 = lightboxFragment.A04;
                r1 = r33.A00;
                break;
            case 5:
                C211979Ci r34 = (C211979Ci) r3;
                AnonymousClass1NJ r14 = r34.A00;
                if (r14.AiO()) {
                    lightboxFragment.A06.A02(r14);
                    r2 = lightboxFragment.A04;
                    r1 = r34.A00;
                    break;
                }
                break;
        }
    }

    public static void A02(LightboxFragment lightboxFragment) {
        int A092 = C06220Of.A09(lightboxFragment.getContext());
        if (((int) ((1.0f / ((C211969Ch) lightboxFragment.A0C.get(lightboxFragment.A00)).A00) * ((float) A092))) < C06220Of.A08(lightboxFragment.getContext())) {
            lightboxFragment.mPrimaryColorCloseButton.setVisibility(0);
            lightboxFragment.mWhiteColorCloseButton.setVisibility(8);
            return;
        }
        lightboxFragment.mPrimaryColorCloseButton.setVisibility(8);
        lightboxFragment.mWhiteColorCloseButton.setVisibility(0);
    }

    public static void A03(LightboxFragment lightboxFragment, String str) {
        C52362Om r4 = new C52362Om(lightboxFragment.getActivity(), lightboxFragment.A03);
        r4.A0B = true;
        C52892Qp A002 = C18980sj.A00.A00();
        C52902Qq A012 = C52902Qq.A01(lightboxFragment.A03, str, "shopping_lightbox", lightboxFragment.getModuleName());
        A012.A0B = lightboxFragment.A08.A06;
        r4.A02 = A002.A02(A012.A03());
        r4.A02();
    }

    public static boolean A04(LightboxFragment lightboxFragment, C211969Ch r3) {
        return C212139Cy.A00(lightboxFragment.A03, r3, lightboxFragment.A08.A00.A02.A02);
    }

    public final void BVV(AnonymousClass1NJ r3) {
        View view = this.mView;
        if (view != null) {
            view.post(new C212529Eo(this, r3));
        }
    }

    public final boolean onBackPressed() {
        C212399Eb r3 = this.A05;
        String str = this.A0B;
        AnonymousClass9F3 r2 = new AnonymousClass9F3(r3.A00.A02("instagram_shopping_lightbox_dismiss"));
        if (!r2.A0B()) {
            return false;
        }
        r2.A08("source", str);
        r2.A07("product_id", Long.valueOf(Long.parseLong(r3.A02.getId())));
        r2.A08("merchant_id", r3.A02.A02.A02);
        r2.A04("is_checkout_enabled", Boolean.valueOf(r3.A02.A09()));
        r2.A08("checkout_session_id", r3.A04);
        r2.A08("prior_module", r3.A05);
        r2.A08("prior_submodule", r3.A06);
        AnonymousClass1NJ r0 = r3.A01;
        if (r0 != null) {
            r2.A08("m_pk", r0.getId());
            r2.A08("media_owner_id", r3.A01.A0c(r3.A03).getId());
        }
        r2.A01();
        return false;
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        int A022 = AnonymousClass0Z0.A02(-622141391);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        LightboxArguments lightboxArguments = (LightboxArguments) bundle2.getParcelable("arguments");
        AnonymousClass0a4.A06(lightboxArguments);
        this.A08 = lightboxArguments;
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A03 = A062;
        Parcelable[] parcelableArr = this.A08.A08;
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArr) {
            HeroCarouselItemConverter$ParcelableHeroCarouselItemModel heroCarouselItemConverter$ParcelableHeroCarouselItemModel = (HeroCarouselItemConverter$ParcelableHeroCarouselItemModel) parcelable;
            AnonymousClass1PZ A002 = AnonymousClass1PZ.A00(A062);
            switch (heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A02.intValue()) {
                case 0:
                    String str = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A04;
                    AnonymousClass0a4.A06(str);
                    String str2 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A03;
                    AnonymousClass0a4.A06(str2);
                    ProductArEffectMetadata productArEffectMetadata = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A01;
                    AnonymousClass0a4.A06(productArEffectMetadata);
                    ImageInfo imageInfo = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A00;
                    AnonymousClass0a4.A06(imageInfo);
                    obj = new AnonymousClass9DH(heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05, str, str2, productArEffectMetadata, imageInfo, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A06);
                    break;
                case 1:
                    String str3 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A09;
                    AnonymousClass0a4.A06(str3);
                    AnonymousClass0a4.A06(heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A08);
                    String str4 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05;
                    AnonymousClass1NJ A023 = A002.A02(str3);
                    AnonymousClass0a4.A06(A023);
                    AnonymousClass1NJ A024 = A002.A02(heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A08);
                    AnonymousClass0a4.A06(A024);
                    obj = new C211999Ck(str4, A023, A024);
                    break;
                case 3:
                    ImageInfo imageInfo2 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A00;
                    AnonymousClass0a4.A06(imageInfo2);
                    obj = new AnonymousClass9DI(heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05, imageInfo2, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A06);
                    break;
                case 4:
                    String str5 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A09;
                    AnonymousClass0a4.A06(str5);
                    String str6 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05;
                    AnonymousClass1NJ A025 = A002.A02(str5);
                    AnonymousClass0a4.A06(A025);
                    obj = new C211989Cj(str6, A025);
                    break;
                case 5:
                    AnonymousClass0a4.A06(heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A07);
                    String str7 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05;
                    Reel A0G = C17020pY.A00().A0Q(A062).A0G(heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A07);
                    AnonymousClass0a4.A06(A0G);
                    obj = new C211979Ci(A062, str7, A0G);
                    break;
                default:
                    throw new IllegalStateException();
            }
            arrayList.add(obj);
        }
        this.A0C = A00(arrayList);
        for (int i = 0; i < this.A0C.size(); i++) {
            if (((C211969Ch) this.A0C.get(i)).A01().equals(this.A08.A02)) {
                this.A00 = i;
            }
        }
        AnonymousClass0C1 r6 = this.A03;
        LightboxArguments lightboxArguments2 = this.A08;
        this.A05 = new C212399Eb(this, r6, lightboxArguments2.A00, lightboxArguments2.A01, lightboxArguments2.A04, lightboxArguments2.A05, AnonymousClass1PZ.A00(r6).A02(this.A08.A03));
        this.A07 = new C212459Eh(this.A03);
        this.A0E = new AnonymousClass9Ew(this.A03, this.A0F, this);
        this.A09 = new AnonymousClass27S();
        this.A06 = new AnonymousClass9ER(getContext(), this.A03, this);
        C29821Rj r3 = new C29821Rj((ViewGroup) activity.getWindow().getDecorView());
        this.A0A = r3;
        registerLifecycleListener(r3);
        this.A02 = new AnonymousClass1UY(this.A03, new AnonymousClass1UZ(this), this);
        C212399Eb r62 = this.A05;
        int size = this.A0C.size();
        int i2 = this.A00;
        boolean z = this.A08.A07;
        AnonymousClass9F2 r5 = new AnonymousClass9F2(r62.A00.A02("instagram_shopping_lightbox_entry"));
        if (r5.A0B()) {
            r5.A07("item_count", Long.valueOf((long) size));
            r5.A07("initial_index", Long.valueOf((long) i2));
            r5.A04("is_loading", Boolean.valueOf(z));
            r5.A07("product_id", Long.valueOf(Long.parseLong(r62.A02.getId())));
            r5.A08("merchant_id", r62.A02.A02.A02);
            r5.A04("is_checkout_enabled", Boolean.valueOf(r62.A02.A09()));
            r5.A08("checkout_session_id", r62.A04);
            r5.A08("prior_module", r62.A05);
            r5.A08("prior_submodule", r62.A06);
            AnonymousClass1NJ r2 = r62.A01;
            if (r2 != null) {
                r5.A08("m_pk", r2.getId());
                r5.A08("media_owner_id", r62.A01.A0c(r62.A03).getId());
            }
            r5.A01();
        }
        LightboxArguments lightboxArguments3 = this.A08;
        if (lightboxArguments3.A07) {
            this.A0D = true;
            this.A01 = System.currentTimeMillis();
            Product product = lightboxArguments3.A00;
            Context context = getContext();
            AnonymousClass0a4.A06(context);
            AnonymousClass7LU.A00(context, AnonymousClass1L8.A00(this), this.A03, product, product.A02.A02, new C212439Ef(this));
        } else {
            this.A05.A00(this.A0C.size(), this.A00, 0);
        }
        AnonymousClass0Z0.A09(304908579, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(76114054);
        View inflate = layoutInflater.inflate(C0003R.layout.lightbox, viewGroup, false);
        AnonymousClass0Z0.A09(1408344446, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1277741767);
        super.onDestroy();
        unregisterLifecycleListener(this.A0A);
        AnonymousClass0Z0.A09(264809856, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1524319473);
        super.onDestroyView();
        this.A04 = null;
        LightboxFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-467673420, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(2030758713);
        super.onPause();
        AnonymousClass9ER r2 = this.A06;
        C211829Bs r0 = r2.A01;
        if (r0 != null) {
            r0.A04("fragment_paused");
            r2.A01 = null;
            r2.A00 = null;
        }
        AnonymousClass0Z0.A09(-613425966, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-2089401267);
        super.onResume();
        A01(this);
        AnonymousClass0Z0.A09(-1871946908, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(-309585566);
        super.onStop();
        C212459Eh r5 = this.A07;
        if (!r5.A01.A06()) {
            AnonymousClass1Eo r3 = (AnonymousClass1Eo) r5.A02.getValue();
            AnonymousClass35D A052 = r5.A01.A05();
            if (!A052.A06()) {
                C26591Ec.A00(r3.A02).A03(r3.A0E(A052));
            }
            AnonymousClass35D r1 = r5.A01;
            r1.A04.clear();
            r1.A03.clear();
            r1.A05.clear();
        }
        AnonymousClass0Z0.A09(1105877074, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A04 = new C212499El(this, this.A03, this.A0E, this.A09, this.A06, this);
        ReboundViewPager reboundViewPager = (ReboundViewPager) view.findViewById(C0003R.C0005id.view_pager);
        reboundViewPager.setAdapter((Adapter) this.A04);
        reboundViewPager.A0F((float) this.A00, true);
        reboundViewPager.A0L(new AnonymousClass9EX(this));
        C212539Ep r1 = new C212539Ep(this);
        View findViewById = view.findViewById(C0003R.C0005id.primary_close_button);
        this.mPrimaryColorCloseButton = findViewById;
        findViewById.setOnClickListener(r1);
        View findViewById2 = view.findViewById(C0003R.C0005id.white_close_button);
        this.mWhiteColorCloseButton = findViewById2;
        findViewById2.setOnClickListener(r1);
        A02(this);
        this.A0F.A04(C32711bj.A00(this), reboundViewPager);
        C212499El r12 = this.A04;
        r12.A02 = this.A0C;
        AnonymousClass0Z1.A00(r12, 612254867);
    }
}
