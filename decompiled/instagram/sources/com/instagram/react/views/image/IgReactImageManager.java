package com.instagram.react.views.image;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.HashMap;
import java.util.Map;
import p000X.A1e;
import p000X.AnonymousClass9VC;
import p000X.C206848uE;
import p000X.C228179rs;
import p000X.C230109zF;
import p000X.C230299zk;
import p000X.C230349zs;
import p000X.C23053A3d;

public class IgReactImageManager extends SimpleViewManager {
    public Map getExportedCustomDirectEventTypeConstants() {
        String A00 = C228179rs.A00(1);
        Map A002 = C230299zk.A00("registrationName", "onError");
        String A003 = C228179rs.A00(2);
        Map A004 = C230299zk.A00("registrationName", "onLoad");
        String A005 = C228179rs.A00(3);
        Map A006 = C230299zk.A00("registrationName", "onLoadEnd");
        String A007 = C228179rs.A00(4);
        Map A008 = C230299zk.A00("registrationName", "onLoadStart");
        HashMap hashMap = new HashMap();
        hashMap.put(A00, A002);
        hashMap.put(A003, A004);
        hashMap.put(A005, A006);
        hashMap.put(A007, A008);
        return hashMap;
    }

    public String getName() {
        return "RCTImageView";
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(C206848uE r2, Integer num) {
        if (num == null) {
            r2.clearColorFilter();
        } else {
            r2.setColorFilter(num.intValue());
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C206848uE r2, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (i == 0) {
            r2.setBorderRadius(f);
        }
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C206848uE r2, String str) {
        r2.setScaleTypeNoUpdate(AnonymousClass9VC.A00(str));
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setShouldNotifyLoadEvents(C206848uE r1, boolean z) {
        r1.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "src")
    public void setSource(C206848uE r1, A1e a1e) {
        r1.setSource(a1e);
    }

    public C206848uE createViewInstance(C23053A3d a3d) {
        return new C206848uE(a3d);
    }

    public void onAfterUpdateTransaction(C206848uE r1) {
        super.onAfterUpdateTransaction(r1);
        r1.A0A();
    }
}
