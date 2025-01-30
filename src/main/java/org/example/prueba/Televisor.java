package org.example;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;;

    public Televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public Televisor(int valorCanal) {
        if (valorCanal >= 1 && valorCanal <= 99) {
            this.canal = valorCanal;
        } else {
            this.canal = 1;
        }
        this.volumen = 5;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen < 0 || volumen > 100) {
            System.out.println("No se puede subir el volumen");
        } else {
            System.out.println("Volumen: " + volumen);
            this.volumen = volumen;
        }

    }

    public void subirVolumen() {
        if (volumen < 99) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        }else {
            System.out.println("No se puede subir el volumen");
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        }else {
            System.out.println("No se puede bajar el volumen");
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal < 1 || canal > 100) {
            System.out.println("No se puede cambiar el canal");
        } else {
            System.out.println("Canal: " + canal);
            this.canal = canal;
        }
    }

    public void subirCanal() {
        if (canal < 99) {
            canal++;
            System.out.println("Canal: " + canal);
        }else {
            System.out.println("No se puede subir el canal");
        }
    }

    public void bajarCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        }else {
            System.out.println("No se puede bajar el canal");
        }
    }

    @Override
    public String toString() {
        return "Televisor " +
                "canal = " + canal +
                ", volumen = " + volumen
                ;
    }

}
