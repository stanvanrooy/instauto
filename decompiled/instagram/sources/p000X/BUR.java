package p000X;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BUR */
public final class BUR {
    public final AnonymousClass16T A00;
    public final C475724o A01;
    public final boolean A02;

    private void A00() {
        for (C475824p r0 : this.A01.AQH()) {
            for (String A012 : r0.A02) {
                A01(A012);
            }
        }
        A02(Arrays.asList(this.A01.AQH()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        if (r1 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0015 */
    private void A01(String str) {
        try {
            C249016l A98 = this.A00.A98(str);
            A98.execute();
            A98.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable ) {
            throw th;
        }
    }

    private void A02(List list) {
        ContentValues contentValues = new ContentValues();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C475824p r2 = (C475824p) it.next();
            contentValues.clear();
            contentValues.put("schema_name", this.A01.getName());
            contentValues.put("sequence", Integer.valueOf(r2.A00));
            contentValues.put("checksum", r2.A01);
            this.A00.Adh("ig_meta_migrations", 2, contentValues);
        }
    }

    public final void A03() {
        if (!this.A02 || migrationsTableExists()) {
            List<C25677BUr> listMigrationInfo = listMigrationInfo();
            HashMap hashMap = new HashMap(listMigrationInfo.size());
            for (C25677BUr bUr : listMigrationInfo) {
                hashMap.put(Integer.valueOf(bUr.A00), bUr);
            }
            C475824p[] AQH = this.A01.AQH();
            ArrayList arrayList = new ArrayList();
            for (C475824p r5 : AQH) {
                C25677BUr bUr2 = (C25677BUr) hashMap.get(Integer.valueOf(r5.A00));
                if (bUr2 == null) {
                    for (String A012 : r5.A02) {
                        A01(A012);
                    }
                    arrayList.add(r5);
                } else if (!bUr2.A01.equals(r5.A01)) {
                    AnonymousClass0DB.A0K("SchemaMigrator", "Dropping and recreating schema %s due to checksum mismatch for migration with sequence %d", this.A01.getName(), Integer.valueOf(r5.A00));
                    this.A00.ABb("ig_meta_migrations", "schema_name = ?", new Object[]{this.A01.getName()});
                    for (String A0E : this.A01.AXh()) {
                        A01(AnonymousClass000.A0E("DROP TABLE IF EXISTS ", A0E));
                    }
                }
            }
            A02(arrayList);
            return;
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r6 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0025 */
    public boolean migrationsTableExists() {
        try {
            C249016l A98 = this.A00.A98("SELECT COUNT(*)\nFROM sqlite_master\nWHERE type = 'table'\n  AND name = ?");
            boolean z = true;
            A98.A6a(1, "ig_meta_migrations");
            if (A98.Bon() <= 0) {
                z = false;
            }
            A98.close();
            return z;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable ) {
            throw th;
        }
    }

    public BUR(C475724o r1, AnonymousClass16T r2, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
    }

    public List listMigrationInfo() {
        return listMigrationInfo(this.A01.getName(), this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r3 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        throw r0;
     */
    public static List listMigrationInfo(String str, AnonymousClass16T r8) {
        ArrayList arrayList = new ArrayList();
        C248316e r2 = new C248316e("ig_meta_migrations");
        r2.A03 = new String[]{"sequence", "checksum"};
        r2.A01 = "schema_name = ?";
        r2.A02 = new Object[]{str};
        r2.A00 = "sequence ASC";
        Cursor BYk = r8.BYk(r2.A01());
        while (BYk.moveToNext()) {
            arrayList.add(new C25677BUr(BYk.getInt(0), BYk.getString(1)));
        }
        BYk.close();
        return arrayList;
    }
}
