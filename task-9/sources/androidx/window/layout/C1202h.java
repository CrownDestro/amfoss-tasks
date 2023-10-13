package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.core.util.C0604a;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import p041f3.C1924k;
import p127t2.C3187s;

/* renamed from: androidx.window.layout.h */
public final class C1202h implements C1231p {

    /* renamed from: a */
    private final WindowLayoutComponent f4208a;

    /* renamed from: b */
    private final ReentrantLock f4209b = new ReentrantLock();

    /* renamed from: c */
    private final Map<Activity, C1203a> f4210c = new LinkedHashMap();

    /* renamed from: d */
    private final Map<C0604a<C1240v>, Activity> f4211d = new LinkedHashMap();

    @SuppressLint({"NewApi"})
    /* renamed from: androidx.window.layout.h$a */
    private static final class C1203a implements Consumer<WindowLayoutInfo> {

        /* renamed from: a */
        private final Activity f4212a;

        /* renamed from: b */
        private final ReentrantLock f4213b = new ReentrantLock();

        /* renamed from: c */
        private C1240v f4214c;

        /* renamed from: d */
        private final Set<C0604a<C1240v>> f4215d = new LinkedHashSet();

        public C1203a(Activity activity) {
            C1924k.m9141g(activity, "activity");
            this.f4212a = activity;
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            C1924k.m9141g(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f4213b;
            reentrantLock.lock();
            try {
                this.f4214c = C1204i.f4216a.mo5014b(this.f4212a, windowLayoutInfo);
                for (C0604a accept : this.f4215d) {
                    accept.accept(this.f4214c);
                }
                C3187s sVar = C3187s.f10561a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final void mo5010b(C0604a<C1240v> aVar) {
            C1924k.m9141g(aVar, "listener");
            ReentrantLock reentrantLock = this.f4213b;
            reentrantLock.lock();
            try {
                C1240v vVar = this.f4214c;
                if (vVar != null) {
                    aVar.accept(vVar);
                }
                this.f4215d.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: c */
        public final boolean mo5011c() {
            return this.f4215d.isEmpty();
        }

        /* renamed from: d */
        public final void mo5012d(C0604a<C1240v> aVar) {
            C1924k.m9141g(aVar, "listener");
            ReentrantLock reentrantLock = this.f4213b;
            reentrantLock.lock();
            try {
                this.f4215d.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public C1202h(WindowLayoutComponent windowLayoutComponent) {
        C1924k.m9141g(windowLayoutComponent, "component");
        this.f4208a = windowLayoutComponent;
    }

    /* renamed from: a */
    public void mo5006a(Activity activity, Executor executor, C0604a<C1240v> aVar) {
        C3187s sVar;
        C1924k.m9141g(activity, "activity");
        C1924k.m9141g(executor, "executor");
        C1924k.m9141g(aVar, "callback");
        ReentrantLock reentrantLock = this.f4209b;
        reentrantLock.lock();
        try {
            C1203a aVar2 = this.f4210c.get(activity);
            if (aVar2 == null) {
                sVar = null;
            } else {
                aVar2.mo5010b(aVar);
                this.f4211d.put(aVar, activity);
                sVar = C3187s.f10561a;
            }
            if (sVar == null) {
                C1203a aVar3 = new C1203a(activity);
                this.f4210c.put(activity, aVar3);
                this.f4211d.put(aVar, activity);
                aVar3.mo5010b(aVar);
                this.f4208a.addWindowLayoutInfoListener(activity, aVar3);
            }
            C3187s sVar2 = C3187s.f10561a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo5007b(C0604a<C1240v> aVar) {
        C1924k.m9141g(aVar, "callback");
        ReentrantLock reentrantLock = this.f4209b;
        reentrantLock.lock();
        try {
            Activity activity = this.f4211d.get(aVar);
            if (activity != null) {
                C1203a aVar2 = this.f4210c.get(activity);
                if (aVar2 == null) {
                    reentrantLock.unlock();
                    return;
                }
                aVar2.mo5012d(aVar);
                if (aVar2.mo5011c()) {
                    this.f4208a.removeWindowLayoutInfoListener(aVar2);
                }
                C3187s sVar = C3187s.f10561a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
