package starwars;

import java.util.Objects;
import java.util.Random;

/**
 * 
 * La clase Sith contiene uno de los personajes con sus atributos, el cual se
 * enfrenta a otro creado en otra clase llamada Jedi
 * 
 * @author matia
 * @version 1.0
 * @since 27/03/2024
 */

public class Sith {

	// ATRIBUTOS
	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoEspada;

	/**
	 * Parametros necesarios para la creacion del objeto Sith.
	 * 
	 * @param nombre
	 * @param salud
	 * @param fuerza
	 * @param tipoEspada
	 */
	// CONSTRUCTOR
	public Sith(String nombre, int salud, int fuerza, String tipoEspada) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.random = new Random();
		this.tipoEspada = tipoEspada;
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
	 * @param nombre. Permite modificar el atributo nombre.
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
		return "Sith [nombre=" + nombre + ", salud=" + salud + ", fuerza=" + fuerza + ", tipoEspada=" + tipoEspada
				+ "]";
	}

	/**
	 * El metodo imprimir, muestra por pantalla todos los datos de el objeto Sith.
	 */
	// METODO IMPIRMIR
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salud: " + this.salud);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Tipo de espada: " + tipoEspada);
	}

	/**
	 * Metodo importante ya que es el que interactua con ambos objetos(personajes)
	 * infringiendo daño con un ataque.
	 * 
	 * @param jedi. Este parámetro es un objeto Jedi al que el Sith le infringe un
	 *              daño.
	 * @deprecated Deja de funcionar porque hay una version mas actual.
	 * 
	 */
	// METODO ATACAR
	public void atacar(Jedi jedi) {
		int danyo = random.nextInt(30, 60);
		System.out.println(this.nombre + " ataca a " + jedi.getNombre() + "!");
		jedi.recibirAtaque(danyo);
	}

	/**
	 * 
	 * Metodo mejorado de para generar ataque, infringe daño con un ataque.
	 * 
	 * @param jedi. Este parámetro es un objeto Jedi al que el Sith le infringe un
	 *              daño.
	 */
	public void atacarNuevo(Jedi jedi) {
		int danyo = calcularDanyo();
		System.out.println(this.nombre + " ataca a " + jedi.getNombre() + "!");
		if (esGolpeCritico()) {
			danyo += 20; // Daño adicional por golpe crítico
			System.out.println("¡Golpe crítico!");
		}
		jedi.recibirAtaque(danyo);
	}

	/**
	 * 
	 * Este metodo calcula el daño.
	 * 
	 * @return Devuelve daño aleatorio entre 30 y 60.
	 */
	private int calcularDanyo() {
		return random.nextInt(31) + 30; // Daño aleatorio entre 30 y 60
	}

	/**
	 * 
	 * Este metodo gestiona la probabilidad de un golpe crítico.
	 * 
	 * @return Devuelve la probabilidad de 20% de golpe crítico.
	 */
	private boolean esGolpeCritico() {
		return random.nextDouble() < 0.2; // Probabilidad de 20% de golpe crítico
	}

	/**
	 * 
	 * @param danyo. Este parámetro recoje el daño recibido en el ataque del Jedi
	 *               hacia el objeto Sith.
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
	 * El metodo amenaza oscura, en el caso de ganar la pelea es enseñado en
	 * pantalla.
	 */
	// METODO AMENAZA OSCURA
	public void amenazaOscura() {
		System.out.println("Has muerto Jedi...");
	}

}
