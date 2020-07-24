package p000X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0dG  reason: invalid class name and case insensitive filesystem */
public final class C10410dG {
    public AnonymousClass0WU A00;
    public AnonymousClass0WW A01;
    public String A02;
    public InetAddress A03;
    public InetAddress A04;
    public Socket A05;
    public final RealtimeSinceBootClock A06;
    public final C07480Tg A07;
    public final AnonymousClass0UK A08;
    public final AnonymousClass0VJ A09;
    public final C08070Vn A0A;
    public final AnonymousClass0WZ A0B;
    public final AnonymousClass0QT A0C;
    public final String A0D;
    public final ScheduledExecutorService A0E;
    public final Context A0F;
    public final C10930e7 A0G;
    public volatile C10400dF A0H;
    public volatile C10390dE A0I;
    public volatile boolean A0J = false;

    public final synchronized void A04(String str, byte[] bArr, int i, int i2) {
        String str2;
        Integer num = (Integer) AnonymousClass0TB.A01.get(str);
        if (num != null) {
            str2 = num.toString();
        } else {
            C10390dE r4 = this.A0I;
            String.format((Locale) null, "Failed to encode topic %s", new Object[]{str});
            C10630dc r0 = r4.A00.A0W;
            if (r0 != null) {
                r0.A01((Throwable) null);
            }
            str2 = str;
        }
        AnonymousClass0d7 r1 = new AnonymousClass0d7(new AnonymousClass0W2(AnonymousClass0W6.PUBLISH, i), new AnonymousClass0WF(str2, i2), bArr);
        AnonymousClass0VP r42 = this.A0I.A00.A0X;
        try {
            A01(this, this.A01, r1);
            AnonymousClass0QT r02 = this.A0C;
            if (r02 != null) {
                C25359BFx A002 = C25359BFx.A00(r02);
                if (A002.A0B()) {
                    C25359BFx A0E2 = A002.A0C().A0D(Long.valueOf(this.A0I.A00.A0U)).A0F(r42.toString()).A0E(this.A0D);
                    A0E2.A0I(str);
                    A0E2.A0G(Long.valueOf((long) i));
                    A0E2.A01();
                }
            }
        } catch (IOException e) {
            AnonymousClass0QT r03 = this.A0C;
            if (r03 != null) {
                C25359BFx A003 = C25359BFx.A00(r03);
                if (A003.A0B()) {
                    C25359BFx A0E3 = A003.A0C().A0D(Long.valueOf(this.A0I.A00.A0U)).A0F(r42.toString()).A0E(this.A0D);
                    A0E3.A0I(str);
                    A0E3.A0G(Long.valueOf((long) i));
                    A0E3.A0H(e.toString());
                    A0E3.A01();
                }
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r5.A00.A03 != p000X.AnonymousClass0W6.PUBLISH) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r4.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r0 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r1 = p000X.C25358BFw.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1.A0B() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r2 = (p000X.AnonymousClass0d7) r5;
        r6 = (long) r2.A00.A02;
        r8 = r1.A0C().A0D(java.lang.Long.valueOf(r4.A0I.A00.A0U)).A0F(r4.A0I.A00.A0X.toString()).A0E(r4.A0D);
        r8.A0I(r4.A02(r2));
        r8.A0H(java.lang.Long.valueOf(r6));
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r6 != 1) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        r8.A0G(r0);
        r8.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r6 = r4.A0I;
        r0 = r6.A00;
        r15 = p000X.AnonymousClass0TV.A01;
        r13 = android.os.SystemClock.elapsedRealtime();
        r4 = r0.A0W;
        r3 = r5.A00.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        switch(r3.ordinal()) {
            case 2: goto L_0x0124;
            case 3: goto L_0x011c;
            case 4: goto L_0x0096;
            case 5: goto L_0x0096;
            case 6: goto L_0x0096;
            case 7: goto L_0x0096;
            case 8: goto L_0x0114;
            case 9: goto L_0x0096;
            case 10: goto L_0x010d;
            case X.5Dh.VIEW_TYPE_BANNER :int: goto L_0x00fd;
            default: goto L_0x0096;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r4 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        p000X.AnonymousClass0ZA.A0E(r4.A01.A04, new p000X.C07850Ur(r4, r5), 883057530);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r6.A00.A0R = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        if ((r5 instanceof p000X.AnonymousClass0d7) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r1 = ((p000X.AnonymousClass0d7) r5).A02().A01;
        p000X.C07410Sz.A00(r1);
        r0 = new p000X.C11010eH(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        r5 = r6.A00.A09;
        r4 = new java.lang.Object[2];
        r4[0] = r3.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        if (r0.A01() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
        r1 = p000X.AnonymousClass000.A0E(" ", (java.lang.String) r0.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        r0 = p000X.C11020eI.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        r0 = r6.A00;
        p000X.AnonymousClass0Z9.A03(r0.A0J, new p000X.AnonymousClass0VV(r0), -1491068495);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010d, code lost:
        ((p000X.AnonymousClass0d4) r5).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0114, code lost:
        ((p000X.AnonymousClass0d6) r5).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        ((p000X.C10340d8) r5).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        r1 = (p000X.AnonymousClass0d7) r5;
        r10 = r6.A00.A0D.A02(r1);
        r8 = r1.A02().A00;
        r7 = r1.A00.A02;
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013c, code lost:
        if (r4 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013e, code lost:
        r11 = r1.A03();
        r12 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0149, code lost:
        if ("/send_message_response".equals(r10) != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0151, code lost:
        if ("/t_sm_rp".equals(r10) == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0153, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((p000X.AnonymousClass060) r4.A01.A0A.A07(p000X.AnonymousClass060.class)).A00(p000X.C10760dp.MessageSendSuccess)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0170, code lost:
        if ("/push_notification".equals(r10) != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0178, code lost:
        if ("/t_push".equals(r10) == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017a, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((p000X.AnonymousClass060) r4.A01.A0A.A07(p000X.AnonymousClass060.class)).A00(p000X.C10760dp.FbnsNotificationReceived)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0197, code lost:
        if ("/fbns_msg".equals(r10) == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0199, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((p000X.AnonymousClass060) r4.A01.A0A.A07(p000X.AnonymousClass060.class)).A00(p000X.C10760dp.FbnsLiteNotificationReceived)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b0, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((p000X.AnonymousClass060) r4.A01.A0A.A07(p000X.AnonymousClass060.class)).A00(p000X.C10760dp.PublishReceived)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cb, code lost:
        if (r4.A01.A05 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d3, code lost:
        if (p000X.AnonymousClass0T1.A00.contains(r10) != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d5, code lost:
        r4.A01.A0I.BGd(r10, r11, r12, r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e2, code lost:
        if (r7 != p000X.AnonymousClass0WE.A00(p000X.Constants.ONE)) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e4, code lost:
        r0 = r6.A00;
        p000X.AnonymousClass0Z9.A03(r0.A0J, new p000X.C07970Vd(r0, r8), 1203309340);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f5, code lost:
        r2 = r4.A01.A05;
        r2.Aj3("received", "PUBLISH(topic=" + r10 + ", msgId=" + r8 + ", time=" + r13 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0223, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0224, code lost:
        r2 = r4.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0228, code lost:
        if ((r3 instanceof java.util.concurrent.TimeoutException) != false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0230, code lost:
        if ((r3 instanceof java.io.EOFException) != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0232, code lost:
        r1 = p000X.C07450Td.READ_EOF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0234, code lost:
        r2.A01(r1, p000X.C08110Vr.NETWORK_THREAD_LOOP, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0249, code lost:
        if ((r3 instanceof java.net.SocketException) != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x024b, code lost:
        r1 = p000X.C07450Td.READ_SOCKET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0250, code lost:
        if ((r3 instanceof javax.net.ssl.SSLException) != false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0252, code lost:
        r1 = p000X.C07450Td.READ_SSL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0257, code lost:
        if ((r3 instanceof java.io.IOException) != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0259, code lost:
        r1 = p000X.C07450Td.READ_IO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x025e, code lost:
        if ((r3 instanceof java.util.zip.DataFormatException) != false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0260, code lost:
        r1 = p000X.C07450Td.READ_FORMAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0263, code lost:
        r1 = p000X.C07450Td.READ_FAILURE_UNCLASSIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0266, code lost:
        r1 = p000X.C07450Td.READ_TIMEOUT;
     */
    public static void A00(C10410dG r16) {
        C10410dG r4;
        C10390dE r6;
        C07500Ti r5;
        Object[] objArr;
        String str;
        while (true) {
            r4 = r16;
            synchronized (r4) {
                C10390dE r0 = r4.A0I;
                if (r0.A00.A0X.equals(AnonymousClass0VP.CONNECTED)) {
                    AnonymousClass0WU r02 = r4.A00;
                }
            }
            objArr[1] = str;
            r5.A02(String.format("I %s%s", objArr));
            C07990Vf r2 = r6.A00;
            r2.A0Q = r2.A0R;
        }
        r4.A0I.A00.A0X = AnonymousClass0VP.DISCONNECTED;
        r4.A0I.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04b0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r5 = r15.A00.A03.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r3 == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r5 = "PUBLISH_".concat(((p000X.AnonymousClass0d7) r15).A02().A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r9 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r2 < 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        ((p000X.AnonymousClass063) r9.A00.A0A.A07(p000X.AnonymousClass063.class)).A03((long) r2, r9.A00.A0Z, "m", "s", "b");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r7 = r14.A02;
        ((p000X.AnonymousClass063) r7.A00.A0A.A07(p000X.AnonymousClass063.class)).A03(1, r7.A00.A0Z, "m", "s", "c");
        p000X.AnonymousClass0XK.A02.A00(r2, true);
        r6 = r7.A00.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        if (r6 == null) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e9, code lost:
        r6.A01.A0I.BcB(r5, (long) r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03e5, code lost:
        r2 = r2 + r7;
     */
    public static void A01(C10410dG r13, AnonymousClass0WW r14, AnonymousClass0WB r15) {
        C07400Sy r1;
        String str;
        AssertionError assertionError;
        int i;
        int i2;
        if (r14 != null) {
            boolean z = r15 instanceof AnonymousClass0d7;
            if (z) {
                String str2 = ((AnonymousClass0d7) r15).A02().A01;
                C07410Sz.A00(str2);
                r1 = new C11010eH(str2);
            } else {
                r1 = C11020eI.A00;
            }
            if (r1.A01()) {
                str = AnonymousClass0TB.A00((String) r1.A00());
                if (str == null) {
                    str = (String) r1.A00();
                }
            } else {
                str = "";
            }
            try {
                synchronized (r14) {
                    AnonymousClass0W2 r6 = r15.A00;
                    AnonymousClass0W6 r5 = r6.A03;
                    int i3 = 0;
                    switch (r5.ordinal()) {
                        case 0:
                            if (!(r15 instanceof C10350dA)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                C10350dA r2 = (C10350dA) r15;
                                r2.A03();
                                i3 = r14.A03.handleConnectMessage(r14.A00, r2);
                                break;
                            }
                        case 1:
                            if (!(r15 instanceof C10360dB)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                C10360dB r52 = (C10360dB) r15;
                                r52.A03();
                                i3 = 4;
                                boolean z2 = true;
                                if (r52.A03().A00 != 0) {
                                    if (r52.A02() != null) {
                                        z2 = false;
                                    }
                                    C07410Sz.A02(z2);
                                    r14.A00.writeByte(AnonymousClass0WT.A01(r52.A00));
                                    r14.A00.writeByte(2);
                                    r14.A00.writeByte(0);
                                    r14.A00.writeByte(r52.A03().A00);
                                    r14.A00.flush();
                                    break;
                                } else {
                                    boolean z3 = false;
                                    if (r52.A02() != null) {
                                        z3 = true;
                                    }
                                    C07410Sz.A02(z3);
                                    byte[] A032 = AnonymousClass0WT.A03(r52.A02().toString());
                                    r14.A00.writeByte(AnonymousClass0WT.A01(r52.A00));
                                    DataOutputStream dataOutputStream = r14.A00;
                                    int length = A032.length;
                                    int A022 = 1 + AnonymousClass0WT.A02(dataOutputStream, length + 4);
                                    r14.A00.writeByte(0);
                                    r14.A00.writeByte(r52.A03().A00);
                                    r14.A00.writeShort(length);
                                    r14.A00.write(A032);
                                    i3 = A022 + 4 + length;
                                    r14.A00.flush();
                                    break;
                                }
                            }
                        case 2:
                            if (!z) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                AnonymousClass0d7 r0 = (AnonymousClass0d7) r15;
                                r0.A02();
                                r0.A02();
                                AnonymousClass0W2 r11 = r0.A00;
                                AnonymousClass0WF A023 = r0.A02();
                                byte[] A033 = r0.A03();
                                int i4 = 2;
                                if (r14.A01 != 0) {
                                    byte[] A002 = C09070Zz.A00(A033);
                                    if (2 != r14.A01 || A002.length <= A033.length) {
                                        A033 = A002;
                                    } else {
                                        r11.A01 = true;
                                    }
                                }
                                byte[] A034 = AnonymousClass0WT.A03(A023.A01);
                                int length2 = A034.length;
                                int i5 = length2 + 2;
                                if (r11.A02 <= 0) {
                                    i4 = 0;
                                }
                                int i6 = i5 + i4;
                                int length3 = A033.length;
                                i = i6 + length3;
                                r14.A00.writeByte(AnonymousClass0WT.A01(r11));
                                i2 = 1 + AnonymousClass0WT.A02(r14.A00, i);
                                r14.A00.writeShort(length2);
                                r14.A00.write(A034, 0, length2);
                                if (r11.A02 > 0) {
                                    r14.A00.writeShort(A023.A00);
                                }
                                r14.A00.write(A033, 0, length3);
                                r14.A00.flush();
                                break;
                            }
                            break;
                        case 3:
                            if (!(r15 instanceof C10340d8)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                C10340d8 r12 = (C10340d8) r15;
                                r12.A02();
                                AnonymousClass0W2 r02 = r12.A00;
                                AnonymousClass0W4 A024 = r12.A02();
                                r14.A00.writeByte(AnonymousClass0WT.A01(r02));
                                int A025 = AnonymousClass0WT.A02(r14.A00, 2) + 1;
                                r14.A00.writeShort(A024.A00);
                                i3 = A025 + 2;
                                r14.A00.flush();
                                break;
                            }
                        case 7:
                            if (!(r15 instanceof AnonymousClass0d5)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                AnonymousClass0d5 r03 = (AnonymousClass0d5) r15;
                                r03.A03();
                                AnonymousClass0W2 r9 = r03.A00;
                                AnonymousClass0W4 A026 = r03.A02();
                                AnonymousClass0WH A035 = r03.A03();
                                int i7 = 0;
                                for (SubscribeTopic subscribeTopic : A035.A00) {
                                    i7 = i7 + AnonymousClass0WT.A03(subscribeTopic.A01).length + 2 + 1;
                                }
                                i = 2 + i7;
                                r14.A00.writeByte(AnonymousClass0WT.A01(r9));
                                i2 = 1 + AnonymousClass0WT.A02(r14.A00, i);
                                r14.A00.writeShort(A026.A00);
                                for (SubscribeTopic subscribeTopic2 : A035.A00) {
                                    byte[] A036 = AnonymousClass0WT.A03(subscribeTopic2.A01);
                                    DataOutputStream dataOutputStream2 = r14.A00;
                                    int length4 = A036.length;
                                    dataOutputStream2.writeShort(length4);
                                    r14.A00.write(A036, 0, length4);
                                    r14.A00.write(subscribeTopic2.A00);
                                }
                                r14.A00.flush();
                                break;
                            }
                        case 8:
                            if (!(r15 instanceof AnonymousClass0d6)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                AnonymousClass0d6 r53 = (AnonymousClass0d6) r15;
                                r53.A02();
                                int size = r53.A03().A00.size() + 2;
                                r14.A00.writeByte(AnonymousClass0WT.A01(r53.A00));
                                int A027 = AnonymousClass0WT.A02(r14.A00, size) + 1;
                                r14.A00.writeShort(r53.A02().A00);
                                for (Integer intValue : r53.A03().A00) {
                                    r14.A00.writeByte(intValue.intValue());
                                }
                                r14.A00.flush();
                                i3 = A027 + size;
                                break;
                            }
                        case 9:
                            if (!(r15 instanceof AnonymousClass0d3)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                AnonymousClass0d3 r04 = (AnonymousClass0d3) r15;
                                r04.A03();
                                AnonymousClass0W2 r22 = r04.A00;
                                AnonymousClass0W4 A028 = r04.A02();
                                AnonymousClass0WM A037 = r04.A03();
                                int i8 = 0;
                                for (String A038 : A037.A00) {
                                    i8 += AnonymousClass0WT.A03(A038).length + 2;
                                }
                                i = 2 + i8;
                                r14.A00.writeByte(AnonymousClass0WT.A01(r22));
                                i2 = 1 + AnonymousClass0WT.A02(r14.A00, i);
                                r14.A00.writeShort(A028.A00);
                                for (String A039 : A037.A00) {
                                    byte[] A0310 = AnonymousClass0WT.A03(A039);
                                    DataOutputStream dataOutputStream3 = r14.A00;
                                    int length5 = A0310.length;
                                    dataOutputStream3.writeShort(length5);
                                    r14.A00.write(A0310, 0, length5);
                                }
                                r14.A00.flush();
                                break;
                            }
                        case 10:
                            if (!(r15 instanceof AnonymousClass0d4)) {
                                assertionError = new AssertionError("Unexpected type: " + r15);
                                break;
                            } else {
                                AnonymousClass0d4 r62 = (AnonymousClass0d4) r15;
                                r62.A02();
                                r14.A00.writeByte(AnonymousClass0WT.A01(r62.A00));
                                int A029 = AnonymousClass0WT.A02(r14.A00, 2) + 1;
                                r14.A00.writeShort(r62.A02().A00);
                                r14.A00.flush();
                                i3 = A029 + 2;
                                break;
                            }
                        case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                            r14.A00.writeByte(AnonymousClass0WT.A01(r6));
                            r14.A00.writeByte(0);
                            r14.A00.flush();
                            break;
                        case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                            r14.A00.writeByte(AnonymousClass0WT.A01(r6));
                            r14.A00.writeByte(0);
                            r14.A00.flush();
                            break;
                        default:
                            AnonymousClass0DB.A0Q("MessageEncoder", new IllegalArgumentException("Unknown message type: " + r5), "send/unexpected; type=%s", r15.A00.A03);
                            break;
                    }
                }
                r13.A0I.A02(r15.A00.A03.name(), str);
            } catch (IOException e) {
                r13.A0I.A02(AnonymousClass000.A0E(r15.A00.A03.name(), "-failed"), str);
                throw e;
            }
        } else {
            throw new IOException("No message encoder");
        }
    }

    public final void A03() {
        Socket socket = this.A05;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this) {
            this.A05 = null;
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
            this.A0I.A00.A0X = AnonymousClass0VP.DISCONNECTED;
        }
        this.A0I.A00();
    }

    public C10410dG(AnonymousClass0UK r2, C07480Tg r3, C08070Vn r4, RealtimeSinceBootClock realtimeSinceBootClock, C10930e7 r6, ScheduledExecutorService scheduledExecutorService, AnonymousClass0VJ r8, AnonymousClass0WZ r9, Context context, AnonymousClass0QT r11, String str) {
        this.A08 = r2;
        this.A07 = r3;
        this.A0A = r4;
        this.A06 = realtimeSinceBootClock;
        this.A0G = r6;
        this.A0E = scheduledExecutorService;
        this.A09 = r8;
        this.A0B = r9;
        this.A0F = context;
        this.A0C = r11;
        this.A0D = str == null ? "android_legacy" : str;
    }

    public final String A02(AnonymousClass0d7 r6) {
        String str = r6.A02().A01;
        String A002 = AnonymousClass0TB.A00(str);
        if (A002 != null) {
            return A002;
        }
        C10390dE r3 = this.A0I;
        String.format((Locale) null, "Failed to decode topic %s", new Object[]{str});
        C10630dc r0 = r3.A00.A0W;
        if (r0 != null) {
            r0.A01((Throwable) null);
        }
        return str;
    }
}
