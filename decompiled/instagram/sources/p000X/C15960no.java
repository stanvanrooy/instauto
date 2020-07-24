package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.C0003R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0no  reason: invalid class name and case insensitive filesystem */
public final class C15960no {
    public static final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (android.os.Build.MODEL.toUpperCase(p000X.C15300mf.A03()).startsWith("SM-N900") == false) goto L_0x002b;
     */
    static {
        boolean z;
        if (Build.VERSION.SDK_INT == 18 && Build.MANUFACTURER.toUpperCase(C15300mf.A03()).equals("SAMSUNG")) {
            z = false;
        }
        z = true;
        A00 = z;
    }

    public static String A01(double d) {
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        instance.setTimeInMillis(Double.valueOf(d * 1000.0d).longValue());
        return DateFormat.getDateInstance(1, C15300mf.A03()).format(instance.getTime());
    }

    public static String A02(double d, double d2) {
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        instance.setTimeInMillis(Double.valueOf(d * 1000.0d).longValue());
        int i = instance.get(1);
        Date time = instance.getTime();
        Calendar instance2 = Calendar.getInstance(Locale.ENGLISH);
        instance2.setTimeInMillis(Double.valueOf(d2 * 1000.0d).longValue());
        if (instance2.get(1) != i) {
            return DateFormat.getDateInstance(1, C15300mf.A03()).format(time);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d", C15300mf.A03());
        Locale A03 = C15300mf.A03();
        if (A00) {
            simpleDateFormat.applyPattern(android.text.format.DateFormat.getBestDateTimePattern(A03, "MMMM d"));
        }
        return simpleDateFormat.format(time);
    }

    public static String A03(long j) {
        Object[] objArr;
        String str;
        long hours = TimeUnit.MILLISECONDS.toHours(j) % 24;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j) % 60;
        long seconds = timeUnit.toSeconds(j) % 60;
        if (hours == 0) {
            objArr = new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)};
            str = "%d:%02d";
        } else {
            objArr = new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)};
            str = "%d:%02d:%02d";
        }
        return String.format(str, objArr);
    }

    public static String A05(Context context, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(C15300mf.A03(), "MMMM d"));
        Long valueOf = Long.valueOf(j);
        return context.getString(C0003R.string.date_and_time, new Object[]{simpleDateFormat.format(valueOf), DateFormat.getTimeInstance(3, C15300mf.A03()).format(valueOf).toLowerCase(C15300mf.A03())});
    }

    public static String A07(Resources resources, double d) {
        return A08(resources, d, Constants.ZERO, false, C29291Pi.SECONDS);
    }

    public static void A0A(Map map, Date date, Date date2) {
        int i;
        int i2;
        int i3;
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        instance.setTime(date2);
        long timeInMillis = instance.getTimeInMillis();
        Calendar instance2 = Calendar.getInstance(Locale.ENGLISH);
        instance2.setTime(date);
        int i4 = instance2.get(5);
        int i5 = 0;
        int i6 = 0;
        while (instance2.getTimeInMillis() < timeInMillis) {
            i4 = instance2.get(5);
            instance2.add(2, 1);
            i6++;
        }
        if (i6 > 0) {
            instance2.add(2, -1);
            instance2.set(5, i4);
            i6--;
        }
        long timeInMillis2 = timeInMillis - instance2.getTimeInMillis();
        if (timeInMillis2 > 0) {
            i5 = (int) TimeUnit.MILLISECONDS.toDays(timeInMillis2);
            long millis = timeInMillis2 - TimeUnit.DAYS.toMillis((long) i5);
            i2 = (int) TimeUnit.MILLISECONDS.toHours(millis);
            long millis2 = millis - TimeUnit.HOURS.toMillis((long) i2);
            i = (int) TimeUnit.MILLISECONDS.toMinutes(millis2);
            i3 = (int) TimeUnit.MILLISECONDS.toSeconds(millis2 - TimeUnit.MINUTES.toMillis((long) i));
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        map.put(C29291Pi.MONTHS, Integer.valueOf(i6));
        map.put(C29291Pi.DAYS, Integer.valueOf(i5));
        map.put(C29291Pi.HOURS, Integer.valueOf(i2));
        map.put(C29291Pi.MINUTES, Integer.valueOf(i));
        map.put(C29291Pi.SECONDS, Integer.valueOf(i3));
    }

    public static Long A00() {
        return Long.valueOf(((long) TimeZone.getDefault().getOffset(System.currentTimeMillis())) / 1000);
    }

    public static String A04(Context context, double d) {
        return A08(context.getResources(), d, Constants.A0N, true, C29291Pi.SECONDS);
    }

    public static String A06(Context context, long j) {
        return A08(context.getResources(), (double) j, Constants.ZERO, false, C29291Pi.SECONDS);
    }

    public static String A08(Resources resources, double d, Integer num, boolean z, C29291Pi r14) {
        int ordinal;
        C29291Pi r3;
        double currentTimeMillis = (double) (System.currentTimeMillis() / 1000);
        double floor = Math.floor(Math.max(1.0d, currentTimeMillis - d));
        if (floor <= 60.0d) {
            ordinal = r14.ordinal();
            r3 = C29291Pi.SECONDS;
        } else {
            floor /= 60.0d;
            if (floor <= 60.0d) {
                ordinal = r14.ordinal();
                r3 = C29291Pi.MINUTES;
            } else {
                floor /= 60.0d;
                if (floor <= 24.0d) {
                    ordinal = r14.ordinal();
                    r3 = C29291Pi.HOURS;
                } else {
                    floor /= 24.0d;
                    if (floor <= 7.0d) {
                        ordinal = r14.ordinal();
                        r3 = C29291Pi.DAYS;
                    } else {
                        Integer num2 = Constants.ZERO;
                        if (num == num2 || !z) {
                            return A09(resources, C29291Pi.WEEKS, (int) Math.round(floor / 7.0d), num2);
                        }
                        return A02(d, currentTimeMillis);
                    }
                }
            }
        }
        if (ordinal <= r3.ordinal()) {
            return A09(resources, r3, (int) Math.round(floor), num);
        }
        return resources.getString(C0003R.string.now);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r1 = new java.lang.Object[r0];
        r1[r3] = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        return r4.getString(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = new java.lang.Object[r0];
        r1[r3] = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        return r4.getQuantityString(r2, r6, r1);
     */
    public static String A09(Resources resources, C29291Pi r5, int i, Integer num) {
        char c;
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        switch (num.intValue()) {
            case 0:
                c = 0;
                i3 = 1;
                switch (r5.ordinal()) {
                    case 0:
                        i2 = C0003R.string.seconds_abbreviation_with_placeholder;
                        break;
                    case 1:
                        i2 = C0003R.string.minutes_abbreviation_with_placeholder;
                        break;
                    case 2:
                        i2 = C0003R.string.hours_abbreviation_with_placeholder;
                        break;
                    case 3:
                        i2 = C0003R.string.days_abbreviation_with_placeholder;
                        break;
                    default:
                        i2 = C0003R.string.weeks_abbreviation_with_placeholder;
                        break;
                }
            case 1:
                c = 0;
                i3 = 1;
                switch (r5.ordinal()) {
                    case 0:
                        i2 = C0003R.string.seconds_ago_abbreviation;
                        break;
                    case 1:
                        i2 = C0003R.string.minutes_ago_abbreviation;
                        break;
                    case 2:
                        i2 = C0003R.string.hours_ago_abbreviation;
                        break;
                    case 3:
                        i2 = C0003R.string.days_ago_abbreviation;
                        break;
                    default:
                        i2 = C0003R.string.weeks_ago_abbreviation;
                        break;
                }
            case 2:
                c2 = 0;
                i4 = 1;
                switch (r5.ordinal()) {
                    case 0:
                        i5 = C0003R.plurals.x_seconds;
                        break;
                    case 1:
                        i5 = C0003R.plurals.x_minutes;
                        break;
                    case 2:
                        i5 = C0003R.plurals.x_hours;
                        break;
                    case 3:
                        i5 = C0003R.plurals.x_days;
                        break;
                    default:
                        i5 = C0003R.plurals.x_weeks;
                        break;
                }
            default:
                c2 = 0;
                i4 = 1;
                switch (r5.ordinal()) {
                    case 0:
                        i5 = C0003R.plurals.x_seconds_ago;
                        break;
                    case 1:
                        i5 = C0003R.plurals.x_minutes_ago;
                        break;
                    case 2:
                        i5 = C0003R.plurals.x_hours_ago;
                        break;
                    case 3:
                        i5 = C0003R.plurals.x_days_ago;
                        break;
                    default:
                        i5 = C0003R.plurals.x_weeks_ago;
                        break;
                }
        }
    }
}
