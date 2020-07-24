package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.imageview.CornerPunchedImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.venue.Venue;
import com.instagram.reels.p008ui.badge.ReelBrandingBadgeView;
import com.instagram.reels.p008ui.views.ReelAvatarWithBadgeView;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;
import com.instagram.reels.viewer.common.ReelViewGroup;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1e0  reason: invalid class name and case insensitive filesystem */
public final class C34081e0 {
    public final C35021fg A00;
    public final AnonymousClass1I2 A01;

    public static void A01(Context context, C34421ei r5, boolean z, ReelViewerConfig reelViewerConfig) {
        if (z) {
            if (r5.A01 == null) {
                r5.A01 = (IgTextView) r5.A0L.inflate();
            }
            if (!reelViewerConfig.A08) {
                r5.A01.setClickable(true);
                r5.A01.setEnabled(true);
                r5.A01.setOnClickListener(new AnonymousClass6KR(r5));
                r5.A01.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C019000b.A03(context, C0003R.C0004drawable.badge_chevron), (Drawable) null);
            } else {
                r5.A01.setClickable(false);
                r5.A01.setEnabled(false);
                r5.A01.setOnClickListener((View.OnClickListener) null);
                r5.A01.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            r5.A01.setVisibility(0);
            r5.A01.post(r5.A12);
            return;
        }
        IgTextView igTextView = r5.A01;
        if (igTextView != null) {
            igTextView.setVisibility(8);
            r5.A01.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static final void A03(C34421ei r2, boolean z) {
        if (!z) {
            ReelBrandingBadgeView reelBrandingBadgeView = r2.A07;
            AnonymousClass0a4.A06(reelBrandingBadgeView);
            if (reelBrandingBadgeView.getVisibility() == 0) {
                return;
            }
        }
        r2.A07.setVisibility(0);
        r2.A07.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        r2.A07.animate().alpha(1.0f).setDuration(100).start();
    }

    public static boolean A04(C34421ei r2) {
        if (r2.A07 != null) {
            return false;
        }
        ReelBrandingBadgeView reelBrandingBadgeView = (ReelBrandingBadgeView) r2.A0K.inflate();
        r2.A07 = reelBrandingBadgeView;
        reelBrandingBadgeView.setBorderWidth(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        r2.A07.setTranslationYFactor(0.15f);
        r2.A07.setTranslationX((float) r2.A07.getContext().getResources().getDimensionPixelSize(C0003R.dimen.reel_viewer_branding_badge_translation_x));
        return true;
    }

    public C34081e0(C15550n9 r2, AnonymousClass1I2 r3) {
        this.A00 = new C35021fg(r2);
        this.A01 = r3;
    }

    public static View A00(Context context, ViewGroup viewGroup, AnonymousClass1PD r5, C38631la r6, AnonymousClass0C1 r7) {
        ViewGroup viewGroup2;
        LayoutInflater from = LayoutInflater.from(context);
        C34091e1 r0 = C34091e1.A04;
        if (r0 != null) {
            viewGroup2 = (ViewGroup) ((View) r0.A03.poll());
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 == null) {
            viewGroup2 = (ViewGroup) from.inflate(C0003R.layout.layout_reel_item, viewGroup, false);
        }
        C34421ei r1 = new C34421ei(viewGroup2, r7);
        r1.A10.setCornerRadius(0);
        if (r5 != null) {
            r1.A0c.setImageRenderer(r5);
        }
        if (r6 != null) {
            r1.A0c.setProgressiveImageConfig(r6);
        }
        viewGroup2.setTag(r1);
        return viewGroup2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x027e, code lost:
        if (r8 == p000X.Constants.A15) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0281, code lost:
        if (r1 != false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ae, code lost:
        if (r9 == p000X.Constants.A15) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0435, code lost:
        if (r4.A3J == false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0438, code lost:
        if (r1 != false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x047e, code lost:
        if (r7 == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0492, code lost:
        if (r7 == false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04b7, code lost:
        if (new p000X.C65442t6(p000X.C16180oA.A00(r3), p000X.C06190Oc.A00).A00(r9) == false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04c9, code lost:
        if (r7 == null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0508, code lost:
        if (r5.A0A.A0v == false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0136, code lost:
        if (r2.A0A.A0y != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015d, code lost:
        if (r2.A0A.A0v == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0e1d, code lost:
        r6.A08(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0190, code lost:
        if (p000X.AnonymousClass2E0.A00(r3).A02.contains(r0.A03.A0C()) == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0fbe, code lost:
        if (r1.A08.A0c(r3).A0r() == false) goto L_0x0fc0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x121e, code lost:
        if (r5 != null) goto L_0x0fce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x1233, code lost:
        if (r5.A0H() != false) goto L_0x1235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x1483, code lost:
        if (r1.A0o() != false) goto L_0x1485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x149d, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r3, p000X.AnonymousClass0L7.STORIES_MORE_OPTIONS_BUTTON, "is_in_header_for_viewer", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x149f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x15ad, code lost:
        if (r4 == p000X.AnonymousClass1OY.BOTTOM_SHEET_MAS_SONG_CLIPS) goto L_0x15af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e8, code lost:
        if (p000X.C65452t7.A02(r1) != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x1648, code lost:
        if (com.instagram.reels.p008ui.badge.ReelBrandingBadgeView.A00(r12) != false) goto L_0x164b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x16aa, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r3, p000X.AnonymousClass0L7.THREADS_STATUS_IN_IG, "stories_viewer_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x16ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0232, code lost:
        if (r4 == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0236, code lost:
        if (r7 != false) goto L_0x0239;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0fff  */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x100d  */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x1016  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x102b  */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x1034  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x103d  */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x1046  */
    /* JADX WARNING: Removed duplicated region for block: B:576:0x104d  */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x1054  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x105b  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x1062  */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x106b  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x1074  */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x107d  */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x1086  */
    /* JADX WARNING: Removed duplicated region for block: B:600:0x108f  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x1098  */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x10a9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x11d2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:695:0x13ce  */
    /* JADX WARNING: Removed duplicated region for block: B:700:0x13f3  */
    /* JADX WARNING: Removed duplicated region for block: B:715:0x1435  */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x1470 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:734:0x14a2  */
    /* JADX WARNING: Removed duplicated region for block: B:741:0x151c  */
    /* JADX WARNING: Removed duplicated region for block: B:743:0x1528  */
    /* JADX WARNING: Removed duplicated region for block: B:771:0x1602  */
    /* JADX WARNING: Removed duplicated region for block: B:779:0x1626  */
    /* JADX WARNING: Removed duplicated region for block: B:782:0x162f  */
    /* JADX WARNING: Removed duplicated region for block: B:794:0x166c  */
    /* JADX WARNING: Removed duplicated region for block: B:812:0x16db  */
    /* JADX WARNING: Removed duplicated region for block: B:814:0x16e7  */
    /* JADX WARNING: Removed duplicated region for block: B:830:0x171c  */
    /* JADX WARNING: Removed duplicated region for block: B:833:0x174f  */
    /* JADX WARNING: Removed duplicated region for block: B:843:0x17a0  */
    /* JADX WARNING: Removed duplicated region for block: B:847:0x17b1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:855:0x17e3  */
    /* JADX WARNING: Removed duplicated region for block: B:860:0x17f7  */
    /* JADX WARNING: Removed duplicated region for block: B:862:0x17fa  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022b  */
    public static void A02(C34081e0 r41, AnonymousClass0C1 r42, C34421ei r43, C50282Fr r44, C39941no r45, C64982sM r46, ReelViewerConfig reelViewerConfig, int i, int i2, boolean z, AnonymousClass2OC r51, C65002sO r52, AnonymousClass1OY r53, boolean z2, boolean z3, AnonymousClass0RN r56, AnonymousClass1OC r57, AnonymousClass1NR r58) {
        boolean z4;
        boolean z5;
        TextView textView;
        String name;
        String name2;
        String A06;
        int i3;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        ViewGroup viewGroup5;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        ViewGroup viewGroup8;
        TextView textView6;
        ViewGroup viewGroup9;
        ImageUrl A07;
        int i4;
        boolean z6;
        boolean z7;
        Drawable A03;
        Drawable drawable;
        boolean z8;
        boolean A04;
        boolean z9;
        View view;
        boolean z10;
        String A072;
        ImageUrl imageUrl;
        View view2;
        View view3;
        boolean z11;
        C44751wh r6;
        AnonymousClass7N0 r62;
        Integer num;
        C34151eA A002;
        C120835Ge r5;
        C34151eA r9;
        int i5;
        List A0W;
        boolean z12;
        View inflate;
        FrameLayout frameLayout;
        AnonymousClass2DG r54;
        String str;
        String name3;
        int i6;
        boolean z13;
        boolean z14;
        boolean z15;
        ImageView imageView;
        boolean z16;
        boolean z17;
        boolean z18;
        AnonymousClass7VB r92;
        boolean z19;
        boolean z20;
        Integer num2;
        AnonymousClass1NJ r4;
        AnonymousClass1NJ r47;
        LinearLayout linearLayout;
        boolean z21;
        int i7;
        int i8;
        String str2;
        boolean z22;
        Integer num3;
        long j;
        boolean z23;
        boolean z24;
        View.OnClickListener onClickListener;
        String str3;
        boolean z25;
        String str4;
        AnonymousClass1NJ r7;
        boolean z26;
        boolean z27;
        AnonymousClass7VB r48;
        boolean z28;
        AnonymousClass0RN r28 = r56;
        String moduleName = r28.getModuleName();
        C34421ei r0 = r43;
        r0.A0A = z2;
        r0.A0D.setVisibility(4);
        r0.A0N.setVisibility(8);
        r0.A0J.setVisibility(8);
        C50282Fr r2 = r44;
        r0.A03 = r2;
        AnonymousClass2OC r38 = r51;
        AnonymousClass2OC r1 = r38;
        r0.A09 = r1;
        ReelViewGroup reelViewGroup = r0.A0z;
        AnonymousClass0C1 r3 = r42;
        reelViewGroup.setListener(r1, r3);
        reelViewGroup.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (List) null, r3);
        AnonymousClass1OY r40 = r53;
        r0.A04 = r40;
        r0.A0i.A02.A02(8);
        r0.A0b.A02.A02(8);
        r0.A0j.A02.A02(8);
        r0.A0k.A02.A02(8);
        r0.A0l.A05.A02(8);
        r0.A0m.A02.A02(8);
        r0.A0u.A02.A02(8);
        r0.A0v.A0w.A02.A02(8);
        ViewGroup viewGroup10 = r0.A0g.A05;
        if (viewGroup10 != null) {
            viewGroup10.setVisibility(8);
        }
        r0.A0d.A00.setVisibility(8);
        ImageView imageView2 = r0.A0r.A00;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        r0.A0s.A09.A02(8);
        r0.A0n.A08.A02(8);
        View view4 = r0.A0t.A00;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        r0.A0p.A00();
        ImageView imageView3 = r0.A00;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        IgTextView igTextView = r0.A01;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        C64982sM r49 = r0.A06;
        C64982sM r422 = r46;
        if (!(r49 == null || r49 == r422)) {
            r49.A05(r0);
        }
        C64972sL.A06(r0, r2, r0.A0c.getContext(), true);
        C26571Ea r55 = r0.A0a;
        int i9 = 8;
        if (AnonymousClass1CF.A00(r3).AYV().A01("ig_zero_rating_data_banner")) {
            i9 = 0;
        }
        r55.A02(i9);
        C34081e0 r432 = r41;
        AnonymousClass1I2 r39 = r432.A01;
        C39941no r12 = r45;
        C39941no r29 = r12;
        ReelViewerConfig reelViewerConfig2 = reelViewerConfig;
        boolean z29 = z;
        if (r12.A0D == null) {
            view = r0.A0E;
        } else {
            r0.A0E.setVisibility(0);
            AnonymousClass1OY r26 = r40;
            Resources resources = r0.A0P.getResources();
            C249916w A0B = r0.A03.A0B();
            boolean z30 = true;
            if (A0B.AZG() == Constants.ONE && r12.A0D.equals(A0B.AZf()) && r12.A0t()) {
                z4 = true;
            }
            z4 = false;
            Reel reel = r2.A0A;
            if (!reel.A0a() || (A06 = reel.A0a) == null) {
                if (reel.A0V()) {
                    r0.A0P.setText(C15960no.A02((double) r12.A03(), (double) (System.currentTimeMillis() / 1000)));
                } else {
                    if (z4) {
                        textView = r0.A0P;
                        name = C30671Ut.A0B(r3, r12.A08);
                    } else if (r12.A0k()) {
                        AttributedAREffect attributedAREffect = r12.A00;
                        A06 = attributedAREffect != null ? attributedAREffect.A06() : null;
                    } else {
                        C50282Fr r59 = r0.A03;
                        if (!(r59.A0B() instanceof C44351w1)) {
                            z5 = false;
                        }
                        z5 = true;
                        if (z5) {
                            TextView textView7 = r0.A0P;
                            C39941no r21 = r12;
                            AnonymousClass1OY r23 = r40;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            C50282Fr r63 = r0.A03;
                            C249916w A0B2 = r63.A0B();
                            Context context = r0.A0P.getContext();
                            Integer AZG = A0B2.AZG();
                            if (AZG == Constants.A14) {
                                name2 = context.getString(C0003R.string.story_mentions_header_title);
                            } else if (AZG == Constants.A15) {
                                name2 = r63.A0A.A0a;
                            } else if (r63.A0H()) {
                                name2 = C96054Dq.A00(context, (C51242Jv) A0B2);
                            } else {
                                name2 = A0B2.getName();
                                if (name2 != null && C06360Ot.A00(name2) >= 25) {
                                    name2 = AnonymousClass000.A0E(name2.substring(0, 25), context.getString(C0003R.string.ellipses));
                                }
                            }
                            if (name2 != null) {
                                spannableStringBuilder.append(name2);
                            }
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append(" • ");
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), length, spannableStringBuilder.length(), 0);
                            spannableStringBuilder.append(r12.A0D.AZn());
                            C34421ei r20 = r0;
                            AnonymousClass6KO r19 = new AnonymousClass6KO(r20, r21, A0B2);
                            AnonymousClass6KQ r192 = new AnonymousClass6KQ(r20, r21);
                            if (name2 != null) {
                                int length2 = name2.length();
                                spannableStringBuilder.setSpan(r19, 0, length2, 33);
                                spannableStringBuilder.setSpan(r192, length2, spannableStringBuilder.length(), 33);
                            }
                            if (r12.A0D.A0s() && r23.A01()) {
                                C466820l.A02(r0.A0P.getContext(), spannableStringBuilder, false);
                            }
                            textView7.setText(spannableStringBuilder);
                            r0.A0P.setHighlightColor(0);
                            r0.A0P.setMovementMethod(LinkMovementMethod.getInstance());
                        } else {
                            textView = r0.A0P;
                            name = A0B.getName();
                        }
                    }
                    textView.setText(name);
                }
                if (A0B.AZG() != Constants.ONE || !A0B.AZf().A0s() || !r26.A01()) {
                    z30 = false;
                }
                C466820l.A07(r0.A0P, z30, 0, resources.getDimensionPixelSize(C0003R.dimen.reel_username_right_offset), -1);
                TextView textView8 = r0.A0O;
                int i10 = C0003R.dimen.reel_timestamp_left_offset;
                if (z30) {
                    i10 = C0003R.dimen.reel_timestamp_left_offset_verified;
                }
                C06220Of.A0M(textView8, resources.getDimensionPixelSize(i10));
                if (!r12.A05) {
                    r0.A0H.setOnClickListener((View.OnClickListener) null);
                } else {
                    r0.A0H.setOnClickListener(new AnonymousClass2g9(r38, r0, r12));
                }
                i3 = r0.A0B;
                if (i3 > 0) {
                    C06220Of.A0L(r0.A0H, i3);
                }
                Context context2 = r0.A0E.getContext();
                C34631f3 r510 = r0.A0y;
                viewGroup = r510.A08.A00;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                viewGroup2 = r510.A05.A00;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                viewGroup3 = r510.A06.A00;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                }
                viewGroup4 = r510.A07.A01;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                }
                textView2 = r510.A01;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3 = r510.A02;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                textView4 = r510.A03;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                textView5 = r510.A00;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                viewGroup5 = r510.A0F.A00;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(8);
                }
                viewGroup6 = r510.A09.A00;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(8);
                }
                viewGroup7 = r510.A0B.A00;
                if (viewGroup7 != null) {
                    viewGroup7.setVisibility(8);
                }
                viewGroup8 = r510.A0E.A00;
                if (viewGroup8 != null) {
                    viewGroup8.setVisibility(8);
                }
                textView6 = r510.A0C.A00;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                viewGroup9 = r510.A0D.A00;
                if (viewGroup9 != null) {
                    viewGroup9.setVisibility(8);
                }
                C65142sc.A00(r510);
                r510.A0A.A01();
                if (!r12.A0s()) {
                    ArrayList<C65162se> arrayList = new ArrayList<>();
                    AnonymousClass0C1 r202 = r3;
                    C34631f3 r212 = r510;
                    C65152sd r18 = new C65152sd(context2, r202, r212, r12, r38, r40, r2, r28);
                    if (r18.A0A()) {
                        arrayList = new ArrayList<>(Arrays.asList(new C65152sd[]{r18}));
                    } else {
                        AnonymousClass0RN r14 = r28;
                        arrayList.add(new C65192sh(r3, r510, r12, r14));
                        AnonymousClass2OC r22 = r38;
                        AnonymousClass0RN r24 = r14;
                        arrayList.add(new C65202si(context2, r202, r212, r22, r2, r24));
                        C34631f3 r203 = r510;
                        C39941no r213 = r12;
                        AnonymousClass0C1 r232 = r3;
                        arrayList.add(new C65212sj(context2, r203, r213, r22, r232, r24));
                        arrayList.add(new C65222sk(context2, r203, r213, r22, r232, r24));
                        AnonymousClass0C1 r204 = r3;
                        C34631f3 r214 = r510;
                        arrayList.add(new C65232sl(context2, r204, r214, r12, r38, r24));
                        arrayList.add(new C65242sm(context2, r204, r214, r38, r40, r2, r14));
                        arrayList.add(new C65252sn(context2, r510, r38, r12, r3, r14));
                        arrayList.add(new C65262so(r3, context2, r12, r12.A08, r38, r510.A05, r510.A0A, r28));
                        AnonymousClass0C1 r205 = r3;
                        C34631f3 r215 = r510;
                        C39941no r222 = r12;
                        AnonymousClass0RN r233 = r14;
                        arrayList.add(new C65272sp(context2, r205, r215, r222, r233));
                        arrayList.add(new C65172sf(context2, r205, r215, r222, r233));
                        AnonymousClass0RN r242 = r14;
                        arrayList.add(new C65282sq(context2, r205, r215, r222, r38, r242));
                        arrayList.add(new C65182sg(context2, r510.A0E, r38, r222, r3, r242));
                        arrayList.add(new C65292sr(context2, r3, r510, r12, r28));
                    }
                    List list = reelViewerConfig2.A06;
                    ArrayList<C65162se> arrayList2 = new ArrayList<>();
                    for (C65162se r64 : arrayList) {
                        if (r64.A0A()) {
                            arrayList2.add(r64);
                        }
                    }
                    boolean z31 = false;
                    int i11 = 0;
                    for (C65162se A032 : arrayList2) {
                        i11 += A032.A03();
                    }
                    if (i11 >= 2) {
                        z31 = true;
                    }
                    if (z31) {
                        ArrayList arrayList3 = new ArrayList();
                        for (C65162se r65 : arrayList2) {
                            try {
                                arrayList3.addAll(r65.A07());
                            } catch (NullPointerException unused) {
                                throw new NullPointerException(r65.getClass().getSimpleName());
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (list.contains(((C65162se) it.next()).A04())) {
                                it.remove();
                            }
                        }
                        r510.A0A.setOnClickListener(new AnonymousClass4WJ(r38, arrayList2, r12));
                        r510.A0A.A02(arrayList3);
                    } else if (!arrayList2.isEmpty()) {
                        C65162se r410 = (C65162se) arrayList2.get(0);
                        try {
                            r410.A07();
                            if (list.contains(r410.A04())) {
                                C65142sc.A00(r510);
                            }
                        } catch (NullPointerException unused2) {
                            throw new NullPointerException(r410.getClass().getSimpleName());
                        }
                    }
                    View view5 = r510.A04;
                    CyclingFrameLayout cyclingFrameLayout = r510.A0A;
                    Rect rect = new Rect();
                    Resources resources2 = cyclingFrameLayout.getResources();
                    r510.A04.post(new C65332sv(cyclingFrameLayout, rect, view5, resources2.getDimensionPixelSize(C0003R.dimen.reel_attribution_touch_delegate_top), resources2.getDimensionPixelSize(C0003R.dimen.reel_attribution_touch_delegate_bottom), resources2.getDimensionPixelSize(C0003R.dimen.reel_attribution_touch_delegate_left_right_offset)));
                }
                if (r0.A0B > 0) {
                    View view6 = r0.A0y.A04;
                    C06220Of.A0L(view6, (int) (view6.getContext().getResources().getDimension(C0003R.dimen.reel_attribution_bottom_padding) - ((float) r0.A0B)));
                }
                if (!r29.A0k() || r0.A0U == null) {
                    C249916w A0B3 = r0.A03.A0B();
                    if (r2.A0H()) {
                        Resources resources3 = r0.A0h.getContext().getResources();
                        Pair A062 = r2.A06(r3, r12);
                        ReelAvatarWithBadgeView reelAvatarWithBadgeView = r0.A0h;
                        int dimensionPixelSize = resources3.getDimensionPixelSize(C0003R.dimen.reel_viewer_double_avatar_head_size);
                        int dimensionPixelSize2 = resources3.getDimensionPixelSize(C0003R.dimen.reel_viewer_front_avatar_margin_start);
                        String str5 = r40.A00;
                        CornerPunchedImageView cornerPunchedImageView = reelAvatarWithBadgeView.A01;
                        cornerPunchedImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        C06220Of.A0R(cornerPunchedImageView, dimensionPixelSize2);
                        C06220Of.A0S(cornerPunchedImageView, dimensionPixelSize2);
                        reelAvatarWithBadgeView.setDoubleAvatarUrlsAndVisibility((ImageUrl) A062.first, (ImageUrl) A062.second, str5);
                        r0.A0h.setOnClickListener(new AnonymousClass6KM(r38, r0, r12));
                        int i12 = r0.A0B;
                        if (i12 > 0) {
                            C06220Of.A0L(r0.A0G, i12);
                            r0.A0G.setOnClickListener(new AnonymousClass6KN(r38, r0, r12));
                        }
                    } else {
                        C13300iJ r511 = r12.A0D;
                        if (r511 != null) {
                            AnonymousClass1OY r411 = r40;
                            if (!(r411 == AnonymousClass1OY.EXPLORE_CLIPS || r411 == AnonymousClass1OY.BOTTOM_SHEET_TOP_CLIPS || r411 == AnonymousClass1OY.BOTTOM_SHEET_MAS_MUSIC || r411 == AnonymousClass1OY.BOTTOM_SHEET_MAS_ORIGINAL_SOUND_CLIPS)) {
                                z8 = false;
                            }
                            z8 = true;
                            if (z8 || r411 == AnonymousClass1OY.REEL_BOTTOM_SHEET_AGGREGATE_STORIES) {
                                A07 = r511.ASv();
                                ReelAvatarWithBadgeView reelAvatarWithBadgeView2 = r0.A0h;
                                String str6 = r40.A00;
                                reelAvatarWithBadgeView2.A01.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                reelAvatarWithBadgeView2.setSingleAvatarUrlAndVisibility(A07, str6);
                                if (z && ((Boolean) AnonymousClass0L6.A02(r3, AnonymousClass0L7.STORIES_ADD_TO_STORY_FROM_SELF_VIEWER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                    ReelAvatarWithBadgeView reelAvatarWithBadgeView3 = r0.A0h;
                                    Context context3 = reelAvatarWithBadgeView3.getContext();
                                    A03 = C019000b.A03(context3, C0003R.C0004drawable.empty_story_badge);
                                    int dimensionPixelSize3 = context3.getResources().getDimensionPixelSize(C0003R.dimen.reel_viewer_branding_badge_size);
                                    drawable = reelAvatarWithBadgeView3.A00;
                                    if (drawable != A03) {
                                        if (drawable != null) {
                                            drawable.setCallback((Drawable.Callback) null);
                                        }
                                        reelAvatarWithBadgeView3.A00 = A03;
                                        if (A03 != null) {
                                            CornerPunchedImageView cornerPunchedImageView2 = reelAvatarWithBadgeView3.A01;
                                            cornerPunchedImageView2.A00 = true;
                                            cornerPunchedImageView2.invalidate();
                                            reelAvatarWithBadgeView3.A00.setCallback(reelAvatarWithBadgeView3);
                                            reelAvatarWithBadgeView3.A00.setBounds(0, 0, dimensionPixelSize3, dimensionPixelSize3);
                                        } else {
                                            CornerPunchedImageView cornerPunchedImageView3 = reelAvatarWithBadgeView3.A01;
                                            cornerPunchedImageView3.A00 = false;
                                            cornerPunchedImageView3.invalidate();
                                        }
                                        reelAvatarWithBadgeView3.invalidate();
                                    }
                                }
                                if (!r12.A05) {
                                    r0.A0h.setOnClickListener((View.OnClickListener) null);
                                } else {
                                    r0.A0h.setOnClickListener(new C65342sw(r38, r0, r12));
                                }
                                i4 = r0.A0B;
                                if (i4 > 0) {
                                    C06220Of.A0L(r0.A0G, i4);
                                    if (r12.A05) {
                                        r0.A0G.setOnClickListener((View.OnClickListener) null);
                                    } else {
                                        r0.A0G.setOnClickListener(new AnonymousClass6KP(r38, r0, r12));
                                    }
                                }
                                if (!z && !r0.A0A) {
                                    z6 = true;
                                }
                                z6 = false;
                                if (z6) {
                                    boolean A042 = A04(r0);
                                    r0.A07.A02(A0B3.AH7());
                                    A03(r0, A042);
                                } else {
                                    C31571Yv r412 = r2.A03;
                                    if (r412 != null && !r412.A04.isEmpty()) {
                                        z7 = true;
                                    }
                                    z7 = false;
                                    if (z7) {
                                        boolean A043 = A04(r0);
                                        ReelBrandingBadgeView reelBrandingBadgeView = r0.A07;
                                        if (r0.A08 == null) {
                                            r0.A08 = new AnonymousClass420(r39, reelBrandingBadgeView);
                                        }
                                        r0.A08.A00.A03(r2.A03);
                                        A03(r0, A043);
                                    } else {
                                        ReelBrandingBadgeView reelBrandingBadgeView2 = r0.A07;
                                        if (reelBrandingBadgeView2 != null) {
                                            reelBrandingBadgeView2.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                        A07 = r2.A07(r3);
                        ReelAvatarWithBadgeView reelAvatarWithBadgeView22 = r0.A0h;
                        String str62 = r40.A00;
                        reelAvatarWithBadgeView22.A01.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        reelAvatarWithBadgeView22.setSingleAvatarUrlAndVisibility(A07, str62);
                        ReelAvatarWithBadgeView reelAvatarWithBadgeView32 = r0.A0h;
                        Context context32 = reelAvatarWithBadgeView32.getContext();
                        A03 = C019000b.A03(context32, C0003R.C0004drawable.empty_story_badge);
                        int dimensionPixelSize32 = context32.getResources().getDimensionPixelSize(C0003R.dimen.reel_viewer_branding_badge_size);
                        drawable = reelAvatarWithBadgeView32.A00;
                        if (drawable != A03) {
                        }
                        if (!r12.A05) {
                        }
                        i4 = r0.A0B;
                        if (i4 > 0) {
                        }
                        z6 = true;
                    }
                } else {
                    AttributedAREffect attributedAREffect2 = r12.A00;
                    if (attributedAREffect2 != null) {
                        imageUrl = attributedAREffect2.A03();
                    } else {
                        imageUrl = null;
                    }
                    if (imageUrl != null) {
                        r0.A0h.setVisibility(8);
                        r0.A0U.setVisibility(0);
                        r0.A0U.setUrl(imageUrl, r40.A00);
                    }
                }
                if (r12.A0s() || r12.A05 || r12.A0k() || r2.A0A.A0f() || Constants.ZERO.equals(r12.A02)) {
                    r0.A0O.setVisibility(8);
                } else {
                    C50282Fr r512 = r0.A03;
                    if (r512.A0A.A0V()) {
                        A072 = DateFormat.getTimeInstance(3).format(Long.valueOf(r12.A03() * 1000));
                    } else if (r512.A0I()) {
                        A072 = C15960no.A06(r0.A0O.getContext(), r12.A03());
                    } else {
                        A072 = C15960no.A07(r0.A0O.getContext().getResources(), (double) r12.A03());
                        if (r12.A03() < (System.currentTimeMillis() / 1000) - 86400) {
                            AnonymousClass0QD.A01("ReelViewerItemBinder#timestamp", "Old story media displayed. Formatted ts: " + A072 + ", taken at ts: " + r12.A03() + ", is own story: " + r2.A0A.A0x);
                        }
                    }
                    r0.A0O.setText(A072);
                    r0.A0O.setVisibility(0);
                }
                A04 = C65352sx.A04(r3, r2, r12);
                if (C65352sx.A01(r0.A0c.getContext(), r12, reelViewerConfig2, A04)) {
                    if (!A04 && !r12.A0k() && !r12.A0n()) {
                        z10 = false;
                    }
                    z10 = true;
                    if (!z10) {
                        z9 = true;
                    }
                }
                z9 = false;
                if (!z9) {
                    r0.A0F.setOnClickListener(new C104334f1(r38, r2, r12));
                    r0.A0F.setVisibility(0);
                    r0.A0S.setAspectRatio(-1.0f);
                    view2 = r0.A0w.A00;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    view3 = r0.A0x.A00;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    AnonymousClass1NJ r413 = r12.A08;
                    if (r413 != null && !r3.A06.equals(r413.A0c(r3))) {
                        z11 = true;
                    }
                    z11 = false;
                    if (r12.A0s()) {
                        C64982sM r66 = r422;
                        r0.A02 = null;
                        r0.A06 = null;
                        r0.A0c.setVisibility(0);
                        r0.A0c.A03();
                        if (r2.A0J(r3)) {
                            z28 = true;
                        }
                        z28 = false;
                        if (z28) {
                            r66.A04(r0);
                            r0.A11.setSegments(1);
                            r0.A11.A04(0, false);
                            r0.A11.setVisibility(0);
                        } else {
                            r0.A11.setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                            r0.A11.setVisibility(8);
                        }
                    } else {
                        int i13 = i;
                        int i14 = i2;
                        if (r12.A0m()) {
                            C64982sM r414 = r422;
                            ReelViewerConfig reelViewerConfig3 = reelViewerConfig2;
                            r0.A02 = r12;
                            r414.A04(r0);
                            r0.A06 = r414;
                            r0.A0c.A03();
                            boolean z32 = false;
                            r0.A0c.setVisibility(0);
                            Context context4 = r0.A0c.getContext();
                            if (r12.A0A() == C37171jE.CLOSE_FRIENDS) {
                                z32 = true;
                            }
                            A01(context4, r0, z32, reelViewerConfig3);
                            C65422t4.A00(r0.A0q, r12, (C65002sO) null);
                        } else {
                            ReelViewerConfig reelViewerConfig4 = reelViewerConfig2;
                            AnonymousClass1NJ r415 = r12.A08;
                            if (r415 != null && r415.A3Q && !r422.A0S) {
                                C64982sM r416 = r422;
                                r416.A0T = true;
                                r416.A04(r0);
                                C64982sM r122 = r416;
                                boolean equals = r12.equals(r0.A02);
                                r0.A02 = r12;
                                r0.A06 = r122;
                                IgProgressImageView igProgressImageView = r0.A0c;
                                Context context5 = igProgressImageView.getContext();
                                C34501eq r93 = r0.A0w;
                                AnonymousClass1NJ r8 = r12.A08;
                                C38091ki r72 = r8.A0N;
                                r93.A00();
                                if (!equals || (r8.A0N.A00 == C49042Am.MISINFORMATION && r122.A0T)) {
                                    igProgressImageView.setVisibility(0);
                                    i6 = 0;
                                    Context context6 = context5;
                                    C34501eq r193 = r93;
                                    IgProgressImageView igProgressImageView2 = igProgressImageView;
                                    C158266pL.A01(context6, r193, r12, r122, r72, r38, igProgressImageView2, AnonymousClass12C.A01(r8.A26), moduleName);
                                    C49042Am r67 = r72.A00;
                                    if (r67 == C49042Am.SENSITIVE) {
                                        C158266pL.A00(context6, r193, r72, r12, r122, r8, r38, igProgressImageView);
                                    } else if (r67 == C49042Am.MISINFORMATION) {
                                        r93.A07.A02(0);
                                        r93.A08.A02(0);
                                        r93.A04.setText(r72.A01);
                                        r93.A03.setText((CharSequence) r72.A05.get(0));
                                        r93.A02.setImageDrawable(C019000b.A03(context5, C0003R.C0004drawable.instagram_news_off_outline_32));
                                        r93.A02.getDrawable().setColorFilter(C38091ki.A07);
                                        r93.A04.setOnClickListener(new AnonymousClass88U(r38, r8, r12));
                                        r93.A03.setOnClickListener(new C29297CvS(r38, r8, r12, context5, r122, igProgressImageView2));
                                    }
                                } else {
                                    r38.BW3(true, r12, r122);
                                    i6 = 0;
                                }
                                r38.BW1(r12);
                                r93.A00.setVisibility(i6);
                            } else if (z11) {
                                C13300iJ r11 = r3.A06;
                                String str7 = moduleName;
                                C34511er r10 = r0.A0x;
                                Context context7 = r0.A0c.getContext();
                                if (r10.A00 == null) {
                                    View inflate2 = r10.A01.inflate();
                                    r10.A00 = inflate2;
                                    r10.A04 = (TextView) inflate2.findViewById(C0003R.C0005id.story_interstitial_title);
                                    r10.A03 = (TextView) r10.A00.findViewById(C0003R.C0005id.story_interstitial_subtitle);
                                    r10.A05 = (IgImageView) r10.A00.findViewById(C0003R.C0005id.story_interstitial_center_profile);
                                    r10.A02 = (TextView) r10.A00.findViewById(C0003R.C0005id.story_interstitial_cta_button);
                                }
                                ImageUrl ASv = r11.ASv();
                                if (ASv != null) {
                                    r10.A05.setUrl(ASv, str7);
                                } else {
                                    r10.A05.setImageDrawable(C019000b.A03(context7, C0003R.C0004drawable.profile_anonymous_user));
                                }
                                TextView textView9 = r10.A04;
                                String str8 = "";
                                if (context7 != null) {
                                    str = context7.getString(C0003R.string.reel_view_story_intersitial_title, new Object[]{r11.AZn()});
                                } else {
                                    str = str8;
                                }
                                textView9.setText(str);
                                C249916w A0B4 = r0.A03.A0B();
                                if (A0B4 == null) {
                                    name3 = "The story owner";
                                } else {
                                    name3 = A0B4.getName();
                                }
                                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("<b>%s</b>", (Object) name3);
                                if (context7 != null) {
                                    str8 = context7.getString(C0003R.string.reel_view_story_intersitial_subtitle);
                                }
                                r10.A03.setText(C46031z1.A02(new C114644wF(formatStrLocaleSafe.concat(AnonymousClass000.A0E(" ", str8))), new String[0]));
                                r10.A02.setText(C0003R.string.reel_view_story_intersitial_cta_button);
                                r10.A02.setOnClickListener(new C104454fD(r38, r2));
                                r10.A00.setVisibility(0);
                            } else {
                                C64982sM r32 = r422;
                                String str9 = moduleName;
                                r0.A0c.A05.clearColorFilter();
                                boolean equals2 = r12.equals(r0.A02);
                                r0.A02 = r12;
                                C64982sM r68 = r32;
                                r68.A04(r0);
                                r0.A06 = r68;
                                Context context8 = r0.A0c.getContext();
                                boolean z33 = false;
                                if (r12.A0A() == C37171jE.CLOSE_FRIENDS) {
                                    z33 = true;
                                }
                                A01(context8, r0, z33, reelViewerConfig4);
                                r12.A0A();
                                if (!r32.A0P) {
                                    r0.A0c.setVisibility(0);
                                    if (!equals2 || r32.A0T) {
                                        r32.A0O = false;
                                        IgProgressImageView igProgressImageView3 = r0.A0c;
                                        igProgressImageView3.setMiniPreviewPayload(r12.A0M());
                                        igProgressImageView3.A05(C0003R.C0005id.listener_id_for_reel_image_load, new C58572gB(r432, r12, r3, str9, r32, r38));
                                        if (r12.A0t()) {
                                            C65362sy.A04(r3, r12.A08, str9);
                                        }
                                        if (r12.A0t() && r12.A08.A1M()) {
                                            r0.A0c.setUrl(r12.A08.A0E.toString(), str9);
                                        } else if (r12.A0t()) {
                                            r0.A0c.setUrlWithFallback(r12.A06(context8), r12.A04(), str9);
                                        } else {
                                            r0.A0c.setUrl(r12.A06(context8), str9);
                                        }
                                    } else {
                                        r38.BW3(true, r12, r32);
                                    }
                                }
                                r38.BW1(r12);
                                r0.A0z.A01(r12.A00(), r12.A0U(), r3);
                                C65002sO r15 = r52;
                                if (r12.A0t()) {
                                    C65372sz.A00(r0.A0p, r12.A0W(C34181eD.MUSIC_OVERLAY), r12.A00());
                                    C34891fT r82 = r0.A0r;
                                    C65002sO r94 = r15;
                                    C34151eA A003 = C65392t1.A00(r12);
                                    C34151eA A004 = C65392t1.A00(r12);
                                    if (A004 == null) {
                                        r6 = null;
                                    } else {
                                        r6 = A004.A0T;
                                    }
                                    if (A003 == null || r6 == null || !r6.A08) {
                                        ImageView imageView4 = r82.A00;
                                        if (imageView4 != null) {
                                            imageView4.setVisibility(8);
                                        }
                                    } else {
                                        if (r82.A00 == null) {
                                            r82.A00 = (ImageView) r82.A01.inflate();
                                        }
                                        r82.A00.setVisibility(0);
                                        C57392e7 r513 = new C57392e7(r82.A00.getContext());
                                        r513.A08(r6);
                                        r82.A00.setImageDrawable(r513);
                                        r82.A00.setOnClickListener(new C169567Mt(r15, r12, r6));
                                        C06220Of.A0c(r82.A00, new AnonymousClass7SC(r82, r12, A003));
                                    }
                                    C34851fP r514 = r0.A0g;
                                    AnonymousClass1NJ r417 = r12.A08;
                                    List A0W2 = r12.A0W(C34181eD.POLLING);
                                    float A005 = r12.A00();
                                    String id = r2.A0B().getId();
                                    AnonymousClass0a4.A06(id);
                                    C65402t2.A01(r514, r12, r417, A0W2, r94, A005, r3, id, (C64982sM) null);
                                    C35021fg r13 = r432.A00;
                                    C34881fS r102 = r0.A0d;
                                    boolean z34 = r0.A0A;
                                    List<C34151eA> A15 = r12.A08.A15();
                                    if (!A15.isEmpty()) {
                                        r102.A00.setVisibility(0);
                                        int i15 = 0;
                                        for (C34151eA r73 : A15) {
                                            if (r73.A0Q == C34181eD.BLOKS) {
                                                if (r102.A00.getChildCount() > i15) {
                                                    frameLayout = (FrameLayout) r102.A00.getChildAt(i15);
                                                } else {
                                                    frameLayout = new FrameLayout(r102.A00.getContext());
                                                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                    r102.A00.addView(frameLayout);
                                                }
                                                i15++;
                                                if (z34) {
                                                    C51282Jz r418 = r73.A0A;
                                                    if (r418 != null) {
                                                        if (r73.A08 == null) {
                                                            r73.A08 = C15500n4.A00().A04((AnonymousClass2DA) r418.A00);
                                                        }
                                                        r54 = r73.A08;
                                                    }
                                                    r54 = null;
                                                } else {
                                                    C51282Jz r419 = r73.A09;
                                                    if (r419 != null) {
                                                        if (r73.A07 == null) {
                                                            r73.A07 = C15500n4.A00().A04((AnonymousClass2DA) r419.A00);
                                                        }
                                                        r54 = r73.A07;
                                                    }
                                                    r54 = null;
                                                }
                                                View view7 = r54.A02.getView();
                                                if (!(view7 == null || view7.getParent() == null || view7.getParent() == frameLayout)) {
                                                    C15500n4.A00();
                                                    C15500n4.A02((FrameLayout) view7.getParent());
                                                }
                                                C15500n4.A00().A05(r13.A00, r54, frameLayout);
                                                View childAt = frameLayout.getChildAt(0);
                                                C06220Of.A0d(childAt, new AnonymousClass7RY(r13, r73, r102, r12, childAt, frameLayout));
                                            }
                                        }
                                        for (int childCount = r102.A00.getChildCount() - 1; childCount > i15; childCount--) {
                                            C15500n4.A00();
                                            C15500n4.A02((FrameLayout) r102.A00.getChildAt(childCount));
                                            r102.A00.removeViewAt(childCount);
                                        }
                                    }
                                    C34901fU r95 = r0.A0s;
                                    C34151eA A006 = C65382t0.A00(r12.A0U(), C34181eD.QUIZ);
                                    AnonymousClass2ET A007 = C65412t3.A00(r12);
                                    if (A006 == null || A007 == null) {
                                        r95.A09.A02(8);
                                    } else {
                                        AnonymousClass1Ep A008 = AnonymousClass1Ep.A00(r3);
                                        Iterator it2 = A008.A04().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                if (((String) it2.next()).contains(AnonymousClass000.A0J("_", A007.A06, "_"))) {
                                                    z12 = true;
                                                    break;
                                                }
                                            } else {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                        if (r95.A01 == null) {
                                            View A012 = r95.A09.A01();
                                            r95.A01 = A012;
                                            TextView textView10 = (TextView) A012.findViewById(C0003R.C0005id.quiz_sticker_question);
                                            r95.A03 = textView10;
                                            C61722mI.A01(textView10);
                                            r95.A02 = (LinearLayout) r95.A01.findViewById(C0003R.C0005id.quiz_sticker_answer_list);
                                        }
                                        r95.A09.A02(0);
                                        r95.A04 = r12;
                                        r95.A05 = A007;
                                        r95.A06 = r15;
                                        int i16 = A007.A01;
                                        boolean z35 = false;
                                        if (i16 != -1) {
                                            z35 = true;
                                        }
                                        if (!z35) {
                                            if (z12) {
                                                Iterator it3 = A008.A04().iterator();
                                                while (it3.hasNext()) {
                                                    String str10 = (String) it3.next();
                                                    if (str10.contains(AnonymousClass000.A0J("_", A007.A06, "_"))) {
                                                        A008.A03(str10);
                                                    }
                                                }
                                            }
                                            i16 = -1;
                                        }
                                        r95.A00 = i16;
                                        r95.A03.setText(r95.A05.A07);
                                        r95.A03.setTextColor(AnonymousClass0OW.A0A(r95.A05.A08, -1));
                                        int[] iArr = {AnonymousClass0OW.A0A(r95.A05.A05, -14277082), AnonymousClass0OW.A0A(r95.A05.A04, -14277082)};
                                        ((GradientDrawable) r95.A03.getBackground().mutate()).setColors(iArr);
                                        List list2 = r95.A05.A0A;
                                        LayoutInflater from = LayoutInflater.from(r95.A02.getContext());
                                        ArrayList arrayList4 = new ArrayList();
                                        for (int i17 = 0; i17 < r95.A02.getChildCount(); i17++) {
                                            arrayList4.add(r95.A02.getChildAt(i17));
                                        }
                                        r95.A02.removeAllViews();
                                        r95.A08.clear();
                                        for (int i18 = 0; i18 < list2.size(); i18++) {
                                            if (!arrayList4.isEmpty()) {
                                                inflate = (View) arrayList4.remove(0);
                                            } else {
                                                inflate = from.inflate(C0003R.layout.quiz_sticker_response_composer_answer_row, r95.A02, false);
                                            }
                                            r95.A08.add(new AnonymousClass7NO(inflate, (AnonymousClass2EV) list2.get(i18), i18, iArr, r95.A07));
                                            r95.A02.addView(inflate);
                                        }
                                        if (r95.A00 != -1) {
                                            for (int i19 = 0; i19 < r95.A08.size(); i19++) {
                                                AnonymousClass7NO r74 = (AnonymousClass7NO) r95.A08.get(i19);
                                                boolean z36 = false;
                                                if (i19 == r95.A00) {
                                                    z36 = true;
                                                }
                                                boolean z37 = false;
                                                if (i19 == r95.A05.A00) {
                                                    z37 = true;
                                                }
                                                r74.A02(z36, z37);
                                                if (i19 == r95.A05.A00) {
                                                    r74.A01(false);
                                                }
                                            }
                                        }
                                        View A013 = r95.A09.A01();
                                        C06220Of.A0c(A013, new AnonymousClass7SD(r95, A013, A006, (ViewGroup) A013.getParent()));
                                    }
                                    C34921fW r83 = r0.A0n;
                                    C34151eA A009 = C65382t0.A00(r12.A0U(), C34181eD.GROUP_POLL);
                                    C34151eA A0010 = C65382t0.A00(r12.A0U(), C34181eD.GROUP_POLL);
                                    if (A0010 != null) {
                                        r62 = A0010.A0P;
                                    } else {
                                        r62 = null;
                                    }
                                    if (A009 == null || r62 == null) {
                                        r83.A08.A02(8);
                                    } else {
                                        if (r83.A01 == null) {
                                            View A014 = r83.A08.A01();
                                            r83.A01 = A014;
                                            r83.A02 = (LinearLayout) A014.findViewById(C0003R.C0005id.group_poll_answer_list);
                                        }
                                        r83.A08.A02(0);
                                        r83.A03 = r12;
                                        r83.A04 = r62;
                                        r83.A05 = r15;
                                        r83.A06 = r3.A06;
                                        r83.A01();
                                        C06220Of.A0c(r83.A01, new AnonymousClass7SB(r83, r12, A009));
                                    }
                                    C34941fY r103 = r0.A0t;
                                    List A0W3 = r12.A0W(C34181eD.SLIDER);
                                    if (A0W3 == null || A0W3.isEmpty()) {
                                        View view8 = r103.A00;
                                        if (view8 != null) {
                                            view8.setVisibility(8);
                                        }
                                    } else {
                                        if (r103.A00 == null) {
                                            View inflate3 = r103.A07.inflate();
                                            r103.A00 = inflate3;
                                            r103.A03 = (TouchInterceptorFrameLayout) inflate3.findViewById(C0003R.C0005id.slider_sticker_container);
                                            r103.A02 = (ImageView) r103.A00.findViewById(C0003R.C0005id.slider_sticker);
                                            r103.A01 = r103.A00.findViewById(C0003R.C0005id.slider_particle_system);
                                        }
                                        r103.A00.setVisibility(0);
                                        AnonymousClass1En A0011 = AnonymousClass1En.A00(r3);
                                        boolean z38 = false;
                                        C34151eA r75 = (C34151eA) A0W3.get(0);
                                        AnonymousClass23T r69 = r75.A0V;
                                        if (A0011.A0D(r69.A05)) {
                                            r5 = ((C120875Gi) A0011.A03(r69.A05)).A00;
                                        } else {
                                            r5 = r69.A00() ? new C120835Ge(r69.A00, r3.A06) : null;
                                        }
                                        C66672vr r420 = new C66672vr(r103.A06);
                                        r103.A05 = r420;
                                        if (r69.A08 && !r69.A00() && !A0011.A0D(r69.A05)) {
                                            z38 = true;
                                        }
                                        r420.A07.A08 = z38;
                                        C66672vr r112 = r103.A05;
                                        Context context9 = r103.A06;
                                        if (!r12.A0t() || (A0W = r12.A0W(C34181eD.SLIDER)) == null || A0W.isEmpty()) {
                                            r9 = null;
                                        } else {
                                            r9 = (C34151eA) A0W.get(0);
                                        }
                                        if (r9 == null || r9.A0Q != C34181eD.SLIDER) {
                                            i5 = 0;
                                        } else {
                                            i5 = (int) (((float) context9.getResources().getDimensionPixelSize(C0003R.dimen.slider_sticker_width)) / (r12.A00() * (r9.Aai() / r9.AMp())));
                                        }
                                        r112.A00 = i5;
                                        r112.invalidateSelf();
                                        C66672vr r421 = r103.A05;
                                        r421.A02 = r5;
                                        C66672vr.A00(r421);
                                        C66672vr r423 = r103.A05;
                                        r423.A01 = r69;
                                        C66672vr.A00(r423);
                                        C66672vr r84 = r103.A05;
                                        r84.A07.A07 = new C171727Vs(r15, r12, r69, r3, r40, r103);
                                        r103.A02.setImageDrawable(r84);
                                        r103.A02.requestLayout();
                                        C06220Of.A0c(r103.A02, new AnonymousClass7T4(r103, r12, r75));
                                        r103.A03.A00(r103, r103.A05);
                                        C171717Vr r515 = new C171717Vr(r103.A06);
                                        r103.A04 = r515;
                                        r515.A04 = r69.A04;
                                        r103.A01.setBackground(r515);
                                    }
                                    C34781fI r96 = r0.A0j;
                                    C34151eA A0012 = C65382t0.A00(r12.A0U(), C34181eD.COUNTDOWN);
                                    if (r96.A01 == null) {
                                        ImageView imageView5 = (ImageView) r96.A02.A01();
                                        r96.A01 = imageView5;
                                        r96.A00 = (ViewGroup) imageView5.getParent();
                                    }
                                    if (A0012 == null) {
                                        r96.A02.A02(8);
                                    } else {
                                        r96.A02.A02(0);
                                        AnonymousClass24Q r76 = A0012.A0L;
                                        AnonymousClass7OJ r610 = new AnonymousClass7OJ(r96.A01.getContext());
                                        r610.A08(r76, true);
                                        r610.A0G.A04 = true;
                                        r96.A01.setImageDrawable(r610);
                                        if (!reelViewerConfig4.A0A) {
                                            r96.A01.setOnClickListener(new C171127Th(r15, r12, r76));
                                        } else {
                                            r96.A01.setOnClickListener((View.OnClickListener) null);
                                        }
                                        C06220Of.A0c(r96.A01, new C171097Te(r96, r12, A0012, r15));
                                    }
                                    C65422t4.A00(r0.A0q, r12, r15);
                                    C34831fN r85 = r0.A0m;
                                    C34151eA A015 = AnonymousClass7VC.A01(r12);
                                    if (A015 == null) {
                                        r85.A02.A02(8);
                                    } else {
                                        if (r85.A01 == null) {
                                            ImageView imageView6 = (ImageView) r85.A02.A01();
                                            r85.A01 = imageView6;
                                            r85.A00 = (ViewGroup) imageView6.getParent();
                                        }
                                        r85.A02.A02(0);
                                        AnonymousClass7VB r611 = A015.A0O;
                                        C169717Ni r516 = new C169717Ni(r85.A01.getContext());
                                        r516.A08(r611, r3);
                                        r85.A01.setImageDrawable(r516);
                                        if (!reelViewerConfig4.A0C) {
                                            r85.A01.setOnClickListener(new C173877bo(r15, r85, r12, r611));
                                        } else {
                                            r85.A01.setOnClickListener((View.OnClickListener) null);
                                        }
                                        C06220Of.A0c(r85.A01, new C173867bn(r85, r12, A015, equals2, r32, r611, r15, r3, moduleName, r57, r58));
                                    }
                                    C34841fO r77 = r0.A0u;
                                    C34151eA A0013 = C65382t0.A00(r12.A0U(), C34181eD.SMB_SUPPORT);
                                    if (A0013 == null) {
                                        r77.A02.A02(8);
                                    } else {
                                        if (r77.A01 == null) {
                                            ImageView imageView7 = (ImageView) r77.A02.A01();
                                            r77.A01 = imageView7;
                                            r77.A00 = (ViewGroup) imageView7.getParent();
                                        }
                                        r77.A02.A02(0);
                                        AnonymousClass7VG r517 = A0013.A0W;
                                        C169767Nn r86 = new C169767Nn(r77.A01.getContext());
                                        r86.A08(r517);
                                        r77.A01.setImageDrawable(r86);
                                        if (reelViewerConfig4.A0L || r517.A01 == null || TextUtils.isEmpty(r517.A04) || TextUtils.isEmpty(r517.A0C)) {
                                            r77.A01.setOnClickListener((View.OnClickListener) null);
                                        } else {
                                            r77.A01.setOnClickListener(new C171137Ti(r15, r12, r517));
                                        }
                                        C06220Of.A0c(r77.A01, new C171107Tf(r77, r12, A0013, r15));
                                    }
                                    C34741fE r97 = r0.A0i;
                                    C34151eA A0014 = C65382t0.A00(r12.A0U(), C34181eD.CHAT);
                                    if (A0014 != null) {
                                        r97.A02.A02(0);
                                        C171577Vd r113 = A0014.A0K;
                                        AnonymousClass0a4.A06(r113);
                                        C173367av r78 = r113.A00;
                                        AnonymousClass0a4.A06(r78);
                                        AnonymousClass7N7 r612 = new AnonymousClass7N7(r97.A01.getContext());
                                        r612.A09(r113.A00());
                                        switch (r78.ordinal()) {
                                            case 0:
                                                num = Constants.ONE;
                                                break;
                                            case 1:
                                                num = Constants.A0C;
                                                break;
                                            case 2:
                                            case 3:
                                                num = Constants.ZERO;
                                                break;
                                            default:
                                                r97.A01.setImageDrawable(r612);
                                                if (!reelViewerConfig4.A0E) {
                                                    r97.A01.setOnClickListener(new AnonymousClass600(r78, r38, r97, r12, r113));
                                                } else {
                                                    r97.A01.setOnClickListener((View.OnClickListener) null);
                                                }
                                                C06220Of.A0c(r97.A01, new AnonymousClass7SE(r97, r12, A0014));
                                                break;
                                        }
                                    } else {
                                        r97.A02.A02(8);
                                    }
                                    new C58592gD().A6h(r0.A0b, r2, r12, r38);
                                    C34791fJ r98 = r0.A0k;
                                    if (r45 == null) {
                                        A002 = null;
                                    } else {
                                        A002 = C65382t0.A00(r12.A0U(), C34181eD.DISCUSSION);
                                    }
                                    if (A002 == null) {
                                        r98.A02.A02(8);
                                    } else {
                                        r98.A02.A02(0);
                                        C169647Nb r79 = A002.A0M;
                                        C169637Na r613 = new C169637Na(r98.A01.getContext(), r3.A06.ASv());
                                        r613.A00 = r79;
                                        C169637Na.A00(r613);
                                        r98.A01.setImageDrawable(r613);
                                        r98.A01.setOnClickListener(new AnonymousClass5IL(r15, r12, r79));
                                        C06220Of.A0c(r98.A01, new AnonymousClass7SF(r98, r12, A002));
                                    }
                                    C65432t5.A00(r3, r0.A0l, r38, r12.A0U(), (String) null, (String) null, r12.A00());
                                } else if (r12.A0y()) {
                                    C65372sz.A00(r0.A0p, r12.A0W(C34181eD.MUSIC_OVERLAY), r12.A00());
                                    C65422t4.A00(r0.A0q, r12, r15);
                                }
                            }
                        }
                        r0.A11.setSegments(i13);
                        r0.A11.A04(i14, false);
                        r0.A11.setVisibility(0);
                    }
                    int i20 = 0;
                    if (r0.A03.A0J(r3)) {
                        z13 = true;
                    }
                    z13 = false;
                    if (!z13) {
                        boolean z39 = true;
                        C50282Fr r518 = r0.A03;
                        if (r518.A0J(r3)) {
                            z14 = true;
                        }
                        z14 = false;
                        if (z14) {
                            r0.A0Q.setVisibility(8);
                            r0.A0Q.setOnClickListener((View.OnClickListener) null);
                            r0.A0V.A02(8);
                            r0.A0N.setVisibility(0);
                        } else {
                            r0.A0V.A02(8);
                            r0.A0Q.setVisibility(8);
                            r0.A0Q.setOnClickListener((View.OnClickListener) null);
                            r0.A0c.setEnableProgressBar(true);
                            IgProgressImageView igProgressImageView4 = r0.A0c;
                            if (!r12.A0s() || !r12.A06) {
                                z39 = false;
                            }
                            igProgressImageView4.setProgressBarIndeterminate(z39);
                            if (r12.A0t()) {
                                C39081mK.A00(r3, r0.A0v.A0r, r12.A08, r3.A06, r38);
                            }
                            if (!C38271l0.A08(r12)) {
                                AnonymousClass2ET A0015 = C65412t3.A00(r12);
                                if (A0015 != null) {
                                    int i21 = A0015.A01;
                                    boolean z40 = false;
                                    if (i21 != -1) {
                                        z40 = true;
                                    }
                                    z27 = !z40;
                                } else {
                                    z27 = false;
                                }
                                if (!z27) {
                                    C34151eA A016 = AnonymousClass7VC.A01(r12);
                                    if (A016 == null) {
                                        r48 = null;
                                    } else {
                                        r48 = A016.A0O;
                                    }
                                    if (!new C65442t6(C16180oA.A00(r3), C06190Oc.A00).A00(r48)) {
                                        z15 = false;
                                    }
                                }
                            }
                            z15 = true;
                            if (z15 && r0.A00 == null) {
                                r0.A00 = (ImageView) r0.A0M.inflate();
                            }
                            imageView = r0.A00;
                            if (imageView != null) {
                                imageView.setVisibility(8);
                            }
                            C65462t8.A05(r3, r0.A0v, r2, r12, r422, reelViewerConfig2, z29, r38, r40, z11);
                            C34601f0 r519 = r0.A0v.A0w;
                            if (!z && (r7 = r12.A08) != null) {
                                if (TextUtils.isEmpty(r7.A2H)) {
                                    boolean isEmpty = TextUtils.isEmpty(r7.A2G);
                                    z26 = false;
                                }
                                z26 = true;
                                z16 = true;
                            }
                            z16 = false;
                            if (z16) {
                                num2 = Constants.ZERO;
                            } else {
                                if (!z && (r47 = r12.A08) != null) {
                                    boolean z41 = r47.A3J;
                                    z17 = true;
                                }
                                z17 = false;
                                if (z17) {
                                    C13150hy.A02(r3, "userSession");
                                }
                                if (!z && (r4 = r12.A08) != null) {
                                    boolean z42 = r4.A3J;
                                    z18 = true;
                                }
                                z18 = false;
                                if (z18) {
                                    num2 = Constants.A0C;
                                } else {
                                    C34151eA A017 = AnonymousClass7VC.A01(r12);
                                    if (A017 != null) {
                                        r92 = A017.A0O;
                                    } else {
                                        r92 = null;
                                    }
                                    if (!z && r92 != null) {
                                        z19 = true;
                                    }
                                    z19 = false;
                                    if (z19) {
                                        num2 = Constants.A0N;
                                    } else {
                                        AnonymousClass1NJ r424 = r12.A08;
                                        if (r424 != null) {
                                            AnonymousClass4XB r710 = r424.A11;
                                            z20 = true;
                                        }
                                        z20 = false;
                                        num2 = z20 ? Constants.A0Y : null;
                                    }
                                }
                            }
                            if (num2 == null || (reelViewerConfig2.A0F && (num2 == Constants.A0C || num2 == Constants.ONE))) {
                                r519.A02.A02(8);
                            } else {
                                r519.A02.A02(0);
                                AnonymousClass1NJ r425 = r12.A08;
                                int intValue = num2.intValue();
                                boolean z43 = true;
                                switch (intValue) {
                                    case 0:
                                        if (!reelViewerConfig2.A0F) {
                                            if (!z && r425 != null) {
                                                z25 = true;
                                                break;
                                            }
                                            z25 = false;
                                            break;
                                        }
                                        z43 = false;
                                        onClickListener = new C97674Jz(r425, r3, z43, r38);
                                        if (!z43) {
                                            str3 = r519.A00.getString(C0003R.string.try_the_challenge_label);
                                            break;
                                        } else {
                                            str3 = r519.A00.getString(C0003R.string.mention_reshare_button_label);
                                            break;
                                        }
                                    case 1:
                                        onClickListener = new C97664Jy(r425, r38);
                                        str3 = r519.A00.getString(C0003R.string.mention_reshare_button_label);
                                        break;
                                    case 2:
                                        onClickListener = new AnonymousClass4K0(r425, r3, r38);
                                        str3 = r519.A00.getString(C0003R.string.mention_reshare_button_label);
                                        break;
                                    case 3:
                                        C34151eA A018 = AnonymousClass7VC.A01(r12);
                                        AnonymousClass0a4.A06(A018);
                                        AnonymousClass7VB r426 = A018.A0O;
                                        AnonymousClass0a4.A06(r426);
                                        onClickListener = new C160026sF(r3, moduleName, r426, r519);
                                        str3 = r519.A00.getString(C0003R.string.share_sticker_to_your_story_label);
                                        break;
                                    case 4:
                                        AnonymousClass4XB r87 = r425.A11;
                                        AnonymousClass0a4.A06(r87);
                                        onClickListener = new AnonymousClass4XA(r3, moduleName, r38, r87);
                                        str3 = r87.A01;
                                        break;
                                    default:
                                        if (num2 != null) {
                                            switch (intValue) {
                                                case 1:
                                                    str4 = "REMIX";
                                                    break;
                                                case 2:
                                                    str4 = "MENTION_RESHARE";
                                                    break;
                                                case 3:
                                                    str4 = "DUPLICATE_FUNDRAISER_STICKER";
                                                    break;
                                                case 4:
                                                    str4 = "DONATE_PROMPT";
                                                    break;
                                                default:
                                                    str4 = "CHALLENGE";
                                                    break;
                                            }
                                        } else {
                                            str4 = "null";
                                        }
                                        throw new IllegalStateException(AnonymousClass000.A0E("Unhandled action button type: ", str4));
                                }
                                r519.A01.setOnClickListener(onClickListener);
                                r519.A01.setText(str3);
                            }
                            C35001fe r711 = r0.A0o;
                            if (z3 && !r2.A0J(r3)) {
                                if (r2.A0E().size() <= 1 && !r2.A0I()) {
                                    Integer A0G = r2.A0A.A0G();
                                    if (A0G != Constants.A14) {
                                        z24 = false;
                                    }
                                    z24 = true;
                                }
                                if (!r711.A00().A02) {
                                    r711.A03.A02(0);
                                    r711.A03.A01().setAlpha(1.0f);
                                    if (!r2.A0I()) {
                                        Integer A0G2 = r2.A0A.A0G();
                                        if (A0G2 != Constants.A14) {
                                            z23 = false;
                                        }
                                        z23 = true;
                                        if (!z23) {
                                            if (r711.A02 == null) {
                                                r711.A02 = (TextView) r711.A03.A01().findViewById(C0003R.C0005id.reel_metadata_overlay_title);
                                            }
                                            str2 = r711.A02.getContext().getString(C0003R.string.story_label);
                                            if (r711.A02 == null) {
                                                r711.A02 = (TextView) r711.A03.A01().findViewById(C0003R.C0005id.reel_metadata_overlay_title);
                                            }
                                            r711.A02.setText(str2);
                                            if (r711.A01 == null) {
                                                r711.A01 = (TextView) r711.A03.A01().findViewById(C0003R.C0005id.reel_metadata_overlay_location);
                                            }
                                            TextView textView11 = r711.A01;
                                            if (r711.A00 == null) {
                                                TextView textView12 = (TextView) r711.A03.A01().findViewById(C0003R.C0005id.reel_metadata_overlay_hashtags);
                                                r711.A00 = textView12;
                                                textView12.setMovementMethod(LinkMovementMethod.getInstance());
                                                r711.A00.setHighlightColor(0);
                                            }
                                            TextView textView13 = r711.A00;
                                            if (!((Boolean) AnonymousClass0L6.A02(r3, AnonymousClass0L7.JP_HIGHLIGHTS_METADATA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                                Venue venue = r2.A0A.A0O;
                                                if (venue != null) {
                                                    textView11.setText(venue.A0B);
                                                    textView11.setVisibility(0);
                                                    textView11.setOnClickListener(new C98424Nb(r38, venue));
                                                    z22 = true;
                                                } else {
                                                    textView11.setVisibility(8);
                                                    z22 = false;
                                                }
                                                List list3 = r2.A0A.A0d;
                                                if (list3 == null || list3.isEmpty()) {
                                                    textView13.setVisibility(8);
                                                } else {
                                                    Context context10 = r711.A00.getContext();
                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                        Hashtag hashtag = (Hashtag) list3.get(i22);
                                                        AnonymousClass4UX r132 = new AnonymousClass4UX(r38, hashtag, context10);
                                                        SpannableString spannableString = new SpannableString(C06360Ot.formatString("#%s", hashtag.A0A));
                                                        spannableString.setSpan(r132, 0, spannableString.length(), 0);
                                                        spannableStringBuilder2.append(spannableString);
                                                        if (i22 != list3.size() - 1) {
                                                            spannableStringBuilder2.append(" ");
                                                        }
                                                    }
                                                    textView13.setText(spannableStringBuilder2);
                                                    textView13.setVisibility(0);
                                                    z22 = true;
                                                }
                                                C158306pP A0016 = r711.A00();
                                                if (z22) {
                                                    num3 = Constants.ZERO;
                                                } else {
                                                    num3 = Constants.ONE;
                                                }
                                                A0016.A01 = num3;
                                                AlphaAnimation alphaAnimation = A0016.A00;
                                                if (alphaAnimation != null) {
                                                    if (num3 == Constants.ONE) {
                                                        j = 300;
                                                    } else {
                                                        j = 3000;
                                                    }
                                                    alphaAnimation.setStartOffset(j);
                                                }
                                            } else {
                                                textView11.setVisibility(8);
                                                textView13.setVisibility(8);
                                            }
                                            C34971fb r427 = r0.A0f;
                                            if (!r2.A0A.A0e() || r2.A08) {
                                                r427.A00.A02(8);
                                            } else {
                                                r427.A00.A02(0);
                                                View A019 = r427.A00.A01();
                                                A019.findViewById(C0003R.C0005id.reel_viewer_edit_suggested_highlights_button).setOnClickListener(new C1896788q(r38));
                                                A019.findViewById(C0003R.C0005id.reel_viewer_publish_suggested_highlights_button).setOnClickListener(new C1895988i(r38));
                                            }
                                            C34981fc r428 = r0.A0e;
                                            if (r2.A08) {
                                                Reel reel2 = r2.A0A;
                                                AnonymousClass11J.A03(reel2.A0e());
                                                if (r428.A00 != 0) {
                                                    r428.A00 = 0;
                                                    View A0110 = r428.A06.A01();
                                                    A0110.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                    A0110.animate().setDuration(200).setListener(r428).alpha(1.0f);
                                                }
                                                AnonymousClass2B1 r16 = reel2.A0E;
                                                if (r16 != null) {
                                                    r428.A02.setUrl(r16.A01.A02);
                                                }
                                                r428.A01.setText(reel2.A0a);
                                                r428.A03 = r38;
                                            } else {
                                                if (r428.A00 != 8) {
                                                    C26571Ea r25 = r428.A06;
                                                    if (r25.A04()) {
                                                        r428.A00 = 8;
                                                        r25.A01().animate().setDuration(200).setListener(r428).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).start();
                                                    }
                                                }
                                                CircularImageView circularImageView = r428.A02;
                                                if (circularImageView != null) {
                                                    circularImageView.A04();
                                                }
                                            }
                                            linearLayout = (LinearLayout) r0.A0H;
                                            z21 = false;
                                            i8 = 0;
                                            for (i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
                                                if (linearLayout.getChildAt(i7).getVisibility() != 8) {
                                                    i8++;
                                                }
                                            }
                                            if (i8 > 2) {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                i20 = r0.A0H.getResources().getDimensionPixelSize(C0003R.dimen.reel_viewer_text_container_top_offset);
                                            }
                                            C06220Of.A0S(r0.A0H, i20);
                                            return;
                                        }
                                    }
                                    str2 = r2.A0A.A0a;
                                    if (r711.A02 == null) {
                                    }
                                    r711.A02.setText(str2);
                                    if (r711.A01 == null) {
                                    }
                                    TextView textView112 = r711.A01;
                                    if (r711.A00 == null) {
                                    }
                                    TextView textView132 = r711.A00;
                                    if (!((Boolean) AnonymousClass0L6.A02(r3, AnonymousClass0L7.JP_HIGHLIGHTS_METADATA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                    }
                                    C34971fb r4272 = r0.A0f;
                                    if (!r2.A0A.A0e() || r2.A08) {
                                    }
                                    C34981fc r4282 = r0.A0e;
                                    if (r2.A08) {
                                    }
                                    linearLayout = (LinearLayout) r0.A0H;
                                    z21 = false;
                                    i8 = 0;
                                    while (i7 < linearLayout.getChildCount()) {
                                    }
                                    if (i8 > 2) {
                                    }
                                    if (z21) {
                                    }
                                    C06220Of.A0S(r0.A0H, i20);
                                    return;
                                }
                            }
                            r711.A03.A02(8);
                            C34971fb r42722 = r0.A0f;
                            if (!r2.A0A.A0e() || r2.A08) {
                            }
                            C34981fc r42822 = r0.A0e;
                            if (r2.A08) {
                            }
                            linearLayout = (LinearLayout) r0.A0H;
                            z21 = false;
                            i8 = 0;
                            while (i7 < linearLayout.getChildCount()) {
                            }
                            if (i8 > 2) {
                            }
                            if (z21) {
                            }
                            C06220Of.A0S(r0.A0H, i20);
                            return;
                        }
                    } else if (z2) {
                        r0.A0V.A02(0);
                    } else {
                        r0.A0Q.setVisibility(0);
                        r0.A0Q.setOnClickListener(new C944446l(r432, r38));
                        r0.A0V.A02(8);
                    }
                    r0.A0c.setEnableProgressBar(false);
                    if (r12.A0t()) {
                    }
                    if (!C38271l0.A08(r12)) {
                    }
                    z15 = true;
                    r0.A00 = (ImageView) r0.A0M.inflate();
                    imageView = r0.A00;
                    if (imageView != null) {
                    }
                    C65462t8.A05(r3, r0.A0v, r2, r12, r422, reelViewerConfig2, z29, r38, r40, z11);
                    C34601f0 r5192 = r0.A0v.A0w;
                    if (TextUtils.isEmpty(r7.A2H)) {
                    }
                    z26 = true;
                    z16 = true;
                } else {
                    view = r0.A0F;
                }
            }
            r0.A0P.setText(A06);
            z30 = false;
            C466820l.A07(r0.A0P, z30, 0, resources.getDimensionPixelSize(C0003R.dimen.reel_username_right_offset), -1);
            TextView textView82 = r0.A0O;
            int i102 = C0003R.dimen.reel_timestamp_left_offset;
            if (z30) {
            }
            C06220Of.A0M(textView82, resources.getDimensionPixelSize(i102));
            if (!r12.A05) {
            }
            i3 = r0.A0B;
            if (i3 > 0) {
            }
            Context context22 = r0.A0E.getContext();
            C34631f3 r5102 = r0.A0y;
            viewGroup = r5102.A08.A00;
            if (viewGroup != null) {
            }
            viewGroup2 = r5102.A05.A00;
            if (viewGroup2 != null) {
            }
            viewGroup3 = r5102.A06.A00;
            if (viewGroup3 != null) {
            }
            viewGroup4 = r5102.A07.A01;
            if (viewGroup4 != null) {
            }
            textView2 = r5102.A01;
            if (textView2 != null) {
            }
            textView3 = r5102.A02;
            if (textView3 != null) {
            }
            textView4 = r5102.A03;
            if (textView4 != null) {
            }
            textView5 = r5102.A00;
            if (textView5 != null) {
            }
            viewGroup5 = r5102.A0F.A00;
            if (viewGroup5 != null) {
            }
            viewGroup6 = r5102.A09.A00;
            if (viewGroup6 != null) {
            }
            viewGroup7 = r5102.A0B.A00;
            if (viewGroup7 != null) {
            }
            viewGroup8 = r5102.A0E.A00;
            if (viewGroup8 != null) {
            }
            textView6 = r5102.A0C.A00;
            if (textView6 != null) {
            }
            viewGroup9 = r5102.A0D.A00;
            if (viewGroup9 != null) {
            }
            C65142sc.A00(r5102);
            r5102.A0A.A01();
            if (!r12.A0s()) {
            }
            if (r0.A0B > 0) {
            }
            if (!r29.A0k() || r0.A0U == null) {
            }
            if (r12.A0s() || r12.A05 || r12.A0k() || r2.A0A.A0f() || Constants.ZERO.equals(r12.A02)) {
            }
            A04 = C65352sx.A04(r3, r2, r12);
            if (C65352sx.A01(r0.A0c.getContext(), r12, reelViewerConfig2, A04)) {
            }
            z9 = false;
            if (!z9) {
            }
        }
        view.setVisibility(8);
        r0.A0S.setAspectRatio(-1.0f);
        view2 = r0.A0w.A00;
        if (view2 != null) {
        }
        view3 = r0.A0x.A00;
        if (view3 != null) {
        }
        AnonymousClass1NJ r4132 = r12.A08;
        z11 = true;
    }
}
