package p000X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Uy  reason: invalid class name and case insensitive filesystem */
public final class C07920Uy implements Iterator {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final File[] A04;

    public final boolean hasNext() {
        int i = this.A00;
        while (true) {
            File[] fileArr = this.A04;
            if (i >= fileArr.length) {
                return false;
            }
            String name = fileArr[i].getName();
            if (this.A04[i].length() > 0 && !name.endsWith(".pending") && !name.endsWith(".recovery") && (this.A01 || !name.endsWith(".enc"))) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r5.isEmpty() != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (r11.A01 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        return new p000X.AnonymousClass05D((java.io.File[]) r5.toArray(new java.io.File[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        throw new java.util.NoSuchElementException();
     */
    public final /* bridge */ /* synthetic */ Object next() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= this.A03) {
                break;
            }
            int i2 = this.A00;
            File[] fileArr = this.A04;
            if (i2 >= fileArr.length) {
                break;
            }
            if (fileArr[i2].length() == 0) {
                this.A04[this.A00].delete();
                z = false;
            } else {
                z = true;
            }
            String name = this.A04[this.A00].getName();
            if (name.endsWith(".pending") || name.endsWith(".recovery")) {
                z = false;
            }
            if (!this.A01 && name.endsWith(".enc")) {
                z = false;
            }
            if (i > 0 && this.A04[this.A00].length() > ((long) this.A02)) {
                break;
            } else if (!name.endsWith(".gz")) {
                if (z) {
                    i = (int) (((long) i) + this.A04[this.A00].length());
                    arrayList.add(this.A04[this.A00]);
                }
                this.A00++;
            } else if (arrayList.isEmpty()) {
                File[] fileArr2 = this.A04;
                int i3 = this.A00;
                AnonymousClass04s r2 = new AnonymousClass04s(fileArr2[i3]);
                this.A00 = i3 + 1;
                return r2;
            }
        }
        return new C029404t((File[]) arrayList.toArray(new File[0]));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r4.listFiles();
     */
    public C07920Uy(File file, int i, int i2, boolean z) {
        boolean z2 = false;
        File[] fileArr = (!file.exists() || fileArr == null) ? new File[0] : fileArr;
        boolean z3 = false;
        this.A00 = 0;
        AnonymousClass0a4.A09(i > 0 ? true : z2);
        AnonymousClass0a4.A09(i2 > 0 ? true : z3);
        this.A03 = i;
        this.A02 = i2;
        this.A04 = fileArr;
        this.A01 = z;
    }
}
