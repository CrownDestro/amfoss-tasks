package p030e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0515a;

/* renamed from: e.b */
public class C1754b extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private C1758d f6549d;

    /* renamed from: e */
    private Rect f6550e;

    /* renamed from: f */
    private Drawable f6551f;

    /* renamed from: g */
    private Drawable f6552g;

    /* renamed from: h */
    private int f6553h = 255;

    /* renamed from: i */
    private boolean f6554i;

    /* renamed from: j */
    private int f6555j = -1;

    /* renamed from: k */
    private boolean f6556k;

    /* renamed from: l */
    private Runnable f6557l;

    /* renamed from: m */
    private long f6558m;

    /* renamed from: n */
    private long f6559n;

    /* renamed from: o */
    private C1757c f6560o;

    /* renamed from: e.b$a */
    class C1755a implements Runnable {
        C1755a() {
        }

        public void run() {
            C1754b.this.mo7353a(true);
            C1754b.this.invalidateSelf();
        }
    }

    /* renamed from: e.b$b */
    private static class C1756b {
        /* renamed from: a */
        public static boolean m8727a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m8728b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m8729c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: e.b$c */
    static class C1757c implements Drawable.Callback {

        /* renamed from: d */
        private Drawable.Callback f6562d;

        C1757c() {
        }

        /* renamed from: a */
        public Drawable.Callback mo7389a() {
            Drawable.Callback callback = this.f6562d;
            this.f6562d = null;
            return callback;
        }

        /* renamed from: b */
        public C1757c mo7390b(Drawable.Callback callback) {
            this.f6562d = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f6562d;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f6562d;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: e.b$d */
    static abstract class C1758d extends Drawable.ConstantState {

        /* renamed from: A */
        int f6563A = 0;

        /* renamed from: B */
        int f6564B = 0;

        /* renamed from: C */
        boolean f6565C;

        /* renamed from: D */
        ColorFilter f6566D;

        /* renamed from: E */
        boolean f6567E;

        /* renamed from: F */
        ColorStateList f6568F;

        /* renamed from: G */
        PorterDuff.Mode f6569G;

        /* renamed from: H */
        boolean f6570H;

        /* renamed from: I */
        boolean f6571I;

        /* renamed from: a */
        final C1754b f6572a;

        /* renamed from: b */
        Resources f6573b;

        /* renamed from: c */
        int f6574c;

        /* renamed from: d */
        int f6575d;

        /* renamed from: e */
        int f6576e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f6577f;

        /* renamed from: g */
        Drawable[] f6578g;

        /* renamed from: h */
        int f6579h;

        /* renamed from: i */
        boolean f6580i = false;

        /* renamed from: j */
        boolean f6581j;

        /* renamed from: k */
        Rect f6582k;

        /* renamed from: l */
        boolean f6583l = false;

        /* renamed from: m */
        boolean f6584m;

        /* renamed from: n */
        int f6585n;

        /* renamed from: o */
        int f6586o;

        /* renamed from: p */
        int f6587p;

        /* renamed from: q */
        int f6588q;

        /* renamed from: r */
        boolean f6589r;

        /* renamed from: s */
        int f6590s;

        /* renamed from: t */
        boolean f6591t;

        /* renamed from: u */
        boolean f6592u;

        /* renamed from: v */
        boolean f6593v;

        /* renamed from: w */
        boolean f6594w;

        /* renamed from: x */
        boolean f6595x = true;

        /* renamed from: y */
        boolean f6596y;

        /* renamed from: z */
        int f6597z;

        C1758d(C1758d dVar, C1754b bVar, Resources resources) {
            this.f6572a = bVar;
            Rect rect = null;
            this.f6573b = resources != null ? resources : dVar != null ? dVar.f6573b : null;
            int f = C1754b.m8720f(resources, dVar != null ? dVar.f6574c : 0);
            this.f6574c = f;
            if (dVar != null) {
                this.f6575d = dVar.f6575d;
                this.f6576e = dVar.f6576e;
                this.f6593v = true;
                this.f6594w = true;
                this.f6580i = dVar.f6580i;
                this.f6583l = dVar.f6583l;
                this.f6595x = dVar.f6595x;
                this.f6596y = dVar.f6596y;
                this.f6597z = dVar.f6597z;
                this.f6563A = dVar.f6563A;
                this.f6564B = dVar.f6564B;
                this.f6565C = dVar.f6565C;
                this.f6566D = dVar.f6566D;
                this.f6567E = dVar.f6567E;
                this.f6568F = dVar.f6568F;
                this.f6569G = dVar.f6569G;
                this.f6570H = dVar.f6570H;
                this.f6571I = dVar.f6571I;
                if (dVar.f6574c == f) {
                    if (dVar.f6581j) {
                        this.f6582k = dVar.f6582k != null ? new Rect(dVar.f6582k) : rect;
                        this.f6581j = true;
                    }
                    if (dVar.f6584m) {
                        this.f6585n = dVar.f6585n;
                        this.f6586o = dVar.f6586o;
                        this.f6587p = dVar.f6587p;
                        this.f6588q = dVar.f6588q;
                        this.f6584m = true;
                    }
                }
                if (dVar.f6589r) {
                    this.f6590s = dVar.f6590s;
                    this.f6589r = true;
                }
                if (dVar.f6591t) {
                    this.f6592u = dVar.f6592u;
                    this.f6591t = true;
                }
                Drawable[] drawableArr = dVar.f6578g;
                this.f6578g = new Drawable[drawableArr.length];
                this.f6579h = dVar.f6579h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f6577f;
                this.f6577f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f6579h);
                int i = this.f6579h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f6577f.put(i2, constantState);
                        } else {
                            this.f6578g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f6578g = new Drawable[10];
            this.f6579h = 0;
        }

        /* renamed from: e */
        private void m8732e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f6577f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f6578g[this.f6577f.keyAt(i)] = m8733s(this.f6577f.valueAt(i).newDrawable(this.f6573b));
                }
                this.f6577f = null;
            }
        }

        /* renamed from: s */
        private Drawable m8733s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0515a.m2372m(drawable, this.f6597z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f6572a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo7394a(Drawable drawable) {
            int i = this.f6579h;
            if (i >= this.f6578g.length) {
                mo7409o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f6572a);
            this.f6578g[i] = drawable;
            this.f6579h++;
            this.f6576e = drawable.getChangingConfigurations() | this.f6576e;
            mo7410p();
            this.f6582k = null;
            this.f6581j = false;
            this.f6584m = false;
            this.f6593v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo7395b(Resources.Theme theme) {
            if (theme != null) {
                m8732e();
                int i = this.f6579h;
                Drawable[] drawableArr = this.f6578g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && C0515a.m2361b(drawableArr[i2])) {
                        C0515a.m2360a(drawableArr[i2], theme);
                        this.f6576e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo7417y(C1756b.m8729c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo7396c() {
            if (this.f6593v) {
                return this.f6594w;
            }
            m8732e();
            this.f6593v = true;
            int i = this.f6579h;
            Drawable[] drawableArr = this.f6578g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f6594w = false;
                    return false;
                }
            }
            this.f6594w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f6579h;
            Drawable[] drawableArr = this.f6578g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f6577f.get(i2);
                    if (constantState != null && C1756b.m8727a(constantState)) {
                        return true;
                    }
                } else if (C0515a.m2361b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo7398d() {
            this.f6584m = true;
            m8732e();
            int i = this.f6579h;
            Drawable[] drawableArr = this.f6578g;
            this.f6586o = -1;
            this.f6585n = -1;
            this.f6588q = 0;
            this.f6587p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f6585n) {
                    this.f6585n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f6586o) {
                    this.f6586o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f6587p) {
                    this.f6587p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f6588q) {
                    this.f6588q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo7399f() {
            return this.f6578g.length;
        }

        /* renamed from: g */
        public final Drawable mo7400g(int i) {
            int indexOfKey;
            Drawable drawable = this.f6578g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f6577f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m8733s(this.f6577f.valueAt(indexOfKey).newDrawable(this.f6573b));
            this.f6578g[i] = s;
            this.f6577f.removeAt(indexOfKey);
            if (this.f6577f.size() == 0) {
                this.f6577f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f6575d | this.f6576e;
        }

        /* renamed from: h */
        public final int mo7402h() {
            return this.f6579h;
        }

        /* renamed from: i */
        public final int mo7403i() {
            if (!this.f6584m) {
                mo7398d();
            }
            return this.f6586o;
        }

        /* renamed from: j */
        public final int mo7404j() {
            if (!this.f6584m) {
                mo7398d();
            }
            return this.f6588q;
        }

        /* renamed from: k */
        public final int mo7405k() {
            if (!this.f6584m) {
                mo7398d();
            }
            return this.f6587p;
        }

        /* renamed from: l */
        public final Rect mo7406l() {
            Rect rect = null;
            if (this.f6580i) {
                return null;
            }
            Rect rect2 = this.f6582k;
            if (rect2 != null || this.f6581j) {
                return rect2;
            }
            m8732e();
            Rect rect3 = new Rect();
            int i = this.f6579h;
            Drawable[] drawableArr = this.f6578g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f6581j = true;
            this.f6582k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo7407m() {
            if (!this.f6584m) {
                mo7398d();
            }
            return this.f6585n;
        }

        /* renamed from: n */
        public final int mo7408n() {
            if (this.f6589r) {
                return this.f6590s;
            }
            m8732e();
            int i = this.f6579h;
            Drawable[] drawableArr = this.f6578g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f6590s = opacity;
            this.f6589r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo7409o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f6578g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f6578g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo7410p() {
            this.f6589r = false;
            this.f6591t = false;
        }

        /* renamed from: q */
        public final boolean mo7411q() {
            return this.f6583l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo7347r();

        /* renamed from: t */
        public final void mo7412t(boolean z) {
            this.f6583l = z;
        }

        /* renamed from: u */
        public final void mo7413u(int i) {
            this.f6563A = i;
        }

        /* renamed from: v */
        public final void mo7414v(int i) {
            this.f6564B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo7415w(int i, int i2) {
            int i3 = this.f6579h;
            Drawable[] drawableArr = this.f6578g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m = Build.VERSION.SDK_INT >= 23 ? C0515a.m2372m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f6597z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo7416x(boolean z) {
            this.f6580i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo7417y(Resources resources) {
            if (resources != null) {
                this.f6573b = resources;
                int f = C1754b.m8720f(resources, this.f6574c);
                int i = this.f6574c;
                this.f6574c = f;
                if (i != f) {
                    this.f6584m = false;
                    this.f6581j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m8718d(Drawable drawable) {
        if (this.f6560o == null) {
            this.f6560o = new C1757c();
        }
        drawable.setCallback(this.f6560o.mo7390b(drawable.getCallback()));
        try {
            if (this.f6549d.f6563A <= 0 && this.f6554i) {
                drawable.setAlpha(this.f6553h);
            }
            C1758d dVar = this.f6549d;
            if (dVar.f6567E) {
                drawable.setColorFilter(dVar.f6566D);
            } else {
                if (dVar.f6570H) {
                    C0515a.m2374o(drawable, dVar.f6568F);
                }
                C1758d dVar2 = this.f6549d;
                if (dVar2.f6571I) {
                    C0515a.m2375p(drawable, dVar2.f6569G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f6549d.f6595x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                C0515a.m2372m(drawable, C0515a.m2365f(this));
            }
            C0515a.m2369j(drawable, this.f6549d.f6565C);
            Rect rect = this.f6550e;
            if (i >= 21 && rect != null) {
                C0515a.m2371l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f6560o.mo7389a());
        }
    }

    /* renamed from: e */
    private boolean m8719e() {
        return isAutoMirrored() && C0515a.m2365f(this) == 1;
    }

    /* renamed from: f */
    static int m8720f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7353a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f6554i = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6551f
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f6558m
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f6553h
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.b$d r9 = r13.f6549d
            int r9 = r9.f6563A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f6553h
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f6558m = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f6552g
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f6559n
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f6552g = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.b$d r4 = r13.f6549d
            int r4 = r4.f6564B
            int r3 = r3 / r4
            int r4 = r13.f6553h
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f6559n = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f6557l
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030e.C1754b.mo7353a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f6549d.mo7395b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1758d mo7326b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo7355c() {
        return this.f6555j;
    }

    public boolean canApplyTheme() {
        return this.f6549d.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f6552g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7358g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6555j
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.b$d r0 = r9.f6549d
            int r0 = r0.f6564B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f6552g
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f6551f
            if (r0 == 0) goto L_0x0029
            r9.f6552g = r0
            e.b$d r0 = r9.f6549d
            int r0 = r0.f6564B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f6559n = r0
            goto L_0x0035
        L_0x0029:
            r9.f6552g = r4
            r9.f6559n = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f6551f
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.b$d r0 = r9.f6549d
            int r1 = r0.f6579h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo7400g(r10)
            r9.f6551f = r0
            r9.f6555j = r10
            if (r0 == 0) goto L_0x005a
            e.b$d r10 = r9.f6549d
            int r10 = r10.f6563A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6558m = r2
        L_0x0051:
            r9.m8718d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f6551f = r4
            r10 = -1
            r9.f6555j = r10
        L_0x005a:
            long r0 = r9.f6558m
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f6559n
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f6557l
            if (r0 != 0) goto L_0x0073
            e.b$a r0 = new e.b$a
            r0.<init>()
            r9.f6557l = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo7353a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p030e.C1754b.mo7358g(int):boolean");
    }

    public int getAlpha() {
        return this.f6553h;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f6549d.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f6549d.mo7396c()) {
            return null;
        }
        this.f6549d.f6575d = getChangingConfigurations();
        return this.f6549d;
    }

    public Drawable getCurrent() {
        return this.f6551f;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f6550e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f6549d.mo7411q()) {
            return this.f6549d.mo7403i();
        }
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f6549d.mo7411q()) {
            return this.f6549d.mo7407m();
        }
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f6549d.mo7411q()) {
            return this.f6549d.mo7404j();
        }
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f6549d.mo7411q()) {
            return this.f6549d.mo7405k();
        }
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f6551f;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f6549d.mo7408n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            C1756b.m8728b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f6549d.mo7406l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f6551f;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m8719e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7327h(C1758d dVar) {
        this.f6549d = dVar;
        int i = this.f6555j;
        if (i >= 0) {
            Drawable g = dVar.mo7400g(i);
            this.f6551f = g;
            if (g != null) {
                m8718d(g);
            }
        }
        this.f6552g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo7371i(Resources resources) {
        this.f6549d.mo7417y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C1758d dVar = this.f6549d;
        if (dVar != null) {
            dVar.mo7410p();
        }
        if (drawable == this.f6551f && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f6549d.f6565C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f6552g;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f6552g = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f6551f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f6554i) {
                this.f6551f.setAlpha(this.f6553h);
            }
        }
        if (this.f6559n != 0) {
            this.f6559n = 0;
            z = true;
        }
        if (this.f6558m != 0) {
            this.f6558m = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f6556k && super.mutate() == this) {
            C1758d b = mo7326b();
            b.mo7347r();
            mo7327h(b);
            this.f6556k = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6552g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f6551f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f6549d.mo7415w(i, mo7355c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f6552g;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f6551f;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6552g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f6551f;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f6551f && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f6554i || this.f6553h != i) {
            this.f6554i = true;
            this.f6553h = i;
            Drawable drawable = this.f6551f;
            if (drawable == null) {
                return;
            }
            if (this.f6558m == 0) {
                drawable.setAlpha(i);
            } else {
                mo7353a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C1758d dVar = this.f6549d;
        if (dVar.f6565C != z) {
            dVar.f6565C = z;
            Drawable drawable = this.f6551f;
            if (drawable != null) {
                C0515a.m2369j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1758d dVar = this.f6549d;
        dVar.f6567E = true;
        if (dVar.f6566D != colorFilter) {
            dVar.f6566D = colorFilter;
            Drawable drawable = this.f6551f;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C1758d dVar = this.f6549d;
        if (dVar.f6595x != z) {
            dVar.f6595x = z;
            Drawable drawable = this.f6551f;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            C0515a.m2370k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f6550e;
        if (rect == null) {
            this.f6550e = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f6551f;
        if (drawable != null) {
            C0515a.m2371l(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C1758d dVar = this.f6549d;
        dVar.f6570H = true;
        if (dVar.f6568F != colorStateList) {
            dVar.f6568F = colorStateList;
            C0515a.m2374o(this.f6551f, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1758d dVar = this.f6549d;
        dVar.f6571I = true;
        if (dVar.f6569G != mode) {
            dVar.f6569G = mode;
            C0515a.m2375p(this.f6551f, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f6552g;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f6551f;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f6551f && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
