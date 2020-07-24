package com.instagram.hashtag.addhashtags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass620;
import p000X.C06590Pq;
import p000X.C146636Oo;
import p000X.C27341Hl;

public class AddHashtagsFragment extends C27341Hl implements AnonymousClass1HM {
    public AnonymousClass0C1 A00;
    public String A01;
    public String A02;
    public C146636Oo mViewController;

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.Bo6(true);
        r3.BlI(C0003R.string.add_hashtags);
        r3.A4I(getString(C0003R.string.done), new AnonymousClass620(this));
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final String getModuleName() {
        return AnonymousClass000.A0E(this.A02, "_add_hashtags");
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-101574276);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        this.A02 = this.mArguments.getString("extra_prior_module_name");
        this.A01 = this.mArguments.getString("extra_notice_message");
        AnonymousClass0Z0.A09(839237601, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1412842338);
        View inflate = layoutInflater.inflate(C0003R.layout.add_hashtags_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-283611594, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1195528972);
        super.onDestroyView();
        this.mViewController = null;
        AnonymousClass0Z0.A09(1061914066, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList parcelableArrayList = this.mArguments.getParcelableArrayList("extra_selected_hashtags");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        this.mViewController = new C146636Oo(this, this.A00, (ViewGroup) view, parcelableArrayList);
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.notice);
        if (this.A01 != null) {
            textView.setVisibility(0);
            textView.setText(this.A01);
            return;
        }
        textView.setVisibility(8);
    }
}
