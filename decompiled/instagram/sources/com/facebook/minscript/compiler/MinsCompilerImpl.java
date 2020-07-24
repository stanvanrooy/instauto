package com.facebook.minscript.compiler;

import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public class MinsCompilerImpl {
    public static native ByteBuffer doCompile(String str);

    static {
        AnonymousClass0Y1.A08("minscompiler-jni");
    }
}
