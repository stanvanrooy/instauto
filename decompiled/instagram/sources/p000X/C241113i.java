package p000X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.reels.fragment.ReelViewerFragment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.13i  reason: invalid class name and case insensitive filesystem */
public final class C241113i extends C241213j implements AnonymousClass0QB, AnonymousClass0C2 {
    public String A00;
    public Activity A01;
    public Dialog A02;
    public final C23300zv A03;
    public final C11200ea A04 = new C241713o(this);
    public final AnonymousClass0C1 A05;
    public final Set A06;
    public final Context A07;
    public final C241813p A08;

    public final void Aqy(Activity activity) {
    }

    public final void Aqz(Activity activity) {
    }

    public final void Ar1(Activity activity) {
    }

    public static C241113i A01(AnonymousClass0C1 r1) {
        return (C241113i) r1.AV9(C241113i.class);
    }

    public static boolean A02(C241113i r6) {
        AnonymousClass0C1 r1 = r6.A05;
        if (r1 == null || r6.A01 == null || !r1.AgN()) {
            return false;
        }
        if (C14090jk.A00(r1) || C16180oA.A00(r6.A05).A00.getBoolean("rageshake_enabled", false) || ((Boolean) AnonymousClass0L6.A02(r6.A05, AnonymousClass0L7.RAGE_SHAKE_WHITELIST, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return true;
        }
        return false;
    }

    public final DialogInterface.OnDismissListener A04() {
        return new C98414Na(this);
    }

    public final boolean A07() {
        String A0O;
        C241113i A012;
        Context context = this.A07;
        Activity activity = this.A01;
        if (activity == null || context == null) {
            return false;
        }
        C241813p r4 = this.A08;
        AnonymousClass0C1 r5 = this.A05;
        String str = this.A00;
        AnonymousClass5F4 r2 = new AnonymousClass5F4(activity);
        r2.A01(C0003R.string.rageshake_title);
        r2.A0A(C241813p.A05(activity, r5), new C1189958r(r4, activity, r5, str));
        r2.A08(true);
        r2.A09(true);
        if (C14090jk.A01(r5)) {
            r2.A04(C89593uV.A01(context));
        }
        Dialog A002 = r2.A00();
        this.A02 = A002;
        A002.setOnDismissListener(A04());
        this.A02.show();
        for (AnonymousClass34L r22 : this.A06) {
            C39941no A1E = r22.A00.A1E();
            if (!(!A1E.Aho() || (A0O = A1E.A0O(r22.A00.A1F)) == null || (A012 = A01(r22.A00.A1F)) == null)) {
                A012.A00 = A0O;
            }
            ReelViewerFragment.A0m(r22.A00, "rage_shake_dialog");
        }
        return true;
    }

    public final void Ar6(Activity activity) {
        if (activity instanceof FragmentActivity) {
            this.A01 = activity;
            if (A02(this)) {
                A05();
            }
        }
    }

    public C241113i(Context context, AnonymousClass0C1 r3) {
        super(context);
        this.A07 = context;
        this.A05 = r3;
        this.A03 = C23300zv.A00(r3);
        this.A06 = new HashSet();
        this.A08 = new C241813p();
    }

    public final void Ar2(Activity activity) {
        A06();
        C241813p r1 = this.A08;
        C156356m1 r0 = r1.A00;
        if (r0 != null) {
            r0.A08();
            r1.A00 = null;
        }
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.dismiss();
            this.A02 = null;
        }
        this.A01 = null;
    }

    public final void onUserSessionStart(boolean z) {
        int A032 = AnonymousClass0Z0.A03(1840746934);
        this.A03.A02(C242013r.class, this.A04);
        AnonymousClass0QA.A00.A00(this);
        AnonymousClass0Z0.A0A(-547258437, A032);
    }

    public final void onUserSessionWillEnd(boolean z) {
        A06();
        AnonymousClass0QA.A00.A01(this);
        this.A03.A03(C242013r.class, this.A04);
        this.A01 = null;
    }
}
