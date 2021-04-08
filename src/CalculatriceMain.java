import com.maltem.test.AddOperation;
import com.maltem.test.MinusOperation;
import com.maltem.test.Operation;
import java.util.Scanner;

public class CalculatriceMain {

    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrer votre operation souhaitée comme l'exemple suivant\n : number1 + number 2");
        String expression = clavier.nextLine();
        String firstValue ="";
        String secondValue ="";
        String endResult="";

        if (expression.contains("+") && expression.split("\\+").length>1){
            firstValue = expression.split("\\+")[0];
            secondValue = expression.split("\\+")[1];
            Operation addOperation = new AddOperation();
            addOperation.calcul(Integer.valueOf(firstValue),Integer.valueOf(secondValue));
            endResult=addOperation.result();

        } else if (expression.contains("-") && expression.split("-").length>1){
            firstValue = expression.split("-")[0];
            secondValue = expression.split("-")[1];
            Operation minusOperation = new MinusOperation();
            minusOperation.calcul(Integer.valueOf(firstValue),Integer.valueOf(secondValue));
            endResult=minusOperation.result();
        } else {
            System.out.println("Operation Invalide ");
            return;
        }
        System.out.println("Le resultat est : " + endResult);
    }
}
