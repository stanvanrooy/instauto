package com.instagram.rtc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.C06590Pq;
import p000X.C13150hy;
import p000X.C178347jX;
import p000X.C18750sM;
import p000X.C24318Alj;
import p000X.C24377Amg;
import p000X.C24385Amo;
import p000X.C24387Amq;
import p000X.C24388Ams;
import p000X.C24389Amt;
import p000X.C24391Amv;
import p000X.C24393Amx;
import p000X.C24396An0;
import p000X.C24511Aou;
import p000X.C24513Aow;
import p000X.C24517Ap0;
import p000X.C26441Dh;
import p000X.C29041Oj;
import p000X.C35251g3;

public final class RtcCallIntentHandlerActivity extends IgFragmentActivity implements AnonymousClass0RN {
    public static final C24388Ams A03 = new C24388Ams();
    public C24393Amx A00;
    public C24385Amo A01;
    public final C18750sM A02 = C29041Oj.A00(new C24389Amt(this));

    public final String getModuleName() {
        return "rtc_call_launcher";
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f1  */
    private final void A00(Intent intent) {
        String str;
        C24393Amx ap0;
        C24385Amo amo;
        Activity activity;
        String[] strArr;
        C24393Amx amx = this.A00;
        if (amx == null || !amx.isRunning()) {
            Intent intent2 = intent;
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                C13150hy.A00();
            }
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(extras);
            String action = intent2.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1822613086) {
                    if (hashCode != 1764638109) {
                        if (hashCode == 1894398468 && action.equals("rtc_call_activity_intent_action_incoming_call")) {
                            String stringExtra = intent2.getStringExtra("rtc_call_activity_arguments_key_call_id");
                            if (stringExtra == null) {
                                C13150hy.A00();
                            }
                            C13150hy.A01(A06, "userSession");
                            ap0 = new C24513Aow(this, A06, stringExtra, this);
                            this.A00 = ap0;
                            amo = this.A01;
                            if (amo == null) {
                                C13150hy.A03("permissionsPresenter");
                            }
                            activity = amo.A03.A01;
                            strArr = C24318Alj.A00;
                            if (C35251g3.A09(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                                C24385Amo amo2 = this.A01;
                                if (amo2 == null) {
                                    C13150hy.A03("permissionsPresenter");
                                }
                                C24387Amq amq = new C24387Amq(amo2);
                                amo2.A03.A00(amq);
                                if (amo2.A00 == null) {
                                    Context context = amo2.A02.getContext();
                                    String A062 = AnonymousClass1BA.A06(context);
                                    C178347jX r4 = new C178347jX(amo2.A02, C0003R.layout.permission_empty_state_view);
                                    r4.A04.setText(context.getString(C0003R.string.camera_permission_rationale_title, new Object[]{A062}));
                                    r4.A03.setText(context.getString(C0003R.string.camera_permission_rationale_message, new Object[]{A062}));
                                    r4.A02.setText(C0003R.string.camera_permission_rationale_link);
                                    r4.A02.setOnClickListener(new C24377Amg(amo2, amq));
                                    amo2.A00 = r4;
                                    return;
                                }
                                return;
                            }
                            ap0.start();
                            return;
                        }
                    } else if (action.equals("rtc_call_activity_intent_action_resume_call")) {
                        String stringExtra2 = intent2.getStringExtra("rtc_call_activity_arguments_key_navigation_trigger");
                        if (stringExtra2 == null) {
                            C13150hy.A00();
                        }
                        C13150hy.A01(A06, "userSession");
                        ap0 = new C24511Aou(this, A06, stringExtra2, this);
                        this.A00 = ap0;
                        amo = this.A01;
                        if (amo == null) {
                        }
                        activity = amo.A03.A01;
                        strArr = C24318Alj.A00;
                        if (C35251g3.A09(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                        }
                    }
                } else if (action.equals("rtc_call_activity_intent_action_accept_call")) {
                    String stringExtra3 = intent2.getStringExtra("rtc_call_activity_arguments_key_call_id");
                    if (stringExtra3 == null) {
                        C13150hy.A00();
                    }
                    C13150hy.A01(A06, "userSession");
                    C13150hy.A02(this, "context");
                    C13150hy.A02(A06, "userSession");
                    C13150hy.A02(stringExtra3, "callId");
                    C13150hy.A02(this, "analyticsModule");
                    ap0 = new C24517Ap0(this, A06, this, C24396An0.A00(Constants.A0Y), false, stringExtra3, (String) null, (List) null, (String) null, (String) null, 976);
                    this.A00 = ap0;
                    amo = this.A01;
                    if (amo == null) {
                    }
                    activity = amo.A03.A01;
                    strArr = C24318Alj.A00;
                    if (C35251g3.A09(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    }
                }
            }
            VideoCallInfo videoCallInfo = (VideoCallInfo) intent2.getParcelableExtra("rtc_call_activity_arguments_key_call_info");
            Parcelable parcelableExtra = intent2.getParcelableExtra("rtc_call_activity_arguments_key_vc_source");
            if (parcelableExtra == null) {
                C13150hy.A00();
            }
            VideoCallSource videoCallSource = (VideoCallSource) parcelableExtra;
            if (videoCallInfo != null) {
                str = videoCallInfo.A01;
            } else {
                str = null;
            }
            if (str == null) {
                Parcelable parcelableExtra2 = intent2.getParcelableExtra("rtc_call_activity_arguments_key_vc_audience");
                if (parcelableExtra2 == null) {
                    C13150hy.A00();
                }
                VideoCallAudience videoCallAudience = (VideoCallAudience) parcelableExtra2;
                C13150hy.A01(A06, "userSession");
                boolean z = videoCallAudience.A07;
                List unmodifiableList = Collections.unmodifiableList(videoCallAudience.A05);
                C13150hy.A01(unmodifiableList, "audience.callParticipantIds");
                C13150hy.A02(this, "context");
                C13150hy.A02(A06, "userSession");
                C13150hy.A02(unmodifiableList, "callTargetIds");
                C13150hy.A02(videoCallSource, "source");
                C13150hy.A02(this, "analyticsModule");
                VideoCallSource.SurfaceKey surfaceKey = videoCallSource.A02;
                C13150hy.A01(surfaceKey, "source.surfaceKey");
                String id = surfaceKey.getId();
                String str2 = videoCallSource.A00.A00;
                C13150hy.A01(str2, "sourceName");
                ap0 = new C24517Ap0(this, A06, this, str2, z, (String) null, (String) null, unmodifiableList, (String) null, id, 352);
            } else {
                String stringExtra4 = intent2.getStringExtra("rtc_call_activity_arguments_key_notification_id");
                C13150hy.A01(A06, "userSession");
                String str3 = videoCallInfo.A01;
                C13150hy.A01(str3, "callInfo.videoCallId");
                String str4 = videoCallInfo.A00;
                C13150hy.A01(str4, "callInfo.serverInfo");
                C13150hy.A02(this, "context");
                C13150hy.A02(A06, "userSession");
                C13150hy.A02(str3, "callId");
                C13150hy.A02(str4, "serverInfo");
                C13150hy.A02(videoCallSource, "source");
                C13150hy.A02(this, "analyticsModule");
                VideoCallSource.SurfaceKey surfaceKey2 = videoCallSource.A02;
                C13150hy.A01(surfaceKey2, "source.surfaceKey");
                String id2 = surfaceKey2.getId();
                String str5 = videoCallSource.A00.A00;
                C13150hy.A01(str5, "sourceName");
                ap0 = new C24517Ap0(this, A06, this, str5, false, str3, str4, (List) null, stringExtra4, id2, 144);
            }
            this.A00 = ap0;
            amo = this.A01;
            if (amo == null) {
            }
            activity = amo.A03.A01;
            strArr = C24318Alj.A00;
            if (C35251g3.A09(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            }
        }
    }

    public final C06590Pq A0L() {
        return (AnonymousClass0C1) this.A02.getValue();
    }

    public final void onNewIntent(Intent intent) {
        C13150hy.A02(intent, "intent");
        super.onNewIntent(intent);
        A00(intent);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1035399313);
        super.onCreate(bundle);
        Window window = getWindow();
        C13150hy.A01(window, "window");
        View findViewById = window.getDecorView().findViewById(16908290);
        C13150hy.A01(findViewById, "window.decorView.findVie…yId(android.R.id.content)");
        this.A01 = new C24385Amo(this, (ViewGroup) findViewById, new C24391Amv(this));
        Intent intent = getIntent();
        C13150hy.A01(intent, "intent");
        A00(intent);
        AnonymousClass0Z0.A07(1935861560, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-643572130);
        super.onDestroy();
        C24393Amx amx = this.A00;
        if (amx != null) {
            amx.cancel();
        }
        this.A00 = null;
        AnonymousClass0Z0.A07(-224810952, A002);
    }

    public final void onStart() {
        int A002 = AnonymousClass0Z0.A00(797759280);
        super.onStart();
        Intent intent = getIntent();
        C13150hy.A01(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C13150hy.A00();
        }
        C26441Dh.A00(AnonymousClass0J1.A06(extras)).A06(this);
        AnonymousClass0Z0.A07(351316025, A002);
    }
}
