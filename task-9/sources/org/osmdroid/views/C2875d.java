package org.osmdroid.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.ZoomButtonsController;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.osmdroid.views.C2858a;
import p075k4.C2390a;
import p081l4.C2491a;
import p081l4.C2492b;
import p081l4.C2493c;
import p105p4.C2954a;
import p111q4.C3037b;
import p111q4.C3038c;
import p111q4.C3039d;
import p123s4.C3132h;
import p123s4.C3137i;
import p135u4.C3374d;
import p141v4.C3428c;
import p147w4.C3457a;
import p147w4.C3468d0;
import p147w4.C3471e0;
import p147w4.C3472f;
import p147w4.C3475g;
import p159y4.C3583a;
import p159y4.C3593g;
import p159y4.C3595h;
import p159y4.C3603n;

/* renamed from: org.osmdroid.views.d */
public class C2875d extends ViewGroup implements C2493c, C2390a.C2391a<Object> {

    /* renamed from: e0 */
    private static C3468d0 f9472e0 = new C3471e0();

    /* renamed from: A */
    private double f9473A;

    /* renamed from: B */
    private double f9474B;

    /* renamed from: C */
    private int f9475C;

    /* renamed from: D */
    private int f9476D;

    /* renamed from: E */
    private C3132h f9477E;

    /* renamed from: F */
    private Handler f9478F;

    /* renamed from: G */
    private boolean f9479G;

    /* renamed from: H */
    private float f9480H;

    /* renamed from: I */
    final Point f9481I;

    /* renamed from: J */
    private final Point f9482J;

    /* renamed from: K */
    private final LinkedList<C2881f> f9483K;

    /* renamed from: L */
    private boolean f9484L;

    /* renamed from: M */
    private boolean f9485M;

    /* renamed from: N */
    private boolean f9486N;

    /* renamed from: O */
    private C3472f f9487O;

    /* renamed from: P */
    private long f9488P;

    /* renamed from: Q */
    private long f9489Q;

    /* renamed from: R */
    protected List<C3037b> f9490R;

    /* renamed from: S */
    private double f9491S;

    /* renamed from: T */
    private boolean f9492T;

    /* renamed from: U */
    private final C2882e f9493U;

    /* renamed from: V */
    private final Rect f9494V;

    /* renamed from: W */
    private boolean f9495W;

    /* renamed from: a0 */
    private int f9496a0;

    /* renamed from: b0 */
    private int f9497b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f9498c0;

    /* renamed from: d */
    private double f9499d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f9500d0;

    /* renamed from: e */
    private C3595h f9501e;

    /* renamed from: f */
    protected C2883f f9502f;

    /* renamed from: g */
    private C3603n f9503g;

    /* renamed from: h */
    private final GestureDetector f9504h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Scroller f9505i;

    /* renamed from: j */
    protected boolean f9506j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f9507k;

    /* renamed from: l */
    protected final AtomicBoolean f9508l;

    /* renamed from: m */
    protected Double f9509m;

    /* renamed from: n */
    protected Double f9510n;

    /* renamed from: o */
    private final C2869c f9511o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C2858a f9512p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2390a<Object> f9513q;

    /* renamed from: r */
    private final PointF f9514r;

    /* renamed from: s */
    private final C3472f f9515s;

    /* renamed from: t */
    private PointF f9516t;

    /* renamed from: u */
    private float f9517u;

    /* renamed from: v */
    private final Rect f9518v;

    /* renamed from: w */
    private boolean f9519w;

    /* renamed from: x */
    private double f9520x;

    /* renamed from: y */
    private double f9521y;

    /* renamed from: z */
    private boolean f9522z;

    /* renamed from: org.osmdroid.views.d$b */
    public static class C2877b extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public C2491a f9523a;

        /* renamed from: b */
        public int f9524b;

        /* renamed from: c */
        public int f9525c;

        /* renamed from: d */
        public int f9526d;

        public C2877b(int i, int i2, C2491a aVar, int i3, int i4, int i5) {
            super(i, i2);
            if (aVar != null) {
                this.f9523a = aVar;
            } else {
                this.f9523a = new C3472f(0.0d, 0.0d);
            }
            this.f9524b = i3;
            this.f9525c = i4;
            this.f9526d = i5;
        }

        public C2877b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9523a = new C3472f(0.0d, 0.0d);
            this.f9524b = 8;
        }

        public C2877b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: org.osmdroid.views.d$c */
    private class C2878c implements GestureDetector.OnDoubleTapListener {
        private C2878c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (C2875d.this.getOverlayManager().mo11734m(motionEvent, C2875d.this)) {
                return true;
            }
            C2875d.this.getProjection().mo9999O((int) motionEvent.getX(), (int) motionEvent.getY(), C2875d.this.f9481I);
            C2492b controller = C2875d.this.getController();
            Point point = C2875d.this.f9481I;
            return controller.mo9101b(point.x, point.y);
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return C2875d.this.getOverlayManager().mo11737p(motionEvent, C2875d.this);
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return C2875d.this.getOverlayManager().mo11743t(motionEvent, C2875d.this);
        }
    }

    /* renamed from: org.osmdroid.views.d$d */
    private class C2879d implements GestureDetector.OnGestureListener {
        private C2879d() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            C2875d dVar = C2875d.this;
            if (dVar.f9506j) {
                if (dVar.f9505i != null) {
                    C2875d.this.f9505i.abortAnimation();
                }
                C2875d.this.f9506j = false;
            }
            if (!C2875d.this.getOverlayManager().mo11725e(motionEvent, C2875d.this) && C2875d.this.f9512p != null) {
                C2875d.this.f9512p.mo9833i();
            }
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!C2875d.this.f9498c0 || C2875d.this.f9500d0) {
                boolean unused = C2875d.this.f9500d0 = false;
                return false;
            }
            if (C2875d.this.getOverlayManager().mo11744u(motionEvent, motionEvent2, f, f2, C2875d.this)) {
                return true;
            }
            if (C2875d.this.f9507k) {
                boolean unused2 = C2875d.this.f9507k = false;
                return false;
            }
            C2875d dVar = C2875d.this;
            dVar.f9506j = true;
            if (dVar.f9505i != null) {
                C2875d.this.f9505i.fling((int) C2875d.this.getMapScrollX(), (int) C2875d.this.getMapScrollY(), -((int) f), -((int) f2), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (C2875d.this.f9513q == null || !C2875d.this.f9513q.mo8920d()) {
                C2875d.this.getOverlayManager().mo11745v(motionEvent, C2875d.this);
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C2875d.this.getOverlayManager().mo11723c(motionEvent, motionEvent2, f, f2, C2875d.this)) {
                return true;
            }
            C2875d.this.scrollBy((int) f, (int) f2);
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
            C2875d.this.getOverlayManager().mo11739r(motionEvent, C2875d.this);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return C2875d.this.getOverlayManager().mo11738q(motionEvent, C2875d.this);
        }
    }

    /* renamed from: org.osmdroid.views.d$e */
    private class C2880e implements C2858a.C2863e, ZoomButtonsController.OnZoomListener {
        private C2880e() {
        }

        public void onVisibilityChanged(boolean z) {
        }

        public void onZoom(boolean z) {
            if (z) {
                C2875d.this.getController().mo9102c();
            } else {
                C2875d.this.getController().mo9109j();
            }
        }
    }

    /* renamed from: org.osmdroid.views.d$f */
    public interface C2881f {
        /* renamed from: a */
        void mo9852a(View view, int i, int i2, int i3, int i4);
    }

    public C2875d(Context context) {
        this(context, (C3132h) null, (Handler) null, (AttributeSet) null);
    }

    public C2875d(Context context, C3132h hVar, Handler handler, AttributeSet attributeSet) {
        this(context, hVar, handler, attributeSet, C2954a.m13328a().mo10141E());
    }

    public C2875d(Context context, C3132h hVar, Handler handler, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f9499d = 0.0d;
        this.f9508l = new AtomicBoolean(false);
        this.f9514r = new PointF();
        this.f9515s = new C3472f(0.0d, 0.0d);
        this.f9517u = 0.0f;
        this.f9518v = new Rect();
        this.f9479G = false;
        this.f9480H = 1.0f;
        this.f9481I = new Point();
        this.f9482J = new Point();
        this.f9483K = new LinkedList<>();
        this.f9484L = false;
        this.f9485M = true;
        this.f9486N = true;
        this.f9490R = new ArrayList();
        this.f9493U = new C2882e(this);
        this.f9494V = new Rect();
        this.f9495W = true;
        this.f9498c0 = true;
        this.f9500d0 = false;
        C2954a.m13328a().mo10142F(context);
        if (isInEditMode()) {
            this.f9478F = null;
            this.f9511o = null;
            this.f9512p = null;
            this.f9505i = null;
            this.f9504h = null;
            return;
        }
        if (!z) {
            setLayerType(1, (Paint) null);
        }
        this.f9511o = new C2869c(this);
        this.f9505i = new Scroller(context);
        if (hVar == null) {
            hVar = new C3137i(context.getApplicationContext(), m13031u(attributeSet));
        }
        this.f9478F = handler == null ? new C3428c(this) : handler;
        this.f9477E = hVar;
        hVar.mo10468n().add(this.f9478F);
        m13021S(this.f9477E.mo10469o());
        this.f9503g = new C3603n(this.f9477E, context, this.f9485M, this.f9486N);
        this.f9501e = new C3583a(this.f9503g);
        C2858a aVar = new C2858a(this);
        this.f9512p = aVar;
        aVar.mo9837p(new C2880e());
        m13030q();
        GestureDetector gestureDetector = new GestureDetector(context, new C2879d());
        this.f9504h = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new C2878c());
        if (C2954a.m13328a().mo10175i()) {
            setHasTransientState(true);
        }
        aVar.mo9838q(C2858a.C2864f.SHOW_AND_FADEOUT);
    }

    /* renamed from: F */
    private void m13019F() {
        this.f9502f = null;
    }

    /* renamed from: I */
    private MotionEvent m13020I(MotionEvent motionEvent) {
        if (getMapOrientation() == 0.0f) {
            return motionEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.transform(getProjection().mo10020o());
        return obtain;
    }

    /* renamed from: S */
    private void m13021S(C3374d dVar) {
        float a = (float) dVar.mo11177a();
        int i = (int) (a * (mo9970y() ? ((getResources().getDisplayMetrics().density * 256.0f) / a) * this.f9480H : this.f9480H));
        if (C2954a.m13328a().mo10188v()) {
            Log.d("OsmDroid", "Scaling tiles to " + i);
        }
        C3468d0.m15231N(i);
    }

    public static C3468d0 getTileSystem() {
        return f9472e0;
    }

    /* renamed from: q */
    private void m13030q() {
        this.f9512p.mo9839r(mo9928o());
        this.f9512p.mo9840s(mo9937p());
    }

    public static void setTileSystem(C3468d0 d0Var) {
        f9472e0 = d0Var;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [u4.d, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p135u4.C3374d m13031u(android.util.AttributeSet r7) {
        /*
            r6 = this;
            u4.e r0 = p135u4.C3376f.f11120d
            r1 = 0
            java.lang.String r2 = "OsmDroid"
            if (r7 == 0) goto L_0x003d
            java.lang.String r3 = "tilesource"
            java.lang.String r3 = r7.getAttributeValue(r1, r3)
            if (r3 == 0) goto L_0x003d
            u4.d r3 = p135u4.C3376f.m14924a(r3)     // Catch:{ IllegalArgumentException -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0029 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0029 }
            java.lang.String r5 = "Using tile source specified in layout attributes: "
            r4.append(r5)     // Catch:{ IllegalArgumentException -> 0x0029 }
            r4.append(r3)     // Catch:{ IllegalArgumentException -> 0x0029 }
            java.lang.String r4 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x0029 }
            android.util.Log.i(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0029 }
            r0 = r3
            goto L_0x003d
        L_0x0029:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid tile source specified in layout attributes: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r2, r3)
        L_0x003d:
            if (r7 == 0) goto L_0x006b
            boolean r3 = r0 instanceof p135u4.C3373c
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = "style"
            java.lang.String r7 = r7.getAttributeValue(r1, r3)
            if (r7 != 0) goto L_0x0051
            java.lang.String r7 = "Using default style: 1"
            android.util.Log.i(r2, r7)
            goto L_0x006b
        L_0x0051:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Using style specified in layout attributes: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r2, r1)
            r1 = r0
            u4.c r1 = (p135u4.C3373c) r1
            r1.mo11187e(r7)
        L_0x006b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Using tile source: "
            r7.append(r1)
            java.lang.String r1 = r0.name()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            android.util.Log.i(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.C2875d.m13031u(android.util.AttributeSet):u4.d");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        r7 = r12 - r7;
        r12 = ((long) getPaddingTop()) + r10;
        r9 = (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009b, code lost:
        r7 = r12 - r7;
        r12 = ((long) getPaddingTop()) + r10;
        r9 = (long) (r4 / 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a6, code lost:
        r10 = r12 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b9, code lost:
        r10 = r12 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
        r7 = r12 - r7;
        r10 = r10 + ((long) getPaddingTop());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d5, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e3, code lost:
        r8 = r8 + ((long) r3.f9525c);
        r10 = r10 + ((long) r3.f9526d);
        r2.layout(p147w4.C3468d0.m15232Q(r8), p147w4.C3468d0.m15232Q(r10), p147w4.C3468d0.m15232Q(r8 + ((long) r5)), p147w4.C3468d0.m15232Q(r10 + ((long) r4)));
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9875A(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r6 = r14
            r14.m13019F()
            int r0 = r14.getChildCount()
            r1 = 0
        L_0x0009:
            if (r1 >= r0) goto L_0x0106
            android.view.View r2 = r14.getChildAt(r1)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x0102
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            org.osmdroid.views.d$b r3 = (org.osmdroid.views.C2875d.C2877b) r3
            int r4 = r2.getMeasuredHeight()
            int r5 = r2.getMeasuredWidth()
            org.osmdroid.views.f r7 = r14.getProjection()
            l4.a r8 = r3.f9523a
            android.graphics.Point r9 = r6.f9482J
            r7.mo10003S(r8, r9)
            float r7 = r14.getMapOrientation()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0052
            org.osmdroid.views.f r7 = r14.getProjection()
            android.graphics.Point r8 = r6.f9482J
            int r9 = r8.x
            int r8 = r8.y
            r10 = 0
            android.graphics.Point r7 = r7.mo9999O(r9, r8, r10)
            android.graphics.Point r8 = r6.f9482J
            int r9 = r7.x
            r8.x = r9
            int r7 = r7.y
            r8.y = r7
        L_0x0052:
            android.graphics.Point r7 = r6.f9482J
            int r8 = r7.x
            long r8 = (long) r8
            int r7 = r7.y
            long r10 = (long) r7
            int r7 = r3.f9524b
            switch(r7) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00aa;
                case 5: goto L_0x0092;
                case 6: goto L_0x008a;
                case 7: goto L_0x007c;
                case 8: goto L_0x0069;
                case 9: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x00e3
        L_0x0061:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r12 = r12 + r8
            long r7 = (long) r5
            goto L_0x0072
        L_0x0069:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r12 = r12 + r8
            int r7 = r5 / 2
            long r7 = (long) r7
        L_0x0072:
            long r7 = r12 - r7
            int r9 = r14.getPaddingTop()
            long r12 = (long) r9
            long r12 = r12 + r10
            long r9 = (long) r4
            goto L_0x00a6
        L_0x007c:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r8 = r8 + r12
            int r7 = r14.getPaddingTop()
            long r12 = (long) r7
            long r12 = r12 + r10
            long r10 = (long) r4
            goto L_0x00b9
        L_0x008a:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r12 = r12 + r8
            long r7 = (long) r5
            goto L_0x009b
        L_0x0092:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r12 = r12 + r8
            int r7 = r5 / 2
            long r7 = (long) r7
        L_0x009b:
            long r7 = r12 - r7
            int r9 = r14.getPaddingTop()
            long r12 = (long) r9
            long r12 = r12 + r10
            int r9 = r4 / 2
            long r9 = (long) r9
        L_0x00a6:
            long r9 = r12 - r9
            r10 = r9
            goto L_0x00d5
        L_0x00aa:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r8 = r8 + r12
            int r7 = r14.getPaddingTop()
            long r12 = (long) r7
            long r12 = r12 + r10
            int r7 = r4 / 2
            long r10 = (long) r7
        L_0x00b9:
            long r10 = r12 - r10
            goto L_0x00e3
        L_0x00bc:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r12 = r12 + r8
            long r7 = (long) r5
            goto L_0x00cd
        L_0x00c4:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r12 = r12 + r8
            int r7 = r5 / 2
            long r7 = (long) r7
        L_0x00cd:
            long r7 = r12 - r7
            int r9 = r14.getPaddingTop()
            long r12 = (long) r9
            long r10 = r10 + r12
        L_0x00d5:
            r8 = r7
            goto L_0x00e3
        L_0x00d7:
            int r7 = r14.getPaddingLeft()
            long r12 = (long) r7
            long r8 = r8 + r12
            int r7 = r14.getPaddingTop()
            long r12 = (long) r7
            long r10 = r10 + r12
        L_0x00e3:
            int r7 = r3.f9525c
            long r12 = (long) r7
            long r8 = r8 + r12
            int r3 = r3.f9526d
            long r12 = (long) r3
            long r10 = r10 + r12
            int r3 = p147w4.C3468d0.m15232Q(r8)
            int r7 = p147w4.C3468d0.m15232Q(r10)
            long r12 = (long) r5
            long r8 = r8 + r12
            int r5 = p147w4.C3468d0.m15232Q(r8)
            long r8 = (long) r4
            long r10 = r10 + r8
            int r4 = p147w4.C3468d0.m15232Q(r10)
            r2.layout(r3, r7, r5, r4)
        L_0x0102:
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0106:
            boolean r0 = r14.mo9969x()
            if (r0 != 0) goto L_0x0133
            r0 = 1
            r6.f9484L = r0
            java.util.LinkedList<org.osmdroid.views.d$f> r0 = r6.f9483K
            java.util.Iterator r7 = r0.iterator()
        L_0x0115:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r7.next()
            org.osmdroid.views.d$f r0 = (org.osmdroid.views.C2875d.C2881f) r0
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r0.mo9852a(r1, r2, r3, r4, r5)
            goto L_0x0115
        L_0x012e:
            java.util.LinkedList<org.osmdroid.views.d$f> r0 = r6.f9483K
            r0.clear()
        L_0x0133:
            r14.m13019F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.C2875d.mo9875A(boolean, int, int, int, int):void");
    }

    /* renamed from: B */
    public void mo9876B() {
        getOverlayManager().mo11727g(this);
        this.f9477E.mo10455h();
        C2858a aVar = this.f9512p;
        if (aVar != null) {
            aVar.mo9836o();
        }
        Handler handler = this.f9478F;
        if (handler instanceof C3428c) {
            ((C3428c) handler).mo11319a();
        }
        this.f9478F = null;
        C2883f fVar = this.f9502f;
        if (fVar != null) {
            fVar.mo10011e();
        }
        this.f9502f = null;
        this.f9493U.mo9986e();
        this.f9490R.clear();
    }

    /* renamed from: C */
    public void mo9877C() {
        getOverlayManager().mo11736o();
    }

    /* renamed from: D */
    public void mo9878D() {
        getOverlayManager().mo11720a();
    }

    /* renamed from: E */
    public void mo9879E() {
        this.f9516t = null;
    }

    /* renamed from: G */
    public void mo9880G() {
        this.f9519w = false;
    }

    /* renamed from: H */
    public void mo9881H() {
        this.f9522z = false;
    }

    /* renamed from: J */
    public void mo9882J(C2491a aVar, long j, long j2) {
        C3472f l = getProjection().mo10017l();
        this.f9487O = (C3472f) aVar;
        mo9884L(-j, -j2);
        m13019F();
        if (!getProjection().mo10017l().equals(l)) {
            C3038c cVar = null;
            for (C3037b next : this.f9490R) {
                if (cVar == null) {
                    cVar = new C3038c(this, 0, 0);
                }
                next.mo7823b(cVar);
            }
        }
        invalidate();
    }

    /* renamed from: K */
    public void mo9883K(float f, boolean z) {
        this.f9517u = f % 360.0f;
        if (z) {
            requestLayout();
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo9884L(long j, long j2) {
        this.f9488P = j;
        this.f9489Q = j2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo9885M(float f, float f2) {
        this.f9516t = new PointF(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo9886N(float f, float f2) {
        this.f9514r.set(f, f2);
        Point W = getProjection().mo10007W((int) f, (int) f2, (Point) null);
        getProjection().mo10013g(W.x, W.y, this.f9515s);
        mo9885M(f, f2);
    }

    /* renamed from: O */
    public void mo9887O(double d, double d2, int i) {
        this.f9519w = true;
        this.f9520x = d;
        this.f9521y = d2;
        this.f9476D = i;
    }

    /* renamed from: P */
    public void mo9888P(double d, double d2, int i) {
        this.f9522z = true;
        this.f9473A = d;
        this.f9474B = d2;
        this.f9475C = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public double mo9889Q(double d) {
        double max = Math.max(getMinZoomLevel(), Math.min(getMaxZoomLevel(), d));
        double d2 = this.f9499d;
        if (max != d2) {
            Scroller scroller = this.f9505i;
            if (scroller != null) {
                scroller.forceFinished(true);
            }
            this.f9506j = false;
        }
        C3472f l = getProjection().mo10017l();
        this.f9499d = max;
        setExpectedCenter(l);
        m13030q();
        C3039d dVar = null;
        if (mo9969x()) {
            getController().mo9106g(l);
            Point point = new Point();
            C2883f projection = getProjection();
            C3595h overlayManager = getOverlayManager();
            PointF pointF = this.f9514r;
            if (overlayManager.mo11722b((int) pointF.x, (int) pointF.y, point, this)) {
                getController().mo9104e(projection.mo10014h(point.x, point.y, (C3472f) null, false));
            }
            this.f9477E.mo10471q(projection, max, d2, mo9966t(this.f9494V));
            this.f9500d0 = true;
        }
        if (max != d2) {
            for (C3037b next : this.f9490R) {
                if (dVar == null) {
                    dVar = new C3039d(this, max);
                }
                next.mo7822a(dVar);
            }
        }
        requestLayout();
        invalidate();
        return this.f9499d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo9890R() {
        this.f9491S = getZoomLevelDouble();
    }

    /* renamed from: T */
    public double mo9891T(C3457a aVar, boolean z, int i, double d, Long l) {
        int i2 = i * 2;
        double h = f9472e0.mo11392h(aVar, getWidth() - i2, getHeight() - i2);
        if (h == Double.MIN_VALUE || h > d) {
            h = d;
        }
        double min = Math.min(getMaxZoomLevel(), Math.max(h, getMinZoomLevel()));
        C3472f t = aVar.mo11351t();
        C2883f fVar = new C2883f(min, getWidth(), getHeight(), t, getMapOrientation(), mo9968w(), mo9971z(), getMapCenterOffsetX(), getMapCenterOffsetY());
        Point point = new Point();
        double n = aVar.mo11350n();
        fVar.mo10003S(new C3472f(aVar.mo11347f(), n), point);
        int i3 = point.y;
        fVar.mo10003S(new C3472f(aVar.mo11348h(), n), point);
        int height = ((getHeight() - point.y) - i3) / 2;
        if (height != 0) {
            fVar.mo10009b(0, (long) height);
            fVar.mo10013g(getWidth() / 2, getHeight() / 2, t);
        }
        C2492b controller = getController();
        if (z) {
            controller.mo9108i(t, Double.valueOf(min), l);
        } else {
            controller.mo9107h(min);
            getController().mo9106g(t);
        }
        return min;
    }

    /* renamed from: U */
    public void mo9892U(C3457a aVar, boolean z, int i) {
        mo9891T(aVar, z, i, getMaxZoomLevel(), (Long) null);
    }

    /* renamed from: a */
    public Object mo8922a(C2390a.C2392b bVar) {
        if (mo9967v()) {
            return null;
        }
        mo9886N(bVar.mo8932i(), bVar.mo8933j());
        return this;
    }

    /* renamed from: b */
    public void mo8923b(Object obj, C2390a.C2392b bVar) {
        if (this.f9492T) {
            this.f9499d = (double) Math.round(this.f9499d);
            invalidate();
        }
        mo9879E();
    }

    /* renamed from: c */
    public boolean mo8924c(Object obj, C2390a.C2393c cVar, C2390a.C2392b bVar) {
        mo9885M(cVar.mo8937k(), cVar.mo8938l());
        setMultiTouchScale(cVar.mo8936j());
        requestLayout();
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2877b;
    }

    public void computeScroll() {
        Scroller scroller = this.f9505i;
        if (scroller == null || !this.f9506j || !scroller.computeScrollOffset()) {
            return;
        }
        if (this.f9505i.isFinished()) {
            this.f9506j = false;
            return;
        }
        scrollTo(this.f9505i.getCurrX(), this.f9505i.getCurrY());
        postInvalidate();
    }

    /* renamed from: d */
    public void mo8925d(Object obj, C2390a.C2393c cVar) {
        mo9890R();
        PointF pointF = this.f9514r;
        cVar.mo8940n(pointF.x, pointF.y, true, 1.0f, false, 0.0f, 0.0f, false, 0.0f);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        m13019F();
        getProjection().mo10000P(canvas, true, false);
        try {
            getOverlayManager().mo11746w(canvas, this);
            getProjection().mo9998N(canvas, false);
            C2858a aVar = this.f9512p;
            if (aVar != null) {
                aVar.mo9834k(canvas);
            }
            super.dispatchDraw(canvas);
        } catch (Exception e) {
            Log.e("OsmDroid", "error dispatchDraw, probably in edit mode", e);
        }
        if (C2954a.m13328a().mo10188v()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.d("OsmDroid", "Rendering overall: " + (currentTimeMillis2 - currentTimeMillis) + "ms");
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (C2954a.m13328a().mo10188v()) {
            Log.d("OsmDroid", "dispatchTouchEvent(" + motionEvent + ")");
        }
        if (this.f9512p.mo9835m(motionEvent)) {
            this.f9512p.mo9833i();
            return true;
        }
        MotionEvent I = m13020I(motionEvent);
        try {
            if (super.dispatchTouchEvent(motionEvent)) {
                if (C2954a.m13328a().mo10188v()) {
                    Log.d("OsmDroid", "super handled onTouchEvent");
                }
                return true;
            } else if (getOverlayManager().mo11724d(I, this)) {
                if (I != motionEvent) {
                    I.recycle();
                }
                return true;
            } else {
                C2390a<Object> aVar = this.f9513q;
                if (aVar == null || !aVar.mo8921f(motionEvent)) {
                    z = false;
                } else {
                    if (C2954a.m13328a().mo10188v()) {
                        Log.d("OsmDroid", "mMultiTouchController handled onTouchEvent");
                    }
                    z = true;
                }
                if (this.f9504h.onTouchEvent(I)) {
                    if (C2954a.m13328a().mo10188v()) {
                        Log.d("OsmDroid", "mGestureDetector handled onTouchEvent");
                    }
                    z = true;
                }
                if (z) {
                    if (I != motionEvent) {
                        I.recycle();
                    }
                    return true;
                }
                if (I != motionEvent) {
                    I.recycle();
                }
                if (C2954a.m13328a().mo10188v()) {
                    Log.d("OsmDroid", "no-one handled onTouchEvent");
                }
                return false;
            }
        } finally {
            if (I != motionEvent) {
                I.recycle();
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2877b(-2, -2, (C2491a) null, 8, 0, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2877b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2877b(layoutParams);
    }

    public C3457a getBoundingBox() {
        return getProjection().mo10015i();
    }

    public C2492b getController() {
        return this.f9511o;
    }

    /* access modifiers changed from: package-private */
    public C3472f getExpectedCenter() {
        return this.f9487O;
    }

    public double getLatitudeSpanDouble() {
        return getBoundingBox().mo11355w();
    }

    public double getLongitudeSpanDouble() {
        return getBoundingBox().mo11359z();
    }

    public C2491a getMapCenter() {
        return mo9939s((C3472f) null);
    }

    public int getMapCenterOffsetX() {
        return this.f9496a0;
    }

    public int getMapCenterOffsetY() {
        return this.f9497b0;
    }

    public float getMapOrientation() {
        return this.f9517u;
    }

    public C3603n getMapOverlay() {
        return this.f9503g;
    }

    @Deprecated
    public float getMapScale() {
        return 1.0f;
    }

    public long getMapScrollX() {
        return this.f9488P;
    }

    public long getMapScrollY() {
        return this.f9489Q;
    }

    public double getMaxZoomLevel() {
        Double d = this.f9510n;
        return d == null ? (double) this.f9503g.mo11842I() : d.doubleValue();
    }

    public double getMinZoomLevel() {
        Double d = this.f9509m;
        return d == null ? (double) this.f9503g.mo11843J() : d.doubleValue();
    }

    public C3595h getOverlayManager() {
        return this.f9501e;
    }

    public List<C3593g> getOverlays() {
        return getOverlayManager().mo11729h();
    }

    public C2883f getProjection() {
        if (this.f9502f == null) {
            C2883f fVar = new C2883f(this);
            this.f9502f = fVar;
            fVar.mo10010c(this.f9515s, this.f9516t);
            if (this.f9519w) {
                fVar.mo10008a(this.f9520x, this.f9521y, true, this.f9476D);
            }
            if (this.f9522z) {
                fVar.mo10008a(this.f9473A, this.f9474B, false, this.f9475C);
            }
            this.f9507k = fVar.mo10001Q(this);
        }
        return this.f9502f;
    }

    public C2882e getRepository() {
        return this.f9493U;
    }

    public Scroller getScroller() {
        return this.f9505i;
    }

    public C3132h getTileProvider() {
        return this.f9477E;
    }

    public Handler getTileRequestCompleteHandler() {
        return this.f9478F;
    }

    public float getTilesScaleFactor() {
        return this.f9480H;
    }

    public C2858a getZoomController() {
        return this.f9512p;
    }

    @Deprecated
    public int getZoomLevel() {
        return (int) getZoomLevelDouble();
    }

    public double getZoomLevelDouble() {
        return this.f9499d;
    }

    /* renamed from: m */
    public void mo9926m(C3037b bVar) {
        this.f9490R.add(bVar);
    }

    /* renamed from: n */
    public void mo9927n(C2881f fVar) {
        if (!mo9969x()) {
            this.f9483K.add(fVar);
        }
    }

    /* renamed from: o */
    public boolean mo9928o() {
        return this.f9499d < getMaxZoomLevel();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f9495W) {
            mo9876B();
        }
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return getOverlayManager().mo11733l(i, keyEvent, this) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return getOverlayManager().mo11731j(i, keyEvent, this) || super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo9875A(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (getOverlayManager().mo11726f(motionEvent, this)) {
            return true;
        }
        scrollBy((int) (motionEvent.getX() * 25.0f), (int) (motionEvent.getY() * 25.0f));
        return super.onTrackballEvent(motionEvent);
    }

    /* renamed from: p */
    public boolean mo9937p() {
        return this.f9499d > getMinZoomLevel();
    }

    /* renamed from: r */
    public Rect mo9938r(Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(0, 0, getWidth(), getHeight());
        return rect;
    }

    /* renamed from: s */
    public C2491a mo9939s(C3472f fVar) {
        return getProjection().mo10014h(getWidth() / 2, getHeight() / 2, fVar, false);
    }

    public void scrollBy(int i, int i2) {
        scrollTo((int) (getMapScrollX() + ((long) i)), (int) (getMapScrollY() + ((long) i2)));
    }

    public void scrollTo(int i, int i2) {
        mo9884L((long) i, (long) i2);
        m13019F();
        invalidate();
        if (getMapOrientation() != 0.0f) {
            mo9875A(true, getLeft(), getTop(), getRight(), getBottom());
        }
        C3038c cVar = null;
        for (C3037b next : this.f9490R) {
            if (cVar == null) {
                cVar = new C3038c(this, i, i2);
            }
            next.mo7823b(cVar);
        }
    }

    public void setBackgroundColor(int i) {
        this.f9503g.mo11848O(i);
        invalidate();
    }

    @Deprecated
    public void setBuiltInZoomControls(boolean z) {
        this.f9512p.mo9838q(z ? C2858a.C2864f.SHOW_AND_FADEOUT : C2858a.C2864f.NEVER);
    }

    public void setDestroyMode(boolean z) {
        this.f9495W = z;
    }

    public void setExpectedCenter(C2491a aVar) {
        mo9882J(aVar, 0, 0);
    }

    public void setFlingEnabled(boolean z) {
        this.f9498c0 = z;
    }

    public void setHorizontalMapRepetitionEnabled(boolean z) {
        this.f9485M = z;
        this.f9503g.mo11847N(z);
        m13019F();
        invalidate();
    }

    @Deprecated
    public void setInitCenter(C2491a aVar) {
        setExpectedCenter(aVar);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public void setMapCenter(C2491a aVar) {
        getController().mo9104e(aVar);
    }

    @Deprecated
    public void setMapListener(C3037b bVar) {
        this.f9490R.add(bVar);
    }

    public void setMapOrientation(float f) {
        mo9883K(f, true);
    }

    public void setMaxZoomLevel(Double d) {
        this.f9510n = d;
    }

    public void setMinZoomLevel(Double d) {
        this.f9509m = d;
    }

    public void setMultiTouchControls(boolean z) {
        this.f9513q = z ? new C2390a<>(this, false) : null;
    }

    /* access modifiers changed from: protected */
    public void setMultiTouchScale(float f) {
        mo9889Q((Math.log((double) f) / Math.log(2.0d)) + this.f9491S);
    }

    public void setOverlayManager(C3595h hVar) {
        this.f9501e = hVar;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void setProjection(C2883f fVar) {
        this.f9502f = fVar;
    }

    public void setScrollableAreaLimitDouble(C3457a aVar) {
        if (aVar == null) {
            mo9880G();
            mo9881H();
            return;
        }
        mo9887O(aVar.mo11347f(), aVar.mo11348h(), 0);
        mo9888P(aVar.mo11358y(), aVar.mo11357x(), 0);
    }

    public void setTileProvider(C3132h hVar) {
        this.f9477E.mo10455h();
        this.f9477E.mo10464f();
        this.f9477E = hVar;
        hVar.mo10468n().add(this.f9478F);
        m13021S(this.f9477E.mo10469o());
        C3603n nVar = new C3603n(this.f9477E, getContext(), this.f9485M, this.f9486N);
        this.f9503g = nVar;
        this.f9501e.mo11732k(nVar);
        invalidate();
    }

    public void setTileSource(C3374d dVar) {
        this.f9477E.mo10460u(dVar);
        m13021S(dVar);
        m13030q();
        mo9889Q(this.f9499d);
        postInvalidate();
    }

    public void setTilesScaleFactor(float f) {
        this.f9480H = f;
        m13021S(getTileProvider().mo10469o());
    }

    public void setTilesScaledToDpi(boolean z) {
        this.f9479G = z;
        m13021S(getTileProvider().mo10469o());
    }

    public void setUseDataConnection(boolean z) {
        this.f9503g.mo11850Q(z);
    }

    public void setVerticalMapRepetitionEnabled(boolean z) {
        this.f9486N = z;
        this.f9503g.mo11851R(z);
        m13019F();
        invalidate();
    }

    public void setZoomRounding(boolean z) {
        this.f9492T = z;
    }

    /* renamed from: t */
    public Rect mo9966t(Rect rect) {
        Rect r = mo9938r(rect);
        if (!(getMapOrientation() == 0.0f || getMapOrientation() == 180.0f)) {
            C3475g.m15300c(r, r.centerX(), r.centerY(), getMapOrientation(), r);
        }
        return r;
    }

    /* renamed from: v */
    public boolean mo9967v() {
        return this.f9508l.get();
    }

    /* renamed from: w */
    public boolean mo9968w() {
        return this.f9485M;
    }

    /* renamed from: x */
    public boolean mo9969x() {
        return this.f9484L;
    }

    /* renamed from: y */
    public boolean mo9970y() {
        return this.f9479G;
    }

    /* renamed from: z */
    public boolean mo9971z() {
        return this.f9486N;
    }
}
