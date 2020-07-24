package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.CP7 */
public final class CP7 extends C689230h {
    public static final String A02 = CNO.A01(Constants.A0C);
    public static final String A03 = CNO.A01(Constants.ZERO);
    public static final String A04 = CNO.A01(Constants.ONE);
    public String A00 = "";
    public final C27666CMk A01;

    public final boolean AfG(int i, Object obj, Object obj2) {
        return false;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final void A72(C29491Qc r3, Object obj, Object obj2) {
        String str = A03;
        String str2 = ((C27702CNw) obj).A03;
        if (str.equals(str2)) {
            r3.A00(0);
        } else if (A04.equals(str2)) {
            r3.A00(2);
        } else if (A02.equals(str2)) {
            r3.A00(1);
        }
    }

    public final View AaJ(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        int A032 = AnonymousClass0Z0.A03(1999674111);
        if (view == null) {
            if (i == 0) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.publishing_title_row, viewGroup, false);
                view.setTag(new CPC(view));
            } else if (i == 1) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.publishing_product_row, viewGroup, false);
                view.setTag(new C27793CRl(view));
            } else if (i == 2) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.publishing_product_row, viewGroup, false);
                view.setTag(new C27792CRk(view));
            } else {
                throw new UnsupportedOperationException(C193418Ps.$const$string(69));
            }
        }
        C27702CNw cNw = (C27702CNw) obj3;
        int A033 = AnonymousClass0Z0.A03(-95766716);
        if (i == 0) {
            CRD crd = cNw.A00.A03;
            AnonymousClass11J.A00(crd);
            ((CPC) view.getTag()).A00.setText(crd.A00);
        } else if (i == 1) {
            C27791CRj.A00((C27793CRl) view.getTag(), cNw, new C27674CMs(this), this.A00, (AnonymousClass96E) null, (C27796CRo) null, true);
        } else if (i == 2) {
            C27790CRi.A00((C27792CRk) view.getTag(), cNw, new C27676CMu(this), this.A00, true, (AnonymousClass96E) null, (C27796CRo) null, true);
        }
        AnonymousClass0Z0.A0A(478957507, A033);
        AnonymousClass0Z0.A0A(709129739, A032);
        return view;
    }

    public CP7(C27666CMk cMk) {
        this.A01 = cMk;
    }
}
