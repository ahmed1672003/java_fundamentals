package ecommerce.domain.entities.products;

public class ProductPriceNotValidException extends ProductException {
    ProductPriceNotValidException(String message) {
        super(message);
    }

    static void ThrowIfPriceNotValid(Product product) throws ProductException {
        if (product.getPrice() <= 0) {
            throw new ProductPriceNotValidException("Price must be greater than 0");
        }

        if (product.getPrice() < product.getSoldPrice()) {
            throw new ProductPriceNotValidException("Sold Price must be greater than Price");
        }

    }
}
