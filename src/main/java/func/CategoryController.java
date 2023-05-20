package func;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @GetMapping
    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> cat = new ArrayList<>();
        cat.add(new Category("all", "Toate categoriile"));
        cat.add(new Category("educatie", "Educatie"));
        cat.add(new Category("mediu", "Mediu"));
        cat.add(new Category("infrastructura", "Infrastructura"));
        cat.add(new Category("dezvoltare", "Dezvoltare regionala"));
        cat.add(new Category("transport", "Transport"));
        cat.add(new Category("energie", "Energie"));
        cat.add(new Category("turism", "Turism"));
        cat.add(new Category("drepturile_animalelor", "Drepturile animalelor"));
        cat.add(new Category("tehnologie", "Tehnologie"));
        cat.add(new Category("agricultura", "Agricultura"));
        System.out.println(cat);
        return cat;
    }
}


