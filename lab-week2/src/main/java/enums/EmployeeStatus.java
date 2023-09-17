package enums;

public enum EmployeeStatus {
    ACTIVE(1),
    TERMINATED(-1),
    IN_ACTIVE(0);
    private int value;
    EmployeeStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
