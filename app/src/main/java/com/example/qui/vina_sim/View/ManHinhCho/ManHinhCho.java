package com.example.qui.vina_sim.View.ManHinhCho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.qui.vina_sim.R;
import com.example.qui.vina_sim.View.ManHinhChinh.ManHinhChinh;

/**
 * Created by Qui on 12/11/2017.
 */

public class ManHinhCho extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhcho);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }
                catch (Exception e){

                }
                finally {
                    Intent intent = new Intent(ManHinhCho.this, ManHinhChinh.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        thread.start();

    }
}
