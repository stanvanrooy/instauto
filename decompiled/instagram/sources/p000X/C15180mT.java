package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.p003io.Closeables;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.0mT  reason: invalid class name and case insensitive filesystem */
public final class C15180mT extends C15190mU {
    public static C15180mT A05;
    public final C15220mX A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final C15130mO A04;

    public final C33811dX A00(String str, String str2, int i, boolean z, C256019m r18) {
        GZIPInputStream gZIPInputStream;
        int i2;
        C33301ch r4 = new C33301ch(str);
        r4.A05 = str2;
        r4.A00 = i;
        C15220mX r3 = this.A00;
        C15130mO r6 = this.A04;
        try {
            AnonymousClass1FY AF0 = r3.AF0(r4.A0C);
            if (AF0.A01()) {
                gZIPInputStream = new GZIPInputStream((AnonymousClass1FV) AF0.A00());
                if (r6 != null && z) {
                    try {
                        String str3 = r4.A0B;
                        if (r18.A00() == Constants.ONE) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                            if (r18.A00() == Constants.A0C) {
                                i2 = 1;
                            }
                        }
                        r6.A02(str3, 0, i2, (String) null, r3.ALE(r4.A0C) + r3.ALE(r4.A0A));
                    } catch (Throwable th) {
                        th = th;
                        Closeables.A01(gZIPInputStream);
                        throw th;
                    }
                }
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, Charset.forName("UTF-8")));
                }
                C13080hr A0A = C12890hY.A00.A0A(sb.toString());
                A0A.A0p();
                C33811dX parseFromJson = C33801dW.parseFromJson(A0A);
                if (parseFromJson != null) {
                    Closeables.A01(gZIPInputStream);
                    if (!this.A01.containsKey(str)) {
                        this.A01.put(str, r4);
                        return parseFromJson;
                    }
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Attempted to read a response that is already being read.  Failed entry: %s. Current Entry reading: %s.", r4, this.A01.get(str));
                    AnonymousClass0QD.A01("HttpStore_ConcurentReading", formatStrLocaleSafe);
                    throw new IOException(formatStrLocaleSafe);
                }
                String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("Attempt to parse String to AsyncHttpResponseInfo: %s. Length: %s. mResponseInfoIgDiskCacheKey: %s. IgDiskCache size in bytes %d", sb.toString(), Integer.valueOf(sb.length()), r4.A0C, Long.valueOf(r3.size()));
                r4.A02(r3);
                AnonymousClass0QD.A02("HttpStoreEntry_nullAsyncHttpResponseInfo", formatStrLocaleSafe2);
                throw new IOException(formatStrLocaleSafe2);
            }
            throw new IOException("Http ResponseInfo file stream not available");
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream = null;
            Closeables.A01(gZIPInputStream);
            throw th;
        }
    }

    public final void A01(AnonymousClass1CB r3, AnonymousClass1C4 r4, String str) {
        if (this.A02.get(r4) == null) {
            if (this.A03.get(r4) == null) {
                this.A03.put(r4, new LinkedList());
                r3.A04(A05);
            }
            ((List) this.A03.get(r4)).add(str);
            return;
        }
        throw new IllegalStateException("Registering cacheKey after response has started");
    }

    public C33301ch copyEntry(String str, String str2) {
        boolean A002;
        C33301ch r4 = new C33301ch(str);
        C33301ch r3 = new C33301ch(str2);
        C15220mX r2 = this.A00;
        if (!C33301ch.A00(r4.A0C, r3.A0C, r2)) {
            r4.A02(r2);
            r3.A02(r2);
            A002 = false;
        } else {
            A002 = C33301ch.A00(r4.A0A, r3.A0A, r2);
            if (!A002) {
                r4.A02(r2);
                r3.A02(r2);
            }
        }
        if (!A002) {
            return null;
        }
        return r3;
    }

    public final void onFailed(AnonymousClass1C4 r3, IOException iOException) {
        List<C33301ch> list = (List) this.A02.remove(r3);
        if (list != null) {
            for (C33301ch A012 : list) {
                A012.A01();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|10|(2:12|(1:14)(1:15))|16|17|(2:19|20)|(2:23|24)|(2:26|35)(1:34)|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[SYNTHETIC, Splitter:B:19:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[SYNTHETIC, Splitter:B:23:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f A[Catch:{ IllegalStateException -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x000e A[SYNTHETIC] */
    public final void onNewData(AnonymousClass1C4 r7, C256019m r8, ByteBuffer byteBuffer) {
        List list = (List) this.A02.get(r7);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C33301ch r4 = (C33301ch) it.next();
                try {
                    C15220mX r1 = this.A00;
                    if (r4.A09) {
                        if (r4.A02 == null) {
                            AnonymousClass1FY ACn = r1.ACn(r4.A0A);
                            if (ACn.A01()) {
                                C33371co r12 = (C33371co) ACn.A00();
                                r4.A02 = r12;
                                r4.A07 = new GZIPOutputStream(r12);
                            } else {
                                AnonymousClass0QD.A01("HttpStoreEntry", "Output ResponseBody file not available");
                            }
                        }
                        GZIPOutputStream gZIPOutputStream = r4.A07;
                        boolean z = false;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.write(byteBuffer.array(), 0, byteBuffer.limit());
                                z = true;
                            } catch (IOException unused) {
                            }
                        }
                        if (!z) {
                            r4.A01();
                        }
                        if (z) {
                            it.remove();
                        }
                    } else {
                        throw new IllegalStateException("WriteBatchInCache should not be called if startWriting did not end up successfully");
                    }
                } catch (IllegalStateException unused2) {
                    it.remove();
                    AnonymousClass0QD.A01("HttpStore_DuplicateWriting", StringFormatUtil.formatStrLocaleSafe("IllegalStateException while caching response in cache for request %s. RequestId: %d. mActiveWritingResponses: %s", r7.A04.getPath(), Integer.valueOf(r7.hashCode()), this.A02.keySet()));
                }
            }
        }
    }

    public final void onResponseStarted(AnonymousClass1C4 r12, C256019m r13, C33851db r14) {
        if (this.A03.get(r12) == null) {
            throw new IllegalStateException(StringFormatUtil.formatStrLocaleSafe("Request: %s %n not found when trying to cache response.", (Object) r12.A04.toString()));
        } else if (!r14.A01()) {
            this.A03.remove(r12);
        } else {
            LinkedList linkedList = new LinkedList();
            for (String r0 : (List) this.A03.remove(r12)) {
                C33301ch r2 = new C33301ch(r0);
                try {
                    C15220mX r1 = this.A00;
                    r2.A01 = r13;
                    r2.A09 = false;
                    try {
                        AnonymousClass1FY ACn = r1.ACn(r2.A0C);
                        if (ACn.A01()) {
                            C33371co r15 = (C33371co) ACn.A00();
                            r2.A03 = r15;
                            r2.A08 = new GZIPOutputStream(r15);
                            ArrayList arrayList = new ArrayList(Collections.unmodifiableList(r14.A02));
                            if (!r14.A02("X-IG-ANDROID-FROM-DISK-CACHE")) {
                                arrayList.add(new C17190pp("X-IG-ANDROID-FROM-DISK-CACHE", String.valueOf(System.currentTimeMillis())));
                            }
                            C33811dX r5 = new C33811dX(r14.A00, r14.A01, arrayList);
                            StringWriter stringWriter = new StringWriter();
                            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                            A052.A0T();
                            A052.A0F(TraceFieldType.StatusCode, r5.A00);
                            String str = r5.A01;
                            if (str != null) {
                                A052.A0H("reason_phrase", str);
                            }
                            if (r5.A02 != null) {
                                A052.A0d("headers");
                                A052.A0S();
                                for (C17190pp r6 : r5.A02) {
                                    if (r6 != null) {
                                        A052.A0T();
                                        String str2 = r6.A00;
                                        if (str2 != null) {
                                            A052.A0H("name", str2);
                                        }
                                        String str3 = r6.A01;
                                        if (str3 != null) {
                                            A052.A0H("value", str3);
                                        }
                                        A052.A0Q();
                                    }
                                }
                                A052.A0P();
                            }
                            A052.A0Q();
                            A052.close();
                            String stringWriter2 = stringWriter.toString();
                            if (stringWriter2.isEmpty()) {
                                AnonymousClass0QD.A02("HttpStoreEntry_Serializer", StringFormatUtil.formatStrLocaleSafe("AsyncResponseInfo unexpected. Found: %s and serialized to: %s", r14, stringWriter2));
                            }
                            r2.A08.write(stringWriter2.getBytes(Charset.forName("UTF-8")));
                            r2.A09 = true;
                        } else {
                            AnonymousClass0QD.A02("HttpStoreEntry", "Output ResponseInfo file not available");
                        }
                    } catch (IOException unused) {
                        AnonymousClass0QD.A01("HttpStoreEntry", "IOException found when serializing AsyncHttpResponseInfo");
                    }
                    if (!r2.A09) {
                        r2.A01();
                    }
                    if (r2.A09) {
                        linkedList.add(r2);
                    }
                } catch (IllegalStateException unused2) {
                    AnonymousClass0QD.A01("HttpStore_DuplicateWriting", StringFormatUtil.formatStrLocaleSafe("IllegalStateException found when caching response for request: %s. RequestId: %d. mActiveWritingResponse: %s", r12.A04.getPath(), Integer.valueOf(r12.hashCode()), this.A02.keySet()));
                }
            }
            this.A02.put(r12, linkedList);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
    public final void onSucceeded(AnonymousClass1C4 r14) {
        int i;
        List<C33301ch> list = (List) this.A02.remove(r14);
        if (list != null) {
            try {
                for (C33301ch r2 : list) {
                    C15220mX r3 = this.A00;
                    C15130mO r6 = this.A04;
                    if (r2.A07 == null || r2.A02 == null) {
                        throw new IllegalStateException("Unexpected null Output stream");
                    }
                    r2.A08.finish();
                    r2.A07.finish();
                    r2.A03.A04();
                    r2.A02.A04();
                    if (r6 != null) {
                        String str = r2.A0B;
                        C256019m r4 = r2.A01;
                        if (r4.A00() == Constants.ONE) {
                            i = 0;
                        } else {
                            i = -1;
                            if (r4.A00() == Constants.A0C) {
                                i = 1;
                            }
                        }
                        r6.A02(str, 1, i, (String) null, r3.ALE(r2.A0C) + r3.ALE(r2.A0A));
                    }
                    r2.A01();
                }
            } catch (IOException ) {
                r2.A01();
            } catch (IllegalStateException e) {
                AnonymousClass0QD.A02("HttpStore_EmptyBody", StringFormatUtil.formatStrLocaleSafe("IllegalStateException while caching response in cache for request %s. %s", r14.A04.getPath(), e.getLocalizedMessage()));
            } catch (Throwable th) {
                r2.A01();
                throw th;
            }
        }
    }

    public C15180mT(File file, C15130mO r5) {
        C15210mW r2 = new C15210mW();
        if (file != null) {
            r2.A03 = file;
        }
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = C15180mT.class.getName();
        r2.A02 = A002.A01();
        this.A00 = r2.A00();
        this.A04 = r5;
        this.A02 = Collections.synchronizedMap(new HashMap());
        this.A01 = Collections.synchronizedMap(new HashMap());
        this.A03 = Collections.synchronizedMap(new HashMap());
    }

    public static void initInstance(C15180mT r0) {
        A05 = r0;
    }
}
