package p000X;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.19u  reason: invalid class name and case insensitive filesystem */
public final class C256719u extends C256819v {
    public static final C257019x A01 = new C256919w();
    public final List A00 = Arrays.asList(new C257019x[]{A01, C257119y.A00});

    public final C44161vh A05(AnonymousClass18O r11, long j, long j2, C256019m r16, Map map, C44041vV r18) {
        Object obj;
        AnonymousClass18O r5 = r11;
        AnonymousClass1C4 A012 = A01(r11);
        if (j >= 0) {
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(j);
            if (j2 >= 0) {
                obj = Long.valueOf(j2);
            } else {
                obj = "";
            }
            objArr[1] = obj;
            A012.A01("Range", C06360Ot.formatString("bytes=%s-%s", objArr));
            if (j2 >= 0) {
                A012.A01("Size-Bytes", String.valueOf((j2 - j) + 1));
            }
        }
        return A00(r5, A012, r16, map, r18);
    }

    public final C44171vi A06(AnonymousClass18O r7, C256019m r8) {
        return A00(r7, A01(r7), r8, (Map) null, (C44041vV) null);
    }

    private C44161vh A00(AnonymousClass18O r9, AnonymousClass1C4 r10, C256019m r11, Map map, C44041vV r13) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                r10.A01((String) entry.getKey(), (String) entry.getValue());
            }
        }
        A02(r10, r9.A02);
        AnonymousClass1C3 r7 = new AnonymousClass1C3(r10, r11);
        C33861dc A012 = AnonymousClass1C8.A00().A01(r7, new C44051vW(this, r13));
        AnonymousClass1CA r6 = A012.A00;
        if (r6 != null) {
            long j = -1;
            boolean z = false;
            if (A012.A00("Content-Range") != null) {
                z = true;
            }
            if (z) {
                String str = A012.A00("Content-Range").A01;
                try {
                    j = (long) Integer.parseInt(str.split("/")[1]);
                } catch (NumberFormatException unused) {
                    AnonymousClass0QD.A02("IgDownloader", AnonymousClass000.A0E("failed to parse content-range ", str));
                }
            }
            return new C44151vg(this, A012, j, r6, r7);
        }
        throw new IOException(AnonymousClass000.A05("response doesn't have body, status code : ", A012.A01));
    }

    public static AnonymousClass1C4 A01(AnonymousClass18O r1) {
        String str = r1.A03;
        AnonymousClass0a4.A06(str);
        AnonymousClass1BZ r12 = new AnonymousClass1BZ();
        r12.A02 = str;
        r12.A01 = Constants.A0N;
        return r12.A00();
    }

    private void A02(AnonymousClass1C4 r3, String str) {
        for (C257019x BX7 : this.A00) {
            BX7.BX7(r3, str);
        }
    }

    public final C26211Cc A03(AnonymousClass18O r5, int i, float f, AnonymousClass12F r8, C256019m r9) {
        AnonymousClass1C4 A012 = A01(r5);
        if (i > 0) {
            A012.A01("Estimated-Size-Bytes", String.valueOf(i));
        }
        if (f != 1.0f) {
            A012.A01("Image-Percentage", C06360Ot.formatString("%.2f", Float.valueOf(f)));
        }
        A02(A012, r5.A02);
        return AnonymousClass0k4.A00().A02(A012, r9, r8);
    }

    public final C26211Cc A04(AnonymousClass18O r3, AnonymousClass12F r4, C256019m r5) {
        AnonymousClass1C4 A012 = A01(r3);
        A02(A012, r3.A02);
        return AnonymousClass0k4.A00().A02(A012, r5, r4);
    }
}
