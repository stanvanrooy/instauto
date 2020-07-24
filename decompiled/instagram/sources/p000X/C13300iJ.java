package p000X;

import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0iJ  reason: invalid class name and case insensitive filesystem */
public final class C13300iJ implements C13310iK, C13320iL, C13330iM {
    public static AnonymousClass1PN A37;
    public int A00;
    public int A01;
    public ImageUrl A02;
    public C482527g A03;
    public C38071kg A04;
    public ExtendedImageUrl A05;
    public C44841wq A06;
    public C13340iN A07;
    public C13380iR A08;
    public C468621e A09;
    public C58422fu A0A;
    public C481927a A0B;
    public C13410iU A0C;
    public C106954jM A0D;
    public C58892gh A0E;
    public C13280iH A0F;
    public AnonymousClass2A5 A0G;
    public C57942f3 A0H;
    public C57942f3 A0I;
    public C57942f3 A0J;
    public C30756DjB A0K;
    public C468521d A0L;
    public C13390iS A0M;
    public C13390iS A0N;
    public C13260iE A0O;
    public C30755DjA A0P;
    public Boolean A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T;
    public Boolean A0U;
    public Boolean A0V;
    public Boolean A0W;
    public Boolean A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public Boolean A0b;
    public Boolean A0c;
    public Boolean A0d;
    public Boolean A0e;
    public Boolean A0f;
    public Boolean A0g;
    public Boolean A0h;
    public Boolean A0i;
    public Boolean A0j;
    public Boolean A0k;
    public Boolean A0l;
    public Boolean A0m;
    public Boolean A0n;
    public Boolean A0o;
    public Boolean A0p;
    public Boolean A0q;
    public Boolean A0r;
    public Boolean A0s;
    public Boolean A0t;
    public Boolean A0u;
    public Boolean A0v;
    public Boolean A0w;
    public Boolean A0x;
    public Boolean A0y;
    public Boolean A0z;
    public Boolean A10;
    public Boolean A11;
    public Boolean A12;
    public Boolean A13;
    public Boolean A14;
    public Boolean A15;
    public Boolean A16;
    public Boolean A17;
    public Boolean A18;
    public Boolean A19;
    public Boolean A1A;
    public Boolean A1B;
    public Boolean A1C;
    public Boolean A1D;
    public Boolean A1E;
    public Boolean A1F;
    public Boolean A1G;
    public Boolean A1H;
    public Boolean A1I;
    public Boolean A1J;
    public Boolean A1K;
    public Boolean A1L;
    public Boolean A1M;
    public Boolean A1N;
    public Boolean A1O;
    public Boolean A1P;
    public Boolean A1Q;
    public Boolean A1R;
    public Boolean A1S;
    public Boolean A1T;
    public Boolean A1U;
    public Boolean A1V;
    public Boolean A1W;
    public Boolean A1X;
    public Float A1Y;
    public Float A1Z;
    public Integer A1a;
    public Integer A1b;
    public Integer A1c;
    public Integer A1d;
    public Integer A1e;
    public Integer A1f;
    public Integer A1g;
    public Integer A1h;
    public Integer A1i;
    public Integer A1j;
    public Integer A1k;
    public Integer A1l;
    public Integer A1m;
    public Integer A1n;
    public Integer A1o;
    public Integer A1p;
    public Integer A1q;
    public Integer A1r;
    public Integer A1s;
    public Integer A1t;
    public Integer A1u;
    public Long A1v;
    public Long A1w;
    public Long A1x;
    public Long A1y;
    public String A1z;
    public String A20;
    public String A21;
    public String A22;
    public String A23;
    public String A24;
    public String A25;
    public String A26;
    public String A27;
    public String A28;
    public String A29;
    public String A2A;
    public String A2B;
    public String A2C;
    public String A2D;
    public String A2E;
    public String A2F;
    public String A2G;
    public String A2H;
    public String A2I;
    public String A2J;
    public String A2K;
    public String A2L;
    public String A2M;
    public String A2N;
    public String A2O;
    public String A2P;
    public String A2Q;
    public String A2R;
    public String A2S;
    public String A2T;
    public String A2U;
    public String A2V;
    public String A2W;
    public String A2X;
    public String A2Y;
    public String A2Z;
    public String A2a;
    public String A2b;
    public String A2c;
    public String A2d;
    public String A2e;
    public String A2f;
    public String A2g;
    public String A2h;
    public String A2i;
    public String A2j;
    public String A2k;
    public String A2l;
    public String A2m;
    public HashMap A2n;
    public List A2o;
    public List A2p;
    public List A2q;
    public List A2r;
    public List A2s;
    public Map A2t;
    public boolean A2u;
    public boolean A2v;
    public boolean A2w;
    public boolean A2x = true;
    public boolean A2y;
    public boolean A2z;
    public boolean A30;
    public boolean A31;
    public boolean A32;
    public boolean A33;
    public boolean A34;
    public boolean A35;
    public boolean A36;

    public static C13300iJ A00(C13080hr r1) {
        return A01(r1, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                String str = this.A2Q;
                String str2 = ((C13300iJ) obj).A2Q;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A04() {
        Integer num = this.A1t;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final ImmutableMap A05() {
        Map map = this.A2t;
        if (map != null) {
            return ImmutableMap.A01(map);
        }
        return null;
    }

    public final C38071kg A06() {
        C38071kg r0 = this.A04;
        if (r0 == null) {
            return C38071kg.DEFAULT;
        }
        return r0;
    }

    public final C13280iH A07() {
        C13280iH r0 = this.A0F;
        if (r0 == null) {
            return C13280iH.UNSET;
        }
        return r0;
    }

    public final Boolean A08() {
        boolean z;
        Boolean bool = this.A12;
        if (bool == null || !bool.booleanValue() || (TextUtils.isEmpty(this.A2N) && TextUtils.isEmpty(this.A2J) && TextUtils.isEmpty(this.A2H))) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Integer A09() {
        if (TextUtils.isEmpty(this.A2A)) {
            return Constants.ONE;
        }
        try {
            String str = this.A2A;
            if (str.equals(NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED)) {
                return Constants.ZERO;
            }
            if (str.equals("CALL")) {
                return Constants.ONE;
            }
            if (str.equals("TEXT")) {
                return Constants.A0C;
            }
            throw new IllegalArgumentException(str);
        } catch (IllegalArgumentException unused) {
            return Constants.ZERO;
        }
    }

    public final String A0A() {
        C481927a r0 = this.A0B;
        if (r0 != null) {
            return r0.A01;
        }
        return this.A26;
    }

    public final String A0B() {
        String str = this.A2P;
        if (str == null || str.equals("")) {
            return AZn();
        }
        return str;
    }

    public final List A0C() {
        String A0E2;
        String A0E3;
        List list = this.A2r;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C482327e r0 : this.A2r) {
            String str = r0.A03;
            if (str == null) {
                A0E2 = null;
            } else {
                A0E2 = AnonymousClass000.A0E("@", str);
            }
            if (A0E2 != null) {
                if (str == null) {
                    A0E3 = null;
                } else {
                    A0E3 = AnonymousClass000.A0E("@", str);
                }
                arrayList.add(A0E3);
            }
        }
        return arrayList;
    }

    public final void A0D() {
        int valueOf;
        Integer num = this.A1e;
        if (num == null) {
            valueOf = 1;
        } else {
            valueOf = Integer.valueOf(num.intValue() + 1);
        }
        this.A1e = valueOf;
    }

    public final void A0E() {
        if (this.A1k == null) {
            this.A1k = 0;
        }
        this.A1k = Integer.valueOf(this.A1k.intValue() + 1);
    }

    public final void A0F(C06590Pq r4) {
        String str = this.A2m;
        if (str == null || str.isEmpty()) {
            AnonymousClass0QD.A03("username_missing_during_update", AnonymousClass000.A0J("Username for user ", this.A2Q, " was null when broadcasting an update."), 1);
        }
        C23300zv.A00(r4).BXT(new C33231ca(this));
    }

    public final void A0G(Boolean bool) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A02 = bool;
        this.A0C = new C13410iU(A002);
    }

    public final void A0H(Boolean bool) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A06 = bool;
        this.A0C = new C13410iU(A002);
    }

    public final void A0I(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A00 = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
        if (z) {
            this.A0M = C13390iS.FollowStatusNotFollowing;
        }
    }

    public final void A0J(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A01 = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
    }

    public final void A0K(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A04 = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
    }

    public final void A0L(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A05 = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
    }

    public final void A0M(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A07 = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
    }

    public final void A0N(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A08 = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
    }

    public final void A0O(boolean z) {
        C13400iT A002 = C13400iT.A00(this.A0C);
        A002.A0B = Boolean.valueOf(z);
        this.A0C = new C13410iU(A002);
    }

    public final boolean A0P() {
        Boolean bool = this.A0R;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0Q() {
        Boolean bool = this.A0W;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0R() {
        Boolean bool = this.A0a;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0S() {
        Boolean bool = this.A0g;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0T() {
        Boolean bool = this.A0h;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean A0V() {
        Boolean bool = this.A1O;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0W() {
        Boolean bool = this.A1P;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0X() {
        C30756DjB djB = this.A0K;
        if (djB == null || TextUtils.isEmpty(djB.A01) || TextUtils.isEmpty(this.A0K.A00)) {
            return false;
        }
        return true;
    }

    public final boolean A0Y() {
        Integer num = this.A1e;
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A0Z() {
        Boolean bool = this.A0k;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0a() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A04) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0b() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A05) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0c() {
        Boolean bool = this.A0n;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0d() {
        Boolean bool = this.A0y;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean A0e() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A00) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0f() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A01) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0g() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A07) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0h() {
        Boolean bool = this.A15;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0i() {
        Boolean bool = this.A16;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0j() {
        Boolean bool = this.A17;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0k() {
        Boolean bool = this.A18;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0l() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A02) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0m() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A06) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0n() {
        Boolean bool = this.A1C;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0o() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if ((r0 == null || (bool = r0.A08) == null || !bool.booleanValue()) && !A0e()) {
            return false;
        }
        return true;
    }

    public final boolean A0p() {
        Integer num = this.A1b;
        if (num == Constants.A0C || num == Constants.A0N || AeV()) {
            return true;
        }
        return false;
    }

    public final boolean A0q() {
        Integer num = this.A1b;
        if (num == Constants.A0C || num == Constants.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A0r() {
        Boolean bool = this.A1J;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0s() {
        Boolean bool = this.A1L;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean A0t() {
        Boolean bool = this.A1S;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final String AMN() {
        return this.A2P;
    }

    public final int ANw() {
        return this.A01;
    }

    public final ImageUrl ASv() {
        return this.A02;
    }

    public final String AZn() {
        return this.A2m;
    }

    public final boolean AeV() {
        Boolean bool = this.A10;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean AhI() {
        Boolean bool;
        C13410iU r0 = this.A0C;
        if (r0 == null || (bool = r0.A0B) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.A2Q;
    }

    public final int hashCode() {
        String str = this.A2Q;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static C13300iJ A01(C13080hr r5, boolean z) {
        String str;
        C13300iJ A002 = AnonymousClass1O2.A00(r5);
        if (A002 == null) {
            return A002;
        }
        boolean z2 = r5 instanceof AnonymousClass0IY;
        if (z2 && (str = ((AnonymousClass0IY) r5).A01) != null) {
            AnonymousClass0QD.A00().BYg("api_endpoint", str);
        }
        if (z2) {
            return C13510ie.A00(((AnonymousClass0IY) r5).A00).A01(A002, z);
        }
        if (r5 instanceof C05080Ia) {
            return A002;
        }
        AnonymousClass0QD.A02("user_missing_session", "User JSON needs to be parsed using SessionAwareJsonParser");
        return A002;
    }

    public static String A02(C13390iS r4) {
        if (r4 != null) {
            switch (r4.ordinal()) {
                case 0:
                    break;
                case 1:
                    return "fetching";
                case 2:
                    return "not_following";
                case 3:
                    return "following";
                case 4:
                    return "requested";
                default:
                    AnonymousClass0DB.A0J("User", "Follow status: %s not handled. Using 'unknown' instead.", r4);
                    return "unknown";
            }
        }
        return "unknown";
    }

    public static void A03(String str, String str2, String str3) {
        if (C06610Ps.A01() && !str2.equals(str3)) {
            AnonymousClass0QD.A03(AnonymousClass000.A0E("user_update_fields_mismatch_", str), AnonymousClass000.A0N("Immutable field was updated from ", str3, " to ", str2), 1);
        }
    }

    public final boolean A0U() {
        String str;
        if (A0p() || (str = this.A2W) == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return getId();
    }

    public C13300iJ() {
        Integer num = Constants.ZERO;
        this.A1o = num;
        this.A1d = num;
        this.A1E = false;
        this.A07 = C13340iN.INELIGIBLE;
        this.A08 = C13380iR.NONE;
        this.A01 = 0;
        C13390iS r0 = C13390iS.FollowStatusUnknown;
        this.A0M = r0;
        this.A0N = r0;
        this.A00 = 0;
    }

    public C13300iJ(String str) {
        Integer num = Constants.ZERO;
        this.A1o = num;
        this.A1d = num;
        this.A1E = false;
        this.A07 = C13340iN.INELIGIBLE;
        this.A08 = C13380iR.NONE;
        this.A01 = 0;
        C13390iS r0 = C13390iS.FollowStatusUnknown;
        this.A0M = r0;
        this.A0N = r0;
        this.A00 = 0;
        this.A2Q = str;
    }
}
