package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.AY0 */
public final class AY0 {
    public int A00;
    public BroadcastReceiver A01;
    public AudioManager A02;
    public C23686AXx A03;
    public Boolean A04 = null;
    public Integer A05 = Constants.ONE;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final Handler A0A;
    public final AY4 A0B;
    public final Runnable A0C = new AY3(this);
    public final AudioManager.OnAudioFocusChangeListener A0D = new AY2(this);
    public final C23684AXv A0E;

    public static void A01(AY0 ay0) {
        ay0.A04 = false;
        A02(ay0);
    }

    public static void A00(AY0 ay0) {
        boolean z = false;
        if (ay0.A09.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != -1) {
            z = true;
        }
        if (z) {
            ay0.A03.AdW(new C23685AXw(ay0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r6.A03.BrW(r0.booleanValue()) == false) goto L_0x0019;
     */
    public static void A02(AY0 ay0) {
        boolean z;
        boolean z2;
        if (ay0.A05 == Constants.ZERO) {
            Boolean bool = ay0.A04;
            boolean z3 = true;
            if (bool != null) {
                z = true;
            }
            z = false;
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(ay0.A06);
            Boolean bool2 = ay0.A04;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                z2 = true;
            }
            z2 = false;
            objArr[1] = Boolean.valueOf(z2);
            objArr[2] = Boolean.valueOf(z);
            ay0.A03(false, "updateAudioRoute: (wh: %b, be: %b, ba: %b)", objArr);
            boolean z4 = z | ay0.A06;
            if (ay0.A02.isSpeakerphoneOn() == z4) {
                AudioManager audioManager = ay0.A02;
                if (z4) {
                    z3 = false;
                }
                audioManager.setSpeakerphoneOn(z3);
                AY4 ay4 = ay0.A0B;
                if (ay4 != null) {
                    ay4.Asb(z4, (String) null);
                }
            }
        }
    }

    private void A03(boolean z, String str, Object... objArr) {
        if (z) {
            AnonymousClass0DB.A0J("RtcAudioManager", str, objArr);
        }
        this.A0E.AlC("RtcAudioManager", C06360Ot.formatString(str, objArr));
    }

    public final void A04() {
        if (this.A05 == Constants.ZERO) {
            A03(true, "LiveWithAudioManager already started!", new Object[0]);
        } else if (this.A02.requestAudioFocus(this.A0D, 0, 2) == 1) {
            this.A0D.onAudioFocusChange(2);
            this.A05 = Constants.ZERO;
            this.A00 = this.A02.getMode();
            this.A07 = this.A02.isMicrophoneMute();
            boolean isSpeakerphoneOn = this.A02.isSpeakerphoneOn();
            this.A08 = isSpeakerphoneOn;
            A03(false, "Starting audio for live-with. Old state: %d Microphone mute: %s Speaker on: %s", Integer.valueOf(this.A00), Boolean.valueOf(this.A07), Boolean.valueOf(isSpeakerphoneOn));
            boolean z = false;
            if (this.A05 == Constants.ZERO) {
                z = true;
            }
            AnonymousClass0a4.A0A(z);
            this.A02.setMode(3);
            this.A02.setMicrophoneMute(false);
            A03(false, "updateAudioState, mode=MODE_IN_COMMUNICATION, mic_mute=false", new Object[0]);
            this.A06 = this.A02.isWiredHeadsetOn();
            this.A09.registerReceiver(this.A01, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            A02(this);
            A00(this);
        } else {
            A03(true, "Audio focus request rejected", new Object[0]);
            AY4 ay4 = this.A0B;
            if (ay4 != null) {
                ay4.AsX();
            }
        }
    }

    public final void A05() {
        Integer num = this.A05;
        Integer num2 = Constants.ONE;
        if (num != num2) {
            this.A05 = num2;
            boolean z = false;
            if (num2 != Constants.ZERO) {
                z = true;
            }
            AnonymousClass0a4.A0A(z);
            this.A02.setMode(this.A00);
            this.A02.setMicrophoneMute(this.A07);
            this.A02.setSpeakerphoneOn(this.A08);
            A03(false, "restoreAudioState, mode=%d, mic_mute=%s, speaker=%s", Integer.valueOf(this.A00), Boolean.valueOf(this.A07), Boolean.valueOf(this.A08));
            try {
                this.A09.unregisterReceiver(this.A01);
            } catch (IllegalArgumentException unused) {
            }
            this.A02.abandonAudioFocus(this.A0D);
        }
    }

    public AY0(Context context, AY4 ay4, C23684AXv aXv) {
        this.A0B = ay4;
        this.A0E = aXv;
        Context applicationContext = context.getApplicationContext();
        this.A02 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A01 = new AY1(this);
        this.A03 = new DJU(applicationContext, this.A02);
        this.A0A = new Handler(Looper.getMainLooper());
        this.A09 = applicationContext.getApplicationContext();
    }
}
