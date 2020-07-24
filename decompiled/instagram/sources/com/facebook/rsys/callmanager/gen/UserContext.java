package com.facebook.rsys.callmanager.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.RedactedString;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.log.gen.LogSubmissionProxy;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30522De0;

public class UserContext {
    public static AnonymousClass921 CONVERTER = new C30522De0();
    public final NativeHolder mNativeHolder;

    public static native UserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, RedactedString redactedString, SignalingTransportProxy signalingTransportProxy, LogPersistenceProxy logPersistenceProxy, LogSubmissionProxy logSubmissionProxy, byte[] bArr, ArrayList arrayList);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native RedactedString getAuthDataAccessToken();

    public native byte[] getCapabilities();

    public native LogPersistenceProxy getLogPersister();

    public native LogSubmissionProxy getLogSubmitter();

    public native ArrayList getOverlayConfigLayers();

    public native SignalingTransportProxy getSignalingTransport();

    public native String getUserId();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public UserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public UserContext(String str, RedactedString redactedString, SignalingTransportProxy signalingTransportProxy, LogPersistenceProxy logPersistenceProxy, LogSubmissionProxy logSubmissionProxy, byte[] bArr, ArrayList arrayList) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(redactedString);
        AnonymousClass920.A00(signalingTransportProxy);
        AnonymousClass920.A00(logPersistenceProxy);
        AnonymousClass920.A00(logSubmissionProxy);
        AnonymousClass920.A00(arrayList);
        this.mNativeHolder = initNativeHolder(str, redactedString, signalingTransportProxy, logPersistenceProxy, logSubmissionProxy, bArr, arrayList);
    }
}
