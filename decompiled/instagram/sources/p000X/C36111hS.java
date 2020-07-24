package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;

/* renamed from: X.1hS  reason: invalid class name and case insensitive filesystem */
public final class C36111hS extends C36121hT {
    public int A00 = 0;
    public boolean A01 = true;
    public ArrayList A02 = new ArrayList(4);

    public final boolean A0P() {
        return true;
    }

    public final void A0A() {
        AnonymousClass1ZV r0;
        AnonymousClass1ZW r10;
        AnonymousClass1ZV r02;
        float f;
        AnonymousClass1ZV r03;
        int i = this.A00;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                r03 = this.A0f;
            } else if (i == 2) {
                r0 = this.A0g;
                r10 = r0.A05;
            } else if (i == 3) {
                r03 = this.A0a;
            } else {
                return;
            }
            r10 = r03.A05;
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            r0 = this.A0e;
            r10 = r0.A05;
        }
        int size = this.A02.size();
        AnonymousClass1ZW r2 = null;
        int i2 = 0;
        while (i2 < size) {
            AnonymousClass1ZW r4 = (AnonymousClass1ZW) this.A02.get(i2);
            if (r4.A00 == 1) {
                int i3 = this.A00;
                if (i3 == 0 || i3 == 2) {
                    f = r4.A01;
                    if (f >= f2) {
                        i2++;
                    }
                } else {
                    f = r4.A01;
                    if (f <= f2) {
                        i2++;
                    }
                }
                f2 = f;
                r2 = r4.A05;
                i2++;
            } else {
                return;
            }
        }
        r10.A05 = r2;
        r10.A01 = f2;
        r10.A02();
        int i4 = this.A00;
        if (i4 == 0) {
            r02 = this.A0f;
        } else if (i4 == 1) {
            r02 = this.A0e;
        } else if (i4 == 2) {
            r02 = this.A0a;
        } else if (i4 == 3) {
            r02 = this.A0g;
        } else {
            return;
        }
        r02.A05.A05(r2, f2);
    }

    public final void A0C(int i) {
        AnonymousClass1ZV r0;
        AnonymousClass1ZV r02;
        AnonymousClass1ZV r03;
        AnonymousClass1ZW r04;
        AnonymousClass1ZU r05 = this.A0h;
        if (r05 != null) {
            int i2 = ((AnonymousClass1ZS) r05).A01 & 2;
            boolean z = false;
            if (i2 == 2) {
                z = true;
            }
            if (z) {
                int i3 = this.A00;
                if (i3 == 0) {
                    r0 = this.A0e;
                } else if (i3 == 1) {
                    r0 = this.A0f;
                } else if (i3 == 2) {
                    r0 = this.A0g;
                } else if (i3 == 3) {
                    r0 = this.A0a;
                } else {
                    return;
                }
                AnonymousClass1ZW r2 = r0.A05;
                r2.A02 = 5;
                if (i3 == 0 || i3 == 1) {
                    this.A0g.A05.A05((AnonymousClass1ZW) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    r02 = this.A0a;
                } else {
                    this.A0e.A05.A05((AnonymousClass1ZW) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    r02 = this.A0f;
                }
                r02.A05.A05((AnonymousClass1ZW) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A02.clear();
                for (int i4 = 0; i4 < this.A00; i4++) {
                    AnonymousClass1ZU r6 = this.A01[i4];
                    if (this.A01 || r6.A0P()) {
                        int i5 = this.A00;
                        if (i5 != 0) {
                            if (i5 == 1) {
                                r03 = r6.A0f;
                            } else if (i5 == 2) {
                                r03 = r6.A0g;
                            } else if (i5 != 3) {
                                r04 = null;
                            } else {
                                r03 = r6.A0a;
                            }
                            r04 = r03.A05;
                        } else {
                            r03 = r6.A0e;
                            r04 = r03.A05;
                        }
                        if (r04 != null) {
                            this.A02.add(r04);
                            r04.A01.add(r2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        if (r11 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        if (r11 != false) goto L_0x00a1;
     */
    public final void A0J(AnonymousClass1ZY r13) {
        AnonymousClass1ZV[] r1;
        boolean z;
        Integer num;
        AnonymousClass1ZZ r12;
        AnonymousClass1ZV r0;
        C31611Za A06;
        AnonymousClass1ZZ A07;
        AnonymousClass1ZV[] r14 = this.A0u;
        r14[0] = this.A0e;
        r14[2] = this.A0g;
        r14[1] = this.A0f;
        r14[3] = this.A0a;
        int i = 0;
        while (true) {
            r1 = this.A0u;
            if (i >= r1.length) {
                break;
            }
            AnonymousClass1ZV r15 = r1[i];
            r15.A03 = r13.A09(r15);
            i++;
        }
        int i2 = this.A00;
        if (i2 >= 0 && i2 < 4) {
            AnonymousClass1ZV r8 = r1[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= this.A00) {
                    z = false;
                    break;
                }
                AnonymousClass1ZU r9 = this.A01[i3];
                if ((this.A01 || r9.A0P()) && (((i2 == 0 || i2 == 1) && r9.A0x[0] == Constants.A0C) || ((i2 == 2 || i2 == 3) && r9.A0x[1] == Constants.A0C))) {
                    z = true;
                } else {
                    i3++;
                }
            }
            z = true;
            if (i2 == 0 || i2 == 1) {
                num = this.A0h.A0x[0];
            } else {
                num = this.A0h.A0x[1];
            }
            if (num == Constants.ONE) {
                z = false;
            }
            for (int i4 = 0; i4 < this.A00; i4++) {
                AnonymousClass1ZU r2 = this.A01[i4];
                if (this.A01 || r2.A0P()) {
                    AnonymousClass1ZZ A09 = r13.A09(r2.A0u[this.A00]);
                    AnonymousClass1ZV[] r02 = r2.A0u;
                    int i5 = this.A00;
                    r02[i5].A03 = A09;
                    if (i5 == 0 || i5 == 2) {
                        AnonymousClass1ZZ r22 = r8.A03;
                        A06 = r13.A06();
                        A07 = r13.A07();
                        A07.A05 = 0;
                        A06.A02(r22, A09, A07, 0);
                    } else {
                        AnonymousClass1ZZ r23 = r8.A03;
                        A06 = r13.A06();
                        A07 = r13.A07();
                        A07.A05 = 0;
                        A06.A01(r23, A09, A07, 0);
                    }
                    int A002 = (int) (A06.A03.A00(A07) * -1.0f);
                    A06.A03.A05(r13.A08(1), (float) A002);
                    r13.A0B(A06);
                }
            }
            int i6 = this.A00;
            if (i6 == 0) {
                r13.A0F(this.A0f.A03, this.A0e.A03, 0, 6);
                if (!z) {
                    r12 = this.A0e.A03;
                    r0 = this.A0h.A0f;
                } else {
                    return;
                }
            } else if (i6 == 1) {
                r13.A0F(this.A0e.A03, this.A0f.A03, 0, 6);
                if (!z) {
                    r12 = this.A0e.A03;
                    r0 = this.A0h.A0e;
                } else {
                    return;
                }
            } else if (i6 == 2) {
                r13.A0F(this.A0a.A03, this.A0g.A03, 0, 6);
                if (!z) {
                    r12 = this.A0g.A03;
                    r0 = this.A0h.A0a;
                } else {
                    return;
                }
            } else if (i6 == 3) {
                r13.A0F(this.A0g.A03, this.A0a.A03, 0, 6);
                if (!z) {
                    r12 = this.A0g.A03;
                    r0 = this.A0h.A0g;
                } else {
                    return;
                }
            } else {
                return;
            }
            r13.A0F(r12, r0.A03, 0, 5);
        }
    }

    public final void A09() {
        super.A09();
        this.A02.clear();
    }
}
