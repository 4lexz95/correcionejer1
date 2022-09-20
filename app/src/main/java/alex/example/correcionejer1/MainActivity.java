package alex.example.correcionejer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// Paso 1 Definir Variables de vista
    private EditText txtNombre;
    private Button btnsaludo;
    private Button btnreset;
    private TextView lblsaludo;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Paso 2 Inicializacion de las variables de la vista
        inicializarvistas();


        // Paso 3 Eventos
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblsaludo.setText("");
            }
        });
        btnsaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().trim().isEmpty())
                    Toast.makeText(MainActivity.this, "Escribe", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void inicializarvistas() {
        txtNombre = this.findViewById(R.id.txtnombreMain);
        lblsaludo = this.findViewById(R.id.lblsaludoMain);
        btnreset = this.findViewById(R.id.btnresetMain);
        btnsaludo = this.findViewById(R.id.btnsaludarMain);
    }



}