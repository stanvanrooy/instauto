package p000X;

import android.graphics.PointF;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.feed.media.Media__JsonHelper;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.ShareTargetHelper;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1s4  reason: invalid class name and case insensitive filesystem */
public final class C42271s4 {
    public static String A00(PendingMedia pendingMedia) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A01(A05, pendingMedia);
        A05.close();
        return stringWriter.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.instagram.model.people.PeopleTag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v101, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v109, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v111, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v113, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v115, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v117, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v119, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v121, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v123, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v125, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v127, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v129, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v131, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v133, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v135, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v137, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v139, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v24, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v28, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v30, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v32, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v34, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v36, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v40, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v66, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v76, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v79, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v93, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v670, types: [com.instagram.model.shopping.ProductMention] */
    /* JADX WARNING: type inference failed for: r2v95, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v97, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v99, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v105, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v143 */
    /* JADX WARNING: type inference failed for: r2v144 */
    /* JADX WARNING: type inference failed for: r2v145 */
    /* JADX WARNING: type inference failed for: r2v146 */
    /* JADX WARNING: type inference failed for: r2v147 */
    /* JADX WARNING: type inference failed for: r2v148 */
    /* JADX WARNING: type inference failed for: r2v149 */
    /* JADX WARNING: type inference failed for: r2v150 */
    /* JADX WARNING: type inference failed for: r2v151 */
    /* JADX WARNING: type inference failed for: r2v152 */
    /* JADX WARNING: type inference failed for: r2v153 */
    /* JADX WARNING: type inference failed for: r2v154 */
    /* JADX WARNING: type inference failed for: r2v155 */
    /* JADX WARNING: type inference failed for: r2v156 */
    /* JADX WARNING: type inference failed for: r2v157 */
    /* JADX WARNING: type inference failed for: r2v158 */
    /* JADX WARNING: type inference failed for: r2v159 */
    /* JADX WARNING: type inference failed for: r2v160 */
    /* JADX WARNING: type inference failed for: r2v161 */
    /* JADX WARNING: type inference failed for: r2v162 */
    /* JADX WARNING: type inference failed for: r2v163 */
    /* JADX WARNING: type inference failed for: r2v164 */
    /* JADX WARNING: type inference failed for: r2v165 */
    /* JADX WARNING: type inference failed for: r2v166 */
    /* JADX WARNING: type inference failed for: r2v167 */
    /* JADX WARNING: type inference failed for: r2v168 */
    /* JADX WARNING: type inference failed for: r2v169 */
    /* JADX WARNING: type inference failed for: r2v170 */
    /* JADX WARNING: type inference failed for: r2v171 */
    /* JADX WARNING: type inference failed for: r2v172 */
    /* JADX WARNING: type inference failed for: r2v173 */
    /* JADX WARNING: type inference failed for: r2v174 */
    /* JADX WARNING: type inference failed for: r2v175 */
    /* JADX WARNING: type inference failed for: r2v176 */
    /* JADX WARNING: type inference failed for: r2v177 */
    /* JADX WARNING: type inference failed for: r2v178 */
    /* JADX WARNING: type inference failed for: r2v179 */
    /* JADX WARNING: type inference failed for: r2v180 */
    /* JADX WARNING: type inference failed for: r2v181 */
    /* JADX WARNING: type inference failed for: r2v182 */
    /* JADX WARNING: type inference failed for: r2v183 */
    /* JADX WARNING: type inference failed for: r2v184 */
    /* JADX WARNING: type inference failed for: r2v185 */
    /* JADX WARNING: type inference failed for: r2v186 */
    /* JADX WARNING: type inference failed for: r2v187 */
    /* JADX WARNING: type inference failed for: r2v188 */
    /* JADX WARNING: type inference failed for: r2v189 */
    /* JADX WARNING: type inference failed for: r2v190 */
    /* JADX WARNING: type inference failed for: r2v191 */
    /* JADX WARNING: type inference failed for: r2v192 */
    /* JADX WARNING: type inference failed for: r2v193 */
    /* JADX WARNING: type inference failed for: r2v194 */
    /* JADX WARNING: type inference failed for: r2v195 */
    /* JADX WARNING: type inference failed for: r2v196 */
    /* JADX WARNING: type inference failed for: r2v197 */
    /* JADX WARNING: type inference failed for: r2v198 */
    /* JADX WARNING: type inference failed for: r2v199 */
    /* JADX WARNING: type inference failed for: r2v200 */
    /* JADX WARNING: type inference failed for: r2v201 */
    /* JADX WARNING: type inference failed for: r2v202 */
    /* JADX WARNING: type inference failed for: r2v203 */
    /* JADX WARNING: type inference failed for: r2v204 */
    /* JADX WARNING: type inference failed for: r2v205 */
    /* JADX WARNING: type inference failed for: r2v206 */
    /* JADX WARNING: type inference failed for: r2v207 */
    /* JADX WARNING: type inference failed for: r2v208 */
    /* JADX WARNING: type inference failed for: r2v209 */
    /* JADX WARNING: type inference failed for: r2v210 */
    /* JADX WARNING: type inference failed for: r2v211 */
    /* JADX WARNING: type inference failed for: r2v212 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static PendingMedia parseFromJson(C13080hr r12) {
        List list;
        String str;
        ArrayList arrayList;
        String A0t;
        ArrayList arrayList2;
        String A0t2;
        HashSet hashSet;
        String A0t3;
        ArrayList arrayList3;
        String A0t4;
        ArrayList arrayList4;
        String A0t5;
        HashMap hashMap;
        String A0t6;
        ShareType valueOf;
        Venue venue;
        HashMap hashMap2;
        String A0t7;
        HashMap hashMap3;
        ProductTag productTag;
        HashSet hashSet2;
        String A0t8;
        PendingMedia pendingMedia = new PendingMedia();
        if (r12.A0g() != C13120hv.START_OBJECT) {
            r12.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r12.A0p();
            C13120hv r6 = C13120hv.END_OBJECT;
            if (A0p == r6) {
                break;
            }
            String A0i = r12.A0i();
            r12.A0p();
            if ("version".equals(A0i)) {
                pendingMedia.A0w = C42361sE.valueOf(r12.A0t());
            } else if ("jobId".equals(A0i)) {
                pendingMedia.A0B = r12.A0I();
            } else if ("serverStatus".equals(A0i)) {
                pendingMedia.A0v = C42421sK.valueOf(r12.A0t());
            } else if ("returnToServerStatusRequest".equals(A0i)) {
                pendingMedia.A0u = C42421sK.valueOf(r12.A0t());
            } else if ("targetStatus".equals(A0i)) {
                pendingMedia.A3F = C42421sK.valueOf(r12.A0t());
            } else if ("uploadManualRetryCount".equals(A0i)) {
                pendingMedia.A0N = r12.A0I();
            } else if ("uploadAutoRetryCount".equals(A0i)) {
                pendingMedia.A0C = r12.A0I();
            } else if ("pastUploadAutoRetryCount".equals(A0i)) {
                pendingMedia.A0H = r12.A0I();
            } else if ("uploadImmediateRetryCount".equals(A0i)) {
                pendingMedia.A0L = r12.A0I();
            } else if ("uploadLoopCount".equals(A0i)) {
                pendingMedia.A0M = r12.A0I();
            } else if ("uploadCancelCount".equals(A0i)) {
                pendingMedia.A0K = r12.A0I();
            } else if ("manualRetryAllowed".equals(A0i)) {
                pendingMedia.A3I = r12.A0O();
            } else if ("autoRetryAllowed".equals(A0i)) {
                pendingMedia.A3G = r12.A0O();
            } else if ("nextAutoRetryTime".equals(A0i)) {
                pendingMedia.A0W = r12.A0J();
            } else if ("mayAutoRetryBefore".equals(A0i)) {
                pendingMedia.A3J = r12.A0O();
            } else if ("postRequestTime".equals(A0i)) {
                pendingMedia.A0X = r12.A0J();
            } else if ("lastUserInteractionTime".equals(A0i)) {
                pendingMedia.A0U = r12.A0J();
            } else if ("autoRetryOnWifiOnly".equals(A0i)) {
                pendingMedia.A2e = r12.A0O();
            } else {
                ? r2 = 0;
                if ("lastUploadError".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1j = r2;
                } else if ("lastServerError".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1i = r2;
                } else if ("localizedLastServerError".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1k = r2;
                } else if ("lastUploadServerErrorCode".equals(A0i)) {
                    pendingMedia.A0D = r12.A0I();
                } else if ("ingestionLoggingInfo".equals(A0i)) {
                    pendingMedia.A0n = C42431sL.parseFromJson(r12);
                } else if ("server_passthrough_eligible".equals(A0i)) {
                    pendingMedia.A2y = r12.A0O();
                } else if ("content_tags".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        hashSet2 = new HashSet();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                A0t8 = null;
                            } else {
                                A0t8 = r12.A0t();
                            }
                            if (A0t8 != null) {
                                hashSet2.add(A0t8);
                            }
                        }
                    } else {
                        hashSet2 = null;
                    }
                    pendingMedia.A2a = hashSet2;
                } else if ("postedByUser".equals(A0i)) {
                    pendingMedia.A1B = Boolean.valueOf(r12.A0O());
                } else if ("needsUpload".equals(A0i)) {
                    pendingMedia.A1A = Boolean.valueOf(r12.A0O());
                } else if ("needsConfigure".equals(A0i)) {
                    pendingMedia.A19 = Boolean.valueOf(r12.A0O());
                } else if ("mediaType".equals(A0i)) {
                    pendingMedia.A0g = PendingMedia.A00(r12);
                } else if ("imageFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1g = r2;
                } else if ("decorImageFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1Z = r2;
                } else if ("savedOriginalFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1v = r2;
                } else if ("originalImageFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1n = r2;
                } else if ("originalImageMediaPath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1o = r2;
                } else if ("key".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1h = r2;
                } else if ("captureWaterfallId".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1U = r2;
                } else if ("mWaterfallId".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A29 = r2;
                } else if ("xpostingEntrypoint".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A2A = r2;
                } else if ("timestamp".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A24 = r2;
                } else if ("session_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1w = r2;
                } else if (TraceFieldType.BroadcastId.equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1O = r2;
                } else if ("sourceType".equals(A0i)) {
                    pendingMedia.A0I = r12.A0I();
                } else if ("cameraPosition".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1Q = r2;
                } else if ("edits".equals(A0i)) {
                    pendingMedia.A0z = C43331uE.parseFromJson(r12);
                } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A22 = r2;
                } else if ("caption".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1T = r2;
                } else if ("originalWidth".equals(A0i)) {
                    pendingMedia.A0G = r12.A0I();
                } else if ("originalHeight".equals(A0i)) {
                    pendingMedia.A0F = r12.A0I();
                } else if ("inputCropWidth".equals(A0i)) {
                    pendingMedia.A0A = r12.A0I();
                } else if ("inputCropHeight".equals(A0i)) {
                    pendingMedia.A09 = r12.A0I();
                } else if ("uploadImageWidth".equals(A0i)) {
                    pendingMedia.A0P = r12.A0I();
                } else if ("uploadImageHeight".equals(A0i)) {
                    pendingMedia.A0O = r12.A0I();
                } else if ("vertexTransformParams".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList5 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            C43391uK parseFromJson = C43381uJ.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList5.add(parseFromJson);
                            }
                        }
                        r2 = arrayList5;
                    }
                    pendingMedia.A2Y = r2;
                } else if ("landscapeColors".equals(A0i)) {
                    pendingMedia.A0c = C06020Nk.parseFromJson(r12);
                } else if ("backgroundImagePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1N = r2;
                } else if ("bitrateInfo".equals(A0i)) {
                    pendingMedia.A0q = C46541zv.parseFromJson(r12);
                } else if ("histogramReport".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1f = r2;
                } else if ("peopleTags".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList6 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            String str2 = null;
                            if (r12.A0g() != C13120hv.START_OBJECT) {
                                r12.A0f();
                            } else {
                                PeopleTag peopleTag = new PeopleTag();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (r12.A0p() != r6) {
                                    String A0i2 = r12.A0i();
                                    r12.A0p();
                                    if ("username".equals(A0i2)) {
                                        str2 = r12.A0t();
                                    } else if (MemoryDumpUploadJob.EXTRA_USER_ID.equals(A0i2)) {
                                        str3 = r12.A0t();
                                    } else if ("full_name".equals(A0i2)) {
                                        str4 = r12.A0t();
                                    } else if ("profile_pic_url".equals(A0i2)) {
                                        str5 = r12.A0t();
                                    } else if ("position".equals(A0i2)) {
                                        r12.A0p();
                                        float A0S = r12.A0S();
                                        r12.A0p();
                                        peopleTag.A00 = new PointF(A0S, r12.A0S());
                                        r12.A0p();
                                    } else if (A0i2 != null) {
                                        r12.A0f();
                                    }
                                }
                                if (!(str2 == null || str3 == null)) {
                                    peopleTag.A00.A03 = str2;
                                    peopleTag.A02().Bhx(str3);
                                }
                                if (str4 != null) {
                                    peopleTag.A00.A01 = str4;
                                }
                                if (str5 != null) {
                                    peopleTag.A00.A00 = new SimpleImageUrl(str5);
                                }
                                str2 = peopleTag;
                            }
                            if (str2 != null) {
                                arrayList6.add(str2);
                            }
                        }
                        r2 = arrayList6;
                    }
                    pendingMedia.A2B = r2;
                } else if ("productTags".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList7 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() != C13120hv.START_OBJECT) {
                                r12.A0f();
                                productTag = null;
                            } else {
                                productTag = new ProductTag(new Product());
                                boolean z = false;
                                while (r12.A0p() != r6) {
                                    String A0i3 = r12.A0i();
                                    r12.A0p();
                                    if (A0i3.equals("product_id")) {
                                        productTag.A02().Bhx(r12.A0t());
                                    } else if (A0i3.equals("product_name")) {
                                        productTag.A01.A0I = r12.A0t();
                                    } else if (A0i3.equals("product_price")) {
                                        String A0t9 = r12.A0t();
                                        Product product = productTag.A01;
                                        product.A0D = A0t9;
                                        product.A0H = A0t9;
                                    } else if (A0i3.equals("product_price_unstripped")) {
                                        String A0t10 = r12.A0t();
                                        Product product2 = productTag.A01;
                                        product2.A0C = A0t10;
                                        product2.A0G = A0t10;
                                    } else if (A0i3.equals("product_merchant")) {
                                        z = true;
                                        C13080hr A0A = C12890hY.A00.A0A(r12.A0t());
                                        A0A.A0p();
                                        productTag.A01.A02 = C44871wu.parseFromJson(A0A);
                                    } else if (A0i3.equals("position")) {
                                        r12.A0p();
                                        float A0S2 = r12.A0S();
                                        r12.A0p();
                                        productTag.A00 = new PointF(A0S2, r12.A0S());
                                        r12.A0p();
                                    } else {
                                        r12.A0f();
                                    }
                                }
                                if (!z) {
                                    productTag = null;
                                }
                            }
                            if (productTag != null) {
                                arrayList7.add(productTag);
                            }
                        }
                        r2 = arrayList7;
                    }
                    pendingMedia.A2D = r2;
                } else if ("suggested_product_tags".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList8 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            MediaSuggestedProductTag parseFromJson2 = AnonymousClass2O2.parseFromJson(r12);
                            if (parseFromJson2 != null) {
                                arrayList8.add(parseFromJson2);
                            }
                        }
                        r2 = arrayList8;
                    }
                    pendingMedia.A2E = r2;
                } else if ("product_mentions".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList9 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            Product product3 = null;
                            if (r12.A0g() != C13120hv.START_OBJECT) {
                                r12.A0f();
                            } else {
                                int i = 0;
                                int i2 = 0;
                                while (r12.A0p() != r6) {
                                    String A0i4 = r12.A0i();
                                    r12.A0p();
                                    if (A0i4.equals("product")) {
                                        C13080hr A0A2 = C12890hY.A00.A0A(r12.A0t());
                                        A0A2.A0p();
                                        product3 = C44861wt.parseFromJson(A0A2);
                                    } else if (A0i4.equals("start_position")) {
                                        i = r12.A0T();
                                    } else if (A0i4.equals("text_length")) {
                                        i2 = r12.A0T();
                                    } else {
                                        r12.A0f();
                                    }
                                }
                                product3 = new ProductMention(product3, i, i2);
                            }
                            if (product3 != null) {
                                arrayList9.add(product3);
                            }
                        }
                        r2 = arrayList9;
                    }
                    pendingMedia.A2C = r2;
                } else if ("brandedContentTag".equals(A0i)) {
                    pendingMedia.A0j = AnonymousClass2O0.parseFromJson(r12);
                } else if ("partnerBoostEnabled".equals(A0i)) {
                    pendingMedia.A36 = r12.A0O();
                } else if ("parentAlbumId".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1q = r2;
                } else if ("media".equals(A0i)) {
                    pendingMedia.A0d = AnonymousClass1NJ.A00(r12);
                } else if ("share_share_id_to_media_map".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_OBJECT) {
                        hashMap3 = new HashMap();
                        while (r12.A0p() != r6) {
                            String A0t11 = r12.A0t();
                            r12.A0p();
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                hashMap3.put(A0t11, (Object) null);
                            } else {
                                AnonymousClass1NJ A00 = AnonymousClass1NJ.A00(r12);
                                if (A00 != null) {
                                    hashMap3.put(A0t11, A00);
                                }
                            }
                        }
                    } else {
                        hashMap3 = null;
                    }
                    pendingMedia.A2H = hashMap3;
                } else if ("mediaId".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1l = r2;
                } else if ("live_duration_ms".equals(A0i)) {
                    pendingMedia.A0V = r12.A0J();
                } else if ("internal_only".equals(A0i)) {
                    pendingMedia.A2m = r12.A0O();
                } else if ("originalFolder".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1m = r2;
                } else if ("custom_accessibility_caption".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1Y = r2;
                } else if ("is_saved_instagram_story".equals(A0i)) {
                    pendingMedia.A31 = r12.A0O();
                } else if ("is_pride_media".equals(A0i)) {
                    pendingMedia.A2g = r12.A0O();
                } else if ("ring_spec".equals(A0i)) {
                    pendingMedia.A17 = C44361w2.parseFromJson(r12);
                } else if ("ring_glyph".equals(A0i)) {
                    pendingMedia.A16 = C44771wj.parseFromJson(r12);
                } else if ("twitterEnabled".equals(A0i)) {
                    pendingMedia.A3D = r12.A0O();
                } else if ("facebookEnabled".equals(A0i)) {
                    pendingMedia.A2j = r12.A0O();
                } else if ("facebookDatingEnabled".equals(A0i)) {
                    pendingMedia.A2i = r12.A0O();
                } else if ("facebookDatingId".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1c = r2;
                } else if ("tumblrEnabled".equals(A0i)) {
                    pendingMedia.A3C = r12.A0O();
                } else if ("amebaEnabled".equals(A0i)) {
                    pendingMedia.A2d = r12.A0O();
                } else if ("odnoklassnikiEnabled".equals(A0i)) {
                    pendingMedia.A35 = r12.A0O();
                } else if ("xpost_surface".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1X = r2;
                } else if ("xsharing_nonces".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_OBJECT) {
                        hashMap2 = new HashMap();
                        while (r12.A0p() != r6) {
                            String A0t12 = r12.A0t();
                            r12.A0p();
                            C13120hv A0g = r12.A0g();
                            C13120hv r0 = C13120hv.VALUE_NULL;
                            if (A0g == r0) {
                                hashMap2.put(A0t12, (Object) null);
                            } else {
                                if (A0g == r0) {
                                    A0t7 = null;
                                } else {
                                    A0t7 = r12.A0t();
                                }
                                if (A0t7 != null) {
                                    hashMap2.put(A0t12, A0t7);
                                }
                            }
                        }
                    } else {
                        hashMap2 = null;
                    }
                    pendingMedia.A2I = hashMap2;
                } else if ("ig_x_posting_configure_targets".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList10 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            C161316uR parseFromJson3 = C52232Nz.parseFromJson(r12);
                            if (parseFromJson3 != null) {
                                arrayList10.add(parseFromJson3);
                            }
                        }
                        r2 = arrayList10;
                    }
                    pendingMedia.A2F = r2;
                } else if (IgStaticMapViewManager.LATITUDE_KEY.equals(A0i)) {
                    pendingMedia.A02 = r12.A0H();
                } else if (IgStaticMapViewManager.LONGITUDE_KEY.equals(A0i)) {
                    pendingMedia.A03 = r12.A0H();
                } else if ("exif_latitude".equals(A0i)) {
                    pendingMedia.A00 = r12.A0H();
                } else if ("exif_longitude".equals(A0i)) {
                    pendingMedia.A01 = r12.A0H();
                } else if ("exif_orientation".equals(A0i)) {
                    pendingMedia.A06 = r12.A0I();
                } else if ("implicit_location".equals(A0i)) {
                    pendingMedia.A0x = AnonymousClass2FS.parseFromJson(r12);
                } else if ("location".equals(A0i)) {
                    if (r12.A0g() != C13120hv.START_OBJECT) {
                        r12.A0f();
                        venue = null;
                    } else {
                        venue = new Venue();
                        while (r12.A0p() != r6) {
                            String A0i5 = r12.A0i();
                            r12.A0p();
                            if (IgStaticMapViewManager.LATITUDE_KEY.equals(A0i5)) {
                                venue.A00 = Double.valueOf(r12.A0H());
                            } else if (IgStaticMapViewManager.LONGITUDE_KEY.equals(A0i5)) {
                                venue.A01 = Double.valueOf(r12.A0H());
                            } else if ("address".equals(A0i5)) {
                                venue.A02 = r12.A0t();
                            } else if ("externalId".equals(A0i5)) {
                                venue.A04 = r12.A0t();
                            } else if ("externalSource".equals(A0i5)) {
                                venue.A05 = r12.A0t();
                            } else if ("id".equals(A0i5)) {
                                venue.A08 = r12.A0t();
                            } else if ("name".equals(A0i5)) {
                                venue.A0B = r12.A0t();
                            }
                        }
                    }
                    pendingMedia.A0h = venue;
                } else if ("suggested_venue_position".equals(A0i)) {
                    pendingMedia.A0J = r12.A0I();
                } else if ("audioClipInfo".equals(A0i)) {
                    pendingMedia.A0i = AnonymousClass2CY.parseFromJson(r12);
                } else if ("waveform_data".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList11 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            arrayList11.add(new Float(r12.A0H()));
                        }
                        r2 = arrayList11;
                    }
                    pendingMedia.A2Z = r2;
                } else if ("waveform_sampling_frequency_hz".equals(A0i)) {
                    pendingMedia.A1I = Integer.valueOf(r12.A0I());
                } else if ("videoFilterSetting".equals(A0i)) {
                    pendingMedia.A13 = C42441sM.parseFromJson(r12);
                } else if ("videoFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1t = r2;
                } else if ("videoFileSize".equals(A0i)) {
                    pendingMedia.A0Y = r12.A0J();
                } else if ("videoResult".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A27 = r2;
                } else if ("postCaptureAREffectId".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1r = r2;
                } else if ("MuteAudio".equals(A0i)) {
                    pendingMedia.A33 = r12.A0O();
                } else if ("recordingSessionFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A28 = r2;
                } else if ("videoInfoList".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList12 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            ClipInfo parseFromJson4 = C46561zx.parseFromJson(r12);
                            if (parseFromJson4 != null) {
                                arrayList12.add(parseFromJson4);
                            }
                        }
                        r2 = arrayList12;
                    }
                    pendingMedia.A2L = r2;
                } else if ("stitchedVideoInfo".equals(A0i)) {
                    pendingMedia.A0l = C46561zx.parseFromJson(r12);
                } else if ("coverFrameTimeMs".equals(A0i)) {
                    pendingMedia.A05 = r12.A0I();
                } else if ("isCoverFrameEdited".equals(A0i)) {
                    pendingMedia.A2q = r12.A0O();
                } else if ("aspectPostCrop".equals(A0i)) {
                    pendingMedia.A04 = (float) r12.A0H();
                } else if ("story_video_segmentation_params".equals(A0i)) {
                    pendingMedia.A12 = AnonymousClass20N.parseFromJson(r12);
                } else if ("filterStrength".equals(A0i)) {
                    pendingMedia.A0Q = r12.A0I();
                } else if ("filterTypeOrdinal".equals(A0i)) {
                    pendingMedia.A0R = r12.A0I();
                } else if ("stitchedVideoFilePath".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1z = r2;
                } else if ("camera_id".equals(A0i)) {
                    pendingMedia.A1D = Integer.valueOf(r12.A0I());
                } else if ("orientation".equals(A0i)) {
                    pendingMedia.A1G = Integer.valueOf(r12.A0I());
                } else if ("face_effect_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1b = r2;
                } else if ("effect_persisted_metadata".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1a = r2;
                } else if ("capture_type".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1P = r2;
                } else if ("creation_surface".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1W = r2;
                } else if ("create_mode_format".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1S = r2;
                } else if ("reel_template_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1s = r2;
                } else if ("num_stopmotion_capture_frames".equals(A0i)) {
                    pendingMedia.A1E = Integer.valueOf(r12.A0I());
                } else if ("reshare_source".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1u = r2;
                } else if ("archived_media_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1L = r2;
                } else if ("is_captured_in_video_chat".equals(A0i)) {
                    pendingMedia.A2o = r12.A0O();
                } else if ("highlights_info".equals(A0i)) {
                    pendingMedia.A0t = C52222Ny.parseFromJson(r12);
                } else if ("product_info".equals(A0i)) {
                    pendingMedia.A10 = C52212Nx.parseFromJson(r12);
                } else if ("app_attribution_android_namespace".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1K = r2;
                } else if ("attribution_content_url".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1M = r2;
                } else if ("direct_share".equals(A0i)) {
                    pendingMedia.A18 = Boolean.valueOf(r12.A0O());
                } else if ("share_type".equals(A0i)) {
                    String A0t13 = r12.A0t();
                    if ("MULTI_CONFIG".equals(A0t13)) {
                        valueOf = ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE;
                    } else if (!ShareType.A03.contains(A0t13)) {
                        valueOf = ShareType.INVALID;
                    } else {
                        valueOf = ShareType.valueOf(A0t13);
                    }
                    pendingMedia.A15 = valueOf;
                } else if ("other_exif_data".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_OBJECT) {
                        hashMap = new HashMap();
                        while (r12.A0p() != r6) {
                            String A0t14 = r12.A0t();
                            r12.A0p();
                            C13120hv A0g2 = r12.A0g();
                            C13120hv r02 = C13120hv.VALUE_NULL;
                            if (A0g2 == r02) {
                                hashMap.put(A0t14, (Object) null);
                            } else {
                                if (A0g2 == r02) {
                                    A0t6 = null;
                                } else {
                                    A0t6 = r12.A0t();
                                }
                                if (A0t6 != null) {
                                    hashMap.put(A0t14, A0t6);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                    pendingMedia.A2G = hashMap;
                } else if ("add_to_post".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1J = r2;
                } else if ("create_new_album".equals(A0i)) {
                    pendingMedia.A2h = r12.A0O();
                } else if ("is_for_reel".equals(A0i)) {
                    pendingMedia.A2v = r12.A0O();
                } else if ("is_draft".equals(A0i)) {
                    pendingMedia.A2u = r12.A0O();
                } else if ("is_stories_draft".equals(A0i)) {
                    pendingMedia.A32 = r12.A0O();
                } else if ("is_for_selfie_sticker".equals(A0i)) {
                    pendingMedia.A2w = r12.A0O();
                } else if ("crop_rect".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList13 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf2 = Integer.valueOf(r12.A0I());
                            if (valueOf2 != null) {
                                arrayList13.add(valueOf2);
                            }
                        }
                        r2 = arrayList13;
                    }
                    pendingMedia.A2O = r2;
                } else if ("time_created".equals(A0i)) {
                    pendingMedia.A0a = r12.A0J();
                } else if ("source_media_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1y = r2;
                } else if ("shared_at_seconds".equals(A0i)) {
                    pendingMedia.A0Z = r12.A0J();
                } else if ("comments_disabled".equals(A0i)) {
                    pendingMedia.A2f = r12.A0O();
                } else if ("story_cta".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList14 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            C43531uZ parseFromJson5 = C43521uY.parseFromJson(r12);
                            if (parseFromJson5 != null) {
                                arrayList14.add(parseFromJson5);
                            }
                        }
                        r2 = arrayList14;
                    }
                    pendingMedia.A2Q = r2;
                } else if ("reel_assets".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList15 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            AnonymousClass201 parseFromJson6 = AnonymousClass200.parseFromJson(r12);
                            if (parseFromJson6 != null) {
                                arrayList15.add(parseFromJson6);
                            }
                        }
                        r2 = arrayList15;
                    }
                    pendingMedia.A2P = r2;
                } else if ("reel_interactives".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList16 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            C34151eA parseFromJson7 = C34141e9.parseFromJson(r12);
                            if (parseFromJson7 != null) {
                                arrayList16.add(parseFromJson7);
                            }
                        }
                        r2 = arrayList16;
                    }
                    pendingMedia.A2S = r2;
                } else if ("audio_mix".equals(A0i)) {
                    pendingMedia.A0e = C52202Nw.parseFromJson(r12);
                } else if ("clips_segments_metadata".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList17 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            C108994ml parseFromJson8 = C51872Ml.parseFromJson(r12);
                            if (parseFromJson8 != null) {
                                arrayList17.add(parseFromJson8);
                            }
                        }
                        r2 = arrayList17;
                    }
                    pendingMedia.A2N = r2;
                } else if ("effect_ids".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        arrayList4 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                A0t5 = null;
                            } else {
                                A0t5 = r12.A0t();
                            }
                            if (A0t5 != null) {
                                arrayList4.add(A0t5);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                    pendingMedia.A2M = arrayList4;
                } else if ("share_preview_to_feed".equals(A0i)) {
                    pendingMedia.A3A = r12.A0O();
                } else if ("rich_text_format_types".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        arrayList3 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                A0t4 = null;
                            } else {
                                A0t4 = r12.A0t();
                            }
                            if (A0t4 != null) {
                                arrayList3.add(A0t4);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                    pendingMedia.A2W = arrayList3;
                } else if ("text_metadata".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList18 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            AnonymousClass204 parseFromJson9 = AnonymousClass203.parseFromJson(r12);
                            if (parseFromJson9 != null) {
                                arrayList18.add(parseFromJson9);
                            }
                        }
                        r2 = arrayList18;
                    }
                    pendingMedia.A2V = r2;
                } else if ("story_image_regions".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList19 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            AnonymousClass206 parseFromJson10 = AnonymousClass205.parseFromJson(r12);
                            if (parseFromJson10 != null) {
                                arrayList19.add(parseFromJson10);
                            }
                        }
                        r2 = arrayList19;
                    }
                    pendingMedia.A2R = r2;
                } else if ("is_rendered_for_reel_upload".equals(A0i)) {
                    pendingMedia.A30 = r12.A0O();
                } else if ("is_done_adding_multi_config_targets".equals(A0i)) {
                    pendingMedia.A2s = r12.A0O();
                } else if ("share_targets".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList20 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            C23160zf r03 = (C23160zf) ShareTargetHelper.A00.A01(r12);
                            if (r03 != null) {
                                arrayList20.add(r03);
                            }
                        }
                        r2 = arrayList20;
                    }
                    pendingMedia.A2T = new CopyOnWriteArrayList(r2);
                } else if ("allow_multi_configures".equals(A0i)) {
                    pendingMedia.A2c = r12.A0O();
                } else if ("has_gl_drawing".equals(A0i)) {
                    pendingMedia.A2l = r12.A0O();
                } else if ("story_gated_feature".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        hashSet = new HashSet();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                A0t3 = null;
                            } else {
                                A0t3 = r12.A0t();
                            }
                            if (A0t3 != null) {
                                hashSet.add(A0t3);
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    pendingMedia.A2b = hashSet;
                } else if ("direct_expiring_media_upload_params".equals(A0i)) {
                    pendingMedia.A0m = C52192Nv.parseFromJson(r12);
                } else if ("audience".equals(A0i)) {
                    pendingMedia.A0f = (C37171jE) C37171jE.A01.get(r12.A0r());
                } else if ("imported_taken_at".equals(A0i)) {
                    pendingMedia.A0T = r12.A0J();
                } else if ("album_submedia_keys".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        arrayList2 = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                A0t2 = null;
                            } else {
                                A0t2 = r12.A0t();
                            }
                            if (A0t2 != null) {
                                arrayList2.add(A0t2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    pendingMedia.A2K = arrayList2;
                } else if ("streaming_video_path".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A21 = r2;
                } else if ("segment_collection".equals(A0i)) {
                    pendingMedia.A0r = C42451sN.parseFromJson(r12);
                } else if ("ingestion_configuration".equals(A0i)) {
                    pendingMedia.A0o = AnonymousClass26M.parseFromJson(r12);
                } else if ("ingestion_configuration_holder".equals(A0i)) {
                    pendingMedia.A0p = AnonymousClass20F.parseFromJson(r12);
                } else if ("video_quality_data".equals(A0i)) {
                    pendingMedia.A14 = C42461sO.parseFromJson(r12);
                } else if ("image_quality_data".equals(A0i)) {
                    pendingMedia.A1C = Double.valueOf(r12.A0H());
                } else if ("image_compression_quality".equals(A0i)) {
                    pendingMedia.A08 = r12.A0I();
                } else if ("fbupload_salt".equals(A0i)) {
                    pendingMedia.A07 = r12.A0I();
                } else if ("upload_job_data".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A25 = r2;
                } else if ("video_ingestion_step_data".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A26 = r2;
                } else if ("is_configure_success_reported".equals(A0i)) {
                    pendingMedia.A2p = r12.A0O();
                } else if ("retry_context".equals(A0i)) {
                    pendingMedia.A11 = C42471sP.parseFromJson(r12);
                } else if ("operation_counters".equals(A0i)) {
                    pendingMedia.A0s = C43361uH.parseFromJson(r12);
                } else if ("gallery_selectable_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1e = r2;
                } else if ("is_draft_child_of_album".equals(A0i)) {
                    pendingMedia.A2t = r12.A0O();
                } else if ("needs_landscape_transform".equals(A0i)) {
                    pendingMedia.A34 = r12.A0O();
                } else if ("has_animated_sticker".equals(A0i)) {
                    pendingMedia.A2k = r12.A0O();
                } else if ("should_render_dynamic_drawables_first".equals(A0i)) {
                    pendingMedia.A39 = r12.A0O();
                } else if ("photo_converted_to_video".equals(A0i)) {
                    pendingMedia.A37 = r12.A0O();
                } else if ("max_duration_ms_for_animated_stickers".equals(A0i) || "converted_video_duration".equals(A0i)) {
                    pendingMedia.A0E = r12.A0I();
                } else if ("video_conversion_duration_override_ms".equals(A0i)) {
                    pendingMedia.A1H = Integer.valueOf(r12.A0I());
                } else if ("story_multi_upload_session_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A20 = r2;
                } else if ("configure_time".equals(A0i)) {
                    pendingMedia.A0S = r12.A0J();
                } else if ("ttl_ms".equals(A0i)) {
                    pendingMedia.A0b = r12.A0J();
                } else if ("camera_session_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1R = r2;
                } else if ("private_mention_sharing_enabled".equals(A0i)) {
                    pendingMedia.A38 = r12.A0O();
                } else if ("transcription_text".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A23 = r2;
                } else if ("original_photo_pdq_hash".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1p = r2;
                } else if ("creation_logger_session_id".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1V = r2;
                } else if ("target_landscape_surface".equals(A0i)) {
                    pendingMedia.A3B = r12.A0O();
                } else if ("sub_media_source".equals(A0i)) {
                    if (r12.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r12.A0p() != C13120hv.END_ARRAY) {
                            if (r12.A0g() == C13120hv.VALUE_NULL) {
                                A0t = null;
                            } else {
                                A0t = r12.A0t();
                            }
                            if (A0t != null) {
                                arrayList.add(A0t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    pendingMedia.A2U = arrayList;
                } else if ("format_variant".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1d = r2;
                } else if ("is_boomerang_v2".equals(A0i)) {
                    pendingMedia.A2n = r12.A0O();
                } else if ("is_post_capture_variant".equals(A0i)) {
                    pendingMedia.A2z = r12.A0O();
                } else if ("camera_streaming".equals(A0i)) {
                    pendingMedia.A0k = C42481sQ.parseFromJson(r12);
                } else if ("num_times_post_capture_trim".equals(A0i)) {
                    pendingMedia.A1F = Integer.valueOf(r12.A0I());
                } else if ("container_module".equals(A0i)) {
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r12.A0t();
                    }
                    pendingMedia.A1x = r2;
                }
            }
            r12.A0f();
        }
        if (pendingMedia.A24 == null) {
            pendingMedia.A24 = pendingMedia.A1h;
        }
        if (pendingMedia.A0g == MediaType.VIDEO && (str = pendingMedia.A1t) != null && !new File(str).exists()) {
            pendingMedia.A1t = null;
        }
        if (pendingMedia.A0w == null) {
            pendingMedia.A0w = C42361sE.NO_VERSION;
        }
        C42361sE r04 = pendingMedia.A0w;
        pendingMedia.A3K = r04;
        int ordinal = r04.ordinal();
        while (true) {
            ordinal++;
            if (ordinal >= C42361sE.values().length) {
                break;
            }
            C42361sE r05 = C42361sE.values()[ordinal];
            pendingMedia.A0w = r05;
            r05.A00(pendingMedia);
        }
        if (pendingMedia.A0g == MediaType.VIDEO && pendingMedia.A0l == null && (list = pendingMedia.A2L) != null && !list.isEmpty()) {
            pendingMedia.A0l = (ClipInfo) pendingMedia.A2L.get(0);
        }
        List list2 = pendingMedia.A2K;
        if (list2 != null) {
            pendingMedia.A2K = Collections.unmodifiableList(list2);
        }
        if (pendingMedia.A0r.A05() || pendingMedia.A1t != null) {
            pendingMedia.A0y.A01(AnonymousClass20M.RENDERING, 1.0d);
        }
        if (pendingMedia.A0o != null) {
            pendingMedia.A0o = null;
            pendingMedia.A0W(new AnonymousClass26L());
        }
        return pendingMedia;
    }

    public static void A01(C13460iZ r7, PendingMedia pendingMedia) {
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        String AZc;
        r7.A0T();
        C42361sE r0 = pendingMedia.A0w;
        if (r0 != null) {
            r7.A0H("version", r0.toString());
        }
        r7.A0F("jobId", pendingMedia.A0B);
        C42421sK r02 = pendingMedia.A0v;
        if (r02 != null) {
            r7.A0H("serverStatus", r02.toString());
        }
        C42421sK r03 = pendingMedia.A0u;
        if (r03 != null) {
            r7.A0H("returnToServerStatusRequest", r03.toString());
        }
        if (pendingMedia.A3F != null) {
            r7.A0H("targetStatus", pendingMedia.A3F.toString());
        }
        r7.A0F("uploadManualRetryCount", pendingMedia.A0N);
        r7.A0F("uploadAutoRetryCount", pendingMedia.A0C);
        r7.A0F("pastUploadAutoRetryCount", pendingMedia.A0H);
        r7.A0F("uploadImmediateRetryCount", pendingMedia.A0L);
        r7.A0F("uploadLoopCount", pendingMedia.A0M);
        r7.A0F("uploadCancelCount", pendingMedia.A0K);
        r7.A0I("manualRetryAllowed", pendingMedia.A3I);
        r7.A0I("autoRetryAllowed", pendingMedia.A3G);
        r7.A0G("nextAutoRetryTime", pendingMedia.A0W);
        r7.A0I("mayAutoRetryBefore", pendingMedia.A3J);
        r7.A0G("postRequestTime", pendingMedia.A0X);
        r7.A0G("lastUserInteractionTime", pendingMedia.A0U);
        r7.A0I("autoRetryOnWifiOnly", pendingMedia.A2e);
        String str2 = pendingMedia.A1j;
        if (str2 != null) {
            r7.A0H("lastUploadError", str2);
        }
        String str3 = pendingMedia.A1i;
        if (str3 != null) {
            r7.A0H("lastServerError", str3);
        }
        String str4 = pendingMedia.A1k;
        if (str4 != null) {
            r7.A0H("localizedLastServerError", str4);
        }
        r7.A0F("lastUploadServerErrorCode", pendingMedia.A0D);
        if (pendingMedia.A0n != null) {
            r7.A0d("ingestionLoggingInfo");
            C42291s7 r3 = pendingMedia.A0n;
            r7.A0T();
            r7.A0F("next_publish_id", r3.A00);
            if (r3.A02 != null) {
                r7.A0d("media_publish_sent_id_list");
                r7.A0S();
                Iterator it = r3.A02.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (num != null) {
                        r7.A0X(num.intValue());
                    }
                }
                r7.A0P();
            }
            if (r3.A03 != null) {
                r7.A0d("media_success_sent_id_list");
                r7.A0S();
                Iterator it2 = r3.A03.iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    if (num2 != null) {
                        r7.A0X(num2.intValue());
                    }
                }
                r7.A0P();
            }
            if (r3.A01 != null) {
                r7.A0d("media_abandon_sent_id_list");
                r7.A0S();
                Iterator it3 = r3.A01.iterator();
                while (it3.hasNext()) {
                    Integer num3 = (Integer) it3.next();
                    if (num3 != null) {
                        r7.A0X(num3.intValue());
                    }
                }
                r7.A0P();
            }
            r7.A0I("is_publish_ready_sent", r3.A04);
            r7.A0Q();
        }
        r7.A0I("server_passthrough_eligible", pendingMedia.A2y);
        if (pendingMedia.A2a != null) {
            r7.A0d("content_tags");
            r7.A0S();
            for (String str5 : pendingMedia.A2a) {
                if (str5 != null) {
                    r7.A0g(str5);
                }
            }
            r7.A0P();
        }
        Boolean bool = pendingMedia.A1B;
        if (bool != null) {
            r7.A0I("postedByUser", bool.booleanValue());
        }
        Boolean bool2 = pendingMedia.A1A;
        if (bool2 != null) {
            r7.A0I("needsUpload", bool2.booleanValue());
        }
        Boolean bool3 = pendingMedia.A19;
        if (bool3 != null) {
            r7.A0I("needsConfigure", bool3.booleanValue());
        }
        MediaType mediaType = pendingMedia.A0g;
        if (mediaType != null) {
            r7.A0H("mediaType", PendingMedia.A04(mediaType));
        }
        String str6 = pendingMedia.A1g;
        if (str6 != null) {
            r7.A0H("imageFilePath", str6);
        }
        String str7 = pendingMedia.A1Z;
        if (str7 != null) {
            r7.A0H("decorImageFilePath", str7);
        }
        String str8 = pendingMedia.A1v;
        if (str8 != null) {
            r7.A0H("savedOriginalFilePath", str8);
        }
        String str9 = pendingMedia.A1n;
        if (str9 != null) {
            r7.A0H("originalImageFilePath", str9);
        }
        String str10 = pendingMedia.A1o;
        if (str10 != null) {
            r7.A0H("originalImageMediaPath", str10);
        }
        String str11 = pendingMedia.A1h;
        if (str11 != null) {
            r7.A0H("key", str11);
        }
        String str12 = pendingMedia.A1U;
        if (str12 != null) {
            r7.A0H("captureWaterfallId", str12);
        }
        String str13 = pendingMedia.A29;
        if (str13 != null) {
            r7.A0H("mWaterfallId", str13);
        }
        String str14 = pendingMedia.A2A;
        if (str14 != null) {
            r7.A0H("xpostingEntrypoint", str14);
        }
        String str15 = pendingMedia.A24;
        if (str15 != null) {
            r7.A0H("timestamp", str15);
        }
        String str16 = pendingMedia.A1w;
        if (str16 != null) {
            r7.A0H("session_id", str16);
        }
        String str17 = pendingMedia.A1O;
        if (str17 != null) {
            r7.A0H(TraceFieldType.BroadcastId, str17);
        }
        r7.A0F("sourceType", pendingMedia.A0I);
        String str18 = pendingMedia.A1Q;
        if (str18 != null) {
            r7.A0H("cameraPosition", str18);
        }
        if (pendingMedia.A0z != null) {
            r7.A0d("edits");
            C43331uE.A00(r7, pendingMedia.A0z);
        }
        String str19 = pendingMedia.A22;
        if (str19 != null) {
            r7.A0H(DialogModule.KEY_TITLE, str19);
        }
        String str20 = pendingMedia.A1T;
        if (str20 != null) {
            r7.A0H("caption", str20);
        }
        r7.A0F("originalWidth", pendingMedia.A0G);
        r7.A0F("originalHeight", pendingMedia.A0F);
        r7.A0F("inputCropWidth", pendingMedia.A0A);
        r7.A0F("inputCropHeight", pendingMedia.A09);
        r7.A0F("uploadImageWidth", pendingMedia.A0P);
        r7.A0F("uploadImageHeight", pendingMedia.A0O);
        if (pendingMedia.A2Y != null) {
            r7.A0d("vertexTransformParams");
            r7.A0S();
            for (C43391uK r04 : pendingMedia.A2Y) {
                if (r04 != null) {
                    C43381uJ.A00(r7, r04);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A0c != null) {
            r7.A0d("landscapeColors");
            C06020Nk.A00(r7, pendingMedia.A0c);
        }
        String str21 = pendingMedia.A1N;
        if (str21 != null) {
            r7.A0H("backgroundImagePath", str21);
        }
        if (pendingMedia.A0q != null) {
            r7.A0d("bitrateInfo");
            C46551zw r32 = pendingMedia.A0q;
            r7.A0T();
            r7.A0F("beforeRenderBitrate", r32.A01);
            r7.A0F("afterRenderBitrate", r32.A00);
            r7.A0Q();
        }
        String str22 = pendingMedia.A1f;
        if (str22 != null) {
            r7.A0H("histogramReport", str22);
        }
        if (pendingMedia.A2B != null) {
            r7.A0d("peopleTags");
            r7.A0S();
            Iterator it4 = pendingMedia.A2B.iterator();
            while (it4.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it4.next();
                if (peopleTag != null) {
                    r7.A0T();
                    r7.A0G(MemoryDumpUploadJob.EXTRA_USER_ID, Long.parseLong(peopleTag.A03()));
                    r7.A0H("username", peopleTag.A00.A03);
                    String str23 = peopleTag.A00.A01;
                    if (str23 != null) {
                        r7.A0H("full_name", str23);
                    }
                    ImageUrl imageUrl = peopleTag.A00.A00;
                    if (!(imageUrl == null || (AZc = imageUrl.AZc()) == null)) {
                        r7.A0H("profile_pic_url", AZc);
                    }
                    PointF A00 = peopleTag.A00();
                    if (A00 != null) {
                        r7.A0d("position");
                        r7.A0S();
                        r7.A0W(A00.x);
                        r7.A0W(A00.y);
                        r7.A0P();
                    }
                    r7.A0Q();
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2D != null) {
            r7.A0d("productTags");
            r7.A0S();
            Iterator it5 = pendingMedia.A2D.iterator();
            while (it5.hasNext()) {
                ProductTag productTag = (ProductTag) it5.next();
                if (!(productTag == null || productTag.A01.A02 == null)) {
                    r7.A0T();
                    r7.A0G("product_id", Long.parseLong(productTag.A03()));
                    r7.A0H("product_name", productTag.A05());
                    r7.A0H("product_price", productTag.A01.A04());
                    Product product = productTag.A01;
                    if (product.A0B()) {
                        str = product.A0C;
                    } else {
                        str = product.A0G;
                    }
                    r7.A0H("product_price_unstripped", str);
                    Merchant merchant = productTag.A01.A02;
                    StringWriter stringWriter = new StringWriter();
                    C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                    C44871wu.A00(A05, merchant);
                    A05.close();
                    r7.A0H("product_merchant", stringWriter.toString());
                    PointF A002 = productTag.A00();
                    if (A002 != null) {
                        r7.A0d("position");
                        r7.A0S();
                        r7.A0W(A002.x);
                        r7.A0W(A002.y);
                        r7.A0P();
                    }
                    r7.A0Q();
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2E != null) {
            r7.A0d("suggested_product_tags");
            r7.A0S();
            Iterator it6 = pendingMedia.A2E.iterator();
            while (it6.hasNext()) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it6.next();
                if (mediaSuggestedProductTag != null) {
                    r7.A0T();
                    if (mediaSuggestedProductTag.A01 != null) {
                        r7.A0d("product_items");
                        r7.A0S();
                        for (MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer : mediaSuggestedProductTag.A01) {
                            if (mediaSuggestedProductTagProductItemContainer != null) {
                                r7.A0T();
                                if (mediaSuggestedProductTagProductItemContainer.A01 != null) {
                                    r7.A0d("product_item");
                                    C44861wt.A00(r7, mediaSuggestedProductTagProductItemContainer.A01);
                                }
                                r7.A0E("confidence_level", mediaSuggestedProductTagProductItemContainer.A00);
                                r7.A0Q();
                            }
                        }
                        r7.A0P();
                    }
                    PointF pointF = mediaSuggestedProductTag.A00;
                    if (pointF != null) {
                        AnonymousClass1XZ.A01(r7, "dot_coordinates", pointF);
                    }
                    r7.A0I("should_auto_tag", mediaSuggestedProductTag.A02);
                    PointF pointF2 = mediaSuggestedProductTag.A00;
                    if (pointF2 != null) {
                        AnonymousClass1XZ.A01(r7, "position", pointF2);
                    }
                    r7.A0Q();
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2C != null) {
            r7.A0d("product_mentions");
            r7.A0S();
            Iterator it7 = pendingMedia.A2C.iterator();
            while (it7.hasNext()) {
                ProductMention productMention = (ProductMention) it7.next();
                if (productMention != null) {
                    r7.A0T();
                    Product product2 = productMention.A02;
                    StringWriter stringWriter2 = new StringWriter();
                    C13460iZ A052 = C12890hY.A00.A05(stringWriter2);
                    C44861wt.A00(A052, product2);
                    A052.close();
                    r7.A0H("product", stringWriter2.toString());
                    r7.A0F("start_position", productMention.A00);
                    r7.A0F("text_length", productMention.A01);
                    r7.A0Q();
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A0j != null) {
            r7.A0d("brandedContentTag");
            AnonymousClass2O0.A00(r7, pendingMedia.A0j);
        }
        r7.A0I("partnerBoostEnabled", pendingMedia.A36);
        String str24 = pendingMedia.A1q;
        if (str24 != null) {
            r7.A0H("parentAlbumId", str24);
        }
        if (pendingMedia.A0d != null) {
            r7.A0d("media");
            Media__JsonHelper.A01(r7, pendingMedia.A0d);
        }
        if (pendingMedia.A2H != null) {
            r7.A0d("share_share_id_to_media_map");
            r7.A0T();
            for (Map.Entry entry : pendingMedia.A2H.entrySet()) {
                r7.A0d((String) entry.getKey());
                if (entry.getValue() == null) {
                    r7.A0R();
                } else {
                    Media__JsonHelper.A01(r7, (AnonymousClass1NJ) entry.getValue());
                }
            }
            r7.A0Q();
        }
        String str25 = pendingMedia.A1l;
        if (str25 != null) {
            r7.A0H("mediaId", str25);
        }
        r7.A0G("live_duration_ms", pendingMedia.A0V);
        r7.A0I("internal_only", pendingMedia.A2m);
        String str26 = pendingMedia.A1m;
        if (str26 != null) {
            r7.A0H("originalFolder", str26);
        }
        String str27 = pendingMedia.A1Y;
        if (str27 != null) {
            r7.A0H("custom_accessibility_caption", str27);
        }
        r7.A0I("is_saved_instagram_story", pendingMedia.A31);
        r7.A0I("is_pride_media", pendingMedia.A2g);
        if (pendingMedia.A17 != null) {
            r7.A0d("ring_spec");
            C44361w2.A00(r7, pendingMedia.A17);
        }
        if (pendingMedia.A16 != null) {
            r7.A0d("ring_glyph");
            C44771wj.A00(r7, pendingMedia.A16);
        }
        r7.A0I("twitterEnabled", pendingMedia.A3D);
        r7.A0I("facebookEnabled", pendingMedia.A2j);
        r7.A0I("facebookDatingEnabled", pendingMedia.A2i);
        String str28 = pendingMedia.A1c;
        if (str28 != null) {
            r7.A0H("facebookDatingId", str28);
        }
        r7.A0I("tumblrEnabled", pendingMedia.A3C);
        r7.A0I("amebaEnabled", pendingMedia.A2d);
        r7.A0I("odnoklassnikiEnabled", pendingMedia.A35);
        String str29 = pendingMedia.A1X;
        if (str29 != null) {
            r7.A0H("xpost_surface", str29);
        }
        if (pendingMedia.A2I != null) {
            r7.A0d("xsharing_nonces");
            r7.A0T();
            for (Map.Entry entry2 : pendingMedia.A2I.entrySet()) {
                r7.A0d((String) entry2.getKey());
                if (entry2.getValue() == null) {
                    r7.A0R();
                } else {
                    r7.A0g((String) entry2.getValue());
                }
            }
            r7.A0Q();
        }
        if (pendingMedia.A2F != null) {
            r7.A0d("ig_x_posting_configure_targets");
            r7.A0S();
            Iterator it8 = pendingMedia.A2F.iterator();
            while (it8.hasNext()) {
                C161316uR r33 = (C161316uR) it8.next();
                if (r33 != null) {
                    r7.A0T();
                    String str30 = r33.A01;
                    if (str30 != null) {
                        r7.A0H("target_user_id", str30);
                    }
                    Integer num4 = r33.A00;
                    if (num4 != null) {
                        r7.A0H("configure_result", C191748Hs.A00(num4));
                    }
                    r7.A0Q();
                }
            }
            r7.A0P();
        }
        r7.A0D(IgStaticMapViewManager.LATITUDE_KEY, pendingMedia.A02);
        r7.A0D(IgStaticMapViewManager.LONGITUDE_KEY, pendingMedia.A03);
        r7.A0D("exif_latitude", pendingMedia.A00);
        r7.A0D("exif_longitude", pendingMedia.A01);
        r7.A0F("exif_orientation", pendingMedia.A06);
        if (pendingMedia.A0x != null) {
            r7.A0d("implicit_location");
            AnonymousClass2FS.A00(r7, pendingMedia.A0x);
        }
        if (pendingMedia.A0h != null) {
            r7.A0d("location");
            Venue venue = pendingMedia.A0h;
            r7.A0T();
            Double d = venue.A00;
            if (d != null) {
                r7.A0D(IgStaticMapViewManager.LATITUDE_KEY, d.doubleValue());
            }
            Double d2 = venue.A01;
            if (d2 != null) {
                r7.A0D(IgStaticMapViewManager.LONGITUDE_KEY, d2.doubleValue());
            }
            r7.A0H("address", venue.A02);
            r7.A0H("externalId", venue.A04);
            r7.A0H("externalSource", venue.A05);
            r7.A0H("id", venue.getId());
            r7.A0H("name", venue.A0B);
            r7.A0Q();
        }
        r7.A0F("suggested_venue_position", pendingMedia.A0J);
        if (pendingMedia.A0i != null) {
            r7.A0d("audioClipInfo");
            AnonymousClass2CZ r34 = pendingMedia.A0i;
            r7.A0T();
            String str31 = r34.A01;
            if (str31 != null) {
                r7.A0H("file_path", str31);
            }
            r7.A0F("duration", r34.A00);
            r7.A0Q();
        }
        if (pendingMedia.A2Z != null) {
            r7.A0d("waveform_data");
            r7.A0S();
            for (Float f : pendingMedia.A2Z) {
                if (f != null) {
                    r7.A0W(f.floatValue());
                }
            }
            r7.A0P();
        }
        Integer num5 = pendingMedia.A1I;
        if (num5 != null) {
            r7.A0F("waveform_sampling_frequency_hz", num5.intValue());
        }
        if (pendingMedia.A13 != null) {
            r7.A0d("videoFilterSetting");
            C42441sM.A00(r7, pendingMedia.A13);
        }
        String str32 = pendingMedia.A1t;
        if (str32 != null) {
            r7.A0H("videoFilePath", str32);
        }
        r7.A0G("videoFileSize", pendingMedia.A0Y);
        String str33 = pendingMedia.A27;
        if (str33 != null) {
            r7.A0H("videoResult", str33);
        }
        String str34 = pendingMedia.A1r;
        if (str34 != null) {
            r7.A0H("postCaptureAREffectId", str34);
        }
        r7.A0I("MuteAudio", pendingMedia.A33);
        String str35 = pendingMedia.A28;
        if (str35 != null) {
            r7.A0H("recordingSessionFilePath", str35);
        }
        if (pendingMedia.A2L != null) {
            r7.A0d("videoInfoList");
            r7.A0S();
            for (ClipInfo clipInfo : pendingMedia.A2L) {
                if (clipInfo != null) {
                    C46561zx.A00(r7, clipInfo);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A0l != null) {
            r7.A0d("stitchedVideoInfo");
            C46561zx.A00(r7, pendingMedia.A0l);
        }
        r7.A0F("coverFrameTimeMs", pendingMedia.A05);
        r7.A0I("isCoverFrameEdited", pendingMedia.A2q);
        r7.A0E("aspectPostCrop", pendingMedia.A04);
        if (pendingMedia.A12 != null) {
            r7.A0d("story_video_segmentation_params");
            AnonymousClass20N.A00(r7, pendingMedia.A12);
        }
        r7.A0F("filterStrength", pendingMedia.A0Q);
        r7.A0F("filterTypeOrdinal", pendingMedia.A0R);
        String str36 = pendingMedia.A1z;
        if (str36 != null) {
            r7.A0H("stitchedVideoFilePath", str36);
        }
        Integer num6 = pendingMedia.A1D;
        if (num6 != null) {
            r7.A0F("camera_id", num6.intValue());
        }
        Integer num7 = pendingMedia.A1G;
        if (num7 != null) {
            r7.A0F("orientation", num7.intValue());
        }
        String str37 = pendingMedia.A1b;
        if (str37 != null) {
            r7.A0H("face_effect_id", str37);
        }
        String str38 = pendingMedia.A1a;
        if (str38 != null) {
            r7.A0H("effect_persisted_metadata", str38);
        }
        String str39 = pendingMedia.A1P;
        if (str39 != null) {
            r7.A0H("capture_type", str39);
        }
        String str40 = pendingMedia.A1W;
        if (str40 != null) {
            r7.A0H("creation_surface", str40);
        }
        String str41 = pendingMedia.A1S;
        if (str41 != null) {
            r7.A0H("create_mode_format", str41);
        }
        String str42 = pendingMedia.A1s;
        if (str42 != null) {
            r7.A0H("reel_template_id", str42);
        }
        Integer num8 = pendingMedia.A1E;
        if (num8 != null) {
            r7.A0F("num_stopmotion_capture_frames", num8.intValue());
        }
        String str43 = pendingMedia.A1u;
        if (str43 != null) {
            r7.A0H("reshare_source", str43);
        }
        String str44 = pendingMedia.A1L;
        if (str44 != null) {
            r7.A0H("archived_media_id", str44);
        }
        r7.A0I("is_captured_in_video_chat", pendingMedia.A2o);
        if (pendingMedia.A0t != null) {
            r7.A0d("highlights_info");
            C52222Ny.A00(r7, pendingMedia.A0t);
        }
        if (pendingMedia.A10 != null) {
            r7.A0d("product_info");
            C52212Nx.A00(r7, pendingMedia.A10);
        }
        String str45 = pendingMedia.A1K;
        if (str45 != null) {
            r7.A0H("app_attribution_android_namespace", str45);
        }
        String str46 = pendingMedia.A1M;
        if (str46 != null) {
            r7.A0H("attribution_content_url", str46);
        }
        Boolean bool4 = pendingMedia.A18;
        if (bool4 != null) {
            r7.A0I("direct_share", bool4.booleanValue());
        }
        ShareType shareType = pendingMedia.A15;
        if (shareType != null) {
            r7.A0H("share_type", shareType.toString());
        }
        if (pendingMedia.A2G != null) {
            r7.A0d("other_exif_data");
            r7.A0T();
            for (Map.Entry entry3 : pendingMedia.A2G.entrySet()) {
                r7.A0d((String) entry3.getKey());
                if (entry3.getValue() == null) {
                    r7.A0R();
                } else {
                    r7.A0g((String) entry3.getValue());
                }
            }
            r7.A0Q();
        }
        String str47 = pendingMedia.A1J;
        if (str47 != null) {
            r7.A0H("add_to_post", str47);
        }
        r7.A0I("create_new_album", pendingMedia.A2h);
        r7.A0I("is_for_reel", pendingMedia.A2v);
        r7.A0I("is_draft", pendingMedia.A2u);
        r7.A0I("is_stories_draft", pendingMedia.A32);
        r7.A0I("is_for_selfie_sticker", pendingMedia.A2w);
        if (pendingMedia.A2O != null) {
            r7.A0d("crop_rect");
            r7.A0S();
            for (Integer num9 : pendingMedia.A2O) {
                if (num9 != null) {
                    r7.A0X(num9.intValue());
                }
            }
            r7.A0P();
        }
        r7.A0G("time_created", pendingMedia.A0a);
        String str48 = pendingMedia.A1y;
        if (str48 != null) {
            r7.A0H("source_media_id", str48);
        }
        r7.A0G("shared_at_seconds", pendingMedia.A0Z);
        r7.A0I("comments_disabled", pendingMedia.A2f);
        if (pendingMedia.A2Q != null) {
            r7.A0d("story_cta");
            r7.A0S();
            for (C43531uZ r05 : pendingMedia.A2Q) {
                if (r05 != null) {
                    C43521uY.A00(r7, r05);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2P != null) {
            r7.A0d("reel_assets");
            r7.A0S();
            for (AnonymousClass201 r06 : pendingMedia.A2P) {
                if (r06 != null) {
                    AnonymousClass200.A00(r7, r06);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2S != null) {
            r7.A0d("reel_interactives");
            r7.A0S();
            for (C34151eA r07 : pendingMedia.A2S) {
                if (r07 != null) {
                    C34141e9.A00(r7, r07);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A0e != null) {
            r7.A0d("audio_mix");
            C52202Nw.A00(r7, pendingMedia.A0e);
        }
        if (pendingMedia.A2N != null) {
            r7.A0d("clips_segments_metadata");
            r7.A0S();
            for (C108994ml r08 : pendingMedia.A2N) {
                if (r08 != null) {
                    C51872Ml.A00(r7, r08);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2M != null) {
            r7.A0d("effect_ids");
            r7.A0S();
            for (String str49 : pendingMedia.A2M) {
                if (str49 != null) {
                    r7.A0g(str49);
                }
            }
            r7.A0P();
        }
        r7.A0I("share_preview_to_feed", pendingMedia.A3A);
        if (pendingMedia.A2W != null) {
            r7.A0d("rich_text_format_types");
            r7.A0S();
            for (String str50 : pendingMedia.A2W) {
                if (str50 != null) {
                    r7.A0g(str50);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2V != null) {
            r7.A0d("text_metadata");
            r7.A0S();
            for (AnonymousClass204 r09 : pendingMedia.A2V) {
                if (r09 != null) {
                    AnonymousClass203.A00(r7, r09);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2X != null) {
            r7.A0d("text_metadata");
            r7.A0S();
            for (C185917wt r010 : pendingMedia.A2X) {
                if (r010 != null) {
                    C185807wi.A00(r7, r010);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A2R != null) {
            r7.A0d("story_image_regions");
            r7.A0S();
            for (AnonymousClass206 r011 : pendingMedia.A2R) {
                if (r011 != null) {
                    AnonymousClass205.A00(r7, r011);
                }
            }
            r7.A0P();
        }
        r7.A0I("is_rendered_for_reel_upload", pendingMedia.A30);
        r7.A0I("is_done_adding_multi_config_targets", pendingMedia.A2s);
        if (pendingMedia.A2T != null) {
            r7.A0d("share_targets");
            r7.A0S();
            for (C23160zf r1 : pendingMedia.A2T) {
                if (r1 != null) {
                    ShareTargetHelper.A00.A02(r7, r1);
                }
            }
            r7.A0P();
        }
        r7.A0I("allow_multi_configures", pendingMedia.A2c);
        r7.A0I("has_gl_drawing", pendingMedia.A2l);
        if (pendingMedia.A2b != null) {
            r7.A0d("story_gated_feature");
            r7.A0S();
            for (String str51 : pendingMedia.A2b) {
                if (str51 != null) {
                    r7.A0g(str51);
                }
            }
            r7.A0P();
        }
        if (pendingMedia.A0m != null) {
            r7.A0d("direct_expiring_media_upload_params");
            AnonymousClass4S9 r35 = pendingMedia.A0m;
            r7.A0T();
            String str52 = r35.A00;
            if (str52 != null) {
                r7.A0H("direct_expiring_media_recipient_view_mode", str52);
            }
            String str53 = r35.A01;
            if (str53 != null) {
                r7.A0H("direct_expiring_media_reply_type", str53);
            }
            r7.A0Q();
        }
        C37171jE r012 = pendingMedia.A0f;
        if (r012 != null) {
            r7.A0H("audience", r012.A00);
        }
        r7.A0G("imported_taken_at", pendingMedia.A0T);
        if (pendingMedia.A2K != null) {
            r7.A0d("album_submedia_keys");
            r7.A0S();
            for (String str54 : pendingMedia.A2K) {
                if (str54 != null) {
                    r7.A0g(str54);
                }
            }
            r7.A0P();
        }
        String str55 = pendingMedia.A21;
        if (str55 != null) {
            r7.A0H("streaming_video_path", str55);
        }
        if (pendingMedia.A0r != null) {
            r7.A0d("segment_collection");
            C42451sN.A00(r7, pendingMedia.A0r);
        }
        if (pendingMedia.A0o != null) {
            r7.A0d("ingestion_configuration");
            AnonymousClass26M.A00(r7, true);
        }
        if (pendingMedia.A0p != null) {
            r7.A0d("ingestion_configuration_holder");
            AnonymousClass20F.A00(r7, pendingMedia.A0p);
        }
        if (pendingMedia.A14 != null) {
            r7.A0d("video_quality_data");
            C42461sO.A00(r7, pendingMedia.A14);
        }
        Double d3 = pendingMedia.A1C;
        if (d3 != null) {
            r7.A0D("image_quality_data", d3.doubleValue());
        }
        r7.A0F("image_compression_quality", pendingMedia.A08);
        r7.A0F("fbupload_salt", pendingMedia.A07);
        String str56 = pendingMedia.A25;
        if (str56 != null) {
            r7.A0H("upload_job_data", str56);
        }
        String str57 = pendingMedia.A26;
        if (str57 != null) {
            r7.A0H("video_ingestion_step_data", str57);
        }
        r7.A0I("is_configure_success_reported", pendingMedia.A2p);
        if (pendingMedia.A11 != null) {
            r7.A0d("retry_context");
            C42331sB r2 = pendingMedia.A11;
            r7.A0T();
            r7.A0F("reupload_count", r2.A00);
            if (r2.A01 != null) {
                r7.A0d("step_auto_retry_count");
                r7.A0S();
                for (Integer num10 : r2.A01) {
                    if (num10 != null) {
                        r7.A0X(num10.intValue());
                    }
                }
                r7.A0P();
            }
            if (r2.A02 != null) {
                r7.A0d("step_auto_manual_count");
                r7.A0S();
                for (Integer num11 : r2.A02) {
                    if (num11 != null) {
                        r7.A0X(num11.intValue());
                    }
                }
                r7.A0P();
            }
            r7.A0Q();
        }
        if (pendingMedia.A0s != null) {
            r7.A0d("operation_counters");
            C43371uI r12 = pendingMedia.A0s;
            r7.A0T();
            synchronized (r12) {
                hashMap = r12.A00;
            }
            if (hashMap != null) {
                r7.A0d("counters");
                r7.A0T();
                synchronized (r12) {
                    hashMap2 = r12.A00;
                }
                for (Map.Entry entry4 : hashMap2.entrySet()) {
                    r7.A0d((String) entry4.getKey());
                    if (entry4.getValue() == null) {
                        r7.A0R();
                    } else {
                        r7.A0X(((Integer) entry4.getValue()).intValue());
                    }
                }
                r7.A0Q();
            }
            r7.A0Q();
        }
        String str58 = pendingMedia.A1e;
        if (str58 != null) {
            r7.A0H("gallery_selectable_id", str58);
        }
        r7.A0I("is_draft_child_of_album", pendingMedia.A2t);
        r7.A0I("needs_landscape_transform", pendingMedia.A34);
        r7.A0I("has_animated_sticker", pendingMedia.A2k);
        r7.A0I("should_render_dynamic_drawables_first", pendingMedia.A39);
        r7.A0I("photo_converted_to_video", pendingMedia.A37);
        r7.A0F("max_duration_ms_for_animated_stickers", pendingMedia.A0E);
        Integer num12 = pendingMedia.A1H;
        if (num12 != null) {
            r7.A0F("video_conversion_duration_override_ms", num12.intValue());
        }
        String str59 = pendingMedia.A20;
        if (str59 != null) {
            r7.A0H("story_multi_upload_session_id", str59);
        }
        r7.A0G("configure_time", pendingMedia.A0S);
        r7.A0G("ttl_ms", pendingMedia.A0b);
        String str60 = pendingMedia.A1R;
        if (str60 != null) {
            r7.A0H("camera_session_id", str60);
        }
        r7.A0I("private_mention_sharing_enabled", pendingMedia.A38);
        String str61 = pendingMedia.A23;
        if (str61 != null) {
            r7.A0H("transcription_text", str61);
        }
        String str62 = pendingMedia.A1p;
        if (str62 != null) {
            r7.A0H("original_photo_pdq_hash", str62);
        }
        String str63 = pendingMedia.A1V;
        if (str63 != null) {
            r7.A0H("creation_logger_session_id", str63);
        }
        r7.A0I("target_landscape_surface", pendingMedia.A3B);
        if (pendingMedia.A2U != null) {
            r7.A0d("sub_media_source");
            r7.A0S();
            for (String str64 : pendingMedia.A2U) {
                if (str64 != null) {
                    r7.A0g(str64);
                }
            }
            r7.A0P();
        }
        String str65 = pendingMedia.A1d;
        if (str65 != null) {
            r7.A0H("format_variant", str65);
        }
        r7.A0I("is_boomerang_v2", pendingMedia.A2n);
        r7.A0I("is_post_capture_variant", pendingMedia.A2z);
        if (pendingMedia.A0k != null) {
            r7.A0d("camera_streaming");
            C42351sD r22 = pendingMedia.A0k;
            r7.A0T();
            r7.A0I("has_post_capture_effects", r22.A00);
            r7.A0I("is_recording_completed", r22.A01);
            r7.A0Q();
        }
        Integer num13 = pendingMedia.A1F;
        if (num13 != null) {
            r7.A0F("num_times_post_capture_trim", num13.intValue());
        }
        String str66 = pendingMedia.A1x;
        if (str66 != null) {
            r7.A0H("container_module", str66);
        }
        r7.A0Q();
    }
}
