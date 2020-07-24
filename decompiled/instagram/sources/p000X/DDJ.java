package p000X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: X.DDJ */
public abstract class DDJ {
    public void A00() {
        int[] iArr;
        if (this instanceof C29828DCm) {
            C29828DCm dCm = (C29828DCm) this;
            if (dCm.A01 != null && (iArr = dCm.A02) != null) {
                int i = dCm.A00;
                if (i < 0 || i >= iArr.length) {
                    if (iArr != null) {
                        if (dCm.A01 == null) {
                            dCm.A01 = new Random();
                        }
                        for (int length = iArr.length - 1; length > 0; length--) {
                            int nextInt = dCm.A01.nextInt(length + 1);
                            int[] iArr2 = dCm.A02;
                            int i2 = iArr2[length];
                            iArr2[length] = iArr2[nextInt];
                            iArr2[nextInt] = i2;
                        }
                    }
                    dCm.A00 = 0;
                }
                C29821DCf dCf = dCm.A01;
                int[] iArr3 = dCm.A02;
                int i3 = dCm.A00;
                dCm.A00 = i3 + 1;
                int i4 = iArr3[i3];
                C29832DCt A00 = dCf.A00("SubdocumentSwap");
                if (A00 == null || ((C29830DCr) A00).A00.contains(Integer.valueOf(i4))) {
                    dCf.A09 = i4;
                    return;
                }
                throw new IllegalArgumentException("Cannot mutate with given index");
            }
        } else if (this instanceof C29819DCd) {
            C29819DCd dCd = (C29819DCd) this;
            List<C29832DCt> list = dCd.A06;
            if (list != null) {
                for (C29832DCt A002 : list) {
                    A002.A00();
                }
            }
            C29819DCd[] dCdArr = dCd.A09;
            if (dCdArr != null) {
                for (C29819DCd A003 : dCdArr) {
                    A003.A00();
                }
            }
        }
    }

    public void A01() {
        if (this instanceof C29838DCz) {
            C29838DCz dCz = (C29838DCz) this;
            dCz.A04 = false;
            MediaPlayer mediaPlayer = dCz.A01;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                dCz.A01.pause();
            }
        } else if (this instanceof C29819DCd) {
            C29819DCd dCd = (C29819DCd) this;
            List<C29832DCt> list = dCd.A06;
            if (list != null) {
                for (C29832DCt A01 : list) {
                    A01.A01();
                }
            }
            C29819DCd[] dCdArr = dCd.A09;
            if (dCdArr != null) {
                for (C29819DCd A012 : dCdArr) {
                    A012.A01();
                }
            }
        }
    }

    public void A02() {
        if (this instanceof C29838DCz) {
            ((C29838DCz) this).A04 = true;
        } else if (this instanceof C29819DCd) {
            C29819DCd dCd = (C29819DCd) this;
            List<C29832DCt> list = dCd.A06;
            if (list != null) {
                for (C29832DCt A02 : list) {
                    A02.A02();
                }
            }
            C29819DCd[] dCdArr = dCd.A09;
            if (dCdArr != null) {
                for (C29819DCd A022 : dCdArr) {
                    A022.A02();
                }
            }
        }
    }

    public void A03() {
        DDE dde;
        C29821DCf dCf;
        if (this instanceof C29823DCh) {
            C29823DCh dCh = (C29823DCh) this;
            ByteBuffer wrap = ByteBuffer.wrap(dCh.A03);
            int A00 = C29825DCj.A00(wrap);
            Class<DDE> cls = DDE.class;
            dCh.A0I = (DDE) C29825DCj.A02(wrap, A00, 0, cls);
            dCh.A0G = (DDE) C29825DCj.A02(wrap, A00, 1, cls);
            dCh.A0H = (DDE) C29825DCj.A02(wrap, A00, 2, cls);
            DDW ddw = (DDW) C29825DCj.A02(wrap, A00, 3, DDW.class);
            dCh.A0D = ddw;
            if (ddw != null || (dCf = dCh.A01) == null) {
                dCh.A0C = (DDY) C29825DCj.A02(wrap, A00, 4, DDY.class);
                dCh.A0F = (DDE) C29825DCj.A02(wrap, A00, 5, cls);
                byte b = 0;
                int A01 = C29825DCj.A01(wrap, A00, 6);
                if (A01 != 0) {
                    b = wrap.get(A01);
                }
                dCh.A00 = b;
                byte b2 = 0;
                int A012 = C29825DCj.A01(wrap, A00, 7);
                if (A012 != 0) {
                    b2 = wrap.get(A012);
                }
                dCh.A01 = b2;
                dde = (DDE) C29825DCj.A02(wrap, A00, 8, cls);
            } else {
                dCh.A0D = dCf.A0F;
                dCh.A0C = dCf.A0B;
                dCh.A0F = dCf.A0M;
                dCh.A00 = dCf.A00;
                dCh.A01 = dCf.A01;
                dde = dCf.A0J;
            }
            dCh.A0E = dde;
        } else if (this instanceof C29830DCr) {
            C29830DCr dCr = (C29830DCr) this;
            ByteBuffer wrap2 = ByteBuffer.wrap(dCr.A03);
            int[] A06 = C29825DCj.A06(wrap2, C29825DCj.A00(wrap2));
            if (A06 != null) {
                dCr.A00 = new ArrayList();
                for (int valueOf : A06) {
                    dCr.A00.add(Integer.valueOf(valueOf));
                }
            }
        } else if (this instanceof C29838DCz) {
            C29838DCz dCz = (C29838DCz) this;
            ByteBuffer wrap3 = ByteBuffer.wrap(dCz.A03);
            int A002 = C29825DCj.A00(wrap3);
            byte[] A04 = C29825DCj.A04(wrap3, A002, 0);
            DDE[] ddeArr = (DDE[]) C29825DCj.A07(wrap3, A002, 1, DDE.class);
            if (ddeArr != null && ddeArr.length >= 2) {
                dCz.A02 = new DEL(ddeArr[0]);
                dCz.A03 = new DEL(ddeArr[1]);
            }
            dCz.A01 = new MediaPlayer();
            try {
                dCz.A01.setDataSource(AnonymousClass000.A0E("data:audio;base64,", Base64.encodeToString(A04, 0)));
                dCz.A01.setOnCompletionListener(new DEG(dCz));
                dCz.A01.setOnErrorListener(new DEH(dCz));
                dCz.A01.prepare();
            } catch (IOException unused) {
                dCz.A01 = null;
            }
        } else if (this instanceof C29828DCm) {
            C29828DCm dCm = (C29828DCm) this;
            ByteBuffer wrap4 = ByteBuffer.wrap(dCm.A03);
            dCm.A02 = C29825DCj.A06(wrap4, C29825DCj.A00(wrap4));
        } else if (this instanceof DDA) {
            DDA dda = (DDA) this;
            ByteBuffer wrap5 = ByteBuffer.wrap(dda.A03);
            dda.A00 = C29825DCj.A08(wrap5, C29825DCj.A00(wrap5), 0);
        } else if (this instanceof C29837DCy) {
            C29837DCy dCy = (C29837DCy) this;
            ByteBuffer wrap6 = ByteBuffer.wrap(dCy.A03);
            dCy.A00 = (DDZ[]) C29825DCj.A07(wrap6, C29825DCj.A00(wrap6), 0, DDZ.class);
        }
    }

    public void A04(float f, float f2) {
        if (this instanceof C29823DCh) {
            C29823DCh dCh = (C29823DCh) this;
            dCh.A03 = f;
            dCh.A04 = f2;
            Path path = dCh.A07;
            if (path != null) {
                path.rewind();
            }
            Path path2 = dCh.A0A;
            if (path2 != null) {
                path2.rewind();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (p000X.C29838DCz) r8;
     */
    public void A05(float f, int i) {
        C29838DCz dCz;
        MediaPlayer mediaPlayer;
        DEL del;
        DEL del2;
        boolean z;
        boolean z2;
        MediaPlayer mediaPlayer2;
        if ((this instanceof C29838DCz) && (mediaPlayer = dCz.A01) != null && (del = dCz.A02) != null && (del2 = dCz.A03) != null) {
            float f2 = dCz.A00;
            float A00 = DDB.A00(del.A01, f, f2);
            if (del.A00 != A00) {
                del.A00 = A00;
                z = true;
            } else {
                z = false;
            }
            float A002 = DDB.A00(del2.A01, f, f2);
            if (del2.A00 != A002) {
                del2.A00 = A002;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                mediaPlayer.setVolume((float) Math.pow(10.0d, (double) (del.A00 / 20.0f)), (float) Math.pow(10.0d, (double) (del2.A00 / 20.0f)));
            }
            if (!dCz.A01.isPlaying()) {
                C29821DCf dCf = dCz.A01;
                if (!(dCf == null || (mediaPlayer2 = dCz.A01) == null)) {
                    float f3 = dCf.A04;
                    float duration = ((f - f3) / (dCf.A06 - f3)) * ((float) mediaPlayer2.getDuration());
                    if (Math.abs(((float) dCz.A01.getCurrentPosition()) - duration) > 0.1f) {
                        dCz.A01.seekTo((int) duration);
                    }
                }
                if (dCz.A04) {
                    dCz.A01.start();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (p000X.C29823DCh) r2;
     */
    public void A06(Canvas canvas) {
        C29823DCh dCh;
        Path path;
        Paint paint;
        if ((this instanceof C29823DCh) && (path = dCh.A0A) != null && (paint = dCh.A06) != null) {
            canvas.drawPath(path, paint);
        }
    }
}
