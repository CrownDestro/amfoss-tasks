package p083m0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p008os.C0549e;
import androidx.fragment.app.C0904i0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p083m0.C2539m;

@SuppressLint({"RestrictedApi"})
/* renamed from: m0.e */
public class C2517e extends C0904i0 {

    /* renamed from: m0.e$a */
    class C2518a extends C2539m.C2544e {

        /* renamed from: a */
        final /* synthetic */ Rect f8540a;

        C2518a(Rect rect) {
            this.f8540a = rect;
        }
    }

    /* renamed from: m0.e$b */
    class C2519b implements C2539m.C2545f {

        /* renamed from: a */
        final /* synthetic */ View f8542a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f8543b;

        C2519b(View view, ArrayList arrayList) {
            this.f8542a = view;
            this.f8543b = arrayList;
        }

        /* renamed from: a */
        public void mo9160a(C2539m mVar) {
            mVar.mo9192U(this);
            mVar.mo9198b(this);
        }

        /* renamed from: b */
        public void mo9147b(C2539m mVar) {
        }

        /* renamed from: c */
        public void mo9148c(C2539m mVar) {
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            mVar.mo9192U(this);
            this.f8542a.setVisibility(8);
            int size = this.f8543b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f8543b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: e */
        public void mo9150e(C2539m mVar) {
        }
    }

    /* renamed from: m0.e$c */
    class C2520c extends C2546n {

        /* renamed from: a */
        final /* synthetic */ Object f8545a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f8546b;

        /* renamed from: c */
        final /* synthetic */ Object f8547c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f8548d;

        /* renamed from: e */
        final /* synthetic */ Object f8549e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f8550f;

        C2520c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f8545a = obj;
            this.f8546b = arrayList;
            this.f8547c = obj2;
            this.f8548d = arrayList2;
            this.f8549e = obj3;
            this.f8550f = arrayList3;
        }

        /* renamed from: a */
        public void mo9160a(C2539m mVar) {
            Object obj = this.f8545a;
            if (obj != null) {
                C2517e.this.mo9159w(obj, this.f8546b, (ArrayList<View>) null);
            }
            Object obj2 = this.f8547c;
            if (obj2 != null) {
                C2517e.this.mo9159w(obj2, this.f8548d, (ArrayList<View>) null);
            }
            Object obj3 = this.f8549e;
            if (obj3 != null) {
                C2517e.this.mo9159w(obj3, this.f8550f, (ArrayList<View>) null);
            }
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            mVar.mo9192U(this);
        }
    }

    /* renamed from: m0.e$d */
    class C2521d implements C0549e.C0551b {

        /* renamed from: a */
        final /* synthetic */ C2539m f8552a;

        C2521d(C2539m mVar) {
            this.f8552a = mVar;
        }

        /* renamed from: a */
        public void mo2573a() {
            this.f8552a.cancel();
        }
    }

    /* renamed from: m0.e$e */
    class C2522e implements C2539m.C2545f {

        /* renamed from: a */
        final /* synthetic */ Runnable f8554a;

        C2522e(Runnable runnable) {
            this.f8554a = runnable;
        }

        /* renamed from: a */
        public void mo9160a(C2539m mVar) {
        }

        /* renamed from: b */
        public void mo9147b(C2539m mVar) {
        }

        /* renamed from: c */
        public void mo9148c(C2539m mVar) {
        }

        /* renamed from: d */
        public void mo9149d(C2539m mVar) {
            this.f8554a.run();
        }

        /* renamed from: e */
        public void mo9150e(C2539m mVar) {
        }
    }

    /* renamed from: m0.e$f */
    class C2523f extends C2539m.C2544e {

        /* renamed from: a */
        final /* synthetic */ Rect f8556a;

        C2523f(Rect rect) {
            this.f8556a = rect;
        }
    }

    /* renamed from: v */
    private static boolean m11539v(C2539m mVar) {
        return !C0904i0.m4050i(mVar.mo9184E()) || !C0904i0.m4050i(mVar.mo9185F()) || !C0904i0.m4050i(mVar.mo9186G());
    }

    /* renamed from: a */
    public void mo3485a(Object obj, View view) {
        if (obj != null) {
            ((C2539m) obj).mo9203d(view);
        }
    }

    /* renamed from: b */
    public void mo3486b(Object obj, ArrayList<View> arrayList) {
        C2539m mVar = (C2539m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C2551q) {
                C2551q qVar = (C2551q) mVar;
                int m0 = qVar.mo9231m0();
                while (i < m0) {
                    mo3486b(qVar.mo9230l0(i), arrayList);
                    i++;
                }
            } else if (!m11539v(mVar) && C0904i0.m4050i(mVar.mo9187H())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo9203d(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3487c(ViewGroup viewGroup, Object obj) {
        C2547o.m11678a(viewGroup, (C2539m) obj);
    }

    /* renamed from: e */
    public boolean mo3488e(Object obj) {
        return obj instanceof C2539m;
    }

    /* renamed from: f */
    public Object mo3489f(Object obj) {
        if (obj != null) {
            return ((C2539m) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo3490j(Object obj, Object obj2, Object obj3) {
        C2539m mVar = (C2539m) obj;
        C2539m mVar2 = (C2539m) obj2;
        C2539m mVar3 = (C2539m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new C2551q().mo9229j0(mVar).mo9229j0(mVar2).mo9236r0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C2551q qVar = new C2551q();
        if (mVar != null) {
            qVar.mo9229j0(mVar);
        }
        qVar.mo9229j0(mVar3);
        return qVar;
    }

    /* renamed from: k */
    public Object mo3491k(Object obj, Object obj2, Object obj3) {
        C2551q qVar = new C2551q();
        if (obj != null) {
            qVar.mo9229j0((C2539m) obj);
        }
        if (obj2 != null) {
            qVar.mo9229j0((C2539m) obj2);
        }
        if (obj3 != null) {
            qVar.mo9229j0((C2539m) obj3);
        }
        return qVar;
    }

    /* renamed from: m */
    public void mo3492m(Object obj, View view, ArrayList<View> arrayList) {
        ((C2539m) obj).mo9198b(new C2519b(view, arrayList));
    }

    /* renamed from: n */
    public void mo3493n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C2539m) obj).mo9198b(new C2520c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo3494o(Object obj, Rect rect) {
        if (obj != null) {
            ((C2539m) obj).mo9197a0(new C2523f(rect));
        }
    }

    /* renamed from: p */
    public void mo3495p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3518h(view, rect);
            ((C2539m) obj).mo9197a0(new C2518a(rect));
        }
    }

    /* renamed from: q */
    public void mo3496q(Fragment fragment, Object obj, C0549e eVar, Runnable runnable) {
        C2539m mVar = (C2539m) obj;
        eVar.mo2572b(new C2521d(mVar));
        mVar.mo9198b(new C2522e(runnable));
    }

    /* renamed from: s */
    public void mo3497s(Object obj, View view, ArrayList<View> arrayList) {
        C2551q qVar = (C2551q) obj;
        List<View> H = qVar.mo9187H();
        H.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0904i0.m4048d(H, arrayList.get(i));
        }
        H.add(view);
        arrayList.add(view);
        mo3486b(qVar, arrayList);
    }

    /* renamed from: t */
    public void mo3498t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2551q qVar = (C2551q) obj;
        if (qVar != null) {
            qVar.mo9187H().clear();
            qVar.mo9187H().addAll(arrayList2);
            mo9159w(qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo3499u(Object obj) {
        if (obj == null) {
            return null;
        }
        C2551q qVar = new C2551q();
        qVar.mo9229j0((C2539m) obj);
        return qVar;
    }

    /* renamed from: w */
    public void mo9159w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2539m mVar = (C2539m) obj;
        int i = 0;
        if (mVar instanceof C2551q) {
            C2551q qVar = (C2551q) mVar;
            int m0 = qVar.mo9231m0();
            while (i < m0) {
                mo9159w(qVar.mo9230l0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m11539v(mVar)) {
            List<View> H = mVar.mo9187H();
            if (H.size() == arrayList.size() && H.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.mo9203d(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.mo9193V(arrayList.get(size2));
                }
            }
        }
    }
}
