package dev.myhouseapp.MyHouse;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "diary")
@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor
public class Diary {
    @Id
    private ObjectId diary_id;
    private ObjectId user_id;
    private String title;
    private String content;
    private boolean privacy_settings;
    private String tags;
    private Moods mood;

    public enum Moods{
        AFRAID,
        AGGRAVATED,
        ANGRY,
        ANXIOUS,
        ASHAMED,
        ASSERTIVE,
        BURDENED,
        BRAVE,
        CALM,
        CAUTIOUS,
        CHALLENGED,
        CHEERFUL,
        CHERISHED,
        COMFORTED,
        CONTENTED,
        CREATIVE,
        CURIOUS,
        DEPRESSED,
        EMBARRASED,
        ENERGIZED,
        ENVIOUS,
        EXCITED,
        FURIOUS,
        GUILTY,
        GRUMPY,
        HAPPY,
        HOPEFUL,
        HUMILIATED,
        HURT,
        INDIFFERENT,
        INSECURE,
        IRRITATED,
        LONELY,
        LOVED,
        MAD,
        OTIMISTIC,
        OVERWHELMED,
        PANICKED,
        PEACEFUL,
        POSITIVE,
        PESSIMISTIC,
        PREPARED,
        PROUD,
        READY,
        REGRETFUL,
        RELIEVED,
        RENEWED,
        SAD,
        SELF_CONFIDENT,
        SHAMEFUL,
        SKEPTICAL,
        SORROWFUL,
        SUICIDAL,
        WORRIED,
        OTHERS
    }
    
}
