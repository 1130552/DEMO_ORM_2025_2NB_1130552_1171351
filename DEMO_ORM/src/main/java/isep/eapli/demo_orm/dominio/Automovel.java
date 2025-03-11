package isep.eapli.demo_orm.dominio;

public class Automovel {
    private float km;
    private String matricula;

    public void setKm(float km) {
        this.km = km;
    }

    public String matricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "km=" + km +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
