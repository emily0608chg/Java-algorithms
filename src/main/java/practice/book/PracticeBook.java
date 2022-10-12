package practice.book;

import comparable.*;

import java.util.*;

public class PracticeBook {


    public static void main(String[] args) {

        String name = "Emily";

        int pos = name.indexOf('m');
        String pos1 = String.valueOf(name.lastIndexOf('y'));

        String cad = name.substring(1, 4);
        String cad1 = name.substring(1);
        System.out.println("index of 'm' return position = " + pos);
        System.out.println("subString = " + cad);
        System.out.println("SubString return letter = " + cad1);

        System.out.println("=======================");

        String chain = "I am practicing java because I am so bad";

        boolean start = chain.startsWith("am");
        boolean end = chain.endsWith("bad");

        int indexLast = chain.lastIndexOf("I");


        System.out.println("startWith = " + start);
        System.out.println("endWith = " + end);
        System.out.println("indexLast = " + indexLast);

        System.out.println("============Parse String, Parse interger===========");

        int num = 49;

        String num1 = Integer.toString(num);

        System.out.println(num1);

        int num2 = Integer.parseInt(num1);

        System.out.println("num2 = " + num2);

        System.out.println("============StringTokenizer===========");

        String chain2 = "Emily|Andrea|Chacon|Guerrero";

        StringTokenizer stringTokenizer = new StringTokenizer(chain2, "|");

        String tok;

        while (stringTokenizer.hasMoreTokens()) {
            tok = stringTokenizer.nextToken();
            System.out.println("string token = " + tok);
        }

        System.out.println("============Date Practice===========");

        DatePractice d = new DatePractice("23/12/1980");

        int day = 5;

        d.addDays(day);

        System.out.println(" 23/12/1980 + " + day + " days is = " + d);

        System.out.println("============Test Comparable===========");

        Student arr[] = {new Student("Juan", 5, 19.5),
                new Student("Daniela", 14, 19),
                new Student("Salome", 9, 20),
                new Student("Damian", 3, 18)
        };
        System.out.println("============order by name===========");

        Util.order(arr, new CriteriaName());
        Util.print(arr);

        System.out.println("============order by notaPom===========");

        Util.order(arr, new CriteriaNotaPom());
        Util.print(arr);

        System.out.println("============order by Age===========");

        Util.order(arr, new CriteriaAge());
        Util.print(arr);

        System.out.println("============Collections Stack===========");

        Stack<String> pile = new Stack<String>();
        pile.push("uno");
        pile.push("dos");
        pile.push("tres");

        while (!pile.isEmpty()) {
            System.out.println(pile.pop());
        }

        System.out.println("============Collections Queue===========");

        Queue<String> cola = new LinkedList<String>();
        cola.add("uno");
        cola.add("dos");
        cola.add("tres");

        System.out.println(cola.poll());
        System.out.println(cola.poll());

        cola.add("cuatro");
        cola.add("cinco");
        cola.add("seis");

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }

        System.out.println("============Collections HashTable===========");

        Hashtable<String, Student> tabla = new Hashtable<String, Student>();

        tabla.put("Juan", new Student("Juan", 6, 20));
        tabla.put("Daniela", new Student("Daniela", 14, 19));
        tabla.put("Damian", new Student("Damian", 2, 18));
        tabla.put("Salome", new Student("Salome", 9, 20));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a name: ");
        String nom = scanner.nextLine();

        Student s = tabla.get(nom);

        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println(" there are not student with that name" + s);
        }

        System.out.println("============Collections HashTable===========");

        Hashtable<Integer, String> tab = new Hashtable<Integer, String>();

        tab.put(1,"uno");
        tab.put(2,"dos");
        tab.put(3,"tres");

        // la recorremos
        for(Enumeration<Integer> e=tab.keys(); e.hasMoreElements();)
        {
            // obtenemos la proxima clave
            int key = e.nextElement();
            // obtenemos el elemento asociado a la clave>
            String value = tab.get(key);

            // lo mostramos por pantalla
            System.out.println(value);
        }

        System.out.println("============Collections SortedHashTable===========");

        SortedHashTable<Integer, String> t = new SortedHashTable<Integer, String>();

        t.put(1,"uno");
        t.put(2,"dos");
        t.put(3,"tres");

        for(int i=0; i<t.keyCount(); i++)
        {
            int key = t.getKeyAt(i);
            String value = t.get(key);

            System.out.println(key + " " + value);
        }
    }
}
