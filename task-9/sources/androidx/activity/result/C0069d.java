package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1002j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p009b.C1244a;

/* renamed from: androidx.activity.result.d */
public abstract class C0069d {

    /* renamed from: a */
    private Random f210a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f211b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f212c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0072c> f213d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f214e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0071b<?>> f215f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f216g = new HashMap();

    /* renamed from: h */
    final Bundle f217h = new Bundle();

    /* renamed from: androidx.activity.result.d$a */
    class C0070a extends C0068c<I> {

        /* renamed from: a */
        final /* synthetic */ String f218a;

        /* renamed from: b */
        final /* synthetic */ C1244a f219b;

        C0070a(String str, C1244a aVar) {
            this.f218a = str;
            this.f219b = aVar;
        }

        /* renamed from: a */
        public void mo184a() {
            C0069d.this.mo189i(this.f218a);
        }
    }

    /* renamed from: androidx.activity.result.d$b */
    private static class C0071b<O> {

        /* renamed from: a */
        final C0067b<O> f221a;

        /* renamed from: b */
        final C1244a<?, O> f222b;

        C0071b(C0067b<O> bVar, C1244a<?, O> aVar) {
            this.f221a = bVar;
            this.f222b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.d$c */
    private static class C0072c {

        /* renamed from: a */
        final C0988f f223a;

        /* renamed from: b */
        private final ArrayList<C1002j> f224b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo190a() {
            Iterator<C1002j> it = this.f224b.iterator();
            while (it.hasNext()) {
                this.f223a.mo3777d(it.next());
            }
            this.f224b.clear();
        }
    }

    /* renamed from: a */
    private void m217a(int i, String str) {
        this.f211b.put(Integer.valueOf(i), str);
        this.f212c.put(str, Integer.valueOf(i));
    }

    /* renamed from: c */
    private <O> void m218c(String str, int i, Intent intent, C0071b<O> bVar) {
        if (bVar == null || bVar.f221a == null || !this.f214e.contains(str)) {
            this.f216g.remove(str);
            this.f217h.putParcelable(str, new C0065a(i, intent));
            return;
        }
        bVar.f221a.mo183a(bVar.f222b.mo3698a(i, intent));
        this.f214e.remove(str);
    }

    /* renamed from: d */
    private int m219d() {
        int nextInt = this.f210a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f211b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f210a.nextInt(2147418112);
        }
    }

    /* renamed from: h */
    private void m220h(String str) {
        if (this.f212c.get(str) == null) {
            m217a(m219d(), str);
        }
    }

    /* renamed from: b */
    public final boolean mo185b(int i, int i2, Intent intent) {
        String str = this.f211b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m218c(str, i2, intent, this.f215f.get(str));
        return true;
    }

    /* renamed from: e */
    public final void mo186e(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f214e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f210a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f217h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f212c.containsKey(str)) {
                        Integer remove = this.f212c.remove(str);
                        if (!this.f217h.containsKey(str)) {
                            this.f211b.remove(remove);
                        }
                    }
                    m217a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo187f(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f212c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f212c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f214e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f217h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f210a);
    }

    /* renamed from: g */
    public final <I, O> C0068c<I> mo188g(String str, C1244a<I, O> aVar, C0067b<O> bVar) {
        m220h(str);
        this.f215f.put(str, new C0071b(bVar, aVar));
        if (this.f216g.containsKey(str)) {
            Object obj = this.f216g.get(str);
            this.f216g.remove(str);
            bVar.mo183a(obj);
        }
        C0065a aVar2 = (C0065a) this.f217h.getParcelable(str);
        if (aVar2 != null) {
            this.f217h.remove(str);
            bVar.mo183a(aVar.mo3698a(aVar2.mo175c(), aVar2.mo174a()));
        }
        return new C0070a(str, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo189i(String str) {
        Integer remove;
        if (!this.f214e.contains(str) && (remove = this.f212c.remove(str)) != null) {
            this.f211b.remove(remove);
        }
        this.f215f.remove(str);
        if (this.f216g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f216g.get(str));
            this.f216g.remove(str);
        }
        if (this.f217h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f217h.getParcelable(str));
            this.f217h.remove(str);
        }
        C0072c cVar = this.f213d.get(str);
        if (cVar != null) {
            cVar.mo190a();
            this.f213d.remove(str);
        }
    }
}
