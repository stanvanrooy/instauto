package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
import p000X.AnonymousClass40t;
import p000X.C228479tj;
import p000X.C228559vC;
import p000X.C228599vI;

public final class zzi extends AbstractSafeParcelable implements Comparable {
    public static final Comparator A08 = new C228559vC();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(222);
    public final int A00;
    public final String A01;
    public final double A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final boolean A06;
    public final byte[] A07;

    public zzi(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.A01 = str;
        this.A04 = j;
        this.A06 = z;
        this.A02 = d;
        this.A05 = str2;
        this.A07 = bArr;
        this.A03 = i;
        this.A00 = i2;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.A01.compareTo(zzi.A01);
        if (compareTo == 0) {
            int i = this.A03;
            int i2 = zzi.A03;
            if (i < i2) {
                compareTo = -1;
            } else {
                compareTo = 1;
                if (i == i2) {
                    compareTo = 0;
                }
            }
            if (compareTo == 0) {
                int i3 = 0;
                if (i != 1) {
                    if (i == 2) {
                        boolean z = this.A06;
                        if (z != zzi.A06) {
                            return z ? 1 : -1;
                        }
                    } else if (i == 3) {
                        return Double.compare(this.A02, zzi.A02);
                    } else {
                        if (i == 4) {
                            String str = this.A05;
                            String str2 = zzi.A05;
                            if (str != str2) {
                                if (str != null) {
                                    if (str2 != null) {
                                        return str.compareTo(str2);
                                    }
                                }
                            }
                        } else if (i == 5) {
                            byte[] bArr = this.A07;
                            byte[] bArr2 = zzi.A07;
                            if (bArr != bArr2) {
                                if (bArr != null) {
                                    if (bArr2 != null) {
                                        while (true) {
                                            int length = bArr.length;
                                            int length2 = bArr2.length;
                                            if (i3 < Math.min(length, length2)) {
                                                compareTo = bArr[i3] - bArr2[i3];
                                                if (compareTo != 0) {
                                                    break;
                                                }
                                                i3++;
                                            } else if (length < length2) {
                                                return -1;
                                            } else {
                                                return length == length2 ? 0 : 1;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("Invalid enum value: ");
                            sb.append(i);
                            throw new AssertionError(sb.toString());
                        }
                    }
                    return 0;
                }
                long j = this.A04;
                long j2 = zzi.A04;
                if (j >= j2) {
                    if (j == j2) {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (C228599vI.A00(this.A01, zzi.A01) && (i = this.A03) == zzi.A03 && this.A00 == zzi.A00) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return C228599vI.A00(this.A05, zzi.A05);
                            }
                            if (i == 5) {
                                return Arrays.equals(this.A07, zzi.A07);
                            }
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("Invalid enum value: ");
                            sb.append(i);
                            throw new AssertionError(sb.toString());
                        } else if (this.A02 == zzi.A02) {
                            return true;
                        }
                    } else if (this.A06 == zzi.A06) {
                        return true;
                    }
                } else if (this.A04 == zzi.A04) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Flag(");
        String str2 = this.A01;
        sb.append(str2);
        sb.append(", ");
        int i = this.A03;
        if (i == 1) {
            sb.append(this.A04);
        } else if (i == 2) {
            sb.append(this.A06);
        } else if (i != 3) {
            if (i == 4) {
                sb.append("'");
                str = this.A05;
            } else if (i == 5) {
                byte[] bArr = this.A07;
                if (bArr == null) {
                    sb.append("null");
                } else {
                    sb.append("'");
                    str = Base64.encodeToString(bArr, 3);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb2.append(AnonymousClass40t.$const$string(100));
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append(str);
            sb.append("'");
        } else {
            sb.append(this.A02);
        }
        sb.append(", ");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A06(parcel, 3, this.A04);
        C228479tj.A0D(parcel, 4, this.A06);
        double d = this.A02;
        C228479tj.A05(parcel, 5, 8);
        parcel.writeDouble(d);
        C228479tj.A0A(parcel, 6, this.A05, false);
        C228479tj.A0E(parcel, 7, this.A07, false);
        C228479tj.A04(parcel, 8, this.A03);
        C228479tj.A04(parcel, 9, this.A00);
        C228479tj.A02(parcel, A002);
    }
}
