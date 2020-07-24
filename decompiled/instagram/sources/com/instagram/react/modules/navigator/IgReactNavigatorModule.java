package com.instagram.react.modules.navigator;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.fbreact.specs.NativeNavigationSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.A47;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass6VY;
import p000X.AnonymousClass6VZ;
import p000X.AnonymousClass6Vi;
import p000X.C06590Pq;
import p000X.C103434dU;
import p000X.C1172751r;
import p000X.C145566Ke;
import p000X.C145576Kf;
import p000X.C148186Va;
import p000X.C148206Vc;
import p000X.C148216Vf;
import p000X.C148236Vh;
import p000X.C148246Vk;
import p000X.C148256Vm;
import p000X.C16920pO;
import p000X.C209068zT;
import p000X.C227489qa;
import p000X.C228039ra;
import p000X.C228259s1;
import p000X.C23041A0r;
import p000X.C23043A0y;
import p000X.C53832Un;

@ReactModule(name = "Navigation", needsEagerInit = true)
public class IgReactNavigatorModule extends NativeNavigationSpec implements A47 {
    public static final String MODULE_NAME = "Navigation";
    public static final String URL = "url";
    public View mCustomActionBarView;
    public boolean mIsHostResumed;
    public Map mRoutesMap;
    public final C06590Pq mSession;

    public void clearRightBarButton(double d) {
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsHostResumed = false;
    }

    public void onHostResume() {
        this.mIsHostResumed = true;
    }

    public void reloadReact() {
    }

    public static C53832Un configureReactNativeLauncherWithRouteInfo(C53832Un r5, Bundle bundle, C23043A0y a0y) {
        if (bundle != null) {
            C209068zT.A01(bundle, a0y);
            String string = bundle.getString(DialogModule.KEY_TITLE, (String) null);
            boolean z = false;
            boolean z2 = bundle.getBoolean("logoAsTitle", false);
            if (string == null || !z2) {
                z = true;
            }
            AnonymousClass0a4.A0B(z, "Screen navigationOptions cannot have both 'title' and 'logoAsTitle'");
            r5.BlH(string);
            r5.Bik(z2);
            if (bundle.containsKey("orientation")) {
                r5.BjJ(bundle.getInt("orientation"));
            }
            if (bundle.containsKey("analyticsModule")) {
                r5.Bfp(bundle.getString("analyticsModule"));
            }
            if (bundle.containsKey("perfLogger_ttiEventName")) {
                r5.Bl2(bundle.getString("perfLogger_ttiEventName"));
            }
            if (bundle.containsKey("fb_analyticsExtras")) {
                r5.Bj8(new C148236Vh(bundle, a0y));
            }
            if (bundle.containsKey("navigationBar")) {
                r5.Bhg(!bundle.getBoolean("navigationBar"));
            }
        }
        return r5;
    }

    private Map createRouteMapFromJson(String str) {
        try {
            return C209068zT.A00(new ByteArrayInputStream(str.getBytes()), getReactApplicationContext());
        } catch (IOException e) {
            AnonymousClass0DB.A0N("ReactNative", e, "Failed to create routes map.");
            throw new RuntimeException(e);
        }
    }

    public static int resourceForIconType(String str) {
        if (str.equals(C148206Vc.A00(Constants.ONE))) {
            return C0003R.C0004drawable.check;
        }
        if (str.equals(C148206Vc.A00(Constants.A0C))) {
            return C0003R.C0004drawable.nav_arrow_next;
        }
        if (str.equals(C148206Vc.A00(Constants.A0N))) {
            return C0003R.C0004drawable.nav_refresh;
        }
        if (str.equals(C148206Vc.A00(Constants.A0Y))) {
            return C0003R.C0004drawable.instagram_x_outline_24;
        }
        if (str.equals(C148206Vc.A00(Constants.A0u))) {
            return C0003R.C0004drawable.instagram_arrow_back_24;
        }
        if (str.equals(C148206Vc.A00(Constants.A12))) {
            return C0003R.C0004drawable.instagram_more_vertical_outline_24;
        }
        if (str.equals(C148206Vc.A00(Constants.A14))) {
            return C0003R.C0004drawable.instagram_direct_outline_24;
        }
        if (str.equals(C148206Vc.A00(Constants.A15))) {
            return C0003R.C0004drawable.instagram_lock_filled_12;
        }
        if (str.equals(C148206Vc.A00(Constants.ZERO)) || str.equals(C148206Vc.A00(Constants.A0j))) {
            return 0;
        }
        throw new RuntimeException(AnonymousClass000.A0E("Unsupported IconType: ", str));
    }

    public void dismiss(double d, C23043A0y a0y) {
        C228039ra.A01(new C148256Vm(this));
    }

    public Map getTypedExportedConstants() {
        return new HashMap();
    }

    public void navigate(double d, String str, C23043A0y a0y) {
        FragmentActivity A00;
        C53832Un createReactNativeLauncherFromRouteName;
        if (str.equals("IgExternalUrlRoute")) {
            openURL(a0y);
        }
        Map map = this.mRoutesMap;
        if (map != null && map.get(str) != null && (A00 = AnonymousClass6VY.A00(getCurrentActivity())) != null) {
            C228259s1 r2 = null;
            Bundle bundle = ((Bundle) this.mRoutesMap.get(str)).getBundle("navigationOptions");
            if (bundle != null) {
                r2 = C23041A0r.A04(bundle);
            }
            if (((Bundle) this.mRoutesMap.get(str)).containsKey("isFromRegistry")) {
                createReactNativeLauncherFromRouteName = createReactNativeLauncherFromAppKey(this.mSession, str, a0y, r2);
            } else {
                createReactNativeLauncherFromRouteName = createReactNativeLauncherFromRouteName(this.mSession, str, a0y, r2);
            }
            C228039ra.A01(new C1172751r(this, createReactNativeLauncherFromRouteName, A00, d));
        }
    }

    public void pop(double d) {
        C228039ra.A01(new C148246Vk(this));
    }

    public void popToScreen(double d, double d2) {
        C228039ra.A01(new AnonymousClass6Vi(this, d2));
    }

    public void setBarLeftAction(double d, C23043A0y a0y) {
        String str;
        int i;
        if (a0y.hasKey("icon")) {
            if (a0y.hasKey("icon")) {
                str = a0y.getString("icon");
            } else {
                str = null;
            }
            if (str != null) {
                i = resourceForIconType(str);
            } else {
                i = 0;
            }
            C228039ra.A01(new C148216Vf(this, d, str, i));
        }
    }

    public void setBarPrimaryAction(double d, C23043A0y a0y) {
        String str;
        int i;
        C23043A0y a0y2 = a0y;
        String str2 = null;
        if (a0y.hasKey(DialogModule.KEY_TITLE)) {
            str = a0y.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (a0y.hasKey("icon")) {
            str2 = a0y.getString("icon");
        }
        if (str2 != null) {
            i = resourceForIconType(str2);
        } else {
            i = 0;
        }
        C228039ra.A01(new C148186Va(this, d, str, str2, a0y2, i));
    }

    public void setBarTitle(double d, String str) {
        C228039ra.A01(new AnonymousClass6VZ(this, d, str));
    }

    public void setBarTitleWithConfig(double d, C23043A0y a0y) {
        String str;
        int i;
        String str2 = null;
        if (a0y.hasKey(DialogModule.KEY_TITLE)) {
            str = a0y.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (a0y.hasKey("icon")) {
            str2 = a0y.getString("icon");
        }
        if (str2 != null) {
            i = resourceForIconType(str2);
        } else {
            i = 0;
        }
        if (str != null || i != 0) {
            if (str == null || i != 0) {
                C228039ra.A01(new C103434dU(this, AnonymousClass6VY.A00(getCurrentActivity()), str, str2));
            } else {
                setBarTitle(d, str);
            }
        }
    }

    public IgReactNavigatorModule(A44 a44, C06590Pq r5) {
        super(a44);
        this.mSession = r5;
        a44.A06(this);
        try {
            A44 reactApplicationContext = getReactApplicationContext();
            this.mRoutesMap = C209068zT.A00(reactApplicationContext.getAssets().open("react_native_routes.json"), reactApplicationContext);
        } catch (IOException unused) {
        }
    }

    private C53832Un createReactNativeLauncherFromAppKey(C06590Pq r4, String str, C23043A0y a0y, C23043A0y a0y2) {
        Bundle A00 = C23041A0r.A00(a0y2);
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r4, str);
        newReactNativeLauncher.Bjt(C23041A0r.A00(a0y));
        configureReactNativeLauncherWithRouteInfo(newReactNativeLauncher, A00, a0y);
        return newReactNativeLauncher;
    }

    private C53832Un createReactNativeLauncherFromRouteName(C06590Pq r4, String str, C23043A0y a0y, C23043A0y a0y2) {
        Bundle A00 = C23041A0r.A00(a0y2);
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r4);
        newReactNativeLauncher.BkI(str);
        newReactNativeLauncher.Bjt(C23041A0r.A00(a0y));
        configureReactNativeLauncherWithRouteInfo(newReactNativeLauncher, A00, a0y);
        return newReactNativeLauncher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    public void getSavedInstanceState(double d, String str, Callback callback) {
        C227489qa r3;
        FragmentActivity A00 = AnonymousClass6VY.A00(getCurrentActivity());
        if (A00 != null) {
            AnonymousClass1HD A0N = A00.A05().A0N(str);
            if (A0N instanceof C227489qa) {
                r3 = (C227489qa) A0N;
                if (r3 == null) {
                    callback.invoke(C23041A0r.A04(r3.A00.A06()));
                    return;
                }
                callback.invoke(0);
                return;
            }
        }
        r3 = null;
        if (r3 == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    public void setInstanceStateToSave(double d, String str, C23043A0y a0y) {
        C227489qa r1;
        Bundle A00 = C23041A0r.A00(a0y);
        FragmentActivity A002 = AnonymousClass6VY.A00(getCurrentActivity());
        if (A002 != null) {
            AnonymousClass1HD A0N = A002.A05().A0N(str);
            if (A0N instanceof C227489qa) {
                r1 = (C227489qa) A0N;
                if (r1 == null) {
                    r1.A00.A0F(A00);
                    return;
                }
                return;
            }
        }
        r1 = null;
        if (r1 == null) {
        }
    }

    public void updateNativeRoutesConfiguration(String str) {
        this.mRoutesMap = createRouteMapFromJson(str);
    }

    public void openURL(double d, String str) {
        C228039ra.A01(new C145566Ke(this, str));
    }

    private void openURL(C23043A0y a0y) {
        String string = a0y.getString(URL);
        AnonymousClass0a4.A06(string);
        C228039ra.A01(new C145576Kf(this, string));
    }
}
