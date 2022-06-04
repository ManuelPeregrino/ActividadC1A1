package com.upchiapas.examen.models;
import java.util.Stack;
public class palabra {
        public String Inf;
        public String sim = "";
        public String let = "";



    public palabra (String inf){
            this.Inf = inf;
        }
            public void Pref(){
                String aux2 = "";
                Stack <Character> stack = new Stack<Character>();
            for (int i = 0; i < Inf.length(); i++){
                stack.push(Inf.charAt(i));
            }


                while (!stack.isEmpty()) {

                    if (aux2.equals('+')  || aux2.equals('-') || aux2.equals('*') || aux2.equals('/')) {

                        sim += stack.pop();
                        aux2 = sim;

                    } else {
                        let += stack.pop();
                        aux2 = let;
                    }

                    System.out.println(aux2);
                }
        }
}

