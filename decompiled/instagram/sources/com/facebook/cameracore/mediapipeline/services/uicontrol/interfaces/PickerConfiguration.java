package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

public class PickerConfiguration {
    public final ItemConfiguration[] mItems;
    public final int mSelectedIndex;

    public class ItemConfiguration {
        public final String mId;
        public final String mImageUri;
        public final String mTextureFileName;
        public final String mTitle;

        public ItemConfiguration(String str, String str2, String str3, String str4) {
            this.mImageUri = str;
            this.mTextureFileName = str2;
            this.mTitle = str3;
            this.mId = str4;
        }
    }

    public PickerConfiguration(int i, ItemConfiguration[] itemConfigurationArr) {
        this.mSelectedIndex = i;
        this.mItems = itemConfigurationArr;
    }
}
