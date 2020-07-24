package com.facebook.react.views.swiperefresh;

import android.view.View;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;
import p000X.A0h;
import p000X.A1e;
import p000X.A1k;
import p000X.A2A;
import p000X.AnonymousClass000;
import p000X.C206578th;
import p000X.C230299zk;
import p000X.C23051A2a;
import p000X.C23053A3d;
import p000X.C23085A5y;

@ReactModule(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    public final A0h mDelegate = new C23051A2a(this);

    public Map getExportedViewConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("DEFAULT", 1);
        hashMap.put("LARGE", 0);
        return C230299zk.A00("SIZE", hashMap);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("topRefresh", C230299zk.A00("registrationName", "onRefresh"));
        return hashMap;
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public void addEventEmitters(C23053A3d a3d, C23085A5y a5y) {
        a5y.setOnRefreshListener(new A2A(this, a3d, a5y));
    }

    public C23085A5y createViewInstance(C23053A3d a3d) {
        return new C23085A5y(a3d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.equals("setNativeRefreshing") == false) goto L_0x0013;
     */
    public void receiveCommand(C23085A5y a5y, String str, A1e a1e) {
        char c;
        if (str.hashCode() == 513968928) {
            c = 0;
        }
        c = 65535;
        if (c == 0 && a1e != null) {
            a5y.setRefreshing(a1e.getBoolean(0));
        }
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(C23085A5y a5y, A1e a1e) {
        int i;
        if (a1e != null) {
            int[] iArr = new int[a1e.size()];
            for (int i2 = 0; i2 < a1e.size(); i2++) {
                if (a1e.getType(i2) == ReadableType.Map) {
                    i = C206578th.A00(a1e.getMap(i2), a5y.getContext()).intValue();
                } else {
                    i = a1e.getInt(i2);
                }
                iArr[i2] = i;
            }
            a5y.setColorSchemeColors(iArr);
            return;
        }
        a5y.setColorSchemeColors(new int[0]);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C23085A5y a5y, boolean z) {
        a5y.setEnabled(z);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        ((C23085A5y) view).setEnabled(z);
    }

    public void setNativeRefreshing(C23085A5y a5y, boolean z) {
        a5y.setRefreshing(z);
    }

    public /* bridge */ /* synthetic */ void setNativeRefreshing(View view, boolean z) {
        ((C23085A5y) view).setRefreshing(z);
    }

    @ReactProp(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(C23085A5y a5y, Integer num) {
        a5y.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(C23085A5y a5y, float f) {
        a5y.setProgressViewOffset(f);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public /* bridge */ /* synthetic */ void setProgressViewOffset(View view, float f) {
        ((C23085A5y) view).setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public void setRefreshing(C23085A5y a5y, boolean z) {
        a5y.setRefreshing(z);
    }

    @ReactProp(name = "refreshing")
    public /* bridge */ /* synthetic */ void setRefreshing(View view, boolean z) {
        ((C23085A5y) view).setRefreshing(z);
    }

    public void setSize(C23085A5y a5y, int i) {
        a5y.setSize(i);
    }

    @ReactProp(name = "size")
    public void setSize(C23085A5y a5y, A1k a1k) {
        if (!a1k.Agh()) {
            if (a1k.AZ8() == ReadableType.Number) {
                a5y.setSize(a1k.A5t());
                return;
            } else if (a1k.AZ8() == ReadableType.String) {
                String A5y = a1k.A5y();
                if (!A5y.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                    if (A5y.equals("large")) {
                        a5y.setSize(0);
                        return;
                    }
                    throw new IllegalArgumentException(AnonymousClass000.A0E("Size must be 'default' or 'large', received: ", A5y));
                }
            } else {
                throw new IllegalArgumentException("Size must be 'default' or 'large'");
            }
        }
        a5y.setSize(1);
    }

    public /* bridge */ /* synthetic */ void setSize(View view, int i) {
        ((C23085A5y) view).setSize(i);
    }
}
