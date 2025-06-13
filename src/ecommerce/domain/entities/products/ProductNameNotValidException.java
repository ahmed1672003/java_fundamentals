package ecommerce.domain.entities.products;

public class ProductNameNotValidException extends ProductException {
    ProductNameNotValidException(String message) {
        super(message);
    }

    static void ThrowIfNameNotValid(Product product) throws ProductException {
        if (product.getName().length() >= 1000 || product.getName().length() < 3) {
            throw new ProductNameNotValidException("Product name must be between 3 and 1000 characters");
        }


    }
}
