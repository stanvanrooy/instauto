package p000X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.common.base.Strings;
import java.io.File;
import java.io.IOException;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0nh  reason: invalid class name and case insensitive filesystem */
public final class C15890nh implements C15900ni {
    public long A00;
    public long A01;
    public C11590fD A02;
    public C15920nk A03;
    public C17750qk A04;
    public C06590Pq A05;
    public C16090o1 A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public List A0K;
    public Map A0L;
    public Set A0M;
    public final C15910nj A0N;

    public final void A05(Class cls, C12900hZ r5) {
        this.A06 = new C16070nz(cls, r5, C15830nb.A00, false);
    }

    public final void A0F(String... strArr) {
        this.A0G = true;
        HashSet hashSet = new HashSet();
        for (String add : strArr) {
            hashSet.add(add);
        }
        this.A0M = hashSet;
    }

    public static AnonymousClass1C3 A00(C15890nh r17, String str, CookieManager cookieManager) {
        String str2;
        StringBuilder sb;
        String str3;
        String str4;
        String str5;
        String str6;
        HttpCookie httpCookie;
        C15890nh r7 = r17;
        C11590fD r0 = r7.A02;
        if (r0 != null) {
            r7.A0N.A05((C15910nj) r0.get(), (Set) null);
        }
        if (r7.A09 == Constants.ONE) {
            C15910nj r3 = r7.A0N;
            boolean z = r7.A0G;
            CookieManager cookieManager2 = cookieManager;
            if (cookieManager != null) {
                httpCookie = AnonymousClass1BD.A02(cookieManager2, "csrftoken");
            } else {
                httpCookie = null;
            }
            if (httpCookie != null && !TextUtils.isEmpty(httpCookie.getValue())) {
                r3.A06("_csrftoken", httpCookie.getValue());
            }
            String str7 = str;
            if (str != null) {
                r3.A06("_uuid", C05860Mt.A02.A05(StoredPreferences.A00));
                if (z) {
                    r3.A06("_uid", str7);
                }
            }
        }
        AnonymousClass1BZ r2 = new AnonymousClass1BZ((C25961Bb) new C25951Ba(r7.A05));
        r2.A01 = r7.A09;
        try {
            String str8 = r7.A0B;
            String str9 = null;
            boolean z2 = false;
            if (str8 != null) {
                str2 = r7.A0N.A03(str8, false);
            } else {
                str2 = null;
            }
            String A032 = r7.A0N.A03(r7.A0C, true);
            C15910nj r8 = r7.A0N;
            if (r7.A0G) {
                try {
                    r8 = C37981kX.A00(C37981kX.A01(r8, r7.A0M, r7.A0L));
                    r8.A05(r7.A0N, r7.A0M);
                } catch (UnsatisfiedLinkError e) {
                    AnonymousClass0QD.A01("failed_to_load_library_network_layer", "failed_to_load_library_network_layer");
                    throw new IOException("Can't sign request.", e);
                }
            }
            if (r7.A0E) {
                sb = new StringBuilder();
                sb.append("/");
            } else if (r7.A0F) {
                sb = new StringBuilder("/api/v2/");
            } else {
                sb = new StringBuilder("/api/v1/");
            }
            sb.append(A032);
            String A052 = C06360Ot.formatString("https://%s%s", AnonymousClass1BE.A00(), sb.toString());
            String path = Uri.parse(A052).getPath();
            AnonymousClass0a4.A0F(!path.contains(" "), "API path : '%s' contains space.", path);
            AnonymousClass0a4.A0F(path.endsWith("/"), "API path : '%s' should end with '/'", path);
            switch (r7.A09.intValue()) {
                case 1:
                    r2.A02 = A052;
                    C26141Bv A002 = r8.A00();
                    if (r7.A0I) {
                        A002 = new AnonymousClass1C0(A002);
                    }
                    r2.A00 = A002;
                    break;
                case 3:
                case 4:
                    r2.A02 = r8.A02(A052);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
            List<C17190pp> list = r7.A0K;
            if (list != null) {
                for (C17190pp add : list) {
                    r2.A05.add(add);
                }
            }
            try {
                Locale A033 = C15300mf.A03();
                String str10 = null;
                if (A033 != null) {
                    str6 = A033.toString();
                    r2.A01("X-IG-App-Locale", str6);
                } else {
                    str6 = null;
                }
                Locale A042 = C15300mf.A04();
                if (A042 != null) {
                    r2.A01("X-IG-Device-Locale", A042.toString());
                }
                try {
                    str10 = C15300mf.A00();
                } catch (Exception e2) {
                    AnonymousClass0QD.A01("mapped_locale_failed", AnonymousClass000.A0P("Failed to get the mapped locale | URL: ", A052, ", app_locale: ", str6, ", Stack Trace: ", Log.getStackTraceString(e2)));
                }
                if (TextUtils.isEmpty(str10)) {
                    AnonymousClass0QD.A03("mapped_locale_empty", AnonymousClass000.A0N("Failed to get the mapped locale | URL: ", A052, ", app_locale: ", str6), 100000);
                } else {
                    r2.A01("X-IG-Mapped-Locale", str10);
                }
            } catch (NullPointerException e3) {
                AnonymousClass0QD.A01("Locale", "LanguageUtil has not been initialized yet | URL: " + A052 + ", Exception: " + e3);
            }
            String AS1 = AnonymousClass0WN.A01(r7.A05).AS1();
            String AS0 = AnonymousClass0WN.A01(r7.A05).AS0();
            if (!(AS1 == null || AS0 == null)) {
                r2.A01("X-Pigeon-Session-Id", AS1);
                r2.A01("X-Pigeon-Rawclienttime", AS0);
            }
            C14010jc r02 = C14010jc.A05;
            if (r02 != null) {
                r2.A01("X-IG-Connection-Speed", C06360Ot.formatString("%dkbps", Integer.valueOf(r02.A01.A00())));
            }
            float A012 = (float) C15700nO.A00().A01();
            try {
                r2.A01("X-IG-Bandwidth-Speed-KBPS", C06360Ot.formatString("%.3f", Float.valueOf(A012)));
            } catch (NullPointerException unused) {
                AnonymousClass0QD.A02("StringFormatter", AnonymousClass000.A04("Unable to add network bandwidth header for bandwidth ", A012));
            }
            r2.A01("X-IG-Bandwidth-TotalBytes-B", C06360Ot.formatString("%d", Long.valueOf(C15700nO.A00().A02())));
            r2.A01("X-IG-Bandwidth-TotalTime-MS", C06360Ot.formatString("%d", Long.valueOf(C15700nO.A00().A03())));
            Integer num = r7.A0A;
            if (num != null) {
                if (1 - num.intValue() != 0) {
                    str5 = AppStateModule.APP_STATE_BACKGROUND;
                } else {
                    str5 = "foreground";
                }
                r2.A01("X-IG-Prefetch-Request", str5);
            }
            C06590Pq r1 = r7.A05;
            if (r1.AgN() && C26171By.A01(C05210Iq.A02(r1)).A04()) {
                r2.A01("X-IG-Low-Data-Mode-Image", "true");
            }
            C06590Pq r12 = r7.A05;
            if (r12.AgN() && C26171By.A01(C05210Iq.A02(r12)).A04()) {
                r2.A01("X-IG-Low-Data-Mode-Video", "true");
            }
            C06590Pq r9 = r7.A05;
            AnonymousClass0L7 r82 = AnonymousClass0L7.TRAFFIC_ROUTING;
            if (((Boolean) AnonymousClass0L6.A00(r9, r82, "is_in_lla_routing_experiment", false, (AnonymousClass04H) null)).booleanValue()) {
                r2.A01("X-IG-EU-DC-ENABLED", Boolean.toString(((Boolean) AnonymousClass0L6.A00(r7.A05, r82, "route_to_lla", false, (AnonymousClass04H) null)).booleanValue()));
            }
            if (((Boolean) AnonymousClass0L6.A00(r7.A05, r82, "is_in_cr_routing_experiment", false, (AnonymousClass04H) null)).booleanValue()) {
                r2.A01("X-IG-CONCURRENT-ENABLED", (String) AnonymousClass0L6.A00(r7.A05, AnonymousClass0L7.TRAFFIC_ROUTING, "route_to_cr_header", "false", (AnonymousClass04H) null));
            }
            if (!((Boolean) AnonymousClass0L6.A00(r7.A05, AnonymousClass0L7.VP9_CLIENT_SUPPORT, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
                r2.A01("X-IG-VP9-Capable", "false");
            }
            C12600h4 A003 = C12600h4.A00();
            if (A003.A02 == null) {
                String string = C05770Lw.A00().A00.getString("device_app_startup_country", (String) null);
                if (string == null) {
                    string = "";
                }
                A003.A02 = string;
            }
            String str11 = A003.A02;
            if (!str11.isEmpty()) {
                r2.A01("X-IG-App-Startup-Country", str11);
            }
            r2.A01("X-Bloks-Version-Id", "5da07fc1b20eb4c7d1b2e6146ee5f197072cbbd193d2d1eb3bb4e825d3c39e28");
            if (AnonymousClass1C1.A00(A052)) {
                C06590Pq r13 = r7.A05;
                if (r13.AgN() && r7.A0D) {
                    C25971Bc A004 = C25971Bc.A00(r13);
                    C06590Pq r14 = A004.A02;
                    if (r14.AgN()) {
                        List<String> A043 = C05210Iq.A02(r14).A05.A04(A004.A04);
                        ArrayList arrayList = new ArrayList();
                        for (String str12 : A043) {
                            if (str12 != null) {
                                str4 = A004.A01.getString(str12, "");
                            } else {
                                str4 = null;
                            }
                            arrayList.add(str4);
                        }
                        str3 = TextUtils.join(",", arrayList);
                    } else {
                        str3 = "";
                    }
                    r2.A01("Authorization-Others", str3);
                }
            }
            if (AnonymousClass1C1.A00(A052)) {
                C06590Pq r15 = r7.A05;
                if (r15.AgN()) {
                    String Aar = C22510yY.A00(r15).Aar();
                    if (!AnonymousClass1BX.A00(Aar)) {
                        r2.A01("X-IG-WWW-Claim", Aar);
                    }
                }
                r2.A01("X-IG-WWW-Claim", "0");
            }
            if ((str2 == null && r7.A08 == Constants.ZERO) || !(str2 == null || !r7.A05.AgN() || r7.A08 == Constants.ZERO)) {
                z2 = true;
            }
            String str13 = r7.A0C;
            if (z2) {
                if (str2 != null) {
                    str9 = Integer.toHexString(AnonymousClass000.A0J("offline_", str2, C05210Iq.A02(r7.A05).A04()).hashCode());
                }
                Context context = StoredPreferences.A00;
                AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    r2.A01("X-IG-Fetch-AAT", "true");
                }
                if (r7.A0H) {
                    r2.A03 = true;
                }
                r2.A01("X-Bloks-Is-Layout-RTL", Boolean.toString(C06400Ox.A02(context)));
                r2.A01("X-IG-Device-ID", C05860Mt.A02.A05(context));
                r2.A01("X-IG-Android-ID", C05860Mt.A00(context));
                AnonymousClass1C4 A005 = r2.A00();
                C255919l r22 = new C255919l();
                r22.A03 = r7.A03;
                r22.A05 = r7.A07;
                r22.A06 = r7.A08;
                r22.A01 = r7.A01;
                r22.A00 = r7.A00;
                r22.A07 = str9;
                r22.A08 = AnonymousClass000.A0E("IgApi: ", A032);
                return new AnonymousClass1C3(A005, r22.A00());
            }
            throw new IllegalArgumentException(Strings.A00("Misconfigured cache information for request with path: %s", str13));
        } catch (IllegalArgumentException e4) {
            C04410Dw.A0G("ig_api_path", r7.A0C);
            throw e4;
        }
    }

    public static C17780qn A01(C15890nh r3, C17750qk r4, int i) {
        if (r3.A06 != null) {
            String A052 = C05210Iq.A05(r3.A05);
            CookieManager A002 = AnonymousClass0k5.A00(r3.A05);
            r3.A02();
            return C17780qn.A00(i, new C17770qm(r3, A052, A002)).A02(i, new C17800qp(r3, r4)).A02(436, r3.A06).A02(437, new C17820qr(r3));
        }
        throw new IllegalStateException("Parser class is not specified for API request");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2.A05.AgN() != false) goto L_0x0016;
     */
    private void A02() {
        boolean z;
        AnonymousClass0a4.A07(this.A0C, "Path cannot be null");
        if (this.A08 != Constants.ZERO) {
            z = false;
        }
        z = true;
        AnonymousClass0a4.A0B(z, "Must have a logged in session object in order to cache an API response");
    }

    public final C17850qu A03() {
        C17740qj r2;
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.API_ENDPOINT_LOGGING, "is_enabled", false)).booleanValue()) {
            C16090o1 r1 = this.A06;
            if (r1 instanceof C16070nz) {
                C12900hZ r12 = ((C16070nz) r1).A00;
                if (r12 instanceof AnonymousClass0IZ) {
                    ((AnonymousClass0IZ) r12).A00 = this.A0C;
                }
            }
        }
        C17750qk r0 = this.A04;
        if (r0 != null) {
            r2 = null;
        } else {
            r2 = new C17740qj();
            r0 = r2.A00;
        }
        C17780qn A012 = A01(this, r0, this.A0J);
        if (this.A04 != null) {
            return new C17850qu(A012, (C17740qj) null, "IgApi", this.A0C);
        }
        return new C17850qu(A012, r2, "IgApi", this.A0C);
    }

    public final void A06(Class cls, boolean z) {
        C12900hZ r0;
        C06590Pq r1 = this.A05;
        if (r1.AgN()) {
            r0 = new AnonymousClass0IZ(C05210Iq.A02(r1));
        } else {
            r0 = C12890hY.A00;
        }
        this.A06 = new C16070nz(cls, r0, C15830nb.A00, z);
    }

    public final void A07(String str, File file) {
        C15910nj r1 = this.A0N;
        boolean z = false;
        if (str != null) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        r1.A00.put(str, new AnonymousClass29I(file, file.getName(), "application/octet-stream"));
    }

    public final void A08(String str, String str2) {
        if (this.A0K == null) {
            this.A0K = new ArrayList();
        }
        this.A0K.add(new C17190pp(str, str2));
    }

    public final void A09(String str, String str2) {
        this.A0N.A06(str, str2);
    }

    public final void A0A(String str, String str2) {
        if (str2 != null) {
            A09(str, str2);
        }
    }

    public final void A0B(String str, String str2) {
        if (this.A0L == Collections.EMPTY_MAP) {
            this.A0L = new C04450Ea();
        }
        this.A0L.put(str, str2);
    }

    public final void A0C(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        A09(str, str2);
    }

    public final void A0D(String str, byte[] bArr) {
        C15910nj r1 = this.A0N;
        boolean z = false;
        if (str != null) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        r1.A00.put(str, new AnonymousClass2ZW(bArr, "application/octet-stream"));
    }

    public String buildJsonParams() {
        C11590fD r0 = this.A02;
        if (r0 != null) {
            this.A0N.A05((C15910nj) r0.get(), (Set) null);
        }
        return C37981kX.A01(this.A0N, this.A0M, this.A0L);
    }

    public final String toString() {
        return AnonymousClass000.A0E("IgApi ", this.A0C);
    }

    public final AnonymousClass1C3 A04() {
        A02();
        return A00(this, C05210Iq.A05(this.A05), AnonymousClass0k5.A00(this.A05));
    }

    public final void A0E(String str, Object... objArr) {
        this.A0C = C06360Ot.formatString(str, objArr);
    }

    public final /* bridge */ /* synthetic */ C15900ni A3u(String str, String str2) {
        A09(str, str2);
        return this;
    }

    public final /* bridge */ /* synthetic */ C15900ni A4F(String str, String str2) {
        A0B(str, str2);
        return this;
    }

    public C15890nh(C06590Pq r2) {
        this(r2, -2);
    }

    public C15890nh(C06590Pq r3, int i) {
        this.A0N = new C15910nj();
        this.A08 = Constants.ZERO;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = C15920nk.API;
        this.A0M = Collections.EMPTY_SET;
        this.A0L = Collections.EMPTY_MAP;
        this.A07 = Constants.A0C;
        AnonymousClass0a4.A06(r3);
        this.A05 = r3;
        this.A0J = i;
    }
}
