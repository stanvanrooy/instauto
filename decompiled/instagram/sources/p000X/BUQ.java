package p000X;

import android.database.Cursor;
import com.instagram.react.views.maps.IgStaticMapViewManager;

/* renamed from: X.BUQ */
public final class BUQ {
    public final AnonymousClass16T A00;

    public static C248316e A00() {
        C248316e r3 = new C248316e("gallery_media_metadata");
        r3.A03 = new String[]{"id", "scanner_versions", IgStaticMapViewManager.LATITUDE_KEY, IgStaticMapViewManager.LONGITUDE_KEY, "feature_name", "locality", "sub_admin_area", "country_name", "faces_json", "ocn_score", "ocv_score", "person_score", "smiling_score", "food_score", "nature_score", "landmark_score", "top_concept", "top_concept_score", "aesthetic_score"};
        return r3;
    }

    public static BUT A01(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("id");
        int columnIndex2 = cursor2.getColumnIndex("scanner_versions");
        int columnIndex3 = cursor2.getColumnIndex(IgStaticMapViewManager.LATITUDE_KEY);
        int columnIndex4 = cursor2.getColumnIndex(IgStaticMapViewManager.LONGITUDE_KEY);
        int columnIndex5 = cursor2.getColumnIndex("feature_name");
        int columnIndex6 = cursor2.getColumnIndex("locality");
        int columnIndex7 = cursor2.getColumnIndex("sub_admin_area");
        int columnIndex8 = cursor2.getColumnIndex("country_name");
        int columnIndex9 = cursor2.getColumnIndex("faces_json");
        int columnIndex10 = cursor2.getColumnIndex("ocn_score");
        int columnIndex11 = cursor2.getColumnIndex("ocv_score");
        int columnIndex12 = cursor2.getColumnIndex("person_score");
        int columnIndex13 = cursor2.getColumnIndex("smiling_score");
        int columnIndex14 = cursor2.getColumnIndex("food_score");
        int columnIndex15 = cursor2.getColumnIndex("nature_score");
        int columnIndex16 = cursor2.getColumnIndex("landmark_score");
        int columnIndex17 = cursor2.getColumnIndex("top_concept");
        int columnIndex18 = cursor2.getColumnIndex("top_concept_score");
        int columnIndex19 = cursor2.getColumnIndex("aesthetic_score");
        String string = cursor2.getString(columnIndex);
        String string2 = cursor2.getString(columnIndex2);
        double d = cursor2.getDouble(columnIndex3);
        double d2 = cursor2.getDouble(columnIndex4);
        return new BUT(string, string2, Double.valueOf(d), Double.valueOf(d2), cursor2.getString(columnIndex5), cursor2.getString(columnIndex6), cursor2.getString(columnIndex7), cursor2.getString(columnIndex8), cursor2.getString(columnIndex9), Float.valueOf(cursor2.getFloat(columnIndex10)), Float.valueOf(cursor2.getFloat(columnIndex11)), Float.valueOf(cursor2.getFloat(columnIndex12)), Float.valueOf(cursor2.getFloat(columnIndex13)), Float.valueOf(cursor2.getFloat(columnIndex14)), Float.valueOf(cursor2.getFloat(columnIndex15)), Float.valueOf(cursor2.getFloat(columnIndex16)), Integer.valueOf(cursor2.getInt(columnIndex17)), Float.valueOf(cursor2.getFloat(columnIndex18)), Float.valueOf(cursor2.getFloat(columnIndex19)));
    }

    public BUQ(AnonymousClass16T r1) {
        this.A00 = r1;
    }
}
