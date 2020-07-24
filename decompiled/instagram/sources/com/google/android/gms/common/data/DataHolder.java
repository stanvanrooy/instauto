package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import p000X.C228479tj;
import p000X.C228869vy;
import p000X.C228919wB;
import p000X.C228929wC;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final C228919wB A08 = new C228929wC(new String[0]);
    public static final Parcelable.Creator CREATOR = new C228869vy();
    public Bundle A00;
    public boolean A01 = false;
    public int[] A02;
    public final int A03;
    public final Bundle A04;
    public final CursorWindow[] A05;
    public final String[] A06;
    public final int A07;

    public final void close() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A05;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.A05.length > 0) {
                synchronized (this) {
                    z = this.A01;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.A07 = i;
        this.A06 = strArr;
        this.A05 = cursorWindowArr;
        this.A03 = i2;
        this.A04 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0G(parcel, 1, this.A06);
        C228479tj.A0F(parcel, 2, this.A05, i);
        C228479tj.A04(parcel, 3, this.A03);
        C228479tj.A07(parcel, 4, this.A04);
        C228479tj.A04(parcel, 1000, this.A07);
        C228479tj.A02(parcel, A002);
        if ((i & 1) != 0) {
            close();
        }
    }
}
