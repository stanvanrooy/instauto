package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.1ak  reason: invalid class name and case insensitive filesystem */
public final class C32191ak implements AnonymousClass1RO {
    public int A00 = -1;
    public int A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public C36841ih A06;
    public Integer A07 = Constants.ZERO;
    public Runnable A08;
    public Runnable A09;
    public Runnable A0A;
    public Runnable A0B;
    public boolean A0C = false;
    public final Context A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper());
    public final C26571Ea A0F;
    public final AnonymousClass0C1 A0G;

    public static C38741ll A00(C32191ak r2) {
        C36841ih r1 = r2.A06;
        AnonymousClass0a4.A06(r1);
        return r1.A04(r2.A00);
    }

    private void A01() {
        if (this.A07 != Constants.A0Y) {
            A00(this).A04 = true;
        }
        A00(this).A06 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1.A0A != null) goto L_0x0011;
     */
    public static void A02(C32191ak r1) {
        boolean z;
        if (r1.A0B == null && r1.A09 == null && r1.A08 == null) {
            z = true;
        }
        z = false;
        AnonymousClass0a4.A09(z);
    }

    public static void A05(C32191ak r1) {
        C26571Ea r12 = r1.A0F;
        if (!r12.A04()) {
            r12.A01();
        }
    }

    public static void A06(C32191ak r2) {
        Runnable runnable = r2.A0B;
        if (runnable != null) {
            AnonymousClass0ZA.A08(r2.A0E, runnable);
            r2.A0B = null;
        }
    }

    public static boolean A07(C32191ak r3) {
        C36841ih r2;
        if (r3.A0C || (r2 = r3.A06) == null || !r2.A11 || r3.A00 != r2.AHt() || r2.A0B != C32501bN.IDLE || r2.A0y || r2.A0i || r2.A0v) {
            return true;
        }
        return false;
    }

    public final void A08() {
        if (this.A0F.A04()) {
            this.A03.setVisibility(8);
        }
    }

    public final void A09() {
        AnonymousClass0a4.A06(this.A06);
        if (!A07(this)) {
            A05(this);
            switch (A00(this).A00.intValue()) {
                case 0:
                    A02(this);
                    A05(this);
                    C108944mg r4 = new C108944mg(this);
                    this.A0B = r4;
                    AnonymousClass0ZA.A09(this.A0E, r4, 1000, -1454712023);
                    return;
                case 1:
                    if (!A00(this).A04) {
                        A03(this);
                        return;
                    } else if (!A00(this).A03) {
                        A04(this);
                        return;
                    } else {
                        return;
                    }
                case 2:
                    if (!A00(this).A02) {
                        A02(this);
                        A05(this);
                        C54632Yf r42 = new C54632Yf(this);
                        this.A08 = r42;
                        AnonymousClass0ZA.A09(this.A0E, r42, 4000, -1452131312);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void A0B() {
        AnonymousClass0a4.A06(this.A06);
        A05(this);
        C06220Of.A0U(this.A02, -2);
        this.A03.setAlpha(1.0f);
        this.A05.setAlpha(1.0f);
        int i = C40831pK.A00[A00(this).A00.intValue()];
        if (i == 1) {
            this.A03.setVisibility(8);
        } else if (i == 2) {
            this.A04.setVisibility(0);
            this.A05.setVisibility(8);
            this.A03.setVisibility(0);
        } else if (i == 3) {
            this.A03.setVisibility(0);
            this.A04.setVisibility(0);
            this.A05.setVisibility(0);
            A01();
        }
    }

    public final void A0C(Integer num) {
        if (this.A06 != null) {
            A05(this);
            Integer num2 = A00(this).A00;
            if (num2 != num) {
                if (C476524w.A00(this.A03, 1).A0U() || C476524w.A00(this.A05, 1).A0U() || C476524w.A00(this.A02, 1).A0U()) {
                    C476524w.A00(this.A03, 1).A0N();
                    C476524w.A00(this.A05, 1).A0N();
                    C476524w.A00(this.A02, 1).A0N();
                    A0B();
                }
                A00(this).A00 = num;
                C06220Of.A0U(this.A02, -2);
                switch (num2.intValue()) {
                    case 0:
                        this.A04.setVisibility(0);
                        this.A03.setVisibility(8);
                        if (num == Constants.ONE) {
                            this.A05.setVisibility(8);
                            C40821pJ.A01(this.A03);
                            return;
                        } else if (num == Constants.A0C) {
                            this.A05.setVisibility(0);
                            C40821pJ.A01(this.A03);
                            A01();
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.A04.setVisibility(0);
                        this.A05.setVisibility(8);
                        this.A03.setVisibility(0);
                        if (num == Constants.A0C) {
                            C40821pJ.A03(this.A02, this.A01);
                            C40821pJ.A01(this.A05);
                            A01();
                            return;
                        }
                        break;
                    case 2:
                        this.A04.setVisibility(0);
                        this.A05.setVisibility(0);
                        this.A03.setVisibility(0);
                        if (num == Constants.ONE) {
                            C40821pJ.A02(this.A05);
                            C40821pJ.A03(this.A02, -this.A01);
                            return;
                        }
                        break;
                    default:
                        throw new IllegalStateException(AnonymousClass000.A0N("Illegal state transition from ", AnonymousClass83S.A00(num2), " to ", AnonymousClass83S.A00(num)));
                }
                if (num == Constants.ZERO) {
                    C40821pJ.A02(this.A03);
                }
            }
        }
    }

    public final void BB7(C36841ih r3, int i) {
        Integer num;
        if (r3 == this.A06) {
            if (i != 10) {
                switch (i) {
                    case 16:
                        A0A();
                        if (r3.A0B != C32501bN.IDLE) {
                            num = Constants.ONE;
                            break;
                        } else {
                            A09();
                            return;
                        }
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                        if (r3.A11) {
                            A00(this).A05 = false;
                            A0A();
                            A09();
                            return;
                        }
                        return;
                    case 18:
                        if (!r3.A0s && !A00(this).A05) {
                            A0A();
                            Integer num2 = Constants.ONE;
                            A0C(num2);
                            if (this.A07 != num2) {
                                A00(this).A04 = false;
                                return;
                            }
                            return;
                        }
                        return;
                    case 19:
                        if (!r3.A0i) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            } else if (!r3.A0v) {
                A0A();
                A0C(Constants.ONE);
                A09();
                return;
            }
            A0A();
            num = Constants.ZERO;
            A0C(num);
        }
    }

    public C32191ak(View view, AnonymousClass0C1 r4) {
        this.A0D = view.getContext();
        this.A0G = r4;
        C26571Ea r1 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.row_feed_media_tag_indicator_stub));
        this.A0F = r1;
        r1.A03(new C32201al(this));
    }

    public static void A03(C32191ak r5) {
        A02(r5);
        A05(r5);
        C54292Ws r4 = new C54292Ws(r5);
        r5.A09 = r4;
        AnonymousClass0ZA.A09(r5.A0E, r4, 1000, 1275536489);
    }

    public static void A04(C32191ak r5) {
        A02(r5);
        A05(r5);
        C46371zd r4 = new C46371zd(r5);
        r5.A0A = r4;
        AnonymousClass0ZA.A09(r5.A0E, r4, ArLinkScanControllerImpl.ERROR_DELAY_MS, -767830241);
    }

    public final void A0A() {
        A06(this);
        Runnable runnable = this.A09;
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.A0E, runnable);
            this.A09 = null;
        }
        Runnable runnable2 = this.A08;
        if (runnable2 != null) {
            AnonymousClass0ZA.A08(this.A0E, runnable2);
            this.A08 = null;
        }
        Runnable runnable3 = this.A0A;
        if (runnable3 != null) {
            AnonymousClass0ZA.A08(this.A0E, runnable3);
            this.A0A = null;
        }
    }
}
