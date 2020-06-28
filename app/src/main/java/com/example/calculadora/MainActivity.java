package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.display);
    }

    public void onClickBotao0(View v){
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public void onClickBotao1(View v){
        atualizarNumeroDigitado("1");
        atualizarDisplay("1");
    }

    public void onClickBotao2(View v){
        atualizarNumeroDigitado("2");
        atualizarDisplay("2");
    }

    public void onClickBotao3(View v){
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");
    }

    public void onClickBotao4(View v){
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");
    }

    public void onClickBotao5(View v){
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");
    }
    public void onClickBotao6(View v){
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }
    public void onClickBotao7(View v){
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }

    public void onClickBotao8(View v){
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }

    public void onClickBotao9(View v){
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }

    public void onClickReset(View v){
        String textoDisplay = display.getText().toString();
        textoDisplay = "";
        display.setText(textoDisplay);
        primeiroNumero = "";
        segundoNumero =  "";
        operacao = "";
    }

    public void onClickAdicao(View v){
        if(!primeiroNumero.isEmpty()){
            operacao = "+";
            atualizarDisplay("+");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickSubtracao(View v){
        if(!primeiroNumero.isEmpty()){
            operacao = "-";
            atualizarDisplay("-");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMultiplicacao(View v){
        if(!primeiroNumero.isEmpty()){
            operacao = "*";
            atualizarDisplay("*");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDivisao(View v){
        if(!primeiroNumero.isEmpty()){
            operacao = "/";
            atualizarDisplay("/");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickResultado(View v){
        if(!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()){
            int numero1 = Integer.parseInt(primeiroNumero);
            int numero2 = Integer.parseInt(segundoNumero);
            if (operacao.equals("+")){
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));

            }else if(operacao.equals("-")){
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));

            }else if(operacao.equals("*")){
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));


            }else if(operacao.equals("/")){
                if(!primeiroNumero.equals("0") && !segundoNumero.equals("0")){
                    double resultado = (double)numero1 / numero2;
                    display.setText(String.valueOf(resultado));
                }else{
                    Toast.makeText(MainActivity.this, "Impossivel dividir 0", Toast.LENGTH_LONG).show();
                }
            }
        }else{
            Toast.makeText(MainActivity.this, "Nenhuma operação solicitada", Toast.LENGTH_LONG).show();
        }
    }

    private void atualizarDisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }

    private void atualizarNumeroDigitado(String numero){
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + numero;
        }else{
            segundoNumero = segundoNumero + numero;
        }

    }


}
