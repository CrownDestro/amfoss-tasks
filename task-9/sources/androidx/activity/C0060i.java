package androidx.activity;

/* renamed from: androidx.activity.i */
public final /* synthetic */ class C0060i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OnBackPressedDispatcher f202d;

    public /* synthetic */ C0060i(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f202d = onBackPressedDispatcher;
    }

    public final void run() {
        this.f202d.mo149f();
    }
}
