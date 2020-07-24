package p000X;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Vector;

/* renamed from: X.04t  reason: invalid class name and case insensitive filesystem */
public final class C029404t implements C06650Pw {
    public static final C11590fD A01 = new AnonymousClass0S0(",");
    public static final C11590fD A02 = new AnonymousClass0S0("{\"request_info\":{},\"batches\":[");
    public static final C11590fD A03 = new AnonymousClass0S0("]}");
    public final File[] A00;

    public final boolean Aex() {
        return false;
    }

    public final boolean Agc() {
        return true;
    }

    public final File Aij() {
        return null;
    }

    public final boolean Apj() {
        return false;
    }

    public final int ATZ() {
        File[] fileArr = this.A00;
        int length = fileArr.length;
        int i = 0;
        int i2 = 30;
        boolean z = false;
        while (i < length) {
            File file = fileArr[i];
            if (z) {
                i2++;
            }
            i2 = (int) (((long) i2) + file.length());
            i++;
            z = true;
        }
        return i2 + 2;
    }

    public final void Aoe() {
        for (File delete : this.A00) {
            delete.delete();
        }
    }

    public final InputStream BWa() {
        Vector vector = new Vector();
        vector.add(A02);
        File[] fileArr = this.A00;
        int length = fileArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            File file = fileArr[i];
            if (z) {
                vector.add(A01);
            }
            vector.add(new C07160Rz(file));
            i++;
            z = true;
        }
        vector.add(A03);
        return new AnonymousClass0P0(vector.iterator());
    }

    public final String BeL() {
        return this.A00[0].getName();
    }

    public C029404t(File[] fileArr) {
        AnonymousClass0a4.A09(fileArr.length > 0);
        this.A00 = fileArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        throw r0;
     */
    public final void BuZ(Writer writer) {
        writer.append("{\"request_info\":{},\"batches\":[");
        File[] fileArr = this.A00;
        int length = fileArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            File file = fileArr[i];
            if (z) {
                writer.append(",");
            }
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream) new C07160Rz(file).get());
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                writer.write(cArr, 0, read);
            }
            inputStreamReader.close();
            i++;
            z = true;
        }
        writer.append("]}");
    }
}
