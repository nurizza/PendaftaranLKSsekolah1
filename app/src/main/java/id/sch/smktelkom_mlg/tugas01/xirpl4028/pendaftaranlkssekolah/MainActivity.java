package id.sch.smktelkom_mlg.tugas01.xirpl4028.pendaftaranlkssekolah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText nama;
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);
        button = (Button) findViewById(R.id.button);

    }
}
