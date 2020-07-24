package p000X;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.BLs */
public final class BLs {
    public static final AnonymousClass00C A00 = new AnonymousClass00C(16);
    public static final AnonymousClass00N A01 = new AnonymousClass00N();
    public static final BM0 A02 = new BM0();
    public static final Object A03 = new Object();
    public static final Comparator A04 = new C25465BLw();

    public static BLx A01(Context context, BLq bLq, int i) {
        try {
            C25464BLv A002 = A00(context, bLq);
            int i2 = A002.A00;
            int i3 = -3;
            if (i2 == 0) {
                Typeface A06 = C73123Il.A01.A06(context, (CancellationSignal) null, A002.A01, i);
                if (A06 != null) {
                    i3 = 0;
                }
                return new BLx(A06, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new BLx((Typeface) null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new BLx((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0194  */
    public static C25464BLv A00(Context context, BLq bLq) {
        Cursor cursor;
        int i;
        int i2;
        Uri uri;
        int i3;
        boolean z;
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        BLq bLq2 = bLq;
        String str = bLq2.A02;
        int i4 = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = bLq2.A03;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                Collections.sort(arrayList, A04);
                List list = bLq2.A05;
                if (list == null) {
                    list = AnonymousClass95I.A00(resources, bLq2.A00);
                }
                while (true) {
                    if (i4 >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                    Collections.sort(arrayList2, A04);
                    if (arrayList.size() == arrayList2.size()) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList.size()) {
                                if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                    break;
                                }
                                i5++;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        break;
                    }
                    i4++;
                }
                if (resolveContentProvider == null) {
                    return new C25464BLv(1, (C25477BMn[]) null);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{bLq2.A04}, (String) null, (CancellationSignal) null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() > 0) {
                                int columnIndex = cursor.getColumnIndex("result_code");
                                arrayList3 = new ArrayList();
                                int columnIndex2 = cursor.getColumnIndex("_id");
                                int columnIndex3 = cursor.getColumnIndex("file_id");
                                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursor.getColumnIndex("font_weight");
                                int columnIndex6 = cursor.getColumnIndex("font_italic");
                                while (cursor.moveToNext()) {
                                    if (columnIndex != -1) {
                                        i = cursor.getInt(columnIndex);
                                    } else {
                                        i = 0;
                                    }
                                    if (columnIndex4 != -1) {
                                        i2 = cursor.getInt(columnIndex4);
                                    } else {
                                        i2 = 0;
                                    }
                                    if (columnIndex3 == -1) {
                                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                    } else {
                                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                    }
                                    if (columnIndex5 != -1) {
                                        i3 = cursor.getInt(columnIndex5);
                                    } else {
                                        i3 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                                    }
                                    if (columnIndex6 != -1) {
                                        z = true;
                                        if (cursor.getInt(columnIndex6) == 1) {
                                            arrayList3.add(new C25477BMn(uri, i2, i3, z, i));
                                        }
                                    }
                                    z = false;
                                    arrayList3.add(new C25477BMn(uri, i2, i3, z, i));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return new C25464BLv(0, (C25477BMn[]) arrayList3.toArray(new C25477BMn[0]));
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                throw new PackageManager.NameNotFoundException(AnonymousClass000.A0N("Found content provider ", str, ", but package was not ", str3));
            }
        } else {
            throw new PackageManager.NameNotFoundException(AnonymousClass000.A0E(C193418Ps.$const$string(58), str));
        }
    }
}
