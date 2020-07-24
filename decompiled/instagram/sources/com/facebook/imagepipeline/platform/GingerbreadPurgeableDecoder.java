package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p000X.AnonymousClass19O;
import p000X.BNB;
import p000X.C2099893s;
import p000X.C29340Cw9;
import p000X.C29359CwS;
import p000X.C29373Cwm;
import p000X.C29377Cwq;
import p000X.C29386Cwz;
import p000X.C29488Cyh;
import p000X.C79543dc;

public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method A01;
    public final BNB A00;

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a6  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x008d=Splitter:B:58:0x008d, B:14:0x002e=Splitter:B:14:0x002e} */
    private Bitmap A00(C29488Cyh cyh, int i, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFile;
        int i2;
        C29373Cwm cwm;
        Closeable closeable;
        C29359CwS cwS;
        Method method;
        MemoryFile memoryFile2 = null;
        if (bArr == null) {
            i2 = 0;
        } else {
            try {
                i2 = bArr.length;
            } catch (IOException e) {
                e = e;
                try {
                    throw C29340Cw9.A00(e);
                } catch (Throwable th) {
                    th = th;
                    memoryFile = memoryFile2;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            }
        }
        C29359CwS cwS2 = null;
        memoryFile = new MemoryFile((String) null, i2 + i);
        memoryFile.allowPurging(false);
        try {
            cwm = new C29373Cwm((C29386Cwz) cyh.A06());
            try {
                cwS = new C29359CwS(cwm, i);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                C29488Cyh.A03(cyh);
                C2099893s.A01(cwm);
                C2099893s.A01(cwS2);
                C2099893s.A00(closeable);
                throw th;
            }
            try {
                OutputStream outputStream = memoryFile.getOutputStream();
                AnonymousClass19O.A01(cwS, outputStream);
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i, bArr.length);
                }
                C29488Cyh.A03(cyh);
                C2099893s.A01(cwm);
                C2099893s.A01(cwS);
                C2099893s.A00(outputStream);
                try {
                    synchronized (this) {
                        if (A01 == null) {
                            try {
                                A01 = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
                            } catch (Exception e2) {
                                throw C29340Cw9.A00(e2);
                            }
                        }
                        method = A01;
                    }
                    FileDescriptor fileDescriptor = (FileDescriptor) method.invoke(memoryFile, new Object[0]);
                    try {
                        BNB bnb = this.A00;
                        if (bnb != null) {
                            Bitmap decodeFileDescriptor = bnb.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
                            C79543dc.A02(decodeFileDescriptor, "BitmapFactory returned null");
                            memoryFile.close();
                            return decodeFileDescriptor;
                        }
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    } catch (IOException e3) {
                        e = e3;
                        memoryFile2 = memoryFile;
                        throw C29340Cw9.A00(e);
                    } catch (Throwable th3) {
                        th = th3;
                        if (memoryFile != null) {
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    throw C29340Cw9.A00(e4);
                }
            } catch (Throwable th4) {
                th = th4;
                closeable = null;
                cwS2 = cwS;
                C29488Cyh.A03(cyh);
                C2099893s.A01(cwm);
                C2099893s.A01(cwS2);
                C2099893s.A00(closeable);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            closeable = null;
            cwm = null;
            C29488Cyh.A03(cyh);
            C2099893s.A01(cwm);
            C2099893s.A01(cwS2);
            C2099893s.A00(closeable);
            throw th;
        }
    }

    public GingerbreadPurgeableDecoder() {
        BNB bnb = null;
        if (!C29377Cwq.A00) {
            try {
                bnb = (BNB) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            C29377Cwq.A00 = true;
        }
        this.A00 = bnb;
    }

    public final Bitmap decodeByteArrayAsPurgeable(C29488Cyh cyh, BitmapFactory.Options options) {
        return A00(cyh, ((C29386Cwz) cyh.A06()).A01(), (byte[]) null, options);
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(C29488Cyh cyh, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.endsWithEOI(cyh, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.EOI;
        }
        return A00(cyh, i, bArr, options);
    }
}
