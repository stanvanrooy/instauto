package p000X;

import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D2G */
public final class D2G {
    public HeroPlayerSetting A00;
    public D2U A01;

    public static int A00(D2U d2u, C29677D4l d4l, long j) {
        D3T A012;
        if (d4l == null || (A012 = d4l.A01()) == null) {
            return 0;
        }
        long A002 = d2u.A00(0);
        long ALp = A012.ALp();
        long max = (long) Math.max(0, (((int) ALp) + A012.AVT(A002)) - 1);
        int AVV = (int) A012.AVV(Math.max(A012.AYH(ALp), (A012.AYH(max) + A012.AKh(max, A002)) - j), A002);
        C40431oe.A01("Exo2DashManifestWrapper", "prefetch: lastSegNum:%d first:%d prefetchStart:%d edgeLatencyMs:%d", Long.valueOf(max), Long.valueOf(ALp), Integer.valueOf(AVV), Long.valueOf(j / 1000));
        return AVV;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1.startsWith(org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND) == false) goto L_0x0030;
     */
    public static C29677D4l A01(String str, List list, D2X d2x, int i) {
        boolean z;
        boolean A012;
        int i2;
        Format format;
        int i3;
        int i4;
        float f;
        float f2;
        long j;
        List<C29677D4l> list2 = list;
        if (list == null || list2.isEmpty()) {
            return null;
        }
        if (list2.size() != 1) {
            D2X d2x2 = d2x;
            if (d2x2 instanceof D2X) {
                Format[] A002 = D36.A00(list2);
                Format format2 = null;
                if (r12 != 0) {
                    String str2 = A002[0].A0L;
                    if (str2 != null) {
                        z = true;
                    }
                    z = false;
                    if (z) {
                        Format format3 = null;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= r12) {
                                format2 = format3;
                                break;
                            }
                            format2 = A002[i5];
                            if (format2.A0W) {
                                break;
                            }
                            if (format3 == null || format2.A04 < format3.A04) {
                                format3 = format2;
                            }
                            i5++;
                        }
                    } else {
                        int A02 = d2x2.A07.A02(A002, (ArrayList) null, (String) null, (String) null);
                        D2V d2v = d2x2.A09;
                        D3U d3u = d2x2.A08;
                        C29605D1k d1k = d2x2.A0B;
                        C25947Bcz bcz = d2v.A00;
                        if (bcz == null) {
                            A012 = false;
                        } else {
                            A012 = bcz.A01();
                        }
                        if (A012) {
                            i2 = d2v.A03.A0K;
                        } else {
                            i2 = d2v.A03.A0J;
                        }
                        long ALH = d1k.AGg(-1).ALH(100000, -1);
                        if (ALH == -1 && d2v.A03.A0p) {
                            ALH = (long) d2v.A04();
                        }
                        String str3 = str;
                        if (ALH != -1) {
                            boolean z2 = d2v.A05;
                            if (z2) {
                                i3 = d2v.A03.A0M;
                            } else {
                                i3 = 3;
                            }
                            int i6 = i;
                            if (i6 > i3) {
                                if (!z2) {
                                    C40001nu r1 = d2v.A03;
                                    if (D2V.A00(d2v, r1.A0s)) {
                                        i4 = d2v.A02.A01.A08;
                                    } else {
                                        i4 = r1.A0e;
                                    }
                                }
                                i4 = -1;
                            } else {
                                if (!z2) {
                                    C40001nu r12 = d2v.A03;
                                    if (D2V.A00(d2v, r12.A0s)) {
                                        i4 = d2v.A02.A01.A09;
                                    } else {
                                        i4 = r12.A0f;
                                    }
                                }
                                i4 = -1;
                            }
                            int i7 = -1;
                            if (i4 != -1) {
                                f = 1.0f;
                            } else if (i6 > i3) {
                                if (z2) {
                                    f = d2v.A03.A03;
                                } else {
                                    f = d2v.A03.A0B;
                                }
                            } else if (z2) {
                                f = d2v.A03.A04;
                            } else {
                                f = d2v.A03.A0C;
                            }
                            format = null;
                            int i8 = 0;
                            while (i8 < r12) {
                                Format format4 = A002[i8];
                                if (A02 <= 0 || format4.A0F <= A02) {
                                    float f3 = (float) format4.A04;
                                    if (d2v.A05) {
                                        f2 = d2v.A03.A07;
                                    } else {
                                        f2 = d2v.A03.A0F;
                                    }
                                    long j2 = ((long) (f3 * f2)) / 8;
                                    if (i4 != i7) {
                                        j = D2L.A01(d1k, d2v, A002, j2, i4).A01;
                                    } else {
                                        long ALH2 = d1k.AGg(-1).ALH(j2, -1);
                                        if (ALH2 == -1 && d2v.A03.A0p) {
                                            ALH2 = (long) d2v.A04();
                                        }
                                        j = (long) (((float) ALH2) * f);
                                    }
                                    int i9 = format4.A04;
                                    if (((long) i9) < j && (format == null || format.A04 < i9)) {
                                        format = format4;
                                    }
                                }
                                i8++;
                                i7 = -1;
                            }
                            if (format == null) {
                                if (A002 == null || r12 == 0) {
                                    format = null;
                                } else {
                                    format = A002[0];
                                    for (Format format5 : A002) {
                                        if (format5.A04 < format.A04) {
                                            format = format5;
                                        }
                                    }
                                }
                            }
                        } else {
                            String ASU = d3u.A01.ASU(str3);
                            format = null;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= r12) {
                                    break;
                                }
                                Format format6 = A002[i10];
                                if (i2 <= 0) {
                                    if (ASU != null && format6.A0Q.equals(ASU)) {
                                        format = format6;
                                        break;
                                    }
                                } else if (format6.A0F <= i2 && (format == null || format.A04 < format6.A04)) {
                                    format = format6;
                                }
                                i10++;
                            }
                            if (format == null) {
                                if (A002 == null || r12 == 0) {
                                    format = null;
                                } else {
                                    format = A002[0];
                                    for (Format format7 : A002) {
                                        if (format7.A04 < format.A04) {
                                            format = format7;
                                        }
                                    }
                                }
                            }
                        }
                        D3U d3u2 = d2x2.A08;
                        if (d3u2 != null) {
                            d3u2.A01.Bjd(str3, format.A0Q);
                        }
                        format2 = format;
                    }
                }
                for (C29677D4l d4l : list2) {
                    if (d4l.A01.A0Q.equals(format2.A0Q)) {
                        return d4l;
                    }
                }
                return null;
            }
        }
        return (C29677D4l) list2.get(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r9 <= ((((int) r6) + r5.AVT(0)) - 1)) goto L_0x0026;
     */
    public final void A03(C29677D4l d4l, String str, int i, List list, Integer num, boolean z, D23 d23) {
        Uri A002;
        C29677D4l d4l2 = d4l;
        if (d4l != null) {
            D3T A012 = d4l2.A01();
            int i2 = i;
            if (A012 != null && i >= 0) {
                long ALp = A012.ALp();
                if (((long) i2) >= ALp) {
                }
            }
            A012 = null;
            if (A012 != null) {
                String str2 = d4l2.A03;
                long j = (long) i2;
                C29622D2e AVW = A012.AVW(j);
                if (AVW == null) {
                    A002 = null;
                } else {
                    A002 = AVW.A00(str2);
                }
                if (A002 != null) {
                    if (!z) {
                        if (d23.A01(str, A002) != null) {
                            return;
                        }
                    }
                    C40431oe.A01("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", A002);
                    list.add(new D1Z(A002, d4l2.A03(), num, false, (int) (A012.AYH(j) / 1000), (int) (A012.AKh(j, this.A01.A00(0)) / 1000), d4l2.A01));
                }
            }
        }
    }

    public static void A02(C29677D4l d4l, String str, List list, Integer num, boolean z, D23 d23) {
        C29622D2e d2e;
        if (d4l != null && (d2e = d4l.A02) != null) {
            Uri A002 = d2e.A00(d4l.A03);
            if (z || d23.A01(str, A002) == null) {
                C40431oe.A01("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", A002);
                list.add(new D1Z(A002, d4l.A03(), num, true, 0, 0, d4l.A01));
            }
        }
    }

    public D2G(D2U d2u, HeroPlayerSetting heroPlayerSetting) {
        this.A01 = d2u;
        this.A00 = heroPlayerSetting;
    }
}
