package p000X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.00o  reason: invalid class name and case insensitive filesystem */
public final class C020000o extends C035407j {
    public final AnonymousClass00N A00 = new AnonymousClass00N();
    public final C019400i A01 = new C019400i(true);
    public final ArrayList A02 = new ArrayList();
    public volatile boolean A03 = true;

    public final synchronized void A05(SensorEventListener sensorEventListener, Sensor sensor) {
        if (this.A03) {
            this.A02.add(new C036707x(sensorEventListener, sensor));
            C036607w r2 = (C036607w) this.A00.get(sensor);
            if (r2 == null) {
                this.A00.put(sensor, new C036607w(SystemClock.elapsedRealtime()));
            } else {
                r2.A00++;
            }
        }
    }

    public final synchronized void A06(SensorEventListener sensorEventListener, Sensor sensor) {
        int i;
        if (this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C036707x r7 = (C036707x) it.next();
                if (sensorEventListener == r7.A01) {
                    if (sensor == null || sensor == r7.A00) {
                        it.remove();
                        C036607w r3 = (C036607w) this.A00.get(r7.A00);
                        if (!(r3 == null || (i = r3.A00) == 0)) {
                            if (i > 1) {
                                r3.A00 = i - 1;
                            } else {
                                this.A00.remove(r7.A00);
                                int type = r7.A00.getType();
                                C019800m r6 = (C019800m) this.A01.A01.get(type, (Object) null);
                                if (r6 == null) {
                                    r6 = new C019800m();
                                    this.A01.A01.put(type, r6);
                                }
                                long j = elapsedRealtime - r3.A01;
                                r6.A01 += j;
                                this.A01.A02.A01 += j;
                                double power = ((((double) r7.A00.getPower()) * ((double) j)) / 3600.0d) / 1000.0d;
                                r6.A00 += power;
                                this.A01.A02.A00 += power;
                                if (C036807y.A00(r7.A00)) {
                                    r6.A02 += j;
                                    this.A01.A02.A02 += j;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final C035307i A03() {
        return new C019400i(false);
    }

    public final /* bridge */ /* synthetic */ boolean A04(C035307i r15) {
        C019400i r152 = (C019400i) r15;
        synchronized (this) {
            C035707m.A00(r152);
            if (!this.A03) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r152.A04(this.A01);
            int size = this.A00.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass00N r0 = this.A00;
                Sensor sensor = (Sensor) r0.A06(i);
                C036607w r1 = (C036607w) r0.A08(i);
                if (r1.A00 > 0) {
                    long j = elapsedRealtime - r1.A01;
                    double power = ((((double) sensor.getPower()) * ((double) j)) / 3600.0d) / 1000.0d;
                    C019800m r9 = r152.A02;
                    r9.A01 += j;
                    r9.A00 += power;
                    boolean A002 = C036807y.A00(sensor);
                    if (A002) {
                        r152.A02.A02 += j;
                    }
                    if (r152.A00) {
                        int type = sensor.getType();
                        C019800m r7 = (C019800m) r152.A01.get(type);
                        if (r7 == null) {
                            r7 = new C019800m();
                            r152.A01.put(type, r7);
                        }
                        r7.A01 += j;
                        r7.A00 += power;
                        if (A002) {
                            r7.A02 += j;
                        }
                    }
                }
            }
            return true;
        }
    }
}
