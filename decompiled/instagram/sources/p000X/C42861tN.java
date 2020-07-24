package p000X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1tN  reason: invalid class name and case insensitive filesystem */
public final class C42861tN {
    public C42891tQ A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public List A0I;
    public transient String A0J;

    public static C42861tN A00(String str, String str2) {
        try {
            C13080hr A0A2 = C12890hY.A00.A0A(str);
            A0A2.A0p();
            C42861tN parseFromJson = C42871tO.parseFromJson(A0A2);
            parseFromJson.A0J = str2;
            return parseFromJson;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String A01() {
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
            A052.A0T();
            String str = this.A0H;
            if (str != null) {
                A052.A0H("t", str);
            }
            String str2 = this.A09;
            if (str2 != null) {
                A052.A0H("m", str2);
            }
            String str3 = this.A0G;
            if (str3 != null) {
                A052.A0H("tt", str3);
            }
            String str4 = this.A06;
            if (str4 != null) {
                A052.A0H("ig", str4);
            }
            String str5 = this.A03;
            if (str5 != null) {
                A052.A0H("collapse_key", str5);
            }
            if (this.A02 != null) {
                A052.A0d("i");
                C13270iF.A01(A052, this.A02);
            }
            if (this.A01 != null) {
                A052.A0d("a");
                C13270iF.A01(A052, this.A01);
            }
            String str6 = this.A0F;
            if (str6 != null) {
                A052.A0H("sound", str6);
            }
            String str7 = this.A0C;
            if (str7 != null) {
                A052.A0H("pi", str7);
            }
            String str8 = this.A0B;
            if (str8 != null) {
                A052.A0H("c", str8);
            }
            String str9 = this.A08;
            if (str9 != null) {
                A052.A0H("u", str9);
            }
            if (this.A00 != null) {
                A052.A0d("bc");
                A052.A0g(C42881tP.A00(this.A00));
            }
            String str10 = this.A07;
            if (str10 != null) {
                A052.A0H("ia", str10);
            }
            String str11 = this.A04;
            if (str11 != null) {
                A052.A0H("hpa", str11);
            }
            String str12 = this.A0A;
            if (str12 != null) {
                A052.A0H("cc", str12);
            }
            String str13 = this.A05;
            if (str13 != null) {
                A052.A0H("gid", str13);
            }
            String str14 = this.A0D;
            if (str14 != null) {
                A052.A0H("rid", str14);
            }
            String str15 = this.A0E;
            if (str15 != null) {
                A052.A0H("rtc_m", str15);
            }
            A052.A0Q();
            A052.close();
            return stringWriter.toString();
        } catch (IOException e) {
            AnonymousClass0DB.A05(C42861tN.class, "Unexpected IO exception", e);
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C42861tN)) {
            return false;
        }
        C42861tN r4 = (C42861tN) obj;
        if (!AnonymousClass17M.A00(this.A0H, r4.A0H) || !AnonymousClass17M.A00(this.A09, r4.A09)) {
            return false;
        }
        String str = this.A0G;
        if (str == null) {
            str = this.A09;
        }
        String str2 = r4.A0G;
        if (str2 == null) {
            str2 = r4.A09;
        }
        if (!AnonymousClass17M.A00(str, str2) || !AnonymousClass17M.A00(this.A06, r4.A06) || !AnonymousClass17M.A00(this.A02, r4.A02) || !AnonymousClass17M.A00(this.A01, r4.A01) || !AnonymousClass17M.A00(this.A03, r4.A03) || !AnonymousClass17M.A00(this.A0F, r4.A0F) || !AnonymousClass17M.A00(this.A0C, r4.A0C) || !AnonymousClass17M.A00(this.A0B, r4.A0B) || !AnonymousClass17M.A00(this.A08, r4.A08) || !AnonymousClass17M.A00(this.A00, r4.A00) || !AnonymousClass17M.A00(this.A07, r4.A07) || !AnonymousClass17M.A00(this.A0I, r4.A0I) || !AnonymousClass17M.A00(this.A0A, r4.A0A) || !AnonymousClass17M.A00(this.A0D, r4.A0D) || !AnonymousClass17M.A00(this.A05, r4.A05) || !AnonymousClass17M.A00(this.A0E, r4.A0E)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0H, this.A09, this.A0G, this.A06, this.A02, this.A01, this.A03, this.A0F, this.A0C, this.A0B, this.A08, this.A00, this.A07, this.A0I, this.A0A, this.A0D, this.A05, this.A0E});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IgNotification{");
        sb.append("mTitle='");
        sb.append(this.A0H);
        sb.append('\'');
        sb.append(", mMessage='");
        sb.append(this.A09);
        sb.append('\'');
        sb.append(", mTickerText='");
        sb.append(this.A0G);
        sb.append('\'');
        sb.append(", mIgAction='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", mOptionalImage='");
        sb.append(this.A02.AZc());
        sb.append('\'');
        sb.append(", mOptionalAvatarUrl='");
        sb.append(this.A01.AZc());
        sb.append('\'');
        sb.append(", mCollapseKey='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", mSound='");
        sb.append(this.A0F);
        sb.append('\'');
        sb.append(", mPushId='");
        sb.append(this.A0C);
        sb.append('\'');
        sb.append(", mPushCategory='");
        sb.append(this.A0B);
        sb.append('\'');
        sb.append(", mIntendedRecipientUserid='");
        sb.append(this.A08);
        sb.append('\'');
        try {
            String A002 = C42881tP.A00(this.A00);
            sb.append(", mBadgeCount='");
            sb.append(A002);
            sb.append('\'');
        } catch (IOException unused) {
        }
        sb.append(", mInAppActors='");
        sb.append(this.A07);
        sb.append('\'');
        sb.append(", mHigherPriorityApps='");
        sb.append(this.A0I);
        sb.append('\'');
        sb.append(", mMessageClientContext='");
        String str = this.A0A;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('\'');
        sb.append(", mId='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", mRevokedId='");
        sb.append(this.A0D);
        sb.append('\'');
        sb.append(", mRtcMessage='");
        sb.append(this.A0E);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C42861tN() {
    }

    public C42861tN(String str, String str2, String str3, String str4, C42891tQ r8) {
        this.A0H = null;
        this.A09 = str;
        this.A0G = null;
        this.A06 = str2;
        this.A03 = "direct_v2_message";
        this.A02 = null;
        this.A01 = null;
        this.A0F = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        this.A0C = str3;
        this.A0B = null;
        this.A08 = str4;
        this.A00 = r8;
        this.A07 = null;
        this.A0J = null;
        this.A0I = null;
        this.A04 = null;
        this.A0A = null;
        this.A0D = null;
        this.A05 = null;
        this.A0E = null;
    }
}
