package p000X;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1cW  reason: invalid class name and case insensitive filesystem */
public final class C33191cW extends C27291Hg implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final AudioManager A04;
    public final Context A05;
    public final C162256wC A06;
    public final AnonymousClass0C1 A07;

    public final void onAudioFocusChange(int i) {
        if (i == -2) {
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            C162256wC r1 = this.A06;
            if (r1.A0h()) {
                C162256wC.A0L(r1, "minimized_loss_audio");
            }
        } else if (i == -3) {
            this.A00 = 0.5f;
        } else if (i == 1 || i == 2 || i == 4 || i == 3) {
            this.A00 = 1.0f;
            C162256wC r12 = this.A06;
            if (r12.A0h()) {
                r12.A0L.A04();
            }
        } else if (i == -1) {
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A02 = false;
            this.A04.abandonAudioFocus(this);
            C162256wC r13 = this.A06;
            if (r13.A0h()) {
                C162256wC.A0B(r13);
            }
        }
    }

    private void A00() {
        int requestAudioFocus = this.A04.requestAudioFocus(this, 3, 2);
        this.A01 = requestAudioFocus;
        boolean z = true;
        if (requestAudioFocus != 1) {
            z = false;
        }
        this.A02 = z;
        this.A00 = 1.0f;
    }

    public final void BE0() {
        if (!this.A06.A0h()) {
            this.A04.abandonAudioFocus(this);
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A02 = false;
        }
    }

    public final void BP6() {
        if (this.A06.A0h()) {
            this.A04.abandonAudioFocus(this);
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A02 = false;
        }
    }

    public final void onStart() {
        if (this.A06.A0h()) {
            A00();
        }
    }

    public C33191cW(Activity activity, C162256wC r3, AnonymousClass0C1 r4) {
        this.A05 = activity.getApplicationContext();
        this.A04 = (AudioManager) activity.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A06 = r3;
        this.A07 = r4;
    }

    public final void Ayk(View view) {
        View findViewById = view.findViewById(C0003R.C0005id.root_container);
        findViewById.requestFocus();
        findViewById.setOnKeyListener(this);
    }

    public final void BJx() {
        A00();
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || (i != 25 && i != 24)) {
            return false;
        }
        this.A03 = true;
        if (!this.A02) {
            int requestAudioFocus = this.A04.requestAudioFocus(this, 3, 2);
            this.A01 = requestAudioFocus;
            boolean z = true;
            if (requestAudioFocus != 1) {
                z = false;
            }
            this.A02 = z;
        }
        if (this.A02) {
            this.A00 = 1.0f;
        }
        int i2 = -1;
        if (i == 24) {
            i2 = 1;
        }
        this.A04.adjustStreamVolume(3, i2, 0);
        C162256wC r3 = this.A06;
        if (r3 != null) {
            r3.A0Z.A00(this.A04.getStreamVolume(3), this.A04.getStreamMaxVolume(3));
        }
        return true;
    }
}
