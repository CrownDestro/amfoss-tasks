package p083m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.C0735z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p070k.C2335a;
import p070k.C2340d;
import p070k.C2348g;

/* renamed from: m0.m */
public abstract class C2539m implements Cloneable {

    /* renamed from: I */
    private static final int[] f8590I = {2, 1, 3, 4};

    /* renamed from: J */
    private static final C2527g f8591J = new C2540a();

    /* renamed from: K */
    private static ThreadLocal<C2335a<Animator, C2543d>> f8592K = new ThreadLocal<>();

    /* renamed from: A */
    private int f8593A = 0;

    /* renamed from: B */
    private boolean f8594B = false;

    /* renamed from: C */
    private boolean f8595C = false;

    /* renamed from: D */
    private ArrayList<C2545f> f8596D = null;

    /* renamed from: E */
    private ArrayList<Animator> f8597E = new ArrayList<>();

    /* renamed from: F */
    private C2544e f8598F;

    /* renamed from: G */
    private C2335a<String, String> f8599G;

    /* renamed from: H */
    private C2527g f8600H = f8591J;

    /* renamed from: d */
    private String f8601d = getClass().getName();

    /* renamed from: e */
    private long f8602e = -1;

    /* renamed from: f */
    long f8603f = -1;

    /* renamed from: g */
    private TimeInterpolator f8604g = null;

    /* renamed from: h */
    ArrayList<Integer> f8605h = new ArrayList<>();

    /* renamed from: i */
    ArrayList<View> f8606i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<String> f8607j = null;

    /* renamed from: k */
    private ArrayList<Class<?>> f8608k = null;

    /* renamed from: l */
    private ArrayList<Integer> f8609l = null;

    /* renamed from: m */
    private ArrayList<View> f8610m = null;

    /* renamed from: n */
    private ArrayList<Class<?>> f8611n = null;

    /* renamed from: o */
    private ArrayList<String> f8612o = null;

    /* renamed from: p */
    private ArrayList<Integer> f8613p = null;

    /* renamed from: q */
    private ArrayList<View> f8614q = null;

    /* renamed from: r */
    private ArrayList<Class<?>> f8615r = null;

    /* renamed from: s */
    private C2556t f8616s = new C2556t();

    /* renamed from: t */
    private C2556t f8617t = new C2556t();

    /* renamed from: u */
    C2551q f8618u = null;

    /* renamed from: v */
    private int[] f8619v = f8590I;

    /* renamed from: w */
    private ArrayList<C2555s> f8620w;

    /* renamed from: x */
    private ArrayList<C2555s> f8621x;

    /* renamed from: y */
    boolean f8622y = false;

    /* renamed from: z */
    ArrayList<Animator> f8623z = new ArrayList<>();

    /* renamed from: m0.m$a */
    class C2540a extends C2527g {
        C2540a() {
        }

        /* renamed from: a */
        public Path mo9161a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: m0.m$b */
    class C2541b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C2335a f8624a;

        C2541b(C2335a aVar) {
            this.f8624a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f8624a.remove(animator);
            C2539m.this.f8623z.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C2539m.this.f8623z.add(animator);
        }
    }

    /* renamed from: m0.m$c */
    class C2542c extends AnimatorListenerAdapter {
        C2542c() {
        }

        public void onAnimationEnd(Animator animator) {
            C2539m.this.mo9215u();
            animator.removeListener(this);
        }
    }

    /* renamed from: m0.m$d */
    private static class C2543d {

        /* renamed from: a */
        View f8627a;

        /* renamed from: b */
        String f8628b;

        /* renamed from: c */
        C2555s f8629c;

        /* renamed from: d */
        C2535i0 f8630d;

        /* renamed from: e */
        C2539m f8631e;

        C2543d(View view, String str, C2539m mVar, C2535i0 i0Var, C2555s sVar) {
            this.f8627a = view;
            this.f8628b = str;
            this.f8629c = sVar;
            this.f8630d = i0Var;
            this.f8631e = mVar;
        }
    }

    /* renamed from: m0.m$e */
    public static abstract class C2544e {
    }

    /* renamed from: m0.m$f */
    public interface C2545f {
        /* renamed from: a */
        void mo9160a(C2539m mVar);

        /* renamed from: b */
        void mo9147b(C2539m mVar);

        /* renamed from: c */
        void mo9148c(C2539m mVar);

        /* renamed from: d */
        void mo9149d(C2539m mVar);

        /* renamed from: e */
        void mo9150e(C2539m mVar);
    }

    /* renamed from: C */
    private static C2335a<Animator, C2543d> m11615C() {
        C2335a<Animator, C2543d> aVar = f8592K.get();
        if (aVar != null) {
            return aVar;
        }
        C2335a<Animator, C2543d> aVar2 = new C2335a<>();
        f8592K.set(aVar2);
        return aVar2;
    }

    /* renamed from: M */
    private static boolean m11616M(C2555s sVar, C2555s sVar2, String str) {
        Object obj = sVar.f8650a.get(str);
        Object obj2 = sVar2.f8650a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: N */
    private void m11617N(C2335a<View, C2555s> aVar, C2335a<View, C2555s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo9189L(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo9189L(view)) {
                C2555s sVar = aVar.get(valueAt);
                C2555s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f8620w.add(sVar);
                    this.f8621x.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: O */
    private void m11618O(C2335a<View, C2555s> aVar, C2335a<View, C2555s> aVar2) {
        C2555s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.mo8789i(size);
            if (i != null && mo9189L(i) && (remove = aVar2.remove(i)) != null && mo9189L(remove.f8651b)) {
                this.f8620w.add(aVar.mo8792k(size));
                this.f8621x.add(remove);
            }
        }
    }

    /* renamed from: P */
    private void m11619P(C2335a<View, C2555s> aVar, C2335a<View, C2555s> aVar2, C2340d<View> dVar, C2340d<View> dVar2) {
        View i;
        int q = dVar.mo8705q();
        for (int i2 = 0; i2 < q; i2++) {
            View r = dVar.mo8706r(i2);
            if (r != null && mo9189L(r) && (i = dVar2.mo8698i(dVar.mo8701l(i2))) != null && mo9189L(i)) {
                C2555s sVar = aVar.get(r);
                C2555s sVar2 = aVar2.get(i);
                if (!(sVar == null || sVar2 == null)) {
                    this.f8620w.add(sVar);
                    this.f8621x.add(sVar2);
                    aVar.remove(r);
                    aVar2.remove(i);
                }
            }
        }
    }

    /* renamed from: Q */
    private void m11620Q(C2335a<View, C2555s> aVar, C2335a<View, C2555s> aVar2, C2335a<String, View> aVar3, C2335a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.mo8794m(i);
            if (m != null && mo9189L(m) && (view = aVar4.get(aVar3.mo8789i(i))) != null && mo9189L(view)) {
                C2555s sVar = aVar.get(m);
                C2555s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f8620w.add(sVar);
                    this.f8621x.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: R */
    private void m11621R(C2556t tVar, C2556t tVar2) {
        C2335a aVar = new C2335a((C2348g) tVar.f8653a);
        C2335a aVar2 = new C2335a((C2348g) tVar2.f8653a);
        int i = 0;
        while (true) {
            int[] iArr = this.f8619v;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m11618O(aVar, aVar2);
                } else if (i2 == 2) {
                    m11620Q(aVar, aVar2, tVar.f8656d, tVar2.f8656d);
                } else if (i2 == 3) {
                    m11617N(aVar, aVar2, tVar.f8654b, tVar2.f8654b);
                } else if (i2 == 4) {
                    m11619P(aVar, aVar2, tVar.f8655c, tVar2.f8655c);
                }
                i++;
            } else {
                m11623e(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: X */
    private void m11622X(Animator animator, C2335a<Animator, C2543d> aVar) {
        if (animator != null) {
            animator.addListener(new C2541b(aVar));
            mo9208i(animator);
        }
    }

    /* renamed from: e */
    private void m11623e(C2335a<View, C2555s> aVar, C2335a<View, C2555s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C2555s m = aVar.mo8794m(i);
            if (mo9189L(m.f8651b)) {
                this.f8620w.add(m);
                this.f8621x.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C2555s m2 = aVar2.mo8794m(i2);
            if (mo9189L(m2.f8651b)) {
                this.f8621x.add(m2);
                this.f8620w.add((Object) null);
            }
        }
    }

    /* renamed from: g */
    private static void m11624g(C2556t tVar, View view, C2555s sVar) {
        tVar.f8653a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f8654b.indexOfKey(id) >= 0) {
                tVar.f8654b.put(id, (Object) null);
            } else {
                tVar.f8654b.put(id, view);
            }
        }
        String M = C0735z.m3176M(view);
        if (M != null) {
            if (tVar.f8656d.containsKey(M)) {
                tVar.f8656d.put(M, null);
            } else {
                tVar.f8656d.put(M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f8655c.mo8700k(itemIdAtPosition) >= 0) {
                    View i = tVar.f8655c.mo8698i(itemIdAtPosition);
                    if (i != null) {
                        C0735z.m3153A0(i, false);
                        tVar.f8655c.mo8702m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0735z.m3153A0(view, true);
                tVar.f8655c.mo8702m(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: k */
    private void m11625k(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f8609l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f8610m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f8611n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f8611n.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C2555s sVar = new C2555s(view);
                        if (z) {
                            mo9118m(sVar);
                        } else {
                            mo9117j(sVar);
                        }
                        sVar.f8652c.add(this);
                        mo9209l(sVar);
                        m11624g(z ? this.f8616s : this.f8617t, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f8613p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f8614q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f8615r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f8615r.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m11625k(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public C2527g mo9181A() {
        return this.f8600H;
    }

    /* renamed from: B */
    public C2550p mo9182B() {
        return null;
    }

    /* renamed from: D */
    public long mo9183D() {
        return this.f8602e;
    }

    /* renamed from: E */
    public List<Integer> mo9184E() {
        return this.f8605h;
    }

    /* renamed from: F */
    public List<String> mo9185F() {
        return this.f8607j;
    }

    /* renamed from: G */
    public List<Class<?>> mo9186G() {
        return this.f8608k;
    }

    /* renamed from: H */
    public List<View> mo9187H() {
        return this.f8606i;
    }

    /* renamed from: I */
    public String[] mo9116I() {
        return null;
    }

    /* renamed from: J */
    public C2555s mo9188J(View view, boolean z) {
        C2551q qVar = this.f8618u;
        if (qVar != null) {
            return qVar.mo9188J(view, z);
        }
        return (z ? this.f8616s : this.f8617t).f8653a.get(view);
    }

    /* renamed from: K */
    public boolean mo9162K(C2555s sVar, C2555s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] I = mo9116I();
        if (I != null) {
            int length = I.length;
            int i = 0;
            while (i < length) {
                if (!m11616M(sVar, sVar2, I[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String M : sVar.f8650a.keySet()) {
            if (m11616M(sVar, sVar2, M)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo9189L(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f8609l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f8610m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f8611n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f8611n.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f8612o != null && C0735z.m3176M(view) != null && this.f8612o.contains(C0735z.m3176M(view))) {
            return false;
        }
        if ((this.f8605h.size() == 0 && this.f8606i.size() == 0 && (((arrayList = this.f8608k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8607j) == null || arrayList2.isEmpty()))) || this.f8605h.contains(Integer.valueOf(id)) || this.f8606i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f8607j;
        if (arrayList6 != null && arrayList6.contains(C0735z.m3176M(view))) {
            return true;
        }
        if (this.f8608k != null) {
            for (int i2 = 0; i2 < this.f8608k.size(); i2++) {
                if (this.f8608k.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: S */
    public void mo9190S(View view) {
        if (!this.f8595C) {
            for (int size = this.f8623z.size() - 1; size >= 0; size--) {
                C2496a.m11497b(this.f8623z.get(size));
            }
            ArrayList<C2545f> arrayList = this.f8596D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8596D.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((C2545f) arrayList2.get(i)).mo9148c(this);
                }
            }
            this.f8594B = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo9191T(ViewGroup viewGroup) {
        C2543d dVar;
        this.f8620w = new ArrayList<>();
        this.f8621x = new ArrayList<>();
        m11621R(this.f8616s, this.f8617t);
        C2335a<Animator, C2543d> C = m11615C();
        int size = C.size();
        C2535i0 d = C2562z.m11738d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = C.mo8789i(i);
            if (!(i2 == null || (dVar = C.get(i2)) == null || dVar.f8627a == null || !d.equals(dVar.f8630d))) {
                C2555s sVar = dVar.f8629c;
                View view = dVar.f8627a;
                C2555s J = mo9188J(view, true);
                C2555s y = mo9219y(view, true);
                if (J == null && y == null) {
                    y = this.f8617t.f8653a.get(view);
                }
                if (!(J == null && y == null) && dVar.f8631e.mo9162K(sVar, y)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        C.remove(i2);
                    }
                }
            }
        }
        mo9213t(viewGroup, this.f8616s, this.f8617t, this.f8620w, this.f8621x);
        mo9195Y();
    }

    /* renamed from: U */
    public C2539m mo9192U(C2545f fVar) {
        ArrayList<C2545f> arrayList = this.f8596D;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f8596D.size() == 0) {
            this.f8596D = null;
        }
        return this;
    }

    /* renamed from: V */
    public C2539m mo9193V(View view) {
        this.f8606i.remove(view);
        return this;
    }

    /* renamed from: W */
    public void mo9194W(View view) {
        if (this.f8594B) {
            if (!this.f8595C) {
                for (int size = this.f8623z.size() - 1; size >= 0; size--) {
                    C2496a.m11498c(this.f8623z.get(size));
                }
                ArrayList<C2545f> arrayList = this.f8596D;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f8596D.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((C2545f) arrayList2.get(i)).mo9150e(this);
                    }
                }
            }
            this.f8594B = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo9195Y() {
        mo9206f0();
        C2335a<Animator, C2543d> C = m11615C();
        Iterator<Animator> it = this.f8597E.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (C.containsKey(next)) {
                mo9206f0();
                m11622X(next, C);
            }
        }
        this.f8597E.clear();
        mo9215u();
    }

    /* renamed from: Z */
    public C2539m mo9196Z(long j) {
        this.f8603f = j;
        return this;
    }

    /* renamed from: a0 */
    public void mo9197a0(C2544e eVar) {
        this.f8598F = eVar;
    }

    /* renamed from: b */
    public C2539m mo9198b(C2545f fVar) {
        if (this.f8596D == null) {
            this.f8596D = new ArrayList<>();
        }
        this.f8596D.add(fVar);
        return this;
    }

    /* renamed from: b0 */
    public C2539m mo9199b0(TimeInterpolator timeInterpolator) {
        this.f8604g = timeInterpolator;
        return this;
    }

    /* renamed from: c0 */
    public void mo9200c0(C2527g gVar) {
        if (gVar == null) {
            gVar = f8591J;
        }
        this.f8600H = gVar;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f8623z.size() - 1; size >= 0; size--) {
            this.f8623z.get(size).cancel();
        }
        ArrayList<C2545f> arrayList = this.f8596D;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f8596D.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C2545f) arrayList2.get(i)).mo9147b(this);
            }
        }
    }

    /* renamed from: d */
    public C2539m mo9203d(View view) {
        this.f8606i.add(view);
        return this;
    }

    /* renamed from: d0 */
    public void mo9204d0(C2550p pVar) {
    }

    /* renamed from: e0 */
    public C2539m mo9205e0(long j) {
        this.f8602e = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo9206f0() {
        if (this.f8593A == 0) {
            ArrayList<C2545f> arrayList = this.f8596D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8596D.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C2545f) arrayList2.get(i)).mo9160a(this);
                }
            }
            this.f8595C = false;
        }
        this.f8593A++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public String mo9207g0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f8603f != -1) {
            str2 = str2 + "dur(" + this.f8603f + ") ";
        }
        if (this.f8602e != -1) {
            str2 = str2 + "dly(" + this.f8602e + ") ";
        }
        if (this.f8604g != null) {
            str2 = str2 + "interp(" + this.f8604g + ") ";
        }
        if (this.f8605h.size() <= 0 && this.f8606i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f8605h.size() > 0) {
            for (int i = 0; i < this.f8605h.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f8605h.get(i);
            }
        }
        if (this.f8606i.size() > 0) {
            for (int i2 = 0; i2 < this.f8606i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f8606i.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo9208i(Animator animator) {
        if (animator == null) {
            mo9215u();
            return;
        }
        if (mo9216v() >= 0) {
            animator.setDuration(mo9216v());
        }
        if (mo9183D() >= 0) {
            animator.setStartDelay(mo9183D() + animator.getStartDelay());
        }
        if (mo9218x() != null) {
            animator.setInterpolator(mo9218x());
        }
        animator.addListener(new C2542c());
        animator.start();
    }

    /* renamed from: j */
    public abstract void mo9117j(C2555s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9209l(C2555s sVar) {
    }

    /* renamed from: m */
    public abstract void mo9118m(C2555s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo9210o(ViewGroup viewGroup, boolean z) {
        C2335a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo9211p(z);
        if ((this.f8605h.size() > 0 || this.f8606i.size() > 0) && (((arrayList = this.f8607j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8608k) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f8605h.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f8605h.get(i).intValue());
                if (findViewById != null) {
                    C2555s sVar = new C2555s(findViewById);
                    if (z) {
                        mo9118m(sVar);
                    } else {
                        mo9117j(sVar);
                    }
                    sVar.f8652c.add(this);
                    mo9209l(sVar);
                    m11624g(z ? this.f8616s : this.f8617t, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f8606i.size(); i2++) {
                View view = this.f8606i.get(i2);
                C2555s sVar2 = new C2555s(view);
                if (z) {
                    mo9118m(sVar2);
                } else {
                    mo9117j(sVar2);
                }
                sVar2.f8652c.add(this);
                mo9209l(sVar2);
                m11624g(z ? this.f8616s : this.f8617t, view, sVar2);
            }
        } else {
            m11625k(viewGroup, z);
        }
        if (!z && (aVar = this.f8599G) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f8616s.f8656d.remove(this.f8599G.mo8789i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f8616s.f8656d.put(this.f8599G.mo8794m(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo9211p(boolean z) {
        C2556t tVar;
        if (z) {
            this.f8616s.f8653a.clear();
            this.f8616s.f8654b.clear();
            tVar = this.f8616s;
        } else {
            this.f8617t.f8653a.clear();
            this.f8617t.f8654b.clear();
            tVar = this.f8617t;
        }
        tVar.f8655c.mo8696d();
    }

    /* renamed from: q */
    public C2539m clone() {
        try {
            C2539m mVar = (C2539m) super.clone();
            mVar.f8597E = new ArrayList<>();
            mVar.f8616s = new C2556t();
            mVar.f8617t = new C2556t();
            mVar.f8620w = null;
            mVar.f8621x = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public Animator mo9119r(ViewGroup viewGroup, C2555s sVar, C2555s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9213t(ViewGroup viewGroup, C2556t tVar, C2556t tVar2, ArrayList<C2555s> arrayList, ArrayList<C2555s> arrayList2) {
        int i;
        Animator animator;
        C2555s sVar;
        View view;
        C2555s sVar2;
        Animator animator2;
        C2335a<Animator, C2543d> C = m11615C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C2555s sVar3 = arrayList.get(i2);
            C2555s sVar4 = arrayList2.get(i2);
            if (sVar3 != null && !sVar3.f8652c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f8652c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo9162K(sVar3, sVar4)) {
                    Animator r = mo9119r(viewGroup, sVar3, sVar4);
                    if (r != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f8651b;
                            String[] I = mo9116I();
                            if (I != null && I.length > 0) {
                                sVar2 = new C2555s(view2);
                                C2555s sVar5 = tVar2.f8653a.get(view2);
                                if (sVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < I.length) {
                                        sVar2.f8650a.put(I[i3], sVar5.f8650a.get(I[i3]));
                                        i3++;
                                        r = r;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = r;
                                i = size;
                                int size2 = C.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C2543d dVar = C.get(C.mo8789i(i4));
                                    if (dVar.f8629c != null && dVar.f8627a == view2 && dVar.f8628b.equals(mo9220z()) && dVar.f8629c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                C2556t tVar3 = tVar2;
                                i = size;
                                animator2 = r;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            C2556t tVar4 = tVar2;
                            i = size;
                            view = sVar3.f8651b;
                            animator = r;
                            sVar = null;
                        }
                        if (animator != null) {
                            C.put(animator, new C2543d(view, mo9220z(), this, C2562z.m11738d(viewGroup), sVar));
                            this.f8597E.add(animator);
                        }
                        i2++;
                        size = i;
                    }
                    C2556t tVar5 = tVar2;
                    i = size;
                    i2++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            C2556t tVar52 = tVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.f8597E.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    public String toString() {
        return mo9207g0("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo9215u() {
        int i = this.f8593A - 1;
        this.f8593A = i;
        if (i == 0) {
            ArrayList<C2545f> arrayList = this.f8596D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8596D.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2545f) arrayList2.get(i2)).mo9149d(this);
                }
            }
            for (int i3 = 0; i3 < this.f8616s.f8655c.mo8705q(); i3++) {
                View r = this.f8616s.f8655c.mo8706r(i3);
                if (r != null) {
                    C0735z.m3153A0(r, false);
                }
            }
            for (int i4 = 0; i4 < this.f8617t.f8655c.mo8705q(); i4++) {
                View r2 = this.f8617t.f8655c.mo8706r(i4);
                if (r2 != null) {
                    C0735z.m3153A0(r2, false);
                }
            }
            this.f8595C = true;
        }
    }

    /* renamed from: v */
    public long mo9216v() {
        return this.f8603f;
    }

    /* renamed from: w */
    public C2544e mo9217w() {
        return this.f8598F;
    }

    /* renamed from: x */
    public TimeInterpolator mo9218x() {
        return this.f8604g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C2555s mo9219y(View view, boolean z) {
        C2551q qVar = this.f8618u;
        if (qVar != null) {
            return qVar.mo9219y(view, z);
        }
        ArrayList<C2555s> arrayList = z ? this.f8620w : this.f8621x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C2555s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f8651b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f8621x : this.f8620w).get(i);
    }

    /* renamed from: z */
    public String mo9220z() {
        return this.f8601d;
    }
}
