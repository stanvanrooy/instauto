package p000X;

import java.util.HashMap;

/* renamed from: X.BYN */
public class BYN {
    public final BYN A00;

    public static void A00(Object... objArr) {
        int length = objArr.length;
        if (length % 2 == 0) {
            HashMap hashMap = new HashMap();
            String str = null;
            for (int i = 0; i < length; i++) {
                String valueOf = String.valueOf(objArr[i]);
                if (i % 2 == 0) {
                    str = valueOf;
                } else {
                    hashMap.put(str, valueOf);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Must pass a key & value in pairs.");
    }

    public final void A01(Integer num) {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = "cancel_reason";
        if (1 - num.intValue() != 0) {
            str = "system_back_button";
        } else {
            str = "capture_step_back_button";
        }
        objArr[1] = str;
        A00(objArr);
    }

    public BYN(BYN byn) {
        this.A00 = byn;
    }
}
