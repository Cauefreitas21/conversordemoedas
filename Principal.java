import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("1 - Dólar");
        System.out.println("2 - Real");
        System.out.println("3 - Libra");
        System.out.println("4 - Euro");
        System.out.println("5 - Peso");
        System.out.println("6 - Iene");
        System.out.println("7 - Sair");

        Scanner cv = new Scanner (System.in);

        int escolha = cv.nextInt();
        System.out.println(" Entre com o valor");
        double quantidade = cv.nextDouble();

        // Conversor de moedas

        switch(escolha) {
            case 1:
                Dolar_troca(quantidade);
                break;
            case 2:
                Real_troca(quantidade);
                break;
            case 3:
                Libra_troca(quantidade);
                break;
            case 4:
                Euro_troca(quantidade);
                break;
            case 5:
                Peso_troca(quantidade);
                break;
            case 6:
                Iene_troca(quantidade);
                break;
            default:
                System.out.println("Sair");

        }
    }

    public static void Dolar_troca(double quantidade) {
        System.out.println(" 1 Dolar custa " + 5.60 + " em Real");
        System.out.println(quantidade+ "Dolar= " + String.format("%.2f",quantidade*5.60) + "Real");
        System.out.println("--------------");
        System.out.println(" 1 Dolar custa " + 0.77 + " em Libras");
        System.out.println(quantidade+"Dolar= " + String.format("%.2f",quantidade*0.77) + "Libras");
        System.out.println("--------------");
        System.out.println(" 1 Dolar custa " + 0.92 + " em Euro");
        System.out.println(quantidade+" Dolar= " + String.format("%.2f",quantidade*0.92) + "Euro");
        System.out.println("--------------");
        System.out.println(" 1 Dolar custa " + 979.99 + " em Peso");
        System.out.println(quantidade+" Dolar= " + String.format("%.2f",quantidade*979.99) + "Peso");
        System.out.println("--------------");
        System.out.println(" 1 Dolar custa" + 149.48 + "em Iene");
        System.out.println(quantidade+" Dolar= " + String.format("%.2f",quantidade*149.48) + "Iene");
        System.out.println("--------------");
    }
    public static void Real_troca(double quantidade) {
        System.out.println(" 1 Real custa " + 0.18 + " em Dolar");
        System.out.println(quantidade+"Real= " + String.format("%.2f",quantidade*0.18) + "Dolar");
        System.out.println("--------------");
        System.out.println(" 1 Real custa " + 0.14 + " em Libras");
        System.out.println(quantidade+"Real=" + String.format("%.2f",quantidade*0.14) + "Libras");
        System.out.println("--------------");
        System.out.println(" 1 Real custa " + 0.16 + " em Euro");
        System.out.println(quantidade+" Real= " + String.format("%.2f",quantidade*0.16) + "Euro");
        System.out.println("--------------");
        System.out.println(" 1 Real custa " + 175.13 + " em Peso" );
        System.out.println(quantidade+" Real= " + String.format("%.2f",quantidade*175.13) + "Peso");
        System.out.println("--------------");
        System.out.println(" 1 Real custa" + 26.73 + "em Iene");
        System.out.println(quantidade+" Real= " + String.format("%.2f",quantidade*26.73) + "Iene");
        System.out.println("--------------");
    }
    public static void Libra_troca(double quantidade) {
        System.out.println("1 Libra custa " + 1.31 + " em Dolar");
        System.out.println(quantidade+" Libra= " + String.format("%.2f",quantidade*1.31) + "Dolar");
        System.out.println("--------------");
        System.out.println("1 Libra custa " + 7.31 + " em Real");
        System.out.println(quantidade+" Libra =" + String.format("%.2f",quantidade*7.31) + "Real");
        System.out.println("--------------");
        System.out.println("1 Libra custa " + 1.20 + " em Euro");
        System.out.println(quantidade+" Libra= " + String.format("%.2f",quantidade*1.20) + "Euro");
        System.out.println("--------------");
        System.out.println(" 1 Libra custa " + 1280.30 + " em Peso" );
        System.out.println(quantidade+" Libra= " + String.format("%.2f",quantidade*1280.30) + "Peso");
        System.out.println("--------------");
        System.out.println(" 1 Libra custa" + 195.53 + "em Iene");
        System.out.println(quantidade+" Libra= " + String.format("%.2f",quantidade*195.53) + "Iene");
        System.out.println("--------------");
    }
    public static void Euro_troca(double quantidade) {
        System.out.println(" 1 Euro custa " + 1.09 + " em Dolar");
        System.out.println(quantidade+"Euro= " + String.format("%.2f",quantidade*1.09) + "Dolar");
        System.out.println("--------------");
        System.out.println(" 1 Euro custa " + 6.10 + " em Real");
        System.out.println(quantidade+"= Euro" + String.format("%.2f",quantidade*6.10) + "Real");
        System.out.println("--------------");
        System.out.println(" 1 Euro custa " + 0.83 + " em Libra");
        System.out.println(quantidade+" Euro= " + String.format("%.2f",quantidade*0.83) + "Libra");
        System.out.println("--------------");
        System.out.println(" 1 Euro custa " + 1068.75 + " em Peso" );
        System.out.println(quantidade+" Euro= " + String.format("%.2f",quantidade*1068.75) + "Peso");
        System.out.println("--------------");
        System.out.println(" 1 Euro custa" + 163.25 + "em Iene");
        System.out.println(quantidade+" Euro= " + String.format("%.2f",quantidade*163.25) + "Iene");
        System.out.println("--------------");
    }
    public static void Peso_troca(double quantidade) {
        System.out.println(" 1 Peso custa " + 0.0010 + " em Dolar");
        System.out.println(quantidade+" Peso= " + String.format("%.2f",quantidade*0.0010) + "Dolar");
        System.out.println("--------------");
        System.out.println(" 1 Peso custa " + 0.0057 + " em Real");
        System.out.println(quantidade+"= Peso" + String.format("%.2f",quantidade*0.0057) + "Real");
        System.out.println("--------------");
        System.out.println(" 1 Peso custa " + 0.00078 + " em Libra");
        System.out.println(quantidade+" Peso= " + String.format("%.2f",quantidade*0.00078) + "Libra");
        System.out.println("--------------");
        System.out.println(" 1 Peso custa " + 0.00094 + " em Euro" );
        System.out.println(quantidade+" Peso= " + String.format("%.2f",quantidade*0.00094) + "Euro");
        System.out.println("--------------");
        System.out.println(" 1 Peso custa" + 0.15 + "em Iene");
        System.out.println(quantidade+" Peso= " + String.format("%.2f",quantidade*0.15) + "Iene");
        System.out.println("--------------");
    }
    public static void Iene_troca(double quantidade) {
        System.out.println(" 1 Iene custa " + 0.0067 + " em Dolar");
        System.out.println(quantidade+" Iene= " + String.format("%.2f",quantidade*0.0067) + "Dolar");
        System.out.println("--------------");
        System.out.println(" 1 Iene custa " + 0.037 + " em Real");
        System.out.println(quantidade+"= Iene" + String.format("%.2f",quantidade*0.037) + "Real");
        System.out.println("--------------");
        System.out.println(" 1 Iene custa " + 0.0051 + " em Libra");
        System.out.println(quantidade+" Iene= " + String.format("%.2f",quantidade*0.0051) + "Libra");
        System.out.println("--------------");
        System.out.println(" 1 Iene custa " + 0.0061 + " em Euro" );
        System.out.println(quantidade+" Iene= " + String.format("%.2f",quantidade*0.0061) + "Euro");
        System.out.println("--------------");
        System.out.println(" 1 Iene custa" + 6.55 + "em Peso");
        System.out.println(quantidade+" Iene= " + String.format("%.2f",quantidade*6.55) + "Peso");
        System.out.println("--------------");

    }
}

