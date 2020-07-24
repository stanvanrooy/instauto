package p000X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1k2  reason: invalid class name and case insensitive filesystem */
public final class C37671k2 {
    public final AnonymousClass1YR A00;
    public final C37661k1 A01;
    public final C37691k4 A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C37661k1[] A0E;
    public final Integer A0F;

    public static C37671k2 A01(AnonymousClass1YR r13, String str, String str2, boolean z) {
        AnonymousClass1YR r2 = r13;
        if (r13 == null || !r13.equals(AnonymousClass1YR.DirectAudio)) {
            throw new IllegalArgumentException("attempted to get audio VideoSource for non-audio-only product type");
        }
        Integer num = Constants.A0j;
        String str3 = str;
        String str4 = str2;
        if (str != null) {
            return new C37671k2(num, r2, str3, (C37661k1[]) null, (String) null, str4, (String) null, (Integer) null, (String) null, (String) null, z, (C37691k4) null, false, false, false);
        }
        return A00(r13, num, str2);
    }

    public static C37671k2 A02(AnonymousClass1YR r16, String str, boolean z, boolean z2, C37661k1[] r20, String str2, String str3, Integer num, String str4, boolean z3, C37691k4 r26) {
        Integer num2;
        if (z2) {
            num2 = Constants.A0C;
        } else if (z) {
            num2 = Constants.ONE;
        } else {
            num2 = Constants.ZERO;
        }
        return new C37671k2(num2, r16, str, r20, str2, (String) null, str3, num, str4, (String) null, z3, r26, false, false, false);
    }

    public static String A03(C37671k2 r1) {
        switch (r1.A03.intValue()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (r1.A06()) {
                    return "DashVod";
                }
                return "Progressive";
            case 3:
                return "Live";
            default:
                throw new IllegalArgumentException("Illegal SourceType");
        }
    }

    public final String A04() {
        C37661k1 r0 = this.A01;
        if (r0 != null) {
            return r0.A04;
        }
        return "";
    }

    public final List A05() {
        ArrayList arrayList = new ArrayList();
        C37661k1[] r4 = this.A0E;
        if (r4 != null) {
            for (C37661k1 r1 : r4) {
                if (!TextUtils.isEmpty(r1.A03)) {
                    arrayList.add(Long.valueOf(Long.parseLong(r1.A03)));
                }
            }
        }
        return arrayList;
    }

    public final boolean A06() {
        switch (this.A03.intValue()) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
                Integer num = this.A0F;
                if (num == null || num.intValue() != 1 || this.A04 == null) {
                    return false;
                }
                break;
            case 3:
            case 4:
                break;
            default:
                throw new IllegalArgumentException("Illegal SourceType");
        }
        return true;
    }

    public C37671k2(Integer num, AnonymousClass1YR r10, String str, C37661k1[] r12, String str2, String str3, String str4, Integer num2, String str5, String str6, boolean z, C37691k4 r20, boolean z2, boolean z3, boolean z4) {
        this.A03 = num;
        this.A00 = r10;
        this.A05 = str;
        this.A0E = r12;
        this.A06 = str2;
        this.A09 = str3;
        this.A04 = str4;
        this.A0F = num2;
        this.A08 = str5;
        this.A07 = str6;
        this.A0D = z;
        this.A0B = z3;
        this.A0A = z4;
        if (r12 != null && (r7 = r12.length) > 0) {
            C37661k1 r6 = null;
            C37661k1 r3 = null;
            for (C37661k1 r2 : r12) {
                int i = r2.A01;
                if (i == 102) {
                    r6 = r2;
                } else if (i == 101) {
                    r3 = r2;
                }
            }
            if (r6 == null && r3 == null) {
                AnonymousClass0QD.A01("no_valid_video_url", C06360Ot.formatString("media id: %s invalid type: %d", str, Integer.valueOf(r12[0].A01)));
                r6 = r12[0];
            }
            if (r3 == null && r6 != null) {
                r3 = r6;
            } else if (r6 == null && r3 != null) {
                r6 = r3;
            }
            this.A01 = C37681k3.A00 <= 480 ? r6 : r3;
        }
        this.A02 = r20;
        this.A0C = z2;
    }

    public static C37671k2 A00(AnonymousClass1YR r16, Integer num, String str) {
        return new C37671k2(num, r16, UUID.randomUUID().toString(), (C37661k1[]) null, (String) null, str, (String) null, (Integer) null, (String) null, (String) null, false, (C37691k4) null, true, false, false);
    }
}
