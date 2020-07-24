package p000X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nM  reason: invalid class name and case insensitive filesystem */
public final class C39711nM implements C06570Po {
    public final Map A00 = new LinkedHashMap();

    public final List A00() {
        Collection values;
        Map map = (Map) this.A00.get(C62212nG.CURRENT_USER_SUGGESTED_HIGHLIGHT_REELS);
        if (map == null) {
            values = Collections.emptySet();
        } else {
            values = map.values();
        }
        return new ArrayList(values);
    }

    public final void A01(Reel reel) {
        C62212nG r2;
        if (reel.A0x) {
            if (reel.A0d()) {
                r2 = C62212nG.CURRENT_USER_PUBLISHED_HIGHLIGHT_REELS;
            } else if (reel.A0e()) {
                r2 = C62212nG.CURRENT_USER_SUGGESTED_HIGHLIGHT_REELS;
            } else {
                return;
            }
            Map map = (Map) this.A00.get(r2);
            if (map == null) {
                map = new HashMap();
                this.A00.put(r2, map);
            }
            map.put(reel.getId(), reel);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.clear();
    }
}
