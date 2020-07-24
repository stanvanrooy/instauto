package p000X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.CMA */
public final class CMA extends C29121Or {
    public final CMT A00;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public CMA(CMT cmt) {
        this.A00 = cmt;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        String str;
        int A03 = AnonymousClass0Z0.A03(154823448);
        CMT cmt = this.A00;
        CML cml = (CML) obj;
        CMB cmb = (CMB) view.getTag();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            str = cmb.A01.getResources().getString(C0003R.string.all_categories_format, new Object[]{cml.A03});
        } else {
            str = cml.A03;
        }
        cmb.A01.setText(str);
        boolean z = false;
        if (cml.A00.intValue() == 0) {
            z = true;
        }
        if (z || booleanValue) {
            cmb.A01.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            if (cmb.A00 == null) {
                cmb.A00 = C40811pI.A00(cmb.A01.getContext(), C0003R.C0004drawable.instagram_chevron_right_outline_24, C0003R.attr.glyphColorSecondary);
            }
            cmb.A01.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, cmb.A00, (Drawable) null);
        }
        cmb.A01.setOnClickListener(new CMC(cmb, cmt, cml));
        AnonymousClass0Z0.A0A(213094605, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(-1324390491);
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.category_row_item, viewGroup, false);
        textView.setTag(new CMB(textView));
        AnonymousClass0Z0.A0A(-1736365595, A03);
        return textView;
    }
}
