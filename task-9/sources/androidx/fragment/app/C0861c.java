package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c */
class C0861c implements Parcelable {
    public static final Parcelable.Creator<C0861c> CREATOR = new C0862a();

    /* renamed from: d */
    final List<String> f3044d;

    /* renamed from: e */
    final List<C0858b> f3045e;

    /* renamed from: androidx.fragment.app.c$a */
    class C0862a implements Parcelable.Creator<C0861c> {
        C0862a() {
        }

        /* renamed from: a */
        public C0861c createFromParcel(Parcel parcel) {
            return new C0861c(parcel);
        }

        /* renamed from: b */
        public C0861c[] newArray(int i) {
            return new C0861c[i];
        }
    }

    C0861c(Parcel parcel) {
        this.f3044d = parcel.createStringArrayList();
        this.f3045e = parcel.createTypedArrayList(C0858b.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3044d);
        parcel.writeTypedList(this.f3045e);
    }
}
