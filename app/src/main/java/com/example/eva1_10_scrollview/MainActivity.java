package com.example.eva1_10_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwtexto;

    final String cade = "Winstar ofrece un amplio rango de Módulos LCD Alfanuméricos estándares para las diferentes aplicaciones de nuestros clientes. Nuestro displays LCD alfanuméricos están disponibles en 8x2, 12x2, 16x1, 16x2, 16x4, 20x2, 20x4, 24x2 y 40x4 con formatos de matrices alfanuméricas dot 5x8. Los paneles LCD usan las siguientes tecnologías STN, FSTN, FFSTN incluyendo modos de polarización positiva y negativa. Hay diferentes tipos de retroiluminación, están disponibles en varios colores, amarillo/verde, blanco, azul, verde, ámbar y RGB LEDS.\n" +
            "\n" +
            "Para cubrir las necesidades de las aplicaciones de nuestros clientes, estos displays alfanuméricos LCD, están disponibles con un ángulo de visión de las 6:00, 12:00, 3:00 y 9:00 hrs . Winstar ofrece varias opciones en el formato de las fuentes de carácteres en las cuales se incluyen Ingles/Japonés, lenguas de Europa occidental, lenguas europeas del este, escandinavo, cirílico (Rusia), y hebreo/árabe. Estos módulos alfanuméricos LCD y módulos LCM pueden ser usados en el sector industrial y en las aplicaciones desarrolladas por nuestros clientes, como por ejemplo, puertas de seguridad, dispositivos médicos , sistemas de audio del coche y del hogar, electrodomésticos, máquina de juegos , juguetes ,etc…..";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVwtexto = findViewById(R.id.txtVwtexto);
        txtVwtexto.setText(cade);
    }
}