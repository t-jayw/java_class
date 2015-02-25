class Doctor {
  Doctor() {
    System.out.println("Constructing Doctor.");
  }
}
class Surgeon extends Doctor {
  Surgeon() {
    System.out.println("Constructing Surgeon.");
  }
}
class HeartSurgeon extends Surgeon {
  HeartSurgeon() {
    System.out.println("Constructing HeartSurgeon.");
  }
}
class HeartTransplantSurgeon extends HeartSurgeon {
	HeartTransplantSurgeon() {
	System.out.println("Constructing HeartTransplantSurgeon");
  }
}
class DoctorDemo {
  public static void main(String[] args) {
    HeartTransplantSurgeon hts = new HeartTransplantSurgeon();
  }
}
// see OrderOfConstruction.java