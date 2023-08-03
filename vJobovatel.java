import java.util.ArrayList;

public class vJobovatel implements Comparable<vJobovatel> {
    static private ArrayList<vJobovatel> listWorkers = new ArrayList<>();

    public vJobovatel(String name, boolean choosePayment, double HourOrSalary)
    {
        this.name = name;
        if (choosePayment)
            payment = new Fixpayment(HourOrSalary);
            payment = new TimePyment(HourOrSalary);
        listWorkers.add(this);
    }

    private final String name;
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Имя " + name + " Зараплата " + payment.getSalary() + "\n";
    }

    public static ArrayList<vJobovatel> getListWorkers() {
        return listWorkers;
    }

    @Override
    public int compareTo(vJobovatel o) { //
        if (o.payment.getSalary() == this.payment.getSalary()) {
            return 0;
        } else if (o.payment.getSalary() < this.payment.getSalary()) {
            return -1;
        } else
            return 1;
    }

}