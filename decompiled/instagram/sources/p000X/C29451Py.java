package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;

/* renamed from: X.1Py  reason: invalid class name and case insensitive filesystem */
public final class C29451Py extends C29121Or {
    public AnonymousClass1VI A00;
    public C28081Ki A01;
    public final AnonymousClass1LH A02;
    public final Context A03;
    public final AnonymousClass0C1 A04;
    public final boolean A05;

    public final int AaQ(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r2, Object obj, Object obj2) {
        C51852Mj r3 = (C51852Mj) obj;
        C49022Ak r4 = (C49022Ak) obj2;
        if (r4.Ai7()) {
            r2.A00(1);
            return;
        }
        r2.A00(0);
        this.A01.A3d(r3, r4);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return ((C51852Mj) obj).getId().hashCode();
    }

    public final void BVd(View view, int i, Object obj, Object obj2) {
        if (this.A05) {
            this.A01.BZm((C51852Mj) obj, view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.A05) {
            this.A01.Brz(view);
        }
    }

    public C29451Py(Context context, AnonymousClass0C1 r2, AnonymousClass1LH r3, boolean z) {
        this.A03 = context;
        this.A04 = r2;
        this.A02 = r3;
        this.A05 = z;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(-1328533330);
        C51852Mj r6 = (C51852Mj) obj;
        C49022Ak r7 = (C49022Ak) obj2;
        if (i == 0) {
            C57012dQ.A01((C57002dP) view.getTag(), r6, r7, this.A02);
            if (!this.A05) {
                this.A01.BZm(r6, view);
            }
        } else if (i == 1) {
            this.A00.A07(this.A04, view, r6, r7);
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0Z0.A0A(1811840482, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0Z0.A0A(-1339605983, A032);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        View A002;
        int i2;
        int A032 = AnonymousClass0Z0.A03(1237737987);
        if (i == 0) {
            A002 = C57012dQ.A00(this.A03, viewGroup);
            i2 = -2091136143;
        } else if (i == 1) {
            A002 = AnonymousClass1VI.A00(this.A03, viewGroup, 1);
            i2 = 608029114;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0Z0.A0A(94120912, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return A002;
    }
}
