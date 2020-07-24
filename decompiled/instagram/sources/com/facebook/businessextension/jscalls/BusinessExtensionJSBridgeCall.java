package com.facebook.businessextension.jscalls;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;

public abstract class BusinessExtensionJSBridgeCall extends BrowserLiteJSBridgeCall {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessExtensionJSBridgeCall(Context context, String str, Bundle bundle, String str2, String str3, Bundle bundle2) {
        super(context, str, bundle == null ? new Bundle() : bundle, str2, str3, bundle2);
    }

    public BusinessExtensionJSBridgeCall(Parcel parcel) {
        super(parcel);
    }
}
