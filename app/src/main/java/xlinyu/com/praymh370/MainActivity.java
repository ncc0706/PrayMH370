package xlinyu.com.praymh370;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnPrayMH370;
    private ImageView ivPrayMH370;


    private int[] images = {R.drawable.mh370_01,
            R.drawable.mh370_02,
            R.drawable.mh370_03,
            R.drawable.mh370_04,
            R.drawable.mh370_05,
            R.drawable.mh370_06,
            R.drawable.mh370_07,
            R.drawable.mh370_08,
            R.drawable.mh370_09
    };

    private int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPrayMH370 = (Button) findViewById(R.id.btnPrayMH370);

        ivPrayMH370 = (ImageView) findViewById(R.id.ivPrayMH370);

        btnPrayMH370.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageIndex++;
                if (imageIndex > 8) {
                    imageIndex = 0;
                }

                ivPrayMH370.setImageResource(images[imageIndex]);

            }
        });


    }
}
