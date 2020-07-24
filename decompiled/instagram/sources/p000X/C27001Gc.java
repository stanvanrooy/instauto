package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.1Gc  reason: invalid class name and case insensitive filesystem */
public final class C27001Gc {
    public C97684Ka A00;
    public final Context A01;
    public final C11200ea A02 = new C27051Gh(this);
    public final C11200ea A03 = new C27011Gd(this);
    public final C11200ea A04 = new C27081Gk(this);
    public final C11200ea A05 = new C27031Gf(this);
    public final AnonymousClass121 A06 = new C27071Gj(this);
    public final AnonymousClass1D5 A07;
    public final C26461Dj A08;
    public final AnonymousClass0C1 A09;
    public final boolean A0A;
    public final View A0B;
    public final C27061Gi A0C = new C27061Gi(this);

    public static void A00(C27001Gc r5) {
        View view = r5.A0B;
        if (view != null) {
            CircularImageView circularImageView = (CircularImageView) view.findViewById(C0003R.C0005id.tab_avatar);
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) r5.A0B.findViewById(C0003R.C0005id.tab_icon);
            if (circularImageView == null) {
                return;
            }
            if (AnonymousClass1DN.A02(r5.A09)) {
                circularImageView.setUrl(r5.A09.A06.ASv());
                circularImageView.setVisibility(0);
                colorFilterAlphaImageView.setVisibility(8);
                r5.A0B.setOnLongClickListener(new C54422Xg(r5));
                return;
            }
            circularImageView.setVisibility(8);
            colorFilterAlphaImageView.setVisibility(0);
            r5.A0B.setOnLongClickListener((View.OnLongClickListener) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005a, code lost:
        if (((java.lang.Boolean) p000X.C05640Lj.A00(p000X.AnonymousClass0L7.DIRECT_MAIN_TAB_UNIVERSE_V2, "toasts_enabled", false)).booleanValue() == false) goto L_0x005c;
     */
    public C27001Gc(Context context, AnonymousClass0C1 r5, View view, C26461Dj r7, boolean z, AnonymousClass1D5 r9) {
        this.A09 = r5;
        this.A01 = context;
        this.A0B = view;
        this.A08 = r7;
        this.A0A = z;
        this.A07 = r9;
        if (z) {
            boolean z2 = AnonymousClass1DO.A00().booleanValue() ? true : z2;
            z2 = false;
            if (z2) {
                C97684Ka A052 = C19020sn.A00.A05(context, this.A09, this.A0C);
                this.A00 = A052;
                A052.A01();
            }
        }
    }
}
