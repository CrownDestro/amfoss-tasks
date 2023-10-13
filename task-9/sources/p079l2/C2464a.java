package p079l2;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p063io.flutter.embedding.engine.FlutterJNI;
import p063io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import p063io.flutter.view.C2297d;
import p162z1.C3627b;

/* renamed from: l2.a */
public class C2464a implements C2297d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FlutterJNI f8432a;

    /* renamed from: b */
    private final AtomicLong f8433b = new AtomicLong(0);

    /* renamed from: c */
    private Surface f8434c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f8435d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f8436e = new Handler();

    /* renamed from: f */
    private final Set<WeakReference<C2297d.C2299b>> f8437f = new HashSet();

    /* renamed from: g */
    private final C2474b f8438g;

    /* renamed from: l2.a$a */
    class C2465a implements C2474b {
        C2465a() {
        }

        /* renamed from: d */
        public void mo8069d() {
            boolean unused = C2464a.this.f8435d = false;
        }

        /* renamed from: g */
        public void mo8070g() {
            boolean unused = C2464a.this.f8435d = true;
        }
    }

    /* renamed from: l2.a$b */
    public static final class C2466b {

        /* renamed from: a */
        public final Rect f8440a;

        /* renamed from: b */
        public final C2468d f8441b;

        /* renamed from: c */
        public final C2467c f8442c;

        public C2466b(Rect rect, C2468d dVar) {
            this.f8440a = rect;
            this.f8441b = dVar;
            this.f8442c = C2467c.UNKNOWN;
        }

        public C2466b(Rect rect, C2468d dVar, C2467c cVar) {
            this.f8440a = rect;
            this.f8441b = dVar;
            this.f8442c = cVar;
        }
    }

    /* renamed from: l2.a$c */
    public enum C2467c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: d */
        public final int f8447d;

        private C2467c(int i) {
            this.f8447d = i;
        }
    }

    /* renamed from: l2.a$d */
    public enum C2468d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: d */
        public final int f8453d;

        private C2468d(int i) {
            this.f8453d = i;
        }
    }

    /* renamed from: l2.a$e */
    static final class C2469e implements Runnable {

        /* renamed from: d */
        private final long f8454d;

        /* renamed from: e */
        private final FlutterJNI f8455e;

        C2469e(long j, FlutterJNI flutterJNI) {
            this.f8454d = j;
            this.f8455e = flutterJNI;
        }

        public void run() {
            if (this.f8455e.isAttached()) {
                C3627b.m16092f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f8454d + ").");
                this.f8455e.unregisterTexture(this.f8454d);
            }
        }
    }

    /* renamed from: l2.a$f */
    final class C2470f implements C2297d.C2300c, C2297d.C2299b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f8456a;

        /* renamed from: b */
        private final SurfaceTextureWrapper f8457b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f8458c;

        /* renamed from: d */
        private C2297d.C2299b f8459d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2297d.C2298a f8460e;

        /* renamed from: f */
        private final Runnable f8461f;

        /* renamed from: g */
        private SurfaceTexture.OnFrameAvailableListener f8462g = new C2472b();

        /* renamed from: l2.a$f$a */
        class C2471a implements Runnable {
            C2471a() {
            }

            public void run() {
                if (C2470f.this.f8460e != null) {
                    C2470f.this.f8460e.mo8519a();
                }
            }
        }

        /* renamed from: l2.a$f$b */
        class C2472b implements SurfaceTexture.OnFrameAvailableListener {
            C2472b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!C2470f.this.f8458c && C2464a.this.f8432a.isAttached()) {
                    C2470f fVar = C2470f.this;
                    C2464a.this.m11427l(fVar.f8456a);
                }
            }
        }

        C2470f(long j, SurfaceTexture surfaceTexture) {
            C2471a aVar = new C2471a();
            this.f8461f = aVar;
            this.f8456a = j;
            this.f8457b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            if (Build.VERSION.SDK_INT >= 21) {
                mo8619d().setOnFrameAvailableListener(this.f8462g, new Handler());
            } else {
                mo8619d().setOnFrameAvailableListener(this.f8462g);
            }
        }

        /* renamed from: a */
        public long mo8616a() {
            return this.f8456a;
        }

        /* renamed from: b */
        public void mo8617b(C2297d.C2299b bVar) {
            this.f8459d = bVar;
        }

        /* renamed from: c */
        public void mo8618c(C2297d.C2298a aVar) {
            this.f8460e = aVar;
        }

        /* renamed from: d */
        public SurfaceTexture mo8619d() {
            return this.f8457b.surfaceTexture();
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                if (!this.f8458c) {
                    C2464a.this.f8436e.post(new C2469e(this.f8456a, C2464a.this.f8432a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: h */
        public SurfaceTextureWrapper mo9086h() {
            return this.f8457b;
        }

        public void onTrimMemory(int i) {
            C2297d.C2299b bVar = this.f8459d;
            if (bVar != null) {
                bVar.onTrimMemory(i);
            }
        }
    }

    /* renamed from: l2.a$g */
    public static final class C2473g {

        /* renamed from: a */
        public float f8466a = 1.0f;

        /* renamed from: b */
        public int f8467b = 0;

        /* renamed from: c */
        public int f8468c = 0;

        /* renamed from: d */
        public int f8469d = 0;

        /* renamed from: e */
        public int f8470e = 0;

        /* renamed from: f */
        public int f8471f = 0;

        /* renamed from: g */
        public int f8472g = 0;

        /* renamed from: h */
        public int f8473h = 0;

        /* renamed from: i */
        public int f8474i = 0;

        /* renamed from: j */
        public int f8475j = 0;

        /* renamed from: k */
        public int f8476k = 0;

        /* renamed from: l */
        public int f8477l = 0;

        /* renamed from: m */
        public int f8478m = 0;

        /* renamed from: n */
        public int f8479n = 0;

        /* renamed from: o */
        public int f8480o = 0;

        /* renamed from: p */
        public int f8481p = -1;

        /* renamed from: q */
        public List<C2466b> f8482q = new ArrayList();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9089a() {
            return this.f8467b > 0 && this.f8468c > 0 && this.f8466a > 0.0f;
        }
    }

    public C2464a(FlutterJNI flutterJNI) {
        C2465a aVar = new C2465a();
        this.f8438g = aVar;
        this.f8432a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* renamed from: h */
    private void m11426h() {
        Iterator<WeakReference<C2297d.C2299b>> it = this.f8437f.iterator();
        while (it.hasNext()) {
            if (((C2297d.C2299b) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11427l(long j) {
        this.f8432a.markTextureFrameAvailable(j);
    }

    /* renamed from: o */
    private void m11428o(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f8432a.registerTexture(j, surfaceTextureWrapper);
    }

    /* renamed from: a */
    public C2297d.C2300c mo8615a() {
        C3627b.m16092f("FlutterRenderer", "Creating a SurfaceTexture.");
        return mo9076n(new SurfaceTexture(0));
    }

    /* renamed from: f */
    public void mo9070f(C2474b bVar) {
        this.f8432a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f8435d) {
            bVar.mo8070g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9071g(C2297d.C2299b bVar) {
        m11426h();
        this.f8437f.add(new WeakReference(bVar));
    }

    /* renamed from: i */
    public void mo9072i(ByteBuffer byteBuffer, int i) {
        this.f8432a.dispatchPointerDataPacket(byteBuffer, i);
    }

    /* renamed from: j */
    public boolean mo9073j() {
        return this.f8435d;
    }

    /* renamed from: k */
    public boolean mo9074k() {
        return this.f8432a.getIsSoftwareRenderingEnabled();
    }

    /* renamed from: m */
    public void mo9075m(int i) {
        Iterator<WeakReference<C2297d.C2299b>> it = this.f8437f.iterator();
        while (it.hasNext()) {
            C2297d.C2299b bVar = (C2297d.C2299b) it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    /* renamed from: n */
    public C2297d.C2300c mo9076n(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        C2470f fVar = new C2470f(this.f8433b.getAndIncrement(), surfaceTexture);
        C3627b.m16092f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.mo8616a());
        m11428o(fVar.mo8616a(), fVar.mo9086h());
        mo9071g(fVar);
        return fVar;
    }

    /* renamed from: p */
    public void mo9077p(C2474b bVar) {
        this.f8432a.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* renamed from: q */
    public void mo9078q(boolean z) {
        this.f8432a.setSemanticsEnabled(z);
    }

    /* renamed from: r */
    public void mo9079r(C2473g gVar) {
        C2473g gVar2 = gVar;
        if (gVar.mo9089a()) {
            C3627b.m16092f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar2.f8467b + " x " + gVar2.f8468c + "\nPadding - L: " + gVar2.f8472g + ", T: " + gVar2.f8469d + ", R: " + gVar2.f8470e + ", B: " + gVar2.f8471f + "\nInsets - L: " + gVar2.f8476k + ", T: " + gVar2.f8473h + ", R: " + gVar2.f8474i + ", B: " + gVar2.f8475j + "\nSystem Gesture Insets - L: " + gVar2.f8480o + ", T: " + gVar2.f8477l + ", R: " + gVar2.f8478m + ", B: " + gVar2.f8478m + "\nDisplay Features: " + gVar2.f8482q.size());
            int[] iArr = new int[(gVar2.f8482q.size() * 4)];
            int[] iArr2 = new int[gVar2.f8482q.size()];
            int[] iArr3 = new int[gVar2.f8482q.size()];
            for (int i = 0; i < gVar2.f8482q.size(); i++) {
                C2466b bVar = gVar2.f8482q.get(i);
                int i2 = i * 4;
                Rect rect = bVar.f8440a;
                iArr[i2] = rect.left;
                iArr[i2 + 1] = rect.top;
                iArr[i2 + 2] = rect.right;
                iArr[i2 + 3] = rect.bottom;
                iArr2[i] = bVar.f8441b.f8453d;
                iArr3[i] = bVar.f8442c.f8447d;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI = this.f8432a;
            flutterJNI.setViewportMetrics(gVar2.f8466a, gVar2.f8467b, gVar2.f8468c, gVar2.f8469d, gVar2.f8470e, gVar2.f8471f, gVar2.f8472g, gVar2.f8473h, gVar2.f8474i, gVar2.f8475j, gVar2.f8476k, gVar2.f8477l, gVar2.f8478m, gVar2.f8479n, gVar2.f8480o, gVar2.f8481p, iArr, iArr2, iArr4);
        }
    }

    /* renamed from: s */
    public void mo9080s(Surface surface, boolean z) {
        if (this.f8434c != null && !z) {
            mo9081t();
        }
        this.f8434c = surface;
        this.f8432a.onSurfaceCreated(surface);
    }

    /* renamed from: t */
    public void mo9081t() {
        this.f8432a.onSurfaceDestroyed();
        this.f8434c = null;
        if (this.f8435d) {
            this.f8438g.mo8069d();
        }
        this.f8435d = false;
    }

    /* renamed from: u */
    public void mo9082u(int i, int i2) {
        this.f8432a.onSurfaceChanged(i, i2);
    }

    /* renamed from: v */
    public void mo9083v(Surface surface) {
        this.f8434c = surface;
        this.f8432a.onSurfaceWindowChanged(surface);
    }
}
