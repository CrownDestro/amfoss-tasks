package androidx.emoji2.text;

import android.content.Context;
import androidx.core.p008os.C0560k;
import androidx.emoji2.text.C0811e;
import androidx.lifecycle.C0971b;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1162a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p071k0.C2350a;

public class EmojiCompatInitializer implements C2350a<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    static class C0798a extends C0811e.C0815c {
        protected C0798a(Context context) {
            super(new C0799b(context));
            mo3113b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C0799b implements C0811e.C0819g {

        /* renamed from: a */
        private final Context f2843a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        class C0800a extends C0811e.C0820h {

            /* renamed from: a */
            final /* synthetic */ C0811e.C0820h f2844a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f2845b;

            C0800a(C0811e.C0820h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2844a = hVar;
                this.f2845b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo3085a(Throwable th) {
                try {
                    this.f2844a.mo3085a(th);
                } finally {
                    this.f2845b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo3086b(C0836m mVar) {
                try {
                    this.f2844a.mo3086b(mVar);
                } finally {
                    this.f2845b.shutdown();
                }
            }
        }

        C0799b(Context context) {
            this.f2843a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo3083a(C0811e.C0820h hVar) {
            ThreadPoolExecutor b = C0803b.m3602b("EmojiCompatInitializer");
            b.execute(new C0822f(this, hVar, b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void m3596d(C0811e.C0820h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0828j a = C0805c.m3606a(this.f2843a);
                if (a != null) {
                    a.mo3136c(threadPoolExecutor);
                    a.mo3112a().mo3083a(new C0800a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.mo3085a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class C0801c implements Runnable {
        C0801c() {
        }

        public void run() {
            try {
                C0560k.m2546a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0811e.m3628h()) {
                    C0811e.m3624b().mo3098k();
                }
            } finally {
                C0560k.m2547b();
            }
        }
    }

    /* renamed from: a */
    public List<Class<? extends C2350a<?>>> mo3072a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo3073b(Context context) {
        C0811e.m3627g(new C0798a(context));
        mo3075d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3075d(Context context) {
        final C0988f a = ((C1005m) C1162a.m5781e(context).mo4777f(ProcessLifecycleInitializer.class)).mo102a();
        a.mo3774a(new DefaultLifecycleObserver() {
            /* renamed from: e */
            public void mo3077e(C1005m mVar) {
                EmojiCompatInitializer.this.mo3076e();
                a.mo3777d(this);
            }

            /* renamed from: f */
            public /* synthetic */ void mo3078f(C1005m mVar) {
                C0971b.m4432b(this, mVar);
            }

            /* renamed from: g */
            public /* synthetic */ void mo3079g(C1005m mVar) {
                C0971b.m4431a(this, mVar);
            }

            /* renamed from: m */
            public /* synthetic */ void mo3080m(C1005m mVar) {
                C0971b.m4433c(this, mVar);
            }

            /* renamed from: n */
            public /* synthetic */ void mo3081n(C1005m mVar) {
                C0971b.m4436f(this, mVar);
            }

            /* renamed from: p */
            public /* synthetic */ void mo3082p(C1005m mVar) {
                C0971b.m4435e(this, mVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3076e() {
        C0803b.m3604d().postDelayed(new C0801c(), 500);
    }
}
