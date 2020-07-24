package p000X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.BA3 */
public final class BA3 {
    public C25249B9z A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 < 8) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004a  */
    public final String A00() {
        boolean z;
        Cursor cursor;
        int columnIndex;
        boolean z2;
        C25249B9z b9z = this.A00;
        String str = b9z.A03;
        if (str == null) {
            BAC bac = b9z.A02.A01;
            if (bac != null) {
                if (bac.A04) {
                    int i = bac.A00;
                    z2 = true;
                }
                z2 = false;
                z = true;
            }
            z = false;
            str = null;
            if (z) {
                try {
                    cursor = b9z.A00.getContentResolver().query(BA4.A01, (String[]) null, (String) null, (String[]) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst() && (columnIndex = cursor.getColumnIndex("attribution_json")) >= 0) {
                                str = cursor.getString(columnIndex);
                            }
                        } catch (SecurityException unused) {
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                        cursor.close();
                    }
                } catch (SecurityException unused2) {
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        }
        return str;
    }

    public BA3(Context context) {
        this.A00 = new C25249B9z(context);
    }
}
