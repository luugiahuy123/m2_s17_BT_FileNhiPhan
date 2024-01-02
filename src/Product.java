import java.io.Serializable;

 class  Product implements Serializable {
     private String code;
    private String name;
    private double print;
    private String manufacturer;
    private String description;

    public Product() {
    }

     public Product(String code, String name, double print, String manufacturer, String description) {
         this.code = code;
         this.name = name;
         this.print = print;
         this.manufacturer = manufacturer;
         this.description = description;
     }

     public String getCode() {
         return code;
     }

     public void setCode(String code) {
         this.code = code;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getPrint() {
         return print;
     }

     public void setPrint(double print) {
         this.print = print;
     }

     public String getManufacturer() {
         return manufacturer;
     }

     public void setManufacturer(String manufacturer) {
         this.manufacturer = manufacturer;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "code='" + code + '\'' +
                 ", name='" + name + '\'' +
                 ", print=" + print +
                 ", manufacturer='" + manufacturer + '\'' +
                 ", description='" + description + '\'' +
                 '}';
     }
 }