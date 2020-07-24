package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import p000X.C228479tj;
import p000X.C228589vH;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(169);
    public zzr A00;
    public byte[] A01;
    public boolean A02;
    public int[] A03;
    public int[] A04;
    public ExperimentTokens[] A05;
    public String[] A06;
    public byte[][] A07;

    public zze(zzr zzr, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.A00 = zzr;
        this.A01 = bArr;
        this.A03 = iArr;
        this.A06 = strArr;
        this.A04 = iArr2;
        this.A07 = bArr2;
        this.A05 = experimentTokensArr;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zze) {
                zze zze = (zze) obj;
                if (!C228589vH.A00(this.A00, zze.A00) || !Arrays.equals(this.A01, zze.A01) || !Arrays.equals(this.A03, zze.A03) || !Arrays.equals(this.A06, zze.A06) || !C228589vH.A00((Object) null, (Object) null) || !C228589vH.A00((Object) null, (Object) null) || !C228589vH.A00((Object) null, (Object) null) || !Arrays.equals(this.A04, zze.A04) || !Arrays.deepEquals(this.A07, zze.A07) || !Arrays.equals(this.A05, zze.A05) || this.A02 != zze.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A03, this.A06, null, null, null, this.A04, this.A07, this.A05, Boolean.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.A00);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.A01;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.A03));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.A06));
        sb.append(", LogEvent: ");
        sb.append((Object) null);
        sb.append(", ExtensionProducer: ");
        sb.append((Object) null);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.A04));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.A07));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.A05));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.A02);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 2, this.A00, i, false);
        C228479tj.A0E(parcel, 3, this.A01, false);
        int[] iArr = this.A03;
        if (iArr != null) {
            int A012 = C228479tj.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            C228479tj.A02(parcel, A012);
        }
        C228479tj.A0G(parcel, 5, this.A06);
        int[] iArr2 = this.A04;
        if (iArr2 != null) {
            int A013 = C228479tj.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            C228479tj.A02(parcel, A013);
        }
        C228479tj.A0H(parcel, 7, this.A07);
        C228479tj.A0D(parcel, 8, this.A02);
        C228479tj.A0F(parcel, 9, this.A05, i);
        C228479tj.A02(parcel, A002);
    }
}
