package com.facebook.rsys.callmanager.gen;

import com.facebook.rsys.datachannel.gen.DataApi;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CallApi {

    public final class CProxy extends CallApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native void accept(boolean z, boolean z2);

        public native void addUsers(ArrayList arrayList);

        public native void end(int i, int i2);

        public native void finishSetup();

        public native DataApi getDataApi();

        public native int hashCode();

        public native void makeJoinable();

        public native void removeUsers(ArrayList arrayList);

        public native void setAppModelListener(AppModelListener appModelListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void accept(boolean z, boolean z2);

    public abstract void addUsers(ArrayList arrayList);

    public abstract void end(int i, int i2);

    public abstract void finishSetup();

    public abstract DataApi getDataApi();

    public abstract void makeJoinable();

    public abstract void removeUsers(ArrayList arrayList);

    public abstract void setAppModelListener(AppModelListener appModelListener);
}
