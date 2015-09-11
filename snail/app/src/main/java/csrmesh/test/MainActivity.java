package csrmesh.test;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.snail.annotation.ContentView;
import org.snail.annotation.OnClick;
import org.snail.annotation.ViewInject;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @ViewInject(R.id.txt1)
    private TextView txt1;
    @ViewInject(R.id.txt2)
    private TextView txt2;
    @ViewInject(R.id.txt3)
    private TextView txt3;
    @ViewInject(R.id.txt4)
    private TextView txt4;
    @ViewInject(R.id.txt5)
    private TextView txt5;
    @ViewInject(R.id.txt6)
    private TextView txt6;
    @ViewInject(R.id.txt7)
    private TextView txt7;
    @ViewInject(R.id.txt8)
    private TextView txt8;
    @ViewInject(R.id.txt9)
    private TextView txt9;
    @ViewInject(R.id.txt10)
    private TextView txt10;

    @OnClick({R.id.txt1,R.id.txt2,R.id.txt3,R.id.txt4,R.id.txt5,R.id.txt6,R.id.txt7,R.id.txt8,R.id.txt9,R.id.txt10})
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txt1:
                if(txt1.getText().toString().equals(getString(R.string.hello_world)))
                    txt1.setText("txt1");
                else
                    txt1.setText(getString(R.string.hello_world));
                showToast(txt1.getText().toString());
                break;
            case R.id.txt2:
                if(txt2.getText().toString().equals(getString(R.string.hello_world)))
                    txt2.setText("txt2");
                else
                    txt2.setText(getString(R.string.hello_world));
                showToast(txt2.getText().toString());
                break;
            case R.id.txt3:
                if(txt3.getText().toString().equals(getString(R.string.hello_world)))
                    txt3.setText("txt3");
                else
                    txt3.setText(getString(R.string.hello_world));
                showToast(txt3.getText().toString());
                break;
            case R.id.txt4:
                if(txt4.getText().toString().equals(getString(R.string.hello_world)))
                    txt4.setText("txt4");
                else
                    txt4.setText(getString(R.string.hello_world));
                showToast(txt4.getText().toString());
                break;
            case R.id.txt5:
                if(txt5.getText().toString().equals(getString(R.string.hello_world)))
                    txt5.setText("txt5");
                else
                    txt5.setText(getString(R.string.hello_world));
                showToast(txt5.getText().toString());
                break;
            case R.id.txt6:
                if(txt6.getText().toString().equals(getString(R.string.hello_world)))
                    txt6.setText("txt6");
                else
                    txt6.setText(getString(R.string.hello_world));
                showToast(txt6.getText().toString());
                break;
            case R.id.txt7:
                if(txt7.getText().toString().equals(getString(R.string.hello_world)))
                    txt7.setText("txt7");
                else
                    txt7.setText(getString(R.string.hello_world));
                showToast(txt7.getText().toString());
                break;
            case R.id.txt8:
                if(txt8.getText().toString().equals(getString(R.string.hello_world)))
                    txt8.setText("txt8");
                else
                    txt8.setText(getString(R.string.hello_world));
                showToast(txt8.getText().toString());
                break;
            case R.id.txt9:
                if(txt9.getText().toString().equals(getString(R.string.hello_world)))
                    txt9.setText("txt9");
                else
                    txt9.setText(getString(R.string.hello_world));
                showToast(txt9.getText().toString());
                break;
            case R.id.txt10:
                if(txt10.getText().toString().equals(getString(R.string.hello_world)))
                    txt10.setText("txt10");
                else
                    txt10.setText(getString(R.string.hello_world));
                showToast(txt10.getText().toString());
                break;
        }
    }

    private void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
