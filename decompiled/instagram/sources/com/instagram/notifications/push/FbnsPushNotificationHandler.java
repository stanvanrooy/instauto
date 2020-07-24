package com.instagram.notifications.push;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import com.instagram.common.notifications.push.intf.PushChannelType;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0XI;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZP;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass2Cf;
import p000X.C05210Iq;
import p000X.C05700Lp;
import p000X.C06590Pq;
import p000X.C08330Wp;
import p000X.C08370Wt;
import p000X.C10240ct;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C16180oA;
import p000X.C16670oy;
import p000X.C41941rE;
import p000X.C41951rF;
import p000X.C49442Cg;

public class FbnsPushNotificationHandler extends C08330Wp {
    public boolean A00 = false;

    public class IgFbnsCallbackReceiver extends C10240ct {
        public IgFbnsCallbackReceiver() {
            super(FbnsPushNotificationHandler.class);
        }

        public final void onReceive(Context context, Intent intent) {
            int i;
            int A01 = AnonymousClass0Z0.A01(1087745586);
            if (intent.getAction() == null) {
                i = -778793719;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    AnonymousClass2Cf r6 = new AnonymousClass2Cf(context, AnonymousClass0J1.A01(this));
                    PowerManager.WakeLock A00 = AnonymousClass0ZP.A00((PowerManager) context.getSystemService("power"), 1, "WakefulPushExecutor");
                    AnonymousClass0ZP.A03(A00);
                    AnonymousClass0ZP.A04(A00, 60000);
                    C05700Lp.A00().ADc(new C49442Cg(r6, intent, A00));
                } else {
                    super.onReceive(context, intent);
                }
                C12600h4.A00().A05(C12620h6.NOTIFICATION_RECEIVED);
                i = 24001926;
            }
            AnonymousClass0Z0.A0E(intent, i, A01);
        }
    }

    public final void onHandleIntent(Intent intent) {
        try {
            super.onHandleIntent(intent);
        } finally {
            if (this.A00) {
                stopForeground(true);
            }
        }
    }

    public FbnsPushNotificationHandler() {
        super(FbnsPushNotificationHandler.class.getName());
    }

    public final void A02(String str) {
        AnonymousClass0QD.A01("FbnsPushNotificationHandler onRegistrationError", str);
    }

    public final void A00() {
        C16670oy.A01();
    }

    public final void A01(Intent intent) {
        C16670oy A01 = C16670oy.A01();
        PushChannelType pushChannelType = PushChannelType.FBNS;
        A01.A08(intent, pushChannelType, C41941rE.A00(pushChannelType));
        C08370Wt.A00(this, intent);
    }

    public final void A03(String str, boolean z) {
        C16670oy A01 = C16670oy.A01();
        Context applicationContext = getApplicationContext();
        PushChannelType pushChannelType = PushChannelType.FBNS;
        int i = 2;
        if (z) {
            i = 3;
        }
        A01.A07(applicationContext, str, pushChannelType, i, pushChannelType.equals(C41951rF.A00().ATL()));
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (A012.AgN()) {
            C16180oA.A00(C05210Iq.A02(A012)).A00.edit().putString("fbns_token", str).apply();
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(-1790364892);
        if (intent != null) {
            this.A00 = intent.getBooleanExtra("foreground", false);
        }
        if (this.A00) {
            Context applicationContext = getApplicationContext();
            Integer valueOf = Integer.valueOf(AnonymousClass1BA.A00(this));
            AnonymousClass0XI r0 = AnonymousClass0XI.A01;
            if (r0 == null) {
                synchronized (AnonymousClass0XI.class) {
                    r0 = AnonymousClass0XI.A01;
                    if (r0 == null) {
                        r0 = new AnonymousClass0XI(applicationContext, valueOf);
                        AnonymousClass0XI.A01 = r0;
                    }
                }
            }
            startForeground(20014, r0.A00);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0Z0.A0B(-1417548080, A04);
        return onStartCommand;
    }
}
