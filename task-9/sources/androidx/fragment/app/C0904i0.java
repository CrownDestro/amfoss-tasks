package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p008os.C0549e;
import androidx.core.view.C0732w;
import androidx.core.view.C0735z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.i0 */
public abstract class C0904i0 {

    /* renamed from: androidx.fragment.app.i0$a */
    class C0905a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f3189d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3190e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3191f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3192g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3193h;

        C0905a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3189d = i;
            this.f3190e = arrayList;
            this.f3191f = arrayList2;
            this.f3192g = arrayList3;
            this.f3193h = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f3189d; i++) {
                C0735z.m3171J0((View) this.f3190e.get(i), (String) this.f3191f.get(i));
                C0735z.m3171J0((View) this.f3192g.get(i), (String) this.f3193h.get(i));
            }
        }
    }

    /* renamed from: d */
    protected static void m4048d(List<View> list, View view) {
        int size = list.size();
        if (!m4049g(list, view, size)) {
            if (C0735z.m3176M(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m4049g(list, childAt, size) && C0735z.m3176M(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static boolean m4049g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    protected static boolean m4050i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo3485a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3486b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3487c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3488e(Object obj);

    /* renamed from: f */
    public abstract Object mo3489f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo3518h(View view, Rect rect) {
        if (C0735z.m3187U(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo3490j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo3491k(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ArrayList<String> mo3519l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0735z.m3176M(view));
            C0735z.m3171J0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo3492m(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: n */
    public abstract void mo3493n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: o */
    public abstract void mo3494o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo3495p(Object obj, View view);

    /* renamed from: q */
    public void mo3496q(Fragment fragment, Object obj, C0549e eVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3520r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String M = C0735z.m3176M(view2);
            arrayList4.add(M);
            if (M != null) {
                C0735z.m3171J0(view2, (String) null);
                String str = map.get(M);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0735z.m3171J0(arrayList2.get(i2), M);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0732w.m3149a(view, new C0905a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo3497s(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo3498t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: u */
    public abstract Object mo3499u(Object obj);
}
