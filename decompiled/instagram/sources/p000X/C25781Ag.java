package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.facebook.C0003R;

/* renamed from: X.1Ag  reason: invalid class name and case insensitive filesystem */
public final class C25781Ag implements AnonymousClass1Ah {
    public final int[] A00 = {C0003R.C0004drawable.abc_popup_background_mtrl_mult, C0003R.C0004drawable.abc_cab_background_internal_bg, C0003R.C0004drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] A01 = {C0003R.C0004drawable.abc_textfield_activated_mtrl_alpha, C0003R.C0004drawable.abc_textfield_search_activated_mtrl_alpha, C0003R.C0004drawable.abc_cab_background_top_mtrl_alpha, C0003R.C0004drawable.abc_text_cursor_material, C0003R.C0004drawable.abc_text_select_handle_left_mtrl_dark, C0003R.C0004drawable.abc_text_select_handle_middle_mtrl_dark, C0003R.C0004drawable.abc_text_select_handle_right_mtrl_dark, C0003R.C0004drawable.abc_text_select_handle_left_mtrl_light, C0003R.C0004drawable.abc_text_select_handle_middle_mtrl_light, C0003R.C0004drawable.abc_text_select_handle_right_mtrl_light};
    public final int[] A02 = {C0003R.C0004drawable.abc_textfield_search_default_mtrl_alpha, C0003R.C0004drawable.abc_textfield_default_mtrl_alpha, C0003R.C0004drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] A03 = {C0003R.C0004drawable.abc_btn_check_material, C0003R.C0004drawable.abc_btn_radio_material, C0003R.C0004drawable.abc_btn_check_material_anim, C0003R.C0004drawable.abc_btn_radio_material_anim};
    public final int[] A04 = {C0003R.C0004drawable.abc_ic_commit_search_api_mtrl_alpha, C0003R.C0004drawable.abc_seekbar_tick_mark_material, C0003R.C0004drawable.abc_ic_menu_share_mtrl_alpha, C0003R.C0004drawable.abc_ic_menu_copy_mtrl_am_alpha, C0003R.C0004drawable.abc_ic_menu_cut_mtrl_alpha, C0003R.C0004drawable.abc_ic_menu_selectall_mtrl_alpha, C0003R.C0004drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] A05 = {C0003R.C0004drawable.abc_tab_indicator_material, C0003R.C0004drawable.abc_textfield_search_material};

    public static ColorStateList A00(Context context, int i) {
        int A012 = C34391ef.A01(context, C0003R.attr.colorControlHighlight);
        int A002 = C34391ef.A00(context, C0003R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{C34391ef.A07, C34391ef.A03, C34391ef.A01, C34391ef.A08}, new int[]{A002, C60702kK.A02(A012, i), C60702kK.A02(A012, i), i});
    }

    public static boolean A02(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    public final boolean BrM(Context context, int i, Drawable drawable) {
        boolean z;
        int i2;
        PorterDuff.Mode mode = C25751Ad.A02;
        int i3 = 16842801;
        if (A02(this.A02, i)) {
            i3 = C0003R.attr.colorControlNormal;
        } else if (A02(this.A01, i)) {
            i3 = C0003R.attr.colorControlActivated;
        } else if (A02(this.A00, i)) {
            mode = PorterDuff.Mode.MULTIPLY;
        } else {
            if (i == C0003R.C0004drawable.abc_list_divider_mtrl_alpha) {
                i3 = 16842800;
                i2 = Math.round(40.8f);
                z = true;
            } else if (i != C0003R.C0004drawable.abc_dialog_material_background) {
                z = false;
                i2 = -1;
                i3 = 0;
            }
            if (z) {
                return false;
            }
            if (C25841Ao.A03(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(C25751Ad.A00(C34391ef.A01(context, i3), mode));
            if (i2 != -1) {
                drawable.setAlpha(i2);
            }
            return true;
        }
        z = true;
        i2 = -1;
        if (z) {
        }
    }

    public static void A01(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C25841Ao.A03(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(C25751Ad.A00(i, mode));
    }

    public final Drawable AAR(C25761Ae r5, Context context, int i) {
        if (i != C0003R.C0004drawable.abc_cab_background_top_material) {
            return null;
        }
        return new LayerDrawable(new Drawable[]{r5.A07(context, C0003R.C0004drawable.abc_cab_background_internal_bg), r5.A07(context, C0003R.C0004drawable.abc_cab_background_top_mtrl_alpha)});
    }

    public final ColorStateList AYN(Context context, int i) {
        int i2;
        int i3;
        int i4;
        int A012;
        if (i == C0003R.C0004drawable.abc_edit_text_material) {
            i2 = C0003R.color.abc_tint_edittext;
        } else if (i == C0003R.C0004drawable.abc_switch_track_mtrl_alpha) {
            i2 = C0003R.color.abc_tint_switch_track;
        } else if (i == C0003R.C0004drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList A022 = C34391ef.A02(context, C0003R.attr.colorSwitchThumbNormal);
            if (A022 == null || !A022.isStateful()) {
                iArr[0] = C34391ef.A07;
                iArr2[0] = C34391ef.A00(context, C0003R.attr.colorSwitchThumbNormal);
                iArr[1] = C34391ef.A06;
                iArr2[1] = C34391ef.A01(context, C0003R.attr.colorControlActivated);
                iArr[2] = C34391ef.A08;
                A012 = C34391ef.A01(context, C0003R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = C34391ef.A07;
                iArr[0] = iArr3;
                iArr2[0] = A022.getColorForState(iArr3, 0);
                iArr[1] = C34391ef.A06;
                iArr2[1] = C34391ef.A01(context, C0003R.attr.colorControlActivated);
                iArr[2] = C34391ef.A08;
                A012 = A022.getDefaultColor();
            }
            iArr2[2] = A012;
            return new ColorStateList(iArr, iArr2);
        } else {
            if (i == C0003R.C0004drawable.abc_btn_default_mtrl_shape) {
                i3 = C0003R.attr.colorButtonNormal;
            } else if (i == C0003R.C0004drawable.abc_btn_borderless_material) {
                i4 = 0;
                return A00(context, i4);
            } else if (i == C0003R.C0004drawable.abc_btn_colored_material) {
                i3 = C0003R.attr.colorAccent;
            } else if (i == C0003R.C0004drawable.abc_spinner_mtrl_am_alpha || i == C0003R.C0004drawable.abc_spinner_textfield_background_material) {
                i2 = C0003R.color.abc_tint_spinner;
            } else if (A02(this.A04, i)) {
                return C34391ef.A02(context, C0003R.attr.colorControlNormal);
            } else {
                if (A02(this.A05, i)) {
                    i2 = C0003R.color.abc_tint_default;
                } else if (A02(this.A03, i)) {
                    i2 = C0003R.color.abc_tint_btn_checkable;
                } else if (i != C0003R.C0004drawable.abc_seekbar_thumb_material) {
                    return null;
                } else {
                    i2 = C0003R.color.abc_tint_seek_thumb;
                }
            }
            i4 = C34391ef.A01(context, i3);
            return A00(context, i4);
        }
        return C474223w.A00(context, i2);
    }

    public final PorterDuff.Mode AYO(int i) {
        if (i == C0003R.C0004drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public final boolean BrL(Context context, int i, Drawable drawable) {
        LayerDrawable layerDrawable;
        PorterDuff.Mode mode;
        Drawable findDrawableByLayerId;
        int i2;
        if (i == C0003R.C0004drawable.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
            int A012 = C34391ef.A01(context, C0003R.attr.colorControlNormal);
            mode = C25751Ad.A02;
            A01(findDrawableByLayerId2, A012, mode);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0003R.attr.colorControlNormal;
        } else if (i != C0003R.C0004drawable.abc_ratingbar_material && i != C0003R.C0004drawable.abc_ratingbar_indicator_material && i != C0003R.C0004drawable.abc_ratingbar_small_material) {
            return false;
        } else {
            layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(16908288);
            int A002 = C34391ef.A00(context, C0003R.attr.colorControlNormal);
            mode = C25751Ad.A02;
            A01(findDrawableByLayerId3, A002, mode);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0003R.attr.colorControlActivated;
        }
        A01(findDrawableByLayerId, C34391ef.A01(context, i2), mode);
        A01(layerDrawable.findDrawableByLayerId(16908301), C34391ef.A01(context, C0003R.attr.colorControlActivated), mode);
        return true;
    }
}
