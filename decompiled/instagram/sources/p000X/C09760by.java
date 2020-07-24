package p000X;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0by  reason: invalid class name and case insensitive filesystem */
public final class C09760by extends AnonymousClass0YC {
    public final ZipEntry A00;
    public final ZipFile A01;
    public final C09800c4[] A02;
    public final /* synthetic */ AnonymousClass00F A03;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        r20.A01 = (java.lang.String[]) r11.toArray(new java.lang.String[r11.size()]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        if (r5 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010a, code lost:
        r3 = r10.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0116, code lost:
        if (r3.hasNext() == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0118, code lost:
        ((p000X.C09800c4) r3.next()).A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0131, code lost:
        r4.A02 = (p000X.C09800c4[]) r7.toArray(new p000X.C09800c4[r7.size()]);
        r4.A00 = r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x012a */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d9 A[ADDED_TO_REGION, EDGE_INSN: B:79:0x00d9->B:48:0x00d9 ?: BREAK  , SYNTHETIC] */
    public C09760by(AnonymousClass00F r19, C030505e r20) {
        String readLine;
        String str;
        String str2;
        String str3;
        RuntimeException runtimeException;
        AnonymousClass00F r3 = r19;
        this.A03 = r3;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        String[] A05 = AnonymousClass0Y5.A05();
        ZipFile zipFile = new ZipFile(r3.A01);
        try {
            ZipEntry entry = zipFile.getEntry(r3.A02);
            ZipEntry entry2 = zipFile.getEntry(r3.A03);
            if (entry == null || entry2 == null) {
                this.A02 = new C09800c4[0];
            } else {
                InputStream inputStream = zipFile.getInputStream(entry);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(' ');
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.length() != 0) {
                        simpleStringSplitter.setString(readLine);
                        if (simpleStringSplitter.hasNext()) {
                            str2 = simpleStringSplitter.next();
                            if (simpleStringSplitter.hasNext()) {
                                str3 = simpleStringSplitter.next();
                                if (simpleStringSplitter.hasNext()) {
                                    str = simpleStringSplitter.next();
                                    if (str2 != null || str3 == null || str == null) {
                                        runtimeException = new RuntimeException(AnonymousClass000.A0J("illegal line in compressed metadata: [", readLine, "]"));
                                    } else if (zipFile.getEntry(AnonymousClass000.A0E("assets/lib/", str2)) == null) {
                                        int parseInt = Integer.parseInt(str3);
                                        int indexOf = str2.indexOf(47);
                                        if (indexOf == -1) {
                                            runtimeException = new RuntimeException(AnonymousClass000.A0J("illegal line in compressed metadata: [", readLine, "]"));
                                            break;
                                        }
                                        String substring = str2.substring(0, indexOf);
                                        String substring2 = str2.substring(indexOf + 1);
                                        int i = 0;
                                        while (true) {
                                            if (i >= A05.length) {
                                                i = -1;
                                                break;
                                            }
                                            String str4 = A05[i];
                                            if (str4 != null && substring.equals(str4)) {
                                                break;
                                            }
                                            i++;
                                        }
                                        C09800c4 r1 = new C09800c4(substring2, str, parseInt, i);
                                        arrayList.add(r1);
                                        if (i >= 0) {
                                            linkedHashSet.add(substring);
                                            C09800c4 r0 = (C09800c4) hashMap.get(substring2);
                                            if (r0 == null || i < r0.A01) {
                                                hashMap.put(substring2, r1);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                str = null;
                                if (str2 != null) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            str2 = null;
                        }
                        str3 = null;
                        str = null;
                        if (str2 != null) {
                        }
                    }
                }
                runtimeException = new RuntimeException(AnonymousClass000.A0J("illegal line in compressed metadata: [", readLine, "]"));
                throw runtimeException;
            }
            this.A01 = zipFile;
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    public final AnonymousClass0Y9 A00() {
        return new AnonymousClass0Y9(this.A02);
    }

    public final AnonymousClass0YB A01() {
        if (this.A00 == null) {
            return new C09740bw();
        }
        return new C09780c0(this);
    }

    public final void close() {
        this.A01.close();
    }
}
