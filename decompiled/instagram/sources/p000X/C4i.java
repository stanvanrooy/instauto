package p000X;

import android.content.Context;
import com.facebook.smartcapture.p011ui.IdCaptureUi;

/* renamed from: X.C4i */
public abstract class C4i extends AnonymousClass1HD {
    public C27238C4f A00;
    public C5Y A01;
    public IdCaptureUi A02;
    public C27254C5g A03;
    public C4K A04;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C27241C4k) {
            C27241C4k c4k = (C27241C4k) context;
            this.A00 = c4k.ALd();
            this.A02 = c4k.AZN();
            this.A04 = c4k.APJ();
            this.A01 = c4k.ALS();
            this.A03 = c4k.AKW();
        }
    }
}
