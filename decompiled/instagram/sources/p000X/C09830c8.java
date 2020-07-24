package p000X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0c8  reason: invalid class name and case insensitive filesystem */
public class C09830c8 extends AnonymousClass0YC {
    public C09850cB[] A00;
    public final ZipFile A01;
    public final C030505e A02;
    public final /* synthetic */ AnonymousClass00G A03;

    public boolean A02(ZipEntry zipEntry, String str) {
        return true;
    }

    public C09830c8(AnonymousClass00G r3, C030505e r4) {
        this.A03 = r3;
        this.A01 = new ZipFile(r3.A00);
        this.A02 = r4;
    }

    public final AnonymousClass0Y9 A00() {
        return new AnonymousClass0Y9(A03());
    }

    public final AnonymousClass0YB A01() {
        return new C09840cA(this);
    }

    public final C09850cB[] A03() {
        if (this.A00 == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(this.A03.A01);
            String[] A05 = AnonymousClass0Y5.A05();
            Enumeration<? extends ZipEntry> entries = this.A01.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                Matcher matcher = compile.matcher(zipEntry.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    int i = 0;
                    while (true) {
                        if (i >= A05.length) {
                            i = -1;
                            break;
                        }
                        String str = A05[i];
                        if (str != null && group.equals(str)) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        linkedHashSet.add(group);
                        C09850cB r0 = (C09850cB) hashMap.get(group2);
                        if (r0 == null || i < r0.A00) {
                            hashMap.put(group2, new C09850cB(group2, zipEntry, i));
                        }
                    }
                }
            }
            this.A02.A01 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
            C09850cB[] r6 = (C09850cB[]) hashMap.values().toArray(new C09850cB[hashMap.size()]);
            Arrays.sort(r6);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= r4) {
                    break;
                }
                C09850cB r02 = r6[i2];
                if (A02(r02.A01, r02.A01)) {
                    i3++;
                } else {
                    r6[i2] = null;
                }
                i2++;
            }
            C09850cB[] r3 = new C09850cB[i3];
            int i4 = 0;
            for (C09850cB r1 : r6) {
                if (r1 != null) {
                    r3[i4] = r1;
                    i4++;
                }
            }
            this.A00 = r3;
        }
        return this.A00;
    }

    public final void close() {
        this.A01.close();
    }
}
