package func;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Filter {
    public static void sortPetitieByDate(List<Petitie> petitieList) {
        Collections.sort(petitieList, new Comparator<Petitie>() {
            @Override
            public int compare(Petitie petitie1, Petitie petitie2) {
                return petitie1.getDate().compareTo(petitie2.getDate());
            }
        });
    }

}
