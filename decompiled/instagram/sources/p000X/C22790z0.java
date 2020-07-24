package p000X;

import android.os.HandlerThread;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0z0  reason: invalid class name and case insensitive filesystem */
public final class C22790z0 implements C22800z1 {
    public Map A00 = new HashMap();
    public final C22840z5 A01;
    public final C22850z6 A02;
    public final Random A03;
    public final C22820z3 A04;
    public final C22810z2 A05;
    public volatile boolean A06 = false;

    public final synchronized void A39(C35071fl r5, long j, C131265jN r8) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A03 = Long.valueOf(j);
        r3.A02 = r8;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(8, r2));
    }

    public final synchronized void A3A(C35071fl r5, C131265jN r6) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A02 = r6;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(8, r2));
    }

    public final synchronized void A3B(C35071fl r5, long j, String str) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A03 = Long.valueOf(j);
        r3.A07 = str;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(4, r2));
    }

    public final synchronized void A3C(C35071fl r5, String str) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A07 = str;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(4, r2));
    }

    public final synchronized void A5H(C35071fl r8, long j, String str) {
        A5L(r8, j, str, (String) null, (C131265jN) null);
    }

    public final synchronized void A5I(C35071fl r2, String str) {
        A5M(r2, str, (String) null, (C131265jN) null);
    }

    public final synchronized void A5J(C35071fl r8, long j, String str, String str2) {
        A5L(r8, j, str, str2, (C131265jN) null);
    }

    public final synchronized void A5K(C35071fl r2, String str, String str2) {
        A5M(r2, str, str2, (C131265jN) null);
    }

    public final synchronized void A5L(C35071fl r6, long j, String str, String str2, C131265jN r11) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            A01(r6);
            C35091fn r3 = new C35091fn();
            r3.A00 = r6;
            r3.A03 = Long.valueOf(j);
            r3.A05 = str;
            r3.A06 = str2;
            r3.A01 = r11;
            r3.A00(currentTimeMillis);
            C35101fo r2 = new C35101fo(r3);
            C22850z6 r1 = this.A02;
            AnonymousClass0ZA.A0D(r1, r1.obtainMessage(3, r2));
        }
    }

    public final synchronized void A5M(C35071fl r5, String str, String str2, C131265jN r8) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A05 = str;
        r3.A06 = str2;
        r3.A01 = r8;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(3, r2));
    }

    public final synchronized void A81(C35071fl r4) {
        A01(r4);
        C35091fn r0 = new C35091fn();
        r0.A00 = r4;
        C35101fo r2 = new C35101fo(r0);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(5, r2));
    }

    public final synchronized void A82(C35071fl r4, long j) {
        A01(r4);
        C35091fn r1 = new C35091fn();
        r1.A00 = r4;
        r1.A03 = Long.valueOf(j);
        C35101fo r2 = new C35101fo(r1);
        C22850z6 r12 = this.A02;
        AnonymousClass0ZA.A0D(r12, r12.obtainMessage(5, r2));
    }

    public final synchronized void ADB(C35071fl r5) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(2, r2));
    }

    public final synchronized void ADC(C35071fl r6, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            A01(r6);
            C35091fn r1 = new C35091fn();
            r1.A00 = r6;
            r1.A03 = Long.valueOf(j);
            r1.A00(currentTimeMillis);
            C35101fo r2 = new C35101fo(r1);
            C22850z6 r12 = this.A02;
            AnonymousClass0ZA.A0D(r12, r12.obtainMessage(2, r2));
        }
    }

    public final synchronized void Bpg(C35071fl r5) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(1, r2));
    }

    public final synchronized void Bph(C35071fl r5, long j) {
        A01(r5);
        C35091fn r3 = new C35091fn();
        r3.A00 = r5;
        r3.A03 = Long.valueOf(j);
        r3.A00(System.currentTimeMillis());
        C35101fo r2 = new C35101fo(r3);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(1, r2));
    }

    public final synchronized void Bpi(C35071fl r3) {
        Bpj(r3, this.A03.nextLong());
    }

    public final synchronized void Bpj(C35071fl r6, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            A01(r6);
            C35091fn r1 = new C35091fn();
            r1.A00 = r6;
            r1.A03 = Long.valueOf(j);
            r1.A00(currentTimeMillis);
            C35101fo r2 = new C35101fo(r1);
            C22850z6 r12 = this.A02;
            AnonymousClass0ZA.A0D(r12, r12.obtainMessage(7, r2));
        }
    }

    public static String A00(C35101fo r3) {
        Long l = r3.A03;
        if (l == null) {
            return r3.A00.A04;
        }
        C35071fl r0 = r3.A00;
        long longValue = l.longValue();
        return r0.A04 + ":" + longValue;
    }

    public static void A01(C35071fl r1) {
        if (r1 == null) {
            throw new IllegalArgumentException("FunnelDefinition is null, expecting non-null value");
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0155, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        p000X.AnonymousClass0DB.A0O("FunnelLoggerImpl", r2, "Failed to load funnels");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0161, code lost:
        r8.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0163, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public static void A02(C22790z0 r20) {
        HashMap hashMap;
        C22790z0 r8 = r20;
        if (!r8.A06) {
            C22840z5 r9 = r8.A01;
            synchronized (r9) {
                hashMap = new HashMap();
                if (r9.A00.exists()) {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(r9.A00), 1024));
                    try {
                        byte readByte = dataInputStream.readByte();
                        if (readByte != 1) {
                            AnonymousClass0DB.A0J("FunnelBackupStorageFileImpl", "Expected version %d, found version %d", (byte) 1, Byte.valueOf(readByte));
                            dataInputStream.close();
                        } else {
                            int readInt = dataInputStream.readInt();
                            for (int i = 0; i < readInt; i++) {
                                String readUTF = dataInputStream.readUTF();
                                C469221n r18 = new C469221n();
                                boolean z = false;
                                while (!z) {
                                    short readShort = dataInputStream.readShort();
                                    switch (readShort) {
                                        case 1:
                                            r18.A04 = C35061fk.A00(dataInputStream.readUTF());
                                            break;
                                        case 2:
                                            r18.A02 = dataInputStream.readLong();
                                            break;
                                        case 3:
                                            r18.A00 = dataInputStream.readInt();
                                            break;
                                        case 4:
                                            r18.A01 = dataInputStream.readLong();
                                            break;
                                        case 5:
                                            r18.A03 = dataInputStream.readLong();
                                            break;
                                        case 6:
                                            int readInt2 = dataInputStream.readInt();
                                            ArrayList arrayList = new ArrayList(readInt2);
                                            for (int i2 = 0; i2 < readInt2; i2++) {
                                                arrayList.add(dataInputStream.readUTF());
                                            }
                                            r18.A06 = arrayList;
                                            break;
                                        case 7:
                                            int readInt3 = dataInputStream.readInt();
                                            ArrayList arrayList2 = new ArrayList(readInt3);
                                            for (int i3 = 0; i3 < readInt3; i3++) {
                                                boolean z2 = false;
                                                String str = null;
                                                String str2 = null;
                                                String str3 = null;
                                                int i4 = 0;
                                                while (!z2) {
                                                    short readShort2 = dataInputStream.readShort();
                                                    switch (readShort2) {
                                                        case 701:
                                                            str = dataInputStream.readUTF();
                                                            break;
                                                        case 702:
                                                            i4 = dataInputStream.readInt();
                                                            break;
                                                        case 703:
                                                            str2 = dataInputStream.readUTF();
                                                            break;
                                                        case 704:
                                                            str3 = dataInputStream.readUTF();
                                                            break;
                                                        case 705:
                                                            z2 = true;
                                                            break;
                                                        default:
                                                            throw new IllegalStateException(AnonymousClass000.A06("Unsupported type ", readShort2, " while loading funnels"));
                                                    }
                                                }
                                                arrayList2.add(new C46501zr(str, i4, str2, str3));
                                            }
                                            r18.A05 = arrayList2;
                                            break;
                                        case 9:
                                            z = true;
                                            break;
                                        default:
                                            throw new IllegalStateException(AnonymousClass000.A06("Unsupported type ", readShort, " while loading funnels"));
                                    }
                                }
                                C35161fu r1 = new C35161fu(r18);
                                if (r1.A07 != null) {
                                    hashMap.put(readUTF, r1);
                                } else {
                                    AnonymousClass0DB.A0L("FunnelBackupStorageFileImpl", "Parsed funnel instance with null FunnelDefinition for key: %s", readUTF);
                                }
                            }
                            dataInputStream.close();
                            hashMap.size();
                        }
                    } catch (Throwable th) {
                        dataInputStream.close();
                        throw th;
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                r8.A00 = hashMap;
            }
            r8.A06 = true;
        }
    }

    public static void A03(C22790z0 r8, C35161fu r9, Integer num, long j) {
        String str;
        int i = (int) (j - r9.A05);
        switch (num.intValue()) {
            case 1:
                str = "timeout";
                break;
            case 2:
                str = "session_end";
                break;
            case 3:
                str = "restart";
                break;
            case 4:
                str = "actions_full";
                break;
            default:
                str = "explicit";
                break;
        }
        r9.A02.add(new C46501zr("funnel_end", i, str, (C131265jN) null));
        r9.A00 = j;
        C22810z2 r4 = r8.A05;
        C06170Oa A002 = C06170Oa.A00();
        for (C46501zr r6 : r9.A02) {
            C06270Ok A003 = C06270Ok.A00();
            A003.A09("name", r6.A02);
            A003.A07("relative_time", Integer.valueOf(r6.A00));
            A003.A09(B5B.INTENT_PARAM_TAG, r6.A04);
            C131265jN r0 = r6.A01;
            if (r0 != null) {
                A003.A03(IgReactPurchaseExperienceBridgeModule.RN_AUTH_PTT_DATA_PAYLOAD_KEY, C22810z2.A00(r0));
            } else {
                String str2 = r6.A03;
                if (str2 != null) {
                    A003.A09(IgReactPurchaseExperienceBridgeModule.RN_AUTH_PTT_DATA_PAYLOAD_KEY, str2);
                }
            }
            A002.A00.add(A003);
        }
        AnonymousClass0P4 A004 = AnonymousClass0P4.A00("ig_funnel_analytics", (AnonymousClass0RN) null);
        A004.A0G("name", r9.A07.A04);
        A004.A0E("funnel_id", Integer.valueOf(r9.A07.A05));
        A004.A0F("instance_id", Long.valueOf(r9.A06));
        A004.A0E("sampling_rate", Integer.valueOf(r9.A04));
        A004.A0F(TraceFieldType.StartTime, Long.valueOf(r9.A05));
        A004.A0A("pseudo_end", Boolean.valueOf(r9.A07.A01));
        A004.A09("actions", A002);
        A004.A0G("app_device_id", C05860Mt.A02.A04());
        List list = r9.A03;
        List list2 = list;
        if (list != null) {
            A004.A0I("tags", list2);
        }
        C131265jN r02 = r9.A01;
        if (r02 != null) {
            A004.A08(IgReactPurchaseExperienceBridgeModule.RN_AUTH_PTT_DATA_PAYLOAD_KEY, C22810z2.A00(r02));
        }
        AnonymousClass0WN.A01(r4.A00).BcG(A004);
    }

    public C22790z0(C22810z2 r5, C22820z3 r6, C22830z4 r7, C22840z5 r8) {
        this.A05 = r5;
        this.A04 = r6;
        this.A03 = new Random();
        if (r7.A00 == null) {
            HandlerThread handlerThread = new HandlerThread("funnellogger-worker", 10);
            handlerThread.start();
            r7.A00 = handlerThread.getLooper();
        }
        this.A02 = new C22850z6(this, r7.A00);
        this.A01 = r8;
    }

    public final void A5N(C35071fl r4, String str, String str2, C131265jN r7, long j) {
        A01(r4);
        C35091fn r0 = new C35091fn();
        r0.A00 = r4;
        r0.A05 = str;
        r0.A06 = str2;
        r0.A01 = r7;
        r0.A00(j);
        C35101fo r2 = new C35101fo(r0);
        C22850z6 r1 = this.A02;
        AnonymousClass0ZA.A0D(r1, r1.obtainMessage(3, r2));
    }
}
