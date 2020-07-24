package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0hO  reason: invalid class name and case insensitive filesystem */
public abstract class C12790hO {
    public abstract QuickPerformanceLogger A02();

    public abstract C12720hH A03();

    public abstract AnonymousClass2BB A04();

    public abstract void A05(Runnable runnable);

    public final FileStash A01(File file, String str, boolean z, List list) {
        FileStash fileStash;
        QuickPerformanceLogger A02 = A02();
        A02.markerStart(42991640, file.hashCode());
        AnonymousClass0Hz withMarker = A02.withMarker(42991640, file.hashCode());
        withMarker.A06("path", file.toString());
        withMarker.A06("name", str);
        withMarker.Aoj();
        try {
            FileStash r6 = new AnonymousClass2B7(file, A04());
            if (z) {
                AnonymousClass2BG r1 = new AnonymousClass2BG(r6);
                A05(new AnonymousClass2BI(this, r1));
                r6 = r1;
            }
            if (list != null && !list.isEmpty()) {
                if (list == null) {
                    fileStash = new AnonymousClass2BN(r6, Collections.emptyList());
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C30556Dee dee = (C30556Dee) it.next();
                        if (dee instanceof C30556Dee) {
                            arrayList.add(dee);
                        } else {
                            throw new IllegalArgumentException("StashWithEvents can only be created with IStashEventListeners (passed " + dee.getClass() + " instead)");
                        }
                    }
                    fileStash = new AnonymousClass2BN(r6, arrayList);
                }
                r6 = fileStash;
            }
            AnonymousClass2BK r2 = new AnonymousClass2BK(str, file, r6, A02());
            A02.markerEnd(42991640, file.hashCode(), 2);
            return r2;
        } catch (Throwable th) {
            A02.markerEnd(42991640, file.hashCode(), 3);
            throw th;
        }
    }
}
