package p000X;

import android.view.Choreographer;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.modules.core.JSTimers;
import com.facebook.systrace.Systrace;
import java.util.ArrayDeque;

/* renamed from: X.ACP */
public abstract class ACP {
    public Choreographer.FrameCallback A00;

    public void A00(long j) {
        short s;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j2 = j;
        if (this instanceof C23185ABn) {
            C23185ABn aBn = (C23185ABn) this;
            C23185ABn aBn2 = aBn;
            C228039ra.A00();
            if (aBn.A00) {
                aBn2.A01 = false;
            } else {
                AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
                ACK.A06.A01(Constants.A0N, aBn2.A02.A06);
            }
            AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ScheduleDispatchFrameCallback", 73730556);
            try {
                C23184ABm aBm = aBn2.A02;
                synchronized (aBm.A07) {
                    synchronized (aBm.A08) {
                        for (int i = 0; i < aBm.A09.size(); i++) {
                            C23091A6e a6e = (C23091A6e) aBm.A09.get(i);
                            if (!a6e.A06()) {
                                C23184ABm.A01(aBm, a6e);
                            } else {
                                int i2 = a6e.A01;
                                String A01 = a6e.A01();
                                short A02 = a6e.A02();
                                Short sh = (Short) aBm.A0B.get(A01);
                                if (sh != null) {
                                    s = sh.shortValue();
                                } else {
                                    s = aBm.A01;
                                    aBm.A01 = (short) (s + 1);
                                    aBm.A0B.put(A01, Short.valueOf(s));
                                }
                                long j3 = ((((long) s) & 65535) << 32) | ((long) i2) | ((((long) A02) & 65535) << 48);
                                Integer num = (Integer) aBm.A03.get(j3);
                                C23091A6e a6e2 = null;
                                if (num == null) {
                                    aBm.A03.put(j3, Integer.valueOf(aBm.A00));
                                } else {
                                    C23091A6e[] a6eArr = aBm.A02;
                                    int intValue = num.intValue();
                                    C23091A6e a6e3 = a6eArr[intValue];
                                    C23091A6e a6e4 = a6e3;
                                    if (a6e.A02 >= a6e3.A02) {
                                        a6e4 = a6e;
                                    }
                                    if (a6e4 != a6e3) {
                                        aBm.A03.put(j3, Integer.valueOf(aBm.A00));
                                        aBm.A02[intValue] = null;
                                        a6e2 = a6e3;
                                        a6e = a6e4;
                                    } else {
                                        a6e2 = a6e;
                                        a6e = null;
                                    }
                                }
                                if (a6e != null) {
                                    C23184ABm.A01(aBm, a6e);
                                }
                                if (a6e2 != null) {
                                    a6e2.A03 = false;
                                    a6e2.A03();
                                }
                            }
                        }
                    }
                    aBm.A09.clear();
                }
                if (!aBn2.A02.A0F) {
                    aBn2.A02.A0F = true;
                    Systrace.A04(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ScheduleDispatchFrameCallback", aBn2.A02.A0C.get());
                    C23184ABm aBm2 = aBn2.A02;
                    A44 a44 = aBm2.A04;
                    C23186ABp aBp = aBm2.A05;
                    MessageQueueThread messageQueueThread = a44.A03;
                    AnonymousClass0FY.A00(messageQueueThread);
                    messageQueueThread.runOnQueue(aBp);
                }
            } finally {
                AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1327842485);
            }
        } else if (this instanceof A93) {
            A93 a93 = (A93) this;
            try {
                a93.A01(j2);
            } catch (RuntimeException e) {
                a93.A00.A08(e);
            }
        } else if (this instanceof ACD) {
            ACD acd = (ACD) this;
            if (!acd.A09) {
                if (acd.A04 == -1) {
                    acd.A04 = j2;
                }
                long j4 = acd.A05;
                acd.A05 = j2;
                ACE ace = acd.A0B;
                synchronized (ace) {
                    ACF acf = ace.A03;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= acf.A00) {
                            z = false;
                            break;
                        }
                        long A002 = acf.A00(i3);
                        if (A002 >= j4 && A002 < j) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    ACF acf2 = ace.A01;
                    long j5 = -1;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= acf2.A00) {
                            break;
                        }
                        long A003 = acf2.A00(i4);
                        if (A003 >= j4 && A003 < j) {
                            j5 = A003;
                        } else if (A003 >= j) {
                            break;
                        }
                        i4++;
                    }
                    ACF acf3 = ace.A00;
                    long j6 = -1;
                    for (int i5 = 0; i5 < acf3.A00; i5++) {
                        long A004 = acf3.A00(i5);
                        if (A004 >= j4 && A004 < j) {
                            j6 = A004;
                        } else if (A004 >= j) {
                            break;
                        }
                    }
                    if (j5 == -1 && j6 == -1) {
                        z2 = ace.A04;
                    } else {
                        z2 = false;
                        if (j5 > j6) {
                            z2 = true;
                        }
                    }
                    z3 = true;
                    if (!z) {
                        if (z2) {
                            ACF acf4 = ace.A02;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= acf4.A00) {
                                    z4 = false;
                                    break;
                                }
                                long A005 = acf4.A00(i6);
                                if (A005 >= j4 && A005 < j) {
                                    z4 = true;
                                    break;
                                }
                                i6++;
                            }
                            if (!z4) {
                            }
                        }
                        z3 = false;
                    }
                    ACE.A00(ace.A01, j2);
                    ACE.A00(ace.A00, j2);
                    ACE.A00(ace.A02, j2);
                    ACE.A00(ace.A03, j2);
                    ace.A04 = z2;
                }
                if (z3) {
                    acd.A03++;
                }
                acd.A02++;
                int i7 = (int) ((((double) (((int) (((double) acd.A05) - ((double) acd.A04))) / DexStore.MS_IN_NS)) / 16.9d) + 1.0d);
                if ((i7 - acd.A01) - 1 >= 4) {
                    acd.A00++;
                }
                if (acd.A08) {
                    AnonymousClass0FY.A00(acd.A07);
                    int i8 = acd.A02 - 1;
                    int i9 = acd.A03 - 1;
                    long j7 = acd.A05;
                    long j8 = acd.A04;
                    acd.A07.put(Long.valueOf(System.currentTimeMillis()), new ACH(i8, i9, i7, j7 == j8 ? 0.0d : (((double) i8) * 1.0E9d) / ((double) (j7 - j8)), j7 == j8 ? 0.0d : (((double) i9) * 1.0E9d) / ((double) (j7 - j8)), ((int) (((double) j7) - ((double) j8))) / DexStore.MS_IN_NS));
                }
                acd.A01 = i7;
                ACJ acj = acd.A06;
                if (acj != null) {
                    acj.A00(acd);
                }
            }
        } else if (this instanceof ACL) {
            ACL acl = (ACL) this;
            synchronized (acl.A00.A03) {
                try {
                    acl.A00.A01 = false;
                    int i10 = 0;
                    while (true) {
                        ACK ack = acl.A00;
                        ArrayDeque[] arrayDequeArr = ack.A04;
                        if (i10 < arrayDequeArr.length) {
                            ArrayDeque arrayDeque = arrayDequeArr[i10];
                            int size = arrayDeque.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                ACP acp = (ACP) arrayDeque.pollFirst();
                                if (acp != null) {
                                    acp.A00(j2);
                                    ACK ack2 = acl.A00;
                                    ack2.A00--;
                                } else {
                                    AnonymousClass0CH.A06("ReactNative", "Tried to execute non-existent frame callback");
                                }
                            }
                            i10++;
                        } else {
                            ACK.A00(ack);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } else if (!(this instanceof AGD)) {
            AGE age = (AGE) this;
            if (!age.A00.A0E.get() || age.A00.A0F.get()) {
                AGF agf = age.A00.A00;
                if (agf != null) {
                    agf.A01 = true;
                }
                AGC agc = age.A00;
                agc.A00 = new AGF(agc, j2);
                AGC agc2 = age.A00;
                A44 a442 = agc2.A05;
                AGF agf2 = agc2.A00;
                MessageQueueThread messageQueueThread2 = a442.A03;
                AnonymousClass0FY.A00(messageQueueThread2);
                messageQueueThread2.runOnQueue(agf2);
                age.A00.A09.A01(Constants.A0Y, age);
            }
        } else {
            AGD agd = (AGD) this;
            if (!agd.A01.A0E.get() || agd.A01.A0F.get()) {
                long j9 = j / 1000000;
                synchronized (agd.A01.A0C) {
                    while (!agd.A01.A0D.isEmpty() && ((AGJ) agd.A01.A0D.peek()).A00 < j9) {
                        try {
                            AGJ agj = (AGJ) agd.A01.A0D.poll();
                            if (agd.A00 == null) {
                                agd.A00 = new WritableNativeArray();
                            }
                            agd.A00.pushInt(agj.A01);
                            if (agj.A03) {
                                agj.A00 = ((long) agj.A02) + j9;
                                agd.A01.A0D.add(agj);
                            } else {
                                agd.A01.A04.remove(agj.A01);
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                }
                C206608tl r2 = agd.A00;
                if (r2 != null) {
                    A44 reactApplicationContextIfActiveOrWarn = agd.A01.A0A.A00.getReactApplicationContextIfActiveOrWarn();
                    if (reactApplicationContextIfActiveOrWarn != null) {
                        ((JSTimers) reactApplicationContextIfActiveOrWarn.A01(JSTimers.class)).callTimers(r2);
                    }
                    agd.A00 = null;
                }
                agd.A01.A09.A01(Constants.A0N, agd);
            }
        }
    }
}
