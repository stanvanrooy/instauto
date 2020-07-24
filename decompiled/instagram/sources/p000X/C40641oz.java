package p000X;

import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.1oz  reason: invalid class name and case insensitive filesystem */
public final class C40641oz {
    public C40661p1 A00 = C40661p1.A00;
    public final LruCache A01;
    public final C40651p0 A02;
    public final HeroPlayerSetting A03;

    public C40641oz(HeroPlayerSetting heroPlayerSetting, C40651p0 r4) {
        this.A03 = heroPlayerSetting;
        this.A02 = r4;
        this.A01 = new C40681p3(this, heroPlayerSetting.A0B);
    }
}
