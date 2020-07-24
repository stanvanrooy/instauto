package p000X;

import android.content.Context;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;

/* renamed from: X.D2W */
public final class D2W {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final C25947Bcz A05;
    public final D35 A06;
    public final D2V A07;
    public final boolean A08;
    public final boolean A09;
    public volatile int A0A;
    public volatile boolean A0B;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ea A[RETURN] */
    public final int A00(Format format, Format[] formatArr, ArrayList arrayList) {
        int i;
        boolean A012;
        int i2;
        D32 d32;
        int min;
        C25947Bcz bcz;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Context context = this.A04;
        float f = this.A00;
        float f2 = this.A01;
        if (context == null) {
            i = Integer.MAX_VALUE;
        } else {
            if (formatArr.length != 0) {
                Format format2 = formatArr[0];
                if (format2.A0F < format2.A08) {
                    f = f2;
                }
            }
            i = (int) (((float) context.getResources().getDisplayMetrics().widthPixels) * f);
        }
        C25947Bcz bcz2 = this.A05;
        if (bcz2 == null) {
            A012 = false;
        } else {
            A012 = bcz2.A01();
        }
        this.A06.A01();
        String A002 = this.A06.A00();
        synchronized (this.A06) {
        }
        boolean z = true;
        if ((!this.A06.A07() || !this.A08 || !this.A0B) && !"messaging".equals(A002) && !"messenger_story".equals(A002)) {
            z = false;
        }
        if (z) {
            arrayList.add(D32.BYPASS);
        } else {
            if (A012) {
                if (!"full_screen".equals(this.A06.A01())) {
                    arrayList.add(D32.INLINE);
                    i2 = this.A03;
                }
            } else if (this.A09) {
                if (formatArr == null || formatArr.length <= 0 || this.A0A >= formatArr[0].A0F) {
                    d32 = D32.MAX_FORMAT_WIDTH;
                } else {
                    d32 = D32.AVOID_ON_CELL;
                }
                arrayList.add(d32);
                i2 = this.A0A;
            } else {
                arrayList.add(D32.CELL);
                i2 = this.A02;
            }
            if (i2 > i) {
                arrayList.add(D32.SCREEN_WIDTH);
            }
            this.A06.A06();
            min = Math.min(i, i2);
            if (format != null) {
                int i3 = format.A0F;
            }
            this.A06.A02();
            bcz = this.A05;
            if (bcz != null) {
                bcz.A01();
            }
            this.A06.A01();
            this.A06.A00();
            this.A06.A06();
            if (0 > min) {
                return min;
            }
            arrayList.add(D32.FLOOR_RAISED);
            return 0;
        }
        i2 = Integer.MAX_VALUE;
        if (i2 > i) {
        }
        this.A06.A06();
        min = Math.min(i, i2);
        if (format != null) {
        }
        this.A06.A02();
        bcz = this.A05;
        if (bcz != null) {
        }
        this.A06.A01();
        this.A06.A00();
        this.A06.A06();
        if (0 > min) {
        }
    }

    public final int A01(Format[] formatArr) {
        Context context = this.A04;
        if (context == null || formatArr == null) {
            return 0;
        }
        Format format = formatArr[0];
        return (int) (((float) context.getResources().getDisplayMetrics().widthPixels) / Math.max(1.0f, ((float) format.A0F) / ((float) format.A08)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad A[RETURN] */
    public final int A02(Format[] formatArr, ArrayList arrayList, String str, String str2) {
        int i;
        boolean A012;
        int A002;
        D32 d32;
        int i2;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (str != null) {
            this.A06.A03(str);
        }
        if (str2 != null) {
            this.A06.A04(str2);
        }
        int length = formatArr.length;
        if (length == 0) {
            return 0;
        }
        Format format = formatArr[0];
        for (int i3 = 1; i3 < length; i3++) {
            Format format2 = formatArr[i3];
            if (format2.A0F > format.A0F) {
                format = format2;
            }
        }
        if (format == null) {
            i = 0;
        } else {
            i = format.A0F;
        }
        C25947Bcz bcz = this.A05;
        if (bcz == null) {
            A012 = false;
        } else {
            A012 = bcz.A01();
        }
        if (A012 || !this.A09) {
            A002 = A00((Format) null, formatArr, arrayList);
        } else {
            D2V d2v = this.A07;
            A002 = D2L.A00(formatArr, this.A06.A01());
            if (A002 == i) {
                d32 = D32.MAX_FORMAT_WIDTH;
            } else {
                d32 = D32.AVOID_ON_CELL;
            }
            arrayList.add(d32);
            Context context = this.A04;
            float f = this.A00;
            float f2 = this.A01;
            if (context == null) {
                i2 = Integer.MAX_VALUE;
            } else {
                if (length != 0) {
                    Format format3 = formatArr[0];
                    if (format3.A0F < format3.A08) {
                        f = f2;
                    }
                }
                i2 = (int) (((float) context.getResources().getDisplayMetrics().widthPixels) * f);
            }
            if (i2 < A002) {
                arrayList.add(D32.SCREEN_WIDTH);
                A002 = i2;
            }
        }
        int A052 = this.A07.A05();
        if (A052 > 0) {
            if (!this.A06.A06()) {
                if (A052 < A002) {
                    arrayList.add(D32.MAX_PREFETCH_WIDTH);
                }
            }
            if (A052 < 0) {
                return A052;
            }
            arrayList.add(D32.FLOOR_RAISED);
            return 0;
        }
        A052 = A002;
        if (A052 < 0) {
        }
    }

    public D2W(Context context, C25947Bcz bcz, D35 d35, D2V d2v) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        this.A05 = bcz;
        this.A04 = context;
        this.A06 = d35;
        this.A07 = d2v;
        boolean z2 = d2v.A05;
        if (z2) {
            i = d2v.A03.A0Q;
        } else {
            i = d2v.A03.A0Z;
        }
        this.A02 = i;
        if (z2) {
            i2 = d2v.A03.A0R;
        } else {
            i2 = d2v.A03.A0a;
        }
        this.A03 = i2;
        if (z2) {
            z = false;
        } else {
            z = d2v.A03.A0l;
        }
        this.A09 = z;
        this.A08 = !z2;
        if (z2) {
            f = d2v.A03.A08;
        } else {
            f = d2v.A03.A0D;
        }
        this.A00 = f;
        if (z2) {
            f2 = d2v.A03.A09;
        } else {
            f2 = d2v.A03.A0E;
        }
        this.A01 = f2;
    }
}
