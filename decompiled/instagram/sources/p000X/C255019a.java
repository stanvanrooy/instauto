package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.p004ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.19a  reason: invalid class name and case insensitive filesystem */
public class C255019a implements C255119b {
    public static boolean A04;
    public AnonymousClass1PI A00;
    public final AnonymousClass1YK A01 = new AnonymousClass1YJ(this);
    public final RecyclerView A02;
    public final List A03 = new ArrayList();

    public final int AMn() {
        return 0;
    }

    public final boolean AgC() {
        return false;
    }

    public final void BkR(int i) {
        BkS(i, 0);
    }

    public final void A4V(C256219o r2) {
        this.A02.A0w(r2);
    }

    public final void A8n() {
        this.A02.A0V();
    }

    public final AnonymousClass1PI AFX() {
        if (this.A00 == null) {
            this.A00 = (AnonymousClass1PI) this.A02.A0J;
        }
        return this.A00;
    }

    public final View AI1(int i) {
        return this.A02.getChildAt(i);
    }

    public final View AI4(int i) {
        C31391Ya r0 = this.A02.A0L;
        AnonymousClass11J.A00(r0);
        return r0.A0Z(i);
    }

    public final int AI5() {
        return this.A02.getChildCount();
    }

    public final int AKR() {
        if (this.A02.getItemDecorationCount() <= 0) {
            return 0;
        }
        AnonymousClass0DB.A0F("RecyclerViewProxy", "recyclerview doesn't support getDividerHeight with Item Decoration");
        return 0;
    }

    public final int ALs() {
        int A002;
        C31391Ya r1 = this.A02.A0L;
        if (r1 == null || (A002 = C33981do.A00(r1)) == -1) {
            return 0;
        }
        return A002;
    }

    public final void AMW(Rect rect) {
        this.A02.getGlobalVisibleRect(rect);
    }

    public final int AOh() {
        int A012;
        C31391Ya r0 = this.A02.A0L;
        if (r0 == null || (A012 = C33981do.A01(r0)) == -1) {
            return -1;
        }
        return A012;
    }

    public final /* bridge */ /* synthetic */ ViewGroup AaK() {
        return this.A02;
    }

    public final boolean AeF() {
        C31391Ya r1 = this.A02.A0L;
        if (r1 instanceof LinearLayoutManager) {
            return C44641wW.A05((LinearLayoutManager) r1);
        }
        throw new UnsupportedOperationException("Only LinearLayoutManager has a top");
    }

    public final boolean AfZ() {
        return this.A02.isFocused();
    }

    public final void Bem(AnonymousClass1HD r4) {
        int A1i;
        if (A04) {
            RecyclerView recyclerView = this.A02;
            C31391Ya r1 = recyclerView.A0L;
            if (!(r1 instanceof LinearLayoutManager) || !((A1i = ((LinearLayoutManager) r1).A1i()) == 0 || A1i == -1)) {
                C44641wW.A01(recyclerView);
                return;
            }
            return;
        }
        C44641wW.A01(this.A02);
    }

    public final void Bfh(AnonymousClass1PI r3) {
        this.A02.setAdapter((AnonymousClass1PH) r3.AFY());
        this.A00 = r3;
    }

    public final void Bk2(C150536cF r2) {
        this.A02.A0P = r2;
    }

    public final void BkS(int i, int i2) {
        C31391Ya r1 = this.A02.A0L;
        if (r1 == null) {
            return;
        }
        if (r1 instanceof LinearLayoutManager) {
            ((LinearLayoutManager) r1).A1v(i, i2);
        } else if (r1 instanceof FlowingGridLayoutManager) {
            ((FlowingGridLayoutManager) r1).A1h(i, i2);
        } else {
            throw C33981do.A03(r1);
        }
    }

    public final void BkT(C150856cl r3) {
        if (r3 != null) {
            BkS(r3.A00, r3.A01);
        }
    }

    public final void Blf(boolean z) {
        this.A02.setVerticalScrollBarEnabled(z);
    }

    public final void Bow(int i) {
        this.A02.A0h(i);
    }

    public final void Box(int i, int i2) {
        RecyclerView recyclerView = this.A02;
        C31391Ya r2 = recyclerView.A0L;
        if (r2 != null) {
            AnonymousClass6ZZ r1 = new AnonymousClass6ZZ(recyclerView.getContext());
            r1.A00 = i2;
            r1.A00 = i;
            r2.A0t(r1);
        }
    }

    public final void BqW() {
        this.A02.A0d();
    }

    public final Context getContext() {
        return this.A02.getContext();
    }

    public final int getCount() {
        AnonymousClass1PH r0 = this.A02.A0J;
        if (r0 != null) {
            return r0.getItemCount();
        }
        return 0;
    }

    public final ViewParent getParent() {
        return this.A02.getParent();
    }

    public C255019a(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    public final C150856cl AVJ() {
        if (AI5() > 0) {
            return new C150856cl(ALs(), AI1(0).getTop());
        }
        return null;
    }

    public final void Boy(int i, int i2, int i3) {
        Box(i, i2);
    }
}
