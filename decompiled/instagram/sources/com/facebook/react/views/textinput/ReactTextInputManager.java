package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.DexStore;
import com.facebook.flipper.core.StateSummary;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p000X.A06;
import p000X.A0G;
import p000X.A0k;
import p000X.A1e;
import p000X.A1k;
import p000X.A3N;
import p000X.A3W;
import p000X.A62;
import p000X.A9C;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0CH;
import p000X.C019000b;
import p000X.C173787bd;
import p000X.C177227hX;
import p000X.C200298ho;
import p000X.C230069z8;
import p000X.C230079z9;
import p000X.C230099zE;
import p000X.C230109zF;
import p000X.C230119zG;
import p000X.C230139zI;
import p000X.C230149zJ;
import p000X.C230159zT;
import p000X.C230169zU;
import p000X.C230199zX;
import p000X.C230209zY;
import p000X.C230219zZ;
import p000X.C230229za;
import p000X.C230289zh;
import p000X.C230299zk;
import p000X.C230349zs;
import p000X.C230359zx;
import p000X.C230379zz;
import p000X.C23053A3d;

@ReactModule(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager {
    public static final int AUTOCAPITALIZE_FLAGS = 28672;
    public static final int BLUR_TEXT_INPUT = 2;
    public static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    public static final int FOCUS_TEXT_INPUT = 1;
    public static final int IME_ACTION_ID = 1648;
    public static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    public static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    public static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    public static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    public static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    public static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    public static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    public static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    public static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    public static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    public static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    public static final int SET_TEXT_AND_SELECTION = 4;
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = "ReactTextInputManager";
    public static final int UNSET = -1;
    public final A0G mReactTextViewManagerCallback;

    public Map getCommandsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("focusTextInput", 1);
        hashMap.put("blurTextInput", 2);
        return hashMap;
    }

    public Map getExportedViewConstants() {
        Integer valueOf = Integer.valueOf(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        HashMap hashMap = new HashMap();
        hashMap.put(NetInfoModule.CONNECTION_TYPE_NONE, 0);
        hashMap.put("characters", 4096);
        hashMap.put("words", 8192);
        hashMap.put("sentences", valueOf);
        return C230299zk.A00("AutoCapitalizationType", hashMap);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(C230139zI r3, boolean z) {
        int i = 0;
        int i2 = DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (z) {
            i2 = 0;
        }
        if (z) {
            i = DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        updateStagedInputTypeFlag(r3, i2, i);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C230139zI r3, boolean z) {
        int i = 0;
        int i2 = 144;
        if (z) {
            i2 = 0;
        }
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(r3, i2, i);
        checkPasswordType(r3);
    }

    @ReactProp(name = "autoCompleteType")
    public void setTextContentType(C230139zI r6, String str) {
        String[] strArr;
        String str2;
        if (str != null) {
            String str3 = "username";
            if (!str3.equals(str)) {
                str3 = "password";
                if (!str3.equals(str)) {
                    if (IgReactPurchaseExperienceBridgeModule.EMAIL.equals(str)) {
                        strArr = new String[1];
                        str2 = "emailAddress";
                    } else {
                        str3 = "name";
                        if (!str3.equals(str)) {
                            if ("tel".equals(str)) {
                                strArr = new String[1];
                                str2 = "phone";
                            } else if (StateSummary.$const$string(79).equals(str)) {
                                strArr = new String[1];
                                str2 = "postalAddress";
                            } else if ("postal-code".equals(str)) {
                                strArr = new String[1];
                                str2 = "postalCode";
                            } else if ("cc-number".equals(str)) {
                                strArr = new String[1];
                                str2 = "creditCardNumber";
                            } else if ("cc-csc".equals(str)) {
                                strArr = new String[1];
                                str2 = "creditCardSecurityCode";
                            } else if ("cc-exp".equals(str)) {
                                strArr = new String[1];
                                str2 = "creditCardExpirationDate";
                            } else if ("cc-exp-month".equals(str)) {
                                strArr = new String[1];
                                str2 = "creditCardExpirationMonth";
                            } else if ("cc-exp-year".equals(str)) {
                                strArr = new String[1];
                                str2 = "creditCardExpirationYear";
                            } else if (!"off".equals(str)) {
                                throw new A0k(AnonymousClass000.A0E("Invalid autoCompleteType: ", str));
                            }
                        }
                    }
                    strArr[0] = str2;
                    setAutofillHints(r6, strArr);
                    return;
                }
            }
            setAutofillHints(r6, str3);
            return;
        }
        setImportantForAutofill(r6, 2);
    }

    public static void checkPasswordType(C230139zI r3) {
        int i = r3.A03;
        if ((i & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (i & 128) != 0) {
            updateStagedInputTypeFlag(r3, 128, 16);
        }
    }

    private C230209zY getReactTextUpdate(String str, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C177227hX.A00(str, Constants.A0Y));
        return new C230209zY(spannableStringBuilder, i, false, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0, 0, i2, i3);
    }

    private void setAutofillHints(C230139zI r3, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            r3.setAutofillHints(strArr);
        }
    }

    public static void updateStagedInputTypeFlag(C230139zI r2, int i, int i2) {
        r2.A03 = ((i ^ -1) & r2.A03) | i2;
    }

    public EditText createInternalEditText(C23053A3d a3d) {
        return new EditText(a3d);
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bubbled", "onSubmitEditing");
        hashMap2.put("captured", "onSubmitEditingCapture");
        hashMap.put("topSubmitEditing", C230299zk.A00("phasedRegistrationNames", hashMap2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("bubbled", "onEndEditing");
        hashMap3.put("captured", "onEndEditingCapture");
        hashMap.put("topEndEditing", C230299zk.A00("phasedRegistrationNames", hashMap3));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("bubbled", "onTextInput");
        hashMap4.put("captured", "onTextInputCapture");
        hashMap.put("topTextInput", C230299zk.A00("phasedRegistrationNames", hashMap4));
        HashMap hashMap5 = new HashMap();
        hashMap5.put("bubbled", "onFocus");
        hashMap5.put("captured", "onFocusCapture");
        hashMap.put("topFocus", C230299zk.A00("phasedRegistrationNames", hashMap5));
        HashMap hashMap6 = new HashMap();
        hashMap6.put("bubbled", "onBlur");
        hashMap6.put("captured", "onBlurCapture");
        hashMap.put("topBlur", C230299zk.A00("phasedRegistrationNames", hashMap6));
        HashMap hashMap7 = new HashMap();
        hashMap7.put("bubbled", "onKeyPress");
        hashMap7.put("captured", "onKeyPressCapture");
        hashMap.put("topKeyPress", C230299zk.A00("phasedRegistrationNames", hashMap7));
        return hashMap;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(A62.A00(Constants.A0C), C230299zk.A00("registrationName", "onScroll"));
        return hashMap;
    }

    @ReactProp(name = "autoCorrect")
    public void setAutoCorrect(C230139zI r3, Boolean bool) {
        int i;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            i = DexStore.LOAD_RESULT_WITH_VDEX_ODEX;
            if (booleanValue) {
                i = DexStore.LOAD_RESULT_PGO;
            }
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(r3, 557056, i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C230139zI r5, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        A06.A00(r5.A08).A0A(SPACING_TYPES[i], intValue, f);
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C230139zI r2, boolean z) {
        r2.setCursorVisible(!z);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(C230139zI r6, Integer num) {
        String str;
        if (num == null) {
            Context context = r6.getContext();
            ColorStateList A00 = C230289zh.A00(context, 16842904);
            if (A00 != null) {
                r6.setTextColor(A00);
                return;
            }
            r6.getContext();
            if (context != null) {
                str = context.getClass().getCanonicalName();
            } else {
                str = "null";
            }
            ReactSoftException.logSoftException(TAG, new IllegalStateException(AnonymousClass000.A0E("Could not get default text color from View Context: ", str)));
            return;
        }
        r6.setTextColor(num.intValue());
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C230139zI r2, boolean z) {
        r2.setOnLongClickListener(new C230359zx(this, z));
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public void setCursorColor(C230139zI r7, Integer num) {
        if (num != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Drawable textCursorDrawable = r7.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
                    r7.setTextCursorDrawable(textCursorDrawable);
                }
            } else if (i != 28) {
                Class<TextView> cls = TextView.class;
                try {
                    Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    int i2 = declaredField.getInt(r7);
                    if (i2 != 0) {
                        Drawable A03 = C019000b.A03(r7.getContext(), i2);
                        A03.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                        Drawable[] drawableArr = {A03, A03};
                        Field declaredField2 = cls.getDeclaredField("mEditor");
                        declaredField2.setAccessible(true);
                        Object obj = declaredField2.get(r7);
                        Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                        declaredField3.setAccessible(true);
                        declaredField3.set(obj, drawableArr);
                    }
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                }
            }
        }
    }

    @ReactProp(name = "keyboardType")
    public void setKeyboardType(C230139zI r3, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else {
            i = 1;
            if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
                i = 144;
            }
        }
        updateStagedInputTypeFlag(r3, 15, i);
        checkPasswordType(r3);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C230139zI r2, boolean z) {
        if (z) {
            r2.A05 = new C230169zU(r2);
        } else {
            r2.A05 = null;
        }
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C230139zI r2, boolean z) {
        if (z) {
            r2.A06 = new C230199zX(r2);
        } else {
            r2.A06 = null;
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C230139zI r2, boolean z) {
        if (z) {
            r2.A07 = new C230229za(this, r2);
        } else {
            r2.A07 = null;
        }
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C230139zI r3, Integer num) {
        if (num == null) {
            r3.setHintTextColor(C230289zh.A00(r3.getContext(), 16842906));
        } else {
            r3.setHintTextColor(num.intValue());
        }
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(C230139zI r2, String str) {
        r2.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C230139zI r3, Integer num) {
        int intValue;
        if (num == null) {
            intValue = C230289zh.A00(r3.getContext(), 16842905).getDefaultColor();
        } else {
            intValue = num.intValue();
        }
        r3.setHighlightColor(intValue);
        setCursorColor(r3, num);
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(C230139zI r6, String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                r6.setJustificationMode(0);
            }
            if (str == null || "auto".equals(str)) {
                r6.setGravityHorizontal(0);
                return;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    r6.setGravityHorizontal(5);
                    return;
                } else if ("center".equals(str)) {
                    r6.setGravityHorizontal(1);
                    return;
                } else {
                    throw new A0k(AnonymousClass000.A0E("Invalid textAlign: ", str));
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            r6.setJustificationMode(1);
        }
        r6.setGravityHorizontal(3);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(C230139zI r3, String str) {
        if (str == null || "auto".equals(str)) {
            r3.setGravityVertical(0);
        } else if ("top".equals(str)) {
            r3.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            r3.setGravityVertical(80);
        } else if ("center".equals(str)) {
            r3.setGravityVertical(16);
        } else {
            throw new A0k(AnonymousClass000.A0E("Invalid textAlignVertical: ", str));
        }
    }

    public static A9C getEventDispatcher(A3N a3n, C230139zI r2) {
        return A3W.A02(a3n, r2.getId());
    }

    public Class getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(name = "autoCapitalize")
    public void setAutoCapitalize(C230139zI r4, A1k a1k) {
        ReadableType AZ8 = a1k.AZ8();
        ReadableType readableType = ReadableType.Number;
        int i = DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        if (AZ8 == readableType) {
            i = a1k.A5t();
        } else if (a1k.AZ8() == ReadableType.String) {
            String A5y = a1k.A5y();
            if (A5y.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                i = 0;
            } else if (A5y.equals("characters")) {
                i = 4096;
            } else if (A5y.equals("words")) {
                i = 8192;
            }
        }
        updateStagedInputTypeFlag(r4, AUTOCAPITALIZE_FLAGS, i);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C230139zI r3, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (i == 0) {
            r3.setBorderRadius(f);
            return;
        }
        A06.A00(r3.A08).A08(f, i - 1);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C230139zI r3, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        A06.A00(r3.A08).A09(SPACING_TYPES[i], f);
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(C230139zI r3, String str) {
        r3.setCompoundDrawablesWithIntrinsicBounds(C200298ho.A00().A01(r3.getContext(), str), 0, 0, 0);
    }

    @ReactProp(name = "maxLength")
    public void setMaxLength(C230139zI r8, Integer num) {
        InputFilter[] filters = r8.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (r4 > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else {
            int length = filters.length;
            if (length > 0) {
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    if (filters[i] instanceof InputFilter.LengthFilter) {
                        filters[i] = new InputFilter.LengthFilter(num.intValue());
                        z = true;
                    }
                }
                inputFilterArr = filters;
                if (!z) {
                    inputFilterArr = new InputFilter[(length + 1)];
                    System.arraycopy(filters, 0, inputFilterArr, 0, length);
                    filters[length] = new InputFilter.LengthFilter(num.intValue());
                }
            } else {
                inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
            }
        }
        r8.setFilters(inputFilterArr);
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C230139zI r5, Integer num) {
        Drawable background = r5.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e) {
                AnonymousClass0CH.A09(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C230139zI r1, boolean z) {
        r1.setAllowFontScaling(z);
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C230139zI r1, boolean z) {
        r1.A0C = z;
    }

    @ReactProp(name = "blurOnSubmit")
    public void setBlurOnSubmit(C230139zI r1, Boolean bool) {
        r1.A09 = bool;
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(C230139zI r1, String str) {
        r1.setBorderStyle(str);
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C230139zI r1, boolean z) {
        r1.setDisableFullscreenUI(z);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(C230139zI r1, boolean z) {
        r1.setEnabled(z);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(C230139zI r1, String str) {
        r1.setFontFamily(str);
    }

    @ReactProp(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C230139zI r1, float f) {
        r1.setFontSize(f);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(C230139zI r1, String str) {
        r1.setFontStyle(str);
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(C230139zI r1, String str) {
        r1.setFontWeight(str);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C230139zI r1, boolean z) {
        r1.setIncludeFontPadding(z);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(C230139zI r1, int i) {
        r1.setCompoundDrawablePadding(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C230139zI r1, float f) {
        r1.setLetterSpacingPt(f);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C230139zI r1, float f) {
        r1.setMaxFontSizeMultiplier(f);
    }

    @ReactProp(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C230139zI r1, int i) {
        r1.setLines(i);
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C230139zI r1, boolean z) {
        r1.A0E = z;
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(C230139zI r1, String str) {
        r1.setHint(str);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(C230139zI r1, String str) {
        r1.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C230139zI r1, boolean z) {
        r1.setSelectAllOnFocus(z);
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C230139zI r1, boolean z) {
        r1.setShowSoftInputOnFocus(z);
    }

    public void addEventEmitters(C23053A3d a3d, C230139zI r3) {
        r3.addTextChangedListener(new C230149zJ(this, a3d, r3));
        r3.setOnFocusChangeListener(new C230219zZ(this, a3d, r3));
        r3.setOnEditorActionListener(new C230159zT(this, r3, a3d));
    }

    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    public ReactBaseTextShadowNode createShadowNodeInstance(A0G a0g) {
        return new ReactTextInputShadowNode(a0g);
    }

    public C230139zI createViewInstance(C23053A3d a3d) {
        C230139zI r2 = new C230139zI(a3d);
        r2.setInputType(r2.getInputType() & -131073);
        r2.setReturnKeyType("done");
        return r2;
    }

    public void onAfterUpdateTransaction(C230139zI r6) {
        super.onAfterUpdateTransaction(r6);
        if (r6.A0F) {
            r6.A0F = false;
            r6.setTypeface(C173787bd.A01(r6.getTypeface(), r6.A00, r6.A01, r6.A0A, r6.getContext().getAssets()));
        }
        if (r6.getInputType() != r6.A03) {
            int selectionStart = r6.getSelectionStart();
            int selectionEnd = r6.getSelectionEnd();
            r6.setInputType(r6.A03);
            r6.setSelection(selectionStart, selectionEnd);
        }
    }

    public void receiveCommand(C230139zI r2, int i, A1e a1e) {
        String str;
        if (i == 1) {
            str = "focus";
        } else if (i == 2) {
            str = "blur";
        } else if (i != 3 && i == 4) {
            str = "setTextAndSelection";
        } else {
            return;
        }
        receiveCommand(r2, str, a1e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r10.equals("blurTextInput") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r10.equals("blur") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r10.equals("focus") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r10.equals("setTextAndSelection") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r10.equals("focusTextInput") == false) goto L_0x000d;
     */
    public void receiveCommand(C230139zI r9, String str, A1e a1e) {
        char c;
        int i;
        switch (str.hashCode()) {
            case -1699362314:
                c = 3;
                break;
            case 3027047:
                c = 2;
                break;
            case 97604824:
                c = 0;
                break;
            case 1427010500:
                c = 4;
                break;
            case 1690703013:
                c = 1;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            C230139zI.A02(r9);
        } else if (c == 2 || c == 3) {
            r9.clearFocus();
        } else if (c == 4 && (i = a1e.getInt(0)) != -1) {
            String string = a1e.getString(1);
            int i2 = a1e.getInt(2);
            int i3 = a1e.getInt(3);
            if (i3 == -1) {
                i3 = i2;
            }
            C230209zY reactTextUpdate = getReactTextUpdate(string, i, i2, i3);
            r9.A0D = true;
            r9.A04(reactTextUpdate);
            r9.A0D = false;
            boolean z = false;
            if (i >= r9.A02) {
                z = true;
            }
            if (z && i2 != -1 && i3 != -1) {
                r9.setSelection(i2, i3);
            }
        }
    }

    private void setImportantForAutofill(C230139zI r3, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            r3.setImportantForAutofill(i);
        }
    }

    @ReactProp(name = "importantForAutofill")
    public void setImportantForAutofill(C230139zI r3, String str) {
        int i;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else {
            i = 0;
            if ("yesExcludeDescendants".equals(str)) {
                i = 4;
            }
        }
        setImportantForAutofill(r3, i);
    }

    public void setPadding(C230139zI r1, int i, int i2, int i3, int i4) {
        r1.setPadding(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setPadding(View view, int i, int i2, int i3, int i4) {
        ((C230139zI) view).setPadding(i, i2, i3, i4);
    }

    public void updateExtraData(C230139zI r7, Object obj) {
        if (obj instanceof C230209zY) {
            C230209zY r8 = (C230209zY) obj;
            int i = (int) r8.A02;
            int i2 = (int) r8.A04;
            int i3 = (int) r8.A03;
            int i4 = (int) r8.A01;
            if (!(i == -1 && i2 == -1 && i3 == -1 && i4 == -1)) {
                if (i == -1) {
                    i = r7.getPaddingLeft();
                }
                if (i2 == -1) {
                    i2 = r7.getPaddingTop();
                }
                if (i3 == -1) {
                    i3 = r7.getPaddingRight();
                }
                if (i4 == -1) {
                    i4 = r7.getPaddingBottom();
                }
                r7.setPadding(i, i2, i3, i4);
            }
            if (r8.A0C) {
                Spannable spannable = r8.A0B;
                for (int i5 = 0; i5 < ((C230119zG[]) spannable.getSpans(0, spannable.length(), C230119zG.class)).length; i5++) {
                }
            }
            r7.A04(r8);
            int i6 = r8.A05;
            int i7 = r8.A08;
            int i8 = r8.A07;
            boolean z = false;
            if (i6 >= r7.A02) {
                z = true;
            }
            if (z && i7 != -1 && i8 != -1) {
                r7.setSelection(i7, i8);
            }
        }
    }

    public Object updateState(C230139zI r20, C230099zE r21, C230379zz r22) {
        C230379zz r5 = r22;
        if (r22 != null) {
            ReadableNativeMap state = r5.getState();
            ReadableNativeMap map = state.getMap("attributedString");
            ReadableNativeMap map2 = state.getMap("paragraphAttributes");
            if (map == null || map2 == null) {
                throw new IllegalArgumentException("Invalid TextInput State was received as a parameters");
            }
            C230139zI r6 = r20;
            Spannable A01 = C230069z8.A01(r6.getContext(), map, this.mReactTextViewManagerCallback);
            int A03 = C230079z9.A03(map2.getString("textBreakStrategy"));
            r6.A04 = r5;
            C230099zE r2 = r21;
            C230209zY r62 = new C230209zY(A01, state.getInt("mostRecentEventCount"), false, -1.0f, -1.0f, -1.0f, -1.0f, C230079z9.A02(r2, C230069z8.A02(map)), A03, C230079z9.A01(r2), -1, -1);
            r62.A00 = map;
            return r62;
        }
        throw new IllegalArgumentException("Unable to update a NULL state.");
    }
}
