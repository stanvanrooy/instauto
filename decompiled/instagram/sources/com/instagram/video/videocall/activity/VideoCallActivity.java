package com.instagram.video.videocall.activity;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableSet;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import com.instagram.p009ui.widget.coordinatorlayoutbehavior.BottomSheetScaleBehavior;
import com.instagram.video.videocall.view.VideoCallKeyboardHeightChangeDetector;
import com.instagram.video.videocall.view.VideoCallParticipantsLayout;
import java.util.Collections;
import p000X.Ad5;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0PK;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass147;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1GZ;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2M0;
import p000X.AnonymousClass31J;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass70S;
import p000X.AnonymousClass87T;
import p000X.AnonymousClass8QS;
import p000X.AnonymousClass8SD;
import p000X.AnonymousClass8TB;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C11130eT;
import p000X.C13300iJ;
import p000X.C137125t6;
import p000X.C145956Lw;
import p000X.C16560on;
import p000X.C16590oq;
import p000X.C1664378b;
import p000X.C1665378l;
import p000X.C16830pE;
import p000X.C178347jX;
import p000X.C191188Ff;
import p000X.C193358Pf;
import p000X.C193418Ps;
import p000X.C193518Qd;
import p000X.C199308fv;
import p000X.C199328fx;
import p000X.C199518gM;
import p000X.C21860xP;
import p000X.C23300zv;
import p000X.C23859AcX;
import p000X.C23932Adr;
import p000X.C23941Ae0;
import p000X.C23943Ae2;
import p000X.C23945Ae4;
import p000X.C24116AiR;
import p000X.C24119AiU;
import p000X.C24125Aia;
import p000X.C24126Aib;
import p000X.C24129Aie;
import p000X.C24138Aio;
import p000X.C24139Aip;
import p000X.C24140Aiq;
import p000X.C24142Ais;
import p000X.C24143Ait;
import p000X.C24146Aiw;
import p000X.C24150Aj0;
import p000X.C24153Aj3;
import p000X.C24164AjE;
import p000X.C24168AjI;
import p000X.C24172AjM;
import p000X.C24173AjN;
import p000X.C24174AjO;
import p000X.C24175AjP;
import p000X.C24176AjQ;
import p000X.C24180AjV;
import p000X.C24183AjY;
import p000X.C24186Ajb;
import p000X.C24187Ajc;
import p000X.C24188Ajd;
import p000X.C24190Ajf;
import p000X.C24197Ajm;
import p000X.C24199Ajo;
import p000X.C24200Ajp;
import p000X.C24202Ajr;
import p000X.C24203Ajs;
import p000X.C24206Ajv;
import p000X.C24208Ajx;
import p000X.C24209Ajy;
import p000X.C24215Ak4;
import p000X.C24216Ak5;
import p000X.C24219Ak8;
import p000X.C24222AkB;
import p000X.C24223AkC;
import p000X.C24224AkD;
import p000X.C24225AkE;
import p000X.C24229AkI;
import p000X.C24237AkQ;
import p000X.C24244AkX;
import p000X.C24246AkZ;
import p000X.C24248Akb;
import p000X.C24250Akd;
import p000X.C24253Akg;
import p000X.C24258Akl;
import p000X.C24259Akm;
import p000X.C24261Ako;
import p000X.C24262Akp;
import p000X.C24264Akr;
import p000X.C24265Aks;
import p000X.C24267Aku;
import p000X.C24269Akw;
import p000X.C24273Al0;
import p000X.C24280Al7;
import p000X.C24283AlA;
import p000X.C24284AlB;
import p000X.C24286AlD;
import p000X.C24302AlT;
import p000X.C24303AlU;
import p000X.C25276BBr;
import p000X.C26441Dh;
import p000X.C27141Gq;
import p000X.C27511Id;
import p000X.C35251g3;
import p000X.C53642Tq;
import p000X.C54312Wu;
import p000X.C62742oI;
import p000X.C72733Gu;
import p000X.C79603dj;
import p000X.C79963eP;
import p000X.C79983eR;
import p000X.C82053hn;
import p000X.C86623pP;
import p000X.C87023q3;
import p000X.C87043q5;
import p000X.C87213qM;
import p000X.C87233qO;
import p000X.C87243qP;
import p000X.C87253qQ;
import p000X.C87423qi;
import p000X.C87443qk;

public class VideoCallActivity extends IgFragmentActivity implements AnonymousClass0RN, C137125t6 {
    public VideoCallAudience A00;
    public VideoCallSource A01;
    public AnonymousClass0C1 A02;
    public C23945Ae4 A03;
    public C24219Ak8 A04;
    public C24138Aio A05;
    public String A06;
    public boolean A07;
    public VideoCallInfo A08;
    public C24168AjI A09;
    public C54312Wu A0A;
    public C24199Ajo A0B;
    public C24283AlA A0C;
    public C1665378l A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass31J A0G = new C24250Akd(this);
    public final C23941Ae0 A0H = new C23941Ae0(this);

    public static void A04(VideoCallActivity videoCallActivity) {
        videoCallActivity.A0E = false;
        C24219Ak8 ak8 = videoCallActivity.A04;
        C24208Ajx ajx = new C24208Ajx(ak8);
        ak8.A01.A00(ajx);
        C24222AkB akB = ak8.A02;
        akB.A01 = new C24237AkQ(ak8, ajx);
        if (akB.A00 == null) {
            Context context = akB.A02.getContext();
            String A062 = AnonymousClass1BA.A06(context);
            C178347jX r4 = new C178347jX(akB.A02, C0003R.layout.permission_empty_state_view);
            r4.A04.setText(context.getString(C0003R.string.camera_permission_rationale_title, new Object[]{A062}));
            r4.A03.setText(context.getString(C0003R.string.camera_permission_rationale_message, new Object[]{A062}));
            r4.A02.setText(C0003R.string.camera_permission_rationale_link);
            akB.A00 = r4;
            r4.A02.setOnClickListener(new C24188Ajd(akB));
        }
        if (!videoCallActivity.A07) {
            C24138Aio aio = videoCallActivity.A05;
            aio.A04.A09(videoCallActivity.A01);
        }
    }

    public final String getModuleName() {
        return "video_call";
    }

    public static Intent A00(Context context, String str, VideoCallSource videoCallSource, VideoCallAudience videoCallAudience, VideoCallInfo videoCallInfo) {
        Class<VideoCallActivity> cls = VideoCallActivity.class;
        Intent intent = new Intent(context, cls);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", str);
        intent.putExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST", videoCallAudience);
        if (videoCallInfo != null) {
            intent.putExtra("VideoCallActivity.ARGUMENT_CALL_ID", videoCallInfo);
        }
        intent.putExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE", videoCallSource);
        intent.setExtrasClassLoader(cls.getClassLoader());
        intent.addFlags(75563008);
        if (AnonymousClass0PK.A01(context, Activity.class) == null) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static void A01(VideoCallActivity videoCallActivity) {
        VideoCallInfo videoCallInfo;
        if (!videoCallActivity.A0E) {
            videoCallActivity.A0E = true;
            if (videoCallActivity.A0F) {
                C23859AcX acX = videoCallActivity.A0A.A07;
                if (acX == null) {
                    videoCallInfo = null;
                } else {
                    videoCallInfo = acX.A01;
                }
                if (videoCallInfo == null) {
                    C24138Aio.A02(videoCallActivity.A05, Constants.ZERO, false);
                } else {
                    videoCallActivity.A05.A07(videoCallInfo, videoCallActivity.A01, videoCallActivity.A00);
                }
            } else {
                VideoCallInfo videoCallInfo2 = videoCallActivity.A08;
                if (videoCallInfo2 == null) {
                    videoCallActivity.A05.A08(videoCallActivity.A01, videoCallActivity.A00);
                } else if (videoCallActivity.A07) {
                    videoCallActivity.A05.A06(videoCallActivity.A00, videoCallInfo2, videoCallActivity.A09, videoCallActivity.A01, true);
                } else {
                    videoCallActivity.A05.A07(videoCallInfo2, videoCallActivity.A01, videoCallActivity.A00);
                }
            }
        }
        videoCallActivity.A05.Bdu();
    }

    public static void A07(VideoCallActivity videoCallActivity, Integer num) {
        C26441Dh.A00(videoCallActivity.A02).A03(videoCallActivity, C24261Ako.A00(num));
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        if (z) {
            videoCallActivity.finishAndRemoveTask();
        } else {
            videoCallActivity.finish();
        }
        videoCallActivity.overridePendingTransition(0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (p000X.C35251g3.A09(r2.A03.A01.A02, p000X.C24190Ajf.A04) == false) goto L_0x001b;
     */
    public static boolean A08(VideoCallActivity videoCallActivity) {
        boolean z;
        boolean Ap9;
        C24138Aio aio;
        C24199Ajo ajo = videoCallActivity.A05.A0B;
        if (ajo.A02.A04()) {
            z = true;
        }
        z = false;
        if (!z) {
            Ap9 = false;
        } else {
            C24138Aio aio2 = ajo.A01;
            if (aio2 != null) {
                aio2.A04();
            }
            Ap9 = ajo.A04.Ap9();
            if (!Ap9 && (aio = ajo.A01) != null) {
                aio.A03();
            }
        }
        if (Ap9) {
            C26441Dh.A00(videoCallActivity.A02).A03(videoCallActivity, C24261Ako.A00(Constants.A0u));
        }
        return Ap9;
    }

    public final void onBackPressed() {
        if (this.A07) {
            A07(this, Constants.A0N);
        } else if (!this.A05.A05.A09() && !A08(this)) {
            super.onBackPressed();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.BBr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: X.8gM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: X.BBr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: X.78l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: X.BBr} */
    /* JADX WARNING: type inference failed for: r18v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        C87023q3 r2;
        C199308fv r18;
        C25276BBr bBr;
        C24183AjY ajY;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        C24246AkZ ajs;
        C24248Akb akb;
        C24267Aku aku;
        C24225AkE akE;
        int A002 = AnonymousClass0Z0.A00(-1761164523);
        Intent intent = getIntent();
        this.A07 = intent.getBooleanExtra("VideoCallActivity.VIDEO_CALL_ACTIVITY_ARGUMENT_RING", false);
        Window window = getWindow();
        boolean z = this.A07;
        window.addFlags(DexStore.LOAD_RESULT_WITH_VDEX_ODEX);
        if (z) {
            window.addFlags(6291584);
        }
        super.onCreate(bundle);
        setTheme(C0003R.style.VideoCallTheme);
        setContentView((int) C0003R.layout.layout_videocall_capture);
        A06(this);
        setVolumeControlStream(Process.WAIT_RESULT_TIMEOUT);
        this.A0F = intent.getBooleanExtra("VideoCallActivity.ARGUMENT_CALL_RESUME", false);
        this.A08 = (VideoCallInfo) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_CALL_ID");
        this.A00 = (VideoCallAudience) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST");
        this.A06 = intent.getStringExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_ID");
        Bundle extras = getIntent().getExtras();
        AnonymousClass0a4.A06(extras);
        this.A02 = AnonymousClass0J1.A06(extras);
        this.A01 = (VideoCallSource) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE");
        VideoCallKeyboardHeightChangeDetector videoCallKeyboardHeightChangeDetector = new VideoCallKeyboardHeightChangeDetector(this);
        getLifecycle().A06(videoCallKeyboardHeightChangeDetector);
        this.A0A = C54312Wu.A02(this.A02, getApplicationContext());
        boolean booleanExtra = intent.getBooleanExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_CALL_BACK_ACTION", false);
        String str = this.A06;
        if (str != null && booleanExtra) {
            C16590oq.A00.A09(str);
        }
        if (this.A0F) {
            C26441Dh.A00(this.A02).A03(this, "ONGOING_VIDEO_CALL_NOTIFICATION");
        }
        if (this.A07) {
            C54312Wu r22 = this.A0A;
            if (r22.A0A() && !r22.A0B(this.A08.A01)) {
                A07(this, Constants.A0Y);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0003R.C0005id.videocall_root);
        AnonymousClass1E1.A0c(viewGroup, new C1664378b(this));
        Context context = viewGroup.getContext();
        C24175AjP ajP = new C24175AjP(context, new C24216Ak5(context), viewGroup.findViewById(C0003R.C0005id.videocall_participant_cells_container), (ViewGroup) viewGroup.findViewById(C0003R.C0005id.videocall_debug_views_container));
        C23943Ae2 ae2 = new C23943Ae2(this.A0A);
        this.A03 = C23945Ae4.A00(getApplicationContext(), this.A02, C16830pE.A00());
        C24174AjO ajO = null;
        if (!C16830pE.A00().A06()) {
            C199328fx r6 = new C199328fx();
            C199518gM r4 = new C199518gM(this, r6);
            AnonymousClass8TB r23 = (AnonymousClass8TB) r4.A09.AIy(AnonymousClass8TB.class);
            if (r23 != null) {
                r23.A03.A01(r6);
            }
            AnonymousClass8SD r62 = r4.A09;
            r62.A00.A01();
            Class<C193518Qd> cls = C193518Qd.class;
            View ASf = ((C193518Qd) r62.AIy(cls)).ASf();
            if (r4.A04 == null) {
                C24216Ak5 ak5 = new C24216Ak5(r4.A07);
                r4.A04 = ak5;
                ASf.setOnTouchListener(ak5);
                r4.A04.A01 = ajP;
            }
            ASf.setOnTouchListener(r4.A04);
            ((AnonymousClass8QS) r4.A09.AIy(AnonymousClass8QS.class)).A0A = false;
            AnonymousClass8SD r3 = r4.A09;
            r3.A00.A01();
            r2 = null;
            bBr = r4;
            r18 = ((C193518Qd) r3.AIy(cls)).ASf();
        } else {
            C199308fv r24 = new C199308fv(this);
            r2 = new C87023q3(this, this.A02, "instagram_vc");
            C191188Ff A012 = C62742oI.A01(this, this.A02, "instagram_vc");
            AnonymousClass0C1 r5 = this.A02;
            C199308fv r25 = r24;
            C199308fv r242 = r24;
            C87023q3 r26 = r2;
            r18 = r24;
            bBr = new C25276BBr(this, r5, r242, r25, r26, A012, ((Integer) AnonymousClass0L6.A02(r5, AnonymousClass0L7.VC_CAPTURE, "max_camera_width", 1080, (AnonymousClass04H) null)).intValue(), this.A0A.A0A);
        }
        C23932Adr adr = new C23932Adr(this.A02, this.A0A, bBr, this.A03, ae2, this.A0H);
        if (!this.A03.A02()) {
            ajY = new C24206Ajv();
        } else {
            AnonymousClass0a4.A06(r2);
            C24197Ajm ajm = new C24197Ajm(C23300zv.A00(this.A02), r2, this.A03, adr);
            AnonymousClass0C1 r12 = this.A02;
            AnonymousClass1AM A052 = A05();
            C23945Ae4 ae4 = this.A03;
            View findViewById = viewGroup.findViewById(C0003R.C0005id.videocall_face_effects_tray_container);
            C87443qk r52 = new C87443qk((ViewStub) viewGroup.findViewById(C0003R.C0005id.ar_effect_loading_indicator_stub));
            C79983eR r252 = new C79983eR(r12, viewGroup, r2, (C87423qi) null, (C79963eP) null);
            C87233qO r42 = new C87233qO(C87243qP.CAPTURE);
            C87213qM r10 = C87213qM.LIVE;
            ajY = new C24183AjY(r42, new C82053hn(r42, new C87253qQ(RegularImmutableSet.A03, ImmutableList.A01(), r10, ImmutableList.A03(r10)), viewGroup, r2, C193358Pf.A00, C86623pP.VIDEO_CALL, "video_call", r52, (C79963eP) null, r12, A052, (C79603dj) null, (C87043q5) null, true, (Activity) null, (AnonymousClass2M0) null, false, Collections.emptyList(), (String) null), r252, ajm, ae4, findViewById);
        }
        C24174AjO A022 = C21860xP.A00.A02(viewGroup, this.A02, new C24129Aie(this, adr));
        ViewGroup viewGroup2 = viewGroup;
        C24273Al0 A013 = C16560on.A00.A01(getApplicationContext(), viewGroup2, (ViewStub) viewGroup.findViewById(C0003R.C0005id.videocall_cowatch_content_stub), this.A02, this, AnonymousClass1L8.A00(this), this.A0A.A0I, false);
        boolean A032 = this.A03.A03();
        AnonymousClass0C1 r53 = this.A03.A01;
        AnonymousClass0L7 r43 = AnonymousClass0L7.VC_CALL_CONTROLS_REDESIGN_LAUNCHER;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r53, r43, "show_top_button_label", false, (AnonymousClass04H) null)).booleanValue();
        boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(this.A03.A01, r43, "show_top_controls_background_gradient", false, (AnonymousClass04H) null)).booleanValue();
        Context context2 = viewGroup.getContext();
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(C0003R.C0005id.layout_videocall_controls_stub);
        if (A032) {
            viewStub.setLayoutResource(C0003R.layout.layout_videocall_controls_redesign);
            view = viewGroup.findViewById(C0003R.C0005id.ar_effect_capture_button);
        } else {
            viewStub.setLayoutResource(C0003R.layout.layout_videocall_controls);
            view = null;
        }
        viewStub.inflate();
        Resources resources = context2.getResources();
        View findViewById2 = viewGroup.findViewById(C0003R.C0005id.controls_tray);
        View findViewById3 = viewGroup.findViewById(C0003R.C0005id.top_controls_tray);
        View findViewById4 = viewGroup.findViewById(C0003R.C0005id.close_button);
        View findViewById5 = viewGroup.findViewById(C0003R.C0005id.minimize_button);
        View findViewById6 = viewGroup.findViewById(C0003R.C0005id.bottom_controls_tray);
        ImageView imageView = (ImageView) viewGroup.findViewById(C0003R.C0005id.camera_button);
        View findViewById7 = viewGroup.findViewById(C0003R.C0005id.face_filters_button);
        View findViewById8 = findViewById7.findViewById(C0003R.C0005id.camera_ar_effect_button);
        View findViewById9 = viewGroup.findViewById(C0003R.C0005id.camera_switch_button);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(C0003R.C0005id.audio_button);
        View findViewById10 = viewGroup.findViewById(C0003R.C0005id.cowatch_button);
        View findViewById11 = viewGroup.findViewById(C0003R.C0005id.capture_button);
        View findViewById12 = viewGroup.findViewById(C0003R.C0005id.add_users_button);
        Drawable A033 = C019000b.A03(context2, C0003R.C0004drawable.instagram_microphone_outline_44);
        Drawable A034 = C019000b.A03(context2, C0003R.C0004drawable.instagram_video_chat_outline_44);
        Drawable A035 = C019000b.A03(context2, C0003R.C0004drawable.instagram_microphone_off_outline_44);
        Drawable A036 = C019000b.A03(context2, C0003R.C0004drawable.instagram_video_chat_off_outline_44);
        C24280Al7 al7 = new C24280Al7();
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        if (!A032 || !booleanValue) {
            view2 = null;
            view3 = null;
            view4 = null;
            view5 = null;
        } else {
            view2 = viewGroup.findViewById(C0003R.C0005id.face_filters_button_label);
            view3 = viewGroup.findViewById(C0003R.C0005id.cowatch_button_label);
            view4 = viewGroup.findViewById(C0003R.C0005id.add_users_button_label);
            view5 = viewGroup.findViewById(C0003R.C0005id.minimize_button_label);
        }
        if (booleanValue2) {
            findViewById3.setBackground(context2.getResources().getDrawable(C0003R.C0004drawable.videocall_top_controls_gradient));
        }
        C24176AjQ ajQ = new C24176AjQ(resources, viewGroup2, findViewById2, findViewById3, findViewById4, findViewById5, findViewById6, imageView, imageView2, findViewById9, findViewById7, findViewById8, findViewById10, findViewById12, findViewById11, al7, accelerateDecelerateInterpolator, A033, A035, A034, A036, view, view2, view3, view4, view5, A032);
        C23945Ae4 ae42 = this.A03;
        boolean A042 = ajY.A04();
        C16830pE A003 = C16830pE.A00();
        boolean z2 = false;
        boolean z3 = false;
        if (A042) {
            z3 = true;
            z2 = true;
        }
        C24173AjN ajN = new C24173AjN(ajQ, adr, ae42, new Ad5(true, true, false, false, true, true, z3, true, false, false, false, true, z2), A013, new Handler(Looper.getMainLooper()), A003);
        C24229AkI akI = new C24229AkI(this.A02, ajN);
        C24187Ajc ajc = new C24187Ajc(viewGroup, (TextView) viewGroup.findViewById(C0003R.C0005id.videocall_participant_status_message), new C24280Al7());
        boolean booleanValue3 = ((Boolean) AnonymousClass0L6.A02(this.A03.A01, AnonymousClass0L7.VC_PIP_LAYOUT_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        int i = 0;
        VideoCallParticipantsLayout videoCallParticipantsLayout = (VideoCallParticipantsLayout) viewGroup.findViewById(C0003R.C0005id.videocall_participant_cells_container);
        if (booleanValue3) {
            ajs = new C24202Ajr();
        } else {
            ajs = new C24203Ajs();
        }
        boolean z4 = false;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.videocall_participant_streams_corner_radius_large);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0003R.dimen.videocall_participant_streams_corner_radius_small);
        if (booleanValue3) {
            z4 = true;
            i = dimensionPixelSize;
        }
        C24186Ajb ajb = r21;
        C24186Ajb ajb2 = new C24186Ajb(ajs, "1:1.5", BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0, 0.25f, 0.35f, 0.2f, 0.9f, true, 0, 0, 0, z4, i);
        C24180AjV ajV = new C24180AjV(videoCallParticipantsLayout, new C24284AlB(videoCallParticipantsLayout, new C24262Akp(), ajb, new Handler(Looper.getMainLooper())), new C24253Akg(), context.getResources().getDimensionPixelSize(C0003R.dimen.videocall_participant_streams_compact_layout_horizontal_margin), context.getResources().getDimensionPixelSize(C0003R.dimen.videocall_participant_streams_divider_width), ajs, dimensionPixelSize, dimensionPixelSize2);
        C24302AlT alT = new C24302AlT(viewGroup, new C24303AlU(viewGroup), C72733Gu.A00(viewGroup, C0003R.C0005id.videocall_minimized_calling_stub));
        C13300iJ r63 = this.A02.A06;
        VideoCallAudience videoCallAudience = this.A00;
        C24223AkC akC = new C24223AkC(this);
        C54312Wu r27 = this.A0A;
        VideoCallAudience videoCallAudience2 = videoCallAudience;
        C199308fv r243 = r18;
        C24223AkC akC2 = akC;
        C24172AjM ajM = new C24172AjM(r63, videoCallAudience2, r243, akC2, A022, A013, ajc, ajV, alT, r27.A0X, r27.A0W, r27.A0a, adr, akI);
        this.A09 = new C24168AjI(this);
        C24164AjE ajE = new C24164AjE(this);
        Context context3 = context;
        ViewGroup viewGroup3 = viewGroup;
        C24119AiU aiU = new C24119AiU(context3, viewGroup3, C72733Gu.A00(viewGroup, C0003R.C0005id.videocall_minimized_end_stub), C72733Gu.A00(viewGroup, C0003R.C0005id.videocall_end_stub), new C24280Al7(), new C24216Ak5(context), new C24125Aia(), r63);
        C24168AjI ajI = this.A09;
        C24116AiR aiR = new C24116AiR(videoCallAudience, aiU, ae2, adr, ajI, new C24126Aib(ajI), new Handler(Looper.getMainLooper()));
        C23945Ae4 ae43 = this.A03;
        C24143Ait ait = new C24143Ait(C11130eT.A01, new C24142Ais(), new Handler(Looper.getMainLooper()));
        C24215Ak4 ak4 = new C24215Ak4(C72733Gu.A00(viewGroup, C0003R.C0005id.videocall_incoming_call_ringer_stub), new C24216Ak5(context), new Scroller(context), context.getResources().getDimensionPixelSize(C0003R.dimen.videocall_incoming_ring_button_translation));
        Resources resources2 = context.getResources();
        C24139Aip aip = new C24139Aip(ait, ae43, ak4, resources2.getDimensionPixelSize(C0003R.dimen.videocall_incoming_ring_swipe_up_distance), resources2.getDimensionPixelSize(C0003R.dimen.videocall_incoming_ring_swipe_down_distance));
        C24146Aiw aiw = new C24146Aiw(new C24153Aj3(this), adr, ajE, this.A02, this);
        C24190Ajf ajf = new C24190Ajf(this);
        this.A04 = new C24219Ak8(ajf, new C24222AkB(viewGroup), new C24259Akm(this));
        C24258Akl akl = new C24258Akl(this);
        if (this.A03.A01()) {
            akb = new C24248Akb(A013.A02);
        } else {
            akb = null;
        }
        if (this.A03.A02.A04()) {
            ajO = A022;
        }
        if (akb == null && ajO == null) {
            aku = new C24224AkD();
        } else {
            C27511Id r102 = videoCallKeyboardHeightChangeDetector.A02;
            View findViewById13 = viewGroup.findViewById(C0003R.C0005id.videocall_participant_cells_container);
            int dimensionPixelSize3 = findViewById13.getContext().getResources().getDimensionPixelSize(C0003R.dimen.videocall_top_controls_tray_height);
            float A082 = (float) C06220Of.A08(context);
            float f = 0.7f * A082;
            View findViewById14 = viewGroup.findViewById(C0003R.C0005id.videocall_bottom_sheet);
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(C0003R.dimen.videocall_bottom_sheet_peek_height);
            aku = new C24267Aku(new C24269Akw(ajO, akb, BottomSheetBehavior.A01(findViewById14), BottomSheetScaleBehavior.A00(findViewById13), r102, findViewById14, (ViewGroup) viewGroup.findViewById(C0003R.C0005id.bottom_sheet_contents), dimensionPixelSize3, (int) (A082 - f), dimensionPixelSize4, ((int) f) + dimensionPixelSize4), adr);
        }
        AnonymousClass87T r64 = new AnonymousClass87T(viewGroup);
        this.A0C = new C24283AlA(new C24286AlD(viewGroup, (ViewStub) viewGroup.findViewById(C0003R.C0005id.videocall_screen_capture_stub)), new C24244AkX(this, ajf, this.A02, this.A0A), adr, new C24264Akr(this));
        C24200Ajp ajp = new C24200Ajp(new C24265Aks(getApplicationContext()), new C24209Ajy(this.A02), adr);
        C24140Aiq aiq = new C24140Aiq(new C24150Aj0(this, (KeyguardManager) getSystemService("keyguard")));
        if (this.A03.A04()) {
            C1665378l A004 = C1665378l.A00(this);
            this.A0D = A004;
            akE = A004;
        } else {
            akE = C24225AkE.A00;
        }
        this.A0B = new C24199Ajo(akE, this.A03, this.A04);
        this.A05 = new C24138Aio(this, C16830pE.A00(), adr, ajP, this.A03, ajN, ajM, aiR, aip, aiw, aku, r64, aiq, ajY, new C145956Lw(this, this, this.A02), A013, this.A0B, akl, this.A0C, ajp);
        AnonymousClass147.A00(this.A02).A01(this.A0G);
        AnonymousClass0Z0.A07(-702842647, A002);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        VideoCallInfo videoCallInfo = (VideoCallInfo) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_CALL_ID");
        boolean booleanExtra = intent.getBooleanExtra("VideoCallActivity.VIDEO_CALL_ACTIVITY_ARGUMENT_RING", false);
        boolean booleanExtra2 = intent.getBooleanExtra("VideoCallActivity.ARGUMENT_CALL_RESUME", false);
        boolean booleanExtra3 = intent.getBooleanExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_CALL_BACK_ACTION", false);
        String stringExtra = intent.getStringExtra("IgSessionManager.SESSION_TOKEN_KEY");
        if (!booleanExtra && !this.A07) {
            if (booleanExtra3) {
                Toast.makeText(this, C0003R.string.videocall_create_call_during_call_toast, 1).show();
            } else if (booleanExtra2) {
            } else {
                if (videoCallInfo != null && this.A0A.A0B(videoCallInfo.A01)) {
                    return;
                }
                if (videoCallInfo == null) {
                    AnonymousClass0DB.A0J("VideoCallActivity", "onNewIntent: video call info doesn't exist. Intent=%s", intent);
                    AnonymousClass0QD.A02("VideoCallActivity_onNewIntent", AnonymousClass000.A0E("New intent received but no valid action performed: Intent=", intent.toString()));
                } else if (!this.A02.A04().equals(stringExtra)) {
                    C53642Tq.A00(this, C0003R.string.videocall_cannot_switch_acount_toast, 1).show();
                } else {
                    this.A08 = videoCallInfo;
                    this.A01 = (VideoCallSource) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_VIDEO_CALL_SOURCE");
                    this.A00 = (VideoCallAudience) intent.getParcelableExtra("VideoCallActivity.ARGUMENT_PARTICIPANTS_PROFILE_PIC_URL_LIST");
                    if (C35251g3.A09(this.A04.A01.A02, C24190Ajf.A04)) {
                        this.A05.A07(videoCallInfo, this.A01, this.A00);
                    }
                }
            }
        }
    }

    public final void onUserLeaveHint() {
        if (this.A07) {
            A07(this, Constants.A0N);
        } else {
            A08(this);
        }
    }

    public static void A06(VideoCallActivity videoCallActivity) {
        Window window = videoCallActivity.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.getDecorView().setSystemUiVisibility(1792);
            boolean z = videoCallActivity.A07;
            int i = C0003R.color.black_50_transparent;
            if (z) {
                i = C0003R.color.transparent;
            }
            C27141Gq.A01(videoCallActivity, C019000b.A00(videoCallActivity, i));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 2;
        }
    }

    public final C06590Pq A0L() {
        return this.A02;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            this.A0C.A05.A0G.A06().An5(intent.getStringArrayListExtra(C193418Ps.$const$string(12)), intent.getBooleanExtra(C193418Ps.$const$string(11), false), intent.getStringExtra(C193418Ps.$const$string(10)));
        }
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(1244208617);
        super.onDestroy();
        this.A05.destroy();
        AnonymousClass147 A003 = AnonymousClass147.A00(this.A02);
        A003.A00.remove(this.A0G);
        AnonymousClass0Z0.A07(1571628949, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(456157920);
        super.onPause();
        AnonymousClass0Z0.A07(14009935, A002);
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C1665378l r0;
        isFinishing();
        super.onPictureInPictureModeChanged(z, configuration);
        if (!isFinishing() && (r0 = this.A0D) != null) {
            r0.A01(z);
        }
    }

    public final void onResume() {
        C24138Aio aio;
        int A002 = AnonymousClass0Z0.A00(2024480989);
        super.onResume();
        AnonymousClass0QD.A00().BcK(getClass().getName());
        this.A05.A05();
        C24199Ajo ajo = this.A0B;
        if (((Boolean) AnonymousClass0L6.A02(ajo.A02.A01, AnonymousClass0L7.VC_SHOW_CONTROLS_ON_JOIN_CALL, "is_enabled", true, (AnonymousClass04H) null)).booleanValue() && (aio = ajo.A00.A00.A01) != null) {
            aio.A03();
        }
        AnonymousClass0Z0.A07(-1364121164, A002);
    }

    public final void onStart() {
        int A002 = AnonymousClass0Z0.A00(-1893618815);
        super.onStart();
        C26441Dh.A00(this.A02).A06(this);
        if (Build.VERSION.SDK_INT == 21) {
            AnonymousClass1X4.A04(getWindow(), findViewById(C0003R.C0005id.videocall_root), false);
        }
        if (C35251g3.A09(this.A04.A01.A02, C24190Ajf.A04)) {
            A01(this);
        } else if (this.A07) {
            this.A05.A06(this.A00, this.A08, this.A09, this.A01, false);
        } else {
            A04(this);
        }
        Integer num = Constants.A15;
        String $const$string = AnonymousClass40t.$const$string(248);
        if (AnonymousClass1GZ.A01) {
            new AnonymousClass1GZ($const$string).A00(num);
        }
        AnonymousClass0Z0.A07(550728183, A002);
    }

    public final void onStop() {
        boolean z;
        int A002 = AnonymousClass0Z0.A00(-1600639669);
        super.onStop();
        this.A05.pause();
        if (AnonymousClass70S.A00().booleanValue()) {
            if (this.A03.A04()) {
                z = isInPictureInPictureMode();
            } else {
                z = false;
            }
            if (z) {
                A07(this, Constants.A0j);
            }
        }
        AnonymousClass0Z0.A07(-199135278, A002);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A06(this);
        }
    }
}
