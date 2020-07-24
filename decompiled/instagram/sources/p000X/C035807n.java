package p000X;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.07n  reason: invalid class name and case insensitive filesystem */
public final class C035807n extends AnonymousClass0PP {
    public AnonymousClass0S5 A00;
    public Map A01 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        throw r0;
     */
    public final void A01(File file, Properties properties, String str) {
        if ("perf".equals(str)) {
            try {
                AnonymousClass0P7 r2 = (AnonymousClass0P7) this.A01.get(file.getPath());
                if (r2 == null) {
                    r2 = this.A00.A00(file);
                    AnonymousClass0FY.A00(r2);
                    this.A01.put(file.getPath(), r2);
                }
                MappedByteBuffer mappedByteBuffer = r2.A01;
                mappedByteBuffer.clear();
                for (Map.Entry entry : properties.entrySet()) {
                    String obj = entry.getKey().toString();
                    String obj2 = entry.getValue().toString();
                    mappedByteBuffer.put(AnonymousClass0PP.A00(obj, true).getBytes("Ascii"));
                    mappedByteBuffer.put("=".getBytes("Ascii"));
                    mappedByteBuffer.put(AnonymousClass0PP.A00(obj2, false).getBytes("Ascii"));
                    mappedByteBuffer.put("\n".getBytes("Ascii"));
                }
                mappedByteBuffer.put("#".getBytes("Ascii"));
            } catch (Throwable unused) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (str == null) {
                    str = "";
                }
                properties.store(fileOutputStream, AnonymousClass000.A0E("fallover ", str));
                fileOutputStream.close();
            }
        } else {
            super.A01(file, properties, str);
        }
    }

    public C035807n(AnonymousClass0S5 r2) {
        this.A00 = r2;
    }
}
