package p000X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.C03 */
public final class C03 extends C17920r1 {
    public final /* synthetic */ AnonymousClass1DP A00;
    public final /* synthetic */ boolean A01;

    public C03(AnonymousClass1DP r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onFail(C43791v5 r7) {
        int A03 = AnonymousClass0Z0.A03(-1475920108);
        if (this.A01) {
            AnonymousClass1DP r4 = this.A00;
            AnonymousClass1DP.A02(r4, ((long) r4.A01.AYV().A01) * 1000);
        }
        AnonymousClass0Z0.A0A(128249114, A03);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:47|(2:49|50)|51|52) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x013c */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8 A[SYNTHETIC, Splitter:B:36:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd A[SYNTHETIC, Splitter:B:40:0x00cd] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-103006889);
        int A032 = AnonymousClass0Z0.A03(1792405440);
        C3S c3s = ((C27220C2s) obj).A00;
        if (c3s == null) {
            AnonymousClass0QD.A01(this.A00.A0E, "zero cms native object is null because we haven't changed since last time");
        } else {
            AnonymousClass1DP r8 = this.A00;
            r8.A00 = r8.A01.AYV().A00;
            r8.A07 = C15300mf.A03().toString();
            r8.A05 = c3s.A00;
            ListIterator listIterator = c3s.A01.listIterator();
            HashMap hashMap = new HashMap();
            while (listIterator.hasNext()) {
                C3T c3t = (C3T) listIterator.next();
                hashMap.put(c3t.A01, c3t.A00);
            }
            r8.A08 = hashMap;
            C02 c02 = new C02();
            try {
                Map map = r8.A08;
                BZS bzs = new BZS(C12900hZ.A01());
                C13460iZ A05 = c02.A07.A05(bzs);
                C27191C0q c0q = c02.A01;
                if (c0q.A06(C15.INDENT_OUTPUT)) {
                    A05.A0J();
                }
                if (!c0q.A06(C15.CLOSE_CLOSEABLE) || !(map instanceof Closeable)) {
                    try {
                        c02.A03.A0G(c0q, c02.A04).A0H(A05, map);
                        A05.close();
                    } catch (Throwable th) {
                        th = th;
                        if (1 == 0) {
                            A05.close();
                        }
                        throw th;
                    }
                } else {
                    Closeable closeable = (Closeable) map;
                    C13460iZ r2 = null;
                    try {
                        c02.A03.A0G(c0q, c02.A04).A0H(A05, map);
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = A05;
                        if (r2 != null) {
                            try {
                                r2.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (closeable != null) {
                            closeable.close();
                        }
                        throw th;
                    }
                    try {
                        A05.close();
                        try {
                            closeable.close();
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (r2 != null) {
                        }
                        if (closeable != null) {
                        }
                        throw th;
                    }
                }
                String A052 = bzs.A00.A05();
                bzs.A00.A06();
                r8.A02.A00.edit().putInt("cms_client_hash", r8.A00).apply();
                r8.A02.A00.edit().putString("zero_cms_locale", r8.A07).apply();
                r8.A02.A00.edit().putString("cms_client_hash", r8.A05).apply();
                r8.A02.A00.edit().putString("zero_cms_data", A052).apply();
            } catch (C45371xl e) {
                throw e;
            } catch (IOException e2) {
                throw new C27125Bya(AnonymousClass000.A0N("Unexpected IOException (of type ", e2.getClass().getName(), "): ", e2.getMessage()), (C116574zW) null, e2);
            } catch (C45371xl e3) {
                AnonymousClass0QD.A05(r8.A0E, "Error while serializing cms data", e3);
            }
        }
        if (this.A01) {
            AnonymousClass1DP r4 = this.A00;
            AnonymousClass1DP.A02(r4, ((long) r4.A01.AYV().A01) * 1000);
        }
        AnonymousClass0Z0.A0A(1536189170, A032);
        AnonymousClass0Z0.A0A(-1730059436, A03);
    }
}
