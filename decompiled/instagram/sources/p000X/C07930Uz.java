package p000X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Uz  reason: invalid class name and case insensitive filesystem */
public class C07930Uz {
    public Handler A00;
    public C07190Sc A01;
    public AnonymousClass0T1 A02;
    public C10960eC A03;
    public RealtimeSinceBootClock A04;
    public C10930e7 A05;
    public AnonymousClass0TT A06;
    public AnonymousClass0TU A07;
    public AnonymousClass0TZ A08;
    public C07460Te A09;
    public C07480Tg A0A;
    public C07500Ti A0B;
    public C07540Tm A0C;
    public C07630Tv A0D;
    public AnonymousClass00T A0E;
    public AnonymousClass00Q A0F;
    public AnonymousClass0UA A0G;
    public AnonymousClass0UC A0H;
    public AnonymousClass0UE A0I;
    public C10700dj A0J;
    public C07680Ua A0K;
    public C07710Ud A0L;
    public C10670dg A0M;
    public C07890Uv A0N;
    public C10610da A0O;
    public AnonymousClass0V0 A0P;
    public AnonymousClass0V4 A0Q;
    public C031705u A0R;
    public C031505s A0S;
    public C08220Wc A0T;
    public AtomicInteger A0U;
    public boolean A0V = false;
    public AnonymousClass0TY A0W;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0040, code lost:
        if ((!r0.A06.A02) != false) goto L_0x0042;
     */
    public final void A00(AnonymousClass0V7 r38, List list) {
        boolean z;
        AnonymousClass0TS r10;
        AnonymousClass0V7 r1 = r38;
        Context context = r1.A03;
        this.A0W = new AnonymousClass0TY(context.getApplicationContext());
        String A002 = AnonymousClass0VH.A00(r1.A0O);
        this.A07 = AnonymousClass0TU.A00;
        this.A06 = AnonymousClass0TT.A00(context);
        boolean A012 = AnonymousClass0UP.A01(context.getPackageName());
        AnonymousClass0TH.A00 = !this.A06.A02;
        C10960eC r6 = r1.A08;
        this.A03 = r6;
        if (A012) {
            z = true;
        }
        z = false;
        this.A0B = new C07500Ti(context, A002, z, r6);
        this.A05 = C10930e7.A00;
        this.A04 = RealtimeSinceBootClock.INSTANCE;
        this.A08 = new AnonymousClass0TZ(context, this.A06, r1.A0J.AG3(), r1.A0Q);
        this.A0I = new AnonymousClass0UE(context, this.A0W, r1.A04, this.A04);
        AnonymousClass0TW r18 = AnonymousClass0TW.A00;
        int i = r1.A02;
        if (i >= 0) {
            synchronized (C07340Sr.class) {
                C07340Sr.A00 = i;
            }
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
        Handler handler = r1.A04;
        this.A00 = handler;
        this.A0E = new AnonymousClass009(handler);
        this.A0F = new AnonymousClass00Q(this.A0W, A002, context, this.A04, this.A00, this.A07);
        this.A0H = new AnonymousClass0UC(this.A0W, context.getApplicationContext(), this.A04, r1.A04);
        this.A0G = new AnonymousClass0UA(context);
        this.A0P = r1.A0J;
        C07630Tv r7 = r1.A0E;
        this.A0D = r7;
        Context context2 = context;
        this.A0S = new C031505s(context2, r7, r1.A0O, r1.A08, this.A05);
        this.A0M = new C10670dg(context);
        this.A0R = new C031705u(context, this.A0D, r1.A0O, r1.A08);
        C07630Tv r5 = this.A0D;
        C031505s r4 = this.A0S;
        synchronized (r5) {
            r5.A00.add(r4);
        }
        C07630Tv r52 = this.A0D;
        C10670dg r42 = this.A0M;
        synchronized (r52) {
            r52.A00.add(r42);
        }
        this.A0D.A01();
        C07190Sc r72 = r1.A05;
        this.A01 = r72;
        AnonymousClass0T1 r62 = r1.A07;
        this.A02 = r62;
        this.A0A = new C07480Tg(context2, A002, this.A0H, this.A0G, r72, r62);
        this.A0C = new C07540Tm(context2, this.A0W, A002, this.A0H, this.A0I, this.A04, this.A05, r1.A0B, r1.A0R, this.A03);
        C08000Vg r8 = r1.A0K;
        AnonymousClass0UC r73 = this.A0H;
        C10930e7 r53 = this.A05;
        C07480Tg r63 = this.A0A;
        AnonymousClass0QT r43 = r1.A0N;
        String AIF = r1.A0F.AIF();
        r8.A00 = r53;
        r8.A01 = r63;
        r8.A02 = r73;
        r8.A03 = r43;
        r8.A04 = AIF;
        this.A09 = new C07460Te(context2, r63, this.A04, ((Boolean) r1.A0A.get()).booleanValue(), this.A03);
        this.A0U = new AtomicInteger(this.A0D.A00().A06);
        this.A0O = new C10610da(this, r1, A012, new AnonymousClass0UK(newFixedThreadPool, new AnonymousClass0UL(new AnonymousClass0YM())), newScheduledThreadPool, new C10420dH(newSingleThreadExecutor2, new AnonymousClass0VQ(), this.A03), context, r18, newSingleThreadExecutor);
        int i2 = this.A0D.A00().A0A;
        int i3 = this.A0D.A00().A09;
        if (i2 <= 0 || i3 <= 0) {
            r10 = new C10920e6();
        } else {
            r10 = new C10900e3(this.A04, i2, (long) i3);
        }
        RealtimeSinceBootClock realtimeSinceBootClock = this.A04;
        AnonymousClass0TQ r54 = r1.A0B;
        if (r54 == null) {
            r54 = new C10530dS(this);
        }
        this.A0T = new C08220Wc(realtimeSinceBootClock, r54, this.A0E, this.A0F, this.A00, this.A0D, r10, this.A02);
        AnonymousClass00T r44 = this.A0E;
        AnonymousClass00Q r55 = this.A0F;
        C07480Tg r64 = this.A0A;
        C07540Tm r74 = this.A0C;
        RealtimeSinceBootClock realtimeSinceBootClock2 = this.A04;
        this.A0Q = new AnonymousClass0V4(r44, r55, r64, r74, realtimeSinceBootClock2);
        this.A0K = new C07680Ua(context2, this.A0W, A002, this.A0U, realtimeSinceBootClock2, this.A00, this.A07);
        C10700dj r3 = new C10700dj();
        this.A0J = r3;
        r3.A00.add(new C10690di(this.A0H));
        this.A0L = new C07710Ud(context, this.A0W, A002, this.A04, this.A00, r1.A0G, this.A07);
        C07890Uv r12 = r1.A0I;
        this.A0N = r12;
        AnonymousClass0TY r30 = this.A0W;
        C07870Ut r29 = r1.A0H;
        C10380dD r28 = r1.A0L;
        String packageName = context.getPackageName();
        C10610da r27 = this.A0O;
        C08220Wc r16 = this.A0T;
        AnonymousClass0UU r26 = r1.A0F;
        AnonymousClass0V0 r25 = r1.A0J;
        AnonymousClass0V4 r24 = this.A0Q;
        C07680Ua r23 = this.A0K;
        C07710Ud r22 = this.A0L;
        AtomicInteger atomicInteger = this.A0U;
        C07480Tg r20 = this.A0A;
        AnonymousClass0T1 r19 = this.A02;
        C07540Tm r13 = this.A0C;
        Handler handler2 = this.A00;
        RealtimeSinceBootClock realtimeSinceBootClock3 = this.A04;
        C07630Tv r9 = this.A0D;
        C07690Ub r82 = r1.A0G;
        AnonymousClass0WZ r75 = r1.A0M;
        AnonymousClass0UC r65 = this.A0H;
        AnonymousClass0UE r56 = this.A0I;
        C031505s r45 = this.A0S;
        C031705u r14 = this.A0R;
        AnonymousClass0Sw r32 = new AnonymousClass0Sw(new C07370Su(Executors.newCachedThreadPool()));
        boolean z2 = r1.A0R;
        r12.A08 = r30;
        r12.A03 = context;
        r12.A0I = r29;
        r12.A0n = r28;
        r12.A0Q = packageName;
        r12.A0J = r27;
        r12.A0P = r16;
        r12.A0K = r25;
        r12.A0E = r26;
        r12.A0L = r24;
        r12.A0F = r23;
        r12.A0H = r22;
        r12.A0U = atomicInteger;
        r12.A09 = r20;
        r12.A05 = r19;
        r12.A0A = r13;
        r12.A04 = handler2;
        r12.A06 = realtimeSinceBootClock3;
        r12.A0B = r9;
        r12.A0G = r82;
        r12.A0O = r75;
        r12.A0C = r65;
        r12.A07 = r18;
        r12.A0D = r56;
        r12.A0N = r45;
        r12.A0M = r14;
        r12.A0S = r32;
        Runnable runnable = r12.A0g;
        synchronized (r16) {
            boolean z3 = false;
            if (r16.A05 == null) {
                z3 = true;
            }
            C07410Sz.A02(z3);
            r16.A05 = runnable;
        }
        C07680Ua r66 = r12.A0F;
        Runnable runnable2 = r12.A0e;
        synchronized (r66) {
            if (r66.A0M == null) {
                r66.A0M = runnable2;
                r66.A0F.A07(r66.A0C, r66.A0A, new IntentFilter(r66.A0H), r66.A0D);
                r66.A0F.A07(r66.A0C, r66.A0B, new IntentFilter(r66.A0I), r66.A0D);
                r66.A0F.A07(r66.A0C, r66.A09, new IntentFilter(r66.A0G), r66.A0D);
            }
        }
        C07710Ud r33 = r12.A0H;
        Runnable runnable3 = r12.A0f;
        synchronized (r33) {
            if (r33.A0D == null) {
                r33.A0D = runnable3;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
            r12.A0R.put(subscribeTopic.A01, subscribeTopic);
        }
        r12.A0B.A01();
        r12.A0k = r12.A0B.A00();
        r12.A0W = z2;
        r12.A0V = false;
        if (r12.A0k.A0T) {
            r12.A0V = true;
            r12.A0T.set(true);
        }
    }
}
