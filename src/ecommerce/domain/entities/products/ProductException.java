package ecommerce.domain.entities.products;

public class ProductException extends RuntimeException {
    ProductException(String message) {
        super(message);
    }

    static void ThrowIfProductNotValid(Product product) throws ProductException {
        ProductDiscountNotValidException.ThrowIfDiscountNotValid(product);
        ProductPriceNotValidException.ThrowIfPriceNotValid(product);
        ProductQuantityNotValidException.ThrowIfQuantityNotValid(product);
        ProductNameNotValidException.ThrowIfNameNotValid(product);
    }
}
