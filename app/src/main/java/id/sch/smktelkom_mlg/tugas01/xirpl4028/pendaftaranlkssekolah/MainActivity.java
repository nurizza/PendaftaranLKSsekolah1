package id.sch.smktelkom_mlg.tugas01.xirpl4028.pendaftaranlkssekolah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText etnama;
        Button button;
        final TextView ethasil;
        final Spinner spKelas;
        final RadioButton L, P;
        final CheckBox WD, GD, NS, SA;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.nama);
        button = (Button) findViewById(R.id.button);
        ethasil = (TextView) findViewById(R.id.hasil);
        spKelas = (Spinner) findViewById(R.id.spinner);
        L = (RadioButton) findViewById(R.id.radioButton);
        P = (RadioButton) findViewById(R.id.radioButton2);
        WD = (CheckBox) findViewById(R.id.checkBox);
        GD = (CheckBox) findViewById(R.id.checkBox2);
        NS = (CheckBox) findViewById(R.id.checkBox3);
        SA = (CheckBox) findViewById(R.id.checkBox4);

        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String nama = etnama.getText().toString();
                                          String hasil = null;


                                          if (L.isChecked()) {
                                              hasil = L.getText().toString();
                                          } else if (P.isChecked()) {
                                              hasil = P.getText().toString();
                                          }

                                          String hasil1 = "Pilihan Anda : \n";
                                          int startlen = hasil1.length();

                                          if (WD.isChecked()) hasil1 += WD.getText() + "\n";
                                          if (GD.isChecked()) hasil1 += GD.getText() + "\n";
                                          if (NS.isChecked()) hasil1 += NS.getText() + "\n";
                                          if (SA.isChecked()) hasil1 += SA.getText() + "\n";

                                          ethasil.setText(nama + " kelas " + spKelas.getSelectedItem().toString() + " jenis kelamin " + hasil + " " + hasil1);
                                      }
                                  }
        );

    }
}
