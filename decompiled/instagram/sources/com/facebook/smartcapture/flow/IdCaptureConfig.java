package com.facebook.smartcapture.flow;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.facebook.smartcapture.clientsignals.ClientSignalsAccumulator;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.p011ui.IdCaptureUi;
import com.facebook.smartcapture.resources.ResourcesProvider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000X.C26626Boi;
import p000X.C27237C4e;
import p000X.C27238C4f;
import p000X.C4Y;

public class IdCaptureConfig implements Parcelable {
    public static volatile C27237C4e A0H;
    public static volatile C27238C4f A0I;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(85);
    public final int A00;
    public final Bundle A01;
    public final ClientSignalsAccumulator A02;
    public final IdCaptureExperimentConfigProvider A03;
    public final SmartCaptureLoggerProvider A04;
    public final ResourcesProvider A05;
    public final IdCaptureUi A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C27237C4e A0E;
    public final C27238C4f A0F;
    public final Set A0G;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdCaptureConfig) {
                IdCaptureConfig idCaptureConfig = (IdCaptureConfig) obj;
                if (!C26626Boi.A03(this.A07, idCaptureConfig.A07) || A00() != idCaptureConfig.A00() || !C26626Boi.A03(this.A06, idCaptureConfig.A06) || !C26626Boi.A03(this.A02, idCaptureConfig.A02) || !C26626Boi.A03(this.A03, idCaptureConfig.A03) || A01() != idCaptureConfig.A01() || !C26626Boi.A03(this.A08, idCaptureConfig.A08) || !C26626Boi.A03(this.A09, idCaptureConfig.A09) || this.A0C != idCaptureConfig.A0C || this.A0D != idCaptureConfig.A0D || !C26626Boi.A03(this.A04, idCaptureConfig.A04) || !C26626Boi.A03(this.A0A, idCaptureConfig.A0A) || !C26626Boi.A03(this.A05, idCaptureConfig.A05) || !C26626Boi.A03(this.A0B, idCaptureConfig.A0B) || !C26626Boi.A03(this.A01, idCaptureConfig.A01) || this.A00 != idCaptureConfig.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C27237C4e A00() {
        if (this.A0G.contains("captureMode")) {
            return this.A0E;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = C27237C4e.FRONT_ONLY;
                }
            }
        }
        return A0H;
    }

    public final C27238C4f A01() {
        if (this.A0G.contains("featureLevel")) {
            return this.A0F;
        }
        if (A0I == null) {
            synchronized (this) {
                if (A0I == null) {
                    A0I = C27238C4f.LOW_END;
                }
            }
        }
        return A0I;
    }

    public final int hashCode() {
        int ordinal;
        int A002 = C26626Boi.A00(1, this.A07);
        int i = -1;
        if (A00() == null) {
            ordinal = -1;
        } else {
            ordinal = A00().ordinal();
        }
        int A003 = C26626Boi.A00(C26626Boi.A00(C26626Boi.A00((A002 * 31) + ordinal, this.A06), this.A02), this.A03);
        if (A01() != null) {
            i = A01().ordinal();
        }
        return (C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A01(C26626Boi.A01(C26626Boi.A00(C26626Boi.A00((A003 * 31) + i, this.A08), this.A09), this.A0C), this.A0D), this.A04), this.A0A), this.A05), this.A0B), this.A01) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A07 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A07);
        }
        if (this.A0E == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(this.A0E.ordinal());
        }
        if (this.A06 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A06, i);
        }
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A02, i);
        }
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A03, i);
        }
        if (this.A0F == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(this.A0F.ordinal());
        }
        if (this.A08 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A08);
        }
        if (this.A09 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A09);
        }
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        if (this.A04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A04, i);
        }
        parcel.writeString(this.A0A);
        if (this.A05 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A05, i);
        }
        if (this.A0B == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A0B);
        }
        if (this.A01 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.A01.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0G.size());
        for (String writeString : this.A0G) {
            parcel.writeString(writeString);
        }
    }

    public IdCaptureConfig(C4Y c4y) {
        this.A07 = null;
        this.A0E = c4y.A01;
        this.A06 = c4y.A04;
        this.A02 = null;
        this.A03 = null;
        this.A0F = c4y.A02;
        this.A08 = c4y.A05;
        this.A09 = null;
        this.A0C = false;
        this.A0D = false;
        this.A04 = null;
        String str = c4y.A06;
        C26626Boi.A02(str, "product");
        this.A0A = str;
        this.A05 = c4y.A03;
        this.A0B = c4y.A07;
        this.A01 = c4y.A00;
        this.A00 = 0;
        this.A0G = Collections.unmodifiableSet(c4y.A08);
    }

    public IdCaptureConfig(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = C27237C4e.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (IdCaptureUi) parcel.readParcelable(IdCaptureUi.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ClientSignalsAccumulator) parcel.readParcelable(ClientSignalsAccumulator.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (IdCaptureExperimentConfigProvider) parcel.readParcelable(IdCaptureExperimentConfigProvider.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = C27238C4f.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        boolean z = true;
        this.A0C = parcel.readInt() == 1;
        this.A0D = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (SmartCaptureLoggerProvider) parcel.readParcelable(SmartCaptureLoggerProvider.class.getClassLoader());
        }
        this.A0A = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ResourcesProvider) parcel.readParcelable(ResourcesProvider.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readInt();
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A0G = Collections.unmodifiableSet(hashSet);
    }
}
