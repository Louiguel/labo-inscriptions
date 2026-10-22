package cm.laboacademy.inscriptions;

public class FraisInscription {

    public int calculer(String niveau, boolean boursier) {
        int fraisBase;

        switch (niveau) {
            case "L1":
            case "L2":
            case "L3":
                fraisBase = 50000;
                break;

            case "M1":
            case "M2":
                fraisBase = 75000;
                break;

            default:
                throw new IllegalArgumentException(
                    "Niveau d'inscription inconnu : " + niveau
                );
        }

        return boursier ? fraisBase / 2 : fraisBase;
    }
}
