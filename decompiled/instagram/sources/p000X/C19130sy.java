package p000X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0sy  reason: invalid class name and case insensitive filesystem */
public final class C19130sy extends C19140sz {
    public static final String[] A02 = {"com.instagram.android", "com.instagram.android.preload"};
    public final Context A00;
    public final Set A01 = Collections.synchronizedSet(new HashSet());

    public final String AHu() {
        return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
    }

    public final boolean BnB(C42861tN r6, AnonymousClass0C1 r7, String str) {
        if (r7 == null) {
            return false;
        }
        String A002 = AnonymousClass3LJ.A00(str);
        String A04 = r7.A04();
        return A04.equals(r6.A08) && !RealtimeClientManager.getInstance(r7).isMqttConnected() && A002 != null && !this.A01.contains(AnonymousClass000.A0J(A04, "_", A002));
    }

    private void A00(AnonymousClass0C1 r6, C42861tN r7) {
        boolean z;
        C42891tQ r3 = r7.A00;
        if (r3 != null) {
            if (r6 != null) {
                C16180oA.A01(r6, r3.A01);
                C12670hC.A04(C237211o.A00(r6).A03);
            }
            String str = r7.A08;
            if (r6 == null || !r6.A04().equals(str)) {
                z = true;
            } else if (!AnonymousClass0Q7.A03().A0H()) {
                z = false;
            } else {
                z = !RealtimeClientManager.getInstance(r6).isReceivingRealtimeAndForeground();
            }
            if (z) {
                if (C237211o.A02()) {
                    AnonymousClass0J1.A09(str, Constants.A03, new C137165tB(this), (C05180Im) null);
                }
                C12670hC.A04(new C108494lu(this, str, r3));
            }
        }
    }

    public final void A35(C42861tN r3, AnonymousClass0P4 r4) {
        r4.A0G("message_id", C135385qE.A00(Uri.parse(AnonymousClass000.A0E("ig://", r3.A06))));
    }

    public final String AZM(C42861tN r4) {
        String str;
        String str2;
        Uri parse = Uri.parse(r4.A06);
        String str3 = r4.A03;
        if (str3.equals("direct_v2_message")) {
            str2 = "id";
        } else if (str3.equals("direct_v2_delete_item")) {
            str2 = "did";
        } else {
            str = null;
            return AnonymousClass3LJ.A01(r4.A08, str, (String) null);
        }
        str = parse.getQueryParameter(str2);
        return AnonymousClass3LJ.A01(r4.A08, str, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1.equals(com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION) == false) goto L_0x0017;
     */
    public final void BDA(C42861tN r10, String str, AnonymousClass0C1 r12, boolean z) {
        boolean z2;
        Uri parse = Uri.parse(r10.A06);
        String queryParameter = parse.getQueryParameter("dr");
        if (queryParameter != null) {
            z2 = true;
        }
        z2 = false;
        if (z2) {
            String str2 = r10.A08;
            String queryParameter2 = parse.getQueryParameter("sid");
            String queryParameter3 = parse.getQueryParameter("id");
            if (queryParameter3 == null) {
                queryParameter3 = parse.getQueryParameter("did");
            }
            String A002 = C135385qE.A00(parse);
            String queryParameter4 = parse.getQueryParameter("ts");
            Long l = null;
            if (queryParameter4 != null) {
                try {
                    l = Long.valueOf(Long.parseLong(queryParameter4));
                } catch (NumberFormatException unused) {
                    AnonymousClass0QD.A01("DirectNotificationUtils_ts", AnonymousClass000.A0E("Invalid ts: ", queryParameter4));
                }
            }
            String str3 = r10.A0A;
            if (str2 == null || queryParameter2 == null || queryParameter3 == null || A002 == null || l == null || str3 == null) {
                AnonymousClass0QD.A01("DirectPushNotificationHandler_sendDeliveryReceipt", "Invalid params: recipientId=" + str2 + " senderId=" + queryParameter2 + " threadId=" + queryParameter3 + " messageId=" + A002 + " timestampMs=" + l + " clientContext=" + str3);
            } else {
                AnonymousClass0J1.A09(str2, Constants.A03, new C137195tE(queryParameter2, queryParameter3, A002, str3, l), (C05180Im) null);
            }
        }
        A00(r12, r10);
    }

    public final boolean BnE(C42861tN r3, String str, AnonymousClass0C1 r5) {
        return r3.A03.equals("direct_v2_delete_item");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f2, code lost:
        if (r9 != null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01fa, code lost:
        if (r9 != null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01fc, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02a2, code lost:
        if (r5 != null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02aa, code lost:
        if (r5 != null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ac, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b3, code lost:
        if (r6.equals(r3) == false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r2.A05.A04((java.lang.String) null).contains(r5) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (com.instagram.realtimeclient.RealtimeClientManager.getInstance(r2).isMqttConnected() == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015e, code lost:
        if (r1 == false) goto L_0x0169;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void BnF(C42861tN r28, String str, C06590Pq r30, AnonymousClass2G7 r31) {
        boolean z;
        Uri build;
        ContentProviderClient A002;
        Cursor cursor;
        boolean z2;
        Uri build2;
        ContentProviderClient A003;
        Cursor cursor2;
        boolean z3;
        boolean z4;
        String str2;
        Uri build3;
        ContentProviderClient A004;
        Cursor cursor3;
        HashMap hashMap;
        ? r8;
        C42861tN r3 = r28;
        String str3 = r3.A08;
        AnonymousClass0C1 A03 = C05210Iq.A03(r30);
        boolean z5 = true;
        if (!AnonymousClass0Q7.A03().A0H() && A03 != null && A03.A04().equals(str3)) {
            z = true;
        }
        z = false;
        String A005 = AnonymousClass3LJ.A00(str);
        AnonymousClass2G7 r0 = r31;
        if (C06080Nr.A07(this.A00) && C06080Nr.A0A(this.A00)) {
            if (!z || C1427168l.A00(this.A00)) {
                if (!(str3 == null || A03 == null)) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    Context context = this.A00;
                    List list = r3.A0I;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((Integer) it.next()).intValue() != 1) {
                                str2 = null;
                            } else {
                                str2 = "com.instagram.threadsapp";
                            }
                            if (str2 != null) {
                                C12670hC.A01();
                                HashMap hashMap2 = null;
                                if (C06080Nr.A0B(context.getPackageManager(), str2) && (A004 = AnonymousClass0NH.A00(context, build3)) != null) {
                                    try {
                                        cursor3 = A004.query((build3 = new Uri.Builder().scheme("content").authority(AnonymousClass000.A0E(str2, ".contentprovider.users.loggedinusers")).build()), (String[]) null, (String) null, (String[]) null, (String) null);
                                        try {
                                            HashMap hashMap3 = new HashMap();
                                            if (cursor3 != null) {
                                                int columnIndexOrThrow = cursor3.getColumnIndexOrThrow(MemoryDumpUploadJob.EXTRA_USER_ID);
                                                int columnIndex = cursor3.getColumnIndex("session_id");
                                                int columnIndex2 = cursor3.getColumnIndex("username");
                                                int columnIndex3 = cursor3.getColumnIndex("profile_pic_url");
                                                int columnIndex4 = cursor3.getColumnIndex("is_active_user");
                                                while (cursor3.moveToNext()) {
                                                    String string = cursor3.getString(columnIndexOrThrow);
                                                    if (string != null) {
                                                        if (columnIndex != -1) {
                                                            cursor3.getString(columnIndex);
                                                        }
                                                        if (columnIndex2 != -1) {
                                                            cursor3.getString(columnIndex2);
                                                        }
                                                        if (columnIndex3 != -1) {
                                                            cursor3.getString(columnIndex3);
                                                        }
                                                        if (columnIndex4 != -1) {
                                                            cursor3.getString(columnIndex4);
                                                        }
                                                        C30777Djr djr = r16;
                                                        C30777Djr djr2 = new C30777Djr();
                                                        hashMap3.put(string, djr);
                                                    }
                                                }
                                            }
                                            A004.release();
                                            hashMap2 = hashMap3;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                                hashMap2 = hashMap3;
                                            }
                                        } catch (RemoteException e) {
                                            e = e;
                                            hashMap2 = cursor3;
                                            hashMap = hashMap2;
                                            AnonymousClass0QD.A0A("IgLoggedInUsers", e);
                                            r8 = hashMap2;
                                            hashMap = hashMap2;
                                            A004.release();
                                            if (r8 != 0) {
                                            }
                                            hashMap2 = null;
                                            z4 = true;
                                            break;
                                        } catch (RuntimeException e2) {
                                            e = e2;
                                            hashMap2 = cursor3;
                                            try {
                                                hashMap = hashMap2;
                                                AnonymousClass0QD.A05("IgLoggedInUsers", "contentProviderUri is: " + build3, e);
                                                hashMap = hashMap2;
                                                r8 = hashMap2;
                                                A004.release();
                                                if (r8 != 0) {
                                                }
                                                hashMap2 = null;
                                                z4 = true;
                                                break;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor3 = hashMap;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            A004.release();
                                            if (cursor3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (RemoteException e3) {
                                        e = e3;
                                        hashMap = hashMap2;
                                        AnonymousClass0QD.A0A("IgLoggedInUsers", e);
                                        r8 = hashMap2;
                                        hashMap = hashMap2;
                                        A004.release();
                                        if (r8 != 0) {
                                            r8.close();
                                        }
                                        hashMap2 = null;
                                        z4 = true;
                                        break;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        hashMap = hashMap2;
                                        AnonymousClass0QD.A05("IgLoggedInUsers", "contentProviderUri is: " + build3, e);
                                        hashMap = hashMap2;
                                        r8 = hashMap2;
                                        A004.release();
                                        if (r8 != 0) {
                                        }
                                        hashMap2 = null;
                                        z4 = true;
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor3 = null;
                                        A004.release();
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (hashMap2 != null && hashMap2.containsKey(str3)) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                    }
                    z4 = false;
                }
            }
            r0.A00(false);
            return;
        }
        if (!C06080Nr.A09(this.A00)) {
            r0.A00(true);
        } else if (C1427168l.A00(this.A00)) {
            Context context2 = this.A00;
            String[] strArr = A02;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                }
                String str4 = strArr[i];
                Boolean bool = null;
                if (C06080Nr.A0B(context2.getPackageManager(), str4) && (A003 = AnonymousClass0NH.A00(context2, build2)) != null) {
                    try {
                        cursor2 = A003.query((build2 = new Uri.Builder().scheme("content").authority(AnonymousClass000.A0E(str4, ".contentprovider.direct_should_display_notification")).appendQueryParameter(MemoryDumpUploadJob.EXTRA_USER_ID, str3).appendQueryParameter("thread_id", A005).build()), (String[]) null, (String) null, (String[]) null, (String) null);
                        if (cursor2 != null) {
                            try {
                                int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("should_display_notification");
                                if (cursor2.moveToNext() && !cursor2.isNull(columnIndexOrThrow2)) {
                                    boolean z6 = false;
                                    if (cursor2.getInt(columnIndexOrThrow2) != 0) {
                                        z6 = true;
                                    }
                                    bool = Boolean.valueOf(z6);
                                    A003.release();
                                    cursor2.close();
                                }
                            } catch (RemoteException unused) {
                                A003.release();
                            } catch (Throwable th4) {
                                th = th4;
                                A003.release();
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                        A003.release();
                    } catch (RemoteException unused2) {
                        cursor2 = null;
                        A003.release();
                    } catch (Throwable th5) {
                        th = th5;
                        cursor2 = null;
                        A003.release();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                if (Boolean.FALSE.equals(bool)) {
                    z2 = false;
                    break;
                }
                i++;
            }
            r0.A00(z2);
        } else {
            if (!z) {
                Context context3 = this.A00;
                Boolean bool2 = Boolean.FALSE;
                Boolean bool3 = null;
                if (C06080Nr.A0B(context3.getPackageManager(), "com.instagram.android") && (A002 = AnonymousClass0NH.A00(context3, build)) != null) {
                    try {
                        cursor = A002.query((build = new Uri.Builder().scheme("content").authority(AnonymousClass000.A0E("com.instagram.android", ".contentprovider.appbackgroundstate")).appendQueryParameter(MemoryDumpUploadJob.EXTRA_USER_ID, str3).build()), (String[]) null, (String) null, (String[]) null, (String) null);
                        if (cursor != null) {
                            try {
                                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("is_backgrounded");
                                if (cursor.moveToNext() && !cursor.isNull(columnIndexOrThrow3)) {
                                    boolean z7 = false;
                                    if (cursor.getInt(columnIndexOrThrow3) != 0) {
                                        z7 = true;
                                    }
                                    bool3 = Boolean.valueOf(z7);
                                    A002.release();
                                    cursor.close();
                                }
                            } catch (RemoteException unused3) {
                                A002.release();
                            } catch (Throwable th6) {
                                th = th6;
                                A002.release();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        A002.release();
                    } catch (RemoteException unused4) {
                        cursor = null;
                        A002.release();
                    } catch (Throwable th7) {
                        th = th7;
                        cursor = null;
                        A002.release();
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
            }
            z5 = false;
            r0.A00(z5);
        }
    }

    public C19130sy(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public final void BD8(C42861tN r2, String str, C06590Pq r4) {
        A00(C05210Iq.A03(r4), r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r4.equals("async_mqtt") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r4.equals("async_http") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r4.equals(com.facebook.react.bridge.BaseJavaModule.METHOD_TYPE_SYNC) == false) goto L_0x0040;
     */
    public final void BY0(C42861tN r13, AnonymousClass0C1 r14, String str) {
        char c;
        String A002 = AnonymousClass3LJ.A00(str);
        AnonymousClass0C1 r6 = r14;
        String A0J = AnonymousClass000.A0J(r14.A04(), "_", A002);
        this.A01.add(A0J);
        String str2 = (String) AnonymousClass0L6.A02(r14, AnonymousClass0L7.PUSH_RELIABILITY, "thread_fetch_mode", "async_http", (AnonymousClass04H) null);
        int hashCode = str2.hashCode();
        if (hashCode == -1387729813) {
            c = 1;
        } else if (hashCode == -1387583737) {
            c = 0;
        } else if (hashCode == 3545755) {
            c = 2;
        }
        c = 65535;
        if (c == 0) {
            RealtimeClientKeepAlive.getInstance(r14).doKeepAlive();
        } else if (c != 1) {
            C98084Lq r1 = new C98084Lq(r14, A002, (C95624By) null);
            C17850qu A012 = C62662oA.A01(r6, A002, (String) null, (Integer) null, (Long) null, (Integer) null);
            A012.A00 = r1;
            C12810hQ.A01(A012);
        } else {
            C95614Bx.A00(r14, A002, true, (C95624By) null);
        }
        this.A01.remove(A0J);
    }

    public final void BD9(C42861tN r1, String str, AnonymousClass0C1 r3) {
        A00(r3, r1);
    }
}
