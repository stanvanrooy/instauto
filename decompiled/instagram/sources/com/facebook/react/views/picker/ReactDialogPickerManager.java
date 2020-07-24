package com.facebook.react.views.picker;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.A0h;
import p000X.A1e;
import p000X.C23053A3d;
import p000X.C23092A6p;
import p000X.C23097A6z;

@ReactModule(name = "AndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDialogPicker";
    public final A0h mDelegate = new C23097A6z(this);

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
        ((C23092A6p) view).A02 = num;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        ((C23092A6p) view).setEnabled(z);
    }

    @ReactProp(name = "items")
    public /* bridge */ /* synthetic */ void setItems(View view, A1e a1e) {
        super.setItems((C23092A6p) view, a1e);
    }

    @ReactProp(name = "prompt")
    public /* bridge */ /* synthetic */ void setPrompt(View view, String str) {
        ((C23092A6p) view).setPrompt(str);
    }

    @ReactProp(name = "selected")
    public /* bridge */ /* synthetic */ void setSelected(View view, int i) {
        ((C23092A6p) view).setStagedSelection(i);
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public C23092A6p createViewInstance(C23053A3d a3d) {
        return new C23092A6p(a3d, 0);
    }

    public void setBackgroundColor(C23092A6p a6p, Integer num) {
        a6p.A01 = num;
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(View view, Integer num) {
        ((C23092A6p) view).A01 = num;
    }
}
