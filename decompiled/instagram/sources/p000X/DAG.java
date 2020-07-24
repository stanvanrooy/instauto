package p000X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DAG */
public final class DAG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final SparseArray A0H;
    public final SparseBooleanArray A0I;

    public final void A00(int i, boolean z) {
        if (this.A0I.get(i) == z) {
            return;
        }
        if (z) {
            this.A0I.put(i, true);
        } else {
            this.A0I.delete(i);
        }
    }

    public DAG() {
        this(DefaultTrackSelector$Parameters.A0J);
    }

    public DAG(DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        SparseArray sparseArray = defaultTrackSelector$Parameters.A07;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A0H = sparseArray2;
        this.A0I = defaultTrackSelector$Parameters.A08.clone();
        this.A07 = defaultTrackSelector$Parameters.A09;
        this.A08 = defaultTrackSelector$Parameters.A0A;
        this.A0F = defaultTrackSelector$Parameters.A0H;
        this.A00 = defaultTrackSelector$Parameters.A00;
        this.A0E = defaultTrackSelector$Parameters.A0G;
        this.A0A = defaultTrackSelector$Parameters.A0C;
        this.A0B = defaultTrackSelector$Parameters.A0D;
        this.A03 = defaultTrackSelector$Parameters.A03;
        this.A02 = defaultTrackSelector$Parameters.A02;
        this.A01 = defaultTrackSelector$Parameters.A01;
        this.A0D = defaultTrackSelector$Parameters.A0F;
        this.A0C = defaultTrackSelector$Parameters.A0E;
        this.A06 = defaultTrackSelector$Parameters.A06;
        this.A05 = defaultTrackSelector$Parameters.A05;
        this.A0G = defaultTrackSelector$Parameters.A0I;
        this.A04 = defaultTrackSelector$Parameters.A04;
        this.A09 = defaultTrackSelector$Parameters.A0B;
    }
}
