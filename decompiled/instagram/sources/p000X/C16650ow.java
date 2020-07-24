package p000X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ow  reason: invalid class name and case insensitive filesystem */
public final class C16650ow implements C16660ox {
    public boolean A00;
    public final C11140eU A01;
    public final C16620ot A02;
    public final Set A03 = new HashSet();
    public final Context A04;
    public final C16590oq A05;
    public final C16640ov A06;
    public final C16610os A07;

    public final void A35(C42861tN r1, AnonymousClass0P4 r2) {
    }

    public final String AHu() {
        return "video_call_incoming";
    }

    public final void BD9(C42861tN r1, String str, AnonymousClass0C1 r3) {
    }

    public final void BY0(C42861tN r1, AnonymousClass0C1 r2, String str) {
    }

    public final boolean BnB(C42861tN r2, AnonymousClass0C1 r3, String str) {
        return false;
    }

    public final boolean BnE(C42861tN r2, String str, AnonymousClass0C1 r4) {
        return false;
    }

    public static String A00(C42861tN r1) {
        String str = r1.A06;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("vc_id");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r1 != false) goto L_0x004a;
     */
    public final String AZM(C42861tN r6) {
        C23938Adx adx;
        boolean z;
        if (TextUtils.isEmpty(r6.A06)) {
            return null;
        }
        Uri parse = Uri.parse(r6.A06);
        Integer A002 = AnonymousClass48K.A00(parse.getQueryParameter("surface"));
        String queryParameter = parse.getQueryParameter("surface_id");
        String str = r6.A08;
        String str2 = r6.A03;
        if ("video_call_incoming".equals(str2)) {
            adx = C23938Adx.EVENT_TYPE_INCOMING_CALL;
        } else if ("video_call_ended".equals(str2)) {
            String str3 = r6.A09;
            if (str3 != null) {
                boolean isEmpty = str3.isEmpty();
                z = true;
            }
            z = false;
            if (z) {
                adx = C23938Adx.EVENT_TYPE_MISSED_CALL;
            } else {
                adx = C23938Adx.EVENT_TYPE_REVOKE;
            }
        } else {
            adx = C23938Adx.EVENT_TYPE_UNKNOWN;
        }
        return C23937Adw.A00(str, adx, A002, queryParameter);
    }

    public final void BD8(C42861tN r4, String str, C06590Pq r6) {
        boolean equals = "video_call_ended".equals(r4.A03);
        Integer A002 = AnonymousClass48K.A00(C23937Adw.A01("s_type:", str));
        if (equals && A002 != Constants.ZERO) {
            this.A01.BXT(new C24165AjF(A00(r4)));
            C23937Adw.A02(this.A02, str, C23938Adx.EVENT_TYPE_INCOMING_CALL);
        }
    }

    public final void BDA(C42861tN r4, String str, AnonymousClass0C1 r6, boolean z) {
        if (!z) {
            C23938Adx adx = (C23938Adx) C23938Adx.A01.get(C23937Adw.A01("e_type:", str));
            if (adx == null) {
                adx = C23938Adx.EVENT_TYPE_UNKNOWN;
            }
            String A002 = A00(r4);
            if (adx == C23938Adx.EVENT_TYPE_INCOMING_CALL) {
                this.A05.A07(r6, this.A04, A002);
            }
            this.A07.A05(r4, Constants.ZERO);
        }
    }

    public C16650ow(Context context, C16620ot r3, C16640ov r4, C16590oq r5, C16610os r6, C11140eU r7, boolean z) {
        this.A04 = context;
        this.A02 = r3;
        this.A06 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A00 = z;
        this.A01 = r7;
    }

    public static String A01(C42861tN r4, String str, String str2) {
        String A012 = C23937Adw.A01("s_id:", str);
        if (!TextUtils.isEmpty(A012)) {
            String A002 = A00(r4);
            if (!TextUtils.isEmpty(A002)) {
                return AnonymousClass000.A0J(A002, A012, str2);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0108, code lost:
        if (r9.A03.contains(r1) == false) goto L_0x010a;
     */
    public final void BnF(C42861tN r10, String str, C06590Pq r12, AnonymousClass2G7 r13) {
        boolean z;
        C16610os r1;
        Integer num;
        String str2 = str;
        if (AnonymousClass48K.A00(C23937Adw.A01("s_type:", str)) != Constants.ZERO) {
            this.A07.A04(r10);
            String str3 = r10.A08;
            if (!C05210Iq.A00(r12).Ady(str3)) {
                r1 = this.A07;
                num = Constants.ZERO;
            } else if (!((Boolean) this.A06.A00.A00(r12)).booleanValue()) {
                r1 = this.A07;
                num = Constants.ONE;
            } else {
                AnonymousClass0C1 A032 = C05210Iq.A03(r12);
                if (this.A05.A0D(A032, this.A04, str3, str2, r10.A0I)) {
                    if (this.A00 || str3.equals(A032.A04())) {
                        r10.A06 = Uri.parse(r10.A06).buildUpon().appendQueryParameter("push_notification_id", r10.A0C).build().toString();
                        C23938Adx adx = (C23938Adx) C23938Adx.A01.get(C23937Adw.A01("e_type:", str));
                        if (adx == null) {
                            adx = C23938Adx.EVENT_TYPE_UNKNOWN;
                        }
                        if (C23938Adx.EVENT_TYPE_MISSED_CALL == adx) {
                            this.A01.BXT(new C24165AjF(A00(r10)));
                            C23937Adw.A02(this.A02, str, C23938Adx.EVENT_TYPE_INCOMING_CALL);
                            r10.A06 = Uri.parse(r10.A06).buildUpon().appendQueryParameter("missed_call", Boolean.TRUE.toString()).build().toString();
                            String A012 = A01(r10, str, str3);
                            if (!TextUtils.isEmpty(A012)) {
                                this.A03.add(A012);
                            }
                        } else if (C23938Adx.EVENT_TYPE_REVOKE == adx) {
                            String A013 = A01(r10, str, str3);
                            if (!TextUtils.isEmpty(A013)) {
                                this.A03.add(A013);
                            }
                            r13.A00(false);
                            return;
                        } else {
                            String A014 = A01(r10, str, str3);
                            if (!TextUtils.isEmpty(A014)) {
                                z = true;
                            }
                            z = false;
                            if (z) {
                                this.A07.A06(r10, Constants.A0N);
                                r13.A00(false);
                                return;
                            }
                        }
                        r13.A00(true);
                        return;
                    }
                    r1 = this.A07;
                    num = Constants.A0C;
                }
            }
            r1.A06(r10, num);
        }
        r13.A00(false);
    }
}
