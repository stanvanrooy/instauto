package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.Collections;

/* renamed from: X.CUH */
public final class CUH extends C29121Or {
    public final C53822Um A00;

    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (r1 <= 0) goto L_0x00ab;
     */
    public final void A6f(int i, View view, Object obj, Object obj2) {
        int intValue;
        boolean z;
        Integer num;
        C168617Hz r0;
        View view2 = view;
        Object obj3 = obj;
        int A03 = AnonymousClass0Z0.A03(424270885);
        C27866CUg cUg = (C27866CUg) obj2;
        if (i == 0) {
            ((TextView) view2).setText((String) obj3);
        } else if (i == 1) {
            ((TextView) view2).setText(C0003R.string.product_source_no_catalog);
        } else if (i == 2) {
            C27861CUb cUb = (C27861CUb) obj3;
            C53822Um r10 = this.A00;
            String str = cUg.A01;
            String str2 = cUg.A00;
            C27862CUc cUc = cUb.A00;
            C168777It r3 = (C168777It) view2.getTag();
            ImageView imageView = r3.A01;
            Integer num2 = cUb.A01;
            Integer num3 = Constants.ZERO;
            int i2 = C0003R.C0004drawable.instagram_business_outline_24;
            if (num2 == num3) {
                i2 = C0003R.C0004drawable.instagram_facebook_circle_outline_24;
            }
            imageView.setImageResource(i2);
            r3.A02.setText(cUc.A02);
            Integer num4 = cUc.A00;
            if (num4 == null) {
                intValue = 0;
            } else {
                intValue = num4.intValue();
            }
            TextView textView = r3.A03;
            textView.setText(textView.getResources().getQuantityString(C0003R.plurals.num_products_formatted, intValue, new Object[]{Integer.valueOf(intValue)}));
            r3.A00.setOnClickListener(new CUG(r10, cUc, cUb));
            Integer num5 = cUc.A00;
            if (num5 != null) {
                int intValue2 = num5.intValue();
                z = true;
            }
            z = false;
            if (!Boolean.valueOf(z).booleanValue()) {
                num = Constants.A0N;
            } else {
                String str3 = cUc.A01;
                if (str3.equals(str)) {
                    num = Constants.ZERO;
                } else if (str3.equals(str2)) {
                    num = Constants.A0C;
                } else {
                    num = Constants.ONE;
                }
            }
            C168777It.A00(r3, num);
        } else if (i == 3) {
            CUR cur = (CUR) obj3;
            C53822Um r5 = this.A00;
            CUZ cuz = (CUZ) view2.getTag();
            Integer num6 = cur.A00;
            SpinnerImageView spinnerImageView = cuz.A01;
            if (num6 == Constants.ZERO) {
                r0 = C168617Hz.LOADING;
            } else {
                r0 = C168617Hz.SUCCESS;
            }
            spinnerImageView.setLoadingStatus(r0);
            TextView textView2 = cuz.A00;
            int i3 = 0;
            if (num6 == Constants.ZERO) {
                i3 = 8;
            }
            textView2.setVisibility(i3);
            view2.setOnClickListener(new CUI(r5, cur));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A05("Unexpected view type: ", i));
            AnonymousClass0Z0.A0A(-219259500, A03);
            throw illegalStateException;
        }
        AnonymousClass0Z0.A0A(-190909288, A03);
    }

    public final void A72(C29491Qc r6, Object obj, Object obj2) {
        CUR cur = (CUR) obj;
        C27866CUg cUg = (C27866CUg) obj2;
        r6.A01(0, cur.A03, (Object) null);
        if (Collections.unmodifiableList(cur.A04).isEmpty()) {
            r6.A00(1);
        } else {
            for (C27862CUc cUb : Collections.unmodifiableList(cur.A04)) {
                r6.A01(2, new C27861CUb(cUb, cur.A01), cUg);
            }
        }
        if (cur.A05) {
            r6.A00(3);
        }
    }

    public CUH(C53822Um r1) {
        this.A00 = r1;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A03 = AnonymousClass0Z0.A03(-1985342992);
        if (i == 0) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.catalog_section_title_layout, viewGroup, false);
            i2 = -1036550754;
        } else if (i == 1) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.catalog_text_layout, viewGroup, false);
            i2 = 212247825;
        } else if (i == 2) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.catalog_row_layout, viewGroup, false);
            inflate.setTag(new C168777It(inflate));
            i2 = 1415128215;
        } else if (i == 3) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.product_source_load_more, viewGroup, false);
            inflate.setTag(new CUZ(inflate));
            i2 = -1107310836;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A05("Unexpected view type: ", i));
            AnonymousClass0Z0.A0A(1232349011, A03);
            throw illegalStateException;
        }
        AnonymousClass0Z0.A0A(i2, A03);
        return inflate;
    }
}
