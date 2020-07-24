package com.facebook.react.uimanager;

import android.view.View;
import java.util.Arrays;
import java.util.Map;
import p000X.A0k;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.C23140A9i;
import p000X.C23141A9l;

public final class ViewManagerPropertyUpdater$FallbackViewManagerSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final Map A00;

    public final void ATE(Map map) {
        for (C23140A9i a9i : this.A00.values()) {
            map.put(a9i.A01, a9i.A02);
        }
    }

    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        Object[] objArr;
        C23140A9i a9i = (C23140A9i) this.A00.get(str);
        if (a9i != null) {
            try {
                Integer num = a9i.A00;
                if (num == null) {
                    objArr = C23140A9i.A06;
                    objArr[0] = view;
                    objArr[1] = a9i.A00(obj, view.getContext());
                    a9i.A03.invoke(viewManager, objArr);
                } else {
                    objArr = C23140A9i.A07;
                    objArr[0] = view;
                    objArr[1] = num;
                    objArr[2] = a9i.A00(obj, view.getContext());
                    a9i.A03.invoke(viewManager, objArr);
                }
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                AnonymousClass0CH.A02(ViewManager.class, AnonymousClass000.A0E("Error while updating prop ", a9i.A01), th);
                throw new A0k(AnonymousClass000.A0N("Error while updating property '", a9i.A01, "' of a view managed by: ", viewManager.getName()), th);
            }
        }
    }

    public ViewManagerPropertyUpdater$FallbackViewManagerSetter(Class cls) {
        this.A00 = C23141A9l.A02(cls);
    }
}
