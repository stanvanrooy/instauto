package p000X;

import android.content.SharedPreferences;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: X.22w  reason: invalid class name and case insensitive filesystem */
public final class C472622w extends C17920r1 {
    public final /* synthetic */ C17920r1 A00;
    public final /* synthetic */ C17850qu A01;
    public final /* synthetic */ AnonymousClass0C1 A02;

    public C472622w(AnonymousClass0C1 r1, C17850qu r2, C17920r1 r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    private void A00(C37831kI r11) {
        AnonymousClass0C1 r2 = this.A02;
        C37771kC r1 = (C37771kC) r2.AVA(C37771kC.class, new C37781kD(r2));
        r1.A00 = C37881kN.A00(r11);
        if (r11 == null) {
            C37791kE.A02(r1.A01);
        } else {
            AnonymousClass0C1 r6 = r1.A01;
            long j = C37771kC.A02;
            SharedPreferences A002 = C37791kE.A00(r6);
            try {
                Long l = r11.A00;
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    j = TimeUnit.SECONDS.toMillis(l.longValue());
                }
                A002.edit().putLong("qp_cooldown_response_expiration_time", currentTimeMillis + j).apply();
                SharedPreferences.Editor edit = A002.edit();
                StringWriter stringWriter = new StringWriter();
                C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                A05.A0T();
                if (r11.A04 != null) {
                    A05.A0d("surfaces");
                    A05.A0S();
                    for (C37851kK r7 : r11.A04) {
                        if (r7 != null) {
                            A05.A0T();
                            Integer num = r7.A00;
                            if (num != null) {
                                A05.A0F("surface_id", num.intValue());
                            }
                            Long l2 = r7.A01;
                            if (l2 != null) {
                                A05.A0G("cooldown", l2.longValue());
                            }
                            A05.A0Q();
                        }
                    }
                    A05.A0P();
                }
                if (r11.A03 != null) {
                    A05.A0d("slots");
                    A05.A0S();
                    for (C37871kM r72 : r11.A03) {
                        if (r72 != null) {
                            A05.A0T();
                            String str = r72.A01;
                            if (str != null) {
                                A05.A0H("slot", str);
                            }
                            Long l3 = r72.A00;
                            if (l3 != null) {
                                A05.A0G("cooldown", l3.longValue());
                            }
                            A05.A0Q();
                        }
                    }
                    A05.A0P();
                }
                Long l4 = r11.A02;
                if (l4 != null) {
                    A05.A0G("global", l4.longValue());
                }
                Long l5 = r11.A01;
                if (l5 != null) {
                    A05.A0G(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, l5.longValue());
                }
                Long l6 = r11.A00;
                if (l6 != null) {
                    A05.A0G("ttl", l6.longValue());
                }
                AnonymousClass1N4.A00(A05, r11);
                A05.A0Q();
                A05.close();
                edit.putString("qp_cooldown_response_json", stringWriter.toString()).apply();
            } catch (IOException e) {
                AnonymousClass0QD.A05("IG-QP", "failed to update QP cooldown response.", e);
                C37791kE.A02(r6);
            }
        }
        C17850qu r12 = this.A01;
        r12.A00 = this.A00;
        C12810hQ.A02(r12);
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(-1769212026);
        A00((C37831kI) null);
        AnonymousClass0Z0.A0A(1644609081, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1898680438);
        int A032 = AnonymousClass0Z0.A03(-1217850905);
        A00((C37831kI) obj);
        AnonymousClass0Z0.A0A(-1956680810, A032);
        AnonymousClass0Z0.A0A(1545407784, A03);
    }
}
