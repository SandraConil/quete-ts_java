import java.util.Date;  //pour Date
import java.util.List; //pour photo en tableau 

class User {

        private Date birthdate;
        private int size;
        private List<Photo> photos;
        private Address address;

        public Date getBirthdate() {return this.birthdate;}
        public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

        public int getSize(){ return size;}
        public void setSize(int size){this.size = size;}

        public List<Photo> getPhoto() {return this.photos;}
        public void setPhoto(List<Photo> photos) {this.photos = photos;}

        public Address getAddress(){ return this.address;}
        public void setAddress(Address address){this.address = address;}

}
