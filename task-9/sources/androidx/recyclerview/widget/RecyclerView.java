package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p008os.C0560k;
import androidx.core.util.C0612h;
import androidx.core.view.C0613a;
import androidx.core.view.C0650b0;
import androidx.core.view.C0716m;
import androidx.core.view.C0723n;
import androidx.core.view.C0724o;
import androidx.core.view.C0735z;
import androidx.core.view.accessibility.C0618b;
import androidx.core.view.accessibility.C0624d;
import androidx.recyclerview.widget.C1113a;
import androidx.recyclerview.widget.C1116b;
import androidx.recyclerview.widget.C1135e;
import androidx.recyclerview.widget.C1148k;
import androidx.recyclerview.widget.C1154o;
import androidx.recyclerview.widget.C1157p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p058i0.C2087a;
import p058i0.C2088b;
import p058i0.C2089c;
import p142w.C3433a;

public class RecyclerView extends ViewGroup implements C0723n {

    /* renamed from: B0 */
    private static final int[] f3635B0 = {16843830};

    /* renamed from: C0 */
    static final boolean f3636C0;

    /* renamed from: D0 */
    static final boolean f3637D0;

    /* renamed from: E0 */
    static final boolean f3638E0 = true;

    /* renamed from: F0 */
    static final boolean f3639F0;

    /* renamed from: G0 */
    private static final boolean f3640G0 = false;

    /* renamed from: H0 */
    private static final boolean f3641H0 = false;

    /* renamed from: I0 */
    private static final Class<?>[] f3642I0;

    /* renamed from: J0 */
    static final Interpolator f3643J0 = new C1067c();

    /* renamed from: A */
    boolean f3644A;

    /* renamed from: A0 */
    private final C1157p.C1159b f3645A0;

    /* renamed from: B */
    private boolean f3646B;

    /* renamed from: C */
    private int f3647C;

    /* renamed from: D */
    boolean f3648D;

    /* renamed from: E */
    private final AccessibilityManager f3649E;

    /* renamed from: F */
    private List<C1090q> f3650F;

    /* renamed from: G */
    boolean f3651G;

    /* renamed from: H */
    boolean f3652H;

    /* renamed from: I */
    private int f3653I;

    /* renamed from: J */
    private int f3654J;

    /* renamed from: K */
    private C1077k f3655K;

    /* renamed from: L */
    private EdgeEffect f3656L;

    /* renamed from: M */
    private EdgeEffect f3657M;

    /* renamed from: N */
    private EdgeEffect f3658N;

    /* renamed from: O */
    private EdgeEffect f3659O;

    /* renamed from: P */
    C1078l f3660P;

    /* renamed from: Q */
    private int f3661Q;

    /* renamed from: R */
    private int f3662R;

    /* renamed from: S */
    private VelocityTracker f3663S;

    /* renamed from: T */
    private int f3664T;

    /* renamed from: U */
    private int f3665U;

    /* renamed from: V */
    private int f3666V;

    /* renamed from: W */
    private int f3667W;

    /* renamed from: a0 */
    private int f3668a0;

    /* renamed from: b0 */
    private C1091r f3669b0;

    /* renamed from: c0 */
    private final int f3670c0;

    /* renamed from: d */
    private final C1098x f3671d;

    /* renamed from: d0 */
    private final int f3672d0;

    /* renamed from: e */
    final C1096v f3673e;

    /* renamed from: e0 */
    private float f3674e0;

    /* renamed from: f */
    private C1099y f3675f;

    /* renamed from: f0 */
    private float f3676f0;

    /* renamed from: g */
    C1113a f3677g;

    /* renamed from: g0 */
    private boolean f3678g0;

    /* renamed from: h */
    C1116b f3679h;

    /* renamed from: h0 */
    final C1068c0 f3680h0;

    /* renamed from: i */
    final C1157p f3681i;

    /* renamed from: i0 */
    C1135e f3682i0;

    /* renamed from: j */
    boolean f3683j;

    /* renamed from: j0 */
    C1135e.C1137b f3684j0;

    /* renamed from: k */
    final Runnable f3685k;

    /* renamed from: k0 */
    final C1064a0 f3686k0;

    /* renamed from: l */
    final Rect f3687l;

    /* renamed from: l0 */
    private C1093t f3688l0;

    /* renamed from: m */
    private final Rect f3689m;

    /* renamed from: m0 */
    private List<C1093t> f3690m0;

    /* renamed from: n */
    final RectF f3691n;

    /* renamed from: n0 */
    boolean f3692n0;

    /* renamed from: o */
    C1073g f3693o;

    /* renamed from: o0 */
    boolean f3694o0;

    /* renamed from: p */
    C1084o f3695p;

    /* renamed from: p0 */
    private C1078l.C1080b f3696p0;

    /* renamed from: q */
    C1097w f3697q;

    /* renamed from: q0 */
    boolean f3698q0;

    /* renamed from: r */
    final ArrayList<C1083n> f3699r;

    /* renamed from: r0 */
    C1148k f3700r0;

    /* renamed from: s */
    private final ArrayList<C1092s> f3701s;

    /* renamed from: s0 */
    private C1076j f3702s0;

    /* renamed from: t */
    private C1092s f3703t;

    /* renamed from: t0 */
    private final int[] f3704t0;

    /* renamed from: u */
    boolean f3705u;

    /* renamed from: u0 */
    private C0724o f3706u0;

    /* renamed from: v */
    boolean f3707v;

    /* renamed from: v0 */
    private final int[] f3708v0;

    /* renamed from: w */
    boolean f3709w;

    /* renamed from: w0 */
    private final int[] f3710w0;

    /* renamed from: x */
    boolean f3711x;

    /* renamed from: x0 */
    final int[] f3712x0;

    /* renamed from: y */
    private int f3713y;

    /* renamed from: y0 */
    final List<C1070d0> f3714y0;

    /* renamed from: z */
    boolean f3715z;

    /* renamed from: z0 */
    private Runnable f3716z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1063a implements Runnable {
        C1063a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3711x && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3705u) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3644A) {
                    recyclerView2.f3715z = true;
                } else {
                    recyclerView2.mo4184u();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C1064a0 {

        /* renamed from: a */
        int f3718a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3719b;

        /* renamed from: c */
        int f3720c = 0;

        /* renamed from: d */
        int f3721d = 0;

        /* renamed from: e */
        int f3722e = 1;

        /* renamed from: f */
        int f3723f = 0;

        /* renamed from: g */
        boolean f3724g = false;

        /* renamed from: h */
        boolean f3725h = false;

        /* renamed from: i */
        boolean f3726i = false;

        /* renamed from: j */
        boolean f3727j = false;

        /* renamed from: k */
        boolean f3728k = false;

        /* renamed from: l */
        boolean f3729l = false;

        /* renamed from: m */
        int f3730m;

        /* renamed from: n */
        long f3731n;

        /* renamed from: o */
        int f3732o;

        /* renamed from: p */
        int f3733p;

        /* renamed from: q */
        int f3734q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4195a(int i) {
            if ((this.f3722e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3722e));
            }
        }

        /* renamed from: b */
        public int mo4196b() {
            return this.f3725h ? this.f3720c - this.f3721d : this.f3723f;
        }

        /* renamed from: c */
        public int mo4197c() {
            return this.f3718a;
        }

        /* renamed from: d */
        public boolean mo4198d() {
            return this.f3718a != -1;
        }

        /* renamed from: e */
        public boolean mo4199e() {
            return this.f3725h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4200f(C1073g gVar) {
            this.f3722e = 1;
            this.f3723f = gVar.mo4274c();
            this.f3725h = false;
            this.f3726i = false;
            this.f3727j = false;
        }

        /* renamed from: g */
        public boolean mo4201g() {
            return this.f3729l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3718a + ", mData=" + this.f3719b + ", mItemCount=" + this.f3723f + ", mIsMeasuring=" + this.f3727j + ", mPreviousLayoutItemCount=" + this.f3720c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3721d + ", mStructureChanged=" + this.f3724g + ", mInPreLayout=" + this.f3725h + ", mRunSimpleAnimations=" + this.f3728k + ", mRunPredictiveAnimations=" + this.f3729l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1065b implements Runnable {
        C1065b() {
        }

        public void run() {
            C1078l lVar = RecyclerView.this.f3660P;
            if (lVar != null) {
                lVar.mo4316u();
            }
            RecyclerView.this.f3698q0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C1066b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C1067c implements Interpolator {
        C1067c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C1068c0 implements Runnable {

        /* renamed from: d */
        private int f3736d;

        /* renamed from: e */
        private int f3737e;

        /* renamed from: f */
        OverScroller f3738f;

        /* renamed from: g */
        Interpolator f3739g;

        /* renamed from: h */
        private boolean f3740h = false;

        /* renamed from: i */
        private boolean f3741i = false;

        C1068c0() {
            Interpolator interpolator = RecyclerView.f3643J0;
            this.f3739g = interpolator;
            this.f3738f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m4944a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m4945b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m4945b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m4946d() {
            RecyclerView.this.removeCallbacks(this);
            C0735z.m3212j0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo4205c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3737e = 0;
            this.f3736d = 0;
            Interpolator interpolator = this.f3739g;
            Interpolator interpolator2 = RecyclerView.f3643J0;
            if (interpolator != interpolator2) {
                this.f3739g = interpolator2;
                this.f3738f = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3738f.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4206e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4206e() {
            if (this.f3740h) {
                this.f3741i = true;
            } else {
                m4946d();
            }
        }

        /* renamed from: f */
        public void mo4207f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m4944a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3643J0;
            }
            if (this.f3739g != interpolator) {
                this.f3739g = interpolator;
                this.f3738f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3737e = 0;
            this.f3736d = 0;
            RecyclerView.this.setScrollState(2);
            this.f3738f.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3738f.computeScrollOffset();
            }
            mo4206e();
        }

        /* renamed from: g */
        public void mo4208g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3738f.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3695p == null) {
                mo4208g();
                return;
            }
            this.f3741i = false;
            this.f3740h = true;
            recyclerView.mo4184u();
            OverScroller overScroller = this.f3738f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3736d;
                int i4 = currY - this.f3737e;
                this.f3736d = currX;
                this.f3737e = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3712x0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo4032F(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3712x0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo4181t(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3693o != null) {
                    int[] iArr3 = recyclerView3.f3712x0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo4087f1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3712x0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C1101z zVar = recyclerView4.f3695p.f3784g;
                    if (zVar != null && !zVar.mo4501g() && zVar.mo4502h()) {
                        int b = RecyclerView.this.f3686k0.mo4196b();
                        if (b == 0) {
                            zVar.mo4512r();
                        } else {
                            if (zVar.mo4500f() >= b) {
                                zVar.mo4510p(b - 1);
                            }
                            zVar.mo4504j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f3699r.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3712x0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo4034G(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3712x0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo4038I(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C1101z zVar2 = RecyclerView.this.f3695p.f3784g;
                if ((zVar2 != null && zVar2.mo4501g()) || !z) {
                    mo4206e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1135e eVar = recyclerView7.f3682i0;
                    if (eVar != null) {
                        eVar.mo4675f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo4062a(i7, currVelocity);
                    }
                    if (RecyclerView.f3639F0) {
                        RecyclerView.this.f3684j0.mo4681b();
                    }
                }
            }
            C1101z zVar3 = RecyclerView.this.f3695p.f3784g;
            if (zVar3 != null && zVar3.mo4501g()) {
                zVar3.mo4504j(0, 0);
            }
            this.f3740h = false;
            if (this.f3741i) {
                m4946d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo4155s1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1069d implements C1157p.C1159b {
        C1069d() {
        }

        /* renamed from: a */
        public void mo4210a(C1070d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3695p.mo4405p1(d0Var.f3745a, recyclerView.f3673e);
        }

        /* renamed from: b */
        public void mo4211b(C1070d0 d0Var, C1078l.C1081c cVar, C1078l.C1081c cVar2) {
            RecyclerView.this.mo4121l(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4212c(C1070d0 d0Var, C1078l.C1081c cVar, C1078l.C1081c cVar2) {
            RecyclerView.this.f3673e.mo4460J(d0Var);
            RecyclerView.this.mo4125n(d0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo4213d(C1070d0 d0Var, C1078l.C1081c cVar, C1078l.C1081c cVar2) {
            d0Var.mo4220G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f3651G;
            C1078l lVar = recyclerView.f3660P;
            if (z) {
                if (!lVar.mo4298b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo4300d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.mo4043L0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C1070d0 {

        /* renamed from: s */
        private static final List<Object> f3744s = Collections.emptyList();

        /* renamed from: a */
        public final View f3745a;

        /* renamed from: b */
        WeakReference<RecyclerView> f3746b;

        /* renamed from: c */
        int f3747c = -1;

        /* renamed from: d */
        int f3748d = -1;

        /* renamed from: e */
        long f3749e = -1;

        /* renamed from: f */
        int f3750f = -1;

        /* renamed from: g */
        int f3751g = -1;

        /* renamed from: h */
        C1070d0 f3752h = null;

        /* renamed from: i */
        C1070d0 f3753i = null;

        /* renamed from: j */
        int f3754j;

        /* renamed from: k */
        List<Object> f3755k = null;

        /* renamed from: l */
        List<Object> f3756l = null;

        /* renamed from: m */
        private int f3757m = 0;

        /* renamed from: n */
        C1096v f3758n = null;

        /* renamed from: o */
        boolean f3759o = false;

        /* renamed from: p */
        private int f3760p = 0;

        /* renamed from: q */
        int f3761q = -1;

        /* renamed from: r */
        RecyclerView f3762r;

        public C1070d0(View view) {
            if (view != null) {
                this.f3745a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m4955g() {
            if (this.f3755k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3755k = arrayList;
                this.f3756l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4214A(int i, boolean z) {
            if (this.f3748d == -1) {
                this.f3748d = this.f3747c;
            }
            if (this.f3751g == -1) {
                this.f3751g = this.f3747c;
            }
            if (z) {
                this.f3751g += i;
            }
            this.f3747c += i;
            if (this.f3745a.getLayoutParams() != null) {
                ((C1089p) this.f3745a.getLayoutParams()).f3804c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4215B(RecyclerView recyclerView) {
            int i = this.f3761q;
            if (i == -1) {
                i = C0735z.m3156C(this.f3745a);
            }
            this.f3760p = i;
            recyclerView.mo4113i1(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4216C(RecyclerView recyclerView) {
            recyclerView.mo4113i1(this, this.f3760p);
            this.f3760p = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4217D() {
            this.f3754j = 0;
            this.f3747c = -1;
            this.f3748d = -1;
            this.f3749e = -1;
            this.f3751g = -1;
            this.f3757m = 0;
            this.f3752h = null;
            this.f3753i = null;
            mo4229d();
            this.f3760p = 0;
            this.f3761q = -1;
            RecyclerView.m4847r(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4218E() {
            if (this.f3748d == -1) {
                this.f3748d = this.f3747c;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4219F(int i, int i2) {
            this.f3754j = (i & i2) | (this.f3754j & (i2 ^ -1));
        }

        /* renamed from: G */
        public final void mo4220G(boolean z) {
            int i;
            int i2 = this.f3757m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f3757m = i3;
            if (i3 < 0) {
                this.f3757m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3754j | 16;
            } else if (z && i3 == 0) {
                i = this.f3754j & -17;
            } else {
                return;
            }
            this.f3754j = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo4221H(C1096v vVar, boolean z) {
            this.f3758n = vVar;
            this.f3759o = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo4222I() {
            return (this.f3754j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo4223J() {
            return (this.f3754j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4224K() {
            this.f3758n.mo4460J(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4225L() {
            return (this.f3754j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4226a(Object obj) {
            if (obj == null) {
                mo4227b(1024);
            } else if ((1024 & this.f3754j) == 0) {
                m4955g();
                this.f3755k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4227b(int i) {
            this.f3754j = i | this.f3754j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4228c() {
            this.f3748d = -1;
            this.f3751g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4229d() {
            List<Object> list = this.f3755k;
            if (list != null) {
                list.clear();
            }
            this.f3754j &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4230e() {
            this.f3754j &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4231f() {
            this.f3754j &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4232h() {
            return (this.f3754j & 16) == 0 && C0735z.m3185S(this.f3745a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4233i(int i, int i2, boolean z) {
            mo4227b(8);
            mo4214A(i2, z);
            this.f3747c = i;
        }

        /* renamed from: j */
        public final int mo4234j() {
            RecyclerView recyclerView = this.f3762r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4065b0(this);
        }

        /* renamed from: k */
        public final long mo4235k() {
            return this.f3749e;
        }

        /* renamed from: l */
        public final int mo4236l() {
            return this.f3750f;
        }

        /* renamed from: m */
        public final int mo4237m() {
            int i = this.f3751g;
            return i == -1 ? this.f3747c : i;
        }

        /* renamed from: n */
        public final int mo4238n() {
            return this.f3748d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public List<Object> mo4239o() {
            if ((this.f3754j & 1024) != 0) {
                return f3744s;
            }
            List<Object> list = this.f3755k;
            return (list == null || list.size() == 0) ? f3744s : this.f3756l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4240p(int i) {
            return (i & this.f3754j) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4241q() {
            return (this.f3754j & 512) != 0 || mo4244t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4242r() {
            return (this.f3745a.getParent() == null || this.f3745a.getParent() == this.f3762r) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4243s() {
            return (this.f3754j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo4244t() {
            return (this.f3754j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3747c + " id=" + this.f3749e + ", oldPos=" + this.f3748d + ", pLpos:" + this.f3751g);
            if (mo4248w()) {
                sb.append(" scrap ");
                sb.append(this.f3759o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4244t()) {
                sb.append(" invalid");
            }
            if (!mo4243s()) {
                sb.append(" unbound");
            }
            if (mo4251z()) {
                sb.append(" update");
            }
            if (mo4247v()) {
                sb.append(" removed");
            }
            if (mo4223J()) {
                sb.append(" ignored");
            }
            if (mo4249x()) {
                sb.append(" tmpDetached");
            }
            if (!mo4246u()) {
                sb.append(" not recyclable(" + this.f3757m + ")");
            }
            if (mo4241q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3745a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo4246u() {
            return (this.f3754j & 16) == 0 && !C0735z.m3185S(this.f3745a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo4247v() {
            return (this.f3754j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo4248w() {
            return this.f3758n != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4249x() {
            return (this.f3754j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4250y() {
            return (this.f3754j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo4251z() {
            return (this.f3754j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1071e implements C1116b.C1118b {
        C1071e() {
        }

        /* renamed from: a */
        public View mo4252a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo4253b(View view) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (f0 != null) {
                f0.mo4215B(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public void mo4254c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo4192z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: d */
        public void mo4255d() {
            int k = mo4262k();
            for (int i = 0; i < k; i++) {
                View a = mo4252a(i);
                RecyclerView.this.mo4192z(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: e */
        public C1070d0 mo4256e(View view) {
            return RecyclerView.m4835f0(view);
        }

        /* renamed from: f */
        public void mo4257f(int i) {
            C1070d0 f0;
            View a = mo4252a(i);
            if (!(a == null || (f0 = RecyclerView.m4835f0(a)) == null)) {
                if (!f0.mo4249x() || f0.mo4223J()) {
                    f0.mo4227b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + f0 + RecyclerView.this.mo4048P());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: g */
        public void mo4258g(View view) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (f0 != null) {
                f0.mo4216C(RecyclerView.this);
            }
        }

        /* renamed from: h */
        public void mo4259h(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (f0 != null) {
                if (f0.mo4249x() || f0.mo4223J()) {
                    f0.mo4231f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0 + RecyclerView.this.mo4048P());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: i */
        public void mo4260i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo4190y(view);
        }

        /* renamed from: j */
        public int mo4261j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: k */
        public int mo4262k() {
            return RecyclerView.this.getChildCount();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1072f implements C1113a.C1114a {
        C1072f() {
        }

        /* renamed from: a */
        public void mo4263a(int i, int i2) {
            RecyclerView.this.mo4028B0(i, i2);
            RecyclerView.this.f3692n0 = true;
        }

        /* renamed from: b */
        public void mo4264b(C1113a.C1115b bVar) {
            mo4271i(bVar);
        }

        /* renamed from: c */
        public C1070d0 mo4265c(int i) {
            C1070d0 Z = RecyclerView.this.mo4061Z(i, true);
            if (Z != null && !RecyclerView.this.f3679h.mo4622n(Z.f3745a)) {
                return Z;
            }
            return null;
        }

        /* renamed from: d */
        public void mo4266d(int i, int i2) {
            RecyclerView.this.mo4029C0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3692n0 = true;
            recyclerView.f3686k0.f3721d += i2;
        }

        /* renamed from: e */
        public void mo4267e(int i, int i2) {
            RecyclerView.this.mo4029C0(i, i2, false);
            RecyclerView.this.f3692n0 = true;
        }

        /* renamed from: f */
        public void mo4268f(C1113a.C1115b bVar) {
            mo4271i(bVar);
        }

        /* renamed from: g */
        public void mo4269g(int i, int i2) {
            RecyclerView.this.mo4026A0(i, i2);
            RecyclerView.this.f3692n0 = true;
        }

        /* renamed from: h */
        public void mo4270h(int i, int i2, Object obj) {
            RecyclerView.this.mo4186v1(i, i2, obj);
            RecyclerView.this.f3694o0 = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4271i(C1113a.C1115b bVar) {
            int i = bVar.f3901a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3695p.mo3941U0(recyclerView, bVar.f3902b, bVar.f3904d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3695p.mo3944X0(recyclerView2, bVar.f3902b, bVar.f3904d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3695p.mo3945Z0(recyclerView3, bVar.f3902b, bVar.f3904d, bVar.f3903c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3695p.mo3943W0(recyclerView4, bVar.f3902b, bVar.f3904d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C1073g<VH extends C1070d0> {

        /* renamed from: a */
        private final C1074h f3765a = new C1074h();

        /* renamed from: b */
        private boolean f3766b = false;

        /* renamed from: a */
        public final void mo4272a(VH vh, int i) {
            vh.f3747c = i;
            if (mo4278g()) {
                vh.f3749e = mo4275d(i);
            }
            vh.mo4219F(1, 519);
            C0560k.m2546a("RV OnBindView");
            mo4282k(vh, i, vh.mo4239o());
            vh.mo4229d();
            ViewGroup.LayoutParams layoutParams = vh.f3745a.getLayoutParams();
            if (layoutParams instanceof C1089p) {
                ((C1089p) layoutParams).f3804c = true;
            }
            C0560k.m2547b();
        }

        /* renamed from: b */
        public final VH mo4273b(ViewGroup viewGroup, int i) {
            try {
                C0560k.m2546a("RV CreateView");
                VH l = mo4283l(viewGroup, i);
                if (l.f3745a.getParent() == null) {
                    l.f3750f = i;
                    return l;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0560k.m2547b();
            }
        }

        /* renamed from: c */
        public abstract int mo4274c();

        /* renamed from: d */
        public long mo4275d(int i) {
            return -1;
        }

        /* renamed from: e */
        public int mo4276e(int i) {
            return 0;
        }

        /* renamed from: f */
        public final boolean mo4277f() {
            return this.f3765a.mo4292a();
        }

        /* renamed from: g */
        public final boolean mo4278g() {
            return this.f3766b;
        }

        /* renamed from: h */
        public final void mo4279h() {
            this.f3765a.mo4293b();
        }

        /* renamed from: i */
        public void mo4280i(RecyclerView recyclerView) {
        }

        /* renamed from: j */
        public abstract void mo4281j(VH vh, int i);

        /* renamed from: k */
        public void mo4282k(VH vh, int i, List<Object> list) {
            mo4281j(vh, i);
        }

        /* renamed from: l */
        public abstract VH mo4283l(ViewGroup viewGroup, int i);

        /* renamed from: m */
        public void mo4284m(RecyclerView recyclerView) {
        }

        /* renamed from: n */
        public boolean mo4285n(VH vh) {
            return false;
        }

        /* renamed from: o */
        public void mo4286o(VH vh) {
        }

        /* renamed from: p */
        public void mo4287p(VH vh) {
        }

        /* renamed from: q */
        public void mo4288q(VH vh) {
        }

        /* renamed from: r */
        public void mo4289r(C1075i iVar) {
            this.f3765a.registerObserver(iVar);
        }

        /* renamed from: s */
        public void mo4290s(boolean z) {
            if (!mo4277f()) {
                this.f3766b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: t */
        public void mo4291t(C1075i iVar) {
            this.f3765a.unregisterObserver(iVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C1074h extends Observable<C1075i> {
        C1074h() {
        }

        /* renamed from: a */
        public boolean mo4292a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4293b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1075i) this.mObservers.get(size)).mo4294a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C1075i {
        /* renamed from: a */
        public void mo4294a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C1076j {
        /* renamed from: a */
        int mo4295a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C1077k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4296a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1078l {

        /* renamed from: a */
        private C1080b f3767a = null;

        /* renamed from: b */
        private ArrayList<C1079a> f3768b = new ArrayList<>();

        /* renamed from: c */
        private long f3769c = 120;

        /* renamed from: d */
        private long f3770d = 120;

        /* renamed from: e */
        private long f3771e = 250;

        /* renamed from: f */
        private long f3772f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C1079a {
            /* renamed from: a */
            void mo4318a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C1080b {
            /* renamed from: a */
            void mo4319a(C1070d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C1081c {

            /* renamed from: a */
            public int f3773a;

            /* renamed from: b */
            public int f3774b;

            /* renamed from: c */
            public int f3775c;

            /* renamed from: d */
            public int f3776d;

            /* renamed from: a */
            public C1081c mo4320a(C1070d0 d0Var) {
                return mo4321b(d0Var, 0);
            }

            /* renamed from: b */
            public C1081c mo4321b(C1070d0 d0Var, int i) {
                View view = d0Var.f3745a;
                this.f3773a = view.getLeft();
                this.f3774b = view.getTop();
                this.f3775c = view.getRight();
                this.f3776d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5038e(C1070d0 d0Var) {
            int i = d0Var.f3754j & 14;
            if (d0Var.mo4244t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.mo4238n();
            int j = d0Var.mo4234j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo4297a(C1070d0 d0Var, C1081c cVar, C1081c cVar2);

        /* renamed from: b */
        public abstract boolean mo4298b(C1070d0 d0Var, C1070d0 d0Var2, C1081c cVar, C1081c cVar2);

        /* renamed from: c */
        public abstract boolean mo4299c(C1070d0 d0Var, C1081c cVar, C1081c cVar2);

        /* renamed from: d */
        public abstract boolean mo4300d(C1070d0 d0Var, C1081c cVar, C1081c cVar2);

        /* renamed from: f */
        public abstract boolean mo4301f(C1070d0 d0Var);

        /* renamed from: g */
        public boolean mo4302g(C1070d0 d0Var, List<Object> list) {
            return mo4301f(d0Var);
        }

        /* renamed from: h */
        public final void mo4303h(C1070d0 d0Var) {
            mo4313r(d0Var);
            C1080b bVar = this.f3767a;
            if (bVar != null) {
                bVar.mo4319a(d0Var);
            }
        }

        /* renamed from: i */
        public final void mo4304i() {
            int size = this.f3768b.size();
            for (int i = 0; i < size; i++) {
                this.f3768b.get(i).mo4318a();
            }
            this.f3768b.clear();
        }

        /* renamed from: j */
        public abstract void mo4305j(C1070d0 d0Var);

        /* renamed from: k */
        public abstract void mo4306k();

        /* renamed from: l */
        public long mo4307l() {
            return this.f3769c;
        }

        /* renamed from: m */
        public long mo4308m() {
            return this.f3772f;
        }

        /* renamed from: n */
        public long mo4309n() {
            return this.f3771e;
        }

        /* renamed from: o */
        public long mo4310o() {
            return this.f3770d;
        }

        /* renamed from: p */
        public abstract boolean mo4311p();

        /* renamed from: q */
        public C1081c mo4312q() {
            return new C1081c();
        }

        /* renamed from: r */
        public void mo4313r(C1070d0 d0Var) {
        }

        /* renamed from: s */
        public C1081c mo4314s(C1064a0 a0Var, C1070d0 d0Var) {
            return mo4312q().mo4320a(d0Var);
        }

        /* renamed from: t */
        public C1081c mo4315t(C1064a0 a0Var, C1070d0 d0Var, int i, List<Object> list) {
            return mo4312q().mo4320a(d0Var);
        }

        /* renamed from: u */
        public abstract void mo4316u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4317v(C1080b bVar) {
            this.f3767a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C1082m implements C1078l.C1080b {
        C1082m() {
        }

        /* renamed from: a */
        public void mo4319a(C1070d0 d0Var) {
            d0Var.mo4220G(true);
            if (d0Var.f3752h != null && d0Var.f3753i == null) {
                d0Var.f3752h = null;
            }
            d0Var.f3753i = null;
            if (!d0Var.mo4222I() && !RecyclerView.this.mo4054U0(d0Var.f3745a) && d0Var.mo4249x()) {
                RecyclerView.this.removeDetachedView(d0Var.f3745a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C1083n {
        @Deprecated
        /* renamed from: d */
        public void mo4322d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo4323e(Rect rect, View view, RecyclerView recyclerView, C1064a0 a0Var) {
            mo4322d(rect, ((C1089p) view.getLayoutParams()).mo4429a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo4324f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo4325g(Canvas canvas, RecyclerView recyclerView, C1064a0 a0Var) {
            mo4324f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo4326h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo4327i(Canvas canvas, RecyclerView recyclerView, C1064a0 a0Var) {
            mo4326h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1084o {

        /* renamed from: a */
        C1116b f3778a;

        /* renamed from: b */
        RecyclerView f3779b;

        /* renamed from: c */
        private final C1154o.C1156b f3780c;

        /* renamed from: d */
        private final C1154o.C1156b f3781d;

        /* renamed from: e */
        C1154o f3782e;

        /* renamed from: f */
        C1154o f3783f;

        /* renamed from: g */
        C1101z f3784g;

        /* renamed from: h */
        boolean f3785h = false;

        /* renamed from: i */
        boolean f3786i = false;

        /* renamed from: j */
        boolean f3787j = false;

        /* renamed from: k */
        private boolean f3788k = true;

        /* renamed from: l */
        private boolean f3789l = true;

        /* renamed from: m */
        int f3790m;

        /* renamed from: n */
        boolean f3791n;

        /* renamed from: o */
        private int f3792o;

        /* renamed from: p */
        private int f3793p;

        /* renamed from: q */
        private int f3794q;

        /* renamed from: r */
        private int f3795r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C1085a implements C1154o.C1156b {
            C1085a() {
            }

            /* renamed from: a */
            public View mo4423a(int i) {
                return C1084o.this.mo4348J(i);
            }

            /* renamed from: b */
            public int mo4424b() {
                return C1084o.this.mo4408r0() - C1084o.this.mo4387h0();
            }

            /* renamed from: c */
            public int mo4425c() {
                return C1084o.this.mo4386g0();
            }

            /* renamed from: d */
            public int mo4426d(View view) {
                return C1084o.this.mo4366U(view) + ((C1089p) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: e */
            public int mo4427e(View view) {
                return C1084o.this.mo4361R(view) - ((C1089p) view.getLayoutParams()).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C1086b implements C1154o.C1156b {
            C1086b() {
            }

            /* renamed from: a */
            public View mo4423a(int i) {
                return C1084o.this.mo4348J(i);
            }

            /* renamed from: b */
            public int mo4424b() {
                return C1084o.this.mo4369X() - C1084o.this.mo4382e0();
            }

            /* renamed from: c */
            public int mo4425c() {
                return C1084o.this.mo4393j0();
            }

            /* renamed from: d */
            public int mo4426d(View view) {
                return C1084o.this.mo4357P(view) + ((C1089p) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: e */
            public int mo4427e(View view) {
                return C1084o.this.mo4367V(view) - ((C1089p) view.getLayoutParams()).topMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C1087c {
            /* renamed from: a */
            void mo4428a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C1088d {

            /* renamed from: a */
            public int f3798a;

            /* renamed from: b */
            public int f3799b;

            /* renamed from: c */
            public boolean f3800c;

            /* renamed from: d */
            public boolean f3801d;
        }

        public C1084o() {
            C1085a aVar = new C1085a();
            this.f3780c = aVar;
            C1086b bVar = new C1086b();
            this.f3781d = bVar;
            this.f3782e = new C1154o(aVar);
            this.f3783f = new C1154o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m5071L(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1084o.m5071L(int, int, int, int, boolean):int");
        }

        /* renamed from: M */
        private int[] m5072M(View view, Rect rect) {
            int[] iArr = new int[2];
            int g0 = mo4386g0();
            int j0 = mo4393j0();
            int r0 = mo4408r0() - mo4387h0();
            int X = mo4369X() - mo4382e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - g0;
            int min = Math.min(0, i);
            int i2 = top - j0;
            int min2 = Math.min(0, i2);
            int i3 = width - r0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - X);
            if (mo4373a0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: g */
        private void m5073g(View view, int i, boolean z) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (z || f0.mo4247v()) {
                this.f3779b.f3681i.mo4752b(f0);
            } else {
                this.f3779b.f3681i.mo4765p(f0);
            }
            C1089p pVar = (C1089p) view.getLayoutParams();
            if (f0.mo4225L() || f0.mo4248w()) {
                if (f0.mo4248w()) {
                    f0.mo4224K();
                } else {
                    f0.mo4230e();
                }
                this.f3778a.mo4613c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3779b) {
                int m = this.f3778a.mo4621m(view);
                if (i == -1) {
                    i = this.f3778a.mo4617g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3779b.indexOfChild(view) + this.f3779b.mo4048P());
                } else if (m != i) {
                    this.f3779b.f3695p.mo4337E0(m, i);
                }
            } else {
                this.f3778a.mo4611a(view, i, false);
                pVar.f3804c = true;
                C1101z zVar = this.f3784g;
                if (zVar != null && zVar.mo4502h()) {
                    this.f3784g.mo4505k(view);
                }
            }
            if (pVar.f3805d) {
                f0.f3745a.invalidate();
                pVar.f3805d = false;
            }
        }

        /* renamed from: l0 */
        public static C1088d m5074l0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1088d dVar = new C1088d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2089c.f7306f, i, i2);
            dVar.f3798a = obtainStyledAttributes.getInt(C2089c.f7307g, 1);
            dVar.f3799b = obtainStyledAttributes.getInt(C2089c.f7317q, 1);
            dVar.f3800c = obtainStyledAttributes.getBoolean(C2089c.f7316p, false);
            dVar.f3801d = obtainStyledAttributes.getBoolean(C2089c.f7318r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: o */
        public static int m5075o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: w0 */
        private boolean m5076w0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int g0 = mo4386g0();
            int j0 = mo4393j0();
            int r0 = mo4408r0() - mo4387h0();
            int X = mo4369X() - mo4382e0();
            Rect rect = this.f3779b.f3687l;
            mo4359Q(focusedChild, rect);
            return rect.left - i < r0 && rect.right - i > g0 && rect.top - i2 < X && rect.bottom - i2 > j0;
        }

        /* renamed from: y1 */
        private void m5077y1(C1096v vVar, int i, View view) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (!f0.mo4223J()) {
                if (!f0.mo4244t() || f0.mo4247v() || this.f3779b.f3693o.mo4278g()) {
                    mo4421y(i);
                    vVar.mo4455D(view);
                    this.f3779b.f3681i.mo4761k(f0);
                    return;
                }
                mo4413t1(i);
                vVar.mo4454C(f0);
            }
        }

        /* renamed from: z */
        private void m5078z(int i, View view) {
            this.f3778a.mo4614d(i);
        }

        /* renamed from: z0 */
        private static boolean m5079z0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4328A(RecyclerView recyclerView) {
            this.f3786i = true;
            mo4349J0(recyclerView);
        }

        /* renamed from: A0 */
        public boolean mo4329A0() {
            C1101z zVar = this.f3784g;
            return zVar != null && zVar.mo4502h();
        }

        /* renamed from: A1 */
        public void mo3970A1(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4330B(RecyclerView recyclerView, C1096v vVar) {
            this.f3786i = false;
            mo3977L0(recyclerView, vVar);
        }

        /* renamed from: B0 */
        public boolean mo4331B0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3782e.mo4745b(view, 24579) && this.f3783f.mo4745b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: B1 */
        public int mo3930B1(int i, C1096v vVar, C1064a0 a0Var) {
            return 0;
        }

        /* renamed from: C */
        public View mo4332C(View view) {
            View R;
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView == null || (R = recyclerView.mo4051R(view)) == null || this.f3778a.mo4622n(R)) {
                return null;
            }
            return R;
        }

        /* renamed from: C0 */
        public void mo4333C0(View view, int i, int i2, int i3, int i4) {
            C1089p pVar = (C1089p) view.getLayoutParams();
            Rect rect = pVar.f3803b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C1 */
        public void mo4334C1(RecyclerView recyclerView) {
            mo4336D1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: D */
        public View mo3972D(int i) {
            int K = mo4350K();
            for (int i2 = 0; i2 < K; i2++) {
                View J = mo4348J(i2);
                C1070d0 f0 = RecyclerView.m4835f0(J);
                if (f0 != null && f0.mo4237m() == i && !f0.mo4223J() && (this.f3779b.f3686k0.mo4199e() || !f0.mo4247v())) {
                    return J;
                }
            }
            return null;
        }

        /* renamed from: D0 */
        public void mo4335D0(View view, int i, int i2) {
            C1089p pVar = (C1089p) view.getLayoutParams();
            Rect j0 = this.f3779b.mo4117j0(view);
            int i3 = i + j0.left + j0.right;
            int i4 = i2 + j0.top + j0.bottom;
            int L = m5071L(mo4408r0(), mo4410s0(), mo4386g0() + mo4387h0() + pVar.leftMargin + pVar.rightMargin + i3, pVar.width, mo3995l());
            int L2 = m5071L(mo4369X(), mo4370Y(), mo4393j0() + mo4382e0() + pVar.topMargin + pVar.bottomMargin + i4, pVar.height, mo3996m());
            if (mo4347I1(view, L, L2, pVar)) {
                view.measure(L, L2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D1 */
        public void mo4336D1(int i, int i2) {
            this.f3794q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3792o = mode;
            if (mode == 0 && !RecyclerView.f3637D0) {
                this.f3794q = 0;
            }
            this.f3795r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3793p = mode2;
            if (mode2 == 0 && !RecyclerView.f3637D0) {
                this.f3795r = 0;
            }
        }

        /* renamed from: E */
        public abstract C1089p mo3931E();

        /* renamed from: E0 */
        public void mo4337E0(int i, int i2) {
            View J = mo4348J(i);
            if (J != null) {
                mo4421y(i);
                mo4389i(J, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3779b.toString());
        }

        /* renamed from: E1 */
        public void mo4338E1(int i, int i2) {
            this.f3779b.setMeasuredDimension(i, i2);
        }

        /* renamed from: F */
        public C1089p mo3932F(Context context, AttributeSet attributeSet) {
            return new C1089p(context, attributeSet);
        }

        /* renamed from: F0 */
        public void mo4339F0(int i) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                recyclerView.mo4191y0(i);
            }
        }

        /* renamed from: F1 */
        public void mo3933F1(Rect rect, int i, int i2) {
            mo4338E1(m5075o(i, rect.width() + mo4386g0() + mo4387h0(), mo4379d0()), m5075o(i2, rect.height() + mo4393j0() + mo4382e0(), mo4376c0()));
        }

        /* renamed from: G */
        public C1089p mo3934G(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1089p ? new C1089p((C1089p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1089p((ViewGroup.MarginLayoutParams) layoutParams) : new C1089p(layoutParams);
        }

        /* renamed from: G0 */
        public void mo4340G0(int i) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                recyclerView.mo4193z0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public void mo4341G1(int i, int i2) {
            int K = mo4350K();
            if (K == 0) {
                this.f3779b.mo4187w(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < K; i7++) {
                View J = mo4348J(i7);
                Rect rect = this.f3779b.f3687l;
                mo4359Q(J, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3779b.f3687l.set(i5, i6, i3, i4);
            mo3933F1(this.f3779b.f3687l, i, i2);
        }

        /* renamed from: H */
        public int mo4342H() {
            return -1;
        }

        /* renamed from: H0 */
        public void mo4343H0(C1073g gVar, C1073g gVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public void mo4344H1(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f3779b = null;
                this.f3778a = null;
                i = 0;
                this.f3794q = 0;
            } else {
                this.f3779b = recyclerView;
                this.f3778a = recyclerView.f3679h;
                this.f3794q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f3795r = i;
            this.f3792o = 1073741824;
            this.f3793p = 1073741824;
        }

        /* renamed from: I */
        public int mo4345I(View view) {
            return ((C1089p) view.getLayoutParams()).f3803b.bottom;
        }

        /* renamed from: I0 */
        public boolean mo4346I0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I1 */
        public boolean mo4347I1(View view, int i, int i2, C1089p pVar) {
            return view.isLayoutRequested() || !this.f3788k || !m5079z0(view.getWidth(), i, pVar.width) || !m5079z0(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: J */
        public View mo4348J(int i) {
            C1116b bVar = this.f3778a;
            if (bVar != null) {
                return bVar.mo4616f(i);
            }
            return null;
        }

        /* renamed from: J0 */
        public void mo4349J0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J1 */
        public boolean mo3976J1() {
            return false;
        }

        /* renamed from: K */
        public int mo4350K() {
            C1116b bVar = this.f3778a;
            if (bVar != null) {
                return bVar.mo4617g();
            }
            return 0;
        }

        @Deprecated
        /* renamed from: K0 */
        public void mo4351K0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K1 */
        public boolean mo4352K1(View view, int i, int i2, C1089p pVar) {
            return !this.f3788k || !m5079z0(view.getMeasuredWidth(), i, pVar.width) || !m5079z0(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: L0 */
        public void mo3977L0(RecyclerView recyclerView, C1096v vVar) {
            mo4351K0(recyclerView);
        }

        /* renamed from: L1 */
        public void mo3978L1(RecyclerView recyclerView, C1064a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: M0 */
        public View mo3936M0(View view, int i, C1096v vVar, C1064a0 a0Var) {
            return null;
        }

        /* renamed from: M1 */
        public void mo4353M1(C1101z zVar) {
            C1101z zVar2 = this.f3784g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo4502h())) {
                this.f3784g.mo4512r();
            }
            this.f3784g = zVar;
            zVar.mo4511q(this.f3779b, this);
        }

        /* renamed from: N */
        public boolean mo4354N() {
            RecyclerView recyclerView = this.f3779b;
            return recyclerView != null && recyclerView.f3683j;
        }

        /* renamed from: N0 */
        public void mo3979N0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3779b;
            mo4356O0(recyclerView.f3673e, recyclerView.f3686k0, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N1 */
        public void mo4355N1() {
            C1101z zVar = this.f3784g;
            if (zVar != null) {
                zVar.mo4512r();
            }
        }

        /* renamed from: O */
        public int mo3937O(C1096v vVar, C1064a0 a0Var) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView == null || recyclerView.f3693o == null || !mo3995l()) {
                return 1;
            }
            return this.f3779b.f3693o.mo4274c();
        }

        /* renamed from: O0 */
        public void mo4356O0(C1096v vVar, C1064a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3779b.canScrollVertically(-1) && !this.f3779b.canScrollHorizontally(-1) && !this.f3779b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1073g gVar = this.f3779b.f3693o;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo4274c());
                }
            }
        }

        /* renamed from: O1 */
        public boolean mo3938O1() {
            return false;
        }

        /* renamed from: P */
        public int mo4357P(View view) {
            return view.getBottom() + mo4345I(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P0 */
        public void mo4358P0(C0624d dVar) {
            RecyclerView recyclerView = this.f3779b;
            mo4360Q0(recyclerView.f3673e, recyclerView.f3686k0, dVar);
        }

        /* renamed from: Q */
        public void mo4359Q(View view, Rect rect) {
            RecyclerView.m4837g0(view, rect);
        }

        /* renamed from: Q0 */
        public void mo4360Q0(C1096v vVar, C1064a0 a0Var, C0624d dVar) {
            if (this.f3779b.canScrollVertically(-1) || this.f3779b.canScrollHorizontally(-1)) {
                dVar.mo2711a(8192);
                dVar.mo2738p0(true);
            }
            if (this.f3779b.canScrollVertically(1) || this.f3779b.canScrollHorizontally(1)) {
                dVar.mo2711a(4096);
                dVar.mo2738p0(true);
            }
            dVar.mo2710Z(C0624d.C0626b.m2776a(mo3953n0(vVar, a0Var), mo3937O(vVar, a0Var), mo4422y0(vVar, a0Var), mo4402o0(vVar, a0Var)));
        }

        /* renamed from: R */
        public int mo4361R(View view) {
            return view.getLeft() - mo4374b0(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R0 */
        public void mo4362R0(View view, C0624d dVar) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (f0 != null && !f0.mo4247v() && !this.f3778a.mo4622n(f0.f3745a)) {
                RecyclerView recyclerView = this.f3779b;
                mo3940S0(recyclerView.f3673e, recyclerView.f3686k0, view, dVar);
            }
        }

        /* renamed from: S */
        public int mo4363S(View view) {
            Rect rect = ((C1089p) view.getLayoutParams()).f3803b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: S0 */
        public void mo3940S0(C1096v vVar, C1064a0 a0Var, View view, C0624d dVar) {
            dVar.mo2712a0(C0624d.C0627c.m2777a(mo3996m() ? mo4396k0(view) : 0, 1, mo3995l() ? mo4396k0(view) : 0, 1, false, false));
        }

        /* renamed from: T */
        public int mo4364T(View view) {
            Rect rect = ((C1089p) view.getLayoutParams()).f3803b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: T0 */
        public View mo4365T0(View view, int i) {
            return null;
        }

        /* renamed from: U */
        public int mo4366U(View view) {
            return view.getRight() + mo4399m0(view);
        }

        /* renamed from: U0 */
        public void mo3941U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public int mo4367V(View view) {
            return view.getTop() - mo4404p0(view);
        }

        /* renamed from: V0 */
        public void mo3942V0(RecyclerView recyclerView) {
        }

        /* renamed from: W */
        public View mo4368W() {
            View focusedChild;
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3778a.mo4622n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: W0 */
        public void mo3943W0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: X */
        public int mo4369X() {
            return this.f3795r;
        }

        /* renamed from: X0 */
        public void mo3944X0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: Y */
        public int mo4370Y() {
            return this.f3793p;
        }

        /* renamed from: Y0 */
        public void mo4371Y0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: Z */
        public int mo4372Z() {
            RecyclerView recyclerView = this.f3779b;
            C1073g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo4274c();
            }
            return 0;
        }

        /* renamed from: Z0 */
        public void mo3945Z0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4371Y0(recyclerView, i, i2);
        }

        /* renamed from: a0 */
        public int mo4373a0() {
            return C0735z.m3160E(this.f3779b);
        }

        /* renamed from: a1 */
        public void mo3947a1(C1096v vVar, C1064a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: b0 */
        public int mo4374b0(View view) {
            return ((C1089p) view.getLayoutParams()).f3803b.left;
        }

        /* renamed from: b1 */
        public void mo3949b1(C1064a0 a0Var) {
        }

        /* renamed from: c */
        public void mo4375c(View view) {
            mo4378d(view, -1);
        }

        /* renamed from: c0 */
        public int mo4376c0() {
            return C0735z.m3162F(this.f3779b);
        }

        /* renamed from: c1 */
        public void mo4377c1(C1096v vVar, C1064a0 a0Var, int i, int i2) {
            this.f3779b.mo4187w(i, i2);
        }

        /* renamed from: d */
        public void mo4378d(View view, int i) {
            m5073g(view, i, true);
        }

        /* renamed from: d0 */
        public int mo4379d0() {
            return C0735z.m3164G(this.f3779b);
        }

        @Deprecated
        /* renamed from: d1 */
        public boolean mo4380d1(RecyclerView recyclerView, View view, View view2) {
            return mo4329A0() || recyclerView.mo4182t0();
        }

        /* renamed from: e */
        public void mo4381e(View view) {
            mo4384f(view, -1);
        }

        /* renamed from: e0 */
        public int mo4382e0() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: e1 */
        public boolean mo4383e1(RecyclerView recyclerView, C1064a0 a0Var, View view, View view2) {
            return mo4380d1(recyclerView, view, view2);
        }

        /* renamed from: f */
        public void mo4384f(View view, int i) {
            m5073g(view, i, false);
        }

        /* renamed from: f0 */
        public int mo4385f0() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return C0735z.m3168I(recyclerView);
            }
            return 0;
        }

        /* renamed from: f1 */
        public void mo3989f1(Parcelable parcelable) {
        }

        /* renamed from: g0 */
        public int mo4386g0() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: g1 */
        public Parcelable mo3991g1() {
            return null;
        }

        /* renamed from: h */
        public void mo3993h(String str) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                recyclerView.mo4128o(str);
            }
        }

        /* renamed from: h0 */
        public int mo4387h0() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: h1 */
        public void mo4388h1(int i) {
        }

        /* renamed from: i */
        public void mo4389i(View view, int i) {
            mo4392j(view, i, (C1089p) view.getLayoutParams());
        }

        /* renamed from: i0 */
        public int mo4390i0() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return C0735z.m3170J(recyclerView);
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i1 */
        public void mo4391i1(C1101z zVar) {
            if (this.f3784g == zVar) {
                this.f3784g = null;
            }
        }

        /* renamed from: j */
        public void mo4392j(View view, int i, C1089p pVar) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (f0.mo4247v()) {
                this.f3779b.f3681i.mo4752b(f0);
            } else {
                this.f3779b.f3681i.mo4765p(f0);
            }
            this.f3778a.mo4613c(view, i, pVar, f0.mo4247v());
        }

        /* renamed from: j0 */
        public int mo4393j0() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j1 */
        public boolean mo4394j1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3779b;
            return mo4397k1(recyclerView.f3673e, recyclerView.f3686k0, i, bundle);
        }

        /* renamed from: k */
        public void mo4395k(View view, Rect rect) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4117j0(view));
            }
        }

        /* renamed from: k0 */
        public int mo4396k0(View view) {
            return ((C1089p) view.getLayoutParams()).mo4429a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: k1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4397k1(androidx.recyclerview.widget.RecyclerView.C1096v r8, androidx.recyclerview.widget.RecyclerView.C1064a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3779b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo4369X()
                int r11 = r7.mo4393j0()
                int r8 = r8 - r11
                int r11 = r7.mo4382e0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3779b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4408r0()
                int r11 = r7.mo4386g0()
                int r10 = r10 - r11
                int r11 = r7.mo4387h0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo4369X()
                int r10 = r7.mo4393j0()
                int r8 = r8 - r10
                int r10 = r7.mo4382e0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3779b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4408r0()
                int r11 = r7.mo4386g0()
                int r10 = r10 - r11
                int r11 = r7.mo4387h0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3779b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo4127n1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1084o.mo4397k1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: l */
        public boolean mo3995l() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1 */
        public boolean mo4398l1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3779b;
            return mo4400m1(recyclerView.f3673e, recyclerView.f3686k0, view, i, bundle);
        }

        /* renamed from: m */
        public boolean mo3996m() {
            return false;
        }

        /* renamed from: m0 */
        public int mo4399m0(View view) {
            return ((C1089p) view.getLayoutParams()).f3803b.right;
        }

        /* renamed from: m1 */
        public boolean mo4400m1(C1096v vVar, C1064a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: n */
        public boolean mo3952n(C1089p pVar) {
            return pVar != null;
        }

        /* renamed from: n0 */
        public int mo3953n0(C1096v vVar, C1064a0 a0Var) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView == null || recyclerView.f3693o == null || !mo3996m()) {
                return 1;
            }
            return this.f3779b.f3693o.mo4274c();
        }

        /* renamed from: n1 */
        public void mo4401n1(C1096v vVar) {
            for (int K = mo4350K() - 1; K >= 0; K--) {
                if (!RecyclerView.m4835f0(mo4348J(K)).mo4223J()) {
                    mo4407q1(K, vVar);
                }
            }
        }

        /* renamed from: o0 */
        public int mo4402o0(C1096v vVar, C1064a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o1 */
        public void mo4403o1(C1096v vVar) {
            int j = vVar.mo4472j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo4476n(i);
                C1070d0 f0 = RecyclerView.m4835f0(n);
                if (!f0.mo4223J()) {
                    f0.mo4220G(false);
                    if (f0.mo4249x()) {
                        this.f3779b.removeDetachedView(n, false);
                    }
                    C1078l lVar = this.f3779b.f3660P;
                    if (lVar != null) {
                        lVar.mo4305j(f0);
                    }
                    f0.mo4220G(true);
                    vVar.mo4485y(n);
                }
            }
            vVar.mo4467e();
            if (j > 0) {
                this.f3779b.invalidate();
            }
        }

        /* renamed from: p */
        public void mo3997p(int i, int i2, C1064a0 a0Var, C1087c cVar) {
        }

        /* renamed from: p0 */
        public int mo4404p0(View view) {
            return ((C1089p) view.getLayoutParams()).f3803b.top;
        }

        /* renamed from: p1 */
        public void mo4405p1(View view, C1096v vVar) {
            mo4411s1(view);
            vVar.mo4453B(view);
        }

        /* renamed from: q */
        public void mo3998q(int i, C1087c cVar) {
        }

        /* renamed from: q0 */
        public void mo4406q0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1089p) view.getLayoutParams()).f3803b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3779b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3779b.f3691n;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: q1 */
        public void mo4407q1(int i, C1096v vVar) {
            View J = mo4348J(i);
            mo4413t1(i);
            vVar.mo4453B(J);
        }

        /* renamed from: r */
        public int mo3999r(C1064a0 a0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public int mo4408r0() {
            return this.f3794q;
        }

        /* renamed from: r1 */
        public boolean mo4409r1(Runnable runnable) {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: s */
        public int mo3954s(C1064a0 a0Var) {
            return 0;
        }

        /* renamed from: s0 */
        public int mo4410s0() {
            return this.f3792o;
        }

        /* renamed from: s1 */
        public void mo4411s1(View view) {
            this.f3778a.mo4624p(view);
        }

        /* renamed from: t */
        public int mo3955t(C1064a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t0 */
        public boolean mo4412t0() {
            int K = mo4350K();
            for (int i = 0; i < K; i++) {
                ViewGroup.LayoutParams layoutParams = mo4348J(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: t1 */
        public void mo4413t1(int i) {
            if (mo4348J(i) != null) {
                this.f3778a.mo4625q(i);
            }
        }

        /* renamed from: u */
        public int mo4003u(C1064a0 a0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public boolean mo4414u0() {
            return this.f3786i;
        }

        /* renamed from: u1 */
        public boolean mo4415u1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4416v1(recyclerView, view, rect, z, false);
        }

        /* renamed from: v */
        public int mo3956v(C1064a0 a0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo4005v0() {
            return this.f3787j;
        }

        /* renamed from: v1 */
        public boolean mo4416v1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] M = m5072M(view, rect);
            int i = M[0];
            int i2 = M[1];
            if ((z2 && !m5076w0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4120k1(i, i2);
            }
            return true;
        }

        /* renamed from: w */
        public int mo3958w(C1064a0 a0Var) {
            return 0;
        }

        /* renamed from: w1 */
        public void mo4417w1() {
            RecyclerView recyclerView = this.f3779b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: x */
        public void mo4418x(C1096v vVar) {
            for (int K = mo4350K() - 1; K >= 0; K--) {
                m5077y1(vVar, K, mo4348J(K));
            }
        }

        /* renamed from: x0 */
        public final boolean mo4419x0() {
            return this.f3789l;
        }

        /* renamed from: x1 */
        public void mo4420x1() {
            this.f3785h = true;
        }

        /* renamed from: y */
        public void mo4421y(int i) {
            m5078z(i, mo4348J(i));
        }

        /* renamed from: y0 */
        public boolean mo4422y0(C1096v vVar, C1064a0 a0Var) {
            return false;
        }

        /* renamed from: z1 */
        public int mo3960z1(int i, C1096v vVar, C1064a0 a0Var) {
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C1089p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C1070d0 f3802a;

        /* renamed from: b */
        final Rect f3803b = new Rect();

        /* renamed from: c */
        boolean f3804c = true;

        /* renamed from: d */
        boolean f3805d = false;

        public C1089p(int i, int i2) {
            super(i, i2);
        }

        public C1089p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1089p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1089p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1089p(C1089p pVar) {
            super(pVar);
        }

        /* renamed from: a */
        public int mo4429a() {
            return this.f3802a.mo4237m();
        }

        /* renamed from: b */
        public boolean mo4430b() {
            return this.f3802a.mo4250y();
        }

        /* renamed from: c */
        public boolean mo4431c() {
            return this.f3802a.mo4247v();
        }

        /* renamed from: d */
        public boolean mo4432d() {
            return this.f3802a.mo4244t();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C1090q {
        /* renamed from: a */
        void mo4433a(View view);

        /* renamed from: b */
        void mo4434b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C1091r {
        /* renamed from: a */
        public abstract boolean mo4435a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C1092s {
        /* renamed from: a */
        boolean mo4436a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4437b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo4438c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C1093t {
        /* renamed from: a */
        public void mo4439a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo4440b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C1094u {

        /* renamed from: a */
        SparseArray<C1095a> f3806a = new SparseArray<>();

        /* renamed from: b */
        private int f3807b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C1095a {

            /* renamed from: a */
            final ArrayList<C1070d0> f3808a = new ArrayList<>();

            /* renamed from: b */
            int f3809b = 5;

            /* renamed from: c */
            long f3810c = 0;

            /* renamed from: d */
            long f3811d = 0;

            C1095a() {
            }
        }

        /* renamed from: g */
        private C1095a m5237g(int i) {
            C1095a aVar = this.f3806a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1095a aVar2 = new C1095a();
            this.f3806a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4441a() {
            this.f3807b++;
        }

        /* renamed from: b */
        public void mo4442b() {
            for (int i = 0; i < this.f3806a.size(); i++) {
                this.f3806a.valueAt(i).f3808a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4443c() {
            this.f3807b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4444d(int i, long j) {
            C1095a g = m5237g(i);
            g.f3811d = mo4449j(g.f3811d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4445e(int i, long j) {
            C1095a g = m5237g(i);
            g.f3810c = mo4449j(g.f3810c, j);
        }

        /* renamed from: f */
        public C1070d0 mo4446f(int i) {
            C1095a aVar = this.f3806a.get(i);
            if (aVar == null || aVar.f3808a.isEmpty()) {
                return null;
            }
            ArrayList<C1070d0> arrayList = aVar.f3808a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo4242r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4447h(C1073g gVar, C1073g gVar2, boolean z) {
            if (gVar != null) {
                mo4443c();
            }
            if (!z && this.f3807b == 0) {
                mo4442b();
            }
            if (gVar2 != null) {
                mo4441a();
            }
        }

        /* renamed from: i */
        public void mo4448i(C1070d0 d0Var) {
            int l = d0Var.mo4236l();
            ArrayList<C1070d0> arrayList = m5237g(l).f3808a;
            if (this.f3806a.get(l).f3809b > arrayList.size()) {
                d0Var.mo4217D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo4449j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4450k(int i, long j, long j2) {
            long j3 = m5237g(i).f3811d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4451l(int i, long j, long j2) {
            long j3 = m5237g(i).f3810c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C1096v {

        /* renamed from: a */
        final ArrayList<C1070d0> f3812a;

        /* renamed from: b */
        ArrayList<C1070d0> f3813b = null;

        /* renamed from: c */
        final ArrayList<C1070d0> f3814c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1070d0> f3815d;

        /* renamed from: e */
        private int f3816e;

        /* renamed from: f */
        int f3817f;

        /* renamed from: g */
        C1094u f3818g;

        public C1096v() {
            ArrayList<C1070d0> arrayList = new ArrayList<>();
            this.f3812a = arrayList;
            this.f3815d = Collections.unmodifiableList(arrayList);
            this.f3816e = 2;
            this.f3817f = 2;
        }

        /* renamed from: H */
        private boolean m5249H(C1070d0 d0Var, int i, int i2, long j) {
            d0Var.f3762r = RecyclerView.this;
            int l = d0Var.mo4236l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3818g.mo4450k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3693o.mo4272a(d0Var, i);
            this.f3818g.mo4444d(d0Var.mo4236l(), RecyclerView.this.getNanoTime() - nanoTime);
            m5250b(d0Var);
            if (!RecyclerView.this.f3686k0.mo4199e()) {
                return true;
            }
            d0Var.f3751g = i2;
            return true;
        }

        /* renamed from: b */
        private void m5250b(C1070d0 d0Var) {
            if (RecyclerView.this.mo4154s0()) {
                View view = d0Var.f3745a;
                if (C0735z.m3156C(view) == 0) {
                    C0735z.m3155B0(view, 1);
                }
                C1148k kVar = RecyclerView.this.f3700r0;
                if (kVar != null) {
                    C0613a n = kVar.mo4721n();
                    if (n instanceof C1148k.C1149a) {
                        ((C1148k.C1149a) n).mo4724o(view);
                    }
                    C0735z.m3228r0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m5251q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5251q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m5252r(C1070d0 d0Var) {
            View view = d0Var.f3745a;
            if (view instanceof ViewGroup) {
                m5251q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4452A(int i) {
            mo4464a(this.f3814c.get(i), true);
            this.f3814c.remove(i);
        }

        /* renamed from: B */
        public void mo4453B(View view) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (f0.mo4249x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0.mo4248w()) {
                f0.mo4224K();
            } else if (f0.mo4225L()) {
                f0.mo4230e();
            }
            mo4454C(f0);
            if (RecyclerView.this.f3660P != null && !f0.mo4246u()) {
                RecyclerView.this.f3660P.mo4305j(f0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4454C(C1070d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo4248w() || d0Var.f3745a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo4248w());
                sb.append(" isAttached:");
                if (d0Var.f3745a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo4048P());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo4249x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.mo4048P());
            } else if (!d0Var.mo4223J()) {
                boolean h = d0Var.mo4232h();
                C1073g gVar = RecyclerView.this.f3693o;
                if ((gVar != null && h && gVar.mo4285n(d0Var)) || d0Var.mo4246u()) {
                    if (this.f3817f <= 0 || d0Var.mo4240p(526)) {
                        z = false;
                    } else {
                        int size = this.f3814c.size();
                        if (size >= this.f3817f && size > 0) {
                            mo4452A(0);
                            size--;
                        }
                        if (RecyclerView.f3639F0 && size > 0 && !RecyclerView.this.f3684j0.mo4683d(d0Var.f3747c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f3684j0.mo4683d(this.f3814c.get(i).f3747c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3814c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo4464a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.f3681i.mo4766q(d0Var);
                        if (!z2 && !z3 && h) {
                            d0Var.f3762r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f3681i.mo4766q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo4048P());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4455D(View view) {
            ArrayList<C1070d0> arrayList;
            C1070d0 f0 = RecyclerView.m4835f0(view);
            if (!f0.mo4240p(12) && f0.mo4250y() && !RecyclerView.this.mo4142p(f0)) {
                if (this.f3813b == null) {
                    this.f3813b = new ArrayList<>();
                }
                f0.mo4221H(this, true);
                arrayList = this.f3813b;
            } else if (!f0.mo4244t() || f0.mo4247v() || RecyclerView.this.f3693o.mo4278g()) {
                f0.mo4221H(this, false);
                arrayList = this.f3812a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo4048P());
            }
            arrayList.add(f0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4456E(C1094u uVar) {
            C1094u uVar2 = this.f3818g;
            if (uVar2 != null) {
                uVar2.mo4443c();
            }
            this.f3818g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3818g.mo4441a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4457F(C1066b0 b0Var) {
        }

        /* renamed from: G */
        public void mo4458G(int i) {
            this.f3816e = i;
            mo4461K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01b7  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1070d0 mo4459I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01d3
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3686k0
                int r1 = r1.mo4196b()
                if (r3 >= r1) goto L_0x01d3
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3686k0
                boolean r1 = r1.mo4199e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4470h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4475m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4462L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4227b(r5)
                boolean r5 = r1.mo4248w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f3745a
                r5.removeDetachedView(r9, r8)
                r1.mo4224K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4225L()
                if (r5 == 0) goto L_0x0057
                r1.mo4230e()
            L_0x0057:
                r6.mo4454C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f3677g
                int r5 = r5.mo4599m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3693o
                int r9 = r9.mo4274c()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3693o
                int r9 = r9.mo4276e(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f3693o
                boolean r10 = r10.mo4278g()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f3693o
                long r10 = r1.mo4275d(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo4474l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3747c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo4471i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.mo4446f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.mo4217D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3636C0
                if (r1 == 0) goto L_0x00ac
                r6.m5252r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3818g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4451l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f3693o
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo4273b(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3639F0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.f3745a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m4825V(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3746b = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3818g
                long r10 = r10 - r0
                r5.mo4445e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3686k0
                int r2 = r2.mo4196b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4048P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3686k0
                boolean r0 = r0.mo4199e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo4240p(r0)
                if (r1 == 0) goto L_0x0166
                r9.mo4219F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3686k0
                boolean r0 = r0.f3728k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.C1078l.m5038e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f3660P
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3686k0
                java.util.List r4 = r9.mo4239o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo4315t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo4050Q0(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3686k0
                boolean r0 = r0.mo4199e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.mo4243s()
                if (r0 == 0) goto L_0x0179
                r9.f3751g = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.mo4243s()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.mo4251z()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.mo4244t()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = 0
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f3677g
                int r2 = r0.mo4599m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m5249H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.f3745a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x01af:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1089p) r1
                android.view.View r2 = r9.f3745a
                r2.setLayoutParams(r1)
                goto L_0x01c8
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01c6
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x01af
            L_0x01c6:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1089p) r1
            L_0x01c8:
                r1.f3802a = r9
                if (r10 == 0) goto L_0x01cf
                if (r0 == 0) goto L_0x01cf
                goto L_0x01d0
            L_0x01cf:
                r7 = 0
            L_0x01d0:
                r1.f3805d = r7
                return r9
            L_0x01d3:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3686k0
                int r2 = r2.mo4196b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4048P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                goto L_0x020c
            L_0x020b:
                throw r0
            L_0x020c:
                goto L_0x020b
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1096v.mo4459I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo4460J(C1070d0 d0Var) {
            (d0Var.f3759o ? this.f3813b : this.f3812a).remove(d0Var);
            d0Var.f3758n = null;
            d0Var.f3759o = false;
            d0Var.mo4230e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4461K() {
            C1084o oVar = RecyclerView.this.f3695p;
            this.f3817f = this.f3816e + (oVar != null ? oVar.f3790m : 0);
            for (int size = this.f3814c.size() - 1; size >= 0 && this.f3814c.size() > this.f3817f; size--) {
                mo4452A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4462L(C1070d0 d0Var) {
            if (d0Var.mo4247v()) {
                return RecyclerView.this.f3686k0.mo4199e();
            }
            int i = d0Var.f3747c;
            if (i < 0 || i >= RecyclerView.this.f3693o.mo4274c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.mo4048P());
            } else if (RecyclerView.this.f3686k0.mo4199e() || RecyclerView.this.f3693o.mo4276e(d0Var.f3747c) == d0Var.mo4236l()) {
                return !RecyclerView.this.f3693o.mo4278g() || d0Var.mo4235k() == RecyclerView.this.f3693o.mo4275d(d0Var.f3747c);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo4463M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3814c.size() - 1; size >= 0; size--) {
                C1070d0 d0Var = this.f3814c.get(size);
                if (d0Var != null && (i3 = d0Var.f3747c) >= i && i3 < i4) {
                    d0Var.mo4227b(2);
                    mo4452A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4464a(C1070d0 d0Var, boolean z) {
            RecyclerView.m4847r(d0Var);
            View view = d0Var.f3745a;
            C1148k kVar = RecyclerView.this.f3700r0;
            if (kVar != null) {
                C0613a n = kVar.mo4721n();
                C0735z.m3228r0(view, n instanceof C1148k.C1149a ? ((C1148k.C1149a) n).mo4723n(view) : null);
            }
            if (z) {
                mo4469g(d0Var);
            }
            d0Var.f3762r = null;
            mo4471i().mo4448i(d0Var);
        }

        /* renamed from: c */
        public void mo4465c() {
            this.f3812a.clear();
            mo4486z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4466d() {
            int size = this.f3814c.size();
            for (int i = 0; i < size; i++) {
                this.f3814c.get(i).mo4228c();
            }
            int size2 = this.f3812a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3812a.get(i2).mo4228c();
            }
            ArrayList<C1070d0> arrayList = this.f3813b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3813b.get(i3).mo4228c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4467e() {
            this.f3812a.clear();
            ArrayList<C1070d0> arrayList = this.f3813b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo4468f(int i) {
            if (i >= 0 && i < RecyclerView.this.f3686k0.mo4196b()) {
                return !RecyclerView.this.f3686k0.mo4199e() ? i : RecyclerView.this.f3677g.mo4599m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f3686k0.mo4196b() + RecyclerView.this.mo4048P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4469g(C1070d0 d0Var) {
            C1097w wVar = RecyclerView.this.f3697q;
            if (wVar != null) {
                wVar.mo4487a(d0Var);
            }
            C1073g gVar = RecyclerView.this.f3693o;
            if (gVar != null) {
                gVar.mo4288q(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3686k0 != null) {
                recyclerView.f3681i.mo4766q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1070d0 mo4470h(int i) {
            int size;
            int m;
            ArrayList<C1070d0> arrayList = this.f3813b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1070d0 d0Var = this.f3813b.get(i3);
                    if (d0Var.mo4225L() || d0Var.mo4237m() != i) {
                        i3++;
                    } else {
                        d0Var.mo4227b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f3693o.mo4278g() && (m = RecyclerView.this.f3677g.mo4599m(i)) > 0 && m < RecyclerView.this.f3693o.mo4274c()) {
                    long d = RecyclerView.this.f3693o.mo4275d(m);
                    while (i2 < size) {
                        C1070d0 d0Var2 = this.f3813b.get(i2);
                        if (d0Var2.mo4225L() || d0Var2.mo4235k() != d) {
                            i2++;
                        } else {
                            d0Var2.mo4227b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1094u mo4471i() {
            if (this.f3818g == null) {
                this.f3818g = new C1094u();
            }
            return this.f3818g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo4472j() {
            return this.f3812a.size();
        }

        /* renamed from: k */
        public List<C1070d0> mo4473k() {
            return this.f3815d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1070d0 mo4474l(long j, int i, boolean z) {
            for (int size = this.f3812a.size() - 1; size >= 0; size--) {
                C1070d0 d0Var = this.f3812a.get(size);
                if (d0Var.mo4235k() == j && !d0Var.mo4225L()) {
                    if (i == d0Var.mo4236l()) {
                        d0Var.mo4227b(32);
                        if (d0Var.mo4247v() && !RecyclerView.this.f3686k0.mo4199e()) {
                            d0Var.mo4219F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3812a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3745a, false);
                        mo4485y(d0Var.f3745a);
                    }
                }
            }
            int size2 = this.f3814c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1070d0 d0Var2 = this.f3814c.get(size2);
                if (d0Var2.mo4235k() == j && !d0Var2.mo4242r()) {
                    if (i == d0Var2.mo4236l()) {
                        if (!z) {
                            this.f3814c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo4452A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1070d0 mo4475m(int i, boolean z) {
            View e;
            int size = this.f3812a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1070d0 d0Var = this.f3812a.get(i3);
                if (d0Var.mo4225L() || d0Var.mo4237m() != i || d0Var.mo4244t() || (!RecyclerView.this.f3686k0.f3725h && d0Var.mo4247v())) {
                    i3++;
                } else {
                    d0Var.mo4227b(32);
                    return d0Var;
                }
            }
            if (z || (e = RecyclerView.this.f3679h.mo4615e(i)) == null) {
                int size2 = this.f3814c.size();
                while (i2 < size2) {
                    C1070d0 d0Var2 = this.f3814c.get(i2);
                    if (d0Var2.mo4244t() || d0Var2.mo4237m() != i || d0Var2.mo4242r()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3814c.remove(i2);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            C1070d0 f0 = RecyclerView.m4835f0(e);
            RecyclerView.this.f3679h.mo4627s(e);
            int m = RecyclerView.this.f3679h.mo4621m(e);
            if (m != -1) {
                RecyclerView.this.f3679h.mo4614d(m);
                mo4455D(e);
                f0.mo4227b(8224);
                return f0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0 + RecyclerView.this.mo4048P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo4476n(int i) {
            return this.f3812a.get(i).f3745a;
        }

        /* renamed from: o */
        public View mo4477o(int i) {
            return mo4478p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo4478p(int i, boolean z) {
            return mo4459I(i, z, Long.MAX_VALUE).f3745a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4479s() {
            int size = this.f3814c.size();
            for (int i = 0; i < size; i++) {
                C1089p pVar = (C1089p) this.f3814c.get(i).f3745a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3804c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4480t() {
            int size = this.f3814c.size();
            for (int i = 0; i < size; i++) {
                C1070d0 d0Var = this.f3814c.get(i);
                if (d0Var != null) {
                    d0Var.mo4227b(6);
                    d0Var.mo4226a((Object) null);
                }
            }
            C1073g gVar = RecyclerView.this.f3693o;
            if (gVar == null || !gVar.mo4278g()) {
                mo4486z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4481u(int i, int i2) {
            int size = this.f3814c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1070d0 d0Var = this.f3814c.get(i3);
                if (d0Var != null && d0Var.f3747c >= i) {
                    d0Var.mo4214A(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4482v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f3814c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1070d0 d0Var = this.f3814c.get(i7);
                if (d0Var != null && (i6 = d0Var.f3747c) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.mo4214A(i2 - i, false);
                    } else {
                        d0Var.mo4214A(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4483w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3814c.size() - 1; size >= 0; size--) {
                C1070d0 d0Var = this.f3814c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f3747c;
                    if (i4 >= i3) {
                        d0Var.mo4214A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo4227b(8);
                        mo4452A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo4484x(C1073g gVar, C1073g gVar2, boolean z) {
            mo4465c();
            mo4471i().mo4447h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo4485y(View view) {
            C1070d0 f0 = RecyclerView.m4835f0(view);
            f0.f3758n = null;
            f0.f3759o = false;
            f0.mo4230e();
            mo4454C(f0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4486z() {
            for (int size = this.f3814c.size() - 1; size >= 0; size--) {
                mo4452A(size);
            }
            this.f3814c.clear();
            if (RecyclerView.f3639F0) {
                RecyclerView.this.f3684j0.mo4681b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C1097w {
        /* renamed from: a */
        void mo4487a(C1070d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C1098x extends C1075i {
        C1098x() {
        }

        /* renamed from: a */
        public void mo4294a() {
            RecyclerView.this.mo4128o((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3686k0.f3724g = true;
            recyclerView.mo4047O0(true);
            if (!RecyclerView.this.f3677g.mo4602p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C1099y extends C3433a {
        public static final Parcelable.Creator<C1099y> CREATOR = new C1100a();

        /* renamed from: f */
        Parcelable f3821f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C1100a implements Parcelable.ClassLoaderCreator<C1099y> {
            C1100a() {
            }

            /* renamed from: a */
            public C1099y createFromParcel(Parcel parcel) {
                return new C1099y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1099y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1099y(parcel, classLoader);
            }

            /* renamed from: c */
            public C1099y[] newArray(int i) {
                return new C1099y[i];
            }
        }

        C1099y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3821f = parcel.readParcelable(classLoader == null ? C1084o.class.getClassLoader() : classLoader);
        }

        C1099y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4488c(C1099y yVar) {
            this.f3821f = yVar.f3821f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3821f, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C1101z {

        /* renamed from: a */
        private int f3822a = -1;

        /* renamed from: b */
        private RecyclerView f3823b;

        /* renamed from: c */
        private C1084o f3824c;

        /* renamed from: d */
        private boolean f3825d;

        /* renamed from: e */
        private boolean f3826e;

        /* renamed from: f */
        private View f3827f;

        /* renamed from: g */
        private final C1102a f3828g = new C1102a(0, 0);

        /* renamed from: h */
        private boolean f3829h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C1102a {

            /* renamed from: a */
            private int f3830a;

            /* renamed from: b */
            private int f3831b;

            /* renamed from: c */
            private int f3832c;

            /* renamed from: d */
            private int f3833d;

            /* renamed from: e */
            private Interpolator f3834e;

            /* renamed from: f */
            private boolean f3835f;

            /* renamed from: g */
            private int f3836g;

            public C1102a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            public C1102a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3833d = -1;
                this.f3835f = false;
                this.f3836g = 0;
                this.f3830a = i;
                this.f3831b = i2;
                this.f3832c = i3;
                this.f3834e = interpolator;
            }

            /* renamed from: e */
            private void m5312e() {
                if (this.f3834e != null && this.f3832c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3832c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4513a() {
                return this.f3833d >= 0;
            }

            /* renamed from: b */
            public void mo4514b(int i) {
                this.f3833d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo4515c(RecyclerView recyclerView) {
                int i = this.f3833d;
                if (i >= 0) {
                    this.f3833d = -1;
                    recyclerView.mo4185v0(i);
                    this.f3835f = false;
                } else if (this.f3835f) {
                    m5312e();
                    recyclerView.f3680h0.mo4207f(this.f3830a, this.f3831b, this.f3832c, this.f3834e);
                    int i2 = this.f3836g + 1;
                    this.f3836g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3835f = false;
                } else {
                    this.f3836g = 0;
                }
            }

            /* renamed from: d */
            public void mo4516d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3830a = i;
                this.f3831b = i2;
                this.f3832c = i3;
                this.f3834e = interpolator;
                this.f3835f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C1103b {
            /* renamed from: b */
            PointF mo3986b(int i);
        }

        /* renamed from: a */
        public PointF mo4495a(int i) {
            C1084o e = mo4499e();
            if (e instanceof C1103b) {
                return ((C1103b) e).mo3986b(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1103b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo4496b(int i) {
            return this.f3823b.f3695p.mo3972D(i);
        }

        /* renamed from: c */
        public int mo4497c() {
            return this.f3823b.f3695p.mo4350K();
        }

        /* renamed from: d */
        public int mo4498d(View view) {
            return this.f3823b.mo4074d0(view);
        }

        /* renamed from: e */
        public C1084o mo4499e() {
            return this.f3824c;
        }

        /* renamed from: f */
        public int mo4500f() {
            return this.f3822a;
        }

        /* renamed from: g */
        public boolean mo4501g() {
            return this.f3825d;
        }

        /* renamed from: h */
        public boolean mo4502h() {
            return this.f3826e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4503i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4504j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f3823b;
            if (this.f3822a == -1 || recyclerView == null) {
                mo4512r();
            }
            if (this.f3825d && this.f3827f == null && this.f3824c != null && (a = mo4495a(this.f3822a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo4087f1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f3825d = false;
            View view = this.f3827f;
            if (view != null) {
                if (mo4498d(view) == this.f3822a) {
                    mo4509o(this.f3827f, recyclerView.f3686k0, this.f3828g);
                    this.f3828g.mo4515c(recyclerView);
                    mo4512r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3827f = null;
                }
            }
            if (this.f3826e) {
                mo4506l(i, i2, recyclerView.f3686k0, this.f3828g);
                boolean a2 = this.f3828g.mo4513a();
                this.f3828g.mo4515c(recyclerView);
                if (a2 && this.f3826e) {
                    this.f3825d = true;
                    recyclerView.f3680h0.mo4206e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo4505k(View view) {
            if (mo4498d(view) == mo4500f()) {
                this.f3827f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo4506l(int i, int i2, C1064a0 a0Var, C1102a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo4507m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo4508n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo4509o(View view, C1064a0 a0Var, C1102a aVar);

        /* renamed from: p */
        public void mo4510p(int i) {
            this.f3822a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4511q(RecyclerView recyclerView, C1084o oVar) {
            recyclerView.f3680h0.mo4208g();
            if (this.f3829h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3823b = recyclerView;
            this.f3824c = oVar;
            int i = this.f3822a;
            if (i != -1) {
                recyclerView.f3686k0.f3718a = i;
                this.f3826e = true;
                this.f3825d = true;
                this.f3827f = mo4496b(mo4500f());
                mo4507m();
                this.f3823b.f3680h0.mo4206e();
                this.f3829h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo4512r() {
            if (this.f3826e) {
                this.f3826e = false;
                mo4508n();
                this.f3823b.f3686k0.f3718a = -1;
                this.f3827f = null;
                this.f3822a = -1;
                this.f3825d = false;
                this.f3824c.mo4391i1(this);
                this.f3824c = null;
                this.f3823b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f3635B0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 == r2) goto L_0x0018
            r2 = 20
            if (r1 != r2) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            f3636C0 = r2
            r2 = 23
            if (r1 < r2) goto L_0x0021
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            f3637D0 = r2
            f3638E0 = r0
            r2 = 21
            if (r1 < r2) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            f3639F0 = r1
            f3640G0 = r3
            f3641H0 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f3642I0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f3643J0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2087a.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f3671d = new C1098x();
        this.f3673e = new C1096v();
        this.f3681i = new C1157p();
        this.f3685k = new C1063a();
        this.f3687l = new Rect();
        this.f3689m = new Rect();
        this.f3691n = new RectF();
        this.f3699r = new ArrayList<>();
        this.f3701s = new ArrayList<>();
        this.f3713y = 0;
        this.f3651G = false;
        this.f3652H = false;
        this.f3653I = 0;
        this.f3654J = 0;
        this.f3655K = new C1077k();
        this.f3660P = new C1119c();
        this.f3661Q = 0;
        this.f3662R = -1;
        this.f3674e0 = Float.MIN_VALUE;
        this.f3676f0 = Float.MIN_VALUE;
        boolean z = true;
        this.f3678g0 = true;
        this.f3680h0 = new C1068c0();
        this.f3684j0 = f3639F0 ? new C1135e.C1137b() : null;
        this.f3686k0 = new C1064a0();
        this.f3692n0 = false;
        this.f3694o0 = false;
        this.f3696p0 = new C1082m();
        this.f3698q0 = false;
        this.f3704t0 = new int[2];
        this.f3708v0 = new int[2];
        this.f3710w0 = new int[2];
        this.f3712x0 = new int[2];
        this.f3714y0 = new ArrayList();
        this.f3716z0 = new C1065b();
        this.f3645A0 = new C1069d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3668a0 = viewConfiguration.getScaledTouchSlop();
        this.f3674e0 = C0650b0.m2811b(viewConfiguration, context2);
        this.f3676f0 = C0650b0.m2813d(viewConfiguration, context2);
        this.f3670c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3672d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3660P.mo4317v(this.f3696p0);
        mo4126n0();
        m4845p0();
        m4844o0();
        if (C0735z.m3156C(this) == 0) {
            C0735z.m3155B0(this, 1);
        }
        this.f3649E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1148k(this));
        int[] iArr = C2089c.f7306f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C2089c.f7315o);
        if (obtainStyledAttributes.getInt(C2089c.f7309i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3683j = obtainStyledAttributes.getBoolean(C2089c.f7308h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C2089c.f7310j, false);
        this.f3709w = z2;
        if (z2) {
            mo4144q0((StateListDrawable) obtainStyledAttributes.getDrawable(C2089c.f7313m), obtainStyledAttributes.getDrawable(C2089c.f7314n), (StateListDrawable) obtainStyledAttributes.getDrawable(C2089c.f7311k), obtainStyledAttributes.getDrawable(C2089c.f7312l));
        }
        obtainStyledAttributes.recycle();
        m4850v(context, string, attributeSet, i, 0);
        if (i3 >= 21) {
            int[] iArr2 = f3635B0;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m4812A() {
        int i = this.f3647C;
        this.f3647C = 0;
        if (i != 0 && mo4154s0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0618b.m2689b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: C */
    private void m4813C() {
        boolean z = true;
        this.f3686k0.mo4195a(1);
        mo4049Q(this.f3686k0);
        this.f3686k0.f3727j = false;
        mo4143p1();
        this.f3681i.mo4756f();
        mo4033F0();
        m4819N0();
        m4831c1();
        C1064a0 a0Var = this.f3686k0;
        if (!a0Var.f3728k || !this.f3694o0) {
            z = false;
        }
        a0Var.f3726i = z;
        this.f3694o0 = false;
        this.f3692n0 = false;
        a0Var.f3725h = a0Var.f3729l;
        a0Var.f3723f = this.f3693o.mo4274c();
        m4824U(this.f3704t0);
        if (this.f3686k0.f3728k) {
            int g = this.f3679h.mo4617g();
            for (int i = 0; i < g; i++) {
                C1070d0 f0 = m4835f0(this.f3679h.mo4616f(i));
                if (!f0.mo4223J() && (!f0.mo4244t() || this.f3693o.mo4278g())) {
                    this.f3681i.mo4755e(f0, this.f3660P.mo4315t(this.f3686k0, f0, C1078l.m5038e(f0), f0.mo4239o()));
                    if (this.f3686k0.f3726i && f0.mo4250y() && !f0.mo4247v() && !f0.mo4223J() && !f0.mo4244t()) {
                        this.f3681i.mo4753c(mo4066c0(f0), f0);
                    }
                }
            }
        }
        if (this.f3686k0.f3729l) {
            mo4075d1();
            C1064a0 a0Var2 = this.f3686k0;
            boolean z2 = a0Var2.f3724g;
            a0Var2.f3724g = false;
            this.f3695p.mo3947a1(this.f3673e, a0Var2);
            this.f3686k0.f3724g = z2;
            for (int i2 = 0; i2 < this.f3679h.mo4617g(); i2++) {
                C1070d0 f02 = m4835f0(this.f3679h.mo4616f(i2));
                if (!f02.mo4223J() && !this.f3681i.mo4759i(f02)) {
                    int e = C1078l.m5038e(f02);
                    boolean p = f02.mo4240p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    C1078l.C1081c t = this.f3660P.mo4315t(this.f3686k0, f02, e, f02.mo4239o());
                    if (p) {
                        mo4050Q0(f02, t);
                    } else {
                        this.f3681i.mo4751a(f02, t);
                    }
                }
            }
        }
        mo4153s();
        mo4035G0();
        mo4147r1(false);
        this.f3686k0.f3722e = 2;
    }

    /* renamed from: D */
    private void m4814D() {
        mo4143p1();
        mo4033F0();
        this.f3686k0.mo4195a(6);
        this.f3677g.mo4597j();
        this.f3686k0.f3723f = this.f3693o.mo4274c();
        C1064a0 a0Var = this.f3686k0;
        a0Var.f3721d = 0;
        a0Var.f3725h = false;
        this.f3695p.mo3947a1(this.f3673e, a0Var);
        C1064a0 a0Var2 = this.f3686k0;
        a0Var2.f3724g = false;
        this.f3675f = null;
        a0Var2.f3728k = a0Var2.f3728k && this.f3660P != null;
        a0Var2.f3722e = 4;
        mo4035G0();
        mo4147r1(false);
    }

    /* renamed from: E */
    private void m4815E() {
        this.f3686k0.mo4195a(4);
        mo4143p1();
        mo4033F0();
        C1064a0 a0Var = this.f3686k0;
        a0Var.f3722e = 1;
        if (a0Var.f3728k) {
            for (int g = this.f3679h.mo4617g() - 1; g >= 0; g--) {
                C1070d0 f0 = m4835f0(this.f3679h.mo4616f(g));
                if (!f0.mo4223J()) {
                    long c0 = mo4066c0(f0);
                    C1078l.C1081c s = this.f3660P.mo4314s(this.f3686k0, f0);
                    C1070d0 g2 = this.f3681i.mo4757g(c0);
                    if (g2 != null && !g2.mo4223J()) {
                        boolean h = this.f3681i.mo4758h(g2);
                        boolean h2 = this.f3681i.mo4758h(f0);
                        if (!h || g2 != f0) {
                            C1078l.C1081c n = this.f3681i.mo4763n(g2);
                            this.f3681i.mo4754d(f0, s);
                            C1078l.C1081c m = this.f3681i.mo4762m(f0);
                            if (n == null) {
                                m4841k0(c0, f0, g2);
                            } else {
                                m4842m(g2, f0, n, m, h, h2);
                            }
                        }
                    }
                    this.f3681i.mo4754d(f0, s);
                }
            }
            this.f3681i.mo4764o(this.f3645A0);
        }
        this.f3695p.mo4403o1(this.f3673e);
        C1064a0 a0Var2 = this.f3686k0;
        a0Var2.f3720c = a0Var2.f3723f;
        this.f3651G = false;
        this.f3652H = false;
        a0Var2.f3728k = false;
        a0Var2.f3729l = false;
        this.f3695p.f3785h = false;
        ArrayList<C1070d0> arrayList = this.f3673e.f3813b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1084o oVar = this.f3695p;
        if (oVar.f3791n) {
            oVar.f3790m = 0;
            oVar.f3791n = false;
            this.f3673e.mo4461K();
        }
        this.f3695p.mo3949b1(this.f3686k0);
        mo4035G0();
        mo4147r1(false);
        this.f3681i.mo4756f();
        int[] iArr = this.f3704t0;
        if (m4851x(iArr[0], iArr[1])) {
            mo4038I(0, 0);
        }
        m4821R0();
        m4828a1();
    }

    /* renamed from: I0 */
    private void m4816I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3662R) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3662R = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3666V = x;
            this.f3664T = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3667W = y;
            this.f3665U = y;
        }
    }

    /* renamed from: K */
    private boolean m4817K(MotionEvent motionEvent) {
        C1092s sVar = this.f3703t;
        if (sVar != null) {
            sVar.mo4437b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f3703t = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m4823T(motionEvent);
        }
    }

    /* renamed from: M0 */
    private boolean m4818M0() {
        return this.f3660P != null && this.f3695p.mo3938O1();
    }

    /* renamed from: N0 */
    private void m4819N0() {
        boolean z;
        if (this.f3651G) {
            this.f3677g.mo4606u();
            if (this.f3652H) {
                this.f3695p.mo3942V0(this);
            }
        }
        if (m4818M0()) {
            this.f3677g.mo4604s();
        } else {
            this.f3677g.mo4597j();
        }
        boolean z2 = false;
        boolean z3 = this.f3692n0 || this.f3694o0;
        this.f3686k0.f3728k = this.f3711x && this.f3660P != null && ((z = this.f3651G) || z3 || this.f3695p.f3785h) && (!z || this.f3693o.mo4278g());
        C1064a0 a0Var = this.f3686k0;
        if (a0Var.f3728k && z3 && !this.f3651G && m4818M0()) {
            z2 = true;
        }
        a0Var.f3729l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4820P0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo4044M()
            android.widget.EdgeEffect r3 = r6.f3656L
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C0773d.m3505c(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.mo4045N()
            android.widget.EdgeEffect r3 = r6.f3658N
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.mo4046O()
            android.widget.EdgeEffect r9 = r6.f3657M
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0773d.m3505c(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.mo4042L()
            android.widget.EdgeEffect r9 = r6.f3659O
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0773d.m3505c(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            androidx.core.view.C0735z.m3210i0(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4820P0(float, float, float, float):void");
    }

    /* renamed from: R0 */
    private void m4821R0() {
        View findViewById;
        if (this.f3678g0 && this.f3693o != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3641H0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3679h.mo4622n(focusedChild)) {
                            return;
                        }
                    } else if (this.f3679h.mo4617g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C1070d0 Y = (this.f3686k0.f3731n == -1 || !this.f3693o.mo4278g()) ? null : mo4059Y(this.f3686k0.f3731n);
                if (Y != null && !this.f3679h.mo4622n(Y.f3745a) && Y.f3745a.hasFocusable()) {
                    view = Y.f3745a;
                } else if (this.f3679h.mo4617g() > 0) {
                    view = m4826W();
                }
                if (view != null) {
                    int i = this.f3686k0.f3732o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: S0 */
    private void m4822S0() {
        boolean z;
        EdgeEffect edgeEffect = this.f3656L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3656L.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3657M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3657M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3658N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3658N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3659O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3659O.isFinished();
        }
        if (z) {
            C0735z.m3210i0(this);
        }
    }

    /* renamed from: T */
    private boolean m4823T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3701s.size();
        int i = 0;
        while (i < size) {
            C1092s sVar = this.f3701s.get(i);
            if (!sVar.mo4436a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f3703t = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    private void m4824U(int[] iArr) {
        int g = this.f3679h.mo4617g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4616f(i3));
            if (!f0.mo4223J()) {
                int m = f0.mo4237m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: V */
    static RecyclerView m4825V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView V = m4825V(viewGroup.getChildAt(i));
            if (V != null) {
                return V;
            }
        }
        return null;
    }

    /* renamed from: W */
    private View m4826W() {
        C1070d0 X;
        C1064a0 a0Var = this.f3686k0;
        int i = a0Var.f3730m;
        if (i == -1) {
            i = 0;
        }
        int b = a0Var.mo4196b();
        int i2 = i;
        while (i2 < b) {
            C1070d0 X2 = mo4057X(i2);
            if (X2 == null) {
                break;
            } else if (X2.f3745a.hasFocusable()) {
                return X2.f3745a;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (X = mo4057X(min)) == null) {
                return null;
            }
            if (X.f3745a.hasFocusable()) {
                return X.f3745a;
            }
        }
    }

    /* renamed from: Z0 */
    private void m4827Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3687l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1089p) {
            C1089p pVar = (C1089p) layoutParams;
            if (!pVar.f3804c) {
                Rect rect = pVar.f3803b;
                Rect rect2 = this.f3687l;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3687l);
            offsetRectIntoDescendantCoords(view, this.f3687l);
        }
        this.f3695p.mo4416v1(this, view, this.f3687l, !this.f3711x, view2 == null);
    }

    /* renamed from: a1 */
    private void m4828a1() {
        C1064a0 a0Var = this.f3686k0;
        a0Var.f3731n = -1;
        a0Var.f3730m = -1;
        a0Var.f3732o = -1;
    }

    /* renamed from: b1 */
    private void m4829b1() {
        VelocityTracker velocityTracker = this.f3663S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo4155s1(0);
        m4822S0();
    }

    /* renamed from: c1 */
    private void m4831c1() {
        C1070d0 d0Var = null;
        View focusedChild = (!this.f3678g0 || !hasFocus() || this.f3693o == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = mo4052S(focusedChild);
        }
        if (d0Var == null) {
            m4828a1();
            return;
        }
        this.f3686k0.f3731n = this.f3693o.mo4278g() ? d0Var.mo4235k() : -1;
        this.f3686k0.f3730m = this.f3651G ? -1 : d0Var.mo4247v() ? d0Var.f3748d : d0Var.mo4234j();
        this.f3686k0.f3732o = m4838h0(d0Var.f3745a);
    }

    /* renamed from: f0 */
    static C1070d0 m4835f0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1089p) view.getLayoutParams()).f3802a;
    }

    /* renamed from: g */
    private void m4836g(C1070d0 d0Var) {
        View view = d0Var.f3745a;
        boolean z = view.getParent() == this;
        this.f3673e.mo4460J(mo4085e0(view));
        if (d0Var.mo4249x()) {
            this.f3679h.mo4613c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1116b bVar = this.f3679h;
        if (!z) {
            bVar.mo4612b(view, true);
        } else {
            bVar.mo4620k(view);
        }
    }

    /* renamed from: g0 */
    static void m4837g0(View view, Rect rect) {
        C1089p pVar = (C1089p) view.getLayoutParams();
        Rect rect2 = pVar.f3803b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private C0724o getScrollingChildHelper() {
        if (this.f3706u0 == null) {
            this.f3706u0 = new C0724o(this);
        }
        return this.f3706u0;
    }

    /* renamed from: h0 */
    private int m4838h0(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: h1 */
    private void m4839h1(C1073g gVar, boolean z, boolean z2) {
        C1073g gVar2 = this.f3693o;
        if (gVar2 != null) {
            gVar2.mo4291t(this.f3671d);
            this.f3693o.mo4284m(this);
        }
        if (!z || z2) {
            mo4053T0();
        }
        this.f3677g.mo4606u();
        C1073g gVar3 = this.f3693o;
        this.f3693o = gVar;
        if (gVar != null) {
            gVar.mo4289r(this.f3671d);
            gVar.mo4280i(this);
        }
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo4343H0(gVar3, this.f3693o);
        }
        this.f3673e.mo4484x(gVar3, this.f3693o, z);
        this.f3686k0.f3724g = true;
    }

    /* renamed from: i0 */
    private String m4840i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: k0 */
    private void m4841k0(long j, C1070d0 d0Var, C1070d0 d0Var2) {
        int g = this.f3679h.mo4617g();
        for (int i = 0; i < g; i++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4616f(i));
            if (f0 != d0Var && mo4066c0(f0) == j) {
                C1073g gVar = this.f3693o;
                if (gVar == null || !gVar.mo4278g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f0 + " \n View Holder 2:" + d0Var + mo4048P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f0 + " \n View Holder 2:" + d0Var + mo4048P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + mo4048P());
    }

    /* renamed from: m */
    private void m4842m(C1070d0 d0Var, C1070d0 d0Var2, C1078l.C1081c cVar, C1078l.C1081c cVar2, boolean z, boolean z2) {
        d0Var.mo4220G(false);
        if (z) {
            m4836g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m4836g(d0Var2);
            }
            d0Var.f3752h = d0Var2;
            m4836g(d0Var);
            this.f3673e.mo4460J(d0Var);
            d0Var2.mo4220G(false);
            d0Var2.f3753i = d0Var;
        }
        if (this.f3660P.mo4298b(d0Var, d0Var2, cVar, cVar2)) {
            mo4043L0();
        }
    }

    /* renamed from: m0 */
    private boolean m4843m0() {
        int g = this.f3679h.mo4617g();
        for (int i = 0; i < g; i++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4616f(i));
            if (f0 != null && !f0.mo4223J() && f0.mo4250y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: o0 */
    private void m4844o0() {
        if (C0735z.m3158D(this) == 0) {
            C0735z.m3157C0(this, 8);
        }
    }

    /* renamed from: p0 */
    private void m4845p0() {
        this.f3679h = new C1116b(new C1071e());
    }

    /* renamed from: q */
    private void m4846q() {
        m4829b1();
        setScrollState(0);
    }

    /* renamed from: r */
    static void m4847r(C1070d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f3746b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f3746b = null;
                        return;
                    } else if (view != d0Var.f3745a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: u0 */
    private boolean m4848u0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || mo4051R(view2) == null) {
            return false;
        }
        if (view == null || mo4051R(view) == null) {
            return true;
        }
        this.f3687l.set(0, 0, view.getWidth(), view.getHeight());
        this.f3689m.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3687l);
        offsetDescendantRectToMyCoords(view2, this.f3689m);
        char c = 65535;
        int i3 = this.f3695p.mo4373a0() == 1 ? -1 : 1;
        Rect rect = this.f3687l;
        int i4 = rect.left;
        Rect rect2 = this.f3689m;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + mo4048P());
    }

    /* renamed from: u1 */
    private void m4849u1() {
        this.f3680h0.mo4208g();
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo4355N1();
        }
    }

    /* renamed from: v */
    private void m4850v(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String i0 = m4840i0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(i0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C1084o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3642I0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1084o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + i0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + i0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + i0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + i0, e7);
                }
            }
        }
    }

    /* renamed from: x */
    private boolean m4851x(int i, int i2) {
        m4824U(this.f3704t0);
        int[] iArr = this.f3704t0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo4026A0(int i, int i2) {
        int j = this.f3679h.mo4619j();
        for (int i3 = 0; i3 < j; i3++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i3));
            if (f0 != null && !f0.mo4223J() && f0.f3747c >= i) {
                f0.mo4214A(i2, false);
                this.f3686k0.f3724g = true;
            }
        }
        this.f3673e.mo4481u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4027B() {
        String str;
        if (this.f3693o == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.f3695p == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C1064a0 a0Var = this.f3686k0;
            a0Var.f3727j = false;
            if (a0Var.f3722e == 1) {
                m4813C();
            } else if (!this.f3677g.mo4603q() && this.f3695p.mo4408r0() == getWidth() && this.f3695p.mo4369X() == getHeight()) {
                this.f3695p.mo4334C1(this);
                m4815E();
                return;
            }
            this.f3695p.mo4334C1(this);
            m4814D();
            m4815E();
            return;
        }
        Log.e("RecyclerView", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo4028B0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f3679h.mo4619j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i7));
            if (f0 != null && (i6 = f0.f3747c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    f0.mo4214A(i2 - i, false);
                } else {
                    f0.mo4214A(i5, false);
                }
                this.f3686k0.f3724g = true;
            }
        }
        this.f3673e.mo4482v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo4029C0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f3679h.mo4619j();
        for (int i4 = 0; i4 < j; i4++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i4));
            if (f0 != null && !f0.mo4223J()) {
                int i5 = f0.f3747c;
                if (i5 >= i3) {
                    f0.mo4214A(-i2, z);
                } else if (i5 >= i) {
                    f0.mo4233i(i - 1, -i2, z);
                }
                this.f3686k0.f3724g = true;
            }
        }
        this.f3673e.mo4483w(i, i2, z);
        requestLayout();
    }

    /* renamed from: D0 */
    public void mo4030D0(View view) {
    }

    /* renamed from: E0 */
    public void mo4031E0(View view) {
    }

    /* renamed from: F */
    public boolean mo4032F(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2921d(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo4033F0() {
        this.f3653I++;
    }

    /* renamed from: G */
    public final void mo4034G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo2922e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo4035G0() {
        mo4037H0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4036H(int i) {
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo4388h1(i);
        }
        mo4040J0(i);
        C1093t tVar = this.f3688l0;
        if (tVar != null) {
            tVar.mo4439a(this, i);
        }
        List<C1093t> list = this.f3690m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3690m0.get(size).mo4439a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo4037H0(boolean z) {
        int i = this.f3653I - 1;
        this.f3653I = i;
        if (i < 1) {
            this.f3653I = 0;
            if (z) {
                m4812A();
                mo4039J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4038I(int i, int i2) {
        this.f3654J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo4041K0(i, i2);
        C1093t tVar = this.f3688l0;
        if (tVar != null) {
            tVar.mo4440b(this, i, i2);
        }
        List<C1093t> list = this.f3690m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3690m0.get(size).mo4440b(this, i, i2);
            }
        }
        this.f3654J--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo4039J() {
        int i;
        for (int size = this.f3714y0.size() - 1; size >= 0; size--) {
            C1070d0 d0Var = this.f3714y0.get(size);
            if (d0Var.f3745a.getParent() == this && !d0Var.mo4223J() && (i = d0Var.f3761q) != -1) {
                C0735z.m3155B0(d0Var.f3745a, i);
                d0Var.f3761q = -1;
            }
        }
        this.f3714y0.clear();
    }

    /* renamed from: J0 */
    public void mo4040J0(int i) {
    }

    /* renamed from: K0 */
    public void mo4041K0(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo4042L() {
        int i;
        int i2;
        if (this.f3659O == null) {
            EdgeEffect a = this.f3655K.mo4296a(this, 3);
            this.f3659O = a;
            if (this.f3683j) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo4043L0() {
        if (!this.f3698q0 && this.f3705u) {
            C0735z.m3212j0(this, this.f3716z0);
            this.f3698q0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4044M() {
        int i;
        int i2;
        if (this.f3656L == null) {
            EdgeEffect a = this.f3655K.mo4296a(this, 0);
            this.f3656L = a;
            if (this.f3683j) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo4045N() {
        int i;
        int i2;
        if (this.f3658N == null) {
            EdgeEffect a = this.f3655K.mo4296a(this, 2);
            this.f3658N = a;
            if (this.f3683j) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4046O() {
        int i;
        int i2;
        if (this.f3657M == null) {
            EdgeEffect a = this.f3655K.mo4296a(this, 1);
            this.f3657M = a;
            if (this.f3683j) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo4047O0(boolean z) {
        this.f3652H = z | this.f3652H;
        this.f3651G = true;
        mo4189x0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public String mo4048P() {
        return " " + super.toString() + ", adapter:" + this.f3693o + ", layout:" + this.f3695p + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo4049Q(C1064a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3680h0.f3738f;
            a0Var.f3733p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3734q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3733p = 0;
        a0Var.f3734q = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo4050Q0(C1070d0 d0Var, C1078l.C1081c cVar) {
        d0Var.mo4219F(0, 8192);
        if (this.f3686k0.f3726i && d0Var.mo4250y() && !d0Var.mo4247v() && !d0Var.mo4223J()) {
            this.f3681i.mo4753c(mo4066c0(d0Var), d0Var);
        }
        this.f3681i.mo4755e(d0Var, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4051R(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo4051R(android.view.View):android.view.View");
    }

    /* renamed from: S */
    public C1070d0 mo4052S(View view) {
        View R = mo4051R(view);
        if (R == null) {
            return null;
        }
        return mo4085e0(R);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo4053T0() {
        C1078l lVar = this.f3660P;
        if (lVar != null) {
            lVar.mo4306k();
        }
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo4401n1(this.f3673e);
            this.f3695p.mo4403o1(this.f3673e);
        }
        this.f3673e.mo4465c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public boolean mo4054U0(View view) {
        mo4143p1();
        boolean r = this.f3679h.mo4626r(view);
        if (r) {
            C1070d0 f0 = m4835f0(view);
            this.f3673e.mo4460J(f0);
            this.f3673e.mo4454C(f0);
        }
        mo4147r1(!r);
        return r;
    }

    /* renamed from: V0 */
    public void mo4055V0(C1083n nVar) {
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo3993h("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3699r.remove(nVar);
        if (this.f3699r.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4188w0();
        requestLayout();
    }

    /* renamed from: W0 */
    public void mo4056W0(C1092s sVar) {
        this.f3701s.remove(sVar);
        if (this.f3703t == sVar) {
            this.f3703t = null;
        }
    }

    /* renamed from: X */
    public C1070d0 mo4057X(int i) {
        C1070d0 d0Var = null;
        if (this.f3651G) {
            return null;
        }
        int j = this.f3679h.mo4619j();
        for (int i2 = 0; i2 < j; i2++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i2));
            if (f0 != null && !f0.mo4247v() && mo4065b0(f0) == i) {
                if (!this.f3679h.mo4622n(f0.f3745a)) {
                    return f0;
                }
                d0Var = f0;
            }
        }
        return d0Var;
    }

    /* renamed from: X0 */
    public void mo4058X0(C1093t tVar) {
        List<C1093t> list = this.f3690m0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* renamed from: Y */
    public C1070d0 mo4059Y(long j) {
        C1073g gVar = this.f3693o;
        C1070d0 d0Var = null;
        if (gVar != null && gVar.mo4278g()) {
            int j2 = this.f3679h.mo4619j();
            for (int i = 0; i < j2; i++) {
                C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i));
                if (f0 != null && !f0.mo4247v() && f0.mo4235k() == j) {
                    if (!this.f3679h.mo4622n(f0.f3745a)) {
                        return f0;
                    }
                    d0Var = f0;
                }
            }
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo4060Y0() {
        C1070d0 d0Var;
        int g = this.f3679h.mo4617g();
        for (int i = 0; i < g; i++) {
            View f = this.f3679h.mo4616f(i);
            C1070d0 e0 = mo4085e0(f);
            if (!(e0 == null || (d0Var = e0.f3753i) == null)) {
                View view = d0Var.f3745a;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C1070d0 mo4061Z(int i, boolean z) {
        int j = this.f3679h.mo4619j();
        C1070d0 d0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i2));
            if (f0 != null && !f0.mo4247v()) {
                if (z) {
                    if (f0.f3747c != i) {
                        continue;
                    }
                } else if (f0.mo4237m() != i) {
                    continue;
                }
                if (!this.f3679h.mo4622n(f0.f3745a)) {
                    return f0;
                }
                d0Var = f0;
            }
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4062a(int i, int i2) {
        if (i < 0) {
            mo4044M();
            if (this.f3656L.isFinished()) {
                this.f3656L.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo4045N();
            if (this.f3658N.isFinished()) {
                this.f3658N.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo4046O();
            if (this.f3657M.isFinished()) {
                this.f3657M.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo4042L();
            if (this.f3659O.isFinished()) {
                this.f3659O.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C0735z.m3210i0(this);
        }
    }

    /* renamed from: a0 */
    public boolean mo4063a0(int i, int i2) {
        C1084o oVar = this.f3695p;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3644A) {
            return false;
        } else {
            boolean l = oVar.mo3995l();
            boolean m = this.f3695p.mo3996m();
            if (!l || Math.abs(i) < this.f3670c0) {
                i = 0;
            }
            if (!m || Math.abs(i2) < this.f3670c0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = l || m;
                dispatchNestedFling(f, f2, z);
                C1091r rVar = this.f3669b0;
                if (rVar != null && rVar.mo4435a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (m) {
                        l |= true;
                    }
                    mo4145q1(l ? 1 : 0, 1);
                    int i3 = this.f3672d0;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.f3672d0;
                    this.f3680h0.mo4205c(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1084o oVar = this.f3695p;
        if (oVar == null || !oVar.mo4346I0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public int mo4065b0(C1070d0 d0Var) {
        if (d0Var.mo4240p(524) || !d0Var.mo4243s()) {
            return -1;
        }
        return this.f3677g.mo4595e(d0Var.f3747c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public long mo4066c0(C1070d0 d0Var) {
        return this.f3693o.mo4278g() ? d0Var.mo4235k() : (long) d0Var.f3747c;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1089p) && this.f3695p.mo3952n((C1089p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C1084o oVar = this.f3695p;
        if (oVar != null && oVar.mo3995l()) {
            return this.f3695p.mo3999r(this.f3686k0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C1084o oVar = this.f3695p;
        if (oVar != null && oVar.mo3995l()) {
            return this.f3695p.mo3954s(this.f3686k0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C1084o oVar = this.f3695p;
        if (oVar != null && oVar.mo3995l()) {
            return this.f3695p.mo3955t(this.f3686k0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C1084o oVar = this.f3695p;
        if (oVar != null && oVar.mo3996m()) {
            return this.f3695p.mo4003u(this.f3686k0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C1084o oVar = this.f3695p;
        if (oVar != null && oVar.mo3996m()) {
            return this.f3695p.mo3956v(this.f3686k0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C1084o oVar = this.f3695p;
        if (oVar != null && oVar.mo3996m()) {
            return this.f3695p.mo3958w(this.f3686k0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public int mo4074d0(View view) {
        C1070d0 f0 = m4835f0(view);
        if (f0 != null) {
            return f0.mo4237m();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo4075d1() {
        int j = this.f3679h.mo4619j();
        for (int i = 0; i < j; i++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i));
            if (!f0.mo4223J()) {
                f0.mo4218E();
            }
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2918a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2919b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2920c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2923f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f3699r.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f3699r.get(i2).mo4327i(canvas, this, this.f3686k0);
        }
        EdgeEffect edgeEffect = this.f3656L;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3683j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3656L;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3657M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3683j) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3657M;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3658N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3683j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f3658N;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3659O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3683j) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f3659O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3660P == null || this.f3699r.size() <= 0 || !this.f3660P.mo4311p()) {
            z3 = z;
        }
        if (z3) {
            C0735z.m3210i0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public C1070d0 mo4085e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4835f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public boolean mo4086e1(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo4184u();
        if (this.f3693o != null) {
            int[] iArr = this.f3712x0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo4087f1(i7, i8, iArr);
            int[] iArr2 = this.f3712x0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3699r.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3712x0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo4034G(i5, i6, i4, i3, this.f3708v0, 0, iArr3);
        int[] iArr4 = this.f3712x0;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.f3666V;
        int[] iArr5 = this.f3708v0;
        this.f3666V = i13 - iArr5[0];
        this.f3667W -= iArr5[1];
        int[] iArr6 = this.f3710w0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0716m.m3103a(motionEvent2, 8194)) {
                m4820P0(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            mo4181t(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            mo4038I(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo4087f1(int i, int i2, int[] iArr) {
        mo4143p1();
        mo4033F0();
        C0560k.m2546a("RV Scroll");
        mo4049Q(this.f3686k0);
        int z1 = i != 0 ? this.f3695p.mo3960z1(i, this.f3673e, this.f3686k0) : 0;
        int B1 = i2 != 0 ? this.f3695p.mo3930B1(i2, this.f3673e, this.f3686k0) : 0;
        C0560k.m2547b();
        mo4060Y0();
        mo4035G0();
        mo4147r1(false);
        if (iArr != null) {
            iArr[0] = z1;
            iArr[1] = B1;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View T0 = this.f3695p.mo4365T0(view, i);
        if (T0 != null) {
            return T0;
        }
        boolean z2 = true;
        boolean z3 = this.f3693o != null && this.f3695p != null && !mo4182t0() && !this.f3644A;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo4184u();
                if (mo4051R(view) == null) {
                    return null;
                }
                mo4143p1();
                view2 = this.f3695p.mo3936M0(view, i, this.f3673e, this.f3686k0);
                mo4147r1(false);
            }
        } else {
            if (this.f3695p.mo3996m()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3640G0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3695p.mo3995l()) {
                int i3 = (this.f3695p.mo4373a0() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f3640G0) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo4184u();
                if (mo4051R(view) == null) {
                    return null;
                }
                mo4143p1();
                this.f3695p.mo3936M0(view, i, this.f3673e, this.f3686k0);
                mo4147r1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m4848u0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m4827Z0(view2, (View) null);
        return view;
    }

    /* renamed from: g1 */
    public void mo4089g1(int i) {
        if (!this.f3644A) {
            mo4183t1();
            C1084o oVar = this.f3695p;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo3970A1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            return oVar.mo3931E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4048P());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            return oVar.mo3932F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4048P());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            return oVar.mo3934G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4048P());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1073g getAdapter() {
        return this.f3693o;
    }

    public int getBaseline() {
        C1084o oVar = this.f3695p;
        return oVar != null ? oVar.mo4342H() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C1076j jVar = this.f3702s0;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo4295a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3683j;
    }

    public C1148k getCompatAccessibilityDelegate() {
        return this.f3700r0;
    }

    public C1077k getEdgeEffectFactory() {
        return this.f3655K;
    }

    public C1078l getItemAnimator() {
        return this.f3660P;
    }

    public int getItemDecorationCount() {
        return this.f3699r.size();
    }

    public C1084o getLayoutManager() {
        return this.f3695p;
    }

    public int getMaxFlingVelocity() {
        return this.f3672d0;
    }

    public int getMinFlingVelocity() {
        return this.f3670c0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3639F0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1091r getOnFlingListener() {
        return this.f3669b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3678g0;
    }

    public C1094u getRecycledViewPool() {
        return this.f3673e.mo4471i();
    }

    public int getScrollState() {
        return this.f3661Q;
    }

    /* renamed from: h */
    public void mo4110h(C1083n nVar) {
        mo4112i(nVar, -1);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2924j();
    }

    /* renamed from: i */
    public void mo4112i(C1083n nVar, int i) {
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo3993h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3699r.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3699r.add(nVar);
        } else {
            this.f3699r.add(i, nVar);
        }
        mo4188w0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public boolean mo4113i1(C1070d0 d0Var, int i) {
        if (mo4182t0()) {
            d0Var.f3761q = i;
            this.f3714y0.add(d0Var);
            return false;
        }
        C0735z.m3155B0(d0Var.f3745a, i);
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.f3705u;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3644A;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo2926l();
    }

    /* renamed from: j */
    public void mo4116j(C1092s sVar) {
        this.f3701s.add(sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public Rect mo4117j0(View view) {
        C1089p pVar = (C1089p) view.getLayoutParams();
        if (!pVar.f3804c) {
            return pVar.f3803b;
        }
        if (this.f3686k0.mo4199e() && (pVar.mo4430b() || pVar.mo4432d())) {
            return pVar.f3803b;
        }
        Rect rect = pVar.f3803b;
        rect.set(0, 0, 0, 0);
        int size = this.f3699r.size();
        for (int i = 0; i < size; i++) {
            this.f3687l.set(0, 0, 0, 0);
            this.f3699r.get(i).mo4323e(this.f3687l, view, this, this.f3686k0);
            int i2 = rect.left;
            Rect rect2 = this.f3687l;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3804c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public boolean mo4118j1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo4182t0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0618b.m2688a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f3647C |= i;
        return true;
    }

    /* renamed from: k */
    public void mo4119k(C1093t tVar) {
        if (this.f3690m0 == null) {
            this.f3690m0 = new ArrayList();
        }
        this.f3690m0.add(tVar);
    }

    /* renamed from: k1 */
    public void mo4120k1(int i, int i2) {
        mo4123l1(i, i2, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4121l(C1070d0 d0Var, C1078l.C1081c cVar, C1078l.C1081c cVar2) {
        d0Var.mo4220G(false);
        if (this.f3660P.mo4297a(d0Var, cVar, cVar2)) {
            mo4043L0();
        }
    }

    /* renamed from: l0 */
    public boolean mo4122l0() {
        return !this.f3711x || this.f3651G || this.f3677g.mo4602p();
    }

    /* renamed from: l1 */
    public void mo4123l1(int i, int i2, Interpolator interpolator) {
        mo4124m1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: m1 */
    public void mo4124m1(int i, int i2, Interpolator interpolator, int i3) {
        mo4127n1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4125n(C1070d0 d0Var, C1078l.C1081c cVar, C1078l.C1081c cVar2) {
        m4836g(d0Var);
        d0Var.mo4220G(false);
        if (this.f3660P.mo4299c(d0Var, cVar, cVar2)) {
            mo4043L0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo4126n0() {
        this.f3677g = new C1113a(new C1072f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo4127n1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C1084o oVar = this.f3695p;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3644A) {
            int i4 = 0;
            if (!oVar.mo3995l()) {
                i = 0;
            }
            if (!this.f3695p.mo3996m()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo4145q1(i4, 1);
                    }
                    this.f3680h0.mo4207f(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4128o(String str) {
        if (mo4182t0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo4048P());
            }
            throw new IllegalStateException(str);
        } else if (this.f3654J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo4048P()));
        }
    }

    /* renamed from: o1 */
    public void mo4129o1(int i) {
        if (!this.f3644A) {
            C1084o oVar = this.f3695p;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo3978L1(this, this.f3686k0, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3653I = 0;
        boolean z = true;
        this.f3705u = true;
        if (!this.f3711x || isLayoutRequested()) {
            z = false;
        }
        this.f3711x = z;
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo4328A(this);
        }
        this.f3698q0 = false;
        if (f3639F0) {
            ThreadLocal<C1135e> threadLocal = C1135e.f3997h;
            C1135e eVar = threadLocal.get();
            this.f3682i0 = eVar;
            if (eVar == null) {
                this.f3682i0 = new C1135e();
                Display x = C0735z.m3239x(this);
                float f = 60.0f;
                if (!isInEditMode() && x != null) {
                    float refreshRate = x.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1135e eVar2 = this.f3682i0;
                eVar2.f4001f = (long) (1.0E9f / f);
                threadLocal.set(eVar2);
            }
            this.f3682i0.mo4674a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1135e eVar;
        super.onDetachedFromWindow();
        C1078l lVar = this.f3660P;
        if (lVar != null) {
            lVar.mo4306k();
        }
        mo4183t1();
        this.f3705u = false;
        C1084o oVar = this.f3695p;
        if (oVar != null) {
            oVar.mo4330B(this, this.f3673e);
        }
        this.f3714y0.clear();
        removeCallbacks(this.f3716z0);
        this.f3681i.mo4760j();
        if (f3639F0 && (eVar = this.f3682i0) != null) {
            eVar.mo4677j(this);
            this.f3682i0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3699r.size();
        for (int i = 0; i < size; i++) {
            this.f3699r.get(i).mo4325g(canvas, this, this.f3686k0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3695p != null && !this.f3644A && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3695p.mo3996m() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3695p.mo3995l()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo4086e1((int) (f * this.f3674e0), (int) (f2 * this.f3676f0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3695p.mo3996m()) {
                        f2 = -axisValue;
                    } else if (this.f3695p.mo3995l()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo4086e1((int) (f * this.f3674e0), (int) (f2 * this.f3676f0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo4086e1((int) (f * this.f3674e0), (int) (f2 * this.f3676f0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3644A) {
            return false;
        }
        this.f3703t = null;
        if (m4823T(motionEvent)) {
            m4846q();
            return true;
        }
        C1084o oVar = this.f3695p;
        if (oVar == null) {
            return false;
        }
        boolean l = oVar.mo3995l();
        boolean m = this.f3695p.mo3996m();
        if (this.f3663S == null) {
            this.f3663S = VelocityTracker.obtain();
        }
        this.f3663S.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3646B) {
                this.f3646B = false;
            }
            this.f3662R = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3666V = x;
            this.f3664T = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3667W = y;
            this.f3665U = y;
            if (this.f3661Q == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo4155s1(1);
            }
            int[] iArr = this.f3710w0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (m) {
                l |= true;
            }
            mo4145q1(l ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f3663S.clear();
            mo4155s1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3662R);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3662R + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3661Q != 1) {
                int i = x2 - this.f3664T;
                int i2 = y2 - this.f3665U;
                if (!l || Math.abs(i) <= this.f3668a0) {
                    z = false;
                } else {
                    this.f3666V = x2;
                    z = true;
                }
                if (m && Math.abs(i2) > this.f3668a0) {
                    this.f3667W = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m4846q();
        } else if (actionMasked == 5) {
            this.f3662R = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3666V = x3;
            this.f3664T = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3667W = y3;
            this.f3665U = y3;
        } else if (actionMasked == 6) {
            m4816I0(motionEvent);
        }
        return this.f3661Q == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0560k.m2546a("RV OnLayout");
        mo4027B();
        C0560k.m2547b();
        this.f3711x = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1084o oVar = this.f3695p;
        if (oVar == null) {
            mo4187w(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo4005v0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3695p.mo4377c1(this.f3673e, this.f3686k0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3693o != null) {
                if (this.f3686k0.f3722e == 1) {
                    m4813C();
                }
                this.f3695p.mo4336D1(i, i2);
                this.f3686k0.f3727j = true;
                m4814D();
                this.f3695p.mo4341G1(i, i2);
                if (this.f3695p.mo3976J1()) {
                    this.f3695p.mo4336D1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3686k0.f3727j = true;
                    m4814D();
                    this.f3695p.mo4341G1(i, i2);
                }
            }
        } else if (this.f3707v) {
            this.f3695p.mo4377c1(this.f3673e, this.f3686k0, i, i2);
        } else {
            if (this.f3648D) {
                mo4143p1();
                mo4033F0();
                m4819N0();
                mo4035G0();
                C1064a0 a0Var = this.f3686k0;
                if (a0Var.f3729l) {
                    a0Var.f3725h = true;
                } else {
                    this.f3677g.mo4597j();
                    this.f3686k0.f3725h = false;
                }
                this.f3648D = false;
                mo4147r1(false);
            } else if (this.f3686k0.f3729l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1073g gVar = this.f3693o;
            if (gVar != null) {
                this.f3686k0.f3723f = gVar.mo4274c();
            } else {
                this.f3686k0.f3723f = 0;
            }
            mo4143p1();
            this.f3695p.mo4377c1(this.f3673e, this.f3686k0, i, i2);
            mo4147r1(false);
            this.f3686k0.f3725h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4182t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1099y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1099y yVar = (C1099y) parcelable;
        this.f3675f = yVar;
        super.onRestoreInstanceState(yVar.mo11323a());
        C1084o oVar = this.f3695p;
        if (oVar != null && (parcelable2 = this.f3675f.f3821f) != null) {
            oVar.mo3989f1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1099y yVar = new C1099y(super.onSaveInstanceState());
        C1099y yVar2 = this.f3675f;
        if (yVar2 != null) {
            yVar.mo4488c(yVar2);
        } else {
            C1084o oVar = this.f3695p;
            yVar.f3821f = oVar != null ? oVar.mo3991g1() : null;
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4146r0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f3644A
            r8 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r6.f3646B
            if (r0 == 0) goto L_0x000f
            goto L_0x01db
        L_0x000f:
            boolean r0 = r17.m4817K(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m4846q()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f3695p
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo3995l()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f3695p
            boolean r11 = r0.mo3996m()
            android.view.VelocityTracker r0 = r6.f3663S
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f3663S = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f3710w0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f3710w0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01af
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d0
        L_0x0066:
            r17.m4816I0(r18)
            goto L_0x01d0
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f3662R = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3666V = r0
            r6.f3664T = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3667W = r0
            r6.f3665U = r0
            goto L_0x01d0
        L_0x0087:
            r17.m4846q()
            goto L_0x01d0
        L_0x008c:
            int r0 = r6.f3662R
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f3662R
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f3666V
            int r0 = r0 - r13
            int r1 = r6.f3667W
            int r1 = r1 - r14
            int r2 = r6.f3661Q
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.f3668a0
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.f3668a0
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.f3661Q
            if (r0 != r9) goto L_0x01d0
            int[] r3 = r6.f3712x0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            int[] r4 = r6.f3708v0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo4032F(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.f3712x0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f3710w0
            r1 = r0[r8]
            int[] r2 = r6.f3708v0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.f3708v0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f3666V = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f3667W = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            boolean r1 = r6.mo4086e1(r1, r2, r7)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.e r1 = r6.f3682i0
            if (r1 == 0) goto L_0x01d0
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d0
        L_0x0169:
            r1.mo4675f(r6, r15, r0)
            goto L_0x01d0
        L_0x016d:
            android.view.VelocityTracker r0 = r6.f3663S
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f3663S
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f3672d0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.f3663S
            int r2 = r6.f3662R
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.f3663S
            int r3 = r6.f3662R
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = 0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo4063a0(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.m4829b1()
            r8 = 1
            goto L_0x01d0
        L_0x01af:
            int r0 = r7.getPointerId(r8)
            r6.f3662R = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3666V = r0
            r6.f3664T = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3667W = r0
            r6.f3665U = r0
            if (r11 == 0) goto L_0x01cd
            r10 = r10 | 2
        L_0x01cd:
            r6.mo4145q1(r10, r8)
        L_0x01d0:
            if (r8 != 0) goto L_0x01d7
            android.view.VelocityTracker r0 = r6.f3663S
            r0.addMovement(r12)
        L_0x01d7:
            r12.recycle()
            return r9
        L_0x01db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4142p(C1070d0 d0Var) {
        C1078l lVar = this.f3660P;
        return lVar == null || lVar.mo4302g(d0Var, d0Var.mo4239o());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo4143p1() {
        int i = this.f3713y + 1;
        this.f3713y = i;
        if (i == 1 && !this.f3644A) {
            this.f3715z = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo4144q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo4048P());
        }
        Resources resources = getContext().getResources();
        new C1130d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C2088b.fastscroll_default_thickness), resources.getDimensionPixelSize(C2088b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C2088b.fastscroll_margin));
    }

    /* renamed from: q1 */
    public boolean mo4145q1(int i, int i2) {
        return getScrollingChildHelper().mo2929p(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo4146r0() {
        this.f3659O = null;
        this.f3657M = null;
        this.f3658N = null;
        this.f3656L = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo4147r1(boolean z) {
        if (this.f3713y < 1) {
            this.f3713y = 1;
        }
        if (!z && !this.f3644A) {
            this.f3715z = false;
        }
        if (this.f3713y == 1) {
            if (z && this.f3715z && !this.f3644A && this.f3695p != null && this.f3693o != null) {
                mo4027B();
            }
            if (!this.f3644A) {
                this.f3715z = false;
            }
        }
        this.f3713y--;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1070d0 f0 = m4835f0(view);
        if (f0 != null) {
            if (f0.mo4249x()) {
                f0.mo4231f();
            } else if (!f0.mo4223J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f0 + mo4048P());
            }
        }
        view.clearAnimation();
        mo4192z(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3695p.mo4383e1(this, this.f3686k0, view, view2) && view2 != null) {
            m4827Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3695p.mo4415u1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3701s.size();
        for (int i = 0; i < size; i++) {
            this.f3701s.get(i).mo4438c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f3713y != 0 || this.f3644A) {
            this.f3715z = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4153s() {
        int j = this.f3679h.mo4619j();
        for (int i = 0; i < j; i++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i));
            if (!f0.mo4223J()) {
                f0.mo4228c();
            }
        }
        this.f3673e.mo4466d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean mo4154s0() {
        AccessibilityManager accessibilityManager = this.f3649E;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: s1 */
    public void mo4155s1(int i) {
        getScrollingChildHelper().mo2931r(i);
    }

    public void scrollBy(int i, int i2) {
        C1084o oVar = this.f3695p;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3644A) {
            boolean l = oVar.mo3995l();
            boolean m = this.f3695p.mo3996m();
            if (l || m) {
                if (!l) {
                    i = 0;
                }
                if (!m) {
                    i2 = 0;
                }
                mo4086e1(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4118j1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1148k kVar) {
        this.f3700r0 = kVar;
        C0735z.m3228r0(this, kVar);
    }

    public void setAdapter(C1073g gVar) {
        setLayoutFrozen(false);
        m4839h1(gVar, false, true);
        mo4047O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1076j jVar) {
        if (jVar != this.f3702s0) {
            this.f3702s0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3683j) {
            mo4146r0();
        }
        this.f3683j = z;
        super.setClipToPadding(z);
        if (this.f3711x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1077k kVar) {
        C0612h.m2670g(kVar);
        this.f3655K = kVar;
        mo4146r0();
    }

    public void setHasFixedSize(boolean z) {
        this.f3707v = z;
    }

    public void setItemAnimator(C1078l lVar) {
        C1078l lVar2 = this.f3660P;
        if (lVar2 != null) {
            lVar2.mo4306k();
            this.f3660P.mo4317v((C1078l.C1080b) null);
        }
        this.f3660P = lVar;
        if (lVar != null) {
            lVar.mo4317v(this.f3696p0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3673e.mo4458G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1084o oVar) {
        if (oVar != this.f3695p) {
            mo4183t1();
            if (this.f3695p != null) {
                C1078l lVar = this.f3660P;
                if (lVar != null) {
                    lVar.mo4306k();
                }
                this.f3695p.mo4401n1(this.f3673e);
                this.f3695p.mo4403o1(this.f3673e);
                this.f3673e.mo4465c();
                if (this.f3705u) {
                    this.f3695p.mo4330B(this, this.f3673e);
                }
                this.f3695p.mo4344H1((RecyclerView) null);
                this.f3695p = null;
            } else {
                this.f3673e.mo4465c();
            }
            this.f3679h.mo4623o();
            this.f3695p = oVar;
            if (oVar != null) {
                if (oVar.f3779b == null) {
                    oVar.mo4344H1(this);
                    if (this.f3705u) {
                        this.f3695p.mo4328A(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3779b.mo4048P());
                }
            }
            this.f3673e.mo4461K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2927m(z);
    }

    public void setOnFlingListener(C1091r rVar) {
        this.f3669b0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C1093t tVar) {
        this.f3688l0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3678g0 = z;
    }

    public void setRecycledViewPool(C1094u uVar) {
        this.f3673e.mo4456E(uVar);
    }

    public void setRecyclerListener(C1097w wVar) {
        this.f3697q = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f3661Q) {
            this.f3661Q = i;
            if (i != 2) {
                m4849u1();
            }
            mo4036H(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f3668a0 = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f3668a0 = i2;
    }

    public void setViewCacheExtension(C1066b0 b0Var) {
        this.f3673e.mo4457F(b0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2928o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2930q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f3644A) {
            mo4128o("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3644A = false;
                if (!(!this.f3715z || this.f3695p == null || this.f3693o == null)) {
                    requestLayout();
                }
                this.f3715z = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3644A = true;
            this.f3646B = true;
            mo4183t1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4181t(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3656L;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3656L.onRelease();
            z = this.f3656L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3658N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3658N.onRelease();
            z |= this.f3658N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3657M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3657M.onRelease();
            z |= this.f3657M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3659O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3659O.onRelease();
            z |= this.f3659O.isFinished();
        }
        if (z) {
            C0735z.m3210i0(this);
        }
    }

    /* renamed from: t0 */
    public boolean mo4182t0() {
        return this.f3653I > 0;
    }

    /* renamed from: t1 */
    public void mo4183t1() {
        setScrollState(0);
        m4849u1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4184u() {
        if (!this.f3711x || this.f3651G) {
            C0560k.m2546a("RV FullInvalidate");
            mo4027B();
            C0560k.m2547b();
        } else if (this.f3677g.mo4602p()) {
            if (this.f3677g.mo4601o(4) && !this.f3677g.mo4601o(11)) {
                C0560k.m2546a("RV PartialInvalidate");
                mo4143p1();
                mo4033F0();
                this.f3677g.mo4604s();
                if (!this.f3715z) {
                    if (m4843m0()) {
                        mo4027B();
                    } else {
                        this.f3677g.mo4596i();
                    }
                }
                mo4147r1(true);
                mo4035G0();
            } else if (this.f3677g.mo4602p()) {
                C0560k.m2546a("RV FullInvalidate");
                mo4027B();
            } else {
                return;
            }
            C0560k.m2547b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo4185v0(int i) {
        if (this.f3695p != null) {
            setScrollState(2);
            this.f3695p.mo3970A1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo4186v1(int i, int i2, Object obj) {
        int i3;
        int j = this.f3679h.mo4619j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f3679h.mo4618i(i5);
            C1070d0 f0 = m4835f0(i6);
            if (f0 != null && !f0.mo4223J() && (i3 = f0.f3747c) >= i && i3 < i4) {
                f0.mo4227b(2);
                f0.mo4226a(obj);
                ((C1089p) i6.getLayoutParams()).f3804c = true;
            }
        }
        this.f3673e.mo4463M(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4187w(int i, int i2) {
        setMeasuredDimension(C1084o.m5075o(i, getPaddingLeft() + getPaddingRight(), C0735z.m3164G(this)), C1084o.m5075o(i2, getPaddingTop() + getPaddingBottom(), C0735z.m3162F(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo4188w0() {
        int j = this.f3679h.mo4619j();
        for (int i = 0; i < j; i++) {
            ((C1089p) this.f3679h.mo4618i(i).getLayoutParams()).f3804c = true;
        }
        this.f3673e.mo4479s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo4189x0() {
        int j = this.f3679h.mo4619j();
        for (int i = 0; i < j; i++) {
            C1070d0 f0 = m4835f0(this.f3679h.mo4618i(i));
            if (f0 != null && !f0.mo4223J()) {
                f0.mo4227b(6);
            }
        }
        mo4188w0();
        this.f3673e.mo4480t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4190y(View view) {
        C1070d0 f0 = m4835f0(view);
        mo4030D0(view);
        C1073g gVar = this.f3693o;
        if (!(gVar == null || f0 == null)) {
            gVar.mo4286o(f0);
        }
        List<C1090q> list = this.f3650F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3650F.get(size).mo4433a(view);
            }
        }
    }

    /* renamed from: y0 */
    public void mo4191y0(int i) {
        int g = this.f3679h.mo4617g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3679h.mo4616f(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4192z(View view) {
        C1070d0 f0 = m4835f0(view);
        mo4031E0(view);
        C1073g gVar = this.f3693o;
        if (!(gVar == null || f0 == null)) {
            gVar.mo4287p(f0);
        }
        List<C1090q> list = this.f3650F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3650F.get(size).mo4434b(view);
            }
        }
    }

    /* renamed from: z0 */
    public void mo4193z0(int i) {
        int g = this.f3679h.mo4617g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3679h.mo4616f(i2).offsetTopAndBottom(i);
        }
    }
}
