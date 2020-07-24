package p000X;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BWJ */
public final class BWJ implements C194388Tu {
    public final BWI A00;
    public final String A01 = "filetree";
    public final Map A02;

    public BWJ(Map map, BWI bwi) {
        this.A02 = map;
        this.A00 = bwi;
    }

    private BWM A00(File file, Map map, String str, int i) {
        long j;
        long j2;
        BWM bwm;
        BWI bwi = this.A00;
        File file2 = file;
        boolean z = false;
        if (i == 1 && ((bwi.A03 && file2.getName().equalsIgnoreCase(bwi.A00)) || (bwi.A04 && file2.getName().equalsIgnoreCase(bwi.A01)))) {
            z = true;
        }
        int i2 = i + 1;
        File[] listFiles = file.listFiles();
        long j3 = 0;
        String str2 = str;
        Map map2 = map;
        if (listFiles == null || (r3 = listFiles.length) <= 0) {
            j2 = 0;
            j = 0;
        } else {
            j2 = 0;
            j = 0;
            for (File file3 : listFiles) {
                if (!C698333v.A03(file3)) {
                    if (file3.isDirectory()) {
                        BWI bwi2 = this.A00;
                        boolean z2 = false;
                        if (i2 <= bwi2.A02) {
                            z2 = true;
                        }
                        bwm = z2 ? A00(file3, map2, AnonymousClass000.A0J(str2, bwi2.A00(file3.getName()), "/"), i2) : new BWM(C698333v.A01(file3));
                    } else {
                        bwm = new BWM(C698333v.A01(file3));
                        if (z) {
                            A01(map2, AnonymousClass000.A0E(str2, this.A00.A00(file3.getName())), bwm);
                        }
                    }
                    j3 += bwm.A00;
                    j2 += bwm.A02;
                    j += bwm.A01 + 1;
                }
            }
        }
        C698433w A002 = C698333v.A00(file);
        BWM bwm2 = new BWM(new C698433w(A002.A00 + j3, A002.A02 + j2, j));
        A01(map2, str2, bwm2);
        return bwm2;
    }

    public final Map BYM() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A02.entrySet()) {
            if (entry.getValue() != null) {
                A00((File) entry.getValue(), hashMap, (String) entry.getKey(), 0);
            }
        }
        return hashMap;
    }

    public static void A01(Map map, String str, BWM bwm) {
        if (!map.containsKey(str)) {
            map.put(str, bwm);
            return;
        }
        BWM bwm2 = (BWM) map.get(str);
        if (bwm2 != null) {
            map.put(str, new BWM(bwm.A00(bwm2)));
        }
    }

    public final String AiW() {
        return this.A01;
    }
}
