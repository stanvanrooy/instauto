package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p000X.AnonymousClass0a2;
import p000X.AnonymousClass4YD;
import p000X.C120125Dh;
import p000X.C200108hS;
import p000X.C228309sC;
import p000X.C228479tj;
import p000X.C228509uR;
import p000X.C228649vO;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(183);
    public int A00;
    public int A01;
    public final Parcel A02;
    public final zak A03;
    public final String A04;
    public final int A05;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r0 = android.util.Base64.encodeToString(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r2.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r0 = null;
     */
    public static void A00(StringBuilder sb, int i, Object obj) {
        byte[] bArr;
        int i2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C228509uR.A00(obj.toString()));
                break;
            case 8:
                sb.append("\"");
                bArr = (byte[]) obj;
                if (bArr != null) {
                    i2 = 0;
                    break;
                }
                break;
            case 9:
                sb.append("\"");
                bArr = (byte[]) obj;
                if (bArr != null) {
                    i2 = 10;
                    break;
                }
                break;
            case 10:
                AnonymousClass4YD.A00(sb, (HashMap) obj);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ac, code lost:
        r5.append(r0);
        r5.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b4, code lost:
        r0 = null;
     */
    private final void A01(StringBuilder sb, Map map, Parcel parcel) {
        String str;
        Parcel obtain;
        String str2;
        BigInteger bigInteger;
        boolean[] createBooleanArray;
        BigDecimal[] bigDecimalArr;
        double[] createDoubleArray;
        float[] createFloatArray;
        long[] createLongArray;
        BigInteger[] bigIntegerArr;
        Integer num;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).A03, entry);
        }
        StringBuilder sb2 = sb;
        sb2.append('{');
        Parcel parcel2 = parcel;
        int A012 = C228309sC.A01(parcel2);
        boolean z = false;
        while (parcel2.dataPosition() < A012) {
            int readInt = parcel2.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(C228309sC.A00(readInt));
            if (entry2 != null) {
                if (z) {
                    sb2.append(",");
                }
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb2.append("\"");
                sb2.append((String) entry2.getKey());
                sb2.append("\":");
                boolean z2 = false;
                if (fastJsonResponse$Field.A00 != null) {
                    z2 = true;
                }
                if (z2) {
                    int i = fastJsonResponse$Field.A07;
                    switch (i) {
                        case 0:
                            num = Integer.valueOf(C228309sC.A02(parcel2, readInt));
                            break;
                        case 1:
                            int A032 = C228309sC.A03(parcel2, readInt);
                            int dataPosition = parcel2.dataPosition();
                            if (A032 != 0) {
                                byte[] createByteArray = parcel2.createByteArray();
                                parcel2.setDataPosition(dataPosition + A032);
                                num = new BigInteger(createByteArray);
                                break;
                            } else {
                                num = null;
                                break;
                            }
                        case 2:
                            num = Long.valueOf(C228309sC.A04(parcel2, readInt));
                            break;
                        case 3:
                            C228309sC.A0E(parcel2, readInt, 4);
                            num = Float.valueOf(parcel2.readFloat());
                            break;
                        case 4:
                            C228309sC.A0E(parcel2, readInt, 8);
                            num = Double.valueOf(parcel2.readDouble());
                            break;
                        case 5:
                            num = C228309sC.A09(parcel2, readInt);
                            break;
                        case 6:
                            num = Boolean.valueOf(C228309sC.A0G(parcel2, readInt));
                            break;
                        case 7:
                            num = C228309sC.A08(parcel2, readInt);
                            break;
                        case 8:
                        case 9:
                            num = C228309sC.A0H(parcel2, readInt);
                            break;
                        case 10:
                            Bundle A052 = C228309sC.A05(parcel2, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str3 : A052.keySet()) {
                                hashMap.put(str3, A052.getString(str3));
                            }
                            num = hashMap;
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Unknown field out type = ");
                            sb3.append(i);
                            throw new IllegalArgumentException(sb3.toString());
                    }
                    C228649vO r0 = fastJsonResponse$Field.A00;
                    Integer num2 = num;
                    if (r0 != null) {
                        num2 = r0.A9q(num);
                    }
                    if (fastJsonResponse$Field.A05) {
                        ArrayList arrayList = num2;
                        sb2.append("[");
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (i2 != 0) {
                                sb2.append(",");
                            }
                            A00(sb2, fastJsonResponse$Field.A02, arrayList.get(i2));
                        }
                        sb2.append("]");
                    } else {
                        A00(sb2, fastJsonResponse$Field.A02, num2);
                    }
                } else {
                    if (fastJsonResponse$Field.A0A) {
                        sb2.append("[");
                        switch (fastJsonResponse$Field.A07) {
                            case 0:
                                int[] A0I = C228309sC.A0I(parcel2, readInt);
                                int length = A0I.length;
                                for (int i3 = 0; i3 < length; i3++) {
                                    if (i3 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(Integer.toString(A0I[i3]));
                                }
                                break;
                            case 1:
                                int A033 = C228309sC.A03(parcel2, readInt);
                                int dataPosition2 = parcel2.dataPosition();
                                if (A033 == 0) {
                                    bigIntegerArr = null;
                                } else {
                                    int readInt2 = parcel2.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i4 = 0; i4 < readInt2; i4++) {
                                        bigIntegerArr[i4] = new BigInteger(parcel2.createByteArray());
                                    }
                                    parcel2.setDataPosition(dataPosition2 + A033);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i5 = 0; i5 < length2; i5++) {
                                    if (i5 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigIntegerArr[i5].toString());
                                }
                                break;
                            case 2:
                                int A034 = C228309sC.A03(parcel2, readInt);
                                int dataPosition3 = parcel2.dataPosition();
                                if (A034 == 0) {
                                    createLongArray = null;
                                } else {
                                    createLongArray = parcel2.createLongArray();
                                    parcel2.setDataPosition(dataPosition3 + A034);
                                }
                                int length3 = createLongArray.length;
                                for (int i6 = 0; i6 < length3; i6++) {
                                    if (i6 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(Long.toString(createLongArray[i6]));
                                }
                                break;
                            case 3:
                                int A035 = C228309sC.A03(parcel2, readInt);
                                int dataPosition4 = parcel2.dataPosition();
                                if (A035 == 0) {
                                    createFloatArray = null;
                                } else {
                                    createFloatArray = parcel2.createFloatArray();
                                    parcel2.setDataPosition(dataPosition4 + A035);
                                }
                                int length4 = createFloatArray.length;
                                for (int i7 = 0; i7 < length4; i7++) {
                                    if (i7 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(Float.toString(createFloatArray[i7]));
                                }
                                break;
                            case 4:
                                int A036 = C228309sC.A03(parcel2, readInt);
                                int dataPosition5 = parcel2.dataPosition();
                                if (A036 == 0) {
                                    createDoubleArray = null;
                                } else {
                                    createDoubleArray = parcel2.createDoubleArray();
                                    parcel2.setDataPosition(dataPosition5 + A036);
                                }
                                int length5 = createDoubleArray.length;
                                for (int i8 = 0; i8 < length5; i8++) {
                                    if (i8 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(Double.toString(createDoubleArray[i8]));
                                }
                                break;
                            case 5:
                                int A037 = C228309sC.A03(parcel2, readInt);
                                int dataPosition6 = parcel2.dataPosition();
                                if (A037 == 0) {
                                    bigDecimalArr = null;
                                } else {
                                    int readInt3 = parcel2.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i9 = 0; i9 < readInt3; i9++) {
                                        byte[] createByteArray2 = parcel2.createByteArray();
                                        bigDecimalArr[i9] = new BigDecimal(new BigInteger(createByteArray2), parcel2.readInt());
                                    }
                                    parcel2.setDataPosition(dataPosition6 + A037);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i10 = 0; i10 < length6; i10++) {
                                    if (i10 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigDecimalArr[i10].toString());
                                }
                                break;
                            case 6:
                                int A038 = C228309sC.A03(parcel2, readInt);
                                int dataPosition7 = parcel2.dataPosition();
                                if (A038 == 0) {
                                    createBooleanArray = null;
                                } else {
                                    createBooleanArray = parcel2.createBooleanArray();
                                    parcel2.setDataPosition(dataPosition7 + A038);
                                }
                                int length7 = createBooleanArray.length;
                                for (int i11 = 0; i11 < length7; i11++) {
                                    if (i11 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(Boolean.toString(createBooleanArray[i11]));
                                }
                                break;
                            case 7:
                                String[] A0K = C228309sC.A0K(parcel2, readInt);
                                int length8 = A0K.length;
                                for (int i12 = 0; i12 < length8; i12++) {
                                    if (i12 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(A0K[i12]);
                                    sb2.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case C120125Dh.VIEW_TYPE_BANNER:
                                int A039 = C228309sC.A03(parcel2, readInt);
                                int dataPosition8 = parcel2.dataPosition();
                                Parcel[] parcelArr = null;
                                if (A039 != 0) {
                                    int readInt4 = parcel2.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i13 = 0; i13 < readInt4; i13++) {
                                        int readInt5 = parcel2.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition9 = parcel2.dataPosition();
                                            Parcel obtain2 = Parcel.obtain();
                                            obtain2.appendFrom(parcel2, dataPosition9, readInt5);
                                            parcelArr2[i13] = obtain2;
                                            parcel2.setDataPosition(dataPosition9 + readInt5);
                                        } else {
                                            parcelArr2[i13] = null;
                                        }
                                    }
                                    parcel2.setDataPosition(dataPosition8 + A039);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i14 = 0; i14 < length9; i14++) {
                                    if (i14 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArr[i14].setDataPosition(0);
                                    String str4 = fastJsonResponse$Field.A04;
                                    AnonymousClass0a2.A02(str4);
                                    zak zak = fastJsonResponse$Field.A01;
                                    AnonymousClass0a2.A02(zak);
                                    A01(sb2, (Map) zak.A01.get(str4), parcelArr[i14]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (fastJsonResponse$Field.A07) {
                            case 0:
                                sb2.append(C228309sC.A02(parcel2, readInt));
                                break;
                            case 1:
                                int A0310 = C228309sC.A03(parcel2, readInt);
                                int dataPosition10 = parcel2.dataPosition();
                                if (A0310 == 0) {
                                    bigInteger = null;
                                } else {
                                    byte[] createByteArray3 = parcel2.createByteArray();
                                    parcel2.setDataPosition(dataPosition10 + A0310);
                                    bigInteger = new BigInteger(createByteArray3);
                                }
                                sb2.append(bigInteger);
                                break;
                            case 2:
                                sb2.append(C228309sC.A04(parcel2, readInt));
                                break;
                            case 3:
                                C228309sC.A0E(parcel2, readInt, 4);
                                sb2.append(parcel2.readFloat());
                                break;
                            case 4:
                                C228309sC.A0E(parcel2, readInt, 8);
                                sb2.append(parcel2.readDouble());
                                break;
                            case 5:
                                sb2.append(C228309sC.A09(parcel2, readInt));
                                break;
                            case 6:
                                sb2.append(C228309sC.A0G(parcel2, readInt));
                                break;
                            case 7:
                                String A08 = C228309sC.A08(parcel2, readInt);
                                sb2.append("\"");
                                str2 = C228509uR.A00(A08);
                                break;
                            case 8:
                                byte[] A0H = C228309sC.A0H(parcel2, readInt);
                                sb2.append("\"");
                                if (A0H != null) {
                                    str2 = Base64.encodeToString(A0H, 0);
                                    break;
                                }
                            case 9:
                                byte[] A0H2 = C228309sC.A0H(parcel2, readInt);
                                sb2.append("\"");
                                if (A0H2 != null) {
                                    str2 = Base64.encodeToString(A0H2, 10);
                                    break;
                                }
                            case 10:
                                Bundle A053 = C228309sC.A05(parcel2, readInt);
                                Set<String> keySet = A053.keySet();
                                keySet.size();
                                sb2.append("{");
                                boolean z3 = true;
                                for (String str5 : keySet) {
                                    if (!z3) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str5);
                                    sb2.append("\"");
                                    sb2.append(":");
                                    sb2.append("\"");
                                    sb2.append(C228509uR.A00(A053.getString(str5)));
                                    sb2.append("\"");
                                    z3 = false;
                                }
                                str = "}";
                                break;
                            case C120125Dh.VIEW_TYPE_BANNER:
                                int A0311 = C228309sC.A03(parcel2, readInt);
                                int dataPosition11 = parcel2.dataPosition();
                                if (A0311 == 0) {
                                    obtain = null;
                                } else {
                                    obtain = Parcel.obtain();
                                    obtain.appendFrom(parcel2, dataPosition11, A0311);
                                    parcel2.setDataPosition(dataPosition11 + A0311);
                                }
                                obtain.setDataPosition(0);
                                String str6 = fastJsonResponse$Field.A04;
                                AnonymousClass0a2.A02(str6);
                                zak zak2 = fastJsonResponse$Field.A01;
                                AnonymousClass0a2.A02(zak2);
                                A01(sb2, (Map) zak2.A01.get(str6), obtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb2.append(str);
                }
                z = true;
            }
        }
        if (parcel2.dataPosition() == A012) {
            sb2.append('}');
            return;
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("Overread allowed size end=");
        sb4.append(A012);
        throw new C200108hS(sb4.toString(), parcel2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 != 1) goto L_0x000e;
     */
    public final String toString() {
        AnonymousClass0a2.A03(this.A03, "Cannot convert to JSON on client side.");
        int i = this.A00;
        if (i == 0) {
            this.A01 = C228479tj.A00(this.A02);
            C228479tj.A02(this.A02, this.A01);
            this.A00 = 2;
        }
        Parcel parcel = this.A02;
        parcel.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zak zak = this.A03;
        A01(sb, (Map) zak.A01.get(this.A04), parcel);
        return sb.toString();
    }

    public SafeParcelResponse(int i, Parcel parcel, zak zak) {
        this.A05 = i;
        AnonymousClass0a2.A02(parcel);
        this.A02 = parcel;
        this.A03 = zak;
        if (zak != null) {
            this.A04 = zak.A00;
        }
        this.A00 = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 != 1) goto L_0x0011;
     */
    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A05);
        int i2 = this.A00;
        if (i2 == 0) {
            this.A01 = C228479tj.A00(this.A02);
            C228479tj.A02(this.A02, this.A01);
            this.A00 = 2;
        }
        Parcel parcel2 = this.A02;
        if (parcel2 != null) {
            int A012 = C228479tj.A01(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C228479tj.A02(parcel, A012);
        }
        C228479tj.A09(parcel, 3, this.A03, i, false);
        C228479tj.A02(parcel, A002);
    }
}
