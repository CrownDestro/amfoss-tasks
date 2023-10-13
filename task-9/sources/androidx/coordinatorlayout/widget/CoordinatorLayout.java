package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0469a;
import androidx.core.graphics.drawable.C0515a;
import androidx.core.util.C0606c;
import androidx.core.util.C0609e;
import androidx.core.util.C0611g;
import androidx.core.view.C0667e;
import androidx.core.view.C0701l0;
import androidx.core.view.C0725p;
import androidx.core.view.C0726q;
import androidx.core.view.C0728s;
import androidx.core.view.C0729t;
import androidx.core.view.C0735z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p106q.C2957a;
import p106q.C2958b;
import p106q.C2959c;
import p142w.C3433a;

public class CoordinatorLayout extends ViewGroup implements C0725p, C0726q {

    /* renamed from: A */
    static final Comparator<View> f2193A;

    /* renamed from: B */
    private static final C0609e<Rect> f2194B = new C0611g(12);

    /* renamed from: x */
    static final String f2195x;

    /* renamed from: y */
    static final Class<?>[] f2196y = {Context.class, AttributeSet.class};

    /* renamed from: z */
    static final ThreadLocal<Map<String, Constructor<C0431c>>> f2197z = new ThreadLocal<>();

    /* renamed from: d */
    private final List<View> f2198d;

    /* renamed from: e */
    private final C0439a<View> f2199e;

    /* renamed from: f */
    private final List<View> f2200f;

    /* renamed from: g */
    private final List<View> f2201g;

    /* renamed from: h */
    private Paint f2202h;

    /* renamed from: i */
    private final int[] f2203i;

    /* renamed from: j */
    private final int[] f2204j;

    /* renamed from: k */
    private boolean f2205k;

    /* renamed from: l */
    private boolean f2206l;

    /* renamed from: m */
    private int[] f2207m;

    /* renamed from: n */
    private View f2208n;

    /* renamed from: o */
    private View f2209o;

    /* renamed from: p */
    private C0435g f2210p;

    /* renamed from: q */
    private boolean f2211q;

    /* renamed from: r */
    private C0701l0 f2212r;

    /* renamed from: s */
    private boolean f2213s;

    /* renamed from: t */
    private Drawable f2214t;

    /* renamed from: u */
    ViewGroup.OnHierarchyChangeListener f2215u;

    /* renamed from: v */
    private C0729t f2216v;

    /* renamed from: w */
    private final C0728s f2217w;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0429a implements C0729t {
        C0429a() {
        }

        /* renamed from: a */
        public C0701l0 mo354a(View view, C0701l0 l0Var) {
            return CoordinatorLayout.this.mo2304W(l0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0430b {
        C0431c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0431c<V extends View> {
        public C0431c() {
        }

        public C0431c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo2349A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2378z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo2350B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo2351C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2350B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2352D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2353a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2356d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2354b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo2355c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo2356d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2357e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C0701l0 mo2358f(CoordinatorLayout coordinatorLayout, V v, C0701l0 l0Var) {
            return l0Var;
        }

        /* renamed from: g */
        public void mo2359g(C0434f fVar) {
        }

        /* renamed from: h */
        public boolean mo2360h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo2361i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo2362j() {
        }

        /* renamed from: k */
        public boolean mo2363k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2364l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2365m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo2366n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2367o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo2368p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2369q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2368p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo2370r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo2371s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2370r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo2372t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2371s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo2373u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo2374v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2373u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo2375w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo2376x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2377y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo2378z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0432d {
        Class<? extends C0431c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0433e implements ViewGroup.OnHierarchyChangeListener {
        C0433e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2215u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2299H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2215u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0434f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0431c f2220a;

        /* renamed from: b */
        boolean f2221b = false;

        /* renamed from: c */
        public int f2222c = 0;

        /* renamed from: d */
        public int f2223d = 0;

        /* renamed from: e */
        public int f2224e = -1;

        /* renamed from: f */
        int f2225f = -1;

        /* renamed from: g */
        public int f2226g = 0;

        /* renamed from: h */
        public int f2227h = 0;

        /* renamed from: i */
        int f2228i;

        /* renamed from: j */
        int f2229j;

        /* renamed from: k */
        View f2230k;

        /* renamed from: l */
        View f2231l;

        /* renamed from: m */
        private boolean f2232m;

        /* renamed from: n */
        private boolean f2233n;

        /* renamed from: o */
        private boolean f2234o;

        /* renamed from: p */
        private boolean f2235p;

        /* renamed from: q */
        final Rect f2236q = new Rect();

        /* renamed from: r */
        Object f2237r;

        public C0434f(int i, int i2) {
            super(i, i2);
        }

        C0434f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2959c.f9742e);
            this.f2222c = obtainStyledAttributes.getInteger(C2959c.f9743f, 0);
            this.f2225f = obtainStyledAttributes.getResourceId(C2959c.f9744g, -1);
            this.f2223d = obtainStyledAttributes.getInteger(C2959c.f9745h, 0);
            this.f2224e = obtainStyledAttributes.getInteger(C2959c.f9749l, -1);
            this.f2226g = obtainStyledAttributes.getInt(C2959c.f9748k, 0);
            this.f2227h = obtainStyledAttributes.getInt(C2959c.f9747j, 0);
            int i = C2959c.f9746i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f2221b = hasValue;
            if (hasValue) {
                this.f2220a = CoordinatorLayout.m1995K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            C0431c cVar = this.f2220a;
            if (cVar != null) {
                cVar.mo2359g(this);
            }
        }

        public C0434f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0434f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0434f(C0434f fVar) {
            super(fVar);
        }

        /* renamed from: n */
        private void m2071n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2225f);
            this.f2230k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2231l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2225f) + " to anchor view " + view);
            }
            this.f2231l = null;
            this.f2230k = null;
        }

        /* renamed from: s */
        private boolean m2072s(View view, int i) {
            int b = C0667e.m2884b(((C0434f) view.getLayoutParams()).f2226g, i);
            return b != 0 && (C0667e.m2884b(this.f2227h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m2073t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2230k.getId() != this.f2225f) {
                return false;
            }
            View view2 = this.f2230k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2231l = null;
                    this.f2230k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2231l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2382a() {
            return this.f2230k == null && this.f2225f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f2220a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2383b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f2231l
                if (r4 == r0) goto L_0x001b
                int r0 = androidx.core.view.C0735z.m3160E(r2)
                boolean r0 = r1.m2072s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2220a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo2357e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0434f.mo2383b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2384c() {
            if (this.f2220a == null) {
                this.f2232m = false;
            }
            return this.f2232m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo2385d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2225f == -1) {
                this.f2231l = null;
                this.f2230k = null;
                return null;
            }
            if (this.f2230k == null || !m2073t(view, coordinatorLayout)) {
                m2071n(view, coordinatorLayout);
            }
            return this.f2230k;
        }

        /* renamed from: e */
        public int mo2386e() {
            return this.f2225f;
        }

        /* renamed from: f */
        public C0431c mo2387f() {
            return this.f2220a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo2388g() {
            return this.f2235p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo2389h() {
            return this.f2236q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo2390i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2232m;
            if (z) {
                return true;
            }
            C0431c cVar = this.f2220a;
            boolean a = (cVar != null ? cVar.mo2353a(coordinatorLayout, view) : false) | z;
            this.f2232m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo2391j(int i) {
            if (i == 0) {
                return this.f2233n;
            }
            if (i != 1) {
                return false;
            }
            return this.f2234o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo2392k() {
            this.f2235p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2393l(int i) {
            mo2398r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo2394m() {
            this.f2232m = false;
        }

        /* renamed from: o */
        public void mo2395o(C0431c cVar) {
            C0431c cVar2 = this.f2220a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2362j();
                }
                this.f2220a = cVar;
                this.f2237r = null;
                this.f2221b = true;
                if (cVar != null) {
                    cVar.mo2359g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo2396p(boolean z) {
            this.f2235p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2397q(Rect rect) {
            this.f2236q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2398r(int i, boolean z) {
            if (i == 0) {
                this.f2233n = z;
            } else if (i == 1) {
                this.f2234o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0435g implements ViewTreeObserver.OnPreDrawListener {
        C0435g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2299H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0436h extends C3433a {
        public static final Parcelable.Creator<C0436h> CREATOR = new C0437a();

        /* renamed from: f */
        SparseArray<Parcelable> f2239f;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0437a implements Parcelable.ClassLoaderCreator<C0436h> {
            C0437a() {
            }

            /* renamed from: a */
            public C0436h createFromParcel(Parcel parcel) {
                return new C0436h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0436h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0436h(parcel, classLoader);
            }

            /* renamed from: c */
            public C0436h[] newArray(int i) {
                return new C0436h[i];
            }
        }

        public C0436h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2239f = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2239f.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0436h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2239f;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2239f.keyAt(i2);
                parcelableArr[i2] = this.f2239f.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0438i implements Comparator<View> {
        C0438i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float O = C0735z.m3180O(view);
            float O2 = C0735z.m3180O(view2);
            if (O > O2) {
                return -1;
            }
            return O < O2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f2195x = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f2193A = r0
            goto L_0x0021
        L_0x001f:
            f2193A = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f2196y = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f2197z = r0
            androidx.core.util.g r0 = new androidx.core.util.g
            r1 = 12
            r0.<init>(r1)
            f2194B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2957a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2198d = new ArrayList();
        this.f2199e = new C0439a<>();
        this.f2200f = new ArrayList();
        this.f2201g = new ArrayList();
        this.f2203i = new int[2];
        this.f2204j = new int[2];
        this.f2217w = new C0728s(this);
        int[] iArr = C2959c.f9739b;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C2958b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C2959c.f9739b;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C2958b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C2959c.f9740c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2207m = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2207m.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f2207m;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f2214t = obtainStyledAttributes.getDrawable(C2959c.f9741d);
        obtainStyledAttributes.recycle();
        m2005X();
        super.setOnHierarchyChangeListener(new C0433e());
        if (C0735z.m3156C(this) == 0) {
            C0735z.m3155B0(this, 1);
        }
    }

    /* renamed from: A */
    private boolean m1990A(View view) {
        return this.f2199e.mo2415j(view);
    }

    /* renamed from: C */
    private void m1991C(View view, int i) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        Rect a = m2006a();
        a.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f2212r != null && C0735z.m3154B(this) && !C0735z.m3154B(view)) {
            a.left += this.f2212r.mo2861i();
            a.top += this.f2212r.mo2863k();
            a.right -= this.f2212r.mo2862j();
            a.bottom -= this.f2212r.mo2859h();
        }
        Rect a2 = m2006a();
        C0667e.m2883a(m2001S(fVar.f2222c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m1998O(a);
        m1998O(a2);
    }

    /* renamed from: D */
    private void m1992D(View view, View view2, int i) {
        Rect a = m2006a();
        Rect a2 = m2006a();
        try {
            mo2343t(view2, a);
            mo2344u(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m1998O(a);
            m1998O(a2);
        }
    }

    /* renamed from: E */
    private void m1993E(View view, int i, int i2) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        int b = C0667e.m2884b(m2002T(fVar.f2222c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int w = m2011w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            w += measuredWidth / 2;
        } else if (i3 == 5) {
            w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    private void m1994F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C0735z.m3188V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0434f fVar = (C0434f) view.getLayoutParams();
            C0431c f = fVar.mo2387f();
            Rect a = m2006a();
            Rect a2 = m2006a();
            a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo2354b(this, view, a)) {
                a.set(a2);
            } else if (!a2.contains(a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a.toShortString() + " | Bounds:" + a2.toShortString());
            }
            m1998O(a2);
            if (a.isEmpty()) {
                m1998O(a);
                return;
            }
            int b = C0667e.m2884b(fVar.f2227h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (a.top - fVar.topMargin) - fVar.f2229j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m2004V(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - a.bottom) - fVar.bottomMargin) + fVar.f2229j) < (i5 = rect.bottom)) {
                m2004V(view, height - i5);
                z = true;
            }
            if (!z) {
                m2004V(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (a.left - fVar.leftMargin) - fVar.f2228i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m2003U(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - a.right) - fVar.rightMargin) + fVar.f2228i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m2003U(view, width - i2);
            }
            if (!z3) {
                m2003U(view, 0);
            }
            m1998O(a);
        }
    }

    /* renamed from: K */
    static C0431c m1995K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2195x;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<C0431c>>> threadLocal = f2197z;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2196y);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0431c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: L */
    private boolean m1996L(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2200f;
        m2012z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0434f fVar = (C0434f) view.getLayoutParams();
            C0431c f = fVar.mo2387f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo2363k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo2352D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f2208n = view;
                    }
                }
                boolean c = fVar.mo2384c();
                boolean i4 = fVar.mo2390i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo2363k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo2352D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m1997M() {
        this.f2198d.clear();
        this.f2199e.mo2410c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0434f y = mo2347y(childAt);
            y.mo2385d(this, childAt);
            this.f2199e.mo2409b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (y.mo2383b(this, childAt, childAt2)) {
                        if (!this.f2199e.mo2411d(childAt2)) {
                            this.f2199e.mo2409b(childAt2);
                        }
                        this.f2199e.mo2408a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2198d.addAll(this.f2199e.mo2414i());
        Collections.reverse(this.f2198d);
    }

    /* renamed from: O */
    private static void m1998O(Rect rect) {
        rect.setEmpty();
        f2194B.mo2663a(rect);
    }

    /* renamed from: Q */
    private void m1999Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0431c f = ((C0434f) childAt.getLayoutParams()).mo2387f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo2363k(this, childAt, obtain);
                } else {
                    f.mo2352D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0434f) getChildAt(i2).getLayoutParams()).mo2394m();
        }
        this.f2208n = null;
        this.f2205k = false;
    }

    /* renamed from: R */
    private static int m2000R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m2001S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m2002T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m2003U(View view, int i) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        int i2 = fVar.f2228i;
        if (i2 != i) {
            C0735z.m3196b0(view, i - i2);
            fVar.f2228i = i;
        }
    }

    /* renamed from: V */
    private void m2004V(View view, int i) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        int i2 = fVar.f2229j;
        if (i2 != i) {
            C0735z.m3198c0(view, i - i2);
            fVar.f2229j = i;
        }
    }

    /* renamed from: X */
    private void m2005X() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0735z.m3154B(this)) {
                if (this.f2216v == null) {
                    this.f2216v = new C0429a();
                }
                C0735z.m3161E0(this, this.f2216v);
                setSystemUiVisibility(1280);
                return;
            }
            C0735z.m3161E0(this, (C0729t) null);
        }
    }

    /* renamed from: a */
    private static Rect m2006a() {
        Rect b = f2194B.mo2664b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: d */
    private static int m2007d(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: e */
    private void m2008e(C0434f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: f */
    private C0701l0 m2009f(C0701l0 l0Var) {
        C0431c f;
        if (l0Var.mo2865n()) {
            return l0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0735z.m3154B(childAt) && (f = ((C0434f) childAt.getLayoutParams()).mo2387f()) != null) {
                l0Var = f.mo2358f(this, childAt, l0Var);
                if (l0Var.mo2865n()) {
                    break;
                }
            }
        }
        return l0Var;
    }

    /* renamed from: v */
    private void m2010v(View view, int i, Rect rect, Rect rect2, C0434f fVar, int i2, int i3) {
        int b = C0667e.m2884b(m2000R(fVar.f2222c), i);
        int b2 = C0667e.m2884b(m2001S(fVar.f2223d), i);
        int i4 = b & 7;
        int i5 = b & 112;
        int i6 = b2 & 7;
        int i7 = b2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: w */
    private int m2011w(int i) {
        StringBuilder sb;
        int[] iArr = this.f2207m;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: z */
    private void m2012z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f2193A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean mo2297B(View view, int i, int i2) {
        Rect a = m2006a();
        mo2343t(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m1998O(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo2298G(View view, int i) {
        C0431c f;
        View view2 = view;
        C0434f fVar = (C0434f) view.getLayoutParams();
        if (fVar.f2230k != null) {
            Rect a = m2006a();
            Rect a2 = m2006a();
            Rect a3 = m2006a();
            mo2343t(fVar.f2230k, a);
            boolean z = false;
            mo2332q(view2, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2010v(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m2008e(fVar, a3, measuredWidth, i2);
            int i3 = a3.left - a2.left;
            int i4 = a3.top - a2.top;
            if (i3 != 0) {
                C0735z.m3196b0(view2, i3);
            }
            if (i4 != 0) {
                C0735z.m3198c0(view2, i4);
            }
            if (z && (f = fVar.mo2387f()) != null) {
                f.mo2360h(this, view2, fVar.f2230k);
            }
            m1998O(a);
            m1998O(a2);
            m1998O(a3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo2299H(int i) {
        boolean z;
        int i2 = i;
        int E = C0735z.m3160E(this);
        int size = this.f2198d.size();
        Rect a = m2006a();
        Rect a2 = m2006a();
        Rect a3 = m2006a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f2198d.get(i3);
            C0434f fVar = (C0434f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f2231l == this.f2198d.get(i4)) {
                        mo2298G(view, E);
                    }
                }
                mo2332q(view, true, a2);
                if (fVar.f2226g != 0 && !a2.isEmpty()) {
                    int b = C0667e.m2884b(fVar.f2226g, E);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i5 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i6 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f2227h != 0 && view.getVisibility() == 0) {
                    m1994F(view, a, E);
                }
                if (i2 != 2) {
                    mo2346x(view, a3);
                    if (!a3.equals(a2)) {
                        mo2302N(view, a2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f2198d.get(i7);
                    C0434f fVar2 = (C0434f) view2.getLayoutParams();
                    C0431c f = fVar2.mo2387f();
                    if (f != null && f.mo2357e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2388g()) {
                            if (i2 != 2) {
                                z = f.mo2360h(this, view2, view);
                            } else {
                                f.mo2361i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2396p(z);
                            }
                        } else {
                            fVar2.mo2392k();
                        }
                    }
                }
            }
        }
        m1998O(a);
        m1998O(a2);
        m1998O(a3);
    }

    /* renamed from: I */
    public void mo2300I(View view, int i) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        if (!fVar.mo2382a()) {
            View view2 = fVar.f2230k;
            if (view2 != null) {
                m1992D(view, view2, i);
                return;
            }
            int i2 = fVar.f2224e;
            if (i2 >= 0) {
                m1993E(view, i2, i);
            } else {
                m1991C(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: J */
    public void mo2301J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo2302N(View view, Rect rect) {
        ((C0434f) view.getLayoutParams()).mo2397q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo2303P() {
        if (this.f2206l && this.f2210p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2210p);
        }
        this.f2211q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final C0701l0 mo2304W(C0701l0 l0Var) {
        if (C0606c.m2652a(this.f2212r, l0Var)) {
            return l0Var;
        }
        this.f2212r = l0Var;
        boolean z = true;
        boolean z2 = l0Var != null && l0Var.mo2863k() > 0;
        this.f2213s = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0701l0 f = m2009f(l0Var);
        requestLayout();
        return f;
    }

    /* renamed from: b */
    public void mo1009b(View view, View view2, int i, int i2) {
        C0431c f;
        this.f2217w.mo2934c(view, view2, i, i2);
        this.f2209o = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0434f fVar = (C0434f) childAt.getLayoutParams();
            if (fVar.mo2391j(i2) && (f = fVar.mo2387f()) != null) {
                f.mo2374v(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2305c() {
        if (this.f2206l) {
            if (this.f2210p == null) {
                this.f2210p = new C0435g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2210p);
        }
        this.f2211q = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0434f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        C0431c cVar = fVar.f2220a;
        if (cVar != null) {
            float d = cVar.mo2356d(this, view);
            if (d > 0.0f) {
                if (this.f2202h == null) {
                    this.f2202h = new Paint();
                }
                this.f2202h.setColor(fVar.f2220a.mo2355c(this, view));
                this.f2202h.setAlpha(m2007d(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2202h);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2214t;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: g */
    public void mo2309g(View view) {
        List g = this.f2199e.mo2412g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C0431c f = ((C0434f) view2.getLayoutParams()).mo2387f();
                if (f != null) {
                    f.mo2360h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m1997M();
        return Collections.unmodifiableList(this.f2198d);
    }

    public final C0701l0 getLastWindowInsets() {
        return this.f2212r;
    }

    public int getNestedScrollAxes() {
        return this.f2217w.mo2932a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2214t;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2319h() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1990A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2211q) {
            return;
        }
        if (z) {
            mo2305c();
        } else {
            mo2303P();
        }
    }

    /* renamed from: i */
    public void mo1025i(View view, int i) {
        this.f2217w.mo2935d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0434f fVar = (C0434f) childAt.getLayoutParams();
            if (fVar.mo2391j(i)) {
                C0431c f = fVar.mo2387f();
                if (f != null) {
                    f.mo2351C(this, childAt, view, i);
                }
                fVar.mo2393l(i);
                fVar.mo2392k();
            }
        }
        this.f2209o = null;
    }

    /* renamed from: j */
    public void mo1026j(View view, int i, int i2, int[] iArr, int i3) {
        C0431c f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0434f fVar = (C0434f) childAt.getLayoutParams();
                if (fVar.mo2391j(i3) && (f = fVar.mo2387f()) != null) {
                    int[] iArr2 = this.f2203i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2369q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2203i;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f2203i;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo2299H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0434f generateDefaultLayoutParams() {
        return new C0434f(-2, -2);
    }

    /* renamed from: l */
    public C0434f generateLayoutParams(AttributeSet attributeSet) {
        return new C0434f(getContext(), attributeSet);
    }

    /* renamed from: m */
    public void mo1029m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0431c f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0434f fVar = (C0434f) childAt.getLayoutParams();
                if (fVar.mo2391j(i5) && (f = fVar.mo2387f()) != null) {
                    int[] iArr2 = this.f2203i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2372t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2203i;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f2203i[1]) : Math.min(i7, this.f2203i[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo2299H(1);
        }
    }

    /* renamed from: n */
    public void mo1030n(View view, int i, int i2, int i3, int i4, int i5) {
        mo1029m(view, i, i2, i3, i4, 0, this.f2204j);
    }

    /* renamed from: o */
    public boolean mo1031o(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0434f fVar = (C0434f) childAt.getLayoutParams();
                C0431c f = fVar.mo2387f();
                if (f != null) {
                    boolean A = f.mo2349A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo2398r(i3, A);
                } else {
                    fVar.mo2398r(i3, false);
                }
            }
            i4++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1999Q(false);
        if (this.f2211q) {
            if (this.f2210p == null) {
                this.f2210p = new C0435g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2210p);
        }
        if (this.f2212r == null && C0735z.m3154B(this)) {
            C0735z.m3222o0(this);
        }
        this.f2206l = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1999Q(false);
        if (this.f2211q && this.f2210p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2210p);
        }
        View view = this.f2209o;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2206l = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2213s && this.f2214t != null) {
            C0701l0 l0Var = this.f2212r;
            int k = l0Var != null ? l0Var.mo2863k() : 0;
            if (k > 0) {
                this.f2214t.setBounds(0, 0, getWidth(), k);
                this.f2214t.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1999Q(true);
        }
        boolean L = m1996L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1999Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0431c f;
        int E = C0735z.m3160E(this);
        int size = this.f2198d.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2198d.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0434f) view.getLayoutParams()).mo2387f()) == null || !f.mo2364l(this, view, E))) {
                mo2300I(view, E);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2365m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m1997M()
            r30.mo2319h()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.C0735z.m3160E(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.l0 r3 = r7.f2212r
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.C0735z.m3154B(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2198d
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f2198d
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0434f) r1
            int r0 = r1.f2224e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m2011w(r0)
            int r11 = r1.f2222c
            int r11 = m2002T(r11)
            int r11 = androidx.core.view.C0667e.m2884b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.C0735z.m3154B(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.l0 r0 = r7.f2212r
            int r0 = r0.mo2861i()
            androidx.core.view.l0 r2 = r7.f2212r
            int r2 = r2.mo2862j()
            int r0 = r0 + r2
            androidx.core.view.l0 r2 = r7.f2212r
            int r2 = r2.mo2863k()
            androidx.core.view.l0 r11 = r7.f2212r
            int r11 = r11.mo2859h()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2387f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2365m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2301J(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0431c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0434f fVar = (C0434f) childAt.getLayoutParams();
                if (fVar.mo2391j(0) && (f3 = fVar.mo2387f()) != null) {
                    z2 |= f3.mo2366n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2299H(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0431c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0434f fVar = (C0434f) childAt.getLayoutParams();
                if (fVar.mo2391j(0) && (f3 = fVar.mo2387f()) != null) {
                    z |= f3.mo2367o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1026j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1030n(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1009b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0436h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0436h hVar = (C0436h) parcelable;
        super.onRestoreInstanceState(hVar.mo11323a());
        SparseArray<Parcelable> sparseArray = hVar.f2239f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0431c f = mo2347y(childAt).mo2387f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo2376x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        C0436h hVar = new C0436h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0431c f = ((C0434f) childAt.getLayoutParams()).mo2387f();
            if (!(id == -1 || f == null || (y = f.mo2377y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        hVar.f2239f = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1031o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1025i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2208n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1996L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2208n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0434f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2387f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2208n
            boolean r6 = r6.mo2352D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2208n
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1999Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0434f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0434f ? new C0434f((C0434f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0434f((ViewGroup.MarginLayoutParams) layoutParams) : new C0434f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2332q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2343t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> mo2333r(View view) {
        List<View> h = this.f2199e.mo2413h(view);
        this.f2201g.clear();
        if (h != null) {
            this.f2201g.addAll(h);
        }
        return this.f2201g;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0431c f = ((C0434f) view.getLayoutParams()).mo2387f();
        if (f == null || !f.mo2375w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2205k) {
            m1999Q(false);
            this.f2205k = true;
        }
    }

    /* renamed from: s */
    public List<View> mo2336s(View view) {
        List g = this.f2199e.mo2412g(view);
        this.f2201g.clear();
        if (g != null) {
            this.f2201g.addAll(g);
        }
        return this.f2201g;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2005X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2215u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2214t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2214t = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2214t.setState(getDrawableState());
                }
                C0515a.m2372m(this.f2214t, C0735z.m3160E(this));
                this.f2214t.setVisible(getVisibility() == 0, false);
                this.f2214t.setCallback(this);
            }
            C0735z.m3210i0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0469a.m2174d(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2214t;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2214t.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2343t(View view, Rect rect) {
        C0440b.m2106a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2344u(View view, int i, Rect rect, Rect rect2) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2010v(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m2008e(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2214t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2346x(View view, Rect rect) {
        rect.set(((C0434f) view.getLayoutParams()).mo2389h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C0434f mo2347y(View view) {
        C0434f fVar = (C0434f) view.getLayoutParams();
        if (!fVar.f2221b) {
            if (view instanceof C0430b) {
                C0431c behavior = ((C0430b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo2395o(behavior);
            } else {
                C0432d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0432d) cls.getAnnotation(C0432d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2395o((C0431c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f2221b = true;
        }
        return fVar;
    }
}
