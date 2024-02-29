
package src.Animales;
public class Animal {

    String nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas;
    boolean salud;
    boolean comportamiento;
    int id;

    public animal(String nombre, String especie, String raza, String color, String sexo, String edad, String peso,
                  String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                  String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento) {
        //Su constructor
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.id = id;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }

    //siempre hacer el método toString (falta por completar pq no lo entiendo mbn)
    @Override
    public String toString() {
        return "animal []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    //los getters y setters:

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
    }


    public String getAltura() {
        return altura;
    }


    public void setAltura(String altura) {
        this.altura = altura;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getHabitat() {
        return habitat;
    }


    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    public String getReproduccion() {
        return reproduccion;
    }


    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }


    public String getCuidados() {
        return cuidados;
    }


    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }


    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }


    public String getVacunas() {
        return vacunas;
    }


    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    //con booleans se have isLoQueSea () { } en vez de getters.
    //para los setters es lo mismo aunque sean booleans
    public boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }


    //Métodos para registrar los datos
    public void buenasalud(boolean salud) {
        if (salud == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de salud");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de salud");
    }

    public void buencomportamiento(boolean comportamiento) {
        if (comportamiento == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de comportamiento");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de comportamiento");
    }

    //metodo para registrar la alimentación
    public void registrarAlimentacion(String alimento) {
        System.out.println("El animal " + nombre + " ha sido alimentado con " + alimento);
    }

    //metodo para registrar la reproducción
    public void registrarReproduccion(String pareja) {
        System.out.println("El animal " + nombre + " ha tenido una relación con " + pareja);
    }
    //metodo para registrar los cuidados
    public void registrarCuidados(String cuidado) {
        System.out.println("El animal " + nombre + " ha sido cuidado con " + cuidado);
    }
    //metodo para registrar las enfermedades
    public void registrarEnfermedades(String enfermedad) {
        System.out.println("El animal " + nombre + " ha sido diagnosticado con " + enfermedad);
    }
    //metodo para registrar las vacunas
    public void registrarVacunas(String vacuna) {
        System.out.println("El animal " + nombre + " ha sido vacunado con " + vacuna);
    }
    //metodo para registrar el habitat
    public void registrarHabitat(String habitat) {
        System.out.println("El animal " + nombre + " ha sido trasladado a " + habitat);
    }
    //metodo para registrar el peso
    public void registrarPeso(String peso) {
        System.out.println("El animal " + nombre + " ha sido pesado y su peso es " + peso);
    }
    //metodo para registrar la altura
    public void registrarAltura(String altura) {
        System.out.println("El animal " + nombre + " ha sido medido y su altura es " + altura);
    }
    //metodo para registrar la edad
    public void registrarEdad(String edad) {
        System.out.println("El animal " + nombre + " ha sido medido y su edad es " + edad);
    }
    //metodo para registrar el color
    public void registrarColor(String color) {
        System.out.println("El animal " + nombre + " ha sido medido y su color es " + color);
    }
    //metodo para registrar la raza
    public void registrarRaza(String raza) {
        System.out.println("El animal " + nombre + " ha sido medido y su raza es " + raza);
    }
    //metodo para registrar la especie
    public void registrarEspecie(String especie) {
        System.out.println("El animal " + nombre + " ha sido medido y su especie es " + especie);
    }
    //metodo para registrar el nombre
    public void registrarNombre(String nombre) {
        System.out.println("El animal " + nombre + " ha sido medido y su nombre es " + nombre);
    }
    //metodo para registrar el sexo
    public void registrarSexo(String sexo) {
        System.out.println("El animal " + nombre + " ha sido medido y su sexo es " + sexo);
    }
    //metodo para registrar el tipo
    public void registrarTipo(String tipo) {
        System.out.println("El animal " + nombre + " ha sido medido y su tipo es " + tipo);
    }
    //metodo para registrar el id
    public void registrarId(int id) {
        System.out.println("El animal " + nombre + " ha sido medido y su id es " + id);
    }
    // metodo para registrar la salud
    public void registrarSalud(boolean salud) {
        System.out.println(buenasalud(salud));
    }

    // metodo para registrar el comportamiento
    public void registrarComportamiento(boolean comportamiento) {
        System.out.println(buencomportamiento(comportamiento));
    }




}
