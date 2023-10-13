package p099o4;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import p134u3.C3288b0;
import p134u3.C3304d0;
import p134u3.C3313f0;

/* renamed from: o4.b */
public class C2855b {

    /* renamed from: d */
    private static C3288b0 f9377d;

    /* renamed from: a */
    private InputStream f9378a;

    /* renamed from: b */
    private String f9379b;

    /* renamed from: c */
    private C3313f0 f9380c;

    /* renamed from: d */
    private static C3288b0 m12933d() {
        if (f9377d == null) {
            C3288b0.C3289a aVar = new C3288b0.C3289a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.mo10841c(3000, timeUnit);
            aVar.mo10838H(10000, timeUnit);
            f9377d = aVar.mo10839a();
        }
        return f9377d;
    }

    /* renamed from: a */
    public void mo9827a() {
        InputStream inputStream = this.f9378a;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.f9378a = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo9828b(String str) {
        try {
            C3304d0.C3305a i = new C3304d0.C3305a().mo10930i(str);
            String str2 = this.f9379b;
            if (str2 != null) {
                i.mo10922a("User-Agent", str2);
            }
            C3313f0 s = m12933d().mo10812b(i.mo10923b()).mo10936s();
            this.f9380c = s;
            Integer valueOf = Integer.valueOf(s.mo10958i());
            if (valueOf.intValue() != 200) {
                Log.e("BONUSPACK", "Invalid response from server: " + valueOf.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public String mo9829c() {
        try {
            C3313f0 f0Var = this.f9380c;
            if (f0Var == null) {
                return null;
            }
            return f0Var.mo10953a().mo10998k();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public void mo9830e(String str) {
        this.f9379b = str;
    }
}
