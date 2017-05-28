package com.squareup.picasso.gdx;

/**
 * Created by lin_y on 5/28/17.
 * Little Adam Inc
 * www.xuexue365.com
 */

public abstract class Drawable {
	public abstract void draw(Canvas canvas);

	public abstract void setAlpha(int alpha);

	public abstract void setColorFilter(ColorFilter colorFilter);

	public void setBounds(int left, int top, int right, int bottom) {

	}

	public void setBounds(Rect rect) {

	}

	protected void onBoundsChange(Rect bounds) {
	}
}
