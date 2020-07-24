package p000X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.0Pl  reason: invalid class name and case insensitive filesystem */
public final class C06540Pl implements AnonymousClass0VX {
    public int A00;
    public final AnonymousClass0VW A01;
    public final AnonymousClass0VK A02;
    public final AnonymousClass0S4 A03;
    public final C07140Rx A04;
    public final AnonymousClass0RQ A05;
    public final List A06 = new ArrayList(50);
    public final boolean A07;

    public final void A2z(C08050Vl r2, AnonymousClass0P4 r3) {
        this.A06.add(r3);
    }

    public final List AJH() {
        return this.A06;
    }

    public final int AJI() {
        return this.A06.size();
    }

    public final int AVk() {
        return this.A00;
    }

    public final UUID AVq() {
        return this.A04.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0200, code lost:
        throw r0;
     */
    public final File BXD(C08050Vl r11) {
        boolean z;
        String str;
        Object[] objArr;
        String str2;
        C46521zt r0;
        OutputStream outputStream;
        String str3;
        C35071fl A002;
        String str4;
        String str5;
        C46521zt r02;
        if (this.A07) {
            AnonymousClass0VK r1 = this.A02;
            Integer num = r11.A04;
            z = true;
            if (r1 != null) {
                if (num == Constants.ZERO) {
                    r02 = r1.A00;
                } else {
                    r02 = r1.A01;
                }
                long A012 = r02.A01();
                str5 = C06360Ot.formatString("_%d_%d", Integer.valueOf((int) (A012 >> 32)), Integer.valueOf((int) (A012 & -1)));
            } else {
                str5 = "";
            }
            objArr = new Object[]{r11.mAnalyticsSessionHandler.AVq().toString(), Integer.valueOf(r11.mAnalyticsSessionHandler.AVk()), AnonymousClass0R8.A00(num), str5, ".batch"};
            str2 = "%s_%d_%s%s%s";
        } else {
            AnonymousClass0VK r12 = this.A02;
            Integer num2 = r11.A04;
            z = true;
            if (r12 != null) {
                if (num2 == Constants.ZERO) {
                    r0 = r12.A00;
                } else {
                    r0 = r12.A01;
                }
                long A013 = r0.A01();
                str = C06360Ot.formatString("_%d_%d", Integer.valueOf((int) (A013 >> 32)), Integer.valueOf((int) (A013 & -1)));
            } else {
                str = "";
            }
            objArr = new Object[]{r11.mAnalyticsSessionHandler.AVq().toString(), Integer.valueOf(r11.mAnalyticsSessionHandler.AVk()), AnonymousClass0R8.A00(num2), str, ".batch", ".gz"};
            str2 = "%s_%d_%s%s%s%s";
        }
        File A003 = this.A01.A00(C06360Ot.formatString(str2, objArr));
        FileOutputStream fileOutputStream = new FileOutputStream(A003);
        if (this.A07) {
            outputStream = fileOutputStream;
        } else {
            outputStream = new DeflaterOutputStream(fileOutputStream, new Deflater(-1, z));
        }
        C13460iZ A042 = C12890hY.A00.A04(outputStream, Constants.ZERO);
        A042.A0T();
        A042.A0F("seq", r11.mAnalyticsSessionHandler.AVk());
        A042.A0H("app_id", r11.A01.A01);
        A042.A0H("app_ver", r11.A01.A02);
        A042.A0H("build_num", r11.A05);
        A042.A0H("device_id", C05860Mt.A02.A05(r11.A02.A00));
        A042.A0H("family_device_id", r11.A03.A00.AZO());
        A042.A0H("session_id", r11.mAnalyticsSessionHandler.AVq().toString());
        if (r11.A06) {
            str3 = "microbatch";
        } else if (r11.A04 == Constants.ONE) {
            str3 = "zero_latency";
        } else {
            str3 = "regular";
        }
        A042.A0H("channel", str3);
        A042.A0H("app_uid", r11.A00.AG5());
        String AID = r11.A00.AID();
        if (AID != null) {
            A042.A0B("claims");
            A042.A0g(AID);
            A042.A0P();
        }
        C06740Qf A004 = C06740Qf.A00();
        if (A004 != null) {
            A042.A0H("config_version", "v2");
            String AG5 = r11.A00.AG5();
            C06730Qe A022 = C06740Qf.A02(A004);
            if (A022 == null) {
                str4 = null;
            } else {
                str4 = A022.A03(AG5);
            }
            A042.A0H("config_checksum", str4);
        }
        A042.A0d("data");
        A042.A0S();
        for (AnonymousClass0P4 A005 : AJH()) {
            AnonymousClass0W9.A00(A005, A042);
        }
        A042.A0P();
        A042.A0H("log_type", "client_event");
        A042.A0Q();
        A042.close();
        fileOutputStream.close();
        AnonymousClass0S4 r13 = this.A03;
        if (this.A05.A0G && (A002 = AnonymousClass0S4.A00(A003.getName())) != null) {
            r13.A00.Bph(A002, (long) A003.getName().hashCode());
        }
        return A003;
    }

    public final void Bpt(C08050Vl r2) {
        if (!this.A06.isEmpty()) {
            this.A06.clear();
            this.A00 = this.A04.A01.getAndIncrement();
        }
    }

    public C06540Pl(AnonymousClass0VW r3, C07140Rx r4, AnonymousClass0RQ r5, AnonymousClass0S4 r6, AnonymousClass0VK r7, boolean z) {
        this.A01 = r3;
        this.A04 = r4;
        this.A00 = r4.A01.getAndIncrement();
        this.A05 = r5;
        this.A03 = r6;
        this.A02 = r7;
        this.A07 = z;
    }
}
