package p000X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.uimanager.BaseViewManager;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.11q  reason: invalid class name and case insensitive filesystem */
public final class C237411q extends C237311p {
    public static final Pattern A01 = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
    public Float A00 = Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);

    public final void A01(int i, Context context) {
        Cursor query;
        try {
            float floatValue = this.A00.floatValue();
            int i2 = i;
            Context context2 = context;
            if (floatValue >= 4.0f && floatValue < 5.0f) {
                Intent intent = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                intent.setFlags(16);
                intent.putExtra("packagename", context2.getPackageName());
                intent.putExtra("count", i2);
                context2.sendBroadcast(intent);
                ContentResolver contentResolver = context2.getContentResolver();
                HashSet<Integer> hashSet = new HashSet<>();
                query = contentResolver.query(Uri.parse("content://com.htc.launcher.settings/favorites"), new String[]{"_id", "intent"}, C06360Ot.formatString("%s LIKE ?", "intent"), new String[]{AnonymousClass000.A0J("%", context2.getPackageName(), "%")}, (String) null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("_id");
                    int columnIndex2 = query.getColumnIndex("intent");
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        try {
                            ComponentName component = Intent.parseUri(query.getString(columnIndex2), 0).getComponent();
                            if (component != null && context2.getPackageName().equals(component.getPackageName()) && C237311p.A00(context2).getClassName().equals(component.getClassName())) {
                                hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                            }
                        } catch (URISyntaxException unused) {
                        }
                        query.moveToNext();
                    }
                    query.close();
                }
                for (Integer longValue : hashSet) {
                    Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                    intent.setFlags(16);
                    intent2.putExtra("packagename", C237311p.A00(context2).flattenToShortString());
                    intent2.putExtra("favorite_item_id", longValue.longValue());
                    intent2.putExtra("selectArgs", new String[]{C06360Ot.A05("%%%%s%%", C237311p.A00(context2).flattenToShortString())});
                    intent2.putExtra("count", i2);
                    context2.sendBroadcast(intent2);
                }
            } else if (floatValue > 5.0f) {
                Intent intent3 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
                intent3.setFlags(16);
                intent3.putExtra("com.htc.launcher.extra.COMPONENT", C237311p.A00(context2).flattenToShortString());
                intent3.putExtra("com.htc.launcher.extra.COUNT", i2);
                context2.sendBroadcast(intent3);
            }
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A[LOOP:0: B:3:0x0013->B:20:0x004e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[SYNTHETIC] */
    public final boolean A02(Context context, String str) {
        Float f;
        if (str.equals("com.htc.launcher")) {
            FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
            int length = systemAvailableFeatures.length;
            int i = 0;
            while (i < length) {
                String str2 = systemAvailableFeatures[i].name;
                if (str2 != null && str2.startsWith("com.htc.software.Sense")) {
                    Matcher matcher = A01.matcher(str2);
                    if (matcher.matches()) {
                        try {
                            f = Float.valueOf(Float.parseFloat(matcher.group(1)));
                        } catch (NumberFormatException unused) {
                        }
                        if (f == null || f.floatValue() < 4.0f) {
                            i++;
                        } else {
                            this.A00 = f;
                            return true;
                        }
                    }
                }
                f = null;
                if (f == null || f.floatValue() < 4.0f) {
                }
            }
        }
        return false;
    }
}
