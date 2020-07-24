package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.CSN */
public final class CSN extends AnonymousClass2MK {
    public final C27839CTf A00;

    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new CTI(layoutInflater.inflate(C0003R.layout.shop_management_learn_more, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void A04(C40371oY r7, AnonymousClass1ZK r8) {
        CTI cti = (CTI) r8;
        C27839CTf cTf = this.A00;
        int i = ((C27836CTc) r7).A00;
        Context context = cti.A00.getContext();
        String string = context.getString(C0003R.string.add_or_hide_products_in_shop_learn_more);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, new Object[]{string}));
        AnonymousClass4XV.A02(string, spannableStringBuilder, new CTQ(C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.textColorRegularLink)), cTf));
        cti.A00.setText(spannableStringBuilder);
        cti.A00.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public CSN(C27839CTf cTf) {
        this.A00 = cTf;
    }

    public final Class A02() {
        return C27836CTc.class;
    }
}
