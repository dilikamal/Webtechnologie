package htwberlin.webtech;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MyController {
    @GetMapping("/todos")
    public List<Squad> LineUps() {
        Squad entry = new Squad("defensive", 532, "Neuer; Pavard, Süle, Hernandez, Davies; Kimmich, Goretzka; Gnabry, Müller, Coman; Lewandowski");
        Squad entry1 = new Squad("offensive", 334, "Neuer; Pavard, Upamecano, Süle, Davies; Goretzka, Kimmich; Sane, Müller, Musiala; Lewandowski");
        Squad entry2 = new Squad("balanced", 442, "Neuer; Pavard, Hernandez, Upamecano, Davies; Kimmich, Goretzka; Sane, Müller, Coman; Lewandowski");
        Squad entry3 = new Squad("aggressive", 442, "Neuer; Pavard, Süle, Hernandez, Alaba; Kimmich, Goretzka; Gnabry, Müller, Coman; Lewandowski");
        Squad entry4 = new Squad("defensive", 541, "Neuer; Pavard, Upamecano, Süle, Davies; Kimmich, Goretzka; Sane, Müller, Musiala; Choupo-Moting");
        return List.of(entry, entry1, entry2, entry3, entry4);
    }
}
