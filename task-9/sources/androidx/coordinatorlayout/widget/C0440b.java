package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
public class C0440b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2244a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2245b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m2106a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m2108c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m2107b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2107b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: c */
    static void m2108c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f2244a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m2107b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f2245b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
