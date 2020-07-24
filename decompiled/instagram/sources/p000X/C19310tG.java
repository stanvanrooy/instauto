package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0tG  reason: invalid class name and case insensitive filesystem */
public final class C19310tG extends RealtimeEventHandler implements C06570Po {
    public static final IntentFilter A0P = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public static final List A0Q = new ArrayList();
    public static final Charset A0R = Charset.forName("UTF-8");
    public long A00 = -1;
    public long A01 = -1;
    public long A02;
    public RealtimeClientManager A03;
    public boolean A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public final BroadcastReceiver A09 = new C68662zh(this);
    public final Context A0A = StoredPreferences.A00;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final Handler A0C;
    public final C66082ut A0D;
    public final C68712zm A0E;
    public final C68282yp A0F;
    public final C68742zp A0G;
    public final C65882uZ A0H;
    public final AnonymousClass0C1 A0I;
    public final C68672zi A0J = new C68672zi(5, C68672zi.A04);
    public final List A0K = new ArrayList();
    public final boolean A0L;
    public final C23300zv A0M;
    public final C11200ea A0N = new C68692zk(this);
    public final Runnable A0O = new C68682zj(this);

    public static void A01(C19310tG r2) {
        r2.A08 = false;
        r2.A01 = -1;
        AnonymousClass0ZA.A08(r2.A0C, r2.A0O);
        AnonymousClass0ZA.A02(r2.A0C, 5);
    }

    public final List getMqttTopicsToHandle() {
        return Arrays.asList(new String[]{RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC, RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE});
    }

    public final boolean shouldNotifyMqttChannelStateChanged() {
        return true;
    }

    public static C19310tG A00(AnonymousClass0C1 r3) {
        ArrayList arrayList = new ArrayList(A0Q.size());
        for (C05110Id AF7 : A0Q) {
            arrayList.add(AF7.AF7(r3));
        }
        return (C19310tG) r3.AVA(C19310tG.class, new C68652zg(r3, arrayList));
    }

    public static void A02(C19310tG r9) {
        if (r9.A07) {
            if (r9.A00 == -1) {
                A01(r9);
                r9.A0E.A00(-1, -1, (String) null, (C66022un) null, "initial_snapshot", C06080Nr.A09(r9.A0A));
            } else if (!r9.A05 && !r9.A08 && r9.A03.isMqttConnected()) {
                r9.A08 = true;
                Runnable runnable = r9.A0O;
                AnonymousClass0ZA.A08(r9.A0C, runnable);
                long j = (long) (r9.A0J.A00 * CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                if (j == 0) {
                    runnable.run();
                } else {
                    AnonymousClass0ZA.A09(r9.A0C, runnable, j, 562760603);
                }
            }
            if (r9.A05 && !r9.A0K.isEmpty()) {
                for (AnonymousClass3QW A002 : r9.A0K) {
                    A002.A00();
                }
                r9.A0K.clear();
            }
        }
    }

    public static void A03(C19310tG r4, boolean z, Long l, long j) {
        long j2;
        if (z != r4.A05) {
            r4.A05 = z;
            C68742zp r3 = r4.A0G;
            boolean z2 = r3.A04.A05;
            if (!z2 && r3.A01) {
                r3.A00 = 0;
            }
            r3.A01 = z2;
            if (r4.A0L) {
                C6D A002 = C6D.A00(r4.A0I);
                boolean z3 = r4.A05;
                C6E c6e = A002.A01;
                c6e.A07 = z3;
                c6e.A05 = j;
                if (z3) {
                    j2 = A002.A00.A04;
                } else {
                    j2 = -1;
                }
                c6e.A03 = j2;
                C6D.A01(A002);
            }
            r4.A0H.Bks(l);
        }
    }

    public final void A04() {
        A03(this, false, (Long) null, -1);
        this.A00 = -1;
        if (this.A0L) {
            C6D A002 = C6D.A00(this.A0I);
            long j = this.A00;
            C6E c6e = A002.A01;
            c6e.A04 = j;
            c6e.A01 = 4;
            C6D.A01(A002);
        }
    }

    public final void A05(long j, int i) {
        if (this.A00 != j) {
            this.A00 = j;
            this.A0H.Bi6(j);
            if (this.A0L) {
                C6D A002 = C6D.A00(this.A0I);
                C6E c6e = A002.A01;
                c6e.A04 = j;
                c6e.A01 = i;
                C6D.A01(A002);
            }
        }
    }

    public final boolean handleRealtimeEvent(C55622b2 r5, RealtimePayload realtimePayload) {
        onRealtimeEventPayload(r5.A00, (String) null, new String(r5.A01, A0R));
        return true;
    }

    public final void onMqttChannelStateChanged(C56392cQ r3) {
        this.A0C.obtainMessage(3, r3).sendToTarget();
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A0M.A03(C68262yn.class, this.A0N);
        if (this.A04) {
            this.A0A.unregisterReceiver(this.A09);
            this.A04 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0099, code lost:
        if (r9.A0I.A06.AeV() == false) goto L_0x009b;
     */
    public C19310tG(AnonymousClass0C1 r10, C68282yp r11, List list) {
        this.A0I = r10;
        this.A0M = C23300zv.A00(r10);
        this.A0H = C19290tE.A00(this.A0I);
        this.A0D = C66082ut.A01(this.A0I);
        this.A03 = RealtimeClientManager.getInstance(this.A0I);
        this.A0L = ((Boolean) AnonymousClass0L6.A02(this.A0I, AnonymousClass0L7.IRIS_PERF_LOGGER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0F = r11;
        this.A0C = new C68702zl(this, this.A0D.A03());
        boolean z = C06080Nr.A07(this.A0A) ? true : z;
        z = false;
        AnonymousClass0C1 r4 = this.A0I;
        this.A0E = new C68712zm(r4, this, new C68292yq(AnonymousClass0QT.A00(r4, new C06300On("ig_direct"))), new C68302yr(AnonymousClass0QT.A00(r4, new C06300On("ig_direct"))), z);
        AnonymousClass0C1 r42 = this.A0I;
        new C68712zm(r42, this, new C68292yq(AnonymousClass0QT.A00(r42, new C06300On("ig_direct"))), new C68302yr(AnonymousClass0QT.A00(r42, new C06300On("ig_direct"))), z);
        this.A0G = new C68742zp(this.A0I, this, this.A0E, list);
        this.A0M.A02(C68262yn.class, this.A0N);
        if (C19290tE.A00(this.A0I).AgK()) {
            this.A0C.obtainMessage(1).sendToTarget();
        }
        if (!this.A04) {
            this.A04 = this.A0A.registerReceiver(this.A09, A0P) != null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r5.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r5.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC) == false) goto L_0x0019;
     */
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1892903684) {
            c = 1;
        } else if (hashCode == 1526307141) {
            c = 0;
        }
        c = 65535;
        if (c == 0 || c == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r8.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r8.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC) == false) goto L_0x0018;
     */
    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1892903684) {
            c = 1;
        } else if (hashCode == 1526307141) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            C68742zp r3 = this.A0G;
            try {
                Handler handler = r3.A02;
                C13080hr A0A2 = C12890hY.A00.A0A(str3);
                A0A2.A0p();
                ArrayList arrayList = new ArrayList();
                if (A0A2.A0g() == C13120hv.START_ARRAY) {
                    while (A0A2.A0p() != C13120hv.END_ARRAY) {
                        if (A0A2.A0g() == C13120hv.START_OBJECT) {
                            C54652Yi parseFromJson = C54642Yh.parseFromJson(A0A2);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            } else {
                                throw new IOException("Failed to parse IrisSyncMessage from payload");
                            }
                        }
                    }
                }
                handler.obtainMessage(1, arrayList).sendToTarget();
            } catch (IOException e) {
                AnonymousClass0QD.A05("IrisSyncMessageProcessor", "Could not deserialize IrisSyncMessage", e);
                r3.A02.obtainMessage(2).sendToTarget();
            }
        } else if (c == 1) {
            try {
                Handler handler2 = this.A0C;
                C13080hr A0A3 = C12890hY.A00.A0A(str3);
                A0A3.A0p();
                handler2.obtainMessage(4, AnonymousClass2Y1.parseFromJson(A0A3)).sendToTarget();
            } catch (IOException e2) {
                AnonymousClass0QD.A05("IrisSyncManager", "Could not deserialize IrisSubscribeResponse", e2);
            }
        }
    }
}
