package starwars;

import java.util.Objects;

import java.util.Random;

/**
 * La clase Jedi contiene uno de los personajes con sus atributos, el cual se
 * enfrenta a otro creado en otra clase llamada Sith.
 * 
 * @author matia
 * @version 1.0
 * @since 27/03/2024
 */

public class Jedi {
	// ATRIBUTOS
	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoCapa;

	/**
	 * Parametros necesarios para la creacion del objeto Jedi.
	 * 
	 * @param nombre
	 * @param salud
	 * @param fuerza
	 * @param tipoCapa
	 */
	// CONSTRUCTOR
	public Jedi(String nombre, int salud, int fuerza, String tipoCapa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.random = new Random();
		this.tipoCapa = tipoCapa;
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable nombre.
	 */
	// CREO GETTER AND SETTER
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Permite modificar el atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable salud.
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * 
	 * @param salud. Permite modificar el atributo salud.
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable fuerza.
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * 
	 * @param fuerza. Permite modificar el atributo fuerza.
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * Metodo toString, permite ver los datos del objeto Sith.
	 */
	// METODO TOSTRING
	@Override
	public String toString() {
		return "Jedi [nombre=" + nombre + ", salud=" + salud + ", fuerza=" + fuerza + ", tipoCapa=" + tipoCapa + "]";
	}

	/**
	 * El metodo imprimir, muestra por pantalla todos los datos de el objeto Jedi.
	 */
	// METODO IMPIRMIR
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salud: " + this.salud);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Tipo de capa: " + this.tipoCapa);
	}

	/**
	 * Metodo importante ya que es el que interactua con ambos objetos(personajes).
	 * 
	 * @param sith. Este parámetro es un objeto Sith al que el Jedi le infringe un
	 *              daño.
	 * @deprecated Creado metodo nuevo, mejorado llamado atacarNuevo.
	 * 
	 */
	// METODO ATACAR
	public void atacar(Sith sith) {
		int danyo = random.nextInt(30, 60);
		System.out.println(this.nombre + " ataca a " + sith.getNombre() + "!");
		sith.recibirAtaque(danyo);
	}
	
	/**
	 * 
	 * @param sith. Este parámetro es un objeto Sith al que el Jedi le infringe un
	 *              daño, mejora el antiguo metodo atacar, esta desde la version 1.2.
	 *              @since 1.2.
	 */
	public void atacarNuevo(Sith sith) {
	    int danyo = calcularDanyo();
	    System.out.println(this.nombre + " ataca a " + sith.getNombre() + "!");
	    if (esGolpeCritico()) {
	        danyo += 20; // Daño adicional por golpe crítico
	        System.out.println("¡Golpe crítico!");
	    }
	    sith.recibirAtaque(danyo);
	}

	/**
	 * Este metodo calcula el daño.
	 * 
	 * @return Devuelve daño aleatorio entre 30 y 60.
	 */
	private int calcularDanyo() {
	    return random.nextInt(31) + 30;
	}

	/**
	 * Este metodo gestiona la probabilidad de un golpe crítico.
	 * @return Devuelve la probabilidad de 20% de golpe crítico.
	 */
	private boolean esGolpeCritico() {
	    return random.nextDouble() < 0.2;
	}


	/**
	 * 
	 * @param danyo. Este parámetro recoje el daño recibido en el ataque del Sith
	 *               hacia el objeto Jedi.
	 */
	// METODO RECIBIR ATAQUE
	public void recibirAtaque(int danyo) {
		this.salud -= danyo;
		if (this.salud <= 0) {
			System.out.println(this.nombre + " ha sido derrotado.");
		} else {
			System.out.println(this.nombre + " recibe " + danyo + " puntos de daño. Salud restante: " + this.salud);
		}
	}

	/**
	 * El metodo grito de guerra, en el caso de ganar la pelea es enseñado en
	 * pantalla.
	 */
	// METODO GRITO GUERRA
	public void gritoGuerra() {
		System.out.println("Que la fuerza te acompañe!!");
	}

}
