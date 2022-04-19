package codeLatteMemo.Note;

import java.time.LocalDateTime;

public class NoteEntitiy {
    private String title;
    private String content;
    private LocalDateTime lastUpdatedDatetime;

    private NoteEntitiy(String title, String content){
        this.title = title;
        this.content = content;
        this.lastUpdatedDatetime = LocalDateTime.now();
    }
    static NoteEntitiy newInstance(String title, String content){
        return new NoteEntitiy(title, content);
    }

    void update(String content){
        this.content = content;
        this.lastUpdatedDatetime = LocalDateTime.now();
    }

    String getTitle(){
        return title;
    }
    String getContent(){
        return content;
    }
    String getLastUpdatedDatetime(){
        return lastUpdatedDatetime.toString();
    }
}
