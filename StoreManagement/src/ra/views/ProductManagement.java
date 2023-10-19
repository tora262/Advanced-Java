package ra.views;

import ra.models.Product;
import ra.service.ProductService;
import ra.util.InOutUtil;

import java.util.Scanner;

public class ProductManagement {
    private ProductService productService;

    public ProductManagement(ProductService productService) {
        this.productService = productService;
    }

    public void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("********************PRODUCT MANAGEMENT***************\n" +
                    "1. Nhập thông tin các sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Cập nhật thông tin sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm theo tên\n" +
                    "5. Cập nhật trạng thái sản phẩm\n" +
                    "6. Thoát");

            int choice = InOutUtil.inputInt(scanner);

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    displayProducts();
                    break;
                default:
                    return;
            }
        }
    }

    private void displayProducts() {
        System.out.println("*********Product List*********");
        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
        System.out.println("***************************");
    }

    private void addProduct(Scanner scanner) {
        System.out.println("Nhập vào thông tin product");
        Product product = new Product();
        product.setProductId(inputProductId(scanner));
        product.setProductName(inputProductName(scanner));
        product.setManufacturer(inputManufacturer(scanner));
        product.setStatus(inputStatus(scanner));

        productService.addProduct(product);
        System.out.println("Thêm mới sản phẩm thành công");

    }

    private boolean inputStatus(Scanner scanner) {
        System.out.println("Nhập vào trạng thái sản phẩm (true: hoạt động, false: tạm dừng");
        return InOutUtil.validateInputBoolean(scanner);
    }

    private String inputManufacturer(Scanner scanner) {
        System.out.println("Nhập vào thông tin manufacturer");
        return InOutUtil.inputString(scanner);
    }

    private String inputProductName(Scanner scanner) {
        System.out.println("Thông tin tên sản phẩm");
        return InOutUtil.validateInputString(scanner);
    }

    private String inputProductId(Scanner scanner) {
        System.out.println("Hãy nhập productId:");
        String productId = InOutUtil.inputString(scanner);

        if (!productId.matches("[A-Z][0-9A-Za-z]{3}") || productService.isExist(productId)) {
            System.out.println("ProductId bạn vừa nhập không hợp lệ, hãy nhập lại");
            productId = inputProductId(scanner);
        }

        return productId;
    }
}
