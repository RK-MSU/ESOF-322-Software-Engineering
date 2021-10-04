# HW 2

```Java

public class Company {
  public String name;
  public Address headquarters;
}

public interface IRentable {
  public void rent() {}
}
public class  Vehicle implements IRentable {
  
  public UnlimitedNatural power;
  public String manufacturer;
  public String regNo;

  public void rent() {
    // some code to rent the vehicle
  }
}

public class  Truck extends Vehicle {
  public UnlimitedNatural weight;
}

public class  Car extends Vehicle {
  public CarKind kind;
  public UnlimitedNatural noSeats;
}

public class  Motorbike extends Vehicle {
  public MbKind kind;
  public UnlimitedNatural cylinderCap;
}



public class Address {
  public String street;
  public String postalCode;
  public String city;
}

public class Person {
  public String name;
  public String email;
  public Address address;
}


public class Employee extends Person {}

public class Customer extends Person {
  public BankAccount bankAccount;
}

public class Subcontractor extends Person {}

public class BankAccount {

}

```
