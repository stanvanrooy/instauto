package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import com.instagram.realtimeclient.RealtimeProtocol;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0nW  reason: invalid class name and case insensitive filesystem */
public final class C15780nW {
    public int A00;
    public int A01 = -1;
    public AudioManager A02;
    public String A03 = "Unknown";
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public boolean A07;
    public final Context A08;

    public final void A01() {
        this.A05 = null;
        this.A06 = null;
        this.A04 = null;
        this.A01 = -1;
    }

    public static void A00(C15780nW r8) {
        if (r8.A06 == null) {
            boolean z = false;
            r8.A06 = false;
            r8.A00 = -1;
            try {
                Intent registerReceiver = r8.A08.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra(RealtimeProtocol.USERS_ACCOUNT_STATUS, -1);
                    if (intExtra == 2 || intExtra == 5) {
                        z = true;
                    }
                    r8.A06 = Boolean.valueOf(z);
                    int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
                    int intExtra3 = registerReceiver.getIntExtra("level", -1);
                    int intExtra4 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra3 >= 0 && intExtra4 > 0) {
                        r8.A00 = Math.round(((float) (intExtra3 * 100)) / ((float) intExtra4));
                    }
                    if (intExtra == 2) {
                        r8.A03 = "Charging";
                    } else if (intExtra == 3) {
                        r8.A03 = "Unplugged";
                    } else if (intExtra != 4) {
                        if (intExtra != 5) {
                            r8.A03 = "Unknown";
                        } else {
                            r8.A03 = "Full";
                        }
                    } else if (intExtra3 == intExtra4) {
                        r8.A03 = "Full";
                    } else if (intExtra2 > 0) {
                        r8.A03 = "Charging";
                    } else {
                        r8.A03 = "Unplugged";
                    }
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public final boolean A02() {
        if (this.A04 == null) {
            boolean z = false;
            if (Settings.Global.getInt(this.A08.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            this.A04 = Boolean.valueOf(z);
        }
        return this.A04.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4.isConnected() == false) goto L_0x001d;
     */
    public final boolean A04(boolean z) {
        boolean z2;
        if (this.A05 == null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.A08.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z3 = false;
            if (activeNetworkInfo != null) {
                z2 = true;
            }
            z2 = false;
            Boolean valueOf = Boolean.valueOf(z2);
            this.A05 = valueOf;
            if (valueOf.booleanValue() && 1 == activeNetworkInfo.getType()) {
                z3 = true;
            }
            this.A07 = z3;
        }
        if (z) {
            return this.A07;
        }
        return this.A05.booleanValue();
    }

    public C15780nW(Context context) {
        this.A08 = context;
        this.A02 = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public final boolean A03() {
        A00(this);
        Boolean bool = this.A06;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
