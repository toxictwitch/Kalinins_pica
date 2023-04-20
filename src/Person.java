public class Person {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Добавляем проверку на null, чтобы избежать NullPointerException
        if (name != null) {
            this.name = name;
        }
    }
    
    public String getSurname(){
    	return surname;
    }
    
    public void setSurname(String surname) {
    	// Добавляем проверку на null, чтобы избежать NullPointerException
    	if (surname != null) {
    		this.surname = surname;
    	}
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // Добавляем проверку на null, чтобы избежать NullPointerException
        if (address != null) {
            this.address = address;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // Добавляем проверку на null, чтобы избежать NullPointerException
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
    }
}
    