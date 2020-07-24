package com.facebook.catalyst.modules.netinfo;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.fbreact.specs.NativeNetInfoSpec;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p000X.A44;
import p000X.A47;
import p000X.AnonymousClass0C5;
import p000X.C120125Dh;
import p000X.C2102594w;
import p000X.C228259s1;
import p000X.C23157AAk;

@ReactModule(name = "NetInfo")
public class NetInfoModule extends NativeNetInfoSpec implements A47 {
    public static final String CONNECTION_TYPE_BLUETOOTH = "bluetooth";
    public static final String CONNECTION_TYPE_CELLULAR = "cellular";
    public static final String CONNECTION_TYPE_ETHERNET = "ethernet";
    public static final String CONNECTION_TYPE_NONE = "none";
    public static final String CONNECTION_TYPE_NONE_DEPRECATED = "NONE";
    public static final String CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String CONNECTION_TYPE_UNKNOWN_DEPRECATED = "UNKNOWN";
    public static final String CONNECTION_TYPE_WIFI = "wifi";
    public static final String CONNECTION_TYPE_WIMAX = "wimax";
    public static final String EFFECTIVE_CONNECTION_TYPE_2G = "2g";
    public static final String EFFECTIVE_CONNECTION_TYPE_3G = "3g";
    public static final String EFFECTIVE_CONNECTION_TYPE_4G = "4g";
    public static final String EFFECTIVE_CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    public static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    public static final String NAME = "NetInfo";
    public String mConnectionType = "unknown";
    public final C23157AAk mConnectivityBroadcastReceiver;
    public String mConnectivityDeprecated = CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    public final ConnectivityManager mConnectivityManager;
    public String mEffectiveConnectionType = "unknown";
    public boolean mNoNetworkPermission = false;

    public void addListener(String str) {
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public void removeListeners(double d) {
    }

    private C228259s1 createConnectivityEventMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(AnonymousClass0C5.$const$string(365), this.mConnectivityDeprecated);
        writableNativeMap.putString("connectionType", this.mConnectionType);
        writableNativeMap.putString("effectiveConnectionType", this.mEffectiveConnectionType);
        return writableNativeMap;
    }

    private String getCurrentConnectionType() {
        try {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return CONNECTION_TYPE_NONE_DEPRECATED;
            }
            return ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType()) ? activeNetworkInfo.getTypeName().toUpperCase() : CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            return CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AnonymousClass0C5.$const$string(186));
        getReactApplicationContext().registerReceiver(this.mConnectivityBroadcastReceiver, intentFilter);
        this.mConnectivityBroadcastReceiver.A00 = true;
        updateAndSendConnectionType(this);
    }

    private void unregisterReceiver() {
        if (this.mConnectivityBroadcastReceiver.A00) {
            getReactApplicationContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.A00 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    public static void updateAndSendConnectionType(NetInfoModule netInfoModule) {
        String str;
        String currentConnectionType;
        String str2;
        String str3 = "unknown";
        try {
            NetworkInfo activeNetworkInfo = netInfoModule.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                str2 = CONNECTION_TYPE_NONE;
            } else {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        str2 = CONNECTION_TYPE_WIFI;
                    } else if (type != 4) {
                        if (type == 9) {
                            str2 = CONNECTION_TYPE_ETHERNET;
                        } else if (type != 6) {
                            if (type == 7) {
                                str2 = CONNECTION_TYPE_BLUETOOTH;
                            }
                            str = str3;
                            currentConnectionType = netInfoModule.getCurrentConnectionType();
                            if (!str3.equalsIgnoreCase(netInfoModule.mConnectionType) || !str.equalsIgnoreCase(netInfoModule.mEffectiveConnectionType) || !currentConnectionType.equalsIgnoreCase(netInfoModule.mConnectivityDeprecated)) {
                                netInfoModule.mConnectionType = str3;
                                netInfoModule.mEffectiveConnectionType = str;
                                netInfoModule.mConnectivityDeprecated = currentConnectionType;
                                netInfoModule.sendConnectivityChangedEvent();
                                return;
                            }
                            return;
                        } else {
                            str2 = CONNECTION_TYPE_WIMAX;
                        }
                    }
                }
                str = netInfoModule.getEffectiveConnectionType(activeNetworkInfo);
                str3 = CONNECTION_TYPE_CELLULAR;
                currentConnectionType = netInfoModule.getCurrentConnectionType();
                if (!str3.equalsIgnoreCase(netInfoModule.mConnectionType) || !str.equalsIgnoreCase(netInfoModule.mEffectiveConnectionType) || !currentConnectionType.equalsIgnoreCase(netInfoModule.mConnectivityDeprecated)) {
                }
            }
            str = str3;
            str3 = str2;
        } catch (SecurityException unused) {
            netInfoModule.mNoNetworkPermission = true;
        }
        currentConnectionType = netInfoModule.getCurrentConnectionType();
        if (!str3.equalsIgnoreCase(netInfoModule.mConnectionType) || !str.equalsIgnoreCase(netInfoModule.mEffectiveConnectionType) || !currentConnectionType.equalsIgnoreCase(netInfoModule.mConnectivityDeprecated)) {
        }
    }

    public void getCurrentConnectivity(C2102594w r3) {
        if (this.mNoNetworkPermission) {
            r3.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            r3.resolve(createConnectivityEventMap());
        }
    }

    public void isConnectionMetered(C2102594w r3) {
        if (this.mNoNetworkPermission) {
            r3.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            r3.resolve(Boolean.valueOf(this.mConnectivityManager.isActiveNetworkMetered()));
        }
    }

    public NetInfoModule(A44 a44) {
        super(a44);
        this.mConnectivityManager = (ConnectivityManager) a44.getSystemService("connectivity");
        this.mConnectivityBroadcastReceiver = new C23157AAk(this);
    }

    private String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case C120125Dh.VIEW_TYPE_BANNER:
                return EFFECTIVE_CONNECTION_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_SPINNER:
            case C120125Dh.VIEW_TYPE_LINK:
                return EFFECTIVE_CONNECTION_TYPE_3G;
            case C120125Dh.VIEW_TYPE_BADGE:
            case 15:
                return EFFECTIVE_CONNECTION_TYPE_4G;
            default:
                return "unknown";
        }
    }

    private void sendConnectivityChangedEvent() {
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("networkStatusDidChange", createConnectivityEventMap());
        }
    }

    public void initialize() {
        getReactApplicationContext().A06(this);
    }

    public void onHostPause() {
        unregisterReceiver();
    }

    public void onHostResume() {
        registerReceiver();
    }
}
