package ecommerce.domain.entities.products;

public class ProductDiscountNotValidException extends RuntimeException {
    ProductDiscountNotValidException(String message) {
        super(message);
    }

    static void ThrowIfDiscountNotValid(Product product) throws ProductException {
        if (product.getDiscount() == product.getPrice()) {
            throw new ProductDiscountNotValidException("Discount must be less than product's price");
        }

        if (product.getDiscount() < 0) {
            throw new ProductDiscountNotValidException("Discount can't be less than 0");
        }
    }
}
