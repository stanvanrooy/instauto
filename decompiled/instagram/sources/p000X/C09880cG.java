package p000X;

import com.facebook.common.dextricks.DexStoreUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.0cG  reason: invalid class name and case insensitive filesystem */
public final class C09880cG extends AnonymousClass0YC {
    public final C09860cC[] A00;
    public final /* synthetic */ AnonymousClass00P A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00c6 */
    public C09880cG(AnonymousClass00P r17, C030505e r18) {
        FileReader fileReader;
        boolean z;
        AnonymousClass00P r0 = r17;
        this.A01 = r0;
        File file = new File(AnonymousClass000.A0J("/data/local/tmp/exopackage/", r0.A03.getPackageName(), "/native-libs/"));
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        loop0:
        for (String str : AnonymousClass0Y5.A05()) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                linkedHashSet.add(str);
                File file3 = new File(file2, DexStoreUtils.SECONDARY_DEX_MANIFEST);
                if (file3.isFile()) {
                    fileReader = new FileReader(file3);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.length() != 0) {
                            int indexOf = readLine.indexOf(32);
                            if (indexOf != -1) {
                                String A0E = AnonymousClass000.A0E(readLine.substring(i, indexOf), ".so");
                                int size = arrayList.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        z = false;
                                        break;
                                    } else if (((C09860cC) arrayList.get(i2)).A01.equals(A0E)) {
                                        z = true;
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                if (!z) {
                                    String substring = readLine.substring(indexOf + 1);
                                    arrayList.add(new C09860cC(A0E, substring, new File(file2, substring)));
                                }
                                i = 0;
                            } else {
                                throw new RuntimeException(AnonymousClass000.A0J("illegal line in exopackage metadata: [", readLine, "]"));
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        r18.A01 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
        this.A00 = (C09860cC[]) arrayList.toArray(new C09860cC[arrayList.size()]);
        return;
        try {
        } catch (Throwable th) {
            try {
                fileReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final AnonymousClass0Y9 A00() {
        return new AnonymousClass0Y9(this.A00);
    }

    public final AnonymousClass0YB A01() {
        return new C09890cH(this);
    }
}
