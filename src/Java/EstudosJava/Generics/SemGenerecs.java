package Java.EstudosJava.Generics;

import java.util.ArrayList;
import java.util.List;

public class SemGenerecs {
    public static void main(String[] args) {
        List engradado01 = new ArrayList();
        engradado01.add(new CocaCola());
        engradado01.add(new FantaLaranja());

        for(Object item: engradado01){
            System.out.println("Este item é uma coca-cola ou fanta laranja? " + item.getClass().getSimpleName());
        }
    }
}

class CocaCola{ }
class FantaLaranja{}
