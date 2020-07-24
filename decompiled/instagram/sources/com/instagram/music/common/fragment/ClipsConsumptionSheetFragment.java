package com.instagram.music.common.fragment;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import java.io.IOException;
import java.io.Serializable;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IY;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1WV;
import p000X.AnonymousClass3EO;
import p000X.AnonymousClass8AY;
import p000X.AnonymousClass8B7;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C15890nh;
import p000X.C168117Fx;
import p000X.C174967dh;
import p000X.C174977di;
import p000X.C174987dj;
import p000X.C175007dl;
import p000X.C17850qu;
import p000X.C190078Ah;
import p000X.C190128An;
import p000X.C190138Ao;
import p000X.C190148Ap;
import p000X.C190158Aq;
import p000X.C190168As;
import p000X.C190178At;
import p000X.C190188Au;
import p000X.C190198Av;
import p000X.C190208Aw;
import p000X.C190218Ax;
import p000X.C190278Be;
import p000X.C27341Hl;
import p000X.C34541eu;
import p000X.C34561ew;
import p000X.C35651gi;
import p000X.C44331vz;
import p000X.C46361zc;
import p000X.C466820l;
import p000X.C60962kt;

public class ClipsConsumptionSheetFragment extends C27341Hl implements C60962kt, C190078Ah {
    public Context A00;
    public Reel A01;
    public Reel A02;
    public AnonymousClass8AY A03;
    public C34561ew A04;
    public AnonymousClass3EO A05;
    public C190198Av A06;
    public AnonymousClass0C1 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public AnonymousClass1OY A0C;
    public View mArtistInfoContainer;
    public IgImageView mArtistProfilePic;
    public TextView mArtistUsername;
    public View mCreateClipsActionButton;
    public View mMusicPlayer;
    public C190208Aw mTrackCoverReelHolder;
    public TextView mTrackTitle;
    public C190208Aw mViewTopClipsReelHolder;

    private void A02(C13300iJ r5) {
        IgImageView igImageView;
        ImageUrl imageUrl;
        if (r5 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r5.AZn());
            if (r5.A0s()) {
                C466820l.A03(this.A00, spannableStringBuilder, true);
            }
            this.mArtistUsername.setText(spannableStringBuilder);
            igImageView = this.mArtistProfilePic;
            imageUrl = r5.ASv();
        } else {
            C34561ew r0 = this.A04;
            AnonymousClass0a4.A06(r0);
            this.mArtistUsername.setText(r0.A0F);
            igImageView = this.mArtistProfilePic;
            imageUrl = this.A04.A03;
        }
        igImageView.setUrl(imageUrl, getModuleName());
        C35651gi r1 = new C35651gi(this.mArtistInfoContainer);
        r1.A05 = new C190218Ax(this, r5);
        r1.A07 = true;
        r1.A00();
    }

    public final boolean A55() {
        return false;
    }

    public final int AIh() {
        return -2;
    }

    public final int AYd() {
        return 0;
    }

    public final float AdY() {
        return 1.0f;
    }

    public final boolean AeS() {
        return true;
    }

    public final boolean AhU() {
        return true;
    }

    public final float Aol() {
        return 1.0f;
    }

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final void B8h() {
    }

    public final void B8j(int i) {
    }

    public final boolean BmS() {
        return true;
    }

    private void A00(int i) {
        this.mMusicPlayer.setVisibility(i);
        this.mTrackCoverReelHolder.A00.setVisibility(i);
        this.mTrackTitle.setVisibility(i);
        this.mArtistInfoContainer.setVisibility(i);
    }

    public static void A01(ClipsConsumptionSheetFragment clipsConsumptionSheetFragment) {
        C15890nh r2 = new C15890nh(clipsConsumptionSheetFragment.A07);
        r2.A09 = Constants.ONE;
        r2.A0C = "music/top_clips/";
        r2.A06(AnonymousClass8B7.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new C190138Ao(clipsConsumptionSheetFragment);
        clipsConsumptionSheetFragment.schedule(A032);
        clipsConsumptionSheetFragment.A09 = true;
    }

    private boolean A03() {
        if (!this.A08 || !((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.STORY_BOTTOM_SHEET_TOP_CLIPS_MAS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || this.A0C == AnonymousClass1OY.EXPLORE_CLIPS) {
            return false;
        }
        return true;
    }

    public final void BCC() {
        C190198Av r2 = this.A06;
        if (r2 != null) {
            r2.A03(true, this.A04);
        }
    }

    public final void BCD() {
        C190198Av r2 = this.A06;
        if (r2 != null) {
            r2.A03(false, this.A04);
        }
    }

    public final String getModuleName() {
        if (this.A08) {
            return "story_viewer_clips_sheet";
        }
        return "story_viewer_music_sheet";
    }

    public final int AGx(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final View AXo() {
        return this.mView;
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0C1 r2;
        String str;
        String str2;
        C34561ew r1;
        C34561ew r12;
        C34561ew r13;
        int A022 = AnonymousClass0Z0.A02(-1904480680);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A07 = AnonymousClass0J1.A06(bundle2);
        this.A08 = bundle2.getBoolean("ClipsConsumptionSheetFragment.ARGS_IS_CLIPS_STORY", false);
        this.A0A = bundle2.getBoolean("ClipsConsumptionSheetFragment.ARGS_IS_ORIGINAL_SOUND", false);
        Serializable serializable = bundle2.getSerializable("ClipsConsumptionSheetFragment.REEL_VIEWER_SOURCE");
        AnonymousClass0a4.A06(serializable);
        this.A0C = (AnonymousClass1OY) serializable;
        String string = bundle2.getString("music_sticker_model_json");
        if (string != null) {
            try {
                this.A04 = C34541eu.parseFromJson(AnonymousClass0IY.A00(this.A07, string));
            } catch (IOException unused) {
                AnonymousClass0QD.A02("ClipsConsumptionSheetFragment", "Could not parse json MusicOverlayStickerModel for the Clips consumption sheet");
                AnonymousClass0Z0.A09(466833330, A022);
                return;
            }
        }
        if (A03() && this.A01 == null) {
            A01(this);
        }
        if (this.A08) {
            if (this.A0A) {
                if (((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.STORY_BOTTOM_SHEET_CLIPS_SINGLE_AUDIO_MAS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && (r13 = this.A04) != null && r13.A0P) {
                    C17850qu A072 = C190278Be.A07(this.A07, r13.A0J, "music/original_sound_clips_reel_media/");
                    A072.A00 = new C190148Ap(this, this.A04.A06.ASv());
                    schedule(A072);
                }
            } else if (((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.STORY_BOTTOM_SHEET_CLIPS_SINGLE_AUDIO_MAS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && (r12 = this.A04) != null && !r12.A0P) {
                r2 = this.A07;
                str = r12.A0J;
                str2 = "music/single_song_clips_reel_media/";
                C17850qu A073 = C190278Be.A07(r2, str, str2);
                A073.A00 = new C190148Ap(this, this.A04.A01);
                schedule(A073);
            }
        } else if (((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.STORY_BOTTOM_SHEET_MUSIC_MAS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && (r1 = this.A04) != null && !r1.A0P) {
            r2 = this.A07;
            str = r1.A0J;
            str2 = "music/music_reels_media/";
            C17850qu A0732 = C190278Be.A07(r2, str, str2);
            A0732.A00 = new C190148Ap(this, this.A04.A01);
            schedule(A0732);
        }
        AnonymousClass0Z0.A09(-1976561721, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-182563585);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_clips_consumption_sheet, viewGroup, false);
        AnonymousClass0Z0.A09(268791162, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(593036568);
        super.onDestroyView();
        ClipsConsumptionSheetFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(1029541046, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-610826654);
        super.onPause();
        AnonymousClass8AY r0 = this.A03;
        if (r0 != null) {
            r0.A0C.A05();
        }
        AnonymousClass3EO r02 = this.A05;
        if (r02 != null) {
            r02.A00();
        }
        AnonymousClass0Z0.A09(738592825, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x009f, code lost:
        if (android.text.TextUtils.isEmpty(r1.A0F) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0238  */
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass1OY r4;
        C34561ew r1;
        boolean z;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        this.A00 = context;
        this.mTrackCoverReelHolder = new C190208Aw(view.findViewById(C0003R.C0005id.track_cover_container), (IgImageView) view.findViewById(C0003R.C0005id.track_cover_image), (GradientSpinner) view.findViewById(C0003R.C0005id.track_cover_reel_ring));
        this.mTrackTitle = (TextView) view.findViewById(C0003R.C0005id.track_title);
        this.mArtistProfilePic = (IgImageView) view.findViewById(C0003R.C0005id.artist_profile_pic);
        this.mArtistUsername = (TextView) view.findViewById(C0003R.C0005id.artist_username);
        this.mArtistInfoContainer = view.findViewById(C0003R.C0005id.artist_info);
        this.mMusicPlayer = view.findViewById(C0003R.C0005id.music_player);
        this.mCreateClipsActionButton = view.findViewById(C0003R.C0005id.create_clips_button);
        this.mViewTopClipsReelHolder = new C190208Aw(view.findViewById(C0003R.C0005id.top_clips_reel), (IgImageView) view.findViewById(C0003R.C0005id.top_clips_reel_image), (GradientSpinner) view.findViewById(C0003R.C0005id.top_clips_reel_ring));
        if (!this.A0A && (r1 = this.A04) != null) {
            if (!TextUtils.isEmpty(r1.A0I)) {
                z = true;
            }
            z = false;
            if (!z) {
                A00(8);
                if (!A03()) {
                    C35651gi r12 = new C35651gi(this.mViewTopClipsReelHolder.A00);
                    r12.A0A = true;
                    r12.A07 = true;
                    r12.A05 = new C190128An(this);
                    r12.A00();
                    this.mViewTopClipsReelHolder.A00.setVisibility(0);
                } else {
                    this.mViewTopClipsReelHolder.A00.setVisibility(8);
                }
                if (!this.A08 || !AnonymousClass1WV.A01(this.A07)) {
                    this.mCreateClipsActionButton.setVisibility(8);
                    return;
                }
                C175007dl r3 = new C175007dl(this.mCreateClipsActionButton);
                C174967dh r2 = new C174967dh(this.A00);
                r2.A00(C0003R.C0004drawable.instagram_camera_outline_24);
                r2.A04 = this.A00.getString(C0003R.string.music_sticker_consumption_sheet_create_clips);
                r2.A03 = new C190188Au(this);
                C174987dj.A00(r3, new C174977di(r2));
                this.mCreateClipsActionButton.setVisibility(0);
                return;
            }
        }
        A00(0);
        if (!this.A08 || !this.A0A) {
            C34561ew r13 = this.A04;
            AnonymousClass0a4.A06(r13);
            IgImageView igImageView = this.mTrackCoverReelHolder.A01;
            ImageUrl imageUrl = r13.A01;
            if (!C46361zc.A02(imageUrl)) {
                igImageView.setPlaceHolderColor(C019000b.A00(igImageView.getContext(), C0003R.color.white_20_transparent));
                igImageView.setOnLoadListener(new C168117Fx(igImageView));
                igImageView.setUrl(imageUrl);
            } else {
                igImageView.setImageBitmap(((BitmapDrawable) C019000b.A03(igImageView.getContext(), C0003R.C0004drawable.music_album_art_default)).getBitmap());
            }
            if (this.A08) {
                r4 = AnonymousClass1OY.BOTTOM_SHEET_MAS_SONG_CLIPS;
            } else {
                r4 = AnonymousClass1OY.BOTTOM_SHEET_MAS_MUSIC;
            }
            C35651gi r14 = new C35651gi(this.mTrackCoverReelHolder.A00);
            r14.A0A = true;
            r14.A07 = true;
            r14.A05 = new C190158Aq(this, r4);
            r14.A00();
            C190178At r42 = new C190178At(this.mTrackTitle, C019000b.A00(this.A00, C0003R.color.igds_tertiary_text));
            r42.A00(true);
            C34561ew r15 = this.A04;
            C190168As.A00(r42, r15.A0I, r15.A0O, false);
            A02(this.A04.A06);
        } else {
            C34561ew r0 = this.A04;
            if (r0 == null) {
                A00(8);
            } else {
                C13300iJ r43 = r0.A06;
                AnonymousClass0a4.A07(r43, "Original sound music model should receive a User object in the response.");
                IgImageView igImageView2 = this.mTrackCoverReelHolder.A01;
                ImageUrl imageUrl2 = r43.A05;
                if (imageUrl2 == null) {
                    imageUrl2 = r43.ASv();
                }
                igImageView2.setUrl(imageUrl2, getModuleName());
                AnonymousClass1OY r32 = AnonymousClass1OY.BOTTOM_SHEET_MAS_ORIGINAL_SOUND_CLIPS;
                C35651gi r16 = new C35651gi(this.mTrackCoverReelHolder.A00);
                r16.A0A = true;
                r16.A07 = true;
                r16.A05 = new C190158Aq(this, r32);
                r16.A00();
                this.mTrackTitle.setText(C0003R.string.clips_consumption_sheet_original_audio);
                A02(r43);
            }
        }
        AnonymousClass3EO r44 = new AnonymousClass3EO(this.A00);
        this.A05 = r44;
        AnonymousClass8AY r33 = new AnonymousClass8AY(this.mMusicPlayer, this.A07, r44, this);
        this.A03 = r33;
        AnonymousClass8AY r45 = r33;
        C34561ew r17 = this.A04;
        if (r17 == null) {
            AnonymousClass8AY.A02(r33, false);
        } else {
            MusicAssetModel A002 = MusicAssetModel.A00(this.A00, r17);
            C34561ew r22 = this.A04;
            C44331vz r18 = new C44331vz();
            r18.A01 = r22.A06;
            r18.A00 = r22.A03;
            r18.A04 = r22.A0R;
            r18.A03 = r18.AW0();
            r45.A04(A002, r18);
        }
        if (!A03()) {
        }
        if (!this.A08 || !AnonymousClass1WV.A01(this.A07)) {
        }
    }
}
