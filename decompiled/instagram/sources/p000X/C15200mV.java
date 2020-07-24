package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0mV  reason: invalid class name and case insensitive filesystem */
public final class C15200mV {
    public final Map A00 = Collections.synchronizedMap(new LinkedHashMap());

    public final boolean A00(C15260mb r6) {
        if (r6.A00 == 0) {
            boolean containsKey = this.A00.containsKey(r6.A04);
            this.A00.put(r6.A04, Long.valueOf(r6.A03));
            return containsKey;
        }
        this.A00.remove(r6.A04);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[SYNTHETIC, Splitter:B:16:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[SYNTHETIC, Splitter:B:23:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    public C15200mV(File file) {
        BufferedReader bufferedReader;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        A00(new C15260mb(readLine));
                    } catch (IOException e) {
                        e = e;
                        try {
                            AnonymousClass0QD.A01("IgCacheLoggerImpl", StringFormatUtil.formatStrLocaleSafe("IOException found for file %s. Exception: %s", file.getName(), e.getLocalizedMessage()));
                            if (bufferedReader != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
                AnonymousClass0QD.A01("IgCacheLoggerImpl", StringFormatUtil.formatStrLocaleSafe("IOException found for file %s. Exception: %s", file.getName(), e.getLocalizedMessage()));
                if (bufferedReader != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                if (bufferedReader != null) {
                }
                throw th;
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
