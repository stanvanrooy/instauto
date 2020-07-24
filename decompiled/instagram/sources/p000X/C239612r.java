package p000X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.DexStore;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.12r  reason: invalid class name and case insensitive filesystem */
public final class C239612r extends C239712s {
    public Context A00;
    public boolean A01 = false;
    public final C240012v A02;
    public final C08860Za A03;
    public final AnonymousClass134 A04;
    public final Map A05;
    public final C09020Zs A06;
    public final boolean A07;

    public C239612r(Context context, C09020Zs r5, C08860Za r6, C240012v r7) {
        super(context);
        AnonymousClass134 r0;
        this.A00 = context;
        this.A05 = new HashMap();
        this.A06 = r5;
        synchronized (C08980Zm.class) {
            if (C08980Zm.A00 == null) {
                C08980Zm.A00 = C25334BEp.A00(context.getApplicationContext());
            }
            r0 = C08980Zm.A00;
        }
        this.A04 = r0;
        this.A03 = r6;
        this.A02 = r7;
        this.A07 = true;
    }

    private synchronized void A01(int i) {
        this.A05.remove(Integer.valueOf(i));
    }

    public final C2094390f A04(AnonymousClass917 r6) {
        synchronized (this) {
            if (!this.A01) {
                try {
                    this.A04.BZg(new BF2(this));
                    this.A01 = true;
                } catch (SecurityException e) {
                    AnonymousClass0DB.A0M("GooglePlayDownloader", e, "unable to register listener");
                }
            }
        }
        C2095390r r4 = new C2095390r();
        C25336BEr bEr = new C25336BEr((byte[]) null);
        for (String add : r6.A02) {
            bEr.A00.add(add);
        }
        C240012v r1 = this.A02;
        if (r1 != null) {
            r1.A02(r6.A00, r6);
        }
        A07(r6);
        this.A04.Bpn(new C25333BEo(bEr)).A01(new BFc(this, r6, r4));
        return r4.A00;
    }

    public final String A06() {
        return "GooglePlay";
    }

    public static String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0252, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0258, code lost:
        throw new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0344, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r0.A01.A00(r2);
        r1.A01(r17.A03());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:59:0x012f, B:67:0x0179] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x0348 */
    public static synchronized void A02(C239612r r16, C25325BEf bEf) {
        BFh bFh;
        List<Intent> A0A;
        C239612r r1 = r16;
        synchronized (r1) {
            if (!A03(bEf)) {
                Integer num = Constants.ZERO;
                Integer num2 = num;
                int A042 = bEf.A04();
                if (A042 == 2) {
                    num = Constants.A0Y;
                } else if (A042 != 3) {
                    if (A042 == 5) {
                        num = Constants.A0C;
                    } else if (A042 == 6 || A042 == 7) {
                        num = Constants.A0N;
                    }
                }
                if (num != num2) {
                    for (String str : bEf.A0B()) {
                        if (AnonymousClass0ZV.A00(str) < 0) {
                            AnonymousClass0DB.A0F("GooglePlayDownloader", AnonymousClass000.A0E("Unknown module name received from Google sessionState: ", str));
                        }
                        C08900Ze.A00().A04(str, num);
                    }
                }
                if (r1.A05.containsKey(Integer.valueOf(bEf.A03()))) {
                    bFh = (BFh) r1.A05.get(Integer.valueOf(bEf.A03()));
                } else {
                    AnonymousClass917 r4 = new AnonymousClass917(new HashSet(bEf.A0B()), (Integer) null, NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED);
                    bFh = new BFh(r4, new C2095390r());
                    r1.A05.put(Integer.valueOf(bEf.A03()), bFh);
                    C240012v r3 = r1.A02;
                    if (r3 != null) {
                        r3.A07(bFh.A02.A00, r4);
                    }
                }
                int A043 = bEf.A04();
                if (A043 == 2) {
                    C240012v r42 = r1.A02;
                    if (r42 != null && !bFh.A00) {
                        r42.A03(bFh.A02.A00);
                        bFh.A00 = true;
                    }
                } else if (A043 == 3) {
                    try {
                        String.format("Modules: %s downloaded", new Object[]{A00(bEf.A0B())});
                        if (bEf.A04() == 3) {
                            if (!A03(bEf)) {
                                List A0A2 = bEf.A0A();
                                if (A0A2 == null || A0A2.isEmpty()) {
                                    AnonymousClass0DB.A0L("GooglePlayDownloader", "There are no extracted intents for modules %s", A00(bEf.A0B()));
                                } else {
                                    Throwable e = null;
                                    ArrayList arrayList = new ArrayList();
                                    for (Intent intent : bEf.A0A()) {
                                        String stringExtra = intent.getStringExtra("module_name");
                                        C08960Zk.A00(r1.A00);
                                        String A022 = C08900Ze.A00().A02(stringExtra);
                                        if (A022 != null) {
                                            r1.A03.A03(stringExtra, A022);
                                            File file = new File(r1.A03.A02(stringExtra, A022), "download.zip");
                                            if (!file.exists() && !C09000Zp.A01(stringExtra, r1.A00)) {
                                                try {
                                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(r1.A00.getContentResolver().openFileDescriptor(intent.getData(), "r").getFileDescriptor()));
                                                    File file2 = new File(AnonymousClass000.A0E(file.getPath(), ".tmp"));
                                                    file.getCanonicalPath();
                                                    file2.getCanonicalPath();
                                                    byte[] bArr = new byte[DexStore.LOAD_RESULT_PGO];
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                    int i = 0;
                                                    while (true) {
                                                        int read = bufferedInputStream.read(bArr);
                                                        if (read <= 0) {
                                                            break;
                                                        }
                                                        i += read;
                                                        fileOutputStream.write(bArr, 0, read);
                                                    }
                                                    if (i != 0) {
                                                        file2.renameTo(file);
                                                        bufferedInputStream.close();
                                                    } else {
                                                        AnonymousClass0DB.A0F("VoltronFileUtils", "No bytes reads");
                                                        throw new IOException(AnonymousClass000.A0E("No bytes read of file ", file2.getName()));
                                                    }
                                                } catch (IOException | SecurityException e2) {
                                                    e = e2;
                                                } catch (Throwable ) {
                                                    throw th;
                                                }
                                            }
                                            arrayList.add(stringExtra);
                                            C08900Ze.A00().A04(stringExtra, Constants.A0C);
                                        } else {
                                            throw new IOException(AnonymousClass000.A0E("No hash found for ", stringExtra));
                                        }
                                    }
                                    if (e == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            String str2 = (String) it.next();
                                            if (!bEf.A0B().contains(str2)) {
                                                arrayList2.add(str2);
                                            }
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            AnonymousClass0DB.A0L("GooglePlayDownloader", "Extra module extracted from session: %s", A00(arrayList2));
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        for (String str3 : bEf.A0B()) {
                                            if (!arrayList.contains(str3)) {
                                                arrayList3.add(str3);
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            throw new FileNotFoundException(A00(arrayList3).concat(" were not found in downloaded session"));
                                        }
                                    } else {
                                        throw new IOException(e);
                                    }
                                }
                                if (Build.VERSION.SDK_INT < 21) {
                                    r1.A04.A27(Arrays.asList(new Integer[]{Integer.valueOf(bEf.A03())}));
                                }
                            }
                            bFh.A01.A01(1);
                            C240012v r7 = r1.A02;
                            if (r7 != null) {
                                r7.A0A(bFh.A02, 1, bEf.A02(), bEf.A05(), bEf.A06());
                            }
                        } else {
                            throw new IllegalStateException("Not in state downloaded");
                        }
                    } catch (IOException e3) {
                        AnonymousClass0DB.A0P("GooglePlayDownloader", e3, "Exception while downloading modules: %s", A00(bEf.A0B()));
                        bFh.A01.A00(e3);
                        C240012v r2 = r1.A02;
                        if (r2 != null) {
                            r2.A0A(bFh.A02, 2, -200, bEf.A05(), bEf.A06());
                        }
                    }
                } else if (A043 == 5) {
                    C240012v r43 = r1.A02;
                    if (r43 != null) {
                        r43.A05(bFh.A02.A00);
                    }
                    String.format("Modules installed: %s. There should be a new context!", new Object[]{A00(bEf.A0B())});
                    Context context = r1.A00;
                    Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                    C09020Zs r5 = r1.A06;
                    if (!r5.A00.getApplicationInfo().sourceDir.equals(createPackageContext.getApplicationInfo().sourceDir)) {
                        r5.A00 = createPackageContext;
                    }
                    B6P.A00(r1.A00);
                    try {
                        if (bEf.A04() == 5) {
                            if (Build.VERSION.SDK_INT > 19 && (A0A = bEf.A0A()) != null) {
                                for (Intent stringExtra2 : A0A) {
                                    String stringExtra3 = stringExtra2.getStringExtra("module_name");
                                    String A023 = C08900Ze.A00().A02(stringExtra3);
                                    if (A023 == null) {
                                        throw new IOException(AnonymousClass000.A0E("No hash found for ", stringExtra3));
                                    } else if (C09000Zp.A01(stringExtra3, r1.A00)) {
                                        new File(r1.A03.A02(stringExtra3, A023), "download.zip").delete();
                                    } else {
                                        AnonymousClass0DB.A0F("GooglePlayDownloader", "Attempted to delete download file, but split APK does not exist");
                                    }
                                }
                            }
                            bFh.A01.A01(1);
                            r1.A01(bEf.A03());
                            C240012v r22 = r1.A02;
                            if (r22 != null) {
                                r22.A0A(bFh.A02, 1, bEf.A02(), bEf.A05(), bEf.A06());
                            }
                        } else {
                            throw new IllegalStateException("Expected state to be INSTALLED");
                        }
                    } catch (IOException e4) {
                        AnonymousClass0DB.A0O("GooglePlayDownloader", e4, "Exception cleaning up module");
                    }
                } else if (A043 == 6 || A043 == 7) {
                    bFh.A01.A00(new C130235hi(bEf.toString()));
                    r1.A01(bEf.A03());
                    C240012v r23 = r1.A02;
                    if (r23 != null) {
                        r23.A0A(bFh.A02, 2, bEf.A02(), bEf.A05(), bEf.A06());
                    }
                } else if (A043 == 8) {
                    C240012v r44 = r1.A02;
                    if (r44 != null) {
                        r44.A04(bFh.A02.A00);
                    }
                    PendingIntent A072 = bEf.A07();
                    if (A072 == null) {
                        bFh.A01.A00(new Exception("resolution intent is null"));
                        r1.A01(bEf.A03());
                    } else if (!"com.android.vending".equals(A072.getTargetPackage())) {
                        bFh.A01.A00(new Exception(String.format("targetPackage was %s", new Object[]{A072.getTargetPackage()})));
                        r1.A01(bEf.A03());
                    } else if (bFh.A02.A01 != Constants.ZERO) {
                        r1.A04.A84(bEf.A03());
                    } else {
                        r1.A00.startIntentSender(A072.getIntentSender(), (Intent) null, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final C2094390f A05(AnonymousClass917 r4, C2095390r r5) {
        BFP ABa = this.A04.ABa(new ArrayList(r4.A02));
        ABa.A03(new BFf(this, r5));
        ABa.A02(new C25345BFg(this, r5));
        return r5.A00;
    }

    public final void A07(AnonymousClass917 r4) {
        if (this.A07) {
            BFP ABZ = this.A04.ABZ(new ArrayList(r4.A02));
            if (this.A02 != null) {
                ABZ.A01(new BFe(this, r4));
            }
        }
    }

    public static boolean A03(C25325BEf bEf) {
        if (bEf.A03() != -1 && bEf.A02() != -9) {
            return false;
        }
        AnonymousClass0DB.A0K("GooglePlayDownloader", "Error onStateUpdate state info: %s", bEf.toString());
        return true;
    }

    public final boolean A08(C2094390f r3) {
        int i;
        Exception A042 = r3.A04();
        if (A042 instanceof BFb) {
            i = ((BFb) A042).A00();
        } else {
            i = 0;
        }
        if (i == -5 || i == -2 || i == 0) {
            return false;
        }
        return true;
    }

    public final boolean A09(C2094390f r3) {
        int i;
        Exception A042 = r3.A04();
        if (A042 instanceof BFb) {
            i = ((BFb) A042).A00();
        } else {
            i = 0;
        }
        if (i == -100 || i == -9 || i == -5 || i == -2) {
            return true;
        }
        return false;
    }
}
