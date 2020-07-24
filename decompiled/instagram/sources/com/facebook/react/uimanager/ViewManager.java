package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000X.A0h;
import p000X.A1e;
import p000X.A44;
import p000X.A6K;
import p000X.A8A;
import p000X.A8t;
import p000X.C230049z6;
import p000X.C230099zE;
import p000X.C230379zz;
import p000X.C23043A0y;
import p000X.C23053A3d;

public abstract class ViewManager extends BaseJavaModule {
    public void addEventEmitters(C23053A3d a3d, View view) {
    }

    public abstract View createViewInstance(C23053A3d a3d);

    public Map getCommandsMap() {
        return null;
    }

    public A0h getDelegate() {
        return null;
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public abstract Class getShadowNodeClass();

    public long measure(Context context, C23043A0y a0y, C23043A0y a0y2, C23043A0y a0y3, float f, C230049z6 r8, float f2, C230049z6 r10, float[] fArr) {
        return 0;
    }

    public void onAfterUpdateTransaction(View view) {
    }

    public void onDropViewInstance(View view) {
    }

    public void receiveCommand(View view, int i, A1e a1e) {
    }

    public void receiveCommand(View view, String str, A1e a1e) {
    }

    public void setPadding(View view, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(View view, Object obj);

    public Object updateState(View view, C230099zE r3, C230379zz r4) {
        return null;
    }

    public Map getNativeProps() {
        Class<?> cls = getClass();
        Class shadowNodeClass = getShadowNodeClass();
        HashMap hashMap = new HashMap();
        Map map = A8A.A01;
        ViewManagerPropertyUpdater$ViewManagerSetter viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) map.get(cls);
        if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
            viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) A8A.A00(cls);
            if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
                viewManagerPropertyUpdater$ViewManagerSetter = new ViewManagerPropertyUpdater$FallbackViewManagerSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$ViewManagerSetter);
        }
        viewManagerPropertyUpdater$ViewManagerSetter.ATE(hashMap);
        Map map2 = A8A.A00;
        ViewManagerPropertyUpdater$ShadowNodeSetter viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) map2.get(shadowNodeClass);
        if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
            viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) A8A.A00(shadowNodeClass);
            if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
                viewManagerPropertyUpdater$ShadowNodeSetter = new ViewManagerPropertyUpdater$FallbackShadowNodeSetter(shadowNodeClass);
            }
            map2.put(shadowNodeClass, viewManagerPropertyUpdater$ShadowNodeSetter);
        }
        viewManagerPropertyUpdater$ShadowNodeSetter.ATE(hashMap);
        return hashMap;
    }

    public void updateProperties(View view, C230099zE r6) {
        Class<?> cls = getClass();
        Map map = A8A.A01;
        ViewManagerPropertyUpdater$ViewManagerSetter viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) map.get(cls);
        if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
            viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) A8A.A00(cls);
            if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
                viewManagerPropertyUpdater$ViewManagerSetter = new ViewManagerPropertyUpdater$FallbackViewManagerSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$ViewManagerSetter);
        }
        Iterator entryIterator = r6.A00.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) entryIterator.next();
            viewManagerPropertyUpdater$ViewManagerSetter.Bjs(this, view, (String) entry.getKey(), entry.getValue());
        }
        onAfterUpdateTransaction(view);
    }

    public ReactShadowNode createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public ReactShadowNode createShadowNodeInstance(A44 a44) {
        return createShadowNodeInstance();
    }

    public View createView(C23053A3d a3d, C230099zE r4, C230379zz r5, A8t a8t) {
        View createViewInstance = createViewInstance(a3d, r4, r5);
        if (createViewInstance instanceof A6K) {
            ((A6K) createViewInstance).setOnInterceptTouchEventListener(a8t);
        }
        return createViewInstance;
    }

    private final View createView(C23053A3d a3d, A8t a8t) {
        return createView(a3d, (C230099zE) null, (C230379zz) null, a8t);
    }

    public View createViewInstance(C23053A3d a3d, C230099zE r4, C230379zz r5) {
        Object updateState;
        View createViewInstance = createViewInstance(a3d);
        addEventEmitters(a3d, createViewInstance);
        if (r4 != null) {
            updateProperties(createViewInstance, r4);
        }
        if (!(r5 == null || (updateState = updateState(createViewInstance, r4, r5)) == null)) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }
}
