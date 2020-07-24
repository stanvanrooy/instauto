package p000X;

import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import android.util.Pair;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.share.handler.DirectExternalPhotoShareActivity;
import com.instagram.direct.share.handler.DirectShareHandlerActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0sm  reason: invalid class name and case insensitive filesystem */
public final class C19010sm extends C19020sn {
    public final C19040sp A00;
    public final C19030so A01;

    public final List A06(AnonymousClass0C1 r4) {
        return Arrays.asList(new C06570Po[]{(AnonymousClass13W) r4.AVA(AnonymousClass13W.class, new AnonymousClass13X(r4)), (C240413b) r4.AVA(C240413b.class, new C240513c()), (C240613d) r4.AVA(C240613d.class, new C240713e()), C240813f.A00(r4)});
    }

    public final C19040sp A02() {
        return this.A00;
    }

    public final C19030so A04() {
        return this.A01;
    }

    public final C97684Ka A05(Context context, AnonymousClass0C1 r3, C27061Gi r4) {
        return new C97684Ka(context, r3, r4);
    }

    public final void A09(AnonymousClass0C1 r7, Context context, AnonymousClass1L8 r9, boolean z, C111104qO r11) {
        C28351Lj.A00(context, r9, new C111084qM(this, r7, context, z, r11));
    }

    public final void A0G(AnonymousClass0C1 r5, String str) {
        C17390qA.A00(r5).A0E(new C21260wR(AnonymousClass3JW.A00(r5, C21260wR.class, (String) null), new DirectThreadKey(str)));
    }

    public final void A0H(AnonymousClass0C1 r4, String str, AnonymousClass6GB r6) {
        r6.A00.A08.show();
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.ONE;
        r2.A0E("direct_v2/whitelist/%s/", str);
        r2.A06(AnonymousClass1N4.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new C144366Fj(r4, str, r6);
        C12810hQ.A02(A03);
    }

    public final void A0I(AnonymousClass0C1 r3, String str, AnonymousClass5BK r5) {
        C95614Bx.A00(r3, str, false, new AnonymousClass5BH(this, r5));
    }

    public final void A0L(AnonymousClass0C1 r6, List list, List list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list2);
        if (!linkedHashSet.isEmpty() || linkedHashSet2.size() >= 2) {
            try {
                AnonymousClass4US r4 = new AnonymousClass4US(AnonymousClass4US.A00(linkedHashSet, linkedHashSet2));
                StringWriter stringWriter = new StringWriter();
                C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                A05.A0T();
                if (r4.A00 != null) {
                    A05.A0d("direct_share_targets");
                    A05.A0S();
                    for (DirectShareTarget directShareTarget : r4.A00) {
                        if (directShareTarget != null) {
                            AnonymousClass4UI.A00(A05, directShareTarget);
                        }
                    }
                    A05.A0P();
                }
                if (r4.A01 != null) {
                    A05.A0d("targets");
                    A05.A0S();
                    for (DirectVisualMessageTarget directVisualMessageTarget : r4.A01) {
                        if (directVisualMessageTarget != null) {
                            AnonymousClass4UK.A00(A05, directVisualMessageTarget);
                        }
                    }
                    A05.A0P();
                }
                A05.A0Q();
                A05.close();
                C16180oA.A00(r6).A00.edit().putString("direct_blast_list_candidates", stringWriter.toString()).apply();
            } catch (IOException e) {
                AnonymousClass0QD.A0A("BlastListCandidatesManager_error_serializing_last_send", e);
            }
        }
    }

    public final void A0M(AnonymousClass0C1 r3, boolean z) {
        if (z) {
            C23300zv.A00(r3).BXT(new C691631f());
        }
    }

    public final Pair A00(AnonymousClass0C1 r12, PendingMedia pendingMedia, DirectShareTarget directShareTarget) {
        C104594fU A002 = C104594fU.A00(r12);
        C65882uZ A003 = C19290tE.A00(A002.A01);
        DirectThreadKey AOO = A003.ARF(directShareTarget).AOO();
        Long AOW = A003.AOW(AOO);
        PendingMediaStore A012 = PendingMediaStore.A01(A002.A01);
        PendingMedia pendingMedia2 = pendingMedia;
        if (!A012.A02.containsKey(pendingMedia.A1h)) {
            AnonymousClass0QD.A04("SendDirectMessageManager_pending_media_not_found", AnonymousClass000.A0E("Missing PendingMedia for key: ", pendingMedia.A1h), 1);
        }
        long j = C104594fU.A05;
        C17870qw.A03(pendingMedia);
        pendingMedia.A0b = j;
        C20520vF r4 = new C20520vF(AnonymousClass3JW.A00(A002.A01, C20520vF.class, (String) null), AOO, pendingMedia2, C06180Ob.A00(), AOW);
        C17390qA.A00(A002.A01).A0E(r4);
        return new Pair(r4.A05(), Boolean.valueOf(r4.A02.A03));
    }

    public final Pair A01(AnonymousClass0C1 r3, PendingMedia pendingMedia, DirectShareTarget directShareTarget, C107694kY r6) {
        return C104594fU.A00(r3).A05(pendingMedia, Collections.singletonList(directShareTarget), r6);
    }

    public final C107614kQ A03(AnonymousClass0C1 r4, DirectShareTarget directShareTarget, String str) {
        return new C107614kQ(AnonymousClass3JW.A01(r4, C20440v6.class, C19290tE.A00(r4).ARF(directShareTarget).Afp(), str));
    }

    public final void A07(AnonymousClass0C1 r2) {
        AnonymousClass142.A00(r2).A01();
    }

    public final void A08(AnonymousClass0C1 r4) {
        AnonymousClass142 A002 = AnonymousClass142.A00(r4);
        if (!A002.A00) {
            Looper.myQueue().addIdleHandler(new C64352rL(A002));
        }
    }

    public final void A0A(AnonymousClass0C1 r13, C107614kQ r14, C98724Oo r15, DirectShareTarget directShareTarget, C160436su r17, C185767we r18, C107694kY r19) {
        C104594fU A002 = C104594fU.A00(r13);
        AnonymousClass3LQ r3 = r14.A00;
        DirectThreadKey AOO = C19290tE.A00(A002.A01).ARF(directShareTarget).AOO();
        C98724Oo r5 = r15;
        C160436su r6 = r17;
        C107694kY r8 = r19;
        C185767we r7 = r18;
        C17390qA.A00(A002.A01).A0E(new C20440v6(r3, AOO, r5, r6, r7, r8, C06180Ob.A00(), C19290tE.A00(A002.A01).AOW(AOO)));
    }

    public final void A0B(AnonymousClass0C1 r11, AnonymousClass1NJ r12, DirectShareTarget directShareTarget) {
        AnonymousClass4SE A002 = AnonymousClass4SE.A00(r11);
        AnonymousClass4SE.A01(A002, directShareTarget, (String) null, new AnonymousClass4SS(A002, r12, Long.valueOf(C06180Ob.A00()), (String) null, (DirectForwardingParams) null));
    }

    public final void A0C(AnonymousClass0C1 r23, AnonymousClass6EE r24) {
        AnonymousClass4SE A002 = AnonymousClass4SE.A00(r23);
        AnonymousClass6EE r4 = r24;
        C66112uw ARF = A002.A01.ARF(r4.A01);
        DirectThreadKey AOO = ARF.AOO();
        Long AOW = A002.A01.AOW(AOO);
        AnonymousClass3LQ A012 = AnonymousClass3JW.A01(A002.A02, C19730tx.class, ARF.Afp(), (String) null);
        String str = r4.A08;
        String str2 = r4.A07;
        AnonymousClass1NJ r11 = r4.A00;
        String str3 = r4.A09;
        String str4 = r4.A06;
        String str5 = r4.A03;
        boolean z = r4.A0A;
        String str6 = r4.A05;
        String str7 = r4.A04;
        String str8 = str6;
        C19730tx r6 = new C19730tx(A012, AOO, str, str2, r11, str3, str4, str5, z, str8, str7, r4.A02, AOW, C06180Ob.A00());
        ((C17390qA) A002.A03.get()).A0E(r6);
        AnonymousClass3LX.A0Q(A002.A02, AOO, r6.A03(), r6.A05(), r6.A02.A03);
    }

    public final void A0D(AnonymousClass0C1 r17, DirectShareTarget directShareTarget, String str, C38031kc r20, int i, String str2, String str3) {
        AnonymousClass4SE A002 = AnonymousClass4SE.A00(r17);
        C66112uw ARF = A002.A01.ARF(directShareTarget);
        DirectThreadKey AOO = ARF.AOO();
        String str4 = str;
        C38031kc r9 = r20;
        int i2 = i;
        String str5 = str3;
        String str6 = str2;
        C19770u1 r5 = new C19770u1(AnonymousClass3JW.A01(A002.A02, C19770u1.class, ARF.Afp(), (String) null), AOO, str4, r9, i2, str6, str5, A002.A01.AOW(AOO), C06180Ob.A00());
        ((C17390qA) A002.A03.get()).A0E(r5);
        AnonymousClass3LX.A0Q(A002.A02, AOO, r5.A03(), r5.A05(), r5.A02.A03);
    }

    public final void A0E(AnonymousClass0C1 r2, DirectThreadKey directThreadKey, PendingMedia pendingMedia, String str, boolean z) {
        AnonymousClass3LX.A0T(r2, directThreadKey, C104724fh.A00(pendingMedia), str, z);
    }

    public final void A0F(AnonymousClass0C1 r2, DirectThreadKey directThreadKey, ShareType shareType, MediaType mediaType, String str, boolean z) {
        AnonymousClass3LX.A0T(r2, directThreadKey, C104724fh.A01(shareType, mediaType), str, z);
    }

    public final void A0J(AnonymousClass0C1 r2, String str, C13300iJ r4) {
        AnonymousClass3JL.A02(r2, str, r4.getId());
    }

    public final void A0K(AnonymousClass0C1 r3, String str, List list, boolean z, C104154ej r7) {
        AnonymousClass4DT.A03(r3, str, C58942gm.A01(list), z, new C104164ek(this, r7));
    }

    public C19010sm(Context context, C19030so r15, C19040sp r16, List list, AnonymousClass0C8 r18) {
        C19100sv r2;
        this.A01 = r15;
        this.A00 = r16;
        C19070ss.A00 = new C19060sr();
        C19090su.A00 = new C19080st();
        synchronized (C19100sv.class) {
            if (C19100sv.A01 == null) {
                C19100sv.A01 = new C19100sv(context.getApplicationContext());
            }
            r2 = C19100sv.A01;
        }
        C19120sx.A00 = new C19110sw(r2.A00, Settings.System.DEFAULT_NOTIFICATION_URI);
        C19180t3.A00 = new C19170t2(r2);
        RealtimeClientManager.addRealtimeDelegateProvider(new C19190t4(r2));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new C19200t5(r2));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new C19210t6(r2));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new C19220t7(r2));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new C19230t8(r2));
        C19250tA.A07 = new C19240t9();
        C19250tA.A08 = C19260tB.A01;
        C19290tE.A00.add(new C19280tD());
        C19310tG.A0Q.add(new C19300tF(r2));
        C19320tI r1 = new C19320tI(r2);
        C17390qA.A0P.add(r1);
        List list2 = C17390qA.A0O;
        list2.add(r1);
        list2.add(C19330tJ.A0B);
        list2.add(new C19360tM(r2));
        list2.add(new C19370tN(r2));
        C17390qA.A0L = new C19380tO(r2);
        C17390qA.A0M = new C19390tP(r2);
        C17410qC r22 = C17400qB.A00;
        r22.A03("direct_app_invite", C19400tQ.A02);
        r22.A03("send_reshare", C19430tT.A00);
        C17060pc r5 = new C17060pc("send_media_message", C19690tt.A01, C19710tv.A02, C19510tb.A02);
        r5.A02 = C19580ti.A01;
        r5.A06 = false;
        r5.A05 = true;
        C17120pi r4 = C19730tx.A0E;
        C05110Id r12 = C19750tz.A02;
        C05110Id r52 = C19510tb.A02;
        C17060pc A002 = C19510tb.A00("configure_media_message", C20330uv.A01, C20350ux.A05, C19510tb.A00);
        A002.A03 = new AnonymousClass09F(50);
        A002.A00 = new AnonymousClass09F(10);
        A002.A01 = new C20390v1(A002, new AnonymousClass0Hj(new C05000Hl("perm_media_backoff_slot_time_ms", AnonymousClass0L7.DIRECT_MUTATION_MANAGER_MEDIA_3, Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS), new String[]{"2000"}, (AnonymousClass04H) null)));
        C17120pi r42 = C20480vB.A01;
        C05110Id r13 = C20500vD.A02;
        C05110Id r53 = C19510tb.A02;
        C17060pc r7 = new C17060pc("send_reaction", C20560vJ.A04, C20590vM.A03, new C20610vO());
        r7.A04 = C20620vP.A03;
        r7.A02 = C20640vR.A01;
        r7.A06 = true;
        r7.A05 = true;
        C17060pc r72 = new C17060pc("unsend_message", C20660vT.A03, C20680vV.A01, new C20610vO());
        r72.A02 = C19510tb.A01;
        C17060pc r73 = new C17060pc("send_thread_seen_marker", C20700vX.A02, C20730va.A01, new C20750vc());
        r73.A04 = C20760vd.A02;
        r73.A02 = C20780vf.A01;
        C17060pc r74 = new C17060pc("send_visual_item_seen_marker", C20800vh.A01, C20820vj.A01, new C20750vc());
        r74.A02 = C20780vf.A01;
        C17060pc r75 = new C17060pc("send_voice_item_seen_marker", C20840vl.A01, C20860vn.A01, new C20750vc());
        r75.A02 = C20780vf.A01;
        C17060pc r76 = new C17060pc("accept_valued_request", C20880vp.A01, C20900vr.A01, new C20610vO());
        r76.A02 = C19510tb.A01;
        C17060pc r77 = new C17060pc("send_mark_unread", C20920vt.A02, C20940vv.A01, new C20610vO());
        r77.A04 = C20960vx.A02;
        r77.A02 = C19510tb.A01;
        C17060pc r78 = new C17060pc("send_mute_thread", C20980vz.A02, C21000w1.A01, new C20610vO());
        r78.A04 = C21020w3.A02;
        r78.A02 = C19510tb.A01;
        C17060pc r79 = new C17060pc("send_mute_thread_mentions", C21040w5.A02, C21060w7.A01, new C20610vO());
        r79.A04 = C21080w9.A02;
        r79.A02 = C19510tb.A01;
        C17060pc r710 = new C17060pc("send_mute_video_call", C21100wB.A02, C21120wD.A01, new C20610vO());
        r710.A04 = C21140wF.A02;
        r710.A02 = C19510tb.A01;
        C17060pc r711 = new C17060pc("send_admin_approval", C21160wH.A02, C21180wJ.A01, new C20610vO());
        r711.A04 = C21200wL.A02;
        r711.A02 = C19510tb.A01;
        C17060pc r712 = new C17060pc("delete_thread", C21220wN.A01, C21240wP.A01, new C20610vO());
        r712.A02 = C19510tb.A01;
        C17060pc r713 = new C17060pc("leave_thread", C21260wR.A01, C21280wT.A01, new C20610vO());
        r713.A02 = C19510tb.A01;
        C17060pc r714 = new C17060pc("end_thread", C21300wV.A01, C21320wX.A01, new C20610vO());
        r714.A02 = C19510tb.A01;
        C17060pc r715 = new C17060pc("change_thread_title", C21340wZ.A02, C21360wb.A01, new C20610vO());
        r715.A04 = C21380wd.A02;
        r715.A02 = C19510tb.A01;
        C17060pc r716 = new C17060pc("star_thread", C21400wf.A02, C21420wh.A01, new C20610vO());
        r716.A04 = C21440wj.A03;
        r716.A02 = C19510tb.A01;
        C17060pc r717 = new C17060pc("send_poll_vote", C21460wl.A04, C21480wn.A01, new C20610vO());
        r717.A02 = C19510tb.A01;
        r717.A04 = C21500wp.A01;
        C17060pc r718 = new C17060pc("thread_move_folder", C21520wr.A02, new C17150pl(new C21540wt()), new C20610vO());
        r718.A04 = C21550wu.A02;
        r718.A02 = C19510tb.A01;
        C17060pc r719 = new C17060pc("thread_deny_request", C21570ww.A02, new C17150pl(new C21590wy()), new C20610vO());
        r719.A02 = C19510tb.A01;
        C17060pc r720 = new C17060pc("thread_toggle_shh_mode", C21600wz.A02, new C17150pl(new C21620x1()), new C20610vO());
        r720.A02 = C19510tb.A01;
        C17060pc r721 = new C17060pc("set_thread_theme", C21630x2.A03, new C17150pl(new C21650x4()), new C20610vO());
        r721.A02 = C19510tb.A01;
        C17060pc r722 = new C17060pc("send_shh_mode_screenshot", C21700x9.A01, new C17150pl(new C21720xB()), new C20610vO());
        r722.A02 = C19510tb.A01;
        for (C17220ps A012 : Arrays.asList(new C17220ps[]{new C17220ps(C19510tb.A00("send_text_message", C19450tV.A05, C19480tY.A02, C19510tb.A02)), new C17220ps(C19510tb.A00("send_link_message", C19610tl.A04, C19630tn.A02, C19510tb.A02)), new C17220ps(C19510tb.A00("send_like_message", C19650tp.A00, C19670tr.A02, C19510tb.A02)), new C17220ps(r5), new C17220ps(C19510tb.A00("send_reel_share_message", r4, r12, r52)), new C17220ps(C19510tb.A00("send_live_video_share_message", C19770u1.A04, C19790u3.A02, r52)), new C17220ps(C19510tb.A00("send_story_share_message", C19810u5.A04, C19830u7.A02, r52)), new C17220ps(C19510tb.A00("send_live_viewer_invite_message", C19850u9.A03, C19870uB.A02, r52)), new C17220ps(C19510tb.A00("send_media_share_message", C19890uD.A02, C19910uF.A02, r52)), new C17220ps(C19510tb.A00("send_igtv_share_message", C19930uH.A02, C19950uJ.A03, r52)), new C17220ps(C19510tb.A00("send_clips_share_message", C19970uL.A01, C19990uN.A02, r52)), new C17220ps(C19510tb.A00("send_guide_share_message", C20010uP.A01, C20030uR.A02, r52)), new C17220ps(C19510tb.A00("send_profile_share_message", C20050uT.A02, C20070uV.A03, r52)), new C17220ps(C19510tb.A00("send_hashtag_share_message", C20090uX.A01, C20110uZ.A03, r52)), new C17220ps(C19510tb.A00("send_ar_effect_share_message", C20130ub.A02, C20150ud.A02, r52)), new C17220ps(C19510tb.A00("send_location_share_message", C20170uf.A02, C20190uh.A03, r52)), new C17220ps(C19510tb.A00("send_product_share_message", C20210uj.A02, C20230ul.A02, r52)), new C17220ps(C19510tb.A00("send_animated_media_message", C20250un.A02, C20270up.A02, r52)), new C17220ps(C19510tb.A00("send_static_sticker_message", C20290ur.A01, C20310ut.A02, r52)), new C17220ps(A002), new C17220ps(C19510tb.A00("send_status_reply_message", C20400v2.A02, C20420v4.A02, C19510tb.A02)), new C17220ps(C19510tb.A00("configure_visual_message", C20440v6.A06, C20460v8.A06, C19510tb.A00)), new C17220ps(C19510tb.A00("configure_voice_message", r42, r13, r53)), new C17220ps(C19510tb.A00("send_selfie_sticker_message", C20520vF.A01, C20540vH.A04, r53)), new C17220ps(r7), new C17220ps(r72), new C17220ps(r73), new C17220ps(r74), new C17220ps(r75), new C17220ps(r76), new C17220ps(r77), new C17220ps(r78), new C17220ps(r79), new C17220ps(r710), new C17220ps(r711), new C17220ps(r712), new C17220ps(r713), new C17220ps(r714), new C17220ps(r715), new C17220ps(r716), new C17220ps(r717), new C17220ps(r718), new C17220ps(r719), new C17220ps(r720), new C17220ps(r721), new C17220ps(C19510tb.A00("forward_media_message", C21660x5.A02, C21680x7.A02, C19510tb.A02)), new C17220ps(r722)})) {
            C17390qA.A01(A012);
        }
        C17060pc r8 = new C17060pc("block_user_messaging", C21730xC.A05, C21750xE.A01, new AnonymousClass09F(new C17170pn("block_user_messaging")));
        r8.A04 = C21770xG.A01;
        r8.A02 = C21790xI.A01;
        for (C17220ps A013 : Arrays.asList(new C17220ps[]{new C17220ps(r8), new C17220ps(new C17060pc("remove_pseudo_block", C21810xK.A02, C21830xM.A00, new AnonymousClass09F(new C17170pn("remove_pseudo_block"))))})) {
            C17390qA.A01(A013);
        }
        C21860xP.A00 = new C21850xO();
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.IGVC_RSYS_STACK, "enabled", false)).booleanValue()) {
            C207708vh r14 = new C207708vh();
            C13150hy.A02(r14, "instance");
            C207718vi.A00 = r14;
        }
        C21880xR.A00 = new C21870xQ();
        AnonymousClass0C8 r17 = r18;
        r17.A01(new C21890xS(this));
        r17.A01(new C21900xT(this));
        r17.A01(new C21910xU(this));
        C06080Nr.A03(context, DirectShareHandlerActivity.class.getCanonicalName(), true);
        C06080Nr.A03(context, DirectExternalPhotoShareActivity.class.getCanonicalName(), ((Boolean) C05640Lj.A00(AnonymousClass0L7.DIRECT_ADD_DIRECT_TO_ANDROID_NATIVE_PHOTO_SHARE_SHEET, "is_enabled", false)).booleanValue());
        C21920xY r19 = new C21920xY(this, list);
        List list3 = C17390qA.A0O;
        list3.add(r19);
        list3.add(new C21930xZ(this, context));
        list3.add(new C21940xa(this));
        C21960xc.A00 = new C21950xb();
        C21980xe.A00 = new C21970xd(this);
    }
}
