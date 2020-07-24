package com.facebook.mediastreaming.opt.transport.videoprotocolimpl;

import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPThread;

public class TransportEventBaseProvider {
    public static EventBase sEventBase;
    public final Thread mNetworkThread;

    public static synchronized Object provideEventBase() {
        EventBase eventBase;
        synchronized (TransportEventBaseProvider.class) {
            if (sEventBase == null) {
                new TransportEventBaseProvider();
            }
            eventBase = sEventBase;
        }
        return eventBase;
    }

    public TransportEventBaseProvider() {
        HTTPThread hTTPThread = new HTTPThread();
        Thread thread = new Thread(hTTPThread);
        this.mNetworkThread = thread;
        thread.setPriority(5);
        this.mNetworkThread.start();
        hTTPThread.waitForInitialization();
        sEventBase = hTTPThread.getEventBase();
    }
}
