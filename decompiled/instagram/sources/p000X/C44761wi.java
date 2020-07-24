package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public enum C44761wi {
    TEXT("text"),
    MUSIC("music"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C44761wi r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    public static C44761wi A00(String str) {
        if (A01.containsKey(str)) {
            return (C44761wi) A01.get(str);
        }
        return UNKNOWN;
    }

    /* access modifiers changed from: public */
    C44761wi(String str) {
        this.A00 = str;
    }

    public final String A01(Context context) {
        int ordinal = ordinal();
        int i = C0003R.string.question_sticker_answer_music_hint_text;
        if (ordinal != 1) {
            i = C0003R.string.question_sticker_answer_hint_text;
        }
        return context.getString(i);
    }
}
