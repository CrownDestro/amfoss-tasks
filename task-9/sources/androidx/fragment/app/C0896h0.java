package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p008os.C0549e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.h0 */
class C0896h0 extends C0904i0 {

    /* renamed from: androidx.fragment.app.h0$a */
    class C0897a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3172a;

        C0897a(Rect rect) {
            this.f3172a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3172a;
        }
    }

    /* renamed from: androidx.fragment.app.h0$b */
    class C0898b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3174a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3175b;

        C0898b(View view, ArrayList arrayList) {
            this.f3174a = view;
            this.f3175b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C0902f.m4046b(transition, this);
            this.f3174a.setVisibility(8);
            int size = this.f3175b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3175b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            C0902f.m4046b(transition, this);
            C0902f.m4045a(transition, this);
        }
    }

    /* renamed from: androidx.fragment.app.h0$c */
    class C0899c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3177a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3178b;

        /* renamed from: c */
        final /* synthetic */ Object f3179c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3180d;

        /* renamed from: e */
        final /* synthetic */ Object f3181e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3182f;

        C0899c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3177a = obj;
            this.f3178b = arrayList;
            this.f3179c = obj2;
            this.f3180d = arrayList2;
            this.f3181e = obj3;
            this.f3182f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C0902f.m4046b(transition, this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3177a;
            if (obj != null) {
                C0896h0.this.mo3500w(obj, this.f3178b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3179c;
            if (obj2 != null) {
                C0896h0.this.mo3500w(obj2, this.f3180d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3181e;
            if (obj3 != null) {
                C0896h0.this.mo3500w(obj3, this.f3182f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.h0$d */
    class C0900d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3184a;

        C0900d(Runnable runnable) {
            this.f3184a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3184a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.h0$e */
    class C0901e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3186a;

        C0901e(Rect rect) {
            this.f3186a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3186a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3186a;
        }
    }

    /* renamed from: androidx.fragment.app.h0$f */
    static class C0902f {
        /* renamed from: a */
        static void m4045a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        static void m4046b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    C0896h0() {
    }

    /* renamed from: v */
    private static boolean m4028v(Transition transition) {
        return !C0904i0.m4050i(transition.getTargetIds()) || !C0904i0.m4050i(transition.getTargetNames()) || !C0904i0.m4050i(transition.getTargetTypes());
    }

    /* renamed from: a */
    public void mo3485a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo3486b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3486b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m4028v(transition) && C0904i0.m4050i(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3487c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo3488e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public Object mo3489f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo3490j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: k */
    public Object mo3491k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo3492m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0898b(view, arrayList));
    }

    /* renamed from: n */
    public void mo3493n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0899c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo3494o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0901e(rect));
        }
    }

    /* renamed from: p */
    public void mo3495p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3518h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0897a(rect));
        }
    }

    /* renamed from: q */
    public void mo3496q(Fragment fragment, Object obj, C0549e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0900d(runnable));
    }

    /* renamed from: s */
    public void mo3497s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0904i0.m4048d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3486b(transitionSet, arrayList);
    }

    /* renamed from: t */
    public void mo3498t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3500w(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo3499u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void mo3500w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3500w(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m4028v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
