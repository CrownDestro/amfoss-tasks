package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0735z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
public class C1119c extends C1151m {

    /* renamed from: s */
    private static TimeInterpolator f3910s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C1070d0> f3911h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C1070d0> f3912i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1129j> f3913j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1128i> f3914k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C1070d0>> f3915l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1129j>> f3916m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1128i>> f3917n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C1070d0> f3918o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C1070d0> f3919p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C1070d0> f3920q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C1070d0> f3921r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    class C1120a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f3922d;

        C1120a(ArrayList arrayList) {
            this.f3922d = arrayList;
        }

        public void run() {
            Iterator it = this.f3922d.iterator();
            while (it.hasNext()) {
                C1129j jVar = (C1129j) it.next();
                C1119c.this.mo4639S(jVar.f3956a, jVar.f3957b, jVar.f3958c, jVar.f3959d, jVar.f3960e);
            }
            this.f3922d.clear();
            C1119c.this.f3916m.remove(this.f3922d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    class C1121b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f3924d;

        C1121b(ArrayList arrayList) {
            this.f3924d = arrayList;
        }

        public void run() {
            Iterator it = this.f3924d.iterator();
            while (it.hasNext()) {
                C1119c.this.mo4638R((C1128i) it.next());
            }
            this.f3924d.clear();
            C1119c.this.f3917n.remove(this.f3924d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    class C1122c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f3926d;

        C1122c(ArrayList arrayList) {
            this.f3926d = arrayList;
        }

        public void run() {
            Iterator it = this.f3926d.iterator();
            while (it.hasNext()) {
                C1119c.this.mo4637Q((RecyclerView.C1070d0) it.next());
            }
            this.f3926d.clear();
            C1119c.this.f3915l.remove(this.f3926d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    class C1123d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1070d0 f3928a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3929b;

        /* renamed from: c */
        final /* synthetic */ View f3930c;

        C1123d(RecyclerView.C1070d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3928a = d0Var;
            this.f3929b = viewPropertyAnimator;
            this.f3930c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3929b.setListener((Animator.AnimatorListener) null);
            this.f3930c.setAlpha(1.0f);
            C1119c.this.mo4731G(this.f3928a);
            C1119c.this.f3920q.remove(this.f3928a);
            C1119c.this.mo4641V();
        }

        public void onAnimationStart(Animator animator) {
            C1119c.this.mo4732H(this.f3928a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    class C1124e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1070d0 f3932a;

        /* renamed from: b */
        final /* synthetic */ View f3933b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3934c;

        C1124e(RecyclerView.C1070d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3932a = d0Var;
            this.f3933b = view;
            this.f3934c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3933b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3934c.setListener((Animator.AnimatorListener) null);
            C1119c.this.mo4725A(this.f3932a);
            C1119c.this.f3918o.remove(this.f3932a);
            C1119c.this.mo4641V();
        }

        public void onAnimationStart(Animator animator) {
            C1119c.this.mo4726B(this.f3932a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    class C1125f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1070d0 f3936a;

        /* renamed from: b */
        final /* synthetic */ int f3937b;

        /* renamed from: c */
        final /* synthetic */ View f3938c;

        /* renamed from: d */
        final /* synthetic */ int f3939d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3940e;

        C1125f(RecyclerView.C1070d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3936a = d0Var;
            this.f3937b = i;
            this.f3938c = view;
            this.f3939d = i2;
            this.f3940e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3937b != 0) {
                this.f3938c.setTranslationX(0.0f);
            }
            if (this.f3939d != 0) {
                this.f3938c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3940e.setListener((Animator.AnimatorListener) null);
            C1119c.this.mo4729E(this.f3936a);
            C1119c.this.f3919p.remove(this.f3936a);
            C1119c.this.mo4641V();
        }

        public void onAnimationStart(Animator animator) {
            C1119c.this.mo4730F(this.f3936a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    class C1126g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1128i f3942a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3943b;

        /* renamed from: c */
        final /* synthetic */ View f3944c;

        C1126g(C1128i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3942a = iVar;
            this.f3943b = viewPropertyAnimator;
            this.f3944c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3943b.setListener((Animator.AnimatorListener) null);
            this.f3944c.setAlpha(1.0f);
            this.f3944c.setTranslationX(0.0f);
            this.f3944c.setTranslationY(0.0f);
            C1119c.this.mo4727C(this.f3942a.f3950a, true);
            C1119c.this.f3921r.remove(this.f3942a.f3950a);
            C1119c.this.mo4641V();
        }

        public void onAnimationStart(Animator animator) {
            C1119c.this.mo4728D(this.f3942a.f3950a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    class C1127h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1128i f3946a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3947b;

        /* renamed from: c */
        final /* synthetic */ View f3948c;

        C1127h(C1128i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3946a = iVar;
            this.f3947b = viewPropertyAnimator;
            this.f3948c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3947b.setListener((Animator.AnimatorListener) null);
            this.f3948c.setAlpha(1.0f);
            this.f3948c.setTranslationX(0.0f);
            this.f3948c.setTranslationY(0.0f);
            C1119c.this.mo4727C(this.f3946a.f3951b, false);
            C1119c.this.f3921r.remove(this.f3946a.f3951b);
            C1119c.this.mo4641V();
        }

        public void onAnimationStart(Animator animator) {
            C1119c.this.mo4728D(this.f3946a.f3951b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    private static class C1128i {

        /* renamed from: a */
        public RecyclerView.C1070d0 f3950a;

        /* renamed from: b */
        public RecyclerView.C1070d0 f3951b;

        /* renamed from: c */
        public int f3952c;

        /* renamed from: d */
        public int f3953d;

        /* renamed from: e */
        public int f3954e;

        /* renamed from: f */
        public int f3955f;

        private C1128i(RecyclerView.C1070d0 d0Var, RecyclerView.C1070d0 d0Var2) {
            this.f3950a = d0Var;
            this.f3951b = d0Var2;
        }

        C1128i(RecyclerView.C1070d0 d0Var, RecyclerView.C1070d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f3952c = i;
            this.f3953d = i2;
            this.f3954e = i3;
            this.f3955f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3950a + ", newHolder=" + this.f3951b + ", fromX=" + this.f3952c + ", fromY=" + this.f3953d + ", toX=" + this.f3954e + ", toY=" + this.f3955f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    private static class C1129j {

        /* renamed from: a */
        public RecyclerView.C1070d0 f3956a;

        /* renamed from: b */
        public int f3957b;

        /* renamed from: c */
        public int f3958c;

        /* renamed from: d */
        public int f3959d;

        /* renamed from: e */
        public int f3960e;

        C1129j(RecyclerView.C1070d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3956a = d0Var;
            this.f3957b = i;
            this.f3958c = i2;
            this.f3959d = i3;
            this.f3960e = i4;
        }
    }

    /* renamed from: T */
    private void m5536T(RecyclerView.C1070d0 d0Var) {
        View view = d0Var.f3745a;
        ViewPropertyAnimator animate = view.animate();
        this.f3920q.add(d0Var);
        animate.setDuration(mo4310o()).alpha(0.0f).setListener(new C1123d(d0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m5537W(List<C1128i> list, RecyclerView.C1070d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1128i iVar = list.get(size);
            if (m5539Y(iVar, d0Var) && iVar.f3950a == null && iVar.f3951b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m5538X(C1128i iVar) {
        RecyclerView.C1070d0 d0Var = iVar.f3950a;
        if (d0Var != null) {
            m5539Y(iVar, d0Var);
        }
        RecyclerView.C1070d0 d0Var2 = iVar.f3951b;
        if (d0Var2 != null) {
            m5539Y(iVar, d0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m5539Y(C1128i iVar, RecyclerView.C1070d0 d0Var) {
        boolean z = false;
        if (iVar.f3951b == d0Var) {
            iVar.f3951b = null;
        } else if (iVar.f3950a != d0Var) {
            return false;
        } else {
            iVar.f3950a = null;
            z = true;
        }
        d0Var.f3745a.setAlpha(1.0f);
        d0Var.f3745a.setTranslationX(0.0f);
        d0Var.f3745a.setTranslationY(0.0f);
        mo4727C(d0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m5540Z(RecyclerView.C1070d0 d0Var) {
        if (f3910s == null) {
            f3910s = new ValueAnimator().getInterpolator();
        }
        d0Var.f3745a.animate().setInterpolator(f3910s);
        mo4305j(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo4637Q(RecyclerView.C1070d0 d0Var) {
        View view = d0Var.f3745a;
        ViewPropertyAnimator animate = view.animate();
        this.f3918o.add(d0Var);
        animate.alpha(1.0f).setDuration(mo4307l()).setListener(new C1124e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4638R(C1128i iVar) {
        RecyclerView.C1070d0 d0Var = iVar.f3950a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3745a;
        RecyclerView.C1070d0 d0Var2 = iVar.f3951b;
        if (d0Var2 != null) {
            view = d0Var2.f3745a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo4308m());
            this.f3921r.add(iVar.f3950a);
            duration.translationX((float) (iVar.f3954e - iVar.f3952c));
            duration.translationY((float) (iVar.f3955f - iVar.f3953d));
            duration.alpha(0.0f).setListener(new C1126g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f3921r.add(iVar.f3951b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4308m()).alpha(1.0f).setListener(new C1127h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo4639S(RecyclerView.C1070d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3745a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3919p.add(d0Var);
        animate.setDuration(mo4309n()).setListener(new C1125f(d0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo4640U(List<RecyclerView.C1070d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3745a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo4641V() {
        if (!mo4311p()) {
            mo4304i();
        }
    }

    /* renamed from: g */
    public boolean mo4302g(RecyclerView.C1070d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4302g(d0Var, list);
    }

    /* renamed from: j */
    public void mo4305j(RecyclerView.C1070d0 d0Var) {
        View view = d0Var.f3745a;
        view.animate().cancel();
        int size = this.f3913j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3913j.get(size).f3956a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4729E(d0Var);
                this.f3913j.remove(size);
            }
        }
        m5537W(this.f3914k, d0Var);
        if (this.f3911h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo4731G(d0Var);
        }
        if (this.f3912i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo4725A(d0Var);
        }
        for (int size2 = this.f3917n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3917n.get(size2);
            m5537W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3917n.remove(size2);
            }
        }
        for (int size3 = this.f3916m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3916m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1129j) arrayList2.get(size4)).f3956a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4729E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3916m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3915l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3915l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo4725A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3915l.remove(size5);
                }
            }
        }
        this.f3920q.remove(d0Var);
        this.f3918o.remove(d0Var);
        this.f3921r.remove(d0Var);
        this.f3919p.remove(d0Var);
        mo4641V();
    }

    /* renamed from: k */
    public void mo4306k() {
        int size = this.f3913j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1129j jVar = this.f3913j.get(size);
            View view = jVar.f3956a.f3745a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4729E(jVar.f3956a);
            this.f3913j.remove(size);
        }
        for (int size2 = this.f3911h.size() - 1; size2 >= 0; size2--) {
            mo4731G(this.f3911h.get(size2));
            this.f3911h.remove(size2);
        }
        int size3 = this.f3912i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1070d0 d0Var = this.f3912i.get(size3);
            d0Var.f3745a.setAlpha(1.0f);
            mo4725A(d0Var);
            this.f3912i.remove(size3);
        }
        for (int size4 = this.f3914k.size() - 1; size4 >= 0; size4--) {
            m5538X(this.f3914k.get(size4));
        }
        this.f3914k.clear();
        if (mo4311p()) {
            for (int size5 = this.f3916m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3916m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1129j jVar2 = (C1129j) arrayList.get(size6);
                    View view2 = jVar2.f3956a.f3745a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4729E(jVar2.f3956a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3916m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3915l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3915l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1070d0 d0Var2 = (RecyclerView.C1070d0) arrayList2.get(size8);
                    d0Var2.f3745a.setAlpha(1.0f);
                    mo4725A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3915l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3917n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3917n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5538X((C1128i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3917n.remove(arrayList3);
                    }
                }
            }
            mo4640U(this.f3920q);
            mo4640U(this.f3919p);
            mo4640U(this.f3918o);
            mo4640U(this.f3921r);
            mo4304i();
        }
    }

    /* renamed from: p */
    public boolean mo4311p() {
        return !this.f3912i.isEmpty() || !this.f3914k.isEmpty() || !this.f3913j.isEmpty() || !this.f3911h.isEmpty() || !this.f3919p.isEmpty() || !this.f3920q.isEmpty() || !this.f3918o.isEmpty() || !this.f3921r.isEmpty() || !this.f3916m.isEmpty() || !this.f3915l.isEmpty() || !this.f3917n.isEmpty();
    }

    /* renamed from: u */
    public void mo4316u() {
        boolean z = !this.f3911h.isEmpty();
        boolean z2 = !this.f3913j.isEmpty();
        boolean z3 = !this.f3914k.isEmpty();
        boolean z4 = !this.f3912i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1070d0> it = this.f3911h.iterator();
            while (it.hasNext()) {
                m5536T(it.next());
            }
            this.f3911h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3913j);
                this.f3916m.add(arrayList);
                this.f3913j.clear();
                C1120a aVar = new C1120a(arrayList);
                if (z) {
                    C0735z.m3214k0(((C1129j) arrayList.get(0)).f3956a.f3745a, aVar, mo4310o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3914k);
                this.f3917n.add(arrayList2);
                this.f3914k.clear();
                C1121b bVar = new C1121b(arrayList2);
                if (z) {
                    C0735z.m3214k0(((C1128i) arrayList2.get(0)).f3950a.f3745a, bVar, mo4310o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3912i);
                this.f3915l.add(arrayList3);
                this.f3912i.clear();
                C1122c cVar = new C1122c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4310o() : 0;
                    long n = z2 ? mo4309n() : 0;
                    if (z3) {
                        j = mo4308m();
                    }
                    C0735z.m3214k0(((RecyclerView.C1070d0) arrayList3.get(0)).f3745a, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo4642w(RecyclerView.C1070d0 d0Var) {
        m5540Z(d0Var);
        d0Var.f3745a.setAlpha(0.0f);
        this.f3912i.add(d0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo4643x(RecyclerView.C1070d0 d0Var, RecyclerView.C1070d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo4644y(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f3745a.getTranslationX();
        float translationY = d0Var.f3745a.getTranslationY();
        float alpha = d0Var.f3745a.getAlpha();
        m5540Z(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f3745a.setTranslationX(translationX);
        d0Var.f3745a.setTranslationY(translationY);
        d0Var.f3745a.setAlpha(alpha);
        if (d0Var2 != null) {
            m5540Z(d0Var2);
            d0Var2.f3745a.setTranslationX((float) (-i5));
            d0Var2.f3745a.setTranslationY((float) (-i6));
            d0Var2.f3745a.setAlpha(0.0f);
        }
        this.f3914k.add(new C1128i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo4644y(RecyclerView.C1070d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3745a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f3745a.getTranslationY());
        m5540Z(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4729E(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3913j.add(new C1129j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo4645z(RecyclerView.C1070d0 d0Var) {
        m5540Z(d0Var);
        this.f3911h.add(d0Var);
        return true;
    }
}
