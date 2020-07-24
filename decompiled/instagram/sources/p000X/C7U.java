package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: X.C7U */
public final class C7U extends AnonymousClass2MK {
    public final void A04(C40371oY r3, AnonymousClass1ZK r4) {
        ((C7V) r4).A00.setText(((C7W) r3).A00);
    }

    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_view_padding);
        IgTextView igTextView = new IgTextView(context);
        igTextView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        igTextView.setTextSize(0, resources.getDimension(C0003R.dimen.font_small));
        igTextView.setTextColor(C019000b.A00(context, C0003R.color.igds_secondary_text));
        igTextView.setGravity(17);
        return new C7V(igTextView);
    }

    public final Class A02() {
        return C7W.class;
    }
}
