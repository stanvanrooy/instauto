package p000X;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.instagram.video.player.hero.IgHttpConnectionForProxy;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: X.1oS  reason: invalid class name and case insensitive filesystem */
public final class C40311oS implements Runnable {
    public final /* synthetic */ C40121o7 A00;
    public final /* synthetic */ C40301oR A01;
    public final /* synthetic */ IgHttpConnectionForProxy A02;
    public final /* synthetic */ Executor A03;

    public C40311oS(C40121o7 r1, Executor executor, IgHttpConnectionForProxy igHttpConnectionForProxy, C40301oR r4) {
        this.A00 = r1;
        this.A03 = executor;
        this.A02 = igHttpConnectionForProxy;
        this.A01 = r4;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023 A[LOOP:2: B:7:0x0023->B:37:0x0023, LOOP_START, SYNTHETIC] */
    public final void run() {
        C40121o7 r6 = this.A00;
        try {
            LocalServerSocket localServerSocket = new LocalServerSocket(r6.A05);
            C40431oe.A01("LocalSocketVideoProxy", "Socket server started, address: %s", r6.A05);
            while (true) {
                LocalSocket localSocket = null;
                do {
                    try {
                        localSocket = localServerSocket.accept();
                        C40121o7 r10 = this.A00;
                        synchronized (r10.A02) {
                            while (r10.A03.size() > r10.A01) {
                                LocalSocket localSocket2 = (LocalSocket) r10.A03.remove(0);
                                C40431oe.A01("LocalSocketVideoProxy", "Closing client %s due to excess limit %d", localSocket2, Integer.valueOf(r10.A03.size() + 1));
                                localSocket2.close();
                            }
                        }
                        continue;
                    } catch (IOException e) {
                        C40431oe.A05("LocalSocketVideoProxy", e, "Error connecting to client", new Object[0]);
                        if (localSocket != null) {
                            localSocket.close();
                        }
                        localSocket = null;
                        continue;
                    }
                } while (localSocket == null);
                AnonymousClass0Z9.A03(this.A03, new C44011vS(this, localSocket), -414027373);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Error initializing server", e2);
        }
    }
}
