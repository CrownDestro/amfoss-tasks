package p083m0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0735z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p070k.C2335a;

/* renamed from: m0.o */
public class C2547o {

    /* renamed from: a */
    private static C2539m f8632a = new C2498b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C2335a<ViewGroup, ArrayList<C2539m>>>> f8633b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f8634c = new ArrayList<>();

    /* renamed from: m0.o$a */
    private static class C2548a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: d */
        C2539m f8635d;

        /* renamed from: e */
        ViewGroup f8636e;

        /* renamed from: m0.o$a$a */
        class C2549a extends C2546n {

            /* renamed from: a */
            final /* synthetic */ C2335a f8637a;

            C2549a(C2335a aVar) {
                this.f8637a = aVar;
            }

            /* renamed from: d */
            public void mo9149d(C2539m mVar) {
                ((ArrayList) this.f8637a.get(C2548a.this.f8636e)).remove(mVar);
                mVar.mo9192U(this);
            }
        }

        C2548a(C2539m mVar, ViewGroup viewGroup) {
            this.f8635d = mVar;
            this.f8636e = viewGroup;
        }

        /* renamed from: a */
        private void m11682a() {
            this.f8636e.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f8636e.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m11682a();
            if (!C2547o.f8634c.remove(this.f8636e)) {
                return true;
            }
            C2335a<ViewGroup, ArrayList<C2539m>> b = C2547o.m11679b();
            ArrayList arrayList = b.get(this.f8636e);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f8636e, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f8635d);
            this.f8635d.mo9198b(new C2549a(b));
            this.f8635d.mo9210o(this.f8636e, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C2539m) it.next()).mo9194W(this.f8636e);
                }
            }
            this.f8635d.mo9191T(this.f8636e);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m11682a();
            C2547o.f8634c.remove(this.f8636e);
            ArrayList arrayList = C2547o.m11679b().get(this.f8636e);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2539m) it.next()).mo9194W(this.f8636e);
                }
            }
            this.f8635d.mo9211p(true);
        }
    }

    /* renamed from: a */
    public static void m11678a(ViewGroup viewGroup, C2539m mVar) {
        if (!f8634c.contains(viewGroup) && C0735z.m3188V(viewGroup)) {
            f8634c.add(viewGroup);
            if (mVar == null) {
                mVar = f8632a;
            }
            C2539m q = mVar.clone();
            m11681d(viewGroup, q);
            C2538l.m11613c(viewGroup, (C2538l) null);
            m11680c(viewGroup, q);
        }
    }

    /* renamed from: b */
    static C2335a<ViewGroup, ArrayList<C2539m>> m11679b() {
        C2335a<ViewGroup, ArrayList<C2539m>> aVar;
        WeakReference weakReference = f8633b.get();
        if (weakReference != null && (aVar = (C2335a) weakReference.get()) != null) {
            return aVar;
        }
        C2335a<ViewGroup, ArrayList<C2539m>> aVar2 = new C2335a<>();
        f8633b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m11680c(ViewGroup viewGroup, C2539m mVar) {
        if (mVar != null && viewGroup != null) {
            C2548a aVar = new C2548a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m11681d(ViewGroup viewGroup, C2539m mVar) {
        ArrayList arrayList = m11679b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2539m) it.next()).mo9190S(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo9210o(viewGroup, true);
        }
        C2538l b = C2538l.m11612b(viewGroup);
        if (b != null) {
            b.mo9180a();
        }
    }
}
