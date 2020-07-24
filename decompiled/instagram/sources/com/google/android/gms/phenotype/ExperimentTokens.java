package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000X.C228479tj;
import p000X.C228599vI;
import p000X.C228609vJ;
import p000X.C228619vK;
import p000X.C228629vL;
import p000X.C228639vM;
import p000X.C228669vQ;

public class ExperimentTokens extends AbstractSafeParcelable {
    public static final C228669vQ A08 = new C228609vJ();
    public static final C228669vQ A09 = new C228639vM();
    public static final C228669vQ A0A = new C228629vL();
    public static final C228669vQ A0B = new C228619vK();
    public static final ExperimentTokens A0C;
    public static final byte[][] A0D;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(221);
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    static {
        byte[][] bArr = new byte[0][];
        A0D = bArr;
        A0C = new ExperimentTokens("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r3);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void A01(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public final boolean equals(Object obj) {
        List arrayList;
        List arrayList2;
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (C228599vI.A00(this.A00, experimentTokens.A00) && Arrays.equals(this.A01, experimentTokens.A01) && C228599vI.A00(A00(this.A03), A00(experimentTokens.A03)) && C228599vI.A00(A00(this.A04), A00(experimentTokens.A04)) && C228599vI.A00(A00(this.A05), A00(experimentTokens.A05)) && C228599vI.A00(A00(this.A06), A00(experimentTokens.A06))) {
                int[] iArr = this.A02;
                if (iArr == null) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList(r2);
                    for (int valueOf : iArr) {
                        arrayList.add(Integer.valueOf(valueOf));
                    }
                    Collections.sort(arrayList);
                }
                int[] iArr2 = experimentTokens.A02;
                if (iArr2 == null) {
                    arrayList2 = Collections.emptyList();
                } else {
                    arrayList2 = new ArrayList(r2);
                    for (int valueOf2 : iArr2) {
                        arrayList2.add(Integer.valueOf(valueOf2));
                    }
                    Collections.sort(arrayList2);
                }
                return C228599vI.A00(arrayList, arrayList2) && C228599vI.A00(A00(this.A07), A00(experimentTokens.A07));
            }
        }
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.A00;
        if (str == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
            sb3.append("'");
            sb3.append(str);
            sb3.append("'");
            sb = sb3.toString();
        }
        sb2.append(sb);
        sb2.append(", ");
        byte[] bArr = this.A01;
        sb2.append(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        A01(sb2, "GAIA", this.A03);
        sb2.append(", ");
        A01(sb2, "PSEUDO", this.A04);
        sb2.append(", ");
        A01(sb2, "ALWAYS", this.A05);
        sb2.append(", ");
        A01(sb2, "OTHER", this.A06);
        sb2.append(", ");
        int[] iArr = this.A02;
        sb2.append("weak");
        sb2.append("=");
        if (iArr == null) {
            sb2.append("null");
        } else {
            sb2.append("(");
            int length = iArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(i2);
                i++;
                z = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        A01(sb2, "directs", this.A07);
        sb2.append(")");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A0E(parcel, 3, this.A01, false);
        C228479tj.A0H(parcel, 4, this.A03);
        C228479tj.A0H(parcel, 5, this.A04);
        C228479tj.A0H(parcel, 6, this.A05);
        C228479tj.A0H(parcel, 7, this.A06);
        int[] iArr = this.A02;
        if (iArr != null) {
            int A012 = C228479tj.A01(parcel, 8);
            parcel.writeIntArray(iArr);
            C228479tj.A02(parcel, A012);
        }
        C228479tj.A0H(parcel, 9, this.A07);
        C228479tj.A02(parcel, A002);
    }
}
