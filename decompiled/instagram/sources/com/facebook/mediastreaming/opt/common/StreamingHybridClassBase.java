package com.facebook.mediastreaming.opt.common;

import com.facebook.jni.HybridData;
import java.io.PrintWriter;
import java.io.StringWriter;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0a4;
import p000X.C194408Ty;

public class StreamingHybridClassBase {
    public final HybridData mHybridData;

    private native void fireError(int i, String str, String str2, String str3);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    public StreamingHybridClassBase(HybridData hybridData) {
        AnonymousClass0a4.A06(hybridData);
        this.mHybridData = hybridData;
    }

    public void fireError(C194408Ty r4, String str, Throwable th) {
        String str2 = "";
        String str3 = str2;
        if (th != null) {
            str2 = th.toString();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str3 = stringWriter.toString();
            }
        }
        fireError(r4.A00, str, str2, str3);
    }
}
