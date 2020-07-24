package p000X;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.0Ti  reason: invalid class name and case insensitive filesystem */
public final class C07500Ti {
    public int A00;
    public Notification.Builder A01;
    public String A02 = "";
    public Queue A03;
    public final Context A04;
    public final int A05;
    public final NotificationManager A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    private Notification.InboxStyle A00() {
        Notification.InboxStyle summaryText = new Notification.InboxStyle().setBigContentTitle(AnonymousClass000.A0J("[", this.A07, "]")).setSummaryText(this.A08);
        for (CharSequence addLine : this.A03) {
            summaryText.addLine(addLine);
        }
        return summaryText;
    }

    public final void A01(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (!this.A09) {
            try {
                this.A06.cancel("MqttDiagnosticNotification", this.A05);
            } catch (RuntimeException unused) {
            }
        } else {
            synchronized (this) {
                this.A00 = 0;
                this.A02 = str;
                int i = -65536;
                int i2 = 17301608;
                if ("CONNECTED".equals(str)) {
                    i2 = 17301611;
                    i = -16711936;
                } else if ("CONNECTING".equals(str)) {
                    i2 = 17301607;
                    i = -256;
                }
                Notification.Builder contentText = new Notification.Builder(this.A04).setChannelId("debug_channel").setSmallIcon(i2).setContentIntent(PendingIntent.getActivity(this.A04, 0, new Intent().setPackage(this.A04.getPackageName()), 0)).setContentTitle(AnonymousClass000.A0J("[", this.A07, "]")).setContentText(str);
                this.A01 = contentText;
                if (Build.VERSION.SDK_INT >= 21) {
                    contentText.setColor(i);
                }
                this.A01.setStyle(A00());
                this.A06.notify("MqttDiagnosticNotification", this.A05, this.A01.getNotification());
            }
        }
    }

    public final void A02(String str) {
        if (!this.A09) {
            try {
                this.A06.cancel("MqttDiagnosticNotification", this.A05);
            } catch (RuntimeException unused) {
            }
        } else if (this.A01 != null) {
            synchronized (this) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Notification.Builder builder = this.A01;
                    int i = this.A00 + 1;
                    this.A00 = i;
                    builder.setSubText(String.valueOf(i));
                } else {
                    Notification.Builder builder2 = this.A01;
                    int i2 = this.A00 + 1;
                    this.A00 = i2;
                    builder2.setContentInfo(String.valueOf(i2));
                }
                this.A03.add(AnonymousClass000.A0J(new SimpleDateFormat("h:mm:ss a").format(new Date()), " ", str));
                if (this.A03.size() > 8) {
                    this.A03.poll();
                }
                this.A01.setContentText(this.A02);
                this.A01.setStyle(A00());
                this.A06.notify("MqttDiagnosticNotification", this.A05, this.A01.getNotification());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    public C07500Ti(Context context, String str, boolean z, C10960eC r10) {
        int i;
        boolean z2 = false;
        this.A00 = 0;
        this.A07 = str;
        if (Build.VERSION.SDK_INT < 26) {
            this.A04 = null;
            return;
        }
        this.A04 = context;
        this.A06 = (NotificationManager) AnonymousClass0TU.A00.A00(context, "notification", NotificationManager.class);
        try {
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) this.A04.getSystemService("activity")).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    i = next.processName.hashCode();
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        this.A05 = i;
        this.A08 = AnonymousClass000.A0E("Started on ", new SimpleDateFormat("M/d h:mm:ss a").format(new Date()));
        this.A03 = new LinkedList();
        z2 = (z || r10.A00(Constants.A05).A00.getBoolean("is_on", false)) ? true : z2;
        this.A09 = z2;
        if (!z2) {
            ((NotificationManager) this.A04.getSystemService("notification")).createNotificationChannel(new NotificationChannel("debug_channel", "Debugging Information", 2));
            return;
        }
        return;
        i = 42;
        this.A05 = i;
        this.A08 = AnonymousClass000.A0E("Started on ", new SimpleDateFormat("M/d h:mm:ss a").format(new Date()));
        this.A03 = new LinkedList();
        this.A09 = z2;
        if (!z2) {
        }
    }
}
