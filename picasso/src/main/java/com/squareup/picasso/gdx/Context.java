package com.squareup.picasso.gdx;

import com.xuexue.gdx.game.ModularGame;

/**
 * TextureRegion = Bitmap
 * Sprite = BitmapDrawable
 * SpriteEntity = ImageView
 */

public class Context {
	private ModularGame mGame;

	public Context(ModularGame game){
		this.mGame = game;
	}

	public Context getApplicationContext(){
		return this;
	}

	public Resources getResources(){
		return null;
	}

	public ContentResolver getContentResolver(){
		return null;
	}

	public AssetManager getAssets(){
		return null;
	}
}
