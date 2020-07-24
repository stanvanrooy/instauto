package p000X;

import android.content.Context;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.video.cowatch.interactor.CoWatchVideoPlayer;
import java.util.Arrays;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0om  reason: invalid class name and case insensitive filesystem */
public final class C16550om extends C16560on {
    public C62232nI A00;

    public final C62232nI A00() {
        if (this.A00 == null) {
            this.A00 = new C62232nI();
        }
        return this.A00;
    }

    public final C24273Al0 A01(Context context, ViewGroup viewGroup, ViewStub viewStub, AnonymousClass0C1 r35, AnonymousClass0RN r36, AnonymousClass1L8 r37, C24922AwQ awQ, boolean z) {
        C111604rE[] r1;
        C24749Asq asq;
        C24939Awh awh;
        ViewGroup viewGroup2 = viewGroup;
        Context context2 = viewGroup2.getContext();
        AnonymousClass0C1 r8 = r35;
        CoWatchVideoPlayer coWatchVideoPlayer = new CoWatchVideoPlayer(context2, r8);
        viewGroup2.getContext();
        C24922AwQ awQ2 = awQ;
        AnonymousClass0RN r14 = r36;
        Aw5 aw5 = new Aw5(r8, r14, coWatchVideoPlayer, new C24979AxM((AudioManager) context2.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)), awQ2);
        C24734Asb asb = new C24734Asb(r8, awQ2);
        C24167AjH ajH = new C24167AjH(r8);
        viewGroup2.getContext();
        C24266Akt akt = new C24266Akt(LayoutInflater.from(context2).inflate(C0003R.layout.layout_cowatch_content_sheet, viewGroup2, false));
        View view = akt.A00;
        C112394sZ r2 = new C112394sZ(new C112404sa(view, (ViewGroup) view.findViewById(C0003R.C0005id.overlay_container)));
        ViewStub viewStub2 = viewStub;
        viewStub2.setLayoutResource(C0003R.layout.layout_cowatch_playback);
        C24904Aw6 aw6 = new C24904Aw6(r8, ajH, aw5, new C24905Aw7(context, new C26571Ea(viewStub2)));
        View view2 = akt.A00;
        View view3 = view2;
        View view4 = view2;
        C225319mx r15 = new C225319mx((ViewGroup) view4.findViewById(C0003R.C0005id.content_picker_container), r2);
        AnonymousClass1L8 r23 = r37;
        C225309mw r20 = new C225309mw(r8, r14, r23, (ViewGroup) view4.findViewById(C0003R.C0005id.content_picker_container), C24742Asj.SAVED_POSTS);
        AnonymousClass0C1 r25 = r8;
        AnonymousClass0RN r26 = r14;
        AnonymousClass1L8 r27 = r23;
        C225309mw r24 = new C225309mw(r25, r26, r27, (ViewGroup) view4.findViewById(C0003R.C0005id.content_picker_container), C24742Asj.LIKED_POSTS);
        C225309mw r242 = new C225309mw(r25, r26, r27, (ViewGroup) view4.findViewById(C0003R.C0005id.content_picker_container), C24742Asj.SUGGESTED_POSTS);
        Context context3 = view3.getContext();
        C24753Asu asu = new C24753Asu(context3);
        if (((Boolean) AnonymousClass0L6.A03(ajH.A00, AnonymousClass0L7.VC_COWATCH_MEDIA_PICKER_TABS, "liked_before_gallery", false, (AnonymousClass04H) null)).booleanValue()) {
            r1 = new C111604rE[4];
            r1[0] = new C24749Asq("posts_liked", C0003R.C0004drawable.instagram_heart_selector);
            asq = new C24749Asq("gallery", C0003R.C0004drawable.instagram_photo_selector);
        } else {
            r1 = new C111604rE[4];
            r1[0] = new C24749Asq("gallery", C0003R.C0004drawable.instagram_photo_selector);
            asq = new C24749Asq("posts_liked", C0003R.C0004drawable.instagram_heart_selector);
        }
        r1[1] = asq;
        r1[2] = new C24749Asq("posts_saved", C0003R.C0004drawable.instagram_save_selector);
        r1[3] = new C24749Asq("posts_suggested", C0003R.C0004drawable.instagram_compass_selector);
        AnonymousClass0C1 r16 = r8;
        C24272Akz akz = new C24272Akz(akt, new C24723AsQ(r16, ajH, asb, r15, r20, r24, r242, asu, new C24745Asm(Arrays.asList(r1), (ViewGroup) view3.findViewById(C0003R.C0005id.navigation_tabs_container)), new C24760At2(context3)));
        if (z) {
            awh = new C24939Awh(aw5);
        } else {
            awh = null;
        }
        return new C24273Al0(aw6, akz, awh);
    }

    public final Avs A02(AnonymousClass0C1 r4, Context context) {
        return new Avs(r4, new C24922AwQ(r4, context, new C23766Aas(new C23762Aao(r4))));
    }

    public final C24922AwQ A03(AnonymousClass0C1 r3, Context context) {
        return new C24922AwQ(r3, context, new C23766Aas(new C23762Aao(r3)));
    }
}
