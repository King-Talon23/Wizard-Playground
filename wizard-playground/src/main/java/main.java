
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import game.characters;
import game.entity;


public class main extends ApplicationAdapter {
    public void main(String[] args) {
        characters chars = new characters();
        entity player = chars.setPyromancer();
        player.addXp(1);
    }

    Sprite bucketSprite;
    SpriteBatch spriteBatch;
    FitViewport viewport;

    public void create() {
        spriteBatch = new SpriteBatch();
        viewport = new FitViewport(8, 5);

        bucketSprite = new Sprite(); // Initialize the sprite based on the texture
        bucketSprite.setSize(1, 1); // Define the size of the sprite
    }

    public void render() {
        input();
        logic();
        draw();
    }

    private void input() {
        float speed = .25f;
        float delta = Gdx.graphics.getDeltaTime();

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            bucketSprite.translateX(speed * delta);
        }
    }

    private void logic() {

    }

    private void draw() {
        ScreenUtils.clear(Color.BLACK);
        viewport.apply();
        spriteBatch.setProjectionMatrix(viewport.getCamera().combined);
        spriteBatch.begin();

        spriteBatch.end();

    }


    public void dispose() {
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true); // true centers the camera
    }
}
