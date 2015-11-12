
 /**Imaginemos que tenemos un amigo programador en Java como nosotros que quiere hacer una aplicaci�n para tel�fonos Android consistente en un reloj en formato 24 horas,
 * que muestre las horas y minutos desde las 00:00 hasta las 23:59.
 *Como anda muy apurado de tiempo, nos pide que le hagamos parte del trabajo. Concretamente necesita que le programemos una clase llamada ClockDisplay que:
 *Permita fijar un momento determinado de tiempo expresado en horas y minutos. Por ejemplo, si yo le indico a un m�todo 23 y 45 como par�metros,
 *el tiempo del reloj debe quedar fijado a 23:45. El nombre del m�todo debe ser setTime.
 *permita hacer avanzar un minuto el tiempo fijado. Evidentemente, el usuario podr� invocar este m�todo tantas veces como quiera. El nombre del m�todo debe ser timeTick.
 *Devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. El nombre del m�todo debe ser getTime. 
 *Ojo: la cadena siempre debe tener 5 caracteres.
 *Vete haciendo commits conforme le a�ades funcionalidad a tu clase y s�belo a GitHub.
 *Es muy posible que no seas capaz de completar la actividad. No te preocupes, el objetivo es intentarlo.
 * 
 */
    public class ClockDisplay
{
    // 
    private int horas;
    // 
    private int minutos;
    
    /**
     * iniciar valores a cero 
     */
    public ClockDisplay()
    {
        horas = 0;
        minutos = 0;
    } 
    /**
     * fijar la hora
     */
    public void setTime(int hora, int minuto)
    {
        horas = hora;
        minutos = minuto;
    }
    /**
     * aumentar un minuto cada vez que se invoca
     */
    public void TimeTick()
    {
       minutos = (minutos+1);
       if ( minutos==60){
            horas=(horas+1);
            minutos=(0);
        }
       if (horas == 24){
        horas=00;
       }
       
    }  
    /**
     * Devolcer la hora en 5 caracteres divididos por ":"
     */
    public String getTime()
    {
        if (horas < 10 & minutos < 10){
            return "0" + horas + ":" + "0" + minutos;
        }
        else if( horas < 10 ){
            return "0"+ horas + ":" + minutos;
        }
        else if( minutos < 10 ) {
            return horas + ":" + "0" + minutos;
        }
        else {
        return horas + ":" + minutos;
        }
    }
}
    
   