package com.instagram.p009ui.widget.typeaheadpill;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.searchedittext.SearchWithDeleteEditText;
import p000X.AnonymousClass1BX;
import p000X.AnonymousClass5B5;
import p000X.AnonymousClass5B6;
import p000X.AnonymousClass5B7;
import p000X.AnonymousClass5B9;
import p000X.C019000b;
import p000X.C06360Ot;

/* renamed from: com.instagram.ui.widget.typeaheadpill.TypeaheadPill */
public class TypeaheadPill extends FrameLayout {
    public AnonymousClass5B9 A00;
    public String A01;
    public String A02;
    public final SearchWithDeleteEditText A03;
    public final TextWatcher A04;
    public final ForegroundColorSpan A05;
    public final ForegroundColorSpan A06;
    public final View.OnClickListener A07;
    public final TextView.OnEditorActionListener A08;
    public final TextView A09;

    public static void A00(TypeaheadPill typeaheadPill, Editable editable) {
        int A002 = C06360Ot.A00(typeaheadPill.A01);
        String str = typeaheadPill.A02;
        if (!AnonymousClass1BX.A00(str) && A002 > 0 && A002 <= C06360Ot.A00(str)) {
            String substring = typeaheadPill.A02.substring(0, A002);
            if (typeaheadPill.A01.equalsIgnoreCase(substring)) {
                SpannableString spannableString = new SpannableString(typeaheadPill.A02);
                spannableString.setSpan(typeaheadPill.A05, 0, A002, 33);
                spannableString.setSpan(typeaheadPill.A06, A002, C06360Ot.A00(typeaheadPill.A02), 33);
                typeaheadPill.A09.setText(spannableString);
                typeaheadPill.A09.setVisibility(0);
                typeaheadPill.A03.setTextColor(0);
                if (!typeaheadPill.A01.equals(substring)) {
                    typeaheadPill.A01 = substring;
                    typeaheadPill.A03.removeTextChangedListener(typeaheadPill.A04);
                    editable.replace(0, editable.length(), substring, 0, A002);
                    typeaheadPill.A03.addTextChangedListener(typeaheadPill.A04);
                    return;
                }
                return;
            }
        }
        typeaheadPill.A01();
    }

    public final boolean A02(String str) {
        int A002;
        String str2 = this.A01;
        if (AnonymousClass1BX.A00(str2) || AnonymousClass1BX.A00(str) || (A002 = C06360Ot.A00(str2)) > C06360Ot.A00(str) || !this.A01.equalsIgnoreCase(str.substring(0, A002))) {
            return false;
        }
        this.A02 = str;
        A00(this, this.A03.getEditableText());
        return true;
    }

    public final void A01() {
        this.A03.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_primary_text));
        this.A09.setVisibility(8);
        this.A02 = null;
    }

    public SearchWithDeleteEditText getSearchEditText() {
        return this.A03;
    }

    public void setDelegate(AnonymousClass5B9 r1) {
        this.A00 = r1;
    }

    public TypeaheadPill(Context context) {
        this(context, (AttributeSet) null);
    }

    public TypeaheadPill(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = "";
        this.A04 = new AnonymousClass5B5(this);
        this.A08 = new AnonymousClass5B7(this);
        this.A07 = new AnonymousClass5B6(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0003R.layout.typeahead_pill, this, true);
        Context context2 = getContext();
        this.A05 = new ForegroundColorSpan(C019000b.A00(context2, C0003R.color.igds_primary_text));
        getContext();
        this.A06 = new ForegroundColorSpan(C019000b.A00(context2, C0003R.color.igds_secondary_text));
        this.A09 = (TextView) findViewById(C0003R.C0005id.search_text_typeahead);
        this.A03 = (SearchWithDeleteEditText) findViewById(C0003R.C0005id.search_edit_text);
        this.A09.setVisibility(8);
        this.A09.setOnClickListener(this.A07);
        this.A03.setClearButtonEnabled(false);
        this.A03.addTextChangedListener(this.A04);
        this.A03.setOnEditorActionListener(this.A08);
        this.A03.setImeOptions(2);
    }
}
