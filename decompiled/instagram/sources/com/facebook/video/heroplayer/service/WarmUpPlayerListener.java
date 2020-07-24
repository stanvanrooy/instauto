package com.facebook.video.heroplayer.service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000X.AnonymousClass0Z0;

public final class WarmUpPlayerListener extends HeroServicePlayerDummyListener {
    public HeroServicePlayerCallback A00;
    public final Queue A01 = new ConcurrentLinkedQueue();

    public WarmUpPlayerListener() {
        int A03 = AnonymousClass0Z0.A03(-176984757);
        AnonymousClass0Z0.A0A(-1060539644, A03);
    }
}
