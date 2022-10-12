package practice;

public class Permutations {

   /* public static void mostrarPermutaciones(String s, StringBuffer aux)
    {
        // condicion de corte s.length()<3
        // si la cadena tiene menos de 3 caracteres entonces podemos
        // mostrar las dos permutaciones posibles
        if( s.length()<3 )
        {
            // mostramos los caracteres sustraidos seguidos de la primera permutacion
            System.out.println(aux+""+s.charAt(0)+""+s.charAt(1));
            // mostramos los caracteres sustraidos seguidos de la segunda permutacion
            System.out.println(aux+""+s.charAt(1)+""+s.charAt(0));
        }
        else
        {
            // si la cadena tiene 3 o mas caracteres...
            for(int i=0; i<s.length(); i++)
            {
                // tomamos el i-esimo caracter
                char c = s.charAt(i);
                // lo agregamos al historial de caracteres sustraidos
                aux.append(c);
                // lo eliminamos de la cadena
                String s1 = UString.removeChar(s,i);
                // llamada recursiva con un caracter menos
                mostrarPermutaciones(s1,aux);
                // removemos el caracter sustraido de la cadena auxiliar
                aux.deleteCharAt(aux.length()-1);
            }
        }*/
}
