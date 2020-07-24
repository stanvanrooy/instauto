package com.instagram.business.controller.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public enum ConversionStep implements Parcelable {
    INTRO("intro"),
    ACCOUNT_TYPE_SELECTION("account_type_selection"),
    ACCOUNT_TYPE_SELECTION_WITH_VALUE_PROP("account_type_selection_with_value_prop"),
    CREATOR_ACCOUNT_DESCRIPTION("creator_account_description"),
    CREATE_PAGE("create_page"),
    FACEBOOK_CONNECT("fb_account_selection"),
    PAGE_SELECTION("page_selection"),
    CHOOSE_CATEGORY("choose_category"),
    EDIT_CONTACT("edit_contact_info"),
    PROFILE_DISPLAY_OPTIONS("profile_display_options"),
    PAGES_LOADER("loading_pages"),
    SIGNUP_SPLASH("signup_intro"),
    CONTACT_POINT("contact_point"),
    ACCOUNT_INFO("name_password"),
    BIRTHDAY("birthday"),
    BIZ_PHONE_CONFIRMATION("phone_confirmation"),
    SIGNUP_CONFIRMATION("welcome_user"),
    EDIT_USERNAME("edit_username"),
    SUGGEST_BUSINESS("suggest_business"),
    ONBOARDING_CHECKLIST("onboarding_checklist");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(259);
    }

    /* access modifiers changed from: public */
    ConversionStep(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
