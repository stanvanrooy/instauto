package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1Zj  reason: invalid class name and case insensitive filesystem */
public class C31691Zj extends ViewGroup.MarginLayoutParams {
    public int A00 = 1;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A02 = -1.0f;
    public float A03 = 0.5f;
    public float A04 = -1.0f;
    public float A05 = 1.0f;
    public float A06 = 1.0f;
    public float A07;
    public float A08 = 0.5f;
    public float A09 = 0.5f;
    public float A0A = -1.0f;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = 0;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = -1;
    public int A0S = 0;
    public int A0T = -1;
    public int A0U = -1;
    public int A0V = 0;
    public int A0W = 0;
    public int A0X = 0;
    public int A0Y = 0;
    public int A0Z = 0;
    public int A0a = 0;
    public int A0b = -1;
    public int A0c = -1;
    public int A0d = -1;
    public int A0e;
    public int A0f;
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
    public int A0q = 0;
    public AnonymousClass1ZU A0r = new AnonymousClass1ZU();
    public String A0s = null;
    public boolean A0t = false;
    public boolean A0u = false;
    public boolean A0v = true;
    public boolean A0w = false;
    public boolean A0x = false;
    public boolean A0y = false;
    public boolean A0z = true;

    public final void A00() {
        this.A0w = false;
        this.A0v = true;
        this.A0z = true;
        int i = this.width;
        if (i == -2 && this.A0u) {
            this.A0v = false;
            this.A0W = 1;
        }
        int i2 = this.height;
        if (i2 == -2 && this.A0t) {
            this.A0z = false;
            this.A0V = 1;
        }
        if (i == 0 || i == -1) {
            this.A0v = false;
            if (i == 0 && this.A0W == 1) {
                this.width = -2;
                this.A0u = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A0z = false;
            if (i2 == 0 && this.A0V == 1) {
                this.height = -2;
                this.A0t = true;
            }
        }
        if (this.A02 != -1.0f || this.A0Q != -1 || this.A0R != -1) {
            this.A0w = true;
            this.A0v = true;
            this.A0z = true;
            if (!(this.A0r instanceof C36071hO)) {
                this.A0r = new C36071hO();
            }
            ((C36071hO) this.A0r).A0R(this.A0b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7 = this.leftMargin;
        int i8 = this.rightMargin;
        super.resolveLayoutDirection(i);
        this.A0i = -1;
        this.A0j = -1;
        this.A0g = -1;
        this.A0h = -1;
        this.A0c = -1;
        this.A0d = -1;
        this.A0c = this.A0M;
        this.A0d = this.A0N;
        this.A08 = this.A03;
        this.A0e = this.A0Q;
        this.A0f = this.A0R;
        this.A07 = this.A02;
        boolean z = false;
        boolean z2 = false;
        if (1 == getLayoutDirection()) {
            z2 = true;
        }
        if (z2) {
            int i9 = this.A0m;
            if (i9 != -1) {
                this.A0i = i9;
            } else {
                int i10 = this.A0n;
                if (i10 != -1) {
                    this.A0j = i10;
                }
                i3 = this.A0J;
                if (i3 != -1) {
                    this.A0h = i3;
                    z = true;
                }
                i4 = this.A0I;
                if (i4 != -1) {
                    this.A0g = i4;
                    z = true;
                }
                i5 = this.A0O;
                if (i5 != -1) {
                    this.A0d = i5;
                }
                i6 = this.A0L;
                if (i6 != -1) {
                    this.A0c = i6;
                }
                if (z) {
                    this.A08 = 1.0f - this.A03;
                }
                if (this.A0w && this.A0b == 1) {
                    f = this.A02;
                    if (f == -1.0f) {
                        this.A07 = 1.0f - f;
                        this.A0e = -1;
                        this.A0f = -1;
                    } else {
                        int i11 = this.A0Q;
                        if (i11 != -1) {
                            this.A0f = i11;
                            this.A0e = -1;
                            this.A07 = -1.0f;
                        } else {
                            int i12 = this.A0R;
                            if (i12 != -1) {
                                this.A0e = i12;
                                this.A0f = -1;
                                this.A07 = -1.0f;
                            }
                        }
                    }
                }
            }
            z = true;
            i3 = this.A0J;
            if (i3 != -1) {
            }
            i4 = this.A0I;
            if (i4 != -1) {
            }
            i5 = this.A0O;
            if (i5 != -1) {
            }
            i6 = this.A0L;
            if (i6 != -1) {
            }
            if (z) {
            }
            f = this.A02;
            if (f == -1.0f) {
            }
        } else {
            int i13 = this.A0m;
            if (i13 != -1) {
                this.A0h = i13;
            }
            int i14 = this.A0n;
            if (i14 != -1) {
                this.A0g = i14;
            }
            int i15 = this.A0J;
            if (i15 != -1) {
                this.A0i = i15;
            }
            int i16 = this.A0I;
            if (i16 != -1) {
                this.A0j = i16;
            }
            int i17 = this.A0O;
            if (i17 != -1) {
                this.A0c = i17;
            }
            int i18 = this.A0L;
            if (i18 != -1) {
                this.A0d = i18;
            }
        }
        if (this.A0J == -1 && this.A0I == -1 && this.A0n == -1 && this.A0m == -1) {
            int i19 = this.A0k;
            if (i19 != -1) {
                this.A0i = i19;
            } else {
                int i20 = this.A0l;
                if (i20 != -1) {
                    this.A0j = i20;
                }
                i2 = this.A0T;
                if (i2 == -1) {
                    this.A0g = i2;
                } else {
                    int i21 = this.A0U;
                    if (i21 != -1) {
                        this.A0h = i21;
                    } else {
                        return;
                    }
                }
                if (this.leftMargin <= 0 && i7 > 0) {
                    this.leftMargin = i7;
                    return;
                }
            }
            if (this.rightMargin <= 0 && i8 > 0) {
                this.rightMargin = i8;
            }
            i2 = this.A0T;
            if (i2 == -1) {
            }
            if (this.leftMargin <= 0) {
            }
        }
    }

    public C31691Zj(int i, int i2) {
        super(i, i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x025d, code lost:
        android.util.Log.e("ConstraintLayout", r0);
     */
    public C31691Zj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31681Zi.A00);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (C31701Zk.A00.get(index)) {
                case 1:
                    this.A0b = obtainStyledAttributes.getInt(index, this.A0b);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.A0E);
                    this.A0E = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        this.A0E = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    this.A0F = obtainStyledAttributes.getDimensionPixelSize(index, this.A0F);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.A01) % 360.0f;
                    this.A01 = f;
                    if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        break;
                    } else {
                        this.A01 = (360.0f - f) % 360.0f;
                        break;
                    }
                case 5:
                    this.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0Q);
                    break;
                case 6:
                    this.A0R = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0R);
                    break;
                case 7:
                    this.A02 = obtainStyledAttributes.getFloat(index, this.A02);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.A0T);
                    this.A0T = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        this.A0T = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.A0U);
                    this.A0U = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        this.A0U = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.A0k);
                    this.A0k = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        this.A0k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.A0l);
                    this.A0l = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        this.A0l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.A0p);
                    this.A0p = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        this.A0p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.A0o);
                    this.A0o = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        this.A0o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.A0D);
                    this.A0D = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        this.A0D = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.A0C);
                    this.A0C = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        this.A0C = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.A0B);
                    this.A0B = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        this.A0B = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.A0m);
                    this.A0m = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        this.A0m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.A0n);
                    this.A0n = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        this.A0n = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.A0J);
                    this.A0J = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        this.A0J = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.A0I);
                    this.A0I = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        this.A0I = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    this.A0M = obtainStyledAttributes.getDimensionPixelSize(index, this.A0M);
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    this.A0P = obtainStyledAttributes.getDimensionPixelSize(index, this.A0P);
                    break;
                case 23:
                    this.A0N = obtainStyledAttributes.getDimensionPixelSize(index, this.A0N);
                    break;
                case 24:
                    this.A0K = obtainStyledAttributes.getDimensionPixelSize(index, this.A0K);
                    break;
                case 25:
                    this.A0O = obtainStyledAttributes.getDimensionPixelSize(index, this.A0O);
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    this.A0L = obtainStyledAttributes.getDimensionPixelSize(index, this.A0L);
                    break;
                case 27:
                    this.A0u = obtainStyledAttributes.getBoolean(index, this.A0u);
                    break;
                case 28:
                    this.A0t = obtainStyledAttributes.getBoolean(index, this.A0t);
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                    break;
                case 30:
                    this.A09 = obtainStyledAttributes.getFloat(index, this.A09);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.A0W = i3;
                    if (i3 != 1) {
                        break;
                    } else {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.A0V = i4;
                    if (i4 != 1) {
                        break;
                    } else {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                    }
                case 33:
                    try {
                        this.A0a = obtainStyledAttributes.getDimensionPixelSize(index, this.A0a);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.A0a) != -2) {
                            break;
                        } else {
                            this.A0a = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        this.A0Y = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Y);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.A0Y) != -2) {
                            break;
                        } else {
                            this.A0Y = -2;
                            break;
                        }
                    }
                case 35:
                    this.A06 = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, obtainStyledAttributes.getFloat(index, this.A06));
                    break;
                case 36:
                    try {
                        this.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Z);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.A0Z) != -2) {
                            break;
                        } else {
                            this.A0Z = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        this.A0X = obtainStyledAttributes.getDimensionPixelSize(index, this.A0X);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.A0X) != -2) {
                            break;
                        } else {
                            this.A0X = -2;
                            break;
                        }
                    }
                case 38:
                    this.A05 = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, obtainStyledAttributes.getFloat(index, this.A05));
                    break;
                case 44:
                    String string = obtainStyledAttributes.getString(index);
                    this.A0s = string;
                    this.A00 = -1;
                    if (string == null) {
                        break;
                    } else {
                        int length = string.length();
                        int indexOf = string.indexOf(44);
                        if (indexOf <= 0 || indexOf >= length - 1) {
                            i = 0;
                        } else {
                            String substring = string.substring(0, indexOf);
                            if (substring.equalsIgnoreCase("W")) {
                                this.A00 = 0;
                            } else if (substring.equalsIgnoreCase("H")) {
                                this.A00 = 1;
                            }
                            i = indexOf + 1;
                        }
                        String str2 = this.A0s;
                        int indexOf2 = str2.indexOf(58);
                        if (indexOf2 >= 0 && indexOf2 < length - 1) {
                            String substring2 = str2.substring(i, indexOf2);
                            String substring3 = this.A0s.substring(indexOf2 + 1);
                            if (substring2.length() > 0 && substring3.length() > 0) {
                                try {
                                    float parseFloat = Float.parseFloat(substring2);
                                    Float.parseFloat(substring3);
                                    if (parseFloat <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                        break;
                                    } else {
                                        break;
                                    }
                                } catch (NumberFormatException unused5) {
                                    break;
                                }
                            }
                        } else {
                            String substring4 = str2.substring(i);
                            if (substring4.length() <= 0) {
                                break;
                            } else {
                                Float.parseFloat(substring4);
                                break;
                            }
                        }
                    }
                    break;
                case 45:
                    this.A04 = obtainStyledAttributes.getFloat(index, this.A04);
                    break;
                case 46:
                    this.A0A = obtainStyledAttributes.getFloat(index, this.A0A);
                    break;
                case 47:
                    this.A0S = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 48:
                    this.A0q = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 49:
                    this.A0G = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0G);
                    break;
                case AMD.MAX_LIKES_PER_FETCH /*50*/:
                    this.A0H = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0H);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        A00();
    }

    public C31691Zj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
