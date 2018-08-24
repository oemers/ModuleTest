package com.ryy.ncs_user;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import com.ryy.ncb_common.BaseApplication;

/**
 * SharePreference 管理类
 *
 * @author DingJiXiang
 */
public class SharePreferenceManager {

    private static volatile SharePreferenceManager sInstance;

    private SharedPreferences mSharedPreferences;

    private SharePreferenceManager(Context context) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static SharePreferenceManager getInstance() {
        if (sInstance == null) {
            synchronized (SharePreferenceManager.class) {
                if (sInstance == null) {
                    sInstance = new SharePreferenceManager(BaseApplication.getInstance());
                }
            }
        }
        return sInstance;
    }

    public static SharePreferenceManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (SharePreferenceManager.class) {
                if (sInstance == null) {
                    sInstance = new SharePreferenceManager(
                            context != null ? context.getApplicationContext()
                                    : BaseApplication.getInstance());
                }
            }
        }
        return sInstance;
    }

    public SharedPreferences getmSharedPreferences() {
        return mSharedPreferences;
    }

    public void putInt(String key, int value) {
        mSharedPreferences.edit().putInt(key, value).apply();
    }

    public void putFloat(String key, float value) {
        mSharedPreferences.edit().putFloat(key, value).apply();
    }

    public void putLong(String key, long value) {
        mSharedPreferences.edit().putLong(key, value).apply();
    }

    public void putBoolean(String key, boolean value) {
        mSharedPreferences.edit().putBoolean(key, value).apply();
    }

    public void putString(String key, String value) {
        mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getString(String key) {
        return getString(key, "");
    }

    public String getString(String key, String defValue) {
        String string = mSharedPreferences.getString(key, defValue);
        if (TextUtils.isEmpty(string)) {
            return defValue;
        }
        return string;
    }

    public int getInt(String key) {
        return getInt(key, -1);
    }

    public int getInt(String key, int defValue) {
        return mSharedPreferences.getInt(key, defValue);
    }

    public Float getFloat(String key) {
        return getFloat(key, (float) 0);
    }

    public Float getFloat(String key, Float defValue) {
        return mSharedPreferences.getFloat(key, defValue);
    }

    public long getLong(String key) {
        return getLong(key, 0);
    }

    public long getLong(String key, long defValue) {
        return mSharedPreferences.getLong(key, defValue);
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defValue) {
        return mSharedPreferences.getBoolean(key, defValue);
    }

    public void remove(String key) {
        mSharedPreferences.edit().remove(key).apply();
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

}
