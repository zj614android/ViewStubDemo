package android.zj.com.viewstubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewStub vStbText = findViewById(R.id.viewstub_text);
        ViewStub vStbImg = findViewById(R.id.viewstub_image);
        View inflate = vStbText.inflate();
        TextView sontext = inflate.findViewById(R.id.sontext);
        sontext.setText("白日依山尽 黄河入海流");
        vStbImg.inflate();
    }
}
