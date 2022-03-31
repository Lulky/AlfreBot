import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hola, %s. Encantado de verte!", name);
        
    }
    
    public String dateAnnouncement() {
        return String.format("Actualmente es %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        if (conversation.indexOf("Alexis") > -1) {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "A su servicio. Como desee, naturalmente";  
        }
        
        return "Bien. Y con eso, me retiraré";
    }   
    
    public String notRelevantTest(String name, String dayPeriod) {
        return String.format("Buenas noches %s, %s. Encantado de verte", name, dayPeriod);
    }
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    //="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}
