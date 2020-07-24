package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A3K;

public class Inspector {
    public final HybridData mHybridData;

    public class Page {
        public final int mId;
        public final String mTitle;
        public final String mVM;

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + '\'' + '}';
        }

        public Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }
    }

    public interface RemoteConnection {
        void onDisconnect();

        void onMessage(String str);
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    public static native Inspector instance();

    public class LocalConnection {
        public final HybridData mHybridData;

        public native void disconnect();

        public native void sendMessage(String str);

        public LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    static {
        A3K.A00();
    }

    public Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
