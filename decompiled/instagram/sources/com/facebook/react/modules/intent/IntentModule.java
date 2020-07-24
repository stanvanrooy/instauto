package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.fbreact.specs.NativeLinkingSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A0k;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C5;
import p000X.C2102594w;
import p000X.C23043A0y;
import p000X.C25913Bc3;

@ReactModule(name = "IntentAndroid")
public class IntentModule extends NativeLinkingSpec {
    public static final String NAME = "IntentAndroid";

    public void addListener(String str) {
    }

    public String getName() {
        return NAME;
    }

    public void removeListeners(double d) {
    }

    public void canOpenURL(String str, C2102594w r6) {
        if (str == null || str.isEmpty()) {
            r6.reject((Throwable) new A0k(AnonymousClass000.A0E("Invalid URL: ", str)));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            boolean z = false;
            if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null) {
                z = true;
            }
            r6.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            r6.reject((Throwable) new A0k(AnonymousClass000.A0N("Could not check if URL '", str, "' can be opened: ", e.getMessage())));
        }
    }

    public void openSettings(C2102594w r5) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction(AnonymousClass0C5.$const$string(56));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse(AnonymousClass000.A0E("package:", packageName)));
            intent.addFlags(268435456);
            intent.addFlags(C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
            intent.addFlags(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
            currentActivity.startActivity(intent);
            r5.resolve(true);
        } catch (Exception e) {
            r5.reject((Throwable) new A0k(AnonymousClass000.A0E("Could not open the Settings: ", e.getMessage())));
        }
    }

    public void openURL(String str, C2102594w r6) {
        String str2;
        if (str == null || str.isEmpty()) {
            r6.reject((Throwable) new A0k(AnonymousClass000.A0E("Invalid URL: ", str)));
            return;
        }
        try {
            Activity currentActivity = getCurrentActivity();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme());
            String packageName = getReactApplicationContext().getPackageName();
            ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
            if (resolveActivity != null) {
                str2 = resolveActivity.getPackageName();
            } else {
                str2 = "";
            }
            if (currentActivity == null || !packageName.equals(str2)) {
                intent.addFlags(268435456);
            }
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            } else {
                getReactApplicationContext().startActivity(intent);
            }
            r6.resolve(true);
        } catch (Exception e) {
            r6.reject((Throwable) new A0k(AnonymousClass000.A0N("Could not open URL '", str, "': ", e.getMessage())));
        }
    }

    public void sendIntent(String str, A1e a1e, C2102594w r8) {
        if (str == null || str.isEmpty()) {
            r8.reject((Throwable) new A0k(AnonymousClass000.A0J("Invalid Action: ", str, ".")));
            return;
        }
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
            r8.reject((Throwable) new A0k(AnonymousClass000.A0J("Could not launch Intent with action ", str, ".")));
            return;
        }
        if (a1e != null) {
            for (int i = 0; i < a1e.size(); i++) {
                C23043A0y map = a1e.getMap(i);
                String Aq1 = map.keySetIterator().Aq1();
                switch (map.getType(Aq1).ordinal()) {
                    case 1:
                        intent.putExtra(Aq1, map.getBoolean(Aq1));
                        break;
                    case 2:
                        intent.putExtra(Aq1, Double.valueOf(map.getDouble(Aq1)));
                        break;
                    case 3:
                        intent.putExtra(Aq1, map.getString(Aq1));
                        break;
                    default:
                        r8.reject((Throwable) new A0k(AnonymousClass000.A0J("Extra type for ", Aq1, " not supported.")));
                        return;
                }
            }
        }
        getReactApplicationContext().startActivity(intent);
    }

    public void getInitialURL(C2102594w r5) {
        try {
            Activity currentActivity = getCurrentActivity();
            String str = null;
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
                    str = data.toString();
                }
            }
            r5.resolve(str);
        } catch (Exception e) {
            r5.reject((Throwable) new A0k(AnonymousClass000.A0E("Could not get the initial URL : ", e.getMessage())));
        }
    }

    public IntentModule(A44 a44) {
        super(a44);
    }
}
