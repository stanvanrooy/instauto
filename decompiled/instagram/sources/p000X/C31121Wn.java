package p000X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C0003R;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.share.twitter.TwitterOAuthActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.1Wn  reason: invalid class name and case insensitive filesystem */
public final class C31121Wn implements C31131Wo {
    public static final Handler A08 = new Handler(Looper.getMainLooper());
    public C52962Qx A00;
    public C13300iJ A01;
    public C31151Wq A02;
    public Integer A03;
    public final AnonymousClass1HD A04;
    public final AnonymousClass1AM A05;
    public final C52972Qy A06;
    public final AnonymousClass0C1 A07;

    public final void Ar4(int i, int i2) {
    }

    public final void Ar5(int i, int i2) {
    }

    public final void BpW(File file, int i) {
    }

    public static void A00(C31121Wn r4) {
        new C91773y5(AnonymousClass0QT.A00(r4.A07, (AnonymousClass0RN) r4.A04).A02("profile_pic_facebook")).A01();
        C126785c0 r3 = C126785c0.PROFILE_PIC;
        if (C12800hP.A0J(r4.A07)) {
            A04(r4, (Uri) null, 0);
        } else {
            C12800hP.A08(r4.A07, r4.A04, C696433b.PUBLISH_AS_SELF, r3);
        }
    }

    public static void A01(C31121Wn r4) {
        new C91763y4(AnonymousClass0QT.A00(r4.A07, (AnonymousClass0RN) r4.A04).A02("profile_pic_library")).A01();
        C31151Wq r42 = r4.A02;
        Integer num = Constants.ONE;
        C31161Wr r2 = new C31161Wr(num);
        r2.A04 = false;
        r42.BpQ(num, new MediaCaptureConfig(r2), Constants.A0j);
    }

    public static void A02(C31121Wn r5) {
        new C91753y3(AnonymousClass0QT.A00(r5.A07, (AnonymousClass0RN) r5.A04).A02("profile_pic_twitter")).A01();
        boolean z = false;
        if (C120095De.A00(r5.A07) != null) {
            z = true;
        }
        if (z) {
            A04(r5, (Uri) null, 1);
            return;
        }
        AnonymousClass1HD r3 = r5.A04;
        AnonymousClass1BH.A0B(new Intent(r3.getActivity(), TwitterOAuthActivity.class), 1, r3);
    }

    public static void A03(C31121Wn r3) {
        C17850qu A002 = C96304Ep.A00(r3.A07);
        A002.A00 = new AnonymousClass69J(r3);
        AnonymousClass1HD r0 = r3.A04;
        C28351Lj.A00(r0.getContext(), AnonymousClass1L8.A00(r0), A002);
    }

    public static void A04(C31121Wn r11, Uri uri, int i) {
        String A0B = AnonymousClass000.A0B("", System.currentTimeMillis());
        Context context = r11.A04.getContext();
        if (context != null) {
            AnonymousClass0C1 r4 = r11.A07;
            AnonymousClass2MT r3 = new AnonymousClass2MT(456, new C1428769c(context, r4, i, uri, A0B));
            r3.A00 = new AnonymousClass4Ov(r4, A0B, new AnonymousClass69J(r11), new C15910nj());
            C12810hQ.A02(r3);
            return;
        }
        throw new NullPointerException(String.valueOf("cannot operate with null context"));
    }

    public final void A05(int i, int i2, Intent intent) {
        AnonymousClass0P6.A03(new File(this.A04.getContext().getFilesDir(), "avatar_temp/").getAbsolutePath(), new AnonymousClass0P8(), (Set) null);
        if (i2 != -1) {
            return;
        }
        if (i == 64206) {
            C12800hP.A05(this.A07, i2, intent, new AnonymousClass69K(this), "UpdateAvatarHelper");
        } else if (i == 1) {
            A04(this, (Uri) null, 1);
        } else if (i == 10001 && intent != null && intent.getAction() != null) {
            A04(this, Uri.fromFile(new File(intent.getAction())), 2);
        }
    }

    public final void A06(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(C0003R.string.new_photo));
        arrayList.add(context.getString(C0003R.string.import_from_facebook));
        if (!this.A01.A0Z()) {
            arrayList.add(context.getString(C0003R.string.remove_photo));
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
        if (((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.ACTION_SHEET_MIGRATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass5EO r3 = new AnonymousClass5EO(this.A07, this.A04.getContext());
            r3.A03 = new AnonymousClass2NW((int) C0003R.string.change_profile_photo);
            r3.A02(C0003R.string.new_photo, new AnonymousClass4GW(this));
            r3.A02(C0003R.string.import_from_facebook, new AnonymousClass4GX(this));
            if (!this.A01.A0Z()) {
                r3.A01(C0003R.string.remove_photo, new AnonymousClass4GY(this));
            }
            r3.A00().A01(this.A04.getContext());
            return;
        }
        AnonymousClass5F4 r1 = new AnonymousClass5F4(this.A04.getActivity());
        r1.A01(C0003R.string.change_profile_photo);
        r1.A03(this.A04);
        r1.A0A(charSequenceArr, new AnonymousClass4GZ(this, charSequenceArr, context));
        r1.A09(true);
        r1.A00().show();
    }

    public final void AbX(Intent intent) {
        ((C26311Ct) this.A04.getActivity().getParent()).APg().AbX(intent);
    }

    public final void Bps(Intent intent, int i) {
        C26441Dh.A00(this.A07).A03(this.A04.getActivity(), "new_profile_photo");
        C137535to.A01(this.A03, this.A07);
        Context context = this.A04.getContext();
        if (context != null && C16330oQ.A00.A06(context, intent)) {
            AnonymousClass1BH.A0B(intent, i, this.A04);
        }
    }

    public C31121Wn(AnonymousClass0C1 r3, AnonymousClass1HD r4, AnonymousClass1AM r5, C13300iJ r6, C52962Qx r7, C52972Qy r8, Integer num) {
        this.A07 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = C16330oQ.A00.A04(r4.getContext(), this, r3);
        this.A01 = r6;
        this.A00 = r7;
        this.A03 = num;
        this.A06 = r8;
    }
}
