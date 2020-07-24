package p000X;

import android.content.ContentValues;

/* renamed from: X.BSE */
public final class BSE implements C25675BUp {
    public final String name() {
        return "impression_vpvd";
    }

    public final /* bridge */ /* synthetic */ void BYe(ContentValues contentValues, Object obj) {
        contentValues.put(name(), Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0));
    }
}
