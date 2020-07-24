package com.instagram.camera.effect.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectFileBundle;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.effect.AREffect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.webrtc.CameraVideoCapturer;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass3DX;
import p000X.AnonymousClass3Y0;
import p000X.AnonymousClass3Y2;
import p000X.AnonymousClass3Y4;
import p000X.AnonymousClass3Y5;
import p000X.AnonymousClass3Y7;
import p000X.AnonymousClass3Y9;
import p000X.AnonymousClass3YB;
import p000X.AnonymousClass3YC;
import p000X.AnonymousClass3YD;
import p000X.AnonymousClass3YF;
import p000X.AnonymousClass3YH;
import p000X.AnonymousClass3YJ;
import p000X.AnonymousClass3YL;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C23300zv;
import p000X.C29283Cv9;
import p000X.C29285CvB;
import p000X.C706637c;
import p000X.C706837e;
import p000X.C707037g;
import p000X.C707137h;
import p000X.C707337j;
import p000X.C86623pP;

public class CameraAREffect extends AREffect implements C706637c {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(23);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public ImageUrl A05;
    public ImageUrl A06;
    public Integer A07 = Constants.A0N;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M = Collections.emptyList();
    public List A0N;
    public List A0O = new ArrayList();
    public List A0P = new ArrayList();
    public List A0Q = Collections.emptyList();
    public Map A0R = new HashMap();
    public Set A0S = new HashSet();
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    public static CameraAREffect A00(AnonymousClass0C1 r7, AnonymousClass3Y0 r8, Integer num) {
        StringBuilder sb;
        AnonymousClass3YB r0;
        boolean z;
        StringBuilder sb2;
        String str;
        String sb3;
        if (r8 != null) {
            if (r8 == null) {
                sb3 = "Receiving null effect";
            } else {
                String str2 = r8.A06;
                String str3 = str2;
                if (str2 == null) {
                    sb = new StringBuilder("Receiving null effect id: ");
                    sb.append(r8.toString());
                } else {
                    AnonymousClass3YF r02 = r8.A03;
                    AnonymousClass3YF r1 = r02;
                    if (r02 == null || r02.A00 == null) {
                        sb = new StringBuilder("Receiving null thumbnail image or uri: ");
                        sb.append(r1);
                    } else {
                        String str4 = r8.A07;
                        String str5 = str4;
                        if (str4 == null) {
                            sb = new StringBuilder("Receiving null effect name: ");
                            sb.append(str3);
                        } else {
                            AnonymousClass3Y9 r12 = r8.A00;
                            if (r12 == null || r12.A02 == null || r12.A01 == null || (r0 = r12.A00) == null || r0.A00 == null) {
                                sb = new StringBuilder("Receiving invalid attribution user for effect: ");
                                sb.append(str5);
                            } else {
                                AnonymousClass3Y2 r4 = r8.A01;
                                if (r4 == null) {
                                    sb = new StringBuilder("Receiving effects with null instance, Effect ID: ");
                                    sb.append(str3);
                                } else {
                                    AnonymousClass3Y4 r03 = r4.A00;
                                    AnonymousClass3Y4 r2 = r03;
                                    if (r03 == null) {
                                        sb2 = new StringBuilder("Receiving effects with null package, Effect Instance ID: ");
                                        str = r4.A01;
                                    } else if (r03.A03 == null) {
                                        sb2 = new StringBuilder("Receiving effects with null cache key, Effect Package ID: ");
                                        str = r2.A04;
                                    } else if (r2.A02 == null) {
                                        sb2 = new StringBuilder("Receiving effects with null compression type, Effect Package ID: ");
                                        str = r2.A04;
                                    } else if (r2.A00 == 0) {
                                        sb2 = new StringBuilder("Receiving effects with 0 file size bytes, valid values are -1 or > 0, Effect Package Id: ");
                                        str = r2.A04;
                                    } else if (r2.A06 == null) {
                                        sb2 = new StringBuilder("Receiving effects with null asset uri, Effect Package ID: ");
                                        str = r2.A04;
                                    } else {
                                        z = true;
                                        if (z) {
                                            CameraAREffect cameraAREffect = new CameraAREffect(r8, num);
                                            if (!cameraAREffect.A0G() || (((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.CAMERA_ANDROID_MUSIC_REACTIVE_EFFECTS, "enabled", false, (AnonymousClass04H) null)).booleanValue() && (!((Boolean) AnonymousClass0L6.A03(r7, AnonymousClass0L7.ANDROID_CAMERACORE_FBAUDIO_INTEGRATION_IG, "use_fba_ar_audio", false, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.CAMERA_ANDROID_MUSIC_REACTIVE_EFFECTS, "allow_fba", false, (AnonymousClass04H) null)).booleanValue()))) {
                                                if (!cameraAREffect.A0H() || ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.CAMERA_ANDROID_GALLERY_PICKER_CAPABILITY_LAUNCHER, "is_gallery_picker_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                                    return cameraAREffect;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    sb2.append(str);
                                    sb3 = sb2.toString();
                                }
                            }
                        }
                    }
                }
                sb3 = sb.toString();
            }
            AnonymousClass0QD.A01("Effect", sb3);
            z = false;
            if (z) {
            }
        }
        return null;
    }

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return false;
    }

    public final boolean Agp() {
        return false;
    }

    public final boolean Aho() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            CameraAREffect cameraAREffect = (CameraAREffect) obj;
            if (!AnonymousClass17M.A00(this.A0E, cameraAREffect.A0E) || !AnonymousClass17M.A00(this.A0H, cameraAREffect.A0H) || !AnonymousClass17M.A00(this.A0F, cameraAREffect.A0F)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0E, this.A0H, this.A0F});
    }

    public final String toString() {
        return String.format("name=%s id=%s packageId=%s fileId=%s cacheKey=%s", new Object[]{A06(), getId(), A07(), this.A0E, A05()});
    }

    public static List A01(AnonymousClass0C1 r3, List list, Integer num) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraAREffect A002 = A00(r3, (AnonymousClass3Y0) it.next(), num);
            if (A002 != null) {
                arrayList.add(A002);
            }
        }
        return arrayList;
    }

    public final List A0C() {
        ARRequestAsset.CompressionMethod valueOf;
        List list = this.A0N;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C29283Cv9 cv9 : this.A0N) {
            String str = cv9.A01;
            String str2 = cv9.A00;
            List list2 = cv9.A03;
            String str3 = cv9.A02;
            String str4 = this.A0D;
            if (str4 == null) {
                valueOf = ARRequestAsset.CompressionMethod.ZIP;
            } else {
                valueOf = ARRequestAsset.CompressionMethod.valueOf(str4.toUpperCase(Locale.US));
            }
            arrayList.add(new AREffectFileBundle(str, str2, list2, str3, valueOf, false));
        }
        return arrayList;
    }

    public final Map A0D() {
        HashMap hashMap = new HashMap();
        for (C706837e r1 : this.A0Q) {
            hashMap.put(r1.A02, r1);
        }
        return hashMap;
    }

    public final Set A0E() {
        C86623pP r1;
        HashSet hashSet = new HashSet();
        for (String str : this.A0S) {
            if (str != null) {
                r1 = (C86623pP) C86623pP.A01.get(str.toLowerCase());
            } else {
                r1 = null;
            }
            if (C86623pP.PRECAPTURE_VIDEO.equals(r1)) {
                r1 = C86623pP.PRECAPTURE_PHOTO;
            } else if (C86623pP.POSTCAPTURE_VIDEO.equals(r1)) {
                r1 = C86623pP.POSTCAPTURE_PHOTO;
            }
            if (r1 != null) {
                hashSet.add(r1);
            }
            if (C86623pP.LIVE.equals(r1)) {
                hashSet.add(C86623pP.VIDEO_CALL);
            }
        }
        return hashSet;
    }

    public final void A0F() {
        C707137h r0;
        try {
            String str = this.A0G;
            if (str != null) {
                C13080hr A0A2 = C12890hY.A00.A0A(str);
                A0A2.A0p();
                r0 = C707037g.parseFromJson(A0A2);
            } else {
                r0 = null;
            }
            if (r0 != null) {
                for (C707337j r2 : r0.A00) {
                    this.A0R.put(r2.A01, r2);
                }
            }
        } catch (IOException e) {
            AnonymousClass0QD.A01("CameraAREffect", AnonymousClass000.A0E("Unable to parse effect manifest json: ", e.getLocalizedMessage()));
        }
    }

    public final boolean A0G() {
        if (this.A0R.get("externalMusicSelection") != null) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        if (this.A0R.get("galleryPicker") != null) {
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        if (this.A0R.get("worldTracker") != null) {
            return true;
        }
        return false;
    }

    public final boolean AhP() {
        if (this.A02 != 1) {
            return false;
        }
        return true;
    }

    public final void BkJ(Integer num) {
        int i = 0;
        if (num == Constants.ZERO) {
            i = 1;
        }
        this.A02 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A02);
        parcel.writeStringList(this.A0O);
        parcel.writeStringList(this.A0P);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0B);
    }

    public final void A6t(AnonymousClass0C1 r6) {
        Integer num;
        C23300zv A002 = C23300zv.A00(r6);
        String str = this.A0F;
        if (this.A02 == 1) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        A002.BXT(new AnonymousClass3DX(str, num));
    }

    public final Collection AV4() {
        return Collections.EMPTY_LIST;
    }

    public CameraAREffect() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004b, code lost:
        if (r7.A05 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a7, code lost:
        if (r13.equals(p000X.Constants.A0j) != false) goto L_0x01a9;
     */
    public CameraAREffect(AnonymousClass3Y0 r12, Integer num) {
        AnonymousClass3Y4 r8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        SimpleImageUrl simpleImageUrl;
        List list;
        String str7;
        List emptyList;
        List list2;
        String str8;
        VersionedCapability fromServerValue;
        String str9;
        Integer num2;
        AnonymousClass3Y2 r7 = r12.A01;
        this.A0F = r12.A06;
        SimpleImageUrl simpleImageUrl2 = null;
        if (r7 != null) {
            r8 = r7.A00;
        } else {
            r8 = null;
        }
        if (r7 != null) {
            str = r7.A01;
        } else {
            str = null;
        }
        this.A0H = str;
        this.A0V = r12.A0D;
        boolean z = r7 != null ? true : z;
        z = false;
        this.A0X = z;
        if (r8 != null) {
            str2 = r8.A04;
        } else {
            str2 = null;
        }
        this.A0E = str2;
        if (r8 != null) {
            str3 = r8.A03;
        } else {
            str3 = null;
        }
        this.A0B = str3;
        if (r8 != null) {
            str4 = r8.A05;
        } else {
            str4 = null;
        }
        this.A0J = str4;
        if (r8 == null || (num2 = r8.A02) == null) {
            str5 = null;
        } else {
            str5 = AnonymousClass3Y5.A01(num2);
        }
        this.A0D = str5;
        this.A0L = r12.A07;
        if (r8 != null) {
            str6 = r8.A06;
        } else {
            str6 = null;
        }
        this.A08 = str6;
        this.A0T = r12.A0C;
        long j2 = -1;
        if (r8 != null) {
            j = (long) r8.A00;
        } else {
            j = -1;
        }
        this.A03 = j;
        this.A04 = r8 != null ? (long) r8.A01 : j2;
        if (r8 != null) {
            List list3 = r8.A07;
            List<C29285CvB> list4 = list3;
            if (list3 != null) {
                this.A0N = new ArrayList();
                for (C29285CvB cv9 : list4) {
                    this.A0N.add(new C29283Cv9(cv9));
                }
            }
        }
        String str10 = r12.A03.A00;
        String str11 = str10;
        if (str10 != null) {
            simpleImageUrl = new SimpleImageUrl(str11);
        } else {
            simpleImageUrl = null;
        }
        this.A06 = simpleImageUrl;
        if (r7 != null) {
            List<AnonymousClass3YJ> list5 = r7.A04;
            list = new ArrayList();
            for (AnonymousClass3YJ r82 : list5) {
                AnonymousClass3YL r1 = r82.A00;
                if (r1 != null) {
                    str9 = r1.A00;
                } else {
                    str9 = null;
                }
                String str12 = r82.A02;
                String str13 = str12;
                if (str12 != null) {
                    String str14 = r82.A01;
                    String str15 = str14;
                    if (str14 != null) {
                        list.add(new C706837e(str13, str15, str9));
                    }
                }
            }
        } else {
            list = Collections.emptyList();
        }
        this.A0Q = list;
        this.A0W = r12.A0B;
        List<AnonymousClass3YC> list6 = r12.A0A;
        if (list6 != null) {
            for (AnonymousClass3YC r0 : list6) {
                this.A0S.add(r0.toString());
            }
        }
        this.A01 = num == Constants.ONE ? CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS : 0;
        if (r7 != null) {
            str7 = r7.A02;
        } else {
            str7 = null;
        }
        this.A0G = str7;
        HashSet hashSet = new HashSet();
        for (AnonymousClass3Y7 r02 : (r7 == null || (emptyList = r7.A03) == null) ? Collections.emptyList() : emptyList) {
            hashSet.add(r02.A01);
        }
        this.A0b = hashSet.contains("segmentation");
        this.A0a = hashSet.contains("hairSegmentation");
        this.A0c = hashSet.contains("targetRecognition");
        this.A0Z = hashSet.contains("faceTracker");
        this.A0Y = hashSet.contains("bodyTracking");
        this.A07 = num;
        A0F();
        boolean z2 = !num.equals(Constants.ONE) ? false : z2;
        z2 = true;
        this.A0U = z2;
        Integer num3 = r12.A04;
        if (num3 != null) {
            switch (num3.intValue()) {
                case 1:
                    this.A00 = 0;
                    break;
                case 2:
                    this.A00 = 1;
                    break;
            }
        }
        this.A00 = 2;
        AnonymousClass3Y9 r13 = r12.A00;
        this.A09 = r13.A01;
        this.A0A = r13.A02;
        String str16 = r13.A00.A00;
        this.A05 = str16 != null ? new SimpleImageUrl(str16) : simpleImageUrl2;
        if (r7 != null) {
            List<AnonymousClass3Y7> list7 = r7.A03;
            list2 = new ArrayList();
            for (AnonymousClass3Y7 r3 : list7) {
                String str17 = r3.A01;
                if (!(str17 == null || (fromServerValue = VersionedCapability.fromServerValue(str17)) == null)) {
                    list2.add(new ARCapabilityMinVersionModeling(fromServerValue, r3.A00));
                }
            }
        } else {
            list2 = Collections.emptyList();
        }
        this.A0M = list2;
        Integer num4 = r12.A05;
        if (num4 == null || num4.intValue() != 1) {
            this.A02 = 0;
        } else {
            this.A02 = 1;
        }
        AnonymousClass3YH r32 = r12.A02;
        if (r32 != null) {
            for (AnonymousClass3YD r03 : r32.A00) {
                this.A0O.add(r03.toString());
            }
            for (AnonymousClass3YD r04 : r32.A01) {
                this.A0P.add(r04.toString());
            }
        }
        switch (num.intValue()) {
            case 0:
                str8 = "FOCUS";
                break;
            case 1:
                str8 = "SUPERZOOMV3";
                break;
            case 4:
                str8 = "FOCUSV2";
                break;
            case 5:
                str8 = "MIRROR";
                break;
            default:
                str8 = "DEFAULT";
                break;
        }
        this.A0C = str8;
    }

    public CameraAREffect(Parcel parcel) {
        this.A0F = parcel.readString();
        this.A0L = parcel.readString();
        this.A06 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0O = parcel.createStringArrayList();
        this.A0P = parcel.createStringArrayList();
        boolean z = true;
        this.A0X = parcel.readByte() != 0;
        this.A0V = parcel.readByte() == 0 ? false : z;
        this.A0H = parcel.readString();
        this.A0B = parcel.readString();
    }
}
