package p000X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.forker.Process;
import java.util.Arrays;

/* renamed from: X.DNM */
public final class DNM {
    public boolean A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public int[] A05;
    public final /* synthetic */ StaggeredGridLayoutManager A06;

    public final void A00() {
        this.A02 = -1;
        this.A01 = Process.WAIT_RESULT_TIMEOUT;
        this.A04 = false;
        this.A03 = false;
        this.A00 = false;
        int[] iArr = this.A05;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public DNM(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.A06 = staggeredGridLayoutManager;
        A00();
    }

    public final void A01() {
        int A062;
        if (this.A04) {
            A062 = this.A06.A05.A02();
        } else {
            A062 = this.A06.A05.A06();
        }
        this.A01 = A062;
    }
}
