package com.facebook.rsys.callmanager.gen;

import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CallManager {

    public final class CProxy extends CallManager {
        public final NativeHolder mNativeHolder;

        public static native CallManager createCallManager(CallManagerClient callManagerClient);

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void registerUser(UserContext userContext);

        public native String startCallCopyId(CallContext callContext, ArrayList arrayList, boolean z, boolean z2, boolean z3, String str, SetupCallback setupCallback, ArrayList arrayList2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallManager)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void registerUser(UserContext userContext);

    public abstract String startCallCopyId(CallContext callContext, ArrayList arrayList, boolean z, boolean z2, boolean z3, String str, SetupCallback setupCallback, ArrayList arrayList2);
}
