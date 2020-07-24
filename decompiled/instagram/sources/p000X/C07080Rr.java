package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.0Rr  reason: invalid class name and case insensitive filesystem */
public final class C07080Rr {
    public static final Random A07 = new Random();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public int[] A05;
    public String A06;

    private AnonymousClass0P4 A00(long j, Integer num) {
        int i;
        if (this.A05 == null) {
            return null;
        }
        long j2 = this.A04;
        if (j > j2) {
            i = (int) Math.min(64, (j - this.A03) + 1);
        } else {
            i = (int) ((j2 - this.A03) + 1);
        }
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("time_spent_bit_array", (AnonymousClass0RN) null);
        A002.A0G("tos_id", this.A06);
        A002.A0F(TraceFieldType.StartTime, Long.valueOf(this.A03));
        A002.A0G("tos_array", Arrays.toString(this.A05));
        A002.A0E("tos_len", Integer.valueOf(i));
        A002.A0E("tos_seq", Integer.valueOf(this.A02));
        A002.A0E("tos_cum", Integer.valueOf(this.A01));
        if (num == Constants.A0N) {
            A002.A0G("trigger", "clock_change");
        }
        return A002;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    public final void A01(AnonymousClass0RU r8, long j, Integer num) {
        String str;
        AnonymousClass0P4 A002;
        int i;
        if (num == Constants.A0C) {
            str = AppStateModule.APP_STATE_BACKGROUND;
        } else {
            if (num == Constants.ZERO) {
                str = "foreground";
            }
            switch (num.intValue()) {
                case 0:
                case 2:
                case 3:
                case 5:
                    if (this.A05 != null) {
                        A002 = A00(j / 1000, num);
                        this.A05 = null;
                        this.A04 = 0;
                        break;
                    }
                case 1:
                    long j2 = j / 1000;
                    if (j2 > this.A04) {
                        long j3 = j2 - this.A03;
                        if (j3 < 0 || j3 >= 64) {
                            A002 = A00(j2, Constants.ONE);
                            this.A05 = null;
                            this.A04 = 0;
                        } else {
                            A002 = null;
                        }
                        int[] iArr = this.A05;
                        if (iArr == null) {
                            this.A04 = j2;
                            this.A03 = j2;
                            int i2 = this.A00;
                            int[] iArr2 = new int[i2];
                            this.A05 = iArr2;
                            i = 1;
                            iArr2[0] = 1;
                            for (int i3 = 1; i3 < i2; i3++) {
                                iArr2[i3] = 0;
                            }
                            this.A02++;
                        } else {
                            int i4 = (int) j3;
                            int i5 = i4 >> 5;
                            i = 1;
                            iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
                            this.A04 = j2;
                        }
                        this.A01 += i;
                        break;
                    }
                    break;
                default:
                    A002 = null;
                    break;
            }
            if (A002 == null) {
                r8.BcG(A002);
                return;
            }
            return;
        }
        AnonymousClass0P4 A012 = AnonymousClass0P4.A01("app_state", AnonymousClass1BC.A02.A00);
        A012.A0G("state", str);
        r8.BcG(A012);
        switch (num.intValue()) {
            case 0:
            case 2:
            case 3:
            case 5:
                break;
            case 1:
                break;
        }
        if (A002 == null) {
        }
    }

    public AnonymousClass0P4 getTimeSpentEvent(long j) {
        return A00(j / 1000, Constants.A0Y);
    }

    public C07080Rr() {
        this.A00 = 1;
        this.A00 = (int) Math.ceil(2.0d);
        this.A06 = Integer.toString(Math.abs(A07.nextInt()), 36);
        this.A02 = -1;
        this.A01 = 0;
        this.A05 = null;
    }
}
