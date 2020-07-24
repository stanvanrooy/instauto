package p000X;

import android.content.ContentValues;
import android.database.Cursor;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.publisher.OperationHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.14b  reason: invalid class name and case insensitive filesystem */
public final class C243014b {
    public static final Class A03 = C243014b.class;
    public boolean A00;
    public final HashMap A01 = new HashMap();
    public final HashMap A02 = new HashMap();

    private synchronized Map A00(String str) {
        if (this.A02.containsKey(str)) {
            Object obj = this.A02.get(str);
            AnonymousClass0a4.A06(obj);
            return (Map) obj;
        }
        HashMap hashMap = new HashMap();
        this.A02.put(str, hashMap);
        return hashMap;
    }

    public final synchronized void A03(AnonymousClass16T r12) {
        if (!this.A00) {
            this.A00 = true;
            Cursor BYk = r12.BYk(new C248316e("operations").A01());
            BYk.moveToFirst();
            int columnIndex = BYk.getColumnIndex("_id");
            int columnIndex2 = BYk.getColumnIndex("txn_id");
            int columnIndex3 = BYk.getColumnIndex("data");
            while (!BYk.isAfterLast()) {
                try {
                    long j = BYk.getLong(columnIndex);
                    String string = BYk.getString(columnIndex2);
                    C13080hr A002 = C107974l1.A00(BYk.getBlob(columnIndex3));
                    if (A002 != null) {
                        AnonymousClass15G r2 = (AnonymousClass15G) OperationHelper.A00.A01(A002);
                        Map A003 = A00(string);
                        AnonymousClass0a4.A06(r2);
                        Long valueOf = Long.valueOf(j);
                        A003.put(r2, valueOf);
                        this.A01.put(valueOf, r2);
                    }
                } catch (IOException e) {
                    AnonymousClass0DB.A05(A03, StringFormatUtil.formatStrLocaleSafe("Failed to read operation. id: %d data: %s", -1L, (Object) null), e);
                }
                BYk.moveToNext();
            }
            BYk.close();
        }
    }

    public final AnonymousClass15G A02(long j) {
        return (AnonymousClass15G) this.A01.get(Long.valueOf(j));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        r0 = "operation_store_put";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        r0 = "operation_store_put_ser";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        p000X.AnonymousClass0QD.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0068 */
    public final long A01(AnonymousClass16T r9, String str, AnonymousClass15G r11) {
        String typeName;
        boolean containsKey;
        Map A002 = A00(str);
        if (A002.containsKey(r11)) {
            return ((Long) A002.get(r11)).longValue();
        }
        C17410qC r1 = OperationHelper.A00;
        synchronized (r1) {
            HashMap hashMap = r1.A00;
            typeName = r11.getTypeName();
            containsKey = hashMap.containsKey(typeName);
        }
        if (containsKey) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("txn_id", str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C13460iZ A04 = C12890hY.A00.A04(byteArrayOutputStream, Constants.ZERO);
            OperationHelper.A00.A02(A04, r11);
            A04.close();
            contentValues.put("data", byteArrayOutputStream.toByteArray());
            long Adh = r9.Adh("operations", 0, contentValues);
            Long valueOf = Long.valueOf(Adh);
            A002.put(r11, valueOf);
            this.A01.put(valueOf, r11);
            return Adh;
        }
        throw new C45391xn(AnonymousClass000.A0P("Operation class ", r11.getClass().getSimpleName(), " with type name ", typeName, " is not registered. ", "Register this operation in a PublisherPlugin on application startup."));
    }
}
