package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
Faker obj=new Faker();
public String getUsername() {
String username= obj.name().firstName();

return username;
}
public String getPassword() {
String password=obj.internet().password();
return password;
}}