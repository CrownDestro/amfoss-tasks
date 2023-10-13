package p083m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0735z;
import java.util.Map;

/* renamed from: m0.c */
public class C2500c extends C2539m {

    /* renamed from: O */
    private static final String[] f8497O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: P */
    private static final Property<Drawable, PointF> f8498P = new C2502b(PointF.class, "boundsOrigin");

    /* renamed from: Q */
    private static final Property<C2511k, PointF> f8499Q = new C2503c(PointF.class, "topLeft");

    /* renamed from: R */
    private static final Property<C2511k, PointF> f8500R = new C2504d(PointF.class, "bottomRight");

    /* renamed from: S */
    private static final Property<View, PointF> f8501S = new C2505e(PointF.class, "bottomRight");

    /* renamed from: T */
    private static final Property<View, PointF> f8502T = new C2506f(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<View, PointF> f8503U = new C2507g(PointF.class, "position");

    /* renamed from: V */
    private static C2537k f8504V = new C2537k();

    /* renamed from: L */
    private int[] f8505L = new int[2];

    /* renamed from: M */
    private boolean f8506M = false;

    /* renamed from: N */
    private boolean f8507N = false;

    /* renamed from: m0.c$a */
    class C2501a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f8508a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f8509b;

        /* renamed from: c */
        final /* synthetic */ View f8510c;

        /* renamed from: d */
        final /* synthetic */ float f8511d;

        C2501a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f8508a = viewGroup;
            this.f8509b = bitmapDrawable;
            this.f8510c = view;
            this.f8511d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C2562z.m11736b(this.f8508a).mo9244d(this.f8509b);
            C2562z.m11741g(this.f8510c, this.f8511d);
        }
    }

    /* renamed from: m0.c$b */
    class C2502b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f8513a = new Rect();

        C2502b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f8513a);
            Rect rect = this.f8513a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f8513a);
            this.f8513a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f8513a);
        }
    }

    /* renamed from: m0.c$c */
    class C2503c extends Property<C2511k, PointF> {
        C2503c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C2511k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C2511k kVar, PointF pointF) {
            kVar.mo9152c(pointF);
        }
    }

    /* renamed from: m0.c$d */
    class C2504d extends Property<C2511k, PointF> {
        C2504d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C2511k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C2511k kVar, PointF pointF) {
            kVar.mo9151a(pointF);
        }
    }

    /* renamed from: m0.c$e */
    class C2505e extends Property<View, PointF> {
        C2505e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C2562z.m11740f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: m0.c$f */
    class C2506f extends Property<View, PointF> {
        C2506f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C2562z.m11740f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: m0.c$g */
    class C2507g extends Property<View, PointF> {
        C2507g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C2562z.m11740f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: m0.c$h */
    class C2508h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C2511k f8514a;
        private C2511k mViewBounds;

        C2508h(C2511k kVar) {
            this.f8514a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: m0.c$i */
    class C2509i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f8516a;

        /* renamed from: b */
        final /* synthetic */ View f8517b;

        /* renamed from: c */
        final /* synthetic */ Rect f8518c;

        /* renamed from: d */
        final /* synthetic */ int f8519d;

        /* renamed from: e */
        final /* synthetic */ int f8520e;

        /* renamed from: f */
        final /* synthetic */ int f8521f;

        /* renamed from: g */
        final /* synthetic */ int f8522g;

        C2509i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f8517b = view;
            this.f8518c = rect;
            this.f8519d = i;
            this.f8520e = i2;
            this.f8521f = i3;
            this.f8522g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f8516a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f8516a) {
                C0735z.m3242y0(this.f8517b, this.f8518c);
                C2562z.m11740f(this.f8517b, this.f8519d, this.f8520e, this.f8521f, this.f8522g);
            }
        }
    }

    /* renamed from: m0.c$j */
    class C2510j extends C2546n {

        /* renamed from: a */
        boolean f8524a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f8525b;

        C2510j(ViewGroup viewGroup) {
            this.f8525b = viewGroup;
        }

        /* renamed from: b */
        public void mo9147b(C2539m mVar) {
            C2559w.m11730c(this.f8525b, false);
            this.f8524a = true;
        }

        /* renamed from: c */
        public void mo9148c(C2539m mVar) {
            C2559w.m11730c(this.f8525b, false);
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            if (!this.f8524a) {
                C2559w.m11730c(this.f8525b, false);
            }
            mVar.mo9192U(this);
        }

        /* renamed from: e */
        public void mo9150e(C2539m mVar) {
            C2559w.m11730c(this.f8525b, true);
        }
    }

    /* renamed from: m0.c$k */
    private static class C2511k {

        /* renamed from: a */
        private int f8527a;

        /* renamed from: b */
        private int f8528b;

        /* renamed from: c */
        private int f8529c;

        /* renamed from: d */
        private int f8530d;

        /* renamed from: e */
        private View f8531e;

        /* renamed from: f */
        private int f8532f;

        /* renamed from: g */
        private int f8533g;

        C2511k(View view) {
            this.f8531e = view;
        }

        /* renamed from: b */
        private void m11528b() {
            C2562z.m11740f(this.f8531e, this.f8527a, this.f8528b, this.f8529c, this.f8530d);
            this.f8532f = 0;
            this.f8533g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9151a(PointF pointF) {
            this.f8529c = Math.round(pointF.x);
            this.f8530d = Math.round(pointF.y);
            int i = this.f8533g + 1;
            this.f8533g = i;
            if (this.f8532f == i) {
                m11528b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9152c(PointF pointF) {
            this.f8527a = Math.round(pointF.x);
            this.f8528b = Math.round(pointF.y);
            int i = this.f8532f + 1;
            this.f8532f = i;
            if (i == this.f8533g) {
                m11528b();
            }
        }
    }

    /* renamed from: h0 */
    private void m11506h0(C2555s sVar) {
        View view = sVar.f8651b;
        if (C0735z.m3188V(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f8650a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f8650a.put("android:changeBounds:parent", sVar.f8651b.getParent());
            if (this.f8507N) {
                sVar.f8651b.getLocationInWindow(this.f8505L);
                sVar.f8650a.put("android:changeBounds:windowX", Integer.valueOf(this.f8505L[0]));
                sVar.f8650a.put("android:changeBounds:windowY", Integer.valueOf(this.f8505L[1]));
            }
            if (this.f8506M) {
                sVar.f8650a.put("android:changeBounds:clip", C0735z.m3237w(view));
            }
        }
    }

    /* renamed from: i0 */
    private boolean m11507i0(View view, View view2) {
        if (!this.f8507N) {
            return true;
        }
        C2555s y = mo9219y(view, true);
        if (y == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == y.f8651b) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public String[] mo9116I() {
        return f8497O;
    }

    /* renamed from: j */
    public void mo9117j(C2555s sVar) {
        m11506h0(sVar);
    }

    /* renamed from: m */
    public void mo9118m(C2555s sVar) {
        m11506h0(sVar);
    }

    /* renamed from: r */
    public Animator mo9119r(ViewGroup viewGroup, C2555s sVar, C2555s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C2555s sVar3 = sVar;
        C2555s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f8650a;
        Map<String, Object> map2 = sVar4.f8650a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f8651b;
        if (m11507i0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f8650a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f8650a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f8650a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f8650a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f8506M) {
                view = view3;
                C2562z.m11740f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo9181A().mo9161a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f8503U;
                    } else {
                        C2511k kVar = new C2511k(view);
                        ObjectAnimator a = C2525f.m11575a(kVar, f8499Q, mo9181A().mo9161a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C2525f.m11575a(kVar, f8500R, mo9181A().mo9161a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C2508h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo9181A().mo9161a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f8501S;
                } else {
                    path = mo9181A().mo9161a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f8502T;
                }
                animator = C2525f.m11575a(view, property, path);
            } else {
                view = view3;
                C2562z.m11740f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C2525f.m11575a(view, f8503U, mo9181A().mo9161a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C0735z.m3242y0(view, rect);
                    C2537k kVar2 = f8504V;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new C2509i(view, rect6, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C2554r.m11721c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C2559w.m11730c(viewGroup4, true);
                mo9198b(new C2510j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f8650a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f8650a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f8650a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f8650a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f8505L);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C2562z.m11737c(view2);
        C2562z.m11741g(view2, 0.0f);
        C2562z.m11736b(viewGroup).mo9242b(bitmapDrawable);
        C2527g A = mo9181A();
        int[] iArr = this.f8505L;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C2534i.m11610a(f8498P, A.mo9161a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C2501a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
