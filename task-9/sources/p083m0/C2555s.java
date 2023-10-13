package p083m0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m0.s */
public class C2555s {

    /* renamed from: a */
    public final Map<String, Object> f8650a = new HashMap();

    /* renamed from: b */
    public View f8651b;

    /* renamed from: c */
    final ArrayList<C2539m> f8652c = new ArrayList<>();

    @Deprecated
    public C2555s() {
    }

    public C2555s(View view) {
        this.f8651b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2555s)) {
            return false;
        }
        C2555s sVar = (C2555s) obj;
        return this.f8651b == sVar.f8651b && this.f8650a.equals(sVar.f8650a);
    }

    public int hashCode() {
        return (this.f8651b.hashCode() * 31) + this.f8650a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f8651b + "\n") + "    values:";
        for (String next : this.f8650a.keySet()) {
            str = str + "    " + next + ": " + this.f8650a.get(next) + "\n";
        }
        return str;
    }
}
