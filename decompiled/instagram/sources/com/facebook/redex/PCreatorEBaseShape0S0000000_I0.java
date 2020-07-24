package com.facebook.redex;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.AccessToken;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.CameraConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.video.heroplayer.ipc.AbrContextualSetting;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.HttpTransferEndEvent;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanConfig;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.actionbar.ActionButton;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.math.Matrix3;
import com.instagram.common.math.Matrix4;
import com.instagram.common.p004ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.effectfilter.GradientBackgroundPhotoFilter;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.filter.ImageGradientFilter;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.feed.media.AttributionUser;
import com.instagram.feed.media.ClickToMessagingAdsInfo;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.CropCoordinates;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectConfig;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.ProfilePicture;
import com.instagram.feed.media.ThumbnailImage;
import com.instagram.filterkit.filter.IdentityFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductCheckoutProperties;
import com.instagram.model.shopping.ProductImageContainer;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.p009ui.swipenavigation.SwipeNavigationContainer;
import com.instagram.p009ui.text.TextColorScheme;
import com.instagram.p009ui.text.TextColors;
import com.instagram.p009ui.text.TextShadow;
import com.instagram.p009ui.widget.mediapicker.Folder;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.save.model.SavedCollection;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.MicroUser;
import com.instagram.user.model.usertagentity.UserTagEntity;
import java.util.ArrayList;
import java.util.List;
import p000X.AMD;
import p000X.C120125Dh;
import p000X.C51542Lc;

public class PCreatorEBaseShape0S0000000_I0 extends PCreatorEmptyBase implements Parcelable.Creator {
    public final int A00;

    public PCreatorEBaseShape0S0000000_I0(int i) {
        this.A00 = i;
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                return new NestedScrollView.SavedState(parcel2);
            case 1:
                return new LinearLayoutManager.SavedState(parcel2);
            case 2:
                return new AccessToken(parcel2);
            case 3:
                StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions(parcel2.readString());
                staticMapView$StaticMapOptions.A09 = parcel2.readString();
                staticMapView$StaticMapOptions.A02 = parcel2.readString();
                staticMapView$StaticMapOptions.A08 = parcel2.readString();
                staticMapView$StaticMapOptions.A03 = parcel2.readString();
                staticMapView$StaticMapOptions.A04 = parcel2.readString();
                staticMapView$StaticMapOptions.A05 = parcel2.readString();
                staticMapView$StaticMapOptions.A06 = parcel2.readString();
                staticMapView$StaticMapOptions.A00 = parcel2.readFloat();
                staticMapView$StaticMapOptions.A01 = parcel2.readFloat();
                ArrayList arrayList = new ArrayList();
                staticMapView$StaticMapOptions.A0A = arrayList;
                parcel2.readStringList(arrayList);
                return staticMapView$StaticMapOptions;
            case 4:
                return new ARCapabilityMinVersionModeling(parcel2);
            case 5:
                return new ARRequestAsset(parcel2);
            case 6:
                return new CameraConfig(parcel2);
            case 7:
                return new DeviceConfig(parcel2);
            case 8:
                return new AbrContextualSetting(parcel2);
            case 9:
                return new DynamicPlayerSettings(parcel2);
            case 10:
                return new HttpTransferEndEvent(parcel2);
            case C120125Dh.VIEW_TYPE_BANNER:
                return new LiveState(parcel2);
            case C120125Dh.VIEW_TYPE_SPINNER:
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                int readInt = parcel2.readInt();
                int readInt2 = parcel2.readInt();
                float readFloat = parcel2.readFloat();
                int readInt3 = parcel2.readInt();
                int readInt4 = parcel2.readInt();
                int readInt5 = parcel2.readInt();
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                String readString5 = parcel2.readString();
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                boolean z = false;
                if (parcel2.readInt() == 1) {
                    z = true;
                }
                boolean z2 = false;
                if (parcel2.readInt() == 1) {
                    z2 = true;
                }
                boolean z3 = false;
                if (parcel2.readInt() == 1) {
                    z3 = true;
                }
                boolean z4 = false;
                if (parcel2.readInt() == 1) {
                    z4 = true;
                }
                boolean z5 = false;
                if (parcel2.readInt() == 1) {
                    z5 = true;
                }
                boolean z6 = false;
                if (parcel2.readInt() == 1) {
                    z6 = true;
                }
                return new ParcelableFormat(readString, readString2, readInt, readInt2, readFloat, readInt3, readInt4, readInt5, readString3, readString4, readString5, readString6, readString7, readString8, z, z2, z3, z4, z5, z6);
            case C120125Dh.VIEW_TYPE_BADGE:
                return new ServicePlayerState(parcel2);
            case C120125Dh.VIEW_TYPE_LINK:
                return new VideoPlayContextualSetting(parcel2);
            case 15:
                return new VideoPlayRequest(parcel2);
            case 16:
                return new VideoPrefetchRequest(parcel2);
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return new VideoSource(parcel2);
            case 18:
                return new ParcelableWifiScanConfig(parcel2);
            case 19:
                AccountFamily accountFamily = new AccountFamily(parcel2.readString());
                accountFamily.A00 = (C51542Lc) parcel2.readSerializable();
                List list = accountFamily.A04;
                Parcelable.Creator creator = MicroUser.CREATOR;
                parcel2.readTypedList(list, creator);
                parcel2.readTypedList(accountFamily.A03, creator);
                return accountFamily;
            case 20:
                return new ActionButton.SavedState(parcel2);
            case C120125Dh.VIEW_TYPE_BRANDING:
                return new IgBloksScreenConfig(parcel2);
            case C120125Dh.NUM_VIEW_TYPES:
                return new PageSelectionOverrideData(parcel2);
            case 23:
                return new CameraAREffect(parcel2);
            case 24:
                return new Medium(parcel2);
            case 25:
                return new Matrix3(parcel2);
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return new Matrix4(parcel2);
            case 27:
                return new SimpleImageUrl(parcel2);
            case 28:
                return new FlowingGridLayoutManager.SavedState(parcel2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new CropInfo(parcel2);
            case 30:
                return new GradientBackgroundPhotoFilter(parcel2);
            case 31:
                return new PhotoFilter(parcel2);
            case 32:
                return new ImageGradientFilter(parcel2);
            case 33:
                return new ReactionViewModel(parcel2);
            case 34:
                return new SectionPagination(parcel2);
            case 35:
                return new EntityContextualFeedConfig(parcel2);
            case 36:
                return new Refinement(parcel2);
            case 37:
                return new ExploreFragmentConfig(parcel2);
            case 38:
                return new ExploreTopicCluster(parcel2);
            case 39:
                return new AttributionUser(parcel2);
            case 40:
                return new ClickToMessagingAdsInfo(parcel2);
            case 41:
                return new ClickToMessagingAdsInfo.IcebreakerMessage(parcel2);
            case 42:
                return new ClickToMessagingAdsInfo.OnFeedMessages(parcel2);
            case 43:
                return new CreativeConfig(parcel2);
            case 44:
                return new CropCoordinates(parcel2);
            case 45:
                return new EffectActionSheet(parcel2);
            case 46:
                return new EffectConfig(parcel2);
            case 47:
                return new EffectPreview(parcel2);
            case 48:
                return new ProfilePicture(parcel2);
            case 49:
                return new ThumbnailImage(parcel2);
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                return new IdentityFilter(parcel2);
            case 51:
                return new IgFilterGroup(parcel2);
            case 52:
                return new HashtagContextualFeedConfig(parcel2);
            case 53:
                return new MediaCaptureConfig(parcel2);
            case 54:
                return new DirectThreadKey(parcel2);
            case 55:
                return new DirectAnimatedMedia(parcel2);
            case 56:
                return new TextureAsset(parcel2);
            case 57:
                return new Hashtag(parcel2);
            case 58:
                return new ExtendedImageUrl(parcel2);
            case 59:
                return new ImageInfo(parcel2);
            case 60:
                return new VideoUrlImpl(parcel2);
            case 61:
                return new PeopleTag(parcel2);
            case 62:
                return new PeopleTag.UserInfo(parcel2);
            case 63:
                return new ReelChainingConfig(parcel2);
            case 64:
                return new ReelViewerConfig(parcel2);
            case 65:
                return new Merchant(parcel2);
            case 66:
                return new Product(parcel2);
            case 67:
                return new ProductCheckoutProperties(parcel2);
            case 68:
                return new ProductImageContainer(parcel2);
            case 69:
                return new ProductMention(parcel2);
            case 70:
                return new ProductSource(parcel2);
            case 71:
                return new ProductTag(parcel2);
            case 72:
                return new Venue(parcel2);
            case 73:
                return new MusicAssetModel(parcel2);
            case 74:
                return new ClipInfo(parcel2);
            case 75:
                return new GroupUserStoryTarget(parcel2);
            case 76:
                return new PendingRecipient(parcel2);
            case 77:
                return SimpleUserStoryTarget.A00(parcel2.readString());
            case 78:
                return new CountryCodeData(parcel2);
            case 79:
                return new UserDetailLaunchConfig(parcel2);
            case 80:
                return new ReelMoreOptionsModel(parcel2);
            case 81:
                return new SavedCollection(parcel2);
            case 82:
                return new SimpleWebViewConfig(parcel2);
            case 83:
                return new MediaSuggestedProductTag(parcel2);
            case 84:
                return new SwipeNavigationContainer.SavedState(parcel2);
            case 85:
                return new TextColorScheme(parcel2);
            case 86:
                return new TextColors(parcel2);
            case 87:
                return new TextShadow(parcel2);
            case 88:
                return new Folder(parcel2);
            case 89:
                return new MicroUser(parcel2);
            case 90:
                return MicroUser.PasswordState.values()[parcel2.readInt()];
            case 91:
                return new UserTagEntity(parcel2);
            default:
                return null;
        }
    }

    public final Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new NestedScrollView.SavedState[i];
            case 1:
                return new LinearLayoutManager.SavedState[i];
            case 2:
                return new AccessToken[i];
            case 3:
                return new StaticMapView$StaticMapOptions[i];
            case 4:
                return new ARCapabilityMinVersionModeling[i];
            case 5:
                return new ARRequestAsset[i];
            case 6:
                return new CameraConfig[i];
            case 7:
                return new DeviceConfig[i];
            case 8:
                return new AbrContextualSetting[i];
            case 9:
                return new DynamicPlayerSettings[i];
            case 10:
                return new HttpTransferEndEvent[i];
            case C120125Dh.VIEW_TYPE_BANNER:
                return new LiveState[i];
            case C120125Dh.VIEW_TYPE_SPINNER:
                return new ParcelableFormat[i];
            case C120125Dh.VIEW_TYPE_BADGE:
                return new ServicePlayerState[i];
            case C120125Dh.VIEW_TYPE_LINK:
                return new VideoPlayContextualSetting[i];
            case 15:
                return new VideoPlayRequest[i];
            case 16:
                return new VideoPrefetchRequest[i];
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return new VideoSource[i];
            case 18:
                return new ParcelableWifiScanConfig[i];
            case 19:
                return new AccountFamily[i];
            case 20:
                return new ActionButton.SavedState[i];
            case C120125Dh.VIEW_TYPE_BRANDING:
                return new IgBloksScreenConfig[i];
            case C120125Dh.NUM_VIEW_TYPES:
                return new PageSelectionOverrideData[i];
            case 23:
                return new CameraAREffect[i];
            case 24:
                return new Medium[i];
            case 25:
                return new Matrix3[i];
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return new Matrix4[i];
            case 27:
                return new SimpleImageUrl[i];
            case 28:
                return new FlowingGridLayoutManager.SavedState[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new CropInfo[i];
            case 30:
                return new GradientBackgroundPhotoFilter[i];
            case 31:
                return new PhotoFilter[i];
            case 32:
                return new ImageGradientFilter[i];
            case 33:
                return new ReactionViewModel[i];
            case 34:
                return new SectionPagination[i];
            case 35:
                return new EntityContextualFeedConfig[i];
            case 36:
                return new Refinement[i];
            case 37:
                return new ExploreFragmentConfig[i];
            case 38:
                return new ExploreTopicCluster[i];
            case 39:
                return new AttributionUser[i];
            case 40:
                return new ClickToMessagingAdsInfo[i];
            case 41:
                return new ClickToMessagingAdsInfo.IcebreakerMessage[i];
            case 42:
                return new ClickToMessagingAdsInfo.OnFeedMessages[i];
            case 43:
                return new CreativeConfig[i];
            case 44:
                return new CropCoordinates[i];
            case 45:
                return new EffectActionSheet[i];
            case 46:
                return new EffectConfig[i];
            case 47:
                return new EffectPreview[i];
            case 48:
                return new ProfilePicture[i];
            case 49:
                return new ThumbnailImage[i];
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                return new IdentityFilter[i];
            case 51:
                return new IgFilterGroup[i];
            case 52:
                return new HashtagContextualFeedConfig[i];
            case 53:
                return new MediaCaptureConfig[i];
            case 54:
                return new DirectThreadKey[i];
            case 55:
                return new DirectAnimatedMedia[i];
            case 56:
                return new TextureAsset[i];
            case 57:
                return new Hashtag[i];
            case 58:
                return new ExtendedImageUrl[i];
            case 59:
                return new ImageInfo[i];
            case 60:
                return new VideoUrlImpl[i];
            case 61:
                return new PeopleTag[i];
            case 62:
                return new PeopleTag.UserInfo[i];
            case 63:
                return new ReelChainingConfig[i];
            case 64:
                return new ReelViewerConfig[i];
            case 65:
                return new Merchant[i];
            case 66:
                return new Product[i];
            case 67:
                return new ProductCheckoutProperties[i];
            case 68:
                return new ProductImageContainer[i];
            case 69:
                return new ProductMention[i];
            case 70:
                return new ProductSource[i];
            case 71:
                return new ProductTag[i];
            case 72:
                return new Venue[i];
            case 73:
                return new MusicAssetModel[i];
            case 74:
                return new ClipInfo[i];
            case 75:
                return new GroupUserStoryTarget[i];
            case 76:
                return new PendingRecipient[i];
            case 77:
                return new SimpleUserStoryTarget[i];
            case 78:
                return new CountryCodeData[i];
            case 79:
                return new UserDetailLaunchConfig[i];
            case 80:
                return new ReelMoreOptionsModel[i];
            case 81:
                return new SavedCollection[i];
            case 82:
                return new SimpleWebViewConfig[i];
            case 83:
                return new MediaSuggestedProductTag[i];
            case 84:
                return new SwipeNavigationContainer.SavedState[i];
            case 85:
                return new TextColorScheme[i];
            case 86:
                return new TextColors[i];
            case 87:
                return new TextShadow[i];
            case 88:
                return new Folder[i];
            case 89:
                return new MicroUser[i];
            case 90:
                return new MicroUser.PasswordState[i];
            case 91:
                return new UserTagEntity[i];
            default:
                return new Object[0];
        }
    }
}
