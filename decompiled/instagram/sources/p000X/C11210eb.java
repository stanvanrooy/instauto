package p000X;

import android.os.Environment;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0eb  reason: invalid class name and case insensitive filesystem */
public final class C11210eb {
    public static final C11210eb A06 = new C11210eb();
    public final C11260eg A00 = C11260eg.A01;
    public final File A01 = new File(new File(Environment.getExternalStorageDirectory(), "e2e/files"), AnonymousClass000.A0E("com.facebook.instagram.", "mock_connectivity.ping"));
    public final ScheduledExecutorService A02 = Executors.newSingleThreadScheduledExecutor();
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final C11220ec A04 = C11220ec.A03;
    public final File A05 = new File(new File(Environment.getExternalStorageDirectory(), "e2e/files"), AnonymousClass000.A0E("com.facebook.instagram.", "mock_connectivity.json"));
}
