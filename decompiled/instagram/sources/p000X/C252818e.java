package p000X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.18e  reason: invalid class name and case insensitive filesystem */
public final class C252818e {
    public C15230mY A00;
    public C50092Ey A01;
    public C15130mO A02;
    public final C27375CAu A03;
    public final C252918f A04 = new C252918f();
    public final /* synthetic */ AnonymousClass12C A05;

    public C252818e(AnonymousClass12C r2, C15130mO r3, C27375CAu cAu) {
        this.A05 = r2;
        this.A02 = r3;
        this.A03 = cAu;
    }

    public final C15230mY A00() {
        int size;
        String str;
        C30555Ded ded;
        String str2;
        if (this.A00 == null) {
            LinkedList linkedList = null;
            synchronized (this) {
                if (this.A00 == null) {
                    C27375CAu cAu = this.A03;
                    if (cAu != null) {
                        if (this.A05.A0T) {
                            str2 = "IgImageDiskStashCache";
                        } else {
                            str2 = "IgImageDiskCache";
                        }
                        this.A01 = new C50092Ey(str2, cAu, false);
                    }
                    AnonymousClass12C r5 = this.A05;
                    if (r5.A0T) {
                        File A012 = C15020mC.A01(r5.A06, r5.A0F, false);
                        C12780hN A002 = C12780hN.A00();
                        if (this.A01 != null) {
                            ded = new C30555Ded(this);
                        } else {
                            ded = null;
                        }
                        long j = this.A05.A05;
                        AnonymousClass2B4 r15 = new AnonymousClass2B4(j, j, j, false);
                        if (ded != null) {
                            linkedList = new LinkedList();
                            linkedList.add(ded);
                        }
                        AnonymousClass2B6 r11 = new AnonymousClass2B6("IgImageCache", r15, linkedList);
                        A002.A00.markerStart(42991640, A012.hashCode());
                        AnonymousClass0Hz withMarker = A002.A00.withMarker(42991640, A012.hashCode());
                        withMarker.A06("path", A012.toString());
                        withMarker.A06("name", r11.A01);
                        withMarker.Aoj();
                        try {
                            File file = new File(A012, "clean");
                            File file2 = new File(A012, "dirty");
                            File file3 = new File(A012, "meta");
                            FileStash A013 = A002.A01(file, r11.A01, r11.A03, r11.A02);
                            FileStash A014 = A002.A01(file2, AnonymousClass000.A0E(r11.A01, "-dirty"), r11.A03, (List) null);
                            FileStash A015 = A002.A01(file3, AnonymousClass000.A0E(r11.A01, "-meta"), r11.A03, (List) null);
                            File file4 = file;
                            A002.A01.ADc(new AnonymousClass2BL(A002, file4, r11, A013, file2, file3));
                            AnonymousClass2BM r3 = new AnonymousClass2BM(r11, A013, A014, A015);
                            A002.A00.markerEnd(42991640, A012.hashCode(), 2);
                            this.A00 = r3;
                        } catch (Throwable th) {
                            A002.A00.markerEnd(42991640, A012.hashCode(), 2);
                            throw th;
                        }
                    } else {
                        C15210mW r4 = new C15210mW();
                        File A016 = C15020mC.A01(r5.A06, r5.A0F, false);
                        if (A016 != null) {
                            r4.A03 = A016;
                        }
                        AnonymousClass12C r32 = this.A05;
                        r4.A01 = r32.A05;
                        r4.A00 = r32.A03;
                        AnonymousClass0O1 A003 = AnonymousClass0O1.A00();
                        A003.A01 = AnonymousClass12C.class.getName();
                        r4.A02 = A003.A01();
                        r4.A04 = this.A05.A0M;
                        C15220mX A004 = r4.A00();
                        this.A00 = A004;
                        A004.BiY(new C35501gT(this));
                    }
                    C50092Ey r1 = this.A01;
                    if (r1 != null) {
                        synchronized (r1) {
                            try {
                                size = r1.A01.size();
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int A9w = this.A00.A9w();
                        if (((float) size) > ((float) A9w) * 1.2f) {
                            C50092Ey r33 = this.A01;
                            synchronized (r33) {
                                try {
                                    r33.A01.clear();
                                    r33.A03.A03(r33.A04);
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[3];
                            if (this.A05.A0T) {
                                str = "IgImageDiskStashCache";
                            } else {
                                str = "IgImageDiskCache";
                            }
                            objArr[0] = str;
                            objArr[1] = Integer.valueOf(size);
                            objArr[2] = Integer.valueOf(A9w);
                            AnonymousClass0QD.A03("cache_efficiency_logging", String.format(locale, "Image disk cache (%s) efficiency logger has too many items (%d > %d)", objArr), 1);
                        }
                    }
                }
            }
        }
        return this.A00;
    }
}
