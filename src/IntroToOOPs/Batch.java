package IntroToOOPs;

public class Batch {
    private int Batch_id;
    protected int NumberofStudent;
    String Mentor;

    void Mentor(){
        System.out.println(this.Mentor + " take this batch");
    }
    //Setter Function
    void SetBatch(int x){
        this.Batch_id = x;
    }

    //Getter Function
    void GetBatch(){
        System.out.println("Batch id is "+ this.Batch_id);

    }

}
