package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p071k0.C2352c;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new C2352c("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            C1162a.m5781e(context).mo4774a();
            return true;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
