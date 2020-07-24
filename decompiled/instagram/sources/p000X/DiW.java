package p000X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.DiW */
public final class DiW {
    public static String A01(int i) {
        switch (i) {
            case 1:
                return "AAPFileUploadRecord";
            case 2:
                return "ACEFeedbackSurvey";
            case 3:
                return "AGSCrimeZipCode";
            case 4:
                return "AIDemosDemo";
            case 5:
                return "AIDemosMobileModel";
            case 6:
                return "AIDemosSection";
            case 7:
                return "ALDoubleCheckSettings";
            case 8:
                return "AMCTicketOrder";
            case 9:
                return "ARAnnouncement";
            case 10:
                return "ARCapabilityMinVersionModel";
            case C120125Dh.VIEW_TYPE_BANNER:
                return "ARCommerceAsset";
            case C120125Dh.VIEW_TYPE_SPINNER:
                return "ARCommerceDynamicEffect";
            case C120125Dh.VIEW_TYPE_BADGE:
                return "ARDynamicContent";
            case C120125Dh.VIEW_TYPE_LINK:
                return "ARDynamicContentArticle";
            case 15:
                return "ARDynamicContentCarouselItem";
            case 16:
                return "ARDynamicContentTemplate";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return "ARDynamicContentTutorial";
            case 18:
                return "AREffect";
            case 19:
                return "AREffectPermalink";
            case 20:
                return "AREffectPortalStoryTimeData";
            case C120125Dh.VIEW_TYPE_BRANDING:
                return "AREffectSection";
            case C120125Dh.NUM_VIEW_TYPES:
                return "AREffectSparkLabsData";
            case 23:
                return "AREffectTestGroup";
            case 24:
                return "AREffectTextureBundle";
            case 25:
                return "ARExportFile";
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return "ARLibrary3DObject";
            case 27:
                return "ARLibrary3DObjectRevision";
            case 28:
                return "ARLibraryAudio";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "ARLibraryAudioRevision";
            case 30:
                return "ARLibraryBlock";
            case 31:
                return "ARLibraryBlockRevision";
            case 32:
                return "ARLibraryCollection";
            case 33:
                return "ARLibraryPatchGroup";
            case 34:
                return "ARLibraryPatchGroupRevision";
            case 35:
                return "ARLibraryScript";
            case 36:
                return "ARLibraryTexture";
            case 37:
                return "ARLibraryTextureRevision";
            case 38:
                return "ARStudioLead";
            case 39:
                return "AYMTAMAAdAccountChannel";
            case 40:
                return "AYMTAMAAdgroupChannel";
            case 41:
                return "AYMTAMAAlertChannel";
            case 42:
                return "AYMTAMABookmarkAdAccountChannel";
            case 43:
                return "AYMTAMACampaignChannel";
            case 44:
                return "AYMTAMACampaignGroupChannel";
            case 45:
                return "AYMTAMAFlattenedAdgroupChannel";
            case 46:
                return "AYMTAMAHomeChannel";
            case 47:
                return "AYMTAdCenterNeedsAttentionChannel";
            case 48:
                return "AYMTAdCenterOverviewCardChannel";
            case 49:
                return "AYMTAdCenterSuggestedCardChannel";
            case AMD.MAX_LIKES_PER_FETCH:
                return "AYMTAdCenterUpdatesChannel";
            case 51:
                return "AYMTBizAppAdsCampaignChannel";
            case 52:
                return "AYMTBizAppAdsFlattenedAdgroupChannel";
            case 53:
                return "AYMTBizInfoCenterResourcesChannel";
            case 54:
                return "AYMTBizInfoCenterToolsChannel";
            case 55:
                return "AYMTBizResourceHubHighPriorityMegaphoneChannel";
            case 56:
                return "AYMTBusinessGoalsResponse";
            case 57:
                return "AYMTChannel";
            case 58:
                return "AYMTChannelMain";
            case 59:
                return "AYMTCometGroupsMallCardChannel";
            case 60:
                return "AYMTCreatorStudioAppAnnouncementCardChannel";
            case 61:
                return "AYMTDummyGraphQLTutorialChannel";
            case 62:
                return "AYMTDummyLegacyMobileChannel";
            case 63:
                return "AYMTGroupsMobileChannel";
            case 64:
                return "AYMTInstagramPromotionsManagerChannel";
            case 65:
                return "AYMTLWICampaignGroupChannel";
            case 66:
                return "AYMTLWINativeChannel";
            case 67:
                return "AYMTMobileAdCenterNeedsAttentionChannel";
            case 68:
                return "AYMTMobileAdminSurfaceTodoChannel";
            case 69:
                return "AYMTNativeAdCenterAdInspirationChannel";
            case 70:
                return "AYMTNativeGroupsInsightsChannel";
            case 71:
                return "AYMTNativeGroupsInsightsTipsCenterChannel";
            case 72:
                return "AYMTNativeGroupsMallCardChannel";
            case 73:
                return "AYMTNativeGroupsMallPeekBarChannel";
            case 74:
                return "AYMTNativeMobilePageInsightsChannel";
            case 75:
                return "AYMTNativeMobilePageInsightsRAMainChannel";
            case 76:
                return "AYMTNativeMobilePagePostInsightsChannel";
            case 77:
                return "AYMTNativeMobilePagePostInsightsRAChannel";
            case 78:
                return "AYMTNativeNewsFeedChannel";
            case 79:
                return "AYMTNativePageAdminMegaphoneChannel";
            case 80:
                return "AYMTNativePagesInsightsPostHeaderChannel";
            case 81:
                return "AYMTNewsFeedPostFooterWebV2Channel";
            case 82:
                return "AYMTPMAMegaphoneChannel";
            case 83:
                return "AYMTPageAdminMegaphoneV2Channel";
            case 84:
                return "AYMTPagePostFooterNativeChannel";
            case 85:
                return "AYMTPagePostFooterWebV2Channel";
            case 86:
                return "AbbTableUserPreference";
            case 87:
                return "AchievementPost";
            case 88:
                return "AcornWeatherContentSettings";
            case 89:
                return "ActionableInsightsExternalCase";
            case 90:
                return "ActivityLogNUX";
            case 91:
                return "Actor";
            case 92:
                return "ActorAudienceLimitation";
            case 93:
                return "ActorGatewayEnrollment";
            case 94:
                return "ActorGatewayEnrollmentItem";
            case 95:
                return "ActorGatewayFlow";
            case 96:
                return "Ad";
            case 97:
                return "AdAccount";
            case 98:
                return "AdAccountASLSchedule";
            case 99:
                return "AdAccountAltpayOption";
            case 100:
                return "AdAccountBillingDatePreference";
            case 101:
                return "AdAccountCheckoutPayment";
            case 102:
                return "AdAccountFundingSource";
            case 103:
                return "AdAccountNewCreditCardOption";
            case 104:
                return "AdAccountNewDirectDebitV2Option";
            case 105:
                return "AdAccountNewPaypalOption";
            case 106:
                return "AdAccountPaymentMethod";
            case 107:
                return "AdAccountPaymentMethodsConnection";
            case 108:
                return "AdAccountPaymentMethodsEdge";
            case 109:
                return "AdAccountStoredBalance";
            case 110:
                return "AdAccountUserSetting";
            case 111:
                return "AdAsset";
            case 112:
                return "AdAssetFeed";
            case 113:
                return "AdAssetTargetRule";
            case 114:
                return "AdAsyncRequest";
            case 115:
                return "AdAsyncRequestSet";
            case 116:
                return "AdAudience";
            case 117:
                return "AdBusiness";
            case 118:
                return "AdCampaign";
            case 119:
                return "AdCampaignGroup";
            case 120:
                return "AdColumnSizes";
            case 121:
                return "AdConversionPixel";
            case 122:
                return "AdCreative";
            case 123:
                return "AdCustomAudience";
            case 124:
                return "AdDisclaimerByline";
            case 125:
                return "AdDraftFragmentSql";
            case 126:
                return "AdDraftSql";
            case 127:
                return "AdFilter";
            case 128:
                return "AdImage";
            case 129:
                return "AdLabel";
            case 130:
                return "AdPartnerStudy";
            case 131:
                return "AdPartnerStudyDeliveryRecord";
            case 132:
                return "AdPortablePreviewComment";
            case 133:
                return "AdPromotedObject";
            case 134:
                return "AdProposal";
            case 135:
                return "AdRule";
            case 136:
                return "AdRuleEvaluationSpec";
            case 137:
                return "AdRuleExecutionSpec";
            case 138:
                return "AdSeen";
            case 139:
                return "AdSensitiveContext";
            case 140:
                return "AdStudy";
            case 141:
                return "AdStudyObjective";
            case 142:
                return "AdTargetSpecification";
            case 143:
                return "AddressBook";
            case 144:
                return "AddressBookContact";
            case 145:
                return "Adgroup";
            case 146:
                return "AdminReadTimeBlockMessage";
            case 147:
                return "AdminedPagesConnection";
            case 148:
                return "AdproTargetSpec";
            case 149:
                return "AdsAudienceBuilderExternalCase";
            case 150:
                return "AdsAudienceBuilderPartner";
            case 151:
                return "AdsBusinessQuestionnaireRecord";
            case 152:
                return "AdsColumnPreset";
            case 153:
                return "AdsCouponOffer";
            case 154:
                return "AdsDataPartner";
            case 155:
                return "AdsExperience";
            case 156:
                return "AdsIDSIssue";
            case 157:
                return "AdsIDSIssueTaxonomy";
            case 158:
                return "AdsInterest";
            case 159:
                return "AdsLWIDraftPromotion";
            case 160:
                return "AdsMonthlyInvoicing";
            case 161:
                return "AdsPaymentAccountRawDoNotUse";
            case 162:
                return "AdsPixel";
            case 163:
                return "AdsPreferences";
            case 164:
                return "AdsReportBuilderSavedReport";
            case 165:
                return "AdsReportBuilderSnapshotReport";
            case 166:
                return "AdsReportBuilderUserSettings";
            case 167:
                return "AdsToken";
            case 168:
                return "AdsTutorial";
            case 169:
                return "AdsTutorialCard";
            case 170:
                return "AdsXoutsFeedback";
            case 171:
                return "AdvAQueryTrace";
            case 172:
                return "AdvAQueryTraceCluster";
            case 173:
                return "AdvertiserGuidedCourse";
            case 174:
                return "AdvertiserIssueResolution";
            case 175:
                return "AdvertiserIssueResolutionsConfiguration";
            case 176:
                return "AdvertiserIssueTagMetadata";
            case 177:
                return "AfterPartyUserReaction";
            case 178:
                return "AgentItemReceipt";
            case 179:
                return "AgentItemSuggestion";
            case 180:
                return "AgoraCommunityPost";
            case 181:
                return "AgoraReportableGlobalShare";
            case 182:
                return "AgoraSettings";
            case 183:
                return "AgreementRecipientView";
            case 184:
                return "AgreementTerm";
            case 185:
                return "AirbenderCategory";
            case 186:
                return "AirbenderConfig";
            case 187:
                return "AirbenderDiscreteChoice";
            case 188:
                return "AirlineBoardingPassMessageAttachment";
            case 189:
                return "AirlineCheckInReminderMessageAttachment";
            case 190:
                return "AirlineItineraryMessageAttachment";
            case 191:
                return "AirlineItinerarySegmentMessageAttachment";
            case 192:
                return "AirlineUpdateMessageAttachment";
            case 193:
                return "AkiraTVTab";
            case 194:
                return "Album";
            case 195:
                return "AllSessionsMatchRuleInput";
            case 196:
                return "Aloha";
            case 197:
                return "AlohaAbilityAsset";
            case 198:
                return "AlohaAbilityAssetVersion";
            case 199:
                return "AlohaAbilityPage";
            case 200:
                return "AlohaBLEProximitySignal";
            case 201:
                return "AlohaBasicAbility";
            case 202:
                return "AlohaBasicAbilityNativeConfiguration";
            case 203:
                return "AlohaCall";
            case 204:
                return "AlohaCapability";
            case 205:
                return "AlohaCredentialsConfiguration";
            case 206:
                return "AlohaDevice";
            case 207:
                return "AlohaDeviceOwner";
            case 208:
                return "AlohaExternalAbility";
            case 209:
                return "AlohaExternalAbilityHulaConfiguration";
            case 210:
                return "AlohaExternalAbilityHyruleConfiguration";
            case 211:
                return "AlohaExternalAbilityHyruleGenre";
            case 212:
                return "AlohaExternalAbilityHyruleMask";
            case 213:
                return "AlohaExternalAbilityInstantGameConfiguration";
            case 214:
                return "AlohaExternalAbilityJavaScriptConfiguration";
            case 215:
                return "AlohaExternalAbilityNativeConfiguration";
            case 216:
                return "AlohaExternalAbilityWebViewConfiguration";
            case 217:
                return "AlohaGeofenceProximitySignal";
            case 218:
                return "AlohaIdentityOwnerAbilityAccount";
            case 219:
                return "AlohaOwnerAbilityAccount";
            case 220:
                return "AlohaOwnership";
            case 221:
                return "AlohaPerOwnerFavoritesConfig";
            case 222:
                return "AlohaPerOwnerProximityConfig";
            case 223:
                return "AlohaProxyUserPerOwnerPermissionsConfig";
            case 224:
                return "AlohaStoreDevice";
            case 225:
                return "AlohaSuperframeUserConfig";
            case 226:
                return "AlohaUserProximity";
            case 227:
                return "AlohaWAAccountReference";
            case 228:
                return "AlohaWPAccountReference";
            case 229:
                return "AlohaWifiProximitySignal";
            case 230:
                return "AltPayCredential";
            case 231:
                return "AmbassadorCandidateConnection";
            case 232:
                return "AmbientAudio";
            case 233:
                return "AnalyticsDashboard";
            case 234:
                return "AnalyticsEntityContext";
            case 235:
                return "AnalyticsEntityUserConfig";
            case 236:
                return "AnalyticsInsight";
            case 237:
                return "AnalyticsOutcome";
            case 238:
                return "AnalyticsStoredAggregationChart";
            case 239:
                return "AnalyticsStoredBreakdownTable";
            case 240:
                return "AnalyticsStoredCohort";
            case 241:
                return "AnalyticsStoredFunnel";
            case 242:
                return "AnalyticsStoredSegment";
            case 243:
                return "AnalyticsUserConfig";
            case 244:
                return "AnalyticsUserContext";
            case 245:
                return "AppAdLinkTarget";
            case 246:
                return "AppCenterList";
            case 247:
                return "AppContent";
            case 248:
                return "AppDetailsSection";
            case 249:
                return "AppHardeningEnforcementRecord";
            case 250:
                return "AppInactivityEnforcementRecord";
            case 251:
                return "AppList";
            case 252:
                return "AppSection";
            case 253:
                return "AppSelfCertificationEnforcementRecord";
            case 254:
                return "AppealContentBlockMessage";
            case 255:
                return "Application";
            case 256:
                return "ApplicationAttributionTag";
            case 257:
                return "ApplicationFeedback";
            case 258:
                return "ApplicationHub";
            case 259:
                return "ApplicationHubList";
            case 260:
                return "ApplicationRequest";
            case 261:
                return "ArcticPost";
            case 262:
                return "ArcticPostFeedUnit";
            case 263:
                return "ArcticTextWithTitleItem";
            case 264:
                return "ArcticTitleCardItem";
            case 265:
                return "Arena";
            case 266:
                return "ArenaPhase";
            case 267:
                return "ArenaTeam";
            case 268:
                return "ArticleChainingFeedUnit";
            case 269:
                return "AskMeAnythingSession";
            case 270:
                return "Asset3D";
            case 271:
                return "Asset3DEncoding";
            case 272:
                return "AssistantList";
            case 273:
                return "AssistantListItem";
            case 274:
                return "AtlasCompany";
            case 275:
                return "AuthenticatableFECCommitteeEntity";
            case 276:
                return "AuthenticatableFreeFormOrgEntity";
            case 277:
                return "AuthenticatableStandaloneBusiness";
            case 278:
                return "AuthenticatableUSGovernmentEntity";
            case 279:
                return "Authenticator";
            case 280:
                return "AuthenticityUtilityBillVerificationSupportInboxItem";
            case 281:
                return "AuthorBlockBehavior";
            case 282:
                return "AuthorPublisherSettings";
            case 283:
                return "AutoApprovalGroupInfo";
            case 284:
                return "AutomatedInsight";
            case 285:
                return "AutomaticMetricEventContextCapture";
            case 286:
                return "AutomaticMetricFeedUnitEventContext";
            case 287:
                return "Avatar";
            case 288:
                return "AvatarAssetBundle";
            case 289:
                return "AvatarChoiceTag";
            case 290:
                return "AvatarContinuousData";
            case 291:
                return "AvatarEditorRig";
            case 292:
                return "AvatarEditorTemplate";
            case 293:
                return "AvatarFeatureAttachment";
            case 294:
                return "AvatarFeatureBackground";
            case 295:
                return "AvatarFeaturePose";
            case 296:
                return "AvatarGeometry";
            case 297:
                return "AvatarModel";
            case 298:
                return "AvatarSticker";
            case 299:
                return "AvatarStickerTemplate";
            case DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD:
                return "AvatarStoryTextFormatTemplate";
            case 301:
                return "AvatarTexture";
            case 302:
                return "AvatarUsageData";
            case 303:
                return "AwarenessHubNC4Incident";
            case 304:
                return "BCMPBountyContractSchema";
            case 305:
                return "BCMPBountySchema";
            case 306:
                return "BCMPBrandFilter";
            case 307:
                return "BCMPBrandProfile";
            case 308:
                return "BCMPBrandSearchHistoryEntry";
            case 309:
                return "BCMPCreatorProfile";
            case 310:
                return "BCMPDeal";
            case 311:
                return "BCMPDealPost";
            case 312:
                return "BCMPGroupProfile";
            case 313:
                return "BCMPInstagramProfile";
            case 314:
                return "BCMPInstagramUser";
            case 315:
                return "BCMPInterestedBrandPage";
            case 316:
                return "BCMPProjectBrief";
            case 317:
                return "BCMPProjectBriefResponse";
            case 318:
                return "BCMPRating";
            case 319:
                return "BCMPSavedList";
            case 320:
                return "BCMPSponsoredEvent";
            case 321:
                return "BCPAccountingEntryLine";
            case 322:
                return "BCPAccountingEntryRequest";
            case 323:
                return "BCPAccountingJournalHeader";
            case 324:
                return "BCPAccountingJournalLine";
            case 325:
                return "BCPAccountingPeriod";
            case 326:
                return "BDSignalType";
            case 327:
                return "BOFOrder";
            case 328:
                return "BasicExternalCase";
            case 329:
                return "BatchBloodRequest";
            case 330:
                return "BatchReviewQueueConfig";
            case 331:
                return "BiBoostedPostAppealCreateResponsePayload";
            case 332:
                return "BiPlanesPlaneSkin";
            case 333:
                return "BillableOffer";
            case 334:
                return "BillableOfferQuotingRule";
            case 335:
                return "BillableOfferUsageHistoryEntry";
            case 336:
                return "BillableProduct";
            case 337:
                return "BingoProject";
            case 338:
                return "BirthdayBotGroup";
            case 339:
                return "BirthdayBotParticipant";
            case 340:
                return "BishopConfig";
            case 341:
                return "BizAppDevice";
            case 342:
                return "BizAppUserMetadata";
            case 343:
                return "BizAppsSavedPowerSearch";
            case 344:
                return "BizBroadcastEmail";
            case 345:
                return "BizKitUser";
            case 346:
                return "BizMarketingEmailAudience";
            case 347:
                return "BizMarketingEmailConfig";
            case 348:
                return "BizMarketingPublishedEmailAudience";
            case 349:
                return "BlockedUser";
            case 350:
                return "Blogpost";
            case 351:
                return "BloodDonationFacility";
            case 352:
                return "BloodDonationFacilityReview";
            case 353:
                return "BloodDonationLead";
            case 354:
                return "BloodDonationPartner";
            case 355:
                return "BloodDonor";
            case 356:
                return "BloodRequest";
            case 357:
                return "BobCustomView";
            case 358:
                return "BoggleFriendlyAttachment";
            case 359:
                return "Bookmark";
            case 360:
                return "BoostedComponent";
            case 361:
                return "BoostedComponentAudience";
            case 362:
                return "BoostedComponentCreateResponsePayload";
            case 363:
                return "BoostedComponentDeleteResponsePayload";
            case 364:
                return "BoostedComponentEditResponsePayload";
            case 365:
                return "BoostedComponentInsightsSet";
            case 366:
                return "BoostedComponentMessage";
            case 367:
                return "BrandedContentEnrollmentRequestFeedback";
            case 368:
                return "BrandedContentPostInfo";
            case 369:
                return "BrandedContentSuspectedBCPostInfo";
            case 370:
                return "BrandedContentUserInfo";
            case 371:
                return "BreakingNewsCluster";
            case 372:
                return "BroadcastLiveStickerUsedEvent";
            case 373:
                return "BroadcastPinnedCommentEvent";
            case 374:
                return "BrowseTypeBlockBehavior";
            case 375:
                return "BudgetPool";
            case 376:
                return "BulkTask";
            case 377:
                return "BulkTaskChunk";
            case 378:
                return "BundlePaymentDetail";
            case 379:
                return "BusinessActivityFeedAdsMonitoringFilter";
            case 380:
                return "BusinessActivityFeedPerformanceWidgetSetting";
            case 381:
                return "BusinessActivityFeedSetting";
            case 382:
                return "BusinessActivityLog";
            case 383:
                return "BusinessAgreement";
            case 384:
                return "BusinessAppStoreAppProfile";
            case 385:
                return "BusinessAssociatedObject";
            case 386:
                return "BusinessBulkInvoiceMetadata";
            case 387:
                return "BusinessCRMConfig";
            case 388:
                return "BusinessCRMSegmentation";
            case 389:
                return "BusinessCreativeFolder";
            case 390:
                return "BusinessCreativeFolderSharingAgreement";
            case 391:
                return "BusinessDetails";
            case 392:
                return "BusinessFBPostContent";
            case 393:
                return "BusinessFeedSuccessStory";
            case 394:
                return "BusinessHomeAdsPerformanceCardUserSetting";
            case 395:
                return "BusinessHomeAlertsCardUserSetting";
            case 396:
                return "BusinessHomePageCardUserSetting";
            case 397:
                return "BusinessIGMediaContent";
            case 398:
                return "BusinessImage";
            case 399:
                return "BusinessInboxEmailThread";
            case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI /*400*/:
                return "BusinessMoment";
            case 401:
                return "BusinessMomentReminder";
            case 402:
                return "BusinessObjectTransferOwnershipAgreement";
            case 403:
                return "BusinessOwnedObjectOnBehalfOfRequest";
            case 404:
                return "BusinessPaymentAccount";
            case 405:
                return "BusinessPendingPublishContent";
            case 406:
                return "BusinessPresenceCustomLabel";
            case 407:
                return "BusinessPresenceNode";
            case 408:
                return "BusinessReport";
            case 409:
                return "BusinessRequest";
            case 410:
                return "BusinessResourceGroup";
            case 411:
                return "BusinessRoleRequest";
            case 412:
                return "BusinessTextTag";
            case 413:
                return "BusinessUnit";
            case 414:
                return "BusinessVideo";
            case 415:
                return "BuyAtForm";
            case 416:
                return "CGCProfile";
            case 417:
                return "CHEXC2CPaymentInvoiceRejection";
            case 418:
                return "CHEXFulfillmentShippingLabel";
            case 419:
                return "CHEXLinkedShippingCarrier";
            case 420:
                return "CHEXMerchant1099Form";
            case 421:
                return "CHEXMerchantBulkActionReport";
            case 422:
                return "CHEXMerchantBulkActionReportActionRequest";
            case 423:
                return "CHEXMerchantReport";
            case 424:
                return "CHEXMessage";
            case 425:
                return "CHEXMessageAttachment";
            case 426:
                return "CHEXMessageThread";
            case 427:
                return "CHEXMessageThreadFolder";
            case 428:
                return "CHEXOrderCancellationRequest";
            case 429:
                return "CHEXOrderGiftingInfo";
            case 430:
                return "CHEXOrderGroup";
            case 431:
                return "CHEXOrderItem";
            case 432:
                return "CHEXOrderItemMetrics";
            case 433:
                return "CHEXOrderMetrics";
            case 434:
                return "CHEXPaymentInvoice";
            case 435:
                return "CHEXPaymentInvoiceBOFOrder";
            case 436:
                return "CHEXPaymentInvoiceC2CShippingExtension";
            case 437:
                return "CHEXReturn";
            case 438:
                return "CHEXReturnInBoxLabel";
            case 439:
                return "CHEXReturnOperation";
            case 440:
                return "CHEXReturnPhoto";
            case 441:
                return "CHEXReturnSettings";
            case 442:
                return "CHEXReturnShippingLabel";
            case 443:
                return "CHEXSellerFulfillmentLocation";
            case 444:
                return "CHEXSellerTaxSettings";
            case 445:
                return "CHEXShipment";
            case 446:
                return "CHEXShipmentEvent";
            case 447:
                return "CHEXShipmentTracking";
            case 448:
                return "CHEXShippingCarrier";
            case 449:
                return "CHEXShippingLabelCheckoutSession";
            case 450:
                return "CHEXShippingOption";
            case 451:
                return "CHElvesRoutingRule";
            case 452:
                return "CHElvesWarehouseCapacity";
            case 453:
                return "CMSObject";
            case 454:
                return "CMSPair";
            case 455:
                return "CMTSegmentationUpsellCardsConfig";
            case 456:
                return "CP2PayoutRecord";
            case 457:
                return "CPOPageToAuthEntBridge";
            case 458:
                return "CRMAddress";
            case 459:
                return "CRMAutoEmailReplyConfig";
            case 460:
                return "CRMCustomField";
            case 461:
                return "CRMImage";
            case 462:
                return "CRMProfile";
            case 463:
                return "CRMStage";
            case 464:
                return "CROWBenchmark";
            case 465:
                return "CallToAction";
            case 466:
                return "CameraEffectPromotion";
            case 467:
                return "CameraEffectsQuery";
            case 468:
                return "CameraPostTaggedRegion";
            case 469:
                return "CameraStoryPromotion";
            case 470:
                return "CameraSystemPromotion";
            case 471:
                return "CanceledGroupLivingRoom";
            case 472:
                return "CanceledPageLivingRoom";
            case 473:
                return "CandidateReferralOptOut";
            case 474:
                return "CanonicalAttributeValue";
            case 475:
                return "CaptionsSettings";
            case 476:
                return "CarrierPhoneNumberAccount";
            case 477:
                return "CarrierUpsellPromotion";
            case 478:
                return "CarrierUpsellWallet";
            case 479:
                return "CelebrateFriendsPhotoAgreement";
            case 480:
                return "CfcTopicStory";
            case 481:
                return "ChargebackRepresentment";
            case 482:
                return "CharitableGivingProfileBadge";
            case 483:
                return "ChatCommandResult";
            case 484:
                return "ChatEnticement";
            case 485:
                return "Chatroom";
            case 486:
                return "CheckoutSession";
            case 487:
                return "CheckpointFeedback";
            case 488:
                return "CivicEngagementInfo";
            case 489:
                return "CivicGraphCrowdsourcingAnswer";
            case 490:
                return "CivicGraphCrowdsourcingQuestion";
            case 491:
                return "CivicGraphCrowdsourcingVote";
            case 492:
                return "CivicGraphExternalImport";
            case 493:
                return "CivicGraphMergeValidationRequest";
            case 494:
                return "ClaimReview";
            case 495:
                return "ClashUnit";
            case 496:
                return "ClearHistoryControls";
            case 497:
                return "ClearHistoryWabam";
            case 498:
                return "ClientLeadInformation";
            case 499:
                return "ClientLeadOutreachEvent";
            case 500:
                return "ClientProductionPrompt";
            case 501:
                return "ClientTriggeredQPFeedUnit";
            case 502:
                return "CloudGamingVirtualGamepad";
            case 503:
                return "CodingContest";
            case 504:
                return "CodingContestAlert";
            case 505:
                return "CodingContestClarificationRequest";
            case 506:
                return "CodingContestClarificationRequestMessage";
            case 507:
                return "CodingContestClarificationRequestMessageAttachment";
            case 508:
                return "CodingContestClarificationResponseTemplate";
            case 509:
                return "CodingContestEntrantPerformance";
            case 510:
                return "CodingContestIndividualEntrant";
            case 511:
                return "CodingContestIndividualEntrantPersonalInfo";
            case 512:
                return "CodingContestProblem";
            case 513:
                return "CodingContestProblemSet";
            case 514:
                return "CodingContestProblemSubmission";
            case 515:
                return "CodingContestSeason";
            case 516:
                return "CodingContestSeries";
            case 517:
                return "CodingContestTeamEntrant";
            case 518:
                return "CodingInterview";
            case 519:
                return "CodingInterviewProblem";
            case 520:
                return "CodingInterviewProblemSet";
            case 521:
                return "CodingInterviewProblemSubmission";
            case 522:
                return "CodingProblemHint";
            case 523:
                return "CodingProblemPhoto";
            case 524:
                return "CodingProblemSolutionSubmission";
            case 525:
                return "CodingProblemSubmissionTemplate";
            case 526:
                return "CodingProblemTestCase";
            case 527:
                return "CodingProblemTestCaseSet";
            case 528:
                return "CollegeChatPersona";
            case 529:
                return "CollegeContextualProfile";
            case 530:
                return "CollegeProfileFieldValue";
            case 531:
                return "CollegeProfileMetadata";
            case 532:
                return "Comment";
            case 533:
                return "CommentFile";
            case 534:
                return "CommentMessageInfo";
            case 535:
                return "CommentPlaceInfo";
            case 536:
                return "CommentProductInfo";
            case 537:
                return "CommerceCart";
            case 538:
                return "CommerceChargeback";
            case 539:
                return "CommerceCommentMessageUpsell";
            case 540:
                return "CommerceDropsCampaign";
            case 541:
                return "CommerceExternalCase";
            case 542:
                return "CommerceFBChannelSettings";
            case 543:
                return "CommerceIGChannelSettings";
            case 544:
                return "CommerceKYCEvent";
            case 545:
                return "CommerceLead";
            case 546:
                return "CommerceMerchantSettings";
            case 547:
                return "CommerceMerchantSubscriptionSettings";
            case 548:
                return "CommerceOffer";
            case 549:
                return "CommerceProductCollectionMetadata";
            case 550:
                return "CommerceProductItemShare";
            case 551:
                return "CommerceReviewForAnalytics";
            case 552:
                return "CommerceSellerCuratedCollection";
            case 553:
                return "CommerceStore";
            case 554:
                return "CommerceStoreCollection";
            case 555:
                return "CommerceStoreShare";
            case 556:
                return "CommerceSyncMetadata";
            case 557:
                return "CommerceTaxonCategory";
            case 558:
                return "CommerceUserProductHistory";
            case 559:
                return "CommerceWAChannelSettings";
            case 560:
                return "CommunitiesTrendingTopic";
            case 561:
                return "CommunityEmailVerification";
            case 562:
                return "CommunityLiveChat";
            case 563:
                return "CommunityModerationEvent";
            case 564:
                return "CommunityModerationPageSettings";
            case 565:
                return "CommunityNuxAnswer";
            case 566:
                return "CommunityNuxQuestion";
            case 567:
                return "CommunityReviewRating";
            case 568:
                return "CommunityVoice";
            case 569:
                return "CompanyFrontlineSettings";
            case 570:
                return "CompassCuratedContentLabel";
            case 571:
                return "CompassCuratedContentTag";
            case 572:
                return "CompassCuratedUnit";
            case 573:
                return "CompassCuratedUnitElement";
            case 574:
                return "CompassCuratedUnitElementHistory";
            case 575:
                return "CompassCuratedUnitNote";
            case 576:
                return "CompassCuratedUnitVersion";
            case 577:
                return "CompassCuratedUnitVersionFeedback";
            case 578:
                return "CompassCuratedUnitVersionHistory";
            case 579:
                return "CompassCuratedUnitVersionStatusHistory";
            case 580:
                return "CompassCurationSavedContentSource";
            case 581:
                return "CompassCurationUserProfile";
            case 582:
                return "ComplianceQueryPartner";
            case 583:
                return "ComposedBlockWithEntities";
            case 584:
                return "ComposedDocument";
            case 585:
                return "ComposedText";
            case 586:
                return "ComputerVisionInfo";
            case 587:
                return "ConfigurableSnooze";
            case 588:
                return "Configuration";
            case 589:
                return "ConnectedTVSearchQuery";
            case 590:
                return "ConnectedTVTab";
            case 591:
                return "Consent";
            case 592:
                return "ConsumerPaymentAccountRawDoNotUse";
            case 593:
                return "ContactEmail";
            case 594:
                return "ContactFormData";
            case 595:
                return "ContactImportSession";
            case 596:
                return "ContactNameField";
            case 597:
                return "ContactPhone";
            case 598:
                return "ContactRecommendationField";
            case 599:
                return "ContactUser";
            case 600:
                return "ContentTargeterOverride";
            case 601:
                return "ContextualProfileGroupsPostNullState";
            case 602:
                return "ContextualProfileMessageRequest";
            case 603:
                return "ContextualProfilePlaceholder";
            case 604:
                return "ContinuousContactUploadSetting";
            case 605:
                return "ContinuousSyncSetting";
            case 606:
                return "Conversation";
            case 607:
                return "ConversationPost";
            case 608:
                return "CorePartner";
            case 609:
                return "CoronavirusCommunityHelpFeedUnit";
            case 610:
                return "CoronavirusHub";
            case 611:
                return "CoronavirusStats";
            case 612:
                return "CosmosAudienceSpec";
            case 613:
                return "CosmosTag";
            case 614:
                return "CosmosTagTaxonomy";
            case 615:
                return "CosmosTagTaxonomyGroup";
            case 616:
                return "Country";
            case 617:
                return "Coupon";
            case 618:
                return "CouponApprovalEvent";
            case 619:
                return "CouponCode";
            case 620:
                return "CouponCodeRequest";
            case 621:
                return "CouponTransaction";
            case 622:
                return "CovidCurationHubData";
            case 623:
                return "CovidExtractableFBTContent";
            case 624:
                return "CovidInformationBlob";
            case 625:
                return "CoworkerGroupContextualProfileMetadata";
            case 626:
                return "CreateOrUpdateForDeviceUpgradeOverMobileDataPreferencesResponsePayload";
            case 627:
                return "CreateVideoMeetupLinkResponsePayload";
            case 628:
                return "CreativeFilter";
            case 629:
                return "CreatorMonetizationProductActiveState";
            case 630:
                return "CreatorMonetizationProductOnboardingPaymentInfoState";
            case 631:
                return "CreatorMonetizationProductOnboardingSubmissionReadyState";
            case 632:
                return "CreatorMonetizationProductPreonboardingState";
            case 633:
                return "CreatorMonetizationProductSetupState";
            case 634:
                return "CreatorMonetizationProductSubscriptionInfoState";
            case 635:
                return "CreatorMonetizationProductTOSState";
            case 636:
                return "CreatorMonetizationProductUnderReviewState";
            case 637:
                return "CreatorStudioInboxPriorityTopMessages";
            case 638:
                return "Crisis";
            case 639:
                return "CrisisAlias";
            case 640:
                return "CrisisDonationInfo";
            case 641:
                return "CrisisGeoArea";
            case 642:
                return "CrisisGeoAreaPhoto";
            case 643:
                return "CrisisHub";
            case 644:
                return "CrisisHubUserInfo";
            case 645:
                return "CrisisListing";
            case 646:
                return "CrisisRelatedMedia";
            case 647:
                return "CrisisUserInfo";
            case 648:
                return "CriticReview";
            case 649:
                return "CuApplication";
            case 650:
                return "CulturalMoment";
            case 651:
                return "CulturalMomentImageOverlay";
            case 652:
                return "CuratedFeed";
            case 653:
                return "CurrencyQuantity";
            case 654:
                return "CustomChatRule";
            case 655:
                return "CustomConversion";
            case 656:
                return "CustomFundraiserBeneficiary";
            case 657:
                return "CustomGender";
            case 658:
                return "CustomizedStory";
            case 659:
                return "DAFCharity";
            case 660:
                return "DSCApplicationProperty";
            case 661:
                return "DSCAsperaConfiguration";
            case 662:
                return "DSCBonusContent";
            case 663:
                return "DSCBusinessProperty";
            case 664:
                return "DSCCollection";
            case 665:
                return "DSCDeal";
            case 666:
                return "DSCDealEngagementType";
            case 667:
                return "DSCDealProgram";
            case 668:
                return "DSCDealWatchContentDeliveryScheduleMetadata";
            case 669:
                return "DSCDomainProperty";
            case 670:
                return "DSCEpisodicMetadata";
            case 671:
                return "DSCFundedContentMetadata";
            case 672:
                return "DSCIGUserProperty";
            case 673:
                return "DSCLabel";
            case 674:
                return "DSCLegalEntity";
            case 675:
                return "DSCLiveBroadcastConfiguration";
            case 676:
                return "DSCMediaGroupEntry";
            case 677:
                return "DSCMetadataForVideoAsset";
            case 678:
                return "DSCMutationRecord";
            case 679:
                return "DSCNewsDomainInventory";
            case 680:
                return "DSCOriginalsMetadata";
            case 681:
                return "DSCPageProperty";
            case 682:
                return "DSCPartner";
            case 683:
                return "DSCPremiumMusicVideoMetadata";
            case 684:
                return "DSCProductionShoot";
            case 685:
                return "DSCSeason";
            case 686:
                return "DSCSeries";
            case 687:
                return "DSCSottoMetadata";
            case 688:
                return "DSCVideoMetadata";
            case 689:
                return "DTPJavaJob";
            case 690:
                return "DYIJob";
            case 691:
                return "DayPart";
            case 692:
                return "DedicatedSection";
            case 693:
                return "DeletedContentFeedback";
            case 694:
                return "DelightsAnimation";
            case 695:
                return "DelightsPTR";
            case 696:
                return "DeveloperCommunityBadge";
            case 697:
                return "DeveloperCommunityCategory";
            case 698:
                return "DeveloperCommunityCategorySubscription";
            case 699:
                return "DeveloperCommunityPost";
            case 700:
                return "DeveloperCommunityProfile";
            case 701:
                return "DeveloperCommunityProfileSubscription";
            case 702:
                return "DeveloperCommunityTag";
            case 703:
                return "DeveloperCommunityThread";
            case 704:
                return "DeveloperCommunityThreadAssignment";
            case 705:
                return "DeveloperCommunityThreadExternalTaskMigration";
            case 706:
                return "DeveloperTask";
            case 707:
                return "Device";
            case 708:
                return "DeviceAutoplaySetting";
            case 709:
                return "DeviceBurmeseFontCapability";
            case 710:
                return "DigitalRightsSupportInboxMessage";
            case 711:
                return "DiodeFeed";
            case 712:
                return "DirectDebit";
            case 713:
                return "DirectMessage";
            case 714:
                return "DirectMessageReaction";
            case 715:
                return "DirectMessageSend";
            case 716:
                return "DirectMessageSettingsInfo";
            case 717:
                return "DirectMessageThread";
            case 718:
                return "DirectMessageThreadBucket";
            case 719:
                return "DirectSupportEmailProfile";
            case ArLinkScanControllerImpl.TARGET_IMAGE_SIZE:
                return "DirectlyCallableUser";
            case 721:
                return "DittoAccess";
            case 722:
                return "DittoUser";
            case 723:
                return "Doc";
            case 724:
                return "DocRevision";
            case 725:
                return "DocauthClassSet";
            case 726:
                return "DocumentEventElement";
            case 727:
                return "DocumentListElement";
            case 728:
                return "DocumentMapElement";
            case 729:
                return "DocumentMultiTextElement";
            case 730:
                return "DocumentNTElement";
            case 731:
                return "DocumentNativeAdElement";
            case 732:
                return "DocumentNativeAdSet";
            case 733:
                return "DocumentNativeInstagramEmbedElement";
            case 734:
                return "DocumentNativeTwitterEmbedElement";
            case 735:
                return "DocumentPhotoElement";
            case 736:
                return "DocumentRelatedArticlesBlock";
            case 737:
                return "DocumentSlideshowElement";
            case 738:
                return "DocumentTextElement";
            case 739:
                return "DocumentVideoElement";
            case 740:
                return "DocumentWebviewElement";
            case 741:
                return "DonationPayment";
            case 742:
                return "DonorAdvisedFund";
            case 743:
                return "DownstreamEffectRecord";
            case 744:
                return "DraftBloodDonationFacility";
            case 745:
                return "DummyCredential";
            case 746:
                return "DynamicARMetadata";
            case 747:
                return "DynamicTextSticker";
            case 748:
                return "EInvoice";
            case 749:
                return "EInvoiceRequest";
            case 750:
                return "EPHistoryProd";
            case 751:
                return "ESMActivityCreate";
            case 752:
                return "ESMActivityServiceCaseSubStatusChange";
            case 753:
                return "ESMAttachment";
            case 754:
                return "ESMAttachmentActivity";
            case 755:
                return "ESMChatTextMessage";
            case 756:
                return "ESMChatThread";
            case 757:
                return "ESMEmailMessage";
            case 758:
                return "ESMEmailThread";
            case 759:
                return "ESMFormConfig";
            case 760:
                return "ESMFormResponseDataChangeActivity";
            case 761:
                return "ESMInternSEVLinkedData";
            case 762:
                return "ESMInternTaskLinkedData";
            case 763:
                return "ESMInvestigationProfile";
            case 764:
                return "ESMInvestigationProfileAlias";
            case 765:
                return "ESMInvestigationProfileAppearance";
            case 766:
                return "ESMInvestigationProfileBasicInfo";
            case 767:
                return "ESMInvolvement";
            case 768:
                return "ESMInvolvementType";
            case 769:
                return "ESMLabelValuePair";
            case 770:
                return "ESMLabelValueSetLinkedData";
            case 771:
                return "ESMResource";
            case 772:
                return "ESMRole";
            case 773:
                return "ESMSavedSearch";
            case 774:
                return "ESMServiceCase";
            case 775:
                return "ESMServiceCaseAddedInvolvementActivity";
            case 776:
                return "ESMServiceCaseFeedback";
            case 777:
                return "ESMServiceCaseHelpdeskDetail";
            case 778:
                return "ESMServiceCaseInvolvementActivity";
            case 779:
                return "ESMServiceCaseOwnerChangeActivity";
            case 780:
                return "ESMServiceCasePriorityChangeActivity";
            case 781:
                return "ESMServiceCaseRelatedCasesChangeActivity";
            case 782:
                return "ESMServiceCaseSource";
            case 783:
                return "ESMServiceCaseSubStatus";
            case 784:
                return "ESMServiceCaseSubscribersChangeActivity";
            case 785:
                return "ESMServiceCaseSummary";
            case 786:
                return "ESMServiceCaseSummaryType";
            case 787:
                return "ESMServiceCaseTitleChangeActivity";
            case 788:
                return "ESMServiceCaseType";
            case 789:
                return "ESMServiceCaseTypeCategory";
            case 790:
                return "ESMServiceObject";
            case 791:
                return "ESMServiceObjectType";
            case 792:
                return "ESMTag";
            case 793:
                return "ESMTeam";
            case 794:
                return "ESMTextLinkedData";
            case 795:
                return "ESMThreatProfileLinkedData";
            case 796:
                return "ESMTrendingServiceCaseType";
            case 797:
                return "ESMVertical";
            case 798:
                return "ESMVerticalUserProfile";
            case 799:
                return "ESMViewedCase";
            case 800:
                return "ESMWorkUserLinkedData";
            case 801:
                return "EcommBuyerProfile";
            case 802:
                return "EcommProductCollection";
            case 803:
                return "EcommProductCollectionGroup";
            case 804:
                return "EcommProductSubsidyIncentive";
            case 805:
                return "EditAction";
            case 806:
                return "EducationExperience";
            case 807:
                return "EffectFileBundle";
            case 808:
                return "ElectionFRXReportingConfig";
            case 809:
                return "EmailAddress";
            case 810:
                return "EmojiCategory";
            case 811:
                return "EmojiCategoryList";
            case 812:
                return "EmployeeCheckupAsyncJobInstance";
            case 813:
                return "EmployeeCheckupCrisis";
            case 814:
                return "EmployeeCheckupCrisisUserActivity";
            case 815:
                return "EmployeeCheckupCrisisUserInfo";
            case 816:
                return "EmployeeCheckupDispatchJob";
            case 817:
                return "EmployeeCheckupJob";
            case 818:
                return "Employer";
            case 819:
                return "EmptySerpBehavior";
            case 820:
                return "EmptyUserStoryBucket";
            case 821:
                return "EndOfFeedUpsellCustomNTFeedUnit";
            case 822:
                return "EntAdPlacePageSet";
            case 823:
                return "EntAnalyticsUserEntityContext";
            case 824:
                return "EntIARegiwallPublisher";
            case 825:
                return "EntMutatorDebuggerDebugSession";
            case 826:
                return "Entity";
            case 827:
                return "EntityAtRange";
            case 828:
                return "EntryPointsSuggestionBlockBehavior";
            case 829:
                return "Error";
            case 830:
                return "EsportsLeague";
            case 831:
                return "EvaluativeProblemPhoto";
            case 832:
                return "Event";
            case 833:
                return "EventAttendanceConfig";
            case 834:
                return "EventAttendanceConfirmation";
            case 835:
                return "EventAttendanceQuestion";
            case 836:
                return "EventCalendarableDateRange";
            case 837:
                return "EventCollection";
            case 838:
                return "EventCollectionItem";
            case 839:
                return "EventConnectionData";
            case 840:
                return "EventDiscoverCategoryFormatData";
            case 841:
                return "EventEmailInvitee";
            case 842:
                return "EventFirstPartyTicketingConfigs";
            case 843:
                return "EventHistory";
            case 844:
                return "EventIndividualTicket";
            case 845:
                return "EventInvite";
            case 846:
                return "EventLineup";
            case 847:
                return "EventRegistrationSetting";
            case 848:
                return "EventSMSInvitee";
            case 849:
                return "EventSmartCategory";
            case 850:
                return "EventThemeCategory";
            case 851:
                return "EventThemePhoto";
            case 852:
                return "EventThemeTag";
            case 853:
                return "EventTicketInfoData";
            case 854:
                return "EventTicketOrder";
            case 855:
                return "EventTicketOrderHistoryLog";
            case 856:
                return "EventTicketSetting";
            case 857:
                return "EventTicketSubOrder";
            case 858:
                return "EventTicketTier";
            case 859:
                return "EventTicketingPayment";
            case 860:
                return "EventTour";
            case 861:
                return "EventUserLocationShare";
            case 862:
                return "EventsAppUserSetting";
            case 863:
                return "ExWithAlohaAbilityAccount";
            case 864:
                return "ExampleSRTForm";
            case 865:
                return "ExploreFeed";
            case 866:
                return "ExploreFeedUpsellNTUnit";
            case 867:
                return "ExploreFeedUpsellUnit";
            case 868:
                return "ExploreTopicMatchRuleInput";
            case 869:
                return "ExpressWifiPartner";
            case 870:
                return "ExpressionRecorderSession";
            case 871:
                return "ExtendedCredit";
            case 872:
                return "ExtendedCreditAllocation";
            case 873:
                return "ExtendedCreditApplication";
            case 874:
                return "ExtendedCreditChangeEvent";
            case 875:
                return "ExtendedCreditEmail";
            case 876:
                return "ExtendedCreditInvoiceGroup";
            case 877:
                return "ExtensibleMessageAttachment";
            case 878:
                return "ExternalCase";
            case 879:
                return "ExternalCaseAttachment";
            case 880:
                return "ExternalCaseOffer";
            case 881:
                return "ExternalCaseStatus";
            case 882:
                return "ExternalCaseSubscription";
            case 883:
                return "ExternalCaseType";
            case 884:
                return "ExternalCaseUpdate";
            case 885:
                return "ExternalCreditCard";
            case 886:
                return "ExternalMerchantSettings";
            case 887:
                return "ExternalMovie";
            case 888:
                return "ExternalMoviePageRequest";
            case 889:
                return "ExternalMovieReview";
            case 890:
                return "ExternalMovieSchedule";
            case 891:
                return "ExternalMovieShowtime";
            case 892:
                return "ExternalMovieTheater";
            case 893:
                return "ExternalMusicAlbum";
            case 894:
                return "ExternalOfferProvider";
            case 895:
                return "ExternalOfferUser";
            case 896:
                return "ExternalSong";
            case 897:
                return "ExternalTask";
            case 898:
                return "ExternalTaskAttachment";
            case 899:
                return "ExternalTaskDeveloperCommunityThreadMigration";
            case 900:
                return "ExternalTaskTag";
            case 901:
                return "ExternalTaskUpdate";
            case 902:
                return "ExternalTheaterRoom";
            case 903:
                return "ExternalTranslatableContent";
            case 904:
                return "ExternalUrl";
            case 905:
                return "ExternalWallet";
            case 906:
                return "FBAppAirbenderConfig";
            case 907:
                return "FBCMGeoCircle";
            case 908:
                return "FBCMGeoPolygon";
            case 909:
                return "FBCMIntervention";
            case 910:
                return "FBCMProgramCollection";
            case 911:
                return "FBCMTagCollection";
            case 912:
                return "FBCommsAYMT";
            case 913:
                return "FBEAppSettings";
            case 914:
                return "FBEDeveloperPanelSettings";
            case 915:
                return "FBForm";
            case 916:
                return "FBFormContractApp";
            case 917:
                return "FBFormDefaultApp";
            case 918:
                return "FBFormDefinition";
            case 919:
                return "FBFormFileObject";
            case 920:
                return "FBFormGroup";
            case 921:
                return "FBFormInstance";
            case 922:
                return "FBFormOption";
            case 923:
                return "FBFormPartnerAssessmentApp";
            case 924:
                return "FBFormQuestion";
            case 925:
                return "FBFormQuestionResponse";
            case 926:
                return "FBFormRule";
            case 927:
                return "FBFormRuleData";
            case 928:
                return "FBFormRuleSet";
            case 929:
                return "FBFormSourceKey";
            case 930:
                return "FBFormSupplierInviteApp";
            case 931:
                return "FBGeneratedStoryViewerOnlyStoryBucket";
            case 932:
                return "FBGroupChatMessageReport";
            case 933:
                return "FBGroupChatPersona";
            case 934:
                return "FBGroupChatPublicMetadata";
            case 935:
                return "FBGroupChatThreadPublicMetadata";
            case 936:
                return "FBGroupChatUserSettings";
            case 937:
                return "FBLiteNuxState";
            case 938:
                return "FBQRCode";
            case 939:
                return "FBRecruitingArea";
            case 940:
                return "FBRecruitingQuestion";
            case 941:
                return "FBRecruitingQuestionOption";
            case 942:
                return "FBRecruitingQuestionOrder";
            case 943:
                return "FBRecruitingReferralPreference";
            case 944:
                return "FBRecruitingReferralReachout";
            case 945:
                return "FBRecruitingReferralResume";
            case 946:
                return "FBSExternalCase";
            case 947:
                return "FBSService";
            case 948:
                return "FBShorts";
            case 949:
                return "FBStarsWallet";
            case 950:
                return "FBStoryPortalInfo";
            case 951:
                return "FDDevice";
            case 952:
                return "FDSDesignReviewRequest";
            case 953:
                return "FMPTSClientInformation";
            case 954:
                return "FTCNeutralEnforcementRecord";
            case 955:
                return "FaceBox";
            case 956:
                return "FaceCluster";
            case 957:
                return "FaceModel";
            case 958:
                return "Facebook360ExplorePinnedFeedUnit";
            case 959:
                return "FacebookBusinessExtension";
            case 960:
                return "FacebookFeature";
            case 961:
                return "FacebookPro";
            case 962:
                return "FacecastCountHashtagCommentAggregation";
            case 963:
                return "FacecastCountSpecificCommentAggregation";
            case 964:
                return "FacecastFirstCommentAggregation";
            case 965:
                return "FactCheckContributorSavedSearch";
            case 966:
                return "FactCheckContributorSettings";
            case 967:
                return "FactCheckProvider";
            case 968:
                return "FactCheckSavedSearch";
            case 969:
                return "FactCheckableContent";
            case 970:
                return "FactCheckablePhotoCluster";
            case 971:
                return "FactCheckableVideoCluster";
            case 972:
                return "FamilyNonUserMember";
            case 973:
                return "FamilyRelationship";
            case 974:
                return "FanSubmissionRequest";
            case 975:
                return "FanSupportPack";
            case 976:
                return "FanSupportPackOrder";
            case 977:
                return "FanSupportPageSettings";
            case 978:
                return "FbcRemitReaderHeader";
            case 979:
                return "FbcRemitReaderLine";
            case 980:
                return "FeaturableOnProfileFriendPlaceholder";
            case 981:
                return "FeaturableOnProfileInsightsSet";
            case 982:
                return "FeaturableOnProfileSet";
            case 983:
                return "FeaturableOnProfileVideoPlaceholder";
            case 984:
                return "FeatureLimitFeedback";
            case 985:
                return "FeaturedAdminInfo";
            case 986:
                return "FeedClientPromptFeedUnit";
            case 987:
                return "Feedback";
            case 988:
                return "FeedbackReactionInfo";
            case 989:
                return "FetchCategoriesResult";
            case 990:
                return "FileDescriptor";
            case 991:
                return "FileIndicator";
            case 992:
                return "FileViewMarker";
            case 993:
                return "FinancialEntityNew";
            case 994:
                return "FirmwareOTAReleaseChannel";
            case 995:
                return "FixedCostShippingAddressCategory";
            case 996:
                return "FixedCostShippingOption";
            case 997:
                return "FixedCostShippingProfile";
            case 998:
                return "FleetBeaconLQ";
            case AsyncStorageModule.MAX_SQL_KEYS:
                return "FlytrapBugAttachment";
            case 1000:
                return "FlytrapBugReport";
            case 1001:
                return "FlytrapBugReportFeedback";
            case 1002:
                return "FolderBookmark";
            case 1003:
                return "FolderCollection";
            case 1004:
                return "FoodDrinkCustomTaxRate";
            case 1005:
                return "FoodDrinkMenu";
            case 1006:
                return "FoodDrinkMenuCategory";
            case 1007:
                return "FoodDrinkMenuItem";
            case 1008:
                return "FoodDrinkOrder";
            case 1009:
                return "FoodDrinkOrderRecord";
            case 1010:
                return "FoodDrinkSubMenu";
            case 1011:
                return "FoodDrinkSubMenuItem";
            case 1012:
                return "ForSaleItemVariant";
            case 1013:
                return "ForSaleShippingLabel";
            case 1014:
                return "FormProgressStoryAttachment";
            case 1015:
                return "FoxFeedPYMKFeedObject";
            case 1016:
                return "FoxFeedRecommendationFeedObject";
            case 1017:
                return "FoxMode";
            case 1018:
                return "FrameImageAsset";
            case 1019:
                return "FrameTextAsset";
            case 1020:
                return "FranchiseProgram";
            case 1021:
                return "FranchiseProgramMember";
            case 1022:
                return "FreeformInterviewProblem";
            case 1023:
                return "FreeformPlace";
            case 1024:
                return "FreeformTag";
            case 1025:
                return "FriendList";
            case 1026:
                return "FriendOneResearchUser";
            case 1027:
                return "FriendRequestStatus";
            case 1028:
                return "FriendRequestsFeedUnit";
            case 1029:
                return "FriendRequestsLimitFeedback";
            case 1030:
                return "FriendingCheckup";
            case 1031:
                return "FunFactPrompt";
            case 1032:
                return "FunFactPromptAnswerRequest";
            case 1033:
                return "FundraiserCampaign";
            case 1034:
                return "FundraiserCause";
            case 1035:
                return "FundraiserCharity";
            case 1036:
                return "FundraiserCreatePromo";
            case 1037:
                return "FundraiserCrisisForCharity";
            case 1038:
                return "FundraiserCrisisForCharityDonation";
            case 1039:
                return "FundraiserDonation";
            case 1040:
                return "FundraiserDraftCreation";
            case 1041:
                return "FundraiserForStory";
            case 1042:
                return "FundraiserForStoryDonation";
            case 1043:
                return "FundraiserForStoryDonationAlert";
            case 1044:
                return "FundraiserPage";
            case 1045:
                return "FundraiserPersonForCause";
            case 1046:
                return "FundraiserPersonForCharitiesInCause";
            case 1047:
                return "FundraiserPersonForPerson";
            case 1048:
                return "FundraiserPersonToCharity";
            case 1049:
                return "FundraiserProfileDonation";
            case 1050:
                return "FundraiserProfileForCharity";
            case 1051:
                return "FundraiserScheduledSingleMatch";
            case 1052:
                return "FundraiserSingleMatch";
            case 1053:
                return "GPUReplayMetadata";
            case 1054:
                return "GSSchool";
            case 1055:
                return "Game";
            case 1056:
                return "GameChatServer";
            case 1057:
                return "GameChatURL";
            case 1058:
                return "GamePayment";
            case 1059:
                return "GamePaymentInvoice";
            case 1060:
                return "GameTime";
            case 1061:
                return "GameroomRelease";
            case 1062:
                return "GamesAppUser";
            case 1063:
                return "GamesGroupUserSettingsInfo";
            case 1064:
                return "GamesServiceAvatar";
            case 1065:
                return "GamesServiceUser";
            case 1066:
                return "GamesUserPoints";
            case 1067:
                return "GamingCoplayMatch";
            case 1068:
                return "GamingCreatorIncentive";
            case 1069:
                return "GamingVideoCreatorGoalsSettings";
            case 1070:
                return "GamingVideoCreatorSettings";
            case 1071:
                return "GamingVideoGoal";
            case 1072:
                return "GamingVideoRaid";
            case 1073:
                return "GamingVideoStreamEvent";
            case 1074:
                return "GamingVideoStreamerDashboardSettings";
            case 1075:
                return "GamingVideoViewerGame";
            case 1076:
                return "GamingVideoViewerGameSignup";
            case 1077:
                return "GemstoneUser";
            case 1078:
                return "GemstoneUserPreference";
            case 1079:
                return "GemstoneUserPrivateSettings";
            case 1080:
                return "GeneralGroupContextualProfile";
            case 1081:
                return "GenericContentCollection";
            case 1082:
                return "GenericEffect";
            case 1083:
                return "GenericEffectAsset";
            case 1084:
                return "GenericEffectInstance";
            case 1085:
                return "GenericMediaSet";
            case 1086:
                return "GenieMessage";
            case 1087:
                return "GeoGatingPolicy";
            case 1088:
                return "GeoblockFeedback";
            case 1089:
                return "Geofence";
            case 1090:
                return "GeofenceAct";
            case 1091:
                return "GfycatGif";
            case 1092:
                return "GiftCard";
            case 1093:
                return "GiftCardRedemptionPayment";
            case 1094:
                return "GiftPayment";
            case 1095:
                return "GiftProduct";
            case 1096:
                return "GiftProductCategory";
            case 1097:
                return "GiftProductSku";
            case 1098:
                return "GiftStore";
            case 1099:
                return "GiftcardBalance";
            case 1100:
                return "GlobalSupportForm";
            case 1101:
                return "GlobalSupportFormCheckboxListField";
            case 1102:
                return "GlobalSupportFormCodeBlockField";
            case 1103:
                return "GlobalSupportFormDateField";
            case 1104:
                return "GlobalSupportFormFacebookEntitiesField";
            case 1105:
                return "GlobalSupportFormRadioListField";
            case 1106:
                return "GlobalSupportFormSelectorField";
            case 1107:
                return "GlobalSupportFormStaticContentField";
            case 1108:
                return "GlobalSupportFormTextField";
            case 1109:
                return "GlobalSupportFormToggleField";
            case 1110:
                return "GlobalSupportFormWhatsAppHsmField";
            case 1111:
                return "GlobalSupportFormWorkplaceCustomNoticeField";
            case 1112:
                return "GoodwillAnniversaryCampaign";
            case 1113:
                return "GoodwillBirthdayCampaign";
            case 1114:
                return "GoodwillDailyDialogueWeatherSetting";
            case 1115:
                return "GoodwillFriendversaryCampaign";
            case 1116:
                return "GoodwillStarversaryCampaign";
            case 1117:
                return "GoodwillStoryCTACard";
            case 1118:
                return "GoodwillStoryCampaign";
            case 1119:
                return "GoodwillThrowbackCard";
            case 1120:
                return "GoodwillThrowbackPromotionFeedUnit";
            case 1121:
                return "GoodwillThrowbackPromotionNativeTemplatesFeedUnit";
            case 1122:
                return "GoodwillThrowbackSettings";
            case 1123:
                return "GoodwillVideoCampaign";
            case 1124:
                return "GoodwillVideoFrame";
            case 1125:
                return "GoodwillVideoMessage";
            case 1126:
                return "GoodwillVideoPicture";
            case 1127:
                return "GoodwillVideoSection";
            case 1128:
                return "GovService";
            case 1129:
                return "GovServiceSubmission";
            case 1130:
                return "GradientProfileInitials";
            case 1131:
                return "GraphSearchQuery";
            case 1132:
                return "GravitySettingsForUser";
            case 1133:
                return "GreetingCard";
            case 1134:
                return "GreetingCardTemplate";
            case 1135:
                return "GreetingCardTemplateData";
            case 1136:
                return "Group";
            case 1137:
                return "GroupAdminActivity";
            case 1138:
                return "GroupAdminBotActor";
            case 1139:
                return "GroupAdminChangelog";
            case 1140:
                return "GroupAdminDeleteContentFeedback";
            case 1141:
                return "GroupAlertedContentHistory";
            case 1142:
                return "GroupAnonAuthorProfile";
            case 1143:
                return "GroupCheckpointFeedback";
            case 1144:
                return "GroupCommerceMarkAsSold";
            case 1145:
                return "GroupCommerceProductItem";
            case 1146:
                return "GroupDiscoveryCategory";
            case 1147:
                return "GroupEducationCenterTopic";
            case 1148:
                return "GroupEducationCenterTutorial";
            case 1149:
                return "GroupEmailDomain";
            case 1150:
                return "GroupEnforcedContent";
            case 1151:
                return "GroupEnforcedContentHistory";
            case 1152:
                return "GroupFile";
            case 1153:
                return "GroupFileWithRevisions";
            case 1154:
                return "GroupHashtag";
            case 1155:
                return "GroupInvite";
            case 1156:
                return "GroupInviteLink";
            case 1157:
                return "GroupJobFeaturesSettings";
            case 1158:
                return "GroupLivingRoom";
            case 1159:
                return "GroupMemberReportContentFeedback";
            case 1160:
                return "GroupMembership";
            case 1161:
                return "GroupMembershipQuestion";
            case 1162:
                return "GroupMembershipQuestionOption";
            case 1163:
                return "GroupMessengerCallInviteLink";
            case 1164:
                return "GroupMessengerGroupChat";
            case 1165:
                return "GroupPaymentGift";
            case 1166:
                return "GroupPendingMembersSavedFilter";
            case 1167:
                return "GroupPendingPostSchedulingSettings";
            case 1168:
                return "GroupPostTag";
            case 1169:
                return "GroupPostTopic";
            case 1170:
                return "GroupPreVettedUserList";
            case 1171:
                return "GroupRecommendationPivot";
            case 1172:
                return "GroupRecommendedPage";
            case 1173:
                return "GroupReportFeedback";
            case 1174:
                return "GroupResponsibleFeedback";
            case 1175:
                return "GroupRule";
            case 1176:
                return "GroupScheduledPostSeries";
            case 1177:
                return "GroupSellCategory";
            case 1178:
                return "GroupSellConfig";
            case 1179:
                return "GroupSet";
            case 1180:
                return "GroupStaticLink";
            case 1181:
                return "GroupSubsCreatorMonetizationStatusInfo";
            case 1182:
                return "GroupSupportFacebookMessage";
            case 1183:
                return "GroupSupportIssue";
            case 1184:
                return "GroupSupportThread";
            case 1185:
                return "GroupSupportUserMessage";
            case 1186:
                return "GroupTopStoriesFeedUnit";
            case 1187:
                return "GroupUserInvite";
            case 1188:
                return "GroupVoterRegistrationDrive";
            case 1189:
                return "GroupsInboxSectionFooterUnit";
            case 1190:
                return "GroupsInboxSectionHeaderUnit";
            case 1191:
                return "GroupsProfileLinkUnit";
            case 1192:
                return "GroupsSectionHeaderUnit";
            case 1193:
                return "GroupsTabUnitData";
            case 1194:
                return "HackerCupClarificationRequest";
            case 1195:
                return "HackerCupClarificationRequestMessage";
            case 1196:
                return "HackerCupClarificationRequestMessageAttachment";
            case 1197:
                return "HackerCupParticipant";
            case 1198:
                return "HackerCupProblem";
            case 1199:
                return "HackerCupProblemData";
            case 1200:
                return "HackerCupRound";
            case 1201:
                return "HackerCupSubmission";
            case 1202:
                return "HaloAnnotator";
            case 1203:
                return "HaloDerivedItem";
            case 1204:
                return "HaloEverstoreItem";
            case 1205:
                return "HaloItemAttachmentCommon";
            case 1206:
                return "HaloProject";
            case 1207:
                return "HaloQueueAssignment";
            case 1208:
                return "HaloViewpointsJob";
            case 1209:
                return "HaloViewpointsQueue";
            case 1210:
                return "HaloViewpointsResponse";
            case 1211:
                return "HaloViewpointsTask";
            case 1212:
                return "Hashtag";
            case 1213:
                return "HealthGroupContextualProfile";
            case 1214:
                return "HelpCommunityAnswer";
            case 1215:
                return "HelpCommunityAnswerComment";
            case 1216:
                return "HelpCommunityQuestion";
            case 1217:
                return "HelpCommunityUserProfile";
            case 1218:
                return "Hobby";
            case 1219:
                return "HolidayCard";
            case 1220:
                return "HomeListing";
            case 1221:
                return "HomeServiceProvider";
            case 1222:
                return "HomeServiceQuote";
            case 1223:
                return "HomeServiceReview";
            case 1224:
                return "HorizonNuxUserData";
            case 1225:
                return "HorizonTransitionScreenContent";
            case 1226:
                return "HorizonUserBanInstance";
            case 1227:
                return "HorizonWorldStat";
            case 1228:
                return "HorizonWorldStatEntry";
            case 1229:
                return "HotspotEffect";
            case 1230:
                return "HotspotHelperSetting";
            case 1231:
                return "IDBlockBehavior";
            case 1232:
                return "IGArEffectActionSheet";
            case 1233:
                return "IGBusinessManagerGraph";
            case 1234:
                return "IGBusinessManagerGraphPoint";
            case 1235:
                return "IGDirectMailboxAccount";
            case 1236:
                return "IGEditorialProductCollection";
            case 1237:
                return "IGInstagramShopCollectionEligibility";
            case 1238:
                return "IGShoppingBulkUpdateSession";
            case 1239:
                return "IGShoppingCreatorsWhitelistBulkUpdateProductError";
            case 1240:
                return "IGShoppingHighlightedProductsBulkUpdateProductError";
            case 1241:
                return "IPCommunicationMessage";
            case 1242:
                return "ISP";
            case 1243:
                return "IceBreakerMessageAttachment";
            case 1244:
                return "Image";
            case 1245:
                return "ImbeStoryActor";
            case 1246:
                return "ImbeStoryBucket";
            case 1247:
                return "ImbeStoryPhoto";
            case 1248:
                return "ImbeStoryVideo";
            case 1249:
                return "ImpersonationAlert";
            case 1250:
                return "ImpersonationFeedback";
            case 1251:
                return "ImpersonationQuestionnaireFeedback";
            case 1252:
                return "ImpersonationVictimFeedback";
            case 1253:
                return "ImportIgProfilePicToPageResponsePayload";
            case 1254:
                return "ImpressionsSurfacesBreakdownConnection";
            case 1255:
                return "IncomingFriendRequestFeedUnit";
            case 1256:
                return "InlineStyleAtRange";
            case 1257:
                return "InsertResultBehavior";
            case 1258:
                return "InspirationsCustomFont";
            case 1259:
                return "InspirationsSticker";
            case 1260:
                return "InspirationsStickerAnimationAsset";
            case 1261:
                return "InspirationsStickerImageAsset";
            case 1262:
                return "InstagramAREffectContest";
            case 1263:
                return "InstagramAccountHashtagsImpressionsCount";
            case 1264:
                return "InstagramAccountHashtagsReachCount";
            case 1265:
                return "InstagramActionsBreakdownConnection";
            case 1266:
                return "InstagramActionsBreakdownEdge";
            case 1267:
                return "InstagramActivityInbox";
            case 1268:
                return "InstagramActivityStory";
            case 1269:
                return "InstagramBoostedPostsConnection";
            case 1270:
                return "InstagramBoostedPostsEdge";
            case 1271:
                return "InstagramBrandedContentAppealCreateResponsePayload";
            case 1272:
                return "InstagramBusinessImportPageMediaResponsePayload";
            case 1273:
                return "InstagramBusinessManager";
            case 1274:
                return "InstagramBusinessManagerAccountSummaryUnit";
            case 1275:
                return "InstagramBusinessManagerAccountUnit";
            case 1276:
                return "InstagramBusinessManagerFollowersUnit";
            case 1277:
                return "InstagramBusinessManagerMetricsGraphConnection";
            case 1278:
                return "InstagramBusinessManagerPromotionsSummaryConnection";
            case 1279:
                return "InstagramBusinessManagerPromotionsSummaryEdge";
            case 1280:
                return "InstagramBusinessManagerPromotionsUnit";
            case 1281:
                return "InstagramBusinessManagerStatus";
            case 1282:
                return "InstagramBusinessManagerStoriesConnection";
            case 1283:
                return "InstagramBusinessManagerStoriesEdge";
            case 1284:
                return "InstagramBusinessManagerStoriesSummaryConnection";
            case 1285:
                return "InstagramBusinessManagerStoriesSummaryEdge";
            case 1286:
                return "InstagramBusinessManagerStoriesUnit";
            case 1287:
                return "InstagramBusinessManagerTopPostsConnection";
            case 1288:
                return "InstagramBusinessManagerTopPostsEdge";
            case 1289:
                return "InstagramBusinessManagerTopPostsUnit";
            case 1290:
                return "InstagramBusinessProfile";
            case 1291:
                return "InstagramCameraAREffect";
            case 1292:
                return "InstagramCameraAREffectPreview";
            case 1293:
                return "InstagramCameraEffectsQueryBuilder";
            case 1294:
                return "InstagramCameraFormatsQueryBuilder";
            case 1295:
                return "InstagramCameraSpecificTrayQueryBuilder";
            case 1296:
                return "InstagramCanvasImage";
            case 1297:
                return "InstagramCanvasLinkAction";
            case 1298:
                return "InstagramCanvasProduct";
            case 1299:
                return "InstagramCanvasVideoVersion";
            case 1300:
                return "InstagramComment";
            case 1301:
                return "InstagramDirectQuery";
            case 1302:
                return "InstagramFollowStatusBreakdownConnection";
            case 1303:
                return "InstagramHashtag";
            case 1304:
                return "InstagramInlineInsightsError";
            case 1305:
                return "InstagramInlineInsightsMetric";
            case 1306:
                return "InstagramInlineInsightsNode";
            case 1307:
                return "InstagramInsightsFollowsWithMediaAttribution";
            case 1308:
                return "InstagramInsightsMetric";
            case 1309:
                return "InstagramInsightsMetricOrganicResult";
            case 1310:
                return "InstagramInsightsMetricTotalResult";
            case 1311:
                return "InstagramInsightsProfileVisitsWithMediaAttribution";
            case 1312:
                return "InstagramInsightsVideoViewCount";
            case 1313:
                return "InstagramMedia";
            case 1314:
                return "InstagramMediaHashtagStickerNode";
            case 1315:
                return "InstagramMediaHashtagsImpressionsConnection";
            case 1316:
                return "InstagramMediaHashtagsImpressionsCount";
            case 1317:
                return "InstagramMediaImpressionsCount";
            case 1318:
                return "InstagramMediaMentionNode";
            case 1319:
                return "InstagramMediaMentionedUser";
            case 1320:
                return "InstagramMediaPeopleBasedReachCount";
            case 1321:
                return "InstagramMediaProductItemStickerNode";
            case 1322:
                return "InstagramMediaReachCount";
            case 1323:
                return "InstagramMediaShareBreakdownConnection";
            case 1324:
                return "InstagramMediaShareWithShareTypeAttribution";
            case 1325:
                return "InstagramMediaTaggedLocationNode";
            case 1326:
                return "InstagramMediaTagsInsights";
            case 1327:
                return "InstagramMediaV2";
            case 1328:
                return "InstagramMessageInbox";
            case 1329:
                return "InstagramMessageThread";
            case 1330:
                return "InstagramMessageThreadItem";
            case 1331:
                return "InstagramMessagingUser";
            case 1332:
                return "InstagramMetricRangeDelta";
            case 1333:
                return "InstagramProductInsightsMetric";
            case 1334:
                return "InstagramProductInsightsNode";
            case 1335:
                return "InstagramProfileActionsWithMediaAttribution";
            case 1336:
                return "InstagramShoppingMediaNode";
            case 1337:
                return "InstagramShoppingMediaOwnerNode";
            case 1338:
                return "InstagramShoppingProductInsights";
            case 1339:
                return "InstagramShoppingProductNode";
            case 1340:
                return "InstagramStickyPromoteRecord";
            case 1341:
                return "InstagramUser";
            case 1342:
                return "InstagramUserV2";
            case 1343:
                return "InstantApplication";
            case 1344:
                return "InstantApplicationContextToken";
            case 1345:
                return "InstantApplicationUserScope";
            case 1346:
                return "InstantArticle";
            case 1347:
                return "InstantArticleAppInstallSubscriptionOption";
            case 1348:
                return "InstantArticleBatchAdsElement";
            case 1349:
                return "InstantArticleCarouselNativeAd";
            case 1350:
                return "InstantArticleDonationOption";
            case 1351:
                return "InstantArticleFreeTrialSubscriptionOption";
            case 1352:
                return "InstantArticleNTCarouselItem";
            case 1353:
                return "InstantArticlePageFollowSubscriptionOption";
            case 1354:
                return "InstantArticleRecircAdElement";
            case 1355:
                return "InstantArticleSubscriptionOption";
            case 1356:
                return "InstantArticleSubscriptionUserAction";
            case 1357:
                return "InstantArticleVersion";
            case 1358:
                return "InstantArticleWebViewAdReporting";
            case 1359:
                return "InstantArticlesUserPublisherContext";
            case 1360:
                return "InstantExperiencesAutofillAddress";
            case 1361:
                return "InstantExperiencesAutofillData";
            case 1362:
                return "InstantExperiencesAutofillEmail";
            case 1363:
                return "InstantExperiencesAutofillName";
            case 1364:
                return "InstantExperiencesAutofillPhone";
            case 1365:
                return "InstantExperiencesCredentialDomain";
            case 1366:
                return "InstantExperiencesOrder";
            case 1367:
                return "InstantExperiencesSetting";
            case 1368:
                return "InstantGameActivity";
            case 1369:
                return "InstantGameBusiness";
            case 1370:
                return "InstantGameFeedbackMetadata";
            case 1371:
                return "InstantGameGroupChallenge";
            case 1372:
                return "InstantGameLeaderboard";
            case 1373:
                return "InstantGameLiveGamingEventCreatedUpdate";
            case 1374:
                return "InstantGameQuestScoreBased";
            case 1375:
                return "InstantGameQuestScoreBasedRecord";
            case 1376:
                return "InstantGameRating";
            case 1377:
                return "InstantGameSavedHighlight";
            case 1378:
                return "InstantGameShareableLink";
            case 1379:
                return "InstantGameUpdateMessage";
            case 1380:
                return "InstantGamesLeaderboardUpdateStoryAttachment";
            case 1381:
                return "InstantGamesMatchPlayersQueue";
            case 1382:
                return "InstantGamesOfflineMatch";
            case 1383:
                return "InstantShoppingCatalog";
            case 1384:
                return "InstantShoppingDocument";
            case 1385:
                return "InstantShoppingDocumentAnalyticsElement";
            case 1386:
                return "InstantShoppingDocumentButtonElement";
            case 1387:
                return "InstantShoppingDocumentElement";
            case 1388:
                return "InstantShoppingDocumentElementDescriptor";
            case 1389:
                return "InstantShoppingDocumentFooterElement";
            case 1390:
                return "InstantShoppingDocumentHeaderElement";
            case 1391:
                return "InstantShoppingDocumentPhotoElement";
            case 1392:
                return "InstantShoppingDocumentSlideshowElement";
            case 1393:
                return "InstantShoppingDocumentTextElement";
            case 1394:
                return "InstantShoppingDocumentVideoElement";
            case 1395:
                return "InstantShoppingElementTextDescriptor";
            case 1396:
                return "InstructionalAnimation";
            case 1397:
                return "IntegrityPreference";
            case 1398:
                return "IntellectualPropertyReportRequest";
            case 1399:
                return "Interactive360";
            case 1400:
                return "InteractiveEffectMetadata";
            case 1401:
                return "InteractiveOverlaySingle";
            case 1402:
                return "InterestTappableHeader";
            case 1403:
                return "InternElectionMetadata";
            case 1404:
                return "InternalSMAEditorSnapshot";
            case 1405:
                return "InternationalElectionReminder";
            case 1406:
                return "InterviewThankYouNote";
            case 1407:
                return "IntlCMSSegmentNew";
            case 1408:
                return "IntlComment";
            case 1409:
                return "IntlContentCommentGroup";
            case 1410:
                return "IntlContentStrategyString";
            case 1411:
                return "IntlEditedString";
            case 1412:
                return "IntlRlxPerDeviceSwitch";
            case 1413:
                return "IntlSourceString";
            case 1414:
                return "IntlTranslationScreenshot";
            case 1415:
                return "IntlTranslationScreenshotProject";
            case 1416:
                return "IntlVendor";
            case 1417:
                return "InvoiceAutoPaymentConfig";
            case 1418:
                return "IterativeSplitTestConfig";
            case 1419:
                return "JobApplicantInfo";
            case 1420:
                return "JobApplication";
            case 1421:
                return "JobBrowserAdStory";
            case 1422:
                return "JobOpening";
            case 1423:
                return "JobSearch";
            case 1424:
                return "JobSubscription";
            case 1425:
                return "JobTag";
            case 1426:
                return "JobTaxonomy";
            case 1427:
                return "JobTaxonomyGroup";
            case 1428:
                return "JobsCertificationExperience";
            case 1429:
                return "JobsCustomQuestion";
            case 1430:
                return "JobsCustomResponse";
            case 1431:
                return "JobsEducationExperience";
            case 1432:
                return "JobsResume";
            case 1433:
                return "JobsWorkExperience";
            case 1434:
                return "JoinGroupCTA";
            case 1435:
                return "JoinableVideoChatsAvailabilitySettings";
            case 1436:
                return "KBBMake";
            case 1437:
                return "KGAlbumNode";
            case 1438:
                return "KGMovieNode";
            case 1439:
                return "KGPersonNode";
            case 1440:
                return "KGTvShowNode";
            case 1441:
                return "KnowledgeNote";
            case 1442:
                return "KnowledgeNoteVersion";
            case 1443:
                return "KototoroBadgeUsage";
            case 1444:
                return "KototoroChallenge";
            case 1445:
                return "KototoroChallengeWinner";
            case 1446:
                return "KototoroContainer";
            case 1447:
                return "KototoroDailyNotification";
            case 1448:
                return "KototoroGifUsage";
            case 1449:
                return "KototoroTemplate";
            case 1450:
                return "KototoroTemplateClip";
            case 1451:
                return "KototoroTemplateClipUsage";
            case 1452:
                return "KototoroTemplateUsage";
            case 1453:
                return "KototoroUser";
            case 1454:
                return "KototoroVideoUploadMetadata";
            case 1455:
                return "LDPAppConfig";
            case 1456:
                return "LDPAppInstance";
            case 1457:
                return "LDPAppPageInstall";
            case 1458:
                return "LDPAppSettings";
            case 1459:
                return "LEDListFeedUnit";
            case 1460:
                return "LEDRecommendedPlaceFeedObject";
            case 1461:
                return "LangtechOntologyEntityType";
            case 1462:
                return "LangtechOntologyIntentSchema";
            case 1463:
                return "LangtechOntologyPropertySchema";
            case 1464:
                return "LangtechOntologyTypeSchema";
            case 1465:
                return "LaserTierQueryExactMatchRuleInput";
            case 1466:
                return "LassoAREffectUsage";
            case 1467:
                return "LassoAudioAssetUsage";
            case 1468:
                return "LeadGenContextPage";
            case 1469:
                return "LeadGenData";
            case 1470:
                return "LeadGenDeepLinkData";
            case 1471:
                return "LeadGenDeepLinkUserInfoCreateResponsePayload";
            case 1472:
                return "LeadGenDeepLinkUserStatus";
            case 1473:
                return "LeadGenDependentQuestionDynamicInfo";
            case 1474:
                return "LeadGenDependentQuestionStaticInfo";
            case 1475:
                return "LeadGenErrorNode";
            case 1476:
                return "LeadGenInfoFieldData";
            case 1477:
                return "LeadGenLegalContent";
            case 1478:
                return "LeadGenLegalContentCheckbox";
            case 1479:
                return "LeadGenPostSubmissionCheckConfig";
            case 1480:
                return "LeadGenPostSubmissionCheckResult";
            case 1481:
                return "LeadGenPreScreenDecisionState";
            case 1482:
                return "LeadGenQualityAdUnit";
            case 1483:
                return "LeadGenQuestion";
            case 1484:
                return "LeadGenQuestionValidationSpec";
            case 1485:
                return "LeadGenThankYouPage";
            case 1486:
                return "LeadGenUserStatus";
            case 1487:
                return "LeadNotificationConfig";
            case 1488:
                return "LeadOpportunity";
            case 1489:
                return "LeadQuestionAnswerPair";
            case 1490:
                return "LearningCourseInfo";
            case 1491:
                return "LearningCourseModule";
            case 1492:
                return "LearningCourseUnit";
            case 1493:
                return "LegalApplication";
            case 1494:
                return "LegalFMElementProp";
            case 1495:
                return "LegalFMElementRule";
            case 1496:
                return "LegalFMElementRuleSet";
            case 1497:
                return "LegalFMField";
            case 1498:
                return "LegalFMOption";
            case 1499:
                return "LegalFMSection";
            case 1500:
                return "LegalFMTemplate";
            case 1501:
                return "LegalMatter";
            case 1502:
                return "LegalMatterActivity";
            case 1503:
                return "LegalMatterContact";
            case 1504:
                return "LegalMatterContactVersion";
            case 1505:
                return "LegalMatterDocument";
            case 1506:
                return "LegalMatterDocumentActivity";
            case 1507:
                return "LegalMatterDocumentFolder";
            case 1508:
                return "LegalMatterDocumentFolderVersion";
            case 1509:
                return "LegalMatterEntity";
            case 1510:
                return "LegalMatterEntityVersion";
            case 1511:
                return "LegalMatterExternalCase";
            case 1512:
                return "LegalMatterFinancialImpact";
            case 1513:
                return "LegalMatterFinancialImpactActivity";
            case 1514:
                return "LegalMatterFinancialImpactVersion";
            case 1515:
                return "LegalMatterKeyDate";
            case 1516:
                return "LegalMatterKeyDateActivity";
            case 1517:
                return "LegalMatterMatterLink";
            case 1518:
                return "LegalMatterNarrative";
            case 1519:
                return "LegalMatterNarrativeActivity";
            case 1520:
                return "LegalMatterOutsideCounselDiversity";
            case 1521:
                return "LegalMatterOutsideCounselDiversityVersion";
            case 1522:
                return "LegalMatterPartner";
            case 1523:
                return "LegalMatterPartnerAddress";
            case 1524:
                return "LegalMatterPartyActivity";
            case 1525:
                return "LegalMatterRelatedMatterActivity";
            case 1526:
                return "LegalMatterTagActivity";
            case 1527:
                return "LegalMatterTeam";
            case 1528:
                return "LegalMatterVersion";
            case 1529:
                return "LegalPermissionActionData";
            case 1530:
                return "LegalPermissionGrant";
            case 1531:
                return "LegalPermissionRole";
            case 1532:
                return "LegalSavedView";
            case 1533:
                return "LegalTag";
            case 1534:
                return "LegoProdAttachment";
            case 1535:
                return "LeonTakedownFeedback";
            case 1536:
                return "LetterboxActor";
            case 1537:
                return "LetterboxBusinessLink";
            case 1538:
                return "LetterboxBusinessUnit";
            case 1539:
                return "LetterboxDocument";
            case 1540:
                return "LetterboxDocumentGroup";
            case 1541:
                return "LetterboxEDIFileConfigFields";
            case 1542:
                return "LetterboxEncryptionConfig";
            case 1543:
                return "LetterboxFileConfig";
            case 1544:
                return "LetterboxProcessingSession";
            case 1545:
                return "LetterboxProcessingStep";
            case 1546:
                return "LetterboxSFTPActorConfig";
            case 1547:
                return "LetterboxSWIFTActorConfig";
            case 1548:
                return "LetterboxSWIFTConfig";
            case 1549:
                return "LetterboxTradingPartner";
            case 1550:
                return "LifeEventExperience";
            case 1551:
                return "LightweightAction";
            case 1552:
                return "LinkedGroupMetadata";
            case 1553:
                return "LiveAdBreaksCreator";
            case 1554:
                return "LiveChallenge";
            case 1555:
                return "LiveChallengeChannel";
            case 1556:
                return "LiveChatCustomizationConfig";
            case 1557:
                return "LiveChatOnlyPerson";
            case 1558:
                return "LiveClippingAndHighlightsSettings";
            case 1559:
                return "LiveLinearVideoChannel";
            case 1560:
                return "LiveLinearVideoChannelContentItem";
            case 1561:
                return "LiveSellerPolicyAgreement";
            case 1562:
                return "LiveTemplateLiveSticker";
            case 1563:
                return "LiveVCEvent";
            case 1564:
                return "LiveVideoAssignedRole";
            case 1565:
                return "LiveVideoChainingFeedUnit";
            case 1566:
                return "LiveVideoChatbotPersona";
            case 1567:
                return "LiveVideoChatbotSettings";
            case 1568:
                return "LiveVideoCustomChatCommand";
            case 1569:
                return "LiveVideoError";
            case 1570:
                return "LiveVideoInputStream";
            case 1571:
                return "LiveVideoPoll";
            case 1572:
                return "LiveVideoPollResultCard";
            case 1573:
                return "LiveVideoPollVotingCard";
            case 1574:
                return "LiveVideoPromoteLinkAlert";
            case 1575:
                return "LiveVideoQuickCommentConfig";
            case 1576:
                return "LiveVideoTimedChatCommand";
            case 1577:
                return "LivingRoomContentItem";
            case 1578:
                return "LivingRoomPlaylist";
            case 1579:
                return "LivingRoomPoll";
            case 1580:
                return "LivingRoomPollOption";
            case 1581:
                return "LivingRoomSession";
            case 1582:
                return "LivingRoomSuggestedContentItem";
            case 1583:
                return "LocalCommunity";
            case 1584:
                return "LocalCommunityMember";
            case 1585:
                return "LocalCommunityPet";
            case 1586:
                return "LocalCommunityPost";
            case 1587:
                return "LocalCommunityProfile";
            case 1588:
                return "LocalContextShareLinkTarget";
            case 1589:
                return "LocalElection";
            case 1590:
                return "LocalExploreFeedUnit";
            case 1591:
                return "LocalTriggerCategoriesFeedUnit";
            case 1592:
                return "LocalTriggerPlacesFeedUnit";
            case 1593:
                return "LocationHistoryTimelineConnection";
            case 1594:
                return "LocationHistoryTimelineEdge";
            case 1595:
                return "LocationHistoryTimelineMutationResponsePayload";
            case 1596:
                return "LocationHistoryTimelinePlace";
            case 1597:
                return "LocationParty";
            case 1598:
                return "LocationSettingsUpdateResponsePayload";
            case 1599:
                return "LocationShare";
            case 1600:
                return "LocationSharing";
            case 1601:
                return "LocationSubscriber";
            case 1602:
                return "LocationUpdateResponsePayload";
            case 1603:
                return "LoggedOutUser";
            case 1604:
                return "LoyaltyAddPointsActionQRCode";
            case 1605:
                return "LoyaltyAddPointsActionStaticQRCodeSet";
            case 1606:
                return "LoyaltyCard";
            case 1607:
                return "LoyaltyCardEvent";
            case 1608:
                return "LoyaltyCardExternalInfo";
            case 1609:
                return "LoyaltyMessageForProgramHistory";
            case 1610:
                return "LoyaltyMessageInCustomerFeed";
            case 1611:
                return "LoyaltyOneTimeRewardCampaign";
            case 1612:
                return "LoyaltyProgram";
            case 1613:
                return "LoyaltyProgramAdminTemporaryContact";
            case 1614:
                return "LoyaltyReward";
            case 1615:
                return "LoyaltyRewardByPunchCardRule";
            case 1616:
                return "LoyaltyStore";
            case 1617:
                return "LoyaltyUnlinkedPhoneNumberUser";
            case 1618:
                return "LoyaltyUser";
            case 1619:
                return "LoyaltyWelcomeBonus";
            case 1620:
                return "LumosOnDeviceDeployedModel";
            case 1621:
                return "LumosPrivacyInfo";
            case 1622:
                return "MABBenchmarkConfig";
            case 1623:
                return "MBILandingScreen";
            case 1624:
                return "MBTCorrespondanceSupportInbox";
            case 1625:
                return "MBirthdayReminderAttachment";
            case 1626:
                return "MCMobileCarrier";
            case 1627:
                return "MCOMShipment";
            case 1628:
                return "MESAppealMutationResponseData";
            case 1629:
                return "MLEXFeedbackIssue";
            case 1630:
                return "MPPExternalCase";
            case 1631:
                return "MPPLegalUpdateActionLog";
            case 1632:
                return "MPPPermissionGroup";
            case 1633:
                return "MPersonalRemindersList";
            case 1634:
                return "MSPAdsCouponPreference";
            case 1635:
                return "MSPNotification";
            case 1636:
                return "MagmaPartner";
            case 1637:
                return "MailingAddress";
            case 1638:
                return "MailingAddressBackedAutofillAddress";
            case 1639:
                return "MalwareFamily";
            case 1640:
                return "ManagedAsyncExecutionContext";
            case 1641:
                return "ManagedMediaGroup";
            case 1642:
                return "ManagedMediaGroupImage";
            case 1643:
                return "ManagedMerchantAccount";
            case 1644:
                return "ManagedStripeAccount";
            case 1645:
                return "ManagedStripeVerificationFlow";
            case 1646:
                return "ManualFactCheck";
            case 1647:
                return "MarketingPlan";
            case ReactTextInputManager.IME_ACTION_ID:
                return "MarketingSolutionProvider";
            case 1649:
                return "Marketplace";
            case 1650:
                return "MarketplaceAccessRestoredFeedback";
            case 1651:
                return "MarketplaceAdsProductDetailsPage";
            case 1652:
                return "MarketplaceAttributeType";
            case 1653:
                return "MarketplaceBillboardUserActions";
            case 1654:
                return "MarketplaceBotUserProfile";
            case 1655:
                return "MarketplaceBuySellGroupCommercePolicy";
            case 1656:
                return "MarketplaceBuySellGroupItemProductDetailsPage";
            case 1657:
                return "MarketplaceBuyerTXNReportingCategory";
            case 1658:
                return "MarketplaceC2CReview";
            case 1659:
                return "MarketplaceCommercePostProductDetailsPage";
            case 1660:
                return "MarketplaceContinueShoppingViewTimesCounter";
            case 1661:
                return "MarketplaceConversation";
            case 1662:
                return "MarketplaceCuratedDeal";
            case 1663:
                return "MarketplaceDealsPillterConfig";
            case 1664:
                return "MarketplaceDynamicAdMoreItemsProductDetail";
            case 1665:
                return "MarketplaceDynamicAdProductDetailsPage";
            case 1666:
                return "MarketplaceDynamicAdWithOffsiteCheckoutProductDetailsPage";
            case 1667:
                return "MarketplaceECommMiniProductDetailsPage";
            case 1668:
                return "MarketplaceECommPartnerRollout";
            case 1669:
                return "MarketplaceECommPost";
            case 1670:
                return "MarketplaceEcommAudience";
            case 1671:
                return "MarketplaceEcommEmailSubscription";
            case 1672:
                return "MarketplaceEcommFollowedFOMOCategory";
            case 1673:
                return "MarketplaceEcommFollowedKeyword";
            case 1674:
                return "MarketplaceEcommProductPollOption";
            case 1675:
                return "MarketplaceEcommSubscription";
            case 1676:
                return "MarketplaceFBPageInfoProductDetail";
            case 1677:
                return "MarketplaceFeedAdStory";
            case 1678:
                return "MarketplaceFeedAdUpsellStory";
            case 1679:
                return "MarketplaceFeedAutosRecentlyViewedUnit";
            case 1680:
                return "MarketplaceFeedBillboardPromotionUnit";
            case 1681:
                return "MarketplaceFeedBoostedC2CPostListStory";
            case 1682:
                return "MarketplaceFeedBoostedListingUpsellStory";
            case 1683:
                return "MarketplaceFeedBudgetUpsellStory";
            case 1684:
                return "MarketplaceFeedBuyAndSellGroupDiscoveryStory";
            case 1685:
                return "MarketplaceFeedBuyAndSellGroupForSalePostStory";
            case 1686:
                return "MarketplaceFeedBuyAndSellGroupSuggestedFromGroupStory";
            case 1687:
                return "MarketplaceFeedCategoryUnit";
            case 1688:
                return "MarketplaceFeedComposerStory";
            case 1689:
                return "MarketplaceFeedDealsProductStory";
            case 1690:
                return "MarketplaceFeedForSalePostStory";
            case 1691:
                return "MarketplaceFeedForSaleUnit";
            case 1692:
                return "MarketplaceFeedFullWidthStaticThemeUpsellStory";
            case 1693:
                return "MarketplaceFeedFuzzyFilterListingStory";
            case 1694:
                return "MarketplaceFeedGeneralListing";
            case 1695:
                return "MarketplaceFeedGeneralUnit";
            case 1696:
                return "MarketplaceFeedGeneralVideoUnitObject";
            case 1697:
                return "MarketplaceFeedHomeServicePremadeQuoteStory";
            case 1698:
                return "MarketplaceFeedInactiveSearchUsersContinueShoppingUnit";
            case 1699:
                return "MarketplaceFeedJobsListStory";
            case 1700:
                return "MarketplaceFeedListingStory";
            case 1701:
                return "MarketplaceFeedLiveShoppingVideosUpsellStory";
            case 1702:
                return "MarketplaceFeedManageYourListingsStory";
            case 1703:
                return "MarketplaceFeedMegaphoneStory";
            case 1704:
                return "MarketplaceFeedMotorsIntentSurveyUnit";
            case 1705:
                return "MarketplaceFeedMoviesListStory";
            case 1706:
                return "MarketplaceFeedNotificationNonProductUpsellStory";
            case 1707:
                return "MarketplaceFeedNotificationProductItemUpsellStory";
            case 1708:
                return "MarketplaceFeedProductPreferenceBinaryDecisionUnitObject";
            case 1709:
                return "MarketplaceFeedProductPreferenceUnitDeprecated";
            case 1710:
                return "MarketplaceFeedRecentSingleSearchUnit";
            case 1711:
                return "MarketplaceFeedRecentlyPostedUnit";
            case 1712:
                return "MarketplaceFeedRelatedToRecentlyViewedUnit";
            case 1713:
                return "MarketplaceFeedRentalMapClusterStory";
            case 1714:
                return "MarketplaceFeedRentalMapFastPinStory";
            case 1715:
                return "MarketplaceFeedRentalsUnit";
            case 1716:
                return "MarketplaceFeedSalesPromoStory";
            case 1717:
                return "MarketplaceFeedSavedSearchUnit";
            case 1718:
                return "MarketplaceFeedServiceProviderStory";
            case 1719:
                return "MarketplaceFeedServicesMerchUnits";
            case 1720:
                return "MarketplaceFeedShopProductStory";
            case 1721:
                return "MarketplaceFeedShopStory";
            case 1722:
                return "MarketplaceFeedShopsUpsellStory";
            case 1723:
                return "MarketplaceFeedSimilarToEngagedHScrollUnit";
            case 1724:
                return "MarketplaceFeedTopPicksUnit";
            case 1725:
                return "MarketplaceFeedTopSearchesUpsellStory";
            case 1726:
                return "MarketplaceFeedUnitUserPreference";
            case 1727:
                return "MarketplaceFeedUpsellStory";
            case 1728:
                return "MarketplaceFeedVideoStory";
            case 1729:
                return "MarketplaceFeedVisualNotificationUpsellStory";
            case 1730:
                return "MarketplaceFollowableTheme";
            case 1731:
                return "MarketplaceForSaleItemProductDetailsPage";
            case 1732:
                return "MarketplaceGenericProductDetail";
            case 1733:
                return "MarketplaceGroupBuyInvitation";
            case 1734:
                return "MarketplaceGroupPurchase";
            case 1735:
                return "MarketplaceHashtag";
            case 1736:
                return "MarketplaceHashtagCategoryMetadata";
            case 1737:
                return "MarketplaceHelpCenterArticle";
            case 1738:
                return "MarketplaceHomeServicePremadeQuote";
            case 1739:
                return "MarketplaceInactiveSearchUsersUpsellCounter";
            case 1740:
                return "MarketplaceInterestAction";
            case 1741:
                return "MarketplaceItemBasedRecommendationUnit";
            case 1742:
                return "MarketplaceItemShippingOrder";
            case 1743:
                return "MarketplaceListingOffer";
            case 1744:
                return "MarketplaceListingSuggestion";
            case 1745:
                return "MarketplaceLocalSale";
            case 1746:
                return "MarketplaceLocationSettings";
            case 1747:
                return "MarketplaceMarketingImagesProductDetail";
            case 1748:
                return "MarketplaceMeetingPlan";
            case 1749:
                return "MarketplaceMerchandisingProductSort";
            case 1750:
                return "MarketplaceMiniShopProductDetailsPage";
            case 1751:
                return "MarketplaceMoreBuyingOptionsProductDetail";
            case 1752:
                return "MarketplaceMotorsPrivateSellerBusinessInformation";
            case 1753:
                return "MarketplaceMotorsSingleVehicleEntityPageInformationStory";
            case 1754:
                return "MarketplaceMotorsVehicleEntityPageRecommendationStory";
            case 1755:
                return "MarketplaceOffer";
            case 1756:
                return "MarketplacePandemicProductDetail";
            case 1757:
                return "MarketplacePartnerPromotion";
            case 1758:
                return "MarketplacePartnerPromotionNotificationMessage";
            case 1759:
                return "MarketplacePaymentProvider";
            case 1760:
                return "MarketplacePhotosProductDetail";
            case 1761:
                return "MarketplacePivotAdsRelatedItemsProductDetail";
            case 1762:
                return "MarketplacePost";
            case 1763:
                return "MarketplacePrimaryActionsProductDetail";
            case 1764:
                return "MarketplaceProductReferralSession";
            case 1765:
                return "MarketplaceProductTagProductDetail";
            case 1766:
                return "MarketplaceProviderExternalCase";
            case 1767:
                return "MarketplaceQuickPromotionProductDetail";
            case 1768:
                return "MarketplaceRating";
            case 1769:
                return "MarketplaceRealEstatePrivateSellerBusinessInformation";
            case 1770:
                return "MarketplaceRealEstateProductDetailsPage";
            case 1771:
                return "MarketplaceRecommendationProductDetail";
            case 1772:
                return "MarketplaceRelatedAdsProductDetail";
            case 1773:
                return "MarketplaceRelatedItemsProductDetail";
            case 1774:
                return "MarketplaceSavedSearch";
            case 1775:
                return "MarketplaceSearchFeedB2CUnit";
            case 1776:
                return "MarketplaceSearchFeedBannerQP";
            case 1777:
                return "MarketplaceSearchFeedCategoryList";
            case 1778:
                return "MarketplaceSearchFeedCorrectedQuery";
            case 1779:
                return "MarketplaceSearchFeedEndOfResults";
            case 1780:
                return "MarketplaceSearchFeedFilter";
            case 1781:
                return "MarketplaceSearchFeedFilterBar";
            case 1782:
                return "MarketplaceSearchFeedFilterData";
            case 1783:
                return "MarketplaceSearchFeedHeader";
            case 1784:
                return "MarketplaceSearchFeedNoResults";
            case 1785:
                return "MarketplaceSearchFeedResultHeader";
            case 1786:
                return "MarketplaceSearchFeedSavedSearch";
            case 1787:
                return "MarketplaceSearchFeedSuggestionPivot";
            case 1788:
                return "MarketplaceSearchFeedThemeBannerQP";
            case 1789:
                return "MarketplaceSearchFeedThemeQP";
            case 1790:
                return "MarketplaceSearchQuickPromotion";
            case 1791:
                return "MarketplaceSearchQuickPromotionTheme";
            case 1792:
                return "MarketplaceSearchRefineSearchFeedUnit";
            case 1793:
                return "MarketplaceSearchRelatedSearchFeedUnit";
            case 1794:
                return "MarketplaceSellerInfoProductDetail";
            case 1795:
                return "MarketplaceSellerOrderAppealStatusDetail";
            case 1796:
                return "MarketplaceSellerOrderBuyerDetail";
            case 1797:
                return "MarketplaceSellerOrderDetailsPageBase";
            case 1798:
                return "MarketplaceSellerOrderHelpDetail";
            case 1799:
                return "MarketplaceSellerOrderListingSummaryDetail";
            case 1800:
                return "MarketplaceSellerOrderPaymentDetail";
            case 1801:
                return "MarketplaceSellerOrderShippingAddressDetail";
            case 1802:
                return "MarketplaceSellerOrderStatusDetail";
            case 1803:
                return "MarketplaceSellerPolicyWarningFeedback";
            case 1804:
                return "MarketplaceServiceMessagingContext";
            case 1805:
                return "MarketplaceShop";
            case 1806:
                return "MarketplaceShopsPillterConfig";
            case 1807:
                return "MarketplaceShopsProductDetailsPage";
            case 1808:
                return "MarketplaceSimilarProductAlertProductDetail";
            case 1809:
                return "MarketplaceStructuredFieldsProductDetail";
            case 1810:
                return "MarketplaceThemeFollowProductDetail";
            case 1811:
                return "MarketplaceTicketedExperienceClusterProductDetailsPage";
            case 1812:
                return "MarketplaceTitlePriceProductDetail";
            case 1813:
                return "MarketplaceUserCampaignImpressionHistory";
            case 1814:
                return "MarketplaceUserLastAction";
            case 1815:
                return "MarketplaceUserProfile";
            case 1816:
                return "MarketplaceUserReportFeedback";
            case 1817:
                return "MarketplaceUserWhatsAppNumber";
            case 1818:
                return "MarketplaceVariantsProductDetail";
            case 1819:
                return "MarketplaceVehicleEntityPagePivotProductDetail";
            case 1820:
                return "MarketplaceVehicleProductDetailsPage";
            case 1821:
                return "MarketplaceVehicleSimilarModelsProductDetail";
            case 1822:
                return "MarketplaceVerticalPartner";
            case 1823:
                return "MarketplaceVerticalPartnerFeature";
            case 1824:
                return "MarketplaceVerticalsIngestionStatus";
            case 1825:
                return "MarketplaceWarningSuggestionsHeaderProductDetail";
            case 1826:
                return "Mask3DAsset";
            case 1827:
                return "MaskEffect";
            case 1828:
                return "MasterCustomPublisherBlockList";
            case 1829:
                return "MayaARAsset";
            case 1830:
                return "MayaBluetoothBeacon";
            case 1831:
                return "MayaPlanarTarget";
            case 1832:
                return "MayaPointCloud";
            case 1833:
                return "MayaPointCloudMetadata";
            case 1834:
                return "MayaStyleTransfer";
            case 1835:
                return "MeasurementPlayground";
            case 1836:
                return "MediaAttachmentMediaSet";
            case 1837:
                return "MediaContainerMediaSet";
            case 1838:
                return "MediaEffectCustomFontResource";
            case 1839:
                return "MediaEffectInstruction";
            case 1840:
                return "MediaEffectInstructionVariant";
            case 1841:
                return "MediaEffectPermissionConfig";
            case 1842:
                return "MediaEffectPermissionGroup";
            case 1843:
                return "MediaEffectPreviewVideo";
            case 1844:
                return "MediaEffectPreviewVideoThumbnail";
            case 1845:
                return "MediaEffectUsage";
            case 1846:
                return "MediaManagerExportInsightsCreatorStudioParameters";
            case 1847:
                return "MediaManagerExportInsightsManifoldData";
            case 1848:
                return "MediaManagerExportInsightsRun";
            case 1849:
                return "MediaQuestion";
            case 1850:
                return "MediaQuestionOption";
            case 1851:
                return "MediaUploadPreference";
            case 1852:
                return "MediaUploadedByUserMediaSet";
            case 1853:
                return "MemeCategory";
            case 1854:
                return "MemorializedUserInfo";
            case 1855:
                return "MentionsPrompt";
            case 1856:
                return "MentorshipApplication";
            case 1857:
                return "MentorshipApplicationProfile";
            case 1858:
                return "MentorshipCourse";
            case 1859:
                return "MentorshipCurriculum";
            case 1860:
                return "MentorshipCurriculumStep";
            case 1861:
                return "MentorshipMessengerCurriculumStep";
            case 1862:
                return "MentorshipMessengerDiscussionTopicSet";
            case 1863:
                return "MentorshipMessengerLeavePrompt";
            case 1864:
                return "MentorshipMessengerProgressTracker";
            case 1865:
                return "MentorshipMessengerReminder";
            case 1866:
                return "MentorshipMessengerSurvey";
            case 1867:
                return "MentorshipProgram";
            case 1868:
                return "MentorshipProgramCohort";
            case 1869:
                return "MentorshipTextAnswer";
            case 1870:
                return "MentorshipTextQuestion";
            case 1871:
                return "MentorshipTopic";
            case 1872:
                return "Menu";
            case 1873:
                return "MenuImage";
            case 1874:
                return "MerchantOnboardingForTHStatus";
            case 1875:
                return "MerchantReport";
            case 1876:
                return "MessageAnimatedImage";
            case 1877:
                return "MessageAudio";
            case 1878:
                return "MessageEphemeralImage";
            case 1879:
                return "MessageEphemeralVideo";
            case 1880:
                return "MessageFile";
            case 1881:
                return "MessageImage";
            case 1882:
                return "MessageLiveLocation";
            case 1883:
                return "MessageLocation";
            case 1884:
                return "MessageMultipleLocations";
            case 1885:
                return "MessagePointer";
            case 1886:
                return "MessageRecipientCustomization";
            case 1887:
                return "MessageSearchResult";
            case 1888:
                return "MessageSuperResolutionModel";
            case 1889:
                return "MessageThread";
            case 1890:
                return "MessageThreadCustomization";
            case 1891:
                return "MessageVideo";
            case 1892:
                return "MessagingPageAdminNotificationSettings";
            case 1893:
                return "MessagingParticipant";
            case 1894:
                return "MessengerAdsPartialAutomatedStepList";
            case 1895:
                return "MessengerApiFeePayment";
            case 1896:
                return "MessengerBusinessMessage";
            case 1897:
                return "MessengerBusinessOrderItem";
            case 1898:
                return "MessengerBusinessReportFeedback";
            case 1899:
                return "MessengerCall";
            case 1900:
                return "MessengerCallGuestUser";
            case 1901:
                return "MessengerCallInviteLink";
            case 1902:
                return "MessengerCallRoom";
            case 1903:
                return "MessengerCart";
            case 1904:
                return "MessengerCommercePayment";
            case 1905:
                return "MessengerCommerceProductSubscription";
            case 1906:
                return "MessengerContentBroadcastStation";
            case 1907:
                return "MessengerContentSubscription";
            case 1908:
                return "MessengerDestinationPageWelcomeMessage";
            case 1909:
                return "MessengerDrawerBuiltInElement";
            case 1910:
                return "MessengerEmojiFont";
            case 1911:
                return "MessengerEmojiStatus";
            case 1912:
                return "MessengerEventReminder";
            case 1913:
                return "MessengerFriendOneMetadata";
            case 1914:
                return "MessengerGameScoreSheet";
            case 1915:
                return "MessengerGeneralInviteLink";
            case 1916:
                return "MessengerGlobalCampusChat";
            case 1917:
                return "MessengerGlobalFBGroupChat";
            case 1918:
                return "MessengerGlobalGroupThread";
            case 1919:
                return "MessengerGlobalGroupThreadPublicMetadata";
            case 1920:
                return "MessengerGlobalLocalCommunityChat";
            case 1921:
                return "MessengerGroupInvite";
            case 1922:
                return "MessengerGroupLink";
            case 1923:
                return "MessengerInvite";
            case 1924:
                return "MessengerKidsAREffectActivityData";
            case 1925:
                return "MessengerLiveLocationNux";
            case 1926:
                return "MessengerLivingRoom";
            case 1927:
                return "MessengerMediaContentSetting";
            case 1928:
                return "MessengerMontageArtCategory";
            case 1929:
                return "MessengerMontageArtPickerSection";
            case 1930:
                return "MessengerMontageAudioAsset";
            case 1931:
                return "MessengerMontageEmojiAsset";
            case 1932:
                return "MessengerMontageFeaturedCamera";
            case 1933:
                return "MessengerMontageMaskEffect";
            case 1934:
                return "MessengerMontageMessageReaction";
            case 1935:
                return "MessengerMontageNuxMessage";
            case 1936:
                return "MessengerMontageParticleEffect";
            case 1937:
                return "MessengerMontageReactionWithAudio";
            case 1938:
                return "MessengerMontageShaderEffect";
            case 1939:
                return "MessengerMontageStyleTransferEffect";
            case 1940:
                return "MessengerPayTheme";
            case 1941:
                return "MessengerPayThemeAsset";
            case 1942:
                return "MessengerPlatformBotReview";
            case 1943:
                return "MessengerPlatformDirectoryImageBanner";
            case 1944:
                return "MessengerPlatformPersona";
            case 1945:
                return "MessengerReactionAsset";
            case 1946:
                return "MessengerReactionFont";
            case 1947:
                return "MessengerReactionPack";
            case 1948:
                return "MessengerReactionStaticAsset";
            case 1949:
                return "MessengerRetailCancellation";
            case 1950:
                return "MessengerRetailPromotion";
            case 1951:
                return "MessengerRetailReceipt";
            case 1952:
                return "MessengerRetailShipment";
            case 1953:
                return "MessengerRetailShipmentTrackingEvent";
            case 1954:
                return "MessengerRoomDefaultActivity";
            case 1955:
                return "MessengerRoomsCreationSuggestion";
            case 1956:
                return "MessengerSystemFolder";
            case 1957:
                return "MessengerThreadBackgroundAsset";
            case 1958:
                return "MessengerThreadThemeIconAsset";
            case 1959:
                return "MessengerUserLink";
            case 1960:
                return "MessengerViewer1To1Thread";
            case 1961:
                return "MessengerViewerCampusChat";
            case 1962:
                return "MessengerViewerFBGroupChat";
            case 1963:
                return "MessengerViewerGroupThread";
            case 1964:
                return "MessengerViewerLocalCommunityChat";
            case 1965:
                return "MessengerWelcomePageSetting";
            case 1966:
                return "Metapage";
            case 1967:
                return "MfsAgentCashInConfirmationUpdate";
            case 1968:
                return "MfsBBVACashOutInstructionAttachment";
            case 1969:
                return "MfsBCPCashOutInstructionAttachment";
            case 1970:
                return "MfsBDLNCashOutInstructionAttachment";
            case 1971:
                return "MfsBillPayCreatedAttachment";
            case 1972:
                return "MfsBillPayCreationUpdate";
            case 1973:
                return "MfsBillPayIntent";
            case 1974:
                return "MfsBillPayReferenceCodeAttachment";
            case 1975:
                return "MfsBillPayReferenceCodeUpdate";
            case 1976:
                return "MfsBillPayTransaction";
            case 1977:
                return "MfsBillPaymentConfirmationAttachment";
            case 1978:
                return "MfsCashInConfirmationAttachment";
            case 1979:
                return "MfsCashInInstructionAttachment";
            case 1980:
                return "MfsCashoutAttachment";
            case 1981:
                return "MfsIdvDebitCardConfirmationAttachment";
            case 1982:
                return "MfsP2PReceiveOptionsAttachment";
            case 1983:
                return "MfsP2PTransfer";
            case 1984:
                return "MfsPartner";
            case 1985:
                return "MfsPurchaseStatusAttachment";
            case 1986:
                return "MfsQRPaymentAttachment";
            case 1987:
                return "MfsSendToCodeAttachment";
            case 1988:
                return "MfsTimeSensitiveBalanceAttachment";
            case 1989:
                return "MiBGroupAnchor";
            case 1990:
                return "MiBGroupThreadMetaData";
            case 1991:
                return "MiBPageStoryAnchor";
            case 1992:
                return "MicroPulseQuestion";
            case 1993:
                return "MilanWorkout";
            case 1994:
                return "MiniShop";
            case 1995:
                return "MiniShopAllProductsModule";
            case 1996:
                return "MiniShopHScrollOfCollections";
            case 1997:
                return "MiniShopHeroTileModule";
            case 1998:
                return "MiniShopStorefront";
            case 1999:
                return "MiniShopStorefrontVersion";
            case CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS /*2000*/:
                return "MiniShopTheme";
            case 2001:
                return "MisinformationEvent";
            case 2002:
                return "MixedRealityWhiteboard";
            case 2003:
                return "MixerChannel";
            case 2004:
                return "MixerPartnerSubmission";
            case 2005:
                return "MixerUser";
            case 2006:
                return "MobileCP";
            case 2007:
                return "MobileCarrier";
            case 2008:
                return "MobileCarrierTosSignature";
            case 2009:
                return "MobileDevice";
            case 2010:
                return "MobileOEM";
            case 2011:
                return "MobilePartnerCustomAudience";
            case 2012:
                return "MobileStoreObject";
            case 2013:
                return "MobileTOSVersion";
            case 2014:
                return "MobileTopUpPaymentInvoice";
            case 2015:
                return "MobileWorksClient";
            case 2016:
                return "MobileWorksClientInformation";
            case 2017:
                return "MonetizationEnforcementCaseRecord";
            case 2018:
                return "MonetizationEnforcementViolation";
            case 2019:
                return "MoneyTransfer";
            case 2020:
                return "MontageDirect";
            case 2021:
                return "MontageEmojiLocale";
            case 2022:
                return "MontageMessage";
            case 2023:
                return "MontageStatus";
            case 2024:
                return "MontageSticker";
            case 2025:
                return "MontageStickerStyle";
            case 2026:
                return "MontageTextStyle";
            case 2027:
                return "MontageTextStyleColorSpecification";
            case 2028:
                return "MontageTextStyleGroup";
            case 2029:
                return "MontageThread";
            case 2030:
                return "MonthlyInvoicing";
            case 2031:
                return "MonthlyInvoicingApplication";
            case 2032:
                return "MorDonationCauseForCharitiesTransactionOrder";
            case 2033:
                return "MorDonationTransactionOrder";
            case 2034:
                return "MorDonationsMatchingConfirmationOrder";
            case 2035:
                return "MovieBotMovie";
            case 2036:
                return "MovieBotMovieList";
            case 2037:
                return "MovieBotMovieShowtimeList";
            case 2038:
                return "MovieBotTheater";
            case 2039:
                return "MovieFactoryMoodCategory";
            case 2040:
                return "MovieFactoryMoodConfig";
            case 2041:
                return "MovieFactoryMusicCutdown";
            case 2042:
                return "MovieFactoryVisualMoodConfig";
            case 2043:
                return "MovieLoyaltyAccount";
            case 2044:
                return "MultiAuthorStoryGroup";
            case 2045:
                return "MultiBackgroundIcon";
            case 2046:
                return "MultiLocationActivationConstraint";
            case 2047:
                return "MultiLocationCityConstraint";
            case 2048:
                return "MultiLocationCountryConstraint";
            case 2049:
                return "MultiPolygon";
            case 2050:
                return "MusicArtist";
            case 2051:
                return "MusicCharts";
            case 2052:
                return "MusicHomeEventPromotion";
            case 2053:
                return "MusicVideoHomeWrapper";
            case 2054:
                return "MusicVideoMetadata";
            case 2055:
                return "MusicWorkDocumentStore";
            case 2056:
                return "Musician";
            case 2057:
                return "NPEMemeTemplate";
            case 2058:
                return "NPEMemeUser";
            case 2059:
                return "NPPExternalCase";
            case 2060:
                return "NTFBLiteComposerState";
            case 2061:
                return "NTGroupsYouShouldJoinFeedUnit";
            case 2062:
                return "NTMarketplaceThemesToFollowFeedUnit";
            case 2063:
                return "NTPeopleYouMayKnowFeedUnit";
            case 2064:
                return "NamePronunciationProfileField";
            case 2065:
                return "NativeAPKArtifact";
            case 2066:
                return "NativeAndroidAppModuleArtifact";
            case 2067:
                return "NativeComponentFlowBookingRequest";
            case 2068:
                return "NativeDocumentNode";
            case 2069:
                return "NativeMask";
            case 2070:
                return "NearbyFriendsUserStatus";
            case 2071:
                return "NegativeFeedbackAction";
            case 2072:
                return "NegativeFeedbackDetailResponse";
            case 2073:
                return "NegativeFeedbackMessageAction";
            case 2074:
                return "NegativeFeedbackNTAction";
            case 2075:
                return "NegativeFeedbackRedirectAction";
            case 2076:
                return "NegativeFeedbackReportActionRequiringEvidence";
            case 2077:
                return "NegotiablePriceOffer";
            case 2078:
                return "NeoARGameBeaconStory";
            case 2079:
                return "NeoApprovedHolidayCard";
            case 2080:
                return "NeoApprovedUser";
            case 2081:
                return "NeoApprovedUserFeatureRequest";
            case 2082:
                return "NeoCameraBeaconStory";
            case 2083:
                return "NeoDrawGuessGameBeaconStory";
            case 2084:
                return "NeoEventInfo";
            case 2085:
                return "NeoFriendRequest";
            case 2086:
                return "NeoGlobalShepherdThread";
            case 2087:
                return "NeoInvite";
            case 2088:
                return "NeoShepherdGroupLink";
            case 2089:
                return "NeoStatusBeaconStory";
            case 2090:
                return "NeoUsername";
            case 2091:
                return "NestEgg";
            case 2092:
                return "NewsFeed";
            case 2093:
                return "NewsOCTAutoResolveSettings";
            case 2094:
                return "NewsPublisherApplication";
            case 2095:
                return "NewsQuizAnswer";
            case 2096:
                return "NewsQuizQuestion";
            case 2097:
                return "NewsQuizResult";
            case 2098:
                return "NewsStatus";
            case 2099:
                return "NextVendorTask";
            case 2100:
                return "NlpFeatureMatchRuleInput";
            case 2101:
                return "NlpSignalMatchRuleInput";
            case 2102:
                return "NmorBlackbaudRWRDonationTransactionOrder";
            case 2103:
                return "NmorChargeWithAsyncCredentialResponse";
            case 2104:
                return "NmorDonationP4CTransactionOrder";
            case 2105:
                return "NmorDonationP4PTransactionOrder";
            case 2106:
                return "NmorIncentivePayment";
            case 2107:
                return "NmorPPGFDonationPaymentOrder";
            case 2108:
                return "NmorPayment";
            case 2109:
                return "NmorProviderPayoutData";
            case 2110:
                return "NmorTwoCTwoPBankResponse";
            case 2111:
                return "NmorTwoCTwoPCashResponse";
            case 2112:
                return "Node";
            case 2113:
                return "NonResponsivePagesInbox";
            case 2114:
                return "Note";
            case 2115:
                return "Notification";
            case 2116:
                return "NotificationsDelta";
            case 2117:
                return "OLRBlockEvent";
            case 2118:
                return "OctopusRule";
            case 2119:
                return "OctopusRuleVersion";
            case 2120:
                return "OctopusRuleset";
            case 2121:
                return "OctopusRulesetVersion";
            case 2122:
                return "OculusPaymentInvoice";
            case 2123:
                return "OculusVirtualDesktopServer";
            case 2124:
                return "Offer";
            case 2125:
                return "OfferBotUserProfile";
            case 2126:
                return "OfferClaim";
            case 2127:
                return "OfferItem";
            case 2128:
                return "OfferUserSetting";
            case 2129:
                return "OfferView";
            case 2130:
                return "OfferViewShare";
            case 2131:
                return "OfferX";
            case 2132:
                return "OfferXClaim";
            case 2133:
                return "OmegaBankAccount";
            case 2134:
                return "OmegaCustomPgm";
            case 2135:
                return "OmegaCustomPgmParameter";
            case 2136:
                return "OmegaInvoice";
            case 2137:
                return "OmegaInvoiceRequest";
            case 2138:
                return "OmegaInvoicerRunCategoryDetail";
            case 2139:
                return "OmegaPeriod";
            case 2140:
                return "OmegaReceiptMethod";
            case 2141:
                return "OmniMFlow";
            case 2142:
                return "OneVCMeetingPublic";
            case 2143:
                return "OpenCellularExternalCase";
            case 2144:
                return "OpenCellularPartner";
            case 2145:
                return "OpenGraphAction";
            case 2146:
                return "OpenGraphObject";
            case 2147:
                return "OppEquipment";
            case 2148:
                return "OppError";
            case 2149:
                return "OppExperiment";
            case 2150:
                return "OppExternalCase";
            case 2151:
                return "OppFile";
            case 2152:
                return "OppGraph";
            case 2153:
                return "OppGraphChangeset";
            case 2154:
                return "OppInternalDataset";
            case 2155:
                return "OppPartner";
            case 2156:
                return "OppProject";
            case 2157:
                return "OppStepConfig";
            case 2158:
                return "OppStepSequence";
            case 2159:
                return "Organization";
            case 2160:
                return "OrigamiResearchSession";
            case 2161:
                return "OtherName";
            case 2162:
                return "OverlayAnimation";
            case 2163:
                return "OwnedDomain";
            case 2164:
                return "OxsightsAlert";
            case 2165:
                return "OxsightsAnnotation";
            case 2166:
                return "OxsightsCustomPolygonNIAlert";
            case 2167:
                return "OxsightsDeepLink";
            case 2168:
                return "OxsightsEmployeeAccessNotice";
            case 2169:
                return "OxsightsGoal";
            case 2170:
                return "OxsightsHighlightsAlertStory";
            case 2171:
                return "OxsightsHighlightsCustomPolygonNIAlertStory";
            case 2172:
                return "OxsightsHighlightsDynamicStory";
            case 2173:
                return "OxsightsHighlightsFeed";
            case 2174:
                return "OxsightsHighlightsPredictionStory";
            case 2175:
                return "OxsightsHighlightsSegmentAlertStory";
            case 2176:
                return "OxsightsHighlightsSitusPolygonNIAlertStory";
            case 2177:
                return "OxsightsHighlightsStory";
            case 2178:
                return "OxsightsHighlightsVideoStory";
            case 2179:
                return "OxsightsMSQueryInfo";
            case 2180:
                return "OxsightsMapsLegend";
            case 2181:
                return "OxsightsMapsLegendColorPalette";
            case 2182:
                return "OxsightsNIAlertRule";
            case 2183:
                return "OxsightsPartnerMetadata";
            case 2184:
                return "OxsightsPartnerUser";
            case 2185:
                return "OxsightsReportInfo";
            case 2186:
                return "OxsightsSegmentAlertRule";
            case 2187:
                return "OxsightsSiteEvent";
            case 2188:
                return "OxsightsSitusPolygonNIAlert";
            case 2189:
                return "OxsightsTailorFeature";
            case 2190:
                return "OxsightsTailorFeatureApp";
            case 2191:
                return "OxsightsTailorFeatureGroup";
            case 2192:
                return "OxsightsTailorMetricSystem";
            case 2193:
                return "OxsightsTailorSectionExportCSV";
            case 2194:
                return "OxsightsWavelandData";
            case 2195:
                return "OxygenPreloadsCarrierContract";
            case 2196:
                return "OzoneAPK";
            case 2197:
                return "OzoneRelease";
            case 2198:
                return "P2PPaymentSetting";
            case 2199:
                return "PBPostcode";
            case 2200:
                return "PBWorld";
            case 2201:
                return "PMAKioskCreditCard";
            case 2202:
                return "PMAKioskTransaction";
            case 2203:
                return "PMAMegaphone";
            case 2204:
                return "PMAPushNotificationSettings";
            case 2205:
                return "PPPExternalCase";
            case 2206:
                return "PPWhitelistedEmailDomain";
            case 2207:
                return "PPWhitelistedIPBlock";
            case 2208:
                return "PRGPublicVideoReport";
            case 2209:
                return "PSDAgreement";
            case 2210:
                return "Page";
            case 2211:
                return "PageAdminActivity";
            case 2212:
                return "PageAdminInfo";
            case 2213:
                return "PageAdminNote";
            case 2214:
                return "PageAutomatedMessage";
            case 2215:
                return "PageBadgeRemovalFeedback";
            case 2216:
                return "PageBizDefinition";
            case 2217:
                return "PageBroadcast";
            case 2218:
                return "PageBroadcastTarget";
            case 2219:
                return "PageCallToAction";
            case 2220:
                return "PageCategory";
            case 2221:
                return "PageCategoryNode";
            case 2222:
                return "PageCommItem";
            case 2223:
                return "PageCommItemOwner";
            case 2224:
                return "PageCommItemPart";
            case 2225:
                return "PageConnectionQuestionsCustomizedStory";
            case 2226:
                return "PageContact";
            case 2227:
                return "PageContactReminder";
            case 2228:
                return "PageContactUsLead";
            case 2229:
                return "PageContentCreationSetting";
            case 2230:
                return "PageCover";
            case 2231:
                return "PageCoverSlideshowItem";
            case 2232:
                return "PageCreateResponsePayload";
            case 2233:
                return "PageCustomTag";
            case 2234:
                return "PageCustomTagCustomerLink";
            case 2235:
                return "PageCustomer";
            case 2236:
                return "PageFAQ";
            case 2237:
                return "PageFAQQuestion";
            case 2238:
                return "PageGrayBadgeDeprecationNotification";
            case 2239:
                return "PageInfo";
            case 2240:
                return "PageInfoUpToDateBadge";
            case 2241:
                return "PageInsightsPageSettings";
            case 2242:
                return "PageInsightsPageSpecificUserSettings";
            case 2243:
                return "PageInternalCTASShare";
            case 2244:
                return "PageInvite";
            case 2245:
                return "PageJobOpeningSource";
            case 2246:
                return "PageLikersConnection";
            case 2247:
                return "PageLinkMenu";
            case 2248:
                return "PageLivingRoom";
            case 2249:
                return "PageMergeFeedback";
            case 2250:
                return "PageMessageShortlinkShare";
            case 2251:
                return "PageMessageThread";
            case 2252:
                return "PageMessengerIcebreakerConfig";
            case 2253:
                return "PageNameChangeFeedback";
            case 2254:
                return "PageNameCheckResult";
            case 2255:
                return "PageOfferRedemptionSetting";
            case 2256:
                return "PagePhotoMenu";
            case 2257:
                return "PagePostExperiment";
            case 2258:
                return "PageProduct";
            case 2259:
                return "PageProductList";
            case 2260:
                return "PagePublishingAdminPreference";
            case 2261:
                return "PageQuestion";
            case 2262:
                return "PageQuestionReactionUnit";
            case 2263:
                return "PageQuestionResponse";
            case 2264:
                return "PageQuestionResponseOption";
            case 2265:
                return "PageRecommendationInfo";
            case 2266:
                return "PageRecommendationsTag";
            case 2267:
                return "PageReferralOffer";
            case 2268:
                return "PageReferralOfferFlow";
            case 2269:
                return "PageReferralOfferSetting";
            case 2270:
                return "PageSavedResponse";
            case 2271:
                return "PageServiceRegion";
            case 2272:
                return "PageServicesCard";
            case 2273:
                return "PageSetVisibilityResponsePayload";
            case 2274:
                return "PageStatusCard";
            case 2275:
                return "PageStory";
            case 2276:
                return "PageSuggestCategoryResult";
            case 2277:
                return "PageSuggestedCategory";
            case 2278:
                return "PageSurvey";
            case 2279:
                return "PageSurveyReactionAggregateUnit";
            case 2280:
                return "PageThreadAutomationContext";
            case 2281:
                return "PageTimebomb";
            case 2282:
                return "PageToInstagramUsersConnection";
            case 2283:
                return "PageTopic";
            case 2284:
                return "PageTransparencyPageInfo";
            case 2285:
                return "PageUnpublishMessage";
            case 2286:
                return "PageUpdateShare";
            case 2287:
                return "PageVideoCollection";
            case 2288:
                return "PageWhatsAppNumber";
            case 2289:
                return "PageWhatsAppNumberVerification";
            case 2290:
                return "PagesCommerceBuyerIntent";
            case 2291:
                return "PagesCommercePaymentInvoice";
            case 2292:
                return "PagesInboxUpsellAdminRecord";
            case 2293:
                return "PagesMessengerThreadReminder";
            case 2294:
                return "PagesPlatformAutofill";
            case 2295:
                return "PagesPlatformBookingMessage";
            case 2296:
                return "PagesPlatformBusinessData";
            case 2297:
                return "PagesPlatformComponentFlow";
            case 2298:
                return "PagesPlatformExternalServiceConfig";
            case 2299:
                return "PagesPlatformFandangoOrder";
            case 2300:
                return "PagesPlatformIXServiceConfig";
            case 2301:
                return "PagesPlatformLeadGenData";
            case 2302:
                return "PagesPlatformLeadGenFlowConfig";
            case 2303:
                return "PagesPlatformLeadGenInfo";
            case 2304:
                return "PagesPlatformNativeServiceConfig";
            case 2305:
                return "PagesPlatformNote";
            case 2306:
                return "PagesPlatformPrefillValue";
            case 2307:
                return "PaginatedGroupsPeopleYouMayInviteFeedUnit";
            case 2308:
                return "PaginatedGroupsYouShouldJoinFeedUnit";
            case 2309:
                return "PaginatedPagesYouMayLikeFeedUnit";
            case 2310:
                return "PaginatedPeopleYouMayKnowFeedUnit";
            case 2311:
                return "PanelAPIReport";
            case 2312:
                return "PaperNuxCategory";
            case 2313:
                return "ParentApprovedContactSuggestion";
            case 2314:
                return "ParentApprovedGroupContactSuggestion";
            case 2315:
                return "ParentApprovedUserFeatures";
            case 2316:
                return "ParentApprovedUserFriendCode";
            case 2317:
                return "ParentApprovedUserParentalControl";
            case 2318:
                return "ParentApprovedUserStatusSetting";
            case 2319:
                return "PartialStory";
            case 2320:
                return "ParticleEffect";
            case 2321:
                return "ParticleEffectAnimation";
            case 2322:
                return "ParticleEffectAsset";
            case 2323:
                return "ParticleEffectEmitter";
            case 2324:
                return "PartnerAssessmentFBFormAttachmentAndFeedback";
            case 2325:
                return "PartnerHouseholdGraphDataSet";
            case 2326:
                return "PartnerPortalEvent";
            case 2327:
                return "PartnerPortalInvitation";
            case 2328:
                return "PartnerPortalPost";
            case 2329:
                return "PartnerPortalReportedEvent";
            case 2330:
                return "PartnerSFTPAccount";
            case 2331:
                return "PathToConversionConstraintSet";
            case 2332:
                return "PayToAccessCreator";
            case 2333:
                return "PayToAccessPackage";
            case 2334:
                return "Payment";
            case 2335:
                return "PaymentAccountEmail";
            case 2336:
                return "PaymentAccountPhone";
            case 2337:
                return "PaymentAccountRawDoNotUse";
            case 2338:
                return "PaymentAction";
            case 2339:
                return "PaymentAddress";
            case 2340:
                return "PaymentAffirmCredential";
            case 2341:
                return "PaymentCLOMerchant";
            case 2342:
                return "PaymentCLOOffer";
            case 2343:
                return "PaymentCLOPayoutTransaction";
            case 2344:
                return "PaymentCLOTransaction";
            case 2345:
                return "PaymentCLOUser";
            case 2346:
                return "PaymentCoupon";
            case 2347:
                return "PaymentCouponBilling";
            case 2348:
                return "PaymentCouponUseCase";
            case 2349:
                return "PaymentInvoiceProduct";
            case 2350:
                return "PaymentInvoiceProductCustomization";
            case 2351:
                return "PaymentInvoiceRefundActionData";
            case 2352:
                return "PaymentInvoiceShipment";
            case 2353:
                return "PaymentInvoiceableCancellation";
            case 2354:
                return "PaymentInvoiceableReturn";
            case 2355:
                return "PaymentMethodToken";
            case 2356:
                return "PaymentPaypalBillingAgreement";
            case 2357:
                return "PaymentPlatformAttachment";
            case 2358:
                return "PaymentSubscriptionAgreement";
            case 2359:
                return "PaymentSubscriptionBill";
            case 2360:
                return "PayoutContract";
            case 2361:
                return "PayoutExternalLoginSession";
            case 2362:
                return "PayoutInfo";
            case 2363:
                return "PayoutTINValidationResult";
            case 2364:
                return "PayoutValidationResult";
            case 2365:
                return "PaypalBillingAgreement";
            case 2366:
                return "PeerToPeerPaymentMethod";
            case 2367:
                return "PeerToPeerPaymentPIN";
            case 2368:
                return "PeerToPeerPaymentRequest";
            case 2369:
                return "PeerToPeerPlatformContext";
            case 2370:
                return "PeerToPeerPlatformSoldItemDetail";
            case 2371:
                return "PeerToPeerSingleSidedIncentivePayment";
            case 2372:
                return "PeerToPeerTransfer";
            case 2373:
                return "PeerToPeerTransferContext";
            case 2374:
                return "PelicanActivity";
            case 2375:
                return "PelicanAnnotation";
            case 2376:
                return "PelicanFirmwareTier";
            case 2377:
                return "PelicanGatewayAsset";
            case 2378:
                return "PelicanGatewayAssetConfig";
            case 2379:
                return "PelicanGatewayAssetFirmware";
            case 2380:
                return "PelicanNIAssetConfig";
            case 2381:
                return "PelicanProject";
            case 2382:
                return "PelicanStream";
            case 2383:
                return "PendingGeoBlockFeedback";
            case 2384:
                return "PendingPlaceSlot";
            case 2385:
                return "PendingPostsTimelineReviewItem";
            case 2386:
                return "PendingSentInvite";
            case 2387:
                return "PeoplePortalCMSObjectXml";
            case 2388:
                return "PeopleYouMayInviteFeedUnit";
            case 2389:
                return "PeopleYouShouldFollowAtWorkFeedUnit";
            case 2390:
                return "PeopleYouShouldFollowFeedUnit";
            case 2391:
                return "PercepticonsPhotoBoothScene";
            case 2392:
                return "PermissionResult";
            case 2393:
                return "PersistentStreamProfile";
            case 2394:
                return "PersonTempStatus";
            case 2395:
                return "PetTalentShowAudition";
            case 2396:
                return "Phone";
            case 2397:
                return "PhoneNumber";
            case 2398:
                return "Photo";
            case 2399:
                return "PhotoEncoding";
            case 2400:
                return "PhotoEncoding3D";
            case 2401:
                return "PinnedAd";
            case 2402:
                return "Place";
            case 2403:
                return "PlaceDemographicsLocalDashboardSection";
            case 2404:
                return "PlaceList";
            case 2405:
                return "PlaceListItem";
            case 2406:
                return "PlaceListUserCreatedRecommendation";
            case 2407:
                return "PlaceRecommendationPlusOne";
            case 2408:
                return "PlaceVisit";
            case 2409:
                return "PlanarCameraConfig";
            case 2410:
                return "PlatformTestUser";
            case 2411:
                return "PlayWithFriendsAttachment";
            case 2412:
                return "Podcast";
            case 2413:
                return "PodcastEpisode";
            case 2414:
                return "PointCloudGuideImage";
            case 2415:
                return "PoliticalChamber";
            case 2416:
                return "PoliticalDistrict";
            case 2417:
                return "PoliticalFigureData";
            case 2418:
                return "PoliticalOffice";
            case 2419:
                return "PoliticianCampaignQuestionAnswer";
            case 2420:
                return "PollItem";
            case 2421:
                return "PollItemVideoClip";
            case 2422:
                return "PollSticker";
            case 2423:
                return "PolyglotUserProgress";
            case 2424:
                return "PortalPartnerMetadata";
            case 2425:
                return "PostChannel";
            case 2426:
                return "PostVrMetadata";
            case 2427:
                return "PostedPhotosConnection";
            case 2428:
                return "PostedPhotosEdge";
            case 2429:
                return "PreloadsPartner";
            case 2430:
                return "PremiumMediaPartner";
            case 2431:
                return "PrescreenMeetingInvitation";
            case 2432:
                return "PresenceConsistencyLogging";
            case 2433:
                return "PresenceOwner";
            case 2434:
                return "PresenceViewerBasedSettings";
            case 2435:
                return "PriceScrapeResult";
            case 2436:
                return "PrivacyAssessmentFBFormConnection";
            case 2437:
                return "PrivacyCheckupInteractions";
            case 2438:
                return "PrivacyCheckupReminderSchedule";
            case 2439:
                return "PrivacyCheckupTopicsCollection";
            case 2440:
                return "PrivacyMutationEndpoint";
            case 2441:
                return "PrivacyNotificationProd";
            case 2442:
                return "PrivacyOption";
            case 2443:
                return "PrivacyReviewCoreCheckupInfo";
            case 2444:
                return "PrivacyReviewCoreStep";
            case 2445:
                return "PrivacyReviewTip";
            case 2446:
                return "ProactiveHackedDisputedSupportInbox";
            case 2447:
                return "ProcureToPayCorrespondenceFollowUp";
            case 2448:
                return "ProcurementQuestionResponseFeedback";
            case 2449:
                return "ProdAmbassador";
            case 2450:
                return "ProdAutoCandidateAvailabilityInvitation";
            case 2451:
                return "ProdCandidate";
            case 2452:
                return "ProdCandidateAvailability";
            case 2453:
                return "ProdCandidateCometReviewFeedback";
            case 2454:
                return "ProdCandidateCometReviewSession";
            case 2455:
                return "ProdCandidateCometReviewSessionReviewer";
            case 2456:
                return "ProdCandidatePrescreenData";
            case 2457:
                return "ProdCareersLocation";
            case 2458:
                return "ProdEmployee";
            case 2459:
                return "ProdHiringConsideration";
            case 2460:
                return "ProdImmigrationForm";
            case 2461:
                return "ProdImmigrationFormQuestion";
            case 2462:
                return "ProdInterviewLoop";
            case 2463:
                return "ProdJobFamily";
            case 2464:
                return "ProdJobRole";
            case 2465:
                return "ProdMergedAddress";
            case 2466:
                return "ProdMergedEmployerOrg";
            case 2467:
                return "ProdMergedPosition";
            case 2468:
                return "ProdMergedResume";
            case 2469:
                return "ProdMergedSchool";
            case 2470:
                return "ProdMobileSoftErrorConfig";
            case 2471:
                return "ProdPartnerCenterToolStatusEvent";
            case 2472:
                return "ProdRecruiterPreference";
            case 2473:
                return "ProdRecruitingCalendarPreferences";
            case 2474:
                return "ProdRecruitingReferral";
            case 2475:
                return "ProdRecruitingResume";
            case 2476:
                return "ProdRequisition";
            case 2477:
                return "ProdResumeReviewFeedbackDecisionReason";
            case 2478:
                return "ProdTentativeInterviewInvite";
            case 2479:
                return "ProdUsabilityTask";
            case 2480:
                return "ProdUsabilityTaskRun";
            case 2481:
                return "ProdUsabilityTaskRunEligibility";
            case 2482:
                return "ProdUsabilityTaskSuccessMarker";
            case 2483:
                return "ProdWorkdayLocation";
            case 2484:
                return "ProductAnswer";
            case 2485:
                return "ProductCanonicalConcept";
            case 2486:
                return "ProductCatalog";
            case 2487:
                return "ProductCheckoutConfig";
            case 2488:
                return "ProductDiscount";
            case 2489:
                return "ProductEngagementEndOfFeedUpsellFeedUnit";
            case 2490:
                return "ProductGroup";
            case 2491:
                return "ProductImage";
            case 2492:
                return "ProductInsightsMediaBreakdownConnection";
            case 2493:
                return "ProductInsightsMediaOwnerBreakdownConnection";
            case 2494:
                return "ProductItem";
            case 2495:
                return "ProductItemCluster";
            case 2496:
                return "ProductItemNegotiablePriceInfo";
            case 2497:
                return "ProductItemOffer";
            case 2498:
                return "ProductLiveStatusCategory";
            case 2499:
                return "ProductLiveStatusIssue";
            case 2500:
                return "ProductLiveStatusProduct";
            case 2501:
                return "ProductQuestion";
            case 2502:
                return "ProductRecommendationList";
            case 2503:
                return "ProductSet";
            case 2504:
                return "ProductTag";
            case 2505:
                return "ProductTaxonomyRateable";
            case 2506:
                return "ProductTaxonomySEOInfo";
            case 2507:
                return "ProductionPrompt";
            case 2508:
                return "ProductsDealsForYouFeedUnit";
            case 2509:
                return "ProfileApprovalTimelineReviewItem";
            case 2510:
                return "ProfileAutofillAddress";
            case 2511:
                return "ProfileAutofillEmail";
            case 2512:
                return "ProfileAutofillName";
            case 2513:
                return "ProfileAutofillPhone";
            case 2514:
                return "ProfileBadge";
            case 2515:
                return "ProfileCoreAppAdminInvite";
            case 2516:
                return "ProfileCurrentDecoration";
            case 2517:
                return "ProfileCurrentObsession";
            case 2518:
                return "ProfileCustomCTA";
            case 2519:
                return "ProfileDiscoveryBucketContent";
            case 2520:
                return "ProfileDiscoverySection";
            case 2521:
                return "ProfileFrameMediaSet";
            case 2522:
                return "ProfileFramePromptFeedUnit";
            case 2523:
                return "ProfileInfoRequest";
            case 2524:
                return "ProfileInfoRequestTimelineReviewItem";
            case 2525:
                return "ProfileLimitedAccessRoleInvite";
            case 2526:
                return "ProfileLivingRoom";
            case 2527:
                return "ProfileMediaOverlayMask";
            case 2528:
                return "ProfileOverlay";
            case 2529:
                return "ProfileOverlayByOwnerBucket";
            case 2530:
                return "ProfileOverlayCategory";
            case 2531:
                return "ProfileOverlayCategoryBucket";
            case 2532:
                return "ProfileOverlayGeneralBucket";
            case 2533:
                return "ProfileOverlayManualBucket";
            case 2534:
                return "ProfilePhotoWatermarkOverlay";
            case 2535:
                return "ProfilePicture";
            case 2536:
                return "ProfileQuestion";
            case 2537:
                return "ProfileQuestionTimelineReviewItem";
            case 2538:
                return "ProfileRating";
            case 2539:
                return "ProfileSellingInvoice";
            case 2540:
                return "ProfileSong";
            case 2541:
                return "ProfileStatus";
            case 2542:
                return "ProfileTimewallSettings";
            case 2543:
                return "ProfileVideo";
            case 2544:
                return "Program";
            case 2545:
                return "ProgramMembership";
            case 2546:
                return "ProgramsInsights";
            case 2547:
                return "PromotionAnimation";
            case 2548:
                return "ProtonArtboardScreenshot";
            case 2549:
                return "ProtonImage";
            case 2550:
                return "ProtonResearchSession";
            case 2551:
                return "PublisherBrandAssetVariant";
            case 2552:
                return "PublisherBrandAssetsConfig";
            case 2553:
                return "PublisherTrustIndicatorConfig";
            case 2554:
                return "PublisherTrustIndicatorCustomField";
            case 2555:
                return "PublisherTrustIndicatorNamedField";
            case 2556:
                return "Pulsar";
            case 2557:
                return "PurchasingCategory";
            case 2558:
                return "PushToken";
            case 2559:
                return "QPStoryBucketOwner";
            case 2560:
                return "QuerySetMatchRuleInput";
            case 2561:
                return "Question";
            case 2562:
                return "QuestionOption";
            case 2563:
                return "QuestionTag";
            case 2564:
                return "QuickInvite";
            case 2565:
                return "QuickPromotionNativeTemplateFeedUnit";
            case 2566:
                return "QuickPromotionPointer";
            case 2567:
                return "QuickPromotionStoryBucket";
            case 2568:
                return "QuickReview";
            case 2569:
                return "QuietMode";
            case 2570:
                return "QuietModeBypass";
            case 2571:
                return "Quillustration";
            case 2572:
                return "Quiz";
            case 2573:
                return "QuizMetadata";
            case 2574:
                return "QuizQuestion";
            case 2575:
                return "QuizQuestionResponse";
            case 2576:
                return "QuizQuestionResponseOption";
            case 2577:
                return "QuizResponse";
            case 2578:
                return "QuoteNotification";
            case 2579:
                return "RSGScreenedEntities";
            case 2580:
                return "RSGTestScreenedEntities";
            case 2581:
                return "RSSFeed";
            case 2582:
                return "RTCActivity";
            case 2583:
                return "RTCMediaAudioAsset";
            case 2584:
                return "RTCMediaVideoAsset";
            case 2585:
                return "RacialJusticeHub";
            case 2586:
                return "RapidReportingEntryPointPrompt";
            case 2587:
                return "RapidReportingPrompt";
            case 2588:
                return "RatingSyndicationSource";
            case 2589:
                return "ReactionAcornSportsContentSettings";
            case 2590:
                return "ReactionAcornTVContentSettings";
            case 2591:
                return "ReactionAggregateUnitWithHeader";
            case 2592:
                return "ReactionComponentsPaginationHandler";
            case 2593:
                return "ReactionComponentsReloadHandler";
            case 2594:
                return "ReactionComponentsUnit";
            case 2595:
                return "ReactionCustomClientUnit";
            case 2596:
                return "ReactionDiscoverySingleMoviesInTheatersUnit";
            case 2597:
                return "ReactionDiscoverySingleOpenGraphObjectUnit";
            case 2598:
                return "ReactionDiscoverySingleProfileUnit";
            case 2599:
                return "ReactionDiscoverySingleSportsGameUnit";
            case 2600:
                return "ReactionGravityPageAboutUnit";
            case 2601:
                return "ReactionPageAboutUnit";
            case 2602:
                return "ReactionSimpleAggregateUnit";
            case 2603:
                return "ReactionStory";
            case 2604:
                return "ReactionUnitUserSettings";
            case 2605:
                return "ReactionUnitWithPhotoHeader";
            case 2606:
                return "RealEstateMultiListing";
            case 2607:
                return "ReceivedTips";
            case 2608:
                return "RecommendationReviewRemovalFeedback";
            case 2609:
                return "RecruitingCandidateLink";
            case 2610:
                return "RecruitingExtractedEntity";
            case 2611:
                return "RecruitingInterviewPrepFile";
            case 2612:
                return "RecruitingMLRecommendationFeedback";
            case 2613:
                return "RecruitingManager";
            case 2614:
                return "RecruitingNormalizedEntity";
            case 2615:
                return "RecruitingNormalizedEntityGroup";
            case 2616:
                return "RecruitingNormalizedMappingEntity";
            case 2617:
                return "RecruitingRecommendationModelInfo";
            case 2618:
                return "ReducedMessagingActor";
            case 2619:
                return "RefMessengerCode";
            case 2620:
                return "Referral";
            case 2621:
                return "RegexMatchRuleInput";
            case 2622:
                return "RelatedAppsFeedUnit";
            case 2623:
                return "RelatedVideosChannel";
            case 2624:
                return "ReminderPayload";
            case 2625:
                return "RepeatOffenderInfo";
            case 2626:
                return "ReportableMessage";
            case 2627:
                return "ReporterFeedback";
            case 2628:
                return "ReporterMessageFeedback";
            case 2629:
                return "ResearchAnalysisAccessor";
            case 2630:
                return "ResearchDemographic";
            case 2631:
                return "ResearchDepartment";
            case 2632:
                return "ResearchEthnicity";
            case 2633:
                return "ResearchFRLTeam";
            case 2634:
                return "ResearchOffPlatformParticipants";
            case 2635:
                return "ResearchOrganization";
            case 2636:
                return "ResearchOrganizationType";
            case 2637:
                return "ResearchPartner";
            case 2638:
                return "ResearchPlatform";
            case 2639:
                return "ResearchPollFeedUnit";
            case 2640:
                return "ResearchPollMultipleChoiceQuestion";
            case 2641:
                return "ResearchPollMultipleChoiceResponse";
            case 2642:
                return "ResearchPollSurvey";
            case 2643:
                return "ResearchProjectTopic";
            case 2644:
                return "ResearchReviewType";
            case 2645:
                return "ResearchUnverifiedCollaborator";
            case 2646:
                return "ResearchWhatsAppData";
            case 2647:
                return "ResearcherProfile";
            case 2648:
                return "ResolutionField";
            case 2649:
                return "ResolutionForm";
            case 2650:
                return "ResponsibleFeedback";
            case 2651:
                return "ResponsibleSupportCaseFeedback";
            case 2652:
                return "RestrictedUser";
            case 2653:
                return "RichMediaData";
            case 2654:
                return "RideOrder";
            case 2655:
                return "RideRequest";
            case 2656:
                return "RightsManagerAdminData";
            case 2657:
                return "RightsManagerPageData";
            case 2658:
                return "Robot";
            case 2659:
                return "RobotCalendarDay";
            case 2660:
                return "RobotCalendarEvent";
            case 2661:
                return "RobotComponentPayload";
            case 2662:
                return "RobotDatacenterLocation";
            case 2663:
                return "RobotGroup";
            case 2664:
                return "RobotImage";
            case 2665:
                return "RobotImageBarcode";
            case 2666:
                return "RobotMastPayload";
            case 2667:
                return "RobotOSImage";
            case 2668:
                return "RobotRemoteControlFavorite";
            case 2669:
                return "RobotSWImage";
            case 2670:
                return "RobotSpaceLocation";
            case 2671:
                return "RobotStitchedImage";
            case 2672:
                return "RobotWorkflow";
            case 2673:
                return "RobotWorkflowHistory";
            case 2674:
                return "RoleBlockBehavior";
            case 2675:
                return "RowdyYetiRecording";
            case 2676:
                return "SCAPInvoice";
            case 2677:
                return "SCAPInvoiceDefect";
            case 2678:
                return "SCAPInvoiceException";
            case 2679:
                return "SCAPInvoiceLine";
            case 2680:
                return "SCAttachment";
            case 2681:
                return "SCBomComponent";
            case 2682:
                return "SCComment";
            case 2683:
                return "SCDiversity";
            case 2684:
                return "SCINVHRLocation";
            case 2685:
                return "SCInvite";
            case 2686:
                return "SCInvoice";
            case 2687:
                return "SCInvoiceAttachment";
            case 2688:
                return "SCInvoiceHold";
            case 2689:
                return "SCInvoiceLine";
            case 2690:
                return "SCInvoicePayment";
            case 2691:
                return "SCInvoicePaymentLine";
            case 2692:
                return "SCItem";
            case 2693:
                return "SCLegalEntity";
            case 2694:
                return "SCOnboardingInformation";
            case 2695:
                return "SCPartner";
            case 2696:
                return "SCPartnerLocation";
            case 2697:
                return "SCPartnerProfile";
            case 2698:
                return "SCPaymentTerm";
            case 2699:
                return "SCProcureToPaySupportCase";
            case 2700:
                return "SCPurchaseOrder";
            case 2701:
                return "SCPurchaseOrderAcknowledgement";
            case 2702:
                return "SCPurchaseOrderLine";
            case 2703:
                return "SCPurchaseOrderLineDetail";
            case 2704:
                return "SCPurchaseOrderShipment";
            case 2705:
                return "SCQuote";
            case 2706:
                return "SCQuoteComponent";
            case 2707:
                return "SCQuoteDetail";
            case 2708:
                return "SCQuoteSummary";
            case 2709:
                return "SCSecurityPhone";
            case 2710:
                return "SCSecurityQuestion";
            case 2711:
                return "SCSupplier";
            case 2712:
                return "SCSupplierAddress";
            case 2713:
                return "SCSupplierAddressChange";
            case 2714:
                return "SCSupplierBank";
            case 2715:
                return "SCSupplierBankAccount";
            case 2716:
                return "SCSupplierBankAccountAssignment";
            case 2717:
                return "SCSupplierBankAccountAssignmentChange";
            case 2718:
                return "SCSupplierBankAccountChange";
            case 2719:
                return "SCSupplierChangeRequest";
            case 2720:
                return "SCSupplierGenericAddress";
            case 2721:
                return "SCSupplierSite";
            case 2722:
                return "SCSupplierSiteChange";
            case 2723:
                return "SCTRule";
            case 2724:
                return "SCUser";
            case 2725:
                return "SCUserChange";
            case 2726:
                return "SIURLChunk";
            case 2727:
                return "SOAttachment";
            case 2728:
                return "SOBankAccount";
            case 2729:
                return "SOBankLookup";
            case 2730:
                return "SOBizVal";
            case 2731:
                return "SOBizValAttachment";
            case 2732:
                return "SOCommonAttachment";
            case 2733:
                return "SOCompliance";
            case 2734:
                return "SOEchoSignInformation";
            case 2735:
                return "SRTAccessibilityVertical";
            case 2736:
                return "SRTAdsIntegrityVertical";
            case 2737:
                return "SRTAdsRankingVertical";
            case 2738:
                return "SRTAgeAffinityVertical";
            case 2739:
                return "SRTAmlVertical";
            case 2740:
                return "SRTAuditActivity";
            case 2741:
                return "SRTBlockchainVertical";
            case 2742:
                return "SRTBurmeseEncodingVertical";
            case 2743:
                return "SRTCalibraCareVertical";
            case 2744:
                return "SRTCasesVertical";
            case 2745:
                return "SRTCatalogVertical";
            case 2746:
                return "SRTCommerceVertical";
            case 2747:
                return "SRTCommunityOpsVertical";
            case 2748:
                return "SRTCommunityReviewVertical";
            case 2749:
                return "SRTComplianceQueryVertical";
            case 2750:
                return "SRTCompoundEyeVertical";
            case 2751:
                return "SRTConsumerHardwareSearchDevice";
            case 2752:
                return "SRTContextualOptimizationVertical";
            case 2753:
                return "SRTCoreTestVertical";
            case 2754:
                return "SRTCreditAndCollectionVertical";
            case 2755:
                return "SRTCrmDataVertical";
            case 2756:
                return "SRTDataDiscoveryVertical";
            case 2757:
                return "SRTDatingVertical";
            case 2758:
                return "SRTDevOpsVertical";
            case 2759:
                return "SRTEnterpriseOperationsVertical";
            case 2760:
                return "SRTFbFinanceQaVertical";
            case 2761:
                return "SRTFriendSharingVertical";
            case 2762:
                return "SRTGenericFallbackVertical";
            case 2763:
                return "SRTGeoApiVertical";
            case 2764:
                return "SRTGlobalCommsVertical";
            case 2765:
                return "SRTGlobalOpsWorkflowReviewsVertical";
            case 2766:
                return "SRTGlobalSecurityVertical";
            case 2767:
                return "SRTGmsVertical";
            case 2768:
                return "SRTGroupIntegrityVertical";
            case 2769:
                return "SRTHaloVertical";
            case 2770:
                return "SRTHealthIntegrityVertical";
            case 2771:
                return "SRTIgCommercialityVertical";
            case 2772:
                return "SRTInstagramVertical";
            case 2773:
                return "SRTIpOpsVertical";
            case 2774:
                return "SRTJobAppSubmission";
            case 2775:
                return "SRTJobAuditMailAttachment";
            case 2776:
                return "SRTJobAuditMailTriage";
            case 2777:
                return "SRTJobLegalMailTriage";
            case 2778:
                return "SRTJobLegalMailTriageField";
            case 2779:
                return "SRTJobSeguroCredibleThreat";
            case 2780:
                return "SRTLanguageTechnologyVertical";
            case 2781:
                return "SRTLegalVertical";
            case 2782:
                return "SRTLocalContentVertical";
            case 2783:
                return "SRTMarketingVertical";
            case 2784:
                return "SRTMarketplaceIntelligenceVertical";
            case 2785:
                return "SRTMediaOperationsVertical";
            case 2786:
                return "SRTMessengerP2bConversationIntentVertical";
            case 2787:
                return "SRTNewsProductVertical";
            case 2788:
                return "SRTOculusContentEngineVertical";
            case 2789:
                return "SRTOculusContentVertical";
            case 2790:
                return "SRTOculusMediaStudioVertical";
            case 2791:
                return "SRTOculusVertical";
            case 2792:
                return "SRTOversightBoardVertical";
            case 2793:
                return "SRTPagesIntegrityVertical";
            case 2794:
                return "SRTPartnerAssessment";
            case 2795:
                return "SRTPartnerAssessmentActivity";
            case 2796:
                return "SRTPartnerAssessmentAttachment";
            case 2797:
                return "SRTPartnerAssessmentFeedbackTarget";
            case 2798:
                return "SRTPartnerAssessmentJob";
            case 2799:
                return "SRTPartnerAssessmentQuestion";
            case 2800:
                return "SRTPartnerAssessmentQuestionResponse";
            case 2801:
                return "SRTPartnerAssessmentQuestionRule";
            case 2802:
                return "SRTPartnerAssessmentQuestionRuleSet";
            case 2803:
                return "SRTPartnerAssessmentVertical";
            case 2804:
                return "SRTPartnershipsVertical";
            case 2805:
                return "SRTPayComDataRequest";
            case 2806:
                return "SRTPayComVertical";
            case 2807:
                return "SRTPaymentsComplianceVertical";
            case 2808:
                return "SRTPaymentsRiskVertical";
            case 2809:
                return "SRTPhysicalSecurityVertical";
            case 2810:
                return "SRTPrivacyOpsVertical";
            case 2811:
                return "SRTPrivacySecurityAndIntegrityVertical";
            case 2812:
                return "SRTProcureToPayVertical";
            case 2813:
                return "SRTProcurementVertical";
            case 2814:
                return "SRTProdOpsVertical";
            case 2815:
                return "SRTProdSecVertical";
            case 2816:
                return "SRTProductClusteringVertical";
            case 2817:
                return "SRTProductRiskManagementVertical";
            case 2818:
                return "SRTPublicContentInterestVertical";
            case 2819:
                return "SRTPublicContentTopicsVertical";
            case 2820:
                return "SRTPublicContentVoicesVertical";
            case 2821:
                return "SRTPublisherBrandAssetsVertical";
            case 2822:
                return "SRTPublisherRegistrationAndReviewVertical";
            case 2823:
                return "SRTResearchCaseCloseReason";
            case 2824:
                return "SRTResearchFellowship";
            case 2825:
                return "SRTResearchVertical";
            case 2826:
                return "SRTSearchMetricsVertical";
            case 2827:
                return "SRTSecurityVertical";
            case 2828:
                return "SRTSignalsAndIdentityVertical";
            case 2829:
                return "SRTSparkArVertical";
            case 2830:
                return "SRTSrtDemoVertical";
            case 2831:
                return "SRTSrtDogfoodingVertical";
            case 2832:
                return "SRTSurvey";
            case 2833:
                return "SRTTaxVertical";
            case 2834:
                return "SRTThreatExchangeVertical";
            case 2835:
                return "SRTTransactionsMeasurementVertical";
            case 2836:
                return "SRTUserPreferences";
            case 2837:
                return "SRTVendorManagementVertical";
            case 2838:
                return "SRTVideoFeedRankingVertical";
            case 2839:
                return "SRTVideoInfraVertical";
            case 2840:
                return "SRTWhatsappPaymentsVertical";
            case 2841:
                return "SRTWhatsappSpamVertical";
            case 2842:
                return "SRTWhatsappSupportVertical";
            case 2843:
                return "SRTWorkOperationsVertical";
            case 2844:
                return "SRTYouthVertical";
            case 2845:
                return "SaleGroupsNearYouFeedUnit";
            case 2846:
                return "SalesPromo";
            case 2847:
                return "SavableCommerceFeature";
            case 2848:
                return "Save";
            case 2849:
                return "SaveList";
            case 2850:
                return "SaveListItem";
            case 2851:
                return "SaveReminder";
            case 2852:
                return "SaveUserCampaignImpression";
            case 2853:
                return "SavedRecruitingSearch";
            case 2854:
                return "ScheduledGroupLivingRoom";
            case 2855:
                return "ScheduledLiveMetadata";
            case 2856:
                return "ScheduledLivingRoomMetadata";
            case 2857:
                return "ScheduledPageLivingRoom";
            case 2858:
                return "ScheduledQuietMode";
            case 2859:
                return "ScheduledQuietModeWeeklyInterval";
            case 2860:
                return "ScheduledVideoPoll";
            case 2861:
                return "SchoolClassExperience";
            case 2862:
                return "SchoolCommunityCourse";
            case 2863:
                return "SchoolCommunityInvite";
            case 2864:
                return "ScimCompany";
            case 2865:
                return "ScimCompanyDepartment";
            case 2866:
                return "ScimCompanyDivision";
            case 2867:
                return "ScimCompanyGroup";
            case 2868:
                return "ScimCompanyIntegritySettings";
            case 2869:
                return "ScimCompanyJobTitle";
            case 2870:
                return "ScimCompanyOrg";
            case 2871:
                return "ScimCompanyUser";
            case 2872:
                return "ScimCompanyUserAddress";
            case 2873:
                return "ScimCompanyUserPhoneNumber";
            case 2874:
                return "ScimEmployeeCheckup";
            case 2875:
                return "SearchClickToAction";
            case 2876:
                return "SearchNewsDigestFeedUnit";
            case 2877:
                return "SearchQueryWhitelist";
            case 2878:
                return "SearchShortcut";
            case 2879:
                return "SearchSuggestion";
            case 2880:
                return "SearchUnitUserInputBasedData";
            case 2881:
                return "Searchable";
            case 2882:
                return "SearchableEntitiesQuery";
            case 2883:
                return "SearchableResultsConnection";
            case 2884:
                return "Sector";
            case 2885:
                return "SecuritySignal";
            case 2886:
                return "SellIntent";
            case 2887:
                return "SellerEnforcementLineItemMetricAppeal";
            case 2888:
                return "SentryRestrictionMetadata";
            case 2889:
                return "SerialDevice";
            case 2890:
                return "SerialDeviceHistory";
            case 2891:
                return "SerialDeviceWarranty";
            case 2892:
                return "ServicesAppointmentAvailability";
            case 2893:
                return "ServicesAppointmentInterstitialOptOut";
            case 2894:
                return "ServicesAppointmentReminder";
            case 2895:
                return "ServicesApptShowupSurvey";
            case 2896:
                return "ServicesBookableTask";
            case 2897:
                return "ServicesBookmarkUserSettings";
            case 2898:
                return "ServicesExternalCalendarProvider";
            case 2899:
                return "ServicesFacebookAppointment";
            case 2900:
                return "ServicesFollowUpMessageSetting";
            case 2901:
                return "ServicesFuturePartnerRequest";
            case 2902:
                return "ServicesGenericAdminText";
            case 2903:
                return "ServicesGoogleCalendarInfo";
            case 2904:
                return "ServicesLeadGenData";
            case 2905:
                return "ServicesMenuCategory";
            case 2906:
                return "ServicesMessengerAppointmentEntryPointOptOut";
            case 2907:
                return "ServicesOfferSubscription";
            case 2908:
                return "ServicesRecurringAppointment";
            case 2909:
                return "ServicesRequestTimeCreationImpression";
            case 2910:
                return "ServicesRootCategory";
            case 2911:
                return "ServicesStaff";
            case 2912:
                return "ServicesSubCategory";
            case 2913:
                return "ServicesThreadIntentTimeMentioned";
            case 2914:
                return "ServicesVerticalUserData";
            case 2915:
                return "ShaderFilter";
            case 2916:
                return "SharedChatRule";
            case 2917:
                return "SharedMonthlyInvoicing";
            case 2918:
                return "ShopLabel";
            case 2919:
                return "ShoppingDocumentElementsConnection";
            case 2920:
                return "ShoppingDocumentElementsEdge";
            case 2921:
                return "ShowData";
            case 2922:
                return "ShowreelNativeAction";
            case 2923:
                return "ShowreelNativeActionParameter";
            case 2924:
                return "ShowreelNativeAnimation";
            case 2925:
                return "ShowreelNativeAnimationBitmap";
            case 2926:
                return "ShowreelNativeDocument";
            case 2927:
                return "ShowreelNativeDocumentAction";
            case 2928:
                return "ShowreelNativeDocumentEventActions";
            case 2929:
                return "ShowreelNativeDocumentState";
            case 2930:
                return "ShowreelNativeInteraction";
            case 2931:
                return "ShowreelNativeInteractiveAnimation";
            case 2932:
                return "ShowreelNativePartPointer";
            case 2933:
                return "ShowreelTemplate";
            case 2934:
                return "ShowreelTemplateAsset";
            case 2935:
                return "ShowreelTemplateSpecification";
            case 2936:
                return "ShowreelTemplateVersion";
            case 2937:
                return "ShowreelTemplateVersionTest";
            case 2938:
                return "ShowsLiveTemplateMetadata";
            case 2939:
                return "SideConversation";
            case 2940:
                return "SierraTopic";
            case 2941:
                return "SimpleNotification";
            case 2942:
                return "SingingTalentShowAudition";
            case 2943:
                return "SitevarMatchRuleInput";
            case 2944:
                return "SmsMessagingParticipant";
            case 2945:
                return "SnoozableKeyword";
            case 2946:
                return "SnoozeFollowupFeedUnit";
            case 2947:
                return "SocialListPromptFeedUnit";
            case 2948:
                return "SocialVRAchievement";
            case 2949:
                return "SocialVRAchievementDefinition";
            case 2950:
                return "SocialVRActivityBiPlanesProgression";
            case 2951:
                return "SocialVRAvatar";
            case 2952:
                return "SocialVRCoreBuildSet";
            case 2953:
                return "SocialVRCustomWorld";
            case 2954:
                return "SocialVRCustomWorldAsset";
            case 2955:
                return "SocialVRCustomWorldScreenshot";
            case 2956:
                return "SocialVRCustomWorldSnapshot";
            case 2957:
                return "SocialVRCustomWorldTag";
            case 2958:
                return "SocialVRDestination";
            case 2959:
                return "SocialVRDestinationDefinition";
            case 2960:
                return "SocialVRPackage";
            case 2961:
                return "SocialVRPackageBundle";
            case 2962:
                return "SocialVRParameterizedDestination";
            case 2963:
                return "SocialVRParty";
            case 2964:
                return "SocialVRSpawnable";
            case 2965:
                return "SocialWifiGateway";
            case 2966:
                return "SocialWifiSite";
            case 2967:
                return "Song";
            case 2968:
                return "SourcingAttachment";
            case 2969:
                return "SourcingAttachmentHistory";
            case 2970:
                return "SourcingBidTerm";
            case 2971:
                return "SourcingCRDiscussion";
            case 2972:
                return "SourcingCategory";
            case 2973:
                return "SourcingChangeOrderForm";
            case 2974:
                return "SourcingChangeOrderFormApprover";
            case 2975:
                return "SourcingChangeOrderFormDiscussion";
            case 2976:
                return "SourcingChangeRequest";
            case 2977:
                return "SourcingChangeRequestSpecification";
            case 2978:
                return "SourcingCostingSheetDetail";
            case 2979:
                return "SourcingCostingSheetDetailHistory";
            case 2980:
                return "SourcingCostingSheetHeader";
            case 2981:
                return "SourcingCostingSheetHeaderHistory";
            case 2982:
                return "SourcingEvent";
            case 2983:
                return "SourcingEventAward";
            case 2984:
                return "SourcingEventCollaborator";
            case 2985:
                return "SourcingEventEvaluationCriteria";
            case 2986:
                return "SourcingEventEvaluationScore";
            case 2987:
                return "SourcingEventHistory";
            case 2988:
                return "SourcingEventQuestion";
            case 2989:
                return "SourcingEventQuestionHistory";
            case 2990:
                return "SourcingEventResponse";
            case 2991:
                return "SourcingEventResponseHistory";
            case 2992:
                return "SourcingMessage";
            case 2993:
                return "SourcingMessageDetail";
            case 2994:
                return "SourcingMessageState";
            case 2995:
                return "SourcingNotification";
            case 2996:
                return "SourcingQuestionAnswer";
            case 2997:
                return "SourcingQuestionAnswerHistory";
            case 2998:
                return "SourcingQuestionCategory";
            case 2999:
                return "SourcingQuestionOption";
            case 3000:
                return "SourcingQuestionTemplate";
            case 3001:
                return "SourcingSeenState";
            case 3002:
                return "SourcingSupplierDetail";
            case 3003:
                return "SourcingSupplierDetailHistory";
            case 3004:
                return "SourcingTimeline";
            case 3005:
                return "SourcingTimelineHistory";
            case 3006:
                return "SourcingWorksheetConfig";
            case 3007:
                return "SourcingWorksheetConfigHistory";
            case 3008:
                return "SpacesMarkerDrawing";
            case 3009:
                return "SpamReportFeedback";
            case 3010:
                return "SplitTestConfig";
            case 3011:
                return "SponsorTagsOptIn";
            case 3012:
                return "SponsoredNewsQuiz";
            case 3013:
                return "SportsDataMatchData";
            case 3014:
                return "SportsDataMatchDataFact";
            case 3015:
                return "SportsMatchChatroom";
            case 3016:
                return "SpotlightStoryWithSnippetInfo";
            case 3017:
                return "StandaloneAppNotification";
            case 3018:
                return "StandardMessengerCode";
            case 3019:
                return "StarsCustomCreatorMessage";
            case 3020:
                return "StarsSendingTier";
            case 3021:
                return "StarsVirtualGift";
            case 3022:
                return "StateControlledMediaEntity";
            case 3023:
                return "Sticker";
            case 3024:
                return "StickerPack";
            case 3025:
                return "StickerTag";
            case 3026:
                return "StickerTrayConfig";
            case 3027:
                return "StonehengeSubscriptionOption";
            case 3028:
                return "StoreBrand";
            case 3029:
                return "StoreBrandApproverGroup";
            case 3030:
                return "StoreCatalog";
            case 3031:
                return "StoreCouponCampaign";
            case 3032:
                return "StoreGuestUser";
            case 3033:
                return "StoreOfferApprovalHistory";
            case 3034:
                return "StoreOrderCancellation";
            case 3035:
                return "StoreOrderHold";
            case 3036:
                return "StoreOrderPurchase";
            case 3037:
                return "StoreOrderShipment";
            case 3038:
                return "StoreOrderShipmentItem";
            case 3039:
                return "StoreOrderShipmentItemInfo";
            case 3040:
                return "StorePhysicalItem";
            case 3041:
                return "StorePhysicalOffer";
            case 3042:
                return "StorePhysicalOfferChangeRequest";
            case 3043:
                return "StorePhysicalOfferPrice";
            case 3044:
                return "StorePhysicalOrder";
            case 3045:
                return "StorePhysicalOrderItem";
            case 3046:
                return "StoreProductItem";
            case 3047:
                return "StorePromotion";
            case 3048:
                return "StoreRMA";
            case 3049:
                return "StoreRefund";
            case 3050:
                return "StoreShoppingCart";
            case 3051:
                return "StoreShoppingCartItem";
            case 3052:
                return "StoreUser";
            case 3053:
                return "StoredBalance";
            case 3054:
                return "StoriesSharedFriendList";
            case 3055:
                return "Story";
            case 3056:
                return "StoryArchiveSettings";
            case 3057:
                return "StoryBucketAnimationAsset";
            case 3058:
                return "StoryBucketCTACard";
            case 3059:
                return "StoryCardAvatarSticker";
            case 3060:
                return "StoryCardCallForActionSticker";
            case 3061:
                return "StoryCardDynamicBrandSticker";
            case 3062:
                return "StoryCardEmojiSticker";
            case 3063:
                return "StoryCardEventInfoBar";
            case 3064:
                return "StoryCardGroupedTagSticker";
            case 3065:
                return "StoryCardLWRAnimationConfig";
            case 3066:
                return "StoryCardLocationSticker";
            case 3067:
                return "StoryCardMusicSticker";
            case 3068:
                return "StoryCardPoll";
            case 3069:
                return "StoryCardQuestion";
            case 3070:
                return "StoryCardQuestionAnswer";
            case 3071:
                return "StoryCardQuiz";
            case 3072:
                return "StoryCardRaffle";
            case 3073:
                return "StoryCardReactionSticker";
            case 3074:
                return "StoryCardRevealSticker";
            case 3075:
                return "StoryCardShare";
            case 3076:
                return "StoryCardSliderPoll";
            case 3077:
                return "StoryCardTemplate";
            case 3078:
                return "StoryCardTemplateMedia";
            case 3079:
                return "StoryCardTemplateTextInput";
            case 3080:
                return "StoryChannel";
            case 3081:
                return "StoryGallerySurveyFeedUnit";
            case 3082:
                return "StoryGallerySurveyUnit";
            case 3083:
                return "StoryHighlightContainer";
            case 3084:
                return "StoryHighlightPreferences";
            case 3085:
                return "StoryListAttachmentItem";
            case 3086:
                return "StoryListAttachmentPrompt";
            case 3087:
                return "StoryPreferences";
            case 3088:
                return "StoryPromotionOwner";
            case 3089:
                return "StorySet";
            case 3090:
                return "StorySetItem";
            case 3091:
                return "StoryTopic";
            case 3092:
                return "StoryTopicFeedback";
            case 3093:
                return "StoryYouMayPublishFeedUnit";
            case 3094:
                return "StreetAddress";
            case 3095:
                return "StructuredSurvey";
            case 3096:
                return "StructuredSurveyBranchNodeResponseMapEntry";
            case 3097:
                return "StructuredSurveyConfiguredQuestion";
            case 3098:
                return "StructuredSurveyControlNode";
            case 3099:
                return "StructuredSurveyEventLoggingResponsePayload";
            case 3100:
                return "StructuredSurveyFlow";
            case 3101:
                return "StructuredSurveyFlowBucket";
            case 3102:
                return "StructuredSurveyFlowPage";
            case 3103:
                return "StructuredSurveyQuestion";
            case 3104:
                return "StructuredSurveyQuestionTokenParam";
            case 3105:
                return "StructuredSurveyResponseOption";
            case 3106:
                return "StructuredSurveySession";
            case 3107:
                return "StructuredSurveySubmitResponsesResponsePayload";
            case 3108:
                return "StyleTransferEffect";
            case 3109:
                return "Subtopic";
            case 3110:
                return "SuggestedCoverPhoto";
            case 3111:
                return "SuggestedProfilePicFeedUnit";
            case 3112:
                return "SuggestedRecommendation";
            case 3113:
                return "SuggestedShowsFeedUnit";
            case 3114:
                return "SuggestedSouvenir";
            case 3115:
                return "SupplierDiversityEnrollment";
            case 3116:
                return "SupplierFile";
            case 3117:
                return "SupplierPortalPartner";
            case 3118:
                return "SupplyChainContentMetadata";
            case 3119:
                return "SupplyChainSettingsMetadata";
            case 3120:
                return "SupportBotSession";
            case 3121:
                return "SupportCaseFeedback";
            case 3122:
                return "SupportCaseMCOMP2MBuyerDispute";
            case 3123:
                return "SupportCaseMpC2CDispute";
            case 3124:
                return "SupportCaseMpC2CSellerInquiry";
            case 3125:
                return "SupportCaseMpDispute";
            case 3126:
                return "SupportCaseSellerEnforcementMetricsAppeal";
            case 3127:
                return "SupportCorrespondenceAttachment";
            case 3128:
                return "SupportCorrespondenceCommonResponse";
            case 3129:
                return "SupportCorrespondenceFormSubmission";
            case 3130:
                return "SupportCorrespondenceInternal";
            case 3131:
                return "SupportCorrespondenceJSON";
            case 3132:
                return "SupportCorrespondencePlainText";
            case 3133:
                return "SupportCorrespondenceThread";
            case 3134:
                return "SupportInboxItemMain";
            case 3135:
                return "SupportModuleDisplayBehavior";
            case 3136:
                return "SupportOutreachFeedback";
            case 3137:
                return "SupportPartner";
            case 3138:
                return "SurveyConfig";
            case 3139:
                return "SurveyIntegrationPoint";
            case 3140:
                return "SwipeableAnimation";
            case 3141:
                return "SwipeableAssetCategory";
            case 3142:
                return "SwipeableFrame";
            case 3143:
                return "SwipeableFramePack";
            case 3144:
                return "SwitchOffMI";
            case 3145:
                return "SyntheticActor";
            case 3146:
                return "TPSTicketFeedback";
            case 3147:
                return "TVSession";
            case 3148:
                return "TagSpamFeedback";
            case 3149:
                return "TaggableActivity";
            case 3150:
                return "TaggableActivityIcon";
            case 3151:
                return "TaggableActivityIconCategory";
            case 3152:
                return "TaggableActivityIconTerm";
            case 3153:
                return "TaggableActivityObject";
            case 3154:
                return "TaggedInAlbumMediaSet";
            case 3155:
                return "TaggedMediaOfFamilyMemberMediaSet";
            case 3156:
                return "TaggedMediaOfUserMediaSet";
            case 3157:
                return "TailorSettingsHistory";
            case 3158:
                return "TalentShow";
            case 3159:
                return "TalentShowStage";
            case 3160:
                return "TalkMission";
            case 3161:
                return "TargetImage";
            case 3162:
                return "TarotDigest";
            case 3163:
                return "TarotDigestSuggestionFeedUnit";
            case 3164:
                return "TarotPhotoCard";
            case 3165:
                return "TarotVideoCard";
            case 3166:
                return "TaxForm";
            case 3167:
                return "Teleprompter";
            case 3168:
                return "TeleprompterDisplay";
            case 3169:
                return "TeleprompterMessageBookmark";
            case 3170:
                return "TemplateDashboard";
            case 3171:
                return "TerragraphPartner";
            case 3172:
                return "TestAddressBook";
            case 3173:
                return "TestAddressBookContact";
            case 3174:
                return "TestCoupon";
            case 3175:
                return "TextDelightCampaign";
            case 3176:
                return "TextMatchRuleInput";
            case 3177:
                return "TextWithEntities";
            case 3178:
                return "ThirdPartyAudio";
            case 3179:
                return "ThirdPartyPartnerAdvertiser";
            case 3180:
                return "ThirdPartyPrivacyPortalComment";
            case 3181:
                return "ThirdPartyProfile";
            case 3182:
                return "ThirdPartyRatingAuthor";
            case 3183:
                return "ThreatDescriptor";
            case 3184:
                return "ThreatExchangeAppSubmission";
            case 3185:
                return "ThreatIndicator";
            case 3186:
                return "ThreatPrivacyGroup";
            case 3187:
                return "ThreatSubjectiveTag";
            case 3188:
                return "ThreatTag";
            case 3189:
                return "TicketOrderAttachment";
            case 3190:
                return "TicketedExperienceCluster";
            case 3191:
                return "TicketedExperienceSeaticsSeatMap";
            case 3192:
                return "TiefenrauschModelMetadata";
            case 3193:
                return "TimelineAppCollection";
            case 3194:
                return "TimelineAppCollectionItem";
            case 3195:
                return "TimelineAppSection";
            case 3196:
                return "TimelineAtWorkDetailsResult";
            case 3197:
                return "TimelineContextItemWrapper";
            case 3198:
                return "TimelineSection";
            case 3199:
                return "TipJarPaymentSetting";
            case 3200:
                return "TipJarSetting";
            case 3201:
                return "TipJarTransaction";
            case 3202:
                return "TitleSentenceLink";
            case 3203:
                return "TodoListItem";
            case 3204:
                return "TofuFeedback";
            case 3205:
                return "TogetherASActivityProgression";
            case 3206:
                return "TogetherASArtwork";
            case 3207:
                return "TogetherASArtworkDrawing";
            case 3208:
                return "TogetherActivity";
            case 3209:
                return "TogetherActivityShapetionaryProgression";
            case 3210:
                return "TogetherAnnouncement";
            case 3211:
                return "TogetherAppUser";
            case 3212:
                return "TogetherDSTEvidenceViewerDefinition";
            case 3213:
                return "TogetherDSTInstance";
            case 3214:
                return "TogetherDSTStaticDefinition";
            case 3215:
                return "TogetherDSTWBEditDefinition";
            case 3216:
                return "TogetherDSTWBVisitDefinition";
            case 3217:
                return "TogetherMissionDefinition";
            case 3218:
                return "TogetherPlayerStats";
            case 3219:
                return "TogetherUserMissionProgression";
            case 3220:
                return "TogetherWBFeaturedWorldSchedule";
            case 3221:
                return "TopUpcomingScheduledLive";
            case 3222:
                return "TopicCustomizationStory";
            case 3223:
                return "TopicFeedPivotFeedUnit";
            case 3224:
                return "TopicFollowingTopic";
            case 3225:
                return "TopicsToFollowFeedUnit";
            case 3226:
                return "Touchpoint";
            case 3227:
                return "TournamentOrganizerSettings";
            case 3228:
                return "TransTask";
            case 3229:
                return "TransactionEngineRow";
            case 3230:
                return "TransactionEngineRowComponent";
            case 3231:
                return "TransactionFBIncentives";
            case 3232:
                return "TransactionInvoice";
            case 3233:
                return "TransactionPaymentOption";
            case 3234:
                return "TransactionShippingOption";
            case 3235:
                return "TreehengePAYGSubscribable";
            case 3236:
                return "TrendingCuratedTopic";
            case 3237:
                return "TrendingCuratedUnit";
            case 3238:
                return "TrendingCuratedUnitVersion";
            case 3239:
                return "TrendingCuratedUnitVersionFeedback";
            case 3240:
                return "TrendingEventCandidate";
            case 3241:
                return "TrendingTopicData";
            case 3242:
                return "TriggerHCMForResultBehavior";
            case 3243:
                return "TriviaGame";
            case 3244:
                return "TriviaGameConfig";
            case 3245:
                return "TriviaGameExtraLife";
            case 3246:
                return "TriviaGameOption";
            case 3247:
                return "TriviaGameOptionSelection";
            case 3248:
                return "TriviaGamePayout";
            case 3249:
                return "TriviaGamePlayerInfo";
            case 3250:
                return "TriviaGamePlayerResults";
            case 3251:
                return "TriviaGameQuestion";
            case 3252:
                return "TriviaGameTermsOfService";
            case 3253:
                return "TrueTopicFeedOption";
            case 3254:
                return "UGCAgreement";
            case 3255:
                return "UnavailableMessagingActor";
            case 3256:
                return "UnicornSearchParamBehavior";
            case 3257:
                return "UnifiedMessagingInstagramUser";
            case 3258:
                return "UnifiedStoriesSetting";
            case 3259:
                return "UnifiedStoryReply";
            case 3260:
                return "UnimogCustomTag";
            case 3261:
                return "UnimogFolder";
            case 3262:
                return "UnimogObjectAccessPoint";
            case 3263:
                return "UnimogObjectCell";
            case 3264:
                return "UnimogObjectCustomPolygon";
            case 3265:
                return "UnimogObjectLISavedPolygon";
            case 3266:
                return "UnimogObjectSitusPolygon";
            case 3267:
                return "UnimogProject";
            case 3268:
                return "UniqueReadTimeBlockMessage";
            case 3269:
                return "UniversalOrderTracker";
            case 3270:
                return "UnownedNewsQuiz";
            case 3271:
                return "UpcomingScheduledLive";
            case 3272:
                return "UpgradeOverMobileDataPreferences";
            case 3273:
                return "User";
            case 3274:
                return "UserAchievement";
            case 3275:
                return "UserActionDelight";
            case 3276:
                return "UserApplicationInviteSettings";
            case 3277:
                return "UserBillableAccountSoftTaxAck";
            case 3278:
                return "UserEducationState";
            case 3279:
                return "UserFundingGoal";
            case 3280:
                return "UserFundingReferrals";
            case 3281:
                return "UserFundingSubscription";
            case 3282:
                return "UserGroupBlockList";
            case 3283:
                return "UserGroupsTabSettings";
            case 3284:
                return "UserLeadGenInfo";
            case 3285:
                return "UserPageProfile";
            case 3286:
                return "UserPayPAYGSubscribable";
            case 3287:
                return "VRFullStateRecording";
            case 3288:
                return "VRPersona";
            case 3289:
                return "VaultAddressBookContact";
            case 3290:
                return "VaultUser";
            case 3291:
                return "VaultUserContactInvitation";
            case 3292:
                return "Vehicle";
            case 3293:
                return "VehicleMake";
            case 3294:
                return "VehicleModel";
            case 3295:
                return "VehicleModelYear";
            case 3296:
                return "VehicleOffer";
            case 3297:
                return "VehicleTrim";
            case 3298:
                return "VendorExternalCase";
            case 3299:
                return "VenuesInstance";
            case 3300:
                return "VerifiedExternalResearcher";
            case 3301:
                return "VerseGroupRole";
            case 3302:
                return "VerseGroupURL";
            case 3303:
                return "VerseParticipant";
            case 3304:
                return VersionedCapability.TAG;
            case 3305:
                return "Vertical";
            case 3306:
                return "VerticalExperimental";
            case 3307:
                return "Video";
            case 3308:
                return "VideoAsset";
            case 3309:
                return "VideoAuditionSubmission";
            case 3310:
                return "VideoBroadcast";
            case 3311:
                return "VideoBulkUploadImporterZipState";
            case 3312:
                return "VideoBulkUploadVideoImportError";
            case 3313:
                return "VideoChainingFeedUnit";
            case 3314:
                return "VideoChannelFeedUnit";
            case 3315:
                return "VideoCommerceInterest";
            case 3316:
                return "VideoCopyright";
            case 3317:
                return "VideoCopyrightPolicy";
            case 3318:
                return "VideoCreator";
            case 3319:
                return "VideoCreatorEnabledStatus";
            case 3320:
                return "VideoCreatorTopFan";
            case 3321:
                return "VideoEventPromotionOptions";
            case 3322:
                return "VideoHomeSection";
            case 3323:
                return "VideoList";
            case 3324:
                return "VideoMonetizationCreator";
            case 3325:
                return "VideoPlaylist";
            case 3326:
                return "VideoPollOption";
            case 3327:
                return "VideoPreviewCard";
            case 3328:
                return "VideoProductTaggingEvent";
            case 3329:
                return "VideoPromotionCampaign";
            case 3330:
                return "VideoPromotionRequest";
            case 3331:
                return "VideoPromotionRequestGeotarget";
            case 3332:
                return "VideoPromotionRequestGeotargetSchedule";
            case 3333:
                return "VideoRemovedMessageFeedback";
            case 3334:
                return "VideoSliderPoll";
            case 3335:
                return "VideoSubtitle";
            case 3336:
                return "VideoSubtitleCaption";
            case 3337:
                return "VideoTemplate";
            case 3338:
                return "VideoTextQuestion";
            case 3339:
                return "VideoTextQuestionPromptCard";
            case 3340:
                return "VideoTextQuestionRespondent";
            case 3341:
                return "VideoTextQuestionResponse";
            case 3342:
                return "VideoTextQuestionResponseCard";
            case 3343:
                return "VideoThumbnail";
            case 3344:
                return "VideoTimeIndex";
            case 3345:
                return "VideoTipJarPayment";
            case 3346:
                return "VideoTipJarSetting";
            case 3347:
                return "VideoWatchAmplifyCampaign";
            case 3348:
                return "VideoWatchHappeningSoonPlacement";
            case 3349:
                return "VideoWatchLiveSpotlightPlacement";
            case 3350:
                return "VideoWatchWelcomeMatPlacement";
            case 3351:
                return "VidwallaBroadcast";
            case 3352:
                return "VidwallaExternalPackage";
            case 3353:
                return "VidwallaSavedGraphic";
            case 3354:
                return "VidwallaStencilPreset";
            case 3355:
                return "VidwallaTOSAccept";
            case 3356:
                return "VidwallaUploadedImage";
            case 3357:
                return "Viewer";
            case 3358:
                return "ViewerConfigurationsConnection";
            case 3359:
                return "ViewerConfigurationsEdge";
            case 3360:
                return "ViewerLocation";
            case 3361:
                return "ViewstateBackedStoryBucketWrapper";
            case 3362:
                return "VirtualProductAttributeType";
            case 3363:
                return "VirtualProductAttributeValue";
            case 3364:
                return "VirtualProductCategory";
            case 3365:
                return "VirtualVideosChannel";
            case 3366:
                return "VolunteerActivity";
            case 3367:
                return "VolunteerOrganizationSupportRelationship";
            case 3368:
                return "VolunteeringOrganizer";
            case 3369:
                return "VolunteeringSignUp";
            case 3370:
                return "VoterRegistrationDrive";
            case 3371:
                return "VoyagerTrendingCuratedUnitElement";
            case 3372:
                return "WECCustomer";
            case 3373:
                return "WECGroupRecipient";
            case 3374:
                return "WECMailboxAccount";
            case 3375:
                return "WECMessage";
            case 3376:
                return "WECMessageAudio";
            case 3377:
                return "WECMessageFile";
            case 3378:
                return "WECMessageImage";
            case 3379:
                return "WECMessageVideo";
            case 3380:
                return "WYSIWIGInlineCommentThread";
            case 3381:
                return "WYSIWYGCoEditingDocumentSnapshotVersion";
            case 3382:
                return "Wager";
            case 3383:
                return "WagerEvent";
            case 3384:
                return "WagerOption";
            case 3385:
                return "WatchCMSAsset";
            case 3386:
                return "WatchCMSBonusContent";
            case 3387:
                return "WatchCMSBusinessPartner";
            case 3388:
                return "WatchCMSContract";
            case 3389:
                return "WatchCMSDeal";
            case 3390:
                return "WatchCMSDealEngagementType";
            case 3391:
                return "WatchCMSEpisode";
            case 3392:
                return "WatchCMSEvent";
            case 3393:
                return "WatchCMSFundingModel";
            case 3394:
                return "WatchCMSLegalEntity";
            case 3395:
                return "WatchCMSLiveBroadcastConfiguration";
            case 3396:
                return "WatchCMSMediaGroup";
            case 3397:
                return "WatchCMSMutationRecord";
            case 3398:
                return "WatchCMSNote";
            case 3399:
                return "WatchCMSPartner";
            case 3400:
                return "WatchCMSPremiumPackageMetadata";
            case 3401:
                return "WatchCMSProductionShoot";
            case 3402:
                return "WatchCMSSchedule";
            case 3403:
                return "WatchCMSSeason";
            case 3404:
                return "WatchCMSTable";
            case 3405:
                return "WatchCMSVendor";
            case 3406:
                return "WatchQueueItem";
            case 3407:
                return "WatchTopicChannel";
            case 3408:
                return "WatchUserInfo";
            case 3409:
                return "WemPrivateSharingControl";
            case 3410:
                return "WhatsAppBusinessAccount";
            case 3411:
                return "WhatsAppBusinessPaymentAccount";
            case 3412:
                return "WhatsAppBusinessProfile";
            case 3413:
                return "WhatsAppMonthlyInvoicing";
            case 3414:
                return "WhitehatBugcrowdPayment";
            case 3415:
                return "WhitehatHackerOnePayment";
            case 3416:
                return "WhitehatMessage";
            case 3417:
                return "WhitehatPayout";
            case 3418:
                return "WhitehatPrivateBountyProd";
            case 3419:
                return "WhitehatResearcherGroup";
            case 3420:
                return "WhitehatResearcherSettings";
            case 3421:
                return "WhitehatSubmission";
            case 3422:
                return "WoodhengeCreator";
            case 3423:
                return "WoodhengePurchasedPAYGReceipt";
            case 3424:
                return "WoodhengeSupporter";
            case 3425:
                return "Work1StackAdminNomination";
            case 3426:
                return "Work1StackMigration";
            case 3427:
                return "WorkAccessRequestCompanyNotice";
            case 3428:
                return "WorkAddressBook";
            case 3429:
                return "WorkAddressBookContact";
            case 3430:
                return "WorkAdminActionStatus";
            case 3431:
                return "WorkAppAdminApproval";
            case 3432:
                return "WorkApproval";
            case 3433:
                return "WorkApprovalHeader";
            case 3434:
                return "WorkApprovalRecipient";
            case 3435:
                return "WorkApprovalReminder";
            case 3436:
                return "WorkApprovalSourceDocument";
            case 3437:
                return "WorkApprovalSourceDocumentVersion";
            case 3438:
                return "WorkApprovalSourceIntegration";
            case 3439:
                return "WorkApprovalSyncEvent";
            case 3440:
                return "WorkCSVExport";
            case 3441:
                return "WorkCampaign";
            case 3442:
                return "WorkChecklist";
            case 3443:
                return "WorkChecklistItem";
            case 3444:
                return "WorkCompanyFeatureConfig";
            case 3445:
                return "WorkCompanyInsightsSegment";
            case 3446:
                return "WorkCompanyPricePlan";
            case 3447:
                return "WorkCompanyPricePlanEntry";
            case 3448:
                return "WorkCompanyPricingModel";
            case 3449:
                return "WorkCompromisedCredentialSecurityAlert";
            case 3450:
                return "WorkContentReport";
            case 3451:
                return "WorkContentReportCompanyNotice";
            case 3452:
                return "WorkCustomPermissionsRole";
            case 3453:
                return "WorkCustomScopedPermissionRole";
            case 3454:
                return "WorkDefaultGroupsRule";
            case 3455:
                return "WorkDefaultPermissionsRole";
            case 3456:
                return "WorkDemoTemplateConfig";
            case 3457:
                return "WorkDeviceDistributor";
            case 3458:
                return "WorkDeviceITAPCompany";
            case 3459:
                return "WorkDeviceITAPExistingCompanyOrderInvite";
            case 3460:
                return "WorkDeviceITAPNewCompanyInvite";
            case 3461:
                return "WorkDeviceOrder";
            case 3462:
                return "WorkDeviceUnpublishedOrder";
            case 3463:
                return "WorkEmailDomain";
            case 3464:
                return "WorkEmailRequestedAccess";
            case 3465:
                return "WorkEmployeeAnnouncementCompanyNotice";
            case 3466:
                return "WorkEndorsement";
            case 3467:
                return "WorkExperience";
            case 3468:
                return "WorkExperimentExposuresToCompany";
            case 3469:
                return "WorkFeatureAnnouncement";
            case 3470:
                return "WorkForm";
            case 3471:
                return "WorkFrontlineManagerProvisionRequest";
            case 3472:
                return "WorkGroupContextualProfile";
            case 3473:
                return "WorkGroupCoverPhotoPreset";
            case 3474:
                return "WorkGroupDeletionAdminOperation";
            case 3475:
                return "WorkIDPSnapshot";
            case 3476:
                return "WorkIDPSnapshotUser";
            case 3477:
                return "WorkImportAppSettings";
            case 3478:
                return "WorkKnowledgeAppContent";
            case 3479:
                return "WorkKnowledgeAudience";
            case 3480:
                return "WorkKnowledgeCollaborativePostDocument";
            case 3481:
                return "WorkKnowledgeCollection";
            case 3482:
                return "WorkKnowledgeCustomHomePage";
            case 3483:
                return "WorkKnowledgeDocument";
            case 3484:
                return "WorkKnowledgeDocumentCounter";
            case 3485:
                return "WorkKnowledgeDocumentVersion";
            case 3486:
                return "WorkKnowledgeFile";
            case 3487:
                return "WorkKnowledgeFileRevision";
            case 3488:
                return "WorkKnowledgeQuickLink";
            case 3489:
                return "WorkMeetingSpace";
            case 3490:
                return "WorkMicroPulseDecimalAnswer";
            case 3491:
                return "WorkMicroPulseDecimalSliderQuestion";
            case 3492:
                return "WorkMicroPulseFreeTextAnswer";
            case 3493:
                return "WorkMicroPulseFreeTextQuestion";
            case 3494:
                return "WorkMicroPulseLikertAnswer";
            case 3495:
                return "WorkMicroPulseLikertQuestion";
            case 3496:
                return "WorkMicroPulseMultipleChoiceAnswer";
            case 3497:
                return "WorkMicroPulseMultipleChoiceQuestion";
            case 3498:
                return "WorkMicroPulseParticipation";
            case 3499:
                return "WorkMicroPulsePercentageAnswer";
            case 3500:
                return "WorkMicroPulsePercentageQuestion";
            case 3501:
                return "WorkMicroPulseQuestionOption";
            case 3502:
                return "WorkMicroPulseSingleChoiceAnswer";
            case 3503:
                return "WorkMicroPulseSingleChoiceQuestion";
            case 3504:
                return "WorkMicroPulseSurvey";
            case 3505:
                return "WorkMicroPulseSurveyRun";
            case 3506:
                return "WorkModeratorDecision";
            case 3507:
                return "WorkMultiPartyAuthorisationSettings";
            case 3508:
                return "WorkOAuthCompanyNotice";
            case 3509:
                return "WorkOculusDevice";
            case 3510:
                return "WorkOculusDeviceITAPGroup";
            case 3511:
                return "WorkPersonalTask";
            case 3512:
                return "WorkProfileFieldsSet";
            case 3513:
                return "WorkProjectExperience";
            case 3514:
                return "WorkPromotedPostCompanyNotice";
            case 3515:
                return "WorkResellerExistingUserInvite";
            case 3516:
                return "WorkResellerLink";
            case 3517:
                return "WorkResellerNewCompanyInvite";
            case 3518:
                return "WorkResourcesLink";
            case 3519:
                return "WorkResourcesSection";
            case 3520:
                return "WorkSSOProvider";
            case 3521:
                return "WorkSafetyCheckStatus";
            case 3522:
                return "WorkSafetyCheckTemplate";
            case 3523:
                return "WorkSafetyCrisis";
            case 3524:
                return "WorkSafetyCrisisEventConfig";
            case 3525:
                return "WorkScheduledCollabPost";
            case 3526:
                return "WorkScheduledResellerLink";
            case 3527:
                return "WorkSecurityLog";
            case 3528:
                return "WorkShiftSwap";
            case 3529:
                return "WorkSkill";
            case 3530:
                return "WorkSurveyMultiRunConfig";
            case 3531:
                return "WorkTeam";
            case 3532:
                return "WorkTeamResourcesLink";
            case 3533:
                return "WorkTeamResourcesSection";
            case 3534:
                return "WorkThanks";
            case 3535:
                return "WorkUserDoNotDisturbSchedule";
            case 3536:
                return "WorkUserDoNotDisturbWeeklyRecurringItem";
            case 3537:
                return "WorkUserError";
            case 3538:
                return "WorkUserInstall";
            case 3539:
                return "WorkplaceExistingMessengerThread";
            case 3540:
                return "WorkplaceExternalCase";
            case 3541:
                return "WorkplaceMonthlyInvoicing";
            case 3542:
                return "WorkplaceNonExistingMessengerThread";
            case 3543:
                return "WorkplaceNullstatePostSuggestion";
            case 3544:
                return "WorkplaceReseller";
            case 3545:
                return "Workroom";
            case 3546:
                return "WorkroomMeeting";
            case 3547:
                return "WorkroomUserPreferences";
            case 3548:
                return "WorkroomUserSettings";
            case 3549:
                return "WorkroomsAgentRequest";
            case 3550:
                return "WorkroomsScreenSharingPhoto";
            case 3551:
                return "WorkstreamConfiguration";
            case 3552:
                return "WorkstreamField";
            case 3553:
                return "WorkstreamFile";
            case 3554:
                return "WorkstreamInstance";
            case 3555:
                return "WorkstreamStage";
            case 3556:
                return "WorkstreamStep";
            case 3557:
                return "XPPExternalCase";
            case 3558:
                return "XRSceneObjectInstance";
            case 3559:
                return "XrayModel";
            case 3560:
                return "ZeroCMSNative";
            case 3561:
                return "ZipLiftPaidSearchStudy";
            default:
                return "UNSET";
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0030 A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static int A00(String r7) {
        if (r7 != 0 && !r7.isEmpty()) {
            int length = r7.length();
            switch (((Character.toUpperCase(r7.charAt(0)) * 961) + (Character.toUpperCase(r7.charAt(length - 1)) * 31) + length) & 2047) {
                case 0:
                    if (r7.equals("ScheduledQuietMode")) {
                        return 2858;
                    }
                    if (!r7.equals("StoreOrderPurchase")) {
                        return 0;
                    }
                    return 3036;
                case 1:
                    if (r7.equals("SCPurchaseOrderLine")) {
                        return 2702;
                    }
                    if (r7.equals("ScimCompanyJobTitle")) {
                        return 2869;
                    }
                    break;
                case 2:
                    if (r7.equals("SCInvoicePaymentLine")) {
                        return 2691;
                    }
                    if (r7.equals("SCSupplierSiteChange")) {
                        return 2722;
                    }
                    if (r7.equals("SourcingMessageState")) {
                        return 2994;
                    }
                    if (r7.equals("SupportCaseMpDispute")) {
                        return 3125;
                    }
                    break;
                case 3:
                    if (r7.equals("FaceModel")) {
                        return 957;
                    }
                    if (r7.equals("SRTJobAuditMailTriage")) {
                        return 2776;
                    }
                    if (r7.equals("SRTJobLegalMailTriage")) {
                        return 2777;
                    }
                    if (r7.equals("SchoolClassExperience")) {
                        return 2861;
                    }
                    if (r7.equals("SchoolCommunityCourse")) {
                        return 2862;
                    }
                    if (r7.equals("SchoolCommunityInvite")) {
                        return 2863;
                    }
                    if (r7.equals("SocialVRPackageBundle")) {
                        return 2961;
                    }
                    if (r7.equals("SourcingEventResponse")) {
                        return 2990;
                    }
                    if (r7.equals("StandardMessengerCode")) {
                        return 3018;
                    }
                    break;
                case 4:
                    if (r7.equals("SavableCommerceFeature")) {
                        return 2847;
                    }
                    break;
                case 5:
                    if (r7.equals("SCSupplierAddressChange")) {
                        return 2713;
                    }
                    if (r7.equals("StorePhysicalOfferPrice")) {
                        return 3043;
                    }
                    if (r7.equals("SupportCaseMpC2CDispute")) {
                        return 3123;
                    }
                    break;
                case 6:
                    if (r7.equals("SourcingQuestionTemplate")) {
                        return 3000;
                    }
                    if (r7.equals("StructuredSurveyFlowPage")) {
                        return 3102;
                    }
                    break;
                case 7:
                    if (r7.equals("SCProcureToPaySupportCase")) {
                        return 2699;
                    }
                    if (r7.equals("StarsCustomCreatorMessage")) {
                        return 3019;
                    }
                    break;
                case 9:
                    if (r7.equals("SCSupplierBankAccountChange")) {
                        return 2718;
                    }
                    if (r7.equals("ShowreelNativeDocumentState")) {
                        return 2929;
                    }
                    if (r7.equals("StructuredSurveyControlNode")) {
                        return 3098;
                    }
                    break;
                case 10:
                    if (r7.equals("ShoppingDocumentElementsEdge")) {
                        return 2920;
                    }
                    if (r7.equals("SourcingEventEvaluationScore")) {
                        return 2986;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER:
                    if (r7.equals("SupportCaseMCOMP2MBuyerDispute")) {
                        return 3122;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_BADGE:
                    if (r7.equals("SRTConsumerHardwareSearchDevice")) {
                        return 2751;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_LINK:
                    if (r7.equals("ForSaleShippingLabel")) {
                        return 1013;
                    }
                    if (r7.equals("SRTPartnerAssessmentQuestionRule")) {
                        return 2801;
                    }
                    break;
                case 15:
                    if (r7.equals("BloodDonationLead")) {
                        return 353;
                    }
                    if (r7.equals("LeadGenLegalContentCheckbox")) {
                        return 1478;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                    if (r7.equals("BCPAccountingPeriod")) {
                        return 325;
                    }
                    if (r7.equals("SupportCorrespondenceCommonResponse")) {
                        return 3128;
                    }
                    if (r7.equals("WorkUserDoNotDisturbWeeklyRecurringItem")) {
                        return 3536;
                    }
                    break;
                case 18:
                    if (r7.equals("SRTPartnerAssessmentQuestionResponse")) {
                        return 2800;
                    }
                    break;
                case 19:
                    if (r7.equals("FirmwareOTAReleaseChannel")) {
                        return 994;
                    }
                    if (r7.equals("SCSupplierBankAccountAssignmentChange")) {
                        return 2717;
                    }
                    break;
                case 20:
                    if (r7.equals("WagerOption")) {
                        return 3384;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING:
                    if (r7.equals("WorkCampaign")) {
                        return 3441;
                    }
                    break;
                case C120125Dh.NUM_VIEW_TYPES:
                    if (r7.equals("BusinessInboxEmailThread")) {
                        return 399;
                    }
                    break;
                case 23:
                    if (r7.equals("WatchCMSSeason")) {
                        return 3403;
                    }
                    break;
                case 24:
                    if (r7.equals("WorkEmailDomain")) {
                        return 3463;
                    }
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT:
                    if (r7.equals("ServicesStaff")) {
                        return 2911;
                    }
                    break;
                case 27:
                    if (r7.equals("WhitehatSubmission")) {
                        return 3421;
                    }
                    break;
                case 28:
                    if (r7.equals("Work1StackMigration")) {
                        return 3426;
                    }
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    if (r7.equals("WorkCompanyPricePlan")) {
                        return 3446;
                    }
                    if (r7.equals("WorkResourcesSection")) {
                        return 3519;
                    }
                    break;
                case 30:
                    if (r7.equals("WorkModeratorDecision")) {
                        return 3506;
                    }
                    break;
                case 31:
                    if (r7.equals("FBForm")) {
                        return 915;
                    }
                    break;
                case 32:
                    if (r7.equals("LocationParty")) {
                        return 1597;
                    }
                    if (r7.equals("WorkKnowledgeCollection")) {
                        return 3481;
                    }
                    if (r7.equals("WorkMicroPulseSurveyRun")) {
                        return 3505;
                    }
                    if (r7.equals("WorkstreamConfiguration")) {
                        return 3551;
                    }
                    break;
                case 33:
                    if (r7.equals("BoostedComponentEditResponsePayload")) {
                        return 364;
                    }
                    if (r7.equals("LocalCommunity")) {
                        return 1583;
                    }
                    if (r7.equals("WorkTeamResourcesSection")) {
                        return 3533;
                    }
                    break;
                case 34:
                    if (r7.equals("LeadOpportunity")) {
                        return 1488;
                    }
                    if (r7.equals("Work1StackAdminNomination")) {
                        return 3425;
                    }
                    if (r7.equals("WorkKnowledgeFileRevision")) {
                        return 3487;
                    }
                    break;
                case 35:
                    if (r7.equals("BoostedComponentCreateResponsePayload")) {
                        return 362;
                    }
                    if (r7.equals("BoostedComponentDeleteResponsePayload")) {
                        return 363;
                    }
                    break;
                case 36:
                    if (r7.equals("LegalMatterEntity")) {
                        return 1509;
                    }
                    if (r7.equals("WorkMicroPulseParticipation")) {
                        return 3498;
                    }
                    break;
                case 37:
                    if (r7.equals("WorkKnowledgeDocumentVersion")) {
                        return 3485;
                    }
                    if (r7.equals("WorkMicroPulseLikertQuestion")) {
                        return 3495;
                    }
                    if (r7.equals("WorkMicroPulseQuestionOption")) {
                        return 3501;
                    }
                    break;
                case 38:
                    if (r7.equals("BiBoostedPostAppealCreateResponsePayload")) {
                        return 331;
                    }
                    if (r7.equals("InstagramUserV2")) {
                        return 1342;
                    }
                    if (r7.equals("LegalMatterActivity")) {
                        return 1502;
                    }
                    if (r7.equals("WorkApprovalSourceIntegration")) {
                        return 3438;
                    }
                    break;
                case 39:
                    if (r7.equals("InstagramMediaV2")) {
                        return 1327;
                    }
                    if (r7.equals("WorkMicroPulseFreeTextQuestion")) {
                        return 3493;
                    }
                    break;
                case 40:
                    if (r7.equals("WorkGroupDeletionAdminOperation")) {
                        return 3474;
                    }
                    break;
                case 41:
                    if (r7.equals("BDSignalType")) {
                        return 326;
                    }
                    if (r7.equals("BizAppDevice")) {
                        return 341;
                    }
                    if (r7.equals("FranchiseProgram")) {
                        return 1020;
                    }
                    if (r7.equals("LegalMatterTagActivity")) {
                        return 1526;
                    }
                    if (r7.equals("WorkMicroPulsePercentageQuestion")) {
                        return 3500;
                    }
                    if (r7.equals("WorkplaceNullstatePostSuggestion")) {
                        return 3543;
                    }
                    break;
                case 42:
                    if (r7.equals("BusinessImage")) {
                        return 398;
                    }
                    if (r7.equals("FoodDrinkMenuItem")) {
                        return 1007;
                    }
                    if (r7.equals("WorkApprovalSourceDocumentVersion")) {
                        return 3437;
                    }
                    break;
                case 43:
                    if (r7.equals("LegalMatterPartyActivity")) {
                        return 1524;
                    }
                    if (r7.equals("WatchCMSLiveBroadcastConfiguration")) {
                        return 3395;
                    }
                    if (r7.equals("WorkMicroPulseSingleChoiceQuestion")) {
                        return 3503;
                    }
                    break;
                case 44:
                    if (r7.equals("WorkMicroPulseDecimalSliderQuestion")) {
                        return 3491;
                    }
                    break;
                case 45:
                    if (r7.equals("BCMPBrandProfile")) {
                        return 307;
                    }
                    if (r7.equals("BCMPGroupProfile")) {
                        return 312;
                    }
                    if (r7.equals("FoodDrinkSubMenuItem")) {
                        return 1011;
                    }
                    if (r7.equals("LegalMatterKeyDateActivity")) {
                        return 1516;
                    }
                    if (r7.equals("WorkMicroPulseMultipleChoiceQuestion")) {
                        return 3497;
                    }
                    break;
                case 46:
                    if (r7.equals("BasicExternalCase")) {
                        return 328;
                    }
                    if (r7.equals("LegalMatterDocumentActivity")) {
                        return 1506;
                    }
                    break;
                case 47:
                    if (r7.equals("BCMPCreatorProfile")) {
                        return 309;
                    }
                    if (r7.equals("LegalMatterNarrativeActivity")) {
                        return 1519;
                    }
                    break;
                case 48:
                    if (r7.equals("Song")) {
                        return 2967;
                    }
                    if (r7.equals("WYSIWYGCoEditingDocumentSnapshotVersion")) {
                        return 3381;
                    }
                    break;
                case 49:
                    if (r7.equals("BCMPInstagramProfile")) {
                        return 313;
                    }
                    if (r7.equals("BusinessPresenceNode")) {
                        return 407;
                    }
                    if (r7.equals("FreeformInterviewProblem")) {
                        return 1022;
                    }
                    break;
                case AMD.MAX_LIKES_PER_FETCH:
                    if (r7.equals("LoyaltyMessageForProgramHistory")) {
                        return 1609;
                    }
                    break;
                case 51:
                    if (r7.equals("BCPAccountingEntryLine")) {
                        return 321;
                    }
                    if (r7.equals("LegalMatterRelatedMatterActivity")) {
                        return 1525;
                    }
                    break;
                case 52:
                    if (r7.equals("BCMPInterestedBrandPage")) {
                        return 315;
                    }
                    if (r7.equals("BoostedComponentMessage")) {
                        return 366;
                    }
                    break;
                case 53:
                    if (r7.equals("BCMPProjectBriefResponse")) {
                        return 317;
                    }
                    if (r7.equals("BCPAccountingJournalLine")) {
                        return 324;
                    }
                    if (r7.equals("BillableOfferQuotingRule")) {
                        return 334;
                    }
                    if (r7.equals("BoostedComponentAudience")) {
                        return 361;
                    }
                    if (r7.equals("LegalMatterFinancialImpactActivity")) {
                        return 1513;
                    }
                    if (r7.equals("LegalMatterOutsideCounselDiversity")) {
                        return 1520;
                    }
                    if (r7.equals("WatchUserInfo")) {
                        return 3408;
                    }
                    break;
                case 54:
                    if (r7.equals("BizMarketingEmailAudience")) {
                        return 346;
                    }
                    if (r7.equals("StickerTag")) {
                        return 3025;
                    }
                    break;
                case 55:
                    if (r7.equals("BusinessAppStoreAppProfile")) {
                        return 384;
                    }
                    if (r7.equals("WECMessageAudio")) {
                        return 3376;
                    }
                    if (r7.equals("WECMessageVideo")) {
                        return 3379;
                    }
                    break;
                case 56:
                    if (r7.equals("StoreCatalog")) {
                        return 3030;
                    }
                    if (r7.equals("SurveyConfig")) {
                        return 3138;
                    }
                    break;
                case 58:
                    if (r7.equals("ScimCompanyOrg")) {
                        return 2870;
                    }
                    break;
                case 59:
                    if (r7.equals("SplitTestConfig")) {
                        return 3010;
                    }
                    break;
                case 61:
                    if (r7.equals("StickerTrayConfig")) {
                        return 3026;
                    }
                    break;
                case 63:
                    if (r7.equals("BizMarketingPublishedEmailAudience")) {
                        return 348;
                    }
                    if (r7.equals("SpacesMarkerDrawing")) {
                        return 3008;
                    }
                    break;
                case 66:
                    if (r7.equals("SharedMonthlyInvoicing")) {
                        return 2917;
                    }
                    if (r7.equals("SocialVRCustomWorldTag")) {
                        return 2957;
                    }
                    break;
                case 67:
                    if (r7.equals("HaloAnnotator")) {
                        return 1202;
                    }
                    if (r7.equals("SourcingWorksheetConfig")) {
                        return 3006;
                    }
                    if (r7.equals("WorkroomsScreenSharingPhoto")) {
                        return 3550;
                    }
                    break;
                case 68:
                    if (r7.equals("FBFormOption")) {
                        return 922;
                    }
                    break;
                case 70:
                    if (r7.equals("FBCMGeoPolygon")) {
                        return 908;
                    }
                    if (r7.equals("FBFormQuestion")) {
                        return 924;
                    }
                    break;
                case 71:
                    if (r7.equals("StoryCardLWRAnimationConfig")) {
                        return 3065;
                    }
                    if (r7.equals("UserBillableAccountSoftTaxAck")) {
                        return 3277;
                    }
                    break;
                case 72:
                    if (r7.equals("FBCMIntervention")) {
                        return 909;
                    }
                    if (r7.equals("FBFormDefinition")) {
                        return 918;
                    }
                    if (r7.equals("FolderCollection")) {
                        return 1003;
                    }
                    break;
                case 73:
                    if (r7.equals("FBCMTagCollection")) {
                        return 911;
                    }
                    if (r7.equals("HelpCommunityAnswer")) {
                        return 1214;
                    }
                    if (r7.equals("HomeServiceProvider")) {
                        return 1221;
                    }
                    break;
                case 74:
                    if (r7.equals("FundraiserCampaign")) {
                        return 1033;
                    }
                    if (r7.equals("FundraiserDonation")) {
                        return 1039;
                    }
                    if (r7.equals("ServicesFollowUpMessageSetting")) {
                        return 2900;
                    }
                    break;
                case 76:
                    if (r7.equals("BCMPProjectBrief")) {
                        return 316;
                    }
                    if (r7.equals("FBRecruitingQuestion")) {
                        return 940;
                    }
                    break;
                case 77:
                    if (r7.equals("FBCMProgramCollection")) {
                        return 910;
                    }
                    break;
                case 78:
                    if (r7.equals("FMPTSClientInformation")) {
                        return 953;
                    }
                    break;
                case 79:
                    if (r7.equals("FixedCostShippingOption")) {
                        return 996;
                    }
                    if (r7.equals("FundraiserDraftCreation")) {
                        return 1040;
                    }
                    break;
                case 81:
                    if (r7.equals("FacebookBusinessExtension")) {
                        return 959;
                    }
                    if (r7.equals("FundraiserPersonForPerson")) {
                        return 1047;
                    }
                    if (r7.equals("FundraiserProfileDonation")) {
                        return 1049;
                    }
                    break;
                case 82:
                    if (r7.equals("FBRecruitingQuestionOption")) {
                        return 941;
                    }
                    if (r7.equals("FundraiserForStoryDonation")) {
                        return 1042;
                    }
                    break;
                case 84:
                    if (r7.equals("WorkShiftSwap")) {
                        return 3528;
                    }
                    break;
                case 85:
                    if (r7.equals("WorkstreamStep")) {
                        return 3556;
                    }
                    break;
                case 87:
                    if (r7.equals("FacecastFirstCommentAggregation")) {
                        return 964;
                    }
                    break;
                case 88:
                    if (r7.equals("UserFundingGoal")) {
                        return 3279;
                    }
                    break;
                case 89:
                    if (r7.equals("UnimogObjectCell")) {
                        return 3263;
                    }
                    if (r7.equals("WatchCMSMediaGroup")) {
                        return 3396;
                    }
                    break;
                case 90:
                    if (r7.equals("FundraiserCrisisForCharityDonation")) {
                        return 1038;
                    }
                    break;
                case 94:
                    if (r7.equals("FacecastCountHashtagCommentAggregation")) {
                        return 962;
                    }
                    if (r7.equals("WhitehatResearcherGroup")) {
                        return 3419;
                    }
                    break;
                case 95:
                    if (r7.equals("FacecastCountSpecificCommentAggregation")) {
                        return 963;
                    }
                    break;
                case 96:
                    if (r7.equals("SavedRecruitingSearch")) {
                        return 2853;
                    }
                    if (r7.equals("WorkOculusDeviceITAPGroup")) {
                        return 3510;
                    }
                    break;
                case 98:
                    if (r7.equals("FacebookPro")) {
                        return 961;
                    }
                    break;
                case 101:
                    if (r7.equals("BCMPRating")) {
                        return 318;
                    }
                    break;
                case 102:
                    if (r7.equals("DeveloperTask")) {
                        return 706;
                    }
                    break;
                case 103:
                    if (r7.equals("BishopConfig")) {
                        return 340;
                    }
                    break;
                case 104:
                    if (r7.equals("FBStoryPortalInfo")) {
                        return 950;
                    }
                    if (r7.equals("FeaturedAdminInfo")) {
                        return 985;
                    }
                    break;
                case 106:
                    if (r7.equals("BusinessTextTag")) {
                        return 412;
                    }
                    break;
                case 107:
                    if (r7.equals("FeedbackReactionInfo")) {
                        return 988;
                    }
                    break;
                case 108:
                    if (r7.equals("BusinessCRMConfig")) {
                        return 387;
                    }
                    if (r7.equals("FundraiserCreatePromo")) {
                        return 1036;
                    }
                    break;
                case 110:
                    if (r7.equals("BusinessActivityLog")) {
                        return 382;
                    }
                    break;
                case 111:
                    if (r7.equals("DeletedContentFeedback")) {
                        return 693;
                    }
                    break;
                case 113:
                    if (r7.equals("BatchReviewQueueConfig")) {
                        return 330;
                    }
                    break;
                case 114:
                    if (r7.equals("BizMarketingEmailConfig")) {
                        return 347;
                    }
                    break;
                case 117:
                    if (r7.equals("DocumentRelatedArticlesBlock")) {
                        return 736;
                    }
                    if (r7.equals("QuietMode")) {
                        return 2569;
                    }
                    if (r7.equals("SwitchOffMI")) {
                        return 3144;
                    }
                    break;
                case 118:
                    if (r7.equals("BusinessActivityFeedSetting")) {
                        return 381;
                    }
                    break;
                case 119:
                    if (r7.equals("QuickInvite")) {
                        return 2564;
                    }
                    break;
                case 120:
                    if (r7.equals("QuizResponse")) {
                        return 2577;
                    }
                    break;
                case 122:
                    if (r7.equals("BusinessHomePageCardUserSetting")) {
                        return 396;
                    }
                    break;
                case 124:
                    if (r7.equals("BusinessHomeAlertsCardUserSetting")) {
                        return 395;
                    }
                    break;
                case 127:
                    if (r7.equals("DSCDeal")) {
                        return 665;
                    }
                    if (r7.equals("HaloProject")) {
                        return 1206;
                    }
                    break;
                case 128:
                    if (r7.equals("DSCLabel")) {
                        return 673;
                    }
                    if (r7.equals("QuizQuestionResponse")) {
                        return 2575;
                    }
                    break;
                case 129:
                    if (r7.equals("FBFormGroup")) {
                        return 920;
                    }
                    if (r7.equals("HotspotEffect")) {
                        return 1229;
                    }
                    break;
                case 130:
                    if (r7.equals("OxsightsWavelandData")) {
                        return 2194;
                    }
                    break;
                case 132:
                    if (r7.equals("BusinessHomeAdsPerformanceCardUserSetting")) {
                        return 394;
                    }
                    if (r7.equals("HorizonWorldStat")) {
                        return 1227;
                    }
                    break;
                case 133:
                    if (r7.equals("OxsightsPartnerMetadata")) {
                        return 2183;
                    }
                    break;
                case 134:
                    if (r7.equals("FBFormDefaultApp")) {
                        return 917;
                    }
                    if (r7.equals("FriendingCheckup")) {
                        return 1030;
                    }
                    break;
                case 135:
                    if (r7.equals("BusinessActivityFeedPerformanceWidgetSetting")) {
                        return 380;
                    }
                    if (r7.equals("DummyCredential")) {
                        return 745;
                    }
                    if (r7.equals("FBFormContractApp")) {
                        return 916;
                    }
                    if (r7.equals("HaloQueueAssignment")) {
                        return 1207;
                    }
                    break;
                case 136:
                    if (r7.equals("FamilyRelationship")) {
                        return 973;
                    }
                    if (r7.equals("HackerCupParticipant")) {
                        return 1197;
                    }
                    break;
                case 138:
                    if (r7.equals("Wager")) {
                        return 3382;
                    }
                    break;
                case 141:
                    if (r7.equals("FBFormSupplierInviteApp")) {
                        return 930;
                    }
                    break;
                case 142:
                    if (r7.equals("HelpCommunityAnswerComment")) {
                        return 1215;
                    }
                    break;
                case 144:
                    if (r7.equals("FBFormPartnerAssessmentApp")) {
                        return 923;
                    }
                    if (r7.equals("WECCustomer")) {
                        return 3372;
                    }
                    break;
                case 145:
                    if (r7.equals("BizAppsSavedPowerSearch")) {
                        return 343;
                    }
                    if (r7.equals("HackerCupClarificationRequest")) {
                        return 1194;
                    }
                    break;
                case 146:
                    if (r7.equals("HorizonTransitionScreenContent")) {
                        return 1225;
                    }
                    if (r7.equals("WorkUserError")) {
                        return 3537;
                    }
                    break;
                case 147:
                    if (r7.equals("WatchCMSVendor")) {
                        return 3405;
                    }
                    break;
                case 148:
                    if (r7.equals("WatchCMSPartner")) {
                        return 3399;
                    }
                    if (r7.equals("WorkDeviceOrder")) {
                        return 3461;
                    }
                    if (r7.equals("WorkSSOProvider")) {
                        return 3520;
                    }
                    break;
                case 149:
                    if (r7.equals("WoodhengeCreator")) {
                        return 3422;
                    }
                    break;
                case 150:
                    if (r7.equals("WorkplaceReseller")) {
                        return 3544;
                    }
                    break;
                case 151:
                    if (r7.equals("WoodhengeSupporter")) {
                        return 3424;
                    }
                    if (r7.equals("WorkApprovalHeader")) {
                        return 3433;
                    }
                    break;
                case 152:
                    if (r7.equals("WorkIDPSnapshotUser")) {
                        return 3476;
                    }
                    break;
                case 153:
                    if (r7.equals("WorkApprovalReminder")) {
                        return 3435;
                    }
                    break;
                case 154:
                    if (r7.equals("WorkDeviceDistributor")) {
                        return 3457;
                    }
                    break;
                case 156:
                    if (r7.equals("JobTaxonomy")) {
                        return 1426;
                    }
                    if (r7.equals("WatchCMSBusinessPartner")) {
                        return 3387;
                    }
                    break;
                case 158:
                    if (r7.equals("UserFundingSubscription")) {
                        return 3281;
                    }
                    break;
                case 159:
                    if (r7.equals("UnimogObjectSitusPolygon")) {
                        return 3266;
                    }
                    if (r7.equals("WorkDeviceUnpublishedOrder")) {
                        return 3462;
                    }
                    if (r7.equals("WorkMicroPulseLikertAnswer")) {
                        return 3494;
                    }
                    break;
                case 160:
                    if (r7.equals("UnimogObjectCustomPolygon")) {
                        return 3264;
                    }
                    if (r7.equals("WorkMicroPulseDecimalAnswer")) {
                        return 3490;
                    }
                    break;
                case 161:
                    if (r7.equals("UnimogObjectLISavedPolygon")) {
                        return 3265;
                    }
                    if (r7.equals("WorkKnowledgeDocumentCounter")) {
                        return 3484;
                    }
                    if (r7.equals("WorkMicroPulseFreeTextAnswer")) {
                        return 3492;
                    }
                    break;
                case 162:
                    if (r7.equals("FleetBeaconLQ")) {
                        return 998;
                    }
                    if (r7.equals("HackerCupClarificationRequestMessageAttachment")) {
                        return 1196;
                    }
                    if (r7.equals("JobBrowserAdStory")) {
                        return 1421;
                    }
                    break;
                case 163:
                    if (r7.equals("WorkMicroPulsePercentageAnswer")) {
                        return 3499;
                    }
                    break;
                case 165:
                    if (r7.equals("DSCDealProgram")) {
                        return 667;
                    }
                    if (r7.equals("WorkMicroPulseSingleChoiceAnswer")) {
                        return 3502;
                    }
                    break;
                case 167:
                    if (r7.equals("WorkMicroPulseMultipleChoiceAnswer")) {
                        return 3496;
                    }
                    break;
                case 174:
                    if (r7.equals("WorkThanks")) {
                        return 3534;
                    }
                    break;
                case 178:
                    if (r7.equals("SIURLChunk")) {
                        return 2726;
                    }
                    break;
                case 179:
                    if (r7.equals("StickerPack")) {
                        return 3024;
                    }
                    break;
                case 180:
                    if (r7.equals("WorkSafetyCrisis")) {
                        return 3523;
                    }
                    break;
                case 181:
                    if (r7.equals("QuestionTag")) {
                        return 2563;
                    }
                    if (r7.equals("UserLeadGenInfo")) {
                        return 3284;
                    }
                    break;
                case 182:
                    if (r7.equals("SCSupplierBank")) {
                        return 2714;
                    }
                    break;
                case 184:
                    if (r7.equals("WorkroomUserSettings")) {
                        return 3548;
                    }
                    break;
                case 185:
                    if (r7.equals("WorkAdminActionStatus")) {
                        return 3430;
                    }
                    if (r7.equals("WorkImportAppSettings")) {
                        return 3477;
                    }
                    if (r7.equals("WorkSafetyCheckStatus")) {
                        return 3521;
                    }
                    break;
                case 186:
                    if (r7.equals("SpamReportFeedback")) {
                        return 3009;
                    }
                    if (r7.equals("StoryTopicFeedback")) {
                        return 3092;
                    }
                    if (r7.equals("SwipeableFramePack")) {
                        return 3143;
                    }
                    break;
                case 187:
                    if (r7.equals("SupportCaseFeedback")) {
                        return 3121;
                    }
                    if (r7.equals("WorkroomUserPreferences")) {
                        return 3547;
                    }
                    break;
                case 188:
                    if (r7.equals("ServicesBookableTask")) {
                        return 2896;
                    }
                    if (r7.equals("WorkEmailRequestedAccess")) {
                        return 3464;
                    }
                    break;
                case 190:
                    if (r7.equals("OneVCMeetingPublic")) {
                        return 2142;
                    }
                    if (r7.equals("WhitehatResearcherSettings")) {
                        return 3420;
                    }
                    break;
                case 191:
                    if (r7.equals("DSCSeason")) {
                        return 685;
                    }
                    if (r7.equals("FaceCluster")) {
                        return 956;
                    }
                    if (r7.equals("SupportOutreachFeedback")) {
                        return 3136;
                    }
                    break;
                case 193:
                    if (r7.equals("DocRevision")) {
                        return 724;
                    }
                    if (r7.equals("FileIndicator")) {
                        return 991;
                    }
                    break;
                case 194:
                    if (r7.equals("FileDescriptor")) {
                        return 990;
                    }
                    if (r7.equals("FileViewMarker")) {
                        return 992;
                    }
                    if (r7.equals("FoodDrinkOrder")) {
                        return 1008;
                    }
                    break;
                case 195:
                    if (r7.equals("DSCCollection")) {
                        return 664;
                    }
                    break;
                case 197:
                    if (r7.equals("FactCheckProvider")) {
                        return 967;
                    }
                    break;
                case 198:
                    if (r7.equals("DedicatedSection")) {
                        return 692;
                    }
                    break;
                case 199:
                    if (r7.equals("DelightsAnimation")) {
                        return 694;
                    }
                    if (r7.equals("FamilyNonUserMember")) {
                        return 972;
                    }
                    if (r7.equals("FanSupportPackOrder")) {
                        return 976;
                    }
                    if (r7.equals("WorkMultiPartyAuthorisationSettings")) {
                        return 3507;
                    }
                    break;
                case 200:
                    if (r7.equals("FbcRemitReaderHeader")) {
                        return 978;
                    }
                    break;
                case 201:
                    if (r7.equals("FriendOneResearchUser")) {
                        return 1026;
                    }
                    break;
                case 202:
                    if (r7.equals("FranchiseProgramMember")) {
                        return 1021;
                    }
                    break;
                case 203:
                    if (r7.equals("DirectMessageReaction")) {
                        return 714;
                    }
                    break;
                case 204:
                    if (r7.equals("DSCAsperaConfiguration")) {
                        return 661;
                    }
                    break;
                case 205:
                    if (r7.equals("FBRecruitingQuestionOrder")) {
                        return 942;
                    }
                    if (r7.equals("FactCheckablePhotoCluster")) {
                        return 970;
                    }
                    if (r7.equals("FactCheckableVideoCluster")) {
                        return 971;
                    }
                    if (r7.equals("WagerEvent")) {
                        return 3383;
                    }
                    break;
                case 207:
                    if (r7.equals("SOBizVal")) {
                        return 2730;
                    }
                    break;
                case 208:
                    if (r7.equals("ShopLabel")) {
                        return 2918;
                    }
                    if (r7.equals("WatchCMSAsset")) {
                        return 3385;
                    }
                    if (r7.equals("WatchCMSEvent")) {
                        return 3392;
                    }
                    if (r7.equals("WorkCSVExport")) {
                        return 3440;
                    }
                    if (r7.equals("WorkChecklist")) {
                        return 3442;
                    }
                    break;
                case 209:
                    if (r7.equals("WhitehatPayout")) {
                        return 3417;
                    }
                    break;
                case 210:
                    if (r7.equals("WorkEndorsement")) {
                        return 3466;
                    }
                    if (r7.equals("WorkIDPSnapshot")) {
                        return 3475;
                    }
                    break;
                case 211:
                    if (r7.equals("DSCLiveBroadcastConfiguration")) {
                        return 675;
                    }
                    if (r7.equals("StoryChannel")) {
                        return 3080;
                    }
                    if (r7.equals("WatchCMSContract")) {
                        return 3388;
                    }
                    break;
                case 212:
                    if (r7.equals("SCQuoteDetail")) {
                        return 2707;
                    }
                    if (r7.equals("StoryCardPoll")) {
                        return 3068;
                    }
                    if (r7.equals("WECGroupRecipient")) {
                        return 3373;
                    }
                    if (r7.equals("WECMailboxAccount")) {
                        return 3374;
                    }
                    if (r7.equals("WorkContentReport")) {
                        return 3450;
                    }
                    break;
                case 213:
                    if (r7.equals("SRTAmlVertical")) {
                        return 2739;
                    }
                    if (r7.equals("SRTGmsVertical")) {
                        return 2767;
                    }
                    if (r7.equals("SRTTaxVertical")) {
                        return 2833;
                    }
                    if (r7.equals("SecuritySignal")) {
                        return 2885;
                    }
                    break;
                case 214:
                    if (r7.equals("OmegaPeriod")) {
                        return 2139;
                    }
                    if (r7.equals("SRTHaloVertical")) {
                        return 2769;
                    }
                    break;
                case 215:
                    if (r7.equals("FeaturableOnProfileVideoPlaceholder")) {
                        return 983;
                    }
                    if (r7.equals("SRTCasesVertical")) {
                        return 2744;
                    }
                    if (r7.equals("SRTIpOpsVertical")) {
                        return 2773;
                    }
                    if (r7.equals("SRTLegalVertical")) {
                        return 2781;
                    }
                    if (r7.equals("SRTYouthVertical")) {
                        return 2844;
                    }
                    if (r7.equals("WatchCMSBonusContent")) {
                        return 3386;
                    }
                    if (r7.equals("WorkProfileFieldsSet")) {
                        return 3512;
                    }
                    break;
                case 216:
                    if (r7.equals("FeaturableOnProfileFriendPlaceholder")) {
                        return 980;
                    }
                    if (r7.equals("SRTDatingVertical")) {
                        return 2757;
                    }
                    if (r7.equals("SRTDevOpsVertical")) {
                        return 2758;
                    }
                    if (r7.equals("SRTGeoApiVertical")) {
                        return 2763;
                    }
                    if (r7.equals("SRTOculusVertical")) {
                        return 2791;
                    }
                    if (r7.equals("SRTPayComVertical")) {
                        return 2806;
                    }
                    if (r7.equals("WorkApprovalRecipient")) {
                        return 3434;
                    }
                    if (r7.equals("WorkApprovalSyncEvent")) {
                        return 3439;
                    }
                    if (r7.equals("WorkKnowledgeDocument")) {
                        return 3483;
                    }
                    if (r7.equals("WorkroomsAgentRequest")) {
                        return 3549;
                    }
                    break;
                case 217:
                    if (r7.equals("SRTCatalogVertical")) {
                        return 2745;
                    }
                    if (r7.equals("SRTCrmDataVertical")) {
                        return 2755;
                    }
                    if (r7.equals("SRTProdOpsVertical")) {
                        return 2814;
                    }
                    if (r7.equals("SRTProdSecVertical")) {
                        return 2815;
                    }
                    if (r7.equals("SRTSparkArVertical")) {
                        return 2829;
                    }
                    if (r7.equals("SRTSrtDemoVertical")) {
                        return 2830;
                    }
                    if (r7.equals("ScheduledVideoPoll")) {
                        return 2860;
                    }
                    if (r7.equals("WorkAddressBookContact")) {
                        return 3429;
                    }
                    break;
                case 218:
                    if (r7.equals("SRTCommerceVertical")) {
                        return 2746;
                    }
                    if (r7.equals("SRTCoreTestVertical")) {
                        return 2753;
                    }
                    if (r7.equals("SRTResearchVertical")) {
                        return 2825;
                    }
                    if (r7.equals("SRTSecurityVertical")) {
                        return 2827;
                    }
                    if (r7.equals("StoryCardSliderPoll")) {
                        return 3076;
                    }
                    if (r7.equals("WatchCMSProductionShoot")) {
                        return 3401;
                    }
                    if (r7.equals("WhatsAppBusinessAccount")) {
                        return 3410;
                    }
                    if (r7.equals("WhitehatBugcrowdPayment")) {
                        return 3414;
                    }
                    if (r7.equals("WorkFeatureAnnouncement")) {
                        return 3469;
                    }
                    if (r7.equals("WorkKnowledgeAppContent")) {
                        return 3478;
                    }
                    if (r7.equals("WorkScheduledCollabPost")) {
                        return 3525;
                    }
                    break;
                case 219:
                    if (r7.equals("DeveloperCommunityProfileSubscription")) {
                        return 701;
                    }
                    if (r7.equals("FBShorts")) {
                        return 948;
                    }
                    if (r7.equals("SRTInstagramVertical")) {
                        return 2772;
                    }
                    if (r7.equals("SRTMarketingVertical")) {
                        return 2783;
                    }
                    if (r7.equals("WhitehatHackerOnePayment")) {
                        return 3415;
                    }
                    break;
                case 220:
                    if (r7.equals("DeveloperCommunityCategorySubscription")) {
                        return 698;
                    }
                    if (r7.equals("SRTAdsRankingVertical")) {
                        return 2737;
                    }
                    if (r7.equals("SRTBlockchainVertical")) {
                        return 2741;
                    }
                    if (r7.equals("SRTPrivacyOpsVertical")) {
                        return 2810;
                    }
                    if (r7.equals("SRTVideoInfraVertical")) {
                        return 2839;
                    }
                    if (r7.equals("SourcingMessageDetail")) {
                        return 2993;
                    }
                    if (r7.equals("WorkGroupCoverPhotoPreset")) {
                        return 3473;
                    }
                    break;
                case 221:
                    if (r7.equals("OmegaReceiptMethod")) {
                        return 2140;
                    }
                    if (r7.equals("OxsightsMapsLegend")) {
                        return 2180;
                    }
                    if (r7.equals("SRTAgeAffinityVertical")) {
                        return 2738;
                    }
                    if (r7.equals("SRTCalibraCareVertical")) {
                        return 2743;
                    }
                    if (r7.equals("SRTCompoundEyeVertical")) {
                        return 2750;
                    }
                    if (r7.equals("SRTFbFinanceQaVertical")) {
                        return 2760;
                    }
                    if (r7.equals("SRTGlobalCommsVertical")) {
                        return 2764;
                    }
                    if (r7.equals("SRTNewsProductVertical")) {
                        return 2787;
                    }
                    if (r7.equals("SRTProcurementVertical")) {
                        return 2813;
                    }
                    if (r7.equals("SourcingSupplierDetail")) {
                        return 3002;
                    }
                    if (r7.equals("WorkApprovalSourceDocument")) {
                        return 3436;
                    }
                    if (r7.equals("WorkCompanyInsightsSegment")) {
                        return 3445;
                    }
                    break;
                case 222:
                    if (r7.equals("SRTAdsIntegrityVertical")) {
                        return 2736;
                    }
                    if (r7.equals("SRTCommunityOpsVertical")) {
                        return 2747;
                    }
                    if (r7.equals("SRTLocalContentVertical")) {
                        return 2782;
                    }
                    if (r7.equals("SRTPartnershipsVertical")) {
                        return 2804;
                    }
                    if (r7.equals("SRTPaymentsRiskVertical")) {
                        return 2808;
                    }
                    if (r7.equals("SRTProcureToPayVertical")) {
                        return 2812;
                    }
                    if (r7.equals("SRTWhatsappSpamVertical")) {
                        return 2841;
                    }
                    break;
                case 223:
                    if (r7.equals("Bookmark")) {
                        return 359;
                    }
                    if (r7.equals("BulkTask")) {
                        return 376;
                    }
                    if (r7.equals("SRTAccessibilityVertical")) {
                        return 2735;
                    }
                    if (r7.equals("SRTDataDiscoveryVertical")) {
                        return 2756;
                    }
                    if (r7.equals("SRTFriendSharingVertical")) {
                        return 2761;
                    }
                    if (r7.equals("SRTOculusContentVertical")) {
                        return 2789;
                    }
                    if (r7.equals("SRTSearchMetricsVertical")) {
                        return 2826;
                    }
                    if (r7.equals("SRTSrtDogfoodingVertical")) {
                        return 2831;
                    }
                    break;
                case 224:
                    if (r7.equals("SCPurchaseOrderLineDetail")) {
                        return 2703;
                    }
                    if (r7.equals("SRTGlobalSecurityVertical")) {
                        return 2766;
                    }
                    if (r7.equals("SRTGroupIntegrityVertical")) {
                        return 2768;
                    }
                    if (r7.equals("SRTOversightBoardVertical")) {
                        return 2792;
                    }
                    if (r7.equals("SRTPagesIntegrityVertical")) {
                        return 2793;
                    }
                    if (r7.equals("SRTThreatExchangeVertical")) {
                        return 2834;
                    }
                    if (r7.equals("SRTWorkOperationsVertical")) {
                        return 2843;
                    }
                    if (r7.equals("WoodhengePurchasedPAYGReceipt")) {
                        return 3423;
                    }
                    break;
                case 225:
                    if (r7.equals("FBEAppSettings")) {
                        return 913;
                    }
                    if (r7.equals("OxsightsHighlightsFeed")) {
                        return 2173;
                    }
                    if (r7.equals("SRTBurmeseEncodingVertical")) {
                        return 2742;
                    }
                    if (r7.equals("SRTCommunityReviewVertical")) {
                        return 2748;
                    }
                    if (r7.equals("SRTComplianceQueryVertical")) {
                        return 2749;
                    }
                    if (r7.equals("SRTGenericFallbackVertical")) {
                        return 2762;
                    }
                    if (r7.equals("SRTHealthIntegrityVertical")) {
                        return 2770;
                    }
                    if (r7.equals("SRTIgCommercialityVertical")) {
                        return 2771;
                    }
                    if (r7.equals("SRTMediaOperationsVertical")) {
                        return 2785;
                    }
                    if (r7.equals("SRTWhatsappSupportVertical")) {
                        return 2842;
                    }
                    if (r7.equals("SourcingCostingSheetDetail")) {
                        return 2978;
                    }
                    if (r7.equals("WhatsAppBusinessPaymentAccount")) {
                        return 3411;
                    }
                    break;
                case 226:
                    if (r7.equals("HomeServiceReview")) {
                        return 1223;
                    }
                    if (r7.equals("SRTPhysicalSecurityVertical")) {
                        return 2809;
                    }
                    if (r7.equals("SRTVendorManagementVertical")) {
                        return 2837;
                    }
                    if (r7.equals("SRTVideoFeedRankingVertical")) {
                        return 2838;
                    }
                    if (r7.equals("SRTWhatsappPaymentsVertical")) {
                        return 2840;
                    }
                    break;
                case 227:
                    if (r7.equals("DeveloperCommunityThreadExternalTaskMigration")) {
                        return 705;
                    }
                    if (r7.equals("SRTOculusMediaStudioVertical")) {
                        return 2790;
                    }
                    if (r7.equals("SRTPartnerAssessmentVertical")) {
                        return 2803;
                    }
                    if (r7.equals("SRTProductClusteringVertical")) {
                        return 2816;
                    }
                    break;
                case 228:
                    if (r7.equals("BulkTaskChunk")) {
                        return 377;
                    }
                    if (r7.equals("SRTLanguageTechnologyVertical")) {
                        return 2780;
                    }
                    if (r7.equals("SRTPaymentsComplianceVertical")) {
                        return 2807;
                    }
                    if (r7.equals("SRTSignalsAndIdentityVertical")) {
                        return 2828;
                    }
                    if (r7.equals("SupportCorrespondenceInternal")) {
                        return 3130;
                    }
                    break;
                case 229:
                    if (r7.equals("SRTCreditAndCollectionVertical")) {
                        return 2754;
                    }
                    if (r7.equals("SRTOculusContentEngineVertical")) {
                        return 2788;
                    }
                    if (r7.equals("SRTPublicContentTopicsVertical")) {
                        return 2819;
                    }
                    if (r7.equals("SRTPublicContentVoicesVertical")) {
                        return 2820;
                    }
                    break;
                case 230:
                    if (r7.equals("FriendRequestStatus")) {
                        return 1027;
                    }
                    if (r7.equals("SRTEnterpriseOperationsVertical")) {
                        return 2759;
                    }
                    if (r7.equals("SRTPublisherBrandAssetsVertical")) {
                        return 2821;
                    }
                    break;
                case 231:
                    if (r7.equals("SRTProductRiskManagementVertical")) {
                        return 2817;
                    }
                    if (r7.equals("SRTPublicContentInterestVertical")) {
                        return 2818;
                    }
                    if (r7.equals("ScheduledQuietModeWeeklyInterval")) {
                        return 2859;
                    }
                    if (r7.equals("WorkFrontlineManagerProvisionRequest")) {
                        return 3471;
                    }
                    break;
                case 232:
                    if (r7.equals("SRTContextualOptimizationVertical")) {
                        return 2752;
                    }
                    break;
                case 233:
                    if (r7.equals("FanSupportPageSettings")) {
                        return 977;
                    }
                    if (r7.equals("SRTMarketplaceIntelligenceVertical")) {
                        return 2784;
                    }
                    if (r7.equals("SRTTransactionsMeasurementVertical")) {
                        return 2835;
                    }
                    if (r7.equals("WorkCompromisedCredentialSecurityAlert")) {
                        return 3449;
                    }
                    if (r7.equals("WorkKnowledgeCollaborativePostDocument")) {
                        return 3480;
                    }
                    break;
                case 234:
                    if (r7.equals("FBGroupChatUserSettings")) {
                        return 936;
                    }
                    if (r7.equals("SRTGlobalOpsWorkflowReviewsVertical")) {
                        return 2765;
                    }
                    break;
                case 236:
                    if (r7.equals("FBEDeveloperPanelSettings")) {
                        return 914;
                    }
                    if (r7.equals("SCItem")) {
                        return 2692;
                    }
                    if (r7.equals("SellerEnforcementLineItemMetricAppeal")) {
                        return 2887;
                    }
                    break;
                case 237:
                    if (r7.equals("SRTPrivacySecurityAndIntegrityVertical")) {
                        return 2811;
                    }
                    break;
                case 238:
                    if (r7.equals("DirectMessageSettingsInfo")) {
                        return 716;
                    }
                    break;
                case 239:
                    if (r7.equals("FactCheckContributorSettings")) {
                        return 966;
                    }
                    break;
                case 240:
                    if (r7.equals("SRTMessengerP2bConversationIntentVertical")) {
                        return 2786;
                    }
                    if (r7.equals("SRTPublisherRegistrationAndReviewVertical")) {
                        return 2822;
                    }
                    if (r7.equals("SupportCaseSellerEnforcementMetricsAppeal")) {
                        return 3126;
                    }
                    break;
                case 241:
                    if (r7.equals("OppFile")) {
                        return 2151;
                    }
                    break;
                case 242:
                    if (r7.equals("SaveListItem")) {
                        return 2850;
                    }
                    if (r7.equals("StorySetItem")) {
                        return 3090;
                    }
                    break;
                case 243:
                    if (r7.equals("OtherName")) {
                        return 2161;
                    }
                    if (r7.equals("SCPaymentTerm")) {
                        return 2698;
                    }
                    break;
                case 245:
                    if (r7.equals("OctopusRule")) {
                        return 2118;
                    }
                    if (r7.equals("SourcingBidTerm")) {
                        return 2970;
                    }
                    break;
                case 246:
                    if (r7.equals("OmegaInvoice")) {
                        return 2136;
                    }
                    if (r7.equals("OzoneRelease")) {
                        return 2197;
                    }
                    if (r7.equals("StoreProductItem")) {
                        return 3046;
                    }
                    break;
                case 247:
                    if (r7.equals("StorePhysicalItem")) {
                        return 3040;
                    }
                    break;
                case 248:
                    if (r7.equals("OfferViewShare")) {
                        return 2130;
                    }
                    break;
                case 249:
                    if (r7.equals("OppExternalCase")) {
                        return 2150;
                    }
                    if (r7.equals("OppStepSequence")) {
                        return 2158;
                    }
                    if (r7.equals("SportsMatchChatroom")) {
                        return 3015;
                    }
                    break;
                case 251:
                    if (r7.equals("StoreShoppingCartItem")) {
                        return 3051;
                    }
                    break;
                case 252:
                    if (r7.equals("FriendList")) {
                        return 1025;
                    }
                    if (r7.equals("StoreOrderShipmentItem")) {
                        return 3038;
                    }
                    if (r7.equals("StorePhysicalOrderItem")) {
                        return 3045;
                    }
                    break;
                case 253:
                    if (r7.equals("FBCommsAYMT")) {
                        return 912;
                    }
                    if (r7.equals("OfferBotUserProfile")) {
                        return 2125;
                    }
                    if (r7.equals("OxsightsNIAlertRule")) {
                        return 2182;
                    }
                    if (r7.equals("ScheduledPageLivingRoom")) {
                        return 2857;
                    }
                    if (r7.equals("SourcingChangeOrderForm")) {
                        return 2973;
                    }
                    if (r7.equals("StoryListAttachmentItem")) {
                        return 3085;
                    }
                    break;
                case 254:
                    if (r7.equals("BCMPDeal")) {
                        return 310;
                    }
                    if (r7.equals("BrandedContentEnrollmentRequestFeedback")) {
                        return 367;
                    }
                    if (r7.equals("MusicVideoMetadata")) {
                        return 2054;
                    }
                    if (r7.equals("OculusPaymentInvoice")) {
                        return 2122;
                    }
                    if (r7.equals("ScheduledGroupLivingRoom")) {
                        return 2854;
                    }
                    break;
                case 255:
                    if (r7.equals("FBFormRuleSet")) {
                        return 928;
                    }
                    if (r7.equals("FBStarsWallet")) {
                        return 949;
                    }
                    if (r7.equals("FunFactPrompt")) {
                        return 1031;
                    }
                    if (r7.equals("OxsightsTailorFeature")) {
                        return 2189;
                    }
                    break;
                case 256:
                    if (r7.equals("BudgetPool")) {
                        return 375;
                    }
                    if (r7.equals("FrameTextAsset")) {
                        return 1019;
                    }
                    break;
                case 257:
                    if (r7.equals("FrameImageAsset")) {
                        return 1018;
                    }
                    break;
                case 258:
                    if (r7.equals("FBFormFileObject")) {
                        return 919;
                    }
                    if (r7.equals("FlytrapBugReport")) {
                        return 1000;
                    }
                    if (r7.equals("MayaPointCloudMetadata")) {
                        return 1833;
                    }
                    if (r7.equals("MiBGroupThreadMetaData")) {
                        return 1990;
                    }
                    if (r7.equals("OpenCellularExternalCase")) {
                        return 2143;
                    }
                    if (r7.equals("OxsightsSegmentAlertRule")) {
                        return 2186;
                    }
                    break;
                case 260:
                    if (r7.equals("ForSaleItemVariant")) {
                        return 1012;
                    }
                    if (r7.equals("MessengerPlatformPersona")) {
                        return 1944;
                    }
                    break;
                case 262:
                    if (r7.equals("FactCheckableContent")) {
                        return 969;
                    }
                    if (r7.equals("FanSubmissionRequest")) {
                        return 974;
                    }
                    if (r7.equals("FlytrapBugAttachment")) {
                        return AsyncStorageModule.MAX_SQL_KEYS;
                    }
                    if (r7.equals("MessengerFriendOneMetadata")) {
                        return 1913;
                    }
                    if (r7.equals("OxsightsEmployeeAccessNotice")) {
                        return 2168;
                    }
                    break;
                case 263:
                    if (r7.equals("BizBroadcastEmail")) {
                        return 344;
                    }
                    if (r7.equals("FetchCategoriesResult")) {
                        return 989;
                    }
                    if (r7.equals("FoxFeedPYMKFeedObject")) {
                        return 1015;
                    }
                    if (r7.equals("User")) {
                        return 3273;
                    }
                    break;
                case 264:
                    if (r7.equals("FDSDesignReviewRequest")) {
                        return 952;
                    }
                    if (r7.equals("FeaturableOnProfileSet")) {
                        return 982;
                    }
                    if (r7.equals("FriendRequestsFeedUnit")) {
                        return 1028;
                    }
                    if (r7.equals("OxsightsMapsLegendColorPalette")) {
                        return 2181;
                    }
                    if (r7.equals("StructuredSurveyQuestionTokenParam")) {
                        return 3104;
                    }
                    break;
                case 265:
                    if (r7.equals("BundlePaymentDetail")) {
                        return 378;
                    }
                    if (r7.equals("MESAppealMutationResponseData")) {
                        return 1628;
                    }
                    break;
                case 266:
                    if (r7.equals("FBGroupChatMessageReport")) {
                        return 932;
                    }
                    if (r7.equals("FeedClientPromptFeedUnit")) {
                        return 986;
                    }
                    if (r7.equals("MessengerMontageFeaturedCamera")) {
                        return 1932;
                    }
                    break;
                case 267:
                    if (r7.equals("MarketplaceSearchFeedFilterData")) {
                        return 1782;
                    }
                    break;
                case 268:
                    if (r7.equals("FunFactPromptAnswerRequest")) {
                        return 1032;
                    }
                    break;
                case 269:
                    if (r7.equals("FormProgressStoryAttachment")) {
                        return 1014;
                    }
                    if (r7.equals("MessengerKidsAREffectActivityData")) {
                        return 1924;
                    }
                    break;
                case 270:
                    if (r7.equals("FBRecruitingReferralReachout")) {
                        return 944;
                    }
                    if (r7.equals("MarketplaceHashtagCategoryMetadata")) {
                        return 1736;
                    }
                    break;
                case 271:
                    if (r7.equals("UnimogFolder")) {
                        return 3261;
                    }
                    break;
                case 272:
                    if (r7.equals("FeaturableOnProfileInsightsSet")) {
                        return 981;
                    }
                    break;
                case 273:
                    if (r7.equals("BusinessPresenceCustomLabel")) {
                        return 406;
                    }
                    if (r7.equals("FoxFeedRecommendationFeedObject")) {
                        return 1016;
                    }
                    if (r7.equals("FundraiserForStoryDonationAlert")) {
                        return 1043;
                    }
                    break;
                case 274:
                    if (r7.equals("Facebook360ExplorePinnedFeedUnit")) {
                        return 958;
                    }
                    if (r7.equals("MediaManagerExportInsightsManifoldData")) {
                        return 1847;
                    }
                    break;
                case 275:
                    if (r7.equals("StorePromotion")) {
                        return 3047;
                    }
                    break;
                case 276:
                    if (r7.equals("Hobby")) {
                        return 1218;
                    }
                    if (r7.equals("MessengerGlobalGroupThreadPublicMetadata")) {
                        return 1919;
                    }
                    if (r7.equals("SCINVHRLocation")) {
                        return 2684;
                    }
                    break;
                case 277:
                    if (r7.equals("SearchSuggestion")) {
                        return 2879;
                    }
                    if (r7.equals("SideConversation")) {
                        return 2939;
                    }
                    if (r7.equals("SponsorTagsOptIn")) {
                        return 3011;
                    }
                    break;
                case 278:
                    if (r7.equals("SCPartnerLocation")) {
                        return 2696;
                    }
                    if (r7.equals("StoryCardQuestion")) {
                        return 3069;
                    }
                    if (r7.equals("SupportBotSession")) {
                        return 3120;
                    }
                    break;
                case 279:
                    if (r7.equals("FBGeneratedStoryViewerOnlyStoryBucket")) {
                        return 931;
                    }
                    if (r7.equals("SCSecurityQuestion")) {
                        return 2710;
                    }
                    if (r7.equals("SimpleNotification")) {
                        return 2941;
                    }
                    if (r7.equals("SwipeableAnimation")) {
                        return 3140;
                    }
                    break;
                case 280:
                    if (r7.equals("SRTJobAppSubmission")) {
                        return 2774;
                    }
                    if (r7.equals("ScimCompanyDivision")) {
                        return 2866;
                    }
                    if (r7.equals("SearchClickToAction")) {
                        return 2875;
                    }
                    if (r7.equals("SocialVRDestination")) {
                        return 2958;
                    }
                    if (r7.equals("StoreCouponCampaign")) {
                        return 3031;
                    }
                    if (r7.equals("UniversalOrderTracker")) {
                        return 3269;
                    }
                    break;
                case 281:
                    if (r7.equals("SCAPInvoiceException")) {
                        return 2678;
                    }
                    if (r7.equals("ShowreelNativeAction")) {
                        return 2922;
                    }
                    if (r7.equals("SourcingCRDiscussion")) {
                        return 2971;
                    }
                    if (r7.equals("SourcingNotification")) {
                        return 2995;
                    }
                    if (r7.equals("SupportInboxItemMain")) {
                        return 3134;
                    }
                    break;
                case 282:
                    if (r7.equals("SOEchoSignInformation")) {
                        return 2734;
                    }
                    if (r7.equals("SourcingEventQuestion")) {
                        return 2988;
                    }
                    break;
                case 283:
                    if (r7.equals("SourcingQuestionOption")) {
                        return 2999;
                    }
                    if (r7.equals("StoreOrderCancellation")) {
                        return 3034;
                    }
                    break;
                case 284:
                    if (r7.equals("SCOnboardingInformation")) {
                        return 2694;
                    }
                    if (r7.equals("ShowreelNativeAnimation")) {
                        return 2924;
                    }
                    if (r7.equals("ShowreelTemplateVersion")) {
                        return 2936;
                    }
                    if (r7.equals("StructuredSurveySession")) {
                        return 3106;
                    }
                    if (r7.equals("SuggestedRecommendation")) {
                        return 3112;
                    }
                    if (r7.equals("UnavailableMessagingActor")) {
                        return 3255;
                    }
                    break;
                case 285:
                    if (r7.equals("StructuredSurveyQuestion")) {
                        return 3103;
                    }
                    if (r7.equals("UnicornSearchParamBehavior")) {
                        return 3256;
                    }
                    break;
                case 286:
                    if (r7.equals("BuyAtForm")) {
                        return 415;
                    }
                    if (r7.equals("FoodDrinkMenu")) {
                        return 1005;
                    }
                    if (r7.equals("ServicesOfferSubscription")) {
                        return 2907;
                    }
                    if (r7.equals("ShowreelNativeInteraction")) {
                        return 2930;
                    }
                    if (r7.equals("SingingTalentShowAudition")) {
                        return 2942;
                    }
                    if (r7.equals("StandaloneAppNotification")) {
                        return 3017;
                    }
                    if (r7.equals("SupportCorrespondenceJSON")) {
                        return 3131;
                    }
                    break;
                case 287:
                    if (r7.equals("SRTResearchCaseCloseReason")) {
                        return 2823;
                    }
                    if (r7.equals("SaveUserCampaignImpression")) {
                        return 2852;
                    }
                    break;
                case 288:
                    if (r7.equals("SearchableResultsConnection")) {
                        return 2883;
                    }
                    if (r7.equals("UnifiedMessagingInstagramUser")) {
                        return 3257;
                    }
                    break;
                case 289:
                    if (r7.equals("FoodDrinkSubMenu")) {
                        return 1010;
                    }
                    if (r7.equals("SRTPartnerAssessmentQuestion")) {
                        return 2799;
                    }
                    if (r7.equals("ShowreelNativeDocumentAction")) {
                        return 2927;
                    }
                    if (r7.equals("StonehengeSubscriptionOption")) {
                        return 3027;
                    }
                    break;
                case 290:
                    if (r7.equals("ShowreelTemplateSpecification")) {
                        return 2935;
                    }
                    if (r7.equals("SocialVRAchievementDefinition")) {
                        return 2949;
                    }
                    if (r7.equals("SocialVRDestinationDefinition")) {
                        return 2959;
                    }
                    break;
                case 291:
                    if (r7.equals("StructuredSurveyResponseOption")) {
                        return 3105;
                    }
                    break;
                case 292:
                    if (r7.equals("HorizonWorldStatEntry")) {
                        return 1228;
                    }
                    break;
                case 293:
                    if (r7.equals("SocialVRParameterizedDestination")) {
                        return 2962;
                    }
                    break;
                case 294:
                    if (r7.equals("SourcingChangeOrderFormDiscussion")) {
                        return 2975;
                    }
                    break;
                case 295:
                    if (r7.equals("ShoppingDocumentElementsConnection")) {
                        return 2919;
                    }
                    if (r7.equals("ShowreelNativeInteractiveAnimation")) {
                        return 2931;
                    }
                    if (r7.equals("SourcingChangeRequestSpecification")) {
                        return 2977;
                    }
                    if (r7.equals("StructuredSurveyConfiguredQuestion")) {
                        return 3097;
                    }
                    break;
                case 296:
                    if (r7.equals("SocialVRActivityBiPlanesProgression")) {
                        return 2950;
                    }
                    if (r7.equals("SupportCorrespondenceFormSubmission")) {
                        return 3129;
                    }
                    break;
                case 298:
                    if (r7.equals("ServicesRequestTimeCreationImpression")) {
                        return 2909;
                    }
                    break;
                case 302:
                    if (r7.equals("SalesPromo")) {
                        return 2846;
                    }
                    break;
                case 309:
                    if (r7.equals("OppStepConfig")) {
                        return 2157;
                    }
                    break;
                case 310:
                    if (r7.equals("UserFundingReferrals")) {
                        return 3280;
                    }
                    break;
                case 311:
                    if (r7.equals("SuggestedCoverPhoto")) {
                        return 3110;
                    }
                    if (r7.equals("UserGroupsTabSettings")) {
                        return 3283;
                    }
                    break;
                case 312:
                    if (r7.equals("OfferUserSetting")) {
                        return 2128;
                    }
                    break;
                case 313:
                    if (r7.equals("MentorshipTopic")) {
                        return 1871;
                    }
                    break;
                case 315:
                    if (r7.equals("DittoUser")) {
                        return 722;
                    }
                    break;
                case 316:
                    if (r7.equals("DSCPartner")) {
                        return 682;
                    }
                    break;
                case 317:
                    if (r7.equals("DelightsPTR")) {
                        return 695;
                    }
                    break;
                case 318:
                    if (r7.equals("ServicesGoogleCalendarInfo")) {
                        return 2903;
                    }
                    if (r7.equals("StoreOrderShipmentItemInfo")) {
                        return 3039;
                    }
                    break;
                case 319:
                    if (r7.equals("UserApplicationInviteSettings")) {
                        return 3276;
                    }
                    break;
                case 321:
                    if (r7.equals("SpotlightStoryWithSnippetInfo")) {
                        return 3016;
                    }
                    break;
                case 322:
                    if (r7.equals("UpgradeOverMobileDataPreferences")) {
                        return 3272;
                    }
                    break;
                case 324:
                    if (r7.equals("DynamicTextSticker")) {
                        return 747;
                    }
                    break;
                case 325:
                    if (r7.equals("BiPlanesPlaneSkin")) {
                        return 332;
                    }
                    break;
                case 326:
                    if (r7.equals("DirectlyCallableUser")) {
                        return ArLinkScanControllerImpl.TARGET_IMAGE_SIZE;
                    }
                    break;
                case 331:
                    if (r7.equals("BusinessCRMSegmentation")) {
                        return 388;
                    }
                    break;
                case 333:
                    if (r7.equals("UGCAgreement")) {
                        return 3254;
                    }
                    break;
                case 334:
                    if (r7.equals("UnimogProject")) {
                        return 3267;
                    }
                    break;
                case 335:
                    if (r7.equals("OppGraph")) {
                        return 2152;
                    }
                    if (r7.equals("SOBankLookup")) {
                        return 2729;
                    }
                    break;
                case 336:
                    if (r7.equals("UserAchievement")) {
                        return 3274;
                    }
                    break;
                case 338:
                    if (r7.equals("UserActionDelight")) {
                        return 3275;
                    }
                    break;
                case 339:
                    if (r7.equals("ScimCompanyGroup")) {
                        return 2867;
                    }
                    if (r7.equals("UserGroupBlockList")) {
                        return 3282;
                    }
                    break;
                case 342:
                    if (r7.equals("MessageThread")) {
                        return 1889;
                    }
                    if (r7.equals("MontageThread")) {
                        return 2029;
                    }
                    if (r7.equals("ScimEmployeeCheckup")) {
                        return 2874;
                    }
                    break;
                case 343:
                    if (r7.equals("MayaPointCloud")) {
                        return 1832;
                    }
                    break;
                case 344:
                    if (r7.equals("SRTResearchFellowship")) {
                        return 2824;
                    }
                    if (r7.equals("UnimogObjectAccessPoint")) {
                        return 3262;
                    }
                    break;
                case 346:
                    if (r7.equals("DSCSeries")) {
                        return 686;
                    }
                    if (r7.equals("StoreBrandApproverGroup")) {
                        return 3029;
                    }
                    break;
                case 348:
                    if (r7.equals("DittoAccess")) {
                        return 721;
                    }
                    break;
                case 350:
                    if (r7.equals("MeasurementPlayground")) {
                        return 1835;
                    }
                    break;
                case 351:
                    if (r7.equals("MixedRealityWhiteboard")) {
                        return 2002;
                    }
                    break;
                case 352:
                    if (r7.equals("BusinessVideo")) {
                        return 414;
                    }
                    if (r7.equals("ShowreelNativeAnimationBitmap")) {
                        return 2925;
                    }
                    break;
                case 353:
                    if (r7.equals("FinancialEntityNew")) {
                        return 993;
                    }
                    break;
                case 354:
                    if (r7.equals("MessengerViewer1To1Thread")) {
                        return 1960;
                    }
                    break;
                case 355:
                    if (r7.equals("MessengerGlobalGroupThread")) {
                        return 1918;
                    }
                    if (r7.equals("MessengerViewerGroupThread")) {
                        return 1963;
                    }
                    break;
                case 360:
                    if (r7.equals("MarketplaceEcommFollowedKeyword")) {
                        return 1673;
                    }
                    break;
                case 361:
                    if (r7.equals("BrandedContentPostInfo")) {
                        return 368;
                    }
                    if (r7.equals("BrandedContentUserInfo")) {
                        return 370;
                    }
                    break;
                case 362:
                    if (r7.equals("MonetizationEnforcementCaseRecord")) {
                        return 2017;
                    }
                    break;
                case 368:
                    if (r7.equals("Metapage")) {
                        return 1966;
                    }
                    break;
                case 369:
                    if (r7.equals("MenuImage")) {
                        return 1873;
                    }
                    if (r7.equals("WatchCMSLegalEntity")) {
                        return 3394;
                    }
                    break;
                case 370:
                    if (r7.equals("WorkMicroPulseSurvey")) {
                        return 3504;
                    }
                    break;
                case 371:
                    if (r7.equals("Marketplace")) {
                        return 1649;
                    }
                    if (r7.equals("MessageFile")) {
                        return 1880;
                    }
                    if (r7.equals("WorkDeviceITAPCompany")) {
                        return 3458;
                    }
                    break;
                case 372:
                    if (r7.equals("BrandedContentSuspectedBCPostInfo")) {
                        return 369;
                    }
                    if (r7.equals("MessageImage")) {
                        return 1881;
                    }
                    if (r7.equals("MobileDevice")) {
                        return 2009;
                    }
                    break;
                case 373:
                    if (r7.equals("FaceBox")) {
                        return 955;
                    }
                    if (r7.equals("MiniShopTheme")) {
                        return CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                    }
                    if (r7.equals("MovieBotMovie")) {
                        return 2035;
                    }
                    break;
                case 374:
                    if (r7.equals("MontageMessage")) {
                        return 2022;
                    }
                    break;
                case 375:
                    if (r7.equals("DayPart")) {
                        return 691;
                    }
                    if (r7.equals("MPPExternalCase")) {
                        return 1630;
                    }
                    if (r7.equals("MarketplaceFeedProductPreferenceUnitDeprecated")) {
                        return 1709;
                    }
                    if (r7.equals("MessengerInvite")) {
                        return 1923;
                    }
                    if (r7.equals("WorkCompanyPricePlanEntry")) {
                        return 3447;
                    }
                    break;
                case 376:
                    if (r7.equals("MediaEffectUsage")) {
                        return 1845;
                    }
                    if (r7.equals("MentorshipCourse")) {
                        return 1858;
                    }
                    if (r7.equals("MontageTextStyle")) {
                        return 2026;
                    }
                    break;
                case 377:
                    if (r7.equals("MLEXFeedbackIssue")) {
                        return 1629;
                    }
                    if (r7.equals("MessengerPayTheme")) {
                        return 1940;
                    }
                    break;
                case 378:
                    if (r7.equals("MontageEmojiLocale")) {
                        return 2021;
                    }
                    break;
                case 379:
                    if (r7.equals("DirectDebit")) {
                        return 712;
                    }
                    if (r7.equals("MontageStickerStyle")) {
                        return 2025;
                    }
                    break;
                case 380:
                    if (r7.equals("MarketplaceLocalSale")) {
                        return 1745;
                    }
                    if (r7.equals("MessageAnimatedImage")) {
                        return 1876;
                    }
                    if (r7.equals("MessengerGroupInvite")) {
                        return 1921;
                    }
                    break;
                case 381:
                    if (r7.equals("MediaUploadPreference")) {
                        return 1851;
                    }
                    if (r7.equals("MessageEphemeralImage")) {
                        return 1878;
                    }
                    break;
                case 382:
                    if (r7.equals("MSPAdsCouponPreference")) {
                        return 1634;
                    }
                    if (r7.equals("ManagedMediaGroupImage")) {
                        return 1642;
                    }
                    if (r7.equals("MarketplaceUserProfile")) {
                        return 1815;
                    }
                    if (r7.equals("MiniShopHeroTileModule")) {
                        return 1997;
                    }
                    if (r7.equals("MusicWorkDocumentStore")) {
                        return 2055;
                    }
                    if (r7.equals("WorkExperimentExposuresToCompany")) {
                        return 3468;
                    }
                    break;
                case 383:
                    if (r7.equals("DSCBonusContent")) {
                        return 662;
                    }
                    if (r7.equals("DocauthClassSet")) {
                        return 725;
                    }
                    if (r7.equals("DonationPayment")) {
                        return 741;
                    }
                    break;
                case 384:
                    if (r7.equals("MarketplaceAttributeType")) {
                        return 1652;
                    }
                    if (r7.equals("MarketplaceEcommAudience")) {
                        return 1670;
                    }
                    if (r7.equals("MarketplaceGroupPurchase")) {
                        return 1734;
                    }
                    if (r7.equals("MessengerBusinessMessage")) {
                        return 1896;
                    }
                    if (r7.equals("MfsBillPayCreationUpdate")) {
                        return 1972;
                    }
                    break;
                case 385:
                    if (r7.equals("DocumentNTElement")) {
                        return 730;
                    }
                    if (r7.equals("MarketplaceBotUserProfile")) {
                        return 1654;
                    }
                    if (r7.equals("MiniShopAllProductsModule")) {
                        return 1995;
                    }
                    if (r7.equals("MobileCarrierTosSignature")) {
                        return 2008;
                    }
                    if (r7.equals("MobileTopUpPaymentInvoice")) {
                        return 2014;
                    }
                    break;
                case 386:
                    if (r7.equals("BirthdayBotGroup")) {
                        return 338;
                    }
                    if (r7.equals("DSCProductionShoot")) {
                        return 684;
                    }
                    if (r7.equals("DocumentMapElement")) {
                        return 728;
                    }
                    if (r7.equals("MarketplaceFollowableTheme")) {
                        return 1730;
                    }
                    if (r7.equals("MessengerMontageNuxMessage")) {
                        return 1935;
                    }
                    break;
                case 387:
                    if (r7.equals("DocumentListElement")) {
                        return 727;
                    }
                    if (r7.equals("DocumentNativeAdSet")) {
                        return 732;
                    }
                    if (r7.equals("DocumentTextElement")) {
                        return 738;
                    }
                    if (r7.equals("MobilePartnerCustomAudience")) {
                        return 2011;
                    }
                    break;
                case 388:
                    if (r7.equals("DocumentEventElement")) {
                        return 726;
                    }
                    if (r7.equals("DocumentPhotoElement")) {
                        return 735;
                    }
                    if (r7.equals("DocumentVideoElement")) {
                        return 739;
                    }
                    if (r7.equals("MarketplaceHelpCenterArticle")) {
                        return 1737;
                    }
                    if (r7.equals("MentorshipApplicationProfile")) {
                        return 1857;
                    }
                    break;
                case 389:
                    if (r7.equals("KototoroVideoUploadMetadata")) {
                        return 1454;
                    }
                    if (r7.equals("MediaEffectCustomFontResource")) {
                        return 1838;
                    }
                    if (r7.equals("MfsBillPayReferenceCodeUpdate")) {
                        return 1975;
                    }
                    break;
                case 390:
                    if (r7.equals("DeveloperCommunityPost")) {
                        return 699;
                    }
                    if (r7.equals("DocumentWebviewElement")) {
                        return 740;
                    }
                    break;
                case 391:
                    if (r7.equals("BusinessResourceGroup")) {
                        return 410;
                    }
                    if (r7.equals("DocumentNativeAdElement")) {
                        return 731;
                    }
                    if (r7.equals("MarketplaceProviderExternalCase")) {
                        return 1766;
                    }
                    if (r7.equals("SCUser")) {
                        return 2724;
                    }
                    if (r7.equals("Sector")) {
                        return 2884;
                    }
                    break;
                case 392:
                    if (r7.equals("DSCMetadataForVideoAsset")) {
                        return 677;
                    }
                    if (r7.equals("DocumentMultiTextElement")) {
                        return 729;
                    }
                    if (r7.equals("DocumentSlideshowElement")) {
                        return 737;
                    }
                    if (r7.equals("MarketplaceAdsProductDetailsPage")) {
                        return 1651;
                    }
                    if (r7.equals("MfsAgentCashInConfirmationUpdate")) {
                        return 1967;
                    }
                    if (r7.equals("Sticker")) {
                        return 3023;
                    }
                    break;
                case 393:
                    if (r7.equals("DirectMessageThreadBucket")) {
                        return 718;
                    }
                    if (r7.equals("MarketplaceFeedUnitUserPreference")) {
                        return 1726;
                    }
                    if (r7.equals("MarketplaceVerticalPartnerFeature")) {
                        return 1823;
                    }
                    break;
                case 394:
                    if (r7.equals("MarketplaceHomeServicePremadeQuote")) {
                        return 1738;
                    }
                    if (r7.equals("MarketplaceShopsProductDetailsPage")) {
                        return 1807;
                    }
                    if (r7.equals("SCPartner")) {
                        return 2695;
                    }
                    if (r7.equals("StoreUser")) {
                        return 3052;
                    }
                    break;
                case 395:
                    if (r7.equals("Question")) {
                        return 2561;
                    }
                    if (r7.equals("SCSupplier")) {
                        return 2711;
                    }
                    break;
                case 396:
                    if (r7.equals("MarketplaceSearchQuickPromotionTheme")) {
                        return 1791;
                    }
                    if (r7.equals("MarketplaceVehicleProductDetailsPage")) {
                        return 1820;
                    }
                    break;
                case 397:
                    if (r7.equals("MarketplaceMiniShopProductDetailsPage")) {
                        return 1750;
                    }
                    if (r7.equals("MarketplaceSellerOrderDetailsPageBase")) {
                        return 1797;
                    }
                    if (r7.equals("SaveReminder")) {
                        return 2851;
                    }
                    if (r7.equals("ShaderFilter")) {
                        return 2915;
                    }
                    break;
                case 398:
                    if (r7.equals("MarketplaceDynamicAdProductDetailsPage")) {
                        return 1665;
                    }
                    if (r7.equals("MarketplaceECommMiniProductDetailsPage")) {
                        return 1667;
                    }
                    if (r7.equals("MessengerDestinationPageWelcomeMessage")) {
                        return 1908;
                    }
                    break;
                case 399:
                    if (r7.equals("MarketplaceRealEstateProductDetailsPage")) {
                        return 1770;
                    }
                    if (r7.equals("QuizQuestion")) {
                        return 2574;
                    }
                    if (r7.equals("SocialVRAvatar")) {
                        return 2951;
                    }
                    if (r7.equals("StoreGuestUser")) {
                        return 3032;
                    }
                    if (r7.equals("SupportPartner")) {
                        return 3137;
                    }
                    if (r7.equals("SyntheticActor")) {
                        return 3145;
                    }
                    break;
                case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI /*400*/:
                    if (r7.equals("MarketplaceForSaleItemProductDetailsPage")) {
                        return 1731;
                    }
                    if (r7.equals("SCPurchaseOrder")) {
                        return 2700;
                    }
                    if (r7.equals("ScimCompanyUser")) {
                        return 2871;
                    }
                    break;
                case 401:
                    if (r7.equals("DocumentNativeTwitterEmbedElement")) {
                        return 734;
                    }
                    if (r7.equals("MarketplaceCommercePostProductDetailsPage")) {
                        return 1659;
                    }
                    if (r7.equals("QuestionOption")) {
                        return 2562;
                    }
                    if (r7.equals("Quillustration")) {
                        return 2571;
                    }
                    if (r7.equals("StarsSendingTier")) {
                        return 3020;
                    }
                    break;
                case 402:
                    if (r7.equals("DeveloperCommunityThreadAssignment")) {
                        return 704;
                    }
                    if (r7.equals("SuggestedSouvenir")) {
                        return 3114;
                    }
                    break;
                case 403:
                    if (r7.equals("DocumentNativeInstagramEmbedElement")) {
                        return 733;
                    }
                    if (r7.equals("StorePhysicalOffer")) {
                        return 3041;
                    }
                    if (r7.equals("StorePhysicalOrder")) {
                        return 3044;
                    }
                    break;
                case 404:
                    if (r7.equals("QuoteNotification")) {
                        return 2578;
                    }
                    if (r7.equals("StoryPromotionOwner")) {
                        return 3088;
                    }
                    break;
                case 405:
                    if (r7.equals("MarketplaceBuySellGroupItemProductDetailsPage")) {
                        return 1656;
                    }
                    break;
                case 406:
                    if (r7.equals("MarketplacePartnerPromotionNotificationMessage")) {
                        return 1758;
                    }
                    if (r7.equals("StoryCardEmojiSticker")) {
                        return 3062;
                    }
                    if (r7.equals("StoryCardEventInfoBar")) {
                        return 3063;
                    }
                    if (r7.equals("StoryCardMusicSticker")) {
                        return 3067;
                    }
                    if (r7.equals("SupplierPortalPartner")) {
                        return 3117;
                    }
                    break;
                case 407:
                    if (r7.equals("SourcingQuestionAnswer")) {
                        return 2996;
                    }
                    if (r7.equals("StoryCardAvatarSticker")) {
                        return 3059;
                    }
                    if (r7.equals("StoryCardRevealSticker")) {
                        return 3074;
                    }
                    break;
                case 408:
                    if (r7.equals("StoryCardQuestionAnswer")) {
                        return 3070;
                    }
                    if (r7.equals("StoryHighlightContainer")) {
                        return 3083;
                    }
                    break;
                case 409:
                    if (r7.equals("StoryCardLocationSticker")) {
                        return 3066;
                    }
                    if (r7.equals("StoryCardReactionSticker")) {
                        return 3073;
                    }
                    break;
                case 410:
                    if (r7.equals("ShowreelNativePartPointer")) {
                        return 2932;
                    }
                    if (r7.equals("SourcingEventCollaborator")) {
                        return 2984;
                    }
                    break;
                case 411:
                    if (r7.equals("ScimCompanyUserPhoneNumber")) {
                        return 2873;
                    }
                    if (r7.equals("SourcingCostingSheetHeader")) {
                        return 2980;
                    }
                    if (r7.equals("StoryCardGroupedTagSticker")) {
                        return 3064;
                    }
                    break;
                case 412:
                    if (r7.equals("FBFormSourceKey")) {
                        return 929;
                    }
                    if (r7.equals("ServicesAppointmentReminder")) {
                        return 2894;
                    }
                    break;
                case 413:
                    if (r7.equals("QuizQuestionResponseOption")) {
                        return 2576;
                    }
                    if (r7.equals("StoryCardDynamicBrandSticker")) {
                        return 3061;
                    }
                    if (r7.equals("SupportModuleDisplayBehavior")) {
                        return 3135;
                    }
                    break;
                case 414:
                    if (r7.equals("FundraiserCharity")) {
                        return 1035;
                    }
                    if (r7.equals("MarketplaceTicketedExperienceClusterProductDetailsPage")) {
                        return 1811;
                    }
                    if (r7.equals("ShowreelNativeActionParameter")) {
                        return 2923;
                    }
                    if (r7.equals("StoryCardCallForActionSticker")) {
                        return 3060;
                    }
                    break;
                case 415:
                    if (r7.equals("FundraiserForStory")) {
                        return 1041;
                    }
                    break;
                case 416:
                    if (r7.equals("SourcingChangeOrderFormApprover")) {
                        return 2974;
                    }
                    break;
                case 417:
                    if (r7.equals("MarketplaceDynamicAdWithOffsiteCheckoutProductDetailsPage")) {
                        return 1666;
                    }
                    if (r7.equals("ServicesExternalCalendarProvider")) {
                        return 2898;
                    }
                    break;
                case 418:
                    if (r7.equals("FoodDrinkMenuCategory")) {
                        return 1006;
                    }
                    break;
                case 422:
                    if (r7.equals("FundraiserPersonToCharity")) {
                        return 1048;
                    }
                    break;
                case 423:
                    if (r7.equals("FundraiserCrisisForCharity")) {
                        return 1037;
                    }
                    break;
                case 424:
                    if (r7.equals("FundraiserProfileForCharity")) {
                        return 1050;
                    }
                    break;
                case 428:
                    if (r7.equals("OzoneAPK")) {
                        return 2196;
                    }
                    break;
                case 429:
                    if (r7.equals("FixedCostShippingAddressCategory")) {
                        return 995;
                    }
                    if (r7.equals("StreetAddress")) {
                        return 3094;
                    }
                    break;
                case 432:
                    if (r7.equals("StoryPreferences")) {
                        return 3087;
                    }
                    break;
                case 433:
                    if (r7.equals("SCSupplierAddress")) {
                        return 2712;
                    }
                    break;
                case 434:
                    if (r7.equals("SRTUserPreferences")) {
                        return 2836;
                    }
                    break;
                case 436:
                    if (r7.equals("OxsightsDeepLink")) {
                        return 2167;
                    }
                    if (r7.equals("StoryArchiveSettings")) {
                        return 3056;
                    }
                    break;
                case 438:
                    if (r7.equals("MonthlyInvoicing")) {
                        return 2030;
                    }
                    if (r7.equals("ScimCompanyUserAddress")) {
                        return 2872;
                    }
                    break;
                case 439:
                    if (r7.equals("MarketplaceRating")) {
                        return 1768;
                    }
                    break;
                case 440:
                    if (r7.equals("BOFOrder")) {
                        return 327;
                    }
                    if (r7.equals("MABBenchmarkConfig")) {
                        return 1622;
                    }
                    if (r7.equals("MarketplaceHashtag")) {
                        return 1735;
                    }
                    if (r7.equals("SCSupplierGenericAddress")) {
                        return 2720;
                    }
                    break;
                case 441:
                    if (r7.equals("StoryHighlightPreferences")) {
                        return 3084;
                    }
                    break;
                case 442:
                    if (r7.equals("BizKitUser")) {
                        return 345;
                    }
                    if (r7.equals("BloodDonor")) {
                        return 355;
                    }
                    break;
                case 443:
                    if (r7.equals("BlockedUser")) {
                        return 349;
                    }
                    break;
                case 444:
                    if (r7.equals("MovieFactoryMoodConfig")) {
                        return 2040;
                    }
                    if (r7.equals("ScimCompanyIntegritySettings")) {
                        return 2868;
                    }
                    if (r7.equals("ServicesBookmarkUserSettings")) {
                        return 2897;
                    }
                    break;
                case 445:
                    if (r7.equals("BillableOffer")) {
                        return 333;
                    }
                    if (r7.equals("MPPLegalUpdateActionLog")) {
                        return 1631;
                    }
                    break;
                case 447:
                    if (r7.equals("BCMPBrandFilter")) {
                        return 306;
                    }
                    break;
                case 449:
                    if (r7.equals("BCMPInstagramUser")) {
                        return 314;
                    }
                    if (r7.equals("MediaEffectPermissionConfig")) {
                        return 1841;
                    }
                    if (r7.equals("MessengerWelcomePageSetting")) {
                        return 1965;
                    }
                    break;
                case 450:
                    if (r7.equals("MessengerMediaContentSetting")) {
                        return 1927;
                    }
                    if (r7.equals("MovieFactoryVisualMoodConfig")) {
                        return 2042;
                    }
                    if (r7.equals("ShowreelNativeDocumentEventActions")) {
                        return 2928;
                    }
                    break;
                case 451:
                    if (r7.equals("BreakingNewsCluster")) {
                        return 371;
                    }
                    if (r7.equals("MarketplaceDealsPillterConfig")) {
                        return 1663;
                    }
                    if (r7.equals("MarketplaceFeedGeneralListing")) {
                        return 1694;
                    }
                    if (r7.equals("MarketplaceShopsPillterConfig")) {
                        return 1806;
                    }
                    break;
                case 452:
                    if (r7.equals("BloodDonationPartner")) {
                        return 354;
                    }
                    break;
                case 454:
                    if (r7.equals("BusinessCreativeFolder")) {
                        return 389;
                    }
                    if (r7.equals("BusinessMomentReminder")) {
                        return 401;
                    }
                    break;
                case 455:
                    if (r7.equals("BrowseTypeBlockBehavior")) {
                        return 374;
                    }
                    if (r7.equals("SaveList")) {
                        return 2849;
                    }
                    if (r7.equals("StorySet")) {
                        return 3089;
                    }
                    break;
                case 456:
                    if (r7.equals("SCComment")) {
                        return 2682;
                    }
                    break;
                case 457:
                    if (r7.equals("SellIntent")) {
                        return 2886;
                    }
                    break;
                case 458:
                    if (r7.equals("BCPAccountingJournalHeader")) {
                        return 323;
                    }
                    break;
                case 459:
                    if (r7.equals("SCAttachment")) {
                        return 2680;
                    }
                    if (r7.equals("SOAttachment")) {
                        return 2727;
                    }
                    break;
                case 460:
                    if (r7.equals("SOBankAccount")) {
                        return 2728;
                    }
                    if (r7.equals("SourcingEvent")) {
                        return 2982;
                    }
                    break;
                case 461:
                    if (r7.equals("SCBomComponent")) {
                        return 2681;
                    }
                    if (r7.equals("SearchShortcut")) {
                        return 2878;
                    }
                    break;
                case 463:
                    if (r7.equals("OxsightsGoal")) {
                        return 2169;
                    }
                    if (r7.equals("SCInvoicePayment")) {
                        return 2690;
                    }
                    if (r7.equals("SCQuoteComponent")) {
                        return 2706;
                    }
                    if (r7.equals("StarsVirtualGift")) {
                        return 3021;
                    }
                    break;
                case 464:
                    if (r7.equals("SCAPInvoiceDefect")) {
                        return 2677;
                    }
                    if (r7.equals("StoreShoppingCart")) {
                        return 3050;
                    }
                    break;
                case 465:
                    if (r7.equals("SOBizValAttachment")) {
                        return 2731;
                    }
                    if (r7.equals("SOCommonAttachment")) {
                        return 2732;
                    }
                    if (r7.equals("SourcingAttachment")) {
                        return 2968;
                    }
                    if (r7.equals("StoreOrderShipment")) {
                        return 3037;
                    }
                    break;
                case 466:
                    if (r7.equals("SCInvoiceAttachment")) {
                        return 2687;
                    }
                    if (r7.equals("SocialVRAchievement")) {
                        return 2948;
                    }
                    if (r7.equals("StyleTransferEffect")) {
                        return 3108;
                    }
                    break;
                case 467:
                    if (r7.equals("SRTPartnerAssessment")) {
                        return 2794;
                    }
                    if (r7.equals("SRTPayComDataRequest")) {
                        return 2805;
                    }
                    if (r7.equals("SearchQueryWhitelist")) {
                        return 2877;
                    }
                    if (r7.equals("SocialVRCoreBuildSet")) {
                        return 2952;
                    }
                    break;
                case 468:
                    if (r7.equals("SCSupplierBankAccount")) {
                        return 2715;
                    }
                    if (r7.equals("ScimCompanyDepartment")) {
                        return 2865;
                    }
                    if (r7.equals("ShowreelTemplateAsset")) {
                        return 2934;
                    }
                    if (r7.equals("SitevarMatchRuleInput")) {
                        return 2943;
                    }
                    if (r7.equals("SourcingChangeRequest")) {
                        return 2976;
                    }
                    break;
                case 469:
                    if (r7.equals("ShowreelNativeDocument")) {
                        return 2926;
                    }
                    if (r7.equals("SnoozeFollowupFeedUnit")) {
                        return 2946;
                    }
                    if (r7.equals("StoryGallerySurveyUnit")) {
                        return 3082;
                    }
                    if (r7.equals("SuggestedShowsFeedUnit")) {
                        return 3113;
                    }
                    if (r7.equals("SurveyIntegrationPoint")) {
                        return 3139;
                    }
                    break;
                case 470:
                    if (r7.equals("SCPurchaseOrderShipment")) {
                        return 2704;
                    }
                    if (r7.equals("SCSupplierChangeRequest")) {
                        return 2719;
                    }
                    if (r7.equals("SmsMessagingParticipant")) {
                        return 2944;
                    }
                    if (r7.equals("SportsDataMatchDataFact")) {
                        return 3014;
                    }
                    if (r7.equals("StoriesSharedFriendList")) {
                        return 3054;
                    }
                    break;
                case 471:
                    if (r7.equals("BusinessActivityFeedAdsMonitoringFilter")) {
                        return 379;
                    }
                    if (r7.equals("SearchNewsDigestFeedUnit")) {
                        return 2876;
                    }
                    if (r7.equals("ServicesGenericAdminText")) {
                        return 2902;
                    }
                    if (r7.equals("SocialListPromptFeedUnit")) {
                        return 2947;
                    }
                    if (r7.equals("SocialVRCustomWorldAsset")) {
                        return 2954;
                    }
                    break;
                case 472:
                    if (r7.equals("SRTJobAuditMailAttachment")) {
                        return 2775;
                    }
                    if (r7.equals("SaleGroupsNearYouFeedUnit")) {
                        return 2845;
                    }
                    if (r7.equals("StoryBucketAnimationAsset")) {
                        return 3057;
                    }
                    if (r7.equals("StoryListAttachmentPrompt")) {
                        return 3086;
                    }
                    break;
                case 473:
                    if (r7.equals("SRTJobSeguroCredibleThreat")) {
                        return 2779;
                    }
                    if (r7.equals("StoryCardTemplateTextInput")) {
                        return 3079;
                    }
                    if (r7.equals("StoryGallerySurveyFeedUnit")) {
                        return 3081;
                    }
                    if (r7.equals("StoryYouMayPublishFeedUnit")) {
                        return 3093;
                    }
                    if (r7.equals("StructuredSurveyFlowBucket")) {
                        return 3101;
                    }
                    break;
                case 474:
                    if (r7.equals("ServicesFacebookAppointment")) {
                        return 2899;
                    }
                    if (r7.equals("ShowreelTemplateVersionTest")) {
                        return 2937;
                    }
                    if (r7.equals("SocialVRCustomWorldSnapshot")) {
                        return 2956;
                    }
                    if (r7.equals("SuggestedProfilePicFeedUnit")) {
                        return 3111;
                    }
                    if (r7.equals("SupplierDiversityEnrollment")) {
                        return 3115;
                    }
                    break;
                case 475:
                    if (r7.equals("MarketplaceSavedSearch")) {
                        return 1774;
                    }
                    if (r7.equals("ServicesFuturePartnerRequest")) {
                        return 2901;
                    }
                    if (r7.equals("ServicesRecurringAppointment")) {
                        return 2908;
                    }
                    break;
                case 476:
                    if (r7.equals("SocialVRCustomWorldScreenshot")) {
                        return 2955;
                    }
                    break;
                case 477:
                    if (r7.equals("SCPurchaseOrderAcknowledgement")) {
                        return 2701;
                    }
                    if (r7.equals("SRTPartnerAssessmentAttachment")) {
                        return 2796;
                    }
                    if (r7.equals("SupportCorrespondencePlainText")) {
                        return 3132;
                    }
                    break;
                case 478:
                    if (r7.equals("BusinessDetails")) {
                        return 391;
                    }
                    if (r7.equals("SCSupplierBankAccountAssignment")) {
                        return 2716;
                    }
                    if (r7.equals("StorePhysicalOfferChangeRequest")) {
                        return 3042;
                    }
                    if (r7.equals("SupportCorrespondenceAttachment")) {
                        return 3127;
                    }
                    break;
                case 481:
                    if (r7.equals("OmegaInvoicerRunCategoryDetail")) {
                        return 2138;
                    }
                    if (r7.equals("SRTPartnerAssessmentFeedbackTarget")) {
                        return 2797;
                    }
                    break;
                case 482:
                    if (r7.equals("SRTPartnerAssessmentQuestionRuleSet")) {
                        return 2802;
                    }
                    break;
                case 484:
                    if (r7.equals("ServicesAppointmentInterstitialOptOut")) {
                        return 2893;
                    }
                    break;
                case 485:
                    if (r7.equals("MarketplaceSearchFeedSavedSearch")) {
                        return 1786;
                    }
                    break;
                case 491:
                    if (r7.equals("OfferItem")) {
                        return 2127;
                    }
                    if (r7.equals("ServicesMessengerAppointmentEntryPointOptOut")) {
                        return 2906;
                    }
                    break;
                case 492:
                    if (r7.equals("OfferClaim")) {
                        return 2126;
                    }
                    break;
                case 493:
                    if (r7.equals("KBBMake")) {
                        return 1436;
                    }
                    if (r7.equals("OfferXClaim")) {
                        return 2132;
                    }
                    if (r7.equals("UnifiedStoryReply")) {
                        return 3259;
                    }
                    break;
                case 496:
                    if (r7.equals("OmegaCustomPgm")) {
                        return 2134;
                    }
                    break;
                case 497:
                    if (r7.equals("KGAlbumNode")) {
                        return 1437;
                    }
                    if (r7.equals("KGMovieNode")) {
                        return 1438;
                    }
                    break;
                case 498:
                    if (r7.equals("KGPersonNode")) {
                        return 1439;
                    }
                    if (r7.equals("KGTvShowNode")) {
                        return 1440;
                    }
                    break;
                case 499:
                    if (r7.equals("KnowledgeNote")) {
                        return 1441;
                    }
                    break;
                case 502:
                    if (r7.equals("Blogpost")) {
                        return 350;
                    }
                    if (r7.equals("InstagramMedia")) {
                        return 1313;
                    }
                    if (r7.equals("KototoroGifUsage")) {
                        return 1448;
                    }
                    if (r7.equals("KototoroTemplate")) {
                        return 1449;
                    }
                    break;
                case 503:
                    if (r7.equals("KototoroChallenge")) {
                        return 1444;
                    }
                    break;
                case 504:
                    if (r7.equals("KototoroBadgeUsage")) {
                        return 1443;
                    }
                    break;
                case 506:
                    if (r7.equals("BCMPDealPost")) {
                        return 311;
                    }
                    if (r7.equals("BingoProject")) {
                        return 337;
                    }
                    if (r7.equals("BloodRequest")) {
                        return 356;
                    }
                    if (r7.equals("BusinessUnit")) {
                        return 413;
                    }
                    break;
                case 507:
                    if (r7.equals("BCMPSavedList")) {
                        return 319;
                    }
                    if (r7.equals("KototoroTemplateUsage")) {
                        return 1452;
                    }
                    break;
                case 508:
                    if (r7.equals("BusinessMoment")) {
                        return ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                    }
                    if (r7.equals("BusinessReport")) {
                        return 408;
                    }
                    if (r7.equals("OxsightsTailorMetricSystem")) {
                        return 2192;
                    }
                    break;
                case 509:
                    if (r7.equals("BillableProduct")) {
                        return 336;
                    }
                    if (r7.equals("BusinessRequest")) {
                        return 409;
                    }
                    break;
                case 510:
                    if (r7.equals("BoostedComponent")) {
                        return 360;
                    }
                    if (r7.equals("InternElectionMetadata")) {
                        return 1403;
                    }
                    break;
                case 511:
                    if (r7.equals("BatchBloodRequest")) {
                        return 329;
                    }
                    if (r7.equals("BusinessAgreement")) {
                        return 383;
                    }
                    if (r7.equals("KototoroTemplateClipUsage")) {
                        return 1451;
                    }
                    break;
                case 512:
                    if (r7.equals("BCMPSponsoredEvent")) {
                        return 320;
                    }
                    break;
                case 513:
                    if (r7.equals("BusinessRoleRequest")) {
                        return 411;
                    }
                    if (r7.equals("InstagramMetricRangeDelta")) {
                        return 1332;
                    }
                    if (r7.equals("InteractiveEffectMetadata")) {
                        return 1400;
                    }
                    break;
                case 515:
                    if (r7.equals("BusinessFBPostContent")) {
                        return 392;
                    }
                    if (r7.equals("InstantGameFeedbackMetadata")) {
                        return 1370;
                    }
                    break;
                case 516:
                    if (r7.equals("BirthdayBotParticipant")) {
                        return 339;
                    }
                    if (r7.equals("BusinessIGMediaContent")) {
                        return 397;
                    }
                    if (r7.equals("BusinessPaymentAccount")) {
                        return 404;
                    }
                    break;
                case 518:
                    if (r7.equals("BoggleFriendlyAttachment")) {
                        return 358;
                    }
                    if (r7.equals("BusinessAssociatedObject")) {
                        return 385;
                    }
                    if (r7.equals("InstantExperiencesAutofillData")) {
                        return 1361;
                    }
                    break;
                case 519:
                    if (r7.equals("BCPAccountingEntryRequest")) {
                        return 322;
                    }
                    break;
                case 521:
                    if (r7.equals("BoostedComponentInsightsSet")) {
                        return 365;
                    }
                    if (r7.equals("BroadcastPinnedCommentEvent")) {
                        return 373;
                    }
                    break;
                case 522:
                    if (r7.equals("UnownedNewsQuiz")) {
                        return 3270;
                    }
                    break;
                case 523:
                    if (r7.equals("BroadcastLiveStickerUsedEvent")) {
                        return 372;
                    }
                    if (r7.equals("BusinessPendingPublishContent")) {
                        return 405;
                    }
                    break;
                case 524:
                    if (r7.equals("OwnedDomain")) {
                        return 2163;
                    }
                    break;
                case 525:
                    if (r7.equals("Organization")) {
                        return 2159;
                    }
                    break;
                case 528:
                    if (r7.equals("OpenGraphAction")) {
                        return 2145;
                    }
                    break;
                case 529:
                    if (r7.equals("OverlayAnimation")) {
                        return 2162;
                    }
                    if (r7.equals("QPStoryBucketOwner")) {
                        return 2559;
                    }
                    break;
                case 530:
                    if (r7.equals("BusinessOwnedObjectOnBehalfOfRequest")) {
                        return 403;
                    }
                    break;
                case 531:
                    if (r7.equals("OctopusRuleVersion")) {
                        return 2119;
                    }
                    if (r7.equals("OxsightsAnnotation")) {
                        return 2165;
                    }
                    break;
                case 532:
                    if (r7.equals("BusinessCreativeFolderSharingAgreement")) {
                        return 390;
                    }
                    if (r7.equals("QuickPromotionPointer")) {
                        return 2566;
                    }
                    break;
                case 533:
                    if (r7.equals("DAFCharity")) {
                        return 659;
                    }
                    break;
                case 534:
                    if (r7.equals("BusinessObjectTransferOwnershipAgreement")) {
                        return 402;
                    }
                    if (r7.equals("OctopusRulesetVersion")) {
                        return 2121;
                    }
                    break;
                case 535:
                    if (r7.equals("OrigamiResearchSession")) {
                        return 2160;
                    }
                    break;
                case 537:
                    if (r7.equals("DSCLegalEntity")) {
                        return 674;
                    }
                    break;
                case 538:
                    if (r7.equals("DSCPageProperty")) {
                        return 681;
                    }
                    break;
                case 540:
                    if (r7.equals("DSCDomainProperty")) {
                        return 669;
                    }
                    if (r7.equals("DSCIGUserProperty")) {
                        return 672;
                    }
                    break;
                case 541:
                    if (r7.equals("DSCMediaGroupEntry")) {
                        return 676;
                    }
                    break;
                case 542:
                    if (r7.equals("DSCBusinessProperty")) {
                        return 663;
                    }
                    break;
                case 545:
                    if (r7.equals("DSCApplicationProperty")) {
                        return 660;
                    }
                    if (r7.equals("DSCNewsDomainInventory")) {
                        return 679;
                    }
                    break;
                case 549:
                    if (r7.equals("DeveloperCommunityCategory")) {
                        return 697;
                    }
                    if (r7.equals("DraftBloodDonationFacility")) {
                        return 744;
                    }
                    break;
                case 550:
                    if (r7.equals("DeviceBurmeseFontCapability")) {
                        return 709;
                    }
                    break;
                case 557:
                    if (r7.equals("QuietModeBypass")) {
                        return 2570;
                    }
                    break;
                case 560:
                    if (r7.equals("StructuredSurveyFlow")) {
                        return 3100;
                    }
                    break;
                case 561:
                    if (r7.equals("ManualFactCheck")) {
                        return 1646;
                    }
                    break;
                case 562:
                    if (r7.equals("OxsightsReportInfo")) {
                        return 2185;
                    }
                    break;
                case 563:
                    if (r7.equals("MessengerUserLink")) {
                        return 1959;
                    }
                    if (r7.equals("OxsightsMSQueryInfo")) {
                        return 2179;
                    }
                    break;
                case 564:
                    if (r7.equals("MessengerGroupLink")) {
                        return 1922;
                    }
                    break;
                case 567:
                    if (r7.equals("MessengerReactionPack")) {
                        return 1947;
                    }
                    break;
                case 569:
                    if (r7.equals("MessengerCallInviteLink")) {
                        return 1901;
                    }
                    break;
                case 572:
                    if (r7.equals("MessengerGeneralInviteLink")) {
                        return 1915;
                    }
                    break;
                case 573:
                    if (r7.equals("InstagramInsightsMetric")) {
                        return 1308;
                    }
                    break;
                case 575:
                    if (r7.equals("MarketplaceUserReportFeedback")) {
                        return 1816;
                    }
                    break;
                case 577:
                    if (r7.equals("MessengerBusinessReportFeedback")) {
                        return 1898;
                    }
                    break;
                case 578:
                    if (r7.equals("ZeroCMSNative")) {
                        return 3560;
                    }
                    break;
                case 579:
                    if (r7.equals("InstagramInlineInsightsMetric")) {
                        return 1305;
                    }
                    if (r7.equals("MarketplaceAccessRestoredFeedback")) {
                        return 1650;
                    }
                    break;
                case 580:
                    if (r7.equals("InstagramProductInsightsMetric")) {
                        return 1333;
                    }
                    break;
                case 584:
                    if (r7.equals("MarketplaceSellerPolicyWarningFeedback")) {
                        return 1803;
                    }
                    break;
                case 589:
                    if (r7.equals("MixerChannel")) {
                        return 2003;
                    }
                    break;
                case 590:
                    if (r7.equals("MessengerCall")) {
                        return 1899;
                    }
                    break;
                case 595:
                    if (r7.equals("QuerySetMatchRuleInput")) {
                        return 2560;
                    }
                    break;
                case 598:
                    if (r7.equals("QuickPromotionStoryBucket")) {
                        return 2567;
                    }
                    break;
                case 599:
                    if (r7.equals("MarketplaceCuratedDeal")) {
                        return 1662;
                    }
                    if (r7.equals("OxsightsTailorFeatureApp")) {
                        return 2190;
                    }
                    break;
                case 600:
                    if (r7.equals("BobCustomView")) {
                        return 357;
                    }
                    break;
                case 601:
                    if (r7.equals("OxsightsTailorFeatureGroup")) {
                        return 2191;
                    }
                    break;
                case 603:
                    if (r7.equals("InstagramMessageThread")) {
                        return 1329;
                    }
                    if (r7.equals("InstantGameLeaderboard")) {
                        return 1372;
                    }
                    break;
                case 604:
                    if (r7.equals("MessageSuperResolutionModel")) {
                        return 1888;
                    }
                    break;
                case 607:
                    if (r7.equals("InstantGameQuestScoreBased")) {
                        return 1374;
                    }
                    if (r7.equals("MarketplacePhotosProductDetail")) {
                        return 1760;
                    }
                    if (r7.equals("Story")) {
                        return 3055;
                    }
                    break;
                case 608:
                    if (r7.equals("MarketplaceGenericProductDetail")) {
                        return 1732;
                    }
                    break;
                case 609:
                    if (r7.equals("InstagramStickyPromoteRecord")) {
                        return 1340;
                    }
                    if (r7.equals("MarketplacePandemicProductDetail")) {
                        return 1756;
                    }
                    if (r7.equals("MarketplaceSellerOrderHelpDetail")) {
                        return 1798;
                    }
                    if (r7.equals("MarketplaceVariantsProductDetail")) {
                        return 1818;
                    }
                    if (r7.equals("MediaEffectPreviewVideoThumbnail")) {
                        return 1844;
                    }
                    if (r7.equals("QuickPromotionNativeTemplateFeedUnit")) {
                        return 2565;
                    }
                    break;
                case 610:
                    if (r7.equals("MarketplaceSellerOrderBuyerDetail")) {
                        return 1796;
                    }
                    break;
                case 611:
                    if (r7.equals("InstantArticleCarouselNativeAd")) {
                        return 1349;
                    }
                    if (r7.equals("MarketplaceFBPageInfoProductDetail")) {
                        return 1676;
                    }
                    if (r7.equals("MarketplaceProductTagProductDetail")) {
                        return 1765;
                    }
                    if (r7.equals("MarketplaceRelatedAdsProductDetail")) {
                        return 1772;
                    }
                    if (r7.equals("MarketplaceSellerInfoProductDetail")) {
                        return 1794;
                    }
                    if (r7.equals("MarketplaceSellerOrderStatusDetail")) {
                        return 1802;
                    }
                    if (r7.equals("MarketplaceTitlePriceProductDetail")) {
                        return 1812;
                    }
                    if (r7.equals("SRTSurvey")) {
                        return 2832;
                    }
                    break;
                case 612:
                    if (r7.equals("MarketplaceSellerOrderPaymentDetail")) {
                        return 1800;
                    }
                    if (r7.equals("MarketplaceThemeFollowProductDetail")) {
                        return 1810;
                    }
                    break;
                case 613:
                    if (r7.equals("InstantGameQuestScoreBasedRecord")) {
                        return 1375;
                    }
                    if (r7.equals("MarketplaceRelatedItemsProductDetail")) {
                        return 1773;
                    }
                    if (r7.equals("SCDiversity")) {
                        return 2683;
                    }
                    if (r7.equals("ScimCompany")) {
                        return 2864;
                    }
                    break;
                case 614:
                    if (r7.equals("BloodDonationFacilityReview")) {
                        return 352;
                    }
                    break;
                case 615:
                    if (r7.equals("MarketplacePrimaryActionsProductDetail")) {
                        return 1763;
                    }
                    if (r7.equals("MarketplaceQuickPromotionProductDetail")) {
                        return 1767;
                    }
                    if (r7.equals("MarketplaceRecommendationProductDetail")) {
                        return 1771;
                    }
                    if (r7.equals("SCLegalEntity")) {
                        return 2693;
                    }
                    if (r7.equals("SocialVRParty")) {
                        return 2963;
                    }
                    break;
                case 616:
                    if (r7.equals("MarketplaceMarketingImagesProductDetail")) {
                        return 1747;
                    }
                    if (r7.equals("SCQuoteSummary")) {
                        return 2708;
                    }
                    break;
                case 617:
                    if (r7.equals("Image")) {
                        return 1244;
                    }
                    if (r7.equals("MarketplaceSellerOrderAppealStatusDetail")) {
                        return 1795;
                    }
                    if (r7.equals("MarketplaceStructuredFieldsProductDetail")) {
                        return 1809;
                    }
                    if (r7.equals("MobileOEM")) {
                        return 2010;
                    }
                    break;
                case 618:
                    if (r7.equals("MarketplaceMoreBuyingOptionsProductDetail")) {
                        return 1751;
                    }
                    if (r7.equals("SRTAuditActivity")) {
                        return 2740;
                    }
                    if (r7.equals("SourcingCategory")) {
                        return 2972;
                    }
                    if (r7.equals("StructuredSurvey")) {
                        return 3095;
                    }
                    break;
                case 619:
                    if (r7.equals("MarketplaceDynamicAdMoreItemsProductDetail")) {
                        return 1664;
                    }
                    if (r7.equals("MarketplaceSellerOrderListingSummaryDetail")) {
                        return 1799;
                    }
                    if (r7.equals("SocialWifiGateway")) {
                        return 2965;
                    }
                    break;
                case 620:
                    if (r7.equals("ImportIgProfilePicToPageResponsePayload")) {
                        return 1253;
                    }
                    if (r7.equals("MarketplaceSellerOrderShippingAddressDetail")) {
                        return 1801;
                    }
                    if (r7.equals("MarketplaceSimilarProductAlertProductDetail")) {
                        return 1808;
                    }
                    break;
                case 621:
                    if (r7.equals("MarketplacePivotAdsRelatedItemsProductDetail")) {
                        return 1761;
                    }
                    if (r7.equals("MarketplaceVehicleSimilarModelsProductDetail")) {
                        return 1821;
                    }
                    if (r7.equals("SerialDeviceHistory")) {
                        return 2890;
                    }
                    if (r7.equals("ServicesSubCategory")) {
                        return 2912;
                    }
                    break;
                case 622:
                    if (r7.equals("SerialDeviceWarranty")) {
                        return 2891;
                    }
                    if (r7.equals("ServicesMenuCategory")) {
                        return 2905;
                    }
                    if (r7.equals("ServicesRootCategory")) {
                        return 2910;
                    }
                    if (r7.equals("SourcingEventHistory")) {
                        return 2987;
                    }
                    break;
                case 623:
                    if (r7.equals("MarketplaceVehicleEntityPagePivotProductDetail")) {
                        return 1819;
                    }
                    break;
                case 624:
                    if (r7.equals("SwipeableAssetCategory")) {
                        return 3141;
                    }
                    break;
                case 625:
                    if (r7.equals("MarketplaceWarningSuggestionsHeaderProductDetail")) {
                        return 1825;
                    }
                    if (r7.equals("MentorshipProgram")) {
                        return 1867;
                    }
                    if (r7.equals("MessengerCallRoom")) {
                        return 1902;
                    }
                    if (r7.equals("SearchableEntitiesQuery")) {
                        return 2882;
                    }
                    if (r7.equals("SourcingTimelineHistory")) {
                        return 3005;
                    }
                    break;
                case 626:
                    if (r7.equals("InstantArticle")) {
                        return 1346;
                    }
                    if (r7.equals("ServicesApptShowupSurvey")) {
                        return 2895;
                    }
                    if (r7.equals("SourcingQuestionCategory")) {
                        return 2998;
                    }
                    break;
                case 627:
                    if (r7.equals("MessengerLivingRoom")) {
                        return 1926;
                    }
                    if (r7.equals("SourcingAttachmentHistory")) {
                        return 2969;
                    }
                    if (r7.equals("StoreOfferApprovalHistory")) {
                        return 3033;
                    }
                    break;
                case 628:
                    if (r7.equals("InstagramBusinessImportPageMediaResponsePayload")) {
                        return 1272;
                    }
                    if (r7.equals("MentorshipCurriculum")) {
                        return 1859;
                    }
                    if (r7.equals("StateControlledMediaEntity")) {
                        return 3022;
                    }
                    break;
                case 630:
                    if (r7.equals("InlineStyleAtRange")) {
                        return 1256;
                    }
                    if (r7.equals("SRTPartnerAssessmentActivity")) {
                        return 2795;
                    }
                    if (r7.equals("SourcingEventQuestionHistory")) {
                        return 2989;
                    }
                    if (r7.equals("SourcingEventResponseHistory")) {
                        return 2991;
                    }
                    break;
                case 631:
                    if (r7.equals("GPUReplayMetadata")) {
                        return 1053;
                    }
                    if (r7.equals("GroupsTabUnitData")) {
                        return 1193;
                    }
                    if (r7.equals("InstagramBrandedContentAppealCreateResponsePayload")) {
                        return 1271;
                    }
                    if (r7.equals("IntegrityPreference")) {
                        return 1397;
                    }
                    if (r7.equals("SourcingQuestionAnswerHistory")) {
                        return 2997;
                    }
                    if (r7.equals("SourcingSupplierDetailHistory")) {
                        return 3003;
                    }
                    if (r7.equals("SupportCaseMpC2CSellerInquiry")) {
                        return 3124;
                    }
                    break;
                case 632:
                    if (r7.equals("InstagramCanvasImage")) {
                        return 1296;
                    }
                    if (r7.equals("SourcingWorksheetConfigHistory")) {
                        return 3007;
                    }
                    break;
                case 633:
                    if (r7.equals("InterviewThankYouNote")) {
                        return 1406;
                    }
                    if (r7.equals("ServicesAppointmentAvailability")) {
                        return 2892;
                    }
                    break;
                case 634:
                    if (r7.equals("IPCommunicationMessage")) {
                        return 1241;
                    }
                    if (r7.equals("MessengerBusinessOrderItem")) {
                        return 1897;
                    }
                    break;
                case 635:
                    if (r7.equals("SourcingCostingSheetDetailHistory")) {
                        return 2979;
                    }
                    if (r7.equals("SourcingCostingSheetHeaderHistory")) {
                        return 2981;
                    }
                    break;
                case 636:
                    if (r7.equals("InstagramBusinessProfile")) {
                        return 1290;
                    }
                    if (r7.equals("InstantGameUpdateMessage")) {
                        return 1379;
                    }
                    if (r7.equals("InteractiveOverlaySingle")) {
                        return 1401;
                    }
                    break;
                case 637:
                    if (r7.equals("InstagramBoostedPostsEdge")) {
                        return 1270;
                    }
                    if (r7.equals("InstagramMediaMentionNode")) {
                        return 1318;
                    }
                    if (r7.equals("InstantGameGroupChallenge")) {
                        return 1371;
                    }
                    break;
                case 638:
                    if (r7.equals("GreetingCardTemplateData")) {
                        return 1135;
                    }
                    if (r7.equals("InstagramShoppingMediaNode")) {
                        return 1336;
                    }
                    break;
                case 639:
                    if (r7.equals("InstagramInlineInsightsNode")) {
                        return 1306;
                    }
                    if (r7.equals("InstantApplicationUserScope")) {
                        return 1345;
                    }
                    break;
                case 640:
                    if (r7.equals("InstagramProductInsightsNode")) {
                        return 1334;
                    }
                    if (r7.equals("InstagramShoppingProductNode")) {
                        return 1339;
                    }
                    break;
                case 641:
                    if (r7.equals("InstagramActionsBreakdownEdge")) {
                        return 1266;
                    }
                    if (r7.equals("InstantGamesMatchPlayersQueue")) {
                        return 1381;
                    }
                    break;
                case 642:
                    if (r7.equals("InstantExperiencesAutofillName")) {
                        return 1363;
                    }
                    if (r7.equals("Offer")) {
                        return 2124;
                    }
                    break;
                case 643:
                    if (r7.equals("InstagramShoppingMediaOwnerNode")) {
                        return 1337;
                    }
                    if (r7.equals("InstantExperiencesAutofillPhone")) {
                        return 1364;
                    }
                    break;
                case 644:
                    if (r7.equals("InstagramMediaHashtagStickerNode")) {
                        return 1314;
                    }
                    if (r7.equals("InstagramMediaTaggedLocationNode")) {
                        return 1325;
                    }
                    if (r7.equals("StructuredSurveyBranchNodeResponseMapEntry")) {
                        return 3096;
                    }
                    break;
                case 645:
                    if (r7.equals("OppError")) {
                        return 2148;
                    }
                    break;
                case 646:
                    if (r7.equals("StoryCardQuiz")) {
                        return 3071;
                    }
                    break;
                case 647:
                    if (r7.equals("InstagramBusinessManagerStoriesEdge")) {
                        return 1283;
                    }
                    if (r7.equals("Musician")) {
                        return 2056;
                    }
                    if (r7.equals("OppPartner")) {
                        return 2155;
                    }
                    break;
                case 648:
                    if (r7.equals("InstagramBusinessManagerTopPostsEdge")) {
                        return 1288;
                    }
                    if (r7.equals("InstagramMediaProductItemStickerNode")) {
                        return 1321;
                    }
                    break;
                case 650:
                    if (r7.equals("SponsoredNewsQuiz")) {
                        return 3012;
                    }
                    break;
                case 651:
                    if (r7.equals("InstantGameLiveGamingEventCreatedUpdate")) {
                        return 1373;
                    }
                    if (r7.equals("MultiPolygon")) {
                        return 2049;
                    }
                    break;
                case 652:
                    if (r7.equals("MarketingPlan")) {
                        return 1647;
                    }
                    if (r7.equals("MediaQuestion")) {
                        return 1849;
                    }
                    break;
                case 654:
                    if (r7.equals("InstagramBusinessManagerStoriesSummaryEdge")) {
                        return 1285;
                    }
                    if (r7.equals("MSPNotification")) {
                        return 1635;
                    }
                    if (r7.equals("MessageLocation")) {
                        return 1883;
                    }
                    break;
                case 655:
                    if (r7.equals("MBILandingScreen")) {
                        return 1623;
                    }
                    if (r7.equals("MobileTOSVersion")) {
                        return 2013;
                    }
                    break;
                case 656:
                    if (r7.equals("OpenCellularPartner")) {
                        return 2144;
                    }
                    if (r7.equals("OxsightsPartnerUser")) {
                        return 2184;
                    }
                    break;
                case 657:
                    if (r7.equals("InstagramBusinessManagerPromotionsSummaryEdge")) {
                        return 1279;
                    }
                    if (r7.equals("MicroPulseQuestion")) {
                        return 1992;
                    }
                    break;
                case 658:
                    if (r7.equals("MayaBluetoothBeacon")) {
                        return 1830;
                    }
                    if (r7.equals("MediaQuestionOption")) {
                        return 1850;
                    }
                    if (r7.equals("MessageLiveLocation")) {
                        return 1882;
                    }
                    if (r7.equals("MultiBackgroundIcon")) {
                        return 2045;
                    }
                    break;
                case 660:
                    if (r7.equals("MentorshipApplication")) {
                        return 1856;
                    }
                    if (r7.equals("MfsBillPayTransaction")) {
                        return 1976;
                    }
                    if (r7.equals("OmegaCustomPgmParameter")) {
                        return 2135;
                    }
                    break;
                case 661:
                    if (r7.equals("MarketplaceMeetingPlan")) {
                        return 1748;
                    }
                    if (r7.equals("MediaEffectInstruction")) {
                        return 1839;
                    }
                    if (r7.equals("MentorshipTextQuestion")) {
                        return 1870;
                    }
                    if (r7.equals("MixerPartnerSubmission")) {
                        return 2004;
                    }
                    break;
                case 662:
                    if (r7.equals("MarketplaceConversation")) {
                        return 1661;
                    }
                    if (r7.equals("MusicHomeEventPromotion")) {
                        return 2052;
                    }
                    break;
                case 663:
                    if (r7.equals("MessengerRetailPromotion")) {
                        return 1950;
                    }
                    if (r7.equals("MovieFactoryMusicCutdown")) {
                        return 2041;
                    }
                    if (r7.equals("OculusVirtualDesktopServer")) {
                        return 2123;
                    }
                    break;
                case 664:
                    if (r7.equals("MarketplaceInterestAction")) {
                        return 1740;
                    }
                    if (r7.equals("MarketplaceUserLastAction")) {
                        return 1814;
                    }
                    if (r7.equals("MiniShopStorefrontVersion")) {
                        return 1999;
                    }
                    break;
                case 665:
                    if (r7.equals("MessageThreadCustomization")) {
                        return 1890;
                    }
                    break;
                case 666:
                    if (r7.equals("MarketplacePartnerPromotion")) {
                        return 1757;
                    }
                    if (r7.equals("MessengerRetailCancellation")) {
                        return 1949;
                    }
                    if (r7.equals("MonthlyInvoicingApplication")) {
                        return 2031;
                    }
                    break;
                case 667:
                    if (r7.equals("MarketplaceEcommSubscription")) {
                        return 1675;
                    }
                    if (r7.equals("MarketplaceListingSuggestion")) {
                        return 1744;
                    }
                    if (r7.equals("MessengerContentSubscription")) {
                        return 1907;
                    }
                    if (r7.equals("MobileWorksClientInformation")) {
                        return 2016;
                    }
                    break;
                case 668:
                    if (r7.equals("MarketplaceGroupBuyInvitation")) {
                        return 1733;
                    }
                    if (r7.equals("MediaManagerExportInsightsRun")) {
                        return 1848;
                    }
                    if (r7.equals("MessageRecipientCustomization")) {
                        return 1886;
                    }
                    break;
                case 670:
                    if (r7.equals("BloodDonationFacility")) {
                        return 351;
                    }
                    if (r7.equals("MarketplaceSearchQuickPromotion")) {
                        return 1790;
                    }
                    if (r7.equals("MessengerMontageMessageReaction")) {
                        return 1934;
                    }
                    break;
                case 671:
                    if (r7.equals("MessengerContentBroadcastStation")) {
                        return 1906;
                    }
                    if (r7.equals("MessengerMontageArtPickerSection")) {
                        return 1929;
                    }
                    if (r7.equals("MessengerRoomsCreationSuggestion")) {
                        return 1955;
                    }
                    if (r7.equals("MonetizationEnforcementViolation")) {
                        return 2018;
                    }
                    break;
                case 672:
                    if (r7.equals("MarketplaceEcommEmailSubscription")) {
                        return 1671;
                    }
                    if (r7.equals("MarketplaceEcommProductPollOption")) {
                        return 1674;
                    }
                    if (r7.equals("MarketplaceProductReferralSession")) {
                        return 1764;
                    }
                    break;
                case 673:
                    if (r7.equals("BusinessFeedSuccessStory")) {
                        return 393;
                    }
                    if (r7.equals("MontageTextStyleColorSpecification")) {
                        return 2027;
                    }
                    break;
                case 675:
                    if (r7.equals("MessengerCommerceProductSubscription")) {
                        return 1905;
                    }
                    break;
                case 676:
                    if (r7.equals("BCMPBrandSearchHistoryEntry")) {
                        return 308;
                    }
                    break;
                case 677:
                    if (r7.equals("QuickReview")) {
                        return 2568;
                    }
                    break;
                case 679:
                    if (r7.equals("BillableOfferUsageHistoryEntry")) {
                        return 335;
                    }
                    break;
                case 682:
                    if (r7.equals("MessageAudio")) {
                        return 1877;
                    }
                    if (r7.equals("MessageVideo")) {
                        return 1891;
                    }
                    break;
                case 688:
                    if (r7.equals("MarketplaceMotorsPrivateSellerBusinessInformation")) {
                        return 1752;
                    }
                    break;
                case 690:
                    if (r7.equals("GroupPostTopic")) {
                        return 1169;
                    }
                    if (r7.equals("InstagramHashtag")) {
                        return 1303;
                    }
                    if (r7.equals("IntlEditedString")) {
                        return 1411;
                    }
                    if (r7.equals("IntlSourceString")) {
                        return 1413;
                    }
                    if (r7.equals("MemorializedUserInfo")) {
                        return 1854;
                    }
                    break;
                case 691:
                    if (r7.equals("InstantGameRating")) {
                        return 1376;
                    }
                    if (r7.equals("MessageEphemeralVideo")) {
                        return 1879;
                    }
                    break;
                case 692:
                    if (r7.equals("MarketplaceRealEstatePrivateSellerBusinessInformation")) {
                        return 1769;
                    }
                    break;
                case 693:
                    if (r7.equals("MediaEffectPreviewVideo")) {
                        return 1843;
                    }
                    break;
                case 696:
                    if (r7.equals("InstantShoppingCatalog")) {
                        return 1383;
                    }
                    break;
                case 698:
                    if (r7.equals("InvoiceAutoPaymentConfig")) {
                        return 1417;
                    }
                    if (r7.equals("IterativeSplitTestConfig")) {
                        return 1418;
                    }
                    break;
                case 699:
                    if (r7.equals("InstantExperiencesSetting")) {
                        return 1367;
                    }
                    if (r7.equals("IntlContentStrategyString")) {
                        return 1410;
                    }
                    break;
                case 701:
                    if (r7.equals("GroupEducationCenterTopic")) {
                        return 1147;
                    }
                    break;
                case 702:
                    if (r7.equals("VRPersona")) {
                        return 3288;
                    }
                    break;
                case 703:
                    if (r7.equals("MessengerMontageReactionWithAudio")) {
                        return 1937;
                    }
                    break;
                case 706:
                    if (r7.equals("InstantArticleWebViewAdReporting")) {
                        return 1358;
                    }
                    if (r7.equals("XPPExternalCase")) {
                        return 3557;
                    }
                    break;
                case 709:
                    if (r7.equals("MiniShop")) {
                        return 1994;
                    }
                    if (r7.equals("MobileCP")) {
                        return 2006;
                    }
                    if (r7.equals("OppProject")) {
                        return 2156;
                    }
                    break;
                case 711:
                    if (r7.equals("OppEquipment")) {
                        return 2147;
                    }
                    break;
                case 712:
                    if (r7.equals("OLRBlockEvent")) {
                        return 2117;
                    }
                    if (r7.equals("OppExperiment")) {
                        return 2149;
                    }
                    if (r7.equals("OxsightsAlert")) {
                        return 2164;
                    }
                    if (r7.equals("XRSceneObjectInstance")) {
                        return 3558;
                    }
                    break;
                case 713:
                    if (r7.equals("OctopusRuleset")) {
                        return 2120;
                    }
                    break;
                case 714:
                    if (r7.equals("OpenGraphObject")) {
                        return 2146;
                    }
                    break;
                case 715:
                    if (r7.equals("GiftCard")) {
                        return 1092;
                    }
                    if (r7.equals("OmegaBankAccount")) {
                        return 2133;
                    }
                    break;
                case 716:
                    if (r7.equals("MarketplaceShop")) {
                        return 1805;
                    }
                    if (r7.equals("OppGraphChangeset")) {
                        return 2153;
                    }
                    if (r7.equals("OxsightsSiteEvent")) {
                        return 2187;
                    }
                    break;
                case 717:
                    if (r7.equals("OppInternalDataset")) {
                        return 2154;
                    }
                    break;
                case 718:
                    if (r7.equals("ManagedMediaGroup")) {
                        return 1641;
                    }
                    if (r7.equals("OmegaInvoiceRequest")) {
                        return 2137;
                    }
                    break;
                case 719:
                    if (r7.equals("GreetingCard")) {
                        return 1133;
                    }
                    if (r7.equals("MPPPermissionGroup")) {
                        return 1632;
                    }
                    break;
                case 722:
                    if (r7.equals("GamingVideoRaid")) {
                        return 1072;
                    }
                    if (r7.equals("MontageTextStyleGroup")) {
                        return 2028;
                    }
                    if (r7.equals("MultiAuthorStoryGroup")) {
                        return 2044;
                    }
                    break;
                case 725:
                    if (r7.equals("GroupSupportThread")) {
                        return 1184;
                    }
                    if (r7.equals("MentorshipCurriculumStep")) {
                        return 1860;
                    }
                    break;
                case 726:
                    if (r7.equals("OxsightsSitusPolygonNIAlert")) {
                        return 2188;
                    }
                    break;
                case 727:
                    if (r7.equals("GoodwillStoryCTACard")) {
                        return 1117;
                    }
                    if (r7.equals("IGBusinessManagerGraph")) {
                        return 1233;
                    }
                    if (r7.equals("IntlRlxPerDeviceSwitch")) {
                        return 1412;
                    }
                    if (r7.equals("MediaEffectPermissionGroup")) {
                        return 1842;
                    }
                    if (r7.equals("OxsightsCustomPolygonNIAlert")) {
                        return 2166;
                    }
                    break;
                case 728:
                    if (r7.equals("GoodwillThrowbackCard")) {
                        return 1119;
                    }
                    if (r7.equals("OxygenPreloadsCarrierContract")) {
                        return 2195;
                    }
                    break;
                case 729:
                    if (r7.equals("InstantGamesOfflineMatch")) {
                        return 1382;
                    }
                    if (r7.equals("MarketplaceSearchFeedThemeQP")) {
                        return 1789;
                    }
                    break;
                case 730:
                    if (r7.equals("GroupCommerceMarkAsSold")) {
                        return 1144;
                    }
                    if (r7.equals("MarketplaceSearchFeedBannerQP")) {
                        return 1776;
                    }
                    break;
                case 733:
                    if (r7.equals("GlobalSupportFormDateField")) {
                        return 1103;
                    }
                    if (r7.equals("GlobalSupportFormTextField")) {
                        return 1108;
                    }
                    break;
                case 734:
                    if (r7.equals("MentorshipMessengerCurriculumStep")) {
                        return 1861;
                    }
                    break;
                case 735:
                    if (r7.equals("GlobalSupportFormToggleField")) {
                        return 1109;
                    }
                    if (r7.equals("MarketplaceSearchFeedThemeBannerQP")) {
                        return 1788;
                    }
                    break;
                case 737:
                    if (r7.equals("GlobalSupportFormSelectorField")) {
                        return 1106;
                    }
                    break;
                case 738:
                    if (r7.equals("GlobalSupportFormCodeBlockField")) {
                        return 1102;
                    }
                    if (r7.equals("GlobalSupportFormRadioListField")) {
                        return 1105;
                    }
                    break;
                case 740:
                    if (r7.equals("GlobalSupportFormWhatsAppHsmField")) {
                        return 1110;
                    }
                    break;
                case 741:
                    if (r7.equals("GlobalSupportFormCheckboxListField")) {
                        return 1101;
                    }
                    break;
                case 742:
                    if (r7.equals("Game")) {
                        return 1055;
                    }
                    if (r7.equals("GlobalSupportFormStaticContentField")) {
                        return 1107;
                    }
                    break;
                case 745:
                    if (r7.equals("GlobalSupportFormFacebookEntitiesField")) {
                        return 1104;
                    }
                    break;
                case 746:
                    if (r7.equals("GameTime")) {
                        return 1060;
                    }
                    if (r7.equals("Geofence")) {
                        return 1089;
                    }
                    break;
                case 747:
                    if (r7.equals("GiftStore")) {
                        return 1098;
                    }
                    if (r7.equals("GroupFile")) {
                        return 1152;
                    }
                    if (r7.equals("GroupRule")) {
                        return 1175;
                    }
                    break;
                case 748:
                    if (r7.equals("GovService")) {
                        return 1128;
                    }
                    break;
                case 749:
                    if (r7.equals("GroupInvite")) {
                        return 1155;
                    }
                    break;
                case 750:
                    if (r7.equals("GenieMessage")) {
                        return 1086;
                    }
                    if (r7.equals("GlobalSupportFormWorkplaceCustomNoticeField")) {
                        return 1111;
                    }
                    break;
                case 753:
                    if (r7.equals("GameroomRelease")) {
                        return 1061;
                    }
                    if (r7.equals("GiftcardBalance")) {
                        return 1099;
                    }
                    if (r7.equals("GroupUserInvite")) {
                        return 1187;
                    }
                    break;
                case 755:
                    if (r7.equals("GroupSupportIssue")) {
                        return 1183;
                    }
                    break;
                case 756:
                    if (r7.equals("GamePaymentInvoice")) {
                        return 1059;
                    }
                    if (r7.equals("GoodwillVideoFrame")) {
                        return 1124;
                    }
                    break;
                case 757:
                    if (r7.equals("ESMTextLinkedData")) {
                        return 794;
                    }
                    break;
                case 758:
                    if (r7.equals("GoodwillVideoMessage")) {
                        return 1125;
                    }
                    if (r7.equals("GoodwillVideoPicture")) {
                        return 1126;
                    }
                    if (r7.equals("GreetingCardTemplate")) {
                        return 1134;
                    }
                    if (r7.equals("GroupRecommendedPage")) {
                        return 1172;
                    }
                    break;
                case 759:
                    if (r7.equals("EventConnectionData")) {
                        return 839;
                    }
                    if (r7.equals("EventTicketInfoData")) {
                        return 853;
                    }
                    if (r7.equals("GamingVideoViewerGame")) {
                        return 1075;
                    }
                    if (r7.equals("GenericEffectInstance")) {
                        return 1084;
                    }
                    break;
                case 760:
                    if (r7.equals("GamingCreatorIncentive")) {
                        return 1068;
                    }
                    if (r7.equals("GemstoneUserPreference")) {
                        return 1078;
                    }
                    if (r7.equals("GroupAnonAuthorProfile")) {
                        return 1142;
                    }
                    break;
                case 761:
                    if (r7.equals("ESMWorkUserLinkedData")) {
                        return 800;
                    }
                    if (r7.equals("GroupSupportUserMessage")) {
                        return 1185;
                    }
                    break;
                case 762:
                    if (r7.equals("ESMInternSEVLinkedData")) {
                        return 761;
                    }
                    break;
                case 763:
                    if (r7.equals("ESMInternTaskLinkedData")) {
                        return 762;
                    }
                    if (r7.equals("Quiz")) {
                        return 2572;
                    }
                    break;
                case 765:
                    if (r7.equals("GroupSupportFacebookMessage")) {
                        return 1182;
                    }
                    if (r7.equals("GroupVoterRegistrationDrive")) {
                        return 1188;
                    }
                    break;
                case 766:
                    if (r7.equals("ESMLabelValueSetLinkedData")) {
                        return 770;
                    }
                    if (r7.equals("ESMThreatProfileLinkedData")) {
                        return 795;
                    }
                    break;
                case 767:
                    if (r7.equals("GeneralGroupContextualProfile")) {
                        return 1080;
                    }
                    break;
                case 771:
                    if (r7.equals("EventDiscoverCategoryFormatData")) {
                        return 840;
                    }
                    break;
                case 772:
                    if (r7.equals("MixerUser")) {
                        return 2005;
                    }
                    break;
                case 773:
                    if (r7.equals("MfsPartner")) {
                        return 1984;
                    }
                    break;
                case 775:
                    if (r7.equals("MagmaPartner")) {
                        return 1636;
                    }
                    if (r7.equals("VidwallaSavedGraphic")) {
                        return 3353;
                    }
                    break;
                case 776:
                    if (r7.equals("MobileCarrier")) {
                        return 2007;
                    }
                    if (r7.equals("MoneyTransfer")) {
                        return 2019;
                    }
                    break;
                case 777:
                    if (r7.equals("MessagePointer")) {
                        return 1885;
                    }
                    if (r7.equals("MfsP2PTransfer")) {
                        return 1983;
                    }
                    if (r7.equals("MiBGroupAnchor")) {
                        return 1989;
                    }
                    if (r7.equals("MontageSticker")) {
                        return 2024;
                    }
                    break;
                case 778:
                    if (r7.equals("GfycatGif")) {
                        return 1091;
                    }
                    if (r7.equals("MCMobileCarrier")) {
                        return 1626;
                    }
                    if (r7.equals("MovieBotTheater")) {
                        return 2038;
                    }
                    break;
                case 779:
                    if (r7.equals("MarketplaceOffer")) {
                        return 1755;
                    }
                    break;
                case 780:
                    if (r7.equals("MayaStyleTransfer")) {
                        return 1834;
                    }
                    break;
                case 781:
                    if (r7.equals("MiBPageStoryAnchor")) {
                        return 1991;
                    }
                    break;
                case 783:
                    if (r7.equals("MentorshipTextAnswer")) {
                        return 1869;
                    }
                    break;
                case 784:
                    if (r7.equals("MessengerSystemFolder")) {
                        return 1956;
                    }
                    if (r7.equals("MusicVideoHomeWrapper")) {
                        return 2053;
                    }
                    break;
                case 785:
                    if (r7.equals("KnowledgeNoteVersion")) {
                        return 1442;
                    }
                    if (r7.equals("MessengerCallGuestUser")) {
                        return 1900;
                    }
                    if (r7.equals("MessengerEventReminder")) {
                        return 1912;
                    }
                    break;
                case 786:
                    if (r7.equals("MarketplaceListingOffer")) {
                        return 1743;
                    }
                    break;
                case 788:
                    if (r7.equals("MarketingSolutionProvider")) {
                        return ReactTextInputManager.IME_ACTION_ID;
                    }
                    break;
                case 789:
                    if (r7.equals("EmployeeCheckupJob")) {
                        return 817;
                    }
                    if (r7.equals("MarketplacePaymentProvider")) {
                        return 1759;
                    }
                    if (r7.equals("MarketplaceVerticalPartner")) {
                        return 1822;
                    }
                    break;
                case 790:
                    if (r7.equals("KototoroDailyNotification")) {
                        return 1447;
                    }
                    if (r7.equals("MarketplaceSearchFeedFilter")) {
                        return 1780;
                    }
                    if (r7.equals("MarketplaceSearchFeedHeader")) {
                        return 1783;
                    }
                    if (r7.equals("MentorshipMessengerReminder")) {
                        return 1865;
                    }
                    if (r7.equals("MorDonationTransactionOrder")) {
                        return 2033;
                    }
                    break;
                case 791:
                    if (r7.equals("MarketplaceItemShippingOrder")) {
                        return 1742;
                    }
                    if (r7.equals("OxsightsTailorSectionExportCSV")) {
                        return 2193;
                    }
                    break;
                case 792:
                    if (r7.equals("MarketplaceUserWhatsAppNumber")) {
                        return 1817;
                    }
                    break;
                case 793:
                    if (r7.equals("MarketplaceSearchFeedFilterBar")) {
                        return 1781;
                    }
                    break;
                case 796:
                    if (r7.equals("MarketplaceSearchFeedResultHeader")) {
                        return 1785;
                    }
                    break;
                case 797:
                    if (r7.equals("EmployeeCheckupDispatchJob")) {
                        return 816;
                    }
                    if (r7.equals("MentorshipMessengerProgressTracker")) {
                        return 1864;
                    }
                    break;
                case 800:
                    if (r7.equals("MessengerPlatformDirectoryImageBanner")) {
                        return 1943;
                    }
                    if (r7.equals("MorDonationsMatchingConfirmationOrder")) {
                        return 2034;
                    }
                    break;
                case 801:
                    if (r7.equals("OfferView")) {
                        return 2129;
                    }
                    if (r7.equals("OmniMFlow")) {
                        return 2141;
                    }
                    break;
                case 802:
                    if (r7.equals("VideoPreviewCard")) {
                        return 3327;
                    }
                    break;
                case 805:
                    if (r7.equals("MusicCharts")) {
                        return 2051;
                    }
                    break;
                case 806:
                    if (r7.equals("MarketplaceContinueShoppingViewTimesCounter")) {
                        return 1660;
                    }
                    if (r7.equals("MarketplaceInactiveSearchUsersUpsellCounter")) {
                        return 1739;
                    }
                    break;
                case 807:
                    if (r7.equals("MontageStatus")) {
                        return 2023;
                    }
                    if (r7.equals("MorDonationCauseForCharitiesTransactionOrder")) {
                        return 2032;
                    }
                    break;
                case 808:
                    if (r7.equals("MailingAddress")) {
                        return 1637;
                    }
                    break;
                case 812:
                    if (r7.equals("GroupHashtag")) {
                        return 1154;
                    }
                    if (r7.equals("GroupPostTag")) {
                        return 1168;
                    }
                    break;
                case 813:
                    if (r7.equals("VideoTextQuestionPromptCard")) {
                        return 3339;
                    }
                    break;
                case 814:
                    if (r7.equals("MessengerEmojiStatus")) {
                        return 1911;
                    }
                    break;
                case 815:
                    if (r7.equals("GroupSellConfig")) {
                        return 1178;
                    }
                    if (r7.equals("VideoTextQuestionResponseCard")) {
                        return 3342;
                    }
                    break;
                case 818:
                    if (r7.equals("MessageMultipleLocations")) {
                        return 1884;
                    }
                    break;
                case 819:
                    if (r7.equals("GroupAdminChangelog")) {
                        return 1139;
                    }
                    if (r7.equals("ImpersonationFeedback")) {
                        return 1250;
                    }
                    break;
                case 821:
                    if (r7.equals("MarketplaceLocationSettings")) {
                        return 1746;
                    }
                    break;
                case 822:
                    if (r7.equals("InstantGameShareableLink")) {
                        return 1378;
                    }
                    if (r7.equals("MiniShopHScrollOfCollections")) {
                        return 1996;
                    }
                    break;
                case 823:
                    if (r7.equals("MerchantOnboardingForTHStatus")) {
                        return 1874;
                    }
                    break;
                case 824:
                    if (r7.equals("MarketplaceSearchFeedNoResults")) {
                        return 1784;
                    }
                    if (r7.equals("Vehicle")) {
                        return 3292;
                    }
                    break;
                case 825:
                    if (r7.equals("ImpersonationVictimFeedback")) {
                        return 1252;
                    }
                    if (r7.equals("MarketplaceBillboardUserActions")) {
                        return 1653;
                    }
                    break;
                case 827:
                    if (r7.equals("MarketplaceFeedServicesMerchUnits")) {
                        return 1719;
                    }
                    if (r7.equals("MarketplaceSearchFeedEndOfResults")) {
                        return 1779;
                    }
                    break;
                case 828:
                    if (r7.equals("VehicleMake")) {
                        return 3293;
                    }
                    break;
                case 829:
                    if (r7.equals("MailingAddressBackedAutofillAddress")) {
                        return 1638;
                    }
                    if (r7.equals("MarketplaceVerticalsIngestionStatus")) {
                        return 1824;
                    }
                    if (r7.equals("OfferX")) {
                        return 2131;
                    }
                    break;
                case 830:
                    if (r7.equals("VideoSubtitle")) {
                        return 3335;
                    }
                    if (r7.equals("VideoTemplate")) {
                        return 3337;
                    }
                    break;
                case 831:
                    if (r7.equals("VenuesInstance")) {
                        return 3299;
                    }
                    if (r7.equals("VerseGroupRole")) {
                        return 3301;
                    }
                    break;
                case 832:
                    if (r7.equals("ImpersonationQuestionnaireFeedback")) {
                        return 1251;
                    }
                    if (r7.equals("MessagingPageAdminNotificationSettings")) {
                        return 1892;
                    }
                    break;
                case 835:
                    if (r7.equals("GoodwillDailyDialogueWeatherSetting")) {
                        return 1114;
                    }
                    if (r7.equals("MaskEffect")) {
                        return 1827;
                    }
                    if (r7.equals("VendorExternalCase")) {
                        return 3298;
                    }
                    break;
                case 836:
                    if (r7.equals("Mask3DAsset")) {
                        return 1826;
                    }
                    if (r7.equals("MayaARAsset")) {
                        return 1829;
                    }
                    if (r7.equals("MusicArtist")) {
                        return 2050;
                    }
                    if (r7.equals("TrendingTopicData")) {
                        return 3241;
                    }
                    break;
                case 837:
                    if (r7.equals("MCOMShipment")) {
                        return 1627;
                    }
                    if (r7.equals("MilanWorkout")) {
                        return 1993;
                    }
                    break;
                case 838:
                    if (r7.equals("MessengerCart")) {
                        return 1903;
                    }
                    if (r7.equals("MontageDirect")) {
                        return 2020;
                    }
                    if (r7.equals("VidwallaUploadedImage")) {
                        return 3356;
                    }
                    break;
                case 839:
                    if (r7.equals("MentionsPrompt")) {
                        return 1855;
                    }
                    if (r7.equals("MerchantReport")) {
                        return 1875;
                    }
                    if (r7.equals("VoterRegistrationDrive")) {
                        return 3370;
                    }
                    break;
                case 840:
                    if (r7.equals("MarketplacePost")) {
                        return 1762;
                    }
                    if (r7.equals("VidwallaExternalPackage")) {
                        return 3352;
                    }
                    break;
                case 841:
                    if (r7.equals("MayaPlanarTarget")) {
                        return 1831;
                    }
                    if (r7.equals("MfsBillPayIntent")) {
                        return 1973;
                    }
                    if (r7.equals("ViewerConfigurationsEdge")) {
                        return 3359;
                    }
                    break;
                case 842:
                    if (r7.equals("MobileStoreObject")) {
                        return 2012;
                    }
                    if (r7.equals("MobileWorksClient")) {
                        return 2015;
                    }
                    if (r7.equals("MovieBotMovieList")) {
                        return 2036;
                    }
                    if (r7.equals("VideoTextQuestionResponse")) {
                        return 3341;
                    }
                    break;
                case 843:
                    if (r7.equals("MediaManagerExportInsightsCreatorStudioParameters")) {
                        return 1846;
                    }
                    if (r7.equals("MessengerEmojiFont")) {
                        return 1910;
                    }
                    if (r7.equals("MiniShopStorefront")) {
                        return 1998;
                    }
                    break;
                case 844:
                    if (r7.equals("ExploreFeed")) {
                        return 865;
                    }
                    if (r7.equals("MessageSearchResult")) {
                        return 1887;
                    }
                    if (r7.equals("MisinformationEvent")) {
                        return 2001;
                    }
                    if (r7.equals("MovieLoyaltyAccount")) {
                        return 2043;
                    }
                    if (r7.equals("TiefenrauschModelMetadata")) {
                        return 3192;
                    }
                    if (r7.equals("VirtualProductAttributeType")) {
                        return 3362;
                    }
                    break;
                case 845:
                    if (r7.equals("ManagedStripeAccount")) {
                        return 1644;
                    }
                    if (r7.equals("MarketplaceECommPost")) {
                        return 1669;
                    }
                    if (r7.equals("MessagingParticipant")) {
                        return 1893;
                    }
                    if (r7.equals("MfsCashoutAttachment")) {
                        return 1980;
                    }
                    if (r7.equals("VirtualProductAttributeValue")) {
                        return 3363;
                    }
                    break;
                case 846:
                    if (r7.equals("EPHistoryProd")) {
                        return 750;
                    }
                    if (r7.equals("ESMChatThread")) {
                        return 756;
                    }
                    if (r7.equals("MessengerReactionFont")) {
                        return 1946;
                    }
                    break;
                case 847:
                    if (r7.equals("ESMEmailThread")) {
                        return 758;
                    }
                    if (r7.equals("KototoroTemplateClip")) {
                        return 1450;
                    }
                    if (r7.equals("MPersonalRemindersList")) {
                        return 1633;
                    }
                    if (r7.equals("ManagedMerchantAccount")) {
                        return 1643;
                    }
                    if (r7.equals("MediaContainerMediaSet")) {
                        return 1837;
                    }
                    if (r7.equals("MessengerApiFeePayment")) {
                        return 1895;
                    }
                    if (r7.equals("MessengerPayThemeAsset")) {
                        return 1941;
                    }
                    if (r7.equals("MessengerReactionAsset")) {
                        return 1945;
                    }
                    if (r7.equals("MessengerRetailReceipt")) {
                        return 1951;
                    }
                    if (r7.equals("MfsQRPaymentAttachment")) {
                        return 1986;
                    }
                    break;
                case 848:
                    if (r7.equals("GamingCoplayMatch")) {
                        return 1067;
                    }
                    if (r7.equals("MediaAttachmentMediaSet")) {
                        return 1836;
                    }
                    if (r7.equals("MentorshipProgramCohort")) {
                        return 1868;
                    }
                    if (r7.equals("MessengerGameScoreSheet")) {
                        return 1914;
                    }
                    if (r7.equals("MessengerRetailShipment")) {
                        return 1952;
                    }
                    if (r7.equals("MfsSendToCodeAttachment")) {
                        return 1987;
                    }
                    if (r7.equals("VideoBulkUploadImporterZipState")) {
                        return 3311;
                    }
                    break;
                case 849:
                    if (r7.equals("MessengerCommercePayment")) {
                        return 1904;
                    }
                    break;
                case 850:
                    if (r7.equals("MessengerGlobalCampusChat")) {
                        return 1916;
                    }
                    if (r7.equals("MessengerViewerCampusChat")) {
                        return 1961;
                    }
                    if (r7.equals("MovieBotMovieShowtimeList")) {
                        return 2037;
                    }
                    break;
                case 851:
                    if (r7.equals("ExternalCreditCard")) {
                        return 885;
                    }
                    if (r7.equals("MarketplaceFeedForSaleUnit")) {
                        return 1691;
                    }
                    if (r7.equals("MarketplaceFeedGeneralUnit")) {
                        return 1695;
                    }
                    if (r7.equals("MarketplaceFeedRentalsUnit")) {
                        return 1715;
                    }
                    if (r7.equals("MessengerGlobalFBGroupChat")) {
                        return 1917;
                    }
                    if (r7.equals("MessengerMontageAudioAsset")) {
                        return 1930;
                    }
                    if (r7.equals("MessengerMontageEmojiAsset")) {
                        return 1931;
                    }
                    if (r7.equals("MessengerMontageMaskEffect")) {
                        return 1933;
                    }
                    if (r7.equals("MessengerViewerFBGroupChat")) {
                        return 1962;
                    }
                    break;
                case 852:
                    if (r7.equals("MBirthdayReminderAttachment")) {
                        return 1625;
                    }
                    if (r7.equals("MarketplaceFeedCategoryUnit")) {
                        return 1687;
                    }
                    if (r7.equals("MarketplaceFeedTopPicksUnit")) {
                        return 1724;
                    }
                    if (r7.equals("MediaUploadedByUserMediaSet")) {
                        return 1852;
                    }
                    if (r7.equals("MfsBillPayCreatedAttachment")) {
                        return 1971;
                    }
                    if (r7.equals("MfsPurchaseStatusAttachment")) {
                        return 1985;
                    }
                    if (r7.equals("MultiLocationCityConstraint")) {
                        return 2047;
                    }
                    break;
                case 853:
                    if (r7.equals("ManagedAsyncExecutionContext")) {
                        return 1640;
                    }
                    if (r7.equals("MarketplaceSearchFeedB2CUnit")) {
                        return 1775;
                    }
                    if (r7.equals("MessengerMontageShaderEffect")) {
                        return 1938;
                    }
                    if (r7.equals("MessengerReactionStaticAsset")) {
                        return 1948;
                    }
                    break;
                case 854:
                    if (r7.equals("MediaEffectInstructionVariant")) {
                        return 1840;
                    }
                    if (r7.equals("MessengerDrawerBuiltInElement")) {
                        return 1909;
                    }
                    if (r7.equals("MessengerThreadThemeIconAsset")) {
                        return 1958;
                    }
                    break;
                case 855:
                    if (r7.equals("MarketplaceECommPartnerRollout")) {
                        return 1668;
                    }
                    if (r7.equals("MarketplaceFeedSavedSearchUnit")) {
                        return 1717;
                    }
                    if (r7.equals("MasterCustomPublisherBlockList")) {
                        return 1828;
                    }
                    if (r7.equals("MentorshipMessengerLeavePrompt")) {
                        return 1863;
                    }
                    if (r7.equals("MessengerMontageParticleEffect")) {
                        return 1936;
                    }
                    if (r7.equals("MessengerThreadBackgroundAsset")) {
                        return 1957;
                    }
                    if (r7.equals("MfsCashInInstructionAttachment")) {
                        return 1979;
                    }
                    if (r7.equals("MfsP2PReceiveOptionsAttachment")) {
                        return 1982;
                    }
                    if (r7.equals("MultiLocationCountryConstraint")) {
                        return 2048;
                    }
                    if (r7.equals("VideoPromotionRequestGeotargetSchedule")) {
                        return 3332;
                    }
                    break;
                case 856:
                    if (r7.equals("MfsCashInConfirmationAttachment")) {
                        return 1978;
                    }
                    break;
                case 858:
                    if (r7.equals("MarketplaceFeedRecentlyPostedUnit")) {
                        return 1711;
                    }
                    if (r7.equals("MarketplaceSearchFeedCategoryList")) {
                        return 1777;
                    }
                    if (r7.equals("MessengerGlobalLocalCommunityChat")) {
                        return 1920;
                    }
                    if (r7.equals("MessengerViewerLocalCommunityChat")) {
                        return 1964;
                    }
                    if (r7.equals("MfsBillPayReferenceCodeAttachment")) {
                        return 1974;
                    }
                    if (r7.equals("MfsTimeSensitiveBalanceAttachment")) {
                        return 1988;
                    }
                    if (r7.equals("MultiLocationActivationConstraint")) {
                        return 2046;
                    }
                    break;
                case 859:
                    if (r7.equals("MarketplaceServiceMessagingContext")) {
                        return 1804;
                    }
                    if (r7.equals("MfsBCPCashOutInstructionAttachment")) {
                        return 1969;
                    }
                    break;
                case 860:
                    if (r7.equals("InstantExperiencesAutofillEmail")) {
                        return 1362;
                    }
                    if (r7.equals("MarketplaceMerchandisingProductSort")) {
                        return 1749;
                    }
                    if (r7.equals("Menu")) {
                        return 1872;
                    }
                    if (r7.equals("MessengerMontageStyleTransferEffect")) {
                        return 1939;
                    }
                    if (r7.equals("MfsBBVACashOutInstructionAttachment")) {
                        return 1968;
                    }
                    if (r7.equals("MfsBDLNCashOutInstructionAttachment")) {
                        return 1970;
                    }
                    break;
                case 861:
                    if (r7.equals("MarketplaceSearchFeedSuggestionPivot")) {
                        return 1787;
                    }
                    if (r7.equals("MessengerAdsPartialAutomatedStepList")) {
                        return 1894;
                    }
                    if (r7.equals("MessengerRetailShipmentTrackingEvent")) {
                        return 1953;
                    }
                    if (r7.equals("MfsBillPaymentConfirmationAttachment")) {
                        return 1977;
                    }
                    break;
                case 862:
                    if (r7.equals("MarketplaceFeedBillboardPromotionUnit")) {
                        return 1680;
                    }
                    if (r7.equals("MarketplaceFeedGeneralVideoUnitObject")) {
                        return 1696;
                    }
                    if (r7.equals("MarketplaceFeedMotorsIntentSurveyUnit")) {
                        return 1704;
                    }
                    if (r7.equals("MarketplaceFeedRecentSingleSearchUnit")) {
                        return 1710;
                    }
                    if (r7.equals("MarketplaceSearchRefineSearchFeedUnit")) {
                        return 1792;
                    }
                    if (r7.equals("MentorshipMessengerDiscussionTopicSet")) {
                        return 1862;
                    }
                    if (r7.equals("MfsIdvDebitCardConfirmationAttachment")) {
                        return 1981;
                    }
                    break;
                case 863:
                    if (r7.equals("MarketplaceFeedAutosRecentlyViewedUnit")) {
                        return 1679;
                    }
                    if (r7.equals("MarketplaceItemBasedRecommendationUnit")) {
                        return 1741;
                    }
                    if (r7.equals("MarketplaceSearchRelatedSearchFeedUnit")) {
                        return 1793;
                    }
                    break;
                case 867:
                    if (r7.equals("MarketplaceFeedRelatedToRecentlyViewedUnit")) {
                        return 1712;
                    }
                    if (r7.equals("MarketplaceFeedSimilarToEngagedHScrollUnit")) {
                        return 1723;
                    }
                    break;
                case 871:
                    if (r7.equals("ESMRole")) {
                        return 772;
                    }
                    break;
                case 872:
                    if (r7.equals("EInvoice")) {
                        return 748;
                    }
                    break;
                case 875:
                    if (r7.equals("ESMResource")) {
                        return 771;
                    }
                    if (r7.equals("EventInvite")) {
                        return 845;
                    }
                    break;
                case 876:
                    if (r7.equals("ExternalCase")) {
                        return 878;
                    }
                    break;
                case 877:
                    if (r7.equals("ESMViewedCase")) {
                        return 799;
                    }
                    if (r7.equals("EntityAtRange")) {
                        return 827;
                    }
                    if (r7.equals("EsportsLeague")) {
                        return 830;
                    }
                    if (r7.equals("ExternalMovie")) {
                        return 887;
                    }
                    if (r7.equals("OxsightsHighlightsStory")) {
                        return 2177;
                    }
                    break;
                case 878:
                    if (r7.equals("ESMServiceCase")) {
                        return 774;
                    }
                    break;
                case 879:
                    if (r7.equals("CrisisGeoArea")) {
                        return 641;
                    }
                    if (r7.equals("ESMEmailMessage")) {
                        return 757;
                    }
                    if (r7.equals("EventSMSInvitee")) {
                        return 848;
                    }
                    if (r7.equals("MarketplaceFeedInactiveSearchUsersContinueShoppingUnit")) {
                        return 1698;
                    }
                    break;
                case 880:
                    if (r7.equals("EffectFileBundle")) {
                        return 807;
                    }
                    if (r7.equals("ExternalCaseType")) {
                        return 883;
                    }
                    break;
                case 881:
                    if (r7.equals("ContactFormData")) {
                        return 594;
                    }
                    if (r7.equals("ESMActivityCreate")) {
                        return 751;
                    }
                    if (r7.equals("EcommBuyerProfile")) {
                        return 801;
                    }
                    if (r7.equals("EventEmailInvitee")) {
                        return 841;
                    }
                    if (r7.equals("MarketplaceFeedProductPreferenceBinaryDecisionUnitObject")) {
                        return 1708;
                    }
                    break;
                case 882:
                    if (r7.equals("ESMChatTextMessage")) {
                        return 755;
                    }
                    if (r7.equals("ESMInvolvementType")) {
                        return 768;
                    }
                    if (r7.equals("ESMServiceCaseType")) {
                        return 788;
                    }
                    if (r7.equals("ExternalCaseUpdate")) {
                        return 884;
                    }
                    if (r7.equals("ExternalTaskUpdate")) {
                        return 901;
                    }
                    if (r7.equals("OxsightsHighlightsAlertStory")) {
                        return 2170;
                    }
                    if (r7.equals("OxsightsHighlightsVideoStory")) {
                        return 2178;
                    }
                    break;
                case 883:
                    if (r7.equals("EducationExperience")) {
                        return 806;
                    }
                    break;
                case 884:
                    if (r7.equals("CollegeChatPersona")) {
                        return 528;
                    }
                    if (r7.equals("CrisisRelatedMedia")) {
                        return 646;
                    }
                    if (r7.equals("ESMServiceCaseSource")) {
                        return 782;
                    }
                    if (r7.equals("ESMServiceObjectType")) {
                        return 791;
                    }
                    if (r7.equals("OxsightsHighlightsDynamicStory")) {
                        return 2172;
                    }
                    break;
                case 885:
                    if (r7.equals("ExternalMovieSchedule")) {
                        return 890;
                    }
                    if (r7.equals("ExternalMovieShowtime")) {
                        return 891;
                    }
                    break;
                case 886:
                    if (r7.equals("CommerceSyncMetadata")) {
                        return 556;
                    }
                    if (r7.equals("CovidCurationHubData")) {
                        return 622;
                    }
                    if (r7.equals("ESMVerticalUserProfile")) {
                        return 798;
                    }
                    if (r7.equals("EventUserLocationShare")) {
                        return 861;
                    }
                    if (r7.equals("InstagramMessageThreadItem")) {
                        return 1330;
                    }
                    break;
                case 887:
                    if (r7.equals("ESMInvestigationProfile")) {
                        return 763;
                    }
                    if (r7.equals("OxsightsHighlightsPredictionStory")) {
                        return 2174;
                    }
                    break;
                case 888:
                    if (r7.equals("CollegeProfileMetadata")) {
                        return 531;
                    }
                    if (r7.equals("InstantArticleNTCarouselItem")) {
                        return 1352;
                    }
                    break;
                case 889:
                    if (r7.equals("ESMServiceCaseSummaryType")) {
                        return 786;
                    }
                    if (r7.equals("OxsightsHighlightsSegmentAlertStory")) {
                        return 2175;
                    }
                    break;
                case 890:
                    if (r7.equals("ESMTrendingServiceCaseType")) {
                        return 796;
                    }
                    if (r7.equals("EventCalendarableDateRange")) {
                        return 836;
                    }
                    break;
                case 892:
                    if (r7.equals("EcommProductSubsidyIncentive")) {
                        return 804;
                    }
                    break;
                case 895:
                    if (r7.equals("EmployeeCheckupAsyncJobInstance")) {
                        return 812;
                    }
                    break;
                case 896:
                    if (r7.equals("OxsightsHighlightsSitusPolygonNIAlertStory")) {
                        return 2176;
                    }
                    break;
                case 897:
                    if (r7.equals("ESMInvestigationProfileAppearance")) {
                        return 765;
                    }
                    if (r7.equals("OxsightsHighlightsCustomPolygonNIAlertStory")) {
                        return 2171;
                    }
                    if (r7.equals("VideoTipJarSetting")) {
                        return 3346;
                    }
                    break;
                case 899:
                    if (r7.equals("CommerceProductCollectionMetadata")) {
                        return 549;
                    }
                    if (r7.equals("VRFullStateRecording")) {
                        return 3287;
                    }
                    break;
                case 900:
                    if (r7.equals("TopicFollowingTopic")) {
                        return 3224;
                    }
                    break;
                case 901:
                    if (r7.equals("ESMActivityServiceCaseSubStatusChange")) {
                        return 752;
                    }
                    if (r7.equals("KototoroUser")) {
                        return 1453;
                    }
                    if (r7.equals("TrendingCuratedTopic")) {
                        return 3236;
                    }
                    break;
                case 904:
                    if (r7.equals("CoworkerGroupContextualProfileMetadata")) {
                        return 625;
                    }
                    break;
                case 906:
                    if (r7.equals("CrisisHub")) {
                        return 643;
                    }
                    if (r7.equals("KototoroContainer")) {
                        return 1446;
                    }
                    break;
                case 909:
                    if (r7.equals("InstantApplication")) {
                        return 1343;
                    }
                    break;
                case 911:
                    if (r7.equals("ConnectedTVTab")) {
                        return 590;
                    }
                    if (r7.equals("CoronavirusHub")) {
                        return 610;
                    }
                    break;
                case 912:
                    if (r7.equals("InstantArticleVersion")) {
                        return 1357;
                    }
                    if (r7.equals("KototoroChallengeWinner")) {
                        return 1445;
                    }
                    break;
                case 913:
                    if (r7.equals("InstructionalAnimation")) {
                        return 1396;
                    }
                    break;
                case 916:
                    if (r7.equals("InstagramCanvasLinkAction")) {
                        return 1297;
                    }
                    break;
                case 917:
                    if (r7.equals("CovidInformationBlob")) {
                        return 624;
                    }
                    if (r7.equals("XrayModel")) {
                        return 3559;
                    }
                    break;
                case 918:
                    if (r7.equals("IGShoppingBulkUpdateSession")) {
                        return 1238;
                    }
                    if (r7.equals("InstagramCanvasVideoVersion")) {
                        return 1299;
                    }
                    break;
                case 919:
                    if (r7.equals("IGEditorialProductCollection")) {
                        return 1236;
                    }
                    if (r7.equals("InstantArticleDonationOption")) {
                        return 1350;
                    }
                    break;
                case 921:
                    if (r7.equals("InstantApplicationContextToken")) {
                        return 1344;
                    }
                    break;
                case 922:
                    if (r7.equals("InstagramBoostedPostsConnection")) {
                        return 1269;
                    }
                    break;
                case 923:
                    if (r7.equals("InstantArticleSubscriptionOption")) {
                        return 1355;
                    }
                    break;
                case 925:
                    if (r7.equals("InstantExperiencesCredentialDomain")) {
                        return 1365;
                    }
                    break;
                case 926:
                    if (r7.equals("InstagramActionsBreakdownConnection")) {
                        return 1265;
                    }
                    if (r7.equals("TarotPhotoCard")) {
                        return 3164;
                    }
                    if (r7.equals("TarotVideoCard")) {
                        return 3165;
                    }
                    break;
                case 927:
                    if (r7.equals("InstantArticleSubscriptionUserAction")) {
                        return 1356;
                    }
                    break;
                case 929:
                    if (r7.equals("ImpressionsSurfacesBreakdownConnection")) {
                        return 1254;
                    }
                    if (r7.equals("InstagramMediaShareBreakdownConnection")) {
                        return 1323;
                    }
                    if (r7.equals("TemplateDashboard")) {
                        return 3170;
                    }
                    break;
                case 931:
                    if (r7.equals("InstagramFollowStatusBreakdownConnection")) {
                        return 1302;
                    }
                    break;
                case 932:
                    if (r7.equals("ESMTag")) {
                        return 792;
                    }
                    if (r7.equals("InstagramBusinessManagerStoriesConnection")) {
                        return 1282;
                    }
                    if (r7.equals("InstantArticleFreeTrialSubscriptionOption")) {
                        return 1351;
                    }
                    break;
                case 933:
                    if (r7.equals("InstagramBusinessManagerTopPostsConnection")) {
                        return 1287;
                    }
                    if (r7.equals("InstantArticleAppInstallSubscriptionOption")) {
                        return 1347;
                    }
                    if (r7.equals("InstantArticlePageFollowSubscriptionOption")) {
                        return 1353;
                    }
                    break;
                case 934:
                    if (r7.equals("InstagramMediaHashtagsImpressionsConnection")) {
                        return 1315;
                    }
                    if (r7.equals("InstagramMediaShareWithShareTypeAttribution")) {
                        return 1324;
                    }
                    if (r7.equals("InstagramProfileActionsWithMediaAttribution")) {
                        return 1335;
                    }
                    break;
                case 935:
                    if (r7.equals("InstagramInsightsFollowsWithMediaAttribution")) {
                        return 1307;
                    }
                    break;
                case 936:
                    if (r7.equals("ImbeStoryPhoto")) {
                        return 1247;
                    }
                    if (r7.equals("ImbeStoryVideo")) {
                        return 1248;
                    }
                    break;
                case 937:
                    if (r7.equals("InstagramBusinessManagerMetricsGraphConnection")) {
                        return 1277;
                    }
                    break;
                case 938:
                    if (r7.equals("ExternalSong")) {
                        return 896;
                    }
                    if (r7.equals("MarketplaceC2CReview")) {
                        return 1658;
                    }
                    break;
                case 939:
                    if (r7.equals("ESMFormConfig")) {
                        return 759;
                    }
                    if (r7.equals("EventThemeTag")) {
                        return 852;
                    }
                    if (r7.equals("GroupInviteLink")) {
                        return 1156;
                    }
                    if (r7.equals("GroupStaticLink")) {
                        return 1180;
                    }
                    if (r7.equals("InstagramBusinessManagerStoriesSummaryConnection")) {
                        return 1284;
                    }
                    break;
                case 940:
                    if (r7.equals("GeoblockFeedback")) {
                        return 1088;
                    }
                    break;
                case 941:
                    if (r7.equals("ExternalTaskTag")) {
                        return 900;
                    }
                    if (r7.equals("InstagramInsightsProfileVisitsWithMediaAttribution")) {
                        return 1311;
                    }
                    break;
                case 942:
                    if (r7.equals("InstagramBusinessManagerPromotionsSummaryConnection")) {
                        return 1278;
                    }
                    break;
                case 943:
                    if (r7.equals("GroupReportFeedback")) {
                        return 1173;
                    }
                    break;
                case 944:
                    if (r7.equals("EventTicketSetting")) {
                        return 856;
                    }
                    if (r7.equals("MessengerPlatformBotReview")) {
                        return 1942;
                    }
                    break;
                case 946:
                    if (r7.equals("CosmosAudienceSpec")) {
                        return 612;
                    }
                    if (r7.equals("EventsAppUserSetting")) {
                        return 862;
                    }
                    break;
                case 947:
                    if (r7.equals("EventAttendanceConfig")) {
                        return 833;
                    }
                    if (r7.equals("GroupCheckpointFeedback")) {
                        return 1143;
                    }
                    if (r7.equals("ManagedStripeVerificationFlow")) {
                        return 1645;
                    }
                    break;
                case 948:
                    if (r7.equals("GroupResponsibleFeedback")) {
                        return 1174;
                    }
                    break;
                case 950:
                    if (r7.equals("EventRegistrationSetting")) {
                        return 847;
                    }
                    break;
                case 952:
                    if (r7.equals("CommunitiesTrendingTopic")) {
                        return 560;
                    }
                    if (r7.equals("ElectionFRXReportingConfig")) {
                        return 808;
                    }
                    if (r7.equals("EventTicketOrderHistoryLog")) {
                        return 855;
                    }
                    if (r7.equals("GroupMessengerCallInviteLink")) {
                        return 1163;
                    }
                    break;
                case 953:
                    if (r7.equals("TriviaGame")) {
                        return 3243;
                    }
                    break;
                case 954:
                    if (r7.equals("TargetImage")) {
                        return 3161;
                    }
                    break;
                case 955:
                    if (r7.equals("GroupAdminDeleteContentFeedback")) {
                        return 1140;
                    }
                    break;
                case 956:
                    if (r7.equals("GroupMemberReportContentFeedback")) {
                        return 1159;
                    }
                    if (r7.equals("ISP")) {
                        return 1242;
                    }
                    break;
                case 958:
                    if (r7.equals("RichMediaData")) {
                        return 2653;
                    }
                    if (r7.equals("TalentShowStage")) {
                        return 3159;
                    }
                    break;
                case 960:
                    if (r7.equals("ThirdPartyProfile")) {
                        return 3181;
                    }
                    break;
                case 961:
                    if (r7.equals("TransactionInvoice")) {
                        return 3232;
                    }
                    break;
                case 962:
                    if (r7.equals("TogetherDSTInstance")) {
                        return 3213;
                    }
                    if (r7.equals("TriviaGameExtraLife")) {
                        return 3245;
                    }
                    break;
                case 963:
                    if (r7.equals("GSSchool")) {
                        return 1054;
                    }
                    break;
                case 965:
                    if (r7.equals("ResearchWhatsAppData")) {
                        return 2646;
                    }
                    if (r7.equals("TrendingEventCandidate")) {
                        return 3240;
                    }
                    break;
                case 966:
                    if (r7.equals("GameChatURL")) {
                        return 1057;
                    }
                    if (r7.equals("RightsManagerPageData")) {
                        return 2657;
                    }
                    break;
                case 967:
                    if (r7.equals("RightsManagerAdminData")) {
                        return 2656;
                    }
                    if (r7.equals("TopUpcomingScheduledLive")) {
                        return 3221;
                    }
                    if (r7.equals("TriviaGameTermsOfService")) {
                        return 3252;
                    }
                    break;
                case 968:
                    if (r7.equals("TreehengePAYGSubscribable")) {
                        return 3235;
                    }
                    break;
                case 970:
                    if (r7.equals("CuratedFeed")) {
                        return 652;
                    }
                    if (r7.equals("GamingVideoGoal")) {
                        return 1071;
                    }
                    break;
                case 971:
                    if (r7.equals("CommerceLead")) {
                        return 545;
                    }
                    if (r7.equals("ESMSavedSearch")) {
                        return 773;
                    }
                    break;
                case 973:
                    if (r7.equals("CRMCustomField")) {
                        return 460;
                    }
                    if (r7.equals("MessengerLiveLocationNux")) {
                        return 1925;
                    }
                    break;
                case 974:
                    if (r7.equals("CP2PayoutRecord")) {
                        return 456;
                    }
                    if (r7.equals("TogetherWBFeaturedWorldSchedule")) {
                        return 3220;
                    }
                    break;
                case 975:
                    if (r7.equals("ContactNameField")) {
                        return 596;
                    }
                    break;
                case 976:
                    if (r7.equals("CHEXMessageThread")) {
                        return 426;
                    }
                    if (r7.equals("IntlContentCommentGroup")) {
                        return 1409;
                    }
                    break;
                case 978:
                    if (r7.equals("MBTCorrespondanceSupportInbox")) {
                        return 1624;
                    }
                    break;
                case 983:
                    if (r7.equals("GroupEducationCenterTutorial")) {
                        return 1148;
                    }
                    break;
                case 984:
                    if (r7.equals("CloudGamingVirtualGamepad")) {
                        return 502;
                    }
                    break;
                case 985:
                    if (r7.equals("ContactRecommendationField")) {
                        return 598;
                    }
                    break;
                case 992:
                    if (r7.equals("MemeCategory")) {
                        return 1853;
                    }
                    if (r7.equals("RacialJusticeHub")) {
                        return 2585;
                    }
                    break;
                case 993:
                    if (r7.equals("MalwareFamily")) {
                        return 1639;
                    }
                    break;
                case 995:
                    if (r7.equals("CreateVideoMeetupLinkResponsePayload")) {
                        return 627;
                    }
                    break;
                case 997:
                    if (r7.equals("Aloha")) {
                        return 196;
                    }
                    if (r7.equals("Arena")) {
                        return 265;
                    }
                    break;
                case 998:
                    if (r7.equals("CRMImage")) {
                        return 461;
                    }
                    if (r7.equals("CRMStage")) {
                        return 463;
                    }
                    break;
                case 1000:
                    if (r7.equals("CGCProfile")) {
                        return 416;
                    }
                    if (r7.equals("CRMProfile")) {
                        return 462;
                    }
                    if (r7.equals("CouponCode")) {
                        return 619;
                    }
                    break;
                case 1001:
                    if (r7.equals("CHEXMessage")) {
                        return 424;
                    }
                    if (r7.equals("CommentFile")) {
                        return 533;
                    }
                    if (r7.equals("GroupLivingRoom")) {
                        return 1158;
                    }
                    break;
                case 1002:
                    if (r7.equals("ContactPhone")) {
                        return 597;
                    }
                    if (r7.equals("MarketplaceFeedAdStory")) {
                        return 1677;
                    }
                    break;
                case 1003:
                    if (r7.equals("CommerceStore")) {
                        return 553;
                    }
                    if (r7.equals("GlobalSupportForm")) {
                        return 1100;
                    }
                    break;
                case 1004:
                    if (r7.equals("CommunityVoice")) {
                        return 568;
                    }
                    if (r7.equals("CustomChatRule")) {
                        return 654;
                    }
                    if (r7.equals("MarketplaceFeedShopStory")) {
                        return 1721;
                    }
                    if (r7.equals("MovieFactoryMoodCategory")) {
                        return 2039;
                    }
                    break;
                case 1005:
                    if (r7.equals("MarketplaceFeedVideoStory")) {
                        return 1728;
                    }
                    if (r7.equals("MentorshipMessengerSurvey")) {
                        return 1866;
                    }
                    break;
                case 1006:
                    if (r7.equals("MarketplaceFeedUpsellStory")) {
                        return 1727;
                    }
                    break;
                case 1007:
                    if (r7.equals("AvatarUsageData")) {
                        return 302;
                    }
                    if (r7.equals("MarketplaceFeedListingStory")) {
                        return 1700;
                    }
                    if (r7.equals("MessengerMontageArtCategory")) {
                        return 1928;
                    }
                    break;
                case 1008:
                    if (r7.equals("CHEXPaymentInvoice")) {
                        return 434;
                    }
                    if (r7.equals("CHElvesRoutingRule")) {
                        return 451;
                    }
                    if (r7.equals("CommerceStoreShare")) {
                        return 555;
                    }
                    if (r7.equals("ConfigurableSnooze")) {
                        return 587;
                    }
                    if (r7.equals("MarketplaceFeedAdUpsellStory")) {
                        return 1678;
                    }
                    if (r7.equals("MarketplaceFeedComposerStory")) {
                        return 1688;
                    }
                    if (r7.equals("MarketplaceFeedJobsListStory")) {
                        return 1699;
                    }
                    if (r7.equals("MessengerRoomDefaultActivity")) {
                        return 1954;
                    }
                    break;
                case 1009:
                    if (r7.equals("MarketplaceFeedMegaphoneStory")) {
                        return 1703;
                    }
                    break;
                case 1010:
                    if (r7.equals("CommerceExternalCase")) {
                        return 541;
                    }
                    if (r7.equals("GroupCommerceProductItem")) {
                        return 1145;
                    }
                    if (r7.equals("MarketplaceFeedMoviesListStory")) {
                        return 1705;
                    }
                    if (r7.equals("MarketplaceFeedSalesPromoStory")) {
                        return 1716;
                    }
                    break;
                case 1011:
                    if (r7.equals("CodingProblemTestCase")) {
                        return 526;
                    }
                    if (r7.equals("MarketplaceFeedForSalePostStory")) {
                        return 1690;
                    }
                    if (r7.equals("MarketplaceFeedShopProductStory")) {
                        return 1720;
                    }
                    if (r7.equals("MarketplaceFeedShopsUpsellStory")) {
                        return 1722;
                    }
                    break;
                case 1012:
                    if (r7.equals("AvatarContinuousData")) {
                        return 290;
                    }
                    if (r7.equals("CPOPageToAuthEntBridge")) {
                        return 457;
                    }
                    if (r7.equals("CompassCuratedUnitNote")) {
                        return 575;
                    }
                    if (r7.equals("MarketplaceFeedBudgetUpsellStory")) {
                        return 1683;
                    }
                    if (r7.equals("MarketplaceFeedDealsProductStory")) {
                        return 1689;
                    }
                    break;
                case 1013:
                    if (r7.equals("AREffectSparkLabsData")) {
                        return 22;
                    }
                    if (r7.equals("CanonicalAttributeValue")) {
                        return 474;
                    }
                    if (r7.equals("ContentTargeterOverride")) {
                        return 600;
                    }
                    break;
                case 1014:
                    if (r7.equals("CollegeContextualProfile")) {
                        return 529;
                    }
                    if (r7.equals("CollegeProfileFieldValue")) {
                        return 530;
                    }
                    if (r7.equals("CommerceProductItemShare")) {
                        return 550;
                    }
                    if (r7.equals("ThreatTag")) {
                        return 3188;
                    }
                    break;
                case 1015:
                    if (r7.equals("MarketplaceFeedServiceProviderStory")) {
                        return 1718;
                    }
                    if (r7.equals("MarketplaceSearchFeedCorrectedQuery")) {
                        return 1778;
                    }
                    break;
                case 1016:
                    if (r7.equals("CompassCurationUserProfile")) {
                        return 581;
                    }
                    if (r7.equals("MarketplaceBuyerTXNReportingCategory")) {
                        return 1657;
                    }
                    if (r7.equals("MarketplaceEcommFollowedFOMOCategory")) {
                        return 1672;
                    }
                    if (r7.equals("MarketplaceFeedRentalMapClusterStory")) {
                        return 1713;
                    }
                    if (r7.equals("MarketplaceFeedRentalMapFastPinStory")) {
                        return 1714;
                    }
                    break;
                case 1017:
                    if (r7.equals("CivicGraphCrowdsourcingVote")) {
                        return 491;
                    }
                    if (r7.equals("MarketplaceBuySellGroupCommercePolicy")) {
                        return 1655;
                    }
                    if (r7.equals("MarketplaceFeedTopSearchesUpsellStory")) {
                        return 1725;
                    }
                    break;
                case 1018:
                    if (r7.equals("AdvertiserIssueTagMetadata")) {
                        return 176;
                    }
                    if (r7.equals("CharitableGivingProfileBadge")) {
                        return 482;
                    }
                    if (r7.equals("MarketplaceFeedBoostedC2CPostListStory")) {
                        return 1681;
                    }
                    if (r7.equals("MarketplaceFeedFuzzyFilterListingStory")) {
                        return 1693;
                    }
                    if (r7.equals("MarketplaceFeedManageYourListingsStory")) {
                        return 1702;
                    }
                    if (r7.equals("TipJarSetting")) {
                        return 3200;
                    }
                    break;
                case 1019:
                    if (r7.equals("AREffectPortalStoryTimeData")) {
                        return 20;
                    }
                    break;
                case 1020:
                    if (r7.equals("MarketplaceFeedBoostedListingUpsellStory")) {
                        return 1682;
                    }
                    if (r7.equals("MarketplaceUserCampaignImpressionHistory")) {
                        return 1813;
                    }
                    break;
                case 1021:
                    if (r7.equals("CodingContestEntrantPerformance")) {
                        return 509;
                    }
                    if (r7.equals("CodingProblemSubmissionTemplate")) {
                        return 525;
                    }
                    if (r7.equals("TriviaGameConfig")) {
                        return 3244;
                    }
                    break;
                case 1023:
                    if (r7.equals("CompassCurationSavedContentSource")) {
                        return 580;
                    }
                    if (r7.equals("ConsumerPaymentAccountRawDoNotUse")) {
                        return 592;
                    }
                    if (r7.equals("MarketplaceFeedHomeServicePremadeQuoteStory")) {
                        return 1697;
                    }
                    break;
                case 1024:
                    if (r7.equals("CreatorMonetizationProductTOSState")) {
                        return 635;
                    }
                    if (r7.equals("MarketplaceFeedBuyAndSellGroupDiscoveryStory")) {
                        return 1684;
                    }
                    if (r7.equals("MarketplaceFeedLiveShoppingVideosUpsellStory")) {
                        return 1701;
                    }
                    if (r7.equals("MarketplaceFeedVisualNotificationUpsellStory")) {
                        return 1729;
                    }
                    if (r7.equals("ThreatSubjectiveTag")) {
                        return 3187;
                    }
                    break;
                case 1025:
                    if (r7.equals("IntlVendor")) {
                        return 1416;
                    }
                    if (r7.equals("TipJarPaymentSetting")) {
                        return 3199;
                    }
                    break;
                case 1026:
                    if (r7.equals("ContextualProfileGroupsPostNullState")) {
                        return 601;
                    }
                    if (r7.equals("CreatorMonetizationProductSetupState")) {
                        return 633;
                    }
                    if (r7.equals("MarketplaceFeedBuyAndSellGroupForSalePostStory")) {
                        return 1685;
                    }
                    if (r7.equals("MarketplaceFeedFullWidthStaticThemeUpsellStory")) {
                        return 1692;
                    }
                    if (r7.equals("ResearchDemographic")) {
                        return 2630;
                    }
                    break;
                case 1027:
                    if (r7.equals("CreatorMonetizationProductActiveState")) {
                        return 629;
                    }
                    if (r7.equals("ResearchProjectTopic")) {
                        return 2643;
                    }
                    break;
                case 1028:
                    if (r7.equals("InstagramUser")) {
                        return 1341;
                    }
                    if (r7.equals("MarketplaceFeedNotificationNonProductUpsellStory")) {
                        return 1706;
                    }
                    break;
                case 1029:
                    if (r7.equals("CreateOrUpdateForDeviceUpgradeOverMobileDataPreferencesResponsePayload")) {
                        return 626;
                    }
                    if (r7.equals("ImbeStoryActor")) {
                        return 1245;
                    }
                    if (r7.equals("MarketplaceFeedNotificationProductItemUpsellStory")) {
                        return 1707;
                    }
                    if (r7.equals("TogetherASArtworkDrawing")) {
                        return 3207;
                    }
                    break;
                case 1030:
                    if (r7.equals("CodingContestClarificationRequestMessage")) {
                        return 506;
                    }
                    if (r7.equals("IDBlockBehavior")) {
                        return 1231;
                    }
                    if (r7.equals("VideoRemovedMessageFeedback")) {
                        return 3333;
                    }
                    break;
                case 1032:
                    if (r7.equals("CodingContestClarificationResponseTemplate")) {
                        return 508;
                    }
                    if (r7.equals("CreatorMonetizationProductUnderReviewState")) {
                        return 636;
                    }
                    break;
                case 1033:
                    if (r7.equals("AkiraTVTab")) {
                        return 193;
                    }
                    if (r7.equals("GroupEmailDomain")) {
                        return 1149;
                    }
                    if (r7.equals("MarketplaceFeedBuyAndSellGroupSuggestedFromGroupStory")) {
                        return 1686;
                    }
                    if (r7.equals("MarketplaceMotorsVehicleEntityPageRecommendationStory")) {
                        return 1754;
                    }
                    break;
                case 1034:
                    if (r7.equals("CreatorMonetizationProductPreonboardingState")) {
                        return 632;
                    }
                    if (r7.equals("InspirationsSticker")) {
                        return 1259;
                    }
                    break;
                case 1035:
                    if (r7.equals("InsertResultBehavior")) {
                        return 1257;
                    }
                    break;
                case 1036:
                    if (r7.equals("MarketplaceMotorsSingleVehicleEntityPageInformationStory")) {
                        return 1753;
                    }
                    break;
                case 1037:
                    if (r7.equals("ApplicationHub")) {
                        return 258;
                    }
                    if (r7.equals("CreatorMonetizationProductSubscriptionInfoState")) {
                        return 634;
                    }
                    if (r7.equals("GoodwillVideoSection")) {
                        return 1127;
                    }
                    if (r7.equals("GovServiceSubmission")) {
                        return 1129;
                    }
                    if (r7.equals("InstagramMessagingUser")) {
                        return 1331;
                    }
                    if (r7.equals("InterestTappableHeader")) {
                        return 1402;
                    }
                    break;
                case 1038:
                    if (r7.equals("GoodwillStoryCampaign")) {
                        return 1118;
                    }
                    if (r7.equals("GoodwillVideoCampaign")) {
                        return 1123;
                    }
                    if (r7.equals("InstantExperiencesOrder")) {
                        return 1366;
                    }
                    break;
                case 1039:
                    if (r7.equals("InstagramBusinessManager")) {
                        return 1273;
                    }
                    break;
                case 1040:
                    if (r7.equals("GroupMembershipQuestion")) {
                        return 1161;
                    }
                    break;
                case 1041:
                    if (r7.equals("GenericContentCollection")) {
                        return 1081;
                    }
                    if (r7.equals("GoodwillBirthdayCampaign")) {
                        return 1113;
                    }
                    break;
                case 1042:
                    if (r7.equals("CreatorMonetizationProductOnboardingPaymentInfoState")) {
                        return 630;
                    }
                    if (r7.equals("InstagramMediaMentionedUser")) {
                        return 1319;
                    }
                    if (r7.equals("Vertical")) {
                        return 3305;
                    }
                    break;
                case 1043:
                    if (r7.equals("InstagramInlineInsightsError")) {
                        return 1304;
                    }
                    break;
                case 1044:
                    if (r7.equals("GoodwillAnniversaryCampaign")) {
                        return 1112;
                    }
                    if (r7.equals("GoodwillStarversaryCampaign")) {
                        return 1116;
                    }
                    if (r7.equals("InternationalElectionReminder")) {
                        return 1405;
                    }
                    break;
                case 1045:
                    if (r7.equals("RSSFeed")) {
                        return 2581;
                    }
                    break;
                case 1046:
                    if (r7.equals("CreatorMonetizationProductOnboardingSubmissionReadyState")) {
                        return 631;
                    }
                    if (r7.equals("GoodwillFriendversaryCampaign")) {
                        return 1115;
                    }
                    if (r7.equals("GroupMembershipQuestionOption")) {
                        return 1162;
                    }
                    if (r7.equals("VehicleModel")) {
                        return 3294;
                    }
                    break;
                case 1047:
                    if (r7.equals("VerseGroupURL")) {
                        return 3302;
                    }
                    break;
                case 1048:
                    if (r7.equals("VideoThumbnail")) {
                        return 3343;
                    }
                    break;
                case 1049:
                    if (r7.equals("InstagramCameraEffectsQueryBuilder")) {
                        return 1293;
                    }
                    if (r7.equals("InstagramCameraFormatsQueryBuilder")) {
                        return 1294;
                    }
                    if (r7.equals("VideoSliderPoll")) {
                        return 3334;
                    }
                    break;
                case 1051:
                    if (r7.equals("InstantShoppingElementTextDescriptor")) {
                        return 1395;
                    }
                    break;
                case 1053:
                    if (r7.equals("ReminderPayload")) {
                        return 2624;
                    }
                    if (r7.equals("ResolutionField")) {
                        return 2648;
                    }
                    break;
                case 1054:
                    if (r7.equals("InstagramCameraSpecificTrayQueryBuilder")) {
                        return 1295;
                    }
                    if (r7.equals("RobotMastPayload")) {
                        return 2666;
                    }
                    if (r7.equals("VerticalExperimental")) {
                        return 3306;
                    }
                    if (r7.equals("VirtualVideosChannel")) {
                        return 3365;
                    }
                    break;
                case 1055:
                    if (r7.equals("InstantShoppingDocumentElementDescriptor")) {
                        return 1388;
                    }
                    break;
                case 1059:
                    if (r7.equals("RobotComponentPayload")) {
                        return 2661;
                    }
                    break;
                case 1061:
                    if (r7.equals("CosmosTag")) {
                        return 613;
                    }
                    break;
                case 1062:
                    if (r7.equals("ExternalTask")) {
                        return 897;
                    }
                    break;
                case 1064:
                    if (r7.equals("IGShoppingCreatorsWhitelistBulkUpdateProductError")) {
                        return 1239;
                    }
                    break;
                case 1065:
                    if (r7.equals("CrisisListing")) {
                        return 645;
                    }
                    if (r7.equals("InstantGameBusiness")) {
                        return 1369;
                    }
                    break;
                case 1066:
                    if (r7.equals("IGShoppingHighlightedProductsBulkUpdateProductError")) {
                        return 1240;
                    }
                    break;
                case 1069:
                    if (r7.equals("AdproTargetSpec")) {
                        return 148;
                    }
                    break;
                case 1072:
                    if (r7.equals("CHEXShipmentTracking")) {
                        return 447;
                    }
                    if (r7.equals("ESMServiceCaseFeedback")) {
                        return 776;
                    }
                    if (r7.equals("InstagramMediaTagsInsights")) {
                        return 1326;
                    }
                    break;
                case 1073:
                    if (r7.equals("AdRuleExecutionSpec")) {
                        return 137;
                    }
                    if (r7.equals("CommunityReviewRating")) {
                        return 567;
                    }
                    if (r7.equals("ContinuousSyncSetting")) {
                        return 605;
                    }
                    break;
                case 1074:
                    if (r7.equals("AdRuleEvaluationSpec")) {
                        return 136;
                    }
                    if (r7.equals("GamesGroupUserSettingsInfo")) {
                        return 1063;
                    }
                    break;
                case 1075:
                    if (r7.equals("CRMAutoEmailReplyConfig")) {
                        return 459;
                    }
                    break;
                case 1076:
                    if (r7.equals("CompassCuratedContentTag")) {
                        return 571;
                    }
                    if (r7.equals("InstagramBusinessManagerStatus")) {
                        return 1281;
                    }
                    if (r7.equals("VehicleTrim")) {
                        return 3297;
                    }
                    break;
                case 1078:
                    if (r7.equals("InstagramShoppingProductInsights")) {
                        return 1338;
                    }
                    break;
                case 1079:
                    if (r7.equals("InstantExperiencesAutofillAddress")) {
                        return 1360;
                    }
                    if (r7.equals("RobotImage")) {
                        return 2664;
                    }
                    break;
                case 1081:
                    if (r7.equals("RobotOSImage")) {
                        return 2667;
                    }
                    if (r7.equals("RobotSWImage")) {
                        return 2669;
                    }
                    break;
                case 1082:
                    if (r7.equals("ContinuousContactUploadSetting")) {
                        return 604;
                    }
                    break;
                case 1084:
                    if (r7.equals("CMTSegmentationUpsellCardsConfig")) {
                        return 455;
                    }
                    if (r7.equals("Group")) {
                        return 1136;
                    }
                    break;
                case 1085:
                    if (r7.equals("PostVrMetadata")) {
                        return 2426;
                    }
                    if (r7.equals("RefMessengerCode")) {
                        return 2619;
                    }
                    break;
                case 1086:
                    if (r7.equals("GroupSubsCreatorMonetizationStatusInfo")) {
                        return 1181;
                    }
                    if (r7.equals("ReportableMessage")) {
                        return 2626;
                    }
                    if (r7.equals("ResearcherProfile")) {
                        return 2647;
                    }
                    if (r7.equals("RobotImageBarcode")) {
                        return 2665;
                    }
                    break;
                case 1087:
                    if (r7.equals("Ad")) {
                        return 96;
                    }
                    if (r7.equals("ProfileCustomCTA")) {
                        return 2518;
                    }
                    if (r7.equals("ResearchReviewType")) {
                        return 2644;
                    }
                    if (r7.equals("RobotStitchedImage")) {
                        return 2671;
                    }
                    break;
                case 1088:
                    if (r7.equals("IntlComment")) {
                        return 1408;
                    }
                    break;
                case 1090:
                    if (r7.equals("PoliticalFigureData")) {
                        return 2417;
                    }
                    break;
                case 1092:
                    if (r7.equals("Asset3D")) {
                        return 270;
                    }
                    if (r7.equals("ESMVertical")) {
                        return 797;
                    }
                    if (r7.equals("ExternalUrl")) {
                        return 904;
                    }
                    if (r7.equals("ImbeStoryBucket")) {
                        return 1246;
                    }
                    if (r7.equals("PortalPartnerMetadata")) {
                        return 2424;
                    }
                    if (r7.equals("RatingSyndicationSource")) {
                        return 2588;
                    }
                    break;
                case 1093:
                    if (r7.equals("InstagramComment")) {
                        return 1300;
                    }
                    if (r7.equals("ResearchOrganizationType")) {
                        return 2636;
                    }
                    break;
                case 1094:
                    if (r7.equals("GroupMembership")) {
                        return 1160;
                    }
                    break;
                case 1095:
                    if (r7.equals("ImpersonationAlert")) {
                        return 1249;
                    }
                    if (r7.equals("PagesPlatformLeadGenData")) {
                        return 2301;
                    }
                    if (r7.equals("RobotRemoteControlFavorite")) {
                        return 2668;
                    }
                    break;
                case 1096:
                    if (r7.equals("AdAssetFeed")) {
                        return 112;
                    }
                    if (r7.equals("PagesPlatformBusinessData")) {
                        return 2296;
                    }
                    if (r7.equals("RecruitingInterviewPrepFile")) {
                        return 2611;
                    }
                    break;
                case 1097:
                    if (r7.equals("ARStudioLead")) {
                        return 38;
                    }
                    if (r7.equals("ProdCandidatePrescreenData")) {
                        return 2456;
                    }
                    break;
                case 1098:
                    if (r7.equals("IGArEffectActionSheet")) {
                        return 1232;
                    }
                    break;
                case 1099:
                    if (r7.equals("IGDirectMailboxAccount")) {
                        return 1235;
                    }
                    if (r7.equals("InspirationsCustomFont")) {
                        return 1258;
                    }
                    if (r7.equals("InstagramCanvasProduct")) {
                        return 1298;
                    }
                    break;
                case 1100:
                    if (r7.equals("AdsTutorialCard")) {
                        return 169;
                    }
                    if (r7.equals("ExtendedCreditEmail")) {
                        return 875;
                    }
                    if (r7.equals("InstagramCameraAREffect")) {
                        return 1291;
                    }
                    if (r7.equals("InstantShoppingDocument")) {
                        return 1384;
                    }
                    break;
                case 1101:
                    if (r7.equals("InstagramAREffectContest")) {
                        return 1262;
                    }
                    if (r7.equals("InstagramMediaReachCount")) {
                        return 1322;
                    }
                    if (r7.equals("PaymentInvoiceRefundActionData")) {
                        return 2351;
                    }
                    break;
                case 1102:
                    if (r7.equals("InstantGameSavedHighlight")) {
                        return 1377;
                    }
                    if (r7.equals("InternalSMAEditorSnapshot")) {
                        return 1404;
                    }
                    if (r7.equals("IntlTranslationScreenshot")) {
                        return 1414;
                    }
                    break;
                case 1103:
                    if (r7.equals("AnalyticsDashboard")) {
                        return 233;
                    }
                    if (r7.equals("ResearchPollMultipleChoiceResponse")) {
                        return 2641;
                    }
                    break;
                case 1104:
                    if (r7.equals("AAPFileUploadRecord")) {
                        return 1;
                    }
                    if (r7.equals("IGBusinessManagerGraphPoint")) {
                        return 1234;
                    }
                    if (r7.equals("IceBreakerMessageAttachment")) {
                        return 1243;
                    }
                    break;
                case 1106:
                    if (r7.equals("GamingVideoViewerGameSignup")) {
                        return 1076;
                    }
                    if (r7.equals("IncomingFriendRequestFeedUnit")) {
                        return 1255;
                    }
                    if (r7.equals("InspirationsStickerImageAsset")) {
                        return 1261;
                    }
                    if (r7.equals("InstantArticleBatchAdsElement")) {
                        return 1348;
                    }
                    if (r7.equals("InstantArticleRecircAdElement")) {
                        return 1354;
                    }
                    break;
                case 1107:
                    if (r7.equals("AdAccountPaymentMethod")) {
                        return 106;
                    }
                    if (r7.equals("InstagramMediaImpressionsCount")) {
                        return 1317;
                    }
                    if (r7.equals("InstantShoppingDocumentElement")) {
                        return 1387;
                    }
                    break;
                case 1108:
                    if (r7.equals("AvatarFeatureBackground")) {
                        return 294;
                    }
                    if (r7.equals("InstagramInsightsVideoViewCount")) {
                        return 1312;
                    }
                    break;
                case 1109:
                    if (r7.equals("ESMServiceCaseHelpdeskDetail")) {
                        return 777;
                    }
                    if (r7.equals("IntlTranslationScreenshotProject")) {
                        return 1415;
                    }
                    break;
                case 1110:
                    if (r7.equals("InspirationsStickerAnimationAsset")) {
                        return 1260;
                    }
                    if (r7.equals("IntellectualPropertyReportRequest")) {
                        return 1398;
                    }
                    if (r7.equals("ViewerLocation")) {
                        return 3360;
                    }
                    break;
                case 1111:
                    if (r7.equals("InstagramAccountHashtagsReachCount")) {
                        return 1264;
                    }
                    if (r7.equals("InstagramInsightsMetricTotalResult")) {
                        return 1310;
                    }
                    if (r7.equals("InstantShoppingDocumentTextElement")) {
                        return 1393;
                    }
                    if (r7.equals("VideoPollOption")) {
                        return 3326;
                    }
                    break;
                case 1112:
                    if (r7.equals("InstagramBusinessManagerAccountUnit")) {
                        return 1275;
                    }
                    if (r7.equals("InstagramBusinessManagerStoriesUnit")) {
                        return 1286;
                    }
                    if (r7.equals("InstagramMediaPeopleBasedReachCount")) {
                        return 1320;
                    }
                    if (r7.equals("InstantArticlesUserPublisherContext")) {
                        return 1359;
                    }
                    if (r7.equals("InstantShoppingDocumentPhotoElement")) {
                        return 1391;
                    }
                    if (r7.equals("InstantShoppingDocumentVideoElement")) {
                        return 1394;
                    }
                    if (r7.equals("VideoHomeSection")) {
                        return 3322;
                    }
                    break;
                case 1113:
                    if (r7.equals("AdPartnerStudyDeliveryRecord")) {
                        return 131;
                    }
                    if (r7.equals("InstagramBusinessManagerTopPostsUnit")) {
                        return 1289;
                    }
                    if (r7.equals("InstagramInsightsMetricOrganicResult")) {
                        return 1309;
                    }
                    if (r7.equals("InstantShoppingDocumentButtonElement")) {
                        return 1386;
                    }
                    if (r7.equals("InstantShoppingDocumentFooterElement")) {
                        return 1389;
                    }
                    if (r7.equals("InstantShoppingDocumentHeaderElement")) {
                        return 1390;
                    }
                    if (r7.equals("VideoTextQuestion")) {
                        return 3338;
                    }
                    break;
                case 1114:
                    if (r7.equals("AppHardeningEnforcementRecord")) {
                        return 249;
                    }
                    if (r7.equals("InstagramBusinessManagerFollowersUnit")) {
                        return 1276;
                    }
                    if (r7.equals("PageTimebomb")) {
                        return 2281;
                    }
                    if (r7.equals("VideoCreatorTopFan")) {
                        return 3320;
                    }
                    break;
                case 1115:
                    if (r7.equals("AdsBusinessQuestionnaireRecord")) {
                        return 151;
                    }
                    if (r7.equals("AppInactivityEnforcementRecord")) {
                        return 250;
                    }
                    if (r7.equals("InstagramBusinessManagerPromotionsUnit")) {
                        return 1280;
                    }
                    if (r7.equals("InstagramMediaHashtagsImpressionsCount")) {
                        return 1316;
                    }
                    break;
                case 1116:
                    if (r7.equals("InstantShoppingDocumentAnalyticsElement")) {
                        return 1385;
                    }
                    if (r7.equals("InstantShoppingDocumentSlideshowElement")) {
                        return 1392;
                    }
                    if (r7.equals("VideoSubtitleCaption")) {
                        return 3336;
                    }
                    break;
                case 1117:
                    if (r7.equals("InstagramAccountHashtagsImpressionsCount")) {
                        return 1263;
                    }
                    break;
                case 1118:
                    if (r7.equals("VideoPromotionCampaign")) {
                        return 3329;
                    }
                    break;
                case 1119:
                    if (r7.equals("ESMTeam")) {
                        return 793;
                    }
                    if (r7.equals("InstagramBusinessManagerAccountSummaryUnit")) {
                        return 1274;
                    }
                    if (r7.equals("VideoAuditionSubmission")) {
                        return 3309;
                    }
                    break;
                case 1121:
                    if (r7.equals("InstantGamesLeaderboardUpdateStoryAttachment")) {
                        return 1380;
                    }
                    if (r7.equals("VideoWatchAmplifyCampaign")) {
                        return 3347;
                    }
                    break;
                case 1122:
                    if (r7.equals("AdRule")) {
                        return 135;
                    }
                    if (r7.equals("AppSelfCertificationEnforcementRecord")) {
                        return 253;
                    }
                    if (r7.equals("VaultUserContactInvitation")) {
                        return 3291;
                    }
                    break;
                case 1123:
                    if (r7.equals("AdImage")) {
                        return 128;
                    }
                    break;
                case 1126:
                    if (r7.equals("AdAudience")) {
                        return 116;
                    }
                    if (r7.equals("AdCreative")) {
                        return 122;
                    }
                    if (r7.equals("ArenaPhase")) {
                        return 266;
                    }
                    if (r7.equals("ExampleSRTForm")) {
                        return 864;
                    }
                    if (r7.equals("ViewerConfigurationsConnection")) {
                        return 3358;
                    }
                    break;
                case 1127:
                    if (r7.equals("AdsIDSIssue")) {
                        return 156;
                    }
                    if (r7.equals("AlohaDevice")) {
                        return 206;
                    }
                    break;
                case 1128:
                    if (r7.equals("ARExportFile")) {
                        return 25;
                    }
                    break;
                case 1129:
                    if (r7.equals("AdsExperience")) {
                        return 155;
                    }
                    if (r7.equals("AvatarTexture")) {
                        return 301;
                    }
                    break;
                case 1130:
                    if (r7.equals("AdvAQueryTrace")) {
                        return 171;
                    }
                    if (r7.equals("ExternalMusicAlbum")) {
                        return 893;
                    }
                    break;
                case 1131:
                    if (r7.equals("AGSCrimeZipCode")) {
                        return 3;
                    }
                    if (r7.equals("EventCollectionItem")) {
                        return 838;
                    }
                    if (r7.equals("ExternalTheaterRoom")) {
                        return 902;
                    }
                    break;
                case 1132:
                    if (r7.equals("ARLibraryTexture")) {
                        return 36;
                    }
                    if (r7.equals("AdCustomAudience")) {
                        return 123;
                    }
                    if (r7.equals("AdStudyObjective")) {
                        return 141;
                    }
                    if (r7.equals("AlohaAbilityPage")) {
                        return 199;
                    }
                    if (r7.equals("AlohaStoreDevice")) {
                        return 224;
                    }
                    if (r7.equals("AnalyticsOutcome")) {
                        return 237;
                    }
                    if (r7.equals("Video")) {
                        return 3307;
                    }
                    break;
                case 1133:
                    if (r7.equals("AdAssetTargetRule")) {
                        return 113;
                    }
                    if (r7.equals("AvatarAssetBundle")) {
                        return 288;
                    }
                    if (r7.equals("AvatarFeaturePose")) {
                        return 295;
                    }
                    break;
                case 1134:
                    if (r7.equals("AdDisclaimerByline")) {
                        return 124;
                    }
                    break;
                case 1136:
                    if (r7.equals("AdAccountASLSchedule")) {
                        return 98;
                    }
                    if (r7.equals("AvatarEditorTemplate")) {
                        return 292;
                    }
                    break;
                case 1137:
                    if (r7.equals("AREffectTextureBundle")) {
                        return 24;
                    }
                    if (r7.equals("AvatarStickerTemplate")) {
                        return 299;
                    }
                    break;
                case 1138:
                    if (r7.equals("AbbTableUserPreference")) {
                        return 86;
                    }
                    if (r7.equals("AdAccountFundingSource")) {
                        return 102;
                    }
                    if (r7.equals("AdAccountStoredBalance")) {
                        return 109;
                    }
                    if (r7.equals("AdvertiserGuidedCourse")) {
                        return 173;
                    }
                    if (r7.equals("TransTask")) {
                        return 3228;
                    }
                    break;
                case 1139:
                    if (r7.equals("ARDynamicContentArticle")) {
                        return 14;
                    }
                    if (r7.equals("AirbenderDiscreteChoice")) {
                        return 187;
                    }
                    if (r7.equals("AlohaWAAccountReference")) {
                        return 227;
                    }
                    if (r7.equals("AlohaWPAccountReference")) {
                        return 228;
                    }
                    break;
                case 1140:
                    if (r7.equals("ARDynamicContentTemplate")) {
                        return 16;
                    }
                    break;
                case 1141:
                    if (r7.equals("AYMTBusinessGoalsResponse")) {
                        return 56;
                    }
                    if (r7.equals("AdminReadTimeBlockMessage")) {
                        return 146;
                    }
                    if (r7.equals("AppealContentBlockMessage")) {
                        return 254;
                    }
                    if (r7.equals("TofuFeedback")) {
                        return 3204;
                    }
                    break;
                case 1142:
                    if (r7.equals("AgoraReportableGlobalShare")) {
                        return 181;
                    }
                    if (r7.equals("PageTopic")) {
                        return 2283;
                    }
                    break;
                case 1143:
                    if (r7.equals("AdAccountPaymentMethodsEdge")) {
                        return 108;
                    }
                    break;
                case 1144:
                    if (r7.equals("AdsPaymentAccountRawDoNotUse")) {
                        return 161;
                    }
                    if (r7.equals("TagSpamFeedback")) {
                        return 3148;
                    }
                    if (r7.equals("TestAddressBook")) {
                        return 3172;
                    }
                    break;
                case 1145:
                    if (r7.equals("AnalyticsStoredBreakdownTable")) {
                        return 239;
                    }
                    if (r7.equals("AvatarStoryTextFormatTemplate")) {
                        return DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
                    }
                    break;
                case 1146:
                    if (r7.equals("ActionableInsightsExternalCase")) {
                        return 89;
                    }
                    if (r7.equals("AdAccountBillingDatePreference")) {
                        return 100;
                    }
                    if (r7.equals("AdsAudienceBuilderExternalCase")) {
                        return 149;
                    }
                    if (r7.equals("TPSTicketFeedback")) {
                        return 3146;
                    }
                    if (r7.equals("TitleSentenceLink")) {
                        return 3202;
                    }
                    if (r7.equals("TogetherASArtwork")) {
                        return 3206;
                    }
                    break;
                case 1147:
                    if (r7.equals("AlohaExternalAbilityHyruleGenre")) {
                        return 211;
                    }
                    break;
                case 1149:
                    if (r7.equals("RowdyYetiRecording")) {
                        return 2675;
                    }
                    break;
                case 1150:
                    if (r7.equals("AutomaticMetricEventContextCapture")) {
                        return 285;
                    }
                    break;
                case 1153:
                    if (r7.equals("EditAction")) {
                        return 805;
                    }
                    if (r7.equals("GamesAppUser")) {
                        return 1062;
                    }
                    if (r7.equals("GemstoneUser")) {
                        return 1077;
                    }
                    if (r7.equals("RealEstateMultiListing")) {
                        return 2606;
                    }
                    break;
                case 1155:
                    if (r7.equals("GameChatServer")) {
                        return 1056;
                    }
                    break;
                case 1156:
                    if (r7.equals("TeleprompterMessageBookmark")) {
                        return 3169;
                    }
                    break;
                case 1157:
                    if (r7.equals("GamesServiceUser")) {
                        return 1065;
                    }
                    break;
                case 1158:
                    if (r7.equals("EventCollection")) {
                        return 837;
                    }
                    break;
                case 1159:
                    if (r7.equals("GamesServiceAvatar")) {
                        return 1064;
                    }
                    if (r7.equals("GroupAdminBotActor")) {
                        return 1138;
                    }
                    break;
                case 1163:
                    if (r7.equals("GravitySettingsForUser")) {
                        return 1132;
                    }
                    if (r7.equals("TrendingCuratedUnitVersionFeedback")) {
                        return 3239;
                    }
                    break;
                case 1165:
                    if (r7.equals("EcommProductCollection")) {
                        return 802;
                    }
                    break;
                case 1166:
                    if (r7.equals("EventAttendanceQuestion")) {
                        return 835;
                    }
                    break;
                case 1167:
                    if (r7.equals("ExtendedCreditAllocation")) {
                        return 872;
                    }
                    if (r7.equals("ExternalCaseSubscription")) {
                        return 882;
                    }
                    break;
                case 1168:
                    if (r7.equals("ExpressionRecorderSession")) {
                        return 870;
                    }
                    if (r7.equals("ExtendedCreditApplication")) {
                        return 873;
                    }
                    break;
                case 1170:
                    if (r7.equals("EventAttendanceConfirmation")) {
                        return 834;
                    }
                    break;
                case 1171:
                    if (r7.equals("GroupPendingMembersSavedFilter")) {
                        return 1166;
                    }
                    if (r7.equals("PBWorld")) {
                        return 2200;
                    }
                    break;
                case 1172:
                    if (r7.equals("PinnedAd")) {
                        return 2401;
                    }
                    break;
                case 1173:
                    if (r7.equals("EntMutatorDebuggerDebugSession")) {
                        return 825;
                    }
                    break;
                case 1176:
                    if (r7.equals("VolunteeringSignUp")) {
                        return 3369;
                    }
                    break;
                case 1178:
                    if (r7.equals("PageStatusCard")) {
                        return 2274;
                    }
                    break;
                case 1179:
                    if (r7.equals("PhotoEncoding3D")) {
                        return 2400;
                    }
                    break;
                case 1180:
                    if (r7.equals("PageServicesCard")) {
                        return 2272;
                    }
                    break;
                case 1181:
                    if (r7.equals("PageContactUsLead")) {
                        return 2228;
                    }
                    if (r7.equals("PageMessageThread")) {
                        return 2251;
                    }
                    break;
                case 1182:
                    if (r7.equals("PMAKioskCreditCard")) {
                        return 2201;
                    }
                    break;
                case 1187:
                    if (r7.equals("GamesUserPoints")) {
                        return 1066;
                    }
                    if (r7.equals("IntlCMSSegmentNew")) {
                        return 1407;
                    }
                    if (r7.equals("PeerToPeerPaymentMethod")) {
                        return 2366;
                    }
                    if (r7.equals("PrivacyNotificationProd")) {
                        return 2441;
                    }
                    break;
                case 1188:
                    if (r7.equals("ExternalTaskDeveloperCommunityThreadMigration")) {
                        return 899;
                    }
                    break;
                case 1189:
                    if (r7.equals("CROWBenchmark")) {
                        return 464;
                    }
                    if (r7.equals("EventThemePhoto")) {
                        return 851;
                    }
                    if (r7.equals("PageCreateResponsePayload")) {
                        return 2232;
                    }
                    break;
                case 1191:
                    if (r7.equals("PagesInboxUpsellAdminRecord")) {
                        return 2292;
                    }
                    break;
                case 1193:
                    if (r7.equals("AirbenderConfig")) {
                        return 186;
                    }
                    if (r7.equals("Asset3DEncoding")) {
                        return 271;
                    }
                    if (r7.equals("AvatarChoiceTag")) {
                        return 289;
                    }
                    if (r7.equals("AvatarEditorRig")) {
                        return 291;
                    }
                    break;
                case 1194:
                    if (r7.equals("CheckpointFeedback")) {
                        return 487;
                    }
                    if (r7.equals("CommerceChargeback")) {
                        return 538;
                    }
                    if (r7.equals("GroupFileWithRevisions")) {
                        return 1153;
                    }
                    break;
                case 1195:
                    if (r7.equals("GradientProfileInitials")) {
                        return 1130;
                    }
                    break;
                case 1196:
                    if (r7.equals("EvaluativeProblemPhoto")) {
                        return 831;
                    }
                    if (r7.equals("GroupJobFeaturesSettings")) {
                        return 1157;
                    }
                    if (r7.equals("GroupScheduledPostSeries")) {
                        return 1176;
                    }
                    if (r7.equals("PageSetVisibilityResponsePayload")) {
                        return 2273;
                    }
                    break;
                case 1197:
                    if (r7.equals("AdsMonthlyInvoicing")) {
                        return 160;
                    }
                    if (r7.equals("AnalyticsUserConfig")) {
                        return 243;
                    }
                    if (r7.equals("GoodwillThrowbackSettings")) {
                        return 1122;
                    }
                    if (r7.equals("PublisherTrustIndicatorNamedField")) {
                        return 2555;
                    }
                    break;
                case 1198:
                    if (r7.equals("AdAccountUserSetting")) {
                        return 110;
                    }
                    if (r7.equals("GamingVideoCreatorSettings")) {
                        return 1070;
                    }
                    if (r7.equals("PublisherTrustIndicatorCustomField")) {
                        return 2554;
                    }
                    if (r7.equals("TaxForm")) {
                        return 3166;
                    }
                    if (r7.equals("VolunteerOrganizationSupportRelationship")) {
                        return 3367;
                    }
                    break;
                case 1199:
                    if (r7.equals("GemstoneUserPrivateSettings")) {
                        return 1079;
                    }
                    if (r7.equals("Page")) {
                        return 2210;
                    }
                    break;
                case 1200:
                    if (r7.equals("InstagramCameraAREffectPreview")) {
                        return 1292;
                    }
                    if (r7.equals("Phone")) {
                        return 2396;
                    }
                    if (r7.equals("Place")) {
                        return 2402;
                    }
                    break;
                case 1203:
                    if (r7.equals("AlohaSuperframeUserConfig")) {
                        return 225;
                    }
                    if (r7.equals("AnalyticsEntityUserConfig")) {
                        return 235;
                    }
                    if (r7.equals("ApplicationAttributionTag")) {
                        return 256;
                    }
                    if (r7.equals("EmployeeCheckupCrisisUserInfo")) {
                        return 815;
                    }
                    if (r7.equals("GamingVideoCreatorGoalsSettings")) {
                        return 1069;
                    }
                    if (r7.equals("TodoListItem")) {
                        return 3203;
                    }
                    break;
                case 1205:
                    if (r7.equals("PBPostcode")) {
                        return 2199;
                    }
                    if (r7.equals("PageInvite")) {
                        return 2244;
                    }
                    break;
                case 1206:
                    if (r7.equals("AlohaPerOwnerFavoritesConfig")) {
                        return 221;
                    }
                    if (r7.equals("AlohaPerOwnerProximityConfig")) {
                        return 222;
                    }
                    if (r7.equals("ESMInvestigationProfileBasicInfo")) {
                        return 766;
                    }
                    if (r7.equals("GroupPendingPostSchedulingSettings")) {
                        return 1167;
                    }
                    if (r7.equals("ProdJobRole")) {
                        return 2464;
                    }
                    if (r7.equals("ProtonImage")) {
                        return 2549;
                    }
                    break;
                case 1207:
                    if (r7.equals("PMAMegaphone")) {
                        return 2203;
                    }
                    if (r7.equals("ProdEmployee")) {
                        return 2458;
                    }
                    if (r7.equals("ProductImage")) {
                        return 2491;
                    }
                    if (r7.equals("ProfileBadge")) {
                        return 2514;
                    }
                    if (r7.equals("ZipLiftPaidSearchStudy")) {
                        return 3561;
                    }
                    break;
                case 1208:
                    if (r7.equals("GamingVideoStreamerDashboardSettings")) {
                        return 1074;
                    }
                    if (r7.equals("PageAdminNote")) {
                        return 2213;
                    }
                    if (r7.equals("ProdCandidate")) {
                        return 2451;
                    }
                    break;
                case 1209:
                    if (r7.equals("CompassCuratedUnitVersionFeedback")) {
                        return 577;
                    }
                    if (r7.equals("PodcastEpisode")) {
                        return 2413;
                    }
                    if (r7.equals("ProfilePicture")) {
                        return 2535;
                    }
                    break;
                case 1210:
                    if (r7.equals("PPPExternalCase")) {
                        return 2205;
                    }
                    if (r7.equals("PageUpdateShare")) {
                        return 2286;
                    }
                    if (r7.equals("PoliticalOffice")) {
                        return 2418;
                    }
                    break;
                case 1211:
                    if (r7.equals("GroupSet")) {
                        return 1179;
                    }
                    if (r7.equals("PageCategoryNode")) {
                        return 2221;
                    }
                    if (r7.equals("PostedPhotosEdge")) {
                        return 2428;
                    }
                    if (r7.equals("ProdMergedResume")) {
                        return 2468;
                    }
                    break;
                case 1212:
                    if (r7.equals("PageSavedResponse")) {
                        return 2270;
                    }
                    if (r7.equals("PagesPlatformNote")) {
                        return 2305;
                    }
                    if (r7.equals("PendingSentInvite")) {
                        return 2386;
                    }
                    break;
                case 1213:
                    if (r7.equals("PayToAccessPackage")) {
                        return 2333;
                    }
                    break;
                case 1214:
                    if (r7.equals("GamePayment")) {
                        return 1058;
                    }
                    if (r7.equals("GeofenceAct")) {
                        return 1090;
                    }
                    if (r7.equals("GiftPayment")) {
                        return 1094;
                    }
                    if (r7.equals("GiftProduct")) {
                        return 1095;
                    }
                    if (r7.equals("PaymentAccountPhone")) {
                        return 2336;
                    }
                    if (r7.equals("ProfileAutofillName")) {
                        return 2512;
                    }
                    break;
                case 1215:
                    if (r7.equals("NotificationsDelta")) {
                        return 2116;
                    }
                    if (r7.equals("PageAutomatedMessage")) {
                        return 2214;
                    }
                    if (r7.equals("PageJobOpeningSource")) {
                        return 2245;
                    }
                    if (r7.equals("PageQuestionResponse")) {
                        return 2263;
                    }
                    if (r7.equals("PageUnpublishMessage")) {
                        return 2285;
                    }
                    if (r7.equals("PaymentCouponUseCase")) {
                        return 2348;
                    }
                    if (r7.equals("PointCloudGuideImage")) {
                        return 2414;
                    }
                    if (r7.equals("ProdRecruitingResume")) {
                        return 2475;
                    }
                    if (r7.equals("ProfileAutofillPhone")) {
                        return 2513;
                    }
                    if (r7.equals("TaggableActivityIconTerm")) {
                        return 3152;
                    }
                    break;
                case 1216:
                    if (r7.equals("EventLineup")) {
                        return 846;
                    }
                    if (r7.equals("GenericEffect")) {
                        return 1082;
                    }
                    if (r7.equals("PageInfoUpToDateBadge")) {
                        return 2240;
                    }
                    if (r7.equals("PageInternalCTASShare")) {
                        return 2243;
                    }
                    if (r7.equals("ProfileSellingInvoice")) {
                        return 2539;
                    }
                    if (r7.equals("TimelineAppCollectionItem")) {
                        return 3194;
                    }
                    break;
                case 1217:
                    if (r7.equals("AlohaProxyUserPerOwnerPermissionsConfig")) {
                        return 223;
                    }
                    if (r7.equals("ProductLiveStatusIssue")) {
                        return 2499;
                    }
                    break;
                case 1218:
                    if (r7.equals("GenericMediaSet")) {
                        return 1085;
                    }
                    if (r7.equals("PersistentStreamProfile")) {
                        return 2393;
                    }
                    if (r7.equals("ProdRecruiterPreference")) {
                        return 2472;
                    }
                    if (r7.equals("ProductTaxonomyRateable")) {
                        return 2505;
                    }
                    break;
                case 1219:
                    if (r7.equals("ContactEmail")) {
                        return 593;
                    }
                    if (r7.equals("GroupPaymentGift")) {
                        return 1165;
                    }
                    if (r7.equals("NmorProviderPayoutData")) {
                        return 2109;
                    }
                    break;
                case 1220:
                    if (r7.equals("PageMessageShortlinkShare")) {
                        return 2250;
                    }
                    if (r7.equals("PagesPlatformPrefillValue")) {
                        return 2306;
                    }
                    if (r7.equals("PaymentAccountRawDoNotUse")) {
                        return 2337;
                    }
                    if (r7.equals("ProfileCoreAppAdminInvite")) {
                        return 2515;
                    }
                    break;
                case 1221:
                    if (r7.equals("GenericEffectAsset")) {
                        return 1083;
                    }
                    if (r7.equals("PlaceRecommendationPlusOne")) {
                        return 2407;
                    }
                    break;
                case 1222:
                    if (r7.equals("InstagramMessageInbox")) {
                        return 1328;
                    }
                    if (r7.equals("PagesCommercePaymentInvoice")) {
                        return 2291;
                    }
                    if (r7.equals("PagesPlatformBookingMessage")) {
                        return 2295;
                    }
                    if (r7.equals("PelicanGatewayAssetFirmware")) {
                        return 2379;
                    }
                    if (r7.equals("PercepticonsPhotoBoothScene")) {
                        return 2391;
                    }
                    break;
                case 1223:
                    if (r7.equals("GroupEnforcedContent")) {
                        return 1150;
                    }
                    if (r7.equals("InstagramActivityInbox")) {
                        return 1267;
                    }
                    if (r7.equals("ParentApprovedUserFriendCode")) {
                        return 2316;
                    }
                    if (r7.equals("ProdTentativeInterviewInvite")) {
                        return 2478;
                    }
                    break;
                case 1224:
                    if (r7.equals("GroupsProfileLinkUnit")) {
                        return 1191;
                    }
                    if (r7.equals("PagePublishingAdminPreference")) {
                        return 2260;
                    }
                    break;
                case 1225:
                    if (r7.equals("GamingVideoStreamEvent")) {
                        return 1073;
                    }
                    if (r7.equals("GroupPreVettedUserList")) {
                        return 1170;
                    }
                    if (r7.equals("PrivacyCheckupReminderSchedule")) {
                        return 2438;
                    }
                    if (r7.equals("ProfileLimitedAccessRoleInvite")) {
                        return 2525;
                    }
                    break;
                case 1226:
                    if (r7.equals("GroupMessengerGroupChat")) {
                        return 1164;
                    }
                    if (r7.equals("GroupTopStoriesFeedUnit")) {
                        return 1186;
                    }
                    if (r7.equals("GroupsSectionHeaderUnit")) {
                        return 1192;
                    }
                    if (r7.equals("Viewer")) {
                        return 3357;
                    }
                    break;
                case 1227:
                    if (r7.equals("CHEXReturnInBoxLabel")) {
                        return 438;
                    }
                    if (r7.equals("GroupRecommendationPivot")) {
                        return 1171;
                    }
                    break;
                case 1228:
                    if (r7.equals("GiftCardRedemptionPayment")) {
                        return 1093;
                    }
                    break;
                case 1229:
                    if (r7.equals("VaultUser")) {
                        return 3290;
                    }
                    break;
                case 1230:
                    if (r7.equals("CHEXReturnShippingLabel")) {
                        return 442;
                    }
                    break;
                case 1231:
                    if (r7.equals("ExtendedCreditInvoiceGroup")) {
                        return 876;
                    }
                    if (r7.equals("GroupsInboxSectionFooterUnit")) {
                        return 1189;
                    }
                    if (r7.equals("GroupsInboxSectionHeaderUnit")) {
                        return 1190;
                    }
                    if (r7.equals("TVSession")) {
                        return 3147;
                    }
                    break;
                case 1232:
                    if (r7.equals("EcommProductCollectionGroup")) {
                        return 803;
                    }
                    if (r7.equals("TestCoupon")) {
                        return 3174;
                    }
                    if (r7.equals("VehicleOffer")) {
                        return 3296;
                    }
                    if (r7.equals("VideoCreator")) {
                        return 3318;
                    }
                    break;
                case 1233:
                    if (r7.equals("CompassCuratedContentLabel")) {
                        return 570;
                    }
                    if (r7.equals("TalkMission")) {
                        return 3160;
                    }
                    break;
                case 1235:
                    if (r7.equals("CHEXFulfillmentShippingLabel")) {
                        return 418;
                    }
                    if (r7.equals("CommerceCommentMessageUpsell")) {
                        return 539;
                    }
                    break;
                case 1236:
                    if (r7.equals("VehicleModelYear")) {
                        return 3295;
                    }
                    break;
                case 1237:
                    if (r7.equals("GoodwillThrowbackPromotionFeedUnit")) {
                        return 1120;
                    }
                    if (r7.equals("TimelineSection")) {
                        return 3198;
                    }
                    break;
                case 1238:
                    if (r7.equals("TriviaGameOption")) {
                        return 3246;
                    }
                    break;
                case 1239:
                    if (r7.equals("TipJarTransaction")) {
                        return 3201;
                    }
                    break;
                case 1240:
                    if (r7.equals("TimelineAppSection")) {
                        return 3195;
                    }
                    if (r7.equals("TriviaGameQuestion")) {
                        return 3251;
                    }
                    break;
                case 1241:
                    if (r7.equals("TextDelightCampaign")) {
                        return 3175;
                    }
                    if (r7.equals("TrueTopicFeedOption")) {
                        return 3253;
                    }
                    if (r7.equals("VolunteeringOrganizer")) {
                        return 3368;
                    }
                    break;
                case 1242:
                    if (r7.equals("TaggableActivityIcon")) {
                        return 3150;
                    }
                    break;
                case 1243:
                    if (r7.equals("TimelineAppCollection")) {
                        return 3193;
                    }
                    break;
                case 1244:
                    if (r7.equals("VideoMonetizationCreator")) {
                        return 3324;
                    }
                    break;
                case 1246:
                    if (r7.equals("Chatroom")) {
                        return 485;
                    }
                    if (r7.equals("TransactionPaymentOption")) {
                        return 3233;
                    }
                    if (r7.equals("VerifiedExternalResearcher")) {
                        return 3300;
                    }
                    break;
                case 1247:
                    if (r7.equals("TogetherMissionDefinition")) {
                        return 3217;
                    }
                    if (r7.equals("TransactionShippingOption")) {
                        return 3234;
                    }
                    if (r7.equals("TriviaGameOptionSelection")) {
                        return 3247;
                    }
                    break;
                case 1248:
                    if (r7.equals("GiftProductSku")) {
                        return 1097;
                    }
                    if (r7.equals("TrendingCuratedUnitVersion")) {
                        return 3238;
                    }
                    break;
                case 1249:
                    if (r7.equals("ThreatExchangeAppSubmission")) {
                        return 3184;
                    }
                    if (r7.equals("TogetherDSTStaticDefinition")) {
                        return 3214;
                    }
                    if (r7.equals("TogetherDSTWBEditDefinition")) {
                        return 3215;
                    }
                    break;
                case 1250:
                    if (r7.equals("TogetherDSTWBVisitDefinition")) {
                        return 3216;
                    }
                    break;
                case 1251:
                    if (r7.equals("CHEXOrderItem")) {
                        return 431;
                    }
                    if (r7.equals("InstantGameActivity")) {
                        return 1368;
                    }
                    if (r7.equals("TogetherASActivityProgression")) {
                        return 3205;
                    }
                    if (r7.equals("VideoBulkUploadVideoImportError")) {
                        return 3312;
                    }
                    break;
                case 1252:
                    if (r7.equals("GoodwillThrowbackPromotionNativeTemplatesFeedUnit")) {
                        return 1121;
                    }
                    if (r7.equals("InstagramDirectQuery")) {
                        return 1301;
                    }
                    if (r7.equals("TogetherUserMissionProgression")) {
                        return 3219;
                    }
                    break;
                case 1253:
                    if (r7.equals("ViewstateBackedStoryBucketWrapper")) {
                        return 3361;
                    }
                    break;
                case 1254:
                    if (r7.equals("InstagramActivityStory")) {
                        return 1268;
                    }
                    break;
                case 1255:
                    if (r7.equals("ClearHistoryWabam")) {
                        return 497;
                    }
                    break;
                case 1257:
                    if (r7.equals("TogetherDSTEvidenceViewerDefinition")) {
                        return 3212;
                    }
                    break;
                case 1258:
                    if (r7.equals("CHEXMerchant1099Form")) {
                        return 420;
                    }
                    if (r7.equals("CodingContestProblem")) {
                        return 512;
                    }
                    break;
                case 1260:
                    if (r7.equals("CanceledPageLivingRoom")) {
                        return 472;
                    }
                    if (r7.equals("CodingInterviewProblem")) {
                        return 519;
                    }
                    break;
                case 1261:
                    if (r7.equals("CanceledGroupLivingRoom")) {
                        return 471;
                    }
                    if (r7.equals("TogetherActivityShapetionaryProgression")) {
                        return 3209;
                    }
                    break;
                case 1267:
                    if (r7.equals("ProductTag")) {
                        return 2504;
                    }
                    break;
                case 1268:
                    if (r7.equals("IGInstagramShopCollectionEligibility")) {
                        return 1237;
                    }
                    if (r7.equals("ProfileSong")) {
                        return 2540;
                    }
                    if (r7.equals("ThirdPartyAudio")) {
                        return 3178;
                    }
                    break;
                case 1270:
                    if (r7.equals("PageCustomTag")) {
                        return 2233;
                    }
                    if (r7.equals("PhotoEncoding")) {
                        return 2399;
                    }
                    if (r7.equals("ProfileRating")) {
                        return 2538;
                    }
                    break;
                case 1271:
                    if (r7.equals("ProductCatalog")) {
                        return 2486;
                    }
                    if (r7.equals("ReporterFeedback")) {
                        return 2627;
                    }
                    break;
                case 1272:
                    if (r7.equals("Error")) {
                        return 829;
                    }
                    break;
                case 1273:
                    if (r7.equals("TriviaGamePlayerInfo")) {
                        return 3249;
                    }
                    break;
                case 1274:
                    if (r7.equals("P2PPaymentSetting")) {
                        return 2198;
                    }
                    if (r7.equals("ResponsibleFeedback")) {
                        return 2650;
                    }
                    break;
                case 1275:
                    if (r7.equals("Coupon")) {
                        return 617;
                    }
                    if (r7.equals("Employer")) {
                        return 818;
                    }
                    if (r7.equals("PlanarCameraConfig")) {
                        return 2409;
                    }
                    break;
                case 1276:
                    if (r7.equals("EventTour")) {
                        return 860;
                    }
                    if (r7.equals("VideoCreatorEnabledStatus")) {
                        return 3319;
                    }
                    break;
                case 1277:
                    if (r7.equals("PaymentCouponBilling")) {
                        return 2347;
                    }
                    if (r7.equals("PelicanNIAssetConfig")) {
                        return 2380;
                    }
                    if (r7.equals("VideoEventPromotionOptions")) {
                        return 3321;
                    }
                    break;
                case 1278:
                    if (r7.equals("ProdMergedEmployerOrg")) {
                        return 2466;
                    }
                    if (r7.equals("ProductCheckoutConfig")) {
                        return 2487;
                    }
                    if (r7.equals("RecruitingCandidateLink")) {
                        return 2609;
                    }
                    if (r7.equals("ReporterMessageFeedback")) {
                        return 2628;
                    }
                    break;
                case 1279:
                    if (r7.equals("CHEXReturn")) {
                        return 437;
                    }
                    if (r7.equals("PageRecommendationsTag")) {
                        return 2266;
                    }
                    break;
                case 1281:
                    if (r7.equals("CallToAction")) {
                        return 465;
                    }
                    if (r7.equals("Conversation")) {
                        return 606;
                    }
                    if (r7.equals("PageReferralOfferSetting")) {
                        return 2269;
                    }
                    break;
                case 1282:
                    if (r7.equals("Configuration")) {
                        return 588;
                    }
                    if (r7.equals("CuApplication")) {
                        return 649;
                    }
                    if (r7.equals("EventTicketTier")) {
                        return 858;
                    }
                    if (r7.equals("PelicanGatewayAssetConfig")) {
                        return 2378;
                    }
                    if (r7.equals("ProdMobileSoftErrorConfig")) {
                        return 2470;
                    }
                    break;
                case 1283:
                    if (r7.equals("EventTicketOrder")) {
                        return 854;
                    }
                    if (r7.equals("PageContentCreationSetting")) {
                        return 2229;
                    }
                    if (r7.equals("PageOfferRedemptionSetting")) {
                        return 2255;
                    }
                    if (r7.equals("PresenceConsistencyLogging")) {
                        return 2432;
                    }
                    if (r7.equals("PublisherBrandAssetsConfig")) {
                        return 2552;
                    }
                    break;
                case 1284:
                    if (r7.equals("CheckoutSession")) {
                        return 486;
                    }
                    if (r7.equals("ESMLabelValuePair")) {
                        return 769;
                    }
                    if (r7.equals("EmptySerpBehavior")) {
                        return 819;
                    }
                    if (r7.equals("ExternalCaseOffer")) {
                        return 880;
                    }
                    if (r7.equals("ExternalOfferUser")) {
                        return 895;
                    }
                    break;
                case 1285:
                    if (r7.equals("CustomConversion")) {
                        return 655;
                    }
                    if (r7.equals("ExpressWifiPartner")) {
                        return 869;
                    }
                    if (r7.equals("PagesPlatformIXServiceConfig")) {
                        return 2300;
                    }
                    if (r7.equals("ResponsibleSupportCaseFeedback")) {
                        return 2651;
                    }
                    break;
                case 1286:
                    if (r7.equals("CouponTransaction")) {
                        return 621;
                    }
                    if (r7.equals("EventTicketSubOrder")) {
                        return 857;
                    }
                    if (r7.equals("PageMessengerIcebreakerConfig")) {
                        return 2252;
                    }
                    if (r7.equals("PublisherTrustIndicatorConfig")) {
                        return 2553;
                    }
                    break;
                case 1287:
                    if (r7.equals("CHEXShippingOption")) {
                        return 450;
                    }
                    if (r7.equals("ExternalMovieTheater")) {
                        return 892;
                    }
                    if (r7.equals("PagesPlatformLeadGenFlowConfig")) {
                        return 2302;
                    }
                    break;
                case 1288:
                    if (r7.equals("CHEXReturnOperation")) {
                        return 439;
                    }
                    if (r7.equals("CodingContestSeason")) {
                        return 515;
                    }
                    if (r7.equals("ExternalOfferProvider")) {
                        return 894;
                    }
                    if (r7.equals("ParentApprovedUserStatusSetting")) {
                        return 2318;
                    }
                    break;
                case 1289:
                    if (r7.equals("CameraStoryPromotion")) {
                        return 469;
                    }
                    if (r7.equals("CommunityNuxQuestion")) {
                        return 566;
                    }
                    if (r7.equals("ContactImportSession")) {
                        return 595;
                    }
                    if (r7.equals("EntIARegiwallPublisher")) {
                        return 824;
                    }
                    if (r7.equals("PagesPlatformNativeServiceConfig")) {
                        return 2304;
                    }
                    if (r7.equals("RecruitingMLRecommendationFeedback")) {
                        return 2612;
                    }
                    break;
                case 1290:
                    if (r7.equals("CameraEffectPromotion")) {
                        return 466;
                    }
                    if (r7.equals("CameraSystemPromotion")) {
                        return 470;
                    }
                    if (r7.equals("ClientLeadInformation")) {
                        return 498;
                    }
                    if (r7.equals("CommerceDropsCampaign")) {
                        return 540;
                    }
                    if (r7.equals("RecommendationReviewRemovalFeedback")) {
                        return 2608;
                    }
                    break;
                case 1291:
                    if (r7.equals("CameraPostTaggedRegion")) {
                        return 468;
                    }
                    if (r7.equals("CarrierUpsellPromotion")) {
                        return 477;
                    }
                    if (r7.equals("PagesPlatformExternalServiceConfig")) {
                        return 2298;
                    }
                    if (r7.equals("VideoList")) {
                        return 3323;
                    }
                    break;
                case 1292:
                    if (r7.equals("CommerceStoreCollection")) {
                        return 554;
                    }
                    if (r7.equals("VideoAsset")) {
                        return 3308;
                    }
                    break;
                case 1294:
                    if (r7.equals("CompassCuratedUnitVersion")) {
                        return 576;
                    }
                    if (r7.equals("Referral")) {
                        return 2620;
                    }
                    break;
                case 1295:
                    if (r7.equals("CommunityEmailVerification")) {
                        return 561;
                    }
                    if (r7.equals("VideoPlaylist")) {
                        return 3325;
                    }
                    break;
                case 1296:
                    if (r7.equals("VideoBroadcast")) {
                        return 3310;
                    }
                    if (r7.equals("VideoCopyright")) {
                        return 3316;
                    }
                    break;
                case 1298:
                    if (r7.equals("CHEXSellerFulfillmentLocation")) {
                        return 443;
                    }
                    if (r7.equals("NewsFeed")) {
                        return 2092;
                    }
                    if (r7.equals("VerseParticipant")) {
                        return 3303;
                    }
                    break;
                case 1299:
                    if (r7.equals("CHEXC2CPaymentInvoiceRejection")) {
                        return 417;
                    }
                    if (r7.equals("CodingContestProblemSubmission")) {
                        return 514;
                    }
                    if (r7.equals("VidwallaBroadcast")) {
                        return 3351;
                    }
                    if (r7.equals("VidwallaTOSAccept")) {
                        return 3355;
                    }
                    break;
                case 1300:
                    if (r7.equals("CivicGraphCrowdsourcingQuestion")) {
                        return 490;
                    }
                    if (r7.equals("CodingProblemSolutionSubmission")) {
                        return 524;
                    }
                    if (r7.equals("CommerceSellerCuratedCollection")) {
                        return 552;
                    }
                    if (r7.equals("VideoTipJarPayment")) {
                        return 3345;
                    }
                    break;
                case 1301:
                    if (r7.equals("CHEXShippingLabelCheckoutSession")) {
                        return 449;
                    }
                    if (r7.equals("CodingInterviewProblemSubmission")) {
                        return 521;
                    }
                    if (r7.equals("EntryPointsSuggestionBlockBehavior")) {
                        return 828;
                    }
                    break;
                case 1302:
                    if (r7.equals("ThreatPrivacyGroup")) {
                        return 3186;
                    }
                    if (r7.equals("VideoChannelFeedUnit")) {
                        return 3314;
                    }
                    break;
                case 1303:
                    if (r7.equals("VideoChainingFeedUnit")) {
                        return 3313;
                    }
                    if (r7.equals("VideoCommerceInterest")) {
                        return 3315;
                    }
                    if (r7.equals("VideoPromotionRequest")) {
                        return 3330;
                    }
                    if (r7.equals("VidwallaStencilPreset")) {
                        return 3354;
                    }
                    break;
                case 1305:
                    if (r7.equals("VaultAddressBookContact")) {
                        return 3289;
                    }
                    break;
                case 1306:
                    if (r7.equals("RelatedVideosChannel")) {
                        return 2623;
                    }
                    if (r7.equals("VideoProductTaggingEvent")) {
                        return 3328;
                    }
                    break;
                case 1307:
                    if (r7.equals("CHEXPaymentInvoiceC2CShippingExtension")) {
                        return 436;
                    }
                    break;
                case 1309:
                    if (r7.equals("VideoTextQuestionRespondent")) {
                        return 3340;
                    }
                    break;
                case 1310:
                    if (r7.equals("EmailAddress")) {
                        return 809;
                    }
                    break;
                case 1311:
                    if (r7.equals("VideoWatchWelcomeMatPlacement")) {
                        return 3350;
                    }
                    break;
                case 1312:
                    if (r7.equals("NeoApprovedHolidayCard")) {
                        return 2079;
                    }
                    if (r7.equals("VideoPromotionRequestGeotarget")) {
                        return 3331;
                    }
                    break;
                case 1313:
                    if (r7.equals("AddressBook")) {
                        return 143;
                    }
                    if (r7.equals("NeoGlobalShepherdThread")) {
                        return 2086;
                    }
                    break;
                case 1314:
                    if (r7.equals("CrisisUserInfo")) {
                        return 647;
                    }
                    if (r7.equals("VideoWatchHappeningSoonPlacement")) {
                        return 3348;
                    }
                    if (r7.equals("VideoWatchLiveSpotlightPlacement")) {
                        return 3349;
                    }
                    break;
                case 1315:
                    if (r7.equals("CHEXReturnPhoto")) {
                        return 440;
                    }
                    if (r7.equals("VoyagerTrendingCuratedUnitElement")) {
                        return 3371;
                    }
                    break;
                case 1316:
                    if (r7.equals("ARLibraryBlock")) {
                        return 30;
                    }
                    if (r7.equals("CommentPlaceInfo")) {
                        return 535;
                    }
                    if (r7.equals("ExternalCaseStatus")) {
                        return 881;
                    }
                    if (r7.equals("TicketedExperienceSeaticsSeatMap")) {
                        return 3191;
                    }
                    break;
                case 1317:
                    if (r7.equals("CrisisHubUserInfo")) {
                        return 644;
                    }
                    break;
                case 1318:
                    if (r7.equals("AdsXoutsFeedback")) {
                        return 170;
                    }
                    if (r7.equals("CodingProblemPhoto")) {
                        return 523;
                    }
                    if (r7.equals("CommentMessageInfo")) {
                        return 534;
                    }
                    if (r7.equals("CommentProductInfo")) {
                        return 536;
                    }
                    if (r7.equals("ComputerVisionInfo")) {
                        return 586;
                    }
                    if (r7.equals("CrisisDonationInfo")) {
                        return 640;
                    }
                    if (r7.equals("CrisisGeoAreaPhoto")) {
                        return 642;
                    }
                    break;
                case 1319:
                    if (r7.equals("AREffectPermalink")) {
                        return 19;
                    }
                    if (r7.equals("CivicEngagementInfo")) {
                        return 488;
                    }
                    if (r7.equals("EmployeeCheckupCrisis")) {
                        return 813;
                    }
                    if (r7.equals("NamePronunciationProfileField")) {
                        return 2064;
                    }
                    break;
                case 1320:
                    if (r7.equals("CHEXOrderGiftingInfo")) {
                        return 429;
                    }
                    break;
                case 1321:
                    if (r7.equals("ApplicationFeedback")) {
                        return 257;
                    }
                    if (r7.equals("ESMServiceCaseSubStatus")) {
                        return 783;
                    }
                    break;
                case 1322:
                    if (r7.equals("ExternalMerchantSettings")) {
                        return 886;
                    }
                    break;
                case 1325:
                    if (r7.equals("Node")) {
                        return 2112;
                    }
                    if (r7.equals("Note")) {
                        return 2114;
                    }
                    break;
                case 1326:
                    if (r7.equals("ESMInvestigationProfileAlias")) {
                        return 764;
                    }
                    break;
                case 1329:
                    if (r7.equals("EventFirstPartyTicketingConfigs")) {
                        return 842;
                    }
                    break;
                case 1330:
                    if (r7.equals("NeoInvite")) {
                        return 2087;
                    }
                    break;
                case 1331:
                    if (r7.equals("ResolutionForm")) {
                        return 2649;
                    }
                    break;
                case 1332:
                    if (r7.equals("AlohaExternalAbilityHyruleMask")) {
                        return 212;
                    }
                    if (r7.equals("NeoUsername")) {
                        return 2090;
                    }
                    if (r7.equals("ResearchFRLTeam")) {
                        return 2633;
                    }
                    break;
                case 1333:
                    if (r7.equals("ResearchPlatform")) {
                        return 2638;
                    }
                    break;
                case 1334:
                    if (r7.equals("Event")) {
                        return 832;
                    }
                    if (r7.equals("LeadGenData")) {
                        return 1469;
                    }
                    break;
                case 1336:
                    if (r7.equals("NPEMemeTemplate")) {
                        return 2057;
                    }
                    if (r7.equals("NPPExternalCase")) {
                        return 2059;
                    }
                    break;
                case 1339:
                    if (r7.equals("NativeDocumentNode")) {
                        return 2068;
                    }
                    break;
                case 1340:
                    if (r7.equals("AdLabel")) {
                        return 129;
                    }
                    break;
                case 1341:
                    if (r7.equals("AdsPixel")) {
                        return 162;
                    }
                    break;
                case 1342:
                    if (r7.equals("AlohaCall")) {
                        return 203;
                    }
                    if (r7.equals("CodingContestIndividualEntrantPersonalInfo")) {
                        return 511;
                    }
                    if (r7.equals("ESMAttachment")) {
                        return 753;
                    }
                    if (r7.equals("LeadGenDeepLinkData")) {
                        return 1470;
                    }
                    if (r7.equals("LinkedGroupMetadata")) {
                        return 1552;
                    }
                    if (r7.equals("NTFBLiteComposerState")) {
                        return 2060;
                    }
                    break;
                case 1343:
                    if (r7.equals("AdDraftSql")) {
                        return 126;
                    }
                    if (r7.equals("AdProposal")) {
                        return 134;
                    }
                    if (r7.equals("ESMInvolvement")) {
                        return 767;
                    }
                    if (r7.equals("ExtendedCredit")) {
                        return 871;
                    }
                    if (r7.equals("ExternalWallet")) {
                        return 905;
                    }
                    if (r7.equals("LeadGenInfoFieldData")) {
                        return 1476;
                    }
                    break;
                case 1344:
                    if (r7.equals("AYMTChannel")) {
                        return 57;
                    }
                    if (r7.equals("AdsTutorial")) {
                        return 168;
                    }
                    if (r7.equals("AvatarModel")) {
                        return 297;
                    }
                    if (r7.equals("EInvoiceRequest")) {
                        return 749;
                    }
                    break;
                case 1345:
                    if (r7.equals("CHEXOrderGroup")) {
                        return 430;
                    }
                    if (r7.equals("ESMServiceObject")) {
                        return 790;
                    }
                    if (r7.equals("NmorTwoCTwoPBankResponse")) {
                        return 2110;
                    }
                    if (r7.equals("NmorTwoCTwoPCashResponse")) {
                        return 2111;
                    }
                    break;
                case 1346:
                    if (r7.equals("EmojiCategoryList")) {
                        return 811;
                    }
                    if (r7.equals("EntAdPlacePageSet")) {
                        return 822;
                    }
                    if (r7.equals("LiveVideoChatbotPersona")) {
                        return 1566;
                    }
                    break;
                case 1348:
                    if (r7.equals("LegalPermissionActionData")) {
                        return 1529;
                    }
                    break;
                case 1349:
                    if (r7.equals("AltPayCredential")) {
                        return 230;
                    }
                    if (r7.equals("EmptyUserStoryBucket")) {
                        return 820;
                    }
                    if (r7.equals("LangtechOntologyTypeSchema")) {
                        return 1464;
                    }
                    break;
                case 1350:
                    if (r7.equals("AdConversionPixel")) {
                        return 121;
                    }
                    if (r7.equals("EventIndividualTicket")) {
                        return 844;
                    }
                    if (r7.equals("EventTicketingPayment")) {
                        return 859;
                    }
                    if (r7.equals("ExploreFeedUpsellUnit")) {
                        return 867;
                    }
                    break;
                case 1351:
                    if (r7.equals("AIDemosMobileModel")) {
                        return 5;
                    }
                    if (r7.equals("AYMTAMAHomeChannel")) {
                        return 46;
                    }
                    if (r7.equals("AdDraftFragmentSql")) {
                        return 125;
                    }
                    if (r7.equals("ExternalCaseAttachment")) {
                        return 879;
                    }
                    if (r7.equals("ExternalTaskAttachment")) {
                        return 898;
                    }
                    if (r7.equals("LangtechOntologyIntentSchema")) {
                        return 1462;
                    }
                    if (r7.equals("NegativeFeedbackDetailResponse")) {
                        return 2072;
                    }
                    break;
                case 1352:
                    if (r7.equals("AYMTAMAAlertChannel")) {
                        return 41;
                    }
                    if (r7.equals("ExploreFeedUpsellNTUnit")) {
                        return 866;
                    }
                    break;
                case 1353:
                    if (r7.equals("AYMTLWINativeChannel")) {
                        return 66;
                    }
                    if (r7.equals("CosmosTagTaxonomyGroup")) {
                        return 615;
                    }
                    if (r7.equals("ExternalMoviePageRequest")) {
                        return 888;
                    }
                    if (r7.equals("LangtechOntologyPropertySchema")) {
                        return 1463;
                    }
                    break;
                case 1354:
                    if (r7.equals("AYMTAMAAdgroupChannel")) {
                        return 40;
                    }
                    if (r7.equals("AnalyticsStoredFunnel")) {
                        return 241;
                    }
                    if (r7.equals("ExWithAlohaAbilityAccount")) {
                        return 863;
                    }
                    if (r7.equals("ExtendedCreditChangeEvent")) {
                        return 874;
                    }
                    break;
                case 1355:
                    if (r7.equals("AYMTAMACampaignChannel")) {
                        return 43;
                    }
                    if (r7.equals("ExploreTopicMatchRuleInput")) {
                        return 868;
                    }
                    break;
                case 1356:
                    if (r7.equals("AYMTAMAAdAccountChannel")) {
                        return 39;
                    }
                    if (r7.equals("AYMTGroupsMobileChannel")) {
                        return 63;
                    }
                    if (r7.equals("AYMTPMAMegaphoneChannel")) {
                        return 82;
                    }
                    if (r7.equals("AlohaBLEProximitySignal")) {
                        return 200;
                    }
                    if (r7.equals("ExtensibleMessageAttachment")) {
                        return 877;
                    }
                    if (r7.equals("ExternalTranslatableContent")) {
                        return 903;
                    }
                    break;
                case 1357:
                    if (r7.equals("ARDynamicContentTutorial")) {
                        return 17;
                    }
                    if (r7.equals("AlohaWifiProximitySignal")) {
                        return 229;
                    }
                    break;
                case 1358:
                    if (r7.equals("AYMTNativeNewsFeedChannel")) {
                        return 78;
                    }
                    if (r7.equals("EntAnalyticsUserEntityContext")) {
                        return 823;
                    }
                    if (r7.equals("NmorChargeWithAsyncCredentialResponse")) {
                        return 2103;
                    }
                    if (r7.equals("Teleprompter")) {
                        return 3167;
                    }
                    break;
                case 1359:
                    if (r7.equals("AYMTAdCenterUpdatesChannel")) {
                        return 50;
                    }
                    break;
                case 1360:
                    if (r7.equals("ARCapabilityMinVersionModel")) {
                        return 10;
                    }
                    if (r7.equals("AYMTAMACampaignGroupChannel")) {
                        return 44;
                    }
                    if (r7.equals("AYMTLWICampaignGroupChannel")) {
                        return 65;
                    }
                    if (r7.equals("EndOfFeedUpsellCustomNTFeedUnit")) {
                        return 821;
                    }
                    break;
                case 1361:
                    if (r7.equals("AYMTBizAppAdsCampaignChannel")) {
                        return 51;
                    }
                    if (r7.equals("AYMTDummyLegacyMobileChannel")) {
                        return 62;
                    }
                    if (r7.equals("AlohaGeofenceProximitySignal")) {
                        return 217;
                    }
                    if (r7.equals("ThreatIndicator")) {
                        return 3185;
                    }
                    if (r7.equals("TogetherAppUser")) {
                        return 3211;
                    }
                    break;
                case 1362:
                    if (r7.equals("AYMTBizInfoCenterToolsChannel")) {
                        return 54;
                    }
                    if (r7.equals("ThreatDescriptor")) {
                        return 3183;
                    }
                    break;
                case 1363:
                    if (r7.equals("AYMTAMAFlattenedAdgroupChannel")) {
                        return 45;
                    }
                    if (r7.equals("AYMTCometGroupsMallCardChannel")) {
                        return 59;
                    }
                    if (r7.equals("AYMTPagePostFooterWebV2Channel")) {
                        return 85;
                    }
                    if (r7.equals("TerragraphPartner")) {
                        return 3171;
                    }
                    break;
                case 1364:
                    if (r7.equals("AYMTAMABookmarkAdAccountChannel")) {
                        return 42;
                    }
                    if (r7.equals("AYMTAdCenterOverviewCardChannel")) {
                        return 48;
                    }
                    if (r7.equals("AYMTDummyGraphQLTutorialChannel")) {
                        return 61;
                    }
                    if (r7.equals("AYMTNativeGroupsInsightsChannel")) {
                        return 70;
                    }
                    if (r7.equals("AYMTNativeGroupsMallCardChannel")) {
                        return 72;
                    }
                    if (r7.equals("AYMTPageAdminMegaphoneV2Channel")) {
                        return 83;
                    }
                    if (r7.equals("AYMTPagePostFooterNativeChannel")) {
                        return 84;
                    }
                    break;
                case 1365:
                    if (r7.equals("AYMTAdCenterSuggestedCardChannel")) {
                        return 49;
                    }
                    break;
                case 1366:
                    if (r7.equals("AYMTAdCenterNeedsAttentionChannel")) {
                        return 47;
                    }
                    if (r7.equals("AYMTBizInfoCenterResourcesChannel")) {
                        return 53;
                    }
                    if (r7.equals("AYMTMobileAdminSurfaceTodoChannel")) {
                        return 68;
                    }
                    if (r7.equals("NegativeFeedbackReportActionRequiringEvidence")) {
                        return 2076;
                    }
                    if (r7.equals("RobotSpaceLocation")) {
                        return 2670;
                    }
                    break;
                case 1367:
                    if (r7.equals("AYMTNativeGroupsMallPeekBarChannel")) {
                        return 73;
                    }
                    if (r7.equals("AYMTNewsFeedPostFooterWebV2Channel")) {
                        return 81;
                    }
                    break;
                case 1368:
                    if (r7.equals("AYMTNativeMobilePageInsightsChannel")) {
                        return 74;
                    }
                    if (r7.equals("AYMTNativePageAdminMegaphoneChannel")) {
                        return 79;
                    }
                    if (r7.equals("ResearchOrganization")) {
                        return 2635;
                    }
                    if (r7.equals("ThirdPartyRatingAuthor")) {
                        return 3182;
                    }
                    break;
                case 1369:
                    if (r7.equals("AYMTBizAppAdsFlattenedAdgroupChannel")) {
                        return 52;
                    }
                    if (r7.equals("Album")) {
                        return 194;
                    }
                    break;
                case 1370:
                    if (r7.equals("AYMTInstagramPromotionsManagerChannel")) {
                        return 64;
                    }
                    break;
                case 1371:
                    if (r7.equals("AYMTNativeAdCenterAdInspirationChannel")) {
                        return 69;
                    }
                    if (r7.equals("RobotDatacenterLocation")) {
                        return 2662;
                    }
                    if (r7.equals("TicketedExperienceCluster")) {
                        return 3190;
                    }
                    break;
                case 1372:
                    if (r7.equals("AYMTMobileAdCenterNeedsAttentionChannel")) {
                        return 67;
                    }
                    if (r7.equals("AYMTNativeMobilePagePostInsightsChannel")) {
                        return 76;
                    }
                    if (r7.equals("TimelineContextItemWrapper")) {
                        return 3197;
                    }
                    break;
                case 1373:
                    if (r7.equals("AYMTNativePagesInsightsPostHeaderChannel")) {
                        return 80;
                    }
                    if (r7.equals("ArenaTeam")) {
                        return 267;
                    }
                    if (r7.equals("GeoGatingPolicy")) {
                        return 1087;
                    }
                    if (r7.equals("ThirdPartyPartnerAdvertiser")) {
                        return 3179;
                    }
                    if (r7.equals("TriggerHCMForResultBehavior")) {
                        return 3242;
                    }
                    break;
                case 1374:
                    if (r7.equals("AYMTNativeGroupsInsightsTipsCenterChannel")) {
                        return 71;
                    }
                    if (r7.equals("AYMTNativeMobilePageInsightsRAMainChannel")) {
                        return 75;
                    }
                    if (r7.equals("AYMTNativeMobilePagePostInsightsRAChannel")) {
                        return 77;
                    }
                    if (r7.equals("GraphSearchQuery")) {
                        return 1131;
                    }
                    break;
                case 1375:
                    if (r7.equals("GroupSellCategory")) {
                        return 1177;
                    }
                    break;
                case 1376:
                    if (r7.equals("AYMTCreatorStudioAppAnnouncementCardChannel")) {
                        return 60;
                    }
                    if (r7.equals("GroupAdminActivity")) {
                        return 1137;
                    }
                    break;
                case 1377:
                    if (r7.equals("AgreementTerm")) {
                        return 184;
                    }
                    if (r7.equals("GiftProductCategory")) {
                        return 1096;
                    }
                    break;
                case 1379:
                    if (r7.equals("AYMTBizResourceHubHighPriorityMegaphoneChannel")) {
                        return 55;
                    }
                    break;
                case 1380:
                    if (r7.equals("GroupDiscoveryCategory")) {
                        return 1146;
                    }
                    break;
                case 1381:
                    if (r7.equals("AssistantListItem")) {
                        return 273;
                    }
                    break;
                case 1382:
                    if (r7.equals("ResearchPollMultipleChoiceQuestion")) {
                        return 2640;
                    }
                    break;
                case 1383:
                    if (r7.equals("ArcticTitleCardItem")) {
                        return 264;
                    }
                    break;
                case 1384:
                    if (r7.equals("GroupAlertedContentHistory")) {
                        return 1141;
                    }
                    break;
                case 1385:
                    if (r7.equals("GroupEnforcedContentHistory")) {
                        return 1151;
                    }
                    break;
                case 1387:
                    if (r7.equals("ArcticTextWithTitleItem")) {
                        return 263;
                    }
                    break;
                case 1390:
                    if (r7.equals("ActorGatewayEnrollmentItem")) {
                        return 94;
                    }
                    if (r7.equals("NestEgg")) {
                        return 2091;
                    }
                    break;
                case 1392:
                    if (r7.equals("ARDynamicContentCarouselItem")) {
                        return 15;
                    }
                    break;
                case 1393:
                    if (r7.equals("TextWithEntities")) {
                        return 3177;
                    }
                    break;
                case 1396:
                    if (r7.equals("TogetherPlayerStats")) {
                        return 3218;
                    }
                    break;
                case 1397:
                    if (r7.equals("RepeatOffenderInfo")) {
                        return 2625;
                    }
                    break;
                case 1398:
                    if (r7.equals("PageMergeFeedback")) {
                        return 2249;
                    }
                    if (r7.equals("ProdUsabilityTask")) {
                        return 2479;
                    }
                    break;
                case 1400:
                    if (r7.equals("CMSPair")) {
                        return 454;
                    }
                    if (r7.equals("TransactionFBIncentives")) {
                        return 3231;
                    }
                    if (r7.equals("TriviaGamePlayerResults")) {
                        return 3250;
                    }
                    break;
                case 1401:
                    if (r7.equals("AdSeen")) {
                        return 138;
                    }
                    if (r7.equals("PPWhitelistedIPBlock")) {
                        return 2207;
                    }
                    break;
                case 1403:
                    if (r7.equals("AdsToken")) {
                        return 167;
                    }
                    if (r7.equals("PageNameChangeFeedback")) {
                        return 2253;
                    }
                    break;
                case 1404:
                    if (r7.equals("ContactUser")) {
                        return 599;
                    }
                    if (r7.equals("CorePartner")) {
                        return 608;
                    }
                    if (r7.equals("PendingGeoBlockFeedback")) {
                        return 2383;
                    }
                    if (r7.equals("ProfileMediaOverlayMask")) {
                        return 2527;
                    }
                    if (r7.equals("TournamentOrganizerSettings")) {
                        return 3227;
                    }
                    break;
                case 1405:
                    if (r7.equals("AdCampaign")) {
                        return 118;
                    }
                    if (r7.equals("AppSection")) {
                        return 252;
                    }
                    if (r7.equals("CustomGender")) {
                        return 657;
                    }
                    if (r7.equals("PageBadgeRemovalFeedback")) {
                        return 2215;
                    }
                    break;
                case 1406:
                    if (r7.equals("Application")) {
                        return 255;
                    }
                    if (r7.equals("CommerceOffer")) {
                        return 548;
                    }
                    if (r7.equals("PageCustomTagCustomerLink")) {
                        return 2234;
                    }
                    break;
                case 1407:
                    if (r7.equals("CreativeFilter")) {
                        return 628;
                    }
                    break;
                case 1409:
                    if (r7.equals("AIDemosSection")) {
                        return 6;
                    }
                    break;
                case 1410:
                    if (r7.equals("AREffectSection")) {
                        return 21;
                    }
                    if (r7.equals("AYMTChannelMain")) {
                        return 58;
                    }
                    break;
                case 1411:
                    if (r7.equals("CommunityNuxAnswer")) {
                        return 565;
                    }
                    break;
                case 1412:
                    if (r7.equals("AppDetailsSection")) {
                        return 248;
                    }
                    if (r7.equals("CHEXShippingCarrier")) {
                        return 448;
                    }
                    if (r7.equals("RecruitingRecommendationModelInfo")) {
                        return 2617;
                    }
                    break;
                case 1413:
                    if (r7.equals("ProdCandidateCometReviewFeedback")) {
                        return 2453;
                    }
                    break;
                case 1414:
                    if (r7.equals("ARLibraryCollection")) {
                        return 32;
                    }
                    if (r7.equals("AgentItemSuggestion")) {
                        return 179;
                    }
                    if (r7.equals("LeadGenQuestionValidationSpec")) {
                        return 1484;
                    }
                    break;
                case 1415:
                    if (r7.equals("AdsLWIDraftPromotion")) {
                        return 159;
                    }
                    if (r7.equals("AskMeAnythingSession")) {
                        return 269;
                    }
                    if (r7.equals("AuthenticityUtilityBillVerificationSupportInboxItem")) {
                        return 280;
                    }
                    if (r7.equals("ComplianceQueryPartner")) {
                        return 582;
                    }
                    break;
                case 1416:
                    if (r7.equals("AdAccountAltpayOption")) {
                        return 99;
                    }
                    if (r7.equals("AdTargetSpecification")) {
                        return 142;
                    }
                    if (r7.equals("CHEXMessageThreadFolder")) {
                        return 427;
                    }
                    if (r7.equals("ProcurementQuestionResponseFeedback")) {
                        return 2448;
                    }
                    break;
                case 1417:
                    if (r7.equals("ARLibraryAudioRevision")) {
                        return 29;
                    }
                    if (r7.equals("ARLibraryBlockRevision")) {
                        return 31;
                    }
                    if (r7.equals("AdminedPagesConnection")) {
                        return 147;
                    }
                    if (r7.equals("AfterPartyUserReaction")) {
                        return 177;
                    }
                    break;
                case 1418:
                    if (r7.equals("ActorAudienceLimitation")) {
                        return 92;
                    }
                    if (r7.equals("CHEXLinkedShippingCarrier")) {
                        return 419;
                    }
                    if (r7.equals("Touchpoint")) {
                        return 3226;
                    }
                    break;
                case 1419:
                    if (r7.equals("ARLibraryTextureRevision")) {
                        return 37;
                    }
                    if (r7.equals("AdAccountNewPaypalOption")) {
                        return 105;
                    }
                    if (r7.equals("AlohaAbilityAssetVersion")) {
                        return 198;
                    }
                    if (r7.equals("CHEXPaymentInvoiceBOFOrder")) {
                        return 435;
                    }
                    if (r7.equals("TarotDigest")) {
                        return 3162;
                    }
                    break;
                case 1420:
                    if (r7.equals("ARLibrary3DObjectRevision")) {
                        return 27;
                    }
                    if (r7.equals("AdvertiserIssueResolution")) {
                        return 174;
                    }
                    if (r7.equals("RobotGroup")) {
                        return 2663;
                    }
                    if (r7.equals("VideoTimeIndex")) {
                        return 3344;
                    }
                    break;
                case 1421:
                    if (r7.equals("ContextualProfilePlaceholder")) {
                        return 603;
                    }
                    break;
                case 1422:
                    if (r7.equals("ARLibraryPatchGroupRevision")) {
                        return 34;
                    }
                    if (r7.equals("CivicGraphCrowdsourcingAnswer")) {
                        return 489;
                    }
                    break;
                case 1423:
                    if (r7.equals("AdAccountNewCreditCardOption")) {
                        return 103;
                    }
                    if (r7.equals("PostChannel")) {
                        return 2425;
                    }
                    break;
                case 1424:
                    if (r7.equals("AlohaCredentialsConfiguration")) {
                        return 205;
                    }
                    if (r7.equals("AmbassadorCandidateConnection")) {
                        return 231;
                    }
                    if (r7.equals("TriviaGamePayout")) {
                        return 3248;
                    }
                    break;
                case 1425:
                    if (r7.equals("PartnerAssessmentFBFormAttachmentAndFeedback")) {
                        return 2324;
                    }
                    break;
                case 1426:
                    if (r7.equals("AdAccountNewDirectDebitV2Option")) {
                        return 104;
                    }
                    if (r7.equals("TextMatchRuleInput")) {
                        return 3176;
                    }
                    break;
                case 1427:
                    if (r7.equals("LoyaltyCard")) {
                        return 1606;
                    }
                    if (r7.equals("TrendingCuratedUnit")) {
                        return 3237;
                    }
                    break;
                case 1428:
                    if (r7.equals("AdAccountPaymentMethodsConnection")) {
                        return 107;
                    }
                    if (r7.equals("LegalFMField")) {
                        return 1497;
                    }
                    if (r7.equals("ProdMergedSchool")) {
                        return 2469;
                    }
                    if (r7.equals("TogetherAnnouncement")) {
                        return 3210;
                    }
                    break;
                case 1429:
                    if (r7.equals("LoyaltyReward")) {
                        return 1614;
                    }
                    if (r7.equals("TaggedInAlbumMediaSet")) {
                        return 3154;
                    }
                    if (r7.equals("TicketOrderAttachment")) {
                        return 3189;
                    }
                    break;
                case 1430:
                    if (r7.equals("Crisis")) {
                        return 638;
                    }
                    if (r7.equals("TaggableActivityObject")) {
                        return 3153;
                    }
                    if (r7.equals("TestAddressBookContact")) {
                        return 3173;
                    }
                    if (r7.equals("TopicFeedPivotFeedUnit")) {
                        return 3223;
                    }
                    if (r7.equals("TopicsToFollowFeedUnit")) {
                        return 3225;
                    }
                    break;
                case 1431:
                    if (r7.equals("AlohaBasicAbilityNativeConfiguration")) {
                        return 202;
                    }
                    if (r7.equals("PaymentAccountEmail")) {
                        return 2335;
                    }
                    break;
                case 1432:
                    if (r7.equals("AlohaExternalAbilityHulaConfiguration")) {
                        return 209;
                    }
                    if (r7.equals("ProfileAutofillEmail")) {
                        return 2511;
                    }
                    break;
                case 1433:
                    if (r7.equals("PagesPlatformAutofill")) {
                        return 2294;
                    }
                    if (r7.equals("TaggedMediaOfUserMediaSet")) {
                        return 3156;
                    }
                    break;
                case 1434:
                    if (r7.equals("AdvertiserIssueResolutionsConfiguration")) {
                        return 175;
                    }
                    if (r7.equals("AlohaExternalAbilityHyruleConfiguration")) {
                        return 210;
                    }
                    if (r7.equals("AlohaExternalAbilityNativeConfiguration")) {
                        return 215;
                    }
                    if (r7.equals("CRMAddress")) {
                        return 458;
                    }
                    if (r7.equals("ProdRecruitingReferral")) {
                        return 2474;
                    }
                    break;
                case 1435:
                    if (r7.equals("AlohaExternalAbilityWebViewConfiguration")) {
                        return 216;
                    }
                    if (r7.equals("CrisisAlias")) {
                        return 639;
                    }
                    if (r7.equals("PaymentAffirmCredential")) {
                        return 2340;
                    }
                    if (r7.equals("PaymentSubscriptionBill")) {
                        return 2359;
                    }
                    if (r7.equals("TimelineAtWorkDetailsResult")) {
                        return 3196;
                    }
                    break;
                case 1436:
                    if (r7.equals("PeoplePortalCMSObjectXml")) {
                        return 2387;
                    }
                    break;
                case 1437:
                    if (r7.equals("AIDemosDemo")) {
                        return 4;
                    }
                    if (r7.equals("TarotDigestSuggestionFeedUnit")) {
                        return 3163;
                    }
                    if (r7.equals("TransactionEngineRowComponent")) {
                        return 3230;
                    }
                    break;
                case 1438:
                    if (r7.equals("AlohaExternalAbilityJavaScriptConfiguration")) {
                        return 214;
                    }
                    if (r7.equals("AmbientAudio")) {
                        return 232;
                    }
                    if (r7.equals("ThirdPartyPrivacyPortalComment")) {
                        return 3180;
                    }
                    break;
                case 1439:
                    if (r7.equals("AlohaExternalAbilityInstantGameConfiguration")) {
                        return 213;
                    }
                    if (r7.equals("LiveVideoPollResultCard")) {
                        return 1572;
                    }
                    if (r7.equals("LiveVideoPollVotingCard")) {
                        return 1573;
                    }
                    break;
                case 1440:
                    if (r7.equals("ARLibraryAudio")) {
                        return 28;
                    }
                    if (r7.equals("CHEXOrderMetrics")) {
                        return 433;
                    }
                    if (r7.equals("CaptionsSettings")) {
                        return 475;
                    }
                    if (r7.equals("CoronavirusStats")) {
                        return 611;
                    }
                    break;
                case 1441:
                    if (r7.equals("ExternalMovieReview")) {
                        return 889;
                    }
                    if (r7.equals("LiveVideoTimedChatCommand")) {
                        return 1576;
                    }
                    if (r7.equals("RecruitingNormalizedEntityGroup")) {
                        return 2615;
                    }
                    if (r7.equals("TaggedMediaOfFamilyMemberMediaSet")) {
                        return 3155;
                    }
                    break;
                case 1442:
                    if (r7.equals("CHEXReturnSettings")) {
                        return 441;
                    }
                    if (r7.equals("LiveVideoCustomChatCommand")) {
                        return 1568;
                    }
                    break;
                case 1443:
                    if (r7.equals("CodingContestSeries")) {
                        return 516;
                    }
                    break;
                case 1444:
                    if (r7.equals("CHEXOrderItemMetrics")) {
                        return 432;
                    }
                    if (r7.equals("ClearHistoryControls")) {
                        return 496;
                    }
                    if (r7.equals("LoyaltyMessageInCustomerFeed")) {
                        return 1610;
                    }
                    if (r7.equals("PeerToPeerPlatformSoldItemDetail")) {
                        return 2370;
                    }
                    break;
                case 1445:
                    if (r7.equals("CHEXSellerTaxSettings")) {
                        return 444;
                    }
                    if (r7.equals("LocationUpdateResponsePayload")) {
                        return 1602;
                    }
                    if (r7.equals("ParentApprovedUserParentalControl")) {
                        return 2317;
                    }
                    break;
                case 1447:
                    if (r7.equals("AutoApprovalGroupInfo")) {
                        return 283;
                    }
                    break;
                case 1448:
                    if (r7.equals("CommerceMerchantSettings")) {
                        return 546;
                    }
                    if (r7.equals("CompanyFrontlineSettings")) {
                        return 569;
                    }
                    break;
                case 1449:
                    if (r7.equals("CommerceFBChannelSettings")) {
                        return 542;
                    }
                    if (r7.equals("CommerceIGChannelSettings")) {
                        return 543;
                    }
                    if (r7.equals("CommerceWAChannelSettings")) {
                        return 559;
                    }
                    if (r7.equals("ComposedBlockWithEntities")) {
                        return 583;
                    }
                    break;
                case 1450:
                    if (r7.equals("CommerceReviewForAnalytics")) {
                        return 551;
                    }
                    if (r7.equals("Program")) {
                        return 2544;
                    }
                    break;
                case 1451:
                    if (r7.equals("PollItem")) {
                        return 2420;
                    }
                    break;
                case 1453:
                    if (r7.equals("LocationSettingsUpdateResponsePayload")) {
                        return 1598;
                    }
                    break;
                case 1454:
                    if (r7.equals("ProductItem")) {
                        return 2494;
                    }
                    if (r7.equals("VolunteerActivity")) {
                        return 3366;
                    }
                    break;
                case 1455:
                    if (r7.equals("CommunityModerationPageSettings")) {
                        return 564;
                    }
                    if (r7.equals("PageCommItem")) {
                        return 2222;
                    }
                    break;
                case 1456:
                    if (r7.equals("PelicanStream")) {
                        return 2382;
                    }
                    if (r7.equals("PlaceListItem")) {
                        return 2405;
                    }
                    if (r7.equals(VersionedCapability.TAG)) {
                        return 3304;
                    }
                    break;
                case 1457:
                    if (r7.equals("PageLivingRoom")) {
                        return 2248;
                    }
                    if (r7.equals("VideoCopyrightPolicy")) {
                        return 3317;
                    }
                    break;
                case 1459:
                    if (r7.equals("LoyaltyStore")) {
                        return 1616;
                    }
                    if (r7.equals("VirtualProductCategory")) {
                        return 3364;
                    }
                    break;
                case 1460:
                    if (r7.equals("CommerceMerchantSubscriptionSettings")) {
                        return 547;
                    }
                    if (r7.equals("LeadGenDeepLinkUserInfoCreateResponsePayload")) {
                        return 1471;
                    }
                    if (r7.equals("LiveChallenge")) {
                        return 1554;
                    }
                    if (r7.equals("LocationShare")) {
                        return 1599;
                    }
                    if (r7.equals("ProfileLivingRoom")) {
                        return 2526;
                    }
                    break;
                case 1461:
                    if (r7.equals("CreatorStudioInboxPriorityTopMessages")) {
                        return 637;
                    }
                    if (r7.equals("JoinGroupCTA")) {
                        return 1434;
                    }
                    if (r7.equals("LDPAppInstance")) {
                        return 1456;
                    }
                    break;
                case 1462:
                    if (r7.equals("Comment")) {
                        return 532;
                    }
                    if (r7.equals("Consent")) {
                        return 591;
                    }
                    if (r7.equals("LegalFMTemplate")) {
                        return 1500;
                    }
                    if (r7.equals("LocationHistoryTimelineMutationResponsePayload")) {
                        return 1595;
                    }
                    if (r7.equals("ProdImmigrationForm")) {
                        return 2460;
                    }
                    break;
                case 1463:
                    if (r7.equals("LeadGenErrorNode")) {
                        return 1475;
                    }
                    break;
                case 1464:
                    if (r7.equals("Adgroup")) {
                        return 145;
                    }
                    if (r7.equals("CMSObject")) {
                        return 453;
                    }
                    if (r7.equals("ClashUnit")) {
                        return 495;
                    }
                    break;
                case 1465:
                    if (r7.equals("LassoAREffectUsage")) {
                        return 1466;
                    }
                    if (r7.equals("LeadGenContextPage")) {
                        return 1468;
                    }
                    if (r7.equals("LegalFMElementRule")) {
                        return 1495;
                    }
                    if (r7.equals("LegalMatterKeyDate")) {
                        return 1515;
                    }
                    if (r7.equals("PageCoverSlideshowItem")) {
                        return 2231;
                    }
                    break;
                case 1466:
                    if (r7.equals("LeadGenThankYouPage")) {
                        return 1485;
                    }
                    if (r7.equals("LegalPermissionRole")) {
                        return 1531;
                    }
                    if (r7.equals("LifeEventExperience")) {
                        return 1550;
                    }
                    break;
                case 1467:
                    if (r7.equals("CHEXShipment")) {
                        return 445;
                    }
                    if (r7.equals("CommerceCart")) {
                        return 537;
                    }
                    if (r7.equals("ComposedText")) {
                        return 585;
                    }
                    if (r7.equals("LassoAudioAssetUsage")) {
                        return 1467;
                    }
                    if (r7.equals("LearningCourseModule")) {
                        return 1491;
                    }
                    if (r7.equals("LegalMatterNarrative")) {
                        return 1518;
                    }
                    break;
                case 1468:
                    if (r7.equals("CodingContest")) {
                        return 503;
                    }
                    if (r7.equals("LiveVideoAssignedRole")) {
                        return 1564;
                    }
                    if (r7.equals("LocalCommunityProfile")) {
                        return 1587;
                    }
                    break;
                case 1469:
                    if (r7.equals("ChatEnticement")) {
                        return 484;
                    }
                    if (r7.equals("CulturalMoment")) {
                        return 650;
                    }
                    break;
                case 1470:
                    if (r7.equals("LegalMatterExternalCase")) {
                        return 1511;
                    }
                    break;
                case 1471:
                    if (r7.equals("AlohaOwnership")) {
                        return 220;
                    }
                    if (r7.equals("CommerceKYCEvent")) {
                        return 544;
                    }
                    if (r7.equals("ComposedDocument")) {
                        return 584;
                    }
                    if (r7.equals("ConversationPost")) {
                        return 607;
                    }
                    break;
                case 1472:
                    if (r7.equals("AdCampaignGroup")) {
                        return 119;
                    }
                    if (r7.equals("CHEXShipmentEvent")) {
                        return 446;
                    }
                    if (r7.equals("ChatCommandResult")) {
                        return 483;
                    }
                    if (r7.equals("CodingProblemHint")) {
                        return 522;
                    }
                    if (r7.equals("CommunityLiveChat")) {
                        return 562;
                    }
                    if (r7.equals("CouponCodeRequest")) {
                        return 620;
                    }
                    break;
                case 1473:
                    if (r7.equals("CHEXMerchantReport")) {
                        return 423;
                    }
                    if (r7.equals("CodingContestAlert")) {
                        return 504;
                    }
                    if (r7.equals("CompassCuratedUnit")) {
                        return 572;
                    }
                    if (r7.equals("LangtechOntologyEntityType")) {
                        return 1461;
                    }
                    if (r7.equals("PendingPostsTimelineReviewItem")) {
                        return 2385;
                    }
                    break;
                case 1474:
                    if (r7.equals("AREffectTestGroup")) {
                        return 23;
                    }
                    if (r7.equals("CarrierUpsellWallet")) {
                        return 478;
                    }
                    if (r7.equals("CouponApprovalEvent")) {
                        return 618;
                    }
                    if (r7.equals("LocationHistoryTimelineEdge")) {
                        return 1594;
                    }
                    break;
                case 1475:
                    if (r7.equals("LocationHistoryTimelinePlace")) {
                        return 1596;
                    }
                    if (r7.equals("LoyaltyAddPointsActionQRCode")) {
                        return 1604;
                    }
                    if (r7.equals("LoyaltyRewardByPunchCardRule")) {
                        return 1615;
                    }
                    break;
                case 1476:
                    if (r7.equals("ARLibraryPatchGroup")) {
                        return 33;
                    }
                    if (r7.equals("CHEXMessageAttachment")) {
                        return 425;
                    }
                    if (r7.equals("LeadGenPreScreenDecisionState")) {
                        return 1481;
                    }
                    if (r7.equals("ProfileApprovalTimelineReviewItem")) {
                        return 2509;
                    }
                    if (r7.equals("ProfileQuestionTimelineReviewItem")) {
                        return 2537;
                    }
                    break;
                case 1477:
                    if (r7.equals("ClientProductionPrompt")) {
                        return 500;
                    }
                    break;
                case 1478:
                    if (r7.equals("CandidateReferralOptOut")) {
                        return 473;
                    }
                    if (r7.equals("ChargebackRepresentment")) {
                        return 481;
                    }
                    if (r7.equals("ClientLeadOutreachEvent")) {
                        return 499;
                    }
                    if (r7.equals("CodingContestProblemSet")) {
                        return 513;
                    }
                    break;
                case 1479:
                    if (r7.equals("CivicGraphExternalImport")) {
                        return 492;
                    }
                    if (r7.equals("CodingContestTeamEntrant")) {
                        return 517;
                    }
                    if (r7.equals("CodingProblemTestCaseSet")) {
                        return 527;
                    }
                    if (r7.equals("CommunityModerationEvent")) {
                        return 563;
                    }
                    if (r7.equals("ProfileInfoRequestTimelineReviewItem")) {
                        return 2524;
                    }
                    break;
                case 1480:
                    if (r7.equals("CarrierPhoneNumberAccount")) {
                        return 476;
                    }
                    if (r7.equals("ClientTriggeredQPFeedUnit")) {
                        return 501;
                    }
                    if (r7.equals("CodingInterviewProblemSet")) {
                        return 520;
                    }
                    if (r7.equals("CompassCuratedUnitElement")) {
                        return 573;
                    }
                    break;
                case 1481:
                    if (r7.equals("CovidExtractableFBTContent")) {
                        return 623;
                    }
                    if (r7.equals("RideOrder")) {
                        return 2654;
                    }
                    break;
                case 1483:
                    if (r7.equals("CHEXMerchantBulkActionReport")) {
                        return 421;
                    }
                    if (r7.equals("CHEXOrderCancellationRequest")) {
                        return 428;
                    }
                    if (r7.equals("PushToken")) {
                        return 2558;
                    }
                    break;
                case 1485:
                    if (r7.equals("CelebrateFriendsPhotoAgreement")) {
                        return 479;
                    }
                    if (r7.equals("CodingContestIndividualEntrant")) {
                        return 510;
                    }
                    break;
                case 1486:
                    if (r7.equals("ContextualProfileMessageRequest")) {
                        return 602;
                    }
                    if (r7.equals("PageQuestion")) {
                        return 2261;
                    }
                    if (r7.equals("RestrictedUser")) {
                        return 2652;
                    }
                    break;
                case 1487:
                    if (r7.equals("CivicGraphMergeValidationRequest")) {
                        return 493;
                    }
                    if (r7.equals("CoronavirusCommunityHelpFeedUnit")) {
                        return 609;
                    }
                    if (r7.equals("PaymentAction")) {
                        return 2338;
                    }
                    if (r7.equals("PaymentCoupon")) {
                        return 2346;
                    }
                    if (r7.equals("PrivacyOption")) {
                        return 2442;
                    }
                    if (r7.equals("ResearchPartner")) {
                        return 2637;
                    }
                    break;
                case 1488:
                    if (r7.equals("CodingContestClarificationRequest")) {
                        return 505;
                    }
                    break;
                case 1489:
                    if (r7.equals("PageFAQQuestion")) {
                        return 2237;
                    }
                    if (r7.equals("ProdRequisition")) {
                        return 2476;
                    }
                    if (r7.equals("ProductQuestion")) {
                        return 2501;
                    }
                    if (r7.equals("ProfileQuestion")) {
                        return 2536;
                    }
                    if (r7.equals("RecruitingManager")) {
                        return 2613;
                    }
                    if (r7.equals("RoleBlockBehavior")) {
                        return 2674;
                    }
                    break;
                case 1490:
                    if (r7.equals("Entity")) {
                        return 826;
                    }
                    if (r7.equals("PageCallToAction")) {
                        return 2219;
                    }
                    break;
                case 1491:
                    if (r7.equals("PageBizDefinition")) {
                        return 2216;
                    }
                    if (r7.equals("PageServiceRegion")) {
                        return 2271;
                    }
                    if (r7.equals("PelicanAnnotation")) {
                        return 2375;
                    }
                    break;
                case 1492:
                    if (r7.equals("PaymentMethodToken")) {
                        return 2355;
                    }
                    if (r7.equals("ProdMergedPosition")) {
                        return 2467;
                    }
                    if (r7.equals("PromotionAnimation")) {
                        return 2547;
                    }
                    break;
                case 1493:
                    if (r7.equals("PMAKioskTransaction")) {
                        return 2202;
                    }
                    if (r7.equals("PageVideoCollection")) {
                        return 2287;
                    }
                    if (r7.equals("ProdCareersLocation")) {
                        return 2457;
                    }
                    if (r7.equals("ProdWorkdayLocation")) {
                        return 2483;
                    }
                    if (r7.equals("ReducedMessagingActor")) {
                        return 2618;
                    }
                    break;
                case 1494:
                    if (r7.equals("PageLikersConnection")) {
                        return 2246;
                    }
                    if (r7.equals("PeerToPeerPaymentPIN")) {
                        return 2367;
                    }
                    if (r7.equals("ProdUsabilityTaskRun")) {
                        return 2480;
                    }
                    break;
                case 1495:
                    if (r7.equals("PaymentCLOTransaction")) {
                        return 2344;
                    }
                    if (r7.equals("PetTalentShowAudition")) {
                        return 2395;
                    }
                    if (r7.equals("ProtonResearchSession")) {
                        return 2550;
                    }
                    break;
                case 1496:
                    if (r7.equals("CHEXMerchantBulkActionReportActionRequest")) {
                        return 422;
                    }
                    if (r7.equals("EventHistory")) {
                        return 843;
                    }
                    if (r7.equals("PostedPhotosConnection")) {
                        return 2427;
                    }
                    if (r7.equals("ResearchAnalysisAccessor")) {
                        return 2629;
                    }
                    break;
                case 1497:
                    if (r7.equals("EmojiCategory")) {
                        return 810;
                    }
                    if (r7.equals("ParticleEffectAnimation")) {
                        return 2321;
                    }
                    if (r7.equals("PartnerPortalInvitation")) {
                        return 2327;
                    }
                    if (r7.equals("ProdHiringConsideration")) {
                        return 2459;
                    }
                    if (r7.equals("ProfileCurrentObsession")) {
                        return 2517;
                    }
                    if (r7.equals("ProfileDiscoverySection")) {
                        return 2520;
                    }
                    break;
                case 1498:
                    if (r7.equals("PPWhitelistedEmailDomain")) {
                        return 2206;
                    }
                    if (r7.equals("PaymentInvoiceableReturn")) {
                        return 2354;
                    }
                    if (r7.equals("ProfileCurrentDecoration")) {
                        return 2516;
                    }
                    break;
                case 1499:
                    if (r7.equals("ReactionUnitWithPhotoHeader")) {
                        return 2605;
                    }
                    break;
                case 1500:
                    if (r7.equals("PageQuestionResponseOption")) {
                        return 2264;
                    }
                    if (r7.equals("PayoutExternalLoginSession")) {
                        return 2361;
                    }
                    if (r7.equals("PrescreenMeetingInvitation")) {
                        return 2431;
                    }
                    break;
                case 1501:
                    if (r7.equals("PaymentCLOPayoutTransaction")) {
                        return 2343;
                    }
                    if (r7.equals("ProdImmigrationFormQuestion")) {
                        return 2461;
                    }
                    break;
                case 1502:
                    if (r7.equals("EventSmartCategory")) {
                        return 849;
                    }
                    if (r7.equals("EventThemeCategory")) {
                        return 850;
                    }
                    if (r7.equals("ResearchUnverifiedCollaborator")) {
                        return 2645;
                    }
                    break;
                case 1503:
                    if (r7.equals("ReactionAggregateUnitWithHeader")) {
                        return 2591;
                    }
                    if (r7.equals("ReactionComponentsReloadHandler")) {
                        return 2593;
                    }
                    break;
                case 1504:
                    if (r7.equals("PageToInstagramUsersConnection")) {
                        return 2282;
                    }
                    if (r7.equals("PageWhatsAppNumberVerification")) {
                        return 2289;
                    }
                    if (r7.equals("PaymentInvoiceableCancellation")) {
                        return 2353;
                    }
                    if (r7.equals("PrivacyCheckupTopicsCollection")) {
                        return 2439;
                    }
                    break;
                case 1505:
                    if (r7.equals("CodingContestClarificationRequestMessageAttachment")) {
                        return 507;
                    }
                    if (r7.equals("ESMAttachmentActivity")) {
                        return 754;
                    }
                    if (r7.equals("ESMServiceCaseSummary")) {
                        return 785;
                    }
                    if (r7.equals("ParentApprovedContactSuggestion")) {
                        return 2313;
                    }
                    if (r7.equals("ProdCandidateCometReviewSession")) {
                        return 2454;
                    }
                    break;
                case 1507:
                    if (r7.equals("PrivacyAssessmentFBFormConnection")) {
                        return 2436;
                    }
                    if (r7.equals("ReactionComponentsPaginationHandler")) {
                        return 2592;
                    }
                    break;
                case 1508:
                    if (r7.equals("PaymentInvoiceProductCustomization")) {
                        return 2350;
                    }
                    if (r7.equals("PlaceListUserCreatedRecommendation")) {
                        return 2406;
                    }
                    break;
                case 1510:
                    if (r7.equals("ESMServiceCaseTypeCategory")) {
                        return 789;
                    }
                    if (r7.equals("PageGrayBadgeDeprecationNotification")) {
                        return 2238;
                    }
                    if (r7.equals("ParentApprovedGroupContactSuggestion")) {
                        return 2314;
                    }
                    if (r7.equals("Photo")) {
                        return 2398;
                    }
                    break;
                case 1511:
                    if (r7.equals("TalentShow")) {
                        return 3158;
                    }
                    break;
                case 1512:
                    if (r7.equals("PlaceDemographicsLocalDashboardSection")) {
                        return 2403;
                    }
                    if (r7.equals("ProdResumeReviewFeedbackDecisionReason")) {
                        return 2477;
                    }
                    break;
                case 1513:
                    if (r7.equals("PageInfo")) {
                        return 2239;
                    }
                    if (r7.equals("ProdAutoCandidateAvailabilityInvitation")) {
                        return 2450;
                    }
                    if (r7.equals("ProductInsightsMediaBreakdownConnection")) {
                        return 2492;
                    }
                    break;
                case 1515:
                    if (r7.equals("PayoutInfo")) {
                        return 2362;
                    }
                    if (r7.equals("ReceivedTips")) {
                        return 2607;
                    }
                    break;
                case 1517:
                    if (r7.equals("ESMFormResponseDataChangeActivity")) {
                        return 760;
                    }
                    if (r7.equals("ESMServiceCaseInvolvementActivity")) {
                        return 778;
                    }
                    if (r7.equals("ESMServiceCaseOwnerChangeActivity")) {
                        return 779;
                    }
                    if (r7.equals("ESMServiceCaseTitleChangeActivity")) {
                        return 787;
                    }
                    if (r7.equals("EmployeeCheckupCrisisUserActivity")) {
                        return 814;
                    }
                    if (r7.equals("LegalTag")) {
                        return 1533;
                    }
                    if (r7.equals("NativeMask")) {
                        return 2069;
                    }
                    if (r7.equals("ProfileVideo")) {
                        return 2543;
                    }
                    break;
                case 1518:
                    if (r7.equals("PageAdminInfo")) {
                        return 2212;
                    }
                    if (r7.equals("ProductInsightsMediaOwnerBreakdownConnection")) {
                        return 2493;
                    }
                    break;
                case 1520:
                    if (r7.equals("ESMServiceCasePriorityChangeActivity")) {
                        return 780;
                    }
                    break;
                case 1521:
                    if (r7.equals("LDPAppConfig")) {
                        return 1455;
                    }
                    if (r7.equals("NextVendorTask")) {
                        return 2099;
                    }
                    if (r7.equals("TransactionEngineRow")) {
                        return 3229;
                    }
                    break;
                case 1522:
                    if (r7.equals("ESMServiceCaseAddedInvolvementActivity")) {
                        return 775;
                    }
                    if (r7.equals("RSGScreenedEntities")) {
                        return 2579;
                    }
                    break;
                case 1523:
                    if (r7.equals("ESMServiceCaseSubscribersChangeActivity")) {
                        return 784;
                    }
                    break;
                case 1524:
                    if (r7.equals("Actor")) {
                        return 91;
                    }
                    if (r7.equals("ESMServiceCaseRelatedCasesChangeActivity")) {
                        return 781;
                    }
                    if (r7.equals("LocationSharing")) {
                        return 1600;
                    }
                    break;
                case 1525:
                    if (r7.equals("Avatar")) {
                        return 287;
                    }
                    break;
                case 1526:
                    if (r7.equals("RSGTestScreenedEntities")) {
                        return 2580;
                    }
                    break;
                case 1527:
                    if (r7.equals("AdFilter")) {
                        return 127;
                    }
                    if (r7.equals("NeoShepherdGroupLink")) {
                        return 2088;
                    }
                    if (r7.equals("PageRecommendationInfo")) {
                        return 2265;
                    }
                    if (r7.equals("ProductTaxonomySEOInfo")) {
                        return 2506;
                    }
                    if (r7.equals("ReactionUnitUserSettings")) {
                        return 2604;
                    }
                    break;
                case 1528:
                    if (r7.equals("LetterboxFileConfig")) {
                        return 1543;
                    }
                    break;
                case 1529:
                    if (r7.equals("LetterboxSWIFTConfig")) {
                        return 1548;
                    }
                    if (r7.equals("PageTransparencyPageInfo")) {
                        return 2284;
                    }
                    if (r7.equals("PagesPlatformLeadGenInfo")) {
                        return 2303;
                    }
                    break;
                case 1531:
                    if (r7.equals("LeadNotificationConfig")) {
                        return 1487;
                    }
                    break;
                case 1532:
                    if (r7.equals("Authenticator")) {
                        return 279;
                    }
                    if (r7.equals("AvatarSticker")) {
                        return 298;
                    }
                    break;
                case 1533:
                    if (r7.equals("AMCTicketOrder")) {
                        return 8;
                    }
                    if (r7.equals("AdsCouponOffer")) {
                        return 153;
                    }
                    if (r7.equals("AdsDataPartner")) {
                        return 154;
                    }
                    if (r7.equals("LetterboxSFTPActorConfig")) {
                        return 1546;
                    }
                    if (r7.equals("PrivacyReviewCoreCheckupInfo")) {
                        return 2443;
                    }
                    if (r7.equals("ReactionAcornTVContentSettings")) {
                        return 2590;
                    }
                    break;
                case 1534:
                    if (r7.equals("LetterboxEncryptionConfig")) {
                        return 1542;
                    }
                    if (r7.equals("LetterboxSWIFTActorConfig")) {
                        return 1547;
                    }
                    if (r7.equals("ResearchOffPlatformParticipants")) {
                        return 2634;
                    }
                    break;
                case 1535:
                    if (r7.equals("AlohaDeviceOwner")) {
                        return 207;
                    }
                    if (r7.equals("ProductItemNegotiablePriceInfo")) {
                        return 2496;
                    }
                    break;
                case 1536:
                    if (r7.equals("LiveChatCustomizationConfig")) {
                        return 1556;
                    }
                    if (r7.equals("LiveVideoQuickCommentConfig")) {
                        return 1575;
                    }
                    break;
                case 1537:
                    if (r7.equals("ReactionAcornSportsContentSettings")) {
                        return 2589;
                    }
                    break;
                case 1538:
                    if (r7.equals("AuthorBlockBehavior")) {
                        return 281;
                    }
                    break;
                case 1539:
                    if (r7.equals("Robot")) {
                        return 2658;
                    }
                    break;
                case 1540:
                    if (r7.equals("AdvAQueryTraceCluster")) {
                        return 172;
                    }
                    break;
                case 1541:
                    if (r7.equals("LeadGenPostSubmissionCheckConfig")) {
                        return 1479;
                    }
                    break;
                case 1544:
                    if (r7.equals("AdsAudienceBuilderPartner")) {
                        return 150;
                    }
                    break;
                case 1545:
                    if (r7.equals("RideRequest")) {
                        return 2655;
                    }
                    break;
                case 1548:
                    if (r7.equals("ProductGroup")) {
                        return 2490;
                    }
                    break;
                case 1552:
                    if (r7.equals("PrivacyReviewTip")) {
                        return 2445;
                    }
                    if (r7.equals("RTCMediaAudioAsset")) {
                        return 2583;
                    }
                    if (r7.equals("RTCMediaVideoAsset")) {
                        return 2584;
                    }
                    if (r7.equals("ResearchDepartment")) {
                        return 2631;
                    }
                    if (r7.equals("RobotCalendarEvent")) {
                        return 2660;
                    }
                    break;
                case 1553:
                    if (r7.equals("PollItemVideoClip")) {
                        return 2421;
                    }
                    if (r7.equals("ProdInterviewLoop")) {
                        return 2462;
                    }
                    if (r7.equals("ProgramMembership")) {
                        return 2545;
                    }
                    if (r7.equals("RegexMatchRuleInput")) {
                        return 2621;
                    }
                    if (r7.equals("RelatedAppsFeedUnit")) {
                        return 2622;
                    }
                    break;
                case 1554:
                    if (r7.equals("RapidReportingPrompt")) {
                        return 2587;
                    }
                    if (r7.equals("ResearchPollFeedUnit")) {
                        return 2639;
                    }
                    break;
                case 1555:
                    if (r7.equals("ReactionPageAboutUnit")) {
                        return 2601;
                    }
                    break;
                case 1556:
                    if (r7.equals("ReactionComponentsUnit")) {
                        return 2594;
                    }
                    break;
                case 1557:
                    if (r7.equals("PrivacyReviewCoreStep")) {
                        return 2444;
                    }
                    break;
                case 1558:
                    if (r7.equals("ReactionCustomClientUnit")) {
                        return 2595;
                    }
                    break;
                case 1559:
                    if (r7.equals("ClaimReview")) {
                        return 494;
                    }
                    break;
                case 1560:
                    if (r7.equals("AdBusiness")) {
                        return 117;
                    }
                    if (r7.equals("CriticReview")) {
                        return 648;
                    }
                    break;
                case 1561:
                    if (r7.equals("ReactionSimpleAggregateUnit")) {
                        return 2602;
                    }
                    break;
                case 1562:
                    if (r7.equals("ReactionGravityPageAboutUnit")) {
                        return 2600;
                    }
                    break;
                case 1563:
                    if (r7.equals("AdColumnSizes")) {
                        return 120;
                    }
                    if (r7.equals("AgoraSettings")) {
                        return 182;
                    }
                    if (r7.equals("CodingInterview")) {
                        return 518;
                    }
                    break;
                case 1564:
                    if (r7.equals("AdsPreferences")) {
                        return 163;
                    }
                    if (r7.equals("RapidReportingEntryPointPrompt")) {
                        return 2586;
                    }
                    break;
                case 1568:
                    if (r7.equals("ReactionDiscoverySingleProfileUnit")) {
                        return 2598;
                    }
                    break;
                case 1570:
                    if (r7.equals("ProcureToPayCorrespondenceFollowUp")) {
                        return 2447;
                    }
                    break;
                case 1571:
                    if (r7.equals("ALDoubleCheckSettings")) {
                        return 7;
                    }
                    if (r7.equals("ReactionDiscoverySingleSportsGameUnit")) {
                        return 2599;
                    }
                    break;
                case 1573:
                    if (r7.equals("AuthorPublisherSettings")) {
                        return 282;
                    }
                    break;
                case 1574:
                    if (r7.equals("PageFAQ")) {
                        return 2236;
                    }
                    break;
                case 1576:
                    if (r7.equals("ReactionDiscoverySingleOpenGraphObjectUnit")) {
                        return 2597;
                    }
                    break;
                case 1577:
                    if (r7.equals("AcornWeatherContentSettings")) {
                        return 88;
                    }
                    if (r7.equals("ReactionDiscoverySingleMoviesInTheatersUnit")) {
                        return 2596;
                    }
                    break;
                case 1578:
                    if (r7.equals("AdsReportBuilderUserSettings")) {
                        return 166;
                    }
                    break;
                case 1579:
                    if (r7.equals("TaggableActivity")) {
                        return 3149;
                    }
                    if (r7.equals("TogetherActivity")) {
                        return 3208;
                    }
                    break;
                case 1582:
                    if (r7.equals("TeleprompterDisplay")) {
                        return 3168;
                    }
                    break;
                case 1583:
                    if (r7.equals("AuthenticatableStandaloneBusiness")) {
                        return 277;
                    }
                    if (r7.equals("JobsResume")) {
                        return 1432;
                    }
                    break;
                case 1584:
                    if (r7.equals("TailorSettingsHistory")) {
                        return 3157;
                    }
                    break;
                case 1586:
                    if (r7.equals("TopicCustomizationStory")) {
                        return 3222;
                    }
                    break;
                case 1588:
                    if (r7.equals("AdAsset")) {
                        return 111;
                    }
                    if (r7.equals("AppList")) {
                        return 251;
                    }
                    break;
                case 1589:
                    if (r7.equals("AREffect")) {
                        return 18;
                    }
                    break;
                case 1590:
                    if (r7.equals("AdAccount")) {
                        return 97;
                    }
                    break;
                case 1591:
                    if (r7.equals("AppContent")) {
                        return 247;
                    }
                    if (r7.equals("ArcticPost")) {
                        return 261;
                    }
                    if (r7.equals("JobsCustomResponse")) {
                        return 1430;
                    }
                    if (r7.equals("JobsWorkExperience")) {
                        return 1433;
                    }
                    if (r7.equals("TaggableActivityIconCategory")) {
                        return 3151;
                    }
                    break;
                case 1592:
                    if (r7.equals("AdsInterest")) {
                        return 158;
                    }
                    break;
                case 1593:
                    if (r7.equals("HorizonNuxUserData")) {
                        return 1224;
                    }
                    break;
                case 1594:
                    if (r7.equals("AppCenterList")) {
                        return 246;
                    }
                    if (r7.equals("AssistantList")) {
                        return 272;
                    }
                    break;
                case 1595:
                    if (r7.equals("ARAnnouncement")) {
                        return 9;
                    }
                    if (r7.equals("AdAsyncRequest")) {
                        return 114;
                    }
                    if (r7.equals("HackerCupProblemData")) {
                        return 1199;
                    }
                    break;
                case 1596:
                    if (r7.equals("ARCommerceAsset")) {
                        return 11;
                    }
                    if (r7.equals("ARLibraryScript")) {
                        return 35;
                    }
                    if (r7.equals("AchievementPost")) {
                        return 87;
                    }
                    if (r7.equals("AdsColumnPreset")) {
                        return 152;
                    }
                    if (r7.equals("AppAdLinkTarget")) {
                        return 245;
                    }
                    if (r7.equals("JobsEducationExperience")) {
                        return 1431;
                    }
                    break;
                case 1597:
                    if (r7.equals("ARDynamicContent")) {
                        return 13;
                    }
                    if (r7.equals("AdPromotedObject")) {
                        return 133;
                    }
                    if (r7.equals("AgentItemReceipt")) {
                        return 178;
                    }
                    if (r7.equals("AnalyticsInsight")) {
                        return 236;
                    }
                    if (r7.equals("AutomatedInsight")) {
                        return 284;
                    }
                    break;
                case 1598:
                    if (r7.equals("ARLibrary3DObject")) {
                        return 26;
                    }
                    if (r7.equals("AdAsyncRequestSet")) {
                        return 115;
                    }
                    if (r7.equals("AlohaAbilityAsset")) {
                        return 197;
                    }
                    break;
                case 1599:
                    if (r7.equals("AdSensitiveContext")) {
                        return 139;
                    }
                    if (r7.equals("AddressBookContact")) {
                        return 144;
                    }
                    if (r7.equals("AgoraCommunityPost")) {
                        return 180;
                    }
                    if (r7.equals("ApplicationHubList")) {
                        return 259;
                    }
                    if (r7.equals("ApplicationRequest")) {
                        return 260;
                    }
                    if (r7.equals("ArcticPostFeedUnit")) {
                        return 262;
                    }
                    break;
                case 1600:
                    if (r7.equals("JobsCertificationExperience")) {
                        return 1428;
                    }
                    break;
                case 1601:
                    if (r7.equals("AnalyticsUserContext")) {
                        return 244;
                    }
                    break;
                case 1602:
                    if (r7.equals("AnalyticsStoredCohort")) {
                        return 240;
                    }
                    break;
                case 1603:
                    if (r7.equals("ActorGatewayEnrollment")) {
                        return 93;
                    }
                    if (r7.equals("AnalyticsEntityContext")) {
                        return 234;
                    }
                    if (r7.equals("AnalyticsStoredSegment")) {
                        return 242;
                    }
                    break;
                case 1604:
                    if (r7.equals("ARCommerceDynamicEffect")) {
                        return 12;
                    }
                    if (r7.equals("ArticleChainingFeedUnit")) {
                        return 268;
                    }
                    if (r7.equals("AvatarFeatureAttachment")) {
                        return 293;
                    }
                    if (r7.equals("AwarenessHubNC4Incident")) {
                        return 303;
                    }
                    if (r7.equals("Pulsar")) {
                        return 2556;
                    }
                    break;
                case 1605:
                    if (r7.equals("AdAccountCheckoutPayment")) {
                        return 101;
                    }
                    if (r7.equals("AdPortablePreviewComment")) {
                        return 132;
                    }
                    if (r7.equals("AlohaOwnerAbilityAccount")) {
                        return 219;
                    }
                    break;
                case 1606:
                    if (r7.equals("AllSessionsMatchRuleInput")) {
                        return 195;
                    }
                    break;
                case 1607:
                    if (r7.equals("PageCover")) {
                        return 2230;
                    }
                    break;
                case 1608:
                    if (r7.equals("AdsReportBuilderSavedReport")) {
                        return 164;
                    }
                    break;
                case 1609:
                    if (r7.equals("PhoneNumber")) {
                        return 2397;
                    }
                    if (r7.equals("PollSticker")) {
                        return 2422;
                    }
                    break;
                case 1610:
                    if (r7.equals("PageCustomer")) {
                        return 2235;
                    }
                    break;
                case 1611:
                    if (r7.equals("AdsReportBuilderSnapshotReport")) {
                        return 165;
                    }
                    if (r7.equals("AirlineUpdateMessageAttachment")) {
                        return 192;
                    }
                    if (r7.equals("PresenceOwner")) {
                        return 2433;
                    }
                    if (r7.equals("ProductAnswer")) {
                        return 2484;
                    }
                    break;
                case 1612:
                    if (r7.equals("AnalyticsStoredAggregationChart")) {
                        return 238;
                    }
                    if (r7.equals("Notification")) {
                        return 2115;
                    }
                    if (r7.equals("PaymentCLOUser")) {
                        return 2345;
                    }
                    if (r7.equals("ProdAmbassador")) {
                        return 2449;
                    }
                    break;
                case 1613:
                    if (r7.equals("AlohaIdentityOwnerAbilityAccount")) {
                        return 218;
                    }
                    if (r7.equals("PaymentCLOOffer")) {
                        return 2342;
                    }
                    if (r7.equals("PreloadsPartner")) {
                        return 2429;
                    }
                    break;
                case 1614:
                    if (r7.equals("AirlineItineraryMessageAttachment")) {
                        return 190;
                    }
                    if (r7.equals("PlatformTestUser")) {
                        return 2410;
                    }
                    if (r7.equals("PoliticalChamber")) {
                        return 2415;
                    }
                    if (r7.equals("ProductItemOffer")) {
                        return 2497;
                    }
                    break;
                case 1615:
                    if (r7.equals("PageCommItemOwner")) {
                        return 2223;
                    }
                    if (r7.equals("PageReferralOffer")) {
                        return 2267;
                    }
                    break;
                case 1616:
                    if (r7.equals("AutomaticMetricFeedUnitEventContext")) {
                        return 286;
                    }
                    if (r7.equals("NewsQuizQuestion")) {
                        return 2096;
                    }
                    if (r7.equals("PageWhatsAppNumber")) {
                        return 2288;
                    }
                    if (r7.equals("PayToAccessCreator")) {
                        return 2332;
                    }
                    if (r7.equals("PeerToPeerTransfer")) {
                        return 2372;
                    }
                    if (r7.equals("ProductItemCluster")) {
                        return 2495;
                    }
                    break;
                case 1617:
                    if (r7.equals("AirlineBoardingPassMessageAttachment")) {
                        return 188;
                    }
                    if (r7.equals("Country")) {
                        return 616;
                    }
                    if (r7.equals("PageContactReminder")) {
                        return 2227;
                    }
                    if (r7.equals("PelicanFirmwareTier")) {
                        return 2376;
                    }
                    if (r7.equals("PremiumMediaPartner")) {
                        return 2430;
                    }
                    break;
                case 1619:
                    if (r7.equals("ParticleEffectEmitter")) {
                        return 2323;
                    }
                    break;
                case 1620:
                    if (r7.equals("AirlineCheckInReminderMessageAttachment")) {
                        return 189;
                    }
                    break;
                case 1621:
                    if (r7.equals("AirlineItinerarySegmentMessageAttachment")) {
                        return 191;
                    }
                    break;
                case 1622:
                    if (r7.equals("NegativeFeedbackAction")) {
                        return 2071;
                    }
                    break;
                case 1623:
                    if (r7.equals("CfcTopicStory")) {
                        return 480;
                    }
                    if (r7.equals("HaloViewpointsJob")) {
                        return 1208;
                    }
                    break;
                case 1624:
                    if (r7.equals("NegativeFeedbackNTAction")) {
                        return 2074;
                    }
                    if (r7.equals("NewsPublisherApplication")) {
                        return 2094;
                    }
                    if (r7.equals("PagesPlatformFandangoOrder")) {
                        return 2299;
                    }
                    break;
                case 1625:
                    if (r7.equals("CustomizedStory")) {
                        return 658;
                    }
                    break;
                case 1626:
                    if (r7.equals("CurrencyQuantity")) {
                        return 653;
                    }
                    if (r7.equals("PagesMessengerThreadReminder")) {
                        return 2293;
                    }
                    break;
                case 1627:
                    if (r7.equals("CosmosTagTaxonomy")) {
                        return 614;
                    }
                    break;
                case 1628:
                    if (r7.equals("CameraEffectsQuery")) {
                        return 467;
                    }
                    if (r7.equals("ProdUsabilityTaskSuccessMarker")) {
                        return 2482;
                    }
                    break;
                case 1629:
                    if (r7.equals("NegativeFeedbackMessageAction")) {
                        return 2073;
                    }
                    break;
                case 1630:
                    if (r7.equals("NegativeFeedbackRedirectAction")) {
                        return 2075;
                    }
                    if (r7.equals("PoliticianCampaignQuestionAnswer")) {
                        return 2419;
                    }
                    break;
                case 1631:
                    if (r7.equals("CommerceTaxonCategory")) {
                        return 557;
                    }
                    break;
                case 1632:
                    if (r7.equals("ConnectedTVSearchQuery")) {
                        return 589;
                    }
                    break;
                case 1634:
                    if (r7.equals("CHElvesWarehouseCapacity")) {
                        return 452;
                    }
                    break;
                case 1636:
                    if (r7.equals("CommerceUserProductHistory")) {
                        return 558;
                    }
                    if (r7.equals("CulturalMomentImageOverlay")) {
                        return 651;
                    }
                    break;
                case 1637:
                    if (r7.equals("CustomFundraiserBeneficiary")) {
                        return 656;
                    }
                    if (r7.equals("ProdCandidateCometReviewSessionReviewer")) {
                        return 2455;
                    }
                    break;
                case 1640:
                    if (r7.equals("RobotWorkflow")) {
                        return 2672;
                    }
                    break;
                case 1641:
                    if (r7.equals("JobTag")) {
                        return 1425;
                    }
                    break;
                case 1642:
                    if (r7.equals("CompassCuratedUnitElementHistory")) {
                        return 574;
                    }
                    if (r7.equals("CompassCuratedUnitVersionHistory")) {
                        return 578;
                    }
                    if (r7.equals("ProfileStatus")) {
                        return 2541;
                    }
                    break;
                case 1643:
                    if (r7.equals("NeoEventInfo")) {
                        return 2084;
                    }
                    if (r7.equals("PaymentAddress")) {
                        return 2339;
                    }
                    break;
                case 1645:
                    if (r7.equals("JobOpening")) {
                        return 1422;
                    }
                    if (r7.equals("PersonTempStatus")) {
                        return 2394;
                    }
                    if (r7.equals("ProgramsInsights")) {
                        return 2546;
                    }
                    break;
                case 1646:
                    if (r7.equals("ProdMergedAddress")) {
                        return 2465;
                    }
                    break;
                case ReactTextInputManager.IME_ACTION_ID:
                    if (r7.equals("CompassCuratedUnitVersionStatusHistory")) {
                        return 579;
                    }
                    break;
                case 1649:
                    if (r7.equals("PolyglotUserProgress")) {
                        return 2423;
                    }
                    break;
                case 1651:
                    if (r7.equals("ProfileAutofillAddress")) {
                        return 2510;
                    }
                    break;
                case 1652:
                    if (r7.equals("ProfileTimewallSettings")) {
                        return 2542;
                    }
                    break;
                case 1653:
                    if (r7.equals("LeonTakedownFeedback")) {
                        return 1535;
                    }
                    if (r7.equals("PageInsightsPageSettings")) {
                        return 2241;
                    }
                    break;
                case 1654:
                    if (r7.equals("LegalMatterMatterLink")) {
                        return 1517;
                    }
                    if (r7.equals("LetterboxBusinessLink")) {
                        return 1537;
                    }
                    break;
                case 1655:
                    if (r7.equals("ParentApprovedUserFeatures")) {
                        return 2315;
                    }
                    if (r7.equals("PrivacyCheckupInteractions")) {
                        return 2437;
                    }
                    break;
                case 1656:
                    if (r7.equals("PMAPushNotificationSettings")) {
                        return 2204;
                    }
                    if (r7.equals("PresenceViewerBasedSettings")) {
                        return 2434;
                    }
                    break;
                case 1662:
                    if (r7.equals("ProdRecruitingCalendarPreferences")) {
                        return 2473;
                    }
                    break;
                case 1665:
                    if (r7.equals("PageInsightsPageSpecificUserSettings")) {
                        return 2242;
                    }
                    break;
                case 1667:
                    if (r7.equals("Payment")) {
                        return 2334;
                    }
                    if (r7.equals("Podcast")) {
                        return 2412;
                    }
                    break;
                case 1669:
                    if (r7.equals("PlaceList")) {
                        return 2404;
                    }
                    break;
                case 1670:
                    if (r7.equals("PlaceVisit")) {
                        return 2408;
                    }
                    if (r7.equals("ProductSet")) {
                        return 2503;
                    }
                    break;
                case 1671:
                    if (r7.equals("PageContact")) {
                        return 2226;
                    }
                    if (r7.equals("PageProduct")) {
                        return 2258;
                    }
                    break;
                case 1672:
                    if (r7.equals("PSDAgreement")) {
                        return 2209;
                    }
                    break;
                case 1673:
                    if (r7.equals("PageBroadcast")) {
                        return 2217;
                    }
                    break;
                case 1674:
                    if (r7.equals("PanelAPIReport")) {
                        return 2311;
                    }
                    if (r7.equals("ParticleEffect")) {
                        return 2320;
                    }
                    if (r7.equals("PayoutContract")) {
                        return 2360;
                    }
                    if (r7.equals("PelicanProject")) {
                        return 2381;
                    }
                    break;
                case 1675:
                    if (r7.equals("JobSearch")) {
                        return 1423;
                    }
                    if (r7.equals("PageProductList")) {
                        return 2259;
                    }
                    if (r7.equals("ProductDiscount")) {
                        return 2488;
                    }
                    break;
                case 1676:
                    if (r7.equals("PageCommItemPart")) {
                        return 2224;
                    }
                    if (r7.equals("PendingPlaceSlot")) {
                        return 2384;
                    }
                    if (r7.equals("PermissionResult")) {
                        return 2392;
                    }
                    if (r7.equals("ProductionPrompt")) {
                        return 2507;
                    }
                    break;
                case 1677:
                    if (r7.equals("LiveVideoPoll")) {
                        return 1571;
                    }
                    if (r7.equals("PartnerPortalPost")) {
                        return 2328;
                    }
                    if (r7.equals("PoliticalDistrict")) {
                        return 2416;
                    }
                    if (r7.equals("PriceScrapeResult")) {
                        return 2435;
                    }
                    break;
                case 1678:
                    if (r7.equals("LivingRoomPoll")) {
                        return 1579;
                    }
                    if (r7.equals("PagePostExperiment")) {
                        return 2257;
                    }
                    if (r7.equals("PartnerPortalEvent")) {
                        return 2326;
                    }
                    if (r7.equals("PartnerSFTPAccount")) {
                        return 2330;
                    }
                    if (r7.equals("PaymentCLOMerchant")) {
                        return 2341;
                    }
                    if (r7.equals("ProfileInfoRequest")) {
                        return 2523;
                    }
                    break;
                case 1679:
                    if (r7.equals("HolidayCard")) {
                        return 1219;
                    }
                    if (r7.equals("PageBroadcastTarget")) {
                        return 2218;
                    }
                    if (r7.equals("PageNameCheckResult")) {
                        return 2254;
                    }
                    if (r7.equals("ParticleEffectAsset")) {
                        return 2322;
                    }
                    if (r7.equals("PelicanGatewayAsset")) {
                        return 2377;
                    }
                    break;
                case 1680:
                    if (r7.equals("PRGPublicVideoReport")) {
                        return 2208;
                    }
                    if (r7.equals("ProfileFrameMediaSet")) {
                        return 2521;
                    }
                    break;
                case 1681:
                    if (r7.equals("LDPAppPageInstall")) {
                        return 1457;
                    }
                    if (r7.equals("PaymentInvoiceProduct")) {
                        return 2349;
                    }
                    break;
                case 1682:
                    if (r7.equals("HackerCupRound")) {
                        return 1200;
                    }
                    if (r7.equals("PaymentInvoiceShipment")) {
                        return 2352;
                    }
                    if (r7.equals("PayoutValidationResult")) {
                        return 2364;
                    }
                    if (r7.equals("PaypalBillingAgreement")) {
                        return 2365;
                    }
                    break;
                case 1683:
                    if (r7.equals("PrivacyMutationEndpoint")) {
                        return 2440;
                    }
                    if (r7.equals("ProductCanonicalConcept")) {
                        return 2485;
                    }
                    break;
                case 1684:
                    if (r7.equals("LiveChallengeChannel")) {
                        return 1555;
                    }
                    if (r7.equals("PageQuestionReactionUnit")) {
                        return 2262;
                    }
                    if (r7.equals("PagesCommerceBuyerIntent")) {
                        return 2290;
                    }
                    if (r7.equals("PeerToPeerPaymentRequest")) {
                        return 2368;
                    }
                    if (r7.equals("ProductLiveStatusProduct")) {
                        return 2500;
                    }
                    if (r7.equals("ProtonArtboardScreenshot")) {
                        return 2548;
                    }
                    if (r7.equals("WatchCMSPremiumPackageMetadata")) {
                        return 3400;
                    }
                    break;
                case 1685:
                    if (r7.equals("PageSuggestCategoryResult")) {
                        return 2276;
                    }
                    if (r7.equals("PaymentPlatformAttachment")) {
                        return 2357;
                    }
                    if (r7.equals("PayoutTINValidationResult")) {
                        return 2363;
                    }
                    if (r7.equals("PeerToPeerPlatformContext")) {
                        return 2369;
                    }
                    if (r7.equals("PeerToPeerTransferContext")) {
                        return 2373;
                    }
                    if (r7.equals("PlayWithFriendsAttachment")) {
                        return 2411;
                    }
                    if (r7.equals("ProductRecommendationList")) {
                        return 2502;
                    }
                    break;
                case 1686:
                    if (r7.equals("LiveLinearVideoChannel")) {
                        return 1559;
                    }
                    if (r7.equals("PartnerPortalReportedEvent")) {
                        return 2329;
                    }
                    if (r7.equals("PeopleYouMayInviteFeedUnit")) {
                        return 2388;
                    }
                    if (r7.equals("ProfileFramePromptFeedUnit")) {
                        return 2522;
                    }
                    if (r7.equals("ProfileOverlayManualBucket")) {
                        return 2533;
                    }
                    if (r7.equals("PublisherBrandAssetVariant")) {
                        return 2551;
                    }
                    break;
                case 1687:
                    if (r7.equals("PageThreadAutomationContext")) {
                        return 2280;
                    }
                    if (r7.equals("ProductsDealsForYouFeedUnit")) {
                        return 2508;
                    }
                    if (r7.equals("ProfileOverlayByOwnerBucket")) {
                        return 2529;
                    }
                    if (r7.equals("ProfileOverlayGeneralBucket")) {
                        return 2532;
                    }
                    break;
                case 1688:
                    if (r7.equals("PartnerHouseholdGraphDataSet")) {
                        return 2325;
                    }
                    if (r7.equals("PaymentSubscriptionAgreement")) {
                        return 2358;
                    }
                    if (r7.equals("ProfileOverlayCategoryBucket")) {
                        return 2531;
                    }
                    break;
                case 1689:
                    if (r7.equals("PathToConversionConstraintSet")) {
                        return 2331;
                    }
                    if (r7.equals("PaymentPaypalBillingAgreement")) {
                        return 2356;
                    }
                    if (r7.equals("PeopleYouShouldFollowFeedUnit")) {
                        return 2390;
                    }
                    if (r7.equals("ProfileDiscoveryBucketContent")) {
                        return 2519;
                    }
                    break;
                case 1690:
                    if (r7.equals("ActorGatewayFlow")) {
                        return 95;
                    }
                    if (r7.equals("LumosOnDeviceDeployedModel")) {
                        return 1620;
                    }
                    break;
                case 1691:
                    if (r7.equals("PageSurveyReactionAggregateUnit")) {
                        return 2279;
                    }
                    break;
                case 1692:
                    if (r7.equals("PaginatedPagesYouMayLikeFeedUnit")) {
                        return 2309;
                    }
                    if (r7.equals("ProdPartnerCenterToolStatusEvent")) {
                        return 2471;
                    }
                    break;
                case 1693:
                    if (r7.equals("PaginatedPeopleYouMayKnowFeedUnit")) {
                        return 2310;
                    }
                    break;
                case 1695:
                    if (r7.equals("PeopleYouShouldFollowAtWorkFeedUnit")) {
                        return 2389;
                    }
                    break;
                case 1696:
                    if (r7.equals("AgreementRecipientView")) {
                        return 183;
                    }
                    if (r7.equals("PaginatedGroupsYouShouldJoinFeedUnit")) {
                        return 2308;
                    }
                    break;
                case 1697:
                    if (r7.equals("PeerToPeerSingleSidedIncentivePayment")) {
                        return 2371;
                    }
                    break;
                case 1700:
                    if (r7.equals("ProductEngagementEndOfFeedUpsellFeedUnit")) {
                        return 2489;
                    }
                    if (r7.equals("RTCActivity")) {
                        return 2582;
                    }
                    break;
                case 1701:
                    if (r7.equals("PaginatedGroupsPeopleYouMayInviteFeedUnit")) {
                        return 2307;
                    }
                    break;
                case 1702:
                    if (r7.equals("ReactionStory")) {
                        return 2603;
                    }
                    break;
                case 1703:
                    if (r7.equals("PageLinkMenu")) {
                        return 2247;
                    }
                    break;
                case 1704:
                    if (r7.equals("PagePhotoMenu")) {
                        return 2256;
                    }
                    break;
                case 1705:
                    if (r7.equals("RobotCalendarDay")) {
                        return 2659;
                    }
                    break;
                case 1706:
                    if (r7.equals("ResearchEthnicity")) {
                        return 2632;
                    }
                    break;
                case 1707:
                    if (r7.equals("ResearchPollSurvey")) {
                        return 2642;
                    }
                    break;
                case 1709:
                    if (r7.equals("LoyaltyProgram")) {
                        return 1612;
                    }
                    if (r7.equals("RobotWorkflowHistory")) {
                        return 2673;
                    }
                    break;
                case 1710:
                    if (r7.equals("LegalMatterTeam")) {
                        return 1527;
                    }
                    break;
                case 1714:
                    if (r7.equals("RecruitingExtractedEntity")) {
                        return 2610;
                    }
                    break;
                case 1715:
                    if (r7.equals("FBFormRuleData")) {
                        return 927;
                    }
                    if (r7.equals("HomeServiceQuote")) {
                        return 1222;
                    }
                    if (r7.equals("LiveVideoInputStream")) {
                        return 1570;
                    }
                    if (r7.equals("RecruitingNormalizedEntity")) {
                        return 2614;
                    }
                    break;
                case 1716:
                    if (r7.equals("LivingRoomContentItem")) {
                        return 1577;
                    }
                    break;
                case 1717:
                    if (r7.equals("FBRecruitingArea")) {
                        return 939;
                    }
                    break;
                case 1718:
                    if (r7.equals("HaloViewpointsQueue")) {
                        return 1209;
                    }
                    break;
                case 1719:
                    if (r7.equals("ActivityLogNUX")) {
                        return 90;
                    }
                    if (r7.equals("FBGroupChatPersona")) {
                        return 933;
                    }
                    break;
                case 1721:
                    if (r7.equals("HaloViewpointsResponse")) {
                        return 1210;
                    }
                    if (r7.equals("HorizonUserBanInstance")) {
                        return 1226;
                    }
                    break;
                case 1722:
                    if (r7.equals("RecruitingNormalizedMappingEntity")) {
                        return 2616;
                    }
                    break;
                case 1723:
                    if (r7.equals("HelpCommunityUserProfile")) {
                        return 1217;
                    }
                    break;
                case 1725:
                    if (r7.equals("LivingRoomSuggestedContentItem")) {
                        return 1582;
                    }
                    break;
                case 1726:
                    if (r7.equals("FBGroupChatPublicMetadata")) {
                        return 934;
                    }
                    break;
                case 1727:
                    if (r7.equals("HealthGroupContextualProfile")) {
                        return 1213;
                    }
                    break;
                case 1728:
                    if (r7.equals("LiveLinearVideoChannelContentItem")) {
                        return 1560;
                    }
                    break;
                case 1732:
                    if (r7.equals("FBGroupChatThreadPublicMetadata")) {
                        return 935;
                    }
                    break;
                case 1735:
                    if (r7.equals("HackerCupClarificationRequestMessage")) {
                        return 1195;
                    }
                    if (r7.equals("NPEMemeUser")) {
                        return 2058;
                    }
                    break;
                case 1738:
                    if (r7.equals("NewsQuizAnswer")) {
                        return 2095;
                    }
                    break;
                case 1739:
                    if (r7.equals("LegalFMOption")) {
                        return 1498;
                    }
                    if (r7.equals("LocalElection")) {
                        return 1589;
                    }
                    if (r7.equals("NeoApprovedUser")) {
                        return 2080;
                    }
                    break;
                case 1740:
                    if (r7.equals("LegalFMSection")) {
                        return 1499;
                    }
                    break;
                case 1741:
                    if (r7.equals("LeadGenQuestion")) {
                        return 1483;
                    }
                    break;
                case 1742:
                    if (r7.equals("LegalApplication")) {
                        return 1493;
                    }
                    break;
                case 1743:
                    if (r7.equals("AdStudy")) {
                        return 140;
                    }
                    if (r7.equals("LightweightAction")) {
                        return 1551;
                    }
                    if (r7.equals("LivingRoomSession")) {
                        return 1581;
                    }
                    break;
                case 1744:
                    if (r7.equals("LegalMatterVersion")) {
                        return 1528;
                    }
                    if (r7.equals("LiveChatOnlyPerson")) {
                        return 1557;
                    }
                    if (r7.equals("NegotiablePriceOffer")) {
                        return 2077;
                    }
                    break;
                case 1746:
                    if (r7.equals("LivingRoomPollOption")) {
                        return 1580;
                    }
                    break;
                case 1748:
                    if (r7.equals("AtlasCompany")) {
                        return 274;
                    }
                    break;
                case 1750:
                    if (r7.equals("AdPartnerStudy")) {
                        return 130;
                    }
                    if (r7.equals("AvatarGeometry")) {
                        return 296;
                    }
                    if (r7.equals("LegalMatterEntityVersion")) {
                        return 1510;
                    }
                    break;
                case 1751:
                    if (r7.equals("AlohaCapability")) {
                        return 204;
                    }
                    if (r7.equals("LegalMatterContactVersion")) {
                        return 1504;
                    }
                    break;
                case 1752:
                    if (r7.equals("LetterboxProcessingSession")) {
                        return 1544;
                    }
                    if (r7.equals("NmorPPGFDonationPaymentOrder")) {
                        return 2107;
                    }
                    break;
                case 1753:
                    if (r7.equals("ACEFeedbackSurvey")) {
                        return 2;
                    }
                    if (r7.equals("AirbenderCategory")) {
                        return 185;
                    }
                    if (r7.equals("AlohaBasicAbility")) {
                        return 201;
                    }
                    break;
                case 1754:
                    if (r7.equals("AlohaUserProximity")) {
                        return 226;
                    }
                    if (r7.equals("LoyaltyOneTimeRewardCampaign")) {
                        return 1611;
                    }
                    break;
                case 1755:
                    if (r7.equals("AdsIDSIssueTaxonomy")) {
                        return 157;
                    }
                    if (r7.equals("NmorDonationP4CTransactionOrder")) {
                        return 2104;
                    }
                    if (r7.equals("NmorDonationP4PTransactionOrder")) {
                        return 2105;
                    }
                    break;
                case 1756:
                    if (r7.equals("AlohaExternalAbility")) {
                        return 208;
                    }
                    break;
                case 1758:
                    if (r7.equals("LegalMatterDocumentFolderVersion")) {
                        return 1508;
                    }
                    break;
                case 1759:
                    if (r7.equals("LegalMatterFinancialImpactVersion")) {
                        return 1514;
                    }
                    if (r7.equals("LocationHistoryTimelineConnection")) {
                        return 1593;
                    }
                    break;
                case 1762:
                    if (r7.equals("WorkstreamField")) {
                        return 3552;
                    }
                    break;
                case 1764:
                    if (r7.equals("NmorBlackbaudRWRDonationTransactionOrder")) {
                        return 2102;
                    }
                    break;
                case 1765:
                    if (r7.equals("NewsStatus")) {
                        return 2098;
                    }
                    break;
                case 1767:
                    if (r7.equals("LegalMatterOutsideCounselDiversityVersion")) {
                        return 1521;
                    }
                    break;
                case 1768:
                    if (r7.equals("AuthenticatableFreeFormOrgEntity")) {
                        return 276;
                    }
                    if (r7.equals("Hashtag")) {
                        return 1212;
                    }
                    break;
                case 1769:
                    if (r7.equals("AuthenticatableFECCommitteeEntity")) {
                        return 275;
                    }
                    if (r7.equals("AuthenticatableUSGovernmentEntity")) {
                        return 278;
                    }
                    if (r7.equals("WatchCMSMutationRecord")) {
                        return 3397;
                    }
                    break;
                case 1772:
                    if (r7.equals("HomeListing")) {
                        return 1220;
                    }
                    if (r7.equals("WhitehatPrivateBountyProd")) {
                        return 3418;
                    }
                    break;
                case 1773:
                    if (r7.equals("LumosPrivacyInfo")) {
                        return 1621;
                    }
                    if (r7.equals("WYSIWIGInlineCommentThread")) {
                        return 3380;
                    }
                    break;
                case 1774:
                    if (r7.equals("PageReferralOfferFlow")) {
                        return 2268;
                    }
                    break;
                case 1775:
                    if (r7.equals("LearningCourseInfo")) {
                        return 1490;
                    }
                    break;
                case 1778:
                    if (r7.equals("NearbyFriendsUserStatus")) {
                        return 2070;
                    }
                    break;
                case 1779:
                    if (r7.equals("PagesPlatformComponentFlow")) {
                        return 2297;
                    }
                    if (r7.equals("WorkplaceExistingMessengerThread")) {
                        return 3539;
                    }
                    break;
                case 1780:
                    if (r7.equals("LoyaltyCardExternalInfo")) {
                        return 1608;
                    }
                    break;
                case 1781:
                    if (r7.equals("HotspotHelperSetting")) {
                        return 1230;
                    }
                    if (r7.equals("NewsOCTAutoResolveSettings")) {
                        return 2093;
                    }
                    break;
                case 1782:
                    if (r7.equals("WorkplaceNonExistingMessengerThread")) {
                        return 3542;
                    }
                    break;
                case 1788:
                    if (r7.equals("WECMessage")) {
                        return 3375;
                    }
                    break;
                case 1790:
                    if (r7.equals("WatchCMSNote")) {
                        return 3398;
                    }
                    break;
                case 1791:
                    if (r7.equals("LeadGenDependentQuestionStaticInfo")) {
                        return 1474;
                    }
                    if (r7.equals("WatchCMSTable")) {
                        return 3404;
                    }
                    break;
                case 1792:
                    if (r7.equals("LeadGenDependentQuestionDynamicInfo")) {
                        return 1473;
                    }
                    if (r7.equals("WECMessageFile")) {
                        return 3377;
                    }
                    if (r7.equals("WorkExperience")) {
                        return 3467;
                    }
                    if (r7.equals("WorkstreamFile")) {
                        return 3553;
                    }
                    break;
                case 1793:
                    if (r7.equals("WECMessageImage")) {
                        return 3378;
                    }
                    if (r7.equals("WatchCMSEpisode")) {
                        return 3391;
                    }
                    if (r7.equals("WhitehatMessage")) {
                        return 3416;
                    }
                    if (r7.equals("WorkstreamStage")) {
                        return 3555;
                    }
                    break;
                case 1794:
                    if (r7.equals("WatchCMSSchedule")) {
                        return 3402;
                    }
                    if (r7.equals("WorkMeetingSpace")) {
                        return 3489;
                    }
                    if (r7.equals("WorkOculusDevice")) {
                        return 3509;
                    }
                    break;
                case 1795:
                    if (r7.equals("WorkKnowledgeFile")) {
                        return 3486;
                    }
                    break;
                case 1796:
                    if (r7.equals("WorkstreamInstance")) {
                        return 3554;
                    }
                    break;
                case 1797:
                    if (r7.equals("NmorPayment")) {
                        return 2108;
                    }
                    break;
                case 1799:
                    if (r7.equals("WorkDefaultGroupsRule")) {
                        return 3454;
                    }
                    if (r7.equals("WorkKnowledgeAudience")) {
                        return 3479;
                    }
                    if (r7.equals("WorkProjectExperience")) {
                        return 3513;
                    }
                    if (r7.equals("WorkplaceExternalCase")) {
                        return 3540;
                    }
                    break;
                case 1800:
                    if (r7.equals("NewsQuizResult")) {
                        return 2097;
                    }
                    if (r7.equals("WorkOAuthCompanyNotice")) {
                        return 3508;
                    }
                    break;
                case 1801:
                    if (r7.equals("WhatsAppBusinessProfile")) {
                        return 3412;
                    }
                    if (r7.equals("WorkSafetyCheckTemplate")) {
                        return 3522;
                    }
                    break;
                case 1802:
                    if (r7.equals("NeoFriendRequest")) {
                        return 2085;
                    }
                    break;
                case 1803:
                    if (r7.equals("NativeAPKArtifact")) {
                        return 2065;
                    }
                    if (r7.equals("WorkCustomPermissionsRole")) {
                        return 3452;
                    }
                    break;
                case 1804:
                    if (r7.equals("WatchCMSDealEngagementType")) {
                        return 3390;
                    }
                    if (r7.equals("WorkDefaultPermissionsRole")) {
                        return 3455;
                    }
                    if (r7.equals("WorkGroupContextualProfile")) {
                        return 3472;
                    }
                    break;
                case 1805:
                    if (r7.equals("WorkKnowledgeCustomHomePage")) {
                        return 3482;
                    }
                    break;
                case 1806:
                    if (r7.equals("LegalFMElementProp")) {
                        return 1494;
                    }
                    if (r7.equals("NmorIncentivePayment")) {
                        return 2106;
                    }
                    if (r7.equals("WorkResellerNewCompanyInvite")) {
                        return 3517;
                    }
                    if (r7.equals("WorkUserDoNotDisturbSchedule")) {
                        return 3535;
                    }
                    break;
                case 1807:
                    if (r7.equals("WorkPromotedPostCompanyNotice")) {
                        return 3514;
                    }
                    break;
                case 1808:
                    if (r7.equals("WorkAccessRequestCompanyNotice")) {
                        return 3427;
                    }
                    if (r7.equals("WorkContentReportCompanyNotice")) {
                        return 3451;
                    }
                    if (r7.equals("WorkCustomScopedPermissionRole")) {
                        return 3453;
                    }
                    if (r7.equals("WorkDeviceITAPNewCompanyInvite")) {
                        return 3460;
                    }
                    if (r7.equals("WorkResellerExistingUserInvite")) {
                        return 3515;
                    }
                    break;
                case 1809:
                    if (r7.equals("NlpSignalMatchRuleInput")) {
                        return 2101;
                    }
                    break;
                case 1810:
                    if (r7.equals("LetterboxDocumentGroup")) {
                        return 1540;
                    }
                    if (r7.equals("NlpFeatureMatchRuleInput")) {
                        return 2100;
                    }
                    break;
                case 1811:
                    if (r7.equals("LetterboxProcessingStep")) {
                        return 1545;
                    }
                    break;
                case 1812:
                    if (r7.equals("NTPeopleYouMayKnowFeedUnit")) {
                        return 2063;
                    }
                    break;
                case 1814:
                    if (r7.equals("FoodDrinkOrderRecord")) {
                        return 1009;
                    }
                    break;
                case 1815:
                    if (r7.equals("NTGroupsYouShouldJoinFeedUnit")) {
                        return 2061;
                    }
                    if (r7.equals("NeoApprovedUserFeatureRequest")) {
                        return 2081;
                    }
                    if (r7.equals("WorkEmployeeAnnouncementCompanyNotice")) {
                        return 3465;
                    }
                    break;
                case 1816:
                    if (r7.equals("NativeAndroidAppModuleArtifact")) {
                        return 2066;
                    }
                    break;
                case 1818:
                    if (r7.equals("WorkDeviceITAPExistingCompanyOrderInvite")) {
                        return 3459;
                    }
                    break;
                case 1819:
                    if (r7.equals("NativeComponentFlowBookingRequest")) {
                        return 2067;
                    }
                    if (r7.equals("ProactiveHackedDisputedSupportInbox")) {
                        return 2446;
                    }
                    break;
                case 1821:
                    if (r7.equals("FTCNeutralEnforcementRecord")) {
                        return 954;
                    }
                    if (r7.equals("NTMarketplaceThemesToFollowFeedUnit")) {
                        return 2062;
                    }
                    break;
                case 1824:
                    if (r7.equals("PageStory")) {
                        return 2275;
                    }
                    break;
                case 1825:
                    if (r7.equals("PageSurvey")) {
                        return 2278;
                    }
                    break;
                case 1827:
                    if (r7.equals("PageCategory")) {
                        return 2220;
                    }
                    if (r7.equals("PartialStory")) {
                        return 2319;
                    }
                    break;
                case 1828:
                    if (r7.equals("ProdJobFamily")) {
                        return 2463;
                    }
                    break;
                case 1829:
                    if (r7.equals("ProfileOverlay")) {
                        return 2528;
                    }
                    break;
                case 1830:
                    if (r7.equals("PelicanActivity")) {
                        return 2374;
                    }
                    break;
                case 1831:
                    if (r7.equals("PaperNuxCategory")) {
                        return 2312;
                    }
                    break;
                case 1832:
                    if (r7.equals("FoxMode")) {
                        return 1017;
                    }
                    if (r7.equals("PageAdminActivity")) {
                        return 2211;
                    }
                    break;
                case 1833:
                    if (r7.equals("FBQRCode")) {
                        return 938;
                    }
                    if (r7.equals("FDDevice")) {
                        return 951;
                    }
                    if (r7.equals("PurchasingCategory")) {
                        return 2557;
                    }
                    break;
                case 1835:
                    if (r7.equals("FBFormRule")) {
                        return 926;
                    }
                    if (r7.equals("FBSService")) {
                        return 947;
                    }
                    break;
                case 1836:
                    if (r7.equals("PageSuggestedCategory")) {
                        return 2277;
                    }
                    break;
                case 1837:
                    if (r7.equals("ProfileOverlayCategory")) {
                        return 2530;
                    }
                    break;
                case 1838:
                    if (r7.equals("FBCMGeoCircle")) {
                        return 907;
                    }
                    if (r7.equals("FreeformPlace")) {
                        return 1023;
                    }
                    break;
                case 1839:
                    if (r7.equals("FBFormInstance")) {
                        return 921;
                    }
                    if (r7.equals("FBLiteNuxState")) {
                        return 937;
                    }
                    if (r7.equals("FundraiserPage")) {
                        return 1044;
                    }
                    break;
                case 1840:
                    if (r7.equals("FBSExternalCase")) {
                        return 946;
                    }
                    if (r7.equals("FacebookFeature")) {
                        return 960;
                    }
                    if (r7.equals("FundraiserCause")) {
                        return 1034;
                    }
                    if (r7.equals("ProdCandidateAvailability")) {
                        return 2452;
                    }
                    if (r7.equals("ProductLiveStatusCategory")) {
                        return 2498;
                    }
                    break;
                case 1843:
                    if (r7.equals("DSCSottoMetadata")) {
                        return 687;
                    }
                    if (r7.equals("DSCVideoMetadata")) {
                        return 688;
                    }
                    if (r7.equals("FbcRemitReaderLine")) {
                        return 979;
                    }
                    if (r7.equals("ProfilePhotoWatermarkOverlay")) {
                        return 2534;
                    }
                    break;
                case 1844:
                    if (r7.equals("DynamicARMetadata")) {
                        return 746;
                    }
                    break;
                case 1846:
                    if (r7.equals("DSCEpisodicMetadata")) {
                        return 670;
                    }
                    if (r7.equals("ProdUsabilityTaskRunEligibility")) {
                        return 2481;
                    }
                    break;
                case 1847:
                    if (r7.equals("DSCOriginalsMetadata")) {
                        return 680;
                    }
                    if (r7.equals("FBFormQuestionResponse")) {
                        return 925;
                    }
                    if (r7.equals("FoodDrinkCustomTaxRate")) {
                        return 1004;
                    }
                    break;
                case 1849:
                    if (r7.equals("FixedCostShippingProfile")) {
                        return 997;
                    }
                    if (r7.equals("FundraiserPersonForCause")) {
                        return 1045;
                    }
                    break;
                case 1851:
                    if (r7.equals("DSCFundedContentMetadata")) {
                        return 671;
                    }
                    if (r7.equals("FBRecruitingReferralResume")) {
                        return 945;
                    }
                    break;
                case 1853:
                    if (r7.equals("PageConnectionQuestionsCustomizedStory")) {
                        return 2225;
                    }
                    break;
                case 1855:
                    if (r7.equals("DSCPremiumMusicVideoMetadata")) {
                        return 683;
                    }
                    if (r7.equals("FBRecruitingReferralPreference")) {
                        return 943;
                    }
                    if (r7.equals("WorkSecurityLog")) {
                        return 3527;
                    }
                    if (r7.equals("WorkroomMeeting")) {
                        return 3546;
                    }
                    break;
                case 1860:
                    if (r7.equals("FundraiserPersonForCharitiesInCause")) {
                        return 1046;
                    }
                    break;
                case 1861:
                    if (r7.equals("LegalMatter")) {
                        return 1501;
                    }
                    if (r7.equals("LoyaltyUser")) {
                        return 1618;
                    }
                    break;
                case 1862:
                    if (r7.equals("WorkDemoTemplateConfig")) {
                        return 3456;
                    }
                    break;
                case 1863:
                    if (r7.equals("LoggedOutUser")) {
                        return 1603;
                    }
                    break;
                case 1864:
                    if (r7.equals("DYIJob")) {
                        return 690;
                    }
                    if (r7.equals("LetterboxActor")) {
                        return 1536;
                    }
                    if (r7.equals("LiveVideoError")) {
                        return 1569;
                    }
                    if (r7.equals("WhatsAppMonthlyInvoicing")) {
                        return 3413;
                    }
                    if (r7.equals("WorkCompanyFeatureConfig")) {
                        return 3444;
                    }
                    if (r7.equals("WorkSurveyMultiRunConfig")) {
                        return 3530;
                    }
                    break;
                case 1865:
                    if (r7.equals("WorkplaceMonthlyInvoicing")) {
                        return 3541;
                    }
                    break;
                case 1866:
                    if (r7.equals("JobApplication")) {
                        return 1420;
                    }
                    break;
                case 1867:
                    if (r7.equals("JobSubscription")) {
                        return 1424;
                    }
                    if (r7.equals("WorkSafetyCrisisEventConfig")) {
                        return 3524;
                    }
                    break;
                case 1868:
                    if (r7.equals("DTPJavaJob")) {
                        return 689;
                    }
                    if (r7.equals("LegalMatterPartner")) {
                        return 1522;
                    }
                    if (r7.equals("LocationSubscriber")) {
                        return 1601;
                    }
                    break;
                case 1869:
                    if (r7.equals("LiveAdBreaksCreator")) {
                        return 1553;
                    }
                    break;
                case 1870:
                    if (r7.equals("DSCDealWatchContentDeliveryScheduleMetadata")) {
                        return 668;
                    }
                    if (r7.equals("JobsCustomQuestion")) {
                        return 1429;
                    }
                    if (r7.equals("LocalCommunityMember")) {
                        return 1584;
                    }
                    break;
                case 1872:
                    if (r7.equals("LeadQuestionAnswerPair")) {
                        return 1489;
                    }
                    break;
                case 1873:
                    if (r7.equals("LetterboxTradingPartner")) {
                        return 1549;
                    }
                    if (r7.equals("LiveTemplateLiveSticker")) {
                        return 1562;
                    }
                    break;
                case 1875:
                    if (r7.equals("LegalMatterDocumentFolder")) {
                        return 1507;
                    }
                    break;
                case 1880:
                    if (r7.equals("LoyaltyUnlinkedPhoneNumberUser")) {
                        return 1617;
                    }
                    break;
                case 1892:
                    if (r7.equals("Doc")) {
                        return 723;
                    }
                    break;
                case 1895:
                    if (r7.equals("LDPAppSettings")) {
                        return 1458;
                    }
                    break;
                case 1898:
                    if (r7.equals("FreeformTag")) {
                        return 1024;
                    }
                    if (r7.equals("LeadGenUserStatus")) {
                        return 1486;
                    }
                    break;
                case 1899:
                    if (r7.equals("JobApplicantInfo")) {
                        return 1419;
                    }
                    break;
                case 1900:
                    if (r7.equals("LoyaltyWelcomeBonus")) {
                        return 1619;
                    }
                    break;
                case 1903:
                    if (r7.equals("HaloViewpointsTask")) {
                        return 1211;
                    }
                    break;
                case 1905:
                    if (r7.equals("LiveVideoChatbotSettings")) {
                        return 1567;
                    }
                    break;
                case 1906:
                    if (r7.equals("LeadGenDeepLinkUserStatus")) {
                        return 1472;
                    }
                    if (r7.equals("LegalMatterPartnerAddress")) {
                        return 1523;
                    }
                    break;
                case 1907:
                    if (r7.equals("FBAppAirbenderConfig")) {
                        return 906;
                    }
                    break;
                case 1909:
                    if (r7.equals("LetterboxEDIFileConfigFields")) {
                        return 1541;
                    }
                    break;
                case 1914:
                    if (r7.equals("LiveClippingAndHighlightsSettings")) {
                        return 1558;
                    }
                    if (r7.equals("ShowData")) {
                        return 2921;
                    }
                    if (r7.equals("StoreRMA")) {
                        return 3048;
                    }
                    break;
                case 1919:
                    if (r7.equals("UserPageProfile")) {
                        return 3285;
                    }
                    break;
                case 1922:
                    if (r7.equals("UserEducationState")) {
                        return 3278;
                    }
                    break;
                case 1923:
                    if (r7.equals("LiveVCEvent")) {
                        return 1563;
                    }
                    break;
                case 1925:
                    if (r7.equals("ServicesLeadGenData")) {
                        return 2904;
                    }
                    if (r7.equals("SportsDataMatchData")) {
                        return 3013;
                    }
                    if (r7.equals("UpcomingScheduledLive")) {
                        return 3271;
                    }
                    break;
                case 1927:
                    if (r7.equals("LEDListFeedUnit")) {
                        return 1459;
                    }
                    if (r7.equals("ScheduledLiveMetadata")) {
                        return 2855;
                    }
                    if (r7.equals("UserPayPAYGSubscribable")) {
                        return 3286;
                    }
                    break;
                case 1928:
                    if (r7.equals("LoyaltyCardEvent")) {
                        return 1607;
                    }
                    if (r7.equals("StoryCardTemplateMedia")) {
                        return 3078;
                    }
                    break;
                case 1929:
                    if (r7.equals("DiodeFeed")) {
                        return 711;
                    }
                    if (r7.equals("LetterboxDocument")) {
                        return 1539;
                    }
                    if (r7.equals("LocalCommunityPet")) {
                        return 1585;
                    }
                    break;
                case 1930:
                    if (r7.equals("JobTaxonomyGroup")) {
                        return 1427;
                    }
                    if (r7.equals("LearningCourseUnit")) {
                        return 1492;
                    }
                    if (r7.equals("LegalMatterContact")) {
                        return 1503;
                    }
                    if (r7.equals("LegoProdAttachment")) {
                        return 1534;
                    }
                    if (r7.equals("LivingRoomPlaylist")) {
                        return 1578;
                    }
                    if (r7.equals("LocalCommunityPost")) {
                        return 1586;
                    }
                    if (r7.equals("ServicesVerticalUserData")) {
                        return 2914;
                    }
                    if (r7.equals("UniqueReadTimeBlockMessage")) {
                        return 3268;
                    }
                    break;
                case 1931:
                    if (r7.equals("LeadGenLegalContent")) {
                        return 1477;
                    }
                    if (r7.equals("LegalMatterDocument")) {
                        return 1505;
                    }
                    if (r7.equals("SentryRestrictionMetadata")) {
                        return 2888;
                    }
                    if (r7.equals("ShowsLiveTemplateMetadata")) {
                        return 2938;
                    }
                    break;
                case 1932:
                    if (r7.equals("LeadGenQualityAdUnit")) {
                        return 1482;
                    }
                    if (r7.equals("LegalPermissionGrant")) {
                        return 1530;
                    }
                    if (r7.equals("LocalExploreFeedUnit")) {
                        return 1590;
                    }
                    if (r7.equals("SupplyChainContentMetadata")) {
                        return 3118;
                    }
                    break;
                case 1933:
                    if (r7.equals("LegalFMElementRuleSet")) {
                        return 1496;
                    }
                    if (r7.equals("LetterboxBusinessUnit")) {
                        return 1538;
                    }
                    if (r7.equals("NonResponsivePagesInbox")) {
                        return 2113;
                    }
                    if (r7.equals("ScheduledLivingRoomMetadata")) {
                        return 2856;
                    }
                    if (r7.equals("SupplyChainSettingsMetadata")) {
                        return 3119;
                    }
                    break;
                case 1934:
                    if (r7.equals("SearchUnitUserInputBasedData")) {
                        return 2880;
                    }
                    break;
                case 1936:
                    if (r7.equals("DonorAdvisedFund")) {
                        return 742;
                    }
                    break;
                case 1937:
                    if (r7.equals("DSCMutationRecord")) {
                        return 678;
                    }
                    if (r7.equals("DirectMessageSend")) {
                        return 715;
                    }
                    if (r7.equals("LiveSellerPolicyAgreement")) {
                        return 1561;
                    }
                    if (r7.equals("LiveVideoChainingFeedUnit")) {
                        return 1565;
                    }
                    if (r7.equals("LiveVideoPromoteLinkAlert")) {
                        return 1574;
                    }
                    if (r7.equals("SourcingEventEvaluationCriteria")) {
                        return 2985;
                    }
                    break;
                case 1938:
                    if (r7.equals("FactCheckSavedSearch")) {
                        return 968;
                    }
                    if (r7.equals("LegalMatterFinancialImpact")) {
                        return 1512;
                    }
                    if (r7.equals("LocalTriggerPlacesFeedUnit")) {
                        return 1592;
                    }
                    break;
                case 1939:
                    if (r7.equals("DirectMessageThread")) {
                        return 717;
                    }
                    if (r7.equals("FundraiserSingleMatch")) {
                        return 1052;
                    }
                    if (r7.equals("LocalContextShareLinkTarget")) {
                        return 1588;
                    }
                    break;
                case 1941:
                    if (r7.equals("LEDRecommendedPlaceFeedObject")) {
                        return 1460;
                    }
                    break;
                case 1942:
                    if (r7.equals("DownstreamEffectRecord")) {
                        return 743;
                    }
                    if (r7.equals("LocalTriggerCategoriesFeedUnit")) {
                        return 1591;
                    }
                    break;
                case 1944:
                    if (r7.equals("DeveloperCommunityThread")) {
                        return 703;
                    }
                    if (r7.equals("LeadGenPostSubmissionCheckResult")) {
                        return 1480;
                    }
                    break;
                case 1945:
                    if (r7.equals("LaserTierQueryExactMatchRuleInput")) {
                        return 1465;
                    }
                    break;
                case 1947:
                    if (r7.equals("LoyaltyProgramAdminTemporaryContact")) {
                        return 1613;
                    }
                    break;
                case 1948:
                    if (r7.equals("FundraiserScheduledSingleMatch")) {
                        return 1051;
                    }
                    break;
                case 1949:
                    if (r7.equals("FactCheckContributorSavedSearch")) {
                        return 965;
                    }
                    if (r7.equals("LoyaltyAddPointsActionStaticQRCodeSet")) {
                        return 1605;
                    }
                    break;
                case 1957:
                    if (r7.equals("Device")) {
                        return 707;
                    }
                    break;
                case 1960:
                    if (r7.equals("SRTPartnerAssessmentJob")) {
                        return 2798;
                    }
                    break;
                case 1961:
                    if (r7.equals("NeoARGameBeaconStory")) {
                        return 2078;
                    }
                    if (r7.equals("NeoCameraBeaconStory")) {
                        return 2082;
                    }
                    if (r7.equals("NeoStatusBeaconStory")) {
                        return 2089;
                    }
                    break;
                case 1962:
                    if (r7.equals("HaloDerivedItem")) {
                        return 1203;
                    }
                    break;
                case 1963:
                    if (r7.equals("HackerCupProblem")) {
                        return 1198;
                    }
                    break;
                case 1964:
                    if (r7.equals("DirectMessage")) {
                        return 713;
                    }
                    if (r7.equals("HaloEverstoreItem")) {
                        return 1204;
                    }
                    break;
                case 1968:
                    if (r7.equals("NeoDrawGuessGameBeaconStory")) {
                        return 2083;
                    }
                    break;
                case 1969:
                    if (r7.equals("BCMPBountySchema")) {
                        return 305;
                    }
                    break;
                case 1971:
                    if (r7.equals("BizAppUserMetadata")) {
                        return 342;
                    }
                    break;
                case 1972:
                    if (r7.equals("DSCDealEngagementType")) {
                        return 666;
                    }
                    break;
                case 1974:
                    if (r7.equals("DeveloperCommunityBadge")) {
                        return 696;
                    }
                    break;
                case 1976:
                    if (r7.equals("DeveloperCommunityProfile")) {
                        return 700;
                    }
                    if (r7.equals("DirectSupportEmailProfile")) {
                        return 719;
                    }
                    if (r7.equals("Subtopic")) {
                        return 3109;
                    }
                    break;
                case 1977:
                    if (r7.equals("BCMPBountyContractSchema")) {
                        return 304;
                    }
                    break;
                case 1978:
                    if (r7.equals("StoryTopic")) {
                        return 3091;
                    }
                    break;
                case 1979:
                    if (r7.equals("SierraTopic")) {
                        return 2940;
                    }
                    if (r7.equals("WorkAddressBook")) {
                        return 3428;
                    }
                    break;
                case 1980:
                    if (r7.equals("BusinessBulkInvoiceMetadata")) {
                        return 386;
                    }
                    if (r7.equals("WorkPersonalTask")) {
                        return 3511;
                    }
                    if (r7.equals("WorkResellerLink")) {
                        return 3516;
                    }
                    break;
                case 1981:
                    if (r7.equals("UnimogCustomTag")) {
                        return 3260;
                    }
                    if (r7.equals("WorkResourcesLink")) {
                        return 3518;
                    }
                    break;
                case 1983:
                    if (r7.equals("DigitalRightsSupportInboxMessage")) {
                        return 710;
                    }
                    break;
                case 1985:
                    if (r7.equals("WorkTeamResourcesLink")) {
                        return 3532;
                    }
                    break;
                case 1986:
                    if (r7.equals("WorkKnowledgeQuickLink")) {
                        return 3488;
                    }
                    break;
                case 1987:
                    if (r7.equals("UnifiedStoriesSetting")) {
                        return 3258;
                    }
                    break;
                case 1989:
                    if (r7.equals("WorkScheduledResellerLink")) {
                        return 3526;
                    }
                    break;
                case 1997:
                    if (r7.equals("HackerCupSubmission")) {
                        return 1201;
                    }
                    break;
                case 1999:
                    if (r7.equals("HelpCommunityQuestion")) {
                        return 1216;
                    }
                    break;
                case 2002:
                    if (r7.equals("HaloItemAttachmentCommon")) {
                        return 1205;
                    }
                    break;
                case 2004:
                    if (r7.equals("WorkSkill")) {
                        return 3529;
                    }
                    break;
                case 2007:
                    if (r7.equals("WatchCMSDeal")) {
                        return 3389;
                    }
                    if (r7.equals("WorkApproval")) {
                        return 3432;
                    }
                    break;
                case 2009:
                    if (r7.equals("StoreBrand")) {
                        return 3028;
                    }
                    break;
                case 2010:
                    if (r7.equals("StoreRefund")) {
                        return 3049;
                    }
                    if (r7.equals("WorkUserInstall")) {
                        return 3538;
                    }
                    break;
                case 2012:
                    if (r7.equals("SCInvoiceHold")) {
                        return 2688;
                    }
                    if (r7.equals("WatchTopicChannel")) {
                        return 3407;
                    }
                    break;
                case 2013:
                    if (r7.equals("StoreOrderHold")) {
                        return 3035;
                    }
                    break;
                case 2015:
                    if (r7.equals("SnoozableKeyword")) {
                        return 2945;
                    }
                    if (r7.equals("WatchCMSFundingModel")) {
                        return 3393;
                    }
                    if (r7.equals("WorkAppAdminApproval")) {
                        return 3431;
                    }
                    break;
                case 2017:
                    if (r7.equals("SourcingEventAward")) {
                        return 2983;
                    }
                    if (r7.equals("StoryBucketCTACard")) {
                        return 3058;
                    }
                    break;
                case 2018:
                    if (r7.equals("SocialVRCustomWorld")) {
                        return 2953;
                    }
                    if (r7.equals("WorkCompanyPricingModel")) {
                        return 3448;
                    }
                    break;
                case 2019:
                    if (r7.equals("Feedback")) {
                        return 987;
                    }
                    if (r7.equals("LegalSavedView")) {
                        return 1532;
                    }
                    if (r7.equals("WemPrivateSharingControl")) {
                        return 3409;
                    }
                    break;
                case 2023:
                    if (r7.equals("Interactive360")) {
                        return 1399;
                    }
                    break;
                case 2025:
                    if (r7.equals("FanSupportPack")) {
                        return 975;
                    }
                    if (r7.equals("FolderBookmark")) {
                        return 1002;
                    }
                    if (r7.equals("SRTJobLegalMailTriageField")) {
                        return 2778;
                    }
                    break;
                case 2026:
                    if (r7.equals("SupportCorrespondenceThread")) {
                        return 3133;
                    }
                    break;
                case 2031:
                    if (r7.equals("FeatureLimitFeedback")) {
                        return 984;
                    }
                    break;
                case 2032:
                    if (r7.equals("ServicesThreadIntentTimeMentioned")) {
                        return 2913;
                    }
                    break;
                case 2034:
                    if (r7.equals("DeveloperCommunityTag")) {
                        return 702;
                    }
                    if (r7.equals("DeviceAutoplaySetting")) {
                        return 708;
                    }
                    if (r7.equals("Save")) {
                        return 2848;
                    }
                    if (r7.equals("WorkForm")) {
                        return 3470;
                    }
                    if (r7.equals("WorkTeam")) {
                        return 3531;
                    }
                    if (r7.equals("Workroom")) {
                        return 3545;
                    }
                    break;
                case 2035:
                    if (r7.equals("FlytrapBugReportFeedback")) {
                        return 1001;
                    }
                    break;
                case 2037:
                    if (r7.equals("SCQuote")) {
                        return 2705;
                    }
                    if (r7.equals("SCTRule")) {
                        return 2723;
                    }
                    break;
                case 2038:
                    if (r7.equals("FriendRequestsLimitFeedback")) {
                        return 1029;
                    }
                    if (r7.equals("SCInvite")) {
                        return 2685;
                    }
                    break;
                case 2039:
                    if (r7.equals("SCInvoice")) {
                        return 2686;
                    }
                    break;
                case 2040:
                    if (r7.equals("Searchable")) {
                        return 2881;
                    }
                    if (r7.equals("WatchQueueItem")) {
                        return 3406;
                    }
                    break;
                case 2041:
                    if (r7.equals("SCAPInvoice")) {
                        return 2676;
                    }
                    break;
                case 2042:
                    if (r7.equals("SCUserChange")) {
                        return 2725;
                    }
                    if (r7.equals("SOCompliance")) {
                        return 2733;
                    }
                    if (r7.equals("SerialDevice")) {
                        return 2889;
                    }
                    if (r7.equals("StructuredSurveyEventLoggingResponsePayload")) {
                        return 3099;
                    }
                    if (r7.equals("SupplierFile")) {
                        return 3116;
                    }
                    break;
                case 2043:
                    if (r7.equals("SCInvoiceLine")) {
                        return 2689;
                    }
                    if (r7.equals("StoredBalance")) {
                        return 3053;
                    }
                    if (r7.equals("WorkChecklistItem")) {
                        return 3443;
                    }
                    break;
                case 2044:
                    if (r7.equals("QuizMetadata")) {
                        return 2573;
                    }
                    if (r7.equals("SCSupplierSite")) {
                        return 2721;
                    }
                    if (r7.equals("SharedChatRule")) {
                        return 2916;
                    }
                    if (r7.equals("SocialWifiSite")) {
                        return 2966;
                    }
                    if (r7.equals("StoryCardShare")) {
                        return 3075;
                    }
                    if (r7.equals("SwipeableFrame")) {
                        return 3142;
                    }
                    break;
                case 2045:
                    if (r7.equals("JoinableVideoChatsAvailabilitySettings")) {
                        return 1435;
                    }
                    if (r7.equals("SCAPInvoiceLine")) {
                        return 2679;
                    }
                    if (r7.equals("SCSecurityPhone")) {
                        return 2709;
                    }
                    if (r7.equals("SocialVRPackage")) {
                        return 2960;
                    }
                    if (r7.equals("SourcingMessage")) {
                        return 2992;
                    }
                    if (r7.equals("StoryCardRaffle")) {
                        return 3072;
                    }
                    if (r7.equals("StructuredSurveySubmitResponsesResponsePayload")) {
                        return 3107;
                    }
                    break;
                case 2046:
                    if (r7.equals("SCPartnerProfile")) {
                        return 2697;
                    }
                    if (r7.equals("ShowreelTemplate")) {
                        return 2933;
                    }
                    if (r7.equals("SourcingTimeline")) {
                        return 3004;
                    }
                    break;
                case 2047:
                    if (r7.equals("SocialVRSpawnable")) {
                        return 2964;
                    }
                    if (r7.equals("SourcingSeenState")) {
                        return 3001;
                    }
                    if (r7.equals("StoryCardTemplate")) {
                        return 3077;
                    }
                    break;
            }
        }
        return 0;
    }
}
