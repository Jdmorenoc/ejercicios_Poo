
package Books;

public class Book {
            String title;
            int amount;
            int id; 
            String genre;
            String loanDate;
            String returnDate;
            boolean available;
            
            
     public Book(String title, int amount, int id, String genre){
            this.title = title;
            this.amount = amount;
            this.id = id;
            this.genre = genre;
            this.available = true;
        }   
    
    public void lendBook(){
        this.available = false;
    }
    
    public void returnBook(){
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }
}
