1. Predice la salida sin ejecutar y dibuja la memoria al final. Luego compruébala.
Libro a = new Libro("Ficciones", "Borges");
Libro b = new Libro("Ficciones", "Borges");
Libro c = a;
c.prestar();
a = b;
System.out.println(a.estaDisponible());
System.out.println(c.estaDisponible());
System.out.println(a == c);
La salida del código es:
1. true ya que a apunta a b y b no ha sido prestado.
2. false ya que c apunta al primer libro de a y este se presto.
3. false ya que a y c se dirigen a objetos distintos en la memoria. a se dirige a b y c apunta a al objeto original.


PREGUNTAS:
1. ¿Qué guarda una variable int y qué guarda una variable Libro?
La variable int guarda el valor númerico, y la variable libro guarda una dirección de memoria que es donde el objeto se guarda, el espacio de la memoria que ocupa.

2. ¿Por qué prestar con l2 cambió l1 pero no l3?
ya que l1 y l2 compartían el mismo espacio de memoria y al modificar l2 también se modifica l1, mientras que l3 era un objeto independient creado con new.

3. ¿Por qué el compilador no detectó la NullPointerException?
ya que el compilador de java verifica la sintaxis antes de ejecutarlo.

4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?
al modificar el objeto se esta haciendo de manera global osea que afecta todo mientras que al asignar un nuevo parámetro solo se modifica de manera local y no modifica el global o el original.

5. ¿Qué invariantes protege Libro y cómo las protege?
protege que los atributos no sean manipulados, o que no tengan valores inválidos y los protege el encapsulamiento exponiendo solamente métodos controlados con validaciones como getters y setters. 


