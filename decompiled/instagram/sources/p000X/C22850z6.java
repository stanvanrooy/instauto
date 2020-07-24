package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0z6  reason: invalid class name and case insensitive filesystem */
public final class C22850z6 extends Handler {
    public final /* synthetic */ C22790z0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22850z6(C22790z0 r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0368, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void handleMessage(Message message) {
        long longValue;
        long longValue2;
        String sb;
        boolean z;
        boolean z2;
        int i = message.what;
        switch (i) {
            case 1:
                C35101fo r1 = (C35101fo) message.obj;
                C22790z0 r3 = this.A00;
                String A002 = C22790z0.A00(r1);
                C35071fl r5 = r1.A00;
                Long l = r1.A03;
                if (l == null) {
                    longValue = r3.A03.nextLong();
                } else {
                    longValue = l.longValue();
                }
                long longValue3 = r1.A04.longValue();
                C22790z0.A02(r3);
                C35161fu r12 = (C35161fu) r3.A00.get(A002);
                if (r12 != null) {
                    C22790z0.A03(r3, r12, Constants.A0N, longValue3);
                    r3.A00.remove(A002);
                }
                r3.A00.put(A002, new C35161fu(r5, longValue, longValue3));
                return;
            case 2:
                C35101fo r0 = (C35101fo) message.obj;
                C22790z0 r52 = this.A00;
                String A003 = C22790z0.A00(r0);
                long longValue4 = r0.A04.longValue();
                C22790z0.A02(r52);
                C35161fu r13 = (C35161fu) r52.A00.get(A003);
                if (r13 != null) {
                    r52.A00.remove(A003);
                    C22790z0.A03(r52, r13, Constants.ZERO, longValue4);
                    return;
                }
                return;
            case 3:
                C35101fo r02 = (C35101fo) message.obj;
                C22790z0 r8 = this.A00;
                String A004 = C22790z0.A00(r02);
                String str = r02.A05;
                String str2 = r02.A06;
                C131265jN r10 = r02.A01;
                long longValue5 = r02.A04.longValue();
                C22790z0.A02(r8);
                C35161fu r4 = (C35161fu) r8.A00.get(A004);
                if (r4 != null) {
                    r4.A02.add(new C46501zr(str, (int) (longValue5 - r4.A05), str2, r10));
                    r4.A00 = longValue5;
                    boolean z3 = false;
                    if (r4.A02.size() < 100) {
                        z3 = true;
                    }
                    if (!z3) {
                        C22790z0.A03(r8, r4, Constants.A0Y, System.currentTimeMillis());
                        r8.A00.remove(A004);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C35101fo r03 = (C35101fo) message.obj;
                C22790z0 r53 = this.A00;
                String A005 = C22790z0.A00(r03);
                String str3 = r03.A07;
                long longValue6 = r03.A04.longValue();
                C22790z0.A02(r53);
                C35161fu r14 = (C35161fu) r53.A00.get(A005);
                if (r14 != null && str3 != null) {
                    if (r14.A03 == null) {
                        r14.A03 = new ArrayList();
                    }
                    r14.A03.add(str3);
                    r14.A00 = longValue6;
                    return;
                }
                return;
            case 5:
                C22790z0 r04 = this.A00;
                String A006 = C22790z0.A00((C35101fo) message.obj);
                C22790z0.A02(r04);
                r04.A00.remove(A006);
                return;
            case 6:
                C22790z0 r54 = this.A00;
                C22790z0.A02(r54);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : r54.A00.entrySet()) {
                    C35161fu r7 = (C35161fu) entry.getValue();
                    if (r7.A07.A03) {
                        C22790z0.A03(r54, r7, Constants.A0C, System.currentTimeMillis());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - r7.A00 > ((long) Math.min(r7.A07.A00, 86400)) * 1000) {
                            C22790z0.A03(r54, r7, Constants.ONE, currentTimeMillis);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            C35071fl r15 = r7.A07;
                            if (r15.A01) {
                                C469221n r82 = new C469221n();
                                r82.A04 = r15;
                                r82.A02 = r7.A06;
                                r82.A00 = r7.A04;
                                r82.A01 = r7.A05;
                                r82.A03 = r7.A00;
                                List list = r7.A03;
                                List list2 = list;
                                if (list != null) {
                                    r82.A06 = new ArrayList(list2);
                                }
                                List<C46501zr> list3 = r7.A02;
                                if (list3 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (C46501zr r05 : list3) {
                                        arrayList2.add(new C46501zr(r05.A02, r05.A00, r05.A04, r05.A01));
                                    }
                                    r82.A05 = arrayList2;
                                }
                                C22790z0.A03(r54, new C35161fu(r82), Constants.A0C, System.currentTimeMillis());
                            }
                        }
                    }
                    arrayList.add(entry.getKey());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r54.A00.remove((String) it.next());
                }
                try {
                    C22840z5 r32 = r54.A01;
                    Map map = r54.A00;
                    if (map.isEmpty()) {
                        r32.A00.delete();
                        return;
                    }
                    File createTempFile = File.createTempFile(AnonymousClass000.A0E(r32.A00.getName(), "."), ".tmp", r32.A00.getParentFile());
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile), 1024));
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry2 : map.entrySet()) {
                        dataOutputStream.writeUTF((String) entry2.getKey());
                        C35161fu r72 = (C35161fu) entry2.getValue();
                        dataOutputStream.writeShort(1);
                        dataOutputStream.writeUTF(r72.A07.A04);
                        dataOutputStream.writeShort(2);
                        dataOutputStream.writeLong(r72.A06);
                        dataOutputStream.writeShort(3);
                        dataOutputStream.writeInt(r72.A04);
                        dataOutputStream.writeShort(4);
                        dataOutputStream.writeLong(r72.A05);
                        dataOutputStream.writeShort(5);
                        dataOutputStream.writeLong(r72.A00);
                        List<String> list4 = r72.A03;
                        if (list4 != null) {
                            dataOutputStream.writeShort(6);
                            dataOutputStream.writeInt(list4.size());
                            for (String writeUTF : list4) {
                                dataOutputStream.writeUTF(writeUTF);
                            }
                        }
                        List<C46501zr> list5 = r72.A02;
                        if (list5 != null) {
                            dataOutputStream.writeShort(7);
                            dataOutputStream.writeInt(list5.size());
                            for (C46501zr r83 : list5) {
                                dataOutputStream.writeShort(701);
                                dataOutputStream.writeUTF(r83.A02);
                                dataOutputStream.writeShort(702);
                                dataOutputStream.writeInt(r83.A00);
                                if (r83.A04 != null) {
                                    dataOutputStream.writeShort(703);
                                    dataOutputStream.writeUTF(r83.A04);
                                }
                                if (r83.A01 != null) {
                                    dataOutputStream.writeShort(704);
                                    C131265jN r84 = r83.A01;
                                    synchronized (r84) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append('{');
                                        boolean z4 = true;
                                        for (Map.Entry entry3 : r84.A00.entrySet()) {
                                            if (!z4) {
                                                sb2.append(',');
                                            }
                                            sb2.append('\"');
                                            sb2.append((String) entry3.getKey());
                                            sb2.append('\"');
                                            sb2.append(':');
                                            if (entry3.getValue() instanceof String) {
                                                sb2.append('\"');
                                                sb2.append((String) entry3.getValue());
                                                sb2.append('\"');
                                            } else {
                                                sb2.append(entry3.getValue());
                                            }
                                            z4 = false;
                                        }
                                        sb2.append('}');
                                        sb = sb2.toString();
                                    }
                                    dataOutputStream.writeUTF(sb);
                                } else if (r83.A03 != null) {
                                    dataOutputStream.writeShort(704);
                                    dataOutputStream.writeUTF(r83.A03);
                                }
                                dataOutputStream.writeShort(705);
                            }
                            continue;
                        }
                        dataOutputStream.writeShort(9);
                    }
                    dataOutputStream.close();
                    synchronized (r32) {
                        try {
                            if (!createTempFile.renameTo(r32.A00)) {
                                createTempFile.delete();
                                throw new IOException("Failed to replace the current preference file!");
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    map.size();
                    return;
                } catch (IOException e) {
                    AnonymousClass0DB.A0O("FunnelLoggerImpl", e, "Failed to save funnels!");
                    return;
                }
            case 7:
                C35101fo r33 = (C35101fo) message.obj;
                C22790z0 r2 = this.A00;
                String A007 = C22790z0.A00(r33);
                C35071fl r42 = r33.A00;
                Long l2 = r33.A03;
                if (l2 == null) {
                    longValue2 = r2.A03.nextLong();
                } else {
                    longValue2 = l2.longValue();
                }
                long longValue7 = r33.A04.longValue();
                if (r42.A02) {
                    C22790z0.A02(r2);
                    if (!r2.A00.containsKey(A007)) {
                        r2.A00.put(A007, new C35161fu(r42, longValue2, longValue7));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Must enable noop funnels in the FunnelDefinition to use startFunnelIfNotStarted()");
            case 8:
                C35101fo r06 = (C35101fo) message.obj;
                C22790z0 r55 = this.A00;
                String A008 = C22790z0.A00(r06);
                C131265jN r34 = r06.A02;
                long longValue8 = r06.A04.longValue();
                C22790z0.A02(r55);
                C35161fu r07 = (C35161fu) r55.A00.get(A008);
                if (r07 != null) {
                    r07.A00 = longValue8;
                    r07.A01 = r34;
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A05("Unknown what=", i));
        }
    }
}
