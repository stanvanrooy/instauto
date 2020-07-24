package com.instagram.p009ui.widget.typeahead;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.searchedittext.SearchEditText;
import p000X.AnonymousClass0Z0;
import p000X.C129575ga;
import p000X.C129585gb;
import p000X.C129595gc;
import p000X.C129605gd;
import p000X.C129615ge;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.typeahead.TypeaheadHeader */
public class TypeaheadHeader extends LinearLayout implements AbsListView.OnScrollListener {
    public SearchEditText A00;
    public C129605gd A01;
    public C129615ge A02;

    public final void A01() {
        this.A00.clearFocus();
        this.A00.A03();
    }

    public final void A02() {
        SearchEditText searchEditText = this.A00;
        searchEditText.setSelection(searchEditText.getText().length());
    }

    public final void A03(String str) {
        this.A00.setHint(str);
    }

    public final void A04(String str) {
        this.A00.setText(str);
    }

    public String getSearchString() {
        return this.A00.getSearchString();
    }

    public void setAllowTextSelection(boolean z) {
        this.A00.setAllowTextSelection(z);
    }

    public void setClearButtonEnabled(boolean z) {
        this.A00.setClearButtonEnabled(z);
    }

    public void setEditTextBackground(Drawable drawable) {
        this.A00.setBackground(drawable);
    }

    public void setFocusOnTouchEnabled(boolean z) {
        this.A00.setFocusOnTouchEnabled(z);
    }

    public void setOnSearchEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setSearchIconPadding(int i) {
        this.A00.setCompoundDrawablePadding(i);
    }

    private void A00() {
        LayoutInflater.from(getContext()).inflate(C0003R.layout.typeahead_header, this, true);
        SearchEditText searchEditText = (SearchEditText) findViewById(C0003R.C0005id.row_search_edit_text);
        this.A00 = searchEditText;
        searchEditText.setOnFilterTextListener(new C129575ga(this));
        searchEditText.setSearchClearListener(new C129595gc(this));
        searchEditText.getCompoundDrawablesRelative()[0].mutate().setColorFilter(C26771Ff.A00(searchEditText.getResources().getColor(C0003R.color.grey_5)));
        C129585gb.A00(this.A00);
        C129605gd r1 = this.A01;
        if (r1 != null) {
            r1.registerTextViewLogging(this.A00);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0Z0.A0A(-10701698, AnonymousClass0Z0.A03(911549058));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0Z0.A03(-125974086);
        if (i == 1) {
            A01();
        }
        AnonymousClass0Z0.A0A(1980414413, A03);
    }

    public void setDelegate(C129605gd r1) {
        this.A01 = r1;
    }

    public void setSearchClearListener(C129615ge r1) {
        this.A02 = r1;
    }

    public TypeaheadHeader(Context context) {
        super(context);
        A00();
    }

    public TypeaheadHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public TypeaheadHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
