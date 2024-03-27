import javax.swing.JOptionPane;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(Double.parseDouble(JOptionPane.showInputDialog("Digite seu número preferido:")));
        //testar soma
        double soma = calc.somar(2, 3);
        System.out.println(soma);
        //testar substracao
        double sub = calc.subtrair(2, 3);
        System.out.println(sub);
        System.out.println(calc.somarComPreferido(Double.parseDouble(JOptionPane.showInputDialog("Digite seu número para somar com o preferido:"))));
    }
}
