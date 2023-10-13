package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1084o implements RecyclerView.C1101z.C1103b {

    /* renamed from: A */
    int f3594A = -1;

    /* renamed from: B */
    int f3595B = Integer.MIN_VALUE;

    /* renamed from: C */
    private boolean f3596C;

    /* renamed from: D */
    C1061d f3597D = null;

    /* renamed from: E */
    final C1058a f3598E = new C1058a();

    /* renamed from: F */
    private final C1059b f3599F = new C1059b();

    /* renamed from: G */
    private int f3600G = 2;

    /* renamed from: H */
    private int[] f3601H = new int[2];

    /* renamed from: s */
    int f3602s = 1;

    /* renamed from: t */
    private C1060c f3603t;

    /* renamed from: u */
    C1143i f3604u;

    /* renamed from: v */
    private boolean f3605v;

    /* renamed from: w */
    private boolean f3606w = false;

    /* renamed from: x */
    boolean f3607x = false;

    /* renamed from: y */
    private boolean f3608y = false;

    /* renamed from: z */
    private boolean f3609z = true;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1058a {

        /* renamed from: a */
        C1143i f3610a;

        /* renamed from: b */
        int f3611b;

        /* renamed from: c */
        int f3612c;

        /* renamed from: d */
        boolean f3613d;

        /* renamed from: e */
        boolean f3614e;

        C1058a() {
            mo4010e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4006a() {
            this.f3612c = this.f3613d ? this.f3610a.mo4706i() : this.f3610a.mo4710m();
        }

        /* renamed from: b */
        public void mo4007b(View view, int i) {
            this.f3612c = this.f3613d ? this.f3610a.mo4701d(view) + this.f3610a.mo4712o() : this.f3610a.mo4704g(view);
            this.f3611b = i;
        }

        /* renamed from: c */
        public void mo4008c(View view, int i) {
            int o = this.f3610a.mo4712o();
            if (o >= 0) {
                mo4007b(view, i);
                return;
            }
            this.f3611b = i;
            if (this.f3613d) {
                int i2 = (this.f3610a.mo4706i() - o) - this.f3610a.mo4701d(view);
                this.f3612c = this.f3610a.mo4706i() - i2;
                if (i2 > 0) {
                    int e = this.f3612c - this.f3610a.mo4702e(view);
                    int m = this.f3610a.mo4710m();
                    int min = e - (m + Math.min(this.f3610a.mo4704g(view) - m, 0));
                    if (min < 0) {
                        this.f3612c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3610a.mo4704g(view);
            int m2 = g - this.f3610a.mo4710m();
            this.f3612c = g;
            if (m2 > 0) {
                int i3 = (this.f3610a.mo4706i() - Math.min(0, (this.f3610a.mo4706i() - o) - this.f3610a.mo4701d(view))) - (g + this.f3610a.mo4702e(view));
                if (i3 < 0) {
                    this.f3612c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4009d(View view, RecyclerView.C1064a0 a0Var) {
            RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
            return !pVar.mo4431c() && pVar.mo4429a() >= 0 && pVar.mo4429a() < a0Var.mo4196b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4010e() {
            this.f3611b = -1;
            this.f3612c = Integer.MIN_VALUE;
            this.f3613d = false;
            this.f3614e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3611b + ", mCoordinate=" + this.f3612c + ", mLayoutFromEnd=" + this.f3613d + ", mValid=" + this.f3614e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1059b {

        /* renamed from: a */
        public int f3615a;

        /* renamed from: b */
        public boolean f3616b;

        /* renamed from: c */
        public boolean f3617c;

        /* renamed from: d */
        public boolean f3618d;

        protected C1059b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4012a() {
            this.f3615a = 0;
            this.f3616b = false;
            this.f3617c = false;
            this.f3618d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1060c {

        /* renamed from: a */
        boolean f3619a = true;

        /* renamed from: b */
        int f3620b;

        /* renamed from: c */
        int f3621c;

        /* renamed from: d */
        int f3622d;

        /* renamed from: e */
        int f3623e;

        /* renamed from: f */
        int f3624f;

        /* renamed from: g */
        int f3625g;

        /* renamed from: h */
        int f3626h = 0;

        /* renamed from: i */
        int f3627i = 0;

        /* renamed from: j */
        boolean f3628j = false;

        /* renamed from: k */
        int f3629k;

        /* renamed from: l */
        List<RecyclerView.C1070d0> f3630l = null;

        /* renamed from: m */
        boolean f3631m;

        C1060c() {
        }

        /* renamed from: e */
        private View m4802e() {
            int size = this.f3630l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3630l.get(i).f3745a;
                RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
                if (!pVar.mo4431c() && this.f3622d == pVar.mo4429a()) {
                    mo4014b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4013a() {
            mo4014b((View) null);
        }

        /* renamed from: b */
        public void mo4014b(View view) {
            View f = mo4017f(view);
            this.f3622d = f == null ? -1 : ((RecyclerView.C1089p) f.getLayoutParams()).mo4429a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4015c(RecyclerView.C1064a0 a0Var) {
            int i = this.f3622d;
            return i >= 0 && i < a0Var.mo4196b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo4016d(RecyclerView.C1096v vVar) {
            if (this.f3630l != null) {
                return m4802e();
            }
            View o = vVar.mo4477o(this.f3622d);
            this.f3622d += this.f3623e;
            return o;
        }

        /* renamed from: f */
        public View mo4017f(View view) {
            int a;
            int size = this.f3630l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3630l.get(i2).f3745a;
                RecyclerView.C1089p pVar = (RecyclerView.C1089p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo4431c() && (a = (pVar.mo4429a() - this.f3622d) * this.f3623e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C1061d implements Parcelable {
        public static final Parcelable.Creator<C1061d> CREATOR = new C1062a();

        /* renamed from: d */
        int f3632d;

        /* renamed from: e */
        int f3633e;

        /* renamed from: f */
        boolean f3634f;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C1062a implements Parcelable.Creator<C1061d> {
            C1062a() {
            }

            /* renamed from: a */
            public C1061d createFromParcel(Parcel parcel) {
                return new C1061d(parcel);
            }

            /* renamed from: b */
            public C1061d[] newArray(int i) {
                return new C1061d[i];
            }
        }

        public C1061d() {
        }

        C1061d(Parcel parcel) {
            this.f3632d = parcel.readInt();
            this.f3633e = parcel.readInt();
            this.f3634f = parcel.readInt() != 1 ? false : true;
        }

        public C1061d(C1061d dVar) {
            this.f3632d = dVar.f3632d;
            this.f3633e = dVar.f3633e;
            this.f3634f = dVar.f3634f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4018a() {
            return this.f3632d >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4019c() {
            this.f3632d = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3632d);
            parcel.writeInt(this.f3633e);
            parcel.writeInt(this.f3634f ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        mo3974F2(i);
        mo3975G2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1084o.C1088d l0 = RecyclerView.C1084o.m5074l0(context, attributeSet, i, i2);
        mo3974F2(l0.f3798a);
        mo3975G2(l0.f3800c);
        mo3935H2(l0.f3801d);
    }

    /* renamed from: A2 */
    private void m4715A2(RecyclerView.C1096v vVar, int i, int i2) {
        int K = mo4350K();
        if (i >= 0) {
            int h = (this.f3604u.mo4705h() - i) + i2;
            if (this.f3607x) {
                for (int i3 = 0; i3 < K; i3++) {
                    View J = mo4348J(i3);
                    if (this.f3604u.mo4704g(J) < h || this.f3604u.mo4714q(J) < h) {
                        m4743z2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = K - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View J2 = mo4348J(i5);
                if (this.f3604u.mo4704g(J2) < h || this.f3604u.mo4714q(J2) < h) {
                    m4743z2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: B2 */
    private void m4716B2(RecyclerView.C1096v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int K = mo4350K();
            if (this.f3607x) {
                int i4 = K - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View J = mo4348J(i5);
                    if (this.f3604u.mo4701d(J) > i3 || this.f3604u.mo4713p(J) > i3) {
                        m4743z2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < K; i6++) {
                View J2 = mo4348J(i6);
                if (this.f3604u.mo4701d(J2) > i3 || this.f3604u.mo4713p(J2) > i3) {
                    m4743z2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: D2 */
    private void m4717D2() {
        this.f3607x = (this.f3602s == 1 || !mo4002t2()) ? this.f3606w : !this.f3606w;
    }

    /* renamed from: I2 */
    private boolean m4718I2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, C1058a aVar) {
        boolean z = false;
        if (mo4350K() == 0) {
            return false;
        }
        View W = mo4368W();
        if (W != null && aVar.mo4009d(W, a0Var)) {
            aVar.mo4008c(W, mo4396k0(W));
            return true;
        } else if (this.f3605v != this.f3608y) {
            return false;
        } else {
            View l2 = aVar.f3613d ? m4735l2(vVar, a0Var) : m4736m2(vVar, a0Var);
            if (l2 == null) {
                return false;
            }
            aVar.mo4007b(l2, mo4396k0(l2));
            if (!a0Var.mo4199e() && mo3938O1()) {
                if (this.f3604u.mo4704g(l2) >= this.f3604u.mo4706i() || this.f3604u.mo4701d(l2) < this.f3604u.mo4710m()) {
                    z = true;
                }
                if (z) {
                    aVar.f3612c = aVar.f3613d ? this.f3604u.mo4706i() : this.f3604u.mo4710m();
                }
            }
            return true;
        }
    }

    /* renamed from: J2 */
    private boolean m4719J2(RecyclerView.C1064a0 a0Var, C1058a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo4199e() && (i = this.f3594A) != -1) {
            if (i < 0 || i >= a0Var.mo4196b()) {
                this.f3594A = -1;
                this.f3595B = Integer.MIN_VALUE;
            } else {
                aVar.f3611b = this.f3594A;
                C1061d dVar = this.f3597D;
                if (dVar != null && dVar.mo4018a()) {
                    boolean z2 = this.f3597D.f3634f;
                    aVar.f3613d = z2;
                    aVar.f3612c = z2 ? this.f3604u.mo4706i() - this.f3597D.f3633e : this.f3604u.mo4710m() + this.f3597D.f3633e;
                    return true;
                } else if (this.f3595B == Integer.MIN_VALUE) {
                    View D = mo3972D(this.f3594A);
                    if (D == null) {
                        if (mo4350K() > 0) {
                            if ((this.f3594A < mo4396k0(mo4348J(0))) == this.f3607x) {
                                z = true;
                            }
                            aVar.f3613d = z;
                        }
                        aVar.mo4006a();
                    } else if (this.f3604u.mo4702e(D) > this.f3604u.mo4711n()) {
                        aVar.mo4006a();
                        return true;
                    } else if (this.f3604u.mo4704g(D) - this.f3604u.mo4710m() < 0) {
                        aVar.f3612c = this.f3604u.mo4710m();
                        aVar.f3613d = false;
                        return true;
                    } else if (this.f3604u.mo4706i() - this.f3604u.mo4701d(D) < 0) {
                        aVar.f3612c = this.f3604u.mo4706i();
                        aVar.f3613d = true;
                        return true;
                    } else {
                        aVar.f3612c = aVar.f3613d ? this.f3604u.mo4701d(D) + this.f3604u.mo4712o() : this.f3604u.mo4704g(D);
                    }
                    return true;
                } else {
                    boolean z3 = this.f3607x;
                    aVar.f3613d = z3;
                    aVar.f3612c = z3 ? this.f3604u.mo4706i() - this.f3595B : this.f3604u.mo4710m() + this.f3595B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: K2 */
    private void m4720K2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, C1058a aVar) {
        if (!m4719J2(a0Var, aVar) && !m4718I2(vVar, a0Var, aVar)) {
            aVar.mo4006a();
            aVar.f3611b = this.f3608y ? a0Var.mo4196b() - 1 : 0;
        }
    }

    /* renamed from: L2 */
    private void m4721L2(int i, int i2, boolean z, RecyclerView.C1064a0 a0Var) {
        int i3;
        this.f3603t.f3631m = mo3971C2();
        this.f3603t.f3624f = i;
        int[] iArr = this.f3601H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo3980P1(a0Var, iArr);
        int max = Math.max(0, this.f3601H[0]);
        int max2 = Math.max(0, this.f3601H[1]);
        if (i == 1) {
            z2 = true;
        }
        C1060c cVar = this.f3603t;
        int i5 = z2 ? max2 : max;
        cVar.f3626h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f3627i = max;
        if (z2) {
            cVar.f3626h = i5 + this.f3604u.mo4707j();
            View p2 = m4739p2();
            C1060c cVar2 = this.f3603t;
            if (this.f3607x) {
                i4 = -1;
            }
            cVar2.f3623e = i4;
            int k0 = mo4396k0(p2);
            C1060c cVar3 = this.f3603t;
            cVar2.f3622d = k0 + cVar3.f3623e;
            cVar3.f3620b = this.f3604u.mo4701d(p2);
            i3 = this.f3604u.mo4701d(p2) - this.f3604u.mo4706i();
        } else {
            View q2 = m4740q2();
            this.f3603t.f3626h += this.f3604u.mo4710m();
            C1060c cVar4 = this.f3603t;
            if (!this.f3607x) {
                i4 = -1;
            }
            cVar4.f3623e = i4;
            int k02 = mo4396k0(q2);
            C1060c cVar5 = this.f3603t;
            cVar4.f3622d = k02 + cVar5.f3623e;
            cVar5.f3620b = this.f3604u.mo4704g(q2);
            i3 = (-this.f3604u.mo4704g(q2)) + this.f3604u.mo4710m();
        }
        C1060c cVar6 = this.f3603t;
        cVar6.f3621c = i2;
        if (z) {
            cVar6.f3621c = i2 - i3;
        }
        cVar6.f3625g = i3;
    }

    /* renamed from: M2 */
    private void m4722M2(int i, int i2) {
        this.f3603t.f3621c = this.f3604u.mo4706i() - i2;
        C1060c cVar = this.f3603t;
        cVar.f3623e = this.f3607x ? -1 : 1;
        cVar.f3622d = i;
        cVar.f3624f = 1;
        cVar.f3620b = i2;
        cVar.f3625g = Integer.MIN_VALUE;
    }

    /* renamed from: N2 */
    private void m4723N2(C1058a aVar) {
        m4722M2(aVar.f3611b, aVar.f3612c);
    }

    /* renamed from: O2 */
    private void m4724O2(int i, int i2) {
        this.f3603t.f3621c = i2 - this.f3604u.mo4710m();
        C1060c cVar = this.f3603t;
        cVar.f3622d = i;
        cVar.f3623e = this.f3607x ? 1 : -1;
        cVar.f3624f = -1;
        cVar.f3620b = i2;
        cVar.f3625g = Integer.MIN_VALUE;
    }

    /* renamed from: P2 */
    private void m4725P2(C1058a aVar) {
        m4724O2(aVar.f3611b, aVar.f3612c);
    }

    /* renamed from: R1 */
    private int m4726R1(RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0) {
            return 0;
        }
        mo3983W1();
        C1143i iVar = this.f3604u;
        View b2 = mo3987b2(!this.f3609z, true);
        return C1150l.m5699a(a0Var, iVar, b2, mo3985a2(!this.f3609z, true), this, this.f3609z);
    }

    /* renamed from: S1 */
    private int m4727S1(RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0) {
            return 0;
        }
        mo3983W1();
        C1143i iVar = this.f3604u;
        View b2 = mo3987b2(!this.f3609z, true);
        return C1150l.m5700b(a0Var, iVar, b2, mo3985a2(!this.f3609z, true), this, this.f3609z, this.f3607x);
    }

    /* renamed from: T1 */
    private int m4728T1(RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0) {
            return 0;
        }
        mo3983W1();
        C1143i iVar = this.f3604u;
        View b2 = mo3987b2(!this.f3609z, true);
        return C1150l.m5701c(a0Var, iVar, b2, mo3985a2(!this.f3609z, true), this, this.f3609z);
    }

    /* renamed from: Y1 */
    private View m4729Y1() {
        return mo3992g2(0, mo4350K());
    }

    /* renamed from: Z1 */
    private View m4730Z1(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return mo3951k2(vVar, a0Var, 0, mo4350K(), a0Var.mo4196b());
    }

    /* renamed from: d2 */
    private View m4731d2() {
        return mo3992g2(mo4350K() - 1, -1);
    }

    /* renamed from: e2 */
    private View m4732e2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return mo3951k2(vVar, a0Var, mo4350K() - 1, -1, a0Var.mo4196b());
    }

    /* renamed from: i2 */
    private View m4733i2() {
        return this.f3607x ? m4729Y1() : m4731d2();
    }

    /* renamed from: j2 */
    private View m4734j2() {
        return this.f3607x ? m4731d2() : m4729Y1();
    }

    /* renamed from: l2 */
    private View m4735l2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return this.f3607x ? m4730Z1(vVar, a0Var) : m4732e2(vVar, a0Var);
    }

    /* renamed from: m2 */
    private View m4736m2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return this.f3607x ? m4732e2(vVar, a0Var) : m4730Z1(vVar, a0Var);
    }

    /* renamed from: n2 */
    private int m4737n2(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, boolean z) {
        int i2;
        int i3 = this.f3604u.mo4706i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo3973E2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f3604u.mo4706i() - i5) <= 0) {
            return i4;
        }
        this.f3604u.mo4715r(i2);
        return i2 + i4;
    }

    /* renamed from: o2 */
    private int m4738o2(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.f3604u.mo4710m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo3973E2(m2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3604u.mo4710m()) <= 0) {
            return i2;
        }
        this.f3604u.mo4715r(-m);
        return i2 - m;
    }

    /* renamed from: p2 */
    private View m4739p2() {
        return mo4348J(this.f3607x ? 0 : mo4350K() - 1);
    }

    /* renamed from: q2 */
    private View m4740q2() {
        return mo4348J(this.f3607x ? mo4350K() - 1 : 0);
    }

    /* renamed from: w2 */
    private void m4741w2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, int i, int i2) {
        RecyclerView.C1096v vVar2 = vVar;
        RecyclerView.C1064a0 a0Var2 = a0Var;
        if (a0Var.mo4201g() && mo4350K() != 0 && !a0Var.mo4199e() && mo3938O1()) {
            List<RecyclerView.C1070d0> k = vVar.mo4473k();
            int size = k.size();
            int k0 = mo4396k0(mo4348J(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1070d0 d0Var = k.get(i5);
                if (!d0Var.mo4247v()) {
                    char c = 1;
                    if ((d0Var.mo4237m() < k0) != this.f3607x) {
                        c = 65535;
                    }
                    int e = this.f3604u.mo4702e(d0Var.f3745a);
                    if (c == 65535) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.f3603t.f3630l = k;
            if (i3 > 0) {
                m4724O2(mo4396k0(m4740q2()), i);
                C1060c cVar = this.f3603t;
                cVar.f3626h = i3;
                cVar.f3621c = 0;
                cVar.mo4013a();
                mo3984X1(vVar2, this.f3603t, a0Var2, false);
            }
            if (i4 > 0) {
                m4722M2(mo4396k0(m4739p2()), i2);
                C1060c cVar2 = this.f3603t;
                cVar2.f3626h = i4;
                cVar2.f3621c = 0;
                cVar2.mo4013a();
                mo3984X1(vVar2, this.f3603t, a0Var2, false);
            }
            this.f3603t.f3630l = null;
        }
    }

    /* renamed from: y2 */
    private void m4742y2(RecyclerView.C1096v vVar, C1060c cVar) {
        if (cVar.f3619a && !cVar.f3631m) {
            int i = cVar.f3625g;
            int i2 = cVar.f3627i;
            if (cVar.f3624f == -1) {
                m4715A2(vVar, i, i2);
            } else {
                m4716B2(vVar, i, i2);
            }
        }
    }

    /* renamed from: z2 */
    private void m4743z2(RecyclerView.C1096v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4407q1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo4407q1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: A1 */
    public void mo3970A1(int i) {
        this.f3594A = i;
        this.f3595B = Integer.MIN_VALUE;
        C1061d dVar = this.f3597D;
        if (dVar != null) {
            dVar.mo4019c();
        }
        mo4417w1();
    }

    /* renamed from: B1 */
    public int mo3930B1(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (this.f3602s == 0) {
            return 0;
        }
        return mo3973E2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C2 */
    public boolean mo3971C2() {
        return this.f3604u.mo4708k() == 0 && this.f3604u.mo4705h() == 0;
    }

    /* renamed from: D */
    public View mo3972D(int i) {
        int K = mo4350K();
        if (K == 0) {
            return null;
        }
        int k0 = i - mo4396k0(mo4348J(0));
        if (k0 >= 0 && k0 < K) {
            View J = mo4348J(k0);
            if (mo4396k0(J) == i) {
                return J;
            }
        }
        return super.mo3972D(i);
    }

    /* renamed from: E */
    public RecyclerView.C1089p mo3931E() {
        return new RecyclerView.C1089p(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E2 */
    public int mo3973E2(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0 || i == 0) {
            return 0;
        }
        mo3983W1();
        this.f3603t.f3619a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4721L2(i2, abs, true, a0Var);
        C1060c cVar = this.f3603t;
        int X1 = cVar.f3625g + mo3984X1(vVar, cVar, a0Var, false);
        if (X1 < 0) {
            return 0;
        }
        if (abs > X1) {
            i = i2 * X1;
        }
        this.f3604u.mo4715r(-i);
        this.f3603t.f3629k = i;
        return i;
    }

    /* renamed from: F2 */
    public void mo3974F2(int i) {
        if (i == 0 || i == 1) {
            mo3993h((String) null);
            if (i != this.f3602s || this.f3604u == null) {
                C1143i b = C1143i.m5623b(this, i);
                this.f3604u = b;
                this.f3598E.f3610a = b;
                this.f3602s = i;
                mo4417w1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: G2 */
    public void mo3975G2(boolean z) {
        mo3993h((String) null);
        if (z != this.f3606w) {
            this.f3606w = z;
            mo4417w1();
        }
    }

    /* renamed from: H2 */
    public void mo3935H2(boolean z) {
        mo3993h((String) null);
        if (this.f3608y != z) {
            this.f3608y = z;
            mo4417w1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public boolean mo3976J1() {
        return (mo4370Y() == 1073741824 || mo4410s0() == 1073741824 || !mo4412t0()) ? false : true;
    }

    /* renamed from: L0 */
    public void mo3977L0(RecyclerView recyclerView, RecyclerView.C1096v vVar) {
        super.mo3977L0(recyclerView, vVar);
        if (this.f3596C) {
            mo4401n1(vVar);
            vVar.mo4465c();
        }
    }

    /* renamed from: L1 */
    public void mo3978L1(RecyclerView recyclerView, RecyclerView.C1064a0 a0Var, int i) {
        C1140g gVar = new C1140g(recyclerView.getContext());
        gVar.mo4510p(i);
        mo4353M1(gVar);
    }

    /* renamed from: M0 */
    public View mo3936M0(View view, int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        int U1;
        m4717D2();
        if (mo4350K() == 0 || (U1 = mo3981U1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo3983W1();
        m4721L2(U1, (int) (((float) this.f3604u.mo4711n()) * 0.33333334f), false, a0Var);
        C1060c cVar = this.f3603t;
        cVar.f3625g = Integer.MIN_VALUE;
        cVar.f3619a = false;
        mo3984X1(vVar, cVar, a0Var, true);
        View j2 = U1 == -1 ? m4734j2() : m4733i2();
        View q2 = U1 == -1 ? m4740q2() : m4739p2();
        if (!q2.hasFocusable()) {
            return j2;
        }
        if (j2 == null) {
            return null;
        }
        return q2;
    }

    /* renamed from: N0 */
    public void mo3979N0(AccessibilityEvent accessibilityEvent) {
        super.mo3979N0(accessibilityEvent);
        if (mo4350K() > 0) {
            accessibilityEvent.setFromIndex(mo3988c2());
            accessibilityEvent.setToIndex(mo3990f2());
        }
    }

    /* renamed from: O1 */
    public boolean mo3938O1() {
        return this.f3597D == null && this.f3605v == this.f3608y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public void mo3980P1(RecyclerView.C1064a0 a0Var, int[] iArr) {
        int i;
        int r2 = mo4000r2(a0Var);
        if (this.f3603t.f3624f == -1) {
            i = 0;
        } else {
            i = r2;
            r2 = 0;
        }
        iArr[0] = r2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public void mo3939Q1(RecyclerView.C1064a0 a0Var, C1060c cVar, RecyclerView.C1084o.C1087c cVar2) {
        int i = cVar.f3622d;
        if (i >= 0 && i < a0Var.mo4196b()) {
            cVar2.mo4428a(i, Math.max(0, cVar.f3625g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public int mo3981U1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3602s == 1) ? 1 : Integer.MIN_VALUE : this.f3602s == 0 ? 1 : Integer.MIN_VALUE : this.f3602s == 1 ? -1 : Integer.MIN_VALUE : this.f3602s == 0 ? -1 : Integer.MIN_VALUE : (this.f3602s != 1 && mo4002t2()) ? -1 : 1 : (this.f3602s != 1 && mo4002t2()) ? 1 : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public C1060c mo3982V1() {
        return new C1060c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public void mo3983W1() {
        if (this.f3603t == null) {
            this.f3603t = mo3982V1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public int mo3984X1(RecyclerView.C1096v vVar, C1060c cVar, RecyclerView.C1064a0 a0Var, boolean z) {
        int i = cVar.f3621c;
        int i2 = cVar.f3625g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3625g = i2 + i;
            }
            m4742y2(vVar, cVar);
        }
        int i3 = cVar.f3621c + cVar.f3626h;
        C1059b bVar = this.f3599F;
        while (true) {
            if ((!cVar.f3631m && i3 <= 0) || !cVar.mo4015c(a0Var)) {
                break;
            }
            bVar.mo4012a();
            mo3957v2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3616b) {
                cVar.f3620b += bVar.f3615a * cVar.f3624f;
                if (!bVar.f3617c || cVar.f3630l != null || !a0Var.mo4199e()) {
                    int i4 = cVar.f3621c;
                    int i5 = bVar.f3615a;
                    cVar.f3621c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3625g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3615a;
                    cVar.f3625g = i7;
                    int i8 = cVar.f3621c;
                    if (i8 < 0) {
                        cVar.f3625g = i7 + i8;
                    }
                    m4742y2(vVar, cVar);
                }
                if (z && bVar.f3618d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3621c;
    }

    /* renamed from: a1 */
    public void mo3947a1(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View D;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3597D == null && this.f3594A == -1) && a0Var.mo4196b() == 0) {
            mo4401n1(vVar);
            return;
        }
        C1061d dVar = this.f3597D;
        if (dVar != null && dVar.mo4018a()) {
            this.f3594A = this.f3597D.f3632d;
        }
        mo3983W1();
        this.f3603t.f3619a = false;
        m4717D2();
        View W = mo4368W();
        C1058a aVar = this.f3598E;
        if (!aVar.f3614e || this.f3594A != -1 || this.f3597D != null) {
            aVar.mo4010e();
            C1058a aVar2 = this.f3598E;
            aVar2.f3613d = this.f3607x ^ this.f3608y;
            m4720K2(vVar, a0Var, aVar2);
            this.f3598E.f3614e = true;
        } else if (W != null && (this.f3604u.mo4704g(W) >= this.f3604u.mo4706i() || this.f3604u.mo4701d(W) <= this.f3604u.mo4710m())) {
            this.f3598E.mo4008c(W, mo4396k0(W));
        }
        C1060c cVar = this.f3603t;
        cVar.f3624f = cVar.f3629k >= 0 ? 1 : -1;
        int[] iArr = this.f3601H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3980P1(a0Var, iArr);
        int max = Math.max(0, this.f3601H[0]) + this.f3604u.mo4710m();
        int max2 = Math.max(0, this.f3601H[1]) + this.f3604u.mo4707j();
        if (!(!a0Var.mo4199e() || (i6 = this.f3594A) == -1 || this.f3595B == Integer.MIN_VALUE || (D = mo3972D(i6)) == null)) {
            if (this.f3607x) {
                i7 = this.f3604u.mo4706i() - this.f3604u.mo4701d(D);
                i8 = this.f3595B;
            } else {
                i8 = this.f3604u.mo4704g(D) - this.f3604u.mo4710m();
                i7 = this.f3595B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C1058a aVar3 = this.f3598E;
        if (!aVar3.f3613d ? !this.f3607x : this.f3607x) {
            i9 = 1;
        }
        mo3959x2(vVar, a0Var, aVar3, i9);
        mo4418x(vVar);
        this.f3603t.f3631m = mo3971C2();
        this.f3603t.f3628j = a0Var.mo4199e();
        this.f3603t.f3627i = 0;
        C1058a aVar4 = this.f3598E;
        if (aVar4.f3613d) {
            m4725P2(aVar4);
            C1060c cVar2 = this.f3603t;
            cVar2.f3626h = max;
            mo3984X1(vVar, cVar2, a0Var, false);
            C1060c cVar3 = this.f3603t;
            i2 = cVar3.f3620b;
            int i11 = cVar3.f3622d;
            int i12 = cVar3.f3621c;
            if (i12 > 0) {
                max2 += i12;
            }
            m4723N2(this.f3598E);
            C1060c cVar4 = this.f3603t;
            cVar4.f3626h = max2;
            cVar4.f3622d += cVar4.f3623e;
            mo3984X1(vVar, cVar4, a0Var, false);
            C1060c cVar5 = this.f3603t;
            i = cVar5.f3620b;
            int i13 = cVar5.f3621c;
            if (i13 > 0) {
                m4724O2(i11, i2);
                C1060c cVar6 = this.f3603t;
                cVar6.f3626h = i13;
                mo3984X1(vVar, cVar6, a0Var, false);
                i2 = this.f3603t.f3620b;
            }
        } else {
            m4723N2(aVar4);
            C1060c cVar7 = this.f3603t;
            cVar7.f3626h = max2;
            mo3984X1(vVar, cVar7, a0Var, false);
            C1060c cVar8 = this.f3603t;
            i = cVar8.f3620b;
            int i14 = cVar8.f3622d;
            int i15 = cVar8.f3621c;
            if (i15 > 0) {
                max += i15;
            }
            m4725P2(this.f3598E);
            C1060c cVar9 = this.f3603t;
            cVar9.f3626h = max;
            cVar9.f3622d += cVar9.f3623e;
            mo3984X1(vVar, cVar9, a0Var, false);
            C1060c cVar10 = this.f3603t;
            i2 = cVar10.f3620b;
            int i16 = cVar10.f3621c;
            if (i16 > 0) {
                m4722M2(i14, i);
                C1060c cVar11 = this.f3603t;
                cVar11.f3626h = i16;
                mo3984X1(vVar, cVar11, a0Var, false);
                i = this.f3603t.f3620b;
            }
        }
        if (mo4350K() > 0) {
            if (this.f3607x ^ this.f3608y) {
                int n2 = m4737n2(i, vVar, a0Var, true);
                i4 = i2 + n2;
                i3 = i + n2;
                i5 = m4738o2(i4, vVar, a0Var, false);
            } else {
                int o2 = m4738o2(i2, vVar, a0Var, true);
                i4 = i2 + o2;
                i3 = i + o2;
                i5 = m4737n2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m4741w2(vVar, a0Var, i2, i);
        if (!a0Var.mo4199e()) {
            this.f3604u.mo4716s();
        } else {
            this.f3598E.mo4010e();
        }
        this.f3605v = this.f3608y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public View mo3985a2(boolean z, boolean z2) {
        int K;
        int i;
        if (this.f3607x) {
            K = 0;
            i = mo4350K();
        } else {
            K = mo4350K() - 1;
            i = -1;
        }
        return mo3994h2(K, i, z, z2);
    }

    /* renamed from: b */
    public PointF mo3986b(int i) {
        if (mo4350K() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4396k0(mo4348J(0))) {
            z = true;
        }
        if (z != this.f3607x) {
            i2 = -1;
        }
        return this.f3602s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: b1 */
    public void mo3949b1(RecyclerView.C1064a0 a0Var) {
        super.mo3949b1(a0Var);
        this.f3597D = null;
        this.f3594A = -1;
        this.f3595B = Integer.MIN_VALUE;
        this.f3598E.mo4010e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public View mo3987b2(boolean z, boolean z2) {
        int i;
        int K;
        if (this.f3607x) {
            i = mo4350K() - 1;
            K = -1;
        } else {
            i = 0;
            K = mo4350K();
        }
        return mo3994h2(i, K, z, z2);
    }

    /* renamed from: c2 */
    public int mo3988c2() {
        View h2 = mo3994h2(0, mo4350K(), false, true);
        if (h2 == null) {
            return -1;
        }
        return mo4396k0(h2);
    }

    /* renamed from: f1 */
    public void mo3989f1(Parcelable parcelable) {
        if (parcelable instanceof C1061d) {
            this.f3597D = (C1061d) parcelable;
            mo4417w1();
        }
    }

    /* renamed from: f2 */
    public int mo3990f2() {
        View h2 = mo3994h2(mo4350K() - 1, -1, false, true);
        if (h2 == null) {
            return -1;
        }
        return mo4396k0(h2);
    }

    /* renamed from: g1 */
    public Parcelable mo3991g1() {
        if (this.f3597D != null) {
            return new C1061d(this.f3597D);
        }
        C1061d dVar = new C1061d();
        if (mo4350K() > 0) {
            mo3983W1();
            boolean z = this.f3605v ^ this.f3607x;
            dVar.f3634f = z;
            if (z) {
                View p2 = m4739p2();
                dVar.f3633e = this.f3604u.mo4706i() - this.f3604u.mo4701d(p2);
                dVar.f3632d = mo4396k0(p2);
            } else {
                View q2 = m4740q2();
                dVar.f3632d = mo4396k0(q2);
                dVar.f3633e = this.f3604u.mo4704g(q2) - this.f3604u.mo4710m();
            }
        } else {
            dVar.mo4019c();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public View mo3992g2(int i, int i2) {
        int i3;
        int i4;
        mo3983W1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4348J(i);
        }
        if (this.f3604u.mo4704g(mo4348J(i)) < this.f3604u.mo4710m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f3602s == 0 ? this.f3782e : this.f3783f).mo4744a(i, i2, i4, i3);
    }

    /* renamed from: h */
    public void mo3993h(String str) {
        if (this.f3597D == null) {
            super.mo3993h(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo3994h2(int i, int i2, boolean z, boolean z2) {
        mo3983W1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f3602s == 0 ? this.f3782e : this.f3783f).mo4744a(i, i2, i4, i3);
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
            if (k0 >= 0 && k0 < i3) {
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

    /* renamed from: l */
    public boolean mo3995l() {
        return this.f3602s == 0;
    }

    /* renamed from: m */
    public boolean mo3996m() {
        return this.f3602s == 1;
    }

    /* renamed from: p */
    public void mo3997p(int i, int i2, RecyclerView.C1064a0 a0Var, RecyclerView.C1084o.C1087c cVar) {
        if (this.f3602s != 0) {
            i = i2;
        }
        if (mo4350K() != 0 && i != 0) {
            mo3983W1();
            m4721L2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo3939Q1(a0Var, this.f3603t, cVar);
        }
    }

    /* renamed from: q */
    public void mo3998q(int i, RecyclerView.C1084o.C1087c cVar) {
        boolean z;
        int i2;
        C1061d dVar = this.f3597D;
        int i3 = -1;
        if (dVar == null || !dVar.mo4018a()) {
            m4717D2();
            z = this.f3607x;
            i2 = this.f3594A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C1061d dVar2 = this.f3597D;
            z = dVar2.f3634f;
            i2 = dVar2.f3632d;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3600G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo4428a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: r */
    public int mo3999r(RecyclerView.C1064a0 a0Var) {
        return m4726R1(a0Var);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: r2 */
    public int mo4000r2(RecyclerView.C1064a0 a0Var) {
        if (a0Var.mo4198d()) {
            return this.f3604u.mo4711n();
        }
        return 0;
    }

    /* renamed from: s */
    public int mo3954s(RecyclerView.C1064a0 a0Var) {
        return m4727S1(a0Var);
    }

    /* renamed from: s2 */
    public int mo4001s2() {
        return this.f3602s;
    }

    /* renamed from: t */
    public int mo3955t(RecyclerView.C1064a0 a0Var) {
        return m4728T1(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public boolean mo4002t2() {
        return mo4373a0() == 1;
    }

    /* renamed from: u */
    public int mo4003u(RecyclerView.C1064a0 a0Var) {
        return m4726R1(a0Var);
    }

    /* renamed from: u2 */
    public boolean mo4004u2() {
        return this.f3609z;
    }

    /* renamed from: v */
    public int mo3956v(RecyclerView.C1064a0 a0Var) {
        return m4727S1(a0Var);
    }

    /* renamed from: v0 */
    public boolean mo4005v0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v2 */
    public void mo3957v2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, C1060c cVar, C1059b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo4016d(vVar);
        if (d == null) {
            bVar.f3616b = true;
            return;
        }
        RecyclerView.C1089p pVar = (RecyclerView.C1089p) d.getLayoutParams();
        if (cVar.f3630l == null) {
            if (this.f3607x == (cVar.f3624f == -1)) {
                mo4381e(d);
            } else {
                mo4384f(d, 0);
            }
        } else {
            if (this.f3607x == (cVar.f3624f == -1)) {
                mo4375c(d);
            } else {
                mo4378d(d, 0);
            }
        }
        mo4335D0(d, 0, 0);
        bVar.f3615a = this.f3604u.mo4702e(d);
        if (this.f3602s == 1) {
            if (mo4002t2()) {
                i5 = mo4408r0() - mo4387h0();
                i4 = i5 - this.f3604u.mo4703f(d);
            } else {
                i4 = mo4386g0();
                i5 = this.f3604u.mo4703f(d) + i4;
            }
            int i6 = cVar.f3624f;
            int i7 = cVar.f3620b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f3615a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f3615a + i7;
            }
        } else {
            int j0 = mo4393j0();
            int f = this.f3604u.mo4703f(d) + j0;
            int i8 = cVar.f3624f;
            int i9 = cVar.f3620b;
            if (i8 == -1) {
                i2 = i9;
                i3 = j0;
                i = f;
                i4 = i9 - bVar.f3615a;
            } else {
                i3 = j0;
                i2 = bVar.f3615a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo4333C0(d, i4, i3, i2, i);
        if (pVar.mo4431c() || pVar.mo4430b()) {
            bVar.f3617c = true;
        }
        bVar.f3618d = d.hasFocusable();
    }

    /* renamed from: w */
    public int mo3958w(RecyclerView.C1064a0 a0Var) {
        return m4728T1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x2 */
    public void mo3959x2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, C1058a aVar, int i) {
    }

    /* renamed from: z1 */
    public int mo3960z1(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (this.f3602s == 1) {
            return 0;
        }
        return mo3973E2(i, vVar, a0Var);
    }
}
