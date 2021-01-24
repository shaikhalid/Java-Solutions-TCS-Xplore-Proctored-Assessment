class AutonomousCar {
  private int carId, noOfTestsConducted, noOfTestsPassed;
  private String brand, environment, grade;

  AutonomousCar(int carId, int noOfTestsConducted, int noOfTestsPassed, String brand, String environment){
    this.carId=carId;
    this.noOfTestsConducted=noOfTestsConducted;
    this.noOfTestsPassed=noOfTestsPassed;
    this.brand=brand;
    this.environment=environment;
  }

  int getCarId() {
    return this.carId;
  }

  int getNoOfTestsPassed() {
    return this.noOfTestsPassed;
  }

  int getNoOfTestsConducted() {
    return this.noOfTestsConducted;
  }

  String getBrand() {
    return this.brand;
  }

  String getEnvironment() {
    return this.environment;
  }

  String getGrade() {
    return this.grade;
  }

  void setGrade(String grade) {
    this.grade = grade
  }
}

class Solution{
  
}
