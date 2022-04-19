package codeLatteMemo.UseCase;

import java.util.Scanner;
import codeLatteMemo.Note.NotePad;

public class NoteService {
    private final NotePad notePad;

    public NoteService() {
        this.notePad = new NotePad();
    }

    // Todo : Program Start
    public void run(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("WJ's Memo Program");
            System.out.println("1. MemoList 2. Show Memo 3. Add 4. Edit 5. Delete 6. End Prog.");
            System.out.println("Select Function Number");

            int selectedNumber = sc.nextInt();

            if(1 == selectedNumber){
                //Todo : MemoList Function
                notePad.printAllNotes();
            }else if(2 == selectedNumber){
                //Todo : ShowMemo Function
                notePad.printNote();
            }else if(3 == selectedNumber){
                //Todo : Add Memo Function
                notePad.addNote();
            }else if(4 == selectedNumber){
                //Todo : Edit Memo Function
                notePad.updateNote();
            }else if(5 == selectedNumber){
                //Todo : Delete Memo Function
                System.out.println("Not Support");
            }else if(6 == selectedNumber){
                break;
            }else
                System.out.println("Insert Correct Number");

        }
    }
}
