package p000X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.CF1 */
public final class CF1 {
    public final Map A00 = new HashMap();

    public final List A00(String str) {
        if (TextUtils.isEmpty(str) || !this.A00.containsKey(str.toLowerCase(Locale.US))) {
            return new ArrayList();
        }
        return new ArrayList((Collection) this.A00.get(str.toLowerCase(Locale.US)));
    }
}
