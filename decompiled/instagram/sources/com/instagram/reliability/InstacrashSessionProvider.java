package com.instagram.reliability;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Kk;

public final class InstacrashSessionProvider {
    public AnonymousClass0Kk A00;
    public boolean A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x004f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0048=Splitter:B:24:0x0048, B:14:0x003b=Splitter:B:14:0x003b} */
    public final AnonymousClass0Kk A00(Context context) {
        FileReader fileReader;
        if (!this.A01) {
            try {
                fileReader = new FileReader(new File(context.getApplicationInfo().dataDir, "ig_crash_log_session"));
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    this.A00 = new AnonymousClass0Kk(sb2);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                AnonymousClass0DB.A0G("com.instagram.reliability.InstacrashSessionProvider", "Unable to read session", e);
            } catch (Throwable ) {
                throw th;
            }
            this.A01 = true;
        }
        return this.A00;
        try {
        } catch (Throwable th) {
            fileReader.close();
            throw th;
        }
    }
}
