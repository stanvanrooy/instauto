package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.reels.ProfileShopLink;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1no  reason: invalid class name and case insensitive filesystem */
public final class C39941no implements C249616t {
    public AttributedAREffect A00;
    public AnonymousClass9G2 A01;
    public Integer A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public String A07;
    public final AnonymousClass1NJ A08;
    public final C38031kc A09;
    public final AnonymousClass2Ay A0A;
    public final AnonymousClass9G0 A0B;
    public final AnonymousClass9G1 A0C;
    public final C13300iJ A0D;
    public final Integer A0E;
    public final String A0F;
    public final List A0G = new ArrayList();
    public final String A0H;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getId()});
    }

    public final float A00() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().AG9();
            case 1:
            case 7:
                return this.A08.A05();
            default:
                return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }

    public final int A02() {
        switch (this.A0E.intValue()) {
            case 1:
                return this.A08.A0A;
            case 4:
                C38031kc r1 = this.A09;
                if (r1 != null) {
                    return r1.A02;
                }
                return 0;
            default:
                return 0;
        }
    }

    public final long A03() {
        switch (this.A0E.intValue()) {
            case 0:
                AnonymousClass2Ay A0C2 = A0C();
                if (A0C2.AVw() == 0) {
                    return System.currentTimeMillis() / 1000;
                }
                return A0C2.AVw();
            case 1:
                AnonymousClass1NJ r0 = this.A08;
                if (r0 != null) {
                    return r0.A0k().longValue();
                }
                break;
            case 3:
            case 4:
                C38031kc r02 = this.A09;
                if (r02 != null) {
                    return r02.A05;
                }
                break;
        }
        return 0;
    }

    public final ImageUrl A04() {
        switch (this.A0E.intValue()) {
            case 0:
                String ANK = A0C().ANK();
                AnonymousClass0a4.A06(ANK);
                return C46361zc.A01(new File(ANK));
            case 1:
            case 7:
                return this.A08.A0F();
            default:
                return null;
        }
    }

    public final ImageUrl A05(int i) {
        switch (this.A0E.intValue()) {
            case 0:
                AnonymousClass2Ay A0C2 = A0C();
                if (A0C2.Abp()) {
                    String ANK = A0C2.ANK();
                    AnonymousClass0a4.A06(ANK);
                    return C46361zc.A01(new File(ANK));
                }
                break;
            case 1:
            case 7:
                if (this.A08.A1M()) {
                    return C46361zc.A00(this.A08.A0E);
                }
                return this.A08.A0G(i);
            case 3:
            case 4:
                C38031kc r0 = this.A09;
                if (r0 != null) {
                    return r0.A01();
                }
                break;
        }
        return null;
    }

    public final ImageUrl A06(Context context) {
        switch (this.A0E.intValue()) {
            case 0:
                AnonymousClass2Ay A0C2 = A0C();
                if (A0C2.Abp()) {
                    String ANK = A0C2.ANK();
                    AnonymousClass0a4.A06(ANK);
                    return C46361zc.A01(new File(ANK));
                }
                break;
            case 1:
            case 5:
            case 7:
                if (this.A08.A1M()) {
                    return C46361zc.A00(this.A08.A0E);
                }
                return this.A08.A0S(context);
            case 3:
            case 4:
                C38031kc r0 = this.A09;
                if (r0 != null) {
                    return r0.A01();
                }
                break;
        }
        return null;
    }

    public final C249616t A07() {
        Integer num = this.A0E;
        switch (num.intValue()) {
            case 0:
                return A0C();
            case 1:
                if (A0v()) {
                    return this.A0B;
                }
                break;
            case 3:
            case 4:
                C38031kc r2 = this.A09;
                if (r2 == null) {
                    return null;
                }
                C38041kd r1 = r2.A0a;
                if (r1.getId() != null) {
                    return r1;
                }
                r1.A00 = r2.A0P;
                return r1;
            case 5:
                return this.A0C;
            case 6:
                return this.A01;
            case 7:
                break;
            default:
                throw new UnsupportedOperationException(AnonymousClass000.A0E("This item does not represent an ImpressionItem. Item type: ", C25984Bdd.A00(num)));
        }
        return this.A08;
    }

    public final C43531uZ A08() {
        switch (this.A0E.intValue()) {
            case 0:
                List<C43531uZ> ATk = A0C().ATk();
                if (AnonymousClass0OX.A00(ATk)) {
                    return null;
                }
                for (C43531uZ r1 : ATk) {
                    if (r1.A00() != null) {
                        return r1;
                    }
                }
                return null;
            case 1:
            case 7:
                return this.A08.A0R();
            default:
                return null;
        }
    }

    public final AnonymousClass5NT A09() {
        if (this.A0E == Constants.ONE) {
            return this.A08.A0i;
        }
        return null;
    }

    public final C37171jE A0A() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().AGF();
            case 1:
                return this.A08.A0U();
            default:
                return C37171jE.DEFAULT;
        }
    }

    public final MediaType A0B() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().APx();
            case 1:
            case 7:
                return this.A08.APx();
            case 3:
                return MediaType.LIVE;
            case 4:
                return MediaType.LIVE_REPLAY;
            default:
                return null;
        }
    }

    public final AnonymousClass2Ay A0C() {
        AnonymousClass2Ay r0 = this.A0A;
        AnonymousClass0a4.A06(r0);
        return r0;
    }

    public final C62582nx A0D() {
        if (this.A0E.intValue() != 1) {
            return null;
        }
        return this.A08.A0W();
    }

    public final Merchant A0E() {
        List A0W = A0W(C34181eD.PRODUCT);
        if (A0W == null || A0W.isEmpty()) {
            return null;
        }
        return ((C34151eA) A0W.get(0)).A03().A02;
    }

    public final ProfileShopLink A0F() {
        if (this.A0E.intValue() != 1) {
            return null;
        }
        return this.A08.A0Z();
    }

    public final C1188558d A0G() {
        if (this.A0E.intValue() != 1) {
            return null;
        }
        return this.A08.A12;
    }

    public final C35981hF A0H() {
        if (this.A0E == Constants.ZERO) {
            return A0C().AUh();
        }
        return null;
    }

    public final C13300iJ A0I() {
        if (this.A0E.intValue() != 1) {
            return null;
        }
        return this.A08.A0b();
    }

    public final C37671k2 A0J(AnonymousClass0C1 r3) {
        switch (this.A0E.intValue()) {
            case 1:
            case 5:
            case 7:
                return this.A08.A0d();
            case 3:
            case 4:
                C38031kc r0 = this.A09;
                if (r0 != null) {
                    return r0.A02(r3);
                }
                return null;
            default:
                return null;
        }
    }

    public final Long A0K(AnonymousClass0C1 r4) {
        AnonymousClass1NJ A022;
        switch (this.A0E.intValue()) {
            case 0:
                if (A11() && (A022 = AnonymousClass1PZ.A00(r4).A02(A0C().AG8())) != null) {
                    return A022.A0k();
                }
            case 1:
                return this.A08.A1X;
        }
        return null;
    }

    public final String A0L() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().AUC();
            case 1:
            case 7:
                return this.A08.A23;
            default:
                return null;
        }
    }

    public final String A0M() {
        switch (this.A0E.intValue()) {
            case 1:
            case 7:
                return this.A08.A26;
            default:
                return null;
        }
    }

    public final String A0N() {
        if (this.A07 == null) {
            this.A07 = C06360Ot.formatString("%s_%s", this.A0H, this.A0F);
        }
        return this.A07;
    }

    public final String A0O(AnonymousClass0C1 r3) {
        if (this.A0E == Constants.ONE) {
            return C30671Ut.A02(r3, this.A08);
        }
        return null;
    }

    public final String A0P(AnonymousClass0C1 r3) {
        if (this.A0E != Constants.ONE || C30671Ut.A06(r3, this.A08) == null) {
            return null;
        }
        return C30671Ut.A06(r3, this.A08);
    }

    public final String A0Q(AnonymousClass0C1 r3) {
        if (this.A0E != Constants.ONE || C30671Ut.A08(r3, this.A08) == null) {
            return null;
        }
        return C30671Ut.A08(r3, this.A08);
    }

    public final String A0R(AnonymousClass0C1 r3) {
        if (this.A0E != Constants.ONE || C30671Ut.A09(r3, this.A08) == null) {
            return null;
        }
        return C30671Ut.A09(r3, this.A08);
    }

    public final List A0S() {
        if (this.A0E.intValue() != 1) {
            return new ArrayList();
        }
        AnonymousClass1NJ r1 = this.A08;
        if (r1.A2O == null) {
            r1.A2O = new ArrayList();
        }
        return r1.A2O;
    }

    public final List A0T() {
        if (this.A0E.intValue() != 1) {
            return null;
        }
        List list = this.A08.A2d;
        if (list != null) {
            return ImmutableList.A09(list);
        }
        return list;
    }

    public final List A0U() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().ATn();
            case 1:
            case 5:
                return this.A08.A15();
            default:
                return null;
        }
    }

    public final List A0V() {
        switch (this.A0E.intValue()) {
            case 1:
                AnonymousClass1NJ r1 = this.A08;
                if (r1.A36 == null) {
                    r1.A36 = new ArrayList();
                }
                return r1.A36;
            case 4:
                C38031kc r0 = this.A09;
                if (r0 != null) {
                    return r0.A0U;
                }
                break;
        }
        return new ArrayList();
    }

    public final List A0W(C34181eD r2) {
        switch (this.A0E.intValue()) {
            case 0:
                return C106644iq.A03(A0C().ATn(), r2);
            case 1:
                return this.A08.A18(r2);
            default:
                return null;
        }
    }

    public final void A0X(List list, String str) {
        switch (this.A0E.intValue()) {
            case 1:
                AnonymousClass1NJ r4 = this.A08;
                if (r4.A36 != null) {
                    r4.A3l.clear();
                    for (int i = 0; i < r4.A36.size(); i++) {
                        r4.A3l.add(((C13300iJ) r4.A36.get(i)).getId());
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C13300iJ r2 = (C13300iJ) list.get(i2);
                        if (!r4.A3l.contains(r2.getId())) {
                            r4.A36.add(r2);
                        }
                    }
                } else {
                    r4.A36 = list;
                }
                r4.A2C = str;
                return;
            case 4:
                C38031kc r42 = this.A09;
                if (r42 != null) {
                    if (r42.A0U != null) {
                        r42.A0b.clear();
                        for (int i3 = 0; i3 < r42.A0U.size(); i3++) {
                            r42.A0b.add(((C13300iJ) r42.A0U.get(i3)).getId());
                        }
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            C13300iJ r22 = (C13300iJ) list.get(i4);
                            if (!r42.A0b.contains(r22.getId())) {
                                r42.A0U.add(r22);
                            }
                        }
                    } else {
                        r42.A0U = list;
                    }
                    r42.A0R = str;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean A0Y() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().A9d();
            case 1:
                Boolean bool = this.A08.A1D;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            default:
                return false;
        }
    }

    public final boolean A0a() {
        if (this.A0E != Constants.ONE || !this.A08.A1H()) {
            return false;
        }
        return true;
    }

    public final boolean A0b() {
        String str;
        switch (this.A0E.intValue()) {
            case 0:
                List ATk = A0C().ATk();
                if (AnonymousClass0OX.A00(ATk)) {
                    str = null;
                    break;
                } else {
                    str = ((C43531uZ) ATk.get(0)).A01();
                    break;
                }
            case 1:
                str = this.A08.A0p();
                break;
            default:
                return false;
        }
        return !TextUtils.isEmpty(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r2 = r3.A08;
     */
    public final boolean A0d() {
        AnonymousClass1NJ r2;
        List list;
        if (this.A0E.intValue() == 1 && (list = r2.A2g) != null && !list.isEmpty()) {
            return ((C43531uZ) r2.A2g.get(0)).A0A;
        }
        return false;
    }

    public final boolean A0e() {
        List list;
        switch (this.A0E.intValue()) {
            case 0:
                List ATk = A0C().ATk();
                if (AnonymousClass0OX.A00(ATk)) {
                    list = null;
                    break;
                } else {
                    list = ((C43531uZ) ATk.get(0)).A09;
                    break;
                }
            case 1:
                list = this.A08.A16();
                break;
            default:
                return false;
        }
        return !C55062a0.A04(list);
    }

    public final boolean A0f() {
        switch (this.A0E.intValue()) {
            case 0:
                return true;
            case 1:
            case 7:
                return this.A08.A1N();
            default:
                return false;
        }
    }

    public final boolean A0g() {
        if (this.A0E.intValue() != 1 || this.A08.A0Y() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0h() {
        if (this.A0E.intValue() != 1 || this.A08.A0a() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0i() {
        if (this.A0E.intValue() != 1 || this.A08.A0Z() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0j() {
        if (this.A0E != Constants.ONE || !this.A08.A1R()) {
            return false;
        }
        return true;
    }

    public final boolean A0k() {
        if (this.A0E != Constants.A12 || this.A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0l() {
        if (this.A0E == Constants.ONE && AnonymousClass29e.CAPTION == this.A08.A0u) {
            return true;
        }
        return false;
    }

    public final boolean A0n() {
        if (this.A0E == Constants.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A0o() {
        if (this.A0E == Constants.A0Y) {
            return true;
        }
        return false;
    }

    public final boolean A0p() {
        if (this.A0E.intValue() != 1) {
            return false;
        }
        return this.A08.A1Y();
    }

    public final boolean A0r() {
        if (this.A04) {
            return true;
        }
        AnonymousClass1NJ r0 = this.A08;
        if (r0 == null) {
            return false;
        }
        Long l = r0.A1Y;
        boolean z = false;
        if (l == null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean A0s() {
        if (this.A0E == Constants.A0C) {
            return true;
        }
        return false;
    }

    public final boolean A0t() {
        if (this.A0E != Constants.ONE || this.A08 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0u() {
        if (this.A0E == Constants.A0j || A0v() || A0w()) {
            return true;
        }
        return false;
    }

    public final boolean A0v() {
        if (this.A0B != null) {
            return true;
        }
        return false;
    }

    public final boolean A0w() {
        if (this.A0E == Constants.A0u) {
            return true;
        }
        return false;
    }

    public final boolean A0x() {
        if (this.A0E == Constants.A0j || A0v() || A0w()) {
            return true;
        }
        return false;
    }

    public final boolean A0y() {
        if (this.A0E != Constants.ZERO || this.A0A == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0 == false) goto L_0x0025;
     */
    public final boolean A0z() {
        C38031kc r0;
        boolean z;
        switch (this.A0E.intValue()) {
            case 3:
            case 4:
                if (A14() && (r0 = this.A09) != null) {
                    C38051ke r1 = r0.A08;
                    if (r1 != C38051ke.POST_LIVE) {
                        boolean A002 = r1.A00();
                        z = false;
                        break;
                    }
                    z = true;
                    if (!z) {
                        return false;
                    }
                    return true;
                }
                return false;
            default:
                return A14();
        }
    }

    public final boolean A11() {
        switch (this.A0E.intValue()) {
            case 0:
                if (A0C().AG8() != null) {
                    return true;
                }
                break;
            case 1:
                if (this.A08.A1X != null) {
                    return true;
                }
                break;
        }
        return false;
    }

    public final boolean A13() {
        AnonymousClass0a4.A07(this.A01, "SU unit is missing suggested users model");
        return this.A01.A08;
    }

    public final boolean A14() {
        switch (this.A0E.intValue()) {
            case 0:
                return A0C().AiO();
            case 1:
            case 7:
                return this.A08.AiO();
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39941no) || !AnonymousClass17M.A00(((C39941no) obj).getId(), getId())) {
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.A0H;
    }

    public final int A01() {
        if (A0B() != null) {
            return A0B().A00;
        }
        return -1;
    }

    public final boolean A0Z() {
        String str;
        C43531uZ A082 = A08();
        if (A082 != null) {
            str = A082.A00();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || A0k()) {
            return false;
        }
        return true;
    }

    public final boolean A0c() {
        if (A0s()) {
            return false;
        }
        return true;
    }

    public final boolean A0m() {
        if (!A0y() || !A0C().AeN()) {
            return false;
        }
        return true;
    }

    public final boolean A0q() {
        if (A09() != null) {
            return true;
        }
        return false;
    }

    public final boolean A10() {
        if (A14() || this.A0E != Constants.ONE) {
            return false;
        }
        return true;
    }

    public final boolean A12() {
        if (!A0q() || !A09().A04) {
            return true;
        }
        return false;
    }

    public final boolean A15(C34181eD r3) {
        List A0W = A0W(r3);
        if (A0W == null || A0W.isEmpty()) {
            return false;
        }
        return true;
    }

    public final String AWS(AnonymousClass0C1 r2) {
        return C30671Ut.A01(r2, A07());
    }

    public final boolean Afk() {
        if (A07() == null || !A07().Afk()) {
            return false;
        }
        return true;
    }

    public final boolean Agp() {
        if (A07() == null || !A07().Agp()) {
            return false;
        }
        return true;
    }

    public final boolean Aho() {
        if (!A0t() || !this.A08.Aho()) {
            return false;
        }
        return true;
    }

    public C39941no(C13300iJ r3, String str, AnonymousClass1NJ r5, Integer num) {
        this.A0F = str;
        this.A08 = r5;
        this.A0A = null;
        this.A0E = num;
        this.A0H = r5.getId();
        this.A0D = r3;
        this.A09 = null;
        this.A0C = null;
        this.A0B = null;
        this.A01 = null;
        if (!r5.A15().isEmpty()) {
            for (C34151eA r0 : r5.A15()) {
                r0.A0l = str;
            }
        }
    }

    public C39941no(C13300iJ r3, String str, Integer num, AnonymousClass9G1 r6, AnonymousClass9G0 r7, AnonymousClass9G2 r8, AnonymousClass1NJ r9) {
        this.A0F = str;
        this.A0A = null;
        this.A09 = null;
        switch (num.intValue()) {
            case 0:
                this.A0H = r6.getId();
                this.A0E = Constants.A0j;
                this.A0C = r6;
                this.A0B = null;
                this.A01 = null;
                this.A08 = r9;
                this.A0D = null;
                return;
            case 1:
                this.A0H = r7.getId();
                this.A0E = Constants.ONE;
                this.A0B = r7;
                this.A01 = null;
                this.A0C = null;
                this.A08 = r9;
                this.A0D = r3;
                return;
            case 2:
                this.A0H = r8.getId();
                this.A0E = Constants.A0u;
                this.A0B = null;
                this.A01 = r8;
                this.A0C = null;
                this.A08 = null;
                this.A0D = null;
                return;
            default:
                this.A0C = null;
                this.A0B = null;
                this.A01 = null;
                this.A08 = null;
                this.A0D = null;
                throw new IllegalArgumentException("Unsupported netego type");
        }
    }

    public C39941no(String str, C38031kc r3, boolean z) {
        Integer num;
        this.A0F = str;
        this.A09 = r3;
        this.A0H = r3.A0I;
        this.A0D = r3.A0C;
        if (z) {
            num = Constants.A0Y;
        } else {
            num = Constants.A0N;
        }
        this.A0E = num;
        this.A08 = null;
        this.A0A = null;
        this.A0C = null;
        this.A0B = null;
        this.A01 = null;
    }

    public C39941no(String str, AnonymousClass2Ay r4, C13300iJ r5) {
        this.A0F = str;
        this.A0A = r4;
        this.A08 = null;
        this.A0E = Constants.ZERO;
        this.A0H = r4.AZV();
        this.A0D = r5;
        this.A09 = null;
        this.A0C = null;
        this.A0B = null;
        this.A01 = null;
    }

    public C39941no(String str, String str2, C13300iJ r4, Integer num) {
        this.A0F = str;
        this.A08 = null;
        this.A0A = null;
        this.A09 = null;
        this.A0E = num;
        this.A0H = str2;
        this.A0D = r4;
        this.A0C = null;
        this.A0B = null;
        this.A01 = null;
    }
}
