//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int carton = 34;
        System.out.println("On déménage ! On a 34 cartons et le camion peut prendre 9 cartons.");

        for (int i = 1; i <= carton; i++) {

            if(carton>0 && carton<=34){
                System.out.println("Le déménagement est en cours ! On a effectué " +i+ " voyage(s). On a déplacé " +i*9 +" cartons.");
            }
            else{
                System.out.println ("Erreur");
            }
            carton = carton - 9;
            //System.out.println(carton);
        }
    }
}