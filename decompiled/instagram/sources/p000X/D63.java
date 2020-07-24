package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.D63 */
public final class D63 extends Handler implements Runnable {
    public int A00;
    public IOException A01;
    public C29737D7b A02;
    public final int A03;
    public final long A04;
    public final D97 A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ D62 A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public D63(D62 d62, Looper looper, D97 d97, C29737D7b d7b, int i, long j) {
        super(looper);
        this.A09 = d62;
        this.A05 = d97;
        this.A02 = d7b;
        this.A03 = i;
        this.A04 = j;
    }

    public final void A00(long j) {
        D62 d62 = this.A09;
        boolean z = false;
        if (d62.A00 == null) {
            z = true;
        }
        D6U.A03(z);
        d62.A00 = this;
        if (j > 0) {
            AnonymousClass0ZA.A03(this, 0, j);
            return;
        }
        this.A01 = null;
        ExecutorService executorService = d62.A02;
        D6U.A01(this);
        AnonymousClass0Z9.A03(executorService, this, -1546752903);
    }

    public final void A01(boolean z) {
        this.A08 = z;
        this.A01 = null;
        if (hasMessages(0)) {
            AnonymousClass0ZA.A02(this, 0);
            if (!z) {
                AnonymousClass0ZA.A0B(this, 1);
            }
        } else {
            this.A07 = true;
            this.A05.A85();
            Thread thread = this.A06;
            if (thread != null) {
                thread.interrupt();
            }
        }
        if (z) {
            this.A09.A00 = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C29737D7b d7b = this.A02;
            D6U.A01(d7b);
            d7b.B9S(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A02 = null;
        }
    }

    public final void handleMessage(Message message) {
        if (!this.A08) {
            int i = message.what;
            if (i == 0) {
                this.A01 = null;
                D62 d62 = this.A09;
                ExecutorService executorService = d62.A02;
                D63 d63 = d62.A00;
                D6U.A01(d63);
                AnonymousClass0Z9.A03(executorService, d63, -1546752903);
            } else if (i != 4) {
                this.A09.A00 = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A04;
                C29737D7b d7b = this.A02;
                D6U.A01(d7b);
                if (this.A07) {
                    d7b.B9S(this.A05, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    d7b.B9S(this.A05, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    try {
                        d7b.B9V(this.A05, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        Log.e("LoadTask", "Unexpected exception handling load completed", e);
                        this.A09.A01 = new C206408sh(e);
                    }
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.A01 = iOException;
                    int i3 = this.A00 + 1;
                    this.A00 = i3;
                    C29756D8f B9W = d7b.B9W(this.A05, elapsedRealtime, j, iOException, i3);
                    int i4 = B9W.A00;
                    if (i4 == 3) {
                        this.A09.A01 = this.A01;
                    } else if (i4 != 2) {
                        if (i4 == 1) {
                            this.A00 = 1;
                        }
                        long j2 = B9W.A01;
                        if (j2 == -9223372036854775807L) {
                            j2 = (long) Math.min((this.A00 - 1) * 1000, 5000);
                        }
                        A00(j2);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        Object e;
        try {
            this.A06 = Thread.currentThread();
            if (!this.A07) {
                C200008hB.A01(AnonymousClass000.A0E("load:", this.A05.getClass().getSimpleName()));
                this.A05.Ail();
                C200008hB.A00();
            }
            if (!this.A08) {
                AnonymousClass0ZA.A0B(this, 2);
            }
        } catch (IOException e2) {
            e = e2;
            if (this.A08) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (InterruptedException unused) {
            D6U.A03(this.A07);
            if (!this.A08) {
                AnonymousClass0ZA.A0B(this, 2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.A08) {
                e = new C206408sh(e3);
                obtainMessage(3, e).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.A08) {
                e = new C206408sh(e4);
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.A08) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        } catch (Throwable th) {
            C200008hB.A00();
            throw th;
        }
    }
}
