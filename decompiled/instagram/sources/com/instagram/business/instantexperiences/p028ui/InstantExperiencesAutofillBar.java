package com.instagram.business.instantexperiences.p028ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.Iterator;
import java.util.List;
import p000X.B14;
import p000X.B15;

/* renamed from: com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar */
public class InstantExperiencesAutofillBar extends RelativeLayout {
    private void setAutofillSelectedOnClickListener(View view, B15 b15, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        view.setOnClickListener(new B14(this, b15, browserExtensionsAutofillData));
    }

    public final void A00(List list, B15 b15) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C0003R.C0005id.autofill_bar_container);
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) ((FbAutofillData) it.next());
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(C0003R.layout.instant_experiences_browser_autofill_bar_list_entry, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 20, 0);
            linearLayout2.setLayoutParams(layoutParams);
            TextView textView = (TextView) linearLayout2.findViewById(C0003R.C0005id.autofill_bar_list_entry_text);
            textView.setText(browserExtensionsAutofillData.A03());
            setAutofillSelectedOnClickListener(textView, b15, browserExtensionsAutofillData);
            linearLayout.addView(linearLayout2);
        }
    }

    public InstantExperiencesAutofillBar(Context context) {
        super(context);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
