package p000X;

import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.TimingModule;
import java.util.Set;

/* renamed from: X.AG4 */
public final class AG4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AG7 A01;
    public final /* synthetic */ AG6 A02;

    public AG4(AG6 ag6, AG7 ag7, int i) {
        this.A02 = ag6;
        this.A01 = ag7;
        this.A00 = i;
    }

    public final void run() {
        AG6 ag6 = this.A02;
        AG7 ag7 = this.A01;
        int i = this.A00;
        synchronized (ag6) {
            C228039ra.A00();
            Object obj = ag6.A02.get();
            AnonymousClass0FY.A01(obj, "Tried to start a task on a react context that has already been destroyed");
            A3N a3n = (A3N) obj;
            if (a3n.A06 != Constants.A0C || ag7.A04) {
                Set set = ag6.A04;
                Integer valueOf = Integer.valueOf(i);
                set.add(valueOf);
                ag6.A03.put(valueOf, new AG7(ag7));
                if (a3n.A0A()) {
                    ((AppRegistry) a3n.A01(AppRegistry.class)).startHeadlessTask(i, ag7.A03, ag7.A01);
                } else {
                    ReactSoftException.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
                }
                long j = ag7.A00;
                if (j > 0) {
                    AG9 ag9 = new AG9(ag6, i);
                    ag6.A01.append(i, ag9);
                    AnonymousClass0ZA.A09(ag6.A00, ag9, j, -1671140769);
                }
                for (TimingModule onHeadlessJsTaskStart : ag6.A05) {
                    onHeadlessJsTaskStart.onHeadlessJsTaskStart(i);
                }
            } else {
                throw new IllegalStateException(AnonymousClass000.A0J("Tried to start task ", ag7.A03, " while in foreground, but this is not allowed."));
            }
        }
    }
}
