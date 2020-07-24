package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.C7O */
public class C7O {
    public ImageView A00;
    public TextView A01;
    public C26571Ea A02;

    public C7O(View view) {
        Context context = view.getContext();
        C26571Ea r1 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.media_tag_indicator_stub));
        this.A02 = r1;
        r1.A03(new C7N(this, context));
    }

    public final void A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                this.A02.A02(0);
                this.A00.setImageResource(C0003R.C0004drawable.instagram_shopping_filled_24);
                this.A00.setVisibility(0);
                this.A01.setText(C0003R.string.view_products_title_case);
                this.A01.setVisibility(0);
                return;
            case 1:
                this.A02.A02(0);
                this.A00.setImageResource(C0003R.C0004drawable.instagram_user_filled_24);
                this.A00.setVisibility(0);
                this.A01.setVisibility(8);
                return;
            case 2:
                this.A02.A02(8);
                return;
            default:
                return;
        }
    }
}
