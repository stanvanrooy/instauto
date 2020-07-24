package p000X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DAE */
public final class DAE extends DAH {
    public static final int[] A02 = new int[0];
    public final D5P A00;
    public final AtomicReference A01 = new AtomicReference(DefaultTrackSelector$Parameters.A0J);

    public static boolean A02(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static boolean A03(Format format, int i, DAJ daj) {
        if (!A02(i, false) || format.A05 != daj.A00 || format.A0C != daj.A01) {
            return false;
        }
        String str = daj.A02;
        return str == null || TextUtils.equals(str, format.A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != r1) goto L_0x000c;
     */
    public static Point A00(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            boolean z2 = true;
            boolean z3 = false;
            if (i3 > i4) {
                z3 = true;
            }
            if (i <= i2) {
                z2 = false;
            }
        }
        int i5 = i2;
        i2 = i;
        i = i5;
        int i6 = i3 * i;
        int i7 = i4 * i2;
        if (i6 >= i7) {
            return new Point(i2, ((i7 + i3) - 1) / i3);
        }
        return new Point(((i6 + i4) - 1) / i4, i);
    }

    public static List A01(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = trackGroup.A01;
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(Integer.valueOf(i6));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < trackGroup.A01; i8++) {
                Format format = trackGroup.A02[i8];
                int i9 = format.A0F;
                if (i9 > 0 && (i4 = format.A08) > 0) {
                    Point A002 = A00(z, i, i2, i9, i4);
                    int i10 = format.A0F;
                    int i11 = format.A08;
                    int i12 = i10 * i11;
                    if (i10 >= ((int) (((float) A002.x) * 0.98f)) && i11 >= ((int) (((float) A002.y) * 0.98f)) && i12 < i7) {
                        i7 = i12;
                    }
                }
            }
            if (i7 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Format format2 = trackGroup.A02[((Integer) arrayList.get(size)).intValue()];
                    int i13 = format2.A0F;
                    int i14 = -1;
                    if (!(i13 == -1 || (i3 = format2.A08) == -1)) {
                        i14 = i13 * i3;
                    }
                    if (i14 == -1 || i14 > i7) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean A04(Format format, String str) {
        if (str == null || !TextUtils.equals(str, C25948Bd0.A08(format.A0R))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0243, code lost:
        if (r0 < 0) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0245, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0278, code lost:
        if (r19 == -1) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if ((r1 & r26) == 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x027f, code lost:
        if (r0 > 0) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0287, code lost:
        if (r7 == -1) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x028d, code lost:
        if (r7 == -1) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0295, code lost:
        if (r19 == -1) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0297, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0299, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0389, code lost:
        if (A04(r2, "und") != false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x038c, code lost:
        if (r0 != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x050a, code lost:
        if (r1 == false) goto L_0x050c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x01a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x03a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x05ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9 A[LOOP:1: B:18:0x0057->B:91:0x01a9, LOOP_END] */
    public final Pair A07(C29796DAg dAg, int[][][] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        boolean z3;
        C29798DAi dAi;
        boolean z4;
        DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride;
        D5P d5p;
        int[] iArr3;
        String str;
        D5H d5h;
        int i;
        boolean z5;
        D4t d4t;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z7;
        int[] iArr4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) this.A01.get();
        C29796DAg dAg2 = dAg;
        int i14 = dAg2.A00;
        D4t[] d4tArr = new D4t[i14];
        boolean z8 = false;
        int i15 = 0;
        boolean z9 = false;
        while (true) {
            boolean z10 = true;
            if (i15 >= i14) {
                break;
            }
            if (2 == dAg2.A01[i15]) {
                if (!z8) {
                    TrackGroupArray trackGroupArray = dAg2.A02[i15];
                    int[][] iArr5 = iArr[i15];
                    int i16 = iArr2[i15];
                    D5P d5p2 = this.A00;
                    if (!defaultTrackSelector$Parameters.A0G && d5p2 != null) {
                        int i17 = 16;
                        if (defaultTrackSelector$Parameters.A0D) {
                            i17 = 24;
                        }
                        if (defaultTrackSelector$Parameters.A0C) {
                            z7 = true;
                        }
                        z7 = false;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= trackGroupArray.A01) {
                                break;
                            }
                            TrackGroup trackGroup = trackGroupArray.A02[i18];
                            int[] iArr6 = iArr5[i18];
                            int i19 = defaultTrackSelector$Parameters.A03;
                            int i20 = defaultTrackSelector$Parameters.A02;
                            int i21 = defaultTrackSelector$Parameters.A01;
                            DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
                            int i22 = defaultTrackSelector$Parameters2.A06;
                            int i23 = defaultTrackSelector$Parameters2.A05;
                            boolean z11 = defaultTrackSelector$Parameters2.A0I;
                            if (trackGroup.A01 >= 2) {
                                List A012 = A01(trackGroup, i22, i23, z11);
                                if (A012.size() >= 2) {
                                    String str2 = null;
                                    if (!z7) {
                                        HashSet hashSet = new HashSet();
                                        int i24 = 0;
                                        for (int i25 = 0; i25 < A012.size(); i25++) {
                                            String str3 = trackGroup.A02[((Integer) A012.get(i25)).intValue()].A0S;
                                            if (hashSet.add(str3)) {
                                                TrackGroup trackGroup2 = trackGroup;
                                                int i26 = i19;
                                                int i27 = i20;
                                                int i28 = i21;
                                                int i29 = 0;
                                                for (int i30 = 0; i30 < A012.size(); i30++) {
                                                    int intValue = ((Integer) A012.get(i30)).intValue();
                                                    Format format = trackGroup2.A02[intValue];
                                                    int i31 = iArr6[intValue];
                                                    String str4 = str3;
                                                    boolean z12 = false;
                                                    if (A02(i31, false) && (i31 & i17) != 0 && ((str3 == null || C25948Bd0.A0D(format.A0S, str4)) && (((i11 = format.A0F) == -1 || i11 <= i26) && (((i12 = format.A08) == -1 || i12 <= i27) && ((i13 = format.A04) == -1 || i13 <= i28))))) {
                                                        z12 = true;
                                                    }
                                                    if (z12) {
                                                        i29++;
                                                    }
                                                }
                                                if (i29 > i24) {
                                                    i24 = i29;
                                                    str2 = str3;
                                                }
                                            }
                                        }
                                    }
                                    for (int size = A012.size() - 1; size >= 0; size--) {
                                        int intValue2 = ((Integer) A012.get(size)).intValue();
                                        Format format2 = trackGroup.A02[intValue2];
                                        int i32 = iArr6[intValue2];
                                        String str5 = str2;
                                        int i33 = i19;
                                        int i34 = i20;
                                        int i35 = i21;
                                        boolean z13 = false;
                                        if (A02(i32, false) && (i32 & i17) != 0 && ((str2 == null || C25948Bd0.A0D(format2.A0S, str5)) && (((i8 = format2.A0F) == -1 || i8 <= i33) && (((i9 = format2.A08) == -1 || i9 <= i34) && ((i10 = format2.A04) == -1 || i10 <= i35))))) {
                                            z13 = true;
                                        }
                                        if (!z13) {
                                            A012.remove(size);
                                        }
                                    }
                                    if (A012.size() >= 2) {
                                        int size2 = A012.size();
                                        iArr4 = new int[size2];
                                        for (int i36 = 0; i36 < size2; i36++) {
                                            iArr4[i36] = ((Integer) A012.get(i36)).intValue();
                                        }
                                        if (iArr4.length <= 0) {
                                            d4t = d5p2.AB8(trackGroup, iArr4);
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                            iArr4 = A02;
                            if (iArr4.length <= 0) {
                            }
                        }
                    }
                    d4t = null;
                    if (d4t == null) {
                        int i37 = -1;
                        TrackGroup trackGroup3 = null;
                        int i38 = 0;
                        int i39 = 0;
                        int i40 = -1;
                        int i41 = -1;
                        for (int i42 = 0; i42 < trackGroupArray.A01; i42++) {
                            TrackGroup trackGroup4 = trackGroupArray.A02[i42];
                            DefaultTrackSelector$Parameters defaultTrackSelector$Parameters3 = defaultTrackSelector$Parameters;
                            List A013 = A01(trackGroup4, defaultTrackSelector$Parameters3.A06, defaultTrackSelector$Parameters3.A05, defaultTrackSelector$Parameters3.A0I);
                            int[] iArr7 = iArr5[i42];
                            int i43 = 0;
                            while (i43 < trackGroup4.A01) {
                                if (A02(iArr7[i43], defaultTrackSelector$Parameters.A0E)) {
                                    Format format3 = trackGroup4.A02[i43];
                                    if (!A013.contains(Integer.valueOf(i43)) || (((i5 = format3.A0F) != i37 && i5 > defaultTrackSelector$Parameters.A03) || (((i6 = format3.A08) != i37 && i6 > defaultTrackSelector$Parameters.A02) || ((i7 = format3.A04) != i37 && i7 > defaultTrackSelector$Parameters.A01)))) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    if (z6 || defaultTrackSelector$Parameters.A0F) {
                                        int i44 = 1;
                                        if (z6) {
                                            i44 = 2;
                                        }
                                        boolean A022 = A02(iArr7[i43], false);
                                        if (A022) {
                                            i44 += 1000;
                                        }
                                        boolean z14 = false;
                                        int i45 = i39;
                                        if (i44 > i45) {
                                            z14 = true;
                                        }
                                        if (i44 == i45) {
                                            if (defaultTrackSelector$Parameters.A0G) {
                                                int i46 = format3.A04;
                                                i3 = -1;
                                                if (i46 != -1) {
                                                    i3 = i46 - i41;
                                                    if (i41 == -1) {
                                                        i3 = 1;
                                                    }
                                                } else if (i41 == -1) {
                                                    i3 = 0;
                                                }
                                            } else {
                                                int i47 = format3.A0F;
                                                int i48 = -1;
                                                if (!(i47 == -1 || (i4 = format3.A08) == -1)) {
                                                    i48 = i47 * i4;
                                                }
                                                if (i48 != i40) {
                                                    i3 = -1;
                                                    if (i48 != -1) {
                                                        i3 = i48 - i40;
                                                    }
                                                    if (A022 && z6) {
                                                    }
                                                } else {
                                                    int i49 = format3.A04;
                                                    i3 = -1;
                                                    if (i49 != -1) {
                                                        i3 = i49 - i41;
                                                    }
                                                }
                                                i3 = 0;
                                            }
                                        }
                                        if (z14) {
                                            i41 = format3.A04;
                                            int i50 = format3.A0F;
                                            i40 = -1;
                                            if (!(i50 == -1 || (i2 = format3.A08) == -1)) {
                                                i40 = i50 * i2;
                                            }
                                            i38 = i43;
                                            trackGroup3 = trackGroup4;
                                            i39 = i44;
                                        }
                                    }
                                }
                                i43++;
                                i37 = -1;
                            }
                        }
                        if (trackGroup3 == null) {
                            d4t = null;
                        } else {
                            d4t = new D5H(trackGroup3, i38);
                        }
                    }
                    d4tArr[i15] = d4t;
                    z8 = false;
                    if (d4t != null) {
                        z8 = true;
                    }
                }
                if (dAg2.A02[i15].A01 <= 0) {
                    z10 = false;
                }
                z9 |= z10;
            }
            i15++;
        }
        boolean z15 = false;
        boolean z16 = false;
        for (int i51 = 0; i51 < i14; i51++) {
            int i52 = dAg2.A01[i51];
            if (i52 != 1) {
                if (i52 != 2) {
                    if (i52 != 3) {
                        TrackGroupArray trackGroupArray2 = dAg2.A02[i51];
                        int[][] iArr8 = iArr[i51];
                        D5H d5h2 = null;
                        TrackGroup trackGroup5 = null;
                        int i53 = 0;
                        int i54 = 0;
                        for (int i55 = 0; i55 < trackGroupArray2.A01; i55++) {
                            TrackGroup trackGroup6 = trackGroupArray2.A02[i55];
                            int[] iArr9 = iArr8[i55];
                            for (int i56 = 0; i56 < trackGroup6.A01; i56++) {
                                int i57 = iArr9[i56];
                                if (A02(i57, defaultTrackSelector$Parameters.A0E)) {
                                    int i58 = 1;
                                    boolean z17 = false;
                                    if ((trackGroup6.A02[i56].A0D & 1) != 0) {
                                        z17 = true;
                                    }
                                    if (z17) {
                                        i58 = 2;
                                    }
                                    if (A02(i57, false)) {
                                        i58 += 1000;
                                    }
                                    if (i58 > i54) {
                                        i53 = i56;
                                        trackGroup5 = trackGroup6;
                                        i54 = i58;
                                    }
                                }
                            }
                        }
                        if (trackGroup5 != null) {
                            d5h2 = new D5H(trackGroup5, i53);
                        }
                        d4tArr[i51] = d5h2;
                    } else if (!z16) {
                        TrackGroupArray trackGroupArray3 = dAg2.A02[i51];
                        int[][] iArr10 = iArr[i51];
                        TrackGroup trackGroup7 = null;
                        int i59 = 0;
                        int i60 = 0;
                        for (int i61 = 0; i61 < trackGroupArray3.A01; i61++) {
                            TrackGroup trackGroup8 = trackGroupArray3.A02[i61];
                            int[] iArr11 = iArr10[i61];
                            for (int i62 = 0; i62 < trackGroup8.A01; i62++) {
                                if (A02(iArr11[i62], defaultTrackSelector$Parameters.A0E)) {
                                    Format format4 = trackGroup8.A02[i62];
                                    int i63 = format4.A0D & (defaultTrackSelector$Parameters.A00 ^ -1);
                                    int i64 = 1;
                                    boolean z18 = false;
                                    if ((i63 & 1) != 0) {
                                        z18 = true;
                                    }
                                    boolean z19 = false;
                                    if ((i63 & 2) != 0) {
                                        z19 = true;
                                    }
                                    boolean A04 = A04(format4, defaultTrackSelector$Parameters.A0A);
                                    if (!A04) {
                                        if (defaultTrackSelector$Parameters.A0H) {
                                            if (!TextUtils.isEmpty(format4.A0R)) {
                                                z5 = false;
                                            }
                                            z5 = true;
                                        }
                                        if (z18) {
                                            i64 = 3;
                                        } else if (z19) {
                                            if (A04(format4, defaultTrackSelector$Parameters.A09)) {
                                                i64 = 2;
                                            }
                                        }
                                        if (A02(iArr11[i62], false)) {
                                            i64 += 1000;
                                        }
                                        if (i64 <= i60) {
                                            i59 = i62;
                                            trackGroup7 = trackGroup8;
                                            i60 = i64;
                                        }
                                    }
                                    if (z18) {
                                        i = 8;
                                    } else {
                                        i = 4;
                                        if (!z19) {
                                            i = 6;
                                        }
                                    }
                                    i64 = i + (A04 ? 1 : 0);
                                    if (A02(iArr11[i62], false)) {
                                    }
                                    if (i64 <= i60) {
                                    }
                                }
                            }
                        }
                        if (trackGroup7 == null) {
                            d5h = null;
                        } else {
                            d5h = new D5H(trackGroup7, i59);
                        }
                        d4tArr[i51] = d5h;
                        z16 = false;
                        if (d5h != null) {
                            z16 = true;
                        }
                    }
                }
            } else if (!z15) {
                TrackGroupArray trackGroupArray4 = dAg2.A02[i51];
                int[][] iArr12 = iArr[i51];
                if (defaultTrackSelector$Parameters.A0B || !z9) {
                    d5p = this.A00;
                } else {
                    d5p = null;
                }
                D5P d5p3 = d5p;
                D4t d4t2 = null;
                DAI dai = null;
                int i65 = -1;
                int i66 = -1;
                for (int i67 = 0; i67 < trackGroupArray4.A01; i67++) {
                    TrackGroup trackGroup9 = trackGroupArray4.A02[i67];
                    int[] iArr13 = iArr12[i67];
                    for (int i68 = 0; i68 < trackGroup9.A01; i68++) {
                        int i69 = iArr13[i68];
                        if (A02(i69, defaultTrackSelector$Parameters.A0E)) {
                            DAI dai2 = new DAI(trackGroup9.A02[i68], defaultTrackSelector$Parameters, i69);
                            if (dai == null || dai2.compareTo(dai) > 0) {
                                i65 = i67;
                                i66 = i68;
                                dai = dai2;
                            }
                        }
                    }
                }
                if (i65 != -1) {
                    TrackGroup trackGroup10 = trackGroupArray4.A02[i65];
                    if (!defaultTrackSelector$Parameters.A0G && d5p != null) {
                        int[] iArr14 = iArr12[i65];
                        boolean z20 = defaultTrackSelector$Parameters.A0C;
                        HashSet hashSet2 = new HashSet();
                        DAJ daj = null;
                        int i70 = 0;
                        for (int i71 = 0; i71 < trackGroup10.A01; i71++) {
                            Format format5 = trackGroup10.A02[i71];
                            int i72 = format5.A05;
                            int i73 = format5.A0C;
                            if (z20) {
                                str = null;
                            } else {
                                str = format5.A0S;
                            }
                            DAJ daj2 = new DAJ(i72, i73, str);
                            if (hashSet2.add(daj2)) {
                                TrackGroup trackGroup11 = trackGroup10;
                                int i74 = 0;
                                for (int i75 = 0; i75 < trackGroup11.A01; i75++) {
                                    if (A03(trackGroup11.A02[i75], iArr14[i75], daj2)) {
                                        i74++;
                                    }
                                }
                                if (i74 > i70) {
                                    i70 = i74;
                                    daj = daj2;
                                }
                            }
                        }
                        if (i70 > 1) {
                            iArr3 = new int[i70];
                            int i76 = 0;
                            for (int i77 = 0; i77 < trackGroup10.A01; i77++) {
                                if (A03(trackGroup10.A02[i77], iArr14[i77], daj)) {
                                    iArr3[i76] = i77;
                                    i76++;
                                }
                            }
                        } else {
                            iArr3 = A02;
                        }
                        if (iArr3.length > 0) {
                            d4t2 = d5p3.AB8(trackGroup10, iArr3);
                        }
                    }
                    d4t2 = new D5H(trackGroup10, i66);
                }
                d4tArr[i51] = d4t2;
                z15 = false;
                if (d4t2 != null) {
                    z15 = true;
                }
            }
        }
        for (int i78 = 0; i78 < i14; i78++) {
            if (!defaultTrackSelector$Parameters.A08.get(i78)) {
                TrackGroupArray trackGroupArray5 = dAg2.A02[i78];
                Map map = (Map) defaultTrackSelector$Parameters.A07.get(i78);
                if (map != null) {
                    boolean containsKey = map.containsKey(trackGroupArray5);
                    z4 = true;
                }
                z4 = false;
                if (z4) {
                    Map map2 = (Map) defaultTrackSelector$Parameters.A07.get(i78);
                    if (map2 != null) {
                        defaultTrackSelector$SelectionOverride = (DefaultTrackSelector$SelectionOverride) map2.get(trackGroupArray5);
                    } else {
                        defaultTrackSelector$SelectionOverride = null;
                    }
                    if (defaultTrackSelector$SelectionOverride != null) {
                        if (defaultTrackSelector$SelectionOverride.A01 == 1) {
                            d4tArr[i78] = new D5H(trackGroupArray5.A02[defaultTrackSelector$SelectionOverride.A00], defaultTrackSelector$SelectionOverride.A02[0]);
                        } else {
                            d4tArr[i78] = this.A00.AB8(trackGroupArray5.A02[defaultTrackSelector$SelectionOverride.A00], defaultTrackSelector$SelectionOverride.A02);
                        }
                    }
                }
            }
            d4tArr[i78] = null;
        }
        C29798DAi[] dAiArr = new C29798DAi[i14];
        for (int i79 = 0; i79 < i14; i79++) {
            if (defaultTrackSelector$Parameters.A08.get(i79) || (dAg2.A01[i79] != 6 && d4tArr[i79] == null)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                dAi = C29798DAi.A01;
            } else {
                dAi = null;
            }
            dAiArr[i79] = dAi;
        }
        int i80 = defaultTrackSelector$Parameters.A04;
        if (i80 != 0) {
            boolean z21 = false;
            int i81 = 0;
            int i82 = -1;
            int i83 = -1;
            while (true) {
                if (i81 >= dAg2.A00) {
                    z = true;
                    break;
                }
                int i84 = dAg2.A01[i81];
                D4t d4t3 = d4tArr[i81];
                if ((i84 == 1 || i84 == 2) && d4t3 != null) {
                    int[][] iArr15 = iArr[i81];
                    TrackGroupArray trackGroupArray6 = dAg2.A02[i81];
                    if (d4t3 != null) {
                        int A002 = trackGroupArray6.A00(d4t3.AYo());
                        int i85 = 0;
                        while (true) {
                            if (i85 < d4t3.length()) {
                                if ((iArr15[A002][d4t3.ANV(i85)] & 32) != 32) {
                                    break;
                                }
                                i85++;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (i84 != 1) {
                                if (i82 != -1) {
                                    break;
                                }
                                i82 = i81;
                            } else if (i83 != -1) {
                                break;
                            } else {
                                i83 = i81;
                            }
                        } else {
                            continue;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                i81++;
            }
            z = false;
            if (!(i83 == -1 || i82 == -1)) {
                z21 = true;
            }
            if (z && z21) {
                C29798DAi dAi2 = new C29798DAi(i80);
                dAiArr[i83] = dAi2;
                dAiArr[i82] = dAi2;
            }
        }
        return Pair.create(dAiArr, d4tArr);
    }

    public final void A08(DAG dag) {
        C29808DAs dAs;
        DAG dag2 = dag;
        SparseArray sparseArray = dag2.A0H;
        SparseBooleanArray sparseBooleanArray = dag2.A0I;
        String str = dag2.A07;
        String str2 = dag2.A08;
        boolean z = dag2.A0F;
        int i = dag2.A00;
        boolean z2 = dag2.A0E;
        boolean z3 = dag2.A0A;
        boolean z4 = dag2.A0B;
        int i2 = dag2.A03;
        int i3 = dag2.A02;
        int i4 = dag2.A01;
        boolean z5 = dag2.A0D;
        boolean z6 = dag2.A0C;
        int i5 = i3;
        int i6 = i4;
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        int i7 = i2;
        boolean z12 = z;
        int i8 = i;
        SparseArray sparseArray2 = sparseArray;
        SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = new DefaultTrackSelector$Parameters(sparseArray2, sparseBooleanArray2, str, str2, z12, i8, z9, z10, z11, i7, i5, i6, z7, z8, dag2.A06, dag2.A05, dag2.A0G, dag2.A04, dag2.A09);
        D6U.A01(defaultTrackSelector$Parameters);
        if (!((DefaultTrackSelector$Parameters) this.A01.getAndSet(defaultTrackSelector$Parameters)).equals(defaultTrackSelector$Parameters) && (dAs = this.A00) != null) {
            dAs.BSK();
        }
    }

    public DAE(D5P d5p) {
        this.A00 = d5p;
    }
}
