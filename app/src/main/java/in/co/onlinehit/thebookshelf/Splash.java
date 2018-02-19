package in.co.onlinehit.thebookshelf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Splash extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent startingPoint = new Intent("in.co.onlinehit.thebookshelf.MainActivity");
                    startActivity(startingPoint);
                }
            }
        };

        timer.start();
    }
}
