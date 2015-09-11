package csrmesh.test;

import android.app.Activity;
import android.os.Bundle;

import org.snail.ViewInjectUtils;

/**
 * Created by Administrator on 2015/9/11.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewInjectUtils.inject(this);
    }
}
