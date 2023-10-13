package org.osmdroid.views;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import java.lang.Thread;

/* renamed from: org.osmdroid.views.a */
public class C2858a {

    /* renamed from: a */
    private final Object f9389a = new Object();

    /* renamed from: b */
    private final C2875d f9390b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ValueAnimator f9391c;

    /* renamed from: d */
    private C2865b f9392d;

    /* renamed from: e */
    private C2863e f9393e;

    /* renamed from: f */
    private boolean f9394f;

    /* renamed from: g */
    private boolean f9395g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f9396h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f9397i;

    /* renamed from: j */
    private C2864f f9398j = C2864f.NEVER;

    /* renamed from: k */
    private int f9399k = 500;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f9400l = 3500;

    /* renamed from: m */
    private boolean f9401m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f9402n;

    /* renamed from: o */
    private Thread f9403o;

    /* renamed from: p */
    private final Runnable f9404p;

    /* renamed from: org.osmdroid.views.a$a */
    class C2859a implements ValueAnimator.AnimatorUpdateListener {
        C2859a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C2858a.this.f9397i) {
                C2858a.this.f9391c.cancel();
                return;
            }
            float unused = C2858a.this.f9396h = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2858a.this.m12959l();
        }
    }

    /* renamed from: org.osmdroid.views.a$b */
    class C2860b implements Runnable {
        C2860b() {
        }

        public void run() {
            while (true) {
                long e = (C2858a.this.f9402n + ((long) C2858a.this.f9400l)) - C2858a.this.m12960n();
                if (e <= 0) {
                    C2858a.this.m12961t();
                    return;
                }
                try {
                    Thread.sleep(e, 0);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: org.osmdroid.views.a$c */
    class C2861c implements Runnable {
        C2861c() {
        }

        public void run() {
            C2858a.this.f9391c.start();
        }
    }

    /* renamed from: org.osmdroid.views.a$d */
    static /* synthetic */ class C2862d {

        /* renamed from: a */
        static final /* synthetic */ int[] f9408a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.osmdroid.views.a$f[] r0 = org.osmdroid.views.C2858a.C2864f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9408a = r0
                org.osmdroid.views.a$f r1 = org.osmdroid.views.C2858a.C2864f.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9408a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.osmdroid.views.a$f r1 = org.osmdroid.views.C2858a.C2864f.NEVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9408a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.osmdroid.views.a$f r1 = org.osmdroid.views.C2858a.C2864f.SHOW_AND_FADEOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.C2858a.C2862d.<clinit>():void");
        }
    }

    /* renamed from: org.osmdroid.views.a$e */
    public interface C2863e {
        void onZoom(boolean z);
    }

    /* renamed from: org.osmdroid.views.a$f */
    public enum C2864f {
        ALWAYS,
        NEVER,
        SHOW_AND_FADEOUT
    }

    public C2858a(C2875d dVar) {
        this.f9390b = dVar;
        this.f9392d = new C2865b(dVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f9391c = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration((long) this.f9399k);
        ofFloat.addUpdateListener(new C2859a());
        this.f9404p = new C2860b();
    }

    /* renamed from: j */
    private boolean m12958j() {
        if (!this.f9401m) {
            return false;
        }
        this.f9401m = false;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m12959l() {
        if (!this.f9397i) {
            this.f9390b.postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public long m12960n() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m12961t() {
        if (!this.f9397i) {
            this.f9391c.setStartDelay(0);
            this.f9390b.post(new C2861c());
        }
    }

    /* renamed from: u */
    private void m12962u() {
        this.f9391c.cancel();
    }

    /* renamed from: i */
    public void mo9833i() {
        if (!this.f9397i && this.f9398j == C2864f.SHOW_AND_FADEOUT) {
            float f = this.f9396h;
            boolean z = false;
            if (!this.f9401m && f == 0.0f) {
                z = true;
            }
            this.f9401m = z;
            m12962u();
            this.f9396h = 1.0f;
            this.f9402n = m12960n();
            m12959l();
            Thread thread = this.f9403o;
            if (thread == null || thread.getState() == Thread.State.TERMINATED) {
                synchronized (this.f9389a) {
                    Thread thread2 = this.f9403o;
                    if (thread2 == null || thread2.getState() == Thread.State.TERMINATED) {
                        Thread thread3 = new Thread(this.f9404p);
                        this.f9403o = thread3;
                        thread3.setName(getClass().getName() + "#active");
                        this.f9403o.start();
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void mo9834k(Canvas canvas) {
        this.f9392d.mo9845a(canvas, this.f9396h, this.f9394f, this.f9395g);
    }

    /* renamed from: m */
    public boolean mo9835m(MotionEvent motionEvent) {
        C2863e eVar;
        C2863e eVar2;
        if (this.f9396h == 0.0f || m12958j()) {
            return false;
        }
        if (this.f9392d.mo9848i(motionEvent, true)) {
            if (this.f9394f && (eVar2 = this.f9393e) != null) {
                eVar2.onZoom(true);
            }
            return true;
        } else if (!this.f9392d.mo9848i(motionEvent, false)) {
            return false;
        } else {
            if (this.f9395g && (eVar = this.f9393e) != null) {
                eVar.onZoom(false);
            }
            return true;
        }
    }

    /* renamed from: o */
    public void mo9836o() {
        this.f9397i = true;
        m12962u();
    }

    /* renamed from: p */
    public void mo9837p(C2863e eVar) {
        this.f9393e = eVar;
    }

    /* renamed from: q */
    public void mo9838q(C2864f fVar) {
        float f;
        this.f9398j = fVar;
        int i = C2862d.f9408a[fVar.ordinal()];
        if (i == 1) {
            f = 1.0f;
        } else if (i == 2 || i == 3) {
            f = 0.0f;
        } else {
            return;
        }
        this.f9396h = f;
    }

    /* renamed from: r */
    public void mo9839r(boolean z) {
        this.f9394f = z;
    }

    /* renamed from: s */
    public void mo9840s(boolean z) {
        this.f9395g = z;
    }
}
