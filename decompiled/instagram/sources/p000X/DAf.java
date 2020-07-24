package p000X;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: X.DAf */
public abstract class DAf {
    public C29808DAs A00;

    public DAL A05(C29804DAo[] dAoArr, TrackGroupArray trackGroupArray) {
        TrackGroupArray trackGroupArray2;
        int[] iArr;
        DAH dah = (DAH) this;
        int length = dAoArr.length;
        int i = length + 1;
        int[] iArr2 = new int[i];
        TrackGroup[][] trackGroupArr = new TrackGroup[i][];
        int[][][] iArr3 = new int[i][][];
        int i2 = 0;
        while (true) {
            trackGroupArray2 = trackGroupArray;
            if (i2 >= i) {
                break;
            }
            int i3 = trackGroupArray2.A01;
            trackGroupArr[i2] = new TrackGroup[i3];
            iArr3[i2] = new int[i3][];
            i2++;
        }
        int[] iArr4 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr4[i4] = dAoArr[i4].Bqx();
        }
        for (int i5 = 0; i5 < trackGroupArray2.A01; i5++) {
            TrackGroup trackGroup = trackGroupArray2.A02[i5];
            int i6 = length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = i6;
                    break;
                }
                C29804DAo dAo = dAoArr[i7];
                for (int i9 = 0; i9 < trackGroup.A01; i9++) {
                    int Bqt = dAo.Bqt(trackGroup.A02[i9]) & 7;
                    if (Bqt > i8) {
                        if (Bqt == 4) {
                            break;
                        }
                        i6 = i7;
                        i8 = Bqt;
                    }
                }
                i7++;
            }
            if (i7 == length) {
                iArr = new int[trackGroup.A01];
            } else {
                C29804DAo dAo2 = dAoArr[i7];
                iArr = new int[trackGroup.A01];
                for (int i10 = 0; i10 < trackGroup.A01; i10++) {
                    iArr[i10] = dAo2.Bqt(trackGroup.A02[i10]);
                }
            }
            int i11 = iArr2[i7];
            trackGroupArr[i7][i11] = trackGroup;
            iArr3[i7][i11] = iArr;
            iArr2[i7] = i11 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[length];
        int[] iArr5 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr2[i12];
            trackGroupArrayArr[i12] = new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr[i12], i13));
            iArr3[i12] = (int[][]) Arrays.copyOf(iArr3[i12], i13);
            iArr5[i12] = dAoArr[i12].AYr();
        }
        int i14 = iArr2[length];
        C29796DAg dAg = new C29796DAg(iArr5, trackGroupArrayArr, iArr4, iArr3, new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr[length], i14)));
        Pair A07 = dah.A07(dAg, iArr3, iArr4);
        return new DAL((C29798DAi[]) A07.first, (D4t[]) A07.second, dAg);
    }

    public void A06(Object obj) {
        ((DAH) this).A00 = (C29796DAg) obj;
    }
}
