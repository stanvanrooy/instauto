package com.facebook.react.views.picker;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.List;
import p000X.A1e;
import p000X.AnonymousClass0Z1;
import p000X.C151876eR;
import p000X.C151886eS;
import p000X.C23053A3d;
import p000X.C23092A6p;
import p000X.C23093A6v;

public abstract class ReactPickerManager extends SimpleViewManager {
    @ReactProp(name = "items")
    public void setItems(C23092A6p a6p, A1e a1e) {
        ArrayList arrayList;
        if (a1e == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(a1e.size());
            for (int i = 0; i < a1e.size(); i++) {
                arrayList.add(new C151886eS(a1e.getMap(i)));
            }
        }
        a6p.A05 = arrayList;
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(C23092A6p a6p, Integer num) {
        a6p.A02 = num;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C23092A6p a6p, boolean z) {
        a6p.setEnabled(z);
    }

    @ReactProp(name = "prompt")
    public void setPrompt(C23092A6p a6p, String str) {
        a6p.setPrompt(str);
    }

    @ReactProp(name = "selected")
    public void setSelected(C23092A6p a6p, int i) {
        a6p.setStagedSelection(i);
    }

    public void addEventEmitters(C23053A3d a3d, C23092A6p a6p) {
        UIManagerModule uIManagerModule = (UIManagerModule) a3d.A02(UIManagerModule.class);
        if (uIManagerModule != null) {
            a6p.A00 = new C23093A6v(a6p, uIManagerModule.mEventDispatcher);
        }
    }

    public void onAfterUpdateTransaction(C23092A6p a6p) {
        int intValue;
        super.onAfterUpdateTransaction(a6p);
        a6p.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        C151876eR r2 = (C151876eR) a6p.getAdapter();
        int selectedItemPosition = a6p.getSelectedItemPosition();
        List list = a6p.A05;
        if (!(list == null || list == a6p.A04)) {
            a6p.A04 = list;
            a6p.A05 = null;
            if (r2 == null) {
                r2 = new C151876eR(a6p.getContext(), list);
                a6p.setAdapter((SpinnerAdapter) r2);
            } else {
                r2.clear();
                r2.addAll(a6p.A04);
                AnonymousClass0Z1.A00(r2, -1669440017);
            }
        }
        Integer num = a6p.A03;
        if (!(num == null || (intValue = num.intValue()) == selectedItemPosition)) {
            a6p.setSelection(intValue, false);
            a6p.A03 = null;
        }
        Integer num2 = a6p.A02;
        if (!(num2 == null || r2 == null || num2 == r2.A01)) {
            r2.A01 = num2;
            AnonymousClass0Z1.A00(r2, -2454193);
            a6p.A02 = null;
        }
        Integer num3 = a6p.A01;
        if (!(num3 == null || r2 == null || num3 == r2.A00)) {
            r2.A00 = num3;
            AnonymousClass0Z1.A00(r2, -1477753625);
            a6p.A01 = null;
        }
        a6p.setOnItemSelectedListener(a6p.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.equals("setNativeSelectedPosition") == false) goto L_0x0013;
     */
    public void receiveCommand(C23092A6p a6p, String str, A1e a1e) {
        char c;
        if (str.hashCode() == -729039331) {
            c = 0;
        }
        c = 65535;
        if (c == 0 && a1e != null) {
            a6p.setImmediateSelection(a1e.getInt(0));
        }
    }
}
