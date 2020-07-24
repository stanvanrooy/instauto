package p000X;

import android.database.Cursor;

/* renamed from: X.BBA */
public final class BBA implements BBI {
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
            throw new BBF("Malformed session format. Column not found.");
        }
        String string = cursor.getString(columnIndex);
        AnonymousClass0CW.A01(string);
        return new BBD(new BBE(string, cursor.getString(columnIndex2), cursor.getString(columnIndex3)), cursor.getString(columnIndex4));
    }
}
