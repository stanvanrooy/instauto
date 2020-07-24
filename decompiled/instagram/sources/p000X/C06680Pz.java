package p000X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0Pz  reason: invalid class name and case insensitive filesystem */
public final class C06680Pz implements AnonymousClass0VX {
    public C13460iZ A00;
    public int A01 = 0;
    public int A02;
    public File A03;
    public final AnonymousClass0VW A04;
    public final AnonymousClass0VC A05;
    public final C07140Rx A06;

    public final void A2z(C08050Vl r9, AnonymousClass0P4 r10) {
        boolean A0O = this.A00.A0O();
        if (A0O) {
            AnonymousClass0DB.A0D("FileBasedSessionHandler", "JsonGenerator is closed. Potentially out of disk space.");
            AnonymousClass0QD.A01("FileBasedSessionHandler", "JsonGenerator is closed. Potentially out of disk space.");
        }
        if (!A0O) {
            try {
                long length = this.A03.length();
                C13460iZ r0 = this.A00;
                AnonymousClass0W9.A00(r10, r0);
                r0.flush();
                long length2 = this.A03.length() - length;
                if (length2 > 100000) {
                    int floor = (int) Math.floor(Math.log10((double) length2));
                    String A0E = AnonymousClass000.A0E("EventSizeGT10^", Integer.toString(floor));
                    int i = 0;
                    if (floor < 7) {
                        i = 1000;
                    }
                    AnonymousClass0QD.A03(A0E, AnonymousClass000.A0N("Event exceeding 100kb written to disk. name: ", r10.A04, " size: ", Long.toString(length2)), i);
                }
                this.A01++;
            } catch (IOException e) {
                AnonymousClass0DB.A0G("FileBasedSessionHandler", "IOException from addEvent", e);
                AnonymousClass0QD.A05("FileBasedSessionHandler", "IOException from addEvent", e);
            }
        }
    }

    public final List AJH() {
        return new ArrayList();
    }

    public final int AJI() {
        return this.A01;
    }

    public final int AVk() {
        return this.A02;
    }

    public final UUID AVq() {
        return this.A06.A00();
    }

    public final File BXD(C08050Vl r4) {
        boolean A0O = this.A00.A0O();
        if (A0O) {
            AnonymousClass0DB.A0D("FileBasedSessionHandler", "JsonGenerator is closed. Potentially out of disk space.");
            AnonymousClass0QD.A01("FileBasedSessionHandler", "JsonGenerator is closed. Potentially out of disk space.");
        }
        if (!(!A0O)) {
            return null;
        }
        try {
            C13460iZ r0 = this.A00;
            r0.A0P();
            r0.A0Q();
            r0.flush();
            r0.close();
            return this.A05.BYC(this.A03);
        } finally {
            this.A01 = 0;
            this.A02 = this.A06.A01.getAndIncrement();
            A00(r4);
        }
    }

    public C06680Pz(AnonymousClass0VW r2, C07140Rx r3, AnonymousClass0VC r4) {
        this.A04 = r2;
        this.A02 = r3.A01.getAndIncrement();
        this.A05 = r4;
        this.A06 = r3;
    }

    public final void A00(C08050Vl r4) {
        File A002 = this.A04.A00(AnonymousClass0VL.A02(r4));
        this.A03 = A002;
        C13460iZ A022 = C12890hY.A00.A02(A002, Constants.ZERO);
        A022.A0K(C12930hc.AUTO_CLOSE_JSON_CONTENT);
        A022.A0L(C12930hc.FLUSH_PASSED_TO_STREAM);
        this.A00 = A022;
        AnonymousClass0V5.A00(r4, A022);
    }

    public final void Bpt(C08050Vl r4) {
        if (AJI() > 0) {
            try {
                BXD(r4);
            } catch (IOException e) {
                AnonymousClass0DB.A0G("FileBasedSessionHandler", "Failed to startNewBatch", e);
                AnonymousClass0QD.A05("FileBasedSessionHandler", "Failed to startNewBatch", e);
            }
        }
    }
}
