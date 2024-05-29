public class arbol{
    public static void main(String args[]){
        int columna = 3;    //Número de columnas con las que empezara el árbol
        int filas = 8;      //Núemro de filas que tendra el árbol, no contamos la fila de la estrella y del primer 0
        int indent = 7;     //Número de indentaciones que se realizaran para alinear las filas

        System.out.println("        *        ");    //Se imprime la estrella de manera arbitraria
        System.out.println("        0        ");    //Se imprime el primer 0 de manera arbitraria
        for(int i = 0; i < filas; i++){         //Ciclo for para imprimir las filas que tendra el árbol
            for(int k = 0; k < indent; k++){    //Ciclo for para imprimir las indentaciones de las filas
                System.out.print(" ");
            }
            for(int j = 0; j < columna; j++){   //Ciclo for para imprimir las columnas del árbol
                System.out.print("0");
            }
            System.out.println();
            columna = columna + 2;  //Se incrementa el número de columnas en dos, esto debido a que se requieren dos 0's mas que en las anteriores
            indent = indent - 1;    //Al indentado se le resta 1 para que se recorran las columnas
        }
    }
}