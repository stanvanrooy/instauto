package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass0Y1;

public final class CQLResultSetImpl implements CQLResultSet {
    public final NativeHolder mNativeHolder;

    public native CQLResultSet copy(int i, int i2);

    public native byte[] getBlob(int i, int i2);

    public native boolean getBoolean(int i, int i2);

    public native int getCount();

    public native double getDouble(int i, int i2);

    public native int getInteger(int i, int i2);

    public native long getLong(int i, int i2);

    public native String getString(int i, int i2);

    public native boolean isNull(int i, int i2);

    public native long rowHashCode(int i);

    public native boolean rowsEqual(int i, CQLResultSet cQLResultSet, int i2);

    public native boolean rowsSame(int i, CQLResultSet cQLResultSet, int i2);

    static {
        AnonymousClass0Y1.A08("msysjniinfra");
    }

    public CQLResultSetImpl(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
