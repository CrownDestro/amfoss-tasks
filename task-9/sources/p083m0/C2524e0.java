package p083m0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: m0.e0 */
class C2524e0 extends C2516d0 {
    C2524e0() {
    }

    /* renamed from: c */
    public float mo9111c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo9153e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: f */
    public void mo9113f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: g */
    public void mo9158g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: h */
    public void mo9114h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo9115i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
