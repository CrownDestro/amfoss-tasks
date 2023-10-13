package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0701l0;
import androidx.core.view.C0735z;
import java.util.ArrayList;
import java.util.List;
import p010b0.C1251c;
import p041f3.C1920g;
import p041f3.C1924k;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d */
    private final List<View> f3017d;

    /* renamed from: e */
    private final List<View> f3018e;

    /* renamed from: f */
    private View.OnApplyWindowInsetsListener f3019f;

    /* renamed from: g */
    private boolean f3020g;

    /* renamed from: androidx.fragment.app.FragmentContainerView$a */
    public static final class C0855a {

        /* renamed from: a */
        public static final C0855a f3021a = new C0855a();

        private C0855a() {
        }

        /* renamed from: a */
        public final WindowInsets mo3346a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C1924k.m9141g(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C1924k.m9141g(view, "v");
            C1924k.m9141g(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C1924k.m9140f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C1920g) null);
        C1924k.m9141g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C1924k.m9141g(context, "context");
        this.f3017d = new ArrayList();
        this.f3018e = new ArrayList();
        this.f3020g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C1251c.f4285e;
            C1924k.m9140f(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C1251c.f4286f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, C1920g gVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C0937w wVar) {
        super(context, attributeSet);
        String str;
        C1924k.m9141g(context, "context");
        C1924k.m9141g(attributeSet, "attrs");
        C1924k.m9141g(wVar, "fm");
        this.f3017d = new ArrayList();
        this.f3018e = new ArrayList();
        this.f3020g = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C1251c.f4285e;
        C1924k.m9140f(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C1251c.f4286f) : classAttribute;
        String string = obtainStyledAttributes.getString(C1251c.f4287g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h0 = wVar.mo3661h0(id);
        if (classAttribute != null && h0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = wVar.mo3680s0().mo3593a(context.getClassLoader(), classAttribute);
            C1924k.m9140f(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.mo3312v0(context, attributeSet, (Bundle) null);
            wVar.mo3675o().mo3484n(true).mo3479c(this, a, string).mo3351h();
        }
        wVar.mo3648W0(this);
    }

    /* renamed from: a */
    private final void m3879a(View view) {
        if (this.f3018e.contains(view)) {
            this.f3017d.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C1924k.m9141g(view, "child");
        if (C0937w.m4206B0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0701l0 l0Var;
        C1924k.m9141g(windowInsets, "insets");
        C0701l0 u = C0701l0.m3006u(windowInsets);
        C1924k.m9140f(u, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3019f;
        if (onApplyWindowInsetsListener != null) {
            C0855a aVar = C0855a.f3021a;
            C1924k.m9138d(onApplyWindowInsetsListener);
            l0Var = C0701l0.m3006u(aVar.mo3346a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            l0Var = C0735z.m3200d0(this, u);
        }
        C1924k.m9140f(l0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!l0Var.mo2865n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0735z.m3209i(getChildAt(i), l0Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C1924k.m9141g(canvas, "canvas");
        if (this.f3020g) {
            for (View drawChild : this.f3017d) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C1924k.m9141g(canvas, "canvas");
        C1924k.m9141g(view, "child");
        if (!this.f3020g || !(!this.f3017d.isEmpty()) || !this.f3017d.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        C1924k.m9141g(view, "view");
        this.f3018e.remove(view);
        if (this.f3017d.remove(view)) {
            this.f3020g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return C0937w.m4235k0(this).mo3661h0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C1924k.m9141g(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C1924k.m9140f(childAt, "view");
                m3879a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        C1924k.m9141g(view, "view");
        m3879a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C1924k.m9140f(childAt, "view");
        m3879a(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        C1924k.m9141g(view, "view");
        m3879a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C1924k.m9140f(childAt, "view");
            m3879a(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C1924k.m9140f(childAt, "view");
            m3879a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f3020g = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C1924k.m9141g(onApplyWindowInsetsListener, "listener");
        this.f3019f = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C1924k.m9141g(view, "view");
        if (view.getParent() == this) {
            this.f3018e.add(view);
        }
        super.startViewTransition(view);
    }
}
