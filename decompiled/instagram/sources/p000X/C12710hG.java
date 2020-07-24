package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/* renamed from: X.0hG  reason: invalid class name and case insensitive filesystem */
public class C12710hG implements C12720hH {
    public C12760hL A00;
    public Comparator A01;

    public C56812d6 A00(AnonymousClass2B5 r2) {
        return null;
    }

    public void A01(AnonymousClass2BC r1, AnonymousClass2B5 r2) {
    }

    public final File AF5(AnonymousClass2BC r10) {
        File file;
        File file2;
        File file3;
        File file4;
        File file5;
        C12760hL r0 = this.A00;
        if (r0 != null) {
            File file6 = r0.A00;
            if (file6 == null || (file = r0.A01) == null || (file2 = r0.A02) == null || (file3 = r0.A03) == null || (file4 = r0.A04) == null) {
                throw new IllegalStateException(AnonymousClass000.A05("Base folder null with storeInCaches = ", r10.A00));
            }
            int i = r10.A00;
            String str = r10.A02;
            if (i == 1) {
                file5 = new File(file3, str);
            } else if (i == 2) {
                file5 = new File(file4, str);
            } else if (i == 3) {
                file5 = new File(file6, str);
            } else if (i == 4) {
                file5 = new File(file, AnonymousClass000.A0E("app_", str));
            } else if (i == 5) {
                file5 = new File(file2, str);
            } else {
                throw new IllegalStateException(AnonymousClass000.A05("Invalid location value provided = ", i));
            }
            ArrayList<AnonymousClass2B5> arrayList = new ArrayList<>(r10.A01.values());
            if (!arrayList.isEmpty()) {
                LinkedList<Pair> linkedList = new LinkedList<>();
                for (AnonymousClass2B5 r2 : arrayList) {
                    C56812d6 A002 = A00(r2);
                    if (A002 == null) {
                        A01(r10, r2);
                    } else if (A002 instanceof AnonymousClass897) {
                        linkedList.add(new Pair(r2, (AnonymousClass897) A002));
                    }
                }
                Collections.sort(linkedList, this.A01);
                for (Pair pair : linkedList) {
                    String pathComponent = ((AnonymousClass897) pair.second).pathComponent(r10, (AnonymousClass2B5) pair.first);
                    if (!TextUtils.isEmpty(pathComponent)) {
                        file5 = new File(file5, pathComponent);
                    }
                }
            }
            if (!file5.isDirectory()) {
                file5.mkdirs();
            }
            BZp(file5, r10);
            return file5;
        }
        throw new IllegalStateException(AnonymousClass000.A0E("Base Cask not initialized ", r10.A02));
    }

    public final File BZp(File file, AnonymousClass2BC r5) {
        ArrayList<AnonymousClass2B5> arrayList = new ArrayList<>(r5.A01.values());
        if (!arrayList.isEmpty()) {
            for (AnonymousClass2B5 r1 : arrayList) {
                C56812d6 A002 = A00(r1);
                if (A002 == null) {
                    A01(r5, r1);
                } else {
                    A002.BDz(r5, r1, file);
                }
            }
        }
        return file;
    }

    public C12710hG() {
    }

    public C12710hG(Context context) {
        this.A00 = new C12760hL(context);
        this.A01 = new C12770hM(this);
    }
}
