package p098o3;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.C2431s;
import p041f3.C1920g;
import p092n3.C2815z1;

/* renamed from: o3.a */
public final class C2847a implements C2431s {
    /* renamed from: a */
    public int mo9018a() {
        return 1073741823;
    }

    /* renamed from: b */
    public String mo9019b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* renamed from: c */
    public C2815z1 mo9020c(List<? extends C2431s> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C2849c(C2853e.m12931a(mainLooper, true), (String) null, 2, (C1920g) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
