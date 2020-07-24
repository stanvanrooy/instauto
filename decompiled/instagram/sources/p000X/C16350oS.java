package p000X;

import android.os.SystemClock;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* renamed from: X.0oS  reason: invalid class name and case insensitive filesystem */
public final class C16350oS extends C15190mU {
    public final /* synthetic */ C15720nQ A00;

    public final void onNewData(AnonymousClass1C4 r1, C256019m r2, ByteBuffer byteBuffer) {
    }

    public C16350oS(C15720nQ r1) {
        this.A00 = r1;
    }

    public final void onFailed(AnonymousClass1C4 r6, IOException iOException) {
        IllegalStateException illegalStateException;
        C13960jX r2 = this.A00.A00;
        synchronized (r2) {
            if (!(r6 == null || iOException == null)) {
                if (!r2.A0B) {
                    AnonymousClass1CW r1 = (AnonymousClass1CW) r2.A00.remove(r6);
                    if (r1 != null) {
                        if (!r1.A0D) {
                            r1.A0D = true;
                            r1.A09 = iOException;
                            C14010jc r4 = r2.A05;
                            String A002 = r4.A00(r1);
                            C37011iy r12 = (C37011iy) r4.A03.get(A002);
                            if (r12 == null) {
                                r12 = new C37011iy(A002);
                                r4.A03.put(A002, r12);
                            }
                            r12.A00++;
                            r12.A07 = iOException.getMessage();
                        } else {
                            illegalStateException = new IllegalStateException("NetworkTrace is already closed");
                        }
                    }
                } else {
                    CBV cbv = (CBV) r2.A01.remove(r6);
                    if (cbv != null) {
                        if (!cbv.A0D) {
                            cbv.A09 = iOException;
                            cbv.A0D = true;
                            cbv.A0C = false;
                            CBU.A00(cbv, r2.A04);
                        } else {
                            illegalStateException = new IllegalStateException("NetworkTrace is already closed");
                        }
                    }
                }
                throw illegalStateException;
            }
        }
    }

    public final void onResponseStarted(AnonymousClass1C4 r7, C256019m r8, C33851db r9) {
        C13960jX r3 = this.A00.A00;
        synchronized (r3) {
            if (!r3.A0B) {
                AnonymousClass1CW r2 = (AnonymousClass1CW) r3.A00.get(r7);
                if (r2 != null) {
                    r2.A05 = SystemClock.elapsedRealtime();
                }
            } else {
                CBV cbv = (CBV) r3.A01.get(r7);
                if (cbv != null) {
                    cbv.A06 = System.currentTimeMillis();
                }
            }
        }
        C13960jX r32 = this.A00.A00;
        synchronized (r32) {
            if (!r32.A0B) {
                AnonymousClass1CW r22 = (AnonymousClass1CW) r32.A00.get(r7);
                if (r22 != null) {
                    r22.A00 = r9.A00;
                    r22.A02 = SystemClock.elapsedRealtime();
                    if (r9.A02("X-Instagram-Trace-Token")) {
                        r22.A0C = r9.A00("X-Instagram-Trace-Token").A01;
                    }
                    if (r9.A02("X-Instagram-Trace-Enabled")) {
                        r22.A0E = Boolean.valueOf(r9.A00("X-Instagram-Trace-Enabled").A01).booleanValue();
                    }
                    AnonymousClass435 r4 = r22.A08;
                    if (r4 != null) {
                        if (r9.A02("X-Backend")) {
                            r4.A06 = r9.A00("X-Backend").A01;
                        }
                        if (r9.A02("X-BlockId")) {
                            r4.A03 = Long.parseLong(r9.A00("X-BlockId").A01);
                        }
                        if (r9.A02("X-Object-Type")) {
                            r4.A0B = r9.A00("X-Object-Type").A01;
                        }
                        if (r9.A02("X-Origin-Hit")) {
                            r4.A01 = Integer.parseInt(r9.A00("X-Origin-Hit").A01);
                        }
                        if (r9.A02("X-Origin-From-Pieces")) {
                            r4.A0C = r9.A00("X-Origin-From-Pieces").A01;
                        }
                        if (r9.A02("X-Origin-Hit-Original")) {
                            r4.A0D = r9.A00("X-Origin-Hit-Original").A01;
                        }
                        if (r9.A02("X-Origin-Is-Transcode")) {
                            String str = r9.A00("X-Origin-Is-Transcode").A01;
                            if (!str.isEmpty()) {
                                r4.A02 = Integer.parseInt(str);
                            }
                        }
                        if (r9.A02("X-Edge-Hit")) {
                            r4.A00 = Integer.parseInt(r9.A00("X-Edge-Hit").A01);
                        }
                        if (r9.A02("X-Edge-From-Pieces")) {
                            r4.A09 = r9.A00("X-Edge-From-Pieces").A01;
                        }
                        if (r9.A02("X-FB-Edge-Debug")) {
                            r4.A0A = r9.A00("X-FB-Edge-Debug").A01;
                        }
                        if (r9.A02("X-Cache")) {
                            r4.A07 = r9.A00("X-Cache").A01;
                        }
                        if (r9.A02("X-Cache-Remote")) {
                            r4.A08 = r9.A00("X-Cache-Remote").A01;
                        }
                        if (r9.A02("X-Akamai-Pragma-Client-IP")) {
                            r4.A05 = r9.A00("X-Akamai-Pragma-Client-IP").A01;
                        }
                    }
                    C17190pp A002 = r9.A00("Content-Length");
                    if (A002 != null) {
                        try {
                            r22.A04 = Long.parseLong(A002.A01);
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                CBV cbv2 = (CBV) r32.A01.get(r7);
                if (cbv2 != null) {
                    cbv2.A03 = System.currentTimeMillis();
                    cbv2.A01 = r9.A00;
                    C17190pp A003 = r9.A00("Content-Length");
                    if (A003 != null) {
                        cbv2.A05 = Long.parseLong(A003.A01);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r10 == -1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (r1 == false) goto L_0x00bb;
     */
    public final void onSucceeded(AnonymousClass1C4 r13) {
        IllegalStateException illegalStateException;
        String str;
        boolean z;
        boolean z2;
        C13960jX r7 = this.A00.A00;
        synchronized (r7) {
            if (!r7.A0B) {
                AnonymousClass1CW r9 = (AnonymousClass1CW) r7.A00.remove(r13);
                if (r9 != null) {
                    r9.A0A = C36831ig.A00(r13.A03);
                    try {
                        str = InetAddress.getByName(r13.A04.getHost()).getHostAddress();
                    } catch (UnknownHostException unused) {
                        str = "";
                    }
                    r9.A0B = str;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    r9.A01 = elapsedRealtime;
                    if (!r9.A0D) {
                        r9.A0D = true;
                        C14010jc r6 = r7.A05;
                        if (!(r9.A07 == -1 || r9.A05 == -1 || r9.A02 == -1)) {
                            z = true;
                        }
                        z = false;
                        if (z) {
                            if (r9.A00 == 200) {
                                String A002 = r6.A00(r9);
                                C37011iy r8 = (C37011iy) r6.A03.get(A002);
                                if (r8 == null) {
                                    r8 = new C37011iy(A002);
                                    r6.A03.put(A002, r8);
                                }
                                long j = r8.A05;
                                long j2 = r9.A05;
                                r8.A05 = j + (j2 - r9.A07);
                                long j3 = r8.A04;
                                long j4 = r9.A02;
                                r8.A04 = j3 + (j4 - j2);
                                r8.A02 += r9.A01 - j4;
                                r8.A06 += r9.A03;
                                r8.A03 += r9.A04;
                                r8.A01++;
                                C13990ja r4 = r6.A01;
                                synchronized (r4) {
                                    String str2 = r9.A0H;
                                    if (str2 != null) {
                                        boolean endsWith = str2.toLowerCase().endsWith(".jpg");
                                        z2 = true;
                                    }
                                    z2 = false;
                                    if (z2) {
                                        int i = (r4.A00 + 1) % 7;
                                        r4.A00 = i;
                                        C14000jb[] r0 = r4.A01;
                                        C14000jb r5 = r0[i];
                                        if (r5 == null) {
                                            r5 = new C14000jb();
                                            r0[i] = r5;
                                        }
                                        float f = ((float) r9.A04) / 1024.0f;
                                        r5.A00 = f;
                                        r5.A01 = Math.min(f / (((float) (r9.A01 - r9.A02)) / 1000.0f), 10240.0f);
                                        r4.A00();
                                    }
                                }
                            }
                            if (r9.A0E) {
                                AnonymousClass0P4 A003 = AnonymousClass0P4.A00("network_trace", (AnonymousClass0RN) null);
                                A003.A0G("ct", r9.A0G);
                                A003.A0C("bw", Double.valueOf(r9.A0F));
                                A003.A0F("sd", Long.valueOf(r9.A05 - r9.A07));
                                A003.A0F("sb", Long.valueOf(r9.A03));
                                A003.A0F("wd", Long.valueOf(r9.A02 - r9.A05));
                                A003.A0F("rd", Long.valueOf(r9.A01 - r9.A02));
                                A003.A0F("rb", Long.valueOf(r9.A04));
                                A003.A0F("ts", Long.valueOf(r9.A06));
                                A003.A0G("sip", r9.A0B);
                                A003.A0E("sc", Integer.valueOf(r9.A00));
                                A003.A0G("tt", r9.A0C);
                                A003.A0G(IgReactNavigatorModule.URL, r9.A0H);
                                A003.A0G("hm", r9.A0A);
                                A003.A0G("nsn", r6.A02);
                                AnonymousClass435 r2 = r9.A08;
                                if (r2 != null) {
                                    AnonymousClass434 r3 = AnonymousClass434.AKAMAI;
                                    AnonymousClass434 r1 = r2.A04;
                                    if (r3.equals(r1)) {
                                        A003.A0G("xc", r2.A07);
                                        A003.A0G("cr", r2.A08);
                                        A003.A0G("pc", r2.A05);
                                    } else if (AnonymousClass434.IGCDN.equals(r1)) {
                                        A003.A0G("xb", r2.A06);
                                        A003.A0F("bi", Long.valueOf(r2.A03));
                                        A003.A0G("ot", r2.A0B);
                                        A003.A0E("oh", Integer.valueOf(r2.A01));
                                        A003.A0G("op", r2.A0C);
                                        A003.A0G("oho", r2.A0D);
                                        A003.A0E("oit", Integer.valueOf(r2.A02));
                                        A003.A0E("eh", Integer.valueOf(r2.A00));
                                        A003.A0G("efp", r2.A09);
                                        A003.A0G("ed", r2.A0A);
                                    }
                                }
                                r6.A00.BcG(A003);
                            }
                        }
                    } else {
                        illegalStateException = new IllegalStateException("NetworkTrace is already closed");
                    }
                }
            } else {
                CBV cbv = (CBV) r7.A01.remove(r13);
                if (cbv != null) {
                    cbv.A0A = C36831ig.A00(r13.A03);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!cbv.A0D) {
                        cbv.A0D = true;
                        cbv.A0C = true;
                        cbv.A02 = currentTimeMillis;
                        CBU.A00(cbv, r7.A04);
                    } else {
                        illegalStateException = new IllegalStateException("NetworkTrace is already closed");
                    }
                }
            }
            throw illegalStateException;
        }
    }
}
