package p000X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.1Br  reason: invalid class name and case insensitive filesystem */
public final class C26101Br {
    public static File A00;
    public static File A01;
    public static File A02;
    public static File A03;
    public static File A04;
    public static File A05;
    public static File A06;
    public static File A07;
    public static File A08;
    public static File A09;

    public static File A00(Context context) {
        return new File(A03(context), AnonymousClass000.A0C("cover_photo_", System.currentTimeMillis(), ".jpeg"));
    }

    public static File A01(Context context) {
        if (A03 == null) {
            A03 = new File(A08(context), "music");
        }
        return A03;
    }

    public static File A02(Context context) {
        if (A04 == null) {
            A04 = new File(A08(context), "videos");
        }
        return A04;
    }

    public static File A03(Context context) {
        if (A05 == null) {
            A05 = new File(A08(context), "covers");
        }
        return A05;
    }

    public static File A04(Context context) {
        if (A06 == null) {
            A06 = new File(A08(context), "frame_capture");
        }
        return A06;
    }

    public static File A05(Context context) {
        if (A07 == null) {
            A07 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), getFolderNameForApplication(C06460Pd.A01(context)));
        }
        A07.mkdirs();
        return A07;
    }

    public static File A06(Context context) {
        if (A08 == null) {
            A08 = new File(A08(context), "rendered_videos");
        }
        return A08;
    }

    public static File A07(Context context) {
        return new File(A08(context), "temp_video_import/");
    }

    public static File A08(Context context) {
        File file = A09;
        if (file != null) {
            return file;
        }
        File A002 = C26111Bs.A00(context);
        A09 = A002;
        return A002;
    }

    public static String A09(long j) {
        return new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date(j));
    }

    public static String A0A(Context context, long j, String str, boolean z) {
        File A062;
        if (!z || !C35251g3.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            A0E(context);
            A062 = A06(context);
        } else {
            A062 = A05(context);
        }
        File file = new File(A062, C06360Ot.formatString("%s.%s", A09(j), str));
        file.delete();
        return file.getAbsolutePath();
    }

    public static void A0F(String str, Context context) {
        File file = new File(A02(context), str);
        if (file.isDirectory()) {
            C05700Lp.A00().ADc(new AnonymousClass8FF(file));
        }
    }

    public static String getFolderNameForApplication(String str) {
        return str.replace(' ', '_');
    }

    public static String A0B(Context context, String str, String str2) {
        File A012 = A01(context);
        A012.mkdirs();
        return new File(A012, "audio_" + System.currentTimeMillis() + str + str2).getAbsolutePath();
    }

    public static String A0C(String str, int i, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            return str;
        }
        String A052 = C06360Ot.formatString("%s_session_%s", A09(currentTimeMillis), Integer.valueOf(i));
        new File(A02(context), A052).mkdirs();
        return A052;
    }

    public static String A0D(String str, Context context) {
        String A0J = AnonymousClass000.A0J(A09(System.currentTimeMillis()), "_recorded", ".mp4");
        File file = new File(A02(context), str);
        file.mkdirs();
        return new File(file, A0J).getPath();
    }

    public static void A0E(Context context) {
        A02(context).mkdirs();
        A03(context).mkdirs();
        A01(context).mkdirs();
        if (A01 == null) {
            A01 = new File(A08(context), "clips_camera");
        }
        A01.mkdirs();
        A04(context).mkdirs();
        A06(context).mkdirs();
        if (A02 == null) {
            A02 = new File(A08(context), "original_frame_capture");
        }
        A02.mkdir();
        if (A00 == null) {
            A00 = new File(context.getExternalFilesDir((String) null), "boomerang_frame_capture");
        }
        A00.mkdir();
        if (!A02(context).isDirectory() || !A03(context).isDirectory() || !A01(context).isDirectory() || !A06(context).isDirectory()) {
            throw new IllegalStateException("Could not create video directories");
        }
    }
}
