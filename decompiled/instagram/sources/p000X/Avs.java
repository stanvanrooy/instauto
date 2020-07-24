package p000X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Avs */
public final class Avs {
    public static final long A06 = TimeUnit.SECONDS.toMillis(1);
    public Aw0 A00;
    public C24915AwJ A01;
    public final AnonymousClass0C1 A02;
    public final C24894Avt A03 = new C24894Avt(this);
    public final C24895Avu A04 = new C24895Avu(this);
    public final C24922AwQ A05;

    public static void A00(Avs avs, C24915AwJ awJ) {
        Integer num;
        C24896Avv avv;
        C24892Avq avg;
        Avs avs2 = avs;
        C24915AwJ awJ2 = awJ;
        avs2.A01 = awJ2;
        Aw0 aw0 = avs2.A00;
        if (aw0 != null) {
            C13150hy.A02(awJ2, "state");
            C24893Avr avr = aw0.A00;
            AnonymousClass2E5 r4 = avr.A01;
            C24869AvQ avQ = avr.A03;
            C13150hy.A02(awJ2, "playbackState");
            C24898Avx avx = awJ2.A04;
            C13150hy.A01(avx, "playbackState.mPlaybackAction");
            int i = C24897Avw.A00[avx.ordinal()];
            if (i == 1) {
                num = Constants.ONE;
            } else if (i == 2) {
                num = Constants.ZERO;
            } else if (i == 3) {
                num = Constants.A0C;
            } else if (i != 4) {
                throw new C191608Hd();
            } else {
                throw new IllegalArgumentException("Unknown cowatch playback action");
            }
            C24956Awy awy = awJ2.A05;
            C13150hy.A01(awy, "playbackState.mContent");
            if (awy instanceof C160136sQ) {
                avg = C24869AvQ.A00(avQ, (C160136sQ) awy);
            } else if (awy instanceof C200278hm) {
                C200278hm r0 = (C200278hm) awy;
                String id = r0.getId();
                C13150hy.A01(id, "id");
                String AZn = r0.A02.AZn();
                C13150hy.A01(AZn, "ownerUsername");
                ImageUrl ASv = r0.A02.ASv();
                C13150hy.A01(ASv, "ownerAvatarUrl");
                String AZc = ASv.AZc();
                C13150hy.A01(AZc, "ownerAvatarUrl.url");
                C24884Avh avh = new C24884Avh(id, AZn, AZc);
                String id2 = r0.getId();
                C13150hy.A01(id2, "id");
                C24871AvT avT = C24871AvT.INSTAGRAM;
                Medium medium = r0.A01;
                boolean AiO = medium.AiO();
                String str = medium.A0P;
                C13150hy.A01(str, "path");
                Medium medium2 = r0.A01;
                int i2 = medium2.A09;
                int i3 = i2;
                avg = new C24885Avi(id2, avT, AiO, avh, str, i3, medium2.A04, r0.A01(), r0.A00(), (long) r0.A01.getDuration());
            } else if (awy instanceof C24899Avy) {
                C24899Avy avy = (C24899Avy) awy;
                String id3 = avy.getId();
                C13150hy.A01(id3, "id");
                C24871AvT avT2 = C24871AvT.INSTAGRAM;
                String str2 = avy.A01;
                if (str2 == null) {
                    C13150hy.A00();
                }
                C13150hy.A01(str2, "title!!");
                String str3 = avy.A00;
                if (str3 == null) {
                    C13150hy.A00();
                }
                C13150hy.A01(str3, "subtitle!!");
                avg = new C24881Ave(id3, avT2, str2, str3);
            } else if (awy instanceof C1177253r) {
                C1177253r r02 = (C1177253r) awy;
                C1177553u r7 = r02.A00;
                if (r7 != null) {
                    int i4 = r7.A01;
                    int i5 = r7.A00;
                    String str4 = r7.A02;
                    C13150hy.A01(str4, "thumbnailImage.mEncodedData");
                    String str5 = r7.A03;
                    C13150hy.A01(str5, "thumbnailImage.mType");
                    avv = new C24896Avv(i4, i5, str4, str5);
                } else {
                    avv = null;
                }
                String id4 = r02.getId();
                C13150hy.A01(id4, "id");
                avg = new C24883Avg(id4, C24871AvT.INSTAGRAM, avv, r02.A01);
            } else {
                throw new IllegalArgumentException("Unknown cowatch content type");
            }
            C24891Avp avp = new C24891Avp(num, avg, Long.valueOf(awJ2.A02));
            C13300iJ r1 = awJ2.A03;
            C13150hy.A01(r1, "state.mActor");
            r4.accept(new C24890Avo(avp, r1.AZn()));
            aw0.A00.A00 = awJ2;
        }
    }

    public Avs(AnonymousClass0C1 r2, C24922AwQ awQ) {
        this.A02 = r2;
        this.A05 = awQ;
    }
}
