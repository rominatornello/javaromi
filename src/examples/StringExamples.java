package examples;

/**
 * Created by Romina.Tornello on 3/13/2015.
 * Usos de String
 */
public class StringExamples {



     public static void main(String[] args){

         //String example
         String name=new String();
         name="Romina Paola";//la cadena no va a cambiar
         System.out.print("la persona" + name + "\n");

        //String Builder Example: la cadena puede cambiar y hay solo un hilo de jecución
         StringBuilder exampleBuilder = new StringBuilder();
         StringBuilder exampleBuilder2 = new StringBuilder();
         exampleBuilder.append("Hello people");
         System.out.print("exampleBuilder:" + exampleBuilder +"\n");
         exampleBuilder.reverse();
         System.out.print("exampleBuilder reverse:" + exampleBuilder +"\n");
         System.out.print("exampleBuilder hash code:"+exampleBuilder.hashCode()+"\n");
         System.out.print("exampleBuilder2 hash code:"+exampleBuilder2.hashCode()+"\n");

         //String Buffer Example :si la cadena de caracteres puede cambiar y tenemos varios hilos de ejecución
         StringBuffer materiasRendidas= new StringBuffer();
         materiasRendidas.append("matematica,");
         materiasRendidas.append("ingles");
         //System.out.print("materias rendidas: "+ materiasRendidas.toString()+"\n");
          char signo = '!';
         materiasRendidas.append(signo);

        // System.out.print(materiasRendidas.hashCode());
        // System.out.print("materias rendidas: "+ materiasRendidas.toString());




     }
}
/**El uso de StringBuilder se utiliza cdo hay mas de un hilo de ejecucion */
