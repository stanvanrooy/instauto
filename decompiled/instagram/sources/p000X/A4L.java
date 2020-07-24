package p000X;

import com.facebook.react.bridge.NativeArray;

/* renamed from: X.A4L */
public final class A4L {
    public NativeArray A00;
    public String A01;
    public String A02;

    public final String toString() {
        String nativeArray;
        String str = this.A02;
        String str2 = this.A01;
        NativeArray nativeArray2 = this.A00;
        if (nativeArray2 == null) {
            nativeArray = "";
        } else {
            nativeArray = nativeArray2.toString();
        }
        return AnonymousClass000.A0P(str, ".", str2, "(", nativeArray, ")");
    }

    public A4L(String str, String str2, NativeArray nativeArray) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = nativeArray;
    }
}
