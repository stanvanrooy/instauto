package p000X;

import android.text.TextUtils;
import android.util.Base64;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1mV  reason: invalid class name and case insensitive filesystem */
public final class C39191mV implements C06570Po {
    public Set A00;
    public final AnonymousClass0C1 A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public Set parseHashtagsToColor() {
        HashSet hashSet = new HashSet();
        AnonymousClass0C1 r3 = this.A01;
        AnonymousClass0L7 r4 = AnonymousClass0L7.RAINBOW_HASHTAGS;
        if (((Boolean) AnonymousClass0L6.A03(r3, r4, "is_in_experiment", false, (AnonymousClass04H) null)).booleanValue()) {
            String str = (String) AnonymousClass0L6.A03(this.A01, r4, "hashtag_whitelist_base64", "", (AnonymousClass04H) null);
            if (!TextUtils.isEmpty(str)) {
                try {
                    for (String trim : new String(Base64.decode(str, 0)).split(",")) {
                        String lowerCase = trim.trim().toLowerCase();
                        if (!lowerCase.startsWith("#")) {
                            lowerCase = AnonymousClass000.A0E("#", lowerCase);
                        }
                        hashSet.add(lowerCase);
                    }
                } catch (IllegalArgumentException e) {
                    AnonymousClass0QD.A05("HashtagColorizer", "Error parsing colorized hashtag list", e);
                    return hashSet;
                }
            }
        }
        return hashSet;
    }

    public C39191mV(AnonymousClass0C1 r1) {
        this.A01 = r1;
    }
}
