package p000X;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.instagram.business.instantexperiences.p028ui.InstantExperiencesAutofillBar;

/* renamed from: X.B14 */
public final class B14 implements View.OnClickListener {
    public final /* synthetic */ BrowserExtensionsAutofillData A00;
    public final /* synthetic */ B15 A01;
    public final /* synthetic */ InstantExperiencesAutofillBar A02;

    public B14(InstantExperiencesAutofillBar instantExperiencesAutofillBar, B15 b15, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        this.A02 = instantExperiencesAutofillBar;
        this.A01 = b15;
        this.A00 = browserExtensionsAutofillData;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(911216765);
        this.A01.Asp(this.A00);
        Activity activity = (Activity) this.A02.getContext();
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        AnonymousClass0Z0.A0C(7628685, A05);
    }
}
