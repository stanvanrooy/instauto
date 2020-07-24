package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.DJ7 */
public final class DJ7 {
    public DJ8 A00;
    public final DJ8 A01;
    public final BroadcastReceiver A02 = new DJ9(this);
    public final Context A03;
    public final AudioManager A04;
    public final DJE A05;

    public static DJ7 A00(Context context, DJK djk, C2096691k r7, DJH djh) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AnonymousClass11J.A00(audioManager);
        DJT djt = new DJT(context, audioManager);
        DJ8 dj8 = new DJ8(r7, audioManager, new B2k(context, audioManager, djt), new DJC(djt));
        if (dj8.A02 == null) {
            dj8.A02 = djk;
            return new DJ7(context, audioManager, dj8, new DJE(audioManager, djh));
        }
        throw new IllegalStateException("Must not call setCallback twice");
    }

    public final void A01() {
        DJ8 dj8 = this.A00;
        dj8.A09.A02.cleanup();
        dj8.A07.setSpeakerphoneOn(false);
        dj8.A07.setMicrophoneMute(false);
        int i = dj8.A00;
        if (i != -2) {
            DJ8.A01(dj8, i);
            dj8.A00 = -2;
        }
        dj8.A02.Bg4((C25134B2l) null);
        this.A03.unregisterReceiver(this.A02);
        DJE dje = this.A05;
        if (dje != null && dje.A00 != null) {
            dje.A01.A00.A2G();
            dje.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r2 != false) goto L_0x0035;
     */
    public final void A02() {
        boolean z;
        DJ8 dj8 = this.A00;
        boolean z2 = false;
        if (dj8.A0A.A00.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != -1) {
            z2 = true;
        }
        if (z2) {
            DJC djc = dj8.A09;
            djc.A00 = new DJJ(dj8);
            djc.A02.AdW(djc.A01);
        }
        dj8.A03 = true;
        boolean isWiredHeadsetOn = dj8.A07.isWiredHeadsetOn();
        dj8.A04 = isWiredHeadsetOn;
        if (dj8.A03) {
            z = true;
        }
        z = false;
        dj8.A06 = z;
        dj8.A07.setSpeakerphoneOn(z);
        DJ8.A00(dj8);
        DJE dje = this.A05;
        if (dje != null) {
            if (dje.A00 != null) {
                dje.A01.A00.A2G();
                dje.A00 = null;
            }
            C29962DIu dIu = new C29962DIu();
            dIu.A00.BlY(2);
            dIu.A00.Bgj(1);
            dIu.A00.BiS(0);
            DJ5 dj5 = new DJ5(new DJG(dje), new Handler(Looper.getMainLooper()), new AudioAttributesCompat(dIu.A00.A6v()));
            dje.A00 = dj5;
            boolean z3 = true;
            if (dje.A01.A00.BdF(dj5) != 1) {
                z3 = false;
            }
            if (!z3) {
                dje.A02.BJ8();
            }
        }
        DJ8 dj82 = this.A01;
        boolean z4 = false;
        if (dj82.A0A.A00.checkCallingOrSelfPermission("android.permission.MODIFY_AUDIO_SETTINGS") != -1) {
            z4 = true;
        }
        if (z4) {
            DJ8.A01(dj82, 3);
            dj82.A07.getMode();
        } else if (!dj82.A09.A02.AeR()) {
            dj82.A07.isSpeakerphoneOn();
            dj82.A07.setSpeakerphoneOn(dj82.A06);
            DJ8.A00(dj82);
            dj82.A07.isMicrophoneMute();
            dj82.A07.setMicrophoneMute(false);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        this.A03.registerReceiver(this.A02, intentFilter);
    }

    public DJ7(Context context, AudioManager audioManager, DJ8 dj8, DJE dje) {
        this.A03 = context;
        this.A04 = audioManager;
        this.A01 = dj8;
        this.A00 = dj8;
        this.A05 = dje;
    }
}
