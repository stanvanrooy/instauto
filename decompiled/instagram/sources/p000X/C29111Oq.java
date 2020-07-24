package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgButton;
import java.util.Iterator;

/* renamed from: X.1Oq  reason: invalid class name and case insensitive filesystem */
public final class C29111Oq extends C29121Or {
    public AnonymousClass2FC A00 = null;
    public Integer A01;
    public boolean A02;
    public View.OnClickListener A03;
    public final boolean A04;

    public final int AaQ(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r7, Object obj, Object obj2) {
        Integer num;
        String str;
        AnonymousClass1SO r8 = (AnonymousClass1SO) obj;
        C467620t r9 = (C467620t) obj2;
        this.A02 = r8.A05;
        String str2 = r8.A02;
        Integer[] A002 = Constants.ZERO(2);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = Constants.ZERO;
                break;
            }
            num = A002[i];
            if (1 - num.intValue() != 0) {
                str = "v2";
            } else {
                str = "v3";
            }
            if (str.equals(str2)) {
                break;
            }
            i++;
        }
        this.A01 = num;
        r7.A01(0, r8, r9);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return ((AnonymousClass1SO) obj).getId().hashCode();
    }

    public C29111Oq(boolean z, View.OnClickListener onClickListener) {
        this.A04 = z;
        this.A03 = onClickListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104  */
    public final void A6f(int i, View view, Object obj, Object obj2) {
        C150826ci r6;
        int A032 = AnonymousClass0Z0.A03(-1804632387);
        AnonymousClass2Z7 r4 = (AnonymousClass2Z7) view.getTag();
        AnonymousClass1SO r13 = (AnonymousClass1SO) obj;
        C467620t r14 = (C467620t) obj2;
        AnonymousClass2FC r3 = this.A00;
        View.OnClickListener onClickListener = this.A03;
        r4.A07.setText(r13.A04);
        String str = r13.A03;
        if (str == null || str.isEmpty()) {
            r4.A06.setVisibility(8);
        } else {
            r4.A06.setText(str);
            r4.A06.setVisibility(0);
        }
        C474423y r9 = r13.A00;
        if (r9 != null) {
            Integer A002 = AnonymousClass8V8.A00(r9.A01);
            Iterator it = r9.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r6 = null;
                    break;
                }
                r6 = (C150826ci) it.next();
                if (!r6.A00.equals(r9.A00)) {
                    break;
                }
            }
            if (A002 == Constants.ONE && r6 != null) {
                r4.A08.setText(r6.A03);
                r4.A08.setOnClickListener(onClickListener);
                r4.A08.setVisibility(0);
                C467620t r5 = r4.A00;
                if (!(r5 == null || r5 == null)) {
                    if (r4.A0B) {
                        r5.A05.removeUpdateListener(r4.A04);
                    }
                    C467620t r0 = r4.A00;
                    r0.A04.removeUpdateListener(r4.A03);
                }
                if (r4.A0B && r4.A0A) {
                    r4.A07.setAlpha(r14.A02);
                    r4.A06.setAlpha(r14.A02);
                    r4.A08.setAlpha(r14.A02);
                }
                if (!r4.A0A) {
                    r4.A09.Bsz(r14.A01);
                    boolean z = false;
                    if (r14.A06 == Constants.A0C) {
                        z = true;
                    }
                    if (!z && r4.A0B) {
                        View view2 = r4.A05;
                        C06220Of.A0I(view2, view2.getResources().getDimensionPixelSize(C0003R.dimen.end_of_feed_unit_bottom_expanded_padding));
                    }
                } else {
                    r4.A09.Bsz(1.0f);
                }
                r4.A00 = r14;
                if (!r4.A0A) {
                    if (r14 != null) {
                        if (r4.A0B) {
                            r14.A05.addUpdateListener(r4.A04);
                        }
                        C467620t r02 = r4.A00;
                        r02.A04.addUpdateListener(r4.A03);
                    }
                    C467620t r03 = r4.A00;
                    r03.A03.addListener(r4.A02);
                    r4.A01 = r3;
                } else if (r3 != null) {
                    r3.A00((Runnable) null);
                }
                AnonymousClass0Z0.A0A(-790506219, A032);
            }
        }
        r4.A08.setVisibility(8);
        C467620t r52 = r4.A00;
        if (r4.A0B) {
        }
        C467620t r04 = r4.A00;
        r04.A04.removeUpdateListener(r4.A03);
        r4.A07.setAlpha(r14.A02);
        r4.A06.setAlpha(r14.A02);
        r4.A08.setAlpha(r14.A02);
        if (!r4.A0A) {
        }
        r4.A00 = r14;
        if (!r4.A0A) {
        }
        AnonymousClass0Z0.A0A(-790506219, A032);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        int A032 = AnonymousClass0Z0.A03(1801048863);
        Context context = viewGroup.getContext();
        Integer num = this.A01;
        boolean z = this.A02;
        boolean z2 = this.A04;
        if (num.intValue() != 1) {
            from = LayoutInflater.from(context);
            i2 = C0003R.layout.layout_end_of_feed_demarcator_small;
        } else {
            from = LayoutInflater.from(context);
            i2 = C0003R.layout.layout_end_of_feed_demarcator_large;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        inflate.setTag(new AnonymousClass2Z7((TextView) inflate.findViewById(C0003R.C0005id.demarcator_title), (TextView) inflate.findViewById(C0003R.C0005id.demarcator_subtitle), (IgButton) inflate.findViewById(C0003R.C0005id.demarcator_button), (AnonymousClass2Z5) inflate.findViewById(C0003R.C0005id.demarcator_icon), inflate.findViewById(C0003R.C0005id.footer_space), z, z2));
        AnonymousClass0Z0.A0A(1683598501, A032);
        return inflate;
    }

    public final View AaJ(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(972146114);
        if (view == null) {
            view = ABB(i, viewGroup);
        }
        A6f(i, view, obj, obj2);
        AnonymousClass0Z0.A0A(1664974292, A032);
        return view;
    }
}
