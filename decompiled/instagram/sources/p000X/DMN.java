package p000X;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;

/* renamed from: X.DMN */
public final class DMN {
    public static final String[] A02 = {"_id", "contact_id", "deleted", "mimetype", "data1", "data2", "data3"};
    public final Context A00;
    public final C30006DMi A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    public final DMO A00() {
        Cursor cursor;
        if (this.A00.checkCallingOrSelfPermission(AnonymousClass0C5.$const$string(187)) == 0) {
            try {
                cursor = this.A00.getContentResolver().query(ContactsContract.RawContactsEntity.CONTENT_URI, A02, (String) null, (String[]) null, "contact_id");
                if (cursor != null) {
                    try {
                        return new DMO(cursor);
                    } catch (Exception unused) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        Bundle bundle = new Bundle(1);
                        bundle.putString("failure_reason", "contacts_iterator_cursor_null");
                        this.A01.A00(bundle);
                        return null;
                    }
                }
            } catch (Exception unused2) {
                cursor = null;
                if (cursor != null) {
                }
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("failure_reason", "contacts_iterator_cursor_null");
                this.A01.A00(bundle2);
                return null;
            }
        }
        return null;
    }

    public DMN(Context context, C30006DMi dMi) {
        this.A00 = context;
        this.A01 = dMi;
    }
}
