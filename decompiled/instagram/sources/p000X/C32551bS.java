package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.1bS  reason: invalid class name and case insensitive filesystem */
public final class C32551bS implements AnonymousClass1RO {
    public int A00;
    public TextView A01;
    public AnonymousClass1NJ A02;
    public C36841ih A03;
    public C30261Td A04;
    public Runnable A05;
    public Runnable A06;
    public ViewGroup A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final ViewStub A09;
    public final AnonymousClass1VY A0A;

    private void A00() {
        C36841ih r0;
        C30261Td r1 = this.A04;
        if (r1 != null && (r0 = this.A03) != null && r0.A0m) {
            AnonymousClass1RD r3 = r1.A02;
            if (r3.A00 != null) {
                AnonymousClass0ZA.A08(r3.A03, r3.A06);
                C56202c6 r12 = r3.A00;
                if (r12.A07()) {
                    r12.A06(true);
                }
            }
        }
    }

    private void A01() {
        if (this.A07 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A09.inflate();
            this.A07 = viewGroup;
            Context context = viewGroup.getContext();
            TextView textView = (TextView) viewGroup.findViewById(C0003R.C0005id.carousel_index_indicator_text_view);
            this.A01 = textView;
            int paddingLeft = textView.getPaddingLeft() + context.getResources().getDimensionPixelSize(C0003R.dimen.media_tag_indicator_icon_text_margin);
            TextView textView2 = this.A01;
            textView2.setPadding(paddingLeft, textView2.getPaddingTop(), paddingLeft, this.A01.getPaddingBottom());
            TextView textView3 = this.A01;
            textView3.setBackground(C40821pJ.A00(context, textView3.getLineHeight()));
            AnonymousClass1E1.A0V(this.A07, 4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5.A05 != null) goto L_0x0009;
     */
    public static void A02(C32551bS r5) {
        boolean z;
        if (r5.A06 == null) {
            z = true;
        }
        z = false;
        AnonymousClass0a4.A09(z);
        C44691wb r4 = new C44691wb(r5);
        r5.A05 = r4;
        AnonymousClass0ZA.A09(r5.A08, r4, ArLinkScanControllerImpl.ERROR_DELAY_MS, 248888210);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5.A05 != null) goto L_0x001f;
     */
    public static void A03(C32551bS r5) {
        boolean z;
        C36841ih r1 = r5.A03;
        if (!A09(r1)) {
            switch (r1.A0J.intValue()) {
                case 0:
                    A02(r5);
                    return;
                case 1:
                    if (r5.A06 == null) {
                        z = true;
                        break;
                    }
                    z = false;
                    AnonymousClass0a4.A09(z);
                    C108884ma r4 = new C108884ma(r5);
                    r5.A06 = r4;
                    AnonymousClass0ZA.A09(r5.A08, r4, 1000, 1366316787);
                    return;
                default:
                    return;
            }
        }
    }

    public static void A04(C32551bS r9) {
        C36841ih r2;
        C30261Td r3 = r9.A04;
        if (r3 != null && (r2 = r9.A03) != null && r2.A0m && r2.A0J == Constants.ZERO && r2.A0b && r2.A01 != r9.A00 - 1) {
            r2.A0b = false;
            ViewGroup viewGroup = r9.A07;
            if (r3.A04.getContext() != null && C16180oA.A00(r3.A05).A00.getInt("carousel_bumping_nux_count", 0) < 2) {
                C54252Wm.A00(viewGroup, r3.A04.getScrollingViewProxy(), r3.A02, r3.A04.getContext().getString(C0003R.string.carousel_bumping_nux_title), 500);
            }
        }
    }

    public static void A05(C32551bS r2) {
        Runnable runnable = r2.A05;
        if (runnable != null) {
            AnonymousClass0ZA.A08(r2.A08, runnable);
            r2.A05 = null;
        }
    }

    public static void A06(C32551bS r2) {
        Runnable runnable = r2.A06;
        if (runnable != null) {
            AnonymousClass0ZA.A08(r2.A08, runnable);
            r2.A06 = null;
        }
    }

    public static void A07(C32551bS r5) {
        AnonymousClass0a4.A06(r5.A03);
        r5.A01();
        AnonymousClass0a4.A06(r5.A01);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(StringFormatUtil.formatStrLocaleSafe("%d/%d", Integer.valueOf(r5.A03.A01 + 1), Integer.valueOf(r5.A00)));
        spannableStringBuilder.setSpan(new C38311l4(), 0, spannableStringBuilder.length(), 33);
        r5.A01.setText(spannableStringBuilder);
        switch (r5.A03.A0J.intValue()) {
            case 0:
                r5.A07.setVisibility(0);
                r5.A03.A0h = true;
                return;
            case 1:
                r5.A07.setVisibility(8);
                r5.A03.A0h = false;
                r5.A00();
                return;
            default:
                return;
        }
    }

    public static void A08(C32551bS r4, Integer num) {
        AnonymousClass0a4.A06(r4.A03);
        r4.A01();
        Integer num2 = r4.A03.A0J;
        if (num2 != num) {
            if (C476524w.A00(r4.A07, 1).A0U()) {
                C476524w.A00(r4.A07, 1).A0N();
                A07(r4);
            }
            r4.A03.A0J = num;
            Integer num3 = Constants.ONE;
            if (num2 == num3 && num == Constants.ZERO) {
                C40821pJ.A01(r4.A07);
                r4.A03.A0h = true;
                A04(r4);
            } else if (num2 == Constants.ZERO && num == num3) {
                C40821pJ.A02(r4.A07);
                r4.A03.A0h = false;
                r4.A00();
            }
        }
    }

    public static boolean A09(C36841ih r1) {
        if (r1 == null || r1.A0J == null || !r1.A11 || r1.A0v) {
            return true;
        }
        return false;
    }

    public final void BB7(C36841ih r3, int i) {
        Integer num;
        if (r3 != this.A03) {
            r3.A0C(this, true);
        } else if (i != 4) {
            if (i != 10) {
                switch (i) {
                    case 16:
                        A06(this);
                        A05(this);
                        if (r3.A0B != C32501bN.IDLE) {
                            return;
                        }
                        break;
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                        A06(this);
                        A05(this);
                        if (!r3.A11) {
                            return;
                        }
                        break;
                    case 18:
                        if (!r3.A0s) {
                            A06(this);
                            A05(this);
                            num = Constants.ZERO;
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            } else {
                A06(this);
                A05(this);
                if (r3.A0v) {
                    num = Constants.ONE;
                }
                A03(this);
                return;
            }
            A08(this, num);
        } else {
            A06(this);
            A05(this);
            r3.A0J = Constants.ZERO;
            A07(this);
            A03(this);
        }
    }

    public C32551bS(ViewStub viewStub, AnonymousClass0C1 r4) {
        this.A09 = viewStub;
        this.A0A = AnonymousClass1VY.A00(r4);
    }
}
