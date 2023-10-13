package p085m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.C0008a;
import p091n2.C2685e;
import p091n2.C2689i;
import p162z1.C3627b;

/* renamed from: m2.i */
public class C2585i {

    /* renamed from: a */
    public final C2689i f8690a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2593h f8691b;

    /* renamed from: c */
    final C2689i.C2693c f8692c;

    /* renamed from: m2.i$a */
    class C2586a implements C2689i.C2693c {
        C2586a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
        /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            r7.mo9291b((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            r7.mo9290a("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00fe */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x011f A[Catch:{ JSONException -> 0x0216 }] */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7778l(p091n2.C2688h r6, p091n2.C2689i.C2694d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                m2.i r1 = p085m2.C2585i.this
                m2.i$h r1 = r1.f8691b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f9001a
                java.lang.Object r6 = r6.f9002b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                p162z1.C3627b.m16092f(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0216 }
                switch(r4) {
                    case -766342101: goto L_0x00b4;
                    case -720677196: goto L_0x00a9;
                    case -577225884: goto L_0x009f;
                    case -548468504: goto L_0x0095;
                    case -247230243: goto L_0x008b;
                    case -215273374: goto L_0x0081;
                    case 241845679: goto L_0x0077;
                    case 875995648: goto L_0x006c;
                    case 1128339786: goto L_0x0062;
                    case 1390477857: goto L_0x0057;
                    case 1514180520: goto L_0x004b;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x0216 }
            L_0x0033:
                goto L_0x00be
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 2
                goto L_0x00be
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 4
                goto L_0x00be
            L_0x004b:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 10
                goto L_0x00be
            L_0x0057:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 8
                goto L_0x00be
            L_0x0062:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 5
                goto L_0x00be
            L_0x006c:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 12
                goto L_0x00be
            L_0x0077:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 7
                goto L_0x00be
            L_0x0081:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 0
                goto L_0x00be
            L_0x008b:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 1
                goto L_0x00be
            L_0x0095:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 3
                goto L_0x00be
            L_0x009f:
                java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 6
                goto L_0x00be
            L_0x00a9:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 11
                goto L_0x00be
            L_0x00b4:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 9
            L_0x00be:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x01fc;
                    case 1: goto L_0x01e2;
                    case 2: goto L_0x01c4;
                    case 3: goto L_0x01a8;
                    case 4: goto L_0x018a;
                    case 5: goto L_0x016c;
                    case 6: goto L_0x0162;
                    case 7: goto L_0x0158;
                    case 8: goto L_0x0136;
                    case 9: goto L_0x012c;
                    case 10: goto L_0x00f5;
                    case 11: goto L_0x00e1;
                    case 12: goto L_0x00c8;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                r7.mo9292c()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00c8:
                m2.i r6 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0216 }
                m2.i$h r6 = r6.f8691b     // Catch:{ JSONException -> 0x0216 }
                boolean r6 = r6.mo8496m()     // Catch:{ JSONException -> 0x0216 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                r1.<init>()     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x0216 }
                r7.mo9291b(r1)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00e1:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0216 }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0216 }
                m2.i$h r1 = r1.f8691b     // Catch:{ JSONException -> 0x0216 }
                r1.mo8488e(r6)     // Catch:{ JSONException -> 0x0216 }
            L_0x00f0:
                r7.mo9291b(r3)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00f5:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0216 }
                if (r6 == 0) goto L_0x0112
                m2.i$e r6 = p085m2.C2585i.C2590e.m11807a(r6)     // Catch:{ NoSuchFieldException -> 0x00fe }
                goto L_0x0113
            L_0x00fe:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0216 }
                r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x0216 }
                r2.append(r6)     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0216 }
                r7.mo9290a(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
            L_0x0112:
                r6 = r3
            L_0x0113:
                m2.i r2 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0216 }
                m2.i$h r2 = r2.f8691b     // Catch:{ JSONException -> 0x0216 }
                java.lang.CharSequence r6 = r2.mo8485b(r6)     // Catch:{ JSONException -> 0x0216 }
                if (r6 == 0) goto L_0x00f0
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x0216 }
                r7.mo9291b(r2)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x012c:
                m2.i r6 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0216 }
                m2.i$h r6 = r6.f8691b     // Catch:{ JSONException -> 0x0216 }
                r6.mo8486c()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x0136:
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                m2.i$j r6 = r1.m11800i(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                m2.i$h r1 = r1.f8691b     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                r1.mo8489f(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                r7.mo9291b(r3)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                goto L_0x022f
            L_0x014c:
                r6 = move-exception
                goto L_0x014f
            L_0x014e:
                r6 = move-exception
            L_0x014f:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
            L_0x0153:
                r7.mo9290a(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x0158:
                m2.i r6 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0216 }
                m2.i$h r6 = r6.f8691b     // Catch:{ JSONException -> 0x0216 }
                r6.mo8487d()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x0162:
                m2.i r6 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0216 }
                m2.i$h r6 = r6.f8691b     // Catch:{ JSONException -> 0x0216 }
                r6.mo8484a()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x016c:
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                m2.i$k r6 = r1.m11801j(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                m2.i$h r1 = r1.f8691b     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                r1.mo8492i(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                r7.mo9291b(r3)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                goto L_0x022f
            L_0x0182:
                r6 = move-exception
                goto L_0x0185
            L_0x0184:
                r6 = move-exception
            L_0x0185:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x018a:
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                java.util.List r6 = r1.m11802k(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                m2.i$h r1 = r1.f8691b     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r1.mo8495l(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r7.mo9291b(r3)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                goto L_0x022f
            L_0x01a0:
                r6 = move-exception
                goto L_0x01a3
            L_0x01a2:
                r6 = move-exception
            L_0x01a3:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01a8:
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x01be }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01be }
                m2.i$c r6 = r1.m11798g(r6)     // Catch:{ JSONException -> 0x01be }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x01be }
                m2.i$h r1 = r1.f8691b     // Catch:{ JSONException -> 0x01be }
                r1.mo8490g(r6)     // Catch:{ JSONException -> 0x01be }
                r7.mo9291b(r3)     // Catch:{ JSONException -> 0x01be }
                goto L_0x022f
            L_0x01be:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01c4:
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                int r6 = r1.m11799h(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                m2.i$h r1 = r1.f8691b     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                r1.mo8494k(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                r7.mo9291b(r3)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                goto L_0x022f
            L_0x01d9:
                r6 = move-exception
                goto L_0x01dc
            L_0x01db:
                r6 = move-exception
            L_0x01dc:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01e2:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x01f5 }
                m2.i$g r6 = p085m2.C2585i.C2592g.m11809a(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ NoSuchFieldException -> 0x01f5 }
                m2.i$h r1 = r1.f8691b     // Catch:{ NoSuchFieldException -> 0x01f5 }
                r1.mo8491h(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                r7.mo9291b(r3)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                goto L_0x022f
            L_0x01f5:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01fc:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x020f }
                m2.i$i r6 = p085m2.C2585i.C2594i.m11823a(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                m2.i r1 = p085m2.C2585i.this     // Catch:{ NoSuchFieldException -> 0x020f }
                m2.i$h r1 = r1.f8691b     // Catch:{ NoSuchFieldException -> 0x020f }
                r1.mo8493j(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                r7.mo9291b(r3)     // Catch:{ NoSuchFieldException -> 0x020f }
                goto L_0x022f
            L_0x020f:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x0216:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.mo9290a(r0, r6, r3)
            L_0x022f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p085m2.C2585i.C2586a.mo7778l(n2.h, n2.i$d):void");
        }
    }

    /* renamed from: m2.i$b */
    static /* synthetic */ class C2587b {

        /* renamed from: a */
        static final /* synthetic */ int[] f8694a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8695b;

        /* renamed from: c */
        static final /* synthetic */ int[] f8696c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                m2.i$k[] r0 = p085m2.C2585i.C2596k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8696c = r0
                r1 = 1
                m2.i$k r2 = p085m2.C2585i.C2596k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8696c     // Catch:{ NoSuchFieldError -> 0x001d }
                m2.i$k r3 = p085m2.C2585i.C2596k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8696c     // Catch:{ NoSuchFieldError -> 0x0028 }
                m2.i$k r4 = p085m2.C2585i.C2596k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f8696c     // Catch:{ NoSuchFieldError -> 0x0033 }
                m2.i$k r5 = p085m2.C2585i.C2596k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                m2.i$l[] r4 = p085m2.C2585i.C2597l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8695b = r4
                m2.i$l r5 = p085m2.C2585i.C2597l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f8695b     // Catch:{ NoSuchFieldError -> 0x004e }
                m2.i$l r5 = p085m2.C2585i.C2597l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                m2.i$f[] r4 = p085m2.C2585i.C2591f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8694a = r4
                m2.i$f r5 = p085m2.C2585i.C2591f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f8694a     // Catch:{ NoSuchFieldError -> 0x0069 }
                m2.i$f r4 = p085m2.C2585i.C2591f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f8694a     // Catch:{ NoSuchFieldError -> 0x0073 }
                m2.i$f r1 = p085m2.C2585i.C2591f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f8694a     // Catch:{ NoSuchFieldError -> 0x007d }
                m2.i$f r1 = p085m2.C2585i.C2591f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p085m2.C2585i.C2587b.<clinit>():void");
        }
    }

    /* renamed from: m2.i$c */
    public static class C2588c {

        /* renamed from: a */
        public final int f8697a;

        /* renamed from: b */
        public final String f8698b;

        public C2588c(int i, String str) {
            this.f8697a = i;
            this.f8698b = str;
        }
    }

    /* renamed from: m2.i$d */
    public enum C2589d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: d */
        private String f8702d;

        private C2589d(String str) {
            this.f8702d = str;
        }

        /* renamed from: a */
        static C2589d m11806a(String str) {
            for (C2589d dVar : values()) {
                if (dVar.f8702d.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: m2.i$e */
    public enum C2590e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: d */
        private String f8705d;

        private C2590e(String str) {
            this.f8705d = str;
        }

        /* renamed from: a */
        static C2590e m11807a(String str) {
            for (C2590e eVar : values()) {
                if (eVar.f8705d.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: m2.i$f */
    public enum C2591f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: d */
        private String f8711d;

        private C2591f(String str) {
            this.f8711d = str;
        }

        /* renamed from: a */
        static C2591f m11808a(String str) {
            for (C2591f fVar : values()) {
                if (fVar.f8711d.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: m2.i$g */
    public enum C2592g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: d */
        private final String f8718d;

        private C2592g(String str) {
            this.f8718d = str;
        }

        /* renamed from: a */
        static C2592g m11809a(String str) {
            for (C2592g gVar : values()) {
                String str2 = gVar.f8718d;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: m2.i$h */
    public interface C2593h {
        /* renamed from: a */
        void mo8484a();

        /* renamed from: b */
        CharSequence mo8485b(C2590e eVar);

        /* renamed from: c */
        void mo8486c();

        /* renamed from: d */
        void mo8487d();

        /* renamed from: e */
        void mo8488e(String str);

        /* renamed from: f */
        void mo8489f(C2595j jVar);

        /* renamed from: g */
        void mo8490g(C2588c cVar);

        /* renamed from: h */
        void mo8491h(C2592g gVar);

        /* renamed from: i */
        void mo8492i(C2596k kVar);

        /* renamed from: j */
        void mo8493j(C2594i iVar);

        /* renamed from: k */
        void mo8494k(int i);

        /* renamed from: l */
        void mo8495l(List<C2597l> list);

        /* renamed from: m */
        boolean mo8496m();
    }

    /* renamed from: m2.i$i */
    public enum C2594i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: d */
        private final String f8722d;

        private C2594i(String str) {
            this.f8722d = str;
        }

        /* renamed from: a */
        static C2594i m11823a(String str) {
            for (C2594i iVar : values()) {
                if (iVar.f8722d.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: m2.i$j */
    public static class C2595j {

        /* renamed from: a */
        public final Integer f8723a;

        /* renamed from: b */
        public final C2589d f8724b;

        /* renamed from: c */
        public final Boolean f8725c;

        /* renamed from: d */
        public final Integer f8726d;

        /* renamed from: e */
        public final C2589d f8727e;

        /* renamed from: f */
        public final Integer f8728f;

        /* renamed from: g */
        public final Boolean f8729g;

        public C2595j(Integer num, C2589d dVar, Boolean bool, Integer num2, C2589d dVar2, Integer num3, Boolean bool2) {
            this.f8723a = num;
            this.f8724b = dVar;
            this.f8725c = bool;
            this.f8726d = num2;
            this.f8727e = dVar2;
            this.f8728f = num3;
            this.f8729g = bool2;
        }
    }

    /* renamed from: m2.i$k */
    public enum C2596k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: d */
        private String f8735d;

        private C2596k(String str) {
            this.f8735d = str;
        }

        /* renamed from: a */
        static C2596k m11824a(String str) {
            for (C2596k kVar : values()) {
                if (kVar.f8735d.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* renamed from: m2.i$l */
    public enum C2597l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: d */
        private String f8739d;

        private C2597l(String str) {
            this.f8739d = str;
        }

        /* renamed from: a */
        static C2597l m11825a(String str) {
            for (C2597l lVar : values()) {
                if (lVar.f8739d.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public C2585i(C0008a aVar) {
        C2586a aVar2 = new C2586a();
        this.f8692c = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/platform", C2685e.f9000a);
        this.f8690a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C2588c m11798g(JSONObject jSONObject) {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= -16777216;
        }
        return new C2588c(i, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m11799h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            m2.i$f r4 = p085m2.C2585i.C2591f.m11808a(r4)
            int[] r8 = p085m2.C2585i.C2587b.f8694a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p085m2.C2585i.m11799h(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C2595j m11800i(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        C2589d a = !jSONObject.isNull("statusBarIconBrightness") ? C2589d.m11806a(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        C2589d a2 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? C2589d.m11806a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new C2595j(valueOf, a, valueOf2, valueOf3, a2, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C2596k m11801j(String str) {
        int i = C2587b.f8696c[C2596k.m11824a(str).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? C2596k.EDGE_TO_EDGE : C2596k.EDGE_TO_EDGE : C2596k.IMMERSIVE_STICKY : C2596k.IMMERSIVE : C2596k.LEAN_BACK;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public List<C2597l> m11802k(JSONArray jSONArray) {
        C2597l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = C2587b.f8695b[C2597l.m11825a(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                lVar = C2597l.TOP_OVERLAYS;
            } else if (i2 != 2) {
            } else {
                lVar = C2597l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    /* renamed from: l */
    public void mo9282l(C2593h hVar) {
        this.f8691b = hVar;
    }

    /* renamed from: m */
    public void mo9283m(boolean z) {
        C3627b.m16092f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f8690a.mo9432c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z)}));
    }
}
