package com.facebook.catalyst.views.video;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.HashMap;
import java.util.Map;
import p000X.A0h;
import p000X.A1e;
import p000X.A6q;
import p000X.C230299zk;
import p000X.C23053A3d;
import p000X.C23089A6c;
import p000X.C23096A6y;
import p000X.C29629D2m;

@ReactModule(name = "RCTVideo")
public class ReactVideoManager extends SimpleViewManager {
    public static final String REACT_CLASS = "RCTVideo";
    public final A0h mDelegate = new C23096A6y(this);

    public String getName() {
        return REACT_CLASS;
    }

    public void seekTo(A6q a6q, double d) {
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map A00 = C230299zk.A00("registrationName", "onStateChange");
        Map A002 = C230299zk.A00("registrationName", "onProgress");
        Map A003 = C230299zk.A00("registrationName", "onVideoSizeDetected");
        HashMap hashMap = new HashMap();
        hashMap.put("topStateChange", A00);
        hashMap.put("topProgress", A002);
        hashMap.put("topVideoSizeDetected", A003);
        return hashMap;
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public void addEventEmitters(C23053A3d a3d, A6q a6q) {
        a6q.A02 = new C23089A6c(this, a3d, a6q);
    }

    public A6q createViewInstance(C23053A3d a3d) {
        return new C29629D2m(a3d);
    }

    public void onAfterUpdateTransaction(A6q a6q) {
        super.onAfterUpdateTransaction(a6q);
        a6q.A00();
    }

    public void onDropViewInstance(A6q a6q) {
        a6q.A03();
    }

    public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
        ((A6q) view).A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.equals("seekTo") == false) goto L_0x0013;
     */
    public void receiveCommand(A6q a6q, String str, A1e a1e) {
        char c;
        double d;
        if (str.hashCode() == -906224877) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            if (a1e != null) {
                d = a1e.getDouble(0);
            } else {
                d = 0.0d;
            }
            a6q.A04(d);
        }
    }

    public /* bridge */ /* synthetic */ void seekTo(View view, double d) {
    }

    @ReactProp(name = "bufferSegmentNum")
    public void setBufferSegmentNum(A6q a6q, int i) {
        a6q.A00 = i;
    }

    @ReactProp(name = "bufferSegmentNum")
    public /* bridge */ /* synthetic */ void setBufferSegmentNum(View view, int i) {
        ((A6q) view).A00 = i;
    }

    @ReactProp(name = "isPaused")
    public void setIsPaused(A6q a6q, boolean z) {
        if (z) {
            a6q.A01();
        } else {
            a6q.A02();
        }
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(A6q a6q, String str) {
        a6q.A03 = str;
    }

    @ReactProp(name = "resizeMode")
    public /* bridge */ /* synthetic */ void setResizeMode(View view, String str) {
        ((A6q) view).A03 = str;
    }

    @ReactProp(name = "src")
    public void setSrc(A6q a6q, String str) {
        a6q.setVideoUri(str);
    }

    @ReactProp(name = "src")
    public /* bridge */ /* synthetic */ void setSrc(View view, String str) {
        ((A6q) view).setVideoUri(str);
    }

    @ReactProp(name = "volume")
    public void setVolume(A6q a6q, float f) {
        a6q.setVolume(f);
    }

    @ReactProp(name = "volume")
    public /* bridge */ /* synthetic */ void setVolume(View view, float f) {
        ((A6q) view).setVolume(f);
    }
}
