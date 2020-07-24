package p000X;

import java.net.InetAddress;

/* renamed from: X.AQS */
public final class AQS implements Runnable {
    public final String A00;

    public final void run() {
        ATK.A00("BrowserLiteFragment", "Async resolving %s", this.A00);
        try {
            InetAddress.getByName(this.A00);
        } catch (Exception e) {
            ATK.A00("BrowserLiteFragment", "Exception during async DNS: %s", e.getMessage());
        }
        ATK.A00("BrowserLiteFragment", "Done resolving %s", this.A00);
    }

    public AQS(String str) {
        this.A00 = str;
    }
}
