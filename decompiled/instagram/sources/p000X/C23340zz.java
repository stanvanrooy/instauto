package p000X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0zz  reason: invalid class name and case insensitive filesystem */
public final class C23340zz implements C11590fD {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C23340zz(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C23310zw r1 = C23320zx.A00;
        if (r1 == null) {
            C13150hy.A03("factory");
        }
        AnonymousClass0C1 r10 = this.A00;
        C13150hy.A02(r10, "userSession");
        Context context = r1.A00;
        C13150hy.A02(r10, "userSession");
        C13150hy.A02(context, "context");
        HashMap hashMap = AnonymousClass100.A00;
        Class<AnonymousClass101> cls = AnonymousClass101.class;
        hashMap.put(cls, AnonymousClass102.A00);
        Class<AnonymousClass103> cls2 = AnonymousClass103.class;
        hashMap.put(cls2, new AnonymousClass103(new AnonymousClass105(r10)));
        Class<AnonymousClass106> cls3 = AnonymousClass106.class;
        hashMap.put(cls3, new AnonymousClass106(r10));
        Class<AnonymousClass107> cls4 = AnonymousClass107.class;
        Object obj = hashMap.get(cls3);
        if (obj != null) {
            hashMap.put(cls4, new AnonymousClass107((AnonymousClass106) obj));
            Class<C234410k> cls5 = C234410k.class;
            C234510l r2 = new C234510l(context);
            Object obj2 = hashMap.get(cls);
            if (obj2 != null) {
                hashMap.put(cls5, new C234410k(r2, r10, (AnonymousClass101) obj2));
                Class<C234610m> cls6 = C234610m.class;
                Object obj3 = hashMap.get(cls4);
                if (obj3 != null) {
                    AnonymousClass107 r4 = (AnonymousClass107) obj3;
                    Object obj4 = hashMap.get(cls5);
                    if (obj4 != null) {
                        C234410k r3 = (C234410k) obj4;
                        C13150hy.A02(r10, "userSession");
                        Map A01 = C13360iP.A01(C234910p.A00(AnonymousClass108.OTHER_ACCOUNTS, new C234710n(r10)));
                        Object obj5 = hashMap.get(cls);
                        if (obj5 != null) {
                            hashMap.put(cls6, new C234610m(r4, r3, A01, (AnonymousClass101) obj5));
                            Class<C235110r> cls7 = C235110r.class;
                            Object obj6 = hashMap.get(cls6);
                            if (obj6 != null) {
                                C234610m r32 = (C234610m) obj6;
                                Object obj7 = hashMap.get(cls2);
                                if (obj7 != null) {
                                    AnonymousClass103 r22 = (AnonymousClass103) obj7;
                                    Object obj8 = hashMap.get(cls);
                                    if (obj8 != null) {
                                        hashMap.put(cls7, new C235110r(r32, r22, (AnonymousClass101) obj8));
                                        return new C235210s();
                                    }
                                } else {
                                    throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingAnalyticsLogger");
                                }
                            } else {
                                throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.repository.BadgingRepository");
                            }
                        }
                    } else {
                        throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.api.BadgingApi");
                    }
                } else {
                    throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.graph.UseCaseGraph");
                }
            }
            throw new C183227s6("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
        }
        throw new C183227s6("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
    }
}
