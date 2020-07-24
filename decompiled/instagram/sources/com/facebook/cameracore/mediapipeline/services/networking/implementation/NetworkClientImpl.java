package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.tigon.iface.TigonRequest;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Locale;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass1BZ;
import p000X.AnonymousClass1C5;
import p000X.AnonymousClass3GG;
import p000X.C12810hQ;
import p000X.C134985pU;
import p000X.C17190pp;
import p000X.C17740qj;
import p000X.C17780qn;
import p000X.C17850qu;
import p000X.C194298Tl;
import p000X.C204438os;
import p000X.C205888rb;
import p000X.C206328sT;

public class NetworkClientImpl extends NetworkClient {
    public final AnonymousClass3GG mWorker;

    private native HybridData initHybrid();

    public void release() {
        this.mHybridData.resetNative();
    }

    public void sendRequest(NativeDataPromise nativeDataPromise, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        IllegalArgumentException illegalArgumentException;
        Integer num;
        try {
            HTTPClientResponseHandler hTTPClientResponseHandler = new HTTPClientResponseHandler();
            C194298Tl r5 = new C194298Tl(this, nativeDataPromise);
            AnonymousClass1BZ r2 = new AnonymousClass1BZ();
            URI create = URI.create(str);
            if (!"https".equals(create.getScheme())) {
                illegalArgumentException = new IllegalArgumentException("Protocol not supported");
            } else if (!C134985pU.A01.contains(Integer.valueOf(create.getPort()))) {
                String upperCase = str2.toUpperCase(Locale.US);
                C205888rb r8 = null;
                char c = 65535;
                int hashCode = upperCase.hashCode();
                int i = 0;
                if (hashCode != 70454) {
                    if (hashCode == 2461856 && upperCase.equals("POST")) {
                        c = 1;
                    }
                } else if (upperCase.equals(TigonRequest.GET)) {
                    c = 0;
                }
                if (c == 0) {
                    num = Constants.A0N;
                } else if (c == 1) {
                    num = Constants.ONE;
                    if (str3 != null && !str3.isEmpty()) {
                        r8 = new C205888rb(str3.getBytes(Charset.forName("UTF-8")), new C17190pp("Content-Type", "application/octet-stream"));
                    }
                } else {
                    illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0J("Method '", str2, "' is not supported"));
                }
                r2.A02 = str;
                r2.A01 = num;
                if (r8 != null) {
                    r2.A00 = r8;
                }
                while (i < strArr.length) {
                    if (!C134985pU.A00.contains(strArr[i])) {
                        r2.A01(strArr[i], strArr2[i]);
                        i++;
                    } else {
                        illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0J("Header '", strArr[i], "' is not supported"));
                    }
                }
                C17740qj r4 = new C17740qj();
                C12810hQ.A03(new C17850qu(C17780qn.A00(-10, new C204438os(r2)).A02(-11, new AnonymousClass1C5(r4.A00)).A02(-11, new C206328sT(hTTPClientResponseHandler, r5)), r4, "HttpRequest", "path undefined"), -4, 3, true, true);
                return;
            } else {
                illegalArgumentException = new IllegalArgumentException("Port not supported");
            }
            throw illegalArgumentException;
        } catch (Exception e) {
            nativeDataPromise.setException(e.toString());
        }
    }

    public NetworkClientImpl(AnonymousClass3GG r2) {
        this.mWorker = r2;
        this.mHybridData = initHybrid();
    }
}
