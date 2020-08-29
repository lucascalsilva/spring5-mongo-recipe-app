package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
public class Notes {

    @Id
    private String id = UUID.randomUUID().toString();
    private String recipeNotes;

}
