package p000X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.Callable;

/* renamed from: X.17d  reason: invalid class name and case insensitive filesystem */
public final class C250617d implements Callable {
    public final Object call() {
        if (AnonymousClass09Q.A0B()) {
            return "foreground";
        }
        return AppStateModule.APP_STATE_BACKGROUND;
    }
}
