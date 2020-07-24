package p000X;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductCheckoutProperties;
import com.instagram.model.shopping.ProductLaunchInformation;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1jB  reason: invalid class name and case insensitive filesystem */
public final class C37141jB implements C37151jC {
    public double A00 = -1.0d;
    public double A01 = -1.0d;
    public double A02 = -1.0d;
    public double A03 = -1.0d;
    public double A04 = -1.0d;
    public double A05 = -1.0d;
    public double A06 = -1.0d;
    public double A07 = -1.0d;
    public double A08 = -1.0d;
    public double A09 = -1.0d;
    public double A0A = -1.0d;
    public double A0B = -1.0d;
    public double A0C = -1.0d;
    public double A0D = -1.0d;
    public double A0E = -1.0d;
    public float A0F = -1.0f;
    public float A0G = -1.0f;
    public float A0H = -1.0f;
    public float A0I = -1.0f;
    public float A0J = -1.0f;
    public float A0K = -1.0f;
    public float A0L = -1.0f;
    public float A0M = -1.0f;
    public float A0N = -1.0f;
    public float A0O = -1.0f;
    public float A0P = -1.0f;
    public float A0Q = -1.0f;
    public float A0R = -1.0f;
    public float A0S = -1.0f;
    public float A0T = -1.0f;
    public float A0U = -1.0f;
    public int A0V = -1;
    public int A0W = -1;
    public int A0X = -1;
    public int A0Y = -1;
    public int A0Z = -1;
    public int A0a = -1;
    public int A0b = -1;
    public int A0c = -1;
    public int A0d = -1;
    public int A0e = -1;
    public int A0f = -1;
    public int A0g = -1;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = -1;
    public int A0o = -1;
    public int A0p = -1;
    public int A0q = -1;
    public int A0r = -1;
    public int A0s = -1;
    public int A0t = -1;
    public int A0u = -1;
    public int A0v = -1;
    public int A0w = -1;
    public int A0x = -1;
    public int A0y;
    public int A0z;
    public int A10;
    public int A11;
    public int A12 = -1;
    public int A13 = -1;
    public int A14 = -1;
    public int A15 = -1;
    public int A16 = -1;
    public int A17 = -1;
    public int A18 = -1;
    public int A19 = -1;
    public int A1A = -1;
    public int A1B = -1;
    public int A1C = -1;
    public int A1D = -1;
    public int A1E = -1;
    public int A1F = -1;
    public int A1G = -1;
    public int A1H = -1;
    public int A1I = -1;
    public int A1J = -1;
    public int A1K = -1;
    public int A1L = -1;
    public int A1M = -1;
    public int A1N = -1;
    public int A1O = -1;
    public int A1P = -1;
    public int A1Q = -1;
    public int A1R = -1;
    public int A1S = -1;
    public int A1T = -1;
    public int A1U = -1;
    public int A1V = -1;
    public int A1W = -1;
    public int A1X = -1;
    public int A1Y = -1;
    public int A1Z = -1;
    public int A1a = -1;
    public int A1b = -1;
    public int A1c = -1;
    public int A1d = -1;
    public int A1e = -1;
    public int A1f = -1;
    public int A1g = -1;
    public int A1h = -1;
    public int A1i = -1;
    public int A1j = -1;
    public int A1k = -1;
    public int A1l = -1;
    public int A1m = -1;
    public long A1n = -1;
    public long A1o = -1;
    public long A1p = -1;
    public long A1q = -1;
    public long A1r = -1;
    public long A1s = -1;
    public long A1t = -1;
    public long A1u = -1;
    public long A1v = -1;
    public long A1w = -1;
    public C06270Ok A1x;
    public C06270Ok A1y;
    public C06170Oa A1z;
    public C39531n4 A20;
    public C249916w A21;
    public AnonymousClass230 A22;
    public ProductSource A23;
    public ProductCollectionLink A24;
    public ProfileShopLink A25;
    public ReelProductLink A26;
    public SavedCollection A27;
    public C51862Mk A28;
    public Boolean A29;
    public Boolean A2A = null;
    public Boolean A2B;
    public Boolean A2C;
    public Boolean A2D;
    public Boolean A2E;
    public Boolean A2F;
    public Boolean A2G;
    public Boolean A2H;
    public Boolean A2I;
    public Boolean A2J;
    public Boolean A2K;
    public Boolean A2L;
    public Boolean A2M;
    public Boolean A2N;
    public Boolean A2O;
    public Boolean A2P;
    public Boolean A2Q;
    public Boolean A2R;
    public Boolean A2S;
    public Boolean A2T;
    public Boolean A2U;
    public Boolean A2V;
    public Boolean A2W;
    public Boolean A2X;
    public Boolean A2Y;
    public Boolean A2Z;
    public Boolean A2a;
    public Boolean A2b;
    public Boolean A2c;
    public Boolean A2d;
    public Boolean A2e = null;
    public Boolean A2f;
    public Boolean A2g;
    public Boolean A2h;
    public Boolean A2i;
    public Boolean A2j;
    public Boolean A2k;
    public Boolean A2l;
    public Boolean A2m;
    public Boolean A2n;
    public Boolean A2o;
    public Boolean A2p;
    public Integer A2q;
    public Integer A2r;
    public Integer A2s;
    public Integer A2t;
    public Integer A2u;
    public Long A2v;
    public String A2w;
    public String A2x;
    public String A2y;
    public String A2z;
    public String A30;
    public String A31;
    public String A32;
    public String A33;
    public String A34;
    public String A35;
    public String A36;
    public String A37;
    public String A38;
    public String A39;
    public String A3A;
    public String A3B;
    public String A3C;
    public String A3D;
    public String A3E;
    public String A3F;
    public String A3G;
    public String A3H;
    public String A3I;
    public String A3J;
    public String A3K;
    public String A3L;
    public String A3M;
    public String A3N;
    public String A3O;
    public String A3P;
    public String A3Q;
    public String A3R;
    public String A3S;
    public String A3T;
    public String A3U;
    public String A3V;
    public String A3W;
    public String A3X;
    public String A3Y;
    public String A3Z;
    public String A3a;
    public String A3b;
    public String A3c;
    public String A3d;
    public String A3e;
    public String A3f;
    public String A3g;
    public String A3h;
    public String A3i;
    public String A3j;
    public String A3k;
    public String A3l;
    public String A3m;
    public String A3n;
    public String A3o;
    public String A3p;
    public String A3q;
    public String A3r;
    public String A3s;
    public String A3t;
    public String A3u;
    public String A3v;
    public String A3w;
    public String A3x;
    public String A3y;
    public String A3z;
    public String A40;
    public String A41;
    public String A42;
    public String A43;
    public String A44;
    public String A45;
    public String A46;
    public String A47;
    public String A48;
    public String A49;
    public String A4A;
    public String A4B;
    public String A4C;
    public String A4D;
    public String A4E;
    public String A4F;
    public String A4G;
    public String A4H;
    public String A4I;
    public String A4J;
    public String A4K;
    public String A4L;
    public String A4M;
    public String A4N;
    public String A4O;
    public String A4P;
    public String A4Q;
    public String A4R;
    public String A4S;
    public String A4T;
    public String A4U;
    public String A4V;
    public String A4W;
    public String A4X;
    public String A4Y;
    public String A4Z;
    public String A4a;
    public String A4b;
    public String A4c;
    public String A4d;
    public String A4e;
    public String A4f;
    public String A4g;
    public String A4h;
    public String A4i;
    public String A4j;
    public String A4k;
    public String A4l;
    public String A4m;
    public String A4n;
    public String A4o;
    public String A4p;
    public String A4q;
    public String A4r;
    public String A4s;
    public String A4t;
    public String A4u;
    public String A4v;
    public String A4w;
    public String A4x;
    public String A4y;
    public String A4z;
    public String A50;
    public String A51;
    public String A52;
    public String A53;
    public String A54;
    public String A55;
    public String A56;
    public String A57;
    public String A58;
    public String A59;
    public String A5A;
    public ArrayList A5B;
    public ArrayList A5C;
    public List A5D;
    public List A5E;
    public List A5F;
    public List A5G;
    public List A5H;
    public List A5I;
    public List A5J;
    public List A5K;
    public List A5L;
    public List A5M;
    public List A5N;
    public Map A5O;
    public Map A5P;
    public Map A5Q;
    public Map A5R;
    public Map A5S;
    public Map A5T;
    public Map A5U;
    public boolean A5V;
    public double A5W = -1.0d;
    public double A5X = -1.0d;
    public int A5Y = -1;
    public int A5Z = -1;
    public int A5a = -1;
    public int A5b = -1;
    public int A5c = -1;
    public int A5d = -1;
    public int A5e = -1;
    public int A5f = -1;
    public int A5g = -1;
    public int A5h = -1;
    public int A5i = -1;
    public int A5j = -1;
    public int A5k = -1;
    public int A5l = -1;
    public int A5m = -1;
    public int A5n = -1;
    public int A5o = -1;
    public int A5p = -1;
    public int A5q = -1;
    public int A5r = -1;
    public int A5s = -1;
    public int A5t = -1;
    public int A5u = -1;
    public int A5v = -1;
    public long A5w = -1;
    public long A5x = -1;
    public long A5y = -1;
    public long A5z = -1;
    public long A60 = -1;
    public long A61 = -1;
    public long A62 = -1;
    public long A63 = -1;
    public long A64 = -1;
    public C06170Oa A65;
    public Hashtag A66;
    public Product A67;
    public Product A68;
    public Boolean A69;
    public Boolean A6A;
    public Integer A6B;
    public Long A6C;
    public String A6D;
    public String A6E;
    public String A6F;
    public String A6G;
    public String A6H;
    public ArrayList A6I;
    public List A6J;
    public List A6K;
    public List A6L;
    public List A6M;
    public Map A6N;
    public String[] A6O;
    public final C37121j9 A6P;
    public final C27371Ho A6Q;
    public final String A6R;

    public final void A04() {
        this.A6A = true;
    }

    public static List A02(AnonymousClass1NJ r5) {
        List<C34151eA> A182 = r5.A18(C34181eD.PRODUCT);
        if (A182 == null || A182.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C34151eA r3 : A182) {
            HashMap hashMap = new HashMap();
            hashMap.put("sticker_type", C34181eD.PRODUCT.A00);
            hashMap.put("sticker_id", r3.A07());
            hashMap.put("product_id", r3.A03().getId());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final void A05(float f, float f2, float f3) {
        if (this.A1y == null) {
            this.A1y = C06270Ok.A00();
        }
        this.A1y.A06("screen_width", Float.valueOf(f));
        this.A1y.A06("screen_height", Float.valueOf(f2));
        this.A1y.A06("screen_density", Float.valueOf(f3));
    }

    public final void A07(C06270Ok r3) {
        if (r3 != null) {
            C06270Ok r1 = this.A1x;
            if (r1 != null) {
                r1.A0C(AnonymousClass0RA.A04(r3));
            } else {
                this.A1x = r3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004b, code lost:
        if (r0 != false) goto L_0x004d;
     */
    public final void A09(C38031kc r4) {
        MediaType mediaType;
        this.A2x = r4.A0C.getId();
        this.A3v = r4.A0P;
        this.A6C = Long.valueOf(r4.A05);
        if (r4.A08.A03()) {
            mediaType = MediaType.LIVE_REPLAY;
        } else {
            mediaType = MediaType.LIVE;
        }
        this.A1A = mediaType.A00;
        this.A4g = this.A6Q.getModuleName();
        this.A3V = C13300iJ.A02(r4.A0C.A0M);
        boolean A032 = r4.A08.A03();
        boolean z = true;
        this.A2a = Boolean.valueOf(!A032);
        if (!A032) {
            boolean z2 = false;
            if (r4.A0F != null) {
                z2 = true;
            }
        }
        z = false;
        this.A2Z = Boolean.valueOf(z);
        if (!r4.A04().isEmpty()) {
            this.A3G = ((C13300iJ) r4.A04().iterator().next()).getId();
        }
    }

    public final void A0A(AnonymousClass30F r3) {
        this.A5j = r3.A01;
        this.A5k = r3.A02;
        this.A5h = r3.A01;
        this.A5i = r3.A02;
        this.A5c = r3.A03;
        this.A5g = r3.A00;
        this.A5l = r3.A04;
        this.A5X = r3.A00;
    }

    public final void A0C(AnonymousClass0C1 r2, Product product, AnonymousClass1NJ r4) {
        A0D(r2, product, product.A02.A02, r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 != false) goto L_0x000d;
     */
    public final void A0F(String str) {
        boolean z;
        this.A6G = str;
        String str2 = this.A6F;
        if (str2 != null) {
            boolean equals = str.equals(str2);
            z = true;
        }
        z = false;
        this.A2X = Boolean.valueOf(z);
    }

    public final void A0G(List list) {
        if (list != null && !list.isEmpty()) {
            this.A6J = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A6J.add(((AnonymousClass29e) it.next()).A00);
            }
        }
    }

    public final void A0H(List list) {
        if (list != null && !list.isEmpty()) {
            this.A6M = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A6M.add(((Double) it.next()).toString());
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object BkK(float f, float f2, float f3, float f4, float f5) {
        this.A0Q = f;
        this.A0P = f2;
        this.A0O = f5;
        this.A0N = f3;
        this.A0M = f4;
        return this;
    }

    public C37141jB(String str, C27371Ho r9, C37121j9 r10) {
        this.A6R = str;
        this.A6Q = r9;
        this.A6P = r10;
    }

    public static int A00(Map map) {
        int i = 0;
        if (!map.isEmpty()) {
            for (Map.Entry value : map.entrySet()) {
                i += ((Integer) value.getValue()).intValue();
            }
        }
        return i;
    }

    public static C06270Ok A01(Map map) {
        C06270Ok A002 = C06270Ok.A00();
        for (Map.Entry entry : map.entrySet()) {
            A002.A07((String) entry.getKey(), (Integer) entry.getValue());
        }
        return A002;
    }

    public final void A06(Activity activity, C06590Pq r4) {
        int i;
        AnonymousClass1dL r0 = (AnonymousClass1dL) C26441Dh.A00(r4).A07.get(activity.toString());
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        this.A5n = i;
        this.A65 = C26441Dh.A01(C26441Dh.A00(r4), activity.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
    public final void A0B(AnonymousClass0C1 r7, AnonymousClass1NJ r8) {
        String str;
        HashMap hashMap;
        Product product;
        Product product2;
        instagramComment r0;
        List list;
        ArrayList A0z2;
        ReelProductLink A0a2;
        C37171jE A0U2;
        C27371Ho r2;
        Hashtag hashtag;
        String str2;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        this.A3v = r8.getId();
        this.A2y = C30671Ut.A02(r7, r8);
        this.A33 = r8.A0c(r7).getId();
        this.A6C = r8.A0k();
        this.A1A = r8.APx().A00;
        this.A4g = this.A6Q.getModuleName();
        this.A3V = C13300iJ.A02(r8.A0c(r7).A0M);
        int i = 0;
        if (this.A2w == null) {
            if (r8.A1W()) {
                str5 = r8.A0P(0).A1e;
            } else {
                str5 = r8.A1e;
            }
            this.A2w = str5;
        }
        if (C36901in.A0O(r8, this.A6Q)) {
            str = C30671Ut.A0A(r7, r8);
        } else {
            str = r8.A29;
        }
        this.A50 = str;
        this.A5B = r8.A10();
        ArrayList<Product> A0x2 = r8.A0x();
        this.A5C = A0x2;
        if (A0x2 == null || A0x2.isEmpty()) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (Product product3 : A0x2) {
                String id = product3.getId();
                String str6 = product3.A02.A02;
                List list2 = (List) hashMap.get(str6);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(str6, list2);
                }
                list2.add(id);
            }
        }
        this.A6N = hashMap;
        String str7 = null;
        if (r8.A1P()) {
            this.A2X = Boolean.valueOf(r8.A1j(r7));
            if (this.A5C.isEmpty()) {
                str4 = null;
            } else {
                str4 = ((Product) this.A5C.get(0)).A02.A02;
            }
            this.A6G = str4;
            this.A6F = r8.A0c(r7).getId();
            if (r8.A3U) {
                this.A6L = A02(r8);
            }
        }
        Product A0X2 = r8.A0X();
        this.A68 = A0X2;
        if (A0X2 != null) {
            this.A6G = A0X2.A02.A02;
        }
        List A182 = r8.A18(C34181eD.PRODUCT);
        if (A182 != null) {
            Iterator it = A182.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C34151eA r3 = (C34151eA) it.next();
                if ("product_item_drops_reshare_sticker".equals(r3.A07())) {
                    product = r3.A03();
                    product2 = product;
                    break;
                }
            }
            this.A67 = product2;
            if (product != null) {
                this.A6G = product2.A02.A02;
            }
            r0 = r8.A0K;
            if (r0 == null) {
                list = r0.A04();
            } else {
                list = null;
            }
            this.A6K = list;
            A0z2 = r8.A0z();
            this.A6I = A0z2;
            if (!AnonymousClass0OX.A00(A0z2)) {
                this.A6G = ((Product) this.A6I.get(0)).A02.A02;
            }
            this.A25 = r8.A0Z();
            this.A24 = r8.A0Y();
            A0a2 = r8.A0a();
            this.A26 = A0a2;
            if (A0a2 != null) {
                this.A6G = A0a2.A00.A02.A02;
            }
            if (r8.A1R()) {
                if (!r8.A1R()) {
                    strArr = new String[0];
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < r8.A39.size(); i2++) {
                        arrayList.add(((AnonymousClass24B) r8.A39.get(i2)).A00.getId());
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                }
                this.A6O = strArr;
                this.A5s = strArr.length;
            }
            A0U2 = r8.A0U();
            if (A0U2 != C37171jE.DEFAULT) {
                this.A6D = A0U2.A00;
            }
            if (r8.Aho()) {
                if (r8.A17() != null) {
                    i = r8.A17().size();
                }
                this.A5t = i;
                if (this.A1y == null) {
                    this.A1y = C06270Ok.A00();
                }
            }
            r2 = this.A6Q;
            if (r2 instanceof C30541Ug) {
                A07(((C30541Ug) r2).BYO(r8));
            }
            hashtag = r8.A0m;
            if (hashtag != null) {
                this.A66 = hashtag;
            }
            str2 = r8.A25;
            if (str2 != null) {
                this.A6H = str2;
            }
            str3 = r8.A1n;
            if (str3 != null) {
                this.A6E = str3;
            }
            if (r8.A1a()) {
                this.A5f = 1;
            }
            this.A3p = r8.A21;
            this.A4e = r8.A2D;
            if (!r8.A3G.isEmpty()) {
                str7 = C06360Ot.A04(",", r8.A3G);
            }
            this.A3J = str7;
            this.A69 = r8.A1C;
        }
        product = null;
        product2 = null;
        this.A67 = product2;
        if (product != null) {
        }
        r0 = r8.A0K;
        if (r0 == null) {
        }
        this.A6K = list;
        A0z2 = r8.A0z();
        this.A6I = A0z2;
        if (!AnonymousClass0OX.A00(A0z2)) {
        }
        this.A25 = r8.A0Z();
        this.A24 = r8.A0Y();
        A0a2 = r8.A0a();
        this.A26 = A0a2;
        if (A0a2 != null) {
        }
        if (r8.A1R()) {
        }
        A0U2 = r8.A0U();
        if (A0U2 != C37171jE.DEFAULT) {
        }
        if (r8.Aho()) {
        }
        r2 = this.A6Q;
        if (r2 instanceof C30541Ug) {
        }
        hashtag = r8.A0m;
        if (hashtag != null) {
        }
        str2 = r8.A25;
        if (str2 != null) {
        }
        str3 = r8.A1n;
        if (str3 != null) {
        }
        if (r8.A1a()) {
        }
        this.A3p = r8.A21;
        this.A4e = r8.A2D;
        if (!r8.A3G.isEmpty()) {
        }
        this.A3J = str7;
        this.A69 = r8.A1C;
    }

    public final void A0D(AnonymousClass0C1 r4, Product product, String str, AnonymousClass1NJ r7) {
        ProductCheckoutProperties productCheckoutProperties;
        this.A4G = product.getId();
        this.A33 = str;
        this.A6G = str;
        Boolean valueOf = Boolean.valueOf(product.A09());
        this.A2P = valueOf;
        if (valueOf.booleanValue() && (productCheckoutProperties = product.A03) != null) {
            this.A6B = Integer.valueOf(productCheckoutProperties.A00);
        }
        ProductLaunchInformation productLaunchInformation = product.A06;
        if (productLaunchInformation != null) {
            this.A1o = productLaunchInformation.A00;
            this.A2D = Boolean.valueOf(productLaunchInformation.A01);
        }
        if (r7 != null) {
            this.A3v = r7.getId();
            this.A1A = r7.APx().A00;
            this.A3V = C13300iJ.A02(r7.A0c(r4).A0M);
            this.A5C = r7.A0x();
            String id = r7.A0c(r4).getId();
            this.A6F = id;
            this.A2X = Boolean.valueOf(!id.equals(str));
        }
    }

    public final void A0E(AnonymousClass0C1 r3, C36331hs r4) {
        String str;
        int size;
        AnonymousClass1NJ APe = r4.APe();
        A0B(r3, APe);
        this.A2y = r4.A02;
        if (this.A6Q.Ahq()) {
            str = r4.AYw();
        } else {
            str = APe.A29;
        }
        this.A50 = str;
        if (APe.A17() == null) {
            size = 0;
        } else {
            size = APe.A17().size();
        }
        this.A5t = size;
        if (this.A1y == null) {
            this.A1y = C06270Ok.A00();
        }
    }

    public final AnonymousClass0P4 A03() {
        C06270Ok A002;
        C06270Ok A003;
        C06170Oa A004;
        C06170Oa A005;
        C06170Oa A006;
        String str;
        int i;
        String str2;
        double d;
        C37121j9 r2 = this.A6P;
        if (r2 != null) {
            r2.A34(this.A6R, this.A6Q, this);
        }
        AnonymousClass0P4 A007 = AnonymousClass0P4.A00(this.A6R, this.A6Q);
        A007.A0H("m_pk", this.A3v);
        C249916w r0 = this.A21;
        if (r0 != null) {
            for (Map.Entry entry : r0.APN().entrySet()) {
                A007.A0G((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            String str3 = this.A33;
            if (str3 != null) {
                A007.A0G("a_pk", str3);
            }
        }
        Long l = this.A6C;
        if (l != null) {
            A007.A0F("m_ts", l);
        }
        A007.A0H("ad_id", this.A2y);
        A007.A06("m_t", this.A1A);
        A007.A0H("tracking_token", this.A50);
        A007.A0H("logging_token", this.A3t);
        A007.A0H("topic_cluster_id", this.A4x);
        A007.A0H("topic_cluster_title", this.A4y);
        A007.A0H("topic_cluster_type", this.A4z);
        A007.A0H("session_id", this.A4c);
        A007.A0H("source_of_action", this.A4g);
        A007.A0H("follow_status", this.A3V);
        A007.A06("m_ix", this.A14);
        A007.A07("timespent", this.A1t);
        A007.A0H("response", this.A4Y);
        A007.A0H("survey_id", this.A4p);
        A007.A0H("survey_type", this.A4q);
        A007.A06("position", this.A1X);
        A007.A0H("question_id", this.A4L);
        A007.A06("question_index", this.A1L);
        A007.A0H("page_id", this.A46);
        A007.A0H("page_status", this.A47);
        A007.A0H("exit_type", this.A3U);
        C06170Oa r1 = this.A1z;
        if (r1 != null) {
            A007.A09("responses", r1);
        }
        Map map = this.A5P;
        if (map == null || map.isEmpty()) {
            A007.A06("caption_num_char_showed", this.A0g);
            A007.A06("caption_num_hashtags_showed", this.A0h);
            A007.A06("caption_num_mentions_showed", this.A0j);
            A007.A06("caption_num_lines_showed", this.A0i);
            A007.A05("caption_position_start_y", (double) this.A0J);
            A007.A05("caption_position_start_x", (double) this.A0I);
            A007.A05("caption_height", (double) this.A0H);
            A007.A05("caption_width", (double) this.A0K);
            Boolean bool = this.A2O;
            if (bool != null) {
                A007.A0A("is_caption_scrollable", bool);
            }
        } else {
            A007.A0K(this.A5P);
        }
        A007.A0H("id", this.A3n);
        A007.A0H("netego_id", this.A3y);
        A007.A0H("tracking_token", this.A40);
        A007.A0H("type", this.A41);
        A007.A0H("netego_type", this.A3z);
        A007.A0H("from", this.A3W);
        A007.A0H("mention_type", this.A3x);
        A007.A0B("is_context_sheet", this.A2m);
        A007.A06(IgReactMediaPickerNativeModule.HEIGHT, this.A0x);
        A007.A06("time", this.A5o);
        A007.A05("timeAsPercent", this.A5W);
        A007.A05("duration", this.A04);
        A007.A05("aspect_ratio", (double) this.A0F);
        A007.A06("carousel_index", this.A0k);
        A007.A0H("carousel_media_id", this.A3A);
        A007.A0H("carousel_cover_media_id", this.A39);
        A007.A0H("main_feed_carousel_starting_media_id", this.A3u);
        A007.A06("carousel_m_t", this.A0l);
        A007.A06("carousel_size", this.A0n);
        Boolean bool2 = this.A2A;
        String str4 = "0";
        if (bool2 != null) {
            String str5 = str4;
            if (bool2.booleanValue()) {
                str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("audio_enabled", str5);
        }
        A007.A0H("location_id", this.A3s);
        A007.A0H("hashtag", this.A3a);
        Hashtag hashtag = this.A66;
        if (hashtag != null) {
            A007.A0G("hashtag_id", hashtag.A07);
            A007.A0G("hashtag_name", this.A66.A0A);
            A007.A0A("hashtag_follow_status", true);
        }
        A007.A0H("hashtag_type", this.A3b);
        A007.A0H("inventory_source", this.A3p);
        A007.A0H("feed_request_id", this.A4e);
        A007.A0H("delivery_flags", this.A3J);
        A007.A0H("composer_type", this.A3I);
        A007.A0H("action", this.A2w);
        A007.A0H("orientation", this.A45);
        A007.A0H("ad_intent", this.A2z);
        Boolean bool3 = this.A29;
        if (bool3 != null) {
            A007.A0E("cta_state", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        C39531n4 r3 = this.A20;
        if (r3 != null) {
            long j = r3.A02;
            if (j > 0) {
                d = r3.A01 / ((double) j);
            } else {
                d = r3.A00;
            }
            A007.A0D("avgViewPercent", Float.valueOf((float) d));
            A007.A0D("maxViewPercent", Float.valueOf((float) this.A20.A00));
        }
        A007.A0H("source_of_tapping", this.A4i);
        Boolean bool4 = this.A2e;
        if (bool4 != null) {
            A007.A0E("is_unpublished", Integer.valueOf(bool4.booleanValue() ? 1 : 0));
        }
        if (this.A65 != null) {
            A007.A0E("nav_stack_depth", Integer.valueOf(this.A5n));
            A007.A09("nav_stack", this.A65);
        }
        A007.A0H("sponsored_label_text", this.A4l);
        A007.A0H("byline_text", this.A36);
        A007.A0H("disclaimer_title", this.A3N);
        A007.A0H("disclaimer_text", this.A3M);
        A007.A0H("disclaimer_url", this.A3O);
        A007.A06("scans", this.A0s);
        A007.A06("consumed_media_gap", this.A0p);
        A007.A06("reel_gap", this.A1M);
        A007.A06("consumed_media_gap_highest_position", this.A0q);
        A007.A06("reel_gap_highest_position", this.A1N);
        A007.A06("ad_consumed_media_gap", this.A0W);
        Integer num = this.A2s;
        if (num != null) {
            A007.A0E("reel_gap_to_last_ad", num);
        }
        A007.A06("netego_consumed_media_gap", this.A1C);
        Integer num2 = this.A2t;
        if (num2 != null) {
            A007.A0E("reel_gap_to_last_netego", num2);
        }
        A007.A06("min_consumed_reel_gap_to_previous_ad", this.A5j);
        A007.A06("min_consumed_reel_gap_to_previous_netego", this.A5k);
        A007.A06("min_consumed_media_gap_to_previous_ad", this.A5h);
        A007.A06("min_consumed_media_gap_to_previous_netego", this.A5i);
        A007.A06("min_media_gap_to_previous_item", this.A5l);
        A007.A05("time_gap_to_previous_item_in_sec", this.A5X);
        A007.A06("priority_index", this.A1I);
        A007.A06("highest_position_rule", this.A5c);
        A007.A06("max_reel_gap_to_previous_item", this.A5g);
        A007.A0H("ad_pod_id", this.A30);
        Integer num3 = this.A2q;
        if (num3 != null) {
            if (1 - num3.intValue() != 0) {
                str2 = "server";
            } else {
                str2 = "prefetch";
            }
            A007.A0G("source_of_delivery", str2);
        }
        A007.A06("index_in_ad_pod", this.A15);
        A007.A0C("elapsed_time_since_last_item", Double.valueOf(this.A05));
        A007.A06("actual_insert_position", this.A0V);
        A007.A06("desired_insert_position", this.A0t);
        A007.A0H("validation_result", this.A55);
        A007.A0H("result", this.A4Z);
        A007.A0H("set_id", this.A4d);
        A007.A0H("pair_id", this.A48);
        A007.A0H(IgReactNavigatorModule.URL, this.A53);
        A007.A0H("click_id", this.A3m);
        A007.A07("load_starts_ms", this.A61);
        A007.A07("response_end_time", this.A62);
        A007.A07("scroll_ready_time", this.A63);
        A007.A0H("sponsor_id_clicked_on", this.A4j);
        String[] strArr = this.A6O;
        if (strArr != null) {
            A007.A0J("sponsor_tag_ids", strArr);
        }
        A007.A06("sponsor_tag_count", this.A5s);
        A007.A0H("bc_tagged_partner", this.A4k);
        A007.A0H("old_bc_tagged_partner", this.A44);
        A007.A07("handler_time", this.A5z);
        A007.A07("dom_content_loaded_ms", this.A5y);
        A007.A07("load_event_end_ms", this.A60);
        A007.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, this.A54);
        A007.A0H("target_id", this.A4u);
        A007.A0H("target_username", this.A4v);
        A007.A0H("actor_id", this.A2x);
        A007.A0H("media_id_attribution", this.A3w);
        A007.A07("tti", this.A64);
        Boolean bool5 = this.A2a;
        if (bool5 != null) {
            String str6 = str4;
            if (bool5.booleanValue()) {
                str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("is_live_streaming", str6);
        }
        Boolean bool6 = this.A2Z;
        if (bool6 != null) {
            String str7 = str4;
            if (bool6.booleanValue()) {
                str7 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("is_live_questions", str7);
        }
        A007.A0H("is_app_backgrounded", this.A3q);
        A007.A0H("is_on_screen", (String) null);
        Boolean bool7 = this.A2b;
        if (bool7 != null) {
            String str8 = str4;
            if (bool7.booleanValue()) {
                str8 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("nav_in_transit", str8);
        }
        A007.A0H("last_navigation_module", this.A3r);
        A007.A0H("swipe_up_type", this.A4r);
        A007.A0H("exit_source", this.A3T);
        A007.A0H("source_of_like", this.A4h);
        Boolean bool8 = this.A2o;
        if (bool8 != null) {
            String str9 = str4;
            if (bool8.booleanValue()) {
                str9 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("video_collapsed", str9);
        }
        A007.A06("contact_button_option", this.A0r);
        List<instagramComment> list = this.A5I;
        if (list != null) {
            C06170Oa A008 = C06170Oa.A00();
            for (instagramComment r6 : list) {
                if (r6.A0K == Constants.ZERO) {
                    C06270Ok A009 = C06270Ok.A00();
                    A009.A09("comment_id", r6.AS8());
                    A009.A09("commenter_id", r6.AZf().getId());
                    A008.A00.add(A009);
                }
            }
            A007.A09("c_pk_list", A008);
        }
        A007.A05("comment_compose_duration", this.A02);
        A007.A0H("viewer_session_id", this.A57);
        A007.A0H("tray_session_id", this.A4T);
        A007.A0H("reel_id", this.A4N);
        A007.A0H("reel_notification_type", this.A4O);
        A007.A0H("suggested_type", (String) null);
        A007.A0B("is_paginated_tail_loading", this.A2j);
        A007.A0B("is_besties_reel", this.A2N);
        A007.A0B("is_besties_media", (Boolean) null);
        A007.A0B("is_highlights_sourced", this.A2U);
        A007.A0H("click_source", this.A3F);
        A007.A0H("story_ranking_token", this.A4m);
        A007.A0B("is_quick_reaction", this.A2d);
        A007.A0B("has_media_loaded", this.A2i);
        A007.A0B("is_shop_empty", (Boolean) null);
        A007.A0H("thread_id", this.A4w);
        A007.A06("reel_position", this.A1O);
        A007.A06("reel_viewer_position", this.A1S);
        A007.A05("tap_x_position", (double) this.A0T);
        A007.A05("tap_y_position", (double) this.A0U);
        C51862Mk r02 = this.A28;
        if (r02 != null) {
            A007.A0D("start_x_position", Float.valueOf(r02.A02));
            A007.A0D("start_y_position", Float.valueOf(this.A28.A03));
            A007.A0D("end_x_position", Float.valueOf(this.A28.A00));
            A007.A0D("end_y_position", Float.valueOf(this.A28.A01));
            A007.A0D("x_velocity", Float.valueOf(this.A28.A04));
            A007.A0D("y_velocity", Float.valueOf(this.A28.A05));
        } else {
            A007.A05("start_x_position", (double) this.A0R);
            A007.A05("start_y_position", (double) this.A0S);
        }
        A007.A0H("reel_type", this.A4U);
        A007.A06("reel_size", this.A1P);
        A007.A0B("is_video_to_carousel", this.A2f);
        List list2 = this.A6M;
        if (list2 != null) {
            A007.A0I("video_to_carousel_cut_secs", list2);
            A007.A0E("segment_count", Integer.valueOf(this.A6M.size()));
        }
        List list3 = this.A6J;
        if (list3 != null) {
            A007.A0I("carousel_transformation_cards", list3);
            A007.A0E("segment_count", Integer.valueOf(this.A6J.size()));
        }
        A007.A06("segment_index", this.A1T);
        A007.A06("tray_position", this.A1Y);
        A007.A06("is_replay", this.A16);
        A007.A06("ad_inserted_position", this.A0X);
        A007.A06("ad_position_from_server", this.A0Z);
        A007.A06("ad_received_position", this.A0a);
        int i2 = this.A0b;
        if (i2 != -1) {
            A007.A0E("ad_request_position", Integer.valueOf(i2));
        }
        A007.A06("netego_request_position", this.A1D);
        int i3 = this.A1R;
        if (i3 != -1) {
            A007.A0E("reel_viewer_entry_position", Integer.valueOf(i3));
        }
        ArrayList arrayList = this.A5B;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.A5B;
            AnonymousClass0a4.A06(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = this.A5B.iterator();
            while (it.hasNext()) {
                arrayList3.add(((PeopleTag) it.next()).A03());
            }
            A007.A0I("tagged_user_ids", arrayList3);
        }
        ArrayList<Product> arrayList4 = this.A5C;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList();
            for (Product id : arrayList4) {
                arrayList5.add(id.getId());
            }
            A007.A0I("product_ids", arrayList5);
            Iterator it2 = this.A5C.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Product) it2.next()).A09()) {
                        i = 1;
                        break;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            A007.A0E("is_checkout_enabled", Integer.valueOf(i));
            ArrayList arrayList6 = this.A5C;
            AnonymousClass0a4.A06(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                Product product = (Product) it3.next();
                if (product.A06 != null) {
                    arrayList7.add(product.getId());
                }
            }
            if (arrayList7.isEmpty()) {
                arrayList7 = null;
            }
            if (arrayList7 != null) {
                A007.A0I("drops_product_ids", arrayList7);
            }
        }
        Map map2 = this.A6N;
        if (map2 != null) {
            C06270Ok A0010 = C06270Ok.A00();
            for (Map.Entry entry2 : map2.entrySet()) {
                C06170Oa A0011 = C06170Oa.A00();
                for (String A042 : (List) entry2.getValue()) {
                    A0011.A04(A042);
                }
                A0010.A04((String) entry2.getKey(), A0011);
            }
            A007.A08("product_merchant_ids", A0010);
        }
        List<Map> list4 = this.A6L;
        if (list4 != null) {
            C06170Oa A0012 = C06170Oa.A00();
            for (Map A0C2 : list4) {
                C06270Ok A0013 = C06270Ok.A00();
                A0013.A0C(A0C2);
                A0012.A00.add(A0013);
            }
            A007.A09("sticker_styles", A0012);
        }
        A007.A0H("ig_profile_user_id", this.A4K);
        A007.A0H("product_id", this.A4G);
        List list5 = this.A5J;
        if (list5 != null) {
            A007.A0I("product_ids", list5);
        }
        A007.A0H("product_row_type", (String) null);
        A007.A0H("product_sticker_id", this.A4I);
        A007.A0H("product_variant_dimension", (String) null);
        A007.A0H("product_variant_value", (String) null);
        A007.A0B("is_halfsheet", (Boolean) null);
        A007.A0H("waterfall_id", this.A5A);
        A007.A0H("checkout_product_id", this.A3C);
        A007.A0H("checkout_session_id", this.A3D);
        Boolean bool9 = this.A2c;
        if (bool9 != null) {
            String str10 = str4;
            if (bool9.booleanValue()) {
                str10 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("is_product_available", str10);
        }
        A007.A0H("merchant_id", this.A6G);
        A007.A0H("media_owner_id", this.A6F);
        A007.A06("product_image_count", this.A1J);
        A007.A06("product_image_from_index", this.A5p);
        A007.A06("product_image_to_index", this.A5q);
        A007.A07("drops_launch_date", this.A1o);
        A007.A0B("has_drops_launched", this.A2D);
        AnonymousClass230 r03 = this.A22;
        if (r03 != null) {
            A007.A0G("product_review_status", r03.A00);
        }
        Product product2 = this.A68;
        if (product2 != null) {
            ArrayList arrayList8 = new ArrayList();
            arrayList8.add(product2.getId());
            A007.A0I("shared_product_ids", arrayList8);
        }
        Product product3 = this.A67;
        if (product3 != null) {
            ArrayList arrayList9 = new ArrayList();
            arrayList9.add(product3.getId());
            A007.A0I("shared_drops_product_ids", arrayList9);
        }
        if (!AnonymousClass0OX.A00(this.A6K)) {
            List<ProductMention> list6 = this.A6K;
            ArrayList arrayList10 = new ArrayList();
            for (ProductMention productMention : list6) {
                arrayList10.add(productMention.A04);
            }
            A007.A0I("product_mention_ids", arrayList10);
        }
        if (!AnonymousClass0OX.A00(this.A6I)) {
            ArrayList<Product> arrayList11 = this.A6I;
            ArrayList arrayList12 = new ArrayList();
            for (Product id2 : arrayList11) {
                arrayList12.add(id2.getId());
            }
            A007.A0I("mentioned_product_ids", arrayList12);
        }
        Map A0014 = C37181jF.A00(this.A25, this.A24, this.A26);
        if (A0014 == null) {
            A002 = null;
        } else {
            A002 = C06270Ok.A00();
            A002.A0C(A0014);
        }
        if (A002 != null) {
            A007.A08("profile_shop_link", A002);
        }
        A007.A0H("tapped_unit_pk", this.A4t);
        Boolean bool10 = this.A2P;
        if (bool10 != null) {
            boolean booleanValue = bool10.booleanValue();
            String str11 = str4;
            if (booleanValue) {
                str11 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("is_checkout_enabled", str11);
        }
        Boolean bool11 = this.A2B;
        if (bool11 != null) {
            A007.A0A("can_add_to_bag", bool11);
        }
        Integer num4 = this.A6B;
        if (num4 != null) {
            A007.A0G("product_inventory", Integer.toString(num4.intValue()));
        }
        Boolean bool12 = this.A2W;
        if (bool12 != null) {
            String str12 = str4;
            if (bool12.booleanValue()) {
                str12 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("is_indicator_expanded", str12);
        }
        A007.A0H("variant_id", this.A56);
        A007.A0H("from_variant_value", (String) null);
        A007.A0H("to_variant_value", (String) null);
        A007.A0H("visual_style", (String) null);
        A007.A0H("type", this.A52);
        A007.A0H("guest_id", this.A3G);
        A007.A0H("reel_viewer_gestures_nux_action", this.A4M);
        A007.A05("reel_viewer_gestures_nux_impression_duration", this.A0C);
        A007.A0H("nux_cta_type", this.A4P);
        Boolean bool13 = this.A2E;
        if (bool13 != null) {
            String str13 = str4;
            if (bool13.booleanValue()) {
                str13 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("has_my_reel", str13);
        }
        A007.A06("new_reel_count", this.A1F);
        A007.A06("viewed_reel_count", this.A1e);
        A007.A06("live_reel_count", this.A17);
        A007.A06("new_replay_reel_count", this.A1E);
        A007.A06("viewed_replay_reel_count", this.A1d);
        A007.A06("session_reel_counter", this.A1U);
        A007.A05("pause_duration", this.A0B);
        A007.A05("context_sheet_duration", this.A03);
        A007.A05("time_elapsed", this.A0D);
        A007.A05("media_time_elapsed", this.A09);
        A007.A05("media_time_remaining", this.A0A);
        A007.A05("media_dwell_time", this.A06);
        A007.A05("media_time_paused", this.A08);
        A007.A05("media_time_to_load", this.A07);
        A007.A05("ad_pause_duration", this.A00);
        A007.A05("ad_time_elapsed", this.A01);
        A007.A06("viewer_session_media_consumed", this.A1k);
        A007.A06("viewer_session_reels_consumed", this.A1m);
        A007.A06("photos_consumed", this.A1H);
        A007.A06("videos_consumed", this.A1c);
        A007.A06("viewer_session_ad_media_consumed", this.A1f);
        A007.A06("viewer_session_ad_reels_consumed", this.A1g);
        A007.A06("viewer_session_netego_reels_consumed", this.A1l);
        A007.A06("viewer_session_replay_videos_consumed", this.A1j);
        A007.A06("viewer_session_live_reels_consumed", this.A1h);
        A007.A06("viewer_session_replay_reels_consumed", this.A1i);
        A007.A06("ad_photos_consumed", this.A0Y);
        A007.A06("ad_videos_consumed", this.A0c);
        A007.A06("replay_videos_consumed", this.A18);
        A007.A06("live_videos_consumed", this.A19);
        A007.A06("reel_start_position", this.A1Q);
        A007.A05("time_remaining", this.A0E);
        Boolean bool14 = this.A2k;
        if (bool14 != null) {
            A007.A0A("viewer_volume_on", bool14);
        }
        Boolean bool15 = this.A2l;
        if (bool15 != null) {
            A007.A0A("viewer_volume_toggled", bool15);
        }
        A007.A0H("error_reason", this.A4V);
        Map map3 = this.A5S;
        if (map3 != null && !map3.isEmpty()) {
            A007.A0E("mentions_tap_counter", Integer.valueOf(A00(this.A5S)));
            A007.A08("mentions_to_mentions_taps", A01(this.A5S));
        }
        A007.A06("profile_tap_counter", this.A1K);
        A007.A06("election_tap_counter", this.A0w);
        A007.A06("anti_bully_tap_counter", this.A0d);
        Map map4 = this.A5R;
        if (map4 != null && !map4.isEmpty()) {
            A007.A0E("location_tap_counter", Integer.valueOf(A00(this.A5R)));
            A007.A08("location_to_location_taps", A01(this.A5R));
        }
        Map map5 = this.A5Q;
        if (map5 != null && !map5.isEmpty()) {
            A007.A0E("hashtags_tap_counter", Integer.valueOf(A00(this.A5Q)));
            A007.A08("hashtags_to_hashtags_taps", A01(this.A5Q));
        }
        Map map6 = this.A5T;
        if (map6 != null && !map6.isEmpty()) {
            A007.A0E("products_tap_counter", Integer.valueOf(A00(this.A5T)));
            A007.A08("products_to_products_taps", A01(this.A5T));
        }
        A007.A06("media_viewers", this.A1B);
        A007.A06("source", this.A1V);
        A007.A0H("filtering_tag", this.A3o);
        Integer num5 = this.A2r;
        if (num5 != null) {
            A007.A0E("client_position", num5);
        }
        A007.A0H("a_i", this.A51);
        Boolean bool16 = this.A2S;
        if (bool16 != null) {
            String str14 = str4;
            if (bool16.booleanValue()) {
                str14 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("first_view", str14);
        }
        Boolean bool17 = this.A2R;
        if (bool17 != null) {
            String str15 = str4;
            if (bool17.booleanValue()) {
                str15 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("first_request", str15);
        }
        A007.A0H("source_module", this.A4f);
        A007.A0H("dest_module", this.A3K);
        A007.A0H("web_link_entry_source", (String) null);
        A007.A06("percent_visible", this.A1G);
        A007.A0H("visibility_unit", this.A58);
        Boolean bool18 = this.A2V;
        if (bool18 != null) {
            String str16 = str4;
            if (bool18.booleanValue()) {
                str16 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0H("has_been_loaded", str16);
        }
        A007.A0H("gating_type", this.A3Z);
        List list7 = this.A5E;
        if (list7 != null) {
            A007.A0I("added_collection_ids", list7);
        }
        List list8 = this.A5M;
        if (list8 != null) {
            A007.A0I("removed_collection_ids", list8);
        }
        List list9 = this.A5D;
        if (list9 != null) {
            A007.A0I("ad_ids", list9);
        }
        SavedCollection savedCollection = this.A27;
        if (savedCollection != null) {
            A007.A0G("collection_id", savedCollection.A04);
            A007.A0G("collection_name", this.A27.A05);
            A007.A0G("collection_type", this.A27.A01.A00);
        }
        Integer num6 = this.A2u;
        if (num6 != null) {
            A007.A0G("save_item_type", AnonymousClass2LM.A00(num6).toLowerCase());
        }
        A007.A06("action_type", this.A5Y);
        A007.A06("fail_reason", this.A0e);
        A007.A06("last_visible_pos", this.A5Z);
        A007.A06("desired_action_pos", this.A0f);
        A007.A06("push_down_offset", this.A5b);
        A007.A0H("target_item_id", (String) null);
        Boolean bool19 = this.A2T;
        if (bool19 != null) {
            String str17 = str4;
            if (bool19.booleanValue()) {
                str17 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("is_from_inline_composer", str17);
        }
        A007.A0H("replay_posting_status", this.A4W);
        A007.A0H("document_id", this.A38);
        A007.A0H("loading_url", (String) null);
        A007.A06("nav_depth", this.A5m);
        A007.A0H("audience", this.A6D);
        A007.A05("component_view_percent", (double) this.A0G);
        Map map7 = this.A5O;
        if (map7 != null) {
            A007.A08("element_timespent", A01(map7));
        }
        A007.A05("current_play_time", (double) this.A0L);
        A007.A0H("reply_type", this.A59);
        A007.A0H("child_logging_token", this.A3E);
        A007.A0H("parent_c_pk", this.A49);
        A007.A0H("replied_c_pk", this.A4X);
        A007.A07("viewer_launch_duration", this.A1u);
        Boolean bool20 = this.A2p;
        if (bool20 != null) {
            if (bool20.booleanValue()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A007.A0G("viewer_launch_preload_success", str4);
        }
        C06270Ok r12 = this.A1y;
        if (r12 != null) {
            A007.A08("media_layout", r12);
        }
        List<AnonymousClass2TY> list10 = this.A5L;
        if (list10 == null) {
            A003 = null;
        } else {
            A003 = C06270Ok.A00();
            for (AnonymousClass2TY r13 : list10) {
                C06270Ok A0015 = C06270Ok.A00();
                A0015.A06("start_x_position", Float.valueOf(r13.A01));
                A0015.A06("start_y_position", Float.valueOf(r13.A02));
                A0015.A06(IgReactMediaPickerNativeModule.WIDTH, Float.valueOf(r13.A03));
                A0015.A06(IgReactMediaPickerNativeModule.HEIGHT, Float.valueOf(r13.A00));
                if (!TextUtils.isEmpty(r13.A04)) {
                    A0015.A09("text", r13.A04);
                }
                A003.A03(r13.A05, A0015);
            }
        }
        if (A003 != null) {
            A007.A08("toolbar_layout", A003);
        }
        A007.A06("top_liker_count", this.A5t);
        A007.A07("from_organic_to_ad_response_latency", this.A5w);
        A007.A07("latency", this.A1p);
        A007.A07("waiting_time", this.A1w);
        A007.A06(TraceFieldType.StatusCode, this.A1W);
        A007.A06("realtime_client_target_status", this.A5a);
        A007.A0H("last_received_feed_items", (String) null);
        A007.A0H("url_source", (String) null);
        A007.A07("start_process_time", this.A5x);
        A007.A0H("async_ad_source", this.A32);
        Boolean bool21 = this.A69;
        if (bool21 != null) {
            A007.A0A("is_eof", bool21);
        }
        A007.A0H("destination", this.A3L);
        A007.A0H("current_client_session_id", (String) null);
        A007.A0H("received_client_session_id", (String) null);
        A007.A0H("received_item_ids", (String) null);
        A007.A0H("thumbnail_id", this.A3H);
        A007.A07("cover_media_timespent", this.A1n);
        Boolean bool22 = this.A2Y;
        if (bool22 != null) {
            A007.A0A("is_last_reel", bool22);
        }
        A007.A06("imp_logger_ver", this.A13);
        Boolean bool23 = this.A2M;
        if (bool23 != null) {
            A007.A0A("impression_logger_validate", bool23);
        }
        A007.A0H("impression_exp_source", (String) null);
        List list11 = this.A5F;
        if (list11 != null) {
            A007.A0I("feed_sticker_media_id", list11);
        }
        A007.A0H("prior_module", this.A4E);
        A007.A0H("prior_submodule", this.A4F);
        A007.A0H("submodule", this.A4n);
        A007.A0H("entry_point", this.A3Q);
        A007.A0H("surface", this.A4o);
        A007.A0H("channel_pk", this.A3B);
        A007.A06("channel_position", this.A0o);
        A007.A06("video_position_in_channel", this.A1Z);
        List list12 = this.A5H;
        if (list12 != null) {
            A007.A0I("position_info", list12);
        }
        A007.A0H("component_type", this.A3h);
        A007.A0H("nav_bar_item", (String) null);
        A007.A06("video_position_in_row", this.A1a);
        A007.A06("video_row", this.A1b);
        A007.A0H("browse_item_type", this.A34);
        A007.A0B("guide_open_status", this.A2n);
        A007.A0H("igtv_viewer_session_id", this.A3l);
        A007.A0H("igtv_browse_session_id", this.A3f);
        A007.A0H("igtv_destination_session_id", this.A3j);
        A007.A0H("igtv_series_id", this.A3k);
        A007.A0H("igtv_composer_session_id", this.A3i);
        A007.A0H("chaining_seed_media_id", this.A3g);
        A007.A0H("parent_m_pk", this.A4A);
        Boolean bool24 = this.A2I;
        if (bool24 != null) {
            if (bool24.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            A007.A0G("igtv_icon_notification_status", str);
        }
        if (this.A11 != 0) {
            A007.A0E("igtv_video_height", Integer.valueOf(this.A0y));
        }
        int i4 = this.A11;
        if (i4 != 0) {
            A007.A0E("igtv_video_width", Integer.valueOf(i4));
        }
        if (this.A10 != 0) {
            A007.A0E("igtv_video_original_height", Integer.valueOf(this.A0z));
        }
        int i5 = this.A10;
        if (i5 != 0) {
            A007.A0E("igtv_video_original_width", Integer.valueOf(i5));
        }
        Boolean bool25 = this.A2L;
        if (bool25 != null) {
            A007.A0A("igtv_video_is_landscape", bool25);
        }
        A007.A0B("shared_to_fb_page_default_status", this.A2F);
        A007.A0B("shared_to_fb_page", this.A2G);
        A007.A0B("shared_to_fb_page_sticky_pref", this.A2H);
        A007.A0B("post_feed_preview", this.A2K);
        A007.A0B("is_branded_content", this.A2J);
        A007.A0H("bc_tagged_partner", this.A3e);
        List list13 = this.A5G;
        if (list13 != null) {
            A007.A0I("bc_upsell_signals", list13);
        }
        A007.A0H("bc_upsell_action", this.A3d);
        A007.A0B("can_skip", (Boolean) null);
        int i6 = this.A5f;
        if (i6 != -1) {
            A007.A0E("is_igtv", Integer.valueOf(i6));
        }
        A007.A0H("discovery_session_id", this.A3P);
        A007.A0H("camera_session_id", this.A37);
        Long l2 = this.A2v;
        if (l2 != null) {
            A007.A0F("media_face_effect_id", l2);
        }
        Long l3 = this.A2v;
        if (l3 != null) {
            A007.A0F("effect_id", l3);
        }
        int i7 = this.A0v;
        if (i7 != -1) {
            A007.A0E("row", Integer.valueOf(i7));
        }
        int i8 = this.A0u;
        if (i8 != -1) {
            A007.A0E("position", Integer.valueOf(i8));
        }
        A007.A07("load_time_ms", this.A1q);
        A007.A07("visible_load_time", this.A1v);
        A007.A06("interaction_count", this.A5e);
        A007.A06("profile_avatar_interaction_count", this.A5r);
        A007.A06("user_name_interaction_count", this.A5v);
        A007.A06("user_description_interaction_count", this.A5u);
        A007.A0B("is_browser_process_alive", (Boolean) null);
        A007.A06("dismiss_method", this.A5d);
        A007.A0H("previous_media_pk", this.A4D);
        A007.A0H("next_media_pk", this.A43);
        A007.A0H("tagged_profile_tapped", this.A4s);
        A007.A0H("gap_to_last_ad", this.A3X);
        A007.A0H("gap_to_last_netego", this.A3Y);
        A007.A0H("mezql_token", this.A6H);
        A007.A0H("connection_id", this.A6E);
        Map map8 = this.A5U;
        if (map8 == null) {
            A004 = null;
        } else {
            A004 = C06170Oa.A00();
            for (Map.Entry entry3 : map8.entrySet()) {
                C06270Ok A0016 = C06270Ok.A00();
                A0016.A09("sticker_type", (String) entry3.getKey());
                A0016.A09("sticker_id", (String) entry3.getValue());
                A004.A00.add(A0016);
            }
        }
        if (A004 != null) {
            A007.A09("sticker_types", A004);
        }
        A007.A0H("sticker_id", this.A4Q);
        A007.A0H("sticker_type", this.A4S);
        A007.A0H("interact_result", this.A4R);
        List<String> list14 = this.A5K;
        if (list14 == null) {
            A005 = null;
        } else {
            A005 = C06170Oa.A00();
            for (String A043 : list14) {
                A005.A04(A043);
            }
        }
        if (A005 != null) {
            A007.A09("reasons", A005);
        }
        List<String> list15 = this.A5N;
        if (list15 == null) {
            A006 = null;
        } else {
            A006 = C06170Oa.A00();
            for (String A044 : list15) {
                A006.A04(A044);
            }
        }
        if (A006 != null) {
            A007.A09("response", A006);
        }
        A007.A0H("business_app_id", this.A35);
        A007.A0H("event_trace_id", this.A3S);
        ProductSource productSource = this.A23;
        if (productSource != null) {
            A007.A0G("selected_source_type", productSource.A00.toString());
            A007.A0G("selected_source_id", this.A23.A01);
            A007.A0H("selected_source_name", this.A23.A04);
        }
        A007.A0B("is_influencer", this.A2X);
        A007.A0H("partner_id", this.A4B);
        A007.A0B("is_eligible", this.A2Q);
        A007.A0B("is_whitelisted", this.A2g);
        A007.A0H("error_message", this.A3R);
        A007.A0H("section_group", this.A4a);
        A007.A0H("section_type", this.A4b);
        A007.A0H("product_search_context", this.A4H);
        A007.A0H("untaggable_reason", this.A4J);
        A007.A0H("network_result", this.A42);
        A007.A07("network_start_time", this.A1s);
        A007.A07("network_end_time", this.A1r);
        C06270Ok r04 = this.A1x;
        if (r04 != null) {
            A007.A04(r04);
        }
        Boolean bool26 = this.A6A;
        if (bool26 != null && bool26.booleanValue()) {
            A007.A07.add(AnonymousClass0RF.IS_LOGGED_FROM_VIEWPOINT);
        }
        Boolean bool27 = this.A2h;
        if (bool27 != null && bool27.booleanValue()) {
            A007.A0A("post_impression_column_override", true);
        }
        A007.A0H("previous_ad_id", this.A4C);
        A007.A05("screen_width", (double) this.A0Q);
        A007.A05("screen_height", (double) this.A0P);
        A007.A05("device_width", (double) this.A0N);
        A007.A05("device_height", (double) this.A0M);
        A007.A05("screen_density", (double) this.A0O);
        A007.A06("carousel_opt_in_position", this.A0m);
        if (!TextUtils.isEmpty(this.A31)) {
            A007.A0G("ad_skip_type", this.A31);
        }
        A007.A0B("has_ad_inserted", this.A2C);
        A007.A0H("host_video_pk", this.A3c);
        A007.A0A("is_ad", Boolean.valueOf(this.A5V));
        A007.A06("preview_video_position_ms", this.A12);
        return A007;
    }

    public final void A08(AnonymousClass1NJ r9, float f, float f2, float f3, float f4, float f5, int i, boolean z, int i2, int i3, int i4, int i5, float f6, float f7, float f8) {
        if (this.A1y == null) {
            this.A1y = C06270Ok.A00();
        }
        if (r9.A0W() != null) {
            C62582nx A0W2 = r9.A0W();
            this.A1y.A07("caption_num_lines_showed", Integer.valueOf(i5));
            this.A1y.A07("caption_num_lines_total", Integer.valueOf(i4));
            this.A1y.A06("caption_font_size", Float.valueOf(f5));
            this.A1y.A09("caption_text_color", A0W2.A06);
            this.A1y.A09("background_color_caption", A0W2.A02);
            this.A1y.A09("caption_background_color_alpha", A0W2.A03);
            this.A1y.A06("caption_line_height", Float.valueOf(f8));
            if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                this.A1y.A06("caption_height", Float.valueOf(f6));
                this.A1y.A06("caption_width", Float.valueOf(f7));
                this.A1y.A06("caption_position_start_y", Float.valueOf(f2));
                this.A1y.A06("caption_position_start_x", Float.valueOf(f));
                this.A1y.A07("caption_num_char_showed", Integer.valueOf(i));
                this.A1y.A05("is_caption_fully_displayed", Boolean.valueOf(z));
                this.A1y.A07("caption_num_hashtags_showed", Integer.valueOf(i2));
                this.A1y.A07("caption_num_mentions_showed", Integer.valueOf(i3));
            } else {
                this.A1y.A07("caption_position_start_y", 0);
                this.A1y.A07("caption_position_start_x", 0);
                this.A1y.A07("caption_num_hashtags_showed", 0);
                this.A1y.A07("caption_num_mentions_showed", 0);
                this.A1y.A07("caption_num_char_showed", 0);
            }
        }
        C2106296n r3 = r9.A0w;
        if (r3 != null) {
            this.A1y.A07("auto_cropping_start_x_position", Integer.valueOf(r3.A01));
            this.A1y.A07("auto_cropping_start_y_position", Integer.valueOf(r3.A02));
            this.A1y.A07("auto_cropping_width", Integer.valueOf(r3.A03));
            this.A1y.A07("auto_cropping_height", Integer.valueOf(r3.A00));
        }
        this.A1y.A09("background_color_top", r9.A0s());
        this.A1y.A09("background_color_bottom", r9.A0r());
        this.A1y.A06("media_width", Float.valueOf(f4));
        this.A1y.A06("media_height", Float.valueOf(f3));
    }
}
