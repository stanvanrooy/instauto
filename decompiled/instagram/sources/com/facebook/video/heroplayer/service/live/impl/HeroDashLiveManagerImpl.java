package com.facebook.video.heroplayer.service.live.impl;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;
import p000X.C25947Bcz;
import p000X.C29603D1i;
import p000X.D21;
import p000X.D29;
import p000X.D4F;
import p000X.D4L;

public class HeroDashLiveManagerImpl {
    public final D21 A00;
    public final D29 A01;

    public HeroDashLiveManagerImpl(Context context, HeroPlayerSetting heroPlayerSetting, D4L d4l, AtomicReference atomicReference, C25947Bcz bcz, C29603D1i d1i) {
        Context context2 = context;
        this.A00 = new D21(context2, heroPlayerSetting.A0R, bcz, heroPlayerSetting, new D4F((AtomicReference) null), d1i);
        this.A01 = new D29(atomicReference, d4l);
    }
}
