package com.instagram.model.venue;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Arrays;
import java.util.Collection;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1NN;
import p000X.AnonymousClass1XP;
import p000X.C13080hr;
import p000X.C13120hv;

public class Venue implements Parcelable, AnonymousClass1NN {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(72);
    public Double A00;
    public Double A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;

    public final void A6t(AnonymousClass0C1 r1) {
    }

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return true;
    }

    public final boolean Agp() {
        return true;
    }

    public final boolean Aho() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Venue venue = (Venue) obj;
            if (!AnonymousClass17M.A00(this.A0B, venue.A0B) || !AnonymousClass17M.A00(this.A02, venue.A02) || !AnonymousClass17M.A00(this.A00, venue.A00) || !AnonymousClass17M.A00(this.A01, venue.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0B, this.A02, this.A00, this.A01});
    }

    public static Venue A00(C13080hr r4, boolean z) {
        String str;
        Venue venue;
        Venue venue2 = new Venue();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            venue2 = null;
            venue = null;
        } else {
            while (r4.A0p() != C13120hv.END_OBJECT) {
                String A0i = r4.A0i();
                r4.A0p();
                String str2 = null;
                if ("pk".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A08 = str2;
                } else if ("name".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A0B = str2;
                } else if ("short_name".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A0C = str2;
                } else if ("address".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A02 = str2;
                } else if ("external_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A04 = str2;
                } else if ("facebook_places_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A06 = str2;
                } else if ("foursquare_v2_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A07 = str2;
                } else if ("external_source".equals(A0i) || "external_id_source".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A05 = str2;
                } else if ("profile_pic_url".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A0A = str2;
                } else if ("profile_pic_username".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A09 = str2;
                } else if ("lat".equals(A0i)) {
                    venue2.A00 = Double.valueOf(r4.A0H());
                } else if ("lng".equals(A0i)) {
                    venue2.A01 = Double.valueOf(r4.A0H());
                } else if ("category".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str2 = r4.A0t();
                    }
                    venue2.A03 = str2;
                } else if ("has_viewer_saved".equals(A0i)) {
                    venue2.A0D = r4.A0O();
                }
                r4.A0f();
            }
            if (("facebook_places".equals(venue2.A05) && (str = venue2.A06) != null) || (str = venue2.A07) != null) {
                venue2.A04 = str;
            }
            venue = venue2;
        }
        if (!z) {
            return venue;
        }
        AnonymousClass1XP r3 = AnonymousClass1XP.A00;
        Venue venue3 = (Venue) r3.get(venue2.getId());
        if (venue3 != null) {
            String str3 = venue2.A08;
            if (str3 != null) {
                venue3.A08 = str3;
            }
            String str4 = venue2.A0B;
            if (str4 != null) {
                venue3.A0B = str4;
            }
            String str5 = venue2.A0C;
            if (str5 != null) {
                venue3.A0C = str5;
            }
            String str6 = venue2.A02;
            if (str6 != null) {
                venue3.A02 = str6;
            }
            String str7 = venue2.A04;
            if (str7 != null) {
                venue3.A04 = str7;
            }
            String str8 = venue2.A05;
            if (str8 != null) {
                venue3.A05 = str8;
            }
            String str9 = venue2.A0A;
            if (str9 != null) {
                venue3.A0A = str9;
            }
            String str10 = venue2.A09;
            if (str10 != null) {
                venue3.A09 = str10;
            }
            Double d = venue2.A00;
            if (d != null) {
                venue3.A00 = d;
            }
            Double d2 = venue2.A01;
            if (d2 != null) {
                venue3.A01 = d2;
            }
            String str11 = venue2.A03;
            if (str11 != null) {
                venue3.A03 = str11;
            }
            return venue3;
        }
        r3.put(venue2.getId(), venue2);
        return venue;
    }

    public final Integer AV3() {
        if (this.A0D) {
            return Constants.ZERO;
        }
        return Constants.ONE;
    }

    public final Collection AV4() {
        throw new UnsupportedOperationException("Saving location in collections isn't supported yet.");
    }

    public final boolean AhP() {
        return this.A0D;
    }

    public final void BkJ(Integer num) {
        boolean z = false;
        if (num == Constants.ZERO) {
            z = true;
        }
        this.A0D = z;
    }

    public final String getId() {
        return this.A08;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A03);
    }

    public Venue() {
    }

    public Venue(Parcel parcel) {
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A0A = parcel.readString();
        this.A09 = parcel.readString();
        this.A00 = (Double) parcel.readValue((ClassLoader) null);
        this.A01 = (Double) parcel.readValue((ClassLoader) null);
        this.A03 = parcel.readString();
    }
}
