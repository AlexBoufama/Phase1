public class Table {
    private int num;
    private int bill;

    public Table(int TableNumber, int Bill){

        this.num = TableNumber;
        this.bill = Bill;
    }

    public int getBill() {
        return bill;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
