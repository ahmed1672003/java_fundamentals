package ecommerce.domain.entities.products;

public class ProductQuantityNotValidException extends ProductException {
    ProductQuantityNotValidException(String message) {
        super(message);
    }

    static void ThrowIfQuantityNotValid(Product product) throws ProductException {
        if (product.getQuantity() < 0) {
            throw new ProductQuantityNotValidException("Quantity must be greater than or equal 0");
        }
    }
}
