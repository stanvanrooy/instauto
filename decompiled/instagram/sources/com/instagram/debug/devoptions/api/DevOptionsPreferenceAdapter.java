package com.instagram.debug.devoptions.api;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000X.AnonymousClass4FU;
import p000X.AnonymousClass4G7;
import p000X.AnonymousClass4LF;
import p000X.AnonymousClass595;
import p000X.AnonymousClass5CV;
import p000X.C111194qZ;
import p000X.C1186457i;
import p000X.C1189358l;
import p000X.C120125Dh;
import p000X.C120195Dq;

public class DevOptionsPreferenceAdapter extends C120125Dh implements Filterable {
    public final Context mContext;
    public final Filter mFilter = new Filter() {
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            int size;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (TextUtils.isEmpty(charSequence)) {
                List list = DevOptionsPreferenceAdapter.this.mUnfilteredItems;
                filterResults.values = list;
                size = list.size();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object next : DevOptionsPreferenceAdapter.this.mUnfilteredItems) {
                    if (DevOptionsPreferenceAdapter.matches(DevOptionsPreferenceAdapter.this, next, (String) charSequence)) {
                        arrayList.add(next);
                    }
                }
                filterResults.values = arrayList;
                size = arrayList.size();
            }
            filterResults.count = size;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            DevOptionsPreferenceAdapter.this.setItems((List) filterResults.values);
        }
    };
    public final List mUnfilteredItems = new ArrayList();

    private CharSequence getItemTitle(Object obj) {
        Context context;
        int i;
        if (obj instanceof C1189358l) {
            return ((C1189358l) obj).A03;
        }
        if (obj instanceof C1186457i) {
            C1186457i r3 = (C1186457i) obj;
            CharSequence charSequence = r3.A08;
            if (charSequence != null) {
                return charSequence;
            }
            context = this.mContext;
            i = r3.A03;
        } else if (obj instanceof AnonymousClass5CV) {
            context = this.mContext;
            i = ((AnonymousClass5CV) obj).A02;
        } else if (obj instanceof C120195Dq) {
            context = this.mContext;
            i = ((C120195Dq) obj).A00;
        } else if (obj instanceof C111194qZ) {
            return ((C111194qZ) obj).A03;
        } else {
            if (obj instanceof AnonymousClass4G7) {
                context = this.mContext;
                i = ((AnonymousClass4G7) obj).A01;
            } else if (obj instanceof AnonymousClass4FU) {
                AnonymousClass4FU r32 = (AnonymousClass4FU) obj;
                CharSequence charSequence2 = r32.A05;
                if (charSequence2 != null) {
                    return charSequence2;
                }
                context = this.mContext;
                i = r32.A01;
            } else if (obj instanceof AnonymousClass4LF) {
                AnonymousClass4LF r33 = (AnonymousClass4LF) obj;
                CharSequence charSequence3 = r33.A04;
                if (charSequence3 != null) {
                    return charSequence3;
                }
                context = this.mContext;
                i = r33.A00;
            } else if (!(obj instanceof AnonymousClass595)) {
                return null;
            } else {
                AnonymousClass595 r34 = (AnonymousClass595) obj;
                CharSequence charSequence4 = r34.A05;
                if (charSequence4 != null) {
                    return charSequence4;
                }
                context = this.mContext;
                i = r34.A01;
            }
        }
        return context.getString(i);
    }

    public void setUnfilteredItems(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.mUnfilteredItems.clear();
        this.mUnfilteredItems.addAll(list);
    }

    public DevOptionsPreferenceAdapter(Context context) {
        super(context);
        this.mContext = context;
    }

    public static boolean matches(DevOptionsPreferenceAdapter devOptionsPreferenceAdapter, Object obj, String str) {
        String str2 = (String) devOptionsPreferenceAdapter.getItemTitle(obj);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.toLowerCase(Locale.getDefault()).contains(str.toLowerCase(Locale.getDefault()));
    }

    public Filter getFilter() {
        return this.mFilter;
    }
}
