package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C0624d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3579I = false;

    /* renamed from: J */
    int f3580J = -1;

    /* renamed from: K */
    int[] f3581K;

    /* renamed from: L */
    View[] f3582L;

    /* renamed from: M */
    final SparseIntArray f3583M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3584N = new SparseIntArray();

    /* renamed from: O */
    C1057c f3585O = new C1055a();

    /* renamed from: P */
    final Rect f3586P = new Rect();

    /* renamed from: Q */
    private boolean f3587Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1055a extends C1057c {
        /* renamed from: e */
        public int mo3961e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo3962f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1056b extends RecyclerView.C1089p {

        /* renamed from: e */
        int f3588e = -1;

        /* renamed from: f */
        int f3589f = 0;

        public C1056b(int i, int i2) {
            super(i, i2);
        }

        public C1056b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1056b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1056b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public int mo3963e() {
            return this.f3588e;
        }

        /* renamed from: f */
        public int mo3964f() {
            return this.f3589f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C1057c {

        /* renamed from: a */
        final SparseIntArray f3590a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3591b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3592c = false;

        /* renamed from: d */
        private boolean f3593d = false;

        /* renamed from: a */
        static int m4707a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3965b(int i, int i2) {
            if (!this.f3593d) {
                return mo3967d(i, i2);
            }
            int i3 = this.f3591b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo3967d(i, i2);
            this.f3591b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo3966c(int i, int i2) {
            if (!this.f3592c) {
                return mo3961e(i, i2);
            }
            int i3 = this.f3590a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo3961e(i, i2);
            this.f3590a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3967d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3593d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f3591b
                int r0 = m4707a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f3591b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo3966c(r0, r8)
                int r0 = r6.mo3962f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo3962f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo3962f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1057c.mo3967d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo3961e(int i, int i2);

        /* renamed from: f */
        public abstract int mo3962f(int i);

        /* renamed from: g */
        public void mo3968g() {
            this.f3591b.clear();
        }

        /* renamed from: h */
        public void mo3969h() {
            this.f3590a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo3950h3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3950h3(RecyclerView.C1084o.m5074l0(context, attributeSet, i, i2).f3799b);
    }

    /* renamed from: Q2 */
    private void m4656Q2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3582L[i3];
            C1056b bVar = (C1056b) view.getLayoutParams();
            int d3 = m4667d3(vVar, a0Var, mo4396k0(view));
            bVar.f3589f = d3;
            bVar.f3588e = i4;
            i4 += d3;
            i3 += i2;
        }
    }

    /* renamed from: R2 */
    private void m4657R2() {
        int K = mo4350K();
        for (int i = 0; i < K; i++) {
            C1056b bVar = (C1056b) mo4348J(i).getLayoutParams();
            int a = bVar.mo4429a();
            this.f3583M.put(a, bVar.mo3964f());
            this.f3584N.put(a, bVar.mo3963e());
        }
    }

    /* renamed from: S2 */
    private void m4658S2(int i) {
        this.f3581K = m4659T2(this.f3581K, this.f3580J, i);
    }

    /* renamed from: T2 */
    static int[] m4659T2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: U2 */
    private void m4660U2() {
        this.f3583M.clear();
        this.f3584N.clear();
    }

    /* renamed from: V2 */
    private int m4661V2(RecyclerView.C1064a0 a0Var) {
        if (!(mo4350K() == 0 || a0Var.mo4196b() == 0)) {
            mo3983W1();
            boolean u2 = mo4004u2();
            View b2 = mo3987b2(!u2, true);
            View a2 = mo3985a2(!u2, true);
            if (!(b2 == null || a2 == null)) {
                int b = this.f3585O.mo3965b(mo4396k0(b2), this.f3580J);
                int b3 = this.f3585O.mo3965b(mo4396k0(a2), this.f3580J);
                int min = Math.min(b, b3);
                int max = this.f3607x ? Math.max(0, ((this.f3585O.mo3965b(a0Var.mo4196b() - 1, this.f3580J) + 1) - Math.max(b, b3)) - 1) : Math.max(0, min);
                if (!u2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3604u.mo4701d(a2) - this.f3604u.mo4704g(b2))) / ((float) ((this.f3585O.mo3965b(mo4396k0(a2), this.f3580J) - this.f3585O.mo3965b(mo4396k0(b2), this.f3580J)) + 1)))) + ((float) (this.f3604u.mo4710m() - this.f3604u.mo4704g(b2))));
            }
        }
        return 0;
    }

    /* renamed from: W2 */
    private int m4662W2(RecyclerView.C1064a0 a0Var) {
        if (!(mo4350K() == 0 || a0Var.mo4196b() == 0)) {
            mo3983W1();
            View b2 = mo3987b2(!mo4004u2(), true);
            View a2 = mo3985a2(!mo4004u2(), true);
            if (!(b2 == null || a2 == null)) {
                if (!mo4004u2()) {
                    return this.f3585O.mo3965b(a0Var.mo4196b() - 1, this.f3580J) + 1;
                }
                int d = this.f3604u.mo4701d(a2) - this.f3604u.mo4704g(b2);
                int b = this.f3585O.mo3965b(mo4396k0(b2), this.f3580J);
                return (int) ((((float) d) / ((float) ((this.f3585O.mo3965b(mo4396k0(a2), this.f3580J) - b) + 1))) * ((float) (this.f3585O.mo3965b(a0Var.mo4196b() - 1, this.f3580J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: X2 */
    private void m4663X2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, LinearLayoutManager.C1058a aVar, int i) {
        boolean z = i == 1;
        int c3 = m4666c3(vVar, a0Var, aVar.f3611b);
        if (z) {
            while (c3 > 0) {
                int i2 = aVar.f3611b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f3611b = i3;
                    c3 = m4666c3(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = a0Var.mo4196b() - 1;
        int i4 = aVar.f3611b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int c32 = m4666c3(vVar, a0Var, i5);
            if (c32 <= c3) {
                break;
            }
            i4 = i5;
            c3 = c32;
        }
        aVar.f3611b = i4;
    }

    /* renamed from: Y2 */
    private void m4664Y2() {
        View[] viewArr = this.f3582L;
        if (viewArr == null || viewArr.length != this.f3580J) {
            this.f3582L = new View[this.f3580J];
        }
    }

    /* renamed from: b3 */
    private int m4665b3(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, int i) {
        if (!a0Var.mo4199e()) {
            return this.f3585O.mo3965b(i, this.f3580J);
        }
        int f = vVar.mo4468f(i);
        if (f != -1) {
            return this.f3585O.mo3965b(f, this.f3580J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: c3 */
    private int m4666c3(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, int i) {
        if (!a0Var.mo4199e()) {
            return this.f3585O.mo3966c(i, this.f3580J);
        }
        int i2 = this.f3584N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo4468f(i);
        if (f != -1) {
            return this.f3585O.mo3966c(f, this.f3580J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: d3 */
    private int m4667d3(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, int i) {
        if (!a0Var.mo4199e()) {
            return this.f3585O.mo3962f(i);
        }
        int i2 = this.f3583M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo4468f(i);
        if (f != -1) {
            return this.f3585O.mo3962f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: e3 */
    private void m4668e3(float f, int i) {
        m4658S2(Math.max(Math.round(f * ((float) this.f3580J)), i));
    }

    /* renamed from: f3 */
    private void m4669f3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1056b bVar = (C1056b) view.getLayoutParams();
        Rect rect = bVar.f3803b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int Z2 = mo3946Z2(bVar.f3588e, bVar.f3589f);
        if (this.f3602s == 1) {
            i2 = RecyclerView.C1084o.m5071L(Z2, i, i5, bVar.width, false);
            i3 = RecyclerView.C1084o.m5071L(this.f3604u.mo4711n(), mo4370Y(), i4, bVar.height, true);
        } else {
            int L = RecyclerView.C1084o.m5071L(Z2, i, i4, bVar.height, false);
            int L2 = RecyclerView.C1084o.m5071L(this.f3604u.mo4711n(), mo4410s0(), i5, bVar.width, true);
            i3 = L;
            i2 = L2;
        }
        m4670g3(view, i2, i3, z);
    }

    /* renamed from: g3 */
    private void m4670g3(View view, int i, int i2, boolean z) {
        RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
        if (z ? mo4352K1(view, i, i2, pVar) : mo4347I1(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: i3 */
    private void m4671i3() {
        int i;
        int i2;
        if (mo4001s2() == 1) {
            i2 = mo4408r0() - mo4387h0();
            i = mo4386g0();
        } else {
            i2 = mo4369X() - mo4382e0();
            i = mo4393j0();
        }
        m4658S2(i2 - i);
    }

    /* renamed from: B1 */
    public int mo3930B1(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        m4671i3();
        m4664Y2();
        return super.mo3930B1(i, vVar, a0Var);
    }

    /* renamed from: E */
    public RecyclerView.C1089p mo3931E() {
        return this.f3602s == 0 ? new C1056b(-2, -1) : new C1056b(-1, -2);
    }

    /* renamed from: F */
    public RecyclerView.C1089p mo3932F(Context context, AttributeSet attributeSet) {
        return new C1056b(context, attributeSet);
    }

    /* renamed from: F1 */
    public void mo3933F1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3581K == null) {
            super.mo3933F1(rect, i, i2);
        }
        int g0 = mo4386g0() + mo4387h0();
        int j0 = mo4393j0() + mo4382e0();
        if (this.f3602s == 1) {
            i4 = RecyclerView.C1084o.m5075o(i2, rect.height() + j0, mo4376c0());
            int[] iArr = this.f3581K;
            i3 = RecyclerView.C1084o.m5075o(i, iArr[iArr.length - 1] + g0, mo4379d0());
        } else {
            i3 = RecyclerView.C1084o.m5075o(i, rect.width() + g0, mo4379d0());
            int[] iArr2 = this.f3581K;
            i4 = RecyclerView.C1084o.m5075o(i2, iArr2[iArr2.length - 1] + j0, mo4376c0());
        }
        mo4338E1(i3, i4);
    }

    /* renamed from: G */
    public RecyclerView.C1089p mo3934G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1056b((ViewGroup.MarginLayoutParams) layoutParams) : new C1056b(layoutParams);
    }

    /* renamed from: H2 */
    public void mo3935H2(boolean z) {
        if (!z) {
            super.mo3935H2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3936M0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1096v r26, androidx.recyclerview.widget.RecyclerView.C1064a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo4332C(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C1056b) r5
            int r6 = r5.f3588e
            int r5 = r5.f3589f
            int r5 = r5 + r6
            android.view.View r7 = super.mo3936M0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo3981U1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3607x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo4350K()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo4350K()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f3602s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4002t2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m4665b3(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m4665b3(r1, r2, r10)
            android.view.View r1 = r0.mo4348J(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C1056b) r9
            int r2 = r9.f3588e
            r18 = r3
            int r3 = r9.f3589f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo4331B0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f3588e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f3588e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3936M0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* renamed from: O */
    public int mo3937O(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (this.f3602s == 1) {
            return this.f3580J;
        }
        if (a0Var.mo4196b() < 1) {
            return 0;
        }
        return m4665b3(vVar, a0Var, a0Var.mo4196b() - 1) + 1;
    }

    /* renamed from: O1 */
    public boolean mo3938O1() {
        return this.f3597D == null && !this.f3579I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public void mo3939Q1(RecyclerView.C1064a0 a0Var, LinearLayoutManager.C1060c cVar, RecyclerView.C1084o.C1087c cVar2) {
        int i = this.f3580J;
        for (int i2 = 0; i2 < this.f3580J && cVar.mo4015c(a0Var) && i > 0; i2++) {
            int i3 = cVar.f3622d;
            cVar2.mo4428a(i3, Math.max(0, cVar.f3625g));
            i -= this.f3585O.mo3962f(i3);
            cVar.f3622d += cVar.f3623e;
        }
    }

    /* renamed from: S0 */
    public void mo3940S0(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, View view, C0624d dVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1056b)) {
            super.mo4362R0(view, dVar);
            return;
        }
        C1056b bVar = (C1056b) layoutParams;
        int b3 = m4665b3(vVar, a0Var, bVar.mo4429a());
        if (this.f3602s == 0) {
            i4 = bVar.mo3963e();
            i3 = bVar.mo3964f();
            i = 1;
            z2 = false;
            z = false;
            i2 = b3;
        } else {
            i3 = 1;
            i2 = bVar.mo3963e();
            i = bVar.mo3964f();
            z2 = false;
            z = false;
            i4 = b3;
        }
        dVar.mo2712a0(C0624d.C0627c.m2777a(i4, i3, i2, i, z2, z));
    }

    /* renamed from: U0 */
    public void mo3941U0(RecyclerView recyclerView, int i, int i2) {
        this.f3585O.mo3969h();
        this.f3585O.mo3968g();
    }

    /* renamed from: V0 */
    public void mo3942V0(RecyclerView recyclerView) {
        this.f3585O.mo3969h();
        this.f3585O.mo3968g();
    }

    /* renamed from: W0 */
    public void mo3943W0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3585O.mo3969h();
        this.f3585O.mo3968g();
    }

    /* renamed from: X0 */
    public void mo3944X0(RecyclerView recyclerView, int i, int i2) {
        this.f3585O.mo3969h();
        this.f3585O.mo3968g();
    }

    /* renamed from: Z0 */
    public void mo3945Z0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3585O.mo3969h();
        this.f3585O.mo3968g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z2 */
    public int mo3946Z2(int i, int i2) {
        if (this.f3602s != 1 || !mo4002t2()) {
            int[] iArr = this.f3581K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3581K;
        int i3 = this.f3580J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: a1 */
    public void mo3947a1(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (a0Var.mo4199e()) {
            m4657R2();
        }
        super.mo3947a1(vVar, a0Var);
        m4660U2();
    }

    /* renamed from: a3 */
    public int mo3948a3() {
        return this.f3580J;
    }

    /* renamed from: b1 */
    public void mo3949b1(RecyclerView.C1064a0 a0Var) {
        super.mo3949b1(a0Var);
        this.f3579I = false;
    }

    /* renamed from: h3 */
    public void mo3950h3(int i) {
        if (i != this.f3580J) {
            this.f3579I = true;
            if (i >= 1) {
                this.f3580J = i;
                this.f3585O.mo3969h();
                mo4417w1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public View mo3951k2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, int i, int i2, int i3) {
        mo3983W1();
        int m = this.f3604u.mo4710m();
        int i4 = this.f3604u.mo4706i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View J = mo4348J(i);
            int k0 = mo4396k0(J);
            if (k0 >= 0 && k0 < i3 && m4666c3(vVar, a0Var, k0) == 0) {
                if (((RecyclerView.C1089p) J.getLayoutParams()).mo4431c()) {
                    if (view2 == null) {
                        view2 = J;
                    }
                } else if (this.f3604u.mo4704g(J) < i4 && this.f3604u.mo4701d(J) >= m) {
                    return J;
                } else {
                    if (view == null) {
                        view = J;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    /* renamed from: n */
    public boolean mo3952n(RecyclerView.C1089p pVar) {
        return pVar instanceof C1056b;
    }

    /* renamed from: n0 */
    public int mo3953n0(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (this.f3602s == 0) {
            return this.f3580J;
        }
        if (a0Var.mo4196b() < 1) {
            return 0;
        }
        return m4665b3(vVar, a0Var, a0Var.mo4196b() - 1) + 1;
    }

    /* renamed from: s */
    public int mo3954s(RecyclerView.C1064a0 a0Var) {
        return this.f3587Q ? m4661V2(a0Var) : super.mo3954s(a0Var);
    }

    /* renamed from: t */
    public int mo3955t(RecyclerView.C1064a0 a0Var) {
        return this.f3587Q ? m4662W2(a0Var) : super.mo3955t(a0Var);
    }

    /* renamed from: v */
    public int mo3956v(RecyclerView.C1064a0 a0Var) {
        return this.f3587Q ? m4661V2(a0Var) : super.mo3956v(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* renamed from: v2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3957v2(androidx.recyclerview.widget.RecyclerView.C1096v r18, androidx.recyclerview.widget.RecyclerView.C1064a0 r19, androidx.recyclerview.widget.LinearLayoutManager.C1060c r20, androidx.recyclerview.widget.LinearLayoutManager.C1059b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.i r3 = r6.f3604u
            int r3 = r3.mo4709l()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.mo4350K()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f3581K
            int r11 = r6.f3580J
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.m4671i3()
        L_0x002c:
            int r11 = r2.f3623e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.f3580J
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f3622d
            int r12 = r6.m4666c3(r0, r1, r12)
            int r13 = r2.f3622d
            int r13 = r6.m4667d3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.f3580J
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.mo4015c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f3622d
            int r15 = r6.m4667d3(r0, r1, r14)
            int r4 = r6.f3580J
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.mo4016d(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.f3582L
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f3580J
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f3616b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.m4656Q2(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f4
            android.view.View[] r12 = r6.f3582L
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r14 = r2.f3630l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.mo4381e(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.mo4384f(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.mo4375c(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.mo4378d(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.f3586P
            r6.mo4395k(r12, r14)
            r6.m4669f3(r12, r3, r5)
            androidx.recyclerview.widget.i r14 = r6.f3604u
            int r14 = r14.mo4702e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.C1056b) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.i r5 = r6.f3604u
            int r5 = r5.mo4703f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.f3589f
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f0
            r4 = r5
        L_0x00f0:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f4:
            if (r9 == 0) goto L_0x0112
            r6.m4668e3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fb:
            if (r0 >= r13) goto L_0x0112
            android.view.View[] r3 = r6.f3582L
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.m4669f3(r3, r4, r8)
            androidx.recyclerview.widget.i r4 = r6.f3604u
            int r3 = r4.mo4702e(r3)
            if (r3 <= r1) goto L_0x010f
            r1 = r3
        L_0x010f:
            int r0 = r0 + 1
            goto L_0x00fb
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 >= r13) goto L_0x0175
            android.view.View[] r3 = r6.f3582L
            r3 = r3[r0]
            androidx.recyclerview.widget.i r4 = r6.f3604u
            int r4 = r4.mo4702e(r3)
            if (r4 == r1) goto L_0x016f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.C1056b) r4
            android.graphics.Rect r5 = r4.f3803b
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.f3588e
            int r11 = r4.f3589f
            int r5 = r6.mo3946Z2(r5, r11)
            int r11 = r6.f3602s
            if (r11 != r8) goto L_0x015b
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.C1084o.m5071L(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016b
        L_0x015b:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.C1084o.m5071L(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016b:
            r6.m4670g3(r3, r4, r5, r8)
            goto L_0x0172
        L_0x016f:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0172:
            int r0 = r0 + 1
            goto L_0x0113
        L_0x0175:
            r12 = 0
            r7.f3615a = r1
            int r0 = r6.f3602s
            r3 = -1
            if (r0 != r8) goto L_0x018f
            int r0 = r2.f3624f
            if (r0 != r3) goto L_0x0187
            int r0 = r2.f3620b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018c
        L_0x0187:
            int r0 = r2.f3620b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018c:
            r1 = 0
            r3 = 0
            goto L_0x01a2
        L_0x018f:
            int r0 = r2.f3624f
            if (r0 != r3) goto L_0x019c
            int r0 = r2.f3620b
            int r1 = r0 - r1
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
            goto L_0x01a2
        L_0x019c:
            int r0 = r2.f3620b
            int r1 = r1 + r0
            r3 = r0
            r0 = 0
            r2 = 0
        L_0x01a2:
            if (r12 >= r13) goto L_0x022d
            android.view.View[] r4 = r6.f3582L
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C1056b) r10
            int r4 = r6.f3602s
            if (r4 != r8) goto L_0x01eb
            boolean r1 = r17.mo4002t2()
            if (r1 == 0) goto L_0x01d3
            int r1 = r17.mo4386g0()
            int[] r3 = r6.f3581K
            int r4 = r6.f3580J
            int r5 = r10.f3588e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.i r3 = r6.f3604u
            int r3 = r3.mo4703f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0200
        L_0x01d3:
            int r1 = r17.mo4386g0()
            int[] r3 = r6.f3581K
            int r4 = r10.f3588e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.i r3 = r6.f3604u
            int r3 = r3.mo4703f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0202
        L_0x01eb:
            int r0 = r17.mo4393j0()
            int[] r2 = r6.f3581K
            int r4 = r10.f3588e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.i r2 = r6.f3604u
            int r2 = r2.mo4703f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x0200:
            r16 = r3
        L_0x0202:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.mo4333C0(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo4431c()
            if (r0 != 0) goto L_0x0219
            boolean r0 = r10.mo4430b()
            if (r0 == 0) goto L_0x021b
        L_0x0219:
            r7.f3617c = r8
        L_0x021b:
            boolean r0 = r7.f3618d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f3618d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a2
        L_0x022d:
            android.view.View[] r0 = r6.f3582L
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3957v2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: w */
    public int mo3958w(RecyclerView.C1064a0 a0Var) {
        return this.f3587Q ? m4662W2(a0Var) : super.mo3958w(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x2 */
    public void mo3959x2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, LinearLayoutManager.C1058a aVar, int i) {
        super.mo3959x2(vVar, a0Var, aVar, i);
        m4671i3();
        if (a0Var.mo4196b() > 0 && !a0Var.mo4199e()) {
            m4663X2(vVar, a0Var, aVar, i);
        }
        m4664Y2();
    }

    /* renamed from: z1 */
    public int mo3960z1(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        m4671i3();
        m4664Y2();
        return super.mo3960z1(i, vVar, a0Var);
    }
}
