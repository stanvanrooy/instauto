package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;

/* renamed from: X.BUO */
public final class BUO implements AnonymousClass0RN {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Bitmap A04;
    public Canvas A05;
    public C25665BUb A06;
    public BUN A07;
    public String A08;
    public final int A09;
    public final int A0A;
    public final Context A0B = StoredPreferences.A00;
    public final BitmapFactory.Options A0C;
    public final Paint A0D = new Paint(2);
    public final Rect A0E = new Rect();
    public final RectF A0F = new RectF();
    public final ArrayList A0G = new ArrayList();
    public final boolean A0H;
    public final boolean A0I;
    public final int A0J;
    public final AnonymousClass0C1 A0K;

    private synchronized BUN A00() {
        return this.A07;
    }

    public static synchronized void A02(BUO buo, BUN bun) {
        synchronized (buo) {
            buo.A07 = bun;
        }
    }

    public final String getModuleName() {
        return "media_scanner";
    }

    public static void A03(BUO buo, String str, C06270Ok r6) {
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(buo.A0K);
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00(str, buo);
        A002.A0G("session_id", buo.A08);
        A002.A0G("ig_userid", buo.A0K.A04());
        A002.A08("extra_data", r6);
        A012.BcG(A002);
    }

    public BUO(AnonymousClass0C1 r6) {
        this.A0K = r6;
        this.A0C = new BitmapFactory.Options();
        this.A0A = ((Integer) AnonymousClass0L6.A02(this.A0K, AnonymousClass0L7.FS_NEW_GALLERY, "media_scanner_page_size", 100, (AnonymousClass04H) null)).intValue();
        AnonymousClass0C1 r1 = this.A0K;
        AnonymousClass0L7 r4 = AnonymousClass0L7.FS_NEW_GALLERY;
        this.A0H = ((Boolean) AnonymousClass0L6.A02(r1, r4, "face_detection_scanner", false, (AnonymousClass04H) null)).booleanValue();
        this.A0I = ((Boolean) AnonymousClass0L6.A02(this.A0K, r4, "geocode_scanner", false, (AnonymousClass04H) null)).booleanValue();
        AnonymousClass0C1 r42 = this.A0K;
        AnonymousClass0L7 r3 = AnonymousClass0L7.FS_NEW_GALLERY;
        int intValue = ((Integer) AnonymousClass0L6.A02(r42, r3, "max_media_per_scan", -1, (AnonymousClass04H) null)).intValue();
        this.A0J = intValue <= 0 ? Integer.MAX_VALUE : intValue;
        this.A09 = ((Integer) AnonymousClass0L6.A02(this.A0K, r3, "media_scanner_delay_ms", 0, (AnonymousClass04H) null)).intValue();
        if (this.A0H) {
            this.A0G.add(new BUZ());
        }
        if (this.A0I) {
            this.A0G.add(new BUV(this.A0B));
        }
    }

    public static void A01(BUO buo) {
        if (buo.A00() == null) {
            AnonymousClass0QD.A02("MediaScanner#exitedWithoutExitReason", "");
            A02(buo, BUN.A07);
        }
        C25665BUb bUb = buo.A06;
        if (bUb != null) {
            bUb.A00.close();
        }
        BUN A002 = buo.A00();
        long currentTimeMillis = System.currentTimeMillis() - buo.A03;
        int i = buo.A00;
        int i2 = buo.A02;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i2 > 0) {
            f = ((float) i) / ((float) i2);
        }
        C06270Ok A003 = C06270Ok.A00();
        A003.A05("faces_scanner_enabled", Boolean.valueOf(buo.A0H));
        A003.A05("location_scanner_enabled", Boolean.valueOf(buo.A0I));
        A003.A06("percent_complete", Float.valueOf(f));
        A003.A08("duration", Long.valueOf(currentTimeMillis));
        A003.A09("reason", A002.name());
        A03(buo, "ig_feed_gallery_media_scanner_completed", A003);
        buo.A00();
    }

    public static boolean A04(BUO buo) {
        BUN bun;
        if (buo.A00() == null) {
            if (buo.A01 >= buo.A0J) {
                bun = BUN.ITEM_SCAN_LIMIT_REACHED;
            } else if (Thread.currentThread().isInterrupted()) {
                bun = BUN.STOPPED;
            } else if (C252117x.A02().A07()) {
                bun = BUN.LOW_MEMORY;
            }
            A02(buo, bun);
        }
        if (buo.A00() != null) {
            return true;
        }
        return false;
    }
}
