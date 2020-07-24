package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.C0003R;
import com.facebook.forker.Process;

/* renamed from: X.1Pw  reason: invalid class name and case insensitive filesystem */
public final class C29431Pw extends C29121Or {
    public AnonymousClass1VI A00;
    public C30261Td A01;
    public boolean A02;
    public LinearLayoutManager A03;
    public final AnonymousClass1L6 A04;
    public final Context A05;
    public final AnonymousClass0RN A06;
    public final AnonymousClass1LE A07;
    public final C29441Px A08;
    public final AnonymousClass0C1 A09;
    public final Integer A0A;
    public final String A0B;
    public final boolean A0C;

    public final int getViewTypeCount() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r4.A07 != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        if (r4.A07 != false) goto L_0x00cc;
     */
    public final void A6f(int i, View view, Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int A032 = AnonymousClass0Z0.A03(-981747924);
        C43411uN r5 = (C43411uN) obj;
        C43541ua r4 = (C43541ua) obj2;
        View view2 = view;
        int i2 = i;
        if (i != 0) {
            if (i2 == 1) {
                this.A00.A07(this.A09, view2, r5, r4);
                AnonymousClass0Z0.A0A(1308812146, A032);
            } else if (i2 != 2) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass000.A05("Unhandled view type: ", i2));
                AnonymousClass0Z0.A0A(-1363844165, A032);
                throw unsupportedOperationException;
            }
        }
        Context context = this.A05;
        C28138Cc0 cc0 = (C28138Cc0) view2.getTag();
        AnonymousClass1L6 r0 = this.A04;
        C30261Td r13 = this.A01;
        C29441Px r11 = this.A08;
        AnonymousClass0C1 r15 = this.A09;
        AnonymousClass0RN r26 = this.A06;
        String str = this.A0B;
        Integer num = this.A0A;
        AnonymousClass1LE r23 = this.A07;
        Context context2 = context;
        View view3 = cc0.A01;
        int i3 = 0;
        if (r4.getPosition() == 0) {
            i3 = 8;
        }
        view3.setVisibility(i3);
        String str2 = r5.A0D;
        if (!TextUtils.isEmpty(str2)) {
            cc0.A04.setText(str2);
        }
        String str3 = r5.A0C;
        if (!TextUtils.isEmpty(str3)) {
            cc0.A03.setVisibility(0);
            cc0.A03.setText(str3);
        } else {
            cc0.A03.setVisibility(8);
        }
        if (r4.A05) {
            z = true;
        }
        z = false;
        if (z) {
            cc0.A02.setVisibility(0);
            String str4 = r5.A06;
            if (!TextUtils.isEmpty(str4)) {
                cc0.A02.setText(str4);
            } else {
                cc0.A02.setText(context.getString(C0003R.string.see_all));
            }
            cc0.A02.setOnClickListener(new C28494Chp(r0, r5));
            r0.B7k(r5.ALf());
        } else {
            cc0.A02.setVisibility(4);
        }
        if (r5.A0L) {
            cc0.A05.setVisibility(0);
            cc0.A05.setOnClickListener(new C154416ig(r13, r5, r4));
            if (r4.A05) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                C43671us r8 = new C43671us();
                C31691Zj r12 = (C31691Zj) cc0.A02.getLayoutParams();
                r12.A0I = -1;
                cc0.A02.setLayoutParams(r12);
                r8.A0G((ConstraintLayout) cc0.A00);
                r8.A0C(C0003R.C0005id.netego_carousel_cta, 6, C0003R.C0005id.netego_carousel_title, 7, 0);
                r8.A0E((ConstraintLayout) cc0.A00);
                TextView textView = cc0.A02;
                textView.setPaddingRelative(0, textView.getPaddingTop(), cc0.A02.getPaddingEnd(), cc0.A02.getPaddingBottom());
                if (!TextUtils.isEmpty(str2)) {
                    cc0.A04.append(context.getString(C0003R.string.dot_with_space));
                }
            }
        } else {
            cc0.A05.setVisibility(8);
            cc0.A05.setOnClickListener((View.OnClickListener) null);
            cc0.A02.setPaddingRelative(context.getResources().getDimensionPixelSize(C0003R.dimen.carousel_horizontal_padding), cc0.A02.getPaddingTop(), cc0.A02.getPaddingEnd(), cc0.A02.getPaddingBottom());
            C43671us r7 = new C43671us();
            r7.A0G((ConstraintLayout) cc0.A00);
            r7.A0C(C0003R.C0005id.netego_carousel_cta, 7, 0, 7, 0);
            r7.A0E((ConstraintLayout) cc0.A00);
        }
        cc0.A07.A0V();
        cc0.A07.A0w(new AnonymousClass5XK(r11, r5));
        if (cc0.A06 == null) {
            cc0.A06 = new C28147Cc9(cc0.A07, r15);
        }
        C28466ChN chN = (C28466ChN) cc0.A07.A0J;
        if (chN == null) {
            chN = new C28466ChN(context2, new C28139Cc1(cc0), r15, r26, r4.getPosition(), str, num, r23);
            chN.A02 = r0;
            chN.A01 = r5;
            chN.A0C.clear();
            chN.A0C.addAll(r5.A0F);
            chN.A0D.clear();
            chN.notifyDataSetChanged();
            cc0.A07.setAdapter(chN);
            r4.getPosition();
        } else {
            if (!r4.A02) {
                boolean z3 = false;
                if (chN.A01 != r5) {
                    z3 = true;
                }
                if (!z3) {
                    chN.A02 = r0;
                    chN.notifyDataSetChanged();
                }
            }
            chN.A02 = r0;
            chN.A01 = r5;
            chN.A0C.clear();
            chN.A0C.addAll(r5.A0F);
            chN.A0D.clear();
            chN.notifyDataSetChanged();
            cc0.A07.A0g(0);
            r4.A02 = false;
        }
        chN.A00 = r4.getPosition();
        if (!this.A0C) {
            this.A04.BZm(r5, view2);
        }
        AnonymousClass0Z0.A0A(1308812146, A032);
    }

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r4, Object obj, Object obj2) {
        C43411uN r5 = (C43411uN) obj;
        C43541ua r6 = (C43541ua) obj2;
        if (r6.Ai7()) {
            r4.A00(1);
            return;
        }
        int i = 0;
        if (r5.ALf() == C29261Pf.DISCOVER_ACCOUNTS_FEED_CARD) {
            i = 2;
        }
        r4.A00(i);
        this.A04.A3d(r5, r6);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return ((C43411uN) obj).getId().hashCode();
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        if (!this.A02) {
            return Process.WAIT_RESULT_TIMEOUT;
        }
        this.A02 = false;
        return Integer.MAX_VALUE;
    }

    public final void BVd(View view, int i, Object obj, Object obj2) {
        if (!this.A0C) {
            return;
        }
        if (i == 2 || i == 0) {
            this.A04.BZm((C43411uN) obj, view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.A0C) {
            this.A04.Brz(view);
        }
    }

    public C29431Pw(Context context, AnonymousClass1L6 r3, AnonymousClass0C1 r4, AnonymousClass0RN r5, String str, AnonymousClass1LE r7, Integer num, boolean z) {
        this.A05 = context;
        this.A04 = r3;
        this.A09 = r4;
        this.A08 = new C29441Px(context, r5);
        this.A06 = r5;
        this.A0B = str;
        this.A07 = r7;
        this.A0A = num;
        this.A0C = z;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A032 = AnonymousClass0Z0.A03(528317780);
        if (i != 0) {
            if (i == 1) {
                view = AnonymousClass1VI.A00(this.A05, viewGroup, 2);
                i2 = -964161175;
                AnonymousClass0Z0.A0A(i2, A032);
                return view;
            } else if (i != 2) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass000.A05("Unhandled view type: ", i));
                AnonymousClass0Z0.A0A(-1483927780, A032);
                throw unsupportedOperationException;
            }
        }
        LinearLayoutManager A002 = AnonymousClass1ZQ.A00(this.A03);
        this.A03 = A002;
        A002.A0w(true);
        view = C28137Cbz.A00(this.A05, viewGroup, A002);
        i2 = 1693350493;
        AnonymousClass0Z0.A0A(i2, A032);
        return view;
    }
}
