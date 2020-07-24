package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.Map;
import p000X.A0k;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.C23140A9i;
import p000X.C23141A9l;

public final class ViewManagerPropertyUpdater$FallbackShadowNodeSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final Map A00;

    public final void ATE(Map map) {
        for (C23140A9i a9i : this.A00.values()) {
            map.put(a9i.A01, a9i.A02);
        }
    }

    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        Object[] objArr;
        C23140A9i a9i = (C23140A9i) this.A00.get(str);
        if (a9i != null) {
            try {
                Integer num = a9i.A00;
                if (num == null) {
                    objArr = C23140A9i.A04;
                    objArr[0] = a9i.A00(obj, reactShadowNode.AY1());
                    a9i.A03.invoke(reactShadowNode, objArr);
                } else {
                    objArr = C23140A9i.A05;
                    objArr[0] = num;
                    objArr[1] = a9i.A00(obj, reactShadowNode.AY1());
                    a9i.A03.invoke(reactShadowNode, objArr);
                }
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                AnonymousClass0CH.A02(ViewManager.class, AnonymousClass000.A0E("Error while updating prop ", a9i.A01), th);
                throw new A0k(AnonymousClass000.A0N("Error while updating property '", a9i.A01, "' in shadow node of type: ", reactShadowNode.AaL()), th);
            }
        }
    }

    public ViewManagerPropertyUpdater$FallbackShadowNodeSetter(Class cls) {
        this.A00 = C23141A9l.A01(cls);
    }
}
