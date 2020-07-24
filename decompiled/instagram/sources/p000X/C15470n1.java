package p000X;

import android.widget.Toast;
import java.util.List;
import java.util.Map;

/* renamed from: X.0n1  reason: invalid class name and case insensitive filesystem */
public final class C15470n1 {
    public Toast A00;
    public C53642Tq A01;

    public static Object A01(C53542Te r3) {
        boolean z = r3 instanceof AnonymousClass997;
        if (z) {
            Object A012 = C51412Ko.A01(r3);
            if (A012 instanceof List) {
                C06170Oa A002 = C06170Oa.A00();
                for (C53542Te A013 : (List) A012) {
                    Object A014 = A01(A013);
                    if (A014 instanceof C06170Oa) {
                        A002.A00.add((C06170Oa) A014);
                    } else if (A014 instanceof C06270Ok) {
                        A002.A00.add((C06270Ok) A014);
                    } else {
                        A002.A04((String) A014);
                    }
                }
                return A002;
            }
        }
        if (z) {
            Object A015 = C51412Ko.A01(r3);
            if (A015 instanceof Map) {
                return A00((Map) A015);
            }
        }
        return AnonymousClass2Tg.A01(r3);
    }

    public static C06270Ok A00(Map map) {
        C06270Ok A002 = C06270Ok.A00();
        for (Map.Entry entry : map.entrySet()) {
            String A012 = AnonymousClass2Tg.A01((C53542Te) entry.getKey());
            Object A013 = A01((C53542Te) entry.getValue());
            if (A013 instanceof C06170Oa) {
                A002.A04(A012, (C06170Oa) A013);
            } else if (A013 instanceof C06270Ok) {
                A002.A03(A012, (C06270Ok) A013);
            } else {
                A002.A09(A012, (String) A013);
            }
        }
        return A002;
    }
}
