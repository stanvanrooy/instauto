package p000X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.facebook.forker.Process;

/* renamed from: X.1Pz  reason: invalid class name and case insensitive filesystem */
public final class C29461Pz extends C29121Or {
    public AnonymousClass1VI A00;
    public final AnonymousClass1LJ A01;
    public final Context A02;
    public final AnonymousClass0C1 A03;
    public final boolean A04;

    public final int AaQ(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 5;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(19582040);
        C51892Mn r5 = (C51892Mn) obj;
        C49032Al r4 = (C49032Al) obj2;
        int i2 = i;
        View view2 = view;
        if (i == 0) {
            C90503w1 r11 = (C90503w1) view2.getTag();
            AnonymousClass1LJ r9 = this.A01;
            C13300iJ r12 = r5.A00;
            SpannableString spannableString = new SpannableString(r12.AZn());
            String string = r11.A02.getResources().getString(C0003R.string.brand_poll_survey_title_content);
            spannableString.setSpan(new C151746eD(r9, r5), 0, spannableString.length(), 0);
            r11.A02.setText(TextUtils.concat(new CharSequence[]{spannableString, " ", string}));
            r11.A02.setMovementMethod(LinkMovementMethod.getInstance());
            r11.A03.setUrl(r12.ASv());
            r11.A03.setOnClickListener(new C151736eC(r9, r5));
            r11.A01.setText(r5.A04);
            r11.A00.setVisibility(0);
            r11.A00.setOnClickListener(new C29187CtK(r9, r5, r4));
        } else if (i2 == 1) {
            C51892Mn r122 = r5;
            C57072dW.A03(this.A02, (C57062dV) view2.getTag(), r122, r4, this.A01, (C153166ge) r5.A07.get(0), false);
        } else if (i2 == 2) {
            Context context = this.A02;
            C92923zy r92 = (C92923zy) view2.getTag();
            AnonymousClass1LJ r123 = this.A01;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r5.A01);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C019000b.A00(context, C0003R.color.igds_secondary_text)), 0, spannableStringBuilder.length(), 0);
            if (r5.A08) {
                spannableStringBuilder.append(" ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(context.getResources().getString(C0003R.string.default_link_text));
                spannableStringBuilder.setSpan(new C150766cc(AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink), r123, r5), length, spannableStringBuilder.length(), 0);
                r92.A00.setMovementMethod(LinkMovementMethod.getInstance());
            }
            r92.A00.setText(spannableStringBuilder);
        } else if (i2 == 3) {
            this.A00.A07(this.A03, view2, r5, r4);
        } else if (i2 == 4) {
            C57052dU.A01((C57022dR) view2.getTag(), (C153166ge) r5.A07.get(0), this.A01, false);
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("View type unhandled");
            AnonymousClass0Z0.A0A(-1889430442, A032);
            throw unsupportedOperationException;
        }
        if (!this.A04 && i2 != 3) {
            AnonymousClass1LM r0 = this.A01.A04;
            r0.A01.A03(view2, r0.A02.A00(AnonymousClass000.A0G(r5.getId(), ":", i2)));
        }
        AnonymousClass0Z0.A0A(1705800453, A032);
    }

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r3, Object obj, Object obj2) {
        C51892Mn r4 = (C51892Mn) obj;
        C49032Al r5 = (C49032Al) obj2;
        if (r5.Ai7()) {
            r3.A00(3);
            return;
        }
        AnonymousClass1LM r1 = this.A01.A04;
        r3.A00(0);
        r1.A00(r4, 0, r5);
        r3.A00(4);
        r1.A00(r4, 4, r5);
        r3.A00(1);
        r1.A00(r4, 1, r5);
        r3.A00(2);
        r1.A00(r4, 2, r5);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return ((C51892Mn) obj).getId().hashCode();
    }

    public final void BVd(View view, int i, Object obj, Object obj2) {
        if (this.A04 && i != 3) {
            AnonymousClass1LM r0 = this.A01.A04;
            r0.A01.A03(view, r0.A02.A00(AnonymousClass000.A0G(((C51892Mn) obj).getId(), ":", i)));
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.A04) {
            this.A01.A04.A01.A02(view);
        }
    }

    public C29461Pz(Context context, AnonymousClass0C1 r2, AnonymousClass1LJ r3, boolean z) {
        this.A02 = context;
        this.A03 = r2;
        this.A01 = r3;
        this.A04 = z;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A032 = AnonymousClass0Z0.A03(-45197797);
        if (i == 0) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.row_feed_brand_poll_header, viewGroup, false);
            inflate.setTag(new C90503w1(inflate));
            i2 = 1289948045;
        } else if (i == 1) {
            inflate = C57072dW.A01(viewGroup);
            i2 = -391318213;
        } else if (i == 2) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.row_feed_brand_poll_footer, viewGroup, false);
            inflate.setTag(new C92923zy(inflate));
            i2 = -1706507998;
        } else if (i == 3) {
            inflate = AnonymousClass1VI.A00(this.A02, viewGroup, 1);
            i2 = -409668166;
        } else if (i == 4) {
            inflate = C57052dU.A00(viewGroup);
            i2 = -871876397;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0Z0.A0A(1028127786, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return inflate;
    }
}
