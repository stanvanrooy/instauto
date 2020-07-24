package p000X;

import android.content.ContentValues;

/* renamed from: X.BSD */
public final class BSD implements C25675BUp {
    public final String name() {
        return "id";
    }

    public final /* bridge */ /* synthetic */ void BYe(ContentValues contentValues, Object obj) {
        String str = (String) obj;
        if (str.matches("[a-z0-9]+")) {
            contentValues.put(name(), str);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0J("Invalid media ID format: ", str, ", valid pattern: [a-z0-9]+"));
    }
}
