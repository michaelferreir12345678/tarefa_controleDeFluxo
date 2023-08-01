public class CalculoMediaGeral {

    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    private Double media;

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double calculaMedia(){
        Double somaNotas = this.nota1 + this.nota2 + this.nota3 + this.nota4;
        this.media = somaNotas / 4;
        return this.media;
    }
    public String resultadoAprovacao(Double media){
        media = this.media;
        if (media < 5){
            return "Reprovado";
        } else if(media >= 5 && media < 7){
            return "Recuperação";
        } else {
            return "Aprovado!!";
        }
    }
};
