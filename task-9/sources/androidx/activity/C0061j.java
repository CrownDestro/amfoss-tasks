package androidx.activity;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.activity.j */
public final /* synthetic */ class C0061j implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f203a;

    public /* synthetic */ C0061j(Runnable runnable) {
        this.f203a = runnable;
    }

    public final void onBackInvoked() {
        this.f203a.run();
    }
}
