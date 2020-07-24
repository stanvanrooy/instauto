package com.instagram.business.instantexperiences.p028ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.C25107B0z;

/* renamed from: com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog */
public class InstantExperiencesSaveAutofillDialog extends C25107B0z {
    public InstantExperiencesSaveAutofillDialog(Context context) {
        super(context);
    }

    public InstantExperiencesSaveAutofillDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        ((TextView) findViewById(C0003R.C0005id.instant_experiences_confirm_dialog_title)).setText(resources.getString(C0003R.string.autofill_save_dialog_request_string));
        getResources();
        this.A00.setText(resources.getString(C0003R.string.autofill_save_dialog_accept_button_text));
        getResources();
        this.A01.setText(resources.getString(C0003R.string.autofill_save_dialog_decline_button_text));
    }
}
