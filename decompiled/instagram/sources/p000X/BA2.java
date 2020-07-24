package p000X;

import android.app.Dialog;
import android.text.method.LinkMovementMethod;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.BA2 */
public final class BA2 extends C44281vt {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0RN A01;
    public final /* synthetic */ AnonymousClass0CL A02;

    public final int getRunnableId() {
        return 445;
    }

    public BA2(FragmentActivity fragmentActivity, AnonymousClass0CL r2, AnonymousClass0RN r3) {
        this.A00 = fragmentActivity;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void A01(Exception exc) {
        AnonymousClass0QD.A09("Could not determine TOS display status", exc);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            FragmentActivity fragmentActivity = this.A00;
            AnonymousClass0CL r5 = this.A02;
            AnonymousClass0RN r4 = this.A01;
            String string = fragmentActivity.getString(C0003R.string.mvp_terms_block, new Object[]{fragmentActivity.getString(C0003R.string.mvp_ig_terms_url, new Object[]{fragmentActivity.getString(C0003R.string.landing_terms)}), fragmentActivity.getString(C0003R.string.mvp_ig_privacy_url, new Object[]{fragmentActivity.getString(C0003R.string.privacy_policy)}), fragmentActivity.getString(C0003R.string.mvp_ig_learn_more_url, new Object[]{fragmentActivity.getString(C0003R.string.mvp_terms_learn_more_span)})});
            AnonymousClass2OA r2 = new AnonymousClass2OA(fragmentActivity);
            r2.A07(C0003R.string.tos_dialog_title);
            r2.A0M(C46031z1.A02(new AVE(r2, string), new String[0]));
            r2.A0B.setMovementMethod(LinkMovementMethod.getInstance());
            r2.A0U(false);
            r2.A0A(C0003R.string.mvp_terms_continue, new BA5(fragmentActivity, r4, r5));
            Dialog A03 = r2.A03();
            A03.setOnKeyListener(new BA9(fragmentActivity));
            A03.show();
            new BAE(AnonymousClass0QT.A00(r5, r4).A02("tos_dialog_displayed")).A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.A02 == false) goto L_0x000f;
     */
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        BA7 A002 = BA1.A00(this.A00);
        if (A002.A01) {
            z = true;
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
