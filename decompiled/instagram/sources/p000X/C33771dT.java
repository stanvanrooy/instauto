package p000X;

import com.google.common.p003io.Closeables;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.zip.GZIPInputStream;

/* renamed from: X.1dT  reason: invalid class name and case insensitive filesystem */
public final class C33771dT extends AnonymousClass0O9 {
    public final /* synthetic */ C33321cj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33771dT(C33321cj r2) {
        super(561);
        this.A00 = r2;
    }

    public final void run() {
        int i;
        if (this.A00.A0A.compareAndSet(0, 1)) {
            C33321cj r0 = this.A00;
            AnonymousClass1C4 r3 = r0.A06;
            AnonymousClass1CB r2 = r0.A08;
            String str = r0.A09;
            try {
                C33811dX A002 = C15180mT.A05.A00(str, r3.A04.getPath(), r3.hashCode(), true, r0.A07);
                r2.A01(r3, new C33851db(A002.A00, A002.A01, Collections.unmodifiableList(A002.A02)));
                ByteBuffer allocate = ByteBuffer.allocate(4096);
                while (true) {
                    C15180mT r4 = C15180mT.A05;
                    String path = r3.A04.getPath();
                    C33301ch r5 = (C33301ch) r4.A01.get(str);
                    if (r5 != null) {
                        try {
                            C15220mX r1 = r4.A00;
                            if (r5.A04 == null) {
                                AnonymousClass1FY AF0 = r1.AF0(r5.A0A);
                                if (AF0.A01()) {
                                    AnonymousClass1FV r12 = (AnonymousClass1FV) AF0.A00();
                                    r5.A04 = r12;
                                    r5.A06 = new GZIPInputStream(r12);
                                } else {
                                    throw new IOException("Http Response Body file stream not available");
                                }
                            }
                            int read = r5.A06.read(allocate.array());
                            if (read <= 0) {
                                r5.A06.close();
                            } else {
                                allocate.limit(read);
                                allocate.rewind();
                            }
                            if (read <= 0) {
                                r4.A01.remove(str);
                            }
                            if (read <= 0) {
                                r2.A00(r3);
                                break;
                            } else {
                                r2.A03(r3, allocate);
                                allocate.clear();
                            }
                        } catch (IOException e) {
                            Closeables.A01(r5.A06);
                            throw e;
                        } catch (IOException e2) {
                            r4.A01.remove(str);
                            throw e2;
                        }
                    } else {
                        throw new IllegalStateException(AnonymousClass000.A0E("ResponseBody not found when trying to read new buffer of data. Another concurrent request might be accessing it.", path));
                    }
                }
            } catch (IOException e3) {
                r2.A02(r3, e3);
            }
            C33321cj r13 = this.A00;
            C15130mO r32 = r13.A0B.A04;
            if (!(r32 == null || r13.A01 == null)) {
                C256019m r22 = r13.A07;
                String str2 = r22.A03;
                if (r22.A00() == Constants.ONE) {
                    i = 0;
                } else {
                    i = -1;
                    if (r22.A00() == Constants.A0C) {
                        i = 1;
                    }
                }
                C15180mT r14 = C15180mT.A05;
                C33301ch r23 = this.A00.A01;
                C15220mX r15 = r14.A00;
                r32.A02(str2, 0, i, (String) null, r15.ALE(r23.A0C) + r15.ALE(r23.A0A));
            }
        }
        new C33301ch(this.A00.A09).A02(C15180mT.A05.A00);
    }
}
