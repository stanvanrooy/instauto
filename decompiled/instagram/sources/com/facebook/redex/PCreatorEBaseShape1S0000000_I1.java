package com.facebook.redex;

import android.location.Location;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.telephony.CellInfo;
import android.text.Spannable;
import android.text.TextUtils;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.fragment.app.FragmentTabHost$SavedState;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.androidx.support.p025v7.widget.LinearLayoutManager$SavedState;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.blescan.parcelable.ParcelableBleScanResult;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.businessextension.jscalls.InitJSBridgeCallData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData;
import com.facebook.cameracore.ardelivery.model.AREffectFileBundle;
import com.facebook.cameracore.ardelivery.model.ARRequestEffect;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.ccu.data.InvitableContactImpl;
import com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.clientsignals.core.logging.ConsoleSignalResultLoggerProvider;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.common.gcmcompat.PeriodicTask;
import com.facebook.common.locale.Country;
import com.facebook.common.parcels.ParcelableBoolean;
import com.facebook.common.payments.model.Address;
import com.facebook.common.payments.paymentmethods.model.AdditionalFields;
import com.facebook.common.payments.paymentmethods.model.CreditCard;
import com.facebook.common.payments.paymentmethods.model.NewCreditCard;
import com.facebook.common.payments.paymentmethods.model.NewPayPal;
import com.facebook.common.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.common.util.Either;
import com.facebook.common.util.ParcelablePair;
import com.facebook.common.util.Quartet;
import com.facebook.common.util.Triplet;
import com.facebook.exoplayer.ipc.ExoServiceVideoCacheAnalytics;
import com.facebook.exoplayer.ipc.RendererContext;
import com.facebook.exoplayer.ipc.VideoCacheStatus;
import com.facebook.exoplayer.ipc.VideoPlayerServiceEvent;
import com.facebook.exoplayer.ipc.VideoPlayerStreamEvaluation;
import com.facebook.exoplayer.ipc.VideoPlayerStreamFormat;
import com.facebook.exoplayer.ipc.VideoPlayerStreamMetadata;
import com.facebook.exoplayer.ipc.VpsCacheErrorEvent;
import com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent;
import com.facebook.exoplayer.ipc.VpsPrefetchCacheEvictEvent;
import com.facebook.exoplayer.ipc.VpsPrefetchStartEvent;
import com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent;
import com.facebook.exoplayer.ipc.ZeroVideoRewriteConfig;
import com.facebook.exoplayer.ipc.ZeroVideoUrlRewriteRule;
import com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pFriend;
import com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pWidgetSendRequest;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.iabeventlogging.model.IABCopyLinkEvent;
import com.facebook.iabeventlogging.model.IABDialogActionEvent;
import com.facebook.iabeventlogging.model.IABDropPixelsEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABFirstPauseEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.iabeventlogging.model.IABOpenExternalEvent;
import com.facebook.iabeventlogging.model.IABOpenMenuEvent;
import com.facebook.iabeventlogging.model.IABReactivatePixelsEvent;
import com.facebook.iabeventlogging.model.IABRefreshEvent;
import com.facebook.iabeventlogging.model.IABReportStartEvent;
import com.facebook.iabeventlogging.model.IABShareEvent;
import com.facebook.iabeventlogging.model.IABWebviewEndEvent;
import com.facebook.location.parcelable.ParcelableCoordinates;
import com.facebook.location.parcelable.ParcelableFbLocationContinuousListenerParams;
import com.facebook.location.parcelable.ParcelableFbLocationOperationParams;
import com.facebook.location.parcelable.ParcelableGeofenceResult;
import com.facebook.location.parcelable.ParcelableImmutableLocation;
import com.facebook.location.signalpackage.parcelable.ParcelableActivityRecognitionResult;
import com.facebook.location.signalpackage.parcelable.ParcelableDetectedActivity;
import com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.p002ui.emoji.model.BasicEmoji;
import com.facebook.p002ui.emoji.model.DrawableBackedEmoji;
import com.facebook.p002ui.emoji.model.Emoji;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.sensors.parcelable.ParcelableSensorEventClone;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.video.heroplayer.ipc.DeviceOrientationFrame;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.ParcelableCue;
import com.facebook.video.heroplayer.ipc.ParcelableTigonStats;
import com.facebook.video.heroplayer.ipc.ParcelableTimeRange;
import com.facebook.video.heroplayer.ipc.ParcelableXProcessTrafficShapingCommunication;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueCompleteEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueExitEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueStartEvent;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.VideoProtocolProps;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.fbpay.hub.form.cell.address.AddressCellParams;
import com.fbpay.hub.form.cell.creditcard.CreditCardCellParams;
import com.fbpay.hub.form.cell.label.LabelCellParams;
import com.fbpay.hub.form.cell.text.TextCellParams;
import com.fbpay.hub.form.cell.text.TextValidatorParams;
import com.fbpay.hub.form.cell.text.formatter.CreditCardFormatter;
import com.fbpay.hub.form.cell.text.formatter.DateFormatter;
import com.fbpay.hub.form.cell.text.formatter.PhoneFormatter;
import com.fbpay.hub.form.cell.text.formatter.UpperCaseFormatter;
import com.fbpay.hub.form.cell.toggle.SwitchCellParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.hub.merchantinfo.api.MerchantInfo;
import com.fbpay.hub.orders.api.FBPayOrder;
import com.fbpay.hub.paymentmethods.api.FbPayAdditionalField;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.logging.FBPayLoggerData;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzr;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.SignInButtonConfig;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zak;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.internal.location.zzm;
import com.google.android.gms.internal.p026authapi.zzs;
import com.google.android.gms.internal.p026authapi.zzy;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzai;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzan;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.zzaj;
import com.google.android.gms.location.zzj;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.zzi;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;
import com.google.android.gms.signin.internal.zah;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;
import com.google.p013ar.core.services.downloads.aidl.C0073b;
import com.google.p013ar.core.services.downloads.aidl.C0074c;
import com.google.p013ar.core.services.downloads.aidl.C0075d;
import com.google.p013ar.core.services.downloads.aidl.C0076e;
import com.google.p013ar.core.services.downloads.aidl.CallerInfo;
import com.google.p013ar.core.services.downloads.aidl.PackInfo;
import com.google.p013ar.core.services.downloads.aidl.PrepareRequest;
import com.google.p013ar.core.services.downloads.aidl.PrepareResponse;
import com.google.p013ar.core.services.downloads.aidl.SuperpackInfo;
import com.google.p013ar.core.services.downloads.aidl.SuperpackState;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;
import com.instagram.brandedcontent.intf.response.MonetizationProductOnboardingNextStepInfo;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.insights.model.DataPoint;
import com.instagram.business.insights.model.DaysHourlyFollowersData;
import com.instagram.business.insights.model.FollowersGrowthData;
import com.instagram.business.insights.model.GrowthDataPoint;
import com.instagram.business.insights.model.InsightsChartFilterData;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.model.BusinessAttribute;
import com.instagram.business.model.BusinessSignUpSplashRow;
import com.instagram.business.model.PagePhotoItem;
import com.instagram.camera.effect.models.AttributionUser;
import com.instagram.camera.effect.models.EffectActionSheet;
import com.instagram.camera.effect.models.EffectInfoUIOptions;
import com.instagram.camera.effect.models.EffectPreview;
import com.instagram.camera.effect.models.ProfilePicture;
import com.instagram.camera.effect.models.ThumbnailImage;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.clips.audio.model.AudioPageModelType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.p004ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.common.p004ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.common.textwithentities.Entity;
import com.instagram.common.textwithentities.InlineStyleAtRange;
import com.instagram.common.textwithentities.Range;
import com.instagram.common.textwithentities.TextWithEntities;
import com.instagram.common.textwithentities.TextWithEntitiesBlock;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.p029ui.effectpicker.EffectPicker;
import com.instagram.creation.capture.GalleryPickerView$SavedState;
import com.instagram.creation.capture.GalleryPreviewInfo;
import com.instagram.creation.capture.quickcapture.analytics.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetMode;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.photo.edit.effectfilter.BorderFilter;
import com.instagram.creation.photo.edit.filter.BasicAdjustFilter;
import com.instagram.creation.photo.edit.filter.BlurredLumAdjustFilter;
import com.instagram.creation.photo.edit.filter.GaussianBlurFilter;
import com.instagram.creation.photo.edit.filter.TextModeGradientFilter;
import com.instagram.creation.photo.edit.luxfilter.LocalLaplacianFilter;
import com.instagram.creation.photo.edit.luxfilter.LuxFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.IdentityReadbackFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.photo.edit.tiltshift.TiltShiftBlurFilter;
import com.instagram.creation.photo.edit.tiltshift.TiltShiftFogFilter;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.creation.state.CreationState;
import com.instagram.direct.intf.DirectShareSheetAppearance;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.direct.messengerrooms.api.MessengerRoom;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.feed.feeditem.ShoppingPivotItem;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.feed.media.StoryUnlockableStickerAttribution;
import com.instagram.filterkit.filter.RegionTrackingFilter;
import com.instagram.filterkit.filter.resize.BicubicFilter;
import com.instagram.filterkit.filter.resize.IdentityFilter;
import com.instagram.filterkit.filter.resize.LanczosFilter;
import com.instagram.graphql.facebook.enums.GraphQLObjectType;
import com.instagram.guides.intf.GuideFragmentConfig;
import com.instagram.guides.intf.GuideGridFragmentConfig;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igtv.logging.IGTVLaunchAnalytics;
import com.instagram.igtv.uploadflow.reactions.model.IGTVReactionsSettings;
import com.instagram.leadads.model.LeadAdsDisclaimerResponse;
import com.instagram.leadads.model.LeadAdsInputFieldResponse;
import com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig;
import com.instagram.location.impl.LocationSignalPackageImpl;
import com.instagram.location.surface.data.LocationPageInfo;
import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.fbfriend.FbFriend;
import com.instagram.model.hashtag.response.HashtagCollection;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.model.place.SimplePlace;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.MicroProduct;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductCollectionDropsMetadata;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductLaunchInformation;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductUntaggableReason;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.ProductVariantValue;
import com.instagram.model.shopping.ShippingAndReturnsMetadata;
import com.instagram.model.shopping.ShoppingDestinationTypeModel;
import com.instagram.model.shopping.ShoppingHelpLinkWithText;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.customization.ShoppingColor;
import com.instagram.model.shopping.customization.ShoppingColorCustomizations;
import com.instagram.model.shopping.customization.ShoppingFontCustomizations;
import com.instagram.model.shopping.incentives.igfunded.IgFundedEligibilityDialogContent;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.sellerfunded.Incentive;
import com.instagram.model.shopping.incentives.sellerfunded.IncentiveContainer;
import com.instagram.model.shopping.merchantfeed.MerchantWithProducts;
import com.instagram.model.shopping.merchantfeed.ProductThumbnail;
import com.instagram.model.shopping.productfeed.BrandItem;
import com.instagram.model.shopping.productfeed.BrandsHscroll;
import com.instagram.model.shopping.productfeed.ButtonDestination;
import com.instagram.model.shopping.productfeed.CollectionTileCoverMedia;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import com.instagram.model.shopping.productfeed.ProductCollectionTileCustomization;
import com.instagram.model.shopping.productfeed.ProductCollectionTileHscroll;
import com.instagram.model.shopping.productfeed.ProductFeedHeader;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.model.shopping.productfeed.producttilemetadata.PriceLabelOptions;
import com.instagram.model.shopping.productfeed.producttilemetadata.ProductNameLabelOptions;
import com.instagram.model.shopping.productfeed.producttilemetadata.ProductTileDecoration;
import com.instagram.model.shopping.productfeed.producttilemetadata.ProductTileLabel;
import com.instagram.model.shopping.productfeed.producttilemetadata.ProductTileLabelLayoutContent;
import com.instagram.model.shopping.productfeed.producttilemetadata.ProductTileMetadata;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import com.instagram.model.shopping.sizechart.SizeChartRow;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import com.instagram.model.videocall.VideoCallThreadSurfaceKey;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchMood;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.p009ui.slidecardpageadapter.SlideCardViewModel;
import com.instagram.p009ui.widget.editphonenumber.CountryCodeTextView;
import com.instagram.partnerprogram.intf.response.PartnerProgramOnboardingNextStepInfo;
import com.instagram.payments.checkout.model.CheckoutData;
import com.instagram.payments.checkout.model.CheckoutScreenEntity;
import com.instagram.payments.checkout.model.CheckoutScreenPaymentCredentials;
import com.instagram.payments.checkout.model.ConnectFlowBottomSheetContentParams;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.EventUserStoryTarget;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.reels.challenge.model.ChallengeStickerModel;
import com.instagram.reels.events.model.EventStickerModel;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import com.instagram.secondaryaccount.upsell.contextualfeed.intf.TrialContextualFeedNetworkConfig;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.shopping.api.destination.profileshop.ProfileShopSurfaceCustomization;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.shopping.model.ShippingAndReturnsInfo;
import com.instagram.shopping.model.ShippingAndReturnsSection;
import com.instagram.shopping.model.analytics.ShoppingExploreLoggingInfo;
import com.instagram.shopping.model.destination.ShoppingExploreDeeplinkModel;
import com.instagram.shopping.model.destination.home.ProductSection;
import com.instagram.shopping.model.destination.home.ShoppingHomeSection;
import com.instagram.shopping.model.destination.home.ShoppingHomeSectionContent;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.recommended.FollowListData;
import com.instagram.util.gallery.ImageManager$ImageListParam;
import com.instagram.videofeed.intf.VideoFeedFragmentConfig;
import com.instagram.videofeed.intf.VideoFeedType;
import com.instagram.wellbeing.locationtransparency.fragment.LocationTransparencyUserProfile;
import com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.webrtc.ScreenCapturerAndroid;
import p000X.AMD;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass178;
import p000X.AnonymousClass2TL;
import p000X.AnonymousClass5DQ;
import p000X.AnonymousClass79P;
import p000X.AnonymousClass8OS;
import p000X.C06270Ok;
import p000X.C120125Dh;
import p000X.C13150hy;
import p000X.C170037Ou;
import p000X.C183227s6;
import p000X.C216429Uw;
import p000X.C228309sC;
import p000X.C228969wN;
import p000X.C229019wW;
import p000X.C229029wX;
import p000X.C229079wg;
import p000X.C229109wk;
import p000X.C229139wq;
import p000X.C25080AzM;
import p000X.C44121vd;
import p000X.C54492Xn;
import p000X.C54502Xp;
import p000X.C54512Xq;

public class PCreatorEBaseShape1S0000000_I1 extends PCreatorEmptyBase implements Parcelable.Creator {
    public final int A00;

    public PCreatorEBaseShape1S0000000_I1(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 2621 */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x091b, code lost:
        r2 = new java.lang.StringBuilder(37);
        r2.append("Overread allowed size end=");
        r2.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0933, code lost:
        throw new p000X.C200108hS(r2.toString(), r0);
     */
    public final Object createFromParcel(Parcel parcel) {
        int i;
        C44121vd r1;
        boolean z;
        Boolean valueOf;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                return new ActionMenuPresenter$SavedState(parcel2);
            case 1:
                return new AppCompatSpinner$SavedState(parcel2);
            case 2:
                return new FragmentTabHost$SavedState(parcel2);
            case 3:
                return new androidx.legacy.app.FragmentTabHost$SavedState(parcel2);
            case 4:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(parcel2);
            case 5:
                return new StaggeredGridLayoutManager.SavedState(parcel2);
            case 6:
                return new SwipeRefreshLayout.SavedState(parcel2);
            case 7:
                return new ParcelImpl(parcel2);
            case 8:
                return new LinearLayoutManager$SavedState(parcel2);
            case 9:
                return new RequestAutofillJSBridgeCall(parcel2);
            case 10:
                return new RequestAutofillJSBridgeCallResult(parcel2);
            case C120125Dh.VIEW_TYPE_BANNER:
                return new AddressAutofillData(parcel2);
            case C120125Dh.VIEW_TYPE_SPINNER:
                return new EmailAutofillData(parcel2);
            case C120125Dh.VIEW_TYPE_BADGE:
                return new NameAutofillData(parcel2);
            case C120125Dh.VIEW_TYPE_LINK:
                return new TelephoneAutofillData(parcel2);
            case 15:
                return new SaveAutofillDataJSBridgeCall(parcel2);
            case 16:
                try {
                    return new IGInstantExperiencesFeatureEnabledList(parcel2);
                } catch (JSONException e) {
                    AnonymousClass0DB.A0G("IGInstantExperiencesFeatureEnabledList", "Failed to create feature enabled list", e);
                    return null;
                }
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return new InstantExperienceGenericErrorResult(parcel2);
            case 18:
                return new CanMakePaymentJSBridgeCall(parcel2);
            case 19:
                return new CanMakePaymentJSBridgeCallResult(parcel2);
            case 20:
                return new CanShowPaymentModuleJSBridgeCall(parcel2);
            case C120125Dh.VIEW_TYPE_BRANDING:
                return new CanShowPaymentModuleJSBridgeCallResult(parcel2);
            case C120125Dh.NUM_VIEW_TYPES:
                return new PaymentsCheckoutJSBridgeCall(parcel2);
            case 23:
                return new PaymentsCheckoutJSBridgeCallResult(parcel2);
            case 24:
                return new PaymentsChargeRequestErrorCall(parcel2);
            case 25:
                return new PaymentsChargeRequestSuccessCall(parcel2);
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return new PaymentsChargeRequestUnknownCall(parcel2);
            case 27:
                return new CameraPosition(parcel2);
            case 28:
                return new LatLng(parcel2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new LatLngBounds(parcel2);
            case 30:
                return new ParcelableBleScanResult(parcel2);
            case 31:
                return new BrowserLiteJSBridgeCall(parcel2);
            case 32:
                return new PrefetchCacheEntry(parcel2);
            case 33:
                return new InitJSBridgeCallData(parcel2);
            case 34:
                return new RequestAutofillJSBridgeCallData(parcel2);
            case 35:
                return new SaveAutofillDataJSBridgeCallData(parcel2);
            case 36:
                return new AREffectFileBundle(parcel2);
            case 37:
                return new ARRequestEffect(parcel2);
            case 38:
                return new EffectAttribution(parcel2);
            case 39:
                return new EffectAttribution.AttributedAsset(parcel2);
            case 40:
                return new EffectAttribution.License(parcel2);
            case 41:
                return new InvitableContactImpl(parcel2);
            case 42:
                return new ParcelableCdmaCellInfo(parcel2);
            case 43:
                return new ParcelableGeneralCellInfo(parcel2);
            case 44:
                return new ConsoleSignalResultLoggerProvider();
            case 45:
                return new CallerContext(parcel2);
            case 46:
                return new ContextChain(parcel2);
            case 47:
                return new OneoffTask(parcel2);
            case 48:
                return new PeriodicTask(parcel2);
            case 49:
                return Country.A00(parcel2.readString());
            case AMD.MAX_LIKES_PER_FETCH:
                int readInt = parcel2.readInt();
                boolean z2 = true;
                if (readInt != 1) {
                    z2 = false;
                }
                return new ParcelableBoolean(z2);
            case 51:
                return new Address(parcel2);
            case 52:
                return new AdditionalFields(parcel2);
            case 53:
                return new CreditCard(parcel2);
            case 54:
                return new NewCreditCard(parcel2);
            case 55:
                return new NewPayPal(parcel2);
            case 56:
                return new PayPalBillingAgreement(parcel2);
            case 57:
                return new Either(parcel2);
            case 58:
                return new ParcelablePair(AnonymousClass8OS.A00(parcel2), AnonymousClass8OS.A00(parcel2));
            case 59:
                return new Quartet(parcel2);
            case 60:
                return new Triplet(AnonymousClass8OS.A00(parcel2), AnonymousClass8OS.A00(parcel2), AnonymousClass8OS.A00(parcel2));
            case 61:
                return new ExoServiceVideoCacheAnalytics(parcel2);
            case 62:
                return new RendererContext(parcel2);
            case 63:
                return new VideoCacheStatus(parcel2);
            case 64:
                int readInt2 = parcel2.readInt();
                if (C229139wq.A01.get(readInt2) != null) {
                    switch (((C229139wq) C229139wq.A01.get(readInt2)).ordinal()) {
                        case 1:
                            return new VpsPrefetchCacheEvictEvent(parcel2);
                        case 5:
                            return new VpsCacheErrorEvent(parcel2);
                        case 6:
                            return new VpsPrefetchStartEvent(parcel2);
                        case 7:
                            return new VpsVideoCacheDatabaseFullEvent(parcel2);
                        case 8:
                            return new VpsManifestParseErrorEvent(parcel2);
                        case 9:
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown event type");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid EventType value");
                }
            case 65:
                return new VideoPlayerStreamEvaluation(parcel2);
            case 66:
                return new VideoPlayerStreamFormat(parcel2);
            case 67:
                return new VideoPlayerStreamMetadata(parcel2);
            case 68:
                return new ZeroVideoRewriteConfig(parcel2);
            case 69:
                return new ZeroVideoUrlRewriteRule(parcel2);
            case 70:
                return new FbPayP2pFriend(parcel2);
            case 71:
                return new FbPayP2pWidgetSendRequest(parcel2);
            case 72:
                return new ApiErrorResult(parcel2);
            case 73:
                C25080AzM azM = (C25080AzM) C25080AzM.A01.get(parcel2.readString());
                if (azM == null) {
                    azM = C25080AzM.EMPTY;
                }
                String readString = parcel2.readString();
                long readLong = parcel2.readLong();
                long readLong2 = parcel2.readLong();
                switch (azM.ordinal()) {
                    case 0:
                        long readLong3 = parcel2.readLong();
                        long readLong4 = parcel2.readLong();
                        long readLong5 = parcel2.readLong();
                        long readLong6 = parcel2.readLong();
                        long readLong7 = parcel2.readLong();
                        long readLong8 = parcel2.readLong();
                        long readLong9 = parcel2.readLong();
                        ArrayList readArrayList = parcel2.readArrayList(ArrayList.class.getClassLoader());
                        String readString2 = parcel2.readString();
                        String readString3 = parcel2.readString();
                        String readString4 = parcel2.readString();
                        int readInt3 = parcel2.readInt();
                        int readInt4 = parcel2.readInt();
                        int readInt5 = parcel2.readInt();
                        int readInt6 = parcel2.readInt();
                        boolean z3 = false;
                        if (parcel2.readByte() == 1) {
                            z3 = true;
                        }
                        String readString5 = parcel2.readString();
                        boolean z4 = false;
                        if (parcel2.readByte() == 1) {
                            z4 = true;
                        }
                        long readLong10 = parcel2.readLong();
                        boolean z5 = false;
                        if (parcel2.readByte() == 1) {
                            z5 = true;
                        }
                        return new IABWebviewEndEvent(readString, readLong, readLong2, readLong3, readLong4, readLong5, readLong6, readLong7, readLong8, readLong9, readArrayList, readString2, readString3, readString4, readInt3, readInt4, readInt5, readInt6, z3, readString5, z4, readLong10, z5, parcel2.readString(), parcel2.readString());
                    case 1:
                        return new IABLaunchEvent(readString, readLong, readLong2, parcel2.readString(), parcel2.readLong(), parcel2.readString(), parcel2.readLong());
                    case 2:
                        return new IABLandingPageStartedEvent(readString, readLong, readLong2, parcel2.readString());
                    case 3:
                        return new IABLandingPageInteractiveEvent(readString, readLong, readLong2, parcel2.readString(), parcel2.readString(), parcel2.readInt(), parcel2.readInt());
                    case 4:
                        return new IABLandingPageFinishedEvent(readString, readLong, readLong2, parcel2.readString(), parcel2.readString());
                    case 5:
                        return new IABLandingPageViewEndedEvent(readString, readLong, readLong2, parcel2.readString());
                    case 6:
                        return new IABOpenExternalEvent(readString, readLong, readLong2, parcel2.readString(), parcel2.readString());
                    case 7:
                        return new IABCopyLinkEvent(readString, readLong, readLong2, parcel2.readString());
                    case 8:
                        return new IABOpenMenuEvent(readString, readLong, readLong2);
                    case 9:
                        return new IABShareEvent(readString, readLong, readLong2, parcel2.readString(), parcel2.readString());
                    case 10:
                        return new IABReportStartEvent(readString, readLong, readLong2, parcel2.readString(), parcel2.readString(), parcel2.readString());
                    case C120125Dh.VIEW_TYPE_BANNER:
                        return new IABRefreshEvent(readString, readLong, readLong2, parcel2.readString());
                    case C120125Dh.VIEW_TYPE_SPINNER:
                        long readLong11 = parcel2.readLong();
                        long readLong12 = parcel2.readLong();
                        long readLong13 = parcel2.readLong();
                        long readLong14 = parcel2.readLong();
                        long readLong15 = parcel2.readLong();
                        long readLong16 = parcel2.readLong();
                        long readLong17 = parcel2.readLong();
                        ArrayList readArrayList2 = parcel2.readArrayList(ArrayList.class.getClassLoader());
                        String readString6 = parcel2.readString();
                        String readString7 = parcel2.readString();
                        String readString8 = parcel2.readString();
                        int readInt7 = parcel2.readInt();
                        int readInt8 = parcel2.readInt();
                        int readInt9 = parcel2.readInt();
                        int readInt10 = parcel2.readInt();
                        boolean z6 = false;
                        if (parcel2.readByte() == 1) {
                            z6 = true;
                        }
                        String readString9 = parcel2.readString();
                        boolean z7 = false;
                        if (parcel2.readByte() == 1) {
                            z7 = true;
                        }
                        return new IABFirstPauseEvent(readString, readLong, readLong2, readLong11, readLong12, readLong13, readLong14, readLong15, readLong16, readLong17, readArrayList2, readString6, readString7, readString8, readInt7, readInt8, readInt9, readInt10, z6, readString9, z7);
                    case C120125Dh.VIEW_TYPE_BADGE:
                        String readString10 = parcel2.readString();
                        boolean z8 = false;
                        if (parcel2.readInt() != 0) {
                            z8 = true;
                        }
                        return new IABDialogActionEvent(readString, readLong, readLong2, readString10, z8);
                    case C120125Dh.VIEW_TYPE_LINK:
                        String readString11 = parcel2.readString();
                        String readString12 = parcel2.readString();
                        if (readString11 == null) {
                            readString11 = "";
                        }
                        if (readString12 == null) {
                            readString12 = "";
                        }
                        return new IABDropPixelsEvent(readString, readLong, readLong2, readString11, readString12);
                    case 15:
                        String readString13 = parcel2.readString();
                        String readString14 = parcel2.readString();
                        if (readString13 == null) {
                            readString13 = "";
                        }
                        if (readString14 == null) {
                            readString14 = "";
                        }
                        return new IABReactivatePixelsEvent(readString, readLong, readLong2, readString13, readString14);
                    default:
                        return IABEvent.A04;
                }
            case 74:
                return new ParcelableCoordinates(parcel2);
            case 75:
                return new ParcelableFbLocationContinuousListenerParams(parcel2);
            case 76:
                return new ParcelableFbLocationOperationParams(parcel2);
            case 77:
                return new ParcelableGeofenceResult(parcel2);
            case 78:
                Parcelable readParcelable = parcel2.readParcelable(Location.class.getClassLoader());
                AnonymousClass0a4.A06(readParcelable);
                Location location = (Location) readParcelable;
                byte readByte = parcel2.readByte();
                if (readByte != 0) {
                    z = true;
                    if (readByte != 1) {
                        valueOf = null;
                    }
                    valueOf = Boolean.valueOf(z);
                } else {
                    z = false;
                    valueOf = Boolean.valueOf(z);
                }
                return new ParcelableImmutableLocation(location, valueOf);
            case 79:
                long readLong18 = parcel2.readLong();
                long readLong19 = parcel2.readLong();
                ArrayList arrayList = new ArrayList();
                parcel2.readTypedList(arrayList, ParcelableDetectedActivity.CREATOR);
                return new ParcelableActivityRecognitionResult(arrayList, readLong18, readLong19);
            case 80:
                return new ParcelableDetectedActivity(parcel2.readInt(), parcel2.readInt());
            case 81:
                Boolean bool = null;
                C54502Xp r7 = new C54502Xp();
                if (parcel2.readByte() == 0) {
                    r1 = null;
                } else {
                    double readDouble = parcel2.readDouble();
                    double readDouble2 = parcel2.readDouble();
                    Location location2 = new Location((String) null);
                    location2.setLatitude(readDouble);
                    location2.setLongitude(readDouble2);
                    String readString15 = parcel2.readString();
                    if (readString15 != null) {
                        AnonymousClass0a4.A06(readString15);
                        location2.setProvider(readString15);
                    }
                    Long valueOf2 = parcel2.readByte() == 0 ? null : Long.valueOf(parcel2.readLong());
                    if (valueOf2 != null) {
                        long longValue = valueOf2.longValue();
                        boolean z9 = false;
                        if (longValue != 0) {
                            z9 = true;
                        }
                        AnonymousClass0a4.A09(z9);
                        location2.setTime(longValue);
                    }
                    Long valueOf3 = parcel2.readByte() == 0 ? null : Long.valueOf(parcel2.readLong());
                    if (valueOf3 != null) {
                        long longValue2 = valueOf3.longValue();
                        boolean z10 = false;
                        if (longValue2 != 0) {
                            z10 = true;
                        }
                        AnonymousClass0a4.A09(z10);
                        location2.setElapsedRealtimeNanos(longValue2);
                    }
                    Float A01 = C229029wX.A01(parcel2);
                    if (A01 != null) {
                        location2.setAccuracy(A01.floatValue());
                    }
                    Double valueOf4 = parcel2.readByte() == 0 ? null : Double.valueOf(parcel2.readDouble());
                    if (valueOf4 != null) {
                        location2.setAltitude(valueOf4.doubleValue());
                    }
                    Float A012 = C229029wX.A01(parcel2);
                    if (A012 != null) {
                        location2.setBearing(A012.floatValue());
                    }
                    Float A013 = C229029wX.A01(parcel2);
                    if (A013 != null) {
                        location2.setSpeed(A013.floatValue());
                    }
                    location2.setExtras(parcel2.readBundle());
                    Boolean A002 = C229029wX.A00(parcel2);
                    if (A002 != null) {
                        bool = Boolean.valueOf(A002.booleanValue());
                    }
                    r1 = new C44121vd(location2, bool);
                }
                r7.A01 = r1;
                r7.A0D = parcel2.readString();
                r7.A04 = C229029wX.A00(parcel2);
                r7.A02 = (AnonymousClass2TL) parcel2.readParcelable(ParcelableWifiScanResult.class.getClassLoader());
                ArrayList createTypedArrayList = parcel2.createTypedArrayList(ParcelableWifiScanResult.CREATOR);
                r7.A0K = createTypedArrayList == null ? null : AnonymousClass178.A00(createTypedArrayList).A01(new C229109wk()).A02();
                r7.A06 = C229029wX.A00(parcel2);
                r7.A00 = (C54492Xn) parcel2.readParcelable(ParcelableGeneralCellInfo.class.getClassLoader());
                r7.A0I = parcel2.createTypedArrayList(CellInfo.CREATOR);
                ArrayList createTypedArrayList2 = parcel2.createTypedArrayList(ParcelableBleScanResult.CREATOR);
                r7.A0H = createTypedArrayList2 == null ? null : AnonymousClass178.A00(createTypedArrayList2).A01(new C229079wg()).A02();
                r7.A03 = C229029wX.A00(parcel2);
                ArrayList createTypedArrayList3 = parcel2.createTypedArrayList(ParcelableActivityRecognitionResult.CREATOR);
                r7.A0G = createTypedArrayList3 == null ? null : AnonymousClass178.A00(createTypedArrayList3).A01(new C229019wW()).A02();
                r7.A0A = parcel2.readByte() == 0 ? null : Integer.valueOf(parcel2.readInt());
                ArrayList createTypedArrayList4 = parcel2.createTypedArrayList(ParcelableSensorEventClone.CREATOR);
                r7.A0J = createTypedArrayList4 == null ? null : AnonymousClass178.A00(createTypedArrayList4).A01(new C228969wN()).A02();
                r7.A0B = parcel2.readString();
                r7.A0C = parcel2.readString();
                r7.A0F = parcel2.readString();
                r7.A05 = C229029wX.A00(parcel2);
                r7.A0E = parcel2.readString();
                r7.A08 = parcel2.readByte() == 0 ? null : Integer.valueOf(parcel2.readInt());
                r7.A07 = C229029wX.A01(parcel2);
                r7.A09 = parcel2.readByte() == 0 ? null : Integer.valueOf(parcel2.readInt());
                return ParcelableLocationSignalPackage.A00(new C54512Xq(r7));
            case 82:
                return new LoginClient$Request(parcel2);
            case 83:
                return new LoginClient$Result(parcel2);
            case 84:
                return new ParcelableSensorEventClone(parcel2);
            case 85:
                return new IdCaptureConfig(parcel2);
            case 86:
                return new CommonLoggingFields(parcel2);
            case 87:
                return new BasicEmoji(parcel2);
            case 88:
                return new DrawableBackedEmoji(parcel2);
            case 89:
                return new DeviceOrientationFrame(parcel2);
            case 90:
                return new HeroScrollSetting(parcel2);
            case 91:
                return new ParcelableCue(parcel2);
            case 92:
                return new ParcelableTigonStats(parcel2);
            case 93:
                return new ParcelableTimeRange(parcel2.readLong(), parcel2.readLong());
            case 94:
                return new ParcelableXProcessTrafficShapingCommunication(parcel2);
            case 95:
                return new PrefetchTaskQueueCompleteEvent(parcel2);
            case 96:
                return new PrefetchTaskQueueExitEvent(parcel2);
            case 97:
                return new PrefetchTaskQueueStartEvent(parcel2);
            case 98:
                return new SpatialAudioFocusParams(parcel2);
            case 99:
                return new VideoProtocolProps(parcel2);
            case 100:
                return new com.facebook.video.heroplayer.ipc.ZeroVideoRewriteConfig(parcel2);
            case 101:
                return new com.facebook.video.heroplayer.ipc.ZeroVideoUrlRewriteRule(parcel2);
            case 102:
                return new SphericalMetadata(parcel2);
            case 103:
                return new ParcelableWifiScanResult(parcel2);
            case 104:
                return new FBPayAddress(parcel2);
            case 105:
                return new AddressCellParams(parcel2);
            case 106:
                return new CreditCardCellParams(parcel2);
            case 107:
                return new LabelCellParams(parcel2);
            case 108:
                return new LabelCellParams.LinkParams(parcel2);
            case 109:
                return new TextCellParams(parcel2);
            case 110:
                return new TextValidatorParams(parcel2);
            case 111:
                return new CreditCardFormatter(parcel2);
            case 112:
                return new DateFormatter(parcel2);
            case 113:
                return new PhoneFormatter(parcel2);
            case 114:
                return new UpperCaseFormatter(parcel2);
            case 115:
                return new SwitchCellParams(parcel2);
            case 116:
                return new FormLogEvents(parcel2);
            case 117:
                return new FormParams(parcel2);
            case 118:
                return new MerchantInfo(parcel2);
            case 119:
                return new FBPayOrder(parcel2);
            case 120:
                return new FbPayAdditionalField(parcel2);
            case 121:
                return new FbPayCreditCard(parcel2);
            case 122:
                return new FbPayNewCreditCardOption(parcel2);
            case 123:
                return new FbPayNewPayPalOption(parcel2);
            case 124:
                return new FbPayPayPal(parcel2);
            case 125:
                return new FbPayPaymentDefaultInfo(parcel2);
            case 126:
                return new FbPayPaymentMethod(parcel2);
            case 127:
                return new FBPayLoggerData(parcel2);
            case 128:
                return new Format(parcel2);
            case 129:
                return new DrmInitData(parcel2);
            case 130:
                return new DrmInitData.SchemeData(parcel2);
            case 131:
                return new MdtaMetadataEntry(parcel2);
            case 132:
                return new Metadata(parcel2);
            case 133:
                return new EventMessage(parcel2);
            case 134:
                return new PictureFrame(parcel2);
            case 135:
                return new VorbisComment(parcel2);
            case 136:
                return new IcyHeaders(parcel2);
            case 137:
                return new IcyInfo(parcel2);
            case 138:
                return new ApicFrame(parcel2);
            case 139:
                return new BinaryFrame(parcel2);
            case 140:
                return new ChapterFrame(parcel2);
            case 141:
                return new ChapterTocFrame(parcel2);
            case 142:
                return new CommentFrame(parcel2);
            case 143:
                return new GeobFrame(parcel2);
            case 144:
                return new InternalFrame(parcel2);
            case 145:
                return new MlltFrame(parcel2);
            case 146:
                return new PrivFrame(parcel2);
            case 147:
                return new TextInformationFrame(parcel2);
            case 148:
                return new UrlLinkFrame(parcel2);
            case 149:
                return new TrackGroup(parcel2);
            case 150:
                return new TrackGroupArray(parcel2);
            case 151:
                return new DefaultTrackSelector$Parameters(parcel2);
            case 152:
                return new DefaultTrackSelector$SelectionOverride(parcel2);
            case 153:
                return new TrackSelectionParameters(parcel2);
            case 154:
                return new ColorInfo(parcel2);
            case 155:
                i = C228309sC.A01(parcel2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = null;
                int i2 = 0;
                zzo zzo = null;
                int i3 = 0;
                while (parcel2.dataPosition() < i) {
                    int readInt11 = parcel2.readInt();
                    int A003 = C228309sC.A00(readInt11);
                    int i4 = 1;
                    if (A003 != 1) {
                        i4 = 2;
                        if (A003 != 2) {
                            i4 = 3;
                            if (A003 != 3) {
                                i4 = 4;
                                if (A003 != 4) {
                                    C228309sC.A0D(parcel2, readInt11);
                                } else {
                                    zzo = (zzo) C228309sC.A07(parcel2, readInt11, zzo.CREATOR);
                                }
                            } else {
                                i3 = C228309sC.A02(parcel2, readInt11);
                            }
                        } else {
                            arrayList2 = C228309sC.A0B(parcel2, readInt11, zzr.CREATOR);
                        }
                    } else {
                        i2 = C228309sC.A02(parcel2, readInt11);
                    }
                    hashSet.add(Integer.valueOf(i4));
                }
                if (parcel2.dataPosition() == i) {
                    return new zzl(hashSet, i2, arrayList2, i3, zzo);
                }
                break;
            case 156:
                int A014 = C228309sC.A01(parcel2);
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                int i5 = 0;
                while (parcel2.dataPosition() < A014) {
                    int readInt12 = parcel2.readInt();
                    switch (C228309sC.A00(readInt12)) {
                        case 1:
                            i5 = C228309sC.A02(parcel2, readInt12);
                            break;
                        case 2:
                            arrayList3 = C228309sC.A0A(parcel2, readInt12);
                            break;
                        case 3:
                            arrayList4 = C228309sC.A0A(parcel2, readInt12);
                            break;
                        case 4:
                            arrayList5 = C228309sC.A0A(parcel2, readInt12);
                            break;
                        case 5:
                            arrayList6 = C228309sC.A0A(parcel2, readInt12);
                            break;
                        case 6:
                            arrayList7 = C228309sC.A0A(parcel2, readInt12);
                            break;
                        default:
                            C228309sC.A0D(parcel2, readInt12);
                            break;
                    }
                }
                C228309sC.A0C(parcel2, A014);
                return new zzo(i5, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
            case 157:
                i = C228309sC.A01(parcel2);
                HashSet hashSet2 = new HashSet();
                zzt zzt = null;
                int i6 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel2.dataPosition() < i) {
                    int readInt13 = parcel2.readInt();
                    int A004 = C228309sC.A00(readInt13);
                    int i7 = 1;
                    if (A004 != 1) {
                        i7 = 2;
                        if (A004 != 2) {
                            i7 = 3;
                            if (A004 != 3) {
                                i7 = 4;
                                if (A004 != 4) {
                                    i7 = 5;
                                    if (A004 != 5) {
                                        C228309sC.A0D(parcel2, readInt13);
                                    } else {
                                        str3 = C228309sC.A08(parcel2, readInt13);
                                    }
                                } else {
                                    str2 = C228309sC.A08(parcel2, readInt13);
                                }
                            } else {
                                str = C228309sC.A08(parcel2, readInt13);
                            }
                        } else {
                            zzt = (zzt) C228309sC.A07(parcel2, readInt13, zzt.CREATOR);
                        }
                    } else {
                        i6 = C228309sC.A02(parcel2, readInt13);
                    }
                    hashSet2.add(Integer.valueOf(i7));
                }
                if (parcel2.dataPosition() == i) {
                    return new zzr(hashSet2, i6, zzt, str, str2, str3);
                }
                break;
            case 158:
                int A015 = C228309sC.A01(parcel2);
                long j = 0;
                int i8 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (parcel2.dataPosition() < A015) {
                    int readInt14 = parcel2.readInt();
                    int A005 = C228309sC.A00(readInt14);
                    if (A005 == 1) {
                        i8 = C228309sC.A02(parcel2, readInt14);
                    } else if (A005 == 2) {
                        z11 = C228309sC.A0G(parcel2, readInt14);
                    } else if (A005 == 3) {
                        j = C228309sC.A04(parcel2, readInt14);
                    } else if (A005 != 4) {
                        C228309sC.A0D(parcel2, readInt14);
                    } else {
                        z12 = C228309sC.A0G(parcel2, readInt14);
                    }
                }
                C228309sC.A0C(parcel2, A015);
                return new DeviceMetaData(i8, z11, j, z12);
            case 159:
                int A016 = C228309sC.A01(parcel2);
                int i9 = 0;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                int i10 = 0;
                while (parcel2.dataPosition() < A016) {
                    int readInt15 = parcel2.readInt();
                    int A006 = C228309sC.A00(readInt15);
                    if (A006 == 1) {
                        z13 = C228309sC.A0G(parcel2, readInt15);
                    } else if (A006 == 2) {
                        z14 = C228309sC.A0G(parcel2, readInt15);
                    } else if (A006 == 3) {
                        z15 = C228309sC.A0G(parcel2, readInt15);
                    } else if (A006 == 4) {
                        i10 = C228309sC.A02(parcel2, readInt15);
                    } else if (A006 != 1000) {
                        C228309sC.A0D(parcel2, readInt15);
                    } else {
                        i9 = C228309sC.A02(parcel2, readInt15);
                    }
                }
                C228309sC.A0C(parcel2, A016);
                return new CredentialPickerConfig(i9, z13, z14, z15, i10);
            case 160:
                int A017 = C228309sC.A01(parcel2);
                String[] strArr = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String str4 = null;
                String str5 = null;
                int i11 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel2.dataPosition() < A017) {
                    int readInt16 = parcel2.readInt();
                    int A007 = C228309sC.A00(readInt16);
                    if (A007 != 1000) {
                        switch (A007) {
                            case 1:
                                z16 = C228309sC.A0G(parcel2, readInt16);
                                break;
                            case 2:
                                strArr = C228309sC.A0K(parcel2, readInt16);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) C228309sC.A07(parcel2, readInt16, CredentialPickerConfig.CREATOR);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) C228309sC.A07(parcel2, readInt16, CredentialPickerConfig.CREATOR);
                                break;
                            case 5:
                                z17 = C228309sC.A0G(parcel2, readInt16);
                                break;
                            case 6:
                                str4 = C228309sC.A08(parcel2, readInt16);
                                break;
                            case 7:
                                str5 = C228309sC.A08(parcel2, readInt16);
                                break;
                            case 8:
                                z18 = C228309sC.A0G(parcel2, readInt16);
                                break;
                            default:
                                C228309sC.A0D(parcel2, readInt16);
                                break;
                        }
                    } else {
                        i11 = C228309sC.A02(parcel2, readInt16);
                    }
                }
                C228309sC.A0C(parcel2, A017);
                return new CredentialRequest(i11, z16, strArr, credentialPickerConfig, credentialPickerConfig2, z17, str4, str5, z18);
            case 161:
                int A018 = C228309sC.A01(parcel2);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArr2 = null;
                String str6 = null;
                String str7 = null;
                int i12 = 0;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel2.dataPosition() < A018) {
                    int readInt17 = parcel2.readInt();
                    int A008 = C228309sC.A00(readInt17);
                    if (A008 != 1000) {
                        switch (A008) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) C228309sC.A07(parcel2, readInt17, CredentialPickerConfig.CREATOR);
                                break;
                            case 2:
                                z19 = C228309sC.A0G(parcel2, readInt17);
                                break;
                            case 3:
                                z20 = C228309sC.A0G(parcel2, readInt17);
                                break;
                            case 4:
                                strArr2 = C228309sC.A0K(parcel2, readInt17);
                                break;
                            case 5:
                                z21 = C228309sC.A0G(parcel2, readInt17);
                                break;
                            case 6:
                                str6 = C228309sC.A08(parcel2, readInt17);
                                break;
                            case 7:
                                str7 = C228309sC.A08(parcel2, readInt17);
                                break;
                            default:
                                C228309sC.A0D(parcel2, readInt17);
                                break;
                        }
                    } else {
                        i12 = C228309sC.A02(parcel2, readInt17);
                    }
                }
                C228309sC.A0C(parcel2, A018);
                return new HintRequest(i12, credentialPickerConfig3, z19, z20, strArr2, z21, str6, str7);
            case 162:
                int A019 = C228309sC.A01(parcel2);
                String str8 = null;
                String str9 = null;
                while (parcel2.dataPosition() < A019) {
                    int readInt18 = parcel2.readInt();
                    int A009 = C228309sC.A00(readInt18);
                    if (A009 == 1) {
                        str8 = C228309sC.A08(parcel2, readInt18);
                    } else if (A009 != 2) {
                        C228309sC.A0D(parcel2, readInt18);
                    } else {
                        str9 = C228309sC.A08(parcel2, readInt18);
                    }
                }
                C228309sC.A0C(parcel2, A019);
                return new IdToken(str8, str9);
            case 163:
                int A0110 = C228309sC.A01(parcel2);
                String str10 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel2.dataPosition() < A0110) {
                    int readInt19 = parcel2.readInt();
                    int A0010 = C228309sC.A00(readInt19);
                    if (A0010 == 2) {
                        str10 = C228309sC.A08(parcel2, readInt19);
                    } else if (A0010 != 5) {
                        C228309sC.A0D(parcel2, readInt19);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) C228309sC.A07(parcel2, readInt19, GoogleSignInOptions.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0110);
                return new SignInConfiguration(str10, googleSignInOptions);
            case 164:
                int A0111 = C228309sC.A01(parcel2);
                String str11 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str12 = str11;
                while (parcel2.dataPosition() < A0111) {
                    int readInt20 = parcel2.readInt();
                    int A0011 = C228309sC.A00(readInt20);
                    if (A0011 == 4) {
                        str11 = C228309sC.A08(parcel2, readInt20);
                    } else if (A0011 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) C228309sC.A07(parcel2, readInt20, GoogleSignInAccount.CREATOR);
                    } else if (A0011 != 8) {
                        C228309sC.A0D(parcel2, readInt20);
                    } else {
                        str12 = C228309sC.A08(parcel2, readInt20);
                    }
                }
                C228309sC.A0C(parcel2, A0111);
                return new SignInAccount(str11, googleSignInAccount, str12);
            case 165:
                int A0112 = C228309sC.A01(parcel2);
                String str13 = null;
                String str14 = null;
                long j2 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (parcel2.dataPosition() < A0112) {
                    int readInt21 = parcel2.readInt();
                    switch (C228309sC.A00(readInt21)) {
                        case 1:
                            i13 = C228309sC.A02(parcel2, readInt21);
                            break;
                        case 2:
                            j2 = C228309sC.A04(parcel2, readInt21);
                            break;
                        case 3:
                            str13 = C228309sC.A08(parcel2, readInt21);
                            break;
                        case 4:
                            i14 = C228309sC.A02(parcel2, readInt21);
                            break;
                        case 5:
                            i15 = C228309sC.A02(parcel2, readInt21);
                            break;
                        case 6:
                            str14 = C228309sC.A08(parcel2, readInt21);
                            break;
                        default:
                            C228309sC.A0D(parcel2, readInt21);
                            break;
                    }
                }
                C228309sC.A0C(parcel2, A0112);
                return new AccountChangeEvent(i13, j2, str13, i14, i15, str14);
            case 166:
                int A0113 = C228309sC.A01(parcel2);
                int i16 = 0;
                ArrayList arrayList8 = null;
                while (parcel2.dataPosition() < A0113) {
                    int readInt22 = parcel2.readInt();
                    int A0012 = C228309sC.A00(readInt22);
                    if (A0012 == 1) {
                        i16 = C228309sC.A02(parcel2, readInt22);
                    } else if (A0012 != 2) {
                        C228309sC.A0D(parcel2, readInt22);
                    } else {
                        arrayList8 = C228309sC.A0B(parcel2, readInt22, AccountChangeEvent.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0113);
                return new AccountChangeEventsResponse(i16, arrayList8);
            case 167:
                int A0114 = C228309sC.A01(parcel2);
                String str15 = null;
                Long l = null;
                ArrayList arrayList9 = null;
                String str16 = null;
                int i17 = 0;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel2.dataPosition() < A0114) {
                    int readInt23 = parcel2.readInt();
                    switch (C228309sC.A00(readInt23)) {
                        case 1:
                            i17 = C228309sC.A02(parcel2, readInt23);
                            break;
                        case 2:
                            str15 = C228309sC.A08(parcel2, readInt23);
                            break;
                        case 3:
                            int A03 = C228309sC.A03(parcel2, readInt23);
                            if (A03 != 0) {
                                C228309sC.A0F(parcel2, A03, 8);
                                l = Long.valueOf(parcel2.readLong());
                                break;
                            } else {
                                l = null;
                                break;
                            }
                        case 4:
                            z22 = C228309sC.A0G(parcel2, readInt23);
                            break;
                        case 5:
                            z23 = C228309sC.A0G(parcel2, readInt23);
                            break;
                        case 6:
                            arrayList9 = C228309sC.A0A(parcel2, readInt23);
                            break;
                        case 7:
                            str16 = C228309sC.A08(parcel2, readInt23);
                            break;
                        default:
                            C228309sC.A0D(parcel2, readInt23);
                            break;
                    }
                }
                C228309sC.A0C(parcel2, A0114);
                return new TokenData(i17, str15, l, z22, z23, arrayList9, str16);
            case 168:
                int A0115 = C228309sC.A01(parcel2);
                long j3 = 0;
                long j4 = 0;
                boolean z24 = false;
                while (parcel2.dataPosition() < A0115) {
                    int readInt24 = parcel2.readInt();
                    int A0013 = C228309sC.A00(readInt24);
                    if (A0013 == 1) {
                        z24 = C228309sC.A0G(parcel2, readInt24);
                    } else if (A0013 == 2) {
                        j4 = C228309sC.A04(parcel2, readInt24);
                    } else if (A0013 != 3) {
                        C228309sC.A0D(parcel2, readInt24);
                    } else {
                        j3 = C228309sC.A04(parcel2, readInt24);
                    }
                }
                C228309sC.A0C(parcel2, A0115);
                return new zzc(z24, j3, j4);
            case 169:
                int A0116 = C228309sC.A01(parcel2);
                com.google.android.gms.internal.clearcut.zzr zzr = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr3 = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                ExperimentTokens[] experimentTokensArr = null;
                boolean z25 = true;
                while (parcel2.dataPosition() < A0116) {
                    int readInt25 = parcel2.readInt();
                    switch (C228309sC.A00(readInt25)) {
                        case 2:
                            zzr = (com.google.android.gms.internal.clearcut.zzr) C228309sC.A07(parcel2, readInt25, com.google.android.gms.internal.clearcut.zzr.CREATOR);
                            break;
                        case 3:
                            bArr = C228309sC.A0H(parcel2, readInt25);
                            break;
                        case 4:
                            iArr = C228309sC.A0I(parcel2, readInt25);
                            break;
                        case 5:
                            strArr3 = C228309sC.A0K(parcel2, readInt25);
                            break;
                        case 6:
                            iArr2 = C228309sC.A0I(parcel2, readInt25);
                            break;
                        case 7:
                            bArr2 = C228309sC.A0L(parcel2, readInt25);
                            break;
                        case 8:
                            z25 = C228309sC.A0G(parcel2, readInt25);
                            break;
                        case 9:
                            experimentTokensArr = (ExperimentTokens[]) C228309sC.A0J(parcel2, readInt25, ExperimentTokens.CREATOR);
                            break;
                        default:
                            C228309sC.A0D(parcel2, readInt25);
                            break;
                    }
                }
                C228309sC.A0C(parcel2, A0116);
                return new zze(zzr, bArr, iArr, strArr3, iArr2, bArr2, z25, experimentTokensArr);
            case 170:
                int A0117 = C228309sC.A01(parcel2);
                int i18 = 0;
                String str17 = null;
                while (parcel2.dataPosition() < A0117) {
                    int readInt26 = parcel2.readInt();
                    int A0014 = C228309sC.A00(readInt26);
                    if (A0014 == 1) {
                        i18 = C228309sC.A02(parcel2, readInt26);
                    } else if (A0014 != 2) {
                        C228309sC.A0D(parcel2, readInt26);
                    } else {
                        str17 = C228309sC.A08(parcel2, readInt26);
                    }
                }
                C228309sC.A0C(parcel2, A0117);
                return new Scope(i18, str17);
            case 171:
                int A0118 = C228309sC.A01(parcel2);
                int i19 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                int i20 = 0;
                while (parcel2.dataPosition() < A0118) {
                    int readInt27 = parcel2.readInt();
                    int A0015 = C228309sC.A00(readInt27);
                    if (A0015 == 1) {
                        i19 = C228309sC.A02(parcel2, readInt27);
                    } else if (A0015 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) C228309sC.A07(parcel2, readInt27, ParcelFileDescriptor.CREATOR);
                    } else if (A0015 != 3) {
                        C228309sC.A0D(parcel2, readInt27);
                    } else {
                        i20 = C228309sC.A02(parcel2, readInt27);
                    }
                }
                C228309sC.A0C(parcel2, A0118);
                return new BitmapTeleporter(i19, parcelFileDescriptor, i20);
            case 172:
                int A0119 = C228309sC.A01(parcel2);
                int i21 = 0;
                String str18 = null;
                while (parcel2.dataPosition() < A0119) {
                    int readInt28 = parcel2.readInt();
                    int A0016 = C228309sC.A00(readInt28);
                    if (A0016 == 1) {
                        i21 = C228309sC.A02(parcel2, readInt28);
                    } else if (A0016 != 2) {
                        C228309sC.A0D(parcel2, readInt28);
                    } else {
                        str18 = C228309sC.A08(parcel2, readInt28);
                    }
                }
                C228309sC.A0C(parcel2, A0119);
                return new ClientIdentity(i21, str18);
            case 173:
                int A0120 = C228309sC.A01(parcel2);
                int i22 = 0;
                Scope[] scopeArr = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel2.dataPosition() < A0120) {
                    int readInt29 = parcel2.readInt();
                    int A0017 = C228309sC.A00(readInt29);
                    if (A0017 == 1) {
                        i22 = C228309sC.A02(parcel2, readInt29);
                    } else if (A0017 == 2) {
                        i23 = C228309sC.A02(parcel2, readInt29);
                    } else if (A0017 == 3) {
                        i24 = C228309sC.A02(parcel2, readInt29);
                    } else if (A0017 != 4) {
                        C228309sC.A0D(parcel2, readInt29);
                    } else {
                        scopeArr = (Scope[]) C228309sC.A0J(parcel2, readInt29, Scope.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0120);
                return new SignInButtonConfig(i22, i23, i24, scopeArr);
            case 174:
                return new BinderWrapper(parcel2);
            case 175:
                int A0121 = C228309sC.A01(parcel2);
                int i25 = 0;
                while (parcel2.dataPosition() < A0121) {
                    int readInt30 = parcel2.readInt();
                    if (C228309sC.A00(readInt30) != 1) {
                        C228309sC.A0D(parcel2, readInt30);
                    } else {
                        i25 = C228309sC.A02(parcel2, readInt30);
                    }
                }
                C228309sC.A0C(parcel2, A0121);
                return new com.google.android.gms.common.internal.zzr(i25);
            case 176:
                int A0122 = C228309sC.A01(parcel2);
                int i26 = 0;
                StringToIntConverter stringToIntConverter = null;
                while (parcel2.dataPosition() < A0122) {
                    int readInt31 = parcel2.readInt();
                    int A0018 = C228309sC.A00(readInt31);
                    if (A0018 == 1) {
                        i26 = C228309sC.A02(parcel2, readInt31);
                    } else if (A0018 != 2) {
                        C228309sC.A0D(parcel2, readInt31);
                    } else {
                        stringToIntConverter = (StringToIntConverter) C228309sC.A07(parcel2, readInt31, StringToIntConverter.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0122);
                return new zaa(i26, stringToIntConverter);
            case 177:
                int A0123 = C228309sC.A01(parcel2);
                int i27 = 0;
                ArrayList arrayList10 = null;
                while (parcel2.dataPosition() < A0123) {
                    int readInt32 = parcel2.readInt();
                    int A0019 = C228309sC.A00(readInt32);
                    if (A0019 == 1) {
                        i27 = C228309sC.A02(parcel2, readInt32);
                    } else if (A0019 != 2) {
                        C228309sC.A0D(parcel2, readInt32);
                    } else {
                        arrayList10 = C228309sC.A0B(parcel2, readInt32, StringToIntConverter.zaa.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0123);
                return new StringToIntConverter(i27, arrayList10);
            case 178:
                int A0124 = C228309sC.A01(parcel2);
                int i28 = 0;
                String str19 = null;
                int i29 = 0;
                while (parcel2.dataPosition() < A0124) {
                    int readInt33 = parcel2.readInt();
                    int A0020 = C228309sC.A00(readInt33);
                    if (A0020 == 1) {
                        i28 = C228309sC.A02(parcel2, readInt33);
                    } else if (A0020 == 2) {
                        str19 = C228309sC.A08(parcel2, readInt33);
                    } else if (A0020 != 3) {
                        C228309sC.A0D(parcel2, readInt33);
                    } else {
                        i29 = C228309sC.A02(parcel2, readInt33);
                    }
                }
                C228309sC.A0C(parcel2, A0124);
                return new StringToIntConverter.zaa(i28, str19, i29);
            case 179:
                int A0125 = C228309sC.A01(parcel2);
                String str20 = null;
                String str21 = null;
                zaa zaa = null;
                int i30 = 0;
                int i31 = 0;
                boolean z26 = false;
                int i32 = 0;
                boolean z27 = false;
                int i33 = 0;
                while (parcel2.dataPosition() < A0125) {
                    int readInt34 = parcel2.readInt();
                    switch (C228309sC.A00(readInt34)) {
                        case 1:
                            i30 = C228309sC.A02(parcel2, readInt34);
                            break;
                        case 2:
                            i31 = C228309sC.A02(parcel2, readInt34);
                            break;
                        case 3:
                            z26 = C228309sC.A0G(parcel2, readInt34);
                            break;
                        case 4:
                            i32 = C228309sC.A02(parcel2, readInt34);
                            break;
                        case 5:
                            z27 = C228309sC.A0G(parcel2, readInt34);
                            break;
                        case 6:
                            str20 = C228309sC.A08(parcel2, readInt34);
                            break;
                        case 7:
                            i33 = C228309sC.A02(parcel2, readInt34);
                            break;
                        case 8:
                            str21 = C228309sC.A08(parcel2, readInt34);
                            break;
                        case 9:
                            zaa = (zaa) C228309sC.A07(parcel2, readInt34, zaa.CREATOR);
                            break;
                        default:
                            C228309sC.A0D(parcel2, readInt34);
                            break;
                    }
                }
                C228309sC.A0C(parcel2, A0125);
                return new FastJsonResponse$Field(i30, i31, z26, i32, z27, str20, i33, str21, zaa);
            case 180:
                int A0126 = C228309sC.A01(parcel2);
                String str22 = null;
                int i34 = 0;
                FastJsonResponse$Field fastJsonResponse$Field = null;
                while (parcel2.dataPosition() < A0126) {
                    int readInt35 = parcel2.readInt();
                    int A0021 = C228309sC.A00(readInt35);
                    if (A0021 == 1) {
                        i34 = C228309sC.A02(parcel2, readInt35);
                    } else if (A0021 == 2) {
                        str22 = C228309sC.A08(parcel2, readInt35);
                    } else if (A0021 != 3) {
                        C228309sC.A0D(parcel2, readInt35);
                    } else {
                        fastJsonResponse$Field = (FastJsonResponse$Field) C228309sC.A07(parcel2, readInt35, FastJsonResponse$Field.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0126);
                return new zam(i34, str22, fastJsonResponse$Field);
            case 181:
                int A0127 = C228309sC.A01(parcel2);
                ArrayList arrayList11 = null;
                int i35 = 0;
                String str23 = null;
                while (parcel2.dataPosition() < A0127) {
                    int readInt36 = parcel2.readInt();
                    int A0022 = C228309sC.A00(readInt36);
                    if (A0022 == 1) {
                        i35 = C228309sC.A02(parcel2, readInt36);
                    } else if (A0022 == 2) {
                        arrayList11 = C228309sC.A0B(parcel2, readInt36, zal.CREATOR);
                    } else if (A0022 != 3) {
                        C228309sC.A0D(parcel2, readInt36);
                    } else {
                        str23 = C228309sC.A08(parcel2, readInt36);
                    }
                }
                C228309sC.A0C(parcel2, A0127);
                return new zak(i35, arrayList11, str23);
            case 182:
                int A0128 = C228309sC.A01(parcel2);
                String str24 = null;
                int i36 = 0;
                ArrayList arrayList12 = null;
                while (parcel2.dataPosition() < A0128) {
                    int readInt37 = parcel2.readInt();
                    int A0023 = C228309sC.A00(readInt37);
                    if (A0023 == 1) {
                        i36 = C228309sC.A02(parcel2, readInt37);
                    } else if (A0023 == 2) {
                        str24 = C228309sC.A08(parcel2, readInt37);
                    } else if (A0023 != 3) {
                        C228309sC.A0D(parcel2, readInt37);
                    } else {
                        arrayList12 = C228309sC.A0B(parcel2, readInt37, zam.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0128);
                return new zal(i36, str24, arrayList12);
            case 183:
                int A0129 = C228309sC.A01(parcel2);
                Parcel parcel3 = null;
                int i37 = 0;
                zak zak = null;
                while (parcel2.dataPosition() < A0129) {
                    int readInt38 = parcel2.readInt();
                    int A0024 = C228309sC.A00(readInt38);
                    if (A0024 == 1) {
                        i37 = C228309sC.A02(parcel2, readInt38);
                    } else if (A0024 == 2) {
                        int A032 = C228309sC.A03(parcel2, readInt38);
                        int dataPosition = parcel2.dataPosition();
                        if (A032 == 0) {
                            parcel3 = null;
                        } else {
                            parcel3 = Parcel.obtain();
                            parcel3.appendFrom(parcel2, dataPosition, A032);
                            parcel2.setDataPosition(dataPosition + A032);
                        }
                    } else if (A0024 != 3) {
                        C228309sC.A0D(parcel2, readInt38);
                    } else {
                        zak = (zak) C228309sC.A07(parcel2, readInt38, zak.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0129);
                return new SafeParcelResponse(i37, parcel3, zak);
            case 184:
                int A0130 = C228309sC.A01(parcel2);
                int i38 = 0;
                String str25 = null;
                int i39 = 0;
                while (parcel2.dataPosition() < A0130) {
                    int readInt39 = parcel2.readInt();
                    int A0025 = C228309sC.A00(readInt39);
                    if (A0025 == 1) {
                        i38 = C228309sC.A02(parcel2, readInt39);
                    } else if (A0025 == 2) {
                        str25 = C228309sC.A08(parcel2, readInt39);
                    } else if (A0025 != 3) {
                        C228309sC.A0D(parcel2, readInt39);
                    } else {
                        i39 = C228309sC.A02(parcel2, readInt39);
                    }
                }
                C228309sC.A0C(parcel2, A0130);
                return new FavaDiagnosticsEntity(i38, str25, i39);
            case 185:
                int A0131 = C228309sC.A01(parcel2);
                String str26 = null;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                ArrayList arrayList13 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                while (parcel2.dataPosition() < A0131) {
                    int readInt40 = parcel2.readInt();
                    switch (C228309sC.A00(readInt40)) {
                        case 1:
                            i40 = C228309sC.A02(parcel2, readInt40);
                            break;
                        case 2:
                            j5 = C228309sC.A04(parcel2, readInt40);
                            break;
                        case 4:
                            str26 = C228309sC.A08(parcel2, readInt40);
                            break;
                        case 5:
                            i42 = C228309sC.A02(parcel2, readInt40);
                            break;
                        case 6:
                            arrayList13 = C228309sC.A0A(parcel2, readInt40);
                            break;
                        case 8:
                            j6 = C228309sC.A04(parcel2, readInt40);
                            break;
                        case 10:
                            str28 = C228309sC.A08(parcel2, readInt40);
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER:
                            i41 = C228309sC.A02(parcel2, readInt40);
                            break;
                        case C120125Dh.VIEW_TYPE_SPINNER:
                            str27 = C228309sC.A08(parcel2, readInt40);
                            break;
                        case C120125Dh.VIEW_TYPE_BADGE:
                            str29 = C228309sC.A08(parcel2, readInt40);
                            break;
                        case C120125Dh.VIEW_TYPE_LINK:
                            i43 = C228309sC.A02(parcel2, readInt40);
                            break;
                        case 15:
                            C228309sC.A0E(parcel2, readInt40, 4);
                            f = parcel2.readFloat();
                            break;
                        case 16:
                            j7 = C228309sC.A04(parcel2, readInt40);
                            break;
                        case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                            str30 = C228309sC.A08(parcel2, readInt40);
                            break;
                        default:
                            C228309sC.A0D(parcel2, readInt40);
                            break;
                    }
                }
                C228309sC.A0C(parcel2, A0131);
                return new WakeLockEvent(i40, j5, i41, str26, i42, arrayList13, str27, j6, i43, str28, str29, f, j7, str30);
            case 186:
                int A0132 = C228309sC.A01(parcel2);
                String str31 = null;
                int i44 = 0;
                long j8 = -1;
                while (parcel2.dataPosition() < A0132) {
                    int readInt41 = parcel2.readInt();
                    int A0026 = C228309sC.A00(readInt41);
                    if (A0026 == 1) {
                        str31 = C228309sC.A08(parcel2, readInt41);
                    } else if (A0026 == 2) {
                        i44 = C228309sC.A02(parcel2, readInt41);
                    } else if (A0026 != 3) {
                        C228309sC.A0D(parcel2, readInt41);
                    } else {
                        j8 = C228309sC.A04(parcel2, readInt41);
                    }
                }
                C228309sC.A0C(parcel2, A0132);
                return new Feature(str31, i44, j8);
            case 187:
                int A0133 = C228309sC.A01(parcel2);
                Credential credential = null;
                while (parcel2.dataPosition() < A0133) {
                    int readInt42 = parcel2.readInt();
                    if (C228309sC.A00(readInt42) != 1) {
                        C228309sC.A0D(parcel2, readInt42);
                    } else {
                        credential = (Credential) C228309sC.A07(parcel2, readInt42, Credential.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0133);
                return new zzs(credential);
            case 188:
                int A0134 = C228309sC.A01(parcel2);
                Credential credential2 = null;
                while (parcel2.dataPosition() < A0134) {
                    int readInt43 = parcel2.readInt();
                    if (C228309sC.A00(readInt43) != 1) {
                        C228309sC.A0D(parcel2, readInt43);
                    } else {
                        credential2 = (Credential) C228309sC.A07(parcel2, readInt43, Credential.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0134);
                return new zzy(credential2);
            case 189:
                int A0135 = C228309sC.A01(parcel2);
                String str32 = null;
                int i45 = 0;
                while (parcel2.dataPosition() < A0135) {
                    int readInt44 = parcel2.readInt();
                    int A0027 = C228309sC.A00(readInt44);
                    if (A0027 == 1) {
                        C228309sC.A02(parcel2, readInt44);
                    } else if (A0027 == 2) {
                        str32 = C228309sC.A08(parcel2, readInt44);
                    } else if (A0027 != 3) {
                        C228309sC.A0D(parcel2, readInt44);
                    } else {
                        i45 = C228309sC.A02(parcel2, readInt44);
                    }
                }
                C228309sC.A0C(parcel2, A0135);
                return new zzab(str32, i45);
            case 190:
                int A0136 = C228309sC.A01(parcel2);
                String str33 = null;
                while (parcel2.dataPosition() < A0136) {
                    int readInt45 = parcel2.readInt();
                    int A0028 = C228309sC.A00(readInt45);
                    if (A0028 == 1) {
                        C228309sC.A02(parcel2, readInt45);
                    } else if (A0028 != 2) {
                        C228309sC.A0D(parcel2, readInt45);
                    } else {
                        str33 = C228309sC.A08(parcel2, readInt45);
                    }
                }
                C228309sC.A0C(parcel2, A0136);
                return new zzad(str33);
            case 191:
                int A0137 = C228309sC.A01(parcel2);
                String str34 = null;
                byte[] bArr3 = null;
                while (parcel2.dataPosition() < A0137) {
                    int readInt46 = parcel2.readInt();
                    int A0029 = C228309sC.A00(readInt46);
                    if (A0029 == 1) {
                        C228309sC.A02(parcel2, readInt46);
                    } else if (A0029 == 2) {
                        str34 = C228309sC.A08(parcel2, readInt46);
                    } else if (A0029 != 3) {
                        C228309sC.A0D(parcel2, readInt46);
                    } else {
                        bArr3 = C228309sC.A0H(parcel2, readInt46);
                    }
                }
                C228309sC.A0C(parcel2, A0137);
                return new zzaf(str34, bArr3);
            case 192:
                int A0138 = C228309sC.A01(parcel2);
                String str35 = null;
                while (parcel2.dataPosition() < A0138) {
                    int readInt47 = parcel2.readInt();
                    int A0030 = C228309sC.A00(readInt47);
                    if (A0030 == 1) {
                        C228309sC.A02(parcel2, readInt47);
                    } else if (A0030 != 2) {
                        C228309sC.A0D(parcel2, readInt47);
                    } else {
                        str35 = C228309sC.A08(parcel2, readInt47);
                    }
                }
                C228309sC.A0C(parcel2, A0138);
                return new zzv(str35);
            case 193:
                int A0139 = C228309sC.A01(parcel2);
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                int i46 = 0;
                int i47 = 0;
                boolean z28 = true;
                boolean z29 = false;
                int i48 = 0;
                while (parcel2.dataPosition() < A0139) {
                    int readInt48 = parcel2.readInt();
                    switch (C228309sC.A00(readInt48)) {
                        case 2:
                            str36 = C228309sC.A08(parcel2, readInt48);
                        case 3:
                            i46 = C228309sC.A02(parcel2, readInt48);
                        case 4:
                            i47 = C228309sC.A02(parcel2, readInt48);
                        case 5:
                            str37 = C228309sC.A08(parcel2, readInt48);
                        case 6:
                            str38 = C228309sC.A08(parcel2, readInt48);
                        case 7:
                            z28 = C228309sC.A0G(parcel2, readInt48);
                        case 8:
                            str39 = C228309sC.A08(parcel2, readInt48);
                        case 9:
                            z29 = C228309sC.A0G(parcel2, readInt48);
                        case 10:
                            i48 = C228309sC.A02(parcel2, readInt48);
                        default:
                            C228309sC.A0D(parcel2, readInt48);
                    }
                }
                C228309sC.A0C(parcel2, A0139);
                return new com.google.android.gms.internal.clearcut.zzr(str36, i46, i47, str37, str38, z28, str39, z29, i48);
            case 194:
                int A0140 = C228309sC.A01(parcel2);
                Status status = null;
                while (parcel2.dataPosition() < A0140) {
                    int readInt49 = parcel2.readInt();
                    if (C228309sC.A00(readInt49) != 1) {
                        C228309sC.A0D(parcel2, readInt49);
                    } else {
                        status = (Status) C228309sC.A07(parcel2, readInt49, Status.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0140);
                return new com.google.android.gms.internal.location.zzad(status);
            case 195:
                int A0141 = C228309sC.A01(parcel2);
                List list = zzbd.A07;
                LocationRequest locationRequest = null;
                String str40 = null;
                String str41 = null;
                boolean z30 = false;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel2.dataPosition() < A0141) {
                    int readInt50 = parcel2.readInt();
                    int A0031 = C228309sC.A00(readInt50);
                    if (A0031 != 1) {
                        switch (A0031) {
                            case 5:
                                list = C228309sC.A0B(parcel2, readInt50, ClientIdentity.CREATOR);
                            case 6:
                                str40 = C228309sC.A08(parcel2, readInt50);
                            case 7:
                                z30 = C228309sC.A0G(parcel2, readInt50);
                            case 8:
                                z31 = C228309sC.A0G(parcel2, readInt50);
                            case 9:
                                z32 = C228309sC.A0G(parcel2, readInt50);
                            case 10:
                                str41 = C228309sC.A08(parcel2, readInt50);
                            default:
                                C228309sC.A0D(parcel2, readInt50);
                        }
                    } else {
                        locationRequest = (LocationRequest) C228309sC.A07(parcel2, readInt50, LocationRequest.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0141);
                return new zzbd(locationRequest, list, str40, z30, z31, z32, str41);
            case 196:
                int A0142 = C228309sC.A01(parcel2);
                String str42 = null;
                double d = 0.0d;
                double d2 = 0.0d;
                long j9 = 0;
                int i49 = 0;
                short s = 0;
                float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                int i50 = 0;
                int i51 = -1;
                while (parcel2.dataPosition() < A0142) {
                    int readInt51 = parcel2.readInt();
                    switch (C228309sC.A00(readInt51)) {
                        case 1:
                            str42 = C228309sC.A08(parcel2, readInt51);
                        case 2:
                            j9 = C228309sC.A04(parcel2, readInt51);
                        case 3:
                            C228309sC.A0E(parcel2, readInt51, 4);
                            s = (short) parcel2.readInt();
                        case 4:
                            C228309sC.A0E(parcel2, readInt51, 8);
                            d = parcel2.readDouble();
                        case 5:
                            C228309sC.A0E(parcel2, readInt51, 8);
                            d2 = parcel2.readDouble();
                        case 6:
                            C228309sC.A0E(parcel2, readInt51, 4);
                            f2 = parcel2.readFloat();
                        case 7:
                            i49 = C228309sC.A02(parcel2, readInt51);
                        case 8:
                            i50 = C228309sC.A02(parcel2, readInt51);
                        case 9:
                            i51 = C228309sC.A02(parcel2, readInt51);
                        default:
                            C228309sC.A0D(parcel2, readInt51);
                    }
                }
                C228309sC.A0C(parcel2, A0142);
                return new zzbh(str42, i49, s, d, d2, f2, j9, i50, i51);
            case 197:
                int A0143 = C228309sC.A01(parcel2);
                zzj zzj = zzm.A03;
                List list2 = zzm.A04;
                String str43 = null;
                while (parcel2.dataPosition() < A0143) {
                    int readInt52 = parcel2.readInt();
                    int A0032 = C228309sC.A00(readInt52);
                    if (A0032 == 1) {
                        zzj = (zzj) C228309sC.A07(parcel2, readInt52, zzj.CREATOR);
                    } else if (A0032 == 2) {
                        list2 = C228309sC.A0B(parcel2, readInt52, ClientIdentity.CREATOR);
                    } else if (A0032 != 3) {
                        C228309sC.A0D(parcel2, readInt52);
                    } else {
                        str43 = C228309sC.A08(parcel2, readInt52);
                    }
                }
                C228309sC.A0C(parcel2, A0143);
                return new zzm(zzj, list2, str43);
            case 198:
                int A0144 = C228309sC.A01(parcel2);
                zzan[] zzanArr = null;
                com.google.android.gms.internal.vision.zzy zzy = null;
                com.google.android.gms.internal.vision.zzy zzy2 = null;
                com.google.android.gms.internal.vision.zzy zzy3 = null;
                String str44 = null;
                String str45 = null;
                float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                int i52 = 0;
                boolean z33 = false;
                int i53 = 0;
                int i54 = 0;
                while (parcel2.dataPosition() < A0144) {
                    int readInt53 = parcel2.readInt();
                    switch (C228309sC.A00(readInt53)) {
                        case 2:
                            zzanArr = (zzan[]) C228309sC.A0J(parcel2, readInt53, zzan.CREATOR);
                        case 3:
                            zzy = (com.google.android.gms.internal.vision.zzy) C228309sC.A07(parcel2, readInt53, com.google.android.gms.internal.vision.zzy.CREATOR);
                        case 4:
                            zzy2 = (com.google.android.gms.internal.vision.zzy) C228309sC.A07(parcel2, readInt53, com.google.android.gms.internal.vision.zzy.CREATOR);
                        case 5:
                            zzy3 = (com.google.android.gms.internal.vision.zzy) C228309sC.A07(parcel2, readInt53, com.google.android.gms.internal.vision.zzy.CREATOR);
                        case 6:
                            str44 = C228309sC.A08(parcel2, readInt53);
                        case 7:
                            C228309sC.A0E(parcel2, readInt53, 4);
                            f3 = parcel2.readFloat();
                        case 8:
                            str45 = C228309sC.A08(parcel2, readInt53);
                        case 9:
                            i52 = C228309sC.A02(parcel2, readInt53);
                        case 10:
                            z33 = C228309sC.A0G(parcel2, readInt53);
                        case C120125Dh.VIEW_TYPE_BANNER:
                            i53 = C228309sC.A02(parcel2, readInt53);
                        case C120125Dh.VIEW_TYPE_SPINNER:
                            i54 = C228309sC.A02(parcel2, readInt53);
                        default:
                            C228309sC.A0D(parcel2, readInt53);
                    }
                }
                C228309sC.A0C(parcel2, A0144);
                return new zzae(zzanArr, zzy, zzy2, zzy3, str44, f3, str45, i52, z33, i53, i54);
            case 199:
                int A0145 = C228309sC.A01(parcel2);
                while (parcel2.dataPosition() < A0145) {
                    C228309sC.A0D(parcel2, parcel2.readInt());
                }
                C228309sC.A0C(parcel2, A0145);
                return new zzai();
            case 200:
                int A0146 = C228309sC.A01(parcel2);
                while (parcel2.dataPosition() < A0146) {
                    C228309sC.A0D(parcel2, parcel2.readInt());
                }
                C228309sC.A0C(parcel2, A0146);
                return new zzal();
            case 201:
                int A0147 = C228309sC.A01(parcel2);
                zzai[] zzaiArr = null;
                com.google.android.gms.internal.vision.zzy zzy4 = null;
                com.google.android.gms.internal.vision.zzy zzy5 = null;
                String str46 = null;
                String str47 = null;
                float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                boolean z34 = false;
                while (parcel2.dataPosition() < A0147) {
                    int readInt54 = parcel2.readInt();
                    switch (C228309sC.A00(readInt54)) {
                        case 2:
                            zzaiArr = (zzai[]) C228309sC.A0J(parcel2, readInt54, zzai.CREATOR);
                        case 3:
                            zzy4 = (com.google.android.gms.internal.vision.zzy) C228309sC.A07(parcel2, readInt54, com.google.android.gms.internal.vision.zzy.CREATOR);
                        case 4:
                            zzy5 = (com.google.android.gms.internal.vision.zzy) C228309sC.A07(parcel2, readInt54, com.google.android.gms.internal.vision.zzy.CREATOR);
                        case 5:
                            str46 = C228309sC.A08(parcel2, readInt54);
                        case 6:
                            C228309sC.A0E(parcel2, readInt54, 4);
                            f4 = parcel2.readFloat();
                        case 7:
                            str47 = C228309sC.A08(parcel2, readInt54);
                        case 8:
                            z34 = C228309sC.A0G(parcel2, readInt54);
                        default:
                            C228309sC.A0D(parcel2, readInt54);
                    }
                }
                C228309sC.A0C(parcel2, A0147);
                return new zzan(zzaiArr, zzy4, zzy5, str46, f4, str47, z34);
            case 202:
                int A0148 = C228309sC.A01(parcel2);
                int i55 = 0;
                while (parcel2.dataPosition() < A0148) {
                    int readInt55 = parcel2.readInt();
                    if (C228309sC.A00(readInt55) != 2) {
                        C228309sC.A0D(parcel2, readInt55);
                    } else {
                        i55 = C228309sC.A02(parcel2, readInt55);
                    }
                }
                C228309sC.A0C(parcel2, A0148);
                return new com.google.android.gms.internal.vision.zze(i55);
            case 203:
                int A0149 = C228309sC.A01(parcel2);
                long j10 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                while (parcel2.dataPosition() < A0149) {
                    int readInt56 = parcel2.readInt();
                    int A0033 = C228309sC.A00(readInt56);
                    if (A0033 == 2) {
                        i56 = C228309sC.A02(parcel2, readInt56);
                    } else if (A0033 == 3) {
                        i57 = C228309sC.A02(parcel2, readInt56);
                    } else if (A0033 == 4) {
                        i58 = C228309sC.A02(parcel2, readInt56);
                    } else if (A0033 == 5) {
                        j10 = C228309sC.A04(parcel2, readInt56);
                    } else if (A0033 != 6) {
                        C228309sC.A0D(parcel2, readInt56);
                    } else {
                        i59 = C228309sC.A02(parcel2, readInt56);
                    }
                }
                C228309sC.A0C(parcel2, A0149);
                return new zzn(i56, i57, i58, j10, i59);
            case 204:
                int A0150 = C228309sC.A01(parcel2);
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                int i63 = 0;
                float f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                while (parcel2.dataPosition() < A0150) {
                    int readInt57 = parcel2.readInt();
                    int A0034 = C228309sC.A00(readInt57);
                    if (A0034 == 2) {
                        i60 = C228309sC.A02(parcel2, readInt57);
                    } else if (A0034 == 3) {
                        i61 = C228309sC.A02(parcel2, readInt57);
                    } else if (A0034 == 4) {
                        i62 = C228309sC.A02(parcel2, readInt57);
                    } else if (A0034 == 5) {
                        i63 = C228309sC.A02(parcel2, readInt57);
                    } else if (A0034 != 6) {
                        C228309sC.A0D(parcel2, readInt57);
                    } else {
                        C228309sC.A0E(parcel2, readInt57, 4);
                        f5 = parcel2.readFloat();
                    }
                }
                C228309sC.A0C(parcel2, A0150);
                return new com.google.android.gms.internal.vision.zzy(i60, i61, i62, i63, f5);
            case 205:
                int A0151 = C228309sC.A01(parcel2);
                String str48 = null;
                int i64 = 0;
                String str49 = null;
                String str50 = null;
                while (parcel2.dataPosition() < A0151) {
                    int readInt58 = parcel2.readInt();
                    int A0035 = C228309sC.A00(readInt58);
                    if (A0035 == 1) {
                        i64 = C228309sC.A02(parcel2, readInt58);
                    } else if (A0035 == 2) {
                        str48 = C228309sC.A08(parcel2, readInt58);
                    } else if (A0035 == 3) {
                        str49 = C228309sC.A08(parcel2, readInt58);
                    } else if (A0035 != 4) {
                        C228309sC.A0D(parcel2, readInt58);
                    } else {
                        str50 = C228309sC.A08(parcel2, readInt58);
                    }
                }
                C228309sC.A0C(parcel2, A0151);
                return new PlaceReport(i64, str48, str49, str50);
            case 206:
                int A0152 = C228309sC.A01(parcel2);
                zzaj[] zzajArr = null;
                long j11 = 0;
                int i65 = 1000;
                int i66 = 1;
                int i67 = 1;
                while (parcel2.dataPosition() < A0152) {
                    int readInt59 = parcel2.readInt();
                    int A0036 = C228309sC.A00(readInt59);
                    if (A0036 == 1) {
                        i66 = C228309sC.A02(parcel2, readInt59);
                    } else if (A0036 == 2) {
                        i67 = C228309sC.A02(parcel2, readInt59);
                    } else if (A0036 == 3) {
                        j11 = C228309sC.A04(parcel2, readInt59);
                    } else if (A0036 == 4) {
                        i65 = C228309sC.A02(parcel2, readInt59);
                    } else if (A0036 != 5) {
                        C228309sC.A0D(parcel2, readInt59);
                    } else {
                        zzajArr = (zzaj[]) C228309sC.A0J(parcel2, readInt59, zzaj.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0152);
                return new LocationAvailability(i65, i66, i67, j11, zzajArr);
            case 207:
                int A0153 = C228309sC.A01(parcel2);
                long j12 = 3600000;
                long j13 = 600000;
                long j14 = Long.MAX_VALUE;
                long j15 = 0;
                int i68 = 102;
                boolean z35 = false;
                int i69 = Integer.MAX_VALUE;
                float f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                while (parcel2.dataPosition() < A0153) {
                    int readInt60 = parcel2.readInt();
                    switch (C228309sC.A00(readInt60)) {
                        case 1:
                            i68 = C228309sC.A02(parcel2, readInt60);
                        case 2:
                            j12 = C228309sC.A04(parcel2, readInt60);
                        case 3:
                            j13 = C228309sC.A04(parcel2, readInt60);
                        case 4:
                            z35 = C228309sC.A0G(parcel2, readInt60);
                        case 5:
                            j14 = C228309sC.A04(parcel2, readInt60);
                        case 6:
                            i69 = C228309sC.A02(parcel2, readInt60);
                        case 7:
                            C228309sC.A0E(parcel2, readInt60, 4);
                            f6 = parcel2.readFloat();
                        case 8:
                            j15 = C228309sC.A04(parcel2, readInt60);
                        default:
                            C228309sC.A0D(parcel2, readInt60);
                    }
                }
                C228309sC.A0C(parcel2, A0153);
                return new LocationRequest(i68, j12, j13, z35, j14, i69, f6, j15);
            case 208:
                int A0154 = C228309sC.A01(parcel2);
                String str51 = "";
                String str52 = str51;
                String str53 = str51;
                while (parcel2.dataPosition() < A0154) {
                    int readInt61 = parcel2.readInt();
                    int A0037 = C228309sC.A00(readInt61);
                    if (A0037 == 1) {
                        str52 = C228309sC.A08(parcel2, readInt61);
                    } else if (A0037 == 2) {
                        str53 = C228309sC.A08(parcel2, readInt61);
                    } else if (A0037 != 5) {
                        C228309sC.A0D(parcel2, readInt61);
                    } else {
                        str51 = C228309sC.A08(parcel2, readInt61);
                    }
                }
                C228309sC.A0C(parcel2, A0154);
                return new com.google.android.gms.location.zzae(str51, str52, str53);
            case 209:
                int A0155 = C228309sC.A01(parcel2);
                boolean z36 = false;
                ArrayList arrayList14 = null;
                com.google.android.gms.location.zzae zzae = null;
                boolean z37 = false;
                while (parcel2.dataPosition() < A0155) {
                    int readInt62 = parcel2.readInt();
                    int A0038 = C228309sC.A00(readInt62);
                    if (A0038 == 1) {
                        arrayList14 = C228309sC.A0B(parcel2, readInt62, LocationRequest.CREATOR);
                    } else if (A0038 == 2) {
                        z36 = C228309sC.A0G(parcel2, readInt62);
                    } else if (A0038 == 3) {
                        z37 = C228309sC.A0G(parcel2, readInt62);
                    } else if (A0038 != 5) {
                        C228309sC.A0D(parcel2, readInt62);
                    } else {
                        zzae = (com.google.android.gms.location.zzae) C228309sC.A07(parcel2, readInt62, com.google.android.gms.location.zzae.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0155);
                return new LocationSettingsRequest(arrayList14, z36, z37, zzae);
            case 210:
                int A0156 = C228309sC.A01(parcel2);
                Status status2 = null;
                LocationSettingsStates locationSettingsStates = null;
                while (parcel2.dataPosition() < A0156) {
                    int readInt63 = parcel2.readInt();
                    int A0039 = C228309sC.A00(readInt63);
                    if (A0039 == 1) {
                        status2 = (Status) C228309sC.A07(parcel2, readInt63, Status.CREATOR);
                    } else if (A0039 != 2) {
                        C228309sC.A0D(parcel2, readInt63);
                    } else {
                        locationSettingsStates = (LocationSettingsStates) C228309sC.A07(parcel2, readInt63, LocationSettingsStates.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0156);
                return new LocationSettingsResult(status2, locationSettingsStates);
            case 211:
                int A0157 = C228309sC.A01(parcel2);
                boolean z38 = false;
                boolean z39 = false;
                boolean z40 = false;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                while (parcel2.dataPosition() < A0157) {
                    int readInt64 = parcel2.readInt();
                    switch (C228309sC.A00(readInt64)) {
                        case 1:
                            z38 = C228309sC.A0G(parcel2, readInt64);
                        case 2:
                            z39 = C228309sC.A0G(parcel2, readInt64);
                        case 3:
                            z40 = C228309sC.A0G(parcel2, readInt64);
                        case 4:
                            z41 = C228309sC.A0G(parcel2, readInt64);
                        case 5:
                            z42 = C228309sC.A0G(parcel2, readInt64);
                        case 6:
                            z43 = C228309sC.A0G(parcel2, readInt64);
                        default:
                            C228309sC.A0D(parcel2, readInt64);
                    }
                }
                C228309sC.A0C(parcel2, A0157);
                return new LocationSettingsStates(z38, z39, z40, z41, z42, z43);
            case 212:
                int A0158 = C228309sC.A01(parcel2);
                long j16 = -1;
                long j17 = -1;
                int i70 = 1;
                int i71 = 1;
                while (parcel2.dataPosition() < A0158) {
                    int readInt65 = parcel2.readInt();
                    int A0040 = C228309sC.A00(readInt65);
                    if (A0040 == 1) {
                        i70 = C228309sC.A02(parcel2, readInt65);
                    } else if (A0040 == 2) {
                        i71 = C228309sC.A02(parcel2, readInt65);
                    } else if (A0040 == 3) {
                        j16 = C228309sC.A04(parcel2, readInt65);
                    } else if (A0040 != 4) {
                        C228309sC.A0D(parcel2, readInt65);
                    } else {
                        j17 = C228309sC.A04(parcel2, readInt65);
                    }
                }
                C228309sC.A0C(parcel2, A0158);
                return new zzaj(i70, i71, j16, j17);
            case 213:
                int A0159 = C228309sC.A01(parcel2);
                int i72 = 0;
                int i73 = 0;
                while (parcel2.dataPosition() < A0159) {
                    int readInt66 = parcel2.readInt();
                    int A0041 = C228309sC.A00(readInt66);
                    if (A0041 == 1) {
                        i72 = C228309sC.A02(parcel2, readInt66);
                    } else if (A0041 != 2) {
                        C228309sC.A0D(parcel2, readInt66);
                    } else {
                        i73 = C228309sC.A02(parcel2, readInt66);
                    }
                }
                C228309sC.A0C(parcel2, A0159);
                return new ActivityTransition(i72, i73);
            case 214:
                int A0160 = C228309sC.A01(parcel2);
                int i74 = 0;
                long j18 = 0;
                int i75 = 0;
                while (parcel2.dataPosition() < A0160) {
                    int readInt67 = parcel2.readInt();
                    int A0042 = C228309sC.A00(readInt67);
                    if (A0042 == 1) {
                        i74 = C228309sC.A02(parcel2, readInt67);
                    } else if (A0042 == 2) {
                        i75 = C228309sC.A02(parcel2, readInt67);
                    } else if (A0042 != 3) {
                        C228309sC.A0D(parcel2, readInt67);
                    } else {
                        j18 = C228309sC.A04(parcel2, readInt67);
                    }
                }
                C228309sC.A0C(parcel2, A0160);
                return new ActivityTransitionEvent(i74, i75, j18);
            case 215:
                int A0161 = C228309sC.A01(parcel2);
                ArrayList arrayList15 = null;
                String str54 = null;
                ArrayList arrayList16 = null;
                while (parcel2.dataPosition() < A0161) {
                    int readInt68 = parcel2.readInt();
                    int A0043 = C228309sC.A00(readInt68);
                    if (A0043 == 1) {
                        arrayList15 = C228309sC.A0B(parcel2, readInt68, ActivityTransition.CREATOR);
                    } else if (A0043 == 2) {
                        str54 = C228309sC.A08(parcel2, readInt68);
                    } else if (A0043 != 3) {
                        C228309sC.A0D(parcel2, readInt68);
                    } else {
                        arrayList16 = C228309sC.A0B(parcel2, readInt68, ClientIdentity.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0161);
                return new ActivityTransitionRequest(arrayList15, str54, arrayList16);
            case 216:
                int A0162 = C228309sC.A01(parcel2);
                ArrayList arrayList17 = null;
                while (parcel2.dataPosition() < A0162) {
                    int readInt69 = parcel2.readInt();
                    if (C228309sC.A00(readInt69) != 1) {
                        C228309sC.A0D(parcel2, readInt69);
                    } else {
                        arrayList17 = C228309sC.A0B(parcel2, readInt69, ActivityTransitionEvent.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0162);
                return new ActivityTransitionResult(arrayList17);
            case 217:
                int A0163 = C228309sC.A01(parcel2);
                int i76 = 0;
                int i77 = 0;
                while (parcel2.dataPosition() < A0163) {
                    int readInt70 = parcel2.readInt();
                    int A0044 = C228309sC.A00(readInt70);
                    if (A0044 == 1) {
                        i76 = C228309sC.A02(parcel2, readInt70);
                    } else if (A0044 != 2) {
                        C228309sC.A0D(parcel2, readInt70);
                    } else {
                        i77 = C228309sC.A02(parcel2, readInt70);
                    }
                }
                C228309sC.A0C(parcel2, A0163);
                return new DetectedActivity(i76, i77);
            case 218:
                int A0164 = C228309sC.A01(parcel2);
                long j19 = 50;
                long j20 = Long.MAX_VALUE;
                boolean z44 = true;
                float f7 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                int i78 = Integer.MAX_VALUE;
                while (parcel2.dataPosition() < A0164) {
                    int readInt71 = parcel2.readInt();
                    int A0045 = C228309sC.A00(readInt71);
                    if (A0045 == 1) {
                        z44 = C228309sC.A0G(parcel2, readInt71);
                    } else if (A0045 == 2) {
                        j19 = C228309sC.A04(parcel2, readInt71);
                    } else if (A0045 == 3) {
                        C228309sC.A0E(parcel2, readInt71, 4);
                        f7 = parcel2.readFloat();
                    } else if (A0045 == 4) {
                        j20 = C228309sC.A04(parcel2, readInt71);
                    } else if (A0045 != 5) {
                        C228309sC.A0D(parcel2, readInt71);
                    } else {
                        i78 = C228309sC.A02(parcel2, readInt71);
                    }
                }
                C228309sC.A0C(parcel2, A0164);
                return new zzj(z44, j19, f7, j20, i78);
            case 219:
                int A0165 = C228309sC.A01(parcel2);
                ArrayList arrayList18 = null;
                int i79 = 0;
                String str55 = "";
                while (parcel2.dataPosition() < A0165) {
                    int readInt72 = parcel2.readInt();
                    int A0046 = C228309sC.A00(readInt72);
                    if (A0046 == 1) {
                        arrayList18 = C228309sC.A0B(parcel2, readInt72, zzbh.CREATOR);
                    } else if (A0046 == 2) {
                        i79 = C228309sC.A02(parcel2, readInt72);
                    } else if (A0046 != 3) {
                        C228309sC.A0D(parcel2, readInt72);
                    } else {
                        str55 = C228309sC.A08(parcel2, readInt72);
                    }
                }
                C228309sC.A0C(parcel2, A0165);
                return new GeofencingRequest(arrayList18, i79, str55);
            case 220:
                int A0166 = C228309sC.A01(parcel2);
                zzi[] zziArr = null;
                int i80 = 0;
                String[] strArr4 = null;
                while (parcel2.dataPosition() < A0166) {
                    int readInt73 = parcel2.readInt();
                    int A0047 = C228309sC.A00(readInt73);
                    if (A0047 == 2) {
                        i80 = C228309sC.A02(parcel2, readInt73);
                    } else if (A0047 == 3) {
                        zziArr = (zzi[]) C228309sC.A0J(parcel2, readInt73, zzi.CREATOR);
                    } else if (A0047 != 4) {
                        C228309sC.A0D(parcel2, readInt73);
                    } else {
                        strArr4 = C228309sC.A0K(parcel2, readInt73);
                    }
                }
                C228309sC.A0C(parcel2, A0166);
                return new Configuration(i80, zziArr, strArr4);
            case 221:
                int A0167 = C228309sC.A01(parcel2);
                String str56 = null;
                byte[] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                byte[][] bArr8 = null;
                int[] iArr3 = null;
                byte[][] bArr9 = null;
                while (parcel2.dataPosition() < A0167) {
                    int readInt74 = parcel2.readInt();
                    switch (C228309sC.A00(readInt74)) {
                        case 2:
                            str56 = C228309sC.A08(parcel2, readInt74);
                        case 3:
                            bArr4 = C228309sC.A0H(parcel2, readInt74);
                        case 4:
                            bArr5 = C228309sC.A0L(parcel2, readInt74);
                        case 5:
                            bArr6 = C228309sC.A0L(parcel2, readInt74);
                        case 6:
                            bArr7 = C228309sC.A0L(parcel2, readInt74);
                        case 7:
                            bArr8 = C228309sC.A0L(parcel2, readInt74);
                        case 8:
                            iArr3 = C228309sC.A0I(parcel2, readInt74);
                        case 9:
                            bArr9 = C228309sC.A0L(parcel2, readInt74);
                        default:
                            C228309sC.A0D(parcel2, readInt74);
                    }
                }
                C228309sC.A0C(parcel2, A0167);
                return new ExperimentTokens(str56, bArr4, bArr5, bArr6, bArr7, bArr8, iArr3, bArr9);
            case 222:
                int A0168 = C228309sC.A01(parcel2);
                String str57 = null;
                String str58 = null;
                byte[] bArr10 = null;
                long j21 = 0;
                double d3 = 0.0d;
                boolean z45 = false;
                int i81 = 0;
                int i82 = 0;
                while (parcel2.dataPosition() < A0168) {
                    int readInt75 = parcel2.readInt();
                    switch (C228309sC.A00(readInt75)) {
                        case 2:
                            str57 = C228309sC.A08(parcel2, readInt75);
                        case 3:
                            j21 = C228309sC.A04(parcel2, readInt75);
                        case 4:
                            z45 = C228309sC.A0G(parcel2, readInt75);
                        case 5:
                            C228309sC.A0E(parcel2, readInt75, 8);
                            d3 = parcel2.readDouble();
                        case 6:
                            str58 = C228309sC.A08(parcel2, readInt75);
                        case 7:
                            bArr10 = C228309sC.A0H(parcel2, readInt75);
                        case 8:
                            i81 = C228309sC.A02(parcel2, readInt75);
                        case 9:
                            i82 = C228309sC.A02(parcel2, readInt75);
                        default:
                            C228309sC.A0D(parcel2, readInt75);
                    }
                }
                C228309sC.A0C(parcel2, A0168);
                return new zzi(str57, j21, z45, d3, str58, bArr10, i81, i82);
            case 223:
                int A0169 = C228309sC.A01(parcel2);
                String str59 = null;
                while (parcel2.dataPosition() < A0169) {
                    int readInt76 = parcel2.readInt();
                    if (C228309sC.A00(readInt76) != 2) {
                        C228309sC.A0D(parcel2, readInt76);
                    } else {
                        str59 = C228309sC.A08(parcel2, readInt76);
                    }
                }
                C228309sC.A0C(parcel2, A0169);
                return new zza(str59);
            case 224:
                int A0170 = C228309sC.A01(parcel2);
                String str60 = null;
                byte[] bArr11 = null;
                int i83 = 0;
                while (parcel2.dataPosition() < A0170) {
                    int readInt77 = parcel2.readInt();
                    int A0048 = C228309sC.A00(readInt77);
                    if (A0048 == 2) {
                        str60 = C228309sC.A08(parcel2, readInt77);
                    } else if (A0048 == 3) {
                        bArr11 = C228309sC.A0H(parcel2, readInt77);
                    } else if (A0048 != 4) {
                        C228309sC.A0D(parcel2, readInt77);
                    } else {
                        i83 = C228309sC.A02(parcel2, readInt77);
                    }
                }
                C228309sC.A0C(parcel2, A0170);
                return new HarmfulAppsData(str60, bArr11, i83);
            case 225:
                int A0171 = C228309sC.A01(parcel2);
                HarmfulAppsData[] harmfulAppsDataArr = null;
                long j22 = 0;
                int i84 = 0;
                boolean z46 = false;
                while (parcel2.dataPosition() < A0171) {
                    int readInt78 = parcel2.readInt();
                    int A0049 = C228309sC.A00(readInt78);
                    if (A0049 == 2) {
                        j22 = C228309sC.A04(parcel2, readInt78);
                    } else if (A0049 == 3) {
                        harmfulAppsDataArr = (HarmfulAppsData[]) C228309sC.A0J(parcel2, readInt78, HarmfulAppsData.CREATOR);
                    } else if (A0049 == 4) {
                        i84 = C228309sC.A02(parcel2, readInt78);
                    } else if (A0049 != 5) {
                        C228309sC.A0D(parcel2, readInt78);
                    } else {
                        z46 = C228309sC.A0G(parcel2, readInt78);
                    }
                }
                C228309sC.A0C(parcel2, A0171);
                return new zzd(j22, harmfulAppsDataArr, i84, z46);
            case 226:
                int A0172 = C228309sC.A01(parcel2);
                String str61 = null;
                while (parcel2.dataPosition() < A0172) {
                    int readInt79 = parcel2.readInt();
                    if (C228309sC.A00(readInt79) != 2) {
                        C228309sC.A0D(parcel2, readInt79);
                    } else {
                        str61 = C228309sC.A08(parcel2, readInt79);
                    }
                }
                C228309sC.A0C(parcel2, A0172);
                return new zzf(str61);
            case 227:
                int A0173 = C228309sC.A01(parcel2);
                int i85 = 0;
                boolean z47 = false;
                while (parcel2.dataPosition() < A0173) {
                    int readInt80 = parcel2.readInt();
                    int A0050 = C228309sC.A00(readInt80);
                    if (A0050 == 2) {
                        i85 = C228309sC.A02(parcel2, readInt80);
                    } else if (A0050 != 3) {
                        C228309sC.A0D(parcel2, readInt80);
                    } else {
                        z47 = C228309sC.A0G(parcel2, readInt80);
                    }
                }
                C228309sC.A0C(parcel2, A0173);
                return new zzh(i85, z47);
            case 228:
                int A0174 = C228309sC.A01(parcel2);
                String str62 = null;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                byte[] bArr12 = null;
                long j23 = 0;
                while (parcel2.dataPosition() < A0174) {
                    int readInt81 = parcel2.readInt();
                    int A0051 = C228309sC.A00(readInt81);
                    if (A0051 == 2) {
                        str62 = C228309sC.A08(parcel2, readInt81);
                    } else if (A0051 == 3) {
                        dataHolder = (DataHolder) C228309sC.A07(parcel2, readInt81, DataHolder.CREATOR);
                    } else if (A0051 == 4) {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) C228309sC.A07(parcel2, readInt81, ParcelFileDescriptor.CREATOR);
                    } else if (A0051 == 5) {
                        j23 = C228309sC.A04(parcel2, readInt81);
                    } else if (A0051 != 6) {
                        C228309sC.A0D(parcel2, readInt81);
                    } else {
                        bArr12 = C228309sC.A0H(parcel2, readInt81);
                    }
                }
                C228309sC.A0C(parcel2, A0174);
                return new SafeBrowsingData(str62, dataHolder, parcelFileDescriptor2, j23, bArr12);
            case 229:
                int A0175 = C228309sC.A01(parcel2);
                int i86 = 0;
                ResolveAccountRequest resolveAccountRequest = null;
                while (parcel2.dataPosition() < A0175) {
                    int readInt82 = parcel2.readInt();
                    int A0052 = C228309sC.A00(readInt82);
                    if (A0052 == 1) {
                        i86 = C228309sC.A02(parcel2, readInt82);
                    } else if (A0052 != 2) {
                        C228309sC.A0D(parcel2, readInt82);
                    } else {
                        resolveAccountRequest = (ResolveAccountRequest) C228309sC.A07(parcel2, readInt82, ResolveAccountRequest.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0175);
                return new zah(i86, resolveAccountRequest);
            case 230:
                int A0176 = C228309sC.A01(parcel2);
                ConnectionResult connectionResult = null;
                int i87 = 0;
                ResolveAccountResponse resolveAccountResponse = null;
                while (parcel2.dataPosition() < A0176) {
                    int readInt83 = parcel2.readInt();
                    int A0053 = C228309sC.A00(readInt83);
                    if (A0053 == 1) {
                        i87 = C228309sC.A02(parcel2, readInt83);
                    } else if (A0053 == 2) {
                        connectionResult = (ConnectionResult) C228309sC.A07(parcel2, readInt83, ConnectionResult.CREATOR);
                    } else if (A0053 != 3) {
                        C228309sC.A0D(parcel2, readInt83);
                    } else {
                        resolveAccountResponse = (ResolveAccountResponse) C228309sC.A07(parcel2, readInt83, ResolveAccountResponse.CREATOR);
                    }
                }
                C228309sC.A0C(parcel2, A0176);
                return new zaj(i87, connectionResult, resolveAccountResponse);
            case 231:
                int A0177 = C228309sC.A01(parcel2);
                int i88 = 0;
                String[] strArr5 = null;
                while (parcel2.dataPosition() < A0177) {
                    int readInt84 = parcel2.readInt();
                    int A0054 = C228309sC.A00(readInt84);
                    if (A0054 == 2) {
                        i88 = C228309sC.A02(parcel2, readInt84);
                    } else if (A0054 != 3) {
                        C228309sC.A0D(parcel2, readInt84);
                    } else {
                        strArr5 = C228309sC.A0K(parcel2, readInt84);
                    }
                }
                C228309sC.A0C(parcel2, A0177);
                return new Barcode.Address(i88, strArr5);
            case 232:
                int A0178 = C228309sC.A01(parcel2);
                String str63 = null;
                int i89 = 0;
                int i90 = 0;
                int i91 = 0;
                int i92 = 0;
                int i93 = 0;
                int i94 = 0;
                boolean z48 = false;
                while (parcel2.dataPosition() < A0178) {
                    int readInt85 = parcel2.readInt();
                    switch (C228309sC.A00(readInt85)) {
                        case 2:
                            i89 = C228309sC.A02(parcel2, readInt85);
                        case 3:
                            i90 = C228309sC.A02(parcel2, readInt85);
                        case 4:
                            i91 = C228309sC.A02(parcel2, readInt85);
                        case 5:
                            i92 = C228309sC.A02(parcel2, readInt85);
                        case 6:
                            i93 = C228309sC.A02(parcel2, readInt85);
                        case 7:
                            i94 = C228309sC.A02(parcel2, readInt85);
                        case 8:
                            z48 = C228309sC.A0G(parcel2, readInt85);
                        case 9:
                            str63 = C228309sC.A08(parcel2, readInt85);
                        default:
                            C228309sC.A0D(parcel2, readInt85);
                    }
                }
                C228309sC.A0C(parcel2, A0178);
                return new Barcode.CalendarDateTime(i89, i90, i91, i92, i93, i94, z48, str63);
            case 233:
                int A0179 = C228309sC.A01(parcel2);
                String str64 = null;
                String str65 = null;
                String str66 = null;
                String str67 = null;
                String str68 = null;
                Barcode.CalendarDateTime calendarDateTime = null;
                Barcode.CalendarDateTime calendarDateTime2 = null;
                while (parcel2.dataPosition() < A0179) {
                    int readInt86 = parcel2.readInt();
                    switch (C228309sC.A00(readInt86)) {
                        case 2:
                            str64 = C228309sC.A08(parcel2, readInt86);
                        case 3:
                            str65 = C228309sC.A08(parcel2, readInt86);
                        case 4:
                            str66 = C228309sC.A08(parcel2, readInt86);
                        case 5:
                            str67 = C228309sC.A08(parcel2, readInt86);
                        case 6:
                            str68 = C228309sC.A08(parcel2, readInt86);
                        case 7:
                            calendarDateTime = (Barcode.CalendarDateTime) C228309sC.A07(parcel2, readInt86, Barcode.CalendarDateTime.CREATOR);
                        case 8:
                            calendarDateTime2 = (Barcode.CalendarDateTime) C228309sC.A07(parcel2, readInt86, Barcode.CalendarDateTime.CREATOR);
                        default:
                            C228309sC.A0D(parcel2, readInt86);
                    }
                }
                C228309sC.A0C(parcel2, A0179);
                return new Barcode.CalendarEvent(str64, str65, str66, str67, str68, calendarDateTime, calendarDateTime2);
            case 234:
                int A0180 = C228309sC.A01(parcel2);
                Barcode.PersonName personName = null;
                String str69 = null;
                String str70 = null;
                Barcode.Phone[] phoneArr = null;
                Barcode.Email[] emailArr = null;
                String[] strArr6 = null;
                Barcode.Address[] addressArr = null;
                while (parcel2.dataPosition() < A0180) {
                    int readInt87 = parcel2.readInt();
                    switch (C228309sC.A00(readInt87)) {
                        case 2:
                            personName = (Barcode.PersonName) C228309sC.A07(parcel2, readInt87, Barcode.PersonName.CREATOR);
                        case 3:
                            str69 = C228309sC.A08(parcel2, readInt87);
                        case 4:
                            str70 = C228309sC.A08(parcel2, readInt87);
                        case 5:
                            phoneArr = (Barcode.Phone[]) C228309sC.A0J(parcel2, readInt87, Barcode.Phone.CREATOR);
                        case 6:
                            emailArr = (Barcode.Email[]) C228309sC.A0J(parcel2, readInt87, Barcode.Email.CREATOR);
                        case 7:
                            strArr6 = C228309sC.A0K(parcel2, readInt87);
                        case 8:
                            addressArr = (Barcode.Address[]) C228309sC.A0J(parcel2, readInt87, Barcode.Address.CREATOR);
                        default:
                            C228309sC.A0D(parcel2, readInt87);
                    }
                }
                C228309sC.A0C(parcel2, A0180);
                return new Barcode.ContactInfo(personName, str69, str70, phoneArr, emailArr, strArr6, addressArr);
            case 235:
                int A0181 = C228309sC.A01(parcel2);
                String str71 = null;
                String str72 = null;
                String str73 = null;
                String str74 = null;
                String str75 = null;
                String str76 = null;
                String str77 = null;
                String str78 = null;
                String str79 = null;
                String str80 = null;
                String str81 = null;
                String str82 = null;
                String str83 = null;
                String str84 = null;
                while (parcel2.dataPosition() < A0181) {
                    int readInt88 = parcel2.readInt();
                    switch (C228309sC.A00(readInt88)) {
                        case 2:
                            str71 = C228309sC.A08(parcel2, readInt88);
                        case 3:
                            str72 = C228309sC.A08(parcel2, readInt88);
                        case 4:
                            str73 = C228309sC.A08(parcel2, readInt88);
                        case 5:
                            str74 = C228309sC.A08(parcel2, readInt88);
                        case 6:
                            str75 = C228309sC.A08(parcel2, readInt88);
                        case 7:
                            str76 = C228309sC.A08(parcel2, readInt88);
                        case 8:
                            str77 = C228309sC.A08(parcel2, readInt88);
                        case 9:
                            str78 = C228309sC.A08(parcel2, readInt88);
                        case 10:
                            str79 = C228309sC.A08(parcel2, readInt88);
                        case C120125Dh.VIEW_TYPE_BANNER:
                            str80 = C228309sC.A08(parcel2, readInt88);
                        case C120125Dh.VIEW_TYPE_SPINNER:
                            str81 = C228309sC.A08(parcel2, readInt88);
                        case C120125Dh.VIEW_TYPE_BADGE:
                            str82 = C228309sC.A08(parcel2, readInt88);
                        case C120125Dh.VIEW_TYPE_LINK:
                            str83 = C228309sC.A08(parcel2, readInt88);
                        case 15:
                            str84 = C228309sC.A08(parcel2, readInt88);
                        default:
                            C228309sC.A0D(parcel2, readInt88);
                    }
                }
                C228309sC.A0C(parcel2, A0181);
                return new Barcode.DriverLicense(str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84);
            case 236:
                int A0182 = C228309sC.A01(parcel2);
                String str85 = null;
                int i95 = 0;
                String str86 = null;
                String str87 = null;
                while (parcel2.dataPosition() < A0182) {
                    int readInt89 = parcel2.readInt();
                    int A0055 = C228309sC.A00(readInt89);
                    if (A0055 == 2) {
                        i95 = C228309sC.A02(parcel2, readInt89);
                    } else if (A0055 == 3) {
                        str85 = C228309sC.A08(parcel2, readInt89);
                    } else if (A0055 == 4) {
                        str86 = C228309sC.A08(parcel2, readInt89);
                    } else if (A0055 != 5) {
                        C228309sC.A0D(parcel2, readInt89);
                    } else {
                        str87 = C228309sC.A08(parcel2, readInt89);
                    }
                }
                C228309sC.A0C(parcel2, A0182);
                return new Barcode.Email(i95, str85, str86, str87);
            case 237:
                int A0183 = C228309sC.A01(parcel2);
                double d4 = 0.0d;
                double d5 = 0.0d;
                while (parcel2.dataPosition() < A0183) {
                    int readInt90 = parcel2.readInt();
                    int A0056 = C228309sC.A00(readInt90);
                    if (A0056 == 2) {
                        C228309sC.A0E(parcel2, readInt90, 8);
                        d4 = parcel2.readDouble();
                    } else if (A0056 != 3) {
                        C228309sC.A0D(parcel2, readInt90);
                    } else {
                        C228309sC.A0E(parcel2, readInt90, 8);
                        d5 = parcel2.readDouble();
                    }
                }
                C228309sC.A0C(parcel2, A0183);
                return new Barcode.GeoPoint(d4, d5);
            case 238:
                int A0184 = C228309sC.A01(parcel2);
                String str88 = null;
                String str89 = null;
                String str90 = null;
                String str91 = null;
                String str92 = null;
                String str93 = null;
                String str94 = null;
                while (parcel2.dataPosition() < A0184) {
                    int readInt91 = parcel2.readInt();
                    switch (C228309sC.A00(readInt91)) {
                        case 2:
                            str88 = C228309sC.A08(parcel2, readInt91);
                        case 3:
                            str89 = C228309sC.A08(parcel2, readInt91);
                        case 4:
                            str90 = C228309sC.A08(parcel2, readInt91);
                        case 5:
                            str91 = C228309sC.A08(parcel2, readInt91);
                        case 6:
                            str92 = C228309sC.A08(parcel2, readInt91);
                        case 7:
                            str93 = C228309sC.A08(parcel2, readInt91);
                        case 8:
                            str94 = C228309sC.A08(parcel2, readInt91);
                        default:
                            C228309sC.A0D(parcel2, readInt91);
                    }
                }
                C228309sC.A0C(parcel2, A0184);
                return new Barcode.PersonName(str88, str89, str90, str91, str92, str93, str94);
            case 239:
                int A0185 = C228309sC.A01(parcel2);
                int i96 = 0;
                String str95 = null;
                while (parcel2.dataPosition() < A0185) {
                    int readInt92 = parcel2.readInt();
                    int A0057 = C228309sC.A00(readInt92);
                    if (A0057 == 2) {
                        i96 = C228309sC.A02(parcel2, readInt92);
                    } else if (A0057 != 3) {
                        C228309sC.A0D(parcel2, readInt92);
                    } else {
                        str95 = C228309sC.A08(parcel2, readInt92);
                    }
                }
                C228309sC.A0C(parcel2, A0185);
                return new Barcode.Phone(i96, str95);
            case 240:
                int A0186 = C228309sC.A01(parcel2);
                String str96 = null;
                String str97 = null;
                while (parcel2.dataPosition() < A0186) {
                    int readInt93 = parcel2.readInt();
                    int A0058 = C228309sC.A00(readInt93);
                    if (A0058 == 2) {
                        str96 = C228309sC.A08(parcel2, readInt93);
                    } else if (A0058 != 3) {
                        C228309sC.A0D(parcel2, readInt93);
                    } else {
                        str97 = C228309sC.A08(parcel2, readInt93);
                    }
                }
                C228309sC.A0C(parcel2, A0186);
                return new Barcode.Sms(str96, str97);
            case 241:
                int A0187 = C228309sC.A01(parcel2);
                String str98 = null;
                String str99 = null;
                while (parcel2.dataPosition() < A0187) {
                    int readInt94 = parcel2.readInt();
                    int A0059 = C228309sC.A00(readInt94);
                    if (A0059 == 2) {
                        str98 = C228309sC.A08(parcel2, readInt94);
                    } else if (A0059 != 3) {
                        C228309sC.A0D(parcel2, readInt94);
                    } else {
                        str99 = C228309sC.A08(parcel2, readInt94);
                    }
                }
                C228309sC.A0C(parcel2, A0187);
                return new Barcode.UrlBookmark(str98, str99);
            case 242:
                int A0188 = C228309sC.A01(parcel2);
                String str100 = null;
                String str101 = null;
                int i97 = 0;
                while (parcel2.dataPosition() < A0188) {
                    int readInt95 = parcel2.readInt();
                    int A0060 = C228309sC.A00(readInt95);
                    if (A0060 == 2) {
                        str100 = C228309sC.A08(parcel2, readInt95);
                    } else if (A0060 == 3) {
                        str101 = C228309sC.A08(parcel2, readInt95);
                    } else if (A0060 != 4) {
                        C228309sC.A0D(parcel2, readInt95);
                    } else {
                        i97 = C228309sC.A02(parcel2, readInt95);
                    }
                }
                C228309sC.A0C(parcel2, A0188);
                return new Barcode.WiFi(str100, str101, i97);
            case 243:
                int A0189 = C228309sC.A01(parcel2);
                LandmarkParcel[] landmarkParcelArr = null;
                com.google.android.gms.vision.face.internal.client.zza[] zzaArr = null;
                int i98 = 0;
                int i99 = 0;
                float f8 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f9 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f10 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f11 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f12 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f13 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f14 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f15 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f16 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f17 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                while (parcel2.dataPosition() < A0189) {
                    int readInt96 = parcel2.readInt();
                    switch (C228309sC.A00(readInt96)) {
                        case 1:
                            i98 = C228309sC.A02(parcel2, readInt96);
                        case 2:
                            i99 = C228309sC.A02(parcel2, readInt96);
                        case 3:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f8 = parcel2.readFloat();
                        case 4:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f9 = parcel2.readFloat();
                        case 5:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f10 = parcel2.readFloat();
                        case 6:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f11 = parcel2.readFloat();
                        case 7:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f12 = parcel2.readFloat();
                        case 8:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f13 = parcel2.readFloat();
                        case 9:
                            landmarkParcelArr = (LandmarkParcel[]) C228309sC.A0J(parcel2, readInt96, LandmarkParcel.CREATOR);
                        case 10:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f15 = parcel2.readFloat();
                        case C120125Dh.VIEW_TYPE_BANNER:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f16 = parcel2.readFloat();
                        case C120125Dh.VIEW_TYPE_SPINNER:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f17 = parcel2.readFloat();
                        case C120125Dh.VIEW_TYPE_BADGE:
                            zzaArr = (com.google.android.gms.vision.face.internal.client.zza[]) C228309sC.A0J(parcel2, readInt96, com.google.android.gms.vision.face.internal.client.zza.CREATOR);
                        case C120125Dh.VIEW_TYPE_LINK:
                            C228309sC.A0E(parcel2, readInt96, 4);
                            f14 = parcel2.readFloat();
                        default:
                            C228309sC.A0D(parcel2, readInt96);
                    }
                }
                C228309sC.A0C(parcel2, A0189);
                return new FaceParcel(i98, i99, f8, f9, f10, f11, f12, f13, f14, landmarkParcelArr, f15, f16, f17, zzaArr);
            case 244:
                int A0190 = C228309sC.A01(parcel2);
                int i100 = 0;
                int i101 = 0;
                int i102 = 0;
                boolean z49 = false;
                boolean z50 = false;
                float f18 = -1.0f;
                while (parcel2.dataPosition() < A0190) {
                    int readInt97 = parcel2.readInt();
                    switch (C228309sC.A00(readInt97)) {
                        case 2:
                            i100 = C228309sC.A02(parcel2, readInt97);
                        case 3:
                            i101 = C228309sC.A02(parcel2, readInt97);
                        case 4:
                            i102 = C228309sC.A02(parcel2, readInt97);
                        case 5:
                            z49 = C228309sC.A0G(parcel2, readInt97);
                        case 6:
                            z50 = C228309sC.A0G(parcel2, readInt97);
                        case 7:
                            C228309sC.A0E(parcel2, readInt97, 4);
                            f18 = parcel2.readFloat();
                        default:
                            C228309sC.A0D(parcel2, readInt97);
                    }
                }
                C228309sC.A0C(parcel2, A0190);
                return new com.google.android.gms.vision.face.internal.client.zze(i100, i101, i102, z49, z50, f18);
            case 245:
                int A0191 = C228309sC.A01(parcel2);
                float f19 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                int i103 = 0;
                float f20 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                int i104 = 0;
                while (parcel2.dataPosition() < A0191) {
                    int readInt98 = parcel2.readInt();
                    int A0061 = C228309sC.A00(readInt98);
                    if (A0061 == 1) {
                        i103 = C228309sC.A02(parcel2, readInt98);
                    } else if (A0061 == 2) {
                        C228309sC.A0E(parcel2, readInt98, 4);
                        f19 = parcel2.readFloat();
                    } else if (A0061 == 3) {
                        C228309sC.A0E(parcel2, readInt98, 4);
                        f20 = parcel2.readFloat();
                    } else if (A0061 != 4) {
                        C228309sC.A0D(parcel2, readInt98);
                    } else {
                        i104 = C228309sC.A02(parcel2, readInt98);
                    }
                }
                C228309sC.A0C(parcel2, A0191);
                return new LandmarkParcel(i103, f19, f20, i104);
            case 246:
                return new BottomNavigationPresenter$SavedState(parcel2);
            case 247:
                return new C0073b(parcel2.readString(), parcel2.readString());
            case 248:
                return new C0075d(parcel2.readString(), parcel2.readInt());
            case 249:
                return new C0074c(parcel2.readString(), (SuperpackState) parcel2.readParcelable(SuperpackState.class.getClassLoader()));
            case 250:
                String readString16 = parcel2.readString();
                SuperpackState superpackState = (SuperpackState) parcel2.readParcelable(SuperpackState.class.getClassLoader());
                ArrayList arrayList19 = new ArrayList();
                for (Parcelable parcelable : parcel2.readParcelableArray(PackInfo.class.getClassLoader())) {
                    arrayList19.add((PackInfo) parcelable);
                }
                return new C0076e(readString16, superpackState, arrayList19);
            case 251:
                return SuperpackState.values()[parcel2.readInt()];
            case 252:
                return new ArchivePendingUpload(parcel2);
            case 253:
                return new AddAvatarHelper$LoadedImage$LoadedImageMetadata(parcel2);
            case 254:
                return new MonetizationProductOnboardingNextStepInfo(parcel2);
            case 255:
                return new BugReport(parcel2);
            case 256:
                return new BugReportComposerViewModel(parcel2);
            case 257:
                return new BusinessConversionFlowStatus(parcel2);
            case 258:
                return new BusinessConversionStep(parcel2);
            case 259:
                return ConversionStep.valueOf(parcel2.readString());
            case 260:
                return new DataPoint(parcel2);
            case 261:
                return new DaysHourlyFollowersData(parcel2);
            case 262:
                return new FollowersGrowthData(parcel2);
            case 263:
                return new GrowthDataPoint(parcel2);
            case 264:
                return new InsightsChartFilterData(parcel2);
            case 265:
                try {
                    return new IGInstantExperiencesParameters("", 0L);
                } catch (JSONException e2) {
                    AnonymousClass0DB.A0G("IGInstantExperiencesParameters", "Failed to create class IGInstantExperiencesParameters", e2);
                    return null;
                }
            case 266:
                return new BusinessAttribute(parcel2);
            case 267:
                return new BusinessSignUpSplashRow(parcel2);
            case 268:
                return new PagePhotoItem(parcel2);
            case 269:
                return new AttributionUser(parcel2);
            case 270:
                return new EffectActionSheet(parcel2);
            case 271:
                return new EffectInfoUIOptions(parcel2);
            case 272:
                return new EffectPreview(parcel2);
            case 273:
                return new ProfilePicture(parcel2);
            case 274:
                return new ThumbnailImage(parcel2);
            case 275:
                return new AudioPageAssetModel(parcel2);
            case 276:
                return AudioPageModelType.values()[parcel2.readInt()];
            case 277:
                return new ClipsViewerConfig(parcel2);
            case 278:
                return ClipsViewerSource.values()[parcel2.readInt()];
            case 279:
                return new Draft(parcel2);
            case 280:
                return new FaceCenter(parcel2);
            case 281:
                return new GalleryItem(parcel2);
            case 282:
                return new RemoteMedia(parcel2);
            case 283:
                return new Entity(parcel2);
            case 284:
                return new InlineStyleAtRange(parcel2);
            case 285:
                return new Range(parcel2);
            case 286:
                return new TextWithEntities(parcel2);
            case 287:
                return new TextWithEntitiesBlock(parcel2);
            case 288:
                return new ReboundHorizontalScrollView.SavedState(parcel2);
            case 289:
                return new RefreshableRecyclerViewLayout.SavedState(parcel2);
            case 290:
                return new CreationSession(parcel2);
            case 291:
                return new MediaSession(parcel2);
            case 292:
                return new PhotoSession(parcel2);
            case 293:
                return new VideoSession(parcel2);
            case 294:
                return new EffectPicker.SavedState(parcel2);
            case 295:
                return new GalleryPickerView$SavedState(parcel2);
            case 296:
                return new GalleryPreviewInfo(parcel2);
            case 297:
                return new ShareMediaLoggingInfo(parcel2);
            case 298:
                return new EffectInfoAttributionConfiguration(parcel2);
            case 299:
                return new EffectInfoBottomSheetConfiguration(parcel2);
            case DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD:
                return EffectInfoBottomSheetMode.valueOf(parcel2.readString());
            case 301:
                return new IngestSessionShim(parcel2);
            case 302:
                return new BorderFilter(parcel2);
            case 303:
                return new BasicAdjustFilter(parcel2);
            case 304:
                return new BlurredLumAdjustFilter(parcel2);
            case 305:
                return new GaussianBlurFilter(parcel2);
            case 306:
                return new TextModeGradientFilter(parcel2);
            case 307:
                return new LocalLaplacianFilter(parcel2);
            case 308:
                return new LuxFilter(parcel2);
            case 309:
                return new IdentityReadbackFilter(parcel2);
            case 310:
                return new SurfaceCropFilter(parcel2);
            case 311:
                return new TiltShiftBlurFilter(parcel2);
            case 312:
                return new TiltShiftFogFilter(parcel2);
            case 313:
                return new ExifImageData(parcel2);
            case 314:
                return CreationState.valueOf(parcel2.readString());
            case 315:
                int readInt99 = parcel2.readInt();
                boolean z51 = true;
                boolean z52 = false;
                if (parcel2.readInt() != 0) {
                    z52 = true;
                }
                if (parcel2.readInt() == 0) {
                    z51 = false;
                }
                return new DirectShareSheetAppearance(readInt99, z52, z51);
            case 316:
                return new MessageActionsViewModel(parcel2);
            case 317:
                return new MessengerRoom(parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 318:
                return new DirectAREffectShare(parcel2);
            case 319:
                return new DirectForwardingParams(parcel2);
            case 320:
                return new DiscoveryChainingConfig(parcel2);
            case 321:
                return new DiscoveryChainingItem(parcel2);
            case 322:
                return new FiltersLoggingInfo(parcel2);
            case 323:
                return new FilterConfig(parcel2);
            case 324:
                return new LocationPageInformation(parcel2);
            case 325:
                return new MediaMapPin(parcel2);
            case 326:
                return new RefinementAttributes(parcel2);
            case 327:
                return new RelatedItem(parcel2);
            case 328:
                return new ShoppingPivotItem(parcel2);
            case 329:
                return new ContextualFeedNetworkConfig(parcel2);
            case 330:
                return new StoryUnlockableStickerAttribution(parcel2);
            case 331:
                return new StoryUnlockableStickerAttribution.StoryUnlockableSticker(parcel2);
            case 333:
                return new BicubicFilter(parcel2);
            case 334:
                return new IdentityFilter(parcel2);
            case 335:
                return new LanczosFilter(parcel2);
            case 336:
                return new GraphQLObjectType(parcel2);
            case 337:
                return new com.instagram.graphql.instagram_www.enums.GraphQLObjectType(parcel2);
            case 338:
                return new GuideFragmentConfig(parcel2);
            case 339:
                return new GuideGridFragmentConfig(parcel2);
            case 340:
                return new MinimalGuide(parcel2);
            case 341:
                return new IgFormField.SavedState(parcel2);
            case 342:
                return new IGTVLaunchAnalytics(parcel2);
            case 343:
                C13150hy.A02(parcel2, "source");
                boolean z53 = false;
                boolean z54 = false;
                if (parcel2.readInt() == 1) {
                    z54 = true;
                }
                String readString17 = parcel2.readString();
                if (readString17 == null) {
                    C13150hy.A00();
                }
                C13150hy.A01(readString17, "source.readString()!!");
                if (parcel2.readInt() == 1) {
                    z53 = true;
                }
                return new IGTVReactionsSettings(z54, new AnonymousClass79P(readString17, z53));
            case 344:
                return new LeadAdsDisclaimerResponse(parcel2);
            case 345:
                return new LeadAdsInputFieldResponse(parcel2);
            case 346:
                return new LocationContextualFeedConfig(parcel2);
            case 347:
                return new LocationSignalPackageImpl((C54512Xq) parcel2.readParcelable(C54512Xq.class.getClassLoader()));
            case 348:
                return new LocationPageInfo(parcel2);
            case 349:
                return new AssistAccountRecoveryResponse$UhlAccount(parcel2);
            case 350:
                return new TrustedDevice(parcel2);
            case 351:
                return new com.instagram.model.business.Address(parcel2);
            case 352:
                return new BusinessInfo(parcel2);
            case 353:
                return new PublicPhoneContact(parcel2);
            case 354:
                return new ParcelableCommenterDetails(parcel2);
            case 355:
                return new DirectShareTarget(parcel2);
            case 356:
                return new DirectVisualMessageTarget(parcel2);
            case 357:
                return new DirectCameraViewModel(parcel2);
            case 358:
                return new AttributedAREffect(parcel2);
            case 359:
                return new FbFriend(parcel2);
            case 360:
                return new HashtagCollection(parcel2);
            case 361:
                return new Keyword(parcel2);
            case 362:
                return new CurrencyAmountInfo(parcel2);
            case 363:
                return new CheckoutLaunchParams(parcel2);
            case 364:
                return new ProductItem(parcel2);
            case 365:
                return new SimplePlace(parcel2);
            case 366:
                return new ShareLaterMedia(parcel2);
            case 367:
                return new MicroProduct(parcel2);
            case 368:
                return new ProductAREffectContainer(parcel2);
            case 369:
                return new ProductArEffectMetadata(parcel2);
            case 370:
                return new ProductCollectionDropsMetadata(parcel2);
            case 371:
                return new ProductGroup(parcel2);
            case 372:
                return new ProductGroup.VariantKey(parcel2);
            case 373:
                return new ProductItemWithAR(parcel2);
            case 374:
                return new ProductLaunchInformation(parcel2);
            case 375:
                return new ProductUntaggableReason(parcel2);
            case 376:
                return new ProductVariantDimension(parcel2);
            case 377:
                return new ProductVariantValue(parcel2);
            case 378:
                return new ShippingAndReturnsMetadata(parcel2);
            case 379:
                return new ShoppingDestinationTypeModel(parcel2);
            case 380:
                return new ShoppingHelpLinkWithText(parcel2);
            case 381:
                return new com.instagram.model.shopping.ThumbnailImage(parcel2);
            case 382:
                return new UnavailableProduct(parcel2);
            case 383:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                ShoppingColor shoppingColor = new ShoppingColor();
                String readString18 = parcel2.readString();
                if (readString18 == null) {
                    C13150hy.A00();
                }
                shoppingColor.A01 = readString18;
                String readString19 = parcel2.readString();
                if (readString19 == null) {
                    C13150hy.A00();
                }
                shoppingColor.A00 = readString19;
                return shoppingColor;
            case 384:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                ShoppingColorCustomizations shoppingColorCustomizations = new ShoppingColorCustomizations();
                Class<ShoppingColor> cls = ShoppingColor.class;
                Parcelable readParcelable2 = parcel2.readParcelable(cls.getClassLoader());
                if (readParcelable2 == null) {
                    C13150hy.A00();
                }
                shoppingColorCustomizations.A00 = (ShoppingColor) readParcelable2;
                Parcelable readParcelable3 = parcel2.readParcelable(cls.getClassLoader());
                if (readParcelable3 == null) {
                    C13150hy.A00();
                }
                shoppingColorCustomizations.A01 = (ShoppingColor) readParcelable3;
                return shoppingColorCustomizations;
            case 385:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                ShoppingFontCustomizations shoppingFontCustomizations = new ShoppingFontCustomizations();
                Object readValue = parcel2.readValue(Integer.TYPE.getClassLoader());
                if (!(readValue instanceof Integer)) {
                    readValue = null;
                }
                shoppingFontCustomizations.A00 = (Integer) readValue;
                return shoppingFontCustomizations;
            case 386:
                return new IgFundedEligibilityDialogContent(parcel2);
            case 387:
                return new IgFundedIncentive(parcel2);
            case 388:
                return new IgFundedIncentive.Detail(parcel2);
            case 389:
                return new IgFundedIncentiveBannerButton(parcel2);
            case 390:
                return new Incentive(parcel2);
            case 391:
                return new IncentiveContainer(parcel2);
            case 392:
                return new MerchantWithProducts(parcel2);
            case 393:
                return new ProductThumbnail(parcel2);
            case 394:
                return new BrandItem(parcel2);
            case 395:
                return new BrandsHscroll(parcel2);
            case 396:
                return new ButtonDestination(parcel2);
            case 397:
                return new CollectionTileCoverMedia(parcel2);
            case 398:
                return new MultiProductComponent(parcel2);
            case 399:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                ProductCollectionHeader productCollectionHeader = new ProductCollectionHeader();
                Parcelable readParcelable4 = parcel2.readParcelable(CollectionTileCoverMedia.class.getClassLoader());
                if (readParcelable4 == null) {
                    C13150hy.A00();
                }
                productCollectionHeader.A01 = (CollectionTileCoverMedia) readParcelable4;
                String readString20 = parcel2.readString();
                if (readString20 == null) {
                    C13150hy.A00();
                }
                productCollectionHeader.A04 = readString20;
                ArrayList arrayList20 = new ArrayList();
                productCollectionHeader.A05 = arrayList20;
                parcel2.readTypedList(arrayList20, Merchant.CREATOR);
                productCollectionHeader.A03 = parcel2.readString();
                productCollectionHeader.A02 = parcel2.readString();
                productCollectionHeader.A00 = (ProductCollectionDropsMetadata) parcel2.readParcelable(ProductCollectionDropsMetadata.class.getClassLoader());
                return productCollectionHeader;
            case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI /*400*/:
                return new ProductCollectionTile(parcel2);
            case 401:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                ProductCollectionTileCustomization productCollectionTileCustomization = new ProductCollectionTileCustomization();
                productCollectionTileCustomization.A00 = (ShoppingFontCustomizations) parcel2.readParcelable(ShoppingFontCustomizations.class.getClassLoader());
                if (parcel2.readInt() == 1) {
                    C216429Uw r2 = new C216429Uw();
                    productCollectionTileCustomization.A01 = r2;
                    r2.A00 = (ShoppingColorCustomizations) parcel2.readParcelable(ShoppingColorCustomizations.class.getClassLoader());
                    return productCollectionTileCustomization;
                }
                break;
            case 402:
                return new ProductCollectionTileHscroll(parcel2);
            case 403:
                return new ProductFeedHeader(parcel2);
            case 404:
                return new ProductFeedItem(parcel2);
            case 405:
                return new ProductFeedResponse(parcel2);
            case 406:
                return new ProductTile(parcel2);
            case 407:
                return new ProductTileMedia(parcel2);
            case 408:
                return new PriceLabelOptions(parcel2);
            case 409:
                return new ProductNameLabelOptions(parcel2);
            case 410:
                return new ProductTileDecoration(parcel2);
            case 411:
                return new ProductTileLabel(parcel2);
            case 412:
                return new ProductTileLabelLayoutContent(parcel2);
            case 413:
                return new ProductTileMetadata(parcel2);
            case 414:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                int readInt100 = parcel2.readInt();
                boolean z55 = true;
                if (readInt100 != 1) {
                    z55 = false;
                }
                return new InstagramShopLink(z55);
            case 415:
                return new ProductCollectionLink(parcel2);
            case 416:
                return new ProductCollectionLinkMetadata(parcel2);
            case 417:
                return ProductCollectionReviewStatus.values()[parcel2.readInt()];
            case 418:
                C13150hy.A02(parcel2, "parcel");
                String readString21 = parcel2.readString();
                int readInt101 = parcel2.readInt();
                int readInt102 = parcel2.readInt();
                boolean z56 = false;
                if (readInt102 != 0) {
                    z56 = true;
                }
                return new ProductShareConfig(readString21, readInt101, z56);
            case 419:
                return new ProfileShopLink(parcel2);
            case 420:
                return new ReelProductLink(parcel2);
            case 421:
                return new ShoppingDestinationMetadata(parcel2);
            case 422:
                return new ShoppingIncentiveMetadata(parcel2);
            case 423:
                return new SizeChart(parcel2);
            case 424:
                return new SizeChartMeasurement(parcel2);
            case 425:
                return new SizeChartRow(parcel2);
            case 426:
                return new VideoCallAudience(parcel2);
            case 427:
                return new VideoCallInfo(parcel2);
            case 428:
                return new VideoCallSource(parcel2);
            case 429:
                return new VideoCallThreadSurfaceKey(parcel2);
            case 430:
                return new MusicAttributionConfig(parcel2);
            case 431:
                return new AudioOverlayTrack(parcel2);
            case 432:
                return new DownloadedTrack(parcel2);
            case 433:
                return new MusicBrowseCategory(parcel2);
            case 434:
            case 435:
                return new MusicSearchMood(parcel2);
            case 436:
                return new MusicSearchPlaylist(parcel2);
            case 437:
                return new TrackSnippet(parcel2);
            case 438:
                return new PartnerProgramOnboardingNextStepInfo(parcel2);
            case 439:
                return new CheckoutData(parcel2);
            case 440:
                return new CheckoutScreenEntity(parcel2);
            case 441:
                return new CheckoutScreenPaymentCredentials(parcel2);
            case 442:
                return new ConnectFlowBottomSheetContentParams(parcel2);
            case 443:
                return new AllUserStoryTarget(parcel2);
            case 444:
                return new BrandedContentTag(parcel2);
            case 445:
                return new CloseFriendsUserStoryTarget(parcel2);
            case 446:
                return new EventUserStoryTarget(parcel2);
            case 447:
                return new AutoLaunchReelParams(parcel2);
            case 448:
                return new UserDetailEntryInfo(parcel2);
            case 449:
                C13150hy.A02(parcel2, "parcel");
                String readString22 = parcel2.readString();
                if (readString22 == null) {
                    C13150hy.A00();
                }
                C13150hy.A01(readString22, "parcel.readString()!!");
                float readFloat = parcel2.readFloat();
                C170037Ou r11 = C170037Ou.values()[parcel2.readInt()];
                Object createFromParcel = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
                if (createFromParcel != null) {
                    Spannable spannable = (Spannable) createFromParcel;
                    int readInt103 = parcel2.readInt();
                    String readString23 = parcel2.readString();
                    String readString24 = parcel2.readString();
                    ImageUrl imageUrl = (ImageUrl) parcel2.readParcelable(ImageUrl.class.getClassLoader());
                    boolean z57 = false;
                    if (parcel2.readByte() == ((byte) 1)) {
                        z57 = true;
                    }
                    return new ChallengeStickerModel(readString22, readFloat, r11, spannable, readInt103, readString23, readString24, imageUrl, z57);
                }
                throw new C183227s6("null cannot be cast to non-null type android.text.Spannable");
            case 450:
                return new EventStickerModel(parcel2);
            case 451:
                return new RegFlowExtras(parcel2);
            case 452:
                return new UserBirthDate(parcel2);
            case 453:
                String readString25 = parcel2.readString();
                boolean z58 = true;
                boolean z59 = false;
                if (parcel2.readByte() != 0) {
                    z59 = true;
                }
                if (parcel2.readByte() == 0) {
                    z58 = false;
                }
                return new SaveToCollectionsParentInsightsHost(readString25, z59, z58, (C06270Ok) null);
            case 454:
                return new SavedContextualFeedNetworkConfig(parcel2);
            case 455:
                return new KeywordSerpContextualFeedConfig(parcel2);
            case 456:
                return new TrialContextualFeedNetworkConfig(parcel2);
            case 457:
                return new DataDownloadStatusCheckResponse(parcel2);
            case 458:
                return DataDownloadStatusCheckResponse.JobStatus.values()[parcel2.readInt()];
            case 459:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                ProfileShopSurfaceCustomization profileShopSurfaceCustomization = new ProfileShopSurfaceCustomization();
                profileShopSurfaceCustomization.A00 = (ShoppingColorCustomizations) parcel2.readParcelable(ShoppingColorCustomizations.class.getClassLoader());
                return profileShopSurfaceCustomization;
            case 460:
                return new LightboxArguments(parcel2);
            case 461:
                return new ShippingAndReturnsInfo(parcel2);
            case 462:
                return new ShippingAndReturnsSection(parcel2);
            case 463:
                C13150hy.A02(parcel2, "parcel");
                C13150hy.A02(parcel2, "parcel");
                String readString26 = parcel2.readString();
                Object readValue2 = parcel2.readValue(Long.TYPE.getClassLoader());
                if (!(readValue2 instanceof Long)) {
                    readValue2 = null;
                }
                Long l2 = (Long) readValue2;
                String readString27 = parcel2.readString();
                String readString28 = parcel2.readString();
                String readString29 = parcel2.readString();
                String readString30 = parcel2.readString();
                String readString31 = parcel2.readString();
                Object readValue3 = parcel2.readValue(Long.TYPE.getClassLoader());
                if (!(readValue3 instanceof Long)) {
                    readValue3 = null;
                }
                return new ShoppingExploreLoggingInfo(readString26, l2, readString27, readString28, readString29, readString30, readString31, (Long) readValue3);
            case 464:
                return new ShoppingExploreDeeplinkModel(parcel2);
            case 465:
                return new ProductSection(parcel2);
            case 466:
                return new ShoppingHomeSection(parcel2);
            case 467:
                return new ShoppingHomeSectionContent(parcel2);
            case 468:
                return new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(parcel2);
            case 469:
                C13150hy.A02(parcel2, "parcel");
                Parcelable readParcelable5 = parcel2.readParcelable(ProductSourceOverrideStatus.class.getClassLoader());
                if (readParcelable5 == null) {
                    C13150hy.A00();
                }
                return new ProductSourceOverrideState((ProductSourceOverrideStatus) readParcelable5, parcel2.readString(), (ProductSource) parcel2.readParcelable(ProductSource.class.getClassLoader()));
            case 470:
                return ProductSourceOverrideStatus.values()[parcel2.readInt()];
            case 471:
                return new VariantSelectorModel(parcel2);
            case 472:
                return new SourceModelInfoParams(parcel2);
            case 473:
                return new MediaTaggingInfo(parcel2);
            case 474:
                return new MediaSuggestedProductTagProductItemContainer(parcel2);
            case 475:
                return new TagsInteractiveLayout.UnnamedTagSavedState(parcel2);
            case 476:
                return new SlideCardViewModel(parcel2);
            case 477:
                return new CountryCodeTextView.SavedState(parcel2);
            case 478:
                AnonymousClass5DQ r9 = AnonymousClass5DQ.values()[parcel2.readInt()];
                String readString32 = parcel2.readString();
                String readString33 = parcel2.readString();
                boolean z60 = false;
                if (parcel2.readInt() != 0) {
                    z60 = true;
                }
                String readString34 = parcel2.readString();
                boolean z61 = false;
                if (parcel2.readInt() != 0) {
                    z61 = true;
                }
                return new FollowListData(r9, readString32, readString33, z60, readString34, z61);
            case 479:
                return new ImageManager$ImageListParam(parcel2);
            case 480:
                return new VideoFeedFragmentConfig(parcel2);
            case 481:
                return VideoFeedType.valueOf(parcel2.readString());
            case 482:
                return new LocationTransparencyUserProfile(parcel2);
            case 483:
                return new SupportInboxDetailBottomSheetModel(parcel2);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ActionMenuPresenter$SavedState[i];
            case 1:
                return new AppCompatSpinner$SavedState[i];
            case 2:
                return new FragmentTabHost$SavedState[i];
            case 3:
                return new androidx.legacy.app.FragmentTabHost$SavedState[i];
            case 4:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case 5:
                return new StaggeredGridLayoutManager.SavedState[i];
            case 6:
                return new SwipeRefreshLayout.SavedState[i];
            case 7:
                return new ParcelImpl[i];
            case 8:
                return new LinearLayoutManager$SavedState[i];
            case 9:
                return new RequestAutofillJSBridgeCall[i];
            case 10:
                return new RequestAutofillJSBridgeCallResult[i];
            case C120125Dh.VIEW_TYPE_BANNER:
                return new AddressAutofillData[i];
            case C120125Dh.VIEW_TYPE_SPINNER:
                return new EmailAutofillData[i];
            case C120125Dh.VIEW_TYPE_BADGE:
                return new NameAutofillData[i];
            case C120125Dh.VIEW_TYPE_LINK:
                return new TelephoneAutofillData[i];
            case 15:
                return new SaveAutofillDataJSBridgeCall[i];
            case 16:
                return new IGInstantExperiencesFeatureEnabledList[i];
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return new InstantExperienceGenericErrorResult[i];
            case 18:
                return new CanMakePaymentJSBridgeCall[i];
            case 19:
                return new CanMakePaymentJSBridgeCallResult[i];
            case 20:
                return new CanShowPaymentModuleJSBridgeCall[i];
            case C120125Dh.VIEW_TYPE_BRANDING:
                return new CanShowPaymentModuleJSBridgeCallResult[i];
            case C120125Dh.NUM_VIEW_TYPES:
                return new PaymentsCheckoutJSBridgeCall[i];
            case 23:
                return new PaymentsCheckoutJSBridgeCallResult[i];
            case 24:
                return new PaymentsChargeRequestErrorCall[i];
            case 25:
                return new PaymentsChargeRequestSuccessCall[i];
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return new PaymentsChargeRequestUnknownCall[i];
            case 27:
                return new CameraPosition[i];
            case 28:
                return new LatLng[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new LatLngBounds[i];
            case 30:
                return new ParcelableBleScanResult[i];
            case 31:
                return new BrowserLiteJSBridgeCall[i];
            case 32:
                return new PrefetchCacheEntry[i];
            case 33:
                return new InitJSBridgeCallData[i];
            case 34:
                return new RequestAutofillJSBridgeCallData[i];
            case 35:
                return new SaveAutofillDataJSBridgeCallData[i];
            case 36:
                return new AREffectFileBundle[i];
            case 37:
                return new ARRequestEffect[i];
            case 38:
                return new EffectAttribution[i];
            case 39:
                return new EffectAttribution.AttributedAsset[i];
            case 40:
                return new EffectAttribution.License[i];
            case 41:
                return new InvitableContactImpl[i];
            case 42:
                return new ParcelableCdmaCellInfo[i];
            case 43:
                return new ParcelableGeneralCellInfo[i];
            case 44:
                return new ConsoleSignalResultLoggerProvider[i];
            case 45:
                return new CallerContext[i];
            case 46:
                return new ContextChain[i];
            case 47:
                return new OneoffTask[i];
            case 48:
                return new PeriodicTask[i];
            case 49:
                return new Country[i];
            case AMD.MAX_LIKES_PER_FETCH:
                return new ParcelableBoolean[i];
            case 51:
                return new Address[i];
            case 52:
                return new AdditionalFields[i];
            case 53:
                return new CreditCard[i];
            case 54:
                return new NewCreditCard[i];
            case 55:
                return new NewPayPal[i];
            case 56:
                return new PayPalBillingAgreement[i];
            case 57:
                return new Either[i];
            case 58:
                return new ParcelablePair[i];
            case 59:
                return new Quartet[i];
            case 60:
                return new Triplet[i];
            case 61:
                return new ExoServiceVideoCacheAnalytics[i];
            case 62:
                return new RendererContext[i];
            case 63:
                return new VideoCacheStatus[i];
            case 64:
                return new VideoPlayerServiceEvent[i];
            case 65:
                return new VideoPlayerStreamEvaluation[i];
            case 66:
                return new VideoPlayerStreamFormat[i];
            case 67:
                return new VideoPlayerStreamMetadata[i];
            case 68:
                return new ZeroVideoRewriteConfig[i];
            case 69:
                return new ZeroVideoUrlRewriteRule[i];
            case 70:
                return new FbPayP2pFriend[i];
            case 71:
                return new FbPayP2pWidgetSendRequest[i];
            case 72:
                return new ApiErrorResult[i];
            case 73:
                return new IABEvent[i];
            case 74:
                return new ParcelableCoordinates[i];
            case 75:
                return new ParcelableFbLocationContinuousListenerParams[i];
            case 76:
                return new ParcelableFbLocationOperationParams[i];
            case 77:
                return new ParcelableGeofenceResult[i];
            case 78:
                return new ParcelableImmutableLocation[i];
            case 79:
                return new ParcelableActivityRecognitionResult[i];
            case 80:
                return new ParcelableDetectedActivity[i];
            case 81:
                return new ParcelableLocationSignalPackage[i];
            case 82:
                return new LoginClient$Request[i];
            case 83:
                return new LoginClient$Result[i];
            case 84:
                return new ParcelableSensorEventClone[i];
            case 85:
                return new IdCaptureConfig[i];
            case 86:
                return new CommonLoggingFields[i];
            case 87:
            case 88:
                return new Emoji[i];
            case 89:
                return new DeviceOrientationFrame[i];
            case 90:
                return new HeroScrollSetting[i];
            case 91:
                return new ParcelableCue[i];
            case 92:
                return new ParcelableTigonStats[i];
            case 93:
                return new ParcelableTimeRange[i];
            case 94:
                return new ParcelableXProcessTrafficShapingCommunication[i];
            case 95:
                return new PrefetchTaskQueueCompleteEvent[i];
            case 96:
                return new PrefetchTaskQueueExitEvent[i];
            case 97:
                return new PrefetchTaskQueueStartEvent[i];
            case 98:
                return new SpatialAudioFocusParams[i];
            case 99:
                return new VideoProtocolProps[i];
            case 100:
                return new com.facebook.video.heroplayer.ipc.ZeroVideoRewriteConfig[i];
            case 101:
                return new com.facebook.video.heroplayer.ipc.ZeroVideoUrlRewriteRule[i];
            case 102:
                return new SphericalMetadata[i];
            case 103:
                return new ParcelableWifiScanResult[i];
            case 104:
                return new FBPayAddress[i];
            case 105:
                return new AddressCellParams[i];
            case 106:
                return new CreditCardCellParams[i];
            case 107:
                return new LabelCellParams[i];
            case 108:
                return new LabelCellParams.LinkParams[i];
            case 109:
                return new TextCellParams[i];
            case 110:
                return new TextValidatorParams[i];
            case 111:
                return new CreditCardFormatter[i];
            case 112:
                return new DateFormatter[i];
            case 113:
                return new PhoneFormatter[i];
            case 114:
                return new UpperCaseFormatter[i];
            case 115:
                return new SwitchCellParams[i];
            case 116:
                return new FormLogEvents[i];
            case 117:
                return new FormParams[i];
            case 118:
                return new MerchantInfo[i];
            case 119:
                return new FBPayOrder[i];
            case 120:
                return new FbPayAdditionalField[i];
            case 121:
                return new FbPayCreditCard[i];
            case 122:
                return new FbPayNewCreditCardOption[i];
            case 123:
                return new FbPayNewPayPalOption[i];
            case 124:
                return new FbPayPayPal[i];
            case 125:
                return new FbPayPaymentDefaultInfo[i];
            case 126:
                return new FbPayPaymentMethod[i];
            case 127:
                return new FBPayLoggerData[i];
            case 128:
                return new Format[i];
            case 129:
                return new DrmInitData[i];
            case 130:
                return new DrmInitData.SchemeData[i];
            case 131:
                return new MdtaMetadataEntry[i];
            case 132:
                return new Metadata[i];
            case 133:
                return new EventMessage[i];
            case 134:
                return new PictureFrame[i];
            case 135:
                return new VorbisComment[i];
            case 136:
                return new IcyHeaders[i];
            case 137:
                return new IcyInfo[i];
            case 138:
                return new ApicFrame[i];
            case 139:
                return new BinaryFrame[i];
            case 140:
                return new ChapterFrame[i];
            case 141:
                return new ChapterTocFrame[i];
            case 142:
                return new CommentFrame[i];
            case 143:
                return new GeobFrame[i];
            case 144:
                return new InternalFrame[i];
            case 145:
                return new MlltFrame[i];
            case 146:
                return new PrivFrame[i];
            case 147:
                return new TextInformationFrame[i];
            case 148:
                return new UrlLinkFrame[i];
            case 149:
                return new TrackGroup[i];
            case 150:
                return new TrackGroupArray[i];
            case 151:
                return new DefaultTrackSelector$Parameters[i];
            case 152:
                return new DefaultTrackSelector$SelectionOverride[i];
            case 153:
                return new TrackSelectionParameters[i];
            case 154:
                return new ColorInfo[i];
            case 155:
                return new zzl[i];
            case 156:
                return new zzo[i];
            case 157:
                return new zzr[i];
            case 158:
                return new DeviceMetaData[i];
            case 159:
                return new CredentialPickerConfig[i];
            case 160:
                return new CredentialRequest[i];
            case 161:
                return new HintRequest[i];
            case 162:
                return new IdToken[i];
            case 163:
                return new SignInConfiguration[i];
            case 164:
                return new SignInAccount[i];
            case 165:
                return new AccountChangeEvent[i];
            case 166:
                return new AccountChangeEventsResponse[i];
            case 167:
                return new TokenData[i];
            case 168:
                return new zzc[i];
            case 169:
                return new zze[i];
            case 170:
                return new Scope[i];
            case 171:
                return new BitmapTeleporter[i];
            case 172:
                return new ClientIdentity[i];
            case 173:
                return new SignInButtonConfig[i];
            case 174:
                return new BinderWrapper[i];
            case 175:
                return new com.google.android.gms.common.internal.zzr[i];
            case 176:
                return new zaa[i];
            case 177:
                return new StringToIntConverter[i];
            case 178:
                return new StringToIntConverter.zaa[i];
            case 179:
                return new FastJsonResponse$Field[i];
            case 180:
                return new zam[i];
            case 181:
                return new zak[i];
            case 182:
                return new zal[i];
            case 183:
                return new SafeParcelResponse[i];
            case 184:
                return new FavaDiagnosticsEntity[i];
            case 185:
                return new WakeLockEvent[i];
            case 186:
                return new Feature[i];
            case 187:
                return new zzs[i];
            case 188:
                return new zzy[i];
            case 189:
                return new zzab[i];
            case 190:
                return new zzad[i];
            case 191:
                return new zzaf[i];
            case 192:
                return new zzv[i];
            case 193:
                return new com.google.android.gms.internal.clearcut.zzr[i];
            case 194:
                return new com.google.android.gms.internal.location.zzad[i];
            case 195:
                return new zzbd[i];
            case 196:
                return new zzbh[i];
            case 197:
                return new zzm[i];
            case 198:
                return new zzae[i];
            case 199:
                return new zzai[i];
            case 200:
                return new zzal[i];
            case 201:
                return new zzan[i];
            case 202:
                return new com.google.android.gms.internal.vision.zze[i];
            case 203:
                return new zzn[i];
            case 204:
                return new com.google.android.gms.internal.vision.zzy[i];
            case 205:
                return new PlaceReport[i];
            case 206:
                return new LocationAvailability[i];
            case 207:
                return new LocationRequest[i];
            case 208:
                return new com.google.android.gms.location.zzae[i];
            case 209:
                return new LocationSettingsRequest[i];
            case 210:
                return new LocationSettingsResult[i];
            case 211:
                return new LocationSettingsStates[i];
            case 212:
                return new zzaj[i];
            case 213:
                return new ActivityTransition[i];
            case 214:
                return new ActivityTransitionEvent[i];
            case 215:
                return new ActivityTransitionRequest[i];
            case 216:
                return new ActivityTransitionResult[i];
            case 217:
                return new DetectedActivity[i];
            case 218:
                return new zzj[i];
            case 219:
                return new GeofencingRequest[i];
            case 220:
                return new Configuration[i];
            case 221:
                return new ExperimentTokens[i];
            case 222:
                return new zzi[i];
            case 223:
                return new zza[i];
            case 224:
                return new HarmfulAppsData[i];
            case 225:
                return new zzd[i];
            case 226:
                return new zzf[i];
            case 227:
                return new zzh[i];
            case 228:
                return new SafeBrowsingData[i];
            case 229:
                return new zah[i];
            case 230:
                return new zaj[i];
            case 231:
                return new Barcode.Address[i];
            case 232:
                return new Barcode.CalendarDateTime[i];
            case 233:
                return new Barcode.CalendarEvent[i];
            case 234:
                return new Barcode.ContactInfo[i];
            case 235:
                return new Barcode.DriverLicense[i];
            case 236:
                return new Barcode.Email[i];
            case 237:
                return new Barcode.GeoPoint[i];
            case 238:
                return new Barcode.PersonName[i];
            case 239:
                return new Barcode.Phone[i];
            case 240:
                return new Barcode.Sms[i];
            case 241:
                return new Barcode.UrlBookmark[i];
            case 242:
                return new Barcode.WiFi[i];
            case 243:
                return new FaceParcel[i];
            case 244:
                return new com.google.android.gms.vision.face.internal.client.zze[i];
            case 245:
                return new LandmarkParcel[i];
            case 246:
                return new BottomNavigationPresenter$SavedState[i];
            case 247:
                return new CallerInfo[i];
            case 248:
                return new PrepareRequest[i];
            case 249:
                return new PrepareResponse[i];
            case 250:
                return new SuperpackInfo[i];
            case 251:
                return new SuperpackState[i];
            case 252:
                return new ArchivePendingUpload[i];
            case 253:
                return new AddAvatarHelper$LoadedImage$LoadedImageMetadata[i];
            case 254:
                return new MonetizationProductOnboardingNextStepInfo[i];
            case 255:
                return new BugReport[i];
            case 256:
                return new BugReportComposerViewModel[i];
            case 257:
                return new BusinessConversionFlowStatus[i];
            case 258:
                return new BusinessConversionStep[i];
            case 259:
                return new ConversionStep[i];
            case 260:
                return new DataPoint[i];
            case 261:
                return new DaysHourlyFollowersData[i];
            case 262:
                return new FollowersGrowthData[i];
            case 263:
                return new GrowthDataPoint[i];
            case 264:
                return new InsightsChartFilterData[i];
            case 265:
                return new IGInstantExperiencesParameters[i];
            case 266:
                return new BusinessAttribute[i];
            case 267:
                return new BusinessSignUpSplashRow[i];
            case 268:
                return new PagePhotoItem[i];
            case 269:
                return new AttributionUser[i];
            case 270:
                return new EffectActionSheet[i];
            case 271:
                return new EffectInfoUIOptions[i];
            case 272:
                return new EffectPreview[i];
            case 273:
                return new ProfilePicture[i];
            case 274:
                return new ThumbnailImage[i];
            case 275:
                return new AudioPageAssetModel[i];
            case 276:
                return new AudioPageModelType[i];
            case 277:
                return new ClipsViewerConfig[i];
            case 278:
                return new ClipsViewerSource[i];
            case 279:
                return new Draft[i];
            case 280:
                return new FaceCenter[i];
            case 281:
                return new GalleryItem[i];
            case 282:
                return new RemoteMedia[i];
            case 283:
                return new Entity[i];
            case 284:
                return new InlineStyleAtRange[i];
            case 285:
                return new Range[i];
            case 286:
                return new TextWithEntities[i];
            case 287:
                return new TextWithEntitiesBlock[i];
            case 288:
                return new ReboundHorizontalScrollView.SavedState[i];
            case 289:
                return new RefreshableRecyclerViewLayout.SavedState[i];
            case 290:
                return new CreationSession[i];
            case 291:
                return new MediaSession[i];
            case 292:
                return new PhotoSession[i];
            case 293:
                return new VideoSession[0];
            case 294:
                return new EffectPicker.SavedState[i];
            case 295:
                return new GalleryPickerView$SavedState[i];
            case 296:
                return new GalleryPreviewInfo[i];
            case 297:
                return new ShareMediaLoggingInfo[i];
            case 298:
                return new EffectInfoAttributionConfiguration[i];
            case 299:
                return new EffectInfoBottomSheetConfiguration[i];
            case DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD:
                return new EffectInfoBottomSheetMode[i];
            case 301:
                return new IngestSessionShim[i];
            case 302:
                return new BorderFilter[i];
            case 303:
                return new BasicAdjustFilter[i];
            case 304:
                return new BlurredLumAdjustFilter[i];
            case 305:
                return new GaussianBlurFilter[i];
            case 306:
                return new TextModeGradientFilter[i];
            case 307:
                return new LocalLaplacianFilter[i];
            case 308:
                return new LuxFilter[i];
            case 309:
                return new IdentityReadbackFilter[i];
            case 310:
                return new SurfaceCropFilter[i];
            case 311:
                return new TiltShiftBlurFilter[i];
            case 312:
                return new TiltShiftFogFilter[i];
            case 313:
                return new ExifImageData[i];
            case 314:
                return new CreationState[i];
            case 315:
                return new Parcelable[i];
            case 316:
                return new MessageActionsViewModel[i];
            case 317:
                return new MessengerRoom[i];
            case 318:
                return new DirectAREffectShare[i];
            case 319:
                return new DirectForwardingParams[i];
            case 320:
                return new DiscoveryChainingConfig[i];
            case 321:
                return new DiscoveryChainingItem[i];
            case 322:
                return new FiltersLoggingInfo[i];
            case 323:
                return new FilterConfig[i];
            case 324:
                return new LocationPageInformation[i];
            case 325:
                return new MediaMapPin[i];
            case 326:
                return new RefinementAttributes[i];
            case 327:
                return new RelatedItem[i];
            case 328:
                return new ShoppingPivotItem[i];
            case 329:
                return new ContextualFeedNetworkConfig[i];
            case 330:
                return new StoryUnlockableStickerAttribution[i];
            case 331:
                return new StoryUnlockableStickerAttribution.StoryUnlockableSticker[i];
            case 332:
                return new RegionTrackingFilter[i];
            case 333:
                return new BicubicFilter[i];
            case 334:
                return new IdentityFilter[i];
            case 335:
                return new LanczosFilter[i];
            case 336:
                return new GraphQLObjectType[i];
            case 337:
                return new com.instagram.graphql.instagram_www.enums.GraphQLObjectType[i];
            case 338:
                return new GuideFragmentConfig[i];
            case 339:
                return new GuideGridFragmentConfig[i];
            case 340:
                return new MinimalGuide[i];
            case 341:
                return new IgFormField.SavedState[i];
            case 342:
                return new IGTVLaunchAnalytics[i];
            case 343:
                return new IGTVReactionsSettings[i];
            case 344:
                return new LeadAdsDisclaimerResponse[i];
            case 345:
                return new LeadAdsInputFieldResponse[i];
            case 346:
                return new LocationContextualFeedConfig[i];
            case 347:
                return new LocationSignalPackageImpl[i];
            case 348:
                return new LocationPageInfo[i];
            case 349:
                return new AssistAccountRecoveryResponse$UhlAccount[i];
            case 350:
                return new TrustedDevice[i];
            case 351:
                return new com.instagram.model.business.Address[i];
            case 352:
                return new BusinessInfo[i];
            case 353:
                return new PublicPhoneContact[i];
            case 354:
                return new ParcelableCommenterDetails[i];
            case 355:
                return new DirectShareTarget[i];
            case 356:
                return new DirectVisualMessageTarget[i];
            case 357:
                return new DirectCameraViewModel[i];
            case 358:
                return new AttributedAREffect[i];
            case 359:
                return new FbFriend[i];
            case 360:
                return new HashtagCollection[i];
            case 361:
                return new Keyword[i];
            case 362:
                return new CurrencyAmountInfo[i];
            case 363:
                return new CheckoutLaunchParams[i];
            case 364:
                return new ProductItem[i];
            case 365:
                return new SimplePlace[i];
            case 366:
                return new ShareLaterMedia[i];
            case 367:
                return new MicroProduct[i];
            case 368:
                return new ProductAREffectContainer[i];
            case 369:
                return new ProductArEffectMetadata[i];
            case 370:
                return new ProductCollectionDropsMetadata[i];
            case 371:
                return new ProductGroup[i];
            case 372:
                return new ProductGroup.VariantKey[i];
            case 373:
                return new ProductItemWithAR[i];
            case 374:
                return new ProductLaunchInformation[i];
            case 375:
                return new ProductUntaggableReason[i];
            case 376:
                return new ProductVariantDimension[i];
            case 377:
                return new ProductVariantValue[i];
            case 378:
                return new ShippingAndReturnsMetadata[i];
            case 379:
                return new ShoppingDestinationTypeModel[i];
            case 380:
                return new ShoppingHelpLinkWithText[i];
            case 381:
                return new com.instagram.model.shopping.ThumbnailImage[i];
            case 382:
                return new UnavailableProduct[i];
            case 383:
                return new ShoppingColor[i];
            case 384:
                return new ShoppingColorCustomizations[i];
            case 385:
                return new ShoppingFontCustomizations[i];
            case 386:
                return new IgFundedEligibilityDialogContent[i];
            case 387:
                return new IgFundedIncentive[i];
            case 388:
                return new IgFundedIncentive.Detail[i];
            case 389:
                return new IgFundedIncentiveBannerButton[i];
            case 390:
                return new Incentive[i];
            case 391:
                return new IncentiveContainer[i];
            case 392:
                return new MerchantWithProducts[i];
            case 393:
                return new ProductThumbnail[i];
            case 394:
                return new BrandItem[i];
            case 395:
                return new BrandsHscroll[i];
            case 396:
                return new ButtonDestination[i];
            case 397:
                return new CollectionTileCoverMedia[i];
            case 398:
                return new MultiProductComponent[i];
            case 399:
                return new ProductCollectionHeader[i];
            case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI /*400*/:
                return new ProductCollectionTile[i];
            case 401:
                return new ProductCollectionTileCustomization[i];
            case 402:
                return new ProductCollectionTileHscroll[i];
            case 403:
                return new ProductFeedHeader[i];
            case 404:
                return new ProductFeedItem[i];
            case 405:
                return new ProductFeedResponse[i];
            case 406:
                return new ProductTile[i];
            case 407:
                return new ProductTileMedia[i];
            case 408:
                return new PriceLabelOptions[i];
            case 409:
                return new ProductNameLabelOptions[i];
            case 410:
                return new ProductTileDecoration[i];
            case 411:
                return new ProductTileLabel[i];
            case 412:
                return new ProductTileLabelLayoutContent[i];
            case 413:
                return new ProductTileMetadata[i];
            case 414:
                return new InstagramShopLink[i];
            case 415:
                return new ProductCollectionLink[i];
            case 416:
                return new ProductCollectionLinkMetadata[i];
            case 417:
                return new ProductCollectionReviewStatus[i];
            case 418:
                return new ProductShareConfig[i];
            case 419:
                return new ProfileShopLink[i];
            case 420:
                return new ReelProductLink[i];
            case 421:
                return new ShoppingDestinationMetadata[i];
            case 422:
                return new ShoppingIncentiveMetadata[i];
            case 423:
                return new SizeChart[i];
            case 424:
                return new SizeChartMeasurement[i];
            case 425:
                return new SizeChartRow[i];
            case 426:
                return new VideoCallAudience[i];
            case 427:
                return new VideoCallInfo[i];
            case 428:
                return new VideoCallSource[i];
            case 429:
                return new VideoCallThreadSurfaceKey[i];
            case 430:
                return new MusicAttributionConfig[i];
            case 431:
                return new AudioOverlayTrack[i];
            case 432:
                return new DownloadedTrack[i];
            case 433:
                return new MusicBrowseCategory[i];
            case 434:
            case 435:
                return new MusicSearchMood[i];
            case 436:
                return new MusicSearchPlaylist[i];
            case 437:
                return new TrackSnippet[i];
            case 438:
                return new PartnerProgramOnboardingNextStepInfo[i];
            case 439:
                return new CheckoutData[i];
            case 440:
                return new CheckoutScreenEntity[i];
            case 441:
                return new CheckoutScreenPaymentCredentials[i];
            case 442:
                return new ConnectFlowBottomSheetContentParams[i];
            case 443:
                return new AllUserStoryTarget[i];
            case 444:
                return new BrandedContentTag[i];
            case 445:
                return new CloseFriendsUserStoryTarget[i];
            case 446:
                return new EventUserStoryTarget[i];
            case 447:
                return new AutoLaunchReelParams[i];
            case 448:
                return new UserDetailEntryInfo[i];
            case 449:
                return new ChallengeStickerModel[i];
            case 450:
                return new EventStickerModel[i];
            case 451:
                return new RegFlowExtras[i];
            case 452:
                return new UserBirthDate[i];
            case 453:
                return new SaveToCollectionsParentInsightsHost[i];
            case 454:
                return new SavedContextualFeedNetworkConfig[i];
            case 455:
                return new KeywordSerpContextualFeedConfig[i];
            case 456:
                return new TrialContextualFeedNetworkConfig[i];
            case 457:
                return new DataDownloadStatusCheckResponse[i];
            case 458:
                return new DataDownloadStatusCheckResponse.JobStatus[i];
            case 459:
                return new ProfileShopSurfaceCustomization[i];
            case 460:
                return new LightboxArguments[i];
            case 461:
                return new ShippingAndReturnsInfo[i];
            case 462:
                return new ShippingAndReturnsSection[i];
            case 463:
                return new ShoppingExploreLoggingInfo[i];
            case 464:
                return new ShoppingExploreDeeplinkModel[i];
            case 465:
                return new ProductSection[i];
            case 466:
                return new ShoppingHomeSection[i];
            case 467:
                return new ShoppingHomeSectionContent[i];
            case 468:
                return new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel[i];
            case 469:
                return new ProductSourceOverrideState[i];
            case 470:
                return new ProductSourceOverrideStatus[i];
            case 471:
                return new VariantSelectorModel[i];
            case 472:
                return new SourceModelInfoParams[i];
            case 473:
                return new MediaTaggingInfo[i];
            case 474:
                return new MediaSuggestedProductTagProductItemContainer[i];
            case 475:
                return new TagsInteractiveLayout.UnnamedTagSavedState[i];
            case 476:
                return new SlideCardViewModel[i];
            case 477:
                return new CountryCodeTextView.SavedState[i];
            case 478:
                return new FollowListData[i];
            case 479:
                return new ImageManager$ImageListParam[i];
            case 480:
                return new VideoFeedFragmentConfig[i];
            case 481:
                return new VideoFeedType[i];
            case 482:
                return new LocationTransparencyUserProfile[i];
            case 483:
                return new SupportInboxDetailBottomSheetModel[i];
            default:
                return new Object[0];
        }
    }
}
