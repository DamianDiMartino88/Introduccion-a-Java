package com.company;

import com.Mes.Mes;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //INTRODUCCION
        //Ejercicio 1
        int N= 5;
        double A = 10.5;
         char C  = 'S';
        System.out.println("Suma de N + A = "+(N+A));
        System.out.println("Valor Numerico de C = "+Character.getNumericValue(C));

        //Ejercicio 2
        int Y=10;
        int X=15;
        double M= 3.4;
        double N2= 7.8;

        System.out.println("Suma Y + M = "+(Y+M));
        System.out.println("Multiplicacion M * N2 = "+(M*N2));
        System.out.println("Division M / N2 = "+(M/N2));
        System.out.println("Resta X - N2 ="+(X-N2));

        //Ejercicio 3
        int N3 = 17;
        System.out.println("Prueba = "+ (((N3+77)-3)*2));
        N3=N3+77;
        N3=N3-3;
        N3=N3*2;
        System.out.println("Valor Final De N3 = "+N3);
        System.out.println();

        //Ejercicio 4
        int V1=5;
        int V2=4;
        int V3=3;
        int V4=2;
        int V5;
        System.out.println("V1 ="+V1);
        System.out.println("V2 ="+V2);
        System.out.println("V3 ="+V3);
        System.out.println("V4 ="+V4);
        V5=V2;
        V2=V3;
        V3=V1;
        V1=V4;
        V4=V5;
        System.out.println("V1 ="+V1);
        System.out.println("V2 ="+V2);
        System.out.println("V3 ="+V3);
        System.out.println("V4 ="+V4);

        //Ejercicio 5
        int paridad=1651926487;
        if(paridad%2==0){
            System.out.println("Es Par");
        }else{
            System.out.println("Es Impar");
        }

        //Ejercicio 6
        int mayorMenor=-1651926487;
        if(mayorMenor>=0){
            System.out.println("Es Positivo");
        }else{
            System.out.println("Es Negativo");
        }

        //Ejercicio 7

        int analisis=-65277;
        if(analisis>=0){
            System.out.println("Es Positivo");
        }else{
            System.out.println("Es Negativo");
        }
        if(analisis%2==0){
            System.out.println("Es Par");
        }else{
            System.out.println("Es Impar");
        }
        if(analisis%5==0){
            System.out.println("Es Multiplo de 5");
        }else{
            System.out.println("No Es Multiplo de 5");
        }
        if(analisis%10==0){
            System.out.println("Es Multiplo de 10");
        }else{
            System.out.println("No Es Multiplo de 10");
        }
        if(analisis>100){
            System.out.println("Es Mayor que 100");
        }else{
            System.out.println("No es Mayor que 100");
        }

        //Ejercicio 8
        String nombre;
        System.out.println("Escriba su Nombre:");
        nombre=scan.nextLine();
        System.out.println("Buenos dias "+nombre);

        //Ejercicio 9
        System.out.println("Indique un Numero para calcular el Doble y el Triple:");
        int numero=scan.nextInt();
        System.out.println("Numero: "+numero+" Doble: "+(numero*2)+" Triple: "+(numero*3));

        //Ejercicio 10
        double gradosFarenheit;
        double gradosCelsius;
        System.out.println("Temperatura en Farenheit a convertir a Celsius:");
        gradosFarenheit=scan.nextDouble();
        gradosCelsius=(((gradosFarenheit-32)*5)/9);
        System.out.println("El Equivalente en grados Celsius de "+gradosFarenheit+" GradosFarenheit es: "+gradosCelsius);

        //Ejercicio 11

        double radio, longitud, area;
        System.out.println("Indique el Radio de la Circunferencia de la forma x,x");
        radio=scan.nextDouble();
        longitud=(3.14*radio*2);
        area=(3.14*(radio*radio));

        System.out.println("Radio: "+radio);
        System.out.println("Longitud: "+longitud);
        System.out.println("Area: "+area);

        //Ejercicio 12
        double km,metros;
        System.out.println("Indique Velocidad en Kilometros por Hora");
        km=scan.nextDouble();

        metros=km*1000;

        System.out.println("La Velocidad de "+km+" KM/H son: "+(metros/3600)+" Metros por Segundo");

        //Ejercicio 13
        double opuesto,adyacente, hipotenusa;
        System.out.println("Indique Medida del Lado Opuesto de la forma x,x: ");
        opuesto=scan.nextDouble();
        System.out.println("Indique Medida del Lado Adyacente de a forma x,x: ");
        adyacente=scan.nextDouble();
        hipotenusa=Math.sqrt(Math.pow(opuesto,2)+Math.pow(adyacente,2));

        System.out.println("Longitud de la Hipotenusa: "+hipotenusa);

        //Ejercicio 14
        double radioEsfera,volumenEsfera;
        System.out.println("Indique Radio de la Esfera de la forma x,x:");
        radioEsfera=scan.nextDouble();
        volumenEsfera=(4/3)*3.14*Math.pow(radioEsfera,3);
        System.out.println("El Volumen de la Esfera es de : "+volumenEsfera);

        //Ejercicio 15
        double ladoTriangulo,adyacenteTriangulo;
        System.out.println("Indique Longitud del Lado del Triangulo de la forma x,x: ");
        ladoTriangulo=scan.nextDouble();
        adyacenteTriangulo=Math.sqrt(Math.pow(ladoTriangulo,2)-Math.pow((ladoTriangulo/2),2));
        System.out.println("El Area del Triangulo es: "+((ladoTriangulo*adyacenteTriangulo)/2));

        //Ejercicio 16
        int tresCifras;
        System.out.println("Indique un Numero de 3 Cifras");
        tresCifras=scan.nextInt();
        System.out.println("3er Cifra:"+(tresCifras%10)+" 2da Cifra: "+((tresCifras/10)%10)+" 1er Cifra: "+((tresCifras/100)%10));

        //Ejercicio 17
        int cincoCifras;
        System.out.println("Indique un Numero de 5 Cifras");
        tresCifras=scan.nextInt();
        System.out.println("1er Cifra:"+((tresCifras/10000)%10)+" 3er Cifra: "+((tresCifras/100)%10)+" 5ta Cifra: "+(tresCifras%10));

        //Ejercicio 18
        int horas=-1,minutos=-1,segundos=-1;
        while (horas<0||horas>=24) {
            System.out.println("Ingrese Horas:");
            horas = scan.nextInt();
            if(horas<0||horas>=24){
                System.out.println("Ingrese un Valor entre 0 y 23");
            }
        }
        while (minutos<0||minutos>=59) {
            System.out.println("Ingrese Minutos:");
            minutos = scan.nextInt();
            if(minutos<0||minutos>=59){
                System.out.println("Ingrese un Valor entre 0 y 59");
            }
        }
        while (segundos<0||segundos>=59) {
            System.out.println("Ingrese Segundos:");
            segundos = scan.nextInt();
            if(segundos<0||segundos>=59){
                System.out.println("Ingrese un Valor entre 0 y 59");
            }
        }

        System.out.println("La Hora es: "+horas+":"+minutos+":"+segundos);


        //ESTRUCTURAS DE CONTROL, COLECCIONES, CADENAS, Y RECURSIVIDAD,
        //COLECCIONES: ARRAY Y ARRAYLIST
        //Ejercicio 1

        Mes En  = new Mes("Enero",31,1);
        Mes fe  = new Mes("Febrero",28,2);
        Mes mar  = new Mes("Marzo",31,3);
        Mes ab = new Mes("Abril",30,4);
        Mes may  = new Mes("Mayo",31,5);
        Mes jun  = new Mes("Junio",30,6);
        Mes jul  = new Mes("Julio",31,7);
        Mes ag  = new Mes("Agosto",31,8);
        Mes sep  = new Mes("Septiembre",30,9);
        Mes oct = new Mes("Octubre",31,10);
        Mes nov = new Mes("Noviembre",30,11);
        Mes dic  = new Mes("Diciembre",31,12);

        Mes[] meses ={En,fe,mar,ab,may,jun,jul,ag,sep,oct,nov,dic};
        System.out.println("Indique un numero de mes entre 1 y 12");
        int mesBuscado= scan.nextInt();
        while (mesBuscado<1||mesBuscado>12){
            System.out.println("Valor Incorrecto ingrese un numeron entre 1 y 12");
            mesBuscado= scan.nextInt();
        }

        for(int i = 0  ; i<meses.length; i++){
            if(meses[i].getNumeroDeMes()==mesBuscado){
                System.out.println("El Mes de "+meses[i].getMes()+" Tiene "+meses[i].getDiasDelMes()+" Dias");
            }
        }

        //Ejercicio 2
        int j =1;
        while(j<=100){
            System.out.println("Numero: "+j+" Del Ciclo While");
            j++;
        }

        //Ejercicio 3
        j =1;
        do{
            System.out.println("Numero: "+j+" Del Ciclo Do-While");
            j++;
        }while(j<=100);

        //Ejercicio 4
        int[] enteros=new int[100];
        for( j =1   ; j<=100; j++){
            enteros[j-1]=j;
            System.out.println("Numero: "+j+" Del Ciclo For");
        }
        for (int k:enteros) {
            System.out.println("Numero: "+k+" Del Ciclo Foreach");
        }

        //Ejercicio 5
        int positivos=0,negativos=0,ceros=0;
        int[] numeros = {2,0,5,-2,4,0,-8,7,0,-9};

        for (int l:numeros) {
            if(l==0){
                ceros++;
            }
            if(l>0){
                positivos++;
            }
            if(l<0){
                negativos++;
            }
        }

        System.out.println("En el Arreglo hay: ");
        System.out.println("Numeros Positivos: "+positivos);
        System.out.println("Numeros Negativos: "+negativos);
        System.out.println("Numeros Cero     : "+ceros);

        //Ejercicio 6
        int l=0;
        int[] numerosAleatorios = new int[20];
        while (l<20){
         numerosAleatorios[l]=(int)(Math.random()*100);
         l++;
        }

        for( j =0   ; j<numerosAleatorios.length; j++){
            System.out.println("Numero Aleatorio: "+numerosAleatorios[j]);
        }

        //Ejercicio 7
        l=1;
        int m=0;
        int[] numerosPares = new int[20];
        while (m<20){
            if(l%2==0) {
                numerosPares[m] = l;
                m++;
            }
            l++;
        }
        for( j =0   ; j<numerosPares.length; j++){
            System.out.println("Numero Pares: "+numerosPares[j]);
        }

        //Ejercicio 8
        double[] alturasClase={1.50,1.75,1.63,1.57,1.66,1.85,1.72,1.47};
        double total=0;
        for (double a:alturasClase) {
            total=total+a;
        }
        System.out.println("La Altura Promedio de los: "+alturasClase.length+" Alumnos de la Clase es de "+(total/alturasClase.length));

        //Ejercicio 9
        System.out.println("Escriba una serie de numeros para calcular la suma y el promedio,  -99 para terminar ");
        int nuevoNumero=scan.nextInt();
        int  sumaDeNumeros=0, mayoresPromedio=0;
        double promedio;
        total=0;
        List<Integer>listaDeNumeros=new ArrayList<Integer>();
        while (nuevoNumero!=-99){
            total++;
            sumaDeNumeros+=nuevoNumero;
            listaDeNumeros.add(nuevoNumero);
            nuevoNumero=scan.nextInt();
        }
        promedio=(sumaDeNumeros/total);
        for(int num: listaDeNumeros) {

            mayoresPromedio+=(num>promedio)?1:0;
        }
        System.out.println("De Los "+total+" Numero Ingresados "+mayoresPromedio+" Fueron Mayores que el Promedio de: "+promedio);

        //Ejercicio 10
        List<Integer>rotarList =new ArrayList<Integer>();
        rotarList.add(1);
        rotarList.add(2);
        rotarList.add(3);
        rotarList.add(4);
        int ultimo;
        int k =0;
        System.out.println("Inicialmente El ArrayList Es: ");
        for(int i: rotarList){
            System.out.println(i);
        }
        for(int i=rotarList.size()-1; i>k; i--){
            ultimo=rotarList.get(i);
           rotarList.set(i,rotarList.get(k));
            rotarList.set(k,ultimo);
            k++;
        }
        System.out.println("Luego El ArrayList Es: ");
        for(int i: rotarList){
            System.out.println(i);
        }

        //Ejercicio 11
        String palabraMasLarga="";
        List<String> listaDePalabras = new ArrayList<String>();
        listaDePalabras.add("Aca de coronas");
        listaDePalabras.add("el sabado se fernetea?");
        listaDePalabras.add("que pasa con las palmas");
        listaDePalabras.add("iiiiiiiiiiiiiii");
        listaDePalabras.add("muero de hambre viejo");
        System.out.println("Cantidad de Carateres de las Frases:");
        for(String palabra:listaDePalabras){
            System.out.println("La Cadena: "+palabra+" Tiene: "+palabra.length()+" Caracteres");
            if(palabraMasLarga.equals("")){
                palabraMasLarga=palabra;
            }else{
                palabraMasLarga=(palabraMasLarga.length()<palabra.length())?palabra:palabraMasLarga;
            }
        }
        System.out.println("La Cadena mas Larga es: "+palabraMasLarga);

        //ESTRUCTURAS DE CONTROL, COLECCIONES, CADENAS, Y RECURSIVIDAD,
        //CADENAS Y EXPRESIONES REGULARES
        //Ejercicio 1

        System.out.println("Cantidad de Caracteres de una Frase:");
        String palabra= "la palabra para ver cuantos espacios hay";
        int i=0, contador=0;

        while (i<palabra.length()){
            contador+=(palabra.substring(i,i+1).equals(" "))?1:0;
            i++;
        }
        System.out.println("En La Cadena hay un Total de "+contador+" Espacios");

        //Ejercicio 2

        System.out.println("Cantidad de Oraciones de una Frase:");
        palabra="Hola como estas?. le dije. a lo que me contesto. de 10. esa fue nuestra conversacion.";
        i=0;
        contador=0;
        while (i<palabra.length()){
            contador+=(palabra.substring(i,i+1).equals("."))?1:0;
            i++;
        }
        System.out.println("En La Cadena hay un Total de "+contador+" Oraciones");

        //Ejercicio 2

        System.out.println("Cantidad de Silabas de una Palabra:");
        String silabas="palabrita";
        i=0;
        contador=0;
        while (i<silabas.length()){
            if(silabas.charAt(i)=='a'||silabas.charAt(i)=='e'||silabas.charAt(i)=='i'||silabas.charAt(i)=='o'||silabas.charAt(i)=='u'){
                contador++;
            }
            i++;
        }

        System.out.println("En La Palabra ' "+silabas+" ' tiene un Total de "+contador+" Silabas");


        //Ejercicio 3

        System.out.println("Frase inicial");
        System.out.println(palabra);
        i=palabra.length()-1;
        while (!palabra.substring(i-1,i).equals(" ")){
            i--;
        }
        palabra=palabra.substring(0,i-1);
        System.out.println("Frase Luego de Eliminar la ultima Palabra");
        System.out.println(palabra);

        //Ejercicio 4
        System.out.println("Cantidad de veces q aparece un caracter en un texto:");
        contador=0;
        i=0;
        while (i<palabra.length()){
            contador+=(palabra.substring(i,i+1).equals("a"))?1:0;
            i++;
        }

        System.out.println("En La Cadena hay un Total de "+contador+" Letras a");



        //ESTRUCTURAS DE CONTROL, COLECCIONES, CADENAS, Y RECURSIVIDAD,
        //RECURSIVIDAD
        //Ejercicio 1

        //Ejercicio 3


        total=0;
        System.out.println("Calculo de la Potencia de 2 Recursivamente, indique la potencia:");
        int n=scan.nextInt();
        total=potenciaRecursiva(n);
        System.out.println("Total: "+total);

        //Ejercicio 4
        System.out.println("Cantidad de Cifras Recursiva:");
        double buscarCifras=scan.nextDouble();
        int cifras=numeroDeCifras(buscarCifras);
        System.out.println("Cifras: "+cifras);

        //Ejercicio 5
        System.out.println("Suma Recursiva:");
        int max=scan.nextInt();
        int suma=sumaTotal(max,1);
        System.out.println("Total: "+suma);


        }

        public static double division(int dividendo, int divisor){
            int cociente=0;


            return cociente;
        }

        public static double potenciaRecursiva(int potencia){
            double tot;
            if(potencia==0){
                tot=1;
            }else {

                tot=2*potenciaRecursiva(potencia-1);
            }
            return tot;
        }

        public static int numeroDeCifras(double numero){
            int cifras;
            if(numero<1){
                cifras=0;
            }else {
                cifras=1+numeroDeCifras(numero/10);
            }

            return cifras;
        }

        public static int sumaTotal(int maximo, int sumado){
            int total=0;
            if(maximo==sumado){
                total=total+sumado;
            }else{
                total=sumado+sumaTotal(maximo,sumado+1);
            }
            return total;
        }

        public static int division(double dividendo, double divisor, double resto){
            int rest=0;

            return rest;
        }


}


