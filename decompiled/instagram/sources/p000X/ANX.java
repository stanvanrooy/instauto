package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.ANX */
public final class ANX implements View.OnClickListener {
    public final /* synthetic */ ANV A00;
    public final /* synthetic */ CharSequence A01;

    public ANX(ANV anv, CharSequence charSequence) {
        this.A00 = anv;
        this.A01 = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r2 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r2 == false) goto L_0x009e;
     */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int A05 = AnonymousClass0Z0.A05(-681977786);
        ANS ans = this.A00.A01;
        if (ans != null) {
            String charSequence = this.A01.toString();
            if (charSequence.equals(ans.A04.A02.getString(C0003R.string.enable_comments)) && ans.A03.A0H.A0I.A0B) {
                ans.A02.A06(true);
            } else if (!charSequence.equals(ans.A04.A02.getString(C0003R.string.disable_comments)) || ans.A03.A0H.A0I.A0B) {
                if (charSequence.equals(ans.A04.A02.getString(C0003R.string.enable_requests_to_join))) {
                    AMH amh = ans.A03.A01;
                    if (amh != null) {
                        boolean z3 = amh.A04;
                        z2 = true;
                    }
                    z2 = false;
                    if (!z2) {
                        ans.A02.A07(true);
                    }
                }
                if (charSequence.equals(ans.A04.A02.getString(C0003R.string.disable_requests_to_join))) {
                    AMH amh2 = ans.A03.A01;
                    if (amh2 != null) {
                        boolean z4 = amh2.A04;
                        z = true;
                    }
                    z = false;
                    if (z) {
                        ans.A02.A07(false);
                    }
                }
                if (charSequence.equals(ans.A04.A02.getString(C0003R.string.enable_realtime_broadcaster_questions))) {
                    ans.A01.BrX(true, new ANY(ans));
                } else if (charSequence.equals(ans.A04.A02.getString(C0003R.string.disable_realtime_broadcaster_questions))) {
                    ans.A01.BrX(false, new ANW(ans));
                } else if (charSequence.equals(ans.A04.A02.getString(C0003R.string.copy_link_url))) {
                    C23470ANr aNr = ans.A02;
                    FragmentActivity fragmentActivity = aNr.A0U;
                    AnonymousClass1AM A052 = fragmentActivity.A05();
                    AnonymousClass1L8 A002 = AnonymousClass1L8.A00(fragmentActivity);
                    AnonymousClass0C1 r10 = aNr.A0Z;
                    C144126Ej.A03(fragmentActivity, A052, A002, r10.A06, aNr.A0B, aNr.A0F, aNr.A0W, r10);
                } else if (charSequence.equals(ans.A04.A02.getString(C0003R.string.share_to))) {
                    C23470ANr aNr2 = ans.A02;
                    FragmentActivity fragmentActivity2 = aNr2.A0U;
                    AnonymousClass1AM A053 = fragmentActivity2.A05();
                    AnonymousClass1L8 A003 = AnonymousClass1L8.A00(fragmentActivity2);
                    AnonymousClass0C1 r102 = aNr2.A0Z;
                    C144126Ej.A04(fragmentActivity2, A053, A003, r102.A06, aNr2.A0B, aNr2.A0F, aNr2.A0W, r102);
                }
            } else {
                ans.A02.A06(false);
            }
        }
        AnonymousClass0Z0.A0C(-1570530238, A05);
    }
}
