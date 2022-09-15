
package ejercicioHerenciaInmobiliaria;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PruebaFechas {

    public static void main(String[] args) {
        
        SimpleDateFormat formatoFecha1 =new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatoFecha2 =new SimpleDateFormat(" 'En Oviedo, a ' dd ' de ' MMMMM ' de ' yyyy ");
        java.util.Date momentoActual = new java.util.Date();
        String cadenaFechaFormato1 = formatoFecha1.format(momentoActual);
        String cadenaFechaFormato2 = formatoFecha2.format(momentoActual);
        System.out.println("Tiempo actual del sistema : "+cadenaFechaFormato1);
        System.out.println("Tiempo actual del sistema : "+cadenaFechaFormato2);
                 
        
        System.out.println(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new java.util.Date()));
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("----- FECHA A ENCAPSULAR EN java.sql.Date -----");
        String fechaRecogida1 = "28/06/1969";
        String fechaTransformada1 = fechaRecogida1.substring(6, 10)+"-"+fechaRecogida1.substring(3, 5)+"-"+fechaRecogida1.substring(0, 2);
        System.out.println("Cadena con el formato de fecha requerido por el mÃ©todo valueOf : "+fechaTransformada1);             
        java.sql.Date fechaAInsertarEnBD1 = java.sql.Date.valueOf(fechaTransformada1);             
        System.out.println("VisualizaciÃ³n de la fecha a insertar en BD : "+new java.text.SimpleDateFormat("dd-MM-yyyy").format(fechaAInsertarEnBD1));
        System.out.println("La fecha a insertar en BD expresada en milisegudos : "+fechaAInsertarEnBD1.getTime());
        System.out.println("                                                    ");
        System.out.println("----- FECHA A ENCAPSULAR EN java.sql.Timestamp -----");
        String fechaRecogida2 = "28/06/1973:08:10:35";
        String fechaTransformada2 = fechaRecogida2.substring(6, 10)+"-"+fechaRecogida2.substring(3, 5)+"-"+fechaRecogida2.substring(0, 2)+" "+fechaRecogida2.substring(11, 19);
        System.out.println("Cadena con el formato de fecha requerido por el mÃ©todo valueOf : "+fechaTransformada2);             
        java.sql.Timestamp fechaAInsertarEnBD2 = java.sql.Timestamp.valueOf(fechaTransformada2);             
        System.out.println("VisualizaciÃ³n de la fecha a insertar en BD : "+new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(fechaAInsertarEnBD2));
        System.out.println("La fecha a insertar en BD expresada en milisegudos : "+fechaAInsertarEnBD2.getTime());
        
        System.out.println("-------------------------------------------------------------");
        java.util.Date ahora = new java.util.Date();
        // ahora.getTime()   long
        // ahora.setTime(long milisegundos);
        
        java.sql.Timestamp fechaTimestamp = new Timestamp(ahora.getTime());       
        // fechaTimestamp.getTime()   long
        // fechaTimestamp.setTime(long milisegundos);
        System.out.println("Timestamp : "+formatoFecha1.format(fechaTimestamp));
        System.out.println("Timestamp : "+formatoFecha2.format(fechaTimestamp));        
        
        System.out.println("----- CÃ�LCULO DE NÃšMERO DE DÃ�AS ENTRE DOS FECHAS -----");
        SimpleDateFormat formatoFecha =new SimpleDateFormat("dd-MMMM-yyyy");
        String cadenaFechaEntrada = "24/01/2019";
        String cadenaFechaEntradaTransformada = cadenaFechaEntrada.substring(6, 10)+"-"+cadenaFechaEntrada.substring(3, 5)+"-"+cadenaFechaEntrada.substring(0, 2);            
        java.sql.Date fechaEntrada = java.sql.Date.valueOf(cadenaFechaEntradaTransformada); 
        java.util.Date fechaSalida = new java.util.Date();
        long numeroDias = (fechaSalida.getTime() - fechaEntrada.getTime()) / (24*60*60*1000);
        System.out.println("El nÃºmero de dÃ­as de estancia entre");
        System.out.println("el "+formatoFecha.format(fechaEntrada));
        System.out.println("y el "+formatoFecha.format(fechaSalida));
        System.out.println("es "+numeroDias+" dÃ­as");
        
       
        System.out.println("----- CÃ�LCULO DE LA FECHA POSTERIOR EN UN NÃšMERO DE DÃ�AS A LA ACTUAL -----");
        formatoFecha =new SimpleDateFormat("dd-MMMM-yyyy");    
        java.util.Date fechaActual = new java.util.Date();
        int diasCaducidadProducto = 30;
        long diasATranscurrir = (long)diasCaducidadProducto;
        long milisegundosFechaActual = fechaActual.getTime();
        java.sql.Date fechaCaducidad=new java.sql.Date(milisegundosFechaActual+(diasATranscurrir*24*60*60*1000));
        System.out.println("Consumir preferentemente antes de "+formatoFecha.format(fechaCaducidad));
                    
            
        GregorianCalendar gregorianCalendar = new GregorianCalendar();        
        System.out.println(String.format("%02d", gregorianCalendar.get(Calendar.DATE)));
        System.out.println(String.format("%02d", gregorianCalendar.get(Calendar.MONTH)+1));
        System.out.println(String.format("%04d", gregorianCalendar.get(Calendar.YEAR)));
   
        gregorianCalendar = new GregorianCalendar();
        String fechaAhora = String.format("%04d", gregorianCalendar.get(Calendar.YEAR)) ;//+ "-" + String.format("%02d", gregorianCalendar.get(Calendar.MONTH)+1) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.DATE)) + " " + String.format("%02d", gregorianCalendar.get(Calendar.HOUR_OF_DAY)) + ":" + String.format("%02d", gregorianCalendar.get(Calendar.MINUTE)) + ":" + String.format("%02d", gregorianCalendar.get(Calendar.SECOND));
        System.out.println("GregorianCalendar sin convertir a Date : "+fechaAhora);
        System.out.println("GragorianCalendar en milisegundos : "+gregorianCalendar.getTimeInMillis());
        System.out.println("GregorianCalendar convertida a Date y formateada : "+new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(gregorianCalendar.getTime()));
        
        int numeroDiasPosteriores = 50;
        gregorianCalendar.add(Calendar.DATE, numeroDiasPosteriores);
        String fechaAplazada = String.format("%04d", gregorianCalendar.get(Calendar.YEAR)) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.MONTH)+1) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.DATE));
        System.out.println("Sumando un nÃºmero de dÃ­as, el objeto pasa a encapsular la siguiente fecha : "+fechaAplazada);
        
        gregorianCalendar = new GregorianCalendar(1973, 5, 28, 14, 12, 48);
        String fecha = String.format("%04d", gregorianCalendar.get(Calendar.YEAR)) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.MONTH)+1) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.DATE)) + " " + String.format("%02d", gregorianCalendar.get(Calendar.HOUR_OF_DAY)) + ":" + String.format("%02d", gregorianCalendar.get(Calendar.MINUTE)) + ":" + String.format("%02d", gregorianCalendar.get(Calendar.SECOND));
        System.out.println("GregorianCalendar  : "+fecha);     
        gregorianCalendar.set(Calendar.YEAR, 1975);
        fecha = String.format("%04d", gregorianCalendar.get(Calendar.YEAR)) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.MONTH)+1) + "-" + String.format("%02d", gregorianCalendar.get(Calendar.DATE)) + " " + String.format("%02d", gregorianCalendar.get(Calendar.HOUR_OF_DAY)) + ":" + String.format("%02d", gregorianCalendar.get(Calendar.MINUTE)) + ":" + String.format("%02d", gregorianCalendar.get(Calendar.SECOND));
        System.out.println("fecha al modificar el aÃ±o  : "+fecha); 
       
        
        int numero;
        long tiempo1 = System.currentTimeMillis();
        System.out.println("el tiempo del sistema antes de inciar el proceso es : "+tiempo1);
        for (int i=1; i<=100000; i++)
            for (int j=1; j<=100000; j++)
                for (int k=1; k<=100000; k++)
                    numero=k;
        long tiempo2 = System.currentTimeMillis();
        System.out.println("el tiempo del sistema al finalizar el proceso es : "+tiempo2);
        long tiempoTranscurrido = tiempo2 - tiempo1;
        System.out.println("los milisegundos transcurridos en el proceso son : "+tiempoTranscurrido);
        // gregorianCalendar.getTime()   devuelve Date
        // gregorianCalendar.getTimeInMillis()  devuelve long
        // gregorianCalendar.setTime(date);
        // gregorianCalendar.setTimeInMillis(milisegundos);          
    }
    
}
