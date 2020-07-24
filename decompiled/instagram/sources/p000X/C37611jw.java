package p000X;

import android.content.Context;
import android.util.Pair;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1jw  reason: invalid class name and case insensitive filesystem */
public final class C37611jw {
    public static List A00(Context context, AnonymousClass0C1 r18, AnonymousClass0RN r19, int i, AnonymousClass1NG r21) {
        int intValue;
        ArrayList arrayList = new ArrayList();
        Context context2 = context;
        boolean A00 = C17440qF.A00(context2);
        AnonymousClass1NG r6 = r21;
        AnonymousClass1NK r3 = r6.A0G;
        Integer AZP = r3.AZP();
        AnonymousClass0C1 r10 = r18;
        AnonymousClass0RN r14 = r19;
        int i2 = i;
        switch (r6.A0H.ordinal()) {
            case 0:
            case 1:
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                AnonymousClass1NJ A05 = r6.A05();
                AnonymousClass0a4.A06(A05);
                A03(context2, r10, r14, A05, i2, arrayList);
                return arrayList;
            case 3:
            case 4:
            case 5:
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                List list = ((C43411uN) r3).A0F;
                if (list != null) {
                    int min = Math.min(list.size(), 2);
                    for (int i3 = 0; i3 < min; i3++) {
                        for (AnonymousClass1NJ r15 : ((C28487Chi) list.get(i3)).A09) {
                            arrayList.add(new C37461jh(new C37631jy(r15.getId(), C37621jx.A00(r15, context2, r14.getModuleName(), Constants.ZERO, false, false, false), (C37671k2) null), new C37651k0(new Pair(Integer.valueOf(i2), Integer.valueOf(i3)), AZP)));
                        }
                    }
                    break;
                }
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                if (((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.STORIES_IFU_LOADING_LATENCY, "should_prefetch_ifu_reels", false, (AnonymousClass04H) null)).booleanValue()) {
                    AnonymousClass0L7 r62 = AnonymousClass0L7.STORIES_IFU_LOADING_LATENCY;
                    C43161tv r9 = new C43161tv(r10, (C42721t8) r6.A0G, AZP, context2, r14, ((Integer) AnonymousClass0L6.A02(r10, r62, "json_prefetch_batch_size", 1, (AnonymousClass04H) null)).intValue(), ((Integer) AnonymousClass0L6.A02(r10, r62, "num_reels_to_prefetch", 10, (AnonymousClass04H) null)).intValue());
                    boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r10, r62, "should_prefetch_ifu_preview_images", false, (AnonymousClass04H) null)).booleanValue();
                    if (booleanValue) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Reel reel : r9.A05) {
                            Object obj = r9.A07.get(reel);
                            AnonymousClass0a4.A06(obj);
                            int intValue2 = ((Integer) obj).intValue();
                            AnonymousClass0C1 r5 = r9.A03;
                            C37461jh A002 = C46471zn.A00(reel, i2, intValue2, r5, r9.A04, r9.A02.getModuleName(), r9.A01);
                            if (A002 != null) {
                                arrayList2.add(A002);
                            }
                        }
                        arrayList.addAll(arrayList2);
                    }
                    for (int i4 = 0; i4 < r9.A06.size(); i4 += r9.A00) {
                        List list2 = r9.A06;
                        new C43201u0(new HashSet(AnonymousClass17A.A01(list2.subList(i4, Math.min(r9.A00 + i4, list2.size())), new C46481zo(r9))), new C43211u1(r9, booleanValue, i2), (Map) null, r9.A03, r9.A02.getModuleName()).A01();
                    }
                    break;
                }
                break;
            case 30:
                C49752Dl r7 = r6.A0I;
                if (!(r7 == null || (intValue = ((Integer) AnonymousClass0L6.A02(r10, AnonymousClass0L7.BLOKS_SUGGESTED_HASHTAG, "num_media_to_fetch", 0, (AnonymousClass04H) null)).intValue()) == 0)) {
                    ((AnonymousClass2DA) r7.A01.A00).Bri(new AnonymousClass2EO(intValue, new int[]{0}, A00, r14, arrayList, i2, AZP));
                    return arrayList;
                }
        }
        return arrayList;
    }

    public static List A01(Context context, AnonymousClass0C1 r23, AnonymousClass0RN r24, int i, List list) {
        List list2 = list;
        int size = list2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass1NJ r14 = (AnonymousClass1NJ) list2.get(i2);
            int i3 = i + i2;
            AnonymousClass0C1 r12 = r23;
            Context context2 = context;
            AnonymousClass0RN r13 = r24;
            if (((Boolean) AnonymousClass0L6.A02(r12, AnonymousClass0L7.AGGRESSIVE_CAROUSEL_PREFETCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                A03(context2, r12, r13, r14, i3, arrayList2);
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(new C37461jh(C37621jx.A02(r14, context2, r13.getModuleName(), Constants.ZERO, A04(r12, r14), false), new C37651k0(new Pair(Integer.valueOf(i3), 0), r14.AZP())));
            }
        }
        return arrayList;
    }

    public static void A03(Context context, AnonymousClass0C1 r15, AnonymousClass0RN r16, AnonymousClass1NJ r17, int i, List list) {
        AnonymousClass1NJ r5 = r17;
        if (r5.A1Q()) {
            List list2 = list;
            Context context2 = context;
            if (r5.A1W()) {
                for (int i2 = 0; i2 < r5.A07(); i2++) {
                    AnonymousClass1NJ A0P = r5.A0P(i2);
                    list2.add(new C37461jh(C37621jx.A02(A0P, context2, r16.getModuleName(), Constants.ZERO, A04(r15, A0P), false), new C37651k0(new Pair(Integer.valueOf(i), Integer.valueOf(i2 - r5.A0A())), r5.AZP())));
                }
                return;
            }
            AnonymousClass1NJ r9 = r5;
            list2.add(new C37461jh(C37621jx.A02(r9, context2, r16.getModuleName(), Constants.ZERO, A04(r15, r5), false), new C37651k0(new Pair(Integer.valueOf(i), 0), r5.AZP())));
        }
    }

    public static void A02(Context context, AnonymousClass0C1 r3, AnonymousClass1PG r4, AnonymousClass0RN r5, int i, List list, boolean z) {
        int itemCount = r4.getItemCount();
        List A01 = A01(context, r3, r5, i, list);
        if (z || itemCount == 0) {
            AnonymousClass1F6.A00(r3).A0C(A01, r5.getModuleName());
        } else {
            AnonymousClass1F6.A00(r3).A0B(A01, r5.getModuleName());
        }
    }

    public static boolean A04(AnonymousClass0C1 r4, AnonymousClass1NJ r5) {
        if (!r5.A1a() || !((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.PREFETCH_IGTV_FIRST_FRAME, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }
}
