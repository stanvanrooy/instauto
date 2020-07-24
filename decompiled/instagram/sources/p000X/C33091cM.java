package p000X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.C0003R;

/* renamed from: X.1cM  reason: invalid class name and case insensitive filesystem */
public final class C33091cM {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r1 != null) goto L_0x0077;
     */
    public static AnonymousClass30Y A00(Context context, AnonymousClass1AK r8, AnonymousClass1HD r9, boolean z) {
        int i;
        int nextTransition = r9.getNextTransition();
        int nextAnim = r9.getNextAnim();
        boolean z2 = false;
        r9.setNextAnim(0);
        View A00 = r8.A00(r9.mContainerId);
        if (!(A00 == null || A00.getTag(C0003R.C0005id.visible_removing_fragment_view_tag) == null)) {
            A00.setTag(C0003R.C0005id.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = r9.mContainer;
        if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
            Animation onCreateAnimation = r9.onCreateAnimation(nextTransition, z, nextAnim);
            if (onCreateAnimation == null) {
                Animator onCreateAnimator = r9.onCreateAnimator(nextTransition, z, nextAnim);
                if (onCreateAnimator != null) {
                    return new AnonymousClass30Y(onCreateAnimator);
                }
                if (nextAnim != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
                    if (equals) {
                        try {
                            Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                            if (loadAnimation != null) {
                                return new AnonymousClass30Y(loadAnimation);
                            }
                            z2 = true;
                        } catch (Resources.NotFoundException e) {
                            throw e;
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!z2) {
                        try {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                            if (loadAnimator != null) {
                                return new AnonymousClass30Y(loadAnimator);
                            }
                        } catch (RuntimeException e2) {
                            if (!equals) {
                                onCreateAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                            } else {
                                throw e2;
                            }
                        }
                    }
                }
                if (nextTransition != 0) {
                    if (nextTransition == 4097) {
                        i = C0003R.anim.fragment_open_exit;
                        if (z) {
                            i = C0003R.anim.fragment_open_enter;
                        }
                    } else if (nextTransition == 4099) {
                        i = C0003R.anim.fragment_fade_exit;
                        if (z) {
                            i = C0003R.anim.fragment_fade_enter;
                        }
                    } else if (nextTransition != 8194) {
                        i = -1;
                    } else {
                        i = C0003R.anim.fragment_close_exit;
                        if (z) {
                            i = C0003R.anim.fragment_close_enter;
                        }
                    }
                    if (i >= 0) {
                        return new AnonymousClass30Y(AnimationUtils.loadAnimation(context, i));
                    }
                }
            }
            return new AnonymousClass30Y(onCreateAnimation);
        }
        return null;
    }
}
