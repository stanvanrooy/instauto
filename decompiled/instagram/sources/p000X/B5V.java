package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.B5V */
public final /* synthetic */ class B5V implements Runnable {
    public final B5W A00;

    public B5V(B5W b5w) {
        this.A00 = b5w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r6 = r2.A05.A02;
        r1 = r2.A02;
        r5 = android.os.Message.obtain();
        r5.what = r7.A00;
        r5.arg1 = r7.A01;
        r5.replyTo = r1;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r7.A02());
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.A02);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = r2.A00;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r0 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r1 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r0 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        r1.A01.BfA(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r0.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        r2.A01(2, r0.getMessage());
     */
    public final void run() {
        B5W b5w = this.A00;
        while (true) {
            synchronized (b5w) {
                if (b5w.A01 != 2) {
                    break;
                } else if (b5w.A03.isEmpty()) {
                    b5w.A00();
                    break;
                } else {
                    C25171B4r b4r = (C25171B4r) b5w.A03.poll();
                    b5w.A04.put(b4r.A01, b4r);
                    b5w.A05.A03.schedule(new B5Y(b5w, b4r), 30, TimeUnit.SECONDS);
                }
            }
        }
    }
}
