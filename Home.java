package net.simaa.easyzakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {

        EditText weight, currentprice;
        RadioButton keepbtn, wearbtn;
        Button btnCount;
        TextView outputzakat, outputtotal;
        private MenuItem item;
        //private Thread v;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home2);

            weight = (EditText) findViewById(R.id.weight);
            currentprice = (EditText) findViewById(R.id.currentprice);
            keepbtn = (RadioButton) findViewById(R.id.keepbtn);
            wearbtn = (RadioButton) findViewById(R.id.wearbtn);
            btnCount = (Button) findViewById(R.id.btnCount);
            outputzakat = (TextView) findViewById(R.id.outputzakat);
            outputtotal = (TextView) findViewById(R.id.outputtotal);

            btnCount.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnCount:

                double countweight = Double.parseDouble(weight.getText().toString());
                double countprice = Double.parseDouble(currentprice.getText().toString());

             if (keepbtn.isChecked()) {
                    double zakat = (countweight - 85) * countprice;
                    double total = zakat * 0.025;
                    outputzakat.setText("RM" + zakat);
                    outputtotal.setText("RM" + total);
                } else {
                    double zakat = (countweight - 200) * countprice;
                    double total = zakat * 0.025;
                    outputzakat.setText("RM" + zakat);
                    outputtotal.setText("RM" + total);
                }


                break;
        }

    }
            public boolean onCreateOptionsMenu (Menu menu) {
                MenuInflater inflater = getMenuInflater();
                inflater.inflate(R.menu.menupage1, menu);

                return true;
            }

            public boolean onOptionsItemSelected (MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.faq:
                        //Toast.makeText(this,"This is FAQ pages",Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(this, activity_Faq.class);
                        startActivity(intent);
                        break;

                    case R.id.about:

                        intent = new Intent(this, aboutPage.class);
                        startActivity(intent);
                        break;

                    case R.id.exit:

                        intent = new Intent(this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.home:
                        Toast.makeText(this, "This is home pages", Toast.LENGTH_LONG).show();


                        break;

                }
                return super.onOptionsItemSelected(item);
            }

}
