package p000X;

import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2Y */
public final class D2Y implements C29724D6l, C29752D7z, C29762D8m {
    public VideoPlayRequest A00;
    public D1X A01;
    public final C29626D2j A02;

    public final void B9R(int i, C29791DAa dAa, D4J d4j, D6X d6x) {
    }

    public final void BAy(int i, C29791DAa dAa) {
    }

    public final void BAz(int i, C29791DAa dAa) {
    }

    public final void BH6(int i, C29791DAa dAa) {
    }

    public final void BTl(int i, C29791DAa dAa, D6X d6x) {
    }

    public final void AzK(int i, Format format) {
        C29624D2g.A00(this.A02, "onDecoderPerfReport avgDecodeTimeMsPerFrame:%d, bitrate:%d, width:%d, height:%d", Integer.valueOf(i), Integer.valueOf(format.A04), Integer.valueOf(format.A0F), Integer.valueOf(format.A08));
        this.A02.A0h.AzI(i, format.A0F, format.A08, format.A04);
    }

    public final void B0u(int i, C29791DAa dAa, D6X d6x) {
        ParcelableFormat parcelableFormat;
        String str;
        ArrayList arrayList;
        VideoSource videoSource;
        Uri uri;
        D2Y d2y = this;
        Format format = d6x.A05;
        if (format == null) {
            parcelableFormat = null;
        } else {
            String str2 = format.A0Q;
            String str3 = format.A0S;
            int i2 = format.A0F;
            int i3 = format.A08;
            float f = format.A01;
            int i4 = format.A05;
            int i5 = i4;
            int i6 = format.A0C;
            parcelableFormat = new ParcelableFormat(str2, str3, i2, i3, f, i5, i6, format.A04, format.A0R, format.A0K, format.A0P, format.A0N, format.A0O, format.A0M, format.A0X, format.A0Y, format.A0V, format.A0U, format.A0Z, format.A0W);
            d2y = this;
        }
        VideoPlayRequest videoPlayRequest = d2y.A00;
        if (videoPlayRequest == null || (videoSource = videoPlayRequest.A05) == null || (uri = videoSource.A03) == null) {
            str = "";
        } else {
            str = uri.toString();
        }
        D2X AJl = d2y.A02.A0t.A05.AJl();
        if (AJl == null) {
            arrayList = new ArrayList();
        } else if (AJl.A0F == null) {
            AJl.A06.A02();
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Format format2 : AJl.A0F) {
                String str4 = format2.A0P;
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            AJl.A06.A02();
            arrayList.size();
        }
        d2y.A02.A0h.B0w(parcelableFormat, str, arrayList);
    }

    public final void B9U(int i, C29791DAa dAa, D4J d4j, D6X d6x, Object obj) {
        D1X d1x;
        D1N d1n;
        long j;
        long[] jArr;
        Object obj2 = obj;
        if (d6x.A00 == 4 && (d1x = this.A01) != null) {
            if (obj2 instanceof D2U) {
                D2U d2u = (D2U) obj2;
                long[] jArr2 = {-1, -1, -1};
                if (d2u != null) {
                    try {
                        int size = d2u.A0F.size();
                        C29685D4w A012 = d2u.A01(0);
                        int i2 = size - 1;
                        C29685D4w A013 = d2u.A01(i2);
                        C29677D4l d4l = (C29677D4l) ((D5E) A012.A02.get(A012.A00())).A03.get(0);
                        C29677D4l d4l2 = (C29677D4l) ((D5E) A013.A02.get(A013.A00())).A03.get(0);
                        if ((d4l instanceof C29674D4i) && (d4l2 instanceof C29674D4i)) {
                            C29674D4i d4i = (C29674D4i) d4l;
                            C29674D4i d4i2 = (C29674D4i) d4l2;
                            int ALp = (int) d4i.ALp();
                            int AVT = (d4i2.AVT(d2u.A00(i2)) + ALp) - 1;
                            long j2 = (long) AVT;
                            jArr = new long[]{d4i.AYH((long) ALp) / 1000, (d4i2.AYH(j2) + d4i2.AKh(j2, -9223372036854775807L)) / 1000, (long) ((AVT - ALp) + 1)};
                            jArr2 = jArr;
                        }
                    } catch (Exception e) {
                        Log.w("Hero2EventListener", "Could not get segment range from manifest", e);
                        jArr = jArr2;
                    }
                }
                D1X d1x2 = this.A01;
                long j3 = jArr2[0];
                long j4 = jArr2[1];
                long j5 = jArr2[2];
                boolean z = d2u.A0J;
                boolean z2 = d2u.A0G;
                boolean z3 = d2u.A0I;
                boolean z4 = d2u.A0K;
                d1n = d1x2.A01;
                d1n.A0C = j3;
                d1n.A0D = j4;
                d1n.A0E = j5;
                d1n.A0a = z;
                d1n.A0d = z2;
                d1n.A0h = z3;
                d1n.A0b = z4;
                j = d1x2.A00;
            } else {
                d1n = d1x.A01;
                j = d1x.A00;
            }
            if (d1n.A0Q == null) {
                D1N.A00(d1n, j, false);
            }
        }
    }

    public final void B9X(int i, C29791DAa dAa, D4J d4j, D6X d6x, IOException iOException, boolean z) {
        D1X d1x;
        if (d6x.A00 == 4 && (d1x = this.A01) != null) {
            d1x.A01.BSS(iOException);
        }
    }

    public final void B9e(int i, C29791DAa dAa, D4J d4j, D6X d6x) {
        D1X d1x;
        if (d6x.A00 == 4 && (d1x = this.A01) != null) {
            d1x.A01.BSW(d4j.A00, C43711ux.NOT_CACHED);
        }
    }

    public final void BCp(byte[] bArr, long j) {
        this.A02.A0h.BCp(bArr, j);
    }

    public final void BId(Surface surface) {
        C29626D2j d2j = this.A02;
        d2j.A0G = surface;
        C29626D2j.A0F(d2j, surface.isValid());
        this.A02.A0h.B1b();
    }

    public final void BUp(String str, long j, long j2) {
        this.A02.A0h.AzH(str, true, j2);
    }

    public final void BUr(C29730D6u d6u) {
        C29626D2j d2j = this.A02;
        d2j.A0L = d6u;
        D2X AJl = d2j.A0t.A05.AJl();
        if (AJl instanceof D2X) {
            AJl.A04 = d6u;
        }
    }

    public final void BVP(int i, int i2, int i3, float f) {
        this.A02.A0h.BVO(i, i2);
    }

    public D2Y(C29626D2j d2j) {
        this.A02 = d2j;
    }

    public final void B9L(Uri uri, String str) {
    }
}
