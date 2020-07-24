package p000X;

import com.facebook.C0003R;
import java.lang.ref.WeakReference;

/* renamed from: X.ANT */
public final class ANT extends C17920r1 {
    public final WeakReference A00;
    public final WeakReference A01;
    public final boolean A02;

    public ANT(boolean z, ANS ans, AnonymousClass79M r4) {
        this.A02 = z;
        this.A01 = new WeakReference(ans);
        this.A00 = new WeakReference(r4);
    }

    public final void onFail(C43791v5 r4) {
        ANV anv;
        int i;
        int A03 = AnonymousClass0Z0.A03(-653720846);
        super.onFail(r4);
        ANS ans = (ANS) this.A01.get();
        if (ans != null) {
            if (this.A02) {
                anv = ans.A04;
                i = C0003R.string.unable_to_disable_comments;
            } else {
                anv = ans.A04;
                i = C0003R.string.unable_to_enable_comments;
            }
            AnonymousClass5F9.A00(anv.A02, i);
        }
        AnonymousClass0Z0.A0A(-2044708544, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1195845471);
        int A032 = AnonymousClass0Z0.A03(-1708234832);
        super.onSuccess((C28691Ms) obj);
        AnonymousClass79M r1 = (AnonymousClass79M) this.A00.get();
        if (r1 != null) {
            r1.A0F = !this.A02;
        }
        ANS ans = (ANS) this.A01.get();
        if (ans != null) {
            if (this.A02) {
                ans.A03.A0H.A0D(true);
            } else {
                ans.A03.A0H.A0D(false);
            }
        }
        AnonymousClass0Z0.A0A(1829673802, A032);
        AnonymousClass0Z0.A0A(358700898, A03);
    }
}
