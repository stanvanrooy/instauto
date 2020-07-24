package p000X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.0jE  reason: invalid class name and case insensitive filesystem */
public final class C13790jE {
    public C13810jG A00;
    public File A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a2 */
    public static synchronized void A00(C13790jE r5, File file) {
        synchronized (r5) {
            try {
                C13460iZ A02 = C12890hY.A00.A02(file, Constants.ZERO);
                C13810jG r1 = r5.A00;
                A02.A0T();
                if (r1.A00 != null) {
                    A02.A0d("configs");
                    A02.A0T();
                    for (Map.Entry entry : r1.A00.entrySet()) {
                        A02.A0d((String) entry.getKey());
                        if (entry.getValue() == null) {
                            A02.A0R();
                        } else {
                            C13830jI r12 = (C13830jI) entry.getValue();
                            A02.A0T();
                            if (r12.A00 != null) {
                                A02.A0d("params");
                                A02.A0T();
                                for (Map.Entry entry2 : r12.A00.entrySet()) {
                                    A02.A0d((String) entry2.getKey());
                                    if (entry2.getValue() == null) {
                                        A02.A0R();
                                    } else {
                                        C13840jJ.A00(A02, (C13850jK) entry2.getValue());
                                    }
                                }
                                A02.A0Q();
                            }
                            A02.A0Q();
                        }
                    }
                    A02.A0Q();
                }
                A02.A0Q();
                A02.close();
            } catch (IOException e) {
                AnonymousClass0QD.A05("ConfigurationFileStore", "Error while writing to cache file", e);
            } catch (Throwable ) {
                throw th;
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a  */
    public C13790jE(File file) {
        C13810jG r0;
        this.A01 = file;
        try {
            C13080hr A07 = C12890hY.A00.A07(file);
            A07.A0p();
            r0 = C13800jF.parseFromJson(A07);
            A07.close();
        } catch (FileNotFoundException unused) {
        } catch (IOException e) {
            AnonymousClass0QD.A05("ConfigurationFileStore", "Error while reading file - not loading cache", e);
        } catch (Throwable ) {
            throw th;
        }
        this.A00 = r0 == null ? new C13810jG() : r0;
        r0 = null;
        this.A00 = r0 == null ? new C13810jG() : r0;
    }

    public static boolean A01(HashMap hashMap, HashMap hashMap2) {
        if (hashMap.size() == hashMap2.size()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!Objects.equals((C13830jI) hashMap2.get(entry.getKey()), entry.getValue())) {
                }
            }
            return false;
        }
        return true;
    }
}
