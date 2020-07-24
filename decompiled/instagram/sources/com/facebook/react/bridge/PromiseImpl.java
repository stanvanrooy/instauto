package com.facebook.react.bridge;

import com.facebook.react.modules.dialog.DialogModule;
import p000X.C2102594w;
import p000X.C228259s1;

public class PromiseImpl implements C2102594w {
    public Callback mReject;
    public Callback mResolve;

    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    public void reject(String str) {
        reject((String) null, str, (Throwable) null, (C228259s1) null);
    }

    public void reject(String str, String str2) {
        reject(str, str2, (Throwable) null, (C228259s1) null);
    }

    public void reject(String str, String str2, Throwable th) {
        reject(str, str2, th, (C228259s1) null);
    }

    public void reject(String str, String str2, Throwable th, C228259s1 r15) {
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str == null) {
            writableNativeMap.putString("code", "EUNSPECIFIED");
        } else {
            writableNativeMap.putString("code", str);
        }
        if (str2 != null) {
            writableNativeMap.putString(DialogModule.KEY_MESSAGE, str2);
        } else if (th != null) {
            writableNativeMap.putString(DialogModule.KEY_MESSAGE, th.getMessage());
        } else {
            writableNativeMap.putString(DialogModule.KEY_MESSAGE, "Error not specified.");
        }
        writableNativeMap.putNull("userInfo");
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int i = 0;
            while (i < stackTrace.length && i < 50) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("class", stackTraceElement.getClassName());
                writableNativeMap2.putString("file", stackTraceElement.getFileName());
                writableNativeMap2.putInt("lineNumber", stackTraceElement.getLineNumber());
                writableNativeMap2.putString("methodName", stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
                i++;
            }
            writableNativeMap.putArray("nativeStackAndroid", writableNativeArray);
        } else {
            writableNativeMap.putArray("nativeStackAndroid", new WritableNativeArray());
        }
        this.mReject.invoke(writableNativeMap);
        this.mResolve = null;
        this.mReject = null;
    }

    public void reject(String str, Throwable th) {
        reject(str, (String) null, th, (C228259s1) null);
    }

    public void reject(Throwable th) {
        reject((String) null, (String) null, th, (C228259s1) null);
    }
}
