package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class Recipe {

    @Id
    private String id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Byte[] image;
    private Difficulty difficulty;
    private Notes notes;

    @DBRef
    private List<Category> categories = new ArrayList<>();

    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
            //notes.setRecipe(this);
        }
    }

    public Recipe addIngredient(Ingredient ingredient){
        //ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }
}
