package org.osmdroid.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.views.C2875d;
import p081l4.C2491a;
import p081l4.C2492b;
import p105p4.C2954a;
import p111q4.C3037b;
import p111q4.C3039d;
import p147w4.C3457a;
import p147w4.C3468d0;
import p147w4.C3472f;
import p147w4.C3491t;

/* renamed from: org.osmdroid.views.c */
public class C2869c implements C2492b, C2875d.C2881f {

    /* renamed from: a */
    protected final C2875d f9444a;

    /* renamed from: b */
    private double f9445b = 0.0d;

    /* renamed from: c */
    private Animator f9446c;

    /* renamed from: d */
    private C2872c f9447d;

    /* renamed from: org.osmdroid.views.c$a */
    static /* synthetic */ class C2870a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9448a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.osmdroid.views.c$d[] r0 = org.osmdroid.views.C2869c.C2874d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9448a = r0
                org.osmdroid.views.c$d r1 = org.osmdroid.views.C2869c.C2874d.AnimateToGeoPoint     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9448a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.osmdroid.views.c$d r1 = org.osmdroid.views.C2869c.C2874d.AnimateToPoint     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9448a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.osmdroid.views.c$d r1 = org.osmdroid.views.C2869c.C2874d.SetCenterPoint     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9448a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.osmdroid.views.c$d r1 = org.osmdroid.views.C2869c.C2874d.ZoomToSpanPoint     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.C2869c.C2870a.<clinit>():void");
        }
    }

    @TargetApi(11)
    /* renamed from: org.osmdroid.views.c$b */
    private static class C2871b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private final C3472f f9449a = new C3472f(0.0d, 0.0d);

        /* renamed from: b */
        private final C2869c f9450b;

        /* renamed from: c */
        private final Double f9451c;

        /* renamed from: d */
        private final Double f9452d;

        /* renamed from: e */
        private final C2491a f9453e;

        /* renamed from: f */
        private final C2491a f9454f;

        /* renamed from: g */
        private final Float f9455g;

        /* renamed from: h */
        private final Float f9456h;

        public C2871b(C2869c cVar, Double d, Double d2, C2491a aVar, C2491a aVar2, Float f, Float f2, Boolean bool) {
            Float f3;
            this.f9450b = cVar;
            this.f9451c = d;
            this.f9452d = d2;
            this.f9453e = aVar;
            this.f9454f = aVar2;
            if (f2 == null) {
                f3 = null;
                this.f9455g = null;
            } else {
                this.f9455g = f;
                f3 = Float.valueOf((float) C3491t.m15368d((double) f.floatValue(), (double) f2.floatValue(), bool));
            }
            this.f9456h = f3;
        }

        public void onAnimationCancel(Animator animator) {
            this.f9450b.mo9855m();
        }

        public void onAnimationEnd(Animator animator) {
            this.f9450b.mo9855m();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f9450b.mo9856n();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f9452d != null) {
                double doubleValue = this.f9451c.doubleValue();
                double doubleValue2 = this.f9452d.doubleValue() - this.f9451c.doubleValue();
                double d = (double) floatValue;
                Double.isNaN(d);
                this.f9450b.f9444a.mo9889Q(doubleValue + (doubleValue2 * d));
            }
            if (this.f9456h != null) {
                this.f9450b.f9444a.setMapOrientation(this.f9455g.floatValue() + (this.f9456h.floatValue() * floatValue));
            }
            if (this.f9454f != null) {
                C2875d dVar = this.f9450b.f9444a;
                C3468d0 tileSystem = C2875d.getTileSystem();
                double g = tileSystem.mo11391g(this.f9453e.mo9100l());
                double d2 = (double) floatValue;
                Double.isNaN(d2);
                double g2 = tileSystem.mo11391g(g + ((tileSystem.mo11391g(this.f9454f.mo9100l()) - g) * d2));
                double f = tileSystem.mo11390f(this.f9453e.mo9099e());
                Double.isNaN(d2);
                this.f9449a.mo11422y(tileSystem.mo11390f(f + ((tileSystem.mo11390f(this.f9454f.mo9099e()) - f) * d2)), g2);
                this.f9450b.f9444a.setExpectedCenter(this.f9449a);
            }
            this.f9450b.f9444a.invalidate();
        }
    }

    /* renamed from: org.osmdroid.views.c$c */
    private class C2872c {

        /* renamed from: a */
        private LinkedList<C2873a> f9457a;

        /* renamed from: org.osmdroid.views.c$c$a */
        private class C2873a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public C2874d f9459a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public Point f9460b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public C2491a f9461c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final Long f9462d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public final Double f9463e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public final Float f9464f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public final Boolean f9465g;

            public C2873a(C2872c cVar, C2874d dVar, Point point, C2491a aVar) {
                this(dVar, point, aVar, (Double) null, (Long) null, (Float) null, (Boolean) null);
            }

            public C2873a(C2874d dVar, Point point, C2491a aVar, Double d, Long l, Float f, Boolean bool) {
                this.f9459a = dVar;
                this.f9460b = point;
                this.f9461c = aVar;
                this.f9462d = l;
                this.f9463e = d;
                this.f9464f = f;
                this.f9465g = bool;
            }
        }

        private C2872c() {
            this.f9457a = new LinkedList<>();
        }

        /* synthetic */ C2872c(C2869c cVar, C2870a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9870a(int i, int i2) {
            this.f9457a.add(new C2873a(this, C2874d.AnimateToPoint, new Point(i, i2), (C2491a) null));
        }

        /* renamed from: b */
        public void mo9871b(C2491a aVar, Double d, Long l, Float f, Boolean bool) {
            this.f9457a.add(new C2873a(C2874d.AnimateToGeoPoint, (Point) null, aVar, d, l, f, bool));
        }

        /* renamed from: c */
        public void mo9872c() {
            Iterator it = this.f9457a.iterator();
            while (it.hasNext()) {
                C2873a aVar = (C2873a) it.next();
                int i = C2870a.f9448a[aVar.f9459a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && aVar.f9460b != null) {
                                C2869c.this.mo9864v(aVar.f9460b.x, aVar.f9460b.y);
                            }
                        } else if (aVar.f9461c != null) {
                            C2869c.this.mo9106g(aVar.f9461c);
                        }
                    } else if (aVar.f9460b != null) {
                        C2869c.this.mo9853k(aVar.f9460b.x, aVar.f9460b.y);
                    }
                } else if (aVar.f9461c != null) {
                    C2869c.this.mo9854l(aVar.f9461c, aVar.f9463e, aVar.f9462d, aVar.f9464f, aVar.f9465g);
                }
            }
            this.f9457a.clear();
        }

        /* renamed from: d */
        public void mo9873d(C2491a aVar) {
            this.f9457a.add(new C2873a(this, C2874d.SetCenterPoint, (Point) null, aVar));
        }

        /* renamed from: e */
        public void mo9874e(double d, double d2) {
            this.f9457a.add(new C2873a(this, C2874d.ZoomToSpanPoint, new Point((int) (d * 1000000.0d), (int) (d2 * 1000000.0d)), (C2491a) null));
        }
    }

    /* renamed from: org.osmdroid.views.c$d */
    private enum C2874d {
        ZoomToSpanPoint,
        AnimateToPoint,
        AnimateToGeoPoint,
        SetCenterPoint
    }

    public C2869c(C2875d dVar) {
        this.f9444a = dVar;
        this.f9447d = new C2872c(this, (C2870a) null);
        if (!dVar.mo9969x()) {
            dVar.mo9927n(this);
        }
    }

    /* renamed from: a */
    public void mo9852a(View view, int i, int i2, int i3, int i4) {
        this.f9447d.mo9872c();
    }

    /* renamed from: b */
    public boolean mo9101b(int i, int i2) {
        return mo9859q(i, i2, (Long) null);
    }

    /* renamed from: c */
    public boolean mo9102c() {
        return mo9858p((Long) null);
    }

    /* renamed from: d */
    public void mo9103d(boolean z) {
        if (!this.f9444a.getScroller().isFinished()) {
            if (z) {
                C2875d dVar = this.f9444a;
                dVar.f9506j = false;
                dVar.getScroller().abortAnimation();
            } else {
                mo9857o();
            }
        }
        Animator animator = this.f9446c;
        if (!this.f9444a.f9508l.get()) {
            return;
        }
        if (z) {
            animator.end();
        } else {
            animator.cancel();
        }
    }

    /* renamed from: e */
    public void mo9104e(C2491a aVar) {
        mo9108i(aVar, (Double) null, (Long) null);
    }

    /* renamed from: f */
    public void mo9105f(C2491a aVar, Double d, Long l, Float f) {
        mo9854l(aVar, d, l, f, (Boolean) null);
    }

    /* renamed from: g */
    public void mo9106g(C2491a aVar) {
        if (!this.f9444a.mo9969x()) {
            this.f9447d.mo9873d(aVar);
        } else {
            this.f9444a.setExpectedCenter(aVar);
        }
    }

    /* renamed from: h */
    public double mo9107h(double d) {
        return this.f9444a.mo9889Q(d);
    }

    /* renamed from: i */
    public void mo9108i(C2491a aVar, Double d, Long l) {
        mo9105f(aVar, d, l, (Float) null);
    }

    /* renamed from: j */
    public boolean mo9109j() {
        return mo9860r((Long) null);
    }

    /* renamed from: k */
    public void mo9853k(int i, int i2) {
        if (!this.f9444a.mo9969x()) {
            this.f9447d.mo9870a(i, i2);
        } else if (!this.f9444a.mo9967v()) {
            C2875d dVar = this.f9444a;
            dVar.f9506j = false;
            int mapScrollX = (int) dVar.getMapScrollX();
            int mapScrollY = (int) this.f9444a.getMapScrollY();
            int width = i - (this.f9444a.getWidth() / 2);
            int height = i2 - (this.f9444a.getHeight() / 2);
            if (width != mapScrollX || height != mapScrollY) {
                this.f9444a.getScroller().startScroll(mapScrollX, mapScrollY, width, height, C2954a.m13328a().mo10182p());
                this.f9444a.postInvalidate();
            }
        }
    }

    /* renamed from: l */
    public void mo9854l(C2491a aVar, Double d, Long l, Float f, Boolean bool) {
        if (!this.f9444a.mo9969x()) {
            this.f9447d.mo9871b(aVar, d, l, f, bool);
            return;
        }
        C2871b bVar = new C2871b(this, Double.valueOf(this.f9444a.getZoomLevelDouble()), d, new C3472f(this.f9444a.getProjection().mo10017l()), aVar, Float.valueOf(this.f9444a.getMapOrientation()), f, bool);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addListener(bVar);
        ofFloat.addUpdateListener(bVar);
        ofFloat.setDuration(l == null ? (long) C2954a.m13328a().mo10182p() : l.longValue());
        Animator animator = this.f9446c;
        if (animator != null) {
            bVar.onAnimationCancel(animator);
        }
        this.f9446c = ofFloat;
        ofFloat.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo9855m() {
        this.f9444a.f9508l.set(false);
        this.f9444a.mo9879E();
        this.f9446c = null;
        this.f9444a.invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo9856n() {
        this.f9444a.f9508l.set(true);
    }

    /* renamed from: o */
    public void mo9857o() {
        C2875d dVar = this.f9444a;
        dVar.f9506j = false;
        dVar.getScroller().forceFinished(true);
    }

    /* renamed from: p */
    public boolean mo9858p(Long l) {
        return mo9861s(this.f9444a.getZoomLevelDouble() + 1.0d, l);
    }

    /* renamed from: q */
    public boolean mo9859q(int i, int i2, Long l) {
        return mo9862t(this.f9444a.getZoomLevelDouble() + 1.0d, i, i2, l);
    }

    /* renamed from: r */
    public boolean mo9860r(Long l) {
        return mo9861s(this.f9444a.getZoomLevelDouble() - 1.0d, l);
    }

    /* renamed from: s */
    public boolean mo9861s(double d, Long l) {
        return mo9862t(d, this.f9444a.getWidth() / 2, this.f9444a.getHeight() / 2, l);
    }

    /* renamed from: t */
    public boolean mo9862t(double d, int i, int i2, Long l) {
        double maxZoomLevel = d > this.f9444a.getMaxZoomLevel() ? this.f9444a.getMaxZoomLevel() : d;
        if (maxZoomLevel < this.f9444a.getMinZoomLevel()) {
            maxZoomLevel = this.f9444a.getMinZoomLevel();
        }
        double zoomLevelDouble = this.f9444a.getZoomLevelDouble();
        if (!((maxZoomLevel < zoomLevelDouble && this.f9444a.mo9937p()) || (maxZoomLevel > zoomLevelDouble && this.f9444a.mo9928o())) || this.f9444a.f9508l.getAndSet(true)) {
            return false;
        }
        C3039d dVar = null;
        for (C3037b next : this.f9444a.f9490R) {
            if (dVar == null) {
                dVar = new C3039d(this.f9444a, maxZoomLevel);
            }
            next.mo7822a(dVar);
        }
        this.f9444a.mo9886N((float) i, (float) i2);
        this.f9444a.mo9890R();
        Math.pow(2.0d, maxZoomLevel - zoomLevelDouble);
        C2871b bVar = new C2871b(this, Double.valueOf(zoomLevelDouble), Double.valueOf(maxZoomLevel), (C2491a) null, (C2491a) null, (Float) null, (Float) null, (Boolean) null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addListener(bVar);
        ofFloat.addUpdateListener(bVar);
        ofFloat.setDuration(l == null ? (long) C2954a.m13328a().mo10138B() : l.longValue());
        this.f9446c = ofFloat;
        ofFloat.start();
        return true;
    }

    /* renamed from: u */
    public void mo9863u(double d, double d2) {
        if (d > 0.0d && d2 > 0.0d) {
            if (!this.f9444a.mo9969x()) {
                this.f9447d.mo9874e(d, d2);
                return;
            }
            C3457a i = this.f9444a.getProjection().mo10015i();
            double J = this.f9444a.getProjection().mo9995J();
            double max = Math.max(d / i.mo11355w(), d2 / i.mo11359z());
            if (max > 1.0d) {
                C2875d dVar = this.f9444a;
                double e = (double) C3491t.m15369e((float) max);
                Double.isNaN(e);
                dVar.mo9889Q(J - e);
            } else if (max < 0.5d) {
                C2875d dVar2 = this.f9444a;
                double e2 = (double) C3491t.m15369e(1.0f / ((float) max));
                Double.isNaN(e2);
                dVar2.mo9889Q((J + e2) - 1.0d);
            }
        }
    }

    /* renamed from: v */
    public void mo9864v(int i, int i2) {
        double d = (double) i;
        Double.isNaN(d);
        double d2 = (double) i2;
        Double.isNaN(d2);
        mo9863u(d * 1.0E-6d, d2 * 1.0E-6d);
    }
}
