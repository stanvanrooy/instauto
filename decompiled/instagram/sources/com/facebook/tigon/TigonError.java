package com.facebook.tigon;

import java.io.Serializable;

public final class TigonError implements Serializable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public TigonError(int i, String str, int i2, String str2) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = str2;
    }
}
