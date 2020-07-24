package p000X;

import android.content.Context;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BY6 */
public final class BY6 {
    public final AnonymousClass0C1 A00;
    public final BY8 A01;
    public final Context A02;
    public final AnonymousClass1L8 A03;

    public static void A00(BY6 by6, C13300iJ r7, COS cos) {
        String $const$string;
        try {
            C15890nh r5 = new C15890nh(by6.A00);
            r5.A0C = "commerce/permissions/users/";
            r5.A09 = Constants.ONE;
            r5.A06(AnonymousClass1N4.class, false);
            if (cos == COS.REMOVE) {
                $const$string = C193418Ps.$const$string(139);
            } else {
                $const$string = C193418Ps.$const$string(74);
            }
            List<C13300iJ> singletonList = Collections.singletonList(r7);
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0S();
            for (C13300iJ id : singletonList) {
                A05.A0g(id.getId());
            }
            A05.A0P();
            A05.close();
            r5.A09($const$string, stringWriter.toString());
            C17850qu A032 = r5.A03();
            A032.A00 = new BY7(by6, r7, cos);
            C28351Lj.A00(by6.A02, by6.A03, A032);
        } catch (IOException e) {
            by6.A01.B3q(e, r7, cos);
        }
    }

    public BY6(BY8 by8, AnonymousClass0C1 r2, Context context, AnonymousClass1L8 r4) {
        this.A01 = by8;
        this.A00 = r2;
        this.A02 = context;
        this.A03 = r4;
    }
}
