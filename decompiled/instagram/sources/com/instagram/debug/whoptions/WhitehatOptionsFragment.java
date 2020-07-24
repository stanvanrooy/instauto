package com.instagram.debug.whoptions;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.p009ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2NW;
import p000X.C05770Lw;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C101214Yy;
import p000X.C11860fn;
import p000X.C1186457i;
import p000X.C129605gd;
import p000X.C14090jk;

public class WhitehatOptionsFragment extends C101214Yy implements AnonymousClass1HM {
    public DevOptionsPreferenceAdapter mAdapter;
    public final C129605gd mTypeaheadDelegate = new C129605gd() {
        public void registerTextViewLogging(TextView textView) {
            AnonymousClass0WN.A01(WhitehatOptionsFragment.this.mUserSession).Ba2(textView);
        }

        public void searchTextChanged(String str) {
            WhitehatOptionsFragment.filterOptions(WhitehatOptionsFragment.this, str);
        }
    };
    public AnonymousClass0C1 mUserSession;

    public String getModuleName() {
        return "whitehat_options";
    }

    public boolean isToolbarEnabled() {
        return false;
    }

    public static void filterOptions(WhitehatOptionsFragment whitehatOptionsFragment, CharSequence charSequence) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = whitehatOptionsFragment.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.getFilter().filter(charSequence);
        }
    }

    private void refreshItems() {
        ArrayList arrayList = new ArrayList();
        this.mAdapter = new DevOptionsPreferenceAdapter(getActivity());
        addNetworkItems(arrayList);
        getListView().setAdapter(this.mAdapter);
        this.mAdapter.setUnfilteredItems(arrayList);
        filterOptions(this, "");
    }

    public static boolean shouldAddPrefTTL(WhitehatOptionsFragment whitehatOptionsFragment) {
        if (!C14090jk.A01(whitehatOptionsFragment.mUserSession)) {
            return true;
        }
        return false;
    }

    private void addNetworkItems(List list) {
        final C05770Lw A00 = C05770Lw.A00();
        list.add(new AnonymousClass2NW((int) C0003R.string.whitehat_settings_network));
        list.add(new C1186457i((int) C0003R.string.whitehat_settings_allow_user_certs, A00.A0D(), (CompoundButton.OnCheckedChangeListener) new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                C05770Lw A00 = C05770Lw.A00();
                if (!WhitehatOptionsFragment.shouldAddPrefTTL(WhitehatOptionsFragment.this) || !z) {
                    str = "";
                } else {
                    str = StringFormatUtil.formatStrLocaleSafe("%d:%d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(DexStore.DAYS_TO_MS_FACTOR));
                }
                A00.A00.edit().putBoolean("debug_allow_user_certs", z).putString("debug_allow_user_certs_ttl", str).apply();
                if (z) {
                    C05770Lw.A02.add("debug_allow_user_certs");
                }
                FragmentActivity activity = WhitehatOptionsFragment.this.getActivity();
                if (activity instanceof C11860fn) {
                    ((C11860fn) activity).BWM(A00);
                }
            }
        }));
        boolean z = A00.A00.getBoolean("debug_disable_liger_fizz", false);
        if (!z && C05770Lw.A02.contains("debug_disable_liger_fizz")) {
            z = true;
        }
        list.add(new C1186457i((int) C0003R.string.whitehat_settings_disable_liger_fizz, z, (CompoundButton.OnCheckedChangeListener) new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                A00.A00.edit().putBoolean("debug_disable_liger_fizz", z).apply();
                if (z) {
                    C05770Lw.A02.add("debug_disable_liger_fizz");
                }
            }
        }));
    }

    public void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.whitehat_settings);
        r2.Bo6(true);
    }

    public C06590Pq getSession() {
        return this.mUserSession;
    }

    public void onPause() {
        int A02 = AnonymousClass0Z0.A02(2026245052);
        super.onPause();
        if (getListViewSafe() != null) {
            C06220Of.A0E(getListViewSafe());
        }
        AnonymousClass0Z0.A09(1948291223, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mUserSession = AnonymousClass0J1.A06(this.mArguments);
        getListView().setBackgroundColor(AnonymousClass1BA.A01(getContext(), C0003R.attr.backgroundColorPrimary));
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(getContext());
        typeaheadHeader.setDelegate(this.mTypeaheadDelegate);
        typeaheadHeader.A03("Search Whitehat Settings");
        getListView().setAdapter((ListAdapter) null);
        getListView().addHeaderView(typeaheadHeader);
        getListView().setOnScrollListener(typeaheadHeader);
        refreshItems();
    }
}
