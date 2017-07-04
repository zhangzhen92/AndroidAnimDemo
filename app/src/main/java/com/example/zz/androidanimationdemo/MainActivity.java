package com.example.zz.androidanimationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * 类描述：测试类
 * 创建人：zz
 * 创建时间：2017/7/4 13:58
 */
public class MainActivity extends Activity {

    private ListView listViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化UI
     */
    private void initView() {
        listViewId = ((ListView) findViewById(R.id.listview_id));
        String[] stringType = getResources().getStringArray(R.array.anim_type);
        List<String> datas = Arrays.asList(stringType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datas);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        listViewId.setAdapter(adapter);
        listViewId.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(),NextActivity.class));
                switch (position){
                    case 0:
                        overridePendingTransition(R.anim.fade, R.anim.hold);
                        break;
                    case 1:
                        overridePendingTransition(R.anim.my_scale_action,
                                R.anim.my_alpha_action);
                        break;
                    case 2:
                        overridePendingTransition(R.anim.scale_rotate,
                                R.anim.my_alpha_action);
                        break;
                    case 3:
                        overridePendingTransition(R.anim.scale_translate_rotate,
                                R.anim.my_alpha_action);
                        break;
                    case 4:
                        overridePendingTransition(R.anim.scale_translate,
                                R.anim.my_alpha_action);
                        break;
                    case 5:
                        overridePendingTransition(R.anim.hyperspace_in,
                                R.anim.hyperspace_out);
                        break;
                    case 6:
                        overridePendingTransition(R.anim.push_left_in,
                                R.anim.push_left_out);
                        break;
                    case 7:
                        overridePendingTransition(R.anim.push_up_in,
                                R.anim.push_up_out);
                        break;
                    case 8:
                        overridePendingTransition(R.anim.slide_left,
                                R.anim.slide_right);
                        break;
                    case 9:
                        overridePendingTransition(R.anim.wave_scale,
                                R.anim.my_alpha_action);
                        break;
                    case 10:
                        overridePendingTransition(R.anim.zoom_enter,
                                R.anim.zoom_exit);
                        break;
                    case 11:
                        overridePendingTransition(R.anim.slide_up_in,
                                R.anim.slide_down_out);
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
