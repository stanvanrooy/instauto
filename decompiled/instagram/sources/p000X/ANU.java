package p000X;

import com.facebook.C0003R;
import java.lang.ref.WeakReference;

/* renamed from: X.ANU */
public final class ANU extends C17920r1 {
    public final WeakReference A00;
    public final boolean A01;

    public ANU(boolean z, ANS ans) {
        this.A01 = z;
        this.A00 = new WeakReference(ans);
    }

    public final void onFail(C43791v5 r5) {
        int A03 = AnonymousClass0Z0.A03(-1612405363);
        super.onFail(r5);
        ANS ans = (ANS) this.A00.get();
        if (ans != null) {
            if (this.A01) {
                ans.A00(false);
            } else {
                AnonymousClass5F9.A00(ans.A04.A02, C0003R.string.error);
            }
        }
        AnonymousClass0Z0.A0A(-997070321, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-597740441);
        int A032 = AnonymousClass0Z0.A03(-1622115564);
        super.onSuccess((C28691Ms) obj);
        ANS ans = (ANS) this.A00.get();
        if (ans != null) {
            if (this.A01) {
                ans.A00(true);
            } else {
                AMF amf = ans.A03;
                AMH amh = amf.A01;
                if (amh != null) {
                    amh.A01(amf.A05);
                }
            }
        }
        AnonymousClass0Z0.A0A(1860381673, A032);
        AnonymousClass0Z0.A0A(-1939179616, A03);
    }
}
