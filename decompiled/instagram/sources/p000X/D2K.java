package p000X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.D2K */
public final class D2K {
    public final Context A00;
    public final Handler A01;
    public final D3G A02;
    public final C29626D2j A03;
    public final D29 A04;
    public final D2Y A05;
    public final C29633D2q A06;
    public final HeroPlayerSetting A07;
    public final Map A08;
    public final D4X A09 = null;

    public D2K(Context context, Map map, HeroPlayerSetting heroPlayerSetting, D29 d29, Handler handler, C29626D2j d2j, C29633D2q d2q) {
        D3G d3g;
        this.A00 = context;
        this.A08 = map;
        this.A07 = heroPlayerSetting;
        this.A01 = handler;
        this.A04 = d29;
        this.A03 = d2j;
        this.A05 = new D2Y(d2j);
        if (heroPlayerSetting.A1E) {
            C29657D3q d3q = new C29657D3q();
            d3q.A03 = heroPlayerSetting.A0z;
            d3q.A02 = heroPlayerSetting.A0y;
            d3q.A00 = heroPlayerSetting.A07;
            d3q.A01 = heroPlayerSetting.A08;
            d3g = new D3G(d3q);
        } else {
            d3g = new D3G(new C29657D3q());
        }
        this.A02 = d3g;
        this.A06 = d2q;
    }

    public static String A00(D49 d49) {
        List list;
        if (d49 == null || (list = d49.A01) == null || list.isEmpty()) {
            return "";
        }
        int size = d49.A01.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((C29677D4l) d49.A01.get(i2)).A01.A04;
        }
        Arrays.sort(iArr);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i3 = size - 1;
            if (i < i3) {
                sb.append(iArr[i]);
                sb.append(":");
                i++;
            } else {
                sb.append(iArr[i3]);
                return sb.toString();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [X.D6r] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final DAR[] A01(C29626D2j d2j, HeroPlayerSetting heroPlayerSetting, VideoPlayRequest videoPlayRequest, AtomicReference atomicReference) {
        boolean equals;
        C29732D6w d6w;
        DAR d6x;
        D7w d7w = D7w.A00;
        AtomicReference atomicReference2 = atomicReference;
        if (atomicReference != null) {
            atomicReference2.set(false);
        }
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        HeroPlayerSetting heroPlayerSetting2 = heroPlayerSetting;
        if (!videoPlayRequest2.A05.A03()) {
            equals = false;
        } else {
            equals = "libvpx".equals(heroPlayerSetting2.A0e);
        }
        if (equals) {
            try {
                Class<?> cls = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer");
                Class cls2 = Boolean.TYPE;
                d6w = (C29727D6r) cls.getConstructor(new Class[]{cls2, Long.TYPE, Handler.class, C29752D7z.class, Integer.TYPE, cls2, cls2}).newInstance(new Object[]{true, Long.valueOf(heroPlayerSetting2.A0K), this.A01, this.A05, 0, false, Boolean.valueOf(heroPlayerSetting2.A1r)});
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            HeroPlayerSetting heroPlayerSetting3 = this.A07;
            Context context = this.A00;
            D3G d3g = this.A02;
            long j = heroPlayerSetting2.A0K;
            Handler handler = this.A01;
            D2Y d2y = this.A05;
            boolean z = heroPlayerSetting3.A1k;
            boolean z2 = heroPlayerSetting3.A1D;
            C29732D6w d6w2 = new C29732D6w(context, d3g, d7w, j, true, true, handler, d2y, 0);
            d6w2.A0S = z;
            d6w2.A0P = false;
            d6w2.A0T = z2;
            d6w = d6w2;
        }
        HeroPlayerSetting heroPlayerSetting4 = this.A07;
        if (videoPlayRequest2.A0M) {
            d6x = new D4Y(this.A00, this.A02, d7w, videoPlayRequest2.A05.A0G, this.A01, this.A05, heroPlayerSetting4);
        } else {
            Context context2 = this.A00;
            D3G d3g2 = this.A02;
            D3G d3g3 = d3g2;
            d6x = new C29733D6x(context2, d3g3, d7w, true, videoPlayRequest2.A05.A0G, this.A01, this.A05, (C2112099b) null, new DIV[0]);
        }
        return new DAR[]{d6w, d6x, new D6L(new C29625D2h(this, d2j), this.A01.getLooper(), new C25993Bdn(heroPlayerSetting2))};
    }
}
