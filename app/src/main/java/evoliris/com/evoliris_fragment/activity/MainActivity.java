package evoliris.com.evoliris_fragment.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import evoliris.com.evoliris_fragment.R;
import evoliris.com.evoliris_fragment.fragment.AboutFragment;
import evoliris.com.evoliris_fragment.fragment.HomeFragment;


public class MainActivity extends ActionBarActivity {

    private Button btnAddFragment, btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnAddFragment= (Button) findViewById(R.id.btn_main_add_fragment);
        btnFragment2= (Button) findViewById(R.id.btn_main_frag1);

        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction transaction=fm.beginTransaction();
                transaction.add(R.id.ll_main_container, new HomeFragment());
                transaction.commit();
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction transaction=fm.beginTransaction();
                transaction.replace(R.id.ll_main_container, new HomeFragment());
                transaction.commit();
            }
        });

        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction transaction=fm.beginTransaction();
                transaction.replace(R.id.ll_main_container, new AboutFragment());
                transaction.commit();
            }
        });


    }




}
