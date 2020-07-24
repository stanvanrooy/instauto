package p000X;

import com.facebook.C0003R;

/* renamed from: X.CFL */
public enum CFL {
    COUNTRY("COUNTRY", C0003R.string.ad_geo_location_type_label_country),
    REGION("REGION", C0003R.string.ad_geo_location_type_label_region),
    CITY("CITY", C0003R.string.ad_geo_location_type_label_city),
    ZIP("ZIP", C0003R.string.ad_geo_location_type_label_zip),
    CUSTOM_LOCATION("CUSTOM_LOCATION", C0003R.string.ad_geo_location_type_label_custom_location);
    
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    CFL(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
