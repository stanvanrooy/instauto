package p000X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.cameracore.threading.ThreadPool$LifeStatus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.BCI */
public final class BCI {
    public static final BCI A03 = new BCI();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final BCK A02 = new BCK();

    public static Handler A00(BCI bci, String str, Handler.Callback callback) {
        boolean z;
        HandlerThread handlerThread;
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Thread name cannot be empty");
        }
        synchronized (bci) {
            try {
                Iterator it = bci.A01.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((HandlerThread) it.next()).getName().equals(str)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    AnonymousClass0DB.A0K("ThreadPool", "Thread name already exists %s", str);
                }
                handlerThread = new HandlerThread("DO_NOT_USE_thread");
                handlerThread.setName(str);
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        handlerThread.start();
        if (handlerThread.isAlive()) {
            synchronized (bci) {
                try {
                    bci.A01.put(handlerThread, ThreadPool$LifeStatus.AVAILABLE);
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            Handler handler = new Handler(handlerThread.getLooper(), callback);
            bci.A00.put(handler, handlerThread);
            synchronized (bci) {
                try {
                    bci.A01.put(handlerThread, ThreadPool$LifeStatus.TAKEN);
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            bci.A01.size();
            return handler;
        }
        throw new RuntimeException("Thread start was unsuccessful");
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0061 */
    public static void A01(Handler handler, boolean z, boolean z2) {
        BCI bci = A03;
        if (handler != null) {
            HandlerThread handlerThread = (HandlerThread) bci.A00.get(handler);
            if (handlerThread == null) {
                AnonymousClass0DB.A0E("ThreadPool", "Trying to quit thread not managed by ThreadPool - abort");
                return;
            }
            bci.A00.remove(handler);
            synchronized (bci) {
                ThreadPool$LifeStatus threadPool$LifeStatus = (ThreadPool$LifeStatus) bci.A01.get(handlerThread);
                if (threadPool$LifeStatus == ThreadPool$LifeStatus.TAKEN) {
                    Map map = bci.A01;
                    ThreadPool$LifeStatus threadPool$LifeStatus2 = ThreadPool$LifeStatus.AVAILABLE;
                    map.put(handlerThread, threadPool$LifeStatus2);
                    handlerThread.setName("CameraCore_Available_Thread");
                    synchronized (bci) {
                        if (bci.A01.get(handlerThread) == threadPool$LifeStatus2) {
                            bci.A01.put(handlerThread, ThreadPool$LifeStatus.QUITTING);
                            if (!z2) {
                                handlerThread.quitSafely();
                            } else {
                                handlerThread.quit();
                            }
                            if (z) {
                                if (Thread.currentThread() != handlerThread) {
                                    handlerThread.join();
                                }
                            }
                            bci.A01.remove(handlerThread);
                        } else {
                            AnonymousClass0DB.A0E("ThreadPool", "Trying to kill thread that is not AVAILABLE");
                        }
                    }
                } else {
                    AnonymousClass0DB.A0K("ThreadPool", "Trying to quit thread that is not TAKEN but in %s", threadPool$LifeStatus);
                }
            }
            bci.A01.size();
        }
    }
}
