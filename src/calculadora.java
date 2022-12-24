import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {

    private JPanel Calculadora;
    private JPanel Cabecera;
    private JPanel Botonera;
    private JButton botonPorcentaje;
    private JButton inverso;
    private JButton numero7;
    private JButton numero4;
    private JButton numero1;
    private JButton botonNegativo;
    private JButton borraPrimerDisplay;
    private JButton elevadoAlCuadrardo;
    private JButton numero8;
    private JButton numero5;
    private JButton numero2;
    private JButton numero0;
    private JButton botonClean;
    private JButton botonBorrar;
    private JButton botonDivision;
    private JButton raizCuadrada;
    private JButton numero9;
    private JButton botonMultiplicar;
    private JButton numero6;
    private JButton botonResta;
    private JButton numero3;
    private JButton botonSuma;
    private JButton botonPunto;
    private JButton botonIgual;
    private JLabel display;
    private JLabel segundoDisplay;


    double primerTermino, segundoTermino, resultado;
    String operacion, mostrarCuenta;

    public calculadora() {

        //Numeros del 0 al 9
        numero1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero1.getText());
            }
        });
        numero2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero2.getText());
            }
        });
        numero3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero3.getText());
            }
        });
        numero4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero4.getText());
            }
        });
        numero5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero5.getText());
            }
        });
        numero6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero6.getText());
            }
        });
        numero7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero7.getText());
            }
        });
        numero8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero8.getText());
            }
        });
        numero9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero9.getText());
            }
        });
        numero0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + numero0.getText());
            }
        });

        //Boton de Clean
        botonClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(" ");
                segundoDisplay.setText(" ");
            }
        });

        //Boton Borra Primer Display
        borraPrimerDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(" ");
            }
        });

        //Boton borrar
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 0) {
                    calculadora.this.display.setText(calculadora.this.display.getText().substring(0, calculadora.this.display.getText().length() - 1));
                    if (calculadora.this.display.getText().length() == 0) {
                        calculadora.this.display.setText(" ");
                    }
                }
            }
        });

        //Boton de Punto
        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (display.getText() == " " || display.getText().length() == 0) {
                    display.setText(" 0.");
                }
                if (display.getText().contains(".")) {

                } else {
                    display.setText(display.getText() + botonPunto.getText());
                }
            }
        });

        //Boton Numero Negativo
        botonNegativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().contains("-"))
                {
                   display.setText((display.getText()).replace("-","")); ;
                }else
                {
                 display.setText("-" + display.getText());
                }
            }
        });

        //Operacion Suma
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerTermino = Double.parseDouble(display.getText());
                operacion = "+";
                display.setText(" ");
                segundoDisplay.setText(String.valueOf(primerTermino) + "+");
            }
        });
        //Operacion Resta
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerTermino = Double.parseDouble(display.getText());
                operacion = "-";
                display.setText(" ");
                segundoDisplay.setText(String.valueOf(primerTermino) + "-");
            }
        });
        //Operacion Multiplicar
        botonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerTermino = Double.parseDouble(display.getText());
                operacion = "*";
                display.setText(" ");
                segundoDisplay.setText(String.valueOf(primerTermino) + "*");
            }
        });
        //Operacion Division
        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerTermino = Double.parseDouble(display.getText());
                    operacion = "/";
                    display.setText(" ");
                    segundoDisplay.setText(String.valueOf(primerTermino) + "/");
            }
        });

        // Boton igual
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundoTermino = Double.parseDouble(display.getText());

                if (operacion == "+") {
                    resultado = primerTermino + segundoTermino;
                    display.setText(String.valueOf(resultado));
                    mostrarCuenta = String.valueOf(primerTermino) + "+" + String.valueOf(segundoTermino) + "=" ;
                    segundoDisplay.setText(String.valueOf(mostrarCuenta));
                } else if (operacion == "-") {
                    resultado = primerTermino - segundoTermino;
                    display.setText(String.valueOf(resultado));
                    mostrarCuenta = String.valueOf(primerTermino) + "-" + String.valueOf(segundoTermino) + "=" ;
                    segundoDisplay.setText(String.valueOf(mostrarCuenta));
                }else if (operacion == "*") {
                    resultado = primerTermino * segundoTermino;
                    display.setText(String.valueOf(resultado));
                    mostrarCuenta = String.valueOf(primerTermino) + "*" + String.valueOf(segundoTermino) + "=" ;
                    segundoDisplay.setText(String.valueOf(mostrarCuenta));
                }else if (operacion == "/") {
                    if (segundoTermino == 0) {
                        display.setText("No se puede dividir por 0");
                    } else {
                        resultado = primerTermino / segundoTermino;
                        display.setText(String.valueOf(resultado));
                        mostrarCuenta = String.valueOf(primerTermino) + "/" + String.valueOf(segundoTermino) + "=";
                        segundoDisplay.setText(String.valueOf(mostrarCuenta));
                    }
                }
            }
        });
        //Boton Porcentaje
        botonPorcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundoTermino = Double.parseDouble(display.getText());
                resultado = (primerTermino * segundoTermino) / 100;
                display.setText(String.valueOf(resultado));
            }
        });
        //Boton Inverso
        inverso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerTermino = Double.parseDouble(display.getText());
                resultado = 1 / primerTermino;
                display.setText(String.valueOf(resultado));
            }
        });
        //Boton Elevado al Cuadrado
        elevadoAlCuadrardo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            primerTermino = Double.parseDouble(display.getText());
            resultado = primerTermino * primerTermino;
            display.setText(String.valueOf(resultado));
            }
        });
        //Boton Raiz Cuadrada
        raizCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerTermino = Double.parseDouble(display.getText());
                resultado = Math.sqrt(primerTermino);
                display.setText(String.valueOf(resultado));
            }
        });

    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        ImageIcon logo = new ImageIcon("C:\\Users\\Administrador\\IdeaProjects\\calculadora\\src\\calcular.png");
        frame.setIconImage(logo.getImage());
    }


}

