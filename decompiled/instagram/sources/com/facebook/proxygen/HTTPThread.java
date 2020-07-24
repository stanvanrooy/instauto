package com.facebook.proxygen;

import com.facebook.proxygen.utils.Preconditions;

public class HTTPThread implements Runnable {
    public EventBase mEventBase;
    public boolean mEventBaseInitError = false;
    public EvbExceptionHandler mExHandler;

    public synchronized boolean eventBaseInitErrored() {
        return this.mEventBaseInitError;
    }

    public void run() {
        synchronized (this) {
            try {
                this.mEventBase = new EventBase();
                try {
                    notifyAll();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (UnsatisfiedLinkError unused) {
                this.mEventBaseInitError = true;
            } catch (Throwable th2) {
                notifyAll();
                throw th2;
            }
        }
        try {
            EventBase eventBase = this.mEventBase;
            if (eventBase != null) {
                eventBase.loopForever();
            }
        } catch (Throwable th3) {
            th = th3;
            EvbExceptionHandler evbExceptionHandler = this.mExHandler;
            if (evbExceptionHandler != null) {
                evbExceptionHandler.handle(th);
                return;
            }
            throw th;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:13:0x0001, LOOP_START, SYNTHETIC] */
    public synchronized void waitForInitialization() {
        while (this.mEventBase == null && !this.mEventBaseInitError) {
            wait();
        }
    }

    public EventBase getEventBase() {
        Preconditions.checkNotNull(this.mEventBase, "EventBase has not been created yet");
        return this.mEventBase;
    }

    public HTTPThread setExceptionHandler(EvbExceptionHandler evbExceptionHandler) {
        this.mExHandler = evbExceptionHandler;
        return this;
    }
}
