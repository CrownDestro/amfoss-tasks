package p083m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p083m0.C2539m;

/* renamed from: m0.g0 */
public abstract class C2528g0 extends C2539m {

    /* renamed from: M */
    private static final String[] f8562M = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L */
    private int f8563L = 3;

    /* renamed from: m0.g0$a */
    class C2529a extends C2546n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f8564a;

        /* renamed from: b */
        final /* synthetic */ View f8565b;

        /* renamed from: c */
        final /* synthetic */ View f8566c;

        C2529a(ViewGroup viewGroup, View view, View view2) {
            this.f8564a = viewGroup;
            this.f8565b = view;
            this.f8566c = view2;
        }

        /* renamed from: c */
        public void mo9148c(C2539m mVar) {
            C2559w.m11728a(this.f8564a).mo9243c(this.f8565b);
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            this.f8566c.setTag(C2536j.save_overlay_view, (Object) null);
            C2559w.m11728a(this.f8564a).mo9243c(this.f8565b);
            mVar.mo9192U(this);
        }

        /* renamed from: e */
        public void mo9150e(C2539m mVar) {
            if (this.f8565b.getParent() == null) {
                C2559w.m11728a(this.f8564a).mo9241a(this.f8565b);
            } else {
                C2528g0.this.cancel();
            }
        }
    }

    /* renamed from: m0.g0$b */
    private static class C2530b extends AnimatorListenerAdapter implements C2539m.C2545f {

        /* renamed from: a */
        private final View f8568a;

        /* renamed from: b */
        private final int f8569b;

        /* renamed from: c */
        private final ViewGroup f8570c;

        /* renamed from: d */
        private final boolean f8571d;

        /* renamed from: e */
        private boolean f8572e;

        /* renamed from: f */
        boolean f8573f = false;

        C2530b(View view, int i, boolean z) {
            this.f8568a = view;
            this.f8569b = i;
            this.f8570c = (ViewGroup) view.getParent();
            this.f8571d = z;
            m11602g(true);
        }

        /* renamed from: f */
        private void m11601f() {
            if (!this.f8573f) {
                C2562z.m11742h(this.f8568a, this.f8569b);
                ViewGroup viewGroup = this.f8570c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m11602g(false);
        }

        /* renamed from: g */
        private void m11602g(boolean z) {
            ViewGroup viewGroup;
            if (this.f8571d && this.f8572e != z && (viewGroup = this.f8570c) != null) {
                this.f8572e = z;
                C2559w.m11730c(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo9160a(C2539m mVar) {
        }

        /* renamed from: b */
        public void mo9147b(C2539m mVar) {
        }

        /* renamed from: c */
        public void mo9148c(C2539m mVar) {
            m11602g(false);
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            m11601f();
            mVar.mo9192U(this);
        }

        /* renamed from: e */
        public void mo9150e(C2539m mVar) {
            m11602g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f8573f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m11601f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f8573f) {
                C2562z.m11742h(this.f8568a, this.f8569b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f8573f) {
                C2562z.m11742h(this.f8568a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: m0.g0$c */
    private static class C2531c {

        /* renamed from: a */
        boolean f8574a;

        /* renamed from: b */
        boolean f8575b;

        /* renamed from: c */
        int f8576c;

        /* renamed from: d */
        int f8577d;

        /* renamed from: e */
        ViewGroup f8578e;

        /* renamed from: f */
        ViewGroup f8579f;

        C2531c() {
        }
    }

    /* renamed from: h0 */
    private void m11586h0(C2555s sVar) {
        sVar.f8650a.put("android:visibility:visibility", Integer.valueOf(sVar.f8651b.getVisibility()));
        sVar.f8650a.put("android:visibility:parent", sVar.f8651b.getParent());
        int[] iArr = new int[2];
        sVar.f8651b.getLocationOnScreen(iArr);
        sVar.f8650a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f8578e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f8576c == 0) goto L_0x0093;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p083m0.C2528g0.C2531c m11587i0(p083m0.C2555s r8, p083m0.C2555s r9) {
        /*
            r7 = this;
            m0.g0$c r0 = new m0.g0$c
            r0.<init>()
            r1 = 0
            r0.f8574a = r1
            r0.f8575b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f8650a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f8650a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f8576c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f8650a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f8578e = r6
            goto L_0x0037
        L_0x0033:
            r0.f8576c = r4
            r0.f8578e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f8650a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f8650a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f8577d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f8650a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f8579f = r2
            goto L_0x005e
        L_0x005a:
            r0.f8577d = r4
            r0.f8579f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f8576c
            int r9 = r0.f8577d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f8578e
            android.view.ViewGroup r4 = r0.f8579f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f8579f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f8578e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f8577d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f8575b = r2
        L_0x008a:
            r0.f8574a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f8576c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f8575b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p083m0.C2528g0.m11587i0(m0.s, m0.s):m0.g0$c");
    }

    /* renamed from: I */
    public String[] mo9116I() {
        return f8562M;
    }

    /* renamed from: K */
    public boolean mo9162K(C2555s sVar, C2555s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f8650a.containsKey("android:visibility:visibility") != sVar.f8650a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2531c i0 = m11587i0(sVar, sVar2);
        if (i0.f8574a) {
            return i0.f8576c == 0 || i0.f8577d == 0;
        }
        return false;
    }

    /* renamed from: j */
    public void mo9117j(C2555s sVar) {
        m11586h0(sVar);
    }

    /* renamed from: j0 */
    public abstract Animator mo9154j0(ViewGroup viewGroup, View view, C2555s sVar, C2555s sVar2);

    /* renamed from: k0 */
    public Animator mo9163k0(ViewGroup viewGroup, C2555s sVar, int i, C2555s sVar2, int i2) {
        if ((this.f8563L & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f8651b.getParent();
            if (m11587i0(mo9219y(view, false), mo9188J(view, false)).f8574a) {
                return null;
            }
        }
        return mo9154j0(viewGroup, sVar2.f8651b, sVar, sVar2);
    }

    /* renamed from: l0 */
    public abstract Animator mo9155l0(ViewGroup viewGroup, View view, C2555s sVar, C2555s sVar2);

    /* renamed from: m */
    public void mo9118m(C2555s sVar) {
        m11586h0(sVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f8622y != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo9164m0(android.view.ViewGroup r18, p083m0.C2555s r19, int r20, p083m0.C2555s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f8563L
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f8651b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f8651b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p083m0.C2536j.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            m0.s r14 = r0.mo9188J(r13, r12)
            m0.s r15 = r0.mo9219y(r13, r12)
            m0.g0$c r14 = r0.m11587i0(r14, r15)
            boolean r14 = r14.f8574a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = p083m0.C2554r.m11719a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f8622y
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f8650a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            m0.v r4 = p083m0.C2559w.m11728a(r18)
            r4.mo9241a(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo9155l0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            m0.v r1 = p083m0.C2559w.m11728a(r18)
            r1.mo9243c(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            m0.g0$a r3 = new m0.g0$a
            r3.<init>(r1, r10, r5)
            r0.mo9198b(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p083m0.C2562z.m11742h(r8, r11)
            android.animation.Animator r1 = r0.mo9155l0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            m0.g0$b r2 = new m0.g0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p083m0.C2496a.m11496a(r1, r2)
            r0.mo9198b(r2)
            goto L_0x0106
        L_0x0103:
            p083m0.C2562z.m11742h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p083m0.C2528g0.mo9164m0(android.view.ViewGroup, m0.s, int, m0.s, int):android.animation.Animator");
    }

    /* renamed from: n0 */
    public void mo9165n0(int i) {
        if ((i & -4) == 0) {
            this.f8563L = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: r */
    public Animator mo9119r(ViewGroup viewGroup, C2555s sVar, C2555s sVar2) {
        C2531c i0 = m11587i0(sVar, sVar2);
        if (!i0.f8574a) {
            return null;
        }
        if (i0.f8578e == null && i0.f8579f == null) {
            return null;
        }
        if (i0.f8575b) {
            return mo9163k0(viewGroup, sVar, i0.f8576c, sVar2, i0.f8577d);
        }
        return mo9164m0(viewGroup, sVar, i0.f8576c, sVar2, i0.f8577d);
    }
}
