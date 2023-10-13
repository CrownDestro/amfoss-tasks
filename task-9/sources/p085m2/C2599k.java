package p085m2;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003a2.C0008a;
import p091n2.C2688h;
import p091n2.C2689i;
import p091n2.C2703q;
import p162z1.C3627b;

/* renamed from: m2.k */
public class C2599k {

    /* renamed from: a */
    private final C2689i f8741a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2607g f8742b;

    /* renamed from: c */
    private final C2689i.C2693c f8743c;

    /* renamed from: m2.k$a */
    class C2600a implements C2689i.C2693c {
        C2600a() {
        }

        /* renamed from: b */
        private void m11833b(C2688h hVar, C2689i.C2694d dVar) {
            try {
                C2599k.this.f8742b.mo8553a(((Integer) hVar.mo9431a()).intValue());
                dVar.mo9291b((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* renamed from: c */
        private void m11834c(C2688h hVar, C2689i.C2694d dVar) {
            C2689i.C2694d dVar2 = dVar;
            Map map = (Map) hVar.mo9431a();
            boolean z = true;
            boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z2) {
                try {
                    C2599k.this.f8742b.mo8559g(new C2603d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), C2603d.C2604a.HYBRID_ONLY, wrap));
                } catch (IllegalStateException e) {
                    dVar2.mo9290a("error", C2599k.m11829c(e), (Object) null);
                    return;
                }
            } else {
                if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z = false;
                }
                C2603d.C2604a aVar = z ? C2603d.C2604a.TEXTURE_WITH_HYBRID_FALLBACK : C2603d.C2604a.TEXTURE_WITH_VIRTUAL_FALLBACK;
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d = ((Double) map.get("left")).doubleValue();
                }
                long i = C2599k.this.f8742b.mo8561i(new C2603d(intValue, str, doubleValue, d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), aVar, wrap));
                if (i != -2) {
                    dVar2.mo9291b(Long.valueOf(i));
                    return;
                } else if (!z) {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                }
            }
            dVar2.mo9291b((Object) null);
        }

        /* renamed from: d */
        private void m11835d(C2688h hVar, C2689i.C2694d dVar) {
            try {
                C2599k.this.f8742b.mo8560h(((Integer) ((Map) hVar.mo9431a()).get("id")).intValue());
                dVar.mo9291b((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m11836e(C2689i.C2694d dVar, C2602c cVar) {
            if (cVar == null) {
                dVar.mo9290a("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f8745a));
            hashMap.put("height", Double.valueOf((double) cVar.f8746b));
            dVar.mo9291b(hashMap);
        }

        /* renamed from: f */
        private void m11837f(C2688h hVar, C2689i.C2694d dVar) {
            Map map = (Map) hVar.mo9431a();
            try {
                C2599k.this.f8742b.mo8555c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.mo9291b((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* renamed from: g */
        private void m11838g(C2688h hVar, C2689i.C2694d dVar) {
            Map map = (Map) hVar.mo9431a();
            try {
                C2599k.this.f8742b.mo8556d(new C2605e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new C2598j(dVar));
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* renamed from: h */
        private void m11839h(C2688h hVar, C2689i.C2694d dVar) {
            Map map = (Map) hVar.mo9431a();
            try {
                C2599k.this.f8742b.mo8557e(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.mo9291b((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* renamed from: i */
        private void m11840i(C2688h hVar, C2689i.C2694d dVar) {
            try {
                C2599k.this.f8742b.mo8554b(((Boolean) hVar.mo9431a()).booleanValue());
                dVar.mo9291b((Object) null);
            } catch (IllegalStateException e) {
                dVar.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* renamed from: j */
        private void m11841j(C2688h hVar, C2689i.C2694d dVar) {
            C2689i.C2694d dVar2;
            C2689i.C2694d dVar3 = dVar;
            List list = (List) hVar.mo9431a();
            C2606f fVar = r2;
            C2606f fVar2 = fVar;
            C2606f fVar3 = new C2606f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                C2599k.this.f8742b.mo8558f(fVar);
                dVar2 = dVar;
                try {
                    dVar2.mo9291b((Object) null);
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2 = dVar;
                dVar2.mo9290a("error", C2599k.m11829c(e), (Object) null);
            }
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            if (C2599k.this.f8742b != null) {
                C3627b.m16092f("PlatformViewsChannel", "Received '" + hVar.f9001a + "' message.");
                String str = hVar.f9001a;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        m11834c(hVar, dVar);
                        return;
                    case 1:
                        m11837f(hVar, dVar);
                        return;
                    case 2:
                        m11838g(hVar, dVar);
                        return;
                    case 3:
                        m11833b(hVar, dVar);
                        return;
                    case 4:
                        m11840i(hVar, dVar);
                        return;
                    case 5:
                        m11841j(hVar, dVar);
                        return;
                    case 6:
                        m11839h(hVar, dVar);
                        return;
                    case 7:
                        m11835d(hVar, dVar);
                        return;
                    default:
                        dVar.mo9292c();
                        return;
                }
            }
        }
    }

    /* renamed from: m2.k$b */
    public interface C2601b {
        /* renamed from: a */
        void mo9284a(C2602c cVar);
    }

    /* renamed from: m2.k$c */
    public static class C2602c {

        /* renamed from: a */
        public final int f8745a;

        /* renamed from: b */
        public final int f8746b;

        public C2602c(int i, int i2) {
            this.f8745a = i;
            this.f8746b = i2;
        }
    }

    /* renamed from: m2.k$d */
    public static class C2603d {

        /* renamed from: a */
        public final int f8747a;

        /* renamed from: b */
        public final String f8748b;

        /* renamed from: c */
        public final double f8749c;

        /* renamed from: d */
        public final double f8750d;

        /* renamed from: e */
        public final double f8751e;

        /* renamed from: f */
        public final double f8752f;

        /* renamed from: g */
        public final int f8753g;

        /* renamed from: h */
        public final C2604a f8754h;

        /* renamed from: i */
        public final ByteBuffer f8755i;

        /* renamed from: m2.k$d$a */
        public enum C2604a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public C2603d(int i, String str, double d, double d2, double d3, double d4, int i2, C2604a aVar, ByteBuffer byteBuffer) {
            this.f8747a = i;
            this.f8748b = str;
            this.f8751e = d;
            this.f8752f = d2;
            this.f8749c = d3;
            this.f8750d = d4;
            this.f8753g = i2;
            this.f8754h = aVar;
            this.f8755i = byteBuffer;
        }
    }

    /* renamed from: m2.k$e */
    public static class C2605e {

        /* renamed from: a */
        public final int f8760a;

        /* renamed from: b */
        public final double f8761b;

        /* renamed from: c */
        public final double f8762c;

        public C2605e(int i, double d, double d2) {
            this.f8760a = i;
            this.f8761b = d;
            this.f8762c = d2;
        }
    }

    /* renamed from: m2.k$f */
    public static class C2606f {

        /* renamed from: a */
        public final int f8763a;

        /* renamed from: b */
        public final Number f8764b;

        /* renamed from: c */
        public final Number f8765c;

        /* renamed from: d */
        public final int f8766d;

        /* renamed from: e */
        public final int f8767e;

        /* renamed from: f */
        public final Object f8768f;

        /* renamed from: g */
        public final Object f8769g;

        /* renamed from: h */
        public final int f8770h;

        /* renamed from: i */
        public final int f8771i;

        /* renamed from: j */
        public final float f8772j;

        /* renamed from: k */
        public final float f8773k;

        /* renamed from: l */
        public final int f8774l;

        /* renamed from: m */
        public final int f8775m;

        /* renamed from: n */
        public final int f8776n;

        /* renamed from: o */
        public final int f8777o;

        /* renamed from: p */
        public final long f8778p;

        public C2606f(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f8763a = i;
            this.f8764b = number;
            this.f8765c = number2;
            this.f8766d = i2;
            this.f8767e = i3;
            this.f8768f = obj;
            this.f8769g = obj2;
            this.f8770h = i4;
            this.f8771i = i5;
            this.f8772j = f;
            this.f8773k = f2;
            this.f8774l = i6;
            this.f8775m = i7;
            this.f8776n = i8;
            this.f8777o = i9;
            this.f8778p = j;
        }
    }

    /* renamed from: m2.k$g */
    public interface C2607g {
        /* renamed from: a */
        void mo8553a(int i);

        /* renamed from: b */
        void mo8554b(boolean z);

        /* renamed from: c */
        void mo8555c(int i, double d, double d2);

        /* renamed from: d */
        void mo8556d(C2605e eVar, C2601b bVar);

        /* renamed from: e */
        void mo8557e(int i, int i2);

        /* renamed from: f */
        void mo8558f(C2606f fVar);

        /* renamed from: g */
        void mo8559g(C2603d dVar);

        /* renamed from: h */
        void mo8560h(int i);

        /* renamed from: i */
        long mo8561i(C2603d dVar);
    }

    public C2599k(C0008a aVar) {
        C2600a aVar2 = new C2600a();
        this.f8743c = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/platform_views", C2703q.f9016b);
        this.f8741a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m11829c(Exception exc) {
        return C3627b.m16090d(exc);
    }

    /* renamed from: d */
    public void mo9285d(int i) {
        C2689i iVar = this.f8741a;
        if (iVar != null) {
            iVar.mo9432c("viewFocused", Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public void mo9286e(C2607g gVar) {
        this.f8742b = gVar;
    }
}
