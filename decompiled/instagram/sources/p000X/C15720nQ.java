package p000X;

import android.os.SystemClock;
import java.util.UUID;

/* renamed from: X.0nQ  reason: invalid class name and case insensitive filesystem */
public final class C15720nQ implements C14250k8 {
    public final C13960jX A00;
    public final C16340oR A01;
    public final AnonymousClass0R7 A02;
    public final C14250k8 A03;
    public final C16350oS A04 = new C16350oS(this);

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0124, code lost:
        r3.A0B = r4;
        r3.A00 = r5;
        r3.A0E = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    public final C26211Cc startRequest(AnonymousClass1C4 r7, C256019m r8, AnonymousClass1CB r9) {
        String str;
        boolean z;
        C13960jX r2 = this.A00;
        synchronized (r2) {
            String uri = r7.A04.toString();
            if (r2.A03 != null) {
                synchronized (r2.A07) {
                    str = (String) r2.A03.A02(uri);
                    if (str == null) {
                        str = C13960jX.A00(r2, uri);
                        r2.A03.A04(uri, str);
                    }
                }
            } else {
                str = C13960jX.A00(r2, uri);
            }
            if (!r2.A0B) {
                AnonymousClass1CW r3 = (AnonymousClass1CW) r2.A00.get(r7);
                if (r3 == null) {
                    r3 = new AnonymousClass1CW(str, AnonymousClass0NT.A06(r2.A02.getActiveNetworkInfo()), C15700nO.A00().A01());
                    r2.A00.put(r7, r3);
                }
                r3.A06 = System.currentTimeMillis();
                r3.A07 = SystemClock.elapsedRealtime();
                if (r7.A06.get("InstagramTraceToken") != null) {
                    r3.A0C = (String) r7.A06.get("InstagramTraceToken");
                }
                if (r7.A06.get("InstagramTraceEnabled") != null) {
                    r3.A0E = ((Boolean) r7.A06.get("InstagramTraceEnabled")).booleanValue();
                }
                if (r7.A06.get("Cdn") != null) {
                    r3.A08 = new AnonymousClass435((AnonymousClass434) r7.A06.get("Cdn"));
                }
                C26141Bv r0 = r7.A02;
                if (r0 != null) {
                    r3.A03 = r0.getContentLength();
                }
            } else {
                CBV cbv = (CBV) r2.A01.get(r7);
                if (cbv == null) {
                    double A012 = C15700nO.A00().A01();
                    C15920nk r4 = r8.A05;
                    cbv = new CBV(str, A012, r4);
                    C116514zQ r02 = r2.A06;
                    AnonymousClass0a4.A06(r02);
                    int A002 = r02.A00(r4);
                    if (A002 != -1) {
                        z = true;
                        if (A002 != 1) {
                            if (r2.A0A.nextInt(A002) == 0) {
                            }
                        }
                        if (z) {
                            int A003 = r2.A06.A00(r8.A05);
                            String uuid = UUID.randomUUID().toString();
                            switch (r8.A05.ordinal()) {
                                case 0:
                                case 6:
                                    break;
                                case 1:
                                case 2:
                                    r7.A01("x-fb-client-cdn-log-appid", r2.A08);
                                    r7.A01("x-fb-client-cdn-log-clientid", r2.A09);
                                    r7.A01("x-fb-client-cdn-log-transid", uuid);
                                    break;
                                case 3:
                                case 4:
                                case 7:
                                    r7.A01("X-IG-Client-Request-UUID", uuid);
                                    break;
                                default:
                                    throw new IllegalStateException("not supported requestType");
                            }
                        }
                        r2.A01.put(r7, cbv);
                    }
                    z = false;
                    if (z) {
                    }
                    r2.A01.put(r7, cbv);
                }
                cbv.A07 = System.currentTimeMillis();
                C26141Bv r03 = r7.A02;
                if (r03 != null) {
                    cbv.A04 = r03.getContentLength();
                }
            }
        }
        r9.A04(this.A04);
        if (this.A02 != null && r8.A05 == C15920nk.Image) {
            double A013 = C15700nO.A00().A01();
            AnonymousClass1GS r22 = r8.A04;
            if (r22 != null) {
                this.A02.Als(r22.A00.A03, A013, "Stub");
            }
        }
        if (this.A01 != null && r8.A05 == C15920nk.Video) {
            AnonymousClass17R.A00().A01(r7.A04.toString().hashCode(), "NETWORK", -1);
        }
        AnonymousClass1CX.A00().Amw(r8);
        return this.A03.startRequest(r7, r8, r9);
    }

    public C15720nQ(C14250k8 r2, C13960jX r3, AnonymousClass0R7 r4, C16340oR r5) {
        this.A00 = r3;
        this.A03 = r2;
        this.A02 = r4;
        this.A01 = r5;
    }
}
