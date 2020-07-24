package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;

/* renamed from: X.CO4 */
public final class CO4 extends C29121Or {
    public final COA A00;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public CO4(COA coa) {
        this.A00 = coa;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(1374547160);
        if (i == 0) {
            CO9 co9 = (CO9) obj;
            COA coa = this.A00;
            CO5 co5 = (CO5) view.getTag();
            co5.A04.setUrl(co9.A01);
            co5.A02.setText(co9.A03);
            int i2 = 8;
            if (AnonymousClass1BX.A00(co9.A00)) {
                co5.A01.setVisibility(8);
            } else {
                co5.A01.setVisibility(0);
                co5.A01.setText(co9.A00);
            }
            IgSimpleImageView igSimpleImageView = co5.A03;
            if (!coa.AeU(co9)) {
                i2 = 0;
            }
            igSimpleImageView.setVisibility(i2);
            View view2 = co5.A00;
            float f = 0.3f;
            if (coa.AeU(co9)) {
                f = 1.0f;
            }
            view2.setAlpha(f);
            co5.A00.setOnClickListener(new CO8(coa, co9));
        }
        AnonymousClass0Z0.A0A(1856122870, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(989717910);
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.brand_row_layout, viewGroup, false);
            inflate.setTag(new CO5(inflate));
            AnonymousClass0Z0.A0A(-554187798, A03);
            return inflate;
        }
        IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A05("Unexpected view type: ", i));
        AnonymousClass0Z0.A0A(1823356280, A03);
        throw illegalStateException;
    }
}
