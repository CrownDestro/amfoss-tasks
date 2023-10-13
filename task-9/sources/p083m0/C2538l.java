package p083m0;

import android.view.ViewGroup;

/* renamed from: m0.l */
public class C2538l {

    /* renamed from: a */
    private ViewGroup f8588a;

    /* renamed from: b */
    private Runnable f8589b;

    /* renamed from: b */
    public static C2538l m11612b(ViewGroup viewGroup) {
        return (C2538l) viewGroup.getTag(C2536j.transition_current_scene);
    }

    /* renamed from: c */
    static void m11613c(ViewGroup viewGroup, C2538l lVar) {
        viewGroup.setTag(C2536j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo9180a() {
        Runnable runnable;
        if (m11612b(this.f8588a) == this && (runnable = this.f8589b) != null) {
            runnable.run();
        }
    }
}
