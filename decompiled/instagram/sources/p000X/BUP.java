package p000X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.gallery.Medium;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BUP */
public final class BUP extends AnonymousClass0O9 {
    public final /* synthetic */ BUO A00;
    public final /* synthetic */ BUJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BUP(BUJ buj, BUO buo) {
        super(432, 4, false, false);
        this.A01 = buj;
        this.A00 = buo;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:138|144|145|146|147|(12:149|(1:151)|152|(1:154)|155|(1:157)|158|(1:160)|161|(1:163)(2:165|(1:167)(1:168))|164|169)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05f5, code lost:
        p000X.BUO.A02(r0, p000X.BUN.COMPLETED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a4, code lost:
        if (r2 != null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x02fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01a9 */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0300 A[Catch:{ InterruptedException -> 0x05ee, Exception -> 0x05e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05f5 A[EDGE_INSN: B:265:0x05f5->B:258:0x05f5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae A[Catch:{ Exception -> 0x05fe }] */
    public final void run() {
        int i;
        List<BUT> arrayList;
        boolean z;
        int i2;
        int i3;
        String str;
        String str2;
        boolean z2;
        Integer num;
        Integer num2;
        boolean z3;
        Integer num3;
        BUO buo = this.A00;
        buo.A08 = UUID.randomUUID().toString();
        buo.A03 = System.currentTimeMillis();
        C06270Ok A002 = C06270Ok.A00();
        A002.A05("faces_scanner_enabled", Boolean.valueOf(buo.A0H));
        A002.A05("location_scanner_enabled", Boolean.valueOf(buo.A0I));
        BUO.A03(buo, "ig_feed_gallery_media_scanner_started", A002);
        if (BUO.A04(buo)) {
            BUO.A01(buo);
            return;
        }
        try {
            File file = new File(buo.A0B.getFilesDir().getParent(), "/shared_prefs/media_scanner_prefs.xml");
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            AnonymousClass0DB.A0G("MediaScanner", "error deleting legacy prefs file", e);
        }
        Cursor query = buo.A0B.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"count(*) as count"}, AnonymousClass3XZ.A01, (String[]) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                i = query.getInt(0);
                query.close();
                buo.A02 = i;
                buo.A00 = 0;
                buo.A06 = new C25665BUb(buo.A0B);
                int i4 = 0;
                while (true) {
                    if (buo.A00 < buo.A02) {
                        if (BUO.A04(buo)) {
                            break;
                        }
                        List<Medium> A003 = AnonymousClass3XZ.A00(buo.A0B.getContentResolver(), buo.A0A, i4, true, AnonymousClass3X8.PHOTO_AND_VIDEO, 0, -1, -1, C84833mN.A00(), false);
                        i4 += A003.size();
                        if (A003.isEmpty()) {
                            break;
                        }
                        for (int i5 = 0; i5 < A003.size(); i5++) {
                            C196158aL.A00(buo.A0B, (Medium) A003.get(i5));
                        }
                        if (BUO.A04(buo)) {
                            break;
                        }
                        BUQ buq = new BUQ(buo.A06.A00.Aap());
                        ArrayList arrayList2 = new ArrayList();
                        for (Medium AOA : A003) {
                            arrayList2.add(AOA.AOA());
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList = Collections.emptyList();
                        } else {
                            arrayList = new ArrayList<>();
                            try {
                                AnonymousClass16T r5 = buq.A00;
                                StringBuilder sb = new StringBuilder("id IN (");
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    sb.append("?");
                                    if (i6 < arrayList2.size() - 1) {
                                        sb.append(",");
                                    }
                                }
                                sb.append(")");
                                C248316e A004 = BUQ.A00();
                                String sb2 = sb.toString();
                                Object[] array = arrayList2.toArray();
                                A004.A01 = sb2;
                                A004.A02 = array;
                                Cursor BYk = r5.BYk(A004.A01());
                                while (BYk.moveToNext()) {
                                    arrayList.add(BUQ.A01(BYk));
                                }
                                BYk.close();
                            } catch (RuntimeException e2) {
                                AnonymousClass0QD.A09("GalleryMediaMetadataDatabaseAccessHelper#fetchAll", e2);
                            } catch (Throwable ) {
                                throw th;
                            }
                        }
                        HashMap hashMap = new HashMap();
                        for (BUT but : arrayList) {
                            hashMap.put(but.A0G, but);
                        }
                        for (Medium medium : A003) {
                            if (!hashMap.containsKey(medium.AOA())) {
                                BUT but2 = new BUT();
                                String AOA2 = medium.AOA();
                                but2.A0G = AOA2;
                                hashMap.put(AOA2, but2);
                            }
                        }
                        for (int i7 = 0; i7 < A003.size() && !BUO.A04(buo); i7++) {
                            Medium medium2 = (Medium) A003.get(i7);
                            BUT but3 = (BUT) hashMap.get(medium2.AOA());
                            Iterator it = buo.A0G.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                }
                                BUi bUi = (BUi) it.next();
                                String name = bUi.getName();
                                int version = bUi.getVersion();
                                C25676BUq bUq = but3.A00;
                                if (bUq == null) {
                                    z3 = false;
                                    continue;
                                } else {
                                    HashMap hashMap2 = bUq.A00;
                                    z3 = false;
                                    if (!(hashMap2 == null || (num3 = (Integer) hashMap2.get(name)) == null || num3.intValue() < version)) {
                                        z3 = true;
                                        continue;
                                    }
                                }
                                if (!z3) {
                                    z = false;
                                    break;
                                }
                            }
                            if (z) {
                                buo.A00++;
                            } else {
                                try {
                                    Iterator it2 = buo.A0G.iterator();
                                    boolean z4 = false;
                                    while (it2.hasNext()) {
                                        BUi bUi2 = (BUi) it2.next();
                                        String name2 = bUi2.getName();
                                        int version2 = bUi2.getVersion();
                                        String str3 = name2;
                                        int i8 = version2;
                                        C25676BUq bUq2 = but3.A00;
                                        if (bUq2 == null) {
                                            z2 = false;
                                        } else {
                                            HashMap hashMap3 = bUq2.A00;
                                            z2 = false;
                                            if (!(hashMap3 == null || (num2 = (Integer) hashMap3.get(str3)) == null || num2.intValue() < i8)) {
                                                z2 = true;
                                            }
                                        }
                                        if (!z2) {
                                            boolean Ape = bUi2.Ape();
                                            if (Ape && !z4) {
                                                Context context = buo.A0B;
                                                BitmapFactory.Options options = buo.A0C;
                                                String str4 = medium2.A0S;
                                                String str5 = str4;
                                                if (str4 == null || str5.equals(medium2.A0P)) {
                                                    if (medium2.AiO()) {
                                                        MediaStore.Video.Thumbnails.getThumbnail(context.getContentResolver(), (long) medium2.A05, 1, options);
                                                    } else {
                                                        MediaStore.Images.Thumbnails.getThumbnail(context.getContentResolver(), (long) medium2.A05, 1, options);
                                                    }
                                                    C196158aL.A00(context, medium2);
                                                }
                                                String str6 = medium2.A0S;
                                                if (str6 != null) {
                                                    Rect A0D = C72663Gk.A0D(str6);
                                                    int width = A0D.width();
                                                    int height = A0D.height();
                                                    medium2.A09 = width;
                                                    medium2.A04 = height;
                                                    int A005 = C181767pS.A00(medium2, 320, 320);
                                                    String uri = Uri.fromFile(new File(medium2.A0S)).toString();
                                                    AnonymousClass2i0 r14 = new AnonymousClass2i0();
                                                    AnonymousClass1GH A0E = AnonymousClass12C.A0c.A0E(uri, buo.getModuleName());
                                                    A0E.A02(r14);
                                                    A0E.A01 = A005;
                                                    A0E.A01();
                                                    r14.A01.await(10, TimeUnit.SECONDS);
                                                    Bitmap bitmap = r14.A00;
                                                    if (bitmap != null) {
                                                        boolean z5 = false;
                                                        if (medium2.AUk() % 180 != 0) {
                                                            z5 = true;
                                                        }
                                                        if (buo.A04 == null) {
                                                            buo.A04 = Bitmap.createBitmap(320, 320, Bitmap.Config.RGB_565);
                                                        }
                                                        if (buo.A05 == null) {
                                                            buo.A05 = new Canvas(buo.A04);
                                                        }
                                                        buo.A05.drawColor(-1);
                                                        buo.A05.save();
                                                        if (z5) {
                                                            Canvas canvas = buo.A05;
                                                            canvas.rotate((float) medium2.AUk(), ((float) canvas.getWidth()) / 2.0f, ((float) buo.A05.getHeight()) / 2.0f);
                                                        }
                                                        float width2 = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
                                                        if (width2 > 1.0f) {
                                                            float height2 = (((float) buo.A05.getHeight()) - (((float) buo.A05.getWidth()) / width2)) / 2.0f;
                                                            buo.A0F.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, height2, (float) buo.A05.getWidth(), ((float) buo.A05.getHeight()) - height2);
                                                        } else if (width2 < 1.0f) {
                                                            float width3 = (((float) buo.A05.getWidth()) - (((float) buo.A05.getHeight()) * width2)) / 2.0f;
                                                            buo.A0F.set(width3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((float) buo.A05.getWidth()) - width3, (float) buo.A05.getHeight());
                                                        } else {
                                                            buo.A0F.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) buo.A05.getWidth(), (float) buo.A05.getHeight());
                                                        }
                                                        buo.A0E.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                                        buo.A05.drawBitmap(bitmap, buo.A0E, buo.A0F, buo.A0D);
                                                        buo.A05.restore();
                                                        z4 = true;
                                                    }
                                                }
                                                z4 = false;
                                            }
                                            if ((z4 || !Ape) && bUi2.Bec(medium2, but3, buo.A04)) {
                                                if (but3.A00 == null) {
                                                    but3.A00 = new C25676BUq();
                                                }
                                                C25676BUq bUq3 = but3.A00;
                                                if (bUq3.A00 == null) {
                                                    bUq3.A00 = new HashMap();
                                                }
                                                HashMap hashMap4 = bUq3.A00;
                                                boolean z6 = false;
                                                if (!(hashMap4 == null || (num = (Integer) hashMap4.get(name2)) == null || num.intValue() < version2)) {
                                                    z6 = true;
                                                }
                                                if (!z6) {
                                                    bUq3.A00.put(name2, Integer.valueOf(version2));
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        buq.A00.A6P();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("id", but3.A0G);
                                        C25676BUq bUq4 = but3.A00;
                                        if (bUq4 != null) {
                                            try {
                                                StringWriter stringWriter = new StringWriter();
                                                C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                                                A05.A0T();
                                                if (bUq4.A00 != null) {
                                                    A05.A0d("completed_versions");
                                                    A05.A0T();
                                                    for (Map.Entry entry : bUq4.A00.entrySet()) {
                                                        A05.A0d((String) entry.getKey());
                                                        if (entry.getValue() == null) {
                                                            A05.A0R();
                                                        } else {
                                                            A05.A0X(((Integer) entry.getValue()).intValue());
                                                        }
                                                    }
                                                    A05.A0Q();
                                                }
                                                A05.A0Q();
                                                A05.close();
                                                str2 = stringWriter.toString();
                                            } catch (IOException e3) {
                                                AnonymousClass0DB.A0G("GalleryMediaMetadata", "failed to serialize completed scanner versions", e3);
                                                str2 = null;
                                            }
                                            contentValues.put("scanner_versions", str2);
                                        }
                                        contentValues.put(IgStaticMapViewManager.LATITUDE_KEY, but3.A02);
                                        contentValues.put(IgStaticMapViewManager.LONGITUDE_KEY, but3.A03);
                                        contentValues.put("feature_name", but3.A0F);
                                        contentValues.put("locality", but3.A0H);
                                        contentValues.put("sub_admin_area", but3.A0I);
                                        contentValues.put("country_name", but3.A0E);
                                        C25672BUm bUm = but3.A01;
                                        if (bUm == null) {
                                            i2 = 0;
                                        } else {
                                            i2 = bUm.A00.size();
                                        }
                                        if (i2 > 0) {
                                            try {
                                                C25672BUm bUm2 = but3.A01;
                                                StringWriter stringWriter2 = new StringWriter();
                                                C13460iZ A052 = C12890hY.A00.A05(stringWriter2);
                                                A052.A0T();
                                                if (bUm2.A00 != null) {
                                                    A052.A0d("faces");
                                                    A052.A0S();
                                                    for (C25671BUl bUl : bUm2.A00) {
                                                        if (bUl != null) {
                                                            A052.A0T();
                                                            A052.A0E("x", bUl.A01);
                                                            A052.A0E("y", bUl.A02);
                                                            A052.A0E("confidence", bUl.A00);
                                                            A052.A0Q();
                                                        }
                                                    }
                                                    A052.A0P();
                                                }
                                                A052.A0Q();
                                                A052.close();
                                                str = stringWriter2.toString();
                                            } catch (IOException e4) {
                                                AnonymousClass0DB.A0G("GalleryMediaMetadata", "failed to serialize faces", e4);
                                                str = null;
                                            }
                                            contentValues.put("faces_json", str);
                                        }
                                        C25672BUm bUm3 = but3.A01;
                                        if (bUm3 == null) {
                                            i3 = 0;
                                        } else {
                                            i3 = bUm3.A00.size();
                                        }
                                        contentValues.put("face_count", Integer.valueOf(i3));
                                        contentValues.put("ocn_score", but3.A08);
                                        contentValues.put("ocv_score", but3.A0C);
                                        contentValues.put("person_score", but3.A09);
                                        contentValues.put("smiling_score", but3.A0A);
                                        contentValues.put("food_score", but3.A05);
                                        contentValues.put("nature_score", but3.A07);
                                        contentValues.put("landmark_score", but3.A06);
                                        contentValues.put("top_concept", but3.A0D);
                                        contentValues.put("top_concept_score", but3.A0B);
                                        contentValues.put("aesthetic_score", but3.A04);
                                        buq.A00.Adh("gallery_media_metadata", 5, contentValues);
                                        buq.A00.BlP();
                                    } catch (RuntimeException e5) {
                                        AnonymousClass0QD.A09("GalleryMediaMetadataDatabaseAccessHelper#save", e5);
                                    } catch (Throwable th) {
                                        buq.A00.ADF();
                                        throw th;
                                    }
                                    buq.A00.ADF();
                                    int i9 = buo.A09;
                                    if (i9 > 0) {
                                        Thread.sleep((long) i9);
                                    }
                                    buo.A01++;
                                    buo.A00++;
                                } catch (InterruptedException unused) {
                                    BUO.A02(buo, BUN.STOPPED);
                                } catch (Exception e6) {
                                    AnonymousClass0QD.A0A("MediaScannerWorker#scanMedia", e6);
                                    BUO.A02(buo, BUN.EXCEPTION);
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                BUO.A01(buo);
            }
        }
        if (query != null) {
            query.close();
        }
        i = 0;
        buo.A02 = i;
        buo.A00 = 0;
        try {
            buo.A06 = new C25665BUb(buo.A0B);
            int i42 = 0;
            while (true) {
                if (buo.A00 < buo.A02) {
                }
            }
            BUO.A01(buo);
        } catch (Exception e7) {
            AnonymousClass0QD.A0A("MediaScannerException", e7);
            BUO.A02(buo, BUN.EXCEPTION);
            BUO.A01(buo);
        }
    }
}
