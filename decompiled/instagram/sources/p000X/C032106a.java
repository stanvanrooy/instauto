package p000X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.06a  reason: invalid class name and case insensitive filesystem */
public final class C032106a extends AnonymousClass05B {
    public static AnonymousClass05B A00;

    public final /* bridge */ /* synthetic */ AnonymousClass05A A00(Object obj) {
        File file = (File) obj;
        try {
            return new C032706i(this, file);
        } catch (IOException e) {
            throw new AnonymousClass05K("Unexpected error, failed to create file: " + file, e);
        }
    }
}
