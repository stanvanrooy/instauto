package com.instagram.feed.media;

import android.graphics.PointF;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import p000X.Constants;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1O2;
import p000X.AnonymousClass1OT;
import p000X.AnonymousClass1OU;
import p000X.AnonymousClass1OZ;
import p000X.AnonymousClass1Oa;
import p000X.AnonymousClass1TC;
import p000X.AnonymousClass1TN;
import p000X.AnonymousClass1TO;
import p000X.AnonymousClass1TS;
import p000X.AnonymousClass1UP;
import p000X.AnonymousClass1UW;
import p000X.AnonymousClass1UX;
import p000X.AnonymousClass1WH;
import p000X.AnonymousClass1WI;
import p000X.AnonymousClass1XQ;
import p000X.AnonymousClass1XR;
import p000X.AnonymousClass1XZ;
import p000X.AnonymousClass1YR;
import p000X.AnonymousClass1YS;
import p000X.AnonymousClass1YT;
import p000X.AnonymousClass1YX;
import p000X.AnonymousClass1YY;
import p000X.AnonymousClass20V;
import p000X.AnonymousClass20W;
import p000X.AnonymousClass23N;
import p000X.AnonymousClass23O;
import p000X.AnonymousClass24A;
import p000X.AnonymousClass24B;
import p000X.AnonymousClass26N;
import p000X.AnonymousClass27Y;
import p000X.AnonymousClass29U;
import p000X.AnonymousClass29V;
import p000X.AnonymousClass29e;
import p000X.AnonymousClass2A0;
import p000X.AnonymousClass2A1;
import p000X.AnonymousClass2A2;
import p000X.AnonymousClass2IO;
import p000X.AnonymousClass2O8;
import p000X.AnonymousClass40Q;
import p000X.AnonymousClass432;
import p000X.AnonymousClass4XB;
import p000X.AnonymousClass5H6;
import p000X.AnonymousClass5HG;
import p000X.AnonymousClass5HH;
import p000X.AnonymousClass5HJ;
import p000X.AnonymousClass5HQ;
import p000X.AnonymousClass5HY;
import p000X.AnonymousClass5LD;
import p000X.AnonymousClass5NT;
import p000X.AnonymousClass77u;
import p000X.AnonymousClass96O;
import p000X.AnonymousClass9LP;
import p000X.C1188558d;
import p000X.C120495Ev;
import p000X.C120835Ge;
import p000X.C120845Gf;
import p000X.C121075Hd;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13270iF;
import p000X.C13300iJ;
import p000X.C13460iZ;
import p000X.C149496aQ;
import p000X.C153146gc;
import p000X.C153166ge;
import p000X.C172307Yb;
import p000X.C176937h2;
import p000X.C2106296n;
import p000X.C211469Ac;
import p000X.C28865Cnz;
import p000X.C28881Np;
import p000X.C29161Ov;
import p000X.instagramComment;
import p000X.C29841Rl;
import p000X.C30111So;
import p000X.C30141Sr;
import p000X.C30161St;
import p000X.C30764DjM;
import p000X.C30765DjN;
import p000X.C31261Xe;
import p000X.C31931aG;
import p000X.C31941aH;
import p000X.C31951aI;
import p000X.C31971aK;
import p000X.C34101e2;
import p000X.C34141e9;
import p000X.C34151eA;
import p000X.C34201eF;
import p000X.C34211eH;
import p000X.C34301eS;
import p000X.C34311eU;
import p000X.C34331eY;
import p000X.C34541eu;
import p000X.C36811ie;
import p000X.C37171jE;
import p000X.C38081kh;
import p000X.C39441mv;
import p000X.C39451mw;
import p000X.C43061th;
import p000X.C43071tj;
import p000X.C43081tl;
import p000X.C43521uY;
import p000X.C43531uZ;
import p000X.C44851wr;
import p000X.C44861wt;
import p000X.C46041z2;
import p000X.C46111z9;
import p000X.C46121zA;
import p000X.C46311zX;
import p000X.C468020x;
import p000X.C472822y;
import p000X.C480126h;
import p000X.C486929c;
import p000X.C487029d;
import p000X.C487129f;
import p000X.C487229g;
import p000X.C487329h;
import p000X.C487429i;
import p000X.C487529j;
import p000X.C487629k;
import p000X.C487729l;
import p000X.C487829m;
import p000X.C487929n;
import p000X.C488029o;
import p000X.C488129p;
import p000X.C488229q;
import p000X.C488329r;
import p000X.C488429s;
import p000X.C488529t;
import p000X.C488629u;
import p000X.C488729v;
import p000X.C488829w;
import p000X.C488929x;
import p000X.C489029y;
import p000X.C489129z;
import p000X.C49052An;
import p000X.C49062Ao;
import p000X.C51852Mj;
import p000X.C54452Xj;
import p000X.C56982dN;
import p000X.C57042dT;
import p000X.C57262dr;
import p000X.C57922f1;
import p000X.C59332hP;
import p000X.C59352hR;
import p000X.C62582nx;
import p000X.C96714Gf;
import p000X.DjO;
import p000X.DjP;

public final class Media__JsonHelper {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v96, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v98, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v102, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v104, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v110, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v112, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v114, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v128, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v130, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v132, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v134, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v136, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v138, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v140, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v144, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v148, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v150, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v156, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v158, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v170, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v172, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v177, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v179, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v181, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v187, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v189, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v191, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v24, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v26, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v28, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v30, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v32, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v34, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v36, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v38, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v40, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v42, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v44, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v46, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v48, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v50, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v52, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v54, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v56, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v58, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v60, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v62, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v64, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v66, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v68, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v70, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v72, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v74, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v76, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v78, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v80, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v82, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v84, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v86, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v88, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v90, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v92, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v94, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v108, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v120, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v142, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v146, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v152, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v154, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v160, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v162, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v164, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v166, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v168, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v183, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v185, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v193 */
    /* JADX WARNING: type inference failed for: r3v194 */
    /* JADX WARNING: type inference failed for: r3v195 */
    /* JADX WARNING: type inference failed for: r3v196 */
    /* JADX WARNING: type inference failed for: r3v197 */
    /* JADX WARNING: type inference failed for: r3v198 */
    /* JADX WARNING: type inference failed for: r3v199 */
    /* JADX WARNING: type inference failed for: r3v200 */
    /* JADX WARNING: type inference failed for: r3v201 */
    /* JADX WARNING: type inference failed for: r3v202 */
    /* JADX WARNING: type inference failed for: r3v203 */
    /* JADX WARNING: type inference failed for: r3v204 */
    /* JADX WARNING: type inference failed for: r3v205 */
    /* JADX WARNING: type inference failed for: r3v206 */
    /* JADX WARNING: type inference failed for: r3v207 */
    /* JADX WARNING: type inference failed for: r3v208 */
    /* JADX WARNING: type inference failed for: r3v209 */
    /* JADX WARNING: type inference failed for: r3v210 */
    /* JADX WARNING: type inference failed for: r3v211 */
    /* JADX WARNING: type inference failed for: r3v212 */
    /* JADX WARNING: type inference failed for: r3v213 */
    /* JADX WARNING: type inference failed for: r3v214 */
    /* JADX WARNING: type inference failed for: r3v215 */
    /* JADX WARNING: type inference failed for: r3v216 */
    /* JADX WARNING: type inference failed for: r3v217 */
    /* JADX WARNING: type inference failed for: r3v218 */
    /* JADX WARNING: type inference failed for: r3v219 */
    /* JADX WARNING: type inference failed for: r3v220 */
    /* JADX WARNING: type inference failed for: r3v221 */
    /* JADX WARNING: type inference failed for: r3v222 */
    /* JADX WARNING: type inference failed for: r3v223 */
    /* JADX WARNING: type inference failed for: r3v224 */
    /* JADX WARNING: type inference failed for: r3v225 */
    /* JADX WARNING: type inference failed for: r3v226 */
    /* JADX WARNING: type inference failed for: r3v227 */
    /* JADX WARNING: type inference failed for: r3v228 */
    /* JADX WARNING: type inference failed for: r3v229 */
    /* JADX WARNING: type inference failed for: r3v230 */
    /* JADX WARNING: type inference failed for: r3v231 */
    /* JADX WARNING: type inference failed for: r3v232 */
    /* JADX WARNING: type inference failed for: r3v233 */
    /* JADX WARNING: type inference failed for: r3v234 */
    /* JADX WARNING: type inference failed for: r3v235 */
    /* JADX WARNING: type inference failed for: r3v236 */
    /* JADX WARNING: type inference failed for: r3v237 */
    /* JADX WARNING: type inference failed for: r3v238 */
    /* JADX WARNING: type inference failed for: r3v239 */
    /* JADX WARNING: type inference failed for: r3v240 */
    /* JADX WARNING: type inference failed for: r3v241 */
    /* JADX WARNING: type inference failed for: r3v242 */
    /* JADX WARNING: type inference failed for: r3v243 */
    /* JADX WARNING: type inference failed for: r3v244 */
    /* JADX WARNING: type inference failed for: r3v245 */
    /* JADX WARNING: type inference failed for: r3v246 */
    /* JADX WARNING: type inference failed for: r3v247 */
    /* JADX WARNING: type inference failed for: r3v248 */
    /* JADX WARNING: type inference failed for: r3v249 */
    /* JADX WARNING: type inference failed for: r3v250 */
    /* JADX WARNING: type inference failed for: r3v251 */
    /* JADX WARNING: type inference failed for: r3v252 */
    /* JADX WARNING: type inference failed for: r3v253 */
    /* JADX WARNING: type inference failed for: r3v254 */
    /* JADX WARNING: type inference failed for: r3v255 */
    /* JADX WARNING: type inference failed for: r3v256 */
    /* JADX WARNING: type inference failed for: r3v257 */
    /* JADX WARNING: type inference failed for: r3v258 */
    /* JADX WARNING: type inference failed for: r3v259 */
    /* JADX WARNING: type inference failed for: r3v260 */
    /* JADX WARNING: type inference failed for: r3v261 */
    /* JADX WARNING: type inference failed for: r3v262 */
    /* JADX WARNING: type inference failed for: r3v263 */
    /* JADX WARNING: type inference failed for: r3v264 */
    /* JADX WARNING: type inference failed for: r3v265 */
    /* JADX WARNING: type inference failed for: r3v266 */
    /* JADX WARNING: type inference failed for: r3v267 */
    /* JADX WARNING: type inference failed for: r3v268 */
    /* JADX WARNING: type inference failed for: r3v269 */
    /* JADX WARNING: type inference failed for: r3v270 */
    /* JADX WARNING: type inference failed for: r3v271 */
    /* JADX WARNING: type inference failed for: r3v272 */
    /* JADX WARNING: type inference failed for: r3v273 */
    /* JADX WARNING: type inference failed for: r3v274 */
    /* JADX WARNING: type inference failed for: r3v275 */
    /* JADX WARNING: type inference failed for: r3v276 */
    /* JADX WARNING: type inference failed for: r3v277 */
    /* JADX WARNING: type inference failed for: r3v278 */
    /* JADX WARNING: type inference failed for: r3v279 */
    /* JADX WARNING: type inference failed for: r3v280 */
    /* JADX WARNING: type inference failed for: r3v281 */
    /* JADX WARNING: type inference failed for: r3v282 */
    /* JADX WARNING: type inference failed for: r3v283 */
    /* JADX WARNING: type inference failed for: r3v284 */
    /* JADX WARNING: type inference failed for: r3v285 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1639 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static AnonymousClass1NJ A00(C13080hr r8) {
        AnonymousClass1NJ A00;
        ArrayList arrayList;
        String A0t;
        C96714Gf parseFromJson;
        AnonymousClass5HG parseFromJson2;
        AnonymousClass5HY parseFromJson3;
        C121075Hd parseFromJson4;
        AnonymousClass23O parseFromJson5;
        AnonymousClass20W parseFromJson6;
        C43531uZ parseFromJson7;
        C34151eA parseFromJson8;
        C34151eA parseFromJson9;
        C34151eA parseFromJson10;
        C34151eA parseFromJson11;
        C34151eA parseFromJson12;
        C34151eA parseFromJson13;
        C34151eA parseFromJson14;
        C34151eA parseFromJson15;
        C34151eA parseFromJson16;
        C34151eA parseFromJson17;
        C34151eA parseFromJson18;
        C34151eA parseFromJson19;
        C34151eA parseFromJson20;
        C34101e2 r0;
        ArrayList arrayList2;
        String A0t2;
        Integer num;
        ArrayList arrayList3;
        String A0t3;
        ArrayList arrayList4;
        String A0t4;
        Integer num2;
        String str;
        Integer num3;
        Integer num4;
        ArrayList arrayList5;
        String A0t5;
        AnonymousClass1NJ r1 = new AnonymousClass1NJ();
        if (r8.A0g() != C13120hv.START_OBJECT) {
            r8.A0f();
            return null;
        }
        while (r8.A0p() != C13120hv.END_OBJECT) {
            String A0i = r8.A0i();
            r8.A0p();
            ? r3 = 0;
            if ("preview".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A26 = r3;
            } else if ("image_versions2".equals(A0i)) {
                r1.A0n = C28881Np.parseFromJson(r8);
            } else if ("accessibility_caption".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1c = r3;
            } else if ("original_width".equals(A0i)) {
                r1.A09 = r8.A0I();
            } else if ("original_height".equals(A0i)) {
                r1.A08 = r8.A0I();
            } else if ("media_cropping_info".equals(A0i)) {
                r1.A0g = AnonymousClass1YS.parseFromJson(r8);
            } else if ("creative_config".equals(A0i)) {
                r1.A0M = C34301eS.parseFromJson(r8);
            } else if ("id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1x = r3;
            } else if ("user".equals(A0i)) {
                r1.A13 = C13300iJ.A00(r8);
            } else if ("media_type".equals(A0i)) {
                r1.A0r = MediaType.A00(r8.A0I());
            } else if ("taken_at".equals(A0i)) {
                r1.A0D = r8.A0J();
            } else if ("expiring_at".equals(A0i)) {
                r1.A1Y = Long.valueOf(r8.A0J());
            } else if ("is_reel_media".equals(A0i)) {
                r1.A3U = r8.A0O();
            } else if ("has_audio".equals(A0i)) {
                r1.A19 = Boolean.valueOf(r8.A0O());
            } else if ("has_transcription".equals(A0i)) {
                r1.A1B = Boolean.valueOf(r8.A0O());
            } else if ("attribution".equals(A0i)) {
                r1.A0I = C46041z2.parseFromJson(r8);
            } else if ("video_versions".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList6 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        VideoUrlImpl parseFromJson21 = C29841Rl.parseFromJson(r8);
                        if (parseFromJson21 != null) {
                            arrayList6.add(parseFromJson21);
                        }
                    }
                    r3 = arrayList6;
                }
                r1.A3E = r3;
            } else if ("base_video_versions".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList7 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        VideoUrlImpl parseFromJson22 = C29841Rl.parseFromJson(r8);
                        if (parseFromJson22 != null) {
                            arrayList7.add(parseFromJson22);
                        }
                    }
                    r3 = arrayList7;
                }
                r1.A2S = r3;
            } else if ("video_subtitles_uri".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2L = r3;
            } else if ("video_dash_manifest".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2J = r3;
            } else if ("is_dash_eligible".equals(A0i)) {
                r1.A1P = Integer.valueOf(r8.A0I());
            } else if ("video_codec".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2I = r3;
            } else if ("like_count".equals(A0i)) {
                r1.A1Q = Integer.valueOf(r8.A0I());
            } else if ("bucketed_like_count".equals(A0i)) {
                r1.A1L = Integer.valueOf(r8.A0I());
            } else if ("ads_bucketed_like_count".equals(A0i)) {
                r1.A1J = Integer.valueOf(r8.A0I());
            } else if ("top_likers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    arrayList5 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        if (r8.A0g() == C13120hv.VALUE_NULL) {
                            A0t5 = null;
                        } else {
                            A0t5 = r8.A0t();
                        }
                        if (A0t5 != null) {
                            arrayList5.add(A0t5);
                        }
                    }
                } else {
                    arrayList5 = null;
                }
                r1.A3D = arrayList5;
            } else if ("liker_config".equals(A0i)) {
                r1.A0W = AnonymousClass1OT.parseFromJson(r8);
            } else if ("follower_count".equals(A0i)) {
                r1.A06 = r8.A0I();
            } else if ("has_liked".equals(A0i)) {
                if (r8.A0O()) {
                    num4 = Constants.ZERO;
                } else {
                    num4 = Constants.ONE;
                }
                r1.A1R = num4;
            } else if ("has_viewer_saved".equals(A0i)) {
                if (r8.A0O()) {
                    num3 = Constants.ZERO;
                } else {
                    num3 = Constants.ONE;
                }
                r1.A1U = num3;
            } else if ("inline_composer_display_condition".equals(A0i)) {
                String A0r = r8.A0r();
                Integer[] A002 = Constants.ZERO(2);
                int length = A002.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        num2 = Constants.ZERO;
                        break;
                    }
                    num2 = A002[i];
                    if (1 - num2.intValue() != 0) {
                        str = "never";
                    } else {
                        str = "impression_trigger";
                    }
                    if (str.equals(A0r)) {
                        break;
                    }
                    i++;
                }
                r1.A1O = num2;
            } else if ("inline_composer_imp_trigger_time".equals(A0i)) {
                r1.A1G = Double.valueOf(r8.A0H());
            } else if ("can_viewer_save".equals(A0i)) {
                r1.A3H = r8.A0O();
            } else if ("can_reshare".equals(A0i)) {
                r1.A15 = Boolean.valueOf(r8.A0O());
            } else if ("can_reply".equals(A0i)) {
                r1.A14 = Boolean.valueOf(r8.A0O());
            } else if ("try_challenge_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2G = r3;
            } else if ("try_challenge_name".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2H = r3;
            } else if ("create_mode_attribution".equals(A0i)) {
                r1.A0Q = C34331eY.parseFromJson(r8);
            } else if ("saved_collection_ids".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    arrayList4 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        if (r8.A0g() == C13120hv.VALUE_NULL) {
                            A0t4 = null;
                        } else {
                            A0t4 = r8.A0t();
                        }
                        if (A0t4 != null) {
                            arrayList4.add(A0t4);
                        }
                    }
                } else {
                    arrayList4 = null;
                }
                r1.A38 = arrayList4;
            } else if ("view_count".equals(A0i)) {
                r1.A1W = Integer.valueOf(r8.A0I());
            } else if ("bucketed_view_count".equals(A0i)) {
                r1.A1M = Integer.valueOf(r8.A0I());
            } else if ("play_count".equals(A0i)) {
                r1.A1S = Integer.valueOf(r8.A0I());
            } else if ("gating".equals(A0i)) {
                r1.A0N = C38081kh.parseFromJson(r8);
            } else if ("media_overlay_info".equals(A0i)) {
                r1.A0h = AnonymousClass2A2.parseFromJson(r8);
            } else if ("comment_count".equals(A0i)) {
                r1.A1N = Integer.valueOf(r8.A0I());
            } else if ("caption".equals(A0i)) {
                r1.A0K = C29161Ov.parseFromJson(r8);
            } else if ("caption_list".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    arrayList3 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        if (r8.A0g() == C13120hv.VALUE_NULL) {
                            A0t3 = null;
                        } else {
                            A0t3 = r8.A0t();
                        }
                        if (A0t3 != null) {
                            arrayList3.add(A0t3);
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                r1.A2V = arrayList3;
            } else if ("caption_is_edited".equals(A0i)) {
                r1.A3O = r8.A0O();
            } else if ("comments".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList8 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        instagramComment parseFromJson23 = C29161Ov.parseFromJson(r8);
                        if (parseFromJson23 != null) {
                            arrayList8.add(parseFromJson23);
                        }
                    }
                    r3 = arrayList8;
                }
                r1.A2P = r3;
            } else if ("preview_comments".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList9 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        instagramComment parseFromJson24 = C29161Ov.parseFromJson(r8);
                        if (parseFromJson24 != null) {
                            arrayList9.add(parseFromJson24);
                        }
                    }
                    r3 = arrayList9;
                }
                r1.A2c = r3;
            } else if ("facepile_top_likers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList10 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1WI parseFromJson25 = AnonymousClass1WH.parseFromJson(r8);
                        if (parseFromJson25 != null) {
                            arrayList10.add(parseFromJson25);
                        }
                    }
                    r3 = arrayList10;
                }
                r1.A2Y = r3;
            } else if ("comments_disabled".equals(A0i)) {
                r1.A3L = r8.A0O();
            } else if ("commenting_disabled_for_viewer".equals(A0i)) {
                r1.A16 = Boolean.valueOf(r8.A0O());
            } else if ("direct_reply_to_author_enabled".equals(A0i)) {
                r1.A17 = Boolean.valueOf(r8.A0O());
            } else if ("is_external_share_disabled".equals(A0i)) {
                r1.A18 = Boolean.valueOf(r8.A0O());
            } else if ("location".equals(A0i)) {
                r1.A0z = Venue.A00(r8, true);
            } else if ("lat".equals(A0i)) {
                r1.A1H = Double.valueOf(r8.A0H());
            } else if ("lng".equals(A0i)) {
                r1.A1I = Double.valueOf(r8.A0H());
            } else if ("usertags".equals(A0i)) {
                r1.A0Y = AnonymousClass1XQ.parseFromJson(r8);
            } else if ("photo_of_you".equals(A0i)) {
                r1.A3Z = r8.A0O();
            } else if ("post_share_source".equals(A0i)) {
                String A0t6 = r8.A0t();
                Integer[] A003 = Constants.ZERO(1);
                int length2 = A003.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        num = null;
                        break;
                    }
                    num = A003[i2];
                    if ("direct_reply_to_author".equals(A0t6)) {
                        break;
                    }
                    i2++;
                }
                r1.A1V = num;
            } else if ("product_tags".equals(A0i)) {
                r1.A0Z = C44851wr.parseFromJson(r8);
            } else if ("media_notice".equals(A0i)) {
                r1.A0X = AnonymousClass2A1.parseFromJson(r8);
            } else if ("total_viewer_count".equals(A0i)) {
                r1.A0A = r8.A0I();
            } else if ("is_internal_only".equals(A0i)) {
                r1.A3R = r8.A0O();
            } else if ("viewers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList11 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C13300iJ A004 = C13300iJ.A00(r8);
                        if (A004 != null) {
                            arrayList11.add(A004);
                        }
                    }
                    r3 = arrayList11;
                }
                r1.A36 = r3;
            } else if (RealtimeProtocol.DIRECT_V2_ITEM_REACTIONS.equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList12 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass5LD parseFromJson26 = AnonymousClass2A0.parseFromJson(r8);
                        if (parseFromJson26 != null) {
                            arrayList12.add(parseFromJson26);
                        }
                    }
                    r3 = arrayList12;
                }
                r1.A2d = r3;
            } else if ("reaction_count".equals(A0i)) {
                r1.A0C = r8.A0I();
            } else if ("blacklist_sample".equals(A0i)) {
                r1.A12 = C489129z.parseFromJson(r8);
            } else if ("viewer_cursor".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2C = r3;
            } else if ("multi_author_reel_names".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    arrayList2 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        if (r8.A0g() == C13120hv.VALUE_NULL) {
                            A0t2 = null;
                        } else {
                            A0t2 = r8.A0t();
                        }
                        if (A0t2 != null) {
                            arrayList2.add(A0t2);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                r1.A2O = arrayList2;
            } else if ("supports_reel_reactions".equals(A0i)) {
                r1.A3d = r8.A0O();
            } else if ("direct_text".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1o = r3;
            } else if ("story_unlockable_sticker_info".equals(A0i)) {
                r1.A0j = C489029y.parseFromJson(r8);
            } else if ("playback_duration_secs".equals(A0i)) {
                r1.A1b = Long.valueOf(r8.A0J());
            } else if ("url_expire_at_secs".equals(A0i)) {
                r1.A1a = Long.valueOf(r8.A0J());
            } else if ("reel_media_background".equals(A0i)) {
                r1.A0a = C488929x.parseFromJson(r8);
            } else if ("video_chat_capture_info".equals(A0i)) {
                r1.A0f = C488829w.parseFromJson(r8);
            } else if ("attachments".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList13 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C149496aQ parseFromJson27 = C488729v.parseFromJson(r8);
                        if (parseFromJson27 != null) {
                            arrayList13.add(parseFromJson27);
                        }
                    }
                    r3 = arrayList13;
                }
                r1.A2R = r3;
            } else if ("sponsor_tags".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList14 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass24B parseFromJson28 = AnonymousClass24A.parseFromJson(r8);
                        if (parseFromJson28 != null) {
                            arrayList14.add(parseFromJson28);
                        }
                    }
                    r3 = arrayList14;
                }
                r1.A39 = r3;
            } else if ("has_bc_violation".equals(A0i)) {
                r1.A3X = r8.A0O();
            } else if ("iab_autofill_optout_info".equals(A0i)) {
                r1.A0T = AnonymousClass1UW.parseFromJson(r8);
            } else if ("injected".equals(A0i)) {
                r1.A0d = C30111So.parseFromJson(r8);
            } else if ("ad_disclaimer_info".equals(A0i)) {
                r1.A0v = C488629u.parseFromJson(r8);
            } else if ("interaction_timestamp".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A20 = r3;
            } else if ("story_app_attribution".equals(A0i)) {
                r1.A0e = AnonymousClass29U.parseFromJson(r8);
            } else if ("show_disclaimer".equals(A0i)) {
                r1.A3b = r8.A0O();
            } else if ("disclaimer".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1p = r3;
            } else if ("android_links".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList15 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1UP A005 = AnonymousClass1UP.A00(r8);
                        if (A005 != null) {
                            arrayList15.add(A005);
                        }
                    }
                    r3 = arrayList15;
                }
                r1.A2Q = r3;
            } else if ("click_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1w = r3;
            } else if ("ad_metadata".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList16 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1TO parseFromJson29 = AnonymousClass1TN.parseFromJson(r8);
                        if (parseFromJson29 != null) {
                            arrayList16.add(parseFromJson29);
                        }
                    }
                    r3 = arrayList16;
                }
                r1.A2M = r3;
            } else if ("dominant_color".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1q = r3;
            } else if ("show_fullname_in_header".equals(A0i)) {
                r1.A3c = r8.A0O();
            } else if ("fb_page_url".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1v = r3;
            } else if ("organic_tracking_token".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A29 = r3;
            } else if ("algorithm".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1g = r3;
            } else if ("explore_context".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1s = r3;
            } else if ("explore_source_token".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1t = r3;
            } else if ("explore".equals(A0i)) {
                r1.A0S = C39441mv.parseFromJson(r8);
            } else if ("mezql_token".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A25 = r3;
            } else if ("connection_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1n = r3;
            } else if ("event_badge".equals(A0i)) {
                r1.A0R = C488529t.parseFromJson(r8);
            } else if ("impression_token".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1y = r3;
            } else if ("rank_token".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2B = r3;
            } else if ("is_panorama".equals(A0i)) {
                r1.A3S = r8.A0O();
            } else if ("carousel_media".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList17 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1NJ A006 = AnonymousClass1NJ.A00(r8);
                        if (A006 != null) {
                            arrayList17.add(A006);
                        }
                    }
                    r3 = arrayList17;
                }
                r1.A2W = r3;
            } else if ("carousel_parent_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1l = r3;
            } else if ("carousel_share_child_media_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1k = r3;
            } else if ("link_text".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A22 = r3;
            } else if ("ad_action".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1e = r3;
            } else if ("overlay_subtitle".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1f = r3;
            } else if ("headline".equals(A0i)) {
                r1.A0L = C29161Ov.parseFromJson(r8);
            } else if ("store_map_center".equals(A0i)) {
                r1.A0H = C488429s.parseFromJson(r8);
            } else if ("store_locations".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList18 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass40Q parseFromJson30 = C488429s.parseFromJson(r8);
                        if (parseFromJson30 != null) {
                            arrayList18.add(parseFromJson30);
                        }
                    }
                    r3 = arrayList18;
                }
                r1.A2N = r3;
            } else if ("store_map_zoom_level".equals(A0i)) {
                r1.A03 = r8.A0I();
            } else if ("boosted_status".equals(A0i)) {
                String A0r2 = r8.A0r();
                if (A0r2 != null && !A0r2.isEmpty()) {
                    if (A0r2.equalsIgnoreCase("not_boosted")) {
                        r0 = C34101e2.NOT_BOOSTED;
                    } else if (A0r2.equalsIgnoreCase("pending")) {
                        r0 = C34101e2.PENDING;
                    } else if (A0r2.equalsIgnoreCase("boosted")) {
                        r0 = C34101e2.BOOSTED;
                    } else if (A0r2.equalsIgnoreCase("not_approved")) {
                        r0 = C34101e2.NOT_APPROVED;
                    } else if (A0r2.equalsIgnoreCase("finished")) {
                        r0 = C34101e2.FINISHED;
                    } else if (A0r2.equalsIgnoreCase("unavailable")) {
                        r0 = C34101e2.UNAVAILABLE;
                    }
                    r1.A0P = r0;
                }
                r0 = C34101e2.UNKNOWN;
                r1.A0P = r0;
            } else if ("insights_tip".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1z = r3;
            } else if ("can_see_insights_as_brand".equals(A0i)) {
                r1.A3I = r8.A0O();
            } else if ("boost_unavailable_reason".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1h = r3;
            } else if ("boosted_post_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1i = r3;
            } else if ("boosted_by_sponsor".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1j = r3;
            } else if ("organic_post_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A28 = r3;
            } else if ("actor_fbid".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1d = r3;
            } else if ("reel_mentions".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList19 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson31 = C34141e9.parseFromJson(r8);
                        if (parseFromJson31 != null) {
                            arrayList19.add(parseFromJson31);
                        }
                    }
                    r3 = arrayList19;
                }
                r1.A2s = r3;
            } else if ("story_hashtags".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList20 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson32 = C34141e9.parseFromJson(r8);
                        if (parseFromJson32 != null) {
                            arrayList20.add(parseFromJson32);
                        }
                    }
                    r3 = arrayList20;
                }
                r1.A2p = r3;
            } else if ("story_locations".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList21 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson33 = C34141e9.parseFromJson(r8);
                        if (parseFromJson33 != null) {
                            arrayList21.add(parseFromJson33);
                        }
                    }
                    r3 = arrayList21;
                }
                r1.A2r = r3;
            } else if ("story_product_items".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList22 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson34 = C34141e9.parseFromJson(r8);
                        if (parseFromJson34 != null) {
                            arrayList22.add(parseFromJson34);
                        }
                    }
                    r3 = arrayList22;
                }
                r1.A2y = r3;
            } else if ("story_product_share".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList23 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson35 = C34141e9.parseFromJson(r8);
                        if (parseFromJson35 != null) {
                            arrayList23.add(parseFromJson35);
                        }
                    }
                    r3 = arrayList23;
                }
                r1.A2x = r3;
            } else if ("story_chats".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList24 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson36 = C34141e9.parseFromJson(r8);
                        if (parseFromJson36 != null) {
                            arrayList24.add(parseFromJson36);
                        }
                    }
                    r3 = arrayList24;
                }
                r1.A2h = r3;
            } else if ("story_hit_me_up_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList25 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson37 = C34141e9.parseFromJson(r8);
                        if (parseFromJson37 != null) {
                            arrayList25.add(parseFromJson37);
                        }
                    }
                    r3 = arrayList25;
                }
                r1.A2q = r3;
            } else if ("story_countdowns".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList26 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson38 = C34141e9.parseFromJson(r8);
                        if (parseFromJson38 != null) {
                            arrayList26.add(parseFromJson38);
                        }
                    }
                    r3 = arrayList26;
                }
                r1.A2i = r3;
            } else if ("story_discussions".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList27 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson39 = C34141e9.parseFromJson(r8);
                        if (parseFromJson39 != null) {
                            arrayList27.add(parseFromJson39);
                        }
                    }
                    r3 = arrayList27;
                }
                r1.A2j = r3;
            } else if ("story_fundraisers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList28 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson40 = C34141e9.parseFromJson(r8);
                        if (parseFromJson40 != null) {
                            arrayList28.add(parseFromJson40);
                        }
                    }
                    r3 = arrayList28;
                }
                r1.A2n = r3;
            } else if ("story_smb_support_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList29 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson41 = C34141e9.parseFromJson(r8);
                        if (parseFromJson41 != null) {
                            arrayList29.add(parseFromJson41);
                        }
                    }
                    r3 = arrayList29;
                }
                r1.A35 = r3;
            } else if ("story_polls".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList30 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson42 = C34141e9.parseFromJson(r8);
                        if (parseFromJson42 != null) {
                            arrayList30.add(parseFromJson42);
                        }
                    }
                    r3 = arrayList30;
                }
                r1.A2w = r3;
            } else if ("source_type".equals(A0i)) {
                r1.A0B = r8.A0I();
            } else if ("story_questions".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList31 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson43 = C34141e9.parseFromJson(r8);
                        if (parseFromJson43 != null) {
                            arrayList31.add(parseFromJson43);
                        }
                    }
                    r3 = arrayList31;
                }
                r1.A30 = r3;
            } else if ("bloks_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList32 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson44 = C34141e9.parseFromJson(r8);
                        if (parseFromJson44 != null) {
                            arrayList32.add(parseFromJson44);
                        }
                    }
                    r3 = arrayList32;
                }
                r1.A2T = r3;
            } else if ("story_bloks_tappables".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList33 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson45 = C34141e9.parseFromJson(r8);
                        if (parseFromJson45 != null) {
                            arrayList33.add(parseFromJson45);
                        }
                    }
                    r3 = arrayList33;
                }
                r1.A2U = r3;
            } else if ("story_quizs".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList34 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C34151eA parseFromJson46 = C34141e9.parseFromJson(r8);
                        if (parseFromJson46 != null) {
                            arrayList34.add(parseFromJson46);
                        }
                    }
                    r3 = arrayList34;
                }
                r1.A32 = r3;
            } else if ("story_sliders".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList35 = new ArrayList();
                    do {
                        r3 = arrayList35;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson20 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson20 == null);
                    arrayList35.add(parseFromJson20);
                }
                r1.A34 = r3;
            } else if ("story_joinable_events".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList36 = new ArrayList();
                    do {
                        r3 = arrayList36;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson19 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson19 == null);
                    arrayList36.add(parseFromJson19);
                }
                r1.A2l = r3;
            } else if ("story_music_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList37 = new ArrayList();
                    do {
                        r3 = arrayList37;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson18 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson18 == null);
                    arrayList37.add(parseFromJson18);
                }
                r1.A2u = r3;
            } else if ("story_music_lyric_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList38 = new ArrayList();
                    do {
                        r3 = arrayList38;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson17 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson17 == null);
                    arrayList38.add(parseFromJson17);
                }
                r1.A2t = r3;
            } else if ("story_group_polls".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList39 = new ArrayList();
                    do {
                        r3 = arrayList39;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson16 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson16 == null);
                    arrayList39.add(parseFromJson16);
                }
                r1.A2o = r3;
            } else if ("story_sound_on".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList40 = new ArrayList();
                    do {
                        r3 = arrayList40;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson15 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson15 == null);
                    arrayList40.add(parseFromJson15);
                }
                r1.A3C = r3;
            } else if ("story_feed_media".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList41 = new ArrayList();
                    do {
                        r3 = arrayList41;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson14 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson14 == null);
                    arrayList41.add(parseFromJson14);
                }
                r1.A3A = r3;
            } else if ("story_friend_lists".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList42 = new ArrayList();
                    do {
                        r3 = arrayList42;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson13 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson13 == null);
                    arrayList42.add(parseFromJson13);
                }
                r1.A3B = r3;
            } else if ("story_election_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList43 = new ArrayList();
                    do {
                        r3 = arrayList43;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson12 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson12 == null);
                    arrayList43.add(parseFromJson12);
                }
                r1.A2k = r3;
            } else if ("story_anti_bully_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList44 = new ArrayList();
                    do {
                        r3 = arrayList44;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson11 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson11 == null);
                    arrayList44.add(parseFromJson11);
                }
                r1.A2e = r3;
            } else if ("story_anti_bully_global_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList45 = new ArrayList();
                    do {
                        r3 = arrayList45;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson10 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson10 == null);
                    arrayList45.add(parseFromJson10);
                }
                r1.A2f = r3;
            } else if ("story_voter_registration_stickers".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList46 = new ArrayList();
                    do {
                        r3 = arrayList46;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson9 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson9 == null);
                    arrayList46.add(parseFromJson9);
                }
                r1.A37 = r3;
            } else if ("story_guides".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList47 = new ArrayList();
                    do {
                        r3 = arrayList47;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson8 = C34141e9.parseFromJson(r8);
                        }
                    } while (parseFromJson8 == null);
                    arrayList47.add(parseFromJson8);
                }
                r1.A2Z = r3;
            } else if ("story_cta".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList48 = new ArrayList();
                    do {
                        r3 = arrayList48;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson7 = C43521uY.parseFromJson(r8);
                        }
                    } while (parseFromJson7 == null);
                    arrayList48.add(parseFromJson7);
                }
                r1.A2g = r3;
            } else if ("story_poll_voter_infos".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList49 = new ArrayList();
                    do {
                        r3 = arrayList49;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson6 = AnonymousClass20V.parseFromJson(r8);
                        }
                    } while (parseFromJson6 == null);
                    arrayList49.add(parseFromJson6);
                }
                r1.A2v = r3;
            } else if ("story_question_responder_infos".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList50 = new ArrayList();
                    do {
                        r3 = arrayList50;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson5 = AnonymousClass23N.parseFromJson(r8);
                        }
                    } while (parseFromJson5 == null);
                    arrayList50.add(parseFromJson5);
                }
                r1.A2z = r3;
            } else if ("story_quiz_participant_infos".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList51 = new ArrayList();
                    do {
                        r3 = arrayList51;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson4 = C488329r.parseFromJson(r8);
                        }
                    } while (parseFromJson4 == null);
                    arrayList51.add(parseFromJson4);
                }
                r1.A31 = r3;
            } else if ("story_slider_voter_infos".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList52 = new ArrayList();
                    do {
                        r3 = arrayList52;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson3 = C480126h.parseFromJson(r8);
                        }
                    } while (parseFromJson3 == null);
                    arrayList52.add(parseFromJson3);
                }
                r1.A33 = r3;
            } else if ("story_fundraiser_donation_infos".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList53 = new ArrayList();
                    do {
                        r3 = arrayList53;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson2 = C488229q.parseFromJson(r8);
                        }
                    } while (parseFromJson2 == null);
                    arrayList53.add(parseFromJson2);
                }
                r1.A2m = r3;
            } else if ("donations_prompt_info".equals(A0i)) {
                r1.A11 = C488129p.parseFromJson(r8);
            } else if ("story_chat_request_infos".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList54 = new ArrayList();
                    do {
                        r3 = arrayList54;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            parseFromJson = C488029o.parseFromJson(r8);
                        }
                    } while (parseFromJson == null);
                    arrayList54.add(parseFromJson);
                }
                r1.A2b = r3;
            } else if ("story_is_saved_to_archive".equals(A0i)) {
                r1.A1E = Boolean.valueOf(r8.A0O());
            } else if ("rights_manager_flag_info".equals(A0i)) {
                r1.A0i = C487929n.parseFromJson(r8);
            } else if ("story_original_sound_info".equals(A0i)) {
                r1.A10 = C34541eu.parseFromJson(r8);
            } else if ("xpost_deny_reason".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1u = r3;
            } else if ("has_reshares".equals(A0i)) {
                r1.A3M = r8.A0O();
            } else if ("is_pride_media".equals(A0i)) {
                r1.A1D = Boolean.valueOf(r8.A0O());
            } else if ("has_shared_to_fb".equals(A0i)) {
                r1.A0l = (C34201eF) C34201eF.A01.get(r8.A0I(), C34201eF.NOT_SHARED);
            } else if ("has_shared_to_fb_dating".equals(A0i)) {
                r1.A0k = (C34211eH) C34211eH.A01.get(r8.A0I(), C34211eH.NOT_SHARED);
            } else if ("show_one_tap_fb_share_tooltip".equals(A0i)) {
                r1.A1F = Boolean.valueOf(r8.A0O());
            } else if ("highlight_reel_ids".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        if (r8.A0g() == C13120hv.VALUE_NULL) {
                            A0t = null;
                        } else {
                            A0t = r8.A0t();
                        }
                        if (A0t != null) {
                            arrayList.add(A0t);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r1.A2a = arrayList;
            } else if ("archived_media_timestamp".equals(A0i)) {
                r1.A1X = Long.valueOf(r8.A0J());
            } else if (RealtimeProtocol.DIRECT_V2_MESSAGE_POLICY_VIOLATION_VISIBILITY_CHANGED.equals(A0i)) {
                r1.A0s = (C36811ie) C36811ie.A01.get(r8.A0r());
            } else if ("audience".equals(A0i)) {
                r1.A0q = (C37171jE) C37171jE.A01.get(r8.A0r());
            } else if ("is_aymf_media".equals(A0i)) {
                r1.A3W = r8.A0O();
            } else if ("is_ad4ad".equals(A0i)) {
                r1.A3N = r8.A0O();
            } else if ("follow_hashtag_info".equals(A0i)) {
                r1.A0m = C31261Xe.parseFromJson(r8);
            } else if ("inventory_source".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A21 = r3;
            } else if ("last_synced_timestamp_ms".equals(A0i)) {
                r1.A1Z = Long.valueOf(r8.A0J());
            } else if ("main_feed_carousel_starting_media_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A24 = r3;
            } else if ("collection_media".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList55 = new ArrayList();
                    do {
                        r3 = arrayList55;
                        if (r8.A0p() != C13120hv.END_ARRAY) {
                            A00 = AnonymousClass1NJ.A00(r8);
                        }
                    } while (A00 == null);
                    arrayList55.add(A00);
                }
                r1.A2X = r3;
            } else if ("collection_media_type".equals(A0i)) {
                r1.A0p = (C487829m) C487829m.A01.get(Integer.valueOf(r8.A0I()));
            } else if ("collection_media_role".equals(A0i)) {
                r1.A0o = (C487729l) C487729l.A01.get(Integer.valueOf(r8.A0I()));
            } else if ("collection_parent_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1m = r3;
            } else if ("is_eof".equals(A0i)) {
                r1.A1C = Boolean.valueOf(r8.A0O());
            } else if ("is_seen".equals(A0i)) {
                r1.A3V = r8.A0O();
            } else if ("dynamic_item_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A1r = r3;
            } else if ("can_viewer_reshare".equals(A0i)) {
                r1.A3K = r8.A0O();
            } else if ("can_mention_share".equals(A0i)) {
                r1.A3J = r8.A0O();
            } else if ("nearly_complete_copyright_match".equals(A0i)) {
                r1.A3Y = r8.A0O();
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2F = r3;
            } else if ("video_duration".equals(A0i)) {
                r1.A02 = r8.A0H();
            } else if ("product_type".equals(A0i)) {
                r1.A0t = (AnonymousClass1YR) AnonymousClass1YR.A01.get(r8.A0r());
            } else if ("thumbnails".equals(A0i)) {
                r1.A0b = AnonymousClass1YX.parseFromJson(r8);
            } else if ("feed_survey_integration_id".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2E = r3;
            } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0i)) {
                r1.A0J = C487629k.parseFromJson(r8);
            } else if ("carousel_media_count".equals(A0i)) {
                r1.A04 = r8.A0I();
            } else if ("story_ad_headline".equals(A0i)) {
                r1.A0x = C487529j.parseFromJson(r8);
            } else if ("has_new_likes".equals(A0i)) {
                r1.A1A = Boolean.valueOf(r8.A0O());
            } else if ("media_urls".equals(A0i)) {
                r1.A0c = C487429i.parseFromJson(r8);
            } else if ("igtv_series_info".equals(A0i)) {
                r1.A0V = C46111z9.parseFromJson(r8);
            } else if ("position_info".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2A = r3;
            } else if ("num_video_reactions".equals(A0i)) {
                r1.A07 = r8.A0I();
            } else if ("video_reactions".equals(A0i)) {
                r1.A0O = C487329h.parseFromJson(r8);
            } else if ("video_reactions_prompt".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                r1.A2K = r3;
            } else if ("igtv_ads_info".equals(A0i)) {
                r1.A0U = C487229g.parseFromJson(r8);
            } else if ("should_request_ads".equals(A0i)) {
                r1.A3a = r8.A0O();
            } else if ("landscape_story_ads_auto_cropping".equals(A0i)) {
                r1.A0w = C487129f.parseFromJson(r8);
            } else if ("auto_generated_card_type".equals(A0i)) {
                String A0r3 = r8.A0r();
                AnonymousClass29e r2 = AnonymousClass29e.ORIGINAL;
                if (!r2.A00.equals(A0r3)) {
                    r2 = AnonymousClass29e.CAPTION;
                    if (!r2.A00.equals(A0r3)) {
                        throw new UnsupportedOperationException("Unsupported auto-generated card type");
                    }
                }
                r1.A0u = r2;
            } else if ("showreel_native_animation".equals(A0i)) {
                r1.A0y = C487029d.parseFromJson(r8);
            } else if ("media_debug_info".equals(A0i)) {
                r1.A0G = C486929c.parseFromJson(r8);
            } else if ("clips_metadata".equals(A0i)) {
                r1.A0F = C31931aG.parseFromJson(r8);
            } else if ("is_post_live".equals(A0i)) {
                r1.A3T = r8.A0O();
            }
            r8.A0f();
        }
        return r1;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.0iZ] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1695 */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static void A01(C13460iZ r9, AnonymousClass1NJ r10) {
        String str;
        String str2;
        r9.A0T();
        String str3 = r10.A26;
        if (str3 != null) {
            r9.A0H("preview", str3);
        }
        if (r10.A0n != null) {
            r9.A0d("image_versions2");
            C28881Np.A00(r9, r10.A0n);
        }
        String str4 = r10.A1c;
        if (str4 != null) {
            r9.A0H("accessibility_caption", str4);
        }
        r9.A0F("original_width", r10.A09);
        r9.A0F("original_height", r10.A08);
        if (r10.A0g != null) {
            r9.A0d("media_cropping_info");
            AnonymousClass1YT r1 = r10.A0g;
            r9.A0T();
            if (r1.A00 != null) {
                r9.A0d("feed_preview_crop");
                C468020x.A00(r9, r1.A00);
            }
            if (r1.A01 != null) {
                r9.A0d("square_crop");
                C468020x.A00(r9, r1.A01);
            }
            r9.A0Q();
        }
        if (r10.A0M != null) {
            r9.A0d("creative_config");
            CreativeConfig creativeConfig = r10.A0M;
            r9.A0T();
            String str5 = creativeConfig.A03;
            if (str5 != null) {
                r9.A0H("capture_type", str5);
            }
            if (creativeConfig.A02 != null) {
                r9.A0d("effect_product");
                AnonymousClass2O8.A00(r9, creativeConfig.A02);
            }
            String str6 = creativeConfig.A04;
            if (str6 != null) {
                r9.A0H("face_effect_id", str6);
            }
            String str7 = creativeConfig.A05;
            if (str7 != null) {
                r9.A0H("persisted_effect_metadata_json", str7);
            }
            String str8 = creativeConfig.A06;
            if (str8 != null) {
                r9.A0H("failure_reason", str8);
            }
            if (creativeConfig.A01 != null) {
                r9.A0d("effect_preview");
                C43061th.A00(r9, creativeConfig.A01);
            }
            if (creativeConfig.A00 != null) {
                r9.A0d("attribution_user");
                C34311eU.A00(r9, creativeConfig.A00);
            }
            if (creativeConfig.A07 != null) {
                r9.A0d("effect_configs");
                r9.A0S();
                for (EffectConfig effectConfig : creativeConfig.A07) {
                    if (effectConfig != null) {
                        r9.A0T();
                        String str9 = effectConfig.A03;
                        if (str9 != null) {
                            r9.A0H("id", str9);
                        }
                        String str10 = effectConfig.A04;
                        if (str10 != null) {
                            r9.A0H("name", str10);
                        }
                        if (effectConfig.A00 != null) {
                            r9.A0d("attribution_user");
                            C34311eU.A00(r9, effectConfig.A00);
                        }
                        String str11 = effectConfig.A05;
                        if (str11 != null) {
                            r9.A0H("save_status", str11);
                        }
                        if (effectConfig.A02 != null) {
                            r9.A0d("thumbnail_image");
                            C43071tj.A00(r9, effectConfig.A02);
                        }
                        if (effectConfig.A01 != null) {
                            r9.A0d("effect_action_sheet");
                            C43081tl.A00(r9, effectConfig.A01);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        String str12 = r10.A1x;
        if (str12 != null) {
            r9.A0H("id", str12);
        }
        if (r10.A13 != null) {
            r9.A0d("user");
            AnonymousClass1O2.A03(r9, r10.A13);
        }
        MediaType mediaType = r10.A0r;
        if (mediaType != null) {
            r9.A0F("media_type", mediaType.A00);
        }
        r9.A0G("taken_at", r10.A0D);
        Long l = r10.A1Y;
        if (l != null) {
            r9.A0G("expiring_at", l.longValue());
        }
        r9.A0I("is_reel_media", r10.A3U);
        Boolean bool = r10.A19;
        if (bool != null) {
            r9.A0I("has_audio", bool.booleanValue());
        }
        Boolean bool2 = r10.A1B;
        if (bool2 != null) {
            r9.A0I("has_transcription", bool2.booleanValue());
        }
        if (r10.A0I != null) {
            r9.A0d("attribution");
            AnonymousClass26N r0 = r10.A0I;
            r9.A0T();
            String str13 = r0.A00;
            if (str13 != null) {
                r9.A0H("name", str13);
            }
            r9.A0Q();
        }
        if (r10.A3E != null) {
            r9.A0d("video_versions");
            r9.A0S();
            for (VideoUrlImpl videoUrlImpl : r10.A3E) {
                if (videoUrlImpl != null) {
                    C29841Rl.A00(r9, videoUrlImpl);
                }
            }
            r9.A0P();
        }
        if (r10.A2S != null) {
            r9.A0d("base_video_versions");
            r9.A0S();
            for (VideoUrlImpl videoUrlImpl2 : r10.A2S) {
                if (videoUrlImpl2 != null) {
                    C29841Rl.A00(r9, videoUrlImpl2);
                }
            }
            r9.A0P();
        }
        String str14 = r10.A2L;
        if (str14 != null) {
            r9.A0H("video_subtitles_uri", str14);
        }
        String str15 = r10.A2J;
        if (str15 != null) {
            r9.A0H("video_dash_manifest", str15);
        }
        Integer num = r10.A1P;
        if (num != null) {
            r9.A0F("is_dash_eligible", num.intValue());
        }
        String str16 = r10.A2I;
        if (str16 != null) {
            r9.A0H("video_codec", str16);
        }
        Integer num2 = r10.A1Q;
        if (num2 != null) {
            r9.A0F("like_count", num2.intValue());
        }
        Integer num3 = r10.A1L;
        if (num3 != null) {
            r9.A0F("bucketed_like_count", num3.intValue());
        }
        Integer num4 = r10.A1J;
        if (num4 != null) {
            r9.A0F("ads_bucketed_like_count", num4.intValue());
        }
        if (r10.A3D != null) {
            r9.A0d("top_likers");
            r9.A0S();
            for (String str17 : r10.A3D) {
                if (str17 != null) {
                    r9.A0g(str17);
                }
            }
            r9.A0P();
        }
        if (r10.A0W != null) {
            r9.A0d("liker_config");
            AnonymousClass1OU r3 = r10.A0W;
            r9.A0T();
            r9.A0I("is_daisy", r3.A02);
            Integer num5 = r3.A01;
            if (num5 != null) {
                r9.A0F("display_mode", AnonymousClass1Oa.A00(num5));
            }
            Integer num6 = r3.A00;
            if (num6 != null) {
                r9.A0F("ads_display_mode", AnonymousClass1OZ.A00(num6));
            }
            r9.A0Q();
        }
        r9.A0F("follower_count", r10.A06);
        Integer num7 = r10.A1R;
        if (num7 != null) {
            boolean z = false;
            if (num7 == Constants.ZERO) {
                z = true;
            }
            r9.A0I("has_liked", z);
        }
        Integer num8 = r10.A1U;
        if (num8 != null) {
            boolean z2 = false;
            if (num8 == Constants.ZERO) {
                z2 = true;
            }
            r9.A0I("has_viewer_saved", z2);
        }
        Integer num9 = r10.A1O;
        if (num9 != null) {
            if (1 - num9.intValue() != 0) {
                str2 = "never";
            } else {
                str2 = "impression_trigger";
            }
            r9.A0H("inline_composer_display_condition", str2);
        }
        Double d = r10.A1G;
        if (d != null) {
            r9.A0D("inline_composer_imp_trigger_time", d.doubleValue());
        }
        r9.A0I("can_viewer_save", r10.A3H);
        Boolean bool3 = r10.A15;
        if (bool3 != null) {
            r9.A0I("can_reshare", bool3.booleanValue());
        }
        Boolean bool4 = r10.A14;
        if (bool4 != null) {
            r9.A0I("can_reply", bool4.booleanValue());
        }
        String str18 = r10.A2G;
        if (str18 != null) {
            r9.A0H("try_challenge_id", str18);
        }
        String str19 = r10.A2H;
        if (str19 != null) {
            r9.A0H("try_challenge_name", str19);
        }
        if (r10.A0Q != null) {
            r9.A0d("create_mode_attribution");
            C46311zX r32 = r10.A0Q;
            r9.A0T();
            String str20 = r32.A03;
            if (str20 != null) {
                r9.A0H("type", str20);
            }
            String str21 = r32.A02;
            if (str21 != null) {
                r9.A0H("name", str21);
            }
            if (r32.A00 != null) {
                r9.A0d("thumbnail_url");
                C13270iF.A01(r9, r32.A00);
            }
            if (r32.A01 != null) {
                r9.A0d("templates_info");
                C172307Yb.A00(r9, r32.A01);
            }
            r9.A0Q();
        }
        if (r10.A38 != null) {
            r9.A0d("saved_collection_ids");
            r9.A0S();
            for (String str22 : r10.A38) {
                if (str22 != null) {
                    r9.A0g(str22);
                }
            }
            r9.A0P();
        }
        Integer num10 = r10.A1W;
        if (num10 != null) {
            r9.A0F("view_count", num10.intValue());
        }
        Integer num11 = r10.A1M;
        if (num11 != null) {
            r9.A0F("bucketed_view_count", num11.intValue());
        }
        Integer num12 = r10.A1S;
        if (num12 != null) {
            r9.A0F("play_count", num12.intValue());
        }
        if (r10.A0N != null) {
            r9.A0d("gating");
            C38081kh.A00(r9, r10.A0N);
        }
        if (r10.A0h != null) {
            r9.A0d("media_overlay_info");
            C49052An r33 = r10.A0h;
            r9.A0T();
            String str23 = r33.A03;
            if (str23 != null) {
                r9.A0H(DialogModule.KEY_TITLE, str23);
            }
            if (r33.A04 != null) {
                r9.A0d("buttons");
                r9.A0S();
                for (C49062Ao r7 : r33.A04) {
                    if (r7 != null) {
                        r9.A0T();
                        String str24 = r7.A03;
                        if (str24 != null) {
                            r9.A0H("action_url", str24);
                        }
                        String str25 = r7.A04;
                        if (str25 != null) {
                            r9.A0H("text", str25);
                        }
                        if (r7.A00 != null) {
                            r9.A0d("icon");
                            C176937h2 r6 = r7.A00;
                            r9.A0T();
                            if (r6.A00 != null) {
                                r9.A0F("icon_type", 0);
                            }
                            String str26 = r6.A01;
                            if (str26 != null) {
                                r9.A0H("name", str26);
                            }
                            r9.A0Q();
                        }
                        if (r7.A02 != null) {
                            r9.A0F("button_type", 0);
                        }
                        if (r7.A01 != null) {
                            r9.A0F("action", 0);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            String str27 = r33.A02;
            if (str27 != null) {
                r9.A0H("description", str27);
            }
            if (r33.A05 != null) {
                r9.A0d("icons");
                r9.A0S();
                for (String str28 : r33.A05) {
                    if (str28 != null) {
                        r9.A0g(str28);
                    }
                }
                r9.A0P();
            }
            if (r33.A01 != null) {
                r9.A0H("overlay_type", "COVID_19_BOTTOM_BANNER");
            }
            if (r33.A00 != null) {
                r9.A0F("overlay_layout", 0);
            }
            r9.A0Q();
        }
        Integer num13 = r10.A1N;
        if (num13 != null) {
            r9.A0F("comment_count", num13.intValue());
        }
        if (r10.A0K != null) {
            r9.A0d("caption");
            C29161Ov.A00(r9, r10.A0K);
        }
        if (r10.A2V != null) {
            r9.A0d("caption_list");
            r9.A0S();
            for (String str29 : r10.A2V) {
                if (str29 != null) {
                    r9.A0g(str29);
                }
            }
            r9.A0P();
        }
        r9.A0I("caption_is_edited", r10.A3O);
        if (r10.A2P != null) {
            r9.A0d("comments");
            r9.A0S();
            for (instagramComment r02 : r10.A2P) {
                if (r02 != null) {
                    C29161Ov.A00(r9, r02);
                }
            }
            r9.A0P();
        }
        if (r10.A2c != null) {
            r9.A0d("preview_comments");
            r9.A0S();
            for (instagramComment r03 : r10.A2c) {
                if (r03 != null) {
                    C29161Ov.A00(r9, r03);
                }
            }
            r9.A0P();
        }
        if (r10.A2Y != null) {
            r9.A0d("facepile_top_likers");
            r9.A0S();
            for (AnonymousClass1WI r34 : r10.A2Y) {
                if (r34 != null) {
                    r9.A0T();
                    String str30 = r34.A01;
                    if (str30 != null) {
                        r9.A0H("id", str30);
                    }
                    if (r34.A00 != null) {
                        r9.A0d("profile_pic_url");
                        C13270iF.A01(r9, r34.A00);
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        r9.A0I("comments_disabled", r10.A3L);
        Boolean bool5 = r10.A16;
        if (bool5 != null) {
            r9.A0I("commenting_disabled_for_viewer", bool5.booleanValue());
        }
        Boolean bool6 = r10.A17;
        if (bool6 != null) {
            r9.A0I("direct_reply_to_author_enabled", bool6.booleanValue());
        }
        Boolean bool7 = r10.A18;
        if (bool7 != null) {
            r9.A0I("is_external_share_disabled", bool7.booleanValue());
        }
        if (r10.A0z != null) {
            r9.A0d("location");
            AnonymousClass27Y.A00(r9, r10.A0z);
        }
        Double d2 = r10.A1H;
        if (d2 != null) {
            r9.A0D("lat", d2.doubleValue());
        }
        Double d3 = r10.A1I;
        if (d3 != null) {
            r9.A0D("lng", d3.doubleValue());
        }
        if (r10.A0Y != null) {
            r9.A0d("usertags");
            AnonymousClass1XR r12 = r10.A0Y;
            r9.A0T();
            if (r12.A00 != null) {
                r9.A0d("in");
                r9.A0S();
                Iterator it = r12.A00.iterator();
                while (it.hasNext()) {
                    PeopleTag peopleTag = (PeopleTag) it.next();
                    if (peopleTag != null) {
                        r9.A0T();
                        if (peopleTag.A00 != null) {
                            r9.A0d("user");
                            PeopleTag.UserInfo userInfo = peopleTag.A00;
                            r9.A0T();
                            String str31 = userInfo.A03;
                            if (str31 != null) {
                                r9.A0H("username", str31);
                            }
                            String str32 = userInfo.A02;
                            if (str32 != null) {
                                r9.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str32);
                            }
                            String str33 = userInfo.A01;
                            if (str33 != null) {
                                r9.A0H("full_name", str33);
                            }
                            if (userInfo.A00 != null) {
                                r9.A0d("profile_pic_url");
                                C13270iF.A01(r9, userInfo.A00);
                            }
                            r9.A0Q();
                        }
                        PointF pointF = peopleTag.A00;
                        if (pointF != null) {
                            AnonymousClass1XZ.A01(r9, "position", pointF);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        r9.A0I("photo_of_you", r10.A3Z);
        Integer num14 = r10.A1V;
        if (num14 != null) {
            if (num14 != null) {
                str = "direct_reply_to_author";
            } else {
                str = null;
            }
            r9.A0H("post_share_source", str);
        }
        if (r10.A0Z != null) {
            r9.A0d("product_tags");
            C472822y r13 = r10.A0Z;
            r9.A0T();
            if (r13.A00 != null) {
                r9.A0d("in");
                r9.A0S();
                Iterator it2 = r13.A00.iterator();
                while (it2.hasNext()) {
                    ProductTag productTag = (ProductTag) it2.next();
                    if (productTag != null) {
                        r9.A0T();
                        if (productTag.A01 != null) {
                            r9.A0d("product");
                            C44861wt.A00(r9, productTag.A01);
                        }
                        r9.A0F("hide_tag", productTag.A00);
                        PointF pointF2 = productTag.A00;
                        if (pointF2 != null) {
                            AnonymousClass1XZ.A01(r9, "position", pointF2);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        if (r10.A0X != null) {
            r9.A0d("media_notice");
            C57922f1 r35 = r10.A0X;
            r9.A0T();
            C120495Ev r04 = r35.A00;
            if (r04 != null) {
                r9.A0H("notice_icon", r04.A00);
            }
            String str34 = r35.A02;
            if (str34 != null) {
                r9.A0H("notice_text", str34);
            }
            String str35 = r35.A01;
            if (str35 != null) {
                r9.A0H("notice_sub_text", str35);
            }
            String str36 = r35.A03;
            if (str36 != null) {
                r9.A0H("notice_url", str36);
            }
            r9.A0Q();
        }
        r9.A0F("total_viewer_count", r10.A0A);
        r9.A0I("is_internal_only", r10.A3R);
        if (r10.A36 != null) {
            r9.A0d("viewers");
            r9.A0S();
            for (C13300iJ r05 : r10.A36) {
                if (r05 != null) {
                    AnonymousClass1O2.A03(r9, r05);
                }
            }
            r9.A0P();
        }
        if (r10.A2d != null) {
            r9.A0d(RealtimeProtocol.DIRECT_V2_ITEM_REACTIONS);
            r9.A0S();
            for (AnonymousClass5LD r36 : r10.A2d) {
                if (r36 != null) {
                    r9.A0T();
                    String str37 = r36.A01;
                    if (str37 != null) {
                        r9.A0H("name", str37);
                    }
                    String str38 = r36.A02;
                    if (str38 != null) {
                        r9.A0H("value", str38);
                    }
                    Integer num15 = r36.A00;
                    if (num15 != null) {
                        r9.A0F("count", num15.intValue());
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        r9.A0F("reaction_count", r10.A0C);
        if (r10.A12 != null) {
            r9.A0d("blacklist_sample");
            C1188558d r37 = r10.A12;
            r9.A0T();
            if (r37.A01 != null) {
                r9.A0d("users");
                r9.A0S();
                for (C13300iJ r06 : r37.A01) {
                    if (r06 != null) {
                        AnonymousClass1O2.A03(r9, r06);
                    }
                }
                r9.A0P();
            }
            r9.A0F("count", r37.A00);
            r9.A0Q();
        }
        String str39 = r10.A2C;
        if (str39 != null) {
            r9.A0H("viewer_cursor", str39);
        }
        if (r10.A2O != null) {
            r9.A0d("multi_author_reel_names");
            r9.A0S();
            for (String str40 : r10.A2O) {
                if (str40 != null) {
                    r9.A0g(str40);
                }
            }
            r9.A0P();
        }
        r9.A0I("supports_reel_reactions", r10.A3d);
        String str41 = r10.A1o;
        if (str41 != null) {
            r9.A0H("direct_text", str41);
        }
        if (r10.A0j != null) {
            r9.A0d("story_unlockable_sticker_info");
            StoryUnlockableStickerAttribution storyUnlockableStickerAttribution = r10.A0j;
            r9.A0T();
            String str42 = storyUnlockableStickerAttribution.A01;
            if (str42 != null) {
                r9.A0H(DialogModule.KEY_TITLE, str42);
            }
            String str43 = storyUnlockableStickerAttribution.A00;
            if (str43 != null) {
                r9.A0H("subtitle", str43);
            }
            if (storyUnlockableStickerAttribution.A02 != null) {
                r9.A0d("stickers");
                r9.A0S();
                for (StoryUnlockableStickerAttribution.StoryUnlockableSticker storyUnlockableSticker : storyUnlockableStickerAttribution.A02) {
                    if (storyUnlockableSticker != null) {
                        r9.A0T();
                        String str44 = storyUnlockableSticker.A03;
                        if (str44 != null) {
                            r9.A0H("name", str44);
                        }
                        String str45 = storyUnlockableSticker.A02;
                        if (str45 != null) {
                            r9.A0H("id", str45);
                        }
                        if (storyUnlockableSticker.A01 != null) {
                            r9.A0d("thumbnail_image");
                            C43071tj.A00(r9, storyUnlockableSticker.A01);
                        }
                        AnonymousClass96O r07 = storyUnlockableSticker.A00;
                        if (r07 != null) {
                            r9.A0H("unlock_status", r07.A00);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        Long l2 = r10.A1b;
        if (l2 != null) {
            r9.A0G("playback_duration_secs", l2.longValue());
        }
        Long l3 = r10.A1a;
        if (l3 != null) {
            r9.A0G("url_expire_at_secs", l3.longValue());
        }
        if (r10.A0a != null) {
            r9.A0d("reel_media_background");
            C59332hP r4 = r10.A0a;
            r9.A0T();
            if (r4.A01 != null) {
                r9.A0d("top");
                C59352hR r08 = r4.A01;
                r9.A0T();
                String str46 = r08.A00;
                if (str46 != null) {
                    r9.A0H("background_color", str46);
                }
                r9.A0Q();
            }
            if (r4.A00 != null) {
                r9.A0d("bottom");
                C59352hR r09 = r4.A00;
                r9.A0T();
                String str47 = r09.A00;
                if (str47 != null) {
                    r9.A0H("background_color", str47);
                }
                r9.A0Q();
            }
            r9.A0Q();
        }
        if (r10.A0f != null) {
            r9.A0d("video_chat_capture_info");
            DjP djP = r10.A0f;
            r9.A0T();
            r9.A0I("is_captured_in_video_chat", djP.A01);
            String str48 = djP.A00;
            if (str48 != null) {
                r9.A0H("video_chat_attribution_text", str48);
            }
            r9.A0Q();
        }
        if (r10.A2R != null) {
            r9.A0d("attachments");
            r9.A0S();
            for (C149496aQ r38 : r10.A2R) {
                if (r38 != null) {
                    r9.A0T();
                    String str49 = r38.A01;
                    if (str49 != null) {
                        r9.A0H("type", str49);
                    }
                    if (r38.A00 != null) {
                        r9.A0d("data");
                        C56982dN r39 = r38.A00;
                        r9.A0T();
                        if (r39.A00 != null) {
                            r9.A0d("simple_action");
                            C51852Mj r62 = r39.A00;
                            r9.A0T();
                            String str50 = r62.A04;
                            if (str50 != null) {
                                r9.A0H("id", str50);
                            }
                            String str51 = r62.A03;
                            if (str51 != null) {
                                r9.A0H("icon_url", str51);
                            }
                            String str52 = r62.A07;
                            if (str52 != null) {
                                r9.A0H("tracking_token", str52);
                            }
                            String str53 = r62.A00;
                            if (str53 != null) {
                                r9.A0H("action_type", str53);
                            }
                            String str54 = r62.A06;
                            if (str54 != null) {
                                r9.A0H(DialogModule.KEY_TITLE, str54);
                            }
                            String str55 = r62.A05;
                            if (str55 != null) {
                                r9.A0H(DialogModule.KEY_MESSAGE, str55);
                            }
                            String str56 = r62.A01;
                            if (str56 != null) {
                                r9.A0H("button_text", str56);
                            }
                            String str57 = r62.A02;
                            if (str57 != null) {
                                r9.A0H("extra_data_token", str57);
                            }
                            r9.A0Q();
                        }
                        if (r39.A01 != null) {
                            r9.A0d("question_list");
                            C57042dT r5 = r39.A01;
                            r9.A0T();
                            String str58 = r5.A02;
                            if (str58 != null) {
                                r9.A0H("id", str58);
                            }
                            r9.A0I("enable_navigation", r5.A05);
                            r9.A0I("enable_indexing", r5.A04);
                            r9.A0I("has_submit", r5.A07);
                            r9.A0F("vertical_padding", r5.A00);
                            if (r5.A01 != null) {
                                r9.A0d("extra_question");
                                C153146gc.A00(r9, r5.A01);
                            }
                            if (r5.A03 != null) {
                                r9.A0d("questions");
                                r9.A0S();
                                for (C153166ge r010 : r5.A03) {
                                    if (r010 != null) {
                                        C153146gc.A00(r9, r010);
                                    }
                                }
                                r9.A0P();
                            }
                            r9.A0I("log_on_each_answer", r5.A06);
                            r9.A0Q();
                        }
                        r9.A0Q();
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        if (r10.A39 != null) {
            r9.A0d("sponsor_tags");
            r9.A0S();
            for (AnonymousClass24B r14 : r10.A39) {
                if (r14 != null) {
                    r9.A0T();
                    if (r14.A00 != null) {
                        r9.A0d("sponsor");
                        AnonymousClass1O2.A03(r9, r14.A00);
                    }
                    r9.A0I("permission", r14.A01);
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        r9.A0I("has_bc_violation", r10.A3X);
        if (r10.A0T != null) {
            r9.A0d("iab_autofill_optout_info");
            AnonymousClass1UX r310 = r10.A0T;
            r9.A0T();
            String str59 = r310.A00;
            if (str59 != null) {
                r9.A0H("domain", str59);
            }
            r9.A0I("is_iab_autofill_optout", r310.A01);
            r9.A0Q();
        }
        if (r10.A0d != null) {
            r9.A0d("injected");
            C30141Sr r63 = r10.A0d;
            r9.A0T();
            String str60 = r63.A07;
            if (str60 != null) {
                r9.A0H("label", str60);
            }
            String str61 = r63.A06;
            if (str61 != null) {
                r9.A0H("contextual_label_info", str61);
            }
            r9.A0I("show_page_name_in_headline", r63.A0H);
            r9.A0I("display_fb_page_name", r63.A0C);
            if (r63.A0A != null) {
                r9.A0d("hide_reasons_v2");
                r9.A0S();
                for (AnonymousClass1TC r42 : r63.A0A) {
                    if (r42 != null) {
                        r9.A0T();
                        String str62 = r42.A01;
                        if (str62 != null) {
                            r9.A0H("text", str62);
                        }
                        String str63 = r42.A00;
                        if (str63 != null) {
                            r9.A0H("reason", str63);
                        }
                        r9.A0Q();
                    }
                }
                r9.A0P();
            }
            r9.A0I("is_demo", r63.A0I);
            r9.A0I("is_holdout", r63.A0J);
            r9.A0I("display_viewability_eligible", r63.A0E);
            String str64 = r63.A08;
            if (str64 != null) {
                r9.A0H("tracking_token", str64);
            }
            r9.A0I("show_ad_choices", r63.A0G);
            String str65 = r63.A05;
            if (str65 != null) {
                r9.A0H("ad_title", str65);
            }
            if (r63.A09 != null) {
                r9.A0d("cookies");
                r9.A0S();
                for (String str66 : r63.A09) {
                    if (str66 != null) {
                        r9.A0g(str66);
                    }
                }
                r9.A0P();
            }
            r9.A0I("direct_share", r63.A0B);
            String str67 = r63.A04;
            if (str67 != null) {
                r9.A0H("ad_id", str67);
            }
            if (r63.A01 != null) {
                r9.A0d("political_context");
                C57262dr r011 = r63.A01;
                r9.A0T();
                String str68 = r011.A00;
                if (str68 != null) {
                    r9.A0H("byline_text", str68);
                }
                r9.A0Q();
            }
            if (r63.A03 != null) {
                r9.A0d("ad_disclaimer_info");
                C488629u.A00(r9, r63.A03);
            }
            r9.A0I("is_autotranslated", r63.A0D);
            C30161St r012 = r63.A02;
            if (r012 != null) {
                r9.A0F("cta_style", r012.A00);
            }
            if (r63.A00 != null) {
                r9.A0d("ctmessaging_ads_info");
                ClickToMessagingAdsInfo clickToMessagingAdsInfo = r63.A00;
                r9.A0T();
                r9.A0G("pageID", clickToMessagingAdsInfo.A00);
                r9.A0I("isEligibleForOnFeedMessages", clickToMessagingAdsInfo.A02);
                if (clickToMessagingAdsInfo.A01 != null) {
                    r9.A0d("model");
                    ClickToMessagingAdsInfo.OnFeedMessages onFeedMessages = clickToMessagingAdsInfo.A01;
                    r9.A0T();
                    r9.A0F("destinationType", onFeedMessages.A00);
                    String str69 = onFeedMessages.A02;
                    if (str69 != null) {
                        r9.A0H("greetingText", str69);
                    }
                    String str70 = onFeedMessages.A03;
                    if (str70 != null) {
                        r9.A0H("headerText", str70);
                    }
                    String str71 = onFeedMessages.A01;
                    if (str71 != null) {
                        r9.A0H("genericUrl", str71);
                    }
                    if (onFeedMessages.A04 != null) {
                        r9.A0d("icebreakerMessages");
                        r9.A0S();
                        for (ClickToMessagingAdsInfo.IcebreakerMessage icebreakerMessage : onFeedMessages.A04) {
                            if (icebreakerMessage != null) {
                                r9.A0T();
                                String str72 = icebreakerMessage.A02;
                                if (str72 != null) {
                                    r9.A0H("messageKey", str72);
                                }
                                String str73 = icebreakerMessage.A01;
                                if (str73 != null) {
                                    r9.A0H(DialogModule.KEY_MESSAGE, str73);
                                }
                                String str74 = icebreakerMessage.A00;
                                if (str74 != null) {
                                    r9.A0H("actionUrl", str74);
                                }
                                r9.A0Q();
                            }
                        }
                        r9.A0P();
                    }
                    r9.A0Q();
                }
                r9.A0Q();
            }
            r9.A0I("should_show_secondary_cta_on_profile", r63.A0F);
            r9.A0Q();
        }
        if (r10.A0v != null) {
            r9.A0d("ad_disclaimer_info");
            C488629u.A00(r9, r10.A0v);
        }
        String str75 = r10.A20;
        if (str75 != null) {
            r9.A0H("interaction_timestamp", str75);
        }
        if (r10.A0e != null) {
            r9.A0d("story_app_attribution");
            AnonymousClass29V r311 = r10.A0e;
            r9.A0T();
            String str76 = r311.A03;
            if (str76 != null) {
                r9.A0H("id", str76);
            }
            String str77 = r311.A04;
            if (str77 != null) {
                r9.A0H("name", str77);
            }
            String str78 = r311.A05;
            if (str78 != null) {
                r9.A0H("link", str78);
            }
            String str79 = r311.A02;
            if (str79 != null) {
                r9.A0H("content_url", str79);
            }
            String str80 = r311.A00;
            if (str80 != null) {
                r9.A0H("app_action_text", str80);
            }
            String str81 = r311.A01;
            if (str81 != null) {
                r9.A0H("app_icon_url", str81);
            }
            r9.A0Q();
        }
        r9.A0I("show_disclaimer", r10.A3b);
        String str82 = r10.A1p;
        if (str82 != null) {
            r9.A0H("disclaimer", str82);
        }
        if (r10.A2Q != null) {
            r9.A0d("android_links");
            r9.A0S();
            for (AnonymousClass1UP r013 : r10.A2Q) {
                if (r013 != null) {
                    AnonymousClass2IO.A00(r9, r013);
                }
            }
            r9.A0P();
        }
        String str83 = r10.A1w;
        if (str83 != null) {
            r9.A0H("click_id", str83);
        }
        if (r10.A2M != null) {
            r9.A0d("ad_metadata");
            r9.A0S();
            for (AnonymousClass1TO r312 : r10.A2M) {
                if (r312 != null) {
                    r9.A0T();
                    String str84 = r312.A01;
                    if (str84 != null) {
                        r9.A0H("value", str84);
                    }
                    AnonymousClass1TS r014 = r312.A00;
                    if (r014 != null) {
                        r9.A0F("type", r014.A00);
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        String str85 = r10.A1q;
        if (str85 != null) {
            r9.A0H("dominant_color", str85);
        }
        r9.A0I("show_fullname_in_header", r10.A3c);
        String str86 = r10.A1v;
        if (str86 != null) {
            r9.A0H("fb_page_url", str86);
        }
        String str87 = r10.A29;
        if (str87 != null) {
            r9.A0H("organic_tracking_token", str87);
        }
        String str88 = r10.A1g;
        if (str88 != null) {
            r9.A0H("algorithm", str88);
        }
        String str89 = r10.A1s;
        if (str89 != null) {
            r9.A0H("explore_context", str89);
        }
        String str90 = r10.A1t;
        if (str90 != null) {
            r9.A0H("explore_source_token", str90);
        }
        if (r10.A0S != null) {
            r9.A0d("explore");
            C39451mw r313 = r10.A0S;
            r9.A0T();
            String str91 = r313.A00;
            if (str91 != null) {
                r9.A0H("explanation", str91);
            }
            String str92 = r313.A01;
            if (str92 != null) {
                r9.A0H("explore_internal_debug_log", str92);
            }
            String str93 = r313.A02;
            if (str93 != null) {
                r9.A0H("explore_token", str93);
            }
            r9.A0Q();
        }
        String str94 = r10.A25;
        if (str94 != null) {
            r9.A0H("mezql_token", str94);
        }
        String str95 = r10.A1n;
        if (str95 != null) {
            r9.A0H("connection_id", str95);
        }
        if (r10.A0R != null) {
            r9.A0d("event_badge");
            C30765DjN djN = r10.A0R;
            r9.A0T();
            String str96 = djN.A00;
            if (str96 != null) {
                r9.A0H("id", str96);
            }
            String str97 = djN.A01;
            if (str97 != null) {
                r9.A0H("text", str97);
            }
            r9.A0Q();
        }
        String str98 = r10.A1y;
        if (str98 != null) {
            r9.A0H("impression_token", str98);
        }
        String str99 = r10.A2B;
        if (str99 != null) {
            r9.A0H("rank_token", str99);
        }
        r9.A0I("is_panorama", r10.A3S);
        if (r10.A2W != null) {
            r9.A0d("carousel_media");
            r9.A0S();
            for (AnonymousClass1NJ r015 : r10.A2W) {
                if (r015 != null) {
                    A01(r9, r015);
                }
            }
            r9.A0P();
        }
        String str100 = r10.A1l;
        if (str100 != null) {
            r9.A0H("carousel_parent_id", str100);
        }
        String str101 = r10.A1k;
        if (str101 != null) {
            r9.A0H("carousel_share_child_media_id", str101);
        }
        String str102 = r10.A22;
        if (str102 != null) {
            r9.A0H("link_text", str102);
        }
        String str103 = r10.A1e;
        if (str103 != null) {
            r9.A0H("ad_action", str103);
        }
        String str104 = r10.A1f;
        if (str104 != null) {
            r9.A0H("overlay_subtitle", str104);
        }
        if (r10.A0L != null) {
            r9.A0d("headline");
            C29161Ov.A00(r9, r10.A0L);
        }
        if (r10.A0H != null) {
            r9.A0d("store_map_center");
            C488429s.A00(r9, r10.A0H);
        }
        if (r10.A2N != null) {
            r9.A0d("store_locations");
            r9.A0S();
            for (AnonymousClass40Q r016 : r10.A2N) {
                if (r016 != null) {
                    C488429s.A00(r9, r016);
                }
            }
            r9.A0P();
        }
        r9.A0F("store_map_zoom_level", r10.A03);
        C34101e2 r017 = r10.A0P;
        if (r017 != null) {
            r9.A0H("boosted_status", r017.toString());
        }
        String str105 = r10.A1z;
        if (str105 != null) {
            r9.A0H("insights_tip", str105);
        }
        r9.A0I("can_see_insights_as_brand", r10.A3I);
        String str106 = r10.A1h;
        if (str106 != null) {
            r9.A0H("boost_unavailable_reason", str106);
        }
        String str107 = r10.A1i;
        if (str107 != null) {
            r9.A0H("boosted_post_id", str107);
        }
        String str108 = r10.A1j;
        if (str108 != null) {
            r9.A0H("boosted_by_sponsor", str108);
        }
        String str109 = r10.A28;
        if (str109 != null) {
            r9.A0H("organic_post_id", str109);
        }
        String str110 = r10.A1d;
        if (str110 != null) {
            r9.A0H("actor_fbid", str110);
        }
        if (r10.A2s != null) {
            r9.A0d("reel_mentions");
            r9.A0S();
            for (C34151eA r018 : r10.A2s) {
                if (r018 != null) {
                    C34141e9.A00(r9, r018);
                }
            }
            r9.A0P();
        }
        if (r10.A2p != null) {
            r9.A0d("story_hashtags");
            r9.A0S();
            for (C34151eA r019 : r10.A2p) {
                if (r019 != null) {
                    C34141e9.A00(r9, r019);
                }
            }
            r9.A0P();
        }
        if (r10.A2r != null) {
            r9.A0d("story_locations");
            r9.A0S();
            for (C34151eA r020 : r10.A2r) {
                if (r020 != null) {
                    C34141e9.A00(r9, r020);
                }
            }
            r9.A0P();
        }
        if (r10.A2y != null) {
            r9.A0d("story_product_items");
            r9.A0S();
            for (C34151eA r021 : r10.A2y) {
                if (r021 != null) {
                    C34141e9.A00(r9, r021);
                }
            }
            r9.A0P();
        }
        if (r10.A2x != null) {
            r9.A0d("story_product_share");
            r9.A0S();
            for (C34151eA r022 : r10.A2x) {
                if (r022 != null) {
                    C34141e9.A00(r9, r022);
                }
            }
            r9.A0P();
        }
        if (r10.A2h != null) {
            r9.A0d("story_chats");
            r9.A0S();
            for (C34151eA r023 : r10.A2h) {
                if (r023 != null) {
                    C34141e9.A00(r9, r023);
                }
            }
            r9.A0P();
        }
        if (r10.A2q != null) {
            r9.A0d("story_hit_me_up_stickers");
            r9.A0S();
            for (C34151eA r024 : r10.A2q) {
                if (r024 != null) {
                    C34141e9.A00(r9, r024);
                }
            }
            r9.A0P();
        }
        if (r10.A2i != null) {
            r9.A0d("story_countdowns");
            r9.A0S();
            for (C34151eA r025 : r10.A2i) {
                if (r025 != null) {
                    C34141e9.A00(r9, r025);
                }
            }
            r9.A0P();
        }
        if (r10.A2j != null) {
            r9.A0d("story_discussions");
            r9.A0S();
            for (C34151eA r026 : r10.A2j) {
                if (r026 != null) {
                    C34141e9.A00(r9, r026);
                }
            }
            r9.A0P();
        }
        if (r10.A2n != null) {
            r9.A0d("story_fundraisers");
            r9.A0S();
            for (C34151eA r027 : r10.A2n) {
                if (r027 != null) {
                    C34141e9.A00(r9, r027);
                }
            }
            r9.A0P();
        }
        if (r10.A35 != null) {
            r9.A0d("story_smb_support_stickers");
            r9.A0S();
            for (C34151eA r028 : r10.A35) {
                if (r028 != null) {
                    C34141e9.A00(r9, r028);
                }
            }
            r9.A0P();
        }
        if (r10.A2w != null) {
            r9.A0d("story_polls");
            r9.A0S();
            for (C34151eA r029 : r10.A2w) {
                if (r029 != null) {
                    C34141e9.A00(r9, r029);
                }
            }
            r9.A0P();
        }
        r9.A0F("source_type", r10.A0B);
        if (r10.A30 != null) {
            r9.A0d("story_questions");
            r9.A0S();
            for (C34151eA r030 : r10.A30) {
                if (r030 != null) {
                    C34141e9.A00(r9, r030);
                }
            }
            r9.A0P();
        }
        if (r10.A2T != null) {
            r9.A0d("bloks_stickers");
            r9.A0S();
            for (C34151eA r031 : r10.A2T) {
                if (r031 != null) {
                    C34141e9.A00(r9, r031);
                }
            }
            r9.A0P();
        }
        if (r10.A2U != null) {
            r9.A0d("story_bloks_tappables");
            r9.A0S();
            for (C34151eA r032 : r10.A2U) {
                if (r032 != null) {
                    C34141e9.A00(r9, r032);
                }
            }
            r9.A0P();
        }
        if (r10.A32 != null) {
            r9.A0d("story_quizs");
            r9.A0S();
            for (C34151eA r033 : r10.A32) {
                if (r033 != null) {
                    C34141e9.A00(r9, r033);
                }
            }
            r9.A0P();
        }
        if (r10.A34 != null) {
            r9.A0d("story_sliders");
            r9.A0S();
            for (C34151eA r034 : r10.A34) {
                if (r034 != null) {
                    C34141e9.A00(r9, r034);
                }
            }
            r9.A0P();
        }
        if (r10.A2l != null) {
            r9.A0d("story_joinable_events");
            r9.A0S();
            for (C34151eA r035 : r10.A2l) {
                if (r035 != null) {
                    C34141e9.A00(r9, r035);
                }
            }
            r9.A0P();
        }
        if (r10.A2u != null) {
            r9.A0d("story_music_stickers");
            r9.A0S();
            for (C34151eA r036 : r10.A2u) {
                if (r036 != null) {
                    C34141e9.A00(r9, r036);
                }
            }
            r9.A0P();
        }
        if (r10.A2t != null) {
            r9.A0d("story_music_lyric_stickers");
            r9.A0S();
            for (C34151eA r037 : r10.A2t) {
                if (r037 != null) {
                    C34141e9.A00(r9, r037);
                }
            }
            r9.A0P();
        }
        if (r10.A2o != null) {
            r9.A0d("story_group_polls");
            r9.A0S();
            for (C34151eA r038 : r10.A2o) {
                if (r038 != null) {
                    C34141e9.A00(r9, r038);
                }
            }
            r9.A0P();
        }
        if (r10.A3C != null) {
            r9.A0d("story_sound_on");
            r9.A0S();
            for (C34151eA r039 : r10.A3C) {
                if (r039 != null) {
                    C34141e9.A00(r9, r039);
                }
            }
            r9.A0P();
        }
        if (r10.A3A != null) {
            r9.A0d("story_feed_media");
            r9.A0S();
            for (C34151eA r040 : r10.A3A) {
                if (r040 != null) {
                    C34141e9.A00(r9, r040);
                }
            }
            r9.A0P();
        }
        if (r10.A3B != null) {
            r9.A0d("story_friend_lists");
            r9.A0S();
            for (C34151eA r041 : r10.A3B) {
                if (r041 != null) {
                    C34141e9.A00(r9, r041);
                }
            }
            r9.A0P();
        }
        if (r10.A2k != null) {
            r9.A0d("story_election_stickers");
            r9.A0S();
            for (C34151eA r042 : r10.A2k) {
                if (r042 != null) {
                    C34141e9.A00(r9, r042);
                }
            }
            r9.A0P();
        }
        if (r10.A2e != null) {
            r9.A0d("story_anti_bully_stickers");
            r9.A0S();
            for (C34151eA r043 : r10.A2e) {
                if (r043 != null) {
                    C34141e9.A00(r9, r043);
                }
            }
            r9.A0P();
        }
        if (r10.A2f != null) {
            r9.A0d("story_anti_bully_global_stickers");
            r9.A0S();
            for (C34151eA r044 : r10.A2f) {
                if (r044 != null) {
                    C34141e9.A00(r9, r044);
                }
            }
            r9.A0P();
        }
        if (r10.A37 != null) {
            r9.A0d("story_voter_registration_stickers");
            r9.A0S();
            for (C34151eA r045 : r10.A37) {
                if (r045 != null) {
                    C34141e9.A00(r9, r045);
                }
            }
            r9.A0P();
        }
        if (r10.A2Z != null) {
            r9.A0d("story_guides");
            r9.A0S();
            for (C34151eA r046 : r10.A2Z) {
                if (r046 != null) {
                    C34141e9.A00(r9, r046);
                }
            }
            r9.A0P();
        }
        if (r10.A2g != null) {
            r9.A0d("story_cta");
            r9.A0S();
            for (C43531uZ r047 : r10.A2g) {
                if (r047 != null) {
                    C43521uY.A00(r9, r047);
                }
            }
            r9.A0P();
        }
        if (r10.A2v != null) {
            r9.A0d("story_poll_voter_infos");
            r9.A0S();
            for (AnonymousClass20W r314 : r10.A2v) {
                if (r314 != null) {
                    r9.A0T();
                    String str111 = r314.A01;
                    if (str111 != null) {
                        r9.A0H("poll_id", str111);
                    }
                    String str112 = r314.A00;
                    if (str112 != null) {
                        r9.A0H("max_id", str112);
                    }
                    r9.A0I("more_available", r314.A03);
                    if (r314.A02 != null) {
                        r9.A0d("voters");
                        r9.A0S();
                        for (AnonymousClass5H6 r15 : r314.A02) {
                            if (r15 != null) {
                                r9.A0T();
                                if (r15.A01 != null) {
                                    r9.A0d("user");
                                    AnonymousClass1O2.A03(r9, r15.A01);
                                }
                                r9.A0F("vote", r15.A00);
                                r9.A0Q();
                            }
                        }
                        r9.A0P();
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        if (r10.A2z != null) {
            r9.A0d("story_question_responder_infos");
            r9.A0S();
            for (AnonymousClass23O r048 : r10.A2z) {
                if (r048 != null) {
                    AnonymousClass23N.A00(r9, r048);
                }
            }
            r9.A0P();
        }
        if (r10.A31 != null) {
            r9.A0d("story_quiz_participant_infos");
            r9.A0S();
            for (C121075Hd r52 : r10.A31) {
                if (r52 != null) {
                    r9.A0T();
                    String str113 = r52.A01;
                    if (str113 != null) {
                        r9.A0H("quiz_id", str113);
                    }
                    if (r52.A02 != null) {
                        r9.A0d(RealtimeProtocol.DIRECT_V2_PARTICIPANTS);
                        r9.A0S();
                        for (AnonymousClass5HH r16 : r52.A02) {
                            if (r16 != null) {
                                r9.A0T();
                                if (r16.A01 != null) {
                                    r9.A0d("user");
                                    AnonymousClass1O2.A03(r9, r16.A01);
                                }
                                r9.A0F("answer", r16.A00);
                                r9.A0Q();
                            }
                        }
                        r9.A0P();
                    }
                    String str114 = r52.A00;
                    if (str114 != null) {
                        r9.A0H("max_id", str114);
                    }
                    r9.A0I("more_available", r52.A03);
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        if (r10.A33 != null) {
            r9.A0d("story_slider_voter_infos");
            r9.A0S();
            for (AnonymousClass5HY r315 : r10.A33) {
                if (r315 != null) {
                    r9.A0T();
                    r9.A0I("more_available", r315.A03);
                    String str115 = r315.A00;
                    if (str115 != null) {
                        r9.A0H("max_id", str115);
                    }
                    String str116 = r315.A01;
                    if (str116 != null) {
                        r9.A0H("slider_id", str116);
                    }
                    if (r315.A02 != null) {
                        r9.A0d("voters");
                        r9.A0S();
                        for (C120835Ge r049 : r315.A02) {
                            if (r049 != null) {
                                C120845Gf.A00(r9, r049);
                            }
                        }
                        r9.A0P();
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        if (r10.A2m != null) {
            r9.A0d("story_fundraiser_donation_infos");
            r9.A0S();
            for (AnonymousClass5HG r316 : r10.A2m) {
                if (r316 != null) {
                    r9.A0T();
                    String str117 = r316.A03;
                    if (str117 != null) {
                        r9.A0H("fundraiser_id", str117);
                    }
                    if (r316.A01 != null) {
                        r9.A0d("charity");
                        AnonymousClass1O2.A03(r9, r316.A01);
                    }
                    String str118 = r316.A02;
                    if (str118 != null) {
                        r9.A0H("amount_raised", str118);
                    }
                    if (r316.A00 != null) {
                        r9.A0d("donations");
                        AnonymousClass5HQ r64 = r316.A00;
                        r9.A0T();
                        if (r64.A01 != null) {
                            r9.A0d("donations");
                            r9.A0S();
                            for (AnonymousClass5HJ r17 : r64.A01) {
                                if (r17 != null) {
                                    r9.A0T();
                                    if (r17.A00 != null) {
                                        r9.A0d("user");
                                        AnonymousClass1O2.A03(r9, r17.A00);
                                    }
                                    String str119 = r17.A01;
                                    if (str119 != null) {
                                        r9.A0H("amount", str119);
                                    }
                                    r9.A0Q();
                                }
                            }
                            r9.A0P();
                        }
                        String str120 = r64.A00;
                        if (str120 != null) {
                            r9.A0H("max_id", str120);
                        }
                        r9.A0I("more_available", r64.A02);
                        r9.A0Q();
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        if (r10.A11 != null) {
            r9.A0d("donations_prompt_info");
            AnonymousClass4XB r18 = r10.A11;
            r9.A0T();
            if (r18.A00 != null) {
                r9.A0d("charity_user");
                AnonymousClass1O2.A03(r9, r18.A00);
            }
            String str121 = r18.A01;
            if (str121 != null) {
                r9.A0H("prompt_title", str121);
            }
            r9.A0Q();
        }
        if (r10.A2b != null) {
            r9.A0d("story_chat_request_infos");
            r9.A0S();
            for (C96714Gf r317 : r10.A2b) {
                if (r317 != null) {
                    r9.A0T();
                    r9.A0F("total_participant_requests", r317.A00);
                    r9.A0F("total_thread_participants", r317.A01);
                    String str122 = r317.A02;
                    if (str122 != null) {
                        r9.A0H("cursor", str122);
                    }
                    if (r317.A04 != null) {
                        r9.A0d("users");
                        r9.A0S();
                        for (C13300iJ r050 : r317.A04) {
                            if (r050 != null) {
                                AnonymousClass1O2.A03(r9, r050);
                            }
                        }
                        r9.A0P();
                    }
                    if (r317.A03 != null) {
                        r9.A0d("requester_usernames");
                        r9.A0T();
                        for (Map.Entry entry : r317.A03.entrySet()) {
                            r9.A0d((String) entry.getKey());
                            if (entry.getValue() == null) {
                                r9.A0R();
                            } else {
                                r9.A0g((String) entry.getValue());
                            }
                        }
                        r9.A0Q();
                    }
                    r9.A0Q();
                }
            }
            r9.A0P();
        }
        Boolean bool8 = r10.A1E;
        if (bool8 != null) {
            r9.A0I("story_is_saved_to_archive", bool8.booleanValue());
        }
        if (r10.A0i != null) {
            r9.A0d("rights_manager_flag_info");
            AnonymousClass5NT r318 = r10.A0i;
            r9.A0T();
            AnonymousClass432 r051 = r318.A00;
            if (r051 != null) {
                r9.A0H("type", r051.A00);
            }
            String str123 = r318.A01;
            if (str123 != null) {
                r9.A0H("reason", str123);
            }
            String str124 = r318.A02;
            if (str124 != null) {
                r9.A0H("segmented_video_group_handler_id", str124);
            }
            if (r318.A03 != null) {
                r9.A0d("country_list");
                r9.A0S();
                Iterator it3 = r318.A03.iterator();
                while (it3.hasNext()) {
                    String str125 = (String) it3.next();
                    if (str125 != null) {
                        r9.A0g(str125);
                    }
                }
                r9.A0P();
            }
            r9.A0I("should_disable_sharing", r318.A04);
            r9.A0Q();
        }
        if (r10.A10 != null) {
            r9.A0d("story_original_sound_info");
            C34541eu.A00(r9, r10.A10, true);
        }
        String str126 = r10.A1u;
        if (str126 != null) {
            r9.A0H("xpost_deny_reason", str126);
        }
        r9.A0I("has_reshares", r10.A3M);
        Boolean bool9 = r10.A1D;
        if (bool9 != null) {
            r9.A0I("is_pride_media", bool9.booleanValue());
        }
        C34201eF r052 = r10.A0l;
        if (r052 != null) {
            r9.A0F("has_shared_to_fb", r052.A00);
        }
        C34211eH r053 = r10.A0k;
        if (r053 != null) {
            r9.A0F("has_shared_to_fb_dating", r053.A00);
        }
        Boolean bool10 = r10.A1F;
        if (bool10 != null) {
            r9.A0I("show_one_tap_fb_share_tooltip", bool10.booleanValue());
        }
        if (r10.A2a != null) {
            r9.A0d("highlight_reel_ids");
            r9.A0S();
            for (String str127 : r10.A2a) {
                if (str127 != null) {
                    r9.A0g(str127);
                }
            }
            r9.A0P();
        }
        Long l4 = r10.A1X;
        if (l4 != null) {
            r9.A0G("archived_media_timestamp", l4.longValue());
        }
        C36811ie r054 = r10.A0s;
        if (r054 != null) {
            r9.A0H(RealtimeProtocol.DIRECT_V2_MESSAGE_POLICY_VIOLATION_VISIBILITY_CHANGED, r054.A00);
        }
        C37171jE r055 = r10.A0q;
        if (r055 != null) {
            r9.A0H("audience", r055.A00);
        }
        r9.A0I("is_aymf_media", r10.A3W);
        r9.A0I("is_ad4ad", r10.A3N);
        if (r10.A0m != null) {
            r9.A0d("follow_hashtag_info");
            C31261Xe.A00(r9, r10.A0m);
        }
        String str128 = r10.A21;
        if (str128 != null) {
            r9.A0H("inventory_source", str128);
        }
        Long l5 = r10.A1Z;
        if (l5 != null) {
            r9.A0G("last_synced_timestamp_ms", l5.longValue());
        }
        String str129 = r10.A24;
        if (str129 != null) {
            r9.A0H("main_feed_carousel_starting_media_id", str129);
        }
        if (r10.A2X != null) {
            r9.A0d("collection_media");
            r9.A0S();
            for (AnonymousClass1NJ r056 : r10.A2X) {
                if (r056 != null) {
                    A01(r9, r056);
                }
            }
            r9.A0P();
        }
        C487829m r057 = r10.A0p;
        if (r057 != null) {
            r9.A0F("collection_media_type", r057.A00);
        }
        C487729l r058 = r10.A0o;
        if (r058 != null) {
            r9.A0F("collection_media_role", r058.A00);
        }
        String str130 = r10.A1m;
        if (str130 != null) {
            r9.A0H("collection_parent_id", str130);
        }
        Boolean bool11 = r10.A1C;
        if (bool11 != null) {
            r9.A0I("is_eof", bool11.booleanValue());
        }
        r9.A0I("is_seen", r10.A3V);
        String str131 = r10.A1r;
        if (str131 != null) {
            r9.A0H("dynamic_item_id", str131);
        }
        r9.A0I("can_viewer_reshare", r10.A3K);
        r9.A0I("can_mention_share", r10.A3J);
        r9.A0I("nearly_complete_copyright_match", r10.A3Y);
        String str132 = r10.A2F;
        if (str132 != null) {
            r9.A0H(DialogModule.KEY_TITLE, str132);
        }
        r9.A0D("video_duration", r10.A02);
        AnonymousClass1YR r059 = r10.A0t;
        if (r059 != null) {
            r9.A0H("product_type", r059.A00);
        }
        if (r10.A0b != null) {
            r9.A0d("thumbnails");
            AnonymousClass1YY r2 = r10.A0b;
            r9.A0T();
            r9.A0F("max_thumbnails_per_sprite", r2.A01);
            r9.A0E("thumbnail_duration", r2.A00);
            r9.A0F("thumbnail_height", r2.A02);
            r9.A0F("thumbnail_width", r2.A03);
            r9.A0F("thumbnails_per_row", r2.A04);
            r9.A0F("video_length", r2.A05);
            if (r2.A06 != null) {
                r9.A0d("sprite_urls");
                r9.A0S();
                for (ImageUrl imageUrl : r2.A06) {
                    if (imageUrl != null) {
                        C13270iF.A01(r9, imageUrl);
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        String str133 = r10.A2E;
        if (str133 != null) {
            r9.A0H("feed_survey_integration_id", str133);
        }
        if (r10.A0J != null) {
            r9.A0d(MediaStreamTrack.AUDIO_TRACK_KIND);
            C54452Xj r319 = r10.A0J;
            r9.A0T();
            String str134 = r319.A02;
            if (str134 != null) {
                r9.A0H("audio_src", str134);
            }
            r9.A0G("duration", r319.A01);
            r9.A0F("waveform_sampling_frequency_hz", r319.A00);
            if (r319.A03 != null) {
                r9.A0d("waveform_data");
                r9.A0S();
                for (Float f : r319.A03) {
                    if (f != null) {
                        r9.A0W(f.floatValue());
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        r9.A0F("carousel_media_count", r10.A04);
        if (r10.A0x != null) {
            r9.A0d("story_ad_headline");
            C62582nx r320 = r10.A0x;
            r9.A0T();
            String str135 = r320.A05;
            if (str135 != null) {
                r9.A0H("text", str135);
            }
            String str136 = r320.A04;
            if (str136 != null) {
                r9.A0H("description", str136);
            }
            String str137 = r320.A02;
            if (str137 != null) {
                r9.A0H("background_color", str137);
            }
            String str138 = r320.A03;
            if (str138 != null) {
                r9.A0H("background_color_alpha", str138);
            }
            String str139 = r320.A06;
            if (str139 != null) {
                r9.A0H("text_color", str139);
            }
            Integer num16 = r320.A01;
            if (num16 != null) {
                r9.A0F("text_size", num16.intValue());
            }
            if (r320.A07 != null) {
                r9.A0d("mention_user_list");
                r9.A0T();
                for (Map.Entry entry2 : r320.A07.entrySet()) {
                    r9.A0d((String) entry2.getKey());
                    if (entry2.getValue() == null) {
                        r9.A0R();
                    } else {
                        AnonymousClass1O2.A03(r9, (C13300iJ) entry2.getValue());
                    }
                }
                r9.A0Q();
            }
            if (r320.A00 != null) {
                r9.A0d("ad_disclaimer_info");
                C488629u.A00(r9, r320.A00);
            }
            r9.A0Q();
        }
        Boolean bool12 = r10.A1A;
        if (bool12 != null) {
            r9.A0I("has_new_likes", bool12.booleanValue());
        }
        if (r10.A0c != null) {
            r9.A0d("media_urls");
            DjO djO = r10.A0c;
            r9.A0T();
            String str140 = djO.A00;
            if (str140 != null) {
                r9.A0H("photo_url", str140);
            }
            String str141 = djO.A01;
            if (str141 != null) {
                r9.A0H("video_url", str141);
            }
            r9.A0Q();
        }
        if (r10.A0V != null) {
            r9.A0d("igtv_series_info");
            C46121zA r22 = r10.A0V;
            r9.A0T();
            String str142 = r22.A01;
            if (str142 != null) {
                r9.A0H("id", str142);
            }
            String str143 = r22.A02;
            if (str143 != null) {
                r9.A0H(DialogModule.KEY_TITLE, str143);
            }
            r9.A0F("num_episodes", r22.A00);
            r9.A0Q();
        }
        String str144 = r10.A2A;
        if (str144 != null) {
            r9.A0H("position_info", str144);
        }
        r9.A0F("num_video_reactions", r10.A07);
        if (r10.A0O != null) {
            r9.A0d("video_reactions");
            C30764DjM djM = r10.A0O;
            r9.A0T();
            String str145 = djM.A01;
            if (str145 != null) {
                r9.A0H("target_media_id", str145);
            }
            String str146 = djM.A00;
            if (str146 != null) {
                r9.A0H("max_id", str146);
            }
            r9.A0I("more_available", djM.A03);
            if (djM.A02 != null) {
                r9.A0d("items");
                r9.A0S();
                for (AnonymousClass1NJ r060 : djM.A02) {
                    if (r060 != null) {
                        A01(r9, r060);
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        String str147 = r10.A2K;
        if (str147 != null) {
            r9.A0H("video_reactions_prompt", str147);
        }
        if (r10.A0U != null) {
            r9.A0d("igtv_ads_info");
            AnonymousClass77u r23 = r10.A0U;
            r9.A0T();
            r9.A0I("ads_toggled_on", r23.A01);
            AnonymousClass9LP r061 = r23.A00;
            if (r061 != null) {
                r9.A0F("brand_safety_status_for_media_edit", r061.A00);
            }
            r9.A0I("is_video_eligible_for_inserting_ads", r23.A02);
            r9.A0Q();
        }
        r9.A0I("should_request_ads", r10.A3a);
        if (r10.A0w != null) {
            r9.A0d("landscape_story_ads_auto_cropping");
            C2106296n r24 = r10.A0w;
            r9.A0T();
            r9.A0F("start_x_position", r24.A01);
            r9.A0F("start_y_position", r24.A02);
            r9.A0F(IgReactMediaPickerNativeModule.HEIGHT, r24.A00);
            r9.A0F(IgReactMediaPickerNativeModule.WIDTH, r24.A03);
            if (r24.A04 != null) {
                r9.A0d("caption_info");
                C211469Ac r321 = r24.A04;
                r9.A0T();
                r9.A0E("start_x_position_percentage", r321.A01);
                r9.A0E("start_y_position_percentage", r321.A02);
                r9.A0E("height_percentage", r321.A00);
                r9.A0E("width_percentage", r321.A03);
                String str148 = r321.A05;
                if (str148 != null) {
                    r9.A0H("background_color", str148);
                }
                r9.A0F("text_size", r321.A04);
                String str149 = r321.A06;
                if (str149 != null) {
                    r9.A0H("text_color", str149);
                }
                r9.A0Q();
            }
            r9.A0Q();
        }
        AnonymousClass29e r062 = r10.A0u;
        if (r062 != null) {
            r9.A0H("auto_generated_card_type", r062.A00);
        }
        if (r10.A0y != null) {
            r9.A0d("showreel_native_animation");
            C28865Cnz cnz = r10.A0y;
            r9.A0T();
            String str150 = cnz.A00;
            if (str150 != null) {
                r9.A0H("client_name", str150);
            }
            String str151 = cnz.A02;
            if (str151 != null) {
                r9.A0H("template_name", str151);
            }
            String str152 = cnz.A01;
            if (str152 != null) {
                r9.A0H("content", str152);
            }
            if (cnz.A03 != null) {
                r9.A0d("assets");
                r9.A0S();
                for (String str153 : cnz.A03) {
                    if (str153 != null) {
                        r9.A0g(str153);
                    }
                }
                r9.A0P();
            }
            r9.A0Q();
        }
        if (r10.A0G != null) {
            r9.A0d("media_debug_info");
            r9.A0R();
        }
        if (r10.A0F != null) {
            r9.A0d("clips_metadata");
            C31941aH r19 = r10.A0F;
            r9.A0T();
            if (r19.A00 != null) {
                r9.A0d("music_info");
                C31951aI.A00(r9, r19.A00);
            }
            if (r19.A01 != null) {
                r9.A0d("original_sound_info");
                C31971aK.A00(r9, r19.A01);
            }
            String str154 = r19.A02;
            if (str154 != null) {
                r9.A0H("featured_label", str154);
            }
            r9.A0Q();
        }
        r9.A0I("is_post_live", r10.A3T);
        r9.A0Q();
    }
}
