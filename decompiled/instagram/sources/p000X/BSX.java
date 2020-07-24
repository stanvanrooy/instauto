package p000X;

import android.app.Application;
import android.content.Context;
import android.os.Debug;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.debug.memorydump.MemoryDumpCreator;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BSX */
public final class BSX {
    public final Context A00;
    public final AnonymousClass0Jk A01;

    public static void A01(String str, String str2, Throwable th) {
        String A0E;
        if (th == null) {
            AnonymousClass0DB.A0D("MemoryDumper", str2);
        } else {
            AnonymousClass0DB.A0G("MemoryDumper", str2, th);
        }
        if (th == null) {
            A0E = "";
        } else {
            A0E = AnonymousClass000.A0E(" - ", th.getMessage());
        }
        A00("hprof", AnonymousClass000.A0E(str2, A0E));
        AnonymousClass184.A00().A08().A00(AnonymousClass000.A0E("MemoryDumper:", str), str2, th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r4.equals("Leak") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r4.equals("OOM") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r5 <= 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fb, code lost:
        if (r15 == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4.equals("Daily") == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e5 A[Catch:{ IOException -> 0x0225, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0200 A[Catch:{ IOException -> 0x0225, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0219 A[Catch:{ IOException -> 0x0225, all -> 0x022e }] */
    public final void A02(String str) {
        char c;
        boolean A05;
        boolean z;
        boolean z2;
        char c2;
        String str2 = str;
        int hashCode = str2.hashCode();
        if (hashCode == 78445) {
            c = 0;
        } else if (hashCode == 2364291) {
            c = 2;
        } else if (hashCode == 65793529) {
            c = 1;
        }
        c = 65535;
        if (c == 0) {
            A05 = AnonymousClass184.A00().A04().A05();
        } else if (c == 1) {
            A05 = AnonymousClass184.A00().A04().A03();
        } else if (c != 2) {
            A05 = false;
        } else {
            A05 = AnonymousClass184.A00().A04().A04();
        }
        if (A05) {
            C50022Ep.A00();
            try {
                File[] A012 = C191538Gv.A01(this.A00.getFilesDir().getPath(), C191548Gw.A00);
                if (A012 != null) {
                    int length = A012.length;
                    z = true;
                }
                z = false;
                if (z) {
                    if (!AnonymousClass184.A00().A03().A00.A01()) {
                        Context context = this.A00;
                        long millis = TimeUnit.DAYS.toMillis(7);
                        File[] A013 = C191538Gv.A01(context.getFilesDir().getPath(), C191548Gw.A00);
                        if (A013 != null) {
                            z2 = false;
                            for (File file : A013) {
                                if (System.currentTimeMillis() - file.lastModified() > millis) {
                                    file.delete();
                                } else {
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                long maxMemory = Runtime.getRuntime().maxMemory();
                                long A052 = C04120Cm.A01().A05(Constants.ZERO);
                                synchronized (AnonymousClass184.A00()) {
                                }
                                boolean z3 = false;
                                if (A052 > 3 * maxMemory) {
                                    z3 = true;
                                }
                                if (!z3) {
                                    A01("InsufficientSpace", "Not enough free space for dump", (Throwable) null);
                                    return;
                                }
                                boolean equals = str2.equals("Daily");
                                if (equals) {
                                    Runtime.getRuntime().gc();
                                }
                                String path = this.A00.getFilesDir().getPath();
                                A00("hprof", "Started");
                                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%d", AnonymousClass954.A00(), Long.valueOf(C05370Ke.A00.now()));
                                String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("%s/dump_%s.hprof", path, formatStrLocaleSafe);
                                boolean A0H = AnonymousClass0Q7.A03().A0H();
                                boolean A0K = AnonymousClass0Q7.A03().A0K();
                                String str3 = (String) AnonymousClass184.A00().A0H.get();
                                String A03 = AnonymousClass09Q.A03();
                                AnonymousClass0CW.A01(formatStrLocaleSafe);
                                AnonymousClass0CW.A01(str2);
                                if (str2.isEmpty()) {
                                    A01("storeDumpMetadata", "Warning - Throwable .getClass().getName() returned a empty string", (Throwable) null);
                                } else {
                                    C25623BSe bSe = new C25623BSe();
                                    bSe.A02 = formatStrLocaleSafe;
                                    bSe.A01 = str2;
                                    bSe.A00 = Boolean.toString(A0H);
                                    bSe.A08 = Boolean.toString(A0K);
                                    bSe.A05 = String.valueOf(Runtime.getRuntime().maxMemory());
                                    bSe.A03 = formatStrLocaleSafe2;
                                    bSe.A07 = str3;
                                    bSe.A04 = "5";
                                    bSe.A06 = A03;
                                    AnonymousClass184.A00().A09().A00(new C25619BSa(bSe));
                                }
                                AnonymousClass0ZL.A01("MemoryDumper.dumpHprof", -1348149463);
                                Debug.dumpHprofData(formatStrLocaleSafe2);
                                AnonymousClass0ZL.A00(-258781337);
                                A00("hprof", "Success");
                                A00(MemoryDumpCreator.HPROF_ID_KEY, formatStrLocaleSafe);
                                C25630BSl A032 = AnonymousClass184.A00().A03();
                                if (hashCode == 78445) {
                                    c2 = 0;
                                    if (!str2.equals("OOM")) {
                                    }
                                    if (c2 == 0) {
                                    }
                                } else if (hashCode == 2364291) {
                                    c2 = 2;
                                    if (!str2.equals("Leak")) {
                                    }
                                    if (c2 == 0) {
                                        synchronized (AnonymousClass184.A00()) {
                                        }
                                        A032.A00.A00();
                                        return;
                                    } else if (c2 == 1 || c2 == 2) {
                                        A032.A00.A00();
                                        return;
                                    } else {
                                        C50022Ep.A00();
                                        return;
                                    }
                                } else if (hashCode == 65793529) {
                                    c2 = 1;
                                }
                                c2 = 65535;
                                if (c2 == 0) {
                                }
                            } else {
                                return;
                            }
                        }
                    } else if (AnonymousClass184.A00().A03().A00.A02()) {
                        z2 = true;
                        if (!z2) {
                        }
                    } else {
                        C191538Gv.A00(this.A00);
                    }
                }
                z2 = false;
                if (!z2) {
                }
            } catch (IOException e) {
                A01("dumpHprof", "IOException writing dump", e);
            } catch (Throwable th) {
                A01("dumpHprofInternal", "Error writing hprof dump", th);
            }
        }
    }

    public BSX() {
        AnonymousClass0Jk r1;
        Application A012 = AnonymousClass184.A00().A01();
        AnonymousClass184 A002 = AnonymousClass184.A00();
        synchronized (A002) {
            if (A002.A01 == null) {
                AnonymousClass0ZL.A01("MemoryManager.getMemoryDumpMetadataStore", -1842498336);
                A002.A01 = (AnonymousClass0Jk) A002.A0F.get();
                AnonymousClass0ZL.A00(1496156247);
            }
            r1 = A002.A01;
        }
        this.A00 = A012.getApplicationContext();
        this.A01 = r1;
    }

    public static void A00(String str, String str2) {
        AnonymousClass184.A00().A08();
        AnonymousClass0QD.A00().BYg(str, str2);
    }
}
