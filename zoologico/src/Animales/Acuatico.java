package src.Animales;

public class Acuatico extends Animal {

    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipo_agua;

    public animal_acuatico(String nombre, String especie, String raza, String color, String sexo, String edad,
                           String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                           String cuidados, String enfermedades, String vacunas, int id,boolean salud, boolean comportamiento, boolean aletas, boolean branquias,
                           boolean escamas, String tipo_agua) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
                enfermedades, vacunas, id, salud, comportamiento);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
    }

    //Setters y getters de los atributos personalizads de los acuáticos
    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

