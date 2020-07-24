package p000X;

import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.ArrayList;

/* renamed from: X.B1M */
public final class B1M extends ArrayList<FbAutofillData> {
    public final /* synthetic */ BrowserExtensionsAutofillData A00;
    public final /* synthetic */ B1H A01;

    public B1M(B1H b1h, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        this.A01 = b1h;
        this.A00 = browserExtensionsAutofillData;
        add(browserExtensionsAutofillData);
    }
}
