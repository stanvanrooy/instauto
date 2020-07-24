package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: X.C7R */
public final class C7R extends AnonymousClass2MK {
    public final Typeface A00 = Typeface.create("Roboto-Regular", 0);

    public final void A04(C40371oY r3, AnonymousClass1ZK r4) {
        ((C7S) r4).A00.setText(((C7T) r3).A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_view_padding);
        IgTextView igTextView = new IgTextView(context);
        igTextView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        igTextView.setTextSize(0, resources.getDimension(C0003R.dimen.font_medium_xlarge));
        igTextView.setTextColor(C019000b.A00(context, C0003R.color.igds_primary_text));
        igTextView.setTypeface(this.A00, 1);
        return new C7S(igTextView);
    }

    public final Class A02() {
        return C7T.class;
    }
}
