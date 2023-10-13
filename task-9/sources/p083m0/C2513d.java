package p083m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0735z;

/* renamed from: m0.d */
public class C2513d extends C2528g0 {

    /* renamed from: m0.d$a */
    class C2514a extends C2546n {

        /* renamed from: a */
        final /* synthetic */ View f8535a;

        C2514a(View view) {
            this.f8535a = view;
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            C2562z.m11741g(this.f8535a, 1.0f);
            C2562z.m11735a(this.f8535a);
            mVar.mo9192U(this);
        }
    }

    /* renamed from: m0.d$b */
    private static class C2515b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f8537a;

        /* renamed from: b */
        private boolean f8538b = false;

        C2515b(View view) {
            this.f8537a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C2562z.m11741g(this.f8537a, 1.0f);
            if (this.f8538b) {
                this.f8537a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0735z.m3184R(this.f8537a) && this.f8537a.getLayerType() == 0) {
                this.f8538b = true;
                this.f8537a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C2513d() {
    }

    public C2513d(int i) {
        mo9165n0(i);
    }

    /* renamed from: o0 */
    private Animator m11532o0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C2562z.m11741g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C2562z.f8661b, new float[]{f2});
        ofFloat.addListener(new C2515b(view));
        mo9198b(new C2514a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f8650a.get("android:fade:transitionAlpha");
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m11533p0(p083m0.C2555s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f8650a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p083m0.C2513d.m11533p0(m0.s, float):float");
    }

    /* renamed from: j0 */
    public Animator mo9154j0(ViewGroup viewGroup, View view, C2555s sVar, C2555s sVar2) {
        float f = 0.0f;
        float p0 = m11533p0(sVar, 0.0f);
        if (p0 != 1.0f) {
            f = p0;
        }
        return m11532o0(view, f, 1.0f);
    }

    /* renamed from: l0 */
    public Animator mo9155l0(ViewGroup viewGroup, View view, C2555s sVar, C2555s sVar2) {
        C2562z.m11739e(view);
        return m11532o0(view, m11533p0(sVar, 1.0f), 0.0f);
    }

    /* renamed from: m */
    public void mo9118m(C2555s sVar) {
        super.mo9118m(sVar);
        sVar.f8650a.put("android:fade:transitionAlpha", Float.valueOf(C2562z.m11737c(sVar.f8651b)));
    }
}
