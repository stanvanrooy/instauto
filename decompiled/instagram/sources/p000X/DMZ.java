package p000X;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DMZ */
public final class DMZ {
    public final C30018DMv A00;

    public DMZ(C30018DMv dMv) {
        this.A00 = dMv;
    }

    public final void A00(List list) {
        String str;
        if (!list.isEmpty()) {
            SQLiteDatabase AEx = this.A00.AEx();
            AnonymousClass0ZG.A01(AEx, 1401505260);
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C30021DMy dMy = (C30021DMy) it.next();
                    int[] iArr = AnonymousClass47p.A00;
                    Integer num = dMy.A00;
                    int intValue = num.intValue();
                    int i = iArr[intValue];
                    if (i == 1 || i == 2) {
                        this.A00.Bt9(dMy);
                    } else if (i == 3) {
                        this.A00.BbV(dMy);
                    } else {
                        if (num != null) {
                            switch (intValue) {
                                case 1:
                                    str = "UPDATE";
                                    break;
                                case 2:
                                    str = "REMOVE";
                                    break;
                                default:
                                    str = "ADD";
                                    break;
                            }
                        } else {
                            str = "null";
                        }
                        throw new IllegalArgumentException(AnonymousClass000.A0E("Unknown change type ", str));
                    }
                }
                AEx.setTransactionSuccessful();
            } finally {
                AnonymousClass0ZG.A02(AEx, 1639582680);
            }
        }
    }
}
