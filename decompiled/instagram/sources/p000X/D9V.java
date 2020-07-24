package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.google.android.exoplayer2.Format;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* renamed from: X.D9V */
public final class D9V {
    public static long A00(DC7 dc7) {
        int i = dc7.A02;
        if (i > 0) {
            int i2 = dc7.A03;
            if (i2 > 0) {
                double d = (((double) i2) * 8000.0d) / ((double) (dc7.A00 + i));
                if (d > 1.0E11d) {
                    return 100000000000L;
                }
                return (long) d;
            }
            throw new IllegalStateException("sample.transferedBytes should be larger than 0");
        }
        throw new IllegalStateException("sample.transferDurationMs should be larger than 0");
    }

    public static void A01(Format format, D9W d9w, D29 d29, BME bme, boolean z, String str, long j, boolean z2, boolean z3, boolean z4, int i) {
        String str2;
        C29788D9x d9x;
        long j2;
        long j3;
        int i2;
        String str3;
        int i3;
        String str4;
        String str5;
        int i4;
        String str6;
        int i5;
        int i6;
        String str7;
        String str8;
        float A00;
        long j4;
        D9W d9w2 = d9w;
        Format format2 = format;
        if (format != null) {
            d9w2.A00 = format2;
        }
        Format format3 = d9w2.A00;
        if (format3 == null) {
            format3 = d9w2.A08;
        }
        if (format3 != null) {
            str2 = format3.A0P;
        } else {
            str2 = null;
        }
        D29 d292 = d29;
        if (d29 != null) {
            if (str2 == null || str2.isEmpty()) {
                str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            if (d9w2.A01.containsKey(str2)) {
                d9x = (C29788D9x) d9w2.A01.get(str2);
            } else {
                d9x = null;
            }
            if (d9x != null) {
                j2 = d9x.A01;
                j3 = d9x.A02;
            } else {
                j2 = -1;
                j3 = -1;
            }
            Format format4 = d9w2.A00;
            if (format4 != null) {
                str3 = format4.A0P;
                C29788D9x d9x2 = (C29788D9x) d9w2.A01.get(str3);
                if (d9x2 != null) {
                    j4 = d9x2.A04;
                } else {
                    j4 = -1;
                }
                i2 = (int) j4;
                if (i2 <= 0) {
                    i2 = format4.A04;
                }
            } else {
                i2 = 0;
                str3 = null;
            }
            long ACp = bme.ACp();
            long j5 = d9w2.A05;
            long j6 = d9w2.A04;
            long j7 = d9w2.A07;
            long j8 = d9w2.A06;
            Format format5 = d9w2.A08;
            if (format5 == null) {
                i3 = 0;
            } else {
                i3 = format5.A04;
            }
            if (format5 == null) {
                str4 = null;
            } else {
                str4 = format5.A0P;
            }
            Format format6 = d9w2.A09;
            if (format6 == null) {
                str5 = null;
            } else {
                str5 = format6.A0P;
            }
            Format format7 = d9w2.A0D;
            if (format7 == null) {
                i4 = 0;
            } else {
                i4 = format7.A04;
            }
            if (format7 == null) {
                str6 = null;
            } else {
                str6 = format7.A0P;
            }
            Format[] formatArr = d9w2.A0C;
            int length = formatArr.length;
            ParcelableFormat[] parcelableFormatArr = new ParcelableFormat[length];
            for (int i7 = 0; i7 < length; i7++) {
                Format format8 = formatArr[i7];
                parcelableFormatArr[i7] = new ParcelableFormat(format8.A0Q, format8.A0L, format8.A0F, format8.A08, format8.A01, format8.A05, format8.A0C, format8.A04, format8.A0R, format8.A0K, format8.A0P, format8.A0N, format8.A0O, format8.A0M, format8.A0X, format8.A0Y, format8.A0V, format8.A0U, format8.A0Z, format8.A0W);
            }
            String A02 = d9w2.A02();
            int i8 = d9w2.A02;
            String A01 = d9w2.A01();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : d9w2.A01.entrySet()) {
                D9W.A00(sb, (String) entry.getKey(), (C29788D9x) entry.getValue());
            }
            String sb2 = sb.toString();
            Format format9 = d9w2.A08;
            if (format9 == null) {
                i5 = 0;
            } else {
                i5 = format9.A0F;
            }
            Format format10 = d9w2.A00;
            if (format10 == null) {
                i6 = 0;
            } else {
                i6 = format10.A0F;
            }
            if (format9 == null) {
                str7 = null;
            } else {
                str7 = format9.A0Q;
            }
            if (format10 == null) {
                str8 = null;
            } else {
                str8 = format10.A0Q;
            }
            int i9 = d9w2.A03;
            if (format2 == null) {
                A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                A00 = MosScoreCalculation.A00(format2, i9);
            }
            String str9 = str;
            boolean z5 = z;
            boolean z6 = z3;
            boolean z7 = z2;
            long j9 = j8;
            long j10 = j2;
            int i10 = i3;
            String str10 = str4;
            int i11 = i2;
            String str11 = str3;
            String str12 = str5;
            int i12 = i4;
            String str13 = str6;
            ParcelableFormat[] parcelableFormatArr2 = parcelableFormatArr;
            int i13 = i8;
            int i14 = i5;
            int i15 = i6;
            String str14 = str7;
            String str15 = str8;
            long j11 = j5;
            long j12 = j6;
            long j13 = j7;
            d292.A00(new C60212jV(ACp, z5, str9, j, j11, j12, j13, j9, j10, i10, str10, i11, str11, str12, i12, str13, parcelableFormatArr2, A02, i13, A01, sb2, i14, i15, str14, str15, z7, z6, z4, i, j3, i9, A00, d9w2.A0E, d9w2.A0A, d9w2.A0B));
        }
    }
}
