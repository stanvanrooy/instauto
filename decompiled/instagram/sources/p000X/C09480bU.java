package p000X;

import android.content.Context;
import com.facebook.common.dextricks.ResProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* renamed from: X.0bU  reason: invalid class name and case insensitive filesystem */
public final class C09480bU extends ResProvider {
    public final Context A00;
    public final String A01;
    public final ZipFile A02;

    public final void close() {
        ZipFile zipFile = this.A02;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                AnonymousClass0DB.A0R("VoltronResProvider", e, "failed to close module zip file for module %s", this.A01);
            }
        }
    }

    public final InputStream open(String str) {
        String str2 = this.A01;
        String str3 = File.separator;
        String A0J = AnonymousClass000.A0J(str2, str3, str);
        ZipFile zipFile = this.A02;
        if (zipFile != null) {
            String A0J2 = AnonymousClass000.A0J("assets", str3, A0J);
            if (zipFile.getEntry(A0J2) != null) {
                ZipFile zipFile2 = this.A02;
                return zipFile2.getInputStream(zipFile2.getEntry(A0J2));
            }
        }
        return this.A00.getAssets().open(A0J);
    }

    public C09480bU(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
        this.A02 = null;
    }

    public C09480bU(Context context, String str, File file) {
        this.A00 = context;
        this.A01 = str;
        this.A02 = new ZipFile(file);
    }
}
