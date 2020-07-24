package p000X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.AH8 */
public final class AH8 extends AnonymousClass2WG implements AnonymousClass1Ab {
    public AnonymousClass2WJ A00;
    public WeakReference A01;
    public final C54042Vn A02;
    public final Context A03;
    public final /* synthetic */ AnonymousClass2W2 A04;

    public AH8(AnonymousClass2W2 r3, Context context, AnonymousClass2WJ r5) {
        this.A04 = r3;
        this.A03 = context;
        this.A00 = r5;
        C54042Vn r1 = new C54042Vn(context);
        r1.A00 = 1;
        this.A02 = r1;
        r1.A0B(this);
    }

    public final MenuInflater A01() {
        return new C23297AGx(this.A03);
    }

    public final View A02() {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final CharSequence A03() {
        return this.A04.A02.A02;
    }

    public final CharSequence A04() {
        return this.A04.A02.A03;
    }

    public final void A05() {
        AnonymousClass2W2 r3 = this.A04;
        if (r3.A01 == this) {
            boolean z = true;
            if (r3.A03) {
                z = false;
            }
            if (!z) {
                r3.A07 = this;
                r3.A06 = this.A00;
            } else {
                this.A00.Azf(this);
            }
            this.A00 = null;
            this.A04.A0K(false);
            ActionBarContextView actionBarContextView = this.A04.A02;
            if (actionBarContextView.A00 == null) {
                actionBarContextView.removeAllViews();
                actionBarContextView.A01 = null;
                actionBarContextView.A01 = null;
            }
            this.A04.A0B.AaN().sendAccessibilityEvent(32);
            AnonymousClass2W2 r0 = this.A04;
            r0.A0A.setHideOnContentScrollEnabled(r0.A0E);
            this.A04.A01 = null;
        }
    }

    public final void A06() {
        if (this.A04.A01 == this) {
            C54042Vn r1 = this.A02;
            r1.A08();
            try {
                this.A00.BF4(this, r1);
            } finally {
                this.A02.A07();
            }
        }
    }

    public final void A07(int i) {
        A0A(this.A04.A00.getResources().getString(i));
    }

    public final void A08(int i) {
        A0B(this.A04.A00.getResources().getString(i));
    }

    public final void A09(View view) {
        this.A04.A02.setCustomView(view);
        this.A01 = new WeakReference(view);
    }

    public final void A0A(CharSequence charSequence) {
        this.A04.A02.setSubtitle(charSequence);
    }

    public final void A0B(CharSequence charSequence) {
        this.A04.A02.setTitle(charSequence);
    }

    public final boolean A0D() {
        return this.A04.A02.A04;
    }

    public final boolean BBT(C54042Vn r2, MenuItem menuItem) {
        AnonymousClass2WJ r0 = this.A00;
        if (r0 != null) {
            return r0.Aqs(this, menuItem);
        }
        return false;
    }

    public final void BBU(C54042Vn r2) {
        if (this.A00 != null) {
            A06();
            C23296AGw aGw = this.A04.A02.A00;
            if (aGw != null) {
                aGw.A08();
            }
        }
    }

    public final Menu A00() {
        return this.A02;
    }

    public final void A0C(boolean z) {
        super.A0C(z);
        this.A04.A02.setTitleOptional(z);
    }
}
