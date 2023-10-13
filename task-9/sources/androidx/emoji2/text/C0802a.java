package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C0802a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f2847a;

    public /* synthetic */ C0802a(String str) {
        this.f2847a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C0803b.m3603c(this.f2847a, runnable);
    }
}
