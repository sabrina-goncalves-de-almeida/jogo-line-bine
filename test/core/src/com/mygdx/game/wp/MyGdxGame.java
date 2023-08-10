package com.mygdx.game.wp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.Texture;

public class MyGdxGame extends ApplicationAdapter {

	private float widthVar = 800;
	private float leightVar = 480;

	private Texture gotinhaImagem;
	private Texture baldeImagem;

	private Sound dropSound;
	private Music rainMusic;
	private SpriteBatch batch;

	private OrthographicCamera camera;

	private Rectangle bucket;
//	Texture img;
	
	@Override
	public void create () {
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");

		// importação das imagens
		gotinhaImagem = new Texture(Gdx.files.internal("drop.png"));
		baldeImagem = new Texture(Gdx.files.internal("bucket.png"));

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);

		batch = new SpriteBatch();


		//importar os audios
//		dropSound = Gdx.audio.newSound((Gdx.files.internal("drop.wav")));
//		rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));
//
//		// começar a música com a música do background imediatamente
//
//		rainMusic.setLooping(true);
//		rainMusic.play();
//

		bucket = new Rectangle();
		bucket.x = widthVar / 2 - 64 / 2;
		bucket.y = 20;
		bucket.width = 64;
		bucket.height = 64;

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0.2f, 1);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(baldeImagem, bucket.x, bucket.y);
		batch.end();
//		ScreenUtils.clear(1, 0, 0, 1);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
//		img.dispose();
	}
}
