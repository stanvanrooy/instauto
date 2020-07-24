package p000X;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B8t */
public final class B8t {
    public final Context A00;
    public final C25229B8u A01;
    public final C25219B8h A02;
    public final C17490qK A03;
    public final AnonymousClass0OZ A04;
    public final C06840Qp A05;
    public final C06820Qn A06;

    public final void A00() {
        IllegalArgumentException illegalArgumentException;
        C25219B8h b8h;
        C17490qK r2 = this.A03;
        if (r2.BnG() || r2.BnH()) {
            List<PackageInfo> installedPackages = this.A00.getPackageManager().getInstalledPackages(0);
            ArrayList<String> arrayList = new ArrayList<>();
            String packageName = this.A00.getPackageName();
            for (PackageInfo next : installedPackages) {
                String str = next.packageName;
                if (!str.equals(packageName) && B8c.A00(this.A00, str)) {
                    arrayList.add(next.packageName);
                }
            }
            for (String str2 : arrayList) {
                C25231B8x b8x = new C25231B8x(str2, this.A03.ARp(), "contentproviders");
                B8w b8w = new B8w(str2, this.A03.AVO());
                String A0E = AnonymousClass000.A0E(str2, ".provider.phoneid");
                ContentProviderClient acquireContentProviderClient = this.A00.getContentResolver().acquireContentProviderClient(A0E);
                boolean z = false;
                if (acquireContentProviderClient == null) {
                    z = false;
                } else {
                    try {
                        ProviderInfo resolveContentProvider = this.A00.getPackageManager().resolveContentProvider(A0E, 0);
                        if (resolveContentProvider != null) {
                            String str3 = resolveContentProvider.packageName;
                            if (!str2.equals(str3)) {
                                illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0N("content provider package name conflict. Expected:", str2, " Found:", str3));
                            } else if (B8c.A00(this.A00, str2)) {
                                Cursor query = acquireContentProviderClient.query(Uri.parse(AnonymousClass000.A0E("content://", A0E)), (String[]) null, (String) null, (String[]) null, (String) null);
                                if (query == null || !query.moveToFirst()) {
                                    illegalArgumentException = new IllegalArgumentException("empty Cursor object");
                                } else {
                                    b8x.A00 = System.currentTimeMillis();
                                    b8w.A00 = System.currentTimeMillis();
                                    int columnIndex = query.getColumnIndex("COL_PHONE_ID");
                                    int columnIndex2 = query.getColumnIndex("COL_TIMESTAMP");
                                    int columnIndex3 = query.getColumnIndex("COL_ORIGIN");
                                    boolean z2 = false;
                                    if (columnIndex < 0 || columnIndex2 < 0) {
                                        b8x.A01 = Constants.A0C;
                                    } else {
                                        String string = query.getString(columnIndex);
                                        String string2 = query.getString(columnIndex2);
                                        String str4 = null;
                                        if (columnIndex3 >= 0) {
                                            str4 = query.getString(columnIndex3);
                                        }
                                        if (string == null || string.length() <= 0 || string2 == null || string2.length() <= 0) {
                                            b8x.A01 = Constants.A0Y;
                                        } else {
                                            b8x.A00 = new C17570qS(string, Long.parseLong(string2), str4);
                                            this.A01.A00(b8x);
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    int columnIndex4 = query.getColumnIndex("COL_SFDID");
                                    int columnIndex5 = query.getColumnIndex("COL_SFDID_CREATION_TS");
                                    int columnIndex6 = query.getColumnIndex("COL_SFDID_GP");
                                    int columnIndex7 = query.getColumnIndex("COL_SFDID_GA");
                                    if (columnIndex4 < 0 || columnIndex5 < 0 || columnIndex6 < 0 || columnIndex7 < 0) {
                                        b8w.A01 = Constants.A0C;
                                    } else {
                                        String string3 = query.getString(columnIndex4);
                                        String string4 = query.getString(columnIndex5);
                                        String string5 = query.getString(columnIndex6);
                                        String string6 = query.getString(columnIndex7);
                                        if (string3 == null || string3.length() == 0 || string4 == null || string4.length() == 0 || string5 == null || string5.length() == 0 || string6 == null || string6.length() == 0) {
                                            b8w.A01 = Constants.A0Y;
                                        } else {
                                            C25217B8f b8f = new C25217B8f(string3, Long.parseLong(string4), string5, string6);
                                            b8w.A01 = b8f;
                                            C25229B8u b8u = this.A01;
                                            C25217B8f b8f2 = b8w.A00;
                                            if (b8f2 == null) {
                                                b8w.A01 = Constants.A12;
                                                b8u.A00.BkM(b8f);
                                            } else if (b8f.A03.equals(b8f2.A03)) {
                                                b8w.A01 = Constants.A0j;
                                            } else if (b8f2.A00 > b8f.A00) {
                                                b8w.A01 = Constants.ZERO;
                                                b8u.A00.BkM(b8f);
                                            } else {
                                                b8w.A01 = Constants.ONE;
                                            }
                                        }
                                    }
                                    if (query.moveToNext() && (b8h = this.A02) != null) {
                                        b8h.Bbw("PhoneIdRequester", "Multiple records in cursor", (Throwable) null);
                                    }
                                    query.close();
                                    acquireContentProviderClient.release();
                                    C06840Qp r1 = this.A05;
                                    if (r1 != null) {
                                        r1.A03(b8x);
                                        this.A05.A03(b8w);
                                    }
                                }
                            } else {
                                illegalArgumentException = new IllegalArgumentException("app signature mismatch");
                            }
                        } else {
                            illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0J("content provider package name conflict. Expected:", str2, " Found: No provider info."));
                        }
                        throw illegalArgumentException;
                    } catch (Exception e) {
                        b8x.A00 = System.currentTimeMillis();
                        b8w.A00 = System.currentTimeMillis();
                        C25219B8h b8h2 = this.A02;
                        if (b8h2 != null) {
                            b8h2.Bbw("PhoneIdRequester", e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        acquireContentProviderClient.release();
                        throw th;
                    }
                }
                if (!z) {
                    Intent intent = new Intent();
                    intent.setAction("com.facebook.GET_PHONE_ID");
                    intent.setPackage(str2);
                    PendingIntent activity = PendingIntent.getActivity(this.A00, 0, new Intent(), 134217728);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(IgReactPurchaseExperienceBridgeModule.RN_AUTH_KEY, activity);
                    this.A00.sendOrderedBroadcast(intent, (String) null, new C25230B8v(this.A01, this.A05, new C25231B8x(str2, this.A03.ARp(), AnonymousClass0C5.$const$string(198))), (Handler) null, 1, (String) null, bundle);
                }
            }
            AnonymousClass0OZ r0 = this.A04;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public B8t(Context context, C17490qK r3, C06820Qn r4, AnonymousClass0OZ r5, C06840Qp r6, C25219B8h b8h) {
        this.A00 = context;
        this.A03 = r3;
        this.A06 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = b8h;
        this.A01 = new C25229B8u(r3, r5, r4);
    }
}
