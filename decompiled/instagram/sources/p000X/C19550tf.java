package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0tf  reason: invalid class name and case insensitive filesystem */
public final class C19550tf implements C19560tg {
    public static final C05110Id A02 = new C19570th();
    public final AnonymousClass0IT A00;
    public final AnonymousClass0IT A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (r5.equals("upload_failed_transient") == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        if (r1 != 1) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if (r5.equals("executing") == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r5.equals("queued") != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r5.equals("upload_failed_permanent") == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r5.equals("uploaded") == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        if (r5.equals("upload_failed_transient") == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        if (r5.equals("upload_failed_permanent") == false) goto L_0x00a3;
     */
    private void A00(C19410tR r13, DirectThreadKey directThreadKey, AnonymousClass3LS r15) {
        Integer num;
        char c;
        AnonymousClass0IT r2 = this.A01;
        C65882uZ r7 = (C65882uZ) this.A00.get();
        String str = r15.A02;
        AnonymousClass4R2 r8 = r15.A01;
        if (r7.AY2(directThreadKey) != null) {
            C58012fA AQ6 = r7.AQ6(directThreadKey, r13.A03(), r13.A05());
            if (AQ6 == null || AQ6.A0H() == null) {
                if (AQ6 == null) {
                    C13300iJ r11 = (C13300iJ) r2.get();
                    C58022fB A03 = r13.A03();
                    Object A04 = r13.A04();
                    Long l = r13.A03;
                    long j = r13.A02;
                    String A05 = r13.A05();
                    C99424Rp A022 = r13.A02();
                    AQ6 = new C58012fA();
                    AQ6.A0O(A03, A04);
                    C58012fA.A01(AQ6);
                    if (r11 != null) {
                        AQ6.A0u = r11.getId();
                    }
                    if (AQ6.A0u == null) {
                        AnonymousClass0QD.A01("Direct Message user id is null", "DirectMessage.createPendingMessage");
                    }
                    AQ6.A0m = A05;
                    AQ6.A0R(Long.valueOf(j));
                    AQ6.A0Q(l);
                    AQ6.A0h(Constants.ONE);
                    AQ6.A0L = A022;
                    AQ6.A0q = r13.A03;
                }
                char c2 = 0;
                if ("send_live_viewer_invite_message".equals(r13.A01())) {
                    int hashCode = str.hashCode();
                    if (hashCode == 1501196714) {
                        c = 1;
                    } else if (hashCode == 1885454214) {
                        c = 0;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    num = Constants.A0Y;
                    r7.A3q(directThreadKey, AQ6, num, r8);
                }
                switch (str.hashCode()) {
                    case -1090974990:
                        c2 = 1;
                        break;
                    case -948696717:
                        break;
                    case 1501196714:
                        c2 = 3;
                        break;
                    case 1563991648:
                        c2 = 4;
                        break;
                    case 1885454214:
                        c2 = 2;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0 || c2 == 1) {
                    num = Constants.A0C;
                    r7.A3q(directThreadKey, AQ6, num, r8);
                }
                if (c2 != 2) {
                    if (c2 != 3) {
                        if (c2 == 4) {
                            num = Constants.A0j;
                        } else {
                            throw new IllegalStateException(AnonymousClass000.A0E("Invalid lifecycleState: ", str));
                        }
                    }
                    num = Constants.A0Y;
                } else {
                    num = Constants.A0N;
                }
                r7.A3q(directThreadKey, AQ6, num, r8);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void BCL(C17090pf r3, AnonymousClass3LS r4) {
        C19410tR r32 = (C19410tR) r3;
        for (DirectThreadKey A002 : r32.A06()) {
            A00(r32, A002, r4);
        }
    }

    public final /* bridge */ /* synthetic */ void BCP(C17090pf r6, AnonymousClass3LS r7) {
        C19410tR r62 = (C19410tR) r6;
        C65882uZ r4 = (C65882uZ) this.A00.get();
        for (DirectThreadKey Bb8 : r62.A06()) {
            r4.Bb8(Bb8, (String) null, r62.A05());
        }
    }

    public final /* bridge */ /* synthetic */ void BCQ(C17090pf r3, AnonymousClass3LS r4, AnonymousClass3LS r5) {
        C19410tR r32 = (C19410tR) r3;
        for (DirectThreadKey A002 : r32.A06()) {
            A00(r32, A002, r5);
        }
    }

    public C19550tf(AnonymousClass0IT r1, AnonymousClass0IT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
