package com.upchiapas.examen.models;
import java.util.Stack;
public class palabra {
        private String Inf;
        //public String sim = "";
        //public String let = "";
    public palabra (String inf){
            this.Inf = inf;
        }
        //Declaración de variables
            public void Pref(){
                String plus = "";
                String minus = "";
                String mult = "";
                String slash = "";
                String aux3 = "";
                String aux2 = "";
                String aux1="";
                String aux;

                //Creación de la pila principal
                Stack <Character> stack = new Stack<Character>();
            for (int i = 0; i < Inf.length(); i++){
                stack.push(Inf.charAt(i));
            }

                //Ciclo comparador de símbolos
                while (!stack.isEmpty()) {
                    aux="";
                    aux += stack.pop();
                    if (aux.equals("+")  || aux.equals("-") || aux.equals("*") || aux.equals("/")) {
                        if (aux.equals("+")){
                            plus += aux;
                        } else if (aux.equals("-")) {
                            minus += aux;
                        } else if (aux.equals("*")) {
                            mult += aux;
                        }else if (aux.equals("/"))
                            slash += aux;



                    } else {//a+r
                        //let += stack.pop();
                        aux2 = aux2+aux;
                    }

                }

                //Creación de pila auxiliar para ordenar el orden de los caracteres
                Stack <Character> stack2 = new Stack<Character>();
                for (int j = 0; j < aux2.length(); j++){
                    stack2.push(aux2.charAt(j));
                }
                while (!stack2.isEmpty()) {
                    aux3+=stack2.pop();
                }
                System.out.println(""+plus+""+minus+""+mult+""+slash+""+aux3);
        }
}

