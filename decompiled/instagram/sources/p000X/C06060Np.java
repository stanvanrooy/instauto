package p000X;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.0Np  reason: invalid class name and case insensitive filesystem */
public final class C06060Np {
    public static String A00(Resources resources, int i) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            } catch (IOException unused) {
                throw new RuntimeException("failed to read raw resource");
            }
        }
    }
}
