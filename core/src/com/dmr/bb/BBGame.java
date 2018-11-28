package com.dmr.bb;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dmr.bb.Entities.Player;


public class BBGame extends Game {
    SpriteBatch batch;
    public BitmapFont font;
    public Stage stage;
    public Player player1;
    public Player player2;
    private Texture playerTex1;
    private Texture playerTex2;
    private SplashScreen splashScreen;
    private GameScreen gameScreen;
    private MainMenuScreen menuScreen;

    public final static int MENU = 0;
    public final static int PREFERENCES = 1;
    public final static int APPLICATION = 2;
    public final static int ENDGAME = 3;
    public final static int APP2 = 4;
    public final static int SHOP = 5;
    public final static int HOF = 6;
    public final static int WIN = 7;
    public final static int LOSE = 8;

    @Override
    public void create () {
        batch = new SpriteBatch();
        font = new BitmapFont();

        playerTex1 = new Texture(Gdx.files.internal("player1.png"));
        playerTex2 = new Texture(Gdx.files.internal("player2.png"));
        player1 = new Player("Shredder", false, playerTex1, 23, 38, 293, 191);
        player2 = new Player("Donatello", false, playerTex2, 0, 0, 45, 37);

//		this.setScreen(new MainMenuScreen(this));

        splashScreen = new SplashScreen(this);
        setScreen(splashScreen);
    }

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}

    public void changeScreen(int screen){

        switch(screen){
            case MENU:
                if(menuScreen == null) menuScreen = new MainMenuScreen(this);
                this.setScreen(menuScreen);
                break;

            case PREFERENCES:
//                if(preferencesScreen == null) preferencesScreen = new PreferencesScreen(this);
//                this.setScreen(preferencesScreen);
                break;

            case APPLICATION:

                // always make new game screen so game can't start midway
                if(gameScreen == null){
                    gameScreen = new GameScreen(this, player1, player2);
                }
                this.setScreen(gameScreen);

                break;

            case HOF:
//                //System.out.println(nameScreen.getInputName());
//                HallOfFame = new HOFScreen(this, player1);
//                this.setScreen(HallOfFame);
                break;


            case SHOP:
//                if(s == null) s = new shopScreen(this,player1,player2);
//                this.setScreen(s);
                break;

            case LOSE:
//                if(loseScreen == null) loseScreen = new LoseScreen(this,player1);
//                this.setScreen(loseScreen);
                break;


            case WIN:
//                if(nameScreen == null) nameScreen = new NameScreen(this,player1);
//                this.setScreen(nameScreen);
                break;
        }
    }
}
