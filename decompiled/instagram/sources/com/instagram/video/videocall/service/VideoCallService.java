package com.instagram.video.videocall.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.C0003R;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0XS;
import p000X.AnonymousClass0XU;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2O4;
import p000X.AnonymousClass2O5;
import p000X.AnonymousClass2i3;
import p000X.C16100o2;
import p000X.C16590oq;
import p000X.C16830pE;
import p000X.C23933Ads;

public class VideoCallService extends Service {
    public AnonymousClass0C1 A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0Z0.A04(-1322406207);
        C16100o2 r1 = C16100o2.A00;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        if (z && r1 != null) {
            r1.A04(this.A00);
        }
        AnonymousClass0Z0.A0B(-1424364231, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Object[] objArr;
        String str;
        int A04 = AnonymousClass0Z0.A04(-1825079450);
        if (intent == null) {
            AnonymousClass0QD.A01("VideoCallService", "handleStartIntent -- intent is null");
        } else {
            String action = intent.getAction();
            if (action == null) {
                objArr = new Object[]{intent.toString()};
                str = "handleStartIntent -- intent action is null. Intent details:\n%s";
            } else {
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != -1922087384) {
                    if (hashCode != -324068989) {
                        if (hashCode == 1405139896 && action.equals("com.instagram.android.intent.action.LEAVE_VIDEO_CALL")) {
                            c = 1;
                        }
                    } else if (action.equals("com.instagram.android.intent.action.START_VIDEO_CALL_SERVICE")) {
                        c = 0;
                    }
                } else if (action.equals("com.instagram.android.intent.action.CHANGE_VIDEO_CALL_SERVICE_FOREGROUND_STATUS")) {
                    c = 2;
                }
                if (c != 0) {
                    if (c == 1) {
                        AnonymousClass0C1 r2 = this.A00;
                        if (r2 == null) {
                            AnonymousClass0QD.A02("VideoCallService", "Null userSession when attempting to leave call");
                        } else {
                            C16590oq.A00.A05(r2, getApplicationContext());
                        }
                    } else if (c != 2) {
                        objArr = new Object[]{intent.toString()};
                        str = "handleStartIntent -- unrecognized intent action. Intent details:\n%s";
                    } else {
                        Intent intent2 = (Intent) intent.getParcelableExtra("notification_intent");
                        if (intent2 != null) {
                            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(intent.getExtras());
                            if (C23933Ads.A00(A06).booleanValue()) {
                                this.A00 = A06;
                                C16100o2 r1 = C16100o2.A00;
                                boolean z = false;
                                if (r1 != null) {
                                    z = true;
                                }
                                if (z) {
                                    r1.A03(A06);
                                }
                            }
                            Intent intent3 = intent2.setPackage(getPackageName());
                            String A01 = C16830pE.A00().A01();
                            String string = getString(C0003R.string.videocall_ongoing_notification_text);
                            AnonymousClass0XS A002 = AnonymousClass0XU.A00();
                            A002.A04(intent3, getClassLoader());
                            PendingIntent A012 = A002.A01(this, 0, 268435456);
                            AnonymousClass2O4 r5 = new AnonymousClass2O4(this, "ig_other");
                            r5.A09(A01);
                            r5.A0A = A012;
                            r5.A09.icon = C0003R.C0004drawable.video_call;
                            AnonymousClass2O5 r12 = new AnonymousClass2O5();
                            r12.A00 = AnonymousClass2O4.A00(string);
                            r5.A08(r12);
                            r5.A0E = AnonymousClass2O4.A00(string);
                            AnonymousClass2O4.A01(r5, 2, true);
                            AnonymousClass2O4.A01(r5, 16, true);
                            Intent intent4 = new Intent(this, VideoCallService.class);
                            intent4.setAction("com.instagram.android.intent.action.LEAVE_VIDEO_CALL");
                            r5.A0H.add(new AnonymousClass2i3(0, getString(C0003R.string.videocall_leave_action), PendingIntent.getService(this, 101, intent4, 268435456)));
                            r5.A07 = 2;
                            Notification A02 = r5.A02();
                            A02.flags |= 32;
                            if (A02 != null) {
                                startForeground(1910377639, A02);
                            }
                        }
                    }
                    stopForeground(true);
                } else {
                    AnonymousClass0C1 A062 = AnonymousClass0J1.A06(intent.getExtras());
                    this.A00 = A062;
                    C16100o2 r13 = C16100o2.A00;
                    boolean z2 = false;
                    if (r13 != null) {
                        z2 = true;
                    }
                    if (z2) {
                        r13.A03(A062);
                    }
                }
            }
            AnonymousClass0QD.A01("VideoCallService", String.format(str, objArr));
        }
        AnonymousClass0Z0.A0B(-1947503544, A04);
        return 2;
    }
}
