package p000X;

import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1te  reason: invalid class name and case insensitive filesystem */
public abstract class C43031te {
    public static String A00() {
        AudioManager audioManager = (AudioManager) StoredPreferences.A00.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        return C06360Ot.formatString("%.1f", Float.valueOf(((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3))));
    }

    public static void A01(AnonymousClass0C1 r1, AnonymousClass0P4 r2, AnonymousClass1NJ r3, C27371Ho r4) {
        if (C36901in.A0O(r3, r4)) {
            AnonymousClass0WN.A01(r1).BdB(r2);
        } else {
            AnonymousClass0WN.A01(r1).BcG(r2);
        }
    }

    public static void A02(AnonymousClass0C1 r5, String str, AnonymousClass1NJ r7, int i, int i2, int i3, int i4, int i5, int i6, boolean z, C27371Ho r15) {
        int min = Math.min(i, i3);
        C42991ta r4 = new C42991ta(str, r15, r5);
        r4.A02(r5, r7);
        r4.A0E = i4;
        r4.A0B = min;
        r4.A0C = i3;
        r4.A01((double) min, (double) i3);
        r4.A0H = i2;
        r4.A01 = (float) i6;
        r4.A0q = A00();
        r4.A0Y = Boolean.valueOf(z);
        A03(r4, r7, i5);
        A01(r5, r4.A00(), r7, r15);
    }

    public static void A03(C42991ta r2, AnonymousClass1NJ r3, int i) {
        String str;
        if (r3.A1W() && i != -1) {
            AnonymousClass1NJ A0P = r3.A0P(i);
            r2.A07 = i;
            r2.A0j = A0P.APo();
            r2.A0i = r3.A0P(0).APo();
            r2.A09 = r3.A07();
            r2.A08 = A0P.APx().A00;
            C37671k2 A0e = A0P.A0e();
            if (A0e.A06()) {
                r2.A0F = 1;
                if (A0e.A04 != null) {
                    str = "dash";
                } else {
                    str = "progressive";
                }
                r2.A0n = str;
            }
        }
    }
}
