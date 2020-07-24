package p000X;

/* renamed from: X.BUk */
public final class BUk implements C475724o {
    public static final BUk A00 = new BUk();
    public static final C475824p A01;
    public static final C475824p A02;
    public static final C475824p A03;
    public static final C475824p[] A04;
    public static final String[] A05 = {"gallery_media_metadata"};

    public final String getName() {
        return "gallery_media_metadata";
    }

    static {
        C475824p r6 = new C475824p(1, "40cf118a5989ff68d1468d6605773e824f345002", new String[]{"CREATE TABLE gallery_media_metadata (\nid TEXT PRIMARY KEY NOT NULL,\nscanner_versions TEXT,\nlatitude REAL,\nlongitude REAL,\nfeature_name TEXT,\nlocality TEXT,\nsub_admin_area TEXT,\ncountry_name TEXT,\nface_count INTEGER DEFAULT(0),\nfaces_json TEXT\n)"});
        A03 = r6;
        C475824p r4 = new C475824p(2, "b556a00e0a5977a698a08f349235af69c09203ae", new String[]{"ALTER TABLE gallery_media_metadata ADD ocn_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD ocv_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD person_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD smiling_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD food_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD nature_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD landmark_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD top_concept INTEGER DEFAULT(-1)", "ALTER TABLE gallery_media_metadata ADD top_concept_score REAL DEFAULT(0)"});
        A01 = r4;
        C475824p r2 = new C475824p(3, "af5cc50d8ae1bce9bafe081571f1aba0435127bb", new String[]{"ALTER TABLE gallery_media_metadata ADD aesthetic_score REAL DEFAULT(0)"});
        A02 = r2;
        A04 = new C475824p[]{r6, r4, r2};
    }

    public final C475824p[] AQH() {
        return A04;
    }

    public final String[] AXh() {
        return A05;
    }
}
