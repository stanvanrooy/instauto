package p000X;

import android.content.Context;

/* renamed from: X.CJ5 */
public final class CJ5 {
    public C27586CJf A00;
    public Integer A01;
    public String A02;
    public final AnonymousClass0C1 A03;
    public final C13300iJ A04;
    public final C27572CIq A05;
    public final CJ4 A06;
    public final CJW A07;
    public final C146056Mg A08;
    public final AnonymousClass6MW A09;
    public final AnonymousClass6MX A0A;
    public final C27588CJh A0B;
    public final C27578CIx A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public static void A00(CJ5 cj5) {
        C27572CIq.A03(cj5.A05, "frx_report_fetch_network_request_finished", cj5.A0F, cj5.A04, cj5.A0D, cj5.A0E, cj5.A08.toString(), cj5.A09.toString(), (String) null);
    }

    public static void A01(CJ5 cj5) {
        String str;
        C27572CIq cIq = cj5.A05;
        String str2 = cj5.A0F;
        C13300iJ r4 = cj5.A04;
        String str3 = cj5.A0D;
        String str4 = cj5.A0E;
        C146056Mg r0 = cj5.A08;
        String str5 = null;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = null;
        }
        AnonymousClass6MW r02 = cj5.A09;
        if (r02 != null) {
            str5 = r02.toString();
        }
        C27572CIq.A03(cIq, "frx_report_fetch_network_request_started", str2, r4, str3, str4, str, str5, (String) null);
    }

    public static void A02(CJ5 cj5) {
        C27572CIq.A03(cj5.A05, "frx_report_fetch_network_request_success", cj5.A0F, cj5.A04, cj5.A0D, cj5.A0E, cj5.A08.toString(), cj5.A09.toString(), (String) null);
    }

    public static void A04(CJ5 cj5, String str) {
        C27572CIq.A03(cj5.A05, "frx_report_fetch_network_request_failed", cj5.A0F, cj5.A04, cj5.A0D, cj5.A0E, cj5.A08.toString(), cj5.A09.toString(), str);
    }

    public CJ5(CJ4 cj4, AnonymousClass0C1 r3, C27572CIq cIq, String str, String str2, C13300iJ r7, C27578CIx cIx, C146056Mg r9, AnonymousClass6MW r10, AnonymousClass6MX r11, String str3, C27588CJh cJh, CJW cjw) {
        this.A06 = cj4;
        this.A03 = r3;
        this.A05 = cIq;
        this.A0F = str;
        this.A0D = str2;
        this.A04 = r7;
        this.A0C = cIx;
        this.A08 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A0E = str3;
        this.A0B = cJh;
        this.A07 = cjw;
        if (cIx != null) {
            this.A02 = cIx.A00.A0B;
            this.A01 = cIx.A01;
        }
    }

    public static void A03(CJ5 cj5, C12830hS r12, Context context, Integer num, String str, C27586CJf cJf, AnonymousClass7RN r17) {
        boolean A002 = C17440qF.A00(context);
        cj5.A06.A00(false);
        String str2 = null;
        AnonymousClass0L6.A02(cj5.A03, AnonymousClass0L7.WELLBEING_SUPPORT_FRX_FRICTION_PROCESS_EDUCATION, "enabled", false, (AnonymousClass04H) null);
        C27588CJh cJh = cj5.A0B;
        String str3 = null;
        C27586CJf cJf2 = cJf;
        if (cJf != null) {
            str2 = cJf2.A03;
        }
        cJh.B3W(str2);
        AnonymousClass0C1 r3 = cj5.A03;
        String str4 = str;
        AnonymousClass0a4.A06(str);
        if (cJf != null) {
            str3 = cJf2.A03;
        }
        C17850qu A032 = C27575CIu.A03(r3, str4, A002, str3, r17, num, (String) null, (String) null);
        A032.A00 = new CJE(cj5, r12, context, cJf2);
        r12.schedule(A032);
    }
}
