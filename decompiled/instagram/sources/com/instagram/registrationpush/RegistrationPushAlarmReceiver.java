package com.instagram.registrationpush;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.C0003R;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0XS;
import p000X.AnonymousClass0XU;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass2O4;
import p000X.AnonymousClass6KY;
import p000X.C06590Pq;
import p000X.C129845h5;
import p000X.C13910jS;

public class RegistrationPushAlarmReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(2008941914);
        AnonymousClass6KY A00 = AnonymousClass6KY.A00(context);
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (C129845h5.A07() || C129845h5.A06()) {
            AnonymousClass0Q7.A03().A0D(A00);
        } else if (AnonymousClass0Q7.A03().A0H()) {
            synchronized (C129845h5.class) {
                C129845h5.A00.A00(true);
            }
            C13910jS.Pushable.A01(A012).A07();
            AnonymousClass2O4 r7 = new AnonymousClass2O4(A00.A02, "ig_other");
            AnonymousClass2O4.A01(r7, 16, true);
            r7.A09.icon = AnonymousClass1BA.A00(A00.A02);
            r7.A09(A00.A02.getString(C0003R.string.instagram));
            r7.A0E = AnonymousClass2O4.A00(A00.A02.getString(C0003R.string.local_push_prompt));
            Context context2 = A00.A02;
            Class<RegistrationPushActionReceiver> cls = RegistrationPushActionReceiver.class;
            Intent intent2 = new Intent(context2, cls);
            intent2.setAction("com.instagram.registrationpush.ACTION_TAPPED");
            AnonymousClass0XS A002 = AnonymousClass0XU.A00();
            A002.A04(intent2, context2.getClassLoader());
            r7.A0A = A002.A02(context2, 0, 0);
            Context context3 = A00.A02;
            Intent intent3 = new Intent(context3, cls);
            intent3.setAction("com.instagram.registrationpush.ACTION_DELETED");
            AnonymousClass0XS A003 = AnonymousClass0XU.A00();
            A003.A04(intent3, context3.getClassLoader());
            r7.A09.deleteIntent = A003.A02(context3, 0, 0);
            Notification A02 = r7.A02();
            AnonymousClass0P4 A004 = C13910jS.Pushed.A01(A012).A00();
            A004.A0E("time_variation", 30);
            AnonymousClass0WN.A01(A012).BcG(A004);
            A00.A01.notify("registration", 64278, A02);
        }
        AnonymousClass0Z0.A0E(intent, 975778410, A01);
    }
}
