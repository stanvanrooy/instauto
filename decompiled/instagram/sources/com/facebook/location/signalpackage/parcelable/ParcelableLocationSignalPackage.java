package com.facebook.location.signalpackage.parcelable;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.location.parcelable.ParcelableImmutableLocation;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass178;
import p000X.AnonymousClass2TL;
import p000X.C228959wM;
import p000X.C229009wV;
import p000X.C229029wX;
import p000X.C229049wc;
import p000X.C229059wd;
import p000X.C44121vd;
import p000X.C54492Xn;
import p000X.C54502Xp;
import p000X.C54512Xq;

public class ParcelableLocationSignalPackage extends C54512Xq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(81);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r1.equals(r5.A01) == false) goto L_0x0018;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C54512Xq)) {
            C54512Xq r5 = (C54512Xq) obj;
            C44121vd r1 = this.A01;
            if (r1 == null) {
                if (r5.A01 != null) {
                    return false;
                }
            }
            String str = this.A0D;
            if (str != null) {
                if (!str.equals(r5.A0D)) {
                    return false;
                }
            } else if (r5.A0D != null) {
                return false;
            }
            Boolean bool = this.A04;
            if (bool != null) {
                if (!bool.equals(r5.A04)) {
                    return false;
                }
            } else if (r5.A04 != null) {
                return false;
            }
            AnonymousClass2TL r12 = this.A02;
            if (r12 != null) {
                if (!r12.equals(r5.A02)) {
                    return false;
                }
            } else if (r5.A02 != null) {
                return false;
            }
            List list = this.A0K;
            if (list != null) {
                if (!list.equals(r5.A0K)) {
                    return false;
                }
            } else if (r5.A0K != null) {
                return false;
            }
            Boolean bool2 = this.A06;
            if (bool2 != null) {
                if (!bool2.equals(r5.A06)) {
                    return false;
                }
            } else if (r5.A06 != null) {
                return false;
            }
            C54492Xn r13 = this.A00;
            if (r13 != null) {
                if (!r13.equals(r5.A00)) {
                    return false;
                }
            } else if (r5.A00 != null) {
                return false;
            }
            List list2 = this.A0I;
            if (list2 != null) {
                if (!list2.equals(r5.A0I)) {
                    return false;
                }
            } else if (r5.A0I != null) {
                return false;
            }
            List list3 = this.A0H;
            if (list3 != null) {
                if (!list3.equals(r5.A0H)) {
                    return false;
                }
            } else if (r5.A0H != null) {
                return false;
            }
            Boolean bool3 = this.A03;
            if (bool3 != null) {
                if (!bool3.equals(r5.A03)) {
                    return false;
                }
            } else if (r5.A03 != null) {
                return false;
            }
            List list4 = this.A0G;
            if (list4 != null) {
                if (!list4.equals(r5.A0G)) {
                    return false;
                }
            } else if (r5.A0G != null) {
                return false;
            }
            Integer num = this.A0A;
            if (num != null) {
                if (!num.equals(r5.A0A)) {
                    return false;
                }
            } else if (r5.A0A != null) {
                return false;
            }
            List list5 = this.A0J;
            if (list5 != null) {
                if (!list5.equals(r5.A0J)) {
                    return false;
                }
            } else if (r5.A0J != null) {
                return false;
            }
            String str2 = this.A0B;
            if (str2 != null) {
                if (!str2.equals(r5.A0B)) {
                    return false;
                }
            } else if (r5.A0B != null) {
                return false;
            }
            String str3 = this.A0C;
            if (str3 != null) {
                if (!str3.equals(r5.A0C)) {
                    return false;
                }
            } else if (r5.A0C != null) {
                return false;
            }
            String str4 = this.A0F;
            if (str4 != null) {
                if (!str4.equals(r5.A0F)) {
                    return false;
                }
            } else if (r5.A0F != null) {
                return false;
            }
            Boolean bool4 = this.A05;
            if (bool4 != null) {
                if (!bool4.equals(r5.A05)) {
                    return false;
                }
            } else if (r5.A05 != null) {
                return false;
            }
            String str5 = this.A0E;
            if (str5 != null) {
                if (!str5.equals(r5.A0E)) {
                    return false;
                }
            } else if (r5.A0E != null) {
                return false;
            }
            Integer num2 = this.A08;
            if (num2 != null) {
                if (!num2.equals(r5.A08)) {
                    return false;
                }
            } else if (r5.A08 != null) {
                return false;
            }
            Float f = this.A07;
            if (f != null) {
                if (!f.equals(r5.A07)) {
                    return false;
                }
            } else if (r5.A07 != null) {
                return false;
            }
            Integer num3 = this.A09;
            if (num3 != null) {
                return num3.equals(r5.A09);
            }
            return r5.A09 == null;
        }
        return false;
    }

    public static ParcelableLocationSignalPackage A00(C54512Xq r5) {
        ParcelableImmutableLocation parcelableImmutableLocation;
        ImmutableList A02;
        ImmutableList A022;
        ImmutableList A023;
        ImmutableList A024;
        if (r5 == null) {
            return null;
        }
        C54502Xp r2 = new C54502Xp(r5);
        C44121vd r4 = r5.A01;
        if (r4 == null) {
            parcelableImmutableLocation = null;
        } else {
            parcelableImmutableLocation = new ParcelableImmutableLocation(new Location(r4.A00), r4.A00());
        }
        r2.A01 = parcelableImmutableLocation;
        r2.A02 = ParcelableWifiScanResult.A02(r5.A02);
        List list = r5.A0K;
        if (list == null) {
            A02 = null;
        } else {
            A02 = AnonymousClass178.A00(list).A01(new C229049wc()).A02();
        }
        r2.A0K = A02;
        r2.A00 = ParcelableGeneralCellInfo.A00(r5.A00);
        List list2 = r5.A0H;
        if (list2 == null) {
            A022 = null;
        } else {
            A022 = AnonymousClass178.A00(list2).A01(new C229059wd()).A02();
        }
        r2.A0H = A022;
        List list3 = r5.A0G;
        if (list3 == null) {
            A023 = null;
        } else {
            A023 = AnonymousClass178.A00(list3).A01(new C229009wV()).A02();
        }
        r2.A0G = A023;
        List list4 = r5.A0J;
        if (list4 == null) {
            A024 = null;
        } else {
            A024 = AnonymousClass178.A00(list4).A01(new C228959wM()).A02();
        }
        r2.A0J = A024;
        return new ParcelableLocationSignalPackage(r2);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C44121vd r0 = this.A01;
        int i21 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i22 = i * 31;
        String str = this.A0D;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i23 = (i22 + i2) * 31;
        Boolean bool = this.A04;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i24 = (i23 + i3) * 31;
        AnonymousClass2TL r02 = this.A02;
        if (r02 != null) {
            i4 = r02.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 31;
        List list = this.A0K;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 31;
        Boolean bool2 = this.A06;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 31;
        C54492Xn r03 = this.A00;
        if (r03 != null) {
            i7 = r03.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 31;
        List list2 = this.A0I;
        if (list2 != null) {
            i8 = list2.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (i28 + i8) * 31;
        List list3 = this.A0H;
        if (list3 != null) {
            i9 = list3.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (i29 + i9) * 31;
        Boolean bool3 = this.A03;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 31;
        List list4 = this.A0G;
        if (list4 != null) {
            i11 = list4.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 31;
        Integer num = this.A0A;
        if (num != null) {
            i12 = num.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 31;
        List list5 = this.A0J;
        if (list5 != null) {
            i13 = list5.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 31;
        String str2 = this.A0B;
        if (str2 != null) {
            i14 = str2.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 31;
        String str3 = this.A0C;
        if (str3 != null) {
            i15 = str3.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (i35 + i15) * 31;
        String str4 = this.A0F;
        if (str4 != null) {
            i16 = str4.hashCode();
        } else {
            i16 = 0;
        }
        int i37 = (i36 + i16) * 31;
        Boolean bool4 = this.A05;
        if (bool4 != null) {
            i17 = bool4.hashCode();
        } else {
            i17 = 0;
        }
        int i38 = (i37 + i17) * 31;
        String str5 = this.A0E;
        if (str5 != null) {
            i18 = str5.hashCode();
        } else {
            i18 = 0;
        }
        int i39 = (i38 + i18) * 31;
        Integer num2 = this.A08;
        if (num2 != null) {
            i19 = num2.hashCode();
        } else {
            i19 = 0;
        }
        int i40 = (i39 + i19) * 31;
        Float f = this.A07;
        if (f != null) {
            i20 = f.hashCode();
        } else {
            i20 = 0;
        }
        int i41 = (i40 + i20) * 31;
        Integer num3 = this.A09;
        if (num3 != null) {
            i21 = num3.hashCode();
        }
        return i41 + i21;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Long valueOf;
        Double d;
        Float f;
        Float f2;
        ImmutableList A02;
        ImmutableList A022;
        ImmutableList A023;
        ImmutableList A024;
        C44121vd r2 = this.A01;
        if (r2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(r2.A00.getLatitude());
            parcel.writeDouble(r2.A00.getLongitude());
            String provider = r2.A00.getProvider();
            if (provider == null) {
                provider = null;
            }
            parcel.writeString(provider);
            Long A025 = r2.A02();
            if (A025 == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeLong(A025.longValue());
            }
            AnonymousClass0a4.A0A(true);
            long elapsedRealtimeNanos = r2.A00.getElapsedRealtimeNanos();
            if (elapsedRealtimeNanos == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(elapsedRealtimeNanos);
            }
            Long l = valueOf;
            if (valueOf == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeLong(l.longValue());
            }
            C229029wX.A03(parcel, r2.A01());
            if (r2.A00.hasAltitude()) {
                d = Double.valueOf(r2.A00.getAltitude());
            } else {
                d = null;
            }
            Double d2 = d;
            if (d == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeDouble(d2.doubleValue());
            }
            if (r2.A00.hasBearing()) {
                f = Float.valueOf(r2.A00.getBearing());
            } else {
                f = null;
            }
            C229029wX.A03(parcel, f);
            if (r2.A00.hasSpeed()) {
                f2 = Float.valueOf(r2.A00.getSpeed());
            } else {
                f2 = null;
            }
            C229029wX.A03(parcel, f2);
            parcel.writeBundle(r2.A00.getExtras());
            C229029wX.A02(parcel, r2.A00());
        }
        parcel.writeString(this.A0D);
        C229029wX.A02(parcel, this.A04);
        parcel.writeParcelable(ParcelableWifiScanResult.A02(this.A02), 0);
        List list = this.A0K;
        if (list == null) {
            A02 = null;
        } else {
            A02 = AnonymousClass178.A00(list).A01(new C229049wc()).A02();
        }
        parcel.writeTypedList(A02);
        C229029wX.A02(parcel, this.A06);
        parcel.writeParcelable(ParcelableGeneralCellInfo.A00(this.A00), 0);
        parcel.writeTypedList(this.A0I);
        List list2 = this.A0H;
        if (list2 == null) {
            A022 = null;
        } else {
            A022 = AnonymousClass178.A00(list2).A01(new C229059wd()).A02();
        }
        parcel.writeTypedList(A022);
        C229029wX.A02(parcel, this.A03);
        List list3 = this.A0G;
        if (list3 == null) {
            A023 = null;
        } else {
            A023 = AnonymousClass178.A00(list3).A01(new C229009wV()).A02();
        }
        parcel.writeTypedList(A023);
        C229029wX.A04(parcel, this.A0A);
        List list4 = this.A0J;
        if (list4 == null) {
            A024 = null;
        } else {
            A024 = AnonymousClass178.A00(list4).A01(new C228959wM()).A02();
        }
        parcel.writeTypedList(A024);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0F);
        C229029wX.A02(parcel, this.A05);
        parcel.writeString(this.A0E);
        C229029wX.A04(parcel, this.A08);
        C229029wX.A03(parcel, this.A07);
        C229029wX.A04(parcel, this.A09);
    }

    public ParcelableLocationSignalPackage(C54502Xp r1) {
        super(r1);
    }
}
