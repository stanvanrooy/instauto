package p000X;

import android.os.Handler;
import android.os.Message;
import android.view.View;

/* renamed from: X.1Qq  reason: invalid class name and case insensitive filesystem */
public final class C29631Qq extends C27291Hg implements C27021Ge {
    public final Handler A00;
    public final C29651Qs A01;
    public final AnonymousClass0C1 A02;
    public final boolean A03;

    public final void BE0() {
    }

    public final void BJx() {
    }

    public final void A00() {
        AnonymousClass0ZA.A02(this.A00, 0);
    }

    public final void A01() {
        C23300zv.A00(this.A02).A02(AnonymousClass1P8.class, this);
    }

    public final void A02() {
        C23300zv.A00(this.A02).A03(AnonymousClass1P8.class, this);
    }

    public final /* bridge */ /* synthetic */ boolean A2J(Object obj) {
        return this.A01.A9b(((AnonymousClass1P8) obj).A00);
    }

    public final void AyU() {
        if (!this.A03) {
            A01();
        }
    }

    public final void Ayk(View view) {
        if (this.A03) {
            A01();
        }
    }

    public final void Azd() {
        if (!this.A03) {
            A02();
        }
    }

    public final void Azh() {
        if (this.A03) {
            A02();
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0Z0.A03(-29562701);
        AnonymousClass1P8 r7 = (AnonymousClass1P8) obj;
        int A033 = AnonymousClass0Z0.A03(-1926209532);
        if (r7.A01) {
            this.A01.BBE(r7.A00);
        } else {
            AnonymousClass0ZA.A02(this.A00, 0);
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = r7.A00;
            AnonymousClass0ZA.A06(this.A00, obtain, 100);
        }
        AnonymousClass0Z0.A0A(-1081008713, A033);
        AnonymousClass0Z0.A0A(-1948787642, A032);
    }

    public C29631Qq(AnonymousClass0C1 r2, C29651Qs r3) {
        this(r2, r3, false);
    }

    public C29631Qq(AnonymousClass0C1 r2, C29651Qs r3, boolean z) {
        this.A00 = new C29661Qt(this);
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = z;
    }
}
