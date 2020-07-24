package p000X;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.BSI */
public final class BSI implements C06570Po, C06580Pp {
    public final Set A00 = new CopyOnWriteArraySet();

    public static int A00(C36341ht r2) {
        if (r2 != null) {
            switch (r2.ordinal()) {
                case 1:
                    return 5;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 2;
                case 5:
                    return 1;
            }
        }
        return 0;
    }

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
