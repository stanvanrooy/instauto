package p000X;

import android.os.SystemClock;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* renamed from: X.0oT  reason: invalid class name and case insensitive filesystem */
public final class C16360oT implements C14250k8 {
    public static final Pattern A0P = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final long A00;
    public final long A01 = TimeUnit.SECONDS.toMillis(10);
    public final long A02;
    public final C14080jj A03;
    public final C16390oW A04;
    public final C14070ji A05;
    public final C14050jg A06;
    public final C14060jh A07;
    public final AnonymousClass0R7 A08;
    public final C14250k8 A09;
    public final C14990m9 A0A;
    public final C16410oY A0B;
    public final C06180Ob A0C;
    public final Object A0D;
    public final List A0E;
    public final List A0F;
    public final Map A0G;
    public final Map A0H;
    public final Map A0I;
    public final AtomicInteger A0J;
    public final AtomicInteger A0K;
    public final AtomicInteger A0L;
    public final AtomicInteger A0M;
    public final boolean A0N;
    public volatile boolean A0O;

    public static boolean A03(C16360oT r15, boolean z) {
        boolean z2;
        int size;
        int i;
        C16360oT r10 = r15;
        long j = r15.A02;
        long j2 = r15.A00;
        boolean z3 = true;
        boolean z4 = z;
        if (!C37431je.A00) {
            C14050jg r1 = r15.A06;
            if (!r1.A04 || (r1.A05 && !C06110Nu.A01(StoredPreferences.A00))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                size = r15.A0F.size() + r15.A0E.size();
                i = 4;
                if (z) {
                    i = 8;
                }
            } else {
                C14050jg r12 = r15.A06;
                if (r12.A06) {
                    j = (long) r12.A02;
                    j2 = (long) r12.A00;
                } else {
                    size = r15.A0F.size() + r15.A0E.size();
                    if (z) {
                        i = r15.A06.A03;
                    } else {
                        i = r15.A06.A01;
                    }
                }
            }
            if (size >= i) {
                return false;
            }
            return true;
        }
        long j3 = r15.A04.A03.A00.get();
        long j4 = j3;
        long j5 = r10.A04.A00.A00.get();
        long j6 = j5;
        long j7 = j3 + j5;
        if (!z4 ? j7 >= j2 : Math.min(j5, j2) + j3 >= j) {
            z3 = false;
        }
        long j8 = r10.A02;
        long j9 = r10.A00;
        int size2 = r10.A0B.A03.size();
        synchronized (AnonymousClass1CT.class) {
            if (AnonymousClass1CU.A00()) {
                AnonymousClass00B.A01.markerStart(25624582);
                AnonymousClass00B.A01.markerAnnotate(25624582, "is_on_screen_calculation", z4);
                AnonymousClass00B.A01.markerAnnotate(25624582, "on_screen_remaining_bytes", j4);
                AnonymousClass00B.A01.markerAnnotate(25624582, "off_screen_remaining_bytes", j6);
                AnonymousClass00B.A01.markerAnnotate(25624582, "on_screen_byte_limit", j8);
                AnonymousClass00B.A01.markerAnnotate(25624582, "off_screen_byte_limit", j9);
                AnonymousClass00B.A01.markerAnnotate(25624582, "num_pending", size2);
                AnonymousClass00B.A01.markerAnnotate(25624582, "retval", z3);
                AnonymousClass00B.A01.markerEnd(25624582, 2);
            }
        }
        return z3;
    }

    public C16360oT(C14250k8 r7, C14030je r8, C14990m9 r9, AnonymousClass0R7 r10) {
        C06180Ob r3 = C06190Oc.A00;
        C14040jf r4 = r8.A02;
        this.A02 = (long) (r4.A01 << 10);
        this.A00 = (long) (r4.A00 << 10);
        this.A0N = r4.A04;
        this.A06 = r4.A02;
        this.A07 = r4.A03;
        this.A05 = r8.A01;
        this.A08 = r10;
        this.A0D = new Object();
        this.A0F = new ArrayList();
        this.A0E = new ArrayList();
        this.A09 = r7;
        this.A0C = r3;
        this.A0H = Collections.synchronizedMap(new HashMap());
        this.A0I = Collections.synchronizedMap(new HashMap());
        this.A0G = Collections.synchronizedMap(new HashMap());
        this.A03 = r8.A00;
        this.A0A = r9;
        this.A0O = false;
        this.A04 = new C16390oW();
        this.A0J = new AtomicInteger();
        this.A0M = new AtomicInteger();
        this.A0K = new AtomicInteger();
        this.A0L = new AtomicInteger();
        this.A0B = new C16410oY(this.A0D, new C16420oZ(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r2 == p000X.C15920nk.Analytics) goto L_0x0013;
     */
    public static Long A00(C16360oT r3, AnonymousClass1C4 r4, C256019m r5) {
        boolean z;
        long j;
        C15920nk r2 = r5.A05;
        if (!(r2 == C15920nk.Image || r2 == C15920nk.Video || r2 == C15920nk.Other)) {
            z = false;
        }
        z = true;
        if (!z) {
            return null;
        }
        Long l = (Long) r3.A0I.get(r4);
        if (l == null) {
            l = (Long) r3.A0G.get(r4);
        }
        if (l != null) {
            return l;
        }
        C15920nk r1 = r5.A05;
        if (r1 == C15920nk.Image) {
            j = r3.A05.A00;
        } else if (r1 == C15920nk.Video) {
            j = r3.A05.A02;
        } else {
            j = r3.A05.A01;
        }
        return Long.valueOf(j);
    }

    private void A01(C37411jc r7, List list) {
        AnonymousClass1GS r0;
        C16410oY r1 = this.A0B;
        C37441jf r4 = new C37441jf(r1, r1.A03.iterator());
        while (r4.A01.hasNext()) {
            C37411jc r5 = (C37411jc) r4.A01.next();
            r4.A00 = r5;
            if (r5 == r7) {
                AnonymousClass0R7 r3 = this.A08;
                if (r3 != null) {
                    C256019m r2 = r5.A02;
                    if (r2.A05 == C15920nk.Image && (r0 = r2.A04) != null) {
                        r3.Alo(r0.A00.A03);
                    }
                }
                list.add(r5.A01);
                r5.A04.A04(new AnonymousClass1CV(this, r5.A01, r5.A02));
                r4.A01(this.A09);
                if (r5.A02.A05 == C15920nk.Image) {
                    this.A0L.incrementAndGet();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.equals("IN_PLAY") == false) goto L_0x0026;
     */
    private boolean A02(long j, AnonymousClass1C4 r14, C256019m r15) {
        C44031vU r2;
        boolean z;
        double d;
        if (this.A07.A04 && r15.A05 == C15920nk.Video && r15.A00() == Constants.A0C && (r2 = r15.A06) != null) {
            String str = r2.A02;
            if (str != null) {
                z = true;
            }
            z = false;
            if (z && r2 != null) {
                Integer num = r2.A00;
                Long A002 = A00(this, r14, r15);
                if (!(num == null || A002 == null)) {
                    long AOk = this.A0A.AOk(C15920nk.Video);
                    if (AOk <= 0) {
                        AOk = this.A07.A03;
                    }
                    C15700nO A003 = C15700nO.A00();
                    synchronized (A003) {
                        d = A003.A01;
                    }
                    if (d <= 0.0d) {
                        d = this.A07.A00;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                    long round = Math.round(((double) A002.longValue()) / d);
                    C14060jh r9 = this.A07;
                    if (r9.A05) {
                        if (elapsedRealtime + AOk + round > ((long) (num.intValue() - r9.A02))) {
                            return true;
                        }
                        return false;
                    } else if (((double) (elapsedRealtime + AOk + round)) > ((double) num.intValue()) * r9.A01) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void A04() {
        int i;
        int i2;
        C37411jc r12;
        if (this.A0B.A03.size() != 0) {
            this.A0O = true;
            while (A03(this, true) && this.A0B.A03.size() != 0) {
                C37411jc r4 = null;
                if (this.A03.A01) {
                    C16410oY r1 = this.A0B;
                    C37441jf r5 = new C37441jf(r1, r1.A03.iterator());
                    r12 = null;
                    i = 0;
                    i2 = 0;
                    while (r5.A01.hasNext()) {
                        C37411jc r11 = (C37411jc) r5.A01.next();
                        r5.A00 = r11;
                        if (C37451jg.A00(r11.A02)) {
                            i2++;
                            if (A02(r11.A00, r11.A01, r11.A02)) {
                                r12 = r11;
                            }
                        } else {
                            i++;
                            if (SystemClock.elapsedRealtime() > ((Long) r11.A05).longValue()) {
                                r5.A00();
                                i--;
                            }
                        }
                    }
                    if (this.A0B.A03.size() > 0 && r12 == null) {
                        List<C37411jc> unmodifiableList = Collections.unmodifiableList(this.A0B.A03);
                        if (this.A0L.get() > this.A03.A00) {
                            ArrayList arrayList = new ArrayList();
                            for (C37411jc r52 : unmodifiableList) {
                                if (r52.A02.A05 != C15920nk.Image) {
                                    arrayList.add(r52);
                                }
                            }
                            unmodifiableList = arrayList;
                        }
                        if (unmodifiableList.size() > 0) {
                            C37411jc AMx = C38131km.A00().AMx(unmodifiableList);
                            if (C37451jg.A00(AMx.A02)) {
                                r12 = AMx;
                            } else {
                                r4 = AMx;
                            }
                        }
                    }
                } else {
                    C16410oY r13 = this.A0B;
                    C37441jf r9 = new C37441jf(r13, r13.A03.iterator());
                    r12 = null;
                    i = 0;
                    i2 = 0;
                    while (r9.A01.hasNext()) {
                        C37411jc r53 = (C37411jc) r9.A01.next();
                        r9.A00 = r53;
                        if (C37451jg.A00(r53.A02)) {
                            i2++;
                            if (r12 == null) {
                                r12 = r53;
                            }
                            if (A02(r53.A00, r53.A01, r53.A02)) {
                                r12 = r53;
                            }
                        } else {
                            i++;
                            if (SystemClock.elapsedRealtime() > ((Long) r53.A05).longValue()) {
                                r9.A00();
                                i--;
                            } else if (r4 == null) {
                                r4 = r53;
                            }
                        }
                    }
                }
                if (r12 == null) {
                    if (r4 == null || !A03(this, false)) {
                        break;
                    }
                    A05(r4, false, true, i2, i);
                    A01(r4, this.A0E);
                } else {
                    A05(r12, true, false, i2, i);
                    A01(r12, this.A0F);
                }
            }
            this.A0O = false;
        }
    }

    public final void A05(C37411jc r9, boolean z, boolean z2, int i, int i2) {
        String str;
        int size = this.A0B.A03.size();
        int size2 = this.A0F.size();
        int size3 = this.A0E.size();
        synchronized (AnonymousClass1CT.class) {
            if (AnonymousClass1CU.A00()) {
                AnonymousClass00B.A01.markerStart(25624579);
                AnonymousClass00B.A01.markerAnnotate(25624579, "scheduler", IgReactPurchaseExperienceBridgeModule.RN_AUTH_PTT_DATA_PAYLOAD_KEY);
                AnonymousClass00B.A01.markerAnnotate(25624579, "is_onscreen", Boolean.toString(z));
                if (!z) {
                    AnonymousClass00B.A01.markerAnnotate(25624579, "offscreen_ok", Boolean.toString(z2));
                }
                AnonymousClass00B.A01.markerAnnotate(25624579, "num_pending", size);
                AnonymousClass00B.A01.markerAnnotate(25624579, "num_on_pending", i);
                AnonymousClass00B.A01.markerAnnotate(25624579, "num_off_pending", i2);
                AnonymousClass00B.A01.markerAnnotate(25624579, "num_running_onscreen", size2);
                AnonymousClass00B.A01.markerAnnotate(25624579, "num_running_offscreen", size3);
                if (r9 == null) {
                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                } else {
                    str = AnonymousClass000.A0J(Integer.toString(r9.A01.A00), ":", C26191Ca.A00(r9.A02.A00()));
                }
                AnonymousClass00B.A01.markerAnnotate(25624579, "request_dispatched", str);
                AnonymousClass00B.A01.markerEnd(25624579, 2);
            }
        }
    }

    public final C26211Cc startRequest(AnonymousClass1C4 r15, C256019m r16, AnonymousClass1CB r17) {
        C26211Cc A002;
        AnonymousClass1GS r0;
        AnonymousClass1C4 r9 = r15;
        C17190pp A003 = r15.A00("Image-Percentage");
        if (A003 != null) {
            String str = A003.A01;
            try {
                this.A0H.put(r15, Float.valueOf(Float.parseFloat(str)));
            } catch (NumberFormatException e) {
                AnonymousClass0DB.A0P("IdleQueuePayloadBasedServiceLayer", e, "Unable to parse image percentage: %f", str);
            }
        }
        C17190pp A004 = r15.A00("Size-Bytes");
        if (A004 != null) {
            String str2 = A004.A01;
            try {
                this.A0I.put(r15, Long.valueOf(Long.parseLong(str2)));
            } catch (NumberFormatException e2) {
                AnonymousClass0DB.A0P("IdleQueuePayloadBasedServiceLayer", e2, "Unable to parse video etd: %s", str2);
            }
        }
        C17190pp A005 = r15.A00("Estimated-Size-Bytes");
        if (A005 != null) {
            String str3 = A005.A01;
            try {
                this.A0G.put(r15, Long.valueOf(Long.parseLong(str3)));
            } catch (NumberFormatException e3) {
                AnonymousClass0DB.A0P("IdleQueuePayloadBasedServiceLayer", e3, "Unable to parse image estimated etd: %s", str3);
            }
        }
        C256019m r10 = r16;
        boolean z = true;
        switch (r10.A05.ordinal()) {
            case 0:
            case 4:
            case 5:
            case 6:
                break;
            case 1:
                z = A02(SystemClock.elapsedRealtime(), r15, r10);
                break;
            default:
                z = false;
                break;
        }
        AnonymousClass1CS r6 = new AnonymousClass1CS(this);
        synchronized (AnonymousClass1CT.class) {
            if (AnonymousClass1CU.A00()) {
                AnonymousClass00B.A01.markerStart(25624578);
                AnonymousClass00B.A01.markerAnnotate(25624578, TraceFieldType.RequestID, r15.A00);
                AnonymousClass00B.A01.markerAnnotate(25624578, "request_type", r10.A05.name());
                AnonymousClass00B.A01.markerAnnotate(25624578, "skip_queue", Boolean.toString(z));
                AnonymousClass00B.A01.markerAnnotate(25624578, "is_onscreen", Boolean.toString(C37451jg.A00(r10)));
                AnonymousClass00B r5 = AnonymousClass00B.A01;
                if (r15 != null) {
                    Float f = (Float) r6.A00.A0H.get(r15);
                    if (f != null) {
                        r5.markerAnnotate(25624578, "image_pct", (double) f.floatValue());
                    }
                    Long l = (Long) r6.A00.A0I.get(r15);
                    if (l != null) {
                        r5.markerAnnotate(25624578, "payload_bytes", l.longValue());
                    }
                    Long l2 = (Long) r6.A00.A0G.get(r15);
                    if (l2 != null) {
                        r5.markerAnnotate(25624578, "estimated_payload_bytes", l2.longValue());
                    }
                }
                AnonymousClass00B.A01.markerEnd(25624578, 2);
            }
        }
        AnonymousClass1CB r11 = r17;
        if (z) {
            r11.A04(new AnonymousClass1CV(this, r15, r10));
            C26211Cc startRequest = this.A09.startRequest(r15, r10, r11);
            if (r10.A05 == C15920nk.Image) {
                this.A0L.incrementAndGet();
            }
            return startRequest;
        }
        AnonymousClass0R7 r2 = this.A08;
        if (!(r2 == null || r10.A05 != C15920nk.Image || (r0 = r10.A04) == null)) {
            r2.Alj(r0.A00.A03);
        }
        synchronized (this.A0D) {
            A002 = this.A0B.A00(r9, r10, r11, Long.valueOf(SystemClock.elapsedRealtime() + this.A01), new C37391ja(this));
            A04();
        }
        return A002;
    }
}
