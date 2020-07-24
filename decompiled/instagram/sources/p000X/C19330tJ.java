package p000X;

/* renamed from: X.0tJ  reason: invalid class name and case insensitive filesystem */
public final class C19330tJ implements C19340tK {
    public static final C05110Id A0B = new C19350tL();
    public final AnonymousClass0IT A00;
    public final AnonymousClass0IT A01;
    public final AnonymousClass0IT A02;
    public final AnonymousClass0IT A03;
    public final AnonymousClass0IT A04;
    public final AnonymousClass0IT A05;
    public final AnonymousClass0IT A06;
    public final AnonymousClass0IT A07;
    public final AnonymousClass0IT A08;
    public final AnonymousClass0IT A09;
    public final AnonymousClass0IT A0A;

    public final void Auc(C17090pf r1) {
    }

    public final void Axy(C17090pf r1) {
    }

    public final void B1d(C17090pf r1) {
    }

    public final void BCM(C17090pf r1, boolean z, C06270Ok r3) {
    }

    public final void BK4(C17090pf r1, boolean z, String str) {
    }

    public final void B0J(C17090pf r11, boolean z, String str) {
        if (z) {
            String A012 = r11.A01();
            char c = 65535;
            switch (A012.hashCode()) {
                case -1824320495:
                    if (A012.equals("set_thread_theme")) {
                        c = 12;
                        break;
                    }
                    break;
                case -1822944113:
                    if (A012.equals("send_mute_thread_mentions")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1750648814:
                    if (A012.equals("change_thread_title")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1314604246:
                    if (A012.equals("send_mark_unread")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1116718624:
                    if (A012.equals("send_thread_seen_marker")) {
                        c = 0;
                        break;
                    }
                    break;
                case -620744187:
                    if (A012.equals("thread_toggle_shh_mode")) {
                        c = 11;
                        break;
                    }
                    break;
                case -35397858:
                    if (A012.equals("delete_thread")) {
                        c = 6;
                        break;
                    }
                    break;
                case 396879342:
                    if (A012.equals("end_thread")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1303580818:
                    if (A012.equals("leave_thread")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1395510759:
                    if (A012.equals("thread_move_folder")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1505604305:
                    if (A012.equals("send_mute_video_call")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1807645386:
                    if (A012.equals("send_admin_approval")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2124020921:
                    if (A012.equals("send_mute_thread")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (!((Boolean) this.A03.get()).booleanValue()) {
                        AnonymousClass3JO.A03((C65882uZ) this.A0A.get(), (C20700vX) r11, r11.A04);
                        return;
                    }
                    return;
                case 1:
                    if (!((Boolean) this.A04.get()).booleanValue()) {
                        AnonymousClass3JO.A04((C65882uZ) this.A0A.get(), (C20920vt) r11, r11.A04);
                        return;
                    }
                    return;
                case 2:
                    if (!((Boolean) this.A07.get()).booleanValue()) {
                        AnonymousClass3JO.A07((C65882uZ) this.A0A.get(), (C20980vz) r11, r11.A04);
                        return;
                    }
                    return;
                case 3:
                    if (!((Boolean) this.A06.get()).booleanValue()) {
                        AnonymousClass3JO.A06((C65882uZ) this.A0A.get(), (C21040w5) r11, r11.A04);
                        return;
                    }
                    return;
                case 4:
                    if (!((Boolean) this.A08.get()).booleanValue()) {
                        AnonymousClass3JO.A08((C65882uZ) this.A0A.get(), (C21100wB) r11, r11.A04);
                        return;
                    }
                    return;
                case 5:
                    if (!((Boolean) this.A01.get()).booleanValue()) {
                        AnonymousClass3JO.A02((C65882uZ) this.A0A.get(), (C21160wH) r11, r11.A04);
                        return;
                    }
                    return;
                case 6:
                case 7:
                case 8:
                    ((C65882uZ) this.A0A.get()).BlD(((C20570vK) r11).AY6(), Constants.A0C);
                    return;
                case 9:
                    if (!((Boolean) this.A02.get()).booleanValue()) {
                        AnonymousClass3JO.A00((C23300zv) this.A00.get(), (C21340wZ) r11, r11.A04);
                        return;
                    }
                    return;
                case 10:
                    if (!((Boolean) this.A05.get()).booleanValue()) {
                        AnonymousClass3JO.A05((C65882uZ) this.A0A.get(), (C21520wr) r11, r11.A04);
                        return;
                    }
                    return;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    AnonymousClass3JO.A09((C65882uZ) this.A0A.get(), (C21600wz) r11, r11.A04);
                    return;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    C65882uZ r7 = (C65882uZ) this.A0A.get();
                    C21630x2 r6 = (C21630x2) r11;
                    String str2 = r11.A04;
                    C66122ux AY3 = r7.AY3(r6.AY6().A00);
                    if (AY3 != null) {
                        char c2 = 65535;
                        switch (str2.hashCode()) {
                            case -1090974990:
                                if (str2.equals("executing")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -948696717:
                                if (str2.equals("queued")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 1501196714:
                                if (str2.equals("upload_failed_permanent")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1563991648:
                                if (str2.equals("uploaded")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 1885454214:
                                if (str2.equals("upload_failed_transient")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0 || c2 == 1) {
                            r7.AYA(AY3).A04(r6.A03, r6.A00);
                        } else if (c2 == 2 || c2 == 3 || c2 == 4) {
                            r7.AYA(AY3).A05(r6.A03, r6.A00, true);
                        }
                        r7.BtF(AY3.AOO());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void BCN(C17090pf r5, boolean z, AnonymousClass4R2 r7, C06270Ok r8) {
        if (!z) {
            String A012 = r5.A01();
            char c = 65535;
            switch (A012.hashCode()) {
                case -1822944113:
                    if (A012.equals("send_mute_thread_mentions")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1750648814:
                    if (A012.equals("change_thread_title")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1314604246:
                    if (A012.equals("send_mark_unread")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1116718624:
                    if (A012.equals("send_thread_seen_marker")) {
                        c = 0;
                        break;
                    }
                    break;
                case -620744187:
                    if (A012.equals("thread_toggle_shh_mode")) {
                        c = 12;
                        break;
                    }
                    break;
                case -35397858:
                    if (A012.equals("delete_thread")) {
                        c = 6;
                        break;
                    }
                    break;
                case 396879342:
                    if (A012.equals("end_thread")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1303580818:
                    if (A012.equals("leave_thread")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1395510759:
                    if (A012.equals("thread_move_folder")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1505604305:
                    if (A012.equals("send_mute_video_call")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1807645386:
                    if (A012.equals("send_admin_approval")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1904780439:
                    if (A012.equals("star_thread")) {
                        c = 10;
                        break;
                    }
                    break;
                case 2124020921:
                    if (A012.equals("send_mute_thread")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (!((Boolean) this.A03.get()).booleanValue()) {
                        AnonymousClass3JO.A03((C65882uZ) this.A0A.get(), (C20700vX) r5, r5.A04);
                        return;
                    }
                    return;
                case 1:
                    if (!((Boolean) this.A04.get()).booleanValue()) {
                        AnonymousClass3JO.A04((C65882uZ) this.A0A.get(), (C20920vt) r5, r5.A04);
                        return;
                    }
                    return;
                case 2:
                    if (!((Boolean) this.A07.get()).booleanValue()) {
                        AnonymousClass3JO.A07((C65882uZ) this.A0A.get(), (C20980vz) r5, r5.A04);
                        return;
                    }
                    return;
                case 3:
                    if (!((Boolean) this.A06.get()).booleanValue()) {
                        AnonymousClass3JO.A06((C65882uZ) this.A0A.get(), (C21040w5) r5, r5.A04);
                        return;
                    }
                    return;
                case 4:
                    if (!((Boolean) this.A08.get()).booleanValue()) {
                        AnonymousClass3JO.A08((C65882uZ) this.A0A.get(), (C21100wB) r5, r5.A04);
                        return;
                    }
                    return;
                case 5:
                    if (!((Boolean) this.A01.get()).booleanValue()) {
                        AnonymousClass3JO.A02((C65882uZ) this.A0A.get(), (C21160wH) r5, r5.A04);
                        return;
                    }
                    return;
                case 6:
                case 7:
                case 8:
                    ((C65882uZ) this.A0A.get()).BlD(((C20570vK) r5).AY6(), Constants.A0N);
                    return;
                case 9:
                    if (!((Boolean) this.A02.get()).booleanValue()) {
                        AnonymousClass3JO.A00((C23300zv) this.A00.get(), (C21340wZ) r5, r5.A04);
                        return;
                    }
                    return;
                case 10:
                    if (!((Boolean) this.A09.get()).booleanValue()) {
                        AnonymousClass3JO.A01((C23300zv) this.A00.get(), (C65882uZ) this.A0A.get(), (C21400wf) r5, r5.A04);
                        return;
                    }
                    return;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    if (!((Boolean) this.A05.get()).booleanValue()) {
                        AnonymousClass3JO.A05((C65882uZ) this.A0A.get(), (C21520wr) r5, r5.A04);
                        return;
                    }
                    return;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    AnonymousClass3JO.A09((C65882uZ) this.A0A.get(), (C21600wz) r5, r5.A04);
                    return;
                default:
                    return;
            }
        }
    }

    public C19330tJ(AnonymousClass0IT r1, AnonymousClass0IT r2, AnonymousClass0IT r3, AnonymousClass0IT r4, AnonymousClass0IT r5, AnonymousClass0IT r6, AnonymousClass0IT r7, AnonymousClass0IT r8, AnonymousClass0IT r9, AnonymousClass0IT r10, AnonymousClass0IT r11) {
        this.A00 = r1;
        this.A0A = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A07 = r5;
        this.A06 = r6;
        this.A08 = r7;
        this.A01 = r8;
        this.A02 = r9;
        this.A09 = r10;
        this.A05 = r11;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0137, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0143, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0168, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0173, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017f, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0197, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a3, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01af, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bc, code lost:
        if (r0 == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c8, code lost:
        if (r0 == false) goto L_0x000b;
     */
    public final void BCR(C17090pf r5, C06270Ok r6) {
        char c;
        String A012 = r5.A01();
        switch (A012.hashCode()) {
            case -1822944113:
                boolean equals = A012.equals("send_mute_thread_mentions");
                c = 3;
                break;
            case -1750648814:
                boolean equals2 = A012.equals("change_thread_title");
                c = 9;
                break;
            case -1314604246:
                boolean equals3 = A012.equals("send_mark_unread");
                c = 1;
                break;
            case -1116718624:
                boolean equals4 = A012.equals("send_thread_seen_marker");
                c = 0;
                break;
            case -620744187:
                boolean equals5 = A012.equals("thread_toggle_shh_mode");
                c = 12;
                break;
            case -35397858:
                boolean equals6 = A012.equals("delete_thread");
                c = 6;
                break;
            case 396879342:
                boolean equals7 = A012.equals("end_thread");
                c = 8;
                break;
            case 1303580818:
                boolean equals8 = A012.equals("leave_thread");
                c = 7;
                break;
            case 1395510759:
                boolean equals9 = A012.equals("thread_move_folder");
                c = 11;
                break;
            case 1505604305:
                boolean equals10 = A012.equals("send_mute_video_call");
                c = 4;
                break;
            case 1807645386:
                boolean equals11 = A012.equals("send_admin_approval");
                c = 5;
                break;
            case 1904780439:
                boolean equals12 = A012.equals("star_thread");
                c = 10;
                break;
            case 2124020921:
                boolean equals13 = A012.equals("send_mute_thread");
                c = 2;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (!((Boolean) this.A03.get()).booleanValue()) {
                    AnonymousClass3JO.A03((C65882uZ) this.A0A.get(), (C20700vX) r5, r5.A04);
                    return;
                }
                return;
            case 1:
                if (!((Boolean) this.A04.get()).booleanValue()) {
                    AnonymousClass3JO.A04((C65882uZ) this.A0A.get(), (C20920vt) r5, r5.A04);
                    return;
                }
                return;
            case 2:
                if (!((Boolean) this.A07.get()).booleanValue()) {
                    AnonymousClass3JO.A07((C65882uZ) this.A0A.get(), (C20980vz) r5, r5.A04);
                    return;
                }
                return;
            case 3:
                if (!((Boolean) this.A06.get()).booleanValue()) {
                    AnonymousClass3JO.A06((C65882uZ) this.A0A.get(), (C21040w5) r5, r5.A04);
                    return;
                }
                return;
            case 4:
                if (!((Boolean) this.A08.get()).booleanValue()) {
                    AnonymousClass3JO.A08((C65882uZ) this.A0A.get(), (C21100wB) r5, r5.A04);
                    return;
                }
                return;
            case 5:
                if (!((Boolean) this.A01.get()).booleanValue()) {
                    AnonymousClass3JO.A02((C65882uZ) this.A0A.get(), (C21160wH) r5, r5.A04);
                    return;
                }
                return;
            case 6:
            case 7:
            case 8:
                ((C65882uZ) this.A0A.get()).BbZ(((C20570vK) r5).AY6());
                return;
            case 9:
                if (!((Boolean) this.A02.get()).booleanValue()) {
                    AnonymousClass3JO.A00((C23300zv) this.A00.get(), (C21340wZ) r5, r5.A04);
                    return;
                }
                return;
            case 10:
                if (!((Boolean) this.A09.get()).booleanValue()) {
                    AnonymousClass3JO.A01((C23300zv) this.A00.get(), (C65882uZ) this.A0A.get(), (C21400wf) r5, r5.A04);
                    return;
                }
                return;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                if (!((Boolean) this.A05.get()).booleanValue()) {
                    AnonymousClass3JO.A05((C65882uZ) this.A0A.get(), (C21520wr) r5, r5.A04);
                    return;
                }
                return;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                AnonymousClass3JO.A09((C65882uZ) this.A0A.get(), (C21600wz) r5, r5.A04);
                return;
            default:
                return;
        }
    }
}
