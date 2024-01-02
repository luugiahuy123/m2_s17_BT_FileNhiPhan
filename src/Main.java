import java.io.*;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("----- Quản lý sản phẩm -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Lưu sản phẩm vào tệp");
            System.out.println("5. Đọc sản phẩm từ tệp");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn: ");

            try {
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        Product product = createProduct(reader);
                        productManagement.addProduct(product);
                        System.out.println("Sản phẩm đã được thêm thành công!");
                        break;
                    case 2:
                        productManagement.displayProducts();
                        break;
                    case 3:
                        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
                        String searchCode = reader.readLine();
                        Product foundProduct = productManagement.searchProduct(searchCode);
                        if (foundProduct != null) {
                            System.out.println("----- Thông tin sản phẩm -----");
                            System.out.println(foundProduct);
                        } else {
                            System.out.println("Không tìm thấy sản phẩm với mã " + searchCode);
                        }
                        break;
                    case 4:
                        productManagement.saveToFile();
                        System.out.println("Đã lưu sản phẩm vào tệp!");
                        break;
                    case 5:
                        productManagement.loadFromFile();
                        System.out.println("Đã đọc sản phẩm từ tệp!");
                        break;
                    case 0:
                        System.out.println("Đã thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                        break;
                }
            }catch (IOException e) {
                e.printStackTrace();
            }catch (Exception d){
                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static Product createProduct(BufferedReader reader) throws IOException {
        System.out.print("Nhập mã sản phẩm: ");
        String code = reader.readLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = reader.readLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(reader.readLine());
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = reader.readLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        String description = reader.readLine();

        return new Product(code, name, price, manufacturer, description);
    }
}