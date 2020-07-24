package p000X;

import android.view.View;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.1wP  reason: invalid class name and case insensitive filesystem */
public final class C44591wP extends C44581wO {
    public final /* synthetic */ ReelDashboardFragment A00;

    public final void BVp(View view) {
    }

    public C44591wP(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void BDU(int i, int i2) {
        ReelDashboardFragment.A0B(this.A00, i);
        if (i != i2) {
            ReelDashboardFragment.A0A(this.A00, i);
        }
    }

    public final void BDW(int i) {
        this.A00.mListAdapter.A03(i, true);
    }

    public final void BDX(int i) {
        this.A00.mListAdapter.A03(i, false);
    }

    public final void BLD(float f, float f2, C32501bN r6) {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (reelDashboardFragment.mListViewPager == reelDashboardFragment.mScrollOwner) {
            reelDashboardFragment.A02.A03((double) f);
        }
    }

    public final void BLO(C32501bN r4, C32501bN r5) {
        C32501bN r1 = C32501bN.IDLE;
        if ((r4 != r1 && this.A00.mScrollOwner == null) || r4 == C32501bN.DRAGGING) {
            ReelDashboardFragment reelDashboardFragment = this.A00;
            reelDashboardFragment.mScrollOwner = reelDashboardFragment.mListViewPager;
        } else if (r4 == r1) {
            ReelDashboardFragment reelDashboardFragment2 = this.A00;
            if (reelDashboardFragment2.mListViewPager == reelDashboardFragment2.mScrollOwner) {
                reelDashboardFragment2.mScrollOwner = null;
            }
        }
    }
}
