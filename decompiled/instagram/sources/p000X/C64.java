package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.feed.p005ui.text.LinkTextView;

/* renamed from: X.C64 */
public final class C64 implements C32211am {
    public final /* synthetic */ C65 A00;

    public C64(C65 c65) {
        this.A00 = c65;
    }

    public final void B7G(View view) {
        C65 c65 = this.A00;
        c65.A00 = view.getContext();
        c65.A03 = (LinkTextView) view.findViewById(C0003R.C0005id.fundraiser_sticker_consumption_sheet_recipient_biography);
        this.A00.A01 = (TextView) view.findViewById(C0003R.C0005id.fundraiser_sticker_consumption_sheet_recipient_external_url);
        this.A00.A02 = (TextView) view.findViewById(C0003R.C0005id.fundraiser_sticker_consumption_sheet_recipient_follow_context);
        this.A00.A04 = new C61(new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.fundraiser_sticker_recipient_header_neue_stub)));
    }
}
