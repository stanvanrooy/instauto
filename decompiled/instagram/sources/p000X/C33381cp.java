package p000X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: X.1cp  reason: invalid class name and case insensitive filesystem */
public final class C33381cp extends C33371co {
    public final FileStash A00;
    public final String A01;
    public final FileStash A02;
    public final FileStash A03;
    public final C56252cB A04;
    public final boolean A05;
    public final /* synthetic */ AnonymousClass2BM A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33381cp(AnonymousClass2BM r2, String str, FileStash fileStash, FileStash fileStash2, FileStash fileStash3, C56252cB r7, boolean z) {
        super(fileStash2.BuN(str));
        this.A06 = r2;
        this.A01 = str;
        this.A02 = fileStash;
        this.A00 = fileStash2;
        this.A03 = fileStash3;
        this.A04 = r7;
        this.A05 = z;
    }

    public final FileDescriptor A01() {
        throw new UnsupportedOperationException("Stash streams do not support getFD()");
    }

    public final FileChannel A02() {
        throw new UnsupportedOperationException("Stash streams do not support getChannel()");
    }

    public final void A03() {
        if (!this.A00) {
            try {
                this.A00.remove(this.A01);
            } finally {
                close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r6.A03.remove(r6.A01) != false) goto L_0x004d;
     */
    public final boolean A04() {
        boolean z;
        if (!this.A00) {
            try {
                if (this.A01) {
                    this.A02.remove(this.A01);
                    this.A00.remove(this.A01);
                    this.A03.remove(this.A01);
                } else {
                    C56252cB r0 = this.A04;
                    if (r0 != null) {
                        this.A03.BuP(this.A01, r0.A00.toString().getBytes(C56252cB.A01));
                    } else if (this.A03.hasKey(this.A01)) {
                        z = true;
                    }
                    z = false;
                    File filePath = this.A00.getFilePath(this.A01);
                    File insertFile = this.A02.insertFile(this.A01);
                    if (!z && filePath.renameTo(insertFile)) {
                        AnonymousClass2BM r02 = this.A06;
                        String str = this.A01;
                        if (r02.A00.getFilePath(str).setExecutable(this.A05)) {
                            close();
                            return true;
                        }
                    }
                    if (z) {
                        AnonymousClass0QD.A01("IgDiskStash2", "Failed to commit because of metadata error");
                    }
                    this.A02.remove(this.A01);
                    this.A00.remove(this.A01);
                    this.A03.remove(this.A01);
                }
            } catch (IOException unused) {
                z = this.A05;
            } catch (Throwable th) {
                close();
                throw th;
            }
            close();
            return false;
        }
        throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
    }

    public final void close() {
        super.close();
        AnonymousClass2BM.A00(this.A06, this.A01);
    }
}
