package codeLatteMemo.Note;

import java.util.Scanner;

public class NotePad {
    private int noteLength = 0 ;
    private final NoteEntitiy[] noteEntities;
    private final int NOTE_SIZE = 20;

    public NotePad(){
        this.noteEntities = new NoteEntitiy[NOTE_SIZE];
    }
    public void addNote(){
        System.out.println("");
        if(NOTE_SIZE == this.noteLength){
            System.out.println("Memmory is Fulled");
            System.out.println("");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Title");
        String title = sc.nextLine();

        System.out.println("Insert Contents");
        String contents = sc.nextLine();

        noteEntities[this.noteLength++] = NoteEntitiy.newInstance(title, contents);
        System.out.println("Memo is Added");
        System.out.println("");
    }
    public void printAllNotes(){
        System.out.println("");
        if( 0 == noteLength){
            System.out.println("No Memo");
            System.out.println("");
            return;
        }
        for( int i = 0 ; i < noteLength ; i++){
            NoteEntitiy noteEntitiy = noteEntities[i];

            String headLine = String.format("번호:%d 제목:%s 작성날짜:%s", i, noteEntitiy.getTitle(),
                    noteEntitiy.getLastUpdatedDatetime());
            System.out.println(headLine);
        }
        System.out.println("");
    }
    public void printNote(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Memo's Number");

        int selectedNum = sc.nextInt();
        NoteEntitiy noteEntitiy = noteEntities[selectedNum];
        if( noteEntitiy == null){
            System.out.println("No Memo");
            System.out.println("");
            return;
        }
        System.out.println("");
        String headLine = String.format("번호:%d 제목:%s", selectedNum, noteEntitiy.getTitle());
        System.out.println(headLine);
        System.out.println(noteEntitiy.getLastUpdatedDatetime());
        System.out.println(noteEntitiy.getContent());
        System.out.println("");
    }
    public void updateNote(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Memo's Number");
        int selectedNum = Integer.parseInt(sc.nextLine());

        System.out.println("Insert Content");
        String content = sc.nextLine();

        NoteEntitiy noteEntitiy = noteEntities[selectedNum];
        if( null == noteEntitiy){
            System.out.println("Do not Exist");
            return;
        }
        noteEntitiy.update(content);

        System.out.println("Memo is Updated");
        System.out.println("");
    }
    public void deleteNote(){}





}
