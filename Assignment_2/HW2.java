package Assignment_2;
class Book 
{
    String BName;
    int BEdition;
    double BPrice;
    Book(String BName, int BEdition, double BPrice)
    {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }
    void display() 
    {
        System.out.println( this.BName+"\t" + this.BEdition+"\t"+ this.BPrice);
    }   
    public double getPrice() 
    {
        return this.BPrice;
    } 
    void displaymax(){
        System.out.println(this.BName+" Book having price "+this.BPrice+"has maximum price.");
    }
}
class BookDemo 
{
    public static void main(String[] args) 
    {
        Book[] books = new Book[5];
        books[0] = new Book("JAVA DSA   ", 5, 499.99);
        books[1] = new Book("Calculus II", 2, 799.99);
        books[2] = new Book("Economics  ", 8, 649.99);
        books[3] = new Book("University PHY", 9, 699.99);
        books[4] = new Book("Graph Theory ", 5, 459.49);
        System.out.println("Book Name\tEdition\tBook price");
        Book max = books[0];
        for (int i = 0; i < books.length; i++) 
        {
            books[i].display();
            if (books[i].getPrice()> max.getPrice())
                max = books[i];
        }
        max.displaymax();
    }
}