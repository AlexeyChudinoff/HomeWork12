public class Author {

  private String firstName;//заприватили когда гетер делали
  private String lastName;

  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;

  }

  /*public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
*/

}