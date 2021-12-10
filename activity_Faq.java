package net.simaa.easyzakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class activity_Faq extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

}
        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate (R.menu.menufaq, menu);

            return true;
        }
        public boolean onOptionsItemSelected(MenuItem item){
            switch(item.getItemId()){

                case R.id.about:
                    //Toast.makeText(this,"This is FAQ pages",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(this, aboutPage.class);
                    startActivity(intent);
                    break;

                case R.id.home:
                    intent = new Intent(this, Home.class);
                    startActivity(intent);

                    break;

                case R.id.exit:

                    intent  = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;


            }
            return super.onOptionsItemSelected(item);
        }

                }
