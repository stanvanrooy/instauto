package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;
import p000X.A1e;
import p000X.A44;
import p000X.A5Y;
import p000X.A5Z;
import p000X.C2102594w;
import p000X.C23079A5b;

@ReactModule(name = "PermissionsAndroid")
public class PermissionsModule extends NativePermissionsAndroidSpec {
    public static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    public final String DENIED = "denied";
    public final String GRANTED = "granted";
    public final String NEVER_ASK_AGAIN = "never_ask_again";
    public final SparseArray mCallbacks = new SparseArray();
    public int mRequestCode = 0;

    public String getName() {
        return NAME;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ((Callback) this.mCallbacks.get(i)).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        if (this.mCallbacks.size() == 0) {
            return true;
        }
        return false;
    }

    public void requestMultiplePermissions(A1e a1e, C2102594w r12) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < a1e.size(); i2++) {
            String string = a1e.getString(i2);
            String str = "granted";
            if (Build.VERSION.SDK_INT < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    str = "denied";
                }
            } else if (baseContext.checkSelfPermission(string) != 0) {
                arrayList.add(string);
            }
            writableNativeMap.putString(string, str);
            i++;
        }
        if (a1e.size() == i) {
            r12.resolve(writableNativeMap);
            return;
        }
        try {
            C23079A5b permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new A5Y(this, arrayList, writableNativeMap, r12));
            permissionAwareActivity.BdQ((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            r12.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }

    public void shouldShowRequestPermissionRationale(String str, C2102594w r4) {
        if (Build.VERSION.SDK_INT < 23) {
            r4.resolve(false);
            return;
        }
        try {
            r4.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            r4.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }

    public PermissionsModule(A44 a44) {
        super(a44);
    }

    private C23079A5b getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof C23079A5b) {
            return (C23079A5b) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    public void checkPermission(String str, C2102594w r6) {
        int checkSelfPermission;
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23) {
            checkSelfPermission = baseContext.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            checkSelfPermission = baseContext.checkSelfPermission(str);
        }
        if (checkSelfPermission != 0) {
            z = false;
        }
        r6.resolve(Boolean.valueOf(z));
    }

    public void requestPermission(String str, C2102594w r6) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        String str2 = "granted";
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                str2 = "denied";
            }
        } else if (baseContext.checkSelfPermission(str) != 0) {
            try {
                C23079A5b permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new A5Z(this, r6, str));
                permissionAwareActivity.BdQ(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
                return;
            } catch (IllegalStateException e) {
                r6.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
                return;
            }
        }
        r6.resolve(str2);
    }
}
