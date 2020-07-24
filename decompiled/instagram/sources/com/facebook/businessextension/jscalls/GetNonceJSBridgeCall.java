package com.facebook.businessextension.jscalls;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import org.json.JSONObject;
import p000X.C24093Ahx;
import p000X.C24100Ai7;

public class GetNonceJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final C24100Ai7 CREATOR = new C24093Ahx();

    /* JADX WARNING: Illegal instructions before constructor call */
    public GetNonceJSBridgeCall(Context context, String str, Bundle bundle, String str2, JSONObject jSONObject) {
        super(context, str, bundle, "getNonce", str2, r6);
        Bundle bundle2 = new Bundle();
        bundle2.putString("callbackID", jSONObject.getString("callbackID"));
    }

    public GetNonceJSBridgeCall(Parcel parcel) {
        super(parcel);
    }
}
