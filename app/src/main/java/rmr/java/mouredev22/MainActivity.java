package rmr.java.mouredev22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Esta clase crea una sucesión de fibonacci a partir del número dado
 *
 * @author Rafa M.
 * @version 1.0
 * @since 1.0
 */
public class MainActivity extends AppCompatActivity {
    private EditText etInputNumber;
    private TextView tvResult;
    private Button btResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.etInputNumber = findViewById(R.id.etInputNumber);
        this.tvResult = findViewById(R.id.tvResult);
        this.btResult = findViewById(R.id.btResult);
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(generateFibonacciSuccesion(Integer.parseInt(etInputNumber.getText().toString())));
            }
        });
    }

    /**
     * Este método genera la sucesión de fibnonacci de un número dado
     *
     * @param imputNumber ==> número dado por el usuario
     * @return ==> devuelve una cadena con la sucesión de fibonacci
     * @author Rafa M.
     * @version 1.0
     * @since 1.0
     */
    private String generateFibonacciSuccesion(int imputNumber) {
        String resultString = "";
        int number1 = 0, number2 = 1;
        int fibonacci;
        //mientras el segundo número (el que suma) sea menor al número introducido por el usuario
        while (number2 < imputNumber) {
            resultString += " " + number1; //se añade a la cadena el primer número
            fibonacci = number1 + number2; //se obtiene el siguiente número de la sucesión (n1 + n2)
            number1 = number2; // se modifica el número 1 (la base) con el valor del numero 2 (sumador)
            number2 = fibonacci; // el segundo número (sumador) pasa a ser el número de la sucesión
        }
        //se veduelve la sucesión
        return resultString;
    }
}