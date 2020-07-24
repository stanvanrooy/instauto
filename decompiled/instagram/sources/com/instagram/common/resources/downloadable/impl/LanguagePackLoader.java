package com.instagram.common.resources.downloadable.impl;

import android.content.Context;
import com.google.common.p003io.Closeables;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0O9;
import p000X.AnonymousClass0a4;
import p000X.C12670hC;
import p000X.C14330kH;
import p000X.C14440kc;
import p000X.C14550ky;
import p000X.C14560l1;
import p000X.C14970m7;
import p000X.C15030mD;
import p000X.C15050mF;
import p000X.C15100mK;
import p000X.C15120mM;
import p000X.C206688tv;

public final class LanguagePackLoader extends AnonymousClass0O9 {
    public final C14560l1 A00;
    public final C14550ky A01;
    public final String A02;

    public LanguagePackLoader(Context context, String str, C14550ky r6) {
        super(56, 3, true, true);
        this.A02 = str;
        this.A01 = r6;
        this.A00 = new C14560l1(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        if (r2 == false) goto L_0x00c3;
     */
    public final void run() {
        ByteBuffer wrap;
        boolean z;
        FileInputStream fileInputStream = null;
        C14560l1 r2 = this.A00;
        String str = this.A02;
        C12670hC.A01();
        try {
            AnonymousClass00B.A01.markerStart(4456459);
            C14970m7 A002 = r2.A00.A00(r2.A01.A03(), "fbt_language_pack.bin", str, Constants.ONE, false);
            AnonymousClass00B.A01.markerEnd(4456459, 2);
            File file = A002.A00;
            if (file != null) {
                AnonymousClass0a4.A06(file);
                file.getName();
                AnonymousClass0a4.A06(file);
                FileInputStream fileInputStream2 = new FileInputStream(file);
                fileInputStream = fileInputStream2;
                if (fileInputStream2 instanceof FileInputStream) {
                    FileChannel channel = fileInputStream2.getChannel();
                    wrap = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                } else {
                    AnonymousClass0a4.A06(fileInputStream2);
                    wrap = ByteBuffer.wrap(C206688tv.A02(fileInputStream2, new ArrayDeque(20), 0));
                }
                C15030mD r3 = new C15030mD(new C15050mF(wrap));
                C14550ky r0 = this.A01;
                C14330kH r4 = r0.A00;
                String str2 = r0.A01;
                AtomicReference atomicReference = r4.A06;
                synchronized (r4) {
                    atomicReference.set(r3);
                    C15100mK r32 = new C15100mK(r4.A04.A01.A02("fbresources_loading_success"));
                    if (r32.A0B()) {
                        r32.A08("locale", str2);
                        r32.A08("source", "downloaded");
                        r32.A08("file_format", "fbt");
                        r32.A01();
                    }
                    if (r4.A09) {
                        boolean A003 = r4.A03.A00(r4.A02());
                        z = false;
                        if (r4.A06.get() != null) {
                            z = true;
                        }
                    }
                    z = true;
                    if (z) {
                        C14440kc r33 = r4.A00;
                        AnonymousClass0a4.A06(r33);
                        r33.A0A(new C15120mM(true, (Throwable) null));
                    }
                }
                Closeables.A01(fileInputStream);
                return;
            }
            AnonymousClass0DB.A0D("com.instagram.common.resources.downloadable.impl.LanguagePackLoader", "EXCEPTION : language pack is null");
            throw new IOException("Failed to get language pack");
        } catch (Exception e) {
            AnonymousClass0DB.A0G(C14560l1.A02, "Fetching fbt language pack using dod failed with exception", e);
            AnonymousClass00B.A01.markerEnd(4456459, 3);
            throw e;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    AnonymousClass0DB.A0G("com.instagram.common.resources.downloadable.impl.LanguagePackLoader", "EXCEPTION : language pack failed to parse", th);
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        Closeables.A01(fileInputStream);
                    }
                    throw th2;
                }
            }
            C14550ky r02 = this.A01;
            C14330kH r34 = r02.A00;
            r34.A04.A00(r02.A01, false, th);
            C14440kc r22 = r34.A00;
            AnonymousClass0a4.A06(r22);
            r22.A0A(new C15120mM(false, th));
            if (fileInputStream == null) {
            }
        }
    }
}
