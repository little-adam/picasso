package com.squareup.picasso.gdx;

import android.database.*;
import android.net.Uri;

import java.io.InputStream;

/**
 * Created by lin_y on 5/28/17.
 * Little Adam Inc
 * www.xuexue365.com
 */

public class ContentResolver {
	public InputStream openInputStream(Uri uri){
		return null;
	}

	public String getType(Uri uri){
		String mimeType = "";
		return mimeType;
	}

	public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		return null;
	}
}
