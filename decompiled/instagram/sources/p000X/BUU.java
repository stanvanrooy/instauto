package p000X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.BUU */
public final class BUU implements Callable {
    public final /* synthetic */ AnonymousClass3XV A00;

    public BUU(AnonymousClass3XV r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    public final Object call() {
        C181857pb r0 = this.A00.A06;
        HashMap hashMap = new HashMap();
        C25665BUb bUb = new C25665BUb(r0.A00);
        BUQ buq = new BUQ(bUb.A00.Aap());
        ArrayList<BUT> arrayList = new ArrayList<>();
        try {
            Cursor BYk = buq.A00.BYk(BUQ.A00().A01());
            while (BYk.moveToNext()) {
                arrayList.add(BUQ.A01(BYk));
            }
            BYk.close();
        } catch (RuntimeException e) {
            AnonymousClass0QD.A09("GalleryMediaMetadataDatabaseAccessHelper#fetchAll", e);
        } catch (Throwable ) {
            throw th;
        }
        for (BUT but : arrayList) {
            hashMap.put(but.A0G, but);
        }
        bUb.A00.close();
        return hashMap;
    }
}
