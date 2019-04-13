package com.gmail.aprizalabyan.tugaspert6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO 1 : Inisialisasi kelas MainActivity dengan tampilan layout activity_main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TODO 2 : Membuat method Login untuk proses pada saat button Login diklik
    public void Login(View view){
        // TODO 2.1 : Membuat intent untuk memanggil kelas TampilList
        Intent intentList = new Intent(getApplicationContext(), TampilList.class);

        // TODO 2.2 : Memberikan value username dan password
        String username = "aprizal";
        String password = "165410165";

        // TODO 2.3 : Mengambil layout EditText dan disimpan pada variabel
        EditText user = findViewById(R.id.inputUser);
        EditText pass = findViewById(R.id.inputPass);

        // TODO 2.4 : Mengambil inputan dari user dan disimpan pada variabel
        String inputUser = user.getText().toString();
        String inputPass = pass.getText().toString();

        // TODO 2.5 : Memvalidasi username dan password user
        if(inputUser.equals(username) && inputPass.equals(password)){
            // TODO 2.5.1 : Jika username dan password sesuai maka akan menjalankan intent intentList
            startActivity(intentList);
        }
        else{
            // TODO 2.5.2 : Jika salah maka akan memunculkan Toast beris pesan
            Toast.makeText(getApplicationContext(),"Username dan Password salah",Toast.LENGTH_SHORT).show();
        }
    }

    // TODO 3 : Membuat method Register untuk proses pada saat button Register diklik
    public void Register(View view){
        // TODO 3.1 : Membuat intent untuk memanggil kelas Register, kemudian menjalankan intent tersebut
        Intent intentRegister = new Intent(getApplicationContext(), Register.class);
        startActivity(intentRegister);
    }
}
