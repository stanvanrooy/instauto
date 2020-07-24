package p000X;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.D9Q */
public final class D9Q implements C29699D5l, D8B {
    public static final D93 A0K = D43.A00;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = -1;
    public long A07;
    public long A08;
    public C29790D9z A09;
    public D9O A0A;
    public boolean A0B;
    public boolean A0C;
    public D9t[] A0D;
    public long[][] A0E;
    public final D9O A0F = new D9O(16);
    public final D9O A0G = new D9O(4);
    public final D9O A0H = new D9O(C29787D9w.A02);
    public final D9O A0I = new D9O();
    public final ArrayDeque A0J = new ArrayDeque();

    public final boolean AhX() {
        return true;
    }

    public final boolean Bp2(C29778D9m d9m) {
        return C29776D9g.A00(d9m, false);
    }

    public static int A00(D9h d9h, long j) {
        int A022 = C25948Bd0.A02(d9h.A07, j, false);
        while (true) {
            if (A022 >= 0) {
                if ((d9h.A04[A022] & 1) != 0) {
                    break;
                }
                A022--;
            } else {
                A022 = -1;
                break;
            }
        }
        if (A022 == -1) {
            return d9h.A00(j);
        }
        return A022;
    }

    /* JADX WARNING: type inference failed for: r33v2, types: [X.DAB] */
    /* JADX WARNING: type inference failed for: r0v286, types: [X.D9r] */
    /* JADX WARNING: type inference failed for: r0v287, types: [X.D9u] */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x059b, code lost:
        if (r8 != 0) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a81, code lost:
        if (r2.A01 == -1) goto L_0x0a83;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da A[Catch:{ all -> 0x0ba9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3 A[Catch:{ all -> 0x0ba9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0391 A[EDGE_INSN: B:527:0x0391->B:195:0x0391 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x038c A[SYNTHETIC] */
    private void A01(long j) {
        Metadata metadata;
        boolean z;
        int i;
        D9k A032;
        ? r33;
        boolean z2;
        D9O d9o;
        D9O d9o2;
        int i2;
        int i3;
        boolean z3;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i4;
        long[] jArr2;
        long j2;
        long[] jArr3;
        int[] iArr3;
        int[] iArr4;
        D9h d9h;
        int i5;
        int i6;
        long A042;
        int length;
        boolean z4;
        String str;
        MdtaMetadataEntry mdtaMetadataEntry;
        String str2;
        boolean z5;
        Object obj;
        String str3;
        int i7;
        String str4;
        while (true) {
            if (!this.A0J.isEmpty() && ((C29772D9c) this.A0J.peek()).A00 == j) {
                C29772D9c d9c = (C29772D9c) this.A0J.pop();
                C29772D9c d9c2 = d9c;
                if (d9c.A00 == 1836019574) {
                    ArrayList arrayList = new ArrayList();
                    C29270Cuw cuw = new C29270Cuw();
                    DA2 A012 = d9c2.A01(1969517665);
                    Metadata metadata2 = null;
                    if (A012 != null) {
                        metadata = null;
                        if (!this.A0C) {
                            D9O d9o3 = A012.A00;
                            d9o3.A0C(8);
                            while (true) {
                                int i8 = d9o3.A00;
                                int i9 = d9o3.A01;
                                if (i8 - i9 < 8) {
                                    break;
                                }
                                int A002 = d9o3.A00();
                                if (d9o3.A00() == 1835365473) {
                                    d9o3.A0C(i9);
                                    int i10 = i9 + A002;
                                    d9o3.A0D(12);
                                    while (true) {
                                        int i11 = d9o3.A01;
                                        if (i11 >= i10) {
                                            break;
                                        }
                                        int A003 = d9o3.A00();
                                        if (d9o3.A00() == 1768715124) {
                                            d9o3.A0C(i11);
                                            int i12 = i11 + A003;
                                            d9o3.A0D(8);
                                            ArrayList arrayList2 = new ArrayList();
                                            while (true) {
                                                int i13 = d9o3.A01;
                                                if (i13 >= i12) {
                                                    break;
                                                }
                                                int A004 = i13 + d9o3.A00();
                                                int A005 = d9o3.A00();
                                                int i14 = (A005 >> 24) & 255;
                                                if (i14 == 169 || i14 == 253) {
                                                    int i15 = 16777215 & A005;
                                                    if (i15 == 6516084) {
                                                        int A006 = d9o3.A00();
                                                        if (d9o3.A00() == 1684108385) {
                                                            d9o3.A0D(8);
                                                            String A092 = d9o3.A09(A006 - 16);
                                                            obj = new CommentFrame(A092, A092);
                                                            d9o3.A0C(A004);
                                                            if (obj == null) {
                                                                arrayList2.add(obj);
                                                            }
                                                        } else {
                                                            Log.w("MetadataUtil", AnonymousClass000.A0E("Failed to parse comment attribute: ", C29784D9s.A00(A005)));
                                                        }
                                                    } else if (i15 == 7233901 || i15 == 7631467) {
                                                        obj = D9Z.A02(A005, "TIT2", d9o3);
                                                        d9o3.A0C(A004);
                                                        if (obj == null) {
                                                        }
                                                    } else if (i15 == 6516589 || i15 == 7828084) {
                                                        obj = D9Z.A02(A005, "TCOM", d9o3);
                                                        d9o3.A0C(A004);
                                                        if (obj == null) {
                                                        }
                                                    } else {
                                                        if (i15 == 6578553) {
                                                            obj = D9Z.A02(A005, "TDRC", d9o3);
                                                        } else if (i15 == 4280916) {
                                                            obj = D9Z.A02(A005, "TPE1", d9o3);
                                                        } else if (i15 == 7630703) {
                                                            obj = D9Z.A02(A005, "TSSE", d9o3);
                                                        } else if (i15 == 6384738) {
                                                            obj = D9Z.A02(A005, "TALB", d9o3);
                                                        } else if (i15 == 7108978) {
                                                            obj = D9Z.A02(A005, "USLT", d9o3);
                                                        } else if (i15 == 6776174) {
                                                            obj = D9Z.A02(A005, "TCON", d9o3);
                                                        } else if (i15 == 6779504) {
                                                            obj = D9Z.A02(A005, "TIT1", d9o3);
                                                        }
                                                        d9o3.A0C(A004);
                                                        if (obj == null) {
                                                        }
                                                    }
                                                } else {
                                                    if (A005 == 1735291493) {
                                                        try {
                                                            d9o3.A0D(4);
                                                            if (d9o3.A00() == 1684108385) {
                                                                d9o3.A0D(8);
                                                                i7 = d9o3.A01();
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
                                                                i7 = -1;
                                                            }
                                                            obj = null;
                                                            if (i7 > 0) {
                                                                String[] strArr = D9Z.A00;
                                                                if (i7 <= strArr.length) {
                                                                    str4 = strArr[i7 - 1];
                                                                    if (str4 == null) {
                                                                        obj = new TextInformationFrame("TCON", str4);
                                                                    } else {
                                                                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                    }
                                                                }
                                                            }
                                                            str4 = null;
                                                            if (str4 == null) {
                                                            }
                                                        } catch (Throwable th) {
                                                            d9o3.A0C(A004);
                                                            throw th;
                                                        }
                                                    } else if (A005 == 1684632427) {
                                                        obj = D9Z.A01(A005, "TPOS", d9o3);
                                                    } else if (A005 == 1953655662) {
                                                        obj = D9Z.A01(A005, "TRCK", d9o3);
                                                    } else if (A005 == 1953329263) {
                                                        obj = D9Z.A00(A005, "TBPM", d9o3, true, false);
                                                    } else if (A005 == 1668311404) {
                                                        obj = D9Z.A00(A005, "TCMP", d9o3, true, true);
                                                    } else if (A005 == 1668249202) {
                                                        int A007 = d9o3.A00();
                                                        obj = null;
                                                        if (d9o3.A00() == 1684108385) {
                                                            int A008 = d9o3.A00() & 16777215;
                                                            if (A008 == 13) {
                                                                str3 = "image/jpeg";
                                                            } else if (A008 == 14) {
                                                                str3 = "image/png";
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            if (str3 == null) {
                                                                Log.w("MetadataUtil", AnonymousClass000.A05("Unrecognized cover art flags: ", A008));
                                                            } else {
                                                                d9o3.A0D(4);
                                                                int i16 = A007 - 16;
                                                                byte[] bArr = new byte[i16];
                                                                d9o3.A0F(bArr, 0, i16);
                                                                obj = new ApicFrame(str3, bArr);
                                                            }
                                                        } else {
                                                            Log.w("MetadataUtil", "Failed to parse cover art attribute");
                                                        }
                                                    } else if (A005 == 1631670868) {
                                                        obj = D9Z.A02(A005, "TPE2", d9o3);
                                                    } else if (A005 == 1936682605) {
                                                        obj = D9Z.A02(A005, "TSOT", d9o3);
                                                    } else if (A005 == 1936679276) {
                                                        obj = D9Z.A02(A005, "TSO2", d9o3);
                                                    } else if (A005 == 1936679282) {
                                                        obj = D9Z.A02(A005, "TSOA", d9o3);
                                                    } else if (A005 == 1936679265) {
                                                        obj = D9Z.A02(A005, "TSOP", d9o3);
                                                    } else if (A005 == 1936679791) {
                                                        obj = D9Z.A02(A005, "TSOC", d9o3);
                                                    } else if (A005 == 1920233063) {
                                                        obj = D9Z.A00(A005, "ITUNESADVISORY", d9o3, false, false);
                                                    } else if (A005 == 1885823344) {
                                                        obj = D9Z.A00(A005, "ITUNESGAPLESS", d9o3, false, true);
                                                    } else if (A005 == 1936683886) {
                                                        obj = D9Z.A02(A005, "TVSHOWSORT", d9o3);
                                                    } else if (A005 == 1953919848) {
                                                        obj = D9Z.A02(A005, "TVSHOW", d9o3);
                                                    } else if (A005 == 757935405) {
                                                        obj = null;
                                                        String str5 = null;
                                                        String str6 = null;
                                                        int i17 = -1;
                                                        int i18 = -1;
                                                        while (true) {
                                                            int i19 = d9o3.A01;
                                                            if (i19 >= A004) {
                                                                break;
                                                            }
                                                            int A009 = d9o3.A00();
                                                            int A0010 = d9o3.A00();
                                                            d9o3.A0D(4);
                                                            if (A0010 == 1835360622) {
                                                                str5 = d9o3.A09(A009 - 12);
                                                            } else if (A0010 == 1851878757) {
                                                                str6 = d9o3.A09(A009 - 12);
                                                            } else {
                                                                if (A0010 == 1684108385) {
                                                                    i17 = i19;
                                                                    i18 = A009;
                                                                }
                                                                d9o3.A0D(A009 - 12);
                                                            }
                                                        }
                                                        if (!(str5 == null || str6 == null || i17 == -1)) {
                                                            d9o3.A0C(i17);
                                                            d9o3.A0D(16);
                                                            obj = new InternalFrame(str5, str6, d9o3.A09(i18 - 16));
                                                        }
                                                    }
                                                    d9o3.A0C(A004);
                                                    if (obj == null) {
                                                    }
                                                }
                                                obj = null;
                                                d9o3.A0C(A004);
                                                if (obj == null) {
                                                }
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                metadata = new Metadata((List) arrayList2);
                                            }
                                        } else {
                                            d9o3.A0C(i11 + A003);
                                        }
                                    }
                                } else {
                                    d9o3.A0C(i9 + A002);
                                }
                            }
                        }
                        if (metadata != null) {
                            int i20 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr = metadata.A00;
                                if (i20 >= entryArr.length) {
                                    break;
                                }
                                Metadata.Entry entry = entryArr[i20];
                                if (entry instanceof CommentFrame) {
                                    CommentFrame commentFrame = (CommentFrame) entry;
                                    if ("iTunSMPB".equals(commentFrame.A00)) {
                                        str2 = commentFrame.A02;
                                    } else {
                                        continue;
                                        i20++;
                                    }
                                } else {
                                    if (entry instanceof InternalFrame) {
                                        InternalFrame internalFrame = (InternalFrame) entry;
                                        if ("com.apple.iTunes".equals(internalFrame.A01) && "iTunSMPB".equals(internalFrame.A00)) {
                                            str2 = internalFrame.A02;
                                        }
                                    } else {
                                        continue;
                                    }
                                    i20++;
                                }
                                Matcher matcher = C29270Cuw.A02.matcher(str2);
                                if (matcher.find()) {
                                    try {
                                        int parseInt = Integer.parseInt(matcher.group(1), 16);
                                        int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                                        if (parseInt > 0 || parseInt2 > 0) {
                                            C29270Cuw cuw2 = cuw;
                                            cuw2.A00 = parseInt;
                                            cuw2.A01 = parseInt2;
                                            z5 = true;
                                            if (!z5) {
                                                break;
                                            }
                                            i20++;
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                z5 = false;
                                if (!z5) {
                                }
                            }
                        }
                    } else {
                        metadata = null;
                    }
                    C29772D9c A0011 = d9c2.A00(1835365473);
                    if (A0011 != null) {
                        DA2 A013 = A0011.A01(1751411826);
                        DA2 A014 = A0011.A01(1801812339);
                        DA2 A015 = A0011.A01(1768715124);
                        if (!(A013 == null || A014 == null || A015 == null)) {
                            D9O d9o4 = A013.A00;
                            d9o4.A0C(16);
                            if (d9o4.A00() == 1835299937) {
                                D9O d9o5 = A014.A00;
                                d9o5.A0C(12);
                                int A0012 = d9o5.A00();
                                String[] strArr2 = new String[A0012];
                                for (int i21 = 0; i21 < A0012; i21++) {
                                    int A0013 = d9o5.A00();
                                    d9o5.A0D(4);
                                    int i22 = A0013 - 8;
                                    String str7 = new String(d9o5.A02, d9o5.A01, i22, Charset.forName("UTF-8"));
                                    d9o5.A01 += i22;
                                    strArr2[i21] = str7;
                                }
                                D9O d9o6 = A015.A00;
                                d9o6.A0C(8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    int i23 = d9o6.A00;
                                    int i24 = d9o6.A01;
                                    if (i23 - i24 <= 8) {
                                        break;
                                    }
                                    int A0014 = d9o6.A00();
                                    int A0015 = d9o6.A00() - 1;
                                    if (A0015 < 0 || A0015 >= A0012) {
                                        Log.w("AtomParsers", AnonymousClass000.A05("Skipped metadata with unknown key index: ", A0015));
                                    } else {
                                        String str8 = strArr2[A0015];
                                        int i25 = i24 + A0014;
                                        while (true) {
                                            int i26 = d9o6.A01;
                                            if (i26 >= i25) {
                                                mdtaMetadataEntry = null;
                                                break;
                                            }
                                            int A0016 = d9o6.A00();
                                            if (d9o6.A00() == 1684108385) {
                                                int A0017 = d9o6.A00();
                                                int A0018 = d9o6.A00();
                                                int i27 = A0016 - 16;
                                                byte[] bArr2 = new byte[i27];
                                                d9o6.A0F(bArr2, 0, i27);
                                                mdtaMetadataEntry = new MdtaMetadataEntry(str8, bArr2, A0018, A0017);
                                                break;
                                            }
                                            d9o6.A0C(i26 + A0016);
                                        }
                                        if (mdtaMetadataEntry != null) {
                                            arrayList3.add(mdtaMetadataEntry);
                                        }
                                    }
                                    d9o6.A0C(i24 + A0014);
                                }
                                if (!arrayList3.isEmpty()) {
                                    metadata2 = new Metadata((List) arrayList3);
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i28 = 0; i28 < d9c2.A01.size(); i28++) {
                        C29772D9c d9c3 = (C29772D9c) d9c2.A01.get(i28);
                        if (d9c3.A00 == 1953653099 && (A032 = D9P.A03(d9c3, d9c2.A01(1836476516), -9223372036854775807L, (DrmInitData) null, false, this.A0C)) != null) {
                            C29772D9c A0019 = d9c3.A00(1835297121).A00(1835626086).A00(1937007212);
                            DA2 A016 = A0019.A01(1937011578);
                            if (A016 != null) {
                                r33 = new C29785D9u(A016);
                            } else {
                                DA2 A017 = A0019.A01(1937013298);
                                if (A017 != null) {
                                    r33 = new C29783D9r(A017);
                                } else {
                                    throw new C2101594l("Track has no sample table size information");
                                }
                            }
                            int AUx = r33.AUx();
                            if (AUx == 0) {
                                d9h = new D9h(A032, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
                            } else {
                                DA2 A018 = A0019.A01(1937007471);
                                if (A018 == null) {
                                    A018 = A0019.A01(1668232756);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                D9O d9o7 = A018.A00;
                                D9O d9o8 = A0019.A01(1937011555).A00;
                                D9O d9o9 = A0019.A01(1937011827).A00;
                                DA2 A019 = A0019.A01(1937011571);
                                if (A019 != null) {
                                    d9o = A019.A00;
                                } else {
                                    d9o = null;
                                }
                                DA2 A0110 = A0019.A01(1668576371);
                                if (A0110 != null) {
                                    d9o2 = A0110.A00;
                                } else {
                                    d9o2 = null;
                                }
                                D9i d9i = new D9i(d9o8, d9o7, z2);
                                d9o9.A0C(12);
                                int A022 = d9o9.A02() - 1;
                                int A023 = d9o9.A02();
                                int A024 = d9o9.A02();
                                if (d9o2 != null) {
                                    d9o2.A0C(12);
                                    i2 = d9o2.A02();
                                } else {
                                    i2 = 0;
                                }
                                int i29 = -1;
                                if (d9o != null) {
                                    d9o.A0C(12);
                                    i3 = d9o.A02();
                                    if (i3 > 0) {
                                        i29 = d9o.A02() - 1;
                                    } else {
                                        d9o = null;
                                    }
                                } else {
                                    i3 = 0;
                                }
                                if (r33.AfY() && "audio/raw".equals(A032.A07.A0S) && A022 == 0 && i2 == 0) {
                                    z3 = true;
                                }
                                z3 = false;
                                long j3 = 0;
                                if (!z3) {
                                    jArr = new long[AUx];
                                    iArr = new int[AUx];
                                    int i30 = AUx;
                                    jArr2 = new long[i30];
                                    iArr2 = new int[i30];
                                    long j4 = 0;
                                    long j5 = 0;
                                    i4 = 0;
                                    int i31 = 0;
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (true) {
                                        if (i31 >= AUx) {
                                            break;
                                        }
                                        boolean z6 = true;
                                        while (i32 == 0) {
                                            z6 = d9i.A00();
                                            if (!z6) {
                                                break;
                                            }
                                            j5 = d9i.A02;
                                            i32 = d9i.A01;
                                        }
                                        if (!z6) {
                                            Log.w("AtomParsers", "Unexpected end of chunk data");
                                            jArr = Arrays.copyOf(jArr, i31);
                                            iArr = Arrays.copyOf(iArr, i31);
                                            jArr2 = Arrays.copyOf(jArr2, i31);
                                            iArr2 = Arrays.copyOf(iArr2, i31);
                                            AUx = i31;
                                            break;
                                        }
                                        if (d9o2 != null) {
                                            while (i33 == 0 && i2 > 0) {
                                                D9O d9o10 = d9o2;
                                                i33 = d9o10.A02();
                                                i34 = d9o10.A00();
                                                i2--;
                                            }
                                            i33--;
                                        }
                                        jArr[i31] = j5;
                                        int BZ3 = r33.BZ3();
                                        iArr[i31] = BZ3;
                                        if (BZ3 > i4) {
                                            i4 = BZ3;
                                        }
                                        jArr2[i31] = j4 + ((long) i34);
                                        int i35 = 0;
                                        if (d9o == null) {
                                            i35 = 1;
                                        }
                                        iArr2[i31] = i35;
                                        if (i31 == i29) {
                                            iArr2[i31] = 1;
                                            i3--;
                                            if (i3 > 0) {
                                                i29 = d9o.A02() - 1;
                                            }
                                        }
                                        j4 += (long) A024;
                                        A023--;
                                        if (A023 == 0 && A022 > 0) {
                                            D9O d9o11 = d9o9;
                                            A023 = d9o11.A02();
                                            A024 = d9o11.A00();
                                            A022--;
                                        }
                                        j5 += (long) iArr[i31];
                                        i32--;
                                        i31++;
                                    }
                                    j2 = j4 + ((long) i34);
                                    while (true) {
                                        if (i2 <= 0) {
                                            z4 = true;
                                            break;
                                        } else if (d9o2.A02() != 0) {
                                            z4 = false;
                                            break;
                                        } else {
                                            d9o2.A00();
                                            i2--;
                                        }
                                    }
                                    if (!(i3 == 0 && A023 == 0 && i32 == 0 && A022 == 0 && i33 == 0 && z4)) {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        sb.append(A032.A00);
                                        sb.append(": remainingSynchronizationSamples ");
                                        sb.append(i3);
                                        sb.append(", remainingSamplesAtTimestampDelta ");
                                        sb.append(A023);
                                        sb.append(", remainingSamplesInChunk ");
                                        sb.append(i32);
                                        sb.append(", remainingTimestampDeltaChanges ");
                                        sb.append(A022);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i33);
                                        if (!z4) {
                                            str = ", ctts invalid";
                                        } else {
                                            str = "";
                                        }
                                        sb.append(str);
                                        Log.w("AtomParsers", sb.toString());
                                    }
                                } else {
                                    int i36 = d9i.A05;
                                    long[] jArr4 = new long[i36];
                                    int[] iArr5 = new int[i36];
                                    while (d9i.A00()) {
                                        int i37 = d9i.A00;
                                        jArr4[i37] = d9i.A02;
                                        iArr5[i37] = d9i.A01;
                                    }
                                    Format format = A032.A07;
                                    int A0111 = C25948Bd0.A01(format.A0A, format.A05);
                                    long j6 = (long) A024;
                                    int i38 = 8192 / A0111;
                                    int length2 = iArr5.length;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < length2; i40++) {
                                        i39 += ((iArr5[i40] + i38) - 1) / i38;
                                    }
                                    long[] jArr5 = new long[i39];
                                    int[] iArr6 = new int[i39];
                                    long[] jArr6 = new long[i39];
                                    int[] iArr7 = new int[i39];
                                    int i41 = 0;
                                    int i42 = 0;
                                    int i43 = 0;
                                    for (int i44 = 0; i44 < length2; i44++) {
                                        int i45 = iArr5[i44];
                                        long j7 = jArr4[i44];
                                        while (i45 > 0) {
                                            int min = Math.min(i38, i45);
                                            jArr5[i42] = j7;
                                            int i46 = A0111 * min;
                                            iArr6[i42] = i46;
                                            i43 = Math.max(i43, i46);
                                            jArr6[i42] = ((long) i41) * j6;
                                            iArr7[i42] = 1;
                                            j7 += (long) iArr6[i42];
                                            i41 += min;
                                            i45 -= min;
                                            i42++;
                                        }
                                    }
                                    C29782D9q d9q = new C29782D9q(jArr5, iArr6, i43, jArr6, iArr7, j6 * ((long) i41));
                                    jArr = d9q.A04;
                                    iArr = d9q.A03;
                                    i4 = d9q.A00;
                                    jArr2 = d9q.A05;
                                    iArr2 = d9q.A02;
                                    j2 = d9q.A01;
                                }
                                long j8 = A032.A06;
                                long A043 = C25948Bd0.A04(j2, 1000000, j8);
                                long[] jArr7 = A032.A08;
                                if (jArr7 == null) {
                                    C25948Bd0.A0A(jArr2, j8);
                                    d9h = new D9h(A032, jArr, iArr, i4, jArr2, iArr2, A043);
                                } else {
                                    int length3 = jArr7.length;
                                    if (length3 == 1 && A032.A03 == 1 && (length = jArr2.length) >= 2) {
                                        long j9 = A032.A09[0];
                                        long j10 = jArr7[0];
                                        long j11 = A032.A05;
                                        long A044 = j9 + C25948Bd0.A04(j10, j8, j11);
                                        boolean z7 = true;
                                        int i47 = length - 1;
                                        int max = Math.max(0, Math.min(4, i47));
                                        int max2 = Math.max(0, Math.min(length - 4, i47));
                                        long j12 = jArr2[0];
                                        if (j12 > j9 || j9 >= jArr2[max] || jArr2[max2] >= A044 || A044 > j2) {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            long j13 = (long) A032.A07.A0C;
                                            long A045 = C25948Bd0.A04(j9 - j12, j13, j8);
                                            long A046 = C25948Bd0.A04(j2 - A044, j13, j8);
                                            if (!(A045 == 0 && A046 == 0) && A045 <= 2147483647L && A046 <= 2147483647L) {
                                                C29270Cuw cuw3 = cuw;
                                                cuw3.A00 = (int) A045;
                                                cuw3.A01 = (int) A046;
                                                C25948Bd0.A0A(jArr2, j8);
                                                A042 = C25948Bd0.A04(jArr7[0], 1000000, j11);
                                                d9h = new D9h(A032, jArr, iArr, i4, jArr2, iArr2, A042);
                                            }
                                        }
                                    }
                                    if (length3 == 1 && jArr7[0] == 0) {
                                        long j14 = A032.A09[0];
                                        for (int i48 = 0; i48 < jArr2.length; i48++) {
                                            jArr2[i48] = C25948Bd0.A04(jArr2[i48] - j14, 1000000, j8);
                                        }
                                        A042 = C25948Bd0.A04(j2 - j14, 1000000, j8);
                                        d9h = new D9h(A032, jArr, iArr, i4, jArr2, iArr2, A042);
                                    } else {
                                        boolean z8 = false;
                                        if (A032.A03 == 1) {
                                            z8 = true;
                                        }
                                        int[] iArr8 = new int[length3];
                                        int[] iArr9 = new int[length3];
                                        int i49 = 0;
                                        boolean z9 = false;
                                        int i50 = 0;
                                        int i51 = 0;
                                        while (true) {
                                            long[] jArr8 = A032.A08;
                                            if (i49 >= jArr8.length) {
                                                break;
                                            }
                                            long j15 = A032.A09[i49];
                                            if (j15 != -1) {
                                                long A047 = C25948Bd0.A04(jArr8[i49], A032.A06, A032.A05);
                                                iArr8[i49] = C25948Bd0.A03(jArr2, j15, true, true);
                                                iArr9[i49] = C25948Bd0.A03(jArr2, j15 + A047, z8, false);
                                                while (true) {
                                                    i5 = iArr8[i49];
                                                    i6 = iArr9[i49];
                                                    if (i5 >= i6 || (iArr2[i5] & 1) != 0) {
                                                        i50 += i6 - i5;
                                                        boolean z10 = false;
                                                    } else {
                                                        iArr8[i49] = i5 + 1;
                                                    }
                                                }
                                                i50 += i6 - i5;
                                                boolean z102 = false;
                                                if (i51 != i5) {
                                                    z102 = true;
                                                }
                                                z9 |= z102;
                                                i51 = i6;
                                            }
                                            i49++;
                                        }
                                        boolean z11 = true;
                                        if (i50 == AUx) {
                                            z11 = false;
                                        }
                                        boolean z12 = z9 | z11;
                                        if (z12) {
                                            jArr3 = new long[i50];
                                        } else {
                                            jArr3 = jArr;
                                        }
                                        if (z12) {
                                            iArr3 = new int[i50];
                                        } else {
                                            iArr3 = iArr;
                                        }
                                        if (z12) {
                                            i4 = 0;
                                        }
                                        if (z12) {
                                            iArr4 = new int[i50];
                                        } else {
                                            iArr4 = iArr2;
                                        }
                                        long[] jArr9 = new long[i50];
                                        int i52 = 0;
                                        for (int i53 = 0; i53 < A032.A08.length; i53++) {
                                            long j16 = A032.A09[i53];
                                            int i54 = iArr8[i53];
                                            int i55 = iArr9[i53];
                                            if (z12) {
                                                int i56 = i54;
                                                int i57 = i52;
                                                int i58 = i55 - i54;
                                                System.arraycopy(jArr, i56, jArr3, i57, i58);
                                                System.arraycopy(iArr, i56, iArr3, i57, i58);
                                                System.arraycopy(iArr2, i56, iArr4, i57, i58);
                                            }
                                            while (i54 < i55) {
                                                jArr9[i52] = C25948Bd0.A04(j3, 1000000, A032.A05) + C25948Bd0.A04(jArr2[i54] - j16, 1000000, A032.A06);
                                                if (z12 && iArr3[i52] > i4) {
                                                    i4 = iArr[i54];
                                                }
                                                i52++;
                                                i54++;
                                            }
                                            j3 += A032.A08[i53];
                                        }
                                        d9h = new D9h(A032, jArr3, iArr3, i4, jArr9, iArr4, C25948Bd0.A04(j3, 1000000, A032.A05));
                                    }
                                }
                            }
                            if (d9h.A01 != 0) {
                                arrayList4.add(d9h);
                            }
                        }
                    }
                    int size = arrayList4.size();
                    long j17 = -9223372036854775807L;
                    long j18 = -9223372036854775807L;
                    int i59 = 0;
                    int i60 = -1;
                    while (i59 < size) {
                        D9h d9h2 = (D9h) arrayList4.get(i59);
                        D9k d9k = d9h2.A03;
                        long j19 = d9k.A04;
                        if (j19 == j17) {
                            j19 = d9h2.A02;
                        }
                        j18 = Math.max(j18, j19);
                        D9t d9t = new D9t(d9k, d9h2, this.A09.Brb(i59, d9k.A03));
                        int i61 = d9h2.A00 + 30;
                        Format format2 = d9k.A07;
                        Format format3 = new Format(format2.A0Q, format2.A0L, format2.A0S, format2.A0K, format2.A04, i61, format2.A0F, format2.A08, format2.A01, format2.A0B, format2.A02, format2.A0a, format2.A0E, format2.A0J, format2.A05, format2.A0C, format2.A0A, format2.A06, format2.A07, format2.A0D, format2.A0R, format2.A03, format2.A0G, format2.A0T, format2.A0H, format2.A0I, format2.A0P, format2.A0X, format2.A0Y, format2.A0V, format2.A0U, format2.A0Z, format2.A0N, format2.A0O, format2.A0M, format2.A0W);
                        if (d9k.A03 == 2 && j19 > 0 && (i = d9h2.A01) > 1) {
                            format3 = format3.A05(((float) i) / (((float) j19) / 1000000.0f));
                        }
                        int i62 = d9k.A03;
                        if (i62 == 1) {
                            C29270Cuw cuw4 = cuw;
                            int i63 = cuw4.A00;
                            if (i63 != -1) {
                                z = true;
                            }
                            z = false;
                            if (z) {
                                format3 = format3.A06(i63, cuw.A01);
                            }
                            if (metadata != null) {
                                format3 = format3.A09(metadata);
                            }
                        } else if (i62 == 2 && metadata2 != null) {
                            int i64 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr2 = metadata2.A00;
                                if (i64 >= entryArr2.length) {
                                    break;
                                }
                                Metadata.Entry entry2 = entryArr2[i64];
                                if (entry2 instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry2;
                                    if ("com.android.capture.fps".equals(mdtaMetadataEntry2.A02) && mdtaMetadataEntry2.A01 == 23) {
                                        try {
                                            format3 = format3.A05(ByteBuffer.wrap(mdtaMetadataEntry2.A03).asFloatBuffer().get()).A09(new Metadata(mdtaMetadataEntry2));
                                        } catch (NumberFormatException unused2) {
                                            Log.w("MetadataUtil", "Ignoring invalid framerate");
                                        }
                                    }
                                }
                                i64++;
                            }
                        }
                        d9t.A01.AEh(format3);
                        if (d9k.A03 == 2 && i60 == -1) {
                            i60 = arrayList.size();
                        }
                        arrayList.add(d9t);
                        i59++;
                        j17 = -9223372036854775807L;
                    }
                    this.A02 = i60;
                    this.A08 = j18;
                    D9t[] d9tArr = (D9t[]) arrayList.toArray(new D9t[0]);
                    this.A0D = d9tArr;
                    int length4 = d9tArr.length;
                    long[][] jArr10 = new long[length4][];
                    int[] iArr10 = new int[length4];
                    long[] jArr11 = new long[length4];
                    boolean[] zArr = new boolean[length4];
                    for (int i65 = 0; i65 < length4; i65++) {
                        jArr10[i65] = new long[d9tArr[i65].A03.A01];
                        jArr11[i65] = d9tArr[i65].A03.A07[0];
                    }
                    long j20 = 0;
                    int i66 = 0;
                    while (i66 < length4) {
                        int i67 = -1;
                        long j21 = Long.MAX_VALUE;
                        for (int i68 = 0; i68 < length4; i68++) {
                            if (!zArr[i68]) {
                                long j22 = jArr11[i68];
                                if (j22 <= j21) {
                                    j21 = j22;
                                    i67 = i68;
                                }
                            }
                        }
                        int i69 = iArr10[i67];
                        long[] jArr12 = jArr10[i67];
                        jArr12[i69] = j20;
                        D9h d9h3 = d9tArr[i67].A03;
                        j20 += (long) d9h3.A05[i69];
                        int i70 = i69 + 1;
                        iArr10[i67] = i70;
                        if (i70 < jArr12.length) {
                            jArr11[i67] = d9h3.A07[i70];
                        } else {
                            zArr[i67] = true;
                            i66++;
                        }
                    }
                    this.A0E = jArr10;
                    this.A09.ADE();
                    this.A09.Bet(this);
                    this.A0J.clear();
                    this.A03 = 2;
                } else if (!this.A0J.isEmpty()) {
                    ((C29772D9c) this.A0J.peek()).A01.add(d9c2);
                }
            }
        }
        if (this.A03 != 2) {
            this.A03 = 0;
            this.A00 = 0;
        }
    }

    public final D5Z AVP(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int A002;
        int A003;
        D9t[] d9tArr = this.A0D;
        if (d9tArr.length != 0) {
            int i = this.A02;
            long j6 = j;
            if (i != -1) {
                D9h d9h = d9tArr[i].A03;
                int A004 = A00(d9h, j6);
                if (A004 != -1) {
                    j3 = d9h.A07[A004];
                    j2 = d9h.A06[A004];
                    if (j3 < j && A004 < d9h.A01 - 1 && (A003 = d9h.A00(j6)) != -1 && A003 != A004) {
                        j5 = d9h.A07[A003];
                        j4 = d9h.A06[A003];
                    }
                    j4 = -1;
                    j5 = -9223372036854775807L;
                }
            } else {
                j2 = Long.MAX_VALUE;
                j3 = j;
                j4 = -1;
                j5 = -9223372036854775807L;
            }
            int i2 = 0;
            while (true) {
                D9t[] d9tArr2 = this.A0D;
                if (i2 >= d9tArr2.length) {
                    break;
                }
                if (i2 != this.A02) {
                    D9h d9h2 = d9tArr2[i2].A03;
                    int A005 = A00(d9h2, j3);
                    if (A005 != -1) {
                        j2 = Math.min(d9h2.A06[A005], j2);
                    }
                    if (!(j5 == -9223372036854775807L || (A002 = A00(d9h2, j5)) == -1)) {
                        j4 = Math.min(d9h2.A06[A002], j4);
                    }
                }
                i2++;
            }
            D5Y d5y = new D5Y(j3, j2);
            if (j5 == -9223372036854775807L) {
                return new D5Z(d5y, d5y);
            }
            return new D5Z(d5y, new D5Y(j5, j4));
        }
        D5Y d5y2 = D5Y.A02;
        return new D5Z(d5y2, d5y2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x021b, code lost:
        if (r11 == 1768715124) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r13 >= 262144) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016a, code lost:
        if (r11 == 1835365473) goto L_0x016c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x010a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0000 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0000 A[SYNTHETIC] */
    public final int BYv(C29778D9m d9m, C29704D5q d5q) {
        boolean z;
        boolean z2;
        boolean z3;
        D9t[] d9tArr;
        boolean z4;
        boolean z5;
        boolean z6;
        while (true) {
            int i = this.A03;
            C29778D9m d9m2 = d9m;
            if (i != 0) {
                C29704D5q d5q2 = d5q;
                if (i == 1) {
                    long j = this.A07;
                    int i2 = this.A00;
                    long j2 = j - ((long) i2);
                    long ASL = d9m2.ASL() + j2;
                    D9O d9o = this.A0A;
                    boolean z7 = true;
                    if (d9o != null) {
                        d9m2.readFully(d9o.A02, i2, (int) j2);
                        if (this.A01 == 1718909296) {
                            D9O d9o2 = this.A0A;
                            d9o2.A0C(8);
                            if (d9o2.A00() != 1903435808) {
                                d9o2.A0D(4);
                                while (true) {
                                    if (d9o2.A00 - d9o2.A01 > 0) {
                                        if (d9o2.A00() == 1903435808) {
                                            break;
                                        }
                                    } else {
                                        z6 = false;
                                        break;
                                    }
                                }
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            this.A0C = z6;
                        } else if (!this.A0J.isEmpty()) {
                            ((C29772D9c) this.A0J.peek()).A02.add(new DA2(this.A01, this.A0A));
                        }
                    } else if (j2 < 262144) {
                        d9m2.Bos((int) j2);
                    } else {
                        d5q2.A00 = ASL;
                        z5 = true;
                        A01(ASL);
                        if (!z5 || this.A03 == 2) {
                            z7 = false;
                        }
                        if (!z7) {
                            return 1;
                        }
                    }
                    z5 = false;
                    A01(ASL);
                    z7 = false;
                    if (!z7) {
                    }
                } else if (i == 2) {
                    long ASL2 = d9m2.ASL();
                    if (this.A06 == -1) {
                        int i3 = 0;
                        long j3 = Long.MAX_VALUE;
                        boolean z8 = true;
                        long j4 = Long.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        boolean z9 = true;
                        long j5 = Long.MAX_VALUE;
                        while (true) {
                            d9tArr = this.A0D;
                            if (i3 >= d9tArr.length) {
                                break;
                            }
                            D9t d9t = d9tArr[i3];
                            int i6 = d9t.A00;
                            D9h d9h = d9t.A03;
                            if (i6 != d9h.A01) {
                                long j6 = d9h.A06[i6];
                                long j7 = this.A0E[i3][i6];
                                long j8 = j6 - ASL2;
                                if (j8 >= 0) {
                                    z4 = false;
                                }
                                z4 = true;
                                if ((!z4 && z9) || (z4 == z9 && j8 < j5)) {
                                    z9 = z4;
                                    i5 = i3;
                                    j5 = j8;
                                    j4 = j7;
                                }
                                if (j7 < j3) {
                                    z8 = z4;
                                    i4 = i3;
                                    j3 = j7;
                                }
                            }
                            i3++;
                        }
                        if (j3 == Long.MAX_VALUE || !z8 || j4 < j3 + 10485760) {
                            i4 = i5;
                        }
                        this.A06 = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                        this.A0B = "audio/ac4".equals(d9tArr[i4].A02.A07.A0S);
                    }
                    D9t d9t2 = this.A0D[this.A06];
                    C29687D4y d4y = d9t2.A01;
                    int i7 = d9t2.A00;
                    D9h d9h2 = d9t2.A03;
                    long j9 = d9h2.A06[i7];
                    int i8 = d9h2.A05[i7];
                    long j10 = (j9 - ASL2) + ((long) this.A04);
                    if (j10 < 0 || j10 >= 262144) {
                        d5q2.A00 = j9;
                        return 1;
                    }
                    if (d9t2.A02.A02 == 1) {
                        j10 += 8;
                        i8 -= 8;
                    }
                    d9m2.Bos((int) j10);
                    int i9 = d9t2.A02.A01;
                    if (i9 == 0) {
                        if (this.A0B) {
                            D9O d9o3 = this.A0I;
                            d9o3.A0A(7);
                            byte[] bArr = d9o3.A02;
                            bArr[0] = -84;
                            bArr[1] = 64;
                            bArr[2] = -1;
                            bArr[3] = -1;
                            bArr[4] = (byte) ((i8 >> 16) & 255);
                            bArr[5] = (byte) ((i8 >> 8) & 255);
                            bArr[6] = (byte) (i8 & 255);
                            int i10 = d9o3.A00;
                            d4y.BeK(d9o3, i10);
                            i8 += i10;
                            this.A04 += i10;
                            this.A0B = false;
                        }
                        while (true) {
                            int i11 = this.A04;
                            if (i11 >= i8) {
                                break;
                            }
                            int BeJ = d4y.BeJ(d9m2, i8 - i11, false);
                            this.A04 += BeJ;
                            this.A05 -= BeJ;
                        }
                    } else {
                        byte[] bArr2 = this.A0G.A02;
                        bArr2[0] = 0;
                        bArr2[1] = 0;
                        bArr2[2] = 0;
                        int i12 = 4 - i9;
                        while (this.A04 < i8) {
                            int i13 = this.A05;
                            if (i13 == 0) {
                                d9m2.readFully(bArr2, i12, i9);
                                this.A0G.A0C(0);
                                int A002 = this.A0G.A00();
                                if (A002 >= 0) {
                                    this.A05 = A002;
                                    this.A0H.A0C(0);
                                    d4y.BeK(this.A0H, 4);
                                    this.A04 += 4;
                                    i8 += i12;
                                } else {
                                    throw new C2101594l("Invalid NAL length");
                                }
                            } else {
                                int BeJ2 = d4y.BeJ(d9m2, i13, false);
                                this.A04 += BeJ2;
                                this.A05 -= BeJ2;
                            }
                        }
                    }
                    D9h d9h3 = d9t2.A03;
                    d4y.BeM(d9h3.A07[i7], d9h3.A04[i7], i8, 0, (C29719D6g) null);
                    d9t2.A00++;
                    this.A06 = -1;
                    this.A04 = 0;
                    this.A05 = 0;
                    return 0;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                if (this.A00 == 0) {
                    if (!d9m2.BZ2(this.A0F.A02, 0, 8, true)) {
                        z3 = false;
                        if (z3) {
                            return -1;
                        }
                    } else {
                        this.A00 = 8;
                        this.A0F.A0C(0);
                        D9O d9o4 = this.A0F;
                        this.A07 = d9o4.A05();
                        this.A01 = d9o4.A00();
                    }
                }
                long j11 = this.A07;
                if (j11 == 1) {
                    d9m2.readFully(this.A0F.A02, 8, 8);
                    this.A00 += 8;
                    this.A07 = this.A0F.A06();
                } else if (j11 == 0) {
                    long length = d9m2.getLength();
                    if (length == -1 && !this.A0J.isEmpty()) {
                        length = ((C29772D9c) this.A0J.peek()).A00;
                    }
                    if (length != -1) {
                        this.A07 = (length - d9m2.ASL()) + ((long) this.A00);
                    }
                }
                long j12 = this.A07;
                int i14 = this.A00;
                long j13 = (long) i14;
                if (j12 >= j13) {
                    int i15 = this.A01;
                    if (!(i15 == 1836019574 || i15 == 1953653099 || i15 == 1835297121 || i15 == 1835626086 || i15 == 1937007212 || i15 == 1701082227)) {
                        z = false;
                    }
                    z = true;
                    if (z) {
                        long ASL3 = (d9m2.ASL() + j12) - j13;
                        if (j12 != j13 && i15 == 1835365473) {
                            D9O d9o5 = this.A0I;
                            d9o5.A0A(8);
                            d9m2.BX0(d9o5.A02, 0, 8);
                            this.A0I.A0D(4);
                            if (this.A0I.A00() == 1751411826) {
                                d9m2.Bdd();
                            } else {
                                d9m2.Bos(4);
                            }
                        }
                        this.A0J.push(new C29772D9c(this.A01, ASL3));
                        if (this.A07 == ((long) this.A00)) {
                            A01(ASL3);
                        } else {
                            this.A03 = 0;
                            this.A00 = 0;
                        }
                    } else {
                        if (!(i15 == 1835296868 || i15 == 1836476516 || i15 == 1751411826 || i15 == 1937011556 || i15 == 1937011827 || i15 == 1937011571 || i15 == 1668576371 || i15 == 1701606260 || i15 == 1937011555 || i15 == 1937011578 || i15 == 1937013298 || i15 == 1937007471 || i15 == 1668232756 || i15 == 1953196132 || i15 == 1718909296 || i15 == 1969517665 || i15 == 1801812339)) {
                            z2 = false;
                        }
                        z2 = true;
                        if (z2) {
                            boolean z10 = false;
                            if (i14 == 8) {
                                z10 = true;
                            }
                            D6U.A03(z10);
                            boolean z11 = false;
                            if (j12 <= 2147483647L) {
                                z11 = true;
                            }
                            D6U.A03(z11);
                            D9O d9o6 = new D9O((int) j12);
                            this.A0A = d9o6;
                            System.arraycopy(this.A0F.A02, 0, d9o6.A02, 0, 8);
                            this.A03 = 1;
                        } else {
                            this.A0A = null;
                            this.A03 = 1;
                        }
                    }
                    z3 = true;
                    if (z3) {
                    }
                } else {
                    throw new C2101594l("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    public final void Ber(long j, long j2) {
        this.A0J.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        this.A0B = false;
        if (j == 0) {
            this.A03 = 0;
            this.A00 = 0;
            return;
        }
        D9t[] d9tArr = this.A0D;
        if (d9tArr != null) {
            for (D9t d9t : d9tArr) {
                D9h d9h = d9t.A03;
                int A022 = C25948Bd0.A02(d9h.A07, j2, false);
                while (true) {
                    if (A022 >= 0) {
                        if ((d9h.A04[A022] & 1) != 0) {
                            break;
                        }
                        A022--;
                    } else {
                        A022 = -1;
                        break;
                    }
                }
                if (A022 == -1) {
                    A022 = d9h.A00(j2);
                }
                d9t.A00 = A022;
            }
        }
    }

    public final long AKg() {
        return this.A08;
    }

    public final void AdH(C29790D9z d9z) {
        this.A09 = d9z;
    }
}
