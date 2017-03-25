package br.com.livroandroid.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard weather_data[] = new ReportCard[]
                {
                        new ReportCard(R.mipmap.ic_launcher, "Matemática" , "A"),
                        new ReportCard(R.mipmap.ic_launcher, "Computação" , "A+"),
                        new ReportCard(R.mipmap.ic_launcher, "English" , "A"),
                        new ReportCard(R.mipmap.ic_launcher, "Ciência" , "B"),
                        new ReportCard(R.mipmap.ic_launcher, "Física" , "B"),
                        new ReportCard(R.mipmap.ic_launcher, "Biologia" , "A")
                };

        ReportCardAdapter adapter = new ReportCardAdapter(this,
                R.layout.report_card_listview_layout, weather_data);


        ListView listView1 = (ListView)findViewById(R.id.reportCardView);
        listView1.setAdapter(adapter);
        listView1.setTextFilterEnabled(true);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}