package p000X;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.C0003R;

/* renamed from: X.19c  reason: invalid class name and case insensitive filesystem */
public final class C255219c {
    public static boolean A05;
    public static final C255319d A06 = new C255319d();
    public AnonymousClass1EW A00;
    public AnonymousClass7KE A01;
    public final int A02 = C0003R.C0005id.action_bar_container;
    public final View.OnClickListener A03 = new AnonymousClass7A1(this);
    public final AppCompatActivity A04;

    public static final void A00(C255219c r3) {
        AnonymousClass1HD A0L = r3.A04.A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L instanceof AnonymousClass1HM) {
            C31221Wz A012 = C31201Wx.A01(r3.A04);
            if (A012 != null && !A012.A0Q()) {
                AnonymousClass1EW r0 = r3.A00;
                if (r0 == null) {
                    C13150hy.A03("actionBarService");
                }
                r0.A0F((AnonymousClass1HM) A0L);
            }
        } else if (A0L instanceof C11850fm) {
            AnonymousClass1EW r02 = r3.A00;
            if (r02 == null) {
                C13150hy.A03("actionBarService");
            }
            ViewGroup viewGroup = r02.A07;
            C13150hy.A01(viewGroup, "actionBarService.actionBar");
            viewGroup.setVisibility(8);
        } else {
            AnonymousClass1EW r1 = r3.A00;
            if (r1 == null) {
                C13150hy.A03("actionBarService");
            }
            r1.A0F((AnonymousClass1HM) null);
        }
    }

    public C255219c(AppCompatActivity appCompatActivity) {
        C13150hy.A02(appCompatActivity, "activity");
        this.A04 = appCompatActivity;
    }
}
