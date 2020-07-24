package p000X;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2J */
public final class D2J {
    public static DCL A00(C29677D4l d4l, List list, int i, int i2) {
        int i3;
        Format format = null;
        if (d4l == null) {
            return null;
        }
        Format format2 = d4l.A01;
        Iterator it = list.iterator();
        Format format3 = null;
        Format format4 = null;
        Format format5 = null;
        Format format6 = null;
        Format format7 = null;
        while (it.hasNext()) {
            C29677D4l d4l2 = (C29677D4l) it.next();
            if (format6 == null || format6.A04 < d4l2.A01.A04) {
                format6 = d4l2.A01;
            }
            if (format7 == null || format7.A04 > d4l2.A01.A04) {
                format7 = d4l2.A01;
            }
            Format format8 = d4l2.A01;
            int i4 = format8.A04;
            int i5 = format2.A04;
            if (i4 > i5 && (format3 == null || format3.A04 > i4)) {
                format3 = format8;
            }
            if (i4 < i5 && (format4 == null || format4.A04 < i4)) {
                format4 = format8;
            }
            if (i2 > 0 && (i3 = format8.A0F) < i2) {
                if (format5 == null || i3 > format5.A0F) {
                    format5 = format8;
                }
            }
        }
        if (format3 == null) {
            format3 = null;
        }
        if (format4 == null) {
            format4 = null;
        }
        if (format5 != null) {
            format = format5;
        }
        return new DCL(format2, format3, format4, format6, format, format7, list.size(), i);
    }

    public static D2U A02(C29667D4a d4a, Uri uri, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            try {
                D2U A0B = d4a.BWl(uri, byteArrayInputStream);
                try {
                    byteArrayInputStream.close();
                    return A0B;
                } catch (IOException e) {
                    C40431oe.A05("DashManifestHelper2", e, "Failed to close manifest input stream", new Object[0]);
                    return A0B;
                }
            } catch (C2101594l | RuntimeException e2) {
                C40431oe.A05("DashManifestHelper2", e2, "Failed to parse manifest: %s", uri);
                throw new D3N(uri, e2);
            } catch (IOException e3) {
                C40431oe.A05("DashManifestHelper2", e3, "I/O Error when parsing manifest: %s", uri);
                throw e3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e4) {
                    C40431oe.A05("DashManifestHelper2", e4, "Failed to close manifest input stream", new Object[0]);
                }
                throw th;
            }
        } catch (D3N e5) {
            throw e5;
        } catch (IOException unused) {
            return null;
        }
    }

    public static D49 A01(D2U d2u, Context context, boolean z, D7w d7w, D8A d8a) {
        List list;
        List list2;
        List list3;
        List list4;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        D2U d2u2 = d2u;
        if (d2u == null || d2u2.A0F.size() < 1) {
            return null;
        }
        D5E d5e = null;
        D5E d5e2 = null;
        for (D5E d5e3 : d2u2.A01(0).A02) {
            int i5 = d5e3.A01;
            if (i5 != 1) {
                if (i5 == 2 && d5e == null) {
                    d5e = d5e3;
                }
            } else if (d5e2 == null) {
                d5e2 = d5e3;
            }
        }
        if (d5e == null || (list4 = d5e.A03) == null || list4.isEmpty()) {
            list = null;
        } else if (z || context == null) {
            list = d5e.A03;
        } else {
            List list5 = d5e.A03;
            try {
                Point A07 = C25948Bd0.A07(context);
                ArrayList arrayList = new ArrayList();
                int size = list5.size();
                int i6 = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < size; i7++) {
                    Format format = ((C29677D4l) list5.get(i7)).A01;
                    if (DAE.A02(C29732D6w.A00(d7w, d8a, format), false)) {
                        arrayList.add(Integer.valueOf(i7));
                        int i8 = format.A0F;
                        if (i8 > 0 && (i2 = format.A08) > 0 && (i3 = A07.x) > 0 && (i4 = A07.y) > 0) {
                            Point A00 = DAE.A00(true, i3, i4, i8, i2);
                            int i9 = format.A0F;
                            int i10 = format.A08;
                            int i11 = i9 * i10;
                            if (i9 >= ((int) (((float) A00.x) * 0.98f)) && i10 >= ((int) (((float) A00.y) * 0.98f)) && i11 < i6) {
                                i6 = i11;
                            }
                        }
                    }
                }
                if (i6 != Integer.MAX_VALUE) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        Format format2 = ((C29677D4l) list5.get(((Integer) arrayList.get(size2)).intValue())).A01;
                        int i12 = format2.A0F;
                        int i13 = -1;
                        if (!(i12 == -1 || (i = format2.A08) == -1)) {
                            i13 = i12 * i;
                        }
                        if (i13 == -1 || i13 > i6) {
                            arrayList.remove(size2);
                        }
                    }
                }
                int size3 = arrayList.size();
                iArr = new int[size3];
                for (int i14 = 0; i14 < size3; i14++) {
                    iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
                }
            } catch (D42 unused) {
                iArr = null;
            }
            list = new ArrayList();
            if (iArr != null && (r2 = iArr.length) > 0) {
                for (int i15 : iArr) {
                    list.add(d5e.A03.get(i15));
                }
            }
        }
        if (d5e2 == null || (list3 = d5e2.A03) == null || list3.isEmpty()) {
            list2 = null;
        } else {
            list2 = d5e2.A03;
        }
        if (d5e == null && list2 == null) {
            return null;
        }
        return new D49(list, list2);
    }
}
