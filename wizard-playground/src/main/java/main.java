import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

import javax.swing.*;

public class MainActivity extends AppCompatActivity {
    TextView game, name, health, level, stage, enemyHealth, enemyLevel, enemyName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = findViewById(R.id.gameView);
        name = findViewById(R.id.nameView);
        health = findViewById(R.id.healthView);
        level = findViewById(R.id.levelView);
        stage = findViewById(R.id.stageView);
        enemyHealth = findViewById(R.id.enemyHealthView);
        enemyLevel = findViewById(R.id.enemyLevelView);
        enemyName = findViewById(R.id.enemyNameView);
    }

    public void openStatsMenu(View sourceView) {

        String[] statsList = new String[5];
        statsList[0] = "Stat 1 here";
        statsList[1] = "Stat 2 here";
        statsList[2] = "Stat 3 here";
        statsList[3] = "Stat 4 here";
        statsList[4] = "Stat 5 here";

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder
                .setTitle("Choose a potion")
                .setItems(statsList, null)
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
    }
    public void update(View sourceView) {
        name.setText(name + " the " + character);
        health.setText("HP: " + player.hp);
        level.setText("level: " + player.level);
        enemyHealth.setText("Enemy HP: " + enemy.hp);
        enemyLevel.setText("Enemy Level: " + enemy.level);
        enemyName.setText(enemy.name);
    }

    public JPanel createPanel() {

        return null;
    }
}
