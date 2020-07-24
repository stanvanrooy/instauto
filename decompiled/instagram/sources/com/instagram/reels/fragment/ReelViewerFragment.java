package com.instagram.reels.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.p004ui.base.IgEditText;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetMode;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.feed.media.AttributionUser;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.ProfilePicture;
import com.instagram.feed.media.StoryUnlockableStickerAttribution;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.effect.AREffect;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductCheckoutProperties;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductLaunchInformation;
import com.instagram.model.shopping.ProductMention;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import com.instagram.p009ui.widget.volume.VolumeIndicator;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.reels.challenge.model.ChallengeStickerModel;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;
import com.instagram.reels.dialog.ReelOptionsDialog;
import com.instagram.reels.events.model.EventStickerModel;
import com.instagram.reels.p008ui.views.ReelAvatarWithBadgeView;
import com.instagram.reels.persistence.UserReelMediasStore;
import com.instagram.reels.store.ReelStore;
import com.instagram.showreelnative.p037ui.reels.IgShowreelNativeProgressView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.ANK;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IZ;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0N0;
import p000X.AnonymousClass0O9;
import p000X.AnonymousClass0OX;
import p000X.AnonymousClass0OZ;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RA;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0RU;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass14Q;
import p000X.AnonymousClass172;
import p000X.AnonymousClass17A;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass18B;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1F6;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass1GK;
import p000X.AnonymousClass1GZ;
import p000X.AnonymousClass1H4;
import p000X.AnonymousClass1HH;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1I2;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1IY;
import p000X.AnonymousClass1KT;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1M0;
import p000X.AnonymousClass1MD;
import p000X.AnonymousClass1MF;
import p000X.AnonymousClass1MU;
import p000X.AnonymousClass1MV;
import p000X.AnonymousClass1MZ;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1NR;
import p000X.AnonymousClass1NW;
import p000X.AnonymousClass1O2;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass1OP;
import p000X.AnonymousClass1OR;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1S1;
import p000X.AnonymousClass1UP;
import p000X.AnonymousClass1UR;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1W0;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass1WD;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass1YR;
import p000X.AnonymousClass1zL;
import p000X.AnonymousClass23f;
import p000X.AnonymousClass252;
import p000X.AnonymousClass25W;
import p000X.AnonymousClass270;
import p000X.AnonymousClass27O;
import p000X.AnonymousClass290;
import p000X.AnonymousClass29V;
import p000X.AnonymousClass2Ay;
import p000X.AnonymousClass2C8;
import p000X.AnonymousClass2C9;
import p000X.AnonymousClass2CK;
import p000X.AnonymousClass2CT;
import p000X.AnonymousClass2E0;
import p000X.AnonymousClass2KB;
import p000X.AnonymousClass2KC;
import p000X.AnonymousClass2M0;
import p000X.AnonymousClass2MA;
import p000X.AnonymousClass2MC;
import p000X.AnonymousClass2O7;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2OC;
import p000X.AnonymousClass2OR;
import p000X.AnonymousClass2OS;
import p000X.AnonymousClass2OT;
import p000X.AnonymousClass2OU;
import p000X.AnonymousClass2OW;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass2TI;
import p000X.AnonymousClass2TV;
import p000X.AnonymousClass2UC;
import p000X.AnonymousClass2UD;
import p000X.AnonymousClass2VC;
import p000X.AnonymousClass2ZP;
import p000X.AnonymousClass2m9;
import p000X.AnonymousClass30C;
import p000X.AnonymousClass30D;
import p000X.AnonymousClass33U;
import p000X.AnonymousClass346;
import p000X.AnonymousClass347;
import p000X.AnonymousClass348;
import p000X.AnonymousClass349;
import p000X.AnonymousClass34A;
import p000X.AnonymousClass34B;
import p000X.AnonymousClass34C;
import p000X.AnonymousClass34D;
import p000X.AnonymousClass34E;
import p000X.AnonymousClass34F;
import p000X.AnonymousClass34G;
import p000X.AnonymousClass34H;
import p000X.AnonymousClass34I;
import p000X.AnonymousClass34J;
import p000X.AnonymousClass34K;
import p000X.AnonymousClass34L;
import p000X.AnonymousClass34M;
import p000X.AnonymousClass34N;
import p000X.AnonymousClass34O;
import p000X.AnonymousClass34P;
import p000X.AnonymousClass34Q;
import p000X.AnonymousClass34R;
import p000X.AnonymousClass34S;
import p000X.AnonymousClass34T;
import p000X.AnonymousClass34U;
import p000X.AnonymousClass34V;
import p000X.AnonymousClass34W;
import p000X.AnonymousClass34X;
import p000X.AnonymousClass34Y;
import p000X.AnonymousClass34Z;
import p000X.AnonymousClass350;
import p000X.AnonymousClass351;
import p000X.AnonymousClass352;
import p000X.AnonymousClass353;
import p000X.AnonymousClass354;
import p000X.AnonymousClass355;
import p000X.AnonymousClass356;
import p000X.AnonymousClass358;
import p000X.AnonymousClass359;
import p000X.AnonymousClass35C;
import p000X.AnonymousClass35F;
import p000X.AnonymousClass35I;
import p000X.AnonymousClass35J;
import p000X.AnonymousClass35L;
import p000X.AnonymousClass35M;
import p000X.AnonymousClass35N;
import p000X.AnonymousClass35O;
import p000X.AnonymousClass35P;
import p000X.AnonymousClass35Q;
import p000X.AnonymousClass35S;
import p000X.AnonymousClass35T;
import p000X.AnonymousClass35U;
import p000X.AnonymousClass35V;
import p000X.AnonymousClass35Y;
import p000X.AnonymousClass36O;
import p000X.AnonymousClass36T;
import p000X.AnonymousClass36U;
import p000X.AnonymousClass36V;
import p000X.AnonymousClass36W;
import p000X.AnonymousClass370;
import p000X.AnonymousClass372;
import p000X.AnonymousClass373;
import p000X.AnonymousClass375;
import p000X.AnonymousClass376;
import p000X.AnonymousClass377;
import p000X.AnonymousClass37A;
import p000X.AnonymousClass37C;
import p000X.AnonymousClass37D;
import p000X.AnonymousClass37E;
import p000X.AnonymousClass37F;
import p000X.AnonymousClass37G;
import p000X.AnonymousClass37H;
import p000X.AnonymousClass37I;
import p000X.AnonymousClass37J;
import p000X.AnonymousClass37K;
import p000X.AnonymousClass37L;
import p000X.AnonymousClass37M;
import p000X.AnonymousClass37O;
import p000X.AnonymousClass37Q;
import p000X.AnonymousClass3C9;
import p000X.AnonymousClass3DU;
import p000X.AnonymousClass3DV;
import p000X.AnonymousClass3DW;
import p000X.AnonymousClass3DX;
import p000X.AnonymousClass3De;
import p000X.AnonymousClass3E1;
import p000X.AnonymousClass3E2;
import p000X.AnonymousClass3E3;
import p000X.AnonymousClass3E4;
import p000X.AnonymousClass3E6;
import p000X.AnonymousClass3E7;
import p000X.AnonymousClass3E8;
import p000X.AnonymousClass3E9;
import p000X.AnonymousClass3EA;
import p000X.AnonymousClass3EB;
import p000X.AnonymousClass3EC;
import p000X.AnonymousClass3ED;
import p000X.AnonymousClass3EF;
import p000X.AnonymousClass3EG;
import p000X.AnonymousClass3EH;
import p000X.AnonymousClass3EJ;
import p000X.AnonymousClass3EM;
import p000X.AnonymousClass3EP;
import p000X.AnonymousClass3EQ;
import p000X.AnonymousClass3ER;
import p000X.AnonymousClass3ES;
import p000X.AnonymousClass3ET;
import p000X.AnonymousClass3EU;
import p000X.AnonymousClass3EV;
import p000X.AnonymousClass3EW;
import p000X.AnonymousClass3EX;
import p000X.AnonymousClass3EY;
import p000X.AnonymousClass3EZ;
import p000X.AnonymousClass3GL;
import p000X.AnonymousClass3GN;
import p000X.AnonymousClass3GO;
import p000X.AnonymousClass3GP;
import p000X.AnonymousClass3GQ;
import p000X.AnonymousClass3GS;
import p000X.AnonymousClass3GT;
import p000X.AnonymousClass3GV;
import p000X.AnonymousClass3GX;
import p000X.AnonymousClass3GY;
import p000X.AnonymousClass3H3;
import p000X.AnonymousClass3TP;
import p000X.AnonymousClass3ZR;
import p000X.AnonymousClass43F;
import p000X.AnonymousClass44U;
import p000X.AnonymousClass48j;
import p000X.AnonymousClass4EA;
import p000X.AnonymousClass4IC;
import p000X.AnonymousClass4IO;
import p000X.AnonymousClass4JZ;
import p000X.AnonymousClass4N5;
import p000X.AnonymousClass4N6;
import p000X.AnonymousClass4N7;
import p000X.AnonymousClass4N8;
import p000X.AnonymousClass4N9;
import p000X.AnonymousClass519;
import p000X.AnonymousClass52E;
import p000X.AnonymousClass54G;
import p000X.AnonymousClass563;
import p000X.AnonymousClass56L;
import p000X.AnonymousClass56S;
import p000X.AnonymousClass571;
import p000X.AnonymousClass58F;
import p000X.AnonymousClass5BF;
import p000X.AnonymousClass5BG;
import p000X.AnonymousClass5BY;
import p000X.AnonymousClass5D9;
import p000X.AnonymousClass5DW;
import p000X.AnonymousClass5EO;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass5IP;
import p000X.AnonymousClass5IU;
import p000X.AnonymousClass5JZ;
import p000X.AnonymousClass5K8;
import p000X.AnonymousClass5K9;
import p000X.AnonymousClass5MD;
import p000X.AnonymousClass5MK;
import p000X.AnonymousClass5MM;
import p000X.AnonymousClass5P9;
import p000X.AnonymousClass5PX;
import p000X.AnonymousClass5Q2;
import p000X.AnonymousClass5Q7;
import p000X.AnonymousClass5Q8;
import p000X.AnonymousClass5WI;
import p000X.AnonymousClass6Ab;
import p000X.AnonymousClass6D8;
import p000X.AnonymousClass6DE;
import p000X.AnonymousClass6DG;
import p000X.AnonymousClass6DL;
import p000X.AnonymousClass6DN;
import p000X.AnonymousClass6DP;
import p000X.AnonymousClass6DV;
import p000X.AnonymousClass6DW;
import p000X.AnonymousClass6E1;
import p000X.AnonymousClass6E3;
import p000X.AnonymousClass6E4;
import p000X.AnonymousClass6E5;
import p000X.AnonymousClass6E6;
import p000X.AnonymousClass6EC;
import p000X.AnonymousClass6ED;
import p000X.AnonymousClass6QT;
import p000X.AnonymousClass6QU;
import p000X.AnonymousClass6QX;
import p000X.AnonymousClass6QY;
import p000X.AnonymousClass702;
import p000X.AnonymousClass703;
import p000X.AnonymousClass704;
import p000X.AnonymousClass72T;
import p000X.AnonymousClass7F7;
import p000X.AnonymousClass7N7;
import p000X.AnonymousClass7N8;
import p000X.AnonymousClass7P9;
import p000X.AnonymousClass88D;
import p000X.AnonymousClass88Q;
import p000X.AnonymousClass88V;
import p000X.AnonymousClass8CW;
import p000X.AnonymousClass8CX;
import p000X.AnonymousClass8CY;
import p000X.AnonymousClass8CZ;
import p000X.AnonymousClass8DP;
import p000X.AnonymousClass8H5;
import p000X.AnonymousClass8ID;
import p000X.AnonymousClass8IF;
import p000X.AnonymousClass8IU;
import p000X.AnonymousClass8KZ;
import p000X.AnonymousClass8L4;
import p000X.AnonymousClass8L7;
import p000X.AnonymousClass94I;
import p000X.AnonymousClass95U;
import p000X.AnonymousClass96I;
import p000X.AnonymousClass96M;
import p000X.AnonymousClass96Y;
import p000X.AnonymousClass96Z;
import p000X.AnonymousClass9B2;
import p000X.AnonymousClass9G1;
import p000X.AnonymousClass9G2;
import p000X.C019000b;
import p000X.C05230Is;
import p000X.C05700Lp;
import p000X.C05770Lw;
import p000X.C05970Ne;
import p000X.C06190Oc;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C06360Ot;
import p000X.C06400Ox;
import p000X.C06420Oz;
import p000X.C06590Pq;
import p000X.C100994Xy;
import p000X.C103634dq;
import p000X.C103844eE;
import p000X.C104274ev;
import p000X.C104314ez;
import p000X.C104374f5;
import p000X.C104494fI;
import p000X.C106404iS;
import p000X.C106534if;
import p000X.C106634ip;
import p000X.C106654ir;
import p000X.C106664is;
import p000X.C11130eT;
import p000X.C111354qp;
import p000X.C11200ea;
import p000X.C11290ej;
import p000X.C114414vs;
import p000X.C1173152b;
import p000X.C1173252c;
import p000X.C1183556f;
import p000X.C1183756h;
import p000X.C1184056k;
import p000X.C1184856s;
import p000X.C1185056u;
import p000X.C1185256w;
import p000X.C1185356x;
import p000X.C1187057o;
import p000X.C1189758p;
import p000X.C119665Bl;
import p000X.C119685Bn;
import p000X.C120125Dh;
import p000X.C121705Jo;
import p000X.C122615Nf;
import p000X.C122625Ng;
import p000X.C123005Pd;
import p000X.C124595Vl;
import p000X.C12670hC;
import p000X.C126785c0;
import p000X.C12800hP;
import p000X.C12810hQ;
import p000X.C12830hS;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C140755zz;
import p000X.C14100jl;
import p000X.C143806Dc;
import p000X.C143816Dd;
import p000X.C143826De;
import p000X.C143836Df;
import p000X.C143846Dg;
import p000X.C143906Dn;
import p000X.C143936Dq;
import p000X.C143976Du;
import p000X.C144036Ea;
import p000X.C144096Eg;
import p000X.C144126Ej;
import p000X.C144876Hl;
import p000X.C145626Kk;
import p000X.C146006Mb;
import p000X.C146146Mp;
import p000X.C146186Mt;
import p000X.C147666Sw;
import p000X.C147696Sz;
import p000X.C156756mm;
import p000X.C15890nh;
import p000X.C160266sd;
import p000X.C16170o9;
import p000X.C16180oA;
import p000X.C16230oG;
import p000X.C16270oK;
import p000X.C162846xA;
import p000X.C16330oQ;
import p000X.C163636yU;
import p000X.C16380oV;
import p000X.C1646470m;
import p000X.C1647871b;
import p000X.C168297Gq;
import p000X.C168477Hl;
import p000X.C16920pO;
import p000X.C169547Mr;
import p000X.C17020pY;
import p000X.C17080pe;
import p000X.C171577Vd;
import p000X.C172317Yc;
import p000X.C173367av;
import p000X.C17390qA;
import p000X.C173937bu;
import p000X.C17510qM;
import p000X.C17640qZ;
import p000X.C176507gH;
import p000X.C176607gU;
import p000X.C176637gX;
import p000X.C176647gY;
import p000X.C176657gZ;
import p000X.C178277jQ;
import p000X.C178367jZ;
import p000X.C17850qu;
import p000X.C17870qw;
import p000X.C178727kE;
import p000X.C178737kF;
import p000X.C17910r0;
import p000X.C17920r1;
import p000X.C181037oA;
import p000X.C181067oD;
import p000X.C18920sd;
import p000X.C1896188k;
import p000X.C18980sj;
import p000X.C1899289r;
import p000X.C19020sn;
import p000X.C19030so;
import p000X.C192128Jj;
import p000X.C194598Us;
import p000X.C197088by;
import p000X.C200118hT;
import p000X.C200128hU;
import p000X.C2109297s;
import p000X.C212639Fb;
import p000X.C212649Fc;
import p000X.C212789Fq;
import p000X.C212849Fw;
import p000X.C212859Fx;
import p000X.C215639Rd;
import p000X.C215679Rh;
import p000X.C215779Rt;
import p000X.C21980xe;
import p000X.C22060xm;
import p000X.C22100xq;
import p000X.C222409hw;
import p000X.C22250y6;
import p000X.C225409n6;
import p000X.C227559qh;
import p000X.C22930zG;
import p000X.C23300zv;
import p000X.C235310t;
import p000X.C241113i;
import p000X.C249916w;
import p000X.C252117x;
import p000X.C256419q;
import p000X.C256519s;
import p000X.C25921Ax;
import p000X.C25984Bdd;
import p000X.C26301Cs;
import p000X.C26441Dh;
import p000X.C26571Ea;
import p000X.C27021Ge;
import p000X.C27141Gq;
import p000X.C27181Gu;
import p000X.C27264C5x;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27391Hq;
import p000X.C27411Hs;
import p000X.C27491Ib;
import p000X.C27511Id;
import p000X.C27661Is;
import p000X.C27942CXe;
import p000X.C27944CXg;
import p000X.C27945CXh;
import p000X.C28051Kf;
import p000X.C28351Lj;
import p000X.C28491Ly;
import p000X.C28501Lz;
import p000X.C28991Oe;
import p000X.C29181Ox;
import p000X.C29293CvO;
import p000X.C29631Qq;
import p000X.C30571Uj;
import p000X.C30671Ut;
import p000X.C30692Dhg;
import p000X.C30911Vr;
import p000X.C31071Wi;
import p000X.C31111Wm;
import p000X.C31151Wq;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C31561Yu;
import p000X.C31571Yv;
import p000X.C31591Yx;
import p000X.C32471bJ;
import p000X.C32481bK;
import p000X.C32501bN;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C32991cC;
import p000X.C33031cG;
import p000X.C33051cI;
import p000X.C33061cJ;
import p000X.C33071cK;
import p000X.C33251cc;
import p000X.C33441cv;
import p000X.C33451cw;
import p000X.C34001dq;
import p000X.C34071dx;
import p000X.C34081e0;
import p000X.C34091e1;
import p000X.C34151eA;
import p000X.C34181eD;
import p000X.C34201eF;
import p000X.C34421ei;
import p000X.C34431ej;
import p000X.C34441ek;
import p000X.C34451el;
import p000X.C34471en;
import p000X.C34531et;
import p000X.C34561ew;
import p000X.C34581ey;
import p000X.C34641f4;
import p000X.C34661f6;
import p000X.C34741fE;
import p000X.C34811fL;
import p000X.C35181fw;
import p000X.C35201fy;
import p000X.C35241g2;
import p000X.C36681iR;
import p000X.C36791ic;
import p000X.C36901in;
import p000X.C36971iu;
import p000X.C37121j9;
import p000X.C37141jB;
import p000X.C37181jF;
import p000X.C37311jS;
import p000X.C37461jh;
import p000X.C37591ju;
import p000X.C37631jy;
import p000X.C37671k2;
import p000X.C38031kc;
import p000X.C38271l0;
import p000X.C39731nP;
import p000X.C39821nc;
import p000X.C39831nd;
import p000X.C39941no;
import p000X.C40131o8;
import p000X.C40141o9;
import p000X.C43091tn;
import p000X.C43201u0;
import p000X.C43531uZ;
import p000X.C44351w1;
import p000X.C44551wL;
import p000X.C44561wM;
import p000X.C45961yu;
import p000X.C46201zK;
import p000X.C469121m;
import p000X.C476424v;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C486028s;
import p000X.C486528y;
import p000X.C49042Am;
import p000X.C49422Cb;
import p000X.C50272Fq;
import p000X.C50282Fr;
import p000X.C51232Ju;
import p000X.C51242Jv;
import p000X.C51512Ky;
import p000X.C51522Kz;
import p000X.C51722Lw;
import p000X.C51862Mk;
import p000X.C52312Oh;
import p000X.C52322Oi;
import p000X.C52332Oj;
import p000X.C52342Ok;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C53562Th;
import p000X.C53572Ti;
import p000X.C53642Tq;
import p000X.C53842Uo;
import p000X.C55262aK;
import p000X.C55952bg;
import p000X.C55962bh;
import p000X.C56142c0;
import p000X.C56162c2;
import p000X.C56202c6;
import p000X.C57642eX;
import p000X.C57652eY;
import p000X.C58022fB;
import p000X.C58952gn;
import p000X.C58962go;
import p000X.C59002gs;
import p000X.C59012gt;
import p000X.C59022gu;
import p000X.C59032gv;
import p000X.C59302hM;
import p000X.C60512k1;
import p000X.C60532k3;
import p000X.C60612kB;
import p000X.C60632kD;
import p000X.C61062l4;
import p000X.C61072l5;
import p000X.C61082l6;
import p000X.C61092l7;
import p000X.C61102l8;
import p000X.C61112l9;
import p000X.C61122lA;
import p000X.C61152lD;
import p000X.C61172lF;
import p000X.C61192lH;
import p000X.C61202lI;
import p000X.C61212lJ;
import p000X.C61232lL;
import p000X.C61242lM;
import p000X.C61272lP;
import p000X.C61282lQ;
import p000X.C61292lR;
import p000X.C61302lS;
import p000X.C61642mA;
import p000X.C61672mD;
import p000X.C61762mM;
import p000X.C62052mp;
import p000X.C63282pB;
import p000X.C64872sB;
import p000X.C64882sC;
import p000X.C64942sI;
import p000X.C64972sL;
import p000X.C64982sM;
import p000X.C65122sa;
import p000X.C65132sb;
import p000X.C65162se;
import p000X.C65302ss;
import p000X.C65352sx;
import p000X.C66262vC;
import p000X.C66312vH;
import p000X.C66832w7;
import p000X.C68172yZ;
import p000X.C69;
import p000X.C698834a;
import p000X.C698934b;
import p000X.C699034c;
import p000X.C699134d;
import p000X.C699234e;
import p000X.C699334f;
import p000X.C699434g;
import p000X.C699534h;
import p000X.C699634i;
import p000X.C699734j;
import p000X.C699834k;
import p000X.C699934l;
import p000X.C700034m;
import p000X.C700134n;
import p000X.C700234o;
import p000X.C700334p;
import p000X.C700434q;
import p000X.C700534r;
import p000X.C700634s;
import p000X.C700734t;
import p000X.C700834u;
import p000X.C700934v;
import p000X.C701034w;
import p000X.C701134x;
import p000X.C701234y;
import p000X.C701334z;
import p000X.C701435a;
import p000X.C701535b;
import p000X.C701635c;
import p000X.C706136v;
import p000X.C706236w;
import p000X.C706536z;
import p000X.C711639e;
import p000X.C72013Dd;
import p000X.C72023Df;
import p000X.C72033Dh;
import p000X.C72053Dl;
import p000X.C72133Du;
import p000X.C72153Dw;
import p000X.C72173Dy;
import p000X.C72183Dz;
import p000X.C72643Gh;
import p000X.C72673Gl;
import p000X.C72693Gn;
import p000X.C72703Go;
import p000X.C76833Xm;
import p000X.C77653aN;
import p000X.C78143bE;
import p000X.C85343nC;
import p000X.C86323oq;
import p000X.C91733y1;
import p000X.C91743y2;
import p000X.C91803y8;
import p000X.C91833yB;
import p000X.C92253yr;
import p000X.C92363z2;
import p000X.C92873zr;
import p000X.C943446b;
import p000X.C97554Jn;
import p000X.C97894Kv;
import p000X.C97904Kw;
import p000X.C98484Nh;
import p000X.C98494Ni;
import p000X.C98514Nk;
import p000X.CQ1;
import p000X.CXF;
import p000X.CXM;
import p000X.CXQ;
import p000X.CXR;
import p000X.CXS;
import p000X.CXZ;
import p000X.CYD;
import p000X.CYQ;
import p000X.DCY;

public class ReelViewerFragment extends C27341Hl implements AnonymousClass2OC, C27371Ho, AnonymousClass2OR, AnonymousClass1HK, AnonymousClass2OS, C256519s, AnonymousClass2OT, AnonymousClass2OU, AnonymousClass2OW, AnonymousClass2M0, AnonymousClass2MA, C52312Oh, C52322Oi, C52332Oj, C476424v, AnonymousClass2MC, C28991Oe, C27391Hq, C52342Ok, View.OnKeyListener {
    public static final AnonymousClass1EA A3W = AnonymousClass1EA.A01(60.0d, 5.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = 5000;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public Toast A0J;
    public AnonymousClass1LO A0K;
    public AnonymousClass37Q A0L;
    public AnonymousClass35Q A0M;
    public AnonymousClass1US A0N;
    public AnonymousClass0QT A0O;
    public C27511Id A0P;
    public C28051Kf A0Q;
    public AnonymousClass571 A0R;
    public C31151Wq A0S;
    public AnonymousClass1I2 A0T;
    public C27661Is A0U;
    public C29631Qq A0V;
    public AnonymousClass25W A0W;
    public C51522Kz A0X;
    public C50282Fr A0Y;
    public ReelViewerConfig A0Z;
    public AnonymousClass1OY A0a;
    public AnonymousClass1OC A0b;
    public AnonymousClass1NR A0c;
    public AnonymousClass37A A0d;
    public AnonymousClass358 A0e;
    public AnonymousClass35C A0f;
    public AnonymousClass35J A0g;
    public AnonymousClass3H3 A0h;
    public AnonymousClass36T A0i;
    public C64872sB A0j;
    public AnonymousClass56S A0k;
    public AnonymousClass3E7 A0l;
    public AnonymousClass37G A0m;
    public AnonymousClass8CZ A0n;
    public AnonymousClass35P A0o;
    public AnonymousClass3EU A0p;
    public AnonymousClass373 A0q;
    public AnonymousClass37D A0r;
    public AnonymousClass36U A0s;
    public AnonymousClass35V A0t;
    public AnonymousClass372 A0u;
    public AnonymousClass377 A0v;
    public AnonymousClass3EQ A0w;
    public AnonymousClass36V A0x;
    public C64942sI A0y;
    public AnonymousClass1OR A0z;
    public AnonymousClass37E A10;
    public C706536z A11;
    public AnonymousClass36W A12;
    public C706136v A13;
    public AnonymousClass3E2 A14;
    public C706236w A15;
    public C58952gn A16;
    public AnonymousClass3EP A17;
    public C34081e0 A18;
    public AnonymousClass37C A19;
    public AnonymousClass35U A1A;
    public AnonymousClass35N A1B;
    public AnonymousClass35L A1C;
    public AnonymousClass35M A1D;
    public AnonymousClass3E1 A1E;
    public AnonymousClass0C1 A1F;
    public ANK A1G;
    public Integer A1H;
    public Runnable A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public ArrayList A1T;
    public ArrayList A1U;
    public HashMap A1V;
    public HashMap A1W;
    public HashMap A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a = false;
    public boolean A1b;
    public boolean A1c = false;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h = false;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n = false;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q = false;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public boolean A1y = false;
    public boolean A1z = false;
    public boolean A20;
    public boolean A21;
    public boolean A22;
    public boolean A23;
    public boolean A24;
    public boolean A25;
    public boolean A26;
    public boolean A27;
    public boolean A28;
    public boolean A29;
    public boolean A2A;
    public float A2B;
    public float A2C;
    public float A2D = 1.0f;
    public float A2E = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A2F = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A2G = 0;
    public View.OnSystemUiVisibilityChangeListener A2H;
    public AnonymousClass1IY A2I;
    public C35201fy A2J;
    public C39941no A2K;
    public AnonymousClass2Ay A2L;
    public C50282Fr A2M;
    public AnonymousClass3GP A2N;
    public String A2O;
    public boolean A2P;
    public boolean A2Q;
    public boolean A2R;
    public boolean A2S;
    public boolean A2T;
    public boolean A2U;
    public boolean A2V;
    public boolean A2W = false;
    public boolean A2X = false;
    public boolean A2Y;
    public final DialogInterface.OnDismissListener A2Z = new AnonymousClass34F(this);
    public final DialogInterface.OnDismissListener A2a = new AnonymousClass34P(this);
    public final DialogInterface.OnDismissListener A2b = new AnonymousClass34K(this);
    public final DialogInterface.OnShowListener A2c = new AnonymousClass34O(this);
    public final RectF A2d = new RectF();
    public final AnonymousClass1EA A2e = AnonymousClass1EA.A01(50.0d, 8.0d);
    public final AnonymousClass34D A2f = new AnonymousClass34C(this);
    public final AnonymousClass347 A2g = new AnonymousClass347(false);
    public final AnonymousClass34H A2h = new AnonymousClass34G(this);
    public final AnonymousClass34V A2i = new AnonymousClass34V(this);
    public final AnonymousClass34W A2j = new AnonymousClass34W(this);
    public final AnonymousClass34X A2k = new AnonymousClass34X(this);
    public final AnonymousClass34Y A2l = new AnonymousClass34Y(this);
    public final C699034c A2m = new C699034c(this);
    public final C699334f A2n = new C699334f(this);
    public final C700034m A2o = new C700034m(this);
    public final C700434q A2p = new C700434q(this);
    public final C700534r A2q = new C700534r(this);
    public final C701034w A2r = new C701034w(this);
    public final AnonymousClass355 A2s = new AnonymousClass355(this);
    public final AnonymousClass356 A2t = new AnonymousClass356(this);
    public final AnonymousClass34E A2u = new AnonymousClass34E(this);
    public final C699234e A2v = new C699134d(this);
    public final AnonymousClass346 A2w = new AnonymousClass346();
    public final C28491Ly A2x = new AnonymousClass352(this);
    public final C699534h A2y = new C699434g(this);
    public final Runnable A2z = new AnonymousClass354(this);
    public final Runnable A30 = new AnonymousClass353(this);
    public final Set A31 = new HashSet();
    public final Set A32 = new HashSet();
    public final EvictingQueue A33 = new EvictingQueue(2);
    public final C698834a A34 = new AnonymousClass34Z(this);
    public final C27021Ge A35 = new AnonymousClass350(this);
    public final C11200ea A36 = new C700834u(this);
    public final C11200ea A37 = new AnonymousClass34B(this);
    public final C11200ea A38 = new C700734t(this);
    public final C11200ea A39 = new AnonymousClass351(this);
    public final C11200ea A3A = new C701334z(this);
    public final C11200ea A3B = new C700934v(this);
    public final AnonymousClass0O9 A3C = new AnonymousClass349(this);
    public final AnonymousClass0O9 A3D = new AnonymousClass34A(this);
    public final AnonymousClass34N A3E = new AnonymousClass34M(this);
    public final AnonymousClass34R A3F = new AnonymousClass34Q(this);
    public final AnonymousClass34J A3G = new AnonymousClass34I(this);
    public final AnonymousClass34L A3H = new AnonymousClass34L(this);
    public final AnonymousClass34S A3I = new AnonymousClass34S(this);
    public final AnonymousClass34T A3J = new AnonymousClass34T(this);
    public final AnonymousClass34U A3K = new AnonymousClass34U(this);
    public final C698934b A3L = new C698934b(this);
    public final C699634i A3M = new C699634i(this);
    public final C699734j A3N = new C699734j(this);
    public final C699834k A3O = new C699834k(this);
    public final C699934l A3P = new C699934l(this);
    public final C700634s A3Q = new C700634s(this);
    public final C701134x A3R = new C701134x(this);
    public final C701234y A3S = new C701234y(this);
    public final C700334p A3T = new C700234o(this);
    public final AnonymousClass1W0 A3U = new C700134n(this);
    public final AnonymousClass348 A3V = new AnonymousClass348(C06190Oc.A00);
    public ReelAvatarWithBadgeView mAvatarAnimationView;
    public View mBackgroundDimmer;
    public AnonymousClass3ED mBitmapReferenceManager;
    public View mComposerCameraButtonContainer;
    public C60512k1 mDragToDismissController;
    public C256419q mDropFrameWatcher;
    public C26571Ea mGroupStoryReplyPromptHolder;
    public View mLoadingOverlay;
    public GradientSpinner mLoadingOverlaySpinner;
    public C68172yZ mMentionReshareProgressDialog;
    public View mMessageComposer;
    public View mMessageComposerContainer;
    public View mMessageComposerSendBtn;
    public C26571Ea mMessageComposerStickerButtonHolder;
    public C26571Ea mMessageComposerStickerShortcutButtonHolder;
    public IgEditText mMessageComposerText;
    public TextWatcher mMessageComposerTextWatcher;
    public C72133Du mPhotoTimerController;
    public AnonymousClass3EF mReelInteractiveController;
    public AnonymousClass8L7 mReelLoadingVisualization;
    public AnonymousClass6Ab mReelLoadingVisualizationAdapterObserver;
    public ReelOptionsDialog mReelOptionsDialog;
    public C72023Df mReelViewerListenerManager;
    public AnonymousClass3E3 mReelsViewerPagingNavigationPerfLogger;
    public C72153Dw mShowreelNativeTimerController;
    public AnonymousClass3ER mSuggestedHighlightsController;
    public C57652eY mVideoPlayer;
    public ReboundViewPager mViewPager;
    public TouchInterceptorFrameLayout mViewRoot;
    public View mViewerBackgroundView;
    public VolumeIndicator mVolumeIndicator;

    public static AnonymousClass3GP A05(ReelViewerFragment reelViewerFragment) {
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        if (reelViewerFragment.A2N == null) {
            reelViewerFragment2.A2N = new AnonymousClass3GP(reelViewerFragment.A1F, reelViewerFragment.getRootActivity().getApplicationContext(), AnonymousClass1L8.A00(reelViewerFragment), reelViewerFragment2, (C77653aN) null);
        }
        return reelViewerFragment2.A2N;
    }

    public static void A0E(View view, boolean z) {
        if (z) {
            C476524w A072 = C476624x.A07(view);
            A072.A0N();
            C476524w A0T2 = A072.A0T(true);
            A0T2.A08 = 0;
            A0T2.A0G(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            A0T2.A0O();
            return;
        }
        C476524w A073 = C476624x.A07(view);
        A073.A0N();
        C476524w A0T3 = A073.A0T(true);
        A0T3.A07 = 4;
        A0T3.A0G(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0T3.A0O();
    }

    private void A0G(C39941no r4, String str) {
        A0s(this, true);
        A0m(this, "context_switch");
        HashMap hashMap = new HashMap();
        hashMap.put("media_id", r4.A08.A27);
        hashMap.put("module", getModuleName());
        A0p(this, str, hashMap, r4);
    }

    public static void A0O(ReelViewerFragment reelViewerFragment) {
        reelViewerFragment.A1o = false;
        if (!A1B(reelViewerFragment)) {
            A0R(reelViewerFragment);
        }
    }

    public static void A0R(ReelViewerFragment reelViewerFragment) {
        reelViewerFragment.A13(false);
    }

    public static synchronized void A0T(ReelViewerFragment reelViewerFragment) {
        C50282Fr r3;
        synchronized (reelViewerFragment) {
            if (reelViewerFragment.isResumed() && reelViewerFragment.A0Y != null) {
                Reel A0G2 = ReelStore.A02(reelViewerFragment.A1F).A0G(reelViewerFragment.A0Y.A0C());
                if (A0G2 != null) {
                    A0G2.A0K();
                    if (!A0G2.A0l(reelViewerFragment.A1F)) {
                        C50282Fr r2 = reelViewerFragment.A0Y;
                        r2.A0G(reelViewerFragment.A1F, r2.A02);
                    }
                }
                boolean z = AnonymousClass370.A00(reelViewerFragment.A1F).A00.getBoolean(reelViewerFragment.A0Y.A0A.getId(), false);
                if (reelViewerFragment.A0Y.A0J(reelViewerFragment.A1F) || z || A0G2 == null) {
                    int Ad5 = reelViewerFragment.A16.Ad5(reelViewerFragment.A0Y);
                    boolean z2 = true;
                    if (Ad5 != reelViewerFragment.A16.getCount() - 1) {
                        z2 = false;
                    }
                    if (Ad5 >= 0) {
                        C58952gn r1 = reelViewerFragment.A16;
                        r3 = (C50282Fr) r1.A09.remove(Ad5);
                        if (r3 != null) {
                            r1.A0A.remove(r3.A0C());
                        }
                    } else {
                        r3 = null;
                    }
                    reelViewerFragment.A2M = r3;
                    if (A1C(reelViewerFragment) && r3 != null) {
                        C59002gs A032 = A03(reelViewerFragment);
                        Reel reel = reelViewerFragment.A2M.A0A;
                        if (!AnonymousClass17M.A00(A032.A00, reel)) {
                            A032.A00 = reel;
                            AnonymousClass1W5 r0 = A032.A03;
                            if (r0 != null) {
                                r0.BHS(reel);
                            }
                        }
                    }
                    if (!reelViewerFragment.A16.isEmpty() && !z2) {
                        AnonymousClass0Z1.A00(reelViewerFragment.A16, -1436035897);
                        A0S(reelViewerFragment);
                        A0L(reelViewerFragment);
                        reelViewerFragment.A0o.A00();
                        reelViewerFragment.A0B(-1);
                    } else if (reelViewerFragment.A1j) {
                        reelViewerFragment.A1j = false;
                        if (AnonymousClass17M.A00(reelViewerFragment.A2M, reelViewerFragment.A0Y)) {
                            reelViewerFragment.A0Y = null;
                        }
                    } else {
                        A0M(reelViewerFragment);
                    }
                } else {
                    if (!reelViewerFragment.mReelViewerListenerManager.Bmg()) {
                        A0L(reelViewerFragment);
                        reelViewerFragment.mReelViewerListenerManager.B80(A0G2);
                    }
                    if (A1C(reelViewerFragment)) {
                        C59002gs A033 = A03(reelViewerFragment);
                        Reel reel2 = reelViewerFragment.A0Y.A0A;
                        AnonymousClass1W5 r02 = A033.A03;
                        if (r02 != null) {
                            r02.BHt(reel2);
                        }
                    }
                }
                reelViewerFragment.A20 = false;
            }
        }
    }

    public static void A0b(ReelViewerFragment reelViewerFragment, C39941no r15, String str) {
        String A0u2;
        int i;
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        if (!AnonymousClass2ZP.A02(reelViewerFragment.A1F)) {
            C92363z2 r2 = new C92363z2(AnonymousClass0QT.A00(reelViewerFragment.A1F, (AnonymousClass0RN) null).A02("ig_business_story_to_fb_page"));
            r2.A08("logging_event_name", "story_cross_posted_from_biz_to_fb_without_page_linked");
            r2.A01();
        }
        C39941no r7 = r15;
        r15.A08.A0l = C34201eF.SHARING;
        A0L(reelViewerFragment);
        AnonymousClass0C1 r6 = reelViewerFragment.A1F;
        Context context = reelViewerFragment.getContext();
        Integer num = Constants.A0C;
        AnonymousClass34X r8 = reelViewerFragment.A2k;
        AnonymousClass1NJ r0 = r15.A08;
        if (r0 == null) {
            A0u2 = "";
        } else {
            A0u2 = r0.A0u();
        }
        if (r15.A0B() == null) {
            i = -1;
        } else {
            i = r15.A0B().A00;
        }
        String str2 = str;
        AnonymousClass5DW.A01(reelViewerFragment2, str2, r6, A0u2, i, "one_tap_share");
        AnonymousClass56L.A00(r6, "request", "self_story", reelViewerFragment2, str2);
        AnonymousClass1NJ r1 = r7.A08;
        C17850qu A032 = AnonymousClass5BF.A00(r6, new ShareLaterMedia(r1, r1.A0F()), str2, num).A03();
        A032.A00 = new C1185256w(reelViewerFragment2, str2, r6, r7, r8, context);
        reelViewerFragment2.schedule(A032);
    }

    public static void A0i(ReelViewerFragment reelViewerFragment, C34151eA r12, int i, int i2) {
        Long l;
        String id;
        List list;
        AnonymousClass1NJ r4;
        Long l2;
        Boolean bool;
        ProductCheckoutProperties productCheckoutProperties;
        C34151eA r7 = r12;
        C50282Fr A012 = A01(reelViewerFragment, r12.A0l);
        switch (r12.A0Q.ordinal()) {
            case 1:
            case 2:
            case 4:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                AnonymousClass23f r0 = r12.A0a;
                if (r0 != null && r0.A05.equals("bloks_tappable_i_donated_sticker_id")) {
                    AnonymousClass0C1 r42 = reelViewerFragment.A1F;
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap.put("source_name", "story");
                    hashMap2.put("sticker_id_str", "bloks_tappable_i_donated_sticker_id");
                    C146186Mt.A05(r42, reelViewerFragment, hashMap, hashMap2, "ig_cg_click_i_donated_sticker");
                }
                AnonymousClass0QT r3 = reelViewerFragment.A0O;
                C39941no A082 = reelViewerFragment.A0Y.A08(reelViewerFragment.A1F);
                C106664is r5 = C106664is.CLICK;
                AnonymousClass43F r6 = AnonymousClass43F.CONSUMER_STICKER;
                if (r12 != null) {
                    list = A082.A0W(r12.A0Q);
                } else {
                    list = null;
                }
                C106654ir.A00(r3, A082, r5, r6, r7, list);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                reelViewerFragment.A0f.A0M("hashtag_attempt", A012, r12.A0E.A0A, r12, (Boolean) null);
                return;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                reelViewerFragment.A0f.A0N("location_attempt", A012, r12.A0I.A04, r12.A0m, (Boolean) null);
                return;
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                AnonymousClass35J r43 = reelViewerFragment.A0g;
                String str = r12.A0j;
                AnonymousClass1YR r62 = r12.A0F;
                C13150hy.A02(A012, "reelViewModel");
                C39941no A083 = A012.A08(r43.A03);
                AnonymousClass1NJ r72 = A083.A08;
                if (r72 != null) {
                    C91833yB r32 = new C91833yB(r43.A00.A02("instagram_organic_story_media_reshare_attempt"));
                    r32.A08("m_pk", r72.getId());
                    r32.A07("m_t", Long.valueOf((long) r72.APx().A00));
                    r32.A08("reel_id", A012.A0C());
                    r32.A08("tray_session_id", r43.A04);
                    r32.A08("viewer_session_id", r43.A02.AaT());
                    r32.A08("pigeon_reserved_keyword_module", r43.A01.getModuleName());
                    C249916w A0B2 = A012.A0B();
                    String str2 = null;
                    if (A0B2 == null || (id = A0B2.getId()) == null) {
                        l = null;
                    } else {
                        l = C63282pB.A0G(id);
                    }
                    r32.A07("a_pk", l);
                    if (r62 != null) {
                        str2 = r62.A00;
                    }
                    r32.A08("tapped_media_product_type", str2);
                    r32.A08("tapped_media_id", str);
                    r32.A08("action", "tap");
                    r32.A05("start_x_position", Double.valueOf((double) i));
                    r32.A05("start_y_position", Double.valueOf((double) i2));
                    r32.A01();
                    return;
                }
                AnonymousClass0QD.A01("ReelViewerLoggerKt", AnonymousClass000.A0N("missing media ID for reel item: ", A083.getId(), ", in reel: ", A012.A0C()));
                return;
            case 15:
                reelViewerFragment.A0f.A0L("tag_attempt", A012, r12, (Boolean) null);
                return;
            case 20:
                AnonymousClass35C r52 = reelViewerFragment.A0f;
                if (((Boolean) AnonymousClass0L6.A02(r52.A07, AnonymousClass0L7.USL_INSTAGRAM_ORGANIC_TAP_PRODUCT_STICKER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    Product A032 = r12.A03();
                    C39941no A084 = A012.A08(r52.A07);
                    if (A084.A0t() && (r4 = A084.A08) != null) {
                        AnonymousClass0C1 r2 = r52.A07;
                        Reel reel = A012.A0A;
                        AnonymousClass35F r02 = r52.A04;
                        r02.A00 = reel;
                        C91803y8 r33 = new C91803y8(AnonymousClass0QT.A00(r2, r02).A02("instagram_organic_tap_product_sticker"));
                        if (r33.A0B()) {
                            r33.A08("m_pk", r4.getId());
                            r33.A07("m_t", Long.valueOf((long) r4.APx().A00));
                            r33.A07("product_id", Long.valueOf(A032.getId()));
                            r33.A04("is_checkout_enabled", Boolean.valueOf(A032.A09()));
                            r33.A08("product_sticker_id", r12.A07());
                            r33.A09("product_ids", AnonymousClass35C.A03(r4.A0x()));
                            r33.A07("merchant_id", Long.valueOf(A032.A02.A02));
                            r33.A0A("product_merchant_ids", AnonymousClass35C.A05(r4.A0x()));
                            r33.A09("sticker_styles", C37141jB.A02(r4));
                            r33.A07("media_owner_id", Long.valueOf(r4.A0c(r52.A07).getId()));
                            r33.A09("tagged_user_ids", AnonymousClass35C.A04(r4.A10()));
                            ProductLaunchInformation productLaunchInformation = A032.A06;
                            Long l3 = null;
                            if (productLaunchInformation != null) {
                                l2 = Long.valueOf(productLaunchInformation.A00);
                            } else {
                                l2 = null;
                            }
                            r33.A07("drops_launch_date", l2);
                            ProductLaunchInformation productLaunchInformation2 = A032.A06;
                            if (productLaunchInformation2 != null) {
                                bool = Boolean.valueOf(productLaunchInformation2.A01);
                            } else {
                                bool = null;
                            }
                            r33.A04("has_drops_launched", bool);
                            r33.A09("drops_product_ids", AnonymousClass35C.A02(r4.A0x()));
                            if (A032.A09() && (productCheckoutProperties = A032.A03) != null) {
                                l3 = Long.valueOf((long) productCheckoutProperties.A00);
                            }
                            r33.A07("product_inventory", l3);
                            r33.A0A("profile_shop_link", C37181jF.A00(r4.A0Z(), r4.A0Y(), r4.A0a()));
                            r33.A01();
                            return;
                        }
                        return;
                    }
                    return;
                }
                AnonymousClass35C.A0A(r52, "tap_product_sticker", A012, r12.A03(), r12.A07());
                return;
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                AnonymousClass35C r34 = reelViewerFragment.A0f;
                Product A042 = r12.A04();
                AnonymousClass0a4.A06(A042);
                AnonymousClass35C.A0A(r34, "tap_product_share_sticker", A012, A042, (String) null);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03f5, code lost:
        if (r5.Aho() == false) goto L_0x03f7;
     */
    public static void A0k(ReelViewerFragment reelViewerFragment, C51862Mk r20, C39941no r21, Integer num) {
        AnonymousClass1NJ r5;
        String str;
        String str2;
        String str3;
        boolean z;
        List list;
        String str4;
        int i;
        int i2;
        String str5;
        boolean z2 = true;
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        A0s(reelViewerFragment2, true);
        A0m(reelViewerFragment2, "tapped");
        C39941no r0 = r21;
        if (r0.A0E == Constants.ONE) {
            r5 = r0.A08;
        } else {
            r5 = null;
        }
        C50282Fr A012 = A01(reelViewerFragment2, r0.A0F);
        if (r0.A0b()) {
            reelViewerFragment2.A0F(r0);
        } else if (AnonymousClass5JZ.A01(r0)) {
            z2 = false;
            A0N(reelViewerFragment2);
        } else {
            C51862Mk r10 = r20;
            Integer num2 = num;
            if (r0.A0i()) {
                reelViewerFragment2.A1C.A03(r0, A012, r10, num2);
            } else if (r0.A0d()) {
                reelViewerFragment2.A1C.A01(r0, A012, r10, num2);
            } else if (r0.A0g()) {
                reelViewerFragment2.A1C.A02(r0, A012, r10, num2);
            } else if (r0.A0h()) {
                reelViewerFragment2.A1C.A04(r0, A012, r10, num2, reelViewerFragment2.A2Z);
            } else if (r0.A0x()) {
                AnonymousClass35N r1 = reelViewerFragment2.A1B;
                C64982sM A022 = reelViewerFragment2.A16.A02(r0);
                Integer num3 = r0.A0E;
                boolean z3 = false;
                if (num3 == Constants.A0j) {
                    z3 = true;
                }
                if (z3) {
                    if (!A022.A0L) {
                        A022.A0L = true;
                        AnonymousClass9G1 r02 = r0.A0C;
                        if (r02 == null) {
                            str5 = null;
                        } else {
                            str5 = r02.A02;
                        }
                        AnonymousClass0a4.A07(str5, "Bakeoff needs a non-null extra data token");
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_data_token", str5);
                        C59032gv r11 = new C59032gv(r1.A05, ModalActivity.class, "bake_off", bundle, r1.A00.getActivity());
                        r11.A0A = new int[]{C0003R.anim.bottom_in, C0003R.anim.fade_out, C0003R.anim.fade_in, C0003R.anim.bottom_out};
                        r11.A07(r1.A00, 42061);
                    }
                } else if (r0.A0v()) {
                    AnonymousClass356 r4 = r1.A04;
                    AnonymousClass1NJ r112 = r0.A08;
                    ReelViewerFragment reelViewerFragment3 = r4.A00;
                    AnonymousClass6D8.A02(r112, reelViewerFragment3.getModuleName(), reelViewerFragment3, reelViewerFragment3.getActivity(), reelViewerFragment3.A1F, reelViewerFragment3.A2Z, reelViewerFragment3.A2i);
                } else if (r0.A0w()) {
                    if (r0.A13()) {
                        AnonymousClass3EU r7 = r1.A04.A00.A0p;
                        View view = r7.A02.mViewPager.A0C;
                        if (view != null && (view.getTag() instanceof C65132sb)) {
                            C65132sb r52 = (C65132sb) view.getTag();
                            C212639Fb r8 = r52.A0N;
                            int i3 = r8.A05.A0B;
                            int length = C212639Fb.A0C.length;
                            List list2 = r8.A04.A01.A06;
                            if (list2 != null) {
                                i = list2.size();
                            } else {
                                i = 0;
                            }
                            r8.A05.A0B = (i3 + length) % i;
                            C212649Fc.A00(r8, true);
                            DCY dcy = r52.A0M.A09.A03;
                            if (dcy != null) {
                                dcy.BXF();
                            }
                            A0P(r7.A01.A00);
                            C64982sM r42 = r52.A0C;
                            if (!r42.A0Q) {
                                r42.A0Q = true;
                                AnonymousClass0C1 r12 = r7.A03;
                                C12830hS r82 = r7.A00;
                                AnonymousClass9G2 r72 = r52.A0A.A01;
                                List list3 = r72.A06;
                                if (list3 != null) {
                                    i2 = list3.size();
                                } else {
                                    i2 = 0;
                                }
                                ArrayList arrayList = new ArrayList();
                                List<C212789Fq> list4 = r72.A06;
                                if (list4 != null) {
                                    for (C212789Fq r03 : list4) {
                                        arrayList.add(r03.A00.getId());
                                    }
                                }
                                List unmodifiableList = Collections.unmodifiableList(arrayList);
                                C15890nh r113 = new C15890nh(r12);
                                r113.A09 = Constants.ONE;
                                r113.A0C = "discover/ayml/";
                                r113.A06(C212859Fx.class, false);
                                r113.A09("module", "stories");
                                r113.A09("phone_id", AnonymousClass0OZ.A00(r12).AZO());
                                r113.A09("forced_user_ids", C36681iR.A00(',').A03(unmodifiableList));
                                if (C12800hP.A0J(r12)) {
                                    r113.A09("fb_access_token", C14100jl.A00(r12));
                                }
                                C17850qu A032 = r113.A03();
                                A032.A00 = new C212849Fw(i2, r72);
                                r82.schedule(A032);
                            }
                        }
                    } else {
                        AnonymousClass0C1 r122 = r1.A05;
                        Class<ModalActivity> cls = ModalActivity.class;
                        C22100xq.A00().A02();
                        String A002 = AnonymousClass5WI.A00(Constants.A0C);
                        String string = r1.A00.getString(C0003R.string.discover_people);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", "stories_see_more");
                        bundle2.putString("ExplorePeopleFragment.ARGUMENT_TYPE", A002);
                        bundle2.putBoolean("ExplorePeopleFragment.ARGUMENT_NO_SCROLLABLE_NAVIGATION_HELPER", true);
                        if (!TextUtils.isEmpty(string)) {
                            bundle2.putString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE", string);
                        }
                        C59032gv r114 = new C59032gv(r122, cls, "discover_people", bundle2, r1.A00.getActivity());
                        r114.A0A = ModalActivity.A03;
                        r114.A07(r1.A00, 60573);
                    }
                    if (num2 == Constants.A12) {
                        AnonymousClass0C1 r73 = r1.A05;
                        AnonymousClass2O7 r43 = new AnonymousClass2O7(Constants.A0j, r1.A01);
                        r43.A0F = "su_stories";
                        r43.A00(r73);
                    } else if (num2 == Constants.A14) {
                        new C91733y1(r1.A02.A02("recommended_user_see_all_swiped_up")).A01();
                    }
                } else {
                    String A0C2 = A012.A0C();
                    String id = r0.getId();
                    if (num3 != null) {
                        str4 = C25984Bdd.A00(num3);
                    } else {
                        str4 = "null";
                    }
                    throw new UnsupportedOperationException(AnonymousClass000.A0P("Netego CTA action isn't supported in stories! Reel ID: ", A0C2, " || ReelItem ID: ", id, " || ReelItem type: ", str4));
                }
                AnonymousClass35C r44 = r1.A03;
                String A003 = C215779Rt.A00(num2);
                C39941no A082 = A012.A08(r44.A07);
                AnonymousClass35I r53 = r44.A03;
                C37141jB A013 = C36901in.A01("instagram_netego_action", r53.A00, (C37121j9) null);
                A013.A3W = A003;
                A013.A28 = r10;
                AnonymousClass35I.A01(r53, A013, (AnonymousClass3GS) r44.A0D.get(A082.A0N()));
                C37311jS.A05(A013, A012.A0A);
                AnonymousClass35I.A02(r53.A01, A013.A03());
            } else if (r0.A0e()) {
                AnonymousClass1UP A014 = C34581ey.A01(r0, reelViewerFragment2.getContext());
                AnonymousClass0a4.A07(A014, "Link should non-null if hasLinks() is true.");
                AnonymousClass1UR r45 = AnonymousClass1UR.AD_DESTINATION_WEB;
                AnonymousClass1UR r123 = A014.A00;
                if (r45.equals(r123)) {
                    A012.A07 = true;
                }
                if (r5 == null || !r5.Aho()) {
                    AnonymousClass35L r46 = reelViewerFragment2.A1C;
                    String str6 = reelViewerFragment2.A1S;
                    String str7 = reelViewerFragment2.A1R;
                    switch (r123.ordinal()) {
                        case 0:
                            str2 = A014.A0A;
                            str = "webclick";
                            r46.A02.A0J(r0.A0D, r10, A012, C215779Rt.A00(num2), "reel_present_browser", str);
                            break;
                        case 2:
                            str2 = A014.A04;
                            str = "deeplink";
                            break;
                        default:
                            throw new UnsupportedOperationException(AnonymousClass000.A0J("Link type of ", r123.toString(), " isn't supported for organic CTA!"));
                    }
                    r46.A02.A0J(r0.A0D, r10, A012, C215779Rt.A00(num2), "instagram_organic_action", str);
                    FragmentActivity fragmentActivity = r46.A00;
                    AnonymousClass0C1 r102 = r46.A03;
                    C13300iJ r115 = r0.A0D;
                    AnonymousClass2UD r124 = AnonymousClass2UD.REEL_CTA;
                    AnonymousClass1UR r14 = A014.A00;
                    String str8 = A014.A07;
                    C39941no A083 = A012.A08(r102);
                    if (A083.A0t()) {
                        str3 = A083.A08.getId();
                    } else {
                        str3 = null;
                    }
                    if (r5 != null) {
                        z = true;
                    }
                    z = false;
                    if (r5 != null) {
                        list = C30671Ut.A0D(r46.A03, r5);
                    } else {
                        list = null;
                    }
                    AnonymousClass270.A06(fragmentActivity, r102, r115, r124, str2, r14, str8, str3, (String) null, str6, str7, z, list, r46.A01.getModuleName());
                } else {
                    if (AnonymousClass1UR.AD_DESTINATION_DIRECT_MESSAGE.equals(r123)) {
                        A0e(reelViewerFragment2, A012, r0, Constants.A0N);
                    }
                    AnonymousClass35M r13 = reelViewerFragment2.A1D;
                    FragmentActivity requireActivity = reelViewerFragment2.requireActivity();
                    C64982sM A023 = reelViewerFragment2.A16.A02(r0);
                    float f = A023.A06;
                    float f2 = f;
                    double d = ((double) (f * A023.A07)) / 1000.0d;
                    C66312vH r15 = new C66312vH(r13.A02, r13.A03, r13.A04, A012.A0A, A012.A02, A012.A09);
                    r15.A09 = r10;
                    r15.A00 = d;
                    r15.A01 = (((double) f2) / 1000.0d) - d;
                    r15.A0A = Boolean.valueOf(A023.A0N);
                    if (AnonymousClass3GT.A00(A012)) {
                        int A024 = A012.A02();
                        List list5 = A012.A0A.A0j;
                        r15.A0D = true;
                        r15.A07 = A024;
                        r15.A0C = list5;
                    }
                    C37311jS.A0D(r15, requireActivity);
                    C215679Rh r152 = new C215679Rh(r13.A02, requireActivity, num2, r13.A01, r15);
                    r152.A07 = A012.A0A;
                    r152.A01(new SourceModelInfoParams(r13.A04, r13.A03, r0.A0F, A012.A02, A012.A09, r0.getId()));
                    r152.A05 = r13.A00;
                    new C215639Rd(r152).A02();
                }
            } else if (r5 != null && r0.A0Z()) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("effect_id", r5.A0m());
                bundle3.putString("camera_entry_point", "story_effect_swipe_up_cta");
                A0U(reelViewerFragment2, bundle3, (RectF) null);
            }
        }
        if (z2) {
            reelViewerFragment2.A10(Constants.A0C);
        }
    }

    public static void A0s(ReelViewerFragment reelViewerFragment, boolean z) {
        A0u(reelViewerFragment, z, true);
    }

    private void A0w(C34811fL r3, EventStickerModel eventStickerModel, C123005Pd r5) {
        A0s(this, false);
        A0m(this, "tapped");
        C17850qu A002 = C1189758p.A00(this.A1F, eventStickerModel, r5, (String) null, (String) null);
        A002.A00 = new C119685Bn(this, eventStickerModel, r5);
        schedule(A002);
        r3.A00(r5, this.A30);
    }

    private boolean A1A(C39941no r7) {
        if (r7 == null || !r7.A14() || ((r7.A0n() && !((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.LIVE_PERFORMANCE_IMPROVEMENT_LAUNCHER, "warmup_next_live", false, (AnonymousClass04H) null)).booleanValue()) || r7.A0J(this.A1F) == null)) {
            return false;
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r2 = this.A1F;
        AnonymousClass27O.A00(activity, r2, r7.A0J(r2), getModuleName(), 0);
        return true;
    }

    public final AnonymousClass1HH AMB() {
        return this;
    }

    public final boolean Ago() {
        return true;
    }

    public final void AsB(C39941no r10) {
        A0s(this, true);
        A0m(this, "context_switch");
        AnonymousClass0C1 r3 = this.A1F;
        FragmentActivity activity = getActivity();
        AnonymousClass1NJ r6 = r10.A08;
        AnonymousClass4JZ.A00(activity, C65302ss.A01(r6), new C1187057o(r3, activity, this, r6, false, "stories_archive"));
    }

    public final void Auk(Reel reel, C39941no r8, AnonymousClass5Q7 r9, String str, Float f, Float f2) {
        A0s(this, true);
        A0m(this, "tapped");
        if (r9 != null) {
            AnonymousClass35C r2 = this.A0f;
            if (r8.A0t()) {
                AnonymousClass1NJ r4 = r8.A08;
                AnonymousClass0C1 r3 = r2.A07;
                AnonymousClass35F r1 = r2.A04;
                r1.A00 = reel;
                C37141jB A012 = C37591ju.A01("caption_more_click", r4, r1);
                A012.A0B(r3, r4);
                A012.A5P = r9.ALR();
                A012.A3W = str;
                if (!(f == null || f2 == null)) {
                    A012.A0R = f.floatValue();
                    A012.A0S = f2.floatValue();
                }
                AnonymousClass35C.A07(r2, A012, (AnonymousClass3GS) r2.A0D.get(r8.A0N()));
                C36901in.A09(AnonymousClass0WN.A01(r2.A07), r2.A04, r4, A012.A03(), (Integer) null);
            }
        }
    }

    public final void Aul(Reel reel, C39941no r8, C61762mM r9, String str, Float f, Float f2) {
        A0s(this, true);
        A0m(this, "tapped");
        if (r9 != null) {
            AnonymousClass35C r2 = this.A0f;
            if (r8.A0t()) {
                AnonymousClass1NJ r4 = r8.A08;
                AnonymousClass0C1 r3 = r2.A07;
                AnonymousClass35F r1 = r2.A04;
                r1.A00 = reel;
                C37141jB A012 = C37591ju.A01("caption_more_click", r4, r1);
                A012.A0B(r3, r4);
                A012.A0i = r9.A0E;
                A012.A0h = r9.A0G;
                A012.A0j = r9.A0H;
                A012.A0g = r9.A0F;
                A012.A2O = Boolean.valueOf(r9.A0M);
                A012.A0H = r9.A05;
                A012.A0K = r9.A06;
                A012.A0I = r9.A02;
                A012.A0J = r9.A03;
                A012.A3W = str;
                if (!(f == null || f2 == null)) {
                    A012.A0R = f.floatValue();
                    A012.A0S = f2.floatValue();
                }
                AnonymousClass35C.A07(r2, A012, (AnonymousClass3GS) r2.A0D.get(r8.A0N()));
                C36901in.A09(AnonymousClass0WN.A01(r2.A07), r2.A04, r4, A012.A03(), (Integer) null);
            }
        }
    }

    public final void Aum(Reel reel, C39941no r8, String str, Float f, Float f2) {
        A0s(this, true);
        A0R(this);
        AnonymousClass35C r2 = this.A0f;
        if (r8.A0t()) {
            AnonymousClass1NJ r4 = r8.A08;
            AnonymousClass0C1 r3 = r2.A07;
            AnonymousClass35F r1 = r2.A04;
            r1.A00 = reel;
            C37141jB A012 = C37591ju.A01("caption_dismiss", r4, r1);
            A012.A0B(r3, r4);
            A012.A3W = str;
            if (!(f == null || f2 == null)) {
                A012.A0R = f.floatValue();
                A012.A0S = f2.floatValue();
            }
            AnonymousClass35C.A07(r2, A012, (AnonymousClass3GS) r2.A0D.get(r8.A0N()));
            C36901in.A09(AnonymousClass0WN.A01(r2.A07), r2.A04, r4, A012.A03(), (Integer) null);
        }
    }

    public final void Av8(C34741fE r16, C39941no r17, C171577Vd r18) {
        C173367av r0;
        Integer num;
        boolean z = false;
        A0s(this, false);
        A0m(this, "tapped");
        C171577Vd r2 = r18;
        C173367av r1 = r2.A00;
        AnonymousClass0a4.A06(r1);
        C34741fE r9 = r16;
        switch (r1.ordinal()) {
            case 0:
            case 2:
                if (r1 == C173367av.INTERACTIVE) {
                    z = true;
                }
                C17390qA.A00(this.A1F).A0E(new C17080pe(r2.A04, z));
                if (z) {
                    r0 = C173367av.PENDING;
                } else {
                    r0 = C173367av.INTERACTIVE;
                }
                r2.A00 = r0;
                AnonymousClass0C1 r10 = this.A1F;
                FragmentActivity activity = getActivity();
                Runnable runnable = this.A30;
                r9.A01.setEnabled(false);
                AnonymousClass7N7 r7 = (AnonymousClass7N7) r9.A01.getDrawable();
                if (z) {
                    num = Constants.ONE;
                } else {
                    num = Constants.ZERO;
                }
                C140755zz r8 = new C140755zz(r9, r10, r17, z, activity, runnable);
                r7.A02 = num;
                AnonymousClass1EG r5 = r7.A0I;
                if (((double) AnonymousClass7N8.A00(num)) == r5.A00() || num == Constants.A0C) {
                    r8.run();
                } else {
                    r7.A03 = r8;
                    r5.A03((double) AnonymousClass7N8.A00(num));
                }
                if (z) {
                    C16180oA.A00(this.A1F).A00.edit().putBoolean("has_ever_requested_to_join_story_chat_sticker", true).apply();
                    return;
                }
                return;
            case 1:
                C56142c0 r12 = new C56142c0(getActivity(), new AnonymousClass95U((int) C0003R.string.chat_sticker_view_chat_tooltip_text));
                r12.A02(r9.A01);
                r12.A05 = C56162c2.ABOVE_ANCHOR;
                r12.A0C = true;
                r12.A04 = new C104274ev(this, r2);
                r12.A00().A05();
                return;
            default:
                return;
        }
    }

    public final void Avu(C13300iJ r1) {
    }

    public final void Aw7(C13300iJ r1) {
    }

    public final void AyY(RectF rectF) {
        A0g(this, (C34561ew) null, rectF, "multicapture");
    }

    public final void B0E() {
    }

    public final void B2w(C34811fL r4, EventStickerModel eventStickerModel) {
        A0s(this, false);
        A0m(this, "tapped");
        C119665Bl r2 = new C119665Bl();
        Bundle bundle = new Bundle();
        bundle.putParcelable("events_sticker_event_model", eventStickerModel);
        r2.setArguments(bundle);
        r2.A01 = new AnonymousClass5IU(this);
        AnonymousClass2TH r1 = new AnonymousClass2TH(this.A1F);
        r1.A0T = true;
        r1.A0F = r2;
        r1.A0H = new AnonymousClass4N8(this);
        r1.A00().A06(getContext(), r2);
    }

    public final void B5E(C13300iJ r1, Integer num) {
    }

    public final void B65(String str) {
        A0s(this, false);
        A0m(this, "tapped");
        Bundle bundle = new Bundle();
        bundle.putString("THREAD_ID", str);
        AnonymousClass5BG r3 = new AnonymousClass5BG();
        r3.setArguments(bundle);
        AnonymousClass2TH r2 = new AnonymousClass2TH(this.A1F);
        r2.A0T = true;
        r2.A0F = r3;
        Context context = getContext();
        r2.A02 = C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.backgroundColorSecondary));
        r2.A0H = new AnonymousClass4N6(this);
        r2.A00().A01(getContext(), r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r0 != 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r1 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r1 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        if (r3.A06 != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0145, code lost:
        if (r13.A1h != false) goto L_0x0147;
     */
    public final void B8g(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        this.A2R = false;
        boolean z6 = this.A1r;
        boolean z7 = false;
        if (i > C27141Gq.A01) {
            z7 = true;
        }
        this.A1r = z7;
        this.mReelViewerListenerManager.B8f(i);
        C39941no A1E2 = A1E();
        C50282Fr r0 = this.A0Y;
        if (!(r0 == null || A1E2 == null)) {
            boolean A0C2 = C34581ey.A0C(r0, A1E2);
            boolean equals = this.A1F.A06.equals(A1E2.A0D);
            if (!A0C2 && !equals) {
                return;
            }
        }
        if (A1E2 == null || !A1E2.A0n()) {
            AnonymousClass3EH r02 = this.A0t.A01;
            if (r02 != null) {
                View view = r02.A00;
                boolean z8 = false;
                if (view != null) {
                    z8 = true;
                }
                if (z8) {
                    int visibility = view.getVisibility();
                    z5 = true;
                }
                z5 = false;
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                AnonymousClass35V r3 = this.A0t;
                AnonymousClass3EM r03 = r3.A00;
                if (r03 != null) {
                    boolean z9 = r03.A05;
                    z3 = true;
                }
                z3 = false;
                if (!z3 && !r3.A02) {
                    if (this.A1r) {
                        AnonymousClass3E7 r32 = this.A0l;
                        if (r32.A08.isEmpty()) {
                            LayoutInflater from = LayoutInflater.from(r32.A00);
                            for (int i4 = 0; i4 < 2; i4++) {
                                LinearLayout linearLayout = new LinearLayout(r32.A00);
                                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                for (int i5 = 0; i5 < 4; i5++) {
                                    ConstrainedImageView constrainedImageView = (ConstrainedImageView) from.inflate(C0003R.layout.reel_reaction, linearLayout, false);
                                    linearLayout.addView(constrainedImageView);
                                    r32.A08.add(constrainedImageView);
                                }
                                r32.A01.addView(linearLayout);
                            }
                        }
                        AnonymousClass3E7.A00(r32);
                        r32.A01.getViewTreeObserver().addOnPreDrawListener(new C103634dq(r32, i));
                        this.mMessageComposerContainer.setVisibility(0);
                    } else {
                        this.A0x.A00(true);
                    }
                    AnonymousClass3C9 r8 = new AnonymousClass3C9(this);
                    boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.INTERACTIONS_STORY_VIEWER_COMPOSER_KEYBOARD_ANIMATION_BOUNDARY_TEST, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    if (booleanValue) {
                        View view2 = this.mMessageComposerContainer;
                        if (i == 0) {
                            i3 = view2.getHeight();
                        } else {
                            i3 = -i;
                        }
                        view2.setTranslationY((float) i3);
                        View view3 = this.mMessageComposerContainer;
                        if (i != 0) {
                            f = 1.0f;
                        }
                        view3.setAlpha(f);
                        r8.onFinish();
                    } else {
                        C476524w A072 = C476624x.A07(this.mMessageComposerContainer);
                        if (i == 0) {
                            i2 = this.mMessageComposerContainer.getHeight();
                        } else {
                            i2 = -i;
                        }
                        A072.A0E((float) i2);
                        if (i != 0) {
                            f = 1.0f;
                        }
                        A072.A0C(f);
                        C476524w A0T2 = A072.A0T(true);
                        A0T2.A09 = r8;
                        A0T2.A0O();
                    }
                    if (!(this.mComposerCameraButtonContainer == null || this.A0Y == null)) {
                        if ((A1E2 == null || !A1E2.A0o()) && !this.A0Z.A0W && (!AnonymousClass3EB.A00(this.A1F).booleanValue() || TextUtils.isEmpty(this.mMessageComposerText.getText().toString().trim()))) {
                            z4 = false;
                        }
                        z4 = true;
                        View view4 = this.mComposerCameraButtonContainer;
                        int i6 = 0;
                        if (z4) {
                            i6 = 8;
                        }
                        view4.setVisibility(i6);
                    }
                    if (!this.A1r) {
                        if (!this.A1x && !A1B(this) && !this.A1i && !this.A15.A01) {
                            A0R(this);
                        }
                        this.A1x = false;
                        this.A1i = false;
                        this.mViewPager.setDraggingEnabled(true);
                        if (z6) {
                            this.mBackgroundDimmer.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.reel_viewer_background_dimmer_color));
                            A0E(this.mBackgroundDimmer, false);
                        }
                    } else if (z6) {
                    } else {
                        if (this.mViewPager.A0J != C32501bN.IDLE) {
                            C06220Of.A0E(this.mMessageComposerText);
                            return;
                        }
                        this.mBackgroundDimmer.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.reel_viewer_background_dimmer_color));
                        A0E(this.mBackgroundDimmer, true);
                        if (!this.A22) {
                            this.mMessageComposerText.setText("");
                        }
                        this.A22 = false;
                        this.mViewPager.setDraggingEnabled(false);
                        C50282Fr r4 = this.A0Y;
                        if (r4 == null) {
                            r4 = this.A16.ATu(this.A0E);
                        }
                        if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_COMPOSE_MESSAGE_LOGGING_FIX_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                            return;
                        }
                        if (r4 != null) {
                            this.A0f.A0D(r4, this.A16.A02(r4.A08(this.A1F)).A07, this.A16.A02(r4.A08(this.A1F)).A06, Constants.A0N);
                            return;
                        }
                        AnonymousClass0QD.A02("reel_viewer_compose_message_error", AnonymousClass000.A0A("item not found in reel view model at index ", this.A0E, " in module ", getModuleName()));
                    }
                }
            }
        } else {
            this.mViewPager.setDraggingEnabled(!this.A1r);
        }
    }

    public final void B9H() {
        A0y((Float) null, (Float) null);
    }

    public final void B9I() {
        A0z((Float) null, (Float) null);
    }

    public final void B9Z(String str) {
    }

    public final boolean BAH(float f, float f2) {
        A12(false);
        AnonymousClass37G r6 = this.A0m;
        if (!r6.A03) {
            return false;
        }
        if (this.A1p) {
            f = -f;
        }
        float f3 = f - r6.A00;
        r6.A00 = f;
        int AKe = r6.A04.A00.mVideoPlayer.AKe();
        int AJT = r6.A04.A00.mVideoPlayer.AJT();
        float AVQ = (float) r6.A04.A00.mReelViewerListenerManager.AVQ();
        float f4 = (float) AKe;
        float f5 = (((float) AJT) / f4) * AVQ;
        float max = Math.max(-f5, Math.min(AVQ - f5, r6.A01 + f3));
        r6.A01 = max;
        int min = Math.min(AKe, Math.max(0, AJT + ((int) ((max / AVQ) * f4))));
        r6.A02 = min;
        r6.A05.A00.mReelViewerListenerManager.BLl(min, AKe);
        return true;
    }

    public final void BBP(AnonymousClass1NJ r15, ChallengeStickerModel challengeStickerModel) {
        A0m(this, "tapped");
        Context context = getContext();
        AnonymousClass0C1 r10 = this.A1F;
        C34561ew A012 = C65302ss.A01(r15);
        String APo = r15.APo();
        AnonymousClass4JZ.A00(context, A012, new C97554Jn(new AnonymousClass4IC(this), context, r15, false, (String) null, "ReelViewerFragment", this, r10, APo, challengeStickerModel, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0111, code lost:
        if (r1.A0H() == false) goto L_0x0113;
     */
    public final void BBS(C50282Fr r23, C39941no r24) {
        boolean z;
        Dialog dialog;
        A0s(this, true);
        A0m(this, "tapped");
        C50282Fr r7 = r23;
        C39941no r8 = r24;
        ReelOptionsDialog A022 = A02(r7, r8);
        this.mReelOptionsDialog = A022;
        if (r8.A0t()) {
            if (!r8.Aho() || !this.A0a.A02()) {
                if (r8.A0v()) {
                    Context context = getContext();
                    AnonymousClass6E4 r5 = new AnonymousClass6E4(this, r7);
                    AnonymousClass34H r82 = this.A2h;
                    DialogInterface.OnDismissListener onDismissListener = this.A2Z;
                    CharSequence[] A0P2 = ReelOptionsDialog.A0P(A022);
                    if (AnonymousClass6DW.A00(A022.A0U).booleanValue()) {
                        A022.A01 = onDismissListener;
                        AnonymousClass5EO r9 = new AnonymousClass5EO(A022.A0U, context);
                        for (CharSequence charSequence : A0P2) {
                            if (A022.A07.equals(charSequence)) {
                                r9.A04(String.valueOf(charSequence), new C143846Dg(A022, charSequence, r5));
                            } else {
                                r9.A05(String.valueOf(charSequence), new C143836Df(A022, charSequence, r5));
                            }
                        }
                        r9.A02 = r82;
                        r9.A00().A00(context);
                        return;
                    }
                    dialog = ReelOptionsDialog.A00(A022, A0P2, new C143826De(A022, A0P2, r5), onDismissListener);
                } else {
                    if (r7.A0I()) {
                        Reel reel = r7.A0A;
                        if (reel.A0x) {
                            if (reel.A0d()) {
                                A022.A0U(this.A2Z, this.A3I, this.A2i);
                                return;
                            }
                            return;
                        }
                    }
                    Reel reel2 = r7.A0A;
                    if (reel2.A0V() && reel2.A0x) {
                        dialog = ReelOptionsDialog.A00(A022, ReelOptionsDialog.A0O(A022), new AnonymousClass6DE(A022, this.A3F, this, this.A2i), this.A2Z);
                    } else if (r8.A0D.equals(this.A1F.A06)) {
                        A022.A0R(getContext(), this.mFragmentManager, this.A2h, this.A2Z, this.A3G, this.A3F, this.A3I, this.A3J, this.A2i, this.A0a, this);
                        return;
                    } else {
                        A022.A0T(getContext(), this.A2h, new AnonymousClass6E3(this, r8), this.A3G, this.A2Z, this.A3J, this.A3K, false, this);
                        return;
                    }
                }
                A022.A00 = dialog;
                dialog.show();
            } else if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.ADS_REPORT_REVAMP, "is_enabled_for_story_ad", false, (AnonymousClass04H) null)).booleanValue()) {
                C706536z r6 = this.A11;
                FragmentActivity activity = getActivity();
                AnonymousClass0a4.A06(activity);
                AnonymousClass1NJ r11 = r8.A08;
                AnonymousClass0a4.A06(r11);
                AnonymousClass2TH r1 = new AnonymousClass2TH(r6.A02);
                r1.A0G = new C144876Hl(r6, r8);
                AnonymousClass2TI A002 = r1.A00();
                C146146Mp A003 = C22250y6.A00.A00().A00(r6.A02, r11.getId(), true);
                A003.A00(new C146006Mb(r6, r7, r8, A002, activity, r11));
                A0r(r6.A01, true);
                Context context2 = getContext();
                C31201Wx.A00(activity);
                A002.A01(context2, A003);
            } else {
                ReelOptionsDialog reelOptionsDialog = this.mReelOptionsDialog;
                AnonymousClass6DP r62 = new AnonymousClass6DP(this, r7, r8);
                DialogInterface.OnDismissListener onDismissListener2 = this.A2Z;
                AnonymousClass6E6 r72 = new AnonymousClass6E6(this);
                AnonymousClass6E5 r83 = new AnonymousClass6E5(this);
                CharSequence[] A0P3 = ReelOptionsDialog.A0P(reelOptionsDialog);
                if (AnonymousClass6DW.A00(reelOptionsDialog.A0U).booleanValue()) {
                    AnonymousClass5EO r52 = new AnonymousClass5EO(reelOptionsDialog.A0U, reelOptionsDialog.A0H);
                    if (reelOptionsDialog.A0R.Aho()) {
                        AnonymousClass1OY r12 = reelOptionsDialog.A0T;
                        if (r12.A02()) {
                            if (!(r12 == AnonymousClass1OY.ADS_HISTORY || r12 == AnonymousClass1OY.VIEW_ADS)) {
                                CharSequence A062 = reelOptionsDialog.A0Q.A06(reelOptionsDialog.A0I.getString(C0003R.string.hide_ad));
                                reelOptionsDialog.A06 = A062;
                                r52.A04(A062.toString(), new C143906Dn(reelOptionsDialog, r62));
                            }
                            CharSequence A063 = reelOptionsDialog.A0Q.A06(reelOptionsDialog.A0I.getString(C0003R.string.report_ad));
                            reelOptionsDialog.A08 = A063;
                            r52.A04(A063.toString(), new C143806Dc(reelOptionsDialog, r62, r72));
                            CharSequence A072 = reelOptionsDialog.A0Q.A07(reelOptionsDialog.A0I.getString(C0003R.string.sponsored_label_dialog_title), C30671Ut.A0G(reelOptionsDialog.A0U, reelOptionsDialog.A0R.A08));
                            reelOptionsDialog.A05 = A072;
                            r52.A05(A072.toString(), new AnonymousClass6DV(reelOptionsDialog));
                        }
                    }
                    r52.A00().A00(reelOptionsDialog.A0H);
                    return;
                }
                Dialog A004 = ReelOptionsDialog.A00(reelOptionsDialog, A0P3, new AnonymousClass6DL(reelOptionsDialog, A0P3, r62, r72, r83), onDismissListener2);
                reelOptionsDialog.A00 = A004;
                A004.show();
            }
        } else if (r8.A0y()) {
            AnonymousClass2Ay A0C2 = r8.A0C();
            C50282Fr r13 = this.A0Y;
            if (r13 != null) {
                z = true;
            }
            z = false;
            if (A0C2.ANQ()) {
                ReelOptionsDialog reelOptionsDialog2 = this.mReelOptionsDialog;
                Context context3 = getContext();
                AnonymousClass34H r92 = this.A2h;
                DialogInterface.OnDismissListener onDismissListener3 = this.A2Z;
                AnonymousClass34J r63 = this.A3G;
                ArrayList arrayList = new ArrayList();
                arrayList.add(reelOptionsDialog2.A0I.getString(C0003R.string.save));
                if (z) {
                    arrayList.add(reelOptionsDialog2.A0I.getString(C0003R.string.reel_option_dialog_leave_group));
                }
                if (AnonymousClass6DW.A00(reelOptionsDialog2.A0U).booleanValue()) {
                    reelOptionsDialog2.A01 = onDismissListener3;
                    AnonymousClass5EO r3 = new AnonymousClass5EO(reelOptionsDialog2.A0U, context3);
                    for (int i = 0; i < arrayList.size(); i++) {
                        r3.A05(String.valueOf(arrayList.get(i)), new C143816Dd(reelOptionsDialog2, i, r63, onDismissListener3));
                    }
                    r3.A02 = r92;
                    r3.A00().A00(context3);
                    return;
                }
                Dialog A005 = ReelOptionsDialog.A00(reelOptionsDialog2, (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), new C143936Dq(reelOptionsDialog2, r63, onDismissListener3), onDismissListener3);
                reelOptionsDialog2.A00 = A005;
                A005.show();
                return;
            }
            ReelOptionsDialog reelOptionsDialog3 = this.mReelOptionsDialog;
            DialogInterface.OnDismissListener onDismissListener4 = this.A2Z;
            AnonymousClass34J r112 = this.A3G;
            boolean z2 = !r8.A0m();
            AnonymousClass0C1 r84 = this.A1F;
            AnonymousClass34R r93 = this.A3F;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(reelOptionsDialog3.A0I.getString(C0003R.string.delete));
            if (z2) {
                Resources resources = reelOptionsDialog3.A0I;
                boolean A142 = reelOptionsDialog3.A0R.A14();
                int i2 = C0003R.string.save_photo;
                if (A142) {
                    i2 = C0003R.string.save_video;
                }
                arrayList2.add(resources.getString(i2));
            }
            if (z) {
                arrayList2.add(reelOptionsDialog3.A0I.getString(C0003R.string.reel_option_dialog_leave_group));
            }
            Dialog A006 = ReelOptionsDialog.A00(reelOptionsDialog3, (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]), new AnonymousClass6DG(reelOptionsDialog3, r84, r93, this, r112, onDismissListener4), onDismissListener4);
            reelOptionsDialog3.A00 = A006;
            A006.show();
        } else {
            if (!r8.A0n()) {
                if (r8.A0o()) {
                    if (r8.A0D.equals(this.A1F.A06)) {
                        A022.A0R(getContext(), this.mFragmentManager, this.A2h, this.A2Z, new AnonymousClass5K9(this), this.A3F, this.A3I, this.A3J, this.A2i, this.A0a, this);
                        return;
                    }
                } else if (r8.A0k()) {
                    AttributedAREffect attributedAREffect = r8.A00;
                    A0C(attributedAREffect.A00, attributedAREffect.getId(), attributedAREffect.A03(), attributedAREffect.A06(), attributedAREffect.A0C(), attributedAREffect.A04(), attributedAREffect.A02(), attributedAREffect.A0B, (String) null, (ProductItemWithAR) null, attributedAREffect.AhP(), attributedAREffect.A08(), attributedAREffect.A09(), false, (String) null, attributedAREffect.A03);
                    return;
                } else if (r8.A0w()) {
                    Dialog A007 = ReelOptionsDialog.A00(A022, ReelOptionsDialog.A0P(A022), new AnonymousClass6DN(A022, ReelOptionsDialog.A0P(A022), new AnonymousClass6E4(this, r7)), this.A2Z);
                    A022.A00 = A007;
                    A007.show();
                    new C91743y2(this.A0O.A02("recommended_user_overflow_menu_tapped")).A01();
                    return;
                } else {
                    return;
                }
            }
            A0K(A022, r7.A0A, r8.A09);
        }
    }

    public final void BCi(String str, boolean z) {
    }

    public final void BDo(C50282Fr r8, C39941no r9) {
        A0Z(this, r9, r8, r9.A0I(), Constants.ZERO, "sponsor_in_header", "reel_viewer_go_to_profile");
    }

    public final void BHr(C50282Fr r3, Reel reel, C39941no r5, boolean z) {
        A0s(this, true);
        if (z) {
            this.A16.A06(r3, reel);
        } else {
            this.mViewPager.A0H(this.A16.Ad3(reel));
        }
        this.A16.A02(r5).A0J = Constants.A05;
        A0S(this);
        AnonymousClass0Z1.A00(this.A16, 413265895);
    }

    public final void BIl(String str, String str2) {
    }

    public final void BJc(C39941no r9) {
        C27341Hl A002;
        A0s(this, true);
        A0m(this, "context_switch");
        if (r9.A0E == Constants.A0Y) {
            C38031kc r4 = r9.A09;
            C103844eE A022 = C19020sn.A00.A04().A02(this.A1F, C58022fB.LIVE_VIEWER_INVITE, this);
            A022.A02(r4.A0I);
            A022.A01(this);
            A022.A00.putString("DirectShareSheetFragment.media_owner_id", r4.A0C.getId());
            A022.A00.putString("DirectShareSheetFragment.live_media_id", r4.A0P);
            A022.A00.putString("DirectShareSheetFragment.live_entry_point", "paperplane");
            A022.A00.putString("DirectShareSheetFragment.live_share_type", "post_live");
            A002 = A022.A00();
            AnonymousClass0C1 r7 = this.A1F;
            String str = r4.A0P;
            C13300iJ r2 = r4.A0C;
            String str2 = this.A1R;
            AnonymousClass0P4 A003 = AnonymousClass0P4.A00("direct_reshare_button_tap", this);
            A003.A0G("m_pk", str);
            boolean z = false;
            if (r2.A1o == Constants.A0C) {
                z = true;
            }
            A003.A0A("is_private", Boolean.valueOf(z));
            A003.A0A("is_post_live", true);
            if (str2 != null) {
                A003.A0G("session_id", str2);
            }
            AnonymousClass0WN.A01(r7).BcG(A003);
        } else {
            AnonymousClass0C1 r22 = this.A1F;
            AnonymousClass52E r3 = (AnonymousClass52E) r22.AVA(AnonymousClass52E.class, new C1173152b(r22));
            long currentTimeMillis = System.currentTimeMillis();
            if (r3.A02) {
                r3.A00 = currentTimeMillis;
            }
            C103844eE A023 = C19020sn.A00.A04().A02(this.A1F, C58022fB.STORY_SHARE, this);
            A023.A02(r9.A08.getId());
            A023.A01(this);
            A023.A00.putInt("DirectShareSheetFragment.carousel_index", 0);
            A023.A00.putString("DirectShareSheetFragment.reel_id", r9.A0F);
            A023.A00.putString("DirectShareSheetFragment.reel_viewer_module_name", getModuleName());
            A023.A00.putString("DirectShareSheetFragment.tray_session_id", this.A1R);
            A023.A00.putString("DirectShareSheetFragment.viewer_session_id", this.A1S);
            A002 = A023.A00();
            C104494fI.A02(this.A1F, r9.A08, this.A1R, this, (Integer) null);
        }
        if (isResumed()) {
            C31201Wx.A01(getActivity()).A0J(A002, new AnonymousClass8CW(this));
        }
        C51522Kz r23 = this.A0X;
        if (r23 != null) {
            C11130eT.A01.BXT(new C33451cw(r23));
            this.A0X = null;
        }
    }

    public final void BKA(AnonymousClass1NJ r4, C39941no r5, C64982sM r6) {
        this.A1m = false;
        if (r5.A0n() || r5.A0o()) {
            AnonymousClass0C1 r2 = this.A1F;
            C38031kc r1 = r5.A09;
            Integer num = Constants.A0j;
            C168297Gq.A05(r2, r1, this, num, num);
            r5.A09.A0Y = true;
            C23300zv.A00(this.A1F).BXT(new C72643Gh());
        } else if (r4 != null) {
            AnonymousClass0C1 r22 = this.A1F;
            AnonymousClass1NJ r12 = r5.A08;
            Integer num2 = Constants.A0j;
            C168297Gq.A02(r22, r12, this, num2, num2);
            if (r4.A0N.A00.equals(C49042Am.MISINFORMATION)) {
                r6.A0S = true;
                r6.A0T = true;
            } else {
                C36971iu.A00(this.A1F, r4);
            }
        }
        C72133Du r0 = this.mPhotoTimerController;
        if (r0 != null) {
            r0.A02();
        }
        C72153Dw r02 = this.mShowreelNativeTimerController;
        if (r02 != null) {
            r02.A01();
        }
        A0L(this);
    }

    public final void BKB(AnonymousClass1NJ r5, C39941no r6) {
        this.A1m = false;
        if (r6.A0n() || r6.A0o()) {
            C168297Gq.A05(this.A1F, r6.A09, this, Constants.A0j, Constants.A0u);
        } else if (r5 != null) {
            C168297Gq.A02(this.A1F, r6.A08, this, Constants.A0j, Constants.A0u);
        }
        A0R(this);
    }

    public final void BKC(AnonymousClass1NJ r5, C39941no r6) {
        this.A1m = true;
        C168297Gq.A02(this.A1F, r6.A08, this, Constants.ONE, Constants.A12);
        A0m(this, "dialog");
    }

    public final void BKE(AnonymousClass1NJ r5, C39941no r6) {
        this.A1m = true;
        if (r6.A0n() || r6.A0o()) {
            C168297Gq.A05(this.A1F, r6.A09, this, Constants.ONE, Constants.A12);
        } else if (r5 != null) {
            C168297Gq.A02(this.A1F, r6.A08, this, Constants.ONE, Constants.A12);
        }
        A0m(this, "dialog");
    }

    public final void BLA() {
        A12(false);
    }

    public final void BLD(float f, float f2, C32501bN r3) {
    }

    public final boolean BNi(C60512k1 r2, float f, float f2) {
        return false;
    }

    public final void BOB(C50282Fr r8, C39941no r9) {
        A0Z(this, r9, r8, r9.A0I(), Constants.ZERO, "sponsor_in_header", "reel_viewer_go_to_profile");
    }

    public final boolean BQT() {
        return false;
    }

    public final boolean BQU() {
        return false;
    }

    public final boolean BQY(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return A1L((View) null, motionEvent, motionEvent2, f, f2);
    }

    public final void BTR(C60512k1 r1) {
    }

    public final void BVw(Reel reel) {
        reel.A0y = false;
        this.mPhotoTimerController.A02();
        this.mShowreelNativeTimerController.A01();
        A0L(this);
    }

    public final void Bas(String str, String str2) {
    }

    public final boolean BmW(C13300iJ r2) {
        return false;
    }

    private C50282Fr A00(Reel reel, int i) {
        C50282Fr r4;
        List arrayList;
        HashMap hashMap = this.A1W;
        Reel reel2 = reel;
        int i2 = i;
        if (hashMap == null || !hashMap.containsKey(reel.getId())) {
            r4 = new C50282Fr(this.A1F, reel, i);
        } else {
            r4 = new C50282Fr(this.A1F, reel2, i2, false, (Set) this.A1W.get(reel.getId()));
        }
        C31571Yv r7 = null;
        C249916w r0 = reel.A0M;
        C249916w r1 = r0;
        if (r0 != null) {
            C27661Is r02 = this.A0U;
            C31561Yu A022 = r02.A00.A02(r1.getId());
            if (A022 == null) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList(A022.A01.size());
                for (AnonymousClass2KB r03 : A022.A01) {
                    arrayList.add(new AnonymousClass2KC(r03.A04, r03.A06));
                }
            }
            AnonymousClass0a4.A09(true);
            r7 = new C31571Yv((String) null, arrayList, 0, 0, 0);
        }
        r4.A03 = r7;
        return r4;
    }

    public static C50282Fr A01(ReelViewerFragment reelViewerFragment, String str) {
        C50282Fr ATv = reelViewerFragment.A16.ATv(str);
        if (ATv == null) {
            return reelViewerFragment.A0Y;
        }
        String A0C2 = ATv.A0C();
        C50282Fr r1 = reelViewerFragment.A0Y;
        if (!A0C2.equals(r1.A0C())) {
            return ATv;
        }
        return r1;
    }

    private ReelOptionsDialog A02(C50282Fr r22, C39941no r23) {
        AnonymousClass0C1 r15 = this.A1F;
        String str = this.A1R;
        String str2 = this.A1S;
        C50282Fr r8 = r22;
        Reel reel = r8.A0A;
        C66312vH r14 = new C66312vH(r15, str, str2, reel, r8.A02, r8.A09);
        r14.A08 = reel.A0N;
        Activity rootActivity = getRootActivity();
        Resources resources = getResources();
        AnonymousClass1OY r11 = this.A0a;
        String str3 = this.A1R;
        AnonymousClass0C1 r13 = this.A1F;
        return new ReelOptionsDialog(rootActivity, this, this, resources, r8, r23, this, r11, str3, r13, r14, this.A3Q, C29181Ox.A00(getContext(), r13), this.A0S, this.A0Z, this.A1C);
    }

    public static C59002gs A03(ReelViewerFragment reelViewerFragment) {
        C59002gs r0 = (C59002gs) C59022gu.A00.get(reelViewerFragment.A1O);
        if (r0 == null) {
            return new C124595Vl();
        }
        return r0;
    }

    private C34431ej A04() {
        View view = this.mViewPager.A0C;
        if (view == null || !(view.getTag() instanceof C34431ej)) {
            return null;
        }
        return (C34431ej) this.mViewPager.A0C.getTag();
    }

    private void A06() {
        View A0B2 = this.mViewPager.A0B(this.A14.A00);
        if (A0B2 != null && (A0B2.getTag() instanceof C34451el)) {
            ((C34451el) A0B2.getTag()).BAD();
        }
    }

    private void A07() {
        boolean A172 = A17();
        int i = this.mViewPager.A06;
        boolean z = false;
        if (i == this.A16.getCount() - 1) {
            z = true;
        }
        if (A172) {
            C50282Fr r6 = this.A0Y;
            if (r6.A0A.A0Z()) {
                AnonymousClass56S r5 = new AnonymousClass56S(getActivity(), this.A1F, this.A3S);
                this.A0k = r5;
                Activity activity = r5.A01;
                boolean z2 = false;
                if (activity != null && !activity.isFinishing() && C1646470m.A00(r5.A03)) {
                    C16180oA A002 = C16180oA.A00(r5.A03);
                    if (A002.A00.getInt("group_stories_creative_tools_nux_impressions", 0) < 3 && System.currentTimeMillis() - A002.A00.getLong("group_stories_creative_tools_nux_last_shown_time_ms", 0) > 86400000) {
                        A002.A00.edit().putInt("group_stories_creative_tools_nux_impressions", A002.A00.getInt("group_stories_creative_tools_nux_impressions", 0) + 1).apply();
                        A002.A00.edit().putLong("group_stories_creative_tools_nux_last_shown_time_ms", System.currentTimeMillis()).apply();
                        AnonymousClass2OA r7 = new AnonymousClass2OA(r5.A01);
                        r7.A0H(C019000b.A03(r5.A01, C0003R.C0004drawable.most_likely_to_dialog_icon));
                        r7.A07(C0003R.string.group_poll_dialog_title);
                        r7.A06(C0003R.string.group_poll_dialog_message);
                        r7.A0A(C0003R.string.try_it, new C176637gX(r5, r6));
                        r7.A08(C0003R.string.not_now, new C176657gZ(r5, r6));
                        r7.A0E(new C176647gY(r5, r6));
                        z2 = true;
                        r7.A0V(true);
                        r7.A03().show();
                        C701234y r0 = r5.A02;
                        if (r0 != null) {
                            r0.A00.A0h.A00.A0F(r6, "impression");
                        }
                        r5.A00 = true;
                    }
                }
                if (z2) {
                    A0m(this, "dialog");
                    return;
                }
            }
        }
        if (A172) {
            C50282Fr r1 = this.A0Y;
            if (r1.A0A.A0e()) {
                r1.A08 = true;
                A0L(this);
                C114414vs.A01("reel_viewer_view_suggested_highlight_end_card", this.A1F, this, this.A0Y.A0A.getId());
                this.A0t.A02();
            }
        }
        if (!A172 || !z) {
            if (A172) {
                A0f(this, this.A16.ATu(i + 1), true);
            } else {
                C50282Fr r2 = this.A0Y;
                r2.A0G(this.A1F, r2.A02 + 1);
                A0L(this);
            }
            this.A0t.A02();
        }
        A0M(this);
        this.A0t.A02();
    }

    private void A08() {
        if (A1D(Constants.ZERO)) {
            C60512k1 r2 = new C60512k1(getContext(), this);
            this.mDragToDismissController = r2;
            r2.BdZ(this.mViewRoot.getTranslationX(), this.mViewRoot.getTranslationY());
            C60532k3.A00(this.mDragToDismissController, this.mViewRoot);
        }
    }

    private void A09() {
        if (AnonymousClass3EB.A00(this.A1F).booleanValue()) {
            this.mMessageComposerStickerButtonHolder.A02(0);
            this.mMessageComposerSendBtn.setVisibility(8);
        } else {
            this.mMessageComposerSendBtn.setVisibility(0);
            C26571Ea r0 = this.mMessageComposerStickerButtonHolder;
            if (r0 != null) {
                r0.A02(8);
            }
        }
        C26571Ea r02 = this.mMessageComposerStickerShortcutButtonHolder;
        if (r02 != null) {
            r02.A02(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r5.A2A == false) goto L_0x0094;
     */
    private void A0A() {
        C39941no A0A2;
        C39941no r4;
        boolean z;
        boolean z2;
        C58952gn r3 = this.A16;
        C50282Fr r2 = this.A0Y;
        int i = r2.A02 + 1;
        if (i >= r2.A03(r3.A07)) {
            int Ad5 = r3.Ad5(r2) + 1;
            if (Ad5 < r3.getCount()) {
                A0A2 = r3.ATu(Ad5).A08(r3.A07);
            } else {
                A0A2 = null;
            }
        } else {
            A0A2 = r2.A0A(r3.A07, i);
        }
        if (this.A2A || this.A29) {
            this.A33.remove(this.A0Y.A08(this.A1F));
            if (A0A2 != null && !this.A33.contains(A0A2) && A1A(A0A2)) {
                this.A33.offer(A0A2);
            }
            C58952gn r22 = this.A16;
            int Ad52 = r22.Ad5(this.A0Y) + 1;
            if (Ad52 < r22.getCount()) {
                r4 = r22.ATu(Ad52).A08(r22.A07);
            } else {
                r4 = null;
            }
            C252117x A022 = C252117x.A02();
            boolean z3 = false;
            if (!this.A1Z || (!A022.A07() && !A022.A06())) {
                z = true;
            } else {
                z = false;
            }
            if (r4 != null) {
                z2 = true;
            }
            z2 = false;
            if (r4 != null && this.A29 && r4.Aho()) {
                z3 = true;
            }
            if (!z) {
                return;
            }
            if ((z2 || z3) && !this.A33.contains(r4) && A1A(r4)) {
                this.A33.offer(r4);
            }
        } else if (A0A2 != this.A2K && A1A(A0A2)) {
            this.A2K = A0A2;
        }
    }

    private void A0B(int i) {
        AnonymousClass3ER r0;
        C34431ej r3 = (C34431ej) this.mViewPager.A0C.getTag();
        if (!this.A21 || this.A2U || ((r0 = this.mSuggestedHighlightsController) != null && !(!r0.A04))) {
            r3.A0D();
            return;
        }
        if (i > -1 && this.mViewPager.A0B(i) != null) {
            C34431ej r2 = (C34431ej) this.mViewPager.A0B(i).getTag();
            if (!this.A16.ATu(i).A0J(this.A1F)) {
                r2.A0B();
            }
        }
        r3.A0C();
    }

    private void A0H(C39941no r18, boolean z, String str) {
        String str2;
        C39941no r1 = r18;
        String A002 = C100994Xy.A00(getContext(), r1.A0P(this.A1F), false);
        AnonymousClass0a4.A06(A002);
        C50282Fr A012 = A01(this, r1.A0F);
        AnonymousClass0RU A013 = AnonymousClass0WN.A01(this.A1F);
        AnonymousClass1NJ r5 = r1.A08;
        C66312vH r10 = new C66312vH(this.A1F, this.A1R, this.A1S, A012.A0A, A012.A02, A012.A09);
        boolean z2 = z;
        if (z) {
            str2 = "open_iab_url";
        } else {
            str2 = "open_disclaimer_fragment";
        }
        String str3 = null;
        String str4 = str;
        if (z) {
            str3 = str4;
        }
        String str5 = str4;
        if (z) {
            str5 = null;
        }
        C36901in.A08(A013, r5, this, r10, str2, A002, str3, str5);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        C52362Om r4 = new C52362Om(activity, this.A1F);
        r4.A0B = true;
        C227559qh A003 = C18920sd.A00.A00();
        AnonymousClass0C1 r11 = this.A1F;
        r4.A02 = A003.A00(r11, z2, A002, str4, C30671Ut.A0B(r11, r1.A08));
        r4.A02();
    }

    private void A0I(C50282Fr r16) {
        if (!this.A1u) {
            C50282Fr r10 = r16;
            if (r16 != null) {
                if (Ah2()) {
                    A0s(this, true);
                }
                if (!A1C(this)) {
                    this.A2E = this.mViewPager.getTranslationX();
                    this.A2F = this.mViewPager.getTranslationY();
                    this.A2D = this.mViewPager.getScaleY();
                    this.A2G = this.A2w.A00;
                } else {
                    Reel reel = r10.A0A;
                    C39941no A082 = r10.A08(this.A1F);
                    this.A1u = true;
                    View A0B2 = this.mViewPager.A0B(this.A16.Ad3(r10.A0A));
                    C59002gs A032 = A03(this);
                    boolean z = this.A2P;
                    C59012gt r3 = A032.A02;
                    r3.A00 = z;
                    Set set = this.A32;
                    r3.A02.clear();
                    r3.A02.addAll(set);
                    A032.A02.A01 = this.mReelViewerListenerManager.Apf();
                    C60632kD r6 = new C60632kD(this, A0B2, A032, r10, reel, A082);
                    A032.A04(reel, A082, r6, this.A2S, true, ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_VIEWER_HIDE_ANIMATION, "force_callback_on_timeout", false, (AnonymousClass04H) null)).booleanValue());
                    return;
                }
            }
            A0M(this);
        }
    }

    private void A0J(C50282Fr r6, C39941no r7, Integer num, boolean z) {
        int i = 0;
        boolean z2 = false;
        if (num == Constants.A0C) {
            z2 = true;
        }
        this.A1q = z2;
        this.A0l.A05 = z;
        A0s(this, true);
        A0m(this, "tapped");
        C26571Ea r1 = this.mGroupStoryReplyPromptHolder;
        if (!r6.A0H()) {
            i = 8;
        }
        r1.A02(i);
        this.mMessageComposerText.setHint(C65352sx.A00(r6, r7, this.A0a, getResources()));
        this.mMessageComposerSendBtn.setOnClickListener(new AnonymousClass6QT(this, r7, r6, z2));
        this.mMessageComposerText.setOnEditorActionListener(new AnonymousClass6QU(this, r7, r6, z2));
        this.mMessageComposerText.requestFocus();
        C06220Of.A0G(this.mMessageComposerText);
        this.A2R = true;
        if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_COMPOSE_MESSAGE_LOGGING_FIX_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A0f.A0D(r6, this.A16.A02(r6.A08(this.A1F)).A07, this.A16.A02(r6.A08(this.A1F)).A06, num);
        }
    }

    public static void A0L(ReelViewerFragment reelViewerFragment) {
        int i;
        ReboundViewPager reboundViewPager = reelViewerFragment.mViewPager;
        if (reboundViewPager != null && (i = reboundViewPager.A06) >= 0 && i < reelViewerFragment.A16.getCount()) {
            C58952gn r2 = reelViewerFragment.A16;
            ReboundViewPager reboundViewPager2 = reelViewerFragment.mViewPager;
            r2.A04(reboundViewPager2.A0C, reboundViewPager2.A06);
            reelViewerFragment.A10(Constants.ZERO);
        }
    }

    public static void A0M(ReelViewerFragment reelViewerFragment) {
        AnonymousClass1AM r0 = reelViewerFragment.mFragmentManager;
        FragmentActivity activity = reelViewerFragment.getActivity();
        if (r0 != null && AnonymousClass1H4.A01(r0) && activity != null) {
            activity.onBackPressed();
        }
    }

    public static void A0P(ReelViewerFragment reelViewerFragment) {
        C39941no A082 = reelViewerFragment.A0Y.A08(reelViewerFragment.A1F);
        C64982sM A022 = reelViewerFragment.A16.A02(A082);
        A022.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        C64982sM.A00(A022, 1);
        reelViewerFragment.mPhotoTimerController.A02();
        C72133Du r2 = reelViewerFragment.mPhotoTimerController;
        AnonymousClass0a4.A07(A082.A01, "SU unit is missing suggested users model");
        r2.A03(A082, (long) (A082.A01.A00 * 1000));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0278, code lost:
        if (r3.A08 != 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028e, code lost:
        if (r3.A08 != 0) goto L_0x0290;
     */
    public static void A0Q(ReelViewerFragment reelViewerFragment) {
        boolean z;
        C50282Fr r5;
        boolean z2;
        int i;
        String str;
        boolean z3;
        String str2;
        String str3;
        C92873zr r4;
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        if (reelViewerFragment2.A0Y == null) {
            int count = reelViewerFragment2.A16.getCount();
            int i2 = reelViewerFragment2.A0E;
            if (count > i2) {
                C50282Fr r6 = (C50282Fr) reelViewerFragment2.A16.getItem(i2);
                reelViewerFragment2.A0Y = r6;
                int i3 = reelViewerFragment2.A0F;
                if (i3 != -1) {
                    AnonymousClass0C1 r42 = reelViewerFragment2.A1F;
                    if (!r6.A0C) {
                        int min = Math.min(i3, r6.A03(r42) - 1);
                        r6.A00 = min;
                        r6.A0G(r42, min);
                    }
                    reelViewerFragment2.A0F = -1;
                } else {
                    String str4 = reelViewerFragment2.A1P;
                    if (str4 != null) {
                        int A052 = r6.A05(reelViewerFragment2.A1F, str4);
                        if (A052 >= 0) {
                            C50282Fr r52 = reelViewerFragment2.A0Y;
                            AnonymousClass0C1 r43 = reelViewerFragment2.A1F;
                            if (!r52.A0C) {
                                int min2 = Math.min(A052, r52.A03(r43) - 1);
                                r52.A00 = min2;
                                r52.A0G(r43, min2);
                            }
                        }
                        reelViewerFragment2.A1P = null;
                    }
                }
                C50282Fr r0 = reelViewerFragment2.A0Y;
                if (!(r0 == null || (r4 = r0.A0A.A0A) == null)) {
                    reelViewerFragment2.A32.add(r4);
                }
                C249916w A0B2 = reelViewerFragment2.A0Y.A0B();
                AnonymousClass0C1 r62 = reelViewerFragment2.A1F;
                AnonymousClass3EY r53 = new AnonymousClass3EY(r62);
                C486028s r44 = new C486028s();
                r44.A04 = "v2.3";
                r44.A02 = Constants.ONE;
                r44.A05 = C486528y.A00;
                r44.A03 = C14100jl.A00(r62);
                r44.A04(AnonymousClass290.class);
                r44.A00 = new AnonymousClass3EZ();
                C17850qu A012 = r44.A01();
                A012.A00 = r53;
                C12810hQ.A02(A012);
                long j = reelViewerFragment2.A0I;
                long j2 = 0;
                if (j > 0) {
                    j2 = System.currentTimeMillis() - j;
                }
                Reel reel = reelViewerFragment2.A0Y.A0A;
                reelViewerFragment2.A06 = reelViewerFragment2.A0E;
                if (!reel.A0W() || reel.A0C.A04().isEmpty()) {
                    str2 = null;
                    str3 = null;
                } else {
                    str2 = ((C13300iJ) reel.A0C.A04().iterator().next()).getId();
                    str3 = reel.A0C.A0P;
                }
                AnonymousClass35C r22 = reelViewerFragment2.A0f;
                int i4 = reelViewerFragment2.A0Y.A09;
                boolean z4 = reelViewerFragment2.A1e;
                boolean A0W2 = reel.A0W();
                boolean A0b2 = reel.A0b();
                int i5 = reelViewerFragment2.A0A;
                int i6 = reelViewerFragment2.A0H;
                int i7 = reelViewerFragment2.A08;
                int i8 = reelViewerFragment2.A09;
                int i9 = reelViewerFragment2.A0G;
                String A0I2 = reel.A0I();
                String str5 = reelViewerFragment2.A1K;
                Integer num = reelViewerFragment2.A1H;
                boolean z5 = reelViewerFragment2.A1Y;
                AnonymousClass35F r63 = r22.A04;
                r63.A00 = reel;
                C37141jB A032 = C37591ju.A03("reel_playback_entry", r63);
                A032.A4N = reel.getId();
                A032.A4T = r22.A0C;
                A032.A1Y = i4;
                A032.A57 = r22.A06.AaT();
                A032.A21 = A0B2;
                A032.A2E = Boolean.valueOf(z4);
                A032.A2N = Boolean.valueOf(reel.A0h(r22.A07));
                A032.A1F = i5;
                A032.A4O = r22.A0A;
                A032.A1e = i6;
                A032.A2a = Boolean.valueOf(A0W2);
                A032.A17 = i7;
                A032.A2Z = Boolean.valueOf(A0b2);
                A032.A1E = i8;
                A032.A1d = i9;
                AnonymousClass35F r10 = r22.A04;
                r10.A00 = reel;
                A032.A4g = r10.getModuleName();
                A032.A4U = A0I2;
                A032.A3o = str5;
                A032.A2r = num;
                A032.A4m = r22.A0B;
                A032.A1u = j2;
                A032.A2p = Boolean.valueOf(z5);
                if (str2 != null) {
                    A032.A3v = str3;
                    A032.A3G = str2;
                }
                C36901in.A03(AnonymousClass0WN.A01(r22.A07), A032.A03(), Constants.ZERO);
                if (!reelViewerFragment2.A1Y) {
                    AnonymousClass00B.A01.markerEnd(17301505, reelViewerFragment2.A0Y.A0A.getId().hashCode(), 3);
                }
            }
            C58952gn r54 = reelViewerFragment2.A16;
            int i10 = reelViewerFragment2.A0E;
            if (i10 > r54.A01) {
                r54.A01 = i10;
            }
            if (i10 < r54.A00) {
                r54.A00 = i10;
            }
            C50282Fr r02 = reelViewerFragment2.A0Y;
            if (r02 != null) {
                Reel reel2 = r02.A0A;
                synchronized (reel2.A12) {
                    Iterator it = reel2.A0g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((AnonymousClass2Ay) it.next()).AcF()) {
                                z3 = true;
                                break;
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (z3) {
                    AnonymousClass347 r64 = reelViewerFragment2.A2g;
                    AnonymousClass0C1 r7 = reelViewerFragment2.A1F;
                    FragmentActivity requireActivity = reelViewerFragment2.requireActivity();
                    AnonymousClass347.A00(r64, r7, requireActivity, requireActivity.getString(C0003R.string.self_harm_can_we_help), Uri.parse("https://help.instagram.com/resources/63617265"), requireActivity.getString(C0003R.string.self_harm_help_info), requireActivity.getString(C0003R.string.self_harm_get_support), (String) null, reelViewerFragment2, new C1173252c(reelViewerFragment2), "ssi", (String) null, new C222409hw(reelViewerFragment2));
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            reelViewerFragment2.getActivity().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(reelViewerFragment2.A2H);
        }
        if (!(reelViewerFragment2.A16.getCount() == 0 || (r5 = reelViewerFragment2.A0Y) == null)) {
            if (reelViewerFragment2.A0a == AnonymousClass1OY.PUSH_NOTIFICATION) {
                z2 = true;
            }
            z2 = false;
            if (!z2 || !r5.A0J(reelViewerFragment2.A1F)) {
                C50282Fr r45 = reelViewerFragment2.A0Y;
                if (r45 != null) {
                    i = reelViewerFragment2.A16.Ad5(r45);
                } else {
                    i = 0;
                }
                reelViewerFragment2.mViewPager.A0K(reelViewerFragment2.A16, (float) i);
                AnonymousClass377 r72 = reelViewerFragment2.A0v;
                C50282Fr r46 = reelViewerFragment2.A0Y;
                if (r72.A0H.A01()) {
                    RecyclerView recyclerView = r72.A03;
                    AnonymousClass11J.A00(recyclerView);
                    AnonymousClass377.A01(r72, recyclerView, r46.A0C(), false);
                }
                AnonymousClass37E r47 = reelViewerFragment2.A10;
                if (r47 != null) {
                    reelViewerFragment2.mViewPager.A0L(r47);
                }
                reelViewerFragment2.mViewPager.A0L(reelViewerFragment2.A0u);
                reelViewerFragment2.A10(Constants.ZERO);
                if (reelViewerFragment2.A23) {
                    reelViewerFragment2.A23 = false;
                    C12670hC.A05(new AnonymousClass4IO(reelViewerFragment2));
                }
                if (reelViewerFragment2.A25) {
                    reelViewerFragment2.A25 = false;
                    C12670hC.A05(new AnonymousClass6QY(reelViewerFragment2));
                }
                if (reelViewerFragment2.A24) {
                    reelViewerFragment2.A24 = false;
                    C12670hC.A05(new C143976Du(reelViewerFragment2));
                }
                if (!TextUtils.isEmpty(reelViewerFragment2.A1Q)) {
                    C12670hC.A05(new AnonymousClass5PX(reelViewerFragment2, reelViewerFragment2.A1Q));
                    reelViewerFragment2.A1Q = null;
                }
                reelViewerFragment2.A0B(-1);
                reelViewerFragment2.A2U = false;
                if (reelViewerFragment2.A0Y.A0A.A0x && (str = reelViewerFragment2.A1J) != null) {
                    reelViewerFragment2.A0l.A01(str, reelViewerFragment2.A2y);
                    return;
                }
                return;
            }
        }
        if (reelViewerFragment2.A0a == AnonymousClass1OY.PUSH_NOTIFICATION) {
            z = true;
        }
        z = false;
        if (z) {
            AnonymousClass5F9.A00(reelViewerFragment2.getContext(), C0003R.string.story_push_notification_launch_failure);
        }
        C12670hC.A05(new C122625Ng(reelViewerFragment2));
    }

    public static void A0S(ReelViewerFragment reelViewerFragment) {
        C92873zr r1;
        C50282Fr r0 = (C50282Fr) reelViewerFragment.A16.getItem(reelViewerFragment.mViewPager.A06);
        reelViewerFragment.A0Y = r0;
        if (r0.A0D) {
            reelViewerFragment.A2P = true;
        }
        C58952gn r2 = reelViewerFragment.A16;
        int i = reelViewerFragment.mViewPager.A06;
        if (i > r2.A01) {
            r2.A01 = i;
        }
        if (i < r2.A00) {
            r2.A00 = i;
        }
        C39941no A1E2 = reelViewerFragment.A1E();
        if (A1E2 != null && reelViewerFragment.A16.A02(A1E2).A0O) {
            reelViewerFragment.A16.A02(A1E2).A03();
        }
        C50282Fr r02 = reelViewerFragment.A0Y;
        if (!(r02 == null || (r1 = r02.A0A.A0A) == null)) {
            reelViewerFragment.A32.add(r1);
        }
        reelViewerFragment.A09();
    }

    public static void A0U(ReelViewerFragment reelViewerFragment, Bundle bundle, RectF rectF) {
        if (rectF != null) {
            bundle.putParcelable("camera_entry_bounds", rectF);
        }
        C59032gv A002 = C59032gv.A00(reelViewerFragment.A1F, TransparentModalActivity.class, "attribution_quick_camera_fragment", bundle, reelViewerFragment.getActivity());
        A002.A08(reelViewerFragment);
        if (rectF == null) {
            A002.A0A = new int[]{C0003R.anim.bottom_in, C0003R.anim.top_out, C0003R.anim.top_in, C0003R.anim.bottom_out};
        }
        A002.A07(reelViewerFragment, 60571);
    }

    public static void A0W(ReelViewerFragment reelViewerFragment, Hashtag hashtag) {
        C59032gv r3 = new C59032gv(reelViewerFragment.A1F, ModalActivity.class, "hashtag_feed", C17910r0.A00.A01().A00(hashtag, reelViewerFragment.getModuleName(), "DEFAULT"), reelViewerFragment.getActivity());
        r3.A0A = ModalActivity.A05;
        r3.A06(reelViewerFragment.getContext());
    }

    public static void A0Y(ReelViewerFragment reelViewerFragment, C39941no r4) {
        String str;
        C34561ew A032;
        C57652eY r0 = reelViewerFragment.mVideoPlayer;
        if (r0 != null && r0.Ai1() && r4 != null && AnonymousClass30D.A00(r4)) {
            if (!r4.A0t() || (A032 = C65302ss.A03(r4.A08.A15())) == null) {
                str = null;
            } else {
                str = A032.A0H;
            }
            Toast toast = reelViewerFragment.A0J;
            if (toast != null) {
                toast.cancel();
            }
            reelViewerFragment.A0J = AnonymousClass5F9.A03(reelViewerFragment.getContext(), str, 0);
        }
    }

    public static void A0Z(ReelViewerFragment reelViewerFragment, C39941no r18, C50282Fr r19, C13300iJ r20, Integer num, String str, String str2) {
        if (r20 == null) {
            AnonymousClass0QD.A02("ReelViewerFragment#goToProfilePageIfEnabled with null user", "Not expecting to navigate to profile page without a user");
            return;
        }
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        if (!reelViewerFragment2.A0Z.A0H) {
            boolean A0r2 = r20.A0r();
            C39941no r2 = r18;
            reelViewerFragment2.A16.A02(r2).A0A++;
            C50282Fr r5 = r19;
            if (r2.A0c()) {
                AnonymousClass0C1 r7 = reelViewerFragment2.A1F;
                C36901in.A0F(r7, AnonymousClass0WN.A01(r7), reelViewerFragment2, r2.A07(), new C66312vH(reelViewerFragment2.A1F, reelViewerFragment2.A1R, reelViewerFragment2.A1S, r5.A0A, r5.A02, r5.A09), A0r2, num, str, (AnonymousClass1I6) null);
            }
            if (!A0r2) {
                A0o(reelViewerFragment2, r20.getId(), str2, r5, r2);
            } else if (((Boolean) AnonymousClass0L6.A02(reelViewerFragment2.A1F, AnonymousClass0L7.PBIA_PROXY_PROFILE_IN_STORY, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                C52362Om r6 = new C52362Om(reelViewerFragment2.getActivity(), reelViewerFragment2.A1F);
                r6.A0B = true;
                C22060xm.A00.A00();
                AnonymousClass1NJ r1 = r2.A08;
                String APo = r1.APo();
                String A022 = C30671Ut.A02(reelViewerFragment2.A1F, r1);
                Bundle bundle = new Bundle();
                bundle.putString("PBIAProxyProfileFragment.MEDIA_ID", APo);
                bundle.putString("PBIAProxyProfileFragment.AD_ID", A022);
                bundle.putInt("PBIAProxyProfileFragment.FEED_POSITION", -1);
                bundle.putInt("PBIAProxyProfileFragment.CAROUSEL_INDEX", 0);
                C147696Sz r0 = new C147696Sz();
                r0.setArguments(bundle);
                r6.A02 = r0;
                r6.A02();
            }
        }
    }

    public static void A0a(ReelViewerFragment reelViewerFragment, C39941no r13, AnonymousClass6QX r14, C50282Fr r15, boolean z) {
        String str;
        String str2 = r14.A01;
        if (str2 != null && !str2.isEmpty()) {
            AnonymousClass35C.A09(reelViewerFragment.A0f, "reel_send_message", r15, reelViewerFragment.A16.A02(r15.A08(reelViewerFragment.A1F)).A07, reelViewerFragment.A16.A02(r15.A08(reelViewerFragment.A1F)).A06, (String) null, Boolean.valueOf(!TextUtils.isEmpty(r14.A00)));
            boolean A0o2 = r13.A0o();
            DirectShareTarget A002 = C38271l0.A00(r15, r13);
            if (A0o2) {
                str = "live_replay_reel";
            } else {
                str = "reel";
            }
            C19020sn r4 = C19020sn.A00;
            if (A0o2) {
                r4.A0D(reelViewerFragment.A1F, A002, r13.A0F, r13.A09, (int) (((long) reelViewerFragment.mVideoPlayer.AJJ()) / 1000), str2, str);
            } else {
                AnonymousClass6ED r5 = new AnonymousClass6ED(A002, r13.A0D.getId(), r13.A0F, r13.A08, str2, str);
                if (!TextUtils.isEmpty(r14.A00)) {
                    r5.A03 = r14.A00;
                }
                if (z && r13.A15(C34181eD.HMU)) {
                    String A042 = reelViewerFragment.A1F.A04();
                    r5.A02 = "hit_me_up";
                    r5.A01 = A042;
                }
                r4.A0C(reelViewerFragment.A1F, r5.A00());
            }
            C06220Of.A0E(reelViewerFragment.mMessageComposerText);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r15 == null) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r9.A1F, p000X.AnonymousClass0L7.STORIES_PROJECT_ECLIPSE, "show_camera_reply_thumbnail", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0029;
     */
    public static void A0c(ReelViewerFragment reelViewerFragment, C50282Fr r10, DirectCameraViewModel directCameraViewModel, String str, RectF rectF, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        RectF rectF2;
        String str5;
        if (str2 != null) {
            z = false;
        }
        z = true;
        AnonymousClass0a4.A09(z);
        if (r10.A0H()) {
            z2 = true;
        }
        z2 = false;
        String A0C2 = r10.A0C();
        int i = r10.A02;
        if (!reelViewerFragment.A1r || rectF == null) {
            rectF2 = rectF;
        } else {
            int A082 = C06220Of.A08(reelViewerFragment.getContext());
            rectF2 = new RectF(rectF.left, (float) (A082 - reelViewerFragment.mMessageComposerContainer.getHeight()), rectF.right, (float) A082);
        }
        String str6 = str4;
        C86323oq.A07(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", directCameraViewModel);
        bundle.putBoolean("DirectReplyCameraFragments.ARG_REPLY_THUMBNAIL_ENABLED", z2);
        bundle.putString("DirectVisualReplyFragment.ARG_REPLY_REEL_ID", A0C2);
        bundle.putInt("DirectVisualReplyFragment.ARG_REPLY_REEL_CURRENT_ITEM_INDEX", i);
        bundle.putString("DirectVisualReplyFragment.REPLY_CAM_ARG_REPLY_TYPE", "story");
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_EXIT_VIEW_BOUNDS", rectF2);
        bundle.putString("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", str);
        bundle.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_AR_EFFECT_ID", str2);
        bundle.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INITIAL_CANVAS_ELEMENT", str3);
        if (str4 != null) {
            bundle.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INIT_MODE", str6);
        }
        AnonymousClass0C1 r3 = reelViewerFragment.A1F;
        Class<TransparentModalActivity> cls = TransparentModalActivity.class;
        if (r10.A0H()) {
            str5 = "direct_quick_reply_camera_fragment";
        } else {
            str5 = "direct_visual_reply_fragment";
        }
        C59032gv A002 = C59032gv.A00(r3, cls, str5, bundle, reelViewerFragment.getActivity());
        A002.A08(reelViewerFragment);
        A002.A06(reelViewerFragment.getContext());
        C39731nP.A0W.A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0123, code lost:
        if (p000X.C12800hP.A0J(r3) == false) goto L_0x0125;
     */
    public static void A0d(ReelViewerFragment reelViewerFragment, C50282Fr r20, C39941no r21) {
        boolean z;
        boolean z2;
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        boolean z3 = true;
        C39941no r10 = r21;
        if (!AnonymousClass2ZP.A03(reelViewerFragment2.A1F)) {
            if (r10.A08 != null) {
                AnonymousClass37M A002 = AnonymousClass37M.A00(reelViewerFragment2.A1F);
                AnonymousClass1NJ r1 = r10.A08;
                String APo = r1.APo();
                if (!r1.A1Z() && r1.A0B != 19) {
                    z3 = false;
                }
                boolean A012 = C943446b.A01(reelViewerFragment2.A1F);
                boolean A003 = C943446b.A00(reelViewerFragment2.A1F);
                synchronized (A002) {
                    int i = C16180oA.A00(A002.A01).A00.getInt("self_story_facebook_button_for_non_fbc_impression_count", 0);
                    AnonymousClass0P4 A004 = AnonymousClass0P4.A00("ig_fb_story_xpost_upsell_events", (AnonymousClass0RN) null);
                    A004.A0G("upsell_name", AnonymousClass563.A00(Constants.ZERO));
                    A004.A0G("upsell_surface", AnonymousClass58F.A00(Constants.A0u));
                    A004.A0G("event_name", C1184056k.A00(Constants.ONE));
                    A004.A0E("num_of_views", Integer.valueOf(i));
                    A004.A0G("ig_story_media_id", APo);
                    A004.A0A("xpost_media_flag", Boolean.valueOf(z3));
                    A004.A0A("is_expanded", Boolean.valueOf(A012));
                    A004.A0A("is_relax_constraint_enabled", Boolean.valueOf(A003));
                    AnonymousClass0WN.A01(A002.A01).BcG(A004);
                }
            }
            A0m(reelViewerFragment2, "dialog");
            AnonymousClass37M A005 = AnonymousClass37M.A00(reelViewerFragment2.A1F);
            synchronized (A005) {
                if (!A005.A02.isEmpty()) {
                    ((AtomicBoolean) A005.A02.peek()).set(false);
                }
            }
            AnonymousClass33U.A05.A03(reelViewerFragment2, new AnonymousClass1KT(reelViewerFragment2.A1F, reelViewerFragment2, reelViewerFragment2, new C1183556f(reelViewerFragment2, r10, r20)), C126785c0.REEL_VIEWER_SELF_STORY, reelViewerFragment2.A1F);
            return;
        }
        AnonymousClass1NJ r0 = r10.A08;
        AnonymousClass1NJ r12 = r0;
        if (r0 == null || (!r0.A1Z() && r12.A0B != 19)) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass0C1 r3 = reelViewerFragment2.A1F;
        AnonymousClass0P4 A006 = AnonymousClass0P4.A00("ig_reel_one_tap_fb_sharing", reelViewerFragment2);
        A006.A0A("media_is_currently_shared_to_fb", Boolean.valueOf(z));
        AnonymousClass0WN.A01(r3).BcG(A006);
        if (!z) {
            reelViewerFragment2.A1k = true;
            AnonymousClass0C1 r32 = reelViewerFragment2.A1F;
            if (C16180oA.A00(r32).A00.getBoolean("has_seen_story_share_to_facebook_dialog", false)) {
                z2 = false;
            }
            z2 = true;
            if (z2) {
                A0m(reelViewerFragment2, "dialog");
                if (!AnonymousClass2ZP.A03(reelViewerFragment2.A1F)) {
                    reelViewerFragment2.A1d = true;
                }
                AnonymousClass0C1 r122 = reelViewerFragment2.A1F;
                FragmentActivity activity = reelViewerFragment2.getActivity();
                AnonymousClass34W r14 = reelViewerFragment2.A2j;
                DialogInterface.OnDismissListener onDismissListener = reelViewerFragment2.A2a;
                AnonymousClass34X r13 = reelViewerFragment2.A2k;
                C126785c0 r2 = C126785c0.REEL_VIEWER_SELF_STORY;
                if (!AnonymousClass2ZP.A03(r122)) {
                    new AnonymousClass1KT(r122, reelViewerFragment2, reelViewerFragment2, new C1185356x(r10, activity, r122, onDismissListener, r14, reelViewerFragment2, r13)).A00(r2);
                } else {
                    ReelOptionsDialog.A07(r10, activity, r122, onDismissListener, r14, reelViewerFragment2);
                }
            } else {
                A0m(reelViewerFragment2, "dialog");
                int A032 = C16180oA.A00(reelViewerFragment2.A1F).A03();
                if (!((Boolean) AnonymousClass0L6.A02(reelViewerFragment2.A1F, AnonymousClass0L7.SELF_STORY_SETTING_OPTION_IN_MENU, "enabled", false, (AnonymousClass04H) null)).booleanValue() || AnonymousClass3GP.A02(reelViewerFragment2.A1F) || A032 >= 2) {
                    AnonymousClass0C1 r142 = reelViewerFragment2.A1F;
                    FragmentActivity activity2 = reelViewerFragment2.getActivity();
                    DialogInterface.OnDismissListener onDismissListener2 = reelViewerFragment2.A2b;
                    AnonymousClass34W r33 = reelViewerFragment2.A2j;
                    AnonymousClass2OA r22 = new AnonymousClass2OA(activity2);
                    r22.A0U(true);
                    r22.A0V(true);
                    r22.A0A(C0003R.string.share_to_facebook_title, new C1184856s(r142, reelViewerFragment2, r33, r10));
                    r22.A0F(onDismissListener2);
                    r22.A03().show();
                    C1183756h.A01(r142, reelViewerFragment2, AnonymousClass563.A00(Constants.ONE), AnonymousClass58F.A00(Constants.A0u), C1185056u.A00(Constants.ZERO), -1);
                    return;
                }
                C16180oA.A00(reelViewerFragment2.A1F).A00.edit().putInt("self_story_sharing_option_dialog_show_times", A032 + 1).apply();
                if (reelViewerFragment2.A0R == null) {
                    AnonymousClass0C1 r23 = reelViewerFragment2.A1F;
                    AnonymousClass0C1 r16 = r23;
                    reelViewerFragment2.A0R = new AnonymousClass571(reelViewerFragment2, r16, A05(reelViewerFragment2), reelViewerFragment2, reelViewerFragment2.A2f, AnonymousClass563.A00(Constants.ONE), AnonymousClass58F.A00(Constants.A0u));
                }
                reelViewerFragment2.A0R.A01(r10);
            }
        } else {
            AnonymousClass0C1 r34 = reelViewerFragment2.A1F;
            AnonymousClass0P4 A007 = AnonymousClass5DW.A00(reelViewerFragment2, "", r34, (String) null, (Integer) null, "one_tap_share");
            A007.A0G("event", "fb_ig_client_already_shared_one_tap_share");
            AnonymousClass0WN.A01(r34).BcG(A007);
            AnonymousClass5F9.A01(reelViewerFragment2.getContext(), C0003R.string.previously_shared_to_facebook_message, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r4.Aho() != false) goto L_0x000f;
     */
    public static void A0e(ReelViewerFragment reelViewerFragment, C50282Fr r3, C39941no r4, Integer num) {
        boolean z;
        AnonymousClass1NJ r0 = r4.A08;
        if (r0 != null && r0.A3d) {
            z = true;
        }
        z = false;
        reelViewerFragment.A0J(r3, r4, num, z);
    }

    public static void A0f(ReelViewerFragment reelViewerFragment, C50282Fr r3, boolean z) {
        reelViewerFragment.A0o.A00();
        int Ad5 = reelViewerFragment.A16.Ad5(r3);
        if (z) {
            reelViewerFragment.mViewPager.A0H(Ad5);
            return;
        }
        reelViewerFragment.mViewPager.A0I(Ad5);
        A0L(reelViewerFragment);
    }

    public static void A0j(ReelViewerFragment reelViewerFragment, C34421ei r19, C50282Fr r20, C39941no r21) {
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        C50282Fr r6 = r20;
        int A032 = r6.A03(reelViewerFragment2.A1F);
        C39941no r7 = r21;
        int A042 = r6.A04(reelViewerFragment2.A1F, r7);
        C34081e0 r3 = reelViewerFragment2.A18;
        AnonymousClass0C1 r4 = reelViewerFragment2.A1F;
        C64982sM A022 = reelViewerFragment2.A16.A02(r7);
        ReelViewerConfig reelViewerConfig = reelViewerFragment2.A0Z;
        boolean z = r6.A0A.A0x;
        AnonymousClass35V r14 = reelViewerFragment2.A0t;
        AnonymousClass1OY r15 = reelViewerFragment2.A0a;
        boolean z2 = reelViewerFragment2.A21;
        C34421ei r5 = r19;
        boolean z3 = z2;
        C34081e0.A02(r3, r4, r5, r6, r7, A022, reelViewerConfig, A032, A042, z, reelViewerFragment2, r14, r15, false, z3, reelViewerFragment, reelViewerFragment2.A0b, reelViewerFragment2.A0c);
        reelViewerFragment2.BW2(r5, r6, r7);
    }

    public static void A0l(ReelViewerFragment reelViewerFragment, C13300iJ r3, String str) {
        if (!reelViewerFragment.A0Z.A0H) {
            A0o(reelViewerFragment, r3.getId(), str, (C50282Fr) null, (C39941no) null);
        }
    }

    public static void A0m(ReelViewerFragment reelViewerFragment, String str) {
        ObjectAnimator objectAnimator;
        reelViewerFragment.mVideoPlayer.BWu(str);
        reelViewerFragment.mPhotoTimerController.A00();
        reelViewerFragment.mShowreelNativeTimerController.A00();
        reelViewerFragment.mReelViewerListenerManager.BE0();
        View view = reelViewerFragment.mViewPager.A0C;
        if (view != null && (view.getTag() instanceof C65132sb) && (objectAnimator = ((C65132sb) view.getTag()).A0K.A00) != null) {
            objectAnimator.pause();
        }
    }

    public static void A0n(ReelViewerFragment reelViewerFragment, String str, Integer num) {
        reelViewerFragment.A0d.BPK(str, reelViewerFragment.A0Y);
        AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(reelViewerFragment.A1F).A02(str);
        if (num == Constants.ONE) {
            AnonymousClass5F9.A01(reelViewerFragment.getContext(), C0003R.string.report_thanks_toast_msg, 1);
        } else if (num == Constants.A12) {
            AnonymousClass5F9.A01(reelViewerFragment.getContext(), C0003R.string.report_thanks_toast_msg_false_news, 1);
        }
        C36791ic.A00(reelViewerFragment.A1F).A01(A022, true);
        reelViewerFragment.A0Y.A0A.A0K();
        C23300zv.A00(reelViewerFragment.A1F).BXT(new C711639e(reelViewerFragment.A0Y.A0A));
    }

    public static void A0o(ReelViewerFragment reelViewerFragment, String str, String str2, C50282Fr r13, C39941no r14) {
        C52902Qq A012 = C52902Qq.A01(reelViewerFragment.A1F, str, str2, reelViewerFragment.getModuleName());
        if (!(r13 == null || r14 == null)) {
            A012.A03 = new SourceModelInfoParams(reelViewerFragment.A1S, reelViewerFragment.A1R, r14.A0F, r13.A02, r13.A09, r14.getId());
        }
        C59032gv r3 = new C59032gv(reelViewerFragment.A1F, ModalActivity.class, "profile", C18980sj.A00.A00().A00(A012.A03()), reelViewerFragment.getActivity());
        r3.A0A = ModalActivity.A05;
        r3.A06(reelViewerFragment.getContext());
    }

    public static void A0p(ReelViewerFragment reelViewerFragment, String str, Map map, C39941no r5) {
        if (!reelViewerFragment.A1f) {
            reelViewerFragment.A1f = true;
            C53562Th A002 = C53572Ti.A00(reelViewerFragment.A1F, str, map);
            A002.A00 = new AnonymousClass2VC(reelViewerFragment, r5);
            reelViewerFragment.schedule(A002);
        }
    }

    public static void A0q(ReelViewerFragment reelViewerFragment, List list) {
        int count = reelViewerFragment.A16.getCount();
        for (int i = 0; i < list.size(); i++) {
            Reel reel = (Reel) list.get(i);
            reelViewerFragment.A0H += reel.A0m(reelViewerFragment.A1F) ? 1 : 0;
            reelViewerFragment.A0A += reel.A0m(reelViewerFragment.A1F) ^ true ? 1 : 0;
            C58952gn r2 = reelViewerFragment.A16;
            r2.A03(r2.A09.size(), reelViewerFragment.A00(reel, count + i));
        }
        AnonymousClass0Z1.A00(reelViewerFragment.A16, 1566479221);
    }

    public static void A0r(ReelViewerFragment reelViewerFragment, boolean z) {
        if (z) {
            reelViewerFragment.mBackgroundDimmer.setBackground(new C178367jZ(new C178277jQ("ReelViewerFragment", reelViewerFragment.mBackgroundDimmer, reelViewerFragment.mViewRoot)));
        }
        A0E(reelViewerFragment.mBackgroundDimmer, z);
    }

    public static void A0t(ReelViewerFragment reelViewerFragment, boolean z) {
        AnonymousClass36U r3 = new AnonymousClass36U();
        HashMap hashMap = new HashMap();
        if (reelViewerFragment.A1U == null) {
            AnonymousClass0QD.A02("ReelViewerFragment#processReelIdArgs", "mArgSourceReelIds is null");
        } else {
            for (int i = 0; i < reelViewerFragment.A1U.size(); i++) {
                hashMap.put(reelViewerFragment.A1U.get(i), Integer.valueOf(i));
            }
        }
        for (int i2 = 0; i2 < reelViewerFragment.A1T.size(); i2++) {
            String str = (String) reelViewerFragment.A1T.get(i2);
            Reel A0G2 = ReelStore.A02(reelViewerFragment.A1F).A0G(str);
            if (A0G2 == null || z) {
                r3.A01.add(str);
            } else {
                if (hashMap.get(str) == null) {
                    AnonymousClass0QD.A02("ReelViewerFragment#processReelIdArgs", "unexpected state populating reels");
                }
                r3.A00.add(reelViewerFragment.A00(A0G2, ((Integer) hashMap.get(str)).intValue()));
            }
        }
        AnonymousClass1OY r1 = reelViewerFragment.A0a;
        if (r1 == AnonymousClass1OY.PROFILE || r1 == AnonymousClass1OY.PROFILE_HIGHLIGHTS_TRAY) {
            ArrayList arrayList = new ArrayList();
            for (C50282Fr r0 : r3.A00) {
                arrayList.add(r0.A0A);
            }
            for (C50282Fr r02 : r3.A00) {
                r02.A04 = arrayList;
            }
        }
        reelViewerFragment.A0s = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r2.A07() == false) goto L_0x002b;
     */
    public static void A0u(ReelViewerFragment reelViewerFragment, boolean z, boolean z2) {
        boolean z3;
        AnonymousClass3EF r0 = reelViewerFragment.mReelInteractiveController;
        if (r0 != null) {
            r0.A04(z, z2);
        }
        reelViewerFragment.A0x.A00(z);
        C56202c6 r02 = reelViewerFragment.A12.A00;
        if (r02 != null) {
            r02.A06(z);
        }
        C56202c6 r03 = reelViewerFragment.A1A.A01;
        if (r03 != null) {
            r03.A06(z);
        }
        C56202c6 r2 = reelViewerFragment.A13.A00;
        if (r2 != null) {
            z3 = true;
        }
        z3 = false;
        if (z3) {
            r2.A06(z);
        }
        reelViewerFragment.A0q.A00(z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0259, code lost:
        if (r0.Aho() != false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bc, code lost:
        if (r3.A00 != p000X.Constants.ONE) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03e7, code lost:
        if (r3 == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0468, code lost:
        if (r1.A2T != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x047a, code lost:
        if (r0.A0k() != false) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x050a, code lost:
        if (r6 == p000X.Constants.A0u) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0514, code lost:
        if (A15() != false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r2 == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r1.A2T != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019a, code lost:
        if (r3 != false) goto L_0x019c;
     */
    private void A0x(C34431ej r22, C39941no r23) {
        boolean z;
        C469121m r6;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AnonymousClass1NJ r2;
        boolean z7;
        boolean z8;
        int i;
        long j;
        boolean z9;
        boolean z10;
        int i2;
        C34431ej r4 = r22;
        if (!this.A28) {
            C72023Df r24 = this.mReelViewerListenerManager;
            C39941no r0 = r23;
            if (r24 != null) {
                r24.Ayw(r4, r0);
            }
            if (this.A2O == null) {
                this.A2O = r0.getId();
            }
            if (!r0.equals(this.mPhotoTimerController.A05) || this.A16.A02(r0).A0P) {
                this.mPhotoTimerController.A02();
            }
            if (!r0.equals(this.mShowreelNativeTimerController.A06) || this.A16.A02(r0).A0P) {
                this.mShowreelNativeTimerController.A01();
            }
            C50282Fr A012 = A01(this, r0.A0F);
            Reel reel = A012.A0A;
            if (reel.A0Y()) {
                String A0C2 = A012.A0C();
                if (!A0C2.equals(this.A1N)) {
                    this.A1N = A0C2;
                    this.A0f.A0B(reel, A0C2, "reel_media_expired");
                }
            }
            if (!this.mVideoPlayer.AeT(r4, r0)) {
                this.mVideoPlayer.Bs3("scroll");
            }
            C38031kc r3 = r0.A09;
            if (r3 != null) {
                boolean A072 = r3.A07(this.A1F);
                z = true;
            }
            z = false;
            if (r0.A10() || ((r2 = r0.A08) != null && r2.A3Q)) {
                if (!this.mViewPager.A0N()) {
                    z6 = true;
                }
                z6 = false;
                if (C66262vC.A06(r0, this.A1F)) {
                    if (!r0.equals(this.mShowreelNativeTimerController.A06)) {
                        IgShowreelNativeProgressView igShowreelNativeProgressView = (IgShowreelNativeProgressView) ((C65122sa) r4).A0P.A05.A01();
                        C72153Dw r7 = this.mShowreelNativeTimerController;
                        r7.A01 = (float) ((long) this.A0B);
                        igShowreelNativeProgressView.A07.BVh();
                        r7.A05 = igShowreelNativeProgressView;
                        r7.A06 = r0;
                        r7.A09.B75(r0);
                        r7.A08 = z6;
                        r7.A07 = new AnonymousClass8H5(r7);
                        if (r7.A05.A07.AgK()) {
                            r7.A07.run();
                            r7.A07 = null;
                        } else {
                            IgShowreelNativeProgressView igShowreelNativeProgressView2 = r7.A05;
                            igShowreelNativeProgressView2.A07.A3k(C72153Dw.A0B, new AnonymousClass96Z(r7));
                        }
                    }
                } else if (!r0.equals(this.mPhotoTimerController.A05)) {
                    IgProgressImageView A0H2 = r4.A0H();
                    this.mPhotoTimerController.A04(r0, A0H2, (long) this.A0B, z6);
                    this.A0K.A07(r0.A08, A0H2);
                }
            } else if (!r0.A0z() || r0.A0m() || z) {
                Integer num = r0.A0E;
                if (num != Constants.A0j) {
                    z7 = false;
                }
                z7 = true;
                if (!z7) {
                    z8 = false;
                }
                z8 = true;
                if (z8 && !r0.equals(this.mPhotoTimerController.A05)) {
                    C72133Du r62 = this.mPhotoTimerController;
                    if (A15()) {
                        j = 3000;
                    } else {
                        if (r0.A0w()) {
                            AnonymousClass0a4.A07(r0.A01, "SU unit is missing suggested users model");
                            i = r0.A01.A00 * 1000;
                        } else {
                            i = this.A0B;
                        }
                        j = (long) i;
                    }
                    r62.A03(r0, j);
                }
            } else if (!this.mVideoPlayer.AeT(r4, r0) && isResumed()) {
                if (!this.mViewPager.A0N() && !A1B(this) && !A16()) {
                    z9 = true;
                }
                z9 = false;
                C57652eY r10 = this.mVideoPlayer;
                int i3 = A012.A02;
                if (!r0.A0y()) {
                    z10 = false;
                }
                z10 = true;
                if (r0.A0o()) {
                    AnonymousClass1OY r32 = this.A0a;
                    if ((r32 == AnonymousClass1OY.DIRECT_INBOX || r32 == AnonymousClass1OY.DIRECT_THREAD_HEADER) && this.A1X.containsKey(r0.A09.A0I)) {
                        i2 = (int) (((long) ((Integer) this.A1X.get(r0.A09.A0I)).intValue()) * 1000);
                    } else {
                        i2 = (int) (this.A16.A02(r0).A07 * this.A16.A02(r0).A06);
                    }
                } else {
                    C50282Fr A013 = A01(this, r0.A0F);
                    if (!AnonymousClass3GT.A00(A013)) {
                        i2 = 0;
                    } else if (!AnonymousClass3GT.A00(A013)) {
                        i2 = -1;
                    } else {
                        List list = A013.A0A.A0j;
                        int A022 = A013.A02();
                        if (A022 < list.size()) {
                            i2 = (int) (((Double) list.get(A022)).doubleValue() * 1000.0d);
                        } else {
                            throw new IllegalStateException("Video to carousel index is out of bounds");
                        }
                    }
                }
                r10.A6U(r4, r0, i3, z10, z9, i2);
            }
            AnonymousClass2Ay r33 = this.A2L;
            if (r33 != null) {
                r33.BbQ(this.A3E);
            }
            if (r0.A0y()) {
                AnonymousClass2Ay A0C3 = r0.A0C();
                this.A2L = A0C3;
                A0C3.A4C(this.A3E);
                this.A1t = this.A2L.ANQ();
            } else {
                this.A2L = null;
            }
            if ((r0.A0t() && !r0.A08.A3Q) || r0.A0k()) {
                if (!Ah2() && !this.A1o) {
                    if (this.mViewPager.A06 < this.A16.getCount() - 1) {
                        AnonymousClass3EP r63 = this.A17;
                        AnonymousClass1OY r5 = this.A0a;
                        String str2 = this.A2O;
                        if (!r63.A0K && ((r5 == AnonymousClass1OY.MAIN_FEED_TRAY || r5 == AnonymousClass1OY.IN_FEED_STORIES_TRAY || r5 == AnonymousClass1OY.STORIES_HOME) && !r0.getId().equals(str2))) {
                            C13300iJ r52 = r0.A0D;
                            AnonymousClass0C1 r34 = r63.A0N;
                            if (!r52.equals(r34.A06) && !r0.A05 && !r0.Aho() && ReelStore.A02(r34).A05) {
                                boolean z11 = false;
                                if (C16180oA.A00(r63.A0N).A00.getInt("reel_viewer_gestures_nux_impression_count", 0) != 0) {
                                    z11 = true;
                                }
                                z4 = true;
                            }
                        }
                        z4 = false;
                        if (z4) {
                            AnonymousClass3EP r53 = this.A17;
                            r53.A0K = true;
                            r53.A06 = SystemClock.elapsedRealtime();
                            r53.A0G = r4;
                            View A014 = r53.A0M.A01();
                            r53.A0A = A014;
                            r53.A09 = A014.findViewById(C0003R.C0005id.background);
                            r53.A0C = r53.A0A.findViewById(C0003R.C0005id.tips);
                            r53.A0E = (IgImageView) r53.A0A.findViewById(C0003R.C0005id.blurred_image_view);
                            r53.A04 = C06220Of.A03(r53.A0L, 8);
                            r53.A0C.setCameraDistance((float) r53.A0L.getResources().getDimensionPixelOffset(C0003R.dimen.reel_viewer_camera_distance));
                            r53.A07 = new Paint();
                            AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
                            A002.A06 = true;
                            A002.A07(new AnonymousClass704(r53));
                            r53.A0D = A002;
                            r53.A08 = new GestureDetector(r53.A0L, new AnonymousClass703(r53));
                            r53.A0A.setOnTouchListener(new AnonymousClass702(r53));
                            r53.A0H = Constants.ONE;
                            C700034m r25 = r53.A0F;
                            if (r25 != null) {
                                r25.A00.mViewPager.setDraggingEnabled(false);
                            }
                            r53.A0G.A0H().post(new C168477Hl(r53));
                        } else {
                            boolean z12 = r4 instanceof C34421ei;
                            if (z12 && this.A0Z.A0Q) {
                                AnonymousClass3EQ r35 = this.A0w;
                                if (z12 && ((C34421ei) r4).A0W.A00() == 0) {
                                    z5 = true;
                                }
                                z5 = false;
                                if (z5) {
                                    AnonymousClass3EQ r72 = this.A0w;
                                    C34421ei r11 = (C34421ei) r4;
                                    C60512k1 r102 = this.mDragToDismissController;
                                    AnonymousClass3E2 r9 = this.A14;
                                    A0m(r72.A04, "autoplay_disabled");
                                    r72.A00 = Constants.A0C;
                                    AnonymousClass1EG r64 = r9.A01;
                                    if (r64.A00() != 0.0d) {
                                        r9.A00 = r9.A02.A05;
                                        r64.A03(0.0d);
                                    }
                                    RelativeLayout relativeLayout = (RelativeLayout) r11.A0W.A01();
                                    AnonymousClass3EQ.A00(r72, relativeLayout.findViewById(C0003R.C0005id.reel_viewer_tray_nux_down_chevron_animate_1), 0);
                                    AnonymousClass3EQ.A00(r72, relativeLayout.findViewById(C0003R.C0005id.reel_viewer_tray_nux_down_chevron_animate_2), 300);
                                    AnonymousClass0ZA.A09(r72.A02, new C181037oA(r72, r102), 0, -895390243);
                                    AnonymousClass0ZA.A09(r72.A02, new C181067oD(r72, r102), 1400, -20645269);
                                    AnonymousClass0ZA.A09(r72.A02, new C1896188k(r72, r11, r102, r9), 4400, 992602783);
                                    C16180oA A003 = C16180oA.A00(r72.A06);
                                    A003.A00.edit().putInt("num_times_reel_viewer_tray_nux_seen", A003.A00.getInt("num_times_reel_viewer_tray_nux_seen", 0) + 1).apply();
                                    C16180oA A004 = C16180oA.A00(r72.A06);
                                    A004.A00.edit().putLong("last_reel_viewer_tray_nux_seen_date", System.currentTimeMillis()).apply();
                                    C92253yr r36 = new C92253yr(AnonymousClass0QT.A00(r72.A06, r72.A05).A02("reel_viewer_tray_nux"));
                                    r36.A08("tray_session_id", r72.A07);
                                    r36.A08("viewer_session_id", r72.A08);
                                    r36.A01();
                                }
                            }
                        }
                    } else if (!A012.A0H() || C16180oA.A00(this.A1F).A00.getBoolean("has_seen_group_reel_nux_dialog", false) || r0.A0D == null) {
                        AnonymousClass56S r26 = this.A0k;
                        if (r26 != null) {
                            boolean z13 = r26.A00;
                            z3 = true;
                        }
                        z3 = false;
                        if (!z3 && this.A12.A00(r0, A012, r4, getRootActivity())) {
                            this.A1o = true;
                        }
                    } else {
                        FragmentActivity activity = getActivity();
                        AnonymousClass0C1 r37 = this.A1F;
                        this.A0k = new AnonymousClass56S(activity, r37, this.A3S);
                        Pair A062 = A012.A06(r37, r0);
                        this.A0k.A00(this.mViewRoot, A012, r0, r4, (ImageUrl) A062.first, (ImageUrl) A062.second, C0003R.string.group_reel_nux_dialog_title);
                        A0m(this, "dialog");
                    }
                }
                AnonymousClass3E7 r65 = this.A0l;
                r65.A02 = A012.A0A;
                r65.A03 = r0;
                AnonymousClass1NJ r54 = r0.A08;
                if (r54 != null && r54.A3d) {
                    z2 = true;
                }
                z2 = false;
                r65.A05 = z2;
                if (r4 instanceof C34421ei) {
                    AnonymousClass35V r73 = this.A0t;
                    C34421ei r42 = (C34421ei) r4;
                    AnonymousClass35Y r92 = r73.A09;
                    if (r92.A04 != null && ((str = r92.A05) == null || !str.equals(r54.A0u()))) {
                        r92.A01();
                        HashSet<AnimatorSet> hashSet = new HashSet<>();
                        for (View view : r92.A07) {
                            hashSet.add(r92.A06.get(view));
                        }
                        for (AnimatorSet animatorSet : hashSet) {
                            animatorSet.cancel();
                            animatorSet.removeAllListeners();
                        }
                    }
                    ImageView imageView = r42.A00;
                    if (imageView != null) {
                        AnonymousClass35Y r43 = r73.A09;
                        r43.A03 = imageView;
                        DCY A005 = AnonymousClass94I.A00(r43.A02, C0003R.raw.countdown_sticker_confetti);
                        r43.A04 = A005;
                        if (A005 != null) {
                            A005.A3M(new C173937bu(r43));
                        }
                        r43.A03.setImageDrawable(r43.A04);
                        r43.A05 = r0.A08.A0u();
                    }
                }
                C706236w r44 = this.A15;
                FragmentActivity activity2 = getActivity();
                AnonymousClass0a4.A06(activity2);
                C17510qM r93 = C17510qM.A00;
                if (!(r0.A08 == null || r93 == null || r44.A00.contains(r0.getId()))) {
                    C27371Ho r112 = r44.A04;
                    AnonymousClass0C1 r12 = r44.A06;
                    AnonymousClass1NJ r13 = r0.A08;
                    AnonymousClass0a4.A06(r13);
                    DialogInterface.OnShowListener onShowListener = r44.A03;
                    if (r93.A1O(activity2, r112, r12, r13, (ProductMention) null, false, (Product) null, (String) null, onShowListener, r44.A02, r44.A05)) {
                        r44.A00.add(r0.getId());
                    }
                }
            }
            AnonymousClass8L7 r38 = this.mReelLoadingVisualization;
            if (r38 != null) {
                r38.A00 = r0.getId();
                r38.invalidateSelf();
            }
            boolean z14 = false;
            if (this.A0z.A06() && this.A0a.A00()) {
                C50282Fr r39 = this.A0Y;
                if (!r39.A0A.A0x) {
                    if (this.A16.getCount() - this.A16.Ad5(r39) <= this.A0z.A01) {
                        z14 = true;
                    }
                }
            }
            if (z14) {
                this.A0z.A05();
            }
            if (A1C(this)) {
                A03(this).A0B(A012.A0A, r0);
            }
            this.A19.A00(A012);
            A0A();
            if (((Boolean) AnonymousClass0L6.A00(this.A1F, AnonymousClass0L7.CX_STORIES_ABOUT_YOU, "is_nux_enabled", false, (AnonymousClass04H) null)).booleanValue() && this.A0a == AnonymousClass1OY.STORY_MENTIONS_ACTIVITY_FEED && !C16180oA.A00(this.A1F).A00.getBoolean("has_seen_story_mentions_nux_dialog", false)) {
                AnonymousClass8CZ r66 = new AnonymousClass8CZ(getActivity(), this.A1F, this.A3R);
                this.A0n = r66;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mViewRoot;
                C53842Uo r74 = new C53842Uo(r66.A01);
                View inflate = LayoutInflater.from(r66.A01).inflate(C0003R.layout.story_mentions_nux_header_layout, touchInterceptorFrameLayout, false);
                AnonymousClass7P9 r310 = new AnonymousClass7P9(r66.A01.getApplicationContext());
                r310.A02(C0003R.string.mention_sticker_tray_label);
                r310.A09 = C85343nC.A02;
                r310.A02 = C0003R.dimen.stories_about_nux_icon_text_size;
                ((ImageView) inflate.findViewById(C0003R.C0005id.header_image)).setImageDrawable(r310.A00());
                r74.A05.setVisibility(0);
                r74.A05.addView(inflate);
                r74.A03(C0003R.string.stories_about_you_nux_title);
                r74.A02(C0003R.string.stories_about_you_nux_description);
                r74.A05(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
                r74.A00.setOnDismissListener(new AnonymousClass8CY(r66));
                r74.A00.show();
                r66.A00 = true;
                C16180oA.A00(r66.A03).A00.edit().putBoolean("has_seen_story_mentions_nux_dialog", true).apply();
                A0m(this, "fragment_paused");
            }
            if (this.A0X == null && (r6 = A012.A0A.A0G) != null && !r6.A02) {
                Context applicationContext = getContext().getApplicationContext();
                int A015 = C64972sL.A01(applicationContext);
                int A023 = C64972sL.A02(applicationContext, A012);
                C51512Ky r311 = new C51512Ky();
                r311.A01 = A015 + A023;
                r311.A09 = r6.A01;
                r311.A06 = Constants.ONE;
                r311.A04 = r6.A00;
                r311.A00 = 3000;
                r311.A05 = new AnonymousClass519(this, r6);
                C51522Kz A006 = r311.A00();
                this.A0X = A006;
                C11130eT.A01.BXT(new C33441cv(A006));
            }
            if (A19(r0)) {
                A0m(this, "fragment_paused");
            }
            A10(Constants.ZERO);
        }
    }

    private void A0y(Float f, Float f2) {
        boolean z;
        int A022;
        C39941no A082 = this.A0Y.A08(this.A1F);
        C64982sM A023 = this.A16.A02(A082);
        A023.A0J = Constants.ONE;
        if (!(f == null || f2 == null)) {
            A023.A0H = f;
            A023.A0I = f2;
        }
        AnonymousClass3E1 r5 = this.A1E;
        View view = this.mViewPager.A0C;
        C50282Fr r7 = this.A0Y;
        if (!AnonymousClass3GT.A00(r7) || (A022 = r7.A02()) == 0) {
            z = false;
        } else {
            int i = A022 - 1;
            AnonymousClass3E1.A00(r5, view, r7, i, A082, A023);
            A023.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            C64982sM.A00(A023, 1);
            int doubleValue = (int) (((Double) r7.A0A.A0j.get(i)).doubleValue() * 1000.0d);
            r5.A02.Bey(doubleValue);
            r5.A01.BLk(doubleValue);
            z = true;
        }
        if (z) {
            A13(true);
        } else if (A14()) {
            C50282Fr r4 = this.A0Y;
            boolean z2 = false;
            if (r4.A02 == 0) {
                z2 = true;
            }
            if (z2) {
                A0f(this, this.A16.ATu(this.mViewPager.A06 - 1), true);
            } else {
                if (!r4.A08 || !A17()) {
                    C50282Fr r2 = this.A0Y;
                    r2.A0G(this.A1F, r2.A02 - 1);
                } else {
                    this.A0Y.A08 = false;
                    this.mPhotoTimerController.A02();
                    this.mShowreelNativeTimerController.A01();
                    this.mVideoPlayer.Bs3("fragment_paused");
                }
                A0L(this);
            }
            this.A0t.A02();
        }
        C50272Fq.A00(this.A0Y.A0A, AnonymousClass3GY.A00(Constants.A0j));
    }

    private void A0z(Float f, Float f2) {
        boolean z;
        C39941no A082 = this.A0Y.A08(this.A1F);
        C64982sM A022 = this.A16.A02(A082);
        Integer num = Constants.ZERO;
        A022.A0J = num;
        if (this.mReelsViewerPagingNavigationPerfLogger != null && A17()) {
            this.mReelsViewerPagingNavigationPerfLogger.A00 = num;
        }
        if (!(f == null || f2 == null)) {
            A022.A0H = f;
            A022.A0I = f2;
        }
        AnonymousClass3E1 r5 = this.A1E;
        View view = this.mViewPager.A0C;
        C50282Fr r7 = this.A0Y;
        if (!AnonymousClass3GT.A00(r7) || AnonymousClass3GT.A01(r7)) {
            z = false;
        } else {
            int A023 = r7.A02() + 1;
            AnonymousClass3E1.A00(r5, view, r7, A023, A082, A022);
            A022.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            C64982sM.A00(A022, 1);
            int doubleValue = (int) (((Double) r7.A0A.A0j.get(A023)).doubleValue() * 1000.0d);
            r5.A02.Bey(doubleValue);
            r5.A01.BLk(doubleValue);
            z = true;
        }
        if (z) {
            A13(true);
        } else {
            A07();
        }
        C50272Fq.A00(this.A0Y.A0A, AnonymousClass3GY.A00(Constants.A0j));
    }

    private void A10(Integer num) {
        boolean A0B2;
        View view = this.mViewPager.A0C;
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C34441ek) {
                AnonymousClass3GL AHU = ((C34441ek) tag).AHU();
                C50282Fr r1 = this.A0Y;
                if (r1 == null) {
                    A0B2 = false;
                } else {
                    A0B2 = C34581ey.A0B(r1.A08(this.A1F), this.A1F, this.A0a);
                }
                if (!A0B2) {
                    num = Constants.ONE;
                }
                AHU.ACL(num);
            }
        }
    }

    private void A11(String str) {
        C52362Om r2 = new C52362Om(getActivity(), this.A1F);
        r2.A0B = true;
        r2.A02 = C16230oG.A00.getFragmentFactory().Apr(str);
        r2.A02();
    }

    private void A12(boolean z) {
        View view;
        if (this.A2Y != z) {
            this.A2Y = z;
            View view2 = this.mViewPager.A0C;
            if (view2 != null) {
                if (view2.getTag() instanceof C34421ei) {
                    view = ((C34421ei) view2.getTag()).A0D;
                } else if (view2.getTag() instanceof C65122sa) {
                    view = ((C65122sa) view2.getTag()).A07;
                } else if (view2.getTag() instanceof C65132sb) {
                    view = ((C65132sb) view2.getTag()).A0D;
                } else {
                    return;
                }
                C34581ey.A05(view, z);
            }
        }
    }

    private boolean A14() {
        boolean z = false;
        if (this.A0Y.A02 == 0) {
            z = true;
        }
        boolean z2 = false;
        if (this.mViewPager.A06 == 0) {
            z2 = true;
        }
        if (!z2 || !z) {
            return true;
        }
        return false;
    }

    private boolean A15() {
        if (!this.A0Y.A0J(this.A1F) || !this.A0Y.A0A.A0v) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r0 != false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    private boolean A16() {
        boolean z;
        boolean z2;
        ReelOptionsDialog reelOptionsDialog = this.mReelOptionsDialog;
        if (reelOptionsDialog != null) {
            Dialog dialog = reelOptionsDialog.A00;
            if (dialog == null || !dialog.isShowing()) {
                C145626Kk r0 = reelOptionsDialog.A04;
                if (r0 != null) {
                    Dialog dialog2 = r0.A01;
                    if (dialog2 != null) {
                        boolean isShowing = dialog2.isShowing();
                        z2 = true;
                    }
                    z2 = false;
                }
                z = false;
                if (z) {
                    return true;
                }
            }
            z = true;
            if (z) {
            }
        }
        C68172yZ r02 = this.mMentionReshareProgressDialog;
        if (r02 == null || !r02.isShowing()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 == false) goto L_0x0027;
     */
    private boolean A17() {
        boolean z;
        C50282Fr r0 = this.A0Y;
        int i = r0.A02;
        Reel reel = r0.A0A;
        boolean z2 = false;
        if (i == reel.A00) {
            z2 = true;
        }
        if (this.A0a.A02() && reel.A0n(this.A1F) && !this.A0Y.A06) {
            z = true;
        }
        z = false;
        if (this.A0Y.A03(this.A1F) != 0) {
            C50282Fr r2 = this.A0Y;
            if (r2.A02 == r2.A03(this.A1F) - 1 || z) {
                return true;
            }
            return false;
        }
        return true;
    }

    private boolean A18() {
        C50282Fr r0 = this.A0Y;
        if (r0 == null || !r0.A08) {
            return false;
        }
        return true;
    }

    private boolean A19(C39941no r6) {
        boolean z;
        if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_NEW_PORTAL_LAUNCHER, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C2109297s r0 = this.A16.A02(r6).A0G;
            if (r0 == null) {
                return false;
            }
            z = r0.A00;
        } else {
            C61762mM r02 = this.A16.A02(r6).A0F;
            if (r02 == null) {
                return false;
            }
            z = r02.A0I;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.A0A.A0W() == false) goto L_0x000e;
     */
    public static boolean A1B(ReelViewerFragment reelViewerFragment) {
        boolean z;
        C50282Fr r0 = reelViewerFragment.A0Y;
        if (r0 != null) {
            z = true;
        }
        z = false;
        if (!reelViewerFragment.A0j.A07(reelViewerFragment.getContext()) || z) {
            return false;
        }
        return true;
    }

    public static boolean A1C(ReelViewerFragment reelViewerFragment) {
        if (reelViewerFragment.A1L == null || reelViewerFragment.A1O == null) {
            return false;
        }
        return true;
    }

    public final C39941no A1E() {
        C50282Fr r1 = this.A0Y;
        if (r1 == null) {
            return null;
        }
        return r1.A08(this.A1F);
    }

    public final void A1H(C39941no r3) {
        if (r3 != null && r3.A14()) {
            this.mReelViewerListenerManager.BUw();
        }
        ANK ank = this.A1G;
        if (ank != null && this.A3V.A01()) {
            ank.A00();
        }
    }

    public final void A1I(C39941no r7, C34431ej r8, boolean z) {
        if (r7 != null && r7.A14()) {
            this.mReelViewerListenerManager.BVT(r7, r8);
        }
        if (!z) {
            C64982sM A022 = this.A16.A02(r7);
            A022.A03();
            AnonymousClass00B.A01.markerEnd(17301505, this.A0Y.A0A.getId().hashCode(), 2);
            A022.A0P = true;
            if (A18()) {
                A0m(this, "suggestion_unit_overlay_shown");
            }
            A0Y(this, r7);
        }
        this.A16.A02(r7).A06 = (float) this.mVideoPlayer.AKe();
        this.A16.A02(r7).A03 = this.mVideoPlayer.ARf();
        AnonymousClass8L7 r2 = this.mReelLoadingVisualization;
        if (r2 != null) {
            r2.BBC(r7.A0F, r7.getId());
        }
        ANK ank = this.A1G;
        if (ank != null) {
            ank.A00();
        }
    }

    public final void A1J(C39941no r4, boolean z) {
        boolean z2 = this.A16.A02(r4).A0O;
        if (z) {
            this.A0f.A01.A04(r4, "viewport", z2);
            return;
        }
        AnonymousClass1S1 r0 = this.A0f.A01.A01;
        if (r0 != null) {
            r0.A03(r4, "viewport", z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A2V != false) goto L_0x0014;
     */
    public final void A1K(C39941no r4, boolean z, int i) {
        boolean z2;
        C64982sM A022 = this.A16.A02(r4);
        A022.A0R = z;
        if (i == 0) {
            this.A2V = z;
            return;
        }
        if (z) {
            z2 = true;
        }
        z2 = false;
        A022.A0V = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011e, code lost:
        if (p000X.AnonymousClass5JZ.A01(r3) != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0121, code lost:
        if (r0 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0194, code lost:
        if (((double) r24.getRawY()) < r6) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        if (p000X.AnonymousClass5JZ.A01(r3) != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01eb, code lost:
        if (r3.A0k() != false) goto L_0x01ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01be  */
    public final boolean A1L(View view, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C39941no A1E2;
        AnonymousClass1NJ r0;
        boolean z;
        boolean z2;
        boolean z3;
        Integer AZG;
        boolean z4;
        boolean z5;
        String str;
        Context context = getContext();
        AnonymousClass0a4.A07(context, "Context should not be null when swiping up");
        DisplayMetrics A0B2 = C06220Of.A0B(context);
        float rawX = motionEvent.getRawX() / A0B2.density;
        float rawY = motionEvent.getRawY() / A0B2.density;
        float rawX2 = motionEvent2.getRawX() / A0B2.density;
        float rawY2 = motionEvent2.getRawY();
        float f3 = A0B2.density;
        C51862Mk r15 = new C51862Mk(rawX, rawY, rawX2, rawY2 / f3, f / f3, f2 / f3);
        if (!A18() && !this.A17.A01() && !this.A0w.A02() && !this.A0Y.A0A.A0e() && (A1E2 = A1E()) != null && ((r0 = A1E2.A08) == null || !r0.A3Q)) {
            C50282Fr A012 = A01(this, A1E2.A0F);
            C64982sM A022 = this.A16.A02(A1E2);
            boolean z6 = false;
            if (A1E2.A0E == Constants.A0j) {
                z6 = true;
            }
            if ((!z6 || !A022.A0L) && !A1E2.A0s()) {
                if (A1E2.A0b()) {
                    A0F(A1E2);
                    return true;
                } else if (A1E2.A0i()) {
                    this.A1C.A03(A1E2, A012, r15, Constants.A14);
                    return true;
                } else if (A1E2.A0d()) {
                    this.A1C.A01(A1E2, A012, r15, Constants.A14);
                    return true;
                } else if (A1E2.A0g()) {
                    this.A1C.A02(A1E2, A012, r15, Constants.A14);
                    return true;
                } else if (A1E2.A0h()) {
                    this.A1C.A04(A1E2, A012, r15, Constants.A14, this.A2Z);
                    return true;
                } else if (A1E2.A0Z()) {
                    Bundle bundle = new Bundle();
                    C43531uZ A082 = A1E2.A08();
                    if (A082 != null) {
                        str = A082.A00();
                    } else {
                        str = null;
                    }
                    bundle.putString("effect_id", str);
                    bundle.putString("camera_entry_point", "story_effect_swipe_up_cta");
                    A0U(this, bundle, (RectF) null);
                    return true;
                } else {
                    AnonymousClass0C1 r1 = this.A1F;
                    if (!A1E2.A0x()) {
                        if (A1E2.A0e()) {
                            if (!A1E2.Aho()) {
                                if (!r1.A06.equals(A1E2.A0D)) {
                                    z5 = false;
                                }
                                z5 = true;
                            }
                        }
                        z = false;
                        if (!z) {
                            if (A1E2.Aho()) {
                                AnonymousClass35C r7 = this.A0f;
                                C39941no A083 = A012.A08(r7.A07);
                                Reel reel = A012.A0A;
                                AnonymousClass35F r4 = r7.A04;
                                r4.A00 = reel;
                                C37141jB A023 = AnonymousClass3GV.A02(A083, "gesture", r4, r7.A07);
                                A023.A28 = r15;
                                A023.A52 = "swipe_up";
                                AnonymousClass35C.A08(r7, A012, A023, A022);
                            }
                            int A092 = C06220Of.A09(context);
                            double d = (double) (((float) A092) / 2.0f);
                            double d2 = (((double) A092) * 0.4d) / 2.0d;
                            double d3 = d + d2;
                            double d4 = d - d2;
                            double A084 = ((double) C06220Of.A08(context)) * 0.4d;
                            if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && ((double) motionEvent.getRawX()) >= d4 && ((double) motionEvent.getRawX()) <= d3) {
                                z4 = true;
                            }
                            z4 = false;
                            if (z4) {
                                AnonymousClass0C1 r02 = this.A1F;
                                View view2 = view;
                                if (view != null) {
                                    C32991cC A002 = C32991cC.A00(r02);
                                    C33031cG r42 = C33031cG.SWIPE_UP;
                                    C33071cK A003 = new C33061cJ(C33051cI.GENERIC_CALL_TO_ACTION_BUTTON).A00();
                                    A002.A00 = r42;
                                    A002.A03(view2, A003);
                                }
                                A0k(this, r15, A1E2, Constants.A14);
                                return true;
                            }
                        } else {
                            C50282Fr r5 = this.A0Y;
                            AnonymousClass0C1 r43 = this.A1F;
                            if (!r43.A06.equals(A1E2.A0D)) {
                                z2 = false;
                            }
                            z2 = true;
                            if (z2 && ((AZG = r5.A0B().AZG()) == Constants.ONE || AZG == Constants.A02)) {
                                z3 = true;
                            }
                            z3 = false;
                            if (z3) {
                                this.A16.A02(A1E2).A0J = Constants.A0u;
                                A0N(this);
                                return true;
                            } else if (A1E2.A0n() || !C65352sx.A05(r43, r5, A1E2)) {
                                return this.mReelViewerListenerManager.BQX();
                            } else {
                                A0e(this, this.A0Y, A1E2, Constants.ZERO);
                                return true;
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        return false;
    }

    public final float AJR() {
        return this.mViewPager.A00;
    }

    public final Integer APs() {
        return Constants.ONE;
    }

    public final TouchInterceptorFrameLayout AYj() {
        return this.mViewRoot;
    }

    public final String AaT() {
        return this.A1S;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r1 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r0.isShowing() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 == false) goto L_0x0017;
     */
    public final boolean Ah2() {
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass3EF r0 = this.mReelInteractiveController;
        if (r0 == null || !r0.A05()) {
            C56202c6 r02 = this.A0x.A00;
            if (r02 != null) {
                boolean A072 = r02.A07();
                z = true;
            }
            z = false;
            if (!z) {
                boolean z4 = false;
                if (this.A12.A00 != null) {
                    z4 = true;
                }
                if (!z4) {
                    boolean z5 = false;
                    if (this.A1A.A01 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        C56202c6 r03 = this.A13.A00;
                        if (r03 != null) {
                            boolean A073 = r03.A07();
                            z2 = true;
                        }
                        z2 = false;
                        if (!z2) {
                            AnonymousClass9B2 r04 = this.A0q.A02;
                            if (r04 != null) {
                                z3 = true;
                            }
                            z3 = false;
                            if (z3) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2 == p000X.AnonymousClass1OY.IN_FEED_STORIES_TRAY) goto L_0x000f;
     */
    public final boolean Ahq() {
        boolean z;
        AnonymousClass1OY r2 = this.A0a;
        if (!(r2 == AnonymousClass1OY.MAIN_FEED_TRAY || r2 == AnonymousClass1OY.STORIES_HOME)) {
            z = false;
        }
        z = true;
        if (z || r2 == AnonymousClass1OY.RATE_ADS) {
            return true;
        }
        return false;
    }

    public final void Aqo(C39941no r3) {
        if (this.mViewPager.A0J == C32501bN.IDLE) {
            A0k(this, (C51862Mk) null, r3, Constants.A12);
        }
    }

    public final void ArH(AnonymousClass1NJ r9, ChallengeStickerModel challengeStickerModel, boolean z) {
        if (!z || !((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_REMIXES, "direct_to_camera", false, (AnonymousClass04H) null)).booleanValue()) {
            Context context = getContext();
            FragmentActivity activity = getActivity();
            if (context != null && activity != null) {
                A0m(this, "tapped");
                AnonymousClass0C1 r3 = this.A1F;
                C98514Nk r4 = new C98514Nk(this, challengeStickerModel, r9);
                boolean z2 = false;
                if (challengeStickerModel != null) {
                    z2 = true;
                }
                AnonymousClass5EO A002 = CQ1.A00(context, r3, r4, z2, r9.AiO(), r9.A0F());
                A002.A02 = this.A2h;
                A002.A00().A00(context);
                return;
            }
            return;
        }
        A0V(this, r9);
    }

    public final void As9() {
        AnonymousClass35C r5 = this.A0f;
        C39941no A082 = this.A0Y.A08(r5.A07);
        if (A082.A0t()) {
            AnonymousClass1NJ r0 = A082.A08;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("reel_try_feature", this);
            A002.A0G("m_pk", r0.APo());
            A002.A0G("feature_type", "otd_from_archive");
            AnonymousClass35C.A06(r5, A002, (AnonymousClass3GS) r5.A0D.get(A082.A0N()));
            AnonymousClass0WN.A01(r5.A07).BcG(A002);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_in_archive_home", true);
        new C59032gv(this.A1F, ModalActivity.class, "archive_home", bundle, getActivity()).A06(getContext());
    }

    public final void Ate() {
        AnonymousClass2UC r4 = new AnonymousClass2UC(getActivity(), this.A1F, "https://www.facebook.com/policies/brandedcontent/", AnonymousClass2UD.BRANDED_CONTENT_VIOLATION_CTA);
        r4.A04(getModuleName());
        r4.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A1F, p000X.AnonymousClass0L7.GROUP_STORIES_AUTO_APPLY_AR_EFFECT, "is_auto_apply_effect_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0057;
     */
    public final void AuH(C50282Fr r29, C39941no r30, RectF rectF) {
        String str;
        String str2;
        boolean z;
        String str3;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        DirectCameraViewModel directCameraViewModel;
        boolean z2;
        CreativeConfig creativeConfig;
        boolean z3;
        if (this.mViewPager.A0J == C32501bN.IDLE) {
            C50282Fr r9 = r29;
            RectF rectF2 = rectF;
            C39941no r5 = r30;
            if (r9.A0H()) {
                C16180oA.A00(this.A1F).A00.edit().putBoolean("has_posted_to_group_reel_in_viewer", true).apply();
                AnonymousClass1NJ r1 = r5.A08;
                String str4 = null;
                if (r1 != null) {
                    creativeConfig = r1.A0M;
                } else {
                    creativeConfig = null;
                }
                DirectCameraViewModel A002 = C51232Ju.A00(getContext(), this.A1F, r9);
                if (creativeConfig != null) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    str4 = creativeConfig.A04;
                }
                A0c(this, r9, A002, "reel_viewer_add_to_story_button", rectF2, str4, (String) null, (String) null);
                return;
            }
            C50282Fr A012 = A01(this, r5.A0F);
            C249916w A0B2 = A012.A0B();
            if (!(A0B2 instanceof C44351w1) || A012.A0H()) {
                boolean A0H2 = A012.A0H();
                List arrayList = new ArrayList();
                if (A0H2) {
                    C51242Jv r4 = (C51242Jv) A0B2;
                    AnonymousClass0a4.A06(r4);
                    for (C13300iJ pendingRecipient : r4.A02) {
                        arrayList.add(new PendingRecipient(pendingRecipient));
                    }
                    str3 = r4.getId();
                    str2 = r4.getName();
                    List AMd = r4.AMd();
                    z = false;
                    if (AMd == null || AMd.size() <= 1) {
                        imageUrl2 = null;
                        imageUrl = null;
                    } else {
                        imageUrl = (ImageUrl) AMd.get(0);
                        imageUrl2 = (ImageUrl) AMd.get(1);
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        PendingRecipient pendingRecipient2 = (PendingRecipient) it.next();
                        if (pendingRecipient2.A07 == Boolean.TRUE) {
                            str = pendingRecipient2.AZn();
                            z = true;
                            break;
                        }
                    }
                } else {
                    AnonymousClass0a4.A06(A0B2);
                    C13300iJ AZf = A0B2.AZf();
                    AnonymousClass0a4.A06(AZf);
                    arrayList = Collections.singletonList(new PendingRecipient(AZf));
                    str = AZf.AZn();
                    imageUrl = AZf.ASv();
                    Boolean bool = AZf.A1K;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    imageUrl2 = null;
                    str2 = str;
                    str3 = null;
                }
                directCameraViewModel = new DirectCameraViewModel(new DirectShareTarget(arrayList, str3, (String) null, true), str2, imageUrl, imageUrl2, A0H2, z, str);
            } else {
                C13300iJ r42 = r5.A0D;
                AnonymousClass0a4.A06(r42);
                DirectShareTarget directShareTarget = new DirectShareTarget(Collections.singletonList(new PendingRecipient(r42)), (String) null, (String) null, true);
                String AZn = r42.AZn();
                ImageUrl ASv = r42.ASv();
                Boolean bool2 = r42.A1K;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = false;
                }
                directCameraViewModel = new DirectCameraViewModel(directShareTarget, AZn, ASv, (ImageUrl) null, false, z2, AZn);
            }
            A0c(this, A012, directCameraViewModel, "reel_viewer_visual_reply_camera_button", rectF2, (String) null, (String) null, (String) null);
        }
    }

    public final void Aui(AnonymousClass3ZR r4) {
        if (r4 != null) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("create_mode_attribution", C172317Yc.A00(r4));
                bundle.putString("camera_format", AnonymousClass2TV.TEXT.toString());
                bundle.putString("camera_entry_point", C176607gU.A00(r4));
                A0U(this, bundle, (RectF) null);
            } catch (IOException e) {
                AnonymousClass0QD.A06("serialize_create_mode_attribution", "Failed to serialize dialElement of type " + r4.A02, e);
            }
        }
    }

    public final void Aun(boolean z, boolean z2) {
        if (z2) {
            BTS(z);
        } else {
            this.A14.A00();
            A06();
        }
        A0s(this, true);
    }

    public final void Aut(C39941no r2, float f) {
        this.A0f.A0C(r2, f);
    }

    public final void Avy(View view, Drawable drawable, C34151eA r13) {
        if (this.mReelInteractiveController != null) {
            A0m(this, "tapped");
            View view2 = view;
            this.mReelInteractiveController.A06(r13, (int) r13.Aat(), (int) r13.Aax(), (int) r13.AMp(), view2, drawable, C64972sL.A02(getContext(), this.A0Y));
        }
    }

    public final void Aw5(View view, Drawable drawable, C34151eA r13) {
        if (this.mReelInteractiveController != null) {
            A0m(this, "tapped");
            View view2 = view;
            this.mReelInteractiveController.A06(r13, (int) r13.Aat(), (int) r13.Aax(), (int) r13.AMp(), view2, drawable, C64972sL.A02(getContext(), this.A0Y));
        }
    }

    public final void Az5(View view, IgProgressImageView igProgressImageView, C34151eA r11, float f, float f2) {
        if (this.mReelInteractiveController != null) {
            A0m(this, "tapped");
            BHU(r11, (int) r11.Aat(), (int) r11.Aax(), (int) r11.AMp(), view, igProgressImageView);
            C39941no A1E2 = A1E();
            float f3 = f;
            this.A0f.A0I(A01(this, A1E2.A0F), "dpa_card_tap", f3, f2, this.A16.A02(A1E2));
        }
    }

    public final void AzF() {
        A0m(this, "debug_pause");
    }

    public final void Azz(C39941no r13) {
        String str;
        String str2;
        AnonymousClass0C1 r2 = this.A1F;
        if (r13.A0E != Constants.ONE || C30671Ut.A07(r2, r13.A08) == null) {
            str = null;
        } else {
            str = C30671Ut.A07(r2, r13.A08);
        }
        if (str != null) {
            A0H(r13, true, str);
            return;
        }
        AnonymousClass0C1 r22 = this.A1F;
        if (r13.A0E != Constants.ONE || C30671Ut.A05(r22, r13.A08) == null) {
            str2 = null;
        } else {
            str2 = C30671Ut.A05(r22, r13.A08);
        }
        if (str2 != null) {
            A0H(r13, false, str2);
            return;
        }
        C50282Fr A012 = A01(this, r13.A0F);
        AnonymousClass0RU A013 = AnonymousClass0WN.A01(this.A1F);
        AnonymousClass1NJ r3 = r13.A08;
        AnonymousClass0C1 r6 = this.A1F;
        C36901in.A08(A013, r3, this, new C66312vH(r6, this.A1R, this.A1S, A012.A0A, A012.A02, A012.A09), "disclaimer_click_failure", r13.A0P(r6), (String) null, (String) null);
    }

    public final void B0M(C50282Fr r5, C39941no r6, C49422Cb r7) {
        int i;
        C16180oA.A00(this.A1F).A00.edit().putBoolean("has_ever_tapped_hmu", true).apply();
        C13300iJ r0 = r6.A0D;
        if (r0 != null && TextUtils.equals(r0.getId(), this.A1F.A04())) {
            C16180oA A002 = C16180oA.A00(this.A1F);
            Integer A003 = AnonymousClass5D9.A00(A002.A00.getString("reel_message_prefs", AnonymousClass5D9.A01(Constants.ONE)));
            if (A003 == Constants.ZERO) {
                i = C0003R.string.reel_viewer_cannot_reply_to_own_story_replies_off;
            } else {
                Integer num = this.A1F.A06.A1o;
                Integer num2 = Constants.A0C;
                if (num == num2) {
                    i = C0003R.string.reel_viewer_cannot_reply_to_own_story_your_followers_private;
                    if (A003 == num2) {
                        i = C0003R.string.reel_viewer_cannot_reply_to_own_story_mutual_private;
                    }
                } else {
                    i = C0003R.string.reel_viewer_cannot_reply_to_own_story_everyone_public;
                    if (A003 == num2) {
                        i = C0003R.string.reel_viewer_cannot_reply_to_own_story_mutual_public;
                    }
                }
            }
            C53642Tq.A00(requireContext(), i, 0).show();
        } else if (!r5.A0A.A0m) {
            Boolean bool = r7.A00;
            if (bool != null && bool.booleanValue()) {
                C53642Tq.A00(requireContext(), C0003R.string.reel_viewer_cannot_reply_to_story_not_allowed, 0).show();
            }
        } else {
            A0J(r5, r6, Constants.A0C, false);
        }
    }

    public final void B0g(float f) {
        AnonymousClass3EF r0;
        if (!this.A28 && !A1E().A0n()) {
            if (!this.A1p ? !(Math.round(f) >= this.A07 || (r0 = this.mReelInteractiveController) == null || r0.A05() || this.A1r || A1E().A0o()) : Math.round(f) > this.A07) {
                A12(A14());
            }
            A0m(this, "tapped");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r1 >= r8) goto L_0x008f;
     */
    public final void B13(C60512k1 r22, float f, float f2, float f3, boolean z) {
        int i;
        boolean z2;
        float f4 = f2 * this.A2B;
        this.mViewPager.setTranslationY(f4);
        if (this.A0Z.A01()) {
            AnonymousClass377 r0 = this.A0v;
            i = r0.A02;
            float height = (float) this.mViewPager.getHeight();
            if (r0.A0H.A01() && r0.A03 != null && !r0.A05) {
                float f5 = (float) i;
                if (f4 < f5) {
                    float A012 = (float) C27181Gu.A01((double) f4, 0.0d, (double) i, 0.0d, 1.0d);
                    AnonymousClass377.A00(r0, A012);
                    RecyclerView recyclerView = r0.A03;
                    if (recyclerView != null && r0.A0H.A01()) {
                        float A013 = (float) C27181Gu.A01((double) A012, 0.0d, 1.0d, 0.8500000238418579d, 1.0d);
                        recyclerView.setScaleX(A013);
                        r0.A03.setScaleY(A013);
                        RecyclerView recyclerView2 = r0.A03;
                        recyclerView2.setPivotX((float) (recyclerView2.getWidth() >> 1));
                        r0.A03.setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    }
                    if (r0.A0H.A01() && !r0.A04) {
                        boolean z3 = false;
                        if (f4 > r0.A09) {
                            z2 = true;
                        }
                        z2 = false;
                        if (!r0.A06 && z2) {
                            z3 = true;
                        }
                        if (z3) {
                            r0.A03.performHapticFeedback(3);
                            r0.A04 = true;
                        }
                    }
                }
                double interpolation = (double) r0.A0D.getInterpolation((float) C27181Gu.A00((double) ((float) C27181Gu.A01((double) f4, (double) i, (double) (height * 0.5f), 0.0d, 1.0d)), 0.0d, 1.0d));
                r0.A03.setTranslationY((float) C27181Gu.A01(interpolation, 0.0d, 1.0d, (double) r0.A00, (double) r0.A01));
                if (f4 > f5) {
                    AnonymousClass377.A00(r0, (float) C27181Gu.A01(interpolation, 0.0d, 1.0d, 1.0d, 0.0d));
                }
            }
            if (this.A0Z.A0Q && this.A0w.A02() && (A04() instanceof C34421ei)) {
                ((RelativeLayout) ((C34421ei) A04()).A0W.A01()).setTranslationY(-f4);
            }
        } else {
            i = 0;
        }
        double A014 = (double) ((float) C27181Gu.A01((double) ((float) C27181Gu.A01((double) f4, (double) i, (double) this.mViewPager.getHeight(), 0.0d, 1.0d)), 0.0d, 1.0d, 1.0d, 0.0d));
        float A002 = (float) C27181Gu.A00(A014, 0.0d, 1.0d);
        if (this.A0Z.A01()) {
            A014 = (double) A002;
        }
        float A015 = (float) C27181Gu.A01(A014, 0.0d, 1.0d, 0.75d, 1.0d);
        ReboundViewPager reboundViewPager = this.mViewPager;
        reboundViewPager.setPivotX((float) (reboundViewPager.getWidth() >> 1));
        ReboundViewPager reboundViewPager2 = this.mViewPager;
        reboundViewPager2.setPivotY((float) (reboundViewPager2.getHeight() >> 1));
        this.mViewPager.setScaleX(A015);
        this.mViewPager.setScaleY(A015);
        View view = this.mViewerBackgroundView;
        if (view != null) {
            this.A2w.A00(view, A002);
        }
        if (AnonymousClass0PB.A06()) {
            C34581ey.A04(getActivity(), 1.0f - A002, this.A2w.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (r13 > (((float) r2) + r10.A01)) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    public final void B1B(C60512k1 r11, float f, float f2, float f3, float f4, float f5) {
        boolean z;
        float f6 = f4;
        float f7 = f5;
        C60512k1 r4 = r11;
        if (this.A0Z.A01()) {
            AnonymousClass377 r1 = this.A0v;
            int i = (int) (((float) r1.A02) / this.A2B);
            if (r1.A0H.A01() && !r1.A05) {
                if (r1.A06 && f2 < ((float) i) - r1.A07) {
                    r4.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6, f7, r1.A0E);
                    r11.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    r11.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    A0R(r1.A0K);
                    z = true;
                    if (z) {
                    }
                } else if (f2 > r1.A09) {
                    float f8 = (float) i;
                    if (f2 < r1.A08 + f8) {
                        r4.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f8, f6, f7, r1.A0E);
                        r11.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        r11.A01 = f8;
                        if (r1.A0H.A0R) {
                            A0m(r1.A0K, "user_paused_video");
                        } else {
                            A0R(r1.A0K);
                        }
                        z = true;
                        if (z) {
                            return;
                        }
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        if (f2 < this.A01) {
            A0R(this);
            r4.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6, f7, this.A2e);
            if (C64972sL.A05(getContext(), this.A0Y)) {
                this.mViewPager.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.black));
                C34431ej A042 = A04();
                if (A042 != null) {
                    C26571Ea A0G2 = A042.A0G();
                    if (A0G2.A04()) {
                        A0G2.A02(0);
                    }
                }
            }
            r11.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r11.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            return;
        }
        AnonymousClass3ER r0 = this.mSuggestedHighlightsController;
        if (r0 != null && r0.A00()) {
            A0R(this);
            r4.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6, f7, this.A2e);
            return;
        }
        this.A16.A02(this.A0Y.A08(this.A1F)).A0J = Constants.A0j;
        A0I(this.A0Y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r16 >= com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r16 <= com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (r2 == false) goto L_0x00ad;
     */
    public final boolean B1J(C60512k1 r14, float f, float f2, float f3, float f4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.A1u && f3 >= this.A2C && isResumed()) {
            if (!this.A0w.A02() || !(A04() instanceof C34421ei)) {
                C34071dx A0W2 = C17020pY.A00().A0W(this.A1L);
                if (A0W2 != null) {
                    A0W2.A0S();
                }
                View view = this.mViewPager.A0C;
                if (!(view == null || view.getTag() == null || !C64972sL.A05(getContext(), this.A0Y))) {
                    this.mViewPager.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.transparent));
                    C34431ej A042 = A04();
                    if (A042 != null) {
                        C26571Ea A0G2 = A042.A0G();
                        if (A0G2.A04()) {
                            A0G2.A02(4);
                        }
                    }
                }
                float f5 = this.A03;
                float abs = Math.abs(f2);
                if (f5 < abs) {
                    z2 = true;
                }
                z2 = false;
                if (f5 < abs) {
                    z3 = true;
                }
                z3 = false;
                if (Ah2()) {
                    A0u(this, true, false);
                    return z2;
                }
                AnonymousClass3EM r0 = this.A0t.A00;
                if (r0 != null) {
                    boolean z6 = r0.A05;
                    z4 = true;
                }
                z4 = false;
                if (!z4) {
                    C50282Fr r8 = this.A0Y;
                    if (r8 == null || !r8.A0A.A0W()) {
                        boolean z7 = false;
                        if (this.A14.A01.A01 == 1.0d) {
                            z7 = true;
                        }
                        z5 = !z7;
                    } else {
                        z5 = false;
                    }
                    float f6 = f4;
                    if (!z5 && z2 && !this.A1r && r8 != null) {
                        C59002gs A032 = A03(this);
                        C50282Fr r2 = this.A0Y;
                        Reel reel = r2.A0A;
                        C39941no A082 = r2.A08(this.A1F);
                        A032.A04(reel, A082, new C147666Sw(this, A032, reel, A082), this.A2S, false, false);
                        A0m(this, "scroll");
                        List A002 = AnonymousClass48j.A00(this.A1F, this.A0Y.A0A);
                        if (A002 != null) {
                            this.mAvatarAnimationView.setDoubleAvatarUrlsAndVisibility((ImageUrl) A002.get(0), (ImageUrl) A002.get(1), getModuleName());
                        } else if (this.A0Y.A07(this.A1F) != null) {
                            this.mAvatarAnimationView.setSingleAvatarUrlAndVisibility(this.A0Y.A07(this.A1F), getModuleName());
                        }
                        this.A0v.A03(A032, this.A0Y, f6);
                        return true;
                    } else if (this.A0v.A05() && z3) {
                        this.A0v.A03(A03(this), this.A0Y, f6);
                        return true;
                    }
                }
            } else {
                this.A0w.A01((C34421ei) A04(), this.mDragToDismissController, this.A14);
                return false;
            }
        }
        return false;
    }

    public final void B1m() {
        AnonymousClass3ER r0 = this.mSuggestedHighlightsController;
        if (r0 != null) {
            r0.B1m();
        }
    }

    public final void B2v(C34811fL r4, EventStickerModel eventStickerModel, String str, String str2) {
        C123005Pd r2 = eventStickerModel.A03;
        C123005Pd r1 = C123005Pd.CANT_GO;
        C123005Pd r0 = C123005Pd.INVITED;
        if (r2 != r0) {
            r1 = r0;
        }
        A0w(r4, eventStickerModel, r1);
    }

    public final void B2x(C34811fL r4, EventStickerModel eventStickerModel, String str, String str2) {
        C123005Pd r2 = eventStickerModel.A03;
        C123005Pd r1 = C123005Pd.GOING;
        C123005Pd r0 = C123005Pd.INVITED;
        if (r2 != r0) {
            r1 = r0;
        }
        A0w(r4, eventStickerModel, r1);
    }

    public final void B57() {
        this.A0q.A00(true, true);
        A0m(this, "tapped");
    }

    public final void B60() {
        Intent A022 = C11290ej.A00.A02(getActivity(), 268533760);
        A022.setData(Uri.parse("instagram://story-camera").buildUpon().appendQueryParameter(DatePickerDialogModule.ARG_MODE, AnonymousClass2TV.LIVE.toString()).build());
        C26441Dh.A00(this.A1F).A07(this, this.mFragmentManager.A0I(), "live_end_screen_pivot");
        AnonymousClass1BH.A03(A022, getActivity());
    }

    public final void B6m(C39941no r8) {
        String str;
        if (r8.A0E == Constants.ONE) {
            str = r8.A08.getId();
        } else {
            str = null;
        }
        this.A0P.BbF(this);
        ImageUrl A0F2 = r8.A08.A0F();
        A0s(this, false);
        C16270oK.A00.A01();
        String token = this.A1F.getToken();
        AnonymousClass1OY r2 = this.A0a;
        InlineAddHighlightFragment inlineAddHighlightFragment = new InlineAddHighlightFragment();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
        bundle.putString("current_reel_item_media_id", str);
        bundle.putParcelable("initial_selected_media_url", A0F2);
        bundle.putSerializable("reel_viewer_source", r2);
        inlineAddHighlightFragment.setArguments(bundle);
        AnonymousClass2TH r1 = new AnonymousClass2TH(this.A1F);
        r1.A0F = new AnonymousClass5IP(this, r8);
        AnonymousClass2TI A002 = r1.A00();
        Context context = getContext();
        C31201Wx.A00(getActivity());
        A002.A01(context, inlineAddHighlightFragment);
        A0m(this, "fragment_paused");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r5.A0t() == false) goto L_0x000f;
     */
    public final /* bridge */ /* synthetic */ void B75(Object obj) {
        boolean z;
        float f;
        C39941no r5 = (C39941no) obj;
        if (!(this.mPhotoTimerController == null || r5 == null)) {
            z = true;
        }
        z = false;
        if (z) {
            ExtendedImageUrl A0S2 = r5.A08.A0S(getContext());
            this.A0K.A06(r5.A08, A0S2.getHeight(), A0S2.getWidth());
        }
        C64982sM A022 = this.A16.A02(r5);
        if (C66262vC.A06(r5, this.A1F)) {
            f = this.mShowreelNativeTimerController.A01;
        } else {
            f = this.mPhotoTimerController.A01;
        }
        A022.A06 = f;
    }

    public final /* bridge */ /* synthetic */ void B76(Object obj) {
        long j;
        C39941no r6 = (C39941no) obj;
        C64982sM A022 = this.A16.A02(r6);
        if (C66262vC.A06(r6, this.A1F)) {
            j = this.mShowreelNativeTimerController.A03;
        } else {
            j = this.mPhotoTimerController.A03;
        }
        A022.A03 = ((double) j) / 1000.0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r5.A0t() == false) goto L_0x000f;
     */
    public final /* bridge */ /* synthetic */ void B77(Object obj) {
        boolean z;
        C65122sa r1;
        C39941no r0;
        C64982sM r12;
        C39941no r02;
        C39941no r5 = (C39941no) obj;
        if (!(this.mPhotoTimerController == null || r5 == null)) {
            z = true;
        }
        z = false;
        if (z) {
            this.A0K.A03(getContext(), r5.A08, Constants.A0C);
        }
        if (this.mViewPager.A0C.getTag() instanceof C34421ei) {
            C34421ei r13 = (C34421ei) this.mViewPager.A0C.getTag();
            if (r13 != null && (r02 = r13.A02) != null && r02.equals(r5)) {
                r12 = r13.A06;
            } else {
                return;
            }
        } else if ((this.mViewPager.A0C.getTag() instanceof C65122sa) && (r1 = (C65122sa) this.mViewPager.A0C.getTag()) != null && (r0 = r1.A00) != null && r0.equals(r5)) {
            r12 = r1.A04;
        } else {
            return;
        }
        if (r12 != null) {
            r12.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            C64982sM.A00(r12, 1);
        }
    }

    public final void B8E() {
        C50282Fr r1 = this.A0Y;
        if (r1 != null) {
            this.A19.A00(r1);
            A0A();
        }
    }

    public final void B9J(C66832w7 r3, C50282Fr r4, C39941no r5) {
        if (!(this.A0Y == r4 && this.A14.A00 == this.A16.Ad5(r4))) {
            r3.Bgb(1.0f);
        }
        if (this.A0Y == r4) {
            A0x(r3, r5);
        }
    }

    public final void B9M(AnonymousClass30C r3, C50282Fr r4, C39941no r5) {
        if (!(this.A0Y == r4 && this.A14.A00 == this.A16.Ad5(r4))) {
            r3.Bgb(1.0f);
        }
        if (this.A0Y == r4) {
            A0x(r3, r5);
        }
    }

    public final void B9N(C50282Fr r2, C39941no r3, boolean z) {
        if (z) {
            this.A0f.A0E(r2, r3);
        }
    }

    public final void B9g(String str, boolean z) {
        C50282Fr ATv = this.A16.ATv(str);
        if (ATv != null) {
            ATv.A0F(this.A1F);
        }
    }

    public final void BA3(float f, float f2) {
        boolean A0B2;
        Integer num;
        if (!this.A28) {
            C50282Fr r2 = this.A0Y;
            if (r2 != null) {
                C39941no A082 = r2.A08(this.A1F);
                C64982sM A022 = this.A16.A02(A082);
                String A0E2 = AnonymousClass000.A0E(C38271l0.A05(this.A0Y, this.A1F), this.A0a.A00);
                AnonymousClass35C r10 = this.A0f;
                C50282Fr r12 = this.A0Y;
                Integer num2 = A022.A0J;
                if (this.A1F.A06.equals(A082.A0D)) {
                    num = Constants.ONE;
                } else {
                    num = Constants.ZERO;
                }
                float f3 = A022.A07;
                float f4 = A022.A06;
                double d = A022.A03;
                int i = A022.A0A;
                int i2 = A022.A08;
                double d2 = A022.A04 / 1000.0d;
                float f5 = f3;
                float f6 = f4;
                r10.A0K("reel_media_pause", r12, A082, num2, num, A0E2, (AnonymousClass1OR) null, f5, f6, d2, d, i, i2, A022.A0O, (Map) null, (Map) null, (Map) null, (Map) null);
            }
            C39941no A1E2 = A1E();
            if (C34581ey.A08(A1E2) || A15()) {
                AnonymousClass3E2 r22 = this.A14;
                ReboundViewPager reboundViewPager = r22.A02;
                if (reboundViewPager != null) {
                    r22.A00 = reboundViewPager.A05;
                    r22.A01.A03(0.0d);
                }
                View A0B3 = this.mViewPager.A0B(this.A14.A00);
                if (A0B3 != null && (A0B3.getTag() instanceof C34451el)) {
                    C34451el r5 = (C34451el) A0B3.getTag();
                    C50282Fr r23 = this.A0Y;
                    if (r23 == null) {
                        A0B2 = false;
                    } else {
                        A0B2 = C34581ey.A0B(r23.A08(this.A1F), this.A1F, this.A0a);
                    }
                    r5.BAC(A0B2);
                }
                if (A1E2.A0o()) {
                    AnonymousClass37G r6 = this.A0m;
                    r6.A02 = r6.A04.A00.mVideoPlayer.AJT();
                    AnonymousClass37I r52 = r6.A05;
                    r52.A00.mReelViewerListenerManager.BLm(r6.A04.A00.mVideoPlayer.AJT(), r6.A04.A00.mVideoPlayer.AKe());
                    r6.A03 = true;
                    r6.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    r6.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
            }
            A12(false);
            ReboundViewPager reboundViewPager2 = this.mViewPager;
            if (!reboundViewPager2.A0N()) {
                reboundViewPager2.setScrollMode(C32481bK.DISABLED);
            }
            this.A0f.A0I(A01(this, A1E2.A0F), "long_press", f, f2, this.A16.A02(A1E2));
        }
    }

    public final void BBn(C39941no r2) {
        A0G(r2, "com.instagram.misinformation.sharing_friction.action");
    }

    public final void BBo(AnonymousClass1NJ r5, C39941no r6) {
        C168297Gq.A02(this.A1F, r6.A08, this, Constants.ZERO, Constants.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put("media_id", r5.A27);
        hashMap.put("module", getModuleName());
        A0p(this, "com.instagram.misinformation.fact_check_sheet.action", hashMap, r6);
        A0m(this, "bloks");
    }

    public final void BBp(List list, C39941no r11) {
        C65162se r1;
        C200128hU r3 = new C200128hU(this.A1F, getActivity(), this, list, this.A2Z);
        boolean z = true;
        if (C200128hU.A00(r3).length <= 1) {
            z = false;
        }
        if (z) {
            A0m(this, "dialog");
            CharSequence[] A002 = C200128hU.A00(r3);
            AnonymousClass2OA r12 = new AnonymousClass2OA(r3.A02);
            r12.A0K(r3.A03);
            r12.A0W(A002, new C200118hT(r3));
            r12.A0U(true);
            r12.A0V(true);
            r12.A0F(r3.A01);
            Dialog A032 = r12.A03();
            r3.A00 = A032;
            A032.show();
        } else if (list.size() > 0 && (r1 = (C65162se) list.get(0)) != null && r1.A09()) {
            r1.A02();
        }
    }

    public final void BC5(C34661f6 r3, C39941no r4, C34561ew r5) {
        if (!this.A0j.A06()) {
            A0m(this, "tapped");
            this.mReelInteractiveController.A03(r5, false);
        }
    }

    public final void BCg(C65132sb r7, C50282Fr r8, C39941no r9) {
        if (this.A0Y == r8) {
            A0x(r7, r9);
            if (r9.A0v()) {
                if (!this.A16.A02(r9).A0M) {
                    C197088by r3 = r7.A0K;
                    AnonymousClass0a4.A07(r3.A07, "reelItemState expected to be not null");
                    AnonymousClass0a4.A0C(!r3.A07.A0M, "ad4ad overlay expected to be not animated");
                    AnonymousClass0a4.A07(r3.A02, "ad4ad view is null when it needs to be animated");
                    r3.A07.A0M = true;
                    r3.A02.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    r3.A02.setVisibility(0);
                    ObjectAnimator objectAnimator = r3.A00;
                    if (objectAnimator != null) {
                        objectAnimator.start();
                    }
                } else {
                    C197088by r2 = r7.A0K;
                    AnonymousClass0a4.A07(r2.A02, "ad4ad view is null when it needs to be shown");
                    ObjectAnimator objectAnimator2 = r2.A00;
                    if (objectAnimator2 != null) {
                        objectAnimator2.end();
                    }
                    r2.A02.setAlpha(1.0f);
                    r2.A02.setVisibility(0);
                }
            }
            if (r9.A0w() && r9.A13()) {
                AnonymousClass3EU r4 = this.A0p;
                ReboundViewPager reboundViewPager = this.mViewPager;
                C16180oA A002 = C16180oA.A00(r4.A03);
                if (!A002.A00.getBoolean("suggested_users_shuffle_button_tooltip_shown", false)) {
                    A002.A00.edit().putBoolean("suggested_users_shuffle_button_tooltip_shown", true).apply();
                    C56142c0 r32 = new C56142c0(reboundViewPager.getContext(), reboundViewPager, new AnonymousClass95U((int) C0003R.string.shuffle_button_tooltip_text));
                    r32.A02(r7.A0M.A09.A00);
                    r32.A05 = C56162c2.ABOVE_ANCHOR;
                    r32.A0C = true;
                    r32.A04 = new AnonymousClass88D(r4, r7);
                    r32.A00().A05();
                }
            }
        }
    }

    public final void BDU(int i, int i2) {
        String A0I2;
        String A0I3;
        this.A0r.A00(i, this);
        C256419q r2 = this.mDropFrameWatcher;
        Reel reel = this.A0Y.A0A;
        AnonymousClass172 r0 = reel.A0I;
        if (r0 != null) {
            A0I2 = r0.A00;
        } else {
            A0I2 = reel.A0I();
        }
        r2.A01.A01(A0I2);
        A0S(this);
        C256419q r22 = this.mDropFrameWatcher;
        Reel reel2 = this.A0Y.A0A;
        AnonymousClass172 r02 = reel2.A0I;
        if (r02 != null) {
            A0I3 = r02.A00;
        } else {
            A0I3 = reel2.A0I();
        }
        r22.A01.A0D.A08 = A0I3;
        if (this.A0Y.A08(this.A1F) != null && this.A0Y.A08(this.A1F).A0t() && !TextUtils.isEmpty(this.A0Y.A08(this.A1F).A08.A0l())) {
            try {
                AnonymousClass35Q r6 = this.A0M;
                List list = ((CYD) this.A0W.A01(this.A0Y.A08(this.A1F).A08.A0l())).A00.A01.A00;
                int i3 = 0;
                for (int i4 = 0; i4 < list.size() && i3 < 3; i4++) {
                    CXZ cxz = ((CYQ) list.get(i4)).A00;
                    if (cxz != null) {
                        Integer num = cxz.A06;
                        if (num == Constants.A0Y) {
                            AnonymousClass35Q.A01(r6, ((C27942CXe) new C27944CXg(new CXR(cxz)).A00.A00(0)).A00.A03(r6.A00));
                        } else if (num == Constants.A03) {
                            ImageInfo imageInfo = new C27945CXh(new CXS(cxz)).A00;
                            ImageInfo imageInfo2 = imageInfo;
                            if (imageInfo != null) {
                                AnonymousClass35Q.A01(r6, imageInfo2.A03(r6.A00));
                            }
                        } else if (num == Constants.A14) {
                            CXF cxf = new CXF(new CXM(cxz));
                            ImageInfo imageInfo3 = cxf.A00;
                            ImageInfo imageInfo4 = imageInfo3;
                            if (imageInfo3 != null) {
                                AnonymousClass12C.A0c.A0H(imageInfo4.A03(r6.A00), r6.A01.getModuleName());
                            }
                            C39831nd.A00(new C39821nc(cxf.A01, r6.A01.getModuleName()), r6.A02);
                        } else if (num == Constants.A0C) {
                            ImageInfo imageInfo5 = new C27942CXe(new CXQ(cxz)).A00;
                            ImageInfo imageInfo6 = imageInfo5;
                            if (imageInfo5 != null) {
                                AnonymousClass35Q.A01(r6, imageInfo6.A03(r6.A00));
                            }
                        }
                        i3++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (A1C(this)) {
            A03(this).A08(this.A0Y.A0A);
        }
        boolean z = true;
        if (i != this.A16.getCount() - 1) {
            z = false;
        }
        this.A2S = z;
        AnonymousClass377 r4 = this.A0v;
        C50282Fr ATu = this.A16.ATu(i);
        C50282Fr ATu2 = this.A16.ATu(i2);
        if (r4.A03 != null && ATu != null) {
            AnonymousClass377.A02(r4, ATu);
            if (!r4.A05() || r4.A0H.A0S) {
                AnonymousClass377.A01(r4, r4.A03, ATu.A0C(), true);
            }
            if (ATu2 != null) {
                AnonymousClass377.A02(r4, ATu2);
            }
        }
    }

    public final void BEa(C39941no r15) {
        if (((Boolean) AnonymousClass0L6.A03(this.A1F, AnonymousClass0L7.POLITICAL_AD_INFO_SHEET, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            A0m(this, "tapped");
        }
        C50282Fr A012 = A01(this, r15.A0F);
        AnonymousClass0C1 r2 = this.A1F;
        AnonymousClass1NJ r8 = r15.A08;
        AnonymousClass0a4.A06(r8);
        AnonymousClass0C1 r7 = r2;
        C225409n6.A00(r7, r8, this, new C66312vH(r2, this.A1R, this.A1S, A012.A0A, A012.A02, A012.A09), requireActivity(), 2, new AnonymousClass4N5(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r6.A0t() == false) goto L_0x0015;
     */
    public final /* bridge */ /* synthetic */ void BGO(Object obj) {
        boolean z;
        C39941no r6 = (C39941no) obj;
        C50282Fr A012 = A01(this, r6.A0F);
        if (!(this.mPhotoTimerController == null || r6 == null)) {
            z = true;
        }
        z = false;
        if (z) {
            this.A0K.A08(r6.A08, (String) null, 0, (String) null);
        }
        C64982sM A022 = this.A16.A02(r6);
        A022.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        C64982sM.A00(A022, 1);
        AnonymousClass8L7 r2 = this.mReelLoadingVisualization;
        if (r2 != null) {
            r2.BBC(r6.A0F, r6.getId());
        }
        AnonymousClass00B.A01.markerEnd(17301505, A012.A0A.getId().hashCode(), 2);
        if (A18()) {
            A0m(this, "suggestion_unit_overlay_shown");
        }
    }

    public final /* bridge */ /* synthetic */ void BGU(Object obj, float f) {
        int i;
        double doubleValue;
        double doubleValue2;
        float A002;
        boolean z;
        float f2 = f;
        C39941no r7 = (C39941no) obj;
        C50282Fr A012 = A01(this, r7.A0F);
        C64982sM A022 = this.A16.A02(r7);
        if (!this.A0a.A02() || !r7.Aho()) {
            A022.A07 = f2;
            C64982sM.A00(A022, 1);
            return;
        }
        AnonymousClass3E1 r12 = this.A1E;
        View view = this.mViewPager.A0C;
        if (!AnonymousClass3GT.A00(A012)) {
            z = false;
        } else {
            int AJT = r12.A02.AJT();
            int AKe = r12.A02.AKe();
            if (AnonymousClass3GT.A00(A012)) {
                double d = ((double) AJT) / 1000.0d;
                List list = A012.A0A.A0j;
                i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = list.size() - 1;
                        break;
                    }
                    double doubleValue3 = ((Double) list.get(i)).doubleValue();
                    if (i == list.size() - 1) {
                        doubleValue = ((double) AKe) / 1000.0d;
                    } else {
                        doubleValue = ((Double) list.get(i + 1)).doubleValue();
                    }
                    if (d >= doubleValue3 && d < doubleValue) {
                        break;
                    }
                    i++;
                }
            } else {
                i = -1;
            }
            if (A012.A02() < i) {
                A022.A0J = Constants.A0Y;
                AnonymousClass3E1.A00(r12, view, A012, i, r7, A022);
            }
            int AJT2 = r12.A02.AJT();
            int AKe2 = r12.A02.AKe();
            if (!AnonymousClass3GT.A00(A012)) {
                A002 = -1.0f;
            } else {
                double d2 = ((double) AJT2) / 1000.0d;
                List list2 = A012.A0A.A0j;
                int A023 = A012.A02();
                if (A023 < list2.size()) {
                    double doubleValue4 = ((Double) list2.get(A023)).doubleValue();
                    if (AnonymousClass3GT.A01(A012)) {
                        doubleValue2 = (((double) AKe2) / 1000.0d) - doubleValue4;
                        if (doubleValue2 >= 16.0d && !A022.A0W) {
                            doubleValue2 = 16.0d;
                        }
                    } else {
                        doubleValue2 = ((Double) list2.get(A023 + 1)).doubleValue() - doubleValue4;
                    }
                    A002 = C06420Oz.A00((float) ((d2 - doubleValue4) / doubleValue2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                } else {
                    throw new IllegalStateException("Video to carousel index is invalid");
                }
            }
            A022.A07 = A002;
            C64982sM.A00(A022, 1);
            z = true;
        }
        if (!z) {
            int AJT3 = this.mVideoPlayer.AJT();
            if (C66262vC.A05(r7, A012) && !C66262vC.A0B(A022, A012)) {
                f2 = (((float) AJT3) * 1.0f) / 16000.0f;
            }
            A022.A07 = f2;
            C64982sM.A00(A022, 1);
        }
        boolean A0N2 = this.mViewPager.A0N();
        AnonymousClass1NJ r1 = r7.A08;
        boolean z2 = false;
        if (r7.Aho() && !A0N2 && r1 != null && C66262vC.A05(r7, A012) && !C66262vC.A0B(A022, A012) && A022.A07 >= 1.0f) {
            z2 = true;
        }
        if (z2) {
            BGM(r7);
        }
    }

    public final void BGe() {
        AnonymousClass3ER r0 = this.mSuggestedHighlightsController;
        if (r0 != null) {
            r0.BGe();
        }
    }

    public final boolean BHU(C34151eA r13, int i, int i2, int i3, View view, IgProgressImageView igProgressImageView) {
        if (this.A28 || A18() || this.A17.A01() || this.A0w.A02() || this.A1r || this.A0Y.A08(this.A1F).A0y()) {
            return false;
        }
        if (!this.A0v.A05() || this.A0Z.A0P) {
            C34151eA r5 = r13;
            int i4 = i;
            int i5 = i2;
            if (this.A0j.A0A(r13)) {
                A0i(this, r13, i, i2);
                this.A0j.A03(getContext(), getActivity(), r13, this.A0Y);
                return true;
            }
            C34181eD r1 = r13.A0Q;
            if (r1 == C34181eD.SOUND_ON) {
                this.mVideoPlayer.ACv();
                A0R(this);
                return true;
            }
            if (r1 == C34181eD.QUESTION) {
                A0R(this);
            }
            AnonymousClass3EF r4 = this.mReelInteractiveController;
            if (r4 == null) {
                return false;
            }
            if (r4.A06(r5, i4, i5, i3, view, igProgressImageView.A05.getDrawable(), C64972sL.A02(getContext(), this.A0Y))) {
                return true;
            }
            return false;
        }
        this.A0v.A04(this.mDragToDismissController);
        return false;
    }

    public final void BHi(C50282Fr r11, C39941no r12, Integer num, RectF rectF) {
        Integer num2;
        if (this.A1r) {
            C06220Of.A0E(this.mMessageComposerText);
        }
        C50282Fr r5 = r11;
        if (!r11.A0A.A0x || !((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_ADD_TO_STORY_FROM_SELF_VIEWER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C249916w A0B2 = r11.A0B();
            switch (A0B2.AQj().intValue()) {
                case 1:
                    C39941no r4 = r12;
                    if (r11.A0I()) {
                        Reel reel = r11.A0A;
                        if (reel.A0x) {
                            if (reel.A0d()) {
                                A0m(this, "tapped");
                                A02(r11, r12).A0U(this.A2Z, this.A3I, this.A2i);
                                return;
                            }
                            return;
                        }
                    }
                    if (A0B2.AZG() == Constants.A03) {
                        A0l(this, r12.A0D, "clips_viewer_go_to_profile");
                        return;
                    }
                    String str = null;
                    if (r12.A0j()) {
                        num2 = Constants.A0C;
                    } else {
                        num2 = Constants.ZERO;
                    }
                    switch (num.intValue()) {
                        case 0:
                            if (!r12.A0j()) {
                                str = "name";
                                break;
                            } else {
                                str = "influencer_in_header";
                                break;
                            }
                        case 1:
                            str = "icon";
                            break;
                    }
                    A0Z(this, r4, r5, r11.A0B().AZf(), num2, str, "reel_viewer_go_to_profile");
                    return;
                case 2:
                    A11(A0B2.getId());
                    return;
                case 3:
                    A0W(this, new Hashtag(A0B2.getId()));
                    return;
                case 4:
                    C21980xe A002 = C21980xe.A00(getActivity(), this.A1F, "reel_viewer_title", this);
                    A002.A05(r11.A0B().getId());
                    A002.A0C();
                    return;
                default:
                    return;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("camera_entry_point", "your_story_viewer");
            A0U(this, bundle, rectF);
        }
    }

    public final void BIO() {
        AnonymousClass3ER r0 = this.mSuggestedHighlightsController;
        if (r0 != null) {
            r0.BIO();
        }
    }

    public final void BK5(Reel reel, C39941no r9) {
        C16380oV.A00.A0I(r9.A09.A0I, this.A1F, Constants.ONE, reel, (AnonymousClass5MD) null);
    }

    public final void BKj() {
        AnonymousClass2UC r4 = new AnonymousClass2UC(getActivity(), this.A1F, "https://www.facebook.com/help/resources/73056757", AnonymousClass2UD.SSI_RESOURCE_CONTENT);
        r4.A04(getModuleName());
        r4.A01();
    }

    public final void BLO(C32501bN r5, C32501bN r6) {
        Integer num;
        C32501bN r1 = C32501bN.IDLE;
        if (r5 == r1) {
            AnonymousClass3E3 r2 = this.mReelsViewerPagingNavigationPerfLogger;
            if (r2 != null) {
                if (r2.A01 && (num = r2.A00) != null) {
                    r2.A0A("reel_action", AnonymousClass3GX.A00(num));
                }
                r2.A00.A04();
            }
            if (!this.mViewPager.A0N()) {
                A0R(this);
            }
        } else if (r5 == C32501bN.DRAGGING || r5 == C32501bN.SETTLING) {
            AnonymousClass3E3 r3 = this.mReelsViewerPagingNavigationPerfLogger;
            if (r3 != null && r6 == r1) {
                if (r3.A01) {
                    r3.A0C(4, AwakeTimeSinceBootClock.INSTANCE.now());
                }
                r3.A07(AwakeTimeSinceBootClock.INSTANCE.now());
                r3.A00.A03();
            }
            A0s(this, true);
            A0m(this, "scroll");
        }
    }

    public final void BMR(C39941no r2) {
        A0G(r2, "com.instagram.ecosa.sensitive_reshare_friction.action");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        if (r0 == false) goto L_0x0024;
     */
    public final void BMn(String str, String str2, ImageUrl imageUrl, String str3, String str4, ProductAREffectContainer productAREffectContainer) {
        char c;
        AnonymousClass0RN r0;
        String str5 = str4;
        if (str4 != null) {
            AnonymousClass72T.A00(this.A1F);
        }
        C06270Ok A002 = C06270Ok.A00();
        String str6 = str;
        A002.A09("effect_id", str);
        C19030so A042 = C19020sn.A00.A04();
        AnonymousClass0C1 r2 = this.A1F;
        C58022fB r1 = C58022fB.AR_EFFECT;
        switch (str5.hashCode()) {
            case -1167061781:
                boolean equals = str5.equals("pre_cap_tray_bottom_sheet");
                c = 0;
                break;
            case 118117347:
                boolean equals2 = str5.equals("gallery_effect_preview_bottom_sheet");
                c = 5;
                break;
            case 243717239:
                boolean equals3 = str5.equals("stories_attribution_bottom_sheet");
                c = 2;
                break;
            case 293866938:
                boolean equals4 = str5.equals("profile_effect_preview_bottom_sheet");
                c = 4;
                break;
            case 1008812026:
                boolean equals5 = str5.equals("direct_effect_preview_bottom_sheet");
                c = 6;
                break;
            case 1304578444:
                boolean equals6 = str5.equals("feed_attribution_bottom_sheet");
                c = 3;
                break;
            case 1513989928:
                boolean equals7 = str5.equals("post_cap_tray_bottom_sheet");
                c = 1;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                r0 = AnonymousClass8KZ.A0D;
                break;
            case 1:
                r0 = AnonymousClass8KZ.A0C;
                break;
            case 2:
                r0 = AnonymousClass8KZ.A0F;
                break;
            case 3:
                r0 = AnonymousClass8KZ.A0A;
                break;
            case 4:
                r0 = AnonymousClass8KZ.A0E;
                break;
            case 5:
                r0 = AnonymousClass8KZ.A0B;
                break;
            case 6:
                r0 = AnonymousClass8KZ.A02;
                break;
            default:
                r0 = AnonymousClass8KZ.A0G;
                break;
        }
        C103844eE A022 = A042.A02(r2, r1, r0);
        A022.A03(str6, str2, imageUrl, str3, productAREffectContainer);
        A022.A00.putSerializable("DirectShareSheetFragment.analytics_extras", AnonymousClass0RA.A04(A002));
        C27341Hl A003 = A022.A00();
        C31221Wz A012 = C31201Wx.A01(getContext());
        if (A012 != null) {
            A0m(this, "context_switch");
            A012.A0J(A003, new AnonymousClass8CX(this));
            C16180oA.A00(this.A1F).A0g(true);
            return;
        }
        AnonymousClass0QD.A01("ReelViewerFragment", "shareEffect() BottomSheetNavigator should not be null.");
    }

    public final void BOD(C65122sa r7, C50282Fr r8, C39941no r9) {
        if (!(this.A0Y == r8 && this.A14.A00 == this.A16.Ad5(r8))) {
            r7.Bgb(1.0f);
        }
        if (r7.A03 != null) {
            AnonymousClass2E0.A00(this.A1F).A02(r7.A01.A0C(), r7.A03);
            r7.A03 = null;
        }
        if (!r8.A0A.A0i(this.A1F)) {
            AnonymousClass5Q2 r2 = new AnonymousClass5Q2(this, r8, r7);
            this.A31.add(r2);
            AnonymousClass2E0.A00(this.A1F).A03(r8.A0C(), (String) null, r2);
            r7.A03 = r2;
            HashMap hashMap = new HashMap();
            hashMap.put("media_id", r9.getId());
            AnonymousClass2E0 A002 = AnonymousClass2E0.A00(this.A1F);
            String A0C2 = r8.A0C();
            String moduleName = getModuleName();
            HashSet hashSet = new HashSet();
            hashSet.add(A0C2);
            A002.A04(hashSet, (C59302hM) null, hashMap, moduleName);
        }
        if (this.A0Y == r8) {
            A0x(r7, r9);
        }
    }

    public final void BQ6(String str, ImageUrl imageUrl, String str2, int i, int i2, View view, SparseArray sparseArray) {
        AnonymousClass373 r4 = this.A0q;
        ReboundViewPager reboundViewPager = this.mViewPager;
        r4.A00(false, true);
        r4.A04 = str;
        r4.A03 = "reel_viewer_netego_suggested_user";
        r4.A00 = sparseArray;
        C178737kF A002 = C178727kE.A00(r4.A01, reboundViewPager);
        A002.A02 = C30692Dhg.A02;
        A002.A03 = Integer.valueOf(C0003R.color.grey_3);
        AnonymousClass9B2 r1 = new AnonymousClass9B2(A002);
        r4.A02 = r1;
        r1.A03 = r4;
        C178727kE.A01(r1, str2, imageUrl, C0003R.string.profile_photo_description, false);
        r4.A02.A02(view, false, i, i2);
        A0m(this, "tapped");
    }

    public final boolean BQQ(float f, float f2) {
        if (this.A1r) {
            C06220Of.A0E(this.mMessageComposerText);
            return true;
        } else if ((A1E() != null && this.mReelViewerListenerManager.BQP()) || A1D(Constants.ZERO) || f <= this.A01 || f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return false;
        } else {
            this.A16.A02(this.A0Y.A08(this.A1F)).A0J = Constants.A0j;
            A0M(this);
            return true;
        }
    }

    public final void BQW(int i, int i2) {
        Integer num;
        C58952gn r1;
        int count;
        this.A14.A00();
        C50282Fr r2 = this.A0Y;
        if (r2 != null) {
            if (i2 > i) {
                num = Constants.A0C;
            } else {
                num = Constants.A0N;
            }
            AnonymousClass3E3 r0 = this.mReelsViewerPagingNavigationPerfLogger;
            if (r0 != null) {
                r0.A00 = num;
            }
            C64982sM A022 = this.A16.A02(r2.A08(this.A1F));
            if (i2 >= 0 || !A1D(Constants.A0C)) {
                if (i2 >= this.A16.getCount() && A1D(Constants.ONE)) {
                    A022.A0J = Constants.A0C;
                    r1 = this.A16;
                    count = r1.getCount() - 1;
                }
                C50272Fq.A00(this.A0Y.A0A, AnonymousClass3GY.A00(Constants.A0j));
            }
            A022.A0J = Constants.A0N;
            r1 = this.A16;
            count = 0;
            A0I(r1.ATu(count));
            C50272Fq.A00(this.A0Y.A0A, AnonymousClass3GY.A00(Constants.A0j));
        }
    }

    public final void BQz(float f, float f2) {
        List arrayList;
        boolean z;
        int i;
        int i2;
        if (this.A28) {
            return;
        }
        if (!this.A0v.A05() || this.A0Z.A0P) {
            Reel reel = this.A0Y.A0A;
            boolean A0W2 = reel.A0W();
            boolean A0X2 = reel.A0X();
            C34431ej A042 = A04();
            if (!this.A1r || A0W2) {
                ReboundViewPager reboundViewPager = this.mViewPager;
                if ((reboundViewPager == null || !reboundViewPager.A0N()) && !this.A17.A01()) {
                    AnonymousClass3EQ r2 = this.A0w;
                    if (r2.A02() && (A042 instanceof C34421ei)) {
                        r2.A01((C34421ei) A042, this.mDragToDismissController, this.A14);
                    } else if (Ah2()) {
                        A0u(this, true, false);
                    } else {
                        if (A042 == null || !A042.A0D()) {
                            if (this.mReelViewerListenerManager.BR1()) {
                                return;
                            }
                            if (A0W2 && ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.LIVE_TAP_TO_HIDE_COMMENTS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                AnonymousClass3E2 r1 = this.A14;
                                r1.A00 = r1.A02.A05;
                                AnonymousClass1EG r5 = r1.A01;
                                double d = 0.0d;
                                if (r5.A01 == 0.0d) {
                                    d = 1.0d;
                                }
                                r5.A03(d);
                                return;
                            } else if (A0X2 && A1E().A0z()) {
                                int AKe = this.mVideoPlayer.AKe();
                                int AJJ = this.mVideoPlayer.AJJ();
                                if (A1E() != null) {
                                    arrayList = Collections.unmodifiableList(A1E().A09.A0T);
                                } else {
                                    arrayList = new ArrayList();
                                }
                                if (!this.A1p ? f <= this.A04 : f >= this.A04) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                boolean z2 = true;
                                if (!z || !this.A1s || arrayList.isEmpty() || AJJ >= ((Integer) arrayList.get(arrayList.size() - 1)).intValue()) {
                                    z2 = false;
                                }
                                if (z2) {
                                    i2 = ((Integer) arrayList.get(0)).intValue();
                                    Iterator it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            int intValue = ((Integer) it.next()).intValue();
                                            if (intValue > AJJ) {
                                                i2 = intValue;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    i = i2 - AJJ;
                                } else {
                                    i = 15000;
                                    if (AKe >= 300000) {
                                        i = AKe / 20;
                                    }
                                    if (!z) {
                                        i = -i;
                                    }
                                    i2 = AJJ + i;
                                }
                                if (i2 < 0) {
                                    A0y((Float) null, (Float) null);
                                } else if (i2 > AKe) {
                                    A0z((Float) null, (Float) null);
                                } else {
                                    if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.EXO2_ABSOLUTE_POSITION_LAUNCHER, "seek_fix_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                        this.A1n = true;
                                    }
                                    this.mVideoPlayer.Bes(i);
                                    this.mReelViewerListenerManager.BLk(i2);
                                }
                                if (z) {
                                    this.A1s = false;
                                    return;
                                }
                                return;
                            } else if (A0W2) {
                                return;
                            } else {
                                if (!this.A1p ? Math.round(f) >= this.A07 : Math.round(f) <= this.A07) {
                                    if (!A18()) {
                                        A0z(Float.valueOf(f), Float.valueOf(f2));
                                        return;
                                    }
                                    return;
                                } else if (A14()) {
                                    A0y(Float.valueOf(f), Float.valueOf(f2));
                                    return;
                                }
                            }
                        }
                        A0R(this);
                    }
                }
            } else if (TextUtils.isEmpty(this.mMessageComposerText.getText().toString().trim()) && !this.A0x.A00(true)) {
                C06220Of.A0E(this.mMessageComposerText);
            }
        }
    }

    public final void BRO(C39941no r4) {
        C64872sB r2 = this.A0j;
        if (r2.A08(r4)) {
            r2.A02(getContext(), getActivity(), r4);
        }
    }

    public final void BSt(ChallengeStickerModel challengeStickerModel, AnonymousClass1NJ r3) {
        A0h(this, challengeStickerModel, r3.A0M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        if ("SAVED".equals(r0.A08) == false) goto L_0x0070;
     */
    public final void BSu(C39941no r23, RectF rectF, CreativeConfig creativeConfig) {
        String str;
        AttributionUser attributionUser;
        AttributionUser attributionUser2;
        AttributionUser attributionUser3;
        ImageUrl imageUrl;
        String str2;
        boolean z;
        EffectActionSheet effectActionSheet;
        List arrayList;
        EffectActionSheet effectActionSheet2;
        List arrayList2;
        C43091tn r0;
        CreativeConfig creativeConfig2 = creativeConfig;
        if (creativeConfig != null) {
            if (this.A0Z.A07) {
                return;
            }
            if (AnonymousClass17M.A00(creativeConfig2.A03, "layout") || ((AnonymousClass17M.A00(creativeConfig2.A03, "boomerang") && creativeConfig2.A04 == null) || (AnonymousClass17M.A00(creativeConfig2.A03, "photobooth") && creativeConfig2.A04 == null))) {
                RectF rectF2 = rectF;
                A0U(this, C16330oQ.A00.A02().A00(creativeConfig2, rectF2, (String) null), rectF2);
                return;
            }
            String str3 = creativeConfig2.A04;
            EffectPreview effectPreview = creativeConfig2.A01;
            ImageUrl imageUrl2 = effectPreview.A02.A00;
            if (effectPreview != null) {
                str = effectPreview.A05;
            } else {
                str = creativeConfig2.A03;
            }
            if (effectPreview != null) {
                attributionUser = effectPreview.A00;
            } else {
                attributionUser = creativeConfig2.A00;
            }
            String str4 = attributionUser.A02;
            if (effectPreview != null) {
                attributionUser2 = effectPreview.A00;
            } else {
                attributionUser2 = creativeConfig2.A00;
            }
            String str5 = attributionUser2.A01;
            if (effectPreview != null) {
                attributionUser3 = effectPreview.A00;
            } else {
                attributionUser3 = creativeConfig2.A00;
            }
            ProfilePicture profilePicture = attributionUser3.A00;
            if (profilePicture != null) {
                imageUrl = profilePicture.A00;
            } else {
                imageUrl = null;
            }
            String str6 = creativeConfig2.A06;
            if (creativeConfig2.A02()) {
                str2 = creativeConfig2.A03;
            } else {
                str2 = null;
            }
            ProductItemWithAR productItemWithAR = creativeConfig2.A02;
            EffectPreview effectPreview2 = creativeConfig2.A01;
            if (effectPreview2 != null) {
                z = true;
            }
            z = false;
            if (effectPreview2 != null) {
                effectActionSheet = effectPreview2.A01;
            } else {
                effectActionSheet = null;
            }
            if (effectActionSheet != null) {
                arrayList = effectActionSheet.A00;
            } else {
                arrayList = new ArrayList();
            }
            if (effectPreview2 != null) {
                effectActionSheet2 = effectPreview2.A01;
            } else {
                effectActionSheet2 = null;
            }
            if (effectActionSheet2 != null) {
                arrayList2 = effectActionSheet2.A01;
            } else {
                arrayList2 = new ArrayList();
            }
            boolean z2 = this.A0Z.A0D;
            String str7 = creativeConfig2.A05;
            if (effectPreview2 != null) {
                r0 = effectPreview2.A03;
            } else {
                r0 = null;
            }
            List list = arrayList;
            A0C(5, str3, imageUrl2, str, str4, str5, imageUrl, str6, str2, productItemWithAR, z, list, arrayList2, z2, str7, r0);
        }
    }

    public final void BTS(boolean z) {
        boolean z2;
        if (!this.A28) {
            if (this.A0v.A05() && !this.A0Z.A0P) {
                this.A0v.A04(this.mDragToDismissController);
            }
            this.mViewPager.setScrollMode(C32481bK.DISCRETE_PAGING);
            if (C34581ey.A08(A1E()) || A15()) {
                AnonymousClass37G r2 = this.A0m;
                if (r2.A03) {
                    AnonymousClass37I r4 = r2.A05;
                    int i = r2.A02;
                    int AJT = i - r2.A04.A00.mVideoPlayer.AJT();
                    r4.A00.mReelViewerListenerManager.BLn();
                    r4.A00.mReelViewerListenerManager.BLk(i);
                    r4.A00.mVideoPlayer.Bes(AJT);
                    r2.A03 = false;
                    r2.A02 = 0;
                    r2.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    r2.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    z2 = ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.EXO2_ABSOLUTE_POSITION_LAUNCHER, "seek_fix_enabled", false, (AnonymousClass04H) null)).booleanValue();
                } else {
                    z2 = false;
                }
                if (!z2 && this.A1n) {
                    this.A1n = false;
                    z2 = true;
                }
                if (this.A14.A00()) {
                    A0s(this, true);
                    A13(z2);
                    A06();
                } else if (!z && !this.mMessageComposerText.hasFocus()) {
                    A13(z2);
                }
            }
            A12(false);
        }
    }

    public final void BW0() {
        this.A16.A02(this.A0Y.A08(this.A1F)).A0J = Constants.A14;
        A0N(this);
    }

    public final void BW1(C39941no r2) {
        A1J(r2, this.A0Y.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d7, code lost:
        if ((java.lang.System.currentTimeMillis() - p000X.C16180oA.A00(r3.A06).A00.getLong("last_reel_viewer_tray_nux_seen_date", 0)) <= 86400000) goto L_0x00d9;
     */
    public final void BW2(C34421ei r7, C50282Fr r8, C39941no r9) {
        boolean z;
        if (!(this.A0Y == r8 && this.A14.A00 == this.A16.Ad5(r8))) {
            r7.Bgb(1.0f);
        }
        if (r7.A05 != null) {
            AnonymousClass2E0.A00(this.A1F).A02(r7.A03.A0C(), r7.A05);
            r7.A05 = null;
        }
        if (!r8.A0A.A0i(this.A1F)) {
            C72673Gl r2 = new C72673Gl(this, r8.A0J(this.A1F), r8, r7);
            this.A31.add(r2);
            AnonymousClass2E0.A00(this.A1F).A03(r8.A0C(), (String) null, r2);
            r7.A05 = r2;
            AnonymousClass2E0 A002 = AnonymousClass2E0.A00(this.A1F);
            String A0C2 = r8.A0C();
            String moduleName = getModuleName();
            HashSet hashSet = new HashSet();
            hashSet.add(A0C2);
            A002.A04(hashSet, (C59302hM) null, (Map) null, moduleName);
        }
        if (this.A0Y == r8) {
            A0x(r7, r9);
        } else if (this.A16.Ad5(r8) == this.A16.Ad5(this.A0Y) + 1) {
            AnonymousClass3EQ r3 = this.A0w;
            if (!r3.A01) {
                ReelViewerConfig reelViewerConfig = r3.A03;
                if (reelViewerConfig.A01() && reelViewerConfig.A0Q) {
                    String A0C3 = r8.A0C();
                    AnonymousClass0C1 r1 = r3.A06;
                    if (!A0C3.equals(r1.A04()) && C16180oA.A00(r1).A00.getInt("num_times_reel_viewer_tray_nux_seen", 0) < 2) {
                        z = true;
                    }
                }
            }
            z = false;
            if (z) {
                AnonymousClass3EQ r22 = this.A0w;
                r7.A0W.A02(0);
                r22.A00 = Constants.ONE;
                r22.A01 = true;
            }
        }
    }

    public final void BW3(boolean z, C39941no r3, C64982sM r4) {
        if (z && r3 == A1E()) {
            r4.A03();
        }
    }

    public final void BW4(C50282Fr r9, C39941no r10, boolean z) {
        AnonymousClass1NJ r2;
        if (z) {
            this.A0f.A0E(r9, r10);
            if (r10.A0t()) {
                r2 = r10.A08;
            } else {
                r2 = null;
            }
            if (r2 != null) {
                List A182 = r2.A18(C34181eD.ANTI_BULLY_ENG_ONLY);
                if (!C05970Ne.A05(A182)) {
                    C106654ir.A01(this.A0O, r10, A182);
                }
                List A183 = r2.A18(C34181eD.ANTI_BULLY_GLOBAL);
                if (!C05970Ne.A05(A183)) {
                    C106654ir.A01(this.A0O, r10, A183);
                }
                List A184 = r2.A18(C34181eD.VOTER_REGISTRATION);
                if (!C05970Ne.A05(A184)) {
                    C106654ir.A01(this.A0O, r10, A184);
                }
                List<C34151eA> A185 = r2.A18(C34181eD.BLOKS_TAPPABLE);
                if (!C05970Ne.A05(A185)) {
                    for (C34151eA r0 : A185) {
                        AnonymousClass23f r02 = r0.A0a;
                        if (r02 != null && r02.A05.equals("bloks_tappable_i_donated_sticker_id")) {
                            AnonymousClass0C1 r4 = this.A1F;
                            HashMap hashMap = new HashMap();
                            hashMap.put("source_name", "story");
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("sticker_id_str", "bloks_tappable_i_donated_sticker_id");
                            C146186Mt.A05(r4, this, hashMap, hashMap2, "ig_cg_view_i_donated_sticker");
                        }
                    }
                    C106654ir.A01(this.A0O, r10, A185);
                }
            }
        }
    }

    public final void BWJ(C39941no r3) {
        this.A0f.A0C(r3, ((float) this.mVideoPlayer.AJT()) / 1000.0f);
    }

    public final void BWY(C50282Fr r3, C39941no r4) {
        if (this.mViewPager.A0J == C32501bN.IDLE) {
            A0e(this, r3, r4, Constants.ONE);
        }
    }

    public final boolean Bnr() {
        return this.A27;
    }

    public final String getModuleName() {
        Reel reel;
        String str;
        C50282Fr r3 = this.A0Y;
        if (r3 == null) {
            r3 = this.A16.ATu(this.A0E);
        }
        AnonymousClass372 r1 = this.A0u;
        String A052 = C38271l0.A05(r3, r1.A08);
        String str2 = r1.A0A;
        if (r3 != null) {
            reel = r3.A0A;
        } else {
            reel = null;
        }
        if (reel == null || !reel.A0Z()) {
            str = "";
        } else {
            str = "_speakeasy";
        }
        return AnonymousClass000.A0J(A052, str2, str);
    }

    public final C06590Pq getSession() {
        return this.A1F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 == false) goto L_0x001e;
     */
    public final boolean onBackPressed() {
        boolean z;
        AnonymousClass3ER r0;
        String str;
        Integer num;
        boolean A002;
        if (this.A0Y != null) {
            AnonymousClass3EM r1 = this.A0t.A00;
            if (r1 != null) {
                C1899289r r02 = r1.A02;
                if (r02 == null || !r02.A01.A07()) {
                    A002 = r1.A00();
                } else {
                    A002 = true;
                }
                z = true;
            }
            z = false;
            if (!z && ((r0 = this.mSuggestedHighlightsController) == null || !r0.A00())) {
                AnonymousClass3EP r12 = this.A17;
                if (r12.A01()) {
                    r12.A00(Constants.A12);
                    return true;
                } else if (this.A0w.A02() && (A04() instanceof C34421ei)) {
                    this.A0w.A01((C34421ei) A04(), this.mDragToDismissController, this.A14);
                    return true;
                } else if (!C17020pY.A00().A0V(getActivity(), this.A1F).A0b()) {
                    if (!A1C(this) || this.A1u) {
                        C50282Fr r13 = this.A0Y;
                        if (r13 != null) {
                            C39941no A082 = r13.A08(this.A1F);
                            C64982sM A022 = this.A16.A02(A082);
                            Integer num2 = A022.A0J;
                            if (num2 == Constants.A0j || num2 == Constants.A12) {
                                str = this.A0a.A00;
                            } else {
                                str = AnonymousClass000.A0E(C38271l0.A05(this.A0Y, this.A1F), this.A0a.A00);
                            }
                            AnonymousClass35C r17 = this.A0f;
                            C50282Fr r15 = this.A0Y;
                            Integer num3 = A022.A0J;
                            if (this.A1F.A06.equals(A082.A0D)) {
                                num = Constants.ONE;
                            } else {
                                num = Constants.ZERO;
                            }
                            AnonymousClass1OR r132 = this.A0z;
                            float f = A022.A07;
                            float f2 = A022.A06;
                            double d = A022.A03;
                            int i = A022.A0A;
                            int i2 = A022.A08;
                            boolean z2 = A022.A0O;
                            String str2 = str;
                            AnonymousClass1OR r24 = r132;
                            float f3 = f;
                            float f4 = f2;
                            C50282Fr r19 = r15;
                            C39941no r20 = A082;
                            Integer num4 = num3;
                            r17.A0K("reel_playback_exit", r19, r20, num4, num, str2, r24, f3, f4, d, A022.A04 / 1000.0d, i, i2, z2, Collections.unmodifiableMap(A022.A0a), Collections.unmodifiableMap(A022.A0Z), Collections.unmodifiableMap(A022.A0Y), Collections.unmodifiableMap(A022.A0b));
                            return false;
                        }
                    } else {
                        C50282Fr r03 = this.A2M;
                        if (r03 == null) {
                            r03 = this.A0Y;
                        }
                        A0I(r03);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!z && !AnonymousClass0PB.A06()) {
            AnonymousClass1X4.A04(getRootActivity().getWindow(), getRootActivity().getWindow().getDecorView(), this.A2Q);
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.mVideoPlayer.onKey(view, i, keyEvent);
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [X.2eY] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.2eX] */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.8DP] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onViewCreated(View view, Bundle bundle) {
        ? r3;
        ReboundViewPager reboundViewPager;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.A0P.A3j(this);
        AnonymousClass377 r32 = this.A0v;
        if (r32.A0H.A01()) {
            RecyclerView recyclerView = (RecyclerView) ((ViewStub) view2.findViewById(C0003R.C0005id.viewer_tray_stub)).inflate();
            r32.A03 = recyclerView;
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C176507gH(r32));
            r32.A03.A0r(new C1647871b(r32, r32.A0C.getResources().getDimensionPixelSize(C0003R.dimen.reel_viewer_tray_item_margin_top)));
            AnonymousClass1WD r6 = new AnonymousClass1WD(r32.A0L, r32.A0N, r32.A0F, r32.A0C, (AnonymousClass1LO) null, true, Constants.A0C, (AnonymousClass252) null, true, (AnonymousClass1I2) null, (C27411Hs) null);
            ArrayList<C50282Fr> arrayList = new ArrayList<>(r32.A0M.A09);
            ArrayList arrayList2 = new ArrayList();
            for (C50282Fr r1 : arrayList) {
                arrayList2.add(r1.A0A);
            }
            r6.Bk5(arrayList2);
            r32.A03.setAdapter(r6);
            r32.A03.A0K.A01 = 0;
            r32.A03.setLayoutManager(new LinearLayoutManager(0, false));
            if (r32.A0H.A0T) {
                new AnonymousClass1zL(r32.A03, r32.A0N, r32, (C46201zK) null);
            }
        }
        C72023Df r7 = new C72023Df();
        this.mReelViewerListenerManager = r7;
        C72033Dh r12 = new C72033Dh(this);
        C72053Dl r13 = new C72053Dl(this);
        C16380oV r33 = C16380oV.A00;
        boolean z = false;
        if (r33 != null) {
            z = true;
        }
        if (z) {
            r33.A07(this.A1F, getActivity(), this, r7, this.A3P, this.A3O, this.A3M, this.A3N, r12, r13, this.A0a, this);
        }
        this.mPhotoTimerController = new C72133Du(this);
        this.mShowreelNativeTimerController = new C72153Dw(this);
        FragmentActivity activity = getActivity();
        Context context = getContext();
        AnonymousClass0C1 r10 = this.A1F;
        C45961yu r8 = new C45961yu(context, r10, new C72173Dy(this), new C72183Dz(this), this.A0f, RealtimeClientManager.getInstance(r10), this.mReelViewerListenerManager, this, this.A1R, this);
        AnonymousClass1OY r72 = this.A0a;
        AnonymousClass0C1 r62 = this.A1F;
        if (((Boolean) AnonymousClass0L6.A02(r62, AnonymousClass0L7.NEW_REEL_VIDEO_PLAYER_LAUNCHER, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r3 = new AnonymousClass8DP(activity, this, r8, r72, r62);
        } else {
            r3 = new C57642eX(activity, this, r8, r72, r62);
        }
        this.mVideoPlayer = r3;
        this.mAvatarAnimationView = (ReelAvatarWithBadgeView) view2.findViewById(C0003R.C0005id.animation_avatar);
        ReboundViewPager reboundViewPager2 = (ReboundViewPager) view2.findViewById(C0003R.C0005id.view_pager);
        this.mViewPager = reboundViewPager2;
        this.A1E = new AnonymousClass3E1(this.mVideoPlayer, this.mReelViewerListenerManager, reboundViewPager2, this.A1F, this.A0a, this.A0i, this);
        this.A14 = new AnonymousClass3E2(reboundViewPager2);
        this.mViewPager.A0L(this);
        this.mDropFrameWatcher = new C256419q(getActivity(), this.A1F, this, 23592966);
        if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.REELS_PAGING_NAVIGATION_LATENCY, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.mReelsViewerPagingNavigationPerfLogger = new AnonymousClass3E3(getContext());
        }
        this.mViewPager.A0L(this.mDropFrameWatcher);
        registerLifecycleListener(this.mDropFrameWatcher);
        AnonymousClass0C1 r73 = this.A1F;
        AnonymousClass0L7 r63 = AnonymousClass0L7.STORIES_CUBING_ANIMATION_OPTIMIZATIONS;
        if (((Boolean) AnonymousClass0L6.A02(r73, r63, "new_cube_positioner_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(C0003R.dimen.reel_viewer_camera_distance);
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A1F, r63, "set_camera_distance_opt_enabled", false, (AnonymousClass04H) null)).booleanValue();
            boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_CUBING_ANIMATION_OPTIMIZATIONS, "no_transforming_on_invisible_views", false, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0C1 r82 = this.A1F;
            AnonymousClass0L7 r64 = AnonymousClass0L7.STORIES_CUBING_ANIMATION_OPTIMIZATIONS;
            this.mViewPager.setItemPositioner(new C44551wL(dimensionPixelOffset, booleanValue, booleanValue2, ((Boolean) AnonymousClass0L6.A02(r82, r64, "set_pivot_y_opt_enabled", false, (AnonymousClass04H) null)).booleanValue(), ((Boolean) AnonymousClass0L6.A02(this.A1F, r64, "set_layer_type_opt_enabled", false, (AnonymousClass04H) null)).booleanValue(), ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_CUBING_ANIMATION_OPTIMIZATIONS, "no_transforming_on_invisible_views", false, (AnonymousClass04H) null)).booleanValue()));
        } else {
            this.mViewPager.setItemPositioner(new C44561wM((float) getResources().getDimensionPixelOffset(C0003R.dimen.reel_viewer_camera_distance)));
        }
        this.mViewPager.A0Q = ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_CUBING_ANIMATION_OPTIMIZATIONS, "item_address_opt_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.mViewPager.setOvershootClampingEnabled(true);
        this.mViewPager.setMaximumFlingVelocity(Math.round(C06220Of.A03(getContext(), 2750)));
        double d = 1.0d;
        if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.REEL_SCROLL_FRICTION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            double doubleValue = ((Double) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.REEL_SCROLL_FRICTION, "multiplier", Double.valueOf(1.0d), (AnonymousClass04H) null)).doubleValue();
            if (doubleValue > 0.0d) {
                d = doubleValue;
            }
        }
        this.mViewPager.setSpringConfig(C32471bJ.PAGING, AnonymousClass1EA.A01(60.0d, d * 9.2d));
        this.mViewPager.A0L(this.A0d);
        this.mViewPager.setDraggingController(new AnonymousClass3E4(this));
        A08();
        View findViewById = view2.findViewById(C0003R.C0005id.background_dimmer);
        this.mBackgroundDimmer = findViewById;
        findViewById.setVisibility(4);
        this.mMessageComposerContainer = view2.findViewById(C0003R.C0005id.reel_viewer_message_composer_container);
        this.A0l = new AnonymousClass3E7(this.A1F, view2, this.A3L, new AnonymousClass3E6((ViewStub) view2.findViewById(C0003R.C0005id.reel_reaction_balloons_viewstub)));
        this.A11 = new C706536z(this.A1F, this, this.A1R, this.A1S, this);
        C26571Ea r4 = new C26571Ea((ViewStub) view2.findViewById(C0003R.C0005id.reel_group_reply_prompt_viewstub));
        this.mGroupStoryReplyPromptHolder = r4;
        r4.A03(new AnonymousClass3E8(this));
        this.mMessageComposer = view2.findViewById(C0003R.C0005id.reel_viewer_message_composer);
        IgEditText igEditText = (IgEditText) view2.findViewById(C0003R.C0005id.reel_viewer_message_composer_text);
        this.mMessageComposerText = igEditText;
        igEditText.setHintTextColor(-1);
        this.mMessageComposerText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(getContext().getResources().getInteger(C0003R.integer.max_message_length))});
        AnonymousClass3E9 r42 = new AnonymousClass3E9(this);
        this.mMessageComposerTextWatcher = r42;
        this.mMessageComposerText.addTextChangedListener(r42);
        this.mMessageComposerText.setOnKeyListener(new AnonymousClass3EA(this));
        View findViewById2 = this.mMessageComposer.findViewById(C0003R.C0005id.reel_viewer_message_composer_text_send_btn);
        this.mMessageComposerSendBtn = findViewById2;
        ((TextView) findViewById2).setTypeface(AnonymousClass0N0.A02());
        if (AnonymousClass3EB.A00(this.A1F).booleanValue()) {
            boolean booleanValue3 = ((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.STORIES_QUICK_REACT_GIF, "is_gif_icon_enabled", false, (AnonymousClass04H) null)).booleanValue();
            int i = C0003R.C0005id.reel_viewer_message_composer_sticker_button_stub;
            if (booleanValue3) {
                i = C0003R.C0005id.reel_viewer_message_composer_gif_button_stub;
            }
            C26571Ea r43 = new C26571Ea((ViewStub) this.mMessageComposer.findViewById(i));
            this.mMessageComposerStickerButtonHolder = r43;
            r43.A01().setOnClickListener(new AnonymousClass3DU(this, booleanValue3));
            int i2 = C0003R.C0005id.reel_viewer_message_composer_sticker_shortcut_button_stub;
            if (booleanValue3) {
                i2 = C0003R.C0005id.reel_viewer_message_composer_gif_shortcut_button_stub;
            }
            C26571Ea r44 = new C26571Ea((ViewStub) this.mMessageComposerContainer.findViewById(i2));
            this.mMessageComposerStickerShortcutButtonHolder = r44;
            r44.A03(new AnonymousClass3DV(this, booleanValue3));
        }
        A09();
        this.mMessageComposerContainer.setBackground((Drawable) null);
        this.mMessageComposer.setBackground(C019000b.A03(getContext(), C0003R.C0004drawable.story_message_composer_background));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mMessageComposerContainer.getLayoutParams();
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0003R.dimen.reel_reply_composer_margin);
        marginLayoutParams.setMargins(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        this.mMessageComposerContainer.setLayoutParams(marginLayoutParams);
        if (((Boolean) AnonymousClass0L6.A00(this.A1F, AnonymousClass0L7.CX_STORIES_ABOUT_YOU_V2, "is_composer_text_enabled", false, (AnonymousClass04H) null)).booleanValue() && this.A0a == AnonymousClass1OY.STORY_MENTIONS_ACTIVITY_FEED) {
            IgTextView igTextView = (IgTextView) this.mViewRoot.findViewById(C0003R.C0005id.reel_viewer_composer_top_message);
            igTextView.setText(C0003R.string.stories_about_you_composer_top_message);
            igTextView.setVisibility(0);
        }
        View findViewById3 = this.mMessageComposerContainer.findViewById(C0003R.C0005id.reel_viewer_composer_camera_button_container);
        this.mComposerCameraButtonContainer = findViewById3;
        if (this.A0Z.A0W || this.A1h) {
            findViewById3.setVisibility(8);
        } else {
            findViewById3.setVisibility(0);
            this.mComposerCameraButtonContainer.setOnClickListener(new AnonymousClass3EC(this));
        }
        this.mVolumeIndicator = (VolumeIndicator) view2.findViewById(C0003R.C0005id.reel_volume_indicator);
        this.mLoadingOverlay = view2.findViewById(C0003R.C0005id.loading_overlay);
        this.mLoadingOverlaySpinner = (GradientSpinner) view2.findViewById(C0003R.C0005id.loading_overlay_spinner);
        AnonymousClass3ED r11 = new AnonymousClass3ED(this.A1F, getContext(), this.A16, getModuleName(), this);
        this.mBitmapReferenceManager = r11;
        if (AnonymousClass18B.A00.A02()) {
            this.mReelViewerListenerManager.A00(r11);
        }
        if (C16180oA.A00(this.A1F).A00.getBoolean("enable_stories_loading_visualization", false)) {
            AnonymousClass8L7 r74 = new AnonymousClass8L7(getContext(), this.A1F, this.mBitmapReferenceManager);
            this.mReelLoadingVisualization = r74;
            r74.A00(this.A0s.A00);
            AnonymousClass6Ab r65 = new AnonymousClass6Ab(this.mReelLoadingVisualization, this.A16);
            this.mReelLoadingVisualizationAdapterObserver = r65;
            this.A16.registerDataSetObserver(r65);
            C31591Yx.A00(this.A1F).A04(this.mReelLoadingVisualization);
            this.mViewRoot.setForeground(this.mReelLoadingVisualization);
            this.mReelLoadingVisualization.invalidateSelf();
        }
        this.mReelInteractiveController = new AnonymousClass3EF(getContext(), this.A1F, this.mViewPager, this.A0Z, this, this.A0O, this.A3T, this.A0a);
        this.A2Q = AnonymousClass1X4.A06(getRootActivity().getWindow(), getRootActivity().getWindow().getDecorView());
        if (A1C(this)) {
            View decorView = getActivity().getWindow().getDecorView();
            this.mViewerBackgroundView = decorView;
            AnonymousClass346 r45 = this.A2w;
            r45.A00 = -16777216;
            r45.A02 = -16777216;
            r45.A01 = 0;
            decorView.setBackgroundColor(-16777216);
        } else if (this.A0Z.A0O) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mViewRoot;
            this.mViewerBackgroundView = touchInterceptorFrameLayout;
            AnonymousClass346 r5 = this.A2w;
            Context context2 = getContext();
            int A002 = C019000b.A00(context2, AnonymousClass1BA.A03(context2, C0003R.attr.storyViewerScrimBackgroundColor));
            r5.A00 = -16777216;
            r5.A02 = -16777216;
            r5.A01 = A002;
            touchInterceptorFrameLayout.setBackgroundColor(-16777216);
        }
        AnonymousClass35V r46 = this.A0t;
        C27511Id r75 = this.A0P;
        AnonymousClass3EG r9 = new AnonymousClass3EG((ViewStub) view2.findViewById(C0003R.C0005id.reel_question_response_privacy_nux_stub), r75);
        AnonymousClass0C1 r83 = r46.A0B;
        r46.A01 = new AnonymousClass3EH((ViewStub) view2.findViewById(C0003R.C0005id.reel_question_text_response_composer_stub), r75, r83, r9, new AnonymousClass3EJ(r46), r46.A08);
        r46.A00 = new AnonymousClass3EM(r46.A07, r83, (ViewStub) view2.findViewById(C0003R.C0005id.reel_question_music_response_composer_stub), r9, new AnonymousClass3EJ(r46));
        this.A17 = new AnonymousClass3EP(this.A1F, getContext(), this.mView);
        this.A0w = new AnonymousClass3EQ(getContext(), this.A1F, this.A0v, this, this.A0Z, this.A1R, this.A1S);
        C23300zv.A00(this.A1F).A02(C31071Wi.class, this.A3A);
        this.mSuggestedHighlightsController = new AnonymousClass3ER(new AnonymousClass3ES(this), new AnonymousClass3ET(this), this, this.A1F, this);
        this.A0p = new AnonymousClass3EU(this.A1F, this, new AnonymousClass3EV(this), this);
        if (C05770Lw.A01(getContext()).A00.getBoolean("show_story_real_time_ad_debug_overlay", false)) {
            this.A0d.Bfe(((ViewStub) view2.findViewById(C0003R.C0005id.reel_real_time_ad_debug_overlay)).inflate());
        }
        this.A0Q.A04(C32711bj.A00(this), this.mViewPager);
        C32991cC.A00(this.A1F).A07(view2, C33051cI.SNACKS);
        if (this.A1w) {
            this.A0b.BL4();
        }
        if (((Boolean) AnonymousClass0L6.A02(this.A1F, AnonymousClass0L7.LAUNCHER_STORY_PRELOADER_PERF_IMPROVEMENT, "fix_ensure_buffer_size_init", false, (AnonymousClass04H) null)).booleanValue() && (reboundViewPager = this.mViewPager) != null) {
            reboundViewPager.post(new AnonymousClass3EW(this));
        }
    }

    public static void A0D(View view, int i) {
        float f = 0.85f;
        if (i == 0) {
            f = 1.0f;
        }
        C476524w A002 = C476524w.A00(view, 0);
        A002.A0N();
        A002.A0H(f, -1.0f);
        A002.A0I(f, -1.0f);
        A002.A07 = i;
        A002.A0S(A3W).A0T(true).A0O();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    private void A0F(C39941no r11) {
        String A012;
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r4 = this.A1F;
        switch (r11.A0E.intValue()) {
            case 0:
                List ATk = r11.A0C().ATk();
                if (!AnonymousClass0OX.A00(ATk)) {
                    A012 = ((C43531uZ) ATk.get(0)).A01();
                    break;
                }
            case 1:
                A012 = r11.A08.A0p();
                break;
            default:
                A012 = null;
                break;
        }
        View view = this.mViewPager.A0C;
        RectF rectF = null;
        if (view != null) {
            Object tag = view.getTag();
            if (A01(this, r11.A0F).A0A.A0x) {
                if (tag instanceof C34421ei) {
                    C34531et r0 = ((C34421ei) tag).A0v;
                    RectF rectF2 = this.A2d;
                    View view2 = r0.A06;
                    if (view2 != null) {
                        C06220Of.A0Z(view2, rectF2);
                    }
                }
            } else if (tag instanceof C34441ek) {
                ((C34441ek) tag).AHU().AHV(this.A2d);
            }
            rectF = this.A2d;
        }
        int AJT = this.mVideoPlayer.AJT();
        boolean z = false;
        if (this.mVideoPlayer.AKe() == -1) {
            z = true;
        }
        C163636yU.A01(activity, r4, A012, rectF, AJT, "story_swipe_up", z);
    }

    private void A0K(ReelOptionsDialog reelOptionsDialog, Reel reel, C38031kc r13) {
        reelOptionsDialog.A0T(getContext(), this.A2h, new AnonymousClass6E1(this, reel, r13), new AnonymousClass5K8(this), this.A2Z, this.A3J, this.A3K, true, this);
    }

    public static void A0N(ReelViewerFragment reelViewerFragment) {
        Collection hashSet;
        if (reelViewerFragment.isResumed() && reelViewerFragment.getActivity() != null && !reelViewerFragment.A1u) {
            if (reelViewerFragment.A0j.A09(reelViewerFragment.A0Y.A08(reelViewerFragment.A1F))) {
                A0m(reelViewerFragment, "dialog");
            } else if (reelViewerFragment.A0Z.A0K) {
                A0R(reelViewerFragment);
            } else if (!reelViewerFragment.A1F.A06.A0S() || C16920pO.getInstance() == null || !C16920pO.getInstance().maybeRequestOverlayPermissions(reelViewerFragment.getContext(), (Integer) null)) {
                C34071dx A0V2 = C17020pY.A00().A0V(reelViewerFragment.getActivity(), reelViewerFragment.A1F);
                C50282Fr r2 = reelViewerFragment.A0Y;
                A0V2.A0Y(r2, r2.A08(reelViewerFragment.A1F), (Reel) null, reelViewerFragment.A32, reelViewerFragment.A0a, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 0, false, false);
                C50282Fr r6 = reelViewerFragment.A0Y;
                boolean A0X2 = r6.A0A.A0X();
                AnonymousClass0C1 r7 = reelViewerFragment.A1F;
                HashMap hashMap = reelViewerFragment.A1W;
                if (hashMap != null) {
                    hashSet = (Set) hashMap.get(r6.A0C());
                } else {
                    hashSet = new HashSet();
                }
                HashSet hashSet2 = new HashSet(hashSet);
                if (AnonymousClass5JZ.A00(r6.A0A, r7)) {
                    Reel reel = r6.A0A;
                    HashSet hashSet3 = new HashSet();
                    for (C39941no r1 : reel.A0J(r7)) {
                        if (AnonymousClass5JZ.A01(r1)) {
                            hashSet3.add(r1.getId());
                        }
                    }
                    hashSet2.addAll(hashSet3);
                }
                if (r6.A0H()) {
                    Reel reel2 = r6.A0A;
                    HashSet hashSet4 = new HashSet();
                    if (reel2.A0Z()) {
                        for (C39941no r22 : reel2.A0J(r7)) {
                            if (r7.A06.equals(r22.A0D)) {
                                hashSet4.add(r22.getId());
                            }
                        }
                    }
                    if (!hashSet4.isEmpty()) {
                        hashSet2.addAll(hashSet4);
                    }
                }
                reelViewerFragment.A2U = true;
                C17020pY.A00();
                String id = reelViewerFragment.A0Y.A08(reelViewerFragment.A1F).getId();
                String A0C2 = reelViewerFragment.A0Y.A0C();
                AnonymousClass1OY r23 = reelViewerFragment.A0a;
                ReelDashboardFragment reelDashboardFragment = new ReelDashboardFragment();
                Bundle bundle = new Bundle();
                bundle.putString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_STARTING_ID", id);
                bundle.putInt("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_DASHBOARD_TYPE", A0X2 ? 1 : 0);
                bundle.putString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ID", A0C2);
                bundle.putSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ITEMS_FILTER", hashSet2);
                bundle.putSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_SOURCE", r23);
                reelDashboardFragment.setArguments(bundle);
                reelDashboardFragment.setTargetFragment(reelViewerFragment, 0);
                C52362Om r24 = new C52362Om(reelViewerFragment.getActivity(), reelViewerFragment.A1F);
                r24.A02 = reelDashboardFragment;
                r24.A02();
            }
        }
    }

    public static void A0V(ReelViewerFragment reelViewerFragment, AnonymousClass1NJ r6) {
        FragmentActivity activity = reelViewerFragment.getActivity();
        if (activity != null) {
            A0m(reelViewerFragment, "tapped");
            C98494Ni.A00(reelViewerFragment.A1F, activity, r6.A0M, r6.getId(), r6.A0u());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.A0X() != false) goto L_0x000e;
     */
    public static void A0X(ReelViewerFragment reelViewerFragment, Reel reel, String str, Integer num) {
        boolean z;
        if (!reel.A0W()) {
            z = false;
        }
        z = true;
        AnonymousClass0a4.A09(z);
        reelViewerFragment.A0d.BPK((String) null, reelViewerFragment.A0Y);
        if (num == 