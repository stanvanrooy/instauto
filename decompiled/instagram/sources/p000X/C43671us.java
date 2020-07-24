package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1us  reason: invalid class name and case insensitive filesystem */
public final class C43671us {
    public static SparseIntArray A01;
    public static final int[] A02 = {0, 4, 8};
    public HashMap A00 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A01 = sparseIntArray;
        sparseIntArray.append(55, 25);
        A01.append(56, 26);
        A01.append(58, 29);
        A01.append(59, 30);
        A01.append(64, 36);
        A01.append(63, 35);
        A01.append(37, 4);
        A01.append(36, 3);
        A01.append(34, 1);
        A01.append(72, 6);
        A01.append(73, 7);
        A01.append(44, 17);
        A01.append(45, 18);
        A01.append(46, 19);
        A01.append(0, 27);
        A01.append(60, 32);
        A01.append(61, 33);
        A01.append(43, 10);
        A01.append(42, 9);
        A01.append(76, 13);
        A01.append(79, 16);
        A01.append(77, 14);
        A01.append(74, 11);
        A01.append(78, 15);
        A01.append(75, 12);
        A01.append(67, 40);
        A01.append(53, 39);
        A01.append(52, 41);
        A01.append(66, 42);
        A01.append(51, 20);
        A01.append(65, 37);
        A01.append(41, 5);
        A01.append(54, 75);
        A01.append(62, 75);
        A01.append(57, 75);
        A01.append(35, 75);
        A01.append(33, 75);
        A01.append(5, 24);
        A01.append(7, 28);
        A01.append(23, 31);
        A01.append(24, 8);
        A01.append(6, 34);
        A01.append(8, 2);
        A01.append(3, 23);
        A01.append(4, 21);
        A01.append(2, 22);
        A01.append(13, 43);
        A01.append(26, 44);
        A01.append(21, 45);
        A01.append(22, 46);
        A01.append(20, 60);
        A01.append(18, 47);
        A01.append(19, 48);
        A01.append(14, 49);
        A01.append(15, 50);
        A01.append(16, 51);
        A01.append(17, 52);
        A01.append(25, 53);
        A01.append(68, 54);
        A01.append(47, 55);
        A01.append(69, 56);
        A01.append(48, 57);
        A01.append(70, 58);
        A01.append(49, 59);
        A01.append(38, 61);
        A01.append(40, 62);
        A01.append(39, 63);
        A01.append(1, 38);
        A01.append(71, 69);
        A01.append(50, 70);
        A01.append(29, 71);
        A01.append(28, 72);
        A01.append(30, 73);
        A01.append(27, 74);
    }

    public static String A02(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static C465820a A01(C43671us r3, int i) {
        HashMap hashMap = r3.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            r3.A00.put(valueOf, new C465820a());
        }
        return (C465820a) r3.A00.get(valueOf);
    }

    public static int[] A03(View view, String str) {
        int i;
        Object obj;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = C697033h.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim instanceof String) {
                    String str2 = trim;
                    HashMap hashMap = constraintLayout.A09;
                    if (hashMap != null && hashMap.containsKey(str2)) {
                        obj = constraintLayout.A09.get(str2);
                        if (obj != null && (obj instanceof Integer)) {
                            i = ((Integer) obj).intValue();
                        }
                    }
                }
                obj = null;
                i = ((Integer) obj).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public final void A06(int i, int i2) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            C465820a r1 = (C465820a) this.A00.get(valueOf);
            switch (i2) {
                case 1:
                    r1.A0j = -1;
                    r1.A0i = -1;
                    r1.A0h = -1;
                    r1.A0X = -1;
                    return;
                case 2:
                    r1.A0s = -1;
                    r1.A0r = -1;
                    r1.A0q = -1;
                    r1.A0Y = -1;
                    return;
                case 3:
                    r1.A0x = -1;
                    r1.A0y = -1;
                    r1.A0w = -1;
                    r1.A0a = -1;
                    return;
                case 4:
                    r1.A0N = -1;
                    r1.A0M = -1;
                    r1.A0L = -1;
                    r1.A0V = -1;
                    return;
                case 5:
                    r1.A0K = -1;
                    return;
                case 6:
                    r1.A0u = -1;
                    r1.A0v = -1;
                    r1.A0t = -1;
                    r1.A0Z = -1;
                    return;
                case 7:
                    r1.A0U = -1;
                    r1.A0T = -1;
                    r1.A0S = -1;
                    r1.A0W = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final void A0B(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.A00.put(valueOf, new C465820a());
        }
        C465820a r9 = (C465820a) this.A00.get(valueOf);
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    r9.A0i = i3;
                    r9.A0j = -1;
                    return;
                } else if (i4 == 2) {
                    r9.A0j = i3;
                    r9.A0i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A0J("left to ", A02(i4), " undefined"));
                }
            case 2:
                if (i4 == 1) {
                    r9.A0r = i3;
                    r9.A0s = -1;
                    return;
                } else if (i4 == 2) {
                    r9.A0s = i3;
                    r9.A0r = -1;
                    return;
                }
                break;
            case 3:
                if (i4 == 3) {
                    r9.A0y = i3;
                    r9.A0x = -1;
                    r9.A0K = -1;
                    return;
                } else if (i4 == 4) {
                    r9.A0x = i3;
                    r9.A0y = -1;
                    r9.A0K = -1;
                    return;
                }
                break;
            case 4:
                if (i4 == 4) {
                    r9.A0M = i3;
                    r9.A0N = -1;
                    r9.A0K = -1;
                    return;
                } else if (i4 == 3) {
                    r9.A0N = i3;
                    r9.A0M = -1;
                    r9.A0K = -1;
                    return;
                }
                break;
            case 5:
                if (i4 == 5) {
                    r9.A0K = i3;
                    r9.A0M = -1;
                    r9.A0N = -1;
                    r9.A0y = -1;
                    r9.A0x = -1;
                    return;
                }
                break;
            case 6:
                if (i4 == 6) {
                    r9.A0v = i3;
                    r9.A0u = -1;
                    return;
                } else if (i4 == 7) {
                    r9.A0u = i3;
                    r9.A0v = -1;
                    return;
                }
                break;
            case 7:
                if (i4 == 7) {
                    r9.A0T = i3;
                    r9.A0U = -1;
                    return;
                } else if (i4 == 6) {
                    r9.A0U = i3;
                    r9.A0T = -1;
                    return;
                }
                break;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0N(A02(i2), " to ", A02(i4), " unknown"));
        }
        throw new IllegalArgumentException(AnonymousClass000.A0J("right to ", A02(i4), " undefined"));
    }

    public final void A0C(int i, int i2, int i3, int i4, int i5) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.A00.put(valueOf, new C465820a());
        }
        C465820a r9 = (C465820a) this.A00.get(valueOf);
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    r9.A0i = i3;
                    r9.A0j = -1;
                } else if (i4 == 2) {
                    r9.A0j = i3;
                    r9.A0i = -1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A0J("Left to ", A02(i4), " undefined"));
                }
                r9.A0h = i5;
                return;
            case 2:
                if (i4 == 1) {
                    r9.A0r = i3;
                    r9.A0s = -1;
                } else if (i4 == 2) {
                    r9.A0s = i3;
                    r9.A0r = -1;
                }
                r9.A0q = i5;
                return;
            case 3:
                if (i4 == 3) {
                    r9.A0y = i3;
                    r9.A0x = -1;
                    r9.A0K = -1;
                } else if (i4 == 4) {
                    r9.A0x = i3;
                    r9.A0y = -1;
                    r9.A0K = -1;
                }
                r9.A0w = i5;
                return;
            case 4:
                if (i4 == 4) {
                    r9.A0M = i3;
                    r9.A0N = -1;
                    r9.A0K = -1;
                } else if (i4 == 3) {
                    r9.A0N = i3;
                    r9.A0M = -1;
                    r9.A0K = -1;
                }
                r9.A0L = i5;
                return;
            case 5:
                if (i4 == 5) {
                    r9.A0K = i3;
                    r9.A0M = -1;
                    r9.A0N = -1;
                    r9.A0y = -1;
                    r9.A0x = -1;
                    return;
                }
                break;
            case 6:
                if (i4 == 6) {
                    r9.A0v = i3;
                    r9.A0u = -1;
                } else if (i4 == 7) {
                    r9.A0u = i3;
                    r9.A0v = -1;
                }
                r9.A0t = i5;
                return;
            case 7:
                if (i4 == 7) {
                    r9.A0T = i3;
                    r9.A0U = -1;
                } else if (i4 == 6) {
                    r9.A0U = i3;
                    r9.A0T = -1;
                }
                r9.A0S = i5;
                return;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0N(A02(i2), " to ", A02(i4), " unknown"));
        }
        throw new IllegalArgumentException(AnonymousClass000.A0J("right to ", A02(i4), " undefined"));
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public final void A04(int i, float f) {
        A01(this, i).A0J = f;
    }

    public final void A05(int i, float f) {
        A01(this, i).A05 = f;
    }

    public final void A07(int i, int i2) {
        A01(this, i).A0l = i2;
    }

    public final void A08(int i, int i2) {
        A01(this, i).A0o = i2;
    }

    public final void A09(int i, int i2) {
        C465820a A012 = A01(this, i);
        A012.A1A = true;
        A012.A0p = i2;
    }

    public final void A0A(int i, int i2, int i3) {
        C465820a A012 = A01(this, i);
        switch (i2) {
            case 1:
                A012.A0h = i3;
                return;
            case 2:
                A012.A0q = i3;
                return;
            case 3:
                A012.A0w = i3;
                return;
            case 4:
                A012.A0L = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                A012.A0t = i3;
                return;
            case 7:
                A012.A0S = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void A0D(int i, int i2, int... iArr) {
        C465820a A012 = A01(this, i);
        A012.A0m = 1;
        A012.A0k = i2;
        A012.A1A = false;
        A012.A1B = iArr;
    }

    public final void A0E(ConstraintLayout constraintLayout) {
        A0F(constraintLayout);
        constraintLayout.A07 = null;
    }

    public final void A0F(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.A00.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = this.A00;
                Integer valueOf = Integer.valueOf(id);
                if (hashMap.containsKey(valueOf)) {
                    hashSet.remove(valueOf);
                    C465820a r8 = (C465820a) this.A00.get(valueOf);
                    if (childAt instanceof Barrier) {
                        r8.A0m = 1;
                    }
                    int i2 = r8.A0m;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(r8.A0k);
                        barrier.setAllowsGoneWidget(r8.A19);
                        int[] iArr = r8.A1B;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = r8.A15;
                            if (str != null) {
                                int[] A03 = A03(barrier, str);
                                r8.A1B = A03;
                                barrier.setReferencedIds(A03);
                            }
                        }
                    }
                    C31691Zj r0 = (C31691Zj) childAt.getLayoutParams();
                    r8.A00(r0);
                    childAt.setLayoutParams(r0);
                    childAt.setVisibility(r8.A10);
                    childAt.setAlpha(r8.A00);
                    childAt.setRotation(r8.A07);
                    childAt.setRotationX(r8.A08);
                    childAt.setRotationY(r8.A09);
                    childAt.setScaleX(r8.A0A);
                    childAt.setScaleY(r8.A0B);
                    float f = r8.A0C;
                    if (!Float.isNaN(f)) {
                        childAt.setPivotX(f);
                    }
                    float f2 = r8.A0D;
                    if (!Float.isNaN(f2)) {
                        childAt.setPivotY(f2);
                    }
                    childAt.setTranslationX(r8.A0E);
                    childAt.setTranslationY(r8.A0F);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(r8.A0G);
                        if (r8.A16) {
                            childAt.setElevation(r8.A02);
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C465820a r3 = (C465820a) this.A00.get(num);
            int i3 = r3.A0m;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = r3.A1B;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = r3.A15;
                    if (str2 != null) {
                        int[] A032 = A03(barrier2, str2);
                        r3.A1B = A032;
                        barrier2.setReferencedIds(A032);
                    }
                }
                barrier2.setType(r3.A0k);
                C31691Zj r1 = new C31691Zj(-2, -2);
                barrier2.A01();
                r3.A00(r1);
                constraintLayout.addView(barrier2, r1);
            }
            if (r3.A1A) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C31691Zj r12 = new C31691Zj(-2, -2);
                r3.A00(r12);
                constraintLayout.addView(guideline, r12);
            }
        }
    }

    public final void A0G(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.A00.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C31691Zj r1 = (C31691Zj) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = this.A00;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    this.A00.put(valueOf, new C465820a());
                }
                C465820a r2 = (C465820a) this.A00.get(valueOf);
                r2.A0n = id;
                r2.A0i = r1.A0T;
                r2.A0j = r1.A0U;
                r2.A0r = r1.A0k;
                r2.A0s = r1.A0l;
                r2.A0y = r1.A0p;
                r2.A0x = r1.A0o;
                r2.A0N = r1.A0D;
                r2.A0M = r1.A0C;
                r2.A0K = r1.A0B;
                r2.A0u = r1.A0m;
                r2.A0v = r1.A0n;
                r2.A0U = r1.A0J;
                r2.A0T = r1.A0I;
                r2.A05 = r1.A03;
                r2.A0H = r1.A09;
                r2.A14 = r1.A0s;
                r2.A0O = r1.A0E;
                r2.A0P = r1.A0F;
                r2.A01 = r1.A01;
                r2.A0Q = r1.A0G;
                r2.A0R = r1.A0H;
                r2.A0p = r1.A0b;
                r2.A03 = r1.A02;
                r2.A0b = r1.A0Q;
                r2.A0c = r1.A0R;
                r2.A0o = r1.width;
                r2.A0l = r1.height;
                r2.A0h = r1.leftMargin;
                r2.A0q = r1.rightMargin;
                r2.A0w = r1.topMargin;
                r2.A0L = r1.bottomMargin;
                r2.A0I = r1.A0A;
                r2.A06 = r1.A04;
                r2.A0z = r1.A0q;
                r2.A0g = r1.A0S;
                boolean z = r1.A0u;
                r2.A18 = z;
                r2.A17 = r1.A0t;
                r2.A11 = r1.A0W;
                r2.A0d = r1.A0V;
                r2.A18 = z;
                r2.A12 = r1.A0Y;
                r2.A0e = r1.A0X;
                r2.A13 = r1.A0a;
                r2.A0f = r1.A0Z;
                r2.A0J = r1.A06;
                r2.A04 = r1.A05;
                r2.A0S = r1.getMarginEnd();
                r2.A0t = r1.getMarginStart();
                r2.A10 = childAt.getVisibility();
                r2.A00 = childAt.getAlpha();
                r2.A07 = childAt.getRotation();
                r2.A08 = childAt.getRotationX();
                r2.A09 = childAt.getRotationY();
                r2.A0A = childAt.getScaleX();
                r2.A0B = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    r2.A0C = pivotX;
                    r2.A0D = pivotY;
                }
                r2.A0E = childAt.getTranslationX();
                r2.A0F = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    r2.A0G = childAt.getTranslationZ();
                    if (r2.A16) {
                        r2.A02 = childAt.getElevation();
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    r2.A19 = barrier.A01.A01;
                    r2.A1B = barrier.getReferencedIds();
                    r2.A0k = barrier.A00;
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
