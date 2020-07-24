package p000X;

import android.content.Context;
import android.util.Log;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.0Ck  reason: invalid class name and case insensitive filesystem */
public final class C04100Ck {
    public static C04100Ck A2M;
    public static final Object A2N = new Object();
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final double A07;
    public final double A08;
    public final double A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final int A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final long A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final boolean A1J;
    public final boolean A1K;
    public final boolean A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final boolean A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;
    public final boolean A1W;
    public final boolean A1X;
    public final boolean A1Y;
    public final boolean A1Z;
    public final boolean A1a;
    public final boolean A1b;
    public final boolean A1c;
    public final boolean A1d;
    public final boolean A1e;
    public final boolean A1f;
    public final boolean A1g;
    public final boolean A1h;
    public final boolean A1i;
    public final boolean A1j;
    public final boolean A1k;
    public final boolean A1l;
    public final boolean A1m;
    public final boolean A1n;
    public final boolean A1o;
    public final boolean A1p;
    public final boolean A1q;
    public final boolean A1r;
    public final boolean A1s;
    public final boolean A1t;
    public final boolean A1u;
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final boolean A1y;
    public final boolean A1z;
    public final boolean A20;
    public final boolean A21;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final boolean A25;
    public final boolean A26;
    public final boolean A27;
    public final boolean A28;
    public final boolean A29;
    public final boolean A2A;
    public final boolean A2B;
    public final boolean A2C;
    public final boolean A2D;
    public final boolean A2E;
    public final boolean A2F;
    public final boolean A2G;
    public final boolean A2H;
    public final boolean A2I;
    public final boolean A2J;
    public final boolean A2K;
    public final boolean A2L;

    public static boolean A07(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining() || byteBuffer.getInt() != 1) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C04100Ck)) {
            return false;
        }
        C04100Ck r7 = (C04100Ck) obj;
        return this.A18 == r7.A18 && this.A0z == r7.A0z && this.A10 == r7.A10 && this.A0y == r7.A0y && this.A0v == r7.A0v && this.A0E == r7.A0E && this.A0w == r7.A0w && this.A0F == r7.A0F && this.A0x == r7.A0x && this.A0G == r7.A0G && this.A2L == r7.A2L && this.A0j == r7.A0j && this.A1t == r7.A1t && this.A0T == r7.A0T && this.A20 == r7.A20 && this.A0X == r7.A0X && this.A1E == r7.A1E && this.A0O == r7.A0O && this.A0u == r7.A0u && this.A0D == r7.A0D && this.A2H == r7.A2H && this.A2G == r7.A2G && this.A16 == r7.A16 && this.A15 == r7.A15 && this.A2E == r7.A2E && this.A24 == r7.A24 && this.A2A == r7.A2A && this.A0g == r7.A0g && this.A2D == r7.A2D && this.A0h == r7.A0h && this.A25 == r7.A25 && this.A0b == r7.A0b && this.A28 == r7.A28 && this.A0e == r7.A0e && this.A27 == r7.A27 && this.A0d == r7.A0d && this.A29 == r7.A29 && this.A0f == r7.A0f && this.A26 == r7.A26 && this.A0c == r7.A0c && this.A2C == r7.A2C && this.A2B == r7.A2B && this.A23 == r7.A23 && this.A1e == r7.A1e && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A03 == r7.A03 && this.A09 == r7.A09 && this.A07 == r7.A07 && this.A08 == r7.A08 && this.A04 == r7.A04 && this.A00 == r7.A00 && this.A19 == r7.A19 && this.A1Z == r7.A1Z && this.A1d == r7.A1d && this.A2I == r7.A2I && this.A1I == r7.A1I && this.A1X == r7.A1X && this.A1h == r7.A1h && this.A1U == r7.A1U && this.A1V == r7.A1V && this.A1M == r7.A1M && this.A1T == r7.A1T && this.A1f == r7.A1f && this.A1G == r7.A1G && this.A1a == r7.A1a && this.A1j == r7.A1j && this.A1W == r7.A1W && this.A1i == r7.A1i && this.A1H == r7.A1H && this.A1c == r7.A1c && this.A1k == r7.A1k && this.A05 == r7.A05 && this.A1b == r7.A1b && this.A0P == r7.A0P && this.A0Q == r7.A0Q && this.A1S == r7.A1S && this.A1K == r7.A1K && this.A1J == r7.A1J && this.A1N == r7.A1N && this.A1Q == r7.A1Q && this.A1Y == r7.A1Y && this.A1P == r7.A1P && this.A1O == r7.A1O && this.A1F == r7.A1F && this.A1g == r7.A1g && this.A1R == r7.A1R && this.A1L == r7.A1L && this.A2J == r7.A2J && this.A06 == r7.A06 && this.A1o == r7.A1o && this.A0S == r7.A0S && this.A1m == r7.A1m && this.A0R == r7.A0R && this.A1n == r7.A1n && this.A0k == r7.A0k && this.A1l == r7.A1l && this.A0A == r7.A0A && this.A1s == r7.A1s && this.A0C == r7.A0C && this.A1r == r7.A1r && this.A0B == r7.A0B && this.A1q == r7.A1q && this.A1p == r7.A1p && this.A1z == r7.A1z && this.A1x == r7.A1x && this.A1y == r7.A1y && this.A0W == r7.A0W && this.A1w == r7.A1w && this.A0V == r7.A0V && this.A1v == r7.A1v && this.A0U == r7.A0U && this.A0s == r7.A0s && this.A1u == r7.A1u && this.A11 == r7.A11 && this.A0a == r7.A0a && this.A12 == r7.A12 && this.A0i == r7.A0i && this.A2F == r7.A2F && this.A0p == r7.A0p && this.A0t == r7.A0t && this.A17 == r7.A17 && this.A0m == r7.A0m && this.A0l == r7.A0l && this.A13 == r7.A13 && this.A0r == r7.A0r && this.A0q == r7.A0q && this.A21 == r7.A21 && this.A0Y == r7.A0Y && this.A22 == r7.A22 && this.A0Z == r7.A0Z && this.A14 == r7.A14 && this.A2K == r7.A2K && this.A0n == r7.A0n && this.A0o == r7.A0o && this.A1D == r7.A1D && this.A1C == r7.A1C && this.A0N == r7.A0N && this.A0H == r7.A0H && this.A0M == r7.A0M && this.A0I == r7.A0I && this.A0J == r7.A0J && this.A0L == r7.A0L && this.A0K == r7.A0K && this.A1A == r7.A1A && this.A1B == r7.A1B;
    }

    public static double A00(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return 0.0d;
        }
        return byteBuffer.getDouble();
    }

    public static C04100Ck A02() {
        return new C04100Ck(false, false, false, false, false, 0, false, 0, false, 0, false, 0, false, 0, false, 0, false, 0, false, 0, false, false, false, false, false, false, false, 0, false, 0, false, 0, false, 0, false, 0, false, 0, false, 0, false, false, false, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0d, false, 9, 1, false, false, false, false, false, false, false, false, false, false, false, false, false, 0.0d, false, 0, false, 0, false, 0, false, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false, false, false, false, false, 0, false, 0, false, 0, false, false, false, 0, false, 0, false, false, false, false, false, false, false, false, false, false, 0, false, 0, false, false, false, false, false, false, 0, 0, 10, 0, 0, 0, 1000, false, false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x0315=Splitter:B:67:0x0315, B:52:0x02eb=Splitter:B:52:0x02eb} */
    public static C04100Ck A03(Context context) {
        C04100Ck A022;
        long j;
        float f;
        float f2;
        float f3;
        if (A2M == null) {
            synchronized (A2N) {
                if (A2M == null) {
                    Context context2 = context;
                    if (!(!A04(context2).exists())) {
                        A022 = A02();
                    } else {
                        try {
                            File fileStreamPath = context2.getFileStreamPath("risky_startup_config");
                            if (!fileStreamPath.exists()) {
                                A022 = A02();
                            } else {
                                FileInputStream fileInputStream = null;
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileStreamPath);
                                    try {
                                        byte[] bArr = new byte[1280];
                                        int min = Math.min(1280, 1280);
                                        int i = 0;
                                        int i2 = 0;
                                        while (i < min) {
                                            i2 = fileInputStream2.read(bArr, i, min - i);
                                            if (i2 < 0) {
                                                break;
                                            }
                                            i += i2;
                                        }
                                        int i3 = -1;
                                        if (!(i2 == -1 && i == 0)) {
                                            i3 = i;
                                        }
                                        if (i3 <= 0) {
                                            A022 = A02();
                                        } else {
                                            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i3);
                                            boolean A072 = A07(wrap);
                                            boolean A073 = A07(wrap);
                                            boolean A074 = A07(wrap);
                                            boolean A075 = A07(wrap);
                                            boolean A076 = A07(wrap);
                                            int A012 = A01(wrap, 0);
                                            boolean A077 = A07(wrap);
                                            int A013 = A01(wrap, 0);
                                            boolean A078 = A07(wrap);
                                            int A014 = A01(wrap, 0);
                                            boolean A079 = A07(wrap);
                                            int A015 = A01(wrap, 0);
                                            boolean A0710 = A07(wrap);
                                            int A016 = A01(wrap, 0);
                                            boolean A0711 = A07(wrap);
                                            int A017 = A01(wrap, 0);
                                            boolean A0712 = A07(wrap);
                                            int A018 = A01(wrap, 0);
                                            boolean A0713 = A07(wrap);
                                            int A019 = A01(wrap, 0);
                                            boolean A0714 = A07(wrap);
                                            boolean A0715 = A07(wrap);
                                            boolean A0716 = A07(wrap);
                                            boolean A0717 = A07(wrap);
                                            boolean A0718 = A07(wrap);
                                            boolean A0719 = A07(wrap);
                                            boolean A0720 = A07(wrap);
                                            int A0110 = A01(wrap, 0);
                                            boolean A0721 = A07(wrap);
                                            int A0111 = A01(wrap, 0);
                                            boolean A0722 = A07(wrap);
                                            int A0112 = A01(wrap, 0);
                                            boolean A0723 = A07(wrap);
                                            int A0113 = A01(wrap, 0);
                                            boolean A0724 = A07(wrap);
                                            int A0114 = A01(wrap, 0);
                                            boolean A0725 = A07(wrap);
                                            int A0115 = A01(wrap, 0);
                                            boolean A0726 = A07(wrap);
                                            int A0116 = A01(wrap, 0);
                                            boolean A0727 = A07(wrap);
                                            boolean A0728 = A07(wrap);
                                            boolean A0729 = A07(wrap);
                                            boolean A0730 = A07(wrap);
                                            double A002 = A00(wrap);
                                            double A003 = A00(wrap);
                                            double A004 = A00(wrap);
                                            double A005 = A00(wrap);
                                            double A006 = A00(wrap);
                                            double A007 = A00(wrap);
                                            double A008 = A00(wrap);
                                            double A009 = A00(wrap);
                                            boolean A0731 = A07(wrap);
                                            boolean A0732 = A07(wrap);
                                            boolean A0733 = A07(wrap);
                                            boolean A0734 = A07(wrap);
                                            boolean A0735 = A07(wrap);
                                            boolean A0736 = A07(wrap);
                                            boolean A0737 = A07(wrap);
                                            boolean A0738 = A07(wrap);
                                            boolean A0739 = A07(wrap);
                                            boolean A0740 = A07(wrap);
                                            boolean A0741 = A07(wrap);
                                            boolean A0742 = A07(wrap);
                                            boolean A0743 = A07(wrap);
                                            boolean A0744 = A07(wrap);
                                            boolean A0745 = A07(wrap);
                                            boolean A0746 = A07(wrap);
                                            boolean A0747 = A07(wrap);
                                            boolean A0748 = A07(wrap);
                                            boolean A0749 = A07(wrap);
                                            boolean A0750 = A07(wrap);
                                            double A0010 = A00(wrap);
                                            boolean A0751 = A07(wrap);
                                            int A0117 = A01(wrap, 9);
                                            int A0118 = A01(wrap, 1);
                                            boolean A0752 = A07(wrap);
                                            boolean A0753 = A07(wrap);
                                            boolean A0754 = A07(wrap);
                                            boolean A0755 = A07(wrap);
                                            boolean A0756 = A07(wrap);
                                            boolean A0757 = A07(wrap);
                                            boolean A0758 = A07(wrap);
                                            boolean A0759 = A07(wrap);
                                            boolean A0760 = A07(wrap);
                                            boolean A0761 = A07(wrap);
                                            boolean A0762 = A07(wrap);
                                            boolean A0763 = A07(wrap);
                                            boolean A0764 = A07(wrap);
                                            double A0011 = A00(wrap);
                                            boolean A0765 = A07(wrap);
                                            int A0119 = A01(wrap, 0);
                                            boolean A0766 = A07(wrap);
                                            int A0120 = A01(wrap, 0);
                                            boolean A0767 = A07(wrap);
                                            if (!wrap.hasRemaining()) {
                                                j = 0;
                                            } else {
                                                j = wrap.getLong();
                                            }
                                            boolean A0768 = A07(wrap);
                                            if (!wrap.hasRemaining()) {
                                                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                            } else {
                                                f = wrap.getFloat();
                                            }
                                            boolean A0769 = A07(wrap);
                                            if (!wrap.hasRemaining()) {
                                                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                            } else {
                                                f2 = wrap.getFloat();
                                            }
                                            boolean A0770 = A07(wrap);
                                            if (!wrap.hasRemaining()) {
                                                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                            } else {
                                                f3 = wrap.getFloat();
                                            }
                                            A022 = new C04100Ck(A072, A073, A074, A075, A076, A012, A077, A013, A078, A014, A079, A015, A0710, A016, A0711, A017, A0712, A018, A0713, A019, A0714, A0715, A0716, A0717, A0718, A0719, A0720, A0110, A0721, A0111, A0722, A0112, A0723, A0113, A0724, A0114, A0725, A0115, A0726, A0116, A0727, A0728, A0729, A0730, A002, A003, A004, A005, A006, A007, A008, A009, A0731, A0732, A0733, A0734, A0735, A0736, A0737, A0738, A0739, A0740, A0741, A0742, A0743, A0744, A0745, A0746, A0747, A0748, A0749, A0750, A0010, A0751, A0117, A0118, A0752, A0753, A0754, A0755, A0756, A0757, A0758, A0759, A0760, A0761, A0762, A0763, A0764, A0011, A0765, A0119, A0766, A0120, A0767, j, A0768, f, A0769, f2, A0770, f3, A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A01(wrap, 0), A07(wrap), A01(wrap, 0), A07(wrap), A01(wrap, 0), A07(wrap), A07(wrap), A07(wrap), A01(wrap, 0), A07(wrap), A01(wrap, 0), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A01(wrap, 0), A07(wrap), A01(wrap, 0), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A07(wrap), A01(wrap, 0), A01(wrap, 0), A01(wrap, 10), A01(wrap, 0), A01(wrap, 0), A01(wrap, 0), A01(wrap, 1000), A07(wrap), A07(wrap));
                                        }
                                        A06(fileInputStream2);
                                    } catch (IOException | BufferUnderflowException e) {
                                        e = e;
                                        fileInputStream = fileInputStream2;
                                        try {
                                            Log.e("RiskyStartupConfig", String.format("Cannot read file %s", new Object[]{"risky_startup_config"}), e);
                                            A022 = A02();
                                            A06(fileInputStream);
                                            String.format("Current Read Config: %s", new Object[]{A022});
                                            A05(context2);
                                            A2M = A022;
                                            return A2M;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileInputStream2 = fileInputStream;
                                            A06(fileInputStream2);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        A06(fileInputStream2);
                                        throw th;
                                    }
                                } catch (IOException | BufferUnderflowException e2) {
                                    e = e2;
                                    Log.e("RiskyStartupConfig", String.format("Cannot read file %s", new Object[]{"risky_startup_config"}), e);
                                    A022 = A02();
                                    A06(fileInputStream);
                                    String.format("Current Read Config: %s", new Object[]{A022});
                                    A05(context2);
                                    A2M = A022;
                                    return A2M;
                                }
                            }
                            String.format("Current Read Config: %s", new Object[]{A022});
                            A05(context2);
                        } catch (Throwable th3) {
                            A05(context2);
                            throw th3;
                        }
                    }
                    A2M = A022;
                }
            }
        }
        return A2M;
    }

    public static void A05(Context context) {
        File A042 = A04(context);
        if (!A042.exists()) {
            try {
                if (!A042.createNewFile()) {
                    Log.w("RiskyStartupConfig", String.format("Could not create has read marker file for %s", new Object[]{A042.getName()}));
                }
            } catch (IOException e) {
                Log.e("RiskyStartupConfig", String.format("Error creating has read marker file for %s", new Object[]{A042.getName()}), e);
            }
        }
    }

    public static void A06(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.w("RiskyStartupConfig", String.format("error closing %s", new Object[]{closeable}), e);
            }
        }
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.A18 ? 1 : 0) + true) * 31) + (this.A0z ? 1 : 0)) * 31) + (this.A10 ? 1 : 0)) * 31) + (this.A0y ? 1 : 0)) * 31) + (this.A0v ? 1 : 0)) * 31) + this.A0E) * 31) + (this.A0w ? 1 : 0)) * 31) + this.A0F) * 31) + (this.A0x ? 1 : 0)) * 31) + this.A0G) * 31) + (this.A2L ? 1 : 0)) * 31) + this.A0j) * 31) + (this.A1t ? 1 : 0)) * 31) + this.A0T) * 31) + (this.A20 ? 1 : 0)) * 31) + this.A0X) * 31) + (this.A1E ? 1 : 0)) * 31) + this.A0O) * 31) + (this.A0u ? 1 : 0)) * 31) + this.A0D) * 31) + (this.A2H ? 1 : 0)) * 31) + (this.A2G ? 1 : 0)) * 31) + (this.A16 ? 1 : 0)) * 31) + (this.A15 ? 1 : 0)) * 31) + (this.A2E ? 1 : 0)) * 31) + (this.A24 ? 1 : 0)) * 31) + (this.A2A ? 1 : 0)) * 31) + this.A0g) * 31) + (this.A2D ? 1 : 0)) * 31) + this.A0h) * 31) + (this.A25 ? 1 : 0)) * 31) + this.A0b) * 31) + (this.A27 ? 1 : 0)) * 31) + this.A0d) * 31) + (this.A29 ? 1 : 0)) * 31) + this.A0f) * 31) + (this.A26 ? 1 : 0)) * 31) + this.A0c) * 31) + (this.A2C ? 1 : 0)) * 31) + (this.A2B ? 1 : 0)) * 31) + (this.A23 ? 1 : 0)) * 31) + (this.A1e ? 1 : 0)) * 31) + Double.valueOf(this.A01).hashCode()) * 31) + Double.valueOf(this.A02).hashCode()) * 31) + Double.valueOf(this.A03).hashCode()) * 31) + Double.valueOf(this.A09).hashCode()) * 31) + Double.valueOf(this.A07).hashCode()) * 31) + Double.valueOf(this.A08).hashCode()) * 31) + Double.valueOf(this.A04).hashCode()) * 31) + Double.valueOf(this.A00).hashCode()) * 31) + (this.A19 ? 1 : 0)) * 31) + (this.A1Z ? 1 : 0)) * 31) + (this.A1d ? 1 : 0)) * 31) + (this.A2I ? 1 : 0)) * 31) + (this.A1I ? 1 : 0)) * 31) + (this.A1X ? 1 : 0)) * 31) + (this.A1h ? 1 : 0)) * 31) + (this.A1U ? 1 : 0)) * 31) + (this.A1V ? 1 : 0)) * 31) + (this.A1M ? 1 : 0)) * 31) + (this.A1T ? 1 : 0)) * 31) + (this.A1f ? 1 : 0)) * 31) + (this.A1G ? 1 : 0)) * 31) + (this.A1a ? 1 : 0)) * 31) + (this.A1j ? 1 : 0)) * 31) + (this.A1W ? 1 : 0)) * 31) + (this.A1i ? 1 : 0)) * 31) + (this.A1H ? 1 : 0)) * 31) + (this.A1c ? 1 : 0)) * 31) + (this.A1k ? 1 : 0)) * 31) + Double.valueOf(this.A05).hashCode()) * 31) + (this.A1b ? 1 : 0)) * 31) + this.A0P) * 31) + this.A0Q) * 31) + (this.A1S ? 1 : 0)) * 31) + (this.A1K ? 1 : 0)) * 31) + (this.A1J ? 1 : 0)) * 31) + (this.A1N ? 1 : 0)) * 31) + (this.A1Q ? 1 : 0)) * 31) + (this.A1Y ? 1 : 0)) * 31) + (this.A1P ? 1 : 0)) * 31) + (this.A1O ? 1 : 0)) * 31) + (this.A1F ? 1 : 0)) * 31) + (this.A1g ? 1 : 0)) * 31) + (this.A1R ? 1 : 0)) * 31) + (this.A1L ? 1 : 0)) * 31) + (this.A2J ? 1 : 0)) * 31) + Double.valueOf(this.A06).hashCode()) * 31) + (this.A1o ? 1 : 0)) * 31) + this.A0S) * 31) + (this.A1m ? 1 : 0)) * 31) + this.A0R) * 31) + (this.A1n ? 1 : 0)) * 31) + Long.valueOf(this.A0k).hashCode()) * 31) + (this.A1l ? 1 : 0)) * 31) + Float.valueOf(this.A0A).hashCode()) * 31) + (this.A1s ? 1 : 0)) * 31) + Float.valueOf(this.A0C).hashCode()) * 31) + (this.A1r ? 1 : 0)) * 31) + Float.valueOf(this.A0B).hashCode()) * 31) + (this.A1q ? 1 : 0)) * 31) + (this.A1p ? 1 : 0)) * 31) + (this.A1z ? 1 : 0)) * 31) + (this.A1x ? 1 : 0)) * 31) + (this.A1y ? 1 : 0)) * 31) + this.A0W) * 31) + (this.A1w ? 1 : 0)) * 31) + this.A0V) * 31) + (this.A1v ? 1 : 0)) * 31) + this.A0U) * 31) + (this.A0s ? 1 : 0)) * 31) + (this.A1u ? 1 : 0)) * 31) + (this.A11 ? 1 : 0)) * 31) + this.A0a) * 31) + (this.A12 ? 1 : 0)) * 31) + this.A0i) * 31) + (this.A2F ? 1 : 0)) * 31) + (this.A0p ? 1 : 0)) * 31) + (this.A0t ? 1 : 0)) * 31) + (this.A17 ? 1 : 0)) * 31) + (this.A0m ? 1 : 0)) * 31) + (this.A0l ? 1 : 0)) * 31) + (this.A13 ? 1 : 0)) * 31) + (this.A0r ? 1 : 0)) * 31) + (this.A0q ? 1 : 0)) * 31) + (this.A21 ? 1 : 0)) * 31) + this.A0Y) * 31) + (this.A22 ? 1 : 0)) * 31) + this.A0Z) * 31) + (this.A14 ? 1 : 0)) * 31) + (this.A2K ? 1 : 0)) * 31) + (this.A0n ? 1 : 0)) * 31) + (this.A0o ? 1 : 0)) * 31) + (this.A1D ? 1 : 0)) * 31) + (this.A1C ? 1 : 0)) * 31) + this.A0N) * 31) + this.A0H) * 31) + this.A0M) * 31) + this.A0I) * 31) + this.A0J) * 31) + this.A0L) * 31) + this.A0K) * 31) + (this.A1A ? 1 : 0)) * 31) + (this.A1B ? 1 : 0);
    }

    public final String toString() {
        return "[" + getClass().getSimpleName() + " enableJit: " + this.A18 + " disableJit: " + this.A0z + " disableProfiler: " + this.A10 + " createCustomJitOrPgoOptions: " + this.A0y + " code_cache_initial_capacity_enabled: " + this.A0v + " code_cache_initial_capacity: " + this.A0E + " code_cache_max_capacity_enabled: " + this.A0w + " code_cache_max_capacity: " + this.A0F + " compile_threshold_enabled: " + this.A0x + " compile_threshold: " + this.A0G + " warmup_threshold_enabled: " + this.A2L + " warmup_threshold: " + this.A0j + " osr_threshold_enabled: " + this.A1t + " osr_threshold: " + this.A0T + " priority_thread_weight_enabled: " + this.A20 + " priority_thread_weight: " + this.A0X + " invoke_transition_weight_enabled: " + this.A1E + " invoke_transition_weight: " + this.A0O + " code_cache_capacity_enabled: " + this.A0u + " code_cache_capacity: " + this.A0D + " save_profiling_info_enabled: " + this.A2H + " save_profiling_info: " + this.A2G + " dump_info_on_shutdown_enabled: " + this.A16 + " dump_info_on_shutdown: " + this.A15 + " profiler_should_override: " + this.A2E + " profiler_enabled: " + this.A24 + " profiler_min_save_period_ms_enabled: " + this.A2A + " profiler_min_save_period_ms: " + this.A0g + " profiler_save_resolved_classes_delay_ms_enabled: " + this.A2D + " profiler_save_resolved_classes_delay_ms: " + this.A0h + " profiler_hot_startup_method_samples_enabled: " + this.A25 + " profiler_hot_startup_method_samples: " + this.A0b + " profiler_min_methods_to_save_enabled: " + this.A28 + " profiler_min_methods_to_save: " + this.A0e + " profiler_min_classes_to_save_enabled: " + this.A27 + " profiler_min_classes_to_save: " + this.A0d + " profiler_min_notification_before_wake_enabled: " + this.A29 + " profiler_min_notification_before_wake: " + this.A0f + " profiler_max_notification_before_wake_enabled: " + this.A26 + " profiler_max_notification_before_wake: " + this.A0c + " profiler_profile_boot_class_path_enabled: " + this.A2C + " profiler_profile_boot_class_path: " + this.A2B + " profiler_change_profile_path: " + this.A23 + " jitHackRunOnlyOnMainProcess: " + this.A1e + " code_cache_initial_capacity_ratio: " + this.A01 + " code_cache_max_capacity_ratio: " + this.A02 + " compile_threshold_ratio: " + this.A03 + " warmup_threshold_ratio: " + this.A09 + " osr_threshold_ratio: " + this.A07 + " priority_thread_weight_ratio: " + this.A08 + " invoke_transition_weight_ratio: " + this.A04 + " code_cache_capacity_ratio: " + this.A00 + " enableJitMallocArenaPool: " + this.A19 + " jitBailOnRecommendedDevices: " + this.A1Z + " jitFixupApplyMprotectFix: " + this.A1d + " stopJitForColdStart: " + this.A2I + " jitApplyArenaAllocRetryFix: " + this.A1I + " jitBackportJitWeighing: " + this.A1X + " jitModifyCurrent: " + this.A1h + " jitApplyMprotectJitCreationOverride: " + this.A1U + " jitApplyPerformMoveBugFix: " + this.A1V + " jitApplyCustomJitPriorities: " + this.A1M + " jitApplyMobileConfigInlining: " + this.A1T + " jitIgnoreMalformed: " + this.A1f + " jitAlwaysVerify: " + this.A1G + " jitEnableAfterDexesLoaded: " + this.A1a + " jitVerifyCanFindPrimaryDex: " + this.A1j + " jitApplyUseRemapMprotectPtSafeTL: " + this.A1W + " jitOverrideJitCompilerCompileMethod: " + this.A1i + " jitAlwaysVerifyOnJitCompile: " + this.A1H + " jitFailOnSoftVerificationFailure: " + this.A1c + " max_code_cache_initial_capacity_enabled: " + this.A1k + " max_code_cache_initial_capacity_mb: " + this.A05 + " jitEnableThreadPoolPriority: " + this.A1b + " jitThreadPoolPriority: " + this.A0P + " jitThreadPoolThreadCount: " + this.A0Q + " jitApplyMmapRaceFix: " + this.A1S + " jitApplyArenaRetryFastHook: " + this.A1K + " jitApplyArenaMallocFallback: " + this.A1J + " jitApplyCustomQCCompilerFix: " + this.A1N + " jitApplyGenInvokeNoLineFix: " + this.A1Q + " jitBailOnQcDevices: " + this.A1Y + " jitApplyGcJitFix: " + this.A1P + " jitApplyFlushInstructionCacheFix: " + this.A1O + " jitAllowMultipleVerifications: " + this.A1F + " jitLogGenInvokeNoInlineBug: " + this.A1g + " jitApplyMirMethodLoweringInfoResolveFix: " + this.A1R + " jitApplyCallIntoJavaFromJitThreadFix: " + this.A1L + " tryPeriodicPgoProfileCompilation: " + this.A2J + " minPgoProfileRecompileTimeDays: " + this.A06 + " old_profiler_period_s_enabled: " + this.A1o + " old_profiler_period_s_: " + this.A0S + " old_profiler_duration_s_enabled: " + this.A1m + " old_profiler_duration_s_: " + this.A0R + " old_profiler_interval_us_enabled: " + this.A1n + " old_profiler_interval_us_: " + this.A0k + " old_profiler_backoff_coefficient_enabled: " + this.A1l + " old_profiler_backoff_coefficient_: " + this.A0A + " old_profiler_top_k_threshold_enabled: " + this.A1s + " old_profiler_top_k_threshold_: " + this.A0C + " old_profiler_top_k_change_threshold_enabled: " + this.A1r + " old_profiler_top_k_change_threshold_: " + this.A0B + " old_profiler_start_immediately_enabled: " + this.A1q + " old_profiler_start_immediately_: " + this.A1p + " pgo_recomp_use_jobsvc: " + this.A1z + " pgo_recomp_requires_charging: " + this.A1x + " pgo_recomp_requires_device_idle: " + this.A1y + " pgo_recomp_idle_opt_period_ms: " + this.A0W + " pgo_custom_min_new_methods_for_compilation_enabled: " + this.A1w + " pgo_custom_min_new_methods_for_compilation: " + this.A0V + " pgo_custom_min_new_classes_for_compilation_enabled: " + this.A1v + " pgo_custom_min_new_classes_for_compilation: " + this.A0U + " applyStringInitMapFix: " + this.A0s + " overrideProfilerThread: " + this.A1u + " disableProfilerThreadTimeoutCheck: " + this.A11 + " profilerThreadTimeoutSecs: " + this.A0a + " disableRestartThresholdOnRecomp: " + this.A12 + " restartImportanceThreshold: " + this.A0i + " restartOnlyIfScreenOff: " + this.A2F + " applyBarrierFix: " + this.A0p + " applyThreadListRaceFix: " + this.A0t + " enableAospBugFixes: " + this.A17 + " aospBugFixStringInitMapRace: " + this.A0m + " aospBugFixBarrierDtor: " + this.A0l + " doNotStartProfilerWithJit: " + this.A13 + " applyProfileSaverProfilingThreadHooks: " + this.A0r + " applyNotifyJitActivityFix: " + this.A0q + " profile_saver_profiling_thread_ioprio_class_enabled: " + this.A21 + " profile_saver_profiling_thread_ioprio_class: " + this.A0Y + " profile_saver_profiling_thread_ioprio_priority_enabled: " + this.A22 + " profile_saver_profiling_thread_ioprio_priority: " + this.A0Z + " dontUseDefaultPGOProfileIfPresent: " + this.A14 + " useOriginalMixedModePgoProfileAsBase: " + this.A2K + " aospBugFixThreadSafeRosAllocRace: " + this.A0n + " aospUseLockedAllocFromRunThreadUnsafeFunc: " + this.A0o + " installNoopMallocHooks: " + this.A1D + " installGwpAsanMallocHooks: " + this.A1C + " gwpAsanUnwinderType: " + this.A0N + " gwpASanSysLibsInstLevel: " + this.A0H + " gwpAsanUnwinderMaxFrames: " + this.A0M + " gwpAsanMaxAllocatedPages: " + this.A0I + " gwpAsanNumMetadata: " + this.A0J + " gwpAsanTotalPages: " + this.A0L + " gwpAsanSamplingRate: " + this.A0K + " gwpAsanCollectAllocationStacks: " + this.A1A + " gwpAsanCollectDeallocationStacks: " + this.A1B + "]";
    }

    public static int A01(ByteBuffer byteBuffer, int i) {
        if (!byteBuffer.hasRemaining()) {
            return i;
        }
        return byteBuffer.getInt();
    }

    public static File A04(Context context) {
        String str;
        AnonymousClass0CY A002 = AnonymousClass0CY.A00();
        if (A002 != null) {
            AnonymousClass0CX r0 = AnonymousClass0CX.A01;
            AnonymousClass0CX r1 = A002.A00;
            if (!r0.equals(r1)) {
                if (r1 != null) {
                    str = r1.A00;
                } else {
                    str = null;
                }
                return new File(context.getDir("RiskyStartupConfig", 4), AnonymousClass000.A0E("RSC_READ_", str));
            }
        }
        str = "#MAIN#";
        return new File(context.getDir("RiskyStartupConfig", 4), AnonymousClass000.A0E("RSC_READ_", str));
    }

    public C04100Ck(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, int i2, boolean z7, int i3, boolean z8, int i4, boolean z9, int i5, boolean z10, int i6, boolean z11, int i7, boolean z12, int i8, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i9, boolean z20, int i10, boolean z21, int i11, boolean z22, int i12, boolean z23, int i13, boolean z24, int i14, boolean z25, int i15, boolean z26, boolean z27, boolean z28, boolean z29, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, double d9, boolean z50, int i16, int i17, boolean z51, boolean z52, boolean z53, boolean z54, boolean z55, boolean z56, boolean z57, boolean z58, boolean z59, boolean z60, boolean z61, boolean z62, boolean z63, double d10, boolean z64, int i18, boolean z65, int i19, boolean z66, long j, boolean z67, float f, boolean z68, float f2, boolean z69, float f3, boolean z70, boolean z71, boolean z72, boolean z73, boolean z74, int i20, boolean z75, int i21, boolean z76, int i22, boolean z77, boolean z78, boolean z79, int i23, boolean z80, int i24, boolean z81, boolean z82, boolean z83, boolean z84, boolean z85, boolean z86, boolean z87, boolean z88, boolean z89, boolean z90, int i25, boolean z91, int i26, boolean z92, boolean z93, boolean z94, boolean z95, boolean z96, boolean z97, int i27, int i28, int i29, int i30, int i31, int i32, int i33, boolean z98, boolean z99) {
        this.A18 = z;
        this.A0z = z2;
        this.A10 = z3;
        this.A0y = z4;
        this.A0v = z5;
        this.A0E = i;
        this.A0w = z6;
        this.A0F = i2;
        this.A0x = z7;
        this.A0G = i3;
        this.A2L = z8;
        this.A0j = i4;
        this.A1t = z9;
        this.A0T = i5;
        this.A20 = z10;
        this.A0X = i6;
        this.A1E = z11;
        this.A0O = i7;
        this.A0u = z12;
        this.A0D = i8;
        this.A2H = z13;
        this.A2G = z14;
        this.A16 = z15;
        this.A15 = z16;
        this.A2E = z17;
        this.A24 = z18;
        this.A2A = z19;
        this.A0g = i9;
        this.A2D = z20;
        this.A0h = i10;
        this.A25 = z21;
        this.A0b = i11;
        this.A28 = z22;
        this.A0e = i12;
        this.A27 = z23;
        this.A0d = i13;
        this.A29 = z24;
        this.A0f = i14;
        this.A26 = z25;
        this.A0c = i15;
        this.A2C = z26;
        this.A2B = z27;
        this.A23 = z28;
        this.A1e = z29;
        this.A01 = d;
        this.A02 = d2;
        this.A03 = d3;
        this.A09 = d4;
        this.A07 = d5;
        this.A08 = d6;
        this.A04 = d7;
        this.A00 = d8;
        this.A19 = z30;
        this.A1Z = z31;
        this.A1d = z32;
        this.A2I = z33;
        this.A1I = z34;
        this.A1X = z35;
        this.A1h = z36;
        this.A1U = z37;
        this.A1V = z38;
        this.A1M = z39;
        this.A1T = z40;
        this.A1f = z41;
        this.A1G = z42;
        this.A1a = z43;
        this.A1j = z44;
        this.A1W = z45;
        this.A1i = z46;
        this.A1H = z47;
        this.A1c = z48;
        this.A1k = z49;
        this.A05 = d9;
        this.A1b = z50;
        this.A0P = i16;
        this.A0Q = i17;
        this.A1S = z51;
        this.A1K = z52;
        this.A1J = z53;
        this.A1N = z54;
        this.A1Q = z55;
        this.A1Y = z56;
        this.A1P = z57;
        this.A1O = z58;
        this.A1F = z59;
        this.A1g = z60;
        this.A1R = z61;
        this.A1L = z62;
        this.A2J = z63;
        this.A06 = d10;
        this.A1o = z64;
        this.A0S = i18;
        this.A1m = z65;
        this.A0R = i19;
        this.A1n = z66;
        this.A0k = j;
        this.A1l = z67;
        this.A0A = f;
        this.A1s = z68;
        this.A0C = f2;
        this.A1r = z69;
        this.A0B = f3;
        this.A1q = z70;
        this.A1p = z71;
        this.A1z = z72;
        this.A1x = z73;
        this.A1y = z74;
        this.A0W = i20;
        this.A1w = z75;
        this.A0V = i21;
        this.A1v = z76;
        this.A0U = i22;
        this.A0s = z77;
        this.A1u = z78;
        this.A11 = z79;
        this.A0a = i23;
        this.A12 = z80;
        this.A0i = i24;
        this.A2F = z81;
        this.A0p = z82;
        this.A0t = z83;
        this.A17 = z84;
        this.A0m = z85;
        this.A0l = z86;
        this.A13 = z87;
        this.A0r = z88;
        this.A0q = z89;
        this.A21 = z90;
        this.A0Y = i25;
        this.A22 = z91;
        this.A0Z = i26;
        this.A14 = z92;
        this.A2K = z93;
        this.A0n = z94;
        this.A0o = z95;
        this.A1D = z96;
        this.A1C = z97;
        this.A0N = i27;
        this.A0H = i28;
        this.A0M = i29;
        this.A0I = i30;
        this.A0J = i31;
        this.A0L = i32;
        this.A0K = i33;
        this.A1A = z98;
        this.A1B = z99;
    }
}
