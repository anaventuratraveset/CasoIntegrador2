public class casoIntegrador2 {

    abstract class Habitat {
        //creo esta clase como base para todos los habitats
        //al ser abstract no puede ser usada para crear objetos
        //Para acceder a ella ha de ser heredada por otra clase (EJ: habitatTerrestre
        String tipoHabitat;

        Habitat(String tipoHabitat) {
            //esto es el constructor
            this.tipoHabitat = tipoHabitat;
        }

        abstract void mostrarInfo();
    }

    class HabitatAcuatico extends Habitat {
        int temperaturaAgua;
        int nivelHumedad;
        int nivelLimpieza;


        // Creo cada habitat en una clase distinta?
        //Entender bien que significa crear una clase, un objeto, herencia, etc
        //lo del this y lo del super por favor sos
        // ver lo del copylot, github y todo eso
        HabitatAcuatico (String tipoHabitat, int temperatura, int humedad, int limpieza){
            //constructor
            super(tipoHabitat);
            this.temperatura= temperaturaAgua; //no sé si es asi o al reves
            this.humedad = nivelHumedad;
            this.limpieza = nivelLimpieza;
        }
    }
}
