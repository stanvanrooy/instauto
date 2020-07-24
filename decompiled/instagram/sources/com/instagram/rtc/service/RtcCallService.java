package com.instagram.rtc.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.C102814cA;
import p000X.C13150hy;
import p000X.C16100o2;
import p000X.C16590oq;
import p000X.C18750sM;
import p000X.C24476AoJ;
import p000X.C24478AoL;
import p000X.C24508Aop;
import p000X.C24510Aot;
import p000X.C24515Aoy;
import p000X.C24580Aq4;
import p000X.C27691Iv;
import p000X.C27731Iz;
import p000X.C27791Jf;
import p000X.C29041Oj;

public final class RtcCallService extends Service {
    public static final C24510Aot A03 = new C24510Aot();
    public AnonymousClass0C1 A00;
    public final C18750sM A01 = C29041Oj.A00(C24478AoL.A00);
    public final C18750sM A02 = C29041Oj.A00(C102814cA.A00);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0Z0.A04(190934668);
        C16100o2 r2 = C16100o2.A00;
        if (r2 != null) {
            AnonymousClass0C1 r1 = this.A00;
            if (r1 == null) {
                C13150hy.A03("userSession");
            }
            r2.A04(r1);
        }
        ((C27691Iv) this.A02.getValue()).A01();
        AnonymousClass0Z0.A0B(208158384, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Object[] copyOf;
        String str;
        int A04 = AnonymousClass0Z0.A04(149321791);
        C13150hy.A02(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            copyOf = Arrays.copyOf(new Object[]{intent.toString()}, 1);
            str = "handleStartIntent -- intent action is null. Intent details:\n%s";
        } else {
            int hashCode = action.hashCode();
            if (hashCode != -746681249) {
                if (hashCode != 980138649) {
                    if (hashCode == 1405139896 && action.equals("com.instagram.android.intent.action.LEAVE_VIDEO_CALL")) {
                        C16590oq r2 = C16590oq.A00;
                        AnonymousClass0C1 r1 = this.A00;
                        if (r1 == null) {
                            C13150hy.A03("userSession");
                        }
                        r2.A05(r1, getApplicationContext());
                        stopForeground(true);
                        AnonymousClass0Z0.A0B(2110595963, A04);
                        return 2;
                    }
                } else if (action.equals("com.instagram.android.intent.action.DECLINE_VIDEO_CALL")) {
                    C16590oq r4 = C16590oq.A00;
                    AnonymousClass0C1 r22 = this.A00;
                    if (r22 == null) {
                        C13150hy.A03("userSession");
                    }
                    r4.A06(r22, getApplicationContext(), (String) null);
                    stopForeground(true);
                    AnonymousClass0Z0.A0B(2110595963, A04);
                    return 2;
                }
            } else if (action.equals("com.instagram.android.intent.action.START_CALL_SERVICE")) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    C13150hy.A00();
                }
                AnonymousClass0C1 A06 = AnonymousClass0J1.A06(extras);
                C13150hy.A01(A06, "IgSessionManager.getUserSession(intent.extras!!)");
                this.A00 = A06;
                C24476AoJ aoJ = (C24476AoJ) this.A01.getValue();
                AnonymousClass0C1 r0 = this.A00;
                if (r0 == null) {
                    C13150hy.A03("userSession");
                }
                C27791Jf A09 = aoJ.A7R(r0).A0D(C24515Aoy.A00).A09();
                C24476AoJ aoJ2 = (C24476AoJ) this.A01.getValue();
                AnonymousClass0C1 r02 = this.A00;
                if (r02 == null) {
                    C13150hy.A03("userSession");
                }
                ((C27691Iv) this.A02.getValue()).A02(C27791Jf.A02(A09, aoJ2.ADH(r02).A09(), C24580Aq4.A00).A09().A0G(C27731Iz.A00), new C24508Aop(this));
                C16100o2 r12 = C16100o2.A00;
                if (r12 != null) {
                    AnonymousClass0C1 r03 = this.A00;
                    if (r03 == null) {
                        C13150hy.A03("userSession");
                    }
                    r12.A03(r03);
                }
                AnonymousClass0Z0.A0B(2110595963, A04);
                return 2;
            }
            copyOf = Arrays.copyOf(new Object[]{intent.toString()}, 1);
            str = "handleStartIntent -- unrecognized intent action. Intent details:\n%s";
        }
        String format = String.format(str, copyOf);
        C13150hy.A01(format, "java.lang.String.format(format, *args)");
        AnonymousClass0QD.A02("RtcCallService", format);
        AnonymousClass0Z0.A0B(2110595963, A04);
        return 2;
    }
}
