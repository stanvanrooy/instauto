package com.instagram.igrtc.webrtc;

import android.content.Context;
import p000X.AWZ;
import p000X.AZN;
import p000X.AZi;
import p000X.C208648xX;
import p000X.C23708AYw;

public class IgRtcModulePluginImpl extends C23708AYw {
    public AZN A00;

    public void createRtcConnection(Context context, String str, AZi aZi, AWZ awz) {
        if (this.A00 == null) {
            this.A00 = new AZN();
        }
        this.A00.A00(context, str, aZi, awz);
    }

    public C208648xX createViewRenderer(Context context, boolean z) {
        return new C208648xX(context, z);
    }
}
