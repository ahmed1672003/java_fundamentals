package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.products.IProductRepository;
import ecommerce.domain.entities.products.Product;
import ecommerce.infrastructure.context.DummyDbContext;


final class ProductRepository extends Repository<Product> implements IProductRepository {
    public ProductRepository(DummyDbContext context) {
        super(context);
    }
}
