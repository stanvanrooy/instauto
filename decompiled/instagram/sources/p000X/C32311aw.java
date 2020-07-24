package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1aw  reason: invalid class name and case insensitive filesystem */
public final class C32311aw implements C32211am {
    public final /* synthetic */ C32301av A00;

    public C32311aw(C32301av r1) {
        this.A00 = r1;
    }

    public final void B7G(View view) {
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.igtv_feed_preview_keep_watching_text);
        C32301av r3 = this.A00;
        Context context = view.getContext();
        if (r3.A00 == null) {
            r3.A00 = AnonymousClass1LT.A04(context, C0003R.C0004drawable.igtv_feed_filled, C0003R.color.grey_0);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(r3.A00, (Drawable) null, (Drawable) null, (Drawable) null);
        this.A00.A02 = (ViewGroup) view.findViewById(C0003R.C0005id.igtv_feed_preview_keep_watching_button);
        this.A00.A01 = view.findViewById(C0003R.C0005id.igtv_feed_preview_keep_watching_backdrop);
        ViewGroup viewGroup = this.A00.A02;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new C99294Rc(viewGroup, new AnonymousClass8XM(this)));
        }
        this.A00.A03 = (ViewGroup) view.findViewById(C0003R.C0005id.igtv_feed_preview_watch_later_button);
        TextView textView2 = (TextView) view.findViewById(C0003R.C0005id.igtv_feed_preview_watch_later_text);
        if (this.A00.A03 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(AnonymousClass1LT.A04(textView2.getContext(), C0003R.C0004drawable.instagram_save_outline_16, C0003R.color.grey_0), (Drawable) null, (Drawable) null, (Drawable) null);
            ViewGroup viewGroup2 = this.A00.A03;
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener(new C99294Rc(viewGroup2, new AnonymousClass8XL(this)));
            }
        }
    }
}
