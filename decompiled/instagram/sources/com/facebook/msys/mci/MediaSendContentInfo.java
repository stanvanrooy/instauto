package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass0Y1;

public class MediaSendContentInfo {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(byte[] bArr, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, Long l2, byte[] bArr2);

    private native boolean nativeEquals(Object obj);

    public native Long getAttachmentDurationMs();

    public native Long getAttachmentType();

    public native String getCaptionText();

    public native byte[] getEffects();

    public native String getFileName();

    public native String getFilePath();

    public native String getMimeType();

    public native String getOfflineAttachmentId();

    public native String getOfflineThreadingId();

    public native String getOriginalFileHash();

    public native String getRecipientId();

    public native String getReplySourceId();

    public native byte[] getUploadData();

    public native int hashCode();

    public native String toString();

    static {
        AnonymousClass0Y1.A08("msysjniinfranosqlite");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSendContentInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaSendContentInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
