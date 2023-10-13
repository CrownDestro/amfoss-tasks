package p083m0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m0.f0 */
class C2526f0 {

    /* renamed from: a */
    private static Method f8558a;

    /* renamed from: b */
    private static boolean f8559b;

    /* renamed from: c */
    private static Field f8560c;

    /* renamed from: d */
    private static boolean f8561d;

    C2526f0() {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    /* renamed from: b */
    private void m11576b() {
        if (!f8559b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f8558a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f8559b = true;
        }
    }

    /* renamed from: a */
    public void mo9110a(View view) {
        throw null;
    }

    /* renamed from: c */
    public float mo9111c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo9112d(View view) {
        throw null;
    }

    /* renamed from: e */
    public void mo9153e(View view, int i, int i2, int i3, int i4) {
        m11576b();
        Method method = f8558a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo9113f(View view, float f) {
        throw null;
    }

    /* renamed from: g */
    public void mo9158g(View view, int i) {
        if (!f8561d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f8560c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f8561d = true;
        }
        Field field = f8560c;
        if (field != null) {
            try {
                f8560c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo9114h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo9114h(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: i */
    public void mo9115i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo9115i(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
