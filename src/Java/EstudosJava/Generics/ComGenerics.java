package Java.EstudosJava.Generics;

import java.util.ArrayList;
import java.util.List;

public class ComGenerics {
    public static void main(String[] args) {
        List<CocaCola> engradadoCocaCola = new ArrayList();
        engradadoCocaCola.add(new CocaCola());
        //engradadoCocaCola.add(new FantaLaranja()); // impossível
        engradadoCocaCola.add(new CocaCola());

        for(CocaCola item: engradadoCocaCola){
            System.out.println("Este item é uma coca-cola ou fanta laranja? " + item.getClass().getSimpleName());
        }

    }
}


