package hamza.dali.flutter_osm_plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.res.C0490h;
import androidx.core.graphics.drawable.C0519b;
import androidx.lifecycle.C0971b;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1003k;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.osmdroid.views.C2858a;
import org.osmdroid.views.C2875d;
import org.osmdroid.views.C2883f;
import p006a5.C0041b;
import p016c.C1279j;
import p034e3.C1769a;
import p034e3.C1780l;
import p034e3.C1784p;
import p040f2.C1910c;
import p041f3.C1920g;
import p041f3.C1924k;
import p041f3.C1925l;
import p041f3.C1932s;
import p041f3.C1936w;
import p052h0.C1999b;
import p063io.flutter.plugin.platform.C2249e;
import p063io.flutter.plugin.platform.C2250f;
import p081l4.C2491a;
import p081l4.C2492b;
import p091n2.C2679b;
import p091n2.C2688h;
import p091n2.C2689i;
import p091n2.C2696k;
import p092n3.C2724d0;
import p092n3.C2740g;
import p092n3.C2745h0;
import p092n3.C2753j0;
import p092n3.C2777o1;
import p092n3.C2799v0;
import p092n3.C2815z1;
import p093n4.C2816a;
import p093n4.C2817b;
import p093n4.C2821d;
import p093n4.C2822e;
import p099o4.C2856c;
import p105p4.C2954a;
import p105p4.C2956c;
import p111q4.C3036a;
import p111q4.C3037b;
import p111q4.C3039d;
import p126t1.C3153a;
import p126t1.C3156b;
import p126t1.C3157c;
import p126t1.C3158d;
import p126t1.C3159e;
import p126t1.C3160f;
import p126t1.C3163i;
import p126t1.C3164j;
import p127t2.C3172f;
import p127t2.C3177k;
import p127t2.C3181m;
import p127t2.C3187s;
import p135u4.C3376f;
import p138v1.C3395b;
import p138v1.C3405h;
import p138v1.C3409j;
import p138v1.C3411k;
import p138v1.C3412l;
import p138v1.C3413m;
import p138v1.C3414n;
import p145w2.C3443d;
import p145w2.C3448g;
import p147w4.C3457a;
import p147w4.C3472f;
import p150x1.C3523d;
import p156y1.C3556b;
import p156y1.C3558c;
import p156y1.C3559d;
import p156y1.C3561f;
import p157y2.C3563b;
import p157y2.C3567f;
import p157y2.C3573k;
import p159y4.C3586b;
import p159y4.C3589e;
import p159y4.C3590f;
import p159y4.C3593g;
import p159y4.C3599l;
import p159y4.C3601m;

public final class FlutterOsmView implements C1910c.C1911a, C2250f, C2689i.C2693c, C2696k, DefaultLifecycleObserver {

    /* renamed from: T */
    public static final C2029a f7103T = new C2029a((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final C3457a f7104U = new C3457a(85.0d, 180.0d, -85.0d, -180.0d);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C3409j f7105A;

    /* renamed from: B */
    private C2777o1 f7106B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2745h0 f7107C;

    /* renamed from: D */
    private boolean f7108D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C2689i.C2694d f7109E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C2689i f7110F;

    /* renamed from: G */
    private final C3172f f7111G = C3174h.m14049a(new C2067t(this));

    /* renamed from: H */
    private Activity f7112H;

    /* renamed from: I */
    private final C3172f f7113I = C3174h.m14049a(new C2065r(this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C2816a f7114J;

    /* renamed from: K */
    private double f7115K = 1.0d;

    /* renamed from: L */
    private double f7116L = 10.0d;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f7117M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f7118N;

    /* renamed from: O */
    private boolean f7119O;

    /* renamed from: P */
    private final C3172f f7120P = C3174h.m14049a(new C2037c0(this));

    /* renamed from: Q */
    private final C3172f f7121Q = C3174h.m14049a(new C2068u(this));

    /* renamed from: R */
    private FrameLayout f7122R;

    /* renamed from: S */
    private C3558c f7123S;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f7124d;

    /* renamed from: e */
    private final C2679b f7125e;

    /* renamed from: f */
    private final int f7126f;

    /* renamed from: g */
    private final C3163i f7127g;

    /* renamed from: h */
    private final String f7128h;

    /* renamed from: i */
    private final C3395b f7129i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final boolean f7130j;

    /* renamed from: k */
    private C2875d f7131k;

    /* renamed from: l */
    private String f7132l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3523d f7133m;

    /* renamed from: n */
    private Bitmap f7134n;

    /* renamed from: o */
    private Bitmap f7135o;

    /* renamed from: p */
    private Bitmap f7136p;

    /* renamed from: q */
    private Bitmap f7137q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public HashMap<String, Bitmap> f7138r = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final HashMap<String, List<C3472f>> f7139s = new HashMap<>();

    /* renamed from: t */
    private C3405h f7140t;

    /* renamed from: u */
    private final C3172f f7141u = C3174h.m14049a(C2064q.f7257e);

    /* renamed from: v */
    private final C3172f f7142v = C3174h.m14049a(C2063p.f7256e);

    /* renamed from: w */
    private final C3172f f7143w = C3174h.m14049a(C2059l.f7252e);

    /* renamed from: x */
    private final C3172f f7144x = C3174h.m14049a(C2061n.f7254e);

    /* renamed from: y */
    private final C3172f f7145y = C3174h.m14049a(C2062o.f7255e);

    /* renamed from: z */
    private final C3172f f7146z = C3174h.m14049a(C2060m.f7253e);

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$a */
    public static final class C2029a {
        private C2029a() {
        }

        public /* synthetic */ C2029a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C3457a mo7781a() {
            return FlutterOsmView.f7104U;
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$setCacheMap$1", mo11681f = "FlutterOsmView.kt", mo11682l = {702}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$a0 */
    static final class C2030a0 extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        Object f7147h;

        /* renamed from: i */
        Object f7148i;

        /* renamed from: j */
        Object f7149j;

        /* renamed from: k */
        int f7150k;

        /* renamed from: l */
        final /* synthetic */ C3559d f7151l;

        /* renamed from: m */
        final /* synthetic */ FlutterOsmView f7152m;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$setCacheMap$1$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$a0$a */
        static final class C2031a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7153h;

            /* renamed from: i */
            final /* synthetic */ C3559d f7154i;

            /* renamed from: j */
            final /* synthetic */ FlutterOsmView f7155j;

            /* renamed from: k */
            final /* synthetic */ C3472f f7156k;

            /* renamed from: l */
            final /* synthetic */ Bitmap f7157l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2031a(C3559d dVar, FlutterOsmView flutterOsmView, C3472f fVar, Bitmap bitmap, C3443d<? super C2031a> dVar2) {
                super(2, dVar2);
                this.f7154i = dVar;
                this.f7155j = flutterOsmView;
                this.f7156k = fVar;
                this.f7157l = bitmap;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2031a(this.f7154i, this.f7155j, this.f7156k, this.f7157l, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object unused = C3530d.m15553c();
                if (this.f7153h == 0) {
                    C3181m.m14059b(obj);
                    double G = this.f7154i.mo11640G(this.f7155j.mo7768F0());
                    FlutterOsmView flutterOsmView = this.f7155j;
                    C3472f fVar = this.f7156k;
                    C1924k.m9140f(fVar, "point");
                    FlutterOsmView.m9350Q(flutterOsmView, fVar, G, (Integer) null, this.f7157l, (String) null, false, 0.0d, 84, (Object) null);
                    return C3187s.f10561a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2031a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2030a0(C3559d dVar, FlutterOsmView flutterOsmView, C3443d<? super C2030a0> dVar2) {
            super(2, dVar2);
            this.f7151l = dVar;
            this.f7152m = flutterOsmView;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2030a0(this.f7151l, this.f7152m, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            C3559d dVar;
            C2030a0 a0Var;
            FlutterOsmView flutterOsmView;
            Iterator<Map.Entry<C3472f, byte[]>> it;
            Object c = C3530d.m15553c();
            int i = this.f7150k;
            if (i == 0) {
                C3181m.m14059b(obj);
                ArrayMap<C3472f, byte[]> q = this.f7151l.mo11657q();
                FlutterOsmView flutterOsmView2 = this.f7152m;
                C3559d dVar2 = this.f7151l;
                a0Var = this;
                flutterOsmView = flutterOsmView2;
                it = q.entrySet().iterator();
                dVar = dVar2;
            } else if (i == 1) {
                it = (Iterator) this.f7149j;
                C3181m.m14059b(obj);
                a0Var = this;
                dVar = (C3559d) this.f7148i;
                flutterOsmView = (FlutterOsmView) this.f7147h;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                Map.Entry next = it.next();
                C3472f fVar = (C3472f) next.getKey();
                byte[] bArr = (byte[]) next.getValue();
                Bitmap x = bArr != null ? flutterOsmView.m9409v0(bArr) : null;
                C2815z1 c2 = C2799v0.m12533c();
                C2031a aVar = new C2031a(dVar, flutterOsmView, fVar, x, (C3443d<? super C2031a>) null);
                a0Var.f7147h = flutterOsmView;
                a0Var.f7148i = dVar;
                a0Var.f7149j = it;
                a0Var.f7150k = 1;
                if (C2740g.m12356c(c2, aVar, a0Var) == c) {
                    return c;
                }
            }
            return C3187s.f10561a;
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2030a0) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$addMarkerManually$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$b */
    static final class C2032b extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7158h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7159i;

        /* renamed from: j */
        final /* synthetic */ C3472f f7160j;

        /* renamed from: k */
        final /* synthetic */ HashMap<?, ?> f7161k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2032b(FlutterOsmView flutterOsmView, C3472f fVar, HashMap<?, ?> hashMap, C3443d<? super C2032b> dVar) {
            super(2, dVar);
            this.f7159i = flutterOsmView;
            this.f7160j = fVar;
            this.f7161k = hashMap;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2032b(this.f7159i, this.f7160j, this.f7161k, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7158h == 0) {
                C3181m.m14059b(obj);
                C3559d K = this.f7159i.m9355S0();
                C3472f fVar = this.f7160j;
                Object obj2 = this.f7161k.get("icon");
                C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
                C3559d.m15680s(K, fVar, (byte[]) obj2, (C3472f) null, 4, (Object) null);
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2032b) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$setCacheMap$2", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$b0 */
    static final class C2033b0 extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7162h;

        /* renamed from: i */
        final /* synthetic */ C3559d f7163i;

        /* renamed from: j */
        final /* synthetic */ FlutterOsmView f7164j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2033b0(C3559d dVar, FlutterOsmView flutterOsmView, C3443d<? super C2033b0> dVar2) {
            super(2, dVar2);
            this.f7163i = dVar;
            this.f7164j = flutterOsmView;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2033b0(this.f7163i, this.f7164j, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7162h == 0) {
                C3181m.m14059b(obj);
                HashMap<String, byte[]> E = this.f7163i.mo11638E();
                FlutterOsmView flutterOsmView = this.f7164j;
                for (Map.Entry next : E.entrySet()) {
                    flutterOsmView.f7138r.put((String) next.getKey(), flutterOsmView.m9409v0((byte[]) next.getValue()));
                }
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2033b0) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$c */
    static final class C2034c extends C1925l implements C1780l<C3472f, C3187s> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7165e;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$cancelAdvancedSelection$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {1269}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$c$a */
        static final class C2035a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7166h;

            /* renamed from: i */
            final /* synthetic */ FlutterOsmView f7167i;

            /* renamed from: j */
            final /* synthetic */ C3472f f7168j;

            @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$cancelAdvancedSelection$1$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
            /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$c$a$a */
            static final class C2036a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

                /* renamed from: h */
                int f7169h;

                /* renamed from: i */
                final /* synthetic */ FlutterOsmView f7170i;

                /* renamed from: j */
                final /* synthetic */ C3472f f7171j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2036a(FlutterOsmView flutterOsmView, C3472f fVar, C3443d<? super C2036a> dVar) {
                    super(2, dVar);
                    this.f7170i = flutterOsmView;
                    this.f7171j = fVar;
                }

                /* renamed from: a */
                public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                    return new C2036a(this.f7170i, this.f7171j, dVar);
                }

                /* renamed from: t */
                public final Object mo3736t(Object obj) {
                    Object unused = C3530d.m15553c();
                    if (this.f7169h == 0) {
                        C3181m.m14059b(obj);
                        C2689i C = this.f7170i.f7110F;
                        if (C == null) {
                            C1924k.m9154t("methodChannel");
                            C = null;
                        }
                        C.mo9432c("receiveUserLocation", C3556b.m15675k(this.f7171j));
                        return C3187s.f10561a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: w */
                public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                    return ((C2036a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2035a(FlutterOsmView flutterOsmView, C3472f fVar, C3443d<? super C2035a> dVar) {
                super(2, dVar);
                this.f7167i = flutterOsmView;
                this.f7168j = fVar;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2035a(this.f7167i, this.f7168j, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object c = C3530d.m15553c();
                int i = this.f7166h;
                if (i == 0) {
                    C3181m.m14059b(obj);
                    C2815z1 c2 = C2799v0.m12533c();
                    C2036a aVar = new C2036a(this.f7167i, this.f7168j, (C3443d<? super C2036a>) null);
                    this.f7166h = 1;
                    if (C2740g.m12356c(c2, aVar, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C3181m.m14059b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C3187s.f10561a;
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2035a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2034c(FlutterOsmView flutterOsmView) {
            super(1);
            this.f7165e = flutterOsmView;
        }

        /* renamed from: a */
        public final void mo7786a(C3472f fVar) {
            C1924k.m9141g(fVar, "userLocation");
            C2745h0 E = this.f7165e.f7107C;
            if (E != null) {
                C2777o1 unused = C2744h.m12366b(E, (C3448g) null, (C2753j0) null, new C2035a(this.f7165e, fVar, (C3443d<? super C2035a>) null), 3, (Object) null);
            }
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo7786a((C3472f) obj);
            return C3187s.f10561a;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$c0 */
    static final class C2037c0 extends C1925l implements C1769a<C3589e> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7172e;

        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$c0$a */
        public static final class C2038a implements C3036a {

            /* renamed from: a */
            final /* synthetic */ FlutterOsmView f7173a;

            C2038a(FlutterOsmView flutterOsmView) {
                this.f7173a = flutterOsmView;
            }

            /* renamed from: a */
            public boolean mo7790a(C3472f fVar) {
                C2689i C = this.f7173a.f7110F;
                if (C == null) {
                    C1924k.m9154t("methodChannel");
                    C = null;
                }
                C1924k.m9138d(fVar);
                C.mo9432c("receiveSinglePress", C3556b.m15675k(fVar));
                return true;
            }

            /* renamed from: b */
            public boolean mo7791b(C3472f fVar) {
                C2689i C = this.f7173a.f7110F;
                if (C == null) {
                    C1924k.m9154t("methodChannel");
                    C = null;
                }
                C1924k.m9138d(fVar);
                C.mo9432c("receiveLongPress", C3556b.m15675k(fVar));
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2037c0(FlutterOsmView flutterOsmView) {
            super(0);
            this.f7172e = flutterOsmView;
        }

        /* renamed from: a */
        public final C3589e mo3839c() {
            return new C3589e(new C2038a(this.f7172e));
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$changePositionMarker$icon$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$d */
    static final class C2039d extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7174h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7175i;

        /* renamed from: j */
        final /* synthetic */ C3472f f7176j;

        /* renamed from: k */
        final /* synthetic */ byte[] f7177k;

        /* renamed from: l */
        final /* synthetic */ C3472f f7178l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2039d(FlutterOsmView flutterOsmView, C3472f fVar, byte[] bArr, C3472f fVar2, C3443d<? super C2039d> dVar) {
            super(2, dVar);
            this.f7175i = flutterOsmView;
            this.f7176j = fVar;
            this.f7177k = bArr;
            this.f7178l = fVar2;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2039d(this.f7175i, this.f7176j, this.f7177k, this.f7178l, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7174h == 0) {
                C3181m.m14059b(obj);
                this.f7175i.m9355S0().mo11658r(this.f7176j, this.f7177k, this.f7178l);
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2039d) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$staticPosition$2", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$d0 */
    static final class C2040d0 extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7179h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7180i;

        /* renamed from: j */
        final /* synthetic */ String f7181j;

        /* renamed from: k */
        final /* synthetic */ List<C3472f> f7182k;

        /* renamed from: l */
        final /* synthetic */ List<Double> f7183l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2040d0(FlutterOsmView flutterOsmView, String str, List<C3472f> list, List<Double> list2, C3443d<? super C2040d0> dVar) {
            super(2, dVar);
            this.f7180i = flutterOsmView;
            this.f7181j = str;
            this.f7182k = list;
            this.f7183l = list2;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2040d0(this.f7180i, this.f7181j, this.f7182k, this.f7183l, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7179h == 0) {
                C3181m.m14059b(obj);
                this.f7180i.m9355S0().mo11642b(this.f7181j, new C3177k(C3271t.m14398M(this.f7182k), C3271t.m14398M(this.f7183l)));
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2040d0) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$e */
    public static final class C2041e implements C3409j.C3410a {

        /* renamed from: a */
        final /* synthetic */ FlutterOsmView f7184a;

        C2041e(FlutterOsmView flutterOsmView) {
            this.f7184a = flutterOsmView;
        }

        /* renamed from: a */
        public void mo7794a(C3409j jVar, C3472f fVar) {
            List list;
            List<C3472f> Q;
            C1924k.m9141g(jVar, "road");
            C1924k.m9141g(fVar, "geoPointClicked");
            HashMap hashMap = new HashMap();
            C3601m K = jVar.mo11287K();
            if (K == null || (Q = K.mo11824Q()) == null) {
                list = C3263l.m14369f();
            } else {
                list = new ArrayList(C3264m.m14377n(Q, 10));
                for (C3472f next : Q) {
                    C1924k.m9140f(next, "it");
                    list.add(C3556b.m15675k(next));
                }
            }
            hashMap.put("roadPoints", list);
            hashMap.put("distance", Double.valueOf(jVar.mo11288L()));
            hashMap.put("duration", Double.valueOf(jVar.mo11289M()));
            hashMap.put("key", jVar.mo11286J());
            C2689i C = this.f7184a.f7110F;
            if (C == null) {
                C1924k.m9154t("methodChannel");
                C = null;
            }
            C.mo9432c("receiveRoad", hashMap);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$staticPositionIconMaker$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$e0 */
    static final class C2042e0 extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7185h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7186i;

        /* renamed from: j */
        final /* synthetic */ String f7187j;

        /* renamed from: k */
        final /* synthetic */ boolean f7188k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2042e0(FlutterOsmView flutterOsmView, String str, boolean z, C3443d<? super C2042e0> dVar) {
            super(2, dVar);
            this.f7186i = flutterOsmView;
            this.f7187j = str;
            this.f7188k = z;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2042e0(this.f7186i, this.f7187j, this.f7188k, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7185h == 0) {
                C3181m.m14059b(obj);
                if (this.f7186i.f7139s.containsKey(this.f7187j) && this.f7188k) {
                    FlutterOsmView flutterOsmView = this.f7186i;
                    String str = this.f7187j;
                    C3177k<List<C3472f>, List<Double>> kVar = flutterOsmView.m9355S0().mo11637D().get(this.f7187j);
                    C1924k.m9138d(kVar);
                    flutterOsmView.m9384i1(str, (List) kVar.mo10543d());
                }
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2042e0) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$deleteMarker$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$f */
    static final class C2043f extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7189h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7190i;

        /* renamed from: j */
        final /* synthetic */ List<C3405h> f7191j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2043f(FlutterOsmView flutterOsmView, List<? extends C3405h> list, C3443d<? super C2043f> dVar) {
            super(2, dVar);
            this.f7190i = flutterOsmView;
            this.f7191j = list;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2043f(this.f7190i, this.f7191j, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7189h == 0) {
                C3181m.m14059b(obj);
                C3559d K = this.f7190i.m9355S0();
                List<C3405h> list = this.f7191j;
                ArrayList arrayList = new ArrayList(C3264m.m14377n(list, 10));
                for (C3405h N : list) {
                    arrayList.add(N.mo11786N());
                }
                K.mo11659t(arrayList);
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2043f) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$f0 */
    static final class C2044f0 extends C1925l implements C1780l<C3472f, C3187s> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7192e;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$trackUserLocation$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {1133}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$f0$a */
        static final class C2045a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7193h;

            /* renamed from: i */
            final /* synthetic */ FlutterOsmView f7194i;

            /* renamed from: j */
            final /* synthetic */ C3472f f7195j;

            @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$trackUserLocation$1$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
            /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$f0$a$a */
            static final class C2046a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

                /* renamed from: h */
                int f7196h;

                /* renamed from: i */
                final /* synthetic */ FlutterOsmView f7197i;

                /* renamed from: j */
                final /* synthetic */ C3472f f7198j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2046a(FlutterOsmView flutterOsmView, C3472f fVar, C3443d<? super C2046a> dVar) {
                    super(2, dVar);
                    this.f7197i = flutterOsmView;
                    this.f7198j = fVar;
                }

                /* renamed from: a */
                public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                    return new C2046a(this.f7197i, this.f7198j, dVar);
                }

                /* renamed from: t */
                public final Object mo3736t(Object obj) {
                    Object unused = C3530d.m15553c();
                    if (this.f7196h == 0) {
                        C3181m.m14059b(obj);
                        C2689i C = this.f7197i.f7110F;
                        if (C == null) {
                            C1924k.m9154t("methodChannel");
                            C = null;
                        }
                        C.mo9432c("receiveUserLocation", C3556b.m15675k(this.f7198j));
                        return C3187s.f10561a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: w */
                public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                    return ((C2046a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2045a(FlutterOsmView flutterOsmView, C3472f fVar, C3443d<? super C2045a> dVar) {
                super(2, dVar);
                this.f7194i = flutterOsmView;
                this.f7195j = fVar;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2045a(this.f7194i, this.f7195j, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object c = C3530d.m15553c();
                int i = this.f7193h;
                if (i == 0) {
                    C3181m.m14059b(obj);
                    C2815z1 c2 = C2799v0.m12533c();
                    C2046a aVar = new C2046a(this.f7194i, this.f7195j, (C3443d<? super C2046a>) null);
                    this.f7193h = 1;
                    if (C2740g.m12356c(c2, aVar, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C3181m.m14059b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C3187s.f10561a;
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2045a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2044f0(FlutterOsmView flutterOsmView) {
            super(1);
            this.f7192e = flutterOsmView;
        }

        /* renamed from: a */
        public final void mo7797a(C3472f fVar) {
            C1924k.m9141g(fVar, "userLocation");
            C2745h0 E = this.f7192e.f7107C;
            if (E != null) {
                C2777o1 unused = C2744h.m12366b(E, (C3448g) null, (C2753j0) null, new C2045a(this.f7192e, fVar, (C3443d<? super C2045a>) null), 3, (Object) null);
            }
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo7797a((C3472f) obj);
            return C3187s.f10561a;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$g */
    static final class C2047g extends C1925l implements C1780l<C3593g, Boolean> {

        /* renamed from: e */
        final /* synthetic */ String f7199e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2047g(String str) {
            super(1);
            this.f7199e = str;
        }

        /* renamed from: a */
        public final Boolean mo3836n(C3593g gVar) {
            return Boolean.valueOf((gVar instanceof C3599l) && C1924k.m9136b(((C3599l) gVar).mo11811C(), this.f7199e));
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$updateMarker$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$g0 */
    static final class C2048g0 extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7200h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7201i;

        /* renamed from: j */
        final /* synthetic */ C3472f f7202j;

        /* renamed from: k */
        final /* synthetic */ HashMap<?, ?> f7203k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2048g0(FlutterOsmView flutterOsmView, C3472f fVar, HashMap<?, ?> hashMap, C3443d<? super C2048g0> dVar) {
            super(2, dVar);
            this.f7201i = flutterOsmView;
            this.f7202j = fVar;
            this.f7203k = hashMap;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2048g0(this.f7201i, this.f7202j, this.f7203k, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7200h == 0) {
                C3181m.m14059b(obj);
                C3559d K = this.f7201i.m9355S0();
                C3472f fVar = this.f7202j;
                Object obj2 = this.f7203k.get("icon");
                C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
                C3559d.m15680s(K, fVar, (byte[]) obj2, (C3472f) null, 4, (Object) null);
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2048g0) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawMultiRoad$2", mo11681f = "FlutterOsmView.kt", mo11682l = {1428, 1493}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$h */
    static final class C2049h extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7204h;

        /* renamed from: i */
        final /* synthetic */ List<C3411k> f7205i;

        /* renamed from: j */
        final /* synthetic */ FlutterOsmView f7206j;

        /* renamed from: k */
        final /* synthetic */ List<HashMap<String, Object>> f7207k;

        /* renamed from: l */
        final /* synthetic */ C2689i.C2694d f7208l;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawMultiRoad$2$1", mo11681f = "FlutterOsmView.kt", mo11682l = {1436, 1448, 1487}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a */
        static final class C2050a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            Object f7209h;

            /* renamed from: i */
            Object f7210i;

            /* renamed from: j */
            Object f7211j;

            /* renamed from: k */
            Object f7212k;

            /* renamed from: l */
            Object f7213l;

            /* renamed from: m */
            Object f7214m;

            /* renamed from: n */
            int f7215n;

            /* renamed from: o */
            final /* synthetic */ List<C3411k> f7216o;

            /* renamed from: p */
            final /* synthetic */ FlutterOsmView f7217p;

            /* renamed from: q */
            final /* synthetic */ List<HashMap<String, Object>> f7218q;

            @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawMultiRoad$2$1$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
            /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$a */
            static final class C2051a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

                /* renamed from: h */
                int f7219h;

                /* renamed from: i */
                final /* synthetic */ FlutterOsmView f7220i;

                /* renamed from: j */
                final /* synthetic */ C3411k f7221j;

                /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$a$a */
                static final class C2052a extends C1925l implements C1780l<C3593g, Boolean> {

                    /* renamed from: e */
                    final /* synthetic */ C3411k f7222e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2052a(C3411k kVar) {
                        super(1);
                        this.f7222e = kVar;
                    }

                    /* renamed from: a */
                    public final Boolean mo3836n(C3593g gVar) {
                        boolean z = gVar instanceof C3405h;
                        return Boolean.valueOf((z && this.f7222e.mo11296e().contains(((C3405h) gVar).mo11786N())) || (z && this.f7222e.mo11292a().contains(((C3405h) gVar).mo11786N())));
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2051a(FlutterOsmView flutterOsmView, C3411k kVar, C3443d<? super C2051a> dVar) {
                    super(2, dVar);
                    this.f7220i = flutterOsmView;
                    this.f7221j = kVar;
                }

                /* renamed from: a */
                public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                    return new C2051a(this.f7220i, this.f7221j, dVar);
                }

                /* renamed from: t */
                public final Object mo3736t(Object obj) {
                    Object unused = C3530d.m15553c();
                    if (this.f7219h == 0) {
                        C3181m.m14059b(obj);
                        List<C3593g> C = this.f7220i.m9415y0().mo11755C();
                        C1924k.m9140f(C, "folderMarkers.items");
                        boolean unused2 = C3268q.m14383t(C, new C2052a(this.f7221j));
                        this.f7220i.m9355S0().mo11659t(this.f7221j.mo11296e());
                        return C3187s.f10561a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: w */
                public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                    return ((C2051a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
                }
            }

            @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawMultiRoad$2$1$1$2", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
            /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$b */
            static final class C2053b extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

                /* renamed from: h */
                int f7223h;

                /* renamed from: i */
                final /* synthetic */ C2817b f7224i;

                /* renamed from: j */
                final /* synthetic */ C1932s<String> f7225j;

                /* renamed from: k */
                final /* synthetic */ C3411k f7226k;

                /* renamed from: l */
                final /* synthetic */ FlutterOsmView f7227l;

                /* renamed from: m */
                final /* synthetic */ List<HashMap<String, Object>> f7228m;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2053b(C2817b bVar, C1932s<String> sVar, C3411k kVar, FlutterOsmView flutterOsmView, List<HashMap<String, Object>> list, C3443d<? super C2053b> dVar) {
                    super(2, dVar);
                    this.f7224i = bVar;
                    this.f7225j = sVar;
                    this.f7226k = kVar;
                    this.f7227l = flutterOsmView;
                    this.f7228m = list;
                }

                /* renamed from: a */
                public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                    return new C2053b(this.f7224i, this.f7225j, this.f7226k, this.f7227l, this.f7228m, dVar);
                }

                /* renamed from: t */
                public final Object mo3736t(Object obj) {
                    Object unused = C3530d.m15553c();
                    if (this.f7223h == 0) {
                        C3181m.m14059b(obj);
                        if (this.f7224i.f9134i.size() > 2) {
                            C1932s<String> sVar = this.f7225j;
                            T b = C2856c.m12939b(this.f7224i.f9134i, 10);
                            C1924k.m9140f(b, "encode(road.mRouteHigh, 10)");
                            sVar.f6903d = b;
                            C3601m a = C2821d.m12659a(this.f7224i);
                            Integer a2 = this.f7226k.mo11295d().mo11305a();
                            float b2 = this.f7226k.mo11295d().mo11306b();
                            Integer c = this.f7226k.mo11295d().mo11307c();
                            int intValue = c != null ? c.intValue() : -16711936;
                            float d = this.f7226k.mo11295d().mo11308d();
                            C1924k.m9140f(a, "polyLine");
                            C3556b.m15671g(a, intValue, d, a2, b2);
                            String c2 = this.f7226k.mo11294c();
                            C2817b bVar = this.f7224i;
                            C3409j unused2 = this.f7227l.m9380g0(c2, a, bVar.f9131f, bVar.f9130e);
                            ArrayList<C2822e> arrayList = this.f7224i.f9132g;
                            C1924k.m9140f(arrayList, "road.mNodes");
                            List<C3413m> d2 = C3414n.m15045d(arrayList);
                            C3559d K = this.f7227l.m9355S0();
                            ArrayList<C3472f> arrayList2 = this.f7224i.f9134i;
                            Integer c3 = this.f7226k.mo11295d().mo11307c();
                            float d3 = this.f7226k.mo11295d().mo11308d();
                            Integer a3 = this.f7226k.mo11295d().mo11305a();
                            float b3 = this.f7226k.mo11295d().mo11306b();
                            String c4 = this.f7226k.mo11294c();
                            C2817b bVar2 = this.f7224i;
                            double d4 = bVar2.f9131f;
                            double d5 = bVar2.f9130e;
                            C1924k.m9140f(arrayList2, "mRouteHigh");
                            K.mo11646f(new C3561f(arrayList2, c3, a3, d3, b3, c4, d4, d5, d2));
                            List<HashMap<String, Object>> list = this.f7228m;
                            C2817b bVar3 = this.f7224i;
                            C1924k.m9140f(bVar3, "road");
                            list.add(C3556b.m15676l(bVar3, this.f7226k.mo11294c(), (String) this.f7225j.f6903d, d2));
                        }
                        return C3187s.f10561a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: w */
                public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                    return ((C2053b) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2050a(List<C3411k> list, FlutterOsmView flutterOsmView, List<HashMap<String, Object>> list2, C3443d<? super C2050a> dVar) {
                super(2, dVar);
                this.f7216o = list;
                this.f7217p = flutterOsmView;
                this.f7218q = list2;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2050a(this.f7216o, this.f7217p, this.f7218q, dVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
                r9 = r2.f7217p;
                r8 = r2.f7218q;
                r7.mo9611j(r10.mo11293b());
                r12 = new p041f3.C1932s();
                r12.f6903d = "";
                r13 = p092n3.C2799v0.m12533c();
                r14 = new hamza.dali.flutter_osm_plugin.FlutterOsmView.C2049h.C2050a.C2051a(r9, r10, (p145w2.C3443d<? super hamza.dali.flutter_osm_plugin.FlutterOsmView.C2049h.C2050a.C2051a>) null);
                r2.f7209h = r11;
                r2.f7210i = r10;
                r2.f7211j = r9;
                r2.f7212k = r8;
                r2.f7213l = r7;
                r2.f7214m = r12;
                r2.f7215n = r5 ? 1 : 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bd, code lost:
                if (p092n3.C2740g.m12356c(r13, r14, r2) != r1) goto L_0x00c0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bf, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c0, code lost:
                r14 = r11;
                r11 = r9;
                r9 = r12;
                r12 = r8;
             */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0114  */
            /* renamed from: t */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo3736t(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Object r1 = p151x2.C3530d.m15553c()
                    int r2 = r0.f7215n
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L_0x0054
                    if (r2 == r5) goto L_0x0032
                    if (r2 == r4) goto L_0x0027
                    if (r2 != r3) goto L_0x001f
                    java.lang.Object r2 = r0.f7209h
                    java.util.Iterator r2 = (java.util.Iterator) r2
                    p127t2.C3181m.m14059b(r18)
                    r11 = r2
                    r2 = r0
                    goto L_0x0115
                L_0x001f:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0027:
                    java.lang.Object r2 = r0.f7209h
                    java.util.Iterator r2 = (java.util.Iterator) r2
                    p127t2.C3181m.m14059b(r18)
                    r14 = r2
                    r2 = r0
                    goto L_0x0107
                L_0x0032:
                    java.lang.Object r2 = r0.f7214m
                    f3.s r2 = (p041f3.C1932s) r2
                    java.lang.Object r7 = r0.f7213l
                    n4.a r7 = (p093n4.C2816a) r7
                    java.lang.Object r8 = r0.f7212k
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Object r9 = r0.f7211j
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r9 = (hamza.dali.flutter_osm_plugin.FlutterOsmView) r9
                    java.lang.Object r10 = r0.f7210i
                    v1.k r10 = (p138v1.C3411k) r10
                    java.lang.Object r11 = r0.f7209h
                    java.util.Iterator r11 = (java.util.Iterator) r11
                    p127t2.C3181m.m14059b(r18)
                    r12 = r8
                    r14 = r11
                    r11 = r9
                    r9 = r2
                    r2 = r0
                    goto L_0x00c4
                L_0x0054:
                    p127t2.C3181m.m14059b(r18)
                    java.util.List<v1.k> r2 = r0.f7216o
                    java.util.Iterator r2 = r2.iterator()
                    r11 = r2
                    r2 = r0
                L_0x005f:
                    boolean r7 = r11.hasNext()
                    if (r7 == 0) goto L_0x0118
                    java.lang.Object r7 = r11.next()
                    r10 = r7
                    v1.k r10 = (p138v1.C3411k) r10
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r7 = r2.f7217p
                    n4.a r7 = r7.f7114J
                    if (r7 != 0) goto L_0x0086
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r7 = r2.f7217p
                    n4.a r8 = new n4.a
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r9 = r2.f7217p
                    android.content.Context r9 = r9.f7124d
                    java.lang.String r12 = "json/application"
                    r8.<init>(r9, r12)
                    r7.f7114J = r8
                L_0x0086:
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r7 = r2.f7217p
                    n4.a r7 = r7.f7114J
                    if (r7 == 0) goto L_0x005f
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r9 = r2.f7217p
                    java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> r8 = r2.f7218q
                    java.lang.String r12 = r10.mo11293b()
                    r7.mo9611j(r12)
                    f3.s r12 = new f3.s
                    r12.<init>()
                    java.lang.String r13 = ""
                    r12.f6903d = r13
                    n3.z1 r13 = p092n3.C2799v0.m12533c()
                    hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$a r14 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$a
                    r14.<init>(r9, r10, r6)
                    r2.f7209h = r11
                    r2.f7210i = r10
                    r2.f7211j = r9
                    r2.f7212k = r8
                    r2.f7213l = r7
                    r2.f7214m = r12
                    r2.f7215n = r5
                    java.lang.Object r13 = p092n3.C2740g.m12356c(r13, r14, r2)
                    if (r13 != r1) goto L_0x00c0
                    return r1
                L_0x00c0:
                    r14 = r11
                    r11 = r9
                    r9 = r12
                    r12 = r8
                L_0x00c4:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    java.util.List r13 = r10.mo11296e()
                    r8.<init>(r13)
                    java.util.List r13 = r10.mo11292a()
                    boolean r13 = r13.isEmpty()
                    r13 = r13 ^ r5
                    if (r13 == 0) goto L_0x00df
                    java.util.List r13 = r10.mo11292a()
                    r8.addAll(r5, r13)
                L_0x00df:
                    n4.b r8 = r7.mo9608g(r8)
                    n3.z1 r15 = p092n3.C2799v0.m12533c()
                    hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$b r13 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$h$a$b
                    r16 = 0
                    r7 = r13
                    r5 = r13
                    r13 = r16
                    r7.<init>(r8, r9, r10, r11, r12, r13)
                    r2.f7209h = r14
                    r2.f7210i = r6
                    r2.f7211j = r6
                    r2.f7212k = r6
                    r2.f7213l = r6
                    r2.f7214m = r6
                    r2.f7215n = r4
                    java.lang.Object r5 = p092n3.C2740g.m12356c(r15, r5, r2)
                    if (r5 != r1) goto L_0x0107
                    return r1
                L_0x0107:
                    r7 = 100
                    r2.f7209h = r14
                    r2.f7215n = r3
                    java.lang.Object r5 = p092n3.C2781p0.m12485a(r7, r2)
                    if (r5 != r1) goto L_0x0114
                    return r1
                L_0x0114:
                    r11 = r14
                L_0x0115:
                    r5 = 1
                    goto L_0x005f
                L_0x0118:
                    t2.s r1 = p127t2.C3187s.f10561a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.C2049h.C2050a.mo3736t(java.lang.Object):java.lang.Object");
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2050a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawMultiRoad$2$2", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$h$b */
        static final class C2054b extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7229h;

            /* renamed from: i */
            final /* synthetic */ FlutterOsmView f7230i;

            /* renamed from: j */
            final /* synthetic */ C2689i.C2694d f7231j;

            /* renamed from: k */
            final /* synthetic */ List<HashMap<String, Object>> f7232k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2054b(FlutterOsmView flutterOsmView, C2689i.C2694d dVar, List<HashMap<String, Object>> list, C3443d<? super C2054b> dVar2) {
                super(2, dVar2);
                this.f7230i = flutterOsmView;
                this.f7231j = dVar;
                this.f7232k = list;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2054b(this.f7230i, this.f7231j, this.f7232k, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object unused = C3530d.m15553c();
                if (this.f7229h == 0) {
                    C3181m.m14059b(obj);
                    C2875d H0 = this.f7230i.mo7769H0();
                    C1924k.m9138d(H0);
                    H0.invalidate();
                    this.f7231j.mo9291b(C3271t.m14398M(this.f7232k));
                    return C3187s.f10561a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2054b) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2049h(List<C3411k> list, FlutterOsmView flutterOsmView, List<HashMap<String, Object>> list2, C2689i.C2694d dVar, C3443d<? super C2049h> dVar2) {
            super(2, dVar2);
            this.f7205i = list;
            this.f7206j = flutterOsmView;
            this.f7207k = list2;
            this.f7208l = dVar;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2049h(this.f7205i, this.f7206j, this.f7207k, this.f7208l, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object c = C3530d.m15553c();
            int i = this.f7204h;
            if (i == 0) {
                C3181m.m14059b(obj);
                C2724d0 b = C2799v0.m12532b();
                C2050a aVar = new C2050a(this.f7205i, this.f7206j, this.f7207k, (C3443d<? super C2050a>) null);
                this.f7204h = 1;
                if (C2740g.m12356c(b, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C3181m.m14059b(obj);
            } else if (i == 2) {
                C3181m.m14059b(obj);
                return C3187s.f10561a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2815z1 c2 = C2799v0.m12533c();
            C2054b bVar = new C2054b(this.f7206j, this.f7208l, this.f7207k, (C3443d<? super C2054b>) null);
            this.f7204h = 2;
            if (C2740g.m12356c(c2, bVar, this) == c) {
                return c;
            }
            return C3187s.f10561a;
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2049h) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$i */
    static final class C2055i extends C1925l implements C1780l<C3593g, Boolean> {

        /* renamed from: e */
        final /* synthetic */ String f7233e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2055i(String str) {
            super(1);
            this.f7233e = str;
        }

        /* renamed from: a */
        public final Boolean mo3836n(C3593g gVar) {
            return Boolean.valueOf((gVar instanceof C3599l) && C1924k.m9136b(((C3599l) gVar).mo11811C(), this.f7233e));
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawRoad$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {1572}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$j */
    static final class C2056j extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7234h;

        /* renamed from: i */
        final /* synthetic */ C3411k f7235i;

        /* renamed from: j */
        final /* synthetic */ C2816a f7236j;

        /* renamed from: k */
        final /* synthetic */ C1932s<String> f7237k;

        /* renamed from: l */
        final /* synthetic */ FlutterOsmView f7238l;

        /* renamed from: m */
        final /* synthetic */ C1932s<List<C3413m>> f7239m;

        /* renamed from: n */
        final /* synthetic */ boolean f7240n;

        /* renamed from: o */
        final /* synthetic */ C2689i.C2694d f7241o;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$drawRoad$1$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$j$a */
        static final class C2057a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7242h;

            /* renamed from: i */
            final /* synthetic */ C2817b f7243i;

            /* renamed from: j */
            final /* synthetic */ C1932s<String> f7244j;

            /* renamed from: k */
            final /* synthetic */ FlutterOsmView f7245k;

            /* renamed from: l */
            final /* synthetic */ C3411k f7246l;

            /* renamed from: m */
            final /* synthetic */ C1932s<List<C3413m>> f7247m;

            /* renamed from: n */
            final /* synthetic */ boolean f7248n;

            /* renamed from: o */
            final /* synthetic */ C2689i.C2694d f7249o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2057a(C2817b bVar, C1932s<String> sVar, FlutterOsmView flutterOsmView, C3411k kVar, C1932s<List<C3413m>> sVar2, boolean z, C2689i.C2694d dVar, C3443d<? super C2057a> dVar2) {
                super(2, dVar2);
                this.f7243i = bVar;
                this.f7244j = sVar;
                this.f7245k = flutterOsmView;
                this.f7246l = kVar;
                this.f7247m = sVar2;
                this.f7248n = z;
                this.f7249o = dVar;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2057a(this.f7243i, this.f7244j, this.f7245k, this.f7246l, this.f7247m, this.f7248n, this.f7249o, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object unused = C3530d.m15553c();
                if (this.f7242h == 0) {
                    C3181m.m14059b(obj);
                    if (this.f7243i.f9134i.size() > 2) {
                        C1932s<String> sVar = this.f7244j;
                        T b = C2856c.m12939b(this.f7243i.f9134i, 10);
                        C1924k.m9140f(b, "encode(road.mRouteHigh, 10)");
                        sVar.f6903d = b;
                        C2875d H0 = this.f7245k.mo7769H0();
                        C1924k.m9138d(H0);
                        C3601m mVar = new C3601m(H0, false, false);
                        C3411k kVar = this.f7246l;
                        C2817b bVar = this.f7243i;
                        Integer a = kVar.mo11295d().mo11305a();
                        float b2 = kVar.mo11295d().mo11306b();
                        Integer c = kVar.mo11295d().mo11307c();
                        int i = -16711936;
                        C3556b.m15671g(mVar, c != null ? c.intValue() : -16711936, kVar.mo11295d().mo11308d(), a, b2);
                        mVar.mo11831a0(C2821d.m12659a(bVar).mo11824Q());
                        FlutterOsmView flutterOsmView = this.f7245k;
                        String c2 = this.f7246l.mo11294c();
                        C2817b bVar2 = this.f7243i;
                        flutterOsmView.f7105A = this.f7245k.m9380g0(c2, mVar, bVar2.f9131f, bVar2.f9130e);
                        C1932s<List<C3413m>> sVar2 = this.f7247m;
                        ArrayList<C2822e> arrayList = this.f7243i.f9132g;
                        C1924k.m9140f(arrayList, "road.mNodes");
                        sVar2.f6903d = C3414n.m15045d(arrayList);
                        C3559d K = this.f7245k.m9355S0();
                        ArrayList<C3472f> arrayList2 = this.f7243i.f9134i;
                        Integer c3 = this.f7246l.mo11295d().mo11307c();
                        if (c3 != null) {
                            i = c3.intValue();
                        }
                        float d = this.f7246l.mo11295d().mo11308d();
                        float b3 = this.f7246l.mo11295d().mo11306b();
                        Integer a2 = this.f7246l.mo11295d().mo11305a();
                        String c4 = this.f7246l.mo11294c();
                        C2817b bVar3 = this.f7243i;
                        double d2 = bVar3.f9131f;
                        double d3 = bVar3.f9130e;
                        C1924k.m9140f(arrayList2, "mRouteHigh");
                        K.mo11648h(new C3561f(arrayList2, C3563b.m15729b(i), a2, d, b3, c4, d2, d3, (List) this.f7247m.f6903d));
                        if (this.f7248n) {
                            C2875d H02 = this.f7245k.mo7769H0();
                            C1924k.m9138d(H02);
                            H02.mo9892U(C3457a.m15177e(this.f7243i.f9134i), true, 64);
                        }
                        C2875d H03 = this.f7245k.mo7769H0();
                        C1924k.m9138d(H03);
                        H03.invalidate();
                    }
                    C2689i.C2694d dVar = this.f7249o;
                    C2817b bVar4 = this.f7243i;
                    C1924k.m9140f(bVar4, "road");
                    dVar.mo9291b(C3556b.m15676l(bVar4, this.f7246l.mo11294c(), (String) this.f7244j.f6903d, (List) this.f7247m.f6903d));
                    return C3187s.f10561a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2057a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2056j(C3411k kVar, C2816a aVar, C1932s<String> sVar, FlutterOsmView flutterOsmView, C1932s<List<C3413m>> sVar2, boolean z, C2689i.C2694d dVar, C3443d<? super C2056j> dVar2) {
            super(2, dVar2);
            this.f7235i = kVar;
            this.f7236j = aVar;
            this.f7237k = sVar;
            this.f7238l = flutterOsmView;
            this.f7239m = sVar2;
            this.f7240n = z;
            this.f7241o = dVar;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2056j(this.f7235i, this.f7236j, this.f7237k, this.f7238l, this.f7239m, this.f7240n, this.f7241o, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object c = C3530d.m15553c();
            int i = this.f7234h;
            if (i == 0) {
                C3181m.m14059b(obj);
                ArrayList arrayList = new ArrayList(this.f7235i.mo11296e());
                if (!this.f7235i.mo11292a().isEmpty()) {
                    arrayList.addAll(1, this.f7235i.mo11292a());
                }
                C2817b g = this.f7236j.mo9608g(arrayList);
                C2815z1 c2 = C2799v0.m12533c();
                C2057a aVar = new C2057a(g, this.f7237k, this.f7238l, this.f7235i, this.f7239m, this.f7240n, this.f7241o, (C3443d<? super C2057a>) null);
                this.f7234h = 1;
                if (C2740g.m12356c(c2, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C3181m.m14059b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C3187s.f10561a;
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2056j) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$enableUserLocation$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$k */
    static final class C2058k extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7250h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7251i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2058k(FlutterOsmView flutterOsmView, C3443d<? super C2058k> dVar) {
            super(2, dVar);
            this.f7251i = flutterOsmView;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2058k(this.f7251i, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7250h == 0) {
                C3181m.m14059b(obj);
                C3523d B = this.f7251i.f7133m;
                if (B == null) {
                    C1924k.m9154t("locationNewOverlay");
                    B = null;
                }
                C3472f fVar = new C3472f(B.mo7309I());
                C2875d H0 = this.f7251i.mo7769H0();
                C1924k.m9138d(H0);
                H0.getController().mo9104e(fVar);
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2058k) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$l */
    static final class C2059l extends C1925l implements C1769a<C3586b> {

        /* renamed from: e */
        public static final C2059l f7252e = new C2059l();

        C2059l() {
            super(0);
        }

        /* renamed from: a */
        public final C3586b mo3839c() {
            C3586b bVar = new C3586b();
            bVar.mo11758G("static_circles");
            return bVar;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$m */
    static final class C2060m extends C1925l implements C1769a<C3586b> {

        /* renamed from: e */
        public static final C2060m f7253e = new C2060m();

        C2060m() {
            super(0);
        }

        /* renamed from: a */
        public final C3586b mo3839c() {
            C3586b bVar = new C3586b();
            bVar.mo11758G("Markers");
            return bVar;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$n */
    static final class C2061n extends C1925l implements C1769a<C3586b> {

        /* renamed from: e */
        public static final C2061n f7254e = new C2061n();

        C2061n() {
            super(0);
        }

        /* renamed from: a */
        public final C3586b mo3839c() {
            C3586b bVar = new C3586b();
            bVar.mo11758G("static_regions");
            return bVar;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$o */
    static final class C2062o extends C1925l implements C1769a<C3586b> {

        /* renamed from: e */
        public static final C2062o f7255e = new C2062o();

        C2062o() {
            super(0);
        }

        /* renamed from: a */
        public final C3586b mo3839c() {
            C3586b bVar = new C3586b();
            bVar.mo11758G("Dynamic-Road");
            return bVar;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$p */
    static final class C2063p extends C1925l implements C1769a<C3586b> {

        /* renamed from: e */
        public static final C2063p f7256e = new C2063p();

        C2063p() {
            super(0);
        }

        /* renamed from: a */
        public final C3586b mo3839c() {
            C3586b bVar = new C3586b();
            bVar.mo11758G("static_shapes");
            return bVar;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$q */
    static final class C2064q extends C1925l implements C1769a<C3586b> {

        /* renamed from: e */
        public static final C2064q f7257e = new C2064q();

        C2064q() {
            super(0);
        }

        /* renamed from: a */
        public final C3586b mo3839c() {
            return new C3586b();
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$r */
    static final class C2065r extends C1925l implements C1769a<LocationManager> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7258e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2065r(FlutterOsmView flutterOsmView) {
            super(0);
            this.f7258e = flutterOsmView;
        }

        /* renamed from: a */
        public final LocationManager mo3839c() {
            Object systemService = this.f7258e.f7124d.getSystemService("location");
            C1924k.m9139e(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            return (LocationManager) systemService;
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$initPosition$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$s */
    static final class C2066s extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f7259h;

        /* renamed from: i */
        final /* synthetic */ FlutterOsmView f7260i;

        /* renamed from: j */
        final /* synthetic */ C3472f f7261j;

        /* renamed from: k */
        final /* synthetic */ double f7262k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2066s(FlutterOsmView flutterOsmView, C3472f fVar, double d, C3443d<? super C2066s> dVar) {
            super(2, dVar);
            this.f7260i = flutterOsmView;
            this.f7261j = fVar;
            this.f7262k = d;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2066s(this.f7260i, this.f7261j, this.f7262k, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f7259h == 0) {
                C3181m.m14059b(obj);
                this.f7260i.m9355S0().mo11647g(this.f7261j, this.f7262k);
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2066s) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$t */
    static final class C2067t extends C1925l implements C1769a<C0041b> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7263e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2067t(FlutterOsmView flutterOsmView) {
            super(0);
            this.f7263e = flutterOsmView;
        }

        /* renamed from: a */
        public final C0041b mo3839c() {
            C2875d H0 = this.f7263e.mo7769H0();
            C1924k.m9138d(H0);
            C0041b bVar = new C0041b(H0);
            bVar.mo94A(this.f7263e.f7130j);
            return bVar;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$u */
    static final class C2068u extends C1925l implements C1769a<C2069a> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7264e;

        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$u$a */
        public static final class C2069a implements C3037b {

            /* renamed from: a */
            final /* synthetic */ FlutterOsmView f7265a;

            C2069a(FlutterOsmView flutterOsmView) {
                this.f7265a = flutterOsmView;
            }

            /* renamed from: a */
            public boolean mo7822a(C3039d dVar) {
                return true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
                r0 = r0.getBoundingBox();
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo7823b(p111q4.C3038c r4) {
                /*
                    r3 = this;
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r4 = r3.f7265a
                    boolean r4 = r4.f7117M
                    if (r4 != 0) goto L_0x0061
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r4 = r3.f7265a
                    boolean r4 = r4.f7118N
                    if (r4 != 0) goto L_0x0061
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r0 = r3.f7265a
                    org.osmdroid.views.d r0 = r0.mo7769H0()
                    r1 = 0
                    if (r0 == 0) goto L_0x0029
                    w4.a r0 = r0.getBoundingBox()
                    if (r0 == 0) goto L_0x0029
                    java.util.HashMap r0 = p156y1.C3556b.m15674j(r0)
                    goto L_0x002a
                L_0x0029:
                    r0 = r1
                L_0x002a:
                    java.lang.String r2 = "bounding"
                    r4.put(r2, r0)
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r0 = r3.f7265a
                    org.osmdroid.views.d r0 = r0.mo7769H0()
                    if (r0 == 0) goto L_0x003c
                    l4.a r0 = r0.getMapCenter()
                    goto L_0x003d
                L_0x003c:
                    r0 = r1
                L_0x003d:
                    java.lang.String r2 = "null cannot be cast to non-null type org.osmdroid.util.GeoPoint"
                    p041f3.C1924k.m9139e(r0, r2)
                    w4.f r0 = (p147w4.C3472f) r0
                    java.util.HashMap r0 = p156y1.C3556b.m15675k(r0)
                    java.lang.String r2 = "center"
                    r4.put(r2, r0)
                    hamza.dali.flutter_osm_plugin.FlutterOsmView r0 = r3.f7265a
                    n2.i r0 = r0.f7110F
                    if (r0 != 0) goto L_0x005b
                    java.lang.String r0 = "methodChannel"
                    p041f3.C1924k.m9154t(r0)
                    goto L_0x005c
                L_0x005b:
                    r1 = r0
                L_0x005c:
                    java.lang.String r0 = "receiveRegionIsChanging"
                    r1.mo9432c(r0, r4)
                L_0x0061:
                    r4 = 1
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.C2068u.C2069a.mo7823b(q4.c):boolean");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2068u(FlutterOsmView flutterOsmView) {
            super(0);
            this.f7264e = flutterOsmView;
        }

        /* renamed from: a */
        public final C2069a mo3839c() {
            return new C2069a(this.f7264e);
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$v */
    static final class C2070v extends C1925l implements C1769a<C3187s> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7266e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2070v(FlutterOsmView flutterOsmView) {
            super(0);
            this.f7266e = flutterOsmView;
        }

        /* renamed from: a */
        public final void mo7824a() {
            this.f7266e.f7109E = null;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3839c() {
            mo7824a();
            return C3187s.f10561a;
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$w */
    static final class C2071w extends C1925l implements C1780l<C3593g, Boolean> {

        /* renamed from: e */
        final /* synthetic */ String f7267e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2071w(String str) {
            super(1);
            this.f7267e = str;
        }

        /* renamed from: a */
        public final Boolean mo3836n(C3593g gVar) {
            C1924k.m9139e(gVar, "null cannot be cast to non-null type org.osmdroid.views.overlay.Polygon");
            return Boolean.valueOf(C1924k.m9136b(((C3599l) gVar).mo11811C(), this.f7267e));
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$x */
    static final class C2072x extends C1925l implements C1780l<C3593g, Boolean> {

        /* renamed from: e */
        final /* synthetic */ String f7268e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2072x(String str) {
            super(1);
            this.f7268e = str;
        }

        /* renamed from: a */
        public final Boolean mo3836n(C3593g gVar) {
            C1924k.m9139e(gVar, "null cannot be cast to non-null type org.osmdroid.views.overlay.Polygon");
            return Boolean.valueOf(C1924k.m9136b(((C3599l) gVar).mo11811C(), this.f7268e));
        }
    }

    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$y */
    static final class C2073y extends C1925l implements C1780l<C3472f, C3187s> {

        /* renamed from: e */
        final /* synthetic */ FlutterOsmView f7269e;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$resetAdvPickerOrTrackLocation$3$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {2126}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$y$a */
        static final class C2074a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7270h;

            /* renamed from: i */
            final /* synthetic */ FlutterOsmView f7271i;

            /* renamed from: j */
            final /* synthetic */ C3472f f7272j;

            @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$resetAdvPickerOrTrackLocation$3$1$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
            /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$y$a$a */
            static final class C2075a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

                /* renamed from: h */
                int f7273h;

                /* renamed from: i */
                final /* synthetic */ FlutterOsmView f7274i;

                /* renamed from: j */
                final /* synthetic */ C3472f f7275j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2075a(FlutterOsmView flutterOsmView, C3472f fVar, C3443d<? super C2075a> dVar) {
                    super(2, dVar);
                    this.f7274i = flutterOsmView;
                    this.f7275j = fVar;
                }

                /* renamed from: a */
                public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                    return new C2075a(this.f7274i, this.f7275j, dVar);
                }

                /* renamed from: t */
                public final Object mo3736t(Object obj) {
                    Object unused = C3530d.m15553c();
                    if (this.f7273h == 0) {
                        C3181m.m14059b(obj);
                        C2689i C = this.f7274i.f7110F;
                        if (C == null) {
                            C1924k.m9154t("methodChannel");
                            C = null;
                        }
                        C.mo9432c("receiveUserLocation", C3556b.m15675k(this.f7275j));
                        return C3187s.f10561a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: w */
                public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                    return ((C2075a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2074a(FlutterOsmView flutterOsmView, C3472f fVar, C3443d<? super C2074a> dVar) {
                super(2, dVar);
                this.f7271i = flutterOsmView;
                this.f7272j = fVar;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2074a(this.f7271i, this.f7272j, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object c = C3530d.m15553c();
                int i = this.f7270h;
                if (i == 0) {
                    C3181m.m14059b(obj);
                    C2815z1 c2 = C2799v0.m12533c();
                    C2075a aVar = new C2075a(this.f7271i, this.f7272j, (C3443d<? super C2075a>) null);
                    this.f7270h = 1;
                    if (C2740g.m12356c(c2, aVar, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C3181m.m14059b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C3187s.f10561a;
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2074a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2073y(FlutterOsmView flutterOsmView) {
            super(1);
            this.f7269e = flutterOsmView;
        }

        /* renamed from: a */
        public final void mo7827a(C3472f fVar) {
            C1924k.m9141g(fVar, "userLocation");
            C2745h0 E = this.f7269e.f7107C;
            if (E != null) {
                C2777o1 unused = C2744h.m12366b(E, (C3448g) null, (C2753j0) null, new C2074a(this.f7269e, fVar, (C3443d<? super C2074a>) null), 3, (Object) null);
            }
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo7827a((C3472f) obj);
            return C3187s.f10561a;
        }
    }

    @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$resetLastGeoPointPosition$1", mo11681f = "FlutterOsmView.kt", mo11682l = {2146, 2153}, mo11683m = "invokeSuspend")
    /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$z */
    static final class C2076z extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        Object f7276h;

        /* renamed from: i */
        Object f7277i;

        /* renamed from: j */
        int f7278j;

        /* renamed from: k */
        final /* synthetic */ C3559d f7279k;

        /* renamed from: l */
        final /* synthetic */ FlutterOsmView f7280l;

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$resetLastGeoPointPosition$1$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$z$a */
        static final class C2077a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7281h;

            /* renamed from: i */
            final /* synthetic */ C3559d f7282i;

            /* renamed from: j */
            final /* synthetic */ FlutterOsmView f7283j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2077a(C3559d dVar, FlutterOsmView flutterOsmView, C3443d<? super C2077a> dVar2) {
                super(2, dVar2);
                this.f7282i = dVar;
                this.f7283j = flutterOsmView;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2077a(this.f7282i, this.f7283j, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object unused = C3530d.m15553c();
                if (this.f7281h == 0) {
                    C3181m.m14059b(obj);
                    HashMap<String, byte[]> E = this.f7282i.mo11638E();
                    FlutterOsmView flutterOsmView = this.f7283j;
                    for (Map.Entry next : E.entrySet()) {
                        flutterOsmView.f7138r.put((String) next.getKey(), flutterOsmView.m9409v0((byte[]) next.getValue()));
                    }
                    return C3187s.f10561a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2077a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        @C3567f(mo11680c = "hamza.dali.flutter_osm_plugin.FlutterOsmView$resetLastGeoPointPosition$1$2$1", mo11681f = "FlutterOsmView.kt", mo11682l = {}, mo11683m = "invokeSuspend")
        /* renamed from: hamza.dali.flutter_osm_plugin.FlutterOsmView$z$b */
        static final class C2078b extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f7284h;

            /* renamed from: i */
            final /* synthetic */ FlutterOsmView f7285i;

            /* renamed from: j */
            final /* synthetic */ Map.Entry<String, C3177k<List<C3472f>, List<Double>>> f7286j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2078b(FlutterOsmView flutterOsmView, Map.Entry<String, ? extends C3177k<? extends List<? extends C3472f>, ? extends List<Double>>> entry, C3443d<? super C2078b> dVar) {
                super(2, dVar);
                this.f7285i = flutterOsmView;
                this.f7286j = entry;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                return new C2078b(this.f7285i, this.f7286j, dVar);
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object unused = C3530d.m15553c();
                if (this.f7284h == 0) {
                    C3181m.m14059b(obj);
                    this.f7285i.m9384i1(this.f7286j.getKey(), C3271t.m14398M((Iterable) this.f7286j.getValue().mo10543d()));
                    return C3187s.f10561a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C2078b) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2076z(C3559d dVar, FlutterOsmView flutterOsmView, C3443d<? super C2076z> dVar2) {
            super(2, dVar2);
            this.f7279k = dVar;
            this.f7280l = flutterOsmView;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2076z(this.f7279k, this.f7280l, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo3736t(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p151x2.C3530d.m15553c()
                int r1 = r9.f7278j
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x0023
                if (r1 != r3) goto L_0x001b
                java.lang.Object r1 = r9.f7277i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r9.f7276h
                hamza.dali.flutter_osm_plugin.FlutterOsmView r4 = (hamza.dali.flutter_osm_plugin.FlutterOsmView) r4
                p127t2.C3181m.m14059b(r10)
                goto L_0x0052
            L_0x001b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0023:
                p127t2.C3181m.m14059b(r10)
                goto L_0x0040
            L_0x0027:
                p127t2.C3181m.m14059b(r10)
                n3.d0 r10 = p092n3.C2799v0.m12531a()
                hamza.dali.flutter_osm_plugin.FlutterOsmView$z$a r1 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$z$a
                y1.d r5 = r9.f7279k
                hamza.dali.flutter_osm_plugin.FlutterOsmView r6 = r9.f7280l
                r1.<init>(r5, r6, r2)
                r9.f7278j = r4
                java.lang.Object r10 = p092n3.C2740g.m12356c(r10, r1, r9)
                if (r10 != r0) goto L_0x0040
                return r0
            L_0x0040:
                y1.d r10 = r9.f7279k
                java.util.HashMap r10 = r10.mo11637D()
                hamza.dali.flutter_osm_plugin.FlutterOsmView r1 = r9.f7280l
                java.util.Set r10 = r10.entrySet()
                java.util.Iterator r10 = r10.iterator()
                r4 = r1
                r1 = r10
            L_0x0052:
                r10 = r9
            L_0x0053:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0090
                java.lang.Object r5 = r1.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.util.HashMap r6 = r4.f7139s
                java.lang.Object r7 = r5.getKey()
                java.lang.Object r8 = r5.getValue()
                t2.k r8 = (p127t2.C3177k) r8
                java.lang.Object r8 = r8.mo10542c()
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.List r8 = p133u2.C3271t.m14400O(r8)
                r6.put(r7, r8)
                n3.z1 r6 = p092n3.C2799v0.m12533c()
                hamza.dali.flutter_osm_plugin.FlutterOsmView$z$b r7 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$z$b
                r7.<init>(r4, r5, r2)
                r10.f7276h = r4
                r10.f7277i = r1
                r10.f7278j = r3
                java.lang.Object r5 = p092n3.C2740g.m12356c(r6, r7, r10)
                if (r5 != r0) goto L_0x0053
                return r0
            L_0x0090:
                t2.s r10 = p127t2.C3187s.f10561a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.C2076z.mo3736t(java.lang.Object):java.lang.Object");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C2076z) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    public FlutterOsmView(Context context, C2679b bVar, int i, C3163i iVar, String str, C3395b bVar2, boolean z) {
        C1924k.m9141g(context, "context");
        C1924k.m9141g(bVar, "binaryMessenger");
        C1924k.m9141g(iVar, "providerLifecycle");
        C1924k.m9141g(str, "keyArgMapSnapShot");
        this.f7124d = context;
        this.f7125e = bVar;
        this.f7126f = i;
        this.f7127g = iVar;
        this.f7128h = str;
        this.f7129i = bVar2;
        this.f7130j = z;
        this.f7132l = str;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(new FrameLayout.LayoutParams(-1, -1)));
        this.f7122R = frameLayout;
        C0988f a = iVar.mo10534a();
        if (a != null) {
            a.mo3774a(this);
        }
    }

    /* renamed from: A0 */
    private final C3586b m9321A0() {
        return (C3586b) this.f7145y.getValue();
    }

    /* renamed from: B0 */
    private final C3586b m9323B0() {
        return (C3586b) this.f7142v.getValue();
    }

    /* renamed from: C0 */
    private final C3586b m9325C0() {
        return (C3586b) this.f7141u.getValue();
    }

    /* renamed from: D0 */
    private final void m9327D0(C2689i.C2694d dVar) {
        List<C3593g> C = m9415y0().mo11755C();
        C1924k.m9140f(C, "folderMarkers.items");
        List<C3590f> u = C3270s.m14384u(C, C3590f.class);
        List O = C3271t.m14400O(C3263l.m14369f());
        ArrayList arrayList = new ArrayList(C3264m.m14377n(u, 10));
        for (C3590f N : u) {
            C3472f N2 = N.mo11786N();
            C1924k.m9140f(N2, "it.position");
            arrayList.add(C3556b.m15675k(N2));
        }
        O.addAll(C3271t.m14398M(arrayList));
        dVar.mo9291b(C3271t.m14398M(O));
    }

    /* renamed from: E0 */
    private final LocationManager m9329E0() {
        return (LocationManager) this.f7113I.getValue();
    }

    /* renamed from: G0 */
    private final C0041b m9332G0() {
        return (C0041b) this.f7111G.getValue();
    }

    /* renamed from: I0 */
    private final void m9335I0(C2689i.C2694d dVar) {
        C2875d dVar2 = this.f7131k;
        C3457a boundingBox = dVar2 != null ? dVar2.getBoundingBox() : null;
        if (boundingBox == null) {
            boundingBox = f7104U;
        }
        dVar.mo9291b(C3556b.m15674j(boundingBox));
    }

    /* renamed from: J0 */
    private final C2068u.C2069a m9337J0() {
        return (C2068u.C2069a) this.f7121Q.getValue();
    }

    /* renamed from: K0 */
    private final C3589e m9339K0() {
        return (C3589e) this.f7120P.getValue();
    }

    /* renamed from: L0 */
    private final void m9341L0(C2689i.C2694d dVar, C1769a<C3187s> aVar) {
        C3523d dVar2 = this.f7133m;
        C3523d dVar3 = null;
        if (dVar2 == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar2 = null;
        }
        if (!dVar2.mo7311K()) {
            C3523d dVar4 = this.f7133m;
            if (dVar4 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar4 = null;
            }
            dVar4.mo7307G();
        }
        C3523d dVar5 = this.f7133m;
        if (dVar5 == null) {
            C1924k.m9154t("locationNewOverlay");
        } else {
            dVar3 = dVar5;
        }
        C2745h0 h0Var = this.f7107C;
        C1924k.m9138d(h0Var);
        dVar3.mo11556X(dVar, aVar, h0Var);
    }

    /* renamed from: M0 */
    static /* synthetic */ void m9343M0(FlutterOsmView flutterOsmView, C2689i.C2694d dVar, C1769a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        flutterOsmView.m9341L0(dVar, aVar);
    }

    /* renamed from: N0 */
    private final void m9345N0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9138d(obj);
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("lat");
        C1924k.m9138d(obj2);
        double doubleValue = ((Double) obj2).doubleValue();
        Object obj3 = hashMap.get("lon");
        C1924k.m9138d(obj3);
        C3472f fVar = new C3472f(doubleValue, ((Double) obj3).doubleValue());
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.getController().mo9104e(fVar);
        dVar.mo9291b((Object) null);
    }

    /* renamed from: O0 */
    private final void m9347O0() {
        C2492b bVar;
        C2875d dVar = new C2875d(this.f7124d);
        this.f7131k = dVar;
        C1924k.m9138d(dVar);
        dVar.setLayoutParams(new C2875d.C2877b(new LinearLayout.LayoutParams(-1, -1)));
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.setTilesScaledToDpi(true);
        C2875d dVar3 = this.f7131k;
        C1924k.m9138d(dVar3);
        dVar3.setMultiTouchControls(true);
        if (this.f7129i != null) {
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            C3556b.m15670f(dVar4, this.f7129i.mo11265d(), this.f7129i.mo11264c(), this.f7129i.mo11263b(), this.f7129i.mo11268f(), this.f7129i.mo11266e(), (String[]) this.f7129i.mo11269g().toArray(new String[0]), this.f7129i.mo11262a());
        } else {
            C2875d dVar5 = this.f7131k;
            C1924k.m9138d(dVar5);
            dVar5.setTileSource(C3376f.f11117a);
        }
        C2875d dVar6 = this.f7131k;
        C1924k.m9138d(dVar6);
        dVar6.setVerticalMapRepetitionEnabled(false);
        C2875d dVar7 = this.f7131k;
        C1924k.m9138d(dVar7);
        dVar7.setHorizontalMapRepetitionEnabled(false);
        C2875d dVar8 = this.f7131k;
        C1924k.m9138d(dVar8);
        dVar8.setScrollableAreaLimitDouble(m9355S0().mo11644d());
        C2875d dVar9 = this.f7131k;
        C1924k.m9138d(dVar9);
        dVar9.mo9887O(C2875d.getTileSystem().mo11401s(), C2875d.getTileSystem().mo11379A(), 0);
        C2875d dVar10 = this.f7131k;
        C1924k.m9138d(dVar10);
        dVar10.getZoomController().mo9838q(C2858a.C2864f.NEVER);
        C2875d dVar11 = this.f7131k;
        C1924k.m9138d(dVar11);
        double d = 2.0d;
        dVar11.setMinZoomLevel(Double.valueOf(2.0d));
        if (C3153a.f10538b.mo10531b().containsKey(this.f7132l)) {
            C2875d dVar12 = this.f7131k;
            C1924k.m9138d(dVar12);
            dVar12.setExpectedCenter(m9355S0().mo11650j());
            C2875d dVar13 = this.f7131k;
            C1924k.m9138d(dVar13);
            bVar = dVar13.getController();
            d = m9355S0().mo11640G(2.0d);
        } else {
            C2875d dVar14 = this.f7131k;
            C1924k.m9138d(dVar14);
            dVar14.setExpectedCenter(new C3472f(0.0d, 0.0d));
            C2875d dVar15 = this.f7131k;
            C1924k.m9138d(dVar15);
            bVar = dVar15.getController();
        }
        bVar.mo9107h(d);
        C2875d dVar16 = this.f7131k;
        C1924k.m9138d(dVar16);
        dVar16.mo9926m(m9337J0());
        C2875d dVar17 = this.f7131k;
        C1924k.m9138d(dVar17);
        dVar17.getOverlayManager().mo11730i(0, m9339K0());
        C2875d dVar18 = this.f7131k;
        C1924k.m9138d(dVar18);
        dVar18.getOverlayManager().add(m9415y0());
        C2875d dVar19 = this.f7131k;
        C1924k.m9138d(dVar19);
        dVar19.getOverlayManager().add(m9332G0());
        this.f7122R.addView(this.f7131k);
        C2875d dVar20 = this.f7131k;
        C1924k.m9138d(dVar20);
        this.f7133m = new C3523d(dVar20);
    }

    /* renamed from: P */
    private final C3405h m9348P(C3472f fVar, double d, Integer num, Bitmap bitmap, String str, boolean z, double d2) {
        Bitmap bitmap2 = bitmap;
        String str2 = str;
        C2875d dVar = this.f7131k;
        C1924k.m9138d(dVar);
        double d3 = d;
        dVar.getController().mo9107h(d);
        if (z) {
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            C3472f fVar2 = fVar;
            dVar2.getController().mo9104e(fVar);
        } else {
            C3472f fVar3 = fVar;
        }
        C3590f f0 = m9378f0(this, fVar, num, (Bitmap) null, 0.0d, 12, (Object) null);
        C1924k.m9139e(f0, "null cannot be cast to non-null type hamza.dali.flutter_osm_plugin.models.FlutterMarker");
        C3405h hVar = (C3405h) f0;
        hVar.mo11283n0(new C3157c(this));
        if (bitmap2 != null) {
            hVar.mo11281j0((Integer) null, bitmap2, Double.valueOf(d2));
        } else {
            if (!(str2 == null || str.length() == 0)) {
                hVar.mo11282l0(str2, d2);
            }
        }
        m9415y0().mo11755C().add(hVar);
        C2875d dVar3 = this.f7131k;
        if (dVar3 != null) {
            dVar3.invalidate();
        }
        return hVar;
    }

    /* renamed from: P0 */
    private final void m9349P0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9138d(obj);
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("lat");
        C1924k.m9138d(obj2);
        double doubleValue = ((Number) obj2).doubleValue();
        Object obj3 = hashMap.get("lon");
        C1924k.m9138d(obj3);
        C3472f fVar = new C3472f(doubleValue, ((Number) obj3).doubleValue());
        double d = this.f7116L;
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.getController().mo9107h(m9355S0().mo11640G(d));
        C2875d dVar3 = this.f7131k;
        C1924k.m9138d(dVar3);
        C2492b controller = dVar3.getController();
        C3472f j = m9355S0().mo11650j();
        if (j == null) {
            j = fVar;
        }
        controller.mo9106g(j);
        C2689i iVar = this.f7110F;
        if (iVar == null) {
            C1924k.m9154t("methodChannel");
            iVar = null;
        }
        iVar.mo9432c("map#init", Boolean.TRUE);
        C2745h0 h0Var = this.f7107C;
        if (h0Var != null) {
            C2777o1 unused = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2066s(this, fVar, d, (C3443d<? super C2066s>) null), 3, (Object) null);
        }
        dVar.mo9291b((Object) null);
    }

    /* renamed from: Q */
    static /* synthetic */ C3405h m9350Q(FlutterOsmView flutterOsmView, C3472f fVar, double d, Integer num, Bitmap bitmap, String str, boolean z, double d2, int i, Object obj) {
        double d3;
        if ((i & 2) != 0) {
            C2875d dVar = flutterOsmView.f7131k;
            C1924k.m9138d(dVar);
            d3 = dVar.getZoomLevelDouble();
        } else {
            FlutterOsmView flutterOsmView2 = flutterOsmView;
            d3 = d;
        }
        String str2 = null;
        Integer num2 = (i & 4) != 0 ? null : num;
        Bitmap bitmap2 = (i & 8) != 0 ? null : bitmap;
        if ((i & 16) == 0) {
            str2 = str;
        }
        return flutterOsmView.m9348P(fVar, d3, num2, bitmap2, str2, (i & 32) != 0 ? true : z, (i & 64) != 0 ? 0.0d : d2);
    }

    /* renamed from: Q0 */
    private final void m9351Q0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
        List list = (List) obj;
        C3457a aVar = new C3457a(((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue(), ((Number) list.get(2)).doubleValue(), ((Number) list.get(3)).doubleValue());
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.setScrollableAreaLimitDouble(aVar);
        m9355S0().mo11663y(aVar);
        dVar.mo9291b(200);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final boolean m9352R(FlutterOsmView flutterOsmView, C3590f fVar, C2875d dVar) {
        C1924k.m9141g(flutterOsmView, "this$0");
        HashMap hashMap = new HashMap();
        C1924k.m9138d(fVar);
        hashMap.put("lon", Double.valueOf(fVar.mo11786N().mo9100l()));
        hashMap.put("lat", Double.valueOf(fVar.mo11786N().mo9099e()));
        C2689i iVar = flutterOsmView.f7110F;
        if (iVar == null) {
            C1924k.m9154t("methodChannel");
            iVar = null;
        }
        iVar.mo9432c("receiveGeoPoint", hashMap);
        return true;
    }

    /* renamed from: R0 */
    private final void m9353R0(C2688h hVar, C2689i.C2694d dVar) {
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        C2492b controller = dVar2.getController();
        C2875d dVar3 = this.f7131k;
        C1924k.m9138d(dVar3);
        C2491a mapCenter = dVar3.getMapCenter();
        C2875d dVar4 = this.f7131k;
        C1924k.m9138d(dVar4);
        Double valueOf = Double.valueOf(dVar4.getZoomLevelDouble());
        Double d = (Double) hVar.f9002b;
        controller.mo9105f(mapCenter, valueOf, (Long) null, Float.valueOf(d != null ? (float) d.doubleValue() : 0.0f));
        C3559d S0 = m9355S0();
        C2875d dVar5 = this.f7131k;
        C1924k.m9138d(dVar5);
        S0.mo11661w(dVar5.getMapOrientation());
        C2875d dVar6 = this.f7131k;
        C1924k.m9138d(dVar6);
        dVar6.invalidate();
        dVar.mo9291b((Object) null);
    }

    /* renamed from: S */
    private final void m9354S(C2688h hVar, C2689i.C2694d dVar) {
        double d;
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("point");
        C1924k.m9139e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }");
        C3472f i = C3556b.m15673i((HashMap) obj2);
        Bitmap bitmap = this.f7134n;
        if (hashMap.containsKey("icon")) {
            Object obj3 = hashMap.get("icon");
            C1924k.m9139e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            bitmap = m9409v0((byte[]) obj3);
            C2745h0 h0Var = this.f7107C;
            if (h0Var != null) {
                C2777o1 unused = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2032b(this, i, hashMap, (C3443d<? super C2032b>) null), 3, (Object) null);
            }
        }
        Bitmap bitmap2 = bitmap;
        Object obj4 = hashMap.get("point");
        C1924k.m9139e(obj4, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }");
        if (((HashMap) obj4).containsKey("angle")) {
            Object obj5 = hashMap.get("point");
            C1924k.m9139e(obj5, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }");
            Object obj6 = ((HashMap) obj5).get("angle");
            C1924k.m9139e(obj6, "null cannot be cast to non-null type kotlin.Double");
            d = ((Double) obj6).doubleValue();
        } else {
            d = 0.0d;
        }
        double d2 = d;
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        m9350Q(this, i, dVar2.getZoomLevelDouble(), (Integer) null, bitmap2, (String) null, false, d2, 20, (Object) null);
        dVar.mo9291b((Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public final C3559d m9355S0() {
        if (this.f7132l.length() == 0) {
            return new C3559d();
        }
        C3153a.C3154a aVar = C3153a.f10538b;
        if (!aVar.mo10531b().containsKey(this.f7132l)) {
            aVar.mo10531b().put(this.f7132l, new C3559d());
        }
        C3559d dVar = aVar.mo10531b().get(this.f7132l);
        C1924k.m9138d(dVar);
        return dVar;
    }

    /* renamed from: T */
    private final void m9356T() {
        List<C3593g> overlays;
        C3558c cVar = this.f7123S;
        if (cVar != null) {
            this.f7122R.removeView(cVar);
            if (this.f7117M) {
                try {
                    if (this.f7118N) {
                        m9405t0();
                    }
                    C3523d dVar = this.f7133m;
                    if (dVar == null) {
                        C1924k.m9154t("locationNewOverlay");
                        dVar = null;
                    }
                    if (!dVar.mo7310J()) {
                        this.f7117M = true;
                        C3523d dVar2 = this.f7133m;
                        if (dVar2 == null) {
                            C1924k.m9154t("locationNewOverlay");
                            dVar2 = null;
                        }
                        dVar2.mo11557b0(new C2034c(this));
                    }
                } catch (Exception e) {
                    System.out.print(e);
                }
            }
            C2875d dVar3 = this.f7131k;
            C1924k.m9138d(dVar3);
            dVar3.getOverlays().add(m9323B0());
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            dVar4.getOverlays().add(m9321A0());
            C2875d dVar5 = this.f7131k;
            C1924k.m9138d(dVar5);
            dVar5.getOverlays().add(m9325C0());
            C2875d dVar6 = this.f7131k;
            C1924k.m9138d(dVar6);
            dVar6.getOverlays().add(m9415y0());
            C2875d dVar7 = this.f7131k;
            if (!(dVar7 == null || (overlays = dVar7.getOverlays()) == null)) {
                overlays.add(0, m9339K0());
            }
            this.f7123S = null;
            m9355S0().mo11662x(false);
        }
    }

    /* renamed from: T0 */
    private final void m9357T0(C2688h hVar, C2689i.C2694d dVar) {
        String str = (String) hVar.f9002b;
        if (str != null) {
            List<C3593g> C = m9413x0().mo11755C();
            C1924k.m9140f(C, "folderCircles.items");
            boolean unused = C3268q.m14383t(C, new C2071w(str));
        } else {
            m9413x0().mo11755C().clear();
        }
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.invalidate();
        dVar.mo9291b((Object) null);
    }

    /* renamed from: U */
    private final void m9358U(C2688h hVar, C2689i.C2694d dVar) {
        try {
            Object obj = hVar.f9002b;
            C1924k.m9139e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            this.f7134n = m9409v0((byte[]) obj);
            dVar.mo9291b((Object) null);
        } catch (Exception e) {
            Log.d("err", C3168b.m14047b(e));
            this.f7134n = null;
            dVar.mo9290a("500", "Cannot make markerIcon custom", "");
        }
    }

    /* renamed from: U0 */
    private final void m9359U0() {
        C3153a.f10538b.mo10531b().remove(this.f7132l);
    }

    /* renamed from: V */
    private final void m9360V(C3395b bVar) {
        C2875d dVar = this.f7131k;
        if (dVar != null) {
            C3556b.m15670f(dVar, bVar.mo11265d(), bVar.mo11264c(), bVar.mo11263b(), bVar.mo11268f(), bVar.mo11266e(), (String[]) bVar.mo11269g().toArray(new String[0]), bVar.mo11262a());
        }
    }

    /* renamed from: V0 */
    private final void m9361V0(C2689i.C2694d dVar) {
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        C3457a aVar = f7104U;
        dVar2.setScrollableAreaLimitDouble(aVar);
        m9355S0().mo11663y(aVar);
        dVar.mo9291b(200);
    }

    /* renamed from: W */
    private final void m9362W(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        try {
            Object obj2 = hashMap.get("personIcon");
            C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj2;
            Object obj3 = hashMap.get("arrowDirectionIcon");
            C1924k.m9139e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr2 = (byte[]) obj3;
            this.f7135o = m9409v0(bArr);
            this.f7136p = m9409v0(bArr2);
            m9355S0().mo11636C(bArr, bArr2);
            dVar.mo9291b((Object) null);
        } catch (Exception e) {
            e.printStackTrace();
            dVar.mo9291b(e.getMessage());
        }
    }

    /* renamed from: W0 */
    private final void m9363W0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }");
        m9385j0(C3556b.m15673i((HashMap) obj));
        dVar.mo9291b((Object) null);
    }

    /* renamed from: X */
    private final void m9364X(C2688h hVar, C2689i.C2694d dVar) {
        double d;
        Object obj = hVar.f9002b;
        C1924k.m9138d(obj);
        HashMap hashMap = (HashMap) obj;
        if (this.f7140t != null) {
            m9415y0().mo11757F(this.f7140t);
        }
        Object obj2 = hashMap.get("lat");
        C1924k.m9138d(obj2);
        double doubleValue = ((Number) obj2).doubleValue();
        Object obj3 = hashMap.get("lon");
        C1924k.m9138d(obj3);
        C3472f fVar = new C3472f(doubleValue, ((Number) obj3).doubleValue());
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        if (dVar2.getZoomLevelDouble() == 0.0d) {
            d = this.f7116L;
        } else {
            C2875d dVar3 = this.f7131k;
            C1924k.m9138d(dVar3);
            d = dVar3.getZoomLevelDouble();
        }
        this.f7140t = m9350Q(this, fVar, d, (Integer) null, (Bitmap) null, (String) null, false, 0.0d, C1279j.f4383G0, (Object) null);
        dVar.mo9291b((Object) null);
    }

    /* renamed from: X0 */
    private final void m9365X0(C2688h hVar, C2689i.C2694d dVar) {
        String str = (String) hVar.f9002b;
        if (str != null) {
            List<C3593g> C = m9417z0().mo11755C();
            C1924k.m9140f(C, "folderRect.items");
            boolean unused = C3268q.m14383t(C, new C2072x(str));
        } else {
            m9417z0().mo11755C().clear();
        }
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.invalidate();
        dVar.mo9291b((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        if (r7 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r7 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9366Y(p091n2.C2688h r20, p091n2.C2689i.C2694d r21) {
        /*
            r19 = this;
            r12 = r19
            r0 = r20
            java.lang.Object r0 = r0.f9002b
            java.lang.String r1 = "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }"
            p041f3.C1924k.m9139e(r0, r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "old_location"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r2 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }"
            p041f3.C1924k.m9139e(r1, r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            w4.f r4 = p156y1.C3556b.m15673i(r1)
            java.lang.String r1 = "new_location"
            java.lang.Object r1 = r0.get(r1)
            p041f3.C1924k.m9139e(r1, r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            w4.f r6 = p156y1.C3556b.m15673i(r1)
            y4.b r1 = r19.m9415y0()
            java.util.List r1 = r1.mo11755C()
            java.lang.String r2 = "folderMarkers.items"
            p041f3.C1924k.m9140f(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r1.next()
            boolean r5 = r3 instanceof p138v1.C3405h
            if (r5 == 0) goto L_0x0043
            r2.add(r3)
            goto L_0x0043
        L_0x0055:
            java.util.Iterator r1 = r2.iterator()
        L_0x0059:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0077
            java.lang.Object r2 = r1.next()
            r5 = r2
            v1.h r5 = (p138v1.C3405h) r5
            w4.f r5 = r5.mo11786N()
            java.lang.String r7 = "marker.position"
            p041f3.C1924k.m9140f(r5, r7)
            boolean r5 = p156y1.C3556b.m15667c(r5, r4)
            if (r5 == 0) goto L_0x0059
            goto L_0x0078
        L_0x0077:
            r2 = r3
        L_0x0078:
            r7 = r2
            v1.h r7 = (p138v1.C3405h) r7
            if (r7 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r7.mo11795X(r6)
        L_0x0081:
            java.lang.String r1 = "angle"
            boolean r2 = r0.containsKey(r1)
            r5 = 1
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L_0x0092
            r2 = 1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            r8 = 0
            if (r2 != r5) goto L_0x00c8
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Double"
            p041f3.C1924k.m9139e(r2, r10)
            java.lang.Double r2 = (java.lang.Double) r2
            double r13 = r2.doubleValue()
            if (r7 == 0) goto L_0x00b0
            double r2 = r7.mo11280f0()
            java.lang.Double r3 = java.lang.Double.valueOf(r2)
        L_0x00b0:
            boolean r2 = p041f3.C1924k.m9135a(r3, r13)
            r2 = r2 ^ r5
            if (r2 != r5) goto L_0x00c5
            java.lang.Object r1 = r0.get(r1)
            p041f3.C1924k.m9139e(r1, r10)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            goto L_0x00ce
        L_0x00c5:
            if (r7 == 0) goto L_0x00cf
            goto L_0x00ca
        L_0x00c8:
            if (r7 == 0) goto L_0x00cf
        L_0x00ca:
            double r1 = r7.mo11280f0()
        L_0x00ce:
            r8 = r1
        L_0x00cf:
            java.lang.String r1 = "new_icon"
            boolean r2 = r0.containsKey(r1)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.ByteArray"
            if (r2 != r5) goto L_0x00de
            java.lang.Object r0 = r0.get(r1)
            goto L_0x00ea
        L_0x00de:
            y1.d r0 = r19.m9355S0()
            android.util.ArrayMap r0 = r0.mo11657q()
            java.lang.Object r0 = r0.get(r4)
        L_0x00ea:
            p041f3.C1924k.m9139e(r0, r3)
            byte[] r0 = (byte[]) r0
            r10 = r0
            n3.h0 r13 = r12.f7107C
            if (r13 == 0) goto L_0x0109
            r14 = 0
            r15 = 0
            hamza.dali.flutter_osm_plugin.FlutterOsmView$d r16 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$d
            r5 = 0
            r0 = r16
            r1 = r19
            r2 = r6
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r17 = 3
            r18 = 0
            p092n3.C2777o1 unused = p092n3.C2744h.m12366b(r13, r14, r15, r16, r17, r18)
        L_0x0109:
            android.graphics.Bitmap r5 = r12.m9409v0(r10)
            y4.b r0 = r19.m9415y0()
            java.util.List r0 = r0.mo11755C()
            r0.remove(r7)
            r2 = 0
            r4 = 0
            r7 = 0
            r10 = 0
            r11 = 6
            r13 = 0
            r0 = r19
            r1 = r6
            r6 = r7
            r7 = r10
            r10 = r11
            r11 = r13
            m9350Q(r0, r1, r2, r4, r5, r6, r7, r8, r10, r11)
            org.osmdroid.views.d r0 = r12.f7131k
            if (r0 == 0) goto L_0x0130
            r0.invalidate()
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.m9366Y(n2.h, n2.i$d):void");
    }

    /* renamed from: Y0 */
    private final void m9367Y0(C3559d dVar) {
        boolean c = dVar.mo11643c();
        if (c) {
            m9388k1();
        } else if (!c) {
            this.f7117M = dVar.mo11639F();
            boolean m = dVar.mo11653m();
            this.f7118N = m;
            if (m || this.f7117M) {
                byte[] n = dVar.mo11654n();
                if (n != null) {
                    this.f7135o = m9409v0(n);
                }
                byte[] l = dVar.mo11652l();
                if (l != null) {
                    this.f7136p = m9409v0(l);
                }
                if (this.f7118N) {
                    m9405t0();
                }
                if (this.f7117M) {
                    C3523d dVar2 = this.f7133m;
                    if (dVar2 == null) {
                        C1924k.m9154t("locationNewOverlay");
                        dVar2 = null;
                    }
                    if (!dVar2.mo7310J()) {
                        dVar2.mo11557b0(new C2073y(this));
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    private final void m9368Z() {
        C2875d dVar = this.f7131k;
        C1924k.m9138d(dVar);
        if (!dVar.getOverlays().contains(m9321A0())) {
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            List<C3593g> overlays = dVar2.getOverlays();
            C3523d dVar3 = this.f7133m;
            if (dVar3 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar3 = null;
            }
            int indexOf = overlays.indexOf(dVar3);
            boolean z = indexOf != -1;
            if (z) {
                C2875d dVar4 = this.f7131k;
                C1924k.m9138d(dVar4);
                dVar4.getOverlays().add(indexOf - 1, m9321A0());
            } else if (!z) {
                C2875d dVar5 = this.f7131k;
                C1924k.m9138d(dVar5);
                dVar5.getOverlays().add(m9321A0());
            }
        }
    }

    /* renamed from: Z0 */
    private final void m9369Z0(C3559d dVar) {
        C2745h0 h0Var = this.f7107C;
        if (h0Var != null) {
            C2777o1 unused = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2076z(dVar, this, (C3443d<? super C2076z>) null), 3, (Object) null);
        }
    }

    /* renamed from: a0 */
    private final void m9370a0(C2689i.C2694d dVar) {
        m9321A0().mo11755C().clear();
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        dVar2.invalidate();
        dVar.mo9291b(200);
    }

    /* renamed from: a1 */
    private final void m9371a1() {
        C3559d S0 = m9355S0();
        C2875d dVar = this.f7131k;
        C1924k.m9138d(dVar);
        C2491a mapCenter = dVar.getMapCenter();
        C1924k.m9139e(mapCenter, "null cannot be cast to non-null type org.osmdroid.util.GeoPoint");
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        S0.mo11645e((C3472f) mapCenter, dVar2.getZoomLevelDouble(), m9411w0(this.f7137q));
    }

    /* renamed from: b0 */
    private final void m9372b0() {
        C3559d.m15681v(m9355S0(), false, 1, (Object) null);
    }

    /* renamed from: c0 */
    private final void m9373c0(C2689i.C2694d dVar, boolean z) {
        List<C3593g> overlays;
        C3558c cVar = this.f7123S;
        if (cVar != null) {
            this.f7122R.removeView(cVar);
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            C2491a mapCenter = dVar2.getMapCenter();
            C1924k.m9139e(mapCenter, "null cannot be cast to non-null type org.osmdroid.util.GeoPoint");
            C3472f fVar = (C3472f) mapCenter;
            if (z) {
                C2875d dVar3 = this.f7131k;
                C1924k.m9138d(dVar3);
                this.f7140t = m9350Q(this, fVar, dVar3.getZoomLevelDouble(), (Integer) null, (Bitmap) null, (String) null, false, 0.0d, C1279j.f4383G0, (Object) null);
                this.f7123S = null;
                C2875d dVar4 = this.f7131k;
                C1924k.m9138d(dVar4);
                dVar4.getOverlays().add(m9323B0());
                C2875d dVar5 = this.f7131k;
                C1924k.m9138d(dVar5);
                dVar5.getOverlays().add(m9321A0());
                C2875d dVar6 = this.f7131k;
                C1924k.m9138d(dVar6);
                dVar6.getOverlays().add(m9325C0());
                C2875d dVar7 = this.f7131k;
                C1924k.m9138d(dVar7);
                dVar7.getOverlays().add(m9415y0());
                C2875d dVar8 = this.f7131k;
                if (!(dVar8 == null || (overlays = dVar8.getOverlays()) == null)) {
                    overlays.add(0, m9339K0());
                }
                C2875d dVar9 = this.f7131k;
                if (dVar9 != null) {
                    dVar9.invalidate();
                }
                m9355S0().mo11662x(false);
                if (this.f7117M) {
                    this.f7117M = false;
                    this.f7118N = false;
                }
            }
            C2689i.C2694d dVar10 = dVar;
            dVar.mo9291b(C3556b.m15675k(fVar));
        }
    }

    /* renamed from: c1 */
    private final void m9374c1() {
        C2745h0 h0Var;
        C3559d S0 = m9355S0();
        if (S0.mo11650j() != null) {
            C3472f j = S0.mo11650j();
            C1924k.m9138d(j);
            if (!C3556b.m15667c(j, new C3472f(0.0d, 0.0d))) {
                if (!(S0.mo11656p() == 0.0f)) {
                    C2875d dVar = this.f7131k;
                    C1924k.m9138d(dVar);
                    dVar.setMapOrientation(S0.mo11656p());
                }
                C2875d dVar2 = this.f7131k;
                C1924k.m9138d(dVar2);
                dVar2.getController().mo9106g(S0.mo11650j());
                C2875d dVar3 = this.f7131k;
                C1924k.m9138d(dVar3);
                dVar3.getController().mo9107h(S0.mo11640G(this.f7116L));
            }
        }
        C2745h0 h0Var2 = this.f7107C;
        if (h0Var2 != null) {
            C2777o1 unused = C2744h.m12366b(h0Var2, (C3448g) null, (C2753j0) null, new C2030a0(S0, this, (C3443d<? super C2030a0>) null), 3, (Object) null);
        }
        if ((!S0.mo11638E().isEmpty()) && (h0Var = this.f7107C) != null) {
            C2777o1 unused2 = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2033b0(S0, this, (C3443d<? super C2033b0>) null), 3, (Object) null);
        }
        if (!S0.mo11637D().isEmpty()) {
            m9369Z0(S0);
        }
        C3561f o = S0.mo11655o();
        if (o != null && (!o.mo11672g().isEmpty())) {
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            if (!dVar4.getOverlayManager().contains(m9321A0())) {
                C2875d dVar5 = this.f7131k;
                C1924k.m9138d(dVar5);
                dVar5.getOverlayManager().add(m9321A0());
            }
            C2875d dVar6 = this.f7131k;
            C1924k.m9138d(dVar6);
            C3601m mVar = new C3601m(dVar6);
            mVar.mo11831a0(o.mo11672g());
            Integer e = o.mo11669e();
            C3556b.m15671g(mVar, e != null ? e.intValue() : -16711936, o.mo11673h(), o.mo11667c(), o.mo11668d());
            this.f7105A = m9380g0(o.mo11671f(), mVar, o.mo11666b(), o.mo11665a());
            C2875d dVar7 = this.f7131k;
            C1924k.m9138d(dVar7);
            dVar7.invalidate();
        }
        for (C3561f fVar : S0.mo11649i()) {
            if (!fVar.mo11672g().isEmpty()) {
                C2875d dVar8 = this.f7131k;
                C1924k.m9138d(dVar8);
                if (!dVar8.getOverlayManager().contains(m9321A0())) {
                    C2875d dVar9 = this.f7131k;
                    C1924k.m9138d(dVar9);
                    dVar9.getOverlayManager().add(m9321A0());
                }
                C2875d dVar10 = this.f7131k;
                C1924k.m9138d(dVar10);
                C3601m mVar2 = new C3601m(dVar10);
                mVar2.mo11831a0(fVar.mo11672g());
                C2875d dVar11 = this.f7131k;
                C1924k.m9138d(dVar11);
                new C3601m(dVar11).mo11831a0(fVar.mo11672g());
                Integer c = fVar.mo11667c();
                float d = fVar.mo11668d();
                Integer e2 = fVar.mo11669e();
                C3556b.m15671g(mVar2, e2 != null ? e2.intValue() : -16711936, fVar.mo11673h(), c, d);
                this.f7105A = m9380g0(fVar.mo11671f(), mVar2, fVar.mo11666b(), fVar.mo11665a());
            }
        }
        C2875d dVar12 = this.f7131k;
        C1924k.m9138d(dVar12);
        dVar12.invalidate();
        m9367Y0(S0);
        m9372b0();
        C2689i iVar = this.f7110F;
        if (iVar == null) {
            C1924k.m9154t("methodChannel");
            iVar = null;
        }
        iVar.mo9432c("map#restored", (Object) null);
    }

    /* renamed from: d0 */
    static /* synthetic */ void m9375d0(FlutterOsmView flutterOsmView, C2689i.C2694d dVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        flutterOsmView.m9373c0(dVar, z);
    }

    /* renamed from: d1 */
    private final void m9376d1(C2688h hVar, C2689i.C2694d dVar) {
        try {
            Object obj = hVar.f9002b;
            C1924k.m9139e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            this.f7137q = m9409v0((byte[]) obj);
            dVar.mo9291b((Object) null);
        } catch (Exception e) {
            Log.d("err", C3168b.m14047b(e));
            this.f7134n = null;
            dVar.mo9290a("500", "Cannot make markerIcon custom", "");
        }
    }

    /* renamed from: e0 */
    private final C3590f m9377e0(C3472f fVar, Integer num, Bitmap bitmap, double d) {
        Context context = this.f7124d;
        C2875d dVar = this.f7131k;
        C1924k.m9138d(dVar);
        C3405h hVar = new C3405h(context, dVar, fVar, this.f7107C);
        hVar.mo11284o0(this.f7119O);
        hVar.mo11281j0(num, bitmap, Double.valueOf(d));
        return hVar;
    }

    /* renamed from: f0 */
    static /* synthetic */ C3590f m9378f0(FlutterOsmView flutterOsmView, C3472f fVar, Integer num, Bitmap bitmap, double d, int i, Object obj) {
        if ((i & 4) != 0) {
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        if ((i & 8) != 0) {
            d = 0.0d;
        }
        return flutterOsmView.m9377e0(fVar, num, bitmap2, d);
    }

    /* renamed from: f1 */
    private final void m9379f1() {
        C3523d dVar = this.f7133m;
        if (dVar == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar = null;
        }
        dVar.mo11562i0(this.f7135o, this.f7136p);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final C3409j m9380g0(String str, C3601m mVar, double d, double d2) {
        C3409j jVar = new C3409j(str, d, d2);
        jVar.mo11291O(mVar);
        jVar.mo11290N(new C2041e(this));
        m9321A0().mo11755C().add(jVar);
        return jVar;
    }

    /* renamed from: h0 */
    static /* synthetic */ C3409j m9381h0(FlutterOsmView flutterOsmView, String str, C3601m mVar, double d, double d2, int i, Object obj) {
        return flutterOsmView.m9380g0(str, mVar, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2);
    }

    /* renamed from: h1 */
    private final void m9382h1(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        boolean containsKey = hashMap.containsKey("stepZoom");
        boolean z = true;
        if (containsKey) {
            Object obj2 = hashMap.get("stepZoom");
            C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((Double) obj2).doubleValue();
            if (doubleValue == 0.0d) {
                doubleValue = this.f7115K;
            } else {
                if (doubleValue != -1.0d) {
                    z = false;
                }
                if (z) {
                    doubleValue = -this.f7115K;
                }
            }
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            C2875d dVar3 = this.f7131k;
            C1924k.m9138d(dVar3);
            dVar3.getController().mo9107h(dVar2.getZoomLevelDouble() + doubleValue);
        } else if (!containsKey && hashMap.containsKey("zoomLevel")) {
            Object obj3 = hashMap.get("zoomLevel");
            C1924k.m9139e(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue2 = ((Double) obj3).doubleValue();
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            dVar4.getController().mo9107h(doubleValue2);
        }
        dVar.mo9291b((Object) null);
    }

    /* renamed from: i0 */
    private final void m9383i0(C2689i.C2694d dVar) {
        this.f7117M = false;
        this.f7118N = false;
        m9355S0().mo11635B(this.f7117M);
        C3523d dVar2 = null;
        C3559d.m15679A(m9355S0(), this.f7118N, false, 2, (Object) null);
        try {
            C3523d dVar3 = this.f7133m;
            if (dVar3 == null) {
                C1924k.m9154t("locationNewOverlay");
            } else {
                dVar2 = dVar3;
            }
            dVar2.mo11560g0();
            dVar.mo9291b(Boolean.TRUE);
        } catch (Exception e) {
            dVar.mo9290a("400", C3168b.m14047b(e), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public final void m9384i1(String str, List<Double> list) {
        int i;
        T t;
        boolean z;
        String str2 = str;
        List<C3593g> C = m9325C0().mo11755C();
        C1924k.m9140f(C, "folderStaticPosition.items");
        Iterator<T> it = C.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C3593g gVar = (C3593g) t;
            C1924k.m9139e(gVar, "null cannot be cast to non-null type org.osmdroid.views.overlay.FolderOverlay");
            String D = ((C3586b) gVar).mo11756D();
            if (D == null || !D.equals(str2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        C3586b bVar = (C3586b) t;
        if (bVar != null) {
            bVar.mo11755C().clear();
        }
        if (bVar != null) {
            m9325C0().mo11757F(bVar);
        }
        if (bVar == null) {
            bVar = new C3586b();
            bVar.mo11758G(str2);
        }
        List list2 = this.f7139s.get(str2);
        if (list2 != null) {
            for (Object next : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C3263l.m14376m();
                }
                Context context = this.f7124d;
                C2875d dVar = this.f7131k;
                C1924k.m9138d(dVar);
                C3405h hVar = new C3405h(context, dVar, this.f7107C);
                hVar.mo11795X((C3472f) next);
                hVar.mo11279e0();
                hVar.mo11284o0(this.f7119O);
                hVar.mo11283n0(new C3158d(this));
                if (!(!this.f7138r.isEmpty()) || !this.f7138r.containsKey(str2)) {
                    List<Double> list3 = list;
                    C3405h.m15007k0(hVar, (Integer) null, (Bitmap) null, (Double) null, 4, (Object) null);
                } else {
                    hVar.mo11281j0((Integer) null, this.f7138r.get(str2), Double.valueOf(list.isEmpty() ^ true ? list.get(i).doubleValue() : 0.0d));
                }
                bVar.mo11754B(hVar);
                i = i2;
            }
        }
        m9325C0().mo11754B(bVar);
        if (!m9355S0().mo11643c()) {
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            dVar2.getOverlays().remove(m9325C0());
            C2875d dVar3 = this.f7131k;
            C1924k.m9138d(dVar3);
            dVar3.getOverlays().add(m9325C0());
        }
        C2875d dVar4 = this.f7131k;
        C1924k.m9138d(dVar4);
        dVar4.invalidate();
    }

    /* renamed from: j0 */
    private final void m9385j0(C3472f fVar) {
        List<C3593g> C = m9415y0().mo11755C();
        C1924k.m9140f(C, "folderMarkers.items");
        ArrayList arrayList = new ArrayList();
        for (T next : C) {
            if (next instanceof C3405h) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            C3472f N = ((C3405h) next2).mo11786N();
            C1924k.m9140f(N, "marker.position");
            if (C3556b.m15667c(N, fVar)) {
                arrayList2.add(next2);
            }
        }
        if (!arrayList2.isEmpty()) {
            m9415y0().mo11755C().removeAll(arrayList2);
            C2745h0 h0Var = this.f7107C;
            if (h0Var != null) {
                C2777o1 unused = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2043f(this, arrayList2, (C3443d<? super C2043f>) null), 3, (Object) null);
            }
            C2875d dVar = this.f7131k;
            C1924k.m9138d(dVar);
            dVar.getOverlays().remove(m9415y0());
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            dVar2.getOverlays().add(m9415y0());
            C2875d dVar3 = this.f7131k;
            C1924k.m9138d(dVar3);
            dVar3.invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static final boolean m9386j1(FlutterOsmView flutterOsmView, C3590f fVar, C2875d dVar) {
        C1924k.m9141g(flutterOsmView, "this$0");
        HashMap hashMap = new HashMap();
        C1924k.m9138d(fVar);
        hashMap.put("lon", Double.valueOf(fVar.mo11786N().mo9100l()));
        hashMap.put("lat", Double.valueOf(fVar.mo11786N().mo9099e()));
        C2689i iVar = flutterOsmView.f7110F;
        if (iVar == null) {
            C1924k.m9154t("methodChannel");
            iVar = null;
        }
        iVar.mo9432c("receiveGeoPoint", hashMap);
        return true;
    }

    /* renamed from: k0 */
    private final void m9387k0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type kotlin.collections.List<java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }>");
        List<HashMap> list = (List) obj;
        ArrayList<C3472f> arrayList = new ArrayList<>(C3264m.m14377n(list, 10));
        for (HashMap i : list) {
            arrayList.add(C3556b.m15673i(i));
        }
        for (C3472f j0 : arrayList) {
            m9385j0(j0);
        }
        dVar.mo9291b(200);
    }

    /* renamed from: k1 */
    private final void m9388k1() {
        C2875d dVar = this.f7131k;
        C1924k.m9138d(dVar);
        dVar.getOverlays().clear();
        if (this.f7117M) {
            try {
                C3523d dVar2 = this.f7133m;
                if (dVar2 == null) {
                    C1924k.m9154t("locationNewOverlay");
                    dVar2 = null;
                }
                if (dVar2.mo7310J()) {
                    C3523d dVar3 = this.f7133m;
                    if (dVar3 == null) {
                        C1924k.m9154t("locationNewOverlay");
                        dVar3 = null;
                    }
                    dVar3.mo11560g0();
                }
            } catch (Exception unused) {
            }
        }
        C2875d dVar4 = this.f7131k;
        C1924k.m9138d(dVar4);
        dVar4.invalidate();
        C3558c cVar = this.f7123S;
        if (cVar != null) {
            this.f7122R.removeView(cVar);
        }
        Point point = new Point();
        C2875d dVar5 = this.f7131k;
        C1924k.m9138d(dVar5);
        C2883f projection = dVar5.getProjection();
        C2875d dVar6 = this.f7131k;
        C1924k.m9138d(dVar6);
        projection.mo10003S(dVar6.getMapCenter(), point);
        Bitmap bitmap = this.f7137q;
        if (bitmap == null) {
            Drawable e = C0490h.m2267e(this.f7124d.getResources(), C3164j.ic_location_on_red_24dp, (Resources.Theme) null);
            C1924k.m9138d(e);
            bitmap = C0519b.m2395b(e, 64, 64, (Bitmap.Config) null, 4, (Object) null);
        }
        this.f7123S = new C3558c(bitmap, this.f7124d, point, this.f7137q != null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        C3558c cVar2 = this.f7123S;
        C1924k.m9138d(cVar2);
        cVar2.setLayoutParams(layoutParams);
        this.f7122R.addView(this.f7123S);
        m9355S0().mo11662x(true);
    }

    /* renamed from: l0 */
    private final void m9389l0(C2688h hVar, C2689i.C2694d dVar) {
        String str = (String) hVar.f9002b;
        if (str != null) {
            List<C3593g> C = m9321A0().mo11755C();
            C1924k.m9140f(C, "folderRoad.items");
            ArrayList<C3409j> arrayList = new ArrayList<>(C3264m.m14377n(C, 10));
            for (C3593g gVar : C) {
                C1924k.m9139e(gVar, "null cannot be cast to non-null type hamza.dali.flutter_osm_plugin.models.FlutterRoad");
                arrayList.add((C3409j) gVar);
            }
            for (C3409j jVar : arrayList) {
                if (C1924k.m9136b(jVar.mo11286J(), str)) {
                    C3409j jVar2 = this.f7105A;
                    if (C1924k.m9136b(jVar2 != null ? jVar2.mo11286J() : null, str)) {
                        m9355S0().mo11651k();
                        this.f7105A = null;
                    }
                    m9321A0().mo11755C().remove(jVar);
                    C2875d dVar2 = this.f7131k;
                    if (dVar2 != null) {
                        dVar2.invalidate();
                    }
                    C2875d dVar3 = this.f7131k;
                    if (dVar3 != null) {
                        dVar3.invalidate();
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        List<C3593g> C2 = m9321A0().mo11755C();
        C1924k.m9140f(C2, "folderRoad.items");
        if (!C2.isEmpty()) {
            m9355S0().mo11651k();
            m9321A0().mo11755C().clear();
            C2875d dVar4 = this.f7131k;
            if (dVar4 != null) {
                dVar4.invalidate();
            }
            this.f7105A = null;
        }
        dVar.mo9291b((Object) null);
    }

    /* renamed from: l1 */
    private final void m9390l1(C2688h hVar, C2689i.C2694d dVar) {
        Double d;
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("id");
        List<HashMap> b = C1936w.m9173b(hashMap.get("point"));
        List O = C3271t.m14400O(C3263l.m14369f());
        List O2 = C3271t.m14400O(C3263l.m14369f());
        C1924k.m9138d(b);
        for (HashMap hashMap2 : b) {
            Object obj2 = hashMap2.get("lat");
            C1924k.m9138d(obj2);
            double doubleValue = ((Number) obj2).doubleValue();
            Object obj3 = hashMap2.get("lon");
            C1924k.m9138d(obj3);
            O.add(new C3472f(doubleValue, ((Number) obj3).doubleValue()));
            if (!hashMap2.containsKey("angle") || (d = (Double) hashMap2.get("angle")) == null) {
                d = Double.valueOf(0.0d);
            }
            O2.add(d);
        }
        if (this.f7139s.containsKey(str)) {
            Log.e(str, "" + b.size());
            List list = this.f7139s.get(str);
            if (list != null) {
                list.clear();
            }
            List list2 = this.f7139s.get(str);
            if (list2 != null) {
                list2.addAll(O);
            }
            List<C3593g> C = m9325C0().mo11755C();
            C1924k.m9140f(C, "folderStaticPosition.items");
            if (!C.isEmpty()) {
                C3586b C0 = m9325C0();
                List<C3593g> C2 = m9325C0().mo11755C();
                C1924k.m9140f(C2, "folderStaticPosition.items");
                for (C3593g gVar : C2) {
                    C1924k.m9139e(gVar, "null cannot be cast to non-null type org.osmdroid.views.overlay.FolderOverlay");
                    String D = ((C3586b) gVar).mo11756D();
                    boolean z = false;
                    if (D != null && D.equals(str)) {
                        z = true;
                        continue;
                    }
                    if (z) {
                        C0.mo11757F(gVar);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } else {
            HashMap<String, List<C3472f>> hashMap3 = this.f7139s;
            C1924k.m9138d(str);
            hashMap3.put(str, O);
        }
        C1924k.m9138d(str);
        m9384i1(str, C3271t.m14398M(O2));
        C2745h0 h0Var = this.f7107C;
        if (h0Var != null) {
            C2777o1 unused = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2040d0(this, str, O, O2, (C3443d<? super C2040d0>) null), 3, (Object) null);
        }
        dVar.mo9291b((Object) null);
    }

    /* renamed from: m0 */
    private final void m9391m0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9138d(obj);
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("lat");
        C1924k.m9138d(obj2);
        double doubleValue = ((Double) obj2).doubleValue();
        Object obj3 = hashMap.get("lon");
        C1924k.m9138d(obj3);
        C3472f fVar = new C3472f(doubleValue, ((Double) obj3).doubleValue());
        Object obj4 = hashMap.get("key");
        C1924k.m9139e(obj4, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj4;
        Object obj5 = hashMap.get("color");
        C1924k.m9139e(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
        List list = (List) obj5;
        Object obj6 = hashMap.get("radius");
        C1924k.m9139e(obj6, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue2 = ((Double) obj6).doubleValue();
        Object obj7 = hashMap.get("stokeWidth");
        C1924k.m9139e(obj7, "null cannot be cast to non-null type kotlin.Double");
        float doubleValue3 = (float) ((Double) obj7).doubleValue();
        int rgb = Color.rgb((int) ((Number) list.get(0)).doubleValue(), (int) ((Number) list.get(2)).doubleValue(), (int) ((Number) list.get(1)).doubleValue());
        ArrayList<C3472f> e0 = C3599l.m15976e0(fVar, doubleValue2);
        C1924k.m9140f(e0, "pointsAsCircle(geoPoint, radius)");
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        C3599l lVar = new C3599l(dVar2);
        lVar.mo11817I(str);
        lVar.mo11831a0(e0);
        lVar.mo11826S().setColor(rgb);
        lVar.mo11826S().setStyle(Paint.Style.FILL);
        lVar.mo11826S().setAlpha(50);
        lVar.mo11827T().setStrokeWidth(doubleValue3);
        lVar.mo11827T().setColor(rgb);
        lVar.mo11835g0(C3159e.f10548a);
        List<C3593g> C = m9413x0().mo11755C();
        C1924k.m9140f(C, "folderCircles.items");
        boolean unused = C3268q.m14383t(C, new C2047g(str));
        m9413x0().mo11755C().add(lVar);
        C2875d dVar3 = this.f7131k;
        C1924k.m9138d(dVar3);
        if (!dVar3.getOverlays().contains(m9323B0())) {
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            dVar4.getOverlays().add(m9323B0());
            if (!m9323B0().mo11755C().contains(m9413x0())) {
                m9323B0().mo11754B(m9413x0());
            }
        }
        C2875d dVar5 = this.f7131k;
        C1924k.m9138d(dVar5);
        dVar5.invalidate();
        dVar.mo9291b((Object) null);
    }

    /* renamed from: m1 */
    private final void m9392m1(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        try {
            Object obj2 = hashMap.get("id");
            C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = hashMap.get("bitmap");
            C1924k.m9139e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj3;
            Bitmap v0 = m9409v0(bArr);
            Object obj4 = hashMap.get("refresh");
            C1924k.m9139e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            this.f7138r.put(str, v0);
            m9355S0().mo11641a(str, bArr);
            C2745h0 h0Var = this.f7107C;
            if (h0Var != null) {
                C2777o1 unused = C2744h.m12366b(h0Var, (C3448g) null, (C2753j0) null, new C2042e0(this, str, booleanValue, (C3443d<? super C2042e0>) null), 3, (Object) null);
            }
            dVar.mo9291b((Object) null);
        } catch (Exception e) {
            Log.e("id", String.valueOf(hashMap.get("id")));
            Log.e("err static point marker", C3168b.m14047b(e));
            dVar.mo9290a("400", "error to getBitmap static Position", "");
            this.f7138r = new HashMap<>();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final boolean m9393n0(C3599l lVar, C2875d dVar, C3472f fVar) {
        lVar.mo11810B();
        return false;
    }

    /* renamed from: n1 */
    private final void m9394n1(boolean z, boolean z2, C2689i.C2694d dVar) {
        try {
            if (this.f7140t != null) {
                m9415y0().mo11755C().remove(this.f7140t);
                C2875d dVar2 = this.f7131k;
                if (dVar2 != null) {
                    dVar2.invalidate();
                }
            }
            C3523d dVar3 = this.f7133m;
            if (dVar3 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar3 = null;
            }
            if (dVar3.mo7311K()) {
                C3523d dVar4 = this.f7133m;
                if (dVar4 == null) {
                    C1924k.m9154t("locationNewOverlay");
                    dVar4 = null;
                }
                dVar4.mo7304D();
            }
            C3523d dVar5 = this.f7133m;
            if (dVar5 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar5 = null;
            }
            dVar5.mo11561h0(z2);
            C3523d dVar6 = this.f7133m;
            if (dVar6 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar6 = null;
            }
            if (!dVar6.mo7311K()) {
                this.f7118N = true;
                C3523d dVar7 = this.f7133m;
                if (dVar7 == null) {
                    C1924k.m9154t("locationNewOverlay");
                    dVar7 = null;
                }
                dVar7.mo7307G();
                C3559d.m15679A(m9355S0(), this.f7118N, false, 2, (Object) null);
            }
            C3523d dVar8 = this.f7133m;
            if (dVar8 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar8 = null;
            }
            dVar8.mo11563j0(z);
            C3523d dVar9 = this.f7133m;
            if (dVar9 == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar9 = null;
            }
            if (!dVar9.mo7310J()) {
                this.f7117M = true;
                C3523d dVar10 = this.f7133m;
                if (dVar10 == null) {
                    C1924k.m9154t("locationNewOverlay");
                    dVar10 = null;
                }
                dVar10.mo7306F();
                C3523d dVar11 = this.f7133m;
                if (dVar11 == null) {
                    C1924k.m9154t("locationNewOverlay");
                    dVar11 = null;
                }
                dVar11.mo11558d0(new C2044f0(this));
                m9355S0().mo11635B(this.f7117M);
                C3559d.m15679A(m9355S0(), this.f7118N, false, 2, (Object) null);
                dVar.mo9291b(Boolean.TRUE);
                return;
            }
            dVar.mo9291b((Object) null);
        } catch (Exception e) {
            dVar.mo9290a("400", C3168b.m14047b(e), "");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00eb A[LOOP:2: B:28:0x00e5->B:30:0x00eb, LOOP_END] */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9395o0(p091n2.C2688h r21, p091n2.C2689i.C2694d r22) {
        /*
            r20 = this;
            r6 = r20
            r0 = r21
            java.lang.Object r0 = r0.f9002b
            p041f3.C1924k.m9138d(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = p133u2.C3263l.m14369f()
            java.util.List r1 = p133u2.C3271t.m14400O(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0136
            java.lang.Object r2 = r0.next()
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "wayPoints"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.List<java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }>"
            p041f3.C1924k.m9139e(r3, r4)
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r8 = p133u2.C3264m.m14377n(r3, r7)
            r5.<init>(r8)
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r8 = r3.hasNext()
            java.lang.String r9 = "lon"
            java.lang.String r10 = "lat"
            if (r8 == 0) goto L_0x0072
            java.lang.Object r8 = r3.next()
            java.util.HashMap r8 = (java.util.HashMap) r8
            w4.f r11 = new w4.f
            java.lang.Object r10 = r8.get(r10)
            p041f3.C1924k.m9138d(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            double r12 = r10.doubleValue()
            java.lang.Object r8 = r8.get(r9)
            p041f3.C1924k.m9138d(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            r11.<init>((double) r12, (double) r8)
            r5.add(r11)
            goto L_0x003f
        L_0x0072:
            java.util.List r15 = p133u2.C3271t.m14398M(r5)
            java.lang.String r3 = "roadType"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            p041f3.C1924k.m9139e(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r8 = r3.hashCode()
            r11 = 98260(0x17fd4, float:1.37692E-40)
            java.lang.String r12 = "routed-car/route/v1/driving/"
            if (r8 == r11) goto L_0x00b3
            r11 = 3023841(0x2e23e1, float:4.237304E-39)
            if (r8 == r11) goto L_0x00a5
            r11 = 3148910(0x300c6e, float:4.412563E-39)
            if (r8 == r11) goto L_0x0099
            goto L_0x00b9
        L_0x0099:
            java.lang.String r8 = "foot"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x00a2
            goto L_0x00b9
        L_0x00a2:
            java.lang.String r3 = "routed-foot/route/v1/driving/"
            goto L_0x00b0
        L_0x00a5:
            java.lang.String r8 = "bike"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x00ae
            goto L_0x00b9
        L_0x00ae:
            java.lang.String r3 = "routed-bike/route/v1/driving/"
        L_0x00b0:
            r17 = r3
            goto L_0x00bb
        L_0x00b3:
            java.lang.String r8 = "car"
            boolean r3 = r3.equals(r8)
        L_0x00b9:
            r17 = r12
        L_0x00bb:
            v1.o r18 = p138v1.C3412l.m15039b(r2)
            java.lang.String r3 = "middlePoints"
            boolean r8 = r2.containsKey(r3)
            r11 = 1
            if (r8 != r11) goto L_0x00d2
            java.lang.Object r3 = r2.get(r3)
            p041f3.C1924k.m9139e(r3, r4)
            java.util.List r3 = (java.util.List) r3
            goto L_0x00d8
        L_0x00d2:
            if (r8 != 0) goto L_0x0130
            java.util.List r3 = p133u2.C3263l.m14369f()
        L_0x00d8:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = p133u2.C3264m.m14377n(r3, r7)
            r4.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e5:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0114
            java.lang.Object r7 = r3.next()
            java.util.HashMap r7 = (java.util.HashMap) r7
            w4.f r8 = new w4.f
            java.lang.Object r11 = r7.get(r10)
            p041f3.C1924k.m9138d(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            double r11 = r11.doubleValue()
            java.lang.Object r7 = r7.get(r9)
            p041f3.C1924k.m9138d(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            double r13 = r7.doubleValue()
            r8.<init>((double) r11, (double) r13)
            r4.add(r8)
            goto L_0x00e5
        L_0x0114:
            java.util.List r16 = p133u2.C3271t.m14398M(r4)
            java.lang.String r3 = "key"
            java.lang.Object r2 = r2.get(r3)
            p041f3.C1924k.m9139e(r2, r5)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            v1.k r2 = new v1.k
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r1.add(r2)
            goto L_0x0017
        L_0x0130:
            t2.j r0 = new t2.j
            r0.<init>()
            throw r0
        L_0x0136:
            r20.m9368Z()
            org.osmdroid.views.d r0 = r6.f7131k
            p041f3.C1924k.m9138d(r0)
            r0.invalidate()
            java.util.List r0 = p133u2.C3263l.m14369f()
            java.util.List r3 = p133u2.C3271t.m14400O(r0)
            n3.h0 r7 = r6.f7107C
            if (r7 == 0) goto L_0x0164
            n3.d0 r8 = p092n3.C2799v0.m12531a()
            r9 = 0
            hamza.dali.flutter_osm_plugin.FlutterOsmView$h r10 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$h
            r5 = 0
            r0 = r10
            r2 = r20
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = 2
            r12 = 0
            n3.o1 r0 = p092n3.C2744h.m12366b(r7, r8, r9, r10, r11, r12)
            goto L_0x0165
        L_0x0164:
            r0 = 0
        L_0x0165:
            r6.f7106B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.m9395o0(n2.h, n2.i$d):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: v1.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: v1.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: v1.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: v1.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9396o1(p091n2.C2688h r21, p091n2.C2689i.C2694d r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Object r1 = r1.f9002b
            java.lang.String r3 = "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }"
            p041f3.C1924k.m9139e(r1, r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "point"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r4 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Double>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Double> }"
            p041f3.C1924k.m9139e(r3, r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            w4.f r3 = p156y1.C3556b.m15673i(r3)
            android.graphics.Bitmap r4 = r0.f7134n
            java.lang.String r5 = "icon"
            boolean r6 = r1.containsKey(r5)
            r7 = 0
            if (r6 == 0) goto L_0x004a
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
            p041f3.C1924k.m9139e(r4, r5)
            byte[] r4 = (byte[]) r4
            android.graphics.Bitmap r4 = r0.m9409v0(r4)
            n3.h0 r8 = r0.f7107C
            if (r8 == 0) goto L_0x004a
            r9 = 0
            r10 = 0
            hamza.dali.flutter_osm_plugin.FlutterOsmView$g0 r11 = new hamza.dali.flutter_osm_plugin.FlutterOsmView$g0
            r11.<init>(r0, r3, r1, r7)
            r12 = 3
            r13 = 0
            p092n3.C2777o1 unused = p092n3.C2744h.m12366b(r8, r9, r10, r11, r12, r13)
        L_0x004a:
            r16 = r4
            y4.b r1 = r20.m9415y0()
            java.util.List r1 = r1.mo11755C()
            java.lang.String r4 = "folderMarkers.items"
            p041f3.C1924k.m9140f(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0062:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof p138v1.C3405h
            if (r6 == 0) goto L_0x0062
            r4.add(r5)
            goto L_0x0062
        L_0x0074:
            java.util.Iterator r1 = r4.iterator()
        L_0x0078:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r1.next()
            r5 = r4
            v1.h r5 = (p138v1.C3405h) r5
            w4.f r5 = r5.mo11786N()
            java.lang.String r6 = "marker.position"
            p041f3.C1924k.m9140f(r5, r6)
            boolean r5 = p156y1.C3556b.m15667c(r5, r3)
            if (r5 == 0) goto L_0x0078
            r7 = r4
        L_0x0095:
            v1.h r7 = (p138v1.C3405h) r7
            r1 = 1
            if (r7 == 0) goto L_0x009c
            r3 = 1
            goto L_0x009d
        L_0x009c:
            r3 = 0
        L_0x009d:
            if (r3 != r1) goto L_0x00d3
            r15 = 0
            r17 = 0
            r18 = 4
            r19 = 0
            r14 = r7
            p138v1.C3405h.m15007k0(r14, r15, r16, r17, r18, r19)
            y4.b r1 = r20.m9415y0()
            java.util.List r1 = r1.mo11755C()
            int r1 = r1.indexOf(r7)
            y4.b r3 = r20.m9415y0()
            java.util.List r3 = r3.mo11755C()
            r3.set(r1, r7)
            org.osmdroid.views.d r1 = r0.f7131k
            p041f3.C1924k.m9138d(r1)
            r1.invalidate()
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo9291b(r1)
            goto L_0x00de
        L_0x00d3:
            if (r3 != 0) goto L_0x00de
            java.lang.String r1 = "404"
            java.lang.String r3 = "GeoPoint not found"
            java.lang.String r4 = "you trying to modify icon of marker not exist"
            r2.mo9290a(r1, r3, r4)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.m9396o1(n2.h, n2.i$d):void");
    }

    /* renamed from: p0 */
    private final void m9397p0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9138d(obj);
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("lat");
        C1924k.m9138d(obj2);
        double doubleValue = ((Double) obj2).doubleValue();
        Object obj3 = hashMap.get("lon");
        C1924k.m9138d(obj3);
        C3472f fVar = new C3472f(doubleValue, ((Double) obj3).doubleValue());
        Object obj4 = hashMap.get("key");
        C1924k.m9139e(obj4, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj4;
        Object obj5 = hashMap.get("color");
        C1924k.m9139e(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
        List list = (List) obj5;
        Object obj6 = hashMap.get("distance");
        C1924k.m9139e(obj6, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue2 = ((Double) obj6).doubleValue();
        Object obj7 = hashMap.get("stokeWidth");
        C1924k.m9139e(obj7, "null cannot be cast to non-null type kotlin.Double");
        float doubleValue3 = (float) ((Double) obj7).doubleValue();
        int rgb = Color.rgb((int) ((Number) list.get(0)).doubleValue(), (int) ((Number) list.get(1)).doubleValue(), (int) ((Number) list.get(2)).doubleValue());
        ArrayList<C2491a> f0 = C3599l.m15977f0(fVar, doubleValue2, doubleValue2);
        C1924k.m9140f(f0, "pointsAsRect(geoPoint, distance, distance)");
        List M = C3271t.m14398M(f0);
        C1924k.m9139e(M, "null cannot be cast to non-null type kotlin.collections.List<org.osmdroid.util.GeoPoint>");
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        C3599l lVar = new C3599l(dVar2);
        lVar.mo11817I(str);
        lVar.mo11831a0(M);
        lVar.mo11826S().setColor(rgb);
        lVar.mo11826S().setStyle(Paint.Style.FILL);
        lVar.mo11826S().setAlpha(50);
        lVar.mo11827T().setStrokeWidth(doubleValue3);
        lVar.mo11827T().setColor(rgb);
        lVar.mo11835g0(C3160f.f10549a);
        List<C3593g> C = m9417z0().mo11755C();
        C1924k.m9140f(C, "folderRect.items");
        boolean unused = C3268q.m14383t(C, new C2055i(str));
        m9417z0().mo11755C().add(lVar);
        C2875d dVar3 = this.f7131k;
        C1924k.m9138d(dVar3);
        if (!dVar3.getOverlays().contains(m9323B0())) {
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            dVar4.getOverlays().add(m9323B0());
            if (!m9323B0().mo11755C().contains(m9417z0())) {
                m9323B0().mo11754B(m9417z0());
            }
        }
        C2875d dVar5 = this.f7131k;
        C1924k.m9138d(dVar5);
        dVar5.invalidate();
        dVar.mo9291b((Object) null);
    }

    /* renamed from: p1 */
    private final void m9398p1(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) obj;
        Object obj2 = map.get("north");
        C1924k.m9138d(obj2);
        double doubleValue = ((Double) obj2).doubleValue();
        Object obj3 = map.get("east");
        C1924k.m9138d(obj3);
        Object obj4 = map.get("south");
        C1924k.m9138d(obj4);
        double doubleValue2 = ((Double) obj4).doubleValue();
        Object obj5 = map.get("west");
        C1924k.m9138d(obj5);
        C3457a e = C3457a.m15177e(C3257h.m14330u(new C3472f[]{new C3472f(doubleValue, ((Double) obj3).doubleValue()), new C3472f(doubleValue2, ((Double) obj5).doubleValue())}));
        C2875d dVar2 = this.f7131k;
        if (dVar2 != null) {
            Object obj6 = map.get("padding");
            C1924k.m9138d(obj6);
            dVar2.mo9892U(e, true, ((Integer) obj6).intValue());
        }
        dVar.mo9291b((Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final boolean m9399q0(C3599l lVar, C2875d dVar, C3472f fVar) {
        lVar.mo11810B();
        return false;
    }

    /* renamed from: r0 */
    private final void m9401r0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9138d(obj);
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("roadType");
        C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        int hashCode = str.hashCode();
        String str2 = "routed-car/route/v1/driving/";
        if (hashCode == 98260) {
            boolean equals = str.equals("car");
        } else if (hashCode != 3023841) {
            if (hashCode == 3148910 && str.equals("foot")) {
                str2 = "routed-foot/route/v1/driving/";
            }
        } else if (str.equals("bike")) {
            str2 = "routed-bike/route/v1/driving/";
        }
        Object obj3 = hashMap.get("zoomIntoRegion");
        C1924k.m9139e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C3411k a = C3412l.m15038a(hashMap);
        m9368Z();
        C1932s sVar = new C1932s();
        sVar.f6903d = C3263l.m14369f();
        if (this.f7114J == null) {
            this.f7114J = new C2816a(this.f7124d, "json/application");
        }
        C2816a aVar = this.f7114J;
        if (aVar != null) {
            aVar.mo9611j(str2);
            C1932s sVar2 = new C1932s();
            sVar2.f6903d = "";
            C2745h0 h0Var = this.f7107C;
            this.f7106B = h0Var != null ? C2744h.m12366b(h0Var, C2799v0.m12531a(), (C2753j0) null, new C2056j(a, aVar, sVar2, this, sVar, booleanValue, dVar, (C3443d<? super C2056j>) null), 2, (Object) null) : null;
        }
    }

    /* renamed from: s0 */
    private final void m9403s0(C2688h hVar, C2689i.C2694d dVar) {
        Object obj = hVar.f9002b;
        C1924k.m9139e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("key");
        C1924k.m9139e(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = hashMap.get("road");
        C1924k.m9139e(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = hashMap.get("roadColor");
        C1924k.m9139e(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        int m = C3556b.m15677m((List) obj4);
        Object obj5 = hashMap.get("roadWidth");
        C1924k.m9139e(obj5, "null cannot be cast to non-null type kotlin.Double");
        float doubleValue = (float) ((Double) obj5).doubleValue();
        Object obj6 = hashMap.get("roadBorderWidth");
        C1924k.m9139e(obj6, "null cannot be cast to non-null type kotlin.Double");
        float doubleValue2 = (float) ((Double) obj6).doubleValue();
        Object obj7 = hashMap.get("roadBorderColor");
        C1924k.m9139e(obj7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        int m2 = C3556b.m15677m((List) obj7);
        Object obj8 = hashMap.get("zoomIntoRegion");
        C1924k.m9139e(obj8, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj8).booleanValue();
        m9368Z();
        ArrayList<C3472f> a = C2856c.m12938a((String) obj3, 10, false);
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        C3601m mVar = new C3601m(dVar2);
        mVar.mo11831a0(a);
        C3556b.m15671g(mVar, m, doubleValue, Integer.valueOf(m2), doubleValue2);
        m9381h0(this, str, mVar, 0.0d, 0.0d, 12, (Object) null);
        C3559d S0 = m9355S0();
        List f = C3263l.m14369f();
        C1924k.m9140f(a, "route");
        C3601m mVar2 = mVar;
        S0.mo11648h(new C3561f(a, Integer.valueOf(m), Integer.valueOf(m), doubleValue, doubleValue, str, 0.0d, 0.0d, f));
        if (booleanValue) {
            C2875d dVar3 = this.f7131k;
            C1924k.m9138d(dVar3);
            dVar3.mo9892U(C3457a.m15177e(mVar2.mo11824Q()), true, 64);
        }
        C2875d dVar4 = this.f7131k;
        C1924k.m9138d(dVar4);
        dVar4.invalidate();
        dVar.mo9291b((Object) null);
    }

    /* renamed from: t0 */
    private final void m9405t0() {
        C3558c cVar = this.f7123S;
        C3523d dVar = null;
        if (cVar != null) {
            this.f7122R.removeView(cVar);
            C2875d dVar2 = this.f7131k;
            C1924k.m9138d(dVar2);
            if (!dVar2.getOverlays().contains(m9323B0())) {
                C2875d dVar3 = this.f7131k;
                C1924k.m9138d(dVar3);
                dVar3.getOverlays().add(m9323B0());
            }
            C2875d dVar4 = this.f7131k;
            C1924k.m9138d(dVar4);
            if (!dVar4.getOverlays().contains(m9321A0())) {
                C2875d dVar5 = this.f7131k;
                C1924k.m9138d(dVar5);
                dVar5.getOverlays().add(m9321A0());
            }
            C2875d dVar6 = this.f7131k;
            C1924k.m9138d(dVar6);
            if (!dVar6.getOverlays().contains(m9325C0())) {
                C2875d dVar7 = this.f7131k;
                C1924k.m9138d(dVar7);
                dVar7.getOverlays().add(m9325C0());
            }
            this.f7123S = null;
        }
        m9379f1();
        C3523d dVar8 = this.f7133m;
        if (dVar8 == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar8 = null;
        }
        dVar8.mo7312L(new C3156b(this));
        C2875d dVar9 = this.f7131k;
        C1924k.m9138d(dVar9);
        List<C3593g> overlays = dVar9.getOverlays();
        C3523d dVar10 = this.f7133m;
        if (dVar10 == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar10 = null;
        }
        if (!overlays.contains(dVar10)) {
            C2875d dVar11 = this.f7131k;
            C1924k.m9138d(dVar11);
            List<C3593g> overlays2 = dVar11.getOverlays();
            C3523d dVar12 = this.f7133m;
            if (dVar12 == null) {
                C1924k.m9154t("locationNewOverlay");
            } else {
                dVar = dVar12;
            }
            overlays2.add(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m9407u0(FlutterOsmView flutterOsmView) {
        C1924k.m9141g(flutterOsmView, "this$0");
        C2745h0 h0Var = flutterOsmView.f7107C;
        C1924k.m9138d(h0Var);
        C2777o1 unused = C2744h.m12366b(h0Var, C2799v0.m12533c(), (C2753j0) null, new C2058k(flutterOsmView, (C3443d<? super C2058k>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public final Bitmap m9409v0(byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        C1924k.m9140f(decodeByteArray, "decodeByteArray(bytes, 0, bytes.size)");
        return decodeByteArray;
    }

    /* renamed from: w0 */
    private final byte[] m9411w0(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: x0 */
    private final C3586b m9413x0() {
        return (C3586b) this.f7143w.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public final C3586b m9415y0() {
        return (C3586b) this.f7146z.getValue();
    }

    /* renamed from: z0 */
    private final C3586b m9417z0() {
        return (C3586b) this.f7144x.getValue();
    }

    /* renamed from: F0 */
    public final double mo7768F0() {
        return this.f7116L;
    }

    /* renamed from: H0 */
    public final C2875d mo7769H0() {
        return this.f7131k;
    }

    /* renamed from: a */
    public boolean mo7770a(int i, int i2, Intent intent) {
        C2689i.C2694d dVar;
        if (i == 200) {
            this.f7108D = true;
            if ((m9329E0().isProviderEnabled("gps") || m9329E0().isProviderEnabled("network")) && (dVar = this.f7109E) != null) {
                C1924k.m9138d(dVar);
                m9341L0(dVar, new C2070v(this));
            }
        } else if (i == 201) {
            this.f7108D = true;
            if (m9329E0().isProviderEnabled("gps")) {
                m9405t0();
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo7771b() {
        C3523d dVar = this.f7133m;
        if (dVar == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar = null;
        }
        dVar.mo7303C();
        C3523d dVar2 = this.f7133m;
        if (dVar2 == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar2 = null;
        }
        dVar2.mo7323s();
        C2777o1 o1Var = this.f7106B;
        if (o1Var != null && o1Var.mo9450a()) {
            C2777o1.C2778a.m12478a(o1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f7122R.removeAllViews();
        C0988f a = this.f7127g.mo10534a();
        if (a != null) {
            a.mo3777d(this);
        }
    }

    /* renamed from: b1 */
    public final void mo7772b1(Activity activity) {
        C1924k.m9141g(activity, "activity");
        this.f7112H = activity;
    }

    /* renamed from: c */
    public void mo7644c(Bundle bundle) {
        String str;
        if (bundle == null || (str = bundle.getString("center")) == null) {
            str = "";
        }
        Log.d("osm data", str);
    }

    /* renamed from: d */
    public void mo7645d(Bundle bundle) {
        C1924k.m9141g(bundle, "bundle");
        StringBuilder sb = new StringBuilder();
        C2875d dVar = this.f7131k;
        C1924k.m9138d(dVar);
        sb.append(dVar.getMapCenter().mo9099e());
        sb.append(',');
        C2875d dVar2 = this.f7131k;
        C1924k.m9138d(dVar2);
        sb.append(dVar2.getMapCenter().mo9100l());
        bundle.putString("center", sb.toString());
        C2875d dVar3 = this.f7131k;
        C1924k.m9138d(dVar3);
        bundle.putString("zoom", String.valueOf(dVar3.getZoomLevelDouble()));
    }

    /* renamed from: e */
    public void mo3077e(C1005m mVar) {
        C1924k.m9141g(mVar, "owner");
        C0971b.m4434d(this, mVar);
        C3153a.f10538b.mo10533d().set(3);
        Log.e("osm", "osm flutter plugin resume");
        if (this.f7131k == null) {
            m9347O0();
        }
        C2875d dVar = this.f7131k;
        if (dVar != null) {
            dVar.mo9878D();
        }
        C3523d dVar2 = this.f7133m;
        if (dVar2 == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar2 = null;
        }
        dVar2.mo7324t();
    }

    /* renamed from: e1 */
    public final void mo7773e1(double d) {
        this.f7116L = d;
    }

    /* renamed from: f */
    public void mo3078f(C1005m mVar) {
        C1924k.m9141g(mVar, "owner");
        C0971b.m4432b(this, mVar);
        C3523d dVar = this.f7133m;
        if (dVar == null) {
            C1924k.m9154t("locationNewOverlay");
            dVar = null;
        }
        dVar.mo11559f0();
        C3153a.C3154a aVar = C3153a.f10538b;
        C1910c c = aVar.mo10532c();
        C1924k.m9138d(c);
        c.mo7643i(this);
        this.f7122R.removeAllViews();
        m9359U0();
        C2689i iVar = this.f7110F;
        if (iVar == null) {
            C1924k.m9154t("methodChannel");
            iVar = null;
        }
        iVar.mo9434e((C2689i.C2693c) null);
        this.f7131k = null;
        aVar.mo10533d().set(6);
    }

    /* renamed from: g */
    public void mo3079g(C1005m mVar) {
        C1924k.m9141g(mVar, "owner");
        C0971b.m4431a(this, mVar);
        C3153a.f10538b.mo10533d().set(1);
        C2679b bVar = this.f7125e;
        C2689i iVar = new C2689i(bVar, "plugins.dali.hamza/osmview_" + this.f7126f);
        this.f7110F = iVar;
        iVar.mo9434e(this);
        this.f7107C = C1003k.m4471a(mVar.mo102a());
        m9325C0().mo11758G("staticPositionGeoPoint");
        C2956c a = C2954a.m13328a();
        Context context = this.f7124d;
        a.mo10190x(context, C1999b.m9252a(context));
        m9347O0();
        Log.e("osm", "osm flutter plugin create");
    }

    /* renamed from: g1 */
    public final void mo7774g1(double d) {
        this.f7115K = d;
    }

    /* renamed from: h */
    public void mo7775h(View view) {
        C1924k.m9141g(view, "flutterView");
        if (this.f7131k == null) {
            C1924k.m9140f(C1999b.m9252a(this.f7124d), "getDefaultSharedPreferences(context)");
            C2956c a = C2954a.m13328a();
            Context context = this.f7124d;
            a.mo10190x(context, C1999b.m9252a(context));
        }
    }

    /* renamed from: i */
    public void mo7776i() {
        this.f7138r.clear();
        this.f7139s.clear();
        this.f7134n = null;
    }

    /* renamed from: k */
    public /* synthetic */ void mo7777k() {
        C2249e.m10452b(this);
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [l4.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f5, code lost:
        r11.mo9291b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r11.mo9291b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7778l(p091n2.C2688h r10, p091n2.C2689i.C2694d r11) {
        /*
            r9 = this;
            java.lang.String r0 = "call"
            p041f3.C1924k.m9141g(r10, r0)
            java.lang.String r0 = "result"
            p041f3.C1924k.m9141g(r11, r0)
            java.lang.String r0 = r10.f9001a     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x041f
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x0423 }
            java.lang.String r2 = "activity"
            java.lang.String r3 = "gps"
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Boolean"
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 0
            switch(r1) {
                case -1933644868: goto L_0x0412;
                case -1914453668: goto L_0x03f4;
                case -1797532247: goto L_0x03e7;
                case -1709882463: goto L_0x0383;
                case -1598295761: goto L_0x0374;
                case -1594177560: goto L_0x034b;
                case -1527480905: goto L_0x033c;
                case -1182150033: goto L_0x032d;
                case -1177287944: goto L_0x031e;
                case -1161293492: goto L_0x030f;
                case -1067396029: goto L_0x02e3;
                case -831520337: goto L_0x02d4;
                case -799103212: goto L_0x02c5;
                case -792190932: goto L_0x029a;
                case -789592470: goto L_0x028b;
                case -756000132: goto L_0x027c;
                case -739068643: goto L_0x0263;
                case -567206334: goto L_0x0254;
                case -525500686: goto L_0x0245;
                case -423785202: goto L_0x0236;
                case -409550687: goto L_0x0227;
                case -398127831: goto L_0x0218;
                case -349025661: goto L_0x0209;
                case -319981218: goto L_0x01fa;
                case -140429234: goto L_0x01ba;
                case -38665068: goto L_0x01ab;
                case -23479284: goto L_0x0198;
                case 2791411: goto L_0x0189;
                case 3505952: goto L_0x017a;
                case 91295171: goto L_0x016b;
                case 134782292: goto L_0x015c;
                case 172454690: goto L_0x014d;
                case 326080562: goto L_0x0132;
                case 462250233: goto L_0x0123;
                case 572859465: goto L_0x0114;
                case 651690125: goto L_0x0105;
                case 697581447: goto L_0x00f6;
                case 907591303: goto L_0x00e7;
                case 1143229641: goto L_0x00d8;
                case 1333332893: goto L_0x00c9;
                case 1410004207: goto L_0x00ba;
                case 1480285272: goto L_0x00ab;
                case 1635165311: goto L_0x009c;
                case 1743796968: goto L_0x008d;
                case 1871441633: goto L_0x0060;
                case 1920492800: goto L_0x0051;
                case 1948315180: goto L_0x0042;
                case 2006435551: goto L_0x0033;
                case 2133331563: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x041f
        L_0x0021:
            java.lang.String r10 = "advanced#selection"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x002b
            goto L_0x041f
        L_0x002b:
            r9.m9388k1()     // Catch:{ Exception -> 0x0423 }
        L_0x002e:
            r11.mo9291b(r8)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0033:
            java.lang.String r1 = "user#removeMarkerPosition"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x003d
            goto L_0x041f
        L_0x003d:
            r9.m9363W0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0042:
            java.lang.String r1 = "initMap"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x004c
            goto L_0x041f
        L_0x004c:
            r9.m9349P0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0051:
            java.lang.String r10 = "get#Zoom"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x005b
            goto L_0x041f
        L_0x005b:
            p126t1.C3161g.m14040b(r9, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0060:
            java.lang.String r10 = "user#position"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x006a
            goto L_0x041f
        L_0x006a:
            android.location.LocationManager r10 = r9.m9329E0()     // Catch:{ Exception -> 0x0423 }
            boolean r10 = r10.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0423 }
            if (r10 != r7) goto L_0x0079
            m9343M0(r9, r11, r8, r5, r8)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0079:
            if (r10 != 0) goto L_0x0451
            r9.f7109E = r11     // Catch:{ Exception -> 0x0423 }
            r10 = 200(0xc8, float:2.8E-43)
            android.app.Activity r0 = r9.f7112H     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0087
            p041f3.C1924k.m9154t(r2)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0088
        L_0x0087:
            r8 = r0
        L_0x0088:
            p156y1.C3556b.m15668d(r9, r10, r8)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x008d:
            java.lang.String r1 = "limitArea"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0097
            goto L_0x041f
        L_0x0097:
            r9.m9351Q0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x009c:
            java.lang.String r1 = "staticPosition#IconMarker"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x00a6
            goto L_0x041f
        L_0x00a6:
            r9.m9392m1(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x00ab:
            java.lang.String r10 = "get#position#advanced#selection"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x00b5
            goto L_0x041f
        L_0x00b5:
            m9375d0(r9, r11, r6, r5, r8)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x00ba:
            java.lang.String r1 = "draw#circle"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x00c4
            goto L_0x041f
        L_0x00c4:
            r9.m9391m0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x00c9:
            java.lang.String r10 = "clear#roads"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x00d3
            goto L_0x041f
        L_0x00d3:
            r9.m9370a0(r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x00d8:
            java.lang.String r1 = "draw#multi#road"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x00e2
            goto L_0x041f
        L_0x00e2:
            r9.m9395o0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x00e7:
            java.lang.String r10 = "get#geopoints"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x00f1
            goto L_0x041f
        L_0x00f1:
            r9.m9327D0(r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x00f6:
            java.lang.String r10 = "map#setCache"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x0100
            goto L_0x041f
        L_0x0100:
            r9.m9374c1()     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x0105:
            java.lang.String r1 = "change#Marker"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x010f
            goto L_0x041f
        L_0x010f:
            r9.m9366Y(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0114:
            java.lang.String r1 = "goto#position"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x011e
            goto L_0x041f
        L_0x011e:
            r9.m9345N0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0123:
            java.lang.String r1 = "changePosition"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x012d
            goto L_0x041f
        L_0x012d:
            r9.m9364X(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0132:
            java.lang.String r1 = "change#stepZoom"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x013c
            goto L_0x041f
        L_0x013c:
            java.lang.Object r10 = r10.f9002b     // Catch:{ Exception -> 0x0423 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Double"
            p041f3.C1924k.m9139e(r10, r0)     // Catch:{ Exception -> 0x0423 }
            java.lang.Double r10 = (java.lang.Double) r10     // Catch:{ Exception -> 0x0423 }
            double r0 = r10.doubleValue()     // Catch:{ Exception -> 0x0423 }
            r9.f7115K = r0     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x014d:
            java.lang.String r1 = "marker#icon"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0157
            goto L_0x041f
        L_0x0157:
            r9.m9358U(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x015c:
            java.lang.String r1 = "update#Marker"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0166
            goto L_0x041f
        L_0x0166:
            r9.m9396o1(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x016b:
            java.lang.String r1 = "draw#rect"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0175
            goto L_0x041f
        L_0x0175:
            r9.m9397p0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x017a:
            java.lang.String r1 = "road"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0184
            goto L_0x041f
        L_0x0184:
            r9.m9401r0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0189:
            java.lang.String r1 = "Zoom"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0193
            goto L_0x041f
        L_0x0193:
            r9.m9382h1(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0198:
            java.lang.String r10 = "map#clearCache#view"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x01a2
            goto L_0x041f
        L_0x01a2:
            y1.d r10 = r9.m9355S0()     // Catch:{ Exception -> 0x0423 }
            r10.mo11660u(r7)     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x01ab:
            java.lang.String r1 = "config#Zoom"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x01b5
            goto L_0x041f
        L_0x01b5:
            p126t1.C3161g.m14039a(r9, r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x01ba:
            java.lang.String r10 = "currentLocation"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x01c4
            goto L_0x041f
        L_0x01c4:
            android.location.LocationManager r10 = r9.m9329E0()     // Catch:{ Exception -> 0x0423 }
            boolean r10 = r10.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x01da
            android.location.LocationManager r10 = r9.m9329E0()     // Catch:{ Exception -> 0x0423 }
            java.lang.String r0 = "network"
            boolean r10 = r10.isProviderEnabled(r0)     // Catch:{ Exception -> 0x0423 }
            if (r10 == 0) goto L_0x01db
        L_0x01da:
            r6 = 1
        L_0x01db:
            if (r6 != r7) goto L_0x01e1
            r9.m9405t0()     // Catch:{ Exception -> 0x0423 }
            goto L_0x01ef
        L_0x01e1:
            r10 = 201(0xc9, float:2.82E-43)
            android.app.Activity r0 = r9.f7112H     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x01eb
            p041f3.C1924k.m9154t(r2)     // Catch:{ Exception -> 0x0423 }
            goto L_0x01ec
        L_0x01eb:
            r8 = r0
        L_0x01ec:
            p156y1.C3556b.m15668d(r9, r10, r8)     // Catch:{ Exception -> 0x0423 }
        L_0x01ef:
            boolean r10 = r9.f7118N     // Catch:{ Exception -> 0x0423 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x0423 }
        L_0x01f5:
            r11.mo9291b(r10)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x01fa:
            java.lang.String r10 = "removeCache"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x0204
            goto L_0x041f
        L_0x0204:
            r9.m9359U0()     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x0209:
            java.lang.String r1 = "remove#rect"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0213
            goto L_0x041f
        L_0x0213:
            r9.m9365X0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0218:
            java.lang.String r1 = "map#orientation"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0222
            goto L_0x041f
        L_0x0222:
            r9.m9353R0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0227:
            java.lang.String r1 = "delete#markers"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0231
            goto L_0x041f
        L_0x0231:
            r9.m9387k0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0236:
            java.lang.String r10 = "confirm#advanced#selection"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x0240
            goto L_0x041f
        L_0x0240:
            r9.m9373c0(r11, r7)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0245:
            java.lang.String r1 = "drawRoad#manually"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x024f
            goto L_0x041f
        L_0x024f:
            r9.m9403s0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0254:
            java.lang.String r1 = "zoomToRegion"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x025e
            goto L_0x041f
        L_0x025e:
            r9.m9398p1(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0263:
            java.lang.String r1 = "use#visiblityInfoWindow"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x026d
            goto L_0x041f
        L_0x026d:
            java.lang.Object r10 = r10.f9002b     // Catch:{ Exception -> 0x0423 }
            p041f3.C1924k.m9139e(r10, r4)     // Catch:{ Exception -> 0x0423 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0423 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x0423 }
            r9.f7119O = r10     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x027c:
            java.lang.String r1 = "add#Marker"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0286
            goto L_0x041f
        L_0x0286:
            r9.m9354S(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x028b:
            java.lang.String r10 = "map#saveCache#view"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x0295
            goto L_0x041f
        L_0x0295:
            r9.m9371a1()     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x029a:
            java.lang.String r1 = "showZoomController"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x02a4
            goto L_0x041f
        L_0x02a4:
            java.lang.Object r10 = r10.f9002b     // Catch:{ Exception -> 0x0423 }
            p041f3.C1924k.m9139e(r10, r4)     // Catch:{ Exception -> 0x0423 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0423 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x0423 }
            if (r10 == 0) goto L_0x02b4
            org.osmdroid.views.a$f r10 = org.osmdroid.views.C2858a.C2864f.SHOW_AND_FADEOUT     // Catch:{ Exception -> 0x0423 }
            goto L_0x02b6
        L_0x02b4:
            org.osmdroid.views.a$f r10 = org.osmdroid.views.C2858a.C2864f.NEVER     // Catch:{ Exception -> 0x0423 }
        L_0x02b6:
            org.osmdroid.views.d r0 = r9.f7131k     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x002e
            org.osmdroid.views.a r0 = r0.getZoomController()     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x002e
            r0.mo9838q(r10)     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x02c5:
            java.lang.String r10 = "cancel#advanced#selection"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x02cf
            goto L_0x041f
        L_0x02cf:
            r9.m9356T()     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x02d4:
            java.lang.String r1 = "remove#circle"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x02de
            goto L_0x041f
        L_0x02de:
            r9.m9357T0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x02e3:
            java.lang.String r1 = "trackMe"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x02ed
            goto L_0x041f
        L_0x02ed:
            java.lang.Object r10 = r10.f9002b     // Catch:{ Exception -> 0x0423 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Boolean>"
            p041f3.C1924k.m9139e(r10, r0)     // Catch:{ Exception -> 0x0423 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x0423 }
            java.lang.Object r0 = p133u2.C3271t.m14406z(r10)     // Catch:{ Exception -> 0x0423 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0423 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0423 }
            java.lang.Object r10 = p133u2.C3271t.m14391F(r10)     // Catch:{ Exception -> 0x0423 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0423 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x0423 }
            r9.m9394n1(r0, r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x030f:
            java.lang.String r1 = "user#locationMarkers"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0319
            goto L_0x041f
        L_0x0319:
            r9.m9362W(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x031e:
            java.lang.String r1 = "delete#road"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0328
            goto L_0x041f
        L_0x0328:
            r9.m9389l0(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x032d:
            java.lang.String r1 = "advancedPicker#marker#icon"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0337
            goto L_0x041f
        L_0x0337:
            r9.m9376d1(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x033c:
            java.lang.String r1 = "staticPosition"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0346
            goto L_0x041f
        L_0x0346:
            r9.m9390l1(r10, r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x034b:
            java.lang.String r10 = "clear#shapes"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x0355
            goto L_0x041f
        L_0x0355:
            y4.b r10 = r9.m9413x0()     // Catch:{ Exception -> 0x0423 }
            java.util.List r10 = r10.mo11755C()     // Catch:{ Exception -> 0x0423 }
            r10.clear()     // Catch:{ Exception -> 0x0423 }
            y4.b r10 = r9.m9417z0()     // Catch:{ Exception -> 0x0423 }
            java.util.List r10 = r10.mo11755C()     // Catch:{ Exception -> 0x0423 }
            r10.clear()     // Catch:{ Exception -> 0x0423 }
            org.osmdroid.views.d r10 = r9.f7131k     // Catch:{ Exception -> 0x0423 }
            if (r10 == 0) goto L_0x002e
            r10.invalidate()     // Catch:{ Exception -> 0x0423 }
            goto L_0x002e
        L_0x0374:
            java.lang.String r10 = "deactivateTrackMe"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x037e
            goto L_0x041f
        L_0x037e:
            r9.m9383i0(r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0383:
            java.lang.String r1 = "change#tile"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x038d
            goto L_0x041f
        L_0x038d:
            java.lang.Object r10 = r10.f9002b     // Catch:{ Exception -> 0x0423 }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ Exception -> 0x0423 }
            if (r10 == 0) goto L_0x0399
            boolean r0 = r10.isEmpty()     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x039a
        L_0x0399:
            r6 = 1
        L_0x039a:
            r0 = r6 ^ 1
            if (r0 != r7) goto L_0x03cb
            v1.b$a r0 = p138v1.C3395b.f11180h     // Catch:{ Exception -> 0x0423 }
            v1.b r10 = r0.mo11272a(r10)     // Catch:{ Exception -> 0x0423 }
            java.util.List r0 = r10.mo11269g()     // Catch:{ Exception -> 0x0423 }
            org.osmdroid.views.d r1 = r9.f7131k     // Catch:{ Exception -> 0x0423 }
            p041f3.C1924k.m9138d(r1)     // Catch:{ Exception -> 0x0423 }
            s4.h r1 = r1.getTileProvider()     // Catch:{ Exception -> 0x0423 }
            u4.d r1 = r1.mo10469o()     // Catch:{ Exception -> 0x0423 }
            java.lang.String r2 = "null cannot be cast to non-null type org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase"
            p041f3.C1924k.m9139e(r1, r2)     // Catch:{ Exception -> 0x0423 }
            u4.e r1 = (p135u4.C3375e) r1     // Catch:{ Exception -> 0x0423 }
            java.lang.String r1 = r1.mo11190k()     // Catch:{ Exception -> 0x0423 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x0451
            r9.m9360V(r10)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x03cb:
            if (r0 != 0) goto L_0x0451
            org.osmdroid.views.d r10 = r9.f7131k     // Catch:{ Exception -> 0x0423 }
            p041f3.C1924k.m9138d(r10)     // Catch:{ Exception -> 0x0423 }
            s4.h r10 = r10.getTileProvider()     // Catch:{ Exception -> 0x0423 }
            u4.e r0 = p135u4.C3376f.f11117a     // Catch:{ Exception -> 0x0423 }
            boolean r10 = p041f3.C1924k.m9136b(r10, r0)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x0451
            org.osmdroid.views.d r10 = r9.f7131k     // Catch:{ Exception -> 0x0423 }
            p041f3.C1924k.m9138d(r10)     // Catch:{ Exception -> 0x0423 }
            p156y1.C3556b.m15669e(r10)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x03e7:
            java.lang.String r10 = "remove#limitArea"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x03f0
            goto L_0x041f
        L_0x03f0:
            r9.m9361V0(r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x03f4:
            java.lang.String r10 = "map#center"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x03fd
            goto L_0x041f
        L_0x03fd:
            org.osmdroid.views.d r10 = r9.f7131k     // Catch:{ Exception -> 0x0423 }
            if (r10 == 0) goto L_0x0405
            l4.a r8 = r10.getMapCenter()     // Catch:{ Exception -> 0x0423 }
        L_0x0405:
            java.lang.String r10 = "null cannot be cast to non-null type org.osmdroid.util.GeoPoint"
            p041f3.C1924k.m9139e(r8, r10)     // Catch:{ Exception -> 0x0423 }
            w4.f r8 = (p147w4.C3472f) r8     // Catch:{ Exception -> 0x0423 }
            java.util.HashMap r10 = p156y1.C3556b.m15675k(r8)     // Catch:{ Exception -> 0x0423 }
            goto L_0x01f5
        L_0x0412:
            java.lang.String r10 = "map#bounds"
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0423 }
            if (r10 != 0) goto L_0x041b
            goto L_0x041f
        L_0x041b:
            r9.m9335I0(r11)     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x041f:
            r11.mo9292c()     // Catch:{ Exception -> 0x0423 }
            goto L_0x0451
        L_0x0423:
            r10 = move-exception
            java.lang.Throwable r0 = r10.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error osm plugin "
            r1.append(r2)
            java.lang.String r2 = p127t2.C3168b.m14047b(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            java.lang.String r0 = r10.getMessage()
            java.lang.String r10 = p127t2.C3168b.m14047b(r10)
            java.lang.String r1 = "404"
            r11.mo9290a(r1, r0, r10)
        L_0x0451:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hamza.dali.flutter_osm_plugin.FlutterOsmView.mo7778l(n2.h, n2.i$d):void");
    }

    /* renamed from: m */
    public void mo3080m(C1005m mVar) {
        C1924k.m9141g(mVar, "owner");
        C0971b.m4433c(this, mVar);
        C3153a.f10538b.mo10533d().set(4);
        if (this.f7131k != null) {
            C3523d dVar = this.f7133m;
            C3523d dVar2 = null;
            if (dVar == null) {
                C1924k.m9154t("locationNewOverlay");
                dVar = null;
            }
            dVar.mo7303C();
            C3523d dVar3 = this.f7133m;
            if (dVar3 == null) {
                C1924k.m9154t("locationNewOverlay");
            } else {
                dVar2 = dVar3;
            }
            dVar2.mo7323s();
        }
        C2875d dVar4 = this.f7131k;
        if (dVar4 != null) {
            dVar4.mo9877C();
        }
        this.f7108D = false;
        Log.e("osm", "osm flutter plugin pause");
    }

    /* renamed from: n */
    public void mo3081n(C1005m mVar) {
        C1924k.m9141g(mVar, "owner");
        C0971b.m4436f(this, mVar);
        C3153a.f10538b.mo10533d().set(5);
        Log.e("osm", "osm flutter plugin stopped");
        C2777o1 o1Var = this.f7106B;
        if (o1Var != null && o1Var.mo9450a()) {
            C2777o1.C2778a.m12478a(o1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f7106B = null;
    }

    /* renamed from: o */
    public /* synthetic */ void mo7779o() {
        C2249e.m10451a(this);
    }

    /* renamed from: p */
    public void mo3082p(C1005m mVar) {
        C1924k.m9141g(mVar, "owner");
        C0971b.m4435e(this, mVar);
        C3153a.C3154a aVar = C3153a.f10538b;
        aVar.mo10533d().set(2);
        Log.e("osm", "osm flutter plugin start");
        C1910c c = aVar.mo10532c();
        C1924k.m9138d(c);
        Activity e = c.mo7639e();
        C1924k.m9140f(e, "FlutterOsmPlugin.pluginBinding!!.activity");
        this.f7112H = e;
        C1910c c2 = aVar.mo10532c();
        C1924k.m9138d(c2);
        c2.mo7641g(this);
    }

    /* renamed from: q */
    public View mo7780q() {
        return this.f7122R;
    }
}
