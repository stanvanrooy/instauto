package com.instagram.arlink.util;

import com.instagram.arlink.model.ArLinkCandidate;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public class ArLinkScanner {
    public final long A00;

    public static native long nativeCreateScannerWithOCR(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i);

    public static native void nativeDispose(long j);

    public static native ArLinkCandidate[] nativeGetCandidatesFromARGBImage(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public static native ArLinkCandidate[] nativeGetCandidatesFromI444Image(long j, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    public static native ArLinkCandidate[] nativeGetCandidatesFromNV21Image(long j, ByteBuffer byteBuffer, int i, int i2);

    public ArLinkScanner(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i) {
        AnonymousClass0Y1.A08("caffe2_ig_ops");
        AnonymousClass0Y1.A08("arlink");
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        this.A00 = nativeCreateScannerWithOCR(str5, str6, str7, str8, z, z2, z3, i);
    }
}
