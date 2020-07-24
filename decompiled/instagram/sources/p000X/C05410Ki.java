package p000X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ki  reason: invalid class name and case insensitive filesystem */
public final class C05410Ki {
    public static final Class A00 = C05410Ki.class;

    /* JADX WARNING: Can't wrap try/catch for region: R(33:37|38|39|(1:41)(2:42|(1:44)(2:45|(1:47)))|48|(1:50)(2:54|(1:56)(2:57|(1:59)))|(8:53|60|61|(1:65)|66|(1:68)|69|(1:71)(2:72|73))|74|75|(1:77)|78|(3:81|(1:83)|84)|85|(3:88|(1:90)|91)|92|(5:94|95|96|97|106)|107|(1:109)(1:110)|111|(1:113)(1:114)|115|(1:117)|(11:(1:(0))|122|123|125|(1:127)(1:131)|128|(9:130|132|133|134|135|136|137|(1:139)|(1:141)(1:142))|155|(4:157|158|163|(2:164|183))|165|166)|124|123|125|(0)(0)|128|(0)|155|(0)|165|166) */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02cd, code lost:
        if (r13 > 0) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x033b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x036d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x033f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x0371 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x01bf */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0296 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0298 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029e A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a0 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a6 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02c9 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02dd A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f0 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f1 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x034a A[SYNTHETIC, Splitter:B:157:0x034a] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c3 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0202 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234 A[Catch:{ all -> 0x034e }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0277 A[SYNTHETIC, Splitter:B:94:0x0277] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:173:0x0371=Splitter:B:173:0x0371, B:165:0x0367=Splitter:B:165:0x0367} */
    public static synchronized void A00(Context context, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        AnonymousClass0G1 A02;
        synchronized (C05410Ki.class) {
            try {
                AnonymousClass0Ft r2 = new AnonymousClass0Ft();
                int i5 = 0;
                if (z) {
                    i5 = 2;
                }
                String name = C04920Gu.class.getName();
                Context context2 = context;
                boolean z3 = false;
                if ((context2.getApplicationInfo().flags & 2) != 0) {
                    z3 = true;
                }
                C09250aw.A0E = z3;
                C09250aw r1 = new C09250aw();
                C09250aw.A0B = r1;
                AnonymousClass0Bi.A03(r1, -100000);
                C09250aw.A07 = i5;
                int i6 = r2.A01;
                if (i6 > 0) {
                    C09250aw.A00 = i6;
                }
                int i7 = r2.A00;
                if (i7 > 0) {
                    C09250aw.A04 = i7;
                }
                if (C09250aw.A0E) {
                    Locale locale = Locale.US;
                    String.format(locale, "initializing CMIYC, flags = 0x%08x", new Object[]{Integer.valueOf(i5)});
                    String.format(locale, "instacrash config l1 %d l2 %d l3 %d interval %d", new Object[]{Integer.valueOf(C09250aw.A00), 5, 10, Integer.valueOf(C09250aw.A04)});
                }
                if (AnonymousClass0BV.A01) {
                    C09250aw.A01 = 3;
                    C09250aw.A02 = 5;
                    C09250aw.A03 = 7;
                }
                File file = new File(context2.getApplicationInfo().dataDir, "crash_log");
                String str = context2.getApplicationInfo().sourceDir;
                C09250aw.A08 = System.currentTimeMillis();
                long lastModified = new File(str).lastModified();
                long j = C09250aw.A08 - lastModified;
                if (file.exists() && file.lastModified() < lastModified) {
                    AnonymousClass0G0.A01(context2, false);
                    if (!file.delete()) {
                        Log.e("CatchMeIfYouCan", "unable to delete stale crash log file: " + file);
                    }
                }
                File file2 = new File(context2.getApplicationInfo().dataDir, "insta_crash_log");
                if (file2.exists() && file2.lastModified() < lastModified) {
                    AnonymousClass0G0.A01(context2, true);
                    if (!file2.delete()) {
                        Log.e("CatchMeIfYouCan", "could not delete insta crash log file: " + file2);
                    }
                }
                C09250aw.A09 = new AnonymousClass0Bd(context2, file);
                C09250aw.A0A = new AnonymousClass0Bd(context2, file2);
                if ((i5 & 2) != 0) {
                    Executors.newScheduledThreadPool(1).schedule(new AnonymousClass0Fr(name, context2), (long) C09250aw.A04, TimeUnit.MILLISECONDS);
                    long j2 = j;
                    C08590Xr r22 = new C08590Xr(new File(context2.getApplicationInfo().dataDir, "crash_lock"));
                    int A002 = C09250aw.A09.A00();
                    C09250aw.A05 = A002;
                    if (A002 >= C09250aw.A03) {
                        i = 3;
                    } else if (A002 >= C09250aw.A02) {
                        i = 2;
                    } else {
                        i = 0;
                        if (A002 >= C09250aw.A01) {
                            i = 1;
                        }
                    }
                    int A003 = C09250aw.A0A.A00();
                    C09250aw.A06 = A003;
                    if (A003 >= 10) {
                        i2 = 3;
                    } else if (A003 >= 5) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                        if (A003 >= C09250aw.A00) {
                            i2 = 1;
                        }
                    }
                    if (i2 > 1 || i > 1) {
                        File file3 = new File(context2.getApplicationInfo().dataDir, "ditto");
                        if (file3.exists() && !file3.isDirectory()) {
                            file3.delete();
                        }
                        if (!file3.exists()) {
                            file3.mkdir();
                        }
                        if (file3.isDirectory()) {
                            new File(file3, AnonymousClass0YV.A00).createNewFile();
                        } else {
                            throw new RuntimeException("could not create ditto directory");
                        }
                    }
                    if (C09250aw.A0E) {
                        String.format(Locale.US, "found %d crashes / level %d, %d insta crashes / level %d in last %d seconds", new Object[]{Integer.valueOf(C09250aw.A05), Integer.valueOf(i), Integer.valueOf(C09250aw.A06), Integer.valueOf(i2), 14400});
                    }
                    if (j < 86400000 && i > 1) {
                        if (C09250aw.A0E) {
                            String.format(Locale.US, "capping remedy level at 1 (wanted %d) because APK is too new (current age %ss: minimum age for aggressive crash mitigation is %ss)", new Object[]{Integer.valueOf(i), Double.valueOf(((double) j2) / 1.0E9d), Double.valueOf(0.0864d)});
                        }
                        i = 1;
                    }
                    if (j < 3600000 && i2 > 1) {
                        if (C09250aw.A0E) {
                            String.format(Locale.US, "capping insta crash remedy level at 1 (wanted %d) because APK is too new (current age %ss: minimum age for aggressive crash mitigation is %ss)", new Object[]{Integer.valueOf(i2), Double.valueOf(((double) j2) / 1.0E9d), Double.valueOf(0.0036d)});
                        }
                        i2 = 1;
                    }
                    String str2 = context2.getApplicationInfo().dataDir;
                    long currentTimeMillis = System.currentTimeMillis();
                    C09250aw.A02(context2, currentTimeMillis, false);
                    C09250aw.A02(context2, currentTimeMillis, true);
                    File file4 = new File(str2, "app_was_disabled");
                    if (file4.exists()) {
                        try {
                            AnonymousClass0Fx.A01(new AnonymousClass0Fx(context2), 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (RuntimeException e2) {
                            Log.e("CatchMeIfYouCan", "unable to reset crash loop", e2);
                        }
                        file4.delete();
                    }
                    AnonymousClass0G0 r5 = C09250aw.A0D;
                    if (r5 != null) {
                        i3 = 0;
                    } else {
                        i3 = r5.A00;
                    }
                    AnonymousClass0G0 r52 = C09250aw.A0C;
                    if (r52 != null) {
                        i4 = 0;
                    } else {
                        i4 = r52.A00;
                    }
                    if (C09250aw.A0E) {
                        String.format("handleRemedyLocked %d -> %d, insta crash %d -> %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2)});
                    }
                    if (i2 <= i4) {
                        if (i <= i3) {
                            if (i2 <= 0) {
                            }
                        }
                        z2 = false;
                        i2 = i;
                        AnonymousClass0Fz A004 = C09250aw.A00(name);
                        if (z2) {
                            A02 = A004.A03(context2, i2, i3, Collections.singletonMap("number_of_crashes", Long.valueOf((long) C09250aw.A06)));
                        } else {
                            A02 = A004.A02(context2, i2, i3, Collections.singletonMap("number_of_crashes", Long.valueOf((long) C09250aw.A05)));
                        }
                        if (A02.A01) {
                            try {
                                AnonymousClass0G0 r6 = new AnonymousClass0G0(currentTimeMillis, i2);
                                File A005 = AnonymousClass0G0.A00(context2, z2);
                                RandomAccessFile randomAccessFile = new RandomAccessFile(A005, "rw");
                                randomAccessFile.writeInt(r6.A00);
                                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                                randomAccessFile.close();
                                if (!A005.setLastModified(r6.A01)) {
                                    Log.w("CrashLoopRemedyLog", "unable to set remedy log last modified timestamp");
                                }
                                if (z2) {
                                    C09250aw.A0C = r6;
                                } else {
                                    C09250aw.A0D = r6;
                                }
                            } catch (IOException e3) {
                                Log.w("CatchMeIfYouCan", "error recording remedy log", e3);
                            } catch (Throwable ) {
                                throw th;
                            }
                        }
                        if (A02.A00) {
                            try {
                                C09250aw.A01(context2);
                            } catch (Throwable th) {
                                Log.w("CatchMeIfYouCan", "error killing sibling processes", th);
                            }
                            Log.e("CatchMeIfYouCan", "CatchMeIfYouCan is killing this process");
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                        }
                        r22.close();
                    }
                    z2 = true;
                    i3 = i4;
                    AnonymousClass0Fz A0042 = C09250aw.A00(name);
                    if (z2) {
                    }
                    if (A02.A01) {
                    }
                    if (A02.A00) {
                    }
                    r22.close();
                }
            } catch (IOException e4) {
                AnonymousClass0DB.A0G(A00.getSimpleName(), "Error setting CatchMeIfYouCan", e4);
            } catch (Throwable ) {
                throw th;
            }
        }
        return;
    }
}
