package p000X;

import android.util.Pair;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.io.File;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.D0Z */
public final class D0Z extends Thread {
    public final /* synthetic */ C29569D0a A00;

    public D0Z(C29569D0a d0a) {
        this.A00 = d0a;
    }

    public final void run() {
        synchronized (this.A00) {
            C29569D0a d0a = this.A00;
            if (d0a.Bte()) {
                try {
                    D10.A01("VPS-SimpleCacheInitFileStorage");
                    List<Pair> allKeys = d0a.A08.getAllKeys();
                    if (allKeys != null) {
                        for (Pair pair : allKeys) {
                            C29572D0d d0d = (C29572D0d) pair.first;
                            Long l = (Long) pair.second;
                            File file = d0a.A08.getFile(d0d, l);
                            if (file != null) {
                                C29569D0a.A02(d0a, C25941Bcs.A01(d0d.A01, d0d.A00, l.longValue(), file, 0));
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    D10.A00();
                    throw th;
                }
            } else {
                D10.A01("VPS-SimpleCacheInit");
                if (!d0a.A0A.exists()) {
                    d0a.A0A.mkdirs();
                }
                File[] listFiles = d0a.A0A.listFiles();
                if (listFiles != null) {
                    C25941Bcs bcs = null;
                    for (int i = 0; i < listFiles.length; i++) {
                        File file2 = listFiles[i];
                        long length = file2.length();
                        if (length == 0) {
                            file2.delete();
                        } else {
                            if (!d0a.A02) {
                                boolean z = d0a.A04;
                                Matcher matcher = C25941Bcs.A07.matcher(file2.getName());
                                if (matcher.matches()) {
                                    File A02 = C25941Bcs.A02(file2.getParentFile(), matcher.group(1), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), z);
                                    file2.renameTo(A02);
                                    file2 = A02;
                                }
                            }
                            if (d0a.A03) {
                                bcs = C25941Bcs.A00(file2, d0a.A04, length, d0a.A06);
                            } else {
                                bcs = C25941Bcs.A00(file2, d0a.A04, 0, d0a.A06);
                            }
                        }
                        if (bcs == null || (d0a.A05 && bcs.A03 > ArLinkScanControllerImpl.ERROR_DELAY_MS)) {
                            file2.delete();
                        } else {
                            C29569D0a.A02(d0a, bcs);
                        }
                    }
                }
            }
            D10.A00();
            synchronized (this.A00.A01) {
                try {
                    this.A00.A01.notifyAll();
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
        }
    }
}
