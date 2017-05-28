package com.squareup.picasso.gdx;

/**
 * Created by lin_y on 5/28/17.
 * Little Adam Inc
 * www.xuexue365.com
 */

public class MediaStore {

	public static final String AUTHORITY = "media";

	public static final class Video {

		public static class Thumbnails {
			public static final int MINI_KIND = 1;

			public static Bitmap getThumbnail(ContentResolver cr, long origId, int kind, BitmapFactory.Options options) {
				return null;
			}
		}
	}

	public static final class Images {
		public interface ImageColumns{
			/**
			 * The orientation for the image expressed as degrees.
			 * Only degrees 0, 90, 180, 270 will work.
			 * <P>Type: INTEGER</P>
			 */
			public static final String ORIENTATION = "orientation";
		}

		public static class Thumbnails {
			public static Bitmap getThumbnail(ContentResolver cr, long origId, int kind, BitmapFactory.Options options) {
				return null;
			}
		}
	}
}
