public class Email {
    private String firstName;
    private String lastName;
    private String depart;
    private String alternateEmail;
    private String password;
    private String email;
    private int mailboxCapacity;
    
    public Email(String firstName, String lastName, String depart) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.depart     = depart;
        
        this.email      = firstName.toLowerCase() + lastName.toLowerCase() + 
                                    "@" + depart.toLowerCase() + ".hus.com";
        this.password   = setRandomPasswd();
    }
    
    // tạo String ngẫu nhiên cho password
    private String setRandomPasswd(){
        return "1234";
    }
    
    //GETTER
        // Hiển thị thông tin tên
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepart() {
        return depart;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
        // Hiển thị địa chỉ email
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    // SETTER     
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
    public void setDepart(String depart) {
        this.depart = depart;
    }
    
        //Tạo set method để thay đổi password, set mailbox capacity, 
        //xác định địa chỉ email thay thế
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
    
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String firstName, String lastName, String depart) {
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + 
                                    "@" + depart.toLowerCase() + ".hus.com";
    }
 
    // get method để hiển thị thông tin về tên, địa chỉ email, và mailbox capacity
    public void showInfo(){
        System.out.println("Name \t\t :" + this.getFirstName()+ " " + this.getLastName());
        System.out.println("Email \t\t :" + this.getEmail());
        System.out.println("Mailbox capacity :" + this.getMailboxCapacity());
    }
    
    // toString 
        public String toString() {
            String text = "";
            text = this.firstName + ", " + this.lastName
                + ", " + this.email + ", " + this.depart
                + ", " + this.mailboxCapacity;
            return text;
        }
}
