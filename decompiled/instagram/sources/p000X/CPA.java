package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.CPA */
public final class CPA extends AnonymousClass1ZK {
    public final TextView A00;
    public final C26571Ea A01;

    public CPA(View view) {
        super(view);
        this.A00 = (TextView) view.findViewById(C0003R.C0005id.message_text_view);
        this.A01 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.loading_spinner));
    }
}
