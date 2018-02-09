package imc.itahir.fr.td02calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textZone = null;
    Button btnPlus = null;
    Button btnMoins = null;
    Button btnMult = null;
    Button btnDiv = null;
    Button btnPlusMoins = null;
    Button btnPoint = null;
    Button btnEgal = null;
    Button btnMR = null;
    Button btnM = null;
    Button btnRetour = null;
    Button btnZero = null;
    Button btnUn = null;
    Button btnDeux = null;
    Button btnTrois = null;
    Button btnQuatre = null;
    Button btnCinq = null;
    Button btnSix = null;
    Button btnSept = null;
    Button btnHuit = null;
    Button btnNeuf = null;

    private double chiffre1;
    private boolean clicOperateur = false, update = false;
    private String operateur = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des vues
        textZone = (EditText)findViewById(R.id.textZone);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMoins = (Button)findViewById(R.id.btnMoins);
        btnMult = (Button)findViewById(R.id.btnMult);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnPlusMoins = (Button)findViewById(R.id.btnPlusMoins);
        btnPoint = (Button)findViewById(R.id.btnPoint);
        btnEgal = (Button)findViewById(R.id.btnEgal);
        btnMR = (Button)findViewById(R.id.btnMR);
        btnM = (Button)findViewById(R.id.btnM);
        btnRetour = (Button)findViewById(R.id.btnRetour);
        btnZero = (Button)findViewById(R.id.btnZero);
        btnUn = (Button)findViewById(R.id.btnUn);
        btnDeux = (Button)findViewById(R.id.btnDeux);
        btnTrois = (Button)findViewById(R.id.btnTrois);
        btnQuatre = (Button)findViewById(R.id.btnQuatre);
        btnCinq = (Button)findViewById(R.id.btnCinq);
        btnSix = (Button)findViewById(R.id.btnSix);
        btnSept = (Button)findViewById(R.id.btnSept);
        btnHuit = (Button)findViewById(R.id.btnHuit);
        btnNeuf = (Button)findViewById(R.id.btnNeuf);


        // Les listener
        btnPlus.setOnClickListener(btnPlusListener);
        btnMoins.setOnClickListener(btnMoinsListener);
        btnMult.setOnClickListener(btnMultListener);
        btnDiv.setOnClickListener(btnDivListener);
        btnPoint.setOnClickListener(btnPointListener);
        btnEgal.setOnClickListener(btnEgalListener);
        //btnPlusMoins.setOnClickListener(btnPlusMoinsListener); // ne fonctionne pas encore
        //btnMR.setOnClickListener(btnMRListener); // ne fonctionne pas encore
        //btnM.setOnClickListener(btnMListener); // ne fonctionne pas encore
        btnRetour.setOnClickListener(btnRetourListener);
        btnZero.setOnClickListener(btnZeroListener);
        btnUn.setOnClickListener(btnUnListener);
        btnDeux.setOnClickListener(btnDeuxListener);
        btnTrois.setOnClickListener(btnTroisListener);
        btnQuatre.setOnClickListener(btnQuatreListener);
        btnCinq.setOnClickListener(btnCinqListener);
        btnSix.setOnClickListener(btnSixListener);
        btnSept.setOnClickListener(btnSeptListener);
        btnHuit.setOnClickListener(btnHuitListener);
        btnNeuf.setOnClickListener(btnNeufListener);
    }

    private View.OnClickListener btnPlusListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnPlus();
        }
    };

    private View.OnClickListener btnMoinsListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnMoins();
        }
    };

    private View.OnClickListener btnMultListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnMult();
        }
    };

    private View.OnClickListener btnDivListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnDiv();
        }
    };

    /*
    private View.OnClickListener btnPlusMoinsListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //clickOnPlusMoins();
        }
    };

    private View.OnClickListener btnMRListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //clickOnMR();
        }
    };

    private View.OnClickListener btnMListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //clickOnM();
        }
    };
    */

    private View.OnClickListener btnEgalListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnEgal();
        }
    };

    private View.OnClickListener btnRetourListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnReset();
        }
    };

    private View.OnClickListener btnPointListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum(".");
        }
    };

    private View.OnClickListener btnZeroListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("0");
        }
    };

    private View.OnClickListener btnUnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("1");
        }
    };

    private View.OnClickListener btnDeuxListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("2");
        }
    };

    private View.OnClickListener btnTroisListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("3");
        }
    };

    private View.OnClickListener btnQuatreListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("4");
        }
    };

    private View.OnClickListener btnCinqListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("5");
        }
    };

    private View.OnClickListener btnSixListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("6");
        }
    };

    private View.OnClickListener btnSeptListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("7");
        }
    };

    private View.OnClickListener btnHuitListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("8");
        }
    };

    private View.OnClickListener btnNeufListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickOnNum("9");
        }
    };

    public void clickOnNum (String str){
        if(update){
            update = false;
        }else{
            if(!textZone.getText().equals("0"))
                str = textZone.getText() + str;
        }
        textZone.setText(str);
    }

    public void clickOnPlus(){
        if(clicOperateur){
            calcul();
            textZone.setText(String.valueOf(chiffre1));
        }
        else{
            chiffre1 = Double.valueOf(textZone.getText().toString());
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }

    public void clickOnMoins(){
        if(clicOperateur){
            calcul();
            textZone.setText(String.valueOf(chiffre1));
        }
        else{
            chiffre1 = Double.valueOf(textZone.getText().toString());
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }

    public void clickOnMult(){
        if(clicOperateur){
            calcul();
            textZone.setText(String.valueOf(chiffre1));
        }
        else{
            chiffre1 = Double.valueOf(textZone.getText().toString());
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }

    public void clickOnDiv(){
        if(clicOperateur){
            calcul();
            textZone.setText(String.valueOf(chiffre1));
        }
        else{
            chiffre1 = Double.valueOf(textZone.getText().toString());
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }

    public void clickOnEgal(){
        calcul();
        update = true;
        clicOperateur = false;
    }

    public void calcul(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(textZone.getText().toString());
            textZone.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(textZone.getText().toString());
            textZone.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(textZone.getText().toString());
            textZone.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(textZone.getText().toString());
                textZone.setText(String.valueOf(chiffre1));
            } catch(ArithmeticException e) {
                textZone.setText("0");
            }
        }
    }

    public void clickOnReset(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        textZone.setText("");
    }
}// Fin de la classe MainActivity.java
