//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int carton = 34;
        System.out.println("On déménage ! On a 34 cartons et le camion peut prendre 9 cartons.");

        for (int i = 0; i <= carton; i++) {

            if(carton>0 && carton<=34){
                System.out.println("Le déménagement est en cours ! On a effectué " +i+ " voyage(s). Il reste " +carton +" cartons.");
            }
            else{
                System.out.println ("Erreur");
            }
            carton = carton - 9;
            if (carton < 0) {
                System.out.println("Le déménagement est terminé ! On a effectué " +(i+1)+ " voyage(s). Il reste 0 cartons.");
                break;
            }

        }
    }
}
