package p000X;

import android.net.LocalSocket;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1o7  reason: invalid class name and case insensitive filesystem */
public final class C40121o7 {
    public static C40121o7 A08;
    public int A00 = -1;
    public int A01;
    public final Object A02 = new Object();
    public final List A03 = new LinkedList();
    public volatile long A04;
    public volatile String A05 = UUID.randomUUID().toString();
    public volatile boolean A06;
    public volatile boolean A07;

    public static void A03(String str, LocalSocket localSocket) {
        C40431oe.A01("LocalSocketVideoProxy", "Disconnecting url: %s local socket %s", str, localSocket);
        try {
            localSocket.close();
        } catch (IOException e) {
            C40431oe.A05("LocalSocketVideoProxy", e, "Error trying to close server connection", new Object[0]);
        }
    }

    public static C40121o7 A00() {
        if (A08 == null) {
            synchronized (C40121o7.class) {
                if (A08 == null) {
                    A08 = new C40121o7();
                }
            }
        }
        return A08;
    }

    public static void A01(BufferedReader bufferedReader, Map map) {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                int indexOf = readLine.indexOf(58);
                if (indexOf >= 0) {
                    map.put(readLine.substring(0, indexOf).trim(), readLine.substring(indexOf + 1).trim());
                }
            } else {
                return;
            }
        }
    }

    public static void A02(IOException iOException) {
        if (!"Broken pipe".equals(iOException.getMessage())) {
            C40431oe.A05("LocalSocketVideoProxy", iOException, "%s", iOException.getMessage());
        }
    }
}
