public class Ej1 {

    public static void main(String[] args) {

        int nAnos = 1;
        int nDias = 1;
        int nHoras = 1;

        combertidorSegundos(nAnos, nDias, nHoras);

    }

    public static void combertidorSegundos(int nAnos, int nDias, int nHoras) {

        int ndiasxAno = 365;
        int nhoursxDia = 24;
        int nminsxHora = 60;
        int nsecsxMin = 60;

        int segxAno = nAnos * ndiasxAno * nhoursxDia * nminsxHora * nsecsxMin;
        int segxDia = nDias * nhoursxDia * nminsxHora * nsecsxMin;
        int segxHora = nHoras * nminsxHora * nsecsxMin;

        System.out.println("Segundos en " + nAnos + " años: " + segxAno);
        System.out.println("Segundos en " + nDias + " días: " + segxDia);
        System.out.println("Segundos en " + nHoras + " horas: " + segxHora);
    }
}
