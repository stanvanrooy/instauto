package com.instagram.tagging.activity;

import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.PhotoScrollView;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OX;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass1X5;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass5EO;
import p000X.AnonymousClass9DT;
import p000X.AnonymousClass9DY;
import p000X.BBJ;
import p000X.BBO;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C110714pj;
import p000X.C11200ea;
import p000X.C12800hP;
import p000X.C12810hQ;
import p000X.C129335gB;
import p000X.C151726eB;
import p000X.C15330mi;
import p000X.C15890nh;
import p000X.C160696tO;
import p000X.C160726tR;
import p000X.C161956vd;
import p000X.C17510qM;
import p000X.C181987pp;
import p000X.C182887rW;
import p000X.C220559et;
import p000X.C23300zv;
import p000X.C239512q;
import p000X.C26441Dh;
import p000X.C26771Ff;
import p000X.C27532CGw;
import p000X.C27665CMj;
import p000X.C27732CPa;
import p000X.C27736CPf;
import p000X.C27737CPg;
import p000X.C27738CPh;
import p000X.C27739CPi;
import p000X.C27742CPl;
import p000X.C27743CPn;
import p000X.C27746CPq;
import p000X.C27747CPr;
import p000X.C27748CPs;
import p000X.C27750CPu;
import p000X.C27754CPy;
import p000X.C27755CPz;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C52952Qw;
import p000X.C53642Tq;
import p000X.C54332Ww;
import p000X.C7O;
import p000X.CNQ;
import p000X.CNR;
import p000X.CPN;
import p000X.CPO;
import p000X.CPP;
import p000X.CPQ;
import p000X.CPR;
import p000X.CPS;
import p000X.CPT;
import p000X.CPV;
import p000X.CPW;
import p000X.CPX;
import p000X.CPZ;
import p000X.CPm;
import p000X.CQ0;

public class TaggingActivity extends IgFragmentActivity implements AnonymousClass0RN, CPm, C27736CPf, C27746CPq, BBO, C27754CPy, C151726eB, CQ0, C27755CPz {
    public int A00;
    public ReboundViewPager A01;
    public IgSegmentedTabLayout A02;
    public AnonymousClass0C1 A03;
    public C161956vd A04;
    public CPX A05;
    public CPR A06;
    public C27738CPh A07;
    public PhotoScrollView A08;
    public String A09;
    public ArrayList A0A;
    public C11200ea A0B;
    public C11200ea A0C;
    public BBJ A0D;
    public CPO A0E;
    public CPP A0F;
    public C7O A0G;
    public CPV A0H;
    public final Map A0I = new HashMap();
    public final Set A0J = new HashSet();

    public final void BPz(TagsInteractiveLayout tagsInteractiveLayout, ArrayList arrayList, ArrayList arrayList2, MediaSuggestedProductTag mediaSuggestedProductTag) {
        MediaSuggestedProductTag mediaSuggestedProductTag2 = mediaSuggestedProductTag;
        Product A082 = mediaSuggestedProductTag.A02();
        if (A082 != null) {
            FrameLayout frameLayout = new FrameLayout(this);
            View A002 = AnonymousClass9DT.A00(frameLayout);
            AnonymousClass9DT.A02((AnonymousClass9DY) A002.getTag(), A082, false, new C27748CPs(this));
            frameLayout.addView(A002);
            AnonymousClass5EO r2 = new AnonymousClass5EO(this.A03, this);
            r2.A00 = frameLayout;
            TagsInteractiveLayout tagsInteractiveLayout2 = tagsInteractiveLayout;
            r2.A01(C0003R.string.action_sheet_remove_text, new CPQ(this, tagsInteractiveLayout, mediaSuggestedProductTag));
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = arrayList2;
            r2.A02(C0003R.string.action_sheet_change_text, new C27732CPa(this, arrayList3, arrayList4, tagsInteractiveLayout2, mediaSuggestedProductTag2));
            r2.A02(C0003R.string.action_sheet_confirm_text, new CPT(this, arrayList3, arrayList4, tagsInteractiveLayout2, mediaSuggestedProductTag2, A082));
            r2.A00().A01(this);
        }
    }

    private int A00() {
        ArrayList arrayList;
        switch (this.A07.ordinal()) {
            case 0:
                arrayList = ((MediaTaggingInfo) this.A0A.get(this.A00)).A07;
                break;
            case 1:
                if (!A0H(this, this.A00)) {
                    arrayList = ((MediaTaggingInfo) this.A0A.get(this.A00)).A09;
                    break;
                } else {
                    return ((MediaTaggingInfo) this.A0A.get(this.A00)).A09.size() + A01(this.A00);
                }
            default:
                throw new UnsupportedOperationException("Unsupported tag type");
        }
        return arrayList.size();
    }

    private int A01(int i) {
        AnonymousClass0a4.A06(((MediaTaggingInfo) this.A0A.get(i)).A0A);
        Iterator it = ((MediaTaggingInfo) this.A0A.get(i)).A0A.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((MediaSuggestedProductTag) it.next()).A02 ? 1 : 0;
        }
        return i2;
    }

    private int A04(C27738CPh cPh) {
        HashSet hashSet = new HashSet();
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
            switch (cPh.ordinal()) {
                case 0:
                    Iterator it2 = mediaTaggingInfo.A07.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((Tag) it2.next()).A03());
                    }
                    break;
                case 1:
                    Iterator it3 = mediaTaggingInfo.A09.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(((Tag) it3.next()).A03());
                    }
                    break;
            }
        }
        return hashSet.size();
    }

    private void A06() {
        if (this.A0B == null) {
            this.A0B = new CPN(this);
        }
        if (this.A0C == null) {
            this.A0C = new CPW(this);
        }
        C23300zv A002 = C23300zv.A00(this.A03);
        A002.A02(CNR.class, this.A0B);
        A002.A02(CNQ.class, this.A0C);
    }

    private void A08() {
        if (this.A07 == C27738CPh.PRODUCT && this.A0D != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((MediaTaggingInfo) it.next()).A09.iterator();
                while (it2.hasNext()) {
                    ProductTag productTag = (ProductTag) it2.next();
                    arrayList.add(productTag.A03());
                    if (!this.A03.A04().equals(productTag.A01.A02.A02)) {
                        z = true;
                    }
                }
            }
            if (!arrayList.isEmpty() && !z) {
                this.A0D.A00(arrayList);
                return;
            }
        }
        this.A0E.A07.setVisibility(8);
    }

    private void A09() {
        Integer num;
        C7O c7o = this.A0G;
        if (c7o != null) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) this.A0A.get(this.A00);
            if (!mediaTaggingInfo.A09.isEmpty()) {
                num = Constants.ZERO;
            } else if (!mediaTaggingInfo.A07.isEmpty()) {
                num = Constants.ONE;
            } else {
                num = Constants.A0C;
            }
            c7o.A00(num);
        }
    }

    public static void A0A(TaggingActivity taggingActivity) {
        CPO cpo;
        int i;
        C27738CPh cPh;
        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) taggingActivity.A0A.get(taggingActivity.A00);
        MediaType mediaType = mediaTaggingInfo.A03;
        if (mediaType == MediaType.VIDEO) {
            switch (taggingActivity.A07.ordinal()) {
                case 0:
                    cpo = taggingActivity.A0E;
                    CPR cpr = taggingActivity.A06;
                    i = ((List) cpr.A02.get(taggingActivity.AJQ())).size();
                    break;
                case 1:
                    cpo = taggingActivity.A0E;
                    CPR cpr2 = taggingActivity.A06;
                    i = ((List) cpr2.A03.get(taggingActivity.AJQ())).size();
                    cPh = C27738CPh.PRODUCT;
                    break;
                default:
                    return;
            }
        } else {
            switch (taggingActivity.A07.ordinal()) {
                case 0:
                    cpo = taggingActivity.A0E;
                    i = mediaTaggingInfo.A07.size();
                    break;
                case 1:
                    int size = mediaTaggingInfo.A09.size();
                    if (A0H(taggingActivity, taggingActivity.A00)) {
                        size += taggingActivity.A01(taggingActivity.A00);
                    }
                    CPO.A01(taggingActivity.A0E, mediaTaggingInfo.A03, C27738CPh.PRODUCT, size);
                    return;
                default:
                    return;
            }
        }
        cPh = C27738CPh.PEOPLE;
        CPO.A01(cpo, mediaType, cPh, i);
    }

    public static void A0B(TaggingActivity taggingActivity) {
        if (A0H(taggingActivity, taggingActivity.A00)) {
            AnonymousClass0C1 r3 = taggingActivity.A03;
            String str = taggingActivity.A09;
            String str2 = ((MediaTaggingInfo) taggingActivity.A0A.get(taggingActivity.A00)).A05;
            boolean z = !A0G(taggingActivity);
            ArrayList arrayList = ((MediaTaggingInfo) taggingActivity.A0A.get(taggingActivity.A00)).A0A;
            int i = taggingActivity.A00;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_suggested_tags_view_tags", taggingActivity);
            Pair A003 = C160696tO.A00(arrayList);
            C160696tO.A03(r3, A002, str, str2, 0, z, ((Integer) A003.first).intValue(), ((Integer) A003.second).intValue(), Integer.valueOf(i), (String) null);
        }
    }

    public static void A0D(TaggingActivity taggingActivity, Product product) {
        C15890nh r3 = new C15890nh(taggingActivity.A03);
        r3.A09 = Constants.ONE;
        r3.A0E("commerce/products/%s/on_tag/", product.getId());
        r3.A06(AnonymousClass1N4.class, false);
        r3.A0A("merchant_id", product.A02.A02);
        r3.A0G = true;
        C12810hQ.A02(r3.A03());
    }

    public static void A0E(TaggingActivity taggingActivity, C27738CPh cPh, boolean z) {
        IgSegmentedTabLayout igSegmentedTabLayout = taggingActivity.A02;
        if (igSegmentedTabLayout != null) {
            taggingActivity.A07 = cPh;
            int i = 1;
            if (cPh == C27738CPh.PEOPLE) {
                i = 0;
            }
            igSegmentedTabLayout.setSelectedIndex(i);
            CPO cpo = taggingActivity.A0E;
            MediaType mediaType = ((MediaTaggingInfo) taggingActivity.A0A.get(taggingActivity.A00)).A03;
            C27738CPh cPh2 = taggingActivity.A07;
            int A002 = taggingActivity.A00();
            cpo.A03 = cPh2;
            CPO.A01(cpo, mediaType, cPh2, A002);
            if (cpo.A0D) {
                ViewStub viewStub = cpo.A08;
                int i2 = 8;
                if (cpo.A03 == C27738CPh.PRODUCT) {
                    i2 = 0;
                }
                viewStub.setVisibility(i2);
            }
            CPO.A00(cpo);
            taggingActivity.A08();
            CPX cpx = taggingActivity.A05;
            if (cpx != null) {
                cpx.A02.setEditingTagType(taggingActivity.A07);
            }
            CPP cpp = taggingActivity.A0F;
            if (cpp != null) {
                cpp.A00 = taggingActivity.A07;
                AnonymousClass0Z1.A00(cpp, -1751941621);
            }
            if (z) {
                CPV cpv = taggingActivity.A0H;
                switch (taggingActivity.A07.ordinal()) {
                    case 0:
                        cpv.A02.setImageResource(C0003R.C0004drawable.people_tagging_type_indicator_icon);
                        break;
                    case 1:
                        cpv.A02.setImageResource(C0003R.C0004drawable.product_tagging_type_indicator_icon);
                        break;
                    default:
                        throw new UnsupportedOperationException("Unsupported tag type");
                }
                cpv.A00.setVisibility(0);
                cpv.A01.setVisibility(8);
                AnonymousClass0ZA.A08(cpv.A04, cpv.A05);
                C476524w A0T = C476624x.A07(cpv.A02).A0S(CPV.A06).A0T(true);
                A0T.A0L(0.9f, 1.0f, -1.0f);
                A0T.A0M(0.9f, 1.0f, -1.0f);
                A0T.A0G(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                A0T.A09 = new C27739CPi(cpv);
                A0T.A0O();
            }
        }
    }

    private boolean A0F() {
        if (((MediaTaggingInfo) this.A0A.get(this.A00)).A03 == MediaType.VIDEO) {
            return true;
        }
        return false;
    }

    public static boolean A0G(TaggingActivity taggingActivity) {
        if (taggingActivity.A0A.size() != 1) {
            return false;
        }
        return true;
    }

    public static boolean A0H(TaggingActivity taggingActivity, int i) {
        if (((MediaTaggingInfo) taggingActivity.A0A.get(i)).A0A == null || ((MediaTaggingInfo) taggingActivity.A0A.get(i)).A0A.isEmpty()) {
            return false;
        }
        return true;
    }

    public final String AJQ() {
        return ((MediaTaggingInfo) this.A0A.get(this.A00)).A05;
    }

    public final List ARl() {
        CPR cpr = this.A06;
        return (List) cpr.A02.get(AJQ());
    }

    public final List ASs() {
        CPR cpr = this.A06;
        return (List) cpr.A03.get(AJQ());
    }

    public final int AXF() {
        if (A0H(this, this.A00)) {
            return ((MediaTaggingInfo) this.A0A.get(this.A00)).A0A.size();
        }
        return 0;
    }

    public final String AXi() {
        return ((MediaTaggingInfo) this.A0A.get(this.A00)).A06;
    }

    public final String AXj() {
        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) this.A0A.get(this.A00);
        if (AnonymousClass0OX.A00(mediaTaggingInfo.A08)) {
            return null;
        }
        return ((ProductMention) mediaTaggingInfo.A08.get(0)).A02.A02.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2 != p000X.C27738CPh.A03) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r2 != p000X.C27738CPh.A02) goto L_0x001d;
     */
    public final boolean Ac7(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int A042 = A04(C27738CPh.PEOPLE);
        int A043 = A04(C27738CPh.PRODUCT);
        C27738CPh cPh = this.A07;
        if (!C27750CPu.A00(i, i2, cPh)) {
            if (A042 >= 35) {
                z = true;
            }
            z = false;
            if (!z) {
                if (A043 >= 20) {
                    z3 = true;
                }
                z3 = false;
                z2 = false;
            }
            z2 = true;
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean Aoz(TagsInteractiveLayout tagsInteractiveLayout, ArrayList arrayList, ArrayList arrayList2, MediaSuggestedProductTag mediaSuggestedProductTag) {
        ArrayList arrayList3;
        TagsInteractiveLayout tagsInteractiveLayout2 = tagsInteractiveLayout;
        switch (this.A07.ordinal()) {
            case 0:
                C129335gB.A00(this, this.A03, arrayList, tagsInteractiveLayout2);
                return true;
            case 1:
                C182887rW.A01().A0Y = true;
                this.A0I.put(AJQ(), tagsInteractiveLayout2);
                A06();
                C17510qM r3 = C17510qM.A00;
                AnonymousClass0C1 r5 = this.A03;
                String moduleName = getModuleName();
                ArrayList AFi = AFi();
                String AXi = AXi();
                String AXj = AXj();
                String AJQ = AJQ();
                MediaSuggestedProductTag mediaSuggestedProductTag2 = mediaSuggestedProductTag;
                if (mediaSuggestedProductTag == null) {
                    arrayList3 = new ArrayList();
                } else {
                    arrayList3 = new ArrayList();
                    C239512q A0I2 = ImmutableList.A09(mediaSuggestedProductTag2.A01).iterator();
                    while (A0I2.hasNext()) {
                        Product product = ((MediaSuggestedProductTagProductItemContainer) A0I2.next()).A01;
                        if (product != null) {
                            arrayList3.add(product.getId());
                        }
                    }
                }
                r3.A1C(this, r5, moduleName, "product_tags", true, arrayList2, AFi, AXi, AXj, AJQ, arrayList3);
                return true;
            default:
                return false;
        }
    }

    public final void B29() {
        this.A0E.A07.setVisibility(8);
    }

    public final void B7F() {
        this.A0E.A07.setVisibility(0);
    }

    public final void BIE() {
        CPX cpx;
        if (A0H(this, this.A00)) {
            AnonymousClass0C1 r4 = this.A03;
            String str = this.A09;
            String str2 = ((MediaTaggingInfo) this.A0A.get(this.A00)).A05;
            boolean z = !A0G(this);
            ArrayList arrayList = ((MediaTaggingInfo) this.A0A.get(this.A00)).A0A;
            int i = this.A00;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_suggested_tags_remove_all_tags", this);
            Pair A003 = C160696tO.A00(arrayList);
            C160696tO.A03(r4, A002, str, str2, 0, z, ((Integer) A003.first).intValue(), ((Integer) A003.second).intValue(), Integer.valueOf(i), (String) null);
            if (A0G(this)) {
                cpx = this.A05;
            } else {
                cpx = (CPX) this.A01.A0B(this.A00).getTag();
            }
            if (cpx != null) {
                cpx.A01(((MediaTaggingInfo) this.A0A.get(this.A00)).A0A);
            }
        }
    }

    public final void BJ4() {
        this.A0E.A07.setVisibility(8);
    }

    public final void BJM() {
        this.A0E.A07.setVisibility(8);
    }

    public final void BPy(MediaSuggestedProductTag mediaSuggestedProductTag, Product product, boolean z) {
        String str;
        MediaSuggestedProductTag mediaSuggestedProductTag2 = mediaSuggestedProductTag;
        C239512q A0I2 = ImmutableList.A09(mediaSuggestedProductTag2.A01).iterator();
        String str2 = null;
        Integer num = null;
        Float f = null;
        while (A0I2.hasNext()) {
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer = (MediaSuggestedProductTagProductItemContainer) A0I2.next();
            if (mediaSuggestedProductTagProductItemContainer.A01.getId().equals(product.getId())) {
                num = Integer.valueOf(ImmutableList.A09(mediaSuggestedProductTag2.A01).indexOf(mediaSuggestedProductTagProductItemContainer));
                f = Float.valueOf(mediaSuggestedProductTagProductItemContainer.A00);
            }
        }
        AnonymousClass0C1 r4 = this.A03;
        String str3 = this.A09;
        String str4 = ((MediaTaggingInfo) this.A0A.get(this.A00)).A05;
        boolean z2 = !A0G(this);
        int i = this.A00;
        boolean z3 = mediaSuggestedProductTag2.A02;
        if (!z3 || !z) {
            str = "add";
        } else {
            str = "change";
        }
        boolean z4 = z3;
        if (z3) {
            str2 = mediaSuggestedProductTag2.A02().getId();
        }
        C160696tO.A04(r4, this, str3, str4, z2, i, str, z4, str2, product.getId(), num, f, mediaSuggestedProductTag2.A00());
    }

    public final void BQr() {
        String str;
        IgSegmentedTabLayout igSegmentedTabLayout = this.A02;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setVisibility(0);
            C06220Of.A0I(this.A08, getResources().getDimensionPixelSize(C0003R.dimen.tagging_tab_bar_height));
        }
        A09();
        CPP cpp = this.A0F;
        if (cpp != null) {
            AnonymousClass0Z1.A00(cpp, -955094332);
        }
        this.A0E.A02(true, A00());
        A08();
        if (this.A07 == C27738CPh.PEOPLE) {
            str = "PeopleTagSearch";
        } else {
            str = null;
        }
        A05().A16(str, 1);
    }

    public final void BQs(PointF pointF) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A02;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setVisibility(8);
            C06220Of.A0I(this.A08, 0);
        }
        CPV cpv = this.A0H;
        cpv.A00.setVisibility(8);
        cpv.A01.setVisibility(0);
        C476624x.A07(cpv.A02).A0N();
        AnonymousClass0ZA.A08(cpv.A04, cpv.A05);
        this.A0E.A02(false, A00());
        PhotoScrollView photoScrollView = this.A08;
        if (photoScrollView != null) {
            photoScrollView.setScrollTarget(pointF.y);
        }
    }

    public final void BQt(PointF pointF) {
        PhotoScrollView photoScrollView = this.A08;
        if (photoScrollView != null) {
            photoScrollView.setScrollTarget(pointF.y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r2 != p000X.C27738CPh.A02) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        if (r2 != r3) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006d, code lost:
        if (r2 != r3) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007d, code lost:
        if (r2 != p000X.C27738CPh.A02) goto L_0x007f;
     */
    public final void Boc(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int A042 = A04(C27738CPh.PEOPLE);
        C27738CPh cPh = C27738CPh.PRODUCT;
        int A043 = A04(cPh);
        boolean A0F2 = A0F();
        C27738CPh cPh2 = this.A07;
        if (C27750CPu.A00(i, i2, cPh2)) {
            boolean z6 = false;
            if ((i > 0 || cPh2 == C27738CPh.PEOPLE) && (i2 > 0 || cPh2 == cPh)) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i4 = i + i2;
            if (z3 && i4 >= 5) {
                z6 = true;
            }
            if (z6) {
                i3 = C0003R.string.product_tagging_combined_tagging_limit_reached_photo;
                if (A0F2) {
                    i3 = C0003R.string.product_tagging_combined_tagging_limit_reached_video;
                }
            } else {
                if (i >= 20) {
                    z4 = true;
                }
                z4 = false;
                if (z4) {
                    i3 = C0003R.string.people_tagging_add_people_limit_reached;
                    if (A0F2) {
                        i3 = C0003R.string.video_tagging_add_people_limit_reached;
                    }
                } else {
                    if (i2 >= 5) {
                        z5 = true;
                    }
                    z5 = false;
                    if (z5) {
                        i3 = C0003R.string.product_tagging_add_product_limit_reached_photo;
                        if (A0F2) {
                            i3 = C0003R.string.product_tagging_add_product_limit_reached_video;
                        }
                    } else {
                        throw new UnsupportedOperationException("Current Media limit hasn't been reached");
                    }
                }
            }
        } else {
            if (A043 >= 20) {
                z = true;
            }
            z = false;
            if (z) {
                i3 = C0003R.string.product_tagging_carousel_add_product_limit_reached;
            } else {
                if (A042 >= 35) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    i3 = C0003R.string.post_tagging_carousel_add_people_limit_reached;
                } else {
                    throw new UnsupportedOperationException("Carousel limit hasn't been reached");
                }
            }
        }
        C53642Tq.A00(this, i3, 0).show();
    }

    public final String getModuleName() {
        if (this.A07 == C27738CPh.PEOPLE) {
            return "people_tagging";
        }
        return "product_tagging";
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        int i;
        int i2;
        boolean z;
        int A002 = AnonymousClass0Z0.A00(1748782287);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C15330mi.A01(this);
        AnonymousClass1X4.A02(this, AnonymousClass1BA.A01(this, C0003R.attr.statusBarBackgroundColor));
        this.A03 = AnonymousClass0J1.A06(getIntent().getExtras());
        boolean booleanExtra = getIntent().getBooleanExtra(AnonymousClass40t.$const$string(208), false);
        C27738CPh cPh = (C27738CPh) getIntent().getSerializableExtra("tag_type");
        this.A07 = cPh;
        AnonymousClass0a4.A06(cPh);
        String $const$string = AnonymousClass40t.$const$string(28);
        if (bundle != null) {
            parcelableArrayListExtra = bundle2.getParcelableArrayList($const$string);
        } else {
            parcelableArrayListExtra = getIntent().getParcelableArrayListExtra($const$string);
        }
        this.A0A = parcelableArrayListExtra;
        setContentView((int) C0003R.layout.activity_tagging);
        ImageView imageView = (ImageView) findViewById(C0003R.C0005id.action_bar_button_cancel);
        imageView.setBackground(new AnonymousClass1X5(getTheme(), Constants.ZERO));
        imageView.setOnClickListener(new C27532CGw(this));
        if (booleanExtra) {
            i = C0003R.string.product_tagging_edit_tags;
        } else {
            C27738CPh cPh2 = this.A07;
            C27738CPh cPh3 = C27738CPh.PEOPLE;
            i = C0003R.string.product_tagging_add_products;
            if (cPh2 == cPh3) {
                i = C0003R.string.people_tagging_add_people;
            }
        }
        ((TextView) findViewById(C0003R.C0005id.action_bar_textview_title)).setText(i);
        ActionButton actionButton = (ActionButton) findViewById(C0003R.C0005id.action_bar_button_done);
        actionButton.setVisibility(0);
        actionButton.setButtonResource(C0003R.C0004drawable.check);
        actionButton.setColorFilter(C26771Ff.A00(C019000b.A00(this, C0003R.color.igds_primary_button)));
        actionButton.setContentDescription(getString(C0003R.string.done));
        actionButton.setOnClickListener(new C110714pj(this));
        this.A06 = new CPR(this.A03, this);
        View findViewById = findViewById(C0003R.C0005id.tags_help_and_education_container);
        int A003 = A00();
        boolean z2 = !A0G(this);
        AnonymousClass0C1 r1 = this.A03;
        View view = findViewById;
        this.A0E = new CPO(this, this, this, A003, findViewById, (TextView) findViewById(C0003R.C0005id.tags_help_text), (TextView) findViewById(C0003R.C0005id.tags_secondary_help_text), (TextView) findViewById(C0003R.C0005id.tags_tertiary_help_text), (TextView) findViewById(C0003R.C0005id.suggested_tags_remove_text), (ViewStub) findViewById(C0003R.C0005id.tap_to_tag_icon_view_stub), (ViewStub) findViewById(C0003R.C0005id.product_tags_learn_more_stub), (ViewStub) findViewById(C0003R.C0005id.fb_product_cross_tagging_info), z2, r1.A06.A0T(), this.A06, r1, this.A07);
        if (A0G(this)) {
            i2 = 0;
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) this.A0A.get(0);
            if (mediaTaggingInfo.A03 == MediaType.PHOTO) {
                CPX cpx = new CPX(((ViewStub) findViewById(C0003R.C0005id.tag_photo_view_stub)).inflate());
                this.A05 = cpx;
                this.A0G = cpx;
                CPS.A00(cpx, this.A07, mediaTaggingInfo, this.A03, this, this);
                if (A0H(this, 0)) {
                    this.A09 = C181987pp.A01(this.A03).A01;
                    A0B(this);
                }
            } else {
                C27743CPn cPn = new C27743CPn(((ViewStub) findViewById(C0003R.C0005id.tag_video_view_stub)).inflate());
                this.A0G = cPn;
                cPn.A01.setUrl(mediaTaggingInfo.A02);
                cPn.A00.setAspectRatio(C160726tR.A00(mediaTaggingInfo));
                cPn.A00.setOnClickListener(new C27747CPr(this));
            }
            if (mediaTaggingInfo.A03 == MediaType.VIDEO) {
                ((ViewStub) findViewById(C0003R.C0005id.tagged_items_view_stub)).inflate();
                CPR cpr = this.A06;
                cpr.A02.put(mediaTaggingInfo.A05, mediaTaggingInfo.A07);
                CPR cpr2 = this.A06;
                cpr2.A03.put(mediaTaggingInfo.A05, mediaTaggingInfo.A09);
                this.A0E.A01 = (ListView) findViewById(C0003R.C0005id.tagged_items);
            }
        } else {
            i2 = 0;
            this.A00 = 0;
            String stringExtra = getIntent().getStringExtra(AnonymousClass40t.$const$string(27));
            int i3 = 0;
            while (true) {
                if (stringExtra == null || i3 >= this.A0A.size()) {
                    break;
                } else if (((MediaTaggingInfo) this.A0A.get(i3)).A05.equals(stringExtra)) {
                    this.A00 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.A09 = C181987pp.A01(this.A03).A01;
            ((ViewStub) findViewById(C0003R.C0005id.tag_carousel_view_stub)).inflate();
            ReboundViewPager reboundViewPager = (ReboundViewPager) findViewById(C0003R.C0005id.tag_carousel_viewpager);
            this.A01 = reboundViewPager;
            reboundViewPager.A0F((float) this.A00, false);
            this.A01.setPageSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            CPP cpp = new CPP(this.A0A, this.A03, this, this, this);
            this.A0F = cpp;
            cpp.A00 = this.A07;
            AnonymousClass0Z1.A00(cpp, -1751941621);
            this.A01.setAdapter((Adapter) this.A0F);
            A0B(this);
            this.A01.A0L(new C54332Ww(this));
            this.A01.A0I(this.A00);
            A0C(this);
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                MediaTaggingInfo mediaTaggingInfo2 = (MediaTaggingInfo) it.next();
                if (mediaTaggingInfo2.A03 == MediaType.VIDEO) {
                    if (findViewById(C0003R.C0005id.tagged_items) == null) {
                        ((ViewStub) findViewById(C0003R.C0005id.tagged_items_view_stub)).inflate();
                        this.A0E.A01 = (ListView) findViewById(C0003R.C0005id.tagged_items);
                    }
                    CPR cpr3 = this.A06;
                    cpr3.A02.put(mediaTaggingInfo2.A05, mediaTaggingInfo2.A07);
                    CPR cpr4 = this.A06;
                    cpr4.A03.put(mediaTaggingInfo2.A05, mediaTaggingInfo2.A09);
                }
            }
        }
        this.A0H = new CPV(findViewById(C0003R.C0005id.type_indicator_container), view, this);
        PhotoScrollView photoScrollView = (PhotoScrollView) findViewById(C0003R.C0005id.photo_scroll_view);
        this.A08 = photoScrollView;
        if (booleanExtra) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) ((ViewStub) findViewById(C0003R.C0005id.tagging_tab_bar_view_stub)).inflate();
            this.A02 = igSegmentedTabLayout;
            igSegmentedTabLayout.A01(new C220559et(C0003R.string.tag_title_people, (String) null, true), new C27742CPl(this));
            this.A02.A01(new C220559et(C0003R.string.tag_title_products, (String) null, true), new C27737CPg(this));
            A0E(this, this.A07, false);
        } else {
            C06220Of.A0I(photoScrollView, i2);
        }
        C161956vd A0N = C17510qM.A00.A0N(this, AnonymousClass1L8.A00(this), this.A03, new CPZ(this));
        this.A04 = A0N;
        A0N.A05(AXi());
        if (C12800hP.A0L(this.A03) && C52952Qw.A0E(this.A03)) {
            Iterator it2 = this.A0A.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((MediaTaggingInfo) it2.next()).A03 == MediaType.VIDEO) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z && ((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.FB_PRODUCT_CROSS_TAGGING, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                C17510qM r10 = C17510qM.A00;
                AnonymousClass1L8 A004 = AnonymousClass1L8.A00(this);
                AnonymousClass0C1 r12 = this.A03;
                this.A0D = r10.A0P(this, A004, r12, C12800hP.A01(r12, true).A01, this);
            }
        }
        AnonymousClass0Z0.A07(-1557604354, A002);
    }

    private void A07() {
        ArrayList arrayList;
        if (Ac7(ARl().size(), ASs().size())) {
            Boc(ARl().size(), ASs().size());
            return;
        }
        switch (this.A07.ordinal()) {
            case 0:
                CPO cpo = this.A0E;
                cpo.A05.setVisibility(8);
                ListView listView = cpo.A01;
                if (listView != null) {
                    listView.setVisibility(8);
                }
                IgSegmentedTabLayout igSegmentedTabLayout = this.A02;
                if (igSegmentedTabLayout != null) {
                    igSegmentedTabLayout.setVisibility(8);
                    C06220Of.A0I(this.A08, 0);
                }
                CPR cpr = this.A06;
                C129335gB.A00(this, cpr.A00, new ArrayList((Collection) cpr.A02.get(AJQ())), cpr);
                return;
            case 1:
                A06();
                this.A0J.add(AJQ());
                CPR cpr2 = this.A06;
                String AJQ = AJQ();
                C182887rW.A01().A0Y = true;
                C17510qM r2 = C17510qM.A00;
                AnonymousClass0C1 r4 = cpr2.A00;
                String moduleName = getModuleName();
                if (cpr2.A03.containsKey(AJQ)) {
                    arrayList = new ArrayList((Collection) cpr2.A03.get(AJQ));
                } else {
                    arrayList = null;
                }
                r2.A1C(this, r4, moduleName, "product_tags", true, arrayList, cpr2.A01.AFi(), cpr2.A01.AXi(), cpr2.A01.AXj(), AJQ, (ArrayList) null);
                return;
            default:
                return;
        }
    }

    public static void A0C(TaggingActivity taggingActivity) {
        if (taggingActivity.A0F()) {
            taggingActivity.A0G = (C27743CPn) taggingActivity.A01.A0B(taggingActivity.A00).getTag();
        }
    }

    public final C06590Pq A0L() {
        return this.A03;
    }

    public final ArrayList AFi() {
        if (A0G(this)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((MediaTaggingInfo) it.next()).A09);
        }
        return arrayList;
    }

    public final boolean Ac8() {
        return Ac7(ARl().size(), ASs().size());
    }

    public final void Axf() {
        String str;
        A09();
        if (this.A07 == C27738CPh.PEOPLE) {
            str = "PeopleTagSearch";
        } else {
            str = null;
        }
        A05().A16(str, 1);
        IgSegmentedTabLayout igSegmentedTabLayout = this.A02;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setVisibility(0);
            C06220Of.A0I(this.A08, getResources().getDimensionPixelSize(C0003R.dimen.tagging_tab_bar_height));
        }
        A0A(this);
    }

    public final void B6X() {
        if (A0F()) {
            A07();
        }
    }

    public final void BQu() {
        A07();
    }

    public final void BQv() {
        A09();
        A0A(this);
    }

    public final void BVD() {
        A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (((com.instagram.tagging.activity.MediaTaggingInfo) r3.A0A.get(r3.A00)).A03 == com.instagram.model.mediatype.MediaType.PHOTO) goto L_0x0017;
     */
    public final void BtD() {
        boolean z;
        if (A00() != 0) {
            z = false;
        }
        z = true;
        this.A0E.A02(z, A00());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            boolean z = false;
            if (C27665CMj.A01(this.A03) != null) {
                z = true;
            }
            if (z) {
                A0E(this, C27738CPh.PRODUCT, true);
            }
        }
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-1208195512);
        super.onDestroy();
        this.A08 = null;
        this.A02 = null;
        CPX cpx = this.A05;
        if (cpx != null) {
            cpx.A00 = null;
            cpx.A01 = null;
            cpx.A02 = null;
        }
        C23300zv A003 = C23300zv.A00(this.A03);
        A003.A03(CNR.class, this.A0B);
        A003.A03(CNQ.class, this.A0C);
        AnonymousClass0Z0.A07(1055104380, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(-607699552);
        super.onResume();
        C26441Dh.A00(this.A03).A06(this);
        A0A(this);
        A08();
        AnonymousClass0Z0.A07(-1055938191, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList(AnonymousClass40t.$const$string(28), this.A0A);
    }
}
