package net.simaa.easyzakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class aboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate (R.menu.menuabout, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){

            case R.id.faq:
                //Toast.makeText(this,"This is FAQ pages",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, activity_Faq.class);
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