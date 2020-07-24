package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.forker.Process;

/* renamed from: X.1Pr  reason: invalid class name and case insensitive filesystem */
public final class C29381Pr extends C29121Or {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
        if (this.A03) {
            r2.A00(1);
        }
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return i;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        if (i == 0) {
            return this.A02;
        }
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(1763085996);
        if (i == 0) {
            if (this.A02 != view.getLayoutParams().height) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.A02;
                view.setLayoutParams(layoutParams);
            }
            int i2 = this.A00;
            if (i2 != 0) {
                view.setBackgroundColor(C019000b.A00(view.getContext(), i2));
            }
        }
        AnonymousClass0Z0.A0A(-496761143, A032);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int i2;
        FrameLayout frameLayout;
        int A032 = AnonymousClass0Z0.A03(1214308490);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = -2024317049;
            frameLayout = from.inflate(C0003R.layout.gap_binder_layout, viewGroup, false);
        } else if (i == 1) {
            FrameLayout frameLayout2 = (FrameLayout) from.inflate(C0003R.layout.divider_layout, viewGroup, false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.findViewById(C0003R.C0005id.divider).getLayoutParams();
            int i3 = this.A01;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
            i2 = 803393162;
            frameLayout = frameLayout2;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A05("Illegal view type: ", i));
            AnonymousClass0Z0.A0A(1173193140, A032);
            throw illegalArgumentException;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return frameLayout;
    }

    public final void A00(int i) {
        this.A02 = i;
    }
}
