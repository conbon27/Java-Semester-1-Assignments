package bike1;

public class Bicycle {
private String ownerName;
public Bicycle ( ) {
	ownerName = "Unassigned";
}
public String getOwnerName () {
return ownerName;
}
public void setOwnerName(String name) {
ownerName = name;
	}
}