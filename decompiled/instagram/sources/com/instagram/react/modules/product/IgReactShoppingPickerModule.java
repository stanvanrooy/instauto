package com.instagram.react.modules.product;

import com.facebook.fbreact.specs.NativeIGShoppingPickerModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass9D1;
import p000X.C06590Pq;
import p000X.C228039ra;

@ReactModule(name = "IGShoppingPickerModule")
public class IgReactShoppingPickerModule extends NativeIGShoppingPickerModuleSpec {
    public static final String MODULE_NAME = "IGShoppingPickerModule";
    public static final String PICKER_VALUE_SELECTED = "IGShoppingPickerIndexSelected";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r10 >= ((double) r4.size())) goto L_0x0032;
     */
    public void openPicker(String str, A1e a1e, double d) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = a1e.toArrayList().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                arrayList.add((String) next);
            }
        }
        double d2 = d;
        if (d >= 0.0d) {
            z = true;
        }
        z = false;
        AnonymousClass0a4.A09(z);
        C228039ra.A01(new AnonymousClass9D1(this, str, arrayList, d2));
    }

    public IgReactShoppingPickerModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }
}
