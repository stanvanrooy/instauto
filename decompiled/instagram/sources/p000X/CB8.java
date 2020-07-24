package p000X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CB8 */
public final class CB8 implements C110024oc {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    public final List Aoo(AnonymousClass0C1 r5) {
        List list;
        File file = new File(AnonymousClass0QO.A00.getCacheDir(), "recent_place_search.json");
        List arrayList = new ArrayList();
        try {
            AnonymousClass0IY r1 = new AnonymousClass0IY(r5, C12890hY.A00.A07(file));
            r1.A0p();
            CBA parseFromJson = CB9.parseFromJson(r1);
            if (!(parseFromJson == null || (list = parseFromJson.A00) == null)) {
                arrayList = list;
            }
            file.delete();
            r1.close();
            return arrayList;
        } catch (C45361xk | FileNotFoundException | IOException unused) {
            return arrayList;
        } catch (Throwable ) {
            throw th;
        }
    }
}
