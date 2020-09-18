package IMC;

public class Pessoa {

    private float peso;
    private float altura;
    private float imc;
    private Float pesoIdealMin;
    private Float pesoIdealMed;
    private Float pesoIdealMax;

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularImc();
        this.pesoIdealMin = calcularPesoIdeal("Min");
        this.pesoIdealMed = calcularPesoIdeal("Med");
        this.pesoIdealMax = calcularPesoIdeal("Max");
    }

    public float calcularImc() {
        return  (peso / (altura*altura)) * 1.00F;
    }

    public Float calcularPesoIdeal(String tipo) {

        Float peso = 0f;

        if (tipo.equals("Min")) {
            peso = 18.5f * altura * altura;
        }else if (tipo.equals("Med")) {
            peso = 21.75f * altura * altura;
        }else if (tipo.equals("Max")) {
            peso = 25f * altura * altura;
        }
        return peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public Float getPesoIdealMin() {
        return pesoIdealMin;
    }

    public Float getPesoIdealMed() {
        return pesoIdealMed;
    }

    public Float getPesoIdealMax() {
        return pesoIdealMax;
    }

}
